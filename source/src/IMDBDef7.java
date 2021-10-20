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
public class IMDBDef7 extends Object
{
	// IMDB Constants
  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI113 = 1201;
  public static int FLD_PARAMETRI113_PARATIPOSTRU = 0;
  public static int FLD_PARAMETRI113_PARAPROUOSTR = 1;
  public static int FLD_PARAMETRI113_PARAMUOUTILI = 2;
  public static int FLD_PARAMETRI113_PARADATAELAB = 3;
  public static int FLD_PARAMETRI113_PARASOLOCOMP = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI114 = 1202;
  public static int FLD_PARAMETRI114_PARAANCUOSOT = 0;
  public static int FLD_PARAMETRI114_PARRESCOMENT = 1;
  public static int FLD_PARAMETRI114_PARASOLOPROV = 2;
  public static int FLD_PARAMETRI114_PARASOLOPREN = 3;
  public static int FLD_PARAMETRI114_PARASOLODISP = 4;
  public static int FLD_PARAMETRI114_PARAMUOUTILI = 5;
  public static int FLD_PARAMETRI114_PARADATAELAB = 6;
  public static int FLD_PARAMETRI114_PARATIPOSTRU = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI115 = 1203;
  public static int FLD_PARAMETRI115_PARATIPOSTRU = 0;
  public static int FLD_PARAMETRI115_PARAPROUOSTR = 1;
  public static int FLD_PARAMETRI115_PARRESCOMENT = 2;
  public static int FLD_PARAMETRI115_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI115_PARADATAELAB = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI117 = 1204;
  public static int FLD_PARAMETRI117_PARAANCUOSOT = 0;
  public static int FLD_PARAMETRI117_PARRESCOMENT = 1;
  public static int FLD_PARAMETRI117_PARASOLOPROV = 2;
  public static int FLD_PARAMETRI117_PARASOLODISP = 3;
  public static int FLD_PARAMETRI117_PARAMUOUTILI = 4;
  public static int FLD_PARAMETRI117_PARADATAELAB = 5;
  public static int FLD_PARAMETRI117_PARATIPOSTRU = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI118 = 1205;
  public static int FLD_PARAMETRI118_PARATIPOSTRU = 0;
  public static int FLD_PARAMETRI118_PARAPROUOSTR = 1;
  public static int FLD_PARAMETRI118_PARRESCOMENT = 2;
  public static int FLD_PARAMETRI118_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI118_PARADATAELAB = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI120 = 1206;
  public static int FLD_PARAMETRI120_PARAANCUOSOT = 0;
  public static int FLD_PARAMETRI120_PARRESCOMENT = 1;
  public static int FLD_PARAMETRI120_PARASOLODISP = 2;
  public static int FLD_PARAMETRI120_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI120_PARADATAELAB = 4;
  public static int FLD_PARAMETRI120_PARATIPOSTRU = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI121 = 1207;
  public static int FLD_PARAMETRI121_PARATIPOSTRU = 0;
  public static int FLD_PARAMETRI121_PARAPROUOSTR = 1;
  public static int FLD_PARAMETRI121_PARRESCOMENT = 2;
  public static int FLD_PARAMETRI121_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI121_PARADATAELAB = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI416 = 1208;
  public static int FLD_PARAMETRI416_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI416_PARATIPOESPL = 1;
  public static int FLD_PARAMETRI416_PARAMTITOLO = 2;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ2 = 1209;
  public static int FLD_PARAMEPOSIZ2_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ2_POSLEFT = 1;

  // Definition of table: Importivar
  //
  public static int TBL_IMPORTIVAR = 1210;
  public static int FLD_IMPORTIVAR_NOMEOGGEVAR1 = 0;
  public static int FLD_IMPORTIVAR_NOMEOGGEVAR2 = 1;
  public static int FLD_IMPORTIVAR_NOMEOGGEVARI = 2;
  public static int FLD_IMPORTIVAR_NOMEOGGEVARP = 3;
  public static int FLD_IMPORTIVAR_NOMEOGGEVAR3 = 4;
  public static int FLD_IMPORTIVAR_NOMEOGGEVARS = 5;
  public static int FLD_IMPORTIVAR_NOMEOGGEVAR4 = 6;
  public static int FLD_IMPORTIVAR_NOMEOGGEVARC = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI425 = 1211;
  public static int FLD_PARAMETRI425_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI425_PARATIPOESPL = 1;
  public static int FLD_PARAMETRI425_PARAMPARTE = 2;
  public static int FLD_PARAMETRI425_PARAMTITOLO = 3;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ5 = 1212;
  public static int FLD_PARAMEPOSIZ5_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ5_POSLEFT = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI426 = 1213;
  public static int FLD_PARAMETRI426_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI426_PARATIPOESPL = 1;
  public static int FLD_PARAMETRI426_PARAMPARTE = 2;
  public static int FLD_PARAMETRI426_PARAMTITOLO = 3;
  public static int FLD_PARAMETRI426_PARAAGGDAFUO = 4;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ6 = 1214;
  public static int FLD_PARAMEPOSIZ6_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ6_POSLEFT = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI480 = 1215;
  public static int FLD_PARAMETRI480_NOMOGGESEPLU = 0;
  public static int FLD_PARAMETRI480_NOMOGGCAPPAR = 1;
  public static int FLD_PARAMETRI480_NOMOGGARTPAR = 2;
  public static int FLD_PARAMETRI480_NOOGTOPEANFE = 3;
  public static int FLD_PARAMETRI480_NOOGTOPEANFC = 4;
  public static int FLD_PARAMETRI480_NOOGTOPEAFCO = 5;
  public static int FLD_PARAMETRI480_NOOGTOPECAPC = 6;
  public static int FLD_PARAMETRI480_NOOGTOPCAPCO = 7;
  public static int FLD_PARAMETRI480_NOMOGGTIPSTA = 8;
  public static int FLD_PARAMETRI480_NOMEOGGEORDI = 9;

  // Definition of table: Capitoli FPV
  //
  public static int TBL_CAPITOLIFPV = 1216;
  public static int FLD_CAPITOLIFPV_CAPITOLO_FPV = 0;
  public static int FLD_CAPITOLIFPV_ARTICOLO_FPV = 1;
  public static int FLD_CAPITOLIFPV_DESCRIZIONE_CAP_FPV = 2;
  public static int FLD_CAPITOLIFPV_CODICE_STRUTTURA_CAP_FPV = 3;
  public static int FLD_CAPITOLIFPV_MISSIONE = 4;
  public static int FLD_CAPITOLIFPV_PROGRAMMA = 5;
  public static int FLD_CAPITOLIFPV_TITOLO = 6;

  // Definition of table: Capitoli
  //
  public static int TBL_CAPITOLI = 1217;
  public static int FLD_CAPITOLI_CAPITOLO_FPV = 0;
  public static int FLD_CAPITOLI_ARTICOLO_FPV = 1;
  public static int FLD_CAPITOLI_DESCRIZIONE_CAP_FPV = 2;
  public static int FLD_CAPITOLI_MISSIONE = 3;
  public static int FLD_CAPITOLI_PROGRAMMA = 4;
  public static int FLD_CAPITOLI_TITOLO = 5;
  public static int FLD_CAPITOLI_IMPORTO_FPV_ESIG = 6;
  public static int FLD_CAPITOLI_IMPORTO_FPV_CRONO = 7;
  public static int FLD_CAPITOLI_ANNO_ENTRATA = 8;
  public static int FLD_CAPITOLI_CAPANNODESTI = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI190 = 1218;
  public static int FLD_PARAMETRI190_NOMOGGESEPLU = 0;
  public static int FLD_PARAMETRI190_NOMOGGCAPPAR = 1;
  public static int FLD_PARAMETRI190_NOMOGGARTPAR = 2;
  public static int FLD_PARAMETRI190_NOOGTOPEAMPE = 3;
  public static int FLD_PARAMETRI190_NOOGTOPEAMPC = 4;
  public static int FLD_PARAMETRI190_NOMOGGTIPSTA = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI201 = 1219;
  public static int FLD_PARAMETRI201_PARAMPROGRES = 0;
  public static int FLD_PARAMETRI201_PARAESIGCRON = 1;
  public static int FLD_PARAMETRI201_UNITA_PROPONENTE = 2;
  public static int FLD_PARAMETRI201_NUMERO_PROPOSTA = 3;
  public static int FLD_PARAMETRI201_ANNO_PROPOSTA = 4;
  public static int FLD_PARAMETRI201_SEDE_DEL = 5;
  public static int FLD_PARAMETRI201_NUMERO_DEL = 6;
  public static int FLD_PARAMETRI201_ANNO_DEL = 7;
  public static int FLD_PARAMETRI201_D_DATA_REG = 8;
  public static int FLD_PARAMETRI201_TIPO_VAR = 9;
  public static int FLD_PARAMETRI201_DESCRIZIONE = 10;

  // Definition of table: Parscrono
  //
  public static int TBL_PARSCRONO = 1220;
  public static int FLD_PARSCRONO_NOMEOGGECRON = 0;
  public static int FLD_PARSCRONO_NOMEOGGECAPI = 1;
  public static int FLD_PARSCRONO_NOMEOGGEARTI = 2;
  public static int FLD_PARSCRONO_NOMOGGANNPLU = 3;
  public static int FLD_PARSCRONO_NOMEOGGEFINA = 4;
  public static int FLD_PARSCRONO_NOMEOGGEIMPO = 5;

  // Definition of table: FINANZIAMENTI
  //
  public static int TBL_FINANZIAME29 = 1221;
  public static int FLD_FINANZIAME29_FINANZIAMENTO = 0;
  public static int FLD_FINANZIAME29_DES_FINANZIAMENTO = 1;
  public static int FLD_FINANZIAME29_FINANZIMPORT = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI501 = 1222;
  public static int FLD_PARAMETRI501_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI501_PARAMSTANATT = 1;
  public static int FLD_PARAMETRI501_PARSTAATTESI = 2;
  public static int FLD_PARAMETRI501_PARSTAATTSTN = 3;
  public static int FLD_PARAMETRI501_PARSTAATTCAS = 4;
  public static int FLD_PARAMETRI501_PARAMDISPONI = 5;
  public static int FLD_PARAMETRI501_PARAMDISPESI = 6;
  public static int FLD_PARAMETRI501_PARAMDISPSTN = 7;
  public static int FLD_PARAMETRI501_PARADISPCASS = 8;
  public static int FLD_PARAMETRI501_PARVARPROTOT = 9;
  public static int FLD_PARAMETRI501_PARVARPROPUR = 10;
  public static int FLD_PARAMETRI501_PARVARPROESI = 11;
  public static int FLD_PARAMETRI501_PARVARPROSTN = 12;
  public static int FLD_PARAMETRI501_PARVARPROCAS = 13;
  public static int FLD_PARAMETRI501_PARSTAATTOPR = 14;
  public static int FLD_PARAMETRI501_PARSTAATPUPR = 15;
  public static int FLD_PARAMETRI501_PARSTAATESPR = 16;
  public static int FLD_PARAMETRI501_PARSTAATSTPR = 17;
  public static int FLD_PARAMETRI501_PARSTAATCAPR = 18;
  public static int FLD_PARAMETRI501_PARDISTOTPRO = 19;
  public static int FLD_PARAMETRI501_PARDISPURPRO = 20;
  public static int FLD_PARAMETRI501_PARDISESIPRO = 21;
  public static int FLD_PARAMETRI501_PARDISSTNPRO = 22;
  public static int FLD_PARAMETRI501_PARDISCASPRO = 23;

  // Definition of table: Pars
  //
  public static int TBL_PARS81 = 1223;
  public static int FLD_PARS81_NOMEOGGETTES = 0;
  public static int FLD_PARS81_NOMOGGVAPUPO = 1;
  public static int FLD_PARS81_NOMOGGVAPUNE = 2;
  public static int FLD_PARS81_NOMOGGVAIMPO = 3;
  public static int FLD_PARS81_NOMOGGVAIMNE = 4;
  public static int FLD_PARS81_NOMOGGVASTPO = 5;
  public static int FLD_PARS81_NOMOGGVASTNE = 6;
  public static int FLD_PARS81_NOMOGGVACAPO = 7;
  public static int FLD_PARS81_NOMOGGVACANE = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI546 = 1224;
  public static int FLD_PARAMETRI546_NOMOGGESEPLU = 0;
  public static int FLD_PARAMETRI546_NOOGTOPEANFE = 1;
  public static int FLD_PARAMETRI546_NOOGTOPEANFC = 2;
  public static int FLD_PARAMETRI546_NOOGTOPEAFCO = 3;
  public static int FLD_PARAMETRI546_NOOGTOPECAPC = 4;
  public static int FLD_PARAMETRI546_NOOGTOPCAPCO = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM8 = 1225;
  public static int FLD_PARAM8_NOMEOGGECODI = 0;
  public static int FLD_PARAM8_NOMEOGGECHIU = 1;
  public static int FLD_PARAM8_NOMEOGGEGENE = 2;

  // Definition of table: Finanziamento
  //
  public static int TBL_FINANZIAMENT = 1226;
  public static int FLD_FINANZIAMENT_NOMEOGGEFINO = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM9 = 1227;
  public static int FLD_PARAM9_NOMEOGGECODI = 0;
  public static int FLD_PARAM9_NOMEOGGEDESC = 1;
  public static int FLD_PARAM9_NOMEOGGETIPO = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM116 = 1228;
  public static int FLD_PARAM116_NOMEOGGETIPO = 0;
  public static int FLD_PARAM116_NOMEOGGEESER = 1;
  public static int FLD_PARAM116_NOMOGGSOPRAP = 2;
  public static int FLD_PARAM116_NOMOGGSOSEDI = 3;
  public static int FLD_PARAM116_NOMEOGGEASSE = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM114 = 1229;
  public static int FLD_PARAM114_NOMOGGSOPRAP = 0;
  public static int FLD_PARAM114_NOMOGGTIPVAR = 1;
  public static int FLD_PARAM114_NOMEOGGEASSE = 2;

  // Definition of table: Quadratura
  //
  public static int TBL_QUADRATURA = 1230;
  public static int FLD_QUADRATURA_NOMEOGGEIMP4 = 0;
  public static int FLD_QUADRATURA_NOMEOGGEIMP5 = 1;
  public static int FLD_QUADRATURA_NOMEOGGEIMP6 = 2;
  public static int FLD_QUADRATURA_NOMEOGGEIMP1 = 3;
  public static int FLD_QUADRATURA_NOMEOGGEIMP2 = 4;
  public static int FLD_QUADRATURA_NOMEOGGEIMP3 = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM118 = 1231;
  public static int FLD_PARAM118_NOMEOGGEASSE = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM119 = 1232;
  public static int FLD_PARAM119_NOMEOGGEVARI = 0;
  public static int FLD_PARAM119_NOMOGGDATVAR = 1;
  public static int FLD_PARAM119_NOMEOGGEPROP = 2;
  public static int FLD_PARAM119_NOMOGGNUMPRO = 3;
  public static int FLD_PARAM119_NOMOGGANNPRO = 4;
  public static int FLD_PARAM119_NOMEOGGEDELI = 5;
  public static int FLD_PARAM119_NOMOGGNUMDEL = 6;
  public static int FLD_PARAM119_NOMOGGANNDEL = 7;
  public static int FLD_PARAM119_NOMEOGGEASSE = 8;

