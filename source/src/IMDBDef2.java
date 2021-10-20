// **********************************************
// Global functions and constants
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import java.sql.*;


// **********************************************
// **********************************************
public class IMDBDef2 extends Object
{
	// IMDB Constants
  // Definition of table: Old
  //
  public static int TBL_OLD = 201;
  public static int FLD_OLD_ANNODELOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI245 = 202;
  public static int FLD_PARAMETRI245_PARAMSEDEDEL = 0;
  public static int FLD_PARAMETRI245_PARAMNUMEDEL = 1;
  public static int FLD_PARAMETRI245_PARAMANNODEL = 2;

  // Definition of table: Paer
  //
  public static int TBL_PAER = 203;
  public static int FLD_PAER_ROWNAMSEDDEL = 0;
  public static int FLD_PAER_ROWNAMNUMDEL = 1;
  public static int FLD_PAER_ROWNAMANNDEL = 2;
  public static int FLD_PAER_ROWNAMUNIPRO = 3;
  public static int FLD_PAER_ROWNAMNUMPRO = 4;
  public static int FLD_PAER_ROWNAMANNPRO = 5;

  // Definition of table: Esecutività Proposte Da Gs4
  //
  public static int TBL_ESECPRODAGS4 = 204;
  public static int FLD_ESECPRODAGS4_ROWNAMEAGG = 0;
  public static int FLD_ESECPRODAGS4_ROWNAMUNIPRO = 1;
  public static int FLD_ESECPRODAGS4_ROWNAMNUMPRO = 2;
  public static int FLD_ESECPRODAGS4_ROWNAMANNPRO = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI221 = 205;
  public static int FLD_PARAMETRI221_PARAUNITPROP = 0;
  public static int FLD_PARAMETRI221_PARANUMEPROP = 1;
  public static int FLD_PARAMETRI221_PARAANNOPROP = 2;
  public static int FLD_PARAMETRI221_PARAMSTATO = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI248 = 206;
  public static int FLD_PARAMETRI248_PARAUNITPROP = 0;
  public static int FLD_PARAMETRI248_PARAMANNO = 1;
  public static int FLD_PARAMETRI248_PARAMDATA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI251 = 207;
  public static int FLD_PARAMETRI251_PARASOLINECO = 0;
  public static int FLD_PARAMETRI251_PARSOLDOINPR = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI252 = 208;
  public static int FLD_PARAMETRI252_PARAMSERVIZI = 0;
  public static int FLD_PARAMETRI252_PARADESCSERV = 1;
  public static int FLD_PARAMETRI252_PARAMTIPO = 2;
  public static int FLD_PARAMETRI252_PARAMINECONO = 3;

  // Definition of table: IMDB Sercos
  //
  public static int TBL_IMDBSERCOS = 209;
  public static int FLD_IMDBSERCOS_PROGRESSIVO = 0;
  public static int FLD_IMDBSERCOS_ESERCIZIO = 1;
  public static int FLD_IMDBSERCOS_SERVIZIO = 2;
  public static int FLD_IMDBSERCOS_E_S = 3;
  public static int FLD_IMDBSERCOS_CAPITOLO = 4;
  public static int FLD_IMDBSERCOS_IMDSERCAPOLD = 5;
  public static int FLD_IMDBSERCOS_ARTICOLO = 6;
  public static int FLD_IMDBSERCOS_IMDSERARTOLD = 7;
  public static int FLD_IMDBSERCOS_PERCENTUALE = 8;
  public static int FLD_IMDBSERCOS_IMDSERPEROLD = 9;
  public static int FLD_IMDBSERCOS_IMPORTO = 10;
  public static int FLD_IMDBSERCOS_IMDSERIMPOLD = 11;
  public static int FLD_IMDBSERCOS_FASE = 12;
  public static int FLD_IMDBSERCOS_TIPO = 13;
  public static int FLD_IMDBSERCOS_UTENTE_INSERIMENTO = 14;
  public static int FLD_IMDBSERCOS_DATA_INSERIMENTO = 15;
  public static int FLD_IMDBSERCOS_UTENTE_ULTIMO_AGG = 16;
  public static int FLD_IMDBSERCOS_DATA_ULTIMO_AGG = 17;
  public static int FLD_IMDBSERCOS_IMDBSERCSTAT = 18;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI253 = 210;
  public static int FLD_PARAMETRI253_PARAMSERVIZI = 0;
  public static int FLD_PARAMETRI253_PARAMTIPO = 1;

  // Definition of table: Nodo Corrente
  //
  public static int TBL_NODOCORRENTE = 211;
  public static int FLD_NODOCORRENTE_NODCORENTSPE = 0;
  public static int FLD_NODOCORRENTE_NODOCORRFUNZ = 1;
  public static int FLD_NODOCORRENTE_NODOCORRSERV = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI312 = 212;
  public static int FLD_PARAMETRI312_PARAMTIPO = 0;
  public static int FLD_PARAMETRI312_PARAMES = 1;
  public static int FLD_PARAMETRI312_PARAMCAPITOL = 2;
  public static int FLD_PARAMETRI312_PARAMARTICOL = 3;
  public static int FLD_PARAMETRI312_PARAMDESCRIZ = 4;
  public static int FLD_PARAMETRI312_PARAMSTANZIA = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI307 = 213;
  public static int FLD_PARAMETRI307_PARAMTIPO = 0;
  public static int FLD_PARAMETRI307_PARAMORDINAM = 1;
  public static int FLD_PARAMETRI307_PARAMINFO = 2;
  public static int FLD_PARAMETRI307_PARAMMODIFIC = 3;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB4 = 214;
  public static int FLD_IMDB4_ROWNAMECODI1 = 0;
  public static int FLD_IMDB4_ROWNAMRAGSOC = 1;
  public static int FLD_IMDB4_ROWNAMRICSOG = 2;
  public static int FLD_IMDB4_ROWNAMECLOSE = 3;
  public static int FLD_IMDB4_ROWNAMECODIC = 4;
  public static int FLD_IMDB4_ROWNAMEINFO = 5;
  public static int FLD_IMDB4_ROWNAMCAMCHI = 6;
  public static int FLD_IMDB4_ROWNAMEQUIET = 7;
  public static int FLD_IMDB4_ROWNAMDATDAL = 8;
  public static int FLD_IMDB4_ROWNAMENIBEN = 9;

  // Definition of table: Temp
  //
  public static int TBL_TEMP1 = 215;
  public static int FLD_TEMP1_ROWNAMEQUIET = 0;
  public static int FLD_TEMP1_ROWNAMRICSOG = 1;

  // Definition of table: QTN
  //
  public static int TBL_QTN = 216;
  public static int FLD_QTN_CODICE = 0;
  public static int FLD_QTN_NUM_QUIETANZA = 1;
  public static int FLD_QTN_TIPO_QUIETANZA = 2;
  public static int FLD_QTN_CONTO_CORRENTE = 3;
  public static int FLD_QTN_DES_BANCA = 4;
  public static int FLD_QTN_COD_BANCA = 5;
  public static int FLD_QTN_COD_SPORTELLO = 6;
  public static int FLD_QTN_INTESTATARIO_1 = 7;
  public static int FLD_QTN_INTESTATARIO_2 = 8;
  public static int FLD_QTN_INTESTATARIO_3 = 9;
  public static int FLD_QTN_SCADENZA = 10;
  public static int FLD_QTN_CIN_BANCARIO = 11;
  public static int FLD_QTN_IBAN_PAESE = 12;
  public static int FLD_QTN_IBAN_CIN_EUROPA = 13;
  public static int FLD_QTN_QUIETANZANTE = 14;
  public static int FLD_QTN_IBAN_ID_NAZIONALE = 15;
  public static int FLD_QTN_IBAN_CONTO = 16;
  public static int FLD_QTN_IBAN_EXTRA_UE = 17;
  public static int FLD_QTN_BIC = 18;
  public static int FLD_QTN_SPESE = 19;
  public static int FLD_QTN_UTENTE_INSERIMENTO = 20;
  public static int FLD_QTN_DATA_INSERIMENTO = 21;
  public static int FLD_QTN_UTENTE_ULTIMO_AGG = 22;
  public static int FLD_QTN_DATA_ULTIMO_AGG = 23;
  public static int FLD_QTN_QSTATO = 24;
  public static int FLD_QTN_QCONTODEDICA = 25;
  public static int FLD_QTN_IBAN = 26;
  public static int FLD_QTN_IBAN_LOG = 27;
  public static int FLD_QTN_TIPO_POSTALIZZAZIONE = 28;
  public static int FLD_QTN_ORD_SP_RC = 29;
  public static int FLD_QTN_PREVALENTE = 30;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO12 = 217;
  public static int FLD_PARAMETRIO12_CODICFISCOLD = 0;
  public static int FLD_PARAMETRIO12_ABIOLD = 1;
  public static int FLD_PARAMETRIO12_CABOLD = 2;

  // Definition of table: BEN Rollback
  //
  public static int TBL_BEN = 218;
  public static int FLD_BEN_CODICE = 0;
  public static int FLD_BEN_RAGIONE_SOCIALE = 1;
  public static int FLD_BEN_INDIRIZZO = 2;
  public static int FLD_BEN_CAP = 3;
  public static int FLD_BEN_PROVINCIA = 4;
  public static int FLD_BEN_COMUNE = 5;
  public static int FLD_BEN_TELEFONO = 6;
  public static int FLD_BEN_CODICE_FISCALE = 7;
  public static int FLD_BEN_PARTITA_IVA = 8;
  public static int FLD_BEN_TELEX = 9;
  public static int FLD_BEN_CATEGORIA = 10;
  public static int FLD_BEN_TIPO_PAGAMENTO = 11;
  public static int FLD_BEN_DATA_NASCITA = 12;
  public static int FLD_BEN_SESSO = 13;
  public static int FLD_BEN_PROVINCIA_NASCITA = 14;
  public static int FLD_BEN_COMUNE_NASCITA = 15;
  public static int FLD_BEN_STATO_ESTERO = 16;
  public static int FLD_BEN_ENTE_DATORE_LAV = 17;
  public static int FLD_BEN_DOMICILIO = 18;
  public static int FLD_BEN_COMUNE_DOMICILIO = 19;
  public static int FLD_BEN_PROVINCIA_DOMICILIO = 20;
  public static int FLD_BEN_CAP_DOMICILIO = 21;
  public static int FLD_BEN_SCADENZA = 22;
  public static int FLD_BEN_D_SCADENZA = 23;
  public static int FLD_BEN_D_DATA_NASCITA = 24;
  public static int FLD_BEN_COD_IMP_ECO = 25;
  public static int FLD_BEN_PAGAMENTO_IN_EURO = 26;
  public static int FLD_BEN_CLASSE_LISTINO = 27;
  public static int FLD_BEN_E_MAIL = 28;
  public static int FLD_BEN_E_MAIL_REF_WEB = 29;
  public static int FLD_BEN_CELLULARE = 30;
  public static int FLD_BEN_INVIO_STAMPE = 31;
  public static int FLD_BEN_RAGIONE_SOCIALE_ESTESA = 32;
  public static int FLD_BEN_NOTE = 33;
  public static int FLD_BEN_STATO_CEE = 34;
  public static int FLD_BEN_PARTITA_IVA_CEE = 35;
  public static int FLD_BEN_SPESE = 36;
  public static int FLD_BEN_UTENTE_INSERIMENTO = 37;
  public static int FLD_BEN_DATA_INSERIMENTO = 38;
  public static int FLD_BEN_UTENTE_ULTIMO_AGG = 39;
  public static int FLD_BEN_DATA_ULTIMO_AGG = 40;
  public static int FLD_BEN_CODICE_IPA = 41;
  public static int FLD_BEN_ID_MODELLO = 42;
  public static int FLD_BEN_RIFERIMENTO_AMMINISTRAZIONE = 43;
  public static int FLD_BEN_CODICE_EORI = 44;
  public static int FLD_BEN_TRATTAMENTO_IVA_DEFAULT = 45;
  public static int FLD_BEN_TAG_UTENZA = 46;
  public static int FLD_BEN_E_MAIL_FE = 47;
  public static int FLD_BEN_CODICE_SDI = 48;
  public static int FLD_BEN_NI = 49;
  public static int FLD_BEN_DAL = 50;
  public static int FLD_BEN_AL = 51;
  public static int FLD_BEN_TIPO_SOGGETTO = 52;
  public static int FLD_BEN_BENCOMPETENZ = 53;
  public static int FLD_BEN_BENCONTMINI1 = 54;

  // Definition of table: Par
  //
  public static int TBL_PAR52 = 219;
  public static int FLD_PAR52_ROWNAMSOCOCO = 0;
  public static int FLD_PAR52_ROWNAMEPROVI = 1;
  public static int FLD_PAR52_ROWNAMECAP = 2;
  public static int FLD_PAR52_ROWNAMECOMUN = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI566 = 220;
  public static int FLD_PARAMETRI566_ROWNAMPEFIBL = 0;
  public static int FLD_PARAMETRI566_ROWNAMBLOINS = 1;
  public static int FLD_PARAMETRI566_ROWNAMEPROGR = 2;
  public static int FLD_PARAMETRI566_ROWNAMEFASE = 3;
  public static int FLD_PARAMETRI566_RONATIPAPECA = 4;
  public static int FLD_PARAMETRI566_ROWNAMESPESE = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR111 = 221;
  public static int FLD_PAR111_NOMOGGCONINS = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM84 = 222;
  public static int FLD_PARAM84_ROWNAMCODSOG = 0;
  public static int FLD_PARAM84_ROWNAMEPARTE = 1;
  public static int FLD_PARAM84_ROWNAMAPECHI = 2;
  public static int FLD_PARAM84_ROWNAMEDAL = 3;
  public static int FLD_PARAM84_ROWNAMEAL = 4;
  public static int FLD_PARAM84_ROWNAMEORDIN = 5;

  // Definition of table: Entrata
  //
  public static int TBL_ENTRATA = 223;
  public static int FLD_ENTRATA_ROWNAMEIMPOR = 0;
  public static int FLD_ENTRATA_ROWNAMERETTI = 1;
  public static int FLD_ENTRATA_ROWNAMEPAGAT = 2;
  public static int FLD_ENTRATA_ROWNAMESALDO = 3;

  // Definition of table: Spesa
  //
  public static int TBL_SPESA = 224;
  public static int FLD_SPESA_ROWNAMEIMPOR = 0;
  public static int FLD_SPESA_ROWNAMERETTI = 1;
  public static int FLD_SPESA_ROWNAMEPAGAT = 2;
  public static int FLD_SPESA_ROWNAMESALDO = 3;
  public static int FLD_SPESA_ROWNAMERITEN = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM85 = 225;
  public static int FLD_PARAM85_ROWNAMANNMAN = 0;
  public static int FLD_PARAM85_ROWNAMNUMMAN = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM86 = 226;
  public static int FLD_PARAM86_ROWNAMANNORD = 0;
  public static int FLD_PARAM86_ROWNAMNUMORD = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM87 = 227;
  public static int FLD_PARAM87_ROWNAMANNPRO = 0;
  public static int FLD_PARAM87_ROWNAMNUMPRO = 1;
  public static int FLD_PARAM87_ROWNAMEBENEF = 2;
  public static int FLD_PARAM87_ROWNAMFATNAC = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM88 = 228;
  public static int FLD_PARAM88_ROWNAMANNPRO = 0;
  public static int FLD_PARAM88_ROWNAMNUMPRO = 1;
  public static int FLD_PARAM88_ROWNAMEBENEF = 2;
  public static int FLD_PARAM88_ROWNAMFATNAC = 3;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO12 = 229;
  public static int FLD_FILTRO12_FILTROFINOAL = 0;
  public static int FLD_FILTRO12_FILTTIPOREGI = 1;
  public static int FLD_FILTRO12_FILTTIPOBOLL = 2;
  public static int FLD_FILTRO12_FILTREGIBOLL = 3;
  public static int FLD_FILTRO12_FILTRDACONTA = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM58 = 230;
  public static int FLD_PARAM58_ROWNAMTIPREG = 0;
  public static int FLD_PARAM58_ROWNAMTIPBOL = 1;
  public static int FLD_PARAM58_ROWNAMREGBOL = 2;
  public static int FLD_PARAM58_ROWNAMDOCEME = 3;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO13 = 231;
  public static int FLD_FILTRO13_FILTROFINOAL = 0;
  public static int FLD_FILTRO13_FILTTIPOREGI = 1;
  public static int FLD_FILTRO13_FILTTIPOBOLL = 2;
  public static int FLD_FILTRO13_FILTREGIBOLL = 3;
  public static int FLD_FILTRO13_FILTRDACONTA = 4;
  public static int FLD_FILTRO13_FILGIACONIVA = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM34 = 232;
  public static int FLD_PARAM34_ROWNAMTIPREG = 0;
  public static int FLD_PARAM34_ROWNAMTIPBOL = 1;
  public static int FLD_PARAM34_ROWNAMREGBOL = 2;
  public static int FLD_PARAM34_ROWNAMDOCEME = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM12 = 233;
  public static int FLD_PARAM12_ROWNAMTIPREG = 0;
  public static int FLD_PARAM12_ROWNAMTIPBOL = 1;
  public static int FLD_PARAM12_ROWNAMREGBOL = 2;
  public static int FLD_PARAM12_ROWNAMDOCEME = 3;
  public static int FLD_PARAM12_ROWNAMCONPAT = 4;
  public static int FLD_PARAM12_ROWNAMCODDEB = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM35 = 234;
  public static int FLD_PARAM35_PARAREGIBOLL = 0;
  public static int FLD_PARAM35_PARATIPOREGI = 1;
  public static int FLD_PARAM35_PARATIPOBOLL = 2;
  public static int FLD_PARAM35_PARAMDAL = 3;
  public static int FLD_PARAM35_PARAMAL = 4;
  public static int FLD_PARAM35_PARAMCODICE = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM16 = 235;
  public static int FLD_PARAM16_PARAMDATAREG = 0;
  public static int FLD_PARAM16_PARAMDESCRIZ = 1;
  public static int FLD_PARAM16_PARAMCAUSALE = 2;
  public static int FLD_PARAM16_PARATIPOSERV = 3;
  public static int FLD_PARAM16_PARAMCONTROP = 4;
  public static int FLD_PARAM16_PARAMARESIDU = 5;
  public static int FLD_PARAM16_PARATIPOREGI = 6;
  public static int FLD_PARAM16_PARATIPOBOLL = 7;
  public static int FLD_PARAM16_PARAMDAL = 8;
  public static int FLD_PARAM16_PARAMAL = 9;
  public static int FLD_PARAM16_PARACODIDEBI = 10;
  public static int FLD_PARAM16_PARAMDEBITOR = 11;
  public static int FLD_PARAM16_PARAMDEBIOLD = 12;

  // Definition of table: CFA
  //
  public static int TBL_CFA = 236;
  public static int FLD_CFA_ROWNAMEPROGR = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM18 = 237;
  public static int FLD_PARAM18_PARAMFATTORE = 0;
  public static int FLD_PARAM18_PARAMCENTRO = 1;
  public static int FLD_PARAM18_PARAMCAPITOL = 2;
  public static int FLD_PARAM18_PARAMARTICOL = 3;
  public static int FLD_PARAM18_PARAMQUALACC = 4;
  public static int FLD_PARAM18_PARAMOLDPEG = 5;
  public static int FLD_PARAM18_PARAMOLDACC = 6;
  public static int FLD_PARAM18_PAROLDACCPER = 7;
  public static int FLD_PARAM18_PARAMRESEACC = 8;

  // Definition of table: CAUSALI
  //
  public static int TBL_CAUSALI = 238;
  public static int FLD_CAUSALI_CODICE = 0;
  public static int FLD_CAUSALI_DESCRIZIONE = 1;
  public static int FLD_CAUSALI_TIPO_REGISTRO = 2;
  public static int FLD_CAUSALI_TIPO_BOLLATO = 3;
  public static int FLD_CAUSALI_CAPITOLO = 4;
  public static int FLD_CAUSALI_ARTICOLO = 5;
  public static int FLD_CAUSALI_ANNO_ACC = 6;
  public static int FLD_CAUSALI_NUMERO_ACC = 7;
  public static int FLD_CAUSALI_FATTORE = 8;
  public static int FLD_CAUSALI_CENTRO = 9;
  public static int FLD_CAUSALI_ALIQUOTA = 10;
  public static int FLD_CAUSALI_CODICE_ESENZIONE = 11;
  public static int FLD_CAUSALI_PROVENIENZA = 12;
  public static int FLD_CAUSALI_CODICE_ESENZIONE_ARR = 13;
  public static int FLD_CAUSALI_TIPO_DOC = 14;
  public static int FLD_CAUSALI_DESC_FATTURA = 15;
  public static int FLD_CAUSALI_DESC_BOLLO = 16;
  public static int FLD_CAUSALI_RETTA = 17;
  public static int FLD_CAUSALI_TIPO_INCASSO = 18;
  public static int FLD_CAUSALI_UTENTE_INSERIMENTO = 19;
  public static int FLD_CAUSALI_DATA_INSERIMENTO = 20;
  public static int FLD_CAUSALI_UTENTE_ULTIMO_AGG = 21;
  public static int FLD_CAUSALI_DATA_ULTIMO_AGG = 22;
  public static int FLD_CAUSALI_IMPORTO_SPESE = 23;
  public static int FLD_CAUSALI_ROWNAMREGBOL = 24;

