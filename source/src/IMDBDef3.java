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
public class IMDBDef3 extends Object
{
	// IMDB Constants
  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI630 = 401;
  public static int FLD_PARAMETRI630_PARAPROGREGI = 0;
  public static int FLD_PARAMETRI630_PARAMSCELTA = 1;
  public static int FLD_PARAMETRI630_PARANOMEFILE = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI631 = 402;
  public static int FLD_PARAMETRI631_PARAANNOPROG = 0;
  public static int FLD_PARAMETRI631_PARANUMEPROG = 1;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO6 = 403;
  public static int FLD_FILTRO6_ROWNAMENTESP = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI287 = 404;
  public static int FLD_PARAMETRI287_ROWNAMENTSPE = 0;
  public static int FLD_PARAMETRI287_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRI287_ROWNAMEARTIC = 2;
  public static int FLD_PARAMETRI287_ROWNAMETIPON = 3;
  public static int FLD_PARAMETRI287_ROWNAMEINFO = 4;

  // Definition of table: Originalvalues
  //
  public static int TBL_ORIGINALVALU = 405;
  public static int FLD_ORIGINALVALU_ROWNAMETITOL = 0;
  public static int FLD_ORIGINALVALU_ROWNAMECATEG = 1;
  public static int FLD_ORIGINALVALU_ROWNAMCODINT = 2;
  public static int FLD_ORIGINALVALU_ROWNAMEFUNZI = 3;
  public static int FLD_ORIGINALVALU_ROWNAMESERVI = 4;
  public static int FLD_ORIGINALVALU_ROWNAMVOCECO = 5;
  public static int FLD_ORIGINALVALU_ROWNAMCODGES = 6;
  public static int FLD_ORIGINALVALU_ROWNAMCODTER = 7;
  public static int FLD_ORIGINALVALU_ROWNAMEDESCR = 8;
  public static int FLD_ORIGINALVALU_ROWNAMDESABB = 9;
  public static int FLD_ORIGINALVALU_ROWNAMEPROGR = 10;
  public static int FLD_ORIGINALVALU_ROWNAMEPROGE = 11;
  public static int FLD_ORIGINALVALU_ROWNAMTIPVIN = 12;
  public static int FLD_ORIGINALVALU_ROWNAMTIPAVA = 13;
  public static int FLD_ORIGINALVALU_ROWNAMEFLESS = 14;
  public static int FLD_ORIGINALVALU_ROWNAMEIVA = 15;
  public static int FLD_ORIGINALVALU_ROWNAMCONCOM = 16;
  public static int FLD_ORIGINALVALU_ROWNAMFUNDEL = 17;
  public static int FLD_ORIGINALVALU_ROWNAMSTDEMA = 18;
  public static int FLD_ORIGINALVALU_ROWNAMEFATTO = 19;
  public static int FLD_ORIGINALVALU_ROWNAMECENTR = 20;
  public static int FLD_ORIGINALVALU_ROWNAMEVOCPC = 21;
  public static int FLD_ORIGINALVALU_ROWNAMEGRUCP = 22;
  public static int FLD_ORIGINALVALU_ROWNAMEGRUCC = 23;
  public static int FLD_ORIGINALVALU_ROWNAMEANNOT = 24;
  public static int FLD_ORIGINALVALU_CODICE_STRUTTURA = 25;
  public static int FLD_ORIGINALVALU_ROWNAMCODEUR = 26;
  public static int FLD_ORIGINALVALU_ROWNAMENNORI = 27;
  public static int FLD_ORIGINALVALU_ROWNAMCEDICO = 28;
  public static int FLD_ORIGINALVALU_CDR_IMP = 29;
  public static int FLD_ORIGINALVALU_ROWNAMFORICA = 30;
  public static int FLD_ORIGINALVALU_ROWNAMECOFOG = 31;
  public static int FLD_ORIGINALVALU_ROWNAMELIVE4 = 32;
  public static int FLD_ORIGINALVALU_ROWNAMELIVE5 = 33;

  // Definition of table: Old Values
  //
  public static int TBL_OLDVALUES1 = 406;
  public static int FLD_OLDVALUES1_ROWNAMETITOL = 0;
  public static int FLD_OLDVALUES1_ROWNAMCODINT = 1;
  public static int FLD_OLDVALUES1_ROWNAMEFUNZI = 2;
  public static int FLD_OLDVALUES1_ROWNAMVOCECO = 3;
  public static int FLD_OLDVALUES1_ROWNAMECATEG = 4;
  public static int FLD_OLDVALUES1_ROWNAMCODTER = 5;
  public static int FLD_OLDVALUES1_ROWNAMECAPIT = 6;
  public static int FLD_OLDVALUES1_ROWNAMECODIC = 7;

  // Definition of table: Cap UO IMDB
  //
  public static int TBL_CAPUOIMDB2 = 407;
  public static int FLD_CAPUOIMDB2_ESERCIZIO = 0;
  public static int FLD_CAPUOIMDB2_E_S = 1;
  public static int FLD_CAPUOIMDB2_CAPITOLO = 2;
  public static int FLD_CAPUOIMDB2_ARTICOLO = 3;
  public static int FLD_CAPUOIMDB2_PROGR_UNITA_ORGANIZZATIVA = 4;
  public static int FLD_CAPUOIMDB2_TIPO_UNITA_ORGANIZZATIVA = 5;
  public static int FLD_CAPUOIMDB2_SCADENZA = 6;
  public static int FLD_CAPUOIMDB2_UTENTE_INSERIMENTO = 7;
  public static int FLD_CAPUOIMDB2_DATA_INSERIMENTO = 8;
  public static int FLD_CAPUOIMDB2_UTENTE_ULTIMO_AGG = 9;
  public static int FLD_CAPUOIMDB2_DATA_ULTIMO_AGG = 10;
  public static int FLD_CAPUOIMDB2_PREVALENTE = 11;
  public static int FLD_CAPUOIMDB2_CAPUOIMDBSTA = 12;

  // Definition of table: Paramentri
  //
  public static int TBL_PARAMENTRI = 408;

  // Definition of table: PIANO DEI CONTI
  //
  public static int TBL_PIANODEICONT = 409;
  public static int FLD_PIANODEICONT_CAPITOLO = 0;
  public static int FLD_PIANODEICONT_ARTICOLO = 1;
  public static int FLD_PIANODEICONT_E_S = 2;
  public static int FLD_PIANODEICONT_ESERCIZIO = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI116 = 410;
  public static int FLD_PARAMETRI116_ROWNAMIMPSUB = 0;
  public static int FLD_PARAMETRI116_ROWNAMEACCER = 1;
  public static int FLD_PARAMETRI116_ROWNAMELIQUI = 2;
  public static int FLD_PARAMETRI116_ROWNAMEORDIN = 3;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM12 = 411;
  public static int FLD_PARAMESTAM12_PARSTAVOCPEG = 0;
  public static int FLD_PARAMESTAM12_PARSTAANUOSC = 1;
  public static int FLD_PARAMESTAM12_PARASTAMTIPO = 2;
  public static int FLD_PARAMESTAM12_PARASTAMPART = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS14 = 412;
  public static int FLD_PARS14_NOMEOGGETTES = 0;
  public static int FLD_PARS14_NOMEOGGECAPI = 1;
  public static int FLD_PARS14_NOMEOGGEARTI = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM17 = 413;
  public static int FLD_PARAM17_PARTE = 0;
  public static int FLD_PARAM17_PARCONOSENFI = 1;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO15 = 414;
  public static int FLD_FILTRO15_ROWNAMENTSPE = 0;
  public static int FLD_FILTRO15_RONASOCADACO = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM127 = 415;
  public static int FLD_PARAM127_PARAMESERCIZ = 0;
  public static int FLD_PARAM127_PARAMES = 1;
  public static int FLD_PARAM127_PARARISOINTE = 2;
  public static int FLD_PARAM127_PARAMCAPITOL = 3;
  public static int FLD_PARAM127_PARAMARTICOL = 4;
  public static int FLD_PARAM127_PARAMCAPIARM = 5;
  public static int FLD_PARAM127_PARAMARTIARM = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI475 = 416;
  public static int FLD_PARAMETRI475_NOMEOGGEESER = 0;
  public static int FLD_PARAMETRI475_NOMEOGGETTES = 1;
  public static int FLD_PARAMETRI475_NOMEOGGECAPI = 2;
  public static int FLD_PARAMETRI475_NOMEOGGEARTI = 3;

  // Definition of table: Pannello Opzioni
  //
  public static int TBL_PANNELOPZIO3 = 417;
  public static int FLD_PANNELOPZIO3_NOMOGGATDAMO = 0;
  public static int FLD_PANNELOPZIO3_NOOGAGATSUMO = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI482 = 418;
  public static int FLD_PARAMETRI482_PARAMCAPITOL = 0;
  public static int FLD_PARAMETRI482_PARAMARTICOL = 1;
  public static int FLD_PARAMETRI482_PARAMES = 2;
  public static int FLD_PARAMETRI482_PARAMPROGUOG = 3;
  public static int FLD_PARAMETRI482_PARNUOPROUOG = 4;
  public static int FLD_PARAMETRI482_PARAANCUOUTI = 5;
  public static int FLD_PARAMETRI482_PARAMPROGUOU = 6;
  public static int FLD_PARAMETRI482_PARNUOPROUOU = 7;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL8 = 419;
  public static int FLD_PARAMETRIOL8_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIOL8_ARTICOLOOLD = 1;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO17 = 420;
  public static int FLD_FILTRO17_NOMOGGENTESP = 0;
  public static int FLD_FILTRO17_NOOGTICOPICO = 1;
  public static int FLD_FILTRO17_NOMOGGGESUTI = 2;
  public static int FLD_FILTRO17_NOMEOGGUOSCA = 3;
  public static int FLD_FILTRO17_NOMOGGCAPSOT = 4;

  // Definition of table: Anomalie Assoc
  //
  public static int TBL_ANOMALIASSOC = 421;
  public static int FLD_ANOMALIASSOC_NOMEOGGEESER = 0;
  public static int FLD_ANOMALIASSOC_NOMEOGGECAPI = 1;
  public static int FLD_ANOMALIASSOC_NOMEOGGEARTI = 2;
  public static int FLD_ANOMALIASSOC_NOMEOGGEFATT = 3;
  public static int FLD_ANOMALIASSOC_NOMEOGGEANOM = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM166 = 422;
  public static int FLD_PARAM166_NOMEOGGETTES = 0;
  public static int FLD_PARAM166_NOMOGGCASEFA = 1;
  public static int FLD_PARAM166_NOMOGGCASECE = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS63 = 423;
  public static int FLD_PARS63_NOMEOGGECENT = 0;
  public static int FLD_PARS63_NOMOGGANESSU = 1;
  public static int FLD_PARS63_NOMEOGGERISP = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI457 = 424;
  public static int FLD_PARAMETRI457_ROWNAMENTSPE = 0;
  public static int FLD_PARAMETRI457_ROWNAMEFATTO = 1;
  public static int FLD_PARAMETRI457_ROWNAMECENTR = 2;
  public static int FLD_PARAMETRI457_RONASOCOIMEC = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS69 = 425;
  public static int FLD_PARS69_NOMEOGGETTES = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS71 = 426;
  public static int FLD_PARS71_NOMEOGGETTES = 0;
  public static int FLD_PARS71_NOMOGGDATDAL = 1;
  public static int FLD_PARS71_NOMEOGGDATAL = 2;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB6 = 427;
  public static int FLD_IMDB6_NOMOGGTIPMOV = 0;
  public static int FLD_IMDB6_NOOGSOMOSEIM = 1;
  public static int FLD_IMDB6_NOMOGGQUALIV = 2;
  public static int FLD_IMDB6_NOMOGGQUILIV = 3;
  public static int FLD_IMDB6_NOMEOGGENUMR = 4;
  public static int FLD_IMDB6_NOMEOGGECODI = 5;
  public static int FLD_IMDB6_NOMOGGANNIMP = 6;
  public static int FLD_IMDB6_NOMOGGNUMIMP = 7;
  public static int FLD_IMDB6_NOMOGGANNSUB = 8;
  public static int FLD_IMDB6_NOMOGGNUMSUB = 9;
  public static int FLD_IMDB6_NOMOGGANNLIQ = 10;
  public static int FLD_IMDB6_NOMOGGNUMLIQ = 11;
  public static int FLD_IMDB6_NOMOGGANNMAN = 12;
  public static int FLD_IMDB6_NOMOGGNUMMAN = 13;
  public static int FLD_IMDB6_NOMEOGGESELE = 14;
  public static int FLD_IMDB6_NOMEOGGEFATT = 15;
  public static int FLD_IMDB6_NOMEOGGECENT = 16;
  public static int FLD_IMDB6_NOMOGGCOMDAL = 17;
  public static int FLD_IMDB6_NOMEOGGCOMAL = 18;

