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
public class IMDBDef4 extends Object
{
	// IMDB Constants
  // Definition of table: Par
  //
  public static int TBL_PAR71 = 601;
  public static int FLD_PAR71_ROWNAMEESERC = 0;
  public static int FLD_PAR71_RONASUPETIVA = 1;
  public static int FLD_PAR71_ROWNAMSOSANN = 2;

  // Definition of table: IN
  //
  public static int TBL_IN4 = 602;
  public static int FLD_IN4_ROWNAMEBOZZA = 0;
  public static int FLD_IN4_ROWNAMEFIRST = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR72 = 603;
  public static int FLD_PAR72_ROWNAMTIPVAR = 0;
  public static int FLD_PAR72_ROWNAMETITOL = 1;
  public static int FLD_PAR72_ROWNAMANNOSO = 2;
  public static int FLD_PAR72_ROWNAMEESERC = 3;

  // Definition of table: IN
  //
  public static int TBL_IN5 = 604;
  public static int FLD_IN5_ROWNAMBOVAID = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS7 = 605;
  public static int FLD_PARS7_RONASOSETIVA = 0;
  public static int FLD_PARS7_ROWNAMSOLAPP = 1;

  // Definition of table: IN
  //
  public static int TBL_IN6 = 606;
  public static int FLD_IN6_ROWNAMEBOZZA = 0;

  // Definition of table: IN
  //
  public static int TBL_IN7 = 607;
  public static int FLD_IN7_ROWNAMEBOZZA = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS10 = 608;
  public static int FLD_PARS10_ROWNAMETIPO = 0;

  // Definition of table: Una Quos
  //
  public static int TBL_UNAQUOS = 609;
  public static int FLD_UNAQUOS_ROWNAMEBOOLE = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS11 = 610;
  public static int FLD_PARS11_ROWNAMBOVAID = 0;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO9 = 611;
  public static int FLD_PANNELLO9_ROWNAMEVARID = 0;
  public static int FLD_PANNELLO9_ROWNAMTIPVAR = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS13 = 612;
  public static int FLD_PARS13_ROWNAMBOVAID = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS9 = 613;
  public static int FLD_PARS9_ROWNAMDATLIM = 0;

  // Definition of table: IN
  //
  public static int TBL_IN8 = 614;
  public static int FLD_IN8_ROWNAMPRVAID = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI135 = 615;
  public static int FLD_PARAMETRI135_ROWNAMTEMACO = 0;
  public static int FLD_PARAMETRI135_ROWNAMTEMALI = 1;
  public static int FLD_PARAMETRI135_ROWNAMEQUALE = 2;
  public static int FLD_PARAMETRI135_ROWNAMPRVAID = 3;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO11 = 616;
  public static int FLD_PANNELLO11_ROWNAMANVAGE = 0;

  // Definition of table: IN
  //
  public static int TBL_IN9 = 617;
  public static int FLD_IN9_ROWNAMEVARID = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR74 = 618;
  public static int FLD_PAR74_ROWNAMUNIPRO = 0;
  public static int FLD_PAR74_ROWNAMNUMPRO = 1;
  public static int FLD_PAR74_ROWNAMANNPRO = 2;
  public static int FLD_PAR74_ROWNAMDATVAR = 3;
  public static int FLD_PAR74_ROWNAMEVARID = 4;

  // Definition of table: Pars
  //
  public static int TBL_PARS15 = 619;
  public static int FLD_PARS15_ROWNAMENOTE = 0;
  public static int FLD_PARS15_RONASUPETIVA = 1;
  public static int FLD_PARS15_ROWNAMTOPETI = 2;

  // Definition of table: IN
  //
  public static int TBL_IN10 = 620;
  public static int FLD_IN10_ROWNAMEVARID = 0;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE17 = 621;
  public static int FLD_NEWTABLE17_ROWNAMRIGDES = 0;
  public static int FLD_NEWTABLE17_ROWNAMECOMUN = 1;
  public static int FLD_NEWTABLE17_ROWNAMRIGDE1 = 2;
  public static int FLD_NEWTABLE17_ROWNAMENOTE = 3;
  public static int FLD_NEWTABLE17_RONASUPETIVA = 4;
  public static int FLD_NEWTABLE17_ROWNAMTOPETI = 5;

  // Definition of table: IN
  //
  public static int TBL_IN11 = 622;
  public static int FLD_IN11_ROWNAMEVARID = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS16 = 623;
  public static int FLD_PARS16_ROWNAMEESERC = 0;
  public static int FLD_PARS16_ROWNADEVOPEG = 1;
  public static int FLD_PARS16_ROWNAMVOPECH = 2;
  public static int FLD_PARS16_RONAVOPEDAC1 = 3;

  // Definition of table: IN
  //
  public static int TBL_IN12 = 624;
  public static int FLD_IN12_ROWNAMEVARID = 0;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO = 625;
  public static int FLD_PANNELLO_ROWNAMEDESC = 0;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO27 = 626;
  public static int FLD_FILTRO27_ROWNAMEESERC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI106 = 627;
  public static int FLD_PARAMETRI106_PARAMES = 0;
  public static int FLD_PARAMETRI106_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI106_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI106_PARAGESTECON = 3;
  public static int FLD_PARAMETRI106_PARPROUNIORG = 4;
  public static int FLD_PARAMETRI106_PARAMDATADAL = 5;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO30 = 628;
  public static int FLD_FILTRO30_ROWNAMEESERC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI459 = 629;
  public static int FLD_PARAMETRI459_ROWNAMEES = 0;
  public static int FLD_PARAMETRI459_ROWNAMECAPIT = 1;
  public static int FLD_PARAMETRI459_ROWNAMEARTIC = 2;
  public static int FLD_PARAMETRI459_ROWNAMEPROID = 3;
  public static int FLD_PARAMETRI459_ROWNAMGESIMP = 4;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO31 = 630;
  public static int FLD_FILTRO31_ROWNAMEESERC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI406 = 631;
  public static int FLD_PARAMETRI406_ROWNAMEES = 0;
  public static int FLD_PARAMETRI406_ROWNAMEPROID = 1;
  public static int FLD_PARAMETRI406_ROWNAMGESIMP = 2;
  public static int FLD_PARAMETRI406_ROWNAMSCOBID = 3;
  public static int FLD_PARAMETRI406_ROWNAMECAPIT = 4;
  public static int FLD_PARAMETRI406_ROWNAMEARTIC = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI125 = 632;
  public static int FLD_PARAMETRI125_PARACODIFINA = 0;
  public static int FLD_PARAMETRI125_PARAMDATAAL = 1;
  public static int FLD_PARAMETRI125_PARAMESERCIZ = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI126 = 633;
  public static int FLD_PARAMETRI126_PARAMOPERA = 0;
  public static int FLD_PARAMETRI126_PARADESCOPER = 1;

  // Definition of table: Filtro
  //
  public static int TBL_FILTRO33 = 634;
  public static int FLD_FILTRO33_ROWNAMEESERC = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS21 = 635;
  public static int FLD_PARS21_ROWNAMECOMPE = 0;
  public static int FLD_PARS21_ROWNAMPROCHI = 1;
  public static int FLD_PARS21_ROWNAMSCOBID = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS23 = 636;
  public static int FLD_PARS23_ROWNAMECOMPE = 0;
  public static int FLD_PARS23_ROWNAMFAOBID = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS26 = 637;
  public static int FLD_PARS26_ROWNAMEPROUO = 0;
  public static int FLD_PARS26_ROWNAMEVARID = 1;
  public static int FLD_PARS26_RONADEVABIPE = 2;

  // Definition of table: Note 1
  //
  public static int TBL_NOTE1 = 638;
  public static int FLD_NOTE1_ROWNAMENOTE1 = 0;

  // Definition of table: Note 2
  //
  public static int TBL_NOTE2 = 639;
  public static int FLD_NOTE2_ROWNAMENOTE2 = 0;

  // Definition of table: Note 3
  //
  public static int TBL_NOTE3 = 640;
  public static int FLD_NOTE3_ROWNAMENOTE3 = 0;

  // Definition of table: Note 4
  //
  public static int TBL_NOTE4 = 641;
  public static int FLD_NOTE4_ROWNAMENOTE4 = 0;

  // Definition of table: Note 5
  //
  public static int TBL_NOTE5 = 642;
  public static int FLD_NOTE5_ROWNAMENOTE5 = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR34 = 643;
  public static int FLD_PAR34_ROWNAMEMODIF = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI303 = 644;
  public static int FLD_PARAMETRI303_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI303_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI303_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMETRI303_ROWNAMNUMDEL = 3;
  public static int FLD_PARAMETRI303_ROWNAMANNDEL = 4;
  public static int FLD_PARAMETRI303_ROWNAMUNIPRO = 5;
  public static int FLD_PARAMETRI303_ROWNAMNUMPRO = 6;
  public static int FLD_PARAMETRI303_ROWNAMANNPRO = 7;
  public static int FLD_PARAMETRI303_ROWNAMTIPSTA = 8;
  public static int FLD_PARAMETRI303_ROWNAMTIPIMP = 9;
  public static int FLD_PARAMETRI303_ROWNAMINTSTA = 10;
  public static int FLD_PARAMETRI303_ROWNAMECOMPE = 11;
  public static int FLD_PARAMETRI303_ROWNAMECOMPS = 12;
  public static int FLD_PARAMETRI303_ROWNAMECASSE = 13;
  public static int FLD_PARAMETRI303_ROWNAMECASSS = 14;
  public static int FLD_PARAMETRI303_ROWNAMVISSTA = 15;
  public static int FLD_PARAMETRI303_ROWNAMSTINCO = 16;
  public static int FLD_PARAMETRI303_ROWNAMSTINCA = 17;
  public static int FLD_PARAMETRI303_ROWNAMEDATAL = 18;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI510 = 645;
  public static int FLD_PARAMETRI510_ROWNAMVABIPE = 0;
  public static int FLD_PARAMETRI510_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRI510_ROWNAMTIPVAR = 2;
  public static int FLD_PARAMETRI510_ROWNAMEVARIA = 3;
  public static int FLD_PARAMETRI510_ROWNAMDAGIPR = 4;
  public static int FLD_PARAMETRI510_ROWNAMEDAL = 5;
  public static int FLD_PARAMETRI510_ROWNAMEAL = 6;
  public static int FLD_PARAMETRI510_ROWNAMSEDDEL = 7;
  public static int FLD_PARAMETRI510_ROWNAMNUMDEL = 8;
  public static int FLD_PARAMETRI510_ROWNAMANNDEL = 9;
  public static int FLD_PARAMETRI510_ROWNAMUNIPRO = 10;
  public static int FLD_PARAMETRI510_ROWNAMNUMPRO = 11;
  public static int FLD_PARAMETRI510_ROWNAMANNPRO = 12;
  public static int FLD_PARAMETRI510_ROWNAMDETCAP = 13;
  public static int FLD_PARAMETRI510_ROWNAMTIPSTA = 14;
  public static int FLD_PARAMETRI510_ROWNAMDESVAR = 15;
  public static int FLD_PARAMETRI510_ROWNAMTIPMOT = 16;
  public static int FLD_PARAMETRI510_ROWNAMDESINT = 17;
  public static int FLD_PARAMETRI510_ROWNAMEORDIN = 18;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI516 = 646;
  public static int FLD_PARAMETRI516_ROWNAMSEDDEL = 0;
  public static int FLD_PARAMETRI516_ROWNAMNUMDEL = 1;
  public static int FLD_PARAMETRI516_ROWNAMANNDEL = 2;
  public static int FLD_PARAMETRI516_ROWNAMUNIPRO = 3;
  public static int FLD_PARAMETRI516_ROWNAMNUMPRO = 4;
  public static int FLD_PARAMETRI516_ROWNAMANNPRO = 5;

  // Definition of table: IN
  //
  public static int TBL_IN = 647;
  public static int FLD_IN_NOMOGGSEDDEL = 0;
  public static int FLD_IN_NOMOGGNUMDEL = 1;
  public static int FLD_IN_NOMOGGANNDEL = 2;
  public static int FLD_IN_NOMOGGUNIPRO = 3;
  public static int FLD_IN_NOMOGGNUMPRO = 4;
  public static int FLD_IN_NOMOGGANNPRO = 5;
  public static int FLD_IN_NOMOGGTIPVAR = 6;
  public static int FLD_IN_NOMOGGDEFPRO = 7;
  public static int FLD_IN_NOMOGGTIPIMP = 8;

  // Definition of table: Param
  //
  public static int TBL_PARAM123 = 648;
  public static int FLD_PARAM123_PARAMPARTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI334 = 649;
  public static int FLD_PARAMETRI334_ROWNAMVABIPE = 0;
  public static int FLD_PARAMETRI334_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRI334_ROWNAMTIPVAR = 2;
  public static int FLD_PARAMETRI334_ROWNAMEVARIA = 3;
  public static int FLD_PARAMETRI334_ROWNAMDAGIPR = 4;
  public static int FLD_PARAMETRI334_ROWNAMEDAL = 5;
  public static int FLD_PARAMETRI334_ROWNAMEAL = 6;
  public static int FLD_PARAMETRI334_ROWNAMSEDDEL = 7;
  public static int FLD_PARAMETRI334_ROWNAMNUMDEL = 8;
  public static int FLD_PARAMETRI334_ROWNAMANNDEL = 9;
  public static int FLD_PARAMETRI334_ROWNAMUNIPRO = 10;
  public static int FLD_PARAMETRI334_ROWNAMNUMPRO = 11;
  public static int FLD_PARAMETRI334_ROWNAMANNPRO = 12;
  public static int FLD_PARAMETRI334_ROWNAMDETCAP = 13;
  public static int FLD_PARAMETRI334_ROWNAMTIPSTA = 14;
  public static int FLD_PARAMETRI334_ROWNAMDESVAR = 15;
  public static int FLD_PARAMETRI334_ROWNAMTIPMOT = 16;
  public static int FLD_PARAMETRI334_ROWNAMTIPIMP = 17;
  public static int FLD_PARAMETRI334_ROWNAMDESINT = 18;
  public static int FLD_PARAMETRI334_ROWNAMEORDIN = 19;

  // Definition of table: Paginazione
  //
  public static int TBL_PAGINAZIONE1 = 650;
  public static int FLD_PAGINAZIONE1_PAGINEUO = 0;
  public static int FLD_PAGINAZIONE1_PAGINETOTALI = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM124 = 651;
  public static int FLD_PARAM124_PARAMESERCIZ = 0;
  public static int FLD_PARAM124_PARAMPARTE = 1;
  public static int FLD_PARAM124_PARAMCAPITOL = 2;
  public static int FLD_PARAM124_PARAMARTICOL = 3;