  // Definition of table: Varibili
  //
  public static int TBL_VARIBILI2 = 239;
  public static int FLD_VARIBILI2_ROWNAMEES = 0;
  public static int FLD_VARIBILI2_ROWNAMELI = 1;
  public static int FLD_VARIBILI2_ROWNAMSOLIMP = 2;
  public static int FLD_VARIBILI2_ROWNAMEDAL = 3;
  public static int FLD_VARIBILI2_ROWNAMEAL = 4;
  public static int FLD_VARIBILI2_ROWNAMECATEG = 5;

  // Definition of table: Varibili
  //
  public static int TBL_VARIBILI = 240;
  public static int FLD_VARIBILI_ROWNAMEES = 0;
  public static int FLD_VARIBILI_ROWNAMELI = 1;
  public static int FLD_VARIBILI_ROWNAMSOLIMP = 2;
  public static int FLD_VARIBILI_ROWNAMEDAL = 3;
  public static int FLD_VARIBILI_ROWNAMEAL = 4;
  public static int FLD_VARIBILI_ROWNAMECATEG = 5;
  public static int FLD_VARIBILI_ROWNAMESOLOL = 6;

  // Definition of table: Parametri Imputazione Economica
  //
  public static int TBL_PARAIMPUECON = 241;
  public static int FLD_PARAIMPUECON_ROWNAMFATOCE = 0;
  public static int FLD_PARAIMPUECON_ROWNAMDADODA = 1;
  public static int FLD_PARAIMPUECON_ROWNAMDADOAL = 2;
  public static int FLD_PARAIMPUECON_ROWNAMENTOSP = 3;
  public static int FLD_PARAIMPUECON_ROWNAMORDPER = 4;
  public static int FLD_PARAIMPUECON_ROWNAMDETLIQ = 5;
  public static int FLD_PARAIMPUECON_ROWNAMDAPRDA = 6;
  public static int FLD_PARAIMPUECON_ROWNAMDAPRAL = 7;
  public static int FLD_PARAIMPUECON_ROWNAMFATCOD = 8;
  public static int FLD_PARAIMPUECON_ROWNAMCENCOD = 9;
  public static int FLD_PARAIMPUECON_ROWNAMDOCSPE = 10;
  public static int FLD_PARAIMPUECON_ROWNAMDOCENT = 11;
  public static int FLD_PARAIMPUECON_ROWNAMGESECO = 12;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI129 = 242;
  public static int FLD_PARAMETRI129_ROWNAMCODBEN = 0;
  public static int FLD_PARAMETRI129_ROWNAMEDOCUM = 1;
  public static int FLD_PARAMETRI129_ROWNAMANNDOC = 2;
  public static int FLD_PARAMETRI129_ROWNAMNUDODA = 3;
  public static int FLD_PARAMETRI129_ROWNAMNUMDOA = 4;
  public static int FLD_PARAMETRI129_ROWNAMEQUIET = 5;
  public static int FLD_PARAMETRI129_ROWNAMDATELA = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI375 = 243;
  public static int FLD_PARAMETRI375_PARAMDOCUMEN = 0;
  public static int FLD_PARAMETRI375_PARAMTIPO = 1;
  public static int FLD_PARAMETRI375_PARAANNOPROT = 2;
  public static int FLD_PARAMETRI375_PARPERSCADAL = 3;
  public static int FLD_PARAMETRI375_PARAPERSCAAL = 4;
  public static int FLD_PARAMETRI375_PARAMCATEGOR = 5;
  public static int FLD_PARAMETRI375_PARADATAELAB = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI130 = 244;
  public static int FLD_PARAMETRI130_ROWNAMDACODA = 0;
  public static int FLD_PARAMETRI130_ROWNAMDACOAL = 1;
  public static int FLD_PARAMETRI130_ROWNAMEBOLLA = 2;
  public static int FLD_PARAMETRI130_ROWNAMDATELA = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI391 = 245;
  public static int FLD_PARAMETRI391_ROWNAMCODSOG = 0;
  public static int FLD_PARAMETRI391_ROWNAMEMOVIM = 1;
  public static int FLD_PARAMETRI391_ROWNAMDATDAL = 2;
  public static int FLD_PARAMETRI391_ROWNAMEDATAL = 3;
  public static int FLD_PARAMETRI391_ROWNAMTIPMOV = 4;
  public static int FLD_PARAMETRI391_ROWNAMEDETTA = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI133 = 246;
  public static int FLD_PARAMETRI133_ROWNAMEDOCUM = 0;
  public static int FLD_PARAMETRI133_ROWNAMDAPRAL = 1;
  public static int FLD_PARAMETRI133_ROWNAMDAPRDA = 2;
  public static int FLD_PARAMETRI133_ROWNAMNUPRDA = 3;
  public static int FLD_PARAMETRI133_ROWNAMNUPRAL = 4;
  public static int FLD_PARAMETRI133_ROWNAMEUFFIC = 5;
  public static int FLD_PARAMETRI133_ROWNAMECATEG = 6;
  public static int FLD_PARAMETRI133_ROWNAMSUPEUF = 7;
  public static int FLD_PARAMETRI133_ROWNAMETIPOL = 8;
  public static int FLD_PARAMETRI133_ROWNAMDATELA = 9;
  public static int FLD_PARAMETRI133_ROWNAMTIPPRO = 10;
  public static int FLD_PARAMETRI133_ROWNAMCODSOG = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI392 = 247;
  public static int FLD_PARAMETRI392_ROWNAMEDOCUM = 0;
  public static int FLD_PARAMETRI392_ROWNAMDAPRDA = 1;
  public static int FLD_PARAMETRI392_ROWNAMDAPRAL = 2;
  public static int FLD_PARAMETRI392_ROWNAMNUPRDA = 3;
  public static int FLD_PARAMETRI392_ROWNAMNUPRAL = 4;
  public static int FLD_PARAMETRI392_ROWNAMEUFFIC = 5;
  public static int FLD_PARAMETRI392_ROWNAMECATEG = 6;
  public static int FLD_PARAMETRI392_ROWNAMSUPEUF = 7;
  public static int FLD_PARAMETRI392_ROWNAMDATELA = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI137 = 248;
  public static int FLD_PARAMETRI137_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI137_ROWNAMTIPUTE = 1;
  public static int FLD_PARAMETRI137_ROWNAMEDATAD = 2;
  public static int FLD_PARAMETRI137_ROWNAMEDATAA = 3;
  public static int FLD_PARAMETRI137_ROWNAMENUMM1 = 4;
  public static int FLD_PARAMETRI137_ROWNAMENUMMA = 5;
  public static int FLD_PARAMETRI137_ROWNAMESOLOT = 6;
  public static int FLD_PARAMETRI137_ROWNAMEDESCT = 7;
  public static int FLD_PARAMETRI137_ROWNAMCODBEN = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI138 = 249;
  public static int FLD_PARAMETRI138_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI138_ROWNAMTIPUTE = 1;
  public static int FLD_PARAMETRI138_ROWNAMEDATAD = 2;
  public static int FLD_PARAMETRI138_ROWNAMEDATAA = 3;
  public static int FLD_PARAMETRI138_ROWNAMENUMM1 = 4;
  public static int FLD_PARAMETRI138_ROWNAMENUMMA = 5;
  public static int FLD_PARAMETRI138_ROWNAMESOLOT = 6;
  public static int FLD_PARAMETRI138_ROWNAMEDESCT = 7;
  public static int FLD_PARAMETRI138_ROWNAMCODUTE = 8;
  public static int FLD_PARAMETRI138_ROWNAMNUMUTE = 9;
  public static int FLD_PARAMETRI138_ROWNAMCODBEN = 10;
  public static int FLD_PARAMETRI138_ROWNAMEBENEF = 11;
  public static int FLD_PARAMETRI138_ROWNAMBENOLD = 12;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAMP7 = 250;
  public static int FLD_PARAMESTAMP7_ROWNAMEESERC = 0;
  public static int FLD_PARAMESTAMP7_ROWNAMTIPUTE = 1;
  public static int FLD_PARAMESTAMP7_ROWNAMEDATDA = 2;
  public static int FLD_PARAMESTAMP7_ROWNAMEDATAA = 3;
  public static int FLD_PARAMESTAMP7_ROWNAMEDESCT = 4;
  public static int FLD_PARAMESTAMP7_ROWNAMEUFFIC = 5;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAMP8 = 251;
  public static int FLD_PARAMESTAMP8_ROWNAMEESERC = 0;
  public static int FLD_PARAMESTAMP8_ROWNAMTIPUTE = 1;
  public static int FLD_PARAMESTAMP8_ROWNAMEDATDA = 2;
  public static int FLD_PARAMESTAMP8_ROWNAMEDATAA = 3;
  public static int FLD_PARAMESTAMP8_ROWNAMEDESCT = 4;
  public static int FLD_PARAMESTAMP8_ROWNAMCODUTE = 5;
  public static int FLD_PARAMESTAMP8_ROWNAMNUMUTE = 6;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAMP9 = 252;
  public static int FLD_PARAMESTAMP9_ROWNAMENUMER = 0;
  public static int FLD_PARAMESTAMP9_ROWNAMANNDE1 = 1;
  public static int FLD_PARAMESTAMP9_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMESTAMP9_ROWNAMEESERC = 3;
  public static int FLD_PARAMESTAMP9_ROWNAMDATELA = 4;
  public static int FLD_PARAMESTAMP9_ROWNAMTIPUTE = 5;
  public static int FLD_PARAMESTAMP9_ROWNAMEDESCT = 6;
  public static int FLD_PARAMESTAMP9_ROWNAMEDELIB = 7;
  public static int FLD_PARAMESTAMP9_ROWNAMNUMDEL = 8;
  public static int FLD_PARAMESTAMP9_ROWNAMANNDEL = 9;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM11 = 253;
  public static int FLD_PARAMESTAM11_ROWNAMENUMER = 0;
  public static int FLD_PARAMESTAM11_ROWNAMANNDEL = 1;
  public static int FLD_PARAMESTAM11_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMESTAM11_ROWNAMEESERC = 3;
  public static int FLD_PARAMESTAM11_ROWNAMDATELA = 4;
  public static int FLD_PARAMESTAM11_ROWNAMOLTIUT = 5;
  public static int FLD_PARAMESTAM11_ROWNAMTIPUTE = 6;
  public static int FLD_PARAMESTAM11_ROWNAMEDESCT = 7;
  public static int FLD_PARAMESTAM11_ROWNAMECODIC = 8;
  public static int FLD_PARAMESTAM11_ROWNAMRECOEN = 9;
  public static int FLD_PARAMESTAM11_ROWNAMSOLEME = 10;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM16 = 254;
  public static int FLD_PARAMESTAM16_ROWNAMENUME1 = 0;
  public static int FLD_PARAMESTAM16_ROWNAMANNDEL = 1;
  public static int FLD_PARAMESTAM16_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMESTAM16_ROWNAMEESERC = 3;
  public static int FLD_PARAMESTAM16_ROWNAMDATELA = 4;
  public static int FLD_PARAMESTAM16_ROWNAMTIPUTE = 5;
  public static int FLD_PARAMESTAM16_ROWNAMEDESCT = 6;
  public static int FLD_PARAMESTAM16_ROWNAMECODIC = 7;
  public static int FLD_PARAMESTAM16_ROWNAMRECOEN = 8;
  public static int FLD_PARAMESTAM16_ROWNAMESOLOE = 9;
  public static int FLD_PARAMESTAM16_ROWNAMESESSI = 10;
  public static int FLD_PARAMESTAM16_ROWNAMECAPIT = 11;
  public static int FLD_PARAMESTAM16_ROWNAMEARTIC = 12;
  public static int FLD_PARAMESTAM16_ROWNAMEANNOI = 13;
  public static int FLD_PARAMESTAM16_ROWNAMENUMER = 14;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIAR19 = 255;
  public static int FLD_BENEFICIAR19_ROWNAMRAGSOC = 0;
  public static int FLD_BENEFICIAR19_ROWNAMECODIC = 1;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE18 = 256;
  public static int FLD_NEWTABLE18_ROWNAMNEWFIE = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM107 = 257;
  public static int FLD_PARAM107_PARPERINCDAL = 0;
  public static int FLD_PARAM107_PARAPERINCAL = 1;
  public static int FLD_PARAM107_PARAMREGODAL = 2;
  public static int FLD_PARAM107_PARAMREGOLAL = 3;
  public static int FLD_PARAM107_TIPO_REGISTRO = 4;
  public static int FLD_PARAM107_TIPO_BOLLATO = 5;
  public static int FLD_PARAM107_PARAELENMODI = 6;

  // Definition of table: Campi Da Aggiornare
  //
  public static int TBL_CAMPIDAAGGIO = 258;
  public static int FLD_CAMPIDAAGGIO_DATA_INCASSO = 0;
  public static int FLD_CAMPIDAAGGIO_NUMERO_INCASSO = 1;

  // Definition of table: Emissione Ordinativi
  //
  public static int TBL_EMISSIORDIN3 = 259;
  public static int FLD_EMISSIORDIN3_ROWNAMEDESCR = 0;
  public static int FLD_EMISSIORDIN3_TIPO_REGISTRO = 1;
  public static int FLD_EMISSIORDIN3_TIPO_BOLLATO = 2;
  public static int FLD_EMISSIORDIN3_ROWNAMPEINDA = 3;
  public static int FLD_EMISSIORDIN3_ROWNAMPEINAL = 4;
  public static int FLD_EMISSIORDIN3_ROWNAMTIRECO = 5;
  public static int FLD_EMISSIORDIN3_ROWNAMTIBOCO = 6;

  // Definition of table: Emissione Ordinativi
  //
  public static int TBL_EMISSIORDIN2 = 260;
  public static int FLD_EMISSIORDIN2_ROWNAMEDATA = 0;
  public static int FLD_EMISSIORDIN2_ROWNAMEDESCR = 1;
  public static int FLD_EMISSIORDIN2_ROWNAMECAUSA = 2;
  public static int FLD_EMISSIORDIN2_ROWNAMEBOLLO = 3;
  public static int FLD_EMISSIORDIN2_ROWNAMEUFFIC = 4;
  public static int FLD_EMISSIORDIN2_RNEAVPMDSASC = 5;
  public static int FLD_EMISSIORDIN2_TIPO_REGISTRO = 6;
  public static int FLD_EMISSIORDIN2_TIPO_BOLLATO = 7;
  public static int FLD_EMISSIORDIN2_ROWNAMPEINDA = 8;
  public static int FLD_EMISSIORDIN2_ROWNAMPEINAL = 9;
  public static int FLD_EMISSIORDIN2_ROWNAMDEDAAC = 10;

  // Definition of table: Param
  //
  public static int TBL_PARAM56 = 261;
  public static int FLD_PARAM56_ROWNAMTIPREG = 0;
  public static int FLD_PARAM56_ROWNAMTIPBOL = 1;
  public static int FLD_PARAM56_ROWNAMEPERCO = 2;
  public static int FLD_PARAM56_ROWNAMEBLOBI = 3;
  public static int FLD_PARAM56_ROWNAMEPROGR = 4;
  public static int FLD_PARAM56_ROWNAMGESINS = 5;
  public static int FLD_PARAM56_ROWNAMDATFLU = 6;
  public static int FLD_PARAM56_ROWNAMDATINC = 7;
  public static int FLD_PARAM56_ROWNAMNUMINC = 8;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO9 = 262;
  public static int FLD_FILTRO9_ROWNAMAPARDA = 0;
  public static int FLD_FILTRO9_ROWNAMCODFOR = 1;
  public static int FLD_FILTRO9_ROWNAMEORDIN = 2;
  public static int FLD_FILTRO9_ROWNAMIMPFAT = 3;
  public static int FLD_FILTRO9_ROWNAMACTPOS = 4;
  public static int FLD_FILTRO9_ROWNAMECONTA = 5;
  public static int FLD_FILTRO9_ROWNAMLIQMOD = 6;
  public static int FLD_FILTRO9_ROWNAMELIQUI = 7;
  public static int FLD_FILTRO9_ROWNAMANNPRO = 8;
  public static int FLD_FILTRO9_ROWNAMNUMPRO = 9;
  public static int FLD_FILTRO9_ROWNAMEPARTE = 10;
  public static int FLD_FILTRO9_ROWNAMECODIC = 11;
  public static int FLD_FILTRO9_ROWNAMOLDCOD = 12;
  public static int FLD_FILTRO9_ROWNAMQUAFAT = 13;
  public static int FLD_FILTRO9_ROWNAMOLDADO = 14;
  public static int FLD_FILTRO9_ROWNAMOLTIPA = 15;
  public static int FLD_FILTRO9_ROWNAMOLDAPR = 16;
  public static int FLD_FILTRO9_ROWNAMESEIMP = 17;
  public static int FLD_FILTRO9_ROWNAMOLDTIP = 18;
  public static int FLD_FILTRO9_ROWNAMOLDORD = 19;
  public static int FLD_FILTRO9_ROWNAMENOTE = 20;
  public static int FLD_FILTRO9_ROWNAMFILUNI = 21;
  public static int FLD_FILTRO9_RONAPRDACOFA = 22;
  public static int FLD_FILTRO9_ROWNAMEMULTI = 23;
  public static int FLD_FILTRO9_ROWNAMCODAPR = 24;
  public static int FLD_FILTRO9_ROWNAMDISMOD = 25;
  public static int FLD_FILTRO9_ROWNAMEAL = 26;
  public static int FLD_FILTRO9_ROWNAMUNIORG = 27;

  // Definition of table: Fatture Buoni IMDB
  //
  public static int TBL_FATTBUONIMD6 = 263;
  public static int FLD_FATTBUONIMD6_ANNO_BUONO = 0;
  public static int FLD_FATTBUONIMD6_NUMERO_BUONO = 1;
  public static int FLD_FATTBUONIMD6_PROGRESSIVO_BUONO = 2;
  public static int FLD_FATTBUONIMD6_ANNO_PROG = 3;
  public static int FLD_FATTBUONIMD6_NUMERO_PROG = 4;
  public static int FLD_FATTBUONIMD6_IMPUTATO = 5;
  public static int FLD_FATTBUONIMD6_PROGRESSIVO = 6;
  public static int FLD_FATTBUONIMD6_LIQUIDATO = 7;
  public static int FLD_FATTBUONIMD6_DATA_REGISTRAZIONE = 8;
  public static int FLD_FATTBUONIMD6_PROGRESSIVO_IMP = 9;
  public static int FLD_FATTBUONIMD6_UTENTE_INSERIMENTO = 10;
  public static int FLD_FATTBUONIMD6_UTENTE_ULTIMO_AGG = 11;
  public static int FLD_FATTBUONIMD6_DATA_ULTIMO_AGG = 12;
  public static int FLD_FATTBUONIMD6_FATBUOIMDSTA = 13;
  public static int FLD_FATTBUONIMD6_FATBUOIMDLIQ = 14;
  public static int FLD_FATTBUONIMD6_FATBUOIMDCHI = 15;
  public static int FLD_FATTBUONIMD6_FATBUOIMDDES = 16;
  public static int FLD_FATTBUONIMD6_FATBUOIMQUAR = 17;
  public static int FLD_FATTBUONIMD6_FATBUOIMDIMP = 18;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ9 = 264;
  public static int FLD_PERSONALIZZ9_ROWNAMDATRIE = 0;