  // Definition of table: Param
  //
  public static int TBL_PARAM142 = 1233;
  public static int FLD_PARAM142_NOMEOGGEASSE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI421 = 1234;
  public static int FLD_PARAMETRI421_PARAMANNO = 0;
  public static int FLD_PARAMETRI421_PARAMNUMERO = 1;
  public static int FLD_PARAMETRI421_PARAMTIPO = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM143 = 1235;
  public static int FLD_PARAM143_NOMEOGGEPART = 0;
  public static int FLD_PARAM143_NOMOGGMAGMIN = 1;
  public static int FLD_PARAM143_NOMOGGDATELA = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM141 = 1236;
  public static int FLD_PARAM141_NOMEOGGETTES = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM102 = 1237;
  public static int FLD_PARAM102_NOMEOGGEPART = 0;
  public static int FLD_PARAM102_NOMOGGMAGMIN = 1;
  public static int FLD_PARAM102_NOMOGGDATELA = 2;
  public static int FLD_PARAM102_NOMEOGGEDETT = 3;

  // Definition of table: Parametri IN
  //
  public static int TBL_PARAMETRIIN3 = 1238;
  public static int FLD_PARAMETRIIN3_ROWNAMGEDEEN = 0;
  public static int FLD_PARAMETRIIN3_RONAMAOMIECS = 1;
  public static int FLD_PARAMETRIIN3_ROWNAMELDERI = 2;
  public static int FLD_PARAMETRIIN3_RONAMAOMECS1 = 3;
  public static int FLD_PARAMETRIIN3_ROWNAMGEDESP = 4;
  public static int FLD_PARAMETRIIN3_RONAMAOMECS2 = 5;
  public static int FLD_PARAMETRIIN3_RONAFUDEDERE = 6;
  public static int FLD_PARAMETRIIN3_RONAMAOMECS3 = 7;
  public static int FLD_PARAMETRIIN3_RONACOCOEDIN = 8;
  public static int FLD_PARAMETRIIN3_RONAMAOMECS4 = 9;
  public static int FLD_PARAMETRIIN3_RONAQUGERIDE = 10;
  public static int FLD_PARAMETRIIN3_RONAQUGERIDS = 11;
  public static int FLD_PARAMETRIIN3_ROWNAMQURIDI = 12;
  public static int FLD_PARAMETRIIN3_RONAQURIGECO = 13;
  public static int FLD_PARAMETRIIN3_RONAQURIGEFI = 14;
  public static int FLD_PARAMETRIIN3_ROWNAMPARDEF = 15;
  public static int FLD_PARAMETRIIN3_ROWNAMPRDICO = 16;
  public static int FLD_PARAMETRIIN3_ROWNAMCONECO = 17;
  public static int FLD_PARAMETRIIN3_ROWNAMCODEPA = 18;
  public static int FLD_PARAMETRIIN3_RONAMOPADIST = 19;
  public static int FLD_PARAMETRIIN3_ROWNAMINCONA = 20;
  public static int FLD_PARAMETRIIN3_ROWNAMESERIF = 21;
  public static int FLD_PARAMETRIIN3_ROWNAMETRIME = 22;
  public static int FLD_PARAMETRIIN3_ROWNAMETRIM1 = 23;
  public static int FLD_PARAMETRIIN3_ROWNAMEPERIO = 24;
  public static int FLD_PARAMETRIIN3_ROWNAMEPERI1 = 25;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI586 = 1239;
  public static int FLD_PARAMETRI586_PDATAELABORA = 0;
  public static int FLD_PARAMETRI586_PTIPOESTRSTA = 1;
  public static int FLD_PARAMETRI586_PPARAMETLINK = 2;
  public static int FLD_PARAMETRI586_PENTRATSPESA = 3;

  // Definition of table: Parametri Nr6
  //
  public static int TBL_PARAMETRINR6 = 1240;
  public static int FLD_PARAMETRINR6_P6FONTE = 0;
  public static int FLD_PARAMETRINR6_P6IMPORTO1 = 1;
  public static int FLD_PARAMETRINR6_P6IMPORVARI1 = 2;
  public static int FLD_PARAMETRINR6_P6IMPORTO2 = 3;
  public static int FLD_PARAMETRINR6_P6IMPORVARI2 = 4;
  public static int FLD_PARAMETRINR6_P6IMPORTO3 = 5;
  public static int FLD_PARAMETRINR6_P6IMPORVARI3 = 6;
  public static int FLD_PARAMETRINR6_P6IMPORTO4 = 7;
  public static int FLD_PARAMETRINR6_P6IMPORVARI4 = 8;
  public static int FLD_PARAMETRINR6_P6IMPORTO5 = 9;
  public static int FLD_PARAMETRINR6_P6IMPORVARI5 = 10;
  public static int FLD_PARAMETRINR6_P6IMPORTO6 = 11;
  public static int FLD_PARAMETRINR6_P6IMPORVARI6 = 12;
  public static int FLD_PARAMETRINR6_P6IMPORTO7 = 13;
  public static int FLD_PARAMETRINR6_P6IMPORVARI7 = 14;
  public static int FLD_PARAMETRINR6_P6IMPORTO8 = 15;
  public static int FLD_PARAMETRINR6_P6IMPORVARI8 = 16;
  public static int FLD_PARAMETRINR6_P6IMPORTO9 = 17;
  public static int FLD_PARAMETRINR6_P6IMPORVARIA = 18;
  public static int FLD_PARAMETRINR6_P6IMPORTO10 = 19;
  public static int FLD_PARAMETRINR6_P6IMPOVARI10 = 20;
  public static int FLD_PARAMETRINR6_P6IMPORTO11 = 21;
  public static int FLD_PARAMETRINR6_P6IMPOVARI11 = 22;
  public static int FLD_PARAMETRINR6_P6VARIAZIONI = 23;
  public static int FLD_PARAMETRINR6_P6SEDEDELIBE = 24;
  public static int FLD_PARAMETRINR6_P6NUMERDELIB = 25;
  public static int FLD_PARAMETRINR6_P6ANNODELIBE = 26;
  public static int FLD_PARAMETRINR6_P6UNITAPROPO = 27;
  public static int FLD_PARAMETRINR6_P6NUMERPROPO = 28;
  public static int FLD_PARAMETRINR6_P6ANNOPROPOS = 29;

  // Definition of table: Parametri Nr8b
  //
  public static int TBL_PARAMETRNR8B = 1241;
  public static int FLD_PARAMETRNR8B_PIMPORTO11 = 0;
  public static int FLD_PARAMETRNR8B_PIMPORTO12 = 1;
  public static int FLD_PARAMETRNR8B_PIMPORTO13 = 2;
  public static int FLD_PARAMETRNR8B_PIMPORTO14 = 3;
  public static int FLD_PARAMETRNR8B_PIMPORTO15 = 4;
  public static int FLD_PARAMETRNR8B_PIMPORTO16 = 5;
  public static int FLD_PARAMETRNR8B_PIMPORTO21 = 6;
  public static int FLD_PARAMETRNR8B_PIMPORTO22 = 7;
  public static int FLD_PARAMETRNR8B_PIMPORTO23 = 8;
  public static int FLD_PARAMETRNR8B_PIMPORTO24 = 9;
  public static int FLD_PARAMETRNR8B_PIMPORTO25 = 10;
  public static int FLD_PARAMETRNR8B_PIMPORTO26 = 11;
  public static int FLD_PARAMETRNR8B_PIMPORTO31 = 12;
  public static int FLD_PARAMETRNR8B_PIMPORTO32 = 13;
  public static int FLD_PARAMETRNR8B_PIMPORTO33 = 14;
  public static int FLD_PARAMETRNR8B_PIMPORTO34 = 15;
  public static int FLD_PARAMETRNR8B_PIMPORTO35 = 16;
  public static int FLD_PARAMETRNR8B_PIMPORTO36 = 17;
  public static int FLD_PARAMETRNR8B_PIMPORTO41 = 18;
  public static int FLD_PARAMETRNR8B_PIMPORTO42 = 19;
  public static int FLD_PARAMETRNR8B_PIMPORTO43 = 20;
  public static int FLD_PARAMETRNR8B_PIMPORTO44 = 21;
  public static int FLD_PARAMETRNR8B_PIMPORTO45 = 22;
  public static int FLD_PARAMETRNR8B_PIMPORTO46 = 23;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI584 = 1242;
  public static int FLD_PARAMETRI584_PARAMEDESCRI = 0;
  public static int FLD_PARAMETRI584_PARAMETRHASH = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI489 = 1243;
  public static int FLD_PARAMETRI489_PARAMPARTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI491 = 1244;
  public static int FLD_PARAMETRI491_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI491_PARAMPARTE = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI493 = 1245;
  public static int FLD_PARAMETRI493_PARAMLIVELL4 = 0;
  public static int FLD_PARAMETRI493_PARAMLIVELL5 = 1;
  public static int FLD_PARAMETRI493_PARAMPARTE = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI548 = 1246;
  public static int FLD_PARAMETRI548_PARAMCODEURO = 0;
  public static int FLD_PARAMETRI548_PARAMPARTE = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI496 = 1247;
  public static int FLD_PARAMETRI496_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI496_PARAMPARTE = 1;
  public static int FLD_PARAMETRI496_PARATIPOCONT = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI497 = 1248;
  public static int FLD_PARAMETRI497_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI497_PARAMPARTE = 1;
  public static int FLD_PARAMETRI497_PARATIPOCONT = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI614 = 1249;
  public static int FLD_PARAMETRI614_PARAMXML = 0;
  public static int FLD_PARAMETRI614_PARAMIDXDS = 1;
  public static int FLD_PARAMETRI614_PARANOMEFILE = 2;
  public static int FLD_PARAMETRI614_PARAFILESIZE = 3;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO = 1250;
  public static int FLD_FILTRO_NOMEOGGETIPO = 0;
  public static int FLD_FILTRO_NOMEOGGDATDA = 1;
  public static int FLD_FILTRO_NOOGINSORERE = 2;
  public static int FLD_FILTRO_NOMEOGGEARGO = 3;
  public static int FLD_FILTRO_NOMOGGTIPERR = 4;
  public static int FLD_FILTRO_NOMOGGTIPWAR = 5;
  public static int FLD_FILTRO_NOMOGGTIPLOG = 6;

  // Definition of table: PARAMETRI
  //
  public static int TBL_PARAMETRI689 = 1251;
  public static int FLD_PARAMETRI689_NOMOGGFORCAP = 0;
  public static int FLD_PARAMETRI689_COD_STAMPA = 1;
  public static int FLD_PARAMETRI689_NOMOGGDATELA = 2;
  public static int FLD_PARAMETRI689_NOMOGGDAFITR = 3;
  public static int FLD_PARAMETRI689_NOMEOGGEVARI = 4;
  public static int FLD_PARAMETRI689_NOMOGGSEDDEL = 5;
  public static int FLD_PARAMETRI689_NOMOGGNUMDEL = 6;
  public static int FLD_PARAMETRI689_NOMOGGANNDEL = 7;
  public static int FLD_PARAMETRI689_NOMOGGUNIPRO = 8;
  public static int FLD_PARAMETRI689_NOMOGGNUMPRO = 9;
  public static int FLD_PARAMETRI689_NOMOGGANNPRO = 10;
  public static int FLD_PARAMETRI689_NOMOGGNOMSTA = 11;
  public static int FLD_PARAMETRI689_NOOGSTNUDIPA = 12;
  public static int FLD_PARAMETRI689_NOMOGGNOTSTA = 13;
  public static int FLD_PARAMETRI689_NOMEOGGIDSTA = 14;
  public static int FLD_PARAMETRI689_NOMOGGNOMFIL = 15;

  // Definition of table: PARAMETRI STAMPE
  //
  public static int TBL_PARAMETRI_STAMPE = 1252;
  public static int FLD_PARAMETRI_STAMPE_COD_STAMPA = 0;
  public static int FLD_PARAMETRI_STAMPE_COD_PARAM = 1;
  public static int FLD_PARAMETRI_STAMPE_ORDINE = 2;
  public static int FLD_PARAMETRI_STAMPE_ESERCIZIO = 3;
  public static int FLD_PARAMETRI_STAMPE_IMPORTO_1 = 4;
  public static int FLD_PARAMETRI_STAMPE_IMPORTO_2 = 5;
  public static int FLD_PARAMETRI_STAMPE_IMPORTO_3 = 6;
  public static int FLD_PARAMETRI_STAMPE_LABEL_RIGA = 7;
  public static int FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI = 8;
  public static int FLD_PARAMETRI_STAMPE_LABEL_COL_IMP1 = 9;
  public static int FLD_PARAMETRI_STAMPE_LABEL_COL_IMP2 = 10;
  public static int FLD_PARAMETRI_STAMPE_LABEL_COL_IMP3 = 11;
  public static int FLD_PARAMETRI_STAMPE_PARASTAMSTAT = 12;

  // Definition of table: Parametrialbero
  //
  public static int TBL_PARAMETRIALB = 1253;
  public static int FLD_PARAMETRIALB_NOMEOGGETIPO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI94 = 1254;
  public static int FLD_PARAMETRI94_NOMOGGRICDES = 0;
  public static int FLD_PARAMETRI94_NOMEOGGEHASH = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI64 = 1255;
  public static int FLD_PARAMETRI64_NOMEOGGETPID = 0;
  public static int FLD_PARAMETRI64_NOMEOGGEDUPL = 1;
  public static int FLD_PARAMETRI64_NOMOGGSOLVIS = 2;
  public static int FLD_PARAMETRI64_NOMOGGCATALB = 3;
  public static int FLD_PARAMETRI64_NOMEOGGECANC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI98 = 1256;
  public static int FLD_PARAMETRI98_NOMEOGGSELID = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI88 = 1257;
  public static int FLD_PARAMETRI88_NOMEOGGETPID = 0;
  public static int FLD_PARAMETRI88_NOMEOGGEDUPL = 1;
  public static int FLD_PARAMETRI88_NOMEOGGVALAL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI685 = 1258;
  public static int FLD_PARAMETRI685_ID_SELECT = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI686 = 1259;
  public static int FLD_PARAMETRI686_ID_SELECT = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI99 = 1260;
  public static int FLD_PARAMETRI99_NOMOGGANCELI = 0;
  public static int FLD_PARAMETRI99_NOMOGGCODSEL = 1;
  public static int FLD_PARAMETRI99_NOMEOGGVALAL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI687 = 1261;
  public static int FLD_PARAMETRI687_ID_SELECT = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI = 1262;
  public static int FLD_PARAMETRI_ID_SELECT = 0;
  public static int FLD_PARAMETRI_NOMEOGGEQUER = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM = 1263;
  public static int FLD_PARAM_NOOGSTNUDIPA = 0;
  public static int FLD_PARAM_NOMEOGGETITO = 1;
  public static int FLD_PARAM_NOMEOGGESTAM = 2;

