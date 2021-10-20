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
public class IMDBDef1 extends Object
{
	// IMDB Constants
  // Temporary recordset for grouping
  //
  public static int TMP_RECORDSET = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM30 = 1;
  public static int FLD_PARAM30_ROWNAMENOTE = 0;

  // Definition of table: Parametri SAAP
  //
  public static int TBL_PARAMETRSAAP = 2;
  public static int FLD_PARAMETRSAAP_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRSAAP_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRSAAP_ROWNAMEARTIC = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI401 = 3;
  public static int FLD_PARAMETRI401_PARADATASCAD = 0;
  public static int FLD_PARAMETRI401_PARAANCHSCAD = 1;
  public static int FLD_PARAMETRI401_PARVISPANPAR = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI9 = 4;
  public static int FLD_PARAMETRI9_ROWNAMECODIC = 0;
  public static int FLD_PARAMETRI9_ROWNAMRAGSOC = 1;
  public static int FLD_PARAMETRI9_ROWNAMPARIVA = 2;
  public static int FLD_PARAMETRI9_ROWNAMCODFIS = 3;
  public static int FLD_PARAMETRI9_RONADAFIDAAL = 4;

  // Definition of table: Parametro
  //
  public static int TBL_PARAMETRO = 5;
  public static int FLD_PARAMETRO_PARACATEFISC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI452 = 6;
  public static int FLD_PARAMETRI452_PARAMPRODUTT = 0;
  public static int FLD_PARAMETRI452_PARACATEFISC = 1;
  public static int FLD_PARAMETRI452_PARAMCLASSIF = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI347 = 7;
  public static int FLD_PARAMETRI347_PARAMSTABILI = 0;
  public static int FLD_PARAMETRI347_PARUTIDALSER = 1;
  public static int FLD_PARAMETRI347_PARAPROGSERV = 2;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE52 = 8;
  public static int FLD_NEWTABLE52_ROWNAMETIPO = 0;
  public static int FLD_NEWTABLE52_ROWNAMEORDIN = 1;
  public static int FLD_NEWTABLE52_ROWNAMEINFO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI12 = 9;
  public static int FLD_PARAMETRI12_ROWNAMDATREG = 0;
  public static int FLD_PARAMETRI12_ROWNAMEFILTR = 1;
  public static int FLD_PARAMETRI12_ROWNAMTUTIFA = 2;
  public static int FLD_PARAMETRI12_ROWNAMFICOEC = 3;
  public static int FLD_PARAMETRI12_ROWNAMEES = 4;
  public static int FLD_PARAMETRI12_ROWNAMCODQUA = 5;
  public static int FLD_PARAMETRI12_ROWNAMCODQUI = 6;
  public static int FLD_PARAMETRI12_ROWNAMNASTUT = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI14 = 10;
  public static int FLD_PARAMETRI14_ROWNAMDATREG = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI474 = 11;
  public static int FLD_PARAMETRI474_ROWNAMDATREG = 0;
  public static int FLD_PARAMETRI474_ROWNAMETIPO = 1;

  // Definition of table: Form
  //
  public static int TBL_FORM1 = 12;
  public static int FLD_FORM1_ROWNAMECOMUN = 0;
  public static int FLD_FORM1_ROWNAMEPROVI = 1;
  public static int FLD_FORM1_ROWNAMECAP = 2;
  public static int FLD_FORM1_ROWNAMEDATA = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI400 = 13;
  public static int FLD_PARAMETRI400_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI400_ROWNAMEESERC = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM125 = 14;
  public static int FLD_PARAM125_PARAMESERCIZ = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI518 = 15;
  public static int FLD_PARAMETRI518_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI518_ROWNAMEESERC = 1;
  public static int FLD_PARAMETRI518_ROWNAMEINTER = 2;

  // Definition of table: Parametri SIAP
  //
  public static int TBL_PARAMETRSIAP = 16;
  public static int FLD_PARAMETRSIAP_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRSIAP_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRSIAP_ROWNAMEARTIC = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI288 = 17;
  public static int FLD_PARAMETRI288_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI288_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI327 = 18;
  public static int FLD_PARAMETRI327_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI327_ROWNAMEESERC = 1;
  public static int FLD_PARAMETRI327_ROWNAMANNBUO = 2;
  public static int FLD_PARAMETRI327_ROWNAMNUMBUO = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI680 = 19;
  public static int FLD_PARAMETRI680_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI680_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI124 = 20;
  public static int FLD_PARAMETRI124_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI124_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI95 = 21;
  public static int FLD_PARAMETRI95_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI95_ROWNAMPROUNI = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI622 = 22;
  public static int FLD_PARAMETRI622_ROWNAMESCADU = 0;
  public static int FLD_PARAMETRI622_ROWNAMDATREG = 1;
  public static int FLD_PARAMETRI622_ROWNAMRISINT = 2;
  public static int FLD_PARAMETRI622_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI622_ROWNAMEARTIC = 4;
  public static int FLD_PARAMETRI622_ROWNAMENTSPE = 5;
  public static int FLD_PARAMETRI622_ROWNAMPROBCA = 6;
  public static int FLD_PARAMETRI622_ROWNAMOBICAP = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI453 = 23;
  public static int FLD_PARAMETRI453_PARAMES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI90 = 24;
  public static int FLD_PARAMETRI90_PARAMES = 0;
  public static int FLD_PARAMETRI90_PARAMTITOLO = 1;
  public static int FLD_PARAMETRI90_PARAMCODINTE = 2;
  public static int FLD_PARAMETRI90_PARAMCATEGOR = 3;
  public static int FLD_PARAMETRI90_PARAMCODTERZ = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI258 = 25;
  public static int FLD_PARAMETRI258_PARAMES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI108 = 26;
  public static int FLD_PARAMETRI108_PARAMES = 0;
  public static int FLD_PARAMETRI108_PARAMESERCIZ = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI80 = 27;
  public static int FLD_PARAMETRI80_PARAMES = 0;
  public static int FLD_PARAMETRI80_PARAMTITOLO = 1;
  public static int FLD_PARAMETRI80_PARAMCATEGOR = 2;
  public static int FLD_PARAMETRI80_PARAMCODINTE = 3;
  public static int FLD_PARAMETRI80_PARAMCODTERZ = 4;
  public static int FLD_PARAMETRI80_PARAVOCEECON = 5;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB1 = 28;
  public static int FLD_IMDB1_ROWNAMTIPREG = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI162 = 29;
  public static int FLD_PARAMETRI162_PARAMSCADUTI = 0;
  public static int FLD_PARAMETRI162_PARANASCPARA = 1;
  public static int FLD_PARAMETRI162_PARADATASCAD = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI196 = 30;
  public static int FLD_PARAMETRI196_ROWNAMEBANCA = 0;
  public static int FLD_PARAMETRI196_ROWNAMEABI = 1;
  public static int FLD_PARAMETRI196_ROWNAMECAB = 2;
  public static int FLD_PARAMETRI196_ROWNAMECOMUN = 3;
  public static int FLD_PARAMETRI196_ROWNAMEINDIR = 4;
  public static int FLD_PARAMETRI196_ROWNAMESPORT = 5;
  public static int FLD_PARAMETRI196_ROWNAMEPROVI = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI310 = 31;
  public static int FLD_PARAMETRI310_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI310_PARAMSOGGETT = 1;
  public static int FLD_PARAMETRI310_PARAMANNODOC = 2;
  public static int FLD_PARAMETRI310_PARAMNUMEDOC = 3;
  public static int FLD_PARAMETRI310_PARAMTUTTI = 4;
  public static int FLD_PARAMETRI310_PARAMBUONI = 5;
  public static int FLD_PARAMETRI310_PARAMSTORNO = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI333 = 32;
  public static int FLD_PARAMETRI333_SEDEPARAM = 0;
  public static int FLD_PARAMETRI333_ANNOPARAM = 1;
  public static int FLD_PARAMETRI333_DESCRIZPARAM = 2;
  public static int FLD_PARAMETRI333_NUMERDALPARA = 3;
  public static int FLD_PARAMETRI333_NUMERALPARAM = 4;
  public static int FLD_PARAMETRI333_DATADALPARAM = 5;
  public static int FLD_PARAMETRI333_DATAALPARAM = 6;
  public static int FLD_PARAMETRI333_PARAMFILTRO = 7;
  public static int FLD_PARAMETRI333_PARAANNOESIG = 8;
  public static int FLD_PARAMETRI333_PARPROUNIORG = 9;