  // Definition of table: FAT
  //
  public static int TBL_FAT18 = 265;
  public static int FLD_FAT18_CODICE = 0;
  public static int FLD_FAT18_ANNO_RIF = 1;
  public static int FLD_FAT18_NUMERO_RIF = 2;
  public static int FLD_FAT18_ANNO_DOC = 3;
  public static int FLD_FAT18_NUMERO_DOC = 4;
  public static int FLD_FAT18_DATA_DOC = 5;
  public static int FLD_FAT18_ANNO_PROG = 6;
  public static int FLD_FAT18_NUMERO_PROG = 7;
  public static int FLD_FAT18_ANNO_PROT = 8;
  public static int FLD_FAT18_NUMERO_PROT = 9;
  public static int FLD_FAT18_DATA_PROT = 10;
  public static int FLD_FAT18_CODICE_DOC = 11;
  public static int FLD_FAT18_STORNO = 12;
  public static int FLD_FAT18_TIPO_PAGAMENTO = 13;
  public static int FLD_FAT18_TIPO_DOC = 14;
  public static int FLD_FAT18_TIPO_REGISTRO = 15;
  public static int FLD_FAT18_SERVIZIO = 16;
  public static int FLD_FAT18_ANNO_REG = 17;
  public static int FLD_FAT18_NUMERO_REG = 18;
  public static int FLD_FAT18_UFFICIO_INVIO = 19;
  public static int FLD_FAT18_DESCRIZIONE = 20;
  public static int FLD_FAT18_IMPORTO = 21;
  public static int FLD_FAT18_DIFFERENZA_IVA = 22;
  public static int FLD_FAT18_NUM_QUIETANZA = 23;
  public static int FLD_FAT18_DATA_REG = 24;
  public static int FLD_FAT18_TIPO_REGISTRO_S = 25;
  public static int FLD_FAT18_TIPO_BOLLATO_S = 26;
  public static int FLD_FAT18_ANNO_REG_S = 27;
  public static int FLD_FAT18_NUMERO_REG_S = 28;
  public static int FLD_FAT18_DATA_REG_S = 29;
  public static int FLD_FAT18_CATEGORIA = 30;
  public static int FLD_FAT18_TIPO_DOC_S = 31;
  public static int FLD_FAT18_ACQUISTO_CEE = 32;
  public static int FLD_FAT18_MONETA = 33;
  public static int FLD_FAT18_ESCLUSIONE_ELE = 34;
  public static int FLD_FAT18_SCADENZA = 35;
  public static int FLD_FAT18_RIVENDITA = 36;
  public static int FLD_FAT18_VARIAZIONI = 37;
  public static int FLD_FAT18_IMPUTATO = 38;
  public static int FLD_FAT18_D_DATA_DOC = 39;
  public static int FLD_FAT18_D_DATA_PROT = 40;
  public static int FLD_FAT18_D_DATA_REG = 41;
  public static int FLD_FAT18_D_DATA_REG_S = 42;
  public static int FLD_FAT18_D_SCADENZA = 43;
  public static int FLD_FAT18_BUONI = 44;
  public static int FLD_FAT18_DATA_LIQ = 45;
  public static int FLD_FAT18_D_DATA_LIQ = 46;
  public static int FLD_FAT18_LIQUIDAZIONE_DEF = 47;
  public static int FLD_FAT18_LIRE_EURO = 48;
  public static int FLD_FAT18_IMPORTO_EURO = 49;
  public static int FLD_FAT18_TIPO_UTENZA = 50;
  public static int FLD_FAT18_CODICE_UTENZA = 51;
  public static int FLD_FAT18_BLOCCO_PAGAMENTO = 52;
  public static int FLD_FAT18_COD_IMP_ECO = 53;
  public static int FLD_FAT18_ANNO_ORDINE = 54;
  public static int FLD_FAT18_NUMERO_ORDINE = 55;
  public static int FLD_FAT18_FLAG_IVA_ECO = 56;
  public static int FLD_FAT18_FLAG_DA_FS4 = 57;
  public static int FLD_FAT18_DATA_RIENTRO = 58;
  public static int FLD_FAT18_NUM_UTENTE = 59;
  public static int FLD_FAT18_ID_DOCUMENTALE = 60;
  public static int FLD_FAT18_NOTE = 61;
  public static int FLD_FAT18_PROGR_UNITA_ORGANIZZATIVA = 62;
  public static int FLD_FAT18_UTENTE_INSERIMENTO = 63;
  public static int FLD_FAT18_DATA_INSERIMENTO = 64;
  public static int FLD_FAT18_UTENTE_ULTIMO_AGG = 65;
  public static int FLD_FAT18_DATA_ULTIMO_AGG = 66;
  public static int FLD_FAT18_ROWNAMESTATO = 67;
  public static int FLD_FAT18_ROWNAMNOTSOS = 68;
  public static int FLD_FAT18_ROWNAMPRUOCO = 69;

  // Definition of table: Ritenute
  //
  public static int TBL_RITENUTE2 = 266;
  public static int FLD_RITENUTE2_ROWNAMECASSA = 0;
  public static int FLD_RITENUTE2_ROWNAMCODINA = 1;
  public static int FLD_RITENUTE2_ROWNAMCODSSN = 2;
  public static int FLD_RITENUTE2_RONAFLIVNNSO = 3;
  public static int FLD_RITENUTE2_ROWNAMEALIQU = 4;
  public static int FLD_RITENUTE2_ROWNAMALIADD = 5;
  public static int FLD_RITENUTE2_ROWNAMALADCO = 6;
  public static int FLD_RITENUTE2_ROWNAMIMPINP = 7;
  public static int FLD_RITENUTE2_ROWNAMIMPINA = 8;
  public static int FLD_RITENUTE2_ROWNAMIMPIRA = 9;
  public static int FLD_RITENUTE2_ROWNAMIMPIRP = 10;

  // Definition of table: Iva
  //
  public static int TBL_IVA10 = 267;
  public static int FLD_IVA10_ROWNAMEIMPON = 0;
  public static int FLD_IVA10_ROWNAMEALIQU = 1;
  public static int FLD_IVA10_ROWNAMEESENZ = 2;

  // Definition of table: IVA
  //
  public static int TBL_IVA7 = 268;
  public static int FLD_IVA7_PROGRESSIVO = 0;
  public static int FLD_IVA7_ANNO_PROG = 1;
  public static int FLD_IVA7_NUMERO_PROG = 2;
  public static int FLD_IVA7_CODICE_DOC = 3;
  public static int FLD_IVA7_IMPONIBILE = 4;
  public static int FLD_IVA7_IVA = 5;
  public static int FLD_IVA7_ALIQUOTA = 6;
  public static int FLD_IVA7_IVA_INDED = 7;
  public static int FLD_IVA7_CODICE_ESENZIONE = 8;
  public static int FLD_IVA7_IMPONIBILE_CEE = 9;
  public static int FLD_IVA7_IMPONIBILE_EURO = 10;
  public static int FLD_IVA7_IVA_EURO = 11;
  public static int FLD_IVA7_CODICE_STAT = 12;
  public static int FLD_IVA7_UTENTE_INSERIMENTO = 13;
  public static int FLD_IVA7_DATA_INSERIMENTO = 14;
  public static int FLD_IVA7_UTENTE_ULTIMO_AGG = 15;
  public static int FLD_IVA7_DATA_ULTIMO_AGG = 16;
  public static int FLD_IVA7_REC_VENDITE = 17;
  public static int FLD_IVA7_ROWNAMEINDIM = 18;
  public static int FLD_IVA7_ROWNAMESTATO = 19;
  public static int FLD_IVA7_ROWNAMERIGA = 20;
  public static int FLD_IVA7_TIPO_REGISTRO_S = 21;
  public static int FLD_IVA7_TIPO_BOLLATO_S = 22;
  public static int FLD_IVA7_NUMERO_REG_S = 23;
  public static int FLD_IVA7_TIPO_REGISTRO = 24;
  public static int FLD_IVA7_SERVIZIO = 25;
  public static int FLD_IVA7_NUMERO_REG = 26;
  public static int FLD_IVA7_D_DATA_REG_S = 27;
  public static int FLD_IVA7_D_DATA_REG = 28;

  // Definition of table: IMP ECO
  //
  public static int TBL_IMPECO6 = 269;
  public static int FLD_IMPECO6_ESERCIZIO = 0;
  public static int FLD_IMPECO6_PROGRESSIVO = 1;
  public static int FLD_IMPECO6_ANNO_PROG = 2;
  public static int FLD_IMPECO6_NUMERO_PROG = 3;
  public static int FLD_IMPECO6_ANNO_LIQ = 4;
  public static int FLD_IMPECO6_NUMERO_LIQ = 5;
  public static int FLD_IMPECO6_ANNO_PRE = 6;
  public static int FLD_IMPECO6_NUMERO_PRE = 7;
  public static int FLD_IMPECO6_FATTORE = 8;
  public static int FLD_IMPECO6_CENTRO = 9;
  public static int FLD_IMPECO6_IMPORTO = 10;
  public static int FLD_IMPECO6_COMPETENZA_DAL = 11;
  public static int FLD_IMPECO6_COMPETENZA_AL = 12;
  public static int FLD_IMPECO6_NOTE = 13;
  public static int FLD_IMPECO6_IMPORTO_EURO = 14;
  public static int FLD_IMPECO6_ANNO_ACC = 15;
  public static int FLD_IMPECO6_NUMERO_ACC = 16;
  public static int FLD_IMPECO6_ANNO_IMP = 17;
  public static int FLD_IMPECO6_NUMERO_IMP = 18;
  public static int FLD_IMPECO6_ANNO_SUBIMP = 19;
  public static int FLD_IMPECO6_NUMERO_SUBIMP = 20;
  public static int FLD_IMPECO6_PROGRESSIVO_VARACC = 21;
  public static int FLD_IMPECO6_PROGRESSIVO_VARIMP = 22;
  public static int FLD_IMPECO6_PROGRESSIVO_VARSUB = 23;
  public static int FLD_IMPECO6_NO_IVA = 24;
  public static int FLD_IMPECO6_PROGETTO_ID = 25;
  public static int FLD_IMPECO6_IVA = 26;
  public static int FLD_IMPECO6_IMPECOSTATO = 27;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO5 = 270;
  public static int FLD_FILTRO5_ROWNAMAPARDA = 0;
  public static int FLD_FILTRO5_ROWNAMEFORNI = 1;
  public static int FLD_FILTRO5_ROWNAMEORDIN = 2;
  public static int FLD_FILTRO5_ROWNAMIMPFAT = 3;
  public static int FLD_FILTRO5_ROWNAMACTPOS = 4;
  public static int FLD_FILTRO5_ROWNAMECONTA = 5;
  public static int FLD_FILTRO5_ROWNAMLIQMOD = 6;
  public static int FLD_FILTRO5_ROWNAMELIQUI = 7;
  public static int FLD_FILTRO5_ROWNAMANNPRO = 8;
  public static int FLD_FILTRO5_ROWNAMNUMPRO = 9;
  public static int FLD_FILTRO5_ROWNAMECODIC = 10;
  public static int FLD_FILTRO5_ROWNAMSOGRIC = 11;
  public static int FLD_FILTRO5_ROWNAMOLDCOD = 12;
  public static int FLD_FILTRO5_ROWNAMQUAFAT = 13;
  public static int FLD_FILTRO5_ROWNAMOLDADO = 14;
  public static int FLD_FILTRO5_ROWNAMOLTIPA = 15;
  public static int FLD_FILTRO5_ROWNAMOLDAPR = 16;
  public static int FLD_FILTRO5_ROWNAMEECONO = 17;
  public static int FLD_FILTRO5_ROWNAMESEIMP = 18;
  public static int FLD_FILTRO5_ROWNAMOLDTIP = 19;
  public static int FLD_FILTRO5_ROWNAMOLDORD = 20;
  public static int FLD_FILTRO5_ROWNAMENOTE = 21;
  public static int FLD_FILTRO5_RONAPRDACOFA = 22;
  public static int FLD_FILTRO5_ROWNAMEMULTI = 23;
  public static int FLD_FILTRO5_ROWNAMCODAPR = 24;
  public static int FLD_FILTRO5_ROWNAMOLDAAR = 25;
  public static int FLD_FILTRO5_ROWNAMEFSE = 26;

  // Definition of table: Fatture Buoni IMDB
  //
  public static int TBL_FATTBUONIMD1 = 271;
  public static int FLD_FATTBUONIMD1_ANNO_BUONO = 0;
  public static int FLD_FATTBUONIMD1_NUMERO_BUONO = 1;
  public static int FLD_FATTBUONIMD1_PROGRESSIVO_BUONO = 2;
  public static int FLD_FATTBUONIMD1_ANNO_PROG = 3;
  public static int FLD_FATTBUONIMD1_NUMERO_PROG = 4;
  public static int FLD_FATTBUONIMD1_IMPUTATO = 5;
  public static int FLD_FATTBUONIMD1_PROGRESSIVO = 6;
  public static int FLD_FATTBUONIMD1_LIQUIDATO = 7;
  public static int FLD_FATTBUONIMD1_DATA_REGISTRAZIONE = 8;
  public static int FLD_FATTBUONIMD1_PROGRESSIVO_IMP = 9;
  public static int FLD_FATTBUONIMD1_UTENTE_INSERIMENTO = 10;
  public static int FLD_FATTBUONIMD1_UTENTE_ULTIMO_AGG = 11;
  public static int FLD_FATTBUONIMD1_DATA_ULTIMO_AGG = 12;
  public static int FLD_FATTBUONIMD1_FATBUOIMDSTA = 13;
  public static int FLD_FATTBUONIMD1_FATBUOIMDLIQ = 14;
  public static int FLD_FATTBUONIMD1_FATBUOIMDCHI = 15;
  public static int FLD_FATTBUONIMD1_FATBUOIMDDES = 16;
  public static int FLD_FATTBUONIMD1_FATBUOIMQUAR = 17;
  public static int FLD_FATTBUONIMD1_FATBUOIMDIMP = 18;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZ14 = 272;
  public static int FLD_PERSONALIZ14_ROWNAMDATRIE = 0;
  public static int FLD_PERSONALIZ14_ROWNAMPERMOD = 1;
  public static int FLD_PERSONALIZ14_RONAPEUFDAUT = 2;

  // Definition of table: FAT
  //
  public static int TBL_FAT7 = 273;
  public static int FLD_FAT7_CODICE = 0;
  public static int FLD_FAT7_ANNO_RIF = 1;
  public static int FLD_FAT7_NUMERO_RIF = 2;
  public static int FLD_FAT7_ANNO_DOC = 3;
  public static int FLD_FAT7_NUMERO_DOC = 4;
  public static int FLD_FAT7_DATA_DOC = 5;
  public static int FLD_FAT7_ANNO_PROG = 6;
  public static int FLD_FAT7_NUMERO_PROG = 7;
  public static int FLD_FAT7_ANNO_PROT = 8;
  public static int FLD_FAT7_NUMERO_PROT = 9;
  public static int FLD_FAT7_DATA_PROT = 10;
  public static int FLD_FAT7_CODICE_DOC = 11;
  public static int FLD_FAT7_STORNO = 12;
  public static int FLD_FAT7_TIPO_PAGAMENTO = 13;
  public static int FLD_FAT7_UFFICIO_INVIO = 14;
  public static int FLD_FAT7_DESCRIZIONE = 15;
  public static int FLD_FAT7_IMPORTO = 16;
  public static int FLD_FAT7_DIFFERENZA_IVA = 17;
  public static int FLD_FAT7_NUM_QUIETANZA = 18;
  public static int FLD_FAT7_CATEGORIA = 19;
  public static int FLD_FAT7_ACQUISTO_CEE = 20;
  public static int FLD_FAT7_MONETA = 21;
  public static int FLD_FAT7_ESCLUSIONE_ELE = 22;
  public static int FLD_FAT7_RIVENDITA = 23;
  public static int FLD_FAT7_VARIAZIONI = 24;
  public static int FLD_FAT7_IMPUTATO = 25;
  public static int FLD_FAT7_D_DATA_DOC = 26;
  public static int FLD_FAT7_D_DATA_PROT = 27;
  public static int FLD_FAT7_D_SCADENZA = 28;
  public static int FLD_FAT7_BUONI = 29;
  public static int FLD_FAT7_LIRE_EURO = 30;
  public static int FLD_FAT7_IMPORTO_EURO = 31;
  public static int FLD_FAT7_TIPO_UTENZA = 32;
  public static int FLD_FAT7_CODICE_UTENZA = 33;
  public static int FLD_FAT7_BLOCCO_PAGAMENTO = 34;
  public static int FLD_FAT7_COD_IMP_ECO = 35;
  public static int FLD_FAT7_ANNO_ORDINE = 36;
  public static int FLD_FAT7_NUMERO_ORDINE = 37;
  public static int FLD_FAT7_FLAG_IVA_ECO = 38;
  public static int FLD_FAT7_FLAG_DA_FS4 = 39;
  public static int FLD_FAT7_DATA_RIENTRO = 40;
  public static int FLD_FAT7_NUM_UTENTE = 41;
  public static int FLD_FAT7_ID_DOCUMENTALE = 42;
  public static int FLD_FAT7_NOTE = 43;
  public static int FLD_FAT7_PROGR_UNITA_ORGANIZZATIVA = 44;
  public static int FLD_FAT7_UTENTE_INSERIMENTO = 45;
  public static int FLD_FAT7_DATA_INSERIMENTO = 46;
  public static int FLD_FAT7_UTENTE_ULTIMO_AGG = 47;
  public static int FLD_FAT7_DATA_ULTIMO_AGG = 48;
  public static int FLD_FAT7_ROWNAMESTATO = 49;
  public static int FLD_FAT7_ROWNAMNOTSOS = 50;
  public static int FLD_FAT7_ROWNAMPRUOCO = 51;
  public static int FLD_FAT7_ROWNAMDATARR = 52;
  public static int FLD_FAT7_ROWNAMNUPRGE = 53;
  public static int FLD_FAT7_ROWNAMECIG = 54;
  public static int FLD_FAT7_ROWNAMECUP = 55;
  public static int FLD_FAT7_ROWNAMEBARCO = 56;
  public static int FLD_FAT7_TRATTAMENTO_IVA = 57;
  public static int FLD_FAT7_MULTISERVIZI = 58;
  public static int FLD_FAT7_ID_GDM_FE = 59;
  public static int FLD_FAT7_MOTIVAZIONE_SCADENZA = 60;
  public static int FLD_FAT7_CAUSALE_SOSPENSIONE = 61;
  public static int FLD_FAT7_SCADENZA_SOSPENSIONE = 62;
  public static int FLD_FAT7_ALLEGATO = 63;
  public static int FLD_FAT7_STATO_VALIDAZIONE = 64;
  public static int FLD_FAT7_AVVISO_FORNITORE = 65;
  public static int FLD_FAT7_UTENTE_ULTIMA_VALIDAZIONE = 66;
  public static int FLD_FAT7_DATA_ULTIMA_VALIDAZIONE = 67;
  public static int FLD_FAT7_DOC_NON_COMMERCIALE = 68;
  public static int FLD_FAT7_INIZIO_SOSPENSIONE = 69;
  public static int FLD_FAT7_CONTRIBUENTI_MINIMI = 70;
  public static int FLD_FAT7_IMPORTO_RIMBORSI = 71;
  public static int FLD_FAT7_IMPORTO_PRESTAZIONI = 72;

  // Definition of table: Ritenute
  //
  public static int TBL_RITENUTE1 = 274;
  public static int FLD_RITENUTE1_ROWNAMCASOLD = 0;
  public static int FLD_RITENUTE1_ROWNAMCOSSOL = 1;
  public static int FLD_RITENUTE1_ROWNAMCOINOL = 2;
  public static int FLD_RITENUTE1_RONAFLIVNNSO = 3;
  public static int FLD_RITENUTE1_ROWNAMALIOLD = 4;
  public static int FLD_RITENUTE1_ROWNAMALADOL = 5;
  public static int FLD_RITENUTE1_RONAALADCOOL = 6;
  public static int FLD_RITENUTE1_ROWNAMIMINO1 = 7;
  public static int FLD_RITENUTE1_ROWNAMIMINOL = 8;
  public static int FLD_RITENUTE1_ROWNAMIMIRO1 = 9;
  public static int FLD_RITENUTE1_ROWNAMIMIROL = 10;
  public static int FLD_RITENUTE1_ROWNAMCOCAOL = 11;

  // Definition of table: IVA
  //
  public static int TBL_IVA4 = 275;
  public static int FLD_IVA4_PROGRESSIVO = 0;
  public static int FLD_IVA4_ANNO_PROG = 1;
  public static int FLD_IVA4_NUMERO_PROG = 2;
  public static int FLD_IVA4_CODICE_DOC = 3;
  public static int FLD_IVA4_IMPONIBILE = 4;
  public static int FLD_IVA4_IMPONIBILE_OLD = 5;
  public static int FLD_IVA4_ROWNAMIMPSEG = 6;
  public static int FLD_IVA4_IVA = 7;
  public static int FLD_IVA4_ROWNAMIVASEG = 8;
  public static int FLD_IVA4_ALIQUOTA = 9;
  public static int FLD_IVA4_ALIQUOTA_OLD = 10;
  public static int FLD_IVA4_IVA_INDED = 11;
  public static int FLD_IVA4_CODICE_ESENZIONE = 12;
  public static int FLD_IVA4_CODICE_ESENZIONE_OLD = 13;
  public static int FLD_IVA4_IMPONIBILE_CEE = 14;
  public static int FLD_IVA4_IMPONIBILE_EURO = 15;
  public static int FLD_IVA4_IVA_EURO = 16;
  public static int FLD_IVA4_CODICE_STAT = 17;
  public static int FLD_IVA4_UTENTE_INSERIMENTO = 18;
  public static int FLD_IVA4_DATA_INSERIMENTO = 19;
  public static int FLD_IVA4_UTENTE_ULTIMO_AGG = 20;
  public static int FLD_IVA4_DATA_ULTIMO_AGG = 21;
  public static int FLD_IVA4_ROWNAMEINDIM = 22;
  public static int FLD_IVA4_ROWNAMESTATO = 23;
  public static int FLD_IVA4_ROWNAMERIGA = 24;
  public static int FLD_IVA4_TIPO_REGISTRO_S = 25;
  public static int FLD_IVA4_TIPO_REGISTRO_S_OLD = 26;
  public static int FLD_IVA4_TIPO_BOLLATO_S = 27;
  public static int FLD_IVA4_TIPO_BOLLATO_S_OLD = 28;
  public static int FLD_IVA4_ANNO_REG_S = 29;
  public static int FLD_IVA4_NUMERO_REG_S = 30;
  public static int FLD_IVA4_D_DATA_REG_S = 31;
  public static int FLD_IVA4_TIPO_REGISTRO = 32;
  public static int FLD_IVA4_TIPO_REGISTRO_OLD = 33;
  public static int FLD_IVA4_SERVIZIO = 34;
  public static int FLD_IVA4_SERVIZIO_OLD = 35;
  public static int FLD_IVA4_ANNO_REG = 36;
  public static int FLD_IVA4_NUMERO_REG = 37;
  public static int FLD_IVA4_D_DATA_REG = 38;
  public static int FLD_IVA4_D_DATA_LIQ = 39;
  public static int FLD_IVA4_TIPO_DOC = 40;
  public static int FLD_IVA4_REC_VENDITE = 41;