  // Definition of table: Parametri Stampa Si4print
  //
  public static int TBL_PARASTAMSI4P = 1264;
  public static int FLD_PARASTAMSI4P_PARAMETRO = 0;
  public static int FLD_PARASTAMSI4P_PARAMEPROGRE = 1;

  // Definition of table: Dati Stampe Si4print
  //
  public static int TBL_DATISTAMSI4P = 1265;
  public static int FLD_DATISTAMSI4P_PARPERDELSER = 0;
  public static int FLD_DATISTAMSI4P_PARANOMEESEG = 1;
  public static int FLD_DATISTAMSI4P_PARASERVNAME = 2;
  public static int FLD_DATISTAMSI4P_PARCODISTAD4 = 3;
  public static int FLD_DATISTAMSI4P_PASTDAEORAFP = 4;
  public static int FLD_DATISTAMSI4P_PARAPERCAPPL = 5;
  public static int FLD_DATISTAMSI4P_PARDATURLMAI = 6;

  // Definition of table: Dati Sessione
  //
  public static int TBL_DATISESSIONE = 1266;
  public static int FLD_DATISESSIONE_SESSUSERNAME = 0;
  public static int FLD_DATISESSIONE_SESSIONOMINA = 1;
  public static int FLD_DATISESSIONE_SESSIOISTANZ = 2;
  public static int FLD_DATISESSIONE_SESSIOESERCI = 3;
  public static int FLD_DATISESSIONE_SESSIONEENTE = 4;
  public static int FLD_DATISESSIONE_SESSIOMODULO = 5;
  public static int FLD_DATISESSIONE_SESSIONRUOLO = 6;
  public static int FLD_DATISESSIONE_SESSIPROGRU1 = 7;
  public static int FLD_DATISESSIONE_SESSIDESCRUO = 8;
  public static int FLD_DATISESSIONE_SESSCFPEATTI = 9;
  public static int FLD_DATISESSIONE_SESSPERCIMMA = 10;
  public static int FLD_DATISESSIONE_SESSIOPROGET = 11;
  public static int FLD_DATISESSIONE_SESSVERSPROD = 12;
  public static int FLD_DATISESSIONE_SESSIOUFFICI = 13;
  public static int FLD_DATISESSIONE_SESSIRPPATTI = 14;

  // Definition of table: Valori Nodo Corrente
  //
  public static int TBL_VALONODOCORR = 1267;
  public static int FLD_VALONODOCORR_NODOCORTIPUO = 0;
  public static int FLD_VALONODOCORR_NODCORTIPRAM = 1;
  public static int FLD_VALONODOCORR_NODCORDESRAM = 2;
  public static int FLD_VALONODOCORR_NODOCORRENES = 3;
  public static int FLD_VALONODOCORR_NODCORCOBEDE = 4;
  public static int FLD_VALONODOCORR_NODCORSEDDEL = 5;
  public static int FLD_VALONODOCORR_NODCORNUMDEL = 6;
  public static int FLD_VALONODOCORR_NODCORANNDEL = 7;
  public static int FLD_VALONODOCORR_NODOCORRTITO = 8;
  public static int FLD_VALONODOCORR_NODCORCATINT = 9;
  public static int FLD_VALONODOCORR_NODCORCODTER = 10;
  public static int FLD_VALONODOCORR_NODCORRISINT = 11;
  public static int FLD_VALONODOCORR_NODOCORRCAPI = 12;
  public static int FLD_VALONODOCORR_NODOCORRARTI = 13;
  public static int FLD_VALONODOCORR_NODCORANIMAC = 14;
  public static int FLD_VALONODOCORR_NODCORNUIMAC = 15;
  public static int FLD_VALONODOCORR_NODCORANSUIM = 16;
  public static int FLD_VALONODOCORR_NODCORNUSUIM = 17;
  public static int FLD_VALONODOCORR_NODCORANMAOR = 18;
  public static int FLD_VALONODOCORR_NODCORNUMAOR = 19;
  public static int FLD_VALONODOCORR_NODOCORRIMPO = 20;
  public static int FLD_VALONODOCORR_NODCORINCPAG = 21;
  public static int FLD_VALONODOCORR_NODCORANNLIQ = 22;
  public static int FLD_VALONODOCORR_NODCORNUMLIQ = 23;
  public static int FLD_VALONODOCORR_NODOCORUOGES = 24;
  public static int FLD_VALONODOCORR_NODOCORUOUTI = 25;
  public static int FLD_VALONODOCORR_NODCORCODPR1 = 26;
  public static int FLD_VALONODOCORR_NODCORCODPRO = 27;
  public static int FLD_VALONODOCORR_NODOCORRORDI = 28;
  public static int FLD_VALONODOCORR_NODCORPROVAR = 29;
  public static int FLD_VALONODOCORR_NODOCORRHASH = 30;
  public static int FLD_VALONODOCORR_NODCORMISTIT = 31;
  public static int FLD_VALONODOCORR_NODCORCODSTR = 32;
  public static int FLD_VALONODOCORR_NODCORCODLI1 = 33;
  public static int FLD_VALONODOCORR_NODCORCODLI2 = 34;
  public static int FLD_VALONODOCORR_NODCORCODLI3 = 35;
  public static int FLD_VALONODOCORR_NODCORCODLI4 = 36;
  public static int FLD_VALONODOCORR_NODCORCODLI5 = 37;
  public static int FLD_VALONODOCORR_NODOCORRRESP = 38;
  public static int FLD_VALONODOCORR_NODCORCEDICO = 39;
  public static int FLD_VALONODOCORR_NODCORPROSES = 40;
  public static int FLD_VALONODOCORR_NODOCORRFINA = 41;
  public static int FLD_VALONODOCORR_NODOCORROPER = 42;
  public static int FLD_VALONODOCORR_NODOCORRESPL = 43;

  // Definition of table: Dati Ente
  //
  public static int TBL_T64 = 1268;
  public static int FLD_T64_INDIRIZZO = 0;
  public static int FLD_T64_COMUNE = 1;
  public static int FLD_T64_PROVINCIA = 2;
  public static int FLD_T64_CAP = 3;
  public static int FLD_T64_COD_FISCALE = 4;
  public static int FLD_T64_PARTITA_IVA = 5;
  public static int FLD_T64_DENOMINAZIONE = 6;
  public static int FLD_T64_DATIENTEATTI = 7;
  public static int FLD_T64_DATENTTIPESA = 8;
  public static int FLD_T64_DATIENTEESAT = 9;
  public static int FLD_T64_DATENTSEDINP = 10;
  public static int FLD_T64_TIPO_MO = 11;
  public static int FLD_T64_DATENTCODBDA = 12;
  public static int FLD_T64_DATENTTIPPRO = 13;

  // Definition of table: LIQ DISTINTA
  //
  public static int TBL_LIQ_DISTINTA = 1269;
  public static int FLD_LIQ_DISTINTA_PROGRESSIVO = 0;
  public static int FLD_LIQ_DISTINTA_ANNO_DISTINTA = 1;
  public static int FLD_LIQ_DISTINTA_NUMERO_DISTINTA = 2;
  public static int FLD_LIQ_DISTINTA_ANNO_PROG_FAT = 3;
  public static int FLD_LIQ_DISTINTA_NUMERO_PROG_FAT = 4;
  public static int FLD_LIQ_DISTINTA_IMPORTO = 5;
  public static int FLD_LIQ_DISTINTA_ANNO_IMP = 6;
  public static int FLD_LIQ_DISTINTA_NUMERO_IMP = 7;
  public static int FLD_LIQ_DISTINTA_ANNO_SUBIMP = 8;
  public static int FLD_LIQ_DISTINTA_NUMERO_SUBIMP = 9;
  public static int FLD_LIQ_DISTINTA_BENEFICIARIO = 10;
  public static int FLD_LIQ_DISTINTA_RAGIONE_SOCIALE_ESTESA = 11;
  public static int FLD_LIQ_DISTINTA_NUM_QUIETANZA = 12;
  public static int FLD_LIQ_DISTINTA_VOCE_ECONOMICA = 13;
  public static int FLD_LIQ_DISTINTA_CODICE_GESTIONALE = 14;
  public static int FLD_LIQ_DISTINTA_FINANZIAMENTO = 15;
  public static int FLD_LIQ_DISTINTA_FATTORE = 16;
  public static int FLD_LIQ_DISTINTA_CENTRO = 17;
  public static int FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO = 18;
  public static int FLD_LIQ_DISTINTA_DATA_INSERIMENTO = 19;
  public static int FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG = 20;
  public static int FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG = 21;
  public static int FLD_LIQ_DISTINTA_ANNO_LIQ = 22;
  public static int FLD_LIQ_DISTINTA_NUMERO_LIQ = 23;
  public static int FLD_LIQ_DISTINTA_DESCRIZIONE = 24;
  public static int FLD_LIQ_DISTINTA_COMPETENZA_DAL = 25;
  public static int FLD_LIQ_DISTINTA_COMPETENZA_AL = 26;
  public static int FLD_LIQ_DISTINTA_LIQDISTISTAT = 27;
  public static int FLD_LIQ_DISTINTA_LIQDISINDAFA = 28;
  public static int FLD_LIQ_DISTINTA_CIG = 29;
  public static int FLD_LIQ_DISTINTA_CUP = 30;
  public static int FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG = 31;
  public static int FLD_LIQ_DISTINTA_LIQDISIMPORI = 32;
  public static int FLD_LIQ_DISTINTA_IMPORTO_IVA = 33;
  public static int FLD_LIQ_DISTINTA_CAMPO_LIBERO_1 = 34;
  public static int FLD_LIQ_DISTINTA_CAMPO_LIBERO_2 = 35;
  public static int FLD_LIQ_DISTINTA_ANNO_DEL = 36;
  public static int FLD_LIQ_DISTINTA_NUMERO_DEL = 37;
  public static int FLD_LIQ_DISTINTA_SEDE_DEL = 38;

  // Definition of table: Menu
  //
  public static int TBL_MENU = 1270;
  public static int FLD_MENU_COMANDCAPTIO = 0;
  public static int FLD_MENU_COMACOMMCODE = 1;
  public static int FLD_MENU_COMANDINDICE = 2;

  // Definition of table: Parametri Iride
  //
  public static int TBL_PARAMETIRIDE = 1271;
  public static int FLD_PARAMETIRIDE_DOCUMENIRIDE = 0;
  public static int FLD_PARAMETIRIDE_IRIDCODAMMWS = 1;
  public static int FLD_PARAMETIRIDE_IRIDETRATTWS = 2;
  public static int FLD_PARAMETIRIDE_IRIDCLAWSFAT = 3;
  public static int FLD_PARAMETIRIDE_IRIDCLAWSLIQ = 4;
  public static int FLD_PARAMETIRIDE_IRIDUTEWSFAT = 5;
  public static int FLD_PARAMETIRIDE_IRIDUTEWSLIQ = 6;
  public static int FLD_PARAMETIRIDE_IRIDRUOWSFAT = 7;
  public static int FLD_PARAMETIRIDE_IRIDPUBWSLIQ = 8;
  public static int FLD_PARAMETIRIDE_IRIDEURLASP = 9;
  public static int FLD_PARAMETIRIDE_IRIDEENTEASP = 10;
  public static int FLD_PARAMETIRIDE_IRIDUTENP121 = 11;
  public static int FLD_PARAMETIRIDE_IRIDEPWDP121 = 12;
  public static int FLD_PARAMETIRIDE_IRIDRUOLP121 = 13;
  public static int FLD_PARAMETIRIDE_IRIDAGGIP121 = 14;
  public static int FLD_PARAMETIRIDE_IRIDUTENP135 = 15;
  public static int FLD_PARAMETIRIDE_IRIDEPWDP135 = 16;
  public static int FLD_PARAMETIRIDE_IRIDRUOLP135 = 17;
  public static int FLD_PARAMETIRIDE_IRIDAGGIP135 = 18;
  public static int FLD_PARAMETIRIDE_IRIDUTENP140 = 19;
  public static int FLD_PARAMETIRIDE_IRIDEPWDP140 = 20;
  public static int FLD_PARAMETIRIDE_IRIDRUOLP140 = 21;
  public static int FLD_PARAMETIRIDE_IRIDAGGIP140 = 22;

  // Definition of table: Chars To Be Fixed
  //
  public static int TBL_CHARTOBEFIXE = 1272;
  public static int FLD_CHARTOBEFIXE_BADCHATOBEFI = 0;
  public static int FLD_CHARTOBEFIXE_GOOCHATOBEFI = 1;

  // Definition of table: Fields To Be Fixed
  //
  public static int TBL_FIELTOBEFIXE = 1273;
  public static int FLD_FIELTOBEFIXE_CODFIETOBEFI = 0;

  // Definition of table: Aggiornare Su Attivazione
  //
  public static int TBL_AGGIOSUATTIV = 1274;
  public static int FLD_AGGIOSUATTIV_AGGAGGIOPANE = 0;
  public static int FLD_AGGIOSUATTIV_AGGAGGIOTOTA = 1;

  // Definition of table: Anteprima Dati
  //
  public static int TBL_ANTEPRIMDATI = 1275;
  public static int FLD_ANTEPRIMDATI_NOMOGGANTCSV = 0;
  public static int FLD_ANTEPRIMDATI_NOMOGGAGGPAN = 1;

  // Definition of table: CF ESTRAI APPOGGIO PARAMETRI SELECT
  //
  public static int TBL_CFESTAPPPASE = 1276;
  public static int FLD_CFESTAPPPASE_ID = 0;
  public static int FLD_CFESTAPPPASE_ID_SELECT = 1;
  public static int FLD_CFESTAPPPASE_NOME = 2;
  public static int FLD_CFESTAPPPASE_DESCRIZIONE = 3;
  public static int FLD_CFESTAPPPASE_SEQUENZA = 4;
  public static int FLD_CFESTAPPPASE_TIPO = 5;
  public static int FLD_CFESTAPPPASE_VALORE_DEFAULT = 6;
  public static int FLD_CFESTAPPPASE_VALORE = 7;
  public static int FLD_CFESTAPPPASE_NOMOGGIMVADA = 8;
  public static int FLD_CFESTAPPPASE_STATO = 9;
  public static int FLD_CFESTAPPPASE_UTENTE_INSERIMENTO = 10;
  public static int FLD_CFESTAPPPASE_DATA_INSERIMENTO = 11;
  public static int FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG = 12;
  public static int FLD_CFESTAPPPASE_DATA_ULTIMO_AGG = 13;