  // Definition of table: IMDB Pars
  //
  public static int TBL_IMDBPARS = 428;
  public static int FLD_IMDBPARS_NOMEOGGEFATT = 0;
  public static int FLD_IMDBPARS_NOMEOGGECENT = 1;
  public static int FLD_IMDBPARS_NOMOGGCOMDAL = 2;
  public static int FLD_IMDBPARS_NOMEOGGCOMAL = 3;
  public static int FLD_IMDBPARS_NOMEOGGETTES = 4;
  public static int FLD_IMDBPARS_NOMOGGQUALIV = 5;
  public static int FLD_IMDBPARS_NOMOGGQUILIV = 6;
  public static int FLD_IMDBPARS_NOMOGGCEDICO = 7;
  public static int FLD_IMDBPARS_NOMOGGFATOLD = 8;

  // Definition of table: IN
  //
  public static int TBL_IN18 = 429;
  public static int FLD_IN18_NOMEOGGEESER = 0;
  public static int FLD_IN18_NOMEOGGETTES = 1;
  public static int FLD_IN18_NOMEOGGECAPI = 2;
  public static int FLD_IN18_NOMEOGGEARTI = 3;

  // Definition of table: Appoggiorettifica
  //
  public static int TBL_APPOGGIORETT = 430;
  public static int FLD_APPOGGIORETT_NOMEOGGETABE = 0;
  public static int FLD_APPOGGIORETT_NOMEOGGEESER = 1;
  public static int FLD_APPOGGIORETT_NOMEOGGETTES = 2;
  public static int FLD_APPOGGIORETT_NOMEOGGECAPI = 3;
  public static int FLD_APPOGGIORETT_NOMEOGGEARTI = 4;
  public static int FLD_APPOGGIORETT_NOMEOGGPROUO = 5;
  public static int FLD_APPOGGIORETT_NOMEOGGTIPUO = 6;

  // Definition of table: Parametrisceltauo
  //
  public static int TBL_PARAMETRISC1 = 431;
  public static int FLD_PARAMETRISC1_NOMEOGGTIPUO = 0;

  // Definition of table: Scelta UO
  //
  public static int TBL_SCELTAUO1 = 432;
  public static int FLD_SCELTAUO1_NOMEOGGPROUO = 0;

  // Definition of table: Parametrisceltauo
  //
  public static int TBL_PARAMETRISCE = 433;
  public static int FLD_PARAMETRISCE_NOMEOGGTIPUO = 0;

  // Definition of table: Sceltauo
  //
  public static int TBL_SCELTAUO = 434;
  public static int FLD_SCELTAUO_NOMEOGGPROUO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI590 = 435;
  public static int FLD_PARAMETRI590_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI590_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI590_PARAMARTICOL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI635 = 436;
  public static int FLD_PARAMETRI635_PARAMTIPO = 0;
  public static int FLD_PARAMETRI635_PARAMOTTIOLD = 1;
  public static int FLD_PARAMETRI635_PARAMOTTINEW = 2;
  public static int FLD_PARAMETRI635_PARAMSCADEUO = 3;
  public static int FLD_PARAMETRI635_PARSOLCACOUO = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI638 = 437;
  public static int FLD_PARAMETRI638_PARAMOTTIOLD = 0;
  public static int FLD_PARAMETRI638_PARAMOTTINEW = 1;
  public static int FLD_PARAMETRI638_PARSOLUOGEVU = 2;
  public static int FLD_PARAMETRI638_PARSOLUOUTVU = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI637 = 438;
  public static int FLD_PARAMETRI637_PARAMOTTINEW = 0;
  public static int FLD_PARAMETRI637_PARACKUOGEST = 1;
  public static int FLD_PARAMETRI637_PARAMUOGESTI = 2;
  public static int FLD_PARAMETRI637_PARACKUOUTIL = 3;
  public static int FLD_PARAMETRI637_PARAMUOUTILI = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI641 = 439;
  public static int FLD_PARAMETRI641_PARACOPCOMUO = 0;
  public static int FLD_PARAMETRI641_PARAMOTTINEW = 1;

  // Definition of table: Pannello Opzioni
  //
  public static int TBL_PANNELOPZIO5 = 440;
  public static int FLD_PANNELOPZIO5_NOMOGGESESUC = 0;

  // Definition of table: Pannello Opzioni
  //
  public static int TBL_PANNELOPZION = 441;
  public static int FLD_PANNELOPZION_NOMOGGESESUC = 0;
  public static int FLD_PANNELOPZION_NOMOGGTIPAVA = 1;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI16 = 442;
  public static int FLD_FILTRI16_ROWNAMENTSPE = 0;
  public static int FLD_FILTRI16_ROWNAMTIPBIL = 1;
  public static int FLD_FILTRI16_ROWNAMTITENT = 2;
  public static int FLD_FILTRI16_ROWNAMTIENOL = 3;
  public static int FLD_FILTRI16_ROWNAMETIPOL = 4;
  public static int FLD_FILTRI16_ROWNAMEMISSI = 5;
  public static int FLD_FILTRI16_ROWNAMMISOLD = 6;
  public static int FLD_FILTRI16_ROWNAMEPROGR = 7;
  public static int FLD_FILTRI16_ROWNAMTITSPE = 8;
  public static int FLD_FILTRI16_ROWNAMTISPOL = 9;
  public static int FLD_FILTRI16_ROWNAMEMACRO = 10;
  public static int FLD_FILTRI16_ROWNAMEUO = 11;
  public static int FLD_FILTRI16_ROWNAMELOCKE = 12;

  // Definition of table: Temp BIL BPR
  //
  public static int TBL_TEMPBILBPR3 = 443;
  public static int FLD_TEMPBILBPR3_BILBPRSTATUS = 0;
  public static int FLD_TEMPBILBPR3_ESERCIZIO = 1;
  public static int FLD_TEMPBILBPR3_E_S = 2;
  public static int FLD_TEMPBILBPR3_CAPITOLO = 3;
  public static int FLD_TEMPBILBPR3_ARTICOLO = 4;
  public static int FLD_TEMPBILBPR3_DESCRIZIONE_ABBREVIATA = 5;
  public static int FLD_TEMPBILBPR3_BILBPRAPSTUO = 6;
  public static int FLD_TEMPBILBPR3_MISSIONE_TITOLO = 7;
  public static int FLD_TEMPBILBPR3_PROGRAMMA_TIPOLOGIA = 8;
  public static int FLD_TEMPBILBPR3_MACRO_LIV_1_STR = 9;
  public static int FLD_TEMPBILBPR3_MACRO_LIV_2_STR = 10;
  public static int FLD_TEMPBILBPR3_BILBPR_ESERCIZIO = 11;
  public static int FLD_TEMPBILBPR3_STN_INI_CO = 12;
  public static int FLD_TEMPBILBPR3_REISCRIZIONI_IMP = 13;
  public static int FLD_TEMPBILBPR3_REISCRIZIONI_STN = 14;
  public static int FLD_TEMPBILBPR3_STN_INI_CA = 15;
  public static int FLD_TEMPBILBPR3_PREVISIONE = 16;
  public static int FLD_TEMPBILBPR3_RESIDUI_PRESUNTI = 17;
  public static int FLD_TEMPBILBPR3_GIA_IMPEGNATO = 18;
  public static int FLD_TEMPBILBPR3_NUMRECBIBPUO = 19;
  public static int FLD_TEMPBILBPR3_BIBPNUUOGEVA = 20;
  public static int FLD_TEMPBILBPR3_BILBPRFPVSIS = 21;
  public static int FLD_TEMPBILBPR3_PREVISIONE_CASSA = 22;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI17 = 444;
  public static int FLD_FILTRI17_ROWNAMENTSPE = 0;
  public static int FLD_FILTRI17_ROWNAMTITENT = 1;
  public static int FLD_FILTRI17_ROWNAMTIENOL = 2;
  public static int FLD_FILTRI17_ROWNAMETIPOL = 3;
  public static int FLD_FILTRI17_ROWNAMEMISSI = 4;
  public static int FLD_FILTRI17_ROWNAMMISOLD = 5;
  public static int FLD_FILTRI17_ROWNAMEPROGR = 6;
  public static int FLD_FILTRI17_ROWNAMTITSPE = 7;
  public static int FLD_FILTRI17_ROWNAMTISPOL = 8;
  public static int FLD_FILTRI17_ROWNAMEMACRO = 9;
  public static int FLD_FILTRI17_ROWNAMEUO = 10;
  public static int FLD_FILTRI17_ROWNAMELOCKE = 11;

  // Definition of table: Temp BIL BPR
  //
  public static int TBL_TEMPBILBPR = 445;
  public static int FLD_TEMPBILBPR_BILBPRSTATUS = 0;
  public static int FLD_TEMPBILBPR_ESERCIZIO = 1;
  public static int FLD_TEMPBILBPR_E_S = 2;
  public static int FLD_TEMPBILBPR_CAPITOLO = 3;
  public static int FLD_TEMPBILBPR_ARTICOLO = 4;
  public static int FLD_TEMPBILBPR_DESCRIZIONE_ABBREVIATA = 5;
  public static int FLD_TEMPBILBPR_BILBPRAPSTUO = 6;
  public static int FLD_TEMPBILBPR_MISSIONE_TITOLO = 7;
  public static int FLD_TEMPBILBPR_PROGRAMMA_TIPOLOGIA = 8;
  public static int FLD_TEMPBILBPR_MACRO_LIV_1_STR = 9;
  public static int FLD_TEMPBILBPR_MACRO_LIV_2_STR = 10;
  public static int FLD_TEMPBILBPR_BILBPR_ESERCIZIO = 11;
  public static int FLD_TEMPBILBPR_STN_INI_CO = 12;
  public static int FLD_TEMPBILBPR_REISCRIZIONI_IMP = 13;
  public static int FLD_TEMPBILBPR_REISCRIZIONI_STN = 14;
  public static int FLD_TEMPBILBPR_STN_INI_CA = 15;
  public static int FLD_TEMPBILBPR_PREVISIONE = 16;
  public static int FLD_TEMPBILBPR_RESIDUI_PRESUNTI = 17;
  public static int FLD_TEMPBILBPR_GIA_IMPEGNATO = 18;
  public static int FLD_TEMPBILBPR_STN_PURO_DA_CRONO = 19;
  public static int FLD_TEMPBILBPR_NUMRECBIBPUO = 20;
  public static int FLD_TEMPBILBPR_BIBPNUUOGEVA = 21;
  public static int FLD_TEMPBILBPR_PREVISIONE_CASSA = 22;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI339 = 446;
  public static int FLD_PARAMETRI339_ROWNAMTIPBIL = 0;
  public static int FLD_PARAMETRI339_ROWNAMEESERC = 1;
  public static int FLD_PARAMETRI339_ROWNAMEES = 2;
  public static int FLD_PARAMETRI339_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI339_ROWNAMEARTIC = 4;
  public static int FLD_PARAMETRI339_ROWNAMEPREVI = 5;
  public static int FLD_PARAMETRI339_ROWNAMESTANZ = 6;
  public static int FLD_PARAMETRI339_RONAIMACULCT = 7;
  public static int FLD_PARAMETRI339_ROWNAMENUOVO = 8;
  public static int FLD_PARAMETRI339_ROWNAMESTATO = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI422 = 447;
  public static int FLD_PARAMETRI422_PARAMPARTE = 0;
  public static int FLD_PARAMETRI422_PARAPANNCHIA = 1;
  public static int FLD_PARAMETRI422_PARATIPOBILA = 2;
  public static int FLD_PARAMETRI422_PARAMLOCKED = 3;