  // Definition of table: Parfs
  //
  public static int TBL_PARFS = 652;
  public static int FLD_PARFS_NOMOGGNUMIMP = 0;
  public static int FLD_PARFS_NOMOGGANNIMP = 1;
  public static int FLD_PARFS_NOMOGGPRODEF = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI526 = 653;
  public static int FLD_PARAMETRI526_ROWNAMEVARIA = 0;
  public static int FLD_PARAMETRI526_ROWNAMSEDDEL = 1;
  public static int FLD_PARAMETRI526_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI526_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI526_ROWNAMUNIPRO = 4;
  public static int FLD_PARAMETRI526_ROWNAMNUMPRO = 5;
  public static int FLD_PARAMETRI526_ROWNAMANNPRO = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI202 = 654;
  public static int FLD_PARAMETRI202_ROWNAMVABIPE = 0;
  public static int FLD_PARAMETRI202_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRI202_ROWNAMEFINAN = 2;
  public static int FLD_PARAMETRI202_ROWNAMEOPERA = 3;
  public static int FLD_PARAMETRI202_ROWNAMTIPVAR = 4;
  public static int FLD_PARAMETRI202_ROWNAMEVARIA = 5;
  public static int FLD_PARAMETRI202_ROWNAMEDAL = 6;
  public static int FLD_PARAMETRI202_ROWNAMEAL = 7;
  public static int FLD_PARAMETRI202_ROWNAMSEDDEL = 8;
  public static int FLD_PARAMETRI202_ROWNAMNUMDEL = 9;
  public static int FLD_PARAMETRI202_ROWNAMANNDEL = 10;
  public static int FLD_PARAMETRI202_ROWNAMUNIPRO = 11;
  public static int FLD_PARAMETRI202_ROWNAMNUMPRO = 12;
  public static int FLD_PARAMETRI202_ROWNAMANNPRO = 13;
  public static int FLD_PARAMETRI202_ROWNAMDETOPE = 14;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI338 = 655;
  public static int FLD_PARAMETRI338_ROWNAMVABIPE = 0;
  public static int FLD_PARAMETRI338_ROWNAMEPARTE = 1;
  public static int FLD_PARAMETRI338_ROWNAMTIPVAR = 2;
  public static int FLD_PARAMETRI338_ROWNAMEVARIA = 3;
  public static int FLD_PARAMETRI338_ROWNAMDAGIPR = 4;
  public static int FLD_PARAMETRI338_ROWNAMEDAL = 5;
  public static int FLD_PARAMETRI338_ROWNAMEAL = 6;
  public static int FLD_PARAMETRI338_ROWNAMSEDDEL = 7;
  public static int FLD_PARAMETRI338_ROWNAMNUMDEL = 8;
  public static int FLD_PARAMETRI338_ROWNAMANNDEL = 9;
  public static int FLD_PARAMETRI338_ROWNAMUNIPRO = 10;
  public static int FLD_PARAMETRI338_ROWNAMNUMPRO = 11;
  public static int FLD_PARAMETRI338_ROWNAMANNPRO = 12;
  public static int FLD_PARAMETRI338_ROWNAMTIPSTA = 13;
  public static int FLD_PARAMETRI338_ROWNAMDETCAP = 14;
  public static int FLD_PARAMETRI338_ROWNAMDESINT = 15;
  public static int FLD_PARAMETRI338_ROWNAMDESVAR = 16;
  public static int FLD_PARAMETRI338_ROWNAMEPROGR = 17;
  public static int FLD_PARAMETRI338_ROWNAMEPROGE = 18;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO16 = 656;
  public static int FLD_PARAMETRIO16_PROGRAMMAOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI439 = 657;
  public static int FLD_PARAMETRI439_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI439_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI439_ROWNAMSEDDEL = 2;
  public static int FLD_PARAMETRI439_ROWNAMNUMDEL = 3;
  public static int FLD_PARAMETRI439_ROWNAMANNDEL = 4;
  public static int FLD_PARAMETRI439_ROWNAMUNIPRO = 5;
  public static int FLD_PARAMETRI439_ROWNAMNUMPRO = 6;
  public static int FLD_PARAMETRI439_ROWNAMANNPRO = 7;
  public static int FLD_PARAMETRI439_ROWNAMEESERC = 8;

  // Definition of table: Param
  //
  public static int TBL_PARAM179 = 658;
  public static int FLD_PARAM179_NOMOGGDEFPRO = 0;
  public static int FLD_PARAM179_NOMOGGSEDDEL = 1;
  public static int FLD_PARAM179_NOMOGGNUMDEL = 2;
  public static int FLD_PARAM179_NOMOGGANNDEL = 3;
  public static int FLD_PARAM179_NOMOGGSEDPRO = 4;
  public static int FLD_PARAM179_NOMOGGNUMPRO = 5;
  public static int FLD_PARAM179_NOMOGGANNPRO = 6;
  public static int FLD_PARAM179_NOMOGGTIPQUA = 7;
  public static int FLD_PARAM179_NOMOGGPROINS = 8;
  public static int FLD_PARAM179_NOMOGGDELINS = 9;
  public static int FLD_PARAM179_NOMEOGGETIPO = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR114 = 659;
  public static int FLD_PAR114_NOOGCOANCOAN = 0;

  // Definition of table: Variazioni Impegni
  //
  public static int TBL_VARIAZIMPEG2 = 660;
  public static int FLD_VARIAZIMPEG2_CODICE_STRUTTURA = 0;
  public static int FLD_VARIAZIMPEG2_NOMOGGCOPICO = 1;
  public static int FLD_VARIAZIMPEG2_CAPITOLO = 2;
  public static int FLD_VARIAZIMPEG2_ARTICOLO = 3;
  public static int FLD_VARIAZIMPEG2_NUMERO_IMP = 4;
  public static int FLD_VARIAZIMPEG2_ANNO_IMP = 5;
  public static int FLD_VARIAZIMPEG2_DESCRIZIONE = 6;
  public static int FLD_VARIAZIMPEG2_IMPORTO = 7;
  public static int FLD_VARIAZIMPEG2_ANNO_ESIGIBILITA = 8;
  public static int FLD_VARIAZIMPEG2_PROGRESSIVO = 9;
  public static int FLD_VARIAZIMPEG2_PROGR_UNITA_ORGANIZZATIVA = 10;
  public static int FLD_VARIAZIMPEG2_NOMOGGANNENT = 11;

  // Definition of table: Pars
  //
  public static int TBL_PARS31 = 661;
  public static int FLD_PARS31_NOMEOGGEPROP = 0;
  public static int FLD_PARS31_NOMEOGGENUME = 1;
  public static int FLD_PARS31_NOMEOGGEANNO = 2;
  public static int FLD_PARS31_NOMEOGGEDESC = 3;
  public static int FLD_PARS31_NOMOGGDATREG = 4;
  public static int FLD_PARS31_NOOGCOANCOAN = 5;
  public static int FLD_PARS31_NOMOGGTIPVAR = 6;

  // Definition of table: Param
  //
  public static int TBL_PARAM47 = 662;
  public static int FLD_PARAM47_NOMEOGGEVARI = 0;
  public static int FLD_PARAM47_NOMEOGGEPROP = 1;
  public static int FLD_PARAM47_NOMOGGNUMPRO = 2;
  public static int FLD_PARAM47_NOMOGGANNPRO = 3;
  public static int FLD_PARAM47_NOMEOGGEDELI = 4;
  public static int FLD_PARAM47_NOMOGGNUMDEL = 5;
  public static int FLD_PARAM47_NOMOGGANNDEL = 6;
  public static int FLD_PARAM47_NOMEOGGECAPI = 7;
  public static int FLD_PARAM47_NOMEOGGEARTI = 8;
  public static int FLD_PARAM47_NOMOGGNUIMAC = 9;
  public static int FLD_PARAM47_NOMOGGANIMAC = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR121 = 663;
  public static int FLD_PAR121_NOMOGGRITANT = 0;

  // Definition of table: Variazioni Accertamenti
  //
  public static int TBL_VARIAZACCER2 = 664;
  public static int FLD_VARIAZACCER2_NOMOGGCODSTR = 0;
  public static int FLD_VARIAZACCER2_NOMOGGCOPICO = 1;
  public static int FLD_VARIAZACCER2_NOMEOGGECAPI = 2;
  public static int FLD_VARIAZACCER2_NOMEOGGEARTI = 3;
  public static int FLD_VARIAZACCER2_NOMOGGNUMACC = 4;
  public static int FLD_VARIAZACCER2_ANNO_IMP = 5;
  public static int FLD_VARIAZACCER2_DESCRIZIONE = 6;
  public static int FLD_VARIAZACCER2_IMPORTO = 7;
  public static int FLD_VARIAZACCER2_ANNO_ESIGIBILITA = 8;
  public static int FLD_VARIAZACCER2_PROGRESSIVO = 9;
  public static int FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA = 10;

  // Definition of table: Pars
  //
  public static int TBL_PARS67 = 665;
  public static int FLD_PARS67_NOMEOGGEPROP = 0;
  public static int FLD_PARS67_NOMEOGGENUME = 1;
  public static int FLD_PARS67_NOMEOGGEANNO = 2;
  public static int FLD_PARS67_NOMEOGGEDESC = 3;
  public static int FLD_PARS67_NOMOGGDATREG = 4;
  public static int FLD_PARS67_NOMOGGRITANT = 5;
  public static int FLD_PARS67_NOMOGGTIPVAR = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI650 = 666;
  public static int FLD_PARAMETRI650_PARATIPOVARI = 0;
  public static int FLD_PARAMETRI650_PASOTIVAPEAV = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI652 = 667;
  public static int FLD_PARAMETRI652_PARAMVARIAZI = 0;
  public static int FLD_PARAMETRI652_PARAMDATADAL = 1;
  public static int FLD_PARAMETRI652_PARAMDATAAL = 2;
  public static int FLD_PARAMETRI652_PASOVACOTIAV = 3;
  public static int FLD_PARAMETRI652_PARTOTPERCAP = 4;
  public static int FLD_PARAMETRI652_PARTOTPEANRE = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI654 = 668;
  public static int FLD_PARAMETRI654_PARATIPOAVAN = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI656 = 669;
  public static int FLD_PARAMETRI656_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI656_PARSOLRIGREG = 1;
  public static int FLD_PARAMETRI656_PARALOOUPCAP = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI665 = 670;
  public static int FLD_PARAMETRI665_PARAMPARTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI329 = 671;
  public static int FLD_PARAMETRI329_PARTIPVISSAL = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI696 = 672;
  public static int FLD_PARAMETRI696_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI696_PARAESTRDATI = 1;
  public static int FLD_PARAMETRI696_PARAAVANINIZ = 2;
  public static int FLD_PARAMETRI696_PARAVERSAVAN = 3;
  public static int FLD_PARAMETRI696_PARAVERSSALV = 4;
  public static int FLD_PARAMETRI696_PARATIPOAVAN = 5;
  public static int FLD_PARAMETRI696_PARAFONDACCA = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI697 = 673;
  public static int FLD_PARAMETRI697_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI697_PARAVERSSALV = 1;
  public static int FLD_PARAMETRI697_PARAFONDACCA = 2;
  public static int FLD_PARAMETRI697_PARATIPOAVAN = 3;
  public static int FLD_PARAMETRI697_PARANOTEVERS = 4;
  public static int FLD_PARAMETRI697_PARDESFONACC = 5;
  public static int FLD_PARAMETRI697_PARDESTIPAVA = 6;

  // Definition of table: Valori Avanzo Esercizio
  //
  public static int TBL_VALOAVANESER = 674;
  public static int FLD_VALOAVANESER_VALOAVANINIZ = 0;
  public static int FLD_VALOAVANESER_VALORIACCERT = 1;
  public static int FLD_VALOAVANESER_VALRESATTAUM = 2;
  public static int FLD_VALOAVANESER_VALRESATTDIM = 3;
  public static int FLD_VALOAVANESER_VALORIIMPEGN = 4;
  public static int FLD_VALOAVANESER_VALORIFPV = 5;
  public static int FLD_VALOAVANESER_VALRESPASRID = 6;
  public static int FLD_VALOAVANESER_VALIMPREIRID = 7;
  public static int FLD_VALOAVANESER_VALOAVANFINA = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI698 = 675;
  public static int FLD_PARAMETRI698_PARAMESERCIZ = 0;
  public static int FLD_PARAMETRI698_PARAVERSSALV = 1;
  public static int FLD_PARAMETRI698_PARAFONDACCA = 2;
  public static int FLD_PARAMETRI698_PARATIPOAVAN = 3;
  public static int FLD_PARAMETRI698_PARATIPOMOVI = 4;
  public static int FLD_PARAMETRI698_PARAMTITOLO = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM82 = 676;
  public static int FLD_PARAM82_ROWNAMEPARTE = 0;
  public static int FLD_PARAM82_ROWNAMDETCAP = 1;
  public static int FLD_PARAM82_ROWNAMDESINT = 2;
  public static int FLD_PARAM82_ROWNAMDESABB = 3;
  public static int FLD_PARAM82_RONASOTOPETI = 4;
  public static int FLD_PARAM82_ROWNAMSOLCOM = 5;
  public static int FLD_PARAM82_ROWNAMSEROPE = 6;
  public static int FLD_PARAM82_ROWNAMEINTER = 7;
  public static int FLD_PARAM82_ROWNAMECAPIT = 8;
  public static int FLD_PARAM82_ROWNAMEARTIC = 9;
  public static int FLD_PARAM82_ROWNAMDATELA = 10;
  public static int FLD_PARAM82_ROWNAMUNIORG = 11;

  // Definition of table: Par
  //
  public static int TBL_PAR16 = 677;
  public static int FLD_PAR16_ROWNAMEMESI = 0;
  public static int FLD_PAR16_ROWNAMDETCAP = 1;
  public static int FLD_PAR16_ROWNAMDESINT = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR102 = 678;
  public static int FLD_PAR102_ROWNAMDETCAP = 0;
  public static int FLD_PAR102_ROWNAMSTDEIN = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI396 = 679;
  public static int FLD_PARAMETRI396_PARAMSITUPER = 0;
  public static int FLD_PARAMETRI396_PARAMFUNZION = 1;
  public static int FLD_PARAMETRI396_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI396_PARASETTOPER = 3;
  public static int FLD_PARAMETRI396_PARASERVOPER = 4;
  public static int FLD_PARAMETRI396_PARACENDICOS = 5;
  public static int FLD_PARAMETRI396_PARAMUOSUDDI = 6;
  public static int FLD_PARAMETRI396_PARAMUOSOTTO = 7;
  public static int FLD_PARAMETRI396_PARAMTITOLO = 8;
  public static int FLD_PARAMETRI396_PARACATECAPI = 9;
  public static int FLD_PARAMETRI396_PARATIPOVINC = 10;
  public static int FLD_PARAMETRI396_PARAVINCSCAD = 11;
  public static int FLD_PARAMETRI396_PARAMPROGRAM = 12;
  public static int FLD_PARAMETRI396_PARAMPROGETT = 13;
  public static int FLD_PARAMETRI396_PARAMFLESSIB = 14;
  public static int FLD_PARAMETRI396_PARAVOCEECON = 15;
  public static int FLD_PARAMETRI396_PARACODIGEST = 16;
  public static int FLD_PARAMETRI396_PARADATAELAB = 17;
  public static int FLD_PARAMETRI396_PARAMPARTE = 18;
  public static int FLD_PARAMETRI396_PARADETTCAPI = 19;
  public static int FLD_PARAMETRI396_PARADESCINTE = 20;
  public static int FLD_PARAMETRI396_PARADESCABBR = 21;
  public static int FLD_PARAMETRI396_PARSOLTOPETI = 22;
  public static int FLD_PARAMETRI396_PARASOLOCOMP = 23;
  public static int FLD_PARAMETRI396_PARASERVOPE1 = 24;
  public static int FLD_PARAMETRI396_PARAUNITORGA = 25;
  public static int FLD_PARAMETRI396_PARAMINTERVE = 26;
  public static int FLD_PARAMETRI396_PARATIPDISPE = 27;
  public static int FLD_PARAMETRI396_PARTIPVIDAMO = 28;
  public static int FLD_PARAMETRI396_PARAMCLASSIF = 29;
  public static int FLD_PARAMETRI396_PARADESUOSOP = 30;
  public static int FLD_PARAMETRI396_PARADESUOSOT = 31;