  // Definition of table: Parametri Stampa Jasper
  //
  public static int TBL_PARASTAMJASP = 1277;
  public static int FLD_PARASTAMJASP_NOMEPARAMETR = 0;
  public static int FLD_PARASTAMJASP_VALOREPARAME = 1;
  public static int FLD_PARASTAMJASP_PARAMEPROGRE = 2;

  // Definition of table: Dati Stampe Jasper
  //
  public static int TBL_DATISTAMJASP = 1278;
  public static int FLD_DATISTAMJASP_PARAMETROURL = 0;
  public static int FLD_DATISTAMJASP_PARAMETRCONN = 1;
  public static int FLD_DATISTAMJASP_PARAMEPROJEC = 2;
  public static int FLD_DATISTAMJASP_PARAMURLEXPO = 3;

  // Recordset for query: Chars To Be Fixed
  //
  public static int QRY_CHARTOBEFIX1 = 1279;
  public static int QSL_CHARTOBEFIX1_BADCHATOBEFI = 0;
  public static int QSL_CHARTOBEFIX1_GOOCHATOBEFI = 1;

  // Recordset for query: Fields To Be Fixed
  //
  public static int QRY_FIELTOBEFIX1 = 1280;
  public static int QSL_FIELTOBEFIX1_CODFIETOBEFI = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM61 = 1281;
  public static int PQRY_PARAM61_RS = 1282;
  public static int PQSL_PARAM61_ROWNAMENOTE = 0;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC6 = 1283;
  public static int PQSL_ACC6_ESEACNUMEACC = 0;
  public static int PQSL_ACC6_ESEACANNOACC = 1;
  public static int PQSL_ACC6_DESCRIZIONE = 2;
  public static int PQSL_ACC6_CAPITOLO = 3;
  public static int PQSL_ACC6_ARTICOLO = 4;
  public static int PQSL_ACC6_ESEACUOUTILI = 5;
  public static int PQSL_ACC6_ESEACCDISPON = 6;

  // Table to contain panel selected row: Soggetti
  //
  public static int PQRY_SOGGETTI4 = 1284;
  public static int PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA = 0;
  public static int PQSL_SOGGETTI4_CODICE = 1;
  public static int PQSL_SOGGETTI4_D_SCADENZA = 2;
  public static int PQSL_SOGGETTI4_CODICE_FISCALE = 3;
  public static int PQSL_SOGGETTI4_PARTITA_IVA = 4;
  public static int PQSL_SOGGETTI4_INDIRIZZOBEN = 5;
  public static int PQSL_SOGGETTI4_CATEGORIA = 6;
  public static int PQSL_SOGGETTI4_PAGAMENTO_IN_EURO = 7;
  public static int PQSL_SOGGETTI4_BENNI = 8;
  public static int PQSL_SOGGETTI4_BENDAL = 9;
  public static int PQSL_SOGGETTI4_BENAL = 10;
  public static int PQSL_SOGGETTI4_BENTIPOSOGGE = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI664 = 1285;
  public static int PQRY_PARAMETRI664_RS = 1286;
  public static int PQSL_PARAMETRI664_PARADATASCAD = 0;
  public static int PQSL_PARAMETRI664_PARAANCHSCAD = 1;

  // Table to contain panel selected row: Soggetti
  //
  public static int PQRY_SOGGETTI = 1287;
  public static int PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA = 0;
  public static int PQSL_SOGGETTI_CODICE = 1;
  public static int PQSL_SOGGETTI_D_SCADENZA = 2;
  public static int PQSL_SOGGETTI_CODICE_FISCALE = 3;
  public static int PQSL_SOGGETTI_PARTITA_IVA = 4;
  public static int PQSL_SOGGETTI_INDIRIZZOBEN = 5;
  public static int PQSL_SOGGETTI_CATEGORIA = 6;
  public static int PQSL_SOGGETTI_PAGAMENTO_IN_EURO = 7;
  public static int PQSL_SOGGETTI_BENNI = 8;
  public static int PQSL_SOGGETTI_BENDAL = 9;
  public static int PQSL_SOGGETTI_BENAL = 10;
  public static int PQSL_SOGGETTI_BENTIPOSOGGE = 11;

  // Table to contain panel selected row: CATEGORIE FISCALI
  //
  public static int PQRY_CATEGOFISCAL = 1288;
  public static int PQSL_CATEGOFISCAL_CATEGORIA_FISCALE = 0;
  public static int PQSL_CATEGOFISCAL_DESCRIZIONE = 1;

  // Table to contain panel selected row: CLASSIFICAZIONI
  //
  public static int PQRY_CLASSIFICAZI = 1289;
  public static int PQSL_CLASSIFICAZI_CATEGORIA_FISCALE = 0;
  public static int PQSL_CLASSIFICAZI_CLASSIFICAZIONE = 1;
  public static int PQSL_CLASSIFICAZI_DESCRIZIONE = 2;

  // Table to contain panel selected row: PRODUTTORI
  //
  public static int PQRY_PRODUTTORI = 1290;
  public static int PQSL_PRODUTTORI_CODICE = 0;
  public static int PQSL_PRODUTTORI_RAGIONE_SOCIALE = 1;
  public static int PQSL_PRODUTTORI_RIF_REGIONALE = 2;

  // Table to contain panel selected row: MODELLI
  //
  public static int PQRY_MODELLI = 1291;
  public static int PQSL_MODELLI_PRODUTTORE = 0;
  public static int PQSL_MODELLI_CATEGORIA_FISCALE = 1;
  public static int PQSL_MODELLI_CLASSIFICAZIONE = 2;
  public static int PQSL_MODELLI_MODELLO = 3;
  public static int PQSL_MODELLI_DESCRIZIONE = 4;

  // Table to contain panel selected row: CAUSALI MOVIMENTI CESPITI
  //
  public static int PQRY_CAUSMOVICESP = 1292;
  public static int PQSL_CAUSMOVICESP_TIPO_MOVIMENTO = 0;
  public static int PQSL_CAUSMOVICESP_CAUSALE = 1;
  public static int PQSL_CAUSMOVICESP_DESCRIZIONE = 2;

  // Table to contain panel selected row: DISLOCAZIONI
  //
  public static int PQRY_DISLOCAZIONI = 1293;
  public static int PQSL_DISLOCAZIONI_STABILIMENTO = 0;
  public static int PQSL_DISLOCAZIONI_DISLOCAZIONE = 1;
  public static int PQSL_DISLOCAZIONI_DESCRIZIONE = 2;
  public static int PQSL_DISLOCAZIONI_SUB_CONSEGNATARIO = 3;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_1 = 1294;
  public static int PQRY_1_RS = 1295;
  public static int PQSL_1_PARUTIDALSER = 0;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE15 = 1296;
  public static int PQRY_NEWTABLE15_RS = 1297;
  public static int PQSL_NEWTABLE15_ROWNAMETIPO = 0;
  public static int PQSL_NEWTABLE15_ROWNAMEORDIN = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI517 = 1298;
  public static int PQRY_PARAMETRI517_RS = 1299;
  public static int PQSL_PARAMETRI517_ROWNAMTUTIFA = 0;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI5 = 1300;
  public static int PQSL_FATTORI5_FATTORORDINA = 0;
  public static int PQSL_FATTORI5_FATTORE = 1;
  public static int PQSL_FATTORI5_DESCRIZIONE = 2;
  public static int PQSL_FATTORI5_TIPO = 3;

  // Table to contain panel selected row: CENTRI
  //
  public static int PQRY_CENTRI2 = 1301;
  public static int PQSL_CENTRI2_CENTRO = 0;
  public static int PQSL_CENTRI2_DESCRIZIONE = 1;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI2 = 1302;
  public static int PQSL_FATTORI2_FATTORE = 0;
  public static int PQSL_FATTORI2_DESCRIZIONE = 1;
  public static int PQSL_FATTORI2_FATTORORDINA = 2;
  public static int PQSL_FATTORI2_TIPO = 3;

  // Table to contain panel selected row: COMUNI
  //
  public static int PQRY_COMUNI32 = 1303;
  public static int PQSL_COMUNI32_PROVINCIA_STATO = 0;
  public static int PQSL_COMUNI32_COMUNE = 1;
  public static int PQSL_COMUNI32_SIGLA = 2;
  public static int PQSL_COMUNI32_DENOMINAZIONE = 3;
  public static int PQSL_COMUNI32_COMUNICOMUNE = 4;
  public static int PQSL_COMUNI32_CAP = 5;
  public static int PQSL_COMUNI32_PROVINCIA = 6;
  public static int PQSL_COMUNI32_PROVINCIA_TRIBUNALE = 7;

  // Table to contain panel selected row: COMUNI
  //
  public static int PQRY_COMUNI36 = 1304;
  public static int PQSL_COMUNI36_PROVINCIA_STATO = 0;
  public static int PQSL_COMUNI36_COMUNE = 1;
  public static int PQSL_COMUNI36_DENOMINAZIONE = 2;
  public static int PQSL_COMUNI36_CAP = 3;
  public static int PQSL_COMUNI36_COADSTTESIIA = 4;

  // Table to contain panel selected row: ESEIMP
  //
  public static int PQRY_ESEIMP3 = 1305;
  public static int PQSL_ESEIMP3_CAPITOLO = 0;
  public static int PQSL_ESEIMP3_ARTICOLO = 1;
  public static int PQSL_ESEIMP3_ANNO_IMP = 2;
  public static int PQSL_ESEIMP3_NUMERO_IMP = 3;
  public static int PQSL_ESEIMP3_DESCRIZIONE = 4;
  public static int PQSL_ESEIMP3_ESEIMUOUTILI = 5;
  public static int PQSL_ESEIMP3_ESEIDISPEFFE = 6;
  public static int PQSL_ESEIMP3_ESENUMIMPPRO = 7;
  public static int PQSL_ESEIMP3_ESEANNIMPPRO = 8;
  public static int PQSL_ESEIMP3_ESEIMPSEDDEL = 9;
  public static int PQSL_ESEIMP3_ESEIMPNUMDEL = 10;
  public static int PQSL_ESEIMP3_ESEIMPANNDEL = 11;
  public static int PQSL_ESEIMP3_ESEIMPIMPOBB = 12;
  public static int PQSL_ESEIMP3_ESEIMPIMPCIG = 13;
  public static int PQSL_ESEIMP3_ESEIMPIMPCUP = 14;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP9 = 1306;
  public static int PQSL_VARIMP9_VARIMNUMEIMP = 0;
  public static int PQSL_VARIMP9_VARIMANNOIMP = 1;
  public static int PQSL_VARIMP9_VARIMIMPCAPI = 2;
  public static int PQSL_VARIMP9_VARIMIMPARTI = 3;
  public static int PQSL_VARIMP9_VARIDDATAREG = 4;
  public static int PQSL_VARIMP9_VARIMPDESCRI = 5;
  public static int PQSL_VARIMP9_VARIMTIPOVAR = 6;
  public static int PQSL_VARIMP9_VARIUNITPROP = 7;
  public static int PQSL_VARIMP9_VARINUMEPROP = 8;
  public static int PQSL_VARIMP9_VARIANNOPROP = 9;
  public static int PQSL_VARIMP9_VARIMSEDEDEL = 10;
  public static int PQSL_VARIMP9_VARIMNUMEDEL = 11;
  public static int PQSL_VARIMP9_VARIMANNODEL = 12;
  public static int PQSL_VARIMP9_VARIMPIMPORT = 13;
  public static int PQSL_VARIMP9_VARIMPVOCECO = 14;
  public static int PQSL_VARIMP9_VARIMPCODGES = 15;
  public static int PQSL_VARIMP9_VARIMPCODCOF = 16;
  public static int PQSL_VARIMP9_VARIMPCODEUR = 17;
  public static int PQSL_VARIMP9_VARIMPCODLI5 = 18;
  public static int PQSL_VARIMP9_VARIMIMPBENE = 19;
  public static int PQSL_VARIMP9_VARIMIMPCAUS = 20;
  public static int PQSL_VARIMP9_VARIMPIMPOBB = 21;
  public static int PQSL_VARIMP9_VARIMPESESCA = 22;
  public static int PQSL_VARIMP9_VARIMPTIPVIN = 23;
  public static int PQSL_VARIMP9_VARIMPTIPAVA = 24;
  public static int PQSL_VARIMP9_VARIMIMPINVE = 25;
  public static int PQSL_VARIMP9_VARIMPREGCON = 26;
  public static int PQSL_VARIMP9_VARIMPCONSTR = 27;
  public static int PQSL_VARIMP9_VARIMPTITGIU = 28;
  public static int PQSL_VARIMP9_VARIMPANNPLU = 29;
  public static int PQSL_VARIMP9_VARIMPNUMPLU = 30;
  public static int PQSL_VARIMP9_VARIMIMPCENT = 31;
  public static int PQSL_VARIMP9_VARIMIMPFATT = 32;
  public static int PQSL_VARIMP9_VARIMPCOMDAL = 33;
  public static int PQSL_VARIMP9_VARIIMPCOMAL = 34;
  public static int PQSL_VARIMP9_VARIMIMPNOTE = 35;
  public static int PQSL_VARIMP9_VARIMPRILECO = 36;
  public static int PQSL_VARIMP9_VARCODIMPECO = 37;
  public static int PQSL_VARIMP9_VARIIMPPROID = 38;
  public static int PQSL_VARIMP9_VARIMIMPOPER = 39;
  public static int PQSL_VARIMP9_VARIMPCOMZON = 40;
  public static int PQSL_VARIMP9_VARIMPPROZON = 41;
  public static int PQSL_VARIMP9_VARIMIMPOBIE = 42;
  public static int PQSL_VARIMP9_VARIMPIMPCUP = 43;
  public static int PQSL_VARIMP9_VARIMPPRUNOR = 44;
  public static int PQSL_VARIMP9_VARIMPSCOBID = 45;
  public static int PQSL_VARIMP9_VARIMPIMPCIG = 46;
  public static int PQSL_VARIMP9_VARIMPCODMON = 47;
  public static int PQSL_VARIMP9_VARIMPFINANZ = 48;
  public static int PQSL_VARIMP9_VARIMPPROGRE = 49;
  public static int PQSL_VARIMP9_VARIANNOENTR = 50;