  // Definition of table: IMDB Stanz
  //
  public static int TBL_IMDBSTANZ1 = 448;
  public static int FLD_IMDBSTANZ1_NOMEOGGECAPI = 0;
  public static int FLD_IMDBSTANZ1_NOMEOGGEARTI = 1;
  public static int FLD_IMDBSTANZ1_NOMEOGGETTES = 2;
  public static int FLD_IMDBSTANZ1_NOMEOGGELOCK = 3;

  // Definition of table: IMDB Stanz
  //
  public static int TBL_IMDBSTANZ = 449;
  public static int FLD_IMDBSTANZ_NOMEOGGECAPI = 0;
  public static int FLD_IMDBSTANZ_NOMEOGGEARTI = 1;
  public static int FLD_IMDBSTANZ_NOMEOGGETTES = 2;
  public static int FLD_IMDBSTANZ_NOMEOGGELOCK = 3;

  // Definition of table: Temp BIL
  //
  public static int TBL_TEMPBIL4 = 450;
  public static int FLD_TEMPBIL4_ROWNAMESTATU = 0;
  public static int FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO = 1;
  public static int FLD_TEMPBIL4_IMP_ACC_ULT_CONS = 2;
  public static int FLD_TEMPBIL4_PREVISIONE_CONS = 3;
  public static int FLD_TEMPBIL4_IMP_ACC_ULT_SVIL = 4;
  public static int FLD_TEMPBIL4_PREVISIONE = 5;
  public static int FLD_TEMPBIL4_PREVISIONE_SVIL = 6;
  public static int FLD_TEMPBIL4_STN_INI_CO = 7;
  public static int FLD_TEMPBIL4_STN_INI_CO_CONS = 8;
  public static int FLD_TEMPBIL4_STN_INI_CO_SVIL = 9;
  public static int FLD_TEMPBIL4_IMPEGNABILE = 10;
  public static int FLD_TEMPBIL4_ESERCIZIO = 11;
  public static int FLD_TEMPBIL4_E_S = 12;
  public static int FLD_TEMPBIL4_CAPITOLO = 13;
  public static int FLD_TEMPBIL4_ARTICOLO = 14;
  public static int FLD_TEMPBIL4_ROWNAMECNUOV = 15;

  // Definition of table: Filtri Effettivo Vg
  //
  public static int TBL_FILTREFFETVG = 451;
  public static int FLD_FILTREFFETVG_ROWNAMEENTRA = 0;
  public static int FLD_FILTREFFETVG_ROWNAMETITOL = 1;
  public static int FLD_FILTREFFETVG_ROWNAMECATEG = 2;
  public static int FLD_FILTREFFETVG_ROWNAMEFUNZI = 3;
  public static int FLD_FILTREFFETVG_ROWNAMESERVI = 4;
  public static int FLD_FILTREFFETVG_ROWNAMCODINT = 5;
  public static int FLD_FILTREFFETVG_ROWNAMCODTER = 6;

  // Definition of table: Parametri UO Vg
  //
  public static int TBL_PARAMETRUOVG = 452;
  public static int FLD_PARAMETRUOVG_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRUOVG_ROWNAMEES = 1;
  public static int FLD_PARAMETRUOVG_ROWNAMECAPIT = 2;
  public static int FLD_PARAMETRUOVG_ROWNAMEARTIC = 3;
  public static int FLD_PARAMETRUOVG_ROWNAMEPREVI = 4;
  public static int FLD_PARAMETRUOVG_ROWNAMESTANZ = 5;
  public static int FLD_PARAMETRUOVG_RONAIMACULCT = 6;

  // Definition of table: Filtri Simulato Vg
  //
  public static int TBL_FILTRSIMULVG = 453;
  public static int FLD_FILTRSIMULVG_ROWNAMEENTRA = 0;
  public static int FLD_FILTRSIMULVG_ROWNAMETITOL = 1;
  public static int FLD_FILTRSIMULVG_ROWNAMECATEG = 2;
  public static int FLD_FILTRSIMULVG_ROWNAMEFUNZI = 3;
  public static int FLD_FILTRSIMULVG_ROWNAMESERVI = 4;
  public static int FLD_FILTRSIMULVG_ROWNAMCODINT = 5;
  public static int FLD_FILTRSIMULVG_ROWNAMCODTER = 6;

  // Definition of table: Temp BPR Vg
  //
  public static int TBL_TEMPBPRVG = 454;
  public static int FLD_TEMPBPRVG_ROWNAMESTATU = 0;
  public static int FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO = 1;
  public static int FLD_TEMPBPRVG_IMP_ACC_ULT_CONS = 2;
  public static int FLD_TEMPBPRVG_PREVISIONE_CONS = 3;
  public static int FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL = 4;
  public static int FLD_TEMPBPRVG_PREVISIONE = 5;
  public static int FLD_TEMPBPRVG_PREVISIONE_SVIL = 6;
  public static int FLD_TEMPBPRVG_STN_INI_CO = 7;
  public static int FLD_TEMPBPRVG_STN_INI_CO_CONS = 8;
  public static int FLD_TEMPBPRVG_STN_INI_CO_SVIL = 9;
  public static int FLD_TEMPBPRVG_IMPEGNABILE = 10;
  public static int FLD_TEMPBPRVG_ESERCIZIO = 11;
  public static int FLD_TEMPBPRVG_E_S = 12;
  public static int FLD_TEMPBPRVG_CAPITOLO = 13;
  public static int FLD_TEMPBPRVG_ARTICOLO = 14;
  public static int FLD_TEMPBPRVG_ROWNAMECNUOV = 15;
  public static int FLD_TEMPBPRVG_ROWNAMEFPVSI = 16;

  // Definition of table: Parametri Simulato
  //
  public static int TBL_PARAMESIMUL1 = 455;
  public static int FLD_PARAMESIMUL1_ROWNAMEESERC = 0;
  public static int FLD_PARAMESIMUL1_ROWNAMEES = 1;
  public static int FLD_PARAMESIMUL1_ROWNAMECAPIT = 2;
  public static int FLD_PARAMESIMUL1_ROWNAMEARTIC = 3;
  public static int FLD_PARAMESIMUL1_ROWNAMEPREVI = 4;
  public static int FLD_PARAMESIMUL1_ROWNAMESTANZ = 5;
  public static int FLD_PARAMESIMUL1_RONAIMACULCT = 6;

  // Definition of table: Pats
  //
  public static int TBL_PATS3 = 456;
  public static int FLD_PATS3_NOMOGGESDIIS = 0;
  public static int FLD_PATS3_NOMEOGGETIPO = 1;
  public static int FLD_PATS3_NOMOGGORDCRO = 2;
  public static int FLD_PATS3_NOMEOGGEMODP = 3;
  public static int FLD_PATS3_NOMEOGGECAPI = 4;
  public static int FLD_PATS3_NOMEOGGEARTI = 5;
  public static int FLD_PATS3_NOMEOGGEFINA = 6;
  public static int FLD_PATS3_NOMOGGAPECHI = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI511 = 457;
  public static int FLD_PARAMETRI511_NOMEOGGETTIU = 0;
  public static int FLD_PARAMETRI511_CRONOPROGRAMMA_ID = 1;
  public static int FLD_PARAMETRI511_NOMOGGABIVAR = 2;
  public static int FLD_PARAMETRI511_NOMEOGGEDEFI = 3;

  // Definition of table: Par Sopra
  //
  public static int TBL_PARSOPRA = 458;
  public static int FLD_PARSOPRA_CRONOPROGRAMMA_ID = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS74 = 459;
  public static int FLD_PARS74_NOMEOGGECRON = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI514 = 460;
  public static int FLD_PARAMETRI514_PARAMCRONOID = 0;
  public static int FLD_PARAMETRI514_PARAPROGIMPU = 1;
  public static int FLD_PARAMETRI514_PARAESERPLUR = 2;
  public static int FLD_PARAMETRI514_PARAMFINANZI = 3;
  public static int FLD_PARAMETRI514_PARAMOPERA = 4;
  public static int FLD_PARAMETRI514_PARAMCAPITOL = 5;
  public static int FLD_PARAMETRI514_PARAMARTICOL = 6;

  // Definition of table: Pars
  //
  public static int TBL_PARS57 = 461;
  public static int FLD_PARS57_NOMEOGGCROID = 0;
  public static int FLD_PARS57_NOMEOGGETOTA = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS58 = 462;
  public static int FLD_PARS58_NOOGSTELOELV = 0;
  public static int FLD_PARS58_NOMEOGGEOPER = 1;
  public static int FLD_PARS58_NOMOGGESEINS = 2;
  public static int FLD_PARS58_NOMEOGGECAPI = 3;
  public static int FLD_PARS58_NOMEOGGEARTI = 4;
  public static int FLD_PARS58_NOMEOGGEFINA = 5;
  public static int FLD_PARS58_NOMEOGGECONF = 6;
  public static int FLD_PARS58_NOMEOGGPROUO = 7;
  public static int FLD_PARS58_NOMEOGGETOTA = 8;

  // Definition of table: Pars
  //
  public static int TBL_PARS61 = 463;
  public static int FLD_PARS61_NOMEOGGCROID = 0;
  public static int FLD_PARS61_NOMEOGGEOPER = 1;
  public static int FLD_PARS61_NOMEOGGETFIN = 2;

  // Definition of table: Pats
  //
  public static int TBL_PATS6 = 464;
  public static int FLD_PATS6_NOMOGGESDIIS = 0;
  public static int FLD_PATS6_NOMOGGTUTICA = 1;
  public static int FLD_PATS6_NOMEOGGECAPI = 2;
  public static int FLD_PATS6_NOMEOGGEARTI = 3;
  public static int FLD_PATS6_NOMEOGGEMODP = 4;

  // Definition of table: Pats
  //
  public static int TBL_PATS = 465;
  public static int FLD_PATS_NOMEOGGEESER = 0;
  public static int FLD_PATS_NOMEOGGECAPI = 1;
  public static int FLD_PATS_NOMEOGGEARTI = 2;
  public static int FLD_PATS_NOMEOGGEFINA = 3;
  public static int FLD_PATS_NOMOGGIMGIGE = 4;
  public static int FLD_PATS_NOMOGGTIPELA = 5;
  public static int FLD_PATS_NOMOGGSEDDEL = 6;
  public static int FLD_PATS_NOMOGGNUMDEL = 7;
  public static int FLD_PATS_NOMOGGANNDEL = 8;
  public static int FLD_PATS_NOMEOGGDACRO = 9;

  // Definition of table: Parametri Finanziamenti Da Crono
  //
  public static int TBL_PARAFINDACRO = 466;
  public static int FLD_PARAFINDACRO_NOMEOGGEESER = 0;
  public static int FLD_PARAFINDACRO_NOMOGGVARCRO = 1;
  public static int FLD_PARAFINDACRO_NOMEOGGEDEST = 2;