  // Definition of table: Param
  //
  public static int TBL_PARAM90 = 680;
  public static int FLD_PARAM90_ROWNAMDESINT = 0;
  public static int FLD_PARAM90_ROWNAMDESABB = 1;
  public static int FLD_PARAM90_ROWNAMSOLCOM = 2;
  public static int FLD_PARAM90_ROWNAMEINTER = 3;
  public static int FLD_PARAM90_ROWNAMECAPIT = 4;
  public static int FLD_PARAM90_ROWNAMEARTIC = 5;
  public static int FLD_PARAM90_ROWNAMDATELA = 6;
  public static int FLD_PARAM90_RONASOVPCAPU = 7;
  public static int FLD_PARAM90_ROWNAMVOCPEG = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI398 = 681;
  public static int FLD_PARAMETRI398_PARAMSITUPER = 0;
  public static int FLD_PARAMETRI398_PARAMFUNZION = 1;
  public static int FLD_PARAMETRI398_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI398_PARASETTOPER = 3;
  public static int FLD_PARAMETRI398_PARASERVOPER = 4;
  public static int FLD_PARAMETRI398_PARACENDICOS = 5;
  public static int FLD_PARAMETRI398_PARAMUOSUDDI = 6;
  public static int FLD_PARAMETRI398_PARAMUOSOTTO = 7;
  public static int FLD_PARAMETRI398_PARAMTITOLO = 8;
  public static int FLD_PARAMETRI398_PARSOLRIPEIN = 9;
  public static int FLD_PARAMETRI398_PARADATAELAB = 10;
  public static int FLD_PARAMETRI398_PARADETTCAPI = 11;
  public static int FLD_PARAMETRI398_PARADESCINT1 = 12;
  public static int FLD_PARAMETRI398_PARADESCABBR = 13;
  public static int FLD_PARAMETRI398_PARASOLOTOTA = 14;
  public static int FLD_PARAMETRI398_PARASOLOCOMP = 15;
  public static int FLD_PARAMETRI398_PARASERVOPE1 = 16;
  public static int FLD_PARAMETRI398_PARAUNITORGA = 17;
  public static int FLD_PARAMETRI398_PARAMINTERVE = 18;
  public static int FLD_PARAMETRI398_PARATIPDISPE = 19;
  public static int FLD_PARAMETRI398_PARAMCLASSIF = 20;
  public static int FLD_PARAMETRI398_PARADESUOSOP = 21;
  public static int FLD_PARAMETRI398_PARADESUOSOT = 22;
  public static int FLD_PARAMETRI398_PARATIPOSPES = 23;
  public static int FLD_PARAMETRI398_PARADESCINTE = 24;
  public static int FLD_PARAMETRI398_PARADESCTITO = 25;
  public static int FLD_PARAMETRI398_PARAMSUDD = 26;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT11 = 682;
  public static int FLD_PERSIT11_NOMEOGGEMISS = 0;
  public static int FLD_PERSIT11_NOMEOGGEPROG = 1;
  public static int FLD_PERSIT11_NOMOGGSOLCOM = 2;
  public static int FLD_PERSIT11_NOMOGGDATELA = 3;
  public static int FLD_PERSIT11_NOMOGGSOCAIM = 4;

  // Definition of table: Pars
  //
  public static int TBL_PARS54 = 683;
  public static int FLD_PARS54_NOMEOGGESTAN = 0;
  public static int FLD_PARS54_NOMOGGDATELA = 1;
  public static int FLD_PARS54_NOMEOGGEDISP = 2;
  public static int FLD_PARS54_NOMOGGTIPBIL = 3;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT3 = 684;
  public static int FLD_PERSIT3_NOMEOGGEMISS = 0;
  public static int FLD_PERSIT3_NOMEOGGEPROG = 1;
  public static int FLD_PERSIT3_NOMEOGGETITO = 2;
  public static int FLD_PERSIT3_NOMOGGDETCAP = 3;
  public static int FLD_PERSIT3_NOMOGGSOLCOM = 4;
  public static int FLD_PERSIT3_NOMOGGDESABB = 5;
  public static int FLD_PERSIT3_NOMOGGDATELA = 6;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT9 = 685;
  public static int FLD_PERSIT9_NOMEOGGEMISS = 0;
  public static int FLD_PERSIT9_NOMEOGGEPROG = 1;
  public static int FLD_PERSIT9_NOMEOGGETITO = 2;
  public static int FLD_PERSIT9_NOMOGGDETCAP = 3;
  public static int FLD_PERSIT9_NOMOGGSOLCOM = 4;
  public static int FLD_PERSIT9_NOMOGGDESABB = 5;
  public static int FLD_PERSIT9_NOMOGGDATELA = 6;
  public static int FLD_PERSIT9_NOMEOGGEMACR = 7;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT5 = 686;
  public static int FLD_PERSIT5_NOMEOGGETITO = 0;
  public static int FLD_PERSIT5_NOMEOGGETIPO = 1;
  public static int FLD_PERSIT5_NOMOGGDETCAP = 2;
  public static int FLD_PERSIT5_NOMOGGSOLCOM = 3;
  public static int FLD_PERSIT5_NOMOGGDESABB = 4;
  public static int FLD_PERSIT5_NOMOGGDATELA = 5;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT7 = 687;
  public static int FLD_PERSIT7_NOMEOGGETITO = 0;
  public static int FLD_PERSIT7_NOMEOGGEMACR = 1;
  public static int FLD_PERSIT7_NOMOGGDETCAP = 2;
  public static int FLD_PERSIT7_NOMOGGSOLCOM = 3;
  public static int FLD_PERSIT7_NOMOGGDESABB = 4;
  public static int FLD_PERSIT7_NOMOGGDATELA = 5;
  public static int FLD_PERSIT7_NOMOGGTIPMAC = 6;
  public static int FLD_PERSIT7_NOMEOGGETTES = 7;

  // Definition of table: Per Sit
  //
  public static int TBL_PERSIT = 688;
  public static int FLD_PERSIT_NOMOGGDETCAP = 0;
  public static int FLD_PERSIT_NOMOGGSOLCOM = 1;
  public static int FLD_PERSIT_NOMOGGTOPETI = 2;
  public static int FLD_PERSIT_NOMOGGDESABB = 3;
  public static int FLD_PERSIT_NOMOGGDATELA = 4;
  public static int FLD_PERSIT_NOMOGGTIPCLA = 5;
  public static int FLD_PERSIT_NOMEOGGETTES = 6;
  public static int FLD_PERSIT_NOMEOGGEFLES = 7;
  public static int FLD_PERSIT_NOMOGGTIPVIN = 8;
  public static int FLD_PERSIT_NOOGSIPEQUUO = 9;
  public static int FLD_PERSIT_NOMOGUOSUOUT = 10;
  public static int FLD_PERSIT_NOMOGGDEUOSU = 11;
  public static int FLD_PERSIT_NOMEOGGUOGES = 12;
  public static int FLD_PERSIT_NOMOGDEUOSU2 = 13;
  public static int FLD_PERSIT_NOMOGGUOSUP2 = 14;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI440 = 689;
  public static int FLD_PARAMETRI440_NOMEOGGETTES = 0;
  public static int FLD_PARAMETRI440_NOMOGGUNIORG = 1;
  public static int FLD_PARAMETRI440_NOMEOGGETITO = 2;
  public static int FLD_PARAMETRI440_NOMOGGDATELA = 3;

  // Definition of table: Totali
  //
  public static int TBL_TOTALI2 = 690;
  public static int FLD_TOTALI2_NOMOGGSTNCOM = 0;
  public static int FLD_TOTALI2_NOMOGGRESINI = 1;
  public static int FLD_TOTALI2_NOMOGGRESATT = 2;
  public static int FLD_TOTALI2_NOMOGGSTNCAS = 3;
  public static int FLD_TOTALI2_NOMEOGGEMAND = 4;
  public static int FLD_TOTALI2_NOMEOGGEDISP = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI442 = 691;
  public static int FLD_PARAMETRI442_ROWNAMEDAL = 0;
  public static int FLD_PARAMETRI442_ROWNAMEESERC = 1;
  public static int FLD_PARAMETRI442_ROWNAMEUOGES = 2;
  public static int FLD_PARAMETRI442_ROWNAMEUOUTI = 3;
  public static int FLD_PARAMETRI442_ROWNAMECAPIT = 4;
  public static int FLD_PARAMETRI442_ROWNAMEARTIC = 5;
  public static int FLD_PARAMETRI442_ROWNAMESEVOC = 6;
  public static int FLD_PARAMETRI442_ROWNAMSUBIMP = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI444 = 692;
  public static int FLD_PARAMETRI444_PARAMDAL = 0;
  public static int FLD_PARAMETRI444_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI444_PARAMUOGESTI = 2;
  public static int FLD_PARAMETRI444_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI444_PARAMCAPITOL = 4;
  public static int FLD_PARAMETRI444_PARAMARTICOL = 5;

  // Definition of table: Param
  //
  public static int TBL_PARAM129 = 693;
  public static int FLD_PARAM129_PARAPARTACCA = 0;
  public static int FLD_PARAM129_PARAPARTVINC = 1;
  public static int FLD_PARAM129_PARUTIQUOVIN = 2;
  public static int FLD_PARAM129_PARATIPOELAB = 3;
  public static int FLD_PARAM129_PARATIPOCERT = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI346 = 694;
  public static int FLD_PARAMETRI346_PARAMQUADRO = 0;
  public static int FLD_PARAMETRI346_PARAATTRQUAD = 1;
  public static int FLD_PARAMETRI346_PARAMCODICE = 2;
  public static int FLD_PARAMETRI346_PARAESCLTOTA = 3;
  public static int FLD_PARAMETRI346_PARATIPOGENE = 4;
  public static int FLD_PARAMETRI346_PARATIPOCERT = 5;

  // Definition of table: Parametri Formula Colonne
  //
  public static int TBL_PARAFORMCOL1 = 695;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL1 = 0;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL2 = 1;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL3 = 2;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL4 = 3;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL5 = 4;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL6 = 5;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL7 = 6;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL8 = 7;
  public static int FLD_PARAFORMCOL1_COLOFORMCOL9 = 8;
  public static int FLD_PARAFORMCOL1_COLOFORCOL10 = 9;
  public static int FLD_PARAFORMCOL1_COLOFORCOL11 = 10;
  public static int FLD_PARAFORMCOL1_COLOFORCOL12 = 11;
  public static int FLD_PARAFORMCOL1_COLOFORCOL13 = 12;
  public static int FLD_PARAFORMCOL1_COLOFORCOL14 = 13;
  public static int FLD_PARAFORMCOL1_COLOFORCOL15 = 14;

  // Definition of table: Certificato
  //
  public static int TBL_CERTIFICATO = 696;
  public static int FLD_CERTIFICATO_CERTPROGQUAD = 0;
  public static int FLD_CERTIFICATO_QUADRO = 1;
  public static int FLD_CERTIFICATO_RIF_QUADRO = 2;
  public static int FLD_CERTIFICATO_DESCRIZIONE_QUADRO = 3;
  public static int FLD_CERTIFICATO_CODICE = 4;
  public static int FLD_CERTIFICATO_NUM_COLONNE = 5;
  public static int FLD_CERTIFICATO_TIPO_RIGA = 6;
  public static int FLD_CERTIFICATO_DESCRIZIONE_1 = 7;
  public static int FLD_CERTIFICATO_DESCRIZIONE_2 = 8;
  public static int FLD_CERTIFICATO_VALORE_1 = 9;
  public static int FLD_CERTIFICATO_VALORE_2 = 10;
  public static int FLD_CERTIFICATO_VALORE_3 = 11;
  public static int FLD_CERTIFICATO_VALORE_4 = 12;
  public static int FLD_CERTIFICATO_VALORE_5 = 13;
  public static int FLD_CERTIFICATO_VALORE_6 = 14;
  public static int FLD_CERTIFICATO_VALORE_7 = 15;
  public static int FLD_CERTIFICATO_VALORE_8 = 16;
  public static int FLD_CERTIFICATO_VALORE_9 = 17;
  public static int FLD_CERTIFICATO_VALORE_10 = 18;
  public static int FLD_CERTIFICATO_VALORE_11 = 19;
  public static int FLD_CERTIFICATO_VALORE_12 = 20;
  public static int FLD_CERTIFICATO_VALORE_13 = 21;
  public static int FLD_CERTIFICATO_VALORE_14 = 22;
  public static int FLD_CERTIFICATO_VALORE_15 = 23;
  public static int FLD_CERTIFICATO_CERTIFISTATO = 24;
  public static int FLD_CERTIFICATO_VALORE_1_OLD = 25;
  public static int FLD_CERTIFICATO_VALORE_2_OLD = 26;
  public static int FLD_CERTIFICATO_VALORE_3_OLD = 27;
  public static int FLD_CERTIFICATO_VALORE_4_OLD = 28;
  public static int FLD_CERTIFICATO_VALORE_5_OLD = 29;
  public static int FLD_CERTIFICATO_VALORE_6_OLD = 30;
  public static int FLD_CERTIFICATO_VALORE_7_OLD = 31;
  public static int FLD_CERTIFICATO_VALORE_8_OLD = 32;
  public static int FLD_CERTIFICATO_VALORE_9_OLD = 33;
  public static int FLD_CERTIFICATO_VALORE_10_OLD = 34;
  public static int FLD_CERTIFICATO_VALORE_11_OLD = 35;
  public static int FLD_CERTIFICATO_VALORE_12_OLD = 36;
  public static int FLD_CERTIFICATO_VALORE_13_OLD = 37;
  public static int FLD_CERTIFICATO_VALORE_14_OLD = 38;
  public static int FLD_CERTIFICATO_VALORE_15_OLD = 39;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI592 = 697;
  public static int FLD_PARAMETRI592_PARATIPOCERT = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM183 = 698;
  public static int FLD_PARAM183_PARAPROGBDAP = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM164 = 699;
  public static int FLD_PARAM164_PARATIPOELAB = 0;
  public static int FLD_PARAM164_PARATIPOBDAP = 1;
  public static int FLD_PARAM164_PARAPROGBDAP = 2;
  public static int FLD_PARAM164_PARAMCFACE = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI582 = 700;
  public static int FLD_PARAMETRI582_PARAMSCHEMA = 0;
  public static int FLD_PARAMETRI582_PARAESCLTOTA = 1;
  public static int FLD_PARAMETRI582_PARATIPOBDAP = 2;
  public static int FLD_PARAMETRI582_PARAMDESCRIZ = 3;
  public static int FLD_PARAMETRI582_PARAESERPLUR = 4;
  public static int FLD_PARAMETRI582_PARAMLOOKUP = 5;

