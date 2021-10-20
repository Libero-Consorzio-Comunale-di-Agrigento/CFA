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
public class IMDBDef13 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: Saldi Tipi Avanzo
  //
  public static int PQRY_SALDTIPIAVAN = 2735;
  public static int PQSL_SALDTIPIAVAN_SATISATITIAV = 0;
  public static int PQSL_SALDTIPIAVAN_SALTIPAVADES = 1;
  public static int PQSL_SALDTIPIAVAN_SALTIPAVAESE = 2;
  public static int PQSL_SALDTIPIAVAN_SALTIPAVIMIN = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI471 = 2736;
  public static int PQRY_PARAMETRI471_RS = 2737;
  public static int PQSL_PARAMETRI471_PARAMESERCIZ = 0;
  public static int PQSL_PARAMETRI471_PARAESTRDATI = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI479 = 2738;
  public static int PQRY_PARAMETRI479_RS = 2739;
  public static int PQSL_PARAMETRI479_PARAVERSSALV = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI495 = 2740;
  public static int PQRY_PARAMETRI495_RS = 2741;
  public static int PQSL_PARAMETRI495_PARAAVANINIZ = 0;
  public static int PQSL_PARAMETRI495_PARAVERSAVAN = 1;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY = 2742;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI693 = 2743;
  public static int PQRY_PARAMETRI693_RS = 2744;
  public static int PQSL_PARAMETRI693_PARATIPOAVAN = 0;
  public static int PQSL_PARAMETRI693_PARAFONDACCA = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI694 = 2745;
  public static int PQRY_PARAMETRI694_RS = 2746;
  public static int PQSL_PARAMETRI694_VALOAVANINIZ = 0;
  public static int PQSL_PARAMETRI694_VALORIACCERT = 1;
  public static int PQSL_PARAMETRI694_VALRESATTAUM = 2;
  public static int PQSL_PARAMETRI694_VALRESATTDIM = 3;
  public static int PQSL_PARAMETRI694_VALORIIMPEGN = 4;
  public static int PQSL_PARAMETRI694_VALORIFPV = 5;
  public static int PQSL_PARAMETRI694_VALRESPASRID = 6;
  public static int PQSL_PARAMETRI694_VALIMPREIRID = 7;
  public static int PQSL_PARAMETRI694_VALOAVANFINA = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI695 = 2747;
  public static int PQRY_PARAMETRI695_RS = 2748;
  public static int PQSL_PARAMETRI695_PARANOTEVERS = 0;

  // Table to contain panel selected row: Valori Avanzo Esercizio
  //
  public static int PQRY_VALOAVANESE1 = 2749;
  public static int PQRY_VALOAVANESE1_RS = 2750;
  public static int PQSL_VALOAVANESE1_RECVALAVAINI = 0;
  public static int PQSL_VALOAVANESE1_RECOVALOACCE = 1;
  public static int PQSL_VALOAVANESE1_RECVALREATAU = 2;
  public static int PQSL_VALOAVANESE1_RECVALREATDI = 3;
  public static int PQSL_VALOAVANESE1_RECOVALOIMPE = 4;
  public static int PQSL_VALOAVANESE1_RECORVALOFPV = 5;
  public static int PQSL_VALOAVANESE1_RECVALREPARI = 6;
  public static int PQSL_VALOAVANESE1_RECVALIMRERI = 7;
  public static int PQSL_VALOAVANESE1_RECVALAVAFIN = 8;
  public static int PQSL_VALOAVANESE1_RECPARDEFOAC = 9;
  public static int PQSL_VALOAVANESE1_RECPARDETIAV = 10;

  // Table to contain panel selected row: AVANZO ESERCIZIO
  //
  public static int PQRY_AVANZOESERC2 = 2751;
  public static int PQSL_AVANZOESERC2_AVANESERPROG = 0;
  public static int PQSL_AVANZOESERC2_AVAESEPROSES = 1;
  public static int PQSL_AVANZOESERC2_AVANZOESERCI = 2;
  public static int PQSL_AVANZOESERC2_AVANESEIDSAL = 3;
  public static int PQSL_AVANZOESERC2_AVAESETIPAVA = 4;
  public static int PQSL_AVANZOESERC2_AVAESECOAVVI = 5;
  public static int PQSL_AVANZOESERC2_AVAESETIPMOV = 6;
  public static int PQSL_AVANZOESERC2_AVANESERIMPO = 7;
  public static int PQSL_AVANZOESERC2_AVAESEANNIMP = 8;
  public static int PQSL_AVANZOESERC2_AVAESENUMIMP = 9;
  public static int PQSL_AVANZOESERC2_AVAESEPROVAR = 10;
  public static int PQSL_AVANZOESERC2_AVAESEANNVAR = 11;
  public static int PQSL_AVANZOESERC2_AVAESEANNESI = 12;
  public static int PQSL_AVANZOESERC2_AVAESEANIMPR = 13;
  public static int PQSL_AVANZOESERC2_AVAESENUIMPR = 14;
  public static int PQSL_AVANZOESERC2_AVANESERFINA = 15;
  public static int PQSL_AVANZOESERC2_AVANESEROPER = 16;
  public static int PQSL_AVANZOESERC2_AVAESEPRUNOR = 17;
  public static int PQSL_AVANZOESERC2_AVAESECOUNOR = 18;
  public static int PQSL_AVANZOESERC2_AVAESEDEUNOR = 19;
  public static int PQSL_AVANZOESERC2_AVANESELIVIV = 20;
  public static int PQSL_AVANZOESERC2_AVAESECODSTR = 21;
  public static int PQSL_AVANZOESERC2_AVAESEDESMOV = 22;
  public static int PQSL_AVANZOESERC2_AVAESEDATREG = 23;
  public static int PQSL_AVANZOESERC2_AVAESEUTEREG = 24;
  public static int PQSL_AVANZOESERC2_AVANESERCAPI = 25;
  public static int PQSL_AVANZOESERC2_AVANESERARTI = 26;
  public static int PQSL_AVANZOESERC2_AVAESETIPVIN = 27;

  // Table to contain panel selected row: AVANZO ESERCIZIO
  //
  public static int PQRY_AVANZOESERC1 = 2752;
  public static int PQSL_AVANZOESERC1_AVANESERPROG = 0;
  public static int PQSL_AVANZOESERC1_AVAESEPROSES = 1;
  public static int PQSL_AVANZOESERC1_AVANZOESERCI = 2;
  public static int PQSL_AVANZOESERC1_AVANESEIDSAL = 3;
  public static int PQSL_AVANZOESERC1_AVAESETIPAVA = 4;
  public static int PQSL_AVANZOESERC1_AVAESECOAVVI = 5;
  public static int PQSL_AVANZOESERC1_AVAESETIPMOV = 6;
  public static int PQSL_AVANZOESERC1_AVANESERIMPO = 7;
  public static int PQSL_AVANZOESERC1_AVAESEANNIMP = 8;
  public static int PQSL_AVANZOESERC1_AVAESENUMIMP = 9;
  public static int PQSL_AVANZOESERC1_AVAESEPROVAR = 10;
  public static int PQSL_AVANZOESERC1_AVAESEANNVAR = 11;
  public static int PQSL_AVANZOESERC1_AVAESEANNESI = 12;
  public static int PQSL_AVANZOESERC1_AVAESEANIMPR = 13;
  public static int PQSL_AVANZOESERC1_AVAESENUIMPR = 14;
  public static int PQSL_AVANZOESERC1_AVANESERFINA = 15;
  public static int PQSL_AVANZOESERC1_AVANESEROPER = 16;
  public static int PQSL_AVANZOESERC1_AVAESEPRUNOR = 17;
  public static int PQSL_AVANZOESERC1_AVAESECOUNOR = 18;
  public static int PQSL_AVANZOESERC1_AVAESEDEUNOR = 19;
  public static int PQSL_AVANZOESERC1_AVANESELIVIV = 20;
  public static int PQSL_AVANZOESERC1_AVAESECODSTR = 21;
  public static int PQSL_AVANZOESERC1_AVAESEDESMOV = 22;
  public static int PQSL_AVANZOESERC1_AVAESEDATREG = 23;
  public static int PQSL_AVANZOESERC1_AVAESEUTEREG = 24;
  public static int PQSL_AVANZOESERC1_AVANESERCAPI = 25;
  public static int PQSL_AVANZOESERC1_AVANESERARTI = 26;
  public static int PQSL_AVANZOESERC1_AVAESETIPVIN = 27;

  // Table to contain panel selected row: AVANZO ESERCIZIO
  //
  public static int PQRY_AVANZOESERCI = 2753;
  public static int PQSL_AVANZOESERCI_AVANESERPROG = 0;
  public static int PQSL_AVANZOESERCI_AVAESEPROSES = 1;
  public static int PQSL_AVANZOESERCI_AVANZOESERCI = 2;
  public static int PQSL_AVANZOESERCI_AVANESEIDSAL = 3;
  public static int PQSL_AVANZOESERCI_AVAESETIPAVA = 4;
  public static int PQSL_AVANZOESERCI_AVAESECOAVVI = 5;
  public static int PQSL_AVANZOESERCI_AVAESETIPMOV = 6;
  public static int PQSL_AVANZOESERCI_AVANESERIMPO = 7;
  public static int PQSL_AVANZOESERCI_AVAESEANNIMP = 8;
  public static int PQSL_AVANZOESERCI_AVAESENUMIMP = 9;
  public static int PQSL_AVANZOESERCI_AVAESEPROVAR = 10;
  public static int PQSL_AVANZOESERCI_AVAESEANNVAR = 11;
  public static int PQSL_AVANZOESERCI_AVAESEANNESI = 12;
  public static int PQSL_AVANZOESERCI_AVAESEANIMPR = 13;
  public static int PQSL_AVANZOESERCI_AVAESENUIMPR = 14;
  public static int PQSL_AVANZOESERCI_AVANESERFINA = 15;
  public static int PQSL_AVANZOESERCI_AVANESEROPER = 16;
  public static int PQSL_AVANZOESERCI_AVAESEPRUNOR = 17;
  public static int PQSL_AVANZOESERCI_AVAESECOUNOR = 18;
  public static int PQSL_AVANZOESERCI_AVAESEDEUNOR = 19;
  public static int PQSL_AVANZOESERCI_AVANESELIVIV = 20;
  public static int PQSL_AVANZOESERCI_AVAESECODSTR = 21;
  public static int PQSL_AVANZOESERCI_AVAESEDESMOV = 22;
  public static int PQSL_AVANZOESERCI_AVAESEDATREG = 23;
  public static int PQSL_AVANZOESERCI_AVAESEUTEREG = 24;
  public static int PQSL_AVANZOESERCI_AVANESERCAPI = 25;
  public static int PQSL_AVANZOESERCI_AVANESERARTI = 26;
  public static int PQSL_AVANZOESERCI_AVAESETIPVIN = 27;
  public static int PQSL_AVANZOESERCI_ORDINAMENTO = 28;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM89 = 2754;
  public static int PQRY_PARAM89_RS = 2755;
  public static int PQSL_PARAM89_ROWNAMEPARTE = 0;
  public static int PQSL_PARAM89_ROWNAMDETCAP = 1;
  public static int PQSL_PARAM89_ROWNAMDESINT = 2;
  public static int PQSL_PARAM89_ROWNAMDESABB = 3;
  public static int PQSL_PARAM89_RONASOTOPETI = 4;
  public static int PQSL_PARAM89_ROWNAMSOLCOM = 5;
  public static int PQSL_PARAM89_ROWNAMSEROPE = 6;
  public static int PQSL_PARAM89_ROWNAMEINTER = 7;
  public static int PQSL_PARAM89_ROWNAMECAPIT = 8;
  public static int PQSL_PARAM89_ROWNAMEARTIC = 9;
  public static int PQSL_PARAM89_ROWNAMDATELA = 10;
  public static int PQSL_PARAM89_ROWNAMUNIORG = 11;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR13 = 2756;
  public static int PQRY_PAR13_RS = 2757;
  public static int PQSL_PAR13_ROWNAMEMESI = 0;
  public static int PQSL_PAR13_ROWNAMDETCAP = 1;
  public static int PQSL_PAR13_ROWNAMDESINT = 2;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR81 = 2758;
  public static int PQRY_PAR81_RS = 2759;
  public static int PQSL_PAR81_ROWNAMDETCAP = 0;
  public static int PQSL_PAR81_ROWNAMSTDEIN = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI397 = 2760;
  public static int PQRY_PARAMETRI397_RS = 2761;
  public static int PQSL_PARAMETRI397_PARAMSITUPER = 0;
  public static int PQSL_PARAMETRI397_PARAMFUNZION = 1;
  public static int PQSL_PARAMETRI397_PARAMSERVIZI = 2;
  public static int PQSL_PARAMETRI397_PARASETTOPER = 3;
  public static int PQSL_PARAMETRI397_PARASERVOPER = 4;
  public static int PQSL_PARAMETRI397_PARACENDICOS = 5;
  public static int PQSL_PARAMETRI397_PARAMUOSUDDI = 6;
  public static int PQSL_PARAMETRI397_PARAMUOSOTTO = 7;
  public static int PQSL_PARAMETRI397_PARAMTITOLO = 8;
  public static int PQSL_PARAMETRI397_PARACATECAPI = 9;
  public static int PQSL_PARAMETRI397_PARATIPOVINC = 10;
  public static int PQSL_PARAMETRI397_PARAVINCSCAD = 11;
  public static int PQSL_PARAMETRI397_PARAMPROGRAM = 12;
  public static int PQSL_PARAMETRI397_PARAMPROGETT = 13;
  public static int PQSL_PARAMETRI397_PARAMFLESSIB = 14;
  public static int PQSL_PARAMETRI397_PARAVOCEECON = 15;
  public static int PQSL_PARAMETRI397_PARACODIGEST = 16;
  public static int PQSL_PARAMETRI397_PARADATAELAB = 17;
  public static int PQSL_PARAMETRI397_PARATIPDISPE = 18;
  public static int PQSL_PARAMETRI397_PARAMINTERVE = 19;
  public static int PQSL_PARAMETRI397_PARADETTCAPI = 20;
  public static int PQSL_PARAMETRI397_PARADESCINTE = 21;
  public static int PQSL_PARAMETRI397_PARADESCABBR = 22;
  public static int PQSL_PARAMETRI397_PARSOLTOPETI = 23;
  public static int PQSL_PARAMETRI397_PARASOLOCOMP = 24;
  public static int PQSL_PARAMETRI397_PARTIPVIDAMO = 25;
  public static int PQSL_PARAMETRI397_PARAMPARTE = 26;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL2 = 2762;
  public static int PQSL_CF4WESITBIL2_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBIL2_STANZ_INI = 1;
  public static int PQSL_CF4WESITBIL2_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBIL2_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBIL2_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBIL2_DISP = 5;
  public static int PQSL_CF4WESITBIL2_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBIL2_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBIL2_DESCR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL2_PROGR_UO_LIVELLO_SUP = 9;
  public static int PQSL_CF4WESITBIL2_DESCR_UO_LIVELLO_SUP = 10;
  public static int PQSL_CF4WESITBIL2_RECORDRAGGRU = 11;
  public static int PQSL_CF4WESITBIL2_RECORDESCRUO = 12;
  public static int PQSL_CF4WESITBIL2_TITOLO = 13;
  public static int PQSL_CF4WESITBIL2_RECORDTITOLO = 14;
  public static int PQSL_CF4WESITBIL2_RECCF4SICOBI = 15;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL5 = 2763;
  public static int PQSL_CF4WESITBIL5_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBIL5_STANZ_INI = 1;
  public static int PQSL_CF4WESITBIL5_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBIL5_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBIL5_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBIL5_DISP = 5;
  public static int PQSL_CF4WESITBIL5_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBIL5_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBIL5_DESCR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL5_PROGR_UO_LIVELLO_SUP = 9;
  public static int PQSL_CF4WESITBIL5_DESCR_UO_LIVELLO_SUP = 10;
  public static int PQSL_CF4WESITBIL5_RECORDRAGGRU = 11;
  public static int PQSL_CF4WESITBIL5_RECORDESCRUO = 12;
  public static int PQSL_CF4WESITBIL5_IMPEGNABILE = 13;
  public static int PQSL_CF4WESITBIL5_LIQ_COMP = 14;
  public static int PQSL_CF4WESITBIL5_LIQ_RES = 15;
  public static int PQSL_CF4WESITBIL5_RECORDTITOLO = 16;
  public static int PQSL_CF4WESITBIL5_TITOLO = 17;
  public static int PQSL_CF4WESITBIL5_RECCF4SICOBI = 18;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL6 = 2764;
  public static int PQSL_CF4WESITBIL6_CAPITOLO = 0;
  public static int PQSL_CF4WESITBIL6_ARTICOLO = 1;
  public static int PQSL_CF4WESITBIL6_DESCRIZIONE = 2;
  public static int PQSL_CF4WESITBIL6_STANZ_INI = 3;
  public static int PQSL_CF4WESITBIL6_VARIAZIONI = 4;
  public static int PQSL_CF4WESITBIL6_IMP_ACC_COMP = 5;
  public static int PQSL_CF4WESITBIL6_MAN_ORD_COMP = 6;
  public static int PQSL_CF4WESITBIL6_DISP = 7;
  public static int PQSL_CF4WESITBIL6_PROGR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL6_MAN_ORD_RES = 9;
  public static int PQSL_CF4WESITBIL6_DESCR_UO_GEST = 10;
  public static int PQSL_CF4WESITBIL6_PROGR_UO_LIVELLO_SUP = 11;
  public static int PQSL_CF4WESITBIL6_DESCR_UO_LIVELLO_SUP = 12;
  public static int PQSL_CF4WESITBIL6_RECORDRAGGRU = 13;
  public static int PQSL_CF4WESITBIL6_RECORDESCRUO = 14;
  public static int PQSL_CF4WESITBIL6_TITOLO = 15;
  public static int PQSL_CF4WESITBIL6_RECORDTITOLO = 16;
  public static int PQSL_CF4WESITBIL6_STN_RES = 17;
  public static int PQSL_CF4WESITBIL6_VAR_RES = 18;
  public static int PQSL_CF4WESITBIL6_IMP_ACC_RES = 19;
  public static int PQSL_CF4WESITBIL6_DESCR = 20;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL7 = 2765;
  public static int PQSL_CF4WESITBIL7_RISORSA_INTERVENTO = 0;
  public static int PQSL_CF4WESITBIL7_CAPITOLO = 1;
  public static int PQSL_CF4WESITBIL7_ARTICOLO = 2;
  public static int PQSL_CF4WESITBIL7_DESCRIZIONE = 3;
  public static int PQSL_CF4WESITBIL7_STANZ_INI = 4;
  public static int PQSL_CF4WESITBIL7_VARIAZIONI = 5;
  public static int PQSL_CF4WESITBIL7_IMP_ACC_COMP = 6;
  public static int PQSL_CF4WESITBIL7_MAN_ORD_COMP = 7;
  public static int PQSL_CF4WESITBIL7_DISP = 8;
  public static int PQSL_CF4WESITBIL7_PROGR_UO_GEST = 9;
  public static int PQSL_CF4WESITBIL7_MAN_ORD_RES = 10;
  public static int PQSL_CF4WESITBIL7_DESCR_UO_GEST = 11;
  public static int PQSL_CF4WESITBIL7_PROGR_UO_LIVELLO_SUP = 12;
  public static int PQSL_CF4WESITBIL7_DESCR_UO_LIVELLO_SUP = 13;
  public static int PQSL_CF4WESITBIL7_RECORDRAGGRU = 14;
  public static int PQSL_CF4WESITBIL7_RECORDESCRUO = 15;
  public static int PQSL_CF4WESITBIL7_TITOLO = 16;
  public static int PQSL_CF4WESITBIL7_RECORDTITOLO = 17;
  public static int PQSL_CF4WESITBIL7_STN_RES = 18;
  public static int PQSL_CF4WESITBIL7_VAR_RES = 19;
  public static int PQSL_CF4WESITBIL7_IMP_ACC_RES = 20;
  public static int PQSL_CF4WESITBIL7_IMPEGNABILE = 21;
  public static int PQSL_CF4WESITBIL7_LIQ_COMP = 22;
  public static int PQSL_CF4WESITBIL7_LIQ_RES = 23;
  public static int PQSL_CF4WESITBIL7_DESCR = 24;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM81 = 2766;
  public static int PQRY_PARAM81_RS = 2767;
  public static int PQSL_PARAM81_ROWNAMDESINT = 0;
  public static int PQSL_PARAM81_ROWNAMDESABB = 1;
  public static int PQSL_PARAM81_ROWNAMSOLCOM = 2;
  public static int PQSL_PARAM81_ROWNAMEINTER = 3;
  public static int PQSL_PARAM81_ROWNAMECAPIT = 4;
  public static int PQSL_PARAM81_ROWNAMEARTIC = 5;
  public static int PQSL_PARAM81_ROWNAMDATELA = 6;
  public static int PQSL_PARAM81_RONASOVPCAPU = 7;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL9 = 2768;
  public static int PQSL_CF4WESITBIL9_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBIL9_STANZ_INI = 1;
  public static int PQSL_CF4WESITBIL9_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBIL9_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBIL9_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBIL9_DISP = 5;
  public static int PQSL_CF4WESITBIL9_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBIL9_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBIL9_DESCR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL9_STN_RES = 9;
  public static int PQSL_CF4WESITBIL9_VAR_RES = 10;
  public static int PQSL_CF4WESITBIL9_IMP_ACC_RES = 11;
  public static int PQSL_CF4WESITBIL9_IMPEGNABILE = 12;
  public static int PQSL_CF4WESITBIL9_LIQ_COMP = 13;
  public static int PQSL_CF4WESITBIL9_LIQ_RES = 14;
  public static int PQSL_CF4WESITBIL9_CAPITOLO = 15;
  public static int PQSL_CF4WESITBIL9_ARTICOLO = 16;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBI10 = 2769;
  public static int PQSL_CF4WESITBI10_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBI10_STANZ_INI = 1;
  public static int PQSL_CF4WESITBI10_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBI10_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBI10_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBI10_DISP = 5;
  public static int PQSL_CF4WESITBI10_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBI10_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBI10_DESCR_UO_GEST = 8;
  public static int PQSL_CF4WESITBI10_STN_RES = 9;
  public static int PQSL_CF4WESITBI10_VAR_RES = 10;
  public static int PQSL_CF4WESITBI10_IMP_ACC_RES = 11;
  public static int PQSL_CF4WESITBI10_IMPEGNABILE = 12;
  public static int PQSL_CF4WESITBI10_LIQ_COMP = 13;
  public static int PQSL_CF4WESITBI10_LIQ_RES = 14;
  public static int PQSL_CF4WESITBI10_CAPITOLO = 15;
  public static int PQSL_CF4WESITBI10_ARTICOLO = 16;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL8 = 2770;
  public static int PQSL_CF4WESITBIL8_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBIL8_STANZ_INI = 1;
  public static int PQSL_CF4WESITBIL8_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBIL8_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBIL8_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBIL8_DISP = 5;
  public static int PQSL_CF4WESITBIL8_MAN_ORD_RES = 6;
  public static int PQSL_CF4WESITBIL8_DESCR_UO_GEST = 7;
  public static int PQSL_CF4WESITBIL8_STN_RES = 8;
  public static int PQSL_CF4WESITBIL8_VAR_RES = 9;
  public static int PQSL_CF4WESITBIL8_IMP_ACC_RES = 10;
  public static int PQSL_CF4WESITBIL8_IMPEGNABILE = 11;
  public static int PQSL_CF4WESITBIL8_LIQ_COMP = 12;
  public static int PQSL_CF4WESITBIL8_LIQ_RES = 13;
  public static int PQSL_CF4WESITBIL8_CAPITOLO = 14;
  public static int PQSL_CF4WESITBIL8_ARTICOLO = 15;
  public static int PQSL_CF4WESITBIL8_RECCF4SIBIES = 16;
  public static int PQSL_CF4WESITBIL8_RECORDTIPO = 17;
  public static int PQSL_CF4WESITBIL8_RECORVOCEPEG = 18;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI395 = 2771;
  public static int PQRY_PARAMETRI395_RS = 2772;
  public static int PQSL_PARAMETRI395_PARAMSITUPER = 0;
  public static int PQSL_PARAMETRI395_PARAMFUNZION = 1;
  public static int PQSL_PARAMETRI395_PARAMSERVIZI = 2;
  public static int PQSL_PARAMETRI395_PARASETTOPER = 3;
  public static int PQSL_PARAMETRI395_PARASERVOPER = 4;
  public static int PQSL_PARAMETRI395_PARACENDICOS = 5;
  public static int PQSL_PARAMETRI395_PARAMUOSUDDI = 6;
  public static int PQSL_PARAMETRI395_PARAMUOSOTTO = 7;
  public static int PQSL_PARAMETRI395_PARAMTITOLO = 8;
  public static int PQSL_PARAMETRI395_PARSOLRIPEIN = 9;
  public static int PQSL_PARAMETRI395_PARADATAELAB = 10;
  public static int PQSL_PARAMETRI395_PARATIPDISPE = 11;
  public static int PQSL_PARAMETRI395_PARAMINTERVE = 12;
  public static int PQSL_PARAMETRI395_PARADETTCAPI = 13;
  public static int PQSL_PARAMETRI395_PARADESCINT1 = 14;
  public static int PQSL_PARAMETRI395_PARADESCABBR = 15;
  public static int PQSL_PARAMETRI395_PARASOLOTOTA = 16;
  public static int PQSL_PARAMETRI395_PARASOLOCOMP = 17;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL4 = 2773;
  public static int PQSL_CF4WESITBIL4_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBIL4_STANZ_INI = 1;
  public static int PQSL_CF4WESITBIL4_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBIL4_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBIL4_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBIL4_DISP = 5;
  public static int PQSL_CF4WESITBIL4_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBIL4_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBIL4_DESCR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL4_PROGR_UO_LIVELLO_SUP = 9;
  public static int PQSL_CF4WESITBIL4_DESCR_UO_LIVELLO_SUP = 10;
  public static int PQSL_CF4WESITBIL4_RECORDRAGGRU = 11;
  public static int PQSL_CF4WESITBIL4_RECORDESCRUO = 12;
  public static int PQSL_CF4WESITBIL4_IMPEGNABILE = 13;
  public static int PQSL_CF4WESITBIL4_LIQ_COMP = 14;
  public static int PQSL_CF4WESITBIL4_LIQ_RES = 15;
  public static int PQSL_CF4WESITBIL4_RECORDTITOLO = 16;
  public static int PQSL_CF4WESITBIL4_TITOLO = 17;
  public static int PQSL_CF4WESITBIL4_RECOTIPDISPE = 18;
  public static int PQSL_CF4WESITBIL4_COD_INTERVENTO = 19;
  public static int PQSL_CF4WESITBIL4_RECODESCTITO = 20;
  public static int PQSL_CF4WESITBIL4_RECDESCODINT = 21;
  public static int PQSL_CF4WESITBIL4_RECORDESCCAP = 22;
  public static int PQSL_CF4WESITBIL4_RECCF4SICOBI = 23;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL1 = 2774;
  public static int PQSL_CF4WESITBIL1_CAPITOLO = 0;
  public static int PQSL_CF4WESITBIL1_ARTICOLO = 1;
  public static int PQSL_CF4WESITBIL1_DESCRIZIONE = 2;
  public static int PQSL_CF4WESITBIL1_STANZ_INI = 3;
  public static int PQSL_CF4WESITBIL1_VARIAZIONI = 4;
  public static int PQSL_CF4WESITBIL1_IMP_ACC_COMP = 5;
  public static int PQSL_CF4WESITBIL1_MAN_ORD_COMP = 6;
  public static int PQSL_CF4WESITBIL1_DISP = 7;
  public static int PQSL_CF4WESITBIL1_PROGR_UO_GEST = 8;
  public static int PQSL_CF4WESITBIL1_MAN_ORD_RES = 9;
  public static int PQSL_CF4WESITBIL1_DESCR_UO_GEST = 10;
  public static int PQSL_CF4WESITBIL1_PROGR_UO_LIVELLO_SUP = 11;
  public static int PQSL_CF4WESITBIL1_DESCR_UO_LIVELLO_SUP = 12;
  public static int PQSL_CF4WESITBIL1_RECORDRAGGRU = 13;
  public static int PQSL_CF4WESITBIL1_RECORDESCRUO = 14;
  public static int PQSL_CF4WESITBIL1_TITOLO = 15;
  public static int PQSL_CF4WESITBIL1_RECORDTITOLO = 16;
  public static int PQSL_CF4WESITBIL1_STN_RES = 17;
  public static int PQSL_CF4WESITBIL1_VAR_RES = 18;
  public static int PQSL_CF4WESITBIL1_IMP_ACC_RES = 19;
  public static int PQSL_CF4WESITBIL1_IMPEGNABILE = 20;
  public static int PQSL_CF4WESITBIL1_LIQ_COMP = 21;
  public static int PQSL_CF4WESITBIL1_LIQ_RES = 22;
  public static int PQSL_CF4WESITBIL1_RECOTIPDISPE = 23;
  public static int PQSL_CF4WESITBIL1_RECODESCTITO = 24;
  public static int PQSL_CF4WESITBIL1_RECDESCODINT = 25;
  public static int PQSL_CF4WESITBIL1_RECORDESCCAP = 26;
  public static int PQSL_CF4WESITBIL1_RECORDDESCR = 27;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBILA = 2775;
  public static int PQSL_CF4WESITBILA_DESCRIZIONE = 0;
  public static int PQSL_CF4WESITBILA_STANZ_INI = 1;
  public static int PQSL_CF4WESITBILA_VARIAZIONI = 2;
  public static int PQSL_CF4WESITBILA_IMP_ACC_COMP = 3;
  public static int PQSL_CF4WESITBILA_MAN_ORD_COMP = 4;
  public static int PQSL_CF4WESITBILA_DISP = 5;
  public static int PQSL_CF4WESITBILA_PROGR_UO_GEST = 6;
  public static int PQSL_CF4WESITBILA_MAN_ORD_RES = 7;
  public static int PQSL_CF4WESITBILA_RECORDRAGGRU = 8;
  public static int PQSL_CF4WESITBILA_RECORDESCRUO = 9;
  public static int PQSL_CF4WESITBILA_STN_RES = 10;
  public static int PQSL_CF4WESITBILA_VAR_RES = 11;
  public static int PQSL_CF4WESITBILA_IMP_ACC_RES = 12;
  public static int PQSL_CF4WESITBILA_IMPEGNABILE = 13;
  public static int PQSL_CF4WESITBILA_LIQ_COMP = 14;
  public static int PQSL_CF4WESITBILA_LIQ_RES = 15;
  public static int PQSL_CF4WESITBILA_RECOTIPDISPE = 16;
  public static int PQSL_CF4WESITBILA_RECODESCTITO = 17;
  public static int PQSL_CF4WESITBILA_RECDESCODINT = 18;
  public static int PQSL_CF4WESITBILA_RECORDESCCAP = 19;
  public static int PQSL_CF4WESITBILA_GROUP1 = 20;
  public static int PQSL_CF4WESITBILA_RECCF4SIBITI = 21;
  public static int PQSL_CF4WESITBILA_RECFSIBICOIN = 22;
  public static int PQSL_CF4WESITBILA_RECCF4SIBICA = 23;

  // Table to contain panel selected row: CF4WEB SIT BILANCIO
  //
  public static int PQRY_CF4WESITBIL3 = 2776;
  public static int PQSL_CF4WESITBIL3_STANZ_INI = 0;
  public static int PQSL_CF4WESITBIL3_VARIAZIONI = 1;
  public static int PQSL_CF4WESITBIL3_IMP_ACC_COMP = 2;
  public static int PQSL_CF4WESITBIL3_MAN_ORD_COMP = 3;
  public static int PQSL_CF4WESITBIL3_DISP = 4;
  public static int PQSL_CF4WESITBIL3_MAN_ORD_RES = 5;
  public static int PQSL_CF4WESITBIL3_RECORDESCRUO = 6;
  public static int PQSL_CF4WESITBIL3_IMPEGNABILE = 7;
  public static int PQSL_CF4WESITBIL3_LIQ_COMP = 8;
  public static int PQSL_CF4WESITBIL3_LIQ_RES = 9;
  public static int PQSL_CF4WESITBIL3_RECOTIPDISPE = 10;
  public static int PQSL_CF4WESITBIL3_RECODESCTITO = 11;
  public static int PQSL_CF4WESITBIL3_RECDESCODINT = 12;
  public static int PQSL_CF4WESITBIL3_RECORDESCCAP = 13;
  public static int PQSL_CF4WESITBIL3_RECORDGROUP = 14;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT10 = 2777;
  public static int PQRY_PERSIT10_RS = 2778;
  public static int PQSL_PERSIT10_NOMEOGGEMISS = 0;
  public static int PQSL_PERSIT10_NOMEOGGEPROG = 1;
  public static int PQSL_PERSIT10_NOMOGGSOLCOM = 2;
  public static int PQSL_PERSIT10_NOMOGGDATELA = 3;
  public static int PQSL_PERSIT10_NOMOGGSOCAIM = 4;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS53 = 2779;
  public static int PQRY_PARS53_RS = 2780;
  public static int PQSL_PARS53_NOMEOGGESTAN = 0;
  public static int PQSL_PARS53_NOMEOGGEDISP = 1;
  public static int PQSL_PARS53_NOMOGGTIPBIL = 2;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT8 = 2781;
  public static int PQRY_PERSIT8_RS = 2782;
  public static int PQSL_PERSIT8_NOMEOGGEMISS = 0;
  public static int PQSL_PERSIT8_NOMEOGGEPROG = 1;
  public static int PQSL_PERSIT8_NOMEOGGETITO = 2;
  public static int PQSL_PERSIT8_NOMOGGDETCAP = 3;
  public static int PQSL_PERSIT8_NOMOGGSOLCOM = 4;
  public static int PQSL_PERSIT8_NOMOGGDESABB = 5;
  public static int PQSL_PERSIT8_NOMOGGDATELA = 6;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT2 = 2783;
  public static int PQRY_PERSIT2_RS = 2784;
  public static int PQSL_PERSIT2_NOMEOGGEMISS = 0;
  public static int PQSL_PERSIT2_NOMEOGGEPROG = 1;
  public static int PQSL_PERSIT2_NOMEOGGETITO = 2;
  public static int PQSL_PERSIT2_NOMOGGDETCAP = 3;
  public static int PQSL_PERSIT2_NOMOGGSOLCOM = 4;
  public static int PQSL_PERSIT2_NOMOGGDESABB = 5;
  public static int PQSL_PERSIT2_NOMOGGDATELA = 6;
  public static int PQSL_PERSIT2_NOMEOGGEMACR = 7;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT4 = 2785;
  public static int PQRY_PERSIT4_RS = 2786;
  public static int PQSL_PERSIT4_NOMEOGGETITO = 0;
  public static int PQSL_PERSIT4_NOMEOGGETIPO = 1;
  public static int PQSL_PERSIT4_NOMOGGDETCAP = 2;
  public static int PQSL_PERSIT4_NOMOGGSOLCOM = 3;
  public static int PQSL_PERSIT4_NOMOGGDESABB = 4;
  public static int PQSL_PERSIT4_NOMOGGDATELA = 5;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT6 = 2787;
  public static int PQRY_PERSIT6_RS = 2788;
  public static int PQSL_PERSIT6_NOMEOGGETITO = 0;
  public static int PQSL_PERSIT6_NOMEOGGEMACR = 1;
  public static int PQSL_PERSIT6_NOMOGGDETCAP = 2;
  public static int PQSL_PERSIT6_NOMOGGSOLCOM = 3;
  public static int PQSL_PERSIT6_NOMOGGDESABB = 4;
  public static int PQSL_PERSIT6_NOMOGGDATELA = 5;
  public static int PQSL_PERSIT6_NOMEOGGETTES = 6;

  // Table to contain panel selected row: Per Sit
  //
  public static int PQRY_PERSIT1 = 2789;
  public static int PQRY_PERSIT1_RS = 2790;
  public static int PQSL_PERSIT1_NOMOGGDETCAP = 0;
  public static int PQSL_PERSIT1_NOMOGGSOLCOM = 1;
  public static int PQSL_PERSIT1_NOMOGGTOPETI = 2;
  public static int PQSL_PERSIT1_NOMOGGDESABB = 3;
  public static int PQSL_PERSIT1_NOMOGGDATELA = 4;
  public static int PQSL_PERSIT1_NOMEOGGETTES = 5;
  public static int PQSL_PERSIT1_NOMEOGGEFLES = 6;
  public static int PQSL_PERSIT1_NOMOGGTIPVIN = 7;
  public static int PQSL_PERSIT1_NOMOGUOSUOUT = 8;
  public static int PQSL_PERSIT1_NOOGSIPEQUUO = 9;
  public static int PQSL_PERSIT1_NOMEOGGUOGES = 10;
  public static int PQSL_PERSIT1_NOMOGGUOSUP2 = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI434 = 2791;
  public static int PQRY_PARAMETRI434_RS = 2792;
  public static int PQSL_PARAMETRI434_NOMEOGGETTES = 0;
  public static int PQSL_PARAMETRI434_NOMOGGUNIORG = 1;
  public static int PQSL_PARAMETRI434_NOMEOGGETITO = 2;
  public static int PQSL_PARAMETRI434_NOMOGGDATELA = 3;

  // Table to contain panel selected row: WRK SIT STN CASSA
  //
  public static int PQRY_WRKSITSTNCA1 = 2793;
  public static int PQSL_WRKSITSTNCA1_WRSISTCASEID = 0;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCAPR = 1;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCACA = 2;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCAAR = 3;
  public static int PQSL_WRKSITSTNCA1_WRSISTCASTCO = 4;
  public static int PQSL_WRKSITSTNCA1_WRSISTCAREIN = 5;
  public static int PQSL_WRKSITSTNCA1_WRSISTCAREAT = 6;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTSTCA = 7;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCAMA = 8;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCADI = 9;
  public static int PQSL_WRKSITSTNCA1_WRSISTCAUNOR = 10;
  public static int PQSL_WRKSITSTNCA1_WRSISTCAINCA = 11;
  public static int PQSL_WRKSITSTNCA1_WRKSITSTCAES = 12;
  public static int PQSL_WRKSITSTNCA1_WRSISTCAELIM = 13;
  public static int PQSL_WRKSITSTNCA1_NUOVAESPRESS = 14;

  // Table to contain panel selected row: Totali
  //
  public static int PQRY_TOTALI3 = 2794;
  public static int PQRY_TOTALI3_RS = 2795;
  public static int PQSL_TOTALI3_NOMOGGSTNCOM = 0;
  public static int PQSL_TOTALI3_NOMOGGRESINI = 1;
  public static int PQSL_TOTALI3_NOMOGGRESATT = 2;
  public static int PQSL_TOTALI3_NOMOGGSTNCAS = 3;
  public static int PQSL_TOTALI3_NOMEOGGEMAND = 4;
  public static int PQSL_TOTALI3_NOMEOGGEDISP = 5;

  // Table to contain panel selected row: WRK SIT STN CASSA
  //
  public static int PQRY_WRKSITSTNCAS = 2796;
  public static int PQSL_WRKSITSTNCAS_WRSISTCASEID = 0;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCAPR = 1;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCACA = 2;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCAAR = 3;
  public static int PQSL_WRKSITSTNCAS_WRSISTCASTCO = 4;
  public static int PQSL_WRKSITSTNCAS_WRSISTCAREIN = 5;
  public static int PQSL_WRKSITSTNCAS_WRSISTCAREAT = 6;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTSTCA = 7;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCAMA = 8;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCADI = 9;
  public static int PQSL_WRKSITSTNCAS_WRSISTCAUNOR = 10;
  public static int PQSL_WRKSITSTNCAS_WRSISTCAINCA = 11;
  public static int PQSL_WRKSITSTNCAS_WRKSITSTCAES = 12;
  public static int PQSL_WRKSITSTNCAS_WRSISTCAELIM = 13;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOU3 = 2797;
  public static int PQSL_VISIMPSUUOU3_CAPITOLO = 0;
  public static int PQSL_VISIMPSUUOU3_ARTICOLO = 1;
  public static int PQSL_VISIMPSUUOU3_ANNO_IMP = 2;
  public static int PQSL_VISIMPSUUOU3_NUMERO_IMP = 3;
  public static int PQSL_VISIMPSUUOU3_ANNO_DEL = 4;
  public static int PQSL_VISIMPSUUOU3_NUMERO_DEL = 5;
  public static int PQSL_VISIMPSUUOU3_SEDE_DEL = 6;
  public static int PQSL_VISIMPSUUOU3_DATA_REG = 7;
  public static int PQSL_VISIMPSUUOU3_DESCRIZIONE = 8;
  public static int PQSL_VISIMPSUUOU3_ANNO_PROPOSTA = 9;
  public static int PQSL_VISIMPSUUOU3_UNITA_PROPONENTE = 10;
  public static int PQSL_VISIMPSUUOU3_NUMERO_PROPOSTA = 11;
  public static int PQSL_VISIMPSUUOU3_DISP_FIN = 12;
  public static int PQSL_VISIMPSUUOU3_DISPONIBILITA = 13;
  public static int PQSL_VISIMPSUUOU3_IMPEGNO_OBBLIG = 14;
  public static int PQSL_VISIMPSUUOU3_BENEFICIARIO = 15;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUBRSEE = 16;
  public static int PQSL_VISIMPSUUOU3_ANNO_SUBIMP = 17;
  public static int PQSL_VISIMPSUUOU3_NUMERO_SUBIMP = 18;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTASIO = 19;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTNSIO = 20;
  public static int PQSL_VISIMPSUUOU3_IMPORTO = 21;
  public static int PQSL_VISIMPSUUOU3_SUBIMPEGNATO = 22;
  public static int PQSL_VISIMPSUUOU3_MANDATI = 23;
  public static int PQSL_VISIMPSUUOU3_VISIMPUOUTLI = 24;
  public static int PQSL_VISIMPSUUOU3_PRENOTAZIONE = 25;
  public static int PQSL_VISIMPSUUOU3_ESERCIZIO = 26;
  public static int PQSL_VISIMPSUUOU3_VIIMVIISUUCC = 27;
  public static int PQSL_VISIMPSUUOU3_VIIMVISUUCL5 = 28;
  public static int PQSL_VISIMPSUUOU3_VIIMVIISUUCE = 29;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTANIP = 30;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTNUIP = 31;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTANSP = 32;
  public static int PQSL_VISIMPSUUOU3_VIIMUOUTNUSP = 33;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI441 = 2798;
  public static int PQRY_PARAMETRI441_RS = 2799;
  public static int PQSL_PARAMETRI441_ROWNAMEDAL = 0;
  public static int PQSL_PARAMETRI441_ROWNAMSUBIMP = 1;

  // Table to contain panel selected row: VISTA IMP SUB UO UT
  //
  public static int PQRY_VISIMPSUUOU4 = 2800;
  public static int PQSL_VISIMPSUUOU4_CAPITOLO = 0;
  public static int PQSL_VISIMPSUUOU4_ARTICOLO = 1;
  public static int PQSL_VISIMPSUUOU4_ANNO_IMP = 2;
  public static int PQSL_VISIMPSUUOU4_NUMERO_IMP = 3;
  public static int PQSL_VISIMPSUUOU4_ANNO_DEL = 4;
  public static int PQSL_VISIMPSUUOU4_NUMERO_DEL = 5;
  public static int PQSL_VISIMPSUUOU4_SEDE_DEL = 6;
  public static int PQSL_VISIMPSUUOU4_DATA_REG = 7;
  public static int PQSL_VISIMPSUUOU4_DESCRIZIONE = 8;
  public static int PQSL_VISIMPSUUOU4_ANNO_PROPOSTA = 9;
  public static int PQSL_VISIMPSUUOU4_UNITA_PROPONENTE = 10;
  public static int PQSL_VISIMPSUUOU4_NUMERO_PROPOSTA = 11;
  public static int PQSL_VISIMPSUUOU4_IMPEGNO_OBBLIG = 12;
  public static int PQSL_VISIMPSUUOU4_BENEFICIARIO = 13;
  public static int PQSL_VISIMPSUUOU4_ANNO_SUBIMP = 14;
  public static int PQSL_VISIMPSUUOU4_NUMERO_SUBIMP = 15;
  public static int PQSL_VISIMPSUUOU4_VIIMSUUUVPEG = 16;
  public static int PQSL_VISIMPSUUOU4_IMPORTO = 17;
  public static int PQSL_VISIMPSUUOU4_SUBIMPEGNATO = 18;
  public static int PQSL_VISIMPSUUOU4_VIIMSUUOUTLI = 19;
  public static int PQSL_VISIMPSUUOU4_MANDATI = 20;
  public static int PQSL_VISIMPSUUOU4_DISPONIBILITA = 21;
  public static int PQSL_VISIMPSUUOU4_VIIMSUUBRSEE = 22;
  public static int PQSL_VISIMPSUUOU4_VIIMSUUOUTOI = 23;
  public static int PQSL_VISIMPSUUOU4_VIIMSUUOUOSI = 24;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE2 = 2801;
  public static int PQSL_VISTAACCELE2_CAPITOLO = 0;
  public static int PQSL_VISTAACCELE2_ARTICOLO = 1;
  public static int PQSL_VISTAACCELE2_ANNO_ACC = 2;
  public static int PQSL_VISTAACCELE2_NUMERO_ACC = 3;
  public static int PQSL_VISTAACCELE2_VISACCELINAC = 4;
  public static int PQSL_VISTAACCELE2_ANNO_DEL = 5;
  public static int PQSL_VISTAACCELE2_NUMERO_DEL = 6;
  public static int PQSL_VISTAACCELE2_SEDE_DEL = 7;
  public static int PQSL_VISTAACCELE2_DATA_REG = 8;
  public static int PQSL_VISTAACCELE2_DESCRIZIONE = 9;
  public static int PQSL_VISTAACCELE2_DEBITORE = 10;
  public static int PQSL_VISTAACCELE2_VIACELBERSEE = 11;
  public static int PQSL_VISTAACCELE2_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE2_ANNO_PROPOSTA = 13;
  public static int PQSL_VISTAACCELE2_UNITA_PROPONENTE = 14;
  public static int PQSL_VISTAACCELE2_NUMERO_PROPOSTA = 15;
  public static int PQSL_VISTAACCELE2_ORDINATIVI = 16;
  public static int PQSL_VISTAACCELE2_DISPONIBILITA = 17;
  public static int PQSL_VISTAACCELE2_VISACCELEFIN = 18;
  public static int PQSL_VISTAACCELE2_ESERCIZIO = 19;
  public static int PQSL_VISTAACCELE2_VISACELCOLI5 = 20;
  public static int PQSL_VISTAACCELE2_VISACCELCOEU = 21;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI443 = 2802;
  public static int PQRY_PARAMETRI443_RS = 2803;
  public static int PQSL_PARAMETRI443_PARAMDAL = 0;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE3 = 2804;
  public static int PQSL_VISTAACCELE3_CAPITOLO = 0;
  public static int PQSL_VISTAACCELE3_ARTICOLO = 1;
  public static int PQSL_VISTAACCELE3_ANNO_ACC = 2;
  public static int PQSL_VISTAACCELE3_NUMERO_ACC = 3;
  public static int PQSL_VISTAACCELE3_ANNO_DEL = 4;
  public static int PQSL_VISTAACCELE3_NUMERO_DEL = 5;
  public static int PQSL_VISTAACCELE3_SEDE_DEL = 6;
  public static int PQSL_VISTAACCELE3_VISACELVOPEG = 7;
  public static int PQSL_VISTAACCELE3_VISACCELEACC = 8;
  public static int PQSL_VISTAACCELE3_DATA_REG = 9;
  public static int PQSL_VISTAACCELE3_DESCRIZIONE = 10;
  public static int PQSL_VISTAACCELE3_VISACCELEDEL = 11;
  public static int PQSL_VISTAACCELE3_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE3_ORDINATIVI = 13;
  public static int PQSL_VISTAACCELE3_DISPONIBILITA = 14;
  public static int PQSL_VISTAACCELE3_DEBITORE = 15;
  public static int PQSL_VISTAACCELE3_ANNO_PROPOSTA = 16;
  public static int PQSL_VISTAACCELE3_UNITA_PROPONENTE = 17;
  public static int PQSL_VISTAACCELE3_NUMERO_PROPOSTA = 18;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM128 = 2805;
  public static int PQRY_PARAM128_RS = 2806;
  public static int PQSL_PARAM128_PARAPARTACCA = 0;
  public static int PQSL_PARAM128_PARAPARTVINC = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM163 = 2807;
  public static int PQRY_PARAM163_RS = 2808;
  public static int PQSL_PARAM163_PARAPARTACCA = 0;
  public static int PQSL_PARAM163_PARAPARTVINC = 1;
  public static int PQSL_PARAM163_PARUTIQUOVIN = 2;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM184 = 2809;
  public static int PQRY_PARAM184_RS = 2810;
  public static int PQSL_PARAM184_PARATIPOELAB = 0;

  // Table to contain panel selected row: QUADRI CERTIFICATO
  //
  public static int PQRY_QUADRICERTI1 = 2811;
  public static int PQSL_QUADRICERTI1_PROGRESSIVO = 0;
  public static int PQSL_QUADRICERTI1_TIPO_CERTIFICATO = 1;
  public static int PQSL_QUADRICERTI1_ESERCIZIO = 2;
  public static int PQSL_QUADRICERTI1_QUADRO = 3;
  public static int PQSL_QUADRICERTI1_DESCRIZIONE = 4;
  public static int PQSL_QUADRICERTI1_PROCEDURA = 5;
  public static int PQSL_QUADRICERTI1_DATA_RICALCOLO = 6;
  public static int PQSL_QUADRICERTI1_NOTE = 7;
  public static int PQSL_QUADRICERTI1_RIF_QUADRO = 8;
  public static int PQSL_QUADRICERTI1_FONTE = 9;
  public static int PQSL_QUADRICERTI1_PROGR_SESSIONE = 10;
  public static int PQSL_QUADRICERTI1_PROCEDURA_STAMPA = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI580 = 2812;
  public static int PQRY_PARAMETRI580_RS = 2813;
  public static int PQSL_PARAMETRI580_PARAMQUADRO = 0;
  public static int PQSL_PARAMETRI580_PARAMCODICE = 1;
  public static int PQSL_PARAMETRI580_PARAESCLTOTA = 2;
  public static int PQSL_PARAMETRI580_PARAATTRQUAD = 3;

  // Table to contain panel selected row: Certificato
  //
  public static int PQRY_CERTIFICATO1 = 2814;
  public static int PQRY_CERTIFICATO1_RS = 2815;
  public static int PQSL_CERTIFICATO1_QUADRO = 0;
  public static int PQSL_CERTIFICATO1_RIF_QUADRO = 1;
  public static int PQSL_CERTIFICATO1_GRUPPOQUADRO = 2;
  public static int PQSL_CERTIFICATO1_CODICE = 3;
  public static int PQSL_CERTIFICATO1_TIPO_RIGA = 4;
  public static int PQSL_CERTIFICATO1_NUM_COLONNE = 5;
  public static int PQSL_CERTIFICATO1_DESCRIZIONE_1 = 6;
  public static int PQSL_CERTIFICATO1_DESCRIZIONE_2 = 7;
  public static int PQSL_CERTIFICATO1_VALORE_1 = 8;
  public static int PQSL_CERTIFICATO1_VALORE_2 = 9;
  public static int PQSL_CERTIFICATO1_VALORE_3 = 10;
  public static int PQSL_CERTIFICATO1_VALORE_4 = 11;
  public static int PQSL_CERTIFICATO1_VALORE_5 = 12;
  public static int PQSL_CERTIFICATO1_VALORE_6 = 13;
  public static int PQSL_CERTIFICATO1_VALORE_7 = 14;
  public static int PQSL_CERTIFICATO1_VALORE_8 = 15;
  public static int PQSL_CERTIFICATO1_VALORE_9 = 16;
  public static int PQSL_CERTIFICATO1_VALORE_10 = 17;
  public static int PQSL_CERTIFICATO1_VALORE_11 = 18;
  public static int PQSL_CERTIFICATO1_VALORE_12 = 19;
  public static int PQSL_CERTIFICATO1_VALORE_13 = 20;
  public static int PQSL_CERTIFICATO1_VALORE_14 = 21;
  public static int PQSL_CERTIFICATO1_VALORE_15 = 22;
  public static int PQSL_CERTIFICATO1_CERTIFISTATO = 23;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI581 = 2816;
  public static int PQRY_PARAMETRI581_RS = 2817;
  public static int PQSL_PARAMETRI581_PARATIPOGENE = 0;

  // Recordset for query: Certificato
  //
  public static int QRY_CERTIFICATO2 = 2818;
  public static int QSL_CERTIFICATO2_CODICE = 0;
  public static int QSL_CERTIFICATO2_VALORE1 = 1;
  public static int QSL_CERTIFICATO2_VALORE2 = 2;
  public static int QSL_CERTIFICATO2_VALORE3 = 3;
  public static int QSL_CERTIFICATO2_VALORE4 = 4;
  public static int QSL_CERTIFICATO2_VALORE5 = 5;
  public static int QSL_CERTIFICATO2_VALORE6 = 6;
  public static int QSL_CERTIFICATO2_VALORE7 = 7;
  public static int QSL_CERTIFICATO2_VALORE8 = 8;
  public static int QSL_CERTIFICATO2_VALORE9 = 9;
  public static int QSL_CERTIFICATO2_VALORE10 = 10;
  public static int QSL_CERTIFICATO2_VALORE11 = 11;
  public static int QSL_CERTIFICATO2_VALORE12 = 12;
  public static int QSL_CERTIFICATO2_VALORE13 = 13;
  public static int QSL_CERTIFICATO2_VALORE14 = 14;
  public static int QSL_CERTIFICATO2_VALORE15 = 15;
  public static int QSL_CERTIFICATO2_QUADRO = 16;
  public static int QSL_CERTIFICATO2_DESCRIQUADRO = 17;
  public static int QSL_CERTIFICATO2_NUMCOLONNE = 18;
  public static int QSL_CERTIFICATO2_TIPORIGA = 19;
  public static int QSL_CERTIFICATO2_DESCRIZIONE1 = 20;
  public static int QSL_CERTIFICATO2_DESCRIZIONE2 = 21;
  public static int QSL_CERTIFICATO2_VALORE1OLD = 22;
  public static int QSL_CERTIFICATO2_VALORE2OLD = 23;
  public static int QSL_CERTIFICATO2_VALORE3OLD = 24;
  public static int QSL_CERTIFICATO2_VALORE4OLD = 25;
  public static int QSL_CERTIFICATO2_VALORE5OLD = 26;
  public static int QSL_CERTIFICATO2_VALORE6OLD = 27;
  public static int QSL_CERTIFICATO2_VALORE7OLD = 28;
  public static int QSL_CERTIFICATO2_VALORE8OLD = 29;
  public static int QSL_CERTIFICATO2_VALORE9OLD = 30;
  public static int QSL_CERTIFICATO2_VALORE10OLD = 31;
  public static int QSL_CERTIFICATO2_VALORE11OLD = 32;
  public static int QSL_CERTIFICATO2_VALORE12OLD = 33;
  public static int QSL_CERTIFICATO2_VALORE13OLD = 34;
  public static int QSL_CERTIFICATO2_VALORE14OLD = 35;
  public static int QSL_CERTIFICATO2_VALORE15OLD = 36;
  public static int QSL_CERTIFICATO2_CERTIRIFQUAD = 37;
  public static int QSL_CERTIFICATO2_CERTPROGQUAD = 38;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA7 = 2819;
  public static int QSL_CFASELINTVA7_COUNT = 0;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION8 = 2820;
  public static int PQSL_NOTEFUNZION8_MODULO = 0;
  public static int PQSL_NOTEFUNZION8_PAGINA = 1;
  public static int PQSL_NOTEFUNZION8_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION8_DESCRIZIONE = 3;

  // Table to contain panel selected row: STRUTTURA CERTIFICATO
  //
  public static int PQRY_STRUTTCERTIF = 2821;
  public static int PQSL_STRUTTCERTIF_STRUCERTPROG = 0;
  public static int PQSL_STRUTTCERTIF_STRUTIPOCERT = 1;
  public static int PQSL_STRUTTCERTIF_STRUCERTESER = 2;
  public static int PQSL_STRUTTCERTIF_STRUCERTQUAD = 3;
  public static int PQSL_STRUTTCERTIF_STRUCERTCODI = 4;
  public static int PQSL_STRUTTCERTIF_STRCERTIPRIG = 5;
  public static int PQSL_STRUTTCERTIF_STRUCERTDES1 = 6;
  public static int PQSL_STRUTTCERTIF_STRUCERTDES2 = 7;
  public static int PQSL_STRUTTCERTIF_STRCERNUMCOL = 8;
  public static int PQSL_STRUTTCERTIF_STRCERCODTOT = 9;
  public static int PQSL_STRUTTCERTIF_STRUCERTSEGN = 10;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM182 = 2822;
  public static int PQRY_PARAM182_RS = 2823;
  public static int PQSL_PARAM182_PARAPROGBDAP = 0;

  // Table to contain panel selected row: TIPI BDAP
  //
  public static int PQRY_TIPIBDAP = 2824;
  public static int PQSL_TIPIBDAP_TIPIBDAPINFO = 0;
  public static int PQSL_TIPIBDAP_TIPTIPTIPBDA = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM178 = 2825;
  public static int PQRY_PARAM178_RS = 2826;
  public static int PQSL_PARAM178_PARATIPOELAB = 0;
  public static int PQSL_PARAM178_PARAPROGBDAP = 1;

  // Table to contain panel selected row: BDAP SCHEMI
  //
  public static int PQRY_BDAPSCHEMI = 2827;
  public static int PQSL_BDAPSCHEMI_PROGRESSIVO = 0;
  public static int PQSL_BDAPSCHEMI_ORDINAMENTO = 1;
  public static int PQSL_BDAPSCHEMI_DESCRIZIONE = 2;
  public static int PQSL_BDAPSCHEMI_DATA_RICALCOLO = 3;
  public static int PQSL_BDAPSCHEMI_BDASCHTITIBD = 4;
  public static int PQSL_BDAPSCHEMI_SCHEMA_BILANCIO = 5;
  public static int PQSL_BDAPSCHEMI_FONTE = 6;
  public static int PQSL_BDAPSCHEMI_PROGR_SESSIONE = 7;
  public static int PQSL_BDAPSCHEMI_PROCEDURA_STAMPA = 8;

  // Table to contain panel selected row: BDAP DCAREND S PREV
  //
  public static int PQRY_BDAPDCARSPR1 = 2828;
  public static int PQSL_BDAPDCARSPR1_ESERCIZIO = 0;
  public static int PQSL_BDAPDCARSPR1_LIVELLO_4 = 1;
  public static int PQSL_BDAPDCARSPR1_MISSIONE = 2;
  public static int PQSL_BDAPDCARSPR1_PROGRAMMA = 3;
  public static int PQSL_BDAPDCARSPR1_RESIDUI_PASSIVI_INI = 4;
  public static int PQSL_BDAPDCARSPR1_PREV_DEF_COMPETENZA = 5;
  public static int PQSL_BDAPDCARSPR1_PREV_DEF_CASSA = 6;
  public static int PQSL_BDAPDCARSPR1_RIACC_RESIDUI_PASSIVI = 7;
  public static int PQSL_BDAPDCARSPR1_UTENTE_INSERIMENTO = 8;
  public static int PQSL_BDAPDCARSPR1_DATA_INSERIMENTO = 9;
  public static int PQSL_BDAPDCARSPR1_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_BDAPDCARSPR1_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: BDAP DCAREND E PREV
  //
  public static int PQRY_BDAPDCAREPRE = 2829;
  public static int PQSL_BDAPDCAREPRE_ESERCIZIO = 0;
  public static int PQSL_BDAPDCAREPRE_LIVELLO_4 = 1;
  public static int PQSL_BDAPDCAREPRE_RESIDUI_INIZIALI = 2;
  public static int PQSL_BDAPDCAREPRE_PREV_DEF_COMPETENZA = 3;
  public static int PQSL_BDAPDCAREPRE_PREV_DEF_CASSA = 4;
  public static int PQSL_BDAPDCAREPRE_RIACC_RESIDUI_ATTIVI = 5;
  public static int PQSL_BDAPDCAREPRE_UTENTE_INSERIMENTO = 6;
  public static int PQSL_BDAPDCAREPRE_DATA_INSERIMENTO = 7;
  public static int PQSL_BDAPDCAREPRE_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_BDAPDCAREPRE_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: BDAP DCAREND S GEST
  //
  public static int PQRY_BDAPDCARSGES = 2830;
  public static int PQSL_BDAPDCARSGES_ESERCIZIO = 0;
  public static int PQSL_BDAPDCARSGES_MISSIONE = 1;
  public static int PQSL_BDAPDCARSGES_PROGRAMMA = 2;
  public static int PQSL_BDAPDCARSGES_COFOG = 3;
  public static int PQSL_BDAPDCARSGES_LIVELLO_5 = 4;
  public static int PQSL_BDAPDCARSGES_CODICE_EUROPEO = 5;
  public static int PQSL_BDAPDCARSGES_SPESA_RICORRENTE = 6;
  public static int PQSL_BDAPDCARSGES_CUP = 7;
  public static int PQSL_BDAPDCARSGES_IMPEGNATO_COMP = 8;
  public static int PQSL_BDAPDCARSGES_FPV = 9;
  public static int PQSL_BDAPDCARSGES_PAGATO_RES = 10;
  public static int PQSL_BDAPDCARSGES_PAGATO_COMP = 11;
  public static int PQSL_BDAPDCARSGES_UTENTE_INSERIMENTO = 12;
  public static int PQSL_BDAPDCARSGES_DATA_INSERIMENTO = 13;
  public static int PQSL_BDAPDCARSGES_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_BDAPDCARSGES_DATA_ULTIMO_AGG = 15;
  public static int PQSL_BDAPDCARSGES_ORDLIVELLO5 = 16;

  // Table to contain panel selected row: BDAP DCAREND E GEST
  //
  public static int PQRY_BDAPDCAREGES = 2831;
  public static int PQSL_BDAPDCAREGES_ESERCIZIO = 0;
  public static int PQSL_BDAPDCAREGES_LIVELLO_5 = 1;
  public static int PQSL_BDAPDCAREGES_CODICE_EUROPEO = 2;
  public static int PQSL_BDAPDCAREGES_ENTRATA_RICORRENTE = 3;
  public static int PQSL_BDAPDCAREGES_ACCERTAMENTI = 4;
  public static int PQSL_BDAPDCAREGES_RISCOSSIONI_COMP = 5;
  public static int PQSL_BDAPDCAREGES_RISCOSSIONI_RES = 6;
  public static int PQSL_BDAPDCAREGES_UTENTE_INSERIMENTO = 7;
  public static int PQSL_BDAPDCAREGES_DATA_INSERIMENTO = 8;
  public static int PQSL_BDAPDCAREGES_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_BDAPDCAREGES_DATA_ULTIMO_AGG = 10;
  public static int PQSL_BDAPDCAREGES_ORDLIVELLO5 = 11;

  // Table to contain panel selected row: BDAP DCAREND SP
  //
  public static int PQRY_BDAPDCARENSP = 2832;
  public static int PQSL_BDAPDCARENSP_ESERCIZIO = 0;
  public static int PQSL_BDAPDCARENSP_LIVELLO_7 = 1;
  public static int PQSL_BDAPDCARENSP_DARE = 2;
  public static int PQSL_BDAPDCARENSP_AVERE = 3;
  public static int PQSL_BDAPDCARENSP_UTENTE_INSERIMENTO = 4;
  public static int PQSL_BDAPDCARENSP_DATA_INSERIMENTO = 5;
  public static int PQSL_BDAPDCARENSP_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_BDAPDCARENSP_DATA_ULTIMO_AGG = 7;
  public static int PQSL_BDAPDCARENSP_SALDOEXPRESS = 8;

  // Table to contain panel selected row: BDAP DCAREND CE
  //
  public static int PQRY_BDAPDCARENCE = 2833;
  public static int PQSL_BDAPDCARENCE_ESERCIZIO = 0;
  public static int PQSL_BDAPDCARENCE_MISSIONE = 1;
  public static int PQSL_BDAPDCARENCE_PROGRAMMA = 2;
  public static int PQSL_BDAPDCARENCE_LIVELLO_6 = 3;
  public static int PQSL_BDAPDCARENCE_DARE = 4;
  public static int PQSL_BDAPDCARENCE_AVERE = 5;
  public static int PQSL_BDAPDCARENCE_UTENTE_INSERIMENTO = 6;
  public static int PQSL_BDAPDCARENCE_DATA_INSERIMENTO = 7;
  public static int PQSL_BDAPDCARENCE_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_BDAPDCARENCE_DATA_ULTIMO_AGG = 9;
  public static int PQSL_BDAPDCARENCE_SALDO = 10;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI632 = 2834;

  // Table to contain panel selected row: BDAP DCAREND S PREV
  //
  public static int PQRY_BDAPDCARSPRE = 2835;
  public static int PQSL_BDAPDCARSPRE_ESERCIZIO = 0;
  public static int PQSL_BDAPDCARSPRE_LIVELLO_4 = 1;
  public static int PQSL_BDAPDCARSPRE_MISSIONE = 2;
  public static int PQSL_BDAPDCARSPRE_PROGRAMMA = 3;
  public static int PQSL_BDAPDCARSPRE_RESIDUI_PRESUNTI = 4;
  public static int PQSL_BDAPDCARSPRE_PREVISIONE = 5;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CA_M1 = 6;
  public static int PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_M1 = 7;
  public static int PQSL_BDAPDCARSPRE_FPV_M1 = 8;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CO = 9;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CA = 10;
  public static int PQSL_BDAPDCARSPRE_GIA_IMPEGNATO = 11;
  public static int PQSL_BDAPDCARSPRE_FPV = 12;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CO_P1 = 13;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CA_P1 = 14;
  public static int PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P1 = 15;
  public static int PQSL_BDAPDCARSPRE_FPV_P1 = 16;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CO_P2 = 17;
  public static int PQSL_BDAPDCARSPRE_STN_INI_CA_P2 = 18;
  public static int PQSL_BDAPDCARSPRE_GIA_IMPEGNATO_P2 = 19;
  public static int PQSL_BDAPDCARSPRE_FPV_P2 = 20;
  public static int PQSL_BDAPDCARSPRE_UTENTE_INSERIMENTO = 21;
  public static int PQSL_BDAPDCARSPRE_DATA_INSERIMENTO = 22;
  public static int PQSL_BDAPDCARSPRE_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_BDAPDCARSPRE_DATA_ULTIMO_AGG = 24;

  // Table to contain panel selected row: BDAP DCAPREV E
  //
  public static int PQRY_BDAPDCAPREVE = 2836;
  public static int PQSL_BDAPDCAPREVE_ESERCIZIO = 0;
  public static int PQSL_BDAPDCAPREVE_LIVELLO_4 = 1;
  public static int PQSL_BDAPDCAPREVE_RESIDUI_PRESUNTI = 2;
  public static int PQSL_BDAPDCAPREVE_PREVISIONE = 3;
  public static int PQSL_BDAPDCAPREVE_STN_INI_CA_M1 = 4;
  public static int PQSL_BDAPDCAPREVE_STN_INI_CO = 5;
  public static int PQSL_BDAPDCAPREVE_STN_INI_CA = 6;
  public static int PQSL_BDAPDCAPREVE_STN_INI_CO_P1 = 7;
  public static int PQSL_BDAPDCAPREVE_STN_INI_CO_P2 = 8;
  public static int PQSL_BDAPDCAPREVE_UTENTE_INSERIMENTO = 9;
  public static int PQSL_BDAPDCAPREVE_DATA_INSERIMENTO = 10;
  public static int PQSL_BDAPDCAPREVE_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_BDAPDCAPREVE_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI579 = 2837;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI6 = 2838;
  public static int PQRY_PARAMETRI6_RS = 2839;
  public static int PQSL_PARAMETRI6_PARAMSCHEMA = 0;
  public static int PQSL_PARAMETRI6_PARAESCLTOTA = 1;
  public static int PQSL_PARAMETRI6_PARAMDESCRIZ = 2;
  public static int PQSL_PARAMETRI6_PARAESERPLUR = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI420 = 2840;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION2 = 2841;
  public static int PQSL_NOTEFUNZION2_MODULO = 0;
  public static int PQSL_NOTEFUNZION2_PAGINA = 1;
  public static int PQSL_NOTEFUNZION2_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION2_DESCRIZIONE = 3;

  // Table to contain panel selected row: Certificato
  //
  public static int PQRY_CERTIFICATO3 = 2842;
  public static int PQRY_CERTIFICATO3_RS = 2843;
  public static int PQSL_CERTIFICATO3_SCHEMA = 0;
  public static int PQSL_CERTIFICATO3_TIPO_RIGA = 1;
  public static int PQSL_CERTIFICATO3_DESCRIZIONE_1 = 2;
  public static int PQSL_CERTIFICATO3_DESCRIZIONE_2 = 3;
  public static int PQSL_CERTIFICATO3_VALORE_1 = 4;
  public static int PQSL_CERTIFICATO3_VALORE_2 = 5;
  public static int PQSL_CERTIFICATO3_VALORE_3 = 6;
  public static int PQSL_CERTIFICATO3_VALORE_4 = 7;
  public static int PQSL_CERTIFICATO3_VALORE_5 = 8;
  public static int PQSL_CERTIFICATO3_VALORE_6 = 9;
  public static int PQSL_CERTIFICATO3_VALORE_7 = 10;
  public static int PQSL_CERTIFICATO3_VALORE_8 = 11;
  public static int PQSL_CERTIFICATO3_VALORE_9 = 12;
  public static int PQSL_CERTIFICATO3_VALORE_10 = 13;
  public static int PQSL_CERTIFICATO3_VALORE_11 = 14;
  public static int PQSL_CERTIFICATO3_VALORE_12 = 15;
  public static int PQSL_CERTIFICATO3_VALORE_13 = 16;
  public static int PQSL_CERTIFICATO3_VALORE_14 = 17;
  public static int PQSL_CERTIFICATO3_VALORE_15 = 18;
  public static int PQSL_CERTIFICATO3_VALORE_16 = 19;
  public static int PQSL_CERTIFICATO3_VALORE_17 = 20;
  public static int PQSL_CERTIFICATO3_VALORE_18 = 21;
  public static int PQSL_CERTIFICATO3_VALORE_19 = 22;
  public static int PQSL_CERTIFICATO3_VALORE_20 = 23;
  public static int PQSL_CERTIFICATO3_VALORE_21 = 24;
  public static int PQSL_CERTIFICATO3_VALORE_22 = 25;
  public static int PQSL_CERTIFICATO3_VALORE_23 = 26;
  public static int PQSL_CERTIFICATO3_VALORE_24 = 27;
  public static int PQSL_CERTIFICATO3_VALORE_25 = 28;
  public static int PQSL_CERTIFICATO3_VALORE_26 = 29;
  public static int PQSL_CERTIFICATO3_VALORE_27 = 30;
  public static int PQSL_CERTIFICATO3_VALORE_28 = 31;
  public static int PQSL_CERTIFICATO3_VALORE_29 = 32;
  public static int PQSL_CERTIFICATO3_VALORE_30 = 33;
  public static int PQSL_CERTIFICATO3_CERTIFISTATO = 34;
  public static int PQSL_CERTIFICATO3_RIGA = 35;

  // Table to contain panel selected row: BDAP SDBPREV ALL
  //
  public static int PQRY_BDAPSDBPRAL1 = 2844;
  public static int PQSL_BDAPSDBPRAL1_PROGRESSIVO = 0;
  public static int PQSL_BDAPSDBPRAL1_ESERCIZIO = 1;
  public static int PQSL_BDAPSDBPRAL1_SCHEMA_BILANCIO = 2;
  public static int PQSL_BDAPSDBPRAL1_TIPO_RIGA = 3;
  public static int PQSL_BDAPSDBPRAL1_RAGGRUPPAMENTO = 4;
  public static int PQSL_BDAPSDBPRAL1_DESCRIZIONE = 5;
  public static int PQSL_BDAPSDBPRAL1_CAPITOLO_SPESA = 6;
  public static int PQSL_BDAPSDBPRAL1_ARTICOLO_SPESA = 7;
  public static int PQSL_BDAPSDBPRAL1_DESCR_CAPITOLO_SPESA = 8;
  public static int PQSL_BDAPSDBPRAL1_CAPITOLO_ENTRATA = 9;
  public static int PQSL_BDAPSDBPRAL1_ARTICOLO_ENTRATA = 10;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_1 = 11;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_2 = 12;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_3 = 13;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_4 = 14;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_5 = 15;
  public static int PQSL_BDAPSDBPRAL1_IMPORTO_6 = 16;

  // Table to contain panel selected row: BDAP SDBPREV ALL
  //
  public static int PQRY_BDAPSDBPRALL = 2845;
  public static int PQSL_BDAPSDBPRALL_PROGRESSIVO = 0;
  public static int PQSL_BDAPSDBPRALL_ESERCIZIO = 1;
  public static int PQSL_BDAPSDBPRALL_SCHEMA_BILANCIO = 2;
  public static int PQSL_BDAPSDBPRALL_TIPO_RIGA = 3;
  public static int PQSL_BDAPSDBPRALL_RAGGRUPPAMENTO = 4;
  public static int PQSL_BDAPSDBPRALL_DESCRIZIONE = 5;
  public static int PQSL_BDAPSDBPRALL_CAPITOLO_SPESA = 6;
  public static int PQSL_BDAPSDBPRALL_ARTICOLO_SPESA = 7;
  public static int PQSL_BDAPSDBPRALL_DESCR_CAPITOLO_SPESA = 8;
  public static int PQSL_BDAPSDBPRALL_CAPITOLO_ENTRATA = 9;
  public static int PQSL_BDAPSDBPRALL_ARTICOLO_ENTRATA = 10;
  public static int PQSL_BDAPSDBPRALL_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_1 = 12;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_2 = 13;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_3 = 14;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_4 = 15;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_5 = 16;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_6 = 17;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_7 = 18;
  public static int PQSL_BDAPSDBPRALL_IMPORTO_8 = 19;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA8 = 2846;
  public static int PQSL_PARBILALRIA8_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA8_ESERCIZIO = 1;
  public static int PQSL_PARBILALRIA8_SCHEMA_BILANCIO = 2;
  public static int PQSL_PARBILALRIA8_TIPO_RIGA = 3;
  public static int PQSL_PARBILALRIA8_DESCRIZIONE = 4;
  public static int PQSL_PARBILALRIA8_RAGGRUPPAMENTO = 5;
  public static int PQSL_PARBILALRIA8_CAPITOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA8_ARTICOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA8_DESCR_CAPITOLO_SPESA = 8;
  public static int PQSL_PARBILALRIA8_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA8_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA8_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_PARBILALRIA8_IMPORTO_1 = 12;
  public static int PQSL_PARBILALRIA8_IMPORTO_2 = 13;
  public static int PQSL_PARBILALRIA8_IMPORTO_3 = 14;
  public static int PQSL_PARBILALRIA8_IMPORTO_4 = 15;
  public static int PQSL_PARBILALRIA8_IMPORTO_5 = 16;
  public static int PQSL_PARBILALRIA8_IMPORTO_6 = 17;
  public static int PQSL_PARBILALRIA8_IMPORTO_7 = 18;

  // Recordset for query: Schemi BDAP
  //
  public static int QRY_SCHEMIBDAP1 = 2847;
  public static int QSL_SCHEMIBDAP1_VALORE1 = 0;
  public static int QSL_SCHEMIBDAP1_VALORE2 = 1;
  public static int QSL_SCHEMIBDAP1_VALORE3 = 2;
  public static int QSL_SCHEMIBDAP1_VALORE4 = 3;
  public static int QSL_SCHEMIBDAP1_VALORE5 = 4;
  public static int QSL_SCHEMIBDAP1_VALORE6 = 5;
  public static int QSL_SCHEMIBDAP1_VALORE7 = 6;
  public static int QSL_SCHEMIBDAP1_VALORE8 = 7;
  public static int QSL_SCHEMIBDAP1_VALORE9 = 8;
  public static int QSL_SCHEMIBDAP1_VALORE10 = 9;
  public static int QSL_SCHEMIBDAP1_VALORE11 = 10;
  public static int QSL_SCHEMIBDAP1_VALORE12 = 11;
  public static int QSL_SCHEMIBDAP1_VALORE13 = 12;
  public static int QSL_SCHEMIBDAP1_VALORE14 = 13;
  public static int QSL_SCHEMIBDAP1_VALORE15 = 14;
  public static int QSL_SCHEMIBDAP1_VALORE16 = 15;
  public static int QSL_SCHEMIBDAP1_VALORE17 = 16;
  public static int QSL_SCHEMIBDAP1_VALORE18 = 17;
  public static int QSL_SCHEMIBDAP1_VALORE19 = 18;
  public static int QSL_SCHEMIBDAP1_VALORE20 = 19;
  public static int QSL_SCHEMIBDAP1_VALORE21 = 20;
  public static int QSL_SCHEMIBDAP1_VALORE22 = 21;
  public static int QSL_SCHEMIBDAP1_VALORE23 = 22;
  public static int QSL_SCHEMIBDAP1_VALORE24 = 23;
  public static int QSL_SCHEMIBDAP1_VALORE25 = 24;
  public static int QSL_SCHEMIBDAP1_VALORE26 = 25;
  public static int QSL_SCHEMIBDAP1_VALORE27 = 26;
  public static int QSL_SCHEMIBDAP1_VALORE28 = 27;
  public static int QSL_SCHEMIBDAP1_VALORE29 = 28;
  public static int QSL_SCHEMIBDAP1_VALORE30 = 29;
  public static int QSL_SCHEMIBDAP1_DESCRISCHEMA = 30;
  public static int QSL_SCHEMIBDAP1_TIPORIGA = 31;
  public static int QSL_SCHEMIBDAP1_DESCRIZIONE1 = 32;
  public static int QSL_SCHEMIBDAP1_DESCRIZIONE2 = 33;
  public static int QSL_SCHEMIBDAP1_VALORE1OLD = 34;
  public static int QSL_SCHEMIBDAP1_VALORE2OLD = 35;
  public static int QSL_SCHEMIBDAP1_VALORE3OLD = 36;
  public static int QSL_SCHEMIBDAP1_VALORE4OLD = 37;
  public static int QSL_SCHEMIBDAP1_VALORE5OLD = 38;
  public static int QSL_SCHEMIBDAP1_VALORE6OLD = 39;
  public static int QSL_SCHEMIBDAP1_VALORE7OLD = 40;
  public static int QSL_SCHEMIBDAP1_VALORE8OLD = 41;
  public static int QSL_SCHEMIBDAP1_VALORE9OLD = 42;
  public static int QSL_SCHEMIBDAP1_VALORE10OLD = 43;
  public static int QSL_SCHEMIBDAP1_VALORE11OLD = 44;
  public static int QSL_SCHEMIBDAP1_VALORE12OLD = 45;
  public static int QSL_SCHEMIBDAP1_VALORE13OLD = 46;
  public static int QSL_SCHEMIBDAP1_VALORE14OLD = 47;
  public static int QSL_SCHEMIBDAP1_VALORE15OLD = 48;
  public static int QSL_SCHEMIBDAP1_VALORE16OLD = 49;
  public static int QSL_SCHEMIBDAP1_VALORE17OLD = 50;
  public static int QSL_SCHEMIBDAP1_VALORE18OLD = 51;
  public static int QSL_SCHEMIBDAP1_VALORE19OLD = 52;
  public static int QSL_SCHEMIBDAP1_VALORE20OLD = 53;
  public static int QSL_SCHEMIBDAP1_VALORE21OLD = 54;
  public static int QSL_SCHEMIBDAP1_VALORE22OLD = 55;
  public static int QSL_SCHEMIBDAP1_VALORE23OLD = 56;
  public static int QSL_SCHEMIBDAP1_VALORE24OLD = 57;
  public static int QSL_SCHEMIBDAP1_VALORE25OLD = 58;
  public static int QSL_SCHEMIBDAP1_VALORE26OLD = 59;
  public static int QSL_SCHEMIBDAP1_VALORE27OLD = 60;
  public static int QSL_SCHEMIBDAP1_VALORE28OLD = 61;
  public static int QSL_SCHEMIBDAP1_VALORE29OLD = 62;
  public static int QSL_SCHEMIBDAP1_VALORE30OLD = 63;
  public static int QSL_SCHEMIBDAP1_SCHEMA = 64;
  public static int QSL_SCHEMIBDAP1_ESERCIZIO = 65;
  public static int QSL_SCHEMIBDAP1_RIGA = 66;
  public static int QSL_SCHEMIBDAP1_ESERCIZIPLUR = 67;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA3 = 2848;
  public static int QSL_CFASELINTVA3_COUNT = 0;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTAL2 = 2849;
  public static int PQRY_IMPORTTOTAL2_RS = 2850;
  public static int PQSL_IMPORTTOTAL2_ROWNAMIMPATT = 0;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP7 = 2851;
  public static int PQSL_IMP7_ANNO_IMP = 0;
  public static int PQSL_IMP7_NUMERO_IMP = 1;
  public static int PQSL_IMP7_CAPITOLO = 2;
  public static int PQSL_IMP7_ARTICOLO = 3;
  public static int PQSL_IMP7_IMPORTO = 4;
  public static int PQSL_IMP7_DESCRIZIONE = 5;
  public static int PQSL_IMP7_ANNO_INTROD = 6;
  public static int PQSL_IMP7_SEDE_DEL = 7;
  public static int PQSL_IMP7_NUMERO_DEL = 8;
  public static int PQSL_IMP7_ANNO_DEL = 9;
  public static int PQSL_IMP7_ANNO_PROPOSTA = 10;
  public static int PQSL_IMP7_UNITA_PROPONENTE = 11;
  public static int PQSL_IMP7_NUMERO_PROPOSTA = 12;
  public static int PQSL_IMP7_BENEFICIARIO = 13;
  public static int PQSL_IMP7_PRENOTAZIONE = 14;
  public static int PQSL_IMP7_IMPEGNO_OBBLIG = 15;
  public static int PQSL_IMP7_VOCE_ECON = 16;
  public static int PQSL_IMP7_TITOLO_GIURIDICO = 17;
  public static int PQSL_IMP7_CAUSALE = 18;
  public static int PQSL_IMP7_ESERCIZIO_SCADENZA = 19;
  public static int PQSL_IMP7_TIPO = 20;
  public static int PQSL_IMP7_SERVIZIO_CC = 21;
  public static int PQSL_IMP7_TIPO_VINCOLO = 22;
  public static int PQSL_IMP7_INVESTIMENTO = 23;
  public static int PQSL_IMP7_CONS_SVILUPPO = 24;
  public static int PQSL_IMP7_REGOLA_CONT = 25;
  public static int PQSL_IMP7_CONTRIB_STR = 26;
  public static int PQSL_IMP7_D_DATA_REG = 27;
  public static int PQSL_IMP7_SETTORE = 28;
  public static int PQSL_IMP7_SERVIZIO = 29;
  public static int PQSL_IMP7_S = 30;
  public static int PQSL_IMP7_FATTORE = 31;
  public static int PQSL_IMP7_COD_IMP_ECO = 32;
  public static int PQSL_IMP7_CENTRO = 33;
  public static int PQSL_IMP7_OPERA = 34;
  public static int PQSL_IMP7_OBIETTIVO = 35;
  public static int PQSL_IMP7_COMUNE_ZONA = 36;
  public static int PQSL_IMP7_PROVINCIA_ZONA = 37;
  public static int PQSL_IMP7_CODICE_GESTIONALE = 38;
  public static int PQSL_IMP7_PROGETTO_ID = 39;
  public static int PQSL_IMP7_COD_PROGETTO_ID = 40;
  public static int PQSL_IMP7_SCHEDA_OBIETTIVO_ID = 41;
  public static int PQSL_IMP7_NOTE = 42;
  public static int PQSL_IMP7_CUP = 43;
  public static int PQSL_IMP7_RESPONSABILE_RES = 44;
  public static int PQSL_IMP7_COMPETENZA_DAL = 45;
  public static int PQSL_IMP7_COMPETENZA_AL = 46;
  public static int PQSL_IMP7_RILEVANTE_ECO = 47;
  public static int PQSL_IMP7_TIPOLOGIA_SPESA = 48;
  public static int PQSL_IMP7_ANNO_PLUR = 49;
  public static int PQSL_IMP7_NUMERO_PLUR = 50;
  public static int PQSL_IMP7_PROGR_UNITA_ORGANIZZATIVA = 51;
  public static int PQSL_IMP7_UTENTE_INSERIMENTO = 52;
  public static int PQSL_IMP7_DATA_INSERIMENTO = 53;
  public static int PQSL_IMP7_UTENTE_ULTIMO_AGG = 54;
  public static int PQSL_IMP7_DATA_ULTIMO_AGG = 55;
  public static int PQSL_IMP7_PROGR_UNITA_ORGANIZZATIVA_INS = 56;
  public static int PQSL_IMP7_DATA_REG = 57;
  public static int PQSL_IMP7_CIG = 58;
  public static int PQSL_IMP7_COD_MONITORAGGIO = 59;
  public static int PQSL_IMP7_CODICE_COFOG = 60;
  public static int PQSL_IMP7_CODICE_EUROPEO = 61;
  public static int PQSL_IMP7_COD_LIVELLO_5 = 62;
  public static int PQSL_IMP7_ESCLUSIONE_12 = 63;
  public static int PQSL_IMP7_IMP_DA_REISCR_STN = 64;
  public static int PQSL_IMP7_ANNO_IMP_PROVENIENZA = 65;
  public static int PQSL_IMP7_NUMERO_IMP_PROVENIENZA = 66;
  public static int PQSL_IMP7_DATA_REG_ECONOMICA = 67;
  public static int PQSL_IMP7_DATA_SCADENZA = 68;
  public static int PQSL_IMP7_CRONOPROGRAMMA_ID = 69;
  public static int PQSL_IMP7_VOCE_TECNICA_OPERA = 70;
  public static int PQSL_IMP7_ANNO_ENTRATA_PROVENIENZA = 71;
  public static int PQSL_IMP7_FINANZIAMENTO_LIGHT = 72;
  public static int PQSL_IMP7_OPERA_LIGHT = 73;
  public static int PQSL_IMP7_PROGR_VARIMP_PROVENIENZA = 74;
  public static int PQSL_IMP7_ANNO_DEL_PROVENIENZA = 75;
  public static int PQSL_IMP7_NUMERO_DEL_PROVENIENZA = 76;
  public static int PQSL_IMP7_SEDE_DEL_PROVENIENZA = 77;
  public static int PQSL_IMP7_ANNO_PROPOSTA_PROVENIENZA = 78;
  public static int PQSL_IMP7_UNITA_PROPONENTE_PROVENIENZA = 79;
  public static int PQSL_IMP7_NUMERO_PROPOSTA_PROVENIENZA = 80;
  public static int PQSL_IMP7_ANNO_IMP_PREC = 81;
  public static int PQSL_IMP7_NUMERO_IMP_PREC = 82;
  public static int PQSL_IMP7_IMPDACRONO = 83;
  public static int PQSL_IMP7_ANNO_IMP_PROV_CRONO = 84;
  public static int PQSL_IMP7_NUMERO_IMP_PROV_CRONO = 85;
  public static int PQSL_IMP7_TIPO_AVANZO = 86;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN2 = 2852;
  public static int PQSL_IMPFIN2_ANNO_IMP = 0;
  public static int PQSL_IMPFIN2_NUMERO_IMP = 1;
  public static int PQSL_IMPFIN2_FINANZIAMENTO = 2;
  public static int PQSL_IMPFIN2_IMPFINCOFIOL = 3;
  public static int PQSL_IMPFIN2_OPERA = 4;
  public static int PQSL_IMPFIN2_IMPORTO = 5;
  public static int PQSL_IMPFIN2_CAPITOLO = 6;
  public static int PQSL_IMPFIN2_ARTICOLO = 7;
  public static int PQSL_IMPFIN2_S = 8;

  // Table to contain panel selected row: IMPEGNI
  //
  public static int PQRY_IMPEGNI3 = 2853;
  public static int PQSL_IMPEGNI3_CAPITOLO = 0;
  public static int PQSL_IMPEGNI3_ARTICOLO = 1;
  public static int PQSL_IMPEGNI3_ANNO_IMP = 2;
  public static int PQSL_IMPEGNI3_NUMERO_IMP = 3;
  public static int PQSL_IMPEGNI3_ANNO_DEL = 4;
  public static int PQSL_IMPEGNI3_NUMERO_DEL = 5;
  public static int PQSL_IMPEGNI3_SEDE_DEL = 6;
  public static int PQSL_IMPEGNI3_DATA_REG = 7;
  public static int PQSL_IMPEGNI3_IMPORTO = 8;
  public static int PQSL_IMPEGNI3_DESCRIZIONE = 9;
  public static int PQSL_IMPEGNI3_CAUSALE = 10;
  public static int PQSL_IMPEGNI3_IMPEGNO_OBBLIG = 11;
  public static int PQSL_IMPEGNI3_ESERCIZIO_SCADENZA = 12;
  public static int PQSL_IMPEGNI3_ANNO_INTROD = 13;
  public static int PQSL_IMPEGNI3_BENEFICIARIO = 14;
  public static int PQSL_IMPEGNI3_SETTORE = 15;
  public static int PQSL_IMPEGNI3_SERVIZIO = 16;
  public static int PQSL_IMPEGNI3_TIPOLOGIA_SPESA = 17;
  public static int PQSL_IMPEGNI3_ANNO_PROPOSTA = 18;
  public static int PQSL_IMPEGNI3_UNITA_PROPONENTE = 19;
  public static int PQSL_IMPEGNI3_NUMERO_PROPOSTA = 20;
  public static int PQSL_IMPEGNI3_TIPO = 21;
  public static int PQSL_IMPEGNI3_SERVIZIO_CC = 22;
  public static int PQSL_IMPEGNI3_PRENOTAZIONE = 23;
  public static int PQSL_IMPEGNI3_VOCE_ECON = 24;
  public static int PQSL_IMPEGNI3_TIPO_VINCOLO = 25;
  public static int PQSL_IMPEGNI3_TIPO_AVANZO = 26;
  public static int PQSL_IMPEGNI3_INVESTIMENTO = 27;
  public static int PQSL_IMPEGNI3_CONS_SVILUPPO = 28;
  public static int PQSL_IMPEGNI3_REGOLA_CONT = 29;
  public static int PQSL_IMPEGNI3_CONTRIB_STR = 30;
  public static int PQSL_IMPEGNI3_TITOLO_GIURIDICO = 31;
  public static int PQSL_IMPEGNI3_S = 32;
  public static int PQSL_IMPEGNI3_D_DATA_REG = 33;
  public static int PQSL_IMPEGNI3_ANNO_PLUR = 34;
  public static int PQSL_IMPEGNI3_NUMERO_PLUR = 35;
  public static int PQSL_IMPEGNI3_CENTRO = 36;
  public static int PQSL_IMPEGNI3_FATTORE = 37;
  public static int PQSL_IMPEGNI3_COMPETENZA_DAL = 38;
  public static int PQSL_IMPEGNI3_COMPETENZA_AL = 39;
  public static int PQSL_IMPEGNI3_NOTE = 40;
  public static int PQSL_IMPEGNI3_RILEVANTE_ECO = 41;
  public static int PQSL_IMPEGNI3_COD_IMP_ECO = 42;
  public static int PQSL_IMPEGNI3_PROGETTO_ID = 43;
  public static int PQSL_IMPEGNI3_OPERA = 44;
  public static int PQSL_IMPEGNI3_COMUNE_ZONA = 45;
  public static int PQSL_IMPEGNI3_PROVINCIA_ZONA = 46;
  public static int PQSL_IMPEGNI3_OBIETTIVO = 47;
  public static int PQSL_IMPEGNI3_CODICE_GESTIONALE = 48;
  public static int PQSL_IMPEGNI3_CUP = 49;
  public static int PQSL_IMPEGNI3_RESPONSABILE_RES = 50;
  public static int PQSL_IMPEGNI3_UTENTE_INSERIMENTO = 51;
  public static int PQSL_IMPEGNI3_DATA_INSERIMENTO = 52;
  public static int PQSL_IMPEGNI3_UTENTE_ULTIMO_AGG = 53;
  public static int PQSL_IMPEGNI3_DATA_ULTIMO_AGG = 54;
  public static int PQSL_IMPEGNI3_PROGR_UNITA_ORGANIZZATIVA = 55;
  public static int PQSL_IMPEGNI3_PROGR_UNITA_ORGANIZZATIVA_INS = 56;
  public static int PQSL_IMPEGNI3_SCHEDA_OBIETTIVO_ID = 57;
  public static int PQSL_IMPEGNI3_CIG = 58;
  public static int PQSL_IMPEGNI3_CODICE_COFOG = 59;
  public static int PQSL_IMPEGNI3_CODICE_EUROPEO = 60;
  public static int PQSL_IMPEGNI3_COD_LIVELLO_5 = 61;
  public static int PQSL_IMPEGNI3_DATA_REG_ECONOMICA = 62;
  public static int PQSL_IMPEGNI3_IMP_DA_REISCR_STN = 63;

  // Recordset for query: Finanziamenti
  //
  public static int QRY_FINANZIAME22 = 2854;
  public static int QSL_FINANZIAME22_CODICE = 0;
  public static int QSL_FINANZIAME22_IMPORTOOLD = 1;
  public static int QSL_FINANZIAME22_IMPORTO = 2;
  public static int QSL_FINANZIAME22_STATO = 3;

  // Table to contain panel selected row: Opera
  //
  public static int PQRY_OPERA4 = 2855;
  public static int PQRY_OPERA4_RS = 2856;
  public static int PQSL_OPERA4_ROWNAMEOPERA = 0;
  public static int PQSL_OPERA4_ROWNAMVOCTEC = 1;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV91 = 2857;
  public static int QSL_CFASELINTV91_COUNT = 0;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP12 = 2858;
  public static int PQSL_VARIMP12_D_DATA_REG = 0;
  public static int PQSL_VARIMP12_IMPORTO = 1;
  public static int PQSL_VARIMP12_DESCRIZIONE = 2;
  public static int PQSL_VARIMP12_TIPO_VAR = 3;
  public static int PQSL_VARIMP12_SEDE_DEL = 4;
  public static int PQSL_VARIMP12_NUMERO_DEL = 5;
  public static int PQSL_VARIMP12_ANNO_DEL = 6;
  public static int PQSL_VARIMP12_UNITA_PROPONENTE = 7;
  public static int PQSL_VARIMP12_NUMERO_PROPOSTA = 8;
  public static int PQSL_VARIMP12_ANNO_PROPOSTA = 9;
  public static int PQSL_VARIMP12_FINANZIAMENTO = 10;
  public static int PQSL_VARIMP12_PROGRESSIVO = 11;
  public static int PQSL_VARIMP12_ANNO_VAR = 12;
  public static int PQSL_VARIMP12_COD_REC = 13;
  public static int PQSL_VARIMP12_ANNO_IMP = 14;
  public static int PQSL_VARIMP12_NUMERO_IMP = 15;
  public static int PQSL_VARIMP12_CAPITOLO = 16;
  public static int PQSL_VARIMP12_ARTICOLO = 17;
  public static int PQSL_VARIMP12_VARINFDELLIS = 18;
  public static int PQSL_VARIMP12_VARINFPROLIS = 19;
  public static int PQSL_VARIMP12_ANNO_ESIGIBILITA = 20;
  public static int PQSL_VARIMP12_VARIAZIONE_GENERATA = 21;
  public static int PQSL_VARIMP12_UTENTE_INSERIMENTO = 22;
  public static int PQSL_VARIMP12_DATA_INSERIMENTO = 23;
  public static int PQSL_VARIMP12_UTENTE_ULTIMO_AGG = 24;
  public static int PQSL_VARIMP12_DATA_ULTIMO_AGG = 25;
  public static int PQSL_VARIMP12_ANNO_ENTRATA = 26;
  public static int PQSL_VARIMP12_TIPO_AVANZO = 27;
  public static int PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO = 28;
  public static int PQSL_VARIMP12_ANNO_ENTRATA_CRONO = 29;
  public static int PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE = 30;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC2 = 2859;
  public static int PQSL_ACC2_ANNO_ACC = 0;
  public static int PQSL_ACC2_NUMERO_ACC = 1;
  public static int PQSL_ACC2_D_DATA_REG = 2;
  public static int PQSL_ACC2_CAPITOLO = 3;
  public static int PQSL_ACC2_ARTICOLO = 4;
  public static int PQSL_ACC2_SEDE_DEL = 5;
  public static int PQSL_ACC2_NUMERO_DEL = 6;
  public static int PQSL_ACC2_ANNO_DEL = 7;
  public static int PQSL_ACC2_DESCRIZIONE = 8;
  public static int PQSL_ACC2_ANNO_PROPOSTA = 9;
  public static int PQSL_ACC2_UNITA_PROPONENTE = 10;
  public static int PQSL_ACC2_NUMERO_PROPOSTA = 11;
  public static int PQSL_ACC2_ACCIMPORTO = 12;
  public static int PQSL_ACC2_ACCCAPITOART = 13;
  public static int PQSL_ACC2_ACCACCERTAME = 14;
  public static int PQSL_ACC2_ACCDELIBERA = 15;
  public static int PQSL_ACC2_ACCPROPOSTA = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI13 = 2860;
  public static int PQRY_PARAMETRI13_RS = 2861;
  public static int PQSL_PARAMETRI13_ROWNAMTIPVIN = 0;
  public static int PQSL_PARAMETRI13_ROWNAMECOMPE = 1;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP1 = 2862;
  public static int PQSL_IMP1_ANNO_IMP = 0;
  public static int PQSL_IMP1_NUMERO_IMP = 1;
  public static int PQSL_IMP1_ACCCAPITOART = 2;
  public static int PQSL_IMP1_ACCIMPEGNO = 3;
  public static int PQSL_IMP1_ACCIMPORTO = 4;
  public static int PQSL_IMP1_D_DATA_REG = 5;
  public static int PQSL_IMP1_DESCRIZIONE = 6;
  public static int PQSL_IMP1_ACCDELIBERA = 7;
  public static int PQSL_IMP1_ACCPROPOSTA = 8;
  public static int PQSL_IMP1_CAPITOLO = 9;
  public static int PQSL_IMP1_ARTICOLO = 10;
  public static int PQSL_IMP1_SEDE_DEL = 11;
  public static int PQSL_IMP1_NUMERO_DEL = 12;
  public static int PQSL_IMP1_ANNO_DEL = 13;
  public static int PQSL_IMP1_ANNO_PROPOSTA = 14;
  public static int PQSL_IMP1_UNITA_PROPONENTE = 15;
  public static int PQSL_IMP1_NUMERO_PROPOSTA = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI218 = 2863;
  public static int PQRY_PARAMETRI218_RS = 2864;
  public static int PQSL_PARAMETRI218_ROWNAMTIPVIN = 0;
  public static int PQSL_PARAMETRI218_ROWNAMECOMPE = 1;

  // Table to contain panel selected row: CF4WEB SITUAZ VINCOLO
  //
  public static int PQRY_CF4WSITUVINC = 2865;
  public static int PQSL_CF4WSITUVINC_ESERCIZIO = 0;
  public static int PQSL_CF4WSITUVINC_VINCOLO = 1;
  public static int PQSL_CF4WSITUVINC_STANZIAMENTO_E = 2;
  public static int PQSL_CF4WSITUVINC_ACC_COMP = 3;
  public static int PQSL_CF4WSITUVINC_ACC_RES = 4;
  public static int PQSL_CF4WSITUVINC_ORD_TOT = 5;
  public static int PQSL_CF4WSITUVINC_ORD_COMP = 6;
  public static int PQSL_CF4WSITUVINC_ORD_RES = 7;
  public static int PQSL_CF4WSITUVINC_STANZIAMENTO_S = 8;
  public static int PQSL_CF4WSITUVINC_IMP_COMP = 9;
  public static int PQSL_CF4WSITUVINC_IMP_RES = 10;
  public static int PQSL_CF4WSITUVINC_MAND_TOT = 11;
  public static int PQSL_CF4WSITUVINC_MAND_COMP = 12;
  public static int PQSL_CF4WSITUVINC_MAND_RES = 13;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI16 = 2866;
  public static int PQRY_PARAMETRI16_RS = 2867;
  public static int PQSL_PARAMETRI16_ROWNAMEVINCO = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM26 = 2868;
  public static int PQRY_PARAM26_RS = 2869;
  public static int PQSL_PARAM26_ROWNAMEANNO = 0;
  public static int PQSL_PARAM26_ROWNAMENUMER = 1;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP6 = 2870;
  public static int PQSL_SUBIMP6_ANNO_IMP = 0;
  public static int PQSL_SUBIMP6_NUMERO_IMP = 1;
  public static int PQSL_SUBIMP6_CAPITOLO = 2;
  public static int PQSL_SUBIMP6_ARTICOLO = 3;
  public static int PQSL_SUBIMP6_IMPORTO = 4;
  public static int PQSL_SUBIMP6_DESCRIZIONE = 5;
  public static int PQSL_SUBIMP6_SEDE_DEL = 6;
  public static int PQSL_SUBIMP6_NUMERO_DEL = 7;
  public static int PQSL_SUBIMP6_ANNO_DEL = 8;
  public static int PQSL_SUBIMP6_ANNO_PROPOSTA = 9;
  public static int PQSL_SUBIMP6_UNITA_PROPONENTE = 10;
  public static int PQSL_SUBIMP6_NUMERO_PROPOSTA = 11;
  public static int PQSL_SUBIMP6_BENEFICIARIO = 12;
  public static int PQSL_SUBIMP6_TITOLO_GIURIDICO = 13;
  public static int PQSL_SUBIMP6_CAUSALE = 14;
  public static int PQSL_SUBIMP6_D_DATA_REG = 15;
  public static int PQSL_SUBIMP6_FATTORE = 16;
  public static int PQSL_SUBIMP6_COD_IMP_ECO = 17;
  public static int PQSL_SUBIMP6_CENTRO = 18;
  public static int PQSL_SUBIMP6_COMUNE_ZONA = 19;
  public static int PQSL_SUBIMP6_PROVINCIA_ZONA = 20;
  public static int PQSL_SUBIMP6_CODICE_GESTIONALE = 21;
  public static int PQSL_SUBIMP6_NOTE = 22;
  public static int PQSL_SUBIMP6_RESPONSABILE_RES = 23;
  public static int PQSL_SUBIMP6_COMPETENZA_DAL = 24;
  public static int PQSL_SUBIMP6_COMPETENZA_AL = 25;
  public static int PQSL_SUBIMP6_RILEVANTE_ECO = 26;
  public static int PQSL_SUBIMP6_SUBIMP_OBBLIG = 27;
  public static int PQSL_SUBIMP6_ANNO_SUBIMP = 28;
  public static int PQSL_SUBIMP6_NUMERO_SUBIMP = 29;
  public static int PQSL_SUBIMP6_DATA_REG = 30;
  public static int PQSL_SUBIMP6_CUP = 31;
  public static int PQSL_SUBIMP6_CIG = 32;
  public static int PQSL_SUBIMP6_CODICE_COFOG = 33;
  public static int PQSL_SUBIMP6_CODICE_EUROPEO = 34;
  public static int PQSL_SUBIMP6_COD_LIVELLO_5 = 35;
  public static int PQSL_SUBIMP6_ANNO_SUBIMP_PROVENIENZA = 36;
  public static int PQSL_SUBIMP6_NUMERO_SUBIMP_PROVENIENZA = 37;
  public static int PQSL_SUBIMP6_DATA_REG_ECONOMICA = 38;
  public static int PQSL_SUBIMP6_UTENTE_INSERIMENTO = 39;
  public static int PQSL_SUBIMP6_DATA_INSERIMENTO = 40;
  public static int PQSL_SUBIMP6_UTENTE_ULTIMO_AGG = 41;
  public static int PQSL_SUBIMP6_DATA_ULTIMO_AGG = 42;
  public static int PQSL_SUBIMP6_VOCE_TECNICA_OPERA = 43;
  public static int PQSL_SUBIMP6_PROGR_VARSUB_PROVENIENZA = 44;

  // Table to contain panel selected row: SUB IMP FIN
  //
  public static int PQRY_SUBIMPFIN2 = 2871;
  public static int PQSL_SUBIMPFIN2_ANNO_IMP = 0;
  public static int PQSL_SUBIMPFIN2_NUMERO_IMP = 1;
  public static int PQSL_SUBIMPFIN2_FINANZIAMENTO = 2;
  public static int PQSL_SUBIMPFIN2_IMPORTO = 3;
  public static int PQSL_SUBIMPFIN2_CAPITOLO = 4;
  public static int PQSL_SUBIMPFIN2_ARTICOLO = 5;
  public static int PQSL_SUBIMPFIN2_ANNO_SUBIMP = 6;
  public static int PQSL_SUBIMPFIN2_NUMERO_SUBIMP = 7;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI1 = 2872;
  public static int QSL_CFDBCFDBSEI1_COUNT = 0;

  // Recordset for query: SUBIMP FIN
  //
  public static int QRY_SUBIMPFIN4 = 2873;
  public static int QSL_SUBIMPFIN4_ROWNAMECODIC = 0;

  // Recordset for query: SUBIMP FIN
  //
  public static int QRY_SUBIMPFIN5 = 2874;
  public static int QSL_SUBIMPFIN5_ROWNAMECODIC = 0;

  // Table to contain panel selected row: Opera
  //
  public static int PQRY_OPERA7 = 2875;
  public static int PQRY_OPERA7_RS = 2876;
  public static int PQSL_OPERA7_ROWNAMEOPERA = 0;
  public static int PQSL_OPERA7_ROWNAMVOCTEC = 1;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV92 = 2877;
  public static int QSL_CFASELINTV92_ROWNAMECODIC = 0;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTAL4 = 2878;
  public static int PQRY_IMPORTTOTAL4_RS = 2879;
  public static int PQSL_IMPORTTOTAL4_ROWNAMIMPTOT = 0;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB7 = 2880;
  public static int PQSL_VARSUB7_D_DATA_REG = 0;
  public static int PQSL_VARSUB7_IMPORTO = 1;
  public static int PQSL_VARSUB7_DESCRIZIONE = 2;
  public static int PQSL_VARSUB7_TIPO_VAR = 3;
  public static int PQSL_VARSUB7_SEDE_DEL = 4;
  public static int PQSL_VARSUB7_NUMERO_DEL = 5;
  public static int PQSL_VARSUB7_ANNO_DEL = 6;
  public static int PQSL_VARSUB7_UNITA_PROPONENTE = 7;
  public static int PQSL_VARSUB7_NUMERO_PROPOSTA = 8;
  public static int PQSL_VARSUB7_ANNO_PROPOSTA = 9;
  public static int PQSL_VARSUB7_FINANZIAMENTO = 10;
  public static int PQSL_VARSUB7_PROGRESSIVO = 11;
  public static int PQSL_VARSUB7_ANNO_VAR = 12;
  public static int PQSL_VARSUB7_COD_REC = 13;
  public static int PQSL_VARSUB7_ANNO_IMP = 14;
  public static int PQSL_VARSUB7_NUMERO_IMP = 15;
  public static int PQSL_VARSUB7_CAPITOLO = 16;
  public static int PQSL_VARSUB7_ARTICOLO = 17;
  public static int PQSL_VARSUB7_ANNO_SUBIMP = 18;
  public static int PQSL_VARSUB7_NUMERO_SUBIMP = 19;
  public static int PQSL_VARSUB7_ANNO_ESIGIBILITA = 20;
  public static int PQSL_VARSUB7_VARSINFODELI = 21;
  public static int PQSL_VARSUB7_VARSINFOPROP = 22;
  public static int PQSL_VARSUB7_UTENTE_INSERIMENTO = 23;
  public static int PQSL_VARSUB7_DATA_INSERIMENTO = 24;
  public static int PQSL_VARSUB7_UTENTE_ULTIMO_AGG = 25;
  public static int PQSL_VARSUB7_DATA_ULTIMO_AGG = 26;
  public static int PQSL_VARSUB7_ANNO_ENTRATA = 27;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN3 = 2881;
  public static int PQRY_IMPFIN3_RS = 2882;
  public static int PQSL_IMPFIN3_ANNO_IMP = 0;
  public static int PQSL_IMPFIN3_NUMERO_IMP = 1;
  public static int PQSL_IMPFIN3_FINANZIAMENTO = 2;
  public static int PQSL_IMPFIN3_IMPORTO = 3;
  public static int PQSL_IMPFIN3_CAPITOLO = 4;
  public static int PQSL_IMPFIN3_ARTICOLO = 5;
  public static int PQSL_IMPFIN3_ANNO_SUBIMP = 6;
  public static int PQSL_IMPFIN3_NUMERO_SUBIMP = 7;
  public static int PQSL_IMPFIN3_IMPFININFO = 8;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIARI2 = 2883;
  public static int PQRY_BENEFICIARI2_RS = 2884;
  public static int PQSL_BENEFICIARI2_ROWNAMRAGSOC = 0;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTAL1 = 2885;
  public static int PQRY_IMPORTTOTAL1_RS = 2886;
  public static int PQSL_IMPORTTOTAL1_ROWNAMIMPATT = 0;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP5 = 2887;
  public static int PQSL_IMP5_ANNO_IMP = 0;
  public static int PQSL_IMP5_NUMERO_IMP = 1;
  public static int PQSL_IMP5_CAPITOLO = 2;
  public static int PQSL_IMP5_ARTICOLO = 3;
  public static int PQSL_IMP5_IMPORTO = 4;
  public static int PQSL_IMP5_DESCRIZIONE = 5;
  public static int PQSL_IMP5_ANNO_INTROD = 6;
  public static int PQSL_IMP5_SEDE_DEL = 7;
  public static int PQSL_IMP5_NUMERO_DEL = 8;
  public static int PQSL_IMP5_ANNO_DEL = 9;
  public static int PQSL_IMP5_ANNO_PROPOSTA = 10;
  public static int PQSL_IMP5_UNITA_PROPONENTE = 11;
  public static int PQSL_IMP5_NUMERO_PROPOSTA = 12;
  public static int PQSL_IMP5_BENEFICIARIO = 13;
  public static int PQSL_IMP5_PRENOTAZIONE = 14;
  public static int PQSL_IMP5_IMPEGNO_OBBLIG = 15;
  public static int PQSL_IMP5_VOCE_ECON = 16;
  public static int PQSL_IMP5_TITOLO_GIURIDICO = 17;
  public static int PQSL_IMP5_CAUSALE = 18;
  public static int PQSL_IMP5_TIPO = 19;
  public static int PQSL_IMP5_SERVIZIO_CC = 20;
  public static int PQSL_IMP5_TIPO_VINCOLO = 21;
  public static int PQSL_IMP5_INVESTIMENTO = 22;
  public static int PQSL_IMP5_CONS_SVILUPPO = 23;
  public static int PQSL_IMP5_REGOLA_CONT = 24;
  public static int PQSL_IMP5_CONTRIB_STR = 25;
  public static int PQSL_IMP5_D_DATA_REG = 26;
  public static int PQSL_IMP5_SETTORE = 27;
  public static int PQSL_IMP5_SERVIZIO = 28;
  public static int PQSL_IMP5_S = 29;
  public static int PQSL_IMP5_FATTORE = 30;
  public static int PQSL_IMP5_COD_IMP_ECO = 31;
  public static int PQSL_IMP5_CENTRO = 32;
  public static int PQSL_IMP5_OPERA = 33;
  public static int PQSL_IMP5_OBIETTIVO = 34;
  public static int PQSL_IMP5_COMUNE_ZONA = 35;
  public static int PQSL_IMP5_PROVINCIA_ZONA = 36;
  public static int PQSL_IMP5_CODICE_GESTIONALE = 37;
  public static int PQSL_IMP5_PROGETTO_ID = 38;
  public static int PQSL_IMP5_COD_PROGETTO = 39;
  public static int PQSL_IMP5_NOTE = 40;
  public static int PQSL_IMP5_CUP = 41;
  public static int PQSL_IMP5_RESPONSABILE_RES = 42;
  public static int PQSL_IMP5_COMPETENZA_DAL = 43;
  public static int PQSL_IMP5_COMPETENZA_AL = 44;
  public static int PQSL_IMP5_RILEVANTE_ECO = 45;
  public static int PQSL_IMP5_TIPOLOGIA_SPESA = 46;
  public static int PQSL_IMP5_NUMERO_PLUR = 47;
  public static int PQSL_IMP5_PROGR_UNITA_ORGANIZZATIVA = 48;
  public static int PQSL_IMP5_UTENTE_INSERIMENTO = 49;
  public static int PQSL_IMP5_DATA_INSERIMENTO = 50;
  public static int PQSL_IMP5_UTENTE_ULTIMO_AGG = 51;
  public static int PQSL_IMP5_DATA_ULTIMO_AGG = 52;
  public static int PQSL_IMP5_IMPCIG = 53;
  public static int PQSL_IMP5_IMPCODMONITO = 54;
  public static int PQSL_IMP5_IMPCODICCOFO = 55;
  public static int PQSL_IMP5_IMPCODICEURO = 56;
  public static int PQSL_IMP5_IMPCODLIVEL5 = 57;
  public static int PQSL_IMP5_IMPDAREISSTN = 58;
  public static int PQSL_IMP5_NUMERIMPPROV = 59;
  public static int PQSL_IMP5_ANNOIMPPROVE = 60;
  public static int PQSL_IMP5_IMPDATAREG1 = 61;
  public static int PQSL_IMP5_IMPDATASCADE = 62;
  public static int PQSL_IMP5_IMPESCCONDOD = 63;
  public static int PQSL_IMP5_IMPANNENTPRO = 64;
  public static int PQSL_IMP5_IMPFINANLIGH = 65;
  public static int PQSL_IMP5_IMPOPERALIGH = 66;
  public static int PQSL_IMP5_IMPDELIBPROV = 67;
  public static int PQSL_IMP5_IMPNUMDELPRO = 68;
  public static int PQSL_IMP5_IMPANNDELPRO = 69;
  public static int PQSL_IMP5_IMPPROPOPROV = 70;
  public static int PQSL_IMP5_IMPNUMPROPRO = 71;
  public static int PQSL_IMP5_IMPANNPROPRO = 72;
  public static int PQSL_IMP5_ANNOIMPPREC = 73;
  public static int PQSL_IMP5_NUMERIMPPREC = 74;
  public static int PQSL_IMP5_IMPDACRONO = 75;
  public static int PQSL_IMP5_ANNIMPPROCRO = 76;
  public static int PQSL_IMP5_NUMIMPPROCRO = 77;
  public static int PQSL_IMP5_IMPTIPOAVANZ = 78;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP11 = 2888;
  public static int PQSL_VARIMP11_D_DATA_REG = 0;
  public static int PQSL_VARIMP11_IMPORTO = 1;
  public static int PQSL_VARIMP11_DESCRIZIONE = 2;
  public static int PQSL_VARIMP11_TIPO_VAR = 3;
  public static int PQSL_VARIMP11_SEDE_DEL = 4;
  public static int PQSL_VARIMP11_NUMERO_DEL = 5;
  public static int PQSL_VARIMP11_ANNO_DEL = 6;
  public static int PQSL_VARIMP11_UNITA_PROPONENTE = 7;
  public static int PQSL_VARIMP11_NUMERO_PROPOSTA = 8;
  public static int PQSL_VARIMP11_ANNO_PROPOSTA = 9;
  public static int PQSL_VARIMP11_FINANZIAMENTO = 10;
  public static int PQSL_VARIMP11_PROGRESSIVO = 11;
  public static int PQSL_VARIMP11_ANNO_VAR = 12;
  public static int PQSL_VARIMP11_COD_REC = 13;
  public static int PQSL_VARIMP11_ANNO_IMP = 14;
  public static int PQSL_VARIMP11_NUMERO_IMP = 15;
  public static int PQSL_VARIMP11_CAPITOLO = 16;
  public static int PQSL_VARIMP11_ARTICOLO = 17;
  public static int PQSL_VARIMP11_VARIINFODELI = 18;
  public static int PQSL_VARIMP11_VARIINFOPROP = 19;
  public static int PQSL_VARIMP11_ANNO_ESIGIBILITA = 20;
  public static int PQSL_VARIMP11_VARIAZIONE_GENERATA = 21;
  public static int PQSL_VARIMP11_UTENTE_INSERIMENTO = 22;
  public static int PQSL_VARIMP11_DATA_INSERIMENTO = 23;
  public static int PQSL_VARIMP11_UTENTE_ULTIMO_AGG = 24;
  public static int PQSL_VARIMP11_DATA_ULTIMO_AGG = 25;
  public static int PQSL_VARIMP11_ANNO_ENTRATA = 26;
  public static int PQSL_VARIMP11_VARITIPOAVAN = 27;
  public static int PQSL_VARIMP11_VARANNESICRO = 28;
  public static int PQSL_VARIMP11_VARANNENTCRO = 29;
  public static int PQSL_VARIMP11_VARIFINADEST = 30;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN1 = 2889;
  public static int PQSL_IMPFIN1_ANNO_IMP = 0;
  public static int PQSL_IMPFIN1_NUMERO_IMP = 1;
  public static int PQSL_IMPFIN1_FINANZIAMENTO = 2;
  public static int PQSL_IMPFIN1_OPERA = 3;
  public static int PQSL_IMPFIN1_IMPORTO = 4;
  public static int PQSL_IMPFIN1_CAPITOLO = 5;
  public static int PQSL_IMPFIN1_ARTICOLO = 6;
  public static int PQSL_IMPFIN1_S = 7;
  public static int PQSL_IMPFIN1_IMPFININFFIN = 8;

  // Table to contain panel selected row: Opera
  //
  public static int PQRY_OPERA2 = 2890;
  public static int PQRY_OPERA2_RS = 2891;
  public static int PQSL_OPERA2_ROWNAMEOPERA = 0;

  // Table to contain panel selected row: IMPEGNI
  //
  public static int PQRY_IMPEGNI2 = 2892;
  public static int PQSL_IMPEGNI2_CAPITOLO = 0;
  public static int PQSL_IMPEGNI2_ARTICOLO = 1;
  public static int PQSL_IMPEGNI2_ANNO_IMP = 2;
  public static int PQSL_IMPEGNI2_NUMERO_IMP = 3;
  public static int PQSL_IMPEGNI2_ANNO_DEL = 4;
  public static int PQSL_IMPEGNI2_NUMERO_DEL = 5;
  public static int PQSL_IMPEGNI2_SEDE_DEL = 6;
  public static int PQSL_IMPEGNI2_DATA_REG = 7;
  public static int PQSL_IMPEGNI2_IMPORTO = 8;
  public static int PQSL_IMPEGNI2_DESCRIZIONE = 9;
  public static int PQSL_IMPEGNI2_CAUSALE = 10;
  public static int PQSL_IMPEGNI2_IMPEGNO_OBBLIG = 11;
  public static int PQSL_IMPEGNI2_ESERCIZIO_SCADENZA = 12;
  public static int PQSL_IMPEGNI2_ANNO_INTROD = 13;
  public static int PQSL_IMPEGNI2_BENEFICIARIO = 14;
  public static int PQSL_IMPEGNI2_SETTORE = 15;
  public static int PQSL_IMPEGNI2_SERVIZIO = 16;
  public static int PQSL_IMPEGNI2_TIPOLOGIA_SPESA = 17;
  public static int PQSL_IMPEGNI2_ANNO_PROPOSTA = 18;
  public static int PQSL_IMPEGNI2_UNITA_PROPONENTE = 19;
  public static int PQSL_IMPEGNI2_NUMERO_PROPOSTA = 20;
  public static int PQSL_IMPEGNI2_TIPO = 21;
  public static int PQSL_IMPEGNI2_SERVIZIO_CC = 22;
  public static int PQSL_IMPEGNI2_PRENOTAZIONE = 23;
  public static int PQSL_IMPEGNI2_VOCE_ECON = 24;
  public static int PQSL_IMPEGNI2_TIPO_VINCOLO = 25;
  public static int PQSL_IMPEGNI2_INVESTIMENTO = 26;
  public static int PQSL_IMPEGNI2_REGOLA_CONT = 27;
  public static int PQSL_IMPEGNI2_CONTRIB_STR = 28;
  public static int PQSL_IMPEGNI2_TITOLO_GIURIDICO = 29;
  public static int PQSL_IMPEGNI2_S = 30;
  public static int PQSL_IMPEGNI2_D_DATA_REG = 31;
  public static int PQSL_IMPEGNI2_ANNO_PLUR = 32;
  public static int PQSL_IMPEGNI2_NUMERO_PLUR = 33;
  public static int PQSL_IMPEGNI2_CENTRO = 34;
  public static int PQSL_IMPEGNI2_FATTORE = 35;
  public static int PQSL_IMPEGNI2_COMPETENZA_DAL = 36;
  public static int PQSL_IMPEGNI2_COMPETENZA_AL = 37;
  public static int PQSL_IMPEGNI2_NOTE = 38;
  public static int PQSL_IMPEGNI2_RILEVANTE_ECO = 39;
  public static int PQSL_IMPEGNI2_COD_IMP_ECO = 40;
  public static int PQSL_IMPEGNI2_PROGETTO_ID = 41;
  public static int PQSL_IMPEGNI2_OPERA = 42;
  public static int PQSL_IMPEGNI2_COMUNE_ZONA = 43;
  public static int PQSL_IMPEGNI2_PROVINCIA_ZONA = 44;
  public static int PQSL_IMPEGNI2_OBIETTIVO = 45;
  public static int PQSL_IMPEGNI2_CODICE_GESTIONALE = 46;
  public static int PQSL_IMPEGNI2_CUP = 47;
  public static int PQSL_IMPEGNI2_RESPONSABILE_RES = 48;

  // Table to contain panel selected row: GE4 IMPEGNI
  //
  public static int PQRY_GE4IMPEGNI = 2893;
  public static int PQSL_GE4IMPEGNI_IMPORTO_ATTUALE = 0;
  public static int PQSL_GE4IMPEGNI_TOT_ORDINATO = 1;
  public static int PQSL_GE4IMPEGNI_TOT_ARRIVATO = 2;
  public static int PQSL_GE4IMPEGNI_TOT_LIQUIDABILE = 3;
  public static int PQSL_GE4IMPEGNI_TOT_LIQUIDATO = 4;
  public static int PQSL_GE4IMPEGNI_TOT_SPESE_CASSA_ECON = 5;
  public static int PQSL_GE4IMPEGNI_GE4IMPEGDISP = 6;

  // Table to contain panel selected row: CF4WEB IMPSUB DISPONIBILITA
  //
  public static int PQRY_CF4WIMPSDISP = 2894;
  public static int PQSL_CF4WIMPSDISP_CFIMDIIMSUIM = 0;
  public static int PQSL_CF4WIMPSDISP_IMPORTO_SUBIMP = 1;
  public static int PQSL_CF4WIMPSDISP_BUONI_EMESSI = 2;
  public static int PQSL_CF4WIMPSDISP_DISPOSIZIONI_EMESSE = 3;
  public static int PQSL_CF4WIMPSDISP_IMPORTO_IMP = 4;
  public static int PQSL_CF4WIMPSDISP_FATTURE_RICEVUTE = 5;
  public static int PQSL_CF4WIMPSDISP_LIQ_NO_BUONI = 6;
  public static int PQSL_CF4WIMPSDISP_LIQ_BUONI_TECNICHE = 7;
  public static int PQSL_CF4WIMPSDISP_LIQ_DISP_TECNICHE = 8;
  public static int PQSL_CF4WIMPSDISP_LIQUIDAZIONI_BUONI = 9;
  public static int PQSL_CF4WIMPSDISP_LIQUIDAZIONI_DISP = 10;
  public static int PQSL_CF4WIMPSDISP_SPESE_CASSA_ECON = 11;
  public static int PQSL_CF4WIMPSDISP_MANDATI = 12;
  public static int PQSL_CF4WIMPSDISP_DISPONIBILITA = 13;
  public static int PQSL_CF4WIMPSDISP_CF4IMDILITEL = 14;
  public static int PQSL_CF4WIMPSDISP_CF4IMDILICOL = 15;

  // Table to contain panel selected row: WEB VISTA BUONI DISP
  //
  public static int PQRY_WEBVISBUODIS = 2895;
  public static int PQSL_WEBVISBUODIS_DATA = 0;
  public static int PQSL_WEBVISBUODIS_NUMERO = 1;
  public static int PQSL_WEBVISBUODIS_ANNO = 2;
  public static int PQSL_WEBVISBUODIS_DES_BENEFICIARIO = 3;
  public static int PQSL_WEBVISBUODIS_IMPORTO = 4;
  public static int PQSL_WEBVISBUODIS_IMP_FATTURATO = 5;
  public static int PQSL_WEBVISBUODIS_LIQ_TECNICO = 6;
  public static int PQSL_WEBVISBUODIS_LIQ_CONTABILE = 7;
  public static int PQSL_WEBVISBUODIS_SE_CHIUSO = 8;
  public static int PQSL_WEBVISBUODIS_TIPO = 9;
  public static int PQSL_WEBVISBUODIS_WEBVISBUDIIN = 10;

  // Table to contain panel selected row: ELENCO ORDINI CF4
  //
  public static int PQRY_ELENCORDICF4 = 2896;
  public static int PQSL_ELENCORDICF4_IMPORTO = 0;
  public static int PQSL_ELENCORDICF4_IMP_APERTO = 1;
  public static int PQSL_ELENCORDICF4_IMP_ARRIVATO = 2;
  public static int PQSL_ELENCORDICF4_IMP_LIQUIDABILE = 3;
  public static int PQSL_ELENCORDICF4_IMP_LIQUIDATO = 4;
  public static int PQSL_ELENCORDICF4_ELEORDCF4ORD = 5;
  public static int PQSL_ELENCORDICF4_ELEORDCF4FOR = 6;
  public static int PQSL_ELENCORDICF4_ELEORDCF4MAG = 7;
  public static int PQSL_ELENCORDICF4_ANNO_ORDINE = 8;
  public static int PQSL_ELENCORDICF4_NUMERO_ORDINE = 9;
  public static int PQSL_ELENCORDICF4_DATA_ORDINE = 10;

  // Table to contain panel selected row: ELENCO BUONI CF4
  //
  public static int PQRY_ELENCBUONCF4 = 2897;
  public static int PQSL_ELENCBUONCF4_ANNO_BUONO = 0;
  public static int PQSL_ELENCBUONCF4_NUMERO_BUONO = 1;
  public static int PQSL_ELENCBUONCF4_DATA_BUONO = 2;
  public static int PQSL_ELENCBUONCF4_BENEFICIARIO = 3;
  public static int PQSL_ELENCBUONCF4_DESCR_BENEFICIARIO = 4;
  public static int PQSL_ELENCBUONCF4_DESCR_DOCUMENTO = 5;
  public static int PQSL_ELENCBUONCF4_FUNZIONE_ECONOMALE = 6;
  public static int PQSL_ELENCBUONCF4_DESCR_FUNZIONE = 7;
  public static int PQSL_ELENCBUONCF4_ANNO_IMPEGNO = 8;
  public static int PQSL_ELENCBUONCF4_NUMERO_IMPEGNO = 9;
  public static int PQSL_ELENCBUONCF4_ANNO_SUBIMPEGNO = 10;
  public static int PQSL_ELENCBUONCF4_NUMERO_SUBIMPEGNO = 11;
  public static int PQSL_ELENCBUONCF4_IMPORTO = 12;
  public static int PQSL_ELENCBUONCF4_IMP_LIQUIDATO = 13;
  public static int PQSL_ELENCBUONCF4_ELEBUOCF4ORD = 14;
  public static int PQSL_ELENCBUONCF4_ELEBUOCF4BEN = 15;
  public static int PQSL_ELENCBUONCF4_ELEBUOCFFUEC = 16;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIAR30 = 2898;
  public static int PQRY_BENEFICIAR30_RS = 2899;
  public static int PQSL_BENEFICIAR30_ROWNAMRAGSOC = 0;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTAL3 = 2900;
  public static int PQRY_IMPORTTOTAL3_RS = 2901;
  public static int PQSL_IMPORTTOTAL3_ROWNAMIMPNEW = 0;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP2 = 2902;
  public static int PQSL_IMP2_ANNO_IMP = 0;
  public static int PQSL_IMP2_NUMERO_IMP = 1;
  public static int PQSL_IMP2_CAPITOLO = 2;
  public static int PQSL_IMP2_ARTICOLO = 3;
  public static int PQSL_IMP2_IMPORTO = 4;
  public static int PQSL_IMP2_DESCRIZIONE = 5;
  public static int PQSL_IMP2_SEDE_DEL = 6;
  public static int PQSL_IMP2_NUMERO_DEL = 7;
  public static int PQSL_IMP2_ANNO_DEL = 8;
  public static int PQSL_IMP2_ANNO_PROPOSTA = 9;
  public static int PQSL_IMP2_UNITA_PROPONENTE = 10;
  public static int PQSL_IMP2_NUMERO_PROPOSTA = 11;
  public static int PQSL_IMP2_BENEFICIARIO = 12;
  public static int PQSL_IMP2_TITOLO_GIURIDICO = 13;
  public static int PQSL_IMP2_CAUSALE = 14;
  public static int PQSL_IMP2_D_DATA_REG = 15;
  public static int PQSL_IMP2_FATTORE = 16;
  public static int PQSL_IMP2_COD_IMP_ECO = 17;
  public static int PQSL_IMP2_CENTRO = 18;
  public static int PQSL_IMP2_COMUNE_ZONA = 19;
  public static int PQSL_IMP2_PROVINCIA_ZONA = 20;
  public static int PQSL_IMP2_CODICE_GESTIONALE = 21;
  public static int PQSL_IMP2_NOTE = 22;
  public static int PQSL_IMP2_RESPONSABILE_RES = 23;
  public static int PQSL_IMP2_COMPETENZA_DAL = 24;
  public static int PQSL_IMP2_COMPETENZA_AL = 25;
  public static int PQSL_IMP2_RILEVANTE_ECO = 26;
  public static int PQSL_IMP2_SUBIMP_OBBLIG = 27;
  public static int PQSL_IMP2_ANNO_SUBIMP = 28;
  public static int PQSL_IMP2_NUMERO_SUBIMP = 29;
  public static int PQSL_IMP2_CUP = 30;
  public static int PQSL_IMP2_IMPCIG = 31;
  public static int PQSL_IMP2_IMPSUBCODCOF = 32;
  public static int PQSL_IMP2_IMPSUBCODEUR = 33;
  public static int PQSL_IMP2_IMPSUBCODLI5 = 34;
  public static int PQSL_IMP2_IMPNUMSUBPRO = 35;
  public static int PQSL_IMP2_IMPANNSUBPRO = 36;
  public static int PQSL_IMP2_IMPDATAREG1 = 37;
  public static int PQSL_IMP2_IMPSUBUTEINS = 38;
  public static int PQSL_IMP2_IMPSUBDATINS = 39;
  public static int PQSL_IMP2_IMPSUBUTULAG = 40;
  public static int PQSL_IMP2_IMPSUBDAULAG = 41;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN5 = 2903;
  public static int PQSL_IMPFIN5_ANNO_IMP = 0;
  public static int PQSL_IMPFIN5_NUMERO_IMP = 1;
  public static int PQSL_IMPFIN5_FINANZIAMENTO = 2;
  public static int PQSL_IMPFIN5_IMPORTO = 3;
  public static int PQSL_IMPFIN5_CAPITOLO = 4;
  public static int PQSL_IMPFIN5_ARTICOLO = 5;
  public static int PQSL_IMPFIN5_ANNO_SUBIMP = 6;
  public static int PQSL_IMPFIN5_NUMERO_SUBIMP = 7;
  public static int PQSL_IMPFIN5_IMPFININFO = 8;

  // Table to contain panel selected row: Opera
  //
  public static int PQRY_OPERA1 = 2904;
  public static int PQRY_OPERA1_RS = 2905;
  public static int PQSL_OPERA1_ROWNAMEOPERA = 0;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE16 = 2906;
  public static int PQRY_NEWTABLE16_RS = 2907;
  public static int PQSL_NEWTABLE16_ROWNAMNEWFIE = 0;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS98 = 2908;
  public static int PQRY_PARS98_RS = 2909;
  public static int PQSL_PARS98_NOMEOGGEDELI = 0;
  public static int PQSL_PARS98_NOMOGGNUMDEL = 1;
  public static int PQSL_PARS98_NOMOGGANNDEL = 2;
  public static int PQSL_PARS98_NOMOGGANNESI = 3;
  public static int PQSL_PARS98_NOMEOGGPROUO = 4;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM8 = 2910;
  public static int PQSL_VARCOM8_RECORDCAPITO = 0;
  public static int PQSL_VARCOM8_RECORDARTICO = 1;
  public static int PQSL_VARCOM8_INFOCAP = 2;
  public static int PQSL_VARCOM8_RECVARANNIMP = 3;
  public static int PQSL_VARCOM8_RECORNUMEIMP = 4;
  public static int PQSL_VARCOM8_INFOIMP = 5;
  public static int PQSL_VARCOM8_RECOANNOESIG = 6;
  public static int PQSL_VARCOM8_RECORDIMPORT = 7;
  public static int PQSL_VARCOM8_RECVARTIPVAR = 8;
  public static int PQSL_VARCOM8_RECOVARCPROG = 9;

  // Table to contain panel selected row: Variazioni Impegni
  //
  public static int PQRY_VARIAZIMPEG4 = 2911;
  public static int PQRY_VARIAZIMPEG4_RS = 2912;
  public static int PQSL_VARIAZIMPEG4_NOMOGGCACOST = 0;
  public static int PQSL_VARIAZIMPEG4_NOMOGGCOPICO = 1;
  public static int PQSL_VARIAZIMPEG4_NOMEOGGECAPI = 2;
  public static int PQSL_VARIAZIMPEG4_NOMOGGVARART = 3;
  public static int PQSL_VARIAZIMPEG4_INFOCAPITOLO = 4;
  public static int PQSL_VARIAZIMPEG4_NOMOGGNUMIMP = 5;
  public static int PQSL_VARIAZIMPEG4_NOMOGGVAANIM = 6;
  public static int PQSL_VARIAZIMPEG4_INFOIMPEGNO = 7;
  public static int PQSL_VARIAZIMPEG4_NOMOGGIMPDES = 8;
  public static int PQSL_VARIAZIMPEG4_NOMEOGGEIMPO = 9;
  public static int PQSL_VARIAZIMPEG4_NOMOGGANNESI = 10;
  public static int PQSL_VARIAZIMPEG4_NOMOGGVARPRO = 11;
  public static int PQSL_VARIAZIMPEG4_NOOGIMPRUNOR = 12;
  public static int PQSL_VARIAZIMPEG4_NOMOGGTIPVAR = 13;
  public static int PQSL_VARIAZIMPEG4_NOMOGGANNENT = 14;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR125 = 2913;
  public static int PQRY_PAR125_RS = 2914;
  public static int PQSL_PAR125_NOMEOGGEDELI = 0;

  // Table to contain panel selected row: IMP SUB REISCRITTI ANOMALI
  //
  public static int PQRY_IMPSUBREIANO = 2915;
  public static int PQSL_IMPSUBREIANO_NUMERO_IMP_PROV = 0;
  public static int PQSL_IMPSUBREIANO_ANNO_IMP_PROV = 1;
  public static int PQSL_IMPSUBREIANO_ANNO_SUBIMP_PROV = 2;
  public static int PQSL_IMPSUBREIANO_NUMERO_SUBIMP_PROV = 3;
  public static int PQSL_IMPSUBREIANO_DESCRIZIONE_PROV = 4;
  public static int PQSL_IMPSUBREIANO_CAPITOLO_PROV = 5;
  public static int PQSL_IMPSUBREIANO_ARTICOLO_PROV = 6;
  public static int PQSL_IMPSUBREIANO_CODICE_STRUTTURA_PROV = 7;
  public static int PQSL_IMPSUBREIANO_LIVELLO_4_PROV = 8;
  public static int PQSL_IMPSUBREIANO_LIVELLO_5_PROV = 9;
  public static int PQSL_IMPSUBREIANO_COFOG_PROV = 10;
  public static int PQSL_IMPSUBREIANO_IMPSUBREANU1 = 11;
  public static int PQSL_IMPSUBREIANO_IMPSUBREANO1 = 12;
  public static int PQSL_IMPSUBREIANO_NUMERO_IMP_REISC = 13;
  public static int PQSL_IMPSUBREIANO_ANNO_IMP_REISC = 14;
  public static int PQSL_IMPSUBREIANO_ANNO_SUBIMP_REISC = 15;
  public static int PQSL_IMPSUBREIANO_NUMERO_SUBIMP_REISC = 16;
  public static int PQSL_IMPSUBREIANO_DESCRIZIONE_REISC = 17;
  public static int PQSL_IMPSUBREIANO_CAPITOLO_REISC = 18;
  public static int PQSL_IMPSUBREIANO_ARTICOLO_REISC = 19;
  public static int PQSL_IMPSUBREIANO_CODICE_STRUTTURA_REISC = 20;
  public static int PQSL_IMPSUBREIANO_LIVELLO_4_REISC = 21;
  public static int PQSL_IMPSUBREIANO_LIVELLO_5_REISC = 22;
  public static int PQSL_IMPSUBREIANO_COFOG_REISC = 23;
  public static int PQSL_IMPSUBREIANO_IMPSUBREANUN = 24;
  public static int PQSL_IMPSUBREIANO_IMPSUBREANOB = 25;
  public static int PQSL_IMPSUBREIANO_IMPSUBREANBE = 26;
  public static int PQSL_IMPSUBREIANO_IMSUREANRASO = 27;
  public static int PQSL_IMPSUBREIANO_IMSUREANSCBE = 28;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS70 = 2916;
  public static int PQRY_PARS70_RS = 2917;
  public static int PQSL_PARS70_NOMEOGGEDELI = 0;
  public static int PQSL_PARS70_NOMOGGNUMDEL = 1;
  public static int PQSL_PARS70_NOMOGGANNDEL = 2;
  public static int PQSL_PARS70_NOMOGGANNESI = 3;
  public static int PQSL_PARS70_NOMEOGGPROUO = 4;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP13 = 2918;
  public static int PQSL_VARIMP13_RECOVARICAPI = 0;
  public static int PQSL_VARIMP13_RECOVARIARTI = 1;
  public static int PQSL_VARIMP13_INFOCAP = 2;
  public static int PQSL_VARIMP13_RECVARANNIMP = 3;
  public static int PQSL_VARIMP13_RECVARNUMIMP = 4;
  public static int PQSL_VARIMP13_INFOIMP = 5;
  public static int PQSL_VARIMP13_RECORIMPDESC = 6;
  public static int PQSL_VARIMP13_REVAANESCRCR = 7;
  public static int PQSL_VARIMP13_RECOTIPOVARI = 8;
  public static int PQSL_VARIMP13_RECVARFINDES = 9;
  public static int PQSL_VARIMP13_RECORDIMPORT = 10;
  public static int PQSL_VARIMP13_RECVARTIPVAR = 11;
  public static int PQSL_VARIMP13_RECOVARIPROG = 12;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR119 = 2919;
  public static int PQRY_PAR119_RS = 2920;
  public static int PQSL_PAR119_NOMEOGGEDELI = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI570 = 2921;
  public static int PQRY_PARAMETRI570_RS = 2922;
  public static int PQSL_PARAMETRI570_PARAMVARIAZI = 0;

  // Table to contain panel selected row: GEN VARIMP CRONO
  //
  public static int PQRY_GENVARIMCRON = 2923;
  public static int PQSL_GENVARIMCRON_NUMERORIGA = 0;
  public static int PQSL_GENVARIMCRON_REGEVACRCRID = 1;
  public static int PQSL_GENVARIMCRON_REGEVACRPRIM = 2;
  public static int PQSL_GENVARIMCRON_REGEVACRESPL = 3;
  public static int PQSL_GENVARIMCRON_REGEVACRCOST = 4;
  public static int PQSL_GENVARIMCRON_REGEVACRCOPC = 5;
  public static int PQSL_GENVARIMCRON_RECGENVACRFI = 6;
  public static int PQSL_GENVARIMCRON_RECGENVACRCA = 7;
  public static int PQSL_GENVARIMCRON_RECGENVACRAR = 8;
  public static int PQSL_GENVARIMCRON_RECGENVACROP = 9;
  public static int PQSL_GENVARIMCRON_REGEVACRANVA = 10;
  public static int PQSL_GENVARIMCRON_RECGENVACRIM = 11;
  public static int PQSL_GENVARIMCRON_REGEVACRESIS = 12;
  public static int PQSL_GENVARIMCRON_RECGENVACRDE = 13;
  public static int PQSL_GENVARIMCRON_REGEVACRTIVA = 14;
  public static int PQSL_GENVARIMCRON_REGEVACRIMPU = 15;
  public static int PQSL_GENVARIMCRON_REGEVACRIMRE = 16;

  // Table to contain panel selected row: WRK GEN VAR CRONO VARIMP
  //
  public static int PQRY_WRKGENVACRVA = 2924;
  public static int PQSL_WRKGENVACRVA_CODICESTRUTT = 0;
  public static int PQSL_WRKGENVACRVA_CODPIANOCONT = 1;
  public static int PQSL_WRKGENVACRVA_CAPITOLO = 2;
  public static int PQSL_WRKGENVACRVA_ARTICOLO = 3;
  public static int PQSL_WRKGENVACRVA_OPERA = 4;
  public static int PQSL_WRKGENVACRVA_FINANZIAMENTO = 5;
  public static int PQSL_WRKGENVACRVA_NUMERO_IMP = 6;
  public static int PQSL_WRKGENVACRVA_ANNO_IMP = 7;
  public static int PQSL_WRKGENVACRVA_IMP_DA_REISCR_STN = 8;
  public static int PQSL_WRKGENVACRVA_RECORNUMSUBI = 9;
  public static int PQSL_WRKGENVACRVA_RECOANNOSUBI = 10;
  public static int PQSL_WRKGENVACRVA_ORDNUMEROSUB = 11;
  public static int PQSL_WRKGENVACRVA_ORDANNOSUBIM = 12;
  public static int PQSL_WRKGENVACRVA_IMPORTO_VARIAZIONE = 13;
  public static int PQSL_WRKGENVACRVA_IMPORTVARIMP = 14;
  public static int PQSL_WRKGENVACRVA_PROGR_SESSIONE = 15;
  public static int PQSL_WRKGENVACRVA_NUMERO_SUBIMP = 16;
  public static int PQSL_WRKGENVACRVA_ANNO_SUBIMP = 17;
  public static int PQSL_WRKGENVACRVA_DISPONIBILITA = 18;
  public static int PQSL_WRKGENVACRVA_CRONOPROGRAMMA_ID = 19;
  public static int PQSL_WRKGENVACRVA_PROGRESSIVO_IMPUTAZIONE = 20;
  public static int PQSL_WRKGENVACRVA_ESERCIZIO_PLUR = 21;
  public static int PQSL_WRKGENVACRVA_TIPO_VAR_CRONO = 22;
  public static int PQSL_WRKGENVACRVA_IMPORTO_VAR_CRONO = 23;
  public static int PQSL_WRKGENVACRVA_NUM_RIGA_VAR_CRONO = 24;
  public static int PQSL_WRKGENVACRVA_RAGGRUPPAMEN = 25;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS88 = 2925;
  public static int PQRY_PARS88_RS = 2926;
  public static int PQSL_PARS88_NOMOGGSEDDEL = 0;
  public static int PQSL_PARS88_NOMOGGNUMDEL = 1;
  public static int PQSL_PARS88_NOMOGGANNDEL = 2;
  public static int PQSL_PARS88_NOMEOGGEPROP = 3;
  public static int PQSL_PARS88_NOMEOGGENUME = 4;
  public static int PQSL_PARS88_NOMEOGGEANNO = 5;
  public static int PQSL_PARS88_NOMOGGDATREG = 6;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS97 = 2927;
  public static int PQRY_PARS97_RS = 2928;
  public static int PQSL_PARS97_NOMEOGGETTUO = 0;
  public static int PQSL_PARS97_NOMEOGGETTDA = 1;
  public static int PQSL_PARS97_NOMEOGGETTOA = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI305 = 2929;
  public static int PQRY_PARAMETRI305_RS = 2930;
  public static int PQSL_PARAMETRI305_ROWNAMANNIMP = 0;
  public static int PQSL_PARAMETRI305_ROWNAMNUMIMP = 1;
  public static int PQSL_PARAMETRI305_ROWNAMEOPERA = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI371 = 2931;
  public static int PQRY_PARAMETRI371_RS = 2932;
  public static int PQSL_PARAMETRI371_ROWNAMECAP = 0;
  public static int PQSL_PARAMETRI371_ROWNAMEART = 1;
  public static int PQSL_PARAMETRI371_ROWNAMEIMPEG = 2;
  public static int PQSL_PARAMETRI371_RONAANIMPROR = 3;
  public static int PQSL_PARAMETRI371_RONANUIMPROR = 4;
  public static int PQSL_PARAMETRI371_ROWNAMEFINAN = 5;
  public static int PQSL_PARAMETRI371_ROWNAMEOPERA = 6;
  public static int PQSL_PARAMETRI371_ROWNAMOBIOPE = 7;
  public static int PQSL_PARAMETRI371_ROWNAMECGU = 8;
  public static int PQSL_PARAMETRI371_ROWNAMEVLIVE = 9;
  public static int PQSL_PARAMETRI371_ROWNAMCAPIMP = 10;
  public static int PQSL_PARAMETRI371_ROWNAMARTIMP = 11;
  public static int PQSL_PARAMETRI371_ROWNAMANIMPR = 12;
  public static int PQSL_PARAMETRI371_ROWNAMNUIMPR = 13;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI207 = 2933;
  public static int PQRY_PARAMETRI207_RS = 2934;
  public static int PQSL_PARAMETRI207_ROWNAMACCDAL = 0;
  public static int PQSL_PARAMETRI207_ROWNAMEAL = 1;
  public static int PQSL_PARAMETRI207_ROWNAMDATELA = 2;
  public static int PQSL_PARAMETRI207_ROWNAMEGIORN = 3;
  public static int PQSL_PARAMETRI207_ROWNAMEXINEX = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI331 = 2935;
  public static int PQRY_PARAMETRI331_RS = 2936;
  public static int PQSL_PARAMETRI331_PARPERINCDAL = 0;
  public static int PQSL_PARAMETRI331_PARAPERINCAL = 1;
  public static int PQSL_PARAMETRI331_PARDATMANDAL = 2;
  public static int PQSL_PARAMETRI331_PARADATMANAL = 3;
  public static int PQSL_PARAMETRI331_PARAMTIPO = 4;
  public static int PQSL_PARAMETRI331_PARACODIBENE = 5;
  public static int PQSL_PARAMETRI331_PARAMBENEFIC = 6;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM27 = 2937;
  public static int PQRY_PARAMESTAM27_RS = 2938;
  public static int PQSL_PARAMESTAM27_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAM27_ROWNAMTIPVAR = 1;
  public static int PQSL_PARAMESTAM27_ROWNAMEDELIB = 2;
  public static int PQSL_PARAMESTAM27_ROWNAMNUMDEL = 3;
  public static int PQSL_PARAMESTAM27_ROWNAMANNDEL = 4;
  public static int PQSL_PARAMESTAM27_ROWNAMRESCOM = 5;
  public static int PQSL_PARAMESTAM27_ROWNAMPERDAL = 6;
  public static int PQSL_PARAMESTAM27_ROWNAMEPERAL = 7;
  public static int PQSL_PARAMESTAM27_ROWNAMEPROPO = 8;
  public static int PQSL_PARAMESTAM27_ROWNAMANNPRO = 9;
  public static int PQSL_PARAMESTAM27_ROWNAMNUMPRO = 10;
  public static int PQSL_PARAMESTAM27_RONATOPECOBI = 11;
  public static int PQSL_PARAMESTAM27_ROWNAMTOVAIM = 12;

  // Table to contain panel selected row: INCARICHI
  //
  public static int PQRY_INCARICHI = 2939;
  public static int PQSL_INCARICHI_DESCRIZIONE = 0;
  public static int PQSL_INCARICHI_DATA_INIZIO = 1;
  public static int PQSL_INCARICHI_DATA_FINE = 2;
  public static int PQSL_INCARICHI_ANNO_IMP = 3;
  public static int PQSL_INCARICHI_NUMERO_IMP = 4;
  public static int PQSL_INCARICHI_ANNO_SUBIMP = 5;
  public static int PQSL_INCARICHI_NUMERO_SUBIMP = 6;
  public static int PQSL_INCARICHI_PROGRESSIVO = 7;
  public static int PQSL_INCARICHI_UTENTE_INSERIMENTO = 8;
  public static int PQSL_INCARICHI_DATA_INSERIMENTO = 9;
  public static int PQSL_INCARICHI_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_INCARICHI_DATA_ULTIMO_AGG = 11;
  public static int PQSL_INCARICHI_BENEFICIARIO = 12;
  public static int PQSL_INCARICHI_TIPO = 13;
  public static int PQSL_INCARICHI_RECORORDBENE = 14;
  public static int PQSL_INCARICHI_RECORORDPERI = 15;
  public static int PQSL_INCARICHI_RECORDNUMIMP = 16;
  public static int PQSL_INCARICHI_RECORDANNIMP = 17;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI3 = 2940;
  public static int PQRY_FILTRI3_RS = 2941;
  public static int PQSL_FILTRI3_ROWNAMDAINDA = 0;
  public static int PQSL_FILTRI3_ROWNAMDAINAL = 1;
  public static int PQSL_FILTRI3_ROWNAMEORDIN = 2;
  public static int PQSL_FILTRI3_ROWNAMBENFIL = 3;
  public static int PQSL_FILTRI3_ROWNAMCOBEFI = 4;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI4 = 2942;
  public static int PQRY_FILTRI4_RS = 2943;
  public static int PQSL_FILTRI4_TITOLO = 0;
  public static int PQSL_FILTRI4_INTERVENTO = 1;
  public static int PQSL_FILTRI4_CAPITOLO = 2;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP10 = 2944;
  public static int PQSL_CAP10_CAPITOLO = 0;
  public static int PQSL_CAP10_ARTICOLO = 1;
  public static int PQSL_CAP10_RECORDSTANZI = 2;
  public static int PQSL_CAP10_RECORDIMPEG1 = 3;
  public static int PQSL_CAP10_RECORDIMPEGN = 4;
  public static int PQSL_CAP10_RECORDDISPON = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI348 = 2945;
  public static int PQRY_PARAMETRI348_RS = 2946;
  public static int PQSL_PARAMETRI348_ANNO_DEL = 0;
  public static int PQSL_PARAMETRI348_NUMERO_DEL = 1;
  public static int PQSL_PARAMETRI348_SEDE_DEL = 2;
  public static int PQSL_PARAMETRI348_ANNO_PROPOSTA = 3;
  public static int PQSL_PARAMETRI348_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAMETRI348_UNITA_PROPONENTE = 5;
  public static int PQSL_PARAMETRI348_ROWNAMEOBBLI = 6;
  public static int PQSL_PARAMETRI348_ROWNAMDATREG = 7;
  public static int PQSL_PARAMETRI348_ROWNAMEDESCR = 8;

  // Table to contain panel selected row: Nuova Tabella
  //
  public static int PQRY_NUOVATABELL3 = 2947;
  public static int PQRY_NUOVATABELL3_RS = 2948;
  public static int PQSL_NUOVATABELL3_NOMEOGGEIMPE = 0;
  public static int PQSL_NUOVATABELL3_NOMOGGANNIMP = 1;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP3 = 2949;
  public static int PQSL_IMP3_DESCLIVEIMPE = 0;
  public static int PQSL_IMP3_ICON = 1;
  public static int PQSL_IMP3_RECORANNOIMP = 2;
  public static int PQSL_IMP3_RECORNUMEIMP = 3;
  public static int PQSL_IMP3_TOOLTIP = 4;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL9 = 2950;
  public static int PQSL_DUAL9_NUOVAESPRESS = 0;
  public static int PQSL_DUAL9_ICON = 1;
  public static int PQSL_DUAL9_TOOLTIP = 2;

  // Table to contain panel selected row: VISTA IMP PROV PATH
  //
  public static int PQRY_VISIMPPROPAT = 2951;
  public static int PQSL_VISIMPPROPAT_DESCLIVEIMPE = 0;
  public static int PQSL_VISIMPPROPAT_ICON = 1;
  public static int PQSL_VISIMPPROPAT_RECORANNOIMP = 2;
  public static int PQSL_VISIMPPROPAT_RECORNUMEIMP = 3;
  public static int PQSL_VISIMPPROPAT_TOOLTIP = 4;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP3 = 2952;
  public static int PQSL_VARIMP3_NUOVAESPRESS = 0;
  public static int PQSL_VARIMP3_ICON = 1;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP2 = 2953;
  public static int PQSL_VARIMP2_RECOVARIDESC = 0;
  public static int PQSL_VARIMP2_ICON = 1;
  public static int PQSL_VARIMP2_RECOVARIPROG = 2;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP1 = 2954;
  public static int PQSL_SUBIMP1_NUOVAESPRESS = 0;
  public static int PQSL_SUBIMP1_ICON = 1;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP4 = 2955;
  public static int PQSL_SUBIMP4_DESCLIVEIMPE = 0;
  public static int PQSL_SUBIMP4_RECOANNOSUBI = 1;
  public static int PQSL_SUBIMP4_RECONUMESUBI = 2;
  public static int PQSL_SUBIMP4_ICON = 3;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB1 = 2956;
  public static int PQSL_VARSUB1_NUOVAESPRESS = 0;
  public static int PQSL_VARSUB1_ICON = 1;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB2 = 2957;
  public static int PQSL_VARSUB2_RECOVARIDESC = 0;
  public static int PQSL_VARSUB2_ICON = 1;
  public static int PQSL_VARSUB2_RECOVARSPROG = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL31 = 2958;
  public static int PQSL_DUAL31_RECONUOVESPR = 0;
  public static int PQSL_DUAL31_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ44 = 2959;
  public static int PQSL_LIQ44_RECMANNUMMAN = 0;
  public static int PQSL_LIQ44_RECORANNOLIQ = 1;
  public static int PQSL_LIQ44_RECORNUMELIQ = 2;
  public static int PQSL_LIQ44_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL32 = 2960;
  public static int PQSL_DUAL32_RECONUOVESPR = 0;
  public static int PQSL_DUAL32_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ6 = 2961;
  public static int PQSL_LIQ6_RECMANNUMMAN = 0;
  public static int PQSL_LIQ6_RECMANANNMAN = 1;
  public static int PQSL_LIQ6_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ6_RECORANNOLIQ = 3;
  public static int PQSL_LIQ6_RECORNUMELIQ = 4;
  public static int PQSL_LIQ6_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL33 = 2962;
  public static int PQSL_DUAL33_RECONUOVESPR = 0;
  public static int PQSL_DUAL33_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ45 = 2963;
  public static int PQSL_LIQ45_RECMANNUMMAN = 0;
  public static int PQSL_LIQ45_RECORANNOLIQ = 1;
  public static int PQSL_LIQ45_RECORNUMELIQ = 2;
  public static int PQSL_LIQ45_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL35 = 2964;
  public static int PQSL_DUAL35_RECONUOVESPR = 0;
  public static int PQSL_DUAL35_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ46 = 2965;
  public static int PQSL_LIQ46_RECMANNUMMAN = 0;
  public static int PQSL_LIQ46_RECORANNOLIQ = 1;
  public static int PQSL_LIQ46_RECORNUMELIQ = 2;
  public static int PQSL_LIQ46_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL6 = 2966;
  public static int PQSL_DUAL6_RECONUOVESPR = 0;
  public static int PQSL_DUAL6_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ7 = 2967;
  public static int PQSL_LIQ7_RECMANNUMMAN = 0;
  public static int PQSL_LIQ7_RECMANANNMAN = 1;
  public static int PQSL_LIQ7_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ7_RECORANNOLIQ = 3;
  public static int PQSL_LIQ7_RECORNUMELIQ = 4;
  public static int PQSL_LIQ7_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL36 = 2968;
  public static int PQSL_DUAL36_RECONUOVESPR = 0;
  public static int PQSL_DUAL36_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ48 = 2969;
  public static int PQSL_LIQ48_RECMANNUMMAN = 0;
  public static int PQSL_LIQ48_RECORANNOLIQ = 1;
  public static int PQSL_LIQ48_RECORNUMELIQ = 2;
  public static int PQSL_LIQ48_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL10 = 2970;
  public static int PQSL_DUAL10_NUOVAESPRESS = 0;
  public static int PQSL_DUAL10_ICON = 1;
  public static int PQSL_DUAL10_TOOLTIP = 2;

  // Table to contain panel selected row: IMP
  //
  public static int PQRY_IMP4 = 2971;
  public static int PQSL_IMP4_DESCLIVEIMPE = 0;
  public static int PQSL_IMP4_ICON = 1;
  public static int PQSL_IMP4_RECORANNOIMP = 2;
  public static int PQSL_IMP4_RECORNUMEIMP = 3;
  public static int PQSL_IMP4_TOOLTIP = 4;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP4 = 2972;
  public static int PQSL_VARIMP4_NUOVAESPRESS = 0;
  public static int PQSL_VARIMP4_ICON = 1;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP1 = 2973;
  public static int PQSL_VARIMP1_RECOVARIDESC = 0;
  public static int PQSL_VARIMP1_ICON = 1;
  public static int PQSL_VARIMP1_RECOVARIPROG = 2;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP3 = 2974;
  public static int PQSL_SUBIMP3_NUOVAESPRESS = 0;
  public static int PQSL_SUBIMP3_ICON = 1;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP5 = 2975;
  public static int PQSL_SUBIMP5_DESCLIVEIMPE = 0;
  public static int PQSL_SUBIMP5_RECOANNOSUBI = 1;
  public static int PQSL_SUBIMP5_RECONUMESUBI = 2;
  public static int PQSL_SUBIMP5_ICON = 3;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB3 = 2976;
  public static int PQSL_VARSUB3_NUOVAESPRESS = 0;
  public static int PQSL_VARSUB3_ICON = 1;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB4 = 2977;
  public static int PQSL_VARSUB4_RECOVARIDESC = 0;
  public static int PQSL_VARSUB4_ICON = 1;
  public static int PQSL_VARSUB4_RECOVARSPROG = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL22 = 2978;
  public static int PQSL_DUAL22_RECONUOVESPR = 0;
  public static int PQSL_DUAL22_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ40 = 2979;
  public static int PQSL_LIQ40_RECMANNUMMAN = 0;
  public static int PQSL_LIQ40_RECORANNOLIQ = 1;
  public static int PQSL_LIQ40_RECORNUMELIQ = 2;
  public static int PQSL_LIQ40_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL30 = 2980;
  public static int PQSL_DUAL30_RECONUOVESPR = 0;
  public static int PQSL_DUAL30_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ4 = 2981;
  public static int PQSL_LIQ4_RECMANNUMMAN = 0;
  public static int PQSL_LIQ4_RECMANANNMAN = 1;
  public static int PQSL_LIQ4_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ4_RECORANNOLIQ = 3;
  public static int PQSL_LIQ4_RECORNUMELIQ = 4;
  public static int PQSL_LIQ4_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL23 = 2982;
  public static int PQSL_DUAL23_RECONUOVESPR = 0;
  public static int PQSL_DUAL23_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ42 = 2983;
  public static int PQSL_LIQ42_RECMANNUMMAN = 0;
  public static int PQSL_LIQ42_RECORANNOLIQ = 1;
  public static int PQSL_LIQ42_RECORNUMELIQ = 2;
  public static int PQSL_LIQ42_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL25 = 2984;
  public static int PQSL_DUAL25_RECONUOVESPR = 0;
  public static int PQSL_DUAL25_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ43 = 2985;
  public static int PQSL_LIQ43_RECMANNUMMAN = 0;
  public static int PQSL_LIQ43_RECORANNOLIQ = 1;
  public static int PQSL_LIQ43_RECORNUMELIQ = 2;
  public static int PQSL_LIQ43_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL5 = 2986;
  public static int PQSL_DUAL5_RECONUOVESPR = 0;
  public static int PQSL_DUAL5_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ5 = 2987;
  public static int PQSL_LIQ5_RECMANNUMMAN = 0;
  public static int PQSL_LIQ5_RECMANANNMAN = 1;
  public static int PQSL_LIQ5_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ5_RECORANNOLIQ = 3;
  public static int PQSL_LIQ5_RECORNUMELIQ = 4;
  public static int PQSL_LIQ5_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL26 = 2988;
  public static int PQSL_DUAL26_RECONUOVESPR = 0;
  public static int PQSL_DUAL26_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ47 = 2989;
  public static int PQSL_LIQ47_RECMANNUMMAN = 0;
  public static int PQSL_LIQ47_RECORANNOLIQ = 1;
  public static int PQSL_LIQ47_RECORNUMELIQ = 2;
  public static int PQSL_LIQ47_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL11 = 2990;
  public static int PQSL_DUAL11_NUOVAESPRESS = 0;
  public static int PQSL_DUAL11_ICON = 1;
  public static int PQSL_DUAL11_TOOLTIP = 2;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP5 = 2991;
  public static int PQSL_VARIMP5_NUOVAESPRESS = 0;
  public static int PQSL_VARIMP5_ICON = 1;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP = 2992;
  public static int PQSL_VARIMP_RECOVARIDESC = 0;
  public static int PQSL_VARIMP_ICON = 1;
  public static int PQSL_VARIMP_RECOVARIPROG = 2;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP7 = 2993;
  public static int PQSL_SUBIMP7_NUOVAESPRESS = 0;
  public static int PQSL_SUBIMP7_ICON = 1;

  // Table to contain panel selected row: SUBIMP
  //
  public static int PQRY_SUBIMP2 = 2994;
  public static int PQSL_SUBIMP2_DESCLIVEIMPE = 0;
  public static int PQSL_SUBIMP2_RECOANNOSUBI = 1;
  public static int PQSL_SUBIMP2_RECONUMESUBI = 2;
  public static int PQSL_SUBIMP2_ICON = 3;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB5 = 2995;
  public static int PQSL_VARSUB5_NUOVAESPRESS = 0;
  public static int PQSL_VARSUB5_ICON = 1;

  // Table to contain panel selected row: VARSUB
  //
  public static int PQRY_VARSUB = 2996;
  public static int PQSL_VARSUB_RECOVARIDESC = 0;
  public static int PQSL_VARSUB_ICON = 1;
  public static int PQSL_VARSUB_RECOVARSPROG = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL18 = 2997;
  public static int PQSL_DUAL18_RECONUOVESPR = 0;
  public static int PQSL_DUAL18_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ39 = 2998;
  public static int PQSL_LIQ39_RECMANNUMMAN = 0;
  public static int PQSL_LIQ39_RECORANNOLIQ = 1;
  public static int PQSL_LIQ39_RECORNUMELIQ = 2;
  public static int PQSL_LIQ39_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL3 = 2999;
  public static int PQSL_DUAL3_RECONUOVESPR = 0;
  public static int PQSL_DUAL3_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ3 = 3000;
  public static int PQSL_LIQ3_RECMANNUMMAN = 0;
  public static int PQSL_LIQ3_RECMANANNMAN = 1;
  public static int PQSL_LIQ3_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ3_RECORANNOLIQ = 3;
  public static int PQSL_LIQ3_RECORNUMELIQ = 4;
  public static int PQSL_LIQ3_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL19 = 3001;
  public static int PQSL_DUAL19_RECONUOVESPR = 0;
  public static int PQSL_DUAL19_ICON = 1;

}
