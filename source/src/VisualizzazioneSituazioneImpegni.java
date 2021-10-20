// **********************************************
// Visualizzazione Situazione Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzazioneSituazioneImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_SITUIMPEREPO;
  OBook BKW_SITUIMPEREPO;
  //
  // Template Pages constants
  private static int BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITUIMPEREPO_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_SITUIMPEREPO_SPAN_CPTSSIRVSIPN = 3;
  private static int BUK_SITUIMPEREPO_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_SITUIMPEREPO_SPAN_SITUAZIMPEG1 = 5;
  private static int BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1 = 6;
  private static int BUK_SITUIMPEREPO_RPTBOX_PAGEFOOTER1 = 7;

  //
  // Reports constants
  private static int BUK_SITUIMPEREPO_RPT_SITIMPPDFREP = 8;
  private static int BUK_SITUIMPEREPO_SEC_UNIORGGROHEA = 9;
  private static int BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONU1 = 10;
  private static int BUK_SITUIMPEREPO_SPAN_DESCRIZIONU1 = 11;
  private static int BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA = 12;
  private static int BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2 = 13;
  private static int BUK_SITUIMPEREPO_RPTBOX_CAPITARTHEA1 = 14;
  private static int BUK_SITUIMPEREPO_SPAN_C1 = 15;
  private static int BUK_SITUIMPEREPO_RPTBOX_VOCEPEG1 = 16;
  private static int BUK_SITUIMPEREPO_SPAN_CWSIVPVSISIR = 17;
  private static int BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1 = 18;
  private static int BUK_SITUIMPEREPO_SPAN_IMPORTIMPAC1 = 19;
  private static int BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1 = 20;
  private static int BUK_SITUIMPEREPO_SPAN_SUBIMPEGNAT1 = 21;
  private static int BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1 = 22;
  private static int BUK_SITUIMPEREPO_SPAN_LIQUIDATO1 = 23;
  private static int BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1 = 24;
  private static int BUK_SITUIMPEREPO_SPAN_MANORD1 = 25;
  private static int BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1 = 26;
  private static int BUK_SITUIMPEREPO_SPAN_DISPONIBILI1 = 27;
  private static int BUK_SITUIMPEREPO_SEC_RESCOMGROHEA = 28;
  private static int BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI = 29;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTACOMPRESI = 30;
  private static int BUK_SITUIMPEREPO_SPAN_TOTACOMPRESI = 31;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTAIMPOIMP2 = 32;
  private static int BUK_SITUIMPEREPO_SPAN_TOTAIMPOIMP1 = 33;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTALESUBIM2 = 34;
  private static int BUK_SITUIMPEREPO_SPAN_TOTALESUBIM1 = 35;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTALELIQUI2 = 36;
  private static int BUK_SITUIMPEREPO_SPAN_TOTALELIQUI1 = 37;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTALEMANOR2 = 38;
  private static int BUK_SITUIMPEREPO_SPAN_TOTALEMANOR1 = 39;
  private static int BUK_SITUIMPEREPO_RPTBOX_TOTALEDISPO2 = 40;
  private static int BUK_SITUIMPEREPO_SPAN_TOTALEDISPO1 = 41;
  private static int BUK_SITUIMPEREPO_RPTBOX_ESTRIMPAHEA1 = 42;
  private static int BUK_SITUIMPEREPO_SPAN_ESTREMIMPAC1 = 43;
  private static int BUK_SITUIMPEREPO_RPTBOX_DATAIMPAHEA1 = 44;
  private static int BUK_SITUIMPEREPO_SPAN_DATAIMPACC1 = 45;
  private static int BUK_SITUIMPEREPO_RPTBOX_DETEPROPHEA1 = 46;
  private static int BUK_SITUIMPEREPO_SPAN_DETERMPROPO1 = 47;
  private static int BUK_SITUIMPEREPO_RPTBOX_OBBLIGHEADE1 = 48;
  private static int BUK_SITUIMPEREPO_SPAN_OBBLIGATORI1 = 49;
  private static int BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONE = 50;
  private static int BUK_SITUIMPEREPO_SPAN_DESCRIZIONE1 = 51;
  private static int BUK_SITUIMPEREPO_SEC_DETAIL = 52;
  private static int BUK_SITUIMPEREPO_RPTBOX_ESTREMIMPAC1 = 53;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSEIVSISIR = 54;
  private static int BUK_SITUIMPEREPO_RPTBOX_DATAIMPACC1 = 55;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSDIVSISI2 = 56;
  private static int BUK_SITUIMPEREPO_RPTBOX_DETERMPROPO1 = 57;
  private static int BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR = 58;
  private static int BUK_SITUIMPEREPO_RPTBOX_DESCRIMPACC1 = 59;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSDIVSISIR = 60;
  private static int BUK_SITUIMPEREPO_RPTBOX_IMPORTIMPAC1 = 61;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSIIVSISIR = 62;
  private static int BUK_SITUIMPEREPO_RPTBOX_SUBIMPEGNAT1 = 63;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSISVSISIR = 64;
  private static int BUK_SITUIMPEREPO_RPTBOX_LIQUIDATO1 = 65;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSILVSISIR = 66;
  private static int BUK_SITUIMPEREPO_RPTBOX_MANORD1 = 67;
  private static int BUK_SITUIMPEREPO_SPAN_CWSIMOVSISIR = 68;
  private static int BUK_SITUIMPEREPO_RPTBOX_DISPONIBILI1 = 69;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSIDVSISIR = 70;
  private static int BUK_SITUIMPEREPO_RPTBOX_OBBLIGATORI1 = 71;
  private static int BUK_SITUIMPEREPO_SPAN_CFWSIOVSISIR = 72;
  private static int BUK_SITUIMPEREPO_SEC_DETARAGISOCI = 73;
  private static int BUK_SITUIMPEREPO_RPTBOX_RAGIONSOCIA1 = 74;
  private static int BUK_SITUIMPEREPO_SPAN_CWSIRSVSISIR = 75;
  private static int BUK_SITUIMPEREPO_SEC_DETAIUOUTILI = 76;
  private static int BUK_SITUIMPEREPO_RPTBOX_DESCRUOUTIL1 = 77;
  private static int BUK_SITUIMPEREPO_SPAN_CWSIDUUVSIS1 = 78;
  private static int BUK_SITUIMPEREPO_SEC_RESCOMGROFOO = 79;
  private static int BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO = 80;
  private static int BUK_SITUIMPEREPO_SEC_UNIORGGROFOO = 81;

  CIDREObj BUK_SITUIMPESTAM;
  OBook BKW_SITUIMPESTAM;
  //
  // Template Pages constants
  private static int BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITUIMPESTAM_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SITUIMPESTAM_SPAN_CPTSSISVSIPN = 3;
  private static int BUK_SITUIMPESTAM_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SITUIMPESTAM_SPAN_SITUAZIMPEGN = 5;
  private static int BUK_SITUIMPESTAM_RPTBOX_PAGEBODY = 6;
  private static int BUK_SITUIMPESTAM_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_SITUIMPESTAM_RPT_SITIMPPDFREP = 8;
  private static int BUK_SITUIMPESTAM_SEC_PROGUOGROHEA = 9;
  private static int BUK_SITUIMPESTAM_RPTBOX_DESCRIZIONUO = 10;
  private static int BUK_SITUIMPESTAM_SPAN_DESCRIZIONUO = 11;
  private static int BUK_SITUIMPESTAM_RPTBOX_CAPITARTHEAD = 12;
  private static int BUK_SITUIMPESTAM_SPAN_C = 13;
  private static int BUK_SITUIMPESTAM_RPTBOX_ESTRIMPAHEAD = 14;
  private static int BUK_SITUIMPESTAM_SPAN_ESTREMIMPACC = 15;
  private static int BUK_SITUIMPESTAM_RPTBOX_DATAIMPAHEAD = 16;
  private static int BUK_SITUIMPESTAM_SPAN_DATAIMPACC = 17;
  private static int BUK_SITUIMPESTAM_RPTBOX_DETEPROPHEAD = 18;
  private static int BUK_SITUIMPESTAM_SPAN_DETERMPROPOS = 19;
  private static int BUK_SITUIMPESTAM_RPTBOX_IMPOIMPAHEAD = 20;
  private static int BUK_SITUIMPESTAM_SPAN_IMPORTIMPACC = 21;
  private static int BUK_SITUIMPESTAM_RPTBOX_SUBIMPHEADER = 22;
  private static int BUK_SITUIMPESTAM_SPAN_SUBIMPEGNATO = 23;
  private static int BUK_SITUIMPESTAM_RPTBOX_LIQUIDHEADER = 24;
  private static int BUK_SITUIMPESTAM_SPAN_LIQUIDATO = 25;
  private static int BUK_SITUIMPESTAM_RPTBOX_MANORDHEADER = 26;
  private static int BUK_SITUIMPESTAM_SPAN_MANORD = 27;
  private static int BUK_SITUIMPESTAM_RPTBOX_DISPONHEADER = 28;
  private static int BUK_SITUIMPESTAM_SPAN_DISPONIBILIT = 29;
  private static int BUK_SITUIMPESTAM_RPTBOX_DESCRIHEADER = 30;
  private static int BUK_SITUIMPESTAM_SPAN_DESCRIZIONE = 31;
  private static int BUK_SITUIMPESTAM_RPTBOX_OBBLIGHEADER = 32;
  private static int BUK_SITUIMPESTAM_SPAN_OBBLIGATORIO = 33;
  private static int BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA = 34;
  private static int BUK_SITUIMPESTAM_SEC_RESCOMGROHEA = 35;
  private static int BUK_SITUIMPESTAM_SEC_DETAIL = 36;
  private static int BUK_SITUIMPESTAM_RPTBOX_CAPITOLOART = 37;
  private static int BUK_SITUIMPESTAM_SPAN_CWSIVPVSISIS = 38;
  private static int BUK_SITUIMPESTAM_RPTBOX_ESTREMIMPACC = 39;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSEIVSISIS = 40;
  private static int BUK_SITUIMPESTAM_RPTBOX_DATAIMPACC = 41;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSDIVSISI1 = 42;
  private static int BUK_SITUIMPESTAM_RPTBOX_DETERMPROPOS = 43;
  private static int BUK_SITUIMPESTAM_SPAN_CWSIDPVSISIS = 44;
  private static int BUK_SITUIMPESTAM_RPTBOX_IMPORTIMPACC = 45;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSIIVSISIS = 46;
  private static int BUK_SITUIMPESTAM_RPTBOX_SUBIMPEGNATO = 47;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSISVSISIS = 48;
  private static int BUK_SITUIMPESTAM_RPTBOX_LIQUIDATO = 49;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSILVSISIS = 50;
  private static int BUK_SITUIMPESTAM_RPTBOX_MANORD = 51;
  private static int BUK_SITUIMPESTAM_SPAN_CWSIMOVSISIS = 52;
  private static int BUK_SITUIMPESTAM_RPTBOX_DISPONIBILIT = 53;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSIDVSISIS = 54;
  private static int BUK_SITUIMPESTAM_RPTBOX_DESCRIMPACC = 55;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSDIVSISIS = 56;
  private static int BUK_SITUIMPESTAM_RPTBOX_OBBLIGATORIO = 57;
  private static int BUK_SITUIMPESTAM_SPAN_CFWSIOVSISIS = 58;
  private static int BUK_SITUIMPESTAM_SEC_DETARAGISOCI = 59;
  private static int BUK_SITUIMPESTAM_RPTBOX_RAGIONSOCIAL = 60;
  private static int BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS = 61;
  private static int BUK_SITUIMPESTAM_SEC_DETAIUOUTILI = 62;
  private static int BUK_SITUIMPESTAM_RPTBOX_DESCRUOUTILI = 63;
  private static int BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI = 64;
  private static int BUK_SITUIMPESTAM_SEC_RESCOMGROFOO = 65;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTRESHEACOM = 66;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALECOMPE1 = 67;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOIMPA = 68;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAIMPOIMPA = 69;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALESUBIMP = 70;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALESUBIMP = 71;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALELIQUID = 72;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALELIQUID = 73;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALEMANORD = 74;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALEMANORD = 75;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALEDISPON = 76;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALEDISPON = 77;
  private static int BUK_SITUIMPESTAM_RPTBOX_BARRARESCOMP = 78;
  private static int BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO = 79;
  private static int BUK_SITUIMPESTAM_SEC_PROUOGROFOBA = 80;
  private static int BUK_SITUIMPESTAM_RPTBOX_BARRAUO = 81;
  private static int BUK_SITUIMPESTAM_SEC_PROUOGROFORE = 82;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTGENRESHEA = 83;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAGENERESI = 84;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTAIMPORESI = 85;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAIMPORESI = 86;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPRES = 87;
  private static int BUK_SITUIMPESTAM_SPAN_TOTSUBIMPRES = 88;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALIQURESI = 89;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALIQURESI = 90;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTAMANDRESI = 91;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAMANDRESI = 92;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTADISPRESI = 93;
  private static int BUK_SITUIMPESTAM_SPAN_TOTADISPRESI = 94;
  private static int BUK_SITUIMPESTAM_SEC_PROUOGROFOCO = 95;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTGENCOMHEA = 96;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAGENECOMP = 97;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOCOMP = 98;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAIMPOCOMP = 99;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPCOM = 100;
  private static int BUK_SITUIMPESTAM_SPAN_TOTSUBIMPCOM = 101;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTALIQUCOMP = 102;
  private static int BUK_SITUIMPESTAM_SPAN_TOTALIQUCOMP = 103;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTAMANDCOMP = 104;
  private static int BUK_SITUIMPESTAM_SPAN_TOTAMANDCOMP = 105;
  private static int BUK_SITUIMPESTAM_RPTBOX_TOTADISPCOMP = 106;
  private static int BUK_SITUIMPESTAM_SPAN_TOTADISPCOMP = 107;
  private static int BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA = 108;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI115(IMDB);
    //
    //
    Init_PQRY_CF4WRKSITIM2(IMDB);
    Init_PQRY_CF4WRKSITIM3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI115(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI115, 5);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI115, "TBL_PARAMETRI115");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARATIPOSTRU,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARAPROUOSTR, "PARAPROUOSTR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARAPROUOSTR,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI115,IMDBDef7.FLD_PARAMETRI115_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI115, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM2, 31);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM2, "PQRY_CF4WRKSITIM2");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_OBBLIGATORIO, "OBBLIGATORIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_OBBLIGATORIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM2,IMDBDef17.PQSL_CF4WRKSITIM2_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM2, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM3, 31);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM3, "PQRY_CF4WRKSITIM3");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_OBBLIGATORIO, "OBBLIGATORIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_OBBLIGATORIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM3,IMDBDef17.PQSL_CF4WRKSITIM3_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzazioneSituazioneImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzazioneSituazioneImpegni()
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
    FormIdx = MyGlb.FRM_VISUSITUIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "153F887E-380E-4EAC-8EE2-28A9C77C4D69";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1188;
    DesignHeight = 890;
    set_Caption(new IDVariant("Visualizzazione Situazione Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1188;
    Frames[1].Height = 864;
    Frames[1].Caption = "Situazione Impegni Report";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 864;
    BKW_SITUIMPEREPO = new OBook(this);
    BUK_SITUIMPEREPO = new CIDREObj(BKW_SITUIMPEREPO);
    Frames[1].Content = BKW_SITUIMPEREPO;
    BKW_SITUIMPEREPO.Height = 834;
    BKW_SITUIMPEREPO.Width = 1188;
    BKW_SITUIMPEREPO.iGuid = "3A99D05B-D6ED-4567-8D0D-80E62C5C9D36";
    BKW_SITUIMPEREPO.Code = "BUK_SITUIMPEREPO";
    BKW_SITUIMPEREPO.BookObj = BUK_SITUIMPEREPO;
    BKW_SITUIMPEREPO.InitDefMasks();
    BUK_SITUIMPEREPO.set_FrIndex(1);
    BUK_SITUIMPEREPO.InitBook(1, 3342593, "Situazione Impegni Report", IMDB, MainFrm.VisualStyleList);
    BUK_SITUIMPEREPO.InitHTML();
    BUK_SITUIMPEREPO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITUIMPEREPO.SetSize(1188, 834);
    BUK_SITUIMPEREPO.Book.SetMainFrm(MainFrm);
    BUK_SITUIMPEREPO.SetRTCGuid(0, "3A99D05B-D6ED-4567-8D0D-80E62C5C9D36");
    BUK_SITUIMPEREPO.SetObjCode(0, "SITUIMPEREPO");
    BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA_Init();
    BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_Init();
    BUK_SITUIMPEREPO_InitLinks();
    BKW_SITUIMPESTAM = new OBook(this);
    BUK_SITUIMPESTAM = new CIDREObj(BKW_SITUIMPESTAM);
    BKW_SITUIMPESTAM.iGuid = "273C92DB-65C1-407B-A760-ED68425F389C";
    BKW_SITUIMPESTAM.Code = "BUK_SITUIMPESTAM";
    BKW_SITUIMPESTAM.BookObj = BUK_SITUIMPESTAM;
    BKW_SITUIMPESTAM.InitDefMasks();
    BUK_SITUIMPESTAM.InitBook(1, 3342593, "Situazioni Impegni Stampa", IMDB, MainFrm.VisualStyleList);
    BUK_SITUIMPESTAM.InitHTML();
    BUK_SITUIMPESTAM.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITUIMPESTAM.Book.SetMainFrm(MainFrm);
    BUK_SITUIMPESTAM.SetRTCGuid(0, "273C92DB-65C1-407B-A760-ED68425F389C");
    BUK_SITUIMPESTAM.SetObjCode(0, "SITUIMPESTAM");
    BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA_Init();
    BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_Init();
    BUK_SITUIMPESTAM_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPACOMPL3+BaseCmdLinIdx)
      {
        ApriStampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUTT3+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUTT3+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI34+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI29+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI34+BaseCmdLinIdx), FormIdx, 1);
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
      BUK_SITUIMPEREPO.UpdateBook();
      // BUK_SITUIMPESTAM.UpdateBook();
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
    if (Code.equals("BUK_SITUIMPEREPO")) return BUK_SITUIMPEREPO;
    if (Code.equals("BUK_SITUIMPESTAM")) return BUK_SITUIMPESTAM;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VisualizzazioneSituazioneImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzazioneSituazioneImpegni.class.getName() : (Glb.ClassWithPackage(VisualizzazioneSituazioneImpegni.class) ? VisualizzazioneSituazioneImpegni.class.getName().substring(VisualizzazioneSituazioneImpegni.class.getPackage().getName().length() + 1) : VisualizzazioneSituazioneImpegni.class.getName()));
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
      v_CAPTION = (new IDVariant("Situazione Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[BUK_SITUIMPEREPO.Book.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARRESCOMENT, 0).equals((new IDVariant("R")), true))
      {
        // 
        // visibilità footer stampa
        // 
        {
          BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
          BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARRESCOMENT, 0).equals((new IDVariant("C")), true))
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, (new IDVariant(0)).booleanValue());
            BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
        else
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
            BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARAMUOUTILI, 0).equals((new IDVariant("SI")), true))
      {
        BUK_SITUIMPEREPO.set_SectionVisible(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
        BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITUIMPEREPO.set_SectionVisible(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
        BUK_SITUIMPESTAM.set_SectionVisible(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // VOCE PEG Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VOCE PEG Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if (BUK_SITUIMPEREPO.SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA))
      {
        BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tm1.gif")).toString()); 
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, (new IDVariant(-1)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tp1.gif")).toString()); 
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, (new IDVariant(0)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITUIMPEREPO.set_BoxVisible(BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "VOCEPEGGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Residuo Competenza Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUIMPEREPO_SEC_RESCOMGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Residuo Competenza Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_SITUIMPEREPO.SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA))).equals((new IDVariant(0)), true))
      {
        BUK_SITUIMPEREPO.set_SectionHeight(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(5, IDVariant.FLOAT)).dblValue());
        BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_SITUIMPEREPO.set_SectionHeight(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(9, IDVariant.FLOAT)).dblValue());
        BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "ResiduoCompetenzaGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUIMPEREPO_SEC_DETAIL_OnFormattingSection()
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
      BUK_SITUIMPEREPO.set_SpanToolTip(BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR, BUK_SITUIMPEREPO.SpanValue(BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "DetailBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Ragione Sociale Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUIMPEREPO_SEC_DETARAGISOCI_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Ragione Sociale Before Formatting Event Body
      // Procedure Body
      // 
      BUK_SITUIMPESTAM.set_SpanToolTip(BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS, BUK_SITUIMPESTAM.SpanValue(BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "DetailRagioneSocialeBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail UO Utilizzo Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUIMPEREPO_SEC_DETAIUOUTILI_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail UO Utilizzo Before Formatting Event Body
      // Procedure Body
      // 
      BUK_SITUIMPESTAM.set_SpanToolTip(BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI, BUK_SITUIMPESTAM.SpanValue(BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "DetailUOUtilizzoBeforeFormattingEvent", _e);
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
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUIMPEREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "EspandiTutto", _e);
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
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUIMPEREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "ComprimiTutto", _e);
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
      BUK_SITUIMPESTAM.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_SITUIMPESTAM.ReportRefreshQuery(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP);
      BUK_SITUIMPESTAM.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_SITUIMPESTAM.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneImpegni", "ApriStampaCompleta", _e);
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
  private void BUK_SITUIMPEREPO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITUIMPEREPO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITUIMPEREPO_SEC_UNIORGGROHEA)
    {
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA)
    {
      BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_RESCOMGROHEA)
    {
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTACOMPRESI, new IDVariant(((BUK_SITUIMPEREPO.GetReportColumn(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, "CFWRSIIMRECO").equals((new IDVariant(2)), true))?(new IDVariant("Totale Competenza")):(new IDVariant("Totale Residui")))));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTAIMPOIMP1, new IDVariant(BUK_SITUIMPEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPEREPO_SEC_RESCOMGROHEA,"IMPORTO_IMPACC")));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTALESUBIM1, new IDVariant(BUK_SITUIMPEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPEREPO_SEC_RESCOMGROHEA,"SUBIMPEGNATO")));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTALELIQUI1, new IDVariant(BUK_SITUIMPEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPEREPO_SEC_RESCOMGROHEA,"LIQUIDATO")));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTALEMANOR1, new IDVariant(BUK_SITUIMPEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPEREPO_SEC_RESCOMGROHEA,"MAN_ORD")));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_TOTALEDISPO1, new IDVariant(BUK_SITUIMPEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPEREPO_SEC_RESCOMGROHEA,"DISPONIBILITA")));
      BUK_SITUIMPEREPO_SEC_RESCOMGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_DETAIL)
    {
      BUK_SITUIMPEREPO_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_DETARAGISOCI)
    {
      BUK_SITUIMPEREPO_SEC_DETARAGISOCI_OnFormattingSection();
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_DETAIUOUTILI)
    {
      BUK_SITUIMPEREPO_SEC_DETAIUOUTILI_OnFormattingSection();
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_RESCOMGROFOO)
    {
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SITUIMPEREPO_SEC_UNIORGGROFOO)
    {
    }
  }

  private void BUK_SITUIMPEREPO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITUIMPEREPO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA)
    {
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_CPTSSIRVSIPN, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITUIMPEREPO.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITUIMPEREPO.GetTotalPagesNumber())))))))))));
      BUK_SITUIMPEREPO.set_SpanValue(BUK_SITUIMPEREPO_SPAN_SITUAZIMPEG1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Impegni")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITUIMPEREPO_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2)
    {
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, !BUK_SITUIMPEREPO.SectionShowChildren(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA));
    }
    if (ObjID==BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI)
    {
      BUK_SITUIMPEREPO.set_SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, !BUK_SITUIMPEREPO.SectionShowChildren(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA));
    }
  }

  private void BUK_SITUIMPEREPO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITUIMPEREPO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITUIMPEREPO_OnPreview()
  {
  }

  private void BUK_SITUIMPESTAM_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITUIMPESTAM_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITUIMPESTAM_SEC_PROGUOGROHEA)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_RESCOMGROHEA)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_DETARAGISOCI)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_DETAIUOUTILI)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_RESCOMGROFOO)
    {
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALECOMPE1, new IDVariant(((BUK_SITUIMPESTAM.GetReportColumn(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, "CFWRSIIMRECO").equals((new IDVariant(1)), true))?(new IDVariant("Totale Residui")):(new IDVariant("Totale Competenza")))));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTAIMPOIMPA, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_RESCOMGROFOO,"IMPORTO_IMPACC")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALESUBIMP, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_RESCOMGROFOO,"SUBIMPEGNATO")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALELIQUID, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_RESCOMGROFOO,"LIQUIDATO")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALEMANORD, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_RESCOMGROFOO,"MAN_ORD")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALEDISPON, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_RESCOMGROFOO,"DISPONIBILITA")));
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_PROUOGROFOBA)
    {
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_PROUOGROFORE)
    {
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTAIMPORESI, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFORE,"CFWRSIIMIMRE")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPRES, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFORE,"CFWRSIIMSUIR")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALIQURESI, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFORE,"CFWRSIIMLIRE")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTAMANDRESI, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFORE,"CFWRSIIMMARE")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTADISPRESI, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFORE,"CFWRSIIMDIRE")));
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_PROUOGROFOCO)
    {
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTAIMPOCOMP, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFOCO,"CFWRSIIMIMCO")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPCOM, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFOCO,"CFWRSIIMSUIC")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTALIQUCOMP, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFOCO,"CFWRSIIMLICO")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTAMANDCOMP, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFOCO,"CFWRSIIMMACO")));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_TOTADISPCOMP, new IDVariant(BUK_SITUIMPESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUIMPESTAM_SEC_PROUOGROFOCO,"CFWRSIIMDICO")));
    }
    if (SectionID==BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA)
    {
    }
  }

  private void BUK_SITUIMPESTAM_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITUIMPESTAM_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA)
    {
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_CPTSSISVSIPN, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITUIMPESTAM.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITUIMPESTAM.GetTotalPagesNumber())))))))))));
      BUK_SITUIMPESTAM.set_SpanValue(BUK_SITUIMPESTAM_SPAN_SITUAZIMPEGN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Impegni")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI115, IMDBDef7.FLD_PARAMETRI115_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITUIMPESTAM_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITUIMPESTAM_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITUIMPESTAM_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITUIMPESTAM_OnPreview()
  {
    PreviewBook = BKW_SITUIMPESTAM;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITUIMPEREPO.InitMastro(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, "D677DCB1-957D-4F0A-8DB3-02086D71AAD7");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITUIMPEREPO.InitMastroBox(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, BUK_SITUIMPEREPO_RPTBOX_NUMEROPAGIN1, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_NUMEROPAGIN1, "E1E860C8-A9CD-4B25-91C4-44FB7D168D68");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_NUMEROPAGIN1, BUK_SITUIMPEREPO_SPAN_CPTSSIRVSIPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CPTSSIRVSIPN, "5D080B4C-1EE0-414B-98F3-4E33C4252017");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CPTSSIRVSIPN, "CPTSSIRVSIPN");
    BUK_SITUIMPEREPO.InitMastroBox(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, BUK_SITUIMPEREPO_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1000, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_PAGEHEADER1, "11900087-B60C-43FF-8593-9565F121D24B");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_PAGEHEADER1, BUK_SITUIMPEREPO_SPAN_SITUAZIMPEG1, MyGlb.VIS_TITOLOREPORT, 5, 321, 0, 271319425, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_SITUAZIMPEG1, "DDF1A4E9-01A1-4610-9BA6-51614116D026");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_SITUAZIMPEG1, "SITUAZIMPEG1");
    BUK_SITUIMPEREPO.InitMastroBox(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1, "BDE78BAA-352B-4127-9908-733BB7745021");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_SITUIMPEREPO.InitMastroBox(BUK_SITUIMPEREPO_MST_CFWRSIIMBOPA, BUK_SITUIMPEREPO_RPTBOX_PAGEFOOTER1, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_PAGEFOOTER1, "36B92C11-7DE2-49F3-BD34-D36B782F5B36");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_InitQuery() { BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_InitQuery(true, true); }
  private void BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI115.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI115.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2, 1) as CFWRSIIMRECO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
      SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.ESTREMI_IMPACC as ESTREMI_IMPACC, ");
      SQL.append("  A.DATA_IMPACC as DATA_IMPACC, ");
      SQL.append("  A.DETERMINA_PROPOSTA as DETERMINA_PROPOSTA, ");
      SQL.append("  A.OBBLIGATORIO as OBBLIGATORIO, ");
      SQL.append("  A.DESCR_IMPACC as DESCR_IMPACC, ");
      SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
      SQL.append("  A.IMPORTO_IMPACC as IMPORTO_IMPACC, ");
      SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
      SQL.append("  A.LIQUIDATO as LIQUIDATO, ");
      SQL.append("  A.MAN_ORD as MAN_ORD, ");
      SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.IMPORTO_IMPACC) as CFWRSIIMIMRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.IMPORTO_IMPACC, 0) as CFWRSIIMIMCO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.SUBIMPEGNATO) as CFWRSIIMSUIR, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.SUBIMPEGNATO, 0) as CFWRSIIMSUIC, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.LIQUIDATO) as CFWRSIIMLIRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.LIQUIDATO, 0) as CFWRSIIMLICO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.MAN_ORD) as CFWRSIIMMARE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.MAN_ORD, 0) as CFWRSIIMMACO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.DISPONIBILITA) as CFWRSIIMDIRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.DISPONIBILITA, 0) as CFWRSIIMDICO ");
      SQL.append("from ");
      SQL.append("  CF4WEB_WRK_SIT_IMPACC A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_STAMPA = 'I') ");
      SQL.append("order by 1, 3, 4, 7, 8 ");
      BUK_SITUIMPEREPO.SetReportQuery(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "8C383CAE-4A52-44C5-8ED8-4A08C9781BEF");
      if (BUK_SITUIMPEREPO.FindObjByID(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA) != null)
        BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
      if (BUK_SITUIMPEREPO.FindObjByID(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA) != null)
        BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITUIMPEREPO.FindObjByID(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA) != null)
        BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_Init()
  {
    BUK_SITUIMPEREPO.InitReport(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, 196865);
    BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_InitQuery(true, false);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, "37FAFB74-AA0B-4663-9114-AE63300C193D");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, "SITIMPPDFREP");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 45678849, "CFWRSIIMPRUO");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, "69B69B64-16E8-4BD3-BDA6-85EC67F0837D");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, "UNIORGGROHEA");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONU1, 100, 100, 8000, 400, 0, 3, 3, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONU1, "A762C457-DD4F-4A73-BF46-BD446FE1C1DB");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONU1, BUK_SITUIMPEREPO_SPAN_DESCRIZIONU1, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_DESCRIZIONU1, "F46FFDA2-22F8-4DE3-AD3A-F6E5969DA400");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "VOCE_PEG");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, "EDA2287B-B05F-47C7-95EA-D4E5806ADEAD");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, 0, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, null, "tp1.gif");
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, "C3CE4FAE-1CCD-4597-A9C0-76A00C8F54C4");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPR2, "ESPANDCOMPR2");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_CAPITARTHEA1, 600, 0, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_CAPITARTHEA1, "84024BD2-DFF7-477D-B621-85EEA81C5BAD");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_CAPITARTHEA1, "CAPITARTHEA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_CAPITARTHEA1, BUK_SITUIMPEREPO_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_C1, "B08C29C3-87E6-48A6-AF52-E28839CC7069");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_C1, "C1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_VOCEPEG1, 2900, 0, 6100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_VOCEPEG1, "4702EACE-139B-4E30-B491-E139AC394B14");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_VOCEPEG1, BUK_SITUIMPEREPO_SPAN_CWSIVPVSISIR, MyGlb.VIS_INTSENZABORD, 5, 20, 0, 271384705, "", "::VOCE_PEG", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CWSIVPVSISIR, "BC6265A1-F82E-4C15-BC8A-745E62E29531");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CWSIVPVSISIR, "CWSIVPVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, 12000, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, "47F54BEB-D478-4E28-BD1B-223B26F050E0");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, "IMPOIMPAHEA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_IMPOIMPAHEA1, BUK_SITUIMPEREPO_SPAN_IMPORTIMPAC1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_IMPORTIMPAC1, "EF3E18C9-7E4C-4DCD-922D-072C5B07A85A");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, 14800, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, "FD9E097D-EE94-4A92-ACEA-5AFC61EAEC9C");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, "SUBIMPHEADE1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_SUBIMPHEADE1, BUK_SITUIMPEREPO_SPAN_SUBIMPEGNAT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Sub-Impegnato", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_SUBIMPEGNAT1, "D0B6504A-FE35-4833-8B39-A399C60A0C65");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_SUBIMPEGNAT1, "SUBIMPEGNAT1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, 17600, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, "E43253CB-9C29-41FA-B710-A2831B3B6054");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, "LIQUIDHEADE1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_LIQUIDHEADE1, BUK_SITUIMPEREPO_SPAN_LIQUIDATO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Liquidato", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_LIQUIDATO1, "9AA9EA06-C638-4ED1-AA67-BBAC614A014E");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_LIQUIDATO1, "LIQUIDATO1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, 20400, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, "F4A2D38B-4325-416A-A28B-08BBC6550820");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, "MANORDHEADE1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_MANORDHEADE1, BUK_SITUIMPEREPO_SPAN_MANORD1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Mandati", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_MANORD1, "9EECBA19-BB9C-4CC7-99C6-8DEE1948E2C0");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_MANORD1, "MANORD1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, 23200, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, "E0F2EF33-3AEC-4B7E-95F8-1A2C35B945B3");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, "DISPONHEADE1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DISPONHEADE1, BUK_SITUIMPEREPO_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_DISPONIBILI1, "FCA8A515-44C8-4DF4-ABD6-96181C8D55D6");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, 1000, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "CFWRSIIMRECO");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, "8230FBBA-C755-4ECD-8406-335A5D62179E");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, 600, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITUIMPEREPO.SetBoxImage(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, null, "tp1.gif");
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, "6151DFB0-8B4B-43F2-968C-EB0BB8574C35");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTACOMPRESI, 9000, 0, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTACOMPRESI, "01D142DB-CE28-423A-AA7E-76A656A7ADFC");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTACOMPRESI, BUK_SITUIMPEREPO_SPAN_TOTACOMPRESI, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTACOMPRESI, "FEC57B50-98D1-4C9B-A2E1-D819D912E29F");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTAIMPOIMP2, 12000, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTAIMPOIMP2, "9DC25B75-129E-4ED7-927E-E273B402B4F8");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTAIMPOIMP2, "TOTAIMPOIMP2");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTAIMPOIMP2, BUK_SITUIMPEREPO_SPAN_TOTAIMPOIMP1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTAIMPOIMP1, "C5119918-0D36-4DE6-9C83-6A98C9F8219F");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTAIMPOIMP1, "TOTAIMPOIMP1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTALESUBIM2, 14800, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTALESUBIM2, "E1A04B72-301E-4222-A848-B1D713E8780B");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTALESUBIM2, "TOTALESUBIM2");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTALESUBIM2, BUK_SITUIMPEREPO_SPAN_TOTALESUBIM1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTALESUBIM1, "470027B1-1C6D-4D19-96B7-B789C09ED07A");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTALESUBIM1, "TOTALESUBIM1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTALELIQUI2, 17600, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTALELIQUI2, "C756E012-57FB-4676-B83B-DBB78E23C2CC");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTALELIQUI2, "TOTALELIQUI2");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTALELIQUI2, BUK_SITUIMPEREPO_SPAN_TOTALELIQUI1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTALELIQUI1, "A859DD70-2B10-486A-8D03-A5EED364BDA6");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTALELIQUI1, "TOTALELIQUI1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTALEMANOR2, 20400, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTALEMANOR2, "2EBCD44A-47AB-4F74-835D-85BB3A516CF3");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTALEMANOR2, "TOTALEMANOR2");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTALEMANOR2, BUK_SITUIMPEREPO_SPAN_TOTALEMANOR1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTALEMANOR1, "46CC54B0-9132-49B6-915A-DAA850E5BFA1");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTALEMANOR1, "TOTALEMANOR1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_TOTALEDISPO2, 23200, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_TOTALEDISPO2, "28D8692E-0941-4556-ABAD-AA23F435AE82");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_TOTALEDISPO2, "TOTALEDISPO2");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_TOTALEDISPO2, BUK_SITUIMPEREPO_SPAN_TOTALEDISPO1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_TOTALEDISPO1, "4321C868-A3E8-4055-93B5-F8155A9BD4A0");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_TOTALEDISPO1, "TOTALEDISPO1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_ESTRIMPAHEA1, 600, 500, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_ESTRIMPAHEA1, "4213573F-F35F-4704-AA84-CF72DA110A78");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_ESTRIMPAHEA1, "ESTRIMPAHEA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_ESTRIMPAHEA1, BUK_SITUIMPEREPO_SPAN_ESTREMIMPAC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_ESTREMIMPAC1, "281142FE-22BF-4CDB-84B1-0D7F903F34A6");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_DATAIMPAHEA1, 2400, 500, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DATAIMPAHEA1, "2D995E4E-476F-4643-AAA2-24CC5E23AF8D");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DATAIMPAHEA1, "DATAIMPAHEA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DATAIMPAHEA1, BUK_SITUIMPEREPO_SPAN_DATAIMPACC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_DATAIMPACC1, "C1C2FE31-2B90-4075-A77D-2E3D936A2CC2");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_DETEPROPHEA1, 4200, 500, 3200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DETEPROPHEA1, "73914A5C-6D2E-418A-A936-58DA549B8B29");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DETEPROPHEA1, "DETEPROPHEA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DETEPROPHEA1, BUK_SITUIMPEREPO_SPAN_DETERMPROPO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Determina o Proposta", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_DETERMPROPO1, "74B07B4A-D791-4659-A2B3-23A70BD9DA3C");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_DETERMPROPO1, "DETERMPROPO1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_OBBLIGHEADE1, 7500, 500, 500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_OBBLIGHEADE1, "70694D3E-47C7-4B83-9136-6D7FD4D0C0A1");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_OBBLIGHEADE1, "OBBLIGHEADE1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_OBBLIGHEADE1, BUK_SITUIMPEREPO_SPAN_OBBLIGATORI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ob.", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_OBBLIGATORI1, "111CBA66-A471-4B7A-8740-8E9143F8251F");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_OBBLIGATORI1, "OBBLIGATORI1");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONE, 8100, 500, 3800, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONE, "5D6B1AF0-B9A3-4EA3-A6FF-44DDB4155939");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DESCRIZIONE, BUK_SITUIMPEREPO_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_DESCRIZIONE1, "9D2254BA-B8D8-4362-9C08-CBB2036EAA6E");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_DETAIL, "F89F707E-D308-4417-A6E4-D9C29DFB1BD0");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_DETAIL, "DETAIL");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_ESTREMIMPAC1, 600, 100, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_ESTREMIMPAC1, "A79557B1-0952-4099-9D33-BBA4422007A5");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_ESTREMIMPAC1, BUK_SITUIMPEREPO_SPAN_CFWSEIVSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384705, "", "::ESTREMI_IMPACC", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSEIVSISIR, "E627F66C-42B8-4C6B-A80C-4845246FCA84");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSEIVSISIR, "CFWSEIVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_DATAIMPACC1, 2400, 100, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DATAIMPACC1, "EBCFF854-BFE5-473B-AD7B-29AC7CDDC598");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DATAIMPACC1, BUK_SITUIMPEREPO_SPAN_CFWSDIVSISI2, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSDIVSISI2, "2F6BC0E7-0124-473D-B372-66014E9E13FA");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSDIVSISI2, "CFWSDIVSISI2");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_DETERMPROPO1, 4200, 100, 3200, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DETERMPROPO1, "5E36FEBE-E10D-4F27-86D7-A717401B0646");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DETERMPROPO1, "DETERMPROPO1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DETERMPROPO1, BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::DETERMINA_PROPOSTA", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR, "B1DF16A5-2F7C-4C0B-BA18-6E25ED1EC802");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CWSIDPVSISIR, "CWSIDPVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_DESCRIMPACC1, 8100, 100, 3800, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DESCRIMPACC1, "1995BF5A-524E-4A65-B671-45A0A5C0BDE5");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DESCRIMPACC1, "DESCRIMPACC1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DESCRIMPACC1, BUK_SITUIMPEREPO_SPAN_CFWSDIVSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSDIVSISIR, "C4E6F076-11AD-4CB7-8DE0-5C094D793633");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSDIVSISIR, "CFWSDIVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_IMPORTIMPAC1, 12000, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_IMPORTIMPAC1, "35405160-F05E-4250-AF5E-0442BF0729B0");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_IMPORTIMPAC1, BUK_SITUIMPEREPO_SPAN_CFWSIIVSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_IMPACC", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSIIVSISIR, "EC1F4E7D-053E-42F5-A50B-D5CD8B6E7C44");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSIIVSISIR, "CFWSIIVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_SUBIMPEGNAT1, 14800, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_SUBIMPEGNAT1, "A92FD235-1EBC-4CD3-B7D1-68E257AC04F6");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_SUBIMPEGNAT1, "SUBIMPEGNAT1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_SUBIMPEGNAT1, BUK_SITUIMPEREPO_SPAN_CFWSISVSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::SUBIMPEGNATO", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSISVSISIR, "28D743E0-DEF2-4195-96D5-5092A3A0D2EF");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSISVSISIR, "CFWSISVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_LIQUIDATO1, 17600, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_LIQUIDATO1, "50C4CE86-D643-4CC6-8A04-BDE9D732ECC9");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_LIQUIDATO1, "LIQUIDATO1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_LIQUIDATO1, BUK_SITUIMPEREPO_SPAN_CFWSILVSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQUIDATO", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSILVSISIR, "CB438ECB-5305-492A-8A0C-2426B565AB42");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSILVSISIR, "CFWSILVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_MANORD1, 20400, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_MANORD1, "6B079D0A-5760-4C85-8913-770C839E1844");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_MANORD1, "MANORD1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_MANORD1, BUK_SITUIMPEREPO_SPAN_CWSIMOVSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CWSIMOVSISIR, "809CF6BC-4564-4C64-B28F-C53765F71C6C");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CWSIMOVSISIR, "CWSIMOVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_DISPONIBILI1, 23200, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DISPONIBILI1, "242AD99C-EE47-4273-BA55-17FD26664315");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DISPONIBILI1, BUK_SITUIMPEREPO_SPAN_CFWSIDVSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSIDVSISIR, "B973F74A-EC41-4029-A17C-DD38B916638E");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSIDVSISIR, "CFWSIDVSISIR");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIL, BUK_SITUIMPEREPO_RPTBOX_OBBLIGATORI1, 7500, 100, 500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_OBBLIGATORI1, "22B424A4-024B-492A-ABED-848DE14316F6");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_OBBLIGATORI1, "OBBLIGATORI1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_OBBLIGATORI1, BUK_SITUIMPEREPO_SPAN_CFWSIOVSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384961, "", "::OBBLIGATORIO", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CFWSIOVSISIR, "CD4F42B5-2A0F-41EF-9D37-790EC95A1F61");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CFWSIOVSISIR, "CFWSIOVSISIR");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_DETARAGISOCI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_DETARAGISOCI, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_DETARAGISOCI, "D7036C82-B20C-4746-A2CB-0636164763F4");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETARAGISOCI, BUK_SITUIMPEREPO_RPTBOX_RAGIONSOCIA1, 8100, 100, 3800, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_RAGIONSOCIA1, "97EA882A-AFFC-4993-A9EB-1325DE734DAA");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_RAGIONSOCIA1, "RAGIONSOCIA1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_RAGIONSOCIA1, BUK_SITUIMPEREPO_SPAN_CWSIRSVSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CWSIRSVSISIR, "31CFB739-DAC4-416F-8C73-6681C36902CA");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CWSIRSVSISIR, "CWSIRSVSISIR");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, "B8B0D2F5-DA94-473E-B034-E1EF1B386E75");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITUIMPEREPO.InitReportBox(BUK_SITUIMPEREPO_SEC_DETAIUOUTILI, BUK_SITUIMPEREPO_RPTBOX_DESCRUOUTIL1, 8100, 100, 3800, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_RPTBOX_DESCRUOUTIL1, "7756E9FC-E219-41A8-A7C5-7BB7A8CF046B");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_RPTBOX_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_SITUIMPEREPO.InitBoxSpan(BUK_SITUIMPEREPO_RPTBOX_DESCRUOUTIL1, BUK_SITUIMPEREPO_SPAN_CWSIDUUVSIS1, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SPAN_CWSIDUUVSIS1, "4BBC3B93-A32C-48BD-AF47-A85D8F9DF3CE");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SPAN_CWSIDUUVSIS1, "CWSIDUUVSIS1");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_RESCOMGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "CFWRSIIMRECO");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_RESCOMGROFOO, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_RESCOMGROFOO, "D3BF2F5F-B528-4877-BCC3-27FE8438D14E");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "VOCE_PEG");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO, "5BA112AF-BB3A-4DCD-A3C8-6AA3242C71EA");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SITUIMPEREPO.InitSection(BUK_SITUIMPEREPO_RPT_SITIMPPDFREP, BUK_SITUIMPEREPO_SEC_UNIORGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "CFWRSIIMPRUO");
    BUK_SITUIMPEREPO.SetSectionRendersInto(BUK_SITUIMPEREPO_SEC_UNIORGGROFOO, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUIMPEREPO.SetRTCGuid(BUK_SITUIMPEREPO_SEC_UNIORGGROFOO, "0EA69096-9613-44E0-936A-F6D2DAF77226");
    BUK_SITUIMPEREPO.SetObjCode(BUK_SITUIMPEREPO_SEC_UNIORGGROFOO, "UNIORGGROFOO");
    BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
    BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITUIMPEREPO.AddReportGroup(BUK_SITUIMPEREPO_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITUIMPEREPO_RPT_SITIMPPDFREP_InitQuery(false, true);
  }

  private void BUK_SITUIMPEREPO_InitLinks()
  {
    BUK_SITUIMPEREPO.SetBoxNextBox(BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1, BUK_SITUIMPEREPO_RPTBOX_PAGEBODY1);
  }

  private void BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITUIMPESTAM.InitMastro(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, "DE652B5C-CEF3-4791-9953-EB128870FBD3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITUIMPESTAM.InitMastroBox(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, BUK_SITUIMPESTAM_RPTBOX_NUMEROPAGINA, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_NUMEROPAGINA, "BDBB3073-3AD7-4ED8-98CA-4DA60EC2B861");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_NUMEROPAGINA, BUK_SITUIMPESTAM_SPAN_CPTSSISVSIPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CPTSSISVSIPN, "2F1D6877-4EF7-49B3-93D4-3ACFC72F3C7C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CPTSSISVSIPN, "CPTSSISVSIPN");
    BUK_SITUIMPESTAM.InitMastroBox(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, BUK_SITUIMPESTAM_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_PAGEHEADER, "31169DE8-3382-4037-84A6-9378B1529B61");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_PAGEHEADER, BUK_SITUIMPESTAM_SPAN_SITUAZIMPEGN, MyGlb.VIS_TITOLOREPORT, 5, 321, 0, 271319425, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_SITUAZIMPEGN, "F3C0027A-CBB9-45C4-8F29-EEB8D2C67266");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_SITUAZIMPEGN, "SITUAZIMPEGN");
    BUK_SITUIMPESTAM.InitMastroBox(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_PAGEBODY, "E482B11E-ECCA-4692-95CB-09667F4836AD");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SITUIMPESTAM.InitMastroBox(BUK_SITUIMPESTAM_MST_CFWRSIIMBOPA, BUK_SITUIMPESTAM_RPTBOX_PAGEFOOTER, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_PAGEFOOTER, "16A632DA-A18C-4FBF-936B-6981C8D47CBB");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_InitQuery() { BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_InitQuery(true, true); }
  private void BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI115.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI115.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2, 1) as CFWRSIIMRECO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
      SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.ESTREMI_IMPACC as ESTREMI_IMPACC, ");
      SQL.append("  A.DATA_IMPACC as DATA_IMPACC, ");
      SQL.append("  A.DETERMINA_PROPOSTA as DETERMINA_PROPOSTA, ");
      SQL.append("  A.OBBLIGATORIO as OBBLIGATORIO, ");
      SQL.append("  A.DESCR_IMPACC as DESCR_IMPACC, ");
      SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
      SQL.append("  A.IMPORTO_IMPACC as IMPORTO_IMPACC, ");
      SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
      SQL.append("  A.LIQUIDATO as LIQUIDATO, ");
      SQL.append("  A.MAN_ORD as MAN_ORD, ");
      SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.IMPORTO_IMPACC) as CFWRSIIMIMRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.IMPORTO_IMPACC, 0) as CFWRSIIMIMCO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.SUBIMPEGNATO) as CFWRSIIMSUIR, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.SUBIMPEGNATO, 0) as CFWRSIIMSUIC, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.LIQUIDATO) as CFWRSIIMLIRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.LIQUIDATO, 0) as CFWRSIIMLICO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.MAN_ORD) as CFWRSIIMMARE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.MAN_ORD, 0) as CFWRSIIMMACO, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 0, A.DISPONIBILITA) as CFWRSIIMDIRE, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, A.DISPONIBILITA, 0) as CFWRSIIMDICO ");
      SQL.append("from ");
      SQL.append("  CF4WEB_WRK_SIT_IMPACC A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_STAMPA = 'I') ");
      SQL.append("order by 1, 3, 4, 7, 8 ");
      BUK_SITUIMPESTAM.SetReportQuery(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "6C7A7ABF-5472-4C98-9AD4-374AAA754EE6");
      if (BUK_SITUIMPESTAM.FindObjByID(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA) != null)
        BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, "CFWRSIIMPRUO");
      if (BUK_SITUIMPESTAM.FindObjByID(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA) != null)
        BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITUIMPESTAM.FindObjByID(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA) != null)
        BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_Init()
  {
    BUK_SITUIMPESTAM.InitReport(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, 196865);
    BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_InitQuery(true, false);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, "3D8F7346-BBCC-432C-BA53-1F477C995DC2");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, "SITIMPPDFREP");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, 1500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 45678849, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, "176DC5DA-0018-470A-A2F7-98828137BA1E");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, "PROGUOGROHEA");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_DESCRIZIONUO, 100, 200, 27400, 800, 0, 1, 1, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DESCRIZIONUO, "4A7CABBC-5898-48E5-94FF-6C5A37AB7956");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DESCRIZIONUO, BUK_SITUIMPESTAM_SPAN_DESCRIZIONUO, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_DESCRIZIONUO, "F5BF7FEB-BA81-49F4-9F55-3068FCEFE12D");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_CAPITARTHEAD, 0, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_CAPITARTHEAD, "496DCD2C-CDF2-40C4-B580-F015F6BF15F5");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_CAPITARTHEAD, BUK_SITUIMPESTAM_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_C, "173EBC87-89EB-4BDA-B585-1C61F3FDE823");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_C, "C");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_ESTRIMPAHEAD, 2700, 1100, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_ESTRIMPAHEAD, "43CF842D-6027-490D-B80B-ADD0E98A9F5F");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_ESTRIMPAHEAD, "ESTRIMPAHEAD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_ESTRIMPAHEAD, BUK_SITUIMPESTAM_SPAN_ESTREMIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_ESTREMIMPACC, "D5C17F89-0E02-4B19-B463-E931AB76D22D");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_ESTREMIMPACC, "ESTREMIMPACC");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_DATAIMPAHEAD, 4500, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DATAIMPAHEAD, "DDC17C72-BBC4-46A6-A869-63808273B4DE");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DATAIMPAHEAD, "DATAIMPAHEAD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DATAIMPAHEAD, BUK_SITUIMPESTAM_SPAN_DATAIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_DATAIMPACC, "E18413FD-2044-4203-A7E9-768A260E7691");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_DATAIMPACC, "DATAIMPACC");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_DETEPROPHEAD, 6200, 1100, 3200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DETEPROPHEAD, "57939032-DB98-493A-86AD-00A68F01A3E0");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DETEPROPHEAD, "DETEPROPHEAD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DETEPROPHEAD, BUK_SITUIMPESTAM_SPAN_DETERMPROPOS, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Determina o Proposta", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_DETERMPROPOS, "F80F945F-2248-4F56-A94B-4945B358F33E");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_DETERMPROPOS, "DETERMPROPOS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_IMPOIMPAHEAD, 13700, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_IMPOIMPAHEAD, "BB96A5CE-B497-4B15-AA0B-BD171E4A6625");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_IMPOIMPAHEAD, "IMPOIMPAHEAD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_IMPOIMPAHEAD, BUK_SITUIMPESTAM_SPAN_IMPORTIMPACC, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_IMPORTIMPACC, "30F6163F-434B-4D17-9D94-117792062895");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_IMPORTIMPACC, "IMPORTIMPACC");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_SUBIMPHEADER, 16500, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_SUBIMPHEADER, "64FB7214-804D-4F2A-AE16-0E30972AC643");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_SUBIMPHEADER, "SUBIMPHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_SUBIMPHEADER, BUK_SITUIMPESTAM_SPAN_SUBIMPEGNATO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Sub-Impegnato", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_SUBIMPEGNATO, "090B80D4-242A-4E0D-8522-82A61A6565D2");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_LIQUIDHEADER, 19300, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_LIQUIDHEADER, "FFE851CD-9861-4F18-8BC3-8D5E97C58AC2");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_LIQUIDHEADER, BUK_SITUIMPESTAM_SPAN_LIQUIDATO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Liquidato", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_LIQUIDATO, "68BC4EED-7136-4820-83F4-CCB30C5A921B");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_LIQUIDATO, "LIQUIDATO");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_MANORDHEADER, 22100, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_MANORDHEADER, "53C432BE-2BD3-4277-9A90-0174A8B1C80C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_MANORDHEADER, "MANORDHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_MANORDHEADER, BUK_SITUIMPESTAM_SPAN_MANORD, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Mandati", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_MANORD, "7C47C9EB-327A-4328-87E6-FD4B5E233D04");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_MANORD, "MANORD");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_DISPONHEADER, 24900, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DISPONHEADER, "2B9C0D8B-15D4-46B0-8C73-F237CA534FFF");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DISPONHEADER, BUK_SITUIMPESTAM_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_DISPONIBILIT, "B7F492CC-D056-4EBA-9632-966F2C6A1EFB");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_DESCRIHEADER, 10200, 1100, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DESCRIHEADER, "EEF11279-4A1A-4EEE-AF6F-1031B2A4C3D8");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DESCRIHEADER, BUK_SITUIMPESTAM_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_DESCRIZIONE, "CDA2348F-66F6-458C-A00D-16EF8695F28C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, BUK_SITUIMPESTAM_RPTBOX_OBBLIGHEADER, 9500, 1100, 600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_OBBLIGHEADER, "7F6A729D-54E6-4C46-9F88-AF6609FDFF28");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_OBBLIGHEADER, "OBBLIGHEADER");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_OBBLIGHEADER, BUK_SITUIMPESTAM_SPAN_OBBLIGATORIO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ob.", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_OBBLIGATORIO, "36C069A7-2174-4F2C-B9E7-C9CDB64811A9");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124161, "VOCE_PEG");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, "F8738451-1100-4DEC-A1F2-8BB4032F6C41");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMRECO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, "52752991-C791-4B0C-B36C-55A98E34DA99");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_DETAIL, "3287B0FF-EF3A-4D91-BD7C-0EF56BACC9D5");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_DETAIL, "DETAIL");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_CAPITOLOART, 0, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_CAPITOLOART, "34E4548C-D398-42DD-AC74-C5FAA580069A");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_CAPITOLOART, BUK_SITUIMPESTAM_SPAN_CWSIVPVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384961, "", "::VOCE_PEG", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CWSIVPVSISIS, "44D29C63-7C67-4A87-80EF-11367BC09B0E");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CWSIVPVSISIS, "CWSIVPVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_ESTREMIMPACC, 2700, 0, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_ESTREMIMPACC, "85922BBE-3657-4EB0-91B8-67D4A9ACD106");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_ESTREMIMPACC, "ESTREMIMPACC");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_ESTREMIMPACC, BUK_SITUIMPESTAM_SPAN_CFWSEIVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384961, "", "::ESTREMI_IMPACC", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSEIVSISIS, "0AA6E732-3A3D-45DD-AE9D-2F0E109C4854");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSEIVSISIS, "CFWSEIVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_DATAIMPACC, 4500, 0, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DATAIMPACC, "19D4031C-C0D5-49D9-B7F4-BCED7FC30CF3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DATAIMPACC, "DATAIMPACC");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DATAIMPACC, BUK_SITUIMPESTAM_SPAN_CFWSDIVSISI1, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSDIVSISI1, "AFF6DA5F-23D1-4FCE-BBC0-66611D888C97");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSDIVSISI1, "CFWSDIVSISI1");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_DETERMPROPOS, 6200, 0, 3200, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DETERMPROPOS, "E75254BD-2EB1-4510-ACDA-5F8B507A3113");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DETERMPROPOS, "DETERMPROPOS");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DETERMPROPOS, BUK_SITUIMPESTAM_SPAN_CWSIDPVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::DETERMINA_PROPOSTA", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CWSIDPVSISIS, "BC65EFEE-CD0E-40D2-9BD0-03A627D62E75");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CWSIDPVSISIS, "CWSIDPVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_IMPORTIMPACC, 13700, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_IMPORTIMPACC, "F40EFFAC-EB0C-46E2-8494-DADB11A71DA1");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_IMPORTIMPACC, "IMPORTIMPACC");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_IMPORTIMPACC, BUK_SITUIMPESTAM_SPAN_CFWSIIVSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::IMPORTO_IMPACC", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSIIVSISIS, "1793B739-63EC-4FB9-A576-1984D30199F0");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSIIVSISIS, "CFWSIIVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_SUBIMPEGNATO, 16500, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_SUBIMPEGNATO, "425E4932-13CB-4EFE-A4AB-3A8586255015");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_SUBIMPEGNATO, BUK_SITUIMPESTAM_SPAN_CFWSISVSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::SUBIMPEGNATO", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSISVSISIS, "FA08698E-2388-4C70-83E9-F256E39F8A49");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSISVSISIS, "CFWSISVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_LIQUIDATO, 19300, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_LIQUIDATO, "E93BEF3D-7294-49DD-BD51-6925190A73DA");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_LIQUIDATO, "LIQUIDATO");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_LIQUIDATO, BUK_SITUIMPESTAM_SPAN_CFWSILVSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQUIDATO", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSILVSISIS, "07C4FE6D-75A1-424B-94F8-A45E7FE0D274");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSILVSISIS, "CFWSILVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_MANORD, 22100, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_MANORD, "DFDE5CD1-BC7D-46C7-80D2-D4B24156813F");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_MANORD, "MANORD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_MANORD, BUK_SITUIMPESTAM_SPAN_CWSIMOVSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CWSIMOVSISIS, "866F629D-9312-4B4C-AFF6-F0141D88E356");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CWSIMOVSISIS, "CWSIMOVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_DISPONIBILIT, 24900, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DISPONIBILIT, "D0933A65-EB96-487B-B7D9-6EDBC19BF69E");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DISPONIBILIT, BUK_SITUIMPESTAM_SPAN_CFWSIDVSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSIDVSISIS, "843675DF-DE90-40FC-B9FB-DFD3E51A17C0");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSIDVSISIS, "CFWSIDVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_DESCRIMPACC, 10200, 0, 3400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DESCRIMPACC, "F61E0DFF-DBA5-44FB-89A8-95B9D851B018");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DESCRIMPACC, "DESCRIMPACC");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DESCRIMPACC, BUK_SITUIMPESTAM_SPAN_CFWSDIVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSDIVSISIS, "9871D4F3-67B0-4A43-B55C-8DF81F1D66F6");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSDIVSISIS, "CFWSDIVSISIS");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIL, BUK_SITUIMPESTAM_RPTBOX_OBBLIGATORIO, 9500, 0, 600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_OBBLIGATORIO, "42CA673A-C2DF-46FC-B22A-94A4B9064011");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_OBBLIGATORIO, BUK_SITUIMPESTAM_SPAN_CFWSIOVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384961, "", "::OBBLIGATORIO", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CFWSIOVSISIS, "78994C9A-0E46-40FE-BA9C-2DE7B89C9D72");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CFWSIOVSISIS, "CFWSIOVSISIS");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_DETARAGISOCI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_DETARAGISOCI, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_DETARAGISOCI, "EADA0ACE-14C5-4EB4-A24A-C70637D78DD5");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETARAGISOCI, BUK_SITUIMPESTAM_RPTBOX_RAGIONSOCIAL, 10200, 0, 3400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_RAGIONSOCIAL, "A5200AEE-885D-4CB1-9F81-C84BE29856A3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_RAGIONSOCIAL, "RAGIONSOCIAL");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_RAGIONSOCIAL, BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS, "6DB0D7F7-95B7-4BF5-AB0E-F86ACB8B8DB3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CWSIRSVSISIS, "CWSIRSVSISIS");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, "A17F7C92-7EE4-4C95-822A-DDB33209CE0F");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_DETAIUOUTILI, BUK_SITUIMPESTAM_RPTBOX_DESCRUOUTILI, 10200, 0, 3400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_DESCRUOUTILI, "87E31A27-51B7-4B2D-970B-AC138FAA23A7");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_DESCRUOUTILI, BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI, "E5B36B26-6ABC-4725-88A4-F0206D99C0AC");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_CWSIDUUVSISI, "CWSIDUUVSISI");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124161, "CFWRSIIMRECO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, "9782A389-C190-46D8-BA8D-B08BE1E9AF60");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTRESHEACOM, 9100, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTRESHEACOM, "C42138D1-08EE-48F0-A0B1-9019C73E1782");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTRESHEACOM, "TOTRESHEACOM");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTRESHEACOM, BUK_SITUIMPESTAM_SPAN_TOTALECOMPE1, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271319425, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALECOMPE1, "F12587B2-B1AC-4F39-8DC0-C8BC46E709E9");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALECOMPE1, "TOTALECOMPE1");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOIMPA, 13700, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOIMPA, "0BC49342-EC28-456C-8678-132349344A81");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOIMPA, "TOTAIMPOIMPA");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOIMPA, BUK_SITUIMPESTAM_SPAN_TOTAIMPOIMPA, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAIMPOIMPA, "42D3CCB2-B17D-4EF4-B5A1-B60BD3C949B2");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAIMPOIMPA, "TOTAIMPOIMPA");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTALESUBIMP, 16500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALESUBIMP, "F7693268-FCB8-4696-8780-2676D8829A0C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALESUBIMP, "TOTALESUBIMP");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALESUBIMP, BUK_SITUIMPESTAM_SPAN_TOTALESUBIMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALESUBIMP, "A0A935D6-F3C0-4EDD-B380-C30D5FA4E0EF");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALESUBIMP, "TOTALESUBIMP");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTALELIQUID, 19300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALELIQUID, "D9579171-26DD-4B29-893B-7DB28C9D233F");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALELIQUID, "TOTALELIQUID");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALELIQUID, BUK_SITUIMPESTAM_SPAN_TOTALELIQUID, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALELIQUID, "FDE56867-D516-4988-B795-B7807A8D60D5");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALELIQUID, "TOTALELIQUID");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTALEMANORD, 22100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALEMANORD, "CDD0054E-05DE-4A17-BF01-F7EDBFCE3765");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALEMANORD, "TOTALEMANORD");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALEMANORD, BUK_SITUIMPESTAM_SPAN_TOTALEMANORD, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALEMANORD, "8C6EB89D-E63A-4F67-81A1-571132B03888");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALEMANORD, "TOTALEMANORD");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_TOTALEDISPON, 24900, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALEDISPON, "D2D9E43C-E638-4E9F-862D-C2B76BF22021");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALEDISPON, "TOTALEDISPON");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALEDISPON, BUK_SITUIMPESTAM_SPAN_TOTALEDISPON, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALEDISPON, "DB61AEC5-6327-4C6B-885F-405286C2A9DA");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALEDISPON, "TOTALEDISPON");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_RESCOMGROFOO, BUK_SITUIMPESTAM_RPTBOX_BARRARESCOMP, 13700, 0, 13900, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_BARRARESCOMP, "8B50B67B-E29B-47A5-BCBB-73BD75A3E5DA");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_BARRARESCOMP, "BARRARESCOMP");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124161, "VOCE_PEG");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO, "674713F3-0007-41F9-A5E2-DF3354A95F26");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_PROUOGROFOBA, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_PROUOGROFOBA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_PROUOGROFOBA, "0A7E9CDC-57E8-477E-A181-A63272527111");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_PROUOGROFOBA, "PROUOGROFOBA");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOBA, BUK_SITUIMPESTAM_RPTBOX_BARRAUO, 13700, 0, 13900, 100, 0, 1, 1, MyGlb.VIS_BORDINFEDOPP, 983041, 0, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_BARRAUO, "C09CD2E7-9FDF-408D-A9C3-4009A024A808");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_BARRAUO, "BARRAUO");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_PROUOGROFORE, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, "3F1BFD90-3343-445C-99B8-7F978C6D656F");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, "PROUOGROFORE");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTGENRESHEA, 9100, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTGENRESHEA, "98DB50FA-B938-4963-B1E9-AF781128FC8B");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTGENRESHEA, "TOTGENRESHEA");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTGENRESHEA, BUK_SITUIMPESTAM_SPAN_TOTAGENERESI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Residui", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAGENERESI, "6471A92E-C4DC-4585-B1AE-E1DE2B4FD5D2");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAGENERESI, "TOTAGENERESI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTAIMPORESI, 13700, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPORESI, "A431061B-B620-4043-BE67-FECA554D0794");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPORESI, BUK_SITUIMPESTAM_SPAN_TOTAIMPORESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAIMPORESI, "465CF1E2-5783-4393-8470-408A592C60C1");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPRES, 16500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPRES, "F3366CFF-E186-46C5-8BF8-3CCB64AB3A39");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPRES, "TOTSUBIMPRES");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPRES, BUK_SITUIMPESTAM_SPAN_TOTSUBIMPRES, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPRES, "80F5DE83-81A4-41D8-83EC-5424EF2898CA");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPRES, "TOTSUBIMPRES");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTALIQURESI, 19300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALIQURESI, "626BF4E3-71B8-4EE9-8321-9499BE2D077D");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALIQURESI, "TOTALIQURESI");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALIQURESI, BUK_SITUIMPESTAM_SPAN_TOTALIQURESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALIQURESI, "27DA6219-17D8-47D8-8B57-0DB92DD4C197");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALIQURESI, "TOTALIQURESI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTAMANDRESI, 22100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDRESI, "91C1D3CC-FD53-4C32-B4FC-85953489F3CE");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDRESI, BUK_SITUIMPESTAM_SPAN_TOTAMANDRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAMANDRESI, "B5742EBA-99F6-4422-9A81-4BBF73F363D6");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFORE, BUK_SITUIMPESTAM_RPTBOX_TOTADISPRESI, 24900, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTADISPRESI, "8CBF03B2-5196-4E69-B033-CA292DBDF9CA");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTADISPRESI, BUK_SITUIMPESTAM_SPAN_TOTADISPRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTADISPRESI, "23B1489B-505C-4B14-8EB4-81C0DD9E3EA8");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, "78ACAFE1-B8B1-401A-B8CB-54AC2066B050");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, "PROUOGROFOCO");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTGENCOMHEA, 9100, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTGENCOMHEA, "C2A2C44D-78AF-4CD7-9B55-725541575DD3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTGENCOMHEA, "TOTGENCOMHEA");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTGENCOMHEA, BUK_SITUIMPESTAM_SPAN_TOTAGENECOMP, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Competenza", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAGENECOMP, "76199287-55A4-4D3E-B162-31D0939C82B0");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAGENECOMP, "TOTAGENECOMP");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOCOMP, 13700, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOCOMP, "CE94ABDD-63A9-4209-BB46-E812C79307F3");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTAIMPOCOMP, BUK_SITUIMPESTAM_SPAN_TOTAIMPOCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAIMPOCOMP, "F028032D-0D42-4FFA-8F80-8C3A69FFCF4C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPCOM, 16500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPCOM, "DAD7894D-347F-45EE-8AD7-52E67919A083");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPCOM, "TOTSUBIMPCOM");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTSUBIMPCOM, BUK_SITUIMPESTAM_SPAN_TOTSUBIMPCOM, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPCOM, "F3B082C8-5FF0-49EA-9A69-94496D23B790");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTSUBIMPCOM, "TOTSUBIMPCOM");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTALIQUCOMP, 19300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTALIQUCOMP, "2C773730-169B-4DEB-8E07-021CD6BFA249");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTALIQUCOMP, "TOTALIQUCOMP");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTALIQUCOMP, BUK_SITUIMPESTAM_SPAN_TOTALIQUCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTALIQUCOMP, "7CF5F138-7404-442B-B8A5-249A109D14C7");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTALIQUCOMP, "TOTALIQUCOMP");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTAMANDCOMP, 22100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDCOMP, "7CB8D41A-51A7-4343-8253-A96B1F8BFA4C");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTAMANDCOMP, BUK_SITUIMPESTAM_SPAN_TOTAMANDCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTAMANDCOMP, "35701F87-AA44-4D55-80A1-B7C3919770CC");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITUIMPESTAM.InitReportBox(BUK_SITUIMPESTAM_SEC_PROUOGROFOCO, BUK_SITUIMPESTAM_RPTBOX_TOTADISPCOMP, 24900, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_RPTBOX_TOTADISPCOMP, "8102EAE4-BA33-4710-A074-272828ACC6F4");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_RPTBOX_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITUIMPESTAM.InitBoxSpan(BUK_SITUIMPESTAM_RPTBOX_TOTADISPCOMP, BUK_SITUIMPESTAM_SPAN_TOTADISPCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SPAN_TOTADISPCOMP, "6182EC5C-FDB4-4785-ABED-9747AC3929FC");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SPAN_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITUIMPESTAM.InitSection(BUK_SITUIMPESTAM_RPT_SITIMPPDFREP, BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.SetSectionRendersInto(BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
    BUK_SITUIMPESTAM.SetRTCGuid(BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA, "346BC686-5E25-4AA6-9E22-A0C96C268609");
    BUK_SITUIMPESTAM.SetObjCode(BUK_SITUIMPESTAM_SEC_PRUOGRFONUPA, "PRUOGRFONUPA");
    BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_PROGUOGROHEA, "CFWRSIIMPRUO");
    BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITUIMPESTAM.AddReportGroup(BUK_SITUIMPESTAM_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITUIMPESTAM_RPT_SITIMPPDFREP_InitQuery(false, true);
  }

  private void BUK_SITUIMPESTAM_InitLinks()
  {
    BUK_SITUIMPESTAM.SetBoxNextBox(BUK_SITUIMPESTAM_RPTBOX_PAGEBODY, BUK_SITUIMPESTAM_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnFormattingPage(PageID);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnConnecting(DBConn);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITUIMPEREPO) BUK_SITUIMPEREPO_OnPreview();
    if (SrcObj == BKW_SITUIMPESTAM) BUK_SITUIMPESTAM_OnPreview();
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
