// **********************************************
// Conferma Avvisi Di Pagamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConfermaAvvisiDiPagamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESTAMPA_ETICHETINVIA = 0;
  private static int PFL_PARAMESTAMPA_ETICVERRINVI = 1;

  private static int PPQRY_PARAMESTAM30 = 0;


  IDPanel PAN_PARAMESTAMPA;
  CIDREObj BUK_AVVIDIPAGBOO;
  OBook BKW_AVVIDIPAGBOO;
  //
  // Template Pages constants
  private static int BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG = 1;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_AVVIDIPAGBOO_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP = 6;
  private static int BUK_AVVIDIPAGBOO_SEC_REPORTHEADER = 7;
  private static int BUK_AVVIDIPAGBOO_SEC_PAGEHEADER = 8;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_LOGO = 9;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_INDIRIZZO = 10;
  private static int BUK_AVVIDIPAGBOO_SPAN_DATIENTEINDI = 11;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_COMUNE = 12;
  private static int BUK_AVVIDIPAGBOO_SPAN_COMUNE = 13;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_OGGETTO = 14;
  private static int BUK_AVVIDIPAGBOO_SPAN_OGAVDIPAVOCO = 15;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_DATA = 16;
  private static int BUK_AVVIDIPAGBOO_SPAN_DECTSPDAADPP = 17;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA = 18;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_SPETTABILE = 19;
  private static int BUK_AVVIDIPAGBOO_SPAN_SPETTLE = 20;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BERASOESESE1 = 21;
  private static int BUK_AVVIDIPAGBOO_SPAN_RBRSEECADPAD = 22;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BENINDIRIZZO = 23;
  private static int BUK_AVVIDIPAGBOO_SPAN_REBICADPADPB = 24;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_CITTABENEFIC = 25;
  private static int BUK_AVVIDIPAGBOO_SPAN_RECBCADPADPB = 26;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO1 = 27;
  private static int BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1 = 28;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1 = 29;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO2 = 30;
  private static int BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2 = 31;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2 = 32;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO3 = 33;
  private static int BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3 = 34;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3 = 35;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER = 36;
  private static int BUK_AVVIDIPAGBOO_SPAN_MANDATO = 37;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA = 38;
  private static int BUK_AVVIDIPAGBOO_SPAN_MODALDIPAGAM = 39;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4 = 40;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAIL = 41;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_MANDATO = 42;
  private static int BUK_AVVIDIPAGBOO_SPAN_REMACADPADPB = 43;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOMANDATO = 44;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZA = 45;
  private static int BUK_AVVIDIPAGBOO_SPAN_REQUCADPADPB = 46;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOQUIETAN = 47;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAILBANCA = 48;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA = 49;
  private static int BUK_AVVIDIPAGBOO_SPAN_RQDBCADPADPB = 50;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC = 51;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC = 52;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAILINTEST = 53;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO = 54;
  private static int BUK_AVVIDIPAGBOO_SPAN_REINCADPADPB = 55;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE = 56;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE = 57;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA = 58;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE = 59;
  private static int BUK_AVVIDIPAGBOO_SPAN_CQRBRSEQCADP = 60;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE = 61;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE = 62;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO = 63;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1 = 64;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1 = 65;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2 = 66;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3 = 67;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID = 68;
  private static int BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4 = 69;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP = 70;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA1 = 71;
  private static int BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA1 = 72;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA2 = 73;
  private static int BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA2 = 74;
  private static int BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER = 75;
  private static int BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER = 76;
  private static int BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO = 77;
  private static int BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU = 78;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_CAUSALHEADER = 79;
  private static int BUK_AVVIDIPAGBOO_SPAN_CAUSALE = 80;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_IMPORTHEADER = 81;
  private static int BUK_AVVIDIPAGBOO_SPAN_IMPORTO = 82;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_RITENUHEADER = 83;
  private static int BUK_AVVIDIPAGBOO_SPAN_RITENUTE = 84;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_NETTOHEADER = 85;
  private static int BUK_AVVIDIPAGBOO_SPAN_NETTO = 86;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_IMPOIVA1HEA1 = 87;
  private static int BUK_AVVIDIPAGBOO_SPAN_C = 88;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAILLIQ = 89;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_CAUSALE = 90;
  private static int BUK_AVVIDIPAGBOO_SPAN_IEPPFRCFCADP = 91;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSLIQ = 92;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_IMPORTO = 93;
  private static int BUK_AVVIDIPAGBOO_SPAN_RELICADPADPB = 94;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPOLIQ = 95;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_RITENUTE = 96;
  private static int BUK_AVVIDIPAGBOO_SPAN_RELRCADPADPB = 97;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDORITELIQ = 98;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_NETTO = 99;
  private static int BUK_AVVIDIPAGBOO_SPAN_RENECADPADPB = 100;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTLIQ = 101;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_IMPORTOIVA = 102;
  private static int BUK_AVVIDIPAGBOO_SPAN_RLIICADPADPB = 103;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ = 104;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF = 105;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSRET = 106;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPORET = 107;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDORITERET = 108;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTRET = 109;
  private static int BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU = 110;
  private static int BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ = 111;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOSUPERIO = 112;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_DOPPBORDSUPE = 113;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFCAU = 114;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_TOTALELABEL = 115;
  private static int BUK_AVVIDIPAGBOO_SPAN_TOTALE = 116;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFIMP = 117;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMPO = 118;
  private static int BUK_AVVIDIPAGBOO_SPAN_PFLSRLICADPA = 119;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFRIT = 120;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQRITE = 121;
  private static int BUK_AVVIDIPAGBOO_SPAN_PFLSRLRCADPA = 122;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFNET = 123;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_SUMOFNETTO = 124;
  private static int BUK_AVVIDIPAGBOO_SPAN_PFLSRNCADPAD = 125;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERIO = 126;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMIV = 127;
  private static int BUK_AVVIDIPAGBOO_SPAN_PFLSRLIICADP = 128;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_BORSUMOFIMIV = 129;
  private static int BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO = 130;
  private static int BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF = 131;
  private static int BUK_AVVIDIPAGBOO_RPTBOX_RETTIFICA = 132;
  private static int BUK_AVVIDIPAGBOO_SPAN_RERECADPADPB = 133;


  // Definition of Global Variables
  private IDVariant IMMAGINE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAM23(IMDB);
    //
    //
    Init_PQRY_MAN12(IMDB);
    Init_PQRY_LIQ60(IMDB);
    Init_PQRY_RETFAT7(IMDB);
    Init_PQRY_PARAMESTAM30(IMDB);
    Init_PQRY_PARAMESTAM30_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAM23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMESTAM23, 17);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMESTAM23, "TBL_PARAMESTAM23");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO1, "STAMPATESTO1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO1,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES1, "STAMGRASTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES1, "STAMCORSTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES1, "STAMSOTTTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT1, "STAMPAFONT1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT1,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO2, "STAMPATESTO2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO2,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES2, "STAMGRASTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES2, "STAMCORSTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES2, "STAMSOTTTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT2, "STAMPAFONT2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT2,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO3, "STAMPATESTO3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO3,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES3, "STAMGRASTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES3, "STAMCORSTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES3, "STAMSOTTTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA1, "STAMPAFIRMA1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA1,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA2,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT3, "STAMPAFONT3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM23,IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT3,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMESTAM23, 0);
  }

  private static void Init_PQRY_MAN12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN12, 22);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN12, "PQRY_MAN12");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_GRUPPOBENEFI, "GRUPPOBENEFI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_GRUPPOBENEFI,5,159,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECMANANNMAN, "RECMANANNMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECMANANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORBENCODI,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INDIRIZZO,5,35,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECOCITTBENE, "RECOCITTBENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECOCITTBENE,5,143,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDMANDAT, "RECORDMANDAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDMANDAT,5,203,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDQUIETA, "RECORDQUIETA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDQUIETA,5,53,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_DES_BANCA, "DES_BANCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_DES_BANCA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDINTEST, "RECORDINTEST");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORDINTEST,5,124,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_1, "INTESTATARIO_1");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_1,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_2, "INTESTATARIO_2");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_2,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_3, "INTESTATARIO_3");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_INTESTATARIO_3,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORQTNQUIE, "RECORQTNQUIE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECORQTNQUIE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_REBERASOESQU, "REBERASOESQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_REBERASOESQU,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECBENCOFIQU, "RECBENCOFIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECBENCOFIQU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECBEDDANAQU, "RECBEDDANAQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECBEDDANAQU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECCOMDENQUI, "RECCOMDENQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECCOMDENQUI,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECPROSIGQUI, "RECPROSIGQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN12,IMDBDef14.PQSL_MAN12_RECPROSIGQUI,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN12, 0);
  }

  private static void Init_PQRY_LIQ60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ60, 19);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ60, "PQRY_LIQ60");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECLIQIMPIVA, "RECLIQIMPIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECLIQIMPIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_CODICE_DOC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECORDCAUSAL, "RECORDCAUSAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECORDCAUSAL,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSBELL, "RECOCAUSBELL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSBELL,5,316,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSFIRE, "RECOCAUSFIRE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSFIRE,5,341,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSPESA, "RECOCAUSPESA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECOCAUSPESA,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECORDNETTO, "RECORDNETTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECORDNETTO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECONUOVESPR, "RECONUOVESPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ60,IMDBDef14.PQSL_LIQ60_RECONUOVESPR,1,19,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ60, 0);
  }

  private static void Init_PQRY_RETFAT7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_RETFAT7, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_RETFAT7, "PQRY_RETFAT7");
    IMDB.set_FldCode(IMDBDef14.PQRY_RETFAT7,IMDBDef14.PQSL_RETFAT7_RECORDRETTIF, "RECORDRETTIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_RETFAT7,IMDBDef14.PQSL_RETFAT7_RECORDRETTIF,5,224,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_RETFAT7, 0);
  }

  private static void Init_PQRY_PARAMESTAM30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM30, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM30, "PQRY_PARAMESTAM30");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM30,IMDBDef14.PQSL_PARAMESTAM30_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM30,IMDBDef14.PQSL_PARAMESTAM30_STAMPAFIRMA2,5,200,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM30, 0);
  }

  private static void Init_PQRY_PARAMESTAM30_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM30_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM30_RS, "PQRY_PARAMESTAM30_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM30_RS,IMDBDef14.PQSL_PARAMESTAM30_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM30_RS,IMDBDef14.PQSL_PARAMESTAM30_STAMPAFIRMA2,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConfermaAvvisiDiPagamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConfermaAvvisiDiPagamento()
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
    FormIdx = MyGlb.FRM_CONFAVVDIPAG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "92362B15-DD54-4326-8CC0-FAAEAFE84D9C";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 852;
    DesignHeight = 526;
    set_Caption(new IDVariant("Conferma Avvisi Di Pagamento"));
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
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "29861DC1-C47B-4FC6-93EC-6A99B6F4FC78");
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
    Frames[3].Caption = "Avvisi Di Pagamento Book";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    BKW_AVVIDIPAGBOO = new OBook(this);
    BUK_AVVIDIPAGBOO = new CIDREObj(BKW_AVVIDIPAGBOO);
    Frames[3].Content = BKW_AVVIDIPAGBOO;
    BKW_AVVIDIPAGBOO.Height = 398;
    BKW_AVVIDIPAGBOO.Width = 852;
    BKW_AVVIDIPAGBOO.iGuid = "EECF38DD-142B-4E00-9D7D-47A8C233CED0";
    BKW_AVVIDIPAGBOO.Code = "BUK_AVVIDIPAGBOO";
    BKW_AVVIDIPAGBOO.BookObj = BUK_AVVIDIPAGBOO;
    BKW_AVVIDIPAGBOO.InitDefMasks();
    BUK_AVVIDIPAGBOO.set_FrIndex(3);
    BUK_AVVIDIPAGBOO.InitBook(1, 3342593, "Avvisi Di Pagamento Book", IMDB, MainFrm.VisualStyleList);
    BUK_AVVIDIPAGBOO.InitHTML();
    BUK_AVVIDIPAGBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_AVVIDIPAGBOO.SetSize(852, 398);
    BUK_AVVIDIPAGBOO.Book.SetMainFrm(MainFrm);
    BUK_AVVIDIPAGBOO.SetRTCGuid(0, "EECF38DD-142B-4E00-9D7D-47A8C233CED0");
    BUK_AVVIDIPAGBOO.SetObjCode(0, "AVVIDIPAGBOO");
    BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG_Init();
    BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_Init();
    BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_Init();
    BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_Init();
    BUK_AVVIDIPAGBOO_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMESTAM23, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONFAVVDIPAG_PARAMESTAM30();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
      BUK_AVVIDIPAGBOO.UpdateBook();
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
    if (Code.equals("BUK_AVVIDIPAGBOO")) return BUK_AVVIDIPAGBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ConfermaAvvisiDiPagamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConfermaAvvisiDiPagamento.class.getName() : (Glb.ClassWithPackage(ConfermaAvvisiDiPagamento.class) ? ConfermaAvvisiDiPagamento.class.getName().substring(ConfermaAvvisiDiPagamento.class.getPackage().getName().length() + 1) : ConfermaAvvisiDiPagamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Avvisi Di Pagamento Page On Formatting
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG_OnFormattingPage()
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
      v_VISUSTYLTES1.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT1, 0).dblValue()).stringValue());
      v_VISUSTYLTES2.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT2, 0).dblValue()).stringValue());
      v_VISUSTYLTES3.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT3, 0).dblValue()).stringValue());
      BUK_AVVIDIPAGBOO.set_SpanVisualStyle(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST1),IDVariant.INTEGER).intValue());
      BUK_AVVIDIPAGBOO.set_SpanVisualStyle(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST2),IDVariant.INTEGER).intValue());
      BUK_AVVIDIPAGBOO.set_SpanVisualStyle(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST3),IDVariant.INTEGER).intValue());
      BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "AvvisiDiPagamentoPageOnFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Header 2 Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2_OnFormattingSection()
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
      BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, (new IDVariant(-1)).booleanValue());
      BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, (new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "GruppoBeneficiarioGroupHeader2BeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Header 4 Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4_OnFormattingSection()
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
      BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, (new IDVariant(0)).booleanValue());
      BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "GruppoBeneficiarioGroupHeader4BeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_DETAIL_OnAfterFormattingSection()
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
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDOMANDATO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIL))).dblValue());
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDOQUIETAN, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIL))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Banca Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_DETAILBANCA_OnFormattingSection()
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
      if (IDL.IsNull(BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "DES_BANCA")))
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "DetailBancaBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Intestatario Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_DETAILINTEST_OnFormattingSection()
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
      if (IDL.IsNull(BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "INTESTATARIO_1")) && IDL.IsNull(BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "INTESTATARIO_2")) && IDL.IsNull(BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "INTESTATARIO_3")))
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "DetailIntestatarioBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Quietanzante Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA_OnFormattingSection()
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
      if (IDL.IsNull(BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "RECORQTNQUIE")))
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "DetailQuietanzanteBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Footer 3 After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3_OnAfterFormattingSection()
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
      if ((new IDVariant(BUK_AVVIDIPAGBOO.GetReportTotalRecords(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO))).equals((new IDVariant(0)), true))
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1, (new IDVariant(0)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1, (new IDVariant(-1)).booleanValue());
        BUK_AVVIDIPAGBOO.set_BoxVisible(BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "GruppoBeneficiarioGroupFooter3AfterFormattingEvent", _e);
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
      BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
      BUK_AVVIDIPAGBOO.RefreshQuery();
      ((AvvisiDiPagamento)MainFrm.GetForm(MyGlb.FRM_AVVISDIPAGAM,0)).BUK_AVVIDIPAGBOO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      BUK_AVVIDIPAGBOO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "Load", _e);
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
      // BUK_AVVIDIPAGBOO.set_PrintDestination((new IDVariant(3)).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "ParametriStampaAfterFind", _e);
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
          BUK_AVVIDIPAGBOO.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
          BUK_AVVIDIPAGBOO.SetBoxImage(BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
          BUK_AVVIDIPAGBOO.RefreshQuery();
          ((AvvisiDiPagamento)MainFrm.GetForm(MyGlb.FRM_AVVISDIPAGAM,0)).BUK_AVVIDIPAGBOO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          BUK_AVVIDIPAGBOO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          v_INVIATO = MainFrm.InvioMail(((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?(new IDVariant("MAIL")):(new IDVariant("FAX"))), C3.Get("BENRAGSOESES"), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?C3.Get("BENEMAIL"):(new IDVariant())), (new IDVariant()), (new IDVariant()), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("F"))))?C3.Get("BENTELEX"):(new IDVariant())), v_OGGETTO, v_TESTO, v_NOMEMITTENTE, v_EMAILMITTENT, v_NOMEALLEGATO, (new IDVariant(BUK_AVVIDIPAGBOO.GetWebFileName())), v_FASE);
          // MainFrm.InvioMail(, C3.Get("BENRAGSOESES"), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?C3.Get("BENEMAIL"):(new IDVariant())), (new IDVariant()), (new IDVariant()), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("F"))))?C3.Get("BENTELEX"):(new IDVariant())), v_OGGETTO, v_TESTO, v_NOMEMITTENTE, v_EMAILMITTENT, v_NOMEALLEGATO, (new IDVariant(BUK_AVVIDIPAGBOO.GetWebFileName())), v_FASE);
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
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "Invia", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO1, 0, new IDVariant(v_TESTO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES1, 0, new IDVariant(v_GRASSETTO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES1, 0, new IDVariant(v_CORSIVO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES1, 0, new IDVariant(v_SOTTOLINEAT1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT1, 0, new IDVariant(v_FONT1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO2, 0, new IDVariant(v_TESTO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES2, 0, new IDVariant(v_GRASSETTO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES2, 0, new IDVariant(v_CORSIVO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES2, 0, new IDVariant(v_SOTTOLINEAT2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT2, 0, new IDVariant(v_FONT2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO3, 0, new IDVariant(v_TESTO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMGRASTES3, 0, new IDVariant(v_GRASSETTO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMCORSTES3, 0, new IDVariant(v_CORSIVO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMSOTTTES3, 0, new IDVariant(v_SOTTOLINEAT3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFONT3, 0, new IDVariant(v_FONT3));
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
        IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA1, 0, new IDVariant(C2.Get("T67DESCRIZIO")));
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA2, 0, new IDVariant(v_FIRMA2));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "SettaParametriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Detail Rettifiche Liq After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ_OnAfterFormattingSection()
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
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSRET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPORET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDORITERET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVIDIPAGBOO.set_BoxRect(BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTRET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVIDIPAGBOO.SectionHeight(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamento", "DetailRettificheLiqAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONFAVVDIPAG_PARAMESTAM30() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMESTAM30_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAM23, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMESTAM23, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM30_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMESTAM30_RS, 0, IMDBDef5.TBL_PARAMESTAM23, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM30_RS, 0, 0, IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA2, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMESTAM23, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMESTAM23, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAM23, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMESTAM30_RS, 0);
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

  private void BUK_AVVIDIPAGBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_AVVIDIPAGBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_PAGEHEADER)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_DATIENTEINDI, new IDVariant(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0)));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_COMUNE, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(5)), (new IDVariant("0")), true), (new IDVariant(" "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0)), (new IDVariant(" "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(" "))), (new IDVariant(" C.F. "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COD_FISCALE, 0))));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_OGAVDIPAVOCO, new IDVariant((new IDVariant("Oggetto: Avviso di Pagamento Vostre Competenze"))));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_DECTSPDAADPP, new IDVariant(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARADATAAVVI, 0)))));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO1, 0)));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO2, 0)));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPATESTO3, 0)));
      BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2_OnFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4)
    {
      BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4_OnFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAILBANCA)
    {
      BUK_AVVIDIPAGBOO_SEC_DETAILBANCA_OnFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAILINTEST)
    {
      BUK_AVVIDIPAGBOO_SEC_DETAILINTEST_OnFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_CQRBRSEQCADP, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Quietanzante ")), BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "REBERASOESQU")), BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "RECBENCOFIQU")), BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "RECBEDDANAQU"))));
      BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA_OnFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAILLIQ)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_IEPPFRCFCADP, new IDVariant(((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("FI"))))?BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "RECOCAUSFIRE"):((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("BL"))))?BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "RECOCAUSBELL"):((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("PU"))))?BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "RECOCAUSPESA"):BUK_AVVIDIPAGBOO.GetReportColumn(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "RECORDCAUSAL"))))));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_PFLSRLICADPA, new IDVariant(BUK_AVVIDIPAGBOO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ,"IMPORTO")));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_PFLSRLRCADPA, new IDVariant(BUK_AVVIDIPAGBOO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ,"RITENUTE")));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_PFLSRNCADPAD, new IDVariant(BUK_AVVIDIPAGBOO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ,"RECORDNETTO")));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_PFLSRLIICADP, new IDVariant(BUK_AVVIDIPAGBOO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ,"RECLIQIMPIVA")));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA1, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA1, 0)));
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA2, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM23, IMDBDef5.FLD_PARAMESTAM23_STAMPAFIRMA2, 0)));
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_AVVIDIPAGBOO_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAIL)
    {
      BUK_AVVIDIPAGBOO_SEC_DETAIL_OnAfterFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3)
    {
      BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3_OnAfterFormattingSection();
    }
    if (SectionID==BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ)
    {
      BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ_OnAfterFormattingSection();
    }
  }

  private void BUK_AVVIDIPAGBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG)
    {
      BUK_AVVIDIPAGBOO.set_SpanValue(BUK_AVVIDIPAGBOO_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_AVVIDIPAGBOO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_AVVIDIPAGBOO.GetTotalPagesNumber()))))));
      BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG_OnFormattingPage();
    }
  }

  private void BUK_AVVIDIPAGBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_AVVIDIPAGBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_AVVIDIPAGBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_AVVIDIPAGBOO_OnPreview()
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
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "E5E29D12-93E6-4420-96C3-7FCF7765B4C2");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "Invia");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, "70DBCF07-F846-4DFC-BF5B-3F729365C7D1");
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
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM30", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Stampa");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM30, IMDBDef14.PQRY_PARAMESTAM30_RS, IMDBDef5.TBL_PARAMESTAM23);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAM23");
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

  private void BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG_Init()
  {
    BUK_AVVIDIPAGBOO.InitMastro(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, "BE662D89-1245-4D30-9A54-FDDE2623D7F6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, "AVVIDIPAGPAG");
    BUK_AVVIDIPAGBOO.InitMastroBox(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, BUK_AVVIDIPAGBOO_RPTBOX_NUMEROPAGIN1, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 786433, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_NUMEROPAGIN1, "AB1F851A-DA4A-4B40-AA4D-D70DD070EDBE");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_NUMEROPAGIN1, BUK_AVVIDIPAGBOO_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_NUMEROPAGIN1, "D8096F5A-F6C5-42A6-A899-EF75C1763087");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_AVVIDIPAGBOO.InitMastroBox(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, BUK_AVVIDIPAGBOO_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 5100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_PAGEHEADER1, "CB1222F5-91FF-433C-A2EC-5E709CEBC486");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_AVVIDIPAGBOO.InitMastroBox(BUK_AVVIDIPAGBOO_MST_AVVIDIPAGPAG, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1, 1000, 6200, 19000, 22200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1, "34BFC1F7-45CF-45BA-9A78-2917406839CF");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_InitQuery() { BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_InitQuery(true, true); }
  private void BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_InitQuery(boolean flReport, boolean flGraphs)
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
      BUK_AVVIDIPAGBOO.SetReportQuery(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "FB247E01-3874-4F81-B354-29EE55590CCF");
      if (BUK_AVVIDIPAGBOO.FindObjByID(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA) != null)
        BUK_AVVIDIPAGBOO.AddReportGroup(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, "GRUPPOBENEFI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_Init()
  {
    BUK_AVVIDIPAGBOO.InitReport(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, 196865);
    BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_InitQuery(true, false);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "298D5EDD-48C5-48BC-97B9-5D0FD4A74A30");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, "AVVIDIPAGREP");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_REPORTHEADER, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_REPORTHEADER, "504E1909-6A9C-4F34-8153-EB1B7810B5C6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, 5000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_PAGEHEADER1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, "11901DF1-0479-42D7-B774-EB6A5AAA546D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_LOGO, 100, 100, 7500, 1900, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_LOGO, "60D3C145-3C94-4CE6-880D-638C60F627B6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_LOGO, "LOGO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_INDIRIZZO, 100, 2400, 12100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_INDIRIZZO, "FA3EAED3-46A1-4768-A952-735D4C91D0CF");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_INDIRIZZO, "INDIRIZZO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_INDIRIZZO, BUK_AVVIDIPAGBOO_SPAN_DATIENTEINDI, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_DATIENTEINDI, "87B49584-8800-4974-9F01-917069440D4B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_DATIENTEINDI, "DATIENTEINDI");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_COMUNE, 100, 3000, 8600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_COMUNE, "1E2394F7-6B8A-4456-8E41-56780653629C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_COMUNE, "COMUNE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_COMUNE, BUK_AVVIDIPAGBOO_SPAN_COMUNE, MyGlb.VIS_DEFAREPOSTYL, 5, 156, 0, 271319169, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_COMUNE, "2A8AE0DC-78CF-4E63-B27E-EABE21F79E06");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_COMUNE, "COMUNE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_OGGETTO, 100, 4100, 12100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_OGGETTO, "314F20F9-2584-4BB8-A7FF-C70DC6C2AB5C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_OGGETTO, "OGGETTO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_OGGETTO, BUK_AVVIDIPAGBOO_SPAN_OGAVDIPAVOCO, MyGlb.VIS_DEFAREPOSTYL, 5, 46, 0, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_OGAVDIPAVOCO, "C9F1B1CE-E624-4F6C-BE49-2C6630BBE356");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_OGAVDIPAVOCO, "OGAVDIPAVOCO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEHEADER, BUK_AVVIDIPAGBOO_RPTBOX_DATA, 12200, 1500, 6400, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_DATA, "5563D8A9-C3A0-44A2-9364-EC3C05A0D692");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_DATA, "DATA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_DATA, BUK_AVVIDIPAGBOO_SPAN_DECTSPDAADPP, MyGlb.VIS_NORMAA8RIGHT, 5, 130, 0, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_DECTSPDAADPP, "71D26E8A-F009-41C1-916E-77A6C9F56E81");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_DECTSPDAADPP, "DECTSPDAADPP");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, 3700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, "A9518D8B-C330-4A50-A602-C8652AC04491");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, "GRUBENGROHEA");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_SPETTABILE, 9800, 200, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_SPETTABILE, "1EFB151A-5BC7-4F5D-9AF8-53C3BB58884B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_SPETTABILE, "SPETTABILE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_SPETTABILE, BUK_AVVIDIPAGBOO_SPAN_SPETTLE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Spett.le", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_SPETTLE, "6F7B9D33-C647-4DA3-9B42-3D6C57EB5CEE");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_SPETTLE, "SPETTLE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_BERASOESESE1, 9800, 800, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BERASOESESE1, "0105A0F1-6296-41E4-A82E-B63E9E0A634D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BERASOESESE1, "BERASOESESE1");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_BERASOESESE1, BUK_AVVIDIPAGBOO_SPAN_RBRSEECADPAD, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384961, "", "::REBERASOESES", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RBRSEECADPAD, "57CF28E8-9481-462C-A506-AF9156957D3C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RBRSEECADPAD, "RBRSEECADPAD");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_BENINDIRIZZO, 9800, 1400, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BENINDIRIZZO, "7B64D7B9-B9DF-4442-A27C-592628AE712B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BENINDIRIZZO, "BENINDIRIZZO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_BENINDIRIZZO, BUK_AVVIDIPAGBOO_SPAN_REBICADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 35, 0, 271384705, "", "::INDIRIZZO", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_REBICADPADPB, "28E3B0FF-33E0-4F53-80CF-100A0792A94D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_REBICADPADPB, "REBICADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_CITTABENEFIC, 9800, 2000, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_CITTABENEFIC, "9767C2E5-4FE8-464B-9BBD-9B21DDB957D4");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_CITTABENEFIC, "CITTABENEFIC");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_CITTABENEFIC, BUK_AVVIDIPAGBOO_SPAN_RECBCADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 143, 0, 271384961, "Fill Left (To String (BEN CAP), Cinque, zero stringa) +c Space +c COMUNI DENOMINAZIONE +c Space +c PROVINCIA SIGLA", "::RECOCITTBENE", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RECBCADPADPB, "E38F12AC-9D2F-4F68-8B10-C2A242B6534D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RECBCADPADPB, "RECBCADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO1, 100, 3200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO1, "04377462-998D-4249-888C-86078D0D891B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO1, "STAMPATESTO1");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO1, BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1, "79F5FE2D-D27C-4E12-AFF4-A845AF8627EF");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO1, "STAMPATESTO1");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1, 700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1, "9F7E4CA7-4211-461A-930C-626AD50B2A8B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1, "GRUBENGROHE1");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE1, BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO2, 100, 200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO2, "C0AEF9B4-C315-4E76-817C-F880195DD27A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO2, "STAMPATESTO2");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO2, BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2, "9F6C9960-889F-4F3B-B27A-4E485594B446");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO2, "STAMPATESTO2");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2, 800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2, "E59DAF95-1BED-4B3C-92F3-CF7EDE9A8E66");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2, "GRUBENGROHE2");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE2, BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO3, 100, 200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO3, "65C1C4C6-13BB-4604-B3E8-6E6E62C9DF2D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO3, "STAMPATESTO3");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_STAMPATESTO3, BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3, "83B91032-5248-4ABA-9FCE-5386290A16D3");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_STAMPATESTO3, "STAMPATESTO3");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, "DCC7E994-046A-4517-A246-D6BEC44F600D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, "GRUBENGROHE3");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, 100, 0, 5400, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, "34C77EB7-613F-49F7-87D2-19FB3696F9F5");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_MANDATHEADER, BUK_AVVIDIPAGBOO_SPAN_MANDATO, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_MANDATO, "E1974941-F2ED-4E30-A4C0-881B7C9C1F59");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_MANDATO, "MANDATO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE3, BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, 5500, 0, 13300, 500, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, "9DF6CF43-A2A4-42BD-99AA-0DFFC1139D8F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, "MODADIPAGHEA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_MODADIPAGHEA, BUK_AVVIDIPAGBOO_SPAN_MODALDIPAGAM, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Modalità di pagamento", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_MODALDIPAGAM, "AE6CBF57-B525-4B51-9E3B-4CED1012C489");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_MODALDIPAGAM, "MODALDIPAGAM");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4, "7FD3DDCD-452E-4316-A5A8-3BD2B3E8DA2C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHE4, "GRUBENGROHE4");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAIL, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAIL, "E1FE2D7E-4874-415C-8178-0CBBA38F159B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAIL, "DETAIL");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIL, BUK_AVVIDIPAGBOO_RPTBOX_MANDATO, 200, 100, 5200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_MANDATO, "5B059A7C-5D19-4045-B6B2-60679BF2A06E");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_MANDATO, "MANDATO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_MANDATO, BUK_AVVIDIPAGBOO_SPAN_REMACADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 203, 0, 271384705, "", "::RECORDMANDAT", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_REMACADPADPB, "D2B0909D-9D89-426D-8F70-0670845EEA54");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_REMACADPADPB, "REMACADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIL, BUK_AVVIDIPAGBOO_RPTBOX_BORDOMANDATO, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOMANDATO, "D1DDFBC9-DBCF-4B06-9C38-0DDB743FF4EC");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOMANDATO, "BORDOMANDATO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIL, BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZA, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZA, "1EB6A406-8BF2-431A-B1C8-8F1ACFADE230");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZA, "QUIETANZA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZA, BUK_AVVIDIPAGBOO_SPAN_REQUCADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 53, 0, 271384705, "", "::RECORDQUIETA", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_REQUCADPADPB, "AF946050-6F1D-4890-AA2F-333ADEE14DE6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_REQUCADPADPB, "REQUCADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIL, BUK_AVVIDIPAGBOO_RPTBOX_BORDOQUIETAN, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOQUIETAN, "6FC1CC44-5661-4B87-A7EC-0EC27426CE22");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOQUIETAN, "BORDOQUIETAN");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, "1D02374D-3C91-4A27-AAC5-DA94DE48DB11");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, "DETAILBANCA");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, "7506265C-E043-4F50-BAAE-BA71EAC1EC6F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, "QTNDESBANCA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_QTNDESBANCA, BUK_AVVIDIPAGBOO_SPAN_RQDBCADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::DES_BANCA", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RQDBCADPADPB, "F110A70C-06F2-47E9-9868-95F7E783CE2F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RQDBCADPADPB, "RQDBCADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC, "7CAE3242-F734-45BC-BC48-532B92ED9D34");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDBANC, "BORDMANDBANC");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILBANCA, BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC, "6FDB0A3A-203E-4DE7-824D-1D6A1F78DC6F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEBANC, "BORDQUIEBANC");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, "AB326892-B038-417D-99AA-CA29C8B0EABF");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, "DETAILINTEST");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, "6152BEE9-C99F-42FB-BC23-DBCB27072BDE");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, "INTESTATARIO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_INTESTATARIO, BUK_AVVIDIPAGBOO_SPAN_REINCADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 124, 0, 271384705, "", "::RECORDINTEST", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_REINCADPADPB, "3FDFA0C0-04EB-4645-8414-73D4C22E4C7D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_REINCADPADPB, "REINCADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE, "0488892D-01D5-4197-8CF6-B8490F0C9AB7");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDINTE, "BORDMANDINTE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILINTEST, BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE, "0981A4F2-79A1-448A-8BEA-203D53E8789A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEINTE, "BORDQUIEINTE");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075841, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, "1D3C2B2D-929D-4E11-A9F4-4ADFDF7EEC95");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, "DETAILQUIETA");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, 5600, 100, 13100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, "F1CE3EE9-EAC7-4750-AE6F-F5259C3791CD");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, "QUIETANZANTE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_QUIETANZANTE, BUK_AVVIDIPAGBOO_SPAN_CQRBRSEQCADP, MyGlb.VIS_DEFAREPOSTYL, 5, 271, 0, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_CQRBRSEQCADP, "684CEA19-5B3D-4012-B182-95DC901FE733");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_CQRBRSEQCADP, "CQRBRSEQCADP");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE, "5EFDD31D-21BC-432A-9B5E-1349A29DFAD8");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDMANDQUIE, "BORDMANDQUIE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILQUIETA, BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE, "82C1A35E-DCF1-4748-9089-BABD42627401");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDQUIEQUIE, "BORDQUIEQUIE");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO, "B331A47C-3468-4D90-B84E-8CD226E94B4E");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO, "GRUBENGROFOO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFOO, BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1, 100, 0, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1, "981F43A4-A620-4083-8B25-6482817EF084");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERI1, "BORDOINFERI1");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1, 200, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1, "8CF370CC-C645-42E1-B872-23C2F18F57AE");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO1, "GRUBENGROFO1");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2, "3B02AF2D-995F-4479-AB36-DB1F8AAC8DE2");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO2, "GRUBENGROFO2");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3, 2600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8454401, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3, "18E7C2EC-5DBF-42B0-89E2-E18E63E166DC");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3, "GRUBENGROFO3");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO3, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID, 0, 0, 18800, 2500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 458753, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID, "8B638C45-9BEB-4D1D-89EC-CC035C28F704");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID, "ELENCOLIQUID");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, 3000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 76218625, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, "23E10F80-1B9E-404B-A081-16EF46E1A887");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, "GRUBENGROFO4");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, 1800, 600, 8300, 2400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, "168F09F1-612A-4B01-9763-39D809C064B2");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_FIRMABITMAP, "FIRMABITMAP");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA1, 100, 0, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA1, "F95CEDDB-B0BF-44CE-A4BB-ADF3413D51F9");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA1, "STAMPAFIRMA1");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA1, BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA1, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384961, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA1, "DC339DF0-4C7C-4591-90AE-42EA3D139F31");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA1, "STAMPAFIRMA1");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_GRUBENGROFO4, BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA2, 100, 600, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA2, "93DF96FA-E4AB-4B25-B58A-F67D0A94E9B5");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA2, "STAMPAFIRMA2");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_STAMPAFIRMA2, BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA2, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384961, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA2, "A8FFFAF9-0F93-4078-9967-E7723DCFBD93");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_STAMPAFIRMA2, "STAMPAFIRMA2");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER, "B2B39821-6B04-4F66-91D6-D19BF679AF10");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP, BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER, "6BFDFECB-C24B-42C1-9A11-017486131D1A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_AVVIDIPAGBOO.AddReportGroup(BUK_AVVIDIPAGBOO_SEC_GRUBENGROHEA, "GRUPPOBENEFI");
    BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP_InitQuery(false, true);
  }

  private void BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_InitQuery() { BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_InitQuery(true, true); }
  private void BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_InitQuery(boolean flReport, boolean flGraphs)
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
      SQL.append("and   (NVL(A.DIVERSO_BEN, A.BENEFICIARIO) = NVL(~~" + BUK_AVVIDIPAGBOO_RPT_AVVIDIPAGREP + ".RECORBENCODI~~, NVL(A.DIVERSO_BEN, A.BENEFICIARIO))) ");
      SQL.append("and   (C.NUM_QUIETANZA = DECODE(A.DIVERSO_BEN, to_number(NULL), A.NUM_QUIETANZA, A.NUM_QUIETANZA_DIV_BEN)) ");
      SQL.append("and   (C.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
      SQL.append("and   (D.STAMPA_AVVISO = 'SI') ");
      SQL.append("and   (E.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
      SQL.append("and   (E.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
      SQL.append("and   (B.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("order by 19, 1, 2, 3, 4 ");
      BUK_AVVIDIPAGBOO.SetReportQuery(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "6226475D-E8D5-48B1-8C13-CC2FEC7EADE8");
      if (BUK_AVVIDIPAGBOO.FindObjByID(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU) != null)
        BUK_AVVIDIPAGBOO.AddReportGroup(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, "RECONUOVESPR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_Init()
  {
    BUK_AVVIDIPAGBOO.InitReport(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, 196865);
    BUK_AVVIDIPAGBOO.SetSubReportBox(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_InitQuery(true, false);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "14E4D6CA-E716-49A1-8628-FD92C01753ED");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, "ELENLIQUREPO");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECONUOVESPR");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, "ED2B3CCC-0060-4DDC-809A-6A20A86E04A1");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, "NUOESPINTGRU");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_CAUSALHEADER, 100, 0, 8300, 500, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALHEADER, "72431E26-AC3D-432F-A646-FC9521531088");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALHEADER, "CAUSALHEADER");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALHEADER, BUK_AVVIDIPAGBOO_SPAN_CAUSALE, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Causale", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_CAUSALE, "B0C7F763-06C2-48A3-8CAC-69FC129EBA74");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_CAUSALE, "CAUSALE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_IMPORTHEADER, 8400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTHEADER, "EE91BDDE-D5C8-4800-BE83-3954222F7EF1");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTHEADER, BUK_AVVIDIPAGBOO_SPAN_IMPORTO, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_IMPORTO, "A289B8C3-89BE-4092-8B40-34A2499936AA");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_IMPORTO, "IMPORTO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_RITENUHEADER, 11000, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_RITENUHEADER, "BDEE5617-3A1A-4A5A-AF84-035D52611175");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_RITENUHEADER, "RITENUHEADER");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_RITENUHEADER, BUK_AVVIDIPAGBOO_SPAN_RITENUTE, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RITENUTE, "DA1E772F-9064-4829-BF31-4FDEC44255E6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RITENUTE, "RITENUTE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_NETTOHEADER, 16200, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_NETTOHEADER, "C8EB9B7E-CE1A-4C5F-B5ED-50B7900ACCC4");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_NETTOHEADER, "NETTOHEADER");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_NETTOHEADER, BUK_AVVIDIPAGBOO_SPAN_NETTO, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Netto", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_NETTO, "A5EFCB66-117C-43BC-8906-3C36627DBECF");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_NETTO, "NETTO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, BUK_AVVIDIPAGBOO_RPTBOX_IMPOIVA1HEA1, 13600, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_IMPOIVA1HEA1, "0CB8DCE1-4EDD-4E88-BFA6-25F5BDCE6829");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_IMPOIVA1HEA1, "IMPOIVA1HEA1");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_IMPOIVA1HEA1, BUK_AVVIDIPAGBOO_SPAN_C, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Iva SP/RC", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_C, "91835F69-6730-456D-B877-0019CCCE529B");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_C, "C");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, "0B11F53E-0F31-4F7B-912C-7A9B85FF1548");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, "DETAILLIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_CAUSALE, 200, 100, 8200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALE, "41252C4E-53F8-499A-AF09-B6AEEF2FE30C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALE, "CAUSALE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_CAUSALE, BUK_AVVIDIPAGBOO_SPAN_IEPPFRCFCADP, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "To String (LIQ NUMERO MAND) +c Space +c If Equal (LIQ FAT ANNO PROG, Null Number, LIQ DESCRIZIONE, If Equal (FAT CODICE DOC, Uno, Fattura, If Equal (FAT CODICE DOC, Sette, Nota Add., Null String))) +c Space +c To String (FAT NUMERO DOC) +c Space +c del  +c To String (FAT D DATA DOC)", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_IEPPFRCFCADP, "1B0FFC33-97E2-4FF3-9C25-F3F36377ED71");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_IEPPFRCFCADP, "IEPPFRCFCADP");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSLIQ, 100, 0, 8300, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSLIQ, "3D5D198F-F060-4FB7-9E1E-24C9ED1BF50F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSLIQ, "BORDOCAUSLIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_IMPORTO, 8400, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTO, "29417045-5E00-40F1-B044-421D470A7B32");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTO, "IMPORTO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTO, BUK_AVVIDIPAGBOO_SPAN_RELICADPADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::IMPORTO", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RELICADPADPB, "3A07F69C-5B95-464F-929B-67AB1A3BFF85");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RELICADPADPB, "RELICADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPOLIQ, 8400, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPOLIQ, "947F9AF9-0288-4FAF-A368-920E3F2A07A9");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPOLIQ, "BORDOIMPOLIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_RITENUTE, 11000, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_RITENUTE, "D7211E40-8202-4E97-BC0F-83B33E0BD626");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_RITENUTE, "RITENUTE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_RITENUTE, BUK_AVVIDIPAGBOO_SPAN_RELRCADPADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::RITENUTE", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RELRCADPADPB, "2287928A-E97C-45D9-A382-10AC86A430CA");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RELRCADPADPB, "RELRCADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDORITELIQ, 11000, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDORITELIQ, "BFFBE7E9-50A7-425E-BA81-8BEED97580FA");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDORITELIQ, "BORDORITELIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_NETTO, 16200, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_NETTO, "35D35251-065E-44C2-B9FC-F4D753AAE761");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_NETTO, "NETTO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_NETTO, BUK_AVVIDIPAGBOO_SPAN_RENECADPADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::RECORDNETTO", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RENECADPADPB, "5AF538C8-8532-435F-B24E-153E920EA439");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RENECADPADPB, "RENECADPADPB");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTLIQ, 16200, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTLIQ, "2EE83D02-1393-4719-9C24-01B44356A3E1");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTLIQ, "BORDONETTLIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILLIQ, BUK_AVVIDIPAGBOO_RPTBOX_IMPORTOIVA, 13600, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTOIVA, "42FCDC0D-49C9-45E4-87CB-37E2D8C6DC32");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTOIVA, "IMPORTOIVA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_IMPORTOIVA, BUK_AVVIDIPAGBOO_SPAN_RLIICADPADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::RECLIQIMPIVA", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RLIICADPADPB, "1142E77B-E69E-458F-B96F-BA6791D9612A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RLIICADPADPB, "RLIICADPADPB");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11599873, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, "3122EDE4-0BA4-465C-B780-0BFAD645C381");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, "DETAIRETTLIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF, 100, 100, 8300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 458753, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF, "9EFE5071-57AC-41BA-A8B8-A4A5CDB7F8F8");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF, "ELENCORETTIF");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSRET, 100, 0, 8300, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSRET, "54D72C8F-3424-4EA8-8D50-5803E8C3276A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOCAUSRET, "BORDOCAUSRET");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPORET, 8400, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPORET, "CA5ACBAB-D533-4D7D-912D-EE4D42E6F546");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOIMPORET, "BORDOIMPORET");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDORITERET, 11000, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDORITERET, "375FCFCB-F9CE-427D-9BAF-C6BCD065579E");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDORITERET, "BORDORITERET");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAIRETTLIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTRET, 16200, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTRET, "8FCAD0F6-B4E7-496C-8EF7-7117F258476F");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDONETTRET, "BORDONETTRET");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECONUOVESPR");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU, "76DD52A3-8C00-4C30-92CC-F6BE57B86A7A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_NUOESPPIEGRU, "NUOESPPIEGRU");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO, BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_ELENCOLIQUID);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, "8E2998B7-53A6-471A-AC92-CD5E292BD2A2");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, "PAGEFOOTELIQ");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOSUPERIO, 100, 0, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOSUPERIO, "2B5B9EDD-DEE3-4069-9396-7BEA3679B920");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOSUPERIO, "BORDOSUPERIO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_DOPPBORDSUPE, 8400, 100, 10400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_DOPPBORDSUPE, "6D82BEFA-4414-40CD-A095-A0D8821C69F6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_DOPPBORDSUPE, "DOPPBORDSUPE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFCAU, 100, 0, 8300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFCAU, "249624EE-5FD3-4925-B3B8-EB5D989B71B6");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFCAU, "BORDSUMOFCAU");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_TOTALELABEL, 6600, 200, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_TOTALELABEL, "67597CAC-3B9C-4CA5-AE73-0FEE6A38E662");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_TOTALELABEL, "TOTALELABEL");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_TOTALELABEL, BUK_AVVIDIPAGBOO_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_TOTALE, "E97F9D7C-EB24-435A-AAAD-FA968CC64148");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_TOTALE, "TOTALE");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFIMP, 8400, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFIMP, "ABFD19C5-94A1-4A0D-B8C7-FA1C7435843E");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFIMP, "BORDSUMOFIMP");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMPO, 8500, 200, 2400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMPO, "0D6A8ED6-B219-44E3-A662-5BAB6CBA9A96");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMPO, BUK_AVVIDIPAGBOO_SPAN_PFLSRLICADPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_PFLSRLICADPA, "BDD0C091-51F3-48F6-BC17-F9CA4DD64677");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_PFLSRLICADPA, "PFLSRLICADPA");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFRIT, 11000, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFRIT, "6266EFF5-4BD7-40CD-8572-1EE6A3EF3276");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFRIT, "BORDSUMOFRIT");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQRITE, 11000, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQRITE, "F4EDBE60-2D39-4841-A94D-6F777FF43F78");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQRITE, "SUMOFLIQRITE");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQRITE, BUK_AVVIDIPAGBOO_SPAN_PFLSRLRCADPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_PFLSRLRCADPA, "025CCFF9-C617-4E6F-ABE3-925EAD968923");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_PFLSRLRCADPA, "PFLSRLRCADPA");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFNET, 16200, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFNET, "3AA12C14-F3E1-4FE7-85F2-519BBA078D7A");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDSUMOFNET, "BORDSUMOFNET");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_SUMOFNETTO, 16200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFNETTO, "B26457F1-9FE8-40E7-9EE1-CBEA06EDB8D7");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFNETTO, "SUMOFNETTO");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFNETTO, BUK_AVVIDIPAGBOO_SPAN_PFLSRNCADPAD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_PFLSRNCADPAD, "CCAF5FD0-9B2F-4182-8C5D-CA2F6B9DEBDE");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_PFLSRNCADPAD, "PFLSRNCADPAD");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERIO, 100, 700, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERIO, "2F84F2FE-5C2A-4000-859C-F79558845718");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORDOINFERIO, "BORDOINFERIO");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMIV, 13600, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMIV, "9B8864A7-D9D9-4C3D-A6F2-3F1205D64BF8");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMIV, "SUMOFLIQIMIV");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_SUMOFLIQIMIV, BUK_AVVIDIPAGBOO_SPAN_PFLSRLIICADP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_PFLSRLIICADP, "34A021B1-0950-4EA3-9722-F1692FDE776C");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_PFLSRLIICADP, "PFLSRLIICADP");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_PAGEFOOTELIQ, BUK_AVVIDIPAGBOO_RPTBOX_BORSUMOFIMIV, 13600, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_BORSUMOFIMIV, "3F267A79-4E75-4830-A668-E098F7D67465");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_BORSUMOFIMIV, "BORSUMOFIMIV");
    BUK_AVVIDIPAGBOO.AddReportGroup(BUK_AVVIDIPAGBOO_SEC_NUOESPINTGRU, "RECONUOVESPR");
    BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO_InitQuery(false, true);
  }

  private void BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_InitQuery() { BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_InitQuery(true, true); }
  private void BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(B.CODICE_DOC, 2, 'Nota Acc.', DECODE(B.CODICE_DOC, 7, 'Nota Add.', NULL)) || ' ' || B.NUMERO_DOC || ' ' || 'del ' || TO_CHAR ( B.D_DATA_DOC,'dd/mm/yyyy') as RECORDRETTIF ");
      SQL.append("from ");
      SQL.append("  RETFAT A, ");
      SQL.append("  FAT B ");
      SQL.append("where (A.FAT_ANNO_PROG_FAT = ~~" + BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO + ".FAT_ANNO_PROG~~) ");
      SQL.append("and   (A.FAT_NUMERO_PROG_FAT = ~~" + BUK_AVVIDIPAGBOO_RPT_ELENLIQUREPO + ".FAT_NUMERO_PROG~~) ");
      SQL.append("and   ((A.COD_REC IS NULL) AND NOT ((A.FAT_ANNO_PROG_NAC IS NULL))) ");
      SQL.append("and   (B.ANNO_PROG = A.FAT_ANNO_PROG_NAC) ");
      SQL.append("and   (B.NUMERO_PROG = A.FAT_NUMERO_PROG_NAC) ");
      BUK_AVVIDIPAGBOO.SetReportQuery(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "470E2F76-728B-4BC9-8186-EFFC587FB9C9");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_Init()
  {
    BUK_AVVIDIPAGBOO.InitReport(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, 196865);
    BUK_AVVIDIPAGBOO.SetSubReportBox(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF);
    BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_InitQuery(true, false);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, "F3A72458-50FC-4F62-B2F0-31A868B6AD50");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, "ELENRETTREPO");
    BUK_AVVIDIPAGBOO.InitSection(BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO, BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8454145, "");
    BUK_AVVIDIPAGBOO.SetSectionRendersInto(BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF, BUK_AVVIDIPAGBOO_RPTBOX_ELENCORETTIF);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF, "333BBE7E-8824-4083-AD64-D2448F8B1F0D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF, "DETAILRETTIF");
    BUK_AVVIDIPAGBOO.InitReportBox(BUK_AVVIDIPAGBOO_SEC_DETAILRETTIF, BUK_AVVIDIPAGBOO_RPTBOX_RETTIFICA, 500, 0, 7800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_RPTBOX_RETTIFICA, "2532D80E-87BD-48F3-9305-91D093F6E30D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_RPTBOX_RETTIFICA, "RETTIFICA");
    BUK_AVVIDIPAGBOO.InitBoxSpan(BUK_AVVIDIPAGBOO_RPTBOX_RETTIFICA, BUK_AVVIDIPAGBOO_SPAN_RERECADPADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 224, 0, 271384705, "", "::RECORDRETTIF", 1);
    BUK_AVVIDIPAGBOO.SetRTCGuid(BUK_AVVIDIPAGBOO_SPAN_RERECADPADPB, "279D5D69-A336-4AEF-9ED9-4F743FBD051D");
    BUK_AVVIDIPAGBOO.SetObjCode(BUK_AVVIDIPAGBOO_SPAN_RERECADPADPB, "RERECADPADPB");
    BUK_AVVIDIPAGBOO_RPT_ELENRETTREPO_InitQuery(false, true);
  }

  private void BUK_AVVIDIPAGBOO_InitLinks()
  {
    BUK_AVVIDIPAGBOO.SetBoxNextBox(BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1, BUK_AVVIDIPAGBOO_RPTBOX_PAGEBODY1);
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
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_AVVIDIPAGBOO) BUK_AVVIDIPAGBOO_OnPreview();
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