  // Definition of table: Param
  //
  public static int TBL_PARAM174 = 33;
  public static int FLD_PARAM174_PARAMDELESEC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI96 = 34;
  public static int FLD_PARAMETRI96_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI96_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI150 = 35;
  public static int FLD_PARAMETRI150_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI150_ROWNAMEES = 1;
  public static int FLD_PARAMETRI150_ROWNAMCAPCON = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI123 = 36;
  public static int FLD_PARAMETRI123_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI123_ROWNAMEES = 1;
  public static int FLD_PARAMETRI123_ROWNAMETIPO = 2;
  public static int FLD_PARAMETRI123_ROWNAMPROUNI = 3;
  public static int FLD_PARAMETRI123_ROWNAMCAPCON = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI308 = 37;
  public static int FLD_PARAMETRI308_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI308_PARAMES = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI309 = 38;
  public static int FLD_PARAMETRI309_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI309_PARAMES = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI314 = 39;
  public static int FLD_PARAMETRI314_PARANNSUBIMP = 0;
  public static int FLD_PARAMETRI314_PARNUMSUBIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI381 = 40;
  public static int FLD_PARAMETRI381_PARAMANNOIMP = 0;
  public static int FLD_PARAMETRI381_PARAMNUMEIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI322 = 41;
  public static int FLD_PARAMETRI322_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI322_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI322_PARAMARTICOL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI112 = 42;
  public static int FLD_PARAMETRI112_ROWNAMETITOL = 0;