  // Definition of table: IMP ECO
  //
  public static int TBL_IMPECO4 = 276;
  public static int FLD_IMPECO4_ESERCIZIO = 0;
  public static int FLD_IMPECO4_PROGRESSIVO = 1;
  public static int FLD_IMPECO4_ANNO_PROG = 2;
  public static int FLD_IMPECO4_NUMERO_PROG = 3;
  public static int FLD_IMPECO4_ANNO_LIQ = 4;
  public static int FLD_IMPECO4_NUMERO_LIQ = 5;
  public static int FLD_IMPECO4_ANNO_PRE = 6;
  public static int FLD_IMPECO4_NUMERO_PRE = 7;
  public static int FLD_IMPECO4_FATTORE = 8;
  public static int FLD_IMPECO4_CENTRO = 9;
  public static int FLD_IMPECO4_IMPORTO = 10;
  public static int FLD_IMPECO4_COMPETENZA_DAL = 11;
  public static int FLD_IMPECO4_COMPETENZA_AL = 12;
  public static int FLD_IMPECO4_NOTE = 13;
  public static int FLD_IMPECO4_IMPORTO_EURO = 14;
  public static int FLD_IMPECO4_ANNO_ACC = 15;
  public static int FLD_IMPECO4_NUMERO_ACC = 16;
  public static int FLD_IMPECO4_ANNO_IMP = 17;
  public static int FLD_IMPECO4_NUMERO_IMP = 18;
  public static int FLD_IMPECO4_ANNO_SUBIMP = 19;
  public static int FLD_IMPECO4_NUMERO_SUBIMP = 20;
  public static int FLD_IMPECO4_PROGRESSIVO_VARACC = 21;
  public static int FLD_IMPECO4_PROGRESSIVO_VARIMP = 22;
  public static int FLD_IMPECO4_PROGRESSIVO_VARSUB = 23;
  public static int FLD_IMPECO4_NO_IVA = 24;
  public static int FLD_IMPECO4_PROGETTO_ID = 25;
  public static int FLD_IMPECO4_IVA = 26;
  public static int FLD_IMPECO4_IMPECOSTATO = 27;

  // Definition of table: Delete Fat
  //
  public static int TBL_DELETEFAT = 277;
  public static int FLD_DELETEFAT_NOOGDEELFACF = 0;
  public static int FLD_DELETEFAT_NOMOGGDEANPR = 1;
  public static int FLD_DELETEFAT_NOMOGGDENUPR = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM32 = 278;
  public static int FLD_PARAM32_ROWNAMEMULTI = 0;
  public static int FLD_PARAM32_ROWNAMEFSE = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM14 = 279;
  public static int FLD_PARAM14_ROWNAMEES = 0;
  public static int FLD_PARAM14_ROWNAMANNPRO = 1;
  public static int FLD_PARAM14_ROWNAMNUMPRO = 2;
  public static int FLD_PARAM14_ROWNAMEFORNI = 3;
  public static int FLD_PARAM14_ROWNAMTOTRET = 4;
  public static int FLD_PARAM14_ROWNAMEIMPOR = 5;
  public static int FLD_PARAM14_ROWNAMEPROPO = 6;
  public static int FLD_PARAM14_ROWNAMEINFO = 7;
  public static int FLD_PARAM14_ROWNAMCODDOC = 8;
  public static int FLD_PARAM14_ROWNAMNUMDOC = 9;
  public static int FLD_PARAM14_ROWNAMANNDOC = 10;
  public static int FLD_PARAM14_ROWNAMDATDOC = 11;
  public static int FLD_PARAM14_ROWNAMCODFOR = 12;
  public static int FLD_PARAM14_ROWNAMEQUIET = 13;
  public static int FLD_PARAM14_ROWNAMTRAIVA = 14;
  public static int FLD_PARAM14_ROWNAMEATTIV = 15;

  // Definition of table: Param
  //
  public static int TBL_PARAM19 = 280;
  public static int FLD_PARAM19_ROWNAMANNDEL = 0;
  public static int FLD_PARAM19_ROWNAMNUMDEL = 1;
  public static int FLD_PARAM19_ROWNAMSEDDEL = 2;
  public static int FLD_PARAM19_ROWNAMANNPR1 = 3;
  public static int FLD_PARAM19_ROWNAMNUMPR1 = 4;
  public static int FLD_PARAM19_ROWNAMUNIPRO = 5;
  public static int FLD_PARAM19_ROWNAMEDESCR = 6;
  public static int FLD_PARAM19_ROWNAMEUFFIC = 7;
  public static int FLD_PARAM19_ROWNAMECAUSA = 8;
  public static int FLD_PARAM19_ROWNAMEBOLLO = 9;
  public static int FLD_PARAM19_ROWNAMESCADE = 10;
  public static int FLD_PARAM19_ROWNAMESPESE = 11;
  public static int FLD_PARAM19_ROWNAMECOMMI = 12;
  public static int FLD_PARAM19_ROWNAMEALLEG = 13;
  public static int FLD_PARAM19_ROWNAMINFTES = 14;
  public static int FLD_PARAM19_ROWNAMEQUALI = 15;
  public static int FLD_PARAM19_ROWNAMEINEMI = 16;
  public static int FLD_PARAM19_ROWNAMEPROGR = 17;
  public static int FLD_PARAM19_ROWNAMANNPRO = 18;
  public static int FLD_PARAM19_ROWNAMNUMPRO = 19;
  public static int FLD_PARAM19_ROWNAMCODDOC = 20;
  public static int FLD_PARAM19_ROWNAMNUMDOC = 21;
  public static int FLD_PARAM19_ROWNAMDATDOC = 22;
  public static int FLD_PARAM19_ROWNAMANNDOC = 23;
  public static int FLD_PARAM19_ROWNAMCODFOR = 24;
  public static int FLD_PARAM19_ROWNAMEQUIET = 25;
  public static int FLD_PARAM19_MOTIVO_ESCLUSIONE_CIG = 26;

  // Definition of table: Param
  //
  public static int TBL_PARAM39 = 281;
  public static int FLD_PARAM39_ROWNAMEDESCR = 0;
  public static int FLD_PARAM39_ROWNAMEUFFIC = 1;
  public static int FLD_PARAM39_ROWNAMECAUSA = 2;
  public static int FLD_PARAM39_ROWNAMEBOLLO = 3;
  public static int FLD_PARAM39_ROWNAMESCADE = 4;
  public static int FLD_PARAM39_ROWNAMESPESE = 5;
  public static int FLD_PARAM39_ROWNAMECOMMI = 6;
  public static int FLD_PARAM39_ROWNAMEALLEG = 7;
  public static int FLD_PARAM39_ROWNAMINFTES = 8;
  public static int FLD_PARAM39_ROWNAMEQUALI = 9;
  public static int FLD_PARAM39_ROWNAMEINEMI = 10;
  public static int FLD_PARAM39_ROWNAMIMPECO = 11;
  public static int FLD_PARAM39_ROWNAMDESUAC = 12;
  public static int FLD_PARAM39_ROWNAMECONTR = 13;
  public static int FLD_PARAM39_ROWNAMEISCON = 14;
  public static int FLD_PARAM39_ROWNAMEPROGR = 15;
  public static int FLD_PARAM39_ROWNAMCODDEB = 16;
  public static int FLD_PARAM39_ROWNAMEDEBIT = 17;
  public static int FLD_PARAM39_ROWNAMDEBOLD = 18;
  public static int FLD_PARAM39_ROWNAMANNPRO = 19;
  public static int FLD_PARAM39_ROWNAMNUMPRO = 20;
  public static int FLD_PARAM39_ROWNAMCODDOC = 21;
  public static int FLD_PARAM39_ROWNAMNUMDOC = 22;
  public static int FLD_PARAM39_ROWNAMDATDOC = 23;
  public static int FLD_PARAM39_ROWNAMANNDOC = 24;
  public static int FLD_PARAM39_ROWNAMCODFOR = 25;
  public static int FLD_PARAM39_ROWNAMEQUIET = 26;

  // Definition of table: Param
  //
  public static int TBL_PARAM48 = 282;
  public static int FLD_PARAM48_ROWNAMANNPRO = 0;
  public static int FLD_PARAM48_ROWNAMNUMPRO = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM49 = 283;
  public static int FLD_PARAM49_ROWNAMANNPRO = 0;
  public static int FLD_PARAM49_ROWNAMNUMPRO = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM23 = 284;
  public static int FLD_PARAM23_ROWNAMANNPRO = 0;
  public static int FLD_PARAM23_ROWNAMNUMPRO = 1;
  public static int FLD_PARAM23_ROWNAMCODDOC = 2;
  public static int FLD_PARAM23_ROWNAMESTORN = 3;
  public static int FLD_PARAM23_ROWNAMNUMDOC = 4;
  public static int FLD_PARAM23_ROWNAMDATDOC = 5;
  public static int FLD_PARAM23_ROWNAMCODBEN = 6;
  public static int FLD_PARAM23_ROWNAMEFATTU = 7;
  public static int FLD_PARAM23_ROWNAMDATPRO = 8;
  public static int FLD_PARAM23_ROWNAMIMPECO = 9;
  public static int FLD_PARAM23_ROWNAMRPPATT = 10;
  public static int FLD_PARAM23_ROWNAMEFORNI = 11;
  public static int FLD_PARAM23_ROWNAMEINFO = 12;

  // Definition of table: RETFAT
  //
  public static int TBL_RETFAT = 285;
  public static int FLD_RETFAT_PROGRESSIVO = 0;
  public static int FLD_RETFAT_DESCRIZIONE = 1;
  public static int FLD_RETFAT_IMPORTO = 2;
  public static int FLD_RETFAT_D_DATA_REG = 3;
  public static int FLD_RETFAT_FAT_ANNO_PROG_FAT = 4;
  public static int FLD_RETFAT_FAT_NUMERO_PROG_FAT = 5;
  public static int FLD_RETFAT_FAT_ANNO_PROG_NAC = 6;
  public static int FLD_RETFAT_FAT_NUMERO_PROG_NAC = 7;
  public static int FLD_RETFAT_COD_REC = 8;
  public static int FLD_RETFAT_FATTORE = 9;
  public static int FLD_RETFAT_CENTRO = 10;
  public static int FLD_RETFAT_COMPETENZA_DAL = 11;
  public static int FLD_RETFAT_COMPETENZA_AL = 12;
  public static int FLD_RETFAT_IMPORTO_EURO = 13;
  public static int FLD_RETFAT_PROGETTO_ID = 14;
  public static int FLD_RETFAT_UTENTE_INSERIMENTO = 15;
  public static int FLD_RETFAT_DATA_INSERIMENTO = 16;
  public static int FLD_RETFAT_UTENTE_ULTIMO_AGG = 17;
  public static int FLD_RETFAT_DATA_ULTIMO_AGG = 18;
  public static int FLD_RETFAT_ANNO_DOC = 19;
  public static int FLD_RETFAT_ANNO_DOC_OLD = 20;
  public static int FLD_RETFAT_NUMERO_DOC = 21;
  public static int FLD_RETFAT_NUMERO_DOC_OLD = 22;
  public static int FLD_RETFAT_ROWNAMESTATO = 23;
  public static int FLD_RETFAT_IMPORTO_IVA = 24;
  public static int FLD_RETFAT_IMPORTO_IVA_IST = 25;
  public static int FLD_RETFAT_TIPO_REGISTRO_DEF = 26;
  public static int FLD_RETFAT_TIPO_BOLLATO_DEF = 27;
  public static int FLD_RETFAT_ROWNAMANPRCO = 28;
  public static int FLD_RETFAT_ROWNAMNUPRCO = 29;

  // Definition of table: Param
  //
  public static int TBL_PARAM24 = 286;
  public static int FLD_PARAM24_ROWNAMCODBEN = 0;
  public static int FLD_PARAM24_ROWNAMCODDOC = 1;
  public static int FLD_PARAM24_ROWNAMANNDOC = 2;
  public static int FLD_PARAM24_ROWNAMNUMDOC = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM1 = 287;
  public static int FLD_PARAM1_ROWNAMTIPSCA = 0;
  public static int FLD_PARAM1_ROWNAMEBARCO = 1;
  public static int FLD_PARAM1_ROWNAMELINK = 2;
  public static int FLD_PARAM1_ROWNAMEIDENT = 3;
  public static int FLD_PARAM1_ROWNAMANNPRO = 4;
  public static int FLD_PARAM1_ROWNAMNUMPRO = 5;
  public static int FLD_PARAM1_ROWNAMBLOINS = 6;
  public static int FLD_PARAM1_ROWNAMPERFIL = 7;
  public static int FLD_PARAM1_ROWNAMVARIBA = 8;
  public static int FLD_PARAM1_ROWNAMNUODOC = 9;
  public static int FLD_PARAM1_ROWNAMEIDDOC = 10;
  public static int FLD_PARAM1_ROWNAMNUMDOC = 11;
  public static int FLD_PARAM1_ROWNAMANNDOC = 12;
  public static int FLD_PARAM1_ROWNAMPATAPP = 13;
  public static int FLD_PARAM1_ROWNAMSI4URL = 14;
  public static int FLD_PARAM1_ROWNAMSI4TMP = 15;

  // Definition of table: Evento Blob
  //
  public static int TBL_EVENTOBLOB = 288;
  public static int FLD_EVENTOBLOB_ROWNAMECOLUM = 0;
  public static int FLD_EVENTOBLOB_ROWNAMESIZE = 1;
  public static int FLD_EVENTOBLOB_ROWNAMEEXTEN = 2;
  public static int FLD_EVENTOBLOB_ROWNAMFILPAT = 3;
  public static int FLD_EVENTOBLOB_ROWNAMECANCE = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI411 = 289;
  public static int FLD_PARAMETRI411_PARAMAPPLET = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM115 = 290;
  public static int FLD_PARAM115_ROWNAMEPROGR = 0;
  public static int FLD_PARAM115_ROWNAMANNPRO = 1;
  public static int FLD_PARAM115_ROWNAMNUMPRO = 2;
  public static int FLD_PARAM115_ROWNAMEPROUO = 3;
  public static int FLD_PARAM115_ROWNAMBLOINS = 4;
  public static int FLD_PARAM115_ROWNAMEIDDOC = 5;
  public static int FLD_PARAM115_ROWNAMIDALPR = 6;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO10 = 291;
  public static int FLD_FILTRO10_ROWNAMAPARDA = 0;
  public static int FLD_FILTRO10_ROWNAMEFORNI = 1;
  public static int FLD_FILTRO10_ROWNAMEORDIN = 2;
  public static int FLD_FILTRO10_ROWNAMIMPFAT = 3;
  public static int FLD_FILTRO10_ROWNAMACTPOS = 4;
  public static int FLD_FILTRO10_ROWNAMECONTA = 5;
  public static int FLD_FILTRO10_ROWNAMLIQMOD = 6;
  public static int FLD_FILTRO10_ROWNAMELIQUI = 7;
  public static int FLD_FILTRO10_ROWNAMANNPRO = 8;
  public static int FLD_FILTRO10_ROWNAMNUMPRO = 9;
  public static int FLD_FILTRO10_ROWNAMECODIC = 10;
  public static int FLD_FILTRO10_ROWNAMSOGRIC = 11;
  public static int FLD_FILTRO10_ROWNAMQUAFAT = 12;
  public static int FLD_FILTRO10_ROWNAMEECONO = 13;
  public static int FLD_FILTRO10_ROWNAMESEIMP = 14;
  public static int FLD_FILTRO10_ROWNAMENOTE = 15;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIAR31 = 292;
  public static int FLD_BENEFICIAR31_ROWNAMRAGSOC = 0;
  public static int FLD_BENEFICIAR31_ROWNAMRASOFA = 1;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ7 = 293;
  public static int FLD_PERSONALIZZ7_ROWNAMDATRIE = 0;

  // Definition of table: IVA
  //
  public static int TBL_IVA1 = 294;
  public static int FLD_IVA1_PROGRESSIVO = 0;
  public static int FLD_IVA1_ANNO_PROG = 1;
  public static int FLD_IVA1_NUMERO_PROG = 2;
  public static int FLD_IVA1_CODICE_DOC = 3;
  public static int FLD_IVA1_IMPONIBILE = 4;
  public static int FLD_IVA1_IVA = 5;
  public static int FLD_IVA1_ALIQUOTA = 6;
  public static int FLD_IVA1_IVA_INDED = 7;
  public static int FLD_IVA1_CODICE_ESENZIONE = 8;
  public static int FLD_IVA1_IMPONIBILE_CEE = 9;
  public static int FLD_IVA1_IMPONIBILE_EURO = 10;
  public static int FLD_IVA1_IVA_EURO = 11;
  public static int FLD_IVA1_CODICE_STAT = 12;
  public static int FLD_IVA1_UTENTE_INSERIMENTO = 13;
  public static int FLD_IVA1_DATA_INSERIMENTO = 14;
  public static int FLD_IVA1_UTENTE_ULTIMO_AGG = 15;
  public static int FLD_IVA1_DATA_ULTIMO_AGG = 16;
  public static int FLD_IVA1_ROWNAMEINDIM = 17;
  public static int FLD_IVA1_ROWNAMESTATO = 18;
  public static int FLD_IVA1_ROWNAMERIGA = 19;
  public static int FLD_IVA1_TIPO_REGISTRO_S = 20;
  public static int FLD_IVA1_TIPO_BOLLATO_S = 21;
  public static int FLD_IVA1_ANNO_REG_S = 22;
  public static int FLD_IVA1_NUMERO_REG_S = 23;
  public static int FLD_IVA1_D_DATA_REG_S = 24;
  public static int FLD_IVA1_TIPO_REGISTRO = 25;
  public static int FLD_IVA1_SERVIZIO = 26;
  public static int FLD_IVA1_ANNO_REG = 27;
  public static int FLD_IVA1_NUMERO_REG = 28;
  public static int FLD_IVA1_D_DATA_REG = 29;
  public static int FLD_IVA1_D_DATA_LIQ = 30;
  public static int FLD_IVA1_TIPO_DOC = 31;
  public static int FLD_IVA1_REC_VENDITE = 32;
  public static int FLD_IVA1_ROWNAMIMPSEG = 33;
  public static int FLD_IVA1_ROWNAMIVASEG = 34;

  // Definition of table: DETTAGLI BUONI
  //
  public static int TBL_DETTAGLBUONI = 295;
  public static int FLD_DETTAGLBUONI_ANNO_BUONO = 0;
  public static int FLD_DETTAGLBUONI_NUMERO_BUONO = 1;
  public static int FLD_DETTAGLBUONI_PROGRESSIVO_BUONO = 2;
  public static int FLD_DETTAGLBUONI_ANNO_IMP = 3;
  public static int FLD_DETTAGLBUONI_NUMERO_IMP = 4;
  public static int FLD_DETTAGLBUONI_ANNO_SUBIMP = 5;
  public static int FLD_DETTAGLBUONI_NUMERO_SUBIMP = 6;
  public static int FLD_DETTAGLBUONI_IMPORTO = 7;
  public static int FLD_DETTAGLBUONI_DESCRIZIONE = 8;
  public static int FLD_DETTAGLBUONI_FATTURATO = 9;
  public static int FLD_DETTAGLBUONI_LIQUIDATO = 10;
  public static int FLD_DETTAGLBUONI_CENTRO = 11;
  public static int FLD_DETTAGLBUONI_FATTORE = 12;
  public static int FLD_DETTAGLBUONI_DATA_REG = 13;
  public static int FLD_DETTAGLBUONI_UTENTE = 14;
  public static int FLD_DETTAGLBUONI_NOTE = 15;
  public static int FLD_DETTAGLBUONI_CHIUSO = 16;
  public static int FLD_DETTAGLBUONI_IMPORTO_ORIGINALE = 17;
  public static int FLD_DETTAGLBUONI_COMPETENZA_DAL = 18;
  public static int FLD_DETTAGLBUONI_COMPETENZA_AL = 19;
  public static int FLD_DETTAGLBUONI_DESTINAZIONE = 20;
  public static int FLD_DETTAGLBUONI_OFFERTA = 21;
  public static int FLD_DETTAGLBUONI_TIPO_SCADENZA = 22;
  public static int FLD_DETTAGLBUONI_RILEVANTE_ECO = 23;
  public static int FLD_DETTAGLBUONI_CODICE_GESTIONALE = 24;
  public static int FLD_DETTAGLBUONI_VOCE_ECON = 25;
  public static int FLD_DETTAGLBUONI_CATEGORIA_PRODOTTO = 26;
  public static int FLD_DETTAGLBUONI_QUANTITA = 27;
  public static int FLD_DETTAGLBUONI_UNITA_MISURA = 28;
  public static int FLD_DETTAGLBUONI_PREZZO = 29;
  public static int FLD_DETTAGLBUONI_QUANTITA_ARRIVATA = 30;
  public static int FLD_DETTAGLBUONI_UTENTE_ULTIMO_AGG = 31;
  public static int FLD_DETTAGLBUONI_DATA_ULTIMO_AGG = 32;
  public static int FLD_DETTAGLBUONI_GRUPPO = 33;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI414 = 296;
  public static int FLD_PARAMETRI414_ANNO_PROG = 0;
  public static int FLD_PARAMETRI414_NUMERO_PROG = 1;
  public static int FLD_PARAMETRI414_NUMERO_DOC = 2;
  public static int FLD_PARAMETRI414_ANNO_DOC = 3;
  public static int FLD_PARAMETRI414_D_DATA_DOC = 4;
  public static int FLD_PARAMETRI414_PARAIMPOFATT = 5;
  public static int FLD_PARAMETRI414_PARAIMPUFATT = 6;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI31 = 297;
  public static int FLD_FILTRI31_NOMEOGGEESER = 0;
  public static int FLD_FILTRI31_NOMOGGENTSPE = 1;
  public static int FLD_FILTRI31_NOMEOGGEPERI = 2;
  public static int FLD_FILTRI31_NOMOGGFILELI = 3;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO19 = 298;
  public static int FLD_FILTRO19_ROWNAMCODFOR = 0;
  public static int FLD_FILTRO19_ROWNAMEPARTE = 1;
  public static int FLD_FILTRO19_ROWNAMEESERC = 2;
  public static int FLD_FILTRO19_ROWNAMEPERIO = 3;
  public static int FLD_FILTRO19_RONADADAUSRE = 4;

