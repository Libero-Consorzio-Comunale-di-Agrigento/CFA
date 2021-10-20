// **********************************************
// Visualizzazione Situazione Sub Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzazioneSituazioneSubImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_SITSUBIMPREP;
  OBook BKW_SITSUBIMPREP;
  //
  // Template Pages constants
  private static int BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITSUBIMPREP_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_SITSUBIMPREP_SPAN_CPTSSSIRVSSI = 3;
  private static int BUK_SITSUBIMPREP_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_SITSUBIMPREP_SPAN_SITUASUBIMP1 = 5;
  private static int BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1 = 6;
  private static int BUK_SITSUBIMPREP_RPTBOX_PAGEFOOTER1 = 7;

  //
  // Reports constants
  private static int BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE = 8;
  private static int BUK_SITSUBIMPREP_SEC_UNIORGGROHEA = 9;
  private static int BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONU1 = 10;
  private static int BUK_SITSUBIMPREP_SPAN_DESCRIZIONU1 = 11;
  private static int BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA = 12;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2 = 13;
  private static int BUK_SITSUBIMPREP_RPTBOX_CAPITARTHEA1 = 14;
  private static int BUK_SITSUBIMPREP_SPAN_C1 = 15;
  private static int BUK_SITSUBIMPREP_RPTBOX_VOCEPEG1 = 16;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIVPVSSISS = 17;
  private static int BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1 = 18;
  private static int BUK_SITSUBIMPREP_SPAN_IMPORTIMPAC1 = 19;
  private static int BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1 = 20;
  private static int BUK_SITSUBIMPREP_SPAN_LIQUIDATO1 = 21;
  private static int BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1 = 22;
  private static int BUK_SITSUBIMPREP_SPAN_MANORD1 = 23;
  private static int BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1 = 24;
  private static int BUK_SITSUBIMPREP_SPAN_DISPONIBILI1 = 25;
  private static int BUK_SITSUBIMPREP_SEC_RESCOMGROHEA = 26;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI = 27;
  private static int BUK_SITSUBIMPREP_RPTBOX_TOTACOMPRESI = 28;
  private static int BUK_SITSUBIMPREP_SPAN_TOTACOMPRESI = 29;
  private static int BUK_SITSUBIMPREP_RPTBOX_TOTAIMPOIMP2 = 30;
  private static int BUK_SITSUBIMPREP_SPAN_TOTAIMPOIMP1 = 31;
  private static int BUK_SITSUBIMPREP_RPTBOX_TOTALELIQUI2 = 32;
  private static int BUK_SITSUBIMPREP_SPAN_TOTALELIQUI1 = 33;
  private static int BUK_SITSUBIMPREP_RPTBOX_TOTALEMANOR2 = 34;
  private static int BUK_SITSUBIMPREP_SPAN_TOTALEMANOR1 = 35;
  private static int BUK_SITSUBIMPREP_RPTBOX_TOTALEDISPO2 = 36;
  private static int BUK_SITSUBIMPREP_SPAN_TOTALEDISPO1 = 37;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESTRIMPAHEA1 = 38;
  private static int BUK_SITSUBIMPREP_SPAN_ESTREMIMPAC1 = 39;
  private static int BUK_SITSUBIMPREP_RPTBOX_DATAIMPAHEA1 = 40;
  private static int BUK_SITSUBIMPREP_SPAN_DATAIMPACC1 = 41;
  private static int BUK_SITSUBIMPREP_RPTBOX_DETEPROPHEA1 = 42;
  private static int BUK_SITSUBIMPREP_SPAN_DETERMPROPO1 = 43;
  private static int BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONE = 44;
  private static int BUK_SITSUBIMPREP_SPAN_DESCRIZIONE1 = 45;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESTRSUBIHEA1 = 46;
  private static int BUK_SITSUBIMPREP_SPAN_ESTREMSUBIM1 = 47;
  private static int BUK_SITSUBIMPREP_RPTBOX_OBBLIGHEADE1 = 48;
  private static int BUK_SITSUBIMPREP_SPAN_OBBLIGATORI1 = 49;
  private static int BUK_SITSUBIMPREP_SEC_DETAIL = 50;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESTREMIMPAC1 = 51;
  private static int BUK_SITSUBIMPREP_SPAN_CWSEIVSSISIR = 52;
  private static int BUK_SITSUBIMPREP_RPTBOX_DATAIMPACC1 = 53;
  private static int BUK_SITSUBIMPREP_SPAN_CWSDIVSSISIR = 54;
  private static int BUK_SITSUBIMPREP_RPTBOX_DETERMPROPO1 = 55;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIDPVSSIS1 = 56;
  private static int BUK_SITSUBIMPREP_RPTBOX_IMPORTIMPAC1 = 57;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIIVSSISIR = 58;
  private static int BUK_SITSUBIMPREP_RPTBOX_LIQUIDATO1 = 59;
  private static int BUK_SITSUBIMPREP_SPAN_CWSILVSSISIR = 60;
  private static int BUK_SITSUBIMPREP_RPTBOX_MANORD1 = 61;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIMOVSSIS1 = 62;
  private static int BUK_SITSUBIMPREP_RPTBOX_DISPONIBILI1 = 63;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIDVSSISIR = 64;
  private static int BUK_SITSUBIMPREP_RPTBOX_ESTREMSUBIM1 = 65;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIESVSSIS1 = 66;
  private static int BUK_SITSUBIMPREP_RPTBOX_DESCRIMPACC1 = 67;
  private static int BUK_SITSUBIMPREP_SPAN_CWSDIVSSISS1 = 68;
  private static int BUK_SITSUBIMPREP_RPTBOX_OBBLIGATORI1 = 69;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIOVSSISS1 = 70;
  private static int BUK_SITSUBIMPREP_SEC_DETARAGISOCI = 71;
  private static int BUK_SITSUBIMPREP_RPTBOX_RAGIONSOCIA1 = 72;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIRSVSSIS1 = 73;
  private static int BUK_SITSUBIMPREP_SEC_DETAIUOUTILI = 74;
  private static int BUK_SITSUBIMPREP_RPTBOX_DESCRUOUTIL1 = 75;
  private static int BUK_SITSUBIMPREP_SPAN_CWSIDUUVSSI1 = 76;
  private static int BUK_SITSUBIMPREP_SEC_RESCOMGROFOO = 77;
  private static int BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO = 78;
  private static int BUK_SITSUBIMPREP_SEC_UNIORGGROFOO = 79;

  CIDREObj BUK_SITSUBIMPSTA;
  OBook BKW_SITSUBIMPSTA;
  //
  // Template Pages constants
  private static int BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITSUBIMPSTA_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SITSUBIMPSTA_SPAN_CPTSSSISVSSI = 3;
  private static int BUK_SITSUBIMPSTA_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SITSUBIMPSTA_SPAN_SITUASUBIMPE = 5;
  private static int BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY = 6;
  private static int BUK_SITSUBIMPSTA_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE = 8;
  private static int BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA = 9;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DESCRIZIONUO = 10;
  private static int BUK_SITSUBIMPSTA_SPAN_DESCRIZIONUO = 11;
  private static int BUK_SITSUBIMPSTA_RPTBOX_CAPITARTHEAD = 12;
  private static int BUK_SITSUBIMPSTA_SPAN_C = 13;
  private static int BUK_SITSUBIMPSTA_RPTBOX_ESTRIMPAHEAD = 14;
  private static int BUK_SITSUBIMPSTA_SPAN_ESTREMIMPACC = 15;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DATAIMPAHEAD = 16;
  private static int BUK_SITSUBIMPSTA_SPAN_DATAIMPACC = 17;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DETEPROPHEAD = 18;
  private static int BUK_SITSUBIMPSTA_SPAN_DETERMPROPOS = 19;
  private static int BUK_SITSUBIMPSTA_RPTBOX_OBBLIGHEADER = 20;
  private static int BUK_SITSUBIMPSTA_SPAN_OBBLIGATORIO = 21;
  private static int BUK_SITSUBIMPSTA_RPTBOX_IMPOIMPAHEAD = 22;
  private static int BUK_SITSUBIMPSTA_SPAN_IMPORTIMPACC = 23;
  private static int BUK_SITSUBIMPSTA_RPTBOX_LIQUIDHEADER = 24;
  private static int BUK_SITSUBIMPSTA_SPAN_LIQUIDATO = 25;
  private static int BUK_SITSUBIMPSTA_RPTBOX_MANORDHEADER = 26;
  private static int BUK_SITSUBIMPSTA_SPAN_MANORD = 27;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DISPONHEADER = 28;
  private static int BUK_SITSUBIMPSTA_SPAN_DISPONIBILIT = 29;
  private static int BUK_SITSUBIMPSTA_RPTBOX_ESTRSUBIHEAD = 30;
  private static int BUK_SITSUBIMPSTA_SPAN_ESTREMSUBIMP = 31;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DESCIZHEADER = 32;
  private static int BUK_SITSUBIMPSTA_SPAN_DESCRIZIONE = 33;
  private static int BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA = 34;
  private static int BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA = 35;
  private static int BUK_SITSUBIMPSTA_SEC_DETAIL = 36;
  private static int BUK_SITSUBIMPSTA_RPTBOX_VOCEPEG = 37;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIVPVSSISI = 38;
  private static int BUK_SITSUBIMPSTA_RPTBOX_ESTREMIMPACC = 39;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSEIVSSISIS = 40;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DATAIMPACC = 41;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISIS = 42;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DETERMPROPOS = 43;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIDPVSSISI = 44;
  private static int BUK_SITSUBIMPSTA_RPTBOX_IMPORTIMPACC = 45;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIIVSSISIS = 46;
  private static int BUK_SITSUBIMPSTA_RPTBOX_LIQUIDATO = 47;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSILVSSISIS = 48;
  private static int BUK_SITSUBIMPSTA_RPTBOX_MANORD = 49;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIMOVSSISI = 50;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DISPONIBILIT = 51;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIDVSSISIS = 52;
  private static int BUK_SITSUBIMPSTA_RPTBOX_ESTREMSUBIMP = 53;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIESVSSISS = 54;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DESCRIMPACC = 55;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISSI = 56;
  private static int BUK_SITSUBIMPSTA_RPTBOX_OBBLIGATORIO = 57;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIOVSSISSI = 58;
  private static int BUK_SITSUBIMPSTA_SEC_DETARAGISOCI = 59;
  private static int BUK_SITSUBIMPSTA_RPTBOX_RAGIONSOCIAL = 60;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIRSVSSISI = 61;
  private static int BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI = 62;
  private static int BUK_SITSUBIMPSTA_RPTBOX_DESCRUOUTILI = 63;
  private static int BUK_SITSUBIMPSTA_SPAN_CWSIDUUVSSIS = 64;
  private static int BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO = 65;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTRESCOMHEA = 66;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTARESICOMP = 67;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOIMPA = 68;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAIMPOIMPA = 69;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTALELIQUID = 70;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTALELIQUID = 71;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTALEMANORD = 72;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTALEMANORD = 73;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTALEDISPON = 74;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTALEDISPON = 75;
  private static int BUK_SITSUBIMPSTA_RPTBOX_BARRA1 = 76;
  private static int BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE = 77;
  private static int BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO = 78;
  private static int BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA = 79;
  private static int BUK_SITSUBIMPSTA_RPTBOX_BARRA = 80;
  private static int BUK_SITSUBIMPSTA_SEC_PROUOGROFORE = 81;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTGENRESHEA = 82;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAGENERESI = 83;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPORESI = 84;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAIMPORESI = 85;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTALIQURESI = 86;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTALIQURESI = 87;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDRESI = 88;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAMANDRESI = 89;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTADISPRESI = 90;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTADISPRESI = 91;
  private static int BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO = 92;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTGENCOMHEA = 93;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAGENECOMP = 94;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOCOMP = 95;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAIMPOCOMP = 96;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTALIQUCOMP = 97;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTALIQUCOMP = 98;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDCOMP = 99;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTAMANDCOMP = 100;
  private static int BUK_SITSUBIMPSTA_RPTBOX_TOTADISPCOMP = 101;
  private static int BUK_SITSUBIMPSTA_SPAN_TOTADISPCOMP = 102;
  private static int BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA = 103;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI118(IMDB);
    //
    //
    Init_PQRY_CF4WRKSITIM4(IMDB);
    Init_PQRY_CF4WRKSITIM5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI118(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI118, 5);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI118, "TBL_PARAMETRI118");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARATIPOSTRU,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARAPROUOSTR, "PARAPROUOSTR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARAPROUOSTR,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI118,IMDBDef7.FLD_PARAMETRI118_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI118, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM4, 34);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM4, "PQRY_CF4WRKSITIM4");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ESTREMI_SUBIMP, "ESTREMI_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_ESTREMI_SUBIMP,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_OBBLIGATORIO, "OBBLIGATORIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_OBBLIGATORIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM4,IMDBDef17.PQSL_CF4WRKSITIM4_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM4, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM5, 34);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM5, "PQRY_CF4WRKSITIM5");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ESTREMI_SUBIMP, "ESTREMI_SUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_ESTREMI_SUBIMP,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_OBBLIGATORIO, "OBBLIGATORIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_OBBLIGATORIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM5,IMDBDef17.PQSL_CF4WRKSITIM5_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzazioneSituazioneSubImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzazioneSituazioneSubImpegni()
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
    FormIdx = MyGlb.FRM_VISSITSUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "46F2AC0F-6136-4C9C-ADDE-0187CD8359A4";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1188;
    DesignHeight = 890;
    set_Caption(new IDVariant("Visualizzazione Situazione Sub Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1188;
    Frames[1].Height = 864;
    Frames[1].Caption = "Situazione Sub Impegni Report";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 864;
    BKW_SITSUBIMPREP = new OBook(this);
    BUK_SITSUBIMPREP = new CIDREObj(BKW_SITSUBIMPREP);
    Frames[1].Content = BKW_SITSUBIMPREP;
    BKW_SITSUBIMPREP.Height = 834;
    BKW_SITSUBIMPREP.Width = 1188;
    BKW_SITSUBIMPREP.iGuid = "2DAF83D8-EF6A-416D-A76A-B459D301BC8C";
    BKW_SITSUBIMPREP.Code = "BUK_SITSUBIMPREP";
    BKW_SITSUBIMPREP.BookObj = BUK_SITSUBIMPREP;
    BKW_SITSUBIMPREP.InitDefMasks();
    BUK_SITSUBIMPREP.set_FrIndex(1);
    BUK_SITSUBIMPREP.InitBook(1, 3342593, "Situazione Sub Impegni Report", IMDB, MainFrm.VisualStyleList);
    BUK_SITSUBIMPREP.InitHTML();
    BUK_SITSUBIMPREP.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITSUBIMPREP.SetSize(1188, 834);
    BUK_SITSUBIMPREP.Book.SetMainFrm(MainFrm);
    BUK_SITSUBIMPREP.SetRTCGuid(0, "2DAF83D8-EF6A-416D-A76A-B459D301BC8C");
    BUK_SITSUBIMPREP.SetObjCode(0, "SITSUBIMPREP");
    BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA_Init();
    BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_Init();
    BUK_SITSUBIMPREP_InitLinks();
    BKW_SITSUBIMPSTA = new OBook(this);
    BUK_SITSUBIMPSTA = new CIDREObj(BKW_SITSUBIMPSTA);
    BKW_SITSUBIMPSTA.iGuid = "F9B9CD95-17A3-4EEC-9AF7-544E0422FBF7";
    BKW_SITSUBIMPSTA.Code = "BUK_SITSUBIMPSTA";
    BKW_SITSUBIMPSTA.BookObj = BUK_SITSUBIMPSTA;
    BKW_SITSUBIMPSTA.InitDefMasks();
    BUK_SITSUBIMPSTA.InitBook(1, 3342593, "Situazioni Sub Impegni Stampa", IMDB, MainFrm.VisualStyleList);
    BUK_SITSUBIMPSTA.InitHTML();
    BUK_SITSUBIMPSTA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITSUBIMPSTA.Book.SetMainFrm(MainFrm);
    BUK_SITSUBIMPSTA.SetRTCGuid(0, "F9B9CD95-17A3-4EEC-9AF7-544E0422FBF7");
    BUK_SITSUBIMPSTA.SetObjCode(0, "SITSUBIMPSTA");
    BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA_Init();
    BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_Init();
    BUK_SITSUBIMPSTA_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPACOMPL4+BaseCmdLinIdx)
      {
        ApriStampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUTT9+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUTT9+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI37+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG125+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI37+BaseCmdLinIdx), FormIdx, 1);
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
      BUK_SITSUBIMPREP.UpdateBook();
      // BUK_SITSUBIMPSTA.UpdateBook();
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
    if (Code.equals("BUK_SITSUBIMPREP")) return BUK_SITSUBIMPREP;
    if (Code.equals("BUK_SITSUBIMPSTA")) return BUK_SITSUBIMPSTA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VisualizzazioneSituazioneSubImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzazioneSituazioneSubImpegni.class.getName() : (Glb.ClassWithPackage(VisualizzazioneSituazioneSubImpegni.class) ? VisualizzazioneSituazioneSubImpegni.class.getName().substring(VisualizzazioneSituazioneSubImpegni.class.getPackage().getName().length() + 1) : VisualizzazioneSituazioneSubImpegni.class.getName()));
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
      v_CAPTION = (new IDVariant("Situazione Sub-Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[BUK_SITSUBIMPREP.Book.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARRESCOMENT, 0).equals((new IDVariant("R")), true))
      {
        // 
        // visibilità footer stampa
        // 
        {
          BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
          BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARRESCOMENT, 0).equals((new IDVariant("C")), true))
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, (new IDVariant(0)).booleanValue());
            BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
        else
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
            BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARAMUOUTILI, 0).equals((new IDVariant("SI")), true))
      {
        BUK_SITSUBIMPREP.set_SectionVisible(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
        BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITSUBIMPREP.set_SectionVisible(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
        BUK_SITSUBIMPSTA.set_SectionVisible(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // VOCE PEG Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA_OnFormattingSection()
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
      if (BUK_SITSUBIMPREP.SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA))
      {
        BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tm1.gif")).toString()); 
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, (new IDVariant(-1)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tp1.gif")).toString()); 
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, (new IDVariant(0)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITSUBIMPREP.set_BoxVisible(BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "VOCEPEGGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Residuo Competenza Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITSUBIMPREP_SEC_RESCOMGROHEA_OnFormattingSection()
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
      if ((new IDVariant(BUK_SITSUBIMPREP.SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA))).equals((new IDVariant(0)), true))
      {
        BUK_SITSUBIMPREP.set_SectionHeight(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(5, IDVariant.FLOAT)).dblValue());
        BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_SITSUBIMPREP.set_SectionHeight(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(9, IDVariant.FLOAT)).dblValue());
        BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "ResiduoCompetenzaGroupHeaderBeforeFormattingEvent", _e);
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
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITSUBIMPREP.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "EspandiTutto", _e);
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
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITSUBIMPREP.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "ComprimiTutto", _e);
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
      BUK_SITSUBIMPSTA.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_SITSUBIMPSTA.ReportRefreshQuery(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE);
      BUK_SITSUBIMPSTA.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_SITSUBIMPSTA.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneSubImpegni", "ApriStampaCompleta", _e);
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
  private void BUK_SITSUBIMPREP_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITSUBIMPREP_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITSUBIMPREP_SEC_UNIORGGROHEA)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA)
    {
      BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_RESCOMGROHEA)
    {
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_TOTACOMPRESI, new IDVariant(((BUK_SITSUBIMPREP.GetReportColumn(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, "CFWRSIIMRECO").equals((new IDVariant(2)), true))?(new IDVariant("Totale Competenza")):(new IDVariant("Totale Residui")))));
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_TOTAIMPOIMP1, new IDVariant(BUK_SITSUBIMPREP.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPREP_SEC_RESCOMGROHEA,"IMPORTO_IMPACC")));
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_TOTALELIQUI1, new IDVariant(BUK_SITSUBIMPREP.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPREP_SEC_RESCOMGROHEA,"LIQUIDATO")));
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_TOTALEMANOR1, new IDVariant(BUK_SITSUBIMPREP.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPREP_SEC_RESCOMGROHEA,"MAN_ORD")));
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_TOTALEDISPO1, new IDVariant(BUK_SITSUBIMPREP.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPREP_SEC_RESCOMGROHEA,"DISPONIBILITA")));
      BUK_SITSUBIMPREP_SEC_RESCOMGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_DETARAGISOCI)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_DETAIUOUTILI)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_RESCOMGROFOO)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SITSUBIMPREP_SEC_UNIORGGROFOO)
    {
    }
  }

  private void BUK_SITSUBIMPREP_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITSUBIMPREP_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA)
    {
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_CPTSSSIRVSSI, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITSUBIMPREP.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITSUBIMPREP.GetTotalPagesNumber())))))))))));
      BUK_SITSUBIMPREP.set_SpanValue(BUK_SITSUBIMPREP_SPAN_SITUASUBIMP1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Sub-Impegni")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITSUBIMPREP_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2)
    {
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, !BUK_SITSUBIMPREP.SectionShowChildren(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA));
    }
    if (ObjID==BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI)
    {
      BUK_SITSUBIMPREP.set_SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, !BUK_SITSUBIMPREP.SectionShowChildren(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA));
    }
  }

  private void BUK_SITSUBIMPREP_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITSUBIMPREP_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITSUBIMPREP_OnPreview()
  {
  }

  private void BUK_SITSUBIMPSTA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITSUBIMPSTA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_DETARAGISOCI)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO)
    {
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTARESICOMP, new IDVariant(((BUK_SITSUBIMPSTA.GetReportColumn(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, "CFWRSIIMRECO").equals((new IDVariant(1)), true))?(new IDVariant("Totale Residui")):(new IDVariant("Totale Competenza")))));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOIMPA, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO,"IMPORTO_IMPACC")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTALELIQUID, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO,"LIQUIDATO")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTALEMANORD, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO,"MAN_ORD")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTALEDISPON, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO,"DISPONIBILITA")));
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA)
    {
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_PROUOGROFORE)
    {
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTAIMPORESI, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFORE,"CFWRSIIMIMRE")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTALIQURESI, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFORE,"CFWRSIIMLIRE")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTAMANDRESI, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFORE,"CFWRSIIMMARE")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTADISPRESI, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFORE,"CFWRSIIMDIRE")));
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO)
    {
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOCOMP, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO,"CFWRSIIMIMCO")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTALIQUCOMP, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO,"CFWRSIIMLICO")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTAMANDCOMP, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO,"CFWRSIIMMACO")));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_TOTADISPCOMP, new IDVariant(BUK_SITSUBIMPSTA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO,"CFWRSIIMDICO")));
    }
    if (SectionID==BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA)
    {
    }
  }

  private void BUK_SITSUBIMPSTA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITSUBIMPSTA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA)
    {
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_CPTSSSISVSSI, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITSUBIMPSTA.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITSUBIMPSTA.GetTotalPagesNumber())))))))))));
      BUK_SITSUBIMPSTA.set_SpanValue(BUK_SITSUBIMPSTA_SPAN_SITUASUBIMPE, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Sub-Impegni")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITSUBIMPSTA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITSUBIMPSTA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITSUBIMPSTA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITSUBIMPSTA_OnPreview()
  {
    PreviewBook = BKW_SITSUBIMPSTA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITSUBIMPREP.InitMastro(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, "406E30D8-85BC-469F-BFD4-4FD598B53F88");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITSUBIMPREP.InitMastroBox(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, BUK_SITSUBIMPREP_RPTBOX_NUMEROPAGIN1, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_NUMEROPAGIN1, "5DC5F3AF-3719-4941-9141-1430E65485C4");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_NUMEROPAGIN1, BUK_SITSUBIMPREP_SPAN_CPTSSSIRVSSI, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CPTSSSIRVSSI, "58215EF9-431C-4226-9781-D1A20581DF08");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CPTSSSIRVSSI, "CPTSSSIRVSSI");
    BUK_SITSUBIMPREP.InitMastroBox(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, BUK_SITSUBIMPREP_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1000, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_PAGEHEADER1, "5D4C79AE-85AB-4410-9379-FA3B28CF412E");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_PAGEHEADER1, BUK_SITSUBIMPREP_SPAN_SITUASUBIMP1, MyGlb.VIS_TITOLOREPORT, 5, 325, 0, 271319425, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_SITUASUBIMP1, "2D9C81DD-F76D-43A1-9647-9A5E083D5F55");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_SITUASUBIMP1, "SITUASUBIMP1");
    BUK_SITSUBIMPREP.InitMastroBox(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1, "44157927-5423-4B26-942D-A06B16BB1E87");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_SITSUBIMPREP.InitMastroBox(BUK_SITSUBIMPREP_MST_CFWRSIIMBOPA, BUK_SITSUBIMPREP_RPTBOX_PAGEFOOTER1, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_PAGEFOOTER1, "5D42EEBB-BD5F-4707-806E-F145FC7F9FAD");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_InitQuery() { BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_InitQuery(true, true); }
  private void BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI118.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI118.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2, 1) as CFWRSIIMRECO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
      SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
      SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
      SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.ESTREMI_IMPACC as ESTREMI_IMPACC, ");
      SQL.append("  A.ESTREMI_SUBIMP as ESTREMI_SUBIMP, ");
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
      SQL.append("and   (A.TIPO_STAMPA = 'S') ");
      SQL.append("order by 1, 3, 4, 9, 10 ");
      BUK_SITSUBIMPREP.SetReportQuery(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "1E4B297A-5002-4116-8A42-89AC29013C0C");
      if (BUK_SITSUBIMPREP.FindObjByID(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA) != null)
        BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
      if (BUK_SITSUBIMPREP.FindObjByID(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA) != null)
        BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITSUBIMPREP.FindObjByID(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA) != null)
        BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_Init()
  {
    BUK_SITSUBIMPREP.InitReport(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, 196865);
    BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_InitQuery(true, false);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, "84909620-BB33-49AF-A21A-4890550E8FC9");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, "SITSUBIMPDRE");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 45678849, "CFWRSIIMPRUO");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, "FD938CC1-AD76-4A1A-80A0-879AE85B02A1");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, "UNIORGGROHEA");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONU1, 100, 100, 15500, 400, 0, 1, 3, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONU1, "A212A6E1-85A7-495A-A93C-48FD593C29F4");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONU1, BUK_SITSUBIMPREP_SPAN_DESCRIZIONU1, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_DESCRIZIONU1, "3D8C8AC9-E0B1-4BD5-AA07-95E397C1E290");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "VOCE_PEG");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, "37A768BE-98CB-4421-ACD0-8B57D83C5247");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, 0, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, null, "tp1.gif");
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, "2109878A-AF8E-4475-A4A9-6D1BD9514205");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPR2, "ESPANDCOMPR2");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_CAPITARTHEA1, 600, 0, 2100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_CAPITARTHEA1, "89A2B07B-5814-4B2B-9979-9ACBDB548F2C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_CAPITARTHEA1, "CAPITARTHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_CAPITARTHEA1, BUK_SITSUBIMPREP_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_C1, "8E77F72B-2574-4A00-81EE-9C34D67C84C7");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_C1, "C1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_VOCEPEG1, 2800, 0, 9000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_VOCEPEG1, "F8F65133-A195-411A-8128-A6A55B695B2E");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_VOCEPEG1, BUK_SITSUBIMPREP_SPAN_CWSIVPVSSISS, MyGlb.VIS_INTSENZABORD, 5, 20, 0, 271384705, "", "::VOCE_PEG", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIVPVSSISS, "21118CBC-6052-480E-A047-A556F2DA81AC");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIVPVSSISS, "CWSIVPVSSISS");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, 15600, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, "7CC1A67F-E6DE-4B90-88E0-5DC6B101E869");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, "IMPOIMPAHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_IMPOIMPAHEA1, BUK_SITSUBIMPREP_SPAN_IMPORTIMPAC1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_IMPORTIMPAC1, "CCA0C8D4-1403-4792-88DD-E2C412BFF552");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, 18400, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, "81200FBE-8861-46C1-B68A-22A97899DAF8");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, "LIQUIDHEADE1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_LIQUIDHEADE1, BUK_SITSUBIMPREP_SPAN_LIQUIDATO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Liquidato", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_LIQUIDATO1, "1CF8ED3E-FB6D-4BA7-881B-6E08AD6510E4");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_LIQUIDATO1, "LIQUIDATO1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, 21200, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, "47AAA27E-ECD2-4C4E-9E71-4DBD797E9034");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, "MANORDHEADE1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_MANORDHEADE1, BUK_SITSUBIMPREP_SPAN_MANORD1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Mandati", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_MANORD1, "2F72490A-2B70-433C-9C2A-D76BCEE12864");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_MANORD1, "MANORD1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, 24000, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, "0D7420E5-71AB-479E-A999-2E381D8D3795");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, "DISPONHEADE1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DISPONHEADE1, BUK_SITSUBIMPREP_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_DISPONIBILI1, "B88982A3-D222-418E-8A92-915064A8019F");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, 1000, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "CFWRSIIMRECO");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, "A8BF8273-A51A-466F-BCDB-6136ED850DA8");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, 600, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITSUBIMPREP.SetBoxImage(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, null, "tp1.gif");
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, "4163AAF5-D99D-4E26-829E-F149C548EBF9");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_TOTACOMPRESI, 12600, 0, 2900, 400, 0, 1, 3, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_TOTACOMPRESI, "E444383B-4F60-4AE3-9A30-E37AFDC08736");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_TOTACOMPRESI, BUK_SITSUBIMPREP_SPAN_TOTACOMPRESI, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271319169, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_TOTACOMPRESI, "0824E37E-FDAD-4248-BF28-37AB00C240E5");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_TOTAIMPOIMP2, 15600, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_TOTAIMPOIMP2, "7DD49369-2EA3-4DC3-AF77-B24F1E384DE0");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_TOTAIMPOIMP2, "TOTAIMPOIMP2");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_TOTAIMPOIMP2, BUK_SITSUBIMPREP_SPAN_TOTAIMPOIMP1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_TOTAIMPOIMP1, "E7A43B28-3D81-4C3A-8562-090712C2CBF9");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_TOTAIMPOIMP1, "TOTAIMPOIMP1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_TOTALELIQUI2, 18400, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_TOTALELIQUI2, "D2BBD73B-7037-4E6F-94A5-04824800D234");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_TOTALELIQUI2, "TOTALELIQUI2");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_TOTALELIQUI2, BUK_SITSUBIMPREP_SPAN_TOTALELIQUI1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_TOTALELIQUI1, "E26BC187-D49E-4F4D-995F-A8A51FB2F303");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_TOTALELIQUI1, "TOTALELIQUI1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_TOTALEMANOR2, 21200, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_TOTALEMANOR2, "FF7236DC-8181-4A07-92F2-AEA3F7C82B6C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_TOTALEMANOR2, "TOTALEMANOR2");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_TOTALEMANOR2, BUK_SITSUBIMPREP_SPAN_TOTALEMANOR1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_TOTALEMANOR1, "35ABA315-8969-4B53-8062-E3E63C481D4B");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_TOTALEMANOR1, "TOTALEMANOR1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_TOTALEDISPO2, 24000, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_TOTALEDISPO2, "E058AC2A-0BF7-4064-BF2C-E102625AA517");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_TOTALEDISPO2, "TOTALEDISPO2");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_TOTALEDISPO2, BUK_SITSUBIMPREP_SPAN_TOTALEDISPO1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_TOTALEDISPO1, "737168A4-44DD-4C9F-B6A7-CC5C1C9525C6");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_TOTALEDISPO1, "TOTALEDISPO1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_ESTRIMPAHEA1, 600, 500, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESTRIMPAHEA1, "6683408F-5D15-4D9E-8985-5CE725C7DDAE");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESTRIMPAHEA1, "ESTRIMPAHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_ESTRIMPAHEA1, BUK_SITSUBIMPREP_SPAN_ESTREMIMPAC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_ESTREMIMPAC1, "CA7D2D3B-2662-4C98-8899-E33B4BCC9E63");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_DATAIMPAHEA1, 4500, 500, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DATAIMPAHEA1, "C01B4E99-CD6F-40A9-90FC-050F201C6CFB");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DATAIMPAHEA1, "DATAIMPAHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DATAIMPAHEA1, BUK_SITSUBIMPREP_SPAN_DATAIMPACC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_DATAIMPACC1, "CA772FC2-AC97-474E-A65D-EAF07A0910F3");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_DETEPROPHEA1, 6300, 500, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DETEPROPHEA1, "E19FEBC5-261A-4124-94C1-AADAB0450F3D");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DETEPROPHEA1, "DETEPROPHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DETEPROPHEA1, BUK_SITSUBIMPREP_SPAN_DETERMPROPO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Determina o Proposta", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_DETERMPROPO1, "53CDBAE8-0B75-45CD-8EF8-8E9A335F333C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_DETERMPROPO1, "DETERMPROPO1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONE, 10400, 500, 5100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONE, "EFC9B2D0-0723-4135-810B-04987FE0E4AD");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DESCRIZIONE, BUK_SITSUBIMPREP_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_DESCRIZIONE1, "2CBC4B77-0E8F-439A-A0FA-8850A9104793");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_ESTRSUBIHEA1, 2400, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESTRSUBIHEA1, "8AE3DEB4-BECE-4464-A6F2-C5CBDB9FA1CC");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESTRSUBIHEA1, "ESTRSUBIHEA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_ESTRSUBIHEA1, BUK_SITSUBIMPREP_SPAN_ESTREMSUBIM1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sub Impegno", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_ESTREMSUBIM1, "941BF53B-A5EE-42E4-ABEF-0131E1C88771");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_ESTREMSUBIM1, "ESTREMSUBIM1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, BUK_SITSUBIMPREP_RPTBOX_OBBLIGHEADE1, 9700, 500, 600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_OBBLIGHEADE1, "D1DB5780-696F-42DB-AC43-BAAE2599CAEF");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_OBBLIGHEADE1, "OBBLIGHEADE1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_OBBLIGHEADE1, BUK_SITSUBIMPREP_SPAN_OBBLIGATORI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ob.", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_OBBLIGATORI1, "797B8BE5-E3F5-44D3-9522-1674DD130FD2");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_OBBLIGATORI1, "OBBLIGATORI1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_DETAIL, "60CC2951-81CE-476C-9AD1-962D6CDBAB40");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_DETAIL, "DETAIL");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_ESTREMIMPAC1, 600, 100, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESTREMIMPAC1, "D1AF3358-76B2-4AD6-97A6-376B420646AE");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_ESTREMIMPAC1, BUK_SITSUBIMPREP_SPAN_CWSEIVSSISIR, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384705, "", "::ESTREMI_IMPACC", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSEIVSSISIR, "34823249-68AE-4510-B007-8C7889BCBDC7");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSEIVSSISIR, "CWSEIVSSISIR");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_DATAIMPACC1, 4500, 100, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DATAIMPACC1, "38512016-D776-4C53-BE43-63100222113D");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DATAIMPACC1, BUK_SITSUBIMPREP_SPAN_CWSDIVSSISIR, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSDIVSSISIR, "09D1EF46-B58A-4693-A775-475AFA09666C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSDIVSSISIR, "CWSDIVSSISIR");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_DETERMPROPO1, 6300, 100, 3300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DETERMPROPO1, "BC32EAF6-A72B-4144-A67D-78BEB2D4A5F2");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DETERMPROPO1, "DETERMPROPO1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DETERMPROPO1, BUK_SITSUBIMPREP_SPAN_CWSIDPVSSIS1, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::DETERMINA_PROPOSTA", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIDPVSSIS1, "D99686CD-2BA3-45C7-87EC-705589364208");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIDPVSSIS1, "CWSIDPVSSIS1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_IMPORTIMPAC1, 15600, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_IMPORTIMPAC1, "3E90A595-C523-435F-A384-8D62A2130DA5");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_IMPORTIMPAC1, BUK_SITSUBIMPREP_SPAN_CWSIIVSSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_IMPACC", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIIVSSISIR, "68BF8FC7-EDC6-405F-9AD4-FD160360BA7C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIIVSSISIR, "CWSIIVSSISIR");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_LIQUIDATO1, 18400, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_LIQUIDATO1, "DBD24230-8C5A-4DB8-90C7-A37DCB6BCEC6");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_LIQUIDATO1, "LIQUIDATO1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_LIQUIDATO1, BUK_SITSUBIMPREP_SPAN_CWSILVSSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQUIDATO", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSILVSSISIR, "20F05D2F-ADE4-4C81-936C-FC4F02660F66");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSILVSSISIR, "CWSILVSSISIR");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_MANORD1, 21200, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_MANORD1, "B7345650-1DF3-4CFD-B54F-7BB78931EE24");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_MANORD1, "MANORD1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_MANORD1, BUK_SITSUBIMPREP_SPAN_CWSIMOVSSIS1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIMOVSSIS1, "A1E2F689-CDF2-452A-BA23-536D6B0759E2");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIMOVSSIS1, "CWSIMOVSSIS1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_DISPONIBILI1, 24000, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DISPONIBILI1, "065DA8BD-6398-4671-9CA6-C41E350ABE48");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DISPONIBILI1, BUK_SITSUBIMPREP_SPAN_CWSIDVSSISIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIDVSSISIR, "896BB5DE-9DA7-4338-A154-00AC8874D3B3");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIDVSSISIR, "CWSIDVSSISIR");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_ESTREMSUBIM1, 2400, 100, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_ESTREMSUBIM1, "2DDB8A16-31D8-48DD-901F-B967D056BD70");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_ESTREMSUBIM1, "ESTREMSUBIM1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_ESTREMSUBIM1, BUK_SITSUBIMPREP_SPAN_CWSIESVSSIS1, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384705, "", "::ESTREMI_SUBIMP", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIESVSSIS1, "6E8290C9-7E52-4BC8-893F-ECF1236C5874");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIESVSSIS1, "CWSIESVSSIS1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_DESCRIMPACC1, 10400, 100, 5100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DESCRIMPACC1, "0C273264-A1F1-49B7-9F96-9DF93C6057C0");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DESCRIMPACC1, "DESCRIMPACC1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DESCRIMPACC1, BUK_SITSUBIMPREP_SPAN_CWSDIVSSISS1, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSDIVSSISS1, "0DDEB6B3-5B65-49E8-8BF7-4E7ECB34D795");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSDIVSSISS1, "CWSDIVSSISS1");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIL, BUK_SITSUBIMPREP_RPTBOX_OBBLIGATORI1, 9700, 100, 600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_OBBLIGATORI1, "ABDBF602-4E8B-48AD-914F-65A24A9F666E");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_OBBLIGATORI1, "OBBLIGATORI1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_OBBLIGATORI1, BUK_SITSUBIMPREP_SPAN_CWSIOVSSISS1, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384961, "", "::OBBLIGATORIO", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIOVSSISS1, "F4760D8D-3C9A-48C0-B049-9206A540F940");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIOVSSISS1, "CWSIOVSSISS1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_DETARAGISOCI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_DETARAGISOCI, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_DETARAGISOCI, "3A2B2F71-E627-4845-BF91-313ADA7C9938");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETARAGISOCI, BUK_SITSUBIMPREP_RPTBOX_RAGIONSOCIA1, 10400, 100, 5100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_RAGIONSOCIA1, "63A97E64-BAD9-48DA-AB4A-3890FB37B791");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_RAGIONSOCIA1, "RAGIONSOCIA1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_RAGIONSOCIA1, BUK_SITSUBIMPREP_SPAN_CWSIRSVSSIS1, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIRSVSSIS1, "312088FC-EB11-4DEC-BD02-07D271350967");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIRSVSSIS1, "CWSIRSVSSIS1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, "8D67AD6B-E388-4095-A1F4-7EA8F0CB2994");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITSUBIMPREP.InitReportBox(BUK_SITSUBIMPREP_SEC_DETAIUOUTILI, BUK_SITSUBIMPREP_RPTBOX_DESCRUOUTIL1, 10400, 100, 5100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_RPTBOX_DESCRUOUTIL1, "78BEADD6-69A9-48B2-9D96-C1720809DB2D");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_RPTBOX_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_SITSUBIMPREP.InitBoxSpan(BUK_SITSUBIMPREP_RPTBOX_DESCRUOUTIL1, BUK_SITSUBIMPREP_SPAN_CWSIDUUVSSI1, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SPAN_CWSIDUUVSSI1, "77E3D691-DA60-4010-A47C-54B5B135E8D4");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SPAN_CWSIDUUVSSI1, "CWSIDUUVSSI1");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_RESCOMGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "CFWRSIIMRECO");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_RESCOMGROFOO, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_RESCOMGROFOO, "7F3F115D-6A3E-493E-922F-D216611851D5");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "VOCE_PEG");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO, "C29D0634-7AC2-4C37-9107-05B5B77BFA2C");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SITSUBIMPREP.InitSection(BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE, BUK_SITSUBIMPREP_SEC_UNIORGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 11075841, "CFWRSIIMPRUO");
    BUK_SITSUBIMPREP.SetSectionRendersInto(BUK_SITSUBIMPREP_SEC_UNIORGGROFOO, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
    BUK_SITSUBIMPREP.SetRTCGuid(BUK_SITSUBIMPREP_SEC_UNIORGGROFOO, "B6BA8AF9-8F3A-4901-AF44-72DCD59809E1");
    BUK_SITSUBIMPREP.SetObjCode(BUK_SITSUBIMPREP_SEC_UNIORGGROFOO, "UNIORGGROFOO");
    BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
    BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITSUBIMPREP.AddReportGroup(BUK_SITSUBIMPREP_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITSUBIMPREP_RPT_SITSUBIMPDRE_InitQuery(false, true);
  }

  private void BUK_SITSUBIMPREP_InitLinks()
  {
    BUK_SITSUBIMPREP.SetBoxNextBox(BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1, BUK_SITSUBIMPREP_RPTBOX_PAGEBODY1);
  }

  private void BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITSUBIMPSTA.InitMastro(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, "FF8FD5DA-7E7A-4EC8-B5BB-3BEA319A6358");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITSUBIMPSTA.InitMastroBox(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, BUK_SITSUBIMPSTA_RPTBOX_NUMEROPAGINA, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_NUMEROPAGINA, "ACD941CC-6AA5-497A-A6C0-1ECE897257D5");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_NUMEROPAGINA, BUK_SITSUBIMPSTA_SPAN_CPTSSSISVSSI, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CPTSSSISVSSI, "C22C1320-5A96-492E-8E0B-C40772C5DC1C");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CPTSSSISVSSI, "CPTSSSISVSSI");
    BUK_SITSUBIMPSTA.InitMastroBox(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, BUK_SITSUBIMPSTA_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_PAGEHEADER, "9930A20B-8DAB-4D17-B75A-5FFAE6C66CAA");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_PAGEHEADER, BUK_SITSUBIMPSTA_SPAN_SITUASUBIMPE, MyGlb.VIS_TITOLOREPORT, 5, 325, 0, 271319425, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_SITUASUBIMPE, "BA8C33D7-BAFD-4338-8298-FBCBE0D30EBB");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_SITUASUBIMPE, "SITUASUBIMPE");
    BUK_SITSUBIMPSTA.InitMastroBox(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY, "BB96303B-5826-4F68-A327-277B852C2294");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SITSUBIMPSTA.InitMastroBox(BUK_SITSUBIMPSTA_MST_CFWRSIIMBOPA, BUK_SITSUBIMPSTA_RPTBOX_PAGEFOOTER, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_PAGEFOOTER, "21A8586D-B8DB-4A70-BA71-32BA649523F1");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_InitQuery() { BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_InitQuery(true, true); }
  private void BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI118.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI118.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  DECODE(A.ANNO_IMPACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 2, 1) as CFWRSIIMRECO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
      SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
      SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
      SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.ESTREMI_IMPACC as ESTREMI_IMPACC, ");
      SQL.append("  A.ESTREMI_SUBIMP as ESTREMI_SUBIMP, ");
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
      SQL.append("and   (A.TIPO_STAMPA = 'S') ");
      SQL.append("order by 1, 3, 4, 9, 10 ");
      BUK_SITSUBIMPSTA.SetReportQuery(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "6551B2FF-2A63-4562-AEC4-49358C3C9384");
      if (BUK_SITSUBIMPSTA.FindObjByID(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA) != null)
        BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, "CFWRSIIMPRUO");
      if (BUK_SITSUBIMPSTA.FindObjByID(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA) != null)
        BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITSUBIMPSTA.FindObjByID(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA) != null)
        BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_Init()
  {
    BUK_SITSUBIMPSTA.InitReport(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, 196865);
    BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_InitQuery(true, false);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, "00105C40-FB0F-481C-AD01-B93E26470D42");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, "SITSUBIMPDRE");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, 1600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 43581697, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, "63767B34-2637-48A9-B7D3-4F38E30E1661");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, "PROGUOGROHEA");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_DESCRIZIONUO, 100, 200, 27400, 800, 0, 1, 1, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DESCRIZIONUO, "E730AFFD-383F-4A7C-A78E-1A8E1F0DE15F");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DESCRIZIONUO, BUK_SITSUBIMPSTA_SPAN_DESCRIZIONUO, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_DESCRIZIONUO, "A9187359-6298-423B-AC15-D07DCBA56AAF");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_CAPITARTHEAD, 0, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_CAPITARTHEAD, "6E06993A-2018-4CC9-9E63-B60F6C38621E");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_CAPITARTHEAD, BUK_SITSUBIMPSTA_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_C, "DA20FC85-82DD-4140-BE65-0A1EECA1AD0E");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_C, "C");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_ESTRIMPAHEAD, 2700, 1100, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_ESTRIMPAHEAD, "49785529-7D5D-4FBA-B06C-33B51F19F7D9");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_ESTRIMPAHEAD, "ESTRIMPAHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_ESTRIMPAHEAD, BUK_SITSUBIMPSTA_SPAN_ESTREMIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_ESTREMIMPACC, "2087B8FB-4353-42B2-9980-56A1198D464D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_ESTREMIMPACC, "ESTREMIMPACC");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_DATAIMPAHEAD, 6600, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPAHEAD, "E6324921-DB1E-4811-BE32-81B7593840B0");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPAHEAD, "DATAIMPAHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPAHEAD, BUK_SITSUBIMPSTA_SPAN_DATAIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_DATAIMPACC, "92C81181-E022-46BA-B633-C00AFF12CFF1");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_DATAIMPACC, "DATAIMPACC");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_DETEPROPHEAD, 8300, 1100, 3200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DETEPROPHEAD, "49AF5A58-4C20-4C54-ADC2-A86AF9626E2E");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DETEPROPHEAD, "DETEPROPHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DETEPROPHEAD, BUK_SITSUBIMPSTA_SPAN_DETERMPROPOS, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Determina o Proposta", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_DETERMPROPOS, "75CB7FC1-1103-43ED-8C6F-29012B116802");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_DETERMPROPOS, "DETERMPROPOS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_OBBLIGHEADER, 11600, 1100, 600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGHEADER, "E0C9820B-EBE9-41A9-97A0-3962E3BC9D4D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGHEADER, "OBBLIGHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGHEADER, BUK_SITSUBIMPSTA_SPAN_OBBLIGATORIO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ob.", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_OBBLIGATORIO, "C64AB810-A9B6-41A7-ACC2-5A489240142C");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_IMPOIMPAHEAD, 16800, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_IMPOIMPAHEAD, "AC0FA06E-C559-4909-BA5B-70B5CC669D06");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_IMPOIMPAHEAD, "IMPOIMPAHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_IMPOIMPAHEAD, BUK_SITSUBIMPSTA_SPAN_IMPORTIMPACC, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_IMPORTIMPACC, "F564DDC5-AEA1-4179-BE85-1EF6E6EF3D5C");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_IMPORTIMPACC, "IMPORTIMPACC");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_LIQUIDHEADER, 19500, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDHEADER, "BB9401C9-9146-4087-B397-F34DAD5C8743");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDHEADER, BUK_SITSUBIMPSTA_SPAN_LIQUIDATO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Liquidato", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_LIQUIDATO, "1E9E3878-6511-405E-A89F-76E93E942029");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_LIQUIDATO, "LIQUIDATO");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_MANORDHEADER, 22200, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_MANORDHEADER, "C958C4F5-A790-4143-89D7-DE59961F96D6");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_MANORDHEADER, "MANORDHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_MANORDHEADER, BUK_SITSUBIMPSTA_SPAN_MANORD, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Mandati", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_MANORD, "71415AD9-5A3D-4465-A5A1-9C09DF9DD5DB");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_MANORD, "MANORD");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_DISPONHEADER, 24900, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DISPONHEADER, "7B004947-4F99-4515-9DE0-52009CFC8BBA");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DISPONHEADER, BUK_SITSUBIMPSTA_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_DISPONIBILIT, "B9F10EA6-7ECC-42B5-BB55-5E36039F909F");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_ESTRSUBIHEAD, 4500, 1100, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_ESTRSUBIHEAD, "BE6E721C-6850-4550-8BB5-6FCD44319558");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_ESTRSUBIHEAD, "ESTRSUBIHEAD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_ESTRSUBIHEAD, BUK_SITSUBIMPSTA_SPAN_ESTREMSUBIMP, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sub Impegno", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_ESTREMSUBIMP, "A5C53A17-5751-4135-8F89-E9BA7A1A1FF0");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_ESTREMSUBIMP, "ESTREMSUBIMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, BUK_SITSUBIMPSTA_RPTBOX_DESCIZHEADER, 12300, 1100, 4400, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DESCIZHEADER, "0F172402-F6A2-4C91-9503-037E01EEEE8D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DESCIZHEADER, "DESCIZHEADER");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DESCIZHEADER, BUK_SITSUBIMPSTA_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_DESCRIZIONE, "CF1080C4-4EB3-41CC-824F-7D03B38F40B0");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124161, "VOCE_PEG");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, "3954EF47-8F1B-4147-AD1C-1F6668D60E2B");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMRECO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, "F64C1CD2-5380-4374-824C-370993C426AD");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_DETAIL, "64303AD7-4A1C-4676-BA70-C17E847B74AE");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_DETAIL, "DETAIL");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_VOCEPEG, 0, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_VOCEPEG, "2CCD7B41-D877-4DFA-BED6-36424579F909");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_VOCEPEG, BUK_SITSUBIMPSTA_SPAN_CWSIVPVSSISI, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384961, "", "::VOCE_PEG", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIVPVSSISI, "01C67BC5-60DE-455F-A02B-977896AD2800");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIVPVSSISI, "CWSIVPVSSISI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_ESTREMIMPACC, 2700, 0, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_ESTREMIMPACC, "92815DE5-4472-4F38-AD17-8BB4E1E308EF");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_ESTREMIMPACC, "ESTREMIMPACC");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_ESTREMIMPACC, BUK_SITSUBIMPSTA_SPAN_CWSEIVSSISIS, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384961, "", "::ESTREMI_IMPACC", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSEIVSSISIS, "FF2CC4FC-D242-45F2-BB82-7A5B77A508A5");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSEIVSSISIS, "CWSEIVSSISIS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_DATAIMPACC, 6600, 0, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPACC, "7CEE6CA5-8151-4891-8040-B336268118E4");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPACC, "DATAIMPACC");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DATAIMPACC, BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISIS, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISIS, "59140F1B-4241-4C75-9379-8A64FFF9A909");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISIS, "CWSDIVSSISIS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_DETERMPROPOS, 8300, 0, 3200, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DETERMPROPOS, "B37F390D-A7C5-4D39-9CC4-FF99A27A54ED");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DETERMPROPOS, "DETERMPROPOS");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DETERMPROPOS, BUK_SITSUBIMPSTA_SPAN_CWSIDPVSSISI, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::DETERMINA_PROPOSTA", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIDPVSSISI, "45E58757-3165-4976-855B-B1D687ABDC96");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIDPVSSISI, "CWSIDPVSSISI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_IMPORTIMPACC, 16800, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_IMPORTIMPACC, "89F0DA0B-F1A8-49EA-B83A-83940BD01FC8");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_IMPORTIMPACC, "IMPORTIMPACC");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_IMPORTIMPACC, BUK_SITSUBIMPSTA_SPAN_CWSIIVSSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::IMPORTO_IMPACC", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIIVSSISIS, "B02DC34E-CFEB-4368-A2FC-7AFA416FA257");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIIVSSISIS, "CWSIIVSSISIS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_LIQUIDATO, 19500, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDATO, "FE422735-78BD-4788-A64F-541E74F6BC1D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDATO, "LIQUIDATO");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_LIQUIDATO, BUK_SITSUBIMPSTA_SPAN_CWSILVSSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQUIDATO", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSILVSSISIS, "CD12E3CC-B0AF-4911-B9F8-A0B7A667DE48");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSILVSSISIS, "CWSILVSSISIS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_MANORD, 22200, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_MANORD, "F0BFA602-CFEC-401A-9904-B6F983D4FB4D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_MANORD, "MANORD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_MANORD, BUK_SITSUBIMPSTA_SPAN_CWSIMOVSSISI, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIMOVSSISI, "EFE94BD3-B91D-44A0-B092-D08D01C09934");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIMOVSSISI, "CWSIMOVSSISI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_DISPONIBILIT, 24900, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DISPONIBILIT, "A9F3AC95-8812-4D92-8007-B9A53D847210");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DISPONIBILIT, BUK_SITSUBIMPSTA_SPAN_CWSIDVSSISIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIDVSSISIS, "49528A14-73B7-4920-97D1-3727424B5040");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIDVSSISIS, "CWSIDVSSISIS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_ESTREMSUBIMP, 4500, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_ESTREMSUBIMP, "88D5B8B1-79C9-4845-9DE0-3363F4FE525A");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_ESTREMSUBIMP, "ESTREMSUBIMP");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_ESTREMSUBIMP, BUK_SITSUBIMPSTA_SPAN_CWSIESVSSISS, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384705, "", "::ESTREMI_SUBIMP", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIESVSSISS, "DEE76701-5586-48B3-B2CA-FFE5503A5164");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIESVSSISS, "CWSIESVSSISS");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_DESCRIMPACC, 12300, 0, 4400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DESCRIMPACC, "248CA1F0-2D16-4823-859E-F3EF5A6D9107");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DESCRIMPACC, "DESCRIMPACC");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DESCRIMPACC, BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISSI, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISSI, "90EBCE2B-9C4C-498E-A0C5-FCB5D73C2EC9");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSDIVSSISSI, "CWSDIVSSISSI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIL, BUK_SITSUBIMPSTA_RPTBOX_OBBLIGATORIO, 11600, 0, 600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGATORIO, "83C59E6A-2C2B-47E8-BA78-EE523F8A5EC5");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_OBBLIGATORIO, BUK_SITSUBIMPSTA_SPAN_CWSIOVSSISSI, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384961, "", "::OBBLIGATORIO", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIOVSSISSI, "67366593-5CFA-4077-8974-805712CE5730");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIOVSSISSI, "CWSIOVSSISSI");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_DETARAGISOCI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_DETARAGISOCI, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_DETARAGISOCI, "6E832525-A7B7-4AED-A84D-8145C169BC45");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETARAGISOCI, BUK_SITSUBIMPSTA_RPTBOX_RAGIONSOCIAL, 12300, 0, 4400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_RAGIONSOCIAL, "BEF475AB-21C7-4F36-ACF7-CB3AA9468A52");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_RAGIONSOCIAL, "RAGIONSOCIAL");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_RAGIONSOCIAL, BUK_SITSUBIMPSTA_SPAN_CWSIRSVSSISI, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIRSVSSISI, "5A2DDBD7-5EDC-49A6-9229-D934A20887E7");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIRSVSSISI, "CWSIRSVSSISI");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, "03B8FDF3-7B22-457A-8730-6D0491871A9A");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_DETAIUOUTILI, BUK_SITSUBIMPSTA_RPTBOX_DESCRUOUTILI, 12300, 0, 4400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_DESCRUOUTILI, "31FD6FC1-D7C9-47B8-9ACC-3FD6DF4F3C81");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_DESCRUOUTILI, BUK_SITSUBIMPSTA_SPAN_CWSIDUUVSSIS, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_CWSIDUUVSSIS, "D87BD102-AB2B-44F4-8C64-0C9B6C4E3CA4");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_CWSIDUUVSSIS, "CWSIDUUVSSIS");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027009, "CFWRSIIMRECO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, "EB526C70-DCEC-48BB-A72E-C56A92FCA7EA");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_TOTRESCOMHEA, 12400, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTRESCOMHEA, "6B7A428D-D537-4CBB-8B31-39B12CE4163D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTRESCOMHEA, "TOTRESCOMHEA");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTRESCOMHEA, BUK_SITSUBIMPSTA_SPAN_TOTARESICOMP, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271319425, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTARESICOMP, "AF372EA6-13A8-4519-A7F9-E5755A674537");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTARESICOMP, "TOTARESICOMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOIMPA, 16800, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOIMPA, "BF2AAAA7-9F54-40D6-8122-A41EAF968535");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOIMPA, "TOTAIMPOIMPA");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOIMPA, BUK_SITSUBIMPSTA_SPAN_TOTAIMPOIMPA, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOIMPA, "6EA3D597-49F9-45BB-A8F3-46C14439099B");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOIMPA, "TOTAIMPOIMPA");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_TOTALELIQUID, 19500, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTALELIQUID, "377911DA-1A9C-4A19-9720-4DDE405347AE");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTALELIQUID, "TOTALELIQUID");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTALELIQUID, BUK_SITSUBIMPSTA_SPAN_TOTALELIQUID, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTALELIQUID, "0F2AD24C-E5C8-4EB6-A816-717EA89ADE63");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTALELIQUID, "TOTALELIQUID");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_TOTALEMANORD, 22200, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTALEMANORD, "0263A407-2169-4697-8AB7-1948E2E1F4CB");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTALEMANORD, "TOTALEMANORD");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTALEMANORD, BUK_SITSUBIMPSTA_SPAN_TOTALEMANORD, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTALEMANORD, "673F0B42-B668-4327-BF19-08C0C9A79348");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTALEMANORD, "TOTALEMANORD");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_TOTALEDISPON, 24900, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTALEDISPON, "64AC36A5-1CB2-4740-A8A9-114DED8CA38E");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTALEDISPON, "TOTALEDISPON");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTALEDISPON, BUK_SITSUBIMPSTA_SPAN_TOTALEDISPON, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTALEDISPON, "A35F7CF4-C745-4364-81E0-26C87C307DA5");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTALEDISPON, "TOTALEDISPON");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_RESCOMGROFOO, BUK_SITSUBIMPSTA_RPTBOX_BARRA1, 16800, 0, 10700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_BARRA1, "049B88A6-47D0-4F36-96FD-2FF659F92EB1");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_BARRA1, "BARRA1");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "VOCE_PEG");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE, "9A248332-7AA6-4034-B356-E7D761E3AC13");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFORE, "VOCPEGGRFORE");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "VOCE_PEG");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO, "8B391EAD-12C5-4F03-A004-A0C01D48B26D");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_VOCPEGGRFOCO, "VOCPEGGRFOCO");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA, "99CC92E2-CB41-4025-A4FD-21E1A1EF0064");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA, "PROUOGROFOBA");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOBA, BUK_SITSUBIMPSTA_RPTBOX_BARRA, 16800, 0, 10700, 100, 0, 1, 1, MyGlb.VIS_BORDINFEDOPP, 983041, 0, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_BARRA, "D9DF5E2B-28A2-4E9C-96E6-91A77155CCF7");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_BARRA, "BARRA");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, "C708F601-1E18-4521-8EB6-7467D3F446BC");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, "PROUOGROFORE");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_TOTGENRESHEA, 12400, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTGENRESHEA, "D80BFE94-28EF-49DA-98A4-FD9E6FC27FD9");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTGENRESHEA, "TOTGENRESHEA");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTGENRESHEA, BUK_SITSUBIMPSTA_SPAN_TOTAGENERESI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Residui", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAGENERESI, "55E7DD0C-BBD7-4D2F-833B-A74DBCC5B6A2");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAGENERESI, "TOTAGENERESI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPORESI, 16800, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPORESI, "9FFE556F-8ADC-4861-87D1-E21C8ED918F2");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPORESI, BUK_SITSUBIMPSTA_SPAN_TOTAIMPORESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAIMPORESI, "19CDCB0E-45C8-4B55-81BB-7C917996F3E6");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_TOTALIQURESI, 19500, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQURESI, "B136FFAE-726D-40B0-8CE1-BD25F0B2CC9F");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQURESI, "TOTALIQURESI");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQURESI, BUK_SITSUBIMPSTA_SPAN_TOTALIQURESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTALIQURESI, "F62BC8DB-D83B-4AAF-871B-318FB7A18238");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTALIQURESI, "TOTALIQURESI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDRESI, 22200, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDRESI, "D1C24B66-A121-4FA7-9844-D8F008832102");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDRESI, BUK_SITSUBIMPSTA_SPAN_TOTAMANDRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAMANDRESI, "43B399DF-8B46-4971-B4C7-BFA233D1C57F");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFORE, BUK_SITSUBIMPSTA_RPTBOX_TOTADISPRESI, 24900, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPRESI, "77F0B554-387C-426A-B969-B401F95D8B91");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPRESI, BUK_SITSUBIMPSTA_SPAN_TOTADISPRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTADISPRESI, "2FA90424-C543-4B56-97C3-556CB8FC960C");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, "D8039040-E019-4A34-8628-9279C6C57025");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, "PROUOGROFOCO");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_TOTGENCOMHEA, 12400, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTGENCOMHEA, "9D5BA3E1-0F24-40CA-B34C-9AD6EDC19F02");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTGENCOMHEA, "TOTGENCOMHEA");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTGENCOMHEA, BUK_SITSUBIMPSTA_SPAN_TOTAGENECOMP, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Competenza", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAGENECOMP, "145602F2-EF34-4840-B479-FE8888FA74E3");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAGENECOMP, "TOTAGENECOMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOCOMP, 16800, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOCOMP, "DACA59C1-CE06-4532-B157-29F7A0228932");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTAIMPOCOMP, BUK_SITSUBIMPSTA_SPAN_TOTAIMPOCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOCOMP, "186C8103-2208-4280-A0AA-D8417AB98249");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_TOTALIQUCOMP, 19500, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQUCOMP, "B0DFBE65-3C5E-44B3-AC3B-7AE4E584F447");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQUCOMP, "TOTALIQUCOMP");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTALIQUCOMP, BUK_SITSUBIMPSTA_SPAN_TOTALIQUCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTALIQUCOMP, "64172BF6-25B9-44D9-B48B-E89C5C020A63");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTALIQUCOMP, "TOTALIQUCOMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDCOMP, 22200, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDCOMP, "CECADE8C-D1FC-4BE2-AD5A-57960068C9C1");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTAMANDCOMP, BUK_SITSUBIMPSTA_SPAN_TOTAMANDCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTAMANDCOMP, "5A600AF7-447C-4D39-B9C0-00ADE6612132");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITSUBIMPSTA.InitReportBox(BUK_SITSUBIMPSTA_SEC_PROUOGROFOCO, BUK_SITSUBIMPSTA_RPTBOX_TOTADISPCOMP, 24900, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPCOMP, "DF1E23CF-0C53-4589-8E7D-DBF8182EC582");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITSUBIMPSTA.InitBoxSpan(BUK_SITSUBIMPSTA_RPTBOX_TOTADISPCOMP, BUK_SITSUBIMPSTA_SPAN_TOTADISPCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SPAN_TOTADISPCOMP, "26CD7645-45EB-41FF-A933-2B1A8861CD88");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SPAN_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITSUBIMPSTA.InitSection(BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE, BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.SetSectionRendersInto(BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
    BUK_SITSUBIMPSTA.SetRTCGuid(BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA, "01B4BFB2-11C2-45BE-A55D-B612351DD3D7");
    BUK_SITSUBIMPSTA.SetObjCode(BUK_SITSUBIMPSTA_SEC_PRUOGRFONUPA, "PRUOGRFONUPA");
    BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_PROGUOGROHEA, "CFWRSIIMPRUO");
    BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITSUBIMPSTA.AddReportGroup(BUK_SITSUBIMPSTA_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITSUBIMPSTA_RPT_SITSUBIMPDRE_InitQuery(false, true);
  }

  private void BUK_SITSUBIMPSTA_InitLinks()
  {
    BUK_SITSUBIMPSTA.SetBoxNextBox(BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY, BUK_SITSUBIMPSTA_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnFormattingPage(PageID);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnConnecting(DBConn);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITSUBIMPREP) BUK_SITSUBIMPREP_OnPreview();
    if (SrcObj == BKW_SITSUBIMPSTA) BUK_SITSUBIMPSTA_OnPreview();
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
