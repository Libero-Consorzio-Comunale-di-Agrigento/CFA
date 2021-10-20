// **********************************************
// Tipi Registro
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiRegistro extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_TIPIREGISTRO_ACCERTAMENSP = 0;
  private static int GRP_TIPIREGISTRO_IMPEGNOSP = 1;
  private static int GRP_TIPIREGISTRO_IMPEGNORC = 2;
  private static int GRP_TIPIREGISTRO_ACCERTAMENRC = 3;
  private static int GRP_TIPIREGISTRO_CAPITOLOIVA = 4;

  private static int PFL_TIPIREGISTRO_TIPOREGISTRO = 0;
  private static int PFL_TIPIREGISTRO_TIPOBOLLATO = 1;
  private static int PFL_TIPIREGISTRO_INTESTAZIONE = 2;
  private static int PFL_TIPIREGISTRO_DEFINITIVO = 3;
  private static int PFL_TIPIREGISTRO_ATTIVITA = 4;
  private static int PFL_TIPIREGISTRO_TIPOBOLVENSP = 5;
  private static int PFL_TIPIREGISTRO_TIPOBOLVENRC = 6;
  private static int PFL_TIPIREGISTRO_NUMEROACCSP = 7;
  private static int PFL_TIPIREGISTRO_ETICHACCERSP = 8;
  private static int PFL_TIPIREGISTRO_ANNOACCSP = 9;
  private static int PFL_TIPIREGISTRO_DUALAPRI2 = 10;
  private static int PFL_TIPIREGISTRO_INFOACC2 = 11;
  private static int PFL_TIPIREGISTRO_IMPEGNOSP = 12;
  private static int PFL_TIPIREGISTRO_NUMEROIMPSP = 13;
  private static int PFL_TIPIREGISTRO_ANNOIMPSP = 14;
  private static int PFL_TIPIREGISTRO_DUALAPRI = 15;
  private static int PFL_TIPIREGISTRO_DUALINFO = 16;
  private static int PFL_TIPIREGISTRO_NUMEROIMPRC = 17;
  private static int PFL_TIPIREGISTRO_ANNOIMPRC = 18;
  private static int PFL_TIPIREGISTRO_DUALAPRIIMPR = 19;
  private static int PFL_TIPIREGISTRO_DUALINFO1 = 20;
  private static int PFL_TIPIREGISTRO_IMPEGNORC = 21;
  private static int PFL_TIPIREGISTRO_NUMEROACCRC = 22;
  private static int PFL_TIPIREGISTRO_NUOVCAMPSTA3 = 23;
  private static int PFL_TIPIREGISTRO_ANNOACCRC = 24;
  private static int PFL_TIPIREGISTRO_APRIACC = 25;
  private static int PFL_TIPIREGISTRO_INFOACCRC = 26;
  private static int PFL_TIPIREGISTRO_ETICHACCERRC = 27;
  private static int PFL_TIPIREGISTRO_ESENTE = 28;
  private static int PFL_TIPIREGISTRO_VENTILAZIONE = 29;
  private static int PFL_TIPIREGISTRO_CGE = 30;
  private static int PFL_TIPIREGISTRO_CODIGESTDESC = 31;
  private static int PFL_TIPIREGISTRO_CODLIVELLO5 = 32;
  private static int PFL_TIPIREGISTRO_CODLIVE5DESC = 33;
  private static int PFL_TIPIREGISTRO_CAPITOLOIVA = 34;
  private static int PFL_TIPIREGISTRO_ARTICOLOIVA = 35;
  private static int PFL_TIPIREGISTRO_CAPDESCRIZIO = 36;
  private static int PFL_TIPIREGISTRO_ETICHCAPIIVA = 37;
  private static int PFL_TIPIREGISTRO_FATTOREIVA = 38;
  private static int PFL_TIPIREGISTRO_PROGETTOIVA = 39;
  private static int PFL_TIPIREGISTRO_IMPECON = 40;
  private static int PFL_TIPIREGISTRO_FATTORE = 41;
  private static int PFL_TIPIREGISTRO_CENTRO = 42;
  private static int PFL_TIPIREGISTRO_NORILIVA = 43;
  private static int PFL_TIPIREGISTRO_CORRISPETTIV = 44;
  private static int PFL_TIPIREGISTRO_IMPBOLLDACAU = 45;
  private static int PFL_TIPIREGISTRO_FATTURAPERS = 46;
  private static int PFL_TIPIREGISTRO_BOLLETTINI = 47;
  private static int PFL_TIPIREGISTRO_RIMBORSI = 48;
  private static int PFL_TIPIREGISTRO_IDMODELLO = 49;
  private static int PFL_TIPIREGISTRO_REGISTBOLLAT = 50;
  private static int PFL_TIPIREGISTRO_UTENTEINSERI = 51;
  private static int PFL_TIPIREGISTRO_DATAINSERIME = 52;
  private static int PFL_TIPIREGISTRO_UTENTULTIAGG = 53;
  private static int PFL_TIPIREGISTRO_DATAULTIMAGG = 54;
  private static int PFL_TIPIREGISTRO_NUOVCAMPSTAT = 55;
  private static int PFL_TIPIREGISTRO_NUOVCAMPSTA1 = 56;
  private static int PFL_TIPIREGISTRO_ETICSCEIMPSP = 57;
  private static int PFL_TIPIREGISTRO_INFOIMPEGNSP = 58;
  private static int PFL_TIPIREGISTRO_ETICHSCELACC = 59;
  private static int PFL_TIPIREGISTRO_INFOACC = 60;
  private static int PFL_TIPIREGISTRO_ETICSCEIMPSC = 61;
  private static int PFL_TIPIREGISTRO_INFOIMPEGNSC = 62;
  private static int PFL_TIPIREGISTRO_NUOVCAMPSTA2 = 63;
  private static int PFL_TIPIREGISTRO_ISTITUCOMMER = 64;
  private static int PFL_TIPIREGISTRO_ETICSCELACC1 = 65;
  private static int PFL_TIPIREGISTRO_INFOACC1 = 66;
  private static int PFL_TIPIREGISTRO_PAGOPA = 67;
  private static int PFL_TIPIREGISTRO_CODSERVIPAGO = 68;

  private static int PPQRY_T17 = 0;

  private static int PPQRY_CODICIGESTIO = 1;
  private static int PPQRY_CAP = 2;
  private static int PPQRY_LIVELLO5 = 3;
  private static int PPQRY_ISTCOMM = 4;
  private static int PPQRY_DUAL = 5;
  private static int PPQRY_DUAL1 = 6;

  private static int PPQRY_T09 = 7;
  private static int PPQRY_T8 = 8;
  private static int PPQRY_T04 = 9;
  private static int PPQRY_MODELLIDATI = 10;


  IDPanel PAN_TIPIREGISTRO;
  CIDREObj BUK_TIPIREGIBOOK;
  OBook BKW_TIPIREGIBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG = 1;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIREGIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1 = 4;
  private static int BUK_TIPIREGIBOOK_RPTBOX_PAGEFOOTER1 = 5;
  private static int BUK_TIPIREGIBOOK_RPTBOX_TITOLO = 6;

  //
  // Reports constants
  private static int BUK_TIPIREGIBOOK_RPT_NEWREPORT = 7;
  private static int BUK_TIPIREGIBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_TIPIREGIBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1 = 10;
  private static int BUK_TIPIREGIBOOK_SPAN_TIPOREGISTRO = 11;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16 = 12;
  private static int BUK_TIPIREGIBOOK_SPAN_INTESTAZIONE = 13;
  private static int BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF = 14;
  private static int BUK_TIPIREGIBOOK_SPAN_BOLLATODEF = 15;
  private static int BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1 = 16;
  private static int BUK_TIPIREGIBOOK_SPAN_ATTIVITA1 = 17;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12 = 18;
  private static int BUK_TIPIREGIBOOK_SPAN_ATTIVITA = 19;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13 = 20;
  private static int BUK_TIPIREGIBOOK_SPAN_ESENTE = 21;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14 = 22;
  private static int BUK_TIPIREGIBOOK_SPAN_C1 = 23;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6 = 24;
  private static int BUK_TIPIREGIBOOK_SPAN_RISORSAIVA = 25;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7 = 26;
  private static int BUK_TIPIREGIBOOK_SPAN_C2 = 27;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8 = 28;
  private static int BUK_TIPIREGIBOOK_SPAN_C3 = 29;
  private static int BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC = 30;
  private static int BUK_TIPIREGIBOOK_SPAN_C4 = 31;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15 = 32;
  private static int BUK_TIPIREGIBOOK_SPAN_C5 = 33;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10 = 34;
  private static int BUK_TIPIREGIBOOK_SPAN_C6 = 35;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11 = 36;
  private static int BUK_TIPIREGIBOOK_SPAN_C = 37;
  private static int BUK_TIPIREGIBOOK_SEC_TITOLO = 38;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX9 = 39;
  private static int BUK_TIPIREGIBOOK_SPAN_VARIADIBILAN = 40;
  private static int BUK_TIPIREGIBOOK_SEC_DETAIL = 41;
  private static int BUK_TIPIREGIBOOK_RPTBOX_TIPOREGISTRO = 42;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB = 43;
  private static int BUK_TIPIREGIBOOK_RPTBOX_INTESTAZIONE = 44;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0DETIRTR1 = 45;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX = 46;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0TIBTRTRB = 47;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1 = 48;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0TBDTRTRB = 49;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX2 = 50;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0ATTIRTRB = 51;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX3 = 52;
  private static int BUK_TIPIREGIBOOK_SPAN_RET0DETIRTRB = 53;
  private static int BUK_TIPIREGIBOOK_RPTBOX_ESENTE = 54;
  private static int BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN = 55;
  private static int BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE = 56;
  private static int BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN = 57;
  private static int BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA = 58;
  private static int BUK_TIPIREGIBOOK_SPAN_TSRTCITRTRBI = 59;
  private static int BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA = 60;
  private static int BUK_TIPIREGIBOOK_SPAN_RECADETIRTRB = 61;
  private static int BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI = 62;
  private static int BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN = 63;
  private static int BUK_TIPIREGIBOOK_RPTBOX_ACC = 64;
  private static int BUK_TIPIREGIBOOK_SPAN_TSRTNASTRTRB = 65;
  private static int BUK_TIPIREGIBOOK_RPTBOX_IMPSP = 66;
  private static int BUK_TIPIREGIBOOK_SPAN_TSRTNISTRTRB = 67;
  private static int BUK_TIPIREGIBOOK_RPTBOX_IMPRC = 68;
  private static int BUK_TIPIREGIBOOK_SPAN_TSRTNIRTRTRB = 69;
  private static int BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOACC = 70;
  private static int BUK_TIPIREGIBOOK_SPAN_REACDETIRTRB = 71;
  private static int BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOIMP = 72;
  private static int BUK_TIPIREGIBOOK_SPAN_REIMDETIRTRB = 73;
  private static int BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIIMP1 = 74;
  private static int BUK_TIPIREGIBOOK_SPAN_REIMDE2TRTRB = 75;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4 = 76;
  private static int BUK_TIPIREGIBOOK_SPAN_RETTBVSTRTRB = 77;
  private static int BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5 = 78;
  private static int BUK_TIPIREGIBOOK_SPAN_RETTBVRTRTRB = 79;
  private static int BUK_TIPIREGIBOOK_RPTBOX_ACC1 = 80;
  private static int BUK_TIPIREGIBOOK_SPAN_TSRTNARTRTRB = 81;
  private static int BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIACC1 = 82;
  private static int BUK_TIPIREGIBOOK_SPAN_REACDE1TRTRB = 83;
  private static int BUK_TIPIREGIBOOK_SEC_PAGEFOOTER = 84;
  private static int BUK_TIPIREGIBOOK_SEC_REPORTFOOTER = 85;


  // Definition of Global Variables
  private IDVariant CAMPOFATTORE = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSONRIMBOR = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSONRILIVA = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSONCORRIS = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant QUALESCELIMP = new IDVariant(0,IDVariant.STRING);
  private IDVariant QUALESCELACC = new IDVariant(0,IDVariant.STRING);
  private IDVariant PAGOPA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T17(IMDB);
    Init_PQRY_T6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T17, 40);
    IMDB.set_TblCode(IMDBDef9.PQRY_T17, "PQRY_T17");
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ATTIVITA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ESENTE, "ESENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ESENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_VENTILAZIONE_IVA, "VENTILAZIONE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_VENTILAZIONE_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CAPITOLO_IVA, "CAPITOLO_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CAPITOLO_IVA,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ARTICOLO_IVA, "ARTICOLO_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ARTICOLO_IVA,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_ESIGIBILITA, "TIPO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_ESIGIBILITA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FLAG_IMP_ECO, "FLAG_IMP_ECO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FLAG_IMP_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTORE_IVA, "FATTORE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTORE_IVA,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_PROGETTO_IVA, "PROGETTO_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_PROGETTO_IVA,5,9,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_RILEVANTE_IVA, "RILEVANTE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_RILEVANTE_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CORRISPETTIVI, "CORRISPETTIVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_CORRISPETTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_IMP_BOLLO_DA_CAUSALE, "IMP_BOLLO_DA_CAUSALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_IMP_BOLLO_DA_CAUSALE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTURA_PERSONALIZZATA, "FATTURA_PERSONALIZZATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_FATTURA_PERSONALIZZATA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_BOLLETTINI, "BOLLETTINI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_BOLLETTINI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_RIMBORSI, "RIMBORSI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_RIMBORSI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ID_MODELLO, "ID_MODELLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ID_MODELLO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_SP, "TIPO_BOLLATO_VENDITE_SP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_SP,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_RC, "TIPO_BOLLATO_VENDITE_RC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_RC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_ACC_SP, "NUMERO_ACC_SP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_ACC_SP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_ACC_SP, "ANNO_ACC_SP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_ACC_SP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_IMP_SP, "NUMERO_IMP_SP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_IMP_SP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_IMP_SP, "ANNO_IMP_SP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_IMP_SP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_IMP_RC, "NUMERO_IMP_RC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_IMP_RC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_IMP_RC, "ANNO_IMP_RC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_IMP_RC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_ACC_RC, "ANNO_ACC_RC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_ANNO_ACC_RC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_ACC_RC, "NUMERO_ACC_RC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_NUMERO_ACC_RC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_PAGO_PA, "PAGO_PA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_PAGO_PA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_COD_SERVIZIO_PAGOPA, "COD_SERVIZIO_PAGOPA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T17,IMDBDef9.PQSL_T17_COD_SERVIZIO_PAGOPA,5,100,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T17, 0);
  }

  private static void Init_PQRY_T6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T6, 27);
    IMDB.set_TblCode(IMDBDef9.PQRY_T6, "PQRY_T6");
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_REGISTRO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORT04DESC, "RECORT04DESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORT04DESC,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ATTIVITA, "ATTIVITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ATTIVITA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORT09DESC, "RECORT09DESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORT09DESC,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ESENTE, "ESENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ESENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_VENTILAZIONE_IVA, "VENTILAZIONE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_VENTILAZIONE_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_CAPITOLO_IVA, "CAPITOLO_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_CAPITOLO_IVA,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ARTICOLO_IVA, "ARTICOLO_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_ARTICOLO_IVA,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RIMBORSI, "RIMBORSI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RIMBORSI,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RET0TIBOVESP, "RET0TIBOVESP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RET0TIBOVESP,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RET0TIBOVERC, "RET0TIBOVERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RET0TIBOVERC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUACSP, "RECT04NUACSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUACSP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANACSP, "RECT04ANACSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANACSP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUIMSP, "RECT04NUIMSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUIMSP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANIMSP, "RECT04ANIMSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANIMSP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUIMRC, "RECT04NUIMRC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUIMRC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANIMRC, "RECT04ANIMRC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANIMRC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORACCDESC, "RECORACCDESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORACCDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORIMPDESC, "RECORIMPDESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECORIMPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOIMPDESC2, "RECOIMPDESC2");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOIMPDESC2,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUACRC, "RECT04NUACRC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04NUACRC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANACRC, "RECT04ANACRC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECT04ANACRC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOACCDESC1, "RECOACCDESC1");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOACCDESC1,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOT04PAGPA, "RECOT04PAGPA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T6,IMDBDef9.PQSL_T6_RECOT04PAGPA,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiRegistro(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiRegistro()
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
    FormIdx = MyGlb.FRM_TIPIREGISTRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EB167FF7-31A7-4E18-AC62-9A1068A3AD0A";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 860;
    DesignHeight = 518;
    set_Caption(new IDVariant("Tipi Registro"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 860;
    Frames[1].Height = 492;
    Frames[1].Caption = "Tipi Registro";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 492;
    PAN_TIPIREGISTRO = new IDPanel(w, this, 1, "PAN_TIPIREGISTRO");
    Frames[1].Content = PAN_TIPIREGISTRO;
    PAN_TIPIREGISTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIREGISTRO.VS = MainFrm.VisualStyleList;
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 492-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIREGIBOOK != null)
      PAN_TIPIREGISTRO.SetBook(BUK_TIPIREGIBOOK);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B8B2AC21-2ABA-4044-8B4C-6A6280F60AAF");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4340, 396, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIREGISTRO.InitStatus = 2;
    PAN_TIPIREGISTRO_Init();
    PAN_TIPIREGISTRO_InitFields();
    PAN_TIPIREGISTRO_InitQueries();
    BKW_TIPIREGIBOOK = new OBook(this);
    BUK_TIPIREGIBOOK = new CIDREObj(BKW_TIPIREGIBOOK);
    BKW_TIPIREGIBOOK.iGuid = "876A7F1E-E855-4343-8F0F-FDC3D2D085EA";
    BKW_TIPIREGIBOOK.Code = "BUK_TIPIREGIBOOK";
    BKW_TIPIREGIBOOK.BookObj = BUK_TIPIREGIBOOK;
    BKW_TIPIREGIBOOK.InitDefMasks();
    BUK_TIPIREGIBOOK.InitBook(1, 1245185, "Tipi Registro Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIREGIBOOK.InitHTML();
    BUK_TIPIREGIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIREGIBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIREGIBOOK.SetRTCGuid(0, "876A7F1E-E855-4343-8F0F-FDC3D2D085EA");
    BUK_TIPIREGIBOOK.SetObjCode(0, "TIPIREGIBOOK");
    if (PAN_TIPIREGISTRO != null)
      PAN_TIPIREGISTRO.SetBook(BUK_TIPIREGIBOOK);
    BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG_Init();
    BUK_TIPIREGIBOOK_RPT_NEWREPORT_Init();
    BUK_TIPIREGIBOOK_InitLinks();
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
      PAN_TIPIREGISTRO.UpdatePanel(MainFrm);
      // BUK_TIPIREGIBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_DUALAPRI2) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_DUALAPRI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_DUALAPRIIMPR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_APRIACC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_CAPDESCRIZIO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_FATTOREIVA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROGET && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_PROGETTOIVA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_CENTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_ETICSCEIMPSP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_ETICHSCELACC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_ETICSCEIMPSC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_TIPIREGISTRO.FrIndex)
    {
      if (IdxFieldActived ==PFL_TIPIREGISTRO_ETICSCELACC1) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_TIPIREGIBOOK")) return BUK_TIPIREGIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiRegistro);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiRegistro.class.getName() : (Glb.ClassWithPackage(TipiRegistro.class) ? TipiRegistro.class.getName().substring(TipiRegistro.class.getPackage().getName().length() + 1) : TipiRegistro.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Registro On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIREGISTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIREGISTRO);
      // 
      // Tipi Registro On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_TIPIREGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIREGISTRO_CODIGESTDESC,(new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_CODIGESTDESC))).stringValue()); 
      PAN_TIPIREGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIREGISTRO_CAPDESCRIZIO,(new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_CAPDESCRIZIO))).stringValue()); 
      PAN_TIPIREGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIREGISTRO_CODLIVE5DESC,(new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_CODLIVE5DESC))).stringValue()); 
      AbilitazioneCampi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro On Database Error Event
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
  private void PAN_TIPIREGISTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIREGISTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Registro On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIREGISTRO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        IDVariant v_TIPOREGISTRO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_TIPOBOLLATO = new IDVariant(0,IDVariant.INTEGER);
        v_TIPOREGISTRO = IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0);
        v_TIPOBOLLATO = IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO, 0);
        if (v_TIPOREGISTRO.equals((new IDVariant(1)), true))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  T04 A ");
          SQL.append("where (A.TIPO_BOLLATO_DEF = " + IDL.CSql(v_TIPOBOLLATO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_REGISTRO = 2) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant v_RIGA = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
            SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
            SQL.append("  A.TIPO_BOLLATO_DEF as T04TIPBOLDEF ");
            SQL.append("from ");
            SQL.append("  T04 A ");
            SQL.append("order by ");
            SQL.append("  A.TIPO_REGISTRO, ");
            SQL.append("  A.TIPO_BOLLATO ");
            C5 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!C5.EOF()) C5.MoveNext();
            while (!C5.EOF())
            {
              v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
              if (C5.Get("T04TIPOREGIS").equals((new IDVariant(2)), true) && C5.Get("T04TIPBOLDEF").equals(v_TIPOBOLLATO, true))
              {
                break;
              }
              C5.MoveNext();
            }
            C5.Close();
            // 
            // messaggio
            // 
            {
              IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
              v_MESSAGGIO = (new IDVariant("Impossibile eliminare la registrazione.Risulta come 'Bollato Definitivo' nella riga: ", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(v_MESSAGGIO, IDL.ToString(v_RIGA))); 
              Cancel.set((new IDVariant(-1)));
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPIREGISTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_UTENTE_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_DATA_INSERIMENTO, 0, IDL.Today());
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_DATA_ULTIMO_AGG, 0, (new IDVariant()));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_UTENTE_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if ((Column.equals((new IDVariant(PFL_TIPIREGISTRO_NUMEROACCSP)), true) || Column.equals((new IDVariant(PFL_TIPIREGISTRO_ANNOACCSP)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEACC A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Accertamento non presente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_TIPIREGISTRO_NUMEROACCRC)), true) || Column.equals((new IDVariant(PFL_TIPIREGISTRO_ANNOACCRC)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEACC A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Accertamento non presente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_TIPIREGISTRO_NUMEROIMPSP)), true) || Column.equals((new IDVariant(PFL_TIPIREGISTRO_ANNOIMPSP)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEIMP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Impegno non presente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_TIPIREGISTRO_NUMEROIMPRC)), true) || Column.equals((new IDVariant(PFL_TIPIREGISTRO_ANNOIMPRC)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEIMP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Impegno non presente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_TIPIREGISTRO_ATTIVITA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ATTIVITA, 0))))
        {
          if (IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_SP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_RC, 0, (new IDVariant()));
          }
          else
          {
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_TIPIREGISTRO_TIPOREGISTRO)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_VENDITE_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Capitolo Iva Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_CAPITOLOIVA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Capitolo Iva Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CAPITOLO_IVA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ARTICOLO_IVA, 0))))
      {
        if (!(MainFrm.CapitoloPresente(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CAPITOLO_IVA, 0), IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ARTICOLO_IVA, 0))))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Codifica non presente nel Piano dei Conti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroCapitoloIvaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro ARTICOLO IVA Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_ARTICOLOIVA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro ARTICOLO IVA Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CAPITOLO_IVA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ARTICOLO_IVA, 0))))
      {
        if (!(MainFrm.CapitoloPresente(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CAPITOLO_IVA, 0), IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ARTICOLO_IVA, 0))))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Codifica non presente nel Piano dei Conti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroARTICOLOIVAValidateEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CAPITOLO_IVA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ARTICOLO_IVA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && CAMPOFATTORE.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE_IVA, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && CAMPOFATTORE.equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_PROGETTO_IVA, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        if (QUALESCELACC.equals((new IDVariant("SP")), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        if (QUALESCELIMP.equals((new IDVariant("SP")), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        }
        else if (QUALESCELIMP.equals((new IDVariant("RC")), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "EndModalEvent", _e);
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
    IDVariant v_NOMECOMANDOR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECOMANDOR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECOMANDOC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_NOMECOMANDOR1 = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("rimborsi")));
      v_NOMECOMANDOR = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("gestione_no_ril_iva")));
      v_NOMECOMANDOC = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("gestione_corrispettivi")));
      PAN_TIPIREGISTRO.set_FixedCols((new IDVariant(2)).intValue());
      if (v_NOMECOMANDOR1.equals((new IDVariant("rimborsi_attiva")), true))
      {
        PERSONRIMBOR = (new IDVariant(-1));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PERSONRIMBOR = (new IDVariant(0));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_NOMECOMANDOR.equals((new IDVariant("gestione_no_ril_iva_attiva")), true))
      {
        PERSONRILIVA = (new IDVariant(-1));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PERSONRILIVA = (new IDVariant(0));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_NOMECOMANDOC.equals((new IDVariant("gestione_corrispettivi_attiva")), true))
      {
        PERSONCORRIS = (new IDVariant(-1));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIOFATTUR.equals((new IDVariant("SI")), true) && MainFrm.RETTE.equals((new IDVariant("SI")), true))
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PERSONCORRIS = (new IDVariant(0));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_TIPIREGISTRO.ClearValueList(PFL_TIPIREGISTRO_TIPOREGISTRO);
      PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(1)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(1)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(1)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(2)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(2)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(2)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(3)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(3)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(3)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(4)), ((new IDVariant(4)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(4)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(4)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(4)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(4)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(4)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(5)), ((new IDVariant(5)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(5)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(5)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(5)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(5)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(5)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (MainFrm.GESTIOFATTUR.equals((new IDVariant("SI")), true))
      {
        PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(6)), ((new IDVariant(6)).equals((new IDVariant(1)))? new IDVariant("1 - Acquisti") : (new IDVariant(6)).equals((new IDVariant(2)))? new IDVariant("2 - Acquisti in Attesa di Esigibilità") : (new IDVariant(6)).equals((new IDVariant(3)))? new IDVariant("3 - Vendite") : (new IDVariant(6)).equals((new IDVariant(4)))? new IDVariant("4 - Corrispettivi") : (new IDVariant(6)).equals((new IDVariant(5)))? new IDVariant("5 - Vendite Esigibili al Pagamento") : (new IDVariant(6)).equals((new IDVariant(6)))? new IDVariant("6 - Vendite Debitori non Codificati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // PAGO PA -------------------------------------
      // 
      IDVariant v_SCHIAVE = new IDVariant(0,IDVariant.STRING);
      v_SCHIAVE = (new IDVariant("PRODUCTS/PAGO_PA/FS"));
      IDVariant v_SREGPAGOPA = new IDVariant(0,IDVariant.STRING);
      v_SREGPAGOPA = (new IDVariant("PAGO_PA_ATTIVA"));
      IDVariant v_VREGISTVALOR = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'NO') as NULVALREVANO ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = " + IDL.CSql(v_SCHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(v_SREGPAGOPA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VREGISTVALOR = QV.Get("NULVALREVANO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_VREGISTVALOR,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAGOPA = (new IDVariant("SI"));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAGOPA = (new IDVariant("NO"));
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // ---------- --------------------------------------
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Fattore IVA Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_FATTOREIVA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Fattore IVA Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE_IVA, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE_IVA, 0), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE_IVA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroFattoreIVAValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Fattore Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_FATTORE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Fattore Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE, 0), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FATTORE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroFattoreValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Centro Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_CENTRO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Centro Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CENTRO, 0))))
      {
        if (MainFrm.CentriPresente(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CENTRO, 0), IDL.Today()).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Centro non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CENTRO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroCentroValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Cge   Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_CGE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CGE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Cge   Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CODICE_GESTIONALE, 0))))
      {
        v_CGE = MainFrm.CodiciGestionaliLk(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CODICE_GESTIONALE, 0), (new IDVariant("E")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (v_CGE.equals((new IDVariant(-1)), true))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Codice Gestionale Inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CODICE_GESTIONALE, 0, (new IDVariant()));
        }
        if (v_CGE.equals((new IDVariant(2)), true))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Codice Gestionale Scaduto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_CODICE_GESTIONALE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroCgeValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Progetto IVA Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_PROGETTOIVA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Progetto IVA Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_PROGETTO_IVA, 0))))
      {
        if (MainFrm.ProgettiLk(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_PROGETTO_IVA, 0)).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Progetto iva inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_PROGETTO_IVA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroProgettoIVAValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Registro Definitivo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_TIPIREGISTRO_DEFINITIVO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Registro Definitivo Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, 0))))
      {
        if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  T04 A ");
          SQL.append("where (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_REGISTRO = 1) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Attenzione: il 'Bollato definitivo' deve fare riferimento ad una riga esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
          }
        }
        if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  T04 A ");
          SQL.append("where (A.TIPO_BOLLATO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_REGISTRO = 3) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Attenzione: il 'Bollato definitivo' deve fare riferimento ad una riga esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            IMDB.set_Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "TipiRegistroDefinitivoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione CAP
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCAP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione CAP Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
        }
        else
        {
        }
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
        MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneCAP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattoreIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore IVA Body
      // Procedure Body
      // 
      CAMPOFATTORE = (new IDVariant(1));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneFattoreIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Body
      // Procedure Body
      // 
      CAMPOFATTORE = (new IDVariant(2));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Progetto IVA
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProgettoIVA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Progetto IVA Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneProgettoIVA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Cod Livello 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SelezioneCodLivello5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Cod Livello 5 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "SelezioneCodLivello5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Campi
  // **********************************************************************
  public int AbilitazioneCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Campi Body
      // Procedure Body
      // 
      if (!(PAN_TIPIREGISTRO.IsNewRow()))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Visibilità campo Esente
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Visibilità campo Ventilazione
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Visibilità campo Cge
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Visibilità campi CAP
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Visibilità Campo Fattore IVA
      // 
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Progetto IVA
      // 
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0 && MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSCFPEATTI, 0).equals((new IDVariant(1)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Imp. Econ.
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(4)), true) && MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Fattore
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FLAG_IMP_ECO, 0).equals((new IDVariant("SI")), true) && MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Centro
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_FLAG_IMP_ECO, 0).equals((new IDVariant("SI")), true) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Definitivo
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(2)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // Controlli solo Reg 3
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (PAGOPA.equals((new IDVariant("SI")), true))
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (PAGOPA.equals((new IDVariant("SI")), true))
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      // 
      // Corrispettivi
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(5)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(6)), true))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // -------------------------------------------
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ATTIVITA, 0)))
      {
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0)
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        // 
        // ATTIVITA VALORIZZATA
        // 
        if (IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
        {
          // 
          // COMMERCIALE
          // 
          if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true))
          {
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).equals((new IDVariant(1)), true))
          {
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0)
        {
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          // 
          // /TIPO REGISTRO = 1
          // 
          // 
          if (IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            // 
            // ISTITUZIONALE
            // 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            // 
            // COMMERCIALE
            // 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_TIPIREGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      // 
      // ---
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "AbilitazioneCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Campi Stampa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int VisibilitàCampiStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Campi Stampa Body
      // Procedure Body
      // 
      // 
      // Visibilità campo Esente
      // 
      if (BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(2)), true))
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, (new IDVariant(-1)).booleanValue());
      }
      // 
      // Visibilità campo Ventilazione
      // 
      if (BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(4)), true))
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, (new IDVariant(0)).booleanValue());
      }
      // 
      // Visibilità campi CAP
      // 
      if (BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(3)), true) || BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(5)), true) || BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(6)), true))
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, (new IDVariant(0)).booleanValue());
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, (new IDVariant(-1)).booleanValue());
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, (new IDVariant(-1)).booleanValue());
      }
      // 
      // Rimborsi
      // 
      if (PERSONRIMBOR.booleanValue() && BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(6)), true))
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, (new IDVariant(0)).booleanValue());
      }
      // 
      // Definitivo
      // 
      if (BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "TIPO_REGISTRO").equals((new IDVariant(2)), true))
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_TIPIREGIBOOK.set_BoxVisible(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, (new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "VisibilitàCampiStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_TIPIREGIBOOK_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      VisibilitàCampiStampa();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta ACC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaACC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta ACC Body
      // Corpo Procedura
      // 
      QUALESCELACC = (new IDVariant("SP"));
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0)
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "EtichettaSceltaACC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_SP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_SP, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Impegno SP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaImpegnoSP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Impegno SP Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0 || IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0 || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ATTIVITA, 0)))
      {
        return 0;
      }
      QUALESCELIMP = (new IDVariant("SP"));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "EtichettaSceltaImpegnoSP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno SP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegnoSP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno SP Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_SP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_SP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "InfoImpegnoSP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Impegno RC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaImpegnoRC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Impegno RC Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0 || IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ATTIVITA, 0)))
      {
        return 0;
      }
      QUALESCELIMP = (new IDVariant("RC"));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "EtichettaSceltaImpegnoRC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno RC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpegnoRC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno RC Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_IMP_RC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_IMP_RC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "InfoImpegnoRC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta ACC RC
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaACCRC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta ACC RC Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_TIPO_REGISTRO, 0).compareTo((new IDVariant(1)), true)!=0 || IDL.NullValue((new IDVariant(PAN_TIPIREGISTRO.FieldText(PFL_TIPIREGISTRO_ISTITUCOMMER))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ATTIVITA, 0)))
      {
        return 0;
      }
      QUALESCELACC = (new IDVariant("RC"));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "EtichettaSceltaACCRC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc RC
  // **********************************************************************
  public int InfoAccRC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc RC Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_NUMERO_ACC_RC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_T17, IMDBDef9.PQSL_T17_ANNO_ACC_RC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRegistro", "InfoAccRC", _e);
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
  private void PAN_TIPIREGISTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIREGISTRO, Cancel);
    // Stub
  }

  private void PAN_TIPIREGISTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_DUALAPRI2)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaACC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOACC2)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_DUALAPRI)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaImpegnoSP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_DUALINFO)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoSP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_DUALAPRIIMPR)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaImpegnoRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_DUALINFO1)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_APRIACC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaACCRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOACCRC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCodLivello5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_CAPDESCRIZIO)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCAP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_FATTOREIVA)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattoreIVA();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_PROGETTOIVA)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProgettoIVA();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_ETICSCEIMPSP)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaImpegnoSP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOIMPEGNSP)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoSP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_ETICHSCELACC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaACC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOACC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_ETICSCEIMPSC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaImpegnoRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOIMPEGNSC)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_ETICSCELACC1)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaACCRC();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_TIPIREGISTRO_INFOACC1)
    {
      this.IdxPanelActived = this.PAN_TIPIREGISTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccRC();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_TIPIREGISTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIREGISTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_DEFINITIVO)
      {
        PFL_TIPIREGISTRO_DEFINITIVO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_CGE)
      {
        PFL_TIPIREGISTRO_CGE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_CAPITOLOIVA)
      {
        PFL_TIPIREGISTRO_CAPITOLOIVA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_ARTICOLOIVA)
      {
        PFL_TIPIREGISTRO_ARTICOLOIVA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_FATTOREIVA)
      {
        PFL_TIPIREGISTRO_FATTOREIVA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_PROGETTOIVA)
      {
        PFL_TIPIREGISTRO_PROGETTOIVA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_FATTORE)
      {
        PFL_TIPIREGISTRO_FATTORE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_TIPIREGISTRO_CENTRO)
      {
        PFL_TIPIREGISTRO_CENTRO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIREGISTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIREGISTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIREGIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIREGIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIREGIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_TIPIREGIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIREGIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPIREGIBOOK_SEC_DETAIL)
    {
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, new IDVariant(IDL.NullValue(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "ESENTE"),(new IDVariant("NO")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, new IDVariant(IDL.NullValue(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "VENTILAZIONE_IVA"),(new IDVariant("NO")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_TSRTCITRTRBI, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "CAPITOLO_IVA")), ((!(IDL.IsNull(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "ARTICOLO_IVA"))))?(new IDVariant(" / ")):(new IDVariant()))), IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "ARTICOLO_IVA")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, new IDVariant(IDL.NullValue(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RIMBORSI"),(new IDVariant("NO")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_TSRTNASTRTRB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04NUACSP")), ((!(IDL.IsNull(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANACSP"))))?(new IDVariant(" / ")):(new IDVariant()))), IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANACSP")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_TSRTNISTRTRB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04NUIMSP")), ((!(IDL.IsNull(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANIMSP"))))?(new IDVariant(" / ")):(new IDVariant()))), IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANIMSP")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_TSRTNIRTRTRB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04NUIMRC")), ((!(IDL.IsNull(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANIMRC"))))?(new IDVariant(" / ")):(new IDVariant()))), IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANIMRC")))));
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_TSRTNARTRTRB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04NUACRC")), ((!(IDL.IsNull(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANACRC"))))?(new IDVariant(" / ")):(new IDVariant()))), IDL.ToString(BUK_TIPIREGIBOOK.GetReportColumn(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "RECT04ANACRC")))));
    }
    if (SectionID==BUK_TIPIREGIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_TIPIREGIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIREGIBOOK_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIREGIBOOK_SEC_DETAIL)
    {
      BUK_TIPIREGIBOOK_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_TIPIREGIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG)
    {
      BUK_TIPIREGIBOOK.set_SpanValue(BUK_TIPIREGIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIREGIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIREGIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIREGIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIREGIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIREGIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIREGIBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIREGIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIREGISTRO_Init()
  {

    PAN_TIPIREGISTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIREGISTRO.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, "00990B35-F60D-46F4-8063-1F2B5445B552");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, "Accertamento SP");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, MyGlb.VIS_GROUSTYNOBOR);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, MyGlb.PANEL_LIST, 1024, -9999, 132, 16, 0, 0);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, MyGlb.PANEL_FORM, 4, 112, 212, 52, 0, 0);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, 0, 98);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, 1, 13);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, 0, 4);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, 1, 1);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, "95942C08-482A-4559-970D-7F04BC13A314");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, "Impegno SP");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, MyGlb.VIS_GROUSTYNOBOR);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_LIST, 1156, -9999, 132, 16, 0, 0);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_FORM, 120, 136, 96, 28, 0, 0);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, 0, 68);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, 1, 13);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, 0, 4);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, 1, 1);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNOSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, "F9C0A8DB-F4A9-4B0D-90C6-607EBDE44E9D");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, "Impegno RC");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, MyGlb.VIS_GROUSTYNOBOR);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_LIST, 1288, -9999, 132, 16, 0, 0);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_FORM, 364, 112, 180, 28, 0, 0);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, 0, 69);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, 1, 13);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, 0, 4);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, 1, 1);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_IMPEGNORC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, "EB55A92B-952E-4B66-8F31-0C995CC6F3C6");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, "Accertamento RC");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, MyGlb.VIS_GROUSTYNOBOR);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, MyGlb.PANEL_LIST, 1420, -9999, 132, 16, 0, 0);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, MyGlb.PANEL_FORM, 328, 140, 216, 28, 0, 0);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, 0, 99);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, 1, 13);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, 0, 4);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, 1, 1);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_ACCERTAMENRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, "A89928DC-C0F3-4110-98C9-35B1ECCA3FC5");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, "Capitolo IVA");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, MyGlb.VIS_GROUSTYNOBOR);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_LIST, 2380, -9999, 476, 16, 0, 0);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_FORM, 20, 240, 652, 28, 0, 0);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, 0, 69);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, 1, 13);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, 0, 4);
    PAN_TIPIREGISTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, 1, 1);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_TIPIREGISTRO_CAPITOLOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_TIPIREGISTRO.SetSize(MyGlb.OBJ_FIELD, 69);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, "805EA44E-6E4C-43C3-AB9C-823C55DE0357");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, "Tipo Registro");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, "Tipo Registro");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, "FA38A339-9D84-4E1F-B613-576D3E8F5BE6");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, "Tipo Bollato");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, "060164EB-85B5-4DF3-ADA1-A12EA18DB93F");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, "Intestazione");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, "FC5C8520-67E8-4390-BA7F-703A7EE2CCB2");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, "Definitivo");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, "BB4A882B-EF3A-4E7A-8FA2-88CEB3E33509");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, "Attività");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, "9D078B1F-218E-4BFA-B8E5-74805266F49D");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, "Vendite SP");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, "6D9EF9D5-D169-42FA-9088-6791C17B8575");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, "Vendite RC");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, "C271D26F-C4E0-4344-889A-CCC4BC5F3A5B");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, "Numero");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, "CA25D89E-55B1-4486-AC4A-F50142A27B57");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, "Accertamento SP");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, "0A9A76DF-9438-4E40-AB13-26837761358C");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, "Anno");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, "3688F492-A5E6-40C8-B538-17CDCC24E32A");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, "6D1BEB24-0D5D-4FCC-9961-D58C533D9B4F");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, "531AAF92-FCCC-4473-AC1B-92FFE44C6B78");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, "Impegno SP");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, "02FCBFED-0924-4851-BD8F-82D2853A4E6B");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, "Numero");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, "A11D938D-1EA6-4F79-B6C2-F73F724A85B8");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, "Anno");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, "44167B32-91F9-4EB0-801F-9EC9FC67DE0C");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, "20729BB3-0D53-47A5-8C72-52EEB7E7C899");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, "2FB46AA2-8BCA-405F-A79F-619EB2EF437B");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, "Numero");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, "A6946C17-A98C-4D03-940C-0A5AD73EA89F");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, "Anno");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, "F17C54B4-4DFA-4A21-AD42-E538D902E193");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, "E06BB2FF-D65B-4304-A9E0-2F19B1FBFB34");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, "766C62B7-B73D-4151-B879-A549663FBBBE");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, "Impegno RC");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, "9DF7A2F4-1E3B-47C4-A58E-91F39E005578");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, "Numero");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, "4A11E30B-2E13-4CEA-82B8-C606647550A3");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, "/");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.VIS_LABELFIELD);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, "E3D3D972-1912-4693-A0C9-2D5165329DEB");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, "Anno");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, "90E81D3E-DD8A-4C54-8FAA-35A28B2623F1");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, "6BB62925-DC20-40EE-9A04-8840B180805F");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.VIS_HYPELINKIMMA);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, "BF9FA0F9-CFFF-40E7-9818-25F2E83161D6");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, "Accertamento RC");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, "E5BF61BE-2E35-4AA1-84F1-8795DCDF37C0");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, "Esente");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, "99F52059-82F1-49A7-981A-F25B06389086");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, "Ventilazione");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, "6D259004-C6BF-4A3D-B956-EC6CAD0550C2");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, "Cge  ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, "Codice Gestionale");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.VIS_NORFIECFHELE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, "0E8083EF-CDB7-4F93-8B8A-13C64DD857A0");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.VIS_HEADNOBORLEF);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, "EADBC4BF-18B4-4E37-8A6D-926DB79AFD5E");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, "Cod. V Livello");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.VIS_NORFIECFHELE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, "D164F13C-759B-41EB-A85B-C9051F1E4AE0");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.VIS_HEADNOBORLEF);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, "42622875-9942-440C-A5F7-4991453002A5");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, "Capitolo");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.VIS_NORFIEINTLUN);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, "FB2E787D-BF0B-4FE9-BB4E-EEC7AC424EC2");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, "Articolo");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, "5ED4F55D-7816-408E-940A-61715D18B125");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, "Descrizione");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, "DDF0C139-330C-4D97-8356-9D2FAC58A383");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, "Capitolo IVA");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, "B4815047-B3D9-4FAF-8762-4F9598192A60");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, "Fattore IVA");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, "Fattore IVA");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, "887FE297-1C26-42DA-B867-4558B337127A");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, "Obiettivo Operativo IVA");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, "32D88EA9-2EB3-4B56-8318-BB0B61237D7B");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, "Imp.Econ.");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, "E42B6FFB-32B9-4A12-996A-54E237DE2CA0");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, "Fattore");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, "D473EA1B-642B-425B-BA8E-A1855D224F04");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, "Centro");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, "EB08989D-3899-46F0-B4C0-87A72FB2FC1C");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, "NO Ril. IVA");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, "BD8D9CEB-0E5E-4D76-BCEE-22C2BAD08EAE");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, "Corrispettivi");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, "3C0861B9-8A6E-4351-BB47-6BAB142E22E2");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, "Imp. Bollo da Causale");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, "CDB04389-7270-4999-9DFA-7DFFC7694BF5");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, "Fattura Pers.");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, "8C0AF1CF-106D-4EEA-8A65-F1619AEAAAB4");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, "Bollettini");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, "6DD798B6-6355-4116-BD2D-6DF51D9F392A");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, "Rimborsi");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, "D0663E7C-8573-43FF-ACCF-91DDC64C44E0");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, "Modello Associato");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, "Il modello selezionato verrà utilizzato per la trasformazione del documento in formato XML.\nSarà controllata la coerenza con l'eventuale modello associato al singolo creditore/debitore del documento.");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, "8BD49C57-15B9-4552-BD86-21AB7BBFCB0E");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, "Registro Bollato");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, "DBB18B8F-1385-4DA9-90B5-383E8936221E");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, "0AB70AB6-ACA4-4FC4-B4CE-B2BE88F9AD94");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, "6E6B8E63-D5C4-4149-98B5-4BEE48B45087");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, "070ED38C-BD7E-4181-959D-1251C8A91DC9");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, "600D8A25-2983-4202-B6B9-BE6B8977A854");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, "/");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.VIS_LABELFIELD);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, "7ACE6675-537A-473D-8618-2A5834D50394");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, "/");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.VIS_LABELFIELD);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, "61972CF4-94A6-4B0C-A603-2268BC029E95");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, "Scelta Impegno SP");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, 0, "wsearch1.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, "235120F8-CB1F-462A-9214-99254A2460D1");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, 0, "info.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, "520E5F42-C37E-4446-8287-F650C7D4CBA3");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, 0, "wsearch1.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, "E3EA1D78-B89E-4A86-BE6E-A831560480D7");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, 0, "info.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, "64ED2806-491B-47C3-8E24-E03B86D616AD");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, "Scelta Impegno SC");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, 0, "wsearch1.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, "EECC9316-7FC9-413E-A5BB-75F33BB5C751");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, 0, "info.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, "3817811B-E7D8-4542-A9B4-C7360F6CFAEE");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, "/");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.VIS_LABELFIELD);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, "C9B82C7C-85FD-4D3F-B60A-200D4ED6DADB");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, "ISTITUZIONALE_COMMERCIALE");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, "4F2D931D-AF59-4A99-BCA1-C3E7E09E6168");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, 0, "wsearch1.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, "7C928674-E77D-4F21-832E-DA6F9BC44583");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, " ");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, "");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_TIPIREGISTRO.SetImage(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, 0, "info.gif", false);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, "A57CF7C3-6025-44E6-9A6B-FB33E2180883");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, "PagoPA");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, "PagoPA");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIREGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, "0383AB27-91C6-4B2E-8FDC-E0A61C3B5DDC");
    PAN_TIPIREGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, "Servizio PagoPa");
    PAN_TIPIREGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, "Servizio PagoPa");
    PAN_TIPIREGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIREGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIREGISTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 36, 16, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_TIPOREGISTRO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_TIPOREGISTRO, PPQRY_T17, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 1, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_TIPOREGISTRO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 188, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 528, 16, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_TIPOBOLLATO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_TIPOBOLLATO, PPQRY_T17, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_LIST, 228, 36, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_LIST, "Intestazione");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_FORM, 32, 40, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INTESTAZIONE, MyGlb.PANEL_FORM, "Intestazione");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INTESTAZIONE, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INTESTAZIONE, PPQRY_T17, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_LIST, 512, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_LIST, 104);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_LIST, "Definitivo");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_FORM, 56, 64, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DEFINITIVO, MyGlb.PANEL_FORM, "Definitivo");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DEFINITIVO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DEFINITIVO, PPQRY_T17, "A.TIPO_BOLLATO_DEF", "TIPO_BOLLATO_DEF", 1, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_LIST, 576, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_LIST, 56);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_LIST, "Attività");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_FORM, 200, 64, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_FORM, 52);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ATTIVITA, MyGlb.PANEL_FORM, "Attività");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ATTIVITA, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ATTIVITA, PPQRY_T17, "A.ATTIVITA", "ATTIVITA", 1, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_LIST, 744, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_LIST, 156);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_LIST, "Vendite SP");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_FORM, 44, 88, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_FORM, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENSP, MyGlb.PANEL_FORM, "Vendite SP");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_TIPOBOLVENSP, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_TIPOBOLVENSP, PPQRY_T17, "A.TIPO_BOLLATO_VENDITE_SP", "TIPO_BOLLATO_VENDITE_SP", 1, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_LIST, 884, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_LIST, 156);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_LIST, "Vendite RC");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_FORM, 372, 88, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_FORM, 72);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_TIPOBOLVENRC, MyGlb.PANEL_FORM, "Vendite RC");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_TIPOBOLVENRC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_TIPOBOLVENRC, PPQRY_T17, "A.TIPO_BOLLATO_VENDITE_RC", "TIPO_BOLLATO_VENDITE_RC", 1, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_LIST, 1024, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_LIST, "Numero");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_FORM, 12, 116, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_FORM, 108);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCSP, MyGlb.PANEL_FORM, "Numero");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUMEROACCSP, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUMEROACCSP, PPQRY_T17, "A.NUMERO_ACC_SP", "NUMERO_ACC_SP", 1, 5, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_LIST, 444, 352, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_FORM, 8, 116, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICHACCERSP, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICHACCERSP, -1, "", "ETICHACCERSP", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_LIST, 1076, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_LIST, "Anno");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_FORM, 180, 116, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_FORM, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCSP, MyGlb.PANEL_FORM, "Anno");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ANNOACCSP, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ANNOACCSP, PPQRY_T17, "A.ANNO_ACC_SP", "ANNO_ACC_SP", 1, 4, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_LIST, 1116, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_FORM, 4, 328, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI2, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DUALAPRI2, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DUALAPRI2, PPQRY_DUAL, "CASE WHEN ~~TIPO_REGISTRO~~ = 1 THEN 'A' ELSE NULL END", "DUALAPRI", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI2, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_LIST, 1136, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_FORM, 4, 352, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC2, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOACC2, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOACC2, PPQRY_DUAL, "CASE WHEN NOT ((~~NUMERO_ACC_SP~~ IS NULL)) AND NOT ((~~ANNO_ACC_SP~~ IS NULL)) THEN 'I' ELSE NULL END", "INFO", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACC2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACC2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACC2, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_LIST, 452, 360, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_FORM, 44, 140, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNOSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_IMPEGNOSP, -1, GRP_TIPIREGISTRO_ACCERTAMENSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_IMPEGNOSP, -1, "", "IMPEGNOSP", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_LIST, 1156, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_LIST, "Numero");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_FORM, 124, 140, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_FORM, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPSP, MyGlb.PANEL_FORM, "Numero");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUMEROIMPSP, -1, GRP_TIPIREGISTRO_IMPEGNOSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUMEROIMPSP, PPQRY_T17, "A.NUMERO_IMP_SP", "NUMERO_IMP_SP", 1, 5, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_LIST, 1208, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_LIST, "Anno");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_FORM, 180, 140, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_FORM, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPSP, MyGlb.PANEL_FORM, "Anno");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ANNOIMPSP, -1, GRP_TIPIREGISTRO_IMPEGNOSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ANNOIMPSP, PPQRY_T17, "A.ANNO_IMP_SP", "ANNO_IMP_SP", 1, 4, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_LIST, 1248, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_FORM, 4, 376, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRI, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DUALAPRI, -1, GRP_TIPIREGISTRO_IMPEGNOSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DUALAPRI, PPQRY_DUAL1, "CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'SI' THEN 'A' ELSE NULL END", "DUALAPRI", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRI, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_LIST, 1268, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_FORM, 4, 400, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DUALINFO, -1, GRP_TIPIREGISTRO_IMPEGNOSP);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DUALINFO, PPQRY_DUAL1, "CASE WHEN NOT ((~~NUMERO_IMP_SP~~ IS NULL)) AND NOT ((~~ANNO_IMP_SP~~ IS NULL)) THEN 'I' ELSE NULL END", "INFO1", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_LIST, 1288, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_LIST, "Numero");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_FORM, 368, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_FORM, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROIMPRC, MyGlb.PANEL_FORM, "Numero");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUMEROIMPRC, -1, GRP_TIPIREGISTRO_IMPEGNORC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUMEROIMPRC, PPQRY_T17, "A.NUMERO_IMP_RC", "NUMERO_IMP_RC", 1, 5, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_LIST, 1340, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_LIST, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_LIST, "Anno");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_FORM, 508, 116, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOIMPRC, MyGlb.PANEL_FORM, "Anno");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ANNOIMPRC, -1, GRP_TIPIREGISTRO_IMPEGNORC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ANNOIMPRC, PPQRY_T17, "A.ANNO_IMP_RC", "ANNO_IMP_RC", 1, 4, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_LIST, 1380, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_LIST, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_FORM, 4, 424, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_FORM, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALAPRIIMPR, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DUALAPRIIMPR, -1, GRP_TIPIREGISTRO_IMPEGNORC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DUALAPRIIMPR, PPQRY_DUAL1, "CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'NO' THEN 'A' ELSE NULL END", "DUALAPRIIMPR", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRIIMPR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRIIMPR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALAPRIIMPR, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_LIST, 1400, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_FORM, 4, 448, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DUALINFO1, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DUALINFO1, -1, GRP_TIPIREGISTRO_IMPEGNORC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DUALINFO1, PPQRY_DUAL1, "CASE WHEN NOT ((~~NUMERO_IMP_RC~~ IS NULL)) AND NOT ((~~ANNO_IMP_RC~~ IS NULL)) THEN 'I' ELSE NULL END", "INFO2", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_DUALINFO1, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_LIST, 460, 368, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_FORM, 372, 116, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPEGNORC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_IMPEGNORC, -1, GRP_TIPIREGISTRO_IMPEGNORC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_IMPEGNORC, -1, "", "IMPEGNORC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_LIST, 1420, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_LIST, "Numero");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_FORM, 452, 144, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_FORM, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUMEROACCRC, MyGlb.PANEL_FORM, "Numero");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUMEROACCRC, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUMEROACCRC, PPQRY_T17, "A.NUMERO_ACC_RC", "NUMERO_ACC_RC", 1, 5, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 176, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 496, 144, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUOVCAMPSTA3, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUOVCAMPSTA3, -1, "", "NUOVCAMPSTA3", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_LIST, 1472, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_LIST, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_LIST, "Anno");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_FORM, 508, 144, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ANNOACCRC, MyGlb.PANEL_FORM, "Anno");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ANNOACCRC, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ANNOACCRC, PPQRY_T17, "A.ANNO_ACC_RC", "ANNO_ACC_RC", 1, 4, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_LIST, 1512, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_LIST, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_FORM, 4, 340, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_FORM, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_APRIACC, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_APRIACC, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_APRIACC, PPQRY_DUAL1, "CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'NO' THEN 'A' ELSE NULL END", "DUALAPRACCRC", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_APRIACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_APRIACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_APRIACC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_LIST, 1532, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_LIST, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_FORM, 4, 364, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACCRC, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOACCRC, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOACCRC, PPQRY_DUAL1, "CASE WHEN NOT ((~~ANNO_ACC_RC~~ IS NULL)) AND NOT ((~~NUMERO_ACC_RC~~ IS NULL)) THEN 'I' ELSE NULL END", "INFOACCRC", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACCRC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACCRC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_INFOACCRC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_LIST, 452, 360, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_FORM, 332, 144, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHACCERRC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICHACCERRC, -1, GRP_TIPIREGISTRO_ACCERTAMENRC);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICHACCERRC, -1, "", "ETICHACCERRC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_LIST, 1552, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_LIST, "Esente");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_FORM, 160, 168, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_FORM, 48);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ESENTE, MyGlb.PANEL_FORM, "Esente");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ESENTE, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ESENTE, PPQRY_T17, "A.ESENTE", "ESENTE", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_ESENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_ESENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_LIST, 1600, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_LIST, "Ventilazione");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_FORM, 36, 168, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_VENTILAZIONE, MyGlb.PANEL_FORM, "Ventilazione");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_VENTILAZIONE, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_VENTILAZIONE, PPQRY_T17, "A.VENTILAZIONE_IVA", "VENTILAZIONE_IVA", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_VENTILAZIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_VENTILAZIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_LIST, 1680, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_LIST, 112);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_LIST, "Cge  ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_FORM, 64, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_FORM, 56);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CGE, MyGlb.PANEL_FORM, "Cge  ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CGE, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CGE, PPQRY_T17, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_LIST, 1740, 36, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_LIST, 180);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_FORM, 172, 196, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODIGESTDESC, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CODIGESTDESC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CODIGESTDESC, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_LIST, 1984, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V Livello");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_FORM, 32, 220, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V Livello");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CODLIVELLO5, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CODLIVELLO5, PPQRY_T17, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_LIST, 2072, 36, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_LIST, 220);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_LIST, " ");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_FORM, 220, 220, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_FORM, 220);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODLIVE5DESC, MyGlb.PANEL_FORM, " ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CODLIVE5DESC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CODLIVE5DESC, PPQRY_LIVELLO5, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_LIST, 2380, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_FORM, 24, 244, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_FORM, 96);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPITOLOIVA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CAPITOLOIVA, -1, GRP_TIPIREGISTRO_CAPITOLOIVA);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CAPITOLOIVA, PPQRY_T17, "A.CAPITOLO_IVA", "CAPITOLO_IVA", 3, 16, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_LIST, 2508, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_LIST, "Artic.");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_FORM, 264, 244, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_FORM, 96);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ARTICOLOIVA, MyGlb.PANEL_FORM, "Articolo");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ARTICOLOIVA, -1, GRP_TIPIREGISTRO_CAPITOLOIVA);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ARTICOLOIVA, PPQRY_T17, "A.ARTICOLO_IVA", "ARTICOLO_IVA", 1, 6, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 2548, 36, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 288, 244, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CAPDESCRIZIO, -1, GRP_TIPIREGISTRO_CAPITOLOIVA);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_LIST, 32, 340, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_FORM, 32, 248, 88, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHCAPIIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICHCAPIIVA, -1, GRP_TIPIREGISTRO_CAPITOLOIVA);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICHCAPIIVA, -1, "", "ETICHCAPIIVA", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_LIST, 2856, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_LIST, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_LIST, "Fattore IVA");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_FORM, 44, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_FORM, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTOREIVA, MyGlb.PANEL_FORM, "Fattore IVA");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_FATTOREIVA, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_FATTOREIVA, PPQRY_T17, "A.FATTORE_IVA", "FATTORE_IVA", 5, 16, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_LIST, 2976, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_LIST, "Obiettivo Operativo IVA");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_FORM, 412, 268, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_FORM, 156);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PROGETTOIVA, MyGlb.PANEL_FORM, "Obiettivo Operativo IVA");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_PROGETTOIVA, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_PROGETTOIVA, PPQRY_T17, "A.PROGETTO_IVA", "PROGETTO_IVA", 5, 9, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_LIST, 3084, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_LIST, 80);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_LIST, "Imp.Econ.");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_FORM, 60, 292, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_FORM, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPECON, MyGlb.PANEL_FORM, "Imp Econ");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_IMPECON, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_IMPECON, PPQRY_T17, "A.FLAG_IMP_ECO", "FLAG_IMP_ECO", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_IMPECON, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_IMPECON, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_LIST, 3148, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_FORM, 240, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_FATTORE, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_FATTORE, PPQRY_T17, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_LIST, 3268, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_FORM, 508, 292, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_FORM, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CENTRO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CENTRO, PPQRY_T17, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_LIST, 3364, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_LIST, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_LIST, "NO Ril. IVA");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_FORM, 28, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_FORM, 92);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NORILIVA, MyGlb.PANEL_FORM, "NO Ril. IVA");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NORILIVA, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NORILIVA, PPQRY_T17, "A.RILEVANTE_IVA", "RILEVANTE_IVA", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_NORILIVA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_NORILIVA, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_LIST, 3440, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_LIST, 88);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_LIST, "Corrisp.");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_FORM, 312, 316, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CORRISPETTIV, MyGlb.PANEL_FORM, "Corrispettivi");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CORRISPETTIV, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CORRISPETTIV, PPQRY_T17, "A.CORRISPETTIVI", "CORRISPETTIVI", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_CORRISPETTIV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_CORRISPETTIV, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_LIST, 3508, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_LIST, 128);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_LIST, "Imp. Bollo da Causale");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_FORM, 468, 316, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_FORM, 176);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IMPBOLLDACAU, MyGlb.PANEL_FORM, "Imp. Bollo da Causale");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_IMPBOLLDACAU, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_IMPBOLLDACAU, PPQRY_T17, "A.IMP_BOLLO_DA_CAUSALE", "IMP_BOLLO_DA_CAUSALE", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_IMPBOLLDACAU, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_IMPBOLLDACAU, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_LIST, 3620, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_LIST, 148);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_LIST, "Fattura Pers.");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_FORM, 36, 340, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_FORM, 84);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_FATTURAPERS, MyGlb.PANEL_FORM, "Fattura Pers.");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_FATTURAPERS, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_FATTURAPERS, PPQRY_T17, "A.FATTURA_PERSONALIZZATA", "FATTURA_PERSONALIZZATA", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_FATTURAPERS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_FATTURAPERS, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_LIST, 3692, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_LIST, 68);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_LIST, "Bollettini");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_FORM, 328, 340, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_FORM, 68);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_BOLLETTINI, MyGlb.PANEL_FORM, "Bollettini");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_BOLLETTINI, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_BOLLETTINI, PPQRY_T17, "A.BOLLETTINI", "BOLLETTINI", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_BOLLETTINI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_BOLLETTINI, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_LIST, 3752, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_LIST, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_LIST, "Rimborsi");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_FORM, 580, 340, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_FORM, 64);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_RIMBORSI, MyGlb.PANEL_FORM, "Rimborsi");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_RIMBORSI, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_RIMBORSI, PPQRY_T17, "A.RIMBORSI", "RIMBORSI", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_RIMBORSI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_RIMBORSI, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_LIST, 3812, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_LIST, 76);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_LIST, "Modello Associato");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_FORM, 236, 168, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_FORM, 112);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_IDMODELLO, MyGlb.PANEL_FORM, "Modello Associato");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_IDMODELLO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_IDMODELLO, PPQRY_T17, "A.ID_MODELLO", "ID_MODELLO", 3, 10, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_LIST, 0, 0, 228, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_LIST, 2);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_FORM, 0, 4, 160, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_REGISTBOLLAT, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_REGISTBOLLAT, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_REGISTBOLLAT, -1, "", "REGISTBOLLAT", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_LIST, 2112, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 208, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_UTENTEINSERI, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_UTENTEINSERI, PPQRY_T17, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_LIST, 2232, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 232, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DATAINSERIME, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DATAINSERIME, PPQRY_T17, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_LIST, 2340, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 256, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_UTENTULTIAGG, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_UTENTULTIAGG, PPQRY_T17, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_LIST, 2452, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 280, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_DATAULTIMAGG, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_DATAULTIMAGG, PPQRY_T17, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 448, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 168, 116, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUOVCAMPSTAT, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 168, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 168, 140, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUOVCAMPSTA1, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUOVCAMPSTA1, -1, "", "NUOVCAMPSTA1", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_LIST, 216, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_FORM, 216, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICSCEIMPSP, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICSCEIMPSP, -1, "", "ETICSCEIMPSP", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_LIST, 224, 128, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_FORM, 236, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOIMPEGNSP, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOIMPEGNSP, -1, "", "INFOIMPEGNSP", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_LIST, 224, 128, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_FORM, 216, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICHSCELACC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICHSCELACC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICHSCELACC, -1, "", "ETICHSCELACC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_LIST, 232, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_FORM, 236, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOACC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOACC, -1, "", "INFOACC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_LIST, 232, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_FORM, 544, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCEIMPSC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICSCEIMPSC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICSCEIMPSC, -1, "", "ETICSCEIMPSC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_LIST, 240, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_FORM, 564, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOIMPEGNSC, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOIMPEGNSC, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOIMPEGNSC, -1, "", "INFOIMPEGNSC", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 176, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 496, 116, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_NUOVCAMPSTA2, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_NUOVCAMPSTA2, -1, "", "NUOVCAMPSTA2", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_LIST, 3684, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_LIST, 120);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_LIST, "ISTITUZIONALE COMMERCIALE");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_FORM, 4, 328, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_FORM, 120);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ISTITUCOMMER, MyGlb.PANEL_FORM, "ISTITUZ. COMMER.");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ISTITUCOMMER, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ISTITUCOMMER, PPQRY_ISTCOMM, "NVL(A.ISTITUZIONALE, 'NO')", "T09ISTITUZIO", 5, 99, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_LIST, 232, 136, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_FORM, 544, 148, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_ETICSCELACC1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_ETICSCELACC1, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_ETICSCELACC1, -1, "", "ETICSCELACC1", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_LIST, 240, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_LIST, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_FORM, 564, 148, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_FORM, 0);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_INFOACC1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_INFOACC1, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_INFOACC1, -1, "", "INFOACC1", 0, 0, 0, -13997);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_LIST, 3968, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_LIST, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_LIST, "PagoPA");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_FORM, 60, 364, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_FORM, 60);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_PAGOPA, MyGlb.PANEL_FORM, "PagoPA");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_PAGOPA, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_PAGOPA, PPQRY_T17, "A.PAGO_PA", "PAGO_PA", 5, 2, 0, -13997);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_PAGOPA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIREGISTRO.SetValueListItem(PFL_TIPIREGISTRO_PAGOPA, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_LIST, 4020, 36, 320, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_LIST, 136);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_LIST, "Servizio PagoPa");
    PAN_TIPIREGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_FORM, 20, 388, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIREGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_FORM, 100);
    PAN_TIPIREGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIREGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIREGISTRO_CODSERVIPAGO, MyGlb.PANEL_FORM, "Servizio PagoPa");
    PAN_TIPIREGISTRO.SetFieldPage(PFL_TIPIREGISTRO_CODSERVIPAGO, -1, -1);
    PAN_TIPIREGISTRO.SetFieldPanel(PFL_TIPIREGISTRO_CODSERVIPAGO, PPQRY_T17, "A.COD_SERVIZIO_PAGOPA", "COD_SERVIZIO_PAGOPA", 5, 100, 0, -13997);
  }

  private void PAN_TIPIREGISTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIREGISTRO.SetSize(MyGlb.OBJ_QUERY, 11);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~CODICE_GESTIONALE~~) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO_IVA~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO_IVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~COD_LIVELLO_5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_LIVELLO5, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_LIVELLO5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_LIVELLO5, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.ISTITUZIONALE, 'NO') as T09ISTITUZIO ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    SQL.append("where (A.CODICE = ~~ATTIVITA~~) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_ISTCOMM, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_ISTCOMM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_ISTCOMM, "T09");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN ~~TIPO_REGISTRO~~ = 1 THEN 'A' ELSE NULL END as DUALAPRI, ");
    SQL.append("  CASE WHEN NOT ((~~NUMERO_ACC_SP~~ IS NULL)) AND NOT ((~~ANNO_ACC_SP~~ IS NULL)) THEN 'I' ELSE NULL END as INFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~TIPO_REGISTRO~~ = 1) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'SI' THEN 'A' ELSE NULL END as DUALAPRI, ");
    SQL.append("  CASE WHEN NOT ((~~NUMERO_IMP_SP~~ IS NULL)) AND NOT ((~~ANNO_IMP_SP~~ IS NULL)) THEN 'I' ELSE NULL END as INFO1, ");
    SQL.append("  CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'NO' THEN 'A' ELSE NULL END as DUALAPRIIMPR, ");
    SQL.append("  CASE WHEN NOT ((~~NUMERO_IMP_RC~~ IS NULL)) AND NOT ((~~ANNO_IMP_RC~~ IS NULL)) THEN 'I' ELSE NULL END as INFO2, ");
    SQL.append("  CASE WHEN ~~TIPO_REGISTRO~~ = 1 AND NVL(A.ISTITUZIONALE, 'NO') = 'NO' THEN 'A' ELSE NULL END as DUALAPRACCRC, ");
    SQL.append("  CASE WHEN NOT ((~~ANNO_ACC_RC~~ IS NULL)) AND NOT ((~~NUMERO_ACC_RC~~ IS NULL)) THEN 'I' ELSE NULL END as INFOACCRC ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    SQL.append("where (A.CODICE = ~~ATTIVITA~~) ");
    SQL.append("and   (~~TIPO_REGISTRO~~ = 1) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(PPQRY_DUAL1, "T09");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T09CODICE, ");
    SQL.append("  A.DESCRIZIONE as T09DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    SQL.append("where (A.CODICE = ~~ATTIVITA~~) ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T09, 0, SQL, PFL_TIPIREGISTRO_ATTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T09CODICE, ");
    SQL.append("  A.DESCRIZIONE as T09DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T09 A ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T09, 1, SQL, PFL_TIPIREGISTRO_ATTIVITA, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_T09, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1 ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO_VENDITE_SP~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 3) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T8, 0, SQL, PFL_TIPIREGISTRO_TIPOBOLVENSP, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1 ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 3) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T8, 1, SQL, PFL_TIPIREGISTRO_TIPOBOLVENSP, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_T8, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1 ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO_VENDITE_RC~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 3) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T04, 0, SQL, PFL_TIPIREGISTRO_TIPOBOLVENRC, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1 ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 3) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T04, 1, SQL, PFL_TIPIREGISTRO_TIPOBOLVENRC, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_MODELLO as MODEDATIDMOD, ");
    SQL.append("  A.CODICE_MODELLO as MODDATCODMOD, ");
    SQL.append("  A.CODICE_MODELLO || ' - ' || A.DESCRIZIONE as MODEDATIDESC ");
    SQL.append("from ");
    SQL.append("  MODELLI_DATI A ");
    SQL.append("where (A.ID_MODELLO = ~~ID_MODELLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE_MODELLO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_MODELLIDATI, 0, SQL, PFL_TIPIREGISTRO_IDMODELLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_MODELLO as MODEDATIDMOD, ");
    SQL.append("  A.CODICE_MODELLO as MODDATCODMOD, ");
    SQL.append("  A.CODICE_MODELLO || ' - ' || A.DESCRIZIONE as MODEDATIDESC ");
    SQL.append("from ");
    SQL.append("  MODELLI_DATI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE_MODELLO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_MODELLIDATI, 1, SQL, PFL_TIPIREGISTRO_IDMODELLO, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_MODELLIDATI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetIMDB(IMDB, "PQRY_T17", true);
    PAN_TIPIREGISTRO.set_SetString(MyGlb.MASTER_ROWNAME, "T04");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_BOLLATO_DEF as TIPO_BOLLATO_DEF, ");
    SQL.append("  A.ATTIVITA as ATTIVITA, ");
    SQL.append("  A.ESENTE as ESENTE, ");
    SQL.append("  A.VENTILAZIONE_IVA as VENTILAZIONE_IVA, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.CAPITOLO_IVA as CAPITOLO_IVA, ");
    SQL.append("  A.ARTICOLO_IVA as ARTICOLO_IVA, ");
    SQL.append("  A.TIPO_ESIGIBILITA as TIPO_ESIGIBILITA, ");
    SQL.append("  A.FLAG_IMP_ECO as FLAG_IMP_ECO, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.FATTORE_IVA as FATTORE_IVA, ");
    SQL.append("  A.PROGETTO_IVA as PROGETTO_IVA, ");
    SQL.append("  A.RILEVANTE_IVA as RILEVANTE_IVA, ");
    SQL.append("  A.CORRISPETTIVI as CORRISPETTIVI, ");
    SQL.append("  A.IMP_BOLLO_DA_CAUSALE as IMP_BOLLO_DA_CAUSALE, ");
    SQL.append("  A.FATTURA_PERSONALIZZATA as FATTURA_PERSONALIZZATA, ");
    SQL.append("  A.BOLLETTINI as BOLLETTINI, ");
    SQL.append("  A.RIMBORSI as RIMBORSI, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.COD_LIVELLO_5 as COD_LIVELLO_5, ");
    SQL.append("  A.ID_MODELLO as ID_MODELLO, ");
    SQL.append("  A.TIPO_BOLLATO_VENDITE_SP as TIPO_BOLLATO_VENDITE_SP, ");
    SQL.append("  A.TIPO_BOLLATO_VENDITE_RC as TIPO_BOLLATO_VENDITE_RC, ");
    SQL.append("  A.NUMERO_ACC_SP as NUMERO_ACC_SP, ");
    SQL.append("  A.ANNO_ACC_SP as ANNO_ACC_SP, ");
    SQL.append("  A.NUMERO_IMP_SP as NUMERO_IMP_SP, ");
    SQL.append("  A.ANNO_IMP_SP as ANNO_IMP_SP, ");
    SQL.append("  A.NUMERO_IMP_RC as NUMERO_IMP_RC, ");
    SQL.append("  A.ANNO_IMP_RC as ANNO_IMP_RC, ");
    SQL.append("  A.ANNO_ACC_RC as ANNO_ACC_RC, ");
    SQL.append("  A.NUMERO_ACC_RC as NUMERO_ACC_RC, ");
    SQL.append("  A.PAGO_PA as PAGO_PA, ");
    SQL.append("  A.COD_SERVIZIO_PAGOPA as COD_SERVIZIO_PAGOPA ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T04 A ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_TIPIREGISTRO.SetQuery(PPQRY_T17, 5, SQL, -1, "");
    PAN_TIPIREGISTRO.SetQueryDB(PPQRY_T17, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIREGISTRO.SetMasterTable(0, "T04");
    PAN_TIPIREGISTRO.AddToSortList(PFL_TIPIREGISTRO_TIPOREGISTRO, true);
    PAN_TIPIREGISTRO.AddToSortList(PFL_TIPIREGISTRO_TIPOBOLLATO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIREGISTRO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIREGISTRO.iUseListQBE;
      PAN_TIPIREGISTRO.iUseListQBE = 0;
      PAN_TIPIREGISTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIREGISTRO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIREGISTRO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG_Init()
  {
    BUK_TIPIREGIBOOK.InitMastro(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, "FA88104D-764B-4549-8EEF-4382C7BD1B9F");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, "TIPREGBOOPAG");
    BUK_TIPIREGIBOOK.InitMastroBox(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, BUK_TIPIREGIBOOK_RPTBOX_NUMEROPAGINA, 27100, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NUMEROPAGINA, "B05D5BF7-17EA-413D-8C92-453C931C5F5E");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIREGIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_NUMEROPAGINA, "F05AB727-7471-44F7-BE04-1E10F92C8DB7");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIREGIBOOK.InitMastroBox(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1, 1000, 2900, 27700, 14500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1, "D84451F7-D0B3-4A06-889E-E48073876397");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_TIPIREGIBOOK.InitMastroBox(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, BUK_TIPIREGIBOOK_RPTBOX_PAGEFOOTER1, 1000, 17900, 27700, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_PAGEFOOTER1, "117FF33F-BC39-4C05-B226-B75C03ED6373");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
    BUK_TIPIREGIBOOK.InitMastroBox(BUK_TIPIREGIBOOK_MST_TIPREGBOOPAG, BUK_TIPIREGIBOOK_RPTBOX_TITOLO, 1000, 900, 27700, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_TITOLO, "CF6A92B4-BE69-4E31-86DC-27F24E4E9486");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPIREGIBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIREGIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIREGIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
      SQL.append("  A.DESCRIZIONE as RECORT04DESC, ");
      SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
      SQL.append("  A.TIPO_BOLLATO_DEF as TIPO_BOLLATO_DEF, ");
      SQL.append("  A.ATTIVITA as ATTIVITA, ");
      SQL.append("  B.DESCRIZIONE as RECORT09DESC, ");
      SQL.append("  A.ESENTE as ESENTE, ");
      SQL.append("  A.VENTILAZIONE_IVA as VENTILAZIONE_IVA, ");
      SQL.append("  A.CAPITOLO_IVA as CAPITOLO_IVA, ");
      SQL.append("  A.ARTICOLO_IVA as ARTICOLO_IVA, ");
      SQL.append("  C.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.RIMBORSI as RIMBORSI, ");
      SQL.append("  A.TIPO_BOLLATO_VENDITE_SP as RET0TIBOVESP, ");
      SQL.append("  A.TIPO_BOLLATO_VENDITE_RC as RET0TIBOVERC, ");
      SQL.append("  A.NUMERO_ACC_SP as RECT04NUACSP, ");
      SQL.append("  A.ANNO_ACC_SP as RECT04ANACSP, ");
      SQL.append("  A.NUMERO_IMP_SP as RECT04NUIMSP, ");
      SQL.append("  A.ANNO_IMP_SP as RECT04ANIMSP, ");
      SQL.append("  A.NUMERO_IMP_RC as RECT04NUIMRC, ");
      SQL.append("  A.ANNO_IMP_RC as RECT04ANIMRC, ");
      SQL.append("  D.DESCRIZIONE as RECORACCDESC, ");
      SQL.append("  E.DESCRIZIONE as RECORIMPDESC, ");
      SQL.append("  F.DESCRIZIONE as RECOIMPDESC2, ");
      SQL.append("  A.NUMERO_ACC_RC as RECT04NUACRC, ");
      SQL.append("  A.ANNO_ACC_RC as RECT04ANACRC, ");
      SQL.append("  D.DESCRIZIONE as RECOACCDESC1, ");
      SQL.append("  A.PAGO_PA as RECOT04PAGPA ");
      SQL.append("from ");
      SQL.append("  T04 A, ");
      SQL.append("  T09 B, ");
      SQL.append("  CAP C, ");
      SQL.append("  ACC D, ");
      SQL.append("  IMP E, ");
      SQL.append("  IMP F, ");
      SQL.append("  ACC G ");
      SQL.append("where (B.CODICE(+) = A.ATTIVITA) ");
      SQL.append("and   (C.CAPITOLO(+) = A.CAPITOLO_IVA) ");
      SQL.append("and   (C.ARTICOLO(+) = A.ARTICOLO_IVA) ");
      SQL.append("and   (C.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (C.E_S(+) = 'E') ");
      SQL.append("and   (D.ANNO_ACC(+) = A.ANNO_ACC_SP) ");
      SQL.append("and   (D.NUMERO_ACC(+) = A.NUMERO_ACC_SP) ");
      SQL.append("and   (E.ANNO_IMP(+) = A.ANNO_IMP_SP) ");
      SQL.append("and   (E.NUMERO_IMP(+) = A.NUMERO_IMP_SP) ");
      SQL.append("and   (F.ANNO_IMP(+) = A.ANNO_IMP_RC) ");
      SQL.append("and   (F.NUMERO_IMP(+) = A.NUMERO_IMP_RC) ");
      SQL.append("and   (G.ANNO_ACC(+) = A.ANNO_ACC_RC) ");
      SQL.append("and   (G.NUMERO_ACC(+) = A.NUMERO_ACC_RC) ");
      SQL.append("order by ");
      SQL.append("  A.TIPO_REGISTRO, ");
      SQL.append("  A.TIPO_BOLLATO ");
      BUK_TIPIREGIBOOK.SetReportQuery(BUK_TIPIREGIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "AF6CBCA9-735E-4461-9E20-3D47B80961A5");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIREGIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIREGIBOOK.InitReport(BUK_TIPIREGIBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIREGIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "7E5E551C-0693-4A56-8046-067E640D1CBD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_REPORTHEADER, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_REPORTHEADER, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_REPORTHEADER, "7527350F-5368-4E6C-9789-D2F10E6A9FEB");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, "1168BA45-2529-4D61-82CA-337CA6BF85B8");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1, 0, 0, 4200, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1, "36EE5B41-C783-491A-8D85-EDD845812C08");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1, "TIPOREGIHEA1");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGIHEA1, BUK_TIPIREGIBOOK_SPAN_TIPOREGISTRO, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Tipo Registro/Bollato", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TIPOREGISTRO, "ED3F63FA-EBB6-41B0-B169-15462EE58578");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TIPOREGISTRO, "TIPOREGISTRO");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16, 4400, 0, 5500, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16, "105DDF1C-52D4-47FF-8244-DDE1723514FD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16, "NEWBOX16");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX16, BUK_TIPIREGIBOOK_SPAN_INTESTAZIONE, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384705, "", "Intestazione", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_INTESTAZIONE, "4190961E-56A6-40F7-8DBC-773B544E2413");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_INTESTAZIONE, "INTESTAZIONE");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF, 10000, 0, 1900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF, "D3164C94-BCE5-4483-BB4A-3A91CBDDB779");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF, "BOLLATODEF");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_BOLLATODEF, BUK_TIPIREGIBOOK_SPAN_BOLLATODEF, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384705, "", "Bollato Def", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_BOLLATODEF, "3638C7CD-FB5D-4E98-AE1C-A0C70CAF86C5");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_BOLLATODEF, "BOLLATODEF");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1, 12000, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1, "C70115A2-CAF1-4AC7-8EF2-B155B70CFF7C");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1, "ATTIVITA1");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_ATTIVITA1, BUK_TIPIREGIBOOK_SPAN_ATTIVITA1, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384705, "", "Attivita", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_ATTIVITA1, "FAD1021A-DB74-453C-B83B-62DCB843E19B");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_ATTIVITA1, "ATTIVITA1");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12, 16000, 0, 1100, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12, "EC31BD62-E405-4D5B-8540-5052210D502C");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12, "NEWBOX12");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX12, BUK_TIPIREGIBOOK_SPAN_ATTIVITA, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Esente", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_ATTIVITA, "A6A8ABF0-CD3E-4940-81A7-B7FCD4984A72");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_ATTIVITA, "ATTIVITA");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13, 17900, 0, 1500, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13, "45A06F61-4023-471C-AB32-8DAC2A937062");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13, "NEWBOX13");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX13, BUK_TIPIREGIBOOK_SPAN_ESENTE, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Ventilaz.", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_ESENTE, "1353DF7D-48B2-48FC-B858-785CAB5A3469");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_ESENTE, "ESENTE");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, 19600, 0, 3200, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, "8666BC7D-91B4-4F2D-A8AE-0D9A7B897E08");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, "NEWBOX14");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, 2);
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX14, BUK_TIPIREGIBOOK_SPAN_C1, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Capitolo IVA", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C1, "BB820131-5C08-403E-A04A-CE6FCF8B535D");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C1, "C1");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6, 26100, 0, 1600, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6, "C80DBFA6-972C-4CBB-96D8-800C16E80B78");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6, "NEWBOX6");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX6, BUK_TIPIREGIBOOK_SPAN_RISORSAIVA, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Rimborsi", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RISORSAIVA, "FABC2ACA-3C16-433E-9DA8-7BC5159B1E74");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RISORSAIVA, "RISORSAIVA");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, 19600, 400, 2900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, "05E15B55-7F88-40B6-AC42-1EFCBB1EFFCA");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, "NEWBOX7");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, 2);
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX7, BUK_TIPIREGIBOOK_SPAN_C2, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Accertamento SP", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C2, "E4394D9E-50D0-4549-9C13-EB6FBFBB08B2");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C2, "C2");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, 19600, 1200, 2900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, "1017D4FE-3F0B-405B-BCFB-A2BBC69D3D09");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, "NEWBOX8");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, 2);
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX8, BUK_TIPIREGIBOOK_SPAN_C3, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Impegno SP", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C3, "D1DF6E21-D2C4-4EBD-A625-64C9D178C728");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C3, "C3");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, 19600, 1600, 2900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, "47253692-4B85-4A97-8F6E-5F58FC543CAC");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, "IMPEGNORC");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, 2);
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_IMPEGNORC, BUK_TIPIREGIBOOK_SPAN_C4, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Impegno RC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C4, "484BBF29-4487-4A83-9000-B0951035C6D1");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C4, "C4");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15, 16000, 400, 1700, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15, "8E3453B8-07A1-479C-8978-4CF0CA460F60");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15, "NEWBOX15");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX15, BUK_TIPIREGIBOOK_SPAN_C5, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Vendite SP", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C5, "1C0162A3-BE23-4812-86AD-21B9333348A1");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C5, "C5");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10, 16000, 800, 1700, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10, "76A6750B-B23E-4EE4-9E4B-55F3FED60ED2");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10, "NEWBOX10");
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX10, BUK_TIPIREGIBOOK_SPAN_C6, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Vendite RC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C6, "6C7D9A28-E563-46AC-BD8E-B19D4A3E9AFA");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C6, "C6");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_PAGEHEADER, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, 19600, 800, 2900, 400, 0, 1, 1, MyGlb.VIS_A8CENTRATO, 983041, 322, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, "073F3E5A-0A65-41C1-BB41-36E09CAEA662");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, "NEWBOX11");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, 2);
    BUK_TIPIREGIBOOK.set_BoxFontModifiers(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, "B");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX11, BUK_TIPIREGIBOOK_SPAN_C, MyGlb.VIS_A8CENTRATO, 0, 0, 0, 271384961, "", "Accertamento RC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_C, "D1868729-C49B-43E1-8036-77D394E465E2");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_C, "C");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_TITOLO, BUK_TIPIREGIBOOK_RPTBOX_TITOLO);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_TITOLO, "E740DA83-7C1A-44A8-9DD9-C7FB6B08B3BD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_TITOLO, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX9, 300, 200, 27200, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX9, "F8FA001C-B446-4DF5-8A70-3F90C439BF9B");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX9, "NEWBOX9");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX9, BUK_TIPIREGIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi di Registro", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_VARIADIBILAN, "153CCB43-15A3-4852-8EFE-D84F77AF37E8");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_DETAIL, 2100, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_DETAIL, "3FCE2C77-58BB-4556-A7A6-8B995C5598CE");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_TIPOREGISTRO, 0, 0, 4200, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGISTRO, "7405F696-13D8-441D-8679-884B70091CF4");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGISTRO, "TIPOREGISTRO");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_TIPOREGISTRO, BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, MyGlb.VIS_NORMALEA7, 1, 1, 0, 271384705, "Brief description of field content.", "::TIPO_REGISTRO", 1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "1 - Acquisti", "Type the value and explain what it means.", (new IDVariant(1)), null, "", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "2 - Acquisti in Attesa di Esigibilità", "Type the value and explain what it means.", (new IDVariant(2)), null, "", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "3 - Vendite", "Type the value and explain what it means.", (new IDVariant(3)), null, "", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "4 - Corrispettivi", "Type the value and explain what it means.", (new IDVariant(4)), null, "", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "5 - Vendite Esigibili al Pagamento", "Type the value and explain what it means.", (new IDVariant(5)), null, "", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "6 - Vendite Debitori non Codificati", "Type the value and explain what it means.", (new IDVariant(6)), null, "", -1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "30A675BB-E206-43CB-9361-D8A82C9A437D");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0TIRETRNB, "RET0TIRETRNB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_INTESTAZIONE, 5000, 0, 4900, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_INTESTAZIONE, "A3A212D5-E503-42E0-B8E3-79BFCFF05DFD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_INTESTAZIONE, "INTESTAZIONE");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_INTESTAZIONE, BUK_TIPIREGIBOOK_SPAN_RET0DETIRTR1, MyGlb.VIS_NORMALEA7, 5, 40, 0, 271384705, "Brief description of field content.", "::RECORT04DESC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0DETIRTR1, "8F10987A-A951-438E-92E1-1254A3DBDB72");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0DETIRTR1, "RET0DETIRTR1");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX, 4400, 0, 500, 400, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX, "B2EB654F-459C-48F9-BE31-55E211B2CBCD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX, BUK_TIPIREGIBOOK_SPAN_RET0TIBTRTRB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384705, "", "::TIPO_BOLLATO", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0TIBTRTRB, "1403FA97-A4D5-4F25-95FA-79D27D0FBE45");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0TIBTRTRB, "RET0TIBTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, 10000, 0, 1900, 400, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, "5A7F655E-496C-4669-B2B1-48F3412A7E6B");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, 3);
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX1, BUK_TIPIREGIBOOK_SPAN_RET0TBDTRTRB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384705, "", "::TIPO_BOLLATO_DEF", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0TBDTRTRB, "0BD090A7-0464-4A0C-AFDD-611C9A09DEC9");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0TBDTRTRB, "RET0TBDTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX2, 12000, 0, 500, 400, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX2, "BFAFDF78-B637-4AD6-A45C-14B7EFD89A4C");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX2, BUK_TIPIREGIBOOK_SPAN_RET0ATTIRTRB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384705, "", "::ATTIVITA", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0ATTIRTRB, "5C17BD5B-D94E-4F3C-8DFD-A3B3873CACE7");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0ATTIRTRB, "RET0ATTIRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX3, 12600, 0, 3300, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX3, "6E42ED7B-869B-4618-95EE-E0F3EED91C67");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX3, "NEWBOX3");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX3, BUK_TIPIREGIBOOK_SPAN_RET0DETIRTRB, MyGlb.VIS_NORMALEA7, 5, 40, 0, 271384705, "", "::RECORT09DESC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RET0DETIRTRB, "4DF399C8-F1AF-46AC-B500-06B63FD2E5EB");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RET0DETIRTRB, "RET0DETIRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_ESENTE, 16600, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, "C2112CE2-19F5-466A-A21F-F12FB8CE6B84");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, "ESENTE");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, 3);
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_ESENTE, BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, "78AD2DB1-4D89-45C6-9D61-224497461C88");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_NUVRTETRTRBN, "NUVRTETRTRBN");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, 18600, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, "25C8F409-27DC-4239-8A2C-72181077F365");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, "VENTILAZIONE");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, 3);
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_VENTILAZIONE, BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, "A69861A2-6A39-4B6C-B266-D30EDD1BC8D2");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_NVRTVITRTRBN, "NVRTVITRTRBN");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, 19600, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, "B385B1B4-F754-4B7D-8D45-0B10A0ABAF7D");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, "CAPITOLOIVA");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_CAPITOLOIVA, BUK_TIPIREGIBOOK_SPAN_TSRTCITRTRBI, MyGlb.VIS_NORMALEA7, 5, 297, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TSRTCITRTRBI, "BBF64705-7DF2-4558-85A9-CC686573EC17");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TSRTCITRTRBI, "TSRTCITRTRBI");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, 21800, 0, 4700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, "C07D5426-9DA4-4982-B326-D55D57CC37B2");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, "DESCRCAPIIVA");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_DESCRCAPIIVA, BUK_TIPIREGIBOOK_SPAN_RECADETIRTRB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "", "::DESCRIZIONE", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RECADETIRTRB, "24FF0FC4-1D15-461F-B2DB-C86C44722C6C");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RECADETIRTRB, "RECADETIRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, 26700, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, "AD23F6E4-FEDA-4DFA-830F-7B7BDCB89768");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, "RIMBORSI");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_RIMBORSI, BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetSpanValueListItem(BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, "72737C23-FDD1-4B88-B03D-3A2101EBE8F7");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_NUVRTRTRTRBN, "NUVRTRTRTRBN");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_ACC, 19600, 400, 2200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_ACC, "CA84BA16-3BC7-472A-A90D-0654F81AD3FD");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_ACC, "ACC");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_ACC, BUK_TIPIREGIBOOK_SPAN_TSRTNASTRTRB, MyGlb.VIS_NORMALEA7, 5, 297, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TSRTNASTRTRB, "FC67DE70-BC5E-4239-AC6F-CB6AFE18021B");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TSRTNASTRTRB, "TSRTNASTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_IMPSP, 19600, 1200, 2200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_IMPSP, "5A91AC58-F379-4939-BCCE-1C84801458A6");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_IMPSP, "IMPSP");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_IMPSP, BUK_TIPIREGIBOOK_SPAN_TSRTNISTRTRB, MyGlb.VIS_NORMALEA7, 5, 297, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TSRTNISTRTRB, "FB53B1B3-87B9-441B-846A-EA90AE2B4C34");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TSRTNISTRTRB, "TSRTNISTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_IMPRC, 19600, 1600, 2200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_IMPRC, "1CDEBBAD-7093-49C7-A927-D0187E84B5AE");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_IMPRC, "IMPRC");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_IMPRC, BUK_TIPIREGIBOOK_SPAN_TSRTNIRTRTRB, MyGlb.VIS_NORMALEA7, 5, 297, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TSRTNIRTRTRB, "22ED1352-74AA-468E-946A-AA1F8CE58AC7");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TSRTNIRTRTRB, "TSRTNIRTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOACC, 21800, 400, 4700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOACC, "743C9A6B-F0D9-42B3-8F39-9EEE893CE5FE");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOACC, "DESCRIZIOACC");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOACC, BUK_TIPIREGIBOOK_SPAN_REACDETIRTRB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "", "::RECORACCDESC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_REACDETIRTRB, "10F66174-6EFF-49AF-BB3A-5F44133676E6");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_REACDETIRTRB, "REACDETIRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOIMP, 21800, 1200, 4700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOIMP, "8758EE9A-46A8-4D6D-BE9B-9DEE4304DC4C");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOIMP, "DESCRIZIOIMP");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIOIMP, BUK_TIPIREGIBOOK_SPAN_REIMDETIRTRB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "", "::RECORIMPDESC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_REIMDETIRTRB, "B742D3E3-4AE4-41E3-8DEB-31AD52AE4E5F");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_REIMDETIRTRB, "REIMDETIRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIIMP1, 21800, 1600, 4700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIIMP1, "FB1510FD-9829-4451-9289-B156CF10008A");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIIMP1, "DESCRIZIIMP1");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIIMP1, BUK_TIPIREGIBOOK_SPAN_REIMDE2TRTRB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "", "::RECOIMPDESC2", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_REIMDE2TRTRB, "D5B436A8-DA45-4A87-B56A-ECBC6A654730");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_REIMDE2TRTRB, "REIMDE2TRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4, 16000, 400, 1700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4, "C6BF54BB-43BC-4493-BEF7-B933CEE16AC5");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4, "NEWBOX4");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4, 3);
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX4, BUK_TIPIREGIBOOK_SPAN_RETTBVSTRTRB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384705, "", "::RET0TIBOVESP", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RETTBVSTRTRB, "359546B0-39DB-4EEF-9F50-0EF201AB5B5E");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RETTBVSTRTRB, "RETTBVSTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5, 16000, 800, 1700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5, "6E4DBC9F-E0F3-4D9D-8126-FA27AA1C31C6");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5, "NEWBOX5");
    BUK_TIPIREGIBOOK.set_BoxAlignment(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5, 3);
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_NEWBOX5, BUK_TIPIREGIBOOK_SPAN_RETTBVRTRTRB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384705, "", "::RET0TIBOVERC", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_RETTBVRTRTRB, "F22EF513-5E65-45CA-904E-79E15ED33396");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_RETTBVRTRTRB, "RETTBVRTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_ACC1, 19600, 800, 2200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_ACC1, "BD4D5AE2-A16E-49D4-A02C-835114F42057");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_ACC1, "ACC1");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_ACC1, BUK_TIPIREGIBOOK_SPAN_TSRTNARTRTRB, MyGlb.VIS_NORMALEA7, 5, 297, 0, 271384705, "", "", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_TSRTNARTRTRB, "D3C61FF8-127B-4181-AF94-789924A23CBB");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_TSRTNARTRTRB, "TSRTNARTRTRB");
    BUK_TIPIREGIBOOK.InitReportBox(BUK_TIPIREGIBOOK_SEC_DETAIL, BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIACC1, 21800, 800, 4700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIACC1, "B6D872E1-0D10-4BBE-A90C-B4704992CB1A");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIACC1, "DESCRIZIACC1");
    BUK_TIPIREGIBOOK.InitBoxSpan(BUK_TIPIREGIBOOK_RPTBOX_DESCRIZIACC1, BUK_TIPIREGIBOOK_SPAN_REACDE1TRTRB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "", "::RECOACCDESC1", 1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SPAN_REACDE1TRTRB, "054B3296-0CF6-4EB9-B242-9A82EC761B60");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SPAN_REACDE1TRTRB, "REACDE1TRTRB");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_PAGEFOOTER, BUK_TIPIREGIBOOK_RPTBOX_PAGEFOOTER1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_PAGEFOOTER, "DC480C7C-C044-4987-AF75-0532EE762109");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_TIPIREGIBOOK.InitSection(BUK_TIPIREGIBOOK_RPT_NEWREPORT, BUK_TIPIREGIBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIREGIBOOK.SetSectionRendersInto(BUK_TIPIREGIBOOK_SEC_REPORTFOOTER, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1);
    BUK_TIPIREGIBOOK.SetRTCGuid(BUK_TIPIREGIBOOK_SEC_REPORTFOOTER, "2EC0C38C-2EA2-47DB-99AE-88DA4AC9BEEF");
    BUK_TIPIREGIBOOK.SetObjCode(BUK_TIPIREGIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIREGIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIREGIBOOK_InitLinks()
  {
    BUK_TIPIREGIBOOK.SetBoxNextBox(BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1, BUK_TIPIREGIBOOK_RPTBOX_PAGEBODY1);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TIPIREGISTRO) PAN_TIPIREGISTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIREGIBOOK) BUK_TIPIREGIBOOK_OnPreview();
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