  // Definition of table: Paramenti
  //
  public static int TBL_PARAMENTI = 43;
  public static int FLD_PARAMENTI_ROWNAMETITOL = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM27 = 44;
  public static int FLD_PARAM27_ROWNAMESOGGE = 0;
  public static int FLD_PARAM27_ROWNAMESCADE = 1;
  public static int FLD_PARAM27_MODALITA_PAGAMENTO = 2;
  public static int FLD_PARAM27_IBAN = 3;
  public static int FLD_PARAM27_COD_BANCA = 4;
  public static int FLD_PARAM27_COD_SPORTELLO = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI17 = 45;
  public static int FLD_PARAMETRI17_ROWNAMEES = 0;
  public static int FLD_PARAMETRI17_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRI17_ROWNAMEARTIC = 2;
  public static int FLD_PARAMETRI17_ROWNAMEFINAN = 3;
  public static int FLD_PARAMETRI17_ROWNAMEESERC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI18 = 46;
  public static int FLD_PARAMETRI18_PARAMES = 0;
  public static int FLD_PARAMETRI18_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI18_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI18_PARAMOPERA = 3;
  public static int FLD_PARAMETRI18_PARAMESERCIZ = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI87 = 47;
  public static int FLD_PARAMETRI87_PARAANNOIMPE = 0;
  public static int FLD_PARAMETRI87_PARANUMEIMPE = 1;
  public static int FLD_PARAMETRI87_PARAMOPERA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI260 = 48;
  public static int FLD_PARAMETRI260_PARAMCAPITOL = 0;
  public static int FLD_PARAMETRI260_PARAMARTICOL = 1;
  public static int FLD_PARAMETRI260_PARAMES = 2;
  public static int FLD_PARAMETRI260_PARAMUOIMPEG = 3;
  public static int FLD_PARAMETRI260_PARAMPROGEID = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI224 = 49;
  public static int FLD_PARAMETRI224_ROWNAMECAPIT = 0;
  public static int FLD_PARAMETRI224_ROWNAMEARTIC = 1;
  public static int FLD_PARAMETRI224_ROWNAMEES = 2;
  public static int FLD_PARAMETRI224_ROWNAMDATREG = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI234 = 50;
  public static int FLD_PARAMETRI234_PARAMCAPITOL = 0;
  public static int FLD_PARAMETRI234_PARAMARTICOL = 1;
  public static int FLD_PARAMETRI234_PARAMES = 2;
  public static int FLD_PARAMETRI234_PARAMDATAREG = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI249 = 51;
  public static int FLD_PARAMETRI249_ROWNAMECAPIT = 0;
  public static int FLD_PARAMETRI249_ROWNAMEARTIC = 1;
  public static int FLD_PARAMETRI249_ROWNAMEES = 2;
  public static int FLD_PARAMETRI249_ROWNAMEUOIMP = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI353 = 52;
  public static int FLD_PARAMETRI353_ROWNAMECAPIT = 0;
  public static int FLD_PARAMETRI353_ROWNAMEARTIC = 1;
  public static int FLD_PARAMETRI353_ROWNAMEES = 2;
  public static int FLD_PARAMETRI353_ROWNAMEUOIMP = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI355 = 53;
  public static int FLD_PARAMETRI355_PARAMCAPITOL = 0;
  public static int FLD_PARAMETRI355_PARAMARTICOL = 1;
  public static int FLD_PARAMETRI355_PARAMES = 2;
  public static int FLD_PARAMETRI355_PARAMUOIMPEG = 3;
  public static int FLD_PARAMETRI355_PARAMPROGEID = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI352 = 54;
  public static int FLD_PARAMETRI352_PARAMCAPITOL = 0;
  public static int FLD_PARAMETRI352_PARAMARTICOL = 1;
  public static int FLD_PARAMETRI352_PARAMES = 2;
  public static int FLD_PARAMETRI352_PARAMUOIMPEG = 3;
  public static int FLD_PARAMETRI352_PARAMPROGEID = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI363 = 55;
  public static int FLD_PARAMETRI363_PARADATAVARI = 0;
  public static int FLD_PARAMETRI363_PARAMPROGRAM = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI382 = 56;
  public static int FLD_PARAMETRI382_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI382_ROWNAMEES = 1;
  public static int FLD_PARAMETRI382_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI382_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI382_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI382_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI382_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI382_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI382_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI382_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI382_ROWNAMCODTER = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI383 = 57;
  public static int FLD_PARAMETRI383_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI383_ROWNAMEES = 1;
  public static int FLD_PARAMETRI383_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI383_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI383_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI383_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI383_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI383_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI383_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI383_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI383_ROWNAMCODTER = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI384 = 58;
  public static int FLD_PARAMETRI384_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI384_ROWNAMEES = 1;
  public static int FLD_PARAMETRI384_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI384_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI384_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI384_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI384_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI384_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI384_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI384_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI384_ROWNAMCODTER = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI385 = 59;
  public static int FLD_PARAMETRI385_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI385_ROWNAMEES = 1;
  public static int FLD_PARAMETRI385_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI385_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI385_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI385_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI385_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI385_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI385_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI385_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI385_ROWNAMCODTER = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI386 = 60;
  public static int FLD_PARAMETRI386_ROWNAMEES = 0;
  public static int FLD_PARAMETRI386_ROWNAMEUOIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI387 = 61;
  public static int FLD_PARAMETRI387_PARAMES = 0;
  public static int FLD_PARAMETRI387_PARAMUOIMPEG = 1;
  public static int FLD_PARAMETRI387_PARAMPROGEID = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI132 = 62;
  public static int FLD_PARAMETRI132_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI132_ROWNAMEES = 1;
  public static int FLD_PARAMETRI132_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI132_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI132_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI132_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI132_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI132_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI132_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI132_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI132_ROWNAMCODTER = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI388 = 63;
  public static int FLD_PARAMETRI388_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI388_ROWNAMEES = 1;
  public static int FLD_PARAMETRI388_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI388_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI388_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI388_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI388_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI388_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI388_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI388_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI388_ROWNAMCODTER = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR101 = 64;
  public static int FLD_PAR101_ROWNAMTIPEVE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI97 = 65;
  public static int FLD_PARAMETRI97_ROWNAMEES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI418 = 66;
  public static int FLD_PARAMETRI418_ROWNAMEES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI419 = 67;
  public static int FLD_PARAMETRI419_ROWNAMEMISSI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI111 = 68;
  public static int FLD_PARAMETRI111_ROWNAMEES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI454 = 69;
  public static int FLD_PARAMETRI454_ROWNAMEFUNZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI455 = 70;
  public static int FLD_PARAMETRI455_ROWNAMEFUNZI = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM51 = 71;
  public static int FLD_PARAM51_ROWNAMETITOL = 0;
  public static int FLD_PARAM51_ROWNAMECATEG = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM54 = 72;
  public static int FLD_PARAM54_ROWNAMETITOL = 0;
  public static int FLD_PARAM54_ROWNAMECATEG = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI131 = 73;
  public static int FLD_PARAMETRI131_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI131_ROWNAMEES = 1;
  public static int FLD_PARAMETRI131_ROWNAMESECF4 = 2;
  public static int FLD_PARAMETRI131_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int FLD_PARAMETRI131_TIPO_VOCE_PEG = 4;
  public static int FLD_PARAMETRI131_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI131_ROWNAMEFUNZI = 6;
  public static int FLD_PARAMETRI131_ROWNAMESERVI = 7;
  public static int FLD_PARAMETRI131_ROWNAMECATEG = 8;
  public static int FLD_PARAMETRI131_ROWNAMCODINT = 9;
  public static int FLD_PARAMETRI131_ROWNAMCODTER = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR63 = 74;
  public static int FLD_PAR63_ROWNAMBOVAID = 0;
  public static int FLD_PAR63_ROWNAMEUO = 1;

  // Definition of table: IN
  //
  public static int TBL_IN16 = 75;
  public static int FLD_IN16_ROWNAMEPROUO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI405 = 76;
  public static int FLD_PARAMETRI405_PARATIPODIST = 0;
  public static int FLD_PARAMETRI405_PARAMLIQUIDA = 1;
  public static int FLD_PARAMETRI405_PARANULLOSTA = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM93 = 77;
  public static int FLD_PARAM93_NOMOGGTIPUTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI345 = 78;
  public static int FLD_PARAMETRI345_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI345_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI75 = 79;
  public static int FLD_PARAMETRI75_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI75_PARAMES = 1;
  public static int FLD_PARAMETRI75_PARATIPOSTAM = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI15 = 80;
  public static int FLD_PARAMETRI15_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI15_ROWNAMEES = 1;
  public static int FLD_PARAMETRI15_ROWNAMPROUNI = 2;
  public static int FLD_PARAMETRI15_ROWNAMCAPCON = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS2 = 81;
  public static int FLD_PARS2_NOMEOGGEESER = 0;
  public static int FLD_PARS2_NOMEOGGETTES = 1;
  public static int FLD_PARS2_NOMEOGGECAPI = 2;
  public static int FLD_PARS2_NOMEOGGEARTI = 3;
  public static int FLD_PARS2_NOMOGGCODIBI = 4;
  public static int FLD_PARS2_NOMOGGPROTIP = 5;
  public static int FLD_PARS2_NOMOGGMISTIT = 6;
  public static int FLD_PARS2_NOOGCOPAIVLI = 7;

