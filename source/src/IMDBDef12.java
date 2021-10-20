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
public class IMDBDef12 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR7 = 2445;
  public static int PQRY_PAR7_RS = 2446;
  public static int PQSL_PAR7_PARAMPARTE = 0;
  public static int PQSL_PAR7_PARAMSETTORE = 1;
  public static int PQSL_PAR7_PARAMSERVIZI = 2;
  public static int PQSL_PAR7_PARADABILSIM = 3;
  public static int PQSL_PAR7_PARADETTCAPI = 4;
  public static int PQSL_PAR7_PARADESCINTE = 5;
  public static int PQSL_PAR7_PARTOTPERTIT = 6;
  public static int PQSL_PAR7_PARAMVARIAZI = 7;
  public static int PQSL_PAR7_PARPREANINCO = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI357 = 2447;
  public static int PQRY_PARAMETRI357_RS = 2448;
  public static int PQSL_PARAMETRI357_PARAMPARTE = 0;
  public static int PQSL_PARAMETRI357_PARAMTITOLO = 1;
  public static int PQSL_PARAMETRI357_PARACENDICOS = 2;
  public static int PQSL_PARAMETRI357_PARADABILSIM = 3;
  public static int PQSL_PARAMETRI357_PARADETTCAPI = 4;
  public static int PQSL_PARAMETRI357_PARADESCINTE = 5;
  public static int PQSL_PARAMETRI357_PARTOTPERTIT = 6;
  public static int PQSL_PARAMETRI357_PARAMVARIAZI = 7;
  public static int PQSL_PARAMETRI357_PARPREANINCO = 8;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR112 = 2449;
  public static int PQRY_PAR112_RS = 2450;
  public static int PQSL_PAR112_PARAMPARTE = 0;
  public static int PQSL_PAR112_PARAMUOSUPER = 1;
  public static int PQSL_PAR112_PARAMUOGESTI = 2;
  public static int PQSL_PAR112_PARADABILSIM = 3;
  public static int PQSL_PAR112_PARADETTCAPI = 4;
  public static int PQSL_PAR112_PARADESCINTE = 5;
  public static int PQSL_PAR112_PARTOTPERTIT = 6;
  public static int PQSL_PAR112_PARAMVARIAZI = 7;
  public static int PQSL_PAR112_PARPREANINCO = 8;

  // Table to contain panel selected row: VISTA BILBPR UO
  //
  public static int PQRY_VISTABILBPU4 = 2451;
  public static int PQSL_VISTABILBPU4_RECORVOCEPEG = 0;
  public static int PQSL_VISTABILBPU4_RECDESVOCPEG = 1;
  public static int PQSL_VISTABILBPU4_RECORDVOCPEG = 2;
  public static int PQSL_VISTABILBPU4_RECORAGGUOES = 3;
  public static int PQSL_VISTABILBPU4_RECORAGGTITO = 4;
  public static int PQSL_VISTABILBPU4_RECORDESCRUO = 5;
  public static int PQSL_VISTABILBPU4_RECOCODIBILA = 6;
  public static int PQSL_VISTABILBPU4_RECODESUOUTI = 7;
  public static int PQSL_VISTABILBPU4_E_S = 8;
  public static int PQSL_VISTABILBPU4_TITOLO = 9;
  public static int PQSL_VISTABILBPU4_DESCRIZIONE = 10;
  public static int PQSL_VISTABILBPU4_PREVISIONE = 11;
  public static int PQSL_VISTABILBPU4_STN_INI_CO = 12;
  public static int PQSL_VISTABILBPU4_VARIAZIONI_CO = 13;
  public static int PQSL_VISTABILBPU4_RECOSTANDEFI = 14;

  // Table to contain panel selected row: VISTA BILBPR UO
  //
  public static int PQRY_VISTABILBPU3 = 2452;
  public static int PQSL_VISTABILBPU3_RECRISCODINT = 0;
  public static int PQSL_VISTABILBPU3_RECDESRICOIN = 1;
  public static int PQSL_VISTABILBPU3_RECORAGGUOES = 2;
  public static int PQSL_VISTABILBPU3_RECORAGGTITO = 3;
  public static int PQSL_VISTABILBPU3_RECRAGRICOIN = 4;
  public static int PQSL_VISTABILBPU3_RECORDESCRUO = 5;
  public static int PQSL_VISTABILBPU3_E_S = 6;
  public static int PQSL_VISTABILBPU3_TITOLO = 7;
  public static int PQSL_VISTABILBPU3_DESCRIZIONE = 8;
  public static int PQSL_VISTABILBPU3_PREVISIONE = 9;
  public static int PQSL_VISTABILBPU3_STN_INI_CO = 10;
  public static int PQSL_VISTABILBPU3_VARIAZIONI_CO = 11;
  public static int PQSL_VISTABILBPU3_RECOSTANDEFI = 12;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR113 = 2453;
  public static int PQRY_PAR113_RS = 2454;
  public static int PQSL_PAR113_PARAMPARTE = 0;
  public static int PQSL_PAR113_PARAMUOUTILI = 1;
  public static int PQSL_PAR113_PARADABILSIM = 2;
  public static int PQSL_PAR113_PARADETTCAPI = 3;
  public static int PQSL_PAR113_PARADESCINTE = 4;
  public static int PQSL_PAR113_PARTOTPERTIT = 5;
  public static int PQSL_PAR113_PARAMVARIAZI = 6;
  public static int PQSL_PAR113_PARPREANINCO = 7;

  // Table to contain panel selected row: VISTA BILBPR UO
  //
  public static int PQRY_VISTABILBPU2 = 2455;
  public static int PQSL_VISTABILBPU2_RECORVOCEPEG = 0;
  public static int PQSL_VISTABILBPU2_RECDESVOCPEG = 1;
  public static int PQSL_VISTABILBPU2_RECORAGGUOES = 2;
  public static int PQSL_VISTABILBPU2_RECORAGGTITO = 3;
  public static int PQSL_VISTABILBPU2_RECRAGVOCPEG = 4;
  public static int PQSL_VISTABILBPU2_RECORDESCRUO = 5;
  public static int PQSL_VISTABILBPU2_RECOCODIBILA = 6;
  public static int PQSL_VISTABILBPU2_E_S = 7;
  public static int PQSL_VISTABILBPU2_TITOLO = 8;
  public static int PQSL_VISTABILBPU2_DESCRIZIONE = 9;
  public static int PQSL_VISTABILBPU2_PREVISIONE = 10;
  public static int PQSL_VISTABILBPU2_STN_INI_CO = 11;
  public static int PQSL_VISTABILBPU2_VARIAZIONI_CO = 12;
  public static int PQSL_VISTABILBPU2_RECOSTANDEFI = 13;

  // Table to contain panel selected row: VISTA BILBPR UO UT
  //
  public static int PQRY_VISTBILBUOUT = 2456;
  public static int PQSL_VISTBILBUOUT_RECRISCODINT = 0;
  public static int PQSL_VISTBILBUOUT_RECDESRICOIN = 1;
  public static int PQSL_VISTBILBUOUT_RECORAGGUOES = 2;
  public static int PQSL_VISTBILBUOUT_RECORAGGTITO = 3;
  public static int PQSL_VISTBILBUOUT_RECRAGRICOIN = 4;
  public static int PQSL_VISTBILBUOUT_RECORDESCRUO = 5;
  public static int PQSL_VISTBILBUOUT_E_S = 6;
  public static int PQSL_VISTBILBUOUT_TITOLO = 7;
  public static int PQSL_VISTBILBUOUT_DESCRIZIONE = 8;
  public static int PQSL_VISTBILBUOUT_PREVISIONE = 9;
  public static int PQSL_VISTBILBUOUT_STN_INI_CO = 10;
  public static int PQSL_VISTBILBUOUT_VARIAZIONI_CO = 11;
  public static int PQSL_VISTBILBUOUT_RECOSTANDEFI = 12;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI192 = 2457;
  public static int PQRY_PARAMETRI192_RS = 2458;
  public static int PQSL_PARAMETRI192_ROWNAMETITOL = 0;
  public static int PQSL_PARAMETRI192_ROWNAMEINTER = 1;
  public static int PQSL_PARAMETRI192_RONADATIDISP = 2;
  public static int PQSL_PARAMETRI192_ROWNAATIDISP = 3;
  public static int PQSL_PARAMETRI192_ROWNAMPERINT = 4;
  public static int PQSL_PARAMETRI192_ROWNAMPERIN2 = 5;
  public static int PQSL_PARAMETRI192_ROWNAMPERIN3 = 6;
  public static int PQSL_PARAMETRI192_ROWNAMDABISI = 7;
  public static int PQSL_PARAMETRI192_ROWNAMEVARIA = 8;
  public static int PQSL_PARAMETRI192_RONAPRANINCO = 9;
  public static int PQSL_PARAMETRI192_ROWNAMEFUNZI = 10;
  public static int PQSL_PARAMETRI192_ROWNAMESERVI = 11;
  public static int PQSL_PARAMETRI192_ROWNAMCEDICO = 12;
  public static int PQSL_PARAMETRI192_ROWNAMSETOPE = 13;
  public static int PQSL_PARAMETRI192_ROWNAMSEROPE = 14;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR80 = 2459;
  public static int PQRY_PAR80_RS = 2460;
  public static int PQSL_PAR80_ROWNAMEPARTE = 0;
  public static int PQSL_PAR80_ROWNAMEPROGR = 1;
  public static int PQSL_PAR80_ROWNAMEDAPRO = 2;
  public static int PQSL_PAR80_ROWNAMEAPROG = 3;
  public static int PQSL_PAR80_ROWNAMDABISI = 4;
  public static int PQSL_PAR80_ROWNAMDETCAP = 5;
  public static int PQSL_PAR80_ROWNAMDESINT = 6;
  public static int PQSL_PAR80_ROWNAMTOPETI = 7;
  public static int PQSL_PAR80_ROWNAMRIPESE = 8;
  public static int PQSL_PAR80_ROWNAMEVARIA = 9;
  public static int PQSL_PAR80_RONAPRANINCO = 10;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR21 = 2461;
  public static int PQRY_PAR21_RS = 2462;
  public static int PQSL_PAR21_ROWNAMEPARTE = 0;
  public static int PQSL_PAR21_ROWNAMEDAVIN = 1;
  public static int PQSL_PAR21_ROWNAMEAVINC = 2;
  public static int PQSL_PAR21_ROWNAMDABISI = 3;
  public static int PQSL_PAR21_ROWNAMDETCAP = 4;
  public static int PQSL_PAR21_ROWNAMEVARIA = 5;
  public static int PQSL_PAR21_RONAPRANINCO = 6;
  public static int PQSL_PAR21_ROWNAMDESINT = 7;
  public static int PQSL_PAR21_ROWNAMRIDEFL = 8;
  public static int PQSL_PAR21_ROWNAMTOPETI = 9;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR19 = 2463;
  public static int PQRY_PAR19_RS = 2464;
  public static int PQSL_PAR19_ROWNAMEPARTE = 0;
  public static int PQSL_PAR19_ROWNAMEDAFLE = 1;
  public static int PQSL_PAR19_ROWNAMEAFLES = 2;
  public static int PQSL_PAR19_ROWNAMDABISI = 3;
  public static int PQSL_PAR19_ROWNAMDETCAP = 4;
  public static int PQSL_PAR19_ROWNAMEVARIA = 5;
  public static int PQSL_PAR19_RONAPRANINCO = 6;
  public static int PQSL_PAR19_ROWNAMDESINT = 7;
  public static int PQSL_PAR19_ROWNAMRIDEFL = 8;
  public static int PQSL_PAR19_ROWNAMTOPETI = 9;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR5 = 2465;
  public static int PQRY_PAR5_RS = 2466;
  public static int PQSL_PAR5_ROWNAMEFINAN = 0;
  public static int PQSL_PAR5_ROWNAMTIPESP = 1;
  public static int PQSL_PAR5_ROWNAMTIDIAL = 2;
  public static int PQSL_PAR5_ROWNAMDABISI = 3;
  public static int PQSL_PAR5_ROWNAMDESINT = 4;
  public static int PQSL_PAR5_ROWNAMEDETTA = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI193 = 2467;
  public static int PQRY_PARAMETRI193_RS = 2468;
  public static int PQSL_PARAMETRI193_ROWNAMEDASER = 0;
  public static int PQSL_PARAMETRI193_ROWNAMEASERV = 1;
  public static int PQSL_PARAMETRI193_ROWNAMDABISI = 2;
  public static int PQSL_PARAMETRI193_ROWNAMDETCAP = 3;
  public static int PQSL_PARAMETRI193_ROWNAMDESINT = 4;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS68 = 2469;
  public static int PQRY_PARS68_RS = 2470;
  public static int PQSL_PARS68_NOMEOGGEPART = 0;
  public static int PQSL_PARS68_NOOGSTNUDIPA = 1;
  public static int PQSL_PARS68_NOMOGGTIESST = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI361 = 2471;
  public static int PQRY_PARAMETRI361_RS = 2472;
  public static int PQSL_PARAMETRI361_PARAMPARTE = 0;
  public static int PQSL_PARAMETRI361_PAPRESDABISI = 1;
  public static int PQSL_PARAMETRI361_PARAMDETTAGL = 2;
  public static int PQSL_PARAMETRI361_PARASERVOPER = 3;
  public static int PQSL_PARAMETRI361_PATOPECEDICO = 4;
  public static int PQSL_PARAMETRI361_PAESPLDABISI = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI349 = 2473;
  public static int PQRY_PARAMETRI349_RS = 2474;
  public static int PQSL_PARAMETRI349_PARAMPARTE = 0;
  public static int PQSL_PARAMETRI349_PARAMDETTAGL = 1;
  public static int PQSL_PARAMETRI349_PARASERVOPER = 2;
  public static int PQSL_PARAMETRI349_PATOPECEDICO = 3;
  public static int PQSL_PARAMETRI349_PARAMDAL = 4;
  public static int PQSL_PARAMETRI349_PARAMAL = 5;
  public static int PQSL_PARAMETRI349_PARAMCOMMENT = 6;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE7 = 2475;
  public static int PQRY_NEWTABLE7_RS = 2476;
  public static int PQSL_NEWTABLE7_ROWNAMTISTRE = 0;
  public static int PQSL_NEWTABLE7_ROWNAMRESEFF = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM74 = 2477;
  public static int PQRY_PARAM74_RS = 2478;
  public static int PQSL_PARAM74_ROWNAMEES = 0;
  public static int PQSL_PARAM74_ROWNAMDABISI = 1;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS42 = 2479;
  public static int PQRY_PARS42_RS = 2480;
  public static int PQSL_PARS42_NOMEOGGEANOM = 0;
  public static int PQSL_PARS42_NOMEOGGEPART = 1;
  public static int PQSL_PARS42_NOMEOGGETIPO = 2;

  // Table to contain panel selected row: Esercizi Finanziari
  //
  public static int PQRY_ESERCIFINANZ = 2481;
  public static int PQSL_ESERCIFINANZ_ESERCIZIO = 0;
  public static int PQSL_ESERCIFINANZ_DATA_APP_CONS = 1;
  public static int PQSL_ESERCIFINANZ_ABITANTI = 2;
  public static int PQSL_ESERCIFINANZ_SUPERFICIE_TOT = 3;
  public static int PQSL_ESERCIFINANZ_SUPERFICIE_URB = 4;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM145 = 2482;
  public static int PQRY_PARAM145_RS = 2483;
  public static int PQSL_PARAM145_PARAPROGSTAM = 0;
  public static int PQSL_PARAM145_PARSTANUDIPA = 1;
  public static int PQSL_PARAM145_PARAEXPINEXC = 2;
  public static int PQSL_PARAM145_PARAMFONTE = 3;
  public static int PQSL_PARAM145_PARASTAMSALV = 4;
  public static int PQSL_PARAM145_PARASALVSTAM = 5;
  public static int PQSL_PARAM145_PARANOTESTAM = 6;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUI5 = 2484;
  public static int PQSL_BILCONSEQUI5_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUI5_UT_FONDO_ANTIC_LIQUIDITA = 1;

  // Table to contain panel selected row: PARAMETRI DEF CC ESE
  //
  public static int PQRY_PARADEFCCES1 = 2485;
  public static int PQRY_PARADEFCCES1_RS = 2486;
  public static int PQSL_PARADEFCCES1_RECORDAPRI = 0;
  public static int PQSL_PARADEFCCES1_ROWNAMECODIC = 1;
  public static int PQSL_PARADEFCCES1_ROWNAMEVALOR = 2;
  public static int PQSL_PARADEFCCES1_ROWNAMEDESCR = 3;
  public static int PQSL_PARADEFCCES1_ROWNAMESI = 4;
  public static int PQSL_PARADEFCCES1_ROWNAMENO = 5;
  public static int PQSL_PARADEFCCES1_ROWNAMESTATU = 6;

  // Table to contain panel selected row: PARAMETRI DEF CC ESE
  //
  public static int PQRY_PARADEFCCESE = 2487;
  public static int PQSL_PARADEFCCESE_RECORDAPRI = 0;
  public static int PQSL_PARADEFCCESE_CODICE = 1;
  public static int PQSL_PARADEFCCESE_VALORE = 2;
  public static int PQSL_PARADEFCCESE_DESCRIZIONE = 3;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUI1 = 2488;
  public static int PQSL_BILCONSEQUI1_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUI1_IMPORTO_AA = 1;
  public static int PQSL_BILCONSEQUI1_IMPORTO_B_EST = 2;
  public static int PQSL_BILCONSEQUI1_IMPORTO_F_EST = 3;
  public static int PQSL_BILCONSEQUI1_FONDO_ANTIC_LIQUIDITA = 4;
  public static int PQSL_BILCONSEQUI1_IMPORTO_H = 5;
  public static int PQSL_BILCONSEQUI1_IMPORTO_H_EST = 6;
  public static int PQSL_BILCONSEQUI1_IMPORTO_I = 7;
  public static int PQSL_BILCONSEQUI1_IMPORTO_I_EST = 8;
  public static int PQSL_BILCONSEQUI1_IMPORTO_L = 9;
  public static int PQSL_BILCONSEQUI1_IMPORTO_M = 10;
  public static int PQSL_BILCONSEQUI1_IMPORTO_P = 11;
  public static int PQSL_BILCONSEQUI1_IMPORTO_NON_RIC = 12;
  public static int PQSL_BILCONSEQUI1_FPV_S_204 = 13;
  public static int PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCORR = 14;
  public static int PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCORR = 15;
  public static int PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CORR = 16;
  public static int PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCAP = 17;
  public static int PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCAP = 18;
  public static int PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CAP = 19;
  public static int PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO = 20;
  public static int PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO = 21;
  public static int PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI = 22;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUI4 = 2489;
  public static int PQSL_BILCONSEQUI4_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUI4_FPV_TITOLO3 = 1;
  public static int PQSL_BILCONSEQUI4_FONDO_ANTIC_LIQUIDITA = 2;
  public static int PQSL_BILCONSEQUI4_UT_FONDO_ANTIC_LIQUIDITA = 3;
  public static int PQSL_BILCONSEQUI4_FPV_E_CAP_FINANZ_DEBITO = 4;
  public static int PQSL_BILCONSEQUI4_FPV_E_INCREMENTO_ATTIVITA_FIN = 5;
  public static int PQSL_BILCONSEQUI4_FPV_S_CAP_FINANZ_DEBITO = 6;
  public static int PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO = 7;
  public static int PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO = 8;
  public static int PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI = 9;
  public static int PQSL_BILCONSEQUI4_UTILIZZO_AVANZO = 10;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUIL = 2490;
  public static int PQSL_BILCONSEQUIL_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUIL_PAGAM_AZIONI_ESEC = 1;
  public static int PQSL_BILCONSEQUIL_ACC_TRIBUTI = 2;
  public static int PQSL_BILCONSEQUIL_FONDO_CRED_DUBBIA_ESIG = 3;
  public static int PQSL_BILCONSEQUIL_FONDI_RISERVA = 4;
  public static int PQSL_BILCONSEQUIL_FONDI_SPECIALI = 5;
  public static int PQSL_BILCONSEQUIL_FONDI_RINNOVI_CONTR = 6;
  public static int PQSL_BILCONSEQUIL_FONDO_AMM_TITOLI = 7;
  public static int PQSL_BILCONSEQUIL_VINCOLI_DA_LEGGI = 8;
  public static int PQSL_BILCONSEQUIL_VINCOLI_DA_TRASF = 9;
  public static int PQSL_BILCONSEQUIL_VINCOLI_DA_MUTUI = 10;
  public static int PQSL_BILCONSEQUIL_VINCOLI_ATTR_ENTE = 11;
  public static int PQSL_BILCONSEQUIL_VINCOLI_ALTRI = 12;
  public static int PQSL_BILCONSEQUIL_TOT_DESTINATO_INV = 13;
  public static int PQSL_BILCONSEQUIL_ALTRI_FONDI_NAC = 14;

  // Table to contain panel selected row: BIL ACC FCDDE
  //
  public static int PQRY_BILACCFCDDE = 2491;
  public static int PQSL_BILACCFCDDE_ESERCIZIO = 0;
  public static int PQSL_BILACCFCDDE_IMPORTO_A_10101 = 1;
  public static int PQSL_BILACCFCDDE_IMPORTO_B_10101 = 2;
  public static int PQSL_BILACCFCDDE_IMPORTO_D_10101 = 3;
  public static int PQSL_BILACCFCDDE_IMPORTO_E_10101 = 4;
  public static int PQSL_BILACCFCDDE_IMPORTO_I = 5;
  public static int PQSL_BILACCFCDDE_IMPORTO_L = 6;
  public static int PQSL_BILACCFCDDE_IMPORTO_M = 7;

  // Table to contain panel selected row: WRK BIL CONS TESO
  //
  public static int PQRY_WRKBILCONTES = 2492;
  public static int PQSL_WRKBILCONTES_ESERCIZIO = 0;
  public static int PQSL_WRKBILCONTES_FONDO_CASSA_RES = 1;
  public static int PQSL_WRKBILCONTES_FONDO_CASSA_COMP = 2;
  public static int PQSL_WRKBILCONTES_RISCOSSIONI_DA_REG = 3;
  public static int PQSL_WRKBILCONTES_PAGAMENTI_DA_REG = 4;
  public static int PQSL_WRKBILCONTES_PAGAMENTI_AZIONI_ESEC = 5;
  public static int PQSL_WRKBILCONTES_FONDO_TESO_PROV = 6;
  public static int PQSL_WRKBILCONTES_RISC_TESO_PROV = 7;
  public static int PQSL_WRKBILCONTES_PAG_TESO_PROV = 8;
  public static int PQSL_WRKBILCONTES_DISPO_TESO_PROV = 9;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM149 = 2493;
  public static int PQRY_PARAM149_RS = 2494;
  public static int PQSL_PARAM149_ROWNAMEES = 0;
  public static int PQSL_PARAM149_ROWNAMDETCAP = 1;
  public static int PQSL_PARAM149_RONASOREDARI = 2;
  public static int PQSL_PARAM149_RONAESIMACDC = 3;

  // Table to contain panel selected row: PARAMETRI DEF CONS
  //
  public static int PQRY_PARAMDEFCONS = 2495;
  public static int PQSL_PARAMDEFCONS_ESERCIZIO = 0;
  public static int PQSL_PARAMDEFCONS_PARAMETRO = 1;
  public static int PQSL_PARAMDEFCONS_PARAMEVISUAL = 2;
  public static int PQSL_PARAMDEFCONS_DESCRIZIONE = 3;
  public static int PQSL_PARAMDEFCONS_SEGNO_POSITIVITA = 4;
  public static int PQSL_PARAMDEFCONS_VALORE = 5;
  public static int PQSL_PARAMDEFCONS_SOGLIA = 6;
  public static int PQSL_PARAMDEFCONS_POSITIVO_NEGATIVO = 7;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA2 = 2496;
  public static int PQSL_PARBILALRIA2_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA2_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA2_ESERCIZIO = 2;
  public static int PQSL_PARBILALRIA2_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRIA2_S = 4;
  public static int PQSL_PARBILALRIA2_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRIA2_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA2_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA2_E = 8;
  public static int PQSL_PARBILALRIA2_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA2_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA2_IMPORTO_1 = 11;
  public static int PQSL_PARBILALRIA2_IMPORTO_2 = 12;
  public static int PQSL_PARBILALRIA2_IMPORTO_3 = 13;
  public static int PQSL_PARBILALRIA2_IMPORTO_4 = 14;
  public static int PQSL_PARBILALRIA2_IMPORTO_5 = 15;
  public static int PQSL_PARBILALRIA2_IMPORTO_6 = 16;
  public static int PQSL_PARBILALRIA2_IMPORTO_7 = 17;
  public static int PQSL_PARBILALRIA2_PABIALRIAMOR = 18;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA3 = 2497;
  public static int PQSL_PARBILALRIA3_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA3_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA3_ESERCIZIO = 2;
  public static int PQSL_PARBILALRIA3_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRIA3_S = 4;
  public static int PQSL_PARBILALRIA3_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRIA3_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA3_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA3_E = 8;
  public static int PQSL_PARBILALRIA3_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA3_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA3_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_PARBILALRIA3_IMPORTO_1 = 12;
  public static int PQSL_PARBILALRIA3_IMPORTO_2 = 13;
  public static int PQSL_PARBILALRIA3_IMPORTO_3 = 14;
  public static int PQSL_PARBILALRIA3_IMPORTO_4 = 15;
  public static int PQSL_PARBILALRIA3_IMPORTO_5 = 16;
  public static int PQSL_PARBILALRIA3_IMPORTO_6 = 17;
  public static int PQSL_PARBILALRIA3_IMPORTO_7 = 18;
  public static int PQSL_PARBILALRIA3_PABIALRIAMOR = 19;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA4 = 2498;
  public static int PQSL_PARBILALRIA4_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA4_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA4_RAGGRUPPAMENTO = 2;
  public static int PQSL_PARBILALRIA4_ESERCIZIO = 3;
  public static int PQSL_PARBILALRIA4_IMPORTO_1 = 4;
  public static int PQSL_PARBILALRIA4_IMPORTO_2 = 5;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA1 = 2499;
  public static int PQSL_PARBILALRIA1_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA1_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA1_ESERCIZIO = 2;
  public static int PQSL_PARBILALRIA1_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRIA1_S = 4;
  public static int PQSL_PARBILALRIA1_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRIA1_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA1_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA1_E = 8;
  public static int PQSL_PARBILALRIA1_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA1_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA1_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_PARBILALRIA1_IMPORTO_1 = 12;
  public static int PQSL_PARBILALRIA1_IMPORTO_2 = 13;
  public static int PQSL_PARBILALRIA1_IMPORTO_3 = 14;
  public static int PQSL_PARBILALRIA1_IMPORTO_4 = 15;
  public static int PQSL_PARBILALRIA1_IMPORTO_5 = 16;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIAM = 2500;
  public static int PQSL_PARBILALRIAM_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIAM_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIAM_RAGGRUPPAMENTO = 2;
  public static int PQSL_PARBILALRIAM_ESERCIZIO = 3;
  public static int PQSL_PARBILALRIAM_IMPORTO_1 = 4;

  // Table to contain panel selected row: Parametri IN
  //
  public static int PQRY_PARAMETRIIN2 = 2501;
  public static int PQRY_PARAMETRIIN2_RS = 2502;
  public static int PQSL_PARAMETRIIN2_ROWNAMESTAMP = 0;
  public static int PQSL_PARAMETRIIN2_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRIIN2_RONAMAOMIECS = 2;
  public static int PQSL_PARAMETRIIN2_ROWNAMDATELA = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM72 = 2503;
  public static int PQRY_PARAM72_RS = 2504;
  public static int PQSL_PARAM72_ROWNAMEES = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI127 = 2505;
  public static int PQRY_PARAMETRI127_RS = 2506;
  public static int PQSL_PARAMETRI127_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMETRI127_RONAPAPEAZES = 1;
  public static int PQSL_PARAMETRI127_ROWNAMECOPER = 2;
  public static int PQSL_PARAMETRI127_ROWNAMECCONS = 3;
  public static int PQSL_PARAMETRI127_ROWNAQRIGECA = 4;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM73 = 2507;
  public static int PQRY_PARAM73_RS = 2508;
  public static int PQSL_PARAM73_ROWNAMEES = 0;
  public static int PQSL_PARAM73_ROWNAMEDETTA = 1;
  public static int PQSL_PARAM73_ROWNAMMAGOMI = 2;

  // Table to contain panel selected row: WRK QGRS
  //
  public static int PQRY_WRKQGRS1 = 2509;
  public static int PQSL_WRKQGRS1_ESERCIZIO = 0;
  public static int PQSL_WRKQGRS1_AVA_COR_INI = 1;
  public static int PQSL_WRKQGRS1_AVA_COR_DEF = 2;
  public static int PQSL_WRKQGRS1_MUTUI_INI = 3;
  public static int PQSL_WRKQGRS1_MUTUI_DEF = 4;
  public static int PQSL_WRKQGRS1_MUTUI_ACC = 5;
  public static int PQSL_WRKQGRS1_MUTUI_RIS = 6;
  public static int PQSL_WRKQGRS1_MUTUI_RES_CO = 7;
  public static int PQSL_WRKQGRS1_MUTUI_CON = 8;
  public static int PQSL_WRKQGRS1_MUTUI_RES_RE = 9;
  public static int PQSL_WRKQGRS1_ONERI_INI = 10;
  public static int PQSL_WRKQGRS1_ONERI_DEF = 11;
  public static int PQSL_WRKQGRS1_ONERI_ACC = 12;
  public static int PQSL_WRKQGRS1_ONERI_RIS = 13;
  public static int PQSL_WRKQGRS1_ONERI_RES_CO = 14;
  public static int PQSL_WRKQGRS1_ONERI_CON = 15;
  public static int PQSL_WRKQGRS1_ONERI_RES_RE = 16;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE11 = 2510;
  public static int PQRY_NEWTABLE11_RS = 2511;
  public static int PQSL_NEWTABLE11_ROWNAMESERVI = 0;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR89 = 2512;
  public static int PQRY_PAR89_RS = 2513;
  public static int PQSL_PAR89_ROWNAMEPARTE = 0;
  public static int PQSL_PAR89_ROWNAMEMOTIV = 1;
  public static int PQSL_PAR89_ROWNAMTOPEMO = 2;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE9 = 2514;
  public static int PQRY_NEWTABLE9_RS = 2515;
  public static int PQSL_NEWTABLE9_ROWNAMESERVI = 0;
  public static int PQSL_NEWTABLE9_ROWNAMDESINT = 1;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR3 = 2516;
  public static int PQRY_PAR3_RS = 2517;
  public static int PQSL_PAR3_ROWNAMEPARTE = 0;
  public static int PQSL_PAR3_ROWNAMEMOTIV = 1;
  public static int PQSL_PAR3_ROWNAMTOPEMO = 2;
  public static int PQSL_PAR3_ROWNAMDESINT = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM171 = 2518;
  public static int PQRY_PARAM171_RS = 2519;
  public static int PQSL_PARAM171_PARAPROGSTAM = 0;
  public static int PQSL_PARAM171_PARAMISSTITO = 1;
  public static int PQSL_PARAM171_PARAPROGTIPO = 2;
  public static int PQSL_PARAM171_PARASUDSUPUO = 3;
  public static int PQSL_PARAM171_PARAPROGUNIT = 4;
  public static int PQSL_PARAM171_PARSTANUDIPA = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI186 = 2520;
  public static int PQRY_PARAMETRI186_RS = 2521;
  public static int PQSL_PARAMETRI186_ROWNAMEPERIO = 0;
  public static int PQSL_PARAMETRI186_ROWNAMDATVAR = 1;
  public static int PQSL_PARAMETRI186_ROWNAMDESBIL = 2;
  public static int PQSL_PARAMETRI186_ROWNAMDESIMP = 3;
  public static int PQSL_PARAMETRI186_ROWNAMEBILAN = 4;
  public static int PQSL_PARAMETRI186_ROWNAMEIMPEG = 5;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR15 = 2522;
  public static int PQRY_PAR15_RS = 2523;
  public static int PQSL_PAR15_ROWNAMUNIPRO = 0;
  public static int PQSL_PAR15_ROWNAMNUMPRO = 1;
  public static int PQSL_PAR15_ROWNAMANNPRO = 2;
  public static int PQSL_PAR15_ROWNAMSOCODI = 3;
  public static int PQSL_PAR15_ROWNAMETIPBI = 4;
  public static int PQSL_PAR15_ROWNAMEVARIA = 5;
  public static int PQSL_PAR15_ROWNAMSEDDEL = 6;
  public static int PQSL_PAR15_ROWNAMNUMDEL = 7;
  public static int PQSL_PAR15_ROWNAMANNDEL = 8;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO7 = 2524;
  public static int PQSL_VARCOMPRO7_RECORVARCOES = 0;
  public static int PQSL_VARCOMPRO7_RECOCAPIARTI = 1;
  public static int PQSL_VARCOMPRO7_RECOVARCCAPI = 2;
  public static int PQSL_VARCOMPRO7_RECOVARCARTI = 3;
  public static int PQSL_VARCOMPRO7_RECVARPROCOM = 4;
  public static int PQSL_VARCOMPRO7_RECVARPROCAS = 5;
  public static int PQSL_VARCOMPRO7_RECORBILESER = 6;
  public static int PQSL_VARCOMPRO7_RECORBILDISP = 7;
  public static int PQSL_VARCOMPRO7_RECOBILDISCA = 8;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN = 2525;
  public static int PQSL_BILFIN_RECOBILFINES = 0;
  public static int PQSL_BILFIN_RECOCAPIARTI = 1;
  public static int PQSL_BILFIN_RECBILFINFIN = 2;
  public static int PQSL_BILFIN_RECBILFINOPE = 3;
  public static int PQSL_BILFIN_RECBILFINDIS = 4;
  public static int PQSL_BILFIN_RECBILFINVAR = 5;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR17 = 2526;
  public static int PQRY_PAR17_RS = 2527;
  public static int PQSL_PAR17_ROWNAMUNIPRO = 0;
  public static int PQSL_PAR17_ROWNAMNUMPRO = 1;
  public static int PQSL_PAR17_ROWNAMANNPRO = 2;
  public static int PQSL_PAR17_ROWNAMETIPBI = 3;
  public static int PQSL_PAR17_RONAESVADAGS = 4;
  public static int PQSL_PAR17_ROWNAMTIPVAR = 5;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL2 = 2528;
  public static int PQSL_DEL2_RECORDPROPOS = 0;
  public static int PQSL_DEL2_RECORDDELIBE = 1;
  public static int PQSL_DEL2_RECDELANNPRO = 2;
  public static int PQSL_DEL2_RECDELNUMPRO = 3;
  public static int PQSL_DEL2_RECDELUNIPRO = 4;
  public static int PQSL_DEL2_RECORANNODEL = 5;
  public static int PQSL_DEL2_RECORNUMEDEL = 6;
  public static int PQSL_DEL2_RECORSEDEDEL = 7;
  public static int PQSL_DEL2_RECORDFAKE = 8;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL5 = 2529;
  public static int PQSL_BIL5_RECORVARCOES = 0;
  public static int PQSL_BIL5_RECOCAPIARTI = 1;
  public static int PQSL_BIL5_RECOVARCCAPI = 2;
  public static int PQSL_BIL5_RECOVARCARTI = 3;
  public static int PQSL_BIL5_RECVARPROCOM = 4;
  public static int PQSL_BIL5_RECVARPROCAS = 5;
  public static int PQSL_BIL5_RECORBILESER = 6;
  public static int PQSL_BIL5_RECORBILDISP = 7;
  public static int PQSL_BIL5_RECOBILDISCA = 8;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN4 = 2530;
  public static int PQSL_BILFIN4_RECOBILFINES = 0;
  public static int PQSL_BILFIN4_RECOCAPIARTI = 1;
  public static int PQSL_BILFIN4_RECBILFINFIN = 2;
  public static int PQSL_BILFIN4_RECBILFINOPE = 3;
  public static int PQSL_BILFIN4_RECBILFINDIS = 4;
  public static int PQSL_BILFIN4_RECBILFINVAR = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI326 = 2531;
  public static int PQRY_PARAMETRI326_RS = 2532;
  public static int PQSL_PARAMETRI326_PARASEDEDELI = 0;
  public static int PQSL_PARAMETRI326_PARANUMEDELI = 1;
  public static int PQSL_PARAMETRI326_PARAANNODELI = 2;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM6 = 2533;
  public static int PQSL_VARCOM6_RECCAPCODSTR = 0;
  public static int PQSL_VARCOM6_IVLIVELLO = 1;
  public static int PQSL_VARCOM6_RECORDCAPITO = 2;
  public static int PQSL_VARCOM6_RECORCAPARTI = 3;
  public static int PQSL_VARCOM6_RECORSTNATTU = 4;
  public static int PQSL_VARCOM6_VARIAZIONI = 5;
  public static int PQSL_VARCOM6_RESIDUI = 6;
  public static int PQSL_VARCOM6_RECSTNATTCAS = 7;
  public static int PQSL_VARCOM6_VARIAZICASSA = 8;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM9 = 2534;
  public static int PQSL_VARCOM9_RECCAPCODSTR = 0;
  public static int PQSL_VARCOM9_IVLIVELLO = 1;
  public static int PQSL_VARCOM9_RECORDCAPITO = 2;
  public static int PQSL_VARCOM9_RECORCAPARTI = 3;
  public static int PQSL_VARCOM9_RECORSTNATTU = 4;
  public static int PQSL_VARCOM9_VARIAZIONI = 5;
  public static int PQSL_VARCOM9_RESIDUI = 6;
  public static int PQSL_VARCOM9_RECSTNATTCAS = 7;
  public static int PQSL_VARCOM9_VARIAZICASSA = 8;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM10 = 2535;
  public static int PQSL_VARCOM10_RECOVARCPROG = 0;
  public static int PQSL_VARCOM10_RECORDDESCRI = 1;
  public static int PQSL_VARCOM10_RECORDIMPORT = 2;
  public static int PQSL_VARCOM10_RECVARIMPCAS = 3;
  public static int PQSL_VARCOM10_RECOTIPOVARI = 4;
  public static int PQSL_VARCOM10_RECODESCTIPO = 5;
  public static int PQSL_VARCOM10_RETIMOVBTIIM = 6;
  public static int PQSL_VARCOM10_RECVARDDATRE = 7;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO1 = 2536;
  public static int PQSL_VARCOMPRO1_PROGRPRIMVAR = 0;
  public static int PQSL_VARCOMPRO1_ESERCIZIO = 1;
  public static int PQSL_VARCOMPRO1_ES = 2;
  public static int PQSL_VARCOMPRO1_CAPITOLO = 3;
  public static int PQSL_VARCOMPRO1_ARTICOLO = 4;
  public static int PQSL_VARCOMPRO1_ANNODEL = 5;
  public static int PQSL_VARCOMPRO1_NUMERODEL = 6;
  public static int PQSL_VARCOMPRO1_SEDEDEL = 7;
  public static int PQSL_VARCOMPRO1_DATAREG = 8;
  public static int PQSL_VARCOMPRO1_IMPORTO = 9;
  public static int PQSL_VARCOMPRO1_DESCRIZIONE = 10;
  public static int PQSL_VARCOMPRO1_TIPOVAR = 11;
  public static int PQSL_VARCOMPRO1_ANNOPROPOSTA = 12;
  public static int PQSL_VARCOMPRO1_UNITAPROPONE = 13;
  public static int PQSL_VARCOMPRO1_NUMEROPROPOS = 14;
  public static int PQSL_VARCOMPRO1_CONSSVILUPPO = 15;
  public static int PQSL_VARCOMPRO1_DDATAREG = 16;
  public static int PQSL_VARCOMPRO1_ISTITUZIONNC = 17;
  public static int PQSL_VARCOMPRO1_PROGETTOID = 18;
  public static int PQSL_VARCOMPRO1_FINANZIAMENTO = 19;
  public static int PQSL_VARCOMPRO1_OPERA = 20;
  public static int PQSL_VARCOMPRO1_PROGUNITORGA = 21;
  public static int PQSL_VARCOMPRO1_UTENTEINSERI = 22;
  public static int PQSL_VARCOMPRO1_DATAINSERIME = 23;
  public static int PQSL_VARCOMPRO1_UTENTULTIAGG = 24;
  public static int PQSL_VARCOMPRO1_DATAULTIMAGG = 25;
  public static int PQSL_VARCOMPRO1_VARBIL = 26;
  public static int PQSL_VARCOMPRO1_SCHEDOBIETID = 27;
  public static int PQSL_VARCOMPRO1_IMPORTOCASSA = 28;
  public static int PQSL_VARCOMPRO1_INSERTED = 29;
  public static int PQSL_VARCOMPRO1_PROGRESSIVO = 30;
  public static int PQSL_VARCOMPRO1_ANNOIMP = 31;
  public static int PQSL_VARCOMPRO1_NUMEROIMP = 32;
  public static int PQSL_VARCOMPRO1_ANNOESIGIBIL = 33;
  public static int PQSL_VARCOMPRO1_PROGREVARIMP = 34;
  public static int PQSL_VARCOMPRO1_ANNOACC = 35;
  public static int PQSL_VARCOMPRO1_NUMEROACC = 36;
  public static int PQSL_VARCOMPRO1_PROGREVARACC = 37;
  public static int PQSL_VARCOMPRO1_OBIETTIVGEST = 38;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO10 = 2537;
  public static int PQSL_VARCOMPRO10_ESERCIZIO = 0;
  public static int PQSL_VARCOMPRO10_ES = 1;
  public static int PQSL_VARCOMPRO10_PROGRPRIMVAR = 2;
  public static int PQSL_VARCOMPRO10_IMPORTO = 3;
  public static int PQSL_VARCOMPRO10_CAPITOLO = 4;
  public static int PQSL_VARCOMPRO10_ARTICOLO = 5;
  public static int PQSL_VARCOMPRO10_DESCRIZIONE = 6;
  public static int PQSL_VARCOMPRO10_TIPOVAR = 7;
  public static int PQSL_VARCOMPRO10_PROGETTOID = 8;
  public static int PQSL_VARCOMPRO10_FINANZIAMENTO = 9;
  public static int PQSL_VARCOMPRO10_OPERA = 10;
  public static int PQSL_VARCOMPRO10_ISTITUZIONNC = 11;
  public static int PQSL_VARCOMPRO10_PROGUNITORGA = 12;
  public static int PQSL_VARCOMPRO10_PROGRESSIVO = 13;
  public static int PQSL_VARCOMPRO10_ANNOPROPOSTA = 14;
  public static int PQSL_VARCOMPRO10_UNITAPROPONE = 15;
  public static int PQSL_VARCOMPRO10_NUMEROPROPOS = 16;
  public static int PQSL_VARCOMPRO10_ANNODEL = 17;
  public static int PQSL_VARCOMPRO10_NUMERODEL = 18;
  public static int PQSL_VARCOMPRO10_SEDEDEL = 19;

  // Table to contain panel selected row: Pos Pars
  //
  public static int PQRY_POSPARS2 = 2538;
  public static int PQRY_POSPARS2_RS = 2539;
  public static int PQSL_POSPARS2_NOMEOGGETTES = 0;
  public static int PQSL_POSPARS2_NOMEOGGECAPI = 1;
  public static int PQSL_POSPARS2_NOMEOGGEARTI = 2;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM117 = 2540;
  public static int PQRY_PARAM117_RS = 2541;
  public static int PQSL_PARAM117_ESTRTIPOIMPO = 0;
  public static int PQSL_PARAM117_ESTREMIPARTE = 1;
  public static int PQSL_PARAM117_ESTRANCSUPLU = 2;
  public static int PQSL_PARAM117_ESTRESEDEDEL = 3;
  public static int PQSL_PARAM117_ESTRENUMEDEL = 4;
  public static int PQSL_PARAM117_ESTREANNODEL = 5;
  public static int PQSL_PARAM117_ESTRUNITPROP = 6;
  public static int PQSL_PARAM117_ESTRNUMEPROP = 7;
  public static int PQSL_PARAM117_ESTRANNOPROP = 8;
  public static int PQSL_PARAM117_ESTRTIPOVARI = 9;
  public static int PQSL_PARAM117_ESTRANCHPLUR = 10;
  public static int PQSL_PARAM117_ESTTIPVARDIV = 11;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO6 = 2542;
  public static int PQSL_VARCOMPRO6_PROGRPRIMVAR = 0;
  public static int PQSL_VARCOMPRO6_ESERCIZIO = 1;
  public static int PQSL_VARCOMPRO6_ES = 2;
  public static int PQSL_VARCOMPRO6_CAPITOLO = 3;
  public static int PQSL_VARCOMPRO6_ARTICOLO = 4;
  public static int PQSL_VARCOMPRO6_ANNODEL = 5;
  public static int PQSL_VARCOMPRO6_NUMERODEL = 6;
  public static int PQSL_VARCOMPRO6_SEDEDEL = 7;
  public static int PQSL_VARCOMPRO6_DATAREG = 8;
  public static int PQSL_VARCOMPRO6_IMPORTO = 9;
  public static int PQSL_VARCOMPRO6_DESCRIZIONE = 10;
  public static int PQSL_VARCOMPRO6_TIPOVAR = 11;
  public static int PQSL_VARCOMPRO6_ANNOPROPOSTA = 12;
  public static int PQSL_VARCOMPRO6_UNITAPROPONE = 13;
  public static int PQSL_VARCOMPRO6_NUMEROPROPOS = 14;
  public static int PQSL_VARCOMPRO6_CONSSVILUPPO = 15;
  public static int PQSL_VARCOMPRO6_DDATAREG = 16;
  public static int PQSL_VARCOMPRO6_ISTITUZIONNC = 17;
  public static int PQSL_VARCOMPRO6_PROGETTOID = 18;
  public static int PQSL_VARCOMPRO6_FINANZIAMENTO = 19;
  public static int PQSL_VARCOMPRO6_OPERA = 20;
  public static int PQSL_VARCOMPRO6_PROGUNITORGA = 21;
  public static int PQSL_VARCOMPRO6_UTENTEINSERI = 22;
  public static int PQSL_VARCOMPRO6_DATAINSERIME = 23;
  public static int PQSL_VARCOMPRO6_UTENTULTIAGG = 24;
  public static int PQSL_VARCOMPRO6_DATAULTIMAGG = 25;
  public static int PQSL_VARCOMPRO6_VARBIL = 26;
  public static int PQSL_VARCOMPRO6_SCHEDOBIETID = 27;
  public static int PQSL_VARCOMPRO6_IMPORTOCASSA = 28;
  public static int PQSL_VARCOMPRO6_INSERTED = 29;
  public static int PQSL_VARCOMPRO6_PROGRESSIVO = 30;
  public static int PQSL_VARCOMPRO6_ANNOIMP = 31;
  public static int PQSL_VARCOMPRO6_NUMEROIMP = 32;
  public static int PQSL_VARCOMPRO6_ANNOESIGIBIL = 33;
  public static int PQSL_VARCOMPRO6_PROGREVARIMP = 34;
  public static int PQSL_VARCOMPRO6_ANNOACC = 35;
  public static int PQSL_VARCOMPRO6_NUMEROACC = 36;
  public static int PQSL_VARCOMPRO6_PROGREVARACC = 37;
  public static int PQSL_VARCOMPRO6_OBIETTIVGEST = 38;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO11 = 2543;
  public static int PQSL_VARCOMPRO11_ESERCIZIO = 0;
  public static int PQSL_VARCOMPRO11_ES = 1;
  public static int PQSL_VARCOMPRO11_PROGRPRIMVAR = 2;
  public static int PQSL_VARCOMPRO11_IMPORTO = 3;
  public static int PQSL_VARCOMPRO11_CAPITOLO = 4;
  public static int PQSL_VARCOMPRO11_ARTICOLO = 5;
  public static int PQSL_VARCOMPRO11_DESCRIZIONE = 6;
  public static int PQSL_VARCOMPRO11_TIPOVAR = 7;
  public static int PQSL_VARCOMPRO11_PROGETTOID = 8;
  public static int PQSL_VARCOMPRO11_FINANZIAMENTO = 9;
  public static int PQSL_VARCOMPRO11_OPERA = 10;
  public static int PQSL_VARCOMPRO11_ISTITUZIONNC = 11;
  public static int PQSL_VARCOMPRO11_PROGUNITORGA = 12;
  public static int PQSL_VARCOMPRO11_PROGRESSIVO = 13;
  public static int PQSL_VARCOMPRO11_ANNOPROPOSTA = 14;
  public static int PQSL_VARCOMPRO11_UNITAPROPONE = 15;
  public static int PQSL_VARCOMPRO11_NUMEROPROPOS = 16;

  // Table to contain panel selected row: Pvb Schede Obiettivi
  //
  public static int PQRY_PVBSCHEDOBIE = 2544;
  public static int PQSL_PVBSCHEDOBIE_PROGRESSIVO = 0;
  public static int PQSL_PVBSCHEDOBIE_ESERCIZIO = 1;
  public static int PQSL_PVBSCHEDOBIE_ES = 2;
  public static int PQSL_PVBSCHEDOBIE_CAPITOLO = 3;
  public static int PQSL_PVBSCHEDOBIE_ARTICOLO = 4;
  public static int PQSL_PVBSCHEDOBIE_PROGRESSIPVB = 5;
  public static int PQSL_PVBSCHEDOBIE_PROGRESCHEDA = 6;
  public static int PQSL_PVBSCHEDOBIE_IMPORTO = 7;
  public static int PQSL_PVBSCHEDOBIE_CASSA = 8;

  // Table to contain panel selected row: Pos Pars
  //
  public static int PQRY_POSPARS1 = 2545;
  public static int PQRY_POSPARS1_RS = 2546;
  public static int PQSL_POSPARS1_NOMEOGGETTES = 0;
  public static int PQSL_POSPARS1_NOMEOGGECAPI = 1;
  public static int PQSL_POSPARS1_NOMEOGGEARTI = 2;

  // Table to contain panel selected row: BIL VARCOMPRO
  //
  public static int PQRY_BILVARCOMPRO = 2547;
  public static int PQSL_BILVARCOMPRO_RECORDPARTE = 0;
  public static int PQSL_BILVARCOMPRO_RECBILVARCAP = 1;
  public static int PQSL_BILVARCOMPRO_RECBILVARART = 2;
  public static int PQSL_BILVARCOMPRO_REBIVASTINCO = 3;
  public static int PQSL_BILVARCOMPRO_RECBILVAVACO = 4;
  public static int PQSL_BILVARCOMPRO_RECOBILVARCO = 5;
  public static int PQSL_BILVARCOMPRO_RECBILVAASCO = 6;
  public static int PQSL_BILVARCOMPRO_RECBILVARDIS = 7;
  public static int PQSL_BILVARCOMPRO_REBIVAREDAIM = 8;
  public static int PQSL_BILVARCOMPRO_REBIVAVAREDI = 9;
  public static int PQSL_BILVARCOMPRO_RECBILVACOIM = 10;
  public static int PQSL_BILVARCOMPRO_REBIVAASCOIM = 11;
  public static int PQSL_BILVARCOMPRO_REBIVAREDAST = 12;
  public static int PQSL_BILVARCOMPRO_REBIVAVAREDS = 13;
  public static int PQSL_BILVARCOMPRO_RECBILVACOST = 14;
  public static int PQSL_BILVARCOMPRO_REBIVAASCOST = 15;
  public static int PQSL_BILVARCOMPRO_REBIVASTINCP = 16;
  public static int PQSL_BILVARCOMPRO_REBIVAVACOPU = 17;
  public static int PQSL_BILVARCOMPRO_RECBILVACOPU = 18;
  public static int PQSL_BILVARCOMPRO_REBIVAASCOPU = 19;
  public static int PQSL_BILVARCOMPRO_RECBILVAIMPU = 20;
  public static int PQSL_BILVARCOMPRO_REBIVADIPUSP = 21;
  public static int PQSL_BILVARCOMPRO_REBIVASTINCA = 22;
  public static int PQSL_BILVARCOMPRO_RECBILVAVACA = 23;
  public static int PQSL_BILVARCOMPRO_RECOBILVARCA = 24;
  public static int PQSL_BILVARCOMPRO_RECBILVAASCA = 25;
  public static int PQSL_BILVARCOMPRO_RECBILVADICA = 26;
  public static int PQSL_BILVARCOMPRO_REBIVAREINSP = 27;
  public static int PQSL_BILVARCOMPRO_REBIVADICCRS = 28;

  // Table to contain panel selected row: GEN VAR CRONO
  //
  public static int PQRY_GENVARCRONO1 = 2548;
  public static int PQSL_GENVARCRONO1_NUMERORIGA = 0;
  public static int PQSL_GENVARCRONO1_REGEVACRCRID = 1;
  public static int PQSL_GENVARCRONO1_REGEVACRPRIM = 2;
  public static int PQSL_GENVARCRONO1_REGEVACRESPL = 3;
  public static int PQSL_GENVARCRONO1_REGEVACRCOST = 4;
  public static int PQSL_GENVARCRONO1_REGEVACRCOPC = 5;
  public static int PQSL_GENVARCRONO1_RECGENVACRFI = 6;
  public static int PQSL_GENVARCRONO1_RECGENVACRCA = 7;
  public static int PQSL_GENVARCRONO1_RECGENVACRAR = 8;
  public static int PQSL_GENVARCRONO1_RECGENVACROP = 9;
  public static int PQSL_GENVARCRONO1_REGEVACRANVA = 10;
  public static int PQSL_GENVARCRONO1_RECGENVACRIM = 11;
  public static int PQSL_GENVARCRONO1_REGEVACRESIS = 12;
  public static int PQSL_GENVARCRONO1_RECGENVACRDE = 13;
  public static int PQSL_GENVARCRONO1_REGEVACRTIVA = 14;
  public static int PQSL_GENVARCRONO1_REGEVACRIMPU = 15;
  public static int PQSL_GENVARCRONO1_REGEVACRIMRE = 16;

  // Table to contain panel selected row: WRK GEN VAR CRONO VARIMP
  //
  public static int PQRY_WRKGENVACRV1 = 2549;
  public static int PQSL_WRKGENVACRV1_CODICESTRUTT = 0;
  public static int PQSL_WRKGENVACRV1_CODPIANOCONT = 1;
  public static int PQSL_WRKGENVACRV1_CAPITOLO = 2;
  public static int PQSL_WRKGENVACRV1_ARTICOLO = 3;
  public static int PQSL_WRKGENVACRV1_OPERA = 4;
  public static int PQSL_WRKGENVACRV1_FINANZIAMENTO = 5;
  public static int PQSL_WRKGENVACRV1_NUMERO_IMP = 6;
  public static int PQSL_WRKGENVACRV1_ANNO_IMP = 7;
  public static int PQSL_WRKGENVACRV1_IMP_DA_REISCR_STN = 8;
  public static int PQSL_WRKGENVACRV1_RECORNUMSUBI = 9;
  public static int PQSL_WRKGENVACRV1_RECOANNOSUBI = 10;
  public static int PQSL_WRKGENVACRV1_ORDNUMEROSUB = 11;
  public static int PQSL_WRKGENVACRV1_ORDANNOSUBIM = 12;
  public static int PQSL_WRKGENVACRV1_IMPORTO_VARIAZIONE = 13;
  public static int PQSL_WRKGENVACRV1_IMPORTVARIMP = 14;
  public static int PQSL_WRKGENVACRV1_PROGR_SESSIONE = 15;
  public static int PQSL_WRKGENVACRV1_NUMERO_SUBIMP = 16;
  public static int PQSL_WRKGENVACRV1_ANNO_SUBIMP = 17;
  public static int PQSL_WRKGENVACRV1_DISPONIBILITA = 18;
  public static int PQSL_WRKGENVACRV1_CRONOPROGRAMMA_ID = 19;
  public static int PQSL_WRKGENVACRV1_PROGRESSIVO_IMPUTAZIONE = 20;
  public static int PQSL_WRKGENVACRV1_ESERCIZIO_PLUR = 21;
  public static int PQSL_WRKGENVACRV1_TIPO_VAR_CRONO = 22;
  public static int PQSL_WRKGENVACRV1_IMPORTO_VAR_CRONO = 23;
  public static int PQSL_WRKGENVACRV1_NUM_RIGA_VAR_CRONO = 24;
  public static int PQSL_WRKGENVACRV1_RAGGRUPPAMEN = 25;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS27 = 2550;
  public static int PQRY_PARS27_RS = 2551;
  public static int PQSL_PARS27_NOMOGGSEDDEL = 0;
  public static int PQSL_PARS27_NOMOGGNUMDEL = 1;
  public static int PQSL_PARS27_NOMOGGANNDEL = 2;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS86 = 2552;
  public static int PQRY_PARS86_RS = 2553;
  public static int PQSL_PARS86_NOMEOGGEPROP = 0;
  public static int PQSL_PARS86_NOMEOGGENUME = 1;
  public static int PQSL_PARS86_NOMEOGGEANNO = 2;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS87 = 2554;
  public static int PQRY_PARS87_RS = 2555;
  public static int PQSL_PARS87_NOMEOGGEDESC = 0;
  public static int PQSL_PARS87_NOMOGGDATREG = 1;
  public static int PQSL_PARS87_NOMOGGTIPVAR = 2;

  // Table to contain panel selected row: Parametri Variazioni Impegnabile
  //
  public static int PQRY_PARAVARIIMP1 = 2556;
  public static int PQRY_PARAVARIIMP1_RS = 2557;
  public static int PQSL_PARAVARIIMP1_SEDE_DEL = 0;
  public static int PQSL_PARAVARIIMP1_NUMERO_DEL = 1;
  public static int PQSL_PARAVARIIMP1_ANNO_DEL = 2;
  public static int PQSL_PARAVARIIMP1_UNITA_PROPONENTE = 3;
  public static int PQSL_PARAVARIIMP1_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAVARIIMP1_ANNO_PROPOSTA = 5;

  // Table to contain panel selected row: VAR IMPEGNABILE
  //
  public static int PQRY_VARIMPEGNAB1 = 2558;
  public static int PQSL_VARIMPEGNAB1_PROGRESSIVO = 0;
  public static int PQSL_VARIMPEGNAB1_ESERCIZIO = 1;
  public static int PQSL_VARIMPEGNAB1_CAPITOLO = 2;
  public static int PQSL_VARIMPEGNAB1_ARTICOLO = 3;
  public static int PQSL_VARIMPEGNAB1_ANNO_DEL = 4;
  public static int PQSL_VARIMPEGNAB1_NUMERO_DEL = 5;
  public static int PQSL_VARIMPEGNAB1_SEDE_DEL = 6;
  public static int PQSL_VARIMPEGNAB1_IMPORTO = 7;
  public static int PQSL_VARIMPEGNAB1_DESCRIZIONE = 8;
  public static int PQSL_VARIMPEGNAB1_ANNO_PROPOSTA = 9;
  public static int PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA = 10;
  public static int PQSL_VARIMPEGNAB1_UNITA_PROPONENTE = 11;
  public static int PQSL_VARIMPEGNAB1_S = 12;
  public static int PQSL_VARIMPEGNAB1_D_DATA_REG = 13;
  public static int PQSL_VARIMPEGNAB1_PROGETTO_ID = 14;
  public static int PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA = 15;
  public static int PQSL_VARIMPEGNAB1_UTENTE_INSERIMENTO = 16;
  public static int PQSL_VARIMPEGNAB1_DATA_INSERIMENTO = 17;
  public static int PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG = 18;
  public static int PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG = 19;
  public static int PQSL_VARIMPEGNAB1_FATTORE = 20;
  public static int PQSL_VARIMPEGNAB1_CENTRO = 21;
  public static int PQSL_VARIMPEGNAB1_SCHEDA_OBIETTIVO_ID = 22;
  public static int PQSL_VARIMPEGNAB1_OBIETTOPERAT = 23;
  public static int PQSL_VARIMPEGNAB1_OBIETTGESTIO = 24;

  // Table to contain panel selected row: POL BOZZE VARIAZIONE
  //
  public static int PQRY_POLBOZZEVAR1 = 2559;
  public static int PQSL_POLBOZZEVAR1_BOZZA_VARIAZIONE_ID = 0;
  public static int PQSL_POLBOZZEVAR1_DESCRIZIONE = 1;
  public static int PQSL_POLBOZZEVAR1_URGENTE = 2;
  public static int PQSL_POLBOZZEVAR1_DATA_LIMITE_PROPOSTE = 3;
  public static int PQSL_POLBOZZEVAR1_ESERCIZIO = 4;
  public static int PQSL_POLBOZZEVAR1_UTENTE_INSERIMENTO = 5;
  public static int PQSL_POLBOZZEVAR1_DATA_INSERIMENTO = 6;
  public static int PQSL_POLBOZZEVAR1_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_POLBOZZEVAR1_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR97 = 2560;
  public static int PQRY_PAR97_RS = 2561;
  public static int PQSL_PAR97_ROWNAMDETPRO = 0;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR98 = 2562;
  public static int PQSL_PAR98_PROGR_UNITA_ORGANIZZATIVA = 0;
  public static int PQSL_PAR98_NUM_PROPOSTA = 1;
  public static int PQSL_PAR98_DATA = 2;
  public static int PQSL_PAR98_URGENTE = 3;
  public static int PQSL_PAR98_ROWNAMEDESCR = 4;
  public static int PQSL_PAR98_PROPOSTA_VAR_ID = 5;
  public static int PQSL_PAR98_ROWNAMUNIORG = 6;

  // Table to contain panel selected row: Par 2
  //
  public static int PQRY_PAR59 = 2563;
  public static int PQSL_PAR59_PROGR_UNITA_ORGANIZZATIVA = 0;
  public static int PQSL_PAR59_NUM_PROPOSTA = 1;
  public static int PQSL_PAR59_DATA = 2;
  public static int PQSL_PAR59_URGENTE = 3;
  public static int PQSL_PAR59_ROWNAMNEWEXP = 4;
  public static int PQSL_PAR59_DESCRIZIONE = 5;
  public static int PQSL_PAR59_PROPOSTA_VAR_ID = 6;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARDE5 = 2564;
  public static int PQSL_POLPROVARDE5_STATO = 0;
  public static int PQSL_POLPROVARDE5_E_S = 1;
  public static int PQSL_POLPROVARDE5_CAPITOLO = 2;
  public static int PQSL_POLPROVARDE5_ARTICOLO = 3;
  public static int PQSL_POLPROVARDE5_ISTITUZIONE_NC = 4;
  public static int PQSL_POLPROVARDE5_PROGR_UNITA_ORGANIZZATIVA = 5;
  public static int PQSL_POLPROVARDE5_IMPORTO_1 = 6;
  public static int PQSL_POLPROVARDE5_IMPORTO_2 = 7;
  public static int PQSL_POLPROVARDE5_IMPORTO_3 = 8;
  public static int PQSL_POLPROVARDE5_RECORUNITORG = 9;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS1 = 2565;
  public static int PQRY_PARS1_RS = 2566;
  public static int PQSL_PARS1_RONAANBOASAV = 0;
  public static int PQSL_PARS1_ROWNAMEORDIN = 1;
  public static int PQSL_PARS1_ROWNAMEBOZZA = 2;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT 1
  //
  public static int PQRY_POLPROVARDE4 = 2567;
  public static int PQSL_POLPROVARDE4_NOTA_1 = 0;
  public static int PQSL_POLPROVARDE4_NOTA_2 = 1;
  public static int PQSL_POLPROVARDE4_NOTA_3 = 2;
  public static int PQSL_POLPROVARDE4_NOTA_4 = 3;
  public static int PQSL_POLPROVARDE4_NOTA_5 = 4;
  public static int PQSL_POLPROVARDE4_STATO = 5;
  public static int PQSL_POLPROVARDE4_E_S = 6;
  public static int PQSL_POLPROVARDE4_CAPITOLO = 7;
  public static int PQSL_POLPROVARDE4_ARTICOLO = 8;
  public static int PQSL_POLPROVARDE4_ISTITUZIONE_NC = 9;
  public static int PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID = 10;
  public static int PQSL_POLPROVARDE4_COD_REC = 11;
  public static int PQSL_POLPROVARDE4_PROPOSTA_VAR_ID = 12;
  public static int PQSL_POLPROVARDE4_BOZZA_VARIAZIONE_ID = 13;
  public static int PQSL_POLPROVARDE4_RECORUNITORG = 14;
  public static int PQSL_POLPROVARDE4_IMPORTO_1 = 15;
  public static int PQSL_POLPROVARDE4_IMPORTO_2 = 16;
  public static int PQSL_POLPROVARDE4_IMPORTO_3 = 17;
  public static int PQSL_POLPROVARDE4_CONS_SVILUPPO = 18;
  public static int PQSL_POLPROVARDE4_TIPO_VAR = 19;
  public static int PQSL_POLPROVARDE4_RECORDDESCRI = 20;
  public static int PQSL_POLPROVARDE4_RECORDNOTE = 21;
  public static int PQSL_POLPROVARDE4_VAR_BIL = 22;
  public static int PQSL_POLPROVARDE4_PROGETTO_ID = 23;
  public static int PQSL_POLPROVARDE4_FATTORE = 24;
  public static int PQSL_POLPROVARDE4_CENTRO = 25;
  public static int PQSL_POLPROVARDE4_FINANZIAMENTO = 26;
  public static int PQSL_POLPROVARDE4_OPERA = 27;
  public static int PQSL_POLPROVARDE4_SCHEDA_OBIETTIVO_ID = 28;
  public static int PQSL_POLPROVARDE4_RECORDGENERA = 29;
  public static int PQSL_POLPROVARDE4_VARIAZIONE_ID = 30;
  public static int PQSL_POLPROVARDE4_DESCRIZIONE = 31;
  public static int PQSL_POLPROVARDE4_PROGR_UNITA_ORGANIZZATIVA = 32;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT 1
  //
  public static int PQRY_POLPROVARDE8 = 2568;
  public static int PQSL_POLPROVARDE8_NOTA_1 = 0;
  public static int PQSL_POLPROVARDE8_NOTA_2 = 1;
  public static int PQSL_POLPROVARDE8_NOTA_3 = 2;
  public static int PQSL_POLPROVARDE8_NOTA_4 = 3;
  public static int PQSL_POLPROVARDE8_NOTA_5 = 4;
  public static int PQSL_POLPROVARDE8_STATO = 5;
  public static int PQSL_POLPROVARDE8_E_S = 6;
  public static int PQSL_POLPROVARDE8_CAPITOLO = 7;
  public static int PQSL_POLPROVARDE8_ARTICOLO = 8;
  public static int PQSL_POLPROVARDE8_ISTITUZIONE_NC = 9;
  public static int PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID = 10;
  public static int PQSL_POLPROVARDE8_COD_REC = 11;
  public static int PQSL_POLPROVARDE8_PROPOSTA_VAR_ID = 12;
  public static int PQSL_POLPROVARDE8_BOZZA_VARIAZIONE_ID = 13;
  public static int PQSL_POLPROVARDE8_RECORUNITORG = 14;
  public static int PQSL_POLPROVARDE8_IMPORTO_1 = 15;
  public static int PQSL_POLPROVARDE8_IMPORTO_2 = 16;
  public static int PQSL_POLPROVARDE8_IMPORTO_3 = 17;
  public static int PQSL_POLPROVARDE8_CONS_SVILUPPO = 18;
  public static int PQSL_POLPROVARDE8_TIPO_VAR = 19;
  public static int PQSL_POLPROVARDE8_RECORDDESCRI = 20;
  public static int PQSL_POLPROVARDE8_RECORDNOTE = 21;
  public static int PQSL_POLPROVARDE8_VAR_BIL = 22;
  public static int PQSL_POLPROVARDE8_PROGETTO_ID = 23;
  public static int PQSL_POLPROVARDE8_FATTORE = 24;
  public static int PQSL_POLPROVARDE8_CENTRO = 25;
  public static int PQSL_POLPROVARDE8_FINANZIAMENTO = 26;
  public static int PQSL_POLPROVARDE8_OPERA = 27;
  public static int PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID = 28;
  public static int PQSL_POLPROVARDE8_RECORDGENERA = 29;
  public static int PQSL_POLPROVARDE8_VARIAZIONE_ID = 30;
  public static int PQSL_POLPROVARDE8_DESCRIZIONE = 31;
  public static int PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA = 32;
  public static int PQSL_POLPROVARDE8_UTENTE_INSERIMENTO = 33;
  public static int PQSL_POLPROVARDE8_UTENTE_ULTIMO_AGG = 34;
  public static int PQSL_POLPROVARDE8_ESERCIZIO = 35;
  public static int PQSL_POLPROVARDE8_DATA_INSERIMENTO = 36;
  public static int PQSL_POLPROVARDE8_DATA_ULTIMO_AGG = 37;
  public static int PQSL_POLPROVARDE8_TITOLO = 38;

  // Table to contain panel selected row: Pannello UO
  //
  public static int PQRY_PANNELLOUO1 = 2569;
  public static int PQRY_PANNELLOUO1_RS = 2570;
  public static int PQSL_PANNELLOUO1_ROWNAMEPROUO = 0;

  // Table to contain panel selected row: Panel
  //
  public static int PQRY_PANEL2 = 2571;
  public static int PQRY_PANEL2_RS = 2572;
  public static int PQSL_PANEL2_ROWNAMEFINAZ = 0;

  // Table to contain panel selected row: FASULLO
  //
  public static int PQRY_FASULLO1 = 2573;
  public static int PQSL_FASULLO1_PROGETTO_ID = 0;
  public static int PQSL_FASULLO1_ROWNAMNEWEXP = 1;
  public static int PQSL_FASULLO1_FATTORE = 2;
  public static int PQSL_FASULLO1_CENTRO = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR99 = 2574;
  public static int PQRY_PAR99_RS = 2575;
  public static int PQSL_PAR99_ROWNAMTIPCON = 0;
  public static int PQSL_PAR99_ROWNAMEESERC = 1;
  public static int PQSL_PAR99_ROWNAMSODINE = 2;
  public static int PQSL_PAR99_ROWNAMSOPRAP = 3;

  // Table to contain panel selected row: POL TOT PROPOSTE
  //
  public static int PQRY_POLTOTPROPO2 = 2576;
  public static int PQSL_POLTOTPROPO2_RECOVARINEGA = 0;
  public static int PQSL_POLTOTPROPO2_RECOVARIPOSI = 1;
  public static int PQSL_POLTOTPROPO2_RECOVARINEG1 = 2;
  public static int PQSL_POLTOTPROPO2_RECOVARIPOS1 = 3;
  public static int PQSL_POLTOTPROPO2_RECOVARENEG2 = 4;
  public static int PQSL_POLTOTPROPO2_RECOVAREPOS2 = 5;
  public static int PQSL_POLTOTPROPO2_RECOVARSNEG2 = 6;
  public static int PQSL_POLTOTPROPO2_RECOVARSPOS2 = 7;
  public static int PQSL_POLTOTPROPO2_RECOVARENEG3 = 8;
  public static int PQSL_POLTOTPROPO2_RECOVAREPOS3 = 9;
  public static int PQSL_POLTOTPROPO2_RECOVARSNEG3 = 10;
  public static int PQSL_POLTOTPROPO2_RECOVARSPOS3 = 11;
  public static int PQSL_POLTOTPROPO2_RECORDTOT1 = 12;
  public static int PQSL_POLTOTPROPO2_RECORDTOT2 = 13;
  public static int PQSL_POLTOTPROPO2_RECORDTOT3 = 14;
  public static int PQSL_POLTOTPROPO2_RECORDTOT4 = 15;
  public static int PQSL_POLTOTPROPO2_RECORDTOT5 = 16;
  public static int PQSL_POLTOTPROPO2_RECORDTOT6 = 17;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO1 = 2577;
  public static int PQRY_PANNELLO1_RS = 2578;
  public static int PQSL_PANNELLO1_ROWNAMSOLAPP = 0;

  // Table to contain panel selected row: POL WRK DISP PVB
  //
  public static int PQRY_POLWRKDISPV1 = 2579;
  public static int PQSL_POLWRKDISPV1_ESERCIZIO = 0;
  public static int PQSL_POLWRKDISPV1_E_S = 1;
  public static int PQSL_POLWRKDISPV1_CAPITOLO = 2;
  public static int PQSL_POLWRKDISPV1_ARTICOLO = 3;
  public static int PQSL_POLWRKDISPV1_VOCE_PEG = 4;
  public static int PQSL_POLWRKDISPV1_PROGETTO_ID = 5;
  public static int PQSL_POLWRKDISPV1_SCHEDA_OBIETTIVO_ID = 6;
  public static int PQSL_POLWRKDISPV1_CODICE_OBIETTIVO = 7;
  public static int PQSL_POLWRKDISPV1_FINANZIAMENTO = 8;
  public static int PQSL_POLWRKDISPV1_OPERA = 9;
  public static int PQSL_POLWRKDISPV1_DISP_ATTUALE = 10;
  public static int PQSL_POLWRKDISPV1_VAR_PROVVISORIE = 11;
  public static int PQSL_POLWRKDISPV1_VAR_PROPOSTA = 12;
  public static int PQSL_POLWRKDISPV1_DISP_PROPOSTA = 13;
  public static int PQSL_POLWRKDISPV1_VAR_ALTRE_PROPOSTE = 14;
  public static int PQSL_POLWRKDISPV1_DISP_RISULTANTE = 15;
  public static int PQSL_POLWRKDISPV1_RECVOCPECODE = 16;
  public static int PQSL_POLWRKDISPV1_PROGRESSIVO = 17;
  public static int PQSL_POLWRKDISPV1_DES_UNITA_ORGANIZZATIVA = 18;

  // Table to contain panel selected row: POL WRK DISP PVB
  //
  public static int PQRY_POLWRKDISPV2 = 2580;
  public static int PQSL_POLWRKDISPV2_ESERCIZIO = 0;
  public static int PQSL_POLWRKDISPV2_E_S = 1;
  public static int PQSL_POLWRKDISPV2_CAPITOLO = 2;
  public static int PQSL_POLWRKDISPV2_ARTICOLO = 3;
  public static int PQSL_POLWRKDISPV2_VOCE_PEG = 4;
  public static int PQSL_POLWRKDISPV2_PROGETTO_ID = 5;
  public static int PQSL_POLWRKDISPV2_SCHEDA_OBIETTIVO_ID = 6;
  public static int PQSL_POLWRKDISPV2_CODICE_OBIETTIVO = 7;
  public static int PQSL_POLWRKDISPV2_FINANZIAMENTO = 8;
  public static int PQSL_POLWRKDISPV2_OPERA = 9;
  public static int PQSL_POLWRKDISPV2_DISP_ATTUALE = 10;
  public static int PQSL_POLWRKDISPV2_VAR_PROVVISORIE = 11;
  public static int PQSL_POLWRKDISPV2_VAR_PROPOSTA = 12;
  public static int PQSL_POLWRKDISPV2_DISP_PROPOSTA = 13;
  public static int PQSL_POLWRKDISPV2_VAR_ALTRE_PROPOSTE = 14;
  public static int PQSL_POLWRKDISPV2_DISP_RISULTANTE = 15;
  public static int PQSL_POLWRKDISPV2_RECVOCPECODE = 16;
  public static int PQSL_POLWRKDISPV2_PROGRESSIVO = 17;

  // Table to contain panel selected row: POL WRK DISP PVB
  //
  public static int PQRY_POLWRKDISPVB = 2581;
  public static int PQSL_POLWRKDISPVB_E_S = 0;
  public static int PQSL_POLWRKDISPVB_PROGETTO_ID = 1;
  public static int PQSL_POLWRKDISPVB_CODICE_OBIETTIVO = 2;
  public static int PQSL_POLWRKDISPVB_FINANZIAMENTO = 3;
  public static int PQSL_POLWRKDISPVB_OPERA = 4;
  public static int PQSL_POLWRKDISPVB_VOCE_PEG = 5;
  public static int PQSL_POLWRKDISPVB_DISP_ATTUALE = 6;
  public static int PQSL_POLWRKDISPVB_VAR_PROVVISORIE = 7;
  public static int PQSL_POLWRKDISPVB_VAR_PROPOSTA = 8;
  public static int PQSL_POLWRKDISPVB_DISP_PROPOSTA = 9;
  public static int PQSL_POLWRKDISPVB_VAR_ALTRE_PROPOSTE = 10;
  public static int PQSL_POLWRKDISPVB_DISP_RISULTANTE = 11;

  // Table to contain panel selected row: POL TOT PROPOSTE
  //
  public static int PQRY_POLTOTPROPOS = 2582;
  public static int PQSL_POLTOTPROPOS_RECORDSPESE1 = 0;
  public static int PQSL_POLTOTPROPOS_RECORDENTRAT = 1;
  public static int PQSL_POLTOTPROPOS_RECORDNEGATI = 2;
  public static int PQSL_POLTOTPROPOS_RECORDPOSITI = 3;
  public static int PQSL_POLTOTPROPOS_RECOVARENEG2 = 4;
  public static int PQSL_POLTOTPROPOS_RECOVAREPOS2 = 5;
  public static int PQSL_POLTOTPROPOS_RECOVARSNEG2 = 6;
  public static int PQSL_POLTOTPROPOS_RECOVARSPOS2 = 7;
  public static int PQSL_POLTOTPROPOS_RECOVARENEG3 = 8;
  public static int PQSL_POLTOTPROPOS_RECOVAREPOS3 = 9;
  public static int PQSL_POLTOTPROPOS_RECOVARSNEG3 = 10;
  public static int PQSL_POLTOTPROPOS_RECOVARSPOS3 = 11;
  public static int PQSL_POLTOTPROPOS_RECORDTOT1 = 12;
  public static int PQSL_POLTOTPROPOS_RECORDTOT2 = 13;
  public static int PQSL_POLTOTPROPOS_RECORDTOT3 = 14;
  public static int PQSL_POLTOTPROPOS_RECORDTOT4 = 15;
  public static int PQSL_POLTOTPROPOS_RECORDTOT5 = 16;
  public static int PQSL_POLTOTPROPOS_RECORDTOT6 = 17;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO2 = 2583;
  public static int PQRY_PANNELLO2_RS = 2584;
  public static int PQSL_PANNELLO2_ROWNAMSOLAPP = 0;
  public static int PQSL_PANNELLO2_ROWNAMTIPVAR = 1;
  public static int PQSL_PANNELLO2_ROWNAMTIPQUA = 2;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR100 = 2585;
  public static int PQRY_PAR100_RS = 2586;
  public static int PQSL_PAR100_ROWNAMEESERC = 0;
  public static int PQSL_PAR100_ROWNAMSOLAPP = 1;
  public static int PQSL_PAR100_ROWNAMEPARTE = 2;
  public static int PQSL_PAR100_ROWNAMETIPO = 3;
  public static int PQSL_PAR100_ROWNAMTIPVAR = 4;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO5 = 2587;
  public static int PQSL_POLWRKELVBO5_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO5_COD_REC = 1;
  public static int PQSL_POLWRKELVBO5_E_S = 2;
  public static int PQSL_POLWRKELVBO5_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO5_DESCRIZIONE_BOZZA = 4;
  public static int PQSL_POLWRKELVBO5_VOCE_PEG = 5;
  public static int PQSL_POLWRKELVBO5_CODICE = 6;
  public static int PQSL_POLWRKELVBO5_DESCRIZIONE = 7;
  public static int PQSL_POLWRKELVBO5_STANZIAMENTO_ATTUALE = 8;
  public static int PQSL_POLWRKELVBO5_VARIAZIONI_POSITIVE = 9;
  public static int PQSL_POLWRKELVBO5_VARIAZIONI_NEGATIVE = 10;
  public static int PQSL_POLWRKELVBO5_STANZIAMENTO_RISULTANTE = 11;
  public static int PQSL_POLWRKELVBO5_DES_TIPO_VAR = 12;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO6 = 2588;
  public static int PQSL_POLWRKELVBO6_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO6_COD_REC = 1;
  public static int PQSL_POLWRKELVBO6_E_S = 2;
  public static int PQSL_POLWRKELVBO6_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO6_DESCRIZIONE_BOZZA = 4;
  public static int PQSL_POLWRKELVBO6_VOCE_PEG = 5;
  public static int PQSL_POLWRKELVBO6_CODICE = 6;
  public static int PQSL_POLWRKELVBO6_DESCRIZIONE = 7;
  public static int PQSL_POLWRKELVBO6_STANZIAMENTO_ATTUALE = 8;
  public static int PQSL_POLWRKELVBO6_VARIAZIONI_POSITIVE = 9;
  public static int PQSL_POLWRKELVBO6_VARIAZIONI_NEGATIVE = 10;
  public static int PQSL_POLWRKELVBO6_STANZIAMENTO_RISULTANTE = 11;
  public static int PQSL_POLWRKELVBO6_RECORAGGTITO = 12;
  public static int PQSL_POLWRKELVBO6_TITOLO = 13;
  public static int PQSL_POLWRKELVBO6_DES_TIPO_VAR = 14;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO7 = 2589;
  public static int PQSL_POLWRKELVBO7_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO7_COD_REC = 1;
  public static int PQSL_POLWRKELVBO7_E_S = 2;
  public static int PQSL_POLWRKELVBO7_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO7_DESCRIZIONE_BOZZA = 4;
  public static int PQSL_POLWRKELVBO7_VOCE_PEG = 5;
  public static int PQSL_POLWRKELVBO7_CODICE = 6;
  public static int PQSL_POLWRKELVBO7_DESCRIZIONE = 7;
  public static int PQSL_POLWRKELVBO7_STANZIAMENTO_ATTUALE = 8;
  public static int PQSL_POLWRKELVBO7_VARIAZIONI_POSITIVE = 9;
  public static int PQSL_POLWRKELVBO7_VARIAZIONI_NEGATIVE = 10;
  public static int PQSL_POLWRKELVBO7_STANZIAMENTO_RISULTANTE = 11;
  public static int PQSL_POLWRKELVBO7_DES_TIPO_VAR = 12;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO8 = 2590;
  public static int PQSL_POLWRKELVBO8_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO8_COD_REC = 1;
  public static int PQSL_POLWRKELVBO8_E_S = 2;
  public static int PQSL_POLWRKELVBO8_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO8_DESCRIZIONE_BOZZA = 4;
  public static int PQSL_POLWRKELVBO8_VOCE_PEG = 5;
  public static int PQSL_POLWRKELVBO8_CODICE = 6;
  public static int PQSL_POLWRKELVBO8_DESCRIZIONE = 7;
  public static int PQSL_POLWRKELVBO8_STANZIAMENTO_ATTUALE = 8;
  public static int PQSL_POLWRKELVBO8_VARIAZIONI_POSITIVE = 9;
  public static int PQSL_POLWRKELVBO8_VARIAZIONI_NEGATIVE = 10;
  public static int PQSL_POLWRKELVBO8_STANZIAMENTO_RISULTANTE = 11;
  public static int PQSL_POLWRKELVBO8_RECORAGGTITO = 12;
  public static int PQSL_POLWRKELVBO8_TITOLO = 13;
  public static int PQSL_POLWRKELVBO8_DES_TIPO_VAR = 14;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR53 = 2591;
  public static int PQRY_PAR53_RS = 2592;
  public static int PQSL_PAR53_ROWNAMEESERC = 0;
  public static int PQSL_PAR53_RONASUPETIVA = 1;
  public static int PQSL_PAR53_ROWNAMSOSANN = 2;

  // Table to contain panel selected row: POL WRK BOZZA ANN
  //
  public static int PQRY_POLWRKBOZAN1 = 2593;
  public static int PQSL_POLWRKBOZAN1_PROGRESSIVO = 0;
  public static int PQSL_POLWRKBOZAN1_ESERCIZIO = 1;
  public static int PQSL_POLWRKBOZAN1_DES_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_POLWRKBOZAN1_E_S = 3;
  public static int PQSL_POLWRKBOZAN1_TITOLO = 4;
  public static int PQSL_POLWRKBOZAN1_DES_TITOLO = 5;
  public static int PQSL_POLWRKBOZAN1_VOCE_PEG = 6;
  public static int PQSL_POLWRKBOZAN1_RECOENTRSPES = 7;
  public static int PQSL_POLWRKBOZAN1_IMPORTO_PIU = 8;
  public static int PQSL_POLWRKBOZAN1_IMPORTO_MENO = 9;
  public static int PQSL_POLWRKBOZAN1_TIPO_VAR = 10;
  public static int PQSL_POLWRKBOZAN1_DES_TIPO_VAR = 11;
  public static int PQSL_POLWRKBOZAN1_DESCRIZIONE = 12;

  // Table to contain panel selected row: POL WRK SITUAZIONI
  //
  public static int PQRY_POLWRKSITU25 = 2594;
  public static int PQSL_POLWRKSITU25_ESERCIZIO = 0;
  public static int PQSL_POLWRKSITU25_DES_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_POLWRKSITU25_TITOLO = 2;
  public static int PQSL_POLWRKSITU25_E_S = 3;
  public static int PQSL_POLWRKSITU25_VOCE_PEG = 4;
  public static int PQSL_POLWRKSITU25_RECORVOCEPEG = 5;
  public static int PQSL_POLWRKSITU25_PROGRESSIVO = 6;
  public static int PQSL_POLWRKSITU25_DES_TITOLO = 7;
  public static int PQSL_POLWRKSITU25_TIPO_VAR = 8;
  public static int PQSL_POLWRKSITU25_DES_TIPO_VAR = 9;
  public static int PQSL_POLWRKSITU25_DESCRIZIONE = 10;
  public static int PQSL_POLWRKSITU25_IMPORTO_PIU = 11;
  public static int PQSL_POLWRKSITU25_IMPORTO_MENO = 12;

  // Table to contain panel selected row: POL WRK BOZZA ANN
  //
  public static int PQRY_POLWRKBOZANN = 2595;
  public static int PQSL_POLWRKBOZANN_PROGRESSIVO = 0;
  public static int PQSL_POLWRKBOZANN_ESERCIZIO = 1;
  public static int PQSL_POLWRKBOZANN_DES_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_POLWRKBOZANN_E_S = 3;
  public static int PQSL_POLWRKBOZANN_TITOLO = 4;
  public static int PQSL_POLWRKBOZANN_DES_TITOLO = 5;
  public static int PQSL_POLWRKBOZANN_VOCE_PEG = 6;
  public static int PQSL_POLWRKBOZANN_RECOENTRSPES = 7;
  public static int PQSL_POLWRKBOZANN_IMPORTO_PIU = 8;
  public static int PQSL_POLWRKBOZANN_IMPORTO_MENO = 9;
  public static int PQSL_POLWRKBOZANN_TIPO_VAR = 10;
  public static int PQSL_POLWRKBOZANN_DES_TIPO_VAR = 11;
  public static int PQSL_POLWRKBOZANN_DESCRIZIONE = 12;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL39 = 2596;
  public static int PQSL_DUAL39_RECORDONE = 0;

  // Table to contain panel selected row: Elenco Tipi Variazione
  //
  public static int PQRY_ELENTIPIVAR1 = 2597;
  public static int PQSL_ELENTIPIVAR1_CODICE = 0;
  public static int PQSL_ELENTIPIVAR1_DESCRIZIONE = 1;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS4 = 2598;
  public static int PQRY_PARS4_RS = 2599;
  public static int PQSL_PARS4_RONASOSETIVA = 0;
  public static int PQSL_PARS4_ROWNAMSOLAPP = 1;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARDE7 = 2600;
  public static int PQSL_POLPROVARDE7_STATO = 0;
  public static int PQSL_POLPROVARDE7_PROPOSTA_VAR_DETT_ID = 1;
  public static int PQSL_POLPROVARDE7_COD_REC = 2;
  public static int PQSL_POLPROVARDE7_RECORDSTATO = 3;
  public static int PQSL_POLPROVARDE7_TIPO_VAR = 4;
  public static int PQSL_POLPROVARDE7_E_S = 5;
  public static int PQSL_POLPROVARDE7_CAPITOLO = 6;
  public static int PQSL_POLPROVARDE7_ARTICOLO = 7;
  public static int PQSL_POLPROVARDE7_ISTITUZIONE_NC = 8;
  public static int PQSL_POLPROVARDE7_RECORDDESCRI = 9;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL7 = 2601;
  public static int PQSL_DUAL7_CODICE = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL40 = 2602;
  public static int PQSL_DUAL40_RECORNEWEXPR = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL8 = 2603;
  public static int PQSL_DUAL8_RECORNEWEXPR = 0;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS6 = 2604;
  public static int PQRY_PARS6_RS = 2605;
  public static int PQSL_PARS6_ROWNAMETIPO = 0;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARDE1 = 2606;
  public static int PQSL_POLPROVARDE1_RECORDSTATO = 0;
  public static int PQSL_POLPROVARDE1_E_S = 1;
  public static int PQSL_POLPROVARDE1_CAPITOLO = 2;
  public static int PQSL_POLPROVARDE1_ARTICOLO = 3;
  public static int PQSL_POLPROVARDE1_ISTITUZIONE_NC = 4;
  public static int PQSL_POLPROVARDE1_RECORDBILANC = 5;
  public static int PQSL_POLPROVARDE1_DESCRIZIONE = 6;
  public static int PQSL_POLPROVARDE1_COD_REC = 7;
  public static int PQSL_POLPROVARDE1_PROPOSTA_VAR_DETT_ID = 8;
  public static int PQSL_POLPROVARDE1_ESERCIZIO = 9;

  // Table to contain panel selected row: POL BOZZE VARIAZIONE
  //
  public static int PQRY_POLBOZZEVAR2 = 2607;
  public static int PQSL_POLBOZZEVAR2_BOZZA_VARIAZIONE_ID = 0;
  public static int PQSL_POLBOZZEVAR2_ESERCIZIO = 1;
  public static int PQSL_POLBOZZEVAR2_DESCRIZIONE = 2;
  public static int PQSL_POLBOZZEVAR2_URGENTE = 3;
  public static int PQSL_POLBOZZEVAR2_DATA_LIMITE_PROPOSTE = 4;
  public static int PQSL_POLBOZZEVAR2_UTENTE_INSERIMENTO = 5;
  public static int PQSL_POLBOZZEVAR2_DATA_INSERIMENTO = 6;
  public static int PQSL_POLBOZZEVAR2_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_POLBOZZEVAR2_DATA_ULTIMO_AGG = 8;
  public static int PQSL_POLBOZZEVAR2_RECORDVAR = 9;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARD10 = 2608;
  public static int PQSL_POLPROVARD10_RECORDSTATO = 0;
  public static int PQSL_POLPROVARD10_E_S = 1;
  public static int PQSL_POLPROVARD10_CAPITOLO = 2;
  public static int PQSL_POLPROVARD10_ARTICOLO = 3;
  public static int PQSL_POLPROVARD10_ISTITUZIONE_NC = 4;
  public static int PQSL_POLPROVARD10_RECORDBILANC = 5;
  public static int PQSL_POLPROVARD10_DESCRIZIONE = 6;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO6 = 2609;
  public static int PQRY_PANNELLO6_RS = 2610;
  public static int PQSL_PANNELLO6_RECORDVARIAZ = 0;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARD11 = 2611;
  public static int PQSL_POLPROVARD11_VARIAZIONE_ID = 0;
  public static int PQSL_POLPROVARD11_RECORNEWEXPR = 1;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS24 = 2612;
  public static int PQRY_PARS24_RS = 2613;
  public static int PQSL_PARS24_ROWNAMDATLIM = 0;

  // Table to contain panel selected row: POL PROPOSTE VAR
  //
  public static int PQRY_POLPROPOSVAR = 2614;
  public static int PQSL_POLPROPOSVAR_DESCRIZIONE = 0;
  public static int PQSL_POLPROPOSVAR_PROGR_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_POLPROPOSVAR_NUM_PROPOSTA = 2;
  public static int PQSL_POLPROPOSVAR_DATA = 3;
  public static int PQSL_POLPROPOSVAR_URGENTE = 4;
  public static int PQSL_POLPROPOSVAR_PROPOSTA_VAR_ID = 5;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARDE9 = 2615;
  public static int PQSL_POLPROVARDE9_E_S = 0;
  public static int PQSL_POLPROVARDE9_CAPITOLO = 1;
  public static int PQSL_POLPROVARDE9_ARTICOLO = 2;
  public static int PQSL_POLPROVARDE9_ISTITUZIONE_NC = 3;
  public static int PQSL_POLPROVARDE9_DESCRIZIONE = 4;
  public static int PQSL_POLPROVARDE9_IMPORTO_1 = 5;
  public static int PQSL_POLPROVARDE9_IMPORTO_2 = 6;
  public static int PQSL_POLPROVARDE9_IMPORTO_3 = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI380 = 2616;
  public static int PQRY_PARAMETRI380_RS = 2617;
  public static int PQSL_PARAMETRI380_ROWNAMTEMACO = 0;
  public static int PQSL_PARAMETRI380_ROWNAMTEMALI = 1;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO8 = 2618;
  public static int PQRY_PANNELLO8_RS = 2619;
  public static int PQSL_PANNELLO8_ROWNAMANVAGE = 0;

  // Table to contain panel selected row: POL VARIAZIONI BIL PEG
  //
  public static int PQRY_POLVARBILPE1 = 2620;
  public static int PQSL_POLVARBILPE1_BIL_PEG = 0;
  public static int PQSL_POLVARBILPE1_DESCRIZIONE = 1;
  public static int PQSL_POLVARBILPE1_ANNO_PROPOSTA = 2;
  public static int PQSL_POLVARBILPE1_NUMERO_PROPOSTA = 3;
  public static int PQSL_POLVARBILPE1_UNITA_PROPONENTE = 4;
  public static int PQSL_POLVARBILPE1_ANNO_DEL = 5;
  public static int PQSL_POLVARBILPE1_NUMERO_DEL = 6;
  public static int PQSL_POLVARBILPE1_SEDE_DEL = 7;
  public static int PQSL_POLVARBILPE1_VARIAZIONE_ID = 8;
  public static int PQSL_POLVARBILPE1_UTENTE_INSERIMENTO = 9;
  public static int PQSL_POLVARBILPE1_DATA_INSERIMENTO = 10;
  public static int PQSL_POLVARBILPE1_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_POLVARBILPE1_DATA_ULTIMO_AGG = 12;
  public static int PQSL_POLVARBILPE1_ESERCIZIO = 13;
  public static int PQSL_POLVARBILPE1_DESCRIZIONE_PEG_OB = 14;
  public static int PQSL_POLVARBILPE1_RECORINFODEL = 15;
  public static int PQSL_POLVARBILPE1_RECOINFOPROP = 16;

  // Table to contain panel selected row: POL PROPOSTE VAR DETT
  //
  public static int PQRY_POLPROVARDET = 2621;
  public static int PQSL_POLPROVARDET_E_S = 0;
  public static int PQSL_POLPROVARDET_CAPITOLO = 1;
  public static int PQSL_POLPROVARDET_ARTICOLO = 2;
  public static int PQSL_POLPROVARDET_ISTITUZIONE_NC = 3;
  public static int PQSL_POLPROVARDET_IMPORTO_1 = 4;
  public static int PQSL_POLPROVARDET_IMPORTO_2 = 5;
  public static int PQSL_POLPROVARDET_IMPORTO_3 = 6;
  public static int PQSL_POLPROVARDET_CONS_SVILUPPO = 7;
  public static int PQSL_POLPROVARDET_TIPO_VAR = 8;
  public static int PQSL_POLPROVARDET_DESCRIZIONE = 9;
  public static int PQSL_POLPROVARDET_NOTA_1 = 10;
  public static int PQSL_POLPROVARDET_NOTA_2 = 11;
  public static int PQSL_POLPROVARDET_NOTA_3 = 12;
  public static int PQSL_POLPROVARDET_NOTA_4 = 13;
  public static int PQSL_POLPROVARDET_NOTA_5 = 14;
  public static int PQSL_POLPROVARDET_VAR_BIL = 15;
  public static int PQSL_POLPROVARDET_PROGETTO_ID = 16;
  public static int PQSL_POLPROVARDET_SCHEDA_OBIETTIVO_ID = 17;
  public static int PQSL_POLPROVARDET_FATTORE = 18;
  public static int PQSL_POLPROVARDET_CENTRO = 19;
  public static int PQSL_POLPROVARDET_FINANZIAMENTO = 20;
  public static int PQSL_POLPROVARDET_OPERA = 21;
  public static int PQSL_POLPROVARDET_RECORDNOTE = 22;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR73 = 2622;
  public static int PQRY_PAR73_RS = 2623;
  public static int PQSL_PAR73_ROWNAMUNIPRO = 0;
  public static int PQSL_PAR73_ROWNAMNUMPRO = 1;
  public static int PQSL_PAR73_ROWNAMANNPRO = 2;
  public static int PQSL_PAR73_ROWNAMDATVAR = 3;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS12 = 2624;
  public static int PQRY_PARS12_RS = 2625;
  public static int PQSL_PARS12_ROWNAMENOTE = 0;
  public static int PQSL_PARS12_RONASUPETIVA = 1;
  public static int PQSL_PARS12_ROWNAMTOPETI = 2;

  // Table to contain panel selected row: POL WRK SALP
  //
  public static int PQRY_POLWRKSALP = 2626;
  public static int PQSL_POLWRKSALP_DES_UNITA_ORGANIZZATIVA = 0;
  public static int PQSL_POLWRKSALP_NUM_PROPOSTA = 1;
  public static int PQSL_POLWRKSALP_E_S = 2;
  public static int PQSL_POLWRKSALP_ESERCIZIO = 3;
  public static int PQSL_POLWRKSALP_VOCE_PEG = 4;
  public static int PQSL_POLWRKSALP_CODICE = 5;
  public static int PQSL_POLWRKSALP_DESCRIZIONE_CAP = 6;
  public static int PQSL_POLWRKSALP_STN_ATT_CO = 7;
  public static int PQSL_POLWRKSALP_VARIAZIONE = 8;
  public static int PQSL_POLWRKSALP_STN_DEF_CO = 9;
  public static int PQSL_POLWRKSALP_DESCRIZIONE = 10;
  public static int PQSL_POLWRKSALP_RECORDRAGG = 11;
  public static int PQSL_POLWRKSALP_PROGRESSIVO = 12;
  public static int PQSL_POLWRKSALP_DES_TIPO_VAR = 13;
  public static int PQSL_POLWRKSALP_DES_VARIAZIONE = 14;
  public static int PQSL_POLWRKSALP_TIPO_VAR = 15;
  public static int PQSL_POLWRKSALP_PROGR_UNITA_ORGANIZZATIVA = 16;
  public static int PQSL_POLWRKSALP_TITOLO = 17;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS17 = 2627;
  public static int PQRY_PARS17_RS = 2628;
  public static int PQSL_PARS17_ROWNAMEESERC = 0;
  public static int PQSL_PARS17_ROWNADEVOPEG = 1;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO2 = 2629;
  public static int PQSL_POLWRKELVBO2_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO2_COD_REC = 1;
  public static int PQSL_POLWRKELVBO2_E_S = 2;
  public static int PQSL_POLWRKELVBO2_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO2_VOCE_PEG = 4;
  public static int PQSL_POLWRKELVBO2_CODICE = 5;
  public static int PQSL_POLWRKELVBO2_DESCRIZIONE = 6;
  public static int PQSL_POLWRKELVBO2_STANZIAMENTO_ATTUALE = 7;
  public static int PQSL_POLWRKELVBO2_VARIAZIONI_POSITIVE = 8;
  public static int PQSL_POLWRKELVBO2_VARIAZIONI_NEGATIVE = 9;
  public static int PQSL_POLWRKELVBO2_DESCRIZIONE_VAR = 10;
  public static int PQSL_POLWRKELVBO2_UNITA_PROPONENTE = 11;
  public static int PQSL_POLWRKELVBO2_NUMERO_PROPOSTA = 12;
  public static int PQSL_POLWRKELVBO2_ANNO_PROPOSTA = 13;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO3 = 2630;
  public static int PQSL_POLWRKELVBO3_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO3_COD_REC = 1;
  public static int PQSL_POLWRKELVBO3_E_S = 2;
  public static int PQSL_POLWRKELVBO3_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO3_VOCE_PEG = 4;
  public static int PQSL_POLWRKELVBO3_CODICE = 5;
  public static int PQSL_POLWRKELVBO3_DESCRIZIONE = 6;
  public static int PQSL_POLWRKELVBO3_STANZIAMENTO_ATTUALE = 7;
  public static int PQSL_POLWRKELVBO3_VARIAZIONI_POSITIVE = 8;
  public static int PQSL_POLWRKELVBO3_VARIAZIONI_NEGATIVE = 9;
  public static int PQSL_POLWRKELVBO3_RECORAGGTITO = 10;
  public static int PQSL_POLWRKELVBO3_TITOLO = 11;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBO1 = 2631;
  public static int PQSL_POLWRKELVBO1_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBO1_COD_REC = 1;
  public static int PQSL_POLWRKELVBO1_E_S = 2;
  public static int PQSL_POLWRKELVBO1_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBO1_VOCE_PEG = 4;
  public static int PQSL_POLWRKELVBO1_CODICE = 5;
  public static int PQSL_POLWRKELVBO1_DESCRIZIONE = 6;
  public static int PQSL_POLWRKELVBO1_STANZIAMENTO_ATTUALE = 7;
  public static int PQSL_POLWRKELVBO1_VARIAZIONI_POSITIVE = 8;
  public static int PQSL_POLWRKELVBO1_VARIAZIONI_NEGATIVE = 9;
  public static int PQSL_POLWRKELVBO1_DESCRIZIONE_VAR = 10;
  public static int PQSL_POLWRKELVBO1_UNITA_PROPONENTE = 11;
  public static int PQSL_POLWRKELVBO1_NUMERO_PROPOSTA = 12;
  public static int PQSL_POLWRKELVBO1_ANNO_PROPOSTA = 13;

  // Table to contain panel selected row: POL WRK ELV BOZZA
  //
  public static int PQRY_POLWRKELVBOZ = 2632;
  public static int PQSL_POLWRKELVBOZ_PROGRESSIVO = 0;
  public static int PQSL_POLWRKELVBOZ_COD_REC = 1;
  public static int PQSL_POLWRKELVBOZ_E_S = 2;
  public static int PQSL_POLWRKELVBOZ_ESERCIZIO = 3;
  public static int PQSL_POLWRKELVBOZ_VOCE_PEG = 4;
  public static int PQSL_POLWRKELVBOZ_CODICE = 5;
  public static int PQSL_POLWRKELVBOZ_DESCRIZIONE = 6;
  public static int PQSL_POLWRKELVBOZ_STANZIAMENTO_ATTUALE = 7;
  public static int PQSL_POLWRKELVBOZ_VARIAZIONI_POSITIVE = 8;
  public static int PQSL_POLWRKELVBOZ_VARIAZIONI_NEGATIVE = 9;
  public static int PQSL_POLWRKELVBOZ_RECORAGGTITO = 10;
  public static int PQSL_POLWRKELVBOZ_TITOLO = 11;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO10 = 2633;
  public static int PQRY_PANNELLO10_RS = 2634;
  public static int PQSL_PANNELLO10_ROWNAMEDESC = 0;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU1 = 2635;
  public static int PQSL_VISTABILANU1_ESERCIZIO = 0;
  public static int PQSL_VISTABILANU1_E_S = 1;
  public static int PQSL_VISTABILANU1_CAPITOLO = 2;
  public static int PQSL_VISTABILANU1_ARTICOLO = 3;
  public static int PQSL_VISTABILANU1_STN_INI_CO = 4;
  public static int PQSL_VISTABILANU1_STN_INI_CO_CONS = 5;
  public static int PQSL_VISTABILANU1_STN_INI_CO_SVIL = 6;
  public static int PQSL_VISTABILANU1_VARIAZIONI_CO = 7;
  public static int PQSL_VISTABILANU1_VARIAZIONI_CO_CONS = 8;
  public static int PQSL_VISTABILANU1_VARIAZIONI_CO_SVIL = 9;
  public static int PQSL_VISTABILANU1_VAR_IMPEGNABILE = 10;
  public static int PQSL_VISTABILANU1_IMPEGNABILE = 11;
  public static int PQSL_VISTABILANU1_VIBIUOSTATTO = 12;
  public static int PQSL_VISTABILANU1_VIBIUOSTATCO = 13;
  public static int PQSL_VISTABILANU1_VIBIUOSTATSV = 14;
  public static int PQSL_VISTABILANU1_VIBIUOSTPRTO = 15;
  public static int PQSL_VISTABILANU1_VIBIUOSTPRCO = 16;
  public static int PQSL_VISTABILANU1_VIBIUOSTPRSV = 17;
  public static int PQSL_VISTABILANU1_VISBILUOIMAT = 18;
  public static int PQSL_VISTABILANU1_VIBIUOLAIMA1 = 19;
  public static int PQSL_VISTABILANU1_VAR_PROVVISORIE = 20;
  public static int PQSL_VISTABILANU1_VAR_PROVVISORIE_CONS = 21;
  public static int PQSL_VISTABILANU1_VAR_PROVVISORIE_SVIL = 22;
  public static int PQSL_VISTABILANU1_DISPONIBILITA = 23;
  public static int PQSL_VISTABILANU1_DISPONIBILITA_CONS = 24;
  public static int PQSL_VISTABILANU1_DISPONIBILITA_SVIL = 25;
  public static int PQSL_VISTABILANU1_SCADENZA = 26;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_1 = 27;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_1 = 28;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_1 = 29;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_2 = 30;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_2 = 31;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_2 = 32;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_3 = 33;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_CONS_3 = 34;
  public static int PQSL_VISTABILANU1_VAR_PROPOSTE_SVIL_3 = 35;
  public static int PQSL_VISTABILANU1_VISBILUOSTPR = 36;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR2 = 37;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR3 = 38;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR4 = 39;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR5 = 40;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR6 = 41;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR7 = 42;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR8 = 43;
  public static int PQSL_VISTABILANU1_VISBIUOSTPR9 = 44;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU2 = 2636;
  public static int PQSL_VISTABILANU2_VISTBILUOCOD = 0;
  public static int PQSL_VISTABILANU2_VISTBILUODES = 1;
  public static int PQSL_VISTABILANU2_STN_INI_CO = 2;
  public static int PQSL_VISTABILANU2_VARIAZIONI_CO = 3;
  public static int PQSL_VISTABILANU2_VISBILUOSTDE = 4;
  public static int PQSL_VISTABILANU2_IMP_ACC = 5;
  public static int PQSL_VISTABILANU2_DISPONIBILITA = 6;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO26 = 2637;
  public static int PQRY_FILTRO26_RS = 2638;
  public static int PQSL_FILTRO26_ROWNAMEESERC = 0;

  // Table to contain panel selected row: POL DETTAGLIO STN PROG
  //
  public static int PQRY_POLDETSTNPR2 = 2639;
  public static int PQSL_POLDETSTNPR2_VOCE_PEG_ID = 0;
  public static int PQSL_POLDETSTNPR2_PROGETTO_ID = 1;
  public static int PQSL_POLDETSTNPR2_STN_INI = 2;
  public static int PQSL_POLDETSTNPR2_VAR_INI = 3;
  public static int PQSL_POLDETSTNPR2_RECORICHDEFI = 4;
  public static int PQSL_POLDETSTNPR2_VAR_DEF = 5;
  public static int PQSL_POLDETSTNPR2_RECOSTANATTU = 6;
  public static int PQSL_POLDETSTNPR2_VAR_PROV = 7;
  public static int PQSL_POLDETSTNPR2_RECOSTANPROV = 8;
  public static int PQSL_POLDETSTNPR2_IMPEGNABILE_INI = 9;
  public static int PQSL_POLDETSTNPR2_VAR_INI_IMPEGNABILE = 10;
  public static int PQSL_POLDETSTNPR2_RECRICDEFIMP = 11;
  public static int PQSL_POLDETSTNPR2_VAR_DEF_IMPEGNABILE = 12;
  public static int PQSL_POLDETSTNPR2_RECOIMPEATTU = 13;
  public static int PQSL_POLDETSTNPR2_IMP_ACC = 14;
  public static int PQSL_POLDETSTNPR2_DISP = 15;
  public static int PQSL_POLDETSTNPR2_STN_INI_CONS = 16;
  public static int PQSL_POLDETSTNPR2_STN_INI_SVIL = 17;
  public static int PQSL_POLDETSTNPR2_VAR_INI_CONS = 18;
  public static int PQSL_POLDETSTNPR2_VAR_INI_SVIL = 19;
  public static int PQSL_POLDETSTNPR2_RECRICDEFCON = 20;
  public static int PQSL_POLDETSTNPR2_RECRICDEFSVI = 21;
  public static int PQSL_POLDETSTNPR2_VAR_DEF_CONS = 22;
  public static int PQSL_POLDETSTNPR2_VAR_DEF_SVIL = 23;
  public static int PQSL_POLDETSTNPR2_RECOSTANATT1 = 24;
  public static int PQSL_POLDETSTNPR2_RECOSTANATT2 = 25;
  public static int PQSL_POLDETSTNPR2_VAR_PROV_CONS = 26;
  public static int PQSL_POLDETSTNPR2_VAR_PROV_SVIL = 27;
  public static int PQSL_POLDETSTNPR2_RECOSTANPRO1 = 28;
  public static int PQSL_POLDETSTNPR2_RECOSTANPRO2 = 29;
  public static int PQSL_POLDETSTNPR2_IMP_CONS = 30;
  public static int PQSL_POLDETSTNPR2_IMP_SVIL = 31;
  public static int PQSL_POLDETSTNPR2_DISP_CONS = 32;
  public static int PQSL_POLDETSTNPR2_DISP_SVIL = 33;
  public static int PQSL_POLDETSTNPR2_VAR_PROPOSTE = 34;
  public static int PQSL_POLDETSTNPR2_VAR_PROPOSTE_CONS = 35;
  public static int PQSL_POLDETSTNPR2_VAR_PROPOSTE_SVIL = 36;
  public static int PQSL_POLDETSTNPR2_RECSTACONPRO = 37;
  public static int PQSL_POLDETSTNPR2_RECSTACONPR1 = 38;
  public static int PQSL_POLDETSTNPR2_RECSTACONPR2 = 39;
  public static int PQSL_POLDETSTNPR2_RECODISPPROV = 40;
  public static int PQSL_POLDETSTNPR2_RECODISPPRO1 = 41;
  public static int PQSL_POLDETSTNPR2_RECODISPPRO2 = 42;
  public static int PQSL_POLDETSTNPR2_RECDISCONPRO = 43;
  public static int PQSL_POLDETSTNPR2_RECDISCONPR1 = 44;
  public static int PQSL_POLDETSTNPR2_RECDISCONPR2 = 45;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO24 = 2640;
  public static int PQRY_FILTRO24_RS = 2641;
  public static int PQSL_FILTRO24_ROWNAMEESERC = 0;

  // Table to contain panel selected row: POL DETTAGLIO STN PROG
  //
  public static int PQRY_POLDETSTNPR3 = 2642;
  public static int PQSL_POLDETSTNPR3_VOCE_PEG_ID = 0;
  public static int PQSL_POLDETSTNPR3_PROGETTO_ID = 1;
  public static int PQSL_POLDETSTNPR3_STN_INI = 2;
  public static int PQSL_POLDETSTNPR3_VAR_INI = 3;
  public static int PQSL_POLDETSTNPR3_RECORICHDEFI = 4;
  public static int PQSL_POLDETSTNPR3_VAR_DEF = 5;
  public static int PQSL_POLDETSTNPR3_RECOSTANATTU = 6;
  public static int PQSL_POLDETSTNPR3_VAR_PROV = 7;
  public static int PQSL_POLDETSTNPR3_RECOSTANPROV = 8;
  public static int PQSL_POLDETSTNPR3_IMPEGNABILE_INI = 9;
  public static int PQSL_POLDETSTNPR3_VAR_INI_IMPEGNABILE = 10;
  public static int PQSL_POLDETSTNPR3_RECRICDEFIMP = 11;
  public static int PQSL_POLDETSTNPR3_VAR_DEF_IMPEGNABILE = 12;
  public static int PQSL_POLDETSTNPR3_RECOIMPEATTU = 13;
  public static int PQSL_POLDETSTNPR3_IMP_ACC = 14;
  public static int PQSL_POLDETSTNPR3_DISP = 15;
  public static int PQSL_POLDETSTNPR3_STN_INI_CONS = 16;
  public static int PQSL_POLDETSTNPR3_STN_INI_SVIL = 17;
  public static int PQSL_POLDETSTNPR3_VAR_INI_CONS = 18;
  public static int PQSL_POLDETSTNPR3_VAR_INI_SVIL = 19;
  public static int PQSL_POLDETSTNPR3_RECRICDEFCON = 20;
  public static int PQSL_POLDETSTNPR3_RECRICDEFSVI = 21;
  public static int PQSL_POLDETSTNPR3_VAR_DEF_CONS = 22;
  public static int PQSL_POLDETSTNPR3_VAR_DEF_SVIL = 23;
  public static int PQSL_POLDETSTNPR3_RECOSTANATT1 = 24;
  public static int PQSL_POLDETSTNPR3_RECOSTANATT2 = 25;
  public static int PQSL_POLDETSTNPR3_VAR_PROV_CONS = 26;
  public static int PQSL_POLDETSTNPR3_VAR_PROV_SVIL = 27;
  public static int PQSL_POLDETSTNPR3_RECOSTANPRO1 = 28;
  public static int PQSL_POLDETSTNPR3_RECOSTANPRO2 = 29;
  public static int PQSL_POLDETSTNPR3_IMP_CONS = 30;
  public static int PQSL_POLDETSTNPR3_IMP_SVIL = 31;
  public static int PQSL_POLDETSTNPR3_DISP_CONS = 32;
  public static int PQSL_POLDETSTNPR3_DISP_SVIL = 33;
  public static int PQSL_POLDETSTNPR3_VAR_PROPOSTE = 34;
  public static int PQSL_POLDETSTNPR3_VAR_PROPOSTE_CONS = 35;
  public static int PQSL_POLDETSTNPR3_VAR_PROPOSTE_SVIL = 36;
  public static int PQSL_POLDETSTNPR3_RECSTACONPRO = 37;
  public static int PQSL_POLDETSTNPR3_RECSTACONPR1 = 38;
  public static int PQSL_POLDETSTNPR3_RECSTACONPR2 = 39;
  public static int PQSL_POLDETSTNPR3_RECODISPPROV = 40;
  public static int PQSL_POLDETSTNPR3_RECODISPPRO1 = 41;
  public static int PQSL_POLDETSTNPR3_RECODISPPRO2 = 42;
  public static int PQSL_POLDETSTNPR3_RECDISCONPRO = 43;
  public static int PQSL_POLDETSTNPR3_RECDISCONPR1 = 44;
  public static int PQSL_POLDETSTNPR3_RECDISCONPR2 = 45;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO22 = 2643;
  public static int PQRY_FILTRO22_RS = 2644;
  public static int PQSL_FILTRO22_ROWNAMEESERC = 0;

  // Table to contain panel selected row: VISTA TOT OPE
  //
  public static int PQRY_VISTATOTOPE = 2645;
  public static int PQSL_VISTATOTOPE_FINANZIAMENTO = 0;
  public static int PQSL_VISTATOTOPE_PREVISIONE_INI_E = 1;
  public static int PQSL_VISTATOTOPE_VARIAZIONI_E = 2;
  public static int PQSL_VISTATOTOPE_PREVISIONE_ATT_E = 3;
  public static int PQSL_VISTATOTOPE_ACCERTATO_COMP = 4;
  public static int PQSL_VISTATOTOPE_DISPONIBILITA_E = 5;
  public static int PQSL_VISTATOTOPE_VARCOMPRO_E = 6;
  public static int PQSL_VISTATOTOPE_ESERCIZIO = 7;
  public static int PQSL_VISTATOTOPE_PREVISIONE_INI_S = 8;
  public static int PQSL_VISTATOTOPE_VARIAZIONI_S = 9;
  public static int PQSL_VISTATOTOPE_PREVISIONE_ATT_S = 10;
  public static int PQSL_VISTATOTOPE_IMPEGNATO_COMP = 11;
  public static int PQSL_VISTATOTOPE_DISPONIBILITA_S = 12;
  public static int PQSL_VISTATOTOPE_VARCOMPRO_S = 13;
  public static int PQSL_VISTATOTOPE_VISTOTOPDIPR = 14;
  public static int PQSL_VISTATOTOPE_VISTOOPDIPR1 = 15;
  public static int PQSL_VISTATOTOPE_VITOOPDICOPR = 16;
  public static int PQSL_VISTATOTOPE_PROPOSTE_E_1 = 17;
  public static int PQSL_VISTATOTOPE_PROPOSTE_E_2 = 18;
  public static int PQSL_VISTATOTOPE_PROPOSTE_E_3 = 19;
  public static int PQSL_VISTATOTOPE_PROPOSTE_S_1 = 20;
  public static int PQSL_VISTATOTOPE_PROPOSTE_S_2 = 21;
  public static int PQSL_VISTATOTOPE_PROPOSTE_S_3 = 22;
  public static int PQSL_VISTATOTOPE_VITOOPDICOP1 = 23;
  public static int PQSL_VISTATOTOPE_VITOOPDICOP2 = 24;
  public static int PQSL_VISTATOTOPE_VITOOPDICOP4 = 25;
  public static int PQSL_VISTATOTOPE_VITOOPDICOP5 = 26;
  public static int PQSL_VISTATOTOPE_VITOOPDICOP3 = 27;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME28 = 2646;
  public static int PQSL_FINANZIAME28_CODICE = 0;
  public static int PQSL_FINANZIAME28_DESCRIZIONE = 1;
  public static int PQSL_FINANZIAME28_ENTE = 2;
  public static int PQSL_FINANZIAME28_ANNO_MUTUO = 3;
  public static int PQSL_FINANZIAME28_NUMERO_MUTUO = 4;
  public static int PQSL_FINANZIAME28_NOTE = 5;
  public static int PQSL_FINANZIAME28_CATEGORIA = 6;
  public static int PQSL_FINANZIAME28_COD_ALLEGATO = 7;
  public static int PQSL_FINANZIAME28_IMPORTO_ORIG = 8;
  public static int PQSL_FINANZIAME28_TIPO_DURATA = 9;
  public static int PQSL_FINANZIAME28_SCADENZA = 10;
  public static int PQSL_FINANZIAME28_SALDO_INI_CASSA = 11;
  public static int PQSL_FINANZIAME28_SALDO_INI_TESORERIA = 12;
  public static int PQSL_FINANZIAME28_RAGIONE_SOCIALE_ESTESA = 13;
  public static int PQSL_FINANZIAME28_FINADURADESC = 14;
  public static int PQSL_FINANZIAME28_DESC_ABB = 15;
  public static int PQSL_FINANZIAME28_FINADISADESC = 16;
  public static int PQSL_FINANZIAME28_COD_FIN_DISAV = 17;
  public static int PQSL_FINANZIAME28_LEGGE_REG = 18;
  public static int PQSL_FINANZIAME28_CAPITOLO_REG = 19;
  public static int PQSL_FINANZIAME28_ATTO_ASS = 20;
  public static int PQSL_FINANZIAME28_DIPARTIMENTO = 21;
  public static int PQSL_FINANZIAME28_FINASERVOPER = 22;
  public static int PQSL_FINANZIAME28_FINASETTOPER = 23;
  public static int PQSL_FINANZIAME28_FINANZFLESSI = 24;
  public static int PQSL_FINANZIAME28_FINANZCATEGO = 25;
  public static int PQSL_FINANZIAME28_FINAALLALPEG = 26;
  public static int PQSL_FINANZIAME28_FINAFINADISA = 27;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI35 = 2647;
  public static int PQRY_PARAMETRI35_RS = 2648;
  public static int PQSL_PARAMETRI35_PARACODIFINA = 0;
  public static int PQSL_PARAMETRI35_PARAMDATAAL = 1;
  public static int PQSL_PARAMETRI35_PARAMESERCIZ = 2;

  // Table to contain panel selected row: VISTA TOT OPE
  //
  public static int PQRY_VISTATOTOPE1 = 2649;
  public static int PQSL_VISTATOTOPE1_OPERA = 0;
  public static int PQSL_VISTATOTOPE1_PREVISIONE_INI_E = 1;
  public static int PQSL_VISTATOTOPE1_VARIAZIONI_E = 2;
  public static int PQSL_VISTATOTOPE1_PREVISIONE_ATT_E = 3;
  public static int PQSL_VISTATOTOPE1_ACCERTATO_COMP = 4;
  public static int PQSL_VISTATOTOPE1_DISPONIBILITA_E = 5;
  public static int PQSL_VISTATOTOPE1_VARCOMPRO_E = 6;
  public static int PQSL_VISTATOTOPE1_ESERCIZIO = 7;
  public static int PQSL_VISTATOTOPE1_PREVISIONE_INI_S = 8;
  public static int PQSL_VISTATOTOPE1_VARIAZIONI_S = 9;
  public static int PQSL_VISTATOTOPE1_PREVISIONE_ATT_S = 10;
  public static int PQSL_VISTATOTOPE1_IMPEGNATO_COMP = 11;
  public static int PQSL_VISTATOTOPE1_DISPONIBILITA_S = 12;
  public static int PQSL_VISTATOTOPE1_VARCOMPRO_S = 13;
  public static int PQSL_VISTATOTOPE1_VISTOTOPDEOP = 14;
  public static int PQSL_VISTATOTOPE1_VISTOTOPDIPR = 15;
  public static int PQSL_VISTATOTOPE1_VISTOOPDIPR1 = 16;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_E_1 = 17;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_E_2 = 18;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_E_3 = 19;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_S_1 = 20;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_S_2 = 21;
  public static int PQSL_VISTATOTOPE1_PROPOSTE_S_3 = 22;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOPR = 23;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOP1 = 24;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOP2 = 25;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOP3 = 26;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOP4 = 27;
  public static int PQSL_VISTATOTOPE1_VITOOPDICOP5 = 28;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO32 = 2650;
  public static int PQRY_FILTRO32_RS = 2651;
  public static int PQSL_FILTRO32_ROWNAMEESERC = 0;

  // Table to contain panel selected row: POL SCHEDE OBIETTIVO
  //
  public static int PQRY_POLSCHEDOBI5 = 2652;
  public static int PQSL_POLSCHEDOBI5_REPOSCSCOBID = 0;
  public static int PQSL_POLSCHEDOBI5_STATO = 1;
  public static int PQSL_POLSCHEDOBI5_OBIETTIVO_ID = 2;
  public static int PQSL_POLSCHEDOBI5_DESCRIZIONE = 3;
  public static int PQSL_POLSCHEDOBI5_RECODESCESTE = 4;
  public static int PQSL_POLSCHEDOBI5_RECORDRESPON = 5;
  public static int PQSL_POLSCHEDOBI5_ANNULLATA = 6;
  public static int PQSL_POLSCHEDOBI5_PESO_INDICATORI_TARGET = 7;
  public static int PQSL_POLSCHEDOBI5_PESO_INDICATORI_SOGLIA = 8;
  public static int PQSL_POLSCHEDOBI5_PESO_TARGET = 9;
  public static int PQSL_POLSCHEDOBI5_PESO_SOGLIA_RAGGIUNTA = 10;
  public static int PQSL_POLSCHEDOBI5_PROGETTO_ID = 11;
  public static int PQSL_POLSCHEDOBI5_PROGR_UNITA_ORGANIZZATIVA = 12;
  public static int PQSL_POLSCHEDOBI5_CATEGORIA = 13;
  public static int PQSL_POLSCHEDOBI5_CLASSIFICAZIONE = 14;
  public static int PQSL_POLSCHEDOBI5_PROGRESSIVO = 15;
  public static int PQSL_POLSCHEDOBI5_CALCOLO_PERCENTUALE = 16;
  public static int PQSL_POLSCHEDOBI5_DESCRIZIONE_ESTESA = 17;

  // Table to contain panel selected row: POL SCHEDE OBIETTIVO
  //
  public static int PQRY_POLSCHEDOBI6 = 2653;
  public static int PQSL_POLSCHEDOBI6_REPOSCSCOBID = 0;
  public static int PQSL_POLSCHEDOBI6_STATO = 1;
  public static int PQSL_POLSCHEDOBI6_DESCRIZIONE = 2;
  public static int PQSL_POLSCHEDOBI6_RECORDRESPON = 3;
  public static int PQSL_POLSCHEDOBI6_ANNULLATA = 4;
  public static int PQSL_POLSCHEDOBI6_PESO_INDICATORI_TARGET = 5;
  public static int PQSL_POLSCHEDOBI6_PESO_INDICATORI_SOGLIA = 6;
  public static int PQSL_POLSCHEDOBI6_PESO_TARGET = 7;
  public static int PQSL_POLSCHEDOBI6_PESO_SOGLIA_RAGGIUNTA = 8;
  public static int PQSL_POLSCHEDOBI6_PROGR_UNITA_ORGANIZZATIVA = 9;
  public static int PQSL_POLSCHEDOBI6_PROGRESSIVO = 10;
  public static int PQSL_POLSCHEDOBI6_CALCOLO_PERCENTUALE = 11;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS22 = 2654;
  public static int PQRY_PARS22_RS = 2655;
  public static int PQSL_PARS22_ROWNAMEPROUO = 0;
  public static int PQSL_PARS22_ROWNAMEVARID = 1;

  // Table to contain panel selected row: POL WRK VAR SCOB
  //
  public static int PQRY_POLWRKVARSC2 = 2656;
  public static int PQSL_POLWRKVARSC2_RECOUOLIVSUP = 0;
  public static int PQSL_POLWRKVARSC2_PROGR_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_POLWRKVARSC2_RECORDUODESC = 2;
  public static int PQSL_POLWRKVARSC2_PROGETTO_ID = 3;
  public static int PQSL_POLWRKVARSC2_DESCRIZIONE = 4;
  public static int PQSL_POLWRKVARSC2_PROGRESSIVO = 5;
  public static int PQSL_POLWRKVARSC2_RECORDRAGGRU = 6;
  public static int PQSL_POLWRKVARSC2_TIPO_VAR = 7;
  public static int PQSL_POLWRKVARSC2_SCHEDA_OBIETTIVO_ID = 8;
  public static int PQSL_POLWRKVARSC2_PROGR_SESSIONE = 9;
  public static int PQSL_POLWRKVARSC2_CODICE_OBIETTIVO = 10;
  public static int PQSL_POLWRKVARSC2_TIT_1_S = 11;
  public static int PQSL_POLWRKVARSC2_TIT_2_S = 12;
  public static int PQSL_POLWRKVARSC2_TIT_3_S = 13;
  public static int PQSL_POLWRKVARSC2_TIT_4_S = 14;
  public static int PQSL_POLWRKVARSC2_TIT_1_5_E = 15;
  public static int PQSL_POLWRKVARSC2_TIT_6_E = 16;
  public static int PQSL_POLWRKVARSC2_NOTE = 17;
  public static int PQSL_POLWRKVARSC2_DESCRIZIONE_OLD = 18;
  public static int PQSL_POLWRKVARSC2_TIT_1_S_OLD = 19;
  public static int PQSL_POLWRKVARSC2_TIT_2_S_OLD = 20;
  public static int PQSL_POLWRKVARSC2_TIT_3_S_OLD = 21;
  public static int PQSL_POLWRKVARSC2_TIT_4_S_OLD = 22;
  public static int PQSL_POLWRKVARSC2_TIT_1_5_E_OLD = 23;
  public static int PQSL_POLWRKVARSC2_TIT_6_E_OLD = 24;

  // Table to contain panel selected row: POL WRK VAR FASI
  //
  public static int PQRY_POLWRKVARFA2 = 2657;
  public static int PQSL_POLWRKVARFA2_PROGRESSIVO = 0;
  public static int PQSL_POLWRKVARFA2_SEQUENZA = 1;
  public static int PQSL_POLWRKVARFA2_DESCRIZIONE = 2;
  public static int PQSL_POLWRKVARFA2_DATA_INIZIO = 3;
  public static int PQSL_POLWRKVARFA2_DATA_FINE = 4;
  public static int PQSL_POLWRKVARFA2_RECORDORD = 5;
  public static int PQSL_POLWRKVARFA2_TIPO_VAR = 6;
  public static int PQSL_POLWRKVARFA2_SEQUENZA_OLD = 7;
  public static int PQSL_POLWRKVARFA2_DESCRIZIONE_OLD = 8;
  public static int PQSL_POLWRKVARFA2_DATA_INIZIO_OLD = 9;
  public static int PQSL_POLWRKVARFA2_DATA_FINE_OLD = 10;

  // Table to contain panel selected row: POL WRK VAR FASI
  //
  public static int PQRY_POLWRKVARFA3 = 2658;
  public static int PQSL_POLWRKVARFA3_PROGRESSIVO = 0;
  public static int PQSL_POLWRKVARFA3_SEQUENZA = 1;
  public static int PQSL_POLWRKVARFA3_DESCRIZIONE = 2;
  public static int PQSL_POLWRKVARFA3_DATA_INIZIO = 3;
  public static int PQSL_POLWRKVARFA3_DATA_FINE = 4;
  public static int PQSL_POLWRKVARFA3_TIPO_VAR = 5;
  public static int PQSL_POLWRKVARFA3_DESCRIZIONE_OLD = 6;
  public static int PQSL_POLWRKVARFA3_SEQUENZA_OLD = 7;
  public static int PQSL_POLWRKVARFA3_DATA_INIZIO_OLD = 8;
  public static int PQSL_POLWRKVARFA3_DATA_FINE_OLD = 9;
  public static int PQSL_POLWRKVARFA3_NOTE = 10;

  // Table to contain panel selected row: Note 1
  //
  public static int PQRY_NOTE7 = 2659;
  public static int PQRY_NOTE7_RS = 2660;
  public static int PQSL_NOTE7_ROWNAMENOTE1 = 0;

  // Table to contain panel selected row: Note 2
  //
  public static int PQRY_NOTE8 = 2661;
  public static int PQRY_NOTE8_RS = 2662;
  public static int PQSL_NOTE8_ROWNAMENOTE2 = 0;

  // Table to contain panel selected row: Note 3
  //
  public static int PQRY_NOTE9 = 2663;
  public static int PQRY_NOTE9_RS = 2664;
  public static int PQSL_NOTE9_ROWNAMENOTE3 = 0;

  // Table to contain panel selected row: Note 4
  //
  public static int PQRY_NOTE10 = 2665;
  public static int PQRY_NOTE10_RS = 2666;
  public static int PQSL_NOTE10_ROWNAMENOTE4 = 0;

  // Table to contain panel selected row: Note 5
  //
  public static int PQRY_NOTE11 = 2667;
  public static int PQRY_NOTE11_RS = 2668;
  public static int PQSL_NOTE11_ROWNAMENOTE5 = 0;

  // Table to contain panel selected row: ASSESTAMENTI
  //
  public static int PQRY_ASSESTAMENTI = 2669;
  public static int PQSL_ASSESTAMENTI_ESERCIZIO = 0;
  public static int PQSL_ASSESTAMENTI_CODICE = 1;
  public static int PQSL_ASSESTAMENTI_DESCRIZIONE = 2;
  public static int PQSL_ASSESTAMENTI_CHIUSO = 3;
  public static int PQSL_ASSESTAMENTI_GENERATO = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI435 = 2670;
  public static int PQRY_PARAMETRI435_RS = 2671;
  public static int PQSL_PARAMETRI435_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMETRI435_ROWNAMEVARIA = 1;
  public static int PQSL_PARAMETRI435_ROWNAMSEDDEL = 2;
  public static int PQSL_PARAMETRI435_ROWNAMNUMDEL = 3;
  public static int PQSL_PARAMETRI435_ROWNAMANNDEL = 4;
  public static int PQSL_PARAMETRI435_ROWNAMUNIPRO = 5;
  public static int PQSL_PARAMETRI435_ROWNAMNUMPRO = 6;
  public static int PQSL_PARAMETRI435_ROWNAMANNPRO = 7;
  public static int PQSL_PARAMETRI435_ROWNAMTIPSTA = 8;
  public static int PQSL_PARAMETRI435_ROWNAMTIPIMP = 9;
  public static int PQSL_PARAMETRI435_ROWNAMINTSTA = 10;
  public static int PQSL_PARAMETRI435_ROWNAMVISSTA = 11;
  public static int PQSL_PARAMETRI435_ROWNAMEDATAL = 12;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM15 = 2672;
  public static int PQSL_VARCOM15_RECORVARIAES = 0;
  public static int PQSL_VARCOM15_RECVISRICACA = 1;
  public static int PQSL_VARCOM15_RECVISRICAAR = 2;
  public static int PQSL_VARCOM15_RAGGRTREV = 3;
  public static int PQSL_VARCOM15_RECORDRAGGR = 4;
  public static int PQSL_VARCOM15_CODBIL = 5;
  public static int PQSL_VARCOM15_RECORCAPDESC = 6;
  public static int PQSL_VARCOM15_CODPIANOCONT = 7;
  public static int PQSL_VARCOM15_RECORDIMPORT = 8;
  public static int PQSL_VARCOM15_RECOIMPOCAS1 = 9;
  public static int PQSL_VARCOM15_RECOIMPOCOME = 10;
  public static int PQSL_VARCOM15_RECOIMPOCOMS = 11;
  public static int PQSL_VARCOM15_RECOIMPOCASE = 12;
  public static int PQSL_VARCOM15_RECOIMPOCASS = 13;
  public static int PQSL_VARCOM15_CDR = 14;
  public static int PQSL_VARCOM15_OBIETTGESTIO = 15;
  public static int PQSL_VARCOM15_REVIRICAMITI = 16;
  public static int PQSL_VARCOM15_REVIRICAPRTI = 17;
  public static int PQSL_VARCOM15_RECVISRICATI = 18;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL9 = 2673;
  public static int PQSL_BIL9_RECBILSTINCO = 0;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL10 = 2674;
  public static int PQSL_BIL10_RECBILSTINCA = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI519 = 2675;
  public static int PQRY_PARAMETRI519_RS = 2676;
  public static int PQSL_PARAMETRI519_ROWNAMVABIPE = 0;
  public static int PQSL_PARAMETRI519_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRI519_ROWNAMTIPVAR = 2;
  public static int PQSL_PARAMETRI519_ROWNAMEVARIA = 3;
  public static int PQSL_PARAMETRI519_ROWNAMEDAL = 4;
  public static int PQSL_PARAMETRI519_ROWNAMEAL = 5;
  public static int PQSL_PARAMETRI519_ROWNAMSEDDEL = 6;
  public static int PQSL_PARAMETRI519_ROWNAMNUMDEL = 7;
  public static int PQSL_PARAMETRI519_ROWNAMANNDEL = 8;
  public static int PQSL_PARAMETRI519_ROWNAMUNIPRO = 9;
  public static int PQSL_PARAMETRI519_ROWNAMNUMPRO = 10;
  public static int PQSL_PARAMETRI519_ROWNAMANNPRO = 11;
  public static int PQSL_PARAMETRI519_ROWNAMDETCAP = 12;
  public static int PQSL_PARAMETRI519_ROWNAMTIPSTA = 13;
  public static int PQSL_PARAMETRI519_ROWNAMDESVAR = 14;
  public static int PQSL_PARAMETRI519_ROWNAMTIPMOT = 15;
  public static int PQSL_PARAMETRI519_ROWNAMEORDIN = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI191 = 2677;
  public static int PQRY_PARAMETRI191_RS = 2678;
  public static int PQSL_PARAMETRI191_ROWNAMSEDDEL = 0;
  public static int PQSL_PARAMETRI191_ROWNAMNUMDEL = 1;
  public static int PQSL_PARAMETRI191_ROWNAMANNDEL = 2;
  public static int PQSL_PARAMETRI191_ROWNAMUNIPRO = 3;
  public static int PQSL_PARAMETRI191_ROWNAMNUMPRO = 4;
  public static int PQSL_PARAMETRI191_ROWNAMANNPRO = 5;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM1 = 2679;
  public static int PQSL_VARCOM1_RECOVARCESER = 0;
  public static int PQSL_VARCOM1_RETIMOVBTIQU = 1;
  public static int PQSL_VARCOM1_POSITIENTRAT = 2;
  public static int PQSL_VARCOM1_NEGATIVSPESA = 3;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO8 = 2680;
  public static int PQSL_VARCOMPRO8_VARCMISSTITO = 0;
  public static int PQSL_VARCOMPRO8_VARCPROGTIPO = 1;
  public static int PQSL_VARCOMPRO8_VARCOMPMACRO = 2;
  public static int PQSL_VARCOMPRO8_VARVISRICAE1 = 3;
  public static int PQSL_VARCOMPRO8_VARVISRICAES = 4;
  public static int PQSL_VARCOMPRO8_VARVISRICACA = 5;
  public static int PQSL_VARCOMPRO8_VARVISRICAAR = 6;
  public static int PQSL_VARCOMPRO8_VARCODESCCAP = 7;
  public static int PQSL_VARCOMPRO8_VARCATTUCOMP = 8;
  public static int PQSL_VARCOMPRO8_VARVARPROCOM = 9;
  public static int PQSL_VARCOMPRO8_TOTALECOMPET = 10;
  public static int PQSL_VARCOMPRO8_RESIDUI = 11;
  public static int PQSL_VARCOMPRO8_ATTUALECASSA = 12;
  public static int PQSL_VARCOMPRO8_VARVARPROCAS = 13;
  public static int PQSL_VARCOMPRO8_TOTALECASSA = 14;
  public static int PQSL_VARCOMPRO8_DIFFERENZA = 15;
  public static int PQSL_VARCOMPRO8_INFOVARIAZIO = 16;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM121 = 2681;
  public static int PQRY_PARAM121_RS = 2682;
  public static int PQSL_PARAM121_PARAMPARTE = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI509 = 2683;
  public static int PQRY_PARAMETRI509_RS = 2684;
  public static int PQSL_PARAMETRI509_ROWNAMVABIPE = 0;
  public static int PQSL_PARAMETRI509_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRI509_ROWNAMTIPVAR = 2;
  public static int PQSL_PARAMETRI509_ROWNAMEVARIA = 3;
  public static int PQSL_PARAMETRI509_ROWNAMEDAL = 4;
  public static int PQSL_PARAMETRI509_ROWNAMEAL = 5;
  public static int PQSL_PARAMETRI509_ROWNAMSEDDEL = 6;
  public static int PQSL_PARAMETRI509_ROWNAMNUMDEL = 7;
  public static int PQSL_PARAMETRI509_ROWNAMANNDEL = 8;
  public static int PQSL_PARAMETRI509_ROWNAMUNIPRO = 9;
  public static int PQSL_PARAMETRI509_ROWNAMNUMPRO = 10;
  public static int PQSL_PARAMETRI509_ROWNAMANNPRO = 11;
  public static int PQSL_PARAMETRI509_ROWNAMDETCAP = 12;
  public static int PQSL_PARAMETRI509_ROWNAMTIPSTA = 13;
  public static int PQSL_PARAMETRI509_ROWNAMDESVAR = 14;
  public static int PQSL_PARAMETRI509_ROWNAMTIPMOT = 15;
  public static int PQSL_PARAMETRI509_ROWNAMTIPIMP = 16;
  public static int PQSL_PARAMETRI509_ROWNAMEORDIN = 17;

  // Table to contain panel selected row: VARIAZIONI
  //
  public static int PQRY_VARIAZIONI3 = 2685;
  public static int PQSL_VARIAZIONI3_RECSUDUNISUP = 0;
  public static int PQSL_VARIAZIONI3_RESPSUDD = 1;
  public static int PQSL_VARIAZIONI3_RESPUO = 2;
  public static int PQSL_VARIAZIONI3_PROGR_UNITA_ORGANIZZATIVA = 3;
  public static int PQSL_VARIAZIONI3_RECORDESCRUO = 4;
  public static int PQSL_VARIAZIONI3_E_S = 5;
  public static int PQSL_VARIAZIONI3_RECORVOCEPEG = 6;
  public static int PQSL_VARIAZIONI3_CAPITOLO = 7;
  public static int PQSL_VARIAZIONI3_ARTICOLO = 8;
  public static int PQSL_VARIAZIONI3_RECORCODIBIL = 9;
  public static int PQSL_VARIAZIONI3_RECORCAPDESC = 10;
  public static int PQSL_VARIAZIONI3_DESCRIZIONE = 11;
  public static int PQSL_VARIAZIONI3_RECOSTANINIZ = 12;
  public static int PQSL_VARIAZIONI3_SEDE_DEL = 13;
  public static int PQSL_VARIAZIONI3_D_DATA_DEL = 14;
  public static int PQSL_VARIAZIONI3_NUMERO_DEL = 15;
  public static int PQSL_VARIAZIONI3_ANNO_DEL = 16;
  public static int PQSL_VARIAZIONI3_DELIBERA = 17;
  public static int PQSL_VARIAZIONI3_RECOVARIPOSI = 18;
  public static int PQSL_VARIAZIONI3_RECOVARINEGA = 19;
  public static int PQSL_VARIAZIONI3_IMPORTO = 20;
  public static int PQSL_VARIAZIONI3_CODPIANOCONT = 21;
  public static int PQSL_VARIAZIONI3_RECORDORDINA = 22;
  public static int PQSL_VARIAZIONI3_RECVARANNPR1 = 23;
  public static int PQSL_VARIAZIONI3_RECVARUNIPR1 = 24;
  public static int PQSL_VARIAZIONI3_RECVARNUMPR1 = 25;
  public static int PQSL_VARIAZIONI3_PROPOSTA = 26;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINT100 = 2686;
  public static int QSL_CFASELINT100_PAGINETOTALI = 0;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO = 2687;
  public static int PQSL_VARCOMPRO_VARCOMPROGRE = 0;
  public static int PQSL_VARCOMPRO_VARCOMESERCI = 1;
  public static int PQSL_VARCOMPRO_VARCOMPROES = 2;
  public static int PQSL_VARCOMPRO_VARCOMCAPITO = 3;
  public static int PQSL_VARCOMPRO_VARCOMARTICO = 4;
  public static int PQSL_VARCOMPRO_VARCOMIMPORT = 5;
  public static int PQSL_VARCOMPRO_VARCOMDESCRI = 6;
  public static int PQSL_VARCOMPRO_VARCOTIPOVAR = 7;
  public static int PQSL_VARCOMPRO_VARCANNOPROP = 8;
  public static int PQSL_VARCOMPRO_VARCUNITPROP = 9;
  public static int PQSL_VARCOMPRO_VARCNUMEPROP = 10;
  public static int PQSL_VARCOMPRO_VARCDDATAREG = 11;
  public static int PQSL_VARCOMPRO_VARCIMPOCASS = 12;

  // Table to contain panel selected row: Parfs
  //
  public static int PQRY_PARFS1 = 2688;
  public static int PQRY_PARFS1_RS = 2689;
  public static int PQSL_PARFS1_NOMOGGNUMIMP = 0;
  public static int PQSL_PARFS1_NOMOGGANNIMP = 1;
  public static int PQSL_PARFS1_NOMOGGPRODEF = 2;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM5 = 2690;
  public static int PQSL_VARCOM5_RECOVARCIMPO = 0;
  public static int PQSL_VARCOM5_RECVARIMPCAS = 1;
  public static int PQSL_VARCOM5_RECORDBILPEG = 2;
  public static int PQSL_VARCOM5_RECORDIMPEGN = 3;
  public static int PQSL_VARCOM5_DESCCAP = 4;
  public static int PQSL_VARCOM5_RECORIMPDESC = 5;
  public static int PQSL_VARCOM5_RECVARANNIMP = 6;
  public static int PQSL_VARCOM5_RECVARNUMIMP = 7;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM7 = 2691;
  public static int PQSL_VARCOM7_IMPORTO = 0;
  public static int PQSL_VARCOM7_COMPETENZA = 1;
  public static int PQSL_VARCOM7_DESC1 = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI525 = 2692;
  public static int PQRY_PARAMETRI525_RS = 2693;
  public static int PQSL_PARAMETRI525_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI525_ROWNAMSEDDEL = 1;
  public static int PQSL_PARAMETRI525_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMETRI525_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMETRI525_ROWNAMUNIPRO = 4;
  public static int PQSL_PARAMETRI525_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAMETRI525_ROWNAMANNPRO = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI321 = 2694;
  public static int PQRY_PARAMETRI321_RS = 2695;
  public static int PQSL_PARAMETRI321_ROWNAMVABIPE = 0;
  public static int PQSL_PARAMETRI321_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRI321_ROWNAMEFINAN = 2;
  public static int PQSL_PARAMETRI321_ROWNAMEOPERA = 3;
  public static int PQSL_PARAMETRI321_ROWNAMTIPVAR = 4;
  public static int PQSL_PARAMETRI321_ROWNAMEVARIA = 5;
  public static int PQSL_PARAMETRI321_ROWNAMEDAL = 6;
  public static int PQSL_PARAMETRI321_ROWNAMEAL = 7;
  public static int PQSL_PARAMETRI321_ROWNAMSEDDEL = 8;
  public static int PQSL_PARAMETRI321_ROWNAMNUMDEL = 9;
  public static int PQSL_PARAMETRI321_ROWNAMANNDEL = 10;
  public static int PQSL_PARAMETRI321_ROWNAMUNIPRO = 11;
  public static int PQSL_PARAMETRI321_ROWNAMNUMPRO = 12;
  public static int PQSL_PARAMETRI321_ROWNAMANNPRO = 13;
  public static int PQSL_PARAMETRI321_ROWNAMDETOPE = 14;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI336 = 2696;
  public static int PQRY_PARAMETRI336_RS = 2697;
  public static int PQSL_PARAMETRI336_ROWNAMVABIPE = 0;
  public static int PQSL_PARAMETRI336_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRI336_ROWNAMTIPVAR = 2;
  public static int PQSL_PARAMETRI336_ROWNAMEVARIA = 3;
  public static int PQSL_PARAMETRI336_ROWNAMEDAL = 4;
  public static int PQSL_PARAMETRI336_ROWNAMEAL = 5;
  public static int PQSL_PARAMETRI336_ROWNAMSEDDEL = 6;
  public static int PQSL_PARAMETRI336_ROWNAMNUMDEL = 7;
  public static int PQSL_PARAMETRI336_ROWNAMANNDEL = 8;
  public static int PQSL_PARAMETRI336_ROWNAMUNIPRO = 9;
  public static int PQSL_PARAMETRI336_ROWNAMNUMPRO = 10;
  public static int PQSL_PARAMETRI336_ROWNAMANNPRO = 11;
  public static int PQSL_PARAMETRI336_ROWNAMDETCAP = 12;
  public static int PQSL_PARAMETRI336_ROWNAMDESINT = 13;
  public static int PQSL_PARAMETRI336_ROWNAMDESVAR = 14;
  public static int PQSL_PARAMETRI336_ROWNAMEPROGR = 15;
  public static int PQSL_PARAMETRI336_ROWNAMEPROGE = 16;
  public static int PQSL_PARAMETRI336_ROWNAMTIPSTA = 17;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI438 = 2698;
  public static int PQRY_PARAMETRI438_RS = 2699;
  public static int PQSL_PARAMETRI438_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI438_ROWNAMSEDDEL = 1;
  public static int PQSL_PARAMETRI438_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMETRI438_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMETRI438_ROWNAMUNIPRO = 4;
  public static int PQSL_PARAMETRI438_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAMETRI438_ROWNAMANNPRO = 6;
  public static int PQSL_PARAMETRI438_ROWNAMEESERC = 7;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO5 = 2700;
  public static int PQSL_VARCOMPRO5_RECOVARCESER = 0;
  public static int PQSL_VARCOMPRO5_RECVARANNIMP = 1;
  public static int PQSL_VARCOMPRO5_RECVARNUMIMP = 2;
  public static int PQSL_VARCOMPRO5_RECVARANNESI = 3;
  public static int PQSL_VARCOMPRO5_RECOVARCCAPI = 4;
  public static int PQSL_VARCOMPRO5_RECOVARCARTI = 5;
  public static int PQSL_VARCOMPRO5_CAPART = 6;
  public static int PQSL_VARCOMPRO5_RECOVARCIMPO = 7;
  public static int PQSL_VARCOMPRO5_RECVARIMPCAS = 8;
  public static int PQSL_VARCOMPRO5_MISSIONE = 9;
  public static int PQSL_VARCOMPRO5_PROGRAMMA = 10;
  public static int PQSL_VARCOMPRO5_DESMISSIONE = 11;
  public static int PQSL_VARCOMPRO5_DESPROGRAMMA = 12;
  public static int PQSL_VARCOMPRO5_MACROLIVSTR = 13;
  public static int PQSL_VARCOMPRO5_TITOLO = 14;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM3 = 2701;
  public static int PQSL_VARCOM3_RECOVARCESER = 0;
  public static int PQSL_VARCOM3_ES = 1;
  public static int PQSL_VARCOM3_Capitolo = 2;
  public static int PQSL_VARCOM3_Articolo = 3;
  public static int PQSL_VARCOM3_DESCRIZIONE = 4;
  public static int PQSL_VARCOM3_RECVARSEDDEL = 5;
  public static int PQSL_VARCOM3_RECVARNUMDEL = 6;
  public static int PQSL_VARCOM3_RECVARANNDEL = 7;
  public static int PQSL_VARCOM3_RECVARUNIPRO = 8;
  public static int PQSL_VARCOM3_RECVARNUMPRO = 9;
  public static int PQSL_VARCOM3_RECVARANNPRO = 10;
  public static int PQSL_VARCOM3_RECOVARCIMPO = 11;
  public static int PQSL_VARCOM3_RECVARIMPCAS = 12;
  public static int PQSL_VARCOM3_COMPE = 13;
  public static int PQSL_VARCOM3_COMPS = 14;
  public static int PQSL_VARCOM3_CASSAE = 15;
  public static int PQSL_VARCOM3_CASSAS = 16;
  public static int PQSL_VARCOM3_COMPP = 17;
  public static int PQSL_VARCOM3_COMPM = 18;
  public static int PQSL_VARCOM3_CASSAP = 19;
  public static int PQSL_VARCOM3_CASSAM = 20;
  public static int PQSL_VARCOM3_RECORDGRUPPO = 21;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM2 = 2702;
  public static int PQSL_VARCOM2_ESERCIZIO = 0;
  public static int PQSL_VARCOM2_E_S = 1;
  public static int PQSL_VARCOM2_CAPITOLO = 2;
  public static int PQSL_VARCOM2_ARTICOLO = 3;
  public static int PQSL_VARCOM2_DESCRIZIONE = 4;
  public static int PQSL_VARCOM2_Competenza_E = 5;
  public static int PQSL_VARCOM2_Competenza_S = 6;
  public static int PQSL_VARCOM2_Cassa_E = 7;
  public static int PQSL_VARCOM2_Cassa_S = 8;
  public static int PQSL_VARCOM2_Competenza_Piu = 9;
  public static int PQSL_VARCOM2_Competenza_Meno = 10;
  public static int PQSL_VARCOM2_Cassa_Piu = 11;
  public static int PQSL_VARCOM2_Cassa_Meno = 12;
  public static int PQSL_VARCOM2_SEDE_DEL = 13;
  public static int PQSL_VARCOM2_NUMERO_DEL = 14;
  public static int PQSL_VARCOM2_ANNO_DEL = 15;
  public static int PQSL_VARCOM2_UNITA_PROPONENTE = 16;
  public static int PQSL_VARCOM2_NUMERO_PROPOSTA = 17;
  public static int PQSL_VARCOM2_ANNO_PROPOSTA = 18;
  public static int PQSL_VARCOM2_PROGRESSIVO = 19;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM = 2703;
  public static int PQSL_VARCOM_ESERCIZIO = 0;
  public static int PQSL_VARCOM_E_S = 1;
  public static int PQSL_VARCOM_CAPITOLO = 2;
  public static int PQSL_VARCOM_ARTICOLO = 3;
  public static int PQSL_VARCOM_DESCRIZIONE = 4;
  public static int PQSL_VARCOM_Competenza_E = 5;
  public static int PQSL_VARCOM_Competenza_S = 6;
  public static int PQSL_VARCOM_Cassa_E = 7;
  public static int PQSL_VARCOM_Cassa_S = 8;
  public static int PQSL_VARCOM_Competenza_Piu = 9;
  public static int PQSL_VARCOM_Competenza_Meno = 10;
  public static int PQSL_VARCOM_Cassa_Piu = 11;
  public static int PQSL_VARCOM_Cassa_Meno = 12;
  public static int PQSL_VARCOM_UNITA_PROPONENTE = 13;
  public static int PQSL_VARCOM_NUMERO_PROPOSTA = 14;
  public static int PQSL_VARCOM_ANNO_PROPOSTA = 15;
  public static int PQSL_VARCOM_PROGRESSIVO = 16;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP10 = 2704;
  public static int PQRY_VARIMP10_RS = 2705;
  public static int PQSL_VARIMP10_RENOOGCACACS = 0;
  public static int PQSL_VARIMP10_RECCODPIACON = 1;
  public static int PQSL_VARIMP10_RECORDCAPITO = 2;
  public static int PQSL_VARIMP10_RECORDART = 3;
  public static int PQSL_VARIMP10_RECORDIMPEGN = 4;
  public static int PQSL_VARIMP10_RECORANNOIMP = 5;
  public static int PQSL_VARIMP10_RENOOGIMIMDE = 6;
  public static int PQSL_VARIMP10_RECORDIMPORT = 7;
  public static int PQSL_VARIMP10_RECOANNOESIG = 8;
  public static int PQSL_VARIMP10_RECNOMOGGPRO = 9;
  public static int PQSL_VARIMP10_RENOOGIMPRUO = 10;
  public static int PQSL_VARIMP10_RECNOMOGANEN = 11;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS73 = 2706;
  public static int PQRY_PARS73_RS = 2707;
  public static int PQSL_PARS73_NOMEOGGEPROP = 0;
  public static int PQSL_PARS73_NOMEOGGENUME = 1;
  public static int PQSL_PARS73_NOMEOGGEANNO = 2;
  public static int PQSL_PARS73_NOMEOGGEDESC = 3;
  public static int PQSL_PARS73_NOMOGGDATREG = 4;
  public static int PQSL_PARS73_NOMOGGTIPVAR = 5;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM120 = 2708;
  public static int PQRY_PARAM120_RS = 2709;
  public static int PQSL_PARAM120_NOMEOGGEVARI = 0;
  public static int PQSL_PARAM120_NOMEOGGEPROP = 1;
  public static int PQSL_PARAM120_NOMOGGNUMPRO = 2;
  public static int PQSL_PARAM120_NOMOGGANNPRO = 3;
  public static int PQSL_PARAM120_NOMEOGGEDELI = 4;
  public static int PQSL_PARAM120_NOMOGGNUMDEL = 5;
  public static int PQSL_PARAM120_NOMOGGANNDEL = 6;
  public static int PQSL_PARAM120_NOMEOGGECAPI = 7;
  public static int PQSL_PARAM120_NOMEOGGEARTI = 8;
  public static int PQSL_PARAM120_NOMOGGNUIMAC = 9;
  public static int PQSL_PARAM120_NOMOGGANIMAC = 10;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP6 = 2710;
  public static int PQSL_VARIMP6_VARIMPPROGRE = 0;
  public static int PQSL_VARIMP6_VARIMPCAPITO = 1;
  public static int PQSL_VARIMP6_VARIMPARTICO = 2;
  public static int PQSL_VARIMP6_VARIMNUMEIMP = 3;
  public static int PQSL_VARIMP6_VARIMANNOIMP = 4;
  public static int PQSL_VARIMP6_VARIANNOESIG = 5;
  public static int PQSL_VARIMP6_VARIMPDESCRI = 6;
  public static int PQSL_VARIMP6_VARIMPIMPORT = 7;

  // Table to contain panel selected row: VARACC
  //
  public static int PQRY_VARACC3 = 2711;
  public static int PQSL_VARACC3_VARACCPROGRE = 0;
  public static int PQSL_VARACC3_VARACCCAPITO = 1;
  public static int PQSL_VARACC3_VARACCARTICO = 2;
  public static int PQSL_VARACC3_VARACNUMEACC = 3;
  public static int PQSL_VARACC3_VARACANNOACC = 4;
  public static int PQSL_VARACC3_VARAANNOESIG = 5;
  public static int PQSL_VARACC3_VARACCDESCRI = 6;
  public static int PQSL_VARACC3_VARACCIMPORT = 7;

  // Table to contain panel selected row: VARACC
  //
  public static int PQRY_VARACC2 = 2712;
  public static int PQRY_VARACC2_RS = 2713;
  public static int PQSL_VARACC2_RENOOGCACOST = 0;
  public static int PQSL_VARACC2_RECCODPIACON = 1;
  public static int PQSL_VARACC2_RECORDCAPITO = 2;
  public static int PQSL_VARACC2_RECORDART = 3;
  public static int PQSL_VARACC2_RECORNUMEACC = 4;
  public static int PQSL_VARACC2_RECORANNOACC = 5;
  public static int PQSL_VARACC2_RENOOGIMACDE = 6;
  public static int PQSL_VARACC2_RECORDIMPORT = 7;
  public static int PQSL_VARACC2_RECOANNOESIG = 8;
  public static int PQSL_VARACC2_RECNOMOGGPRO = 9;
  public static int PQSL_VARACC2_RENOOGACPRUO = 10;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS52 = 2714;
  public static int PQRY_PARS52_RS = 2715;
  public static int PQSL_PARS52_NOMEOGGEPROP = 0;
  public static int PQSL_PARS52_NOMEOGGENUME = 1;
  public static int PQSL_PARS52_NOMEOGGEANNO = 2;
  public static int PQSL_PARS52_NOMEOGGEDESC = 3;
  public static int PQSL_PARS52_NOMOGGDATREG = 4;
  public static int PQSL_PARS52_NOMOGGTIPVAR = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI649 = 2716;
  public static int PQRY_PARAMETRI649_RS = 2717;
  public static int PQSL_PARAMETRI649_PARATIPOVARI = 0;
  public static int PQSL_PARAMETRI649_PASOTIVAPEAV = 1;

  // Table to contain panel selected row: VARIMP
  //
  public static int PQRY_VARIMP7 = 2718;
  public static int PQSL_VARIMP7_PROGRESSIVO = 0;
  public static int PQSL_VARIMP7_CAPITOLO = 1;
  public static int PQSL_VARIMP7_ARTICOLO = 2;
  public static int PQSL_VARIMP7_ANNO_VAR = 3;
  public static int PQSL_VARIMP7_NUMERO_IMP = 4;
  public static int PQSL_VARIMP7_ANNO_IMP = 5;
  public static int PQSL_VARIMP7_D_DATA_REG = 6;
  public static int PQSL_VARIMP7_DESCRIZIONE = 7;
  public static int PQSL_VARIMP7_IMPORTO = 8;
  public static int PQSL_VARIMP7_TIPO_VAR = 9;
  public static int PQSL_VARIMP7_TIPO_AVANZO = 10;
  public static int PQSL_VARIMP7_UTENTE_INSERIMENTO = 11;
  public static int PQSL_VARIMP7_DATA_INSERIMENTO = 12;
  public static int PQSL_VARIMP7_UTENTE_ULTIMO_AGG = 13;
  public static int PQSL_VARIMP7_DATA_ULTIMO_AGG = 14;
  public static int PQSL_VARIMP7_VARIMPGESTIO = 15;
  public static int PQSL_VARIMP7_VARIMPPRUNOR = 16;
  public static int PQSL_VARIMP7_TIPO_VINCOLO = 17;
  public static int PQSL_VARIMP7_VARIMPFINANZ = 18;
  public static int PQSL_VARIMP7_VARIMPOPERA = 19;

  // Table to contain panel selected row: VARACC
  //
  public static int PQRY_VARACC4 = 2719;
  public static int PQSL_VARACC4_PROGRESSIVO = 0;
  public static int PQSL_VARACC4_CAPITOLO = 1;
  public static int PQSL_VARACC4_ARTICOLO = 2;
  public static int PQSL_VARACC4_ANNO_VAR = 3;
  public static int PQSL_VARACC4_NUMERO_ACC = 4;
  public static int PQSL_VARACC4_ANNO_ACC = 5;
  public static int PQSL_VARACC4_D_DATA_REG = 6;
  public static int PQSL_VARACC4_DESCRIZIONE = 7;
  public static int PQSL_VARACC4_IMPORTO = 8;
  public static int PQSL_VARACC4_TIPO_VAR = 9;
  public static int PQSL_VARACC4_TIPO_AVANZO = 10;
  public static int PQSL_VARACC4_UTENTE_INSERIMENTO = 11;
  public static int PQSL_VARACC4_DATA_INSERIMENTO = 12;
  public static int PQSL_VARACC4_UTENTE_ULTIMO_AGG = 13;
  public static int PQSL_VARACC4_DATA_ULTIMO_AGG = 14;
  public static int PQSL_VARACC4_VARACCGESTIO = 15;
  public static int PQSL_VARACC4_VARACCPRUNOR = 16;
  public static int PQSL_VARACC4_VARATIPOVINC = 17;
  public static int PQSL_VARACC4_VARACCFINANZ = 18;
  public static int PQSL_VARACC4_VARACCOPERA = 19;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI651 = 2720;
  public static int PQRY_PARAMETRI651_RS = 2721;
  public static int PQSL_PARAMETRI651_PARAMVARIAZI = 0;
  public static int PQSL_PARAMETRI651_PARAMDATADAL = 1;
  public static int PQSL_PARAMETRI651_PARAMDATAAL = 2;
  public static int PQSL_PARAMETRI651_PASOVACOTIAV = 3;
  public static int PQSL_PARAMETRI651_PARTOTPERCAP = 4;
  public static int PQSL_PARAMETRI651_PARTOTPEANRE = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI653 = 2722;
  public static int PQRY_PARAMETRI653_RS = 2723;
  public static int PQSL_PARAMETRI653_PARATIPOAVAN = 0;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO12 = 2724;
  public static int PQSL_NOTEFUNZIO12_MODULO = 0;
  public static int PQSL_NOTEFUNZIO12_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO12_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO12_DESCRIZIONE = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI655 = 2725;
  public static int PQRY_PARAMETRI655_RS = 2726;
  public static int PQSL_PARAMETRI655_PARAMESERCIZ = 0;
  public static int PQSL_PARAMETRI655_PARSOLRIGREG = 1;

  // Table to contain panel selected row: WRK GESTIONE AVANZO
  //
  public static int PQRY_WRKGESTIAVA1 = 2727;
  public static int PQSL_WRKGESTIAVA1_ORDINAMENTO1 = 0;
  public static int PQSL_WRKGESTIAVA1_ESERCIZIO = 1;
  public static int PQSL_WRKGESTIAVA1_SESSIONE = 2;
  public static int PQSL_WRKGESTIAVA1_TIPO_RIGA = 3;
  public static int PQSL_WRKGESTIAVA1_CODICE_RIGA = 4;
  public static int PQSL_WRKGESTIAVA1_TITOLO = 5;
  public static int PQSL_WRKGESTIAVA1_E_S = 6;
  public static int PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE = 7;
  public static int PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE = 8;
  public static int PQSL_WRKGESTIAVA1_ANNO_IMPACC = 9;
  public static int PQSL_WRKGESTIAVA1_NUMERO_IMPACC = 10;
  public static int PQSL_WRKGESTIAVA1_ANNO_VAR = 11;
  public static int PQSL_WRKGESTIAVA1_IMPORTO_VARIAZIONE = 12;
  public static int PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO = 13;
  public static int PQSL_WRKGESTIAVA1_IMPORTO_AVANZO = 14;
  public static int PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE = 15;
  public static int PQSL_WRKGESTIAVA1_IMPORTO_BILANCIO = 16;
  public static int PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE = 17;
  public static int PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE = 18;
  public static int PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE = 19;
  public static int PQSL_WRKGESTIAVA1_TIPO_AVANZO = 20;
  public static int PQSL_WRKGESTIAVA1_NOTE = 21;
  public static int PQSL_WRKGESTIAVA1_STATO = 22;
  public static int PQSL_WRKGESTIAVA1_PRIMO_ANNO = 23;
  public static int PQSL_WRKGESTIAVA1_MODIFICABILE = 24;
  public static int PQSL_WRKGESTIAVA1_RIGAAVANZO = 25;
  public static int PQSL_WRKGESTIAVA1_DATA_REG = 26;
  public static int PQSL_WRKGESTIAVA1_PROGRUO = 27;
  public static int PQSL_WRKGESTIAVA1_PROGRESSIVO = 28;
  public static int PQSL_WRKGESTIAVA1_OPERA = 29;
  public static int PQSL_WRKGESTIAVA1_FINANZIAMENTO = 30;

  // Table to contain panel selected row: WRK GESTIONE AVANZO
  //
  public static int PQRY_WRKGESTIAVAN = 2728;
  public static int PQSL_WRKGESTIAVAN_ORDINAMENTO1 = 0;
  public static int PQSL_WRKGESTIAVAN_ESERCIZIO = 1;
  public static int PQSL_WRKGESTIAVAN_SESSIONE = 2;
  public static int PQSL_WRKGESTIAVAN_TIPO_RIGA = 3;
  public static int PQSL_WRKGESTIAVAN_CODICE_RIGA = 4;
  public static int PQSL_WRKGESTIAVAN_TITOLO = 5;
  public static int PQSL_WRKGESTIAVAN_E_S = 6;
  public static int PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE = 7;
  public static int PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE = 8;
  public static int PQSL_WRKGESTIAVAN_ANNO_IMPACC = 9;
  public static int PQSL_WRKGESTIAVAN_NUMERO_IMPACC = 10;
  public static int PQSL_WRKGESTIAVAN_ANNO_VAR = 11;
  public static int PQSL_WRKGESTIAVAN_IMPORTO_VARIAZIONE = 12;
  public static int PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO = 13;
  public static int PQSL_WRKGESTIAVAN_IMPORTO_AVANZO = 14;
  public static int PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE = 15;
  public static int PQSL_WRKGESTIAVAN_IMPORTO_BILANCIO = 16;
  public static int PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE = 17;
  public static int PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE = 18;
  public static int PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE = 19;
  public static int PQSL_WRKGESTIAVAN_TIPO_AVANZO = 20;
  public static int PQSL_WRKGESTIAVAN_NOTE = 21;
  public static int PQSL_WRKGESTIAVAN_STATO = 22;
  public static int PQSL_WRKGESTIAVAN_PRIMO_ANNO = 23;
  public static int PQSL_WRKGESTIAVAN_MODIFICABILE = 24;
  public static int PQSL_WRKGESTIAVAN_RIGAAVANZO = 25;
  public static int PQSL_WRKGESTIAVAN_DATA_REG = 26;
  public static int PQSL_WRKGESTIAVAN_PROGRUO = 27;
  public static int PQSL_WRKGESTIAVAN_PROGRESSIVO = 28;
  public static int PQSL_WRKGESTIAVAN_FINANZIAMENTO = 29;
  public static int PQSL_WRKGESTIAVAN_OPERA = 30;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO16 = 2729;
  public static int PQSL_NOTEFUNZIO16_MODULO = 0;
  public static int PQSL_NOTEFUNZIO16_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO16_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO16_DESCRIZIONE = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI506 = 2730;
  public static int PQRY_PARAMETRI506_RS = 2731;
  public static int PQSL_PARAMETRI506_PARAMPARTE = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI259 = 2732;
  public static int PQRY_PARAMETRI259_RS = 2733;
  public static int PQSL_PARAMETRI259_PARTIPVISSAL = 0;

  // Table to contain panel selected row: SALDI TIPI AVANZO
  //
  public static int PQRY_SALDTIPIAVA1 = 2734;
  public static int PQSL_SALDTIPIAVA1_TIPO_AVANZO = 0;
  public static int PQSL_SALDTIPIAVA1_IMPORTO_INIZIALE = 1;
  public static int PQSL_SALDTIPIAVA1_ESERCIZIO = 2;

}