  // Definition of table: Parametri Formula Colonne
  //
  public static int TBL_PARAFORMCOLO = 701;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL1 = 0;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL2 = 1;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL3 = 2;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL4 = 3;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL5 = 4;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL6 = 5;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL7 = 6;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL8 = 7;
  public static int FLD_PARAFORMCOLO_COLOTIPOCOL9 = 8;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL10 = 9;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL11 = 10;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL12 = 11;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL13 = 12;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL14 = 13;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL15 = 14;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL16 = 15;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL17 = 16;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL18 = 17;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL19 = 18;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL20 = 19;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL21 = 20;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL22 = 21;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL23 = 22;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL24 = 23;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL25 = 24;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL26 = 25;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL27 = 26;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL28 = 27;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL29 = 28;
  public static int FLD_PARAFORMCOLO_COLOTIPCOL30 = 29;

  // Definition of table: Schemi BDAP
  //
  public static int TBL_SCHEMIBDAP = 702;
  public static int FLD_SCHEMIBDAP_ESERCIZIO = 0;
  public static int FLD_SCHEMIBDAP_SCHEMA = 1;
  public static int FLD_SCHEMIBDAP_DESCRIZIONE_QUADRO = 2;
  public static int FLD_SCHEMIBDAP_RIGA = 3;
  public static int FLD_SCHEMIBDAP_TIPO_RIGA = 4;
  public static int FLD_SCHEMIBDAP_DESCRIZIONE_1 = 5;
  public static int FLD_SCHEMIBDAP_DESCRIZIONE_2 = 6;
  public static int FLD_SCHEMIBDAP_VALORE_1 = 7;
  public static int FLD_SCHEMIBDAP_VALORE_2 = 8;
  public static int FLD_SCHEMIBDAP_VALORE_3 = 9;
  public static int FLD_SCHEMIBDAP_VALORE_4 = 10;
  public static int FLD_SCHEMIBDAP_VALORE_5 = 11;
  public static int FLD_SCHEMIBDAP_VALORE_6 = 12;
  public static int FLD_SCHEMIBDAP_VALORE_7 = 13;
  public static int FLD_SCHEMIBDAP_VALORE_8 = 14;
  public static int FLD_SCHEMIBDAP_VALORE_9 = 15;
  public static int FLD_SCHEMIBDAP_VALORE_10 = 16;
  public static int FLD_SCHEMIBDAP_VALORE_11 = 17;
  public static int FLD_SCHEMIBDAP_VALORE_12 = 18;
  public static int FLD_SCHEMIBDAP_VALORE_13 = 19;
  public static int FLD_SCHEMIBDAP_VALORE_14 = 20;
  public static int FLD_SCHEMIBDAP_VALORE_15 = 21;
  public static int FLD_SCHEMIBDAP_VALORE_16 = 22;
  public static int FLD_SCHEMIBDAP_VALORE_17 = 23;
  public static int FLD_SCHEMIBDAP_VALORE_18 = 24;
  public static int FLD_SCHEMIBDAP_VALORE_19 = 25;
  public static int FLD_SCHEMIBDAP_VALORE_20 = 26;
  public static int FLD_SCHEMIBDAP_VALORE_21 = 27;
  public static int FLD_SCHEMIBDAP_VALORE_22 = 28;
  public static int FLD_SCHEMIBDAP_VALORE_23 = 29;
  public static int FLD_SCHEMIBDAP_VALORE_24 = 30;
  public static int FLD_SCHEMIBDAP_VALORE_25 = 31;
  public static int FLD_SCHEMIBDAP_VALORE_26 = 32;
  public static int FLD_SCHEMIBDAP_VALORE_27 = 33;
  public static int FLD_SCHEMIBDAP_VALORE_28 = 34;
  public static int FLD_SCHEMIBDAP_VALORE_29 = 35;
  public static int FLD_SCHEMIBDAP_VALORE_30 = 36;
  public static int FLD_SCHEMIBDAP_CERTIFISTATO = 37;
  public static int FLD_SCHEMIBDAP_VALORE_1_OLD = 38;
  public static int FLD_SCHEMIBDAP_VALORE_2_OLD = 39;
  public static int FLD_SCHEMIBDAP_VALORE_3_OLD = 40;
  public static int FLD_SCHEMIBDAP_VALORE_4_OLD = 41;
  public static int FLD_SCHEMIBDAP_VALORE_5_OLD = 42;
  public static int FLD_SCHEMIBDAP_VALORE_6_OLD = 43;
  public static int FLD_SCHEMIBDAP_VALORE_7_OLD = 44;
  public static int FLD_SCHEMIBDAP_VALORE_8_OLD = 45;
  public static int FLD_SCHEMIBDAP_VALORE_9_OLD = 46;
  public static int FLD_SCHEMIBDAP_VALORE_10_OLD = 47;
  public static int FLD_SCHEMIBDAP_VALORE_11_OLD = 48;
  public static int FLD_SCHEMIBDAP_VALORE_12_OLD = 49;
  public static int FLD_SCHEMIBDAP_VALORE_13_OLD = 50;
  public static int FLD_SCHEMIBDAP_VALORE_14_OLD = 51;
  public static int FLD_SCHEMIBDAP_VALORE_15_OLD = 52;
  public static int FLD_SCHEMIBDAP_VALORE_16_OLD = 53;
  public static int FLD_SCHEMIBDAP_VALORE_17_OLD = 54;
  public static int FLD_SCHEMIBDAP_VALORE_18_OLD = 55;
  public static int FLD_SCHEMIBDAP_VALORE_19_OLD = 56;
  public static int FLD_SCHEMIBDAP_VALORE_20_OLD = 57;
  public static int FLD_SCHEMIBDAP_VALORE_21_OLD = 58;
  public static int FLD_SCHEMIBDAP_VALORE_22_OLD = 59;
  public static int FLD_SCHEMIBDAP_VALORE_23_OLD = 60;
  public static int FLD_SCHEMIBDAP_VALORE_24_OLD = 61;
  public static int FLD_SCHEMIBDAP_VALORE_25_OLD = 62;
  public static int FLD_SCHEMIBDAP_VALORE_26_OLD = 63;
  public static int FLD_SCHEMIBDAP_VALORE_27_OLD = 64;
  public static int FLD_SCHEMIBDAP_VALORE_28_OLD = 65;
  public static int FLD_SCHEMIBDAP_VALORE_29_OLD = 66;
  public static int FLD_SCHEMIBDAP_VALORE_30_OLD = 67;
  public static int FLD_SCHEMIBDAP_ESERCIZIO_PLUR = 68;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI20 = 703;
  public static int FLD_PARAMETRI20_ROWNAMECAPIT = 0;
  public static int FLD_PARAMETRI20_ROWNAMEARTIC = 1;
  public static int FLD_PARAMETRI20_ROWNAMIMPRES = 2;
  public static int FLD_PARAMETRI20_ROWNAMANNIMP = 3;
  public static int FLD_PARAMETRI20_ROWNAMNUMIMP = 4;
  public static int FLD_PARAMETRI20_RONANUIMDAES = 5;
  public static int FLD_PARAMETRI20_RONANUDAPRDE = 6;
  public static int FLD_PARAMETRI20_ROWNAMNUDAEL = 7;
  public static int FLD_PARAMETRI20_ROWNAMCAPOLD = 8;
  public static int FLD_PARAMETRI20_ROWNAMARTOLD = 9;
  public static int FLD_PARAMETRI20_ROWNAMUNIPRO = 10;
  public static int FLD_PARAMETRI20_ROWNAMNUMPRO = 11;
  public static int FLD_PARAMETRI20_ROWNAMANNPRO = 12;
  public static int FLD_PARAMETRI20_RONAANPEBIFI = 13;
  public static int FLD_PARAMETRI20_ROWNAMMODINF = 14;
  public static int FLD_PARAMETRI20_ROWNAMEPROUO = 15;
  public static int FLD_PARAMETRI20_ROWNAMEREISC = 16;
  public static int FLD_PARAMETRI20_RONAIMVAIMPR = 17;
  public static int FLD_PARAMETRI20_ROWNAMPRVARE = 18;
  public static int FLD_PARAMETRI20_ROWNAMCOBEOL = 19;
  public static int FLD_PARAMETRI20_ROWNAMMOREST = 20;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP5 = 704;
  public static int FLD_VALORICAP5_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP5_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP5_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP5_ROWNAMCODTER = 3;
  public static int FLD_VALORICAP5_ROWNAMLIV4CA = 4;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ1 = 705;
  public static int FLD_PERSONALIZZ1_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ1_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ1_ROWNAMVISZON = 2;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVAR5 = 706;
  public static int FLD_PARAMETRVAR5_ROWNAMIMPATT = 0;
  public static int FLD_PARAMETRVAR5_ROWNAMLASYEA = 1;
  public static int FLD_PARAMETRVAR5_ROWNAMEDELET = 2;
  public static int FLD_PARAMETRVAR5_ROWNAMEINDIC = 3;
  public static int FLD_PARAMETRVAR5_ROWNAMCOPRPR = 4;
  public static int FLD_PARAMETRVAR5_RONACHSEINOP = 5;
  public static int FLD_PARAMETRVAR5_ROWNAMRPPATT = 6;
  public static int FLD_PARAMETRVAR5_ROWNAMAGGCAP = 7;

  // Definition of table: IMP Rollback
  //
  public static int TBL_IMPROLLBACK = 707;
  public static int FLD_IMPROLLBACK_CAPITOLO = 0;
  public static int FLD_IMPROLLBACK_ARTICOLO = 1;
  public static int FLD_IMPROLLBACK_ANNO_IMP = 2;
  public static int FLD_IMPROLLBACK_NUMERO_IMP = 3;
  public static int FLD_IMPROLLBACK_ANNO_DEL = 4;
  public static int FLD_IMPROLLBACK_NUMERO_DEL = 5;
  public static int FLD_IMPROLLBACK_SEDE_DEL = 6;
  public static int FLD_IMPROLLBACK_DATA_REG = 7;
  public static int FLD_IMPROLLBACK_IMPORTO = 8;
  public static int FLD_IMPROLLBACK_DESCRIZIONE = 9;
  public static int FLD_IMPROLLBACK_CAUSALE = 10;
  public static int FLD_IMPROLLBACK_IMPEGNO_OBBLIG = 11;
  public static int FLD_IMPROLLBACK_ESERCIZIO_SCADENZA = 12;
  public static int FLD_IMPROLLBACK_ANNO_INTROD = 13;
  public static int FLD_IMPROLLBACK_BENEFICIARIO = 14;
  public static int FLD_IMPROLLBACK_SETTORE = 15;
  public static int FLD_IMPROLLBACK_SERVIZIO = 16;
  public static int FLD_IMPROLLBACK_TIPOLOGIA_SPESA = 17;
  public static int FLD_IMPROLLBACK_ANNO_PROPOSTA = 18;
  public static int FLD_IMPROLLBACK_UNITA_PROPONENTE = 19;
  public static int FLD_IMPROLLBACK_NUMERO_PROPOSTA = 20;
  public static int FLD_IMPROLLBACK_TIPO = 21;
  public static int FLD_IMPROLLBACK_SERVIZIO_CC = 22;
  public static int FLD_IMPROLLBACK_PRENOTAZIONE = 23;
  public static int FLD_IMPROLLBACK_VOCE_ECON = 24;
  public static int FLD_IMPROLLBACK_TIPO_VINCOLO = 25;
  public static int FLD_IMPROLLBACK_TIPO_AVANZO = 26;
  public static int FLD_IMPROLLBACK_INVESTIMENTO = 27;
  public static int FLD_IMPROLLBACK_CONS_SVILUPPO = 28;
  public static int FLD_IMPROLLBACK_REGOLA_CONT = 29;
  public static int FLD_IMPROLLBACK_CONTRIB_STR = 30;
  public static int FLD_IMPROLLBACK_TITOLO_GIURIDICO = 31;
  public static int FLD_IMPROLLBACK_S = 32;
  public static int FLD_IMPROLLBACK_D_DATA_REG = 33;
  public static int FLD_IMPROLLBACK_ANNO_PLUR = 34;
  public static int FLD_IMPROLLBACK_NUMERO_PLUR = 35;
  public static int FLD_IMPROLLBACK_CENTRO = 36;
  public static int FLD_IMPROLLBACK_FATTORE = 37;
  public static int FLD_IMPROLLBACK_COMPETENZA_DAL = 38;
  public static int FLD_IMPROLLBACK_COMPETENZA_AL = 39;
  public static int FLD_IMPROLLBACK_NOTE = 40;
  public static int FLD_IMPROLLBACK_RILEVANTE_ECO = 41;
  public static int FLD_IMPROLLBACK_COD_IMP_ECO = 42;
  public static int FLD_IMPROLLBACK_PROGETTO_ID = 43;
  public static int FLD_IMPROLLBACK_OPERA = 44;
  public static int FLD_IMPROLLBACK_COMUNE_ZONA = 45;
  public static int FLD_IMPROLLBACK_PROVINCIA_ZONA = 46;
  public static int FLD_IMPROLLBACK_OBIETTIVO = 47;
  public static int FLD_IMPROLLBACK_CODICE_GESTIONALE = 48;
  public static int FLD_IMPROLLBACK_CUP = 49;
  public static int FLD_IMPROLLBACK_RESPONSABILE_RES = 50;
  public static int FLD_IMPROLLBACK_PROGR_UNITA_ORGANIZZATIVA = 51;
  public static int FLD_IMPROLLBACK_UTENTE_INSERIMENTO = 52;
  public static int FLD_IMPROLLBACK_DATA_INSERIMENTO = 53;
  public static int FLD_IMPROLLBACK_UTENTE_ULTIMO_AGG = 54;
  public static int FLD_IMPROLLBACK_DATA_ULTIMO_AGG = 55;
  public static int FLD_IMPROLLBACK_PROGR_UNITA_ORGANIZZATIVA_INS = 56;
  public static int FLD_IMPROLLBACK_SCHEDA_OBIETTIVO_ID = 57;
  public static int FLD_IMPROLLBACK_IMPROLVOCTEC = 58;
  public static int FLD_IMPROLLBACK_CIG = 59;
  public static int FLD_IMPROLLBACK_COD_MONITORAGGIO = 60;
  public static int FLD_IMPROLLBACK_CODICE_COFOG = 61;
  public static int FLD_IMPROLLBACK_CODICE_EUROPEO = 62;
  public static int FLD_IMPROLLBACK_COD_LIVELLO_5 = 63;
  public static int FLD_IMPROLLBACK_IMP_DA_REISCR_STN = 64;
  public static int FLD_IMPROLLBACK_ANNO_IMP_PROVENIENZA = 65;
  public static int FLD_IMPROLLBACK_NUMERO_IMP_PROVENIENZA = 66;
  public static int FLD_IMPROLLBACK_CRONOPROGRAMMA_ID = 67;
  public static int FLD_IMPROLLBACK_DATA_REG_ECONOMICA = 68;
  public static int FLD_IMPROLLBACK_DATA_SCADENZA = 69;

