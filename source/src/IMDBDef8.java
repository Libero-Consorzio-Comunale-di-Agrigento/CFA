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
public class IMDBDef8 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: OPERE
  //
  public static int PQRY_OPERE3 = 1415;
  public static int PQSL_OPERE3_CODICE = 0;
  public static int PQSL_OPERE3_DESCRIZIONE = 1;
  public static int PQSL_OPERE3_REALE = 2;
  public static int PQSL_OPERE3_PROGETTO_ID = 3;
  public static int PQSL_OPERE3_OPERECATEGOR = 4;
  public static int PQSL_OPERE3_OPEREPROGETT = 5;
  public static int PQSL_OPERE3_OPERENUMPPI = 6;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP3 = 1416;
  public static int PQSL_CAP3_ESERCIZIO = 0;
  public static int PQSL_CAP3_RETRCBAESTBA = 1;
  public static int PQSL_CAP3_RETRCABCATBA = 2;
  public static int PQSL_CAP3_RETRCABAATBA = 3;
  public static int PQSL_CAP3_RETRCABDATBA = 4;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI8 = 1417;
  public static int PQSL_FATTORI8_FATTORE = 0;
  public static int PQSL_FATTORI8_DESCRIZIONE = 1;
  public static int PQSL_FATTORI8_FATTORORDINA = 2;
  public static int PQSL_FATTORI8_TIPO = 3;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI7 = 1418;
  public static int PQSL_FATTORI7_FATTORE = 0;
  public static int PQSL_FATTORI7_DESCRIZIONE = 1;
  public static int PQSL_FATTORI7_FATTORORDINA = 2;
  public static int PQSL_FATTORI7_TIPO = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI503 = 1419;
  public static int PQRY_PARAMETRI503_RS = 1420;
  public static int PQSL_PARAMETRI503_ROWNAMANCATT = 0;

  // Table to contain panel selected row: TESTATE CRONOPROGRAMMI
  //
  public static int PQRY_TESTATCRONO3 = 1421;
  public static int PQSL_TESTATCRONO3_RECPIACROFIN = 0;
  public static int PQSL_TESTATCRONO3_RECOFINADESC = 1;

  // Table to contain panel selected row: VOCI TECNICHE OPERE
  //
  public static int PQRY_VOCITECNOPE1 = 1422;
  public static int PQSL_VOCITECNOPE1_VOCTECOPECOD = 0;
  public static int PQSL_VOCITECNOPE1_VOCTECOPEDES = 1;

  // Table to contain panel selected row: ESEACC
  //
  public static int PQRY_ESEACC = 1423;
  public static int PQSL_ESEACC_ANNO_ACC = 0;
  public static int PQSL_ESEACC_NUMERO_ACC = 1;
  public static int PQSL_ESEACC_CAPITOLO = 2;
  public static int PQSL_ESEACC_ARTICOLO = 3;
  public static int PQSL_ESEACC_DESCRIZIONE = 4;
  public static int PQSL_ESEACC_ESEACUOUTILI = 5;
  public static int PQSL_ESEACC_DISPONIBILITA = 6;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME32 = 1424;
  public static int PQRY_FINANZIAME32_RS = 1425;
  public static int PQSL_FINANZIAME32_RECORDFINANZ = 0;
  public static int PQSL_FINANZIAME32_RECORDDESCRI = 1;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN6 = 1426;
  public static int PQRY_BILFIN6_RS = 1427;
  public static int PQSL_BILFIN6_RECOOPERCODI = 0;
  public static int PQSL_BILFIN6_RECOOPERDESC = 1;

  // Table to contain panel selected row: IMDB
  //
  public static int PQRY_IMDB9 = 1428;
  public static int PQRY_IMDB9_RS = 1429;
  public static int PQSL_IMDB9_PROGETTO_ID = 0;
  public static int PQSL_IMDB9_NOMEOGGEFILT = 1;

  // Table to contain panel selected row: DUP OBIETTIVI GESTIONE
  //
  public static int PQRY_DUPOBIETGEST = 1430;
  public static int PQSL_DUPOBIETGEST_DUOBDUOBIDOG = 0;
  public static int PQSL_DUPOBIETGEST_DUPOBIGESCOD = 1;
  public static int PQSL_DUPOBIETGEST_DUPOBIGESDES = 2;
  public static int PQSL_DUPOBIETGEST_UNITA = 3;
  public static int PQSL_DUPOBIETGEST_DUPOBIGESRES = 4;
  public static int PQSL_DUPOBIETGEST_DUOBGEDUOOPI = 5;
  public static int PQSL_DUPOBIETGEST_DUPOBIGEDEPR = 6;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI = 1431;
  public static int PQSL_FATTORI_RECORDFATTOR = 0;
  public static int PQSL_FATTORI_RECOFATTDESC = 1;
  public static int PQSL_FATTORI_RECOFATTTIPO = 2;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO2 = 1432;
  public static int PQSL_CAPUO2_CAPUOPROUNOR = 0;
  public static int PQSL_CAPUO2_CODIUNITORGA = 1;
  public static int PQSL_CAPUO2_DESCRIZIONE = 2;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO3 = 1433;
  public static int PQSL_CAPUO3_CACABIUOPRUO = 0;
  public static int PQSL_CAPUO3_CODIUNITORGA = 1;
  public static int PQSL_CAPUO3_DESCRIZIONE = 2;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME30 = 1434;
  public static int PQSL_FINANZIAME30_FINANZCODICE = 0;
  public static int PQSL_FINANZIAME30_FINANZDESCRI = 1;
  public static int PQSL_FINANZIAME30_FINANZSCADEN = 2;
  public static int PQSL_FINANZIAME30_FINANZCATEGO = 3;

  // Table to contain panel selected row: PERIODI RIACCERTAMENTI
  //
  public static int PQRY_PERIODRIACC1 = 1435;
  public static int PQSL_PERIODRIACC1_PERIRIACCODI = 0;
  public static int PQSL_PERIODRIACC1_PERIRIACDESC = 1;
  public static int PQSL_PERIODRIACC1_PERRIADATINI = 2;
  public static int PQSL_PERIODRIACC1_PERRIADATFIN = 3;
  public static int PQSL_PERIODRIACC1_PERIRIACTIPO = 4;
  public static int PQSL_PERIODRIACC1_PERRIAFILDIS = 5;

  // Table to contain panel selected row: Parss
  //
  public static int PQRY_PARSS1 = 1436;
  public static int PQRY_PARSS1_RS = 1437;
  public static int PQSL_PARSS1_NOMEOGGEESCL = 0;

  // Table to contain panel selected row: VISTA STRUTTURA RICL
  //
  public static int PQRY_VISTSTRURIC1 = 1438;
  public static int PQSL_VISTSTRURIC1_VISSTRRICCOD = 0;
  public static int PQSL_VISTSTRURIC1_VISSTRRICDES = 1;

  // Table to contain panel selected row: Tipo Cod
  //
  public static int PQRY_TIPOCOD1 = 1439;
  public static int PQRY_TIPOCOD1_RS = 1440;
  public static int PQSL_TIPOCOD1_NOMOGGTIPRIC = 0;

  // Table to contain panel selected row: VISTA STRUTTURA RICL
  //
  public static int PQRY_VISTSTRURICL = 1441;
  public static int PQSL_VISTSTRURICL_REVISTRITIRI = 0;
  public static int PQSL_VISTSTRURICL_RECVISSTRILI = 1;
  public static int PQSL_VISTSTRURICL_RECORDCODICE = 2;
  public static int PQSL_VISTSTRURICL_REVISTRISTRI = 3;
  public static int PQSL_VISTSTRURICL_RECORDLIVELL = 4;
  public static int PQSL_VISTSTRURICL_RECORDDESCRI = 5;

  // Table to contain panel selected row: VISTA RICLASSIFICAZIONI
  //
  public static int PQRY_VISTARICLASS = 1442;
  public static int PQSL_VISTARICLASS_REVISTRITIRI = 0;
  public static int PQSL_VISTARICLASS_RECVISSTRILI = 1;
  public static int PQSL_VISTARICLASS_RECORDCODICE = 2;
  public static int PQSL_VISTARICLASS_REVISTRISTRI = 3;
  public static int PQSL_VISTARICLASS_RECORDLIVELL = 4;
  public static int PQSL_VISTARICLASS_RECORDDESCRI = 5;

  // Table to contain panel selected row: VISTA SCHEDE CIWEB
  //
  public static int PQRY_VISTSCHECIWE = 1443;
  public static int PQSL_VISTSCHECIWE_REVISCCIPRSC = 0;
  public static int PQSL_VISTSCHECIWE_REVISCCIDEBE = 1;
  public static int PQSL_VISTSCHECIWE_REVISCCITIBE = 2;
  public static int PQSL_VISTSCHECIWE_REVISCCICAFI = 3;
  public static int PQSL_VISTSCHECIWE_REVISCCIDECA = 4;
  public static int PQSL_VISTSCHECIWE_RECVISSCCICL = 5;
  public static int PQSL_VISTSCHECIWE_REVISCCIDECL = 6;
  public static int PQSL_VISTSCHECIWE_RECVISSCCIIM = 7;
  public static int PQSL_VISTSCHECIWE_REVISCCIDEIM = 8;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM185 = 1444;
  public static int PQRY_PARAM185_RS = 1445;
  public static int PQSL_PARAM185_NOMOGGTIPPIA = 0;
  public static int PQSL_PARAM185_NOMEOGGELIVE = 1;

  // Table to contain panel selected row: Struttura Conti
  //
  public static int PQRY_STRUTTUCONTI = 1446;
  public static int PQSL_STRUTTUCONTI_CESTPICOCOID = 0;
  public static int PQSL_STRUTTUCONTI_CEECONTIDESC = 1;
  public static int PQSL_STRUTTUCONTI_CEECONTICODI = 2;

  // Table to contain panel selected row: VISTA TOT OPE
  //
  public static int PQRY_VISTATOTOPE2 = 1447;
  public static int PQSL_VISTATOTOPE2_OPERA = 0;
  public static int PQSL_VISTATOTOPE2_PREVISIONE_INI_E = 1;
  public static int PQSL_VISTATOTOPE2_VARIAZIONI_E = 2;
  public static int PQSL_VISTATOTOPE2_PREVISIONE_ATT_E = 3;
  public static int PQSL_VISTATOTOPE2_ACCERTATO_COMP = 4;
  public static int PQSL_VISTATOTOPE2_DISPONIBILITA_E = 5;
  public static int PQSL_VISTATOTOPE2_VARCOMPRO_E = 6;
  public static int PQSL_VISTATOTOPE2_ACCERTATO_RES = 7;
  public static int PQSL_VISTATOTOPE2_ESERCIZIO = 8;
  public static int PQSL_VISTATOTOPE2_ORDINATIVI_COMP = 9;
  public static int PQSL_VISTATOTOPE2_ORDINATIVI_RES = 10;
  public static int PQSL_VISTATOTOPE2_ORDINATIVI = 11;
  public static int PQSL_VISTATOTOPE2_PREVISIONE_INI_S = 12;
  public static int PQSL_VISTATOTOPE2_VARIAZIONI_S = 13;
  public static int PQSL_VISTATOTOPE2_PREVISIONE_ATT_S = 14;
  public static int PQSL_VISTATOTOPE2_IMPEGNATO_COMP = 15;
  public static int PQSL_VISTATOTOPE2_DISPONIBILITA_S = 16;
  public static int PQSL_VISTATOTOPE2_VARCOMPRO_S = 17;
  public static int PQSL_VISTATOTOPE2_IMPEGNATO_RES = 18;
  public static int PQSL_VISTATOTOPE2_SUBIMPEGNATO = 19;
  public static int PQSL_VISTATOTOPE2_LIQUIDATO = 20;
  public static int PQSL_VISTATOTOPE2_MANDATI_COMP = 21;
  public static int PQSL_VISTATOTOPE2_MANDATI_RES = 22;
  public static int PQSL_VISTATOTOPE2_MANDATI = 23;
  public static int PQSL_VISTATOTOPE2_VISTOTOPDEOP = 24;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME19 = 1448;
  public static int PQSL_FINANZIAME19_CODICE = 0;
  public static int PQSL_FINANZIAME19_DESCRIZIONE = 1;
  public static int PQSL_FINANZIAME19_ENTE = 2;
  public static int PQSL_FINANZIAME19_ANNO_MUTUO = 3;
  public static int PQSL_FINANZIAME19_NUMERO_MUTUO = 4;
  public static int PQSL_FINANZIAME19_NOTE = 5;
  public static int PQSL_FINANZIAME19_CATEGORIA = 6;
  public static int PQSL_FINANZIAME19_COD_ALLEGATO = 7;
  public static int PQSL_FINANZIAME19_IMPORTO_ORIG = 8;
  public static int PQSL_FINANZIAME19_TIPO_DURATA = 9;
  public static int PQSL_FINANZIAME19_SCADENZA = 10;
  public static int PQSL_FINANZIAME19_SALDO_INI_CASSA = 11;
  public static int PQSL_FINANZIAME19_SALDO_INI_TESORERIA = 12;
  public static int PQSL_FINANZIAME19_RAGIONE_SOCIALE_ESTESA = 13;
  public static int PQSL_FINANZIAME19_FINADURADESC = 14;
  public static int PQSL_FINANZIAME19_DESC_ABB = 15;
  public static int PQSL_FINANZIAME19_FINADISADESC = 16;
  public static int PQSL_FINANZIAME19_COD_FIN_DISAV = 17;
  public static int PQSL_FINANZIAME19_LEGGE_REG = 18;
  public static int PQSL_FINANZIAME19_CAPITOLO_REG = 19;
  public static int PQSL_FINANZIAME19_ATTO_ASS = 20;
  public static int PQSL_FINANZIAME19_DIPARTIMENTO = 21;
  public static int PQSL_FINANZIAME19_FINASERVOPER = 22;
  public static int PQSL_FINANZIAME19_FINASETTOPER = 23;
  public static int PQSL_FINANZIAME19_FINANZFLESSI = 24;
  public static int PQSL_FINANZIAME19_FINANZCATEGO = 25;
  public static int PQSL_FINANZIAME19_FINAALLALCAP = 26;
  public static int PQSL_FINANZIAME19_FINAFINADISA = 27;
  public static int PQSL_FINANZIAME19_FINARENALMEF = 28;

  // Table to contain panel selected row: VISTA TOT OPE
  //
  public static int PQRY_VISTATOTOPE3 = 1449;
  public static int PQSL_VISTATOTOPE3_FINANZIAMENTO = 0;
  public static int PQSL_VISTATOTOPE3_PREVISIONE_INI_E = 1;
  public static int PQSL_VISTATOTOPE3_VARIAZIONI_E = 2;
  public static int PQSL_VISTATOTOPE3_PREVISIONE_ATT_E = 3;
  public static int PQSL_VISTATOTOPE3_ACCERTATO_COMP = 4;
  public static int PQSL_VISTATOTOPE3_DISPONIBILITA_E = 5;
  public static int PQSL_VISTATOTOPE3_VARCOMPRO_E = 6;
  public static int PQSL_VISTATOTOPE3_ACCERTATO_RES = 7;
  public static int PQSL_VISTATOTOPE3_ESERCIZIO = 8;
  public static int PQSL_VISTATOTOPE3_ORDINATIVI_COMP = 9;
  public static int PQSL_VISTATOTOPE3_ORDINATIVI_RES = 10;
  public static int PQSL_VISTATOTOPE3_ORDINATIVI = 11;
  public static int PQSL_VISTATOTOPE3_PREVISIONE_INI_S = 12;
  public static int PQSL_VISTATOTOPE3_VARIAZIONI_S = 13;
  public static int PQSL_VISTATOTOPE3_PREVISIONE_ATT_S = 14;
  public static int PQSL_VISTATOTOPE3_IMPEGNATO_COMP = 15;
  public static int PQSL_VISTATOTOPE3_DISPONIBILITA_S = 16;
  public static int PQSL_VISTATOTOPE3_VARCOMPRO_S = 17;
  public static int PQSL_VISTATOTOPE3_IMPEGNATO_RES = 18;
  public static int PQSL_VISTATOTOPE3_SUBIMPEGNATO = 19;
  public static int PQSL_VISTATOTOPE3_LIQUIDATO = 20;
  public static int PQSL_VISTATOTOPE3_MANDATI_COMP = 21;
  public static int PQSL_VISTATOTOPE3_MANDATI_RES = 22;
  public static int PQSL_VISTATOTOPE3_MANDATI = 23;

  // Table to contain panel selected row: VISTA TOT CASSA FIN
  //
  public static int PQRY_VISTOTCASFI1 = 1450;
  public static int PQSL_VISTOTCASFI1_RECSALINICAS = 0;
  public static int PQSL_VISTOTCASFI1_RECSALINIPAG = 1;
  public static int PQSL_VISTOTCASFI1_RECOCOMPMAND = 2;
  public static int PQSL_VISTOTCASFI1_RECORESIMAND = 3;
  public static int PQSL_VISTOTCASFI1_RECOMANDPREC = 4;
  public static int PQSL_VISTOTCASFI1_RECOPAGAPREC = 5;
  public static int PQSL_VISTOTCASFI1_RECORPAGCOMP = 6;
  public static int PQSL_VISTOTCASFI1_RECORPAGRESI = 7;
  public static int PQSL_VISTOTCASFI1_RECTOTMAEMES = 8;
  public static int PQSL_VISTOTCASFI1_RECTOTMAPAES = 9;
  public static int PQSL_VISTOTCASFI1_RECORCOMPORD = 10;
  public static int PQSL_VISTOTCASFI1_RECORRESIORD = 11;
  public static int PQSL_VISTOTCASFI1_RECORORDPREC = 12;
  public static int PQSL_VISTOTCASFI1_RECORINCCOMP = 13;
  public static int PQSL_VISTOTCASFI1_RECORDINCRES = 14;
  public static int PQSL_VISTOTCASFI1_RECORINCPREC = 15;
  public static int PQSL_VISTOTCASFI1_RECTOTOREMES = 16;
  public static int PQSL_VISTOTCASFI1_RECTOTORRIES = 17;
  public static int PQSL_VISTOTCASFI1_RECVARCASPRE = 18;
  public static int PQSL_VISTOTCASFI1_RECVARCASESE = 19;
  public static int PQSL_VISTOTCASFI1_RECVARCASTOT = 20;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI325 = 1451;
  public static int PQRY_PARAMETRI325_RS = 1452;
  public static int PQSL_PARAMETRI325_PARACODIFINA = 0;
  public static int PQSL_PARAMETRI325_PARAMDATAAL = 1;

  // Table to contain panel selected row: PROPOSTE
  //
  public static int PQRY_PROPOSTE = 1453;
  public static int PQSL_PROPOSTE_ANNO = 0;
  public static int PQSL_PROPOSTE_UNITA_PROPONENTE = 1;
  public static int PQSL_PROPOSTE_NUMERO = 2;
  public static int PQSL_PROPOSTE_DATA_PROPOSTA = 3;
  public static int PQSL_PROPOSTE_OGGETTO = 4;
  public static int PQSL_PROPOSTE_PROPOSPROPOS = 5;
  public static int PQSL_PROPOSTE_URLDOCUMENTO = 6;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU6 = 1454;
  public static int PQSL_VISTABILANU6_ESERCIZIO = 0;
  public static int PQSL_VISTABILANU6_E_S = 1;
  public static int PQSL_VISTABILANU6_CAPITOLO = 2;
  public static int PQSL_VISTABILANU6_ARTICOLO = 3;
  public static int PQSL_VISTABILANU6_STN_INI_CO = 4;
  public static int PQSL_VISTABILANU6_VARIAZIONI_CO = 5;
  public static int PQSL_VISTABILANU6_VAR_IMPEGNABILE = 6;
  public static int PQSL_VISTABILANU6_IMPEGNABILE = 7;
  public static int PQSL_VISTABILANU6_VIBIUOSTATTO = 8;
  public static int PQSL_VISTABILANU6_VIBIUOSTATCO = 9;
  public static int PQSL_VISTABILANU6_VIBIUOSTATSV = 10;
  public static int PQSL_VISTABILANU6_VIBIUOSTPRTO = 11;
  public static int PQSL_VISTABILANU6_VIBIUOSTPRCO = 12;
  public static int PQSL_VISTABILANU6_VIBIUOSTPRSV = 13;
  public static int PQSL_VISTABILANU6_VISBILUOIMAT = 14;
  public static int PQSL_VISTABILANU6_VIBIUOLAIMAC = 15;
  public static int PQSL_VISTABILANU6_VAR_PROVVISORIE = 16;
  public static int PQSL_VISTABILANU6_IMP_ACC = 17;
  public static int PQSL_VISTABILANU6_DISPONIBILITA = 18;
  public static int PQSL_VISTABILANU6_MAN_ORD = 19;
  public static int PQSL_VISTABILANU6_MAN_ORD_COMP = 20;
  public static int PQSL_VISTABILANU6_MAN_ORD_RES = 21;
  public static int PQSL_VISTABILANU6_RESIDUI = 22;
  public static int PQSL_VISTABILANU6_LIQUIDAZIONI = 23;
  public static int PQSL_VISTABILANU6_LIQUIDAZIONI_COMP = 24;
  public static int PQSL_VISTABILANU6_LIQUIDAZIONI_RES = 25;
  public static int PQSL_VISTABILANU6_VIBIUOSTINCA = 26;
  public static int PQSL_VISTABILANU6_VISBILUOVACA = 27;
  public static int PQSL_VISTABILANU6_VIBIUOSTATCA = 28;
  public static int PQSL_VISTABILANU6_VIBIUOVAPRCA = 29;
  public static int PQSL_VISTABILANU6_VIBIUOSTPRCA = 30;
  public static int PQSL_VISTABILANU6_VISBILUODICA = 31;
  public static int PQSL_VISTABILANU6_VISBILUOREPR = 32;
  public static int PQSL_VISTABILANU6_VIBIUOSPDSI1 = 33;
  public static int PQSL_VISTABILANU6_VIBIUOSTINC1 = 34;
  public static int PQSL_VISTABILANU6_VIBIUOSTINC2 = 35;
  public static int PQSL_VISTABILANU6_VIBIUOSPDSIC = 36;
  public static int PQSL_VISTABILANU6_VIBIUSPDSIC1 = 37;
  public static int PQSL_VISTABILANU6_VIBIUSPDSIC2 = 38;
  public static int PQSL_VISTABILANU6_VISBILUOESE1 = 39;
  public static int PQSL_VISTABILANU6_VISBILUOESE2 = 40;
  public static int PQSL_VISTABILANU6_VISBILUOESE3 = 41;
  public static int PQSL_VISTABILANU6_OBIETTOPERAT = 42;
  public static int PQSL_VISTABILANU6_OBIETTGESTIO = 43;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU8 = 1455;
  public static int PQSL_VISTABILANU8_VISTBILUOCOD = 0;
  public static int PQSL_VISTABILANU8_VISTBILUODES = 1;
  public static int PQSL_VISTABILANU8_STN_INI_CO = 2;
  public static int PQSL_VISTABILANU8_VARIAZIONI_CO = 3;
  public static int PQSL_VISTABILANU8_VISBILUOSTDE = 4;
  public static int PQSL_VISTABILANU8_IMP_ACC = 5;
  public static int PQSL_VISTABILANU8_DISPONIBILITA = 6;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU7 = 1456;
  public static int PQSL_VISTABILANU7_IMP_ACC = 0;
  public static int PQSL_VISTABILANU7_IMP_ACC_CONS = 1;
  public static int PQSL_VISTABILANU7_IMP_ACC_SVIL = 2;
  public static int PQSL_VISTABILANU7_IMP_NO_ATTO = 3;
  public static int PQSL_VISTABILANU7_IMP_CONS_NO_ATTO = 4;
  public static int PQSL_VISTABILANU7_IMP_SVIL_NO_ATTO = 5;
  public static int PQSL_VISTABILANU7_IMP_PREN_NO_ATTO = 6;
  public static int PQSL_VISTABILANU7_IMP_CONS_PREN_NO_ATTO = 7;
  public static int PQSL_VISTABILANU7_IMP_SVIL_PREN_NO_ATTO = 8;
  public static int PQSL_VISTABILANU7_IMP_DEFINITIVO = 9;
  public static int PQSL_VISTABILANU7_IMP_CONS_DEFINITIVO = 10;
  public static int PQSL_VISTABILANU7_IMP_SVIL_DEFINITIVO = 11;
  public static int PQSL_VISTABILANU7_IMP_PREN_DEFINITIVO = 12;
  public static int PQSL_VISTABILANU7_IMP_CONS_PREN_DEFINITIVO = 13;
  public static int PQSL_VISTABILANU7_IMP_SVIL_PREN_DEFINITIVO = 14;
  public static int PQSL_VISTABILANU7_IMP_PRENOTATI = 15;
  public static int PQSL_VISTABILANU7_IMP_CONS_PRENOTATI = 16;
  public static int PQSL_VISTABILANU7_IMP_SVIL_PRENOTATI = 17;
  public static int PQSL_VISTABILANU7_IMP_CONS_OBBLIGATORI = 18;
  public static int PQSL_VISTABILANU7_IMP_SVIL_OBBLIGATORI = 19;
  public static int PQSL_VISTABILANU7_IMP_CONS_ESECUTIVI = 20;
  public static int PQSL_VISTABILANU7_IMP_SVIL_ESECUTIVI = 21;
  public static int PQSL_VISTABILANU7_VIBIUOIMDASP = 22;
  public static int PQSL_VISTABILANU7_VIBIUOIMDARI = 23;
  public static int PQSL_VISTABILANU7_VIBIUOIMDARS = 24;
  public static int PQSL_VISTABILANU7_VIBIUOIMDSPP = 25;
  public static int PQSL_VISTABILANU7_VIBIUOIMDRIP = 26;
  public static int PQSL_VISTABILANU7_VIBIUOIMDRSP = 27;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU9 = 1457;
  public static int PQSL_VISTABILANU9_STN_INI_CO = 0;
  public static int PQSL_VISTABILANU9_VARIAZIONI_CO = 1;
  public static int PQSL_VISTABILANU9_RECOSTANATTU = 2;
  public static int PQSL_VISTABILANU9_VAR_PROVVISORIE_CA = 3;
  public static int PQSL_VISTABILANU9_RECOSTANPROV = 4;
  public static int PQSL_VISTABILANU9_REISCRIZIONI_DA_IMP = 5;
  public static int PQSL_VISTABILANU9_VARIAZIONI_REISCR_DA_IMP = 6;
  public static int PQSL_VISTABILANU9_RECSTAATREIM = 7;
  public static int PQSL_VISTABILANU9_VAR_PROVV_REISCR_IMP = 8;
  public static int PQSL_VISTABILANU9_RECSTAPRREIM = 9;
  public static int PQSL_VISTABILANU9_REISCRIZIONI_DA_STN = 10;
  public static int PQSL_VISTABILANU9_VARIAZIONI_REISCR_DA_STN = 11;
  public static int PQSL_VISTABILANU9_RESTATDAREST = 12;
  public static int PQSL_VISTABILANU9_VAR_PROVV_REISCR_STN = 13;
  public static int PQSL_VISTABILANU9_STAPROREISTA = 14;
  public static int PQSL_VISTABILANU9_RECOPUROINIZ = 15;
  public static int PQSL_VISTABILANU9_PUROVARIAZIO = 16;
  public static int PQSL_VISTABILANU9_PUROATTUALE = 17;
  public static int PQSL_VISTABILANU9_RECPURVARPRO = 18;
  public static int PQSL_VISTABILANU9_PUROSTANPROV = 19;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP13 = 1458;
  public static int PQSL_CAP13_CAPITOLO = 0;
  public static int PQSL_CAP13_ARTICOLO = 1;
  public static int PQSL_CAP13_TITOLO = 2;
  public static int PQSL_CAP13_CATEGORIA = 3;
  public static int PQSL_CAP13_COD_INTERVENTO = 4;
  public static int PQSL_CAP13_FUNZIONE = 5;
  public static int PQSL_CAP13_SERVIZIO = 6;
  public static int PQSL_CAP13_VOCE_ECON = 7;
  public static int PQSL_CAP13_CODICE_GESTIONALE = 8;
  public static int PQSL_CAP13_COD_TERZI = 9;
  public static int PQSL_CAP13_DESCRIZIONE_ABBREVIATA = 10;
  public static int PQSL_CAP13_ANNOTAZIONI = 11;
  public static int PQSL_CAP13_DESCRIZIONE = 12;
  public static int PQSL_CAP13_ESERCIZIO = 13;
  public static int PQSL_CAP13_E_S = 14;
  public static int PQSL_CAP13_PROGRAMMA = 15;
  public static int PQSL_CAP13_PROGETTO = 16;
  public static int PQSL_CAP13_TIPO_VINCOLO = 17;
  public static int PQSL_CAP13_FLESSIBILITA = 18;
  public static int PQSL_CAP13_IVA = 19;
  public static int PQSL_CAP13_CONTRIB_COMU = 20;
  public static int PQSL_CAP13_FUNZ_DEL = 21;
  public static int PQSL_CAP13_STAMPA_DES_MAN = 22;
  public static int PQSL_CAP13_FATTORE = 23;
  public static int PQSL_CAP13_CENTRO = 24;
  public static int PQSL_CAP13_VOCE_PC = 25;
  public static int PQSL_CAP13_UTENTE_INSERIMENTO = 26;
  public static int PQSL_CAP13_DATA_INSERIMENTO = 27;
  public static int PQSL_CAP13_UTENTE_ULTIMO_AGG = 28;
  public static int PQSL_CAP13_DATA_ULTIMO_AGG = 29;
  public static int PQSL_CAP13_GRUPPO_CP = 30;
  public static int PQSL_CAP13_GRUPPO_CC = 31;
  public static int PQSL_CAP13_COD_MONITORAGGIO = 32;
  public static int PQSL_CAP13_CODICE_STRUTTURA = 33;
  public static int PQSL_CAP13_CODICE_EUROPEO = 34;
  public static int PQSL_CAP13_ENTRATA_SPESA_NON_RIC = 35;
  public static int PQSL_CAP13_CENTRO_COSTO = 36;
  public static int PQSL_CAP13_RECFONRISCAS = 37;
  public static int PQSL_CAP13_RECCAPCDRIMP = 38;
  public static int PQSL_CAP13_RECORCAPIMPI = 39;
  public static int PQSL_CAP13_RECOCAPESC12 = 40;
  public static int PQSL_CAP13_OBIETTGESTIO = 41;
  public static int PQSL_CAP13_OBIETTOPERAT = 42;
  public static int PQSL_CAP13_RECCAPTIPAVA = 43;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO4 = 1459;
  public static int PQRY_CAPUO4_RS = 1460;
  public static int PQSL_CAPUO4_SCADENZA = 0;
  public static int PQSL_CAPUO4_TIPO_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_CAPUO4_PROGR_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_CAPUO4_UTENTE_INSERIMENTO = 3;
  public static int PQSL_CAPUO4_DATA_INSERIMENTO = 4;
  public static int PQSL_CAPUO4_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_CAPUO4_DATA_ULTIMO_AGG = 6;
  public static int PQSL_CAPUO4_RECORDDESC = 7;
  public static int PQSL_CAPUO4_ESERCIZIO = 8;
  public static int PQSL_CAPUO4_E_S = 9;
  public static int PQSL_CAPUO4_CAPITOLO = 10;
  public static int PQSL_CAPUO4_ARTICOLO = 11;
  public static int PQSL_CAPUO4_CAPUOIMDBSTA = 12;
  public static int PQSL_CAPUO4_PREVALENTE = 13;

  // Table to contain panel selected row: CAP CODICI
  //
  public static int PQRY_CAPCODICI1 = 1461;
  public static int PQSL_CAPCODICI1_ESERCIZIO = 0;
  public static int PQSL_CAPCODICI1_E_S = 1;
  public static int PQSL_CAPCODICI1_CAPITOLO = 2;
  public static int PQSL_CAPCODICI1_ARTICOLO = 3;
  public static int PQSL_CAPCODICI1_TIPO_CODICE = 4;
  public static int PQSL_CAPCODICI1_CODICE = 5;

  // Table to contain panel selected row: CAP RICLASSIFICAZIONI
  //
  public static int PQRY_CAPRICLASSIF = 1462;
  public static int PQSL_CAPRICLASSIF_ESERCIZIO = 0;
  public static int PQSL_CAPRICLASSIF_E_S = 1;
  public static int PQSL_CAPRICLASSIF_CAPITOLO = 2;
  public static int PQSL_CAPRICLASSIF_ARTICOLO = 3;
  public static int PQSL_CAPRICLASSIF_STRUTTURA_RICL_ID = 4;
  public static int PQSL_CAPRICLASSIF_UTENTE_INSERIMENTO = 5;
  public static int PQSL_CAPRICLASSIF_DATA_INSERIMENTO = 6;
  public static int PQSL_CAPRICLASSIF_DATA_ULTIMO_AGG = 7;
  public static int PQSL_CAPRICLASSIF_UTENTE_ULTIMO_AGG = 8;

  // Table to contain panel selected row: POL DETTAGLIO STN PROG
  //
  public static int PQRY_POLDETSTNPR1 = 1463;
  public static int PQSL_POLDETSTNPR1_PROGRAMMA = 0;
  public static int PQSL_POLDETSTNPR1_PROGETTO = 1;
  public static int PQSL_POLDETSTNPR1_DES_PROGETTO = 2;
  public static int PQSL_POLDETSTNPR1_StanzIniziale = 3;
  public static int PQSL_POLDETSTNPR1_variazioni = 4;
  public static int PQSL_POLDETSTNPR1_stanzDefinitivo = 5;
  public static int PQSL_POLDETSTNPR1_ImpAcc = 6;
  public static int PQSL_POLDETSTNPR1_Disponibilit_ = 7;

  // Table to contain panel selected row: POL DETTAGLIO STN PROG
  //
  public static int PQRY_POLDETSTNPRO = 1464;
  public static int PQSL_POLDETSTNPRO_PROGRAMMA = 0;
  public static int PQSL_POLDETSTNPRO_PROGETTO = 1;
  public static int PQSL_POLDETSTNPRO_OBIETTIVO = 2;
  public static int PQSL_POLDETSTNPRO_DES_OBIETTIVO = 3;
  public static int PQSL_POLDETSTNPRO_StanzIniziale = 4;
  public static int PQSL_POLDETSTNPRO_variazioni = 5;
  public static int PQSL_POLDETSTNPRO_stanzDefinitivo = 6;
  public static int PQSL_POLDETSTNPRO_ImpAcc = 7;
  public static int PQSL_POLDETSTNPRO_Disponibilit_ = 8;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAMEN6 = 1465;
  public static int PQSL_FINANZIAMEN6_FINANZFINANZ = 0;
  public static int PQSL_FINANZIAMEN6_FINANZIOPERA = 1;
  public static int PQSL_FINANZIAMEN6_FINANZIAMENTO = 2;
  public static int PQSL_FINANZIAMEN6_OPERA = 3;
  public static int PQSL_FINANZIAMEN6_PREVISIONE = 4;
  public static int PQSL_FINANZIAMEN6_VARIAZIONI = 5;
  public static int PQSL_FINANZIAMEN6_PREVISIONE_ATT = 6;
  public static int PQSL_FINANZIAMEN6_ACC_IMP_COMP = 7;
  public static int PQSL_FINANZIAMEN6_DISPONIBILITA = 8;
  public static int PQSL_FINANZIAMEN6_FINAPREVESIG = 9;
  public static int PQSL_FINANZIAMEN6_FINAVARIESIG = 10;
  public static int PQSL_FINANZIAMEN6_FINPREATTESI = 11;
  public static int PQSL_FINANZIAMEN6_FINACCIMPESI = 12;
  public static int PQSL_FINANZIAMEN6_FINADISPESIG = 13;
  public static int PQSL_FINANZIAMEN6_FINAPREVSTAN = 14;
  public static int PQSL_FINANZIAMEN6_FINAVARISTAN = 15;
  public static int PQSL_FINANZIAMEN6_FINPREATTSTA = 16;
  public static int PQSL_FINANZIAMEN6_FINACCIMPSTA = 17;
  public static int PQSL_FINANZIAMEN6_FINADISPSTAN = 18;
  public static int PQSL_FINANZIAMEN6_FINAPREVPURO = 19;
  public static int PQSL_FINANZIAMEN6_FINAVARIPURO = 20;
  public static int PQSL_FINANZIAMEN6_FINPREATTPUR = 21;
  public static int PQSL_FINANZIAMEN6_FINACCIMPPUR = 22;
  public static int PQSL_FINANZIAMEN6_FINADISPPURO = 23;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN1 = 1466;
  public static int PQSL_BILFIN1_BILFIRIBIPEG = 0;
  public static int PQSL_BILFIN1_STN_INI_CO = 1;
  public static int PQSL_BILFIN1_VARIAZIONI = 2;
  public static int PQSL_BILFIN1_BILFINPREATT = 3;
  public static int PQSL_BILFIN1_BILFINFINANZ = 4;
  public static int PQSL_BILFIN1_CAPITOLO = 5;
  public static int PQSL_BILFIN1_ARTICOLO = 6;
  public static int PQSL_BILFIN1_E_S = 7;
  public static int PQSL_BILFIN1_ESERCIZIO = 8;
  public static int PQSL_BILFIN1_FINANZIAMENTO = 9;
  public static int PQSL_BILFIN1_OPERA = 10;
  public static int PQSL_BILFIN1_DESCRIZIONE = 11;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM4 = 1467;
  public static int PQSL_VARCOM4_VARRIFBILPEG = 0;
  public static int PQSL_VARCOM4_IMPORTO = 1;
  public static int PQSL_VARCOM4_VARCOMFINANZ = 2;
  public static int PQSL_VARCOM4_VARCOMDELIBE = 3;
  public static int PQSL_VARCOM4_VARCOMPROPOS = 4;
  public static int PQSL_VARCOM4_PROGETTO_ID = 5;
  public static int PQSL_VARCOM4_CAPITOLO = 6;
  public static int PQSL_VARCOM4_ARTICOLO = 7;
  public static int PQSL_VARCOM4_ANNO_DEL = 8;
  public static int PQSL_VARCOM4_NUMERO_DEL = 9;
  public static int PQSL_VARCOM4_SEDE_DEL = 10;
  public static int PQSL_VARCOM4_ANNO_PROPOSTA = 11;
  public static int PQSL_VARCOM4_UNITA_PROPONENTE = 12;
  public static int PQSL_VARCOM4_NUMERO_PROPOSTA = 13;
  public static int PQSL_VARCOM4_D_DATA_REG = 14;
  public static int PQSL_VARCOM4_DESCRIZIONE = 15;
  public static int PQSL_VARCOM4_FINANZIAMENTO = 16;

  // Table to contain panel selected row: ESEACC OPE
  //
  public static int PQRY_ESEACCOPE1 = 1468;
  public static int PQSL_ESEACCOPE1_ESEACOPEACCE = 0;
  public static int PQSL_ESEACCOPE1_D_DATA_REG = 1;
  public static int PQSL_ESEACCOPE1_DESCRIZIONE = 2;
  public static int PQSL_ESEACCOPE1_ESEACOPEIMPO = 3;
  public static int PQSL_ESEACCOPE1_RAGIONE_SOCIALE_ESTESA = 4;
  public static int PQSL_ESEACCOPE1_ESEACOPEDELI = 5;
  public static int PQSL_ESEACCOPE1_ESEACOPEPROP = 6;
  public static int PQSL_ESEACCOPE1_PROGETTO_ID = 7;
  public static int PQSL_ESEACCOPE1_CAPITOLO = 8;
  public static int PQSL_ESEACCOPE1_ARTICOLO = 9;
  public static int PQSL_ESEACCOPE1_NUMERO_ACC = 10;
  public static int PQSL_ESEACCOPE1_ANNO_ACC = 11;
  public static int PQSL_ESEACCOPE1_DEBITORE = 12;
  public static int PQSL_ESEACCOPE1_ANNO_DEL = 13;
  public static int PQSL_ESEACCOPE1_NUMERO_DEL = 14;
  public static int PQSL_ESEACCOPE1_SEDE_DEL = 15;
  public static int PQSL_ESEACCOPE1_ANNO_PROPOSTA = 16;
  public static int PQSL_ESEACCOPE1_UNITA_PROPONENTE = 17;
  public static int PQSL_ESEACCOPE1_NUMERO_PROPOSTA = 18;

  // Table to contain panel selected row: ESEIMP FIN
  //
  public static int PQRY_ESEIMPFIN1 = 1469;
  public static int PQSL_ESEIMPFIN1_ESEOPERIBICA = 0;
  public static int PQSL_ESEIMPFIN1_ESEACOPEIMPE = 1;
  public static int PQSL_ESEIMPFIN1_D_DATA_REG = 2;
  public static int PQSL_ESEIMPFIN1_DESCRIZIONE = 3;
  public static int PQSL_ESEIMPFIN1_ESEACOPEIMPO = 4;
  public static int PQSL_ESEIMPFIN1_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_ESEIMPFIN1_ESEACOPEDELI = 6;
  public static int PQSL_ESEIMPFIN1_ESEACOPEPROP = 7;
  public static int PQSL_ESEIMPFIN1_PROGETTO_ID = 8;
  public static int PQSL_ESEIMPFIN1_ANNO_DEL = 9;
  public static int PQSL_ESEIMPFIN1_NUMERO_DEL = 10;
  public static int PQSL_ESEIMPFIN1_SEDE_DEL = 11;
  public static int PQSL_ESEIMPFIN1_ANNO_PROPOSTA = 12;
  public static int PQSL_ESEIMPFIN1_UNITA_PROPONENTE = 13;
  public static int PQSL_ESEIMPFIN1_NUMERO_PROPOSTA = 14;
  public static int PQSL_ESEIMPFIN1_CAPITOLO = 15;
  public static int PQSL_ESEIMPFIN1_ARTICOLO = 16;
  public static int PQSL_ESEIMPFIN1_NUMERO_IMP = 17;
  public static int PQSL_ESEIMPFIN1_ANNO_IMP = 18;
  public static int PQSL_ESEIMPFIN1_OBIETTIVO_ID = 19;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO4 = 1470;
  public static int PQSL_VARCOMPRO4_VARRIFBILPEG = 0;
  public static int PQSL_VARCOMPRO4_IMPORTO = 1;
  public static int PQSL_VARCOMPRO4_VARCOMFINANZ = 2;
  public static int PQSL_VARCOMPRO4_D_DATA_REG = 3;
  public static int PQSL_VARCOMPRO4_VARCOMPROPOS = 4;
  public static int PQSL_VARCOMPRO4_PROGETTO_ID = 5;
  public static int PQSL_VARCOMPRO4_CAPITOLO = 6;
  public static int PQSL_VARCOMPRO4_ARTICOLO = 7;
  public static int PQSL_VARCOMPRO4_UNITA_PROPONENTE = 8;
  public static int PQSL_VARCOMPRO4_NUMERO_PROPOSTA = 9;
  public static int PQSL_VARCOMPRO4_ANNO_PROPOSTA = 10;
  public static int PQSL_VARCOMPRO4_DESCRIZIONE = 11;
  public static int PQSL_VARCOMPRO4_FINANZIAMENTO = 12;

  // Table to contain panel selected row: ESEACC OPE
  //
  public static int PQRY_ESEACCOPE2 = 1471;
  public static int PQSL_ESEACCOPE2_ESEOPRIBIPEG = 0;
  public static int PQSL_ESEACCOPE2_ESEACOPEACCE = 1;
  public static int PQSL_ESEACCOPE2_CAPITOLO = 2;
  public static int PQSL_ESEACCOPE2_ARTICOLO = 3;
  public static int PQSL_ESEACCOPE2_NUMERO_ACC = 4;
  public static int PQSL_ESEACCOPE2_ANNO_ACC = 5;
  public static int PQSL_ESEACCOPE2_D_DATA_REG = 6;
  public static int PQSL_ESEACCOPE2_DESCRIZIONE = 7;
  public static int PQSL_ESEACCOPE2_DEBITORE = 8;
  public static int PQSL_ESEACCOPE2_ANNO_DEL = 9;
  public static int PQSL_ESEACCOPE2_NUMERO_DEL = 10;
  public static int PQSL_ESEACCOPE2_SEDE_DEL = 11;
  public static int PQSL_ESEACCOPE2_ANNO_PROPOSTA = 12;
  public static int PQSL_ESEACCOPE2_UNITA_PROPONENTE = 13;
  public static int PQSL_ESEACCOPE2_NUMERO_PROPOSTA = 14;
  public static int PQSL_ESEACCOPE2_PROGETTO_ID = 15;
  public static int PQSL_ESEACCOPE2_RAGIONE_SOCIALE_ESTESA = 16;
  public static int PQSL_ESEACCOPE2_ESEACOPEIMPO = 17;
  public static int PQSL_ESEACCOPE2_ESEACOPEDELI = 18;
  public static int PQSL_ESEACCOPE2_ESEACOPEPROP = 19;

  // Table to contain panel selected row: ESEIMP FIN
  //
  public static int PQRY_ESEIMPFIN = 1472;
  public static int PQSL_ESEIMPFIN_ESEOPRIBIPEG = 0;
  public static int PQSL_ESEIMPFIN_ESEACOPEIMPE = 1;
  public static int PQSL_ESEIMPFIN_D_DATA_REG = 2;
  public static int PQSL_ESEIMPFIN_DESCRIZIONE = 3;
  public static int PQSL_ESEIMPFIN_ESEACOPEIMPO = 4;
  public static int PQSL_ESEIMPFIN_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_ESEIMPFIN_ESEACOPEDELI = 6;
  public static int PQSL_ESEIMPFIN_ESEACOPEPROP = 7;
  public static int PQSL_ESEIMPFIN_PROGETTO_ID = 8;
  public static int PQSL_ESEIMPFIN_ANNO_DEL = 9;
  public static int PQSL_ESEIMPFIN_NUMERO_DEL = 10;
  public static int PQSL_ESEIMPFIN_SEDE_DEL = 11;
  public static int PQSL_ESEIMPFIN_ANNO_PROPOSTA = 12;
  public static int PQSL_ESEIMPFIN_UNITA_PROPONENTE = 13;
  public static int PQSL_ESEIMPFIN_NUMERO_PROPOSTA = 14;
  public static int PQSL_ESEIMPFIN_CAPITOLO = 15;
  public static int PQSL_ESEIMPFIN_ARTICOLO = 16;
  public static int PQSL_ESEIMPFIN_NUMERO_IMP = 17;
  public static int PQSL_ESEIMPFIN_ANNO_IMP = 18;

  // Table to contain panel selected row: ESESUB
  //
  public static int PQRY_ESESUB = 1473;
  public static int PQSL_ESESUB_ESERIFBILPEG = 0;
  public static int PQSL_ESESUB_ESESUBIMPEGN = 1;
  public static int PQSL_ESESUB_ESESUSUBIMPE = 2;
  public static int PQSL_ESESUB_ESESUBIMPORT = 3;
  public static int PQSL_ESESUB_D_DATA_REG = 4;
  public static int PQSL_ESESUB_DESCRIZIONE = 5;
  public static int PQSL_ESESUB_RAGIONE_SOCIALE_ESTESA = 6;
  public static int PQSL_ESESUB_ESESUBDELIBE = 7;
  public static int PQSL_ESESUB_ESESUBPROPOS = 8;
  public static int PQSL_ESESUB_CAPITOLO = 9;
  public static int PQSL_ESESUB_ARTICOLO = 10;
  public static int PQSL_ESESUB_NUMERO_IMP = 11;
  public static int PQSL_ESESUB_ANNO_IMP = 12;
  public static int PQSL_ESESUB_ANNO_SUBIMP = 13;
  public static int PQSL_ESESUB_BENEFICIARIO = 14;
  public static int PQSL_ESESUB_ANNO_DEL = 15;
  public static int PQSL_ESESUB_NUMERO_DEL = 16;
  public static int PQSL_ESESUB_SEDE_DEL = 17;
  public static int PQSL_ESESUB_ANNO_PROPOSTA = 18;
  public static int PQSL_ESESUB_NUMERO_SUBIMP = 19;
  public static int PQSL_ESESUB_UNITA_PROPONENTE = 20;
  public static int PQSL_ESESUB_NUMERO_PROPOSTA = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ22 = 1474;
  public static int PQSL_LIQ22_LIQRIFBILPEG = 0;
  public static int PQSL_LIQ22_LIQIMPEGNO = 1;
  public static int PQSL_LIQ22_LIQLIQUIDAZI = 2;
  public static int PQSL_LIQ22_IMPORTO = 3;
  public static int PQSL_LIQ22_LIQINEMISS = 4;
  public static int PQSL_LIQ22_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_LIQ22_DESCRIZIONE = 6;
  public static int PQSL_LIQ22_LIQDOCUMENTO = 7;
  public static int PQSL_LIQ22_LIQSUBIMPEGN = 8;
  public static int PQSL_LIQ22_CAPITOLO = 9;
  public static int PQSL_LIQ22_ARTICOLO = 10;
  public static int PQSL_LIQ22_ANNO_IMP = 11;
  public static int PQSL_LIQ22_NUMERO_IMP = 12;
  public static int PQSL_LIQ22_ANNO_LIQ = 13;
  public static int PQSL_LIQ22_NUMERO_LIQ = 14;
  public static int PQSL_LIQ22_BENEFICIARIO = 15;
  public static int PQSL_LIQ22_NUMERO_DOC = 16;
  public static int PQSL_LIQ22_ANNO_DOC = 17;
  public static int PQSL_LIQ22_NUMERO_SUBIMP = 18;
  public static int PQSL_LIQ22_ANNO_SUBIMP = 19;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD1 = 1475;
  public static int PQSL_ORD1_ORDRIFBILCAP = 0;
  public static int PQSL_ORD1_ORDORDINATIV = 1;
  public static int PQSL_ORD1_ORDACCERTAME = 2;
  public static int PQSL_ORD1_IMPORTO = 3;
  public static int PQSL_ORD1_CAPITOLO = 4;
  public static int PQSL_ORD1_ARTICOLO = 5;
  public static int PQSL_ORD1_NUMERO_ORD = 6;
  public static int PQSL_ORD1_D_DATA_ORD = 7;
  public static int PQSL_ORD1_NUMERO_ACC = 8;
  public static int PQSL_ORD1_ANNO_ACC = 9;
  public static int PQSL_ORD1_ANNO_ORD = 10;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD2 = 1476;
  public static int PQSL_ORD2_ORDRIFBILPEG = 0;
  public static int PQSL_ORD2_ORDORDINATIV = 1;
  public static int PQSL_ORD2_ORDACCERTAME = 2;
  public static int PQSL_ORD2_IMPORTO = 3;
  public static int PQSL_ORD2_CAPITOLO = 4;
  public static int PQSL_ORD2_ARTICOLO = 5;
  public static int PQSL_ORD2_NUMERO_ORD = 6;
  public static int PQSL_ORD2_D_DATA_ORD = 7;
  public static int PQSL_ORD2_NUMERO_ACC = 8;
  public static int PQSL_ORD2_ANNO_ACC = 9;
  public static int PQSL_ORD2_ANNO_ORD = 10;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN10 = 1477;
  public static int PQSL_MAN10_MANRIFBILPEG = 0;
  public static int PQSL_MAN10_MANMANDATO = 1;
  public static int PQSL_MAN10_MANIMPEGNO = 2;
  public static int PQSL_MAN10_MANIMPORTO = 3;
  public static int PQSL_MAN10_CAPITOLO = 4;
  public static int PQSL_MAN10_ARTICOLO = 5;
  public static int PQSL_MAN10_NUMERO_MAND = 6;
  public static int PQSL_MAN10_D_DATA_MAND = 7;
  public static int PQSL_MAN10_NUMERO_IMP = 8;
  public static int PQSL_MAN10_ANNO_IMP = 9;
  public static int PQSL_MAN10_ANNO_MAND = 10;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN2 = 1478;
  public static int PQSL_MAN2_MANRIFBILPEG = 0;
  public static int PQSL_MAN2_MANMANDATO = 1;
  public static int PQSL_MAN2_MANIMPEGNO = 2;
  public static int PQSL_MAN2_MANIMPORTO = 3;
  public static int PQSL_MAN2_CAPITOLO = 4;
  public static int PQSL_MAN2_ARTICOLO = 5;
  public static int PQSL_MAN2_NUMERO_MAND = 6;
  public static int PQSL_MAN2_D_DATA_MAND = 7;
  public static int PQSL_MAN2_NUMERO_IMP = 8;
  public static int PQSL_MAN2_ANNO_IMP = 9;
  public static int PQSL_MAN2_ANNO_MAND = 10;

  // Table to contain panel selected row: BIL FIN
  //
  public static int PQRY_BILFIN3 = 1479;
  public static int PQSL_BILFIN3_BILFIRIBIPEG = 0;
  public static int PQSL_BILFIN3_STN_INI_CO = 1;
  public static int PQSL_BILFIN3_VARIAZIONI = 2;
  public static int PQSL_BILFIN3_BILFINPREATT = 3;
  public static int PQSL_BILFIN3_BILFINOPERA = 4;
  public static int PQSL_BILFIN3_CAPITOLO = 5;
  public static int PQSL_BILFIN3_ARTICOLO = 6;
  public static int PQSL_BILFIN3_E_S = 7;
  public static int PQSL_BILFIN3_ESERCIZIO = 8;
  public static int PQSL_BILFIN3_FINANZIAMENTO = 9;
  public static int PQSL_BILFIN3_OPERA = 10;
  public static int PQSL_BILFIN3_DESCRIZIONE = 11;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM14 = 1480;
  public static int PQSL_VARCOM14_VARRIFBILPEG = 0;
  public static int PQSL_VARCOM14_IMPORTO = 1;
  public static int PQSL_VARCOM14_VARCOMOPERA = 2;
  public static int PQSL_VARCOM14_VARCOMDELIBE = 3;
  public static int PQSL_VARCOM14_VARCOMPROPOS = 4;
  public static int PQSL_VARCOM14_PROGETTO_ID = 5;
  public static int PQSL_VARCOM14_CAPITOLO = 6;
  public static int PQSL_VARCOM14_ARTICOLO = 7;
  public static int PQSL_VARCOM14_OPERA = 8;
  public static int PQSL_VARCOM14_ANNO_DEL = 9;
  public static int PQSL_VARCOM14_NUMERO_DEL = 10;
  public static int PQSL_VARCOM14_SEDE_DEL = 11;
  public static int PQSL_VARCOM14_ANNO_PROPOSTA = 12;
  public static int PQSL_VARCOM14_UNITA_PROPONENTE = 13;
  public static int PQSL_VARCOM14_NUMERO_PROPOSTA = 14;
  public static int PQSL_VARCOM14_D_DATA_REG = 15;
  public static int PQSL_VARCOM14_DESCRIZIONE = 16;
  public static int PQSL_VARCOM14_VARCCODIDESC = 17;

  // Table to contain panel selected row: ESEACC FIN
  //
  public static int PQRY_ESEACCFIN = 1481;
  public static int PQSL_ESEACCFIN_ESEFIRIBIPEG = 0;
  public static int PQSL_ESEACCFIN_ESEACFINACCE = 1;
  public static int PQSL_ESEACCFIN_D_DATA_REG = 2;
  public static int PQSL_ESEACCFIN_DESCRIZIONE = 3;
  public static int PQSL_ESEACCFIN_ESEACFINIMPO = 4;
  public static int PQSL_ESEACCFIN_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_ESEACCFIN_ESEACFINDELI = 6;
  public static int PQSL_ESEACCFIN_ESEACFINPROP = 7;
  public static int PQSL_ESEACCFIN_PROGETTO_ID = 8;
  public static int PQSL_ESEACCFIN_CAPITOLO = 9;
  public static int PQSL_ESEACCFIN_ARTICOLO = 10;
  public static int PQSL_ESEACCFIN_NUMERO_ACC = 11;
  public static int PQSL_ESEACCFIN_ANNO_ACC = 12;
  public static int PQSL_ESEACCFIN_DEBITORE = 13;
  public static int PQSL_ESEACCFIN_ANNO_DEL = 14;
  public static int PQSL_ESEACCFIN_NUMERO_DEL = 15;
  public static int PQSL_ESEACCFIN_SEDE_DEL = 16;
  public static int PQSL_ESEACCFIN_ANNO_PROPOSTA = 17;
  public static int PQSL_ESEACCFIN_UNITA_PROPONENTE = 18;
  public static int PQSL_ESEACCFIN_NUMERO_PROPOSTA = 19;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO2 = 1482;
  public static int PQSL_VARCOMPRO2_VARRIFBILPEG = 0;
  public static int PQSL_VARCOMPRO2_IMPORTO = 1;
  public static int PQSL_VARCOMPRO2_VARCOMPOPERA = 2;
  public static int PQSL_VARCOMPRO2_D_DATA_REG = 3;
  public static int PQSL_VARCOMPRO2_VARCOMPROPOS = 4;
  public static int PQSL_VARCOMPRO2_PROGETTO_ID = 5;
  public static int PQSL_VARCOMPRO2_CAPITOLO = 6;
  public static int PQSL_VARCOMPRO2_ARTICOLO = 7;
  public static int PQSL_VARCOMPRO2_UNITA_PROPONENTE = 8;
  public static int PQSL_VARCOMPRO2_NUMERO_PROPOSTA = 9;
  public static int PQSL_VARCOMPRO2_ANNO_PROPOSTA = 10;
  public static int PQSL_VARCOMPRO2_DESCRIZIONE = 11;
  public static int PQSL_VARCOMPRO2_OPERA = 12;

  // Table to contain panel selected row: ESEACC OPE
  //
  public static int PQRY_ESEACCOPE = 1483;
  public static int PQSL_ESEACCOPE_ESEOPRIBIPEG = 0;
  public static int PQSL_ESEACCOPE_ESEACOPEACCE = 1;
  public static int PQSL_ESEACCOPE_D_DATA_REG = 2;
  public static int PQSL_ESEACCOPE_DESCRIZIONE = 3;
  public static int PQSL_ESEACCOPE_ESEACOPEIMPO = 4;
  public static int PQSL_ESEACCOPE_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_ESEACCOPE_ESEACOPEDELI = 6;
  public static int PQSL_ESEACCOPE_ESEACOPEPROP = 7;
  public static int PQSL_ESEACCOPE_PROGETTO_ID = 8;
  public static int PQSL_ESEACCOPE_CAPITOLO = 9;
  public static int PQSL_ESEACCOPE_ARTICOLO = 10;
  public static int PQSL_ESEACCOPE_NUMERO_ACC = 11;
  public static int PQSL_ESEACCOPE_ANNO_ACC = 12;
  public static int PQSL_ESEACCOPE_DEBITORE = 13;
  public static int PQSL_ESEACCOPE_ANNO_DEL = 14;
  public static int PQSL_ESEACCOPE_NUMERO_DEL = 15;
  public static int PQSL_ESEACCOPE_SEDE_DEL = 16;
  public static int PQSL_ESEACCOPE_ANNO_PROPOSTA = 17;
  public static int PQSL_ESEACCOPE_UNITA_PROPONENTE = 18;
  public static int PQSL_ESEACCOPE_NUMERO_PROPOSTA = 19;

  // Table to contain panel selected row: ESESUB FIN
  //
  public static int PQRY_ESESUBFIN = 1484;
  public static int PQSL_ESESUBFIN_ESEFIRIBIPEG = 0;
  public static int PQSL_ESESUBFIN_ESESUFINIMPE = 1;
  public static int PQSL_ESESUBFIN_ESEFINSUBIMP = 2;
  public static int PQSL_ESESUBFIN_ESESUFINIMPO = 3;
  public static int PQSL_ESESUBFIN_D_DATA_REG = 4;
  public static int PQSL_ESESUBFIN_DESCRIZIONE = 5;
  public static int PQSL_ESESUBFIN_RAGIONE_SOCIALE_ESTESA = 6;
  public static int PQSL_ESESUBFIN_ESESUFINDELI = 7;
  public static int PQSL_ESESUBFIN_ESESUFINPROP = 8;
  public static int PQSL_ESESUBFIN_CAPITOLO = 9;
  public static int PQSL_ESESUBFIN_ARTICOLO = 10;
  public static int PQSL_ESESUBFIN_NUMERO_IMP = 11;
  public static int PQSL_ESESUBFIN_ANNO_IMP = 12;
  public static int PQSL_ESESUBFIN_NUMERO_SUBIMP = 13;
  public static int PQSL_ESESUBFIN_ANNO_SUBIMP = 14;
  public static int PQSL_ESESUBFIN_BENEFICIARIO = 15;
  public static int PQSL_ESESUBFIN_ANNO_DEL = 16;
  public static int PQSL_ESESUBFIN_NUMERO_DEL = 17;
  public static int PQSL_ESESUBFIN_SEDE_DEL = 18;
  public static int PQSL_ESESUBFIN_ANNO_PROPOSTA = 19;
  public static int PQSL_ESESUBFIN_UNITA_PROPONENTE = 20;
  public static int PQSL_ESESUBFIN_NUMERO_PROPOSTA = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ37 = 1485;
  public static int PQSL_LIQ37_LIQRIFBILPEG = 0;
  public static int PQSL_LIQ37_LIQIMPEGNO = 1;
  public static int PQSL_LIQ37_LIQLIQUIDAZI = 2;
  public static int PQSL_LIQ37_IMPORTO = 3;
  public static int PQSL_LIQ37_LIQINEMISS = 4;
  public static int PQSL_LIQ37_RAGIONE_SOCIALE_ESTESA = 5;
  public static int PQSL_LIQ37_DESCRIZIONE = 6;
  public static int PQSL_LIQ37_LIQDOCUMENTO = 7;
  public static int PQSL_LIQ37_LIQSUBIMPEGN = 8;
  public static int PQSL_LIQ37_CAPITOLO = 9;
  public static int PQSL_LIQ37_ARTICOLO = 10;
  public static int PQSL_LIQ37_ANNO_IMP = 11;
  public static int PQSL_LIQ37_NUMERO_IMP = 12;
  public static int PQSL_LIQ37_ANNO_LIQ = 13;
  public static int PQSL_LIQ37_NUMERO_LIQ = 14;
  public static int PQSL_LIQ37_BENEFICIARIO = 15;
  public static int PQSL_LIQ37_NUMERO_DOC = 16;
  public static int PQSL_LIQ37_ANNO_DOC = 17;
  public static int PQSL_LIQ37_NUMERO_SUBIMP = 18;
  public static int PQSL_LIQ37_ANNO_SUBIMP = 19;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD3 = 1486;
  public static int PQSL_ORD3_ORDRIFBILPEG = 0;
  public static int PQSL_ORD3_ORDORDINATIV = 1;
  public static int PQSL_ORD3_ORDACCERTAME = 2;
  public static int PQSL_ORD3_IMPORTO = 3;
  public static int PQSL_ORD3_CAPITOLO = 4;
  public static int PQSL_ORD3_ARTICOLO = 5;
  public static int PQSL_ORD3_NUMERO_ORD = 6;
  public static int PQSL_ORD3_D_DATA_ORD = 7;
  public static int PQSL_ORD3_NUMERO_ACC = 8;
  public static int PQSL_ORD3_ANNO_ACC = 9;
  public static int PQSL_ORD3_ANNO_ORD = 10;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD4 = 1487;
  public static int PQSL_ORD4_ORDRIFBILPEG = 0;
  public static int PQSL_ORD4_ORDORDINATIV = 1;
  public static int PQSL_ORD4_ORDACCERTAME = 2;
  public static int PQSL_ORD4_IMPORTO = 3;
  public static int PQSL_ORD4_CAPITOLO = 4;
  public static int PQSL_ORD4_ARTICOLO = 5;
  public static int PQSL_ORD4_NUMERO_ORD = 6;
  public static int PQSL_ORD4_D_DATA_ORD = 7;
  public static int PQSL_ORD4_NUMERO_ACC = 8;
  public static int PQSL_ORD4_ANNO_ACC = 9;
  public static int PQSL_ORD4_ANNO_ORD = 10;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN3 = 1488;
  public static int PQSL_MAN3_MANRIFBILPEG = 0;
  public static int PQSL_MAN3_MANMANDATO = 1;
  public static int PQSL_MAN3_MANIMPEGNO = 2;
  public static int PQSL_MAN3_MANIMPORTO = 3;
  public static int PQSL_MAN3_CAPITOLO = 4;
  public static int PQSL_MAN3_ARTICOLO = 5;
  public static int PQSL_MAN3_NUMERO_MAND = 6;
  public static int PQSL_MAN3_D_DATA_MAND = 7;
  public static int PQSL_MAN3_NUMERO_IMP = 8;
  public static int PQSL_MAN3_ANNO_IMP = 9;
  public static int PQSL_MAN3_ANNO_MAND = 10;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN4 = 1489;
  public static int PQSL_MAN4_MANRIFBILPEG = 0;
  public static int PQSL_MAN4_MANMANDATO = 1;
  public static int PQSL_MAN4_MANIMPEGNO = 2;
  public static int PQSL_MAN4_MANIMPORTO = 3;
  public static int PQSL_MAN4_CAPITOLO = 4;
  public static int PQSL_MAN4_ARTICOLO = 5;
  public static int PQSL_MAN4_NUMERO_MAND = 6;
  public static int PQSL_MAN4_D_DATA_MAND = 7;
  public static int PQSL_MAN4_NUMERO_IMP = 8;
  public static int PQSL_MAN4_ANNO_IMP = 9;
  public static int PQSL_MAN4_ANNO_MAND = 10;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ49 = 1490;
  public static int PQSL_LIQ49_LIQMANDATO = 0;
  public static int PQSL_LIQ49_D_DATA_MAND = 1;
  public static int PQSL_LIQ49_LIQIMPORTO = 2;
  public static int PQSL_LIQ49_PAGATO = 3;
  public static int PQSL_LIQ49_LIQRIFBILPEG = 4;
  public static int PQSL_LIQ49_LIQIMPEGNO = 5;
  public static int PQSL_LIQ49_NUMERO_MAND = 6;
  public static int PQSL_LIQ49_ANNO_MAND = 7;
  public static int PQSL_LIQ49_CAPITOLO = 8;
  public static int PQSL_LIQ49_ARTICOLO = 9;
  public static int PQSL_LIQ49_NUMERO_IMP = 10;
  public static int PQSL_LIQ49_ANNO_IMP = 11;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ50 = 1491;
  public static int PQSL_LIQ50_LIQMANDATO = 0;
  public static int PQSL_LIQ50_D_DATA_MAND = 1;
  public static int PQSL_LIQ50_LIQIMPORTO = 2;
  public static int PQSL_LIQ50_PAGATO = 3;
  public static int PQSL_LIQ50_LIQRIFBILPEG = 4;
  public static int PQSL_LIQ50_LIQIMPEGNO = 5;
  public static int PQSL_LIQ50_NUMERO_MAND = 6;
  public static int PQSL_LIQ50_ANNO_MAND = 7;
  public static int PQSL_LIQ50_CAPITOLO = 8;
  public static int PQSL_LIQ50_ARTICOLO = 9;
  public static int PQSL_LIQ50_NUMERO_IMP = 10;
  public static int PQSL_LIQ50_ANNO_IMP = 11;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ51 = 1492;
  public static int PQSL_LIQ51_LIQMANDATO = 0;
  public static int PQSL_LIQ51_D_DATA_PAGAM = 1;
  public static int PQSL_LIQ51_LIQIMPORTO = 2;
  public static int PQSL_LIQ51_LIQRIFBILPEG = 3;
  public static int PQSL_LIQ51_LIQIMPEGNO = 4;
  public static int PQSL_LIQ51_NUMERO_MAND = 5;
  public static int PQSL_LIQ51_ANNO_MAND = 6;
  public static int PQSL_LIQ51_LIQCAPITOLO = 7;
  public static int PQSL_LIQ51_LIQARTICOLO = 8;
  public static int PQSL_LIQ51_LIQNUMIMP = 9;
  public static int PQSL_LIQ51_LIQANNOIMP = 10;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ52 = 1493;
  public static int PQSL_LIQ52_LIQMANDATO = 0;
  public static int PQSL_LIQ52_D_DATA_PAGAM = 1;
  public static int PQSL_LIQ52_LIQIMPORTO = 2;
  public static int PQSL_LIQ52_LIQRIFBILPEG = 3;
  public static int PQSL_LIQ52_LIQIMPEGNO = 4;
  public static int PQSL_LIQ52_NUMERO_MAND = 5;
  public static int PQSL_LIQ52_ANNO_MAND = 6;
  public static int PQSL_LIQ52_LIQCAPITOLO = 7;
  public static int PQSL_LIQ52_LIQARTICOLO = 8;
  public static int PQSL_LIQ52_LIQNUMIMP = 9;
  public static int PQSL_LIQ52_LIQANNOIMP = 10;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC4 = 1494;
  public static int PQSL_ACC4_ACCORDINATIV = 0;
  public static int PQSL_ACC4_ACCDATA = 1;
  public static int PQSL_ACC4_ACCIMPORTO = 2;
  public static int PQSL_ACC4_ACCINCASSATO = 3;
  public static int PQSL_ACC4_NUMERO_ORD = 4;
  public static int PQSL_ACC4_ANNO_ORD = 5;
  public static int PQSL_ACC4_CAPITOLO = 6;
  public static int PQSL_ACC4_ARTICOLO = 7;
  public static int PQSL_ACC4_NUMEROACC = 8;
  public static int PQSL_ACC4_ANNOACC = 9;
  public static int PQSL_ACC4_ACCRIFBILPEG = 10;
  public static int PQSL_ACC4_ACCACCERTAME = 11;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD5 = 1495;
  public static int PQSL_ORD5_ORDORDINATIV = 0;
  public static int PQSL_ORD5_D_DATA_INC = 1;
  public static int PQSL_ORD5_ORDIMPORTO = 2;
  public static int PQSL_ORD5_ORDRIFBILPEG = 3;
  public static int PQSL_ORD5_ORDACCERTAME = 4;
  public static int PQSL_ORD5_NUMERO_ORD = 5;
  public static int PQSL_ORD5_ANNO_ORD = 6;
  public static int PQSL_ORD5_CAPITOLO = 7;
  public static int PQSL_ORD5_ARTICOLO = 8;
  public static int PQSL_ORD5_ORDNUMIMP = 9;
  public static int PQSL_ORD5_ORDANNOIMP = 10;
  public static int PQSL_ORD5_DDATAORD = 11;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD9 = 1496;
  public static int PQSL_ORD9_ORDORDINATIV = 0;
  public static int PQSL_ORD9_D_DATA_ORD = 1;
  public static int PQSL_ORD9_IMPORTO = 2;
  public static int PQSL_ORD9_INCASSATO = 3;
  public static int PQSL_ORD9_ORDRIFBILPEG = 4;
  public static int PQSL_ORD9_ORDACCERTAME = 5;
  public static int PQSL_ORD9_NUMERO_ORD = 6;
  public static int PQSL_ORD9_ANNO_ORD = 7;
  public static int PQSL_ORD9_CAPITOLO = 8;
  public static int PQSL_ORD9_ARTICOLO = 9;
  public static int PQSL_ORD9_NUMERO_ACC = 10;
  public static int PQSL_ORD9_ANNO_ACC = 11;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE7 = 1497;
  public static int PQSL_PRE7_PARGENRREORD = 0;
  public static int PQSL_PRE7_D_DATA_INC = 1;
  public static int PQSL_PRE7_PARGENRREIMP = 2;
  public static int PQSL_PRE7_PAGERRRIBPEG = 3;
  public static int PQSL_PRE7_PARGENRREACC = 4;
  public static int PQSL_PRE7_NUMERO_ORD = 5;
  public static int PQSL_PRE7_ANNO_ORD = 6;
  public static int PQSL_PRE7_PARGENRRECAP = 7;
  public static int PQSL_PRE7_PARGENRREART = 8;
  public static int PQSL_PRE7_PARGENRRNUIM = 9;
  public static int PQSL_PRE7_PARGENRRANIM = 10;
  public static int PQSL_PRE7_PARGERRDDAOR = 11;

  // Table to contain panel selected row: VARSCA
  //
  public static int PQRY_VARSCA = 1498;
  public static int PQSL_VARSCA_PROGRESSIVO = 0;
  public static int PQSL_VARSCA_ESERCIZIO = 1;
  public static int PQSL_VARSCA_FINANZIAMENTO = 2;
  public static int PQSL_VARSCA_IMPORTO = 3;
  public static int PQSL_VARSCA_DATA_REG = 4;

  // Table to contain panel selected row: STANZIAMENTI PROGETTO
  //
  public static int PQRY_STANZIPROGE4 = 1499;
  public static int PQSL_STANZIPROGE4_STANPROGCAPI = 0;
  public static int PQSL_STANZIPROGE4_STAPROSTAINI = 1;
  public static int PQSL_STANZIPROGE4_STAPROSTADEF = 2;
  public static int PQSL_STANZIPROGE4_STANPROGIMPE = 3;
  public static int PQSL_STANZIPROGE4_STANPROGDISP = 4;
  public static int PQSL_STANZIPROGE4_DES_VOCE = 5;

  // Table to contain panel selected row: STANZIAMENTI PROGETTO
  //
  public static int PQRY_STANZIPROGE2 = 1500;
  public static int PQSL_STANZIPROGE2_STANPROGCAPI = 0;
  public static int PQSL_STANZIPROGE2_STAPROSTAINI = 1;
  public static int PQSL_STANZIPROGE2_STAPROSTADEF = 2;
  public static int PQSL_STANZIPROGE2_STANPROGIMPE = 3;
  public static int PQSL_STANZIPROGE2_STANPROGDISP = 4;
  public static int PQSL_STANZIPROGE2_DES_VOCE = 5;

  // Table to contain panel selected row: QTN
  //
  public static int PQRY_QTN3 = 1501;
  public static int PQSL_QTN3_CODICE = 0;
  public static int PQSL_QTN3_NUM_QUIETANZA = 1;
  public static int PQSL_QTN3_CONTO_CORRENTE = 2;
  public static int PQSL_QTN3_DES_BANCA = 3;
  public static int PQSL_QTN3_COD_BANCA = 4;
  public static int PQSL_QTN3_COD_SPORTELLO = 5;
  public static int PQSL_QTN3_INTESTATARIO_1 = 6;
  public static int PQSL_QTN3_INTESTATARIO_2 = 7;
  public static int PQSL_QTN3_INTESTATARIO_3 = 8;
  public static int PQSL_QTN3_TIPO_QUIETANZA = 9;
  public static int PQSL_QTN3_DESCRIZIONE = 10;
  public static int PQSL_QTN3_SCADENZA = 11;
  public static int PQSL_QTN3_CIN_BANCARIO = 12;
  public static int PQSL_QTN3_IBAN_PAESE = 13;
  public static int PQSL_QTN3_IBAN_CIN_EUROPA = 14;
  public static int PQSL_QTN3_RECORDQUIETA = 15;
  public static int PQSL_QTN3_RECOBENEEXPR = 16;
  public static int PQSL_QTN3_IBAN_ID_NAZIONALE = 17;
  public static int PQSL_QTN3_IBAN_CONTO = 18;
  public static int PQSL_QTN3_IBAN_EXTRA_UE = 19;
  public static int PQSL_QTN3_BIC = 20;
  public static int PQSL_QTN3_RECORDSPESE = 21;
  public static int PQSL_QTN3_REBERASOESES = 22;
  public static int PQSL_QTN3_RECQTNCONDED = 23;
  public static int PQSL_QTN3_RECORQTNPREV = 24;

  // Table to contain panel selected row: DISPOSIZIONI
  //
  public static int PQRY_DISPOSIZION3 = 1502;
  public static int PQSL_DISPOSIZION3_ANNO_DISP = 0;
  public static int PQSL_DISPOSIZION3_PROGRESSIVO_DISP = 1;
  public static int PQSL_DISPOSIZION3_SETTORE_OPERATIVO = 2;
  public static int PQSL_DISPOSIZION3_SERVIZIO_OPERATIVO = 3;
  public static int PQSL_DISPOSIZION3_ANNO_IMP = 4;
  public static int PQSL_DISPOSIZION3_NUMERO_IMP = 5;
  public static int PQSL_DISPOSIZION3_ANNO_SUBIMP = 6;
  public static int PQSL_DISPOSIZION3_NUMERO_SUBIMP = 7;
  public static int PQSL_DISPOSIZION3_DATA_CONTRIBUTO = 8;
  public static int PQSL_DISPOSIZION3_BENEFICIARIO = 9;
  public static int PQSL_DISPOSIZION3_IMPORTO = 10;
  public static int PQSL_DISPOSIZION3_DESCRIZIONE = 11;
  public static int PQSL_DISPOSIZION3_ANNO_LIQ = 12;
  public static int PQSL_DISPOSIZION3_NUMERO_LIQ = 13;
  public static int PQSL_DISPOSIZION3_ANNO_DISTINTA = 14;
  public static int PQSL_DISPOSIZION3_NUMERO_DISTINTA = 15;
  public static int PQSL_DISPOSIZION3_NOTE = 16;
  public static int PQSL_DISPOSIZION3_UTENTE = 17;
  public static int PQSL_DISPOSIZION3_DATA_REGISTRAZIONE = 18;
  public static int PQSL_DISPOSIZION3_CENTRO = 19;
  public static int PQSL_DISPOSIZION3_FATTORE = 20;
  public static int PQSL_DISPOSIZION3_COMPETENZA_DAL = 21;
  public static int PQSL_DISPOSIZION3_COMPETENZA_AL = 22;
  public static int PQSL_DISPOSIZION3_FINANZIAMENTO = 23;
  public static int PQSL_DISPOSIZION3_NUM_QUIETANZA = 24;
  public static int PQSL_DISPOSIZION3_TIPO_SCADENZA = 25;
  public static int PQSL_DISPOSIZION3_RILEVANTE_ECO = 26;
  public static int PQSL_DISPOSIZION3_CODICE_GESTIONALE = 27;
  public static int PQSL_DISPOSIZION3_PROGR_UNITA_ORGANIZZATIVA = 28;
  public static int PQSL_DISPOSIZION3_VOCE_ECON = 29;
  public static int PQSL_DISPOSIZION3_UTENTE_ULTIMO_AGG = 30;
  public static int PQSL_DISPOSIZION3_DATA_ULTIMO_AGG = 31;
  public static int PQSL_DISPOSIZION3_DISBENRASOES = 32;
  public static int PQSL_DISPOSIZION3_DISPOSIZICIG = 33;
  public static int PQSL_DISPOSIZION3_DISPOSIZICUP = 34;

  // Table to contain panel selected row: LIQ DISPOSIZIONI
  //
  public static int PQRY_LIQDISPOSIZ7 = 1503;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPPROG1 = 0;
  public static int PQSL_LIQDISPOSIZ7_LIQDISANNDI1 = 1;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPRODIS = 2;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPOIMPO = 3;
  public static int PQSL_LIQDISPOSIZ7_LIQDISANNLIQ = 4;
  public static int PQSL_LIQDISPOSIZ7_LIQDISNUMLIQ = 5;
  public static int PQSL_LIQDISPOSIZ7_LIQDISANNDIS = 6;
  public static int PQSL_LIQDISPOSIZ7_LIQDISNUMDIS = 7;
  public static int PQSL_LIQDISPOSIZ7_LIQDISDATREG = 8;
  public static int PQSL_LIQDISPOSIZ7_LIQDISCOMDAL = 9;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPCOMAL = 10;
  public static int PQSL_LIQDISPOSIZ7_LIQDISNUMQUI = 11;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPOFATT = 12;
  public static int PQSL_LIQDISPOSIZ7_LIQDISPOCENT = 13;
  public static int PQSL_LIQDISPOSIZ7_LIQDISCODGES = 14;
  public static int PQSL_LIQDISPOSIZ7_LIDIDILIDADI = 15;
  public static int PQSL_LIQDISPOSIZ7_LIQDILIDDARE = 16;
  public static int PQSL_LIQDISPOSIZ7_LIQDISMAANMA = 17;
  public static int PQSL_LIQDISPOSIZ7_LIQDISMANUMA = 18;
  public static int PQSL_LIQDISPOSIZ7_LIQDIMADDAMA = 19;
  public static int PQSL_LIQDISPOSIZ7_LIQDISUTEINS = 20;
  public static int PQSL_LIQDISPOSIZ7_LIQDISUTULAG = 21;
  public static int PQSL_LIQDISPOSIZ7_LIQDISDAULAG = 22;

  // Table to contain panel selected row: DISPOSIZIONI
  //
  public static int PQRY_DISPOSIZION4 = 1504;
  public static int PQSL_DISPOSIZION4_ANNO_DISP = 0;
  public static int PQSL_DISPOSIZION4_PROGRESSIVO_DISP = 1;
  public static int PQSL_DISPOSIZION4_SETTORE_OPERATIVO = 2;
  public static int PQSL_DISPOSIZION4_SERVIZIO_OPERATIVO = 3;
  public static int PQSL_DISPOSIZION4_ANNO_IMP = 4;
  public static int PQSL_DISPOSIZION4_NUMERO_IMP = 5;
  public static int PQSL_DISPOSIZION4_ANNO_SUBIMP = 6;
  public static int PQSL_DISPOSIZION4_NUMERO_SUBIMP = 7;
  public static int PQSL_DISPOSIZION4_DATA_CONTRIBUTO = 8;
  public static int PQSL_DISPOSIZION4_IMPORTO = 9;
  public static int PQSL_DISPOSIZION4_DISPOSDESCRI = 10;
  public static int PQSL_DISPOSIZION4_ANNO_LIQ = 11;
  public static int PQSL_DISPOSIZION4_NUMERO_LIQ = 12;
  public static int PQSL_DISPOSIZION4_ANNO_DISTINTA = 13;
  public static int PQSL_DISPOSIZION4_NUMERO_DISTINTA = 14;
  public static int PQSL_DISPOSIZION4_NOTE = 15;
  public static int PQSL_DISPOSIZION4_UTENTE = 16;
  public static int PQSL_DISPOSIZION4_DATA_REGISTRAZIONE = 17;
  public static int PQSL_DISPOSIZION4_CENTRO = 18;
  public static int PQSL_DISPOSIZION4_FATTORE = 19;
  public static int PQSL_DISPOSIZION4_COMPETENZA_DAL = 20;
  public static int PQSL_DISPOSIZION4_COMPETENZA_AL = 21;
  public static int PQSL_DISPOSIZION4_FINANZIAMENTO = 22;
  public static int PQSL_DISPOSIZION4_NUM_QUIETANZA = 23;
  public static int PQSL_DISPOSIZION4_TIPO_SCADENZA = 24;
  public static int PQSL_DISPOSIZION4_RILEVANTE_ECO = 25;
  public static int PQSL_DISPOSIZION4_CODICE_GESTIONALE = 26;
  public static int PQSL_DISPOSIZION4_DISSUDUNISUP = 27;
  public static int PQSL_DISPOSIZION4_PROGR_UNITA_ORGANIZZATIVA = 28;
  public static int PQSL_DISPOSIZION4_VOCE_ECON = 29;
  public static int PQSL_DISPOSIZION4_UTENTE_ULTIMO_AGG = 30;
  public static int PQSL_DISPOSIZION4_DATA_ULTIMO_AGG = 31;
  public static int PQSL_DISPOSIZION4_CODICE = 32;
  public static int PQSL_DISPOSIZION4_DISPOT01DESC = 33;
  public static int PQSL_DISPOSIZION4_DISCODGESDES = 34;
  public static int PQSL_DISPOSIZION4_DISVOCECODES = 35;
  public static int PQSL_DISPOSIZION4_DISPFINADESC = 36;
  public static int PQSL_DISPOSIZION4_DISFATBUDIDE = 37;
  public static int PQSL_DISPOSIZION4_DISCENBUDIDE = 38;
  public static int PQSL_DISPOSIZION4_DISENTCOMPRO = 39;
  public static int PQSL_DISPOSIZION4_DISPOSTINDIR = 40;
  public static int PQSL_DISPOSIZION4_DISPTCODFISC = 41;
  public static int PQSL_DISPOSIZION4_DISPTPARTIVA = 42;
  public static int PQSL_DISPOSIZION4_DISPOSBENEFI = 43;
  public static int PQSL_DISPOSIZION4_DISPCODIBENE = 44;
  public static int PQSL_DISPOSIZION4_DIBERASOESES = 45;
  public static int PQSL_DISPOSIZION4_DISBENCOMPRO = 46;
  public static int PQSL_DISPOSIZION4_DISPOBENINDI = 47;
  public static int PQSL_DISPOSIZION4_DISBENCODFIS = 48;
  public static int PQSL_DISPOSIZION4_DISBENPARIVA = 49;
  public static int PQSL_DISPOSIZION4_DISPOSIZICIG = 50;
  public static int PQSL_DISPOSIZION4_DISPOSIZICUP = 51;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE
  //
  public static int PQRY_DISTINLIQUI8 = 1505;
  public static int PQSL_DISTINLIQUI8_ANNO_DISTINTA = 0;
  public static int PQSL_DISTINLIQUI8_NUMERO_DISTINTA = 1;
  public static int PQSL_DISTINLIQUI8_DATA_DISTINTA = 2;
  public static int PQSL_DISTINLIQUI8_STATO = 3;
  public static int PQSL_DISTINLIQUI8_FLAG_LIQUIDATO = 4;
  public static int PQSL_DISTINLIQUI8_UTENTE_INSERIMENTO = 5;
  public static int PQSL_DISTINLIQUI8_DATA_INSERIMENTO = 6;
  public static int PQSL_DISTINLIQUI8_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_DISTINLIQUI8_DATA_ULTIMO_AGG = 8;
  public static int PQSL_DISTINLIQUI8_SCADENZA_DAL = 9;
  public static int PQSL_DISTINLIQUI8_SCADENZA_AL = 10;
  public static int PQSL_DISTINLIQUI8_RECORDIMPORT = 11;
  public static int PQSL_DISTINLIQUI8_PROGR_UNITA_ORGANIZZATIVA = 12;
  public static int PQSL_DISTINLIQUI8_TIPO_DIST = 13;
  public static int PQSL_DISTINLIQUI8_ANNO_DEL = 14;
  public static int PQSL_DISTINLIQUI8_NUMERO_DEL = 15;
  public static int PQSL_DISTINLIQUI8_SEDE_DEL = 16;
  public static int PQSL_DISTINLIQUI8_ANNO_IMP = 17;
  public static int PQSL_DISTINLIQUI8_NUMERO_IMP = 18;
  public static int PQSL_DISTINLIQUI8_ANNO_SUBIMP = 19;
  public static int PQSL_DISTINLIQUI8_NUMERO_SUBIMP = 20;
  public static int PQSL_DISTINLIQUI8_LINK_GDM = 21;
  public static int PQSL_DISTINLIQUI8_PROGR_UO_COMPETENZA = 22;
  public static int PQSL_DISTINLIQUI8_SIOPEATTIARM = 23;

  // Table to contain panel selected row: LIQ DISTINTA
  //
  public static int PQRY_LIQDISTINTA1 = 1506;
  public static int PQRY_LIQDISTINTA1_RS = 1507;
  public static int PQSL_LIQDISTINTA1_LIFABUINFALI = 0;
  public static int PQSL_LIQDISTINTA1_LIQFATBUINFO = 1;
  public static int PQSL_LIQDISTINTA1_PROGRESSIVO = 2;
  public static int PQSL_LIQDISTINTA1_IMPORTO = 3;
  public static int PQSL_LIQDISTINTA1_ANNO_PROG_FAT = 4;
  public static int PQSL_LIQDISTINTA1_NUMERO_PROG_FAT = 5;
  public static int PQSL_LIQDISTINTA1_NUM_QUIETANZA = 6;
  public static int PQSL_LIQDISTINTA1_BENEFICIARIO = 7;
  public static int PQSL_LIQDISTINTA1_NUMERO_IMP = 8;
  public static int PQSL_LIQDISTINTA1_ANNO_IMP = 9;
  public static int PQSL_LIQDISTINTA1_NUMERO_SUBIMP = 10;
  public static int PQSL_LIQDISTINTA1_ANNO_SUBIMP = 11;
  public static int PQSL_LIQDISTINTA1_VOCE_ECONOMICA = 12;
  public static int PQSL_LIQDISTINTA1_CODICE_GESTIONALE = 13;
  public static int PQSL_LIQDISTINTA1_FINANZIAMENTO = 14;
  public static int PQSL_LIQDISTINTA1_FATTORE = 15;
  public static int PQSL_LIQDISTINTA1_CENTRO = 16;
  public static int PQSL_LIQDISTINTA1_LIQFATBUINIM = 17;
  public static int PQSL_LIQDISTINTA1_LIQFATBUINSU = 18;
  public static int PQSL_LIQDISTINTA1_DESCRIZIONE = 19;
  public static int PQSL_LIQDISTINTA1_ANNO_DISTINTA = 20;
  public static int PQSL_LIQDISTINTA1_NUMERO_DISTINTA = 21;
  public static int PQSL_LIQDISTINTA1_COMPETENZA_DAL = 22;
  public static int PQSL_LIQDISTINTA1_COMPETENZA_AL = 23;
  public static int PQSL_LIQDISTINTA1_UTENTE_INSERIMENTO = 24;
  public static int PQSL_LIQDISTINTA1_DATA_INSERIMENTO = 25;
  public static int PQSL_LIQDISTINTA1_UTENTE_ULTIMO_AGG = 26;
  public static int PQSL_LIQDISTINTA1_DATA_ULTIMO_AGG = 27;
  public static int PQSL_LIQDISTINTA1_LIQDISTISTAT = 28;
  public static int PQSL_LIQDISTINTA1_LIQDISINDAFA = 29;
  public static int PQSL_LIQDISTINTA1_CIG = 30;
  public static int PQSL_LIQDISTINTA1_CUP = 31;
  public static int PQSL_LIQDISTINTA1_LIFABUMOESCI = 32;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL4 = 1508;
  public static int PQSL_DEL4_ANNO_DEL = 0;
  public static int PQSL_DEL4_NUMERO_DEL = 1;
  public static int PQSL_DEL4_SEDE_DEL = 2;
  public static int PQSL_DEL4_DATA_DEL = 3;
  public static int PQSL_DEL4_DESCRIZIONE = 4;
  public static int PQSL_DEL4_TIPO_ESEC = 5;
  public static int PQSL_DEL4_NUMERO_APP = 6;
  public static int PQSL_DEL4_DATA_APP = 7;
  public static int PQSL_DEL4_D_DATA_DEL = 8;
  public static int PQSL_DEL4_D_DATA_APP = 9;
  public static int PQSL_DEL4_ANNO_PRO = 10;
  public static int PQSL_DEL4_NUMERO_PRO = 11;
  public static int PQSL_DEL4_UNITA_PRO = 12;
  public static int PQSL_DEL4_PROVVEDIMDEL = 13;
  public static int PQSL_DEL4_URLDOCUMENTO = 14;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL5 = 1509;
  public static int PQSL_DEL5_ANNO_DEL = 0;
  public static int PQSL_DEL5_NUMERO_DEL = 1;
  public static int PQSL_DEL5_SEDE_DEL = 2;
  public static int PQSL_DEL5_DESCRIZIONE = 3;
  public static int PQSL_DEL5_TIPO_ESEC = 4;
  public static int PQSL_DEL5_NUMERO_APP = 5;
  public static int PQSL_DEL5_DATA_APP = 6;
  public static int PQSL_DEL5_D_DATA_DEL = 7;
  public static int PQSL_DEL5_D_DATA_APP = 8;
  public static int PQSL_DEL5_ANNO_PRO = 9;
  public static int PQSL_DEL5_NUMERO_PRO = 10;
  public static int PQSL_DEL5_UNITA_PRO = 11;
  public static int PQSL_DEL5_URLDOCUMENTO = 12;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD8 = 1510;
  public static int PQSL_ORD8_CAPITOLO = 0;
  public static int PQSL_ORD8_ARTICOLO = 1;
  public static int PQSL_ORD8_ANNO_ACC = 2;
  public static int PQSL_ORD8_NUMERO_ACC = 3;
  public static int PQSL_ORD8_ANNO_ORD = 4;
  public static int PQSL_ORD8_NUMERO_ORD = 5;
  public static int PQSL_ORD8_TIPO_VINCOLO = 6;
  public static int PQSL_ORD8_BOLLO = 7;
  public static int PQSL_ORD8_ANNO_MAND_CO = 8;
  public static int PQSL_ORD8_NUMERO_MAND_CO = 9;
  public static int PQSL_ORD8_UFFICIO = 10;
  public static int PQSL_ORD8_VOCE_ECON = 11;
  public static int PQSL_ORD8_CODICE_FINANZ = 12;
  public static int PQSL_ORD8_D_DATA_ORD = 13;
  public static int PQSL_ORD8_ANNO_ELENCO = 14;
  public static int PQSL_ORD8_NUMERO_ELENCO = 15;
  public static int PQSL_ORD8_DATA_ELENCO = 16;
  public static int PQSL_ORD8_E = 17;
  public static int PQSL_ORD8_D_DATA_ELENCO = 18;
  public static int PQSL_ORD8_INCASSATO = 19;
  public static int PQSL_ORD8_IMPORTO = 20;
  public static int PQSL_ORD8_ANNO_MAND_CO_INPS = 21;
  public static int PQSL_ORD8_NUMERO_MAND_CO_INPS = 22;
  public static int PQSL_ORD8_ANNO_MAND_CO_INAIL = 23;
  public static int PQSL_ORD8_NUMERO_MAND_CO_INAIL = 24;
  public static int PQSL_ORD8_ANNO_MAND_CO_ADD_REG = 25;
  public static int PQSL_ORD8_NUMERO_MAND_CO_ADD_REG = 26;
  public static int PQSL_ORD8_ANNO_MAND_CO_ADD_COM = 27;
  public static int PQSL_ORD8_NUMERO_MAND_CO_ADD_COM = 28;
  public static int PQSL_ORD8_UTENTE_INSERIMENTO = 29;
  public static int PQSL_ORD8_DATA_INSERIMENTO = 30;
  public static int PQSL_ORD8_UTENTE_ULTIMO_AGG = 31;
  public static int PQSL_ORD8_DATA_ULTIMO_AGG = 32;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE4 = 1511;
  public static int PQSL_PRE4_CAPITOLO = 0;
  public static int PQSL_PRE4_ARTICOLO = 1;
  public static int PQSL_PRE4_ANNO_PRE = 2;
  public static int PQSL_PRE4_NUMERO_PRE = 3;
  public static int PQSL_PRE4_ANNO_ACC = 4;
  public static int PQSL_PRE4_NUMERO_ACC = 5;
  public static int PQSL_PRE4_DATA_REG = 6;
  public static int PQSL_PRE4_IMPORTO = 7;
  public static int PQSL_PRE4_DESCRIZIONE = 8;
  public static int PQSL_PRE4_DEBITORE = 9;
  public static int PQSL_PRE4_ANNO_DOC = 10;
  public static int PQSL_PRE4_NUMERO_DOC = 11;
  public static int PQSL_PRE4_CAUSALE = 12;
  public static int PQSL_PRE4_ANNO_ORD = 13;
  public static int PQSL_PRE4_NUMERO_ORD = 14;
  public static int PQSL_PRE4_NUMERO_INC = 15;
  public static int PQSL_PRE4_DATA_INC = 16;
  public static int PQSL_PRE4_IMPORTO_INC = 17;
  public static int PQSL_PRE4_DATA_ESTRATTO_CCP = 18;
  public static int PQSL_PRE4_DATA_CCP = 19;
  public static int PQSL_PRE4_CODICE_FINANZ = 20;
  public static int PQSL_PRE4_CODICE_PTC = 21;
  public static int PQSL_PRE4_NUM_QUIETANZA = 22;
  public static int PQSL_PRE4_E = 23;
  public static int PQSL_PRE4_FAT_ANNO_PROG = 24;
  public static int PQSL_PRE4_FAT_NUMERO_PROG = 25;
  public static int PQSL_PRE4_D_DATA_INC = 26;
  public static int PQSL_PRE4_D_DATA_ESTRATTO_CCP = 27;
  public static int PQSL_PRE4_D_DATA_CCP = 28;
  public static int PQSL_PRE4_NUMERO_CONTABILE = 29;
  public static int PQSL_PRE4_DATA_CONTABILE = 30;
  public static int PQSL_PRE4_PROGRESSIVO_TESO = 31;
  public static int PQSL_PRE4_CENTRO = 32;
  public static int PQSL_PRE4_FATTORE = 33;
  public static int PQSL_PRE4_COMPETENZA_DAL = 34;
  public static int PQSL_PRE4_COMPETENZA_AL = 35;
  public static int PQSL_PRE4_COD_IMP_ECO = 36;
  public static int PQSL_PRE4_PROGRESSIVO_CFA = 37;
  public static int PQSL_PRE4_ANNO_DISTINTA = 38;
  public static int PQSL_PRE4_NUMERO_DISTINTA = 39;
  public static int PQSL_PRE4_TIPO_DISTINTA = 40;
  public static int PQSL_PRE4_OPERA = 41;
  public static int PQSL_PRE4_SPESE = 42;
  public static int PQSL_PRE4_COMMISSIONI = 43;
  public static int PQSL_PRE4_ALLEGATI = 44;
  public static int PQSL_PRE4_INFO_TESORIERE = 45;
  public static int PQSL_PRE4_CODICE_GESTIONALE = 46;
  public static int PQSL_PRE4_UTENTE_INSERIMENTO = 47;
  public static int PQSL_PRE4_DATA_INSERIMENTO = 48;
  public static int PQSL_PRE4_UTENTE_ULTIMO_AGG = 49;
  public static int PQSL_PRE4_DATA_ULTIMO_AGG = 50;

  // Table to contain panel selected row: Debitore
  //
  public static int PQRY_DEBITORE2 = 1512;
  public static int PQRY_DEBITORE2_RS = 1513;
  public static int PQSL_DEBITORE2_DEBIRAGISOCI = 0;
  public static int PQSL_DEBITORE2_DEBITOCODICE = 1;

  // Table to contain panel selected row: Importo
  //
  public static int PQRY_IMPORTO2 = 1514;
  public static int PQRY_IMPORTO2_RS = 1515;
  public static int PQSL_IMPORTO2_IMPORTO = 0;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU4 = 1516;
  public static int PQSL_VISTABILANU4_ESERCIZIO = 0;
  public static int PQSL_VISTABILANU4_E_S = 1;
  public static int PQSL_VISTABILANU4_RISORSA_INTERVENTO = 2;
  public static int PQSL_VISTABILANU4_CAPITOLO = 3;
  public static int PQSL_VISTABILANU4_ARTICOLO = 4;
  public static int PQSL_VISTABILANU4_IMP_ACC_ULT_CHIUSO = 5;
  public static int PQSL_VISTABILANU4_IMP_ACC_ULT_CONS = 6;
  public static int PQSL_VISTABILANU4_IMP_ACC_ULT_SVIL = 7;
  public static int PQSL_VISTABILANU4_PREVISIONE = 8;
  public static int PQSL_VISTABILANU4_PREVISIONE_CONS = 9;
  public static int PQSL_VISTABILANU4_PREVISIONE_SVIL = 10;
  public static int PQSL_VISTABILANU4_STN_INI_CO = 11;
  public static int PQSL_VISTABILANU4_STN_INI_CO_CONS = 12;
  public static int PQSL_VISTABILANU4_STN_INI_CO_SVIL = 13;
  public static int PQSL_VISTABILANU4_VARIAZIONI_CO = 14;
  public static int PQSL_VISTABILANU4_VARIAZIONI_CO_CONS = 15;
  public static int PQSL_VISTABILANU4_VARIAZIONI_CO_SVIL = 16;
  public static int PQSL_VISTABILANU4_VAR_IMPEGNABILE = 17;
  public static int PQSL_VISTABILANU4_IMPEGNABILE = 18;
  public static int PQSL_VISTABILANU4_VIBIUOSTATTO = 19;
  public static int PQSL_VISTABILANU4_VIBIUOSTATCO = 20;
  public static int PQSL_VISTABILANU4_VIBIUOSTATSV = 21;
  public static int PQSL_VISTABILANU4_VIBIUOSTPRTO = 22;
  public static int PQSL_VISTABILANU4_VIBIUOSTPRCO = 23;
  public static int PQSL_VISTABILANU4_VIBIUOSTPRSV = 24;
  public static int PQSL_VISTABILANU4_VISBILUOIMAT = 25;
  public static int PQSL_VISTABILANU4_VIBIUOLAIMAC = 26;
  public static int PQSL_VISTABILANU4_VAR_PROVVISORIE = 27;
  public static int PQSL_VISTABILANU4_VAR_PROVVISORIE_CONS = 28;
  public static int PQSL_VISTABILANU4_VAR_PROVVISORIE_SVIL = 29;
  public static int PQSL_VISTABILANU4_IMP_ACC = 30;
  public static int PQSL_VISTABILANU4_IMP_ACC_CONS = 31;
  public static int PQSL_VISTABILANU4_IMP_ACC_SVIL = 32;
  public static int PQSL_VISTABILANU4_DISPONIBILITA = 33;
  public static int PQSL_VISTABILANU4_DISPONIBILITA_CONS = 34;
  public static int PQSL_VISTABILANU4_DISPONIBILITA_SVIL = 35;
  public static int PQSL_VISTABILANU4_MAN_ORD = 36;
  public static int PQSL_VISTABILANU4_MAN_ORD_COMP = 37;
  public static int PQSL_VISTABILANU4_MAN_ORD_RES = 38;
  public static int PQSL_VISTABILANU4_RESIDUI = 39;
  public static int PQSL_VISTABILANU4_LIQUIDAZIONI = 40;
  public static int PQSL_VISTABILANU4_LIQUIDAZIONI_COMP = 41;
  public static int PQSL_VISTABILANU4_LIQUIDAZIONI_RES = 42;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANU5 = 1517;
  public static int PQSL_VISTABILANU5_VISTBILUOCOD = 0;
  public static int PQSL_VISTABILANU5_VISTBILUODES = 1;
  public static int PQSL_VISTABILANU5_STN_INI_CO = 2;
  public static int PQSL_VISTABILANU5_VARIAZIONI_CO = 3;
  public static int PQSL_VISTABILANU5_VISBILUOSTDE = 4;
  public static int PQSL_VISTABILANU5_IMP_ACC = 5;
  public static int PQSL_VISTABILANU5_DISPONIBILITA = 6;

  // Table to contain panel selected row: VISTA BILANCIO UO
  //
  public static int PQRY_VISTABILANUO = 1518;
  public static int PQSL_VISTABILANUO_IMP_ACC = 0;
  public static int PQSL_VISTABILANUO_IMP_ACC_CONS = 1;
  public static int PQSL_VISTABILANUO_IMP_ACC_SVIL = 2;
  public static int PQSL_VISTABILANUO_IMP_NO_ATTO = 3;
  public static int PQSL_VISTABILANUO_IMP_CONS_NO_ATTO = 4;
  public static int PQSL_VISTABILANUO_IMP_SVIL_NO_ATTO = 5;
  public static int PQSL_VISTABILANUO_IMP_PREN_NO_ATTO = 6;
  public static int PQSL_VISTABILANUO_IMP_CONS_PREN_NO_ATTO = 7;
  public static int PQSL_VISTABILANUO_IMP_SVIL_PREN_NO_ATTO = 8;
  public static int PQSL_VISTABILANUO_IMP_DEFINITIVO = 9;
  public static int PQSL_VISTABILANUO_IMP_CONS_DEFINITIVO = 10;
  public static int PQSL_VISTABILANUO_IMP_SVIL_DEFINITIVO = 11;
  public static int PQSL_VISTABILANUO_IMP_PREN_DEFINITIVO = 12;
  public static int PQSL_VISTABILANUO_IMP_CONS_PREN_DEFINITIVO = 13;
  public static int PQSL_VISTABILANUO_IMP_SVIL_PREN_DEFINITIVO = 14;
  public static int PQSL_VISTABILANUO_IMP_PRENOTATI = 15;
  public static int PQSL_VISTABILANUO_IMP_CONS_PRENOTATI = 16;
  public static int PQSL_VISTABILANUO_IMP_SVIL_PRENOTATI = 17;
  public static int PQSL_VISTABILANUO_IMP_OBBLIGATORI = 18;
  public static int PQSL_VISTABILANUO_IMP_CONS_OBBLIGATORI = 19;
  public static int PQSL_VISTABILANUO_IMP_SVIL_OBBLIGATORI = 20;
  public static int PQSL_VISTABILANUO_IMP_ESECUTIVI = 21;
  public static int PQSL_VISTABILANUO_IMP_CONS_ESECUTIVI = 22;
  public static int PQSL_VISTABILANUO_IMP_SVIL_ESECUTIVI = 23;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP23 = 1519;
  public static int PQSL_CAP23_ESERCIZIO = 0;
  public static int PQSL_CAP23_RISORSA_INTERVENTO = 1;
  public static int PQSL_CAP23_CAPITOLO = 2;
  public static int PQSL_CAP23_ARTICOLO = 3;
  public static int PQSL_CAP23_DESCRIZIONE = 4;
  public static int PQSL_CAP23_TITOLO = 5;
  public static int PQSL_CAP23_CATEGORIA = 6;
  public static int PQSL_CAP23_VOCE_ECON = 7;
  public static int PQSL_CAP23_FUNZIONE = 8;
  public static int PQSL_CAP23_SERVIZIO = 9;
  public static int PQSL_CAP23_CENTRO_COSTO = 10;
  public static int PQSL_CAP23_COD_INTERVENTO = 11;
  public static int PQSL_CAP23_COD_TERZI = 12;
  public static int PQSL_CAP23_UNA_TANTUM = 13;
  public static int PQSL_CAP23_TIPO_VINCOLO = 14;
  public static int PQSL_CAP23_IVA = 15;
  public static int PQSL_CAP23_PROGETTO = 16;
  public static int PQSL_CAP23_PROGRAMMA = 17;
  public static int PQSL_CAP23_SETTORE_OPERATIVO = 18;
  public static int PQSL_CAP23_SERVIZIO_OPERATIVO = 19;
  public static int PQSL_CAP23_RESPONSABILE = 20;
  public static int PQSL_CAP23_CONTROLLO_BUDGET = 21;
  public static int PQSL_CAP23_FUNZ_DEL = 22;
  public static int PQSL_CAP23_CONTRIB_COMU = 23;
  public static int PQSL_CAP23_PERC_CONTROLLO = 24;
  public static int PQSL_CAP23_RISORSA_SIGNIF = 25;
  public static int PQSL_CAP23_E_S = 26;
  public static int PQSL_CAP23_FLESSIBILITA = 27;
  public static int PQSL_CAP23_CAPCODMONITO = 28;
  public static int PQSL_CAP23_FATTORE = 29;
  public static int PQSL_CAP23_CENTRO = 30;
  public static int PQSL_CAP23_CAPLABRISINT = 31;
  public static int PQSL_CAP23_CAPCAPITOLO = 32;
  public static int PQSL_CAP23_CAPRISORINTE = 33;
  public static int PQSL_CAP23_CAPCAPTEDESC = 34;
  public static int PQSL_CAP23_CAPCATEGDESC = 35;
  public static int PQSL_CAP23_CAPFUNZIDESC = 36;
  public static int PQSL_CAP23_CAPINTERDESC = 37;
  public static int PQSL_CAP23_CAPPROGRDESC = 38;
  public static int PQSL_CAP23_CAPPROGEDESC = 39;
  public static int PQSL_CAP23_CAPVOCECODES = 40;
  public static int PQSL_CAP23_CAPTITOLDESC = 41;
  public static int PQSL_CAP23_CAPSERVIDESC = 42;
  public static int PQSL_CAP23_CAPVINCODESC = 43;
  public static int PQSL_CAP23_CAPCENTRDESC = 44;
  public static int PQSL_CAP23_CAPFATTODESC = 45;
  public static int PQSL_CAP23_CAPCODICE = 46;
  public static int PQSL_CAP23_CAPLABCODGES = 47;
  public static int PQSL_CAP23_CODICE_GESTIONALE = 48;
  public static int PQSL_CAP23_CAPFLESSDESC = 49;
  public static int PQSL_CAP23_CAPCODGESDES = 50;
  public static int PQSL_CAP23_CAPUOUTILIZZ = 51;

  // Table to contain panel selected row: Dati Sessione
  //
  public static int PQRY_DATISESSION1 = 1520;
  public static int PQRY_DATISESSION1_RS = 1521;
  public static int PQSL_DATISESSION1_SESSIOESERCI = 0;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO22 = 1522;
  public static int PQSL_NOTEFUNZIO22_MODULO = 0;
  public static int PQSL_NOTEFUNZIO22_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO22_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO22_DESCRIZIONE = 3;

  // Table to contain panel selected row: Dati Sessione
  //
  public static int PQRY_DATISESSION3 = 1523;
  public static int PQRY_DATISESSION3_RS = 1524;
  public static int PQSL_DATISESSION3_SESSIOUFFICI = 0;

  // Table to contain panel selected row: BIL SCHEMA STRUTTURA
  //
  public static int PQRY_BILSCHEMSTR1 = 1525;
  public static int PQSL_BILSCHEMSTR1_SCHEMA_STRUTTURA_ID = 0;
  public static int PQSL_BILSCHEMSTR1_E_S = 1;
  public static int PQSL_BILSCHEMSTR1_LIVELLO = 2;
  public static int PQSL_BILSCHEMSTR1_DESCRIZIONE = 3;
  public static int PQSL_BILSCHEMSTR1_SE_CHIAVE = 4;
  public static int PQSL_BILSCHEMSTR1_FORMATO = 5;
  public static int PQSL_BILSCHEMSTR1_DESCRIZIONE_LIVELLO = 6;
  public static int PQSL_BILSCHEMSTR1_UTENTE_INSERIMENTO = 7;
  public static int PQSL_BILSCHEMSTR1_DATA_INSERIMENTO = 8;
  public static int PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_BILSCHEMSTR1_DATA_ULTIMO_AGG = 10;
  public static int PQSL_BILSCHEMSTR1_ESERCIZIO = 11;

  // Table to contain panel selected row: BIL SCHEMA STRUTTURA
  //
  public static int PQRY_BILSCHEMSTRU = 1526;
  public static int PQSL_BILSCHEMSTRU_SCHEMA_STRUTTURA_ID = 0;
  public static int PQSL_BILSCHEMSTRU_E_S = 1;
  public static int PQSL_BILSCHEMSTRU_LIVELLO = 2;
  public static int PQSL_BILSCHEMSTRU_DESCRIZIONE = 3;
  public static int PQSL_BILSCHEMSTRU_SE_CHIAVE = 4;
  public static int PQSL_BILSCHEMSTRU_FORMATO = 5;
  public static int PQSL_BILSCHEMSTRU_DESCRIZIONE_LIVELLO = 6;
  public static int PQSL_BILSCHEMSTRU_UTENTE_INSERIMENTO = 7;
  public static int PQSL_BILSCHEMSTRU_DATA_INSERIMENTO = 8;
  public static int PQSL_BILSCHEMSTRU_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_BILSCHEMSTRU_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI1 = 1527;
  public static int PQSL_VISTASTRUBI1_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI1_E_S = 1;
  public static int PQSL_VISTASTRUBI1_HASH = 2;
  public static int PQSL_VISTASTRUBI1_ICON = 3;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI2 = 1528;
  public static int PQSL_VISTASTRUBI2_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI2_CODICE_GERARCHIA = 1;
  public static int PQSL_VISTASTRUBI2_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI2_HASH = 3;
  public static int PQSL_VISTASTRUBI2_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI3 = 1529;
  public static int PQSL_VISTASTRUBI3_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI3_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI3_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI3_CODICE = 3;
  public static int PQSL_VISTASTRUBI3_HASH = 4;
  public static int PQSL_VISTASTRUBI3_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI4 = 1530;
  public static int PQSL_VISTASTRUBI4_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI4_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI4_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI4_HASH = 3;
  public static int PQSL_VISTASTRUBI4_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI5 = 1531;
  public static int PQSL_VISTASTRUBI5_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI5_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI5_CODICE = 2;
  public static int PQSL_VISTASTRUBI5_ORDERBY = 3;
  public static int PQSL_VISTASTRUBI5_HASH = 4;
  public static int PQSL_VISTASTRUBI5_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI6 = 1532;
  public static int PQSL_VISTASTRUBI6_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI6_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI6_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI6_HASH = 3;
  public static int PQSL_VISTASTRUBI6_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI7 = 1533;
  public static int PQSL_VISTASTRUBI7_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI7_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI7_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI7_CODICE = 3;
  public static int PQSL_VISTASTRUBI7_HASH = 4;
  public static int PQSL_VISTASTRUBI7_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI8 = 1534;
  public static int PQSL_VISTASTRUBI8_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI8_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI8_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI8_HASH = 3;
  public static int PQSL_VISTASTRUBI8_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBI9 = 1535;
  public static int PQSL_VISTASTRUBI9_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBI9_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBI9_ORDERBY = 2;
  public static int PQSL_VISTASTRUBI9_CODICE = 3;
  public static int PQSL_VISTASTRUBI9_HASH = 4;
  public static int PQSL_VISTASTRUBI9_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUB10 = 1536;
  public static int PQSL_VISTASTRUB10_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUB10_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUB10_ORDERBY = 2;
  public static int PQSL_VISTASTRUB10_HASH = 3;
  public static int PQSL_VISTASTRUB10_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUB11 = 1537;
  public static int PQSL_VISTASTRUB11_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUB11_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUB11_ORDERBY = 2;
  public static int PQSL_VISTASTRUB11_CODICE = 3;
  public static int PQSL_VISTASTRUB11_HASH = 4;
  public static int PQSL_VISTASTRUB11_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUB12 = 1538;
  public static int PQSL_VISTASTRUB12_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUB12_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUB12_ORDERBY = 2;
  public static int PQSL_VISTASTRUB12_HASH = 3;
  public static int PQSL_VISTASTRUB12_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUB13 = 1539;
  public static int PQSL_VISTASTRUB13_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUB13_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUB13_ORDERBY = 2;
  public static int PQSL_VISTASTRUB13_CODICE = 3;
  public static int PQSL_VISTASTRUB13_HASH = 4;
  public static int PQSL_VISTASTRUB13_ICON = 5;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUB14 = 1540;
  public static int PQSL_VISTASTRUB14_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUB14_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUB14_ORDERBY = 2;
  public static int PQSL_VISTASTRUB14_HASH = 3;
  public static int PQSL_VISTASTRUB14_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA BIL
  //
  public static int PQRY_VISTASTRUBIL = 1541;
  public static int PQSL_VISTASTRUBIL_DESCR_RAMO = 0;
  public static int PQSL_VISTASTRUBIL_REVISTBICOGE = 1;
  public static int PQSL_VISTASTRUBIL_ORDERBY = 2;
  public static int PQSL_VISTASTRUBIL_HASH = 3;

  // Recordset for query: Codici Livelli STACK
  //
  public static int QRY_CODILIVESTA1 = 1542;
  public static int QSL_CODILIVESTA1_NOMEOGGEPROG = 0;
  public static int QSL_CODILIVESTA1_NOMEOGGECODI = 1;

  // Table to contain panel selected row: BIL STRUTTURA
  //
  public static int PQRY_BILSTRUTTUR2 = 1543;
  public static int PQSL_BILSTRUTTUR2_STRUTTURA_ID = 0;
  public static int PQSL_BILSTRUTTUR2_SCHEMA_STRUTTURA_ID = 1;
  public static int PQSL_BILSTRUTTUR2_VALORE = 2;
  public static int PQSL_BILSTRUTTUR2_DESCRIZIONE = 3;
  public static int PQSL_BILSTRUTTUR2_SE_CAPITOLI = 4;
  public static int PQSL_BILSTRUTTUR2_SE_TRASPARENTE = 5;
  public static int PQSL_BILSTRUTTUR2_UTENTE_INSERIMENTO = 6;
  public static int PQSL_BILSTRUTTUR2_DATA_INSERIMENTO = 7;
  public static int PQSL_BILSTRUTTUR2_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_BILSTRUTTUR2_DATA_ULTIMO_AGG = 9;
  public static int PQSL_BILSTRUTTUR2_E_S = 10;
  public static int PQSL_BILSTRUTTUR2_LIVELLO = 11;
  public static int PQSL_BILSTRUTTUR2_CODICE_PADRE_GERARCHIA = 12;
  public static int PQSL_BILSTRUTTUR2_CODICE = 13;
  public static int PQSL_BILSTRUTTUR2_CODICE_GERARCHIA = 14;
  public static int PQSL_BILSTRUTTUR2_ESERCIZIO = 15;
  public static int PQSL_BILSTRUTTUR2_CONTABILITA_SPECIALI = 16;
  public static int PQSL_BILSTRUTTUR2_TIPO_SPESA = 17;
  public static int PQSL_BILSTRUTTUR2_ESCLUSIONE_12 = 18;

  // Table to contain panel selected row: TIPI RICLASSIFICAZIONE
  //
  public static int PQRY_TIPIRICLASS1 = 1544;
  public static int PQSL_TIPIRICLASS1_CODICE = 0;
  public static int PQSL_TIPIRICLASS1_DESCRIZIONE = 1;
  public static int PQSL_TIPIRICLASS1_TIPO_RICL_ID = 2;
  public static int PQSL_TIPIRICLASS1_ESERCIZIO_SCADENZA = 3;

  // Table to contain panel selected row: TIPI RICLASSIFICAZIONE
  //
  public static int PQRY_TIPIRICLASSI = 1545;
  public static int PQSL_TIPIRICLASSI_RECORDCODICE = 0;
  public static int PQSL_TIPIRICLASSI_RECORDDESCRI = 1;
  public static int PQSL_TIPIRICLASSI_RECTIPRIESSC = 2;
  public static int PQSL_TIPIRICLASSI_RETIRITIRIID = 3;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS18 = 1546;
  public static int PQRY_PARS18_RS = 1547;
  public static int PQSL_PARS18_NOMOGGTIPRIC = 0;

  // Table to contain panel selected row: SCHEMA RICLASSIFICAZIONE
  //
  public static int PQRY_SCHEMARICLAS = 1548;
  public static int PQSL_SCHEMARICLAS_E_S = 0;
  public static int PQSL_SCHEMARICLAS_SCHEMA_RICL_ID = 1;
  public static int PQSL_SCHEMARICLAS_LIVELLO = 2;
  public static int PQSL_SCHEMARICLAS_DESCRIZIONE = 3;
  public static int PQSL_SCHEMARICLAS_DESCRIZIONE_LIVELLO = 4;
  public static int PQSL_SCHEMARICLAS_UTENTE_INSERIMENTO = 5;
  public static int PQSL_SCHEMARICLAS_DATA_INSERIMENTO = 6;
  public static int PQSL_SCHEMARICLAS_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_SCHEMARICLAS_DATA_ULTIMO_AGG = 8;
  public static int PQSL_SCHEMARICLAS_TIPO_RICL_ID = 9;
  public static int PQSL_SCHEMARICLAS_FORMATO = 10;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS20 = 1549;
  public static int PQRY_PARS20_RS = 1550;
  public static int PQSL_PARS20_NOMOGGTIPRIC = 0;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR1 = 1551;
  public static int PQSL_VISSTRRICAR1_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR1_RECORDES = 1;
  public static int PQSL_VISSTRRICAR1_HASH = 2;
  public static int PQSL_VISSTRRICAR1_ICON = 3;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR2 = 1552;
  public static int PQSL_VISSTRRICAR2_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR2_RECORDES = 1;
  public static int PQSL_VISSTRRICAR2_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR2_HASH = 3;
  public static int PQSL_VISSTRRICAR2_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR3 = 1553;
  public static int PQSL_VISSTRRICAR3_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR3_RECORDES = 1;
  public static int PQSL_VISSTRRICAR3_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR3_HASH = 3;
  public static int PQSL_VISSTRRICAR3_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR4 = 1554;
  public static int PQSL_VISSTRRICAR4_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR4_RECORDES = 1;
  public static int PQSL_VISSTRRICAR4_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR4_HASH = 3;
  public static int PQSL_VISSTRRICAR4_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR5 = 1555;
  public static int PQSL_VISSTRRICAR5_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR5_RECORDES = 1;
  public static int PQSL_VISSTRRICAR5_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR5_HASH = 3;
  public static int PQSL_VISSTRRICAR5_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR6 = 1556;
  public static int PQSL_VISSTRRICAR6_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR6_RECORDES = 1;
  public static int PQSL_VISSTRRICAR6_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR6_HASH = 3;
  public static int PQSL_VISSTRRICAR6_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR7 = 1557;
  public static int PQSL_VISSTRRICAR7_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR7_RECORDES = 1;
  public static int PQSL_VISSTRRICAR7_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR7_HASH = 3;
  public static int PQSL_VISSTRRICAR7_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR8 = 1558;
  public static int PQSL_VISSTRRICAR8_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR8_RECORDES = 1;
  public static int PQSL_VISSTRRICAR8_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR8_HASH = 3;
  public static int PQSL_VISSTRRICAR8_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICAR9 = 1559;
  public static int PQSL_VISSTRRICAR9_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICAR9_RECORDES = 1;
  public static int PQSL_VISSTRRICAR9_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICAR9_HASH = 3;
  public static int PQSL_VISSTRRICAR9_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICA10 = 1560;
  public static int PQSL_VISSTRRICA10_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICA10_RECORDES = 1;
  public static int PQSL_VISSTRRICA10_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICA10_HASH = 3;
  public static int PQSL_VISSTRRICA10_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICA11 = 1561;
  public static int PQSL_VISSTRRICA11_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICA11_RECORDES = 1;
  public static int PQSL_VISSTRRICA11_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICA11_HASH = 3;
  public static int PQSL_VISSTRRICA11_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICA12 = 1562;
  public static int PQSL_VISSTRRICA12_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICA12_RECORDES = 1;
  public static int PQSL_VISSTRRICA12_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICA12_HASH = 3;
  public static int PQSL_VISSTRRICA12_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICA13 = 1563;
  public static int PQSL_VISSTRRICA13_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICA13_RECORDES = 1;
  public static int PQSL_VISSTRRICA13_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICA13_HASH = 3;
  public static int PQSL_VISSTRRICA13_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICA14 = 1564;
  public static int PQSL_VISSTRRICA14_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICA14_RECORDES = 1;
  public static int PQSL_VISSTRRICA14_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICA14_HASH = 3;
  public static int PQSL_VISSTRRICA14_ICON = 4;

  // Table to contain panel selected row: VISTA STRUTTURA RICL ARM
  //
  public static int PQRY_VISSTRRICARM = 1565;
  public static int PQSL_VISSTRRICARM_RECODESCRAMO = 0;
  public static int PQSL_VISSTRRICARM_RECORDES = 1;
  public static int PQSL_VISSTRRICARM_RECORDCODICE = 2;
  public static int PQSL_VISSTRRICARM_HASH = 3;
  public static int PQSL_VISSTRRICARM_ICON = 4;

  // Table to contain panel selected row: STRUTTURA RICLASSIFICAZIONE
  //
  public static int PQRY_STRUTTRICLAS = 1566;
  public static int PQSL_STRUTTRICLAS_STRUTTURA_RICL_ID = 0;
  public static int PQSL_STRUTTRICLAS_TIPO_RICL_ID = 1;
  public static int PQSL_STRUTTRICLAS_SCHEMA_RICL_ID = 2;
  public static int PQSL_STRUTTRICLAS_E_S = 3;
  public static int PQSL_STRUTTRICLAS_LIVELLO = 4;
  public static int PQSL_STRUTTRICLAS_SE_CAPITOLI = 5;
  public static int PQSL_STRUTTRICLAS_UTENTE_INSERIMENTO = 6;
  public static int PQSL_STRUTTRICLAS_DATA_INSERIMENTO = 7;
  public static int PQSL_STRUTTRICLAS_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_STRUTTRICLAS_DATA_ULTIMO_AGG = 9;
  public static int PQSL_STRUTTRICLAS_CODICE_PADRE = 10;
  public static int PQSL_STRUTTRICLAS_VALORE = 11;
  public static int PQSL_STRUTTRICLAS_DESCRIZIONE = 12;
  public static int PQSL_STRUTTRICLAS_CODICE = 13;
  public static int PQSL_STRUTTRICLAS_CONTROPARTITA = 14;
  public static int PQSL_STRUTTRICLAS_IMP_ECO_IMPACC = 15;
  public static int PQSL_STRUTTRICLAS_SIFAKE = 16;
  public static int PQSL_STRUTTRICLAS_ESCLUSIONE_12 = 17;

  // Table to contain panel selected row: PROGRAMMI COFOG
  //
  public static int PQRY_PROGRAMCOFOG = 1567;
  public static int PQSL_PROGRAMCOFOG_PROGRAMMA = 0;
  public static int PQSL_PROGRAMCOFOG_COFOG = 1;

  // Table to contain panel selected row: TIPI CODICE
  //
  public static int PQRY_TIPICODICE2 = 1568;
  public static int PQSL_TIPICODICE2_TIPO = 0;
  public static int PQSL_TIPICODICE2_DESCRIZIONE = 1;
  public static int PQSL_TIPICODICE2_ACRONIMO = 2;

  // Table to contain panel selected row: VALORI TIPI CODICE
  //
  public static int PQRY_VALOTIPICOD2 = 1569;
  public static int PQSL_VALOTIPICOD2_TIPO_CODICE = 0;
  public static int PQSL_VALOTIPICOD2_CODICE = 1;
  public static int PQSL_VALOTIPICOD2_DESCRIZIONE = 2;

  // Table to contain panel selected row: VALORI CONTROLLO CODICI
  //
  public static int PQRY_VALOCONTCOD2 = 1570;
  public static int PQRY_VALOCONTCOD2_RS = 1571;
  public static int PQSL_VALOCONTCOD2_CODICE_CONTROLLO = 0;
  public static int PQSL_VALOCONTCOD2_VACOCOVACOVL = 1;
  public static int PQSL_VALOCONTCOD2_TIPO_CODICE = 2;
  public static int PQSL_VALOCONTCOD2_VALORE_CODICE = 3;
  public static int PQSL_VALOCONTCOD2_VALORE_CONTROLLO = 4;
  public static int PQSL_VALOCONTCOD2_VALCONCOINAG = 5;

  // Table to contain panel selected row: CODICI GESTIONALI
  //
  public static int PQRY_CODICIGESTI1 = 1572;
  public static int PQSL_CODICIGESTI1_E_S = 0;
  public static int PQSL_CODICIGESTI1_CODICE = 1;
  public static int PQSL_CODICIGESTI1_DESCRIZIONE = 2;
  public static int PQSL_CODICIGESTI1_SCADENZA = 3;
  public static int PQSL_CODICIGESTI1_UTENTE_INSERIMENTO = 4;
  public static int PQSL_CODICIGESTI1_DATA_INSERIMENTO = 5;
  public static int PQSL_CODICIGESTI1_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_CODICIGESTI1_DATA_ULTIMO_AGG = 7;

  // Table to contain panel selected row: CODICI GESTIONALI
  //
  public static int PQRY_CODICIGESTI3 = 1573;
  public static int PQSL_CODICIGESTI3_E_S = 0;
  public static int PQSL_CODICIGESTI3_CODICE = 1;
  public static int PQSL_CODICIGESTI3_DESCRIZIONE = 2;
  public static int PQSL_CODICIGESTI3_SCADENZA = 3;

  // Table to contain panel selected row: TIPI MOTIVAZIONE
  //
  public static int PQRY_TIPIMOTIVAZ4 = 1574;
  public static int PQSL_TIPIMOTIVAZ4_CODICE = 0;
  public static int PQSL_TIPIMOTIVAZ4_DESCRIZIONE = 1;
  public static int PQSL_TIPIMOTIVAZ4_TIPO_IMPORTO = 2;
  public static int PQSL_TIPIMOTIVAZ4_PARTE = 3;
  public static int PQSL_TIPIMOTIVAZ4_TIPO_QUADRATURA = 4;
  public static int PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG = 5;
  public static int PQSL_TIPIMOTIVAZ4_QUADRATURA_OBBLIG_CASSA = 6;

  // Table to contain panel selected row: T54
  //
  public static int PQRY_T80 = 1575;
  public static int PQSL_T80_CODICE = 0;
  public static int PQSL_T80_DESCRIZIONE = 1;
  public static int PQSL_T80_TIPOLOGIA = 2;
  public static int PQSL_T80_UTENTE_INSERIMENTO = 3;
  public static int PQSL_T80_DATA_INSERIMENTO = 4;
  public static int PQSL_T80_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_T80_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: T54
  //
  public static int PQRY_T67 = 1576;
  public static int PQSL_T67_CODICE = 0;
  public static int PQSL_T67_DESCRIZIONE = 1;
  public static int PQSL_T67_TIPOLOGIA = 2;
  public static int PQSL_T67_UTENTE_INSERIMENTO = 3;
  public static int PQSL_T67_DATA_INSERIMENTO = 4;
  public static int PQSL_T67_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_T67_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME21 = 1577;
  public static int PQSL_FINANZIAME21_CODICE = 0;
  public static int PQSL_FINANZIAME21_DESCRIZIONE = 1;
  public static int PQSL_FINANZIAME21_ENTE = 2;
  public static int PQSL_FINANZIAME21_NUMERO_MUTUO = 3;
  public static int PQSL_FINANZIAME21_ANNO_MUTUO = 4;
  public static int PQSL_FINANZIAME21_IMPORTO_ORIG = 5;
  public static int PQSL_FINANZIAME21_CATEGORIA = 6;
  public static int PQSL_FINANZIAME21_TIPO_DURATA = 7;
  public static int PQSL_FINANZIAME21_COD_ALLEGATO = 8;
  public static int PQSL_FINANZIAME21_COD_FIN_DISAV = 9;
  public static int PQSL_FINANZIAME21_NOTE = 10;
  public static int PQSL_FINANZIAME21_DIPARTIMENTO = 11;
  public static int PQSL_FINANZIAME21_LEGGE_REG = 12;
  public static int PQSL_FINANZIAME21_CAPITOLO_REG = 13;
  public static int PQSL_FINANZIAME21_ATTO_ASS = 14;
  public static int PQSL_FINANZIAME21_UTENTE_INSERIMENTO = 15;
  public static int PQSL_FINANZIAME21_SCADENZA = 16;
  public static int PQSL_FINANZIAME21_REND_AL_MEF = 17;
  public static int PQSL_FINANZIAME21_DATA_INSERIMENTO = 18;

  // Table to contain panel selected row: FINANZIAMENTI UO
  //
  public static int PQRY_FINANZIAMEUO = 1578;
  public static int PQSL_FINANZIAMEUO_PROGRESSIVO = 0;
  public static int PQSL_FINANZIAMEUO_PROGR_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_FINANZIAMEUO_UTENTE_INSERIMENTO = 2;
  public static int PQSL_FINANZIAMEUO_DATA_INSERIMENTO = 3;
  public static int PQSL_FINANZIAMEUO_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_FINANZIAMEUO_DATA_ULTIMO_AGG = 5;
  public static int PQSL_FINANZIAMEUO_FINANZIAMENTO = 6;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAME27 = 1579;
  public static int PQSL_FINANZIAME27_FINANZCODICE = 0;
  public static int PQSL_FINANZIAME27_FINANZDESCRI = 1;
  public static int PQSL_FINANZIAME27_FINANZIAENTE = 2;
  public static int PQSL_FINANZIAME27_FINNUMANNMUT = 3;
  public static int PQSL_FINANZIAME27_FINAANNOMUTU = 4;
  public static int PQSL_FINANZIAME27_FINAIMPOORIG = 5;
  public static int PQSL_FINANZIAME27_FINANZCATEGO = 6;
  public static int PQSL_FINANZIAME27_FINANZDURATA = 7;
  public static int PQSL_FINANZIAME27_FINAALLALPEG = 8;
  public static int PQSL_FINANZIAME27_FINAFINADISA = 9;
  public static int PQSL_FINANZIAME27_FINANZIANOTE = 10;
  public static int PQSL_FINANZIAME27_FINANZDIPART = 11;
  public static int PQSL_FINANZIAME27_FINALEGGREGI = 12;
  public static int PQSL_FINANZIAME27_FINACAPIREGI = 13;
  public static int PQSL_FINANZIAME27_FINAATTOASSE = 14;
  public static int PQSL_FINANZIAME27_FINAUTENINSE = 15;
  public static int PQSL_FINANZIAME27_FINANZSCADEN = 16;
  public static int PQSL_FINANZIAME27_FINCATFINCOD = 17;
  public static int PQSL_FINANZIAME27_FINANZDESCR1 = 18;
  public static int PQSL_FINANZIAME27_FINANT69CODI = 19;
  public static int PQSL_FINANZIAME27_FINT69DESABB = 20;
  public static int PQSL_FINANZIAME27_FINADISACODI = 21;
  public static int PQSL_FINANZIAME27_FINANZDESCR2 = 22;
  public static int PQSL_FINANZIAME27_FINBENRAGSOC = 23;

  // Table to contain panel selected row: OPERE
  //
  public static int PQRY_OPERE1 = 1580;
  public static int PQSL_OPERE1_CODICE = 0;
  public static int PQSL_OPERE1_DESCRIZIONE = 1;
  public static int PQSL_OPERE1_CATEGORIA = 2;
  public static int PQSL_OPERE1_NOTE = 3;
  public static int PQSL_OPERE1_UTENTE_INSERIMENTO = 4;
  public static int PQSL_OPERE1_SCADENZA = 5;
  public static int PQSL_OPERE1_CUP = 6;
  public static int PQSL_OPERE1_REALE = 7;
  public static int PQSL_OPERE1_PROG_TRIENNALE = 8;
  public static int PQSL_OPERE1_ELENCO_ANNUALE = 9;
  public static int PQSL_OPERE1_NUMERO_PPI = 10;
  public static int PQSL_OPERE1_ANNO_PPI = 11;
  public static int PQSL_OPERE1_PROGETTO_ID = 12;
  public static int PQSL_OPERE1_COD_OPERA_PBM = 13;
  public static int PQSL_OPERE1_DATA_INSERIMENTO = 14;

  // Table to contain panel selected row: OPERA
  //
  public static int PQRY_OPERA3 = 1581;
  public static int PQSL_OPERA3_PROGRESSIVO = 0;
  public static int PQSL_OPERA3_PROGR_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_OPERA3_UTENTE_INSERIMENTO = 2;
  public static int PQSL_OPERA3_DATA_INSERIMENTO = 3;
  public static int PQSL_OPERA3_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_OPERA3_DATA_ULTIMO_AGG = 5;
  public static int PQSL_OPERA3_OPERA = 6;

  // Table to contain panel selected row: OPERE
  //
  public static int PQRY_OPERE4 = 1582;
  public static int PQSL_OPERE4_OPERECODICE = 0;
  public static int PQSL_OPERE4_OPEREDESCRIZ = 1;
  public static int PQSL_OPERE4_OPERECATEGOR = 2;
  public static int PQSL_OPERE4_OPERENOTE = 3;
  public static int PQSL_OPERE4_OPERUTENINSE = 4;
  public static int PQSL_OPERE4_OPERESCADENZ = 5;
  public static int PQSL_OPERE4_OPECATFINCOD = 6;
  public static int PQSL_OPERE4_OPEREDESCRI1 = 7;
  public static int PQSL_OPERE4_OPERENUMEPPI = 8;
  public static int PQSL_OPERE4_OPEREANNOPPI = 9;
  public static int PQSL_OPERE4_OPERECUP = 10;
  public static int PQSL_OPERE4_OPEREPROGEID = 11;
  public static int PQSL_OPERE4_OPEREREALE = 12;
  public static int PQSL_OPERE4_OPERPROGTRIE = 13;
  public static int PQSL_OPERE4_OPERELENANNU = 14;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM11 = 1583;
  public static int PQRY_PARAM11_RS = 1584;
  public static int PQSL_PARAM11_PARTIPOCONTR = 0;
  public static int PQSL_PARAM11_PARPROGRUNIT = 1;
  public static int PQSL_PARAM11_PARANCHEESAU = 2;

  // Table to contain panel selected row: FINANZIAMENTI
  //
  public static int PQRY_FINANZIAMEN1 = 1585;
  public static int PQSL_FINANZIAMEN1_FINANZCODICE = 0;
  public static int PQSL_FINANZIAMEN1_FINANZDESCRI = 1;
  public static int PQSL_FINANZIAMEN1_FINANZIAENTE = 2;
  public static int PQSL_FINANZIAMEN1_FINNUMANNMUT = 3;
  public static int PQSL_FINANZIAMEN1_FINAANNOMUTU = 4;
  public static int PQSL_FINANZIAMEN1_FINAIMPOORIG = 5;
  public static int PQSL_FINANZIAMEN1_FINANZCATEGO = 6;
  public static int PQSL_FINANZIAMEN1_FINANZDURATA = 7;
  public static int PQSL_FINANZIAMEN1_FINAALLALPEG = 8;
  public static int PQSL_FINANZIAMEN1_FINAFINADISA = 9;
  public static int PQSL_FINANZIAMEN1_FINANZIANOTE = 10;
  public static int PQSL_FINANZIAMEN1_FINANZDIPART = 11;
  public static int PQSL_FINANZIAMEN1_FINALEGGREGI = 12;
  public static int PQSL_FINANZIAMEN1_FINACAPIREGI = 13;
  public static int PQSL_FINANZIAMEN1_FINAATTOASSE = 14;
  public static int PQSL_FINANZIAMEN1_FINAUTENINSE = 15;
  public static int PQSL_FINANZIAMEN1_FINANZSCADEN = 16;
  public static int PQSL_FINANZIAMEN1_FINANDESCRUO = 17;

  // Table to contain panel selected row: TITOLI
  //
  public static int PQRY_TITOLI7 = 1586;
  public static int PQSL_TITOLI7_E_S = 0;
  public static int PQSL_TITOLI7_TITOLO = 1;
  public static int PQSL_TITOLI7_DESCRIZIONE = 2;
  public static int PQSL_TITOLI7_UTENTE_INSERIMENTO = 3;
  public static int PQSL_TITOLI7_DATA_INSERIMENTO = 4;
  public static int PQSL_TITOLI7_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_TITOLI7_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: CATEGORIE
  //
  public static int PQRY_CATEGORIE1 = 1587;
  public static int PQSL_CATEGORIE1_TITOLO = 0;
  public static int PQSL_CATEGORIE1_CATEGORIA = 1;
  public static int PQSL_CATEGORIE1_DESCRIZIONE = 2;
  public static int PQSL_CATEGORIE1_E = 3;
  public static int PQSL_CATEGORIE1_SUDDIVISIONE_CERT_BIL = 4;
  public static int PQSL_CATEGORIE1_SUDDIVISIONE_CC = 5;
  public static int PQSL_CATEGORIE1_SUDDIVISIONE_PC = 6;
  public static int PQSL_CATEGORIE1_UTENTE_INSERIMENTO = 7;
  public static int PQSL_CATEGORIE1_DATA_INSERIMENTO = 8;
  public static int PQSL_CATEGORIE1_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_CATEGORIE1_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: INTERVENTI
  //
  public static int PQRY_INTERVENTI1 = 1588;
  public static int PQSL_INTERVENTI1_TITOLO = 0;
  public static int PQSL_INTERVENTI1_INTERVENTO = 1;
  public static int PQSL_INTERVENTI1_DESCRIZIONE = 2;
  public static int PQSL_INTERVENTI1_S = 3;
  public static int PQSL_INTERVENTI1_PERC_CONTROLLO = 4;
  public static int PQSL_INTERVENTI1_SUDDIVISIONE_PC = 5;
  public static int PQSL_INTERVENTI1_UTENTE_INSERIMENTO = 6;
  public static int PQSL_INTERVENTI1_DATA_INSERIMENTO = 7;
  public static int PQSL_INTERVENTI1_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_INTERVENTI1_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: RICLASSIFICAZIONI
  //
  public static int PQRY_RICLASSIFIC2 = 1589;
  public static int PQSL_RICLASSIFIC2_PROGRESSIVO = 0;
  public static int PQSL_RICLASSIFIC2_E_S = 1;
  public static int PQSL_RICLASSIFIC2_TITOLO = 2;
  public static int PQSL_RICLASSIFIC2_CATEGORIA = 3;
  public static int PQSL_RICLASSIFIC2_COD_INTERVENTO = 4;
  public static int PQSL_RICLASSIFIC2_COD_TERZI = 5;
  public static int PQSL_RICLASSIFIC2_VOCE_ECON = 6;
  public static int PQSL_RICLASSIFIC2_CODICE_PTC = 7;
  public static int PQSL_RICLASSIFIC2_UTENTE_INSERIMENTO = 8;
  public static int PQSL_RICLASSIFIC2_DATA_INSERIMENTO = 9;
  public static int PQSL_RICLASSIFIC2_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_RICLASSIFIC2_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: RICLASSIFICAZIONI GEST
  //
  public static int PQRY_RICLASSIGES1 = 1590;
  public static int PQSL_RICLASSIGES1_PROGRESSIVO = 0;
  public static int PQSL_RICLASSIGES1_PROGR_RICLASSIFICAZIONI = 1;
  public static int PQSL_RICLASSIGES1_CODICE_GESTIONALE = 2;
  public static int PQSL_RICLASSIGES1_E_S = 3;
  public static int PQSL_RICLASSIGES1_UTENTE_INSERIMENTO = 4;
  public static int PQSL_RICLASSIGES1_DATA_INSERIMENTO = 5;
  public static int PQSL_RICLASSIGES1_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_RICLASSIGES1_DATA_ULTIMO_AGG = 7;

  // Table to contain panel selected row: DESCAP
  //
  public static int PQRY_DESCAP1 = 1591;
  public static int PQSL_DESCAP1_TITOLO = 0;
  public static int PQSL_DESCAP1_COD_INTERVENTO = 1;
  public static int PQSL_DESCAP1_CAPITOLO = 2;
  public static int PQSL_DESCAP1_DESCRIZIONE = 3;
  public static int PQSL_DESCAP1_DESCRIZIONE_ABBREVIATA = 4;
  public static int PQSL_DESCAP1_UTENTE_INSERIMENTO = 5;
  public static int PQSL_DESCAP1_DATA_INSERIMENTO = 6;
  public static int PQSL_DESCAP1_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_DESCAP1_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI281 = 1592;
  public static int PQRY_PARAMETRI281_RS = 1593;
  public static int PQSL_PARAMETRI281_PARAMES = 0;

  // Table to contain panel selected row: TITOLI
  //
  public static int PQRY_TITOLI2 = 1594;
  public static int PQSL_TITOLI2_TITOLIES = 0;
  public static int PQSL_TITOLI2_TITOLITITOLO = 1;
  public static int PQSL_TITOLI2_TITOLIDESCRI = 2;
  public static int PQSL_TITOLI2_TITOCATECATE = 3;
  public static int PQSL_TITOLI2_TITOCATEDESC = 4;

  // Table to contain panel selected row: TITOLI
  //
  public static int PQRY_TITOLI4 = 1595;
  public static int PQSL_TITOLI4_TITOLIES = 0;
  public static int PQSL_TITOLI4_TITOLITITOLO = 1;
  public static int PQSL_TITOLI4_TITOLIDESCRI = 2;
  public static int PQSL_TITOLI4_TITOINTEINTE = 3;
  public static int PQSL_TITOLI4_TITOINTEDESC = 4;
  public static int PQSL_TITOLI4_TITODESCCAPI = 5;
  public static int PQSL_TITOLI4_TITODESCDESC = 6;

  // Table to contain panel selected row: CATEGORIE
  //
  public static int PQRY_CATEGORIE2 = 1596;
  public static int PQSL_CATEGORIE2_CATEGOTITOLO = 0;
  public static int PQSL_CATEGORIE2_CATEGONUMERO = 1;
  public static int PQSL_CATEGORIE2_CATEGODESCRI = 2;
  public static int PQSL_CATEGORIE2_CATE = 3;
  public static int PQSL_CATEGORIE2_CATSUDCERPRE = 4;
  public static int PQSL_CATEGORIE2_CATSUDCERCON = 5;
  public static int PQSL_CATEGORIE2_CATSUDPROCON = 6;
  public static int PQSL_CATEGORIE2_CATETITODESC = 7;

  // Table to contain panel selected row: INTERVENTI
  //
  public static int PQRY_INTERVENTI2 = 1597;
  public static int PQSL_INTERVENTI2_INTERVTITOLO = 0;
  public static int PQSL_INTERVENTI2_INTERVNUMERO = 1;
  public static int PQSL_INTERVENTI2_INTERVDESCRI = 2;
  public static int PQSL_INTERVENTI2_INTERVENTIS = 3;
  public static int PQSL_INTERVENTI2_INTECONT1SEM = 4;
  public static int PQSL_INTERVENTI2_INTSUDPROCON = 5;
  public static int PQSL_INTERVENTI2_INTETITODESC = 6;

  // Table to contain panel selected row: RICLASSIFICAZIONI
  //
  public static int PQRY_RICLASSIFICA = 1598;
  public static int PQSL_RICLASSIFICA_RICLASPROGRE = 0;
  public static int PQSL_RICLASSIFICA_RICLASSIFIES = 1;
  public static int PQSL_RICLASSIFICA_RICLASTITOLO = 2;
  public static int PQSL_RICLASSIFICA_RICLASCATEGO = 3;
  public static int PQSL_RICLASSIFICA_RICLACODINTE = 4;
  public static int PQSL_RICLASSIFICA_RICLACODTERZ = 5;
  public static int PQSL_RICLASSIFICA_RICLVOCEECON = 6;
  public static int PQSL_RICLASSIFICA_RICLACODIPTC = 7;
  public static int PQSL_RICLASSIFICA_RICVOCECODES = 8;
  public static int PQSL_RICLASSIFICA_RICCODPTCDES = 9;
  public static int PQSL_RICLASSIFICA_RICLCATEDESC = 10;
  public static int PQSL_RICLASSIFICA_RICLINTEDESC = 11;

  // Table to contain panel selected row: RICLASSIFICAZIONI GEST
  //
  public static int PQRY_RICLASSIGES3 = 1599;
  public static int PQSL_RICLASSIGES3_RICLGESTPROG = 0;
  public static int PQSL_RICLASSIGES3_RICGESPRORIC = 1;
  public static int PQSL_RICLASSIGES3_RICGESCODGES = 2;
  public static int PQSL_RICLASSIGES3_RICLASGESTES = 3;
  public static int PQSL_RICLASSIGES3_RICGESCOGEDE = 4;
  public static int PQSL_RICLASSIGES3_RICGESRICTIT = 5;
  public static int PQSL_RICLASSIGES3_RICGESRICCAT = 6;
  public static int PQSL_RICLASSIGES3_RICGESRICOIN = 7;
  public static int PQSL_RICLASSIGES3_RICGESRICOTE = 8;
  public static int PQSL_RICLASSIGES3_RICGESCATDES = 9;
  public static int PQSL_RICLASSIGES3_RICGESINTDES = 10;

  // Table to contain panel selected row: DESCAP
  //
  public static int PQRY_DESCAP = 1600;
  public static int PQSL_DESCAP_DESCAPTITOLO = 0;
  public static int PQSL_DESCAP_DESCACODINTE = 1;
  public static int PQSL_DESCAP_DESCAPCAPITO = 2;
  public static int PQSL_DESCAP_DESCDESCCOMP = 3;
  public static int PQSL_DESCAP_DESCDESCABBR = 4;
  public static int PQSL_DESCAP_DESCINTEDESC = 5;

  // Table to contain panel selected row: CAPTER
  //
  public static int PQRY_CAPTER1 = 1601;
  public static int PQSL_CAPTER1_E_S = 0;
  public static int PQSL_CAPTER1_CAPITOLO = 1;
  public static int PQSL_CAPTER1_DESCRIZIONE = 2;
  public static int PQSL_CAPTER1_UTENTE_INSERIMENTO = 3;
  public static int PQSL_CAPTER1_DATA_INSERIMENTO = 4;
  public static int PQSL_CAPTER1_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_CAPTER1_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: RICLASSIFICAZIONI
  //
  public static int PQRY_RICLASSIFIC1 = 1602;
  public static int PQSL_RICLASSIFIC1_PROGRESSIVO = 0;
  public static int PQSL_RICLASSIFIC1_E_S = 1;
  public static int PQSL_RICLASSIFIC1_TITOLO = 2;
  public static int PQSL_RICLASSIFIC1_CATEGORIA = 3;
  public static int PQSL_RICLASSIFIC1_COD_INTERVENTO = 4;
  public static int PQSL_RICLASSIFIC1_COD_TERZI = 5;
  public static int PQSL_RICLASSIFIC1_VOCE_ECON = 6;
  public static int PQSL_RICLASSIFIC1_CODICE_PTC = 7;
  public static int PQSL_RICLASSIFIC1_UTENTE_INSERIMENTO = 8;
  public static int PQSL_RICLASSIFIC1_DATA_INSERIMENTO = 9;
  public static int PQSL_RICLASSIFIC1_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_RICLASSIFIC1_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: RICLASSIFICAZIONI GEST
  //
  public static int PQRY_RICLASSIGES2 = 1603;
  public static int PQSL_RICLASSIGES2_PROGRESSIVO = 0;
  public static int PQSL_RICLASSIGES2_PROGR_RICLASSIFICAZIONI = 1;
  public static int PQSL_RICLASSIGES2_CODICE_GESTIONALE = 2;
  public static int PQSL_RICLASSIGES2_E_S = 3;
  public static int PQSL_RICLASSIGES2_DATA_INSERIMENTO = 4;
  public static int PQSL_RICLASSIGES2_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_RICLASSIGES2_UTENTE_INSERIMENTO = 6;
  public static int PQSL_RICLASSIGES2_DATA_ULTIMO_AGG = 7;

  // Table to contain panel selected row: CAPTER
  //
  public static int PQRY_CAPTER2 = 1604;
  public static int PQSL_CAPTER2_E_S = 0;
  public static int PQSL_CAPTER2_CAPITOLO = 1;
  public static int PQSL_CAPTER2_DESCRIZIONE = 2;

  // Table to contain panel selected row: RICLASSIFICAZIONI GEST
  //
  public static int PQRY_RICLASSIGES4 = 1605;
  public static int PQSL_RICLASSIGES4_RICLGESTPROG = 0;
  public static int PQSL_RICLASSIGES4_RICGESPRORIC = 1;
  public static int PQSL_RICLASSIGES4_RICGESCODGES = 2;
  public static int PQSL_RICLASSIGES4_RICLASGESTES = 3;
  public static int PQSL_RICLASSIGES4_RICGESCOGEDE = 4;
  public static int PQSL_RICLASSIGES4_RICGESRICTIT = 5;
  public static int PQSL_RICLASSIGES4_RICGESRICCAT = 6;
  public static int PQSL_RICLASSIGES4_RICGESRICOIN = 7;
  public static int PQSL_RICLASSIGES4_RICGESRICOTE = 8;
  public static int PQSL_RICLASSIGES4_RICGESCAPDES = 9;

  // Table to contain panel selected row: FUNZIONI
  //
  public static int PQRY_FUNZIONI1 = 1606;
  public static int PQSL_FUNZIONI1_FUNZIONE = 0;
  public static int PQSL_FUNZIONI1_DESCRIZIONE = 1;
  public static int PQSL_FUNZIONI1_DATA_INSERIMENTO = 2;
  public static int PQSL_FUNZIONI1_UTENTE_INSERIMENTO = 3;
  public static int PQSL_FUNZIONI1_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_FUNZIONI1_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: SERVIZI
  //
  public static int PQRY_SERVIZI1 = 1607;
  public static int PQSL_SERVIZI1_FUNZIONE = 0;
  public static int PQSL_SERVIZI1_SERVIZIO = 1;
  public static int PQSL_SERVIZI1_DESCRIZIONE = 2;
  public static int PQSL_SERVIZI1_RESPONSABILE = 3;
  public static int PQSL_SERVIZI1_CERTIFICATO_CC = 4;
  public static int PQSL_SERVIZI1_UTENTE_INSERIMENTO = 5;
  public static int PQSL_SERVIZI1_DATA_INSERIMENTO = 6;
  public static int PQSL_SERVIZI1_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_SERVIZI1_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: FUNZIONI
  //
  public static int PQRY_FUNZIONI2 = 1608;
  public static int PQSL_FUNZIONI2_FUNZIOFUNZIO = 0;
  public static int PQSL_FUNZIONI2_FUNZIODESCRI = 1;
  public static int PQSL_FUNZIONI2_FUNZSERVSERV = 2;
  public static int PQSL_FUNZIONI2_FUNZSERVDESC = 3;
  public static int PQSL_FUNZIONI2_FUNZSERVRESP = 4;

  // Table to contain panel selected row: SERVIZI
  //
  public static int PQRY_SERVIZI2 = 1609;
  public static int PQSL_SERVIZI2_SERVIZFUNZIO = 0;
  public static int PQSL_SERVIZI2_SERVIZSERVIZ = 1;
  public static int PQSL_SERVIZI2_SERVIZDESCRI = 2;
  public static int PQSL_SERVIZI2_SERVIZRESPON = 3;
  public static int PQSL_SERVIZI2_SERSUDCERCON = 4;
  public static int PQSL_SERVIZI2_SERVFUNZDESC = 5;

  // Table to contain panel selected row: VINCOLI
  //
  public static int PQRY_VINCOLI4 = 1610;
  public static int PQSL_VINCOLI4_CODICE = 0;
  public static int PQSL_VINCOLI4_DESCRIZIONE = 1;
  public static int PQSL_VINCOLI4_STAMPA = 2;
  public static int PQSL_VINCOLI4_RIF_TESO_1 = 3;
  public static int PQSL_VINCOLI4_RIF_TESO_2 = 4;
  public static int PQSL_VINCOLI4_RIF_TESO_3 = 5;
  public static int PQSL_VINCOLI4_CONTO_CORRENTE = 6;
  public static int PQSL_VINCOLI4_SCADENZA = 7;
  public static int PQSL_VINCOLI4_TIPO_AVANZO = 8;
  public static int PQSL_VINCOLI4_UTENTE_INSERIMENTO = 9;
  public static int PQSL_VINCOLI4_DATA_INSERIMENTO = 10;
  public static int PQSL_VINCOLI4_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_VINCOLI4_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: VINCOLI
  //
  public static int PQRY_VINCOLI3 = 1611;
  public static int PQSL_VINCOLI3_CODICE = 0;
  public static int PQSL_VINCOLI3_DESCRIZIONE = 1;
  public static int PQSL_VINCOLI3_STAMPA = 2;
  public static int PQSL_VINCOLI3_RIF_TESO_1 = 3;
  public static int PQSL_VINCOLI3_RIF_TESO_2 = 4;
  public static int PQSL_VINCOLI3_RIF_TESO_3 = 5;
  public static int PQSL_VINCOLI3_CONTO_CORRENTE = 6;
  public static int PQSL_VINCOLI3_SCADENZA = 7;

  // Table to contain panel selected row: T69
  //
  public static int PQRY_T74 = 1612;
  public static int PQSL_T74_CODICE = 0;
  public static int PQSL_T74_DESCRIZIONE = 1;
  public static int PQSL_T74_DESC_ABB = 2;
  public static int PQSL_T74_UTENTE_INSERIMENTO = 3;
  public static int PQSL_T74_DATA_INSERIMENTO = 4;
  public static int PQSL_T74_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_T74_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: T69
  //
  public static int PQRY_T69 = 1613;
  public static int PQSL_T69_CODICE = 0;
  public static int PQSL_T69_DESCRIZIONE = 1;
  public static int PQSL_T69_DESC_ABB = 2;

  // Table to contain panel selected row: CERTBIL
  //
  public static int PQRY_CERTBIL1 = 1614;
  public static int PQSL_CERTBIL1_CODICE = 0;
  public static int PQSL_CERTBIL1_DESCRIZIONE = 1;
  public static int PQSL_CERTBIL1_E_S = 2;
  public static int PQSL_CERTBIL1_TITOLO = 3;
  public static int PQSL_CERTBIL1_CAT_INT = 4;
  public static int PQSL_CERTBIL1_CODICE_CP = 5;
  public static int PQSL_CERTBIL1_UTENTE_INSERIMENTO = 6;
  public static int PQSL_CERTBIL1_DATA_INSERIMENTO = 7;
  public static int PQSL_CERTBIL1_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_CERTBIL1_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: CERTCON
  //
  public static int PQRY_CERTCON1 = 1615;
  public static int PQSL_CERTCON1_CODICE = 0;
  public static int PQSL_CERTCON1_DESCRIZIONE = 1;
  public static int PQSL_CERTCON1_TITOLO = 2;
  public static int PQSL_CERTCON1_CATEGORIA = 3;
  public static int PQSL_CERTCON1_E = 4;
  public static int PQSL_CERTCON1_CODICE_CC = 5;
  public static int PQSL_CERTCON1_UTENTE_INSERIMENTO = 6;
  public static int PQSL_CERTCON1_DATA_INSERIMENTO = 7;
  public static int PQSL_CERTCON1_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_CERTCON1_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: CERTBIL
  //
  public static int PQRY_CERTBIL2 = 1616;
  public static int PQSL_CERTBIL2_CERTBICODICE = 0;
  public static int PQSL_CERTBIL2_CERTBIDESCRI = 1;
  public static int PQSL_CERTBIL2_CERTBILES = 2;
  public static int PQSL_CERTBIL2_CERTBITITOLO = 3;
  public static int PQSL_CERTBIL2_CERTBICATEGO = 4;
  public static int PQSL_CERTBIL2_CERTCODICERT = 5;
  public static int PQSL_CERTBIL2_CERTTITOTITO = 6;
  public static int PQSL_CERTBIL2_CERTDESCTITO = 7;
  public static int PQSL_CERTBIL2_CERTCATECATE = 8;
  public static int PQSL_CERTBIL2_CERTDESCCATE = 9;

  // Table to contain panel selected row: CERTCON
  //
  public static int PQRY_CERTCON2 = 1617;
  public static int PQSL_CERTCON2_CERTCOCODICE = 0;
  public static int PQSL_CERTCON2_CERTCODESCRI = 1;
  public static int PQSL_CERTCON2_CERTCOTITOLO = 2;
  public static int PQSL_CERTCON2_CERTCOCATEGO = 3;
  public static int PQSL_CERTCON2_CE = 4;
  public static int PQSL_CERTCON2_CERTCODICERT = 5;
  public static int PQSL_CERTCON2_CERTTITOTITO = 6;
  public static int PQSL_CERTCON2_CERTDESCTITO = 7;
  public static int PQSL_CERTCON2_CERTCATECATE = 8;
  public static int PQSL_CERTCON2_CERTDESCCATE = 9;

  // Table to contain panel selected row: FLESSIBILITA
  //
  public static int PQRY_FLESSIBILIT1 = 1618;
  public static int PQSL_FLESSIBILIT1_CODICE = 0;
  public static int PQSL_FLESSIBILIT1_DESCRIZIONE = 1;
  public static int PQSL_FLESSIBILIT1_UTENTE_INSERIMENTO = 2;
  public static int PQSL_FLESSIBILIT1_DATA_INSERIMENTO = 3;
  public static int PQSL_FLESSIBILIT1_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_FLESSIBILIT1_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: FLESSIBILITA
  //
  public static int PQRY_FLESSIBILIT2 = 1619;
  public static int PQSL_FLESSIBILIT2_CODICE = 0;
  public static int PQSL_FLESSIBILIT2_DESCRIZIONE = 1;
  public static int PQSL_FLESSIBILIT2_UTENTE_INSERIMENTO = 2;
  public static int PQSL_FLESSIBILIT2_DATA_INSERIMENTO = 3;
  public static int PQSL_FLESSIBILIT2_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_FLESSIBILIT2_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: PROGRAMMI
  //
  public static int PQRY_PROGRAMMI1 = 1620;
  public static int PQSL_PROGRAMMI1_CODICE = 0;
  public static int PQSL_PROGRAMMI1_DESCRIZIONE = 1;
  public static int PQSL_PROGRAMMI1_UTENTE_INSERIMENTO = 2;
  public static int PQSL_PROGRAMMI1_DATA_INSERIMENTO = 3;
  public static int PQSL_PROGRAMMI1_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_PROGRAMMI1_DATA_ULTIMO_AGG = 5;
  public static int PQSL_PROGRAMMI1_COD_MISSIONE = 6;
  public static int PQSL_PROGRAMMI1_COD_PROGRAMMA = 7;
  public static int PQSL_PROGRAMMI1_ID_MISSIONE = 8;
  public static int PQSL_PROGRAMMI1_ID_PROGRAMMA = 9;

  // Table to contain panel selected row: PROGETTI
  //
  public static int PQRY_PROGETTI = 1621;
  public static int PQSL_PROGETTI_CODICE = 0;
  public static int PQSL_PROGETTI_PROGRAMMA = 1;
  public static int PQSL_PROGETTI_DESCRIZIONE = 2;
  public static int PQSL_PROGETTI_RESPONSABILE = 3;
  public static int PQSL_PROGETTI_PROGETTO_ID = 4;
  public static int PQSL_PROGETTI_UTENTE_INSERIMENTO = 5;
  public static int PQSL_PROGETTI_DATA_INSERIMENTO = 6;
  public static int PQSL_PROGETTI_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_PROGETTI_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: PROGRAMMI
  //
  public static int PQRY_PROGRAMMI2 = 1622;
  public static int PQSL_PROGRAMMI2_CODICE = 0;
  public static int PQSL_PROGRAMMI2_DESCRIZIONE = 1;
  public static int PQSL_PROGRAMMI2_UTENTE_INSERIMENTO = 2;
  public static int PQSL_PROGRAMMI2_DATA_INSERIMENTO = 3;
  public static int PQSL_PROGRAMMI2_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_PROGRAMMI2_DATA_ULTIMO_AGG = 5;
  public static int PQSL_PROGRAMMI2_PROGPROGCODI = 6;
  public static int PQSL_PROGRAMMI2_PROGPROGDESC = 7;
  public static int PQSL_PROGRAMMI2_RESPONSABILE = 8;

  // Table to contain panel selected row: CENCOS
  //
  public static int PQRY_CENCOS = 1623;
  public static int PQSL_CENCOS_CENTRO_COSTO = 0;
  public static int PQSL_CENCOS_DESCRIZIONE = 1;

  // Table to contain panel selected row: TIPI MOTIVAZIONE
  //
  public static int PQRY_TIPIMOTIVAZ1 = 1624;
  public static int PQSL_TIPIMOTIVAZ1_CODICE = 0;
  public static int PQSL_TIPIMOTIVAZ1_DESCRIZIONE = 1;

  // Table to contain panel selected row: TIPI MOTIVAZIONE
  //
  public static int PQRY_TIPIMOTIVAZI = 1625;
  public static int PQSL_TIPIMOTIVAZI_CODICE = 0;
  public static int PQSL_TIPIMOTIVAZI_DESCRIZIONE = 1;

  // Table to contain panel selected row: T55
  //
  public static int PQRY_T70 = 1626;
  public static int PQSL_T70_CODICE = 0;
  public static int PQSL_T70_DESCRIZIONE = 1;
  public static int PQSL_T70_MOTIVO = 2;
  public static int PQSL_T70_FATTORE = 3;
  public static int PQSL_T70_RIACCERTAMENTO = 4;
  public static int PQSL_T70_GESTIONE_AVANZO = 5;
  public static int PQSL_T70_UTENTE_INSERIMENTO = 6;
  public static int PQSL_T70_DATA_INSERIMENTO = 7;
  public static int PQSL_T70_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_T70_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: T56
  //
  public static int PQRY_T78 = 1627;
  public static int PQSL_T78_CODICE = 0;
  public static int PQSL_T78_DESCRIZIONE = 1;
  public static int PQSL_T78_MOTIVO = 2;
  public static int PQSL_T78_VAR_AUTO = 3;
  public static int PQSL_T78_FATTORE = 4;
  public static int PQSL_T78_RIACCERTAMENTO = 5;
  public static int PQSL_T78_GESTIONE_AVANZO = 6;
  public static int PQSL_T78_UTENTE_INSERIMENTO = 7;
  public static int PQSL_T78_DATA_INSERIMENTO = 8;
  public static int PQSL_T78_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_T78_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: T55
  //
  public static int PQRY_T55 = 1628;
  public static int PQSL_T55_CODICE = 0;
  public static int PQSL_T55_DESCRIZIONE = 1;
  public static int PQSL_T55_MOTIVO = 2;
  public static int PQSL_T55_FATTORE = 3;
  public static int PQSL_T55_RIACCERTAMENTO = 4;
  public static int PQSL_T55_T55DESCRMOTI = 5;
  public static int PQSL_T55_T55GESTIAVAN = 6;

  // Table to contain panel selected row: T56
  //
  public static int PQRY_T56 = 1629;
  public static int PQSL_T56_CODICE = 0;
  public static int PQSL_T56_DESCRIZIONE = 1;
  public static int PQSL_T56_MOTIVO = 2;
  public static int PQSL_T56_VAR_AUTO = 3;
  public static int PQSL_T56_FATTORE = 4;
  public static int PQSL_T56_RIACCERTAMENTO = 5;
  public static int PQSL_T56_T56DESCRMOTI = 6;
  public static int PQSL_T56_T56GESTIAVAN = 7;

  // Table to contain panel selected row: TIPI VAR CRONOPROGRAMMI
  //
  public static int PQRY_TIPIVARCRONO = 1630;
  public static int PQSL_TIPIVARCRONO_CODICE = 0;
  public static int PQSL_TIPIVARCRONO_DESCRIZIONE = 1;
  public static int PQSL_TIPIVARCRONO_TIPO_VAR = 2;

  // Table to contain panel selected row: TIPI AVANZO
  //
  public static int PQRY_TIPIAVANZO1 = 1631;
  public static int PQSL_TIPIAVANZO1_CODICE = 0;
  public static int PQSL_TIPIAVANZO1_DESCRIZIONE = 1;
  public static int PQSL_TIPIAVANZO1_COD_AVANZO_VINCA2 = 2;
  public static int PQSL_TIPIAVANZO1_NOTE = 3;

  // Table to contain panel selected row: TIPI AVANZO
  //
  public static int PQRY_TIPIAVANZO = 1632;
  public static int PQSL_TIPIAVANZO_TIPIAVANCODI = 0;
  public static int PQSL_TIPIAVANZO_TIPIAVANDESC = 1;
  public static int PQSL_TIPIAVANZO_TIPIAVANNOTE = 2;

  // Table to contain panel selected row: T57
  //
  public static int PQRY_T77 = 1633;
  public static int PQSL_T77_CODICE = 0;
  public static int PQSL_T77_DESCRIZIONE = 1;
  public static int PQSL_T77_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T77_DATA_INSERIMENTO = 3;
  public static int PQSL_T77_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T77_DATA_ULTIMO_AGG = 5;
  public static int PQSL_T77_STATO = 6;

}