  // Definition of table: IVA
  //
  public static int TBL_IVA14 = 299;
  public static int FLD_IVA14_PROGRESSIVO = 0;
  public static int FLD_IVA14_ANNO_PROG = 1;
  public static int FLD_IVA14_NUMERO_PROG = 2;
  public static int FLD_IVA14_CODICE_DOC = 3;
  public static int FLD_IVA14_IMPONIBILE = 4;
  public static int FLD_IVA14_IVA = 5;
  public static int FLD_IVA14_ALIQUOTA = 6;
  public static int FLD_IVA14_IVA_INDED = 7;
  public static int FLD_IVA14_CODICE_ESENZIONE = 8;
  public static int FLD_IVA14_IMPONIBILE_CEE = 9;
  public static int FLD_IVA14_IMPONIBILE_EURO = 10;
  public static int FLD_IVA14_IVA_EURO = 11;
  public static int FLD_IVA14_CODICE_STAT = 12;
  public static int FLD_IVA14_UTENTE_INSERIMENTO = 13;
  public static int FLD_IVA14_DATA_INSERIMENTO = 14;
  public static int FLD_IVA14_UTENTE_ULTIMO_AGG = 15;
  public static int FLD_IVA14_DATA_ULTIMO_AGG = 16;
  public static int FLD_IVA14_REC_VENDITE = 17;
  public static int FLD_IVA14_ROWNAMEINDIM = 18;
  public static int FLD_IVA14_ROWNAMESTATO = 19;
  public static int FLD_IVA14_ROWNAMERIGA = 20;
  public static int FLD_IVA14_TIPO_REGISTRO_S = 21;
  public static int FLD_IVA14_TIPO_BOLLATO_S = 22;
  public static int FLD_IVA14_NUMERO_REG_S = 23;
  public static int FLD_IVA14_TIPO_REGISTRO = 24;
  public static int FLD_IVA14_SERVIZIO = 25;
  public static int FLD_IVA14_NUMERO_REG = 26;
  public static int FLD_IVA14_D_DATA_REG_S = 27;
  public static int FLD_IVA14_D_DATA_REG = 28;

  // Definition of table: Pars CFXML
  //
  public static int TBL_PARSCFXML3 = 300;
  public static int FLD_PARSCFXML3_NOMEOGGEESER = 0;
  public static int FLD_PARSCFXML3_NOMEOGGETTES = 1;
  public static int FLD_PARSCFXML3_NOMOGGDATRIF = 2;
  public static int FLD_PARSCFXML3_NOMOGGCOFIDI = 3;
  public static int FLD_PARSCFXML3_NOMOGGCOCADI = 4;
  public static int FLD_PARSCFXML3_NOMEOGGEPERI = 5;
  public static int FLD_PARSCFXML3_NOMOGGXMLOAN = 6;
  public static int FLD_PARSCFXML3_NOMOGGDESPER = 7;
  public static int FLD_PARSCFXML3_DESCRIZIONE = 8;

  // Definition of table: Pars CFXML
  //
  public static int TBL_PARSCFXML = 301;
  public static int FLD_PARSCFXML_NOMEOGGEIDCF = 0;

  // Definition of table: Pars Dett Fatture Inviate
  //
  public static int TBL_PARDETFATINV = 302;
  public static int FLD_PARDETFATINV_NOMEOGGEIDFI = 0;
  public static int FLD_PARDETFATINV_NOMEOGGEESER = 1;
  public static int FLD_PARDETFATINV_NOMOGGENTSPE = 2;
  public static int FLD_PARDETFATINV_NOME_FILE_XML = 3;
  public static int FLD_PARDETFATINV_ELIMINATO = 4;
  public static int FLD_PARDETFATINV_NOMEOGGEPERI = 5;
  public static int FLD_PARDETFATINV_NOMOGGDATRIF = 6;

  // Definition of table: Pars Elenco File Zip
  //
  public static int TBL_PARELEFILZIP = 303;
  public static int FLD_PARELEFILZIP_NOMEOGGEESER = 0;
  public static int FLD_PARELEFILZIP_NOMOGGENTSPE = 1;
  public static int FLD_PARELEFILZIP_NOMEOGGEPERI = 2;
  public static int FLD_PARELEFILZIP_NOMOGGFILELI = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI598 = 304;
  public static int FLD_PARAMETRI598_PARPERFILBLO = 0;
  public static int FLD_PARAMETRI598_PARABLOBINSE = 1;
  public static int FLD_PARAMETRI598_PARAMPROGRES = 2;
  public static int FLD_PARAMETRI598_PARAMFASE = 3;
  public static int FLD_PARAMETRI598_PARAMTIPO = 4;
  public static int FLD_PARAMETRI598_PARANOMEFILE = 5;

  // Definition of table: Pars Vis Esito
  //
  public static int TBL_PARSVISESITO = 305;
  public static int FLD_PARSVISESITO_ID_FILE = 0;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO21 = 306;
  public static int FLD_FILTRO21_ROWNAMAPARDA = 0;
  public static int FLD_FILTRO21_ROWNAMCODFOR = 1;
  public static int FLD_FILTRO21_ROWNAMEORDIN = 2;
  public static int FLD_FILTRO21_ROWNAMIMPFAT = 3;
  public static int FLD_FILTRO21_ROWNAMACTPOS = 4;
  public static int FLD_FILTRO21_ROWNAMECONTA = 5;
  public static int FLD_FILTRO21_ROWNAMLIQMOD = 6;
  public static int FLD_FILTRO21_ROWNAMELIQUI = 7;
  public static int FLD_FILTRO21_ROWNAMANNPRO = 8;
  public static int FLD_FILTRO21_ROWNAMNUMPRO = 9;
  public static int FLD_FILTRO21_ROWNAMEPARTE = 10;
  public static int FLD_FILTRO21_ROWNAMECODIC = 11;
  public static int FLD_FILTRO21_ROWNAMOLDCOD = 12;
  public static int FLD_FILTRO21_ROWNAMQUAFAT = 13;
  public static int FLD_FILTRO21_ROWNAMOLDADO = 14;
  public static int FLD_FILTRO21_ROWNAMOLTIPA = 15;
  public static int FLD_FILTRO21_ROWNAMOLDAPR = 16;
  public static int FLD_FILTRO21_ROWNAMESEIMP = 17;
  public static int FLD_FILTRO21_ROWNAMOLDTIP = 18;
  public static int FLD_FILTRO21_ROWNAMOLDORD = 19;
  public static int FLD_FILTRO21_ROWNAMENOTE = 20;
  public static int FLD_FILTRO21_ROWNAMFILUNI = 21;
  public static int FLD_FILTRO21_RONAPRDACOFA = 22;
  public static int FLD_FILTRO21_ROWNAMEMULTI = 23;
  public static int FLD_FILTRO21_ROWNAMCODAPR = 24;
  public static int FLD_FILTRO21_ROWNAMEAL = 25;
  public static int FLD_FILTRO21_ROWNAMUNIORG = 26;
  public static int FLD_FILTRO21_ROWNAMESTATO = 27;

  // Definition of table: Fatture Buoni IMDB
  //
  public static int TBL_FATTBUONIMD2 = 307;
  public static int FLD_FATTBUONIMD2_ANNO_BUONO = 0;
  public static int FLD_FATTBUONIMD2_NUMERO_BUONO = 1;
  public static int FLD_FATTBUONIMD2_PROGRESSIVO_BUONO = 2;
  public static int FLD_FATTBUONIMD2_ANNO_PROG = 3;
  public static int FLD_FATTBUONIMD2_NUMERO_PROG = 4;
  public static int FLD_FATTBUONIMD2_IMPUTATO = 5;
  public static int FLD_FATTBUONIMD2_PROGRESSIVO = 6;
  public static int FLD_FATTBUONIMD2_LIQUIDATO = 7;
  public static int FLD_FATTBUONIMD2_DATA_REGISTRAZIONE = 8;
  public static int FLD_FATTBUONIMD2_PROGRESSIVO_IMP = 9;
  public static int FLD_FATTBUONIMD2_UTENTE_INSERIMENTO = 10;
  public static int FLD_FATTBUONIMD2_UTENTE_ULTIMO_AGG = 11;
  public static int FLD_FATTBUONIMD2_DATA_ULTIMO_AGG = 12;
  public static int FLD_FATTBUONIMD2_FATBUOIMDSTA = 13;
  public static int FLD_FATTBUONIMD2_FATBUOIMDLIQ = 14;
  public static int FLD_FATTBUONIMD2_FATBUOIMDCHI = 15;
  public static int FLD_FATTBUONIMD2_FATBUOIMDDES = 16;
  public static int FLD_FATTBUONIMD2_FATBUOIMQUAR = 17;
  public static int FLD_FATTBUONIMD2_FATBUOIMDIMP = 18;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZA = 308;
  public static int FLD_PERSONALIZZA_ROWNAMDATRIE = 0;

  // Definition of table: FAT
  //
  public static int TBL_FAT = 309;
  public static int FLD_FAT_CODICE = 0;
  public static int FLD_FAT_ANNO_RIF = 1;
  public static int FLD_FAT_NUMERO_RIF = 2;
  public static int FLD_FAT_ANNO_DOC = 3;
  public static int FLD_FAT_NUMERO_DOC = 4;
  public static int FLD_FAT_DATA_DOC = 5;
  public static int FLD_FAT_ANNO_PROG = 6;
  public static int FLD_FAT_NUMERO_PROG = 7;
  public static int FLD_FAT_ANNO_PROT = 8;
  public static int FLD_FAT_NUMERO_PROT = 9;
  public static int FLD_FAT_DATA_PROT = 10;
  public static int FLD_FAT_CODICE_DOC = 11;
  public static int FLD_FAT_STORNO = 12;
  public static int FLD_FAT_TIPO_PAGAMENTO = 13;
  public static int FLD_FAT_TIPO_DOC = 14;
  public static int FLD_FAT_TIPO_REGISTRO = 15;
  public static int FLD_FAT_SERVIZIO = 16;
  public static int FLD_FAT_ANNO_REG = 17;
  public static int FLD_FAT_NUMERO_REG = 18;
  public static int FLD_FAT_UFFICIO_INVIO = 19;
  public static int FLD_FAT_DESCRIZIONE = 20;
  public static int FLD_FAT_IMPORTO = 21;
  public static int FLD_FAT_DIFFERENZA_IVA = 22;
  public static int FLD_FAT_NUM_QUIETANZA = 23;
  public static int FLD_FAT_DATA_REG = 24;
  public static int FLD_FAT_TIPO_REGISTRO_S = 25;
  public static int FLD_FAT_TIPO_BOLLATO_S = 26;
  public static int FLD_FAT_ANNO_REG_S = 27;
  public static int FLD_FAT_NUMERO_REG_S = 28;
  public static int FLD_FAT_DATA_REG_S = 29;
  public static int FLD_FAT_CATEGORIA = 30;
  public static int FLD_FAT_TIPO_DOC_S = 31;
  public static int FLD_FAT_ACQUISTO_CEE = 32;
  public static int FLD_FAT_MONETA = 33;
  public static int FLD_FAT_ESCLUSIONE_ELE = 34;
  public static int FLD_FAT_SCADENZA = 35;
  public static int FLD_FAT_RIVENDITA = 36;
  public static int FLD_FAT_VARIAZIONI = 37;
  public static int FLD_FAT_IMPUTATO = 38;
  public static int FLD_FAT_D_DATA_DOC = 39;
  public static int FLD_FAT_D_DATA_PROT = 40;
  public static int FLD_FAT_D_DATA_REG = 41;
  public static int FLD_FAT_D_DATA_REG_S = 42;
  public static int FLD_FAT_D_SCADENZA = 43;
  public static int FLD_FAT_BUONI = 44;
  public static int FLD_FAT_DATA_LIQ = 45;
  public static int FLD_FAT_D_DATA_LIQ = 46;
  public static int FLD_FAT_LIQUIDAZIONE_DEF = 47;
  public static int FLD_FAT_LIRE_EURO = 48;
  public static int FLD_FAT_IMPORTO_EURO = 49;
  public static int FLD_FAT_TIPO_UTENZA = 50;
  public static int FLD_FAT_CODICE_UTENZA = 51;
  public static int FLD_FAT_BLOCCO_PAGAMENTO = 52;
  public static int FLD_FAT_COD_IMP_ECO = 53;
  public static int FLD_FAT_ANNO_ORDINE = 54;
  public static int FLD_FAT_NUMERO_ORDINE = 55;
  public static int FLD_FAT_FLAG_IVA_ECO = 56;
  public static int FLD_FAT_FLAG_DA_FS4 = 57;
  public static int FLD_FAT_DATA_RIENTRO = 58;
  public static int FLD_FAT_NUM_UTENTE = 59;
  public static int FLD_FAT_ID_DOCUMENTALE = 60;
  public static int FLD_FAT_NOTE = 61;
  public static int FLD_FAT_PROGR_UNITA_ORGANIZZATIVA = 62;
  public static int FLD_FAT_UTENTE_INSERIMENTO = 63;
  public static int FLD_FAT_DATA_INSERIMENTO = 64;
  public static int FLD_FAT_UTENTE_ULTIMO_AGG = 65;
  public static int FLD_FAT_DATA_ULTIMO_AGG = 66;
  public static int FLD_FAT_ROWNAMESTATO = 67;
  public static int FLD_FAT_ROWNAMNOTSOS = 68;
  public static int FLD_FAT_ROWNAMPRUOCO = 69;

  // Definition of table: Ritenute
  //
  public static int TBL_RITENUTE = 310;
  public static int FLD_RITENUTE_ROWNAMECASSA = 0;
  public static int FLD_RITENUTE_ROWNAMCODINA = 1;
  public static int FLD_RITENUTE_ROWNAMCODSSN = 2;
  public static int FLD_RITENUTE_RONAFLIVNNSO = 3;
  public static int FLD_RITENUTE_ROWNAMEALIQU = 4;
  public static int FLD_RITENUTE_ROWNAMALIADD = 5;
  public static int FLD_RITENUTE_ROWNAMALADCO = 6;
  public static int FLD_RITENUTE_ROWNAMIMPINP = 7;
  public static int FLD_RITENUTE_ROWNAMIMPINA = 8;
  public static int FLD_RITENUTE_ROWNAMIMPIRA = 9;
  public static int FLD_RITENUTE_ROWNAMIMPIRP = 10;

  // Definition of table: Iva
  //
  public static int TBL_IVA15 = 311;
  public static int FLD_IVA15_ROWNAMEIMPON = 0;
  public static int FLD_IVA15_ROWNAMEALIQU = 1;
  public static int FLD_IVA15_ROWNAMEESENZ = 2;

  // Definition of table: IVA
  //
  public static int TBL_IVA = 312;
  public static int FLD_IVA_PROGRESSIVO = 0;
  public static int FLD_IVA_ANNO_PROG = 1;
  public static int FLD_IVA_NUMERO_PROG = 2;
  public static int FLD_IVA_CODICE_DOC = 3;
  public static int FLD_IVA_IMPONIBILE = 4;
  public static int FLD_IVA_IVA = 5;
  public static int FLD_IVA_ALIQUOTA = 6;
  public static int FLD_IVA_IVA_INDED = 7;
  public static int FLD_IVA_CODICE_ESENZIONE = 8;
  public static int FLD_IVA_IMPONIBILE_CEE = 9;
  public static int FLD_IVA_IMPONIBILE_EURO = 10;
  public static int FLD_IVA_IVA_EURO = 11;
  public static int FLD_IVA_CODICE_STAT = 12;
  public static int FLD_IVA_UTENTE_INSERIMENTO = 13;
  public static int FLD_IVA_DATA_INSERIMENTO = 14;
  public static int FLD_IVA_UTENTE_ULTIMO_AGG = 15;
  public static int FLD_IVA_DATA_ULTIMO_AGG = 16;
  public static int FLD_IVA_REC_VENDITE = 17;
  public static int FLD_IVA_ROWNAMEINDIM = 18;
  public static int FLD_IVA_ROWNAMESTATO = 19;
  public static int FLD_IVA_ROWNAMERIGA = 20;
  public static int FLD_IVA_TIPO_REGISTRO_S = 21;
  public static int FLD_IVA_TIPO_BOLLATO_S = 22;
  public static int FLD_IVA_NUMERO_REG_S = 23;
  public static int FLD_IVA_TIPO_REGISTRO = 24;
  public static int FLD_IVA_SERVIZIO = 25;
  public static int FLD_IVA_NUMERO_REG = 26;
  public static int FLD_IVA_D_DATA_REG_S = 27;
  public static int FLD_IVA_D_DATA_REG = 28;

  // Definition of table: IMP ECO
  //
  public static int TBL_IMPECO5 = 313;
  public static int FLD_IMPECO5_ESERCIZIO = 0;
  public static int FLD_IMPECO5_PROGRESSIVO = 1;
  public static int FLD_IMPECO5_ANNO_PROG = 2;
  public static int FLD_IMPECO5_NUMERO_PROG = 3;
  public static int FLD_IMPECO5_ANNO_LIQ = 4;
  public static int FLD_IMPECO5_NUMERO_LIQ = 5;
  public static int FLD_IMPECO5_ANNO_PRE = 6;
  public static int FLD_IMPECO5_NUMERO_PRE = 7;
  public static int FLD_IMPECO5_FATTORE = 8;
  public static int FLD_IMPECO5_CENTRO = 9;
  public static int FLD_IMPECO5_IMPORTO = 10;
  public static int FLD_IMPECO5_COMPETENZA_DAL = 11;
  public static int FLD_IMPECO5_COMPETENZA_AL = 12;
  public static int FLD_IMPECO5_NOTE = 13;
  public static int FLD_IMPECO5_IMPORTO_EURO = 14;
  public static int FLD_IMPECO5_ANNO_ACC = 15;
  public static int FLD_IMPECO5_NUMERO_ACC = 16;
  public static int FLD_IMPECO5_ANNO_IMP = 17;
  public static int FLD_IMPECO5_NUMERO_IMP = 18;
  public static int FLD_IMPECO5_ANNO_SUBIMP = 19;
  public static int FLD_IMPECO5_NUMERO_SUBIMP = 20;
  public static int FLD_IMPECO5_PROGRESSIVO_VARACC = 21;
  public static int FLD_IMPECO5_PROGRESSIVO_VARIMP = 22;
  public static int FLD_IMPECO5_PROGRESSIVO_VARSUB = 23;
  public static int FLD_IMPECO5_NO_IVA = 24;
  public static int FLD_IMPECO5_PROGETTO_ID = 25;
  public static int FLD_IMPECO5_IVA = 26;
  public static int FLD_IMPECO5_IMPECOSTATO = 27;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI413 = 314;
  public static int FLD_PARAMETRI413_PARAANNOPROG = 0;
  public static int FLD_PARAMETRI413_PARANUMEPROG = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS92 = 315;
  public static int FLD_PARS92_NOMEOGGPROUO = 0;

  // Definition of table: ERRORI RETT MASS UO
  //
  public static int TBL_ERRORETMASUO = 316;
  public static int FLD_ERRORETMASUO_NUMERO_DOC = 0;
  public static int FLD_ERRORETMASUO_D_DATA_DOC = 1;
  public static int FLD_ERRORETMASUO_ERROREOKKO = 2;
  public static int FLD_ERRORETMASUO_DESCRIERRORE = 3;