  // Definition of table: PLURIENNALI Rollback
  //
  public static int TBL_PLURIEROLLB1 = 708;
  public static int FLD_PLURIEROLLB1_CAPITOLO = 0;
  public static int FLD_PLURIEROLLB1_ARTICOLO = 1;
  public static int FLD_PLURIEROLLB1_ANNO_IMP = 2;
  public static int FLD_PLURIEROLLB1_NUMERO_IMP = 3;
  public static int FLD_PLURIEROLLB1_ANNO_DEL = 4;
  public static int FLD_PLURIEROLLB1_NUMERO_DEL = 5;
  public static int FLD_PLURIEROLLB1_SEDE_DEL = 6;
  public static int FLD_PLURIEROLLB1_DATA_REG = 7;
  public static int FLD_PLURIEROLLB1_IMPORTO = 8;
  public static int FLD_PLURIEROLLB1_DESCRIZIONE = 9;
  public static int FLD_PLURIEROLLB1_CAUSALE = 10;
  public static int FLD_PLURIEROLLB1_IMPEGNO_OBBLIG = 11;
  public static int FLD_PLURIEROLLB1_ESERCIZIO_SCADENZA = 12;
  public static int FLD_PLURIEROLLB1_ANNO_INTROD = 13;
  public static int FLD_PLURIEROLLB1_BENEFICIARIO = 14;
  public static int FLD_PLURIEROLLB1_SETTORE = 15;
  public static int FLD_PLURIEROLLB1_SERVIZIO = 16;
  public static int FLD_PLURIEROLLB1_TIPOLOGIA_SPESA = 17;
  public static int FLD_PLURIEROLLB1_ANNO_PROPOSTA = 18;
  public static int FLD_PLURIEROLLB1_UNITA_PROPONENTE = 19;
  public static int FLD_PLURIEROLLB1_NUMERO_PROPOSTA = 20;
  public static int FLD_PLURIEROLLB1_TIPO = 21;
  public static int FLD_PLURIEROLLB1_SERVIZIO_CC = 22;
  public static int FLD_PLURIEROLLB1_PRENOTAZIONE = 23;
  public static int FLD_PLURIEROLLB1_VOCE_ECON = 24;
  public static int FLD_PLURIEROLLB1_TIPO_VINCOLO = 25;
  public static int FLD_PLURIEROLLB1_INVESTIMENTO = 26;
  public static int FLD_PLURIEROLLB1_CONS_SVILUPPO = 27;
  public static int FLD_PLURIEROLLB1_REGOLA_CONT = 28;
  public static int FLD_PLURIEROLLB1_CONTRIB_STR = 29;
  public static int FLD_PLURIEROLLB1_TITOLO_GIURIDICO = 30;
  public static int FLD_PLURIEROLLB1_S = 31;
  public static int FLD_PLURIEROLLB1_D_DATA_REG = 32;
  public static int FLD_PLURIEROLLB1_ANNO_PLUR = 33;
  public static int FLD_PLURIEROLLB1_NUMERO_PLUR = 34;
  public static int FLD_PLURIEROLLB1_CENTRO = 35;
  public static int FLD_PLURIEROLLB1_FATTORE = 36;
  public static int FLD_PLURIEROLLB1_COMPETENZA_DAL = 37;
  public static int FLD_PLURIEROLLB1_COMPETENZA_AL = 38;
  public static int FLD_PLURIEROLLB1_NOTE = 39;
  public static int FLD_PLURIEROLLB1_RILEVANTE_ECO = 40;
  public static int FLD_PLURIEROLLB1_COD_IMP_ECO = 41;
  public static int FLD_PLURIEROLLB1_PROGETTO_ID = 42;
  public static int FLD_PLURIEROLLB1_OPERA = 43;
  public static int FLD_PLURIEROLLB1_COMUNE_ZONA = 44;
  public static int FLD_PLURIEROLLB1_PROVINCIA_ZONA = 45;
  public static int FLD_PLURIEROLLB1_OBIETTIVO = 46;
  public static int FLD_PLURIEROLLB1_CODICE_GESTIONALE = 47;
  public static int FLD_PLURIEROLLB1_CUP = 48;
  public static int FLD_PLURIEROLLB1_RESPONSABILE_RES = 49;
  public static int FLD_PLURIEROLLB1_PROGR_UNITA_ORGANIZZATIVA = 50;
  public static int FLD_PLURIEROLLB1_UTENTE_INSERIMENTO = 51;
  public static int FLD_PLURIEROLLB1_DATA_INSERIMENTO = 52;
  public static int FLD_PLURIEROLLB1_UTENTE_ULTIMO_AGG = 53;
  public static int FLD_PLURIEROLLB1_DATA_ULTIMO_AGG = 54;
  public static int FLD_PLURIEROLLB1_PROGR_UNITA_ORGANIZZATIVA_INS = 55;
  public static int FLD_PLURIEROLLB1_SCHEDA_OBIETTIVO_ID = 56;

  // Definition of table: Opera
  //
  public static int TBL_OPERA = 709;
  public static int FLD_OPERA_ROWNAMEOPERA = 0;
  public static int FLD_OPERA_ROWNAMOPEOLD = 1;
  public static int FLD_OPERA_ROWNAMVOCTEC = 2;
  public static int FLD_OPERA_ROWNAMVOTEOL = 3;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAMEN8 = 710;
  public static int FLD_FINANZIAMEN8_ROWNAMEID = 0;
  public static int FLD_FINANZIAMEN8_ROWNAMECODIC = 1;
  public static int FLD_FINANZIAMEN8_ROWNAMIMPOLD = 2;
  public static int FLD_FINANZIAMEN8_ROWNAMEIMPOR = 3;
  public static int FLD_FINANZIAMEN8_ROWNAMESTATO = 4;

  // Definition of table: Variazioni
  //
  public static int TBL_VARIAZIONI5 = 711;
  public static int FLD_VARIAZIONI5_ROWNAMCONOLD = 0;
  public static int FLD_VARIAZIONI5_ROWNAMPRIDOL = 1;
  public static int FLD_VARIAZIONI5_ROWNAMANNIMP = 2;
  public static int FLD_VARIAZIONI5_ROWNAMNUMIMP = 3;
  public static int FLD_VARIAZIONI5_ROWNAMEIMPEG = 4;
  public static int FLD_VARIAZIONI5_ROWNAMIMPCON = 5;
  public static int FLD_VARIAZIONI5_ROWNAMIMPPRO = 6;
  public static int FLD_VARIAZIONI5_ROWNAMIMPOBI = 7;
  public static int FLD_VARIAZIONI5_ROWNAMIMPOPE = 8;
  public static int FLD_VARIAZIONI5_ROWNAMEPROGR = 9;
  public static int FLD_VARIAZIONI5_ROWNAMCONPRO = 10;
  public static int FLD_VARIAZIONI5_ROWNAMUNIORG = 11;
  public static int FLD_VARIAZIONI5_RONANUVADAPR = 12;
  public static int FLD_VARIAZIONI5_RONANUVADAEL = 13;
  public static int FLD_VARIAZIONI5_ROWNAMUNIPRO = 14;
  public static int FLD_VARIAZIONI5_ROWNAMNUMPRO = 15;
  public static int FLD_VARIAZIONI5_ROWNAMANNPRO = 16;

  // Definition of table: Estremi Impegni
  //
  public static int TBL_ESTREMIMPEG1 = 712;
  public static int FLD_ESTREMIMPEG1_ROWNAMANNIMP = 0;
  public static int FLD_ESTREMIMPEG1_ROWNAMNUMIMP = 1;
  public static int FLD_ESTREMIMPEG1_ROWNAMUNIOR1 = 2;
  public static int FLD_ESTREMIMPEG1_ROWNAMEDESCR = 3;
  public static int FLD_ESTREMIMPEG1_ROWNAMECAPIT = 4;
  public static int FLD_ESTREMIMPEG1_ROWNAMEARTIC = 5;
  public static int FLD_ESTREMIMPEG1_ROWNAMEESER1 = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI683 = 713;
  public static int FLD_PARAMETRI683_ROWNAMTIPVIN = 0;
  public static int FLD_PARAMETRI683_ROWNAMECOMPE = 1;
  public static int FLD_PARAMETRI683_ROWNAMDATREG = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI233 = 714;
  public static int FLD_PARAMETRI233_ROWNAMTIPVIN = 0;
  public static int FLD_PARAMETRI233_ROWNAMECOMPE = 1;
  public static int FLD_PARAMETRI233_ROWNAMDATREG = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI19 = 715;
  public static int FLD_PARAMETRI19_ROWNAMEVINCO = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM36 = 716;
  public static int FLD_PARAM36_ROWNAMEANNO = 0;
  public static int FLD_PARAM36_ROWNAMENUMER = 1;
  public static int FLD_PARAM36_ROWNAMEIMPEG = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI340 = 717;
  public static int FLD_PARAMETRI340_ROWNAMUNIORG = 0;
  public static int FLD_PARAMETRI340_ROWNAMIMPRES = 1;
  public static int FLD_PARAMETRI340_ROWNAMECAPIT = 2;
  public static int FLD_PARAMETRI340_ROWNAMEARTIC = 3;
  public static int FLD_PARAMETRI340_ROWNAMANNIMP = 4;
  public static int FLD_PARAMETRI340_ROWNAMNUMIMP = 5;
  public static int FLD_PARAMETRI340_ROWNAMANSUIM = 6;
  public static int FLD_PARAMETRI340_ROWNAMNUSUIM = 7;
  public static int FLD_PARAMETRI340_RONAANIMPEIN = 8;
  public static int FLD_PARAMETRI340_RONANUIMPEIN = 9;
  public static int FLD_PARAMETRI340_RONANUSUDAES = 10;
  public static int FLD_PARAMETRI340_RONANUDAPRDE = 11;
  public static int FLD_PARAMETRI340_ROWNAMNUDAEL = 12;
  public static int FLD_PARAMETRI340_ROWNAMCONFIN = 13;
  public static int FLD_PARAMETRI340_ROWNAMUNIPRO = 14;
  public static int FLD_PARAMETRI340_ROWNAMNUMPRO = 15;
  public static int FLD_PARAMETRI340_ROWNAMANNPRO = 16;
  public static int FLD_PARAMETRI340_ROWNAMMODINF = 17;
  public static int FLD_PARAMETRI340_ROWNAMEREISC = 18;
  public static int FLD_PARAMETRI340_RONAIMVASUPR = 19;
  public static int FLD_PARAMETRI340_ROWNAMPRVARE = 20;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP2 = 718;
  public static int FLD_VALORICAP2_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP2_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP2_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP2_ROWNAMCODTER = 3;
  public static int FLD_VALORICAP2_ROWNAMLIV4CA = 4;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ8 = 719;
  public static int FLD_PERSONALIZZ8_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ8_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ8_ROWNAMVISZON = 2;
  public static int FLD_PERSONALIZZ8_ROWNAMIMPOLD = 3;
  public static int FLD_PERSONALIZZ8_ROWNAMPRIDOL = 4;
  public static int FLD_PERSONALIZZ8_ROWNAMCONOLD = 5;
  public static int FLD_PERSONALIZZ8_ROWNAMOBIOLD = 6;

  // Definition of table: Impegni
  //
  public static int TBL_IMPEGNI1 = 720;
  public static int FLD_IMPEGNI1_ROWNAMRIECOL = 0;
  public static int FLD_IMPEGNI1_ROWNAMANIMOL = 1;
  public static int FLD_IMPEGNI1_ROWNAMNUIMOL = 2;

  // Definition of table: Opera
  //
  public static int TBL_OPERA5 = 721;
  public static int FLD_OPERA5_ROWNAMEOPERA = 0;
  public static int FLD_OPERA5_ROWNAMVOCTEC = 1;
  public static int FLD_OPERA5_ROWNAMNUOCAM = 2;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAME18 = 722;
  public static int FLD_FINANZIAME18_ROWNAMEID = 0;
  public static int FLD_FINANZIAME18_ROWNAMECODIC = 1;
  public static int FLD_FINANZIAME18_ROWNAMIMPOLD = 2;
  public static int FLD_FINANZIAME18_ROWNAMEIMPOR = 3;
  public static int FLD_FINANZIAME18_ROWNAMESTATO = 4;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVAR2 = 723;
  public static int FLD_PARAMETRVAR2_ROWNAMIMPTOT = 0;
  public static int FLD_PARAMETRVAR2_ROWNAMESALVA = 1;

  // Definition of table: SUBIMP Rollback
  //
  public static int TBL_SUBIMPROLLBA = 724;
  public static int FLD_SUBIMPROLLBA_CAPITOLO = 0;
  public static int FLD_SUBIMPROLLBA_ARTICOLO = 1;
  public static int FLD_SUBIMPROLLBA_ANNO_IMP = 2;
  public static int FLD_SUBIMPROLLBA_NUMERO_IMP = 3;
  public static int FLD_SUBIMPROLLBA_ANNO_SUBIMP = 4;
  public static int FLD_SUBIMPROLLBA_NUMERO_SUBIMP = 5;
  public static int FLD_SUBIMPROLLBA_ANNO_DEL = 6;
  public static int FLD_SUBIMPROLLBA_NUMERO_DEL = 7;
  public static int FLD_SUBIMPROLLBA_SEDE_DEL = 8;
  public static int FLD_SUBIMPROLLBA_DATA_REG = 9;
  public static int FLD_SUBIMPROLLBA_IMPORTO = 10;
  public static int FLD_SUBIMPROLLBA_DESCRIZIONE = 11;
  public static int FLD_SUBIMPROLLBA_CAUSALE = 12;
  public static int FLD_SUBIMPROLLBA_SUBIMP_OBBLIG = 13;
  public static int FLD_SUBIMPROLLBA_BENEFICIARIO = 14;
  public static int FLD_SUBIMPROLLBA_ANNO_PROPOSTA = 15;
  public static int FLD_SUBIMPROLLBA_UNITA_PROPONENTE = 16;
  public static int FLD_SUBIMPROLLBA_NUMERO_PROPOSTA = 17;
  public static int FLD_SUBIMPROLLBA_TITOLO_GIURIDICO = 18;
  public static int FLD_SUBIMPROLLBA_D_DATA_REG = 19;
  public static int FLD_SUBIMPROLLBA_CENTRO = 20;
  public static int FLD_SUBIMPROLLBA_FATTORE = 21;
  public static int FLD_SUBIMPROLLBA_COMPETENZA_DAL = 22;
  public static int FLD_SUBIMPROLLBA_COMPETENZA_AL = 23;
  public static int FLD_SUBIMPROLLBA_NOTE = 24;
  public static int FLD_SUBIMPROLLBA_RILEVANTE_ECO = 25;
  public static int FLD_SUBIMPROLLBA_COD_IMP_ECO = 26;
  public static int FLD_SUBIMPROLLBA_COMUNE_ZONA = 27;
  public static int FLD_SUBIMPROLLBA_PROVINCIA_ZONA = 28;
  public static int FLD_SUBIMPROLLBA_CODICE_GESTIONALE = 29;
  public static int FLD_SUBIMPROLLBA_RESPONSABILE_RES = 30;
  public static int FLD_SUBIMPROLLBA_CUP = 31;
  public static int FLD_SUBIMPROLLBA_CIG = 32;
  public static int FLD_SUBIMPROLLBA_CODICE_COFOG = 33;
  public static int FLD_SUBIMPROLLBA_CODICE_EUROPEO = 34;
  public static int FLD_SUBIMPROLLBA_COD_LIVELLO_5 = 35;
  public static int FLD_SUBIMPROLLBA_ANNO_SUBIMP_PROVENIENZA = 36;
  public static int FLD_SUBIMPROLLBA_NUMERO_SUBIMP_PROVENIENZA = 37;
  public static int FLD_SUBIMPROLLBA_DATA_REG_ECONOMICA = 38;
  public static int FLD_SUBIMPROLLBA_UTENTE_INSERIMENTO = 39;
  public static int FLD_SUBIMPROLLBA_DATA_INSERIMENTO = 40;
  public static int FLD_SUBIMPROLLBA_UTENTE_ULTIMO_AGG = 41;
  public static int FLD_SUBIMPROLLBA_DATA_ULTIMO_AGG = 42;
  public static int FLD_SUBIMPROLLBA_VOCE_TECNICA_OPERA = 43;