  // Definition of table: Tipo Cod
  //
  public static int TBL_TIPOCOD3 = 82;
  public static int FLD_TIPOCOD3_NOMOGGTIPRIC = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS8 = 83;
  public static int FLD_PARS8_NOMOGGCOTIRI = 0;
  public static int FLD_PARS8_NOMEOGGETTES = 1;
  public static int FLD_PARS8_NOMEOGGELIVE = 2;
  public static int FLD_PARS8_NOMEOGGEESER = 3;
  public static int FLD_PARS8_NOMEOGGELIV4 = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI427 = 84;
  public static int FLD_PARAMETRI427_PARAMPARTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI423 = 85;
  public static int FLD_PARAMETRI423_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI423_ROWNAMEES = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI424 = 86;
  public static int FLD_PARAMETRI424_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI424_ROWNAMEES = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM101 = 87;
  public static int FLD_PARAM101_NOMEOGGEESER = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS78 = 88;
  public static int FLD_PARS78_NOMEOGGEESER = 0;
  public static int FLD_PARS78_NOMEOGGETTES = 1;
  public static int FLD_PARS78_NOMEOGGECAPI = 2;
  public static int FLD_PARS78_NOMEOGGEARTI = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS35 = 89;
  public static int FLD_PARS35_NOMEOGGEESER = 0;
  public static int FLD_PARS35_NOMEOGGETTES = 1;
  public static int FLD_PARS35_NOMEOGGEPROG = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS36 = 90;
  public static int FLD_PARS36_NOMEOGGETTES = 0;
  public static int FLD_PARS36_NOMEOGGEESER = 1;
  public static int FLD_PARS36_NOMOGGMISTIT = 2;
  public static int FLD_PARS36_NOMOGGPROTIP = 3;

  // Definition of table: Par
  //
  public static int TBL_PAR117 = 91;
  public static int FLD_PAR117_NOMOGGCOANCO = 0;
  public static int FLD_PAR117_NOMEOGGETTES = 1;

  // Definition of table: Variazioni Impegni
  //
  public static int TBL_VARIAZIMPEG3 = 92;
  public static int FLD_VARIAZIMPEG3_CODICE_STRUTTURA = 0;
  public static int FLD_VARIAZIMPEG3_NOMOGGCOPICO = 1;
  public static int FLD_VARIAZIMPEG3_CAPITOLO = 2;
  public static int FLD_VARIAZIMPEG3_ARTICOLO = 3;
  public static int FLD_VARIAZIMPEG3_NUMERO_IMP = 4;
  public static int FLD_VARIAZIMPEG3_ANNO_IMP = 5;
  public static int FLD_VARIAZIMPEG3_DESCRIZIONE = 6;
  public static int FLD_VARIAZIMPEG3_IMPORTO = 7;
  public static int FLD_VARIAZIMPEG3_ANNO_ESIGIBILITA = 8;
  public static int FLD_VARIAZIMPEG3_PROGRESSIVO = 9;
  public static int FLD_VARIAZIMPEG3_PROGR_UNITA_ORGANIZZATIVA = 10;
  public static int FLD_VARIAZIMPEG3_TIPO_VAR = 11;
  public static int FLD_VARIAZIMPEG3_VARIAZIONE_GENERATA = 12;
  public static int FLD_VARIAZIMPEG3_NOMOGGDETIVA = 13;

  // Definition of table: IN
  //
  public static int TBL_IN15 = 93;
  public static int FLD_IN15_NOMEOGGPROUO = 0;
  public static int FLD_IN15_NOMEOGGEESER = 1;
  public static int FLD_IN15_NOMEOGGETTES = 2;
  public static int FLD_IN15_NOMOGGCODSTR = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI478 = 94;
  public static int FLD_PARAMETRI478_PARAMISTITUT = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM136 = 95;
  public static int FLD_PARAM136_PARAMESERCIZ = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM137 = 96;
  public static int FLD_PARAM137_PARAMESERCIZ = 0;
  public static int FLD_PARAM137_PARAMANNOIMP = 1;
  public static int FLD_PARAM137_PARAMNUMEIMP = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI487 = 97;
  public static int FLD_PARAMETRI487_ROWNAMEES = 0;
  public static int FLD_PARAMETRI487_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRI487_ROWNAMEARTIC = 2;
  public static int FLD_PARAMETRI487_ROWNAMEFINAN = 3;
  public static int FLD_PARAMETRI487_ROWNAMEESERC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI500 = 98;
  public static int FLD_PARAMETRI500_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI500_ROWNAMEES = 1;
  public static int FLD_PARAMETRI500_ROWNAMRISINT = 2;
  public static int FLD_PARAMETRI500_ROWNAMCAPOLD = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI502 = 99;
  public static int FLD_PARAMETRI502_ROWNAMDATREG = 0;
  public static int FLD_PARAMETRI502_ROWNAMETIPO = 1;
  public static int FLD_PARAMETRI502_ROWNAMCODLI4 = 2;
  public static int FLD_PARAMETRI502_ROWNAMCODLI5 = 3;
  public static int FLD_PARAMETRI502_ROWNAMEES = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI504 = 100;
  public static int FLD_PARAMETRI504_ROWNAMDATREG = 0;
  public static int FLD_PARAMETRI504_ROWNAMEES = 1;
  public static int FLD_PARAMETRI504_ROWNAMANCATT = 2;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB2 = 101;
  public static int FLD_IMDB2_NOMEOGGCROID = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS59 = 102;
  public static int FLD_PARS59_NOMEOGGEOPER = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI681 = 103;
  public static int FLD_PARAMETRI681_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI681_ROWNAMEESERC = 1;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB7 = 104;
  public static int FLD_IMDB7_NOMEOGGEESER = 0;
  public static int FLD_IMDB7_NOMEOGGETTES = 1;
  public static int FLD_IMDB7_NOMEOGGECAPI = 2;
  public static int FLD_IMDB7_NOMEOGGEARTI = 3;
  public static int FLD_IMDB7_NOMOGGNUMACC = 4;
  public static int FLD_IMDB7_NOMOGGANNACC = 5;

