// **********************************************
// Ritenute Inail
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RitenuteInail extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;
  private static int GRP_PARAMETRI_MANDATI = 1;

  private static int PFL_PARAMETRI_ELABORA = 0;
  private static int PFL_PARAMETRI_DA1 = 1;
  private static int PFL_PARAMETRI_A1 = 2;
  private static int PFL_PARAMETRI_NEWPANELLAB1 = 3;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 4;
  private static int PFL_PARAMETRI_DAL = 5;
  private static int PFL_PARAMETRI_AL = 6;
  private static int PFL_PARAMETRI_NEWPANELLABE = 7;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 8;
  private static int PFL_PARAMETRI_CODICE = 9;
  private static int PFL_PARAMETRI_UFFICIO = 10;
  private static int PFL_PARAMETRI_DATAELABORAZ = 11;

  private static int PPQRY_PARAMETRI163 = 0;

  private static int PPQRY_T87 = 1;
  private static int PPQRY_T53 = 2;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_RITEINAILIBR;
  OBook BKW_RITEINAILIBR;
  //
  // Template Pages constants
  private static int BUK_RITEINAILIBR_MST_RITEINAIMAST = 1;
  private static int BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_RITEINAILIBR_SPAN_UTPTTPCRIPTC = 3;
  private static int BUK_RITEINAILIBR_RPTBOX_SOTTTESTPAGI = 4;
  private static int BUK_RITEINAILIBR_SPAN_IEPDRIPPARIP = 5;
  private static int BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA = 6;
  private static int BUK_RITEINAILIBR_RPTBOX_DATAELABORAZ = 7;
  private static int BUK_RITEINAILIBR_SPAN_DATAELABORAZ = 8;
  private static int BUK_RITEINAILIBR_RPTBOX_NUMEROPAGINA = 9;
  private static int BUK_RITEINAILIBR_SPAN_CPTSRILRIPND = 10;

  //
  // Reports constants
  private static int BUK_RITEINAILIBR_RPT_RITEINAIREPO = 11;
  private static int BUK_RITEINAILIBR_SEC_INTESTREPORT = 12;
  private static int BUK_RITEINAILIBR_SEC_INTESTPAGINA = 13;
  private static int BUK_RITEINAILIBR_RPTBOX_BRSEEEEEEEEE = 14;
  private static int BUK_RITEINAILIBR_SPAN_C = 15;
  private static int BUK_RITEINAILIBR_RPTBOX_BENCODFISHEA = 16;
  private static int BUK_RITEINAILIBR_SPAN_CODICEFISCAL = 17;
  private static int BUK_RITEINAILIBR_RPTBOX_MANDATHEADER = 18;
  private static int BUK_RITEINAILIBR_SPAN_MANDATO = 19;
  private static int BUK_RITEINAILIBR_RPTBOX_NUMEMANDHEAD = 20;
  private static int BUK_RITEINAILIBR_SPAN_NRO = 21;
  private static int BUK_RITEINAILIBR_RPTBOX_MANDDATMANHE = 22;
  private static int BUK_RITEINAILIBR_SPAN_DATA = 23;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPEGNHEADER = 24;
  private static int BUK_RITEINAILIBR_SPAN_IMPEGNO1 = 25;
  private static int BUK_RITEINAILIBR_RPTBOX_SUBIMPEGHEAD = 26;
  private static int BUK_RITEINAILIBR_SPAN_SUBIMPEGNO1 = 27;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPORTHEADER = 28;
  private static int BUK_RITEINAILIBR_SPAN_IMPORTO = 29;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPOINAIHEAD = 30;
  private static int BUK_RITEINAILIBR_SPAN_IMPONIBILE = 31;
  private static int BUK_RITEINAILIBR_RPTBOX_ALIQINAIHEAD = 32;
  private static int BUK_RITEINAILIBR_SPAN_ALIQ = 33;
  private static int BUK_RITEINAILIBR_RPTBOX_RITEINAIHEAD = 34;
  private static int BUK_RITEINAILIBR_SPAN_RITACARIPERC = 35;
  private static int BUK_RITEINAILIBR_RPTBOX_RITEINACEHEA = 36;
  private static int BUK_RITEINAILIBR_SPAN_RITACARIENTE = 37;
  private static int BUK_RITEINAILIBR_SEC_DETTAGLIO = 38;
  private static int BUK_RITEINAILIBR_RPTBOX_BERASOESESEE = 39;
  private static int BUK_RITEINAILIBR_SPAN_REBERSERIRIL = 40;
  private static int BUK_RITEINAILIBR_RPTBOX_BENCODICFISC = 41;
  private static int BUK_RITEINAILIBR_SPAN_BENCODICFISC = 42;
  private static int BUK_RITEINAILIBR_RPTBOX_NUMEROMAND = 43;
  private static int BUK_RITEINAILIBR_SPAN_LIQNUMERMAND = 44;
  private static int BUK_RITEINAILIBR_RPTBOX_MANDDATAMAND = 45;
  private static int BUK_RITEINAILIBR_SPAN_MANDDATAMAND = 46;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPEGNO = 47;
  private static int BUK_RITEINAILIBR_SPAN_IMPEGNO = 48;
  private static int BUK_RITEINAILIBR_RPTBOX_SUBIMPEGNO = 49;
  private static int BUK_RITEINAILIBR_SPAN_SUBIMPEGNO = 50;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPORTO = 51;
  private static int BUK_RITEINAILIBR_SPAN_LIQIMPORTO = 52;
  private static int BUK_RITEINAILIBR_RPTBOX_IMPONIBINAIL = 53;
  private static int BUK_RITEINAILIBR_SPAN_LIQIMPONINAI = 54;
  private static int BUK_RITEINAILIBR_RPTBOX_ALIQUOTINAIL = 55;
  private static int BUK_RITEINAILIBR_SPAN_LIQALIQUINAI = 56;
  private static int BUK_RITEINAILIBR_RPTBOX_RITENUTINAIL = 57;
  private static int BUK_RITEINAILIBR_SPAN_LIQRITENINAI = 58;
  private static int BUK_RITEINAILIBR_RPTBOX_RITENINAILCE = 59;
  private static int BUK_RITEINAILIBR_SPAN_LIQRITEINACE = 60;
  private static int BUK_RITEINAILIBR_SEC_PIEDEPAGINA = 61;
  private static int BUK_RITEINAILIBR_SEC_PIEDEREPORT = 62;
  private static int BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMPO = 63;
  private static int BUK_RITEINAILIBR_SPAN_PIRSRLIRIRIL = 64;
  private static int BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMIN = 65;
  private static int BUK_RITEINAILIBR_SPAN_PRSRLIIRIRIL = 66;
  private static int BUK_RITEINAILIBR_RPTBOX_SUMOFLIQRIIN = 67;
  private static int BUK_RITEINAILIBR_SPAN_PRSRLRIRIRIL = 68;
  private static int BUK_RITEINAILIBR_RPTBOX_SUOFLIRIINCE = 69;
  private static int BUK_RITEINAILIBR_SPAN_PRSRLRICRIRI = 70;
  private static int BUK_RITEINAILIBR_RPTBOX_TOTALE = 71;
  private static int BUK_RITEINAILIBR_SPAN_TOTALE = 72;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI164(IMDB);
    //
    //
    Init_PQRY_PARAMETRI163(IMDB);
    Init_PQRY_PARAMETRI163_RS(IMDB);
    Init_PQRY_LIQ26(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI164(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI164, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI164, "TBL_PARAMETRI164");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMDTARITE, "PARAMDTARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMDTARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMSUBIMPE, "PARAMSUBIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMSUBIMPE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI164,IMDBDef5.FLD_PARAMETRI164_PARAMCODICE,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI164, 0);
  }

  private static void Init_PQRY_PARAMETRI163(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI163, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI163, "PQRY_PARAMETRI163");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARAMCODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163,IMDBDef15.PQSL_PARAMETRI163_PARADATAELAB,6,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI163, 0);
  }

  private static void Init_PQRY_PARAMETRI163_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI163_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI163_RS, "PQRY_PARAMETRI163_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMCODICE, "PARAMCODICE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARAMCODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI163_RS,IMDBDef15.PQSL_PARAMETRI163_PARADATAELAB,6,49,0);
  }

  private static void Init_PQRY_LIQ26(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ26, 19);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ26, "PQRY_LIQ26");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMMAN, "RECLIQNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECMANDDATMA, "RECMANDDATMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECMANDDATMA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORDIMPEGN,5,201,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORSUBIMPE, "RECORSUBIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORSUBIMPE,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORLIQIMPO, "RECORLIQIMPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECORLIQIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQIMPINA, "RECLIQIMPINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQIMPINA,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQALIINA, "RECLIQALIINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQALIINA,3,5,3);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQRITINA, "RECLIQRITINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQRITINA,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQRIINCE, "RECLIQRIINCE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQRIINCE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQANNIMP, "RECLIQANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMIMP, "RECLIQNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQANNSUB, "RECLIQANNSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMSUB, "RECLIQNUMSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECLIQNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECOANNOIMPE, "RECOANNOIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECOANNOIMPE,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECONUMEIMPE, "RECONUMEIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECONUMEIMPE,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECANNSUBIMP, "RECANNSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECANNSUBIMP,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECNUMSUBIMP, "RECNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ26,IMDBDef15.PQSL_LIQ26_RECNUMSUBIMP,1,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ26, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RitenuteInail(MyWebEntryPoint w, IMDBObj imdb)
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
  public RitenuteInail()
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
    FormIdx = MyGlb.FRM_RITENUTINAIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B6CC5426-FBDD-4B93-8027-DD3773A8E485";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 344;
    DesignHeight = 322;
    set_Caption(new IDVariant("Ritenute Inail"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 344;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 344-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2AA8136D-B073-4664-9FA9-E2BEFB2CD165");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1576, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_RITEINAILIBR = new OBook(this);
    BUK_RITEINAILIBR = new CIDREObj(BKW_RITEINAILIBR);
    BKW_RITEINAILIBR.iGuid = "524C10AA-9F22-4353-99C4-A33EB581B3F3";
    BKW_RITEINAILIBR.Code = "BUK_RITEINAILIBR";
    BKW_RITEINAILIBR.BookObj = BUK_RITEINAILIBR;
    BKW_RITEINAILIBR.InitDefMasks();
    BUK_RITEINAILIBR.InitBook(1, 1245441, "Ritenute Inail Libro", IMDB, MainFrm.VisualStyleList);
    BUK_RITEINAILIBR.InitHTML();
    BUK_RITEINAILIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RITEINAILIBR.Book.SetMainFrm(MainFrm);
    BUK_RITEINAILIBR.SetRTCGuid(0, "524C10AA-9F22-4353-99C4-A33EB581B3F3");
    BUK_RITEINAILIBR.SetObjCode(0, "RITEINAILIBR");
    BUK_RITEINAILIBR_MST_RITEINAIMAST_Init();
    BUK_RITEINAILIBR_RPT_RITEINAIREPO_Init();
    BUK_RITEINAILIBR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI164, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RITENUTINAIL_PARAMETRI163();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_RITEINAILIBR.UpdateBook();
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
    if (Code.equals("BUK_RITEINAILIBR")) return BUK_RITEINAILIBR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RitenuteInail);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RitenuteInail.class.getName() : (Glb.ClassWithPackage(RitenuteInail.class) ? RitenuteInail.class.getName().substring(RitenuteInail.class.getPackage().getName().length() + 1) : RitenuteInail.class.getName()));
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
      BUK_RITEINAILIBR.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_RITEINAILIBR.RefreshQuery();
      BUK_RITEINAILIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_RITEINAILIBR.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteInail", "Elabora", _e);
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
      v_NOMECAPTION = (new IDVariant("Ritenute Inail", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      LOADEVENT_PARADELEROWS();
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMFINE, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARADATAELAB, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMCODICE, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO, 0, (new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteInail", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMSUBIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMCODICE, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RITENUTINAIL_PARAMETRI163() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI163_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI164, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI164, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI163_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI163_RS, 0, IMDBDef5.TBL_PARAMETRI164, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 0, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 1, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMFINE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 2, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 3, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 4, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 5, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARAMCODICE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI163_RS, 6, 0, IMDBDef5.TBL_PARAMETRI164, IMDBDef5.FLD_PARAMETRI164_PARADATAELAB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI164, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI164, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI164, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI163_RS, 0);
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

  private void BUK_RITEINAILIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RITEINAILIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RITEINAILIBR_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_RITEINAILIBR_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_RITEINAILIBR_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_RITEINAILIBR_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_RITEINAILIBR_SEC_PIEDEREPORT)
    {
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_PIRSRLIRIRIL, new IDVariant(BUK_RITEINAILIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEINAILIBR_SEC_PIEDEREPORT,"RECORLIQIMPO")));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_PRSRLIIRIRIL, new IDVariant(BUK_RITEINAILIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEINAILIBR_SEC_PIEDEREPORT,"RECLIQIMPINA")));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_PRSRLRIRIRIL, new IDVariant(BUK_RITEINAILIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEINAILIBR_SEC_PIEDEREPORT,"RECLIQRITINA")));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_PRSRLRICRIRI, new IDVariant(BUK_RITEINAILIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEINAILIBR_SEC_PIEDEREPORT,"RECLIQRIINCE")));
    }
  }

  private void BUK_RITEINAILIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RITEINAILIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RITEINAILIBR_MST_RITEINAIMAST)
    {
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_UTPTTPCRIPTC, new IDVariant(IDL.Upper(IDL.Add(IDL.Add((new IDVariant(BUK_RITEINAILIBR.BoxToolTip(BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA))), (new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_CODICE)))), MainFrm.ESERCIZIO))));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_IEPDRIPPARIP, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARAMFINE, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_DATAELABORAZ, new IDVariant(IDL.Add(IDL.Add((new IDVariant("del")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI163, IMDBDef15.PQSL_PARAMETRI163_PARADATAELAB, 0)))));
      BUK_RITEINAILIBR.set_SpanValue(BUK_RITEINAILIBR_SPAN_CPTSRILRIPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RITEINAILIBR.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_RITEINAILIBR.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_RITEINAILIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RITEINAILIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RITEINAILIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RITEINAILIBR_OnPreview()
  {
    PreviewBook = BKW_RITEINAILIBR;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "AED3E8F9-8F78-4FF8-96B8-D8CAD42257E3");
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "4065AD0E-2E6D-4FFA-A05F-43E131751FE5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 16, 67, 288, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "33092A9C-8885-4193-A8FB-554A7113D08D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, "D95109EA-507C-478D-9332-5224FC4C75FA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, "4F47CEE2-DA92-4A5F-B7E9-94C331F3E22A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "6F76AFF6-694C-4302-B452-87B4D1B1E3B6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "9A41E29B-3342-45FD-A2C1-3C01BD2BC1F1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "A2494A42-997E-418F-AE82-11C6EF213E2C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "6A603C9F-0AB2-4974-A22B-ED4737A58CAC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "7A701DBC-1501-4A05-B6DB-254D62E25F4A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "AA8AAD5D-0260-4038-B42E-41B34A2CBFC2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "5D18825A-E99C-4A93-946B-86AD7879F3A1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "Codice");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "211DB12F-F352-41DF-8261-14EF32041728");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "52B1F5B8-569F-461B-A241-682B2CB39191");
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 224, 224, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_FORM, 40, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA1, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA1, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA1, PPQRY_PARAMETRI163, "A.PARAMINIZIO", "PARAMINIZIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA1, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_FORM, 168, 28, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A1, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A1, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A1, PPQRY_PARAMETRI163, "A.PARAMFINE", "PARAMFINE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A1, (new IDVariant(12)), "Dicembre", "", "", -1);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 36, 92, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI163, "A.PARAMDAL", "PARAMDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 168, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI163, "A.PARAMAL", "PARAMAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 84, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 108, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 288, 96, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_LIST, "Cod.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 16, 128, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICE, PPQRY_PARAMETRI163, "A.PARAMCODICE", "PARAMCODICE", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 12, 152, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI163, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 60, 176, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI163, "A.PARADATAELAB", "PARADATAELAB", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T87CODICE, ");
    SQL.append("  A.DESCRIZIONE as T87DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T87 A ");
    SQL.append("where (A.CODICE = ~~PARAMCODICE~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMCODICE~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T87, 0, SQL, PFL_PARAMETRI_CODICE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T87CODICE, ");
    SQL.append("  A.DESCRIZIONE as T87DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T87 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T87, 1, SQL, PFL_PARAMETRI_CODICE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T87, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ALL ");
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
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI163", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI163, IMDBDef15.PQRY_PARAMETRI163_RS, IMDBDef5.TBL_PARAMETRI164);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA1, IMDBDef5.FLD_PARAMETRI164_PARAMINIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A1, IMDBDef5.FLD_PARAMETRI164_PARAMFINE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI164_PARAMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI164_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICE, IMDBDef5.FLD_PARAMETRI164_PARAMCODICE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI164_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI164_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI164");
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

  private void BUK_RITEINAILIBR_MST_RITEINAIMAST_Init()
  {
    BUK_RITEINAILIBR.InitMastro(BUK_RITEINAILIBR_MST_RITEINAIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_MST_RITEINAIMAST, "3A392781-5566-4B3C-A4A6-1274C8E36740");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_MST_RITEINAIMAST, "RITEINAIMAST");
    BUK_RITEINAILIBR.InitMastroBox(BUK_RITEINAILIBR_MST_RITEINAIMAST, BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Elenco Ritenute Inail", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA, "1674D962-FE14-4A6A-86BB-7D41CF6B4E49");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_TESTATPAGINA, BUK_RITEINAILIBR_SPAN_UTPTTPCRIPTC, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_UTPTTPCRIPTC, "CF79434F-DD06-4E8F-9D82-B80F3FA98F12");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_UTPTTPCRIPTC, "UTPTTPCRIPTC");
    BUK_RITEINAILIBR.InitMastroBox(BUK_RITEINAILIBR_MST_RITEINAIMAST, BUK_RITEINAILIBR_RPTBOX_SOTTTESTPAGI, 1000, 2100, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SOTTTESTPAGI, "6BE1EEA8-3F4B-445E-9FC4-CED2406AFD00");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SOTTTESTPAGI, BUK_RITEINAILIBR_SPAN_IEPDRIPPARIP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_IEPDRIPPARIP, "7EECA84D-5A3C-4EB8-AAFD-7613950EE8D0");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_IEPDRIPPARIP, "IEPDRIPPARIP");
    BUK_RITEINAILIBR.InitMastroBox(BUK_RITEINAILIBR_MST_RITEINAIMAST, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA, 1000, 3500, 27700, 16000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA, "913E1494-25F1-4D6D-9450-D7F06C7F52D7");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_RITEINAILIBR.InitMastroBox(BUK_RITEINAILIBR_MST_RITEINAIMAST, BUK_RITEINAILIBR_RPTBOX_DATAELABORAZ, 22100, 200, 3800, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_DATAELABORAZ, "74841810-47D0-4D11-B5CF-4144214EA2D7");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_DATAELABORAZ, BUK_RITEINAILIBR_SPAN_DATAELABORAZ, MyGlb.VIS_NORMAA8RIGHT, 5, 103, 0, 271319169, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_DATAELABORAZ, "9A1FAE02-B7DB-4F73-98EC-61DAD2A4103A");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEINAILIBR.InitMastroBox(BUK_RITEINAILIBR_MST_RITEINAIMAST, BUK_RITEINAILIBR_RPTBOX_NUMEROPAGINA, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_NUMEROPAGINA, "9E536061-6A81-4B25-9325-620754DD8ACC");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_NUMEROPAGINA, BUK_RITEINAILIBR_SPAN_CPTSRILRIPND, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_CPTSRILRIPND, "3488C07D-E466-4F07-99B0-ECEF73D57038");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_CPTSRILRIPND, "CPTSRILRIPND");
  }

  private void BUK_RITEINAILIBR_RPT_RITEINAIREPO_InitQuery() { BUK_RITEINAILIBR_RPT_RITEINAIREPO_InitQuery(true, true); }
  private void BUK_RITEINAILIBR_RPT_RITEINAIREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  A.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  B.NUMERO_MAND as RECLIQNUMMAN, ");
      SQL.append("  C.D_DATA_MAND as RECMANDDATMA, ");
      SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ) as RECORDIMPEGN, ");
      SQL.append("  DECODE(B.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( B.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( B.ANNO_SUBIMP )) as RECORSUBIMPE, ");
      SQL.append("  B.IMPORTO as RECORLIQIMPO, ");
      SQL.append("  B.IMPONIBILE_INAIL as RECLIQIMPINA, ");
      SQL.append("  B.ALIQUOTA_INAIL as RECLIQALIINA, ");
      SQL.append("  B.RITENUTE_INAIL as RECLIQRITINA, ");
      SQL.append("  B.RITENUTE_INAIL_CE as RECLIQRIINCE, ");
      SQL.append("  B.ANNO_IMP as RECLIQANNIMP, ");
      SQL.append("  B.NUMERO_IMP as RECLIQNUMIMP, ");
      SQL.append("  B.ANNO_SUBIMP as RECLIQANNSUB, ");
      SQL.append("  B.NUMERO_SUBIMP as RECLIQNUMSUB, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, B.ANNO_IMP, to_number(NULL)) as RECOANNOIMPE, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, B.NUMERO_IMP, to_number(NULL)) as RECONUMEIMPE, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, B.ANNO_SUBIMP, to_number(NULL)) as RECANNSUBIMP, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, B.NUMERO_SUBIMP, to_number(NULL)) as RECNUMSUBIMP ");
      SQL.append("from ");
      SQL.append("  BEN A, ");
      SQL.append("  LIQ B, ");
      SQL.append("  MAN C ");
      SQL.append("where (B.BENEFICIARIO = A.CODICE(+)) ");
      SQL.append("and   (B.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append("and   (((C.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI163.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI163.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy'))) AND (B.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI163.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI163.PARAMAL~~, 99999)) AND (NVL(B.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI163.PARAMUFFICIO~~, -1, NVL(B.UFFICIO, -1), ~~PQRY_PARAMETRI163.PARAMUFFICIO~~)) AND (NVL(B.CODICE_INAIL, 0) = DECODE(~~PQRY_PARAMETRI163.PARAMCODICE~~, -1, NVL(B.CODICE_INAIL, 0), ~~PQRY_PARAMETRI163.PARAMCODICE~~)) AND NOT ((B.CODICE_INAIL IS NULL)) AND " + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M' AND (C.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(D.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN D ");
      SQL.append("where (D.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append(")))) ");
      SQL.append("and   (C.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("UNION ");
      SQL.append("select distinct ");
      SQL.append("  F.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  F.CODICE_FISCALE, ");
      SQL.append("  H.NUMERO_MAND, ");
      SQL.append("  G.D_DATA_MAND, ");
      SQL.append("  TO_CHAR ( H.NUMERO_IMP ) || ' / ' || TO_CHAR ( H.ANNO_IMP ), ");
      SQL.append("  DECODE(H.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( H.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( H.ANNO_SUBIMP )), ");
      SQL.append("  H.IMPORTO, ");
      SQL.append("  H.IMPONIBILE_INAIL, ");
      SQL.append("  H.ALIQUOTA_INAIL, ");
      SQL.append("  H.RITENUTE_INAIL, ");
      SQL.append("  H.RITENUTE_INAIL_CE, ");
      SQL.append("  H.ANNO_IMP, ");
      SQL.append("  H.NUMERO_IMP, ");
      SQL.append("  H.ANNO_SUBIMP, ");
      SQL.append("  H.NUMERO_SUBIMP, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, H.ANNO_IMP, to_number(NULL)), ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, H.NUMERO_IMP, to_number(NULL)), ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, H.ANNO_SUBIMP, to_number(NULL)), ");
      SQL.append("  DECODE(~~TBL_PARAMETRI164.PARAMSUBIMPE~~, 1, H.NUMERO_SUBIMP, to_number(NULL)) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI E, ");
      SQL.append("  BEN F, ");
      SQL.append("  MAN G, ");
      SQL.append("  LIQ H ");
      SQL.append("where (H.BENEFICIARIO = F.CODICE(+)) ");
      SQL.append("and   (H.ANNO_LIQ = E.ANNO_LIQ) ");
      SQL.append("and   (H.NUMERO_LIQ = E.NUMERO_LIQ) ");
      SQL.append("and   (H.ANNO_MAND = E.ANNO_MAND) ");
      SQL.append("and   (H.NUMERO_MAND = E.NUMERO_MAND) ");
      SQL.append("and   (H.ANNO_MAND = G.ANNO_MAND) ");
      SQL.append("and   (H.NUMERO_MAND = G.NUMERO_MAND) ");
      SQL.append("and   ((H.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI163.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI163.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(H.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI163.PARAMUFFICIO~~, -1, NVL(H.UFFICIO, -1), ~~PQRY_PARAMETRI163.PARAMUFFICIO~~)) ");
      SQL.append("and   (H.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NVL(H.CODICE_INAIL, 0) = DECODE(~~PQRY_PARAMETRI163.PARAMCODICE~~, -1, NVL(H.CODICE_INAIL, 0), ~~PQRY_PARAMETRI163.PARAMCODICE~~)) ");
      SQL.append("and   (NOT ((H.CODICE_INAIL IS NULL))) ");
      SQL.append("and   ((E.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(E.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(E.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   ((E.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI163.PARAMINIZIO~~)||'/'||(E.ANNO_MAND),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI163.PARAMFINE~~)||'/'||(E.ANNO_MAND),'dd/mm/yyyy')))) ");
      SQL.append("and   (E.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(I.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI I ");
      SQL.append("where ((I.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(E.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(E.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (I.ANNO_LIQ = E.ANNO_LIQ) ");
      SQL.append("and   (I.NUMERO_LIQ = E.NUMERO_LIQ) ");
      SQL.append("and   (I.ANNO_MAND = E.ANNO_MAND) ");
      SQL.append("and   (I.NUMERO_MAND = E.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("order by 4, 3 ");
      BUK_RITEINAILIBR.SetReportQuery(BUK_RITEINAILIBR_RPT_RITEINAIREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0BDD79E2-4FBB-4DC4-BF17-123DDE1B5B45");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RITEINAILIBR_RPT_RITEINAIREPO_Init()
  {
    BUK_RITEINAILIBR.InitReport(BUK_RITEINAILIBR_RPT_RITEINAIREPO, 196865);
    BUK_RITEINAILIBR_RPT_RITEINAIREPO_InitQuery(true, false);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPT_RITEINAIREPO, "176D4E75-B1AE-47A1-9650-7E2BABA05961");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPT_RITEINAIREPO, "RITEINAIREPO");
    BUK_RITEINAILIBR.InitSection(BUK_RITEINAILIBR_RPT_RITEINAIREPO, BUK_RITEINAILIBR_SEC_INTESTREPORT, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITEINAILIBR.SetSectionRendersInto(BUK_RITEINAILIBR_SEC_INTESTREPORT, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SEC_INTESTREPORT, "4A508BEB-5DA3-40F1-BBD3-89DFA6F893BE");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_RITEINAILIBR.InitSection(BUK_RITEINAILIBR_RPT_RITEINAIREPO, BUK_RITEINAILIBR_SEC_INTESTPAGINA, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEINAILIBR.SetSectionRendersInto(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SEC_INTESTPAGINA, "2552A97C-223C-40DC-9CAC-EE2CE58FBD6B");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_BRSEEEEEEEEE, 0, 0, 3800, 1200, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_BRSEEEEEEEEE, "5C38AF92-FDC0-4664-8588-9E239F7E2E44");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_BRSEEEEEEEEE, "BRSEEEEEEEEE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_BRSEEEEEEEEE, BUK_RITEINAILIBR_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_C, "9FD2B6CD-5A25-4F11-924E-91969FB86931");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_C, "C");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_BENCODFISHEA, 3900, 0, 3400, 1200, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_BENCODFISHEA, "3ED572DC-16CD-4F77-94B8-F0EDAD2588BF");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_BENCODFISHEA, "BENCODFISHEA");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_BENCODFISHEA, BUK_RITEINAILIBR_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_CODICEFISCAL, "1B87DBBF-47D5-4B2D-BF33-3BA11B9CFC84");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_MANDATHEADER, 7400, 0, 3000, 1200, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_MANDATHEADER, "EB8EBE3B-67DF-4863-8823-580FCBA2F2D6");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_MANDATHEADER, BUK_RITEINAILIBR_SPAN_MANDATO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_MANDATO, "21356F27-98EF-405B-BF7F-BE4A693988ED");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_MANDATO, "MANDATO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_NUMEMANDHEAD, 7400, 700, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_NUMEMANDHEAD, "FAC90EF3-9AF8-45FB-B7DC-6D840A39D8A6");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_NUMEMANDHEAD, BUK_RITEINAILIBR_SPAN_NRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_NRO, "7761B182-74BE-41D9-84A7-A90AB0C3BA89");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_NRO, "NRO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_MANDDATMANHE, 8400, 700, 2000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_MANDDATMANHE, "FEF780BE-0966-4726-A2A5-8C872DC44D22");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_MANDDATMANHE, "MANDDATMANHE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_MANDDATMANHE, BUK_RITEINAILIBR_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_DATA, "B56E7EEC-3BC7-45DF-BBE2-230DE9DEE33A");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_DATA, "DATA");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_IMPEGNHEADER, 10500, 0, 1900, 1200, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPEGNHEADER, "F99E9286-5EEE-4F8D-BF0E-F2D8FA7CE1E1");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPEGNHEADER, BUK_RITEINAILIBR_SPAN_IMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_IMPEGNO1, "F0045050-D557-4012-848A-D04F7E338D5A");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_SUBIMPEGHEAD, 12500, 0, 2600, 1200, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGHEAD, "AD03615F-65D7-48B6-B2B8-64AF4F0C5894");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGHEAD, BUK_RITEINAILIBR_SPAN_SUBIMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_SUBIMPEGNO1, "EE12700D-8C64-459A-B471-C513F533BCF3");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_SUBIMPEGNO1, "SUBIMPEGNO1");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_IMPORTHEADER, 15200, 0, 2700, 1200, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPORTHEADER, "BD131A3E-7951-4CFB-958C-9166639D3447");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPORTHEADER, BUK_RITEINAILIBR_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_IMPORTO, "D5589E48-72B3-46AB-9886-06F067481F59");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_IMPORTO, "IMPORTO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_IMPOINAIHEAD, 18000, 0, 2700, 1200, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPOINAIHEAD, "481A1B5B-743F-4AA7-A4A1-193302B2123F");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPOINAIHEAD, "IMPOINAIHEAD");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPOINAIHEAD, BUK_RITEINAILIBR_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_IMPONIBILE, "AADC8B68-2877-44E4-9E31-A91B25ACDCFE");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_ALIQINAIHEAD, 20800, 0, 1100, 1200, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_ALIQINAIHEAD, "C5AAB312-D207-4358-873D-750ABD8359E4");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_ALIQINAIHEAD, "ALIQINAIHEAD");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_ALIQINAIHEAD, BUK_RITEINAILIBR_SPAN_ALIQ, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliq.", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_ALIQ, "114B1869-656A-4853-9E77-1D97AB46A941");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_ALIQ, "ALIQ");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_RITEINAIHEAD, 22000, 0, 2800, 1200, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_RITEINAIHEAD, "B796493A-EE6F-455A-B753-C6134FFCFF59");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_RITEINAIHEAD, "RITEINAIHEAD");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_RITEINAIHEAD, BUK_RITEINAILIBR_SPAN_RITACARIPERC, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Rit. a Carico Percipiente", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_RITACARIPERC, "60779010-D19A-4A1D-8E29-C999B35E7DA1");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_RITACARIPERC, "RITACARIPERC");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_INTESTPAGINA, BUK_RITEINAILIBR_RPTBOX_RITEINACEHEA, 25200, 0, 2500, 1200, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_RITEINACEHEA, "2FBB76BF-146A-465C-9E30-01FB1B649E64");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_RITEINACEHEA, "RITEINACEHEA");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_RITEINACEHEA, BUK_RITEINAILIBR_SPAN_RITACARIENTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Rit. a Carico Ente", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_RITACARIENTE, "1DD12BCB-C745-4221-94D2-4E9AB43AAD1C");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_RITACARIENTE, "RITACARIENTE");
    BUK_RITEINAILIBR.InitSection(BUK_RITEINAILIBR_RPT_RITEINAIREPO, BUK_RITEINAILIBR_SEC_DETTAGLIO, 800, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEINAILIBR.SetSectionRendersInto(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SEC_DETTAGLIO, "C7666E15-6A3A-40BF-924F-7EDE48F3BF21");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_BERASOESESEE, 0, 0, 3800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_BERASOESESEE, "88A3A0F9-980B-4C83-B411-AD8A11DB8B0D");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_BERASOESESEE, "BERASOESESEE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_BERASOESESEE, BUK_RITEINAILIBR_SPAN_REBERSERIRIL, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::REBERASOESES", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_REBERSERIRIL, "A92F61D5-ED1B-4178-9F10-3374157270C5");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_REBERSERIRIL, "REBERSERIRIL");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_BENCODICFISC, 3900, 0, 3400, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_BENCODICFISC, "2D3C54DD-7E63-4F28-A725-847C460517A2");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_BENCODICFISC, "BENCODICFISC");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_BENCODICFISC, BUK_RITEINAILIBR_SPAN_BENCODICFISC, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::RECBENCODFIS", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_BENCODICFISC, "FED35431-4D9A-450A-ADA7-F510677CE966");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_BENCODICFISC, "BENCODICFISC");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_NUMEROMAND, 7400, 0, 900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_NUMEROMAND, "AD582830-BCC6-4EA0-9FA8-1A69AFAB59AA");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_NUMEROMAND, "NUMEROMAND");
    BUK_RITEINAILIBR.set_BoxAlignment(BUK_RITEINAILIBR_RPTBOX_NUMEROMAND, 3);
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_NUMEROMAND, BUK_RITEINAILIBR_SPAN_LIQNUMERMAND, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECLIQNUMMAN", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQNUMERMAND, "49FD7382-DD46-487A-AD09-5101D91BD56F");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQNUMERMAND, "LIQNUMERMAND");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_MANDDATAMAND, 8400, 0, 2000, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_MANDDATAMAND, "B5965729-C61D-4CE3-AD95-7A8B03C388C9");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_MANDDATAMAND, "MANDDATAMAND");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_MANDDATAMAND, BUK_RITEINAILIBR_SPAN_MANDDATAMAND, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::RECMANDDATMA", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_MANDDATAMAND, "3DAFDF2F-B179-49C9-A426-C2520C8C9107");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_MANDDATAMAND, "MANDDATAMAND");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_IMPEGNO, 10500, 0, 1900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPEGNO, "73B42CE1-00C3-4A4C-A8FB-6B22A7B2F74D");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPEGNO, BUK_RITEINAILIBR_SPAN_IMPEGNO, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "To String (LIQ NUMERO SUBIMP) +c barra con spazi +c To String (LIQ ANNO IMP)", "::RECORDIMPEGN", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_IMPEGNO, "784D8BCC-52A2-46CD-B798-AAEC461402FD");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_IMPEGNO, "IMPEGNO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_SUBIMPEGNO, 12500, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGNO, "CB299C95-A71D-4552-BEAA-7DEED423AB80");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUBIMPEGNO, BUK_RITEINAILIBR_SPAN_SUBIMPEGNO, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "If Equal (LIQ ANNO IMP, Null Number, Null String, To String (LIQ NUMERO SUBIMP) +c barra con spazi +c To String (LIQ ANNO SUBIMP))", "::RECORSUBIMPE", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_SUBIMPEGNO, "6B72FDA9-0F5C-4A48-8766-4BF079C17557");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_IMPORTO, 15200, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPORTO, "B1818D8B-0FED-4A28-81F7-47EAB56E3284");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPORTO, "IMPORTO");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPORTO, BUK_RITEINAILIBR_SPAN_LIQIMPORTO, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECORLIQIMPO", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQIMPORTO, "842A9D21-BD68-4040-A9C9-0515E52BA312");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQIMPORTO, "LIQIMPORTO");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_IMPONIBINAIL, 18000, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_IMPONIBINAIL, "338B0CAE-F71B-4D3D-BD80-D564D1456C3E");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_IMPONIBINAIL, "IMPONIBINAIL");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_IMPONIBINAIL, BUK_RITEINAILIBR_SPAN_LIQIMPONINAI, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQIMPINA", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQIMPONINAI, "926DDFA8-9799-4A4E-8057-C5B9874BF9A4");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQIMPONINAI, "LIQIMPONINAI");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_ALIQUOTINAIL, 20800, 0, 1100, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_ALIQUOTINAIL, "17A99BE2-3216-4B8E-8A8E-824C26F96CC0");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_ALIQUOTINAIL, "ALIQUOTINAIL");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_ALIQUOTINAIL, BUK_RITEINAILIBR_SPAN_LIQALIQUINAI, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::RECLIQALIINA", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQALIQUINAI, "B39F447D-BB4D-409E-B118-A7CE2C0F1EFF");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQALIQUINAI, "LIQALIQUINAI");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_RITENUTINAIL, 22000, 0, 2800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_RITENUTINAIL, "043402EE-BC3E-49D5-A8DE-E49529C1D807");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_RITENUTINAIL, "RITENUTINAIL");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_RITENUTINAIL, BUK_RITEINAILIBR_SPAN_LIQRITENINAI, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRITINA", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQRITENINAI, "F7459588-1F0C-49C2-96CB-5FCCEBECDB7A");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQRITENINAI, "LIQRITENINAI");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_DETTAGLIO, BUK_RITEINAILIBR_RPTBOX_RITENINAILCE, 24900, 0, 2800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_RITENINAILCE, "6F65967A-2C3A-49B6-B337-69C3607735B0");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_RITENINAILCE, "RITENINAILCE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_RITENINAILCE, BUK_RITEINAILIBR_SPAN_LIQRITEINACE, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRIINCE", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_LIQRITEINACE, "0FD59179-3721-4222-863B-59B1B3F026AE");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_LIQRITEINACE, "LIQRITEINACE");
    BUK_RITEINAILIBR.InitSection(BUK_RITEINAILIBR_RPT_RITEINAIREPO, BUK_RITEINAILIBR_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEINAILIBR.SetSectionRendersInto(BUK_RITEINAILIBR_SEC_PIEDEPAGINA, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SEC_PIEDEPAGINA, "36DD1883-F8CB-4AA3-8DCF-C360FAA67243");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_RITEINAILIBR.InitSection(BUK_RITEINAILIBR_RPT_RITEINAIREPO, BUK_RITEINAILIBR_SEC_PIEDEREPORT, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEINAILIBR.SetSectionRendersInto(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SEC_PIEDEREPORT, "7A278B2E-57BE-47E0-9D05-2308B3E9BA15");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMPO, 15200, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMPO, "23589521-71A8-4764-B513-F627EAE10D9A");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMPO, BUK_RITEINAILIBR_SPAN_PIRSRLIRIRIL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_PIRSRLIRIRIL, "AAA5C434-CC3E-4672-8DAC-B91F7FA5455D");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_PIRSRLIRIRIL, "PIRSRLIRIRIL");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMIN, 18000, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMIN, "97A2AE90-FAEF-4569-B521-11E8765E18E6");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMIN, "SUMOFLIQIMIN");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQIMIN, BUK_RITEINAILIBR_SPAN_PRSRLIIRIRIL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_PRSRLIIRIRIL, "C5F12664-E02B-48B6-8727-66A1C268CC62");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_PRSRLIIRIRIL, "PRSRLIIRIRIL");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_SUMOFLIQRIIN, 22000, 0, 2800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQRIIN, "3FB42E68-B0C2-4AFF-8018-1E7E5737CBB0");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQRIIN, "SUMOFLIQRIIN");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUMOFLIQRIIN, BUK_RITEINAILIBR_SPAN_PRSRLRIRIRIL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_PRSRLRIRIRIL, "25659492-E128-4ACA-896A-944B8B6E2847");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_PRSRLRIRIRIL, "PRSRLRIRIRIL");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_SUOFLIRIINCE, 24900, 0, 2800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_SUOFLIRIINCE, "39C25252-546E-485A-AF43-29FA8F75FB2F");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_SUOFLIRIINCE, "SUOFLIRIINCE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_SUOFLIRIINCE, BUK_RITEINAILIBR_SPAN_PRSRLRICRIRI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_PRSRLRICRIRI, "9C111010-C22A-4BB1-9A70-DEB8C96C0B54");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_PRSRLRICRIRI, "PRSRLRICRIRI");
    BUK_RITEINAILIBR.InitReportBox(BUK_RITEINAILIBR_SEC_PIEDEREPORT, BUK_RITEINAILIBR_RPTBOX_TOTALE, 13800, 0, 1300, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_RPTBOX_TOTALE, "9CA59FBA-CF6B-4DEE-B07D-C3AA0AB06DC8");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_RPTBOX_TOTALE, "TOTALE");
    BUK_RITEINAILIBR.InitBoxSpan(BUK_RITEINAILIBR_RPTBOX_TOTALE, BUK_RITEINAILIBR_SPAN_TOTALE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_RITEINAILIBR.SetRTCGuid(BUK_RITEINAILIBR_SPAN_TOTALE, "97B5FF26-EC8A-4337-869A-82B09F859ED9");
    BUK_RITEINAILIBR.SetObjCode(BUK_RITEINAILIBR_SPAN_TOTALE, "TOTALE");
    BUK_RITEINAILIBR_RPT_RITEINAIREPO_InitQuery(false, true);
  }

  private void BUK_RITEINAILIBR_InitLinks()
  {
    BUK_RITEINAILIBR.SetBoxNextBox(BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA, BUK_RITEINAILIBR_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_RITEINAILIBR) BUK_RITEINAILIBR_OnPreview();
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