  // Table to contain panel selected row: ESEIMP
  //
  public static int PQRY_ESEIMP2 = 1307;
  public static int PQSL_ESEIMP2_CAPITOLO = 0;
  public static int PQSL_ESEIMP2_ARTICOLO = 1;
  public static int PQSL_ESEIMP2_ANNO_IMP = 2;
  public static int PQSL_ESEIMP2_NUMERO_IMP = 3;
  public static int PQSL_ESEIMP2_DESCRIZIONE = 4;
  public static int PQSL_ESEIMP2_ESEIMUOUTILI = 5;
  public static int PQSL_ESEIMP2_ESEIDISPEFFE = 6;
  public static int PQSL_ESEIMP2_ESENUMIMPPRO = 7;
  public static int PQSL_ESEIMP2_ESEANNIMPPRO = 8;
  public static int PQSL_ESEIMP2_ESEANNIMPPRE = 9;
  public static int PQSL_ESEIMP2_ESENUMIMPPRE = 10;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP6 = 1308;
  public static int PQSL_IMP6_CAPITOLO = 0;
  public static int PQSL_IMP6_ARTICOLO = 1;
  public static int PQSL_IMP6_ANNO_IMP = 2;
  public static int PQSL_IMP6_NUMERO_IMP = 3;
  public static int PQSL_IMP6_DESCRIZIONE = 4;
  public static int PQSL_IMP6_ESEIMUOUTILI = 5;
  public static int PQSL_IMP6_ESEIDISPEFFE = 6;
  public static int PQSL_IMP6_ESEIMPSEDDEL = 7;
  public static int PQSL_IMP6_ESEIMPANNDEL = 8;
  public static int PQSL_IMP6_ESEIMPNUMDEL = 9;
  public static int PQSL_IMP6_ESEIMPIMPOBB = 10;

  // Table to contain panel selected row: VISTA IMP UO UT
  //
  public static int PQRY_VISTAIMPUOU4 = 1309;
  public static int PQSL_VISTAIMPUOU4_CAPITOLO = 0;
  public static int PQSL_VISTAIMPUOU4_ARTICOLO = 1;
  public static int PQSL_VISTAIMPUOU4_ANNO_IMP = 2;
  public static int PQSL_VISTAIMPUOU4_NUMERO_IMP = 3;
  public static int PQSL_VISTAIMPUOU4_DESCRIZIONE = 4;
  public static int PQSL_VISTAIMPUOU4_VIIMUOUTUOUT = 5;
  public static int PQSL_VISTAIMPUOU4_expr_raggr = 6;

  // Table to contain panel selected row: DETTAGLI IMPEGNI BUONI
  //
  public static int PQRY_DETTIMPEBUO1 = 1310;
  public static int PQSL_DETTIMPEBUO1_DESCRIZIONE = 0;
  public static int PQSL_DETTIMPEBUO1_ANNO_IMP = 1;
  public static int PQSL_DETTIMPEBUO1_NUMERO_IMP = 2;
  public static int PQSL_DETTIMPEBUO1_CAPITOLO = 3;
  public static int PQSL_DETTIMPEBUO1_ARTICOLO = 4;

  // Table to contain panel selected row: VISTA IMP UO UT
  //
  public static int PQRY_VISTAIMPUOU1 = 1311;
  public static int PQSL_VISTAIMPUOU1_CAPITOLO = 0;
  public static int PQSL_VISTAIMPUOU1_ARTICOLO = 1;
  public static int PQSL_VISTAIMPUOU1_ANNO_IMP = 2;
  public static int PQSL_VISTAIMPUOU1_NUMERO_IMP = 3;
  public static int PQSL_VISTAIMPUOU1_DESCRIZIONE = 4;
  public static int PQSL_VISTAIMPUOU1_VIIMUOUTUOUT = 5;
  public static int PQSL_VISTAIMPUOU1_VISIMPUOUTIN = 6;
  public static int PQSL_VISTAIMPUOU1_VIIMUOUTDIEF = 7;
  public static int PQSL_VISTAIMPUOU1_VISIMPUOUTCI = 8;
  public static int PQSL_VISTAIMPUOU1_VISIMPUOUTCU = 9;

  // Table to contain panel selected row: VISTA SUBIMP UO UT
  //
  public static int PQRY_VISTSUBIUOUT = 1312;
  public static int PQSL_VISTSUBIUOUT_DESCRIZIONE = 0;
  public static int PQSL_VISTSUBIUOUT_ANNO_SUBIMP = 1;
  public static int PQSL_VISTSUBIUOUT_NUMERO_SUBIMP = 2;
  public static int PQSL_VISTSUBIUOUT_CAPITOLO = 3;
  public static int PQSL_VISTSUBIUOUT_ARTICOLO = 4;
  public static int PQSL_VISTSUBIUOUT_ANNO_IMP = 5;
  public static int PQSL_VISTSUBIUOUT_NUMERO_IMP = 6;
  public static int PQSL_VISTSUBIUOUT_VISUUOUTDIEF = 7;
  public static int PQSL_VISTSUBIUOUT_VISSUBUOUTCI = 8;
  public static int PQSL_VISTSUBIUOUT_VISSUBUOUTCU = 9;

  // Table to contain panel selected row: ESEIMP
  //
  public static int PQRY_ESEIMP = 1313;
  public static int PQSL_ESEIMP_ANNO_SUBIMP = 0;
  public static int PQSL_ESEIMP_NUMERO_SUBIMP = 1;
  public static int PQSL_ESEIMP_ANNO_IMP = 2;
  public static int PQSL_ESEIMP_NUMERO_IMP = 3;
  public static int PQSL_ESEIMP_CAPITOLO = 4;
  public static int PQSL_ESEIMP_ARTICOLO = 5;
  public static int PQSL_ESEIMP_DESCRIZIONE = 6;
  public static int PQSL_ESEIMP_ESEIDISPEFFE = 7;
  public static int PQSL_ESEIMP_ESENUMIMPPRO = 8;
  public static int PQSL_ESEIMP_ESEANNIMPPRO = 9;
  public static int PQSL_ESEIMP_ESENUMSUBPRO = 10;
  public static int PQSL_ESEIMP_ESEANNSUBPRO = 11;
  public static int PQSL_ESEIMP_ESEIMSUBICIG = 12;
  public static int PQSL_ESEIMP_ESEIMSUBICUP = 13;

  // Table to contain panel selected row: PROGETTI CG4
  //
  public static int PQRY_PROGETTICG4 = 1314;
  public static int PQSL_PROGETTICG4_PROGETTO = 0;
  public static int PQSL_PROGETTICG4_DESCRIZIONE = 1;
  public static int PQSL_PROGETTICG4_RESPONSABILE = 2;
  public static int PQSL_PROGETTICG4_DATA_INIZIO = 3;
  public static int PQSL_PROGETTICG4_DATA_FINE_EFFETTIVA = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI8 = 1315;
  public static int PQRY_PARAMETRI8_RS = 1316;
  public static int PQSL_PARAMETRI8_ROWNAMESCADU = 0;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMI2 = 1317;
  public static int PQSL_VOCIECONOMI2_E_S = 0;
  public static int PQSL_VOCIECONOMI2_CODICE = 1;
  public static int PQSL_VOCIECONOMI2_DESCRIZIONE = 2;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMI4 = 1318;
  public static int PQSL_VOCIECONOMI4_E_S = 0;
  public static int PQSL_VOCIECONOMI4_CODICE = 1;
  public static int PQSL_VOCIECONOMI4_DESCRIZIONE = 2;

  // Table to contain panel selected row: CODICI PTC
  //
  public static int PQRY_CODICIPTC2 = 1319;
  public static int PQSL_CODICIPTC2_CODICE = 0;
  public static int PQSL_CODICIPTC2_DESCRIZIONE1 = 1;

  // Table to contain panel selected row: CODICI GESTIONALI
  //
  public static int PQRY_CODICIGESTI2 = 1320;
  public static int PQSL_CODICIGESTI2_E_S = 0;
  public static int PQSL_CODICIGESTI2_CODICE = 1;
  public static int PQSL_CODICIGESTI2_DESCRIZIONE = 2;

  // Table to contain panel selected row: RICLASSIFICAZIONI GEST
  //
  public static int PQRY_RICLASSIGEST = 1321;
  public static int PQSL_RICLASSIGEST_CODICE = 0;
  public static int PQSL_RICLASSIGEST_DESCRIZIONE = 1;

  // Table to contain panel selected row: T04
  //
  public static int PQRY_T04 = 1322;
  public static int PQSL_T04_TIPO_BOLLATO = 0;
  public static int PQSL_T04_DESCRIZIONE = 1;

  // Table to contain panel selected row: VINCOLI
  //
  public static int PQRY_VINCOLI2 = 1323;
  public static int PQSL_VINCOLI2_CODICE = 0;
  public static int PQSL_VINCOLI2_DESCRIZIONE = 1;
  public static int PQSL_VINCOLI2_SCADENZA = 2;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY1 = 1324;
  public static int PQRY_MASTERQUERY1_RS = 1325;
  public static int PQSL_MASTERQUERY1_PARAMSCADUTI = 0;

  // Table to contain panel selected row: BANCHE
  //
  public static int PQRY_BANCHE1 = 1326;
  public static int PQSL_BANCHE1_ABI = 0;
  public static int PQSL_BANCHE1_DENOMINAZIONE = 1;
  public static int PQSL_BANCHE1_DESCRIZIONE = 2;
  public static int PQSL_BANCHE1_CAB = 3;
  public static int PQSL_BANCHE1_COMUNE = 4;
  public static int PQSL_BANCHE1_INDIRIZZO = 5;
  public static int PQSL_BANCHE1_PROVINCIA = 6;
  public static int PQSL_BANCHE1_CAP = 7;
  public static int PQSL_BANCHE1_LOCALITA = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI185 = 1327;
  public static int PQRY_PARAMETRI185_RS = 1328;
  public static int PQSL_PARAMETRI185_ROWNAMEBANCA = 0;
  public static int PQSL_PARAMETRI185_ROWNAMEABI = 1;
  public static int PQSL_PARAMETRI185_ROWNAMECAB = 2;
  public static int PQSL_PARAMETRI185_ROWNAMECOMUN = 3;
  public static int PQSL_PARAMETRI185_ROWNAMEINDIR = 4;
  public static int PQSL_PARAMETRI185_ROWNAMESPORT = 5;
  public static int PQSL_PARAMETRI185_ROWNAMEPROVI = 6;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT12 = 1329;
  public static int PQSL_FAT12_ANNO_PROG = 0;
  public static int PQSL_FAT12_NUMERO_PROG = 1;
  public static int PQSL_FAT12_NUMERO_RIF = 2;
  public static int PQSL_FAT12_ANNO_DOC = 3;
  public static int PQSL_FAT12_NUMERO_DOC = 4;
  public static int PQSL_FAT12_D_DATA_DOC = 5;
  public static int PQSL_FAT12_FATTIPO = 6;
  public static int PQSL_FAT12_FATDALIQUIDA = 7;
  public static int PQSL_FAT12_NUMERO_PROT = 8;
  public static int PQSL_FAT12_D_DATA_PROT = 9;
  public static int PQSL_FAT12_D_SCADENZA = 10;
  public static int PQSL_FAT12_FATQUIETANZA = 11;
  public static int PQSL_FAT12_FATUFFICIO = 12;
  public static int PQSL_FAT12_CODICE = 13;
  public static int PQSL_FAT12_FABERASOESES = 14;
  public static int PQSL_FAT12_UFFICIO_INVIO = 15;
  public static int PQSL_FAT12_CATEGORIA = 16;
  public static int PQSL_FAT12_FATT08DESCRI = 17;
  public static int PQSL_FAT12_NUM_QUIETANZA = 18;
  public static int PQSL_FAT12_IMPORTO = 19;
  public static int PQSL_FAT12_VARIAZIONI = 20;
  public static int PQSL_FAT12_IMPUTATO = 21;
  public static int PQSL_FAT12_ANNO_RIF = 22;
  public static int PQSL_FAT12_FATCIG = 23;
  public static int PQSL_FAT12_FATCUP = 24;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL1 = 1330;
  public static int PQSL_DEL1_ANNO_DEL = 0;
  public static int PQSL_DEL1_NUMERO_DEL = 1;
  public static int PQSL_DEL1_SEDE_DEL = 2;
  public static int PQSL_DEL1_DESCRIZIONE = 3;
  public static int PQSL_DEL1_DELESECUTIVI = 4;
  public static int PQSL_DEL1_APPROVAZIDEL = 5;
  public static int PQSL_DEL1_TIPO_ESEC = 6;
  public static int PQSL_DEL1_NUMERO_APP = 7;
  public static int PQSL_DEL1_DATA_APP = 8;
  public static int PQSL_DEL1_D_DATA_DEL = 9;
  public static int PQSL_DEL1_D_DATA_APP = 10;
  public static int PQSL_DEL1_ANNO_PRO = 11;
  public static int PQSL_DEL1_NUMERO_PRO = 12;
  public static int PQSL_DEL1_UNITA_PRO = 13;

  // Table to contain panel selected row: PROPOSTE
  //
  public static int PQRY_PROPOSTE1 = 1331;
  public static int PQSL_PROPOSTE1_ANNO = 0;
  public static int PQSL_PROPOSTE1_UNITA_PROPONENTE = 1;
  public static int PQSL_PROPOSTE1_NUMERO = 2;
  public static int PQSL_PROPOSTE1_DATA_PROPOSTA = 3;
  public static int PQSL_PROPOSTE1_OGGETTO = 4;

  // Table to contain panel selected row: ESEACC
  //
  public static int PQRY_ESEACC1 = 1332;
  public static int PQSL_ESEACC1_ANNO_ACC = 0;
  public static int PQSL_ESEACC1_NUMERO_ACC = 1;
  public static int PQSL_ESEACC1_CAPITOLO = 2;
  public static int PQSL_ESEACC1_ARTICOLO = 3;
  public static int PQSL_ESEACC1_DESCRIZIONE = 4;
  public static int PQSL_ESEACC1_ESEACUOUTILI = 5;
  public static int PQSL_ESEACC1_DISPONIBILITA = 6;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP5 = 1333;
  public static int PQSL_CAP5_ESERCIZIO = 0;
  public static int PQSL_CAP5_CAPITOLO = 1;
  public static int PQSL_CAP5_ARTICOLO = 2;
  public static int PQSL_CAP5_RECORCAPDESC = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI417 = 1334;
  public static int PQRY_PARAMETRI417_RS = 1335;
  public static int PQSL_PARAMETRI417_ROWNAMCAPCON = 0;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILAN10 = 1336;
  public static int PQSL_VISTABILAN10_VIBICABIUOCA = 0;
  public static int PQSL_VISTABILAN10_VIBICABIUOAR = 1;
  public static int PQSL_VISTABILAN10_VIBIUOINVOPE = 2;
  public static int PQSL_VISTABILAN10_VIBICABIUOMT = 3;
  public static int PQSL_VISTABILAN10_VIBICABIUOPT = 4;
  public static int PQSL_VISTABILAN10_VISTBILUOTIT = 5;
  public static int PQSL_VISTABILAN10_VIBICABIUODE = 6;
  public static int PQSL_VISTABILAN10_VIBICABIUOES = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI620 = 1337;
  public static int PQRY_PARAMETRI620_RS = 1338;
  public static int PQSL_PARAMETRI620_ROWNAMCAPCON = 0;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL2 = 1339;
  public static int PQSL_BIL2_ESERCIZIO = 0;
  public static int PQSL_BIL2_E_S = 1;
  public static int PQSL_BIL2_CAPITOLO = 2;
  public static int PQSL_BIL2_ARTICOLO = 3;
  public static int PQSL_BIL2_DESCRIZIONE = 4;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL3 = 1340;
  public static int PQSL_BIL3_ESERCIZIO = 0;
  public static int PQSL_BIL3_E_S = 1;
  public static int PQSL_BIL3_CAPITOLO = 2;
  public static int PQSL_BIL3_ARTICOLO = 3;
  public static int PQSL_BIL3_DESCRIZIONE = 4;

