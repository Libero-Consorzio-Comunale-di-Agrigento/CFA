// **********************************************
// Ente
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Ente extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NEWTABBEVIEW;
  private static int GRP_DATIGENERALI_FEATTIVA = 0;
  private static int GRP_DATIGENERALI_DATICERTIFIC = 1;
  private static int GRP_DATIGENERALI_ENTEVERSRITE = 2;

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
  private static int PFL_DATIGENERALI_SOGGETTINPUT = 14;
  private static int PFL_DATIGENERALI_SOGGETTOENTE = 15;
  private static int PFL_DATIGENERALI_ETICHELKPSOG = 16;
  private static int PFL_DATIGENERALI_CODIENTEMINI = 17;
  private static int PFL_DATIGENERALI_TIPOSUPPORTO = 18;
  private static int PFL_DATIGENERALI_UNIONDICOMUN = 19;
  private static int PFL_DATIGENERALI_CODICEUNIONE = 20;
  private static int PFL_DATIGENERALI_DATAINGRUNIO = 21;
  private static int PFL_DATIGENERALI_DATAUSCIUNIO = 22;
  private static int PFL_DATIGENERALI_TIPO = 23;
  private static int PFL_DATIGENERALI_DESCRIZIONE = 24;
  private static int PFL_DATIGENERALI_NEWPANELLAB1 = 25;
  private static int PFL_DATIGENERALI_ATTIVIPREVAL = 26;
  private static int PFL_DATIGENERALI_SEDEINPS = 27;
  private static int PFL_DATIGENERALI_UTENTEINSER1 = 28;
  private static int PFL_DATIGENERALI_DATAINSERIM1 = 29;
  private static int PFL_DATIGENERALI_UTENTULTIAG1 = 30;
  private static int PFL_DATIGENERALI_DATAULTIMAG1 = 31;

  private static int PPQRY_T90 = 0;

  private static int PPQRY_SOGGETTI = 1;


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

  private static int PPQRY_XMLDATI2 = 0;


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
  private static int BUK_DATIGENEBOOK_SPAN_REDEENDAGEB1 = 18;
  private static int BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER = 19;
  private static int BUK_DATIGENEBOOK_SPAN_INDIRIZZO = 20;
  private static int BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO = 21;
  private static int BUK_DATIGENEBOOK_SPAN_REINENDAGEBO = 22;
  private static int BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER = 23;
  private static int BUK_DATIGENEBOOK_SPAN_COMUNE = 24;
  private static int BUK_DATIGENEBOOK_RPTBOX_COMUNE = 25;
  private static int BUK_DATIGENEBOOK_SPAN_RETCOENDAGEB = 26;
  private static int BUK_DATIGENEBOOK_RPTBOX_PROVINCIA = 27;
  private static int BUK_DATIGENEBOOK_SPAN_REPRSIENDAGB = 28;
  private static int BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD = 29;
  private static int BUK_DATIGENEBOOK_SPAN_PROVINCIA = 30;
  private static int BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA = 31;
  private static int BUK_DATIGENEBOOK_SPAN_REPRENDAGEBO = 32;
  private static int BUK_DATIGENEBOOK_RPTBOX_CAPHEADER = 33;
  private static int BUK_DATIGENEBOOK_SPAN_CAP = 34;
  private static int BUK_DATIGENEBOOK_RPTBOX_CAP = 35;
  private static int BUK_DATIGENEBOOK_SPAN_RETCAENDAGEB = 36;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD = 37;
  private static int BUK_DATIGENEBOOK_SPAN_CODICEFISCAL = 38;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODFISCALE = 39;
  private static int BUK_DATIGENEBOOK_SPAN_RECOFIENDAGB = 40;
  private static int BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD = 41;
  private static int BUK_DATIGENEBOOK_SPAN_PARTITAIVA = 42;
  private static int BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA = 43;
  private static int BUK_DATIGENEBOOK_SPAN_REPAIVENDAGB = 44;
  private static int BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD = 45;
  private static int BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1 = 46;
  private static int BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND = 47;
  private static int BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE = 48;
  private static int BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD = 49;
  private static int BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1 = 50;
  private static int BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE = 51;
  private static int BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND = 52;
  private static int BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER = 53;
  private static int BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL = 54;
  private static int BUK_DATIGENEBOOK_RPTBOX_ATTIVITA = 55;
  private static int BUK_DATIGENEBOOK_SPAN_REATPRENDAGB = 56;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE = 57;
  private static int BUK_DATIGENEBOOK_SPAN_CODIENTEMINI = 58;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODENTE = 59;
  private static int BUK_DATIGENEBOOK_SPAN_RETCOEMMEDGB = 60;
  private static int BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER = 61;
  private static int BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN = 62;
  private static int BUK_DATIGENEBOOK_RPTBOX_UNIONE = 63;
  private static int BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN = 64;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA = 65;
  private static int BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO = 66;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT = 67;
  private static int BUK_DATIGENEBOOK_SPAN_RETISUENDAGB = 68;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD = 69;
  private static int BUK_DATIGENEBOOK_SPAN_TIPO = 70;
  private static int BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI = 71;
  private static int BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO = 72;
  private static int BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER = 73;
  private static int BUK_DATIGENEBOOK_SPAN_DESCRIZIONE = 74;
  private static int BUK_DATIGENEBOOK_RPTBOX_ESATTORIA = 75;
  private static int BUK_DATIGENEBOOK_SPAN_REDEENDAGEBO = 76;
  private static int BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD = 77;
  private static int BUK_DATIGENEBOOK_SPAN_SEDEINPS = 78;
  private static int BUK_DATIGENEBOOK_RPTBOX_SEDEINPS = 79;
  private static int BUK_DATIGENEBOOK_SPAN_RESEINENDAGB = 80;
  private static int BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD = 81;
  private static int BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1 = 82;
  private static int BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL = 83;
  private static int BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN = 84;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD = 85;
  private static int BUK_DATIGENEBOOK_SPAN_T64CODICEOR1 = 86;
  private static int BUK_DATIGENEBOOK_RPTBOX_CODICEEORI = 87;
  private static int BUK_DATIGENEBOOK_SPAN_T64CODICEORI = 88;
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
  private static int BUK_DATXMLCCONBO_SPAN_RENUENDAXCCB = 16;
  private static int BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA = 17;
  private static int BUK_DATXMLCCONBO_SPAN_DATA = 18;
  private static int BUK_DATXMLCCONBO_RPTBOX_DATADELCC = 19;
  private static int BUK_DATXMLCCONBO_SPAN_REDAENDAXCCB = 20;
  private static int BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER = 21;
  private static int BUK_DATXMLCCONBO_SPAN_ABITANTI = 22;
  private static int BUK_DATXMLCCONBO_RPTBOX_ABITANTI = 23;
  private static int BUK_DATXMLCCONBO_SPAN_REABENDAXCCB = 24;
  private static int BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER = 25;
  private static int BUK_DATXMLCCONBO_SPAN_SUPERFICIE = 26;
  private static int BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE = 27;
  private static int BUK_DATXMLCCONBO_SPAN_RESUENDAXCCB = 28;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD = 29;
  private static int BUK_DATXMLCCONBO_SPAN_CODICEISTAT = 30;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT = 31;
  private static int BUK_DATXMLCCONBO_SPAN_RECOISEDXCCB = 32;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD = 33;
  private static int BUK_DATXMLCCONBO_SPAN_CODICEENTE = 34;
  private static int BUK_DATXMLCCONBO_RPTBOX_CODICEENTE = 35;
  private static int BUK_DATXMLCCONBO_SPAN_RECOENEDXCCB = 36;
  private static int BUK_DATXMLCCONBO_SEC_PAGEFOOTER = 37;
  private static int BUK_DATXMLCCONBO_RPTBOX_PAGE = 38;
  private static int BUK_DATXMLCCONBO_SPAN_TSDXCCBEPNTS = 39;
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
    Init_PQRY_T90(IMDB);
    Init_PQRY_XMLDATI2(IMDB);
    Init_PQRY_T91(IMDB);
    Init_PQRY_XMLDATI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T90(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T90, 32);
    IMDB.set_TblCode(IMDBDef9.PQRY_T90, "PQRY_T90");
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_INDIRIZZO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COMUNE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DES_PROVINCIA, "DES_PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DES_PROVINCIA,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COD_FISCALE, "COD_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COD_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PARTITA_IVA,3,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COD_ENTE_MI, "COD_ENTE_MI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_COD_ENTE_MI,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UNIONE, "UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UNIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_SUPPORTO_CERT, "TIPO_SUPPORTO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_SUPPORTO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_ATTIVITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_ESATTORIA, "TIPO_ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_ESATTORIA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_MO, "TIPO_MO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TIPO_MO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SE_INC_PAGAM, "SE_INC_PAGAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SE_INC_PAGAM,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SEDE_INPS, "SEDE_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SEDE_INPS,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_ESATTORIA, "ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_ESATTORIA,5,37,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_PROGRESSIVO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_EORI, "CODICE_EORI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_EORI,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_MAIL_AZIENDALE, "MAIL_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_MAIL_AZIENDALE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_FAX_AZIENDALE, "FAX_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_FAX_AZIENDALE,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TELEFONO_AZIENDALE, "TELEFONO_AZIENDALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_TELEFONO_AZIENDALE,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_BDAP, "CODICE_BDAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_BDAP,5,18,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_IPA, "CODICE_IPA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_IPA,5,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_UNIONE, "CODICE_UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_CODICE_UNIONE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_INGRESSO_UNIONE, "DATA_INGRESSO_UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_INGRESSO_UNIONE,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_USCITA_UNIONE, "DATA_USCITA_UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_DATA_USCITA_UNIONE,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SOGGETTO_ENTE, "SOGGETTO_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T90,IMDBDef9.PQSL_T90_SOGGETTO_ENTE,1,14,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T90, 0);
  }

  private static void Init_PQRY_XMLDATI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_XMLDATI2, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_XMLDATI2, "PQRY_XMLDATI2");
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DELIBERA_CC, "DELIBERA_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DELIBERA_CC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_DEL_CC, "DATA_DEL_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_DEL_CC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_SUPERFICIE, "SUPERFICIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_SUPERFICIE,3,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_CODICE_ISTAT, "CODICE_ISTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_CODICE_ISTAT,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, "CODICE_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI2,IMDBDef9.PQSL_XMLDATI2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_XMLDATI2, 0);
  }

  private static void Init_PQRY_T91(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T91, 21);
    IMDB.set_TblCode(IMDBDef9.PQRY_T91, "PQRY_T91");
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_INDIRIZZO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_COMUNE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_PROVINCIA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_DES_PROVINCIA, "DES_PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_DES_PROVINCIA,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_COD_FISCALE, "COD_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_COD_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_PARTITA_IVA,3,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECTCOENMIMI, "RECTCOENMIMI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECTCOENMIMI,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_UNIONE, "UNIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_UNIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_SUPPORTO_CERT, "TIPO_SUPPORTO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_SUPPORTO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_ATTIVITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_ESATTORIA, "TIPO_ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_ESATTORIA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_MO, "TIPO_MO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_TIPO_MO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_SE_INC_PAGAM, "SE_INC_PAGAM");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_SE_INC_PAGAM,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_SEDE_INPS, "SEDE_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_SEDE_INPS,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_ESATTORIA, "ESATTORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_ESATTORIA,5,37,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64TELAZI, "RECT64TELAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64TELAZI,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64FAXAZI, "RECT64FAXAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64FAXAZI,5,12,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64MAIAZI, "RECT64MAIAZI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64MAIAZI,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64CODEOR, "RECT64CODEOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_T91,IMDBDef9.PQSL_T91_RECT64CODEOR,5,20,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T91, 0);
  }

  private static void Init_PQRY_XMLDATI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_XMLDATI3, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_XMLDATI3, "PQRY_XMLDATI3");
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_DELIBERA_CC, "DELIBERA_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_DELIBERA_CC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_DATA_DEL_CC, "DATA_DEL_CC");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_DATA_DEL_CC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_ABITANTI, "ABITANTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_ABITANTI,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_SUPERFICIE, "SUPERFICIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_SUPERFICIE,3,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_CODICE_ISTAT, "CODICE_ISTAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_CODICE_ISTAT,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_CODICE_ENTE, "CODICE_ENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_CODICE_ENTE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_XMLDATI3,IMDBDef9.PQSL_XMLDATI3_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_XMLDATI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Ente(MyWebEntryPoint w, IMDBObj imdb)
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
  public Ente()
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
    FormIdx = MyGlb.FRM_ENTE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "06B31E3F-7F9C-4B8E-8D27-3DFE6B2E319C";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 612;
    DesignHeight = 594;
    set_Caption(new IDVariant("Ente"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 612;
    Frames[1].Height = 568;
    Frames[1].Caption = "New Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 568;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[1].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "D6093499-3C73-4C41-9B5E-252030D69AE1";
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
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 612-MyGlb.PAN_OFFS_X, 568-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_DATIGENEBOOK != null)
      PAN_DATIGENERALI.SetBook(BUK_DATIGENEBOOK);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "16049C6F-79D5-44DD-A333-C51B7960FC9A");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2708, 174, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 612-MyGlb.PAN_OFFS_X, 568-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_DATXMLCCONBO != null)
      PAN_DATIXMLCCONT.SetBook(BUK_DATXMLCCONBO);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D22DAEBB-7CCC-4350-93D4-8CCFE9093C12");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 968, 370, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATIXMLCCONT.InitStatus = 2;
    PAN_DATIXMLCCONT_Init();
    PAN_DATIXMLCCONT_InitFields();
    PAN_DATIXMLCCONT_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[3], 0, "", "Dati XML C Conti", "");
    BKW_DATIGENEBOOK = new OBook(this);
    BUK_DATIGENEBOOK = new CIDREObj(BKW_DATIGENEBOOK);
    BKW_DATIGENEBOOK.iGuid = "51E36E59-7370-414E-8FBB-87C7496A641C";
    BKW_DATIGENEBOOK.Code = "BUK_DATIGENEBOOK";
    BKW_DATIGENEBOOK.BookObj = BUK_DATIGENEBOOK;
    BKW_DATIGENEBOOK.InitDefMasks();
    BUK_DATIGENEBOOK.InitBook(1, 1245185, "Dati Generali Book", IMDB, MainFrm.VisualStyleList);
    BUK_DATIGENEBOOK.InitHTML();
    BUK_DATIGENEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DATIGENEBOOK.Book.SetMainFrm(MainFrm);
    BUK_DATIGENEBOOK.SetRTCGuid(0, "51E36E59-7370-414E-8FBB-87C7496A641C");
    BUK_DATIGENEBOOK.SetObjCode(0, "DATIGENEBOOK");
    if (PAN_DATIGENERALI != null)
      PAN_DATIGENERALI.SetBook(BUK_DATIGENEBOOK);
    BUK_DATIGENEBOOK_MST_DATGENBOOPAG_Init();
    BUK_DATIGENEBOOK_RPT_NEWREPORT_Init();
    BUK_DATIGENEBOOK_InitLinks();
    BKW_DATXMLCCONBO = new OBook(this);
    BUK_DATXMLCCONBO = new CIDREObj(BKW_DATXMLCCONBO);
    BKW_DATXMLCCONBO.iGuid = "296168AA-ADB5-40B3-B1BD-1F22A12BFFEB";
    BKW_DATXMLCCONBO.Code = "BUK_DATXMLCCONBO";
    BKW_DATXMLCCONBO.BookObj = BUK_DATXMLCCONBO;
    BKW_DATXMLCCONBO.InitDefMasks();
    BUK_DATXMLCCONBO.InitBook(1, 1245185, "Dati XML C Conti Book", IMDB, MainFrm.VisualStyleList);
    BUK_DATXMLCCONBO.InitHTML();
    BUK_DATXMLCCONBO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DATXMLCCONBO.Book.SetMainFrm(MainFrm);
    BUK_DATXMLCCONBO.SetRTCGuid(0, "296168AA-ADB5-40B3-B1BD-1F22A12BFFEB");
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_DATIGENERALI.FrIndex)
    {
      if (IdxFieldActived ==PFL_DATIGENERALI_ETICHELKPSOG) {
      }
    }
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
    return (obj instanceof Ente);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Ente.class.getName() : (Glb.ClassWithPackage(Ente.class) ? Ente.class.getName().substring(Ente.class.getPackage().getName().length() + 1) : Ente.class.getName()));
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
      Frames[PAN_DATIXMLCCONT.FrIndex].set_Caption(new IDVariant(v_DATIXMLCONTI).stringValue());
      TAB_NEWTABBEVIEW.SetItemCaption((new IDVariant(PAN_DATIXMLCCONT.FrIndex)).intValue(), v_DATIXMLCONTI.stringValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Ente", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_SOGGETTO_ENTE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0),IDVariant.INTEGER));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Dati Generali After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DATIGENERALI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Generali After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_DATIGENERALI.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_DATIGENERALI.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Generali On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DATIGENERALI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Generali On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Generali On Database Error Event
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
  private void PAN_DATIGENERALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DATIGENERALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dati Generali On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Generali On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DATIGENERALI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Generali On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if ((IDL.Length(IDL.ToString(IMDB.Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_COD_ENTE_MI, 0))).compareTo((new IDVariant(10)), true)!=0) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_COD_ENTE_MI, 0))))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Codice Ministero/Ente non valido: deve contenere 10 caratteri numerici.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Generali After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_DATIGENERALI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Generali After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        MainFrm.SettaDatiEnte();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliAfterCommit", _e);
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
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_UNIONE, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
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
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Dati Generali On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_DATIGENERALI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Generali On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_DATIGENERALI_SOGGETTINPUT)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_DATIGENERALI.FieldText(PFL_DATIGENERALI_SOGGETTINPUT))), IDL.Today(), (new IDVariant("")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiGeneraliOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DATIXMLCCONT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati XML C Conti After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_DATIXMLCCONT.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_DATIXMLCCONT.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DATIXMLCCONT_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati XML C Conti On Change Row Event Body
      // Procedure Body
      // 
      if (PAN_DATIXMLCCONT.IsNewRow() && TEMP1.equals((new IDVariant(0)), true))
      {
        Valorizzacampi();
        PAN_DATIXMLCCONT.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DATIXMLCCONT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati XML C Conti On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        TEMP1 = (new IDVariant(1));
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti On Database Error Event
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
  private void PAN_DATIXMLCCONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DATIXMLCCONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dati XML C Conti On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DATIXMLCCONT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati XML C Conti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if ((!(IDL.IsNumber(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0))) || IDL.Length(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0)).compareTo((new IDVariant(10)), true)!=0) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0))))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Codice Ministero/Ente non valido: deve contenere 10 caratteri numerici.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiOnCommandEvent", _e);
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
      IDVariant v_TROVATO = new IDVariant(0,IDVariant.INTEGER);
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
      v_TROVATO = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
      if (!QV.EOF())
      {
        v_ABITANTI = QV.Get("XMLDATIABITA", IDVariant.INTEGER) ;
        v_SUPERFICIE = QV.Get("XMLDATISUPER", IDVariant.INTEGER) ;
        v_CODICEISTAT = QV.Get("XMLDATCODIST", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_TROVATO.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (v_ABITANTI.compareTo((new IDVariant()), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_ABITANTI, 0, new IDVariant(v_ABITANTI));
        }
        if (v_SUPERFICIE.compareTo((new IDVariant()), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_SUPERFICIE, 0, new IDVariant(new IDVariant(v_SUPERFICIE),IDVariant.DECIMAL));
        }
        if (v_CODICEISTAT.compareTo((new IDVariant()), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ISTAT, 0, new IDVariant(v_CODICEISTAT));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "Valorizzacampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Soggetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Soggetto Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "ScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dati Certificati Codice Ente Ministero Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DATIGENERALI_CODIENTEMINI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Certificati Codice Ente Ministero Validate Event Body
      // Procedure Body
      // 
      if ((IDL.Length(IDL.ToString(IMDB.Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_COD_ENTE_MI, 0))).compareTo((new IDVariant(10)), true)!=0) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T90, IMDBDef9.PQSL_T90_COD_ENTE_MI, 0))))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Codice Ministero/Ente non valido: deve contenere 10 caratteri numerici.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiCertificatiCodiceEnteMinisteroValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Dati XML C Conti Codice Ente Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DATIXMLCCONT_CODICEENTE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati XML C Conti Codice Ente Validate Event Body
      // Procedure Body
      // 
      if ((!(IDL.IsNumber(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0))) || IDL.Length(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0)).compareTo((new IDVariant(10)), true)!=0) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_XMLDATI2, IMDBDef9.PQSL_XMLDATI2_CODICE_ENTE, 0))))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Codice Ministero/Ente non valido: deve contenere 10 caratteri numerici.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Ente", "DatiXMLCContiCodiceEnteValidateEvent", _e);
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
    if (ColIndex.intValue() == PFL_DATIGENERALI_ETICHELKPSOG)
    {
      this.IdxPanelActived = this.PAN_DATIGENERALI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATIGENERALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DATIGENERALI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DATIGENERALI_CODIENTEMINI)
      {
        PFL_DATIGENERALI_CODIENTEMINI_ValidateCell(Cancel);
      }
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
      PAN_DATIXMLCCONT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DATIXMLCCONT_CODICEENTE)
      {
        PFL_DATIXMLCCONT_CODICEENTE_ValidateCell(Cancel);
      }
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
      BUK_DATIGENEBOOK.set_SpanValue(BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, new IDVariant(IDL.NullValue(BUK_DATIGENEBOOK.GetReportColumn(BUK_DATIGENEBOOK_RPT_NEWREPORT, "UNIONE"),(new IDVariant("NO")))));
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
      BUK_DATXMLCCONBO.set_SpanValue(BUK_DATXMLCCONBO_SPAN_TSDXCCBEPNTS, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_DATXMLCCONBO.GetPageNumber()))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_DATXMLCCONBO.GetTotalPagesNumber()))))));
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
    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, "E8B073E7-8E02-4314-B479-B9D63FDE8874");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, "Fatturazione Elettronica Attiva");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, MyGlb.PANEL_FORM, 32, 239, 508, 49, 0, 0);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, 0, 50);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, 1, 13);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, 0, 4);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, 1, 4);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_FEATTIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "52D7F037-354B-474D-A97A-E6EDC6048FA1");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "Dati Certificati");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.PANEL_LIST, 0, -9999, 144, 16, 0, 0);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, MyGlb.PANEL_FORM, 32, 291, 508, 73, 0, 0);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0, 81);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 1, 13);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0, 4);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 1, 4);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_DATICERTIFIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "51BC5BF3-AF00-49A4-B6B0-650B8A94AB29");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "Ente Versamento Ritenute");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.PANEL_LIST, 0, -9999, 196, 16, 0, 0);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, MyGlb.PANEL_FORM, 32, 367, 508, 73, 0, 0);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0, 149);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 1, 13);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0, 4);
    PAN_DATIGENERALI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 1, 4);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIGENERALI_ENTEVERSRITE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_FIELD, 32);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "76DABD6D-B128-400F-A4A1-FC3EB2872497");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "Denominazione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "111DE673-7635-44CF-BC94-C6F16BF7822B");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "Indirizzo");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "1A461E7D-E9C8-4FAF-ADB7-0876075C0F49");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "Comune");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "86C7FB3B-0C1A-4803-8DF6-6720F990B977");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "Provincia");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "F6663162-11FF-4329-A8FE-B941E7B198F3");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "Provincia_sigla");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "47361E59-A0CC-4B4C-9B18-6B3F1AF7D3DA");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "CAP");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.VIS_NORFIECFCACA);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "7254F8F4-6D4F-4100-8B30-0F097F167432");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "Codice Fiscale");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "C2CF377C-8E8A-429F-9F27-FA8DE02B1B17");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "Partita IVA");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.VIS_NORFIECF4PIV);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "9AB3B618-0666-48B7-A169-2AAD2A3E50F7");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "Telefono");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "DEB8F2FB-A29F-4E85-A373-4DCC7BBDF5A4");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "Fax");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "76AEF2EC-55E0-485E-B6D1-FCD2EE05495C");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "E-Mail");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "56432083-95AC-4598-BA0C-F71400385CB4");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "Codice EORI");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "79621793-4CF2-4A16-8E02-5C0D34E88F28");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "Codice BDAP");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "9D0AB45A-B44F-45C7-B617-D8E44928B9EA");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "Codice IPA");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, "8842205D-80F5-4246-B685-90ED200124A0");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, "Soggetto Collegato");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, "9E4B3088-CC6B-40A2-A1BA-61D45A9261F5");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, "SOGGETTO ENTE");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, "FEDECB30-C0ED-4AB6-9637-8D449E0A21AF");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, " ");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, "LkpSoggettoEnte");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.VIS_STATICBUTTON);
    PAN_DATIGENERALI.SetImage(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, 0, "wsearch.gif", false);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "877E056C-68FD-4601-A5BA-2B8130E7FEF1");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "Codice Ente Ministero");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.VIS_NORFIEINTLUN);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "D46B8043-EFE8-4BC6-8A7A-152935EA2687");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "Tipo Supporto");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "080927E6-8CB3-45A5-8494-E58FAA9354B3");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "Unione di Comuni");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.VIS_CHECKSTYLE);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "BD89397C-E8B0-47A4-BDFC-D4F97300350A");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "Codice Unione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "D3D2935F-B7BA-4713-A6D7-D64AAB315C7D");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "Inizio");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "62BF7264-2221-43F3-856C-6132D043E16D");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "Fine");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "A2E8594C-E960-43A7-8CD8-5084234B882D");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "Tipo");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "A9CDFB20-576F-4A09-B694-BD6D575AB930");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "Descrizione");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, "A1DFD091-C31A-40DC-BF59-CDB7AC10A972");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "E95D1D44-503C-45D1-9949-F30E9B76C3E6");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "Attività prevalente");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "F89F8C77-5B04-402D-9599-50CA94D0471E");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "Sede INPS");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "52BF497F-954A-4F27-BC90-8EB31453CDF3");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "6CD9A8B2-1A9A-4A3D-BA80-4879DD07E832");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "4256B85E-6B02-42DB-8E3A-0A5FCB175E8C");
    PAN_DATIGENERALI.set_Header(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_DATIGENERALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, "");
    PAN_DATIGENERALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIGENERALI.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATIGENERALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, "5D52E5F9-D718-421C-B3A1-4EF9978D6FB4");
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
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 20, 0, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DENOMINAZION, MyGlb.PANEL_FORM, "Denominazione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DENOMINAZION, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DENOMINAZION, PPQRY_T90, "A.DENOMINAZIONE", "DENOMINAZIONE", 5, 40, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 208, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 64);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_LIST, "Indirizzo");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 20, 24, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_INDIRIZZO, MyGlb.PANEL_FORM, "Indirizzo");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_INDIRIZZO, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_INDIRIZZO, PPQRY_T90, "A.INDIRIZZO", "INDIRIZZO", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 368, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 48);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_LIST, "Comune");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 20, 48, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_COMUNE, MyGlb.PANEL_FORM, "Comune");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_COMUNE, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_COMUNE, PPQRY_T90, "A.COMUNE", "COMUNE", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 88);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_LIST, "Provincia");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 20, 72, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCIA, MyGlb.PANEL_FORM, "Provincia");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PROVINCIA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PROVINCIA, PPQRY_T90, "A.DES_PROVINCIA", "DES_PROVINCIA", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 528, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 64);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_LIST, "Provincia sigla");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 292, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PROVINCSIGLA, MyGlb.PANEL_FORM, "Prov. sigla");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PROVINCSIGLA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PROVINCSIGLA, PPQRY_T90, "A.PROVINCIA", "PROVINCIA", 5, 2, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 28);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_LIST, "CAP");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 420, 72, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 32);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CAP, MyGlb.PANEL_FORM, "CAP");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CAP, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CAP, PPQRY_T90, "A.CAP", "CAP", 1, 5, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 76);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 20, 96, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEFISCAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEFISCAL, PPQRY_T90, "A.COD_FISCALE", "COD_FISCALE", 5, 16, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 380, 96, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_PARTITAIVA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_PARTITAIVA, PPQRY_T90, "A.PARTITA_IVA", "PARTITA_IVA", 3, 11, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_LIST, "Telefono");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, -4, 120, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TELEFOAZIEND, MyGlb.PANEL_FORM, "Telefono");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TELEFOAZIEND, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TELEFOAZIEND, PPQRY_T90, "A.TELEFONO_AZIENDALE", "TELEFONO_AZIENDALE", 5, 12, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_LIST, "Fax");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 352, 120, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_FAXAZIENDALE, MyGlb.PANEL_FORM, "Fax");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_FAXAZIENDALE, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_FAXAZIENDALE, PPQRY_T90, "A.FAX_AZIENDALE", "FAX_AZIENDALE", 5, 12, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_LIST, "E-Mail");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 20, 144, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 104);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_MAILAZIENDAL, MyGlb.PANEL_FORM, "E-Mail");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_MAILAZIENDAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_MAILAZIENDAL, PPQRY_T90, "A.MAIL_AZIENDALE", "MAIL_AZIENDALE", 5, 50, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_LIST, "Codice EORI");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 44, 168, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 80);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEEORI, MyGlb.PANEL_FORM, "Codice EORI");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEEORI, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEEORI, PPQRY_T90, "A.CODICE_EORI", "CODICE_EORI", 5, 20, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 84);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_LIST, "Codice BDAP");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 40, 192, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 84);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEBDAP, MyGlb.PANEL_FORM, "Codice BDAP");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEBDAP, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEBDAP, PPQRY_T90, "A.CODICE_BDAP", "CODICE_BDAP", 5, 18, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_LIST, "Codice IPA");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 52, 216, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 72);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEIPA, MyGlb.PANEL_FORM, "Codice IPA");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEIPA, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEIPA, PPQRY_T90, "A.CODICE_IPA", "CODICE_IPA", 5, 15, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_LIST, 168);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_LIST, "Soggetto Collegato");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_FORM, 36, 264, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_FORM, 116);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTINPUT, MyGlb.PANEL_FORM, "Soggetto Collegato");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_SOGGETTINPUT, -1, GRP_DATIGENERALI_FEATTIVA);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_SOGGETTINPUT, PPQRY_SOGGETTI, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE", "SOGBENRAGSOC", 5, 142, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_LIST, "SOGGETTO ENTE");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_FORM, 4, 448, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_FORM, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SOGGETTOENTE, MyGlb.PANEL_FORM, "SOGGETTO ENTE");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_SOGGETTOENTE, -1, GRP_DATIGENERALI_FEATTIVA);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_SOGGETTOENTE, PPQRY_T90, "A.SOGGETTO_ENTE", "SOGGETTO_ENTE", 1, 14, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_LIST, 564, 260, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_LIST, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_FORM, 520, 264, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_FORM, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ETICHELKPSOG, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_ETICHELKPSOG, -1, GRP_DATIGENERALI_FEATTIVA);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_ETICHELKPSOG, -1, "", "ETICHELKPSOG", 0, 0, 0, -13997);
    PAN_DATIGENERALI.set_ImageResizeMode(PFL_DATIGENERALI_ETICHELKPSOG, 2);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 60);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_LIST, "C. E. Min.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 36, 316, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 132);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODIENTEMINI, MyGlb.PANEL_FORM, "Codice Ente Ministero");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODIENTEMINI, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODIENTEMINI, PPQRY_T90, "A.COD_ENTE_MI", "COD_ENTE_MI", 3, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_LIST, "Tipo Supporto");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 68, 288, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPOSUPPORTO, MyGlb.PANEL_FORM, "Tipo Supporto");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TIPOSUPPORTO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TIPOSUPPORTO, PPQRY_T90, "A.TIPO_SUPPORTO_CERT", "TIPO_SUPPORTO_CERT", 5, 1, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPOSUPPORTO, (new IDVariant("C")), "CD", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPOSUPPORTO, (new IDVariant()), "Floppy-disk", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 48);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_LIST, "U. d. C.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 276, 316, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 176);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UNIONDICOMUN, MyGlb.PANEL_FORM, "Unione di Comuni");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UNIONDICOMUN, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UNIONDICOMUN, PPQRY_T90, "A.UNIONE", "UNIONE", 5, 2, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_UNIONDICOMUN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_UNIONDICOMUN, (new IDVariant()), "Null", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_LIST, "Codice Unione");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 72, 340, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 96);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_CODICEUNIONE, MyGlb.PANEL_FORM, "Codice Unione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_CODICEUNIONE, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_CODICEUNIONE, PPQRY_T90, "A.CODICE_UNIONE", "CODICE_UNIONE", 5, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 144);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_LIST, "Inizio");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 272, 340, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 40);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINGRUNIO, MyGlb.PANEL_FORM, "Inizio");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAINGRUNIO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAINGRUNIO, PPQRY_T90, "A.DATA_INGRESSO_UNIONE", "DATA_INGRESSO_UNIONE", 6, 10, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 128);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_LIST, "Fine");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 408, 340, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 36);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAUSCIUNIO, MyGlb.PANEL_FORM, "Fine");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAUSCIUNIO, -1, GRP_DATIGENERALI_DATICERTIFIC);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAUSCIUNIO, PPQRY_T90, "A.DATA_USCITA_UNIONE", "DATA_USCITA_UNIONE", 8, 19, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 92);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 64, 392, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 60);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_TIPO, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_TIPO, PPQRY_T90, "A.TIPO_ESATTORIA", "TIPO_ESATTORIA", 5, 1, 0, -13997);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant("T")), "Tesoreria Prov. Stato", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant("C")), "Concessionario", "", "", -1);
    PAN_DATIGENERALI.SetValueListItem(PFL_DATIGENERALI_TIPO, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 68);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 36, 416, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DESCRIZIONE, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DESCRIZIONE, PPQRY_T90, "A.ESATTORIA", "ESATTORIA", 5, 37, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 276, 224, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 524, 400, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_NEWPANELLAB1, -1, GRP_DATIGENERALI_ENTEVERSRITE);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 56);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_LIST, "Attiv. preval.");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 4, 448, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_ATTIVIPREVAL, MyGlb.PANEL_FORM, "Attività prevalente");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_ATTIVIPREVAL, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_ATTIVIPREVAL, PPQRY_T90, "A.ATTIVITA", "ATTIVITA", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 60);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_LIST, "Sede INPS");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 284, 448, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 76);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_SEDEINPS, MyGlb.PANEL_FORM, "Sede INPS");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_SEDEINPS, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_SEDEINPS, PPQRY_T90, "A.SEDE_INPS", "SEDE_INPS", 5, 30, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 436, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UTENTEINSER1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UTENTEINSER1, PPQRY_T90, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 188, 438, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAINSERIM1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAINSERIM1, PPQRY_T90, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 12, 460, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_UTENTULTIAG1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_UTENTULTIAG1, PPQRY_T90, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATIGENERALI.SetRect(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 196, 460, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIGENERALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_DATIGENERALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_DATIGENERALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIGENERALI_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DATIGENERALI.SetFieldPage(PFL_DATIGENERALI_DATAULTIMAG1, -1, -1);
    PAN_DATIGENERALI.SetFieldPanel(PFL_DATIGENERALI_DATAULTIMAG1, PPQRY_T90, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_DATIGENERALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATIGENERALI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as SOGGEBENCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as SOGBENRAGSOC, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  CASE WHEN NVL(" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'SI' THEN 'Dal ' || TO_CHAR ( A.DAL,'dd/mm/yyyy') || ' Al ' || DECODE(A.AL, to_date(NULL), '', TO_CHAR ( A.AL,'dd/mm/yyyy')) ELSE DECODE(A.D_SCADENZA, to_date(NULL), '', TO_CHAR ( A.D_SCADENZA,'dd/mm/yyyy')) END as VALIDITA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~SOGGETTO_ENTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DATIGENERALI.SetQuery(PPQRY_SOGGETTI, 0, SQL, -1, "");
    PAN_DATIGENERALI.SetQueryDB(PPQRY_SOGGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATIGENERALI.SetMasterTable(PPQRY_SOGGETTI, "BEN");
    PAN_DATIGENERALI.SetQueryLKE(PPQRY_SOGGETTI, PFL_DATIGENERALI_SOGGETTOENTE, "SOGGEBENCODI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as SOGGEBENCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as SOGBENRAGSOC, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  CASE WHEN NVL(" + IDL.CSql(MainFrm.ANAGRACONDIV, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO') = 'SI' THEN 'Dal ' || TO_CHAR ( A.DAL,'dd/mm/yyyy') || ' Al ' || DECODE(A.AL, to_date(NULL), '', TO_CHAR ( A.AL,'dd/mm/yyyy')) ELSE DECODE(A.D_SCADENZA, to_date(NULL), '', TO_CHAR ( A.D_SCADENZA,'dd/mm/yyyy')) END as VALIDITA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DATIGENERALI.SetQuery(PPQRY_SOGGETTI, 1, SQL, -1, "");
    PAN_DATIGENERALI.SetQueryHeaderColumn(PPQRY_SOGGETTI, "SOGBENRAGSOC", "BEN RAGIONE SOCIALE");
    PAN_DATIGENERALI.SetQueryHeaderColumn(PPQRY_SOGGETTI, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_DATIGENERALI.SetQueryHeaderColumn(PPQRY_SOGGETTI, "PARTITA_IVA", "BEN PARTITA IVA");
    PAN_DATIGENERALI.SetQueryHeaderColumn(PPQRY_SOGGETTI, "VALIDITA", "Validità");
    PAN_DATIGENERALI.SetQueryVisibleColumn(PPQRY_SOGGETTI, "VALIDITA");
    PAN_DATIGENERALI.SetIMDB(IMDB, "PQRY_T90", true);
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
    SQL.append("  A.COD_ENTE_MI as COD_ENTE_MI, ");
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
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.CODICE_EORI as CODICE_EORI, ");
    SQL.append("  A.MAIL_AZIENDALE as MAIL_AZIENDALE, ");
    SQL.append("  A.FAX_AZIENDALE as FAX_AZIENDALE, ");
    SQL.append("  A.TELEFONO_AZIENDALE as TELEFONO_AZIENDALE, ");
    SQL.append("  A.CODICE_BDAP as CODICE_BDAP, ");
    SQL.append("  A.CODICE_IPA as CODICE_IPA, ");
    SQL.append("  A.CODICE_UNIONE as CODICE_UNIONE, ");
    SQL.append("  A.DATA_INGRESSO_UNIONE as DATA_INGRESSO_UNIONE, ");
    SQL.append("  A.DATA_USCITA_UNIONE as DATA_USCITA_UNIONE, ");
    SQL.append("  A.SOGGETTO_ENTE as SOGGETTO_ENTE ");
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T64 A ");
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIGENERALI.SetQuery(PPQRY_T90, 5, SQL, -1, "");
    PAN_DATIGENERALI.SetQueryDB(PPQRY_T90, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "C173C370-54EE-4812-A042-E153CF506BDF");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "Delibera Approvazione Consuntivo");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.VIS_GROUPSTYLE);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, MyGlb.PANEL_FORM, 68, 11, 232, 89, 0, 0);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0, 194);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 1, 13);
    PAN_DATIXMLCCONT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0, 4);
    PAN_DATIXMLCCONT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 1, 4);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_GROUP, GRP_DATIXMLCCONT_DELIAPPRCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "71C28A5E-EB25-4C6F-A0DB-BE95264F4D8A");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "Numero");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "5D1789F7-366D-48B4-908C-2BA5C5F8A83D");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "Data");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, "E2809039-AE5A-4AF6-A7FD-019C9393A96F");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "34499887-EF2E-4FB9-8672-CCFE2EB6AF7C");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "Numero di Abitanti");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "F95F9D86-6100-4B1D-9FE3-BCC62C62F5BA");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "23EA1BCB-BC26-4AFC-B3CA-A9405FBE8435");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "Codice Istat");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "0BC73D3B-B28F-4722-972C-8E7F97C8D2EC");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "Codice Ente");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "BE4D16D0-BC14-4B45-AC9F-A416F1A4A817");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "ESERCIZIO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "F74C6B55-0580-4B10-8010-0DA27677E8E8");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "757DC297-2631-4774-93C4-950F9AA997FB");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "372B5867-6834-4E4B-9BD7-51D2961A77E1");
    PAN_DATIXMLCCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DATIXMLCCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, "");
    PAN_DATIXMLCCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DATIXMLCCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATIXMLCCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, "4875878E-F654-4709-9894-4D00E252AB5B");
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
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 72, 48, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NUMERO, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NUMERO, PPQRY_XMLDATI2, "A.DELIBERA_CC", "DELIBERA_CC", 1, 5, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 76);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 84, 76, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 40);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATA, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATA, PPQRY_XMLDATI2, "A.DATA_DEL_CC", "DATA_DEL_CC", 6, 19, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 188, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 284, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NEWPANELLABE, -1, GRP_DATIXMLCCONT_DELIAPPRCONS);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 56);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_LIST, "Num. di Abitanti");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 60, 124, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_NUMERDIABITA, MyGlb.PANEL_FORM, "Numero di Abitanti");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_NUMERDIABITA, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_NUMERDIABITA, PPQRY_XMLDATI2, "A.ABITANTI", "ABITANTI", 1, 7, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 68);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_LIST, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 60, 148, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_SUPERFICIKMQ, MyGlb.PANEL_FORM, "Superficie (Kmq)");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_SUPERFICIKMQ, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_SUPERFICIKMQ, PPQRY_XMLDATI2, "A.SUPERFICIE", "SUPERFICIE", 3, 7, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 80);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_LIST, "Codice Istat");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 84, 172, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 96);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEISTAT, MyGlb.PANEL_FORM, "Codice Istat");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_CODICEISTAT, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_CODICEISTAT, PPQRY_XMLDATI2, "A.CODICE_ISTAT", "CODICE_ISTAT", 5, 6, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 76);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_LIST, "Codice Ente");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 84, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 96);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_CODICEENTE, MyGlb.PANEL_FORM, "Codice Ente");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_CODICEENTE, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_CODICEENTE, PPQRY_XMLDATI2, "A.CODICE_ENTE", "CODICE_ENTE", 5, 10, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 256, 356, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_ESERCIZIO, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_ESERCIZIO, PPQRY_XMLDATI2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 24, 272, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_UTENTEINSERI, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_UTENTEINSERI, PPQRY_XMLDATI2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 8, 300, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATAINSERIME, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATAINSERIME, PPQRY_XMLDATI2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 36, 332, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_UTENTULTIAGG, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_UTENTULTIAGG, PPQRY_XMLDATI2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DATIXMLCCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 20, 360, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATIXMLCCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_DATIXMLCCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DATIXMLCCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATIXMLCCONT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DATIXMLCCONT.SetFieldPage(PFL_DATIXMLCCONT_DATAULTIMAGG, -1, -1);
    PAN_DATIXMLCCONT.SetFieldPanel(PFL_DATIXMLCCONT_DATAULTIMAGG, PPQRY_XMLDATI2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_DATIXMLCCONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATIXMLCCONT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATIXMLCCONT.SetIMDB(IMDB, "PQRY_XMLDATI2", true);
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
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  XML_DATI A ");
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATIXMLCCONT.SetQuery(PPQRY_XMLDATI2, 5, SQL, -1, "");
    PAN_DATIXMLCCONT.SetQueryDB(PPQRY_XMLDATI2, MainFrm.Cf4armDBObject.DB, 4);
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
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, "29737D81-47D1-459E-BC5E-74AADFD25586");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, "DATGENBOOPAG");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, "EE828B6D-709D-4BF5-A800-FEF9754F0DA4");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, 1000, 3000, 19000, 22700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, "BF824EF8-E8D9-4BD7-BDDA-1AB8C885902F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_DATIGENEBOOK.InitMastroBox(BUK_DATIGENEBOOK_MST_DATGENBOOPAG, BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1, "1A3BF66A-8280-41C8-96F1-D21DE08DB21B");
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
      SQL.append("  A.COD_ENTE_MI as RECTCOENMIMI, ");
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
      BUK_DATIGENEBOOK.SetReportQuery(BUK_DATIGENEBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D4477873-CD26-4CDF-9393-D28E996C77D2");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DATIGENEBOOK_RPT_NEWREPORT_Init()
  {
    BUK_DATIGENEBOOK.InitReport(BUK_DATIGENEBOOK_RPT_NEWREPORT, 196609);
    BUK_DATIGENEBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPT_NEWREPORT, "E6AD0F03-009C-471F-8F45-63EF19278DFE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_REPORTHEADER, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_REPORTHEADER, "BDBF6323-07D4-4F75-8AC1-B4C68929F14D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_PAGEHEADER, BUK_DATIGENEBOOK_RPTBOX_PAGEHEADER1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_PAGEHEADER, "A77731B5-E97A-4162-8D7D-68655A91B926");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_PAGEHEADER, BUK_DATIGENEBOOK_RPTBOX_NEWBOX, 0, 0, 19000, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, "8329A7B1-7044-46DA-A3F0-2E776CF5B295");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_NEWBOX, BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Dati dell'Ente", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, "5C1ECF46-B8DF-4AB3-BBB4-C24A8BF61E4D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DATIDELLENTE, "DATIDELLENTE");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_DETAIL, 10700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_DETAIL, "761126FD-0E0C-4248-9D0D-A870514066DE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_DETAIL, "DETAIL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, 100, 5500, 10300, 2000, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, "FC4797FC-0061-45E8-A50B-40156A32B577");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, "DATICERTGROU");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DATICERTGROU, BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Dati Certificati", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, "4A44D3C1-F7F2-45C0-B9B6-A7D92DF0BDE2");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DATICERTIFIC, "DATICERTIFIC");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, 100, 7600, 10300, 2100, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, "1A5E653A-138C-4B07-933F-9C6C30C4C5E6");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, "ENTVERRITGRO");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ENTVERRITGRO, BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Ente Versamento Ritenute", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, "7668940A-D37A-46A4-B00E-9E63A1813F4C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_ENTEVERSRITE, "ENTEVERSRITE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, 100, 300, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, "BFC7DAA5-7E48-4F45-AD6E-7C4C4561D00B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, "DENOMIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DENOMIHEADER, BUK_DATIGENEBOOK_SPAN_DENOMINAZION, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Denominazione", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DENOMINAZION, "D433C06F-DF78-4A1B-A42B-A2102D2B0B8E");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DENOMINAZION, "DENOMINAZION");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, 2900, 300, 8237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, "973422C7-489E-439B-A0B8-D9E0E74C9461");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, "DENOMINAZION");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DENOMINAZION, BUK_DATIGENEBOOK_SPAN_REDEENDAGEB1, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DENOMINAZIONE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REDEENDAGEB1, "C81241BE-44FF-4528-AF09-AC882D83D234");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REDEENDAGEB1, "REDEENDAGEB1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, 100, 900, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, "AA2D106F-59FD-4C84-B555-7AA33598086D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, "INDIRIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_INDIRIHEADER, BUK_DATIGENEBOOK_SPAN_INDIRIZZO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Indirizzo", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_INDIRIZZO, "332B33F3-6E51-45D6-9095-EE9DD92E81F5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_INDIRIZZO, "INDIRIZZO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, 2900, 900, 4837, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, "6DC71024-5146-4490-963B-5A162552E634");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, "INDIRIZZO");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_INDIRIZZO, BUK_DATIGENEBOOK_SPAN_REINENDAGEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::INDIRIZZO", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REINENDAGEBO, "6255507A-3001-4E17-A8BD-9856AA90DFAD");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REINENDAGEBO, "REINENDAGEBO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, 100, 1500, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, "7F6FA1B1-EBBE-4F02-9CD4-A04BF93F7680");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, "COMUNEHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_COMUNEHEADER, BUK_DATIGENEBOOK_SPAN_COMUNE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Comune", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_COMUNE, "009B7453-EC30-4698-8958-846622D1DE68");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_COMUNE, "COMUNE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_COMUNE, 2900, 1500, 8237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_COMUNE, "F79A072B-0336-44D4-89BE-CE438C2EF82D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_COMUNE, "COMUNE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_COMUNE, BUK_DATIGENEBOOK_SPAN_RETCOENDAGEB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::COMUNE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETCOENDAGEB, "522CFF72-30D5-49DE-95F9-67C261A93CF8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETCOENDAGEB, "RETCOENDAGEB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, 6900, 2200, 400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, "AABA5E83-9344-40BC-9C5A-8A0793F13307");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, "PROVINCIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PROVINCIA, BUK_DATIGENEBOOK_SPAN_REPRSIENDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::PROVINCIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPRSIENDAGB, "C5FBB43B-D838-48D4-8F10-292CA72F41FB");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPRSIENDAGB, "REPRSIENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, 100, 2200, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, "E9D42500-DC2E-44C8-B71F-7A90D31C7722");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, "DESPROVIHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DESPROVIHEAD, BUK_DATIGENEBOOK_SPAN_PROVINCIA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Provincia", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PROVINCIA, "FCA7B947-D940-4E3D-8764-74256639D4B1");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PROVINCIA, "PROVINCIA");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, 2900, 2200, 3437, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, "99D41A73-127D-4C09-B516-3C672F54829B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, "DESPROVINCIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_DESPROVINCIA, BUK_DATIGENEBOOK_SPAN_REPRENDAGEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DES_PROVINCIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPRENDAGEBO, "27E0B72D-021E-413F-B8F4-DEE1557212A8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPRENDAGEBO, "REPRENDAGEBO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, 8400, 2200, 693, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, "4CCF2DF7-38F6-469D-AA14-938BE23EB9FE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, "CAPHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CAPHEADER, BUK_DATIGENEBOOK_SPAN_CAP, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "CAP", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CAP, "C3B1EEBA-222A-4034-A790-60496D2FA020");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CAP, "CAP");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CAP, 9200, 2200, 1146, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CAP, "3B2258C7-CBE9-4A88-BE8C-57AB80F10E93");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CAP, "CAP");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CAP, BUK_DATIGENEBOOK_SPAN_RETCAENDAGEB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::CAP", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETCAENDAGEB, "F0A10799-50D9-4371-BE6F-C5946F91C9F2");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETCAENDAGEB, "RETCAENDAGEB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, 100, 2800, 2695, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, "8159E588-103E-45B2-9990-810DFAB13987");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, "CODFISCAHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODFISCAHEAD, BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Fiscale", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, "96882C46-DD31-4832-B475-A7407D209BFE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, 2900, 2800, 2237, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, "2A890954-7A94-4AEB-8D03-9C84717D99E7");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, "CODFISCALE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODFISCALE, BUK_DATIGENEBOOK_SPAN_RECOFIENDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::COD_FISCALE", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RECOFIENDAGB, "53C4FD9E-3165-4349-BC5B-EFCD7D1C252D");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RECOFIENDAGB, "RECOFIENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, 6600, 2800, 1892, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, "E71EF829-D2A0-4D55-B087-BE1DF6F8E366");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, "PARTIIVAHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PARTIIVAHEAD, BUK_DATIGENEBOOK_SPAN_PARTITAIVA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Partita IVA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PARTITAIVA, "5126DF27-B657-40CD-BD38-F1272E2FEBF2");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PARTITAIVA, "PARTITAIVA");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, 8600, 2800, 1781, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, "A520E604-094C-415D-A8B0-9A512C24AC61");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, "PARTITAIVA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_PARTITAIVA, BUK_DATIGENEBOOK_SPAN_REPAIVENDAGB, MyGlb.VIS_DEFAREPOSTYL, 3, 11, 6, 271384705, "Brief description of field content.", "::PARTITA_IVA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REPAIVENDAGB, "3C3A3E7A-E6C9-475B-8F29-30C9CEBFF710");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REPAIVENDAGB, "REPAIVENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, 100, 3500, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, "F3649EE9-CC44-4AA5-BAE2-6D352382CA7A");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, "TELEAZIEHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TELEAZIEHEAD, BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Telefono", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, "4AFD6BC9-5DBA-4ED2-8039-5E99F5C0D827");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64TELEFAZI1, "T64TELEFAZI1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, 2900, 3500, 2300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, "5FEB7376-6C41-49D7-91AB-D49118C32ED5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, "TELEFOAZIEND");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TELEFOAZIEND, BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, MyGlb.VIS_DEFAREPOSTYL, 5, 12, 0, 271384705, "", "::RECT64TELAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, "1B9D903D-3070-4F28-BF57-DB35D82323FC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64TELEFAZIE, "T64TELEFAZIE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, 6600, 3500, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, "79FDE8B4-82D3-4A81-88D0-9FF3BE2CF9EA");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, "FAXAZIENHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENHEAD, BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Fax", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, "1B96D5B7-ECD6-41D7-ABCB-26738E5FE9A6");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEN1, "T64FAXAZIEN1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, 8600, 3500, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, "BCA55766-D1A1-411B-97C0-CF07CB5733B0");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, "FAXAZIENDALE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FAXAZIENDALE, BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, MyGlb.VIS_DEFAREPOSTYL, 5, 12, 0, 271384705, "", "::RECT64FAXAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, "969AAE5F-814B-4BDF-B78D-5E3DF9294198");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64FAXAZIEND, "T64FAXAZIEND");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, 100, 10200, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, "ED91033E-EDF6-470C-B34F-C7304E2018B3");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, "ATTIVIHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ATTIVIHEADER, BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Attività prevalente", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, "BD12B12F-FEAE-4D10-B335-9B12D9CC8BCD");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_ATTIVIPREVAL, "ATTIVIPREVAL");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, 3000, 10200, 996, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, "2EA8246D-0CC8-455F-9361-9B056A01BB1E");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, "ATTIVITA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ATTIVITA, BUK_DATIGENEBOOK_SPAN_REATPRENDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Brief description of field content.", "::ATTIVITA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REATPRENDAGB, "13D02949-899A-4240-A576-DE8CD0751A4C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REATPRENDAGB, "REATPRENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, 200, 6200, 2942, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, "B467CC7E-B577-44A7-A05B-0C76CC631AB7");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, "CODENTEHEADE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODENTEHEADE, BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Ente Ministero", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, "ACD5A0A7-D495-47CE-8430-6718DC708DFB");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_CODIENTEMINI, "CODIENTEMINI");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODENTE, 3300, 6200, 1673, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODENTE, "2B703FDD-17A3-44B4-B295-4C41F51C6026");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODENTE, "CODENTE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODENTE, BUK_DATIGENEBOOK_SPAN_RETCOEMMEDGB, MyGlb.VIS_DEFAREPOSTYL, 3, 10, 6, 271384705, "Brief description of field content.", "::RECTCOENMIMI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETCOEMMEDGB, "6977EB6C-89C7-4DD4-B339-D064480F9010");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETCOEMMEDGB, "RETCOEMMEDGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, 7200, 6200, 2357, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, "199171C1-A82D-4708-A8BD-2E94EB6FFACE");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, "UNIONEHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_UNIONEHEADER, BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Unione di Comuni", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, "3D43D754-90EB-48AA-89ED-D1A99CF4DFDC");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_UNIONDICOMUN, "UNIONDICOMUN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_UNIONE, 9700, 6300, 517, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_UNIONE, "FE02BA2E-F2DF-4B16-B237-BE05BC79C7F6");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_UNIONE, "UNIONE");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_UNIONE, BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, "1E8D08D5-7A77-4C5A-9D74-F5B1FC0D959B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_NUVRUDCEDGBN, "NUVRUDCEDGBN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, 200, 6800, 2942, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, "7EE2B93A-7303-4B09-8869-B86AF902BDF8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, "TIPSUPCERHEA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPSUPCERHEA, BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Tipo Supporto", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, "036EE968-5F64-4C8E-A8B5-243D7C77FAB4");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_TIPOSUPPORTO, "TIPOSUPPORTO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, 3300, 6800, 2273, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, "D2BCB4C8-7E0D-4920-A8ED-F4FC298B8B16");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, "TIPOSUPPCERT");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOSUPPCERT, BUK_DATIGENEBOOK_SPAN_RETISUENDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO_SUPPORTO_CERT", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETISUENDAGB, "CD", "", (new IDVariant("C")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETISUENDAGB, "Floppy-disk", "", (new IDVariant()), null, "", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETISUENDAGB, "CB436052-E3BA-47FA-B493-C9C44B6D827C");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETISUENDAGB, "RETISUENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, 200, 8200, 1536, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, "CF34F518-5ABC-4F6F-952E-B1201E4A433F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, "TIPOESATHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOESATHEAD, BUK_DATIGENEBOOK_SPAN_TIPO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Tipo", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_TIPO, "D77AA203-D27B-4409-B7E8-29D2B63785D5");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_TIPO, "TIPO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, 2000, 8200, 4743, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, "6D2A3749-8D93-419A-A693-C2018ACBF255");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, "TIPOESATTORI");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_TIPOESATTORI, BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::TIPO_ESATTORIA", 1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, "Tesoreria Prov. Stato", "", (new IDVariant("T")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, "Concessionario", "", (new IDVariant("C")), null, "", -1);
    BUK_DATIGENEBOOK.SetSpanValueListItem(BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, "(nulla)", "Type the value and explain what it means.", (new IDVariant()), null, "", -1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, "8214215C-7831-44B7-B54C-FB0A4DAFBE27");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RETIENDAGEBO, "RETIENDAGEBO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, 200, 8900, 1642, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, "C7CB2C6C-7F99-4559-8FBB-D78A6D1740F3");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, "ESATTOHEADER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ESATTOHEADER, BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, "1D27B681-B3FF-4C72-AC04-A79674A2F347");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, 2000, 8900, 4743, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, "62DA6722-322F-40D0-980D-30780880D64A");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, "ESATTORIA");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_ESATTORIA, BUK_DATIGENEBOOK_SPAN_REDEENDAGEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 37, 0, 271384705, "Brief description of field content.", "::ESATTORIA", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_REDEENDAGEBO, "3E0BC6C1-1F64-4056-9008-FFD6882082A8");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_REDEENDAGEBO, "REDEENDAGEBO");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, 4800, 10200, 1497, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, "E4BD1D6C-AD6D-4E58-A7AE-AE5EE6FF3946");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, "SEDEINPSHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_SEDEINPSHEAD, BUK_DATIGENEBOOK_SPAN_SEDEINPS, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Sede INPS", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_SEDEINPS, "9C443BD0-6667-48A2-A2E1-692EB3C4FF21");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_SEDEINPS, "SEDEINPS");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, 6400, 10200, 4004, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, "B20A86B5-4252-439D-A803-2710A4028E2F");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, "SEDEINPS");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_SEDEINPS, BUK_DATIGENEBOOK_SPAN_RESEINENDAGB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::SEDE_INPS", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_RESEINENDAGB, "4479703D-AC21-4AC8-A10F-1B44AAED766B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_RESEINENDAGB, "RESEINENDAGB");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, 100, 4200, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, "0DFC5F70-07BF-4C0F-A43B-E968E4F39470");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, "MAILAZIEHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_MAILAZIEHEAD, BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Mail", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, "0619FD7E-BA17-4EB5-A3E2-5BC8C4D50681");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64MAILAZIE1, "T64MAILAZIE1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, 2900, 4200, 8200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, "EBDBE212-CF2F-450D-AA97-8B90150EE820");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, "MAILAZIENDAL");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_MAILAZIENDAL, BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::RECT64MAIAZI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, "A3CBDC62-4AF3-4E49-89DF-DDC36CDC4EED");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64MAILAZIEN, "T64MAILAZIEN");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, 100, 4800, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, "7CE1E36D-B279-4157-9896-25C68B8B3F08");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, "CODIEORIHEAD");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODIEORIHEAD, BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Codice EORI", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, "D49C8D52-069C-448C-A98D-92AE4BCE01DF");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64CODICEOR1, "T64CODICEOR1");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_DETAIL, BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, 2900, 4800, 4200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, "C7E2BD52-B6DC-4602-8183-9FB48899DBD0");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, "CODICEEORI");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_CODICEEORI, BUK_DATIGENEBOOK_SPAN_T64CODICEORI, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::RECT64CODEOR", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_T64CODICEORI, "1C2CFF6B-C544-4B07-BC13-FB85B92CD772");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_T64CODICEORI, "T64CODICEORI");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, BUK_DATIGENEBOOK_RPTBOX_PAGEFOOTER1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, "9C7F9B7C-56A8-4D42-BAF4-A76DE3FA0A73");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_DATIGENEBOOK.InitReportBox(BUK_DATIGENEBOOK_SEC_PAGEFOOTER, BUK_DATIGENEBOOK_RPTBOX_FOOTER, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_RPTBOX_FOOTER, "32AC341C-8E0E-42F8-9A86-FCBC8B8C9401");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_RPTBOX_FOOTER, "FOOTER");
    BUK_DATIGENEBOOK.InitBoxSpan(BUK_DATIGENEBOOK_RPTBOX_FOOTER, BUK_DATIGENEBOOK_SPAN_PAGECOUNT, MyGlb.VIS_CAMSENBORCEN, 5, 201, 0, 271319169, "", "", 1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SPAN_PAGECOUNT, "921E67D2-55EF-41E0-B645-B6D0C59D146B");
    BUK_DATIGENEBOOK.SetObjCode(BUK_DATIGENEBOOK_SPAN_PAGECOUNT, "PAGECOUNT");
    BUK_DATIGENEBOOK.InitSection(BUK_DATIGENEBOOK_RPT_NEWREPORT, BUK_DATIGENEBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATIGENEBOOK.SetSectionRendersInto(BUK_DATIGENEBOOK_SEC_REPORTFOOTER, BUK_DATIGENEBOOK_RPTBOX_PAGEBODY1);
    BUK_DATIGENEBOOK.SetRTCGuid(BUK_DATIGENEBOOK_SEC_REPORTFOOTER, "FFEA60FA-7D47-4F77-8375-FD0046F78463");
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
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, "8E926189-463C-4114-B6AF-C7C09C9B5518");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, "DATXMCCOBOPA");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, "2931EDD2-1B11-4650-BAC4-DBD1C19F3FA7");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, 1000, 3000, 19000, 22700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, "F56D300A-4E57-4E9E-BEB9-C4CE8351C545");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_DATXMLCCONBO.InitMastroBox(BUK_DATXMLCCONBO_MST_DATXMCCOBOPA, BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER, "5471C442-B611-411F-89EA-C4AAF18B5651");
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
      BUK_DATXMLCCONBO.SetReportQuery(BUK_DATXMLCCONBO_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0D817EF6-B682-48D7-B917-4329FBA85FEA");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DATXMLCCONBO_RPT_NEWREPORT_Init()
  {
    BUK_DATXMLCCONBO.InitReport(BUK_DATXMLCCONBO_RPT_NEWREPORT, 196609);
    BUK_DATXMLCCONBO_RPT_NEWREPORT_InitQuery(true, false);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPT_NEWREPORT, "C16A5308-9017-4D99-BA78-60AFE2BBC3E4");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPT_NEWREPORT, "NEWREPORT");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_REPORTHEADER, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_REPORTHEADER, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_REPORTHEADER, "360954BE-3082-41FD-9703-1FA128380516");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_PAGEHEADER, BUK_DATXMLCCONBO_RPTBOX_PAGEHEADER);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_PAGEHEADER, "0B6A5345-E571-4358-B91F-BBAFD5532454");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_PAGEHEADER, BUK_DATXMLCCONBO_RPTBOX_TITOLO, 0, 0, 18900, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_TITOLO, "BF90DBAF-5201-40D8-B29E-D622F3C8FF31");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_TITOLO, "TITOLO");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_TITOLO, BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Dati XML C. Conti", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, "0B4047B9-F571-4B06-A328-F00E0DD30C68");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DATIXMLCCONT, "DATIXMLCCONT");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_DETAIL, 5500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_DETAIL, "78CCA892-3589-4248-B347-BA94D00E8F90");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_DETAIL, "DETAIL");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, 100, 100, 5800, 2400, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, "8775F193-7CD2-47FE-8AE9-64E7CA3D562B");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, "DELAPPCONGRO");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELAPPCONGRO, BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Delibera Approvazione Consuntivo", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, "C03E457A-F454-4604-A0FA-5C136C73EAC2");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DELIAPPRCONS, "DELIAPPRCONS");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, 400, 1100, 1195, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, "2149E287-FF38-4B46-8E2C-4123D439D582");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, "DELIBCCHEADE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELIBCCHEADE, BUK_DATXMLCCONBO_SPAN_NUMERO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Numero", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_NUMERO, "2744BB9F-97EC-45D3-B990-F2453DCF03C1");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_NUMERO, "NUMERO");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, 1700, 1100, 1020, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, "2C3C29BF-27BE-4B4F-B8EA-8D72A4312ABF");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, "DELIBERACC");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DELIBERACC, BUK_DATXMLCCONBO_SPAN_RENUENDAXCCB, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::DELIBERA_CC", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RENUENDAXCCB, "8C5473C3-8E10-43FB-BC44-413133547CB0");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RENUENDAXCCB, "RENUENDAXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, 400, 1900, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, "F0BB58EB-0F5A-45CB-A4CA-0BD441A4DD11");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, "DATADELCCHEA");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DATADELCCHEA, BUK_DATXMLCCONBO_SPAN_DATA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_DATA, "B4FA0B76-0083-4D22-947A-4F46882D5175");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_DATA, "DATA");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_DATADELCC, 1700, 1900, 2000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, "54F6416A-5D38-4D70-80DA-730713685FAB");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, "DATADELCC");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_DATADELCC, BUK_DATXMLCCONBO_SPAN_REDAENDAXCCB, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::DATA_DEL_CC", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_REDAENDAXCCB, "7C925196-38A1-4625-BDC7-2CF8EFE46CA4");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_REDAENDAXCCB, "REDAENDAXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, 200, 2900, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, "7349264E-C12E-4B1A-86B0-965BA6599CAC");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, "ABITANHEADER");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_ABITANHEADER, BUK_DATXMLCCONBO_SPAN_ABITANTI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Abitanti", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_ABITANTI, "34663469-880B-4FE3-906E-98C2EA73511D");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_ABITANTI, "ABITANTI");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_ABITANTI, 2300, 2900, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, "DA21C1D0-027B-4807-B232-1588C4D87CA2");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, "ABITANTI");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_ABITANTI, BUK_DATXMLCCONBO_SPAN_REABENDAXCCB, MyGlb.VIS_DEFAREPOSTYL, 1, 7, 0, 271384705, "Brief description of field content.", "::ABITANTI", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_REABENDAXCCB, "998F5BCD-0C49-42CC-87DF-42AA0B25B516");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_REABENDAXCCB, "REABENDAXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, 200, 3600, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, "7C64AF4A-BC09-4DB0-806A-CD061E8C58AD");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, "SUPERFHEADER");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_SUPERFHEADER, BUK_DATXMLCCONBO_SPAN_SUPERFICIE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Superficie", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_SUPERFICIE, "640B3DB0-3DFB-4D09-97D1-394EAD10861F");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_SUPERFICIE, "SUPERFICIE");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, 2300, 3600, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, "F70F5390-FB61-4556-A2D7-49A02858D3D3");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, "SUPERFICIE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_SUPERFICIE, BUK_DATXMLCCONBO_SPAN_RESUENDAXCCB, MyGlb.VIS_DEFAREPOSTYL, 3, 7, 6, 271384705, "Brief description of field content.", "::SUPERFICIE", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RESUENDAXCCB, "F5499BBF-3B3D-4DAF-A2FE-A9A6964DEDFB");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RESUENDAXCCB, "RESUENDAXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, 200, 4200, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, "9348EE5C-17C0-44AF-9E89-294604982D88");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, "CODIISTAHEAD");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODIISTAHEAD, BUK_DATXMLCCONBO_SPAN_CODICEISTAT, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Istat", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_CODICEISTAT, "0D682FE6-5983-44DC-BD43-21CDD10483E3");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_CODICEISTAT, "CODICEISTAT");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, 2300, 4200, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, "FB7C3C18-E4BE-4FB5-85CC-3CCAE9A04E61");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, "CODICEISTAT");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODICEISTAT, BUK_DATXMLCCONBO_SPAN_RECOISEDXCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 6, 0, 271384705, "Brief description of field content.", "::CODICE_ISTAT", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RECOISEDXCCB, "7AD690A0-2EB4-43C7-BC1D-D13352607576");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RECOISEDXCCB, "RECOISEDXCCB");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, 200, 4800, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, "80384775-525F-429B-B676-643390C0AF36");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, "CODIENTEHEAD");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODIENTEHEAD, BUK_DATXMLCCONBO_SPAN_CODICEENTE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Codice Ente", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_CODICEENTE, "0F884D12-1189-4CF4-9F4A-77A4D34437FB");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_CODICEENTE, "CODICEENTE");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_DETAIL, BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, 2300, 4800, 1489, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, "B4D0445E-DB25-4B72-ABAA-5E03C0FF7F91");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, "CODICEENTE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_CODICEENTE, BUK_DATXMLCCONBO_SPAN_RECOENEDXCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384705, "Brief description of field content.", "::CODICE_ENTE", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_RECOENEDXCCB, "8DEB78AA-1262-4B3F-86C9-3EA2BCE23B85");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_RECOENEDXCCB, "RECOENEDXCCB");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGEFOOTER);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, "1D16D9DE-BC3F-4C25-9F23-5A7F3AFBBB94");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_DATXMLCCONBO.InitReportBox(BUK_DATXMLCCONBO_SEC_PAGEFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGE, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_RPTBOX_PAGE, "DA859EA0-1690-491B-9223-5B93DEC07E2D");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_RPTBOX_PAGE, "PAGE");
    BUK_DATXMLCCONBO.InitBoxSpan(BUK_DATXMLCCONBO_RPTBOX_PAGE, BUK_DATXMLCCONBO_SPAN_TSDXCCBEPNTS, MyGlb.VIS_CAMSENBORCEN, 5, 201, 0, 271384705, "", "", 1);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SPAN_TSDXCCBEPNTS, "CCBFA41A-A09F-433F-B7C7-446036942A16");
    BUK_DATXMLCCONBO.SetObjCode(BUK_DATXMLCCONBO_SPAN_TSDXCCBEPNTS, "TSDXCCBEPNTS");
    BUK_DATXMLCCONBO.InitSection(BUK_DATXMLCCONBO_RPT_NEWREPORT, BUK_DATXMLCCONBO_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DATXMLCCONBO.SetSectionRendersInto(BUK_DATXMLCCONBO_SEC_REPORTFOOTER, BUK_DATXMLCCONBO_RPTBOX_PAGEBODY);
    BUK_DATXMLCCONBO.SetRTCGuid(BUK_DATXMLCCONBO_SEC_REPORTFOOTER, "8851AB97-C2E1-4426-A968-40148AE91692");
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
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_OnChangeRow();
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
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_AfterFind(CmdFind);
    if (SrcObj == PAN_DATIXMLCCONT) PAN_DATIXMLCCONT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_AfterCommit(RowUpdated, RowError);
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
    if (SrcObj == PAN_DATIGENERALI) PAN_DATIGENERALI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
