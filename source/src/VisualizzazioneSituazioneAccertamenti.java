// **********************************************
// Visualizzazione Situazione Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzazioneSituazioneAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_SITUACCEREPO;
  OBook BKW_SITUACCEREPO;
  //
  // Template Pages constants
  private static int BUK_SITUACCEREPO_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITUACCEREPO_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_SITUACCEREPO_SPAN_CPTSSARVSAPN = 3;
  private static int BUK_SITUACCEREPO_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_SITUACCEREPO_SPAN_SITUAZACCER1 = 5;
  private static int BUK_SITUACCEREPO_RPTBOX_PAGEBODY1 = 6;
  private static int BUK_SITUACCEREPO_RPTBOX_PAGEFOOTER1 = 7;

  //
  // Reports constants
  private static int BUK_SITUACCEREPO_RPT_SITACCPDFREP = 8;
  private static int BUK_SITUACCEREPO_SEC_UNIORGGROHEA = 9;
  private static int BUK_SITUACCEREPO_RPTBOX_DESCRIZIONU1 = 10;
  private static int BUK_SITUACCEREPO_SPAN_DESCRIZIONU1 = 11;
  private static int BUK_SITUACCEREPO_SEC_VOCPEGGROHEA = 12;
  private static int BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2 = 13;
  private static int BUK_SITUACCEREPO_RPTBOX_CAPITARTHEA1 = 14;
  private static int BUK_SITUACCEREPO_SPAN_C1 = 15;
  private static int BUK_SITUACCEREPO_RPTBOX_VOCEPEG1 = 16;
  private static int BUK_SITUACCEREPO_SPAN_CWSIVPVSASIR = 17;
  private static int BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1 = 18;
  private static int BUK_SITUACCEREPO_SPAN_IMPORTIMPAC1 = 19;
  private static int BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1 = 20;
  private static int BUK_SITUACCEREPO_SPAN_MANORD1 = 21;
  private static int BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1 = 22;
  private static int BUK_SITUACCEREPO_SPAN_DISPONIBILI1 = 23;
  private static int BUK_SITUACCEREPO_SEC_RESCOMGROHEA = 24;
  private static int BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI = 25;
  private static int BUK_SITUACCEREPO_RPTBOX_TOTACOMPRESI = 26;
  private static int BUK_SITUACCEREPO_SPAN_TOTACOMPRESI = 27;
  private static int BUK_SITUACCEREPO_RPTBOX_TOTAIMPOIMP2 = 28;
  private static int BUK_SITUACCEREPO_SPAN_TOTAIMPOIMP1 = 29;
  private static int BUK_SITUACCEREPO_RPTBOX_TOTALEMANOR2 = 30;
  private static int BUK_SITUACCEREPO_SPAN_TOTALEMANOR1 = 31;
  private static int BUK_SITUACCEREPO_RPTBOX_TOTALEDISPO2 = 32;
  private static int BUK_SITUACCEREPO_SPAN_TOTALEDISPO1 = 33;
  private static int BUK_SITUACCEREPO_RPTBOX_ESTRIMPAHEA1 = 34;
  private static int BUK_SITUACCEREPO_SPAN_ESTREMIMPAC1 = 35;
  private static int BUK_SITUACCEREPO_RPTBOX_DATAIMPAHEA1 = 36;
  private static int BUK_SITUACCEREPO_SPAN_DATAIMPACC1 = 37;
  private static int BUK_SITUACCEREPO_RPTBOX_DESCRIHEADE1 = 38;
  private static int BUK_SITUACCEREPO_SPAN_DESCIZIONE = 39;
  private static int BUK_SITUACCEREPO_SEC_DETAIL = 40;
  private static int BUK_SITUACCEREPO_RPTBOX_ESTREMIMPAC1 = 41;
  private static int BUK_SITUACCEREPO_SPAN_CFWSEIVSASIR = 42;
  private static int BUK_SITUACCEREPO_RPTBOX_DATAIMPACC1 = 43;
  private static int BUK_SITUACCEREPO_SPAN_CFWSDIVSASA1 = 44;
  private static int BUK_SITUACCEREPO_RPTBOX_IMPORTIMPAC1 = 45;
  private static int BUK_SITUACCEREPO_SPAN_CFWSIIVSASIR = 46;
  private static int BUK_SITUACCEREPO_RPTBOX_MANORD1 = 47;
  private static int BUK_SITUACCEREPO_SPAN_CWSIMOVSASIR = 48;
  private static int BUK_SITUACCEREPO_RPTBOX_DISPONIBILI1 = 49;
  private static int BUK_SITUACCEREPO_SPAN_CFWSIDVSASIR = 50;
  private static int BUK_SITUACCEREPO_RPTBOX_DESCRIMPACC1 = 51;
  private static int BUK_SITUACCEREPO_SPAN_CFWSDIVSASAR = 52;
  private static int BUK_SITUACCEREPO_SEC_DETARAGISOCI = 53;
  private static int BUK_SITUACCEREPO_RPTBOX_RAGIONSOCIA1 = 54;
  private static int BUK_SITUACCEREPO_SPAN_CWSIRSVSASIR = 55;
  private static int BUK_SITUACCEREPO_SEC_DETAIUOUTILI = 56;
  private static int BUK_SITUACCEREPO_RPTBOX_DESCRUOUTIL1 = 57;
  private static int BUK_SITUACCEREPO_SPAN_CWSIDUUVSAS1 = 58;
  private static int BUK_SITUACCEREPO_SEC_RESCOMGROFOO = 59;
  private static int BUK_SITUACCEREPO_SEC_VOCPEGGROFOO = 60;
  private static int BUK_SITUACCEREPO_SEC_UNIORGGROFOO = 61;

  CIDREObj BUK_SITUACCESTAM;
  OBook BKW_SITUACCESTAM;
  //
  // Template Pages constants
  private static int BUK_SITUACCESTAM_MST_CFWRSIIMBOPA = 1;
  private static int BUK_SITUACCESTAM_RPTBOX_NUMEROPAGIN3 = 2;
  private static int BUK_SITUACCESTAM_SPAN_CPTSSASVSAPN = 3;
  private static int BUK_SITUACCESTAM_RPTBOX_PAGEHEADER3 = 4;
  private static int BUK_SITUACCESTAM_SPAN_SITUAZACCERT = 5;
  private static int BUK_SITUACCESTAM_RPTBOX_PAGEBODY3 = 6;
  private static int BUK_SITUACCESTAM_RPTBOX_PAGEFOOTER3 = 7;

  //
  // Reports constants
  private static int BUK_SITUACCESTAM_RPT_SITACCPDFREP = 8;
  private static int BUK_SITUACCESTAM_SEC_PROUOGROHEA1 = 9;
  private static int BUK_SITUACCESTAM_RPTBOX_DESCRIZIONUO = 10;
  private static int BUK_SITUACCESTAM_SPAN_DESCRIZIONUO = 11;
  private static int BUK_SITUACCESTAM_RPTBOX_CAPITARTHEAD = 12;
  private static int BUK_SITUACCESTAM_SPAN_C = 13;
  private static int BUK_SITUACCESTAM_RPTBOX_ESTRIMPAHEAD = 14;
  private static int BUK_SITUACCESTAM_SPAN_ESTREMIMPACC = 15;
  private static int BUK_SITUACCESTAM_RPTBOX_DATAIMPAHEAD = 16;
  private static int BUK_SITUACCESTAM_SPAN_DATAIMPACC = 17;
  private static int BUK_SITUACCESTAM_RPTBOX_IMPOIMPAHEAD = 18;
  private static int BUK_SITUACCESTAM_SPAN_IMPORTIMPACC = 19;
  private static int BUK_SITUACCESTAM_RPTBOX_MANORDHEADER = 20;
  private static int BUK_SITUACCESTAM_SPAN_MANORD = 21;
  private static int BUK_SITUACCESTAM_RPTBOX_DISPONHEADER = 22;
  private static int BUK_SITUACCESTAM_SPAN_DISPONIBILIT = 23;
  private static int BUK_SITUACCESTAM_RPTBOX_DESCRIHEADER = 24;
  private static int BUK_SITUACCESTAM_SPAN_DESCRIZIONE = 25;
  private static int BUK_SITUACCESTAM_SEC_VOCPEGGROHEA = 26;
  private static int BUK_SITUACCESTAM_SEC_RESCOMGROHEA = 27;
  private static int BUK_SITUACCESTAM_SEC_DETAIL = 28;
  private static int BUK_SITUACCESTAM_RPTBOX_VOCEPEG3 = 29;
  private static int BUK_SITUACCESTAM_SPAN_CWSIVPVSASIS = 30;
  private static int BUK_SITUACCESTAM_RPTBOX_ESTREMIMPAC3 = 31;
  private static int BUK_SITUACCESTAM_SPAN_CFWSEIVSASIS = 32;
  private static int BUK_SITUACCESTAM_RPTBOX_DATAIMPACC3 = 33;
  private static int BUK_SITUACCESTAM_SPAN_CFWSDIVSASIS = 34;
  private static int BUK_SITUACCESTAM_RPTBOX_IMPORTIMPAC3 = 35;
  private static int BUK_SITUACCESTAM_SPAN_CFWSIIVSASIS = 36;
  private static int BUK_SITUACCESTAM_RPTBOX_MANORD3 = 37;
  private static int BUK_SITUACCESTAM_SPAN_CWSIMOVSASIS = 38;
  private static int BUK_SITUACCESTAM_RPTBOX_DISPONIBILI3 = 39;
  private static int BUK_SITUACCESTAM_SPAN_CFWSIDVSASIS = 40;
  private static int BUK_SITUACCESTAM_RPTBOX_DESCRIMPACC = 41;
  private static int BUK_SITUACCESTAM_SPAN_CFWSDIVSASAS = 42;
  private static int BUK_SITUACCESTAM_SEC_DETARAGISOCI = 43;
  private static int BUK_SITUACCESTAM_RPTBOX_RAGIONSOCIAL = 44;
  private static int BUK_SITUACCESTAM_SPAN_CWSIRSVSASIS = 45;
  private static int BUK_SITUACCESTAM_SEC_DETAIUOUTILI = 46;
  private static int BUK_SITUACCESTAM_RPTBOX_DESCRUOUTILI = 47;
  private static int BUK_SITUACCESTAM_SPAN_CWSIDUUVSASI = 48;
  private static int BUK_SITUACCESTAM_SEC_RESCOMGROFOO = 49;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTRESHEACO2 = 50;
  private static int BUK_SITUACCESTAM_SPAN_TOTALECOMPE1 = 51;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTAIMPOIMP4 = 52;
  private static int BUK_SITUACCESTAM_SPAN_TOTAIMPOIMPA = 53;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTALEMANOR4 = 54;
  private static int BUK_SITUACCESTAM_SPAN_TOTALEMANORD = 55;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTALEDISPO4 = 56;
  private static int BUK_SITUACCESTAM_SPAN_TOTALEDISPON = 57;
  private static int BUK_SITUACCESTAM_RPTBOX_BARRARESCOMP = 58;
  private static int BUK_SITUACCESTAM_SEC_VOCPEGGROFOO = 59;
  private static int BUK_SITUACCESTAM_SEC_PROUOGROFOBA = 60;
  private static int BUK_SITUACCESTAM_RPTBOX_BARRAUO = 61;
  private static int BUK_SITUACCESTAM_SEC_PROUOGROFORE = 62;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTGENRESHEA = 63;
  private static int BUK_SITUACCESTAM_SPAN_TOTAGENERESI = 64;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTAIMPORESI = 65;
  private static int BUK_SITUACCESTAM_SPAN_TOTAIMPORESI = 66;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTAMANDRESI = 67;
  private static int BUK_SITUACCESTAM_SPAN_TOTAMANDRESI = 68;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTADISPRESI = 69;
  private static int BUK_SITUACCESTAM_SPAN_TOTADISPRESI = 70;
  private static int BUK_SITUACCESTAM_SEC_PROUOGROFOCO = 71;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTGENCOMHEA = 72;
  private static int BUK_SITUACCESTAM_SPAN_TOTAGENECOMP = 73;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTAIMPOCOMP = 74;
  private static int BUK_SITUACCESTAM_SPAN_TOTAIMPOCOMP = 75;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTAMANDCOMP = 76;
  private static int BUK_SITUACCESTAM_SPAN_TOTAMANDCOMP = 77;
  private static int BUK_SITUACCESTAM_RPTBOX_TOTADISPCOMP = 78;
  private static int BUK_SITUACCESTAM_SPAN_TOTADISPCOMP = 79;
  private static int BUK_SITUACCESTAM_SEC_PRUOGRFONUPA = 80;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI121(IMDB);
    //
    //
    Init_PQRY_CF4WRKSITIM1(IMDB);
    Init_PQRY_CF4WRKSITIM8(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI121(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI121, 5);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI121, "TBL_PARAMETRI121");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARATIPOSTRU,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARAPROUOSTR, "PARAPROUOSTR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARAPROUOSTR,1,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI121,IMDBDef7.FLD_PARAMETRI121_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI121, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM1, 30);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM1, "PQRY_CF4WRKSITIM1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM1,IMDBDef17.PQSL_CF4WRKSITIM1_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM1, 0);
  }

  private static void Init_PQRY_CF4WRKSITIM8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKSITIM8, 30);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKSITIM8, "PQRY_CF4WRKSITIM8");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMPRUO, "CFWRSIIMPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDEUO, "CFWRSIIMDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMRECO, "CFWRSIIMRECO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMRECO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_UO_UTILIZZO,5,150,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ESTREMI_IMPACC, "ESTREMI_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_ESTREMI_IMPACC,5,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DATA_IMPACC, "DATA_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DATA_IMPACC,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DETERMINA_PROPOSTA, "DETERMINA_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DETERMINA_PROPOSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_IMPACC, "DESCR_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DESCR_IMPACC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_RAGIONE_SOCIALE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_IMPORTO_IMPACC, "IMPORTO_IMPACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_IMPORTO_IMPACC,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_MAN_ORD,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMIMRE, "CFWRSIIMIMRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMIMRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMIMCO, "CFWRSIIMIMCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMIMCO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMSUIR, "CFWRSIIMSUIR");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMSUIR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMSUIC, "CFWRSIIMSUIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMSUIC,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMLIRE, "CFWRSIIMLIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMLIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMLICO, "CFWRSIIMLICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMLICO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMMARE, "CFWRSIIMMARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMMARE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMMACO, "CFWRSIIMMACO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMMACO,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDIRE, "CFWRSIIMDIRE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDIRE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDICO, "CFWRSIIMDICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKSITIM8,IMDBDef17.PQSL_CF4WRKSITIM8_CFWRSIIMDICO,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKSITIM8, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzazioneSituazioneAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzazioneSituazioneAccertamenti()
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
    FormIdx = MyGlb.FRM_VISUSITUACCE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1735D625-1158-41B9-9F4D-B887F75264D5";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1188;
    DesignHeight = 890;
    set_Caption(new IDVariant("Visualizzazione Situazione Accertamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1188;
    Frames[1].Height = 864;
    Frames[1].Caption = "Situazione Accertamenti Report";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 864;
    BKW_SITUACCEREPO = new OBook(this);
    BUK_SITUACCEREPO = new CIDREObj(BKW_SITUACCEREPO);
    Frames[1].Content = BKW_SITUACCEREPO;
    BKW_SITUACCEREPO.Height = 834;
    BKW_SITUACCEREPO.Width = 1188;
    BKW_SITUACCEREPO.iGuid = "EFD2E607-8E57-4177-A10E-024BB1DA88EC";
    BKW_SITUACCEREPO.Code = "BUK_SITUACCEREPO";
    BKW_SITUACCEREPO.BookObj = BUK_SITUACCEREPO;
    BKW_SITUACCEREPO.InitDefMasks();
    BUK_SITUACCEREPO.set_FrIndex(1);
    BUK_SITUACCEREPO.InitBook(1, 3342593, "Situazione Accertamenti Report", IMDB, MainFrm.VisualStyleList);
    BUK_SITUACCEREPO.InitHTML();
    BUK_SITUACCEREPO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITUACCEREPO.SetSize(1188, 834);
    BUK_SITUACCEREPO.Book.SetMainFrm(MainFrm);
    BUK_SITUACCEREPO.SetRTCGuid(0, "EFD2E607-8E57-4177-A10E-024BB1DA88EC");
    BUK_SITUACCEREPO.SetObjCode(0, "SITUACCEREPO");
    BUK_SITUACCEREPO_MST_CFWRSIIMBOPA_Init();
    BUK_SITUACCEREPO_RPT_SITACCPDFREP_Init();
    BUK_SITUACCEREPO_InitLinks();
    BKW_SITUACCESTAM = new OBook(this);
    BUK_SITUACCESTAM = new CIDREObj(BKW_SITUACCESTAM);
    BKW_SITUACCESTAM.iGuid = "DBB06603-20FF-4CBB-AACA-A7D1E1567B36";
    BKW_SITUACCESTAM.Code = "BUK_SITUACCESTAM";
    BKW_SITUACCESTAM.BookObj = BUK_SITUACCESTAM;
    BKW_SITUACCESTAM.InitDefMasks();
    BUK_SITUACCESTAM.InitBook(1, 3342593, "Situazioni Accertamenti Stampa", IMDB, MainFrm.VisualStyleList);
    BUK_SITUACCESTAM.InitHTML();
    BUK_SITUACCESTAM.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITUACCESTAM.Book.SetMainFrm(MainFrm);
    BUK_SITUACCESTAM.SetRTCGuid(0, "DBB06603-20FF-4CBB-AACA-A7D1E1567B36");
    BUK_SITUACCESTAM.SetObjCode(0, "SITUACCESTAM");
    BUK_SITUACCESTAM_MST_CFWRSIIMBOPA_Init();
    BUK_SITUACCESTAM_RPT_SITACCPDFREP_Init();
    BUK_SITUACCESTAM_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPACOMPLE+BaseCmdLinIdx)
      {
        ApriStampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUTT5+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUTT5+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI38+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI30+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI38+BaseCmdLinIdx), FormIdx, 1);
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
      BUK_SITUACCEREPO.UpdateBook();
      // BUK_SITUACCESTAM.UpdateBook();
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
    if (Code.equals("BUK_SITUACCEREPO")) return BUK_SITUACCEREPO;
    if (Code.equals("BUK_SITUACCESTAM")) return BUK_SITUACCESTAM;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VisualizzazioneSituazioneAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzazioneSituazioneAccertamenti.class.getName() : (Glb.ClassWithPackage(VisualizzazioneSituazioneAccertamenti.class) ? VisualizzazioneSituazioneAccertamenti.class.getName().substring(VisualizzazioneSituazioneAccertamenti.class.getPackage().getName().length() + 1) : VisualizzazioneSituazioneAccertamenti.class.getName()));
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
      v_CAPTION = (new IDVariant("Situazione Accertamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[BUK_SITUACCEREPO.Book.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARRESCOMENT, 0).equals((new IDVariant("R")), true))
      {
        // 
        // visibilità footer stampa
        // 
        {
          BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
          BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARRESCOMENT, 0).equals((new IDVariant("C")), true))
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFORE, (new IDVariant(0)).booleanValue());
            BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
        else
        {
          // 
          // visibilità footer stampa
          // 
          {
            BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFORE, (new IDVariant(-1)).booleanValue());
            BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, (new IDVariant(-1)).booleanValue());
          }
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARAMUOUTILI, 0).equals((new IDVariant("SI")), true))
      {
        BUK_SITUACCEREPO.set_SectionVisible(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
        BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITUACCEREPO.set_SectionVisible(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
        BUK_SITUACCESTAM.set_SectionVisible(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // VOCE PEG Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUACCEREPO_SEC_VOCPEGGROHEA_OnFormattingSection()
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
      if (BUK_SITUACCEREPO.SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA))
      {
        BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tm1.gif")).toString()); 
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, (new IDVariant(-1)).booleanValue());
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, null, (new IDVariant("tp1.gif")).toString()); 
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, (new IDVariant(0)).booleanValue());
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, (new IDVariant(0)).booleanValue());
        BUK_SITUACCEREPO.set_BoxVisible(BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "VOCEPEGGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Residuo Competenza Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_SITUACCEREPO_SEC_RESCOMGROHEA_OnFormattingSection()
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
      if ((new IDVariant(BUK_SITUACCEREPO.SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA))).equals((new IDVariant(0)), true))
      {
        BUK_SITUACCEREPO.set_SectionHeight(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(5, IDVariant.FLOAT)).dblValue());
        BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_SITUACCEREPO.set_SectionHeight(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(9, IDVariant.FLOAT)).dblValue());
        BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "ResiduoCompetenzaGroupHeaderBeforeFormattingEvent", _e);
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
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUACCEREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "EspandiTutto", _e);
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
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, (new IDVariant(0)).booleanValue());
      BUK_SITUACCEREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "ComprimiTutto", _e);
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
      BUK_SITUACCESTAM.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_SITUACCESTAM.ReportRefreshQuery(BUK_SITUACCESTAM_RPT_SITACCPDFREP);
      BUK_SITUACCESTAM.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_SITUACCESTAM.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazioneSituazioneAccertamenti", "ApriStampaCompleta", _e);
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
  private void BUK_SITUACCEREPO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITUACCEREPO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITUACCEREPO_SEC_UNIORGGROHEA)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_VOCPEGGROHEA)
    {
      BUK_SITUACCEREPO_SEC_VOCPEGGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_RESCOMGROHEA)
    {
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_TOTACOMPRESI, new IDVariant(((BUK_SITUACCEREPO.GetReportColumn(BUK_SITUACCEREPO_RPT_SITACCPDFREP, "CFWRSIIMRECO").equals((new IDVariant(2)), true))?(new IDVariant("Totale Competenza")):(new IDVariant("Totale Residui")))));
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_TOTAIMPOIMP1, new IDVariant(BUK_SITUACCEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCEREPO_SEC_RESCOMGROHEA,"IMPORTO_IMPACC")));
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_TOTALEMANOR1, new IDVariant(BUK_SITUACCEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCEREPO_SEC_RESCOMGROHEA,"MAN_ORD")));
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_TOTALEDISPO1, new IDVariant(BUK_SITUACCEREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCEREPO_SEC_RESCOMGROHEA,"DISPONIBILITA")));
      BUK_SITUACCEREPO_SEC_RESCOMGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_DETARAGISOCI)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_DETAIUOUTILI)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_RESCOMGROFOO)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SITUACCEREPO_SEC_UNIORGGROFOO)
    {
    }
  }

  private void BUK_SITUACCEREPO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITUACCEREPO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITUACCEREPO_MST_CFWRSIIMBOPA)
    {
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_CPTSSARVSAPN, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITUACCEREPO.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITUACCEREPO.GetTotalPagesNumber())))))))))));
      BUK_SITUACCEREPO.set_SpanValue(BUK_SITUACCEREPO_SPAN_SITUAZACCER1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Accertamenti")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITUACCEREPO_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2)
    {
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, !BUK_SITUACCEREPO.SectionShowChildren(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA));
    }
    if (ObjID==BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI)
    {
      BUK_SITUACCEREPO.set_SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, !BUK_SITUACCEREPO.SectionShowChildren(BUK_SITUACCEREPO_SEC_RESCOMGROHEA));
    }
  }

  private void BUK_SITUACCEREPO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITUACCEREPO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITUACCEREPO_OnPreview()
  {
  }

  private void BUK_SITUACCESTAM_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITUACCESTAM_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITUACCESTAM_SEC_PROUOGROHEA1)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_RESCOMGROHEA)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_DETARAGISOCI)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_DETAIUOUTILI)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_RESCOMGROFOO)
    {
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTALECOMPE1, new IDVariant(((BUK_SITUACCESTAM.GetReportColumn(BUK_SITUACCESTAM_RPT_SITACCPDFREP, "CFWRSIIMRECO").equals((new IDVariant(1)), true))?(new IDVariant("Totale Residui")):(new IDVariant("Totale Competenza")))));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTAIMPOIMPA, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_RESCOMGROFOO,"IMPORTO_IMPACC")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTALEMANORD, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_RESCOMGROFOO,"MAN_ORD")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTALEDISPON, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_RESCOMGROFOO,"DISPONIBILITA")));
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_PROUOGROFOBA)
    {
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_PROUOGROFORE)
    {
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTAIMPORESI, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFORE,"CFWRSIIMIMRE")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTAMANDRESI, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFORE,"CFWRSIIMMARE")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTADISPRESI, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFORE,"CFWRSIIMDIRE")));
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_PROUOGROFOCO)
    {
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTAIMPOCOMP, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFOCO,"CFWRSIIMIMCO")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTAMANDCOMP, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFOCO,"CFWRSIIMMACO")));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_TOTADISPCOMP, new IDVariant(BUK_SITUACCESTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITUACCESTAM_SEC_PROUOGROFOCO,"CFWRSIIMDICO")));
    }
    if (SectionID==BUK_SITUACCESTAM_SEC_PRUOGRFONUPA)
    {
    }
  }

  private void BUK_SITUACCESTAM_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITUACCESTAM_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITUACCESTAM_MST_CFWRSIIMBOPA)
    {
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_CPTSSASVSAPN, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_SITUACCESTAM.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_SITUACCESTAM.GetTotalPagesNumber())))))))))));
      BUK_SITUACCESTAM.set_SpanValue(BUK_SITUACCESTAM_SPAN_SITUAZACCERT, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Situazione Accertamenti")), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Day(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Month(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant("/")), IDL.ToString(IDL.Year(IMDB.Value(IMDBDef7.TBL_PARAMETRI121, IMDBDef7.FLD_PARAMETRI121_PARADATAELAB, 0))))))))));
    }
  }

  private void BUK_SITUACCESTAM_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITUACCESTAM_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITUACCESTAM_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITUACCESTAM_OnPreview()
  {
    PreviewBook = BKW_SITUACCESTAM;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_SITUACCEREPO_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITUACCEREPO.InitMastro(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, "6C1AC397-1A44-447C-B62F-131DA930A444");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITUACCEREPO.InitMastroBox(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, BUK_SITUACCEREPO_RPTBOX_NUMEROPAGIN1, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_NUMEROPAGIN1, "A9D13272-6F60-49BA-9562-269748B66B84");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_NUMEROPAGIN1, BUK_SITUACCEREPO_SPAN_CPTSSARVSAPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CPTSSARVSAPN, "BF43D95E-395B-4E3F-9019-D37E9E800D33");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CPTSSARVSAPN, "CPTSSARVSAPN");
    BUK_SITUACCEREPO.InitMastroBox(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, BUK_SITUACCEREPO_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1000, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_PAGEHEADER1, "F3BFD7E0-0B08-4B3E-8297-90FDC9BE8DD9");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_PAGEHEADER1, BUK_SITUACCEREPO_SPAN_SITUAZACCER1, MyGlb.VIS_TITOLOREPORT, 5, 326, 0, 271319425, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_SITUAZACCER1, "B4FF6680-11C3-45AF-907F-6A6341C86776");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_SITUAZACCER1, "SITUAZACCER1");
    BUK_SITUACCEREPO.InitMastroBox(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_PAGEBODY1, "A0952F6F-24DE-4991-BF59-0BBC338A8C33");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_SITUACCEREPO.InitMastroBox(BUK_SITUACCEREPO_MST_CFWRSIIMBOPA, BUK_SITUACCEREPO_RPTBOX_PAGEFOOTER1, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_PAGEFOOTER1, "7C5A8084-6D43-4D9C-AD8D-7CCA78313ED1");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_SITUACCEREPO_RPT_SITACCPDFREP_InitQuery() { BUK_SITUACCEREPO_RPT_SITACCPDFREP_InitQuery(true, true); }
  private void BUK_SITUACCEREPO_RPT_SITACCPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI121.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI121.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
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
      SQL.append("and   (A.TIPO_STAMPA = 'A') ");
      SQL.append("order by 1, 3, 4, 7, 8 ");
      BUK_SITUACCEREPO.SetReportQuery(BUK_SITUACCEREPO_RPT_SITACCPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7B61F1E2-B72D-42FA-87B9-CE56CDD08AA4");
      if (BUK_SITUACCEREPO.FindObjByID(BUK_SITUACCEREPO_SEC_UNIORGGROHEA) != null)
        BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
      if (BUK_SITUACCEREPO.FindObjByID(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA) != null)
        BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITUACCEREPO.FindObjByID(BUK_SITUACCEREPO_SEC_RESCOMGROHEA) != null)
        BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITUACCEREPO_RPT_SITACCPDFREP_Init()
  {
    BUK_SITUACCEREPO.InitReport(BUK_SITUACCEREPO_RPT_SITACCPDFREP, 196865);
    BUK_SITUACCEREPO_RPT_SITACCPDFREP_InitQuery(true, false);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPT_SITACCPDFREP, "1B85AD2D-64F4-45E1-8931-6E5016F850A6");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPT_SITACCPDFREP, "SITACCPDFREP");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_UNIORGGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 45678849, "CFWRSIIMPRUO");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, "0136DE81-64ED-42BC-A74D-7B2F5EBA2144");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, "UNIORGGROHEA");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, BUK_SITUACCEREPO_RPTBOX_DESCRIZIONU1, 100, 100, 12000, 400, 0, 1, 3, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DESCRIZIONU1, "D24A1F79-3B86-4C47-BAA2-7C815090ECFF");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DESCRIZIONU1, BUK_SITUACCEREPO_SPAN_DESCRIZIONU1, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_DESCRIZIONU1, "BD1F4CC1-81FF-452E-AEA4-6D1D24C4E12F");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "VOCE_PEG");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, "AA686C7B-5C88-4898-A341-145BB27E4F0C");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, 0, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, null, "tp1.gif");
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, "79D6C123-22E2-4A22-B0CD-07C46F9E609D");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPR2, "ESPANDCOMPR2");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_CAPITARTHEA1, 600, 0, 2100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_CAPITARTHEA1, "59507031-8C8B-42E6-9F34-44870FF58356");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_CAPITARTHEA1, "CAPITARTHEA1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_CAPITARTHEA1, BUK_SITUACCEREPO_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_C1, "0D0D7445-2830-4D19-8B40-505AF25BB317");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_C1, "C1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_VOCEPEG1, 2800, 0, 6300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_VOCEPEG1, "A0995819-394A-4FA1-B9EC-6C9C67CBF9BD");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_VOCEPEG1, BUK_SITUACCEREPO_SPAN_CWSIVPVSASIR, MyGlb.VIS_INTSENZABORD, 5, 20, 0, 271384705, "", "::VOCE_PEG", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CWSIVPVSASIR, "C466F9EF-03B3-4B45-A967-AFECB5AE9930");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CWSIVPVSASIR, "CWSIVPVSASIR");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, 12300, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, "09347DBD-0FD3-442D-B27F-22287D5D1EA7");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, "IMPOIMPAHEA1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_IMPOIMPAHEA1, BUK_SITUACCEREPO_SPAN_IMPORTIMPAC1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_IMPORTIMPAC1, "4637BE9D-A21A-446F-9C66-EE3650A17B17");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, 15100, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, "9DA3A0D6-3D2A-4D58-86A7-0801D76566C4");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, "MANORDHEADE1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_MANORDHEADE1, BUK_SITUACCEREPO_SPAN_MANORD1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ordinativi", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_MANORD1, "7144AD58-16D1-4E29-B1FB-34E5886718BA");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_MANORD1, "MANORD1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, 17900, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, "103B09AB-46D9-4B73-8FBF-CCC8E1896DBB");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, "DISPONHEADE1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DISPONHEADE1, BUK_SITUACCEREPO_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_DISPONIBILI1, "AEC6BFAE-BC57-4127-B629-0AD00BB1D86E");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_RESCOMGROHEA, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35192833, "CFWRSIIMRECO");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, "708CAA38-D13D-46FE-9511-0B16F382FEBF");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, 600, 0, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 0, "", 1, -33);
    BUK_SITUACCEREPO.SetBoxImage(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, null, "tp1.gif");
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, "5E93FB10-01AE-4A89-87DE-0E0AFA1ECCF7");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_TOTACOMPRESI, 9200, 0, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_TOTACOMPRESI, "1D1BE6DD-A6D8-4255-A594-9150B04C6985");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_TOTACOMPRESI, BUK_SITUACCEREPO_SPAN_TOTACOMPRESI, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271319169, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_TOTACOMPRESI, "48235FAF-D210-4905-AC78-C923ADCEAFE1");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_TOTACOMPRESI, "TOTACOMPRESI");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_TOTAIMPOIMP2, 12300, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_TOTAIMPOIMP2, "F2BE4569-32DB-48E5-B735-B3471F01F98F");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_TOTAIMPOIMP2, "TOTAIMPOIMP2");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_TOTAIMPOIMP2, BUK_SITUACCEREPO_SPAN_TOTAIMPOIMP1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_TOTAIMPOIMP1, "33636EBD-D36F-4816-8574-4B4AFA67B114");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_TOTAIMPOIMP1, "TOTAIMPOIMP1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_TOTALEMANOR2, 15100, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_TOTALEMANOR2, "64FB123B-5C44-4702-BEA3-447DD165F1EB");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_TOTALEMANOR2, "TOTALEMANOR2");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_TOTALEMANOR2, BUK_SITUACCEREPO_SPAN_TOTALEMANOR1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_TOTALEMANOR1, "6F769698-5438-4FDD-93D1-AC1ED8DA6EAB");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_TOTALEMANOR1, "TOTALEMANOR1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_TOTALEDISPO2, 17900, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_TOTALEDISPO2, "834C1366-BDF5-4FD0-9BE2-90DBF9D2AD2E");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_TOTALEDISPO2, "TOTALEDISPO2");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_TOTALEDISPO2, BUK_SITUACCEREPO_SPAN_TOTALEDISPO1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_TOTALEDISPO1, "09BDC85D-0487-41A9-9F4F-0D428CDC0058");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_TOTALEDISPO1, "TOTALEDISPO1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_ESTRIMPAHEA1, 600, 500, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_ESTRIMPAHEA1, "9A41ED89-A20E-4B8A-8E13-AA87A7507313");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_ESTRIMPAHEA1, "ESTRIMPAHEA1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_ESTRIMPAHEA1, BUK_SITUACCEREPO_SPAN_ESTREMIMPAC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Accertamento", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_ESTREMIMPAC1, "7E5FB460-9C8D-45D3-9E95-970F906BC993");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_DATAIMPAHEA1, 2900, 500, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DATAIMPAHEA1, "98EAB199-154C-460B-BB83-3E700AE0DAFC");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DATAIMPAHEA1, "DATAIMPAHEA1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DATAIMPAHEA1, BUK_SITUACCEREPO_SPAN_DATAIMPACC1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_DATAIMPACC1, "64EE8ADE-1C6B-48DE-A586-F80760E5A978");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, BUK_SITUACCEREPO_RPTBOX_DESCRIHEADE1, 4700, 500, 7500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983297, 340, "Descrizione", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DESCRIHEADE1, "98C5470D-397F-41CF-BFD1-715D9CD9DD85");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DESCRIHEADE1, BUK_SITUACCEREPO_SPAN_DESCIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descizione", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_DESCIZIONE, "515BDB73-F374-4B18-A3BA-781BB73F69AD");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_DESCIZIONE, "DESCIZIONE");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_DETAIL, "36FFEDC7-63D9-4C64-B4B0-225128BA80B6");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_DETAIL, "DETAIL");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_ESTREMIMPAC1, 600, 100, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_ESTREMIMPAC1, "70F5B571-9016-4C02-A680-0742D5C5E255");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_ESTREMIMPAC1, "ESTREMIMPAC1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_ESTREMIMPAC1, BUK_SITUACCEREPO_SPAN_CFWSEIVSASIR, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384705, "", "::ESTREMI_IMPACC", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CFWSEIVSASIR, "8243C4E1-2D1F-4B29-B189-DE323AC61372");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CFWSEIVSASIR, "CFWSEIVSASIR");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_DATAIMPACC1, 2900, 100, 1700, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DATAIMPACC1, "514C5EA5-DF57-4170-8854-34080A413A23");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DATAIMPACC1, "DATAIMPACC1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DATAIMPACC1, BUK_SITUACCEREPO_SPAN_CFWSDIVSASA1, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CFWSDIVSASA1, "F5BE3639-613E-4419-B061-8E49EB614E3E");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CFWSDIVSASA1, "CFWSDIVSASA1");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_IMPORTIMPAC1, 12300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_IMPORTIMPAC1, "8124374C-87C7-4175-8B16-6DA7C036F794");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_IMPORTIMPAC1, "IMPORTIMPAC1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_IMPORTIMPAC1, BUK_SITUACCEREPO_SPAN_CFWSIIVSASIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_IMPACC", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CFWSIIVSASIR, "01DAEB2F-3FCB-4BA5-B3D1-D768DAF24DD7");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CFWSIIVSASIR, "CFWSIIVSASIR");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_MANORD1, 15100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_MANORD1, "3A33BD20-4706-4DD7-9484-AECA5D2DFB3A");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_MANORD1, "MANORD1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_MANORD1, BUK_SITUACCEREPO_SPAN_CWSIMOVSASIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CWSIMOVSASIR, "43803039-254C-43C9-8226-0483446F14AC");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CWSIMOVSASIR, "CWSIMOVSASIR");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_DISPONIBILI1, 17900, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DISPONIBILI1, "F6FABC91-8F97-4CBC-ACC9-3E3AF03F14EC");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DISPONIBILI1, BUK_SITUACCEREPO_SPAN_CFWSIDVSASIR, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CFWSIDVSASIR, "C513EF7A-19EE-4416-ACE4-BBBEF54542E4");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CFWSIDVSASIR, "CFWSIDVSASIR");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIL, BUK_SITUACCEREPO_RPTBOX_DESCRIMPACC1, 4700, 100, 7500, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DESCRIMPACC1, "E41E446B-AFD7-4847-88DA-8956C77F7DCB");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DESCRIMPACC1, "DESCRIMPACC1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DESCRIMPACC1, BUK_SITUACCEREPO_SPAN_CFWSDIVSASAR, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CFWSDIVSASAR, "6757896D-A4C5-465F-AB03-6D5E82F4B065");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CFWSDIVSASAR, "CFWSDIVSASAR");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_DETARAGISOCI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_DETARAGISOCI, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_DETARAGISOCI, "9BF7C0A9-146E-45AC-962B-46E10B28E514");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETARAGISOCI, BUK_SITUACCEREPO_RPTBOX_RAGIONSOCIA1, 4700, 0, 7500, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_RAGIONSOCIA1, "0C41282D-34F8-401C-BFA6-E8509CF6657A");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_RAGIONSOCIA1, "RAGIONSOCIA1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_RAGIONSOCIA1, BUK_SITUACCEREPO_SPAN_CWSIRSVSASIR, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CWSIRSVSASIR, "309BB118-43B8-4F56-A6D7-DFE6807D48D1");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CWSIRSVSASIR, "CWSIRSVSASIR");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_DETAIUOUTILI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, "0E47446E-A6FA-4951-BDD0-B53389E5AE41");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITUACCEREPO.InitReportBox(BUK_SITUACCEREPO_SEC_DETAIUOUTILI, BUK_SITUACCEREPO_RPTBOX_DESCRUOUTIL1, 4700, 0, 7500, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_RPTBOX_DESCRUOUTIL1, "90B03289-3CCF-40E3-A22A-3BC95E241217");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_RPTBOX_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_SITUACCEREPO.InitBoxSpan(BUK_SITUACCEREPO_RPTBOX_DESCRUOUTIL1, BUK_SITUACCEREPO_SPAN_CWSIDUUVSAS1, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SPAN_CWSIDUUVSAS1, "A923CCCC-77F9-4243-9B3E-A57DE3632692");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SPAN_CWSIDUUVSAS1, "CWSIDUUVSAS1");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_RESCOMGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "CFWRSIIMRECO");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_RESCOMGROFOO, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_RESCOMGROFOO, "7421E3DB-02C5-49C0-9129-1C5318753DE1");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_VOCPEGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "VOCE_PEG");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_VOCPEGGROFOO, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_VOCPEGGROFOO, "7F34BC51-B05E-4494-BB36-AC9035F7E2B6");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SITUACCEREPO.InitSection(BUK_SITUACCEREPO_RPT_SITACCPDFREP, BUK_SITUACCEREPO_SEC_UNIORGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "CFWRSIIMPRUO");
    BUK_SITUACCEREPO.SetSectionRendersInto(BUK_SITUACCEREPO_SEC_UNIORGGROFOO, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
    BUK_SITUACCEREPO.SetRTCGuid(BUK_SITUACCEREPO_SEC_UNIORGGROFOO, "F1DA4ED2-4D5A-4D67-AC49-3A4F31342EA9");
    BUK_SITUACCEREPO.SetObjCode(BUK_SITUACCEREPO_SEC_UNIORGGROFOO, "UNIORGGROFOO");
    BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_UNIORGGROHEA, "CFWRSIIMPRUO");
    BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITUACCEREPO.AddReportGroup(BUK_SITUACCEREPO_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITUACCEREPO_RPT_SITACCPDFREP_InitQuery(false, true);
  }

  private void BUK_SITUACCEREPO_InitLinks()
  {
    BUK_SITUACCEREPO.SetBoxNextBox(BUK_SITUACCEREPO_RPTBOX_PAGEBODY1, BUK_SITUACCEREPO_RPTBOX_PAGEBODY1);
  }

  private void BUK_SITUACCESTAM_MST_CFWRSIIMBOPA_Init()
  {
    BUK_SITUACCESTAM.InitMastro(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, "E9DC661A-5DDA-4545-A65B-183F14C350FC");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, "CFWRSIIMBOPA");
    BUK_SITUACCESTAM.InitMastroBox(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, BUK_SITUACCESTAM_RPTBOX_NUMEROPAGIN3, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_NUMEROPAGIN3, "FCACBCF1-1B14-4EEC-A038-AE1111EB84A8");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_NUMEROPAGIN3, "NUMEROPAGIN3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_NUMEROPAGIN3, BUK_SITUACCESTAM_SPAN_CPTSSASVSAPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CPTSSASVSAPN, "AFC01CCA-3477-41B6-BB2E-5B60C320306B");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CPTSSASVSAPN, "CPTSSASVSAPN");
    BUK_SITUACCESTAM.InitMastroBox(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, BUK_SITUACCESTAM_RPTBOX_PAGEHEADER3, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_PAGEHEADER3, "598A4C24-A886-4398-86C5-81783F66B689");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_PAGEHEADER3, "PAGEHEADER3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_PAGEHEADER3, BUK_SITUACCESTAM_SPAN_SITUAZACCERT, MyGlb.VIS_TITOLOREPORT, 5, 326, 0, 271319425, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_SITUAZACCERT, "C8E6CE51-5485-4102-90E1-5AC2C0A2BB97");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_SITUAZACCERT, "SITUAZACCERT");
    BUK_SITUACCESTAM.InitMastroBox(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_PAGEBODY3, "AF842CEF-C98E-4F1A-8DD5-D7C2744D4CCE");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_PAGEBODY3, "PAGEBODY3");
    BUK_SITUACCESTAM.InitMastroBox(BUK_SITUACCESTAM_MST_CFWRSIIMBOPA, BUK_SITUACCESTAM_RPTBOX_PAGEFOOTER3, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_PAGEFOOTER3, "1D788C12-1A99-4A97-AB8C-DFFD570D0E41");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_PAGEFOOTER3, "PAGEFOOTER3");
  }

  private void BUK_SITUACCESTAM_RPT_SITACCPDFREP_InitQuery() { BUK_SITUACCESTAM_RPT_SITACCPDFREP_InitQuery(true, true); }
  private void BUK_SITUACCESTAM_RPT_SITACCPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI121.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO) as CFWRSIIMPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI121.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO) as CFWRSIIMDEUO, ");
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
      SQL.append("and   (A.TIPO_STAMPA = 'A') ");
      SQL.append("order by 1, 3, 4, 7, 8 ");
      BUK_SITUACCESTAM.SetReportQuery(BUK_SITUACCESTAM_RPT_SITACCPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5D582024-9D17-4CE9-B18B-77E339CAB9B7");
      if (BUK_SITUACCESTAM.FindObjByID(BUK_SITUACCESTAM_SEC_PROUOGROHEA1) != null)
        BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, "CFWRSIIMPRUO");
      if (BUK_SITUACCESTAM.FindObjByID(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA) != null)
        BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, "VOCE_PEG");
      if (BUK_SITUACCESTAM.FindObjByID(BUK_SITUACCESTAM_SEC_RESCOMGROHEA) != null)
        BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITUACCESTAM_RPT_SITACCPDFREP_Init()
  {
    BUK_SITUACCESTAM.InitReport(BUK_SITUACCESTAM_RPT_SITACCPDFREP, 196865);
    BUK_SITUACCESTAM_RPT_SITACCPDFREP_InitQuery(true, false);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPT_SITACCPDFREP, "BB73A23C-3739-4119-A14D-A3F745D3B450");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPT_SITACCPDFREP, "SITACCPDFREP");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_PROUOGROHEA1, 1500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 45678593, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, "63394301-5088-4861-B089-99610128B752");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, "PROUOGROHEA1");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_DESCRIZIONUO, 100, 200, 27400, 800, 0, 1, 1, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DESCRIZIONUO, "52A375C1-F4FA-43D9-B3D1-D1DC6A953E74");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DESCRIZIONUO, BUK_SITUACCESTAM_SPAN_DESCRIZIONUO, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRSIIMDEUO", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_DESCRIZIONUO, "653E899F-6A4D-4E51-893F-07E1CB7F390D");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_CAPITARTHEAD, 0, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_CAPITARTHEAD, "598FC999-919B-41E4-9CA9-97CE7036458B");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_CAPITARTHEAD, BUK_SITUACCESTAM_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_C, "6A5D0BDD-FA80-457F-89A5-E72339E0A528");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_C, "C");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_ESTRIMPAHEAD, 2700, 1100, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_ESTRIMPAHEAD, "C6E64263-3A3F-4333-B043-C2F24D8FD991");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_ESTRIMPAHEAD, "ESTRIMPAHEAD");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_ESTRIMPAHEAD, BUK_SITUACCESTAM_SPAN_ESTREMIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Accertamento", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_ESTREMIMPACC, "79EB4F80-D180-4B74-BE29-9CECA4DF1279");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_ESTREMIMPACC, "ESTREMIMPACC");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_DATAIMPAHEAD, 5000, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DATAIMPAHEAD, "D227C113-0BE6-4B17-990F-C25D82E47382");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DATAIMPAHEAD, "DATAIMPAHEAD");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DATAIMPAHEAD, BUK_SITUACCESTAM_SPAN_DATAIMPACC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_DATAIMPACC, "313AE671-D0FA-4371-9990-CC26C1DE4C6F");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_DATAIMPACC, "DATAIMPACC");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_IMPOIMPAHEAD, 15500, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_IMPOIMPAHEAD, "2FE0313B-54ED-476D-ABB0-BE4767C2B6D4");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_IMPOIMPAHEAD, "IMPOIMPAHEAD");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_IMPOIMPAHEAD, BUK_SITUACCESTAM_SPAN_IMPORTIMPACC, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_IMPORTIMPACC, "2BDF333D-FDFB-4729-8377-292F8C42A300");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_IMPORTIMPACC, "IMPORTIMPACC");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_MANORDHEADER, 18300, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_MANORDHEADER, "DD820A26-D7AF-4EC7-89F6-D134970422B3");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_MANORDHEADER, "MANORDHEADER");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_MANORDHEADER, BUK_SITUACCESTAM_SPAN_MANORD, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ordinativi", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_MANORD, "501B23BA-747D-4640-9FFE-8B486EDC0E87");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_MANORD, "MANORD");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_DISPONHEADER, 21100, 1100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DISPONHEADER, "B2B0CE7B-A3D5-4A42-B196-CF50F70ABD64");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DISPONHEADER, BUK_SITUACCESTAM_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_DISPONIBILIT, "E11E35EB-01F6-409B-B858-C94CB45A8FB8");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, BUK_SITUACCESTAM_RPTBOX_DESCRIHEADER, 6700, 1100, 8700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DESCRIHEADER, "3ADE7871-F76D-42B9-AB07-9FCF416FD058");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DESCRIHEADER, BUK_SITUACCESTAM_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_DESCRIZIONE, "EF8C7AF0-691D-42A0-9559-8B741CC2164B");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124161, "VOCE_PEG");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, "8FEEE09D-1010-46ED-A6C4-DDA838E8626C");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_RESCOMGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124161, "CFWRSIIMRECO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_RESCOMGROHEA, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_RESCOMGROHEA, "4572DCF3-F6B0-4AAA-AA4E-591AB5AEFBD6");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_RESCOMGROHEA, "RESCOMGROHEA");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 12124161, "");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_DETAIL, "9A784384-594D-467B-B8A7-BAE58070D48A");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_DETAIL, "DETAIL");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_VOCEPEG3, 0, 0, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_VOCEPEG3, "803CAED6-10A6-4E2E-964B-0D38AC54EB5D");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_VOCEPEG3, "VOCEPEG3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_VOCEPEG3, BUK_SITUACCESTAM_SPAN_CWSIVPVSASIS, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384961, "", "::VOCE_PEG", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CWSIVPVSASIS, "D0130064-CB29-41ED-ABB1-28E785777FCE");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CWSIVPVSASIS, "CWSIVPVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_ESTREMIMPAC3, 2700, 0, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_ESTREMIMPAC3, "B04F4C2C-0BE2-407F-8639-F2C385CBB144");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_ESTREMIMPAC3, "ESTREMIMPAC3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_ESTREMIMPAC3, BUK_SITUACCESTAM_SPAN_CFWSEIVSASIS, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271384961, "", "::ESTREMI_IMPACC", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CFWSEIVSASIS, "3AB436C8-CE07-4C85-B917-F5C915470C00");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CFWSEIVSASIS, "CFWSEIVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_DATAIMPACC3, 5000, 0, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DATAIMPACC3, "AD6A0DFA-F2C7-4601-AC60-A848D8502B1C");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DATAIMPACC3, "DATAIMPACC3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DATAIMPACC3, BUK_SITUACCESTAM_SPAN_CFWSDIVSASIS, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA_IMPACC", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CFWSDIVSASIS, "41694897-36AE-407D-8B83-2E8077D4AF5A");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CFWSDIVSASIS, "CFWSDIVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_IMPORTIMPAC3, 15500, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_IMPORTIMPAC3, "BDAB2385-FF45-48A9-9F13-98923D99E08A");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_IMPORTIMPAC3, "IMPORTIMPAC3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_IMPORTIMPAC3, BUK_SITUACCESTAM_SPAN_CFWSIIVSASIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::IMPORTO_IMPACC", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CFWSIIVSASIS, "CF1C446A-0FD1-41EB-873C-2059F809C62E");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CFWSIIVSASIS, "CFWSIIVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_MANORD3, 18300, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_MANORD3, "CC11CCB5-81BF-4616-A601-068545D35601");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_MANORD3, "MANORD3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_MANORD3, BUK_SITUACCESTAM_SPAN_CWSIMOVSASIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::MAN_ORD", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CWSIMOVSASIS, "83F8F5FF-0090-40A3-B9F4-5E5E5E4895EA");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CWSIMOVSASIS, "CWSIMOVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_DISPONIBILI3, 21100, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DISPONIBILI3, "B527895B-D521-4BD9-9EDC-228A66D3764E");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DISPONIBILI3, "DISPONIBILI3");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DISPONIBILI3, BUK_SITUACCESTAM_SPAN_CFWSIDVSASIS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CFWSIDVSASIS, "93541286-1DF8-4CEF-A448-699CDFD1E1FA");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CFWSIDVSASIS, "CFWSIDVSASIS");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIL, BUK_SITUACCESTAM_RPTBOX_DESCRIMPACC, 6700, 0, 8700, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DESCRIMPACC, "8C1AE383-B586-41CA-BCA5-AD4EE22CABA2");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DESCRIMPACC, "DESCRIMPACC");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DESCRIMPACC, BUK_SITUACCESTAM_SPAN_CFWSDIVSASAS, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCR_IMPACC", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CFWSDIVSASAS, "24359DF1-AF07-494D-A12E-CAD526D47BE4");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CFWSDIVSASAS, "CFWSDIVSASAS");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_DETARAGISOCI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11599873, "");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_DETARAGISOCI, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_DETARAGISOCI, "F761531D-22C3-47A6-A98C-9D4FCE5B1FAB");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_DETARAGISOCI, "DETARAGISOCI");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETARAGISOCI, BUK_SITUACCESTAM_RPTBOX_RAGIONSOCIAL, 6700, 0, 8700, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_RAGIONSOCIAL, "69A088B7-5E88-4FE0-B72A-7B4D303F2D0A");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_RAGIONSOCIAL, "RAGIONSOCIAL");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_RAGIONSOCIAL, BUK_SITUACCESTAM_SPAN_CWSIRSVSASIS, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::RAGIONE_SOCIALE", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CWSIRSVSASIS, "C5AEE288-821C-4840-8F1A-89D37FA1311C");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CWSIRSVSASIS, "CWSIRSVSASIS");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_DETAIUOUTILI, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11599873, "");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, "88159687-3333-410D-8336-B40A48D683C3");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, "DETAIUOUTILI");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_DETAIUOUTILI, BUK_SITUACCESTAM_RPTBOX_DESCRUOUTILI, 6700, 0, 8700, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_DESCRUOUTILI, "9942ACFB-6921-4104-8DF0-2E211B14DDC4");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_DESCRUOUTILI, BUK_SITUACCESTAM_SPAN_CWSIDUUVSASI, MyGlb.VIS_DEFAREPOSTYL, 5, 150, 0, 271384705, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_CWSIDUUVSASI, "04C9EBA9-BEC7-4443-A04F-E7FE2DC269DA");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_CWSIDUUVSASI, "CWSIDUUVSASI");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_RESCOMGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 11599873, "CFWRSIIMRECO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, "7A5E8F71-8D6C-45C0-9CA9-D779FABCACA6");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, "RESCOMGROFOO");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_TOTRESHEACO2, 11000, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTRESHEACO2, "E23D56AF-7988-44D9-8CF7-6B123D15833D");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTRESHEACO2, "TOTRESHEACO2");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTRESHEACO2, BUK_SITUACCESTAM_SPAN_TOTALECOMPE1, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271319425, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTALECOMPE1, "71F208C0-9D79-4919-A41D-88C549CCA4B7");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTALECOMPE1, "TOTALECOMPE1");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_TOTAIMPOIMP4, 15500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOIMP4, "BF16C8FD-56F7-46C9-A665-E4340ABC8CB6");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOIMP4, "TOTAIMPOIMP4");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOIMP4, BUK_SITUACCESTAM_SPAN_TOTAIMPOIMPA, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAIMPOIMPA, "091E1A26-2E62-4600-BC72-910BD5E16D62");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAIMPOIMPA, "TOTAIMPOIMPA");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_TOTALEMANOR4, 18300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTALEMANOR4, "F043A5F2-A529-43DF-8907-226900433AAE");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTALEMANOR4, "TOTALEMANOR4");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTALEMANOR4, BUK_SITUACCESTAM_SPAN_TOTALEMANORD, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTALEMANORD, "5F525B4F-7B13-40FA-A6F1-7D9571F705F9");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTALEMANORD, "TOTALEMANORD");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_TOTALEDISPO4, 21100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTALEDISPO4, "FEC52028-CA06-46F2-A0A3-509E4AB81C22");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTALEDISPO4, "TOTALEDISPO4");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTALEDISPO4, BUK_SITUACCESTAM_SPAN_TOTALEDISPON, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTALEDISPON, "84519BE7-C47A-408F-BECD-E02F1EC343E3");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTALEDISPON, "TOTALEDISPON");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_RESCOMGROFOO, BUK_SITUACCESTAM_RPTBOX_BARRARESCOMP, 15500, 0, 8400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_BARRARESCOMP, "67D4990A-A863-40DE-B70C-67FD2667B85B");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_BARRARESCOMP, "BARRARESCOMP");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_VOCPEGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124161, "VOCE_PEG");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_VOCPEGGROFOO, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_VOCPEGGROFOO, "DB2A7AAD-DFC6-4450-92E2-44C6C7C57E5C");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_PROUOGROFOBA, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_PROUOGROFOBA, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_PROUOGROFOBA, "1FEFBB50-E90B-4A0A-820E-175A22A11E1C");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_PROUOGROFOBA, "PROUOGROFOBA");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFOBA, BUK_SITUACCESTAM_RPTBOX_BARRAUO, 15500, 0, 8400, 100, 0, 1, 1, MyGlb.VIS_BORDINFEDOPP, 983041, 0, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_BARRAUO, "972DC279-D6F6-4B9C-A190-F84D03C00FF7");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_BARRAUO, "BARRAUO");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_PROUOGROFORE, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_PROUOGROFORE, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_PROUOGROFORE, "A8F1E312-7F45-4A67-A26B-060879B6EBC8");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_PROUOGROFORE, "PROUOGROFORE");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFORE, BUK_SITUACCESTAM_RPTBOX_TOTGENRESHEA, 11000, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTGENRESHEA, "14D145CB-7CD8-44EC-957A-3C20DB1A3D4D");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTGENRESHEA, "TOTGENRESHEA");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTGENRESHEA, BUK_SITUACCESTAM_SPAN_TOTAGENERESI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Residui", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAGENERESI, "BC629D7C-B0C6-4500-9F3E-E680A4CE95F9");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAGENERESI, "TOTAGENERESI");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFORE, BUK_SITUACCESTAM_RPTBOX_TOTAIMPORESI, 15500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTAIMPORESI, "85D6C8CB-CC6D-43A8-8CE9-7942851EF2E6");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTAIMPORESI, BUK_SITUACCESTAM_SPAN_TOTAIMPORESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAIMPORESI, "A8AF000C-B32A-4250-BA4E-D182DA989FE7");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAIMPORESI, "TOTAIMPORESI");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFORE, BUK_SITUACCESTAM_RPTBOX_TOTAMANDRESI, 18300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTAMANDRESI, "DA3A9E54-E29B-45D9-820F-933D5E25DB88");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTAMANDRESI, BUK_SITUACCESTAM_SPAN_TOTAMANDRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAMANDRESI, "BCF12206-D1C9-48E4-882C-94B382151F06");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAMANDRESI, "TOTAMANDRESI");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFORE, BUK_SITUACCESTAM_RPTBOX_TOTADISPRESI, 21100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTADISPRESI, "16EB0DF9-FEB2-46EF-AB5A-123B87015308");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTADISPRESI, BUK_SITUACCESTAM_SPAN_TOTADISPRESI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTADISPRESI, "141C8D66-2370-435C-BDB4-58245DC3EFC7");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTADISPRESI, "TOTADISPRESI");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_PROUOGROFOCO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, "3A12BA92-C0EE-47C3-8616-F4EC117A3A1E");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, "PROUOGROFOCO");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, BUK_SITUACCESTAM_RPTBOX_TOTGENCOMHEA, 11000, 100, 4300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTGENCOMHEA, "7D6AFF8B-7E40-424E-99E3-0633BB22DCAA");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTGENCOMHEA, "TOTGENCOMHEA");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTGENCOMHEA, BUK_SITUACCESTAM_SPAN_TOTAGENECOMP, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Competenza", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAGENECOMP, "5925F4DD-4DB6-4994-B072-5EEE9AAE8334");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAGENECOMP, "TOTAGENECOMP");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, BUK_SITUACCESTAM_RPTBOX_TOTAIMPOCOMP, 15500, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOCOMP, "FDA33F8D-DD53-4600-B1C5-378A4B0F81B6");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTAIMPOCOMP, BUK_SITUACCESTAM_SPAN_TOTAIMPOCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAIMPOCOMP, "D32EBE36-157B-421E-BBB8-7AE2D7B82665");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAIMPOCOMP, "TOTAIMPOCOMP");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, BUK_SITUACCESTAM_RPTBOX_TOTAMANDCOMP, 18300, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTAMANDCOMP, "996B68EE-1D53-4F07-A4FC-6B35395DD134");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTAMANDCOMP, BUK_SITUACCESTAM_SPAN_TOTAMANDCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTAMANDCOMP, "F1FFE6A3-A61E-4B25-90BF-32BA317749CB");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTAMANDCOMP, "TOTAMANDCOMP");
    BUK_SITUACCESTAM.InitReportBox(BUK_SITUACCESTAM_SEC_PROUOGROFOCO, BUK_SITUACCESTAM_RPTBOX_TOTADISPCOMP, 21100, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_RPTBOX_TOTADISPCOMP, "F536E045-79D7-44AF-8AAC-850FBC5DCA7F");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_RPTBOX_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITUACCESTAM.InitBoxSpan(BUK_SITUACCESTAM_RPTBOX_TOTADISPCOMP, BUK_SITUACCESTAM_SPAN_TOTADISPCOMP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SPAN_TOTADISPCOMP, "FD2DB484-7D30-41EB-9A9C-7243F745FCDB");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SPAN_TOTADISPCOMP, "TOTADISPCOMP");
    BUK_SITUACCESTAM.InitSection(BUK_SITUACCESTAM_RPT_SITACCPDFREP, BUK_SITUACCESTAM_SEC_PRUOGRFONUPA, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.SetSectionRendersInto(BUK_SITUACCESTAM_SEC_PRUOGRFONUPA, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
    BUK_SITUACCESTAM.SetRTCGuid(BUK_SITUACCESTAM_SEC_PRUOGRFONUPA, "4F7FC892-CE78-4A74-888F-4B98CAB88562");
    BUK_SITUACCESTAM.SetObjCode(BUK_SITUACCESTAM_SEC_PRUOGRFONUPA, "PRUOGRFONUPA");
    BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_PROUOGROHEA1, "CFWRSIIMPRUO");
    BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_SITUACCESTAM.AddReportGroup(BUK_SITUACCESTAM_SEC_RESCOMGROHEA, "CFWRSIIMRECO");
    BUK_SITUACCESTAM_RPT_SITACCPDFREP_InitQuery(false, true);
  }

  private void BUK_SITUACCESTAM_InitLinks()
  {
    BUK_SITUACCESTAM.SetBoxNextBox(BUK_SITUACCESTAM_RPTBOX_PAGEBODY3, BUK_SITUACCESTAM_RPTBOX_PAGEBODY3);
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
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnFormattingPage(PageID);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnConnecting(DBConn);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITUACCEREPO) BUK_SITUACCEREPO_OnPreview();
    if (SrcObj == BKW_SITUACCESTAM) BUK_SITUACCESTAM_OnPreview();
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