  // Table to contain panel selected row: SUBIMP FIN
  //
  public static int PQRY_SUBIMPFIN3 = 1341;
  public static int PQSL_SUBIMPFIN3_FINANZIAMENTO = 0;
  public static int PQSL_SUBIMPFIN3_DESCRIZIONE = 1;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN4 = 1342;
  public static int PQSL_IMPFIN4_FINANZIAMENTO = 0;
  public static int PQSL_IMPFIN4_DESCRIZIONE = 1;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN2 = 1343;
  public static int PQSL_BILFIN2_FINANZIAMENTO = 0;
  public static int PQSL_BILFIN2_OPERA = 1;
  public static int PQSL_BILFIN2_BILFINDESFIN = 2;
  public static int PQSL_BILFIN2_BILFINDESOPE = 3;

  // Table to contain panel selected row: CATEGORIE
  //
  public static int PQRY_CATEGORIE = 1344;
  public static int PQSL_CATEGORIE_TITOLO = 0;
  public static int PQSL_CATEGORIE_CATEGORIA = 1;
  public static int PQSL_CATEGORIE_E = 2;
  public static int PQSL_CATEGORIE_DESCRIZIONE = 3;

  // Table to contain panel selected row: INTERVENTI
  //
  public static int PQRY_INTERVENTI = 1345;
  public static int PQSL_INTERVENTI_TITOLO = 0;
  public static int PQSL_INTERVENTI_INTERVENTO = 1;
  public static int PQSL_INTERVENTI_DESCRIZIONE = 2;

  // Table to contain panel selected row: QTN
  //
  public static int PQRY_QTN4 = 1346;
  public static int PQSL_QTN4_NUM_QUIETANZA = 0;
  public static int PQSL_QTN4_TIPO_QUIETANZA = 1;
  public static int PQSL_QTN4_CONTO_CORRENTE = 2;
  public static int PQSL_QTN4_DES_BANCA = 3;
  public static int PQSL_QTN4_COD_BANCA = 4;
  public static int PQSL_QTN4_COD_SPORTELLO = 5;
  public static int PQSL_QTN4_INTESTATARIO_1 = 6;
  public static int PQSL_QTN4_INTESTATARIO_2 = 7;
  public static int PQSL_QTN4_INTESTATARIO_3 = 8;
  public static int PQSL_QTN4_SCADENZA = 9;
  public static int PQSL_QTN4_CIN_BANCARIO = 10;
  public static int PQSL_QTN4_IBAN_PAESE = 11;
  public static int PQSL_QTN4_IBAN_CIN_EUROPA = 12;
  public static int PQSL_QTN4_QUIETANZANTE = 13;
  public static int PQSL_QTN4_IBAN_ID_NAZIONALE = 14;
  public static int PQSL_QTN4_IBAN_CONTO = 15;
  public static int PQSL_QTN4_IBAN_EXTRA_UE = 16;
  public static int PQSL_QTN4_BIC = 17;
  public static int PQSL_QTN4_SPESE = 18;
  public static int PQSL_QTN4_QTNCONTODEDI = 19;
  public static int PQSL_QTN4_QTNPREVALENT = 20;

  // Table to contain panel selected row: OPERE
  //
  public static int PQRY_OPERE5 = 1347;
  public static int PQSL_OPERE5_CODICE = 0;
  public static int PQSL_OPERE5_DESCRIZIONE = 1;
  public static int PQSL_OPERE5_REALE = 2;
  public static int PQSL_OPERE5_PROGETTO_ID = 3;
  public static int PQSL_OPERE5_OPERECATEGOR = 4;
  public static int PQSL_OPERE5_OPEREPROGETT = 5;
  public static int PQSL_OPERE5_OPERENUMPPI = 6;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME10 = 1348;
  public static int PQSL_FINANZIAME10_CODICE = 0;
  public static int PQSL_FINANZIAME10_DESCRIZIONE = 1;
  public static int PQSL_FINANZIAME10_FIBERASOESES = 2;
  public static int PQSL_FINANZIAME10_ENTE = 3;
  public static int PQSL_FINANZIAME10_NUMERO_MUTUO = 4;
  public static int PQSL_FINANZIAME10_ANNO_MUTUO = 5;
  public static int PQSL_FINANZIAME10_CATEGORIA = 6;
  public static int PQSL_FINANZIAME10_SCADENZA = 7;
  public static int PQSL_FINANZIAME10_FINANZCATEG1 = 8;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME23 = 1349;
  public static int PQSL_FINANZIAME23_CODICE = 0;
  public static int PQSL_FINANZIAME23_DESCRIZIONE = 1;
  public static int PQSL_FINANZIAME23_FIBERASOESES = 2;
  public static int PQSL_FINANZIAME23_ENTE = 3;
  public static int PQSL_FINANZIAME23_NUMERO_MUTUO = 4;
  public static int PQSL_FINANZIAME23_ANNO_MUTUO = 5;
  public static int PQSL_FINANZIAME23_CATEGORIA = 6;
  public static int PQSL_FINANZIAME23_SCADENZA = 7;
  public static int PQSL_FINANZIAME23_FINANZCATEG1 = 8;

  // Table to contain panel selected row: POL ELENCO OB FC
  //
  public static int PQRY_POLELENCOBF3 = 1350;
  public static int PQSL_POLELENCOBF3_PROGETTO_ID = 0;
  public static int PQSL_POLELENCOBF3_POLELEOBFCOR = 1;
  public static int PQSL_POLELENCOBF3_PROGRAMMA = 2;
  public static int PQSL_POLELENCOBF3_OBIETTIVO = 3;
  public static int PQSL_POLELENCOBF3_DES_PROGETTO = 4;
  public static int PQSL_POLELENCOBF3_DES_OBIETTIVO = 5;
  public static int PQSL_POLELENCOBF3_DATA_INIZIO_OB = 6;
  public static int PQSL_POLELENCOBF3_POELOBFCPRES = 7;
  public static int PQSL_POLELENCOBF3_SCHEDA_OBIETTIVO_ID = 8;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI4 = 1351;
  public static int PQSL_PROGETTI4_PROGETTO_ID = 0;
  public static int PQSL_PROGETTI4_RECORDDESCRI = 1;
  public static int PQSL_PROGETTI4_RECORDORDINA = 2;

  // Table to contain panel selected row: STANZIAMENTI PROGETTO
  //
  public static int PQRY_STANZIPROGE1 = 1352;
  public static int PQSL_STANZIPROGE1_PROGETTO_ID = 0;
  public static int PQSL_STANZIPROGE1_RECORDDESCRI = 1;
  public static int PQSL_STANZIPROGE1_RECORDORDINA = 2;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI5 = 1353;
  public static int PQSL_PROGETTI5_PROGETTO_ID = 0;
  public static int PQSL_PROGETTI5_RECORDDESCRI = 1;
  public static int PQSL_PROGETTI5_DATA_INIZIO_PROG = 2;
  public static int PQSL_PROGETTI5_RECOPRIMESER = 3;
  public static int PQSL_PROGETTI5_RECORDORDINA = 4;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI3 = 1354;
  public static int PQSL_PROGETTI3_PROGETTO_ID = 0;
  public static int PQSL_PROGETTI3_RECORDDESCRI = 1;
  public static int PQSL_PROGETTI3_DATA_INIZIO_PROG = 2;
  public static int PQSL_PROGETTI3_RECOPRIMESER = 3;
  public static int PQSL_PROGETTI3_RECORDORDINA = 4;
  public static int PQSL_PROGETTI3_FATTORE = 5;
  public static int PQSL_PROGETTI3_DES_FATTORE = 6;
  public static int PQSL_PROGETTI3_CENTRO = 7;
  public static int PQSL_PROGETTI3_DES_CENTRO = 8;

  // Table to contain panel selected row: POL ELENCO OB FC
  //
  public static int PQRY_POLELENCOBF2 = 1355;
  public static int PQSL_POLELENCOBF2_PROGETTO_ID = 0;
  public static int PQSL_POLELENCOBF2_POLELEOBFCOR = 1;
  public static int PQSL_POLELENCOBF2_PROGRAMMA = 2;
  public static int PQSL_POLELENCOBF2_OBIETTIVO = 3;
  public static int PQSL_POLELENCOBF2_DES_PROGETTO = 4;
  public static int PQSL_POLELENCOBF2_DES_OBIETTIVO = 5;
  public static int PQSL_POLELENCOBF2_DATA_INIZIO_OB = 6;
  public static int PQSL_POLELENCOBF2_POELOBFCPRES = 7;
  public static int PQSL_POLELENCOBF2_SCHEDA_OBIETTIVO_ID = 8;
  public static int PQSL_POLELENCOBF2_FATTORE = 9;
  public static int PQSL_POLELENCOBF2_DES_FATTORE = 10;
  public static int PQSL_POLELENCOBF2_CENTRO = 11;
  public static int PQSL_POLELENCOBF2_DES_CENTRO = 12;

  // Table to contain panel selected row: POL ELENCO OB FC
  //
  public static int PQRY_POLELENCOBFC = 1356;
  public static int PQSL_POLELENCOBFC_PROGETTO_ID = 0;
  public static int PQSL_POLELENCOBFC_POLELEOBFCOR = 1;
  public static int PQSL_POLELENCOBFC_PROGRAMMA = 2;
  public static int PQSL_POLELENCOBFC_OBIETTIVO = 3;
  public static int PQSL_POLELENCOBFC_DES_PROGETTO = 4;
  public static int PQSL_POLELENCOBFC_DES_OBIETTIVO = 5;
  public static int PQSL_POLELENCOBFC_DATA_INIZIO_OB = 6;
  public static int PQSL_POLELENCOBFC_POELOBFCPRES = 7;
  public static int PQSL_POLELENCOBFC_SCHEDA_OBIETTIVO_ID = 8;
  public static int PQSL_POLELENCOBFC_FATTORE = 9;
  public static int PQSL_POLELENCOBFC_DES_FATTORE = 10;
  public static int PQSL_POLELENCOBFC_CENTRO = 11;
  public static int PQSL_POLELENCOBFC_DES_CENTRO = 12;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI6 = 1357;
  public static int PQSL_PROGETTI6_DESCRIZIONE = 0;
  public static int PQSL_PROGETTI6_PROGETTO_ID = 1;
  public static int PQSL_PROGETTI6_PROGRAMMA = 2;
  public static int PQSL_PROGETTI6_DATA_FINE_EFFETTIVA = 3;
  public static int PQSL_PROGETTI6_CODICE = 4;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP21 = 1358;
  public static int PQSL_CAP21_ESERCIZIO = 0;
  public static int PQSL_CAP21_CAPITOLO = 1;
  public static int PQSL_CAP21_ARTICOLO = 2;
  public static int PQSL_CAP21_TITOLO = 3;
  public static int PQSL_CAP21_RECORORDIEXP = 4;
  public static int PQSL_CAP21_RECORDORDINA = 5;
  public static int PQSL_CAP21_RECORDORDIN2 = 6;
  public static int PQSL_CAP21_RECORDORDIN3 = 7;
  public static int PQSL_CAP21_PROGRAMMA = 8;
  public static int PQSL_CAP21_DES_PROGRAMMA = 9;
  public static int PQSL_CAP21_PROGETTO_ID = 10;
  public static int PQSL_CAP21_DES_PROGETTO = 11;
  public static int PQSL_CAP21_OBIETTIVO = 12;
  public static int PQSL_CAP21_DES_OBIETTIVO = 13;
  public static int PQSL_CAP21_FATTORE = 14;
  public static int PQSL_CAP21_DES_FATTORE = 15;
  public static int PQSL_CAP21_CENTRO = 16;
  public static int PQSL_CAP21_DES_CENTRO = 17;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP19 = 1359;
  public static int PQSL_CAP19_ESERCIZIO = 0;
  public static int PQSL_CAP19_CAPITOLO = 1;
  public static int PQSL_CAP19_ARTICOLO = 2;
  public static int PQSL_CAP19_TITOLO = 3;
  public static int PQSL_CAP19_RECORORDIEXP = 4;
  public static int PQSL_CAP19_RECORDORDINA = 5;
  public static int PQSL_CAP19_RECORDORDIN2 = 6;
  public static int PQSL_CAP19_RECORDORDIN3 = 7;
  public static int PQSL_CAP19_PROGRAMMA = 8;
  public static int PQSL_CAP19_DES_PROGRAMMA = 9;
  public static int PQSL_CAP19_PROGETTO_ID = 10;
  public static int PQSL_CAP19_DES_PROGETTO = 11;
  public static int PQSL_CAP19_FATTORE = 12;
  public static int PQSL_CAP19_DES_FATTORE = 13;
  public static int PQSL_CAP19_CENTRO = 14;
  public static int PQSL_CAP19_DES_CENTRO = 15;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP22 = 1360;
  public static int PQSL_CAP22_ESERCIZIO = 0;
  public static int PQSL_CAP22_CAPITOLO = 1;
  public static int PQSL_CAP22_ARTICOLO = 2;
  public static int PQSL_CAP22_TITOLO = 3;
  public static int PQSL_CAP22_RECORORDIEXP = 4;
  public static int PQSL_CAP22_RECORDORDINA = 5;
  public static int PQSL_CAP22_RECORDORDIN2 = 6;
  public static int PQSL_CAP22_RECORDORDIN3 = 7;
  public static int PQSL_CAP22_PROGRAMMA = 8;
  public static int PQSL_CAP22_DES_PROGRAMMA = 9;
  public static int PQSL_CAP22_PROGETTO_ID = 10;
  public static int PQSL_CAP22_DES_PROGETTO = 11;
  public static int PQSL_CAP22_OBIETTIVO = 12;
  public static int PQSL_CAP22_DES_OBIETTIVO = 13;
  public static int PQSL_CAP22_FATTORE = 14;
  public static int PQSL_CAP22_DES_FATTORE = 15;
  public static int PQSL_CAP22_CENTRO = 16;
  public static int PQSL_CAP22_DES_CENTRO = 17;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP20 = 1361;
  public static int PQSL_CAP20_ESERCIZIO = 0;
  public static int PQSL_CAP20_CAPITOLO = 1;
  public static int PQSL_CAP20_ARTICOLO = 2;
  public static int PQSL_CAP20_TITOLO = 3;
  public static int PQSL_CAP20_RECORORDIEXP = 4;
  public static int PQSL_CAP20_RECORDORDINA = 5;
  public static int PQSL_CAP20_RECORDORDIN2 = 6;
  public static int PQSL_CAP20_RECORDORDIN3 = 7;
  public static int PQSL_CAP20_PROGRAMMA = 8;
  public static int PQSL_CAP20_DES_PROGRAMMA = 9;
  public static int PQSL_CAP20_PROGETTO_ID = 10;
  public static int PQSL_CAP20_DES_PROGETTO = 11;
  public static int PQSL_CAP20_FATTORE = 12;
  public static int PQSL_CAP20_DES_FATTORE = 13;
  public static int PQSL_CAP20_CENTRO = 14;
  public static int PQSL_CAP20_DES_CENTRO = 15;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI9 = 1362;
  public static int PQSL_PROGETTI9_PROGETTO_ID = 0;
  public static int PQSL_PROGETTI9_RECORDDESCRI = 1;
  public static int PQSL_PROGETTI9_DATA_INIZIO_PROG = 2;
  public static int PQSL_PROGETTI9_RECORDORDINA = 3;
  public static int PQSL_PROGETTI9_FATTORE = 4;
  public static int PQSL_PROGETTI9_DES_FATTORE = 5;
  public static int PQSL_PROGETTI9_CENTRO = 6;
  public static int PQSL_PROGETTI9_DES_CENTRO = 7;

