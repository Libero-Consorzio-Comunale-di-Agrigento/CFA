// **********************************************
// Finanziamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Finanziamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FINANZIAMENT_CODICE = 0;
  private static int PFL_FINANZIAMENT_DESCRIZIONE = 1;
  private static int PFL_FINANZIAMENT_ENTE = 2;
  private static int PFL_FINANZIAMENT_NUMEANNOMUTU = 3;
  private static int PFL_FINANZIAMENT_ANNOMUTUO = 4;
  private static int PFL_FINANZIAMENT_IMPORTORIGIN = 5;
  private static int PFL_FINANZIAMENT_DURATA = 6;
  private static int PFL_FINANZIAMENT_ENTEFINANZIA = 7;
  private static int PFL_FINANZIAMENT_SCADENZA = 8;
  private static int PFL_FINANZIAMENT_CATEGORIA = 9;
  private static int PFL_FINANZIAMENT_ALLEGATO = 10;
  private static int PFL_FINANZIAMENT_FINANZDISAVA = 11;
  private static int PFL_FINANZIAMENT_DIPARTIMENTO = 12;
  private static int PFL_FINANZIAMENT_LEGGEREGIONA = 13;
  private static int PFL_FINANZIAMENT_CAPITOREGION = 14;
  private static int PFL_FINANZIAMENT_ATTOASSEGNAZ = 15;
  private static int PFL_FINANZIAMENT_SCELTAENTE = 16;
  private static int PFL_FINANZIAMENT_BARRA = 17;
  private static int PFL_FINANZIAMENT_SCELTAMUTUO = 18;
  private static int PFL_FINANZIAMENT_NOTE2 = 19;
  private static int PFL_FINANZIAMENT_SCELNOTEPIEN = 20;
  private static int PFL_FINANZIAMENT_UTENTEINSER1 = 21;
  private static int PFL_FINANZIAMENT_ATTOASS = 22;
  private static int PFL_FINANZIAMENT_LEGGEREG = 23;
  private static int PFL_FINANZIAMENT_CAPREG = 24;
  private static int PFL_FINANZIAMENT_SCELNOTEVUOT = 25;
  private static int PFL_FINANZIAMENT_NOTE1 = 26;
  private static int PFL_FINANZIAMENT_INFOENTE = 27;
  private static int PFL_FINANZIAMENT_RENDALMEF = 28;

  private static int PPQRY_FINANZIAME21 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_CATEGORIEFIN = 2;
  private static int PPQRY_T69 = 3;
  private static int PPQRY_FINANZIDISAV = 4;


  IDPanel PAN_FINANZIAMENT;
  private static int PFL_UNITAORGANIZ_UNITAORGANIZ = 0;
  private static int PFL_UNITAORGANIZ_UTENTEINSERI = 1;
  private static int PFL_UNITAORGANIZ_DATAINSERIME = 2;
  private static int PFL_UNITAORGANIZ_UTENTULTIAGG = 3;
  private static int PFL_UNITAORGANIZ_DATAULTIMAGG = 4;
  private static int PFL_UNITAORGANIZ_PROGRESSIVO = 5;
  private static int PFL_UNITAORGANIZ_FINANZIAMENT = 6;

  private static int PPQRY_FINANZIAMEUO = 0;

  private static int PPQRY_CF4WEBSTRUTT = 1;


  IDPanel PAN_UNITAORGANIZ;
  CIDREObj BUK_LIBROFINANZI;
  OBook BKW_LIBROFINANZI;
  //
  // Template Pages constants
  private static int BUK_LIBROFINANZI_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBROFINANZI_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_LIBROFINANZI_RPTBOX_NUOVOBOX1 = 4;
  private static int BUK_LIBROFINANZI_SPAN_TSLFFPNTSLFF = 5;

  //
  // Reports constants
  private static int BUK_LIBROFINANZI_RPT_NUOVOREPORT = 6;
  private static int BUK_LIBROFINANZI_SEC_INTESTREPORT = 7;
  private static int BUK_LIBROFINANZI_SEC_INTESTPAGINA = 8;
  private static int BUK_LIBROFINANZI_RPTBOX_TITOLO = 9;
  private static int BUK_LIBROFINANZI_SPAN_FINANZIAMENT = 10;
  private static int BUK_LIBROFINANZI_RPTBOX_CODICEHEADER = 11;
  private static int BUK_LIBROFINANZI_SPAN_CODICE1 = 12;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRIHEADER = 13;
  private static int BUK_LIBROFINANZI_SPAN_DESCRIZIONE1 = 14;
  private static int BUK_LIBROFINANZI_RPTBOX_ENTE1 = 15;
  private static int BUK_LIBROFINANZI_SPAN_ENTEFIN = 16;
  private static int BUK_LIBROFINANZI_RPTBOX_MUTUOHEADER = 17;
  private static int BUK_LIBROFINANZI_SPAN_NUMEANNOMUTU = 18;
  private static int BUK_LIBROFINANZI_RPTBOX_SCADENHEADER = 19;
  private static int BUK_LIBROFINANZI_SPAN_SCADENZA = 20;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCABBHEADE = 21;
  private static int BUK_LIBROFINANZI_SPAN_C = 22;
  private static int BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEAD = 23;
  private static int BUK_LIBROFINANZI_SPAN_IMPORTOORIG = 24;
  private static int BUK_LIBROFINANZI_RPTBOX_TIPODURAHEAD = 25;
  private static int BUK_LIBROFINANZI_SPAN_DURATA1 = 26;
  private static int BUK_LIBROFINANZI_SEC_DETTAGLIO = 27;
  private static int BUK_LIBROFINANZI_RPTBOX_CODICE = 28;
  private static int BUK_LIBROFINANZI_SPAN_FINCODFILIFI = 29;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE = 30;
  private static int BUK_LIBROFINANZI_SPAN_FINDESFILIFI = 31;
  private static int BUK_LIBROFINANZI_RPTBOX_ENTE = 32;
  private static int BUK_LIBROFINANZI_SPAN_FINENTFILIFI = 33;
  private static int BUK_LIBROFINANZI_RPTBOX_MUTUO = 34;
  private static int BUK_LIBROFINANZI_SPAN_TSFNAMFLFINI = 35;
  private static int BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG = 36;
  private static int BUK_LIBROFINANZI_SPAN_FIIMORFILIFI = 37;
  private static int BUK_LIBROFINANZI_RPTBOX_TIPODURATA = 38;
  private static int BUK_LIBROFINANZI_SPAN_FINDURFILIFI = 39;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCABB = 40;
  private static int BUK_LIBROFINANZI_SPAN_T69DESCABB = 41;
  private static int BUK_LIBROFINANZI_RPTBOX_NUOVOBOX = 42;
  private static int BUK_LIBROFINANZI_SPAN_FINSCAFILIFI = 43;
  private static int BUK_LIBROFINANZI_SEC_PIEDEREPORT = 44;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM144(IMDB);
    //
    //
    Init_PQRY_FINANZIAME21(IMDB);
    Init_PQRY_FINANZIAMEUO(IMDB);
    Init_PQRY_FINANZIAME27(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM144(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM144, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM144, "TBL_PARAM144");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, "NOMEOGGETTIU");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGETTIU,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, "NOMEOGGEFLAG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, "NOMEOGGEDUPL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM144,IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL,1,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM144, 0);
  }

  private static void Init_PQRY_FINANZIAME21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAME21, 19);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAME21, "PQRY_FINANZIAME21");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ENTE, "ENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, "NUMERO_MUTUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, "ANNO_MUTUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_IMPORTO_ORIG, "IMPORTO_ORIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_IMPORTO_ORIG,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_TIPO_DURATA, "TIPO_DURATA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_TIPO_DURATA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_COD_ALLEGATO, "COD_ALLEGATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_COD_ALLEGATO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_COD_FIN_DISAV, "COD_FIN_DISAV");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_COD_FIN_DISAV,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DIPARTIMENTO, "DIPARTIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DIPARTIMENTO,5,150,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_LEGGE_REG, "LEGGE_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_LEGGE_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CAPITOLO_REG, "CAPITOLO_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_CAPITOLO_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ATTO_ASS, "ATTO_ASS");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_ATTO_ASS,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_REND_AL_MEF, "REND_AL_MEF");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_REND_AL_MEF,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME21,IMDBDef8.PQSL_FINANZIAME21_DATA_INSERIMENTO,8,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAME21, 0);
  }

  private static void Init_PQRY_FINANZIAMEUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAMEUO, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAMEUO, "PQRY_FINANZIAMEUO");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEUO,IMDBDef8.PQSL_FINANZIAMEUO_FINANZIAMENTO,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAMEUO, 0);
  }

  private static void Init_PQRY_FINANZIAME27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAME27, 24);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAME27, "PQRY_FINANZIAME27");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZCODICE, "FINANZCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZCODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCRI, "FINANZDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCRI,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZIAENTE, "FINANZIAENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZIAENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINNUMANNMUT, "FINNUMANNMUT");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINNUMANNMUT,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAANNOMUTU, "FINAANNOMUTU");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAANNOMUTU,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAIMPOORIG, "FINAIMPOORIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAIMPOORIG,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZCATEGO, "FINANZCATEGO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZCATEGO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDURATA, "FINANZDURATA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDURATA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAALLALPEG, "FINAALLALPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAALLALPEG,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAFINADISA, "FINAFINADISA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAFINADISA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZIANOTE, "FINANZIANOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZIANOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDIPART, "FINANZDIPART");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDIPART,5,150,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINALEGGREGI, "FINALEGGREGI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINALEGGREGI,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINACAPIREGI, "FINACAPIREGI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINACAPIREGI,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAATTOASSE, "FINAATTOASSE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAATTOASSE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAUTENINSE, "FINAUTENINSE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINAUTENINSE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZSCADEN, "FINANZSCADEN");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZSCADEN,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINCATFINCOD, "FINCATFINCOD");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINCATFINCOD,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCR1, "FINANZDESCR1");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCR1,5,152,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANT69CODI, "FINANT69CODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANT69CODI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINT69DESABB, "FINT69DESABB");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINT69DESABB,5,33,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINADISACODI, "FINADISACODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINADISACODI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCR2, "FINANZDESCR2");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINANZDESCR2,5,202,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINBENRAGSOC, "FINBENRAGSOC");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME27,IMDBDef8.PQSL_FINANZIAME27_FINBENRAGSOC,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAME27, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Finanziamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public Finanziamenti()
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
    FormIdx = MyGlb.FRM_FINANZIAMENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1DF3DC80-F233-4BD2-8023-43848D017FED";
    ResModeW = 3;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 900;
    DesignHeight = 558;
    set_Caption(new IDVariant("Finanziamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 900;
    Frames[1].Height = 532;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.646617;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 900;
    Frames[2].Height = 344;
    Frames[2].Caption = "Finanziamenti";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 344;
    PAN_FINANZIAMENT = new IDPanel(w, this, 2, "PAN_FINANZIAMENT");
    Frames[2].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 900-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBROFINANZI != null)
      PAN_FINANZIAMENT.SetBook(BUK_LIBROFINANZI);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "66951241-2D38-413A-8DB8-6E9740C32FCD");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 868, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 900;
    Frames[3].Height = 188;
    Frames[3].Caption = "Unit‡ Organizzative";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 188;
    PAN_UNITAORGANIZ = new IDPanel(w, this, 3, "PAN_UNITAORGANIZ");
    Frames[3].Content = PAN_UNITAORGANIZ;
    PAN_UNITAORGANIZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UNITAORGANIZ.VS = MainFrm.VisualStyleList;
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 900-MyGlb.PAN_OFFS_X, 188-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "01C1B1B5-8A28-49EA-875D-3AA7C2205DC0");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 124, 0, 540, 116, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UNITAORGANIZ.InitStatus = 2;
    PAN_UNITAORGANIZ_Init();
    PAN_UNITAORGANIZ_InitFields();
    PAN_UNITAORGANIZ_InitQueries();
    BKW_LIBROFINANZI = new OBook(this);
    BUK_LIBROFINANZI = new CIDREObj(BKW_LIBROFINANZI);
    BKW_LIBROFINANZI.iGuid = "93E7D4CF-9E14-45AC-99A4-51E33D39436F";
    BKW_LIBROFINANZI.Code = "BUK_LIBROFINANZI";
    BKW_LIBROFINANZI.BookObj = BUK_LIBROFINANZI;
    BKW_LIBROFINANZI.InitDefMasks();
    BUK_LIBROFINANZI.InitBook(1, 1245185, "Libro Finanziamenti", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROFINANZI.InitHTML();
    BUK_LIBROFINANZI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROFINANZI.Book.SetMainFrm(MainFrm);
    BUK_LIBROFINANZI.SetRTCGuid(0, "93E7D4CF-9E14-45AC-99A4-51E33D39436F");
    BUK_LIBROFINANZI.SetObjCode(0, "LIBROFINANZI");
    if (PAN_FINANZIAMENT != null)
      PAN_FINANZIAMENT.SetBook(BUK_LIBROFINANZI);
    BUK_LIBROFINANZI_MST_NUOVPAGIMAST_Init();
    BUK_LIBROFINANZI_RPT_NUOVOREPORT_Init();
    BUK_LIBROFINANZI_InitLinks();
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
    // Resetto il fuoco perchË le tabbed view lo possono modificare
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG139+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI67+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG139+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FINANPERCONT+BaseCmdLinIdx)
      {
        CmdFunzioniPerContributo();
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
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
      PAN_UNITAORGANIZ.UpdatePanel(MainFrm);
      // BUK_LIBROFINANZI.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_MUTUI && flRis && IdxPanelActived == PAN_FINANZIAMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_FINANZIAMENT_SCELTAMUTUO) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_LIBROFINANZI")) return BUK_LIBROFINANZI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato Ë una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Finanziamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Finanziamenti.class.getName() : (Glb.ClassWithPackage(Finanziamenti.class) ? Finanziamenti.class.getName().substring(Finanziamenti.class.getPackage().getName().length() + 1) : Finanziamenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).equals((new IDVariant("I")), true))
      {
        PAN_FINANZIAMENT.set_Layout((new IDVariant(1)).intValue());
        DisabilitaTutto();
      }
      else
      {
        AbilitaFormList((new IDVariant(PAN_FINANZIAMENT.Layout())));
      }
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (MainFrm.INTEGRAZIPBM.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Load", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_SOGGETTI2, IMDBDef9.PQSL_SOGGETTI2_CODICE, 0),IDVariant.INTEGER));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0),IDVariant.INTEGER));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_MUTUI)), true) && Result.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0))))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0, IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_NUMERO_MUTUO, 0));
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0, IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_ANNO_MUTUO, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0, IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_NUMERO_MUTUO, 0));
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0, IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_ANNO_MUTUO, 0));
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0, IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_ISTITUTO, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NOTE, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_LEGGE_REG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0).equals((new IDVariant(3)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CAPITOLO_REG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0).equals((new IDVariant(4)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ATTO_ASS, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "EndModal", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // PerchË stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, new IDVariant());
  }

  // **********************************************************************
  // Finanziamenti On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_DESCRIZIONE, 0).stringValue()); 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ENTEFINANZIA,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ENTEFINANZIA))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0))))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        if ((new IDVariant(PAN_FINANZIAMENT.Layout())).equals((new IDVariant(1)), true))
        {
          if (PAN_FINANZIAMENT.IsNewRow())
          {
            if (MainFrm.NUMFINAUTO.equals((new IDVariant("SI")), true))
            {
              PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
            else
            {
              PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
          }
          else
          {
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NOTE, 0))))
          {
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java Ë l'errore nativo del database mentre in C# Ë l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Finanziamenti On Database Error Body
      // Corpo Procedura
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0))))
        {
          if (!(ControlloMutui()))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Mutuo Inesistente"));
            MainFrm.set_AlertMessage(v_SMS); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0))) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Estremi Mutuo Incompleti"));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0))))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Estremi Mutuo Incompleti"));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        PAN_FINANZIAMENT.set_Layout((new IDVariant(1)).intValue());
        IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        PAN_FINANZIAMENT.set_Layout((new IDVariant(1)).intValue());
        IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, (new IDVariant(1)));
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Change Layout
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti On Change Layout Body
      // Corpo Procedura
      // 
      AbilitaFormList(NewLayout);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnChangeLayout", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0)) && MainFrm.NUMFINAUTO.compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Codice Obbligatorio"));
        MainFrm.set_AlertMessage(v_SMS); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
      if (MainFrm.NUMFINAUTO.equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0)))
      {
        IDVariant v_CODICE = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.NUMERAZIONEFINOPE((new IDVariant("FINA")), (new IDVariant("X")), (new IDVariant("X")), v_CODICE);
        IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0, new IDVariant(v_CODICE));
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldWasModified.booleanValue() && Column.equals((new IDVariant(PFL_FINANZIAMENT_CODICE)), true))
      {
        if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEDUPL, 0, (new IDVariant(0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_FINANZIAMENT.GetNumRows())).compareTo((new IDVariant(0)), true)>0 && !(IDL.IsNull(MainFrm.COMPETFINANZ)))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI4+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI4+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiAfterFind", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_FINANZIAMENT_ENTEFINANZIA)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_STRINDACERCA = null;
          v_STRINDACERCA = IDL.Add(IDL.Add((new IDVariant("%")), (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ENTEFINANZIA)))), (new IDVariant("%")));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BEN A ");
          SQL.append("where ((LOWER(TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA) LIKE LOWER(" + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) OR (LOWER(A.CODICE_FISCALE) LIKE LOWER(" + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) OR (LOWER(A.PARTITA_IVA) LIKE LOWER(" + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Soggetto non trovato"));
            IDVariant v_INSSOGG = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CF4WEB_ABILITA_INS_BEN(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",'FIN'," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL) as CDCAIBSMFSUN ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_INSSOGG = QV.Get("CDCAIBSMFSUN", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_INSSOGG.equals((new IDVariant("SI")), true))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Il Soggetto indicato non Ë stato trovato, si desidera inserire una nuova registrazione?"));
              if (MainFrm.MessageConfirm(v_SMS))
              {
                IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ENTEFINANZIA))));
                MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
              }
            }
            else
            {
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "FinanziamentiOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Unit‡ Organizzative Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_UNITAORGANIZ_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unit‡ Organizzative Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_FINANZIAMENTO, 0, IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unit‡OrganizzativeBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Unit‡ Organizzative Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_UNITAORGANIZ_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unit‡ Organizzative Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_DATA_ULTIMO_AGG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_FINANZIAMEUO, IMDBDef8.PQSL_FINANZIAMEUO_FINANZIAMENTO, 0, IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CODICE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unit‡OrganizzativeBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Unit‡ Organizzative On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_UNITAORGANIZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_UNITAORGANIZ);
      // 
      // Unit‡ Organizzative On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        if (!(PAN_UNITAORGANIZ.IsNewRow()))
        {
          PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unit‡OrganizzativeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Unit‡ Organizzative On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_UNITAORGANIZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unit‡ Organizzative On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (new IDVariant(PAN_FINANZIAMENT.Status()).equals((new IDVariant(3)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Salvare prima il finanziamento"));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unit‡OrganizzativeOnCommand", _e);
    }
  }

  // **********************************************************************
  // Unit‡ Organizzative On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java Ë l'errore nativo del database mentre in C# Ë l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_UNITAORGANIZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_UNITAORGANIZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Unit‡ Organizzative On Database Error Body
      // Corpo Procedura
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Unit‡OrganizzativeOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Scelta Soggetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Soggetto Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SOGGETTI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "SceltaSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Mutuo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaMutuo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Mutuo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI478, IMDBDef1.FLD_PARAMETRI478_PARAMISTITUT, 0, IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0));
      MainFrm.Show(MyGlb.FRM_MUTUI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "SceltaMutuo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Note
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Note Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NOTE, 0), (new IDVariant("Note")), ((IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).equals((new IDVariant("I"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "SceltaNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Tutto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DisabilitaTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Tutto Body
      // Corpo Procedura
      // 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "DisabilitaTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Funzioni Per Contributo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CmdFunzioniPerContributo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Funzioni Per Contributo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARANCHEESAU, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARTIPOCONTR, 0, (new IDVariant("F")));
      MainFrm.Show(MyGlb.FRM_FINANPERCONT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "CmdFunzioniPerContributo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Mutui
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean ControlloMutui ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Mutui Body
      // Corpo Procedura
      // 
      IDVariant v_RETVAL = null;
      v_RETVAL = (new IDVariant(-1));
      IDVariant v_CONT = new IDVariant(0,IDVariant.INTEGER);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0))))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TESTATE_MUTUI A ");
          SQL.append("where (A.NUMERO_MUTUO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_MUTUO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ISTITUTO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  TESTATE_MUTUI A ");
          SQL.append("where (A.NUMERO_MUTUO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_NUMERO_MUTUO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_MUTUO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ANNO_MUTUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
      }
      if (v_CONT.equals((new IDVariant(0)), true))
      {
        v_RETVAL = (new IDVariant(0));
        return v_RETVAL.booleanValue();
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "ControlloMutui", _e);
      return false;
    }
  }

  // **********************************************************************
  // Legge reg
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Leggereg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Legge reg Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_LEGGE_REG, 0), (new IDVariant("Legge Regionale")), ((IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).equals((new IDVariant("I"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Leggereg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cap reg
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Capreg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cap reg Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0, (new IDVariant(3)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_CAPITOLO_REG, 0), (new IDVariant("Capitolo Regionale")), ((IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).equals((new IDVariant("I"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Capreg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Atto ass
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Attoass ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Atto ass Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGEFLAG, 0, (new IDVariant(4)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ATTO_ASS, 0), (new IDVariant("Atto Assegnazione")), ((IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).equals((new IDVariant("I"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "Attoass", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Beneficiario
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Beneficiario Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, new IDVariant(IMDB.Value(IMDBDef8.PQRY_FINANZIAME21, IMDBDef8.PQSL_FINANZIAME21_ENTE, 0),IDVariant.FLOAT));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "InfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilita Form List
  // Layout:  - Input
  // **********************************************************************
  public int AbilitaFormList (IDVariant Layout)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Form List Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAM144, IMDBDef1.FLD_PARAM144_NOMEOGGETTIU, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        if (Layout.equals((new IDVariant(0)), true))
        {
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
          PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
          if (MainFrm.NUMFINAUTO.equals((new IDVariant("SI")), true))
          {
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          if (MainFrm.COMPETENZA.equals((new IDVariant("UC")), true))
          {
            PAN_UNITAORGANIZ.set_Visible((new IDVariant(-1)).booleanValue());
          }
          else
          {
            PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
          }
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Finanziamenti", "AbilitaFormList", _e);
      return -1;
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioË quando viene portata in primo piano
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
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_SCELTAENTE)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_SCELTAMUTUO)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaMutuo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_SCELNOTEPIEN)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_ATTOASS)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Attoass();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_LEGGEREG)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Leggereg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_CAPREG)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Capreg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_SCELNOTEVUOT)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_INFOENTE)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FINANZIAMENT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_UNITAORGANIZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_UNITAORGANIZ, Cancel);
    // Stub
  }

  private void PAN_UNITAORGANIZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_UNITAORGANIZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_UNITAORGANIZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_UNITAORGANIZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBROFINANZI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROFINANZI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROFINANZI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_DETTAGLIO)
    {
      BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_TSFNAMFLFINI, new IDVariant(IDL.Add(IDL.ToString(BUK_LIBROFINANZI.GetReportColumn(BUK_LIBROFINANZI_RPT_NUOVOREPORT, "FINNUMANNMUT")), ((!(IDL.IsNull(BUK_LIBROFINANZI.GetReportColumn(BUK_LIBROFINANZI_RPT_NUOVOREPORT, "FINAANNOMUTU"))))?IDL.Add((new IDVariant(" / ")), IDL.ToString(BUK_LIBROFINANZI.GetReportColumn(BUK_LIBROFINANZI_RPT_NUOVOREPORT, "FINAANNOMUTU"))):(new IDVariant())))));
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBROFINANZI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBROFINANZI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROFINANZI_MST_NUOVPAGIMAST)
    {
      BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_TSLFFPNTSLFF, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_LIBROFINANZI.GetPageNumber()))), (new IDVariant("/"))), IDL.ToString((new IDVariant(BUK_LIBROFINANZI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBROFINANZI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROFINANZI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROFINANZI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROFINANZI_OnPreview()
  {
    PreviewBook = BKW_LIBROFINANZI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, "BD67870F-0B7F-4F0A-8F7C-745CB0566A68");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, "Codice");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, "25D563D3-750B-4DC5-8544-AFFD8E386E5C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, "Descrizione");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, "5A04C5D3-E9E7-402F-A544-BE2243CCC732");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, "ENTE");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, "B48E7351-011C-43C3-88F6-89320077DDEA");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, "Numero / Anno Mutuo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, "93C92924-FF16-4232-9132-13E7860AED0D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, "ANNO MUTUO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, "6D3BE9F5-79B2-4BB1-9910-C5791C16BF76");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, "Importo Originale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, "7EA60BF0-A9CD-4594-9B94-F4DDCB18C7B8");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, "Durata");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, "56479EFA-1978-4B42-87EC-DE6ECF271AFC");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, "Ente");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "2A81F262-55CF-4307-A687-6DAD4282B03F");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "Scadenza");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, "A5D2A907-6C7F-41B0-B0AB-41A1056D4276");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, "Categoria");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "F616434A-3D0B-48E6-A426-FF0F4E1E3E8A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "Allegato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, "76831296-9254-4000-9A79-DF063011507E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, "Finanz. Disavanzo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, "DCC30800-FBEB-4799-82FF-F3D2800F2D6E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, "Dipartimento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, "59A4D840-49AC-4957-8A8E-8B40FBFF4ED5");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, "Legge Regionale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, "9D3B7E02-8478-4178-908F-8CD6736A9509");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, "Capitolo Regionale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, "A355679E-BC67-4F81-9C5A-277E9B73CEAC");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, "Atto Assegnazione");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, "544A8967-8B9D-49E7-87F2-FFFA03973D7A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, 0, "wsearch1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, "97EA0550-40EA-466C-83A1-87EAA9CF5748");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, "/");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, "DF108C30-877C-45EF-9A71-7F2E7732EEBA");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, 0, "wsearch1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, "0C890C9B-9ADB-4145-8E1C-98902560EF1E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, "Note");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, "A95C4722-CF58-473B-A1D9-65F5AB9814CF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, 0, "nota scritta.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, "27E2A754-2DDD-435A-8597-C9E4C99C3E78");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, "DE365AF5-E308-4467-BBCF-6165C39827F5");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, 0, "testo.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, "6983FC99-0608-4FF7-A60B-78CC69D2B30F");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, 0, "testo.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, "179B16F6-BCD3-423F-822F-69DA4FFA2777");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, 0, "testo.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, "D8CDB0B5-C7B4-4254-965D-C596FD510641");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, 0, "nota bianca.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, "67B28559-31EA-4002-9125-C08B69D3DC7A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, "Note");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, "69E6960F-711F-456B-9116-D95B926D9725");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, 0, "info.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, "0457A7E7-CCAE-491C-807C-53D81199063E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, "Da Rendicontare al MEF");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, "Finanziamento da Rendicontare al MEF");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.VIS_CHECKSTYLE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_LIST, 0, 40, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_FORM, 44, 0, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CODICE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CODICE, PPQRY_FINANZIAME21, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 40, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 44, 24, 644, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DESCRIZIONE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DESCRIZIONE, PPQRY_FINANZIAME21, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_LIST, 324, 64, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_LIST, 36);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_LIST, "ENTE");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_FORM, 608, 80, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_FORM, 36);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTE, MyGlb.PANEL_FORM, "ENTE");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ENTE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ENTE, PPQRY_FINANZIAME21, "A.ENTE", "ENTE", 1, 6, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_LIST, 364, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_LIST, 100);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_LIST, "Numero / Anno Mutuo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_FORM, 8, 104, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_FORM, 132);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEANNOMUTU, MyGlb.PANEL_FORM, "Numero / Anno Mutuo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NUMEANNOMUTU, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NUMEANNOMUTU, PPQRY_FINANZIAME21, "A.NUMERO_MUTUO", "NUMERO_MUTUO", 5, 10, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_LIST, 464, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_LIST, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_LIST, "ANNO MUTUO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_FORM, 248, 104, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_FORM, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOMUTUO, MyGlb.PANEL_FORM, "ANNO MUTUO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ANNOMUTUO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ANNOMUTUO, PPQRY_FINANZIAME21, "A.ANNO_MUTUO", "ANNO_MUTUO", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_LIST, 548, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_LIST, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_LIST, "Importo Originale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_FORM, 28, 128, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_FORM, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTORIGIN, MyGlb.PANEL_FORM, "Importo Originale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPORTORIGIN, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPORTORIGIN, PPQRY_FINANZIAME21, "A.IMPORTO_ORIG", "IMPORTO_ORIG", 3, 14, 2, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_LIST, 720, 68, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_LIST, 88);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_LIST, "Durata");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_FORM, 316, 128, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_FORM, 88);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DURATA, MyGlb.PANEL_FORM, "Durata");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DURATA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DURATA, PPQRY_FINANZIAME21, "A.TIPO_DURATA", "TIPO_DURATA", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_LIST, 324, 40, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_LIST, 132);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_LIST, "Ente");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_FORM, 104, 80, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_FORM, 36);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ENTEFINANZIA, MyGlb.PANEL_FORM, "Ente");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ENTEFINANZIA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ENTEFINANZIA, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENENTE", 5, 162, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 540, 40, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 576, 128, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCADENZA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCADENZA, PPQRY_FINANZIAME21, "A.SCADENZA", "SCADENZA", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_LIST, 604, 40, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_LIST, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_FORM, 64, 152, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_FORM, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CATEGORIA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CATEGORIA, PPQRY_FINANZIAME21, "A.CATEGORIA", "CATEGORIA", 1, 3, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 808, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, "Allegato");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 16, 176, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 124);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, "Allegato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ALLEGATO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ALLEGATO, PPQRY_FINANZIAME21, "A.COD_ALLEGATO", "COD_ALLEGATO", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_LIST, 900, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_LIST, "Finanz. Disavanzo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_FORM, 320, 176, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_FORM, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZDISAVA, MyGlb.PANEL_FORM, "Finanz. Disavanzo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZDISAVA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZDISAVA, PPQRY_FINANZIAME21, "A.COD_FIN_DISAV", "COD_FIN_DISAV", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_LIST, 440, 68, 380, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_LIST, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_LIST, "Dipartimento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_FORM, 44, 200, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_FORM, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DIPARTIMENTO, MyGlb.PANEL_FORM, "Dipartimento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DIPARTIMENTO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DIPARTIMENTO, PPQRY_FINANZIAME21, "A.DIPARTIMENTO", "DIPARTIMENTO", 5, 150, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_LIST, 820, 68, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_LIST, "Legge Regionale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_FORM, 36, 224, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREGIONA, MyGlb.PANEL_FORM, "Legge Regionale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LEGGEREGIONA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LEGGEREGIONA, PPQRY_FINANZIAME21, "A.LEGGE_REG", "LEGGE_REG", 5, 50, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_LIST, 928, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_LIST, "Capitolo Regionale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_FORM, 384, 224, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_FORM, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOREGION, MyGlb.PANEL_FORM, "Capitolo Regionale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOREGION, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOREGION, PPQRY_FINANZIAME21, "A.CAPITOLO_REG", "CAPITOLO_REG", 5, 50, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 1020, 68, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 64);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_LIST, "Atto Assegnazione");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 24, 248, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASSEGNAZ, MyGlb.PANEL_FORM, "Atto Assegnazione");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ATTOASSEGNAZ, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ATTOASSEGNAZ, PPQRY_FINANZIAME21, "A.ATTO_ASS", "ATTO_ASS", 5, 50, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_LIST, 504, 84, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_FORM, 692, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAENTE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCELTAENTE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCELTAENTE, -1, "", "SCELTAENTE", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_LIST, 224, 108, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_FORM, 228, 104, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_BARRA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_LIST, 512, 92, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_FORM, 296, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELTAMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCELTAMUTUO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCELTAMUTUO, -1, "", "SCELTAMUTUO", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_LIST, 992, 68, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_LIST, 36);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_LIST, "Note");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_FORM, 464, 252, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_FORM, 36);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE2, MyGlb.PANEL_FORM, "Note");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NOTE2, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NOTE2, PPQRY_FINANZIAME21, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_LIST, 512, 92, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_FORM, 728, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEPIEN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCELNOTEPIEN, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCELNOTEPIEN, -1, "", "SCELNOTEPIEN", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_LIST, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 372, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_FORM, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTEINSER1, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTEINSER1, PPQRY_FINANZIAME21, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_LIST, 520, 100, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_FORM, 356, 252, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ATTOASS, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ATTOASS, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ATTOASS, -1, "", "ATTOASS", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_LIST, 528, 108, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_FORM, 356, 228, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LEGGEREG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LEGGEREG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LEGGEREG, -1, "", "LEGGEREG", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_LIST, 536, 116, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_FORM, 692, 228, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPREG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPREG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPREG, -1, "", "CAPREG", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_LIST, 520, 100, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_FORM, 728, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_SCELNOTEVUOT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_SCELNOTEVUOT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_SCELNOTEVUOT, -1, "", "SCELNOTEVUOT", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_LIST, 708, 48, 40, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_FORM, 692, 24, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NOTE1, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_LIST, 512, 92, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_FORM, 712, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOENTE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INFOENTE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INFOENTE, -1, "", "INFOENTE", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_LIST, 804, 40, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_LIST, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_LIST, "Da Rend. al MEF");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_FORM, 512, 248, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_FORM, 152);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_RENDALMEF, MyGlb.PANEL_FORM, "Da Rendicontare al MEF");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_RENDALMEF, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_RENDALMEF, PPQRY_FINANZIAME21, "A.REND_AL_MEF", "REND_AL_MEF", 5, 2, 0, -13997);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_RENDALMEF, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_RENDALMEF, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENENTE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ENTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_FINANZIAMENT.SetQueryLKE(PPQRY_BEN, PFL_FINANZIAMENT_ENTE, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENENTE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryHeaderColumn(PPQRY_BEN, "BENENTE", "Ente");
    PAN_FINANZIAMENT.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_FINANZIAMENT.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    PAN_FINANZIAMENT.SetQueryHeaderColumn(PPQRY_BEN, "RAGIONE_SOCIALE_ESTESA", "BEN RAGIONE SOCIALE ESTESA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEGFINCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CATEGFINDESC ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FIN A ");
    SQL.append("where (A.CODICE = ~~CATEGORIA~~) ");
    SQL.append("and   (A.TIPO = 'F') ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CATEGORIEFIN, 0, SQL, PFL_FINANZIAMENT_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEGFINCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CATEGFINDESC ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FIN A ");
    SQL.append("where (A.TIPO = 'F') ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_CATEGORIEFIN, 1, SQL, PFL_FINANZIAMENT_CATEGORIA, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_CATEGORIEFIN, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESC_ABB as T69DESCABB ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("where (A.CODICE = ~~COD_ALLEGATO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_T69, 0, SQL, PFL_FINANZIAMENT_ALLEGATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESC_ABB as T69DESCABB ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_T69, 1, SQL, PFL_FINANZIAMENT_ALLEGATO, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_T69, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINADISACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINADISADESC ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI_DISAV A ");
    SQL.append("where (A.CODICE = ~~COD_FIN_DISAV~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIDISAV, 0, SQL, PFL_FINANZIAMENT_FINANZDISAVA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINADISACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINADISADESC ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI_DISAV A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIDISAV, 1, SQL, PFL_FINANZIAMENT_FINANZDISAVA, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIDISAV, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINANZIAME21", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ENTE as ENTE, ");
    SQL.append("  A.NUMERO_MUTUO as NUMERO_MUTUO, ");
    SQL.append("  A.ANNO_MUTUO as ANNO_MUTUO, ");
    SQL.append("  A.IMPORTO_ORIG as IMPORTO_ORIG, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.TIPO_DURATA as TIPO_DURATA, ");
    SQL.append("  A.COD_ALLEGATO as COD_ALLEGATO, ");
    SQL.append("  A.COD_FIN_DISAV as COD_FIN_DISAV, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.DIPARTIMENTO as DIPARTIMENTO, ");
    SQL.append("  A.LEGGE_REG as LEGGE_REG, ");
    SQL.append("  A.CAPITOLO_REG as CAPITOLO_REG, ");
    SQL.append("  A.ATTO_ASS as ATTO_ASS, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.REND_AL_MEF as REND_AL_MEF, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', 'SI', CHECK_FINOPE_COMP(A.CODICE," + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'LG','F')) = 'SI') ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAME21, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAME21, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINANZIAMENTI");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_CODICE, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_UNITAORGANIZ_Init()
  {

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "CF6463AC-08E4-4B29-B910-B99ACD40EEED");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "Unit‡ Organizzativa");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "BFAD2988-BFDD-4712-AA5E-AAE589B2E24D");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "8E54E5F6-946C-4489-A0CE-3637D024EE93");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "2B3C8906-B4D1-4F0B-9888-26DC19EBA398");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "0E586C0A-50DE-4810-A7D5-28045B6D599F");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "9398BBC7-5F07-492B-95B6-B09ACBFB0C33");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "PROGRESSIVO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, "44F9AFEF-75D7-48F8-BE8C-6C2EF652B4F0");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, "FINANZIAMENTO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.VIS_NONNULLAFIEL);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, 0, -1);
  }

  private void PAN_UNITAORGANIZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 124, 36, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 184);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unit‡ Organizzativa");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unit‡ Organizzativa");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UNITAORGANIZ, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UNITAORGANIZ, PPQRY_FINANZIAMEUO, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 40, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UTENTEINSERI, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UTENTEINSERI, PPQRY_FINANZIAMEUO, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 112, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DATAINSERIME, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DATAINSERIME, PPQRY_FINANZIAMEUO, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UTENTULTIAGG, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UTENTULTIAGG, PPQRY_FINANZIAMEUO, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 312, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DATAULTIMAGG, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DATAULTIMAGG, PPQRY_FINANZIAMEUO, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_PROGRESSIVO, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_PROGRESSIVO, PPQRY_FINANZIAMEUO, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_FINANZIAMENT, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_FINANZIAMENT, PPQRY_FINANZIAMEUO, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
  }

  private void PAN_UNITAORGANIZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.CODICE_UO || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CF4WSTRDESUO ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by 2 ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_CF4WEBSTRUTT, 0, SQL, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.CODICE_UO || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CF4WSTRDESUO ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by 2 ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_CF4WEBSTRUTT, 1, SQL, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_CF4WEBSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetIMDB(IMDB, "PQRY_FINANZIAMEUO", true);
    PAN_UNITAORGANIZ.set_SetString(MyGlb.MASTER_ROWNAME, "FINANZIAMENTI UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI_UO A ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FINANZIAMENTO = ~~PQRY_FINANZIAME21.CODICE~~) ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_FINANZIAMEUO, 5, SQL, -1, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_FINANZIAMEUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetMasterTable(0, "FINANZIAMENTI_UO");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_UNITAORGANIZ.Status() == 2)
    {
      int oldListQBE = PAN_UNITAORGANIZ.iUseListQBE;
      PAN_UNITAORGANIZ.iUseListQBE = 0;
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_FIND);
      PAN_UNITAORGANIZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBROFINANZI_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBROFINANZI.InitMastro(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, "9C6D1F0D-493C-465A-96C5-59DAE1809C73");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_TESTATPAGINA, 1000, 1500, 27700, 3400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TESTATPAGINA, "50D8D925-2FC7-4531-B207-A0C0902F602D");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA, 1000, 4900, 27700, 14100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA, "AD9680A0-9CCA-48E9-9686-1CC59DD2EEDE");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_NUOVOBOX1, 25600, 500, 3100, 800, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX1, "CE01D3F5-ED0F-48ED-969B-EC8E1F1000B7");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX1, "NUOVOBOX1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX1, BUK_LIBROFINANZI_SPAN_TSLFFPNTSLFF, MyGlb.VIS_NORMAA9RIGHT, 5, 199, 0, 271384705, "", "", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_TSLFFPNTSLFF, "2511BB05-A733-4EEC-90F9-DEBAF0D93753");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_TSLFFPNTSLFF, "TSLFFPNTSLFF");
  }

  private void BUK_LIBROFINANZI_RPT_NUOVOREPORT_InitQuery() { BUK_LIBROFINANZI_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBROFINANZI_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as FINANZCODICE, ");
      SQL.append("  A.DESCRIZIONE as FINANZDESCRI, ");
      SQL.append("  A.ENTE as FINANZIAENTE, ");
      SQL.append("  A.NUMERO_MUTUO as FINNUMANNMUT, ");
      SQL.append("  A.ANNO_MUTUO as FINAANNOMUTU, ");
      SQL.append("  A.IMPORTO_ORIG as FINAIMPOORIG, ");
      SQL.append("  A.CATEGORIA as FINANZCATEGO, ");
      SQL.append("  A.TIPO_DURATA as FINANZDURATA, ");
      SQL.append("  A.COD_ALLEGATO as FINAALLALPEG, ");
      SQL.append("  A.COD_FIN_DISAV as FINAFINADISA, ");
      SQL.append("  A.NOTE as FINANZIANOTE, ");
      SQL.append("  A.DIPARTIMENTO as FINANZDIPART, ");
      SQL.append("  A.LEGGE_REG as FINALEGGREGI, ");
      SQL.append("  A.CAPITOLO_REG as FINACAPIREGI, ");
      SQL.append("  A.ATTO_ASS as FINAATTOASSE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as FINAUTENINSE, ");
      SQL.append("  A.SCADENZA as FINANZSCADEN, ");
      SQL.append("  B.CODICE as FINCATFINCOD, ");
      SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE as FINANZDESCR1, ");
      SQL.append("  C.CODICE as FINANT69CODI, ");
      SQL.append("  C.DESC_ABB as FINT69DESABB, ");
      SQL.append("  D.CODICE as FINADISACODI, ");
      SQL.append("  TO_CHAR ( D.CODICE ) || ' - ' || D.DESCRIZIONE as FINANZDESCR2, ");
      SQL.append("  E.RAGIONE_SOCIALE as FINBENRAGSOC ");
      SQL.append("from ");
      SQL.append("  FINANZIAMENTI A, ");
      SQL.append("  CATEGORIE_FIN B, ");
      SQL.append("  T69 C, ");
      SQL.append("  FINANZIAMENTI_DISAV D, ");
      SQL.append("  BEN E ");
      SQL.append("where (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', 'SI', CHECK_FINOPE_COMP(A.CODICE," + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'LG','F')) = 'SI') ");
      SQL.append("and   (B.CODICE(+) = A.CATEGORIA) ");
      SQL.append("and   (B.TIPO(+) = 'F') ");
      SQL.append("and   (C.CODICE(+) = A.COD_ALLEGATO) ");
      SQL.append("and   (D.CODICE(+) = A.COD_FIN_DISAV) ");
      SQL.append("and   (E.CODICE(+) = A.ENTE) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_LIBROFINANZI.SetReportQuery(BUK_LIBROFINANZI_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "C2B6EEA3-9006-48E2-91A5-40877A7223DB");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROFINANZI_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBROFINANZI.InitReport(BUK_LIBROFINANZI_RPT_NUOVOREPORT, 196609);
    BUK_LIBROFINANZI_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPT_NUOVOREPORT, "E1C024FB-8B61-457E-8F5C-CFA37B5E92E9");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_NUOVOREPORT, BUK_LIBROFINANZI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_INTESTREPORT, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_INTESTREPORT, "DC9513CD-B866-4A88-87A2-DF992B183093");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_NUOVOREPORT, BUK_LIBROFINANZI_SEC_INTESTPAGINA, 3000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TESTATPAGINA);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_INTESTPAGINA, "DBA3AAF3-4260-464D-B8E2-DAA3149CEDD9");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TITOLO, 100, 200, 27400, 1200, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TITOLO, "F5204713-4677-48DB-B24F-D054D57A6A08");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_TITOLO, BUK_LIBROFINANZI_SPAN_FINANZIAMENT, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Finanziamenti", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, "E9D0A96D-8E4F-4ACC-BFC8-8519A34B702D");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_CODICEHEADER, 0, 2300, 1400, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CODICEHEADER, "2823E705-81E8-439D-983A-609930C272D9");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CODICEHEADER, BUK_LIBROFINANZI_SPAN_CODICE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_CODICE1, "6E42C08B-DAD8-4669-940E-F781C052FDA4");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_CODICE1, "CODICE1");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_DESCRIHEADER, 1700, 2300, 4600, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADER, "C8C9D845-8A9A-41E9-BD39-4671C6B01933");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADER, BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, "E894FC6F-4199-4A99-A553-77EC4B27DAF0");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_ENTE1, 12400, 2300, 1512, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_ENTE1, "6B436057-55F1-4700-AB20-9BB0C7072504");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_ENTE1, "ENTE1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_ENTE1, BUK_LIBROFINANZI_SPAN_ENTEFIN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Ente Fin", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_ENTEFIN, "AA2636B9-F414-42B6-92A5-65332B6E7000");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_ENTEFIN, "ENTEFIN");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_MUTUOHEADER, 15800, 2300, 3900, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_MUTUOHEADER, "D6400FBB-F83F-4D60-A06D-C5A6D0BF4DF1");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_MUTUOHEADER, "MUTUOHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_MUTUOHEADER, BUK_LIBROFINANZI_SPAN_NUMEANNOMUTU, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Numero / Anno Mutuo", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_NUMEANNOMUTU, "7EA2043A-60B0-4B51-B9A9-2B5BDAA8E4AA");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_NUMEANNOMUTU, "NUMEANNOMUTU");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_SCADENHEADER, 14000, 2300, 1700, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_SCADENHEADER, "40CE1D2A-59B4-491C-A9BA-6D73E30EFC9C");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_SCADENHEADER, "SCADENHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_SCADENHEADER, BUK_LIBROFINANZI_SPAN_SCADENZA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Scadenza", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_SCADENZA, "1E4833C0-9987-4314-B72B-93CB46B60B97");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_SCADENZA, "SCADENZA");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_DESCABBHEADE, 19900, 2300, 3154, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCABBHEADE, "441A9D0D-94C2-48F1-9815-BFF5053596AA");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCABBHEADE, "DESCABBHEADE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCABBHEADE, BUK_LIBROFINANZI_SPAN_C, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Allegato", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_C, "7B8E238D-08B7-4D18-B773-D64F370A27EE");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_C, "C");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEAD, 23200, 2300, 2236, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEAD, "CA7EC28E-1907-48B1-A74B-8BA90B419779");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEAD, "IMPOORIGHEAD");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEAD, BUK_LIBROFINANZI_SPAN_IMPORTOORIG, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Importo Orig.", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_IMPORTOORIG, "075C2955-DC07-4962-90D3-2BF0CA572205");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_IMPORTOORIG, "IMPORTOORIG");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TIPODURAHEAD, 25599, 2300, 1701, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TIPODURAHEAD, "859DF559-6D6B-4CAD-900A-550794C9A555");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TIPODURAHEAD, "TIPODURAHEAD");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_TIPODURAHEAD, BUK_LIBROFINANZI_SPAN_DURATA1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Durata", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_DURATA1, "48828F2F-33CC-41A0-9155-84EECB6B2442");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_DURATA1, "DURATA1");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_NUOVOREPORT, BUK_LIBROFINANZI_SEC_DETTAGLIO, 900, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_DETTAGLIO, "3CB14B6B-9C9C-4C74-AE0F-73769E288FDA");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_CODICE, 0, 0, 1500, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CODICE, "794BB2E3-96C4-4901-A55E-0D606CFC349A");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CODICE, "CODICE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CODICE, BUK_LIBROFINANZI_SPAN_FINCODFILIFI, MyGlb.VIS_NORMALEA9, 1, 5, 0, 271384705, "", "::FINANZCODICE", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINCODFILIFI, "257CCA5C-6CEB-4779-919A-3122653837F0");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINCODFILIFI, "FINCODFILIFI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE, 1700, 0, 10600, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE, "7387DB82-CF0A-4CEB-B3AB-15D91AD7F7FE");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE, BUK_LIBROFINANZI_SPAN_FINDESFILIFI, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::FINANZDESCRI", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINDESFILIFI, "4FDED011-16E7-48C8-B82D-803FFC4A0FFA");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINDESFILIFI, "FINDESFILIFI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_ENTE, 12400, 0, 1512, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_ENTE, "AE50F37C-7014-40CA-B57E-2D50D35BC8AF");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_ENTE, "ENTE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_ENTE, BUK_LIBROFINANZI_SPAN_FINENTFILIFI, MyGlb.VIS_NORMALEA9, 1, 6, 0, 271384705, "", "::FINANZIAENTE", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINENTFILIFI, "1247AAD7-670A-4360-B3D3-DD6CED85913E");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINENTFILIFI, "FINENTFILIFI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_MUTUO, 15800, 0, 3900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_MUTUO, "9B816A89-73B6-4C17-A3E6-B4CB41C30E34");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_MUTUO, "MUTUO");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_MUTUO, BUK_LIBROFINANZI_SPAN_TSFNAMFLFINI, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "", "", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_TSFNAMFLFINI, "743E8A8B-860A-4543-B97C-2C374A8F4E5F");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_TSFNAMFLFINI, "TSFNAMFLFINI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG, 23200, 0, 2167, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG, "75B3B04D-8EF1-4A27-988E-92F5745FEAE8");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG, "IMPORTOORIG");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG, BUK_LIBROFINANZI_SPAN_FIIMORFILIFI, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::FINAIMPOORIG", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIIMORFILIFI, "882A95F5-F805-4906-8A1C-6AAA068F382A");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIIMORFILIFI, "FIIMORFILIFI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_TIPODURATA, 25633, 0, 1967, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TIPODURATA, "084B2379-920E-427E-8469-7617E85FBB53");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TIPODURATA, "TIPODURATA");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_TIPODURATA, BUK_LIBROFINANZI_SPAN_FINDURFILIFI, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::FINANZDURATA", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINDURFILIFI, "38DCFB3C-B675-4554-A0EF-320163022578");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINDURFILIFI, "FINDURFILIFI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_DESCABB, 19900, 0, 3200, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCABB, "96CA95A9-4DF8-4A94-93B0-7D8AD85D66BD");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCABB, "DESCABB");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCABB, BUK_LIBROFINANZI_SPAN_T69DESCABB, MyGlb.VIS_DEFAREPOSTYL, 5, 33, 0, 271384705, "", "::FINT69DESABB", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_T69DESCABB, "6B5EE677-BC65-453C-8063-D22E146DF751");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_T69DESCABB, "T69DESCABB");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, 14000, 0, 1700, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, "65201823-9E60-42A8-B86E-59D76DC1E409");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, "NUOVOBOX");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, BUK_LIBROFINANZI_SPAN_FINSCAFILIFI, MyGlb.VIS_NORMALEA9, 1, 4, 0, 271384705, "", "::FINANZSCADEN", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINSCAFILIFI, "FE38DAC3-204F-4039-86E1-4D27288B3064");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINSCAFILIFI, "FINSCAFILIFI");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_NUOVOREPORT, BUK_LIBROFINANZI_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_PIEDEREPORT, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_PIEDEREPORT, "FAB9084F-6E29-48EC-A01E-244A9FEB44CC");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBROFINANZI_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBROFINANZI_InitLinks()
  {
    BUK_LIBROFINANZI.SetBoxNextBox(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnChangeLayout(NewLayout, Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_BeforeInsert(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnPreview();
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