  // Definition of table: FINANZIAMENTI
  //
  public static int TBL_FINANZIAME31 = 105;
  public static int FLD_FINANZIAME31_CODICE = 0;
  public static int FLD_FINANZIAME31_DESCRIZIONE = 1;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB8 = 106;
  public static int FLD_IMDB8_NOMEOGGEESER = 0;
  public static int FLD_IMDB8_NOMEOGGETTES = 1;
  public static int FLD_IMDB8_NOMEOGGECAPI = 2;
  public static int FLD_IMDB8_NOMEOGGEARTI = 3;
  public static int FLD_IMDB8_NOMEOGGEFINA = 4;
  public static int FLD_IMDB8_NOMOGGNUMACC = 5;
  public static int FLD_IMDB8_NOMOGGANNACC = 6;

  // Definition of table: OPERE
  //
  public static int TBL_OPERE6 = 107;
  public static int FLD_OPERE6_CODICE = 0;
  public static int FLD_OPERE6_DESCRIZIONE = 1;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB10 = 108;
  public static int FLD_IMDB10_PROGETTO_ID = 0;
  public static int FLD_IMDB10_NOMEOGGEFILT = 1;

  // Definition of table: IN
  //
  public static int TBL_IN17 = 109;
  public static int FLD_IN17_NOMOGGTIPPIA = 0;

  // Definition of table: IN
  //
  public static int TBL_IN19 = 110;
  public static int FLD_IN19_NOMEOGGEESER = 0;
  public static int FLD_IN19_NOMEOGGETTES = 1;
  public static int FLD_IN19_NOMEOGGECAPI = 2;
  public static int FLD_IN19_NOMEOGGEARTI = 3;

  // Definition of table: IN
  //
  public static int TBL_IN20 = 111;
  public static int FLD_IN20_NOMEOGGEESER = 0;
  public static int FLD_IN20_NOMEOGGETTES = 1;
  public static int FLD_IN20_NOMEOGGECAPI = 2;
  public static int FLD_IN20_NOMEOGGEARTI = 3;

  // Definition of table: Parss
  //
  public static int TBL_PARSS = 112;
  public static int FLD_PARSS_NOMEOGGEESCL = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS94 = 113;
  public static int FLD_PARS94_NOMEOGGEESER = 0;
  public static int FLD_PARS94_NOMEOGGETTES = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS95 = 114;
  public static int FLD_PARS95_NOMEOGGEESER = 0;
  public static int FLD_PARS95_NOMEOGGETTES = 1;
  public static int FLD_PARS95_NOMOGGMISTIT = 2;
  public static int FLD_PARS95_NOMOGGPROTIP = 3;

  // Definition of table: Tipo Cod
  //
  public static int TBL_TIPOCOD = 115;
  public static int FLD_TIPOCOD_NOMOGGTIPRIC = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS96 = 116;
  public static int FLD_PARS96_NOMEOGGEESER = 0;
  public static int FLD_PARS96_NOMEOGGETTES = 1;
  public static int FLD_PARS96_NOMOGGCODIBI = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM76 = 117;
  public static int FLD_PARAM76_NOMOGGTIPPIA = 0;
  public static int FLD_PARAM76_NOMEOGGELIVE = 1;
  public static int FLD_PARAM76_NOMOGGNAPASO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI21 = 118;
  public static int FLD_PARAMETRI21_PARAMOPERA = 0;
  public static int FLD_PARAMETRI21_PARADESCOPER = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI33 = 119;
  public static int FLD_PARAMETRI33_PARACODIFINA = 0;
  public static int FLD_PARAMETRI33_PARAMDATAAL = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI7 = 120;
  public static int FLD_PARAMETRI7_ROWNAMEUNITA = 0;
  public static int FLD_PARAMETRI7_ROWNAMENUMER = 1;
  public static int FLD_PARAMETRI7_ROWNAMEANNO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI61 = 121;
  public static int FLD_PARAMETRI61_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI61_PARAMES = 1;
  public static int FLD_PARAMETRI61_PARAMCAPITOL = 2;
  public static int FLD_PARAMETRI61_PARAMARTICOL = 3;
  public static int FLD_PARAMETRI61_PARAMDATADAL = 4;
  public static int FLD_PARAMETRI61_PARPROUNIORG = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI432 = 122;
  public static int FLD_PARAMETRI432_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI432_ROWNAMENTSPE = 1;
  public static int FLD_PARAMETRI432_ROWNAMECAPIT = 2;
  public static int FLD_PARAMETRI432_ROWNAMEARTIC = 3;

  // Definition of table: Cap UO IMDB
  //
  public static int TBL_CAPUOIMDB = 123;
  public static int FLD_CAPUOIMDB_ESERCIZIO = 0;
  public static int FLD_CAPUOIMDB_E_S = 1;
  public static int FLD_CAPUOIMDB_CAPITOLO = 2;
  public static int FLD_CAPUOIMDB_ARTICOLO = 3;
  public static int FLD_CAPUOIMDB_PROGR_UNITA_ORGANIZZATIVA = 4;
  public static int FLD_CAPUOIMDB_TIPO_UNITA_ORGANIZZATIVA = 5;
  public static int FLD_CAPUOIMDB_SCADENZA = 6;
  public static int FLD_CAPUOIMDB_UTENTE_INSERIMENTO = 7;
  public static int FLD_CAPUOIMDB_DATA_INSERIMENTO = 8;
  public static int FLD_CAPUOIMDB_UTENTE_ULTIMO_AGG = 9;
  public static int FLD_CAPUOIMDB_DATA_ULTIMO_AGG = 10;
  public static int FLD_CAPUOIMDB_PREVALENTE = 11;
  public static int FLD_CAPUOIMDB_CAPUOIMDBSTA = 12;