  // Table to contain panel selected row: POL ELENCO OB FC
  //
  public static int PQRY_POLELENCOBF1 = 1363;
  public static int PQSL_POLELENCOBF1_PROGETTO_ID = 0;
  public static int PQSL_POLELENCOBF1_POLELEOBFCOR = 1;
  public static int PQSL_POLELENCOBF1_PROGRAMMA = 2;
  public static int PQSL_POLELENCOBF1_OBIETTIVO = 3;
  public static int PQSL_POLELENCOBF1_DES_PROGETTO = 4;
  public static int PQSL_POLELENCOBF1_DES_OBIETTIVO = 5;
  public static int PQSL_POLELENCOBF1_DATA_INIZIO_OB = 6;
  public static int PQSL_POLELENCOBF1_SCHEDA_OBIETTIVO_ID = 7;
  public static int PQSL_POLELENCOBF1_FATTORE = 8;
  public static int PQSL_POLELENCOBF1_DES_FATTORE = 9;
  public static int PQSL_POLELENCOBF1_CENTRO = 10;
  public static int PQSL_POLELENCOBF1_DES_CENTRO = 11;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP17 = 1364;
  public static int PQSL_CAP17_ESERCIZIO = 0;
  public static int PQSL_CAP17_CAPITOLO = 1;
  public static int PQSL_CAP17_ARTICOLO = 2;
  public static int PQSL_CAP17_DESCRIZIONE_ABBREVIATA = 3;
  public static int PQSL_CAP17_TITOLO = 4;
  public static int PQSL_CAP17_CATEGORIA = 5;
  public static int PQSL_CAP17_COD_TERZI = 6;
  public static int PQSL_CAP17_DESCRIZIONE = 7;
  public static int PQSL_CAP17_FUNZIONE = 8;
  public static int PQSL_CAP17_SERVIZIO = 9;
  public static int PQSL_CAP17_COD_INTERVENTO = 10;
  public static int PQSL_CAP17_RECORORDIEXP = 11;
  public static int PQSL_CAP17_RECORDORDINA = 12;
  public static int PQSL_CAP17_RECORDORDIN2 = 13;
  public static int PQSL_CAP17_RECORDORDIN3 = 14;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP18 = 1365;
  public static int PQSL_CAP18_ESERCIZIO = 0;
  public static int PQSL_CAP18_CAPITOLO = 1;
  public static int PQSL_CAP18_ARTICOLO = 2;
  public static int PQSL_CAP18_DESCRIZIONE_ABBREVIATA = 3;
  public static int PQSL_CAP18_TITOLO = 4;
  public static int PQSL_CAP18_CATEGORIA = 5;
  public static int PQSL_CAP18_COD_TERZI = 6;
  public static int PQSL_CAP18_DESCRIZIONE = 7;
  public static int PQSL_CAP18_FUNZIONE = 8;
  public static int PQSL_CAP18_SERVIZIO = 9;
  public static int PQSL_CAP18_COD_INTERVENTO = 10;
  public static int PQSL_CAP18_RECORORDIEXP = 11;
  public static int PQSL_CAP18_RECORDORDINA = 12;
  public static int PQSL_CAP18_RECORDORDIN2 = 13;
  public static int PQSL_CAP18_RECORDORDIN3 = 14;

  // Table to contain panel selected row: POL TESTI MAIL
  //
  public static int PQRY_POLTESTIMAI1 = 1366;
  public static int PQSL_POLTESTIMAI1_CODICE = 0;
  public static int PQSL_POLTESTIMAI1_DESCRIZIONE = 1;
  public static int PQSL_POLTESTIMAI1_TESTO = 2;
  public static int PQSL_POLTESTIMAI1_TESTO_MAIL_ID = 3;

  // Table to contain panel selected row: TITOLI
  //
  public static int PQRY_TITOLI3 = 1367;
  public static int PQSL_TITOLI3_E_S = 0;
  public static int PQSL_TITOLI3_TITOLO = 1;
  public static int PQSL_TITOLI3_DESCRIZIONE = 2;

  // Table to contain panel selected row: VISTATITOLITIPOLOGIE
  //
  public static int PQRY_VISTATITOLI1 = 1368;
  public static int PQSL_VISTATITOLI1_VISTATTITOLO = 0;
  public static int PQSL_VISTATITOLI1_VISTDESCTITO = 1;
  public static int PQSL_VISTATITOLI1_VISTATTIPOLO = 2;
  public static int PQSL_VISTATITOLI1_VISTDESCTIPO = 3;

  // Table to contain panel selected row: VISTATITOLITIPOLOGIE
  //
  public static int PQRY_VISTATITOLIT = 1369;
  public static int PQSL_VISTATITOLIT_VISTATMISSIO = 0;
  public static int PQSL_VISTATITOLIT_VISTDESCMISS = 1;
  public static int PQSL_VISTATITOLIT_VISTATPROGRA = 2;
  public static int PQSL_VISTATITOLIT_VIVIMIPRDEPR = 3;

  // Table to contain panel selected row: CAPTER
  //
  public static int PQRY_CAPTER = 1370;
  public static int PQSL_CAPTER_E_S = 0;
  public static int PQSL_CAPTER_CAPITOLO = 1;
  public static int PQSL_CAPTER_DESCRIZIONE = 2;

  // Table to contain panel selected row: FUNZIONI
  //
  public static int PQRY_FUNZIONI3 = 1371;
  public static int PQSL_FUNZIONI3_FUNZIONE = 0;
  public static int PQSL_FUNZIONI3_DESCRIZIONE = 1;

  // Table to contain panel selected row: SERVIZI
  //
  public static int PQRY_SERVIZI3 = 1372;
  public static int PQSL_SERVIZI3_FUNZIONE = 0;
  public static int PQSL_SERVIZI3_SERVIZIO = 1;
  public static int PQSL_SERVIZI3_DESCRIZIONE = 2;

  // Table to contain panel selected row: PROGRAMMI
  //
  public static int PQRY_PROGRAMMI = 1373;
  public static int PQSL_PROGRAMMI_CODICE = 0;
  public static int PQSL_PROGRAMMI_DESCRIZIONE = 1;

  // Table to contain panel selected row: FLESSIBILITA
  //
  public static int PQRY_FLESSIBILITA = 1374;
  public static int PQSL_FLESSIBILITA_CODICE = 0;
  public static int PQSL_FLESSIBILITA_DESCRIZIONE = 1;

  // Table to contain panel selected row: CERTBIL
  //
  public static int PQRY_CERTBIL = 1375;
  public static int PQSL_CERTBIL_CODICE = 0;
  public static int PQSL_CERTBIL_DESCRIZIONE = 1;

  // Table to contain panel selected row: CERTCON
  //
  public static int PQRY_CERTCON = 1376;
  public static int PQSL_CERTCON_CODICE = 0;
  public static int PQSL_CERTCON_DESCRIZIONE = 1;

  // Table to contain panel selected row: SO4 ANA UNITA ORGANIZZATIVE
  //
  public static int PQRY_SO4ANAUNIORG = 1377;
  public static int PQSL_SO4ANAUNIORG_OTTICA = 0;
  public static int PQSL_SO4ANAUNIORG_PROGR_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_SO4ANAUNIORG_DES_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_SO4ANAUNIORG_COD_SUDDIVISIONE = 3;
  public static int PQSL_SO4ANAUNIORG_SOANUNORCOUO = 4;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP15 = 1378;
  public static int PQSL_CAP15_ESERCIZIO = 0;
  public static int PQSL_CAP15_CAPITOLO = 1;
  public static int PQSL_CAP15_ARTICOLO = 2;
  public static int PQSL_CAP15_DESCRIZIONE_ABBREVIATA = 3;
  public static int PQSL_CAP15_TITOLO = 4;
  public static int PQSL_CAP15_CATEGORIA = 5;
  public static int PQSL_CAP15_COD_TERZI = 6;
  public static int PQSL_CAP15_DESCRIZIONE = 7;
  public static int PQSL_CAP15_FUNZIONE = 8;
  public static int PQSL_CAP15_SERVIZIO = 9;
  public static int PQSL_CAP15_COD_INTERVENTO = 10;
  public static int PQSL_CAP15_RECORORDIEXP = 11;
  public static int PQSL_CAP15_RECORDORDINA = 12;
  public static int PQSL_CAP15_RECORDORDIN2 = 13;
  public static int PQSL_CAP15_RECORDORDIN3 = 14;

  // Table to contain panel selected row: POL VISTA PROPOSTE BOZZA
  //
  public static int PQRY_POLVISPROBOZ = 1379;
  public static int PQSL_POLVISPROBOZ_NUM_PROPOSTA = 0;
  public static int PQSL_POLVISPROBOZ_DATA_PROPOSTA = 1;
  public static int PQSL_POLVISPROBOZ_PROPOSTA_VAR_ID = 2;
  public static int PQSL_POLVISPROBOZ_DESCRIZIONE = 3;
  public static int PQSL_POLVISPROBOZ_URGENTE = 4;

  // Table to contain panel selected row: POL BOZZE VARIAZIONE
  //
  public static int PQRY_POLBOZZEVARI = 1380;
  public static int PQSL_POLBOZZEVARI_DATA_LIMITE_PROPOSTE = 0;
  public static int PQSL_POLBOZZEVARI_DESCRIZIONE = 1;

  // Table to contain panel selected row: POL VARIAZIONI BIL PEG
  //
  public static int PQRY_POLVARBILPE2 = 1381;
  public static int PQSL_POLVARBILPE2_DESCRIZIONE = 0;
  public static int PQSL_POLVARBILPE2_VARIAZIONE_ID = 1;
  public static int PQSL_POLVARBILPE2_BIL_PEG = 2;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI1 = 1382;
  public static int PQSL_PROGETTI1_CODICE = 0;
  public static int PQSL_PROGETTI1_DESCRIZIONE = 1;
  public static int PQSL_PROGETTI1_PROGETTO_ID = 2;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME24 = 1383;
  public static int PQSL_FINANZIAME24_FINANZCODICE = 0;
  public static int PQSL_FINANZIAME24_FINANZDESCRI = 1;
  public static int PQSL_FINANZIAME24_FINAANNOMUTU = 2;
  public static int PQSL_FINANZIAME24_FINANUMEMUTU = 3;
  public static int PQSL_FINANZIAME24_FINANZSCADEN = 4;
  public static int PQSL_FINANZIAME24_FINANZCATEGO = 5;
  public static int PQSL_FINANZIAME24_FIBERASOESES = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI404 = 1384;
  public static int PQRY_PARAMETRI404_RS = 1385;
  public static int PQSL_PARAMETRI404_PARATIPODIST = 0;
  public static int PQSL_PARAMETRI404_PARANULLOSTA = 1;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE
  //
  public static int PQRY_DISTINLIQUI7 = 1386;
  public static int PQSL_DISTINLIQUI7_ANNO_DISTINTA = 0;
  public static int PQSL_DISTINLIQUI7_NUMERO_DISTINTA = 1;
  public static int PQSL_DISTINLIQUI7_LINK_GDM = 2;
  public static int PQSL_DISTINLIQUI7_DATA_DISTINTA = 3;
  public static int PQSL_DISTINLIQUI7_DISTLIQUIMPO = 4;
  public static int PQSL_DISTINLIQUI7_TIPO_DIST = 5;
  public static int PQSL_DISTINLIQUI7_STATO = 6;
  public static int PQSL_DISTINLIQUI7_DISTLIQDESUO = 7;

  // Table to contain panel selected row: CODICI UTENZE
  //
  public static int PQRY_CODICIUTENZ1 = 1387;
  public static int PQSL_CODICIUTENZ1_CODUTETIPUTE = 0;
  public static int PQSL_CODICIUTENZ1_CODUTECODUTE = 1;
  public static int PQSL_CODICIUTENZ1_CODIUTENDESC = 2;
  public static int PQSL_CODICIUTENZ1_CODUTECOMDAL = 3;
  public static int PQSL_CODICIUTENZ1_CODIUTECOMAL = 4;
  public static int PQSL_CODICIUTENZ1_CODIUTENFATT = 5;
  public static int PQSL_CODICIUTENZ1_CODIUTENCENT = 6;

  // Table to contain panel selected row: VISTA ACC UO UT
  //
  public static int PQRY_VISTAACCUOU3 = 1388;
  public static int PQSL_VISTAACCUOU3_DESCRIZIONE = 0;
  public static int PQSL_VISTAACCUOU3_ANNO_ACC = 1;
  public static int PQSL_VISTAACCUOU3_NUMERO_ACC = 2;
  public static int PQSL_VISTAACCUOU3_CAPITOLO = 3;
  public static int PQSL_VISTAACCUOU3_ARTICOLO = 4;

  // Table to contain panel selected row: VOCI PS
  //
  public static int PQRY_VOCIPS8 = 1389;
  public static int PQSL_VOCIPS8_VOCIPSSEQUEN = 0;
  public static int PQSL_VOCIPS8_VOCIPSESERCI = 1;
  public static int PQSL_VOCIPS8_VOCIPSTIPSTA = 2;
  public static int PQSL_VOCIPS8_VOCIPSCODICE = 3;
  public static int PQSL_VOCIPS8_VOCIPSDESCRI = 4;

