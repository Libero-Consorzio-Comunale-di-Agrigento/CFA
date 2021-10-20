// **********************************************
// Esecutivita Variazioni Da Gs4
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsecutivitaVariazioniDaGs4 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ESECVARDAGS4_RADIOBUTTON = 0;
  private static int GRP_ESECVARDAGS4_VARIAZIONI = 1;

  private static int PFL_ESECVARDAGS4_PROPOSTA = 0;
  private static int PFL_ESECVARDAGS4_LABEL1 = 1;
  private static int PFL_ESECVARDAGS4_NUMEROPROPOS = 2;
  private static int PFL_ESECVARDAGS4_LABEL2 = 3;
  private static int PFL_ESECVARDAGS4_ANNOPROPOSTA = 4;
  private static int PFL_ESECVARDAGS4_TIPOBI = 5;
  private static int PFL_ESECVARDAGS4_NEWPANELLABE = 6;
  private static int PFL_ESECVARDAGS4_TIPOVARIAZIO = 7;
  private static int PFL_ESECVARDAGS4_ETICHEAVVISO = 8;
  private static int PFL_ESECVARDAGS4_ELABORA = 9;
  private static int PFL_ESECVARDAGS4_APRI = 10;
  private static int PFL_ESECVARDAGS4_ESECVARIDAGS = 11;

  private static int PPQRY_PAR17 = 0;


  IDPanel PAN_ESECVARDAGS4;
  CIDREObj BUK_ELEPRODIVESE;
  OBook BKW_ELEPRODIVESE;
  //
  // Template Pages constants
  private static int BUK_ELEPRODIVESE_MST_TEMPLATE = 1;
  private static int BUK_ELEPRODIVESE_RPTBOX_TESTATPAGIN1 = 2;
  private static int BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1 = 3;
  private static int BUK_ELEPRODIVESE_RPTBOX_PIEDEPAGINA1 = 4;
  private static int BUK_ELEPRODIVESE_RPTBOX_PAG1 = 5;
  private static int BUK_ELEPRODIVESE_SPAN_PAG1 = 6;
  private static int BUK_ELEPRODIVESE_RPTBOX_TITOLO2 = 7;
  private static int BUK_ELEPRODIVESE_SPAN_ELEPRODIVESE = 8;
  private static int BUK_ELEPRODIVESE_SPAN_TITOLO2 = 9;

  //
  // Reports constants
  private static int BUK_ELEPRODIVESE_RPT_REPORT = 10;
  private static int BUK_ELEPRODIVESE_SEC_INTESTREPORT = 11;
  private static int BUK_ELEPRODIVESE_SEC_INTESTPAGINA = 12;
  private static int BUK_ELEPRODIVESE_RPTBOX_PROPOSTA = 13;
  private static int BUK_ELEPRODIVESE_SPAN_PROPOSTA = 14;
  private static int BUK_ELEPRODIVESE_RPTBOX_DELIBERA = 15;
  private static int BUK_ELEPRODIVESE_SPAN_DELIBERA = 16;
  private static int BUK_ELEPRODIVESE_SEC_DETTAGLIO = 17;
  private static int BUK_ELEPRODIVESE_RPTBOX_PROPO = 18;
  private static int BUK_ELEPRODIVESE_SPAN_REPREVDGEPDE = 19;
  private static int BUK_ELEPRODIVESE_RPTBOX_DEL = 20;
  private static int BUK_ELEPRODIVESE_SPAN_REDEEVDGEPDE = 21;
  private static int BUK_ELEPRODIVESE_SEC_PIEDEPAGINA = 22;
  private static int BUK_ELEPRODIVESE_SEC_PIEDEREPORT = 23;
  private static int BUK_ELEPRODIVESE_RPTBOX_BORDO = 24;

  CIDREObj BUK_CONTDISDIBIL;
  OBook BKW_CONTDISDIBIL;
  //
  // Template Pages constants
  private static int BUK_CONTDISDIBIL_MST_TEMPLATE = 1;
  private static int BUK_CONTDISDIBIL_RPTBOX_TESTATPAGIN2 = 2;
  private static int BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2 = 3;
  private static int BUK_CONTDISDIBIL_RPTBOX_PIEDEPAGINA2 = 4;
  private static int BUK_CONTDISDIBIL_RPTBOX_PAG2 = 5;
  private static int BUK_CONTDISDIBIL_SPAN_PAG2 = 6;

  //
  // Reports constants
  private static int BUK_CONTDISDIBIL_RPT_REPORT = 7;
  private static int BUK_CONTDISDIBIL_SEC_INTESTREPORT = 8;
  private static int BUK_CONTDISDIBIL_SEC_INTESTPAGINA = 9;
  private static int BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD = 10;
  private static int BUK_CONTDISDIBIL_RPTBOX_TITOLO = 11;
  private static int BUK_CONTDISDIBIL_SPAN_CONTRODISPON = 12;
  private static int BUK_CONTDISDIBIL_SPAN_TITOLO1 = 13;
  private static int BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART2 = 14;
  private static int BUK_CONTDISDIBIL_SPAN_CAPITOLOART2 = 15;
  private static int BUK_CONTDISDIBIL_RPTBOX_COMPETENZA = 16;
  private static int BUK_CONTDISDIBIL_RPTBOX_COMPETELABEL = 17;
  private static int BUK_CONTDISDIBIL_SPAN_COMPETENZA = 18;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA2 = 19;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA8 = 20;
  private static int BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV2 = 21;
  private static int BUK_CONTDISDIBIL_SPAN_VARIAZPROVV2 = 22;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL2 = 23;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONRISUL2 = 24;
  private static int BUK_CONTDISDIBIL_RPTBOX_COMPETENZA1 = 25;
  private static int BUK_CONTDISDIBIL_RPTBOX_CASSALABEL1 = 26;
  private static int BUK_CONTDISDIBIL_SPAN_CASSA = 27;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA3 = 28;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA2 = 29;
  private static int BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV3 = 30;
  private static int BUK_CONTDISDIBIL_SPAN_VARIAZPROVV3 = 31;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL3 = 32;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONRISUL3 = 33;
  private static int BUK_CONTDISDIBIL_SEC_CAPARTINTGRU = 34;
  private static int BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART3 = 35;
  private static int BUK_CONTDISDIBIL_SPAN_CAPITOLOART3 = 36;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA4 = 37;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA3 = 38;
  private static int BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCO = 39;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA4 = 40;
  private static int BUK_CONTDISDIBIL_RPTBOX_RISULTANTECO = 41;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA5 = 42;
  private static int BUK_CONTDISDIBIL_RPTBOX_DISPOATTUACA = 43;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA6 = 44;
  private static int BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCA = 45;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA7 = 46;
  private static int BUK_CONTDISDIBIL_RPTBOX_RISULTANTECA = 47;
  private static int BUK_CONTDISDIBIL_SPAN_DISPONATTUA9 = 48;
  private static int BUK_CONTDISDIBIL_SEC_DETTAGLIO = 49;
  private static int BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU = 50;
  private static int BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT = 51;
  private static int BUK_CONTDISDIBIL_SEC_PIEDEPAGINA = 52;
  private static int BUK_CONTDISDIBIL_SEC_PIEDEREPORT = 53;

  CIDREObj BUK_CONTDISPFINA;
  OBook BKW_CONTDISPFINA;
  //
  // Template Pages constants
  private static int BUK_CONTDISPFINA_MST_TEMPLATE = 1;
  private static int BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA = 4;
  private static int BUK_CONTDISPFINA_RPTBOX_PAG = 5;
  private static int BUK_CONTDISPFINA_SPAN_PAG = 6;
  private static int BUK_CONTDISPFINA_RPTBOX_TITOLO1 = 7;
  private static int BUK_CONTDISPFINA_SPAN_TIT = 8;
  private static int BUK_CONTDISPFINA_SPAN_TITOLO = 9;

  //
  // Reports constants
  private static int BUK_CONTDISPFINA_RPT_REPORT = 10;
  private static int BUK_CONTDISPFINA_SEC_INTESTREPORT = 11;
  private static int BUK_CONTDISPFINA_SEC_INTESTPAGINA = 12;
  private static int BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1 = 13;
  private static int BUK_CONTDISPFINA_SPAN_CAPITOLOART1 = 14;
  private static int BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1 = 15;
  private static int BUK_CONTDISPFINA_SPAN_FINANZIAMEN1 = 16;
  private static int BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1 = 17;
  private static int BUK_CONTDISPFINA_SPAN_DISPONATTUA1 = 18;
  private static int BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1 = 19;
  private static int BUK_CONTDISPFINA_SPAN_DISPONRISUL1 = 20;
  private static int BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1 = 21;
  private static int BUK_CONTDISPFINA_SPAN_VARIAZPROVV1 = 22;
  private static int BUK_CONTDISPFINA_RPTBOX_OPERA1 = 23;
  private static int BUK_CONTDISPFINA_SPAN_NUOVASPAN = 24;
  private static int BUK_CONTDISPFINA_SEC_BILFINESINGR = 25;
  private static int BUK_CONTDISPFINA_SEC_CAPARTINTGRU = 26;
  private static int BUK_CONTDISPFINA_RPTBOX_CAPITOLOART = 27;
  private static int BUK_CONTDISPFINA_SPAN_CAPITOLOART = 28;
  private static int BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT = 29;
  private static int BUK_CONTDISPFINA_SPAN_FINANZIAMEN2 = 30;
  private static int BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL = 31;
  private static int BUK_CONTDISPFINA_SPAN_DISPONATTUAL = 32;
  private static int BUK_CONTDISPFINA_RPTBOX_DISPONRISULT = 33;
  private static int BUK_CONTDISPFINA_SPAN_DISPONRISULT = 34;
  private static int BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI = 35;
  private static int BUK_CONTDISPFINA_SPAN_VARIAZPROVVI = 36;
  private static int BUK_CONTDISPFINA_RPTBOX_OPERA = 37;
  private static int BUK_CONTDISPFINA_SPAN_FINANZIAMENT = 38;
  private static int BUK_CONTDISPFINA_SEC_DETTAGLIO = 39;
  private static int BUK_CONTDISPFINA_SEC_CAPARTPIEGRU = 40;
  private static int BUK_CONTDISPFINA_SEC_BILFINESPIGR = 41;
  private static int BUK_CONTDISPFINA_SEC_PIEDEPAGINA = 42;
  private static int BUK_CONTDISPFINA_SEC_PIEDEREPORT = 43;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR20(IMDB);
    //
    //
    Init_PQRY_PAR17(IMDB);
    Init_PQRY_PAR17_RS(IMDB);
    Init_PQRY_DEL2(IMDB);
    Init_PQRY_BIL5(IMDB);
    Init_PQRY_BILFIN4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR20(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR20, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR20, "TBL_PAR20");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_RONAESVADAGS, "RONAESVADAGS");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_RONAESVADAGS,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR20,IMDBDef3.FLD_PAR20_ROWNAMTIPVAR,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR20, 0);
  }

  private static void Init_PQRY_PAR17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR17, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR17, "PQRY_PAR17");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_RONAESVADAGS, "RONAESVADAGS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_RONAESVADAGS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17,IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR17, 0);
  }

  private static void Init_PQRY_PAR17_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR17_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR17_RS, "PQRY_PAR17_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_RONAESVADAGS, "RONAESVADAGS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_RONAESVADAGS,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR17_RS,IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR,1,1,0);
  }

  private static void Init_PQRY_DEL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_DEL2, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_DEL2, "PQRY_DEL2");
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDPROPOS, "RECORDPROPOS");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDPROPOS,5,212,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDDELIBE, "RECORDDELIBE");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDDELIBE,5,459,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELANNPRO, "RECDELANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELNUMPRO, "RECDELNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELUNIPRO, "RECDELUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECDELUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORANNODEL, "RECORANNODEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORNUMEDEL, "RECORNUMEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORSEDEDEL, "RECORSEDEDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORSEDEDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDFAKE, "RECORDFAKE");
    IMDB.SetFldParams(IMDBDef12.PQRY_DEL2,IMDBDef12.PQSL_DEL2_RECORDFAKE,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_DEL2, 0);
  }

  private static void Init_PQRY_BIL5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BIL5, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_BIL5, "PQRY_BIL5");
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORVARCOES, "RECORVARCOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORVARCOES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOCAPIARTI, "RECOCAPIARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOCAPIARTI,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOVARCCAPI, "RECOVARCCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOVARCCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOVARCARTI, "RECOVARCARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOVARCARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECVARPROCOM, "RECVARPROCOM");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECVARPROCOM,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECVARPROCAS, "RECVARPROCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECVARPROCAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORBILESER, "RECORBILESER");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORBILESER,3,12,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORBILDISP, "RECORBILDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECORBILDISP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOBILDISCA, "RECOBILDISCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL5,IMDBDef12.PQSL_BIL5_RECOBILDISCA,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BIL5, 0);
  }

  private static void Init_PQRY_BILFIN4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILFIN4, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILFIN4, "PQRY_BILFIN4");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECOBILFINES, "RECOBILFINES");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECOBILFINES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECOCAPIARTI, "RECOCAPIARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECOCAPIARTI,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINFIN, "RECBILFINFIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINFIN,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINOPE, "RECBILFINOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINOPE,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINDIS, "RECBILFINDIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINDIS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINVAR, "RECBILFINVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN4,IMDBDef12.PQSL_BILFIN4_RECBILFINVAR,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILFIN4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsecutivitaVariazioniDaGs4(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsecutivitaVariazioniDaGs4()
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
    FormIdx = MyGlb.FRM_ESECVARDAGS4;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EA1C3095-8D28-4B75-9E3A-7C83FCD3F1E4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 536;
    DesignHeight = 230;
    set_Caption(new IDVariant("Esecutivita Variazioni Da Gs4"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 536;
    Frames[1].Height = 204;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Esecutività Variazioni Da Gs4";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 204;
    PAN_ESECVARDAGS4 = new IDPanel(w, this, 1, "PAN_ESECVARDAGS4");
    Frames[1].Content = PAN_ESECVARDAGS4;
    PAN_ESECVARDAGS4.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESECVARDAGS4.VS = MainFrm.VisualStyleList;
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 536-MyGlb.PAN_OFFS_X, 204-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "24D05001-A80A-4589-B422-ACDE4D99DE17");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESECVARDAGS4.InitStatus = 2;
    PAN_ESECVARDAGS4_Init();
    PAN_ESECVARDAGS4_InitFields();
    PAN_ESECVARDAGS4_InitQueries();
    BKW_ELEPRODIVESE = new OBook(this);
    BUK_ELEPRODIVESE = new CIDREObj(BKW_ELEPRODIVESE);
    BKW_ELEPRODIVESE.iGuid = "5E3AE94A-ADBB-4086-8FB8-F0C51E04132E";
    BKW_ELEPRODIVESE.Code = "BUK_ELEPRODIVESE";
    BKW_ELEPRODIVESE.BookObj = BUK_ELEPRODIVESE;
    BKW_ELEPRODIVESE.InitDefMasks();
    BUK_ELEPRODIVESE.InitBook(1, 1245185, "Elenco Proposte Divenute Esecutive", IMDB, MainFrm.VisualStyleList);
    BUK_ELEPRODIVESE.InitHTML();
    BUK_ELEPRODIVESE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ELEPRODIVESE.Book.SetMainFrm(MainFrm);
    BUK_ELEPRODIVESE.SetRTCGuid(0, "5E3AE94A-ADBB-4086-8FB8-F0C51E04132E");
    BUK_ELEPRODIVESE.SetObjCode(0, "ELEPRODIVESE");
    BUK_ELEPRODIVESE_MST_TEMPLATE_Init();
    BUK_ELEPRODIVESE_RPT_REPORT_Init();
    BUK_ELEPRODIVESE_InitLinks();
    BKW_CONTDISDIBIL = new OBook(this);
    BUK_CONTDISDIBIL = new CIDREObj(BKW_CONTDISDIBIL);
    BKW_CONTDISDIBIL.iGuid = "75FB67F7-E345-4AE4-B511-DB818E84914C";
    BKW_CONTDISDIBIL.Code = "BUK_CONTDISDIBIL";
    BKW_CONTDISDIBIL.BookObj = BUK_CONTDISDIBIL;
    BKW_CONTDISDIBIL.InitDefMasks();
    BUK_CONTDISDIBIL.InitBook(1, 1245441, "Controllo Disponibilità Di Bilancio", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISDIBIL.InitHTML();
    BUK_CONTDISDIBIL.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISDIBIL.Book.SetMainFrm(MainFrm);
    BUK_CONTDISDIBIL.SetRTCGuid(0, "75FB67F7-E345-4AE4-B511-DB818E84914C");
    BUK_CONTDISDIBIL.SetObjCode(0, "CONTDISDIBIL");
    BUK_CONTDISDIBIL_MST_TEMPLATE_Init();
    BUK_CONTDISDIBIL_RPT_REPORT_Init();
    BUK_CONTDISDIBIL_InitLinks();
    BKW_CONTDISPFINA = new OBook(this);
    BUK_CONTDISPFINA = new CIDREObj(BKW_CONTDISPFINA);
    BKW_CONTDISPFINA.iGuid = "D7A16CE4-CA35-4809-8296-4718650DA128";
    BKW_CONTDISPFINA.Code = "BUK_CONTDISPFINA";
    BKW_CONTDISPFINA.BookObj = BUK_CONTDISPFINA;
    BKW_CONTDISPFINA.InitDefMasks();
    BUK_CONTDISPFINA.InitBook(1, 1245441, "Controllo Disponibilità Finanziamento", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISPFINA.InitHTML();
    BUK_CONTDISPFINA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISPFINA.Book.SetMainFrm(MainFrm);
    BUK_CONTDISPFINA.SetRTCGuid(0, "D7A16CE4-CA35-4809-8296-4718650DA128");
    BUK_CONTDISPFINA.SetObjCode(0, "CONTDISPFINA");
    BUK_CONTDISPFINA_MST_TEMPLATE_Init();
    BUK_CONTDISPFINA_RPT_REPORT_Init();
    BUK_CONTDISPFINA_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR20, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESECVARDAGS4_PAR17();
      }
      PAN_ESECVARDAGS4.UpdatePanel(MainFrm);
      // BUK_ELEPRODIVESE.UpdateBook();
      // BUK_CONTDISDIBIL.UpdateBook();
      // BUK_CONTDISPFINA.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ESECVARDAGS4.FrIndex)
    {
      if (IdxFieldActived ==PFL_ESECVARDAGS4_APRI) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_ELEPRODIVESE")) return BUK_ELEPRODIVESE;
    if (Code.equals("BUK_CONTDISDIBIL")) return BUK_CONTDISDIBIL;
    if (Code.equals("BUK_CONTDISPFINA")) return BUK_CONTDISPFINA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof EsecutivitaVariazioniDaGs4);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsecutivitaVariazioniDaGs4.class.getName() : (Glb.ClassWithPackage(EsecutivitaVariazioniDaGs4.class) ? EsecutivitaVariazioniDaGs4.class.getName().substring(EsecutivitaVariazioniDaGs4.class.getPackage().getName().length() + 1) : EsecutivitaVariazioniDaGs4.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(2)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0)))
          {
            IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
            v_ERROR = (new IDVariant("Errore. Proposta non indicata o incompleta", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERROR); 
            return 0;
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0))))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE A ");
          SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
            v_ERRORMESSAGE = (new IDVariant("Errore. Proposta inserita inesistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(3)), true))
      {
        BUK_ELEPRODIVESE.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_ELEPRODIVESE.RefreshQuery();
        BUK_ELEPRODIVESE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_ELEPRODIVESE.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      // 
      // --------------------------------------------------
      // ---------------------------
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(2)), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMETIPBI, 0).equals((new IDVariant("B")), true))
        {
          BUK_CONTDISDIBIL.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_CONTDISDIBIL.RefreshQuery();
          BUK_CONTDISDIBIL.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          MainFrm.set_RedirectTo((new IDVariant(BUK_CONTDISDIBIL.GetWebFileName())));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
        if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMETIPBI, 0).equals((new IDVariant("P")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Esecutivita_Variazioni_rpp"));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMERO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_UNITA_PROP")), IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0));
          MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMETIPBI, 0).equals((new IDVariant("F")), true))
        {
          BUK_CONTDISPFINA.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_CONTDISPFINA.RefreshQuery();
          BUK_CONTDISPFINA.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          MainFrm.set_RedirectTo((new IDVariant(BUK_CONTDISPFINA.GetWebFileName())));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
      }
      // 
      // ==================================================
      // =============================0000
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILESECUTIVITAVARIAZIONIDEL(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, 0), IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0), MainFrm.PROGRESESSIO);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, 0).equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
            // MainFrm.Show(MyGlb.FRM_SITUVARITRAT, (new IDVariant(-1)).intValue(), this); 
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  WRK_CONTROLLO_ESEC_VAR A ");
            SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NVL(A.STN_CA, 0) > NVL(A.STN_CO, 0) + NVL(A.RESIDUI, 0)) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.Show(MyGlb.FRM_SITUVARITRAT, (new IDVariant(-1)).intValue(), this); 
            }
            else
            {
              MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
            }
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAM174, IMDBDef1.FLD_PARAM174_PARAMDELESEC, 0, (new IDVariant("SI")));
      }
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "ApriProposta", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMETIPBI, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_RONAESVADAGS, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMTIPVAR, 0, (new IDVariant(1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "LoadEvent", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "EndModalEvent", _e);
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
      UNLOADEVENT_PARDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMETIPBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_RONAESVADAGS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMTIPVAR, 0, new IDVariant());
  }

  // **********************************************************************
  // Esecutività Variazioni Da Gs4 On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESECVARDAGS4_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esecutività Variazioni Da Gs4 On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ESECVARDAGS4_PROPOSTA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "EsecutivitàVariazioniDaGs4OnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Variazioni Da Gs4 On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESECVARDAGS4_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESECVARDAGS4);
      // 
      // Esecutività Variazioni Da Gs4 On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, 0).equals((new IDVariant(1)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_ESECVARIDAGS);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, 0).equals((new IDVariant(2)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_ESECVARIDAGS);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_ROWNAMTIPVAR, 0).equals((new IDVariant(3)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_ESECVARIDAGS);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Aggiornamento Esecutività") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Solo Controllo Disponibilità") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Solo Elenco Proposte") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(3)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_TIPOVARIAZIO);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        if (MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
        {
          PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(2)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_TIPOVARIAZIO);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PAR17, IMDBDef12.PQSL_PAR17_RONAESVADAGS, 0).equals((new IDVariant(1)), true))
      {
        PAN_ESECVARDAGS4.ClearValueList(PFL_ESECVARDAGS4_TIPOVARIAZIO);
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        if (MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
        {
          PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Provvisorie") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Definitive") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Impegnabile") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESECVARDAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioniDaGs4", "EsecutivitàVariazioniDaGs4OnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ESECVARDAGS4_PAR17() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR17_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR20, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR20, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR17_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR17_RS, 0, IMDBDef3.TBL_PAR20, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 0, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 1, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 2, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 3, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMETIPBI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 4, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_RONAESVADAGS, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR17_RS, 5, 0, IMDBDef3.TBL_PAR20, IMDBDef3.FLD_PAR20_ROWNAMTIPVAR, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR20, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR20, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR20, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR17_RS, 0);
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
  private void PAN_ESECVARDAGS4_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESECVARDAGS4, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESECVARDAGS4_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESECVARDAGS4, Cancel);
    // Stub
  }

  private void PAN_ESECVARDAGS4_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESECVARDAGS4_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESECVARDAGS4.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECVARDAGS4_APRI)
    {
      this.IdxPanelActived = this.PAN_ESECVARDAGS4.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESECVARDAGS4_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESECVARDAGS4_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESECVARDAGS4_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESECVARDAGS4_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ELEPRODIVESE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ELEPRODIVESE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELEPRODIVESE_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_ELEPRODIVESE_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_ELEPRODIVESE_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_ELEPRODIVESE_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_ELEPRODIVESE_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_ELEPRODIVESE_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ELEPRODIVESE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ELEPRODIVESE_MST_TEMPLATE)
    {
      BUK_ELEPRODIVESE.set_SpanValue(BUK_ELEPRODIVESE_SPAN_PAG1, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_ELEPRODIVESE.GetPageNumber())))), (new IDVariant("di"))), IDL.ToString((new IDVariant(BUK_ELEPRODIVESE.GetTotalPagesNumber()))))));
      BUK_ELEPRODIVESE.set_SpanValue(BUK_ELEPRODIVESE_SPAN_TITOLO2, new IDVariant(IDL.Add(BUK_ELEPRODIVESE.SpanValue(BUK_ELEPRODIVESE_SPAN_ELEPRODIVESE), IDL.Upper(MainFrm.ESERCIZIO))));
    }
  }

  private void BUK_ELEPRODIVESE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ELEPRODIVESE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ELEPRODIVESE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ELEPRODIVESE_OnPreview()
  {
    PreviewBook = BKW_ELEPRODIVESE;
    SetRD();
  }

  private void BUK_CONTDISDIBIL_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTDISDIBIL_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTDISDIBIL_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD)
    {
      BUK_CONTDISDIBIL.set_SpanValue(BUK_CONTDISDIBIL_SPAN_TITOLO1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_CONTDISDIBIL.SpanValue(BUK_CONTDISDIBIL_SPAN_CONTRODISPON), IDL.Upper(MainFrm.ESERCIZIO)), (new IDVariant(" - "))), ((BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECORVARCOES").equals((new IDVariant("E"))))?(new IDVariant("Entrate")):(new IDVariant("Spese"))))));
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_CAPARTINTGRU)
    {
      BUK_CONTDISDIBIL.set_SpanValue(BUK_CONTDISDIBIL_SPAN_CAPITOLOART3, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECOVARCCAPI")), (new IDVariant("/"))), IDL.ToString(BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECOVARCARTI")))));
      BUK_CONTDISDIBIL.set_SpanValue(BUK_CONTDISDIBIL_SPAN_DISPONATTUA5, new IDVariant(IDL.Add(BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECORBILDISP"), BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECVARPROCOM"))));
      BUK_CONTDISDIBIL.set_SpanValue(BUK_CONTDISDIBIL_SPAN_DISPONATTUA9, new IDVariant(IDL.Add(BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECVARPROCAS"), BUK_CONTDISDIBIL.GetReportColumn(BUK_CONTDISDIBIL_RPT_REPORT, "RECOBILDISCA"))));
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_CONTDISDIBIL_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_CONTDISDIBIL_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTDISDIBIL_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTDISDIBIL_MST_TEMPLATE)
    {
      BUK_CONTDISDIBIL.set_SpanValue(BUK_CONTDISDIBIL_SPAN_PAG2, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_CONTDISDIBIL.GetPageNumber())))), (new IDVariant("di"))), IDL.ToString((new IDVariant(BUK_CONTDISDIBIL.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTDISDIBIL_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTDISDIBIL_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTDISDIBIL_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTDISDIBIL_OnPreview()
  {
    PreviewBook = BKW_CONTDISDIBIL;
    SetRD();
  }

  private void BUK_CONTDISPFINA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTDISPFINA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTDISPFINA_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_BILFINESINGR)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_CAPARTINTGRU)
    {
      BUK_CONTDISPFINA.set_SpanValue(BUK_CONTDISPFINA_SPAN_DISPONRISULT, new IDVariant(IDL.Add(BUK_CONTDISPFINA.GetReportColumn(BUK_CONTDISPFINA_RPT_REPORT, "RECBILFINDIS"), BUK_CONTDISPFINA.GetReportColumn(BUK_CONTDISPFINA_RPT_REPORT, "RECBILFINVAR"))));
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_CAPARTPIEGRU)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_BILFINESPIGR)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_CONTDISPFINA_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_CONTDISPFINA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTDISPFINA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTDISPFINA_MST_TEMPLATE)
    {
      BUK_CONTDISPFINA.set_SpanValue(BUK_CONTDISPFINA_SPAN_PAG, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_CONTDISPFINA.GetPageNumber())))), (new IDVariant("di"))), IDL.ToString((new IDVariant(BUK_CONTDISPFINA.GetTotalPagesNumber()))))));
      BUK_CONTDISPFINA.set_SpanValue(BUK_CONTDISPFINA_SPAN_TITOLO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_CONTDISPFINA.SpanValue(BUK_CONTDISPFINA_SPAN_TIT), IDL.Upper(MainFrm.ESERCIZIO)), (new IDVariant(" - "))), ((BUK_CONTDISPFINA.GetReportColumn(BUK_CONTDISPFINA_RPT_REPORT, "RECOBILFINES").equals((new IDVariant("E"))))?(new IDVariant("Entrate")):(new IDVariant("Spese"))))));
    }
  }

  private void BUK_CONTDISPFINA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTDISPFINA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTDISPFINA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTDISPFINA_OnPreview()
  {
    PreviewBook = BKW_CONTDISPFINA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESECVARDAGS4_Init()
  {

    PAN_ESECVARDAGS4.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESECVARDAGS4.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, "E5D5CACF-EA12-46F2-8801-60BD55719683");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, "Radio Button");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, MyGlb.VIS_GROUPSTYLE);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, 0, 73);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, 1, 13);
    PAN_ESECVARDAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, 0, 4);
    PAN_ESECVARDAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, 1, 1);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_RADIOBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, "48876DB8-F757-4126-A54E-3EC0A61908CC");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, "Variazioni");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 92, 16, 0, 0);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, MyGlb.PANEL_FORM, 8, 83, 484, 49, 0, 0);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, 0, 55);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, 1, 13);
    PAN_ESECVARDAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, 0, 4);
    PAN_ESECVARDAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, 1, 4);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_GROUP, GRP_ESECVARDAGS4_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESECVARDAGS4.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, "CBB1586D-0ADB-4B92-8A8C-1545B7CA7EF5");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, "Proposta");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, "5D660BE3-4E65-4EF7-9C8D-0A3BF203D6DF");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, "-");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, "FFA351CF-CE02-4AC8-AEF6-CB38339C15A0");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, "Numero Proposta");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, "E246DD31-D424-45AB-9823-982E6F6785A5");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, "/");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, "04E81968-70B0-440C-9990-2ABBFC4B16FB");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, "Anno Proposta");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, "6E03B6FD-4947-4815-8425-36D48437C19F");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, "Tipo Bi");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.VIS_OPTIONBUTTON);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, "8BF7D11A-393B-4F14-9C85-9825149AA292");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, "AAE6A563-A9E7-42BB-A1E8-FB9FB1AF0C61");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, "Tipo Variazioni");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, "D3EC9822-BC9E-48E8-BB17-7E887B5C08A6");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, "Se non viene indicata nessuna proposta, saranno rese esecutive tutte le variazioni su proposte esecutive in GS4");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.VIS_VUOGRAALILEF);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, "3CEF3495-596C-47BE-82A6-4B9842B831DF");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, "Elabora");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECVARDAGS4.SetImage(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, 0, "button1.gif", false);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, "28B2D067-6D53-4A06-8080-979A6FAABA12");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.VIS_STATICBUTTON);
    PAN_ESECVARDAGS4.SetImage(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, 0, "wsearch1.gif", false);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECVARDAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, "14151D9A-1F4F-473E-9325-C6BB7DD2F897");
    PAN_ESECVARDAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, "Esecutività Variazioni Da Gs");
    PAN_ESECVARDAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, "");
    PAN_ESECVARDAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.VIS_OPTIONBUTTON);
    PAN_ESECVARDAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESECVARDAGS4_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_FORM, 176, 16, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_PROPOSTA, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_PROPOSTA, PPQRY_PAR17, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_LIST, 144, 4, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_FORM, 348, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL1, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_LABEL1, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 368, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 60);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, "Num. Prp.");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_NUMEROPROPOS, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_NUMEROPROPOS, PPQRY_PAR17, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_LIST, 152, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_FORM, 416, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_LABEL2, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_LABEL2, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_LABEL2, -1, "", "LABEL2", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 112, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 436, 16, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Ann. Prp.");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_ANNOPROPOSTA, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_ANNOPROPOSTA, PPQRY_PAR17, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_LIST, 152, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_LIST, 40);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_LIST, "Tipo Bi");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_FORM, 180, 56, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_FORM, 160);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOBI, MyGlb.PANEL_FORM, "Tipo Bi");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_TIPOBI, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_TIPOBI, PPQRY_PAR17, "A.ROWNAMETIPBI", "ROWNAMETIPBI", 12, 1, 0, -13997);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOBI, (new IDVariant("B")), "di Bilancio", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOBI, (new IDVariant("P")), "di Progetto", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOBI, (new IDVariant("F")), "di Finanziamento", "", "", -1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 140, 104, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 108, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_NEWPANELLABE, -1, GRP_ESECVARDAGS4_VARIAZIONI);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_LIST, 92);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazioni");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_FORM, 108, 108, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_FORM, 92);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazioni");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_TIPOVARIAZIO, -1, GRP_ESECVARDAGS4_VARIAZIONI);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_TIPOVARIAZIO, PPQRY_PAR17, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 1, 0, -13997);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(1)), "Provvisorie", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(2)), "Definitive", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_TIPOVARIAZIO, (new IDVariant(3)), "Impegnabile", "", "", -1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 8, 140, 384, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 2);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 8, 140, 384, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 2);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_ETICHEAVVISO, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_ETICHEAVVISO, -1, "", "ETICHEAVVISO", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_LIST, 356, 140, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_FORM, 412, 140, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_ELABORA, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_LIST, 428, 20, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_LIST, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_FORM, 476, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_FORM, 0);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_APRI, MyGlb.PANEL_FORM, 1);
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_APRI, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_LIST, 164);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_LIST, 1);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_LIST, "Esecutività Variazioni Da Gs");
    PAN_ESECVARDAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_FORM, 8, 16, 164, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECVARDAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_FORM, 164);
    PAN_ESECVARDAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_FORM, 4);
    PAN_ESECVARDAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECVARDAGS4_ESECVARIDAGS, MyGlb.PANEL_FORM, "Esecutività Variazioni Da Gs");
    PAN_ESECVARDAGS4.SetFieldPage(PFL_ESECVARDAGS4_ESECVARIDAGS, -1, -1);
    PAN_ESECVARDAGS4.SetFieldPanel(PFL_ESECVARDAGS4_ESECVARIDAGS, PPQRY_PAR17, "A.RONAESVADAGS", "RONAESVADAGS", 1, 1, 0, -13997);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(1)), "Aggiornamento Esecutività", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(2)), "Solo Controllo Disponibilità", "", "", -1);
    PAN_ESECVARDAGS4.SetValueListItem(PFL_ESECVARDAGS4_ESECVARIDAGS, (new IDVariant(3)), "Solo Elenco Proposte", "", "", -1);
  }

  private void PAN_ESECVARDAGS4_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESECVARDAGS4.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESECVARDAGS4.SetIMDB(IMDB, "PQRY_PAR17", true);
    PAN_ESECVARDAGS4.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESECVARDAGS4.SetQueryIMDB(PPQRY_PAR17, IMDBDef12.PQRY_PAR17_RS, IMDBDef3.TBL_PAR20);
    JustLoaded = true;
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_PROPOSTA, IMDBDef3.FLD_PAR20_ROWNAMUNIPRO);
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_NUMEROPROPOS, IMDBDef3.FLD_PAR20_ROWNAMNUMPRO);
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_ANNOPROPOSTA, IMDBDef3.FLD_PAR20_ROWNAMANNPRO);
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_TIPOBI, IMDBDef3.FLD_PAR20_ROWNAMETIPBI);
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_TIPOVARIAZIO, IMDBDef3.FLD_PAR20_ROWNAMTIPVAR);
    PAN_ESECVARDAGS4.SetFieldPrimaryIndex(PFL_ESECVARDAGS4_ESECVARIDAGS, IMDBDef3.FLD_PAR20_RONAESVADAGS);
    PAN_ESECVARDAGS4.SetMasterTable(0, "PAR20");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESECVARDAGS4.Status() == 2)
    {
      int oldListQBE = PAN_ESECVARDAGS4.iUseListQBE;
      PAN_ESECVARDAGS4.iUseListQBE = 0;
      PAN_ESECVARDAGS4.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESECVARDAGS4.PanelCommand(Glb.PCM_FIND);
      PAN_ESECVARDAGS4.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ELEPRODIVESE_MST_TEMPLATE_Init()
  {
    BUK_ELEPRODIVESE.InitMastro(BUK_ELEPRODIVESE_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_MST_TEMPLATE, "B047CF77-C493-4172-84C2-4876AB1F373B");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_MST_TEMPLATE, "TEMPLATE");
    BUK_ELEPRODIVESE.InitMastroBox(BUK_ELEPRODIVESE_MST_TEMPLATE, BUK_ELEPRODIVESE_RPTBOX_TESTATPAGIN1, 1000, 600, 19000, 2100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_TESTATPAGIN1, "AE5A8B3A-3106-4818-9848-E7D718D3EDB2");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_TESTATPAGIN1, "TESTATPAGIN1");
    BUK_ELEPRODIVESE.InitMastroBox(BUK_ELEPRODIVESE_MST_TEMPLATE, BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1, 1000, 2700, 19000, 25800, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1, "C34BBA8D-A214-4D17-9385-3039AB3981AB");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1, "CORPOPAGINA1");
    BUK_ELEPRODIVESE.InitMastroBox(BUK_ELEPRODIVESE_MST_TEMPLATE, BUK_ELEPRODIVESE_RPTBOX_PIEDEPAGINA1, 1000, 28500, 19000, 800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_PIEDEPAGINA1, "C3D1D5F0-857C-4479-B298-4B60BFE0F38D");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_PIEDEPAGINA1, "PIEDEPAGINA1");
    BUK_ELEPRODIVESE.InitMastroBox(BUK_ELEPRODIVESE_MST_TEMPLATE, BUK_ELEPRODIVESE_RPTBOX_PAG1, 17700, 600, 2300, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_PAG1, "E3FA704C-152D-4F2C-8E18-BA170620C92A");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_PAG1, "PAG1");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_PAG1, BUK_ELEPRODIVESE_SPAN_PAG1, MyGlb.VIS_NORMAA8RIGHT, 5, 204, 0, 271319169, "", "", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_PAG1, "BD8A362F-FC9D-4458-B148-F7EA9D7F8503");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_PAG1, "PAG1");
    BUK_ELEPRODIVESE.InitMastroBox(BUK_ELEPRODIVESE_MST_TEMPLATE, BUK_ELEPRODIVESE_RPTBOX_TITOLO2, 1000, 1200, 19000, 600, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_TITOLO2, "52547C1A-514C-4D53-9BF3-31D8F9C8BB6C");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_TITOLO2, "TITOLO2");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_TITOLO2, BUK_ELEPRODIVESE_SPAN_ELEPRODIVESE, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Elenco Proposte Divenute Esecutive", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_ELEPRODIVESE, "2797F226-8D8A-4969-B6C5-D68E5E31BDCA");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_ELEPRODIVESE, "ELEPRODIVESE");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_TITOLO2, BUK_ELEPRODIVESE_SPAN_TITOLO2, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271319425, "Elenco Proposte Divenute Esecutive", "", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_TITOLO2, "66D34887-E3E8-45AB-9250-ACA0CD7B920A");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_TITOLO2, "TITOLO2");
  }

  private void BUK_ELEPRODIVESE_RPT_REPORT_InitQuery() { BUK_ELEPRODIVESE_RPT_REPORT_InitQuery(true, true); }
  private void BUK_ELEPRODIVESE_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.UNITA_PRO || ' - ' || TO_CHAR ( A.NUMERO_PRO ) || ' / ' || TO_CHAR ( A.ANNO_PRO ) as RECORDPROPOS, ");
      SQL.append("  A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) as RECORDDELIBE, ");
      SQL.append("  A.ANNO_PRO as RECDELANNPRO, ");
      SQL.append("  A.NUMERO_PRO as RECDELNUMPRO, ");
      SQL.append("  A.UNITA_PRO as RECDELUNIPRO, ");
      SQL.append("  A.ANNO_DEL as RECORANNODEL, ");
      SQL.append("  A.NUMERO_DEL as RECORNUMEDEL, ");
      SQL.append("  A.SEDE_DEL as RECORSEDEDEL, ");
      SQL.append("  SUM(1) as RECORDFAKE ");
      SQL.append("from ");
      SQL.append("  DEL A, ");
      SQL.append("  VARCOMPRO B, ");
      SQL.append("  T10 C ");
      SQL.append("where (C.CODICE = A.TIPO_ESEC) ");
      SQL.append("and   (C.P_D_E = 'E') ");
      SQL.append("and   ((B.ANNO_DEL IS NULL)) ");
      SQL.append("and   (B.ANNO_PROPOSTA = A.ANNO_PRO) ");
      SQL.append("and   (B.NUMERO_PROPOSTA = A.NUMERO_PRO) ");
      SQL.append("and   (B.UNITA_PROPONENTE = A.UNITA_PRO) ");
      SQL.append("and   (~~TBL_PAR20.ROWNAMTIPVAR~~ = 1) ");
      SQL.append("group by ");
      SQL.append("  A.ANNO_PRO, ");
      SQL.append("  A.NUMERO_PRO, ");
      SQL.append("  A.UNITA_PRO, ");
      SQL.append("  A.ANNO_DEL, ");
      SQL.append("  A.NUMERO_DEL, ");
      SQL.append("  A.SEDE_DEL ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  D.UNITA_PRO || ' - ' || TO_CHAR ( D.NUMERO_PRO ) || ' / ' || TO_CHAR ( D.ANNO_PRO ), ");
      SQL.append("  D.SEDE_DEL || ' - ' || TO_CHAR ( D.NUMERO_DEL ) || ' / ' || TO_CHAR ( D.ANNO_DEL ), ");
      SQL.append("  D.ANNO_PRO, ");
      SQL.append("  D.NUMERO_PRO, ");
      SQL.append("  D.UNITA_PRO, ");
      SQL.append("  D.ANNO_DEL, ");
      SQL.append("  D.NUMERO_DEL, ");
      SQL.append("  D.SEDE_DEL, ");
      SQL.append("  SUM(1) ");
      SQL.append("from ");
      SQL.append("  DEL D, ");
      SQL.append("  VARCOM E ");
      SQL.append("where (E.ANNO_PROPOSTA = D.ANNO_PRO) ");
      SQL.append("and   (E.NUMERO_PROPOSTA = D.NUMERO_PRO) ");
      SQL.append("and   (E.UNITA_PROPONENTE = D.UNITA_PRO) ");
      SQL.append("and   (~~TBL_PAR20.ROWNAMTIPVAR~~ = 2) ");
      SQL.append("group by ");
      SQL.append("  D.ANNO_PRO, ");
      SQL.append("  D.NUMERO_PRO, ");
      SQL.append("  D.UNITA_PRO, ");
      SQL.append("  D.ANNO_DEL, ");
      SQL.append("  D.NUMERO_DEL, ");
      SQL.append("  D.SEDE_DEL ");
      BUK_ELEPRODIVESE.SetReportQuery(BUK_ELEPRODIVESE_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E069913A-61A4-4086-B519-0FCEAD76AB61");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELEPRODIVESE_RPT_REPORT_Init()
  {
    BUK_ELEPRODIVESE.InitReport(BUK_ELEPRODIVESE_RPT_REPORT, 196865);
    BUK_ELEPRODIVESE_RPT_REPORT_InitQuery(true, false);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPT_REPORT, "831E1B94-96B0-4B5B-97BF-E900CE5CC2A3");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPT_REPORT, "REPORT");
    BUK_ELEPRODIVESE.InitSection(BUK_ELEPRODIVESE_RPT_REPORT, BUK_ELEPRODIVESE_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELEPRODIVESE.SetSectionRendersInto(BUK_ELEPRODIVESE_SEC_INTESTREPORT, BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SEC_INTESTREPORT, "01A8E8CF-2372-4B51-A5F5-0A4A266D1041");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_ELEPRODIVESE.InitSection(BUK_ELEPRODIVESE_RPT_REPORT, BUK_ELEPRODIVESE_SEC_INTESTPAGINA, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELEPRODIVESE.SetSectionRendersInto(BUK_ELEPRODIVESE_SEC_INTESTPAGINA, BUK_ELEPRODIVESE_RPTBOX_TESTATPAGIN1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SEC_INTESTPAGINA, "357001FB-06F0-423D-9747-FB5B8AF698DB");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_ELEPRODIVESE.InitReportBox(BUK_ELEPRODIVESE_SEC_INTESTPAGINA, BUK_ELEPRODIVESE_RPTBOX_PROPOSTA, 0, 1500, 6300, 600, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_PROPOSTA, "4881D60E-5DC5-4A47-9EC8-68D3EF0DC7BA");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_PROPOSTA, "PROPOSTA");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_PROPOSTA, BUK_ELEPRODIVESE_SPAN_PROPOSTA, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271319425, "", "Proposta", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_PROPOSTA, "F2C090A3-D3C6-413E-8553-406B471C1D87");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_PROPOSTA, "PROPOSTA");
    BUK_ELEPRODIVESE.InitReportBox(BUK_ELEPRODIVESE_SEC_INTESTPAGINA, BUK_ELEPRODIVESE_RPTBOX_DELIBERA, 6300, 1500, 5000, 600, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_DELIBERA, "22119EF4-F2EF-40A0-9A25-BF064BA7C5D3");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_DELIBERA, "DELIBERA");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_DELIBERA, BUK_ELEPRODIVESE_SPAN_DELIBERA, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271319425, "", "Delibera/Decreto", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_DELIBERA, "3A863342-6A64-4746-8F5F-8B72189BD752");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_DELIBERA, "DELIBERA");
    BUK_ELEPRODIVESE.InitSection(BUK_ELEPRODIVESE_RPT_REPORT, BUK_ELEPRODIVESE_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELEPRODIVESE.SetSectionRendersInto(BUK_ELEPRODIVESE_SEC_DETTAGLIO, BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SEC_DETTAGLIO, "AC582FE3-78DE-4C3F-B47F-6DB1C77899E1");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_ELEPRODIVESE.InitReportBox(BUK_ELEPRODIVESE_SEC_DETTAGLIO, BUK_ELEPRODIVESE_RPTBOX_PROPO, 0, 0, 6300, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_PROPO, "91265092-258D-4F03-8A98-3D9BD4F63A8F");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_PROPO, "PROPO");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_PROPO, BUK_ELEPRODIVESE_SPAN_REPREVDGEPDE, MyGlb.VIS_BORDILATERAL, 5, 212, 0, 271384961, "", "::RECORDPROPOS", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_REPREVDGEPDE, "DD44D46A-7103-4C33-8D5E-0C33FC0E1A66");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_REPREVDGEPDE, "REPREVDGEPDE");
    BUK_ELEPRODIVESE.InitReportBox(BUK_ELEPRODIVESE_SEC_DETTAGLIO, BUK_ELEPRODIVESE_RPTBOX_DEL, 6300, 0, 5000, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_DEL, "928174A4-82C3-4971-BB7A-F602B52EA8FE");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_DEL, "DEL");
    BUK_ELEPRODIVESE.InitBoxSpan(BUK_ELEPRODIVESE_RPTBOX_DEL, BUK_ELEPRODIVESE_SPAN_REDEEVDGEPDE, MyGlb.VIS_BORDILATERAL, 5, 459, 0, 271384961, "", "::RECORDDELIBE", 1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SPAN_REDEEVDGEPDE, "EB4653A0-82E7-4C68-9874-CB215067E39B");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SPAN_REDEEVDGEPDE, "REDEEVDGEPDE");
    BUK_ELEPRODIVESE.InitSection(BUK_ELEPRODIVESE_RPT_REPORT, BUK_ELEPRODIVESE_SEC_PIEDEPAGINA, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELEPRODIVESE.SetSectionRendersInto(BUK_ELEPRODIVESE_SEC_PIEDEPAGINA, BUK_ELEPRODIVESE_RPTBOX_PIEDEPAGINA1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SEC_PIEDEPAGINA, "DD4B9CDF-94B6-4407-84D5-9C672794C009");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_ELEPRODIVESE.InitSection(BUK_ELEPRODIVESE_RPT_REPORT, BUK_ELEPRODIVESE_SEC_PIEDEREPORT, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELEPRODIVESE.SetSectionRendersInto(BUK_ELEPRODIVESE_SEC_PIEDEREPORT, BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_SEC_PIEDEREPORT, "863E8D0E-D9B5-4652-B0E7-5FBA07DC4FA0");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_ELEPRODIVESE.InitReportBox(BUK_ELEPRODIVESE_SEC_PIEDEREPORT, BUK_ELEPRODIVESE_RPTBOX_BORDO, 0, 0, 11300, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELEPRODIVESE.SetRTCGuid(BUK_ELEPRODIVESE_RPTBOX_BORDO, "3676F672-2C32-457E-BAD9-B87F4BF3017B");
    BUK_ELEPRODIVESE.SetObjCode(BUK_ELEPRODIVESE_RPTBOX_BORDO, "BORDO");
    BUK_ELEPRODIVESE_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_ELEPRODIVESE_InitLinks()
  {
    BUK_ELEPRODIVESE.SetBoxNextBox(BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1, BUK_ELEPRODIVESE_RPTBOX_CORPOPAGINA1);
  }

  private void BUK_CONTDISDIBIL_MST_TEMPLATE_Init()
  {
    BUK_CONTDISDIBIL.InitMastro(BUK_CONTDISDIBIL_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_MST_TEMPLATE, "260CC317-4910-4ECB-A181-4FBF3B31DA87");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_MST_TEMPLATE, "TEMPLATE");
    BUK_CONTDISDIBIL.InitMastroBox(BUK_CONTDISDIBIL_MST_TEMPLATE, BUK_CONTDISDIBIL_RPTBOX_TESTATPAGIN2, 900, 500, 19200, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_TESTATPAGIN2, "DE885837-EDBC-403A-B012-7DA14623BD06");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_TESTATPAGIN2, "TESTATPAGIN2");
    BUK_CONTDISDIBIL.InitMastroBox(BUK_CONTDISDIBIL_MST_TEMPLATE, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2, 900, 1000, 19200, 26700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2, "4D70802B-73D0-4BD3-A18B-06F42834A320");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2, "CORPOPAGINA2");
    BUK_CONTDISDIBIL.InitMastroBox(BUK_CONTDISDIBIL_MST_TEMPLATE, BUK_CONTDISDIBIL_RPTBOX_PIEDEPAGINA2, 900, 27800, 19200, 1400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_PIEDEPAGINA2, "F597D7A7-D39B-47C5-827B-229EE7E1E13A");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_PIEDEPAGINA2, "PIEDEPAGINA2");
    BUK_CONTDISDIBIL.InitMastroBox(BUK_CONTDISDIBIL_MST_TEMPLATE, BUK_CONTDISDIBIL_RPTBOX_PAG2, 17600, 500, 2500, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_PAG2, "03029ACD-F9BB-4C3B-9035-3225FD97AA75");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_PAG2, "PAG2");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_PAG2, BUK_CONTDISDIBIL_SPAN_PAG2, MyGlb.VIS_NORMAA8RIGHT, 5, 204, 0, 271319169, "", "", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_PAG2, "126F8D7B-D81C-407A-AF34-332657838D0F");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_PAG2, "PAG2");
  }

  private void BUK_CONTDISDIBIL_RPT_REPORT_InitQuery() { BUK_CONTDISDIBIL_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONTDISDIBIL_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  C.E_S as RECORVARCOES, ");
      SQL.append("  TO_CHAR ( C.CAPITOLO ) || '/' || TO_CHAR ( C.ARTICOLO ) as RECOCAPIARTI, ");
      SQL.append("  C.CAPITOLO as RECOVARCCAPI, ");
      SQL.append("  C.ARTICOLO as RECOVARCARTI, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  SUM(D.IMPORTO) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO D ");
      SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (D.E_S = A.E_S) ");
      SQL.append("and   (D.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (NVL(D.IMPORTO, 0) <> 0) ");
      SQL.append(") as RECVARPROCOM, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  SUM(E.IMPORTO_CASSA) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO E ");
      SQL.append("where (E.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (E.E_S = A.E_S) ");
      SQL.append("and   (E.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (NVL(C.IMPORTO_CASSA, 0) <> 0) ");
      SQL.append(") as RECVARPROCAS, ");
      SQL.append("  A.ESERCIZIO as RECORBILESER, ");
      SQL.append("  A.DISPONIBILITA as RECORBILDISP, ");
      SQL.append("  A.DISPONIBILITA_CA as RECOBILDISCA ");
      SQL.append("from ");
      SQL.append("  BIL A, ");
      SQL.append("  DEL B, ");
      SQL.append("  VARCOMPRO C ");
      SQL.append("where (A.CAPITOLO = C.CAPITOLO) ");
      SQL.append("and   (A.ARTICOLO = C.ARTICOLO) ");
      SQL.append("and   (A.E_S = C.E_S) ");
      SQL.append("and   (A.ESERCIZIO = C.ESERCIZIO) ");
      SQL.append("and   (C.ANNO_PROPOSTA = B.ANNO_PRO(+)) ");
      SQL.append("and   (C.NUMERO_PROPOSTA = B.NUMERO_PRO(+)) ");
      SQL.append("and   (C.UNITA_PROPONENTE = B.UNITA_PRO(+)) ");
      SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NVL(C.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PAR17.ROWNAMANNPRO~~, NVL(C.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(C.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PAR17.ROWNAMNUMPRO~~, NVL(C.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(C.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PAR17.ROWNAMUNIPRO~~, NVL(C.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("order by 1, 2 ");
      BUK_CONTDISDIBIL.SetReportQuery(BUK_CONTDISDIBIL_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5F8CEB7C-9002-4FE7-8314-78FAF37089A8");
      if (BUK_CONTDISDIBIL.FindObjByID(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD) != null)
        BUK_CONTDISDIBIL.AddReportGroup(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, "RECORVARCOES");
      if (BUK_CONTDISDIBIL.FindObjByID(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU) != null)
        BUK_CONTDISDIBIL.AddReportGroup(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTDISDIBIL_RPT_REPORT_Init()
  {
    BUK_CONTDISDIBIL.InitReport(BUK_CONTDISDIBIL_RPT_REPORT, 196865);
    BUK_CONTDISDIBIL_RPT_REPORT_InitQuery(true, false);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPT_REPORT, "04FAB444-8C7C-4E0A-8081-3478A70524BB");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPT_REPORT, "REPORT");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_INTESTREPORT, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_INTESTREPORT, "70447B65-48F8-4441-AAF0-C0FCA4A2CF8F");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_INTESTPAGINA, 3100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_INTESTPAGINA, BUK_CONTDISDIBIL_RPTBOX_TESTATPAGIN2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_INTESTPAGINA, "B13B70A5-76E0-474A-8F99-2FE9B3C649C3");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, 3200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORVARCOES");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, "01405EBD-3008-44F2-AD86-41FBE288FE1B");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, "ENTRSPESHEAD");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_TITOLO, 0, 300, 19200, 900, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_TITOLO, "85BCF187-760F-49AD-96EF-C1505B174774");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_TITOLO, "TITOLO");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_TITOLO, BUK_CONTDISDIBIL_SPAN_CONTRODISPON, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Controllo Disponibilità", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_CONTRODISPON, "D169A64A-0CA5-4E86-B860-BAFFB508FE51");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_TITOLO, BUK_CONTDISDIBIL_SPAN_TITOLO1, MyGlb.VIS_TITREPNOBOCE, 5, 201, 0, 271319169, "", "", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_TITOLO1, "E3107A60-D9A4-4E4D-BFCF-63DD0BFB0CE1");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_TITOLO1, "TITOLO1");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART2, 0, 1900, 3500, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART2, "8B8AE530-8006-4E7B-8E10-FCD76F789669");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART2, "CAPITOLOART2");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART2, BUK_CONTDISDIBIL_SPAN_CAPITOLOART2, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_CAPITOLOART2, "7AB0EA64-76A3-413D-B1A0-68F96AA74AA3");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_CAPITOLOART2, "CAPITOLOART2");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_COMPETENZA, 3500, 1900, 7800, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 0, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_COMPETENZA, "58C3434B-9332-4A09-8508-AF65BF7E6930");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_COMPETENZA, "COMPETENZA");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_COMPETELABEL, 3500, 1900, 7800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_COMPETELABEL, "72A85F02-AC45-4308-A661-1427CF5026B2");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_COMPETELABEL, "COMPETELABEL");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_COMPETELABEL, BUK_CONTDISDIBIL_SPAN_COMPETENZA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Competenza", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_COMPETENZA, "0368B7E4-5D23-4849-8EDE-4BC92DF62FAE");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_COMPETENZA, "COMPETENZA");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA2, 3500, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA2, "C02526F7-3BA3-4ECA-A436-3ADFDF99A71B");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA2, "DISPONATTUA2");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA2, BUK_CONTDISDIBIL_SPAN_DISPONATTUA8, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA8, "49EA5DE1-6A7F-4D10-9984-F6E07369D405");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA8, "DISPONATTUA8");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV2, 6100, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV2, "7D0D5B17-33C9-4E4F-8497-7F5C434F5A5B");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV2, "VARIAZPROVV2");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV2, BUK_CONTDISDIBIL_SPAN_VARIAZPROVV2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_VARIAZPROVV2, "06DB9082-15B9-4F38-BA71-26F034181EBA");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_VARIAZPROVV2, "VARIAZPROVV2");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL2, 8700, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL2, "D7825AA0-6D28-40F0-B01D-53E65DB38556");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL2, "DISPONRISUL2");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL2, BUK_CONTDISDIBIL_SPAN_DISPONRISUL2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONRISUL2, "2F2349A1-C0A1-481C-AB08-064E4DFE7F86");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONRISUL2, "DISPONRISUL2");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_COMPETENZA1, 11300, 1900, 7800, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 0, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_COMPETENZA1, "EEC77E1A-1041-41C0-A296-3BDD4523F14C");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_COMPETENZA1, "COMPETENZA1");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_CASSALABEL1, 11300, 1900, 7800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_CASSALABEL1, "C448083F-65E9-4740-B091-7C04DDBD9998");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_CASSALABEL1, "CASSALABEL1");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_CASSALABEL1, BUK_CONTDISDIBIL_SPAN_CASSA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Cassa ", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_CASSA, "0E2CB481-7248-4AF6-B994-E654DCD376C8");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_CASSA, "CASSA");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA3, 11300, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA3, "4EE7A055-7CF7-4D8D-AFD7-CAA1033A3A8E");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA3, "DISPONATTUA3");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA3, BUK_CONTDISDIBIL_SPAN_DISPONATTUA2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA2, "46C3E244-E66B-45E2-B89C-0CAF76F31A99");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA2, "DISPONATTUA2");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV3, 13900, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV3, "60DF1B16-CF9B-4F2B-8D9D-3441A688FCBE");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV3, "VARIAZPROVV3");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_VARIAZPROVV3, BUK_CONTDISDIBIL_SPAN_VARIAZPROVV3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_VARIAZPROVV3, "E5FEDFD3-D4C4-4B4E-80AE-BF5799E57AF9");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_VARIAZPROVV3, "VARIAZPROVV3");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL3, 16500, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL3, "27730BA8-244E-4E32-9C13-1B0DA4A8B851");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL3, "DISPONRISUL3");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPONRISUL3, BUK_CONTDISDIBIL_SPAN_DISPONRISUL3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONRISUL3, "EEA23C9D-2DBF-4882-86E8-98E642D77DD9");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONRISUL3, "DISPONRISUL3");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECOCAPIARTI");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, "486D5207-4F59-4FDF-99AC-2263DC60BA78");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, "CAPARTINTGRU");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART3, 0, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART3, "B6DBB6EC-09C1-4D78-9AE8-52467308D0BF");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART3, "CAPITOLOART3");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_CAPITOLOART3, BUK_CONTDISDIBIL_SPAN_CAPITOLOART3, MyGlb.VIS_BOXNORMFIEA8, 5, 199, 0, 271319425, "12345678784215454/45", "", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_CAPITOLOART3, "8D8CE4D1-1B08-4766-8E41-5AE139D565CC");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_CAPITOLOART3, "CAPITOLOART3");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA4, 3500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA4, "DAA0668A-97D2-4AAC-A842-CFA03AFB2845");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA4, "DISPONATTUA4");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPONATTUA4, BUK_CONTDISDIBIL_SPAN_DISPONATTUA3, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECORBILDISP", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA3, "9B9E0F65-2034-427F-8954-470D6D7C9979");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA3, "DISPONATTUA3");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCO, 6100, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCO, "E1B5E1C2-A05A-422C-83A2-2A5148AE1DD3");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCO, "VARIAPROVVCO");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCO, BUK_CONTDISDIBIL_SPAN_DISPONATTUA4, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECVARPROCOM", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA4, "56A3943F-CC74-4AB4-A71D-BCF55A643BFB");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA4, "DISPONATTUA4");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_RISULTANTECO, 8700, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECO, "7AA602D3-DA29-4D73-9A84-B8E0A0AE4E0B");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECO, "RISULTANTECO");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECO, BUK_CONTDISDIBIL_SPAN_DISPONATTUA5, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "123456787887,78", "", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA5, "BCE13401-A32F-4884-837E-2C368EA3EA63");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA5, "DISPONATTUA5");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_DISPOATTUACA, 11300, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_DISPOATTUACA, "F22C9041-5EDB-4612-9217-C2CF0CF4FAB5");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_DISPOATTUACA, "DISPOATTUACA");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_DISPOATTUACA, BUK_CONTDISDIBIL_SPAN_DISPONATTUA6, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECOBILDISCA", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA6, "A8B231F1-0B02-4327-9D0F-D4F971232C8B");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA6, "DISPONATTUA6");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCA, 13900, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCA, "1466BCEE-4B51-4BA2-82D7-D1D6953E2527");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCA, "VARIAPROVVCA");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_VARIAPROVVCA, BUK_CONTDISDIBIL_SPAN_DISPONATTUA7, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECVARPROCAS", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA7, "99BB245A-87B3-4F0F-B3AE-B9F02EB869D8");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA7, "DISPONATTUA7");
    BUK_CONTDISDIBIL.InitReportBox(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, BUK_CONTDISDIBIL_RPTBOX_RISULTANTECA, 16500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECA, "C83A38D8-2218-4546-95A6-49C0E80C5500");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECA, "RISULTANTECA");
    BUK_CONTDISDIBIL.InitBoxSpan(BUK_CONTDISDIBIL_RPTBOX_RISULTANTECA, BUK_CONTDISDIBIL_SPAN_DISPONATTUA9, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "123456787887,78", "", 1);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SPAN_DISPONATTUA9, "B9E0F76A-D0E2-44D2-BFF1-5D0DF4A78690");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SPAN_DISPONATTUA9, "DISPONATTUA9");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_DETTAGLIO, 0, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_DETTAGLIO, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_DETTAGLIO, "FBA618DF-53A2-49CF-9A57-42629A2BB30E");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOCAPIARTI");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU, "7A7B5D05-D2FD-483D-A07B-CA6B56B679AB");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_CAPARTPIEGRU, "CAPARTPIEGRU");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "RECORVARCOES");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT, "107493B9-D0F0-4F3A-B879-FBC7649D8998");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_ENTRSPESFOOT, "ENTRSPESFOOT");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_PIEDEPAGINA, 1400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_PIEDEPAGINA, BUK_CONTDISDIBIL_RPTBOX_PIEDEPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_PIEDEPAGINA, "BF57D55B-F8E8-4672-B541-EE3E248C479E");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTDISDIBIL.InitSection(BUK_CONTDISDIBIL_RPT_REPORT, BUK_CONTDISDIBIL_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISDIBIL.SetSectionRendersInto(BUK_CONTDISDIBIL_SEC_PIEDEREPORT, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
    BUK_CONTDISDIBIL.SetRTCGuid(BUK_CONTDISDIBIL_SEC_PIEDEREPORT, "E596191A-1474-46A5-B7E6-D78C37F17E47");
    BUK_CONTDISDIBIL.SetObjCode(BUK_CONTDISDIBIL_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CONTDISDIBIL.AddReportGroup(BUK_CONTDISDIBIL_SEC_ENTRSPESHEAD, "RECORVARCOES");
    BUK_CONTDISDIBIL.AddReportGroup(BUK_CONTDISDIBIL_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    BUK_CONTDISDIBIL_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONTDISDIBIL_InitLinks()
  {
    BUK_CONTDISDIBIL.SetBoxNextBox(BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2, BUK_CONTDISDIBIL_RPTBOX_CORPOPAGINA2);
  }

  private void BUK_CONTDISPFINA_MST_TEMPLATE_Init()
  {
    BUK_CONTDISPFINA.InitMastro(BUK_CONTDISPFINA_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_MST_TEMPLATE, "3FD04092-3EF3-4EEC-85CA-661BA86872A2");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_MST_TEMPLATE, "TEMPLATE");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, "A7822ACD-4833-48C6-8158-F432299498FE");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, 1000, 3400, 19000, 24400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, "F5F841B5-D229-41F9-A303-0C2AF41FBB3D");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, 1000, 27900, 19000, 800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, "7F7F67B2-DA85-4AAB-8CDF-EE7E8CAAF853");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_PAG, 16500, 1000, 3500, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_PAG, "6E54147B-210A-4D53-9A1D-0D92BF40DB4E");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_PAG, "PAG");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_PAG, BUK_CONTDISPFINA_SPAN_PAG, MyGlb.VIS_NORMAA8RIGHT, 5, 204, 0, 271319169, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_PAG, "EE06DBD2-AEB3-470F-8386-DE724C24D6D4");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_PAG, "PAG");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_TITOLO1, 1000, 1500, 19000, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_TITOLO1, "87297FBA-7EFB-46B8-80CA-86975DA660A1");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_TITOLO1, "TITOLO1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_TITOLO1, BUK_CONTDISPFINA_SPAN_TIT, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Controllo Disponibilità", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_TIT, "6A09E4AA-B57F-4010-AE06-6413CB3C1DA6");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_TIT, "TIT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_TITOLO1, BUK_CONTDISPFINA_SPAN_TITOLO, MyGlb.VIS_TITREPNOBOCE, 5, 201, 0, 271319169, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_TITOLO, "8AEC0FE6-5099-4A34-9318-CC138DCB6791");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_TITOLO, "TITOLO");
  }

  private void BUK_CONTDISPFINA_RPT_REPORT_InitQuery() { BUK_CONTDISPFINA_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONTDISPFINA_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as RECOBILFINES, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) as RECOCAPIARTI, ");
      SQL.append("  A.FINANZIAMENTO as RECBILFINFIN, ");
      SQL.append("  A.OPERA as RECBILFINOPE, ");
      SQL.append("  NVL(A.DISPONIBILITA, 0) as RECBILFINDIS, ");
      SQL.append("  A.VARIAZIONI as RECBILFINVAR ");
      SQL.append("from ");
      SQL.append("  BIL_FIN A, ");
      SQL.append("  VARCOMPRO B, ");
      SQL.append("  DEL C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.VARIAZIONI IS NULL))) ");
      SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (A.E_S = B.E_S) ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (A.FINANZIAMENTO = B.FINANZIAMENTO) ");
      SQL.append("and   (A.OPERA = B.OPERA) ");
      SQL.append("and   (NVL(B.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PAR17.ROWNAMANNPRO~~, NVL(B.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(B.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PAR17.ROWNAMNUMPRO~~, NVL(B.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(B.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PAR17.ROWNAMUNIPRO~~, NVL(B.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (B.ANNO_PROPOSTA = C.ANNO_PRO(+)) ");
      SQL.append("and   (B.NUMERO_PROPOSTA = C.NUMERO_PRO(+)) ");
      SQL.append("and   (B.UNITA_PROPONENTE = C.UNITA_PRO(+)) ");
      SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("order by 1, 2 ");
      BUK_CONTDISPFINA.SetReportQuery(BUK_CONTDISPFINA_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E7A1068E-EE18-4D32-AE72-AAA819BAF9AF");
      if (BUK_CONTDISPFINA.FindObjByID(BUK_CONTDISPFINA_SEC_BILFINESINGR) != null)
        BUK_CONTDISPFINA.AddReportGroup(BUK_CONTDISPFINA_SEC_BILFINESINGR, "RECOBILFINES");
      if (BUK_CONTDISPFINA.FindObjByID(BUK_CONTDISPFINA_SEC_CAPARTINTGRU) != null)
        BUK_CONTDISPFINA.AddReportGroup(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTDISPFINA_RPT_REPORT_Init()
  {
    BUK_CONTDISPFINA.InitReport(BUK_CONTDISPFINA_RPT_REPORT, 196865);
    BUK_CONTDISPFINA_RPT_REPORT_InitQuery(true, false);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPT_REPORT, "7918CBE1-12DC-4E15-9C8F-823944F4441D");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPT_REPORT, "REPORT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_INTESTREPORT, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_INTESTREPORT, "6C1FAC88-4B3D-45EB-934A-6936C84DE7E2");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_INTESTPAGINA, 2400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_INTESTPAGINA, "32724804-1E35-428A-8C2E-9877B528227C");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, 0, 1900, 3200, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, "1204B73C-2212-45F2-9569-9E3B0F2AF76F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, "CAPITOLOART1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, BUK_CONTDISPFINA_SPAN_CAPITOLOART1, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_CAPITOLOART1, "141FD992-B5B9-40C4-A815-F8F30AD788EC");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_CAPITOLOART1, "CAPITOLOART1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, 3200, 1900, 2400, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, "A5999DC4-7FAA-4BF0-B1EF-91846902ED20");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Finanziamento", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, "18100910-B79E-4170-B48C-3CB0793D8301");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, 7400, 1900, 3500, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, "EF51ABCF-48F2-42AA-8F42-464A32B03D58");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, "DISPONATTUA1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, BUK_CONTDISPFINA_SPAN_DISPONATTUA1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONATTUA1, "69F04B19-CC9E-4BCD-95F9-E60665BF6118");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONATTUA1, "DISPONATTUA1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, 14500, 1900, 3600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, "775E3166-9905-4C17-8D74-76F92640C35F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, "DISPONRISUL1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, BUK_CONTDISPFINA_SPAN_DISPONRISUL1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONRISUL1, "2EAAA5FF-033C-483F-9350-D5999B852342");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONRISUL1, "DISPONRISUL1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, 10900, 1900, 3600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, "32A69B38-4202-4204-81C1-FBC89DC8BFF0");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, "VARIAZPROVV1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, "F64CD115-33B5-4B20-9838-05790783BDDB");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, "VARIAZPROVV1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_OPERA1, 5600, 1900, 1800, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_OPERA1, "889FBAC8-86E9-4DD2-A1B7-0A6FE48862E7");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_OPERA1, "OPERA1");
    BUK_CONTDISPFINA.set_BoxAlignment(BUK_CONTDISPFINA_RPTBOX_OPERA1, 4);
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_OPERA1, BUK_CONTDISPFINA_SPAN_NUOVASPAN, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384705, "", "Opera", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_NUOVASPAN, "03810074-1EAB-4AF1-9B2D-D978C5893460");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_BILFINESINGR, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOBILFINES");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_BILFINESINGR, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_BILFINESINGR, "24C7FA33-FD11-4E77-87D7-0E9E1FE9E05B");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_BILFINESINGR, "BILFINESINGR");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_CAPARTINTGRU, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECOCAPIARTI");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "57774E4B-CAC4-4D7F-AC6F-B48E7E793B08");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "CAPARTINTGRU");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, 0, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, "C9068654-A0CC-4D93-B262-B9304BBE978C");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, BUK_CONTDISPFINA_SPAN_CAPITOLOART, MyGlb.VIS_BOXNORMFIEA8, 5, 199, 0, 271319425, "", "::RECOCAPIARTI", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_CAPITOLOART, "D21A0A30-8B6C-4619-BECB-E10C07C4F120");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_CAPITOLOART, "CAPITOLOART");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, 3200, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, "050FCCD6-48C5-42ED-8D50-F18489469F43");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, MyGlb.VIS_BOXNORMFIEA8, 1, 5, 0, 271319425, "", "::RECBILFINFIN", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, "92786A95-06F0-41ED-A43B-B11A470B46A5");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, "FINANZIAMEN2");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, 7400, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, "EEA3CB1B-4F12-4322-8DA2-2D975352E720");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, "DISPONATTUAL");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, BUK_CONTDISPFINA_SPAN_DISPONATTUAL, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECBILFINDIS", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONATTUAL, "92DFB45E-004F-4CE8-BA9A-8CDB01248A5F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONATTUAL, "DISPONATTUAL");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, 14500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, "A37B5928-B086-4E8A-AC58-98AABA237703");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, BUK_CONTDISPFINA_SPAN_DISPONRISULT, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONRISULT, "85940C2D-8DE8-4824-A8D4-F55B0A55AFD2");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, 10900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, "707C9F30-1BA6-4757-99BD-1157C9B9E358");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, "VARIAZPROVVI");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECBILFINVAR", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, "24187DB5-EB42-45A3-8C5E-1F1621CEEC98");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, "VARIAZPROVVI");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_OPERA, 5600, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_OPERA, "30186693-7A17-47CE-88AA-2F3061586275");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_OPERA, "OPERA");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_OPERA, BUK_CONTDISPFINA_SPAN_FINANZIAMENT, MyGlb.VIS_BOXNORMFIEA8, 1, 5, 0, 271319425, "", "::RECBILFINOPE", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMENT, "F9A666F0-F4EA-44C9-820E-91CF6E4D8647");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_DETTAGLIO, 100, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_DETTAGLIO, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_DETTAGLIO, "82C58E16-52D3-409D-8993-E00D4EFF7940");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOCAPIARTI");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, "D9EB266C-428E-49C7-B500-CEEC8C3C14AD");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, "CAPARTPIEGRU");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_BILFINESPIGR, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "RECOBILFINES");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_BILFINESPIGR, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_BILFINESPIGR, "43E5CEDD-63C5-41B4-BBD8-73E47D2A79E8");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_BILFINESPIGR, "BILFINESPIGR");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_PIEDEPAGINA, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, "FE5D3A78-DEC4-47AA-BEE9-E52770035055");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_PIEDEREPORT, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_PIEDEREPORT, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_PIEDEREPORT, "8EDD9CFF-9BA6-4C29-8017-A75EFB2CE413");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CONTDISPFINA.AddReportGroup(BUK_CONTDISPFINA_SEC_BILFINESINGR, "RECOBILFINES");
    BUK_CONTDISPFINA.AddReportGroup(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    BUK_CONTDISPFINA_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONTDISPFINA_InitLinks()
  {
    BUK_CONTDISPFINA.SetBoxNextBox(BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESECVARDAGS4) PAN_ESECVARDAGS4_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECVARDAGS4) PAN_ESECVARDAGS4_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESECVARDAGS4) PAN_ESECVARDAGS4_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECVARDAGS4) PAN_ESECVARDAGS4_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESECVARDAGS4) PAN_ESECVARDAGS4_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnConnecting(DBConn);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnConnecting(DBConn);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ELEPRODIVESE) BUK_ELEPRODIVESE_OnPreview();
    if (SrcObj == BKW_CONTDISDIBIL) BUK_CONTDISDIBIL_OnPreview();
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnPreview();
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