  // Definition of table: Param
  //
  public static int TBL_PARAM6 = 124;
  public static int FLD_PARAM6_ROWNAMEESERC = 0;
  public static int FLD_PARAM6_ROWNAMEES = 1;
  public static int FLD_PARAM6_ROWNAMECAPIT = 2;
  public static int FLD_PARAM6_ROWNAMEARTIC = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM42 = 125;
  public static int FLD_PARAM42_ROWNAMEESERC = 0;
  public static int FLD_PARAM42_ROWNAMEES = 1;
  public static int FLD_PARAM42_ROWNAMERISOR = 2;
  public static int FLD_PARAM42_ROWNAMECAPIT = 3;
  public static int FLD_PARAM42_ROWNAMEARTIC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI63 = 126;
  public static int FLD_PARAMETRI63_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI63_PARAMES = 1;
  public static int FLD_PARAMETRI63_PARAMCAPITOL = 2;
  public static int FLD_PARAMETRI63_PARAMARTICOL = 3;
  public static int FLD_PARAMETRI63_PARAMIMPEGNA = 4;
  public static int FLD_PARAMETRI63_PARAGESTECON = 5;
  public static int FLD_PARAMETRI63_PARPROUNIORG = 6;
  public static int FLD_PARAMETRI63_PARAMDATADAL = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI22 = 127;
  public static int FLD_PARAMETRI22_PARAMOPERA = 0;
  public static int FLD_PARAMETRI22_PARAMES = 1;
  public static int FLD_PARAMETRI22_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI23 = 128;
  public static int FLD_PARAMETRI23_PARAMOPERA = 0;
  public static int FLD_PARAMETRI23_PARAMES = 1;
  public static int FLD_PARAMETRI23_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI24 = 129;
  public static int FLD_PARAMETRI24_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI26 = 130;
  public static int FLD_PARAMETRI26_PARAMOPERA = 0;
  public static int FLD_PARAMETRI26_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI26_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI27 = 131;
  public static int FLD_PARAMETRI27_PARAMOPERA = 0;
  public static int FLD_PARAMETRI27_PARAMES = 1;
  public static int FLD_PARAMETRI27_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI28 = 132;
  public static int FLD_PARAMETRI28_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI315 = 133;
  public static int FLD_PARAMETRI315_PARAMOPERA = 0;
  public static int FLD_PARAMETRI315_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI315_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI30 = 134;
  public static int FLD_PARAMETRI30_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI31 = 135;
  public static int FLD_PARAMETRI31_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI32 = 136;
  public static int FLD_PARAMETRI32_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI34 = 137;
  public static int FLD_PARAMETRI34_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI36 = 138;
  public static int FLD_PARAMETRI36_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI37 = 139;
  public static int FLD_PARAMETRI37_PARAMOPERA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI38 = 140;
  public static int FLD_PARAMETRI38_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI38_PARAMES = 1;
  public static int FLD_PARAMETRI38_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI39 = 141;
  public static int FLD_PARAMETRI39_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI39_PARAMES = 1;
  public static int FLD_PARAMETRI39_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI40 = 142;
  public static int FLD_PARAMETRI40_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI41 = 143;
  public static int FLD_PARAMETRI41_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI41_PARAMES = 1;
  public static int FLD_PARAMETRI41_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI42 = 144;
  public static int FLD_PARAMETRI42_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI43 = 145;
  public static int FLD_PARAMETRI43_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI44 = 146;
  public static int FLD_PARAMETRI44_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI45 = 147;
  public static int FLD_PARAMETRI45_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI46 = 148;
  public static int FLD_PARAMETRI46_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI47 = 149;
  public static int FLD_PARAMETRI47_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI49 = 150;
  public static int FLD_PARAMETRI49_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI50 = 151;
  public static int FLD_PARAMETRI50_PARAMDATA = 0;
  public static int FLD_PARAMETRI50_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI50_PARAMTIPO = 2;
  public static int FLD_PARAMETRI50_PARAMANNOIMP = 3;
  public static int FLD_PARAMETRI50_PARAMNUMEIMP = 4;
  public static int FLD_PARAMETRI50_PARAANNOSUBI = 5;
  public static int FLD_PARAMETRI50_PARANUMESUBI = 6;
  public static int FLD_PARAMETRI50_PARESEANNMAN = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI51 = 152;
  public static int FLD_PARAMETRI51_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI52 = 153;
  public static int FLD_PARAMETRI52_PARAMDATA = 0;
  public static int FLD_PARAMETRI52_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI52_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI53 = 154;
  public static int FLD_PARAMETRI53_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI54 = 155;
  public static int FLD_PARAMETRI54_PARAMDATA = 0;
  public static int FLD_PARAMETRI54_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI54_PARAMTIPO = 2;
  public static int FLD_PARAMETRI54_PARAMANNOACC = 3;
  public static int FLD_PARAMETRI54_PARAMNUMEACC = 4;
  public static int FLD_PARAMETRI54_PARAMESERCIN = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI55 = 156;
  public static int FLD_PARAMETRI55_PARAMDATA = 0;
  public static int FLD_PARAMETRI55_PARAMFINANZI = 1;
  public static int FLD_PARAMETRI55_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI57 = 157;
  public static int FLD_PARAMETRI57_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI58 = 158;
  public static int FLD_PARAMETRI58_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI56 = 159;
  public static int FLD_PARAMETRI56_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI56_PARAMDATA = 1;
  public static int FLD_PARAMETRI56_PARAMTIPO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI239 = 160;
  public static int FLD_PARAMETRI239_ROWNAMEPROID = 0;
  public static int FLD_PARAMETRI239_ROWNAMEES = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI351 = 161;
  public static int FLD_PARAMETRI351_ROWNAMEOBIID = 0;
  public static int FLD_PARAMETRI351_ROWNAMEES = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI237 = 162;
  public static int FLD_PARAMETRI237_BENEFICIARIO = 0;
  public static int FLD_PARAMETRI237_NUM_QUIETANZA = 1;

  // Definition of table: Costanti
  //
  public static int TBL_COSTANTI = 163;
  public static int FLD_COSTANTI_ROWNAMNEWFIE = 0;
  public static int FLD_COSTANTI_ROWNAMNEWFI1 = 1;
  public static int FLD_COSTANTI_ROWNAMNEWFI2 = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI91 = 164;
  public static int FLD_PARAMETRI91_PARAANNODISP = 0;
  public static int FLD_PARAMETRI91_PARAPROGDISP = 1;
  public static int FLD_PARAMETRI91_PARAMINFO = 2;