  // Definition of table: Parametri FDCF2
  //
  public static int TBL_PARAMETFDCF2 = 467;
  public static int FLD_PARAMETFDCF2_NOMEOGGEDEST = 0;
  public static int FLD_PARAMETFDCF2_NOMEOGGEESER = 1;
  public static int FLD_PARAMETFDCF2_NOMOGGVARCRO = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS45 = 468;
  public static int FLD_PARS45_NOMOGGTIPCLA = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS46 = 469;
  public static int FLD_PARS46_NOMOGGTIPCLA = 0;
  public static int FLD_PARS46_NOMOGGTIPCAL = 1;
  public static int FLD_PARS46_NOMEOGGEESCL = 2;

  // Definition of table: IMDB Agg Tipo Calcolo
  //
  public static int TBL_IMDAGGTIPCAL = 470;
  public static int FLD_IMDAGGTIPCAL_NOMOGGTIPCAT = 0;
  public static int FLD_IMDAGGTIPCAL_NOMEOGGECAPI = 1;
  public static int FLD_IMDAGGTIPCAL_NOMEOGGEARTI = 2;

  // Definition of table: FSC Parametri
  //
  public static int TBL_FSCPARAMETRI = 471;
  public static int FLD_FSCPARAMETRI_NOMOGGTIPCLA = 0;
  public static int FLD_FSCPARAMETRI_NOMOGGPRESAR = 1;
  public static int FLD_FSCPARAMETRI_NOOGTICANUOR = 2;
  public static int FLD_FSCPARAMETRI_NOMOGGPERRIF = 3;

  // Definition of table: Parametri FCDDE Prev
  //
  public static int TBL_PARAFCDDPREV = 472;
  public static int FLD_PARAFCDDPREV_NOMOGGESEPLU = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI534 = 473;
  public static int FLD_PARAMETRI534_NOMOGGTOFIES = 0;
  public static int FLD_PARAMETRI534_NOMOGGTOTFON = 1;
  public static int FLD_PARAMETRI534_NOMOGGTIPCLA = 2;
  public static int FLD_PARAMETRI534_NOMOGGPERRIF = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM173 = 474;
  public static int FLD_PARAM173_NOMOGGDATEST = 0;
  public static int FLD_PARAM173_NOMOGGCHEDAT = 1;
  public static int FLD_PARAM173_NOOGLIDAESPR = 2;
  public static int FLD_PARAM173_NOMOGGDATFIL = 3;

  // Definition of table: Parametri Info Accertato Fcdde
  //
  public static int TBL_PARINFACCFCD = 475;
  public static int FLD_PARINFACCFCD_NOMOGGTIPCLA = 0;
  public static int FLD_PARINFACCFCD_NOMEOGGEESER = 1;
  public static int FLD_PARINFACCFCD_NOMEOGGECAPI = 2;
  public static int FLD_PARINFACCFCD_NOMEOGGEARTI = 3;
  public static int FLD_PARINFACCFCD_NOMOGGTIPCAT = 4;
  public static int FLD_PARINFACCFCD_NOMEOGGEDESC = 5;
  public static int FLD_PARINFACCFCD_NOMEOGGEREND = 6;
  public static int FLD_PARINFACCFCD_NOOGPRESARFC = 7;
  public static int FLD_PARINFACCFCD_NOMEOGGETTDN = 8;

  // Definition of table: Parametri Info Incassato Fcdde
  //
  public static int TBL_PARINFINCFC3 = 476;
  public static int FLD_PARINFINCFC3_NOMOGGTIPCLA = 0;
  public static int FLD_PARINFINCFC3_NOOGTICANUOR = 1;
  public static int FLD_PARINFINCFC3_NOMEOGGEESER = 2;
  public static int FLD_PARINFINCFC3_NOMOGGPERRIF = 3;
  public static int FLD_PARINFINCFC3_NOMEOGGECAPI = 4;
  public static int FLD_PARINFINCFC3_NOMEOGGEARTI = 5;
  public static int FLD_PARINFINCFC3_NOMOGGTIPCAT = 6;
  public static int FLD_PARINFINCFC3_NOMEOGGEDESC = 7;

  // Definition of table: Parametri Info Incassato Fcdde
  //
  public static int TBL_PARINFINCFCD = 477;
  public static int FLD_PARINFINCFCD_NOMOGGTIPCLA = 0;
  public static int FLD_PARINFINCFCD_NOMEOGGEESER = 1;
  public static int FLD_PARINFINCFCD_NOMOGGPERRIF = 2;
  public static int FLD_PARINFINCFCD_NOMEOGGECAPI = 3;
  public static int FLD_PARINFINCFCD_NOMEOGGEARTI = 4;
  public static int FLD_PARINFINCFCD_NOMOGGTIPCAT = 5;
  public static int FLD_PARINFINCFCD_NOMEOGGEDESC = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI682 = 478;
  public static int FLD_PARAMETRI682_PARAPERCACCA = 0;
  public static int FLD_PARAMETRI682_PARAPERCRIVA = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM131 = 479;
  public static int FLD_PARAM131_PARAMPARTE = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM133 = 480;
  public static int FLD_PARAM133_PARAMESERCIZ = 0;
  public static int FLD_PARAM133_PARAMPARTE = 1;
  public static int FLD_PARAM133_PARATIPODUPL = 2;

  // Definition of table: OUT
  //
  public static int TBL_OUT11 = 481;
  public static int FLD_OUT11_ESERCIZIO = 0;
  public static int FLD_OUT11_ESE_RIF = 1;
  public static int FLD_OUT11_ROWNAMTIDIBI = 2;
  public static int FLD_OUT11_ROWNAMSTDICO = 3;
  public static int FLD_OUT11_ROWNAMSODABI = 4;
  public static int FLD_OUT11_ROWNAMSOLFIN = 5;

  // Definition of table: OUT
  //
  public static int TBL_OUT13 = 482;
  public static int FLD_OUT13_ESE_DA_GEN = 0;
  public static int FLD_OUT13_ESERCIZIO = 1;
  public static int FLD_OUT13_ESE_RIF = 2;
  public static int FLD_OUT13_ROWNAMSTAPUR = 3;
  public static int FLD_OUT13_ROWNAMPASTPU = 4;
  public static int FLD_OUT13_ROWNAMRESPRE = 5;
  public static int FLD_OUT13_ROWNAMPAREPR = 6;
  public static int FLD_OUT13_ROWNAMTIREPR = 7;
  public static int FLD_OUT13_ROWNAMSTACAS = 8;
  public static int FLD_OUT13_ROWNAMPASTCA = 9;
  public static int FLD_OUT13_ROWNAMSTDAES = 10;
  public static int FLD_OUT13_RONAPASTDAES = 11;
  public static int FLD_OUT13_ROWNAMSTDACR = 12;
  public static int FLD_OUT13_ROWNAMFOPLVI = 13;
  public static int FLD_OUT13_ROWNAMGIAIMP = 14;
  public static int FLD_OUT13_ROWNAMPRESPR = 15;
  public static int FLD_OUT13_RONAPAPRESPR = 16;
  public static int FLD_OUT13_RONAPRCAESPR = 17;
  public static int FLD_OUT13_RONAPAPRCAEP = 18;
  public static int FLD_OUT13_ROWNAMEFUNZI = 19;

  // Definition of table: OUT
  //
  public static int TBL_OUT15 = 483;
  public static int FLD_OUT15_ESE_DA_GEN = 0;
  public static int FLD_OUT15_ESERCIZIO = 1;
  public static int FLD_OUT15_ESE_RIF = 2;
  public static int FLD_OUT15_ROWNAMSTAPUR = 3;
  public static int FLD_OUT15_ROWNAMPASTPU = 4;
  public static int FLD_OUT15_ROWNAMCANVAR = 5;
  public static int FLD_OUT15_ROWNAMINSBIL = 6;
  public static int FLD_OUT15_ROWNAMRESPRE = 7;
  public static int FLD_OUT15_ROWNAMPAREPR = 8;
  public static int FLD_OUT15_ROWNAMTIREPR = 9;
  public static int FLD_OUT15_ROWNAMSTACAS = 10;
  public static int FLD_OUT15_ROWNAMPASTCA = 11;
  public static int FLD_OUT15_ROWNAMEFUNZI = 12;
  public static int FLD_OUT15_ROWNAMGIAIMP = 13;

  // Definition of table: OUT
  //
  public static int TBL_OUT = 484;
  public static int FLD_OUT_ESE_DA_GEN = 0;
  public static int FLD_OUT_ESERCIZIO = 1;
  public static int FLD_OUT_ROWNAMRESPRE = 2;
  public static int FLD_OUT_ROWNAMSTACOM = 3;
  public static int FLD_OUT_ROWNAMSTACAS = 4;
  public static int FLD_OUT_ROWNAMGIAIMP = 5;
  public static int FLD_OUT_ROWNAMPRESPR = 6;
  public static int FLD_OUT_RONAPRCAESPR = 7;
  public static int FLD_OUT_ROWNAMDAAPBI = 8;

  // Definition of table: OUT
  //
  public static int TBL_OUT3 = 485;
  public static int FLD_OUT3_ROWNAMNUOBIL = 0;
  public static int FLD_OUT3_ROWNAMESERIF = 1;
  public static int FLD_OUT3_ROWNAMEPLURI = 2;
  public static int FLD_OUT3_RONADABIEFSI = 3;
  public static int FLD_OUT3_ROWNAMEDAESE = 4;
  public static int FLD_OUT3_ROWNAMSTAAZE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI119 = 486;
  public static int FLD_PARAMETRI119_ROWNAMEESEIN = 0;
  public static int FLD_PARAMETRI119_ROWNAMECOUNT = 1;
  public static int FLD_PARAMETRI119_ROWNAMECOUN2 = 2;
  public static int FLD_PARAMETRI119_ROWNAMESERIF = 3;

  // Definition of table: OUT
  //
  public static int TBL_OUT5 = 487;
  public static int FLD_OUT5_ROWNAMDABISI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI389 = 488;
  public static int FLD_PARAMETRI389_ROWNAMEESEIN = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI458 = 489;
  public static int FLD_PARAMETRI458_ROWNAMEESEIN = 0;
  public static int FLD_PARAMETRI458_ROWNAMETIPO = 1;

  // Definition of table: OUT
  //
  public static int TBL_OUT7 = 490;
  public static int FLD_OUT7_RONAIMACULEC = 0;
  public static int FLD_OUT7_RONAPRDEESPR = 1;
  public static int FLD_OUT7_ROWNAMSTAINI = 2;
  public static int FLD_OUT7_ROWNAMEIMPEG = 3;
  public static int FLD_OUT7_RONAAGBIDRPF = 4;
  public static int FLD_OUT7_RONAPADPABDE = 5;
  public static int FLD_OUT7_RONAPABISISE = 6;
  public static int FLD_OUT7_RONARIIATUEC = 7;
  public static int FLD_OUT7_RONARIPRDEEP = 8;
  public static int FLD_OUT7_ROWNAMRISTIN = 9;
  public static int FLD_OUT7_RONARISTSUBP = 10;
  public static int FLD_OUT7_RONASUBIEFSI = 11;
  public static int FLD_OUT7_RONASUBIEFS1 = 12;
  public static int FLD_OUT7_RONASUBIEFS2 = 13;
  public static int FLD_OUT7_RONASUBIEFS3 = 14;
  public static int FLD_OUT7_RONASUBIEFS4 = 15;
  public static int FLD_OUT7_ROWNAMRIREPR = 16;
  public static int FLD_OUT7_RONAREPREFSI = 17;
  public static int FLD_OUT7_RONAREPRPAES = 18;
  public static int FLD_OUT7_RONAREPRRE3A = 19;
  public static int FLD_OUT7_ROWNAMRISTCA = 20;
  public static int FLD_OUT7_RONASTCASBES = 21;
  public static int FLD_OUT7_RONASTCAPAES = 22;
  public static int FLD_OUT7_ROWNAMRIGIIM = 23;
  public static int FLD_OUT7_RONAGIIMSBES = 24;

  // Definition of table: Par
  //
  public static int TBL_PAR1 = 491;
  public static int FLD_PAR1_ROWNAMEESEIN = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI122 = 492;
  public static int FLD_PARAMETRI122_ROWNAMEESEIN = 0;

