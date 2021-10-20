// **********************************************
// Attribuzione Al Servizio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AttribuzioneAlServizio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ATTRIALSERVI_ES = 0;
  private static int PFL_ATTRIALSERVI_CAPITOLO = 1;
  private static int PFL_ATTRIALSERVI_ARTICOLO = 2;
  private static int PFL_ATTRIALSERVI_INFOVOCEPEG = 3;
  private static int PFL_ATTRIALSERVI_DESCRIZIONE = 4;
  private static int PFL_ATTRIALSERVI_IMPORTO = 5;
  private static int PFL_ATTRIALSERVI_PERC = 6;
  private static int PFL_ATTRIALSERVI_DISPONIBILIT = 7;
  private static int PFL_ATTRIALSERVI_VOCEPEGLABEL = 8;
  private static int PFL_ATTRIALSERVI_ESERCIZIO = 9;
  private static int PFL_ATTRIALSERVI_SERVIZIO = 10;
  private static int PFL_ATTRIALSERVI_TIPO = 11;
  private static int PFL_ATTRIALSERVI_UTENTEINSERI = 12;
  private static int PFL_ATTRIALSERVI_DATAINSERIME = 13;
  private static int PFL_ATTRIALSERVI_UTENTULTIAGG = 14;
  private static int PFL_ATTRIALSERVI_DATAULTIMAGG = 15;
  private static int PFL_ATTRIALSERVI_PROGRESSIVO = 16;
  private static int PFL_ATTRIALSERVI_CAPITOLOOLD = 17;
  private static int PFL_ATTRIALSERVI_ARTICOLOOLD = 18;
  private static int PFL_ATTRIALSERVI_PERCENTUAOLD = 19;
  private static int PFL_ATTRIALSERVI_IMPORTOOLD = 20;
  private static int PFL_ATTRIALSERVI_STATO = 21;
  private static int PFL_ATTRIALSERVI_SERVIZILABEL = 22;

  private static int PPQRY_SERCOS1 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_DISPONIBILIT = 2;
  private static int PPQRY_INFO = 3;


  IDPanel PAN_ATTRIALSERVI;
  CIDREObj BUK_ATTRALSERBOO;
  OBook BKW_ATTRALSERBOO;
  //
  // Template Pages constants
  private static int BUK_ATTRALSERBOO_MST_ATTALSERREPA = 1;
  private static int BUK_ATTRALSERBOO_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ATTRALSERBOO_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ATTRALSERBOO_RPTBOX_TITOLO = 4;
  private static int BUK_ATTRALSERBOO_SPAN_CAPIATTAISER = 5;
  private static int BUK_ATTRALSERBOO_RPTBOX_PAGEHEADER = 6;
  private static int BUK_ATTRALSERBOO_RPTBOX_PAGEBODY = 7;

  //
  // Reports constants
  private static int BUK_ATTRALSERBOO_RPT_ATTRALSERREP = 8;
  private static int BUK_ATTRALSERBOO_SEC_REPORTHEADER = 9;
  private static int BUK_ATTRALSERBOO_SEC_PAGEHEADER = 10;
  private static int BUK_ATTRALSERBOO_RPTBOX_ESHEADER = 11;
  private static int BUK_ATTRALSERBOO_SPAN_ES1 = 12;
  private static int BUK_ATTRALSERBOO_RPTBOX_DESCRIHEADER = 13;
  private static int BUK_ATTRALSERBOO_SPAN_DESCRIZIONE1 = 14;
  private static int BUK_ATTRALSERBOO_RPTBOX_STANZIHEADER = 15;
  private static int BUK_ATTRALSERBOO_SPAN_STANZIAMENT1 = 16;
  private static int BUK_ATTRALSERBOO_RPTBOX_PERCENHEADER = 17;
  private static int BUK_ATTRALSERBOO_SPAN_PERCENTUALE1 = 18;
  private static int BUK_ATTRALSERBOO_RPTBOX_IMPORTHEADER = 19;
  private static int BUK_ATTRALSERBOO_SPAN_IMPORTO1 = 20;
  private static int BUK_ATTRALSERBOO_RPTBOX_DISPONHEADER = 21;
  private static int BUK_ATTRALSERBOO_SPAN_DISPONIBILI1 = 22;
  private static int BUK_ATTRALSERBOO_RPTBOX_VOCEPEGHEADE = 23;
  private static int BUK_ATTRALSERBOO_SPAN_C = 24;
  private static int BUK_ATTRALSERBOO_RPTBOX_SERVIZHEADER = 25;
  private static int BUK_ATTRALSERBOO_SPAN_SERVIZIO1 = 26;
  private static int BUK_ATTRALSERBOO_RPTBOX_SERVIZIO = 27;
  private static int BUK_ATTRALSERBOO_SPAN_SERVIZIO = 28;
  private static int BUK_ATTRALSERBOO_SEC_ESGROUPHEADE = 29;
  private static int BUK_ATTRALSERBOO_SEC_DETAIL = 30;
  private static int BUK_ATTRALSERBOO_RPTBOX_ES = 31;
  private static int BUK_ATTRALSERBOO_SPAN_ES = 32;
  private static int BUK_ATTRALSERBOO_RPTBOX_VOCEPEG = 33;
  private static int BUK_ATTRALSERBOO_SPAN_CAPITOLO = 34;
  private static int BUK_ATTRALSERBOO_RPTBOX_DESCRIZIONE = 35;
  private static int BUK_ATTRALSERBOO_SPAN_DESCRIZIONE = 36;
  private static int BUK_ATTRALSERBOO_RPTBOX_STANZIAMENTO = 37;
  private static int BUK_ATTRALSERBOO_SPAN_STANZIAMENTO = 38;
  private static int BUK_ATTRALSERBOO_RPTBOX_PERCENTUALE = 39;
  private static int BUK_ATTRALSERBOO_SPAN_PERCENTUALE = 40;
  private static int BUK_ATTRALSERBOO_RPTBOX_IMPORTO = 41;
  private static int BUK_ATTRALSERBOO_SPAN_IMPORTO = 42;
  private static int BUK_ATTRALSERBOO_RPTBOX_DISPONIBILIT = 43;
  private static int BUK_ATTRALSERBOO_SPAN_DISPONIBILIT = 44;
  private static int BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE = 45;
  private static int BUK_ATTRALSERBOO_RPTBOX_TOTALEIMPORT = 46;
  private static int BUK_ATTRALSERBOO_SPAN_TOTALEIMPORT = 47;
  private static int BUK_ATTRALSERBOO_RPTBOX_BARRASUPERIO = 48;
  private static int BUK_ATTRALSERBOO_SEC_PAGEFOOTER = 49;
  private static int BUK_ATTRALSERBOO_SEC_REPORTFOOTER = 50;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI252(IMDB);
    Init_TBL_IMDBSERCOS(IMDB);
    //
    //
    Init_PQRY_SERCOS1(IMDB);
    Init_PQRY_SERCOS1_RS(IMDB);
    Init_PQRY_SERCOS2(IMDB);
    Init_QRY_CFASELINTV90(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI252(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI252, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI252, "TBL_PARAMETRI252");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, "PARAMSERVIZI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARADESCSERV, "PARADESCSERV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARADESCSERV,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMINECONO, "PARAMINECONO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI252,IMDBDef2.FLD_PARAMETRI252_PARAMINECONO,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI252, 0);
  }

  private static void Init_TBL_IMDBSERCOS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_IMDBSERCOS, 19);
    IMDB.set_TblCode(IMDBDef2.TBL_IMDBSERCOS, "TBL_IMDBSERCOS");
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD, "IMDSERCAPOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD, "IMDSERARTOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE, "PERCENTUALE");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE,3,5,2);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERPEROLD, "IMDSERPEROLD");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERPEROLD,3,5,2);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERIMPOLD, "IMDSERIMPOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERIMPOLD,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_FASE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT, "IMDBSERCSTAT");
    IMDB.SetFldParams(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT,5,1,0);
  }

  private static void Init_PQRY_SERCOS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SERCOS1, 19);
    IMDB.set_TblCode(IMDBDef9.PQRY_SERCOS1, "PQRY_SERCOS1");
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD, "IMDSERCAPOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD, "IMDSERARTOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_PERCENTUALE, "PERCENTUALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_PERCENTUALE,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, "IMDSERPEROLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, "IMDSERIMPOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_FASE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, "IMDBSERCSTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1,IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_SERCOS1, 0);
  }

  private static void Init_PQRY_SERCOS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SERCOS1_RS, 19);
    IMDB.set_TblCode(IMDBDef9.PQRY_SERCOS1_RS, "PQRY_SERCOS1_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD, "IMDSERCAPOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD, "IMDSERARTOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_PERCENTUALE, "PERCENTUALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_PERCENTUALE,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, "IMDSERPEROLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, "IMDSERIMPOLD");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_FASE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, "IMDBSERCSTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS1_RS,IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT,5,1,0);
  }

  private static void Init_PQRY_SERCOS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_SERCOS2, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_SERCOS2, "PQRY_SERCOS2");
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_SERVIZIO,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORVOCEPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_PERCENTUALE, "PERCENTUALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_PERCENTUALE,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDIMPORT,2,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDSTANZI, "RECORDSTANZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDSTANZI,2,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef9.PQRY_SERCOS2,IMDBDef9.PQSL_SERCOS2_RECORDDISPON,2,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_SERCOS2, 0);
  }

  private static void Init_QRY_CFASELINTV90(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.QRY_CFASELINTV90, 1);
    IMDB.set_TblCode(IMDBDef9.QRY_CFASELINTV90, "QRY_CFASELINTV90");
    IMDB.set_FldCode(IMDBDef9.QRY_CFASELINTV90,IMDBDef9.QSL_CFASELINTV90_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef9.QRY_CFASELINTV90,IMDBDef9.QSL_CFASELINTV90_COUNT,1,19,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AttribuzioneAlServizio(MyWebEntryPoint w, IMDBObj imdb)
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
  public AttribuzioneAlServizio()
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
    FormIdx = MyGlb.FRM_ATTRIALSERVI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5C144EDF-9B3D-412C-88A7-F20DC2880076";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 398;
    set_Caption(new IDVariant("Attribuzione Al Servizio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 372;
    Frames[1].Caption = "Attribuzione Al Servizio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_ATTRIALSERVI = new IDPanel(w, this, 1, "PAN_ATTRIALSERVI");
    Frames[1].Content = PAN_ATTRIALSERVI;
    PAN_ATTRIALSERVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ATTRIALSERVI.VS = MainFrm.VisualStyleList;
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CC2137D1-1EDF-4D90-82E0-29A2DDCDCAEF");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 724, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ATTRIALSERVI.InitStatus = 2;
    PAN_ATTRIALSERVI_Init();
    PAN_ATTRIALSERVI_InitFields();
    PAN_ATTRIALSERVI_InitQueries();
    BKW_ATTRALSERBOO = new OBook(this);
    BUK_ATTRALSERBOO = new CIDREObj(BKW_ATTRALSERBOO);
    BKW_ATTRALSERBOO.iGuid = "6F64E19A-1929-4D8E-B516-41CCB76F0765";
    BKW_ATTRALSERBOO.Code = "BUK_ATTRALSERBOO";
    BKW_ATTRALSERBOO.BookObj = BUK_ATTRALSERBOO;
    BKW_ATTRALSERBOO.InitDefMasks();
    BUK_ATTRALSERBOO.InitBook(1, 1245441, "Attribuzione Al Servizio Book", IMDB, MainFrm.VisualStyleList);
    BUK_ATTRALSERBOO.InitHTML();
    BUK_ATTRALSERBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ATTRALSERBOO.Book.SetMainFrm(MainFrm);
    BUK_ATTRALSERBOO.SetRTCGuid(0, "6F64E19A-1929-4D8E-B516-41CCB76F0765");
    BUK_ATTRALSERBOO.SetObjCode(0, "ATTRALSERBOO");
    BUK_ATTRALSERBOO_MST_ATTALSERREPA_Init();
    BUK_ATTRALSERBOO_RPT_ATTRALSERREP_Init();
    BUK_ATTRALSERBOO_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_SALVA48+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA16+BaseCmdLinIdx)
      {
        ApriReport();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI86+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI23+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI86+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOCAPIT1+BaseCmdLinIdx)
      {
        ScegliVocePeg();
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
      if (IMDB.TblModified(IMDBDef2.TBL_IMDBSERCOS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ATTRIALSERVI_SERCOS1();
      }
      PAN_ATTRIALSERVI.UpdatePanel(MainFrm);
      // BUK_ATTRALSERBOO.UpdateBook();
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
    if (Code.equals("BUK_ATTRALSERBOO")) return BUK_ATTRALSERBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof AttribuzioneAlServizio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AttribuzioneAlServizio.class.getName() : (Glb.ClassWithPackage(AttribuzioneAlServizio.class) ? AttribuzioneAlServizio.class.getName().substring(AttribuzioneAlServizio.class.getPackage().getName().length() + 1) : AttribuzioneAlServizio.class.getName()));
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
    IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_ECONOMIA = new IDVariant(0,IDVariant.STRING);
        v_ECONOMIA = (new IDVariant("In Economia", IDVariant.STRING));
        v_TIPO = new IDVariant(v_ECONOMIA);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("P")), true))
      {
        IDVariant v_PRODUTTIVO = new IDVariant(0,IDVariant.STRING);
        v_PRODUTTIVO = (new IDVariant("Produttivo", IDVariant.STRING));
        v_TIPO = new IDVariant(v_PRODUTTIVO);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("D")), true))
      {
        IDVariant v_INDIVIDUALE = new IDVariant(0,IDVariant.STRING);
        v_INDIVIDUALE = (new IDVariant("A Domanda Individuale", IDVariant.STRING));
        v_TIPO = new IDVariant(v_INDIVIDUALE);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("G")), true))
      {
        IDVariant v_GENERALE = new IDVariant(0,IDVariant.STRING);
        v_GENERALE = (new IDVariant("Generale", IDVariant.STRING));
        v_TIPO = new IDVariant(v_GENERALE);
      }
      PAN_ATTRIALSERVI.set_FieldText(PFL_ATTRIALSERVI_SERVIZILABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_ATTRIALSERVI.FieldText(PFL_ATTRIALSERVI_SERVIZILABEL))), Caption()), (new IDVariant(" "))), IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARADESCSERV, 0)), (new IDVariant(" "))), (new IDVariant("("))), v_TIPO), (new IDVariant(")"))).stringValue());
      RiempiIMDB();
      PAN_ATTRIALSERVI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ATTRIALSERVI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_ECONOMIA = new IDVariant(0,IDVariant.STRING);
        v_ECONOMIA = (new IDVariant("In Economia", IDVariant.STRING));
        v_TIPO = new IDVariant(v_ECONOMIA);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "LoadEvent", _e);
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      UNLOADEVENT_CFASELINTV90();
      if (!IMDB.Eof(IMDBDef9.QRY_CFASELINTV90, 0))
      {
        v_VCOUNT = IMDB.Value(IMDBDef9.QRY_CFASELINTV90, IMDBDef9.QSL_CFASELINTV90_COUNT, 0, IDVariant.INTEGER) ;
      }
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esistono righe nuove o modificate senza l'indicazione di importo o Percentuale."));
        Cancel.set((new IDVariant(-1)));
        PAN_ATTRIALSERVI.SetModified(MainFrm);
        MainFrm.set_AlertMessage(S); 
      }
      AzzeraValoriOld();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void UNLOADEVENT_CFASELINTV90() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.QRY_CFASELINTV90);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBSERCOS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_IMDBSERCOS, 0))
    {
      if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT, 0))))
      {
        if (IDL.IsNull(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMPORTO, 0),IMDB.Value(IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE, 0))))
        {
          IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
          IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
        }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_IMDBSERCOS, 0);
      if (IMDB.Eof(IMDBDef2.TBL_IMDBSERCOS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBSERCOS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef9.QRY_CFASELINTV90, 0);
              IMDB.set_Value(IMDBDef9.QRY_CFASELINTV90, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef9.QRY_CFASELINTV90, 0);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ATTRIALSERVI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOOLTIPINFO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIPINFO = (new IDVariant("Servizi Diretti finanziati dal Capitolo", IDVariant.STRING));
      MainFrm.DynamicProperties(PAN_ATTRIALSERVI);
      // 
      // Attribuzione Al Servizio On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ATTRIALSERVI.set_ToolTip(Glb.OBJ_FIELD,PFL_ATTRIALSERVI_DESCRIZIONE,(new IDVariant(PAN_ATTRIALSERVI.FieldText(PFL_ATTRIALSERVI_DESCRIZIONE))).stringValue()); 
      if (PAN_ATTRIALSERVI.IsNewRow() || IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0).equals((new IDVariant("I")), true))
      {
        PAN_ATTRIALSERVI.SetFlags (Glb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ATTRIALSERVI.SetFlags (Glb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Database Error Event
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
  private void PAN_ATTRIALSERVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ATTRIALSERVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Attribuzione Al Servizio On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ATTRIALSERVI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attribuzione Al Servizio After Find Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_ATTRIALSERVI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attribuzione Al Servizio On Change Row Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ATTRIALSERVI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attribuzione Al Servizio On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ESERCIZIO, 0, new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0, (new IDVariant("E")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_TIPO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_TIPO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_SERVIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_SERVIZIO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0, (new IDVariant("I")));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0, (new IDVariant("U")));
        }
      }
      if (Column.equals((new IDVariant(PFL_ATTRIALSERVI_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_ATTRIALSERVI_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0))))
          {
            if (ControlloVocePeg(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0), IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), (new IDVariant(0))).equals((new IDVariant(-1)), true))
            {
              IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD, 0));
              IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD, 0));
              return;
            }
          }
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERCAPOLD, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERARTOLD, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_ATTRIALSERVI_IMPORTO)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0))))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0, (new IDVariant()));
          if (Disponibilità().compareTo((new IDVariant(0)), true)<0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Il Capitolo non ha sufficiente Disponibilità!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, 0));
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ATTRIALSERVI_PERC)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0))))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, 0),(new IDVariant(-1))), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0, (new IDVariant()));
          if (Disponibilità().compareTo((new IDVariant(0)), true)<0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Il Capitolo non ha sufficiente Disponibilità!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, 0));
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERIMPOLD, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMDSERPEROLD, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0));
          }
        }
      }
      if (FieldWasModified.booleanValue())
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ATTRIALSERVI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attribuzione Al Servizio On Command Event Body
      // Procedure Body
      // 
      if ((Command.equals((new IDVariant(32)), true) || Command.equals((new IDVariant(64)), true)) && UserOperation.booleanValue())
      {
        RiempiIMDB();
        // ATALSEONCOEV_IMDSERDELROW();
      }
      if (Command.equals((new IDVariant(16)), true))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from SERCOS ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e5)
        {
          MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // IMDB Sercos: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void ATALSEONCOEV_IMDSERDELROW() throws SQLException
  {
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ATTRIALSERVI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attribuzione Al Servizio On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ATTRIALSERVI.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA48+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA16+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI86+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (new IDVariant(PAN_ATTRIALSERVI.Status()).equals((new IDVariant(3)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA48+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA16+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI86+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (new IDVariant(PAN_ATTRIALSERVI.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA48+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA16+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI86+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Attribuzione Al Servizio On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ATTRIALSERVI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_ATTRIALSERVI, Cancel);
      // 
      // Attribuzione Al Servizio On Validate Row Body
      // Corpo Procedura
      // 
      if (PAN_ATTRIALSERVI.FinalUpdate)
      {
        if (IDL.IsNull(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0),IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0))))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Inserire Importo o Percentuale"));
          PAN_ATTRIALSERVI.SetErrorText(S.stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AttribuzioneAlServizioOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Scegli Voce Peg
  // **********************************************************************
  public int ScegliVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI253, IMDBDef2.FLD_PARAMETRI253_PARAMSERVIZI, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI253, IMDBDef2.FLD_PARAMETRI253_PARAMTIPO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0));
      MainFrm.Show(MyGlb.FRM_ELECAPSERDIR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "ScegliVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Azzera Valori Old
  // **********************************************************************
  public int AzzeraValoriOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Azzera Valori Old Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "AzzeraValoriOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMTIPO, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMES, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMCAPITOL, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMARTICOL, 0, IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMDESCRIZ, 0, (new IDVariant(PAN_ATTRIALSERVI.FieldText(PFL_ATTRIALSERVI_DESCRIZIONE))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI312, IMDBDef2.FLD_PARAMETRI312_PARAMSTANZIA, 0, Stanziamento());
      MainFrm.Show(MyGlb.FRM_SERDIRFIDACA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      PAN_ATTRIALSERVI.PanelCommand(Glb.PCM_UPDATE);
      MainFrm.Cf4armDBObject.BeginTrans();
      IMDB.TblMoveFirst (IMDBDef9.PQRY_SERCOS1_RS, 0);
      while (!IMDB.Eof(IMDBDef9.PQRY_SERCOS1_RS, 0))
      {
        if (IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0).equals((new IDVariant("U")), true) || IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0).equals((new IDVariant("I")), true))
        {
          if (ControlloVocePeg(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_E_S, 0), IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), (new IDVariant(-1))).equals((new IDVariant(-1)), true))
          {
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_ATTRIALSERVI.SetModified(MainFrm);
            return 0;
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0)))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Indicare Percentuale o Importo!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_ATTRIALSERVI.SetModified(MainFrm);
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0).equals((new IDVariant("U")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update SERCOS set ");
            SQL.append("  E_S = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PERCENTUALE = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMPORTO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
            SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e10)
          {
            MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_ATTRIALSERVI.SetModified(MainFrm);
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMDBSERCSTAT, 0).equals((new IDVariant("I")), true))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into SERCOS ");
            SQL.append("( ");
            SQL.append("  PROGRESSIVO, ");
            SQL.append("  ESERCIZIO, ");
            SQL.append("  SERVIZIO, ");
            SQL.append("  E_S, ");
            SQL.append("  CAPITOLO, ");
            SQL.append("  ARTICOLO, ");
            SQL.append("  PERCENTUALE, ");
            SQL.append("  IMPORTO, ");
            SQL.append("  TIPO, ");
            SQL.append("  UTENTE_INSERIMENTO, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  to_number(NULL), ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_SERVIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1_RS, IMDBDef9.PQSL_SERCOS1_TIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e14)
          {
            MainFrm.set_AlertMessage(new IDVariant(e14.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_ATTRIALSERVI.SetModified(MainFrm);
            return 0;
          }
        }
        IMDB.TblMoveNext(IMDBDef9.PQRY_SERCOS1_RS, 0);
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      RiempiIMDB();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Report
  // **********************************************************************
  public int ApriReport ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Report Body
      // Procedure Body
      // 
      BUK_ATTRALSERBOO.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_ATTRALSERBOO.ReportRefreshQuery(BUK_ATTRALSERBOO_RPT_ATTRALSERREP);
      BUK_ATTRALSERBOO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_ATTRALSERBOO.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "ApriReport", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Procedure Body
      // 
      RIEMPIIMDB_IMDSERDELROW();
      RIEMPIIMDB_IMDSERINSROW();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Sercos: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSERDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_IMDBSERCOS);
  }

  // **********************************************************************
  // IMDB Sercos: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_IMDSERINSROW() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as SERCOSPROGRE, ");
    SQL.append("  A.ESERCIZIO as SERCOSESERCI, ");
    SQL.append("  A.SERVIZIO as SERCOSSERVIZ, ");
    SQL.append("  A.E_S as SERCOSES, ");
    SQL.append("  A.CAPITOLO as SERCOSCAPIT1, ");
    SQL.append("  A.CAPITOLO as SERCOSCAPITO, ");
    SQL.append("  A.ARTICOLO as SERCOSARTIC1, ");
    SQL.append("  A.ARTICOLO as SERCOSARTICO, ");
    SQL.append("  A.PERCENTUALE as SERCOSPERCE1, ");
    SQL.append("  A.PERCENTUALE as SERCOSPERCEN, ");
    SQL.append("  A.IMPORTO as SERCOSIMPOR1, ");
    SQL.append("  A.IMPORTO as SERCOSIMPORT, ");
    SQL.append("  A.FASE as SERCOSFASE, ");
    SQL.append("  A.TIPO as SERCOSTIPO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as SERCUTENINSE, ");
    SQL.append("  A.DATA_INSERIMENTO as SERCDATAINSE, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as SERUTEULTAGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as SERDATULTAGG ");
    SQL.append("from ");
    SQL.append("  SERCOS A ");
    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.SERVIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.TIPO = 'E' AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMINECONO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') OR ((" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMINECONO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL) AND A.TIPO IN ('P', 'G', 'D'))) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef2.TBL_IMDBSERCOS, 0);
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO,0,RS.Get(2));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_SERVIZIO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_E_S,0,RS.Get(4));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_CAPITOLO,0,new IDVariant(RS.Get(5),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD,0,new IDVariant(RS.Get(6),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_ARTICOLO,0,RS.Get(7));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD,0,RS.Get(8));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE,0,RS.Get(9));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERPEROLD,0,RS.Get(10));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMPORTO,0,RS.Get(11));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_IMDSERIMPOLD,0,RS.Get(12));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_FASE,0,RS.Get(13));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_TIPO,0,RS.Get(14));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO,0,RS.Get(15));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO,0,RS.Get(16));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG,0,RS.Get(17));
      IMDB.set_Value(IMDBDef2.TBL_IMDBSERCOS,IMDBDef2.FLD_IMDBSERCOS_DATA_ULTIMO_AGG,0,RS.Get(18));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Controllo Voce Peg
  // E S:  - Input
  // Capitolo:  - Input
  // Articolo:  - Input
  // Salvataggio:  - Input
  // **********************************************************************
  public IDVariant ControlloVocePeg (IDVariant ES, IDVariant Capitolo, IDVariant Articolo, IDVariant Salvataggio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SIMULATO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EFFETTIVO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARCAPITOLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SIMULATO = (new IDVariant("Simulato!", IDVariant.STRING));
      v_EFFETTIVO = (new IDVariant("Effettivo", IDVariant.STRING));
      // 
      // Controllo Voce Peg Body
      // Procedure Body
      // 
      v_VARCAPITOLO = IDL.Add(IDL.Add(IDL.ToString(Capitolo), (new IDVariant("/"))), IDL.ToString(Articolo));
      v_NUMREC = (new IDVariant(0));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BILBPR A ");
      SQL.append("where (A.TIPO = NVL(" + IDL.CSql(MainFrm.CONTROSERCOS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E')) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0 || v_NUMREC.equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Capitolo ", IDVariant.STRING));
        if (IDL.NullValue(MainFrm.CONTROSERCOS,(new IDVariant("E"))).equals((new IDVariant("E")), true))
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, v_VARCAPITOLO), (new IDVariant(" "))), v_EFFETTIVO)); 
        }
        else
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, v_VARCAPITOLO), (new IDVariant(" "))), v_SIMULATO)); 
        }
        return (new IDVariant(-1));
      }
      else
      {
        IDVariant v_ESISTE = new IDVariant(0,IDVariant.INTEGER);
        if (!(Salvataggio.booleanValue()))
        {
          v_ESISTE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  SERCOS A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SERVIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_ESISTE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_ESISTE.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO1 = (new IDVariant("Riferimento ", IDVariant.STRING));
            IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO2 = (new IDVariant(" già presente!", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_AVVISO1, v_VARCAPITOLO), v_AVVISO2)); 
            return (new IDVariant(-1));
          }
          else
          {
            return (new IDVariant(1));
          }
        }
        else
        {
          return (new IDVariant(1));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "ControlloVocePeg", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Disponibilità
  // **********************************************************************
  public IDVariant Disponibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMAIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMAPERC = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_DISPONIBILIT = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Disponibilità Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(NVL(A.IMPORTO, 0)) as SUNUVASEIMZE, ");
      SQL.append("  SUM(NVL(A.PERCENTUALE, 0)) as SUNUVASEPEZE ");
      SQL.append("from ");
      SQL.append("  SERCOS A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO <> " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SOMMAIMPORTO = QV.Get("SUNUVASEIMZE", IDVariant.DECIMAL) ;
        v_SOMMAPERC = QV.Get("SUNUVASEPEZE", IDVariant.DECIMAL) ;
      }
      QV.Close();
      v_STANZIAMENTO = Stanziamento();
      v_DISPONIBILIT = IDL.Sub(IDL.Mul(v_STANZIAMENTO, (IDL.Sub((new IDVariant(1)), (IDL.Div((IDL.Add(IDL.NullValue(v_SOMMAPERC,(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_PERCENTUALE, 0),(new IDVariant(0))))), (new IDVariant(100))))))), (IDL.Add(IDL.NullValue(v_SOMMAIMPORTO,(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_IMPORTO, 0),(new IDVariant(0))))));
      return v_DISPONIBILIT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "Disponibilità", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Stanziamento
  // **********************************************************************
  public IDVariant Stanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Stanziamento Body
      // Procedure Body
      // 
      v_STANZIAMENTO = (new IDVariant(0, IDVariant.DECIMAL));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0)) as SNVBSICZNVBV ");
      SQL.append("from ");
      SQL.append("  BILBPR A ");
      SQL.append("where (A.TIPO = NVL(" + IDL.CSql(MainFrm.CONTROSERCOS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E')) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_SERCOS1, IMDBDef9.PQSL_SERCOS1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_STANZIAMENTO = QV.Get("SNVBSICZNVBV", IDVariant.DECIMAL) ;
      }
      QV.Close();
      return v_STANZIAMENTO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AttribuzioneAlServizio", "Stanziamento", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // SERCOS
  // Primary record source for panel data
  // **********************************************************************
  private void ATTRIALSERVI_SERCOS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_SERCOS1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBSERCOS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_IMDBSERCOS, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_SERCOS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_SERCOS1_RS, 0, IMDBDef2.TBL_IMDBSERCOS, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 0, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 1, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 2, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_SERVIZIO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 3, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_E_S, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 4, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 5, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 6, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 7, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 8, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 9, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERPEROLD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 10, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 11, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDSERIMPOLD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 12, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_FASE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 13, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_TIPO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 14, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 15, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 16, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 17, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_DATA_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_SERCOS1_RS, 18, 0, IMDBDef2.TBL_IMDBSERCOS, IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_IMDBSERCOS, 0);
      if (IMDB.Eof(IMDBDef2.TBL_IMDBSERCOS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_IMDBSERCOS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_SERCOS1_RS, 0);
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
  private void PAN_ATTRIALSERVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ATTRIALSERVI_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_ATTRIALSERVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ATTRIALSERVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ATTRIALSERVI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ATTRIALSERVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ATTRIALSERVI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ATTRALSERBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ATTRALSERBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ATTRALSERBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_PAGEHEADER)
    {
      BUK_ATTRALSERBOO.set_SpanValue(BUK_ATTRALSERBOO_SPAN_SERVIZIO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARADESCSERV, 0), (new IDVariant(" "))), (new IDVariant("("))), ((IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("G"))))?(new IDVariant("Generale")):((IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("D"))))?(new IDVariant("A Domanda Individuale")):((IMDB.Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0).equals((new IDVariant("P"))))?(new IDVariant("Produttivo")):(new IDVariant("In Economia")))))), (new IDVariant(")")))));
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_ESGROUPHEADE)
    {
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE)
    {
      BUK_ATTRALSERBOO.set_SpanValue(BUK_ATTRALSERBOO_SPAN_TOTALEIMPORT, new IDVariant(IDL.NullValue(BUK_ATTRALSERBOO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE,"RECORDIMPORT"),(new IDVariant(0)))));
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ATTRALSERBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ATTRALSERBOO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ATTRALSERBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ATTRALSERBOO_MST_ATTALSERREPA)
    {
      BUK_ATTRALSERBOO.set_SpanValue(BUK_ATTRALSERBOO_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ATTRALSERBOO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ATTRALSERBOO.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ATTRALSERBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ATTRALSERBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ATTRALSERBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ATTRALSERBOO_OnPreview()
  {
    PreviewBook = BKW_ATTRALSERBOO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ATTRIALSERVI_Init()
  {

    PAN_ATTRIALSERVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ATTRIALSERVI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ATTRIALSERVI.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, "2384E78F-1544-4F34-8132-1169CA4C6111");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, "E/S");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, "3BFFE8F7-FDA6-4106-93F3-EFAFA204ED69");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, "CAPITOLO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, "9B7B2C1B-9D4B-4D24-A58E-A7D1D0F42315");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, "ARTICOLO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, "90D4B37F-28C0-4798-93AD-9968E970F8C8");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, " Info Voce Peg");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, "CB06B26C-A2A2-4636-85F3-9054FF4D8CA1");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, "Descrizione");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, "69919512-C8CE-45C6-BE12-17D04F50B6A9");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, "Importo");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, "68C10410-C777-4B67-AE6C-5B8545552B6B");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, "Perc.");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, "FD916CD5-465B-495E-A8D3-B14B36C56363");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, "Disponibilità");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.VIS_VISLOOUPCFIM);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, "5BFE2671-370B-4AC7-AD9C-6E5D6137395B");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, "Capitolo/Art.");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, "15895FC5-EC66-4C6D-A0A2-169DA311A169");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, "ESERCIZIO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, "011B0C79-2D42-495A-B40E-98746AA76EA2");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, "SERVIZIO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, "FFB7DA83-58B7-491F-88CE-03E7C86250FD");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, "TIPO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, "2075B182-6513-4E80-BC35-2B4C0DA869DE");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, "A7FE76C2-67E8-4E3F-9025-856961004164");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, "2AFA9A7A-39B6-43F3-9332-6B2863D2F991");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, "77701B42-9D35-4E0E-9C12-61FB127B35DA");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, "ADB518AD-8FAA-485C-A120-09017381F72E");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, "PROGRESSIVO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, "F5C0E0F9-21EE-436F-8C3F-795E638C640C");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, "CAPITOLO OLD");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, "B4493E08-11BA-45E0-8611-75BE50D83E0B");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, "ARTICOLO OLD");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, "EA02937E-AA91-45DD-B532-1290ACCA8210");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, "PERCENTUALE OLD");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, "40EF66DA-CCE6-434E-BDCB-BB30D9C90514");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, "IMPORTO OLD");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, "3F556767-F1F7-42DB-805D-1F64F2EBF29D");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, "STATO");
    PAN_ATTRIALSERVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, "");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTRIALSERVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, "949148D4-2993-485B-8A9B-3DC7C61AACD2");
    PAN_ATTRIALSERVI.set_Header(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, "Servizio: ");
    PAN_ATTRIALSERVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_ATTRIALSERVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ATTRIALSERVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_LIST, 0, 84, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_LIST, 24);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_FORM, 468, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_FORM, 40);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ES, MyGlb.PANEL_FORM, "E/S");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_ES, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_ES, PPQRY_SERCOS1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_LIST, 64, 84, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_CAPITOLO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_CAPITOLO, PPQRY_SERCOS1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_LIST, 180, 84, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_FORM, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_ARTICOLO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_ARTICOLO, PPQRY_SERCOS1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_LIST, 204, 84, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_LIST, 172);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_LIST, "I. V. P.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_FORM, 4, 484, 604, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_FORM, 172);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_INFOVOCEPEG, MyGlb.PANEL_FORM, " Info Voce Peg");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_INFOVOCEPEG, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_INFOVOCEPEG, PPQRY_INFO, "'I'", "INFOVOCEPEG", 5, 1, 0, -13997);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ATTRIALSERVI.SetValueListItem(PFL_ATTRIALSERVI_INFOVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_LIST, 228, 84, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_LIST, 164);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 172, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_FORM, 164);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_DESCRIZIONE, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_DESCRIZIONE, PPQRY_CAP, "A.DESCRIZIONE_ABBREVIATA", "CAPDESCRABBR", 5, 40, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_LIST, 456, 84, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_IMPORTO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_IMPORTO, PPQRY_SERCOS1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_LIST, 568, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_LIST, 80);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_LIST, "Perc.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_FORM, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERC, MyGlb.PANEL_FORM, "Perc.");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_PERC, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_PERC, PPQRY_SERCOS1, "A.PERCENTUALE", "PERCENTUALE", 3, 5, 2, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_LIST, 612, 84, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_LIST, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 292, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_FORM, 128);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_DISPONIBILIT, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(((A.STN_INI_CO + A.VARIAZIONI_CO) * (1 - (NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(B.PERCENTUALE, 0)) ");
  SQL.append("from ");
  SQL.append("  SERCOS B ");
  SQL.append("where (B.ESERCIZIO = ~~ESERCIZIO~~) ");
  SQL.append("and   (B.E_S = ~~E_S~~) ");
  SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
  SQL.append("and   (B.ARTICOLO = ~~ARTICOLO~~) ");
  SQL.append("and   (B.TIPO = ~~TIPO~~) ");
  SQL.append("and   (B.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
  SQL.append("), 0) + NVL(~~PERCENTUALE~~, 0)) / 100)) - (NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(NVL(C.IMPORTO, 0)) ");
  SQL.append("from ");
  SQL.append("  SERCOS C ");
  SQL.append("where (C.ESERCIZIO = ~~ESERCIZIO~~) ");
  SQL.append("and   (C.E_S = ~~E_S~~) ");
  SQL.append("and   (C.CAPITOLO = ~~CAPITOLO~~) ");
  SQL.append("and   (C.ARTICOLO = ~~ARTICOLO~~) ");
  SQL.append("and   (C.TIPO = ~~TIPO~~) ");
  SQL.append("and   (C.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
  SQL.append("), 0) + NVL(~~IMPORTO~~, 0)), 0)");
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_DISPONIBILIT, PPQRY_DISPONIBILIT, SQL.toString(), "DISPONIBILIT", 2, 19, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 64, 48, 164, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 24, 0, 104, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 2);
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_VOCEPEGLABEL, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_LIST, 640, 36, 8, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_LIST, 12);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_LIST, "E.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 220, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_ESERCIZIO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_ESERCIZIO, PPQRY_SERCOS1, "A.ESERCIZIO", "ESERCIZIO", 3, 12, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_LIST, "SERV.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_FORM, 4, 316, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZIO, MyGlb.PANEL_FORM, "SERV.");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_SERVIZIO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_SERVIZIO, PPQRY_SERCOS1, "A.SERVIZIO", "SERVIZIO", 1, 3, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_FORM, 4, 244, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_TIPO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_TIPO, PPQRY_SERCOS1, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_UTENTEINSERI, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_UTENTEINSERI, PPQRY_SERCOS1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_DATAINSERIME, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_DATAINSERIME, PPQRY_SERCOS1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_UTENTULTIAGG, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_UTENTULTIAGG, PPQRY_SERCOS1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_DATAULTIMAGG, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_DATAULTIMAGG, PPQRY_SERCOS1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 316, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_PROGRESSIVO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_PROGRESSIVO, PPQRY_SERCOS1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_LIST, 804, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_LIST, 84);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_LIST, "CAPITOLO OLD");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_FORM, 4, 364, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_FORM, 84);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_CAPITOLOOLD, MyGlb.PANEL_FORM, "CAPIT. OLD");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_CAPITOLOOLD, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_CAPITOLOOLD, PPQRY_SERCOS1, "A.IMDSERCAPOLD", "IMDSERCAPOLD", 3, 16, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_LIST, 660, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_LIST, 84);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_LIST, "ARTICOLO OLD");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_FORM, 4, 388, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_FORM, 84);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_ARTICOLOOLD, MyGlb.PANEL_FORM, "ARTIC. OLD");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_ARTICOLOOLD, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_ARTICOLOOLD, PPQRY_SERCOS1, "A.IMDSERARTOLD", "IMDSERARTOLD", 1, 2, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_LIST, 660, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_LIST, 104);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_LIST, "PERCENTUALE OLD");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_FORM, 4, 412, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_FORM, 104);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_PERCENTUAOLD, MyGlb.PANEL_FORM, "PERCEN. OLD");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_PERCENTUAOLD, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_PERCENTUAOLD, PPQRY_SERCOS1, "A.IMDSERPEROLD", "IMDSERPEROLD", 3, 5, 2, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_LIST, 660, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_LIST, 80);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_LIST, "IMPORTO OLD");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_FORM, 4, 436, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_FORM, 80);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_IMPORTOOLD, MyGlb.PANEL_FORM, "IMP. OLD");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_IMPORTOOLD, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_IMPORTOOLD, PPQRY_SERCOS1, "A.IMDSERIMPOLD", "IMDSERIMPOLD", 3, 14, 2, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_LIST, 44);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_LIST, "STATO");
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_FORM, 4, 460, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_FORM, 44);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_STATO, MyGlb.PANEL_FORM, "STATO");
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_STATO, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_STATO, PPQRY_SERCOS1, "A.IMDBSERCSTAT", "IMDBSERCSTAT", 5, 1, 0, -13997);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_LIST, 0, 12, 664, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_LIST, 0);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_LIST, 1);
    PAN_ATTRIALSERVI.SetRect(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_FORM, 0, 12, 664, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTRIALSERVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_FORM, 0);
    PAN_ATTRIALSERVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTRIALSERVI_SERVIZILABEL, MyGlb.PANEL_FORM, 1);
    PAN_ATTRIALSERVI.SetFieldPage(PFL_ATTRIALSERVI_SERVIZILABEL, -1, -1);
    PAN_ATTRIALSERVI.SetFieldPanel(PFL_ATTRIALSERVI_SERVIZILABEL, -1, "", "SERVIZILABEL", 0, 0, 0, -13997);
  }

  private void PAN_ATTRIALSERVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ATTRIALSERVI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as CAPDESCRABBR ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_ATTRIALSERVI.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_ATTRIALSERVI.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ATTRIALSERVI.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(((A.STN_INI_CO + A.VARIAZIONI_CO) * (1 - (NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(B.PERCENTUALE, 0)) ");
    SQL.append("from ");
    SQL.append("  SERCOS B ");
    SQL.append("where (B.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.TIPO = ~~TIPO~~) ");
    SQL.append("and   (B.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
    SQL.append("), 0) + NVL(~~PERCENTUALE~~, 0)) / 100)) - (NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(C.IMPORTO, 0)) ");
    SQL.append("from ");
    SQL.append("  SERCOS C ");
    SQL.append("where (C.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (C.E_S = ~~E_S~~) ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (C.TIPO = ~~TIPO~~) ");
    SQL.append("and   (C.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
    SQL.append("), 0) + NVL(~~IMPORTO~~, 0)), 0) as DISPONIBILIT ");
    SQL.append("from ");
    SQL.append("  BILBPR A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = NVL(" + IDL.CSql(MainFrm.CONTROSERCOS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E')) ");
    PAN_ATTRIALSERVI.SetQuery(PPQRY_DISPONIBILIT, 0, SQL, -1, "");
    PAN_ATTRIALSERVI.SetQueryDB(PPQRY_DISPONIBILIT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ATTRIALSERVI.SetMasterTable(PPQRY_DISPONIBILIT, "BILBPR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOVOCEPEG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CAPITOLO~~ IS NULL)) AND NOT ((~~ARTICOLO~~ IS NULL))) ");
    PAN_ATTRIALSERVI.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_ATTRIALSERVI.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ATTRIALSERVI.SetMasterTable(PPQRY_INFO, "DUAL");
    PAN_ATTRIALSERVI.SetIMDB(IMDB, "PQRY_SERCOS1", true);
    PAN_ATTRIALSERVI.set_SetString(MyGlb.MASTER_ROWNAME, "SERCOS");
    PAN_ATTRIALSERVI.SetQueryIMDB(PPQRY_SERCOS1, IMDBDef9.PQRY_SERCOS1_RS, IMDBDef2.TBL_IMDBSERCOS);
    JustLoaded = true;
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_ES, IMDBDef2.FLD_IMDBSERCOS_E_S);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_CAPITOLO, IMDBDef2.FLD_IMDBSERCOS_CAPITOLO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_ARTICOLO, IMDBDef2.FLD_IMDBSERCOS_ARTICOLO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_IMPORTO, IMDBDef2.FLD_IMDBSERCOS_IMPORTO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_PERC, IMDBDef2.FLD_IMDBSERCOS_PERCENTUALE);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_ESERCIZIO, IMDBDef2.FLD_IMDBSERCOS_ESERCIZIO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_SERVIZIO, IMDBDef2.FLD_IMDBSERCOS_SERVIZIO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_TIPO, IMDBDef2.FLD_IMDBSERCOS_TIPO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_UTENTEINSERI, IMDBDef2.FLD_IMDBSERCOS_UTENTE_INSERIMENTO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_DATAINSERIME, IMDBDef2.FLD_IMDBSERCOS_DATA_INSERIMENTO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_UTENTULTIAGG, IMDBDef2.FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_DATAULTIMAGG, IMDBDef2.FLD_IMDBSERCOS_DATA_ULTIMO_AGG);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_PROGRESSIVO, IMDBDef2.FLD_IMDBSERCOS_PROGRESSIVO);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_CAPITOLOOLD, IMDBDef2.FLD_IMDBSERCOS_IMDSERCAPOLD);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_ARTICOLOOLD, IMDBDef2.FLD_IMDBSERCOS_IMDSERARTOLD);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_PERCENTUAOLD, IMDBDef2.FLD_IMDBSERCOS_IMDSERPEROLD);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_IMPORTOOLD, IMDBDef2.FLD_IMDBSERCOS_IMDSERIMPOLD);
    PAN_ATTRIALSERVI.SetFieldPrimaryIndex(PFL_ATTRIALSERVI_STATO, IMDBDef2.FLD_IMDBSERCOS_IMDBSERCSTAT);
    PAN_ATTRIALSERVI.SetMasterTable(0, "IMDBSERCOS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ATTRIALSERVI.Status() == 2)
    {
      int oldListQBE = PAN_ATTRIALSERVI.iUseListQBE;
      PAN_ATTRIALSERVI.iUseListQBE = 0;
      PAN_ATTRIALSERVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ATTRIALSERVI.PanelCommand(Glb.PCM_FIND);
      PAN_ATTRIALSERVI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ATTRALSERBOO_MST_ATTALSERREPA_Init()
  {
    BUK_ATTRALSERBOO.InitMastro(BUK_ATTRALSERBOO_MST_ATTALSERREPA, 3, 21000, 29700, 1, 1, 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_MST_ATTALSERREPA, "D970EB05-D787-4319-943F-C7005FFD94CA");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_MST_ATTALSERREPA, "ATTALSERREPA");
    BUK_ATTRALSERBOO.InitMastroBox(BUK_ATTRALSERBOO_MST_ATTALSERREPA, BUK_ATTRALSERBOO_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_NUMEROPAGINA, "0C633B1B-FE41-429D-807C-D89E3A109375");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_NUMEROPAGINA, BUK_ATTRALSERBOO_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_NUMEROPAGINA, "B658C29A-8D67-4C91-A4E7-62A7E6AFF91B");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ATTRALSERBOO.InitMastroBox(BUK_ATTRALSERBOO_MST_ATTALSERREPA, BUK_ATTRALSERBOO_RPTBOX_TITOLO, 1000, 1000, 19000, 800, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_TITOLO, "49062BE7-2096-4791-A9D1-72845EE06AC9");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_TITOLO, "TITOLO");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_TITOLO, BUK_ATTRALSERBOO_SPAN_CAPIATTAISER, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Capitoli Attribuiti ai Servizi", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_CAPIATTAISER, "CAEC41CC-E9AF-4817-8E5B-68C41C3C5848");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_CAPIATTAISER, "CAPIATTAISER");
    BUK_ATTRALSERBOO.InitMastroBox(BUK_ATTRALSERBOO_MST_ATTALSERREPA, BUK_ATTRALSERBOO_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 800, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_PAGEHEADER, "13E2E2F8-4606-4EAD-9287-2FF6B9849641");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ATTRALSERBOO.InitMastroBox(BUK_ATTRALSERBOO_MST_ATTALSERREPA, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY, 1000, 2100, 19000, 26500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_PAGEBODY, "CA35387C-E218-4932-BB42-C7CD76DE7147");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_ATTRALSERBOO_RPT_ATTRALSERREP_InitQuery() { BUK_ATTRALSERBOO_RPT_ATTRALSERREP_InitQuery(true, true); }
  private void BUK_ATTRALSERBOO_RPT_ATTRALSERREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.SERVIZIO as SERVIZIO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as RECORVOCEPEG, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  B.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
      SQL.append("  A.PERCENTUALE as PERCENTUALE, ");
      SQL.append("  NVL(A.IMPORTO, ((C.STN_INI_CO + C.VARIAZIONI_CO) * A.PERCENTUALE) / 100) as RECORDIMPORT, ");
      SQL.append("  C.STN_INI_CO + C.VARIAZIONI_CO as RECORDSTANZI, ");
      SQL.append("  (C.STN_INI_CO + C.VARIAZIONI_CO) * (1 - (NVL(( ");
      SQL.append("select ");
      SQL.append("  SUM(NVL(D.PERCENTUALE, 0)) ");
      SQL.append("from ");
      SQL.append("  SERCOS D ");
      SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (D.E_S = A.E_S) ");
      SQL.append("and   (D.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (D.TIPO = A.TIPO) ");
      SQL.append("), 0)) / 100) - NVL(( ");
      SQL.append("select ");
      SQL.append("  SUM(NVL(E.IMPORTO, 0)) ");
      SQL.append("from ");
      SQL.append("  SERCOS E ");
      SQL.append("where (E.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (E.E_S = A.E_S) ");
      SQL.append("and   (E.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (E.TIPO = A.TIPO) ");
      SQL.append("), 0) as RECORDDISPON ");
      SQL.append("from ");
      SQL.append("  SERCOS A, ");
      SQL.append("  CAP B, ");
      SQL.append("  BILBPR C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.SERVIZIO = ~~TBL_PARAMETRI252.PARAMSERVIZI~~) ");
      SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI252.PARAMTIPO~~) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (C.E_S = A.E_S) ");
      SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.TIPO = NVL(" + IDL.CSql(MainFrm.CONTROSERCOS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E')) ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO ");
      BUK_ATTRALSERBOO.SetReportQuery(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "A6A79147-691B-4C33-976E-C510B6660759");
      if (BUK_ATTRALSERBOO.FindObjByID(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE) != null)
        BUK_ATTRALSERBOO.AddReportGroup(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, "E_S");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ATTRALSERBOO_RPT_ATTRALSERREP_Init()
  {
    BUK_ATTRALSERBOO.InitReport(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, 196865);
    BUK_ATTRALSERBOO_RPT_ATTRALSERREP_InitQuery(true, false);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, "C69B4A80-8EC2-4FB9-AF75-1566AAFB94F6");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, "ATTRALSERREP");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_REPORTHEADER, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_REPORTHEADER, "47D5A768-D296-4270-9100-39177FA922F8");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_PAGEHEADER, "7FDE719D-74C5-4FC9-B380-0B223C16B1F4");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_ESHEADER, 0, 900, 1000, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_ESHEADER, "528AE3BE-4114-4188-8D94-6329F1CE92BD");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_ESHEADER, "ESHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_ESHEADER, BUK_ATTRALSERBOO_SPAN_ES1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "E/S", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_ES1, "7143E4D6-2C97-4C90-B303-3CBEB5938838");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_ES1, "ES1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_DESCRIHEADER, 4700, 900, 4400, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_DESCRIHEADER, "3991B8BB-E78E-4F95-91BF-5342CE19FB1F");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_DESCRIHEADER, BUK_ATTRALSERBOO_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_DESCRIZIONE1, "884E595A-23E0-4668-9184-5450CC357F00");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_STANZIHEADER, 9900, 900, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_STANZIHEADER, "FABCA97E-6D8B-4347-9438-DFFA154E2F1C");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_STANZIHEADER, "STANZIHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_STANZIHEADER, BUK_ATTRALSERBOO_SPAN_STANZIAMENT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Stanziamento", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_STANZIAMENT1, "A5C49E4B-0125-46FB-86B2-08750A1605F0");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_STANZIAMENT1, "STANZIAMENT1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_PERCENHEADER, 12500, 900, 900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_PERCENHEADER, "3C831999-A98E-4289-ACE5-2A514C00DC42");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_PERCENHEADER, "PERCENHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_PERCENHEADER, BUK_ATTRALSERBOO_SPAN_PERCENTUALE1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "%", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_PERCENTUALE1, "82181D28-F928-410B-A6B6-EB1BCCC81174");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_PERCENTUALE1, "PERCENTUALE1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_IMPORTHEADER, 13500, 900, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_IMPORTHEADER, "6140ADCA-B7A2-466C-925B-D6E93AB2EBAE");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_IMPORTHEADER, BUK_ATTRALSERBOO_SPAN_IMPORTO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_IMPORTO1, "5940EDAF-2262-4F28-BE07-50C21D7B0F30");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_IMPORTO1, "IMPORTO1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_DISPONHEADER, 16100, 900, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_DISPONHEADER, "5CF63D4D-137F-40E9-A6DB-6B08EC699B7A");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_DISPONHEADER, BUK_ATTRALSERBOO_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_DISPONIBILI1, "70A1345C-EC53-448C-A061-6DC248BCB77F");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_VOCEPEGHEADE, 1100, 900, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_VOCEPEGHEADE, "2AF0F1D5-9E67-4EA7-A191-BCAD4E5D24D5");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_VOCEPEGHEADE, BUK_ATTRALSERBOO_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_C, "B7836256-3255-4C01-B6D6-734F1F961AD0");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_C, "C");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_SERVIZHEADER, 100, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_SERVIZHEADER, "C3258684-6B4C-4BF2-99C2-016229681574");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_SERVIZHEADER, "SERVIZHEADER");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_SERVIZHEADER, BUK_ATTRALSERBOO_SPAN_SERVIZIO1, MyGlb.VIS_HEADSENZBOR1, 0, 0, 0, 271384961, "", "Servizio:", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_SERVIZIO1, "639D3D44-662E-4D1A-A90C-68D3CF4D0B42");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_SERVIZIO1, "SERVIZIO1");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_PAGEHEADER, BUK_ATTRALSERBOO_RPTBOX_SERVIZIO, 1700, 100, 17000, 500, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_SERVIZIO, "ADCF7BF2-4C74-4546-8F64-3E4A9D57B37B");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_SERVIZIO, "SERVIZIO");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_SERVIZIO, BUK_ATTRALSERBOO_SPAN_SERVIZIO, MyGlb.VIS_HEADSENZBOR1, 5, 142, 0, 271319169, "", "", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_SERVIZIO, "8A8E6924-A211-4A51-83C9-3EBFB5C99690");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_SERVIZIO, "SERVIZIO");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, "4340BDAB-9D5A-4FD4-B7D3-1E99120E650D");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, "ESGROUPHEADE");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_DETAIL, "D4302EBA-EA64-49A4-85AF-4FCAFD7F82FE");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_DETAIL, "DETAIL");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_ES, 0, 0, 1000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_ES, "0EC3117E-DB63-4E68-9AAD-E5C8B812B9E5");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_ES, "ES");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_ES, BUK_ATTRALSERBOO_SPAN_ES, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271319169, "", "::E_S", 1);
    BUK_ATTRALSERBOO.SetSpanValueListItem(BUK_ATTRALSERBOO_SPAN_ES, "Entrata", "Parte Entrata", (new IDVariant("E")), null, "", -1);
    BUK_ATTRALSERBOO.SetSpanValueListItem(BUK_ATTRALSERBOO_SPAN_ES, "Spesa", "Parte Spesa", (new IDVariant("S")), null, "", -1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_ES, "93D8FA5B-66E1-417F-8BDA-3CA9931CF5B9");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_ES, "ES");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_VOCEPEG, 1100, 0, 3500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_VOCEPEG, "685E84B6-4A71-4FB9-85F1-3BE658FC736A");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_VOCEPEG, BUK_ATTRALSERBOO_SPAN_CAPITOLO, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271319169, "", "::RECORVOCEPEG", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_CAPITOLO, "88131D0A-B621-409E-A335-93FA899A992A");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_CAPITOLO, "CAPITOLO");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_DESCRIZIONE, 4700, 0, 5100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_DESCRIZIONE, "6DEF01B4-75ED-480F-99AF-FFBACD8CDD75");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_DESCRIZIONE, BUK_ATTRALSERBOO_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271319169, "", "::DESCRIZIONE_ABBREVIATA", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_DESCRIZIONE, "5FA7A8C9-953D-4267-BDDE-D41BB68EDC05");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_STANZIAMENTO, 9900, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_STANZIAMENTO, "1322B26E-B36C-43E7-B383-77E182267444");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_STANZIAMENTO, "STANZIAMENTO");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_STANZIAMENTO, BUK_ATTRALSERBOO_SPAN_STANZIAMENTO, MyGlb.VIS_IMPORTO, 2, 19, 0, 271319425, "", "::RECORDSTANZI", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_STANZIAMENTO, "6AC0B32D-8E98-4454-9CE5-8A8543C34B23");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_STANZIAMENTO, "STANZIAMENTO");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_PERCENTUALE, 12500, 0, 900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_PERCENTUALE, "C2446086-23B3-4759-B75D-0069853979A4");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_PERCENTUALE, "PERCENTUALE");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_PERCENTUALE, BUK_ATTRALSERBOO_SPAN_PERCENTUALE, MyGlb.VIS_IMPORTO, 3, 5, 6, 271319169, "", "::PERCENTUALE", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_PERCENTUALE, "71253999-D010-40E4-B05C-9551FB11C833");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_PERCENTUALE, "PERCENTUALE");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_IMPORTO, 13500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_IMPORTO, "1E284A19-F2A1-433B-A97F-E8F18D803FAB");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_IMPORTO, "IMPORTO");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_IMPORTO, BUK_ATTRALSERBOO_SPAN_IMPORTO, MyGlb.VIS_IMPORTO, 2, 19, 0, 271319425, "", "::RECORDIMPORT", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_IMPORTO, "55B8820E-8D38-48CC-BC18-35B4062003E6");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_IMPORTO, "IMPORTO");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_DETAIL, BUK_ATTRALSERBOO_RPTBOX_DISPONIBILIT, 16100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_DISPONIBILIT, "4F2762EC-231F-4ACD-9D3C-A84B23847205");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_DISPONIBILIT, BUK_ATTRALSERBOO_SPAN_DISPONIBILIT, MyGlb.VIS_IMPORTO, 2, 19, 0, 271319425, "", "::RECORDDISPON", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_DISPONIBILIT, "E4D1B2C3-6A62-4239-97C3-B201D8607419");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, "50BA698C-0048-4E16-82CA-5D334F70D7EA");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, "ESGROUPFOOTE");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, BUK_ATTRALSERBOO_RPTBOX_TOTALEIMPORT, 13500, 200, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_TOTALEIMPORT, "C4F09E3D-B72A-4DBB-A403-EE0B9AA418BA");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_TOTALEIMPORT, "TOTALEIMPORT");
    BUK_ATTRALSERBOO.InitBoxSpan(BUK_ATTRALSERBOO_RPTBOX_TOTALEIMPORT, BUK_ATTRALSERBOO_SPAN_TOTALEIMPORT, MyGlb.VIS_IMPORTO, 2, 19, 0, 271319169, "", "", 1);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SPAN_TOTALEIMPORT, "9382EBB1-8F6F-470E-BBAD-D7CC3E0C6D8C");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SPAN_TOTALEIMPORT, "TOTALEIMPORT");
    BUK_ATTRALSERBOO.InitReportBox(BUK_ATTRALSERBOO_SEC_ESGROUPFOOTE, BUK_ATTRALSERBOO_RPTBOX_BARRASUPERIO, 13500, 100, 2500, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_RPTBOX_BARRASUPERIO, "A61B00E6-D300-4AFD-AACC-C85659ABB3F8");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_RPTBOX_BARRASUPERIO, "BARRASUPERIO");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_PAGEFOOTER, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_PAGEFOOTER, "855716AD-9DCC-4F25-9972-6AF5B52CA86D");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ATTRALSERBOO.InitSection(BUK_ATTRALSERBOO_RPT_ATTRALSERREP, BUK_ATTRALSERBOO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ATTRALSERBOO.SetSectionRendersInto(BUK_ATTRALSERBOO_SEC_REPORTFOOTER, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
    BUK_ATTRALSERBOO.SetRTCGuid(BUK_ATTRALSERBOO_SEC_REPORTFOOTER, "7903FFF2-C13C-4FC3-BD0D-E02825530EDC");
    BUK_ATTRALSERBOO.SetObjCode(BUK_ATTRALSERBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ATTRALSERBOO.AddReportGroup(BUK_ATTRALSERBOO_SEC_ESGROUPHEADE, "E_S");
    BUK_ATTRALSERBOO_RPT_ATTRALSERREP_InitQuery(false, true);
  }

  private void BUK_ATTRALSERBOO_InitLinks()
  {
    BUK_ATTRALSERBOO.SetBoxNextBox(BUK_ATTRALSERBOO_RPTBOX_PAGEBODY, BUK_ATTRALSERBOO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_OnChangeRow();
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
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ATTRIALSERVI) PAN_ATTRIALSERVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ATTRALSERBOO) BUK_ATTRALSERBOO_OnPreview();
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