  // Definition of table: Variazioni
  //
  public static int TBL_VARIAZIONI1 = 725;
  public static int FLD_VARIAZIONI1_ROWNAMPROVAR = 0;
  public static int FLD_VARIAZIONI1_ROWNAMANNIMP = 1;
  public static int FLD_VARIAZIONI1_ROWNAMNUMIMP = 2;
  public static int FLD_VARIAZIONI1_ROWNAMANSUIM = 3;
  public static int FLD_VARIAZIONI1_ROWNAMNUSUIM = 4;
  public static int FLD_VARIAZIONI1_ROWNAMDESUIM = 5;
  public static int FLD_VARIAZIONI1_ROWNAMECAPIT = 6;
  public static int FLD_VARIAZIONI1_ROWNAMEARTIC = 7;
  public static int FLD_VARIAZIONI1_ROWNAMEIMPEG = 8;
  public static int FLD_VARIAZIONI1_ROWNAMINFUPD = 9;
  public static int FLD_VARIAZIONI1_ROWNAMEPROGR = 10;
  public static int FLD_VARIAZIONI1_ROWNAMCONPRO = 11;
  public static int FLD_VARIAZIONI1_RONANUVADAPR = 12;
  public static int FLD_VARIAZIONI1_RONANUVADAEL = 13;
  public static int FLD_VARIAZIONI1_ROWNAMUNIPRO = 14;
  public static int FLD_VARIAZIONI1_ROWNAMNUMPRO = 15;
  public static int FLD_VARIAZIONI1_ROWNAMANNPRO = 16;
  public static int FLD_VARIAZIONI1_ROWNAMEPROUO = 17;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI81 = 726;
  public static int FLD_PARAMETRI81_ROWNAMANNSUB = 0;
  public static int FLD_PARAMETRI81_ROWNAMNUMSUB = 1;
  public static int FLD_PARAMETRI81_ROWNAMANNIMP = 2;
  public static int FLD_PARAMETRI81_ROWNAMNUMIMP = 3;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAME13 = 727;
  public static int FLD_FINANZIAME13_ANNO_SUBIMP = 0;
  public static int FLD_FINANZIAME13_NUMERO_SUBIMP = 1;
  public static int FLD_FINANZIAME13_FINANZIAMENTO = 2;
  public static int FLD_FINANZIAME13_ANNO_IMP = 3;
  public static int FLD_FINANZIAME13_NUMERO_IMP = 4;
  public static int FLD_FINANZIAME13_CAPITOLO = 5;
  public static int FLD_FINANZIAME13_ARTICOLO = 6;
  public static int FLD_FINANZIAME13_IMPORTO = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI62 = 728;
  public static int FLD_PARAMETRI62_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI62_ROWNAMUNIORG = 1;
  public static int FLD_PARAMETRI62_ROWNAMIMPRES = 2;
  public static int FLD_PARAMETRI62_ROWNAMANNIMP = 3;
  public static int FLD_PARAMETRI62_ROWNAMNUMIMP = 4;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIARI7 = 729;
  public static int FLD_BENEFICIARI7_ROWNAMRAGSOC = 0;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP3 = 730;
  public static int FLD_VALORICAP3_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP3_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP3_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP3_ROWNAMCODTER = 3;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ3 = 731;
  public static int FLD_PERSONALIZZ3_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ3_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ3_ROWNAMVISZON = 2;
  public static int FLD_PERSONALIZZ3_ROWNAMIMPOLD = 3;
  public static int FLD_PERSONALIZZ3_ROWNAMPRIDOL = 4;
  public static int FLD_PERSONALIZZ3_ROWNAMCONOLD = 5;
  public static int FLD_PERSONALIZZ3_ROWNAMOBIOLD = 6;

  // Definition of table: Impegni
  //
  public static int TBL_IMPEGNI5 = 732;
  public static int FLD_IMPEGNI5_ROWNAMIMPOLD = 0;
  public static int FLD_IMPEGNI5_ROWNAMCONOLD = 1;
  public static int FLD_IMPEGNI5_ROWNAMPRIDOL = 2;
  public static int FLD_IMPEGNI5_ROWNAMOBIOLD = 3;
  public static int FLD_IMPEGNI5_ROWNAMPROUNI = 4;
  public static int FLD_IMPEGNI5_ROWNAMRIECOL = 5;

  // Definition of table: Conssviluppo
  //
  public static int TBL_CONSSVILUPP5 = 733;
  public static int FLD_CONSSVILUPP5_ROWNAMCONSVI = 0;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVAR3 = 734;
  public static int FLD_PARAMETRVAR3_ROWNAMIMPATT = 0;
  public static int FLD_PARAMETRVAR3_ROWNAMIMPVAR = 1;
  public static int FLD_PARAMETRVAR3_ROWNAMECONTI = 2;
  public static int FLD_PARAMETRVAR3_ROWNAMLASYEA = 3;
  public static int FLD_PARAMETRVAR3_ROWNAMEDELET = 4;
  public static int FLD_PARAMETRVAR3_ROWNAMEESERC = 5;
  public static int FLD_PARAMETRVAR3_ROWNAMEINDIC = 6;

  // Definition of table: Variazioni
  //
  public static int TBL_VARIAZIONI = 735;
  public static int FLD_VARIAZIONI_ROWNAMANNIMP = 0;
  public static int FLD_VARIAZIONI_ROWNAMNUMIMP = 1;
  public static int FLD_VARIAZIONI_ROWNAMEPROGR = 2;
  public static int FLD_VARIAZIONI_ROWNAMDESIMP = 3;

  // Definition of table: Opera
  //
  public static int TBL_OPERA6 = 736;
  public static int FLD_OPERA6_ROWNAMEOPERA = 0;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAMEN7 = 737;
  public static int FLD_FINANZIAMEN7_ROWNAMIMPOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI69 = 738;
  public static int FLD_PARAMETRI69_ROWNAMANNIMP = 0;
  public static int FLD_PARAMETRI69_ROWNAMNUMIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI70 = 739;
  public static int FLD_PARAMETRI70_ROWNAMANNIMP = 0;
  public static int FLD_PARAMETRI70_ROWNAMNUMIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI71 = 740;
  public static int FLD_PARAMETRI71_ROWNAMANNIMP = 0;
  public static int FLD_PARAMETRI71_ROWNAMNUMIMP = 1;
  public static int FLD_PARAMETRI71_ROWNAMANSUIM = 2;
  public static int FLD_PARAMETRI71_ROWNAMNUSUIM = 3;
  public static int FLD_PARAMETRI71_ROWNAMIMSUIM = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI72 = 741;
  public static int FLD_PARAMETRI72_ROWNAMANNIMP = 0;
  public static int FLD_PARAMETRI72_ROWNAMNUMIMP = 1;
  public static int FLD_PARAMETRI72_ROWNAMANSUIM = 2;
  public static int FLD_PARAMETRI72_ROWNAMNUSUIM = 3;
  public static int FLD_PARAMETRI72_ROWNAMIMSUIM = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI73 = 742;
  public static int FLD_PARAMETRI73_ROWNAMANIMSU = 0;
  public static int FLD_PARAMETRI73_ROWNAMNUIMSU = 1;
  public static int FLD_PARAMETRI73_ROWNAMIMSUIM = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI74 = 743;
  public static int FLD_PARAMETRI74_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI74_ROWNAMUNIORG = 1;
  public static int FLD_PARAMETRI74_ROWNAMIMPRES = 2;
  public static int FLD_PARAMETRI74_ROWNAMANNIMP = 3;
  public static int FLD_PARAMETRI74_ROWNAMNUMIMP = 4;
  public static int FLD_PARAMETRI74_ROWNAMANSUIM = 5;
  public static int FLD_PARAMETRI74_ROWNAMNUSUIM = 6;
  public static int FLD_PARAMETRI74_RONAANIMPEIN = 7;
  public static int FLD_PARAMETRI74_RONANUIMPEIN = 8;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIAR49 = 744;
  public static int FLD_BENEFICIAR49_ROWNAMRAGSOC = 0;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP4 = 745;
  public static int FLD_VALORICAP4_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP4_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP4_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP4_ROWNAMCODTER = 3;
  public static int FLD_VALORICAP4_ROWNAMLIV4CA = 4;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ4 = 746;
  public static int FLD_PERSONALIZZ4_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ4_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ4_ROWNAMVISZON = 2;
  public static int FLD_PERSONALIZZ4_ROWNAMIMPOLD = 3;
  public static int FLD_PERSONALIZZ4_ROWNAMPRIDOL = 4;
  public static int FLD_PERSONALIZZ4_ROWNAMCONOLD = 5;
  public static int FLD_PERSONALIZZ4_ROWNAMOBIOLD = 6;

  // Definition of table: Impegni
  //
  public static int TBL_IMPEGNI = 747;
  public static int FLD_IMPEGNI_ROWNAMIMPOLD = 0;
  public static int FLD_IMPEGNI_ROWNAMCONOLD = 1;
  public static int FLD_IMPEGNI_ROWNAMPRIDOL = 2;
  public static int FLD_IMPEGNI_ROWNAMOBIOLD = 3;
  public static int FLD_IMPEGNI_ROWNAMPROUNI = 4;
  public static int FLD_IMPEGNI_ROWNAMRIECOL = 5;

  // Definition of table: Conssviluppo
  //
  public static int TBL_CONSSVILUPPO = 748;
  public static int FLD_CONSSVILUPPO_ROWNAMCONSVI = 0;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVAR4 = 749;
  public static int FLD_PARAMETRVAR4_ROWNAMIMPNEW = 0;
  public static int FLD_PARAMETRVAR4_ROWNAMIMPVAR = 1;
  public static int FLD_PARAMETRVAR4_ROWNAMECONTI = 2;
  public static int FLD_PARAMETRVAR4_ROWNAMLASYEA = 3;
  public static int FLD_PARAMETRVAR4_ROWNAMEDELET = 4;
  public static int FLD_PARAMETRVAR4_ROWNAMEESERC = 5;
  public static int FLD_PARAMETRVAR4_ROWNAMEINDIC = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI83 = 750;
  public static int FLD_PARAMETRI83_ROWNAMANSUIM = 0;
  public static int FLD_PARAMETRI83_ROWNAMNUSUIM = 1;

  // Definition of table: Opera
  //
  public static int TBL_OPERA8 = 751;
  public static int FLD_OPERA8_ROWNAMEOPERA = 0;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE19 = 752;
  public static int FLD_NEWTABLE19_ROWNAMNEWFIE = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS33 = 753;
  public static int FLD_PARS33_NOMEOGGEDELI = 0;
  public static int FLD_PARS33_NOMOGGNUMDEL = 1;
  public static int FLD_PARS33_NOMOGGANNDEL = 2;
  public static int FLD_PARS33_NOMOGGANNESI = 3;
  public static int FLD_PARS33_NOMEOGGPROUO = 4;
  public static int FLD_PARS33_NOMEOGGEVBVI = 5;

  // Definition of table: Variazioni Impegni
  //
  public static int TBL_VARIAZIMPEG5 = 754;
  public static int FLD_VARIAZIMPEG5_CODICE_STRUTTURA = 0;
  public static int FLD_VARIAZIMPEG5_NOMOGGCOPICO = 1;
  public static int FLD_VARIAZIMPEG5_CAPITOLO = 2;
  public static int FLD_VARIAZIMPEG5_ARTICOLO = 3;
  public static int FLD_VARIAZIMPEG5_NUMERO_IMP = 4;
  public static int FLD_VARIAZIMPEG5_ANNO_IMP = 5;
  public static int FLD_VARIAZIMPEG5_DESCRIZIONE = 6;
  public static int FLD_VARIAZIMPEG5_IMPORTO = 7;
  public static int FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA = 8;
  public static int FLD_VARIAZIMPEG5_PROGRESSIVO = 9;
  public static int FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA = 10;
  public static int FLD_VARIAZIMPEG5_NOMOGGTIPVAR = 11;
  public static int FLD_VARIAZIMPEG5_NOMOGGANNENT = 12;
  public static int FLD_VARIAZIMPEG5_SEDE_DEL = 13;
  public static int FLD_VARIAZIMPEG5_NUMERO_DEL = 14;
  public static int FLD_VARIAZIMPEG5_ANNO_DEL = 15;

  // Definition of table: Par
  //
  public static int TBL_PAR116 = 755;
  public static int FLD_PAR116_NOMEOGGEDELI = 0;
  public static int FLD_PAR116_NOMEOGGDAELA = 1;
  public static int FLD_PAR116_NOMEOGGEVBVI = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS99 = 756;
  public static int FLD_PARS99_NOMEOGGEDELI = 0;
  public static int FLD_PARS99_NOMOGGNUMDEL = 1;
  public static int FLD_PARS99_NOMOGGANNDEL = 2;
  public static int FLD_PARS99_NOMOGGANNESI = 3;
  public static int FLD_PARS99_NOMEOGGPROUO = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR126 = 757;
  public static int FLD_PAR126_NOMEOGGEDELI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI571 = 758;
  public static int FLD_PARAMETRI571_PARAMVARIAZI = 0;

  // Definition of table: Pars
  //
  public static int TBL_PARS89 = 759;
  public static int FLD_PARS89_NOMOGGSEDDEL = 0;
  public static int FLD_PARS89_NOMOGGNUMDEL = 1;
  public static int FLD_PARS89_NOMOGGANNDEL = 2;
  public static int FLD_PARS89_NOMEOGGEPROP = 3;
  public static int FLD_PARS89_NOMEOGGENUME = 4;
  public static int FLD_PARS89_NOMEOGGEANNO = 5;
  public static int FLD_PARS89_NOMOGGDATREG = 6;