  // Definition of table: OUT
  //
  public static int TBL_OUT9 = 493;
  public static int FLD_OUT9_ROWNAMDATRIE = 0;
  public static int FLD_OUT9_ROWNAMRIEACC = 1;
  public static int FLD_OUT9_ROWNAMRIEIMP = 2;
  public static int FLD_OUT9_ROWNAMRIESUB = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS41 = 494;
  public static int FLD_PARS41_NOMOGGESEPLU = 0;
  public static int FLD_PARS41_NOMOGGTIPSCH = 1;
  public static int FLD_PARS41_NOMOGGUNIORG = 2;
  public static int FLD_PARS41_NOMEOGGECAPI = 3;
  public static int FLD_PARS41_NOMEOGGEARTI = 4;
  public static int FLD_PARS41_NOMEOGGEMISS = 5;
  public static int FLD_PARS41_NOMEOGGEPROG = 6;
  public static int FLD_PARS41_NOMEOGGEMACR = 7;
  public static int FLD_PARS41_NOMOGGTITENT = 8;
  public static int FLD_PARS41_NOMEOGGETIPO = 9;
  public static int FLD_PARS41_NOMOGGTITSPE = 10;
  public static int FLD_PARS41_NOMOGGSOBIPR = 11;
  public static int FLD_PARS41_NOMOGGTIPBIL = 12;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI485 = 495;
  public static int FLD_PARAMETRI485_PARAMESERCIZ = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI486 = 496;
  public static int FLD_PARAMETRI486_PARAMESERCIZ = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM151 = 497;
  public static int FLD_PARAM151_PARAPROGSTAM = 0;
  public static int FLD_PARAM151_PARAMESERCIZ = 1;
  public static int FLD_PARAM151_PARSTANUDIPA = 2;
  public static int FLD_PARAM151_PARAMFONTE = 3;
  public static int FLD_PARAM151_PARASTAMSALV = 4;
  public static int FLD_PARAM151_PARASALVSTAM = 5;
  public static int FLD_PARAM151_PARANOTESTAM = 6;
  public static int FLD_PARAM151_PARAMIDSTAMP = 7;
  public static int FLD_PARAM151_PARANOMEFILE = 8;
  public static int FLD_PARAM151_PARAESEDISTA = 9;

  // Definition of table: Param
  //
  public static int TBL_PARAM161 = 498;
  public static int FLD_PARAM161_PARAPROGSTAM = 0;
  public static int FLD_PARAM161_PARAMESERCIZ = 1;
  public static int FLD_PARAM161_PARSTANUDIPA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI673 = 499;
  public static int FLD_PARAMETRI673_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI673_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI673_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI673_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI673_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI673_PARANOMEFILE = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM46 = 500;
  public static int FLD_PARAM46_NOMEOGGEDATA = 0;
  public static int FLD_PARAM46_NOMOGGDATOLD = 1;
  public static int FLD_PARAM46_NOMEOGGEENTR = 2;
  public static int FLD_PARAM46_NOMEOGGEUSCI = 3;
  public static int FLD_PARAM46_NOMOGGVAREAT = 4;
  public static int FLD_PARAM46_NOMOGGVAREPA = 5;
  public static int FLD_PARAM46_NOMEOGGETFPV = 6;
  public static int FLD_PARAM46_NOMOGGAVAFSC = 7;
  public static int FLD_PARAM46_NOMOGGPAVICO = 8;
  public static int FLD_PARAM46_NOMOGGPAVIIN = 9;
  public static int FLD_PARAM46_NOMOGGPADICO = 10;
  public static int FLD_PARAM46_NOMOGGPADIIN = 11;
  public static int FLD_PARAM46_NOMOGGPANOUT = 12;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI659 = 501;
  public static int FLD_PARAMETRI659_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI659_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI659_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI659_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI659_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI659_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI667 = 502;
  public static int FLD_PARAMETRI667_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI667_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI667_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI667_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI667_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI667_PARANOMEFILE = 5;

  // Definition of table: Parametri Stampa FCDDE
  //
  public static int TBL_PARASTAMFCD1 = 503;
  public static int FLD_PARASTAMFCD1_PARAESERPLUR = 0;
  public static int FLD_PARASTAMFCD1_PARAPROGSTAM = 1;
  public static int FLD_PARASTAMFCD1_PARANOMESTAM = 2;
  public static int FLD_PARASTAMFCD1_PARSTANUDIPA = 3;
  public static int FLD_PARASTAMFCD1_PARANOTESTAM = 4;
  public static int FLD_PARASTAMFCD1_PARAMIDSTAMP = 5;
  public static int FLD_PARASTAMFCD1_PARANOMEFILE = 6;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB11 = 504;
  public static int FLD_IMDB11_NOMOGGTIPSTA = 0;
  public static int FLD_IMDB11_NOMOGGRESEFF = 1;
  public static int FLD_IMDB11_NOOGSTNUDIPA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI666 = 505;
  public static int FLD_PARAMETRI666_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI666_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI666_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI666_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI666_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI666_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI139 = 506;
  public static int FLD_PARAMETRI139_ROWNAMESTAMP = 0;
  public static int FLD_PARAMETRI139_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI139_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMETRI139_ROWNAMNUMDEL = 3;
  public static int FLD_PARAMETRI139_ROWNAMANNDEL = 4;
  public static int FLD_PARAMETRI139_ROWNAMUNIPRO = 5;
  public static int FLD_PARAMETRI139_ROWNAMNUMPRO = 6;
  public static int FLD_PARAMETRI139_ROWNAMANNPRO = 7;
  public static int FLD_PARAMETRI139_ROWNAMDATELA = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI668 = 507;
  public static int FLD_PARAMETRI668_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI668_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI668_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI668_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI668_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI668_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI189 = 508;
  public static int FLD_PARAMETRI189_ROWNAMEVARIA = 0;
  public static int FLD_PARAMETRI189_ROWNAMSEDDEL = 1;
  public static int FLD_PARAMETRI189_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI189_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI189_ROWNAMUNIPRO = 4;
  public static int FLD_PARAMETRI189_ROWNAMNUMPRO = 5;
  public static int FLD_PARAMETRI189_ROWNAMANNPRO = 6;
  public static int FLD_PARAMETRI189_ROWNAMDATELA = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI568 = 509;
  public static int FLD_PARAMETRI568_ROWNAMTIPSTA = 0;
  public static int FLD_PARAMETRI568_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI568_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMETRI568_ROWNAMNUMDEL = 3;
  public static int FLD_PARAMETRI568_ROWNAMANNDEL = 4;
  public static int FLD_PARAMETRI568_ROWNAMUNIPRO = 5;
  public static int FLD_PARAMETRI568_ROWNAMNUMPRO = 6;
  public static int FLD_PARAMETRI568_ROWNAMANNPRO = 7;
  public static int FLD_PARAMETRI568_ROWNAMDATELA = 8;
  public static int FLD_PARAMETRI568_RONASTNUDIPA = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI658 = 510;
  public static int FLD_PARAMETRI658_ROWNAMNOMREP = 0;
  public static int FLD_PARAMETRI658_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI658_ROWNAMUNIPRO = 2;
  public static int FLD_PARAMETRI658_ROWNAMNUMPRO = 3;
  public static int FLD_PARAMETRI658_ROWNAMANNPRO = 4;
  public static int FLD_PARAMETRI658_ROWNAMDATELA = 5;

  // Definition of table: Paramtri
  //
  public static int TBL_PARAMTRI1 = 511;
  public static int FLD_PARAMTRI1_PARAPROGSTAM = 0;
  public static int FLD_PARAMTRI1_PARANOMESTAM = 1;
  public static int FLD_PARAMTRI1_PARSTANUDIPA = 2;
  public static int FLD_PARAMTRI1_PARANOTESTAM = 3;
  public static int FLD_PARAMTRI1_PARAMIDSTAMP = 4;
  public static int FLD_PARAMTRI1_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI267 = 512;
  public static int FLD_PARAMETRI267_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI267_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI267_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI267_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI267_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI267_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI675 = 513;
  public static int FLD_PARAMETRI675_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI675_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI675_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI675_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI675_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI675_PARANOMEFILE = 5;
  public static int FLD_PARAMETRI675_PARAMLOOKUP = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI676 = 514;
  public static int FLD_PARAMETRI676_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI676_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI676_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI676_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI676_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI676_PARANOMEFILE = 5;
  public static int FLD_PARAMETRI676_PARAMLOOKUP = 6;

  // Definition of table: Param
  //
  public static int TBL_PARAM158 = 515;
  public static int FLD_PARAM158_PARAPROGSTAM = 0;
  public static int FLD_PARAM158_PARAMESERCIZ = 1;
  public static int FLD_PARAM158_PARATIPOBILA = 2;
  public static int FLD_PARAM158_PARAMISSTITO = 3;
  public static int FLD_PARAM158_PARAPROGTIPO = 4;
  public static int FLD_PARAM158_PARAENTRSPES = 5;
  public static int FLD_PARAM158_PARASUDSUPUO = 6;
  public static int FLD_PARAM158_PARAMSIGLA = 7;
  public static int FLD_PARAM158_PARAPROGUNIT = 8;
  public static int FLD_PARAM158_PARARIEPGENE = 9;
  public static int FLD_PARAM158_PARSTANUDIPA = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI433 = 516;
  public static int FLD_PARAMETRI433_PARAMPARTE = 0;
  public static int FLD_PARAMETRI433_PARAMDAL = 1;
  public static int FLD_PARAMETRI433_PARAMAL = 2;
  public static int FLD_PARAMETRI433_PARATIPOSTAM = 3;
  public static int FLD_PARAMETRI433_PARSTANUDIPA = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM168 = 517;
  public static int FLD_PARAM168_PARAPROGSTAM = 0;
  public static int FLD_PARAM168_PARAMESERCIZ = 1;
  public static int FLD_PARAM168_PARAMISSTITO = 2;
  public static int FLD_PARAM168_PARAPROGTIPO = 3;
  public static int FLD_PARAM168_PARAENTRSPES = 4;
  public static int FLD_PARAM168_PARAMDAL = 5;
  public static int FLD_PARAM168_PARAMAL = 6;
  public static int FLD_PARAM168_PARAMTIPO = 7;
  public static int FLD_PARAM168_PARASUDSUPUO = 8;
  public static int FLD_PARAM168_PARAMSIGLA = 9;
  public static int FLD_PARAM168_PARAPROGUNIT = 10;
  public static int FLD_PARAM168_PARSTANUDIPA = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI134 = 518;
  public static int FLD_PARAMETRI134_ROWNAMESTAMP = 0;
  public static int FLD_PARAMETRI134_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRI134_ROWNAMDABISI = 2;
  public static int FLD_PARAMETRI134_ROWNAMEDETTA = 3;