  // Definition of table: Parametri Import
  //
  public static int TBL_PARAMEIMPORT = 317;
  public static int FLD_PARAMEIMPORT_NOMEOGGEPROG = 0;
  public static int FLD_PARAMEIMPORT_NOMEOGGEBLOB = 1;
  public static int FLD_PARAMEIMPORT_NOMEOGGEPERC = 2;
  public static int FLD_PARAMEIMPORT_NOMOGGFASIMP = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM3 = 318;
  public static int FLD_PARAM3_ROWNAMNUMBOL = 0;
  public static int FLD_PARAM3_ROWNAMDATBOL = 1;
  public static int FLD_PARAM3_ROWNAMANNPRO = 2;
  public static int FLD_PARAM3_ROWNAMNUMPRO = 3;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI1 = 319;
  public static int FLD_FILTRI1_ANNO_PROG = 0;
  public static int FLD_FILTRI1_NUMERO_PROG = 1;
  public static int FLD_FILTRI1_ROWNAMCODBEN = 2;
  public static int FLD_FILTRI1_ROWNAMEOLDAC = 3;
  public static int FLD_FILTRI1_ROWNAMCONCON = 4;
  public static int FLD_FILTRI1_ROWNAMEACTIV = 5;
  public static int FLD_FILTRI1_ROWNAMECONTA = 6;
  public static int FLD_FILTRI1_ROWNAMACTROW = 7;
  public static int FLD_FILTRI1_ROWNAMACROOL = 8;
  public static int FLD_FILTRI1_ROWNAMEERROR = 9;
  public static int FLD_FILTRI1_ROWNAMIMPFAT = 10;
  public static int FLD_FILTRI1_ROWNAMFIUNOR = 11;
  public static int FLD_FILTRI1_ROWNAMUNIORG = 12;
  public static int FLD_FILTRI1_ROWNAMNUOFAT = 13;
  public static int FLD_FILTRI1_ROWNAMDATFAT = 14;
  public static int FLD_FILTRI1_ROWNAMRESFAT = 15;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO3 = 320;
  public static int FLD_FILTRO3_ROWNAMERICER = 0;
  public static int FLD_FILTRO3_ROWNAMAPARDA = 1;
  public static int FLD_FILTRO3_ROWNAMCODFOR = 2;
  public static int FLD_FILTRO3_ROWNAMEORDIN = 3;
  public static int FLD_FILTRO3_ROWNAMIMPFAT = 4;
  public static int FLD_FILTRO3_ROWNAMACTPOS = 5;
  public static int FLD_FILTRO3_ROWNAMECONTA = 6;
  public static int FLD_FILTRO3_ROWNAMANCCHI = 7;
  public static int FLD_FILTRO3_ROWNAMLIQMOD = 8;
  public static int FLD_FILTRO3_ROWNAMELIQUI = 9;
  public static int FLD_FILTRO3_ROWNAMANNPRO = 10;
  public static int FLD_FILTRO3_ROWNAMNUMPRO = 11;
  public static int FLD_FILTRO3_ROWNAMDAALPO = 12;
  public static int FLD_FILTRO3_ROWNAMNUOFAT = 13;
  public static int FLD_FILTRO3_ROWNAMFIUNOR = 14;
  public static int FLD_FILTRO3_ROWNAMUNIORG = 15;
  public static int FLD_FILTRO3_ROWNAMNUMFAT = 16;
  public static int FLD_FILTRO3_ROWNAMEMULTI = 17;

  // Definition of table: Valori Da Inserire
  //
  public static int TBL_VALORDAINSE1 = 321;
  public static int FLD_VALORDAINSE1_ROWNAMEFORNI = 0;
  public static int FLD_VALORDAINSE1_ROWNAMNUMDOC = 1;
  public static int FLD_VALORDAINSE1_ROWNAMDATDOC = 2;
  public static int FLD_VALORDAINSE1_ROWNAMEIMPOR = 3;
  public static int FLD_VALORDAINSE1_ROWNAMERETTI = 4;
  public static int FLD_VALORDAINSE1_ROWNAMELIQUI = 5;
  public static int FLD_VALORDAINSE1_ROWNAMNUMPR1 = 6;
  public static int FLD_VALORDAINSE1_ROWNAMDATPRO = 7;
  public static int FLD_VALORDAINSE1_ROWNAMANNPRO = 8;
  public static int FLD_VALORDAINSE1_ROWNAMNUMPRO = 9;
  public static int FLD_VALORDAINSE1_ROWNAMCODFOR = 10;

  // Definition of table: FAT
  //
  public static int TBL_FAT1 = 322;
  public static int FLD_FAT1_CODICE = 0;
  public static int FLD_FAT1_ANNO_RIF = 1;
  public static int FLD_FAT1_NUMERO_RIF = 2;
  public static int FLD_FAT1_ANNO_DOC = 3;
  public static int FLD_FAT1_NUMERO_DOC = 4;
  public static int FLD_FAT1_DATA_DOC = 5;
  public static int FLD_FAT1_ANNO_PROG = 6;
  public static int FLD_FAT1_NUMERO_PROG = 7;
  public static int FLD_FAT1_ANNO_PROT = 8;
  public static int FLD_FAT1_NUMERO_PROT = 9;
  public static int FLD_FAT1_DATA_PROT = 10;
  public static int FLD_FAT1_CODICE_DOC = 11;
  public static int FLD_FAT1_STORNO = 12;
  public static int FLD_FAT1_TIPO_PAGAMENTO = 13;
  public static int FLD_FAT1_UFFICIO_INVIO = 14;
  public static int FLD_FAT1_DESCRIZIONE = 15;
  public static int FLD_FAT1_IMPORTO = 16;
  public static int FLD_FAT1_DIFFERENZA_IVA = 17;
  public static int FLD_FAT1_NUM_QUIETANZA = 18;
  public static int FLD_FAT1_CATEGORIA = 19;
  public static int FLD_FAT1_ACQUISTO_CEE = 20;
  public static int FLD_FAT1_MONETA = 21;
  public static int FLD_FAT1_ESCLUSIONE_ELE = 22;
  public static int FLD_FAT1_SCADENZA = 23;
  public static int FLD_FAT1_RIVENDITA = 24;
  public static int FLD_FAT1_VARIAZIONI = 25;
  public static int FLD_FAT1_IMPUTATO = 26;
  public static int FLD_FAT1_D_DATA_DOC = 27;
  public static int FLD_FAT1_D_DATA_PROT = 28;
  public static int FLD_FAT1_D_SCADENZA = 29;
  public static int FLD_FAT1_BUONI = 30;
  public static int FLD_FAT1_LIRE_EURO = 31;
  public static int FLD_FAT1_IMPORTO_EURO = 32;
  public static int FLD_FAT1_TIPO_UTENZA = 33;
  public static int FLD_FAT1_CODICE_UTENZA = 34;
  public static int FLD_FAT1_BLOCCO_PAGAMENTO = 35;
  public static int FLD_FAT1_COD_IMP_ECO = 36;
  public static int FLD_FAT1_ANNO_ORDINE = 37;
  public static int FLD_FAT1_NUMERO_ORDINE = 38;
  public static int FLD_FAT1_FLAG_IVA_ECO = 39;
  public static int FLD_FAT1_FLAG_DA_FS4 = 40;
  public static int FLD_FAT1_DATA_RIENTRO = 41;
  public static int FLD_FAT1_NUM_UTENTE = 42;
  public static int FLD_FAT1_ID_DOCUMENTALE = 43;
  public static int FLD_FAT1_NOTE = 44;
  public static int FLD_FAT1_PROGR_UNITA_ORGANIZZATIVA = 45;
  public static int FLD_FAT1_UTENTE_INSERIMENTO = 46;
  public static int FLD_FAT1_DATA_INSERIMENTO = 47;
  public static int FLD_FAT1_UTENTE_ULTIMO_AGG = 48;
  public static int FLD_FAT1_DATA_ULTIMO_AGG = 49;
  public static int FLD_FAT1_FATRAGIOSOCI = 50;
  public static int FLD_FAT1_FATLIQUIDABI = 51;
  public static int FLD_FAT1_FATORDINAMEN = 52;
  public static int FLD_FAT1_FATORDINAME1 = 53;
  public static int FLD_FAT1_FATORDINAME2 = 54;
  public static int FLD_FAT1_ID_GDM_FE = 55;
  public static int FLD_FAT1_ACCETTAZIONE_DATA = 56;
  public static int FLD_FAT1_ACCETTAZIONE_UTENTE = 57;
  public static int FLD_FAT1_CIG = 58;
  public static int FLD_FAT1_CUP = 59;

  // Definition of table: Fatture
  //
  public static int TBL_FATTURE = 323;
  public static int FLD_FATTURE_FATTURPROGRE = 0;
  public static int FLD_FATTURE_FATTUNUMEIMP = 1;
  public static int FLD_FATTURE_FATTUANNOIMP = 2;
  public static int FLD_FATTURE_FATNUMSUBIMP = 3;
  public static int FLD_FATTURE_FATANNSUBIMP = 4;
  public static int FLD_FATTURE_FATTURIMPUTA = 5;

  // Definition of table: Prog
  //
  public static int TBL_PROG = 324;
  public static int FLD_PROG_ROWNAMANNPRO = 0;
  public static int FLD_PROG_ROWNAMNUMPRO = 1;
  public static int FLD_PROG_ROWNAMELIQUI = 2;
  public static int FLD_PROG_ROWNAMANNBUO = 3;
  public static int FLD_PROG_ROWNAMNUMBUO = 4;
  public static int FLD_PROG_ROWNAMPROBUO = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM50 = 325;
  public static int FLD_PARAM50_ROWNAMEFORNI = 0;
  public static int FLD_PARAM50_ROWNAMEERROR = 1;

  // Definition of table: Dettagli Bolle
  //
  public static int TBL_DETTAGLBOLLE = 326;
  public static int FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA = 0;
  public static int FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO = 1;
  public static int FLD_DETTAGLBOLLE_QUANTITA = 2;
  public static int FLD_DETTAGLBOLLE_ANNO_BUONO = 3;
  public static int FLD_DETTAGLBOLLE_NUMERO_BUONO = 4;
  public static int FLD_DETTAGLBOLLE_PROGRESSIVO_BUONO = 5;
  public static int FLD_DETTAGLBOLLE_ROWNAMEIMPOR = 6;
  public static int FLD_DETTAGLBOLLE_ROWNAMRIGBOL = 7;

  // Definition of table: BOLLE
  //
  public static int TBL_BOLLE3 = 327;
  public static int FLD_BOLLE3_PROGRESSIVO = 0;
  public static int FLD_BOLLE3_FORNITORE = 1;
  public static int FLD_BOLLE3_ANNO_BOLLA = 2;
  public static int FLD_BOLLE3_NUMERO_BOLLA = 3;
  public static int FLD_BOLLE3_DATA_BOLLA = 4;
  public static int FLD_BOLLE3_ANNO_PROG = 5;
  public static int FLD_BOLLE3_NUMERO_PROG = 6;
  public static int FLD_BOLLE3_UTENTE_INSERIMENTO = 7;
  public static int FLD_BOLLE3_DATA_INSERIMENTO = 8;
  public static int FLD_BOLLE3_UTENTE_ULTIMO_AGG = 9;
  public static int FLD_BOLLE3_DATA_ULTIMO_AGG = 10;
  public static int FLD_BOLLE3_ID_DOCUMENTALE = 11;
  public static int FLD_BOLLE3_DATA = 12;

  // Definition of table: ORDINI
  //
  public static int TBL_ORDINI1 = 328;
  public static int FLD_ORDINI1_ANNO_BUONO = 0;
  public static int FLD_ORDINI1_NUMERO_BUONO = 1;
  public static int FLD_ORDINI1_CODICE = 2;
  public static int FLD_ORDINI1_DATA_EM_BUONO = 3;
  public static int FLD_ORDINI1_PROGR_UNITA_ORGANIZZATIVA = 4;
  public static int FLD_ORDINI1_NOTE = 5;
  public static int FLD_ORDINI1_INVIATO = 6;
  public static int FLD_ORDINI1_TIPO_SCADENZA = 7;
  public static int FLD_ORDINI1_NOTE_TESTA = 8;
  public static int FLD_ORDINI1_NOTE_CODA = 9;
  public static int FLD_ORDINI1_UTENTE_ULTIMO_AGG = 10;
  public static int FLD_ORDINI1_DATA_ULTIMO_AGG = 11;
  public static int FLD_ORDINI1_UTENTE = 12;
  public static int FLD_ORDINI1_DATA_REGISTRAZIONE = 13;
  public static int FLD_ORDINI1_OFFERTA = 14;
  public static int FLD_ORDINI1_DESTINAZIONE = 15;
  public static int FLD_ORDINI1_SETTORE_OPERATIVO = 16;
  public static int FLD_ORDINI1_SERVIZIO_OPERATIVO = 17;

  // Definition of table: DETTAGLI
  //
  public static int TBL_DETTAGLI3 = 329;
  public static int FLD_DETTAGLI3_ANNO_BUONO = 0;
  public static int FLD_DETTAGLI3_NUMERO_BUONO = 1;
  public static int FLD_DETTAGLI3_PROGRESSIVO_BUONO = 2;
  public static int FLD_DETTAGLI3_ANNO_IMP = 3;
  public static int FLD_DETTAGLI3_NUMERO_IMP = 4;
  public static int FLD_DETTAGLI3_ANNO_SUBIMP = 5;
  public static int FLD_DETTAGLI3_NUMERO_SUBIMP = 6;
  public static int FLD_DETTAGLI3_IMPORTO = 7;
  public static int FLD_DETTAGLI3_DESCRIZIONE = 8;
  public static int FLD_DETTAGLI3_FATTURATO = 9;
  public static int FLD_DETTAGLI3_LIQUIDATO = 10;
  public static int FLD_DETTAGLI3_CENTRO = 11;
  public static int FLD_DETTAGLI3_FATTORE = 12;
  public static int FLD_DETTAGLI3_DATA_REG = 13;
  public static int FLD_DETTAGLI3_UTENTE = 14;
  public static int FLD_DETTAGLI3_NOTE = 15;
  public static int FLD_DETTAGLI3_CHIUSO = 16;
  public static int FLD_DETTAGLI3_IMPORTO_ORIGINALE = 17;
  public static int FLD_DETTAGLI3_COMPETENZA_DAL = 18;
  public static int FLD_DETTAGLI3_COMPETENZA_AL = 19;
  public static int FLD_DETTAGLI3_DESTINAZIONE = 20;
  public static int FLD_DETTAGLI3_OFFERTA = 21;
  public static int FLD_DETTAGLI3_TIPO_SCADENZA = 22;
  public static int FLD_DETTAGLI3_RILEVANTE_ECO = 23;
  public static int FLD_DETTAGLI3_CODICE_GESTIONALE = 24;
  public static int FLD_DETTAGLI3_VOCE_ECON = 25;
  public static int FLD_DETTAGLI3_CATEGORIA_PRODOTTO = 26;
  public static int FLD_DETTAGLI3_QUANTITA = 27;
  public static int FLD_DETTAGLI3_UNITA_MISURA = 28;
  public static int FLD_DETTAGLI3_PREZZO = 29;
  public static int FLD_DETTAGLI3_QUANTITA_ARRIVATA = 30;
  public static int FLD_DETTAGLI3_UTENTE_ULTIMO_AGG = 31;
  public static int FLD_DETTAGLI3_DATA_ULTIMO_AGG = 32;
  public static int FLD_DETTAGLI3_GRUPPO = 33;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI89 = 330;
  public static int FLD_PARAMETRI89_ROWNAMPRUNOR = 0;
  public static int FLD_PARAMETRI89_ROWNAMEANNO = 1;
  public static int FLD_PARAMETRI89_ROWNAMDATDAL = 2;
  public static int FLD_PARAMETRI89_ROWNAMEDATAL = 3;
  public static int FLD_PARAMETRI89_ROWNAMORDCHI = 4;
  public static int FLD_PARAMETRI89_ROWNAMORDINV = 5;
  public static int FLD_PARAMETRI89_ROWNAMDEUNOR = 6;
  public static int FLD_PARAMETRI89_ROWNAMCOMOG5 = 7;
  public static int FLD_PARAMETRI89_ROWNAMCOMOG6 = 8;
  public static int FLD_PARAMETRI89_ROWNAMOGGCO5 = 9;
  public static int FLD_PARAMETRI89_ROWNAMOLDAEM = 10;
  public static int FLD_PARAMETRI89_ROWNAMETOTAL = 11;
  public static int FLD_PARAMETRI89_ROWNAMEATTO = 12;
  public static int FLD_PARAMETRI89_ROWNAMCAMNOT = 13;
  public static int FLD_PARAMETRI89_ROWNAMOGGCO6 = 14;
  public static int FLD_PARAMETRI89_ROWNAMEPERSO = 15;
  public static int FLD_PARAMETRI89_ROWNAMPROBUO = 16;
  public static int FLD_PARAMETRI89_ROWNAMCATPRO = 17;
  public static int FLD_PARAMETRI89_ROWNAMDESPRO = 18;
  public static int FLD_PARAMETRI89_ROWNAMVOCECO = 19;
  public static int FLD_PARAMETRI89_ROWNAMPREPRO = 20;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIAR23 = 331;
  public static int FLD_BENEFICIAR23_ROWNAMRAGSOC = 0;
  public static int FLD_BENEFICIAR23_ROWNAMECODIC = 1;

  // Definition of table: Dettagli Impegni Buoni
  //
  public static int TBL_DETTIMPEBUO3 = 332;
  public static int FLD_DETTIMPEBUO3_ANNO_BUONO = 0;
  public static int FLD_DETTIMPEBUO3_NUMERO_BUONO = 1;
  public static int FLD_DETTIMPEBUO3_PROGRESSIVO_BUONO = 2;
  public static int FLD_DETTIMPEBUO3_PROGRESSIVO_IMP = 3;
  public static int FLD_DETTIMPEBUO3_ANNO_IMP = 4;
  public static int FLD_DETTIMPEBUO3_NUMERO_IMP = 5;
  public static int FLD_DETTIMPEBUO3_ANNO_SUBIMP = 6;
  public static int FLD_DETTIMPEBUO3_NUMERO_SUBIMP = 7;
  public static int FLD_DETTIMPEBUO3_FINANZIAMENTO = 8;
  public static int FLD_DETTIMPEBUO3_ANNO_PROPOSTA = 9;
  public static int FLD_DETTIMPEBUO3_NUMERO_PROPOSTA = 10;
  public static int FLD_DETTIMPEBUO3_UNITA_PROPONENTE = 11;
  public static int FLD_DETTIMPEBUO3_ANNO_DEL = 12;
  public static int FLD_DETTIMPEBUO3_NUMERO_DEL = 13;
  public static int FLD_DETTIMPEBUO3_SEDE_DEL = 14;
  public static int FLD_DETTIMPEBUO3_IMPORTO = 15;
  public static int FLD_DETTIMPEBUO3_FATTURATO = 16;
  public static int FLD_DETTIMPEBUO3_VARIAZIONI = 17;
  public static int FLD_DETTIMPEBUO3_UTENTE_INSERIMENTO = 18;
  public static int FLD_DETTIMPEBUO3_DATA_INSERIMENTO = 19;
  public static int FLD_DETTIMPEBUO3_UTENTE_ULTIMO_AGG = 20;
  public static int FLD_DETTIMPEBUO3_DATA_ULTIMO_AGG = 21;
  public static int FLD_DETTIMPEBUO3_CODICE_COFOG = 22;
  public static int FLD_DETTIMPEBUO3_CODICE_EUROPEO = 23;
  public static int FLD_DETTIMPEBUO3_COD_LIVELLO_5 = 24;
  public static int FLD_DETTIMPEBUO3_COD_LIVELLO_4 = 25;
  public static int FLD_DETTIMPEBUO3_ROWNAMESTATO = 26;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI29 = 333;
  public static int FLD_PARAMETRI29_ROWNAMEANNO = 0;
  public static int FLD_PARAMETRI29_ROWNAMENUMER = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM43 = 334;
  public static int FLD_PARAM43_ROWNAMANNIMP = 0;
  public static int FLD_PARAM43_ROWNAMNUMIMP = 1;
  public static int FLD_PARAM43_ROWNAMEMODIF = 2;
  public static int FLD_PARAM43_ROWNAMANIMNU = 3;
  public static int FLD_PARAM43_ROWNAMNUIMNU = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM40 = 335;
  public static int FLD_PARAM40_ROWNAMANNBUO = 0;
  public static int FLD_PARAM40_ROWNAMNUMBUO = 1;
  public static int FLD_PARAM40_ROWNAMPROBUO = 2;
  public static int FLD_PARAM40_ROWNAMPROIMP = 3;
  public static int FLD_PARAM40_ROWNAMDAEMBU = 4;
  public static int FLD_PARAM40_ROWNAMDESDET = 5;
  public static int FLD_PARAM40_ROWNAMTOTIM1 = 6;
  public static int FLD_PARAM40_ROWNAMTOTLIQ = 7;
  public static int FLD_PARAM40_ROWNAMTOTIMP = 8;
  public static int FLD_PARAM40_ROWNAMNUMIMP = 9;
  public static int FLD_PARAM40_ROWNAMANNIMP = 10;
  public static int FLD_PARAM40_ROWNAMNUMSUB = 11;
  public static int FLD_PARAM40_ROWNAMANNSUB = 12;