  // Definition of table: Parametri Voce Peg
  //
  public static int TBL_PARAMVOCEPE4 = 165;
  public static int FLD_PARAMVOCEPE4_VOCEPEGCAPIT = 0;
  public static int FLD_PARAMVOCEPE4_VOCEPEGARTIC = 1;
  public static int FLD_PARAMVOCEPE4_VOCEPEGTITOL = 2;
  public static int FLD_PARAMVOCEPE4_VOCEPEGCATEG = 3;
  public static int FLD_PARAMVOCEPE4_VOCPEGCODINT = 4;
  public static int FLD_PARAMVOCEPE4_VOCPEGCODTER = 5;

  // Definition of table: Personalizzazione
  //
  public static int TBL_PERSONALIZ10 = 166;
  public static int FLD_PERSONALIZ10_PERSONALIZZA = 0;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM18 = 167;
  public static int FLD_PARAMESTAM18_PARSTASEDDEL = 0;
  public static int FLD_PARAMESTAM18_PARSTANUMDEL = 1;
  public static int FLD_PARAMESTAM18_PARSTADATDEL = 2;
  public static int FLD_PARAMESTAM18_PARSTATESINI = 3;
  public static int FLD_PARAMESTAM18_PARSTATEINGR = 4;
  public static int FLD_PARAMESTAM18_PARSTATEINCO = 5;
  public static int FLD_PARAMESTAM18_PARSTATEINSO = 6;
  public static int FLD_PARAMESTAM18_PARSTATESFIN = 7;
  public static int FLD_PARAMESTAM18_PARSTATEFIGR = 8;
  public static int FLD_PARAMESTAM18_PARSTATEFICO = 9;
  public static int FLD_PARAMESTAM18_PARSTATEFISO = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI412 = 168;
  public static int FLD_PARAMETRI412_PARANNDISFIL = 0;
  public static int FLD_PARAMETRI412_PARNUMDISFIL = 1;
  public static int FLD_PARAMETRI412_PARDATDISFIL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI415 = 169;
  public static int FLD_PARAMETRI415_ANNOPARAM = 0;
  public static int FLD_PARAMETRI415_PARAMNUMERO = 1;
  public static int FLD_PARAMETRI415_SEDEPARAM = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI437 = 170;
  public static int FLD_PARAMETRI437_ROWNAMESEDE = 0;
  public static int FLD_PARAMETRI437_ROWNAMEANNO = 1;
  public static int FLD_PARAMETRI437_ROWNAMENUMER = 2;

  // Definition of table: Parametri Input
  //
  public static int TBL_PARAMETINPU3 = 171;
  public static int FLD_PARAMETINPU3_PARAMANNOORD = 0;
  public static int FLD_PARAMETINPU3_PARAMNUMEORD = 1;

  // Definition of table: Parametri Voce Peg
  //
  public static int TBL_PARAMVOCEPE3 = 172;
  public static int FLD_PARAMVOCEPE3_PARVOCPEGTIT = 0;
  public static int FLD_PARAMVOCEPE3_PARVOCPECOIN = 1;
  public static int FLD_PARAMVOCEPE3_PARVOCPECOTE = 2;
  public static int FLD_PARAMVOCEPE3_PARVOCPEGCAT = 3;

  // Definition of table: Debitore
  //
  public static int TBL_DEBITORE1 = 173;
  public static int FLD_DEBITORE1_DEBIRAGISOCI = 0;
  public static int FLD_DEBITORE1_DEBITOCODICE = 1;

  // Definition of table: Importo
  //
  public static int TBL_IMPORTO4 = 174;
  public static int FLD_IMPORTO4_IMPORTO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI476 = 175;
  public static int FLD_PARAMETRI476_PARAMES = 0;
  public static int FLD_PARAMETRI476_PARAMRISORSA = 1;
  public static int FLD_PARAMETRI476_PARAMCAPITOL = 2;
  public static int FLD_PARAMETRI476_PARAMARTICOL = 3;
  public static int FLD_PARAMETRI476_PARAMDATADAL = 4;
  public static int FLD_PARAMETRI476_PARPROUNIORG = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI477 = 176;
  public static int FLD_PARAMETRI477_PARAMES = 0;
  public static int FLD_PARAMETRI477_PARAMRISORSA = 1;
  public static int FLD_PARAMETRI477_PARAMCAPITOL = 2;
  public static int FLD_PARAMETRI477_PARAMARTICOL = 3;
  public static int FLD_PARAMETRI477_PARAGESTECON = 4;
  public static int FLD_PARAMETRI477_PARAMSCADENZ = 5;

  // Definition of table: Vars
  //
  public static int TBL_VARS = 177;
  public static int FLD_VARS_NOMOGGBLOTOT = 0;
  public static int FLD_VARS_NOMEOGGEERRM = 1;

  // Definition of table: Da Passare
  //
  public static int TBL_DAPASSARE = 178;
  public static int FLD_DAPASSARE_ROWNAMENTOSP = 0;
  public static int FLD_DAPASSARE_ROWNAMELIVEL = 1;
  public static int FLD_DAPASSARE_ROWNAMESOTTO = 2;
  public static int FLD_DAPASSARE_ROWNAMECAPTI = 3;
  public static int FLD_DAPASSARE_ROWNAMESTRUT = 4;
  public static int FLD_DAPASSARE_ROWNAMECODIC = 5;
  public static int FLD_DAPASSARE_ROWNAMETIVAL = 6;
  public static int FLD_DAPASSARE_ROWNAMCODGER = 7;

  // Definition of table: IN
  //
  public static int TBL_IN1 = 179;
  public static int FLD_IN1_ROWNAMEPARTE = 0;
  public static int FLD_IN1_ROWNAMDELIPA = 1;
  public static int FLD_IN1_ROWNAMECAPTI = 2;
  public static int FLD_IN1_ROWNAMELIVEL = 3;
  public static int FLD_IN1_ROWNAMCOPAGE = 4;
  public static int FLD_IN1_ROWNAMECODIC = 5;
  public static int FLD_IN1_ROWNAMCODGER = 6;
  public static int FLD_IN1_ROWNAMSCSTID = 7;
  public static int FLD_IN1_ROWNAMESTRID = 8;
  public static int FLD_IN1_ROWNAMETIVAL = 9;