  // Definition of table: Par
  //
  public static int TBL_PAR14 = 519;
  public static int FLD_PAR14_ROWNAMDABISI = 0;
  public static int FLD_PAR14_ROWNAMSTAATT = 1;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE8 = 520;
  public static int FLD_NEWTABLE8_ROWNAMDABISI = 0;
  public static int FLD_NEWTABLE8_ROWNAMEDETTA = 1;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE6 = 521;
  public static int FLD_NEWTABLE6_ROWNAMDABISI = 0;
  public static int FLD_NEWTABLE6_ROWNAMEDETTA = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR12 = 522;
  public static int FLD_PAR12_ROWNAMDABISI = 0;
  public static int FLD_PAR12_ROWNAMEDATA = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI199 = 523;
  public static int FLD_PARAMETRI199_ROWNAMESTAMP = 0;
  public static int FLD_PARAMETRI199_RONAPRESDABS = 1;
  public static int FLD_PARAMETRI199_RONAESPLDABS = 2;
  public static int FLD_PARAMETRI199_ROWNAMEPARTE = 3;
  public static int FLD_PARAMETRI199_ROWNAMCRDIST = 4;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE4 = 524;
  public static int FLD_NEWTABLE4_ROWNAMEDETTA = 0;
  public static int FLD_NEWTABLE4_ROWNAMEPARTE = 1;
  public static int FLD_NEWTABLE4_ROWNAMEDAL = 2;
  public static int FLD_NEWTABLE4_ROWNAMEAL = 3;
  public static int FLD_NEWTABLE4_ROWNAMECOMME = 4;
  public static int FLD_NEWTABLE4_ROWNAMESTAMP = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI354 = 525;
  public static int FLD_PARAMETRI354_PARAMPARTE = 0;
  public static int FLD_PARAMETRI354_PARADABILSIM = 1;
  public static int FLD_PARAMETRI354_PARAMDETTAGL = 2;
  public static int FLD_PARAMETRI354_PARASERVOPER = 3;
  public static int FLD_PARAMETRI354_PATOPECEDICO = 4;
  public static int FLD_PARAMETRI354_PARAPREVEURO = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR10 = 526;
  public static int FLD_PAR10_ROWNAMEPARTE = 0;
  public static int FLD_PAR10_ROWNAMETITOL = 1;
  public static int FLD_PAR10_ROWNAMEFUNZI = 2;
  public static int FLD_PAR10_ROWNAMESERVI = 3;
  public static int FLD_PAR10_ROWNAMDABISI = 4;
  public static int FLD_PAR10_ROWNAMDETCAP = 5;
  public static int FLD_PAR10_ROWNAMDESINT = 6;
  public static int FLD_PAR10_ROWNAMTOPETI = 7;
  public static int FLD_PAR10_ROWNAMEVARIA = 8;
  public static int FLD_PAR10_RONAPRANINCO = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI356 = 527;
  public static int FLD_PARAMETRI356_PARAMPARTE = 0;
  public static int FLD_PARAMETRI356_PARAMSETTORE = 1;
  public static int FLD_PARAMETRI356_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI356_PARADABILSIM = 3;
  public static int FLD_PARAMETRI356_PARADETTCAPI = 4;
  public static int FLD_PARAMETRI356_PARADESCINTE = 5;
  public static int FLD_PARAMETRI356_PARTOTPERTIT = 6;
  public static int FLD_PARAMETRI356_PARAMVARIAZI = 7;
  public static int FLD_PARAMETRI356_PARPREANINCO = 8;
  public static int FLD_PARAMETRI356_PARAPREVEURO = 9;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO17 = 528;
  public static int FLD_PARAMETRIO17_PARAMSETTOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI358 = 529;
  public static int FLD_PARAMETRI358_PARAMPARTE = 0;
  public static int FLD_PARAMETRI358_PARAMTITOLO = 1;
  public static int FLD_PARAMETRI358_PARACENDICOS = 2;
  public static int FLD_PARAMETRI358_PARADABILSIM = 3;
  public static int FLD_PARAMETRI358_PARADETTCAPI = 4;
  public static int FLD_PARAMETRI358_PARADESCINTE = 5;
  public static int FLD_PARAMETRI358_PARTOTPERTIT = 6;
  public static int FLD_PARAMETRI358_PARAMVARIAZI = 7;
  public static int FLD_PARAMETRI358_PARPREANINCO = 8;
  public static int FLD_PARAMETRI358_PARAPREVEURO = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI399 = 530;
  public static int FLD_PARAMETRI399_PARAMPARTE = 0;
  public static int FLD_PARAMETRI399_PARAMUOSUPER = 1;
  public static int FLD_PARAMETRI399_PARAMUOGESTI = 2;
  public static int FLD_PARAMETRI399_PARADABILSIM = 3;
  public static int FLD_PARAMETRI399_PARADETTCAPI = 4;
  public static int FLD_PARAMETRI399_PARADESCINTE = 5;
  public static int FLD_PARAMETRI399_PARTOTPERTIT = 6;
  public static int FLD_PARAMETRI399_PARAMVARIAZI = 7;
  public static int FLD_PARAMETRI399_PARPREANINCO = 8;
  public static int FLD_PARAMETRI399_PARAPREVEURO = 9;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO28 = 531;
  public static int FLD_PARAMETRIO28_PARAUOSUPOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI302 = 532;
  public static int FLD_PARAMETRI302_PARAMPARTE = 0;
  public static int FLD_PARAMETRI302_PARAMUOUTILI = 1;
  public static int FLD_PARAMETRI302_PARADABILSIM = 2;
  public static int FLD_PARAMETRI302_PARADETTCAPI = 3;
  public static int FLD_PARAMETRI302_PARADESCINTE = 4;
  public static int FLD_PARAMETRI302_PARTOTPERTIT = 5;
  public static int FLD_PARAMETRI302_PARAMVARIAZI = 6;
  public static int FLD_PARAMETRI302_PARPREANINCO = 7;
  public static int FLD_PARAMETRI302_PARAPREVEURO = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI203 = 533;
  public static int FLD_PARAMETRI203_ROWNAMETITOL = 0;
  public static int FLD_PARAMETRI203_ROWNAMEINTER = 1;
  public static int FLD_PARAMETRI203_RONADATIDISP = 2;
  public static int FLD_PARAMETRI203_ROWNAATIDISP = 3;
  public static int FLD_PARAMETRI203_ROWNAMPERINT = 4;
  public static int FLD_PARAMETRI203_ROWNAMPERIN2 = 5;
  public static int FLD_PARAMETRI203_ROWNAMPERIN3 = 6;
  public static int FLD_PARAMETRI203_ROWNAMDABISI = 7;
  public static int FLD_PARAMETRI203_ROWNAMEVARIA = 8;
  public static int FLD_PARAMETRI203_RONAPRANINCO = 9;
  public static int FLD_PARAMETRI203_ROWNAMEFUNZI = 10;
  public static int FLD_PARAMETRI203_ROWNAMESERVI = 11;
  public static int FLD_PARAMETRI203_ROWNAMCEDICO = 12;
  public static int FLD_PARAMETRI203_ROWNAMSETOPE = 13;
  public static int FLD_PARAMETRI203_ROWNAMSEROPE = 14;

  // Definition of table: Par
  //
  public static int TBL_PAR55 = 534;
  public static int FLD_PAR55_ROWNAMEPARTE = 0;
  public static int FLD_PAR55_ROWNAMEPROGR = 1;
  public static int FLD_PAR55_ROWNAMEDAPRO = 2;
  public static int FLD_PAR55_ROWNAMEAPROG = 3;
  public static int FLD_PAR55_ROWNAMDABISI = 4;
  public static int FLD_PAR55_ROWNAMDETCAP = 5;
  public static int FLD_PAR55_ROWNAMDESINT = 6;
  public static int FLD_PAR55_ROWNAMTOPETI = 7;
  public static int FLD_PAR55_ROWNAMRIPESE = 8;
  public static int FLD_PAR55_ROWNAMEVARIA = 9;
  public static int FLD_PAR55_RONAPRANINCO = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR24 = 535;
  public static int FLD_PAR24_ROWNAMEPARTE = 0;
  public static int FLD_PAR24_ROWNAMEDAVIN = 1;
  public static int FLD_PAR24_ROWNAMEAVINC = 2;
  public static int FLD_PAR24_ROWNAMDABISI = 3;
  public static int FLD_PAR24_ROWNAMDETCAP = 4;
  public static int FLD_PAR24_ROWNAMEVARIA = 5;
  public static int FLD_PAR24_RONAPRANINCO = 6;
  public static int FLD_PAR24_ROWNAMDESINT = 7;
  public static int FLD_PAR24_ROWNAMRIDEFL = 8;
  public static int FLD_PAR24_ROWNAMTOPETI = 9;

  // Definition of table: Par
  //
  public static int TBL_PAR22 = 536;
  public static int FLD_PAR22_ROWNAMEPARTE = 0;
  public static int FLD_PAR22_ROWNAMEDAFLE = 1;
  public static int FLD_PAR22_ROWNAMEAFLES = 2;
  public static int FLD_PAR22_ROWNAMDABISI = 3;
  public static int FLD_PAR22_ROWNAMDETCAP = 4;
  public static int FLD_PAR22_ROWNAMEVARIA = 5;
  public static int FLD_PAR22_RONAPRANINCO = 6;
  public static int FLD_PAR22_ROWNAMDESINT = 7;
  public static int FLD_PAR22_ROWNAMRIDEFL = 8;
  public static int FLD_PAR22_ROWNAMTOPETI = 9;

  // Definition of table: Par
  //
  public static int TBL_PAR8 = 537;
  public static int FLD_PAR8_ROWNAMEFINAN = 0;
  public static int FLD_PAR8_ROWNAMTIPESP = 1;
  public static int FLD_PAR8_ROWNAMTIDIAL = 2;
  public static int FLD_PAR8_ROWNAMDABISI = 3;
  public static int FLD_PAR8_ROWNAMDESINT = 4;
  public static int FLD_PAR8_ROWNAMEDETTA = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI264 = 538;
  public static int FLD_PARAMETRI264_ROWNAMEDASER = 0;
  public static int FLD_PARAMETRI264_ROWNAMEASERV = 1;
  public static int FLD_PARAMETRI264_ROWNAMDABISI = 2;
  public static int FLD_PARAMETRI264_ROWNAMDETCAP = 3;
  public static int FLD_PARAMETRI264_ROWNAMDESINT = 4;

  // Definition of table: Pars
  //
  public static int TBL_PARS25 = 539;
  public static int FLD_PARS25_NOMEOGGEPART = 0;
  public static int FLD_PARS25_NOMOGGCONPRE = 1;
  public static int FLD_PARS25_NOMOGGCODA20 = 2;
  public static int FLD_PARS25_NOOGSTNUDIPA = 3;
  public static int FLD_PARS25_NOMOGGTIESST = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI360 = 540;
  public static int FLD_PARAMETRI360_PARAMPARTE = 0;
  public static int FLD_PARAMETRI360_PAPRESDABISI = 1;
  public static int FLD_PARAMETRI360_PAESPLDABISI = 2;
  public static int FLD_PARAMETRI360_PARAMDETTAGL = 3;
  public static int FLD_PARAMETRI360_PARASERVOPER = 4;
  public static int FLD_PARAMETRI360_PATOPECEDICO = 5;
  public static int FLD_PARAMETRI360_PARAPREVEURO = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI362 = 541;
  public static int FLD_PARAMETRI362_PARAMPARTE = 0;
  public static int FLD_PARAMETRI362_PARAMDETTAGL = 1;
  public static int FLD_PARAMETRI362_PARASERVOPER = 2;
  public static int FLD_PARAMETRI362_PATOPECEDICO = 3;
  public static int FLD_PARAMETRI362_PARAPREVEURO = 4;
  public static int FLD_PARAMETRI362_PARAMDAL = 5;
  public static int FLD_PARAMETRI362_PARAMAL = 6;
  public static int FLD_PARAMETRI362_PARAMCOMMENT = 7;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE10 = 542;
  public static int FLD_NEWTABLE10_ROWNAMTISTRE = 0;
  public static int FLD_NEWTABLE10_ROWNAMRESEFF = 1;
  public static int FLD_NEWTABLE10_RONASTNUDIPA = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM91 = 543;
  public static int FLD_PARAM91_ROWNAMEES = 0;
  public static int FLD_PARAM91_ROWNAMDABISI = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS43 = 544;
  public static int FLD_PARS43_NOMEOGGEANOM = 0;
  public static int FLD_PARS43_NOMEOGGEPART = 1;
  public static int FLD_PARS43_NOMEOGGETIPO = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM152 = 545;
  public static int FLD_PARAM152_PARAPROGSTAM = 0;
  public static int FLD_PARAM152_PARAMESERCIZ = 1;
  public static int FLD_PARAM152_PARSTANUDIPA = 2;
  public static int FLD_PARAM152_PARAEXPINEXC = 3;
  public static int FLD_PARAM152_PARAMFONTE = 4;
  public static int FLD_PARAM152_PARASTAMSALV = 5;
  public static int FLD_PARAM152_PARASALVSTAM = 6;
  public static int FLD_PARAM152_PARANOTESTAM = 7;
  public static int FLD_PARAM152_PARAMIDSTAMP = 8;
  public static int FLD_PARAM152_PARANOMEFILE = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI690 = 546;
  public static int FLD_PARAMETRI690_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI690_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI690_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI690_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI690_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI690_PARANOMEFILE = 5;