  // Table to contain panel selected row: Unita Organizzative
  //
  public static int PQRY_UNITAORGANIZ = 1390;
  public static int PQSL_UNITAORGANIZ_SO4ANAUNORPR = 0;
  public static int PQSL_UNITAORGANIZ_SOANUNORCFSP = 1;
  public static int PQSL_UNITAORGANIZ_SO4ANAUNORDE = 2;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU3 = 1391;
  public static int PQSL_VISTABILANU3_CAPITOLO = 0;
  public static int PQSL_VISTABILANU3_ARTICOLO = 1;
  public static int PQSL_VISTABILANU3_VIBIUOINVOPE = 2;
  public static int PQSL_VISTABILANU3_DESCRIZIONE = 3;
  public static int PQSL_VISTABILANU3_E_S = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI621 = 1392;
  public static int PQRY_PARAMETRI621_RS = 1393;
  public static int PQSL_PARAMETRI621_ROWNAMCAPCON = 0;

  // Table to contain panel selected row: ASSESTAMENTI
  //
  public static int PQRY_ASSESTAMENT1 = 1394;
  public static int PQSL_ASSESTAMENT1_ASSESTESERCI = 0;
  public static int PQSL_ASSESTAMENT1_ASSESTCODICE = 1;
  public static int PQSL_ASSESTAMENT1_ASSESTDESCRI = 2;
  public static int PQSL_ASSESTAMENT1_ASSESTCHIUSO = 3;
  public static int PQSL_ASSESTAMENT1_ASSESTGENERA = 4;

  // Table to contain panel selected row: VISTA RICLASSIFICAZIONI
  //
  public static int PQRY_VISTARICLAS1 = 1395;
  public static int PQSL_VISTARICLAS1_REVISTRITIRI = 0;
  public static int PQSL_VISTARICLAS1_RECVISSTRILI = 1;
  public static int PQSL_VISTARICLAS1_RECORDCODICE = 2;
  public static int PQSL_VISTARICLAS1_REVISTRISTRI = 3;
  public static int PQSL_VISTARICLAS1_RECORDLIVELL = 4;
  public static int PQSL_VISTARICLAS1_RECORDDESCRI = 5;

  // Table to contain panel selected row: Tipo Cod
  //
  public static int PQRY_TIPOCOD2 = 1396;
  public static int PQRY_TIPOCOD2_RS = 1397;
  public static int PQSL_TIPOCOD2_NOMOGGTIPRIC = 0;

  // Table to contain panel selected row: VISTA RICLASSIFICAZIONI
  //
  public static int PQRY_VISTARICLAS2 = 1398;
  public static int PQSL_VISTARICLAS2_REVISTRITIRI = 0;
  public static int PQSL_VISTARICLAS2_RECVISSTRILI = 1;
  public static int PQSL_VISTARICLAS2_RECORDCODICE = 2;
  public static int PQSL_VISTARICLAS2_REVISTRISTRI = 3;
  public static int PQSL_VISTARICLAS2_RECORDLIVELL = 4;
  public static int PQSL_VISTARICLAS2_RECORDDESCRI = 5;

  // Table to contain panel selected row: VISTA STRUTTURA RICL
  //
  public static int PQRY_VISTSTRURIC2 = 1399;
  public static int PQSL_VISTSTRURIC2_VISSTRRICCOD = 0;
  public static int PQSL_VISTSTRURIC2_VISSTRRICDES = 1;

  // Table to contain panel selected row: CAP FS
  //
  public static int PQRY_CAPFS = 1400;
  public static int PQSL_CAPFS_CAPFSESERCIZ = 0;
  public static int PQSL_CAPFS_CAPFSES = 1;
  public static int PQSL_CAPFS_CAPFSCAPITOL = 2;
  public static int PQSL_CAPFS_CAPFSARTICOL = 3;
  public static int PQSL_CAPFS_CAPFSDESCRIZ = 4;

  // Table to contain panel selected row: CAP77
  //
  public static int PQRY_CAP77 = 1401;
  public static int PQSL_CAP77_ESERCIZIO = 0;
  public static int PQSL_CAP77_RECORDRISORS = 1;
  public static int PQSL_CAP77_CAPITOLO = 2;
  public static int PQSL_CAP77_ARTICOLO = 3;
  public static int PQSL_CAP77_RECOCAP77DES = 4;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP24 = 1402;
  public static int PQSL_CAP24_ESERCIZIO = 0;
  public static int PQSL_CAP24_CAPITOLO = 1;
  public static int PQSL_CAP24_ARTICOLO = 2;
  public static int PQSL_CAP24_DESCRIZIONE_ABBREVIATA = 3;

  // Table to contain panel selected row: T54
  //
  public static int PQRY_T81 = 1403;
  public static int PQSL_T81_RECORDCODICE = 0;
  public static int PQSL_T81_RECORDDESCRI = 1;
  public static int PQSL_T81_RECOTIPOIMPO = 2;
  public static int PQSL_T81_RECORDPARTE = 3;
  public static int PQSL_T81_RECORDTIPO = 4;
  public static int PQSL_T81_RECOOBBLCOMP = 5;
  public static int PQSL_T81_RECORDMOTIVA = 6;
  public static int PQSL_T81_RECOOBBLCASS = 7;
  public static int PQSL_T81_RECORT54TIPO = 8;

  // Table to contain panel selected row: SCHEDE OBIETTIVI
  //
  public static int PQRY_SCHEDEOBIETT = 1404;
  public static int PQSL_SCHEDEOBIETT_SCHOBICODOBI = 0;
  public static int PQSL_SCHEDEOBIETT_SCHEOBIECODI = 1;
  public static int PQSL_SCHEDEOBIETT_SCHEOBIEDESC = 2;
  public static int PQSL_SCHEDEOBIETT_SCHOBIDAFIVA = 3;
  public static int PQSL_SCHEDEOBIETT_SCHOBIDEOBOP = 4;
  public static int PQSL_SCHEDEOBIETT_SCHEOBIEPROG = 5;
  public static int PQSL_SCHEDEOBIETT_SCHEOBIEESER = 6;

  // Table to contain panel selected row: VISTA STRUTTURA RICL
  //
  public static int PQRY_VISTSTRURIC3 = 1405;
  public static int PQSL_VISTSTRURIC3_VISSTRRIPRCO = 0;
  public static int PQSL_VISTSTRURIC3_VISSTRRICDES = 1;

  // Table to contain panel selected row: PROGRAMMI COFOG
  //
  public static int PQRY_PROGRAMCOFO1 = 1406;
  public static int PQSL_PROGRAMCOFO1_PROGRAMCOFOG = 0;
  public static int PQSL_PROGRAMCOFO1_PRCOVISTRIDE = 1;

  // Table to contain panel selected row: VISTA STRUTTURA RICL
  //
  public static int PQRY_VISTSTRURIC4 = 1407;
  public static int PQSL_VISTSTRURIC4_VISSTRRICCOD = 0;
  public static int PQSL_VISTSTRURIC4_VISSTRRICDES = 1;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP8 = 1408;
  public static int PQRY_VARIMP8_RS = 1409;
  public static int PQSL_VARIMP8_RENOOGCACACS = 0;
  public static int PQSL_VARIMP8_RECCODPIACON = 1;
  public static int PQSL_VARIMP8_RECORDCAPITO = 2;
  public static int PQSL_VARIMP8_RECORDART = 3;
  public static int PQSL_VARIMP8_RECORDIMPEGN = 4;
  public static int PQSL_VARIMP8_RECORANNOIMP = 5;
  public static int PQSL_VARIMP8_RENOOGIMIMDE = 6;
  public static int PQSL_VARIMP8_RECORDIMPORT = 7;
  public static int PQSL_VARIMP8_RECOANNOESIG = 8;
  public static int PQSL_VARIMP8_RECNOMOGGPRO = 9;
  public static int PQSL_VARIMP8_RENOOGIMPRUO = 10;
  public static int PQSL_VARIMP8_RENOOGVAVAGE = 11;
  public static int PQSL_VARIMP8_RENOOGDETIVA = 12;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP29 = 1410;
  public static int PQSL_CAP29_CAPITOLO = 0;
  public static int PQSL_CAP29_ARTICOLO = 1;
  public static int PQSL_CAP29_DESCRIZIONE = 2;
  public static int PQSL_CAP29_RECORDINFO = 3;
  public static int PQSL_CAP29_RECORDCODICE = 4;

  // Table to contain panel selected row: TESTATE MUTUI
  //
  public static int PQRY_TESTATEMUT12 = 1411;
  public static int PQSL_TESTATEMUT12_ANNO_MUTUO = 0;
  public static int PQSL_TESTATEMUT12_NUMERO_MUTUO = 1;
  public static int PQSL_TESTATEMUT12_ISTITUTO = 2;
  public static int PQSL_TESTATEMUT12_CAUSALE = 3;
  public static int PQSL_TESTATEMUT12_IMPORTO = 4;

  // Table to contain panel selected row: TESTATE CRONOPROGRAMMI
  //
  public static int PQRY_TESTATCRONO2 = 1412;
  public static int PQSL_TESTATCRONO2_TESTCROCROID = 0;
  public static int PQSL_TESTATCRONO2_TESTCRONOPER = 1;
  public static int PQSL_TESTATCRONO2_TESCROESEISC = 2;
  public static int PQSL_TESTATCRONO2_TESCROIMPATT = 3;

  // Table to contain panel selected row: VARACC
  //
  public static int PQRY_VARACC1 = 1413;
  public static int PQSL_VARACC1_VARACNUMEACC = 0;
  public static int PQSL_VARACC1_VARACANNOACC = 1;
  public static int PQSL_VARACC1_VARACACCCAPI = 2;
  public static int PQSL_VARACC1_VARACACCARTI = 3;
  public static int PQSL_VARACC1_VARADDATAREG = 4;
  public static int PQSL_VARACC1_VARACCDESCRI = 5;
  public static int PQSL_VARACC1_VARACTIPOVAR = 6;
  public static int PQSL_VARACC1_VARAUNITPROP = 7;
  public static int PQSL_VARACC1_VARANUMEPROP = 8;
  public static int PQSL_VARACC1_VARAANNOPROP = 9;
  public static int PQSL_VARACC1_VARACSEDEDEL = 10;
  public static int PQSL_VARACC1_VARACNUMEDEL = 11;
  public static int PQSL_VARACC1_VARACANNODEL = 12;
  public static int PQSL_VARACC1_VARACCIMPORT = 13;
  public static int PQSL_VARACC1_VARACCVOCECO = 14;
  public static int PQSL_VARACC1_VARACCCODGES = 15;
  public static int PQSL_VARACC1_VARACCCODEUR = 16;
  public static int PQSL_VARACC1_VARACCCODLI5 = 17;
  public static int PQSL_VARACC1_VARACACCCAUS = 18;
  public static int PQSL_VARACC1_VARACCESESCA = 19;
  public static int PQSL_VARACC1_VARACCTIPVIN = 20;
  public static int PQSL_VARACC1_VARACCANNPLU = 21;
  public static int PQSL_VARACC1_VARACCNUMPLU = 22;
  public static int PQSL_VARACC1_VARACACCCENT = 23;
  public static int PQSL_VARACC1_VARACACCFATT = 24;
  public static int PQSL_VARACC1_VARACCCOMDAL = 25;
  public static int PQSL_VARACC1_VARAACCCOMAL = 26;
  public static int PQSL_VARACC1_VARACACCNOTE = 27;
  public static int PQSL_VARACC1_VARACCRILECO = 28;
  public static int PQSL_VARACC1_VARCODACCECO = 29;
  public static int PQSL_VARACC1_VARAACCPROID = 30;
  public static int PQSL_VARACC1_VARACACCOBIE = 31;
  public static int PQSL_VARACC1_VARACCPRUNOR = 32;
  public static int PQSL_VARACC1_VARACCSCOBID = 33;
  public static int PQSL_VARACC1_VARACCCODMON = 34;
  public static int PQSL_VARACC1_VARVARACCOPE = 35;
  public static int PQSL_VARACC1_VARACCPROGRE = 36;
  public static int PQSL_VARACC1_VARACACCDEBI = 37;
  public static int PQSL_VARACC1_VARACACCFINA = 38;
  public static int PQSL_VARACC1_VARACCTIPAVA = 39;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB6 = 1414;
  public static int PQSL_VARSUB6_VARSNUMESUBI = 0;
  public static int PQSL_VARSUB6_VARSANNOSUBI = 1;
  public static int PQSL_VARSUB6_VARSSUBICAPI = 2;
  public static int PQSL_VARSUB6_VARSSUBIARTI = 3;
  public static int PQSL_VARSUB6_VARSDDATAREG = 4;
  public static int PQSL_VARSUB6_VARSUBDESCRI = 5;
  public static int PQSL_VARSUB6_VARSUTIPOVAR = 6;
  public static int PQSL_VARSUB6_VARSUNITPROP = 7;
  public static int PQSL_VARSUB6_VARSNUMEPROP = 8;
  public static int PQSL_VARSUB6_VARSANNOPROP = 9;
  public static int PQSL_VARSUB6_VARSUSEDEDEL = 10;
  public static int PQSL_VARSUB6_VARSUNUMEDEL = 11;
  public static int PQSL_VARSUB6_VARSUANNODEL = 12;
  public static int PQSL_VARSUB6_VARSUBIMPORT = 13;
  public static int PQSL_VARSUB6_VARIMPCODGES = 14;
  public static int PQSL_VARSUB6_VARIMPCODCOF = 15;
  public static int PQSL_VARSUB6_VARIMPCODEUR = 16;
  public static int PQSL_VARSUB6_VARIMPCODLI5 = 17;
  public static int PQSL_VARSUB6_VARSUIMPBENE = 18;
  public static int PQSL_VARSUB6_VARSUIMPCAUS = 19;
  public static int PQSL_VARSUB6_VARIMPTITGIU = 20;
  public static int PQSL_VARSUB6_VARSUIMPCENT = 21;
  public static int PQSL_VARSUB6_VARSUIMPFATT = 22;
  public static int PQSL_VARSUB6_VARIMPCOMDAL = 23;
  public static int PQSL_VARSUB6_VARSIMPCOMAL = 24;
  public static int PQSL_VARSUB6_VARSUIMPNOTE = 25;
  public static int PQSL_VARSUB6_VARIMPRILECO = 26;
  public static int PQSL_VARSUB6_VARCODIMPECO = 27;
  public static int PQSL_VARSUB6_VARIMPCOMZON = 28;
  public static int PQSL_VARSUB6_VARIMPPROZON = 29;
  public static int PQSL_VARSUB6_VARSUBIMPCUP = 30;
  public static int PQSL_VARSUB6_VARSUBIMPCIG = 31;
  public static int PQSL_VARSUB6_VARSUBFINANZ = 32;
  public static int PQSL_VARSUB6_VARSUBPROGRE = 33;
  public static int PQSL_VARSUB6_VARSSUBIOBBL = 34;

}