  // Definition of table: Pars
  //
  public static int TBL_PARS38 = 760;
  public static int FLD_PARS38_NOMEOGGETTUO = 0;
  public static int FLD_PARS38_NOMEOGGETTDA = 1;
  public static int FLD_PARS38_NOMEOGGETTOA = 2;
  public static int FLD_PARS38_NOOGIMOSUOAC = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI323 = 761;
  public static int FLD_PARAMETRI323_ROWNAMANNIMP = 0;
  public static int FLD_PARAMETRI323_ROWNAMNUMIMP = 1;
  public static int FLD_PARAMETRI323_ROWNAMEOPERA = 2;
  public static int FLD_PARAMETRI323_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI323_ROWNAMEARTIC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI515 = 762;
  public static int FLD_PARAMETRI515_ROWNAMECAP = 0;
  public static int FLD_PARAMETRI515_ROWNAMEART = 1;
  public static int FLD_PARAMETRI515_ROWNAMEIMPEG = 2;
  public static int FLD_PARAMETRI515_RONAANIMPROR = 3;
  public static int FLD_PARAMETRI515_RONANUIMPROR = 4;
  public static int FLD_PARAMETRI515_ROWNAMEFINAN = 5;
  public static int FLD_PARAMETRI515_ROWNAMEOPERA = 6;
  public static int FLD_PARAMETRI515_ROWNAMOBIOPE = 7;
  public static int FLD_PARAMETRI515_ROWNAMECGU = 8;
  public static int FLD_PARAMETRI515_ROWNAMEVLIVE = 9;
  public static int FLD_PARAMETRI515_ROWNAMLIV4CA = 10;
  public static int FLD_PARAMETRI515_ROWNAMVLIVIM = 11;
  public static int FLD_PARAMETRI515_ROWNAMCGUIMP = 12;
  public static int FLD_PARAMETRI515_ROWNAMCAPIMP = 13;
  public static int FLD_PARAMETRI515_ROWNAMARTIMP = 14;
  public static int FLD_PARAMETRI515_ROWNAMOBOPIM = 15;
  public static int FLD_PARAMETRI515_ROWNAMANIMPR = 16;
  public static int FLD_PARAMETRI515_ROWNAMNUIMPR = 17;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI215 = 763;
  public static int FLD_PARAMETRI215_ROWNAMACCDAL = 0;
  public static int FLD_PARAMETRI215_ROWNAMEAL = 1;
  public static int FLD_PARAMETRI215_ROWNAMDATELA = 2;
  public static int FLD_PARAMETRI215_ROWNAMEGIORN = 3;
  public static int FLD_PARAMETRI215_ROWNAMEXINEX = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI216 = 764;
  public static int FLD_PARAMETRI216_PARAMCASSA = 0;
  public static int FLD_PARAMETRI216_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI216_PARPERINCDAL = 2;
  public static int FLD_PARAMETRI216_PARAPERINCAL = 3;
  public static int FLD_PARAMETRI216_PARADATARITE = 4;
  public static int FLD_PARAMETRI216_PARDATMANDAL = 5;
  public static int FLD_PARAMETRI216_PARADATMANAL = 6;
  public static int FLD_PARAMETRI216_PARAMTIPO = 7;
  public static int FLD_PARAMETRI216_PARACODIBENE = 8;
  public static int FLD_PARAMETRI216_PARAMBENEFIC = 9;
  public static int FLD_PARAMETRI216_PARAMBENEOLD = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI378 = 765;
  public static int FLD_PARAMETRI378_ROWNAMSEDDEL = 0;
  public static int FLD_PARAMETRI378_ROWNAMNUMDE1 = 1;
  public static int FLD_PARAMETRI378_ROWNAMANNDE1 = 2;
  public static int FLD_PARAMETRI378_ROWNAMEPROPO = 3;
  public static int FLD_PARAMETRI378_ROWNAMANNPRO = 4;
  public static int FLD_PARAMETRI378_ROWNAMNUMPRO = 5;
  public static int FLD_PARAMETRI378_ROWNAMEESERC = 6;
  public static int FLD_PARAMETRI378_ROWNAMTIPVAR = 7;
  public static int FLD_PARAMETRI378_ROWNAMEDELIB = 8;
  public static int FLD_PARAMETRI378_ROWNAMNUMDEL = 9;
  public static int FLD_PARAMETRI378_ROWNAMANNDEL = 10;
  public static int FLD_PARAMETRI378_ROWNAMPERDAL = 11;
  public static int FLD_PARAMETRI378_ROWNAMEPERAL = 12;
  public static int FLD_PARAMETRI378_ROWNAMRESCOM = 13;
  public static int FLD_PARAMETRI378_RONATOPECOBI = 14;
  public static int FLD_PARAMETRI378_ROWNAMTOVAIM = 15;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI29 = 766;
  public static int FLD_FILTRI29_ROWNAMDAINDA = 0;
  public static int FLD_FILTRI29_ROWNAMDAINAL = 1;
  public static int FLD_FILTRI29_ROWNAMEORDIN = 2;
  public static int FLD_FILTRI29_ROWNAMTIPINC = 3;
  public static int FLD_FILTRI29_ROWNAMCOBEFI = 4;
  public static int FLD_FILTRI29_ROWNAMBENFIL = 5;
  public static int FLD_FILTRI29_ROWNAMBEFIOL = 6;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO19 = 767;
  public static int FLD_PARAMETRIO19_ANNOIMPOLD = 0;
  public static int FLD_PARAMETRIO19_NUMEROIMPOLD = 1;
  public static int FLD_PARAMETRIO19_ANNOSUBIMOLD = 2;
  public static int FLD_PARAMETRIO19_NUMERSUBIOLD = 3;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI7 = 768;
  public static int FLD_FILTRI7_TITOLO = 0;
  public static int FLD_FILTRI7_INTERVENTO = 1;
  public static int FLD_FILTRI7_CAPITOLO = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI274 = 769;
  public static int FLD_PARAMETRI274_ANNO_DEL = 0;
  public static int FLD_PARAMETRI274_NUMERO_DEL = 1;
  public static int FLD_PARAMETRI274_SEDE_DEL = 2;
  public static int FLD_PARAMETRI274_ANNO_PROPOSTA = 3;
  public static int FLD_PARAMETRI274_NUMERO_PROPOSTA = 4;
  public static int FLD_PARAMETRI274_UNITA_PROPONENTE = 5;
  public static int FLD_PARAMETRI274_ROWNAMEOBBLI = 6;
  public static int FLD_PARAMETRI274_ROWNAMDATREG = 7;
  public static int FLD_PARAMETRI274_ROWNAMEDESCR = 8;
  public static int FLD_PARAMETRI274_ROWNAMCONPRO = 9;
  public static int FLD_PARAMETRI274_ROWNAMINSDEL = 10;
  public static int FLD_PARAMETRI274_ROWNAMINSPRO = 11;

  // Definition of table: Nuova Tabella
  //
  public static int TBL_NUOVATABELL4 = 770;
  public static int FLD_NUOVATABELL4_NOMEOGGEIMPE = 0;
  public static int FLD_NUOVATABELL4_NOMOGGANNIMP = 1;

  // Definition of table: Nuova Tabella
  //
  public static int TBL_NUOVATABELL5 = 771;
  public static int FLD_NUOVATABELL5_NOMEOGGEIMPE = 0;
  public static int FLD_NUOVATABELL5_NOMOGGANNIMP = 1;
  public static int FLD_NUOVATABELL5_NOMOGGTIPSTA = 2;

  // Definition of table: Nuova Tabella
  //
  public static int TBL_NUOVATABELLA = 772;
  public static int FLD_NUOVATABELLA_NOMEOGGEIMPE = 0;
  public static int FLD_NUOVATABELLA_NOMOGGANNIMP = 1;
  public static int FLD_NUOVATABELLA_NOMOGGTIPSTA = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM162 = 773;
  public static int FLD_PARAM162_PARAMNUMEIMP = 0;
  public static int FLD_PARAM162_PARAMANNOIMP = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI545 = 774;
  public static int FLD_PARAMETRI545_ROWNAMSEDDEL = 0;
  public static int FLD_PARAMETRI545_ROWNAMNUMDE1 = 1;
  public static int FLD_PARAMETRI545_ROWNAMANNDE1 = 2;
  public static int FLD_PARAMETRI545_ROWNAMEPROPO = 3;
  public static int FLD_PARAMETRI545_ROWNAMANNPRO = 4;
  public static int FLD_PARAMETRI545_ROWNAMNUMPRO = 5;
  public static int FLD_PARAMETRI545_ROWNAMEESERC = 6;
  public static int FLD_PARAMETRI545_ROWNAMTIPVAR = 7;
  public static int FLD_PARAMETRI545_ROWNAMEDELIB = 8;
  public static int FLD_PARAMETRI545_ROWNAMNUMDEL = 9;
  public static int FLD_PARAMETRI545_ROWNAMANNDEL = 10;
  public static int FLD_PARAMETRI545_ROWNAMPERDAL = 11;
  public static int FLD_PARAMETRI545_ROWNAMEPERAL = 12;
  public static int FLD_PARAMETRI545_ROWNAMRESCOM = 13;
  public static int FLD_PARAMETRI545_RONATOPECOBI = 14;
  public static int FLD_PARAMETRI545_ROWNAMTOVAIM = 15;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI431 = 775;
  public static int FLD_PARAMETRI431_PARAMES = 0;
  public static int FLD_PARAMETRI431_PARAMTITOLO = 1;
  public static int FLD_PARAMETRI431_PARAMCATEGOR = 2;
  public static int FLD_PARAMETRI431_PARAMCODINTE = 3;
  public static int FLD_PARAMETRI431_PARAMCODTERZ = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI337 = 776;
  public static int FLD_PARAMETRI337_PARATIPOFORM = 0;
  public static int FLD_PARAMETRI337_PARAUNITORGA = 1;
  public static int FLD_PARAMETRI337_PARAMES = 2;
  public static int FLD_PARAMETRI337_PARAMCAPITOL = 3;
  public static int FLD_PARAMETRI337_PARAMARTICOL = 4;
  public static int FLD_PARAMETRI337_PARAMNUMEACC = 5;
  public static int FLD_PARAMETRI337_PARAMANNOACC = 6;
  public static int FLD_PARAMETRI337_PARAVOCEECON = 7;
  public static int FLD_PARAMETRI337_PARANUODAESP = 8;
  public static int FLD_PARAMETRI337_PARNUODAPRDE = 9;
  public static int FLD_PARAMETRI337_PARANUODAELE = 10;
  public static int FLD_PARAMETRI337_PARACONTFINA = 11;
  public static int FLD_PARAMETRI337_PARACONTPLUR = 12;
  public static int FLD_PARAMETRI337_PARAMCAPIOLD = 13;
  public static int FLD_PARAMETRI337_PARAMARTIOLD = 14;
  public static int FLD_PARAMETRI337_PARAUNITPROP = 15;
  public static int FLD_PARAMETRI337_PARANUMEPROP = 16;
  public static int FLD_PARAMETRI337_PARAANNOPROP = 17;
  public static int FLD_PARAMETRI337_PARANNPEBIFI = 18;
  public static int FLD_PARAMETRI337_PARAMREISCRI = 19;
  public static int FLD_PARAMETRI337_PARIMPVAACPR = 20;
  public static int FLD_PARAMETRI337_PARPROVARREI = 21;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP1 = 777;
  public static int FLD_VALORICAP1_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP1_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP1_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP1_ROWNAMCODTER = 3;
  public static int FLD_VALORICAP1_ROWNAMLIV4CA = 4;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ5 = 778;
  public static int FLD_PERSONALIZZ5_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ5_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ5_ROWNAMOLDCEN = 2;
  public static int FLD_PERSONALIZZ5_ROWNAMOLDFAT = 3;
  public static int FLD_PERSONALIZZ5_ROWNAMOLCOPA = 4;
  public static int FLD_PERSONALIZZ5_ROWNAMOLRIEC = 5;
  public static int FLD_PERSONALIZZ5_ROWNAMRPPATT = 6;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVAR1 = 779;
  public static int FLD_PARAMETRVAR1_ROWNAMIMPATT = 0;
  public static int FLD_PARAMETRVAR1_ROWNAMEINDIC = 1;
  public static int FLD_PARAMETRVAR1_ROWNAMSOIMCO = 2;
  public static int FLD_PARAMETRVAR1_ROWNAMRPPATT = 3;

  // Definition of table: ACC Rollback
  //
  public static int TBL_ACCROLLBACK1 = 780;
  public static int FLD_ACCROLLBACK1_CAPITOLO = 0;
  public static int FLD_ACCROLLBACK1_ARTICOLO = 1;
  public static int FLD_ACCROLLBACK1_ANNO_ACC = 2;
  public static int FLD_ACCROLLBACK1_NUMERO_ACC = 3;
  public static int FLD_ACCROLLBACK1_ANNO_DEL = 4;
  public static int FLD_ACCROLLBACK1_NUMERO_DEL = 5;
  public static int FLD_ACCROLLBACK1_SEDE_DEL = 6;
  public static int FLD_ACCROLLBACK1_DATA_REG = 7;
  public static int FLD_ACCROLLBACK1_IMPORTO = 8;
  public static int FLD_ACCROLLBACK1_DESCRIZIONE = 9;
  public static int FLD_ACCROLLBACK1_CAUSALE = 10;
  public static int FLD_ACCROLLBACK1_ANNO_INTROD = 11;
  public static int FLD_ACCROLLBACK1_DEBITORE = 12;
  public static int FLD_ACCROLLBACK1_ESERCIZIO_SCADENZA = 13;
  public static int FLD_ACCROLLBACK1_TIPO_SERVIZIO = 14;
  public static int FLD_ACCROLLBACK1_VOCE_ECON = 15;
  public static int FLD_ACCROLLBACK1_TIPO_VINCOLO = 16;
  public static int FLD_ACCROLLBACK1_TIPO_AVANZO = 17;
  public static int FLD_ACCROLLBACK1_CODICE_FINANZ = 18;
  public static int FLD_ACCROLLBACK1_ANNO_PROPOSTA = 19;
  public static int FLD_ACCROLLBACK1_UNITA_PROPONENTE = 20;
  public static int FLD_ACCROLLBACK1_NUMERO_PROPOSTA = 21;
  public static int FLD_ACCROLLBACK1_VAR_AUTO = 22;
  public static int FLD_ACCROLLBACK1_E = 23;
  public static int FLD_ACCROLLBACK1_D_DATA_REG = 24;
  public static int FLD_ACCROLLBACK1_ANNO_PLUR = 25;
  public static int FLD_ACCROLLBACK1_NUMERO_PLUR = 26;
  public static int FLD_ACCROLLBACK1_CENTRO = 27;
  public static int FLD_ACCROLLBACK1_FATTORE = 28;
  public static int FLD_ACCROLLBACK1_COMPETENZA_DAL = 29;
  public static int FLD_ACCROLLBACK1_COMPETENZA_AL = 30;
  public static int FLD_ACCROLLBACK1_NOTE = 31;
  public static int FLD_ACCROLLBACK1_RILEVANTE_ECO = 32;
  public static int FLD_ACCROLLBACK1_COD_IMP_ECO = 33;
  public static int FLD_ACCROLLBACK1_CONTROLLO_DISP = 34;
  public static int FLD_ACCROLLBACK1_PROGETTO_ID = 35;
  public static int FLD_ACCROLLBACK1_FINANZIAMENTO = 36;
  public static int FLD_ACCROLLBACK1_OBIETTIVO = 37;
  public static int FLD_ACCROLLBACK1_CODICE_GESTIONALE = 38;
  public static int FLD_ACCROLLBACK1_RESPONSABILE_RES = 39;
  public static int FLD_ACCROLLBACK1_PROGR_UNITA_ORGANIZZATIVA = 40;
  public static int FLD_ACCROLLBACK1_UTENTE_INSERIMENTO = 41;
  public static int FLD_ACCROLLBACK1_DATA_INSERIMENTO = 42;
  public static int FLD_ACCROLLBACK1_UTENTE_ULTIMO_AGG = 43;
  public static int FLD_ACCROLLBACK1_DATA_ULTIMO_AGG = 44;
  public static int FLD_ACCROLLBACK1_PROGR_UNITA_ORGANIZZATIVA_INS = 45;
  public static int FLD_ACCROLLBACK1_SCHEDA_OBIETTIVO_ID = 46;
  public static int FLD_ACCROLLBACK1_COD_MONITORAGGIO = 47;
  public static int FLD_ACCROLLBACK1_CODICE_EUROPEO = 48;
  public static int FLD_ACCROLLBACK1_COD_LIVELLO_5 = 49;
  public static int FLD_ACCROLLBACK1_ANNO_ACC_PROVENIENZA = 50;
  public static int FLD_ACCROLLBACK1_NUMERO_ACC_PROVENIENZA = 51;
  public static int FLD_ACCROLLBACK1_DATA_REG_ECONOMICA = 52;
  public static int FLD_ACCROLLBACK1_DATA_SCADENZA = 53;