  // Definition of table: Temp
  //
  public static int TBL_TEMP = 547;
  public static int FLD_TEMP_ROWNAMEESERC = 0;
  public static int FLD_TEMP_ROWNAMECODIC = 1;
  public static int FLD_TEMP_ROWNAMEVALOR = 2;
  public static int FLD_TEMP_ROWNAMESI = 3;
  public static int FLD_TEMP_ROWNAMENO = 4;
  public static int FLD_TEMP_ROWNAMESTATU = 5;
  public static int FLD_TEMP_ROWNAMEDESCR = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI669 = 548;
  public static int FLD_PARAMETRI669_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI669_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI669_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI669_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI669_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI669_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI670 = 549;
  public static int FLD_PARAMETRI670_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI670_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI670_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI670_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI670_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI670_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI671 = 550;
  public static int FLD_PARAMETRI671_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI671_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI671_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI671_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI671_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI671_PARANOMEFILE = 5;

  // Definition of table: Parametri Stampa FCDDE
  //
  public static int TBL_PARASTAMFCDD = 551;
  public static int FLD_PARASTAMFCDD_NOMOGGPROSTA = 0;
  public static int FLD_PARASTAMFCDD_NOMOGGNOMSTA = 1;
  public static int FLD_PARASTAMFCDD_NOOGSTNUDIPA = 2;
  public static int FLD_PARASTAMFCDD_NOMOGGNOTSTA = 3;
  public static int FLD_PARASTAMFCDD_NOMEOGGIDSTA = 4;
  public static int FLD_PARASTAMFCDD_NOMOGGNOMFIL = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI672 = 552;
  public static int FLD_PARAMETRI672_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI672_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI672_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI672_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI672_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI672_PARANOMEFILE = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM150 = 553;
  public static int FLD_PARAM150_ROWNAMEES = 0;
  public static int FLD_PARAM150_ROWNAMDETCAP = 1;
  public static int FLD_PARAM150_RONASOREDARI = 2;
  public static int FLD_PARAM150_RONAESIMACDC = 3;

  // Definition of table: Paramtri
  //
  public static int TBL_PARAMTRI = 554;
  public static int FLD_PARAMTRI_PARAPROGSTAM = 0;
  public static int FLD_PARAMTRI_PARANOMESTAM = 1;
  public static int FLD_PARAMTRI_PARSTANUDIPA = 2;
  public static int FLD_PARAMTRI_PARANOTESTAM = 3;
  public static int FLD_PARAMTRI_PARAMIDSTAMP = 4;
  public static int FLD_PARAMTRI_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI278 = 555;
  public static int FLD_PARAMETRI278_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI278_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI278_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI278_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI278_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI278_PARANOMEFILE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI366 = 556;
  public static int FLD_PARAMETRI366_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI366_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI366_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI366_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI366_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI366_PARANOMEFILE = 5;
  public static int FLD_PARAMETRI366_PARAMLOOKUP = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI674 = 557;
  public static int FLD_PARAMETRI674_PARAPROGSTAM = 0;
  public static int FLD_PARAMETRI674_PARANOMESTAM = 1;
  public static int FLD_PARAMETRI674_PARSTANUDIPA = 2;
  public static int FLD_PARAMETRI674_PARANOTESTAM = 3;
  public static int FLD_PARAMETRI674_PARAMIDSTAMP = 4;
  public static int FLD_PARAMETRI674_PARANOMEFILE = 5;
  public static int FLD_PARAMETRI674_PARAMLOOKUP = 6;

  // Definition of table: Parametri IN
  //
  public static int TBL_PARAMETRIIN = 558;
  public static int FLD_PARAMETRIIN_ROWNAMESTAMP = 0;
  public static int FLD_PARAMETRIIN_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRIIN_RONAMAOMIECS = 2;
  public static int FLD_PARAMETRIIN_ROWNAMDATELA = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM92 = 559;
  public static int FLD_PARAM92_ROWNAMEES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI197 = 560;
  public static int FLD_PARAMETRI197_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI197_RONAPAPEAZES = 1;
  public static int FLD_PARAMETRI197_ROWNAMECOPER = 2;
  public static int FLD_PARAMETRI197_ROWNAMECCONS = 3;
  public static int FLD_PARAMETRI197_ROWNAQRIGECA = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM75 = 561;
  public static int FLD_PARAM75_ROWNAMEES = 0;
  public static int FLD_PARAM75_ROWNAMEDETTA = 1;
  public static int FLD_PARAM75_ROWNAMMAGOMI = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI200 = 562;
  public static int FLD_PARAMETRI200_ROWNAMEPIADA = 0;
  public static int FLD_PARAMETRI200_ROWNAMEPDADA = 1;
  public static int FLD_PARAMETRI200_ROWNAMEPIDDA = 2;
  public static int FLD_PARAMETRI200_ROWNAMEPDDDA = 3;
  public static int FLD_PARAMETRI200_ROWNAMECFDC = 4;
  public static int FLD_PARAMETRI200_ROWNAMERFDC = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE12 = 563;
  public static int FLD_NEWTABLE12_ROWNAMESERVI = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR4 = 564;
  public static int FLD_PAR4_ROWNAMEPARTE = 0;
  public static int FLD_PAR4_ROWNAMEMOTIV = 1;
  public static int FLD_PAR4_ROWNAMTOPEMO = 2;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE14 = 565;
  public static int FLD_NEWTABLE14_ROWNAMESERVI = 0;
  public static int FLD_NEWTABLE14_ROWNAMDESINT = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR6 = 566;
  public static int FLD_PAR6_ROWNAMEPARTE = 0;
  public static int FLD_PAR6_ROWNAMEMOTIV = 1;
  public static int FLD_PAR6_ROWNAMTOPEMO = 2;
  public static int FLD_PAR6_ROWNAMDESINT = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM177 = 567;
  public static int FLD_PARAM177_PARAPROGSTAM = 0;
  public static int FLD_PARAM177_PARAMESERCIZ = 1;
  public static int FLD_PARAM177_PARAMISSTITO = 2;
  public static int FLD_PARAM177_PARAPROGTIPO = 3;
  public static int FLD_PARAM177_PARAENTRSPES = 4;
  public static int FLD_PARAM177_PARASUDSUPUO = 5;
  public static int FLD_PARAM177_PARAMSIGLA = 6;
  public static int FLD_PARAM177_PARAPROGUNIT = 7;
  public static int FLD_PARAM177_PARSTANUDIPA = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI198 = 568;
  public static int FLD_PARAMETRI198_ROWNAMEPERIO = 0;
  public static int FLD_PARAMETRI198_ROWNAMDATVAR = 1;
  public static int FLD_PARAMETRI198_ROWNAMDESBIL = 2;
  public static int FLD_PARAMETRI198_ROWNAMDESIMP = 3;
  public static int FLD_PARAMETRI198_ROWNAMEBILAN = 4;
  public static int FLD_PARAMETRI198_ROWNAMEIMPEG = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR18 = 569;
  public static int FLD_PAR18_ROWNAMUNIPRO = 0;
  public static int FLD_PAR18_ROWNAMNUMPRO = 1;
  public static int FLD_PAR18_ROWNAMANNPRO = 2;
  public static int FLD_PAR18_ROWNAMSOCODI = 3;
  public static int FLD_PAR18_ROWNAMETIPBI = 4;
  public static int FLD_PAR18_ROWNAMEVARIA = 5;
  public static int FLD_PAR18_ROWNAMSEDDEL = 6;
  public static int FLD_PAR18_ROWNAMNUMDEL = 7;
  public static int FLD_PAR18_ROWNAMANNDEL = 8;

  // Definition of table: Par
  //
  public static int TBL_PAR20 = 570;
  public static int FLD_PAR20_ROWNAMUNIPRO = 0;
  public static int FLD_PAR20_ROWNAMNUMPRO = 1;
  public static int FLD_PAR20_ROWNAMANNPRO = 2;
  public static int FLD_PAR20_ROWNAMETIPBI = 3;
  public static int FLD_PAR20_RONAESVADAGS = 4;
  public static int FLD_PAR20_ROWNAMTIPVAR = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI226 = 571;
  public static int FLD_PARAMETRI226_PARASEDEDELI = 0;
  public static int FLD_PARAMETRI226_PARANUMEDELI = 1;
  public static int FLD_PARAMETRI226_PARAANNODELI = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS72 = 572;
  public static int FLD_PARS72_ANNO_DEL = 0;
  public static int FLD_PARS72_NUMERO_DEL = 1;
  public static int FLD_PARS72_SEDE_DEL = 2;

  // Definition of table: IN
  //
  public static int TBL_IN14 = 573;
  public static int FLD_IN14_NOMEOGGEESER = 0;
  public static int FLD_IN14_NOMEOGGETTES = 1;
  public static int FLD_IN14_NOMEOGGECAPI = 2;
  public static int FLD_IN14_NOMEOGGEARTI = 3;
  public static int FLD_IN14_ANNO_DEL = 4;
  public static int FLD_IN14_NUMERO_DEL = 5;
  public static int FLD_IN14_SEDE_DEL = 6;

  // Definition of table: Param
  //
  public static int TBL_PARAM7 = 574;
  public static int FLD_PARAM7_ROWNAMDESLAB = 0;
  public static int FLD_PARAM7_ROWNAMUNIPRO = 1;
  public static int FLD_PARAM7_ROWNAMNUMPRO = 2;
  public static int FLD_PARAM7_ROWNAMANNPRO = 3;
  public static int FLD_PARAM7_ROWNAMETIPOL = 4;
  public static int FLD_PARAM7_ROWNAMEPLURI = 5;
  public static int FLD_PARAM7_ROWNAMDETIVA = 6;
  public static int FLD_PARAM7_ROWNAMTIPVAR = 7;
  public static int FLD_PARAM7_RONASOTOPON1 = 8;
  public static int FLD_PARAM7_RONASOTOENS1 = 9;
  public static int FLD_PARAM7_RONASOTOPONC = 10;
  public static int FLD_PARAM7_RONASOTOENSC = 11;
  public static int FLD_PARAM7_RONASOTOPON2 = 12;
  public static int FLD_PARAM7_RONASOTOENS2 = 13;
  public static int FLD_PARAM7_ROWNAMCONSVI = 14;
  public static int FLD_PARAM7_ROWNAMDIBIPE = 15;
  public static int FLD_PARAM7_ROWNAMEES = 16;
  public static int FLD_PARAM7_ROWNAMTIPQUA = 17;
  public static int FLD_PARAM7_ROWNAMQUAOBB = 18;
  public static int FLD_PARAM7_ROWNAMQUOBCA = 19;
  public static int FLD_PARAM7_RONASOTOENCO = 20;
  public static int FLD_PARAM7_RONASOTOSPCO = 21;
  public static int FLD_PARAM7_RONASOTOENCA = 22;
  public static int FLD_PARAM7_RONASOTOSPCA = 23;
  public static int FLD_PARAM7_RONASOTOIMSC = 24;
  public static int FLD_PARAM7_RONASOTOCASC = 25;
  public static int FLD_PARAM7_ROWNAMSEDDEL = 26;
  public static int FLD_PARAM7_ROWNAMNUMDEL = 27;
  public static int FLD_PARAM7_ROWNAMANNDEL = 28;
  public static int FLD_PARAM7_ROWNAMDELINS = 29;
  public static int FLD_PARAM7_ROWNAMPROINS = 30;
  public static int FLD_PARAM7_ROWNAMPARVAR = 31;
  public static int FLD_PARAM7_ROWNAMTIPIMP = 32;
  public static int FLD_PARAM7_ROWNAMPROPAR = 33;
  public static int FLD_PARAM7_ROWNAMEQUALE = 34;

