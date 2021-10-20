// **********************************************
// Esecutivita Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsecutivitaVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ESECUTVARIAZ_PROVVEDIMENT = 0;
  private static int GRP_ESECUTVARIAZ_VARIAZIONI = 1;

  private static int PFL_ESECUTVARIAZ_PROPOSTA = 0;
  private static int PFL_ESECUTVARIAZ_NUMEROPROPOS = 1;
  private static int PFL_ESECUTVARIAZ_ANNOPROPOSTA = 2;
  private static int PFL_ESECUTVARIAZ_DELIBERA = 3;
  private static int PFL_ESECUTVARIAZ_NUMERODELIBE = 4;
  private static int PFL_ESECUTVARIAZ_ANNODELIBERA = 5;
  private static int PFL_ESECUTVARIAZ_TRATTIPROPOS = 6;
  private static int PFL_ESECUTVARIAZ_BARRAPROPOST = 7;
  private static int PFL_ESECUTVARIAZ_TRATTIDELIBE = 8;
  private static int PFL_ESECUTVARIAZ_BARRADELIBER = 9;
  private static int PFL_ESECUTVARIAZ_SCELTA = 10;
  private static int PFL_ESECUTVARIAZ_INFO = 11;
  private static int PFL_ESECUTVARIAZ_NEWPANELLABE = 12;
  private static int PFL_ESECUTVARIAZ_VARIAZIONI = 13;
  private static int PFL_ESECUTVARIAZ_SOLOCONTDISP = 14;
  private static int PFL_ESECUTVARIAZ_TIPOBI = 15;
  private static int PFL_ESECUTVARIAZ_ELABORA = 16;

  private static int PPQRY_PAR15 = 0;


  IDPanel PAN_ESECUTVARIAZ;
  CIDREObj BUK_CONTRODISPON;
  OBook BKW_CONTRODISPON;
  //
  // Template Pages constants
  private static int BUK_CONTRODISPON_MST_TEMPLATE = 1;
  private static int BUK_CONTRODISPON_RPTBOX_TESTATPAGIN2 = 2;
  private static int BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2 = 3;
  private static int BUK_CONTRODISPON_RPTBOX_PIEDEPAGINA2 = 4;
  private static int BUK_CONTRODISPON_RPTBOX_PAG2 = 5;
  private static int BUK_CONTRODISPON_SPAN_PAG1 = 6;

  //
  // Reports constants
  private static int BUK_CONTRODISPON_RPT_REPORT = 7;
  private static int BUK_CONTRODISPON_SEC_INTESTREPORT = 8;
  private static int BUK_CONTRODISPON_SEC_INTESTPAGINA = 9;
  private static int BUK_CONTRODISPON_SEC_ENTRSPESHEAD = 10;
  private static int BUK_CONTRODISPON_RPTBOX_TITOLO = 11;
  private static int BUK_CONTRODISPON_SPAN_CONTRODISPON = 12;
  private static int BUK_CONTRODISPON_SPAN_TITOLO1 = 13;
  private static int BUK_CONTRODISPON_RPTBOX_CAPITOLOART2 = 14;
  private static int BUK_CONTRODISPON_SPAN_CAPITOLOART2 = 15;
  private static int BUK_CONTRODISPON_RPTBOX_COMPETENZA = 16;
  private static int BUK_CONTRODISPON_RPTBOX_COMPETELABEL = 17;
  private static int BUK_CONTRODISPON_SPAN_COMPETENZA = 18;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONATTUA2 = 19;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA8 = 20;
  private static int BUK_CONTRODISPON_RPTBOX_VARIAZPROVV2 = 21;
  private static int BUK_CONTRODISPON_SPAN_VARIAZPROVV2 = 22;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONRISUL2 = 23;
  private static int BUK_CONTRODISPON_SPAN_DISPONRISUL2 = 24;
  private static int BUK_CONTRODISPON_RPTBOX_COMPETENZA1 = 25;
  private static int BUK_CONTRODISPON_RPTBOX_CASSALABEL1 = 26;
  private static int BUK_CONTRODISPON_SPAN_CASSA = 27;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONATTUA3 = 28;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA2 = 29;
  private static int BUK_CONTRODISPON_RPTBOX_VARIAZPROVV3 = 30;
  private static int BUK_CONTRODISPON_SPAN_VARIAZPROVV3 = 31;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONRISUL3 = 32;
  private static int BUK_CONTRODISPON_SPAN_DISPONRISUL3 = 33;
  private static int BUK_CONTRODISPON_SEC_CAPARTINTGRU = 34;
  private static int BUK_CONTRODISPON_RPTBOX_CAPITOLOART3 = 35;
  private static int BUK_CONTRODISPON_SPAN_CAPITOLOART3 = 36;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONATTUA4 = 37;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA3 = 38;
  private static int BUK_CONTRODISPON_RPTBOX_VARIAPROVVCO = 39;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA4 = 40;
  private static int BUK_CONTRODISPON_RPTBOX_RISULTANTECO = 41;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA5 = 42;
  private static int BUK_CONTRODISPON_RPTBOX_DISPOATTUACA = 43;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA6 = 44;
  private static int BUK_CONTRODISPON_RPTBOX_VARIAPROVVCA = 45;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA7 = 46;
  private static int BUK_CONTRODISPON_RPTBOX_RISULTANTECA = 47;
  private static int BUK_CONTRODISPON_SPAN_DISPONATTUA9 = 48;
  private static int BUK_CONTRODISPON_SEC_DETTAGLIO = 49;
  private static int BUK_CONTRODISPON_SEC_CAPARTPIEGRU = 50;
  private static int BUK_CONTRODISPON_SEC_ENTRSPESFOOT = 51;
  private static int BUK_CONTRODISPON_SEC_PIEDEPAGINA = 52;
  private static int BUK_CONTRODISPON_SEC_PIEDEREPORT = 53;

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
    Init_TBL_PAR18(IMDB);
    //
    //
    Init_PQRY_PAR15(IMDB);
    Init_PQRY_PAR15_RS(IMDB);
    Init_PQRY_VARCOMPRO7(IMDB);
    Init_PQRY_BILFIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR18, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR18, "TBL_PAR18");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMSOCODI, "ROWNAMSOCODI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMSOCODI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMEVARIA,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR18,IMDBDef3.FLD_PAR18_ROWNAMANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR18, 0);
  }

  private static void Init_PQRY_PAR15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR15, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR15, "PQRY_PAR15");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, "ROWNAMSOCODI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMSOCODI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMEVARIA,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15,IMDBDef12.PQSL_PAR15_ROWNAMANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR15, 0);
  }

  private static void Init_PQRY_PAR15_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR15_RS, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR15_RS, "PQRY_PAR15_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, "ROWNAMSOCODI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMSOCODI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMETIPBI, "ROWNAMETIPBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMETIPBI,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMEVARIA,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR15_RS,IMDBDef12.PQSL_PAR15_ROWNAMANNDEL,1,4,0);
  }

  private static void Init_PQRY_VARCOMPRO7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO7, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO7, "PQRY_VARCOMPRO7");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORVARCOES, "RECORVARCOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORVARCOES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOCAPIARTI, "RECOCAPIARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOCAPIARTI,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOVARCCAPI, "RECOVARCCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOVARCCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOVARCARTI, "RECOVARCARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOVARCARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECVARPROCOM, "RECVARPROCOM");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECVARPROCOM,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECVARPROCAS, "RECVARPROCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECVARPROCAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORBILESER, "RECORBILESER");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORBILESER,3,12,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORBILDISP, "RECORBILDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECORBILDISP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOBILDISCA, "RECOBILDISCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO7,IMDBDef12.PQSL_VARCOMPRO7_RECOBILDISCA,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO7, 0);
  }

  private static void Init_PQRY_BILFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILFIN, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILFIN, "PQRY_BILFIN");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECOBILFINES, "RECOBILFINES");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECOBILFINES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECOCAPIARTI, "RECOCAPIARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECOCAPIARTI,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINFIN, "RECBILFINFIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINFIN,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINOPE, "RECBILFINOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINOPE,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINDIS, "RECBILFINDIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINDIS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINVAR, "RECBILFINVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILFIN,IMDBDef12.PQSL_BILFIN_RECBILFINVAR,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILFIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsecutivitaVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsecutivitaVariazioni()
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
    FormIdx = MyGlb.FRM_ESECUTVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B6CF96FD-3756-442C-96F6-E8837868A259";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 388;
    DesignHeight = 326;
    set_Caption(new IDVariant("Esecutivita Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 388;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Esecutività Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_ESECUTVARIAZ = new IDPanel(w, this, 1, "PAN_ESECUTVARIAZ");
    Frames[1].Content = PAN_ESECUTVARIAZ;
    PAN_ESECUTVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESECUTVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 388-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "01F53085-4AB8-4CE1-8946-D49A46C4FD74");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 640, 220, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESECUTVARIAZ.InitStatus = 2;
    PAN_ESECUTVARIAZ_Init();
    PAN_ESECUTVARIAZ_InitFields();
    PAN_ESECUTVARIAZ_InitQueries();
    BKW_CONTRODISPON = new OBook(this);
    BUK_CONTRODISPON = new CIDREObj(BKW_CONTRODISPON);
    BKW_CONTRODISPON.iGuid = "273D155E-D507-4163-A47E-836B9FACF663";
    BKW_CONTRODISPON.Code = "BUK_CONTRODISPON";
    BKW_CONTRODISPON.BookObj = BUK_CONTRODISPON;
    BKW_CONTRODISPON.InitDefMasks();
    BUK_CONTRODISPON.InitBook(1, 1245441, "Controllo Disponibilità", IMDB, MainFrm.VisualStyleList);
    BUK_CONTRODISPON.InitHTML();
    BUK_CONTRODISPON.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTRODISPON.Book.SetMainFrm(MainFrm);
    BUK_CONTRODISPON.SetRTCGuid(0, "273D155E-D507-4163-A47E-836B9FACF663");
    BUK_CONTRODISPON.SetObjCode(0, "CONTRODISPON");
    BUK_CONTRODISPON_MST_TEMPLATE_Init();
    BUK_CONTRODISPON_RPT_REPORT_Init();
    BUK_CONTRODISPON_InitLinks();
    BKW_CONTDISPFINA = new OBook(this);
    BUK_CONTDISPFINA = new CIDREObj(BKW_CONTDISPFINA);
    BKW_CONTDISPFINA.iGuid = "E5ED1FC8-CBB4-4AE4-B5CC-BC210891E826";
    BKW_CONTDISPFINA.Code = "BUK_CONTDISPFINA";
    BKW_CONTDISPFINA.BookObj = BUK_CONTDISPFINA;
    BKW_CONTDISPFINA.InitDefMasks();
    BUK_CONTDISPFINA.InitBook(1, 1245441, "Controllo Disponibilità Finanziamento", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISPFINA.InitHTML();
    BUK_CONTDISPFINA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISPFINA.Book.SetMainFrm(MainFrm);
    BUK_CONTDISPFINA.SetRTCGuid(0, "E5ED1FC8-CBB4-4AE4-B5CC-BC210891E826");
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR18, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESECUTVARIAZ_PAR15();
      }
      PAN_ESECUTVARIAZ.UpdatePanel(MainFrm);
      // BUK_CONTRODISPON.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ESECUTVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ESECUTVARIAZ_SCELTA) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CONTRODISPON")) return BUK_CONTRODISPON;
    if (Code.equals("BUK_CONTDISPFINA")) return BUK_CONTDISPFINA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof EsecutivitaVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsecutivitaVariazioni.class.getName() : (Glb.ClassWithPackage(EsecutivitaVariazioni.class) ? EsecutivitaVariazioni.class.getName().substring(EsecutivitaVariazioni.class.getPackage().getName().length() + 1) : EsecutivitaVariazioni.class.getName()));
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
      if ((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0))) && IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Proposta e/o Delibera non indicate o incomplete", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Errore, nessun record su varcompro per la proposta indicata", IDVariant.STRING));
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VARCOMPRO A ");
        SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0).equals((new IDVariant(2)), true))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Errore, nessun record su varcom per la proposta indicata", IDVariant.STRING));
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0).equals((new IDVariant(3)), true))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Errore, nessun record su var_impegnabile per la proposta indicata", IDVariant.STRING));
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VAR_IMPEGNABILE A ");
        SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
          return 0;
        }
      }
      // 
      // ESEGUO LA STAMPA
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMETIPBI, 0).equals((new IDVariant("B")), true))
        {
          BUK_CONTRODISPON.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_CONTRODISPON.RefreshQuery();
          BUK_CONTRODISPON.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          MainFrm.set_RedirectTo((new IDVariant(BUK_CONTRODISPON.GetWebFileName())));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
        else if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMETIPBI, 0).equals((new IDVariant("P")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Esecutivita_Variazioni_rpp"));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMERO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_UNITA_PROP")), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0));
          MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        else
        {
          BUK_CONTDISPFINA.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_CONTDISPFINA.RefreshQuery();
          BUK_CONTDISPFINA.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          MainFrm.set_RedirectTo((new IDVariant(BUK_CONTDISPFINA.GetWebFileName())));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
      }
      else
      {
        // 
        // LANCIO LA PROCEDURA
        // 
        IDVariant v_TEMP = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CF4WEBBILESECUTIVITAVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0), v_TEMP);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (v_TEMP.equals((new IDVariant(0)), true))
          {
            IDVariant v_NESS = new IDVariant(0,IDVariant.STRING);
            v_NESS = (new IDVariant("Nessun movimento aggiornato", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_NESS); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
          else
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.BILCONTROLLOESECVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0), MainFrm.PROGRESESSIO);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              MainFrm.set_AlertMessage((new IDVariant("Operazione Terminata"))); 
              if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0).equals((new IDVariant(1)), true))
              {
                IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_ANNO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0));
                IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_NUMERO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0));
                IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0));
                MainFrm.Show(MyGlb.FRM_SITUVARITRAT, (new IDVariant(-1)).intValue(), this); 
                // IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
                // SQL = new StringBuffer();
                // SQL.append("select ");
                // SQL.append("  COUNT(*) as COUNT1 ");
                // SQL.append("from ");
                // SQL.append("  WRK_CONTROLLO_ESEC_VAR A ");
                // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                // if (!QV.EOF()) QV.MoveNext();
                // if (!QV.EOF())
                // {
                //   v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                // }
                // QV.Close();
                // if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
                // {
                  // IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_ANNO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0));
                  // IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_NUMERO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0));
                  // IMDB.set_Value(IMDBDef3.TBL_PARS72, IMDBDef3.FLD_PARS72_SEDE_DEL, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0));
                  // MainFrm.Show(MyGlb.FRM_SITUVARITRAT, (new IDVariant(-1)).intValue(), this); 
                // }
                // else
                // {
                  // MainFrm.set_AlertMessage((new IDVariant("Operazione Terminata"))); 
                  // MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
                // }
              }
              else
              {
                // MainFrm.set_AlertMessage((new IDVariant("Operazione Terminata"))); 
                MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
              }
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "InfoDelibera", _e);
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
      PAN_ESECUTVARIAZ.ClearValueList(PFL_ESECUTVARIAZ_VARIAZIONI);
      PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_VARIAZIONI, (new IDVariant(1)), (new IDVariant("Provvisorie")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_VARIAZIONI, (new IDVariant(2)), (new IDVariant("Definitive")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
      {
        PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_VARIAZIONI, (new IDVariant(3)), (new IDVariant("Impegnabile")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMSOCODI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMETIPBI, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMEVARIA, 0, (new IDVariant(1)));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMANNDEL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESECUTVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESECUTVARIAZ);
      // 
      // Esecutività Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMEVARIA, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        PAN_ESECUTVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ESECUTVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESECUTVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0))))
      {
        PAN_ESECUTVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESECUTVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "EsecutivitàVariazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESECUTVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esecutività Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ESECUTVARIAZ_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMUNIPRO, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ESECUTVARIAZ_DELIBERA)), true) || Column.equals((new IDVariant(PFL_ESECUTVARIAZ_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_ESECUTVARIAZ_ANNODELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSEDDEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
        }
      }
      if (Column.equals((new IDVariant(PFL_ESECUTVARIAZ_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR15, IMDBDef12.PQSL_PAR15_ROWNAMSOCODI, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "EsecutivitàVariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Esecutività Variazioni On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_ESECUTVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ESECUTVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Esecutività Variazioni On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaVariazioni", "EsecutivitàVariazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ESECUTVARIAZ_PAR15() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR15_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR18, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR18, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR15_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR15_RS, 0, IMDBDef3.TBL_PAR18, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 0, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 1, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 2, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 3, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMSOCODI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 4, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMETIPBI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 5, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 6, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 7, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR15_RS, 8, 0, IMDBDef3.TBL_PAR18, IMDBDef3.FLD_PAR18_ROWNAMANNDEL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR18, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR18, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR18, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR15_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESECUTVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESECUTVARIAZ, Cancel);
    // Stub
  }

  private void PAN_ESECUTVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESECUTVARIAZ_SCELTA)
    {
      this.IdxPanelActived = this.PAN_ESECUTVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECUTVARIAZ_INFO)
    {
      this.IdxPanelActived = this.PAN_ESECUTVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECUTVARIAZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESECUTVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESECUTVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESECUTVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESECUTVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESECUTVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONTRODISPON_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTRODISPON_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTRODISPON_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_ENTRSPESHEAD)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_TITOLO1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_CONTRODISPON.SpanValue(BUK_CONTRODISPON_SPAN_CONTRODISPON), IDL.Upper(MainFrm.ESERCIZIO)), (new IDVariant(" - "))), ((BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECORVARCOES").equals((new IDVariant("E"))))?(new IDVariant("Entrate")):(new IDVariant("Spese"))))));
    }
    if (SectionID==BUK_CONTRODISPON_SEC_CAPARTINTGRU)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_CAPITOLOART3, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECOVARCCAPI")), (new IDVariant("/"))), IDL.ToString(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECOVARCARTI")))));
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_DISPONATTUA5, new IDVariant(IDL.Add(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECORBILDISP"), BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECVARPROCOM"))));
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_DISPONATTUA9, new IDVariant(IDL.Add(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECVARPROCAS"), BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "RECOBILDISCA"))));
    }
    if (SectionID==BUK_CONTRODISPON_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_CAPARTPIEGRU)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_ENTRSPESFOOT)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_CONTRODISPON_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTRODISPON_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTRODISPON_MST_TEMPLATE)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_PAG1, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetPageNumber())))), (new IDVariant("di"))), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTRODISPON_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTRODISPON_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTRODISPON_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTRODISPON_OnPreview()
  {
    PreviewBook = BKW_CONTRODISPON;
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
  private void PAN_ESECUTVARIAZ_Init()
  {

    PAN_ESECUTVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESECUTVARIAZ.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, "9DC61988-853F-407D-9941-33E2CF68ED34");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 200, 16, 0, 0);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 7, 320, 81, 0, 0);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ESECUTVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ESECUTVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, "91459817-7596-4DBA-9FE4-D56A6C4582D9");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 56, 16, 0, 0);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 8, 115, 320, 49, 0, 0);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, 0, 55);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, 1, 13);
    PAN_ESECUTVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, 0, 4);
    PAN_ESECUTVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, 1, 4);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ESECUTVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESECUTVARIAZ.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, "E35A3AB0-7B72-44EA-BD62-E934A9655F35");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, "Proposta");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, "3E8F95EB-634C-4F5B-86F7-C08D32C124E8");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, "Numero Proposta");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, "5E58195C-6FD6-412B-8AC8-05A127C46FD4");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, "Anno Proposta");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, "E99B35C7-0717-4B7D-B57A-94CACD656760");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, "Delibera");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, "5A6AF754-29B7-45FD-A92F-F94376E73D6B");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, "Numero Delibera");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, "8E7A296A-8788-4613-BB4E-B06F3F15F502");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, "Anno Delibera");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, "936A4C5B-3CBA-4552-8E08-42E82CA7CFB2");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, "-");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, "F53DBF1E-EB84-4ECB-8707-2A75EF9E2D95");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, "/");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, "EDC01183-3235-4D9E-9CF7-063005B517E7");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, "-");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, "2B0C139E-1CFE-4FC7-8054-449F71352715");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, "/");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, "D9557874-5A94-4B3A-810C-2B6662CFDCEF");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECUTVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, 0, "wsearch1.gif", false);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, "4D60596C-E6D0-41F8-9600-2730B51AFA0C");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ESECUTVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, 0, "info.gif", false);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, "85A36591-8984-4BA0-9E1E-1C5862321424");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, "E2C82357-D615-435C-88F9-89600CB6B86E");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, "AC9CDB5C-FBB7-4CA8-8490-0DFAB5DA079D");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, "Solo Controllo Disponibilità");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.VIS_CHECKSTYLE);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, "CEBC1A0A-30EB-480A-9778-7EB45D2F80B3");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, "Tipo Bi");
    PAN_ESECUTVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, "");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.VIS_OPTIONBUTTON);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECUTVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, "A85E1A71-4748-4374-ABC6-6D8569ACE10E");
    PAN_ESECUTVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, "Elabora");
    PAN_ESECUTVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECUTVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, 0, "button1.gif", false);
    PAN_ESECUTVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESECUTVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 12, 32, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 68);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_PROPOSTA, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_PROPOSTA, PPQRY_PAR15, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 216, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 152);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_NUMEROPROPOS, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_NUMEROPROPOS, PPQRY_PAR15, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 284, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 152);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_ANNOPROPOSTA, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_ANNOPROPOSTA, PPQRY_PAR15, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 24, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_DELIBERA, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_DELIBERA, PPQRY_PAR15, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delibera");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 148, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_NUMERODELIBE, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_NUMERODELIBE, PPQRY_PAR15, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 216, 60, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_ANNODELIBERA, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_ANNODELIBERA, PPQRY_PAR15, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 136, 8, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 196, 32, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_TRATTIPROPOS, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 144, 16, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 264, 32, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_BARRAPROPOST, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 144, 16, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 128, 60, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_TRATTIDELIBE, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 152, 24, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 196, 60, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_BARRADELIBER, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_LIST, 240, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_FORM, 260, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SCELTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_SCELTA, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_SCELTA, -1, "", "SCELTA", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_LIST, 264, 8, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_FORM, 280, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_INFO, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_INFO, -1, GRP_ESECUTVARIAZ_PROVVEDIMENT);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_LIST, 228, 96, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 148, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_NEWPANELLABE, -1, GRP_ESECUTVARIAZ_VARIAZIONI);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, "Variaz.");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 72, 140, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 56);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, "Variaz.");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_VARIAZIONI, -1, GRP_ESECUTVARIAZ_VARIAZIONI);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_VARIAZIONI, PPQRY_PAR15, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 1, 1, 0, -13997);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_LIST, 136);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_LIST, "S. Cn. Dsp.");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_FORM, 144, 176, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_FORM, 160);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_SOLOCONTDISP, MyGlb.PANEL_FORM, "Solo Controllo Disponibilità");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_SOLOCONTDISP, -1, -1);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_SOLOCONTDISP, PPQRY_PAR15, "A.ROWNAMSOCODI", "ROWNAMSOCODI", 5, 2, 0, -13997);
    PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_SOLOCONTDISP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_SOLOCONTDISP, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_LIST, 448, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_LIST, 40);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_LIST, "Tipo Bi");
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_FORM, 52, 208, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_FORM, 152);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_TIPOBI, MyGlb.PANEL_FORM, "Tipo Bi");
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_TIPOBI, -1, -1);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_TIPOBI, PPQRY_PAR15, "A.ROWNAMETIPBI", "ROWNAMETIPBI", 12, 1, 0, -13997);
    PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_TIPOBI, (new IDVariant("B")), "di Bilancio", "", "", -1);
    PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_TIPOBI, (new IDVariant("P")), "di Progetto", "", "", -1);
    PAN_ESECUTVARIAZ.SetValueListItem(PFL_ESECUTVARIAZ_TIPOBI, (new IDVariant("F")), "di Finanziamento", "", "", -1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_LIST, 176, 212, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESECUTVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_FORM, 248, 244, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECUTVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESECUTVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECUTVARIAZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESECUTVARIAZ.SetFieldPage(PFL_ESECUTVARIAZ_ELABORA, -1, -1);
    PAN_ESECUTVARIAZ.SetFieldPanel(PFL_ESECUTVARIAZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ESECUTVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESECUTVARIAZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESECUTVARIAZ.SetIMDB(IMDB, "PQRY_PAR15", true);
    PAN_ESECUTVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Par");
    PAN_ESECUTVARIAZ.SetQueryIMDB(PPQRY_PAR15, IMDBDef12.PQRY_PAR15_RS, IMDBDef3.TBL_PAR18);
    JustLoaded = true;
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_PROPOSTA, IMDBDef3.FLD_PAR18_ROWNAMUNIPRO);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_NUMEROPROPOS, IMDBDef3.FLD_PAR18_ROWNAMNUMPRO);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_ANNOPROPOSTA, IMDBDef3.FLD_PAR18_ROWNAMANNPRO);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_DELIBERA, IMDBDef3.FLD_PAR18_ROWNAMSEDDEL);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_NUMERODELIBE, IMDBDef3.FLD_PAR18_ROWNAMNUMDEL);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_ANNODELIBERA, IMDBDef3.FLD_PAR18_ROWNAMANNDEL);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_VARIAZIONI, IMDBDef3.FLD_PAR18_ROWNAMEVARIA);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_SOLOCONTDISP, IMDBDef3.FLD_PAR18_ROWNAMSOCODI);
    PAN_ESECUTVARIAZ.SetFieldPrimaryIndex(PFL_ESECUTVARIAZ_TIPOBI, IMDBDef3.FLD_PAR18_ROWNAMETIPBI);
    PAN_ESECUTVARIAZ.SetMasterTable(0, "PAR18");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESECUTVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ESECUTVARIAZ.iUseListQBE;
      PAN_ESECUTVARIAZ.iUseListQBE = 0;
      PAN_ESECUTVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESECUTVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ESECUTVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTRODISPON_MST_TEMPLATE_Init()
  {
    BUK_CONTRODISPON.InitMastro(BUK_CONTRODISPON_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_MST_TEMPLATE, "A152657E-57A5-48E7-87A4-28D055850D9C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_MST_TEMPLATE, "TEMPLATE");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_TESTATPAGIN2, 900, 500, 19600, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TESTATPAGIN2, "6289B757-A532-4F48-9DC8-8F7E0DF1A687");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TESTATPAGIN2, "TESTATPAGIN2");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2, 900, 1000, 19600, 26700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2, "2C92E2D1-1726-4B77-BA67-99EBC6A2FB29");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2, "CORPOPAGINA2");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PIEDEPAGINA2, 900, 27800, 19200, 1400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PIEDEPAGINA2, "160F27E9-F7F2-4AE8-85A6-B4BDB91CDAB0");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PIEDEPAGINA2, "PIEDEPAGINA2");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PAG2, 17600, 500, 2900, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAG2, "325AC054-9E17-4440-9C75-866BE3089DDB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAG2, "PAG2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PAG2, BUK_CONTRODISPON_SPAN_PAG1, MyGlb.VIS_NORMAA8RIGHT, 5, 204, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_PAG1, "921B069D-7F52-46CB-8EAF-6FC293A6A578");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_PAG1, "PAG1");
  }

  private void BUK_CONTRODISPON_RPT_REPORT_InitQuery() { BUK_CONTRODISPON_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONTRODISPON_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as RECORVARCOES, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) as RECOCAPIARTI, ");
      SQL.append("  A.CAPITOLO as RECOVARCCAPI, ");
      SQL.append("  A.ARTICOLO as RECOVARCARTI, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  SUM(C.IMPORTO) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO C ");
      SQL.append("where (C.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (C.E_S = B.E_S) ");
      SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (NVL(C.IMPORTO, 0) <> 0) ");
      SQL.append(") as RECVARPROCOM, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  SUM(D.IMPORTO_CASSA) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO D ");
      SQL.append("where (D.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (D.E_S = B.E_S) ");
      SQL.append("and   (D.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (NVL(D.IMPORTO_CASSA, 0) <> 0) ");
      SQL.append(") as RECVARPROCAS, ");
      SQL.append("  B.ESERCIZIO as RECORBILESER, ");
      SQL.append("  B.DISPONIBILITA as RECORBILDISP, ");
      SQL.append("  B.DISPONIBILITA_CA as RECOBILDISCA ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO A, ");
      SQL.append("  BIL B ");
      SQL.append("where (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PAR15.ROWNAMANNPRO~~, NVL(A.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PAR15.ROWNAMNUMPRO~~, NVL(A.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PAR15.ROWNAMUNIPRO~~, NVL(A.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("order by 1, 2 ");
      BUK_CONTRODISPON.SetReportQuery(BUK_CONTRODISPON_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "FAFA8C72-505E-4849-A2FF-80BF3D28423B");
      if (BUK_CONTRODISPON.FindObjByID(BUK_CONTRODISPON_SEC_ENTRSPESHEAD) != null)
        BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, "RECORVARCOES");
      if (BUK_CONTRODISPON.FindObjByID(BUK_CONTRODISPON_SEC_CAPARTINTGRU) != null)
        BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTRODISPON_RPT_REPORT_Init()
  {
    BUK_CONTRODISPON.InitReport(BUK_CONTRODISPON_RPT_REPORT, 196865);
    BUK_CONTRODISPON_RPT_REPORT_InitQuery(true, false);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPT_REPORT, "E8CECFF2-7EEF-41B3-80FD-8D5BA98A2C7E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPT_REPORT, "REPORT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_INTESTREPORT, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_INTESTREPORT, "E61EFCD7-3D87-4B4D-9FA3-2A4A07975301");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_INTESTPAGINA, 3100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_INTESTPAGINA, BUK_CONTRODISPON_RPTBOX_TESTATPAGIN2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_INTESTPAGINA, "8B1B0C20-CDF4-4CBD-AD5C-4D8A322BA737");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_ENTRSPESHEAD, 3200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORVARCOES");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, "D4006EF9-A3F2-4216-943E-5EDF1200F5FB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, "ENTRSPESHEAD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_TITOLO, 0, 300, 19200, 900, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TITOLO, "3CE74AF6-77A2-412A-B128-0BBB541F590D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TITOLO, "TITOLO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TITOLO, BUK_CONTRODISPON_SPAN_CONTRODISPON, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Controllo Disponibilità", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CONTRODISPON, "1F01C2A0-E801-4C3B-8C72-83667DFFB824");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TITOLO, BUK_CONTRODISPON_SPAN_TITOLO1, MyGlb.VIS_TITREPNOBOCE, 5, 201, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_TITOLO1, "D40605F1-A87D-4B60-8BCA-C82DA634A58A");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_TITOLO1, "TITOLO1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_CAPITOLOART2, 0, 1900, 3500, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CAPITOLOART2, "C97ED200-1FC4-4368-BD35-A60E8F37E916");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CAPITOLOART2, "CAPITOLOART2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CAPITOLOART2, BUK_CONTRODISPON_SPAN_CAPITOLOART2, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CAPITOLOART2, "6FCA5548-98B0-4AC0-B969-DE32606650BA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CAPITOLOART2, "CAPITOLOART2");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_COMPETENZA, 3500, 1900, 8100, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_COMPETENZA, "7B07990A-27A5-4F85-A4C2-C4B6CDD353A4");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_COMPETENZA, "COMPETENZA");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_COMPETELABEL, 3500, 1900, 8100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_COMPETELABEL, "93B54EE5-9149-4EC3-AE92-E70E8BAD819D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_COMPETELABEL, "COMPETELABEL");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_COMPETELABEL, BUK_CONTRODISPON_SPAN_COMPETENZA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Competenza", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_COMPETENZA, "2FD55A7E-E664-445B-9061-1796FB72BEAF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_COMPETENZA, "COMPETENZA");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_DISPONATTUA2, 3500, 2400, 2700, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONATTUA2, "101BEC59-14F6-486F-A38A-D470B3AF78B2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONATTUA2, "DISPONATTUA2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONATTUA2, BUK_CONTRODISPON_SPAN_DISPONATTUA8, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA8, "3D657299-220C-4293-87EB-2B59D387F860");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA8, "DISPONATTUA8");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_VARIAZPROVV2, 6200, 2400, 2700, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV2, "252E3E63-D322-4976-B05C-F21F7E8E87E9");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV2, "VARIAZPROVV2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV2, BUK_CONTRODISPON_SPAN_VARIAZPROVV2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_VARIAZPROVV2, "FEF3B097-BE3A-49C6-BAB8-CC1D3F6EF42A");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_VARIAZPROVV2, "VARIAZPROVV2");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_DISPONRISUL2, 8900, 2400, 2700, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONRISUL2, "BB885415-F97C-4759-BA3F-BE576FDAE305");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONRISUL2, "DISPONRISUL2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONRISUL2, BUK_CONTRODISPON_SPAN_DISPONRISUL2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONRISUL2, "70ACEE93-CD10-4424-8D15-34DD412CCFBD");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONRISUL2, "DISPONRISUL2");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_COMPETENZA1, 11800, 1900, 7800, 1300, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_COMPETENZA1, "538AEC63-E817-4DF8-A712-9858A9F8C0FE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_COMPETENZA1, "COMPETENZA1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_CASSALABEL1, 11800, 1900, 7800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CASSALABEL1, "2459408C-765F-42CA-8335-0E9643117BFF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CASSALABEL1, "CASSALABEL1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CASSALABEL1, BUK_CONTRODISPON_SPAN_CASSA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Cassa ", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CASSA, "075B139E-F97A-486F-8E3C-9EFCAFB14A49");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CASSA, "CASSA");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_DISPONATTUA3, 11800, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONATTUA3, "04C64A12-F7F8-4DB9-AC60-06B7A7F22C69");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONATTUA3, "DISPONATTUA3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONATTUA3, BUK_CONTRODISPON_SPAN_DISPONATTUA2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA2, "0B76B046-7109-4C47-8EC5-0BFBFD021D50");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA2, "DISPONATTUA2");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_VARIAZPROVV3, 14400, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV3, "481E9910-9C04-4108-8E86-DA94FAC374B5");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV3, "VARIAZPROVV3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARIAZPROVV3, BUK_CONTRODISPON_SPAN_VARIAZPROVV3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_VARIAZPROVV3, "66ED953C-EB7B-49C0-B4E4-D2EBA282F6D7");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_VARIAZPROVV3, "VARIAZPROVV3");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, BUK_CONTRODISPON_RPTBOX_DISPONRISUL3, 17000, 2400, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONRISUL3, "C19A985B-E414-4FFF-9B63-81654830A764");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONRISUL3, "DISPONRISUL3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONRISUL3, BUK_CONTRODISPON_SPAN_DISPONRISUL3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONRISUL3, "28355DD8-AD03-4184-B43D-08C215057A48");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONRISUL3, "DISPONRISUL3");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_CAPARTINTGRU, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECOCAPIARTI");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_CAPARTINTGRU, "857E9294-02D5-4A00-BEB4-B8BF569B0A76");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_CAPARTINTGRU, "CAPARTINTGRU");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_CAPITOLOART3, 0, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CAPITOLOART3, "06980451-4BDF-4B4A-8C2A-69E5B1B9B1BD");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CAPITOLOART3, "CAPITOLOART3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CAPITOLOART3, BUK_CONTRODISPON_SPAN_CAPITOLOART3, MyGlb.VIS_BOXNORMFIEA8, 5, 199, 0, 271319425, "12345678784215454/45", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CAPITOLOART3, "75771CBB-4895-4095-8B70-97F1143248A8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CAPITOLOART3, "CAPITOLOART3");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_DISPONATTUA4, 3500, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONATTUA4, "26003635-BB70-4C08-A5E7-EF0BF2BD4E66");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONATTUA4, "DISPONATTUA4");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONATTUA4, BUK_CONTRODISPON_SPAN_DISPONATTUA3, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECORBILDISP", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA3, "75B8CC2A-F53D-4BB2-9D97-7CA2A1F42237");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA3, "DISPONATTUA3");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_VARIAPROVVCO, 6200, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCO, "ACC601CF-182F-4E35-A6AA-A65882200FFF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCO, "VARIAPROVVCO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCO, BUK_CONTRODISPON_SPAN_DISPONATTUA4, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECVARPROCOM", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA4, "7A48B722-49B0-4F1D-80AA-39EFD3F253EA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA4, "DISPONATTUA4");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_RISULTANTECO, 8900, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_RISULTANTECO, "DD308194-357C-4D3B-A269-28E7D57ACC19");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_RISULTANTECO, "RISULTANTECO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_RISULTANTECO, BUK_CONTRODISPON_SPAN_DISPONATTUA5, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "123456787887,78", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA5, "C552EA5C-37B2-40CA-BC40-9A6CF2A7C567");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA5, "DISPONATTUA5");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_DISPOATTUACA, 11800, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPOATTUACA, "CD235159-AF39-49A5-A1BA-2E83B22ACF96");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPOATTUACA, "DISPOATTUACA");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPOATTUACA, BUK_CONTRODISPON_SPAN_DISPONATTUA6, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECOBILDISCA", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA6, "3888E696-BACA-41E9-B0BC-233D4236D690");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA6, "DISPONATTUA6");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_VARIAPROVVCA, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCA, "F6F47C9D-3173-4980-A0DD-532BFA449E03");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCA, "VARIAPROVVCA");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARIAPROVVCA, BUK_CONTRODISPON_SPAN_DISPONATTUA7, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECVARPROCAS", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA7, "4F42CF72-918C-4692-97C6-D10958928843");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA7, "DISPONATTUA7");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_CAPARTINTGRU, BUK_CONTRODISPON_RPTBOX_RISULTANTECA, 17000, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_RISULTANTECA, "83CE1D36-3DA5-4DE9-843A-AFFC09046110");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_RISULTANTECA, "RISULTANTECA");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_RISULTANTECA, BUK_CONTRODISPON_SPAN_DISPONATTUA9, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "123456787887,78", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONATTUA9, "C86F9308-006A-4CD4-A69C-A18453F4240D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONATTUA9, "DISPONATTUA9");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_DETTAGLIO, 0, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_DETTAGLIO, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_DETTAGLIO, "9C211A24-E3E7-40AE-9EA8-5C20C8F27377");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_CAPARTPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOCAPIARTI");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_CAPARTPIEGRU, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_CAPARTPIEGRU, "F42DAAD6-BCAD-4327-92C3-186F1C1CDF59");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_CAPARTPIEGRU, "CAPARTPIEGRU");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_ENTRSPESFOOT, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "RECORVARCOES");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_ENTRSPESFOOT, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_ENTRSPESFOOT, "0596B50C-BA9C-4944-BC7B-C8AB9794D4E1");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_ENTRSPESFOOT, "ENTRSPESFOOT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_PIEDEPAGINA, 1400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PIEDEPAGINA, BUK_CONTRODISPON_RPTBOX_PIEDEPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PIEDEPAGINA, "7ECC58CC-E663-411B-A95B-86886EF18B88");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PIEDEREPORT, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PIEDEREPORT, "9CB69DE7-44E7-4BC4-8C63-B02E83F0BF62");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_ENTRSPESHEAD, "RECORVARCOES");
    BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_CAPARTINTGRU, "RECOCAPIARTI");
    BUK_CONTRODISPON_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONTRODISPON_InitLinks()
  {
    BUK_CONTRODISPON.SetBoxNextBox(BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2, BUK_CONTRODISPON_RPTBOX_CORPOPAGINA2);
  }

  private void BUK_CONTDISPFINA_MST_TEMPLATE_Init()
  {
    BUK_CONTDISPFINA.InitMastro(BUK_CONTDISPFINA_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_MST_TEMPLATE, "90A55492-4A69-4BE9-B794-D1D530EB85F2");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_MST_TEMPLATE, "TEMPLATE");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, "6943C865-5D8D-49D9-84F1-6C6CD9735578");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, 1000, 3400, 19000, 24400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, "9D090E98-F11C-4F20-BBCB-4493A65F7B3A");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, 1000, 27900, 19000, 800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, "FCD3FBAA-B926-436F-9342-18D1D1FC5789");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_PAG, 16500, 1000, 3500, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_PAG, "9EA041A5-C4EF-4B7E-AE4F-ADC60C4652E1");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_PAG, "PAG");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_PAG, BUK_CONTDISPFINA_SPAN_PAG, MyGlb.VIS_NORMAA8RIGHT, 5, 204, 0, 271319169, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_PAG, "0EA6C4DF-E651-41F0-9070-FEA5CC478736");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_PAG, "PAG");
    BUK_CONTDISPFINA.InitMastroBox(BUK_CONTDISPFINA_MST_TEMPLATE, BUK_CONTDISPFINA_RPTBOX_TITOLO1, 1000, 1500, 19000, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_TITOLO1, "605D7275-059C-48DA-91D5-4E12FA9910A2");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_TITOLO1, "TITOLO1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_TITOLO1, BUK_CONTDISPFINA_SPAN_TIT, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271319425, "", "Controllo Disponibilità", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_TIT, "6252107C-0687-4747-A2B3-B0B78499850D");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_TIT, "TIT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_TITOLO1, BUK_CONTDISPFINA_SPAN_TITOLO, MyGlb.VIS_TITREPNOBOCE, 5, 201, 0, 271319169, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_TITOLO, "AD37229D-A459-435C-9D74-84BEA7FD2F1A");
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
      SQL.append("  VARCOMPRO B ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.VARIAZIONI IS NULL))) ");
      SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (A.E_S = B.E_S) ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (A.FINANZIAMENTO = B.FINANZIAMENTO) ");
      SQL.append("and   (A.OPERA = B.OPERA) ");
      SQL.append("and   (NVL(B.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PAR15.ROWNAMANNPRO~~, NVL(B.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(B.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PAR15.ROWNAMNUMPRO~~, NVL(B.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(B.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PAR15.ROWNAMUNIPRO~~, NVL(B.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("order by 1, 2 ");
      BUK_CONTDISPFINA.SetReportQuery(BUK_CONTDISPFINA_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D8D87C67-4A9D-4C13-AA03-466A99482F46");
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
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPT_REPORT, "ED4AAFDE-FF10-480A-A9E6-593563DCE433");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPT_REPORT, "REPORT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_INTESTREPORT, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_INTESTREPORT, "35C89298-AB60-40D6-A95B-DF6D242D2E51");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_INTESTPAGINA, 2400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_TESTATPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_INTESTPAGINA, "328245B1-86A9-4867-8BC7-6C291B1A5C76");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, 0, 1900, 3200, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, "C898F515-552F-4CF4-9F85-58451D46CA5A");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, "CAPITOLOART1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART1, BUK_CONTDISPFINA_SPAN_CAPITOLOART1, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_CAPITOLOART1, "2F62977F-99EE-455D-95CD-0D0BB05515CA");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_CAPITOLOART1, "CAPITOLOART1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, 3200, 1900, 2500, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, "F9AC14E4-62B1-475B-9096-1D913E16DB74");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_FINANZIAMEN1, BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Finanziamento", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, "98E5F988-B3E4-40FD-8685-392EC92A918F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, 7500, 1900, 3500, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, "8FF8BFE1-88B5-499A-A0E5-B58BEB93C924");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, "DISPONATTUA1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONATTUA1, BUK_CONTDISPFINA_SPAN_DISPONATTUA1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Disponibilità Attuale", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONATTUA1, "B25EC84E-3C62-4D70-9218-83CCAE31AA24");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONATTUA1, "DISPONATTUA1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, 14600, 1900, 3600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, "7F66FB1A-F934-4273-8BF6-FC78D5B1EECA");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, "DISPONRISUL1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONRISUL1, BUK_CONTDISPFINA_SPAN_DISPONRISUL1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Disponibilità Risultante", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONRISUL1, "B2485CBE-0054-4C31-93A1-704F4958D0B3");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONRISUL1, "DISPONRISUL1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, 11000, 1900, 3600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, "8C93071C-87BC-473A-9689-0AC23804A490");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, "VARIAZPROVV1");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVV1, BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Variazioni Provvisorie", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, "AD24D032-33BE-4149-838A-DFDB0C93F770");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_VARIAZPROVV1, "VARIAZPROVV1");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_INTESTPAGINA, BUK_CONTDISPFINA_RPTBOX_OPERA1, 5700, 1900, 1800, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_OPERA1, "F9E7AE13-CB80-4B3B-BFEF-5187DE5D3A51");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_OPERA1, "OPERA1");
    BUK_CONTDISPFINA.set_BoxAlignment(BUK_CONTDISPFINA_RPTBOX_OPERA1, 4);
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_OPERA1, BUK_CONTDISPFINA_SPAN_NUOVASPAN, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384705, "", "Opera", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_NUOVASPAN, "C5479223-BDBB-4117-A870-D9900D1BD754");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_BILFINESINGR, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOBILFINES");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_BILFINESINGR, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_BILFINESINGR, "A59F318D-EDB3-4497-975F-96509BDFF38A");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_BILFINESINGR, "BILFINESINGR");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_CAPARTINTGRU, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECOCAPIARTI");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "9AEE5BCF-3A38-42B9-98E9-D728D0DF5EA3");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, "CAPARTINTGRU");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, 0, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, "1173D2FE-D38D-4602-9DBE-E485B736195F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_CAPITOLOART, BUK_CONTDISPFINA_SPAN_CAPITOLOART, MyGlb.VIS_BOXNORMFIEA8, 5, 199, 0, 271319425, "", "::RECOCAPIARTI", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_CAPITOLOART, "C31D8F34-165B-4C85-950A-8183D8F8ADEF");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_CAPITOLOART, "CAPITOLOART");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, 3200, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, "782DAB31-59BD-4ED1-B4E0-E31A8173596F");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_FINANZIAMENT, BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, MyGlb.VIS_BOXNORMFIEA8, 1, 5, 0, 271319425, "", "::RECBILFINFIN", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, "1D90D5EA-7305-452E-A1AA-F1D69AFD6D93");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMEN2, "FINANZIAMEN2");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, 7500, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, "9AEA8624-3867-4149-9F89-9B84DCDA127B");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, "DISPONATTUAL");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONATTUAL, BUK_CONTDISPFINA_SPAN_DISPONATTUAL, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "::RECBILFINDIS", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONATTUAL, "5B98E02C-C23A-4FE7-AF5A-D5B0AB4CF5FA");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONATTUAL, "DISPONATTUAL");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, 14600, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, "91597719-195F-40C8-A44F-9425EE0FD6F6");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_DISPONRISULT, BUK_CONTDISPFINA_SPAN_DISPONRISULT, MyGlb.VIS_BOXNORMFIEA8, 3, 28, 6, 271319425, "", "", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_DISPONRISULT, "E3A2CB74-D29C-44F5-902A-61A7F3662E31");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, 11000, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, "C13FA71C-5ADD-4C04-81AA-6EB0A48E79D1");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, "VARIAZPROVVI");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_VARIAZPROVVI, BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, MyGlb.VIS_BOXNORMFIEA8, 3, 14, 6, 271319425, "", "::RECBILFINVAR", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, "64015DF3-FE9C-48EF-8653-5DE06F95EEED");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_VARIAZPROVVI, "VARIAZPROVVI");
    BUK_CONTDISPFINA.InitReportBox(BUK_CONTDISPFINA_SEC_CAPARTINTGRU, BUK_CONTDISPFINA_RPTBOX_OPERA, 5700, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_BOXNORMFIEA8, 983041, 340, "", 1, -33);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_RPTBOX_OPERA, "637EB36D-EA34-436D-B1C7-7707E6D55C8E");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_RPTBOX_OPERA, "OPERA");
    BUK_CONTDISPFINA.InitBoxSpan(BUK_CONTDISPFINA_RPTBOX_OPERA, BUK_CONTDISPFINA_SPAN_FINANZIAMENT, MyGlb.VIS_BOXNORMFIEA8, 1, 5, 0, 271319425, "", "::RECBILFINOPE", 1);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SPAN_FINANZIAMENT, "B14585B5-2030-4BAD-8471-0B5B6C5CF7E7");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_DETTAGLIO, 100, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_DETTAGLIO, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_DETTAGLIO, "1ABDE72E-9810-42F8-B4B6-515D41A21368");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOCAPIARTI");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, "42BCC4A5-3BB0-4478-BA96-011A5A1D214E");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_CAPARTPIEGRU, "CAPARTPIEGRU");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_BILFINESPIGR, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "RECOBILFINES");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_BILFINESPIGR, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_BILFINESPIGR, "C8B6EAD5-C380-455B-AF7D-0EE560D3436B");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_BILFINESPIGR, "BILFINESPIGR");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_PIEDEPAGINA, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, BUK_CONTDISPFINA_RPTBOX_PIEDEPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, "85E9F1B8-F376-4C7A-BE36-C7E96CCE751E");
    BUK_CONTDISPFINA.SetObjCode(BUK_CONTDISPFINA_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTDISPFINA.InitSection(BUK_CONTDISPFINA_RPT_REPORT, BUK_CONTDISPFINA_SEC_PIEDEREPORT, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTDISPFINA.SetSectionRendersInto(BUK_CONTDISPFINA_SEC_PIEDEREPORT, BUK_CONTDISPFINA_RPTBOX_CORPOPAGINA);
    BUK_CONTDISPFINA.SetRTCGuid(BUK_CONTDISPFINA_SEC_PIEDEREPORT, "594FAC86-F56D-4A8B-BEC1-2AECDAA70566");
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
    if (SrcObj == PAN_ESECUTVARIAZ) PAN_ESECUTVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECUTVARIAZ) PAN_ESECUTVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESECUTVARIAZ) PAN_ESECUTVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECUTVARIAZ) PAN_ESECUTVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESECUTVARIAZ) PAN_ESECUTVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
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
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnConnecting(DBConn);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONTDISPFINA) BUK_CONTDISPFINA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnPreview();
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
