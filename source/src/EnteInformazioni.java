// **********************************************
// Ente Informazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EnteInformazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NEWTABBEVIEW;
  private static int GRP_DATIGENERALI_DATICERTIFIC = 0;
  private static int GRP_DATIGENERALI_ENTEVERSRITE = 1;

  private static int PFL_DATIGENERALI_DENOMINAZION = 0;
  private static int PFL_DATIGENERALI_INDIRIZZO = 1;
  private static int PFL_DATIGENERALI_COMUNE = 2;
  private static int PFL_DATIGENERALI_PROVINCIA = 3;
  private static int PFL_DATIGENERALI_PROVINCSIGLA = 4;
  private static int PFL_DATIGENERALI_CAP = 5;
  private static int PFL_DATIGENERALI_CODICEFISCAL = 6;
  private static int PFL_DATIGENERALI_PARTITAIVA = 7;
  private static int PFL_DATIGENERALI_TELEFOAZIEND = 8;
  private static int PFL_DATIGENERALI_FAXAZIENDALE = 9;
  private static int PFL_DATIGENERALI_MAILAZIENDAL = 10;
  private static int PFL_DATIGENERALI_CODICEEORI = 11;
  private static int PFL_DATIGENERALI_CODICEBDAP = 12;
  private static int PFL_DATIGENERALI_CODICEIPA = 13;
  private static int PFL_DATIGENERALI_CODIENTEMINI = 14;
  private static int PFL_DATIGENERALI_UNIONDICOMUN = 15;
  private static int PFL_DATIGENERALI_TIPOSUPPORTO = 16;
  private static int PFL_DATIGENERALI_CODICEUNIONE = 17;
  private static int PFL_DATIGENERALI_DATAINGRUNIO = 18;
  private static int PFL_DATIGENERALI_DATAUSCIUNIO = 19;
  private static int PFL_DATIGENERALI_TIPO = 20;
  private static int PFL_DATIGENERALI_DESCRIZIONE = 21;
  private static int PFL_DATIGENERALI_NEWPANELLAB1 = 22;
  private static int PFL_DATIGENERALI_ATTIVIPREVAL = 23;
  private static int PFL_DATIGENERALI_SEDEINPS = 24;
  private static int PFL_DATIGENERALI_UTENTEINSER1 = 25;
  private static int PFL_DATIGENERALI_DATAINSERIM1 = 26;
  private static int PFL_DATIGENERALI_UTENTULTIAG1 = 27;
  private static int PFL_DATIGENERALI_DATAULTIMAG1 = 28;

  private static int PPQRY_T65 = 0;


  IDPanel PAN_DATIGENERALI;
  private static int GRP_DATIXMLCCONT_DELIAPPRCONS = 0;

  private static int PFL_DATIXMLCCONT_NUMERO = 0;
  private static int PFL_DATIXMLCCONT_DATA = 1;
  private static int PFL_DATIXMLCCONT_NEWPANELLABE = 2;
  private static int PFL_DATIXMLCCONT_NUMERDIABITA = 3;
  private static int PFL_DATIXMLCCONT_SUPERFICIKMQ = 4;
  private static int PFL_DATIXMLCCONT_CODICEISTAT = 5;
  private static int PFL_DATIXMLCCONT_CODICEENTE = 6;
  private static int PFL_DATIXMLCCONT_ESERCIZIO = 7;
  private static int PFL_DATIXMLCCONT_UTENTEINSERI = 8;
  private static int PFL_DATIXMLCCONT_DATAINSERIME = 9;
  private static int PFL_DATIXMLCCONT_UTENTULTIAGG = 10;
  private static int PFL_DATIXMLCCONT_DATAULTIMAGG = 11;

  private static int PPQRY_XMLDATI1 = 0;


  IDPanel PAN_DATIXMLCCONT;
  CIDREObj BUK_DATIGENEBOOK;
  OBook BKW_DATIGENEBOOK;
  //
  // Template Pages constants
  private static int BUK_DATIGENEBOOK_MST_DATGENBOOPAG = 1;
  private static int BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1 = 2;
  private static int BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1 = 3;
  private static int BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1 = 4;

  //
  // Reports constants
  private static int BUK_DATIGENEBOOK_RPT_NEWREPORT = 5;
  private static int BUK_DATIGENEBOOK_SEC_REPORTHEADER = 6;
  private static int BUK_DATIGENEBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_DATIGENEBOOK_RPTBOX_NEWBOX = 8;
  private static int BUK_DATIGENEBOOK_SPAN_DATIDELLENTE = 9;
  private static int BUK_DATIGENEBOOK_SEC_DETAIL = 10;
  private static int BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU = 11;
  private static int BUK_DATIGENEBOOK_SPAN_DATICERTIFIC = 12;
  private static int BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO = 13;
  private static int BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE = 14;
  private static int BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER = 15;
  private static int BUK_DATIGENEBOOK_SPAN_DENOMINAZION = 16;
  private static int BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION = 17;
  private static int BUK_DATIGENEBOOK_SPAN_REDEENINDAG1 = 18;
  private static int BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER = 19;
  private static int BUK_DATIGENEBOOK_SPAN_INDIRIZZO = 20;
  private static int BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO = 21;
  private static int BUK_DATIGENEBOOK_SPAN_REINENINDAGB = 22;
  private static int BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER = 23;
  private static int BUK_DATIGENEBOOK_SPAN_COMUNE = 24;
  private static int BUK_DATIGENEBOOK_RPTBOX_COMUNE = 25;
  private static int BUK_DATIGENEBOOK_SPAN_RETCOENINDGB = 26;
  private static int BUK_DATIGENEBOOK_RPTBOX_PROVINCIA = 27;
  private static int BUK_DATIGENEBOOK_SPAN_REPRSIENIDGB = 28;
  private static int BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD = 29;
  private static int BUK_DATIGENEBOOK_SPAN_PROVINCIA = 30;
  private static int BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA = 31;
  private static int BUK_DATIGENEBOOK_SPAN_REPRENINDAGB = 32;
  private static int BUK_DATIGENEBOOK_RPTBOX_CAPHEADER = 33;
  private static int BUK_DATIGENEBOOK_SPAN_CAP = 34;
  private static int BUK_DATIGENEBOOK_RPTBOX_CAP = 35;
  private static int BUK_DATIGENEBOOK_SPAN_RETCAENINDGB = 36;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD = 37;
  private static int BUK_DATIGENEBOOK_SPAN_CODICEFISCAL = 38;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODFISCALE = 39;
  private static int BUK_DATIGENEBOOK_SPAN_RECOFIENIDGB = 40;
  private static int BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD = 41;
  private static int BUK_DATIGENEBOOK_SPAN_PARTITAIVA = 42;
  private static int BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA = 43;
  private static int BUK_DATIGENEBOOK_SPAN_REPAIVENIDGB = 44;
  private static int BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD = 45;
  private static int BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1 = 46;
  private static int BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND = 47;
  private static int BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE = 48;
  private static int BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD = 49;
  private static int BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1 = 50;
  private static int BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE = 51;
  private static int BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND = 52;
  private static int BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD = 53;
  private static int BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1 = 54;
  private static int BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL = 55;
  private static int BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN = 56;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD = 57;
  private static int BUK_DATIGENEBOOK_SPAN_T64CODICEOR1 = 58;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODICEEORI = 59;
  private static int BUK_DATIGENEBOOK_SPAN_T64CODICEORI = 60;
  private static int BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER = 61;
  private static int BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL = 62;
  private static int BUK_DATIGENEBOOK_RPTBOX_ATTIVITA = 63;
  private static int BUK_DATIGENEBOOK_SPAN_REATPRENIDGB = 64;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE = 65;
  private static int BUK_DATIGENEBOOK_SPAN_CODIENTEMINI = 66;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODENTE = 67;
  private static int BUK_DATIGENEBOOK_SPAN_RECOENMEIDGB = 68;
  private static int BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER = 69;
  private static int BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN = 70;
  private static int BUK_DATIGENEBOOK_RPTBOX_UNIONE = 71;
  private static int BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN = 72;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA = 73;
  private static int BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO = 74;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT = 75;
  private static int BUK_DATIGENEBOOK_SPAN_RETISUENIDGB = 76;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD = 77;
  private static int BUK_DATIGENEBOOK_SPAN_TIPO = 78;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI = 79;
  private static int BUK_DATIGENEBOOK_SPAN_RETIENINDAGB = 80;
  private static int BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER = 81;
  private static int BUK_DATIGENEBOOK_SPAN_DESCRIZIONE = 82;
  private static int BUK_DATIGENEBOOK_RPTBOX_ESATTORIA = 83;
  private static int BUK_DATIGENEBOOK_SPAN_REDEENINDAGB = 84;
  private static int BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD = 85;
  private static int BUK_DATIGENEBOOK_SPAN_SEDEINPS = 86;
  private static int BUK_DATIGENEBOOK_RPTBOX_SEDEINPS = 87;
  private static int BUK_DATIGENEBOOK_SPAN_RESEINENIDGB = 88;
  private static int BUK_DATIGENEBOOK_SEC_PAGEFOOTER = 89;
  private static int BUK_DATIGENEBOOK_RPTBOX_FOOTER = 90;
  private static int BUK_DATIGENEBOOK_SPAN_PAGECOUNT = 91;
  private static int BUK_DATIGENEBOOK_SEC_REPORTFOOTER = 92;

  CIDREObj BUK_DATXMLCCONBO;
  OBook BKW_DATXMLCCONBO;
  //
  // Template Pages constants
  private static int BUK_DATXMLCCONBO_MST_DATXMCCOBOPA = 1;
  private static int BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER = 2;
  private static int BUK_DATXMLCCONBO_RPTBOX_PAGEBODY = 3;
  private static int BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER = 4;

  //
  // Reports constants
  private static int BUK_DATXMLCCONBO_RPT_NEWREPORT = 5;
  private static int BUK_DATXMLCCONBO_SEC_REPORTHEADER = 6;
  private static int BUK_DATXMLCCONBO_SEC_PAGEHEADER = 7;
  private static int BUK_DATXMLCCONBO_RPTBOX_TITOLO = 8;
  private static int BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT = 9;
  private static int BUK_DATXMLCCONBO_SEC_DETAIL = 10;
  private static int BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO = 11;
  private static int BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS = 12;
  private static int BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE = 13;
  private static int BUK_DATXMLCCONBO_SPAN_NUMERO = 14;
  private static int BUK_DATXMLCCONBO_RPTBOX_DELIBERACC = 15;
  private static int BUK_DATXMLCCONBO_SPAN_RENUENIDXCCB = 16;
  private static int BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA = 17;
  private static int BUK_DATXMLCCONBO_SPAN_DATA = 18;
  private static int BUK_DATXMLCCONBO_RPTBOX_DATADELCC = 19;
  private static int BUK_DATXMLCCONBO_SPAN_REDAENIDXCCB = 20;
  private static int BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER = 21;
  private static int BUK_DATXMLCCONBO_SPAN_ABITANTI = 22;
  private static int BUK_DATXMLCCONBO_RPTBOX_ABITANTI = 23;
  private static int BUK_DATXMLCCONBO_SPAN_REABENIDXCCB = 24;
  private static int BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER = 25;
  private static int BUK_DATXMLCCONBO_SPAN_SUPERFICIE = 26;
  private static int BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE = 27;
  private static int BUK_DATXMLCCONBO_SPAN_RESUENIDXCCB = 28;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD = 29;
  private static int BUK_DATXMLCCONBO_SPAN_CODICEISTAT = 30;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT = 31;
  private static int BUK_DATXMLCCONBO_SPAN_RECOIEIDXCCB = 32;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD = 33;
  private static int BUK_DATXMLCCONBO_SPAN_CODICEENTE = 34;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODICEENTE = 35;
  private static int BUK_DATXMLCCONBO_SPAN_RECOEEIDXCCB = 36;
  private static int BUK_DATXMLCCONBO_SEC_PAGEFOOTER = 37;
  private static int BUK_DATXMLCCONBO_RPTBOX_PAGE = 38;
  private static int BUK_DATXMLCCONBO_SPAN_TSDXCCBEIPNT = 39;
  private static int BUK_DATXMLCCONBO_SEC_REPORTFOOTER = 40;


  // Definition of Global Variables
  private IDVariant TEMP1 = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T65(IMDB);
    Init_PQRY_XMLDATI1(IMDB);
    Init_PQRY_T92(IMDB);
    Init_PQRY_XMLDATI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T65(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T65, 30);
    IMDB.set_TblCode(IMDBDef9.PQRY_T65, "PQRY_T65");
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_INDIRIZZO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_COMUNE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DES_PROVINCIA, "DES_PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DES_PROVINCIA,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_COD_FISCALE, "COD_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_COD_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_PARTITA_IVA,3,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECTCOENMIMI, "RECTCOENMIMI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECTCOENMIMI,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UNIONE, "UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UNIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_SUPPORTO_CERT, "TIPO_SUPPORTO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_SUPPORTO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_ATTIVITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_ESATTORIA, "TIPO_ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_ESATTORIA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_MO, "TIPO_MO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TIPO_MO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_SE_INC_PAGAM, "SE_INC_PAGAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_SE_INC_PAGAM,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_SEDE_INPS, "SEDE_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_SEDE_INPS,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_ESATTORIA, "ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_ESATTORIA,5,37,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_CODICE_EORI, "CODICE_EORI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_CODICE_EORI,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_MAIL_AZIENDALE, "MAIL_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_MAIL_AZIENDALE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_FAX_AZIENDALE, "FAX_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_FAX_AZIENDALE,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TELEFONO_AZIENDALE, "TELEFONO_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_TELEFONO_AZIENDALE,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODBDA, "RECT64CODBDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODBDA,5,18,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODIPA, "RECT64CODIPA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODIPA,5,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODUNI, "RECT64CODUNI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64CODUNI,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64DAINUN, "RECT64DAINUN");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64DAINUN,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64DAUSUN, "RECT64DAUSUN");
    IMDB.SetFldParams(IMDBDef9.PQRY_T65,IMDBDef9.PQSL_T65_RECT64DAUSUN,8,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T65, 0);
  }

  private static void Init_PQRY_XMLDATI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_XMLDATI1, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_XMLDATI1, "PQRY_XMLDATI1");
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DELIBERA_CC, "DELIBERA_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DELIBERA_CC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_DEL_CC, "DATA_DEL_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_DEL_CC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_SUPERFICIE, "SUPERFICIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_SUPERFICIE,3,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_CODICE_ISTAT, "CODICE_ISTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_CODICE_ISTAT,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_CODICE_ENTE, "CODICE_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_CODICE_ENTE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI1,IMDBDef9.PQSL_XMLDATI1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_XMLDATI1, 0);
  }

  private static void Init_PQRY_T92(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T92, 21);
    IMDB.set_TblCode(IMDBDef9.PQRY_T92, "PQRY_T92");
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_INDIRIZZO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COMUNE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_DES_PROVINCIA, "DES_PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_DES_PROVINCIA,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COD_FISCALE, "COD_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COD_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_PARTITA_IVA,3,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COD_ENTE, "COD_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_COD_ENTE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_UNIONE, "UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_UNIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_SUPPORTO_CERT, "TIPO_SUPPORTO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_SUPPORTO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_ATTIVITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_ESATTORIA, "TIPO_ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_ESATTORIA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_MO, "TIPO_MO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_TIPO_MO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_SE_INC_PAGAM, "SE_INC_PAGAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_SE_INC_PAGAM,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_SEDE_INPS, "SEDE_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_SEDE_INPS,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_ESATTORIA, "ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_ESATTORIA,5,37,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64TELAZI, "RECT64TELAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64TELAZI,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64FAXAZI, "RECT64FAXAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64FAXAZI,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64MAIAZI, "RECT64MAIAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64MAIAZI,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64CODEOR, "RECT64CODEOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_T92,IMDBDef9.PQSL_T92_RECT64CODEOR,5,20,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T92, 0);
  }

  private static void Init_PQRY_XMLDATI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_XMLDATI, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_XMLDATI, "PQRY_XMLDATI");
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_DELIBERA_CC, "DELIBERA_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_DELIBERA_CC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_DATA_DEL_CC, "DATA_DEL_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_DATA_DEL_CC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_SUPERFICIE, "SUPERFICIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_SUPERFICIE,3,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_CODICE_ISTAT, "CODICE_ISTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_CODICE_ISTAT,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_CODICE_ENTE, "CODICE_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_CODICE_ENTE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI,IMDBDef9.PQSL_XMLDATI_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_XMLDATI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EnteInformazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EnteInformazioni()
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
    FormIdx = MyGlb.FRM_ENTEINFORMAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "381A84FD-2A21-44D8-A42E-64719160B672";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 542;
    set_Caption(new IDVariant("Ente Informazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 516;
    Frames[1].Caption = "New Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 516;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[1].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "ED71ADDF-7C11-4FE6-9096-0F58042D90A9";
    TAB_NEWTABBEVIEW.SetItemCount(2);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Dati Generali";
    Frames[2].Parent = this;
    PAN_DATIGENERALI = new IDPanel(w, this, 2, "PAN_DATIGENERALI");
    Frames[2].Content = PAN_DATIGENERALI;
    PAN_DATIGENERALI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATIGENERALI.VS = MainFrm.VisualStyleList;
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 516-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_DATIGENEBOOK != null)
      PAN_DATIGENERALI.SetBook(BUK_DATIGENEBOOK);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0A2EC8C3-3DE0-4B90-8A3F-C0FB69899E6F");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2708, 174, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATIGENERALI.InitStatus = 2;
    PAN_DATIGENERALI_Init();
    PAN_DATIGENERALI_InitFields();
    PAN_DATIGENERALI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[2], 0, "", "Dati Generali", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Dati XML C Conti";
    Frames[3].Parent = this;
    PAN_DATIXMLCCONT = new IDPanel(w, this, 3, "PAN_DATIXMLCCONT");
    Frames[3].Content = PAN_DATIXMLCCONT;
    PAN_DATIXMLCCONT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATIXMLCCONT.VS = MainFrm.VisualStyleList;
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 516-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_DATXMLCCONBO != null)
      PAN_DATIXMLCCONT.SetBook(BUK_DATXMLCCONBO);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "636F4A2E-4194-4087-AFA2-5CE6AC819977");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 968, 370, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATIXMLCCONT.InitStatus = 2;
    PAN_DATIXMLCCONT_Init();
    PAN_DATIXMLCCONT_InitFields();
    PAN_DATIXMLCCONT_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[3], 0, "", "Dati XML C Conti", "");
    BKW_DATIGENEBOOK = new OBook(this);
    BUK_DATIGENEBOOK = new CIDREObj(BKW_DATIGENEBOOK);
    BKW_DATIGENEBOOK.iGuid = "3ADB44BD-5C90-4A78-85C1-6BFFCC49ABAB";
    BKW_DATIGENEBOOK.Code = "BUK_DATIGENEBOOK";
    BKW_DATIGENEBOOK.BookObj = BUK_DATIGENEBOOK;
    BKW_DATIGENEBOOK.InitDefMasks();
    BUK_DATIGENEBOOK.InitBook(1, 1245185, "Dati Generali Book", IMDB, MainFrm.VisualStyleList);
    BUK_DATIGENEBOOK.InitHTML();
    BUK_DATIGENEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DATIGENEBOOK.Book.SetMainFrm(MainFrm);
    BUK_DATIGENEBOOK.SetRTCGuid(0, "3ADB44BD-5C90-4A78-85C1-6BFFCC49ABAB");
    BUK_DATIGENEBOOK.SetObjCode(0, "DATIGENEBOOK");
    if (PAN_DATIGENERALI != null)
      PAN_DATIGENERALI.SetBook(BUK_DATIGENEBOOK);
    BUK_DATIGENEBOOK_MST_DATGENBOOPAG_Init();
    BUK_DATIGENEBOOK_RPT_NEWREPORT_Init();
    BUK_DATIGENEBOOK_InitLinks();
    BKW_DATXMLCCONBO = new OBook(this);
    BUK_DATXMLCCONBO = new CIDREObj(BKW_DATXMLCCONBO);
    BKW_DATXMLCCONBO.iGuid = "6A3D14A1-B173-4C72-AC3B-86FE801702BA";
    BKW_DATXMLCCONBO.Code = "BUK_DATXMLCCONBO";
    BKW_DATXMLCCONBO.BookObj = BUK_DATXMLCCONBO;
    BKW_DATXMLCCONBO.InitDefMasks();
    BUK_DATXMLCCONBO.InitBook(1, 1245185, "Dati XML C Conti Book", IMDB, MainFrm.VisualStyleList);
    BUK_DATXMLCCONBO.InitHTML();
    BUK_DATXMLCCONBO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DATXMLCCONBO.Book.SetMainFrm(MainFrm);
    BUK_DATXMLCCONBO.SetRTCGuid(0, "6A3D14A1-B173-4C72-AC3B-86FE801702BA");
    BUK_DATXMLCCONBO.SetObjCode(0, "DATXMLCCONBO");
    if (PAN_DATIXMLCCONT != null)
      PAN_DATIXMLCCONT.SetBook(BUK_DATXMLCCONBO);
    BUK_DATXMLCCONBO_MST_DATXMCCOBOPA_Init();
    BUK_DATXMLCCONBO_RPT_NEWREPORT_Init();
    BUK_DATXMLCCONBO_InitLinks();
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
      PAN_DATIGENERALI.UpdatePanel(MainFrm);
      PAN_DATIXMLCCONT.UpdatePanel(MainFrm);
      // BUK_DATIGENEBOOK.UpdateBook();
      // BUK_DATXMLCCONBO.UpdateBook();
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
    if (Code.equals("BUK_DATIGENEBOOK")) return BUK_DATIGENEBOOK;
    if (Code.equals("BUK_DATXMLCCONBO")) return BUK_DATXMLCCONBO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof EnteInformazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EnteInformazioni.class.getName() : (Glb.ClassWithPackage(EnteInformazioni.class) ? EnteInformazioni.class.getName().substring(EnteInformazioni.class.getPackage().getName().length() + 1) : EnteInformazioni.class.getName()));
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
    IDVariant v_DATIXMLCONTI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DATIXMLCONTI = (new IDVariant("Dati XML C. Conti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_DATIGENERALI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIGENERALI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIGENERALI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIGENERALI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIXMLCCONT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIXMLCCONT.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIXMLCCONT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DATIXMLCCONT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Ente")), (new IDVariant(" - "))), (new IDVariant("Informazioni"))));
      Frames[PAN_DATIXMLCCONT.FrIndex].set_Caption(new IDVariant(v_DATIXMLCONTI).stringValue());
      TAB_NEWTABBEVIEW.SetItemCaption((new IDVariant(PAN_DATIXMLCCONT.FrIndex)).intValue(), v_DATIXMLCONTI.stringValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EnteInformazioni", "LoadEvent", _e);
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
      TEMP1 = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EnteInformazioni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Valorizzacampi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Valorizzacampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ABITANTI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SUPERFICIE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICEISTAT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Valorizzacampi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef9.PQRY_XMLDATI1, IMDBDef9.PQSL_XMLDATI1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ABITANTI as XMLDATIABITA, ");
      SQL.append("  A.SUPERFICIE as XMLDATISUPER, ");
      SQL.append("  A.CODICE_ISTAT as XMLDATCODIST ");
      SQL.append("from ");
      SQL.append("  XML_DATI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ABITANTI = QV.Get("XMLDATIABITA", IDVariant.INTEGER) ;
        v_SUPERFICIE = QV.Get("XMLDATISUPER", IDVariant.INTEGER) ;
        v_CODICEISTAT = QV.Get("XMLDATCODIST", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_ABITANTI.compareTo((new IDVariant()), true)!=0)
      {
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI1, IMDBDef9.PQSL_XMLDATI1_ABITANTI, 0, new IDVariant(v_ABITANTI));
      }
      if (v_SUPERFICIE.compareTo((new IDVariant()), true)!=0)
      {
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI1, IMDBDef9.PQSL_XMLDATI1_SUPERFICIE, 0, new IDVariant(new IDVariant(v_SUPERFICIE),IDVariant.DECIMAL));
      }
      if (v_CODICEISTAT.compareTo((new IDVariant()), true)!=0)
      {
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI1, IMDBDef9.PQSL_XMLDATI1_CODICE_ISTAT, 0, new IDVariant(v_CODICEISTAT));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EnteInformazioni", "Valorizzacampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dati Generali On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATIGENERALI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DATIGENERALI);
      // 
      // Dati Generali On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_T65, IMDBDef9.PQSL_T65_UNIONE, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DATIGENERALI.SetFlags (Glb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EnteInformazioni", "DatiGeneraliOnDynamicProperties", _e);
    }
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
  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATIGENERALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATIGENERALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATIGENERALI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATIGENERALI, Cancel);
    // Stub
  }

  private void PAN_DATIGENERALI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DATIGENERALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATIGENERALI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATIGENERALI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATIXMLCCONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATIXMLCCONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATIXMLCCONT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATIXMLCCONT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATIXMLCCONT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATIXMLCCONT);
    // Stub
  }

  private void PAN_DATIXMLCCONT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DATIXMLCCONT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATIXMLCCONT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATIXMLCCONT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_DATIGENEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_DATIGENEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_DATIGENEBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_DATIGENEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_DATIGENEBOOK_SEC_DETAIL)
    {
      BUK_DATIGENEBOOK.set_SpanValue(BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, new IDVariant(IDL.NullValue(BUK_DATIGENEBOOK.GetReportColumn(BUK_DATIGENEBOOK_RPT_NEWREPORT, "UNIONE"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_DATIGENEBOOK_SEC_PAGEFOOTER)
    {
      BUK_DATIGENEBOOK.set_SpanValue(BUK_DATIGENEBOOK_SPAN_PAGECOUNT, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_DATIGENEBOOK.GetPageNumber()))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_DATIGENEBOOK.GetTotalPagesNumber()))))));
    }
    if (SectionID==BUK_DATIGENEBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_DATIGENEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_DATIGENEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_DATIGENEBOOK_MST_DATGENBOOPAG)
    {
    }
  }

  private void BUK_DATIGENEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_DATIGENEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_DATIGENEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_DATIGENEBOOK_OnPreview()
  {
    PreviewBook = BKW_DATIGENEBOOK;
    SetRD();
  }

  private void BUK_DATXMLCCONBO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_DATXMLCCONBO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_DATXMLCCONBO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_DATXMLCCONBO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_DATXMLCCONBO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_DATXMLCCONBO_SEC_PAGEFOOTER)
    {
      BUK_DATXMLCCONBO.set_SpanValue(BUK_DATXMLCCONBO_SPAN_TSDXCCBEIPNT, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_DATXMLCCONBO.GetPageNumber()))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_DATXMLCCONBO.GetTotalPagesNumber()))))));
    }
    if (SectionID==BUK_DATXMLCCONBO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_DATXMLCCONBO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_DATXMLCCONBO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_DATXMLCCONBO_MST_DATXMCCOBOPA)
    {
    }
  }

  private void BUK_DATXMLCCONBO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_DATXMLCCONBO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_DATXMLCCONBO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_DATXMLCCONBO_OnPreview()
  {
    PreviewBook = BKW_DATXMLCCONBO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATIGENERALI_Init()
  {

    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "118DAED1-23D7-47FC-9628-6C7318E357F9");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "Dati Certificati");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.PANEL_LIST, 0, -9999, 144, 16, 0, 0);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.PANEL_FORM, 8, 239, 476, 73, 0, 0);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0, 81);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 1, 13);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0, 4);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 1, 4);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "BCB567F9-48CC-497E-B571-457DC29C64E6");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "Ente Versamento Ritenute");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.PANEL_LIST, 0, -9999, 196, 16, 0, 0);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.PANEL_FORM, 8, 319, 476, 73, 0, 0);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0, 149);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 1, 13);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0, 4);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 1, 4);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "4F7636A3-7CFC-468B-B301-19A407652014");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "Denominazione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "1ABA28DD-DF4F-48EA-9300-1975960B4825");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "Indirizzo");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "9AEF3A29-A400-419D-87A7-D584A6223EA3");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "Comune");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "79A24D5A-10C3-4F78-88E2-865183DC81C1");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "Provincia");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "7CDBA5C0-CF73-4C38-A258-EE7688930C81");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "Provincia_sigla");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "09B3554F-5A54-45A5-9A0E-7FE5C68D77AC");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "CAP");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "4793CE59-AB93-4B28-B55E-748E6193CC6E");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "Codice Fiscale");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "0EE901DC-EE1B-4F1A-ACB6-8506B31FC6E0");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "Partita IVA");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "57CE3E9C-E7CA-48FA-8B90-212993818D54");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "Telefono");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "7B31E9F9-A74B-4B7D-9146-384914A01BE4");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "Fax");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "70E85A02-0EC3-43A8-A781-BC254AD6844D");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "E-Mail");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "8A59C6B5-759F-457F-A0DF-49B95D512BFA");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "Codice EORI");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "14F7E253-D9A5-4746-A15B-5370629E523E");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "Codice BDAP");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "7E9EA51C-76D6-4D05-AD27-9EC6F1AF16B4");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "Codice IPA");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "89603184-45D0-4ECB-99C5-CDD7E90130C1");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "Codice Ente Ministero");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "7256B66D-3C2D-4E97-95EB-D9E2D9FAFBEB");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "Unione di Comuni");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.VIS_CHECKSTYLE);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "C9D107D5-E581-4B5A-9DCD-01E1307FFB33");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "Tipo Supporto");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "DE0C61EE-14CD-4B57-A536-CF44D21EBB8E");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "Codice Unione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "3AC023A6-CABD-4ADF-9F3E-FD51F2C66407");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "Inizio");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "BE95412C-5E38-43F8-81CD-7A03F6C7E5FE");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "Fine");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "8DEE83CE-E526-45A1-9EB1-02F7BCBAD70A");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "Tipo");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "DE824BED-1EF3-4917-8C4D-B17AF424D5D4");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "Descrizione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, "39A4DEF6-6B19-4740-AC1C-229DBF2A4D37");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "886E01C2-D5D6-4F71-A76F-933F0FFE7022");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "Attività prevalente");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "37A014D5-029C-4DB8-8790-1E7164921F1F");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "Sede INPS");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "A8B19A6F-2923-4450-9F67-46B3786F9E8A");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "A2FDEACB-5F3E-46D7-8BC5-6196ABC85AFB");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "5F0BFAE7-275F-4E4B-A112-9406A83E953D");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, "54F71956-02AC-487D-ADF1-0E66E043DF0B");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DATIGENERALI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_LIST, "Denominazione");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 4, 0, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, "Denominazione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DENOMINAZION, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DENOMINAZION, PPQRY_T65, "A.DENOMINAZIONE", "DENOMINAZIONE", 5, 40, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 208, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 64);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 4, 24, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, "Indirizzo");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_INDIRIZZO, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_INDIRIZZO, PPQRY_T65, "A.INDIRIZZO", "INDIRIZZO", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 368, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 48);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, "Comune");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 4, 48, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, "Comune");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_COMUNE, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_COMUNE, PPQRY_T65, "A.COMUNE", "COMUNE", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 88);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, "Provincia");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 4, 72, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, "Provincia");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PROVINCIA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PROVINCIA, PPQRY_T65, "A.DES_PROVINCIA", "DES_PROVINCIA", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 528, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 64);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, "Provincia sigla");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 276, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, "Prov. sigla");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PROVINCSIGLA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PROVINCSIGLA, PPQRY_T65, "A.PROVINCIA", "PROVINCIA", 5, 2, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 28);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, "CAP");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 392, 72, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 32);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, "CAP");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CAP, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CAP, PPQRY_T65, "A.CAP", "CAP", 1, 5, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 76);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 96, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEFISCAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEFISCAL, PPQRY_T65, "A.COD_FISCALE", "COD_FISCALE", 5, 16, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 312, 96, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 88);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PARTITAIVA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PARTITAIVA, PPQRY_T65, "A.PARTITA_IVA", "PARTITA_IVA", 3, 11, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, "Telefono");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, 24, 120, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, 84);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, "Telefono");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TELEFOAZIEND, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TELEFOAZIEND, PPQRY_T65, "A.TELEFONO_AZIENDALE", "TELEFONO_AZIENDALE", 5, 12, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, "Fax");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 268, 120, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, "Fax");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_FAXAZIENDALE, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_FAXAZIENDALE, PPQRY_T65, "A.FAX_AZIENDALE", "FAX_AZIENDALE", 5, 12, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, "E-Mail");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 4, 144, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, "E-Mail");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_MAILAZIENDAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_MAILAZIENDAL, PPQRY_T65, "A.MAIL_AZIENDALE", "MAIL_AZIENDALE", 5, 50, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, "Codice EORI");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 28, 168, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, "Codice EORI");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEEORI, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEEORI, PPQRY_T65, "A.CODICE_EORI", "CODICE_EORI", 5, 20, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 84);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, "Codice BDAP");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 24, 192, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 84);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, "Codice BDAP");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEBDAP, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEBDAP, PPQRY_T65, "A.CODICE_BDAP", "RECT64CODBDA", 5, 18, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, "Codice IPA");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 36, 216, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, "Codice IPA");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEIPA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEIPA, PPQRY_T65, "A.CODICE_IPA", "RECT64CODIPA", 5, 15, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 60);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, "C. E. Min.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 12, 264, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 132);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, "Codice Ente Ministero");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODIENTEMINI, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODIENTEMINI, PPQRY_T65, "A.COD_ENTE_MI", "RECTCOENMIMI", 3, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 48);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, "U. d. C.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 324, 264, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 108);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, "Unione di Comuni");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UNIONDICOMUN, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UNIONDICOMUN, PPQRY_T65, "A.UNIONE", "UNIONE", 5, 2, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_UNIONDICOMUN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_UNIONDICOMUN, (new IDVariant()), "Null", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, "Tipo Supporto");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 16, 288, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, "Tipo Supporto");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TIPOSUPPORTO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TIPOSUPPORTO, PPQRY_T65, "A.TIPO_SUPPORTO_CERT", "TIPO_SUPPORTO_CERT", 5, 1, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPOSUPPORTO, (new IDVariant("C")), "CD", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPOSUPPORTO, (new IDVariant()), "Floppy-disk", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, "Codice Unione");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 48, 288, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, "Codice Unione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEUNIONE, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEUNIONE, PPQRY_T65, "A.CODICE_UNIONE", "RECT64CODUNI", 5, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 144);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, "Inizio");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 240, 288, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 40);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, "Inizio");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAINGRUNIO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAINGRUNIO, PPQRY_T65, "A.DATA_INGRESSO_UNIONE", "RECT64DAINUN", 6, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, "Fine");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 368, 288, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 32);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, "Fine");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAUSCIUNIO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAUSCIUNIO, PPQRY_T65, "A.DATA_USCITA_UNIONE", "RECT64DAUSUN", 8, 19, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 92);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 44, 344, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 64);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TIPO, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TIPO, PPQRY_T65, "A.TIPO_ESATTORIA", "TIPO_ESATTORIA", 5, 1, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant("T")), "Tesoreria Prov. Stato", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant("C")), "Concessionario", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 68);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 368, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DESCRIZIONE, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DESCRIZIONE, PPQRY_T65, "A.ESATTORIA", "ESATTORIA", 5, 37, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 276, 224, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 468, 352, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_NEWPANELLAB1, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 56);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, "Attiv. preval.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 4, 396, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 116);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, "Attività prevalente");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_ATTIVIPREVAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_ATTIVIPREVAL, PPQRY_T65, "A.ATTIVITA", "ATTIVITA", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 60);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, "Sede INPS");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 212, 396, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 68);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, "Sede INPS");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_SEDEINPS, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_SEDEINPS, PPQRY_T65, "A.SEDE_INPS", "SEDE_INPS", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 432, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UTENTEINSER1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UTENTEINSER1, PPQRY_T65, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 188, 434, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAINSERIM1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAINSERIM1, PPQRY_T65, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 12, 456, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UTENTULTIAG1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UTENTULTIAG1, PPQRY_T65, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 196, 456, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAULTIMAG1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAULTIMAG1, PPQRY_T65, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_DATIGENERALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATIGENERALI.SetIMDB(IMDB, "PQRY_T65", true);
    PAN_DATIGENERALI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DENOMINAZIONE as DENOMINAZIONE, ");
    SQL.append("  A.INDIRIZZO as INDIRIZZO, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  A.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.DES_PROVINCIA as DES_PROVINCIA, ");
    SQL.append("  A.CAP as CAP, ");
    SQL.append("  A.COD_FISCALE as COD_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.COD_ENTE_MI as RECTCOENMIMI, ");
    SQL.append("  A.UNIONE as UNIONE, ");
    SQL.append("  A.TIPO_SUPPORTO_CERT as TIPO_SUPPORTO_CERT, ");
    SQL.append("  A.ATTIVITA as ATTIVITA, ");
    SQL.append("  A.TIPO_ESATTORIA as TIPO_ESATTORIA, ");
    SQL.append("  A.TIPO_MO as TIPO_MO, ");
    SQL.append("  A.SE_INC_PAGAM as SE_INC_PAGAM, ");
    SQL.append("  A.SEDE_INPS as SEDE_INPS, ");
    SQL.append("  A.ESATTORIA as ESATTORIA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.CODICE_EORI as CODICE_EORI, ");
    SQL.append("  A.MAIL_AZIENDALE as MAIL_AZIENDALE, ");
    SQL.append("  A.FAX_AZIENDALE as FAX_AZIENDALE, ");
    SQL.append("  A.TELEFONO_AZIENDALE as TELEFONO_AZIENDALE, ");
    SQL.append("  A.CODICE_BDAP as RECT64CODBDA, ");
    SQL.append("  A.CODICE_IPA as RECT64CODIPA, ");
    SQL.append("  A.CODICE_UNIONE as RECT64CODUNI, ");
    SQL.append("  A.DATA_INGRESSO_UNIONE as RECT64DAINUN, ");
    SQL.append("  A.DATA_USCITA_UNIONE as RECT64DAUSUN ");
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T64 A ");
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T65, 5, SQL, -1, "");
    PAN_DATIGENERALI.SetQueryDB(PPQRY_T65, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATIGENERALI.SetMasterTable(0, "T64");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATIGENERALI.Status() == 2)
    {
      int oldListQBE = PAN_DATIGENERALI.iUseListQBE;
      PAN_DATIGENERALI.iUseListQBE = 0;
      PAN_DATIGENERALI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATIGENERALI.PanelCommand(Glb.PCM_FIND);
      PAN_DATIGENERALI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DATIXMLCCONT_Init()
  {

    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "872A39FC-C2D8-4EC5-B19B-6599C5EC48D8");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "Delibera Approvazione Consuntivo");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.PANEL_FORM, 68, 11, 228, 89, 0, 0);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0, 194);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 1, 13);
    PAN_DATIXMLCCONT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0, 4);
    PAN_DATIXMLCCONT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 1, 4);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "E59EEB68-0E9E-4D0B-A256-BF51D02B4673");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "Numero");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "6F591B72-442D-43E4-8B53-1E7CAF6FF9D1");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "Data");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, "8C27714C-F236-4745-AF52-DF1E73C98C70");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "EA4C5AB9-ED3E-409D-9755-216DC4999832");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "Numero di Abitanti");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "5ACFA6B4-FA5E-4412-91B0-4566AC798425");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "5A07907E-FE8B-4B7B-AA1E-CC27D7FB1C6B");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "Codice Istat");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "7CF6C876-FBF1-4905-9FA0-122B1B2370B5");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "Codice Ente");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "4D7F26E9-F02F-4124-ABD9-6425EF5FDA2A");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "ESERCIZIO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "A9595E88-719F-4C55-847E-2FDBD4409D29");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "4522A9CE-440D-400C-8AF5-E34F0CC905B9");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "539DC480-BF40-45A6-8DC1-6FEAC9BC98E0");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, "D99D3C47-8FA6-4DCE-92D2-75B649081E6A");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DATIXMLCCONT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_LIST, 76);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 72, 48, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NUMERO, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NUMERO, PPQRY_XMLDATI1, "A.DELIBERA_CC", "DELIBERA_CC", 1, 5, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 76);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 84, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 40);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATA, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATA, PPQRY_XMLDATI1, "A.DATA_DEL_CC", "DATA_DEL_CC", 6, 19, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 188, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 280, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NEWPANELLABE, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 56);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, "Num. di Abitanti");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 56, 120, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, "Numero di Abitanti");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NUMERDIABITA, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NUMERDIABITA, PPQRY_XMLDATI1, "A.ABITANTI", "ABITANTI", 1, 7, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 68);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 64, 144, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 112);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_SUPERFICIKMQ, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_SUPERFICIKMQ, PPQRY_XMLDATI1, "A.SUPERFICIE", "SUPERFICIE", 3, 7, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 80);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, "Codice Istat");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 80, 168, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 96);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, "Codice Istat");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_CODICEISTAT, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_CODICEISTAT, PPQRY_XMLDATI1, "A.CODICE_ISTAT", "CODICE_ISTAT", 5, 6, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 76);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, "Codice Ente");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 80, 192, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 96);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, "Codice Ente");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_CODICEENTE, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_CODICEENTE, PPQRY_XMLDATI1, "A.CODICE_ENTE", "CODICE_ENTE", 5, 10, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 248, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_ESERCIZIO, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_ESERCIZIO, PPQRY_XMLDATI1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 20, 240, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_UTENTEINSERI, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_UTENTEINSERI, PPQRY_XMLDATI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATAINSERIME, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATAINSERIME, PPQRY_XMLDATI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 32, 300, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_UTENTULTIAGG, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_UTENTULTIAGG, PPQRY_XMLDATI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 16, 328, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATAULTIMAGG, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATAULTIMAGG, PPQRY_XMLDATI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_DATIXMLCCONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATIXMLCCONT.SetIMDB(IMDB, "PQRY_XMLDATI1", true);
    PAN_DATIXMLCCONT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DELIBERA_CC as DELIBERA_CC, ");
    SQL.append("  A.DATA_DEL_CC as DATA_DEL_CC, ");
    SQL.append("  A.ABITANTI as ABITANTI, ");
    SQL.append("  A.SUPERFICIE as SUPERFICIE, ");
    SQL.append("  A.CODICE_ISTAT as CODICE_ISTAT, ");
    SQL.append("  A.CODICE_ENTE as CODICE_ENTE, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  XML_DATI A ");
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI1, 5, SQL, -1, "");
    PAN_DATIXMLCCONT.SetQueryDB(PPQRY_XMLDATI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATIXMLCCONT.SetMasterTable(0, "XML_DATI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATIXMLCCONT.Status() == 2)
    {
      int oldListQBE = PAN_DATIXMLCCONT.iUseListQBE;
      PAN_DATIXMLCCONT.iUseListQBE = 0;
      PAN_DATIXMLCCONT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATIXMLCCONT.PanelCommand(Glb.PCM_FIND);
      PAN_DATIXMLCCONT.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_DATIGENEBOOK_MST_DATGENBOOPAG_Init()
  {
    BUK_DATIGENEBOOK.InitMastro(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, "635C390C-DDC6-4C99-9624-CD44E67428DC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, "DATGENBOOPAG");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, "D7589BE7-D4D1-430F-A0E4-2D682E547D38");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, 1000, 3000, 19000, 22700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, "B5DA8D87-086B-4F22-A8FE-2F0159B51DBC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1, "97C3B3A7-5B1D-4C66-8D89-9C28EACE6564");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery() { BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DENOMINAZIONE as DENOMINAZIONE, ");
      SQL.append("  A.INDIRIZZO as INDIRIZZO, ");
      SQL.append("  A.COMUNE as COMUNE, ");
      SQL.append("  A.PROVINCIA as PROVINCIA, ");
      SQL.append("  A.DES_PROVINCIA as DES_PROVINCIA, ");
      SQL.append("  A.CAP as CAP, ");
      SQL.append("  A.COD_FISCALE as COD_FISCALE, ");
      SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
      SQL.append("  A.COD_ENTE as COD_ENTE, ");
      SQL.append("  A.UNIONE as UNIONE, ");
      SQL.append("  A.TIPO_SUPPORTO_CERT as TIPO_SUPPORTO_CERT, ");
      SQL.append("  A.ATTIVITA as ATTIVITA, ");
      SQL.append("  A.TIPO_ESATTORIA as TIPO_ESATTORIA, ");
      SQL.append("  A.TIPO_MO as TIPO_MO, ");
      SQL.append("  A.SE_INC_PAGAM as SE_INC_PAGAM, ");
      SQL.append("  A.SEDE_INPS as SEDE_INPS, ");
      SQL.append("  A.ESATTORIA as ESATTORIA, ");
      SQL.append("  A.TELEFONO_AZIENDALE as RECT64TELAZI, ");
      SQL.append("  A.FAX_AZIENDALE as RECT64FAXAZI, ");
      SQL.append("  A.MAIL_AZIENDALE as RECT64MAIAZI, ");
      SQL.append("  A.CODICE_EORI as RECT64CODEOR ");
      SQL.append("from ");
      SQL.append("  T64 A ");
      BUK_DATIGENEBOOK.SetReportQuery(BUK_DATIGENEBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D02F2F79-DE54-4023-BF21-131C17887ACE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DATIGENEBOOK_RPT_NEWREPORT_Init()
  {
    BUK_DATIGENEBOOK.InitReport(BUK_DATIGENEBOOK_RPT_NEWREPORT, 196609);
    BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPT_NEWREPORT, "68FD2E8D-2B12-475B-90C6-25C698D76DEF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_REPORTHEADER, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_REPORTHEADER, "D5D2FC13-8864-46D8-B755-206274000AE3");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_PAGEHEADER, BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_PAGEHEADER, "13877C60-966D-4D92-913B-AA54974EA010");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_PAGEHEADER, BUK_DATIGENEBOOK_RPTBOX_NEWBOX, 0, 0, 19000, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, "851ECB7C-04AB-420E-B25A-0F6B11B5E1F7");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Dati dell'Ente", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, "5CB0A6FC-5715-4E3E-AB38-548BB0D1F4A4");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, "DATIDELLENTE");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_DETAIL, 10700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_DETAIL, "CE6D9691-2BD9-4C4A-B2E1-2366759DB990");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_DETAIL, "DETAIL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, 100, 5400, 10300, 2000, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, "F5D7FADC-2BF0-4709-84F4-451CE754B2E5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, "DATICERTGROU");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Dati Certificati", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, "34852F7D-27F2-42DA-BAB5-6C7C0F5C7B94");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, "DATICERTIFIC");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, 100, 7500, 10300, 2100, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, "94D09CFB-FAAE-43C4-A855-95220D306846");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, "ENTVERRITGRO");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Ente Versamento Ritenute", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, "9D15C8AF-55E0-41DC-8F49-090E9F0E1C31");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, "ENTEVERSRITE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, 100, 300, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, "BE1CC354-B1F8-419B-A7BD-6BE77B96ACE6");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, "DENOMIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, BUK_DATIGENEBOOK_SPAN_DENOMINAZION, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Denominazione", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DENOMINAZION, "0236888C-CEFA-4EBA-912D-7EE167CFC3FF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DENOMINAZION, "DENOMINAZION");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, 2900, 300, 8237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, "EE3E1471-757D-44B3-80E5-C05CFCF93A35");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, "DENOMINAZION");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, BUK_DATIGENEBOOK_SPAN_REDEENINDAG1, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DENOMINAZIONE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REDEENINDAG1, "D3A9E657-7E27-4A89-A524-A805F4C5CE10");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REDEENINDAG1, "REDEENINDAG1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, 100, 900, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, "F80355A5-2598-4B39-8FB7-52E6BEFF65C1");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, "INDIRIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, BUK_DATIGENEBOOK_SPAN_INDIRIZZO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Indirizzo", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_INDIRIZZO, "BC581F38-728B-41E9-BDA5-D4E692000797");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_INDIRIZZO, "INDIRIZZO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, 2900, 900, 4837, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, "1ECC2876-602D-4ABA-A677-67B083E7DDAF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, "INDIRIZZO");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, BUK_DATIGENEBOOK_SPAN_REINENINDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::INDIRIZZO", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REINENINDAGB, "AE4A9150-F996-4237-9CF1-B95A17BAE60F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REINENINDAGB, "REINENINDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, 100, 1500, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, "6EDD9D6F-E2F1-454A-89A3-6C67AA50C62D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, "COMUNEHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, BUK_DATIGENEBOOK_SPAN_COMUNE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Comune", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_COMUNE, "7EFACC3E-A095-42A3-94F8-39AD6AE22E8D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_COMUNE, "COMUNE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_COMUNE, 2900, 1500, 8237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_COMUNE, "7E544579-E714-4C85-B4CF-5A29208FA503");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_COMUNE, "COMUNE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_COMUNE, BUK_DATIGENEBOOK_SPAN_RETCOENINDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::COMUNE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETCOENINDGB, "2416FF9D-A5FF-43E7-BB99-3320B337AE5C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETCOENINDGB, "RETCOENINDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, 6900, 2200, 400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, "6589D7F6-DD43-45D6-B734-B2F032FAFEC2");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, "PROVINCIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, BUK_DATIGENEBOOK_SPAN_REPRSIENIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::PROVINCIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPRSIENIDGB, "2784EF2A-71B5-4AAB-8090-6EE62C510A2C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPRSIENIDGB, "REPRSIENIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, 100, 2200, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, "4043E373-C8B7-48A4-B1B7-87B7C20F3925");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, "DESPROVIHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, BUK_DATIGENEBOOK_SPAN_PROVINCIA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Provincia", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PROVINCIA, "5F07E069-A98D-4016-AAD6-E75E78D2528E");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PROVINCIA, "PROVINCIA");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, 2900, 2200, 3437, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, "925C9A4A-B3E7-4933-A75C-CE21029CF3AE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, "DESPROVINCIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, BUK_DATIGENEBOOK_SPAN_REPRENINDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DES_PROVINCIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPRENINDAGB, "10917A14-CC69-474D-8703-15970B414FF4");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPRENINDAGB, "REPRENINDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, 8400, 2200, 693, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, "BED42ACF-73F9-426E-AB7B-3E023D48DC5D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, "CAPHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, BUK_DATIGENEBOOK_SPAN_CAP, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "CAP", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CAP, "36BC2DA5-BEAA-4A2F-8F78-D08094166501");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CAP, "CAP");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CAP, 9200, 2200, 1146, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CAP, "D6F01F58-530E-437B-9961-083A42B7DD5F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CAP, "CAP");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CAP, BUK_DATIGENEBOOK_SPAN_RETCAENINDGB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::CAP", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETCAENINDGB, "C8C5A05F-487B-4E28-B739-C6C405C20C6A");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETCAENINDGB, "RETCAENINDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, 100, 2800, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, "8B3DE28C-254A-44C3-AB49-39EF759EC2D7");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, "CODFISCAHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Fiscale", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, "DD4E946B-6A99-4466-97C9-6D8BE4374CF9");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, 2900, 2800, 2237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, "90BBACF6-63E9-46E7-909C-9DBBBD7B4C4D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, "CODFISCALE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, BUK_DATIGENEBOOK_SPAN_RECOFIENIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::COD_FISCALE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RECOFIENIDGB, "B0E13AE2-164F-4BFE-A82B-FB4BFD359744");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RECOFIENIDGB, "RECOFIENIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, 6600, 2800, 1892, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, "6513CDC8-3254-435A-A104-E5ACA6F06CE3");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, "PARTIIVAHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, BUK_DATIGENEBOOK_SPAN_PARTITAIVA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Partita IVA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PARTITAIVA, "EC12860C-4636-4261-AB7F-E22A6C8D5BBA");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PARTITAIVA, "PARTITAIVA");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, 8600, 2800, 1781, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, "0BEA6512-9973-4A11-82EC-BCE4994D7097");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, "PARTITAIVA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, BUK_DATIGENEBOOK_SPAN_REPAIVENIDGB, MyGlb.VIS_DEFAREPOSTYL, 3, 11, 6, 271384705, "Brief description of field content.", "::PARTITA_IVA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPAIVENIDGB, "7EA9F817-2E3C-4037-A5F4-E26E50A2B795");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPAIVENIDGB, "REPAIVENIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, 100, 3400, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, "A78AC8C3-703C-4993-B215-C59C8630E147");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, "TELEAZIEHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Telefono", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, "D4C74956-CAA1-4EC5-A0E0-C92329C21ADC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, "T64TELEFAZI1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, 2900, 3400, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, "C7B4631C-5D3C-4615-972A-B3D681B496AE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, "TELEFOAZIEND");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, MyGlb.VIS_DEFAREPOSTYL, 5, 12, 0, 271384705, "", "::RECT64TELAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, "ACDEC1BD-A1FC-495C-AADA-503DAFCE3210");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, "T64TELEFAZIE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, 6600, 3400, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, "314BA1CE-1879-4FDA-B78B-3EA01F410E1B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, "FAXAZIENHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Fax", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, "723447B8-B1FC-44A0-85C9-D52C876D35B5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, "T64FAXAZIEN1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, 8600, 3400, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, "78F579D6-399B-40BC-AEEF-6EE3A3470A78");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, "FAXAZIENDALE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, MyGlb.VIS_DEFAREPOSTYL, 5, 12, 0, 271384705, "", "::RECT64FAXAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, "D36C8E33-766C-4462-8B05-A75E0BBF9736");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, "T64FAXAZIEND");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, 100, 4100, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, "2691C5DA-5E28-436E-91BF-E83BAD961692");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, "MAILAZIEHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Mail", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, "9EEF97F6-861A-41D0-8CB8-80A40CCE7EEF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, "T64MAILAZIE1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, 2900, 4100, 8200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, "7DF61719-06DA-4891-86E2-0FFBB89933A5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, "MAILAZIENDAL");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::RECT64MAIAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, "89EA9941-9D96-47A8-9DC7-5CC4EDED6ADD");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, "T64MAILAZIEN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, 100, 4700, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, "675EB209-AD9A-4E56-913B-EB0DC01B2991");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, "CODIEORIHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Codice EORI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, "4097EF23-B4E6-4E13-930B-3DA4E52E0E87");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, "T64CODICEOR1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, 2900, 4700, 4000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, "7295C3BF-4DC5-4BB9-90AF-869A0C845BED");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, "CODICEEORI");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, BUK_DATIGENEBOOK_SPAN_T64CODICEORI, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::RECT64CODEOR", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64CODICEORI, "30A660AA-8A45-4528-86D1-79F9A8A04C32");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64CODICEORI, "T64CODICEORI");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, 100, 10100, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, "43782E0A-2A9A-4AA8-8BBE-8588AB9E9435");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, "ATTIVIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Attività prevalente", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, "BEC8938E-9606-43BB-898C-CE56EDCC1639");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, "ATTIVIPREVAL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, 3000, 10100, 996, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, "7986F5BD-FEAB-443E-AD77-EC161623A858");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, "ATTIVITA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, BUK_DATIGENEBOOK_SPAN_REATPRENIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Brief description of field content.", "::ATTIVITA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REATPRENIDGB, "376A4892-124E-4623-BD0B-0050E0A7EEC3");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REATPRENIDGB, "REATPRENIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, 200, 6100, 2942, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, "87D4A526-9C20-4FFE-B08D-6B1230FB0DBB");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, "CODENTEHEADE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Ente Ministero", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, "F9CE55AF-122E-4F78-81B3-B2D284FAAB42");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, "CODIENTEMINI");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODENTE, 3300, 6100, 1673, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODENTE, "A8E6BB4B-5631-4ADF-AF20-4CCE827B13F0");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODENTE, "CODENTE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODENTE, BUK_DATIGENEBOOK_SPAN_RECOENMEIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384705, "Brief description of field content.", "::COD_ENTE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RECOENMEIDGB, "0CA63AA1-2E80-499A-8FEE-F7C25CDE8657");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RECOENMEIDGB, "RECOENMEIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, 7200, 6100, 2357, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, "7B7AC0F2-BAD7-4C1D-94E0-B0EDFDE6C4AD");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, "UNIONEHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Unione di Comuni", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, "FDF3FCBF-6D5A-441B-9649-533DFF085EB8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, "UNIONDICOMUN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_UNIONE, 9700, 6200, 500, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_UNIONE, "91AA8BF5-C26C-47BD-A4F3-41D37A5A2684");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_UNIONE, "UNIONE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_UNIONE, BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, "24682BEE-D6CB-419B-8436-E765FDA6F1F7");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_NVRUDCEIDGBN, "NVRUDCEIDGBN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, 200, 6700, 2942, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, "3B61D7C7-38A8-4CAA-9BE7-DB8760E6A419");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, "TIPSUPCERHEA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Tipo Supporto", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, "9F2C1BEE-FC90-448C-83B4-BBF948526592");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, "TIPOSUPPORTO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, 3300, 6700, 2273, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, "8DE3B5C8-9B0E-4A3B-8CB9-7C4F15211FF5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, "TIPOSUPPCERT");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, BUK_DATIGENEBOOK_SPAN_RETISUENIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO_SUPPORTO_CERT", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETISUENIDGB, "CD", "", (new IDVariant("C")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETISUENIDGB, "Floppy-disk", "", (new IDVariant()), null, "", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETISUENIDGB, "68AEA625-AE02-447D-8ECB-0E1E67B0F8FA");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETISUENIDGB, "RETISUENIDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, 200, 8100, 1536, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, "EAF4F7B8-8B7A-4CE9-ABB8-542E3A93D365");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, "TIPOESATHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, BUK_DATIGENEBOOK_SPAN_TIPO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Tipo", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_TIPO, "5639E9ED-271E-4DAC-88D9-72ACBEFA9DEC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_TIPO, "TIPO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, 2000, 8100, 4743, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, "9B35FA02-85FE-4A73-BA31-E162D647DCC4");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, "TIPOESATTORI");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::TIPO_ESATTORIA", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, "Tesoreria Prov. Stato", "", (new IDVariant("T")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, "Concessionario", "", (new IDVariant("C")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, "(nulla)", "Type the value and explain what it means.", (new IDVariant()), null, "", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, "877DE220-0BAA-4D53-9574-FE91C4978E2A");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETIENINDAGB, "RETIENINDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, 200, 8800, 1642, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, "7438C291-7CBF-44EB-8357-21568C6DECAF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, "ESATTOHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, "E8D8A91F-F999-4449-B7C9-C83A44DB2CEF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, 2000, 8800, 4743, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, "50906030-CA00-4157-A1C9-08329EDC3A0C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, "ESATTORIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, BUK_DATIGENEBOOK_SPAN_REDEENINDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 37, 0, 271384705, "Brief description of field content.", "::ESATTORIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REDEENINDAGB, "BE297C15-63D2-408F-A7EE-F43551AEAFCD");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REDEENINDAGB, "REDEENINDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, 4800, 10100, 1497, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, "261F6A85-7310-49E5-B245-9E9C8E8C9235");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, "SEDEINPSHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, BUK_DATIGENEBOOK_SPAN_SEDEINPS, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Sede INPS", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_SEDEINPS, "C286CDD3-5FEF-4128-BE36-6E558EBE134E");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_SEDEINPS, "SEDEINPS");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, 6400, 10100, 4004, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, "25027DC5-3F12-43EF-B87C-679970B2801B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, "SEDEINPS");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, BUK_DATIGENEBOOK_SPAN_RESEINENIDGB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::SEDE_INPS", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RESEINENIDGB, "F80D44D1-BDE3-4146-ADDE-67D8486359E1");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RESEINENIDGB, "RESEINENIDGB");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, "EB2BEC80-FBC7-456C-AB28-5D48ED47704F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, BUK_DATIGENEBOOK_RPTBOX_FOOTER, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FOOTER, "B0AA7A96-3177-4310-997D-E865A7DFB02A");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FOOTER, "FOOTER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FOOTER, BUK_DATIGENEBOOK_SPAN_PAGECOUNT, MyGlb.VIS_CAMSENBORCEN, 5, 201, 0, 271319169, "", "", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PAGECOUNT, "74B61BB5-7A5E-461F-9A12-7EC163CCD2D8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PAGECOUNT, "PAGECOUNT");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_REPORTFOOTER, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_REPORTFOOTER, "E9837F77-EA9F-4DBE-A36E-4A21A6BD004C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_DATIGENEBOOK_InitLinks()
  {
    BUK_DATIGENEBOOK.SetBoxNextBox(BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_DATXMLCCONBO_MST_DATXMCCOBOPA_Init()
  {
    BUK_DATXMLCCONBO.InitMastro(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, "D636A31C-D8C4-42CA-AD36-8F7519E7BCE0");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, "DATXMCCOBOPA");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, "7A032EA7-1765-4E62-9C67-FBC3755C1970");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, 1000, 3000, 19000, 22700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, "ECFC47CF-4A50-4EE2-813C-06004DE4CB11");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER, "99DC9A44-48A6-4E32-9E63-E41B8F02BC94");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery() { BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DELIBERA_CC as DELIBERA_CC, ");
      SQL.append("  A.DATA_DEL_CC as DATA_DEL_CC, ");
      SQL.append("  A.ABITANTI as ABITANTI, ");
      SQL.append("  A.SUPERFICIE as SUPERFICIE, ");
      SQL.append("  A.CODICE_ISTAT as CODICE_ISTAT, ");
      SQL.append("  A.CODICE_ENTE as CODICE_ENTE, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO ");
      SQL.append("from ");
      SQL.append("  XML_DATI A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      BUK_DATXMLCCONBO.SetReportQuery(BUK_DATXMLCCONBO_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "A700BB23-C0C8-4F47-A8FE-3AB41FC76D33");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DATXMLCCONBO_RPT_NEWREPORT_Init()
  {
    BUK_DATXMLCCONBO.InitReport(BUK_DATXMLCCONBO_RPT_NEWREPORT, 196609);
    BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery(true, false);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPT_NEWREPORT, "68487E16-0B3F-4446-9227-9574F5C09FB6");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPT_NEWREPORT, "NEWREPORT");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_REPORTHEADER, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_REPORTHEADER, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_REPORTHEADER, "6FF73BD1-DFB2-4371-8B77-DA8A04E2F8D1");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_PAGEHEADER, BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_PAGEHEADER, "72D0FF0B-01F4-4625-9E8C-2F97AFFF9F1C");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_PAGEHEADER, BUK_DATXMLCCONBO_RPTBOX_TITOLO, 0, 0, 18900, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_TITOLO, "931F524A-33F6-42F1-BDA0-01D69EE4110F");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_TITOLO, "TITOLO");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_TITOLO, BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Dati XML C. Conti", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, "DE901F02-DB55-404B-8F06-0B47CB9E2851");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, "DATIXMLCCONT");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_DETAIL, 5500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_DETAIL, "7AEB0AA6-017C-429F-A110-463F822D48B1");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_DETAIL, "DETAIL");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, 100, 100, 5800, 2400, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, "BA32FE95-B446-4032-AB2F-1509BAB7743D");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, "DELAPPCONGRO");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Delibera Approvazione Consuntivo", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, "EEE446B7-87B9-4D17-9846-8EFBEC3E9880");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, "DELIAPPRCONS");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, 400, 1100, 1195, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, "E01B2BFA-BC62-4F67-A911-3F954FF4E2EE");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, "DELIBCCHEADE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, BUK_DATXMLCCONBO_SPAN_NUMERO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Numero", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_NUMERO, "88C44BE8-6C65-4482-BF4B-E1A6B44829A7");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_NUMERO, "NUMERO");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, 1700, 1100, 1020, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, "7EFB8C2A-70DA-4067-BC67-91FBA2A51908");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, "DELIBERACC");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, BUK_DATXMLCCONBO_SPAN_RENUENIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::DELIBERA_CC", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RENUENIDXCCB, "EB5788C0-C109-4CAE-B1D6-AEC04488D96A");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RENUENIDXCCB, "RENUENIDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, 400, 1900, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, "5A538DE9-734A-4E02-8F09-EC1A14E6F120");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, "DATADELCCHEA");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, BUK_DATXMLCCONBO_SPAN_DATA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DATA, "36BF9E2C-8E29-4F1F-8DFD-B27227E4BAF2");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DATA, "DATA");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DATADELCC, 1700, 1900, 2000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, "6FEA6B33-3A23-408F-AE70-8316D0A64906");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, "DATADELCC");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, BUK_DATXMLCCONBO_SPAN_REDAENIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::DATA_DEL_CC", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_REDAENIDXCCB, "2923553E-97FB-4B0B-AB07-39F01F5F731E");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_REDAENIDXCCB, "REDAENIDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, 200, 2900, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, "D44DBDDD-0843-442C-A704-2B015532B7D7");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, "ABITANHEADER");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, BUK_DATXMLCCONBO_SPAN_ABITANTI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Abitanti", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_ABITANTI, "D0B9D558-D8D7-4834-8290-1271B1F5846C");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_ABITANTI, "ABITANTI");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_ABITANTI, 2300, 2900, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, "41497FD4-5A10-45DD-A6B7-AB8207D527BC");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, "ABITANTI");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, BUK_DATXMLCCONBO_SPAN_REABENIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 1, 7, 0, 271384705, "Brief description of field content.", "::ABITANTI", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_REABENIDXCCB, "276377C7-F99E-4A1F-90B9-7E96018F4C24");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_REABENIDXCCB, "REABENIDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, 200, 3600, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, "04993455-DA4F-4DD6-84AB-7FB8AF3A82B0");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, "SUPERFHEADER");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, BUK_DATXMLCCONBO_SPAN_SUPERFICIE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Superficie", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_SUPERFICIE, "1EB4D08D-357C-4EFB-B673-F2CE59EEE6E2");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_SUPERFICIE, "SUPERFICIE");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, 2300, 3600, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, "54E4E21D-AA8F-4A5C-82BF-B2AF997E435E");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, "SUPERFICIE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, BUK_DATXMLCCONBO_SPAN_RESUENIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 3, 7, 6, 271384705, "Brief description of field content.", "::SUPERFICIE", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RESUENIDXCCB, "65C0CAC3-3B0E-4A71-920C-266198223731");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RESUENIDXCCB, "RESUENIDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, 200, 4200, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, "A362331D-B57D-4AA7-8B31-55F22C943D16");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, "CODIISTAHEAD");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, BUK_DATXMLCCONBO_SPAN_CODICEISTAT, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Istat", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_CODICEISTAT, "E517A6AD-972A-4DC8-9BDF-C8528BFCCAC7");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_CODICEISTAT, "CODICEISTAT");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, 2300, 4200, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, "72964EFF-9867-42B4-BED5-8ED6AF06AB8A");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, "CODICEISTAT");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, BUK_DATXMLCCONBO_SPAN_RECOIEIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 6, 0, 271384705, "Brief description of field content.", "::CODICE_ISTAT", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RECOIEIDXCCB, "A151EB62-5FA1-4066-B467-4B0B60915889");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RECOIEIDXCCB, "RECOIEIDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, 200, 4800, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, "E629F86B-073A-4B4E-A2B3-6AA70CD95FBC");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, "CODIENTEHEAD");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, BUK_DATXMLCCONBO_SPAN_CODICEENTE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Ente", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_CODICEENTE, "7E242C63-91ED-4607-8675-6285C9897DEE");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_CODICEENTE, "CODICEENTE");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, 2300, 4800, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, "E2BC483C-5667-48D4-ACE8-52F58746E827");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, "CODICEENTE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, BUK_DATXMLCCONBO_SPAN_RECOEEIDXCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384705, "Brief description of field content.", "::CODICE_ENTE", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RECOEEIDXCCB, "4B0F8CDE-C954-4894-ABA6-62552C600881");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RECOEEIDXCCB, "RECOEEIDXCCB");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, "4CD87243-E618-4CF6-BA42-56B719902100");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGE, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGE, "DD92F035-234A-4AC4-87A3-0452DCC9CE1D");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGE, "PAGE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_PAGE, BUK_DATXMLCCONBO_SPAN_TSDXCCBEIPNT, MyGlb.VIS_CAMSENBORCEN, 5, 201, 0, 271384705, "", "", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_TSDXCCBEIPNT, "2D6E9363-7AD7-41BA-8E6C-A599852F7CA6");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_TSDXCCBEIPNT, "TSDXCCBEIPNT");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_REPORTFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_REPORTFOOTER, "9FCCB40C-D777-4457-8327-81B92CCDC1DB");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_DATXMLCCONBO_InitLinks()
  {
    BUK_DATXMLCCONBO.SetBoxNextBox(BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_ValidateRow(Cancel);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_DynamicProperties();
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NEWTABBEVIEW) TAB_NEWTABBEVIEW_Click(PreviousPage, Cancel);
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
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_DATIGENEBOOK) BUK_DATIGENEBOOK_OnPreview();
    if (SrcObj == BKW_DATXMLCCONBO) BUK_DATXMLCCONBO_OnPreview();
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