  // Definition of table: Codici Livelli STACK
  //
  public static int TBL_CODILIVESTAC = 180;
  public static int FLD_CODILIVESTAC_NOMEOGGEPROG = 0;
  public static int FLD_CODILIVESTAC_NOMEOGGECODI = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS19 = 181;
  public static int FLD_PARS19_NOMOGGTIPRIC = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS28 = 182;
  public static int FLD_PARS28_NOMOGGTIPRIC = 0;
  public static int FLD_PARS28_NOMOGGCONVIS = 1;

  // Definition of table: IN
  //
  public static int TBL_IN13 = 183;
  public static int FLD_IN13_NOMEOGGETTES = 0;
  public static int FLD_IN13_NOMOGGSTRIID = 1;
  public static int FLD_IN13_NOMOGGTIRIID = 2;
  public static int FLD_IN13_NOMOGGSCRIID = 3;
  public static int FLD_IN13_NOMEOGGELIVE = 4;
  public static int FLD_IN13_NOMOGGCODPAD = 5;
  public static int FLD_IN13_NOMOGGDESCAP = 6;
  public static int FLD_IN13_NOOGDELIPELA = 7;
  public static int FLD_IN13_NOMOGGCONVIS = 8;

  // Definition of table: VALORI CONTROLLO CODICI
  //
  public static int TBL_VALORI_CONTROLLO_CODICI = 184;
  public static int FLD_VALORI_CONTROLLO_CODICI_TIPO_CODICE = 0;
  public static int FLD_VALORI_CONTROLLO_CODICI_VALORE_CODICE = 1;
  public static int FLD_VALORI_CONTROLLO_CODICI_CODICE_CONTROLLO = 2;
  public static int FLD_VALORI_CONTROLLO_CODICI_VALORE_CONTROLLO = 3;
  public static int FLD_VALORI_CONTROLLO_CODICI_VACOCOVACOVL = 4;
  public static int FLD_VALORI_CONTROLLO_CODICI_VALCONCOINAG = 5;

  // Definition of table: Pars
  //
  public static int TBL_PARS29 = 185;
  public static int FLD_PARS29_NOMEOGGSEECO = 0;
  public static int FLD_PARS29_NOMEOGGSEFPV = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM144 = 186;
  public static int FLD_PARAM144_NOMEOGGETTIU = 0;
  public static int FLD_PARAM144_NOMEOGGEFLAG = 1;
  public static int FLD_PARAM144_NOMEOGGEDUPL = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM146 = 187;
  public static int FLD_PARAM146_NOMEOGGETTIU = 0;
  public static int FLD_PARAM146_NOMEOGGEDUPL = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM159 = 188;
  public static int FLD_PARAM159_PARTIPOCONTR = 0;
  public static int FLD_PARAM159_PARPROGRUNIT = 1;
  public static int FLD_PARAM159_PARANCHEESAU = 2;
  public static int FLD_PARAM159_PARUNITAORGA = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI286 = 189;
  public static int FLD_PARAMETRI286_PARAMES = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM4 = 190;
  public static int FLD_PARAM4_ROWNAMECAMPO = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR118 = 191;
  public static int FLD_PAR118_NOMEOGGELOOK = 0;

  // Definition of table: Lunghezze
  //
  public static int TBL_LUNGHEZZE = 192;
  public static int FLD_LUNGHEZZE_ROWNARITEMIN = 0;
  public static int FLD_LUNGHEZZE_ROWNAMEDESCR = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI560 = 193;
  public static int FLD_PARAMETRI560_PARAMLOOKUP = 0;
  public static int FLD_PARAMETRI560_PARAMTIPO = 1;

  // Definition of table: Valori Delle Espressioni
  //
  public static int TBL_VALODELLESPR = 194;
  public static int FLD_VALODELLESPR_RONAANPRINEE = 0;
  public static int FLD_VALODELLESPR_RONAAZTOLIME = 1;
  public static int FLD_VALODELLESPR_RONACOSEMAEX = 2;
  public static int FLD_VALODELLESPR_RONACOSEOREX = 3;
  public static int FLD_VALODELLESPR_RONAORELSCDE = 4;
  public static int FLD_VALODELLESPR_ROWNAMTIPEXP = 5;
  public static int FLD_VALODELLESPR_ROWNAMIMSPEX = 6;
  public static int FLD_VALODELLESPR_ROWNAMIMENEX = 7;
  public static int FLD_VALODELLESPR_ROWNAMTIP1EX = 8;
  public static int FLD_VALODELLESPR_ROWNAMCAECEX = 9;
  public static int FLD_VALODELLESPR_ROWNAMORDEXP = 10;
  public static int FLD_VALODELLESPR_ROWNAMGECEEX = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI456 = 195;
  public static int FLD_PARAMETRI456_ROWNAMEINFOR = 0;

  // Definition of table: Blobfake
  //
  public static int TBL_BLOBFAKE1 = 196;
  public static int FLD_BLOBFAKE1_ROWNAMEDUMMY = 0;

  // Definition of table: Blobfake
  //
  public static int TBL_BLOBFAKE = 197;
  public static int FLD_BLOBFAKE_ROWNAMEDUMMY = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI109 = 198;
  public static int FLD_PARAMETRI109_NOMOGGTIPSTA = 0;
  public static int FLD_PARAMETRI109_NOMOGGTISTOL = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI262 = 199;
  public static int FLD_PARAMETRI262_PARNUMDELDAL = 0;
  public static int FLD_PARAMETRI262_PARANUMDELAL = 1;
  public static int FLD_PARAMETRI262_PARDATDELDAL = 2;
  public static int FLD_PARAMETRI262_PARADATDELAL = 3;
  public static int FLD_PARAMETRI262_PARAMSEDE = 4;
  public static int FLD_PARAMETRI262_PARAMANNO = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI25 = 200;
  public static int FLD_PARAMETRI25_ROWNAMESEDE = 0;
  public static int FLD_PARAMETRI25_ROWNAMEANNO = 1;
  public static int FLD_PARAMETRI25_ROWNAMENUMER = 2;
  public static int FLD_PARAMETRI25_ROWNAMUPININ = 3;
  public static int FLD_PARAMETRI25_ROWNAMECLOSE = 4;
  public static int FLD_PARAMETRI25_ROWNAMEESECU = 5;

}
