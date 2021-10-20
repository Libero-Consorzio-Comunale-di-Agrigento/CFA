// **********************************************
// Avanzo Esercizio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AvanzoEsercizio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMEFILTRI_FILTRI = 0;

  private static int PFL_PARAMEFILTRI_FONDOACCANTO = 0;
  private static int PFL_PARAMEFILTRI_TIPOAVANZO = 1;
  private static int PFL_PARAMEFILTRI_STAMAVANESER = 2;

  private static int PPQRY_PARAMETRI693 = 0;

  private static int PPQRY_ATTRIBUTICFA = 1;
  private static int PPQRY_TIPIAVANZO = 2;


  IDPanel PAN_PARAMEFILTRI;
  private static int PFL_VALOAVANESER_AVANZOINIZIA = 0;
  private static int PFL_VALOAVANESER_INFOAVANINIZ = 1;
  private static int PFL_VALOAVANESER_ACCERTAMENTI = 2;
  private static int PFL_VALOAVANESER_INFOACCERTAM = 3;
  private static int PFL_VALOAVANESER_RESIATTIAUME = 4;
  private static int PFL_VALOAVANESER_INFRESATTAUM = 5;
  private static int PFL_VALOAVANESER_RESIATTIDIMI = 6;
  private static int PFL_VALOAVANESER_INFRESATTDIM = 7;
  private static int PFL_VALOAVANESER_IMPEGNI = 8;
  private static int PFL_VALOAVANESER_INFOIMPEGNI = 9;
  private static int PFL_VALOAVANESER_FPV = 10;
  private static int PFL_VALOAVANESER_INFOFPV = 11;
  private static int PFL_VALOAVANESER_RESIPASSRIDU = 12;
  private static int PFL_VALOAVANESER_INFRESPASRID = 13;
  private static int PFL_VALOAVANESER_IMPEREISRIDU = 14;
  private static int PFL_VALOAVANESER_INFIMPREIRID = 15;
  private static int PFL_VALOAVANESER_AVANZOFINALE = 16;
  private static int PFL_VALOAVANESER_INFOAVANFINA = 17;

  private static int PPQRY_PARAMETRI694 = 0;


  IDPanel PAN_VALOAVANESER;
  private static int PFL_PARAMETRI_NOTEVERSIONE = 0;
  private static int PFL_PARAMETRI_SALVA = 1;

  private static int PPQRY_PARAMETRI695 = 0;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_AVANESERLIBR;
  OBook BKW_AVANESERLIBR;
  //
  // Template Pages constants
  private static int BUK_AVANESERLIBR_MST_AVANESERMAST = 1;
  private static int BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA = 2;

  //
  // Reports constants
  private static int BUK_AVANESERLIBR_RPT_AVANESERREPO = 3;
  private static int BUK_AVANESERLIBR_SEC_INTESTREPORT = 4;
  private static int BUK_AVANESERLIBR_RPTBOX_TITOLO = 5;
  private static int BUK_AVANESERLIBR_SPAN_NUOVASPAN1 = 6;
  private static int BUK_AVANESERLIBR_SPAN_TOSTRIPARESE = 7;
  private static int BUK_AVANESERLIBR_SEC_INTESTPAGINA = 8;
  private static int BUK_AVANESERLIBR_SEC_DETTAGLIO = 9;
  private static int BUK_AVANESERLIBR_RPTBOX_FONDACCAHEAD = 10;
  private static int BUK_AVANESERLIBR_SPAN_PARDESFONACC = 11;
  private static int BUK_AVANESERLIBR_RPTBOX_FONDOACCANTO = 12;
  private static int BUK_AVANESERLIBR_SPAN_REPADFAAEAEL = 13;
  private static int BUK_AVANESERLIBR_RPTBOX_TIPOAVANHEAD = 14;
  private static int BUK_AVANESERLIBR_SPAN_PARDESTIPAVA = 15;
  private static int BUK_AVANESERLIBR_RPTBOX_TIPOAVANZO = 16;
  private static int BUK_AVANESERLIBR_SPAN_REPADTAAEAEL = 17;
  private static int BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD = 18;
  private static int BUK_AVANESERLIBR_SPAN_VALOAVANINI1 = 19;
  private static int BUK_AVANESERLIBR_SPAN_ESERCIZIO1 = 20;
  private static int BUK_AVANESERLIBR_RPTBOX_AVANZOINIZIA = 21;
  private static int BUK_AVANESERLIBR_SPAN_VALOAVANINIZ = 22;
  private static int BUK_AVANESERLIBR_RPTBOX_ACCERTHEADER = 23;
  private static int BUK_AVANESERLIBR_SPAN_VALORIACCER1 = 24;
  private static int BUK_AVANESERLIBR_RPTBOX_ACCERTAMENTI = 25;
  private static int BUK_AVANESERLIBR_SPAN_VALORIACCERT = 26;
  private static int BUK_AVANESERLIBR_RPTBOX_RESATTAUMHEA = 27;
  private static int BUK_AVANESERLIBR_SPAN_VALRESATTAU1 = 28;
  private static int BUK_AVANESERLIBR_RPTBOX_RESIATTIAUME = 29;
  private static int BUK_AVANESERLIBR_SPAN_VALRESATTAUM = 30;
  private static int BUK_AVANESERLIBR_RPTBOX_RESATTDIMHEA = 31;
  private static int BUK_AVANESERLIBR_SPAN_VALRESATTDI1 = 32;
  private static int BUK_AVANESERLIBR_RPTBOX_RESIATTIDIMI = 33;
  private static int BUK_AVANESERLIBR_SPAN_VALRESATTDIM = 34;
  private static int BUK_AVANESERLIBR_RPTBOX_IMPEGNHEADER = 35;
  private static int BUK_AVANESERLIBR_SPAN_VALORIIMPEG1 = 36;
  private static int BUK_AVANESERLIBR_RPTBOX_IMPEGNI = 37;
  private static int BUK_AVANESERLIBR_SPAN_VALORIIMPEGN = 38;
  private static int BUK_AVANESERLIBR_RPTBOX_FPVHEADER = 39;
  private static int BUK_AVANESERLIBR_SPAN_VALORIFPV1 = 40;
  private static int BUK_AVANESERLIBR_RPTBOX_FPV = 41;
  private static int BUK_AVANESERLIBR_SPAN_VALORIFPV = 42;
  private static int BUK_AVANESERLIBR_RPTBOX_RESPASRIDHEA = 43;
  private static int BUK_AVANESERLIBR_SPAN_VALRESPASRI1 = 44;
  private static int BUK_AVANESERLIBR_RPTBOX_RESIPASSRIDU = 45;
  private static int BUK_AVANESERLIBR_SPAN_VALRESPASRID = 46;
  private static int BUK_AVANESERLIBR_RPTBOX_IMPREIRIDHEA = 47;
  private static int BUK_AVANESERLIBR_SPAN_VALIMPREIRI1 = 48;
  private static int BUK_AVANESERLIBR_RPTBOX_IMPEREISRIDU = 49;
  private static int BUK_AVANESERLIBR_SPAN_VALIMPREIRID = 50;
  private static int BUK_AVANESERLIBR_RPTBOX_LINEA = 51;
  private static int BUK_AVANESERLIBR_SPAN_NUOVASPAN = 52;
  private static int BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD = 53;
  private static int BUK_AVANESERLIBR_SPAN_VALOAVANFIN1 = 54;
  private static int BUK_AVANESERLIBR_SPAN_ESERCIZIO = 55;
  private static int BUK_AVANESERLIBR_RPTBOX_AVANZOFINALE = 56;
  private static int BUK_AVANESERLIBR_SPAN_VALOAVANFINA = 57;
  private static int BUK_AVANESERLIBR_SEC_PIEDEPAGINA = 58;
  private static int BUK_AVANESERLIBR_SEC_PIEDEREPORT = 59;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI697(IMDB);
    Init_TBL_VALOAVANESER(IMDB);
    //
    //
    Init_PQRY_PARAMETRI693(IMDB);
    Init_PQRY_PARAMETRI693_RS(IMDB);
    Init_PQRY_PARAMETRI694(IMDB);
    Init_PQRY_PARAMETRI694_RS(IMDB);
    Init_PQRY_PARAMETRI695(IMDB);
    Init_PQRY_PARAMETRI695_RS(IMDB);
    Init_PQRY_VALOAVANESE1(IMDB);
    Init_PQRY_VALOAVANESE1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI697(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI697, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI697, "TBL_PARAMETRI697");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, "PARAVERSSALV");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, "PARAFONDACCA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA,5,50,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, "PARATIPOAVAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARANOTEVERS, "PARANOTEVERS");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARANOTEVERS,5,200,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARDESFONACC, "PARDESFONACC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARDESFONACC,5,200,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARDESTIPAVA, "PARDESTIPAVA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI697,IMDBDef4.FLD_PARAMETRI697_PARDESTIPAVA,5,200,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI697, 0);
  }

  private static void Init_TBL_VALOAVANESER(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VALOAVANESER, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_VALOAVANESER, "TBL_VALOAVANESER");
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ, "VALOAVANINIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIACCERT, "VALORIACCERT");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIACCERT,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM, "VALRESATTAUM");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM, "VALRESATTDIM");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN, "VALORIIMPEGN");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIFPV, "VALORIFPV");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALORIFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESPASRID, "VALRESPASRID");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALRESPASRID,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID, "VALIMPREIRID");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA, "VALOAVANFINA");
    IMDB.SetFldParams(IMDBDef4.TBL_VALOAVANESER,IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA,3,14,2);
    IMDB.TblAddNew(IMDBDef4.TBL_VALOAVANESER, 0);
  }

  private static void Init_PQRY_PARAMETRI693(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI693, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI693, "PQRY_PARAMETRI693");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI693,IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, "PARATIPOAVAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI693,IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI693,IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, "PARAFONDACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI693,IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA,5,50,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI693, 0);
  }

  private static void Init_PQRY_PARAMETRI693_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI693_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI693_RS, "PQRY_PARAMETRI693_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI693_RS,IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, "PARATIPOAVAN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI693_RS,IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI693_RS,IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, "PARAFONDACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI693_RS,IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA,5,50,0);
  }

  private static void Init_PQRY_PARAMETRI694(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI694, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI694, "PQRY_PARAMETRI694");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALOAVANINIZ, "VALOAVANINIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALOAVANINIZ,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIACCERT, "VALORIACCERT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIACCERT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESATTAUM, "VALRESATTAUM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESATTAUM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESATTDIM, "VALRESATTDIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESATTDIM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIIMPEGN, "VALORIIMPEGN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIIMPEGN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIFPV, "VALORIFPV");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALORIFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESPASRID, "VALRESPASRID");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALRESPASRID,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALIMPREIRID, "VALIMPREIRID");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALIMPREIRID,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALOAVANFINA, "VALOAVANFINA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694,IMDBDef13.PQSL_PARAMETRI694_VALOAVANFINA,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI694, 0);
  }

  private static void Init_PQRY_PARAMETRI694_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI694_RS, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI694_RS, "PQRY_PARAMETRI694_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALOAVANINIZ, "VALOAVANINIZ");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALOAVANINIZ,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIACCERT, "VALORIACCERT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIACCERT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESATTAUM, "VALRESATTAUM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESATTAUM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESATTDIM, "VALRESATTDIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESATTDIM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIIMPEGN, "VALORIIMPEGN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIIMPEGN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIFPV, "VALORIFPV");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALORIFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESPASRID, "VALRESPASRID");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALRESPASRID,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALIMPREIRID, "VALIMPREIRID");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALIMPREIRID,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALOAVANFINA, "VALOAVANFINA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI694_RS,IMDBDef13.PQSL_PARAMETRI694_VALOAVANFINA,3,14,2);
  }

  private static void Init_PQRY_PARAMETRI695(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI695, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI695, "PQRY_PARAMETRI695");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI695,IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS, "PARANOTEVERS");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI695,IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS,5,200,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI695, 0);
  }

  private static void Init_PQRY_PARAMETRI695_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI695_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI695_RS, "PQRY_PARAMETRI695_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI695_RS,IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS, "PARANOTEVERS");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI695_RS,IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS,5,200,0);
  }

  private static void Init_PQRY_VALOAVANESE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VALOAVANESE1, 11);
    IMDB.set_TblCode(IMDBDef13.PQRY_VALOAVANESE1, "PQRY_VALOAVANESE1");
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAINI, "RECVALAVAINI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAINI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOACCE, "RECOVALOACCE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOACCE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATAU, "RECVALREATAU");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATAU,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATDI, "RECVALREATDI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATDI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOIMPE, "RECOVALOIMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOIMPE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECORVALOFPV, "RECORVALOFPV");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECORVALOFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREPARI, "RECVALREPARI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALREPARI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALIMRERI, "RECVALIMRERI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALIMRERI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAFIN, "RECVALAVAFIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAFIN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECPARDEFOAC, "RECPARDEFOAC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECPARDEFOAC,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECPARDETIAV, "RECPARDETIAV");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1,IMDBDef13.PQSL_VALOAVANESE1_RECPARDETIAV,5,200,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VALOAVANESE1, 0);
  }

  private static void Init_PQRY_VALOAVANESE1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VALOAVANESE1_RS, 11);
    IMDB.set_TblCode(IMDBDef13.PQRY_VALOAVANESE1_RS, "PQRY_VALOAVANESE1_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAINI, "RECVALAVAINI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAINI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOACCE, "RECOVALOACCE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOACCE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATAU, "RECVALREATAU");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATAU,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATDI, "RECVALREATDI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREATDI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOIMPE, "RECOVALOIMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECOVALOIMPE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECORVALOFPV, "RECORVALOFPV");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECORVALOFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREPARI, "RECVALREPARI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALREPARI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALIMRERI, "RECVALIMRERI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALIMRERI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAFIN, "RECVALAVAFIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECVALAVAFIN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECPARDEFOAC, "RECPARDEFOAC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECPARDEFOAC,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECPARDETIAV, "RECPARDETIAV");
    IMDB.SetFldParams(IMDBDef13.PQRY_VALOAVANESE1_RS,IMDBDef13.PQSL_VALOAVANESE1_RECPARDETIAV,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AvanzoEsercizio(MyWebEntryPoint w, IMDBObj imdb)
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
  public AvanzoEsercizio()
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
    FormIdx = MyGlb.FRM_AVANZOESERCI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F7F8A5E5-4E7E-4751-9B71-78815CC6BD73";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 672;
    DesignHeight = 450;
    set_Caption(new IDVariant("Avanzo Esercizio"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 672;
    Frames[1].Height = 424;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.764151;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 672;
    Frames[2].Height = 324;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.259259;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 672;
    Frames[3].Height = 84;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri Filtri";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 84;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_PARAMEFILTRI = new IDPanel(w, this, 3, "PAN_PARAMEFILTRI");
    Frames[3].Content = PAN_PARAMEFILTRI;
    PAN_PARAMEFILTRI.Lockable = false;
    PAN_PARAMEFILTRI.iLocked = false;
    PAN_PARAMEFILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEFILTRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 84-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEFILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5FA8CDAE-71EC-41A3-BAD7-1704233A5257");
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 264, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEFILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEFILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEFILTRI.InitStatus = 1;
    PAN_PARAMEFILTRI_Init();
    PAN_PARAMEFILTRI_InitFields();
    PAN_PARAMEFILTRI_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 672;
    Frames[4].Height = 240;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Valori Avanzo Esercizio";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 240;
    PAN_VALOAVANESER = new IDPanel(w, this, 4, "PAN_VALOAVANESER");
    Frames[4].Content = PAN_VALOAVANESER;
    PAN_VALOAVANESER.Lockable = false;
    PAN_VALOAVANESER.iLocked = false;
    PAN_VALOAVANESER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALOAVANESER.VS = MainFrm.VisualStyleList;
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B3B60B26-C417-4DE4-9BC9-39A3BFDFED86");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 608, 216, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALOAVANESER.InitStatus = 1;
    PAN_VALOAVANESER_Init();
    PAN_VALOAVANESER_InitFields();
    PAN_VALOAVANESER_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 672;
    Frames[5].Height = 100;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Parametri";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 100;
    PAN_PARAMETRI = new IDPanel(w, this, 5, "PAN_PARAMETRI");
    Frames[5].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 100-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F638D1DE-9113-4D3C-B83E-1418BDB068E7");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_AVANESERLIBR = new OBook(this);
    BUK_AVANESERLIBR = new CIDREObj(BKW_AVANESERLIBR);
    BKW_AVANESERLIBR.iGuid = "19D08385-9F5F-488D-8F8B-EBB0E18D0882";
    BKW_AVANESERLIBR.Code = "BUK_AVANESERLIBR";
    BKW_AVANESERLIBR.BookObj = BUK_AVANESERLIBR;
    BKW_AVANESERLIBR.InitDefMasks();
    BUK_AVANESERLIBR.InitBook(1, 1245441, "Avanzo Esercizio Libro", IMDB, MainFrm.VisualStyleList);
    BUK_AVANESERLIBR.InitHTML();
    BUK_AVANESERLIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_AVANESERLIBR.Book.SetMainFrm(MainFrm);
    BUK_AVANESERLIBR.SetRTCGuid(0, "19D08385-9F5F-488D-8F8B-EBB0E18D0882");
    BUK_AVANESERLIBR.SetObjCode(0, "AVANESERLIBR");
    BUK_AVANESERLIBR_MST_AVANESERMAST_Init();
    BUK_AVANESERLIBR_RPT_AVANESERREPO_Init();
    BUK_AVANESERLIBR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI697, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVANZOESERCI_PARAMETRI693();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_VALOAVANESER, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVANZOESERCI_PARAMETRI694();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI697, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVANZOESERCI_PARAMETRI695();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_VALOAVANESER, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef4.TBL_PARAMETRI697, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVANZOESERCI_VALOAVANESE1();
      }
      PAN_PARAMEFILTRI.UpdatePanel(MainFrm);
      PAN_VALOAVANESER.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_AVANESERLIBR.UpdateBook();
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
    if (Code.equals("BUK_AVANESERLIBR")) return BUK_AVANESERLIBR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof AvanzoEsercizio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AvanzoEsercizio.class.getName() : (Glb.ClassWithPackage(AvanzoEsercizio.class) ? AvanzoEsercizio.class.getName().substring(AvanzoEsercizio.class.getPackage().getName().length() + 1) : AvanzoEsercizio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Filtri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEFILTRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Filtri On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldWasModified.booleanValue())
      {
        if (Column.equals((new IDVariant(PFL_PARAMEFILTRI_FONDOACCANTO)), true) || Column.equals((new IDVariant(PFL_PARAMEFILTRI_TIPOAVANZO)), true))
        {
          CalcolaAvanzoEsercizio();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "ParametriFiltriOnUpdatingRow", _e);
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Avanzo Esercizio "));
      IDVariant v_AVANZOINIZIA = new IDVariant(0,IDVariant.STRING);
      v_AVANZOINIZIA = (new IDVariant("Avanzo al 31/12/"));
      IDVariant v_AVANZOFINALE = new IDVariant(0,IDVariant.STRING);
      v_AVANZOFINALE = (new IDVariant("= Avanzo Esercizio "));
      IDVariant v_ACCERTAMENTI = new IDVariant(0,IDVariant.STRING);
      v_ACCERTAMENTI = (new IDVariant("+ Accertamenti di competenza "));
      IDVariant v_IMPEGNI = new IDVariant(0,IDVariant.STRING);
      v_IMPEGNI = (new IDVariant("- Impegni di competenza "));
      set_Caption(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))));
      PAN_VALOAVANESER.set_Header(Glb.OBJ_FIELD,PFL_VALOAVANESER_AVANZOINIZIA, IDL.Add(v_AVANZOINIZIA, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), (new IDVariant(1))))).stringValue());
      PAN_VALOAVANESER.set_Header(Glb.OBJ_FIELD,PFL_VALOAVANESER_ACCERTAMENTI, IDL.Add(v_ACCERTAMENTI, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))).stringValue());
      PAN_VALOAVANESER.set_Header(Glb.OBJ_FIELD,PFL_VALOAVANESER_IMPEGNI, IDL.Add(v_IMPEGNI, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))).stringValue());
      PAN_VALOAVANESER.set_Header(Glb.OBJ_FIELD,PFL_VALOAVANESER_AVANZOFINALE, IDL.Add(v_IMPEGNI, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))).stringValue());
      PAN_VALOAVANESER.set_Header(Glb.OBJ_FIELD,PFL_VALOAVANESER_AVANZOFINALE, IDL.Add(v_AVANZOFINALE, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))).stringValue());
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0, (new IDVariant("-1")));
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0)))
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
      CalcolaAvanzoEsercizio();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMEDELETE();
      UNLOAD_VALAVAESEDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARANOTEVERS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESFONACC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESTIPAVA, 0, new IDVariant());
  }

  // **********************************************************************
  // Valori Avanzo Esercizio: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_VALAVAESEDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIACCERT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIFPV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESPASRID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA, 0, new IDVariant());
  }

  // **********************************************************************
  // Calcola Avanzo Esercizio
  // **********************************************************************
  public int CalcolaAvanzoEsercizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Avanzo Esercizio Body
      // Corpo Procedura
      // 
      // 
      // Avanzo iniziale
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUAVESI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'AVANZO_INIZIALE') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ, 0, QV.Get("NUVASUAVESI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Accertamenti Competenza
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUAVESI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'ACC_COMPETENZA') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIACCERT, 0, QV.Get("NUVASUAVESI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Residui Attivi Aumento
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUAVESI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'VAR_AUMENTO_ACC') ");
      SQL.append("and   (A.IMPORTO > 0) ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM, 0, QV.Get("NUVASUAVESI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Residui Attivi Diminuzione
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  ABS(NVL(SUM(A.IMPORTO), 0)) as ABNUVASUAEI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'VAR_DIMINUZ_ACC') ");
      SQL.append("and   (A.IMPORTO < 0) ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM, 0, QV.Get("ABNUVASUAEI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Impegni Competenza
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUAVESI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'IMP_COMPETENZA') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN, 0, QV.Get("NUVASUAVESI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // FPV
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  ABS(NVL(SUM(A.IMPORTO), 0)) as ABNUVASUAEI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'FPV_SPESA') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIFPV, 0, QV.Get("ABNUVASUAEI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Residui Passivi Riduzione
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  ABS(NVL(SUM(A.IMPORTO * -1), 0)) as ABNUVASAEI10 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'VAR_DIMINUZ_IMP_COMP') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESPASRID, 0, QV.Get("ABNUVASAEI10", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Impegni Reiscritti Riduzione
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  ABS(NVL(SUM(A.IMPORTO), 0)) as ABNUVASUAEI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'VAR_DIMINUZ_IMP_REISCR') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID, 0, QV.Get("ABNUVASUAEI0", IDVariant.DECIMAL));
      }
      QV.Close();
      // 
      // Avanzo Finale
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUAVESI0 ");
      SQL.append("from ");
      SQL.append("  AVANZO_ESERCIZIO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGR_SESSIONE = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_SESSIONE)) ");
      SQL.append("and   (NVL(A.ID_SALVATAGGIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), -1, " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.TIPO_MOVIMENTO = 'AVANZO_FINALE') ");
      SQL.append("and   (A.TIPO_AVANZO = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), -1, A.TIPO_AVANZO, NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      SQL.append("and   (NVL(A.COD_AVANZO_VINCA2, 'X') = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "), '-1', NVL(A.COD_AVANZO_VINCA2, 'X'), NVL(" + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI693, IMDBDef13.PQSL_PARAMETRI693_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA, 0, QV.Get("NUVASUAVESI0", IDVariant.DECIMAL));
      }
      QV.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "CalcolaAvanzoEsercizio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI695, IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare le Note per il salvataggio"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IDVariant v_IDSALVATAGGI = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
        v_CONFERMA = (new IDVariant("Dati Salvati"));
        MainFrm.Cf4armDBObject.BeginTrans();
        try
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  ENTITA_SALVATE_SQ.nextval as ENTITSALVASQ ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IDSALVATAGGI = QV.Get("ENTITSALVASQ", IDVariant.DECIMAL) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("update AVANZO_ESERCIZIO set ");
          SQL.append("  ID_SALVATAGGIO = " + IDL.CSql(v_IDSALVATAGGI, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((ID_SALVATAGGIO IS NULL)) ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          SQL = new StringBuffer();
          SQL.append("insert into ENTITA_SALVATE ");
          SQL.append("( ");
          SQL.append("  ID_SALVATAGGIO, ");
          SQL.append("  PROGR_SESSIONE, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  TIPO_ENTITA, ");
          SQL.append("  NOTA_SALVATAGGIO, ");
          SQL.append("  DATA_SALVATAGGIO, ");
          SQL.append("  UTENTE_SALVATAGGIO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(v_IDSALVATAGGI, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  'AVANZO', ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAMETRI695, IMDBDef13.PQSL_PARAMETRI695_PARANOTEVERS, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ), ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e5)
        {
          MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        MainFrm.Cf4armDBObject.CommitTrans();
        MainFrm.set_AlertMessage(v_CONFERMA); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Avanzo Iniziale
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAvanzoIniziale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Avanzo Iniziale Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("AVANZO_INIZIALE")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoAvanzoIniziale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamenti Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("ACC_COMPETENZA")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Residui Attivi Aumento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoResiduiAttiviAumento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Residui Attivi Aumento Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("VAR_AUMENTO_ACC")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoResiduiAttiviAumento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Residui Attivi Diminuzione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoResiduiAttiviDiminuzione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Residui Attivi Diminuzione Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("VAR_DIMINUZ_ACC")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoResiduiAttiviDiminuzione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegni Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("IMP_COMPETENZA")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info FPV
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFPV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info FPV Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("FPV_SPESA")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoFPV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Residui Passivi Riduzione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoResiduiPassiviRiduzione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Residui Passivi Riduzione Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("VAR_DIMINUZ_IMP_COMP")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoResiduiPassiviRiduzione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegni Reiscritti Riduzione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegniReiscrittiRiduzione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegni Reiscritti Riduzione Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("VAR_DIMINUZ_IMP_REISCR")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoImpegniReiscrittiRiduzione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Avanzo Finale
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAvanzoFinale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Avanzo Finale Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_DETTAGAVANZO,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAMESERCIZ, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAVERSSALV, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAVERSSALV, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARAFONDACCA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOAVAN, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI698, IMDBDef4.FLD_PARAMETRI698_PARATIPOMOVI, 0, (new IDVariant("AVANZO_FINALE")));
      MainFrm.Show(MyGlb.FRM_DETTAGAVANZO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "InfoAvanzoFinale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESFONACC, 0, (new IDVariant(PAN_PARAMEFILTRI.FieldText(PFL_PARAMEFILTRI_FONDOACCANTO))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESTIPAVA, 0, (new IDVariant(PAN_PARAMEFILTRI.FieldText(PFL_PARAMEFILTRI_TIPOAVANZO))));
      BUK_AVANESERLIBR.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_AVANESERLIBR.RefreshQuery();
      BUK_AVANESERLIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_AVANESERLIBR.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoEsercizio", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AVANZOESERCI_PARAMETRI693() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI693_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI697, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI693_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI693_RS, 0, IMDBDef4.TBL_PARAMETRI697, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI693_RS, 0, 0, IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI693_RS, 1, 0, IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI697, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI697, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI693_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AVANZOESERCI_PARAMETRI694() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI694_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_VALOAVANESER, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_VALOAVANESER, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI694_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI694_RS, 0, IMDBDef4.TBL_VALOAVANESER, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 0, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 1, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIACCERT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 2, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 3, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 4, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 5, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIFPV, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 6, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESPASRID, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 7, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI694_RS, 8, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_VALOAVANESER, 0);
      if (IMDB.Eof(IMDBDef4.TBL_VALOAVANESER, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_VALOAVANESER, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI694_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AVANZOESERCI_PARAMETRI695() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI695_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI697, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI695_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI695_RS, 0, IMDBDef4.TBL_PARAMETRI697, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI695_RS, 0, 0, IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARANOTEVERS, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI697, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI697, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI695_RS, 0);
  }

  // **********************************************************************
  // Valori Avanzo Esercizio
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AVANZOESERCI_VALOAVANESE1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_VALOAVANESE1_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_VALOAVANESER, 0);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_VALOAVANESER, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_VALOAVANESE1_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_VALOAVANESE1_RS, 0, IMDBDef4.TBL_VALOAVANESER, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_VALOAVANESE1_RS, 0, IMDBDef4.TBL_PARAMETRI697, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 0, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 1, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIACCERT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 2, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 3, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 4, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 5, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALORIFPV, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 6, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALRESPASRID, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 7, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 8, 0, IMDBDef4.TBL_VALOAVANESER, IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 9, 0, IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESFONACC, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_VALOAVANESE1_RS, 10, 0, IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARDESTIPAVA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI697, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI697, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI697, 0);
      }
      else
      {
        continue Loop1;
      }
      IMDB.TblMoveNext(IMDBDef4.TBL_VALOAVANESER, 0);
      if (IMDB.Eof(IMDBDef4.TBL_VALOAVANESER, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_VALOAVANESER, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_VALOAVANESE1_RS, 0);
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
  private void PAN_PARAMEFILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEFILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEFILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEFILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEFILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEFILTRI);
    // Stub
  }

  private void PAN_PARAMEFILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMEFILTRI_STAMAVANESER)
    {
      this.IdxPanelActived = this.PAN_PARAMEFILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Stampa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMEFILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMEFILTRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEFILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEFILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VALOAVANESER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VALOAVANESER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALOAVANESER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALOAVANESER, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALOAVANESER_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VALOAVANESER);
    // Stub
  }

  private void PAN_VALOAVANESER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFOAVANINIZ)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAvanzoIniziale();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamenti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFRESATTAUM)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoResiduiAttiviAumento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFRESATTDIM)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoResiduiAttiviDiminuzione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFOIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFOFPV)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFPV();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFRESPASRID)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoResiduiPassiviRiduzione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFIMPREIRID)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegniReiscrittiRiduzione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALOAVANESER_INFOAVANFINA)
    {
      this.IdxPanelActived = this.PAN_VALOAVANESER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAvanzoFinale();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VALOAVANESER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VALOAVANESER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALOAVANESER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

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
    if (ColIndex.intValue() == PFL_PARAMETRI_SALVA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Salva();
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

  private void BUK_AVANESERLIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_AVANESERLIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_AVANESERLIBR_SEC_INTESTREPORT)
    {
      BUK_AVANESERLIBR.set_SpanValue(BUK_AVANESERLIBR_SPAN_TOSTRIPARESE, new IDVariant(IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))));
    }
    if (SectionID==BUK_AVANESERLIBR_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_AVANESERLIBR_SEC_DETTAGLIO)
    {
      BUK_AVANESERLIBR.set_SpanValue(BUK_AVANESERLIBR_SPAN_ESERCIZIO1, new IDVariant(IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0), (new IDVariant(1))))));
      BUK_AVANESERLIBR.set_SpanValue(BUK_AVANESERLIBR_SPAN_ESERCIZIO, new IDVariant(IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI697, IMDBDef4.FLD_PARAMETRI697_PARAMESERCIZ, 0))));
    }
    if (SectionID==BUK_AVANESERLIBR_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_AVANESERLIBR_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_AVANESERLIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_AVANESERLIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_AVANESERLIBR_MST_AVANESERMAST)
    {
    }
  }

  private void BUK_AVANESERLIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_AVANESERLIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_AVANESERLIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
    if (RepID == BUK_AVANESERLIBR_RPT_AVANESERREPO)
    {
      // Report's IMDB master query
      if (IMDB.TblModified(IMDBDef4.TBL_VALOAVANESER, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef4.TBL_PARAMETRI697, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVANZOESERCI_VALOAVANESE1();
      }
    }
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_AVANESERLIBR_OnPreview()
  {
    PreviewBook = BKW_AVANESERLIBR;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMEFILTRI_Init()
  {

    PAN_PARAMEFILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEFILTRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMEFILTRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, "9A979E7C-8D3B-434D-8BC5-BDDD7AA466A2");
    PAN_PARAMEFILTRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, "Filtri");
    PAN_PARAMEFILTRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, "");
    PAN_PARAMEFILTRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, MyGlb.PANEL_LIST, 0, -9999, 216, 10, 0, 0);
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, MyGlb.PANEL_FORM, 24, 14, 552, 62, 0, 0);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, 0, 25);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, 1, 13);
    PAN_PARAMEFILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, 0, 2);
    PAN_PARAMEFILTRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, 1, 2);
    PAN_PARAMEFILTRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEFILTRI_FILTRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEFILTRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMEFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, "D291E040-4F46-4700-B5F8-29D5F7AAF55E");
    PAN_PARAMEFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, "Fondo Accantonamento");
    PAN_PARAMEFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, "");
    PAN_PARAMEFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMEFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, "4ADFEA17-D0EF-470F-A1DC-8ED6C07A0B08");
    PAN_PARAMEFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, "Tipo Avanzo");
    PAN_PARAMEFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, "");
    PAN_PARAMEFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMEFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, "D5A380A0-999F-447B-A9D7-2E4C419DC558");
    PAN_PARAMEFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, "");
    PAN_PARAMEFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMEFILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, 0, "print1.gif", false);
    PAN_PARAMEFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMEFILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_LIST, 0, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_LIST, 144);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_FORM, 28, 28, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_FORM, 144);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_FONDOACCANTO, MyGlb.PANEL_FORM, "Fondo Accantonamento");
    PAN_PARAMEFILTRI.SetFieldPage(PFL_PARAMEFILTRI_FONDOACCANTO, -1, GRP_PARAMEFILTRI_FILTRI);
    PAN_PARAMEFILTRI.SetFieldPanel(PFL_PARAMEFILTRI_FONDOACCANTO, PPQRY_PARAMETRI693, "A.PARAFONDACCA", "PARAFONDACCA", 5, 50, 0, -13997);
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_LIST, "T. Avn.");
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_FORM, 92, 52, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_PARAMEFILTRI.SetFieldPage(PFL_PARAMEFILTRI_TIPOAVANZO, -1, GRP_PARAMEFILTRI_FILTRI);
    PAN_PARAMEFILTRI.SetFieldPanel(PFL_PARAMEFILTRI_TIPOAVANZO, PPQRY_PARAMETRI693, "A.PARATIPOAVAN", "PARATIPOAVAN", 3, 10, 0, -13997);
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_FORM, 588, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEFILTRI_STAMAVANESER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEFILTRI.SetFieldPage(PFL_PARAMEFILTRI_STAMAVANESER, -1, -1);
    PAN_PARAMEFILTRI.SetFieldPanel(PFL_PARAMEFILTRI_STAMAVANESER, -1, "", "STAMAVANESER", 0, 0, 0, -13997);
    PAN_PARAMEFILTRI.set_ImageResizeMode(PFL_PARAMEFILTRI_STAMAVANESER, 3);
  }

  private void PAN_PARAMEFILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEFILTRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.CODICE = ~~PARAFONDACCA~~) ");
    SQL.append("and   (A.TIPO = 'VINCA2') ");
    SQL.append("and   ((~~PQRY_PARAMETRI471.PARAMESERCIZ~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  100, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where ('-1' = ~~PARAFONDACCA~~) ");
    SQL.append("order by 2 ");
    PAN_PARAMEFILTRI.SetQuery(PPQRY_ATTRIBUTICFA, 0, SQL, PFL_PARAMEFILTRI_FONDOACCANTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRICFACODI, ");
    SQL.append("  A.SEQUENZA as ATTRICFASEQU, ");
    SQL.append("  A.DESCRIZIONE as ATTRICFADESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_CFA A ");
    SQL.append("where (A.TIPO = 'VINCA2') ");
    SQL.append("and   ((~~PQRY_PARAMETRI471.PARAMESERCIZ~~ BETWEEN NVL(A.ESERCIZIO_DA, 1900) AND NVL(A.ESERCIZIO_A, 2999))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  100, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMEFILTRI.SetQuery(PPQRY_ATTRIBUTICFA, 1, SQL, PFL_PARAMEFILTRI_FONDOACCANTO, "");
    PAN_PARAMEFILTRI.SetQueryDB(PPQRY_ATTRIBUTICFA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~PARATIPOAVAN~~) ");
    SQL.append("and   ((NVL(~~PARAFONDACCA~~, '-1') = '-1') OR (A.COD_AVANZO_VINCA2 = ~~PARAFONDACCA~~)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (-1 = ~~PARATIPOAVAN~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMEFILTRI.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_PARAMEFILTRI_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where ((NVL(~~PARAFONDACCA~~, '-1') = '-1') OR (A.COD_AVANZO_VINCA2 = ~~PARAFONDACCA~~)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMEFILTRI.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_PARAMEFILTRI_TIPOAVANZO, "");
    PAN_PARAMEFILTRI.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEFILTRI.SetIMDB(IMDB, "PQRY_PARAMETRI693", true);
    PAN_PARAMEFILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMEFILTRI.SetQueryIMDB(PPQRY_PARAMETRI693, IMDBDef13.PQRY_PARAMETRI693_RS, IMDBDef4.TBL_PARAMETRI697);
    JustLoaded = true;
    PAN_PARAMEFILTRI.SetFieldPrimaryIndex(PFL_PARAMEFILTRI_FONDOACCANTO, IMDBDef4.FLD_PARAMETRI697_PARAFONDACCA);
    PAN_PARAMEFILTRI.SetFieldPrimaryIndex(PFL_PARAMEFILTRI_TIPOAVANZO, IMDBDef4.FLD_PARAMETRI697_PARATIPOAVAN);
    PAN_PARAMEFILTRI.SetMasterTable(0, "PARAMETRI697");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEFILTRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEFILTRI.iUseListQBE;
      PAN_PARAMEFILTRI.iUseListQBE = 0;
      PAN_PARAMEFILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEFILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEFILTRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VALOAVANESER_Init()
  {

    PAN_VALOAVANESER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALOAVANESER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VALOAVANESER.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, "7016AD54-2FD2-46D6-A9A5-20E9B285734A");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, "Avanzo al 31/12/esercizio-1");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, "8D683C9A-A3E0-4BF8-8693-9DD4444EDF13");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, "AD886478-7B4C-4200-9F9B-688587F79EC6");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, "+ ACCERTAMENTI di competenza dell'esercizio");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, "C1B17756-E48A-445D-9C90-1F5218BBF4F1");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, "639FE2FC-AAF0-498A-9616-30FBB99D7AA5");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, "+ Aumento dei Residui Attivi");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, "07FD6578-6250-4068-AA61-F9BB1FAF9680");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, "351DC574-6263-489D-875C-A58DD020164D");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, "- Diminuzione dei Residui Attivi");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, "C7AC473A-5269-41F8-A018-89E89551EA04");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, "A393AC92-2850-4AB8-B2A8-A28B05A31E40");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, "- IMPEGNI di competenza dell'esercizio");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, "7AED4D9E-93FD-4378-B196-2372AD7FE84E");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, "1B156E53-CF27-49C7-BF64-6F856988B4DB");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, "- FPV di spesa");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, "20CB9199-6F37-4410-851E-2B50D3D8466D");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, "37C6327F-D887-4C98-BB06-C3BB550EF0F8");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, "+ Riduzione dei Residui Passivi");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, "0F8AEF45-AA37-450C-8521-D92CB6C551EE");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, "9A07FF6C-1532-4F63-A189-A3AD0186868A");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, "+ Riduzione degli impegni reiscritti");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, "70EF52D7-2302-4148-93B3-FFE17E5B39EE");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, "B4913C13-5FD7-48C1-A756-80BBF91DBD28");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, "= Avanzo Esercizio ");
    PAN_VALOAVANESER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.VIS_NOFICFIMHELE);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALOAVANESER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, "AF414FA9-4582-477A-87B5-C173DB6EB2A3");
    PAN_VALOAVANESER.set_Header(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, "");
    PAN_VALOAVANESER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VALOAVANESER.SetImage(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, 0, "info.gif", false);
    PAN_VALOAVANESER.SetFlags(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VALOAVANESER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_LIST, "Avn. al 31 12 eser. 1");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_FORM, 76, 12, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOINIZIA, MyGlb.PANEL_FORM, "Avanzo al 31/12/esercizio-1");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_AVANZOINIZIA, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_AVANZOINIZIA, PPQRY_PARAMETRI694, "A.VALOAVANINIZ", "VALOAVANINIZ", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_FORM, 532, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANINIZ, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFOAVANINIZ, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFOAVANINIZ, -1, "", "INFOAVANINIZ", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_LIST, 88);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_LIST, "ACC. di cmp. dll. esr.");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_FORM, 76, 36, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_ACCERTAMENTI, MyGlb.PANEL_FORM, "+ ACCERTAMENTI di competenza dell'esercizio");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_ACCERTAMENTI, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_ACCERTAMENTI, PPQRY_PARAMETRI694, "A.VALORIACCERT", "VALORIACCERT", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_LIST, 268, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_FORM, 532, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOACCERTAM, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFOACCERTAM, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFOACCERTAM, -1, "", "INFOACCERTAM", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_LIST, 140);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_LIST, "Aum. dei Res. Attivi");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_FORM, 76, 60, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIAUME, MyGlb.PANEL_FORM, "+ Aumento dei Residui Attivi");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_RESIATTIAUME, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_RESIATTIAUME, PPQRY_PARAMETRI694, "A.VALRESATTAUM", "VALRESATTAUM", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_LIST, 276, 80, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_FORM, 532, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTAUM, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFRESATTAUM, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFRESATTAUM, -1, "", "INFRESATTAUM", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_LIST, 156);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_LIST, "Dimin. dei Res. Attivi");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_FORM, 76, 84, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIATTIDIMI, MyGlb.PANEL_FORM, "- Diminuzione dei Residui Attivi");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_RESIATTIDIMI, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_RESIATTIDIMI, PPQRY_PARAMETRI694, "A.VALRESATTDIM", "VALRESATTDIM", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_LIST, 284, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_FORM, 532, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESATTDIM, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFRESATTDIM, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFRESATTDIM, -1, "", "INFRESATTDIM", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_LIST, 56);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_LIST, "IM. d. cm. d. es.");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_FORM, 76, 108, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEGNI, MyGlb.PANEL_FORM, "- IMPEGNI di competenza dell'esercizio");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_IMPEGNI, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_IMPEGNI, PPQRY_PARAMETRI694, "A.VALORIIMPEGN", "VALORIIMPEGN", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_LIST, 292, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_FORM, 532, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFOIMPEGNI, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFOIMPEGNI, -1, "", "INFOIMPEGNI", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_LIST, 28);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_LIST, "- FPV di spesa");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_FORM, 76, 132, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_FPV, MyGlb.PANEL_FORM, "- FPV di spesa");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_FPV, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_FPV, PPQRY_PARAMETRI694, "A.VALORIFPV", "VALORIFPV", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_LIST, 300, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_FORM, 532, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOFPV, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFOFPV, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFOFPV, -1, "", "INFOFPV", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_LIST, 152);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_LIST, "Riduz. dei Res. Pass.");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_FORM, 76, 156, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_RESIPASSRIDU, MyGlb.PANEL_FORM, "+ Riduzione dei Residui Passivi");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_RESIPASSRIDU, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_RESIPASSRIDU, PPQRY_PARAMETRI694, "A.VALRESPASRID", "VALRESPASRID", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_LIST, 308, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_FORM, 532, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFRESPASRID, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFRESPASRID, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFRESPASRID, -1, "", "INFRESPASRID", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_LIST, 168);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_LIST, "Rid. deg. imp. reisc.");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_FORM, 76, 180, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_IMPEREISRIDU, MyGlb.PANEL_FORM, "+ Riduzione degli impegni reiscritti");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_IMPEREISRIDU, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_IMPEREISRIDU, PPQRY_PARAMETRI694, "A.VALIMPREIRID", "VALIMPREIRID", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_LIST, 316, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_FORM, 532, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFIMPREIRID, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFIMPREIRID, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFIMPREIRID, -1, "", "INFIMPREIRID", 0, 0, 0, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_LIST, 88);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_LIST, "= Avanzo Esercizio ");
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_FORM, 76, 204, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_FORM, 296);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_AVANZOFINALE, MyGlb.PANEL_FORM, "= Avanzo Esercizio ");
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_AVANZOFINALE, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_AVANZOFINALE, PPQRY_PARAMETRI694, "A.VALOAVANFINA", "VALOAVANFINA", 3, 14, 2, -13997);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_LIST, 308, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_LIST, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_LIST, 1);
    PAN_VALOAVANESER.SetRect(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_FORM, 532, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALOAVANESER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_FORM, 0);
    PAN_VALOAVANESER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALOAVANESER_INFOAVANFINA, MyGlb.PANEL_FORM, 1);
    PAN_VALOAVANESER.SetFieldPage(PFL_VALOAVANESER_INFOAVANFINA, -1, -1);
    PAN_VALOAVANESER.SetFieldPanel(PFL_VALOAVANESER_INFOAVANFINA, -1, "", "INFOAVANFINA", 0, 0, 0, -13997);
  }

  private void PAN_VALOAVANESER_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALOAVANESER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VALOAVANESER.SetIMDB(IMDB, "PQRY_PARAMETRI694", true);
    PAN_VALOAVANESER.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_VALOAVANESER.SetQueryIMDB(PPQRY_PARAMETRI694, IMDBDef13.PQRY_PARAMETRI694_RS, IMDBDef4.TBL_VALOAVANESER);
    JustLoaded = true;
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_AVANZOINIZIA, IMDBDef4.FLD_VALOAVANESER_VALOAVANINIZ);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_ACCERTAMENTI, IMDBDef4.FLD_VALOAVANESER_VALORIACCERT);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_RESIATTIAUME, IMDBDef4.FLD_VALOAVANESER_VALRESATTAUM);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_RESIATTIDIMI, IMDBDef4.FLD_VALOAVANESER_VALRESATTDIM);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_IMPEGNI, IMDBDef4.FLD_VALOAVANESER_VALORIIMPEGN);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_FPV, IMDBDef4.FLD_VALOAVANESER_VALORIFPV);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_RESIPASSRIDU, IMDBDef4.FLD_VALOAVANESER_VALRESPASRID);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_IMPEREISRIDU, IMDBDef4.FLD_VALOAVANESER_VALIMPREIRID);
    PAN_VALOAVANESER.SetFieldPrimaryIndex(PFL_VALOAVANESER_AVANZOFINALE, IMDBDef4.FLD_VALOAVANESER_VALOAVANFINA);
    PAN_VALOAVANESER.SetMasterTable(0, "VALOAVANESER");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALOAVANESER.Status() == 2)
    {
      int oldListQBE = PAN_VALOAVANESER.iUseListQBE;
      PAN_VALOAVANESER.iUseListQBE = 0;
      PAN_VALOAVANESER.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALOAVANESER.PanelCommand(Glb.PCM_FIND);
      PAN_VALOAVANESER.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, "2C3C5E3E-2DAD-4FCC-B45D-B8343DF23B3B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, "Note Versione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, "0A76FED8-632C-436A-85AD-D3EA278B1C08");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, "Salva");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_LIST, 4, 188, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_LIST, "Note Versione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_FORM, 20, 22, 488, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTEVERSIONE, MyGlb.PANEL_FORM, "Note Versione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NOTEVERSIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NOTEVERSIONE, PPQRY_PARAMETRI695, "A.PARANOTEVERS", "PARANOTEVERS", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_LIST, 588, 120, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_FORM, 528, 18, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SALVA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SALVA, -1, "", "SALVA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI695", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI695, IMDBDef13.PQRY_PARAMETRI695_RS, IMDBDef4.TBL_PARAMETRI697);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NOTEVERSIONE, IMDBDef4.FLD_PARAMETRI697_PARANOTEVERS);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI697");
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

  private void BUK_AVANESERLIBR_MST_AVANESERMAST_Init()
  {
    BUK_AVANESERLIBR.InitMastro(BUK_AVANESERLIBR_MST_AVANESERMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_MST_AVANESERMAST, "7F00FCEE-924F-47C7-A06E-4C1A2DF04F74");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_MST_AVANESERMAST, "AVANESERMAST");
    BUK_AVANESERLIBR.InitMastroBox(BUK_AVANESERLIBR_MST_AVANESERMAST, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA, 1000, 1400, 19000, 26900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA, "B3A0CBFA-AE82-4E46-B976-2F96DF094A7C");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_AVANESERLIBR_RPT_AVANESERREPO_InitQuery() { BUK_AVANESERLIBR_RPT_AVANESERREPO_InitQuery(true, true); }
  private void BUK_AVANESERLIBR_RPT_AVANESERREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      BUK_AVANESERLIBR.SetReportQuery(BUK_AVANESERLIBR_RPT_AVANESERREPO, (IDConnection)null, IMDBDef13.PQRY_VALOAVANESE1_RS, "", "1619A38F-A4FC-4994-ACBD-A5F84E0C21BA");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVANESERLIBR_RPT_AVANESERREPO_Init()
  {
    BUK_AVANESERLIBR.InitReport(BUK_AVANESERLIBR_RPT_AVANESERREPO, 131073);
    BUK_AVANESERLIBR_RPT_AVANESERREPO_InitQuery(true, false);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPT_AVANESERREPO, "F97745BC-29A3-4C18-AAA2-F7D49F3F28F4");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPT_AVANESERREPO, "AVANESERREPO");
    BUK_AVANESERLIBR.InitSection(BUK_AVANESERLIBR_RPT_AVANESERREPO, BUK_AVANESERLIBR_SEC_INTESTREPORT, 1600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVANESERLIBR.SetSectionRendersInto(BUK_AVANESERLIBR_SEC_INTESTREPORT, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SEC_INTESTREPORT, "0104D703-C531-4017-A806-6A4589E2E618");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_INTESTREPORT, BUK_AVANESERLIBR_RPTBOX_TITOLO, 400, 400, 18300, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_TITOLO, "750796EC-FCDD-42D6-BE38-47B9E2C5A194");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_TITOLO, "TITOLO");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_TITOLO, BUK_AVANESERLIBR_SPAN_NUOVASPAN1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Gestione Avanzo ", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_NUOVASPAN1, "D5067E8B-0F52-498E-8090-24F24E05C97C");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_TITOLO, BUK_AVANESERLIBR_SPAN_TOSTRIPARESE, MyGlb.VIS_TITOLOREPORT, 5, 99, 0, 271384705, "", "", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_TOSTRIPARESE, "3B83630E-4E23-4777-B628-4B9636447B52");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_TOSTRIPARESE, "TOSTRIPARESE");
    BUK_AVANESERLIBR.InitSection(BUK_AVANESERLIBR_RPT_AVANESERREPO, BUK_AVANESERLIBR_SEC_INTESTPAGINA, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVANESERLIBR.SetSectionRendersInto(BUK_AVANESERLIBR_SEC_INTESTPAGINA, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SEC_INTESTPAGINA, "86F31556-8F0A-4E3C-9AD7-A4B3663E3625");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_AVANESERLIBR.InitSection(BUK_AVANESERLIBR_RPT_AVANESERREPO, BUK_AVANESERLIBR_SEC_DETTAGLIO, 10700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVANESERLIBR.SetSectionRendersInto(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SEC_DETTAGLIO, "CF04B9A6-6382-4FC1-85DD-C2F693A27F4B");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_FONDACCAHEAD, 2500, 700, 4300, 500, 0, 1, 1, MyGlb.VIS_NORMAA10GRAS, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_FONDACCAHEAD, "851D8CC5-6418-4D26-A4F9-D24CA94EDA64");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_FONDACCAHEAD, "FONDACCAHEAD");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_FONDACCAHEAD, BUK_AVANESERLIBR_SPAN_PARDESFONACC, MyGlb.VIS_NORMAA10GRAS, 0, 0, 0, 271384961, "", "Fondo Accantonamento", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_PARDESFONACC, "119C66C6-1BC0-4325-A333-0EC929E9E587");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_PARDESFONACC, "PARDESFONACC");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_FONDOACCANTO, 6900, 700, 11000, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_FONDOACCANTO, "1F8B6360-A1B8-416A-929F-F67672709588");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_FONDOACCANTO, "FONDOACCANTO");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_FONDOACCANTO, BUK_AVANESERLIBR_SPAN_REPADFAAEAEL, MyGlb.VIS_NORMALEA10, 5, 200, 0, 271384705, "", "::RECPARDEFOAC", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_REPADFAAEAEL, "E707EA75-2E44-4ABF-8E69-D40E07F0DE5D");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_REPADFAAEAEL, "REPADFAAEAEL");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_TIPOAVANHEAD, 2500, 1400, 4300, 500, 0, 1, 1, MyGlb.VIS_NORMAA10GRAS, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_TIPOAVANHEAD, "6EC1AC09-8797-4B06-8A9C-DE0D3CC300F4");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_TIPOAVANHEAD, "TIPOAVANHEAD");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_TIPOAVANHEAD, BUK_AVANESERLIBR_SPAN_PARDESTIPAVA, MyGlb.VIS_NORMAA10GRAS, 0, 0, 0, 271384961, "", "Tipo Avanzo", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_PARDESTIPAVA, "B9D8D9AE-42DE-4C8F-A2F9-ADB56456E4B2");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_PARDESTIPAVA, "PARDESTIPAVA");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_TIPOAVANZO, 6900, 1400, 11000, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_TIPOAVANZO, "30F69DFB-7633-4B0A-A850-FA60996FE868");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_TIPOAVANZO, "TIPOAVANZO");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_TIPOAVANZO, BUK_AVANESERLIBR_SPAN_REPADTAAEAEL, MyGlb.VIS_NORMALEA10, 5, 200, 0, 271384705, "", "::RECPARDETIAV", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_REPADTAAEAEL, "E2769384-D99B-4A58-BF85-5A351D19A912");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_REPADTAAEAEL, "REPADTAAEAEL");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD, 2500, 3300, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD, "FA48A5C1-7DEA-4455-B633-2B68309890E9");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD, "AVANINIZHEAD");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD, BUK_AVANESERLIBR_SPAN_VALOAVANINI1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "Avanzo al 31/12/", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALOAVANINI1, "10741FF8-D3BA-4AF7-938A-2ECE2BCE2AD3");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALOAVANINI1, "VALOAVANINI1");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANINIZHEAD, BUK_AVANESERLIBR_SPAN_ESERCIZIO1, MyGlb.VIS_NORMALEA10, 5, 99, 0, 271384705, "", "", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_ESERCIZIO1, "8E2AF3AD-1895-47F4-B25A-0421E35026AE");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_ESERCIZIO1, "ESERCIZIO1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_AVANZOINIZIA, 11100, 3300, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_AVANZOINIZIA, "7B43E81D-4FA4-4083-BCDB-1D84BA486A38");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_AVANZOINIZIA, "AVANZOINIZIA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANZOINIZIA, BUK_AVANESERLIBR_SPAN_VALOAVANINIZ, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALAVAINI", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALOAVANINIZ, "75B054E1-2679-4909-83D1-DACFB73F1B4A");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALOAVANINIZ, "VALOAVANINIZ");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_ACCERTHEADER, 2500, 4000, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_ACCERTHEADER, "6B94CD36-7109-4854-B143-33BA99986019");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_ACCERTHEADER, BUK_AVANESERLIBR_SPAN_VALORIACCER1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "+ ACCERTAMENTI di competenza dell'esercizio", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIACCER1, "AFB09F57-6C5E-46FE-8061-6451097652FE");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIACCER1, "VALORIACCER1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_ACCERTAMENTI, 11100, 4000, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_ACCERTAMENTI, "6E294E42-1845-47DF-B363-AE817DA45677");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_ACCERTAMENTI, "ACCERTAMENTI");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_ACCERTAMENTI, BUK_AVANESERLIBR_SPAN_VALORIACCERT, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECOVALOACCE", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIACCERT, "9C50D866-4362-4730-A711-C3F18B9FEB3F");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIACCERT, "VALORIACCERT");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESATTAUMHEA, 2500, 4600, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESATTAUMHEA, "30A8400F-61B8-432B-83EC-C008E6AC990C");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESATTAUMHEA, "RESATTAUMHEA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESATTAUMHEA, BUK_AVANESERLIBR_SPAN_VALRESATTAU1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "+ Aumento dei Residui Attivi", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESATTAU1, "EB528B09-2D41-4CBA-A923-EADF16CFB9C9");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESATTAU1, "VALRESATTAU1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESIATTIAUME, 11100, 4600, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESIATTIAUME, "1A5F55B9-C880-4549-8CD5-584DC5F02A56");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESIATTIAUME, "RESIATTIAUME");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESIATTIAUME, BUK_AVANESERLIBR_SPAN_VALRESATTAUM, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALREATAU", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESATTAUM, "2BD10D64-E2D5-4D1A-8F3C-775E91AF2DBA");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESATTAUM, "VALRESATTAUM");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESATTDIMHEA, 2500, 5200, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESATTDIMHEA, "115D0278-E1BA-40B2-B886-D309EE1A1C73");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESATTDIMHEA, "RESATTDIMHEA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESATTDIMHEA, BUK_AVANESERLIBR_SPAN_VALRESATTDI1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "- Diminuzione dei Residui Attivi", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESATTDI1, "CEFC6CB2-D09A-4733-A569-C9C2A07C8109");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESATTDI1, "VALRESATTDI1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESIATTIDIMI, 11100, 5200, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESIATTIDIMI, "ED8F5DA2-D3AB-4DD0-A440-BCAF55604539");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESIATTIDIMI, "RESIATTIDIMI");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESIATTIDIMI, BUK_AVANESERLIBR_SPAN_VALRESATTDIM, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALREATDI", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESATTDIM, "AEA8E16C-EDC8-46FE-BD90-3E649CD4D047");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESATTDIM, "VALRESATTDIM");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_IMPEGNHEADER, 2500, 6000, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_IMPEGNHEADER, "F5A0DC27-0446-4440-B670-9169DC7DD0CE");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_IMPEGNHEADER, BUK_AVANESERLIBR_SPAN_VALORIIMPEG1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "- IMPEGNI di competenza dell'esercizio", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIIMPEG1, "7915C266-C0CF-4013-AC1F-C91AEE92941A");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIIMPEG1, "VALORIIMPEG1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_IMPEGNI, 11100, 6000, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_IMPEGNI, "2E86EAA2-99B4-4B71-9A3F-B2CA16227BD5");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_IMPEGNI, "IMPEGNI");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_IMPEGNI, BUK_AVANESERLIBR_SPAN_VALORIIMPEGN, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECOVALOIMPE", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIIMPEGN, "48A3FC6B-2283-4572-A5A9-8DA7E33ACF33");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIIMPEGN, "VALORIIMPEGN");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_FPVHEADER, 2500, 6700, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_FPVHEADER, "E7586686-AE03-4EA7-9937-0ECBFF2DF358");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_FPVHEADER, "FPVHEADER");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_FPVHEADER, BUK_AVANESERLIBR_SPAN_VALORIFPV1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "- FPV di spesa", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIFPV1, "3039D2A6-FBB6-4B5A-ACC6-96EBDBD972EA");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIFPV1, "VALORIFPV1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_FPV, 11100, 6700, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_FPV, "ADC46EC8-1AD3-49D7-8110-205797DAF0EC");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_FPV, "FPV");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_FPV, BUK_AVANESERLIBR_SPAN_VALORIFPV, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECORVALOFPV", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALORIFPV, "9C8D3EF4-C56F-4118-8497-8CA701295021");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALORIFPV, "VALORIFPV");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESPASRIDHEA, 2500, 7400, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESPASRIDHEA, "3F8B9DD9-20B9-44D6-BE71-21E81A62C691");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESPASRIDHEA, "RESPASRIDHEA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESPASRIDHEA, BUK_AVANESERLIBR_SPAN_VALRESPASRI1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "+ Riduzione dei Residui Passivi", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESPASRI1, "4F4DCBCD-17EB-4F5D-81B5-6A38F46B64DD");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESPASRI1, "VALRESPASRI1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_RESIPASSRIDU, 11100, 7400, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_RESIPASSRIDU, "57F7CC6E-8EC5-48B2-BA09-97545FA0621A");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_RESIPASSRIDU, "RESIPASSRIDU");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_RESIPASSRIDU, BUK_AVANESERLIBR_SPAN_VALRESPASRID, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALREPARI", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALRESPASRID, "D9B48D49-4A6D-4BF4-A6B8-0C96244F878D");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALRESPASRID, "VALRESPASRID");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_IMPREIRIDHEA, 2500, 8200, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_IMPREIRIDHEA, "C5141B30-7E84-477E-8679-B5FD0896244B");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_IMPREIRIDHEA, "IMPREIRIDHEA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_IMPREIRIDHEA, BUK_AVANESERLIBR_SPAN_VALIMPREIRI1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "+ Riduzione degli impegni reiscritti", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALIMPREIRI1, "286FB90B-687C-4336-9E65-2C1205364B24");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALIMPREIRI1, "VALIMPREIRI1");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_IMPEREISRIDU, 11100, 8200, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_IMPEREISRIDU, "AB048787-C816-4DEC-A599-A7D33A15CCB3");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_IMPEREISRIDU, "IMPEREISRIDU");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_IMPEREISRIDU, BUK_AVANESERLIBR_SPAN_VALIMPREIRID, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALIMRERI", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALIMPREIRID, "9F64BC10-B678-4B74-A977-CEC59BA4838D");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALIMPREIRID, "VALIMPREIRID");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_LINEA, 2500, 8800, 12400, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERI1, 983041, 375, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_LINEA, "188EE54B-0497-4393-8432-2DCAE320B7BB");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_LINEA, "LINEA");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_LINEA, BUK_AVANESERLIBR_SPAN_NUOVASPAN, MyGlb.VIS_BORDOINFERI1, 0, 0, 0, 271384705, "", "linea", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_NUOVASPAN, "3592869A-B207-47E1-A547-785CEEC4A0DA");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD, 2500, 9100, 8500, 500, 0, 1, 1, MyGlb.VIS_NORMALEA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD, "6AC09AE5-4886-4B7A-AA7A-586713CD80F4");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD, "AVANFINAHEAD");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD, BUK_AVANESERLIBR_SPAN_VALOAVANFIN1, MyGlb.VIS_NORMALEA10, 0, 0, 0, 271384961, "", "= Avanzo Esercizio ", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALOAVANFIN1, "DD3F915E-F23F-47E1-BD76-7C7DC7D99D32");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALOAVANFIN1, "VALOAVANFIN1");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANFINAHEAD, BUK_AVANESERLIBR_SPAN_ESERCIZIO, MyGlb.VIS_NORMALEA10, 5, 99, 0, 271384705, "", "", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_ESERCIZIO, "E703904F-D77E-4638-92AA-FE2027D52B55");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_ESERCIZIO, "ESERCIZIO");
    BUK_AVANESERLIBR.InitReportBox(BUK_AVANESERLIBR_SEC_DETTAGLIO, BUK_AVANESERLIBR_RPTBOX_AVANZOFINALE, 11100, 9100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA10, 983041, 393, "", 1, -33);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_RPTBOX_AVANZOFINALE, "A81D0229-50F8-4DB9-9DB7-CA755741CCD7");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_RPTBOX_AVANZOFINALE, "AVANZOFINALE");
    BUK_AVANESERLIBR.InitBoxSpan(BUK_AVANESERLIBR_RPTBOX_AVANZOFINALE, BUK_AVANESERLIBR_SPAN_VALOAVANFINA, MyGlb.VIS_IMPORTOA10, 3, 14, 6, 271384705, "", "::RECVALAVAFIN", 1);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SPAN_VALOAVANFINA, "3D2A66FE-267B-469B-A0F7-CC15B26361FB");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SPAN_VALOAVANFINA, "VALOAVANFINA");
    BUK_AVANESERLIBR.InitSection(BUK_AVANESERLIBR_RPT_AVANESERREPO, BUK_AVANESERLIBR_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVANESERLIBR.SetSectionRendersInto(BUK_AVANESERLIBR_SEC_PIEDEPAGINA, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SEC_PIEDEPAGINA, "9D338D80-A465-4F2E-9629-BB42B85C883D");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_AVANESERLIBR.InitSection(BUK_AVANESERLIBR_RPT_AVANESERREPO, BUK_AVANESERLIBR_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVANESERLIBR.SetSectionRendersInto(BUK_AVANESERLIBR_SEC_PIEDEREPORT, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
    BUK_AVANESERLIBR.SetRTCGuid(BUK_AVANESERLIBR_SEC_PIEDEREPORT, "0E81C556-A99F-45E8-A2D7-CBD0B96F2524");
    BUK_AVANESERLIBR.SetObjCode(BUK_AVANESERLIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_AVANESERLIBR_RPT_AVANESERREPO_InitQuery(false, true);
  }

  private void BUK_AVANESERLIBR_InitLinks()
  {
    BUK_AVANESERLIBR.SetBoxNextBox(BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA, BUK_AVANESERLIBR_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMEFILTRI) PAN_PARAMEFILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VALOAVANESER) PAN_VALOAVANESER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEFILTRI) PAN_PARAMEFILTRI_ValidateRow(Cancel);
    if (SrcObj == PAN_VALOAVANESER) PAN_VALOAVANESER_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMEFILTRI) PAN_PARAMEFILTRI_DynamicProperties();
    if (SrcObj == PAN_VALOAVANESER) PAN_VALOAVANESER_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEFILTRI) PAN_PARAMEFILTRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VALOAVANESER) PAN_VALOAVANESER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMEFILTRI) PAN_PARAMEFILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VALOAVANESER) PAN_VALOAVANESER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_AVANESERLIBR) BUK_AVANESERLIBR_OnPreview();
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