  // Definition of table: Pos Pars
  //
  public static int TBL_POSPARS3 = 575;
  public static int FLD_POSPARS3_NOMEOGGETTES = 0;
  public static int FLD_POSPARS3_NOMEOGGECAPI = 1;
  public static int FLD_POSPARS3_NOMEOGGEARTI = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM10 = 576;
  public static int FLD_PARAM10_ESTRTIPOIMPO = 0;
  public static int FLD_PARAM10_ESTREMIPARTE = 1;
  public static int FLD_PARAM10_ESTRANCSUPLU = 2;
  public static int FLD_PARAM10_ESTRESEDEDEL = 3;
  public static int FLD_PARAM10_ESTRENUMEDEL = 4;
  public static int FLD_PARAM10_ESTREANNODEL = 5;
  public static int FLD_PARAM10_ESTRUNITPROP = 6;
  public static int FLD_PARAM10_ESTRNUMEPROP = 7;
  public static int FLD_PARAM10_ESTRANNOPROP = 8;
  public static int FLD_PARAM10_ESTRTIPOVARI = 9;
  public static int FLD_PARAM10_ESTRDEFIOPRO = 10;
  public static int FLD_PARAM10_ESTRANCHPLUR = 11;
  public static int FLD_PARAM10_ESTRPLURVISI = 12;
  public static int FLD_PARAM10_ESTRSESTECOD = 13;
  public static int FLD_PARAM10_ESTRSESTEFIN = 14;
  public static int FLD_PARAM10_ESTTIPVARDIV = 15;
  public static int FLD_PARAM10_ESTMULTIPVAR = 16;
  public static int FLD_PARAM10_ESTREMTIPOLO = 17;
  public static int FLD_PARAM10_ESTRTIPOREIS = 18;

  // Definition of table: Param
  //
  public static int TBL_PARAM20 = 577;
  public static int FLD_PARAM20_ROWNAMDESLAB = 0;
  public static int FLD_PARAM20_ROWNAMUNIPRO = 1;
  public static int FLD_PARAM20_ROWNAMNUMPRO = 2;
  public static int FLD_PARAM20_ROWNAMANNPRO = 3;
  public static int FLD_PARAM20_ROWNAMETIPOL = 4;
  public static int FLD_PARAM20_ROWNAMEPLURI = 5;
  public static int FLD_PARAM20_ROWNAMDETIVA = 6;
  public static int FLD_PARAM20_ROWNAMTIPVAR = 7;
  public static int FLD_PARAM20_RONASOTOPON1 = 8;
  public static int FLD_PARAM20_RONASOTOENS1 = 9;
  public static int FLD_PARAM20_RONASOTOPONC = 10;
  public static int FLD_PARAM20_RONASOTOENSC = 11;
  public static int FLD_PARAM20_RONASOTOPON2 = 12;
  public static int FLD_PARAM20_RONASOTOENS2 = 13;
  public static int FLD_PARAM20_ROWNAMCONSVI = 14;
  public static int FLD_PARAM20_ROWNAMDIBIPE = 15;
  public static int FLD_PARAM20_ROWNAMEES = 16;
  public static int FLD_PARAM20_ROWNAMTIPQUA = 17;
  public static int FLD_PARAM20_ROWNAMQUAOBB = 18;
  public static int FLD_PARAM20_ROWNAMQUOBCA = 19;
  public static int FLD_PARAM20_RONASOTOENCO = 20;
  public static int FLD_PARAM20_RONASOTOSPCO = 21;
  public static int FLD_PARAM20_RONASOTOENCA = 22;
  public static int FLD_PARAM20_RONASOTOSPCA = 23;
  public static int FLD_PARAM20_RONASOTOIMSC = 24;
  public static int FLD_PARAM20_RONASOTOCASC = 25;
  public static int FLD_PARAM20_ROWNAMDELINS = 26;
  public static int FLD_PARAM20_ROWNAMPROINS = 27;
  public static int FLD_PARAM20_ROWNAMSEDDEL = 28;
  public static int FLD_PARAM20_ROWNAMNUMDEL = 29;
  public static int FLD_PARAM20_ROWNAMANNDEL = 30;
  public static int FLD_PARAM20_ROWNAMPARVAR = 31;
  public static int FLD_PARAM20_ROWNAMTIPIMP = 32;
  public static int FLD_PARAM20_ROWNAMPROPAR = 33;
  public static int FLD_PARAM20_ROWNAMEQUALE = 34;

  // Definition of table: Pos Pars
  //
  public static int TBL_POSPARS = 578;
  public static int FLD_POSPARS_NOMEOGGETTES = 0;
  public static int FLD_POSPARS_NOMEOGGECAPI = 1;
  public static int FLD_POSPARS_NOMEOGGEARTI = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS93 = 579;
  public static int FLD_PARS93_NOMOGGUNIPRO = 0;
  public static int FLD_PARS93_NOMOGGNUMPRO = 1;
  public static int FLD_PARS93_NOMOGGANNPRO = 2;
  public static int FLD_PARS93_NOMEOGGETIPO = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS39 = 580;
  public static int FLD_PARS39_NOMOGGSEDDEL = 0;
  public static int FLD_PARS39_NOMOGGNUMDEL = 1;
  public static int FLD_PARS39_NOMOGGANNDEL = 2;
  public static int FLD_PARS39_NOMEOGGEPROP = 3;
  public static int FLD_PARS39_NOMEOGGENUME = 4;
  public static int FLD_PARS39_NOMEOGGEANNO = 5;
  public static int FLD_PARS39_NOMEOGGEDESC = 6;
  public static int FLD_PARS39_NOMOGGDATREG = 7;
  public static int FLD_PARS39_NOMOGGTIPVAR = 8;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO13 = 581;
  public static int FLD_PARAMETRIO13_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIO13_ARTICOLOOLD = 1;

  // Definition of table: Parametri Variazioni Impegnabile
  //
  public static int TBL_PARAVARIIMPE = 582;
  public static int FLD_PARAVARIIMPE_SEDE_DEL = 0;
  public static int FLD_PARAVARIIMPE_NUMERO_DEL = 1;
  public static int FLD_PARAVARIIMPE_ANNO_DEL = 2;
  public static int FLD_PARAVARIIMPE_UNITA_PROPONENTE = 3;
  public static int FLD_PARAVARIIMPE_NUMERO_PROPOSTA = 4;
  public static int FLD_PARAVARIIMPE_ANNO_PROPOSTA = 5;
  public static int FLD_PARAVARIIMPE_PARAINFODELI = 6;

  // Definition of table: Par
  //
  public static int TBL_PAR57 = 583;
  public static int FLD_PAR57_ROWNAMDETPRO = 0;

  // Definition of table: Par 2
  //
  public static int TBL_PAR2 = 584;
  public static int FLD_PAR2_ROWNAMNUMPRO = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR62 = 585;
  public static int FLD_PAR62_ROWNAMBOVAID = 0;
  public static int FLD_PAR62_RONADABOODAD = 1;
  public static int FLD_PAR62_ROWNAMEVARID = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS3 = 586;
  public static int FLD_PARS3_RONAANBOASAV = 0;
  public static int FLD_PARS3_ROWNAMEORDIN = 1;
  public static int FLD_PARS3_ROWNAMEVISUA = 2;
  public static int FLD_PARS3_ROWNAMEBOZZA = 3;
  public static int FLD_PARS3_ROWNAMCANINS = 4;

  // Definition of table: Pars
  //
  public static int TBL_PARS5 = 587;
  public static int FLD_PARS5_ROWNAMEVISUA = 0;
  public static int FLD_PARS5_ROWNAMEBOZZA = 1;
  public static int FLD_PARS5_ROWNAMVADEID = 2;
  public static int FLD_PARS5_ROWNAMEMODIF = 3;
  public static int FLD_PARS5_ROWNAMECOLLE = 4;
  public static int FLD_PARS5_ROWNAMEINSER = 5;
  public static int FLD_PARS5_RONAESCOREUN = 6;
  public static int FLD_PARS5_ROWNADACORE1 = 7;
  public static int FLD_PARS5_ROWNAMEMODUO = 8;
  public static int FLD_PARS5_RONAUODACOR1 = 9;

  // Definition of table: Pannello UO
  //
  public static int TBL_PANNELLOUO = 588;
  public static int FLD_PANNELLOUO_ROWNAMEPROUO = 0;

  // Definition of table: Old Values
  //
  public static int TBL_OLDVALUES = 589;
  public static int FLD_OLDVALUES_ROWNAMECAPIT = 0;
  public static int FLD_OLDVALUES_ROWNAMEARTIC = 1;
  public static int FLD_OLDVALUES_ROWNAMEES = 2;
  public static int FLD_OLDVALUES_ROWNAMEUO = 3;
  public static int FLD_OLDVALUES_ROWNAMEFATTO = 4;
  public static int FLD_OLDVALUES_ROWNAMECENTR = 5;
  public static int FLD_OLDVALUES_ROWNAMEPROGE = 6;
  public static int FLD_OLDVALUES_ROWNAMSCHOBI = 7;

  // Definition of table: Panel
  //
  public static int TBL_PANEL = 590;
  public static int FLD_PANEL_ROWNAMEFINAZ = 0;

  // Definition of table: FASULLO
  //
  public static int TBL_FASULLO = 591;
  public static int FLD_FASULLO_ROWNAMECOUNT = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR66 = 592;
  public static int FLD_PAR66_ROWNAMTIPCON = 0;
  public static int FLD_PAR66_ROWNAMEESERC = 1;
  public static int FLD_PAR66_ROWNAMSODINE = 2;
  public static int FLD_PAR66_ROWNAMSOPRAP = 3;

  // Definition of table: IN
  //
  public static int TBL_IN2 = 593;
  public static int FLD_IN2_ROWNAMEBOZZA = 0;
  public static int FLD_IN2_ROWNAMEFIRST = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR64 = 594;
  public static int FLD_PAR64_ROWNAMBOVAID = 0;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO3 = 595;
  public static int FLD_PANNELLO3_ROWNAMSOLAPP = 0;

  // Definition of table: Vars
  //
  public static int TBL_VARS4 = 596;
  public static int FLD_VARS4_ROWNAMEBOZZA = 0;
  public static int FLD_VARS4_ROWNAMETITOL = 1;
  public static int FLD_VARS4_ROWNAMETIPO = 2;
  public static int FLD_VARS4_ROWNAMESESCE = 3;
  public static int FLD_VARS4_ROWNAMECONTA = 4;
  public static int FLD_VARS4_ROWNAMECONT1 = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR67 = 597;
  public static int FLD_PAR67_ROWNAMBOVAID = 0;
  public static int FLD_PAR67_ROWNAMEFIRST = 1;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO5 = 598;
  public static int FLD_PANNELLO5_ROWNAMSOLAPP = 0;
  public static int FLD_PANNELLO5_ROWNAMTIPVAR = 1;
  public static int FLD_PANNELLO5_ROWNAMTIPQUA = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR69 = 599;
  public static int FLD_PAR69_ROWNAMEPARTE = 0;
  public static int FLD_PAR69_ROWNAMETIPO = 1;
  public static int FLD_PAR69_ROWNAMTIPVAR = 2;
  public static int FLD_PAR69_ROWNAMEESERC = 3;
  public static int FLD_PAR69_ROWNAMSOLAPP = 4;

  // Definition of table: IN
  //
  public static int TBL_IN3 = 600;
  public static int FLD_IN3_ROWNAMBOVAID = 0;
  public static int FLD_IN3_ROWNAMEFIRST = 1;

}