  // Definition of table: PLURIENNALI Rollback
  //
  public static int TBL_PLURIEROLLBA = 781;
  public static int FLD_PLURIEROLLBA_CAPITOLO = 0;
  public static int FLD_PLURIEROLLBA_ARTICOLO = 1;
  public static int FLD_PLURIEROLLBA_ANNO_ACC = 2;
  public static int FLD_PLURIEROLLBA_NUMERO_ACC = 3;
  public static int FLD_PLURIEROLLBA_ANNO_DEL = 4;
  public static int FLD_PLURIEROLLBA_NUMERO_DEL = 5;
  public static int FLD_PLURIEROLLBA_SEDE_DEL = 6;
  public static int FLD_PLURIEROLLBA_DATA_REG = 7;
  public static int FLD_PLURIEROLLBA_IMPORTO = 8;
  public static int FLD_PLURIEROLLBA_DESCRIZIONE = 9;
  public static int FLD_PLURIEROLLBA_CAUSALE = 10;
  public static int FLD_PLURIEROLLBA_ANNO_INTROD = 11;
  public static int FLD_PLURIEROLLBA_DEBITORE = 12;
  public static int FLD_PLURIEROLLBA_ESERCIZIO_SCADENZA = 13;
  public static int FLD_PLURIEROLLBA_TIPO_SERVIZIO = 14;
  public static int FLD_PLURIEROLLBA_VOCE_ECON = 15;
  public static int FLD_PLURIEROLLBA_TIPO_VINCOLO = 16;
  public static int FLD_PLURIEROLLBA_CODICE_FINANZ = 17;
  public static int FLD_PLURIEROLLBA_ANNO_PROPOSTA = 18;
  public static int FLD_PLURIEROLLBA_UNITA_PROPONENTE = 19;
  public static int FLD_PLURIEROLLBA_NUMERO_PROPOSTA = 20;
  public static int FLD_PLURIEROLLBA_VAR_AUTO = 21;
  public static int FLD_PLURIEROLLBA_E = 22;
  public static int FLD_PLURIEROLLBA_D_DATA_REG = 23;
  public static int FLD_PLURIEROLLBA_ANNO_PLUR = 24;
  public static int FLD_PLURIEROLLBA_NUMERO_PLUR = 25;
  public static int FLD_PLURIEROLLBA_CENTRO = 26;
  public static int FLD_PLURIEROLLBA_FATTORE = 27;
  public static int FLD_PLURIEROLLBA_COMPETENZA_DAL = 28;
  public static int FLD_PLURIEROLLBA_COMPETENZA_AL = 29;
  public static int FLD_PLURIEROLLBA_NOTE = 30;
  public static int FLD_PLURIEROLLBA_RILEVANTE_ECO = 31;
  public static int FLD_PLURIEROLLBA_COD_IMP_ECO = 32;
  public static int FLD_PLURIEROLLBA_CONTROLLO_DISP = 33;
  public static int FLD_PLURIEROLLBA_PROGETTO_ID = 34;
  public static int FLD_PLURIEROLLBA_FINANZIAMENTO = 35;
  public static int FLD_PLURIEROLLBA_OBIETTIVO = 36;
  public static int FLD_PLURIEROLLBA_CODICE_GESTIONALE = 37;
  public static int FLD_PLURIEROLLBA_RESPONSABILE_RES = 38;
  public static int FLD_PLURIEROLLBA_PROGR_UNITA_ORGANIZZATIVA = 39;
  public static int FLD_PLURIEROLLBA_UTENTE_INSERIMENTO = 40;
  public static int FLD_PLURIEROLLBA_DATA_INSERIMENTO = 41;
  public static int FLD_PLURIEROLLBA_UTENTE_ULTIMO_AGG = 42;
  public static int FLD_PLURIEROLLBA_DATA_ULTIMO_AGG = 43;
  public static int FLD_PLURIEROLLBA_PROGR_UNITA_ORGANIZZATIVA_INS = 44;
  public static int FLD_PLURIEROLLBA_SCHEDA_OBIETTIVO_ID = 45;
  public static int FLD_PLURIEROLLBA_TIPO_AVANZO = 46;

  // Definition of table: Pluriennali
  //
  public static int TBL_PLURIENNALI = 782;
  public static int FLD_PLURIENNALI_ROWNAMIMPOLD = 0;
  public static int FLD_PLURIENNALI_ROWNAMPRIDOL = 1;
  public static int FLD_PLURIENNALI_ROWNAMCOFAES = 2;
  public static int FLD_PLURIENNALI_ROWNAMEANNO = 3;
  public static int FLD_PLURIENNALI_ROWNAMDATREG = 4;
  public static int FLD_PLURIENNALI_ROWNAMEDESCR = 5;

  // Definition of table: Finanziamento
  //
  public static int TBL_FINANZIAME14 = 783;
  public static int FLD_FINANZIAME14_PARAMFINANZI = 0;

  // Definition of table: Opere
  //
  public static int TBL_OPERE = 784;
  public static int FLD_OPERE_ROWNAMEID = 0;
  public static int FLD_OPERE_ROWNAMECODIC = 1;
  public static int FLD_OPERE_ROWNAMIMPOLD = 2;
  public static int FLD_OPERE_ROWNAMEIMPOR = 3;
  public static int FLD_OPERE_ROWNAMESTATO = 4;

  // Definition of table: Variazioni
  //
  public static int TBL_VARIAZIONI2 = 785;
  public static int FLD_VARIAZIONI2_ROWNAMPROVAR = 0;
  public static int FLD_VARIAZIONI2_ROWNAMNUMACC = 1;
  public static int FLD_VARIAZIONI2_ROWNAMANNACC = 2;
  public static int FLD_VARIAZIONI2_ROWNAMDESACC = 3;
  public static int FLD_VARIAZIONI2_ROWNAMPROACC = 4;
  public static int FLD_VARIAZIONI2_RONAPRACIDOL = 5;
  public static int FLD_VARIAZIONI2_ROWNAMFINACC = 6;
  public static int FLD_VARIAZIONI2_ROWNAMTIPFOR = 7;
  public static int FLD_VARIAZIONI2_ROWNAMEPROGR = 8;
  public static int FLD_VARIAZIONI2_ROWNAMCONPRO = 9;
  public static int FLD_VARIAZIONI2_ROWNAMINFUPD = 10;
  public static int FLD_VARIAZIONI2_ROWNAMOBIACC = 11;
  public static int FLD_VARIAZIONI2_RONANUVADAEL = 12;
  public static int FLD_VARIAZIONI2_RONANUVADAPR = 13;
  public static int FLD_VARIAZIONI2_ROWNAMECAPIT = 14;
  public static int FLD_VARIAZIONI2_ROWNAMEARTIC = 15;
  public static int FLD_VARIAZIONI2_ROWNAMUNIPRO = 16;
  public static int FLD_VARIAZIONI2_ROWNAMNUMPRO = 17;
  public static int FLD_VARIAZIONI2_ROWNAMANNPRO = 18;
  public static int FLD_VARIAZIONI2_ROWNAMEPROUO = 19;
  public static int FLD_VARIAZIONI2_ROWNAMANACPR = 20;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI82 = 786;
  public static int FLD_PARAMETRI82_PARAMES = 0;
  public static int FLD_PARAMETRI82_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI82_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI82_PARAUNITORGA = 3;
  public static int FLD_PARAMETRI82_PARAMNUMEACC = 4;
  public static int FLD_PARAMETRI82_PARAMANNOACC = 5;
  public static int FLD_PARAMETRI82_PARAVOCEECON = 6;
  public static int FLD_PARAMETRI82_PARATIPOFORM = 7;

  // Definition of table: Debitore
  //
  public static int TBL_DEBITORE8 = 787;
  public static int FLD_DEBITORE8_ROWNAMRAGSOC = 0;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP6 = 788;
  public static int FLD_VALORICAP6_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP6_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP6_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP6_ROWNAMCODTER = 3;

  // Definition of table: Personalizzazioni
  //
  public static int TBL_PERSONALIZZ2 = 789;
  public static int FLD_PERSONALIZZ2_ROWNAMVISOBI = 0;
  public static int FLD_PERSONALIZZ2_ROWNAMPROFIN = 1;
  public static int FLD_PERSONALIZZ2_ROWNAMIMPOLD = 2;
  public static int FLD_PERSONALIZZ2_ROWNAMPRIDOL = 3;
  public static int FLD_PERSONALIZZ2_ROWNAMOBIOLD = 4;
  public static int FLD_PERSONALIZZ2_ROWNAMOLDCEN = 5;
  public static int FLD_PERSONALIZZ2_ROWNAMOLDFAT = 6;
  public static int FLD_PERSONALIZZ2_ROWNAMOLCOPA = 7;
  public static int FLD_PERSONALIZZ2_ROWNAMOLRIEC = 8;

  // Definition of table: Parametri Vari
  //
  public static int TBL_PARAMETRVARI = 790;
  public static int FLD_PARAMETRVARI_ROWNAMIMPATT = 0;
  public static int FLD_PARAMETRVARI_ROWNAMIMPVAR = 1;
  public static int FLD_PARAMETRVARI_ROWNAMECONTI = 2;
  public static int FLD_PARAMETRVARI_ROWNAMLASYEA = 3;
  public static int FLD_PARAMETRVARI_ROWNAMEESERC = 4;
  public static int FLD_PARAMETRVARI_ROWNAMEFINAN = 5;
  public static int FLD_PARAMETRVARI_ROWNAMEINDIC = 6;
  public static int FLD_PARAMETRVARI_ROWNAMEBUDGE = 7;
  public static int FLD_PARAMETRVARI_ROWNAMRPPATT = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI77 = 791;
  public static int FLD_PARAMETRI77_PARAMNUMEACC = 0;
  public static int FLD_PARAMETRI77_PARAMANNOACC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI76 = 792;
  public static int FLD_PARAMETRI76_PARAMNUMEACC = 0;
  public static int FLD_PARAMETRI76_PARAMANNOACC = 1;

  // Definition of table: Finanziamento
  //
  public static int TBL_FINANZIAMEN9 = 793;
  public static int FLD_FINANZIAMEN9_PARAMFINANZI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI205 = 794;
  public static int FLD_PARAMETRI205_ROWNAMPROUNI = 0;
  public static int FLD_PARAMETRI205_ROWNAMEESERC = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI79 = 795;
  public static int FLD_PARAMETRI79_ANNO_IMP = 0;
  public static int FLD_PARAMETRI79_NUMERO_IMP = 1;
  public static int FLD_PARAMETRI79_ROWNAMEFINAN = 2;
  public static int FLD_PARAMETRI79_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI79_ROWNAMEARTIC = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI208 = 796;
  public static int FLD_PARAMETRI208_ROWNAMECAP = 0;
  public static int FLD_PARAMETRI208_ROWNAMEART = 1;
  public static int FLD_PARAMETRI208_ROWNAMEACCER = 2;
  public static int FLD_PARAMETRI208_ROWNAMEFINAN = 3;
  public static int FLD_PARAMETRI208_ROWNAMEOPERA = 4;
  public static int FLD_PARAMETRI208_ROWNAMOBIOPE = 5;
  public static int FLD_PARAMETRI208_ROWNAMECGE = 6;
  public static int FLD_PARAMETRI208_ROWNAMEVLIVE = 7;
  public static int FLD_PARAMETRI208_ROWNAMLIV4CA = 8;
  public static int FLD_PARAMETRI208_ROWNAMVLIVAC = 9;
  public static int FLD_PARAMETRI208_ROWNAMCGEACC = 10;
  public static int FLD_PARAMETRI208_ROWNAMCAPACC = 11;
  public static int FLD_PARAMETRI208_ROWNAMARTACC = 12;
  public static int FLD_PARAMETRI208_ROWNAMOBOPAC = 13;
  public static int FLD_PARAMETRI208_ROWNAMANACPR = 14;
  public static int FLD_PARAMETRI208_ROWNAMNUACPR = 15;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI210 = 797;
  public static int FLD_PARAMETRI210_ROWNAMACCDAL = 0;
  public static int FLD_PARAMETRI210_ROWNAMEAL = 1;
  public static int FLD_PARAMETRI210_ROWNAMDATELA = 2;
  public static int FLD_PARAMETRI210_ROWNAMEXINEX = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI265 = 798;
  public static int FLD_PARAMETRI265_ROWNAMPERDAL = 0;
  public static int FLD_PARAMETRI265_ROWNAMEPERAL = 1;
  public static int FLD_PARAMETRI265_ROWNAMRESCOM = 2;
  public static int FLD_PARAMETRI265_ROWNAMTIPVAR = 3;
  public static int FLD_PARAMETRI265_SEDE_DEL = 4;
  public static int FLD_PARAMETRI265_NUMERO_DEL = 5;
  public static int FLD_PARAMETRI265_ANNO_DEL = 6;
  public static int FLD_PARAMETRI265_ROWNAMEPROPO = 7;
  public static int FLD_PARAMETRI265_ROWNAMANNPRO = 8;
  public static int FLD_PARAMETRI265_ROWNAMNUMPRO = 9;

  // Definition of table: Paremetri Tmp
  //
  public static int TBL_PAREMETRITMP = 799;
  public static int FLD_PAREMETRITMP_ROWNAMNUMDEL = 0;
  public static int FLD_PAREMETRITMP_ROWNAMANNDEL = 1;
  public static int FLD_PAREMETRITMP_ROWNAMSEDDEL = 2;
  public static int FLD_PAREMETRITMP_ROWNAMUNIPRO = 3;
  public static int FLD_PAREMETRITMP_ROWNAMANNACC = 4;

  // Definition of table: Param
  //
  public static int TBL_PARAM122 = 800;
  public static int FLD_PARAM122_PARAMNUMEACC = 0;
  public static int FLD_PARAM122_PARAMANNOACC = 1;

}