  // Definition of table: Param
  //
  public static int TBL_PARAM41 = 336;
  public static int FLD_PARAM41_ROWNAMANNBUO = 0;
  public static int FLD_PARAM41_ROWNAMNUMBUO = 1;
  public static int FLD_PARAM41_ROWNAMEPROGR = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM44 = 337;
  public static int FLD_PARAM44_ROWNAMANNORD = 0;
  public static int FLD_PARAM44_ROWNAMNUMORD = 1;
  public static int FLD_PARAM44_ROWNAMPROORD = 2;
  public static int FLD_PARAM44_ROWNAMEDATA = 3;
  public static int FLD_PARAM44_ROWNAMEDESCR = 4;

  // Definition of table: Fatture Buoni IMDB
  //
  public static int TBL_FATTBUONIMDB = 338;
  public static int FLD_FATTBUONIMDB_ANNO_BUONO = 0;
  public static int FLD_FATTBUONIMDB_NUMERO_BUONO = 1;
  public static int FLD_FATTBUONIMDB_PROGRESSIVO_BUONO = 2;
  public static int FLD_FATTBUONIMDB_ANNO_PROG = 3;
  public static int FLD_FATTBUONIMDB_NUMERO_PROG = 4;
  public static int FLD_FATTBUONIMDB_IMPUTATO = 5;
  public static int FLD_FATTBUONIMDB_PROGRESSIVO = 6;
  public static int FLD_FATTBUONIMDB_LIQUIDATO = 7;
  public static int FLD_FATTBUONIMDB_DATA_REGISTRAZIONE = 8;
  public static int FLD_FATTBUONIMDB_PROGRESSIVO_IMP = 9;
  public static int FLD_FATTBUONIMDB_UTENTE_INSERIMENTO = 10;
  public static int FLD_FATTBUONIMDB_UTENTE_ULTIMO_AGG = 11;
  public static int FLD_FATTBUONIMDB_DATA_ULTIMO_AGG = 12;
  public static int FLD_FATTBUONIMDB_FATBUOIMDSTA = 13;
  public static int FLD_FATTBUONIMDB_FATBUOIMDLIQ = 14;
  public static int FLD_FATTBUONIMDB_FATBUOIMDCHI = 15;
  public static int FLD_FATTBUONIMDB_FATBUOIMDDES = 16;
  public static int FLD_FATTBUONIMDB_FATBUOIMQUAR = 17;
  public static int FLD_FATTBUONIMDB_FATBUOIMDIMP = 18;
  public static int FLD_FATTBUONIMDB_FATBUOIMPRBO = 19;
  public static int FLD_FATTBUONIMDB_FATBUOIMDFAT = 20;
  public static int FLD_FATTBUONIMDB_FATBUOIMDCEN = 21;
  public static int FLD_FATTBUONIMDB_FATBUOIMCODA = 22;
  public static int FLD_FATTBUONIMDB_FATBUOIMCOAL = 23;

  // Definition of table: Param
  //
  public static int TBL_PARAM172 = 339;
  public static int FLD_PARAM172_ROWNAMEUTENZ = 0;
  public static int FLD_PARAM172_ROWNAMCODUTE = 1;
  public static int FLD_PARAM172_ROWNAMEPERCO = 2;
  public static int FLD_PARAM172_ROWNAMEBLOBI = 3;
  public static int FLD_PARAM172_ROWNAMEPROGR = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI461 = 340;
  public static int FLD_PARAMETRI461_NOMOGGDATDAL = 0;
  public static int FLD_PARAMETRI461_NOMOGGNASVIS = 1;

  // Definition of table: Filtri FE TBL
  //
  public static int TBL_FILTRIFETBL = 341;
  public static int FLD_FILTRIFETBL_NOMEOGGDAESA = 0;
  public static int FLD_FILTRIFETBL_NOMEOGGEACCE = 1;
  public static int FLD_FILTRIFETBL_NOMEOGGERIFI = 2;
  public static int FLD_FILTRIFETBL_NOMOGGTIPPRO = 3;
  public static int FLD_FILTRIFETBL_NOMEOGGECANC = 4;
  public static int FLD_FILTRIFETBL_NOMOGGDAARDA = 5;
  public static int FLD_FILTRIFETBL_NOMOGGDAARAL = 6;

  // Definition of table: Temp UO RITORNO Multi
  //
  public static int TBL_TEMPUORITMUL = 342;
  public static int FLD_TEMPUORITMUL_NOMEOGGPROUO = 0;
  public static int FLD_TEMPUORITMUL_NOMEOGGSEMUL = 1;

  // Definition of table: Temp Motivazione
  //
  public static int TBL_TEMPMOTIVAZI = 343;
  public static int FLD_TEMPMOTIVAZI_NOMEOGGEMOTI = 0;

  // Definition of table: Temp Uo
  //
  public static int TBL_TEMPUO3 = 344;
  public static int FLD_TEMPUO3_NOMEOGGPROUO = 0;
  public static int FLD_TEMPUO3_NOMEOGGIDDOC = 1;
  public static int FLD_TEMPUO3_NOMOGGUNITRO = 2;
  public static int FLD_TEMPUO3_NOMOGGMESRIC = 3;
  public static int FLD_TEMPUO3_NOMOGGUODACA = 4;
  public static int FLD_TEMPUO3_NOMEOGGSEMUL = 5;
  public static int FLD_TEMPUO3_NOMEOGGESCEL = 6;
  public static int FLD_TEMPUO3_NOMOGGFIUOSM = 7;
  public static int FLD_TEMPUO3_NOMOGGCUUFAT = 8;
  public static int FLD_TEMPUO3_NOMOGGRIFFAT = 9;
  public static int FLD_TEMPUO3_NOMOGGBDOFAT = 10;
  public static int FLD_TEMPUO3_NOMOGGIMPFAT = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI543 = 345;
  public static int FLD_PARAMETRI543_NOMOGGRAGSOC = 0;
  public static int FLD_PARAMETRI543_NOMEOGGIDDOC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI544 = 346;
  public static int FLD_PARAMETRI544_NOMEOGGIDDOC = 0;
  public static int FLD_PARAMETRI544_NOMOGGRASOFE = 1;

  // Definition of table: Imdb Mod Ass
  //
  public static int TBL_IMDBMODASS = 347;
  public static int FLD_IMDBMODASS_NOMEOGGPROUO = 0;
  public static int FLD_IMDBMODASS_NOMEOGGIDDOC = 1;
  public static int FLD_IMDBMODASS_NOMOGGUNITRO = 2;
  public static int FLD_IMDBMODASS_NOMOGGMESRIC = 3;
  public static int FLD_IMDBMODASS_NOMOGGUODACA = 4;
  public static int FLD_IMDBMODASS_NOMEOGGSEMUL = 5;
  public static int FLD_IMDBMODASS_NOMEOGGESCEL = 6;
  public static int FLD_IMDBMODASS_NOMOGGCUUFAT = 7;
  public static int FLD_IMDBMODASS_NOMOGGRIFFAT = 8;
  public static int FLD_IMDBMODASS_NOMOGGBDOFAT = 9;
  public static int FLD_IMDBMODASS_NOMOGGIMPFAT = 10;
  public static int FLD_IMDBMODASS_NOMOGGFIUOSM = 11;

  // Definition of table: Motivazione Rifiuto
  //
  public static int TBL_MOTIVARIFIUT = 348;
  public static int FLD_MOTIVARIFIUT_NOMEOGGEMOTI = 0;

  // Definition of table: Numerazione Record
  //
  public static int TBL_NUMERARECORD = 349;
  public static int FLD_NUMERARECORD_NOMOGGTECOER = 0;
  public static int FLD_NUMERARECORD_NOMOGGUTLAPR = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS83 = 350;
  public static int FLD_PARS83_NOMOGGANPRFA = 0;
  public static int FLD_PARS83_NOMOGGNUPRFA = 1;
  public static int FLD_PARS83_NOMOGGCODDOC = 2;

  // Definition of table: Pars Per Acc NAC
  //
  public static int TBL_PARPERACCNAC = 351;
  public static int FLD_PARPERACCNAC_ID_DOCUMENTO = 0;
  public static int FLD_PARPERACCNAC_NOMOGGTICODO = 1;
  public static int FLD_PARPERACCNAC_NOMOGGCODBEN = 2;
  public static int FLD_PARPERACCNAC_NOMEOGGEIMPO = 3;
  public static int FLD_PARPERACCNAC_NOMEOGGEAPRI = 4;

  // Definition of table: FATTURE COLL
  //
  public static int TBL_FATTURECOLL = 352;
  public static int FLD_FATTURECOLL_DESCRIZIONE = 0;
  public static int FLD_FATTURECOLL_IMPORTO = 1;
  public static int FLD_FATTURECOLL_FAT_ANNO_PROG_FAT = 2;
  public static int FLD_FATTURECOLL_FAT_NUMERO_PROG_FAT = 3;
  public static int FLD_FATTURECOLL_COD_REC = 4;
  public static int FLD_FATTURECOLL_DATA_ULTIMO_AGG = 5;
  public static int FLD_FATTURECOLL_PROVENIENZA = 6;
  public static int FLD_FATTURECOLL_IMPORTO_IVA = 7;
  public static int FLD_FATTURECOLL_IMPORTO_IVA_IST = 8;
  public static int FLD_FATTURECOLL_TIPO_REGISTRO_DEF = 9;
  public static int FLD_FATTURECOLL_TIPO_BOLLATO_DEF = 10;
  public static int FLD_FATTURECOLL_ANNO_DOC = 11;
  public static int FLD_FATTURECOLL_NUMERO_DOC = 12;

  // Definition of table: Param
  //
  public static int TBL_PARAM189 = 353;
  public static int FLD_PARAM189_ROWNAMCODBEN = 0;
  public static int FLD_PARAM189_ROWNAMTICODO = 1;
  public static int FLD_PARAM189_ROWNAMANNDOC = 2;
  public static int FLD_PARAM189_ROWNAMNUMDOC = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI394 = 354;
  public static int FLD_PARAMETRI394_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI394_ROWNAMTIVIME = 1;
  public static int FLD_PARAMETRI394_ROWNAMPERMES = 2;
  public static int FLD_PARAMETRI394_ROWNAMPERTRI = 3;
  public static int FLD_PARAMETRI394_ROWNAMEDATDA = 4;
  public static int FLD_PARAMETRI394_ROWNAMEDATAA = 5;
  public static int FLD_PARAMETRI394_ROWNAMELIQUI = 6;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE53 = 355;
  public static int FLD_NEWTABLE53_ROWNAMDATREG = 0;
  public static int FLD_NEWTABLE53_ROWNAMEDATDA = 1;
  public static int FLD_NEWTABLE53_ROWNAMEDATAA = 2;
  public static int FLD_NEWTABLE53_ROWNAMEESERC = 3;
  public static int FLD_NEWTABLE53_ROWNAMTIPREG = 4;
  public static int FLD_NEWTABLE53_ROWNAMTIPBOL = 5;
  public static int FLD_NEWTABLE53_ROWNAMGEPAPA = 6;

  // Definition of table: Numerazione I V A
  //
  public static int TBL_NUMERAZIOIV3 = 356;
  public static int FLD_NUMERAZIOIV3_ROWNAMEESERC = 0;
  public static int FLD_NUMERAZIOIV3_ROWNAMTIPREG = 1;
  public static int FLD_NUMERAZIOIV3_ROWNAMDALMES = 2;
  public static int FLD_NUMERAZIOIV3_ROWNAMTIPBOL = 3;

  // Definition of table: Numerazione I V A
  //
  public static int TBL_NUMERAZIOIVA = 357;
  public static int FLD_NUMERAZIOIVA_ROWNAMEESERC = 0;
  public static int FLD_NUMERAZIOIVA_ROWNAMTIPREG = 1;
  public static int FLD_NUMERAZIOIVA_ROWNAMTIPBOL = 2;
  public static int FLD_NUMERAZIOIVA_ROWNAMREGLIQ = 3;
  public static int FLD_NUMERAZIOIVA_ROWNAMEDATDA = 4;
  public static int FLD_NUMERAZIOIVA_ROWNAMEDATAA = 5;
  public static int FLD_NUMERAZIOIVA_ROWNAMEDESCR = 6;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE36 = 358;
  public static int FLD_NEWTABLE36_ROWNAMTIPREG = 0;
  public static int FLD_NEWTABLE36_ROWNAMTIPBOL = 1;
  public static int FLD_NEWTABLE36_ROWNAMEDATDA = 2;
  public static int FLD_NEWTABLE36_ROWNAMEDATAA = 3;
  public static int FLD_NEWTABLE36_ROWNAMEANNO = 4;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE38 = 359;
  public static int FLD_NEWTABLE38_ROWNAMTIPREG = 0;
  public static int FLD_NEWTABLE38_ROWNAMTIPBOL = 1;
  public static int FLD_NEWTABLE38_ROWNAMEANNO = 2;
  public static int FLD_NEWTABLE38_ROWNAMEDATDA = 3;
  public static int FLD_NEWTABLE38_ROWNAMEDATAA = 4;
  public static int FLD_NEWTABLE38_RONARIPEDIIN = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE39 = 360;
  public static int FLD_NEWTABLE39_ROWNAMTIPREG = 0;
  public static int FLD_NEWTABLE39_ROWNAMTIPBOL = 1;
  public static int FLD_NEWTABLE39_ROWNAMEANNO = 2;
  public static int FLD_NEWTABLE39_ROWNAMEDATDA = 3;
  public static int FLD_NEWTABLE39_ROWNAMEDATAA = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR68 = 361;
  public static int FLD_PAR68_ROWNAMTIPREG = 0;
  public static int FLD_PAR68_ROWNAMTIPBOL = 1;
  public static int FLD_PAR68_ROWNAMEANNO = 2;
  public static int FLD_PAR68_ROWNAMEDATDA = 3;
  public static int FLD_PAR68_ROWNAMEDATAA = 4;
  public static int FLD_PAR68_ROWNAMINTREG = 5;
  public static int FLD_PAR68_ROWNAMNUPRPA = 6;
  public static int FLD_PAR68_ROWNAMELENGH = 7;

  // Definition of table: Par
  //
  public static int TBL_PAR70 = 362;
  public static int FLD_PAR70_ROWNAMTIPREG = 0;
  public static int FLD_PAR70_ROWNAMTIPBOL = 1;
  public static int FLD_PAR70_ROWNAMEANNO = 2;
  public static int FLD_PAR70_ROWNAMEDATDA = 3;
  public static int FLD_PAR70_ROWNAMEDATAA = 4;
  public static int FLD_PAR70_ROWNAMINTREG = 5;
  public static int FLD_PAR70_ROWNAMNUPRPA = 6;
  public static int FLD_PAR70_ROWNAMELENGH = 7;

  // Definition of table: Registro Riepilogativo Acquisti Vendite
  //
  public static int TBL_REGRIEACQVE3 = 363;
  public static int FLD_REGRIEACQVE3_ROWNAMTIPRE1 = 0;
  public static int FLD_REGRIEACQVE3_ROWNAMEATTIV = 1;
  public static int FLD_REGRIEACQVE3_ROWNAMTIPATT = 2;
  public static int FLD_REGRIEACQVE3_ROWNAMINTREG = 3;
  public static int FLD_REGRIEACQVE3_ROWNAMNUPRPA = 4;
  public static int FLD_REGRIEACQVE3_ROWNAMELENGH = 5;
  public static int FLD_REGRIEACQVE3_ROWNAMEDATDA = 6;
  public static int FLD_REGRIEACQVE3_ROWNAMEDATAA = 7;
  public static int FLD_REGRIEACQVE3_ROWNAMTIPREG = 8;
  public static int FLD_REGRIEACQVE3_ROWNAMTIPBOL = 9;
  public static int FLD_REGRIEACQVE3_ROWNAMEANNO = 10;

  // Definition of table: Registro Riepilogativo Acquisti Vendite
  //
  public static int TBL_REGRIEACQVEN = 364;
  public static int FLD_REGRIEACQVEN_ROWNAMTIPRE1 = 0;
  public static int FLD_REGRIEACQVEN_ROWNAMEATTIV = 1;
  public static int FLD_REGRIEACQVEN_ROWNAMTIPATT = 2;
  public static int FLD_REGRIEACQVEN_ROWNAMINTREG = 3;
  public static int FLD_REGRIEACQVEN_ROWNAMNUPRPA = 4;
  public static int FLD_REGRIEACQVEN_ROWNAMELENGH = 5;
  public static int FLD_REGRIEACQVEN_ROWNAMEDATDA = 6;
  public static int FLD_REGRIEACQVEN_ROWNAMEDATAA = 7;
  public static int FLD_REGRIEACQVEN_ROWNAMTIPREG = 8;
  public static int FLD_REGRIEACQVEN_ROWNAMTIPBOL = 9;
  public static int FLD_REGRIEACQVEN_ROWNAMEANNO = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR108 = 365;
  public static int FLD_PAR108_ROWNAMTIPREG = 0;
  public static int FLD_PAR108_ROWNAMTIPBOL = 1;
  public static int FLD_PAR108_ROWNAMEANNO = 2;
  public static int FLD_PAR108_ROWNAMEDATDA = 3;
  public static int FLD_PAR108_ROWNAMEDATAA = 4;
  public static int FLD_PAR108_ROWNAMINTREG = 5;
  public static int FLD_PAR108_ROWNAMNUPRPA = 6;
  public static int FLD_PAR108_ROWNAMELENGH = 7;
  public static int FLD_PAR108_ROWNAMTIPATT = 8;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE41 = 366;
  public static int FLD_NEWTABLE41_ROWNAMSUPEBO = 0;
  public static int FLD_NEWTABLE41_ROWNASTIVAIN = 1;
  public static int FLD_NEWTABLE41_ROWNAMEDATDA = 2;
  public static int FLD_NEWTABLE41_ROWNAMEDATAA = 3;
  public static int FLD_NEWTABLE41_ROWNAMEANNO = 4;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE44 = 367;
  public static int FLD_NEWTABLE44_ROWNAMSUPEBO = 0;
  public static int FLD_NEWTABLE44_ROWNASTIVAIN = 1;
  public static int FLD_NEWTABLE44_ROWNAMEDATDA = 2;
  public static int FLD_NEWTABLE44_ROWNAMEDATAA = 3;
  public static int FLD_NEWTABLE44_ROWNAMEANNO = 4;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE45 = 368;
  public static int FLD_NEWTABLE45_RONAFAPANPDE = 0;
  public static int FLD_NEWTABLE45_RONAFAINNIDE = 1;
  public static int FLD_NEWTABLE45_ROWNAMTIPREG = 2;
  public static int FLD_NEWTABLE45_ROWNAMBOLDEF = 3;
  public static int FLD_NEWTABLE45_ROWNAMORDFAT = 4;
  public static int FLD_NEWTABLE45_ROWNAMORDFA1 = 5;
  public static int FLD_NEWTABLE45_ROWNAMEDATDA = 6;
  public static int FLD_NEWTABLE45_ROWNAMEDATAA = 7;
  public static int FLD_NEWTABLE45_ROWNAMEANNO = 8;
  public static int FLD_NEWTABLE45_ROWNAMETB = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI241 = 369;
  public static int FLD_PARAMETRI241_ROWNAMEDEBIT = 0;
  public static int FLD_PARAMETRI241_ROWNAMECREDI = 1;
  public static int FLD_PARAMETRI241_ROWNAMSOATTR = 2;
  public static int FLD_PARAMETRI241_RONAIMMADANV = 3;
  public static int FLD_PARAMETRI241_ROWNAMINTREG = 4;
  public static int FLD_PARAMETRI241_ROWNAMNUPRPA = 5;
  public static int FLD_PARAMETRI241_ROWNAMEDATDA = 6;
  public static int FLD_PARAMETRI241_ROWNAMEDATAA = 7;
  public static int FLD_PARAMETRI241_ROWNAMEANNO = 8;
  public static int FLD_PARAMETRI241_ROWNAMACCDOV = 9;
  public static int FLD_PARAMETRI241_ROWNAMSALRIS = 10;
  public static int FLD_PARAMETRI241_ROWNAMDESSTA = 11;
  public static int FLD_PARAMETRI241_ROWNAMSTAPRE = 12;
  public static int FLD_PARAMETRI241_ROWNAMMESTPR = 13;
  public static int FLD_PARAMETRI241_ROWNAMANSTPR = 14;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI243 = 370;
  public static int FLD_PARAMETRI243_ROWNAMEDEBIT = 0;
  public static int FLD_PARAMETRI243_ROWNAMECREDI = 1;
  public static int FLD_PARAMETRI243_ROWNAMSOATTR = 2;
  public static int FLD_PARAMETRI243_RONAIMMADANV = 3;
  public static int FLD_PARAMETRI243_ROWNAMINTREG = 4;
  public static int FLD_PARAMETRI243_ROWNAMNUPRPA = 5;
  public static int FLD_PARAMETRI243_ROWNAMEDATDA = 6;
  public static int FLD_PARAMETRI243_ROWNAMEDATAA = 7;
  public static int FLD_PARAMETRI243_ROWNAMEANNO = 8;
  public static int FLD_PARAMETRI243_ROWNAMIMPVER = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI588 = 371;
  public static int FLD_PARAMETRI588_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI588_ROWNAMPERTRI = 1;
  public static int FLD_PARAMETRI588_ROWNAMEDEBIT = 2;
  public static int FLD_PARAMETRI588_ROWNAMECREDI = 3;
  public static int FLD_PARAMETRI588_ROWNAMSOATTR = 4;
  public static int FLD_PARAMETRI588_RONAIMMADANV = 5;
  public static int FLD_PARAMETRI588_ROWNAMINTREG = 6;
  public static int FLD_PARAMETRI588_ROWNAMNUPRPA = 7;
  public static int FLD_PARAMETRI588_ROWNAMEDATDA = 8;
  public static int FLD_PARAMETRI588_ROWNAMEDATAA = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI589 = 372;
  public static int FLD_PARAMETRI589_NOMEOGGEESER = 0;
  public static int FLD_PARAMETRI589_NOMOGGPERTRI = 1;
  public static int FLD_PARAMETRI589_NOOGIMMADANV = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI536 = 373;
  public static int FLD_PARAMETRI536_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI536_ROWNAMTIVIME = 1;
  public static int FLD_PARAMETRI536_ROWNAMPERMES = 2;
  public static int FLD_PARAMETRI536_ROWNAMPERTRI = 3;
  public static int FLD_PARAMETRI536_ROWNAMEDATDA = 4;
  public static int FLD_PARAMETRI536_ROWNAMEDATAA = 5;
  public static int FLD_PARAMETRI536_ROWNAMECODIC = 6;
  public static int FLD_PARAMETRI536_ROWNAMTIPREG = 7;
  public static int FLD_PARAMETRI536_ROWNAMEATTIV = 8;

  // Definition of table: Estrazione Dati Per Controllo Iva
  //
  public static int TBL_ESTDATPECOIV = 374;
  public static int FLD_ESTDATPECOIV_NOMOGGRAGSOC = 0;
  public static int FLD_ESTDATPECOIV_NOMEOGGECODI = 1;
  public static int FLD_ESTDATPECOIV_NOMOGGNUMDOC = 2;
  public static int FLD_ESTDATPECOIV_NOMOGGDATDOC = 3;
  public static int FLD_ESTDATPECOIV_NOMOGGDESDOC = 4;
  public static int FLD_ESTDATPECOIV_NOMEOGGEBOLL = 5;
  public static int FLD_ESTDATPECOIV_NOMOGGDESBOL = 6;
  public static int FLD_ESTDATPECOIV_NOMEOGGETIST = 7;
  public static int FLD_ESTDATPECOIV_NOMOGGNUMREG = 8;
  public static int FLD_ESTDATPECOIV_NOMOGGDATREG = 9;
  public static int FLD_ESTDATPECOIV_NOMEOGGEIMPO = 10;
  public static int FLD_ESTDATPECOIV_NOMEOGGETIVA = 11;
  public static int FLD_ESTDATPECOIV_NOMEOGGEPERC = 12;
  public static int FLD_ESTDATPECOIV_NOMEOGGEESEN = 13;
  public static int FLD_ESTDATPECOIV_NOMEOGGEINDE = 14;
  public static int FLD_ESTDATPECOIV_NOMEOGGESPRC = 15;
  public static int FLD_ESTDATPECOIV_NOMEOGGEPROR = 16;
  public static int FLD_ESTDATPECOIV_NOMEOGGECRED = 17;
  public static int FLD_ESTDATPECOIV_NOMEOGGEDEBI = 18;
  public static int FLD_ESTDATPECOIV_NOMEOGGEDIFF = 19;
  public static int FLD_ESTDATPECOIV_NOMOGGATTTRI = 20;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI563 = 375;
  public static int FLD_PARAMETRI563_NOMOGGTIPREG = 0;
  public static int FLD_PARAMETRI563_NOMOGGTIPBOL = 1;
  public static int FLD_PARAMETRI563_NOMEOGGETTES = 2;
  public static int FLD_PARAMETRI563_NOMEOGGEPROP = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI691 = 376;
  public static int FLD_PARAMETRI691_NOMOGGDATREG = 0;
  public static int FLD_PARAMETRI691_NOMEOGGDATDA = 1;
  public static int FLD_PARAMETRI691_NOMEOGGEDATA = 2;
  public static int FLD_PARAMETRI691_NOMOGGTIPREG = 3;
  public static int FLD_PARAMETRI691_NOMOGGTIPBOL = 4;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE29 = 377;
  public static int FLD_NEWTABLE29_ROWNAMEOLDBE = 0;
  public static int FLD_NEWTABLE29_ROWNAMEFATTO = 1;
  public static int FLD_NEWTABLE29_ROWNAMECENTR = 2;
  public static int FLD_NEWTABLE29_ROWNAMEMODIM = 3;
  public static int FLD_NEWTABLE29_ROWNAMEGESTE = 4;
  public static int FLD_NEWTABLE29_ROWNAMANNIMP = 5;
  public static int FLD_NEWTABLE29_ROWNAMNUMIMP = 6;
  public static int FLD_NEWTABLE29_ROWNAMANNSUB = 7;
  public static int FLD_NEWTABLE29_ROWNAMNUMSUB = 8;
  public static int FLD_NEWTABLE29_ROWNAMEBEN = 9;
  public static int FLD_NEWTABLE29_ROWNAMPEROLD = 10;

  // Definition of table: IMP CONT
  //
  public static int TBL_IMPCONT = 378;
  public static int FLD_IMPCONT_TIPO_UTENZA = 0;
  public static int FLD_IMPCONT_CODICE_UTENZA = 1;
  public static int FLD_IMPCONT_PROGRESSIVO = 2;
  public static int FLD_IMPCONT_PERCENTUALE = 3;
  public static int FLD_IMPCONT_ESERCIZIO = 4;
  public static int FLD_IMPCONT_S = 5;
  public static int FLD_IMPCONT_CAPITOLO = 6;
  public static int FLD_IMPCONT_ARTICOLO = 7;
  public static int FLD_IMPCONT_ANNO_IMP = 8;
  public static int FLD_IMPCONT_NUMERO_IMP = 9;
  public static int FLD_IMPCONT_ANNO_SUBIMP = 10;
  public static int FLD_IMPCONT_NUMERO_SUBIMP = 11;
  public static int FLD_IMPCONT_SE_SUBIMPEGNO = 12;
  public static int FLD_IMPCONT_CENTRO = 13;
  public static int FLD_IMPCONT_COMPETENZA_DAL = 14;
  public static int FLD_IMPCONT_COMPETENZA_AL = 15;
  public static int FLD_IMPCONT_FATTORE = 16;
  public static int FLD_IMPCONT_UTENTE_INSERIMENTO = 17;
  public static int FLD_IMPCONT_DATA_INSERIMENTO = 18;
  public static int FLD_IMPCONT_UTENTE_ULTIMO_AGG = 19;
  public static int FLD_IMPCONT_DATA_ULTIMO_AGG = 20;
  public static int FLD_IMPCONT_IMPCONTSTATO = 21;
  public static int FLD_IMPCONT_IMPCONINTOLD = 22;
  public static int FLD_IMPCONT_IMPCONCAPOLD = 23;
  public static int FLD_IMPCONT_IMPCONARTOLD = 24;
  public static int FLD_IMPCONT_IMPCONANIMOL = 25;
  public static int FLD_IMPCONT_IMPCONNUIMOL = 26;
  public static int FLD_IMPCONT_IMPCONANSUOL = 27;
  public static int FLD_IMPCONT_IMPCONNUSUOL = 28;

  // Definition of table: Param
  //
  public static int TBL_PARAM95 = 379;
  public static int FLD_PARAM95_NOMOGGNUODIS = 0;
  public static int FLD_PARAM95_NOMOGGDIGIEM = 1;
  public static int FLD_PARAM95_NOMOGGSCADAL = 2;
  public static int FLD_PARAM95_NOMEOGGSCAAL = 3;
  public static int FLD_PARAM95_NOMOGGDATDIS = 4;
  public static int FLD_PARAM95_NOMEOGGDANUM = 5;
  public static int FLD_PARAM95_NOMEOGGEDISN = 6;
  public static int FLD_PARAM95_NOMEOGGETDEL = 7;
  public static int FLD_PARAM95_NOMEOGGEUTEN = 8;
  public static int FLD_PARAM95_NOMEOGGEDESC = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI408 = 380;
  public static int FLD_PARAMETRI408_PARANUMEDIST = 0;
  public static int FLD_PARAMETRI408_PARAANNODIST = 1;
  public static int FLD_PARAMETRI408_SEDE_DEL = 2;
  public static int FLD_PARAMETRI408_NUMERO_DEL = 3;
  public static int FLD_PARAMETRI408_ANNO_DEL = 4;
  public static int FLD_PARAMETRI408_UNITA_PROPONENTE = 5;
  public static int FLD_PARAMETRI408_NUMERO_PROPOSTA = 6;
  public static int FLD_PARAMETRI408_ANNO_PROPOSTA = 7;
  public static int FLD_PARAMETRI408_DESCRIZIONE = 8;
  public static int FLD_PARAMETRI408_UFFICIO = 9;
  public static int FLD_PARAMETRI408_CAUSALE = 10;
  public static int FLD_PARAMETRI408_BOLLO = 11;
  public static int FLD_PARAMETRI408_PARAMINEMISS = 12;
  public static int FLD_PARAMETRI408_PARADATACONT = 13;
  public static int FLD_PARAMETRI408_SPESE = 14;
  public static int FLD_PARAMETRI408_PARAMSCADENZ = 15;
  public static int FLD_PARAMETRI408_ALLEGATI = 16;
  public static int FLD_PARAMETRI408_PARAMCOMPDAL = 17;
  public static int FLD_PARAMETRI408_PARAMCOMPAL = 18;
  public static int FLD_PARAMETRI408_PARAMNUMCONT = 19;
  public static int FLD_PARAMETRI408_PARDESDADEUT = 20;
  public static int FLD_PARAMETRI408_PARADISTANNO = 21;
  public static int FLD_PARAMETRI408_PARAMDISTINN = 22;
  public static int FLD_PARAMETRI408_PARAMDEL = 23;
  public static int FLD_PARAMETRI408_PARSOLCONDIS = 24;
  public static int FLD_PARAMETRI408_PARAMUTENZA = 25;
  public static int FLD_PARAMETRI408_PARAMBENEFIC = 26;
  public static int FLD_PARAMETRI408_PARAMQUIETAN = 27;
  public static int FLD_PARAMETRI408_PAROLDNUMDIS = 28;
  public static int FLD_PARAMETRI408_PAROLDANNDIS = 29;
  public static int FLD_PARAMETRI408_PARADESCUTEN = 30;
  public static int FLD_PARAMETRI408_PARAMESCLCIG = 31;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI539 = 381;
  public static int FLD_PARAMETRI539_PARAMLIQDA = 0;
  public static int FLD_PARAMETRI539_PARAMLIQA = 1;

  // Definition of table: Parameters
  //
  public static int TBL_PARAMETERS = 382;
  public static int FLD_PARAMETERS_PARADATAEMIS = 0;
  public static int FLD_PARAMETERS_PARAMECATEGO = 1;
  public static int FLD_PARAMETERS_PARADATAPROT = 2;
  public static int FLD_PARAMETERS_PARAMEDESCRI = 3;
  public static int FLD_PARAMETERS_PARAMCOMPDAL = 4;
  public static int FLD_PARAMETERS_PARAMCOMPEAL = 5;
  public static int FLD_PARAMETERS_PARAEMISLIQU = 6;
  public static int FLD_PARAMETERS_PARSOLCONDIS = 7;
  public static int FLD_PARAMETERS_PARAMSEDEDEL = 8;
  public static int FLD_PARAMETERS_PARAMNUMEDEL = 9;
  public static int FLD_PARAMETERS_PARAMANNODEL = 10;
  public static int FLD_PARAMETERS_PARAMEDESCR1 = 11;
  public static int FLD_PARAMETERS_PARAMEUFFICI = 12;
  public static int FLD_PARAMETERS_PARAMECAUSAL = 13;
  public static int FLD_PARAMETERS_PARAMETBOLLO = 14;
  public static int FLD_PARAMETERS_PARAMNUMCONT = 15;
  public static int FLD_PARAMETERS_PARADATACONT = 16;
  public static int FLD_PARAMETERS_PARAMINEMISS = 17;
  public static int FLD_PARAMETERS_PARAMEUTENZA = 18;
  public static int FLD_PARAMETERS_PARACODIUTEN = 19;
  public static int FLD_PARAMETERS_PARDESDADEUT = 20;
  public static int FLD_PARAMETERS_PARACOMPDAL1 = 21;
  public static int FLD_PARAMETERS_PARAMCOMPAL1 = 22;
  public static int FLD_PARAMETERS_PARAMEPERCOR = 23;
  public static int FLD_PARAMETERS_PARAMEBLOBIN = 24;
  public static int FLD_PARAMETERS_progr = 25;
  public static int FLD_PARAMETERS_PARADATAARRI = 26;
  public static int FLD_PARAMETERS_PARNUMPROGEN = 27;

  // Definition of table: Param
  //
  public static int TBL_PARAM65 = 383;
  public static int FLD_PARAM65_ROWNAMEUTENZ = 0;
  public static int FLD_PARAM65_ROWNAMCODUTE = 1;
  public static int FLD_PARAM65_ROWNAMEPERCO = 2;
  public static int FLD_PARAM65_ROWNAMEBLOBI = 3;
  public static int FLD_PARAM65_ROWNAMEPROGR = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM38 = 384;
  public static int FLD_PARAM38_ROWNAMAPARDA = 0;
  public static int FLD_PARAM38_ROWNAMEBOLLA = 1;
  public static int FLD_PARAM38_ROWNAMOLDARE = 2;
  public static int FLD_PARAM38_ROWNAMOLTIBO = 3;
  public static int FLD_PARAM38_ROWNAMOLVOPE = 4;
  public static int FLD_PARAM38_ROWNAMOLDACC = 5;
  public static int FLD_PARAM38_ROWNAMOLDALI = 6;
  public static int FLD_PARAM38_ROWNAMOLDESE = 7;
  public static int FLD_PARAM38_ROWNAMOLDIMP = 8;
  public static int FLD_PARAM38_ROWNAMEPERSO = 9;
  public static int FLD_PARAM38_ROWNAMEUPDAT = 10;
  public static int FLD_PARAM38_ROWNAMTIPBOL = 11;
  public static int FLD_PARAM38_ROWNAMTIPREG = 12;
  public static int FLD_PARAM38_ROWNAMANNREG = 13;
  public static int FLD_PARAM38_ROWNAMNUMREG = 14;

  // Definition of table: Corrispettivi
  //
  public static int TBL_CORRISPETTIV = 385;
  public static int FLD_CORRISPETTIV_ANNO_REG = 0;
  public static int FLD_CORRISPETTIV_NUMERO_REG = 1;
  public static int FLD_CORRISPETTIV_DATA_REG = 2;
  public static int FLD_CORRISPETTIV_CONTO_RICAVO = 3;
  public static int FLD_CORRISPETTIV_CENTRO_COSTO = 4;
  public static int FLD_CORRISPETTIV_TIPO_BOLLATO = 5;
  public static int FLD_CORRISPETTIV_CODICE_RECORD = 6;
  public static int FLD_CORRISPETTIV_ESERCIZIO = 7;
  public static int FLD_CORRISPETTIV_CAPITOLO = 8;
  public static int FLD_CORRISPETTIV_ARTICOLO = 9;
  public static int FLD_CORRISPETTIV_ANNO_ACC = 10;
  public static int FLD_CORRISPETTIV_NUMERO_ACC = 11;
  public static int FLD_CORRISPETTIV_DESCRIZIONE = 12;
  public static int FLD_CORRISPETTIV_ANNO_ORD = 13;
  public static int FLD_CORRISPETTIV_NUMERO_ORD = 14;
  public static int FLD_CORRISPETTIV_IVA_DEF = 15;
  public static int FLD_CORRISPETTIV_PASSATO_CDR = 16;
  public static int FLD_CORRISPETTIV_ANNO_PRE = 17;
  public static int FLD_CORRISPETTIV_NUMERO_PRE = 18;
  public static int FLD_CORRISPETTIV_E = 19;
  public static int FLD_CORRISPETTIV_TIPO_REGISTRO = 20;
  public static int FLD_CORRISPETTIV_D_DATA_REG = 21;
  public static int FLD_CORRISPETTIV_CENTRO = 22;
  public static int FLD_CORRISPETTIV_FATTORE = 23;
  public static int FLD_CORRISPETTIV_COMPETENZA_DAL = 24;
  public static int FLD_CORRISPETTIV_COMPETENZA_AL = 25;
  public static int FLD_CORRISPETTIV_DATA_ESTRATTO_CCP = 26;
  public static int FLD_CORRISPETTIV_DATA_CCP = 27;
  public static int FLD_CORRISPETTIV_NUMERO_CONTABILE = 28;
  public static int FLD_CORRISPETTIV_TIPO_QUIETANZA = 29;
  public static int FLD_CORRISPETTIV_DATA_CONTABILE = 30;
  public static int FLD_CORRISPETTIV_UTENTE_INSERIMENTO = 31;
  public static int FLD_CORRISPETTIV_DATA_INSERIMENTO = 32;
  public static int FLD_CORRISPETTIV_UTENTE_ULTIMO_AGG = 33;
  public static int FLD_CORRISPETTIV_DATA_ULTIMO_AGG = 34;

  // Definition of table: Param
  //
  public static int TBL_PARAM57 = 386;
  public static int FLD_PARAM57_ROWNAMTIPBOL = 0;
  public static int FLD_PARAM57_ROWNAMTIPREG = 1;
  public static int FLD_PARAM57_ROWNAMANNREG = 2;
  public static int FLD_PARAM57_ROWNAMNUMREG = 3;
  public static int FLD_PARAM57_ROWNAMEPERSO = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM105 = 387;
  public static int FLD_PARAM105_NOMOGGTIPBOL = 0;
  public static int FLD_PARAM105_NOMEOGGETDAL = 1;
  public static int FLD_PARAM105_NOMEOGGETTAL = 2;
  public static int FLD_PARAM105_NOMOGGNUOBOL = 3;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM31 = 388;
  public static int FLD_PARAMESTAM31_PARSTAANNDIS = 0;
  public static int FLD_PARAMESTAM31_PARSTANUMDIS = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI611 = 389;
  public static int FLD_PARAMETRI611_PARAMAGGIORN = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI603 = 390;
  public static int FLD_PARAMETRI603_PARAMDATADAL = 0;
  public static int FLD_PARAMETRI603_PARAMDATAAL = 1;
  public static int FLD_PARAMETRI603_PARAMDATADOC = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI605 = 391;
  public static int FLD_PARAMETRI605_PARAMDOCELAB = 0;
  public static int FLD_PARAMETRI605_PARANOMEFILE = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI627 = 392;
  public static int FLD_PARAMETRI627_PARAFILEINVI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI619 = 393;
  public static int FLD_PARAMETRI619_PARAMNUMDOC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI618 = 394;
  public static int FLD_PARAMETRI618_PARDATRIFSCA = 0;
  public static int FLD_PARAMETRI618_PARADATEMIAL = 1;
  public static int FLD_PARAMETRI618_PARSOLSCAAUT = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI609 = 395;
  public static int FLD_PARAMETRI609_PARAMDATA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI612 = 396;
  public static int FLD_PARAMETRI612_NOME_FILE = 0;
  public static int FLD_PARAMETRI612_NOTE = 1;
  public static int FLD_PARAMETRI612_DATA_ULTIMA_VARIAZIONE = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI601 = 397;
  public static int FLD_PARAMETRI601_PARAMAZIONE = 0;
  public static int FLD_PARAMETRI601_PARDATSELDOC = 1;
  public static int FLD_PARAMETRI601_PARADATANECE = 2;
  public static int FLD_PARAMETRI601_PARSTRDOCSEL = 3;
  public static int FLD_PARAMETRI601_PARNUMDOCSEL = 4;
  public static int FLD_PARAMETRI601_PARTIPPROREG = 5;
  public static int FLD_PARAMETRI601_PARINCDOCPAG = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI607 = 398;
  public static int FLD_PARAMETRI607_PARAMAZIONE = 0;
  public static int FLD_PARAMETRI607_PARAMNOTE = 1;
  public static int FLD_PARAMETRI607_PARAMDOCSEL = 2;
  public static int FLD_PARAMETRI607_PARNUMDOCSEL = 3;
  public static int FLD_PARAMETRI607_PARASTEPINIZ = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI628 = 399;
  public static int FLD_PARAMETRI628_PARAMSOGGETT = 0;
  public static int FLD_PARAMETRI628_PARAMNUMEDOC = 1;
  public static int FLD_PARAMETRI628_PARAMDATADOC = 2;
  public static int FLD_PARAMETRI628_PARANUMEPROT = 3;
  public static int FLD_PARAMETRI628_PARADATAPROT = 4;
  public static int FLD_PARAMETRI628_PARAPROGREGI = 5;
  public static int FLD_PARAMETRI628_PARAMSEMODIF = 6;
  public static int FLD_PARAMETRI628_PARAUTENMODI = 7;
  public static int FLD_PARAMETRI628_PARADATAMODI = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI629 = 400;
  public static int FLD_PARAMETRI629_PARNOMFIDAAG = 0;
  public static int FLD_PARAMETRI629_PARAFILDAIMP = 1;
  public static int FLD_PARAMETRI629_PARABLOBINSE = 2;
  public static int FLD_PARAMETRI629_PARAPERCFILE = 3;

}
