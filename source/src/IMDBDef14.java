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
public class IMDBDef14 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ41 = 3002;
  public static int PQSL_LIQ41_RECMANNUMMAN = 0;
  public static int PQSL_LIQ41_RECORANNOLIQ = 1;
  public static int PQSL_LIQ41_RECORNUMELIQ = 2;
  public static int PQSL_LIQ41_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL16 = 3003;
  public static int PQSL_DUAL16_RECONUOVESPR = 0;
  public static int PQSL_DUAL16_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ38 = 3004;
  public static int PQSL_LIQ38_RECMANNUMMAN = 0;
  public static int PQSL_LIQ38_RECORANNOLIQ = 1;
  public static int PQSL_LIQ38_RECORNUMELIQ = 2;
  public static int PQSL_LIQ38_ICON = 3;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL2 = 3005;
  public static int PQSL_DUAL2_RECONUOVESPR = 0;
  public static int PQSL_DUAL2_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ2 = 3006;
  public static int PQSL_LIQ2_RECMANNUMMAN = 0;
  public static int PQSL_LIQ2_RECMANANNMAN = 1;
  public static int PQSL_LIQ2_RECMANNUMMA1 = 2;
  public static int PQSL_LIQ2_RECORANNOLIQ = 3;
  public static int PQSL_LIQ2_RECORNUMELIQ = 4;
  public static int PQSL_LIQ2_ICON = 5;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL17 = 3007;
  public static int PQSL_DUAL17_RECONUOVESPR = 0;
  public static int PQSL_DUAL17_ICON = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ56 = 3008;
  public static int PQSL_LIQ56_RECMANNUMMAN = 0;
  public static int PQSL_LIQ56_RECORANNOLIQ = 1;
  public static int PQSL_LIQ56_RECORNUMELIQ = 2;
  public static int PQSL_LIQ56_ICON = 3;

  // Table to contain panel selected row: Nuova Tabella
  //
  public static int PQRY_NUOVATABELL1 = 3009;
  public static int PQRY_NUOVATABELL1_RS = 3010;
  public static int PQSL_NUOVATABELL1_NOMEOGGEIMPE = 0;
  public static int PQSL_NUOVATABELL1_NOMOGGANNIMP = 1;
  public static int PQSL_NUOVATABELL1_NOMOGGTIPSTA = 2;

  // Table to contain panel selected row: Nuova Tabella
  //
  public static int PQRY_NUOVATABELL2 = 3011;
  public static int PQRY_NUOVATABELL2_RS = 3012;
  public static int PQSL_NUOVATABELL2_NOMEOGGEIMPE = 0;
  public static int PQSL_NUOVATABELL2_NOMOGGANNIMP = 1;
  public static int PQSL_NUOVATABELL2_NOMOGGTIPSTA = 2;

  // Table to contain panel selected row: IMP FIN
  //
  public static int PQRY_IMPFIN = 3013;
  public static int PQSL_IMPFIN_IMPFINDESCRI = 0;
  public static int PQSL_IMPFIN_IMPFINIMPORT = 1;
  public static int PQSL_IMPFIN_IMPFINFINANZ = 2;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM19 = 3014;
  public static int PQRY_PARAMESTAM19_RS = 3015;
  public static int PQSL_PARAMESTAM19_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAM19_ROWNAMTIPVAR = 1;
  public static int PQSL_PARAMESTAM19_ROWNAMEDELIB = 2;
  public static int PQSL_PARAMESTAM19_ROWNAMNUMDEL = 3;
  public static int PQSL_PARAMESTAM19_ROWNAMANNDEL = 4;
  public static int PQSL_PARAMESTAM19_ROWNAMRESCOM = 5;
  public static int PQSL_PARAMESTAM19_ROWNAMPERDAL = 6;
  public static int PQSL_PARAMESTAM19_ROWNAMEPERAL = 7;
  public static int PQSL_PARAMESTAM19_ROWNAMEPROPO = 8;
  public static int PQSL_PARAMESTAM19_ROWNAMANNPRO = 9;
  public static int PQSL_PARAMESTAM19_ROWNAMNUMPRO = 10;
  public static int PQSL_PARAMESTAM19_RONATOPECOBI = 11;
  public static int PQSL_PARAMESTAM19_ROWNAMTOVAIM = 12;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMI1 = 3016;
  public static int PQSL_VOCIECONOMI1_CODICE = 0;
  public static int PQSL_VOCIECONOMI1_RECORDDESCRI = 1;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTALE = 3017;
  public static int PQRY_IMPORTTOTALE_RS = 3018;
  public static int PQSL_IMPORTTOTALE_ROWNAMIMPATT = 0;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC3 = 3019;
  public static int PQSL_ACC3_NUMERO_ACC = 0;
  public static int PQSL_ACC3_ANNO_ACC = 1;
  public static int PQSL_ACC3_CAPITOLO = 2;
  public static int PQSL_ACC3_ARTICOLO = 3;
  public static int PQSL_ACC3_E = 4;
  public static int PQSL_ACC3_IMPORTO = 5;
  public static int PQSL_ACC3_DESCRIZIONE = 6;
  public static int PQSL_ACC3_ANNO_INTROD = 7;
  public static int PQSL_ACC3_SEDE_DEL = 8;
  public static int PQSL_ACC3_NUMERO_DEL = 9;
  public static int PQSL_ACC3_ANNO_DEL = 10;
  public static int PQSL_ACC3_ANNO_PROPOSTA = 11;
  public static int PQSL_ACC3_UNITA_PROPONENTE = 12;
  public static int PQSL_ACC3_NUMERO_PROPOSTA = 13;
  public static int PQSL_ACC3_VOCE_ECON = 14;
  public static int PQSL_ACC3_CAUSALE = 15;
  public static int PQSL_ACC3_ESERCIZIO_SCADENZA = 16;
  public static int PQSL_ACC3_TIPO_VINCOLO = 17;
  public static int PQSL_ACC3_D_DATA_REG = 18;
  public static int PQSL_ACC3_FATTORE = 19;
  public static int PQSL_ACC3_COD_IMP_ECO = 20;
  public static int PQSL_ACC3_CENTRO = 21;
  public static int PQSL_ACC3_OBIETTIVO = 22;
  public static int PQSL_ACC3_CODICE_GESTIONALE = 23;
  public static int PQSL_ACC3_PROGETTO_ID = 24;
  public static int PQSL_ACC3_COD_PROGETTO = 25;
  public static int PQSL_ACC3_SCHEDA_OBIETTIVO_ID = 26;
  public static int PQSL_ACC3_NOTE = 27;
  public static int PQSL_ACC3_RESPONSABILE_RES = 28;
  public static int PQSL_ACC3_COMPETENZA_DAL = 29;
  public static int PQSL_ACC3_COMPETENZA_AL = 30;
  public static int PQSL_ACC3_RILEVANTE_ECO = 31;
  public static int PQSL_ACC3_NUMERO_PLUR = 32;
  public static int PQSL_ACC3_PROGR_UNITA_ORGANIZZATIVA = 33;
  public static int PQSL_ACC3_UTENTE_INSERIMENTO = 34;
  public static int PQSL_ACC3_DATA_INSERIMENTO = 35;
  public static int PQSL_ACC3_UTENTE_ULTIMO_AGG = 36;
  public static int PQSL_ACC3_DATA_ULTIMO_AGG = 37;
  public static int PQSL_ACC3_DEBITORE = 38;
  public static int PQSL_ACC3_TIPO_SERVIZIO = 39;
  public static int PQSL_ACC3_FINANZIAMENTO = 40;
  public static int PQSL_ACC3_DATA_REG = 41;
  public static int PQSL_ACC3_CODICE_FINANZ = 42;
  public static int PQSL_ACC3_VAR_AUTO = 43;
  public static int PQSL_ACC3_ANNO_PLUR = 44;
  public static int PQSL_ACC3_CONTROLLO_DISP = 45;
  public static int PQSL_ACC3_PROGR_UNITA_ORGANIZZATIVA_INS = 46;
  public static int PQSL_ACC3_COD_MONITORAGGIO = 47;
  public static int PQSL_ACC3_COD_LIVELLO_5 = 48;
  public static int PQSL_ACC3_CODICE_EUROPEO = 49;
  public static int PQSL_ACC3_ANNO_ACC_PROVENIENZA = 50;
  public static int PQSL_ACC3_NUMERO_ACC_PROVENIENZA = 51;
  public static int PQSL_ACC3_DATA_REG_ECONOMICA = 52;
  public static int PQSL_ACC3_DATA_SCADENZA = 53;
  public static int PQSL_ACC3_FINANZIAMENTO_LIGHT = 54;
  public static int PQSL_ACC3_OPERA_LIGHT = 55;
  public static int PQSL_ACC3_PROGR_VARACC_PROVENIENZA = 56;
  public static int PQSL_ACC3_ANNO_ACC_PREC = 57;
  public static int PQSL_ACC3_NUMERO_ACC_PREC = 58;
  public static int PQSL_ACC3_TIPO_AVANZO = 59;

  // Table to contain panel selected row: ACC OPE
  //
  public static int PQRY_ACCOPE2 = 3020;
  public static int PQSL_ACCOPE2_ANNO_ACC = 0;
  public static int PQSL_ACCOPE2_NUMERO_ACC = 1;
  public static int PQSL_ACCOPE2_OPERA = 2;
  public static int PQSL_ACCOPE2_FINANZIAMENTO = 3;
  public static int PQSL_ACCOPE2_IMPORTO = 4;
  public static int PQSL_ACCOPE2_CAPITOLO = 5;
  public static int PQSL_ACCOPE2_ARTICOLO = 6;
  public static int PQSL_ACCOPE2_E = 7;

  // Table to contain panel selected row: ACCERTAMENTI
  //
  public static int PQRY_ACCERTAMENTI = 3021;
  public static int PQSL_ACCERTAMENTI_CAPITOLO = 0;
  public static int PQSL_ACCERTAMENTI_ARTICOLO = 1;
  public static int PQSL_ACCERTAMENTI_ANNO_DEL = 2;
  public static int PQSL_ACCERTAMENTI_NUMERO_DEL = 3;
  public static int PQSL_ACCERTAMENTI_SEDE_DEL = 4;
  public static int PQSL_ACCERTAMENTI_DATA_REG = 5;
  public static int PQSL_ACCERTAMENTI_IMPORTO = 6;
  public static int PQSL_ACCERTAMENTI_DESCRIZIONE = 7;
  public static int PQSL_ACCERTAMENTI_CAUSALE = 8;
  public static int PQSL_ACCERTAMENTI_ESERCIZIO_SCADENZA = 9;
  public static int PQSL_ACCERTAMENTI_ANNO_INTROD = 10;
  public static int PQSL_ACCERTAMENTI_ANNO_PROPOSTA = 11;
  public static int PQSL_ACCERTAMENTI_UNITA_PROPONENTE = 12;
  public static int PQSL_ACCERTAMENTI_NUMERO_PROPOSTA = 13;
  public static int PQSL_ACCERTAMENTI_VOCE_ECON = 14;
  public static int PQSL_ACCERTAMENTI_TIPO_VINCOLO = 15;
  public static int PQSL_ACCERTAMENTI_TIPO_AVANZO = 16;
  public static int PQSL_ACCERTAMENTI_D_DATA_REG = 17;
  public static int PQSL_ACCERTAMENTI_ANNO_PLUR = 18;
  public static int PQSL_ACCERTAMENTI_NUMERO_PLUR = 19;
  public static int PQSL_ACCERTAMENTI_CENTRO = 20;
  public static int PQSL_ACCERTAMENTI_FATTORE = 21;
  public static int PQSL_ACCERTAMENTI_COMPETENZA_DAL = 22;
  public static int PQSL_ACCERTAMENTI_COMPETENZA_AL = 23;
  public static int PQSL_ACCERTAMENTI_NOTE = 24;
  public static int PQSL_ACCERTAMENTI_RILEVANTE_ECO = 25;
  public static int PQSL_ACCERTAMENTI_COD_IMP_ECO = 26;
  public static int PQSL_ACCERTAMENTI_PROGETTO_ID = 27;
  public static int PQSL_ACCERTAMENTI_OBIETTIVO = 28;
  public static int PQSL_ACCERTAMENTI_CODICE_GESTIONALE = 29;
  public static int PQSL_ACCERTAMENTI_RESPONSABILE_RES = 30;
  public static int PQSL_ACCERTAMENTI_ANNO_ACC = 31;
  public static int PQSL_ACCERTAMENTI_NUMERO_ACC = 32;
  public static int PQSL_ACCERTAMENTI_DEBITORE = 33;
  public static int PQSL_ACCERTAMENTI_E = 34;
  public static int PQSL_ACCERTAMENTI_TIPO_SERVIZIO = 35;
  public static int PQSL_ACCERTAMENTI_CODICE_FINANZ = 36;
  public static int PQSL_ACCERTAMENTI_VAR_AUTO = 37;
  public static int PQSL_ACCERTAMENTI_CONTROLLO_DISP = 38;
  public static int PQSL_ACCERTAMENTI_FINANZIAMENTO = 39;
  public static int PQSL_ACCERTAMENTI_PROGR_UNITA_ORGANIZZATIVA = 40;
  public static int PQSL_ACCERTAMENTI_PROGR_UNITA_ORGANIZZATIVA_INS = 41;
  public static int PQSL_ACCERTAMENTI_SCHEDA_OBIETTIVO_ID = 42;
  public static int PQSL_ACCERTAMENTI_UTENTE_INSERIMENTO = 43;
  public static int PQSL_ACCERTAMENTI_DATA_INSERIMENTO = 44;
  public static int PQSL_ACCERTAMENTI_UTENTE_ULTIMO_AGG = 45;
  public static int PQSL_ACCERTAMENTI_DATA_ULTIMO_AGG = 46;
  public static int PQSL_ACCERTAMENTI_CODICE_EUROPEO = 47;
  public static int PQSL_ACCERTAMENTI_COD_LIVELLO_5 = 48;
  public static int PQSL_ACCERTAMENTI_DATA_REG_ECONOMICA = 49;

  // Recordset for query: Opere
  //
  public static int QRY_OPERE2 = 3022;
  public static int QSL_OPERE2_ROWNAMECODIC = 0;
  public static int QSL_OPERE2_ROWNAMIMPOLD = 1;
  public static int QSL_OPERE2_ROWNAMEIMPOR = 2;
  public static int QSL_OPERE2_ROWNAMESTATO = 3;

  // Table to contain panel selected row: Finanziamento
  //
  public static int PQRY_FINANZIAME15 = 3023;
  public static int PQRY_FINANZIAME15_RS = 3024;
  public static int PQSL_FINANZIAME15_PARAMFINANZI = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV93 = 3025;
  public static int QSL_CFASELINTV93_COUNT = 0;

  // Table to contain panel selected row: VARACC
  //
  public static int PQRY_VARACC = 3026;
  public static int PQSL_VARACC_COD_REC = 0;
  public static int PQSL_VARACC_ANNO_VAR = 1;
  public static int PQSL_VARACC_CAPITOLO = 2;
  public static int PQSL_VARACC_ARTICOLO = 3;
  public static int PQSL_VARACC_ANNO_ACC = 4;
  public static int PQSL_VARACC_NUMERO_ACC = 5;
  public static int PQSL_VARACC_SEDE_DEL = 6;
  public static int PQSL_VARACC_NUMERO_DEL = 7;
  public static int PQSL_VARACC_ANNO_DEL = 8;
  public static int PQSL_VARACC_IMPORTO = 9;
  public static int PQSL_VARACC_DESCRIZIONE = 10;
  public static int PQSL_VARACC_TIPO_VAR = 11;
  public static int PQSL_VARACC_D_DATA_REG = 12;
  public static int PQSL_VARACC_PROGRESSIVO = 13;
  public static int PQSL_VARACC_ANNO_PROPOSTA = 14;
  public static int PQSL_VARACC_UNITA_PROPONENTE = 15;
  public static int PQSL_VARACC_NUMERO_PROPOSTA = 16;
  public static int PQSL_VARACC_OPERA = 17;
  public static int PQSL_VARACC_UTENTE_INSERIMENTO = 18;
  public static int PQSL_VARACC_DATA_INSERIMENTO = 19;
  public static int PQSL_VARACC_UTENTE_ULTIMO_AGG = 20;
  public static int PQSL_VARACC_DATA_ULTIMO_AGG = 21;
  public static int PQSL_VARACC_ANNO_ESIGIBILITA = 22;
  public static int PQSL_VARACC_TIPO_AVANZO = 23;

  // Table to contain panel selected row: Debitore
  //
  public static int PQRY_DEBITORE4 = 3027;
  public static int PQRY_DEBITORE4_RS = 3028;
  public static int PQSL_DEBITORE4_ROWNAMRAGSOC = 0;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC5 = 3029;
  public static int PQSL_ACC5_NUMERO_ACC = 0;
  public static int PQSL_ACC5_ANNO_ACC = 1;
  public static int PQSL_ACC5_CAPITOLO = 2;
  public static int PQSL_ACC5_ARTICOLO = 3;
  public static int PQSL_ACC5_E = 4;
  public static int PQSL_ACC5_IMPORTO = 5;
  public static int PQSL_ACC5_DESCRIZIONE = 6;
  public static int PQSL_ACC5_ANNO_INTROD = 7;
  public static int PQSL_ACC5_SEDE_DEL = 8;
  public static int PQSL_ACC5_NUMERO_DEL = 9;
  public static int PQSL_ACC5_ANNO_DEL = 10;
  public static int PQSL_ACC5_ANNO_PROPOSTA = 11;
  public static int PQSL_ACC5_UNITA_PROPONENTE = 12;
  public static int PQSL_ACC5_NUMERO_PROPOSTA = 13;
  public static int PQSL_ACC5_VOCE_ECON = 14;
  public static int PQSL_ACC5_CAUSALE = 15;
  public static int PQSL_ACC5_TIPO_VINCOLO = 16;
  public static int PQSL_ACC5_ACCTIPOAVANZ = 17;
  public static int PQSL_ACC5_D_DATA_REG = 18;
  public static int PQSL_ACC5_FATTORE = 19;
  public static int PQSL_ACC5_COD_IMP_ECO = 20;
  public static int PQSL_ACC5_CENTRO = 21;
  public static int PQSL_ACC5_OBIETTIVO = 22;
  public static int PQSL_ACC5_CODICE_GESTIONALE = 23;
  public static int PQSL_ACC5_PROGETTO_ID = 24;
  public static int PQSL_ACC5_NOTE = 25;
  public static int PQSL_ACC5_RESPONSABILE_RES = 26;
  public static int PQSL_ACC5_COMPETENZA_DAL = 27;
  public static int PQSL_ACC5_COMPETENZA_AL = 28;
  public static int PQSL_ACC5_RILEVANTE_ECO = 29;
  public static int PQSL_ACC5_NUMERO_PLUR = 30;
  public static int PQSL_ACC5_PROGR_UNITA_ORGANIZZATIVA = 31;
  public static int PQSL_ACC5_UTENTE_INSERIMENTO = 32;
  public static int PQSL_ACC5_DATA_INSERIMENTO = 33;
  public static int PQSL_ACC5_UTENTE_ULTIMO_AGG = 34;
  public static int PQSL_ACC5_DATA_ULTIMO_AGG = 35;
  public static int PQSL_ACC5_DEBITORE = 36;
  public static int PQSL_ACC5_TIPO_SERVIZIO = 37;
  public static int PQSL_ACC5_FINANZIAMENTO = 38;
  public static int PQSL_ACC5_SCHEDA_OBIETTIVO_ID = 39;
  public static int PQSL_ACC5_ACCCODMONITO = 40;
  public static int PQSL_ACC5_ACCCODLIVEL5 = 41;
  public static int PQSL_ACC5_ACCCODICEURO = 42;
  public static int PQSL_ACC5_ACCDATASCADE = 43;
  public static int PQSL_ACC5_ANNO_ACC_PROVENIENZA = 44;
  public static int PQSL_ACC5_NUMERO_ACC_PROVENIENZA = 45;
  public static int PQSL_ACC5_ACCDATREGECO = 46;
  public static int PQSL_ACC5_ACCFINANLIGH = 47;
  public static int PQSL_ACC5_ACCOPERALIGH = 48;
  public static int PQSL_ACC5_ANNOACCPREC = 49;
  public static int PQSL_ACC5_NUMERACCPREC = 50;

  // Table to contain panel selected row: Importo Totale
  //
  public static int PQRY_IMPORTTOTAL5 = 3030;
  public static int PQRY_IMPORTTOTAL5_RS = 3031;
  public static int PQSL_IMPORTTOTAL5_ROWNAMIMPATT = 0;

  // Table to contain panel selected row: ACCERTAMENTI
  //
  public static int PQRY_ACCERTAMENT1 = 3032;
  public static int PQSL_ACCERTAMENT1_CAPITOLO = 0;
  public static int PQSL_ACCERTAMENT1_ARTICOLO = 1;
  public static int PQSL_ACCERTAMENT1_ANNO_DEL = 2;
  public static int PQSL_ACCERTAMENT1_NUMERO_DEL = 3;
  public static int PQSL_ACCERTAMENT1_SEDE_DEL = 4;
  public static int PQSL_ACCERTAMENT1_DATA_REG = 5;
  public static int PQSL_ACCERTAMENT1_IMPORTO = 6;
  public static int PQSL_ACCERTAMENT1_DESCRIZIONE = 7;
  public static int PQSL_ACCERTAMENT1_CAUSALE = 8;
  public static int PQSL_ACCERTAMENT1_ESERCIZIO_SCADENZA = 9;
  public static int PQSL_ACCERTAMENT1_ANNO_INTROD = 10;
  public static int PQSL_ACCERTAMENT1_ANNO_PROPOSTA = 11;
  public static int PQSL_ACCERTAMENT1_UNITA_PROPONENTE = 12;
  public static int PQSL_ACCERTAMENT1_NUMERO_PROPOSTA = 13;
  public static int PQSL_ACCERTAMENT1_VOCE_ECON = 14;
  public static int PQSL_ACCERTAMENT1_TIPO_VINCOLO = 15;
  public static int PQSL_ACCERTAMENT1_D_DATA_REG = 16;
  public static int PQSL_ACCERTAMENT1_ANNO_PLUR = 17;
  public static int PQSL_ACCERTAMENT1_NUMERO_PLUR = 18;
  public static int PQSL_ACCERTAMENT1_CENTRO = 19;
  public static int PQSL_ACCERTAMENT1_FATTORE = 20;
  public static int PQSL_ACCERTAMENT1_COMPETENZA_DAL = 21;
  public static int PQSL_ACCERTAMENT1_COMPETENZA_AL = 22;
  public static int PQSL_ACCERTAMENT1_NOTE = 23;
  public static int PQSL_ACCERTAMENT1_RILEVANTE_ECO = 24;
  public static int PQSL_ACCERTAMENT1_COD_IMP_ECO = 25;
  public static int PQSL_ACCERTAMENT1_PROGETTO_ID = 26;
  public static int PQSL_ACCERTAMENT1_OBIETTIVO = 27;
  public static int PQSL_ACCERTAMENT1_CODICE_GESTIONALE = 28;
  public static int PQSL_ACCERTAMENT1_RESPONSABILE_RES = 29;
  public static int PQSL_ACCERTAMENT1_ANNO_ACC = 30;
  public static int PQSL_ACCERTAMENT1_NUMERO_ACC = 31;
  public static int PQSL_ACCERTAMENT1_DEBITORE = 32;
  public static int PQSL_ACCERTAMENT1_E = 33;
  public static int PQSL_ACCERTAMENT1_TIPO_SERVIZIO = 34;

  // Table to contain panel selected row: ACC OPE
  //
  public static int PQRY_ACCOPE1 = 3033;
  public static int PQSL_ACCOPE1_ANNO_ACC = 0;
  public static int PQSL_ACCOPE1_NUMERO_ACC = 1;
  public static int PQSL_ACCOPE1_OPERA = 2;
  public static int PQSL_ACCOPE1_FINANZIAMENTO = 3;
  public static int PQSL_ACCOPE1_IMPORTO = 4;
  public static int PQSL_ACCOPE1_CAPITOLO = 5;
  public static int PQSL_ACCOPE1_ARTICOLO = 6;
  public static int PQSL_ACCOPE1_INFOOPERA = 7;
  public static int PQSL_ACCOPE1_E = 8;

  // Table to contain panel selected row: Finanziamento
  //
  public static int PQRY_FINANZIAME11 = 3034;
  public static int PQRY_FINANZIAME11_RS = 3035;
  public static int PQSL_FINANZIAME11_PARAMFINANZI = 0;

  // Table to contain panel selected row: VISTA ACC UO UT
  //
  public static int PQRY_VISTAACCUOU2 = 3036;
  public static int PQSL_VISTAACCUOU2_ANNO_ACC = 0;
  public static int PQSL_VISTAACCUOU2_NUMERO_ACC = 1;
  public static int PQSL_VISTAACCUOU2_CAPITOLO = 2;
  public static int PQSL_VISTAACCUOU2_ARTICOLO = 3;
  public static int PQSL_VISTAACCUOU2_DESCRIZIONE = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI231 = 3037;
  public static int PQRY_PARAMETRI231_RS = 3038;
  public static int PQSL_PARAMETRI231_ANNO_IMP = 0;
  public static int PQSL_PARAMETRI231_NUMERO_IMP = 1;
  public static int PQSL_PARAMETRI231_ROWNAMEFINAN = 2;
  public static int PQSL_PARAMETRI231_ROWNAMECAPIT = 3;
  public static int PQSL_PARAMETRI231_ROWNAMEARTIC = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI211 = 3039;
  public static int PQRY_PARAMETRI211_RS = 3040;
  public static int PQSL_PARAMETRI211_ROWNAMECAP = 0;
  public static int PQSL_PARAMETRI211_ROWNAMEART = 1;
  public static int PQSL_PARAMETRI211_ROWNAMEACCER = 2;
  public static int PQSL_PARAMETRI211_ROWNAMEFINAN = 3;
  public static int PQSL_PARAMETRI211_ROWNAMEOPERA = 4;
  public static int PQSL_PARAMETRI211_ROWNAMOBIOPE = 5;
  public static int PQSL_PARAMETRI211_ROWNAMECGE = 6;
  public static int PQSL_PARAMETRI211_ROWNAMEVLIVE = 7;
  public static int PQSL_PARAMETRI211_ROWNAMCAPACC = 8;
  public static int PQSL_PARAMETRI211_ROWNAMARTACC = 9;
  public static int PQSL_PARAMETRI211_ROWNAMANACPR = 10;
  public static int PQSL_PARAMETRI211_ROWNAMNUACPR = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI212 = 3041;
  public static int PQRY_PARAMETRI212_RS = 3042;
  public static int PQSL_PARAMETRI212_ROWNAMACCDAL = 0;
  public static int PQSL_PARAMETRI212_ROWNAMEAL = 1;
  public static int PQSL_PARAMETRI212_ROWNAMDATELA = 2;
  public static int PQSL_PARAMETRI212_ROWNAMEXINEX = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI209 = 3043;
  public static int PQRY_PARAMETRI209_RS = 3044;
  public static int PQSL_PARAMETRI209_ROWNAMPERDAL = 0;
  public static int PQSL_PARAMETRI209_ROWNAMEPERAL = 1;
  public static int PQSL_PARAMETRI209_ROWNAMRESCOM = 2;
  public static int PQSL_PARAMETRI209_ROWNAMTIPVAR = 3;
  public static int PQSL_PARAMETRI209_SEDE_DEL = 4;
  public static int PQSL_PARAMETRI209_NUMERO_DEL = 5;
  public static int PQSL_PARAMETRI209_ANNO_DEL = 6;
  public static int PQSL_PARAMETRI209_ROWNAMEPROPO = 7;
  public static int PQSL_PARAMETRI209_ROWNAMANNPRO = 8;
  public static int PQSL_PARAMETRI209_ROWNAMNUMPRO = 9;

  // Table to contain panel selected row: ACC OPE
  //
  public static int PQRY_ACCOPE3 = 3045;
  public static int PQSL_ACCOPE3_ACCOPEOPERA = 0;
  public static int PQSL_ACCOPE3_ACCOPEDESCRI = 1;
  public static int PQSL_ACCOPE3_ACCOPEIMPORT = 2;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS55 = 3046;
  public static int PQRY_PARS55_RS = 3047;
  public static int PQSL_PARS55_NOMOGGANNESI = 0;
  public static int PQSL_PARS55_NOMEOGGPROUO = 1;
  public static int PQSL_PARS55_NOMEOGGEDELI = 2;
  public static int PQSL_PARS55_NOMOGGNUMDEL = 3;
  public static int PQSL_PARS55_NOMOGGANNDEL = 4;

  // Table to contain panel selected row: Variazioni Accertamenti
  //
  public static int PQRY_VARIAZACCER1 = 3048;
  public static int PQRY_VARIAZACCER1_RS = 3049;
  public static int PQSL_VARIAZACCER1_NOMOGGCACOST = 0;
  public static int PQSL_VARIAZACCER1_NOMOGGCOPICO = 1;
  public static int PQSL_VARIAZACCER1_NOMEOGGECAPI = 2;
  public static int PQSL_VARIAZACCER1_NOMOGGVARART = 3;
  public static int PQSL_VARIAZACCER1_INFOCAPITOLO = 4;
  public static int PQSL_VARIAZACCER1_NOMOGGNUMACC = 5;
  public static int PQSL_VARIAZACCER1_NOMOGGANNACC = 6;
  public static int PQSL_VARIAZACCER1_INFOACCERTAM = 7;
  public static int PQSL_VARIAZACCER1_NOMOGGACCDES = 8;
  public static int PQSL_VARIAZACCER1_NOMEOGGEIMPO = 9;
  public static int PQSL_VARIAZACCER1_NOMOGGANNESI = 10;
  public static int PQSL_VARIAZACCER1_NOMOGGVARPRO = 11;
  public static int PQSL_VARIAZACCER1_NOOGACPRUNOR = 12;
  public static int PQSL_VARIAZACCER1_NOMOGGTIPVAR = 13;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR115 = 3050;
  public static int PQRY_PAR115_RS = 3051;
  public static int PQSL_PAR115_NOMEOGGEDELI = 0;

  // Table to contain panel selected row: ACC REISCRITTI ANOMALI
  //
  public static int PQRY_ACCREISCANOM = 3052;
  public static int PQSL_ACCREISCANOM_IMSUACREAAAP = 0;
  public static int PQSL_ACCREISCANOM_IMSUACREANAP = 1;
  public static int PQSL_ACCREISCANOM_DESCRIZIONE_PROV = 2;
  public static int PQSL_ACCREISCANOM_CAPITOLO_PROV = 3;
  public static int PQSL_ACCREISCANOM_ARTICOLO_PROV = 4;
  public static int PQSL_ACCREISCANOM_CODICE_STRUTTURA_PROV = 5;
  public static int PQSL_ACCREISCANOM_LIVELLO_4_PROV = 6;
  public static int PQSL_ACCREISCANOM_LIVELLO_5_PROV = 7;
  public static int PQSL_ACCREISCANOM_IMPSUBREANU1 = 8;
  public static int PQSL_ACCREISCANOM_IMPSUBREANO1 = 9;
  public static int PQSL_ACCREISCANOM_IMSUACREAAAR = 10;
  public static int PQSL_ACCREISCANOM_IMSUACREANAR = 11;
  public static int PQSL_ACCREISCANOM_DESCRIZIONE_REISC = 12;
  public static int PQSL_ACCREISCANOM_CAPITOLO_REISC = 13;
  public static int PQSL_ACCREISCANOM_ARTICOLO_REISC = 14;
  public static int PQSL_ACCREISCANOM_CODICE_STRUTTURA_REISC = 15;
  public static int PQSL_ACCREISCANOM_LIVELLO_4_REISC = 16;
  public static int PQSL_ACCREISCANOM_LIVELLO_5_REISC = 17;
  public static int PQSL_ACCREISCANOM_IMPSUBREANUN = 18;
  public static int PQSL_ACCREISCANOM_IMPSUBREANOB = 19;

  // Table to contain panel selected row: PERIODI RIACCERTAMENTI
  //
  public static int PQRY_PERIODRIACCE = 3053;
  public static int PQSL_PERIODRIACCE_CODICE = 0;
  public static int PQSL_PERIODRIACCE_DESCRIZIONE = 1;
  public static int PQSL_PERIODRIACCE_DATA_INIZIO = 2;
  public static int PQSL_PERIODRIACCE_DATA_FINE = 3;
  public static int PQSL_PERIODRIACCE_TIPO = 4;
  public static int PQSL_PERIODRIACCE_FILTRO_DISP = 5;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS84 = 3054;
  public static int PQRY_PARS84_RS = 3055;
  public static int PQSL_PARS84_CODICE = 0;
  public static int PQSL_PARS84_NOMOGGESERIF = 1;
  public static int PQSL_PARS84_NOMEOGGEMISS = 2;
  public static int PQSL_PARS84_NOMEOGGEPROG = 3;
  public static int PQSL_PARS84_NOMEOGGETITO = 4;
  public static int PQSL_PARS84_NOMEOGGETTUO = 5;
  public static int PQSL_PARS84_NOMEOGGECAPI = 6;
  public static int PQSL_PARS84_NOMEOGGEARTI = 7;
  public static int PQSL_PARS84_NOMEOGGETTES = 8;

  // Table to contain panel selected row: VISTA ESTRAZ RIACC IMPSUBACC
  //
  public static int PQRY_VISESTRIAIM1 = 3056;
  public static int PQSL_VISESTRIAIM1_REVIESRIIMPU = 0;
  public static int PQSL_VISESTRIAIM1_DESCRIZIONUO = 1;
  public static int PQSL_VISESTRIAIM1_RECORDCAPITO = 2;
  public static int PQSL_VISESTRIAIM1_RECORDARTICO = 3;
  public static int PQSL_VISESTRIAIM1_RECORDDESCRI = 4;
  public static int PQSL_VISESTRIAIM1_RECORNUMEIMP = 5;
  public static int PQSL_VISESTRIAIM1_RECORANNOIMP = 6;
  public static int PQSL_VISESTRIAIM1_RECONUMESUBI = 7;
  public static int PQSL_VISESTRIAIM1_RECOANNOSUBI = 8;
  public static int PQSL_VISESTRIAIM1_RECDESIMPSUB = 9;
  public static int PQSL_VISESTRIAIM1_RECORIMPATTU = 10;
  public static int PQSL_VISESTRIAIM1_RECORDVARIAZ = 11;
  public static int PQSL_VISESTRIAIM1_RECORDISPFIN = 12;
  public static int PQSL_VISESTRIAIM1_RECODISPEFFE = 13;
  public static int PQSL_VISESTRIAIM1_ORDANNOSUBIM = 14;
  public static int PQSL_VISESTRIAIM1_ORDNUMERSUBI = 15;
  public static int PQSL_VISESTRIAIM1_LIQCONESERIF = 16;
  public static int PQSL_VISESTRIAIM1_RECORDMANDAT = 17;
  public static int PQSL_VISESTRIAIM1_INFOMAN = 18;
  public static int PQSL_VISESTRIAIM1_RECOCODLIVE4 = 19;
  public static int PQSL_VISESTRIAIM1_RECOCODLIVE5 = 20;
  public static int PQSL_VISESTRIAIM1_MISSIONE = 21;
  public static int PQSL_VISESTRIAIM1_PROGRAMMA = 22;
  public static int PQSL_VISESTRIAIM1_RECORDTITOLO = 23;
  public static int PQSL_VISESTRIAIM1_PROPOSVARIMP = 24;
  public static int PQSL_VISESTRIAIM1_PROPOSVARSUB = 25;
  public static int PQSL_VISESTRIAIM1_ORDINI = 26;
  public static int PQSL_VISESTRIAIM1_DISPOSIZIONI = 27;
  public static int PQSL_VISESTRIAIM1_DISTLIQ = 28;
  public static int PQSL_VISESTRIAIM1_RECODISPAL31 = 29;
  public static int PQSL_VISESTRIAIM1_REVIESRIINIP = 30;
  public static int PQSL_VISESTRIAIM1_REVIESRIIAIP = 31;
  public static int PQSL_VISESTRIAIM1_REVIESRIINSP = 32;
  public static int PQSL_VISESTRIAIM1_REVIESRIIASP = 33;
  public static int PQSL_VISESTRIAIM1_REVIESRIIDRS = 34;
  public static int PQSL_VISESTRIAIM1_REVIESRIIMCI = 35;

  // Table to contain panel selected row: PROPOSTE RIACC
  //
  public static int PQRY_PROPOSTRIAC1 = 3057;
  public static int PQSL_PROPOSTRIAC1_PROGRESSIVO = 0;
  public static int PQSL_PROPOSTRIAC1_PERIODO_RIACC = 1;
  public static int PQSL_PROPOSTRIAC1_ESERCIZIO = 2;
  public static int PQSL_PROPOSTRIAC1_E_S = 3;
  public static int PQSL_PROPOSTRIAC1_ANNO_IMPACC = 4;
  public static int PQSL_PROPOSTRIAC1_NUMERO_IMPACC = 5;
  public static int PQSL_PROPOSTRIAC1_ANNO_SUBIMP = 6;
  public static int PQSL_PROPOSTRIAC1_NUMERO_SUBIMP = 7;
  public static int PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA = 8;
  public static int PQSL_PROPOSTRIAC1_ANNO_ENTRATA = 9;
  public static int PQSL_PROPOSTRIAC1_IMPORTO_UFF = 10;
  public static int PQSL_PROPOSTRIAC1_NOTE_UFF = 11;
  public static int PQSL_PROPOSTRIAC1_IMPORTO_RAG = 12;
  public static int PQSL_PROPOSTRIAC1_NOTE_RAG = 13;
  public static int PQSL_PROPOSTRIAC1_TIPO_VAR = 14;
  public static int PQSL_PROPOSTRIAC1_FINANZIAMENTO_OPERA = 15;
  public static int PQSL_PROPOSTRIAC1_TIPO_AVANZO = 16;
  public static int PQSL_PROPOSTRIAC1_ANNO_ESIGIBILITA_CRONO = 17;
  public static int PQSL_PROPOSTRIAC1_ANNO_ENTRATA_CRONO = 18;
  public static int PQSL_PROPOSTRIAC1_FINANZIAMENTO_DESTINAZIONE = 19;

  // Table to contain panel selected row: Tipo Var
  //
  public static int PQRY_TIPOVAR1 = 3058;
  public static int PQRY_TIPOVAR1_RS = 3059;
  public static int PQSL_TIPOVAR1_NOMOGGTIPVAR = 0;
  public static int PQSL_TIPOVAR1_NOMOGGTIVAES = 1;
  public static int PQSL_TIPOVAR1_NOMOGGTIPAVA = 2;

  // Table to contain panel selected row: Parametrieleprm
  //
  public static int PQRY_PARAMETRIEL2 = 3060;
  public static int PQRY_PARAMETRIEL2_RS = 3061;
  public static int PQSL_PARAMETRIEL2_NOMOGIMSUOAC = 0;
  public static int PQSL_PARAMETRIEL2_CODICE = 1;
  public static int PQSL_PARAMETRIEL2_NOMOGGESERIF = 2;

  // Table to contain panel selected row: PROPOSTE RIACC
  //
  public static int PQRY_PROPOSTRIACC = 3062;
  public static int PQSL_PROPOSTRIACC_RECPRORIANIM = 0;
  public static int PQSL_PROPOSTRIACC_RECPRORINUIM = 1;
  public static int PQSL_PROPOSTRIACC_RECPRORIANSU = 2;
  public static int PQSL_PROPOSTRIACC_RECPRORINUSU = 3;
  public static int PQSL_PROPOSTRIACC_RECPRORIANES = 4;
  public static int PQSL_PROPOSTRIACC_RECPRORIANEN = 5;
  public static int PQSL_PROPOSTRIACC_RECPRORIIMUF = 6;
  public static int PQSL_PROPOSTRIACC_RECPRORINOUF = 7;
  public static int PQSL_PROPOSTRIACC_RECPRORIIMRA = 8;
  public static int PQSL_PROPOSTRIACC_RECPRORINORA = 9;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_ = 3063;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI547 = 3064;
  public static int PQRY_PARAMETRI547_RS = 3065;
  public static int PQSL_PARAMETRI547_NOMEOGGETTES = 0;
  public static int PQSL_PARAMETRI547_NOMEOGGEPERI = 1;
  public static int PQSL_PARAMETRI547_NOMEOGGEESER = 2;
  public static int PQSL_PARAMETRI547_NOMEOGGEPROG = 3;
  public static int PQSL_PARAMETRI547_DESCRIZIONE = 4;
  public static int PQSL_PARAMETRI547_NOMOGGDEDANO = 5;
  public static int PQSL_PARAMETRI547_ANNO_DEL = 6;
  public static int PQSL_PARAMETRI547_NUMERO_DEL = 7;
  public static int PQSL_PARAMETRI547_SEDE_DEL = 8;
  public static int PQSL_PARAMETRI547_ANNO_PROPOSTA = 9;
  public static int PQSL_PARAMETRI547_UNITA_PROPONENTE = 10;
  public static int PQSL_PARAMETRI547_NUMERO_PROPOSTA = 11;
  public static int PQSL_PARAMETRI547_NOMOGGDATVAR = 12;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI549 = 3066;
  public static int PQRY_PARAMETRI549_RS = 3067;
  public static int PQSL_PARAMETRI549_NOMEOGGETTES = 0;
  public static int PQSL_PARAMETRI549_NOMEOGGEPERI = 1;
  public static int PQSL_PARAMETRI549_NOMEOGGEESER = 2;
  public static int PQSL_PARAMETRI549_NOMEOGGEPROG = 3;

  // Table to contain panel selected row: P
  //
  public static int PQRY_P1 = 3068;
  public static int PQRY_P1_RS = 3069;
  public static int PQSL_P1_NOMOGGELPRES = 0;

  // Table to contain panel selected row: Parametrieleprm
  //
  public static int PQRY_PARAMETRIEL4 = 3070;
  public static int PQRY_PARAMETRIEL4_RS = 3071;
  public static int PQSL_PARAMETRIEL4_CODICE = 0;
  public static int PQSL_PARAMETRIEL4_NOMOGGESERIF = 1;
  public static int PQSL_PARAMETRIEL4_NOMOGGUNIORG = 2;
  public static int PQSL_PARAMETRIEL4_NOMEOGGENOTE = 3;
  public static int PQSL_PARAMETRIEL4_NOMEOGGEPART = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI154 = 3072;
  public static int PQRY_PARAMETRI154_RS = 3073;
  public static int PQSL_PARAMETRI154_ROWNAMEANNO = 0;
  public static int PQSL_PARAMETRI154_ROWNAMDATDAL = 1;
  public static int PQSL_PARAMETRI154_ROWNAMEDATAL = 2;
  public static int PQSL_PARAMETRI154_ROWNAMANNIMP = 3;
  public static int PQSL_PARAMETRI154_ROWNAMNUMIMP = 4;
  public static int PQSL_PARAMETRI154_ROWNAMANSUIM = 5;
  public static int PQSL_PARAMETRI154_ROWNAMNUSUIM = 6;
  public static int PQSL_PARAMETRI154_ROWNAMECAPIT = 7;
  public static int PQSL_PARAMETRI154_ROWNAMEARTIC = 8;
  public static int PQSL_PARAMETRI154_ROWNAMNUMDAL = 9;
  public static int PQSL_PARAMETRI154_ROWNAMENUMAL = 10;
  public static int PQSL_PARAMETRI154_ROWNAMPRUNOR = 11;

  // Table to contain panel selected row: DETTAGLI BUONI
  //
  public static int PQRY_DETTAGLBUON6 = 3074;
  public static int PQSL_DETTAGLBUON6_DETBUOANNBUO = 0;
  public static int PQSL_DETTAGLBUON6_DETBUONUMBUO = 1;
  public static int PQSL_DETTAGLBUON6_DETBUODAEMBU = 2;
  public static int PQSL_DETTAGLBUON6_DETBUOPROBUO = 3;
  public static int PQSL_DETTAGLBUON6_DETTBUONCHIU = 4;
  public static int PQSL_DETTAGLBUON6_DETBUOCATPRO = 5;
  public static int PQSL_DETTAGLBUON6_DETTBUONDESC = 6;
  public static int PQSL_DETTAGLBUON6_DETTBUONIMPO = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI562 = 3075;
  public static int PQRY_PARAMETRI562_RS = 3076;
  public static int PQSL_PARAMETRI562_PARCHIUORDCF = 0;

  // Table to contain panel selected row: Parametrieleprm
  //
  public static int PQRY_PARAMETRIEL1 = 3077;
  public static int PQRY_PARAMETRIEL1_RS = 3078;
  public static int PQSL_PARAMETRIEL1_CODICE = 0;
  public static int PQSL_PARAMETRIEL1_NOMOGGESERIF = 1;
  public static int PQSL_PARAMETRIEL1_NOMOGGUNIORG = 2;
  public static int PQSL_PARAMETRIEL1_NOMEOGGEPART = 3;
  public static int PQSL_PARAMETRIEL1_NOMOGGIMPRAG = 4;
  public static int PQSL_PARAMETRIEL1_NOMEOGGEORDI = 5;
  public static int PQSL_PARAMETRIEL1_NOMOGGDETSUB = 6;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS80 = 3079;
  public static int PQRY_PARS80_RS = 3080;
  public static int PQSL_PARS80_CODICE = 0;
  public static int PQSL_PARS80_NOMOGGESERIF = 1;
  public static int PQSL_PARS80_NOMEOGGETTUO = 2;
  public static int PQSL_PARS80_NOMEOGGETTES = 3;
  public static int PQSL_PARS80_NOOGANIMSUSP = 4;

  // Table to contain panel selected row: VISTA ESTRAZ RIACC IMPSUBACC
  //
  public static int PQRY_VISESTRIAIMP = 3081;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMPU = 0;
  public static int PQSL_VISESTRIAIMP_DESCRIZIONUO = 1;
  public static int PQSL_VISESTRIAIMP_RECORDCAPITO = 2;
  public static int PQSL_VISESTRIAIMP_RECORDARTICO = 3;
  public static int PQSL_VISESTRIAIMP_RECORDDESCRI = 4;
  public static int PQSL_VISESTRIAIMP_RECORNUMEIMP = 5;
  public static int PQSL_VISESTRIAIMP_RECORANNOIMP = 6;
  public static int PQSL_VISESTRIAIMP_RECONUMESUBI = 7;
  public static int PQSL_VISESTRIAIMP_RECOANNOSUBI = 8;
  public static int PQSL_VISESTRIAIMP_RECDESIMPSUB = 9;
  public static int PQSL_VISESTRIAIMP_REIMAL010120 = 10;
  public static int PQSL_VISESTRIAIMP_RECORDVARIAZ = 11;
  public static int PQSL_VISESTRIAIMP_RECORDISPFIN = 12;
  public static int PQSL_VISESTRIAIMP_RECODISPEFFE = 13;
  public static int PQSL_VISESTRIAIMP_ORDANNOSUBIM = 14;
  public static int PQSL_VISESTRIAIMP_ORDNUMERSUBI = 15;
  public static int PQSL_VISESTRIAIMP_LIQCONESERIF = 16;
  public static int PQSL_VISESTRIAIMP_RECORDMANDAT = 17;
  public static int PQSL_VISESTRIAIMP_INFOMAN = 18;
  public static int PQSL_VISESTRIAIMP_RECOCODLIVE4 = 19;
  public static int PQSL_VISESTRIAIMP_RECOCODLIVE5 = 20;
  public static int PQSL_VISESTRIAIMP_MISSIONE = 21;
  public static int PQSL_VISESTRIAIMP_PROGRAMMA = 22;
  public static int PQSL_VISESTRIAIMP_RECORDTITOLO = 23;
  public static int PQSL_VISESTRIAIMP_PROPOSVARIMP = 24;
  public static int PQSL_VISESTRIAIMP_PROPOSVARSUB = 25;
  public static int PQSL_VISESTRIAIMP_ORDINI = 26;
  public static int PQSL_VISESTRIAIMP_DISPOSIZIONI = 27;
  public static int PQSL_VISESTRIAIMP_DISTLIQ = 28;
  public static int PQSL_VISESTRIAIMP_RECODISPAL31 = 29;
  public static int PQSL_VISESTRIAIMP_RECIMPUFFIMP = 30;
  public static int PQSL_VISESTRIAIMP_RECIMPSUBUFF = 31;
  public static int PQSL_VISESTRIAIMP_RECORTIPOVAR = 32;
  public static int PQSL_VISESTRIAIMP_RECDESTIPVAR = 33;
  public static int PQSL_VISESTRIAIMP_RECOANNOESIG = 34;
  public static int PQSL_VISESTRIAIMP_RECOANNOENTR = 35;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMFO = 36;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMDF = 37;
  public static int PQSL_VISESTRIAIMP_RECORNOTEUFF = 38;
  public static int PQSL_VISESTRIAIMP_RECIMPRAGIMP = 39;
  public static int PQSL_VISESTRIAIMP_IMPRAGSUBIMP = 40;
  public static int PQSL_VISESTRIAIMP_RECORNOTERAG = 41;
  public static int PQSL_VISESTRIAIMP_REVIESRIINIP = 42;
  public static int PQSL_VISESTRIAIMP_REVIESRIIAIP = 43;
  public static int PQSL_VISESTRIAIMP_REVIESRIIDRS = 44;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMCB = 45;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMRS = 46;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMTA = 47;
  public static int PQSL_VISESTRIAIMP_REVIESRIIDTA = 48;
  public static int PQSL_VISESTRIAIMP_CRONOID = 49;
  public static int PQSL_VISESTRIAIMP_REVIESRIIMTV = 50;

  // Table to contain panel selected row: Parametri Differenze
  //
  public static int PQRY_PARAMEDIFFE1 = 3082;
  public static int PQRY_PARAMEDIFFE1_RS = 3083;
  public static int PQSL_PARAMEDIFFE1_NOMOGGTIPCON = 0;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO20 = 3084;
  public static int PQSL_NOTEFUNZIO20_MODULO = 0;
  public static int PQSL_NOTEFUNZIO20_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO20_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO20_DESCRIZIONE = 3;

  // Table to contain panel selected row: CONTROLLO RIACCERTAMENTI
  //
  public static int PQRY_CONTRORIACC1 = 3085;
  public static int PQSL_CONTRORIACC1_ESERCIZIO = 0;
  public static int PQSL_CONTRORIACC1_PERIODO_RIACC = 1;
  public static int PQSL_CONTRORIACC1_TOTIMP = 2;
  public static int PQSL_CONTRORIACC1_TOTSUBIMP = 3;
  public static int PQSL_CONTRORIACC1_TOTIMP_UFF = 4;
  public static int PQSL_CONTRORIACC1_TOTSUBIMP_UFF = 5;
  public static int PQSL_CONTRORIACC1_VISIBILE_RAG = 6;
  public static int PQSL_CONTRORIACC1_VISIBILE_UFF = 7;
  public static int PQSL_CONTRORIACC1_ANNO_ESIGIBILITA = 8;
  public static int PQSL_CONTRORIACC1_ANNO_ENTRATA = 9;
  public static int PQSL_CONTRORIACC1_TIPO_VAR = 10;
  public static int PQSL_CONTRORIACC1_TIPO_AVANZO = 11;
  public static int PQSL_CONTRORIACC1_FINANZIAMENTO_OPERA = 12;
  public static int PQSL_CONTRORIACC1_RECCONRINUIM = 13;
  public static int PQSL_CONTRORIACC1_RECCONRIANIM = 14;
  public static int PQSL_CONTRORIACC1_RECORIMPDESC = 15;

  // Table to contain panel selected row: CONTROLLO RIACCERTAMENTI
  //
  public static int PQRY_CONTRORIACCE = 3086;
  public static int PQSL_CONTRORIACCE_TOTIMP = 0;
  public static int PQSL_CONTRORIACCE_TOTSUBIMP = 1;
  public static int PQSL_CONTRORIACCE_TOTIMP_UFF = 2;
  public static int PQSL_CONTRORIACCE_TOTSUBIMP_UFF = 3;
  public static int PQSL_CONTRORIACCE_RECCONRINUIM = 4;
  public static int PQSL_CONTRORIACCE_RECCONRIANIM = 5;
  public static int PQSL_CONTRORIACCE_RECORIMPDESC = 6;

  // Table to contain panel selected row: Parametri Filtro
  //
  public static int PQRY_PARAMEFILTR1 = 3087;
  public static int PQRY_PARAMEFILTR1_RS = 3088;
  public static int PQSL_PARAMEFILTR1_NOMEOGGEESER = 0;
  public static int PQSL_PARAMEFILTR1_NOMOGGPERRIA = 1;
  public static int PQSL_PARAMEFILTR1_NOMOGGTIPCON = 2;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO13 = 3089;
  public static int PQSL_NOTEFUNZIO13_MODULO = 0;
  public static int PQSL_NOTEFUNZIO13_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO13_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO13_DESCRIZIONE = 3;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ58 = 3090;
  public static int PQSL_LIQ58_CAPITOLO = 0;
  public static int PQSL_LIQ58_ARTICOLO = 1;
  public static int PQSL_LIQ58_ANNO_LIQ = 2;
  public static int PQSL_LIQ58_NUMERO_LIQ = 3;
  public static int PQSL_LIQ58_ANNO_IMP = 4;
  public static int PQSL_LIQ58_NUMERO_IMP = 5;
  public static int PQSL_LIQ58_ANNO_SUBIMP = 6;
  public static int PQSL_LIQ58_NUMERO_SUBIMP = 7;
  public static int PQSL_LIQ58_ANNO_DEL = 8;
  public static int PQSL_LIQ58_NUMERO_DEL = 9;
  public static int PQSL_LIQ58_SEDE_DEL = 10;
  public static int PQSL_LIQ58_IMPORTO = 11;
  public static int PQSL_LIQ58_BENEFICIARIO = 12;
  public static int PQSL_LIQ58_ANNO_DOC = 13;
  public static int PQSL_LIQ58_NUMERO_DOC = 14;
  public static int PQSL_LIQ58_UFFICIO = 15;
  public static int PQSL_LIQ58_ANNO_PROPOSTA = 16;
  public static int PQSL_LIQ58_UNITA_PROPONENTE = 17;
  public static int PQSL_LIQ58_NUMERO_PROPOSTA = 18;
  public static int PQSL_LIQ58_D_DATA_REG = 19;
  public static int PQSL_LIQ58_ANNO_DISTINTA = 20;
  public static int PQSL_LIQ58_NUMERO_DISTINTA = 21;
  public static int PQSL_LIQ58_LIQINEMIS = 22;
  public static int PQSL_LIQ58_LIBERASOESES = 23;
  public static int PQSL_LIQ58_DESCRIZIONE = 24;
  public static int PQSL_LIQ58_LIQFINANZIAM = 25;
  public static int PQSL_LIQ58_TIPO_DISTINTA = 26;
  public static int PQSL_LIQ58_FAT_ANNO_PROG = 27;
  public static int PQSL_LIQ58_FAT_NUMERO_PROG = 28;
  public static int PQSL_LIQ58_LIQINFODOC = 29;
  public static int PQSL_LIQ58_NUMEROLIQRC = 30;
  public static int PQSL_LIQ58_ANNOLIQRC = 31;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI564 = 3091;
  public static int PQRY_PARAMETRI564_RS = 3092;
  public static int PQSL_PARAMETRI564_PARAMNUMEDAL = 0;
  public static int PQSL_PARAMETRI564_PARAMNUMERAL = 1;
  public static int PQSL_PARAMETRI564_PARAMDATADAL = 2;
  public static int PQSL_PARAMETRI564_PARAMDATAAL = 3;
  public static int PQSL_PARAMETRI564_PARAMORDINAM = 4;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ19 = 3093;
  public static int PQSL_LIQ19_CAPITOLO = 0;
  public static int PQSL_LIQ19_ARTICOLO = 1;
  public static int PQSL_LIQ19_ANNO_LIQ = 2;
  public static int PQSL_LIQ19_NUMERO_LIQ = 3;
  public static int PQSL_LIQ19_ANNO_IMP = 4;
  public static int PQSL_LIQ19_NUMERO_IMP = 5;
  public static int PQSL_LIQ19_ANNO_SUBIMP = 6;
  public static int PQSL_LIQ19_NUMERO_SUBIMP = 7;
  public static int PQSL_LIQ19_ANNO_DEL = 8;
  public static int PQSL_LIQ19_NUMERO_DEL = 9;
  public static int PQSL_LIQ19_SEDE_DEL = 10;
  public static int PQSL_LIQ19_DATA_REG = 11;
  public static int PQSL_LIQ19_IMPORTO = 12;
  public static int PQSL_LIQ19_RITENUTE = 13;
  public static int PQSL_LIQ19_DESCRIZIONE = 14;
  public static int PQSL_LIQ19_BENEFICIARIO = 15;
  public static int PQSL_LIQ19_ANNO_DOC = 16;
  public static int PQSL_LIQ19_NUMERO_DOC = 17;
  public static int PQSL_LIQ19_NUM_QUIETANZA = 18;
  public static int PQSL_LIQ19_CAUSALE = 19;
  public static int PQSL_LIQ19_BOLLO = 20;
  public static int PQSL_LIQ19_ANNO_MAND = 21;
  public static int PQSL_LIQ19_NUMERO_MAND = 22;
  public static int PQSL_LIQ19_DATA_PAGAM = 23;
  public static int PQSL_LIQ19_IMPORTO_PAGAM = 24;
  public static int PQSL_LIQ19_CODICE = 25;
  public static int PQSL_LIQ19_CAUSALE_IRPEF = 26;
  public static int PQSL_LIQ19_IMPONIBILE = 27;
  public static int PQSL_LIQ19_ALIQUOTA = 28;
  public static int PQSL_LIQ19_TIPO_VINCOLO = 29;
  public static int PQSL_LIQ19_RITENUTE_IRPEF = 30;
  public static int PQSL_LIQ19_IMPORTO_NON_SOG = 31;
  public static int PQSL_LIQ19_NUMERO_PAGAM = 32;
  public static int PQSL_LIQ19_DIVERSO_BEN = 33;
  public static int PQSL_LIQ19_LIQDIVERSBEN = 34;
  public static int PQSL_LIQ19_NUM_QUIETANZA_DIV_BEN = 35;
  public static int PQSL_LIQ19_UFFICIO = 36;
  public static int PQSL_LIQ19_ANNO_PROPOSTA = 37;
  public static int PQSL_LIQ19_UNITA_PROPONENTE = 38;
  public static int PQSL_LIQ19_NUMERO_PROPOSTA = 39;
  public static int PQSL_LIQ19_CODICE_SSN = 40;
  public static int PQSL_LIQ19_ALIQ_SSN_CD = 41;
  public static int PQSL_LIQ19_ALIQ_SSN_CE = 42;
  public static int PQSL_LIQ19_IMPONIBILE_SSN = 43;
  public static int PQSL_LIQ19_RITENUTE_SSN = 44;
  public static int PQSL_LIQ19_RITENUTE_SSN_CE = 45;
  public static int PQSL_LIQ19_CASSA = 46;
  public static int PQSL_LIQ19_IMPONIBILE_INPS = 47;
  public static int PQSL_LIQ19_ALIQUOTA_INPS = 48;
  public static int PQSL_LIQ19_RITENUTE_INPS = 49;
  public static int PQSL_LIQ19_RITENUTE_INPS_CE = 50;
  public static int PQSL_LIQ19_VOCE_ECON = 51;
  public static int PQSL_LIQ19_CODICE_PTC = 52;
  public static int PQSL_LIQ19_FAT_ANNO_PROG = 53;
  public static int PQSL_LIQ19_FAT_NUMERO_PROG = 54;
  public static int PQSL_LIQ19_S = 55;
  public static int PQSL_LIQ19_D_DATA_REG = 56;
  public static int PQSL_LIQ19_D_DATA_PAGAM = 57;
  public static int PQSL_LIQ19_NUMERO_CONTABILE = 58;
  public static int PQSL_LIQ19_DATA_CONTABILE = 59;
  public static int PQSL_LIQ19_PROGRESSIVO_TESO = 60;
  public static int PQSL_LIQ19_ANNO_DISTINTA = 61;
  public static int PQSL_LIQ19_NUMERO_DISTINTA = 62;
  public static int PQSL_LIQ19_ALIQUOTA_ADD = 63;
  public static int PQSL_LIQ19_RITENUTE_ADD = 64;
  public static int PQSL_LIQ19_LIRE_EURO = 65;
  public static int PQSL_LIQ19_PAGAMENTO_IN_EURO = 66;
  public static int PQSL_LIQ19_IMPORTO_EURO = 67;
  public static int PQSL_LIQ19_RITENUTE_EURO = 68;
  public static int PQSL_LIQ19_IMPONIBILE_EURO = 69;
  public static int PQSL_LIQ19_IMPORTO_NON_SOG_EURO = 70;
  public static int PQSL_LIQ19_RITENUTE_IRPEF_EURO = 71;
  public static int PQSL_LIQ19_IMPONIBILE_SSN_EURO = 72;
  public static int PQSL_LIQ19_RITENUTE_SSN_EURO = 73;
  public static int PQSL_LIQ19_RITENUTE_SSN_CE_EURO = 74;
  public static int PQSL_LIQ19_IMPONIBILE_INPS_EURO = 75;
  public static int PQSL_LIQ19_RITENUTE_INPS_EURO = 76;
  public static int PQSL_LIQ19_RITENUTE_INPS_CE_EURO = 77;
  public static int PQSL_LIQ19_RITENUTE_ADD_EURO = 78;
  public static int PQSL_LIQ19_RITENUTE_CASSE_PROF = 79;
  public static int PQSL_LIQ19_RITENUTE_CASSE_PROF_EURO = 80;
  public static int PQSL_LIQ19_ALIQUOTA_ADD_COM = 81;
  public static int PQSL_LIQ19_RITENUTE_ADD_COM_EURO = 82;
  public static int PQSL_LIQ19_RITENUTE_ADD_COM = 83;
  public static int PQSL_LIQ19_COD_IMP_ECO = 84;
  public static int PQSL_LIQ19_CODICE_INAIL = 85;
  public static int PQSL_LIQ19_ALIQUOTA_INAIL = 86;
  public static int PQSL_LIQ19_IMPONIBILE_INAIL = 87;
  public static int PQSL_LIQ19_RITENUTE_INAIL = 88;
  public static int PQSL_LIQ19_RITENUTE_INAIL_CE = 89;
  public static int PQSL_LIQ19_IMPONIBILE_INAIL_EURO = 90;
  public static int PQSL_LIQ19_RITENUTE_INAIL_EURO = 91;
  public static int PQSL_LIQ19_RITENUTE_INAIL_CE_EURO = 92;
  public static int PQSL_LIQ19_TIPO_DISTINTA = 93;
  public static int PQSL_LIQ19_FINANZIAMENTO = 94;
  public static int PQSL_LIQ19_SPESE = 95;
  public static int PQSL_LIQ19_SCADENZA = 96;
  public static int PQSL_LIQ19_ALLEGATI = 97;
  public static int PQSL_LIQ19_COMMISSIONI = 98;
  public static int PQSL_LIQ19_INFO_TESORIERE = 99;
  public static int PQSL_LIQ19_CODICE_GESTIONALE = 100;
  public static int PQSL_LIQ19_NOTE = 101;
  public static int PQSL_LIQ19_UTENTE_INSERIMENTO = 102;
  public static int PQSL_LIQ19_DATA_INSERIMENTO = 103;
  public static int PQSL_LIQ19_UTENTE_ULTIMO_AGG = 104;
  public static int PQSL_LIQ19_DATA_ULTIMO_AGG = 105;
  public static int PQSL_LIQ19_LIQINEMISSIO = 106;
  public static int PQSL_LIQ19_CIG = 107;
  public static int PQSL_LIQ19_CUP = 108;
  public static int PQSL_LIQ19_CODICE_COFOG = 109;
  public static int PQSL_LIQ19_COD_LIVELLO_5 = 110;
  public static int PQSL_LIQ19_CODICE_EUROPEO = 111;
  public static int PQSL_LIQ19_IMPORTO_IVA = 112;
  public static int PQSL_LIQ19_IMPORTO_IVA_IST = 113;
  public static int PQSL_LIQ19_TIPO_REGISTRO_DEF = 114;
  public static int PQSL_LIQ19_TIPO_BOLLATO_DEF = 115;
  public static int PQSL_LIQ19_ANNO_LIQ_RC = 116;
  public static int PQSL_LIQ19_NUMERO_LIQ_RC = 117;
  public static int PQSL_LIQ19_MOTIVO_ESCLUSIONE_CIG = 118;
  public static int PQSL_LIQ19_TIPO_DEBITO_SIOPE = 119;
  public static int PQSL_LIQ19_NUMERO_AVVISO_PAGOPA = 120;
  public static int PQSL_LIQ19_ESERCIZIO_PROVV = 121;
  public static int PQSL_LIQ19_PROGRESSIVO_PROVV = 122;
  public static int PQSL_LIQ19_PROGRESSIVO_PROV_DETT = 123;
  public static int PQSL_LIQ19_STIPENDI = 124;

  // Table to contain panel selected row: IMP ECO
  //
  public static int PQRY_IMPECO12 = 3094;
  public static int PQRY_IMPECO12_RS = 3095;
  public static int PQSL_IMPECO12_ESERCIZIO = 0;
  public static int PQSL_IMPECO12_PROGRESSIVO = 1;
  public static int PQSL_IMPECO12_ANNO_PROG = 2;
  public static int PQSL_IMPECO12_NUMERO_PROG = 3;
  public static int PQSL_IMPECO12_ANNO_LIQ = 4;
  public static int PQSL_IMPECO12_NUMERO_LIQ = 5;
  public static int PQSL_IMPECO12_ANNO_PRE = 6;
  public static int PQSL_IMPECO12_NUMERO_PRE = 7;
  public static int PQSL_IMPECO12_FATTORE = 8;
  public static int PQSL_IMPECO12_CENTRO = 9;
  public static int PQSL_IMPECO12_IMPORTO = 10;
  public static int PQSL_IMPECO12_COMPETENZA_DAL = 11;
  public static int PQSL_IMPECO12_COMPETENZA_AL = 12;
  public static int PQSL_IMPECO12_NOTE = 13;
  public static int PQSL_IMPECO12_IMPORTO_EURO = 14;
  public static int PQSL_IMPECO12_ANNO_ACC = 15;
  public static int PQSL_IMPECO12_NUMERO_ACC = 16;
  public static int PQSL_IMPECO12_ANNO_IMP = 17;
  public static int PQSL_IMPECO12_NUMERO_IMP = 18;
  public static int PQSL_IMPECO12_ANNO_SUBIMP = 19;
  public static int PQSL_IMPECO12_NUMERO_SUBIMP = 20;
  public static int PQSL_IMPECO12_PROGRESSIVO_VARACC = 21;
  public static int PQSL_IMPECO12_PROGRESSIVO_VARIMP = 22;
  public static int PQSL_IMPECO12_PROGRESSIVO_VARSUB = 23;
  public static int PQSL_IMPECO12_NO_IVA = 24;
  public static int PQSL_IMPECO12_PROGETTO_ID = 25;
  public static int PQSL_IMPECO12_IVA = 26;
  public static int PQSL_IMPECO12_IMPECOSTATO = 27;
  public static int PQSL_IMPECO12_CAMPO_LIBERO_1 = 28;
  public static int PQSL_IMPECO12_CAMPO_LIBERO_2 = 29;
  public static int PQSL_IMPECO12_PROGR_SCHEDA_CIWEB = 30;

  // Table to contain panel selected row: Imdb Schede Inventario Liq
  //
  public static int PQRY_IMDSCHINVLI1 = 3096;
  public static int PQRY_IMDSCHINVLI1_RS = 3097;
  public static int PQSL_IMDSCHINVLI1_PROGRESSIVO = 0;
  public static int PQSL_IMDSCHINVLI1_PROGR_SCHEDA_CIWEB = 1;
  public static int PQSL_IMDSCHINVLI1_NUMERO_LIQ = 2;
  public static int PQSL_IMDSCHINVLI1_ANNO_LIQ = 3;
  public static int PQSL_IMDSCHINVLI1_IMPORTO = 4;
  public static int PQSL_IMDSCHINVLI1_NOTE = 5;
  public static int PQSL_IMDSCHINVLI1_PROGRESSIVO_BOAC = 6;
  public static int PQSL_IMDSCHINVLI1_ANNO_PROG_FAT = 7;
  public static int PQSL_IMDSCHINVLI1_NUMERO_PROG_FAT = 8;
  public static int PQSL_IMDSCHINVLI1_SCHINVLIQSTA = 9;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV89 = 3098;
  public static int QSL_CFASELINTV89_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV12 = 3099;
  public static int QSL_CFASELINTV12_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV14 = 3100;
  public static int QSL_CFASELINTV14_SUNUVAIMECI0 = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV13 = 3101;
  public static int QSL_CFASELINTV13_SUNUVASCILI0 = 0;

  // Recordset for query: IMP ECO
  //
  public static int QRY_IMPECO1 = 3102;
  public static int QSL_IMPECO1_IMPECOESERCI = 0;
  public static int QSL_IMPECO1_IMPECOPROGRE = 1;
  public static int QSL_IMPECO1_IMPECOANNPRO = 2;
  public static int QSL_IMPECO1_IMPECONUMPRO = 3;
  public static int QSL_IMPECO1_IMPECOANNLIQ = 4;
  public static int QSL_IMPECO1_IMPECONUMLIQ = 5;
  public static int QSL_IMPECO1_IMPECOANNPRE = 6;
  public static int QSL_IMPECO1_IMPECONUMPRE = 7;
  public static int QSL_IMPECO1_IMPECOFATTOR = 8;
  public static int QSL_IMPECO1_IMPECOCENTRO = 9;
  public static int QSL_IMPECO1_IMPECOIMPORT = 10;
  public static int QSL_IMPECO1_IMPECOCOMDAL = 11;
  public static int QSL_IMPECO1_IMPECOCOMPAL = 12;
  public static int QSL_IMPECO1_IMPECONOTE = 13;
  public static int QSL_IMPECO1_IMPECOIMPEUR = 14;
  public static int QSL_IMPECO1_IMPECOANNACC = 15;
  public static int QSL_IMPECO1_IMPECONUMACC = 16;
  public static int QSL_IMPECO1_IMPECOANNIMP = 17;
  public static int QSL_IMPECO1_IMPECONUMIMP = 18;
  public static int QSL_IMPECO1_IMPECOANNSUB = 19;
  public static int QSL_IMPECO1_IMPECONUMSUB = 20;
  public static int QSL_IMPECO1_IMPECOPROVA1 = 21;
  public static int QSL_IMPECO1_IMPECOPROVA2 = 22;
  public static int QSL_IMPECO1_IMPECOPROVAR = 23;
  public static int QSL_IMPECO1_IMPECONOIVA = 24;
  public static int QSL_IMPECO1_IMPECOPROGID = 25;
  public static int QSL_IMPECO1_IMPECOIVA = 26;
  public static int QSL_IMPECO1_IMPECOSTATO = 27;
  public static int QSL_IMPECO1_IMPECOCAMLI1 = 28;
  public static int QSL_IMPECO1_IMPECOCAMLI2 = 29;
  public static int QSL_IMPECO1_IMPECOPRSCCI = 30;

  // Recordset for query: Imdb Schede Inventario Liq
  //
  public static int QRY_IMDSCHINVLIQ = 3103;
  public static int QSL_IMDSCHINVLIQ_RECPROGRESS1 = 0;
  public static int QSL_IMDSCHINVLIQ_RECANNOLIQ = 1;
  public static int QSL_IMDSCHINVLIQ_RECNUMEROLIQ = 2;
  public static int QSL_IMDSCHINVLIQ_RECANNOPROGF = 3;
  public static int QSL_IMDSCHINVLIQ_RECNUMEROPRO = 4;
  public static int QSL_IMDSCHINVLIQ_RECIMPORTO = 5;
  public static int QSL_IMDSCHINVLIQ_RECPROGRSCHE = 6;
  public static int QSL_IMDSCHINVLIQ_RECPROGRESSI = 7;
  public static int QSL_IMDSCHINVLIQ_RECNOTE = 8;
  public static int QSL_IMDSCHINVLIQ_RECSTATO = 9;

  // Table to contain panel selected row: Diverso Beneficiario
  //
  public static int PQRY_DIVERSBENEF5 = 3104;
  public static int PQRY_DIVERSBENEF5_RS = 3105;
  public static int PQSL_DIVERSBENEF5_DIVDIVERSBEN = 0;
  public static int PQSL_DIVERSBENEF5_DIVBENCODICE = 1;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIAR13 = 3106;
  public static int PQRY_BENEFICIAR13_RS = 3107;
  public static int PQSL_BENEFICIAR13_BENBENEFICIA = 0;
  public static int PQSL_BENEFICIAR13_BENCODICE = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI236 = 3108;
  public static int PQRY_PARAMETRI236_RS = 3109;
  public static int PQSL_PARAMETRI236_PARAMINEMISS = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI692 = 3110;
  public static int PQRY_PARAMETRI692_RS = 3111;
  public static int PQSL_PARAMETRI692_VALCOMCKDIBE = 0;
  public static int PQSL_PARAMETRI692_VALCOMCODIBE = 1;
  public static int PQSL_PARAMETRI692_VACONUQTDIBE = 2;
  public static int PQSL_PARAMETRI692_VALOCOMINEMI = 3;
  public static int PQSL_PARAMETRI692_VALOCOMCKCON = 4;
  public static int PQSL_PARAMETRI692_NUMERO_CONTABILE = 5;
  public static int PQSL_PARAMETRI692_DATA_CONTABILE = 6;
  public static int PQSL_PARAMETRI692_VALOCOMCKCIG = 7;
  public static int PQSL_PARAMETRI692_CIG = 8;
  public static int PQSL_PARAMETRI692_VALCOMCKESCI = 9;
  public static int PQSL_PARAMETRI692_ESCLUSIONE_CIG = 10;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ30 = 3112;
  public static int PQSL_LIQ30_CAPITOLO = 0;
  public static int PQSL_LIQ30_ARTICOLO = 1;
  public static int PQSL_LIQ30_ANNO_LIQ = 2;
  public static int PQSL_LIQ30_NUMERO_LIQ = 3;
  public static int PQSL_LIQ30_ANNO_IMP = 4;
  public static int PQSL_LIQ30_NUMERO_IMP = 5;
  public static int PQSL_LIQ30_ANNO_SUBIMP = 6;
  public static int PQSL_LIQ30_NUMERO_SUBIMP = 7;
  public static int PQSL_LIQ30_ANNO_DEL = 8;
  public static int PQSL_LIQ30_NUMERO_DEL = 9;
  public static int PQSL_LIQ30_SEDE_DEL = 10;
  public static int PQSL_LIQ30_DATA_REG = 11;
  public static int PQSL_LIQ30_IMPORTO = 12;
  public static int PQSL_LIQ30_RITENUTE = 13;
  public static int PQSL_LIQ30_DESCRIZIONE = 14;
  public static int PQSL_LIQ30_BENEFICIARIO = 15;
  public static int PQSL_LIQ30_ANNO_DOC = 16;
  public static int PQSL_LIQ30_NUMERO_DOC = 17;
  public static int PQSL_LIQ30_NUM_QUIETANZA = 18;
  public static int PQSL_LIQ30_CAUSALE = 19;
  public static int PQSL_LIQ30_BOLLO = 20;
  public static int PQSL_LIQ30_ANNO_MAND = 21;
  public static int PQSL_LIQ30_NUMERO_MAND = 22;
  public static int PQSL_LIQ30_DATA_PAGAM = 23;
  public static int PQSL_LIQ30_IMPORTO_PAGAM = 24;
  public static int PQSL_LIQ30_CODICE = 25;
  public static int PQSL_LIQ30_CAUSALE_IRPEF = 26;
  public static int PQSL_LIQ30_IMPONIBILE = 27;
  public static int PQSL_LIQ30_ALIQUOTA = 28;
  public static int PQSL_LIQ30_TIPO_VINCOLO = 29;
  public static int PQSL_LIQ30_RITENUTE_IRPEF = 30;
  public static int PQSL_LIQ30_IMPORTO_NON_SOG = 31;
  public static int PQSL_LIQ30_NUMERO_PAGAM = 32;
  public static int PQSL_LIQ30_DIVERSO_BEN = 33;
  public static int PQSL_LIQ30_LIQDIVERSBEN = 34;
  public static int PQSL_LIQ30_NUM_QUIETANZA_DIV_BEN = 35;
  public static int PQSL_LIQ30_UFFICIO = 36;
  public static int PQSL_LIQ30_ANNO_PROPOSTA = 37;
  public static int PQSL_LIQ30_UNITA_PROPONENTE = 38;
  public static int PQSL_LIQ30_NUMERO_PROPOSTA = 39;
  public static int PQSL_LIQ30_CODICE_SSN = 40;
  public static int PQSL_LIQ30_ALIQ_SSN_CD = 41;
  public static int PQSL_LIQ30_ALIQ_SSN_CE = 42;
  public static int PQSL_LIQ30_IMPONIBILE_SSN = 43;
  public static int PQSL_LIQ30_RITENUTE_SSN = 44;
  public static int PQSL_LIQ30_RITENUTE_SSN_CE = 45;
  public static int PQSL_LIQ30_CASSA = 46;
  public static int PQSL_LIQ30_IMPONIBILE_INPS = 47;
  public static int PQSL_LIQ30_ALIQUOTA_INPS = 48;
  public static int PQSL_LIQ30_RITENUTE_INPS = 49;
  public static int PQSL_LIQ30_RITENUTE_INPS_CE = 50;
  public static int PQSL_LIQ30_VOCE_ECON = 51;
  public static int PQSL_LIQ30_CODICE_PTC = 52;
  public static int PQSL_LIQ30_FAT_ANNO_PROG = 53;
  public static int PQSL_LIQ30_FAT_NUMERO_PROG = 54;
  public static int PQSL_LIQ30_S = 55;
  public static int PQSL_LIQ30_D_DATA_REG = 56;
  public static int PQSL_LIQ30_D_DATA_PAGAM = 57;
  public static int PQSL_LIQ30_NUMERO_CONTABILE = 58;
  public static int PQSL_LIQ30_DATA_CONTABILE = 59;
  public static int PQSL_LIQ30_PROGRESSIVO_TESO = 60;
  public static int PQSL_LIQ30_ANNO_DISTINTA = 61;
  public static int PQSL_LIQ30_NUMERO_DISTINTA = 62;
  public static int PQSL_LIQ30_ALIQUOTA_ADD = 63;
  public static int PQSL_LIQ30_RITENUTE_ADD = 64;
  public static int PQSL_LIQ30_LIRE_EURO = 65;
  public static int PQSL_LIQ30_PAGAMENTO_IN_EURO = 66;
  public static int PQSL_LIQ30_IMPORTO_EURO = 67;
  public static int PQSL_LIQ30_RITENUTE_EURO = 68;
  public static int PQSL_LIQ30_IMPONIBILE_EURO = 69;
  public static int PQSL_LIQ30_IMPORTO_NON_SOG_EURO = 70;
  public static int PQSL_LIQ30_RITENUTE_IRPEF_EURO = 71;
  public static int PQSL_LIQ30_IMPONIBILE_SSN_EURO = 72;
  public static int PQSL_LIQ30_RITENUTE_SSN_EURO = 73;
  public static int PQSL_LIQ30_RITENUTE_SSN_CE_EURO = 74;
  public static int PQSL_LIQ30_IMPONIBILE_INPS_EURO = 75;
  public static int PQSL_LIQ30_RITENUTE_INPS_EURO = 76;
  public static int PQSL_LIQ30_RITENUTE_INPS_CE_EURO = 77;
  public static int PQSL_LIQ30_RITENUTE_ADD_EURO = 78;
  public static int PQSL_LIQ30_RITENUTE_CASSE_PROF = 79;
  public static int PQSL_LIQ30_RITENUTE_CASSE_PROF_EURO = 80;
  public static int PQSL_LIQ30_ALIQUOTA_ADD_COM = 81;
  public static int PQSL_LIQ30_RITENUTE_ADD_COM_EURO = 82;
  public static int PQSL_LIQ30_RITENUTE_ADD_COM = 83;
  public static int PQSL_LIQ30_COD_IMP_ECO = 84;
  public static int PQSL_LIQ30_CODICE_INAIL = 85;
  public static int PQSL_LIQ30_ALIQUOTA_INAIL = 86;
  public static int PQSL_LIQ30_IMPONIBILE_INAIL = 87;
  public static int PQSL_LIQ30_RITENUTE_INAIL = 88;
  public static int PQSL_LIQ30_RITENUTE_INAIL_CE = 89;
  public static int PQSL_LIQ30_IMPONIBILE_INAIL_EURO = 90;
  public static int PQSL_LIQ30_RITENUTE_INAIL_EURO = 91;
  public static int PQSL_LIQ30_RITENUTE_INAIL_CE_EURO = 92;
  public static int PQSL_LIQ30_TIPO_DISTINTA = 93;
  public static int PQSL_LIQ30_FINANZIAMENTO = 94;
  public static int PQSL_LIQ30_SPESE = 95;
  public static int PQSL_LIQ30_SCADENZA = 96;
  public static int PQSL_LIQ30_ALLEGATI = 97;
  public static int PQSL_LIQ30_COMMISSIONI = 98;
  public static int PQSL_LIQ30_INFO_TESORIERE = 99;
  public static int PQSL_LIQ30_CODICE_GESTIONALE = 100;
  public static int PQSL_LIQ30_NOTE = 101;
  public static int PQSL_LIQ30_UTENTE_INSERIMENTO = 102;
  public static int PQSL_LIQ30_DATA_INSERIMENTO = 103;
  public static int PQSL_LIQ30_UTENTE_ULTIMO_AGG = 104;
  public static int PQSL_LIQ30_DATA_ULTIMO_AGG = 105;
  public static int PQSL_LIQ30_LIQINEMISSIO = 106;
  public static int PQSL_LIQ30_LIQCIG = 107;
  public static int PQSL_LIQ30_LIQCUP = 108;
  public static int PQSL_LIQ30_LIQCODLIVEL5 = 109;
  public static int PQSL_LIQ30_LIQCODICCOFO = 110;
  public static int PQSL_LIQ30_LIQCODICEURO = 111;
  public static int PQSL_LIQ30_LIQIMPORTIVA = 112;
  public static int PQSL_LIQ30_LIQIMPIVAIST = 113;
  public static int PQSL_LIQ30_LIQTIPREGDEF = 114;
  public static int PQSL_LIQ30_LIQTIPBOLDEF = 115;
  public static int PQSL_LIQ30_NUMEROLIQRC = 116;
  public static int PQSL_LIQ30_ANNOLIQRC = 117;
  public static int PQSL_LIQ30_LIQMOTESCCIG = 118;
  public static int PQSL_LIQ30_LIQTIPDEBSIO = 119;
  public static int PQSL_LIQ30_LIQNUMAVVPAG = 120;
  public static int PQSL_LIQ30_LIQSTIPENDI = 121;

  // Table to contain panel selected row: IMP ECO
  //
  public static int PQRY_IMPECO2 = 3113;
  public static int PQSL_IMPECO2_ESERCIZIO = 0;
  public static int PQSL_IMPECO2_PROGRESSIVO = 1;
  public static int PQSL_IMPECO2_ANNO_PROG = 2;
  public static int PQSL_IMPECO2_NUMERO_PROG = 3;
  public static int PQSL_IMPECO2_ANNO_LIQ = 4;
  public static int PQSL_IMPECO2_NUMERO_LIQ = 5;
  public static int PQSL_IMPECO2_ANNO_PRE = 6;
  public static int PQSL_IMPECO2_NUMERO_PRE = 7;
  public static int PQSL_IMPECO2_FATTORE = 8;
  public static int PQSL_IMPECO2_CENTRO = 9;
  public static int PQSL_IMPECO2_IMPORTO = 10;
  public static int PQSL_IMPECO2_COMPETENZA_DAL = 11;
  public static int PQSL_IMPECO2_COMPETENZA_AL = 12;
  public static int PQSL_IMPECO2_NOTE = 13;
  public static int PQSL_IMPECO2_IMPORTO_EURO = 14;
  public static int PQSL_IMPECO2_ANNO_ACC = 15;
  public static int PQSL_IMPECO2_NUMERO_ACC = 16;
  public static int PQSL_IMPECO2_ANNO_IMP = 17;
  public static int PQSL_IMPECO2_NUMERO_IMP = 18;
  public static int PQSL_IMPECO2_ANNO_SUBIMP = 19;
  public static int PQSL_IMPECO2_NUMERO_SUBIMP = 20;
  public static int PQSL_IMPECO2_PROGRESSIVO_VARACC = 21;
  public static int PQSL_IMPECO2_PROGRESSIVO_VARIMP = 22;
  public static int PQSL_IMPECO2_PROGRESSIVO_VARSUB = 23;
  public static int PQSL_IMPECO2_NO_IVA = 24;
  public static int PQSL_IMPECO2_PROGETTO_ID = 25;
  public static int PQSL_IMPECO2_IVA = 26;
  public static int PQSL_IMPECO2_IMPECOAPRNOT = 27;
  public static int PQSL_IMPECO2_IMPECOCAMLI1 = 28;
  public static int PQSL_IMPECO2_IMPECOCAMLI2 = 29;

  // Table to contain panel selected row: Diverso Beneficiario
  //
  public static int PQRY_DIVERSBENEF3 = 3114;
  public static int PQRY_DIVERSBENEF3_RS = 3115;
  public static int PQSL_DIVERSBENEF3_DIVBENRAGSOC = 0;
  public static int PQSL_DIVERSBENEF3_DIVBENCODICE = 1;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIAR10 = 3116;
  public static int PQRY_BENEFICIAR10_RS = 3117;
  public static int PQSL_BENEFICIAR10_BENRAGIOSOCI = 0;
  public static int PQSL_BENEFICIAR10_BENCODICE = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI206 = 3118;
  public static int PQRY_PARAMETRI206_RS = 3119;
  public static int PQSL_PARAMETRI206_PARAMINEMISS = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI527 = 3120;
  public static int PQRY_PARAMETRI527_RS = 3121;
  public static int PQSL_PARAMETRI527_PARELIDETDIS = 0;
  public static int PQSL_PARAMETRI527_PARARIAPDIST = 1;
  public static int PQSL_PARAMETRI527_PARAMANNOLIQ = 2;
  public static int PQSL_PARAMETRI527_PARAMNUMELIQ = 3;
  public static int PQSL_PARAMETRI527_PARAANNODIST = 4;
  public static int PQSL_PARAMETRI527_PARANUMEDIST = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI280 = 3122;
  public static int PQRY_PARAMETRI280_RS = 3123;
  public static int PQSL_PARAMETRI280_PARACODIGRUP = 0;
  public static int PQSL_PARAMETRI280_PARADESCGRUP = 1;
  public static int PQSL_PARAMETRI280_PARAENTRSPES = 2;
  public static int PQSL_PARAMETRI280_PARAMTIPO = 3;
  public static int PQSL_PARAMETRI280_PARDATULTELA = 4;
  public static int PQSL_PARAMETRI280_PARLOODIVBEN = 5;
  public static int PQSL_PARAMETRI280_PARLOOQUDIBE = 6;
  public static int PQSL_PARAMETRI280_PARAMLISTA = 7;
  public static int PQSL_PARAMETRI280_PARAMORDINAM = 8;
  public static int PQSL_PARAMETRI280_PARVISDETREG = 9;

  // Table to contain panel selected row: GRL
  //
  public static int PQRY_GRL1 = 3124;
  public static int PQSL_GRL1_PROGRESSIVO = 0;
  public static int PQSL_GRL1_GRUPPO = 1;
  public static int PQSL_GRL1_CAPITOLO = 2;
  public static int PQSL_GRL1_GRLCAPITOOLD = 3;
  public static int PQSL_GRL1_ARTICOLO = 4;
  public static int PQSL_GRL1_GRLARTICOOLD = 5;
  public static int PQSL_GRL1_ANNO_IMP = 6;
  public static int PQSL_GRL1_GRLANNIMPOLD = 7;
  public static int PQSL_GRL1_NUMERO_IMP = 8;
  public static int PQSL_GRL1_GRLNUMIMPOLD = 9;
  public static int PQSL_GRL1_ANNO_SUBIMP = 10;
  public static int PQSL_GRL1_GRLANNSUBOLD = 11;
  public static int PQSL_GRL1_NUMERO_SUBIMP = 12;
  public static int PQSL_GRL1_GRLNUMSUBOLD = 13;
  public static int PQSL_GRL1_SE_SUBIMPEGNO = 14;
  public static int PQSL_GRL1_BENEFICIARIO = 15;
  public static int PQSL_GRL1_GRLBENEFIOLD = 16;
  public static int PQSL_GRL1_BOLLO = 17;
  public static int PQSL_GRL1_ANNO_DEL = 18;
  public static int PQSL_GRL1_NUMERO_DEL = 19;
  public static int PQSL_GRL1_SEDE_DEL = 20;
  public static int PQSL_GRL1_ANNO_PROPOSTA = 21;
  public static int PQSL_GRL1_NUMERO_PROPOSTA = 22;
  public static int PQSL_GRL1_UNITA_PROPONENTE = 23;
  public static int PQSL_GRL1_IMPORTO = 24;
  public static int PQSL_GRL1_RITENUTE = 25;
  public static int PQSL_GRL1_IMPONIBILE = 26;
  public static int PQSL_GRL1_GRLIMPONIOLD = 27;
  public static int PQSL_GRL1_IMPORTO_NON_SOG = 28;
  public static int PQSL_GRL1_ALIQUOTA = 29;
  public static int PQSL_GRL1_GRLALIQUOOLD = 30;
  public static int PQSL_GRL1_RITENUTE_IRPEF = 31;
  public static int PQSL_GRL1_GRLRITIRPOLD = 32;
  public static int PQSL_GRL1_CAUSALE_IRPEF = 33;
  public static int PQSL_GRL1_CODICE = 34;
  public static int PQSL_GRL1_DESCRIZIONE = 35;
  public static int PQSL_GRL1_NUM_QUIETANZA = 36;
  public static int PQSL_GRL1_GRLNUMQUIOLD = 37;
  public static int PQSL_GRL1_VOCE_ECON = 38;
  public static int PQSL_GRL1_GRLVOCECOOLD = 39;
  public static int PQSL_GRL1_TIPO_VINCOLO = 40;
  public static int PQSL_GRL1_COD_PTC = 41;
  public static int PQSL_GRL1_S = 42;
  public static int PQSL_GRL1_CENTRO = 43;
  public static int PQSL_GRL1_FATTORE = 44;
  public static int PQSL_GRL1_COMPETENZA_DAL = 45;
  public static int PQSL_GRL1_COMPETENZA_AL = 46;
  public static int PQSL_GRL1_CODICE_SSN = 47;
  public static int PQSL_GRL1_GRLCODSSNOLD = 48;
  public static int PQSL_GRL1_ALIQ_SSN_CD = 49;
  public static int PQSL_GRL1_ALIQ_SSN_CE = 50;
  public static int PQSL_GRL1_IMPONIBILE_SSN = 51;
  public static int PQSL_GRL1_GRLIMPSSNOLD = 52;
  public static int PQSL_GRL1_RITENUTE_SSN = 53;
  public static int PQSL_GRL1_RITENUTE_SSN_CE = 54;
  public static int PQSL_GRL1_CASSA = 55;
  public static int PQSL_GRL1_GRLCASSAOLD = 56;
  public static int PQSL_GRL1_IMPONIBILE_INPS = 57;
  public static int PQSL_GRL1_GRLIMPINPOLD = 58;
  public static int PQSL_GRL1_ALIQUOTA_INPS = 59;
  public static int PQSL_GRL1_RITENUTE_INPS = 60;
  public static int PQSL_GRL1_GRLRITINPOLD = 61;
  public static int PQSL_GRL1_RITENUTE_INPS_CE = 62;
  public static int PQSL_GRL1_ALIQUOTA_ADD = 63;
  public static int PQSL_GRL1_GRLALIADDOLD = 64;
  public static int PQSL_GRL1_RITENUTE_ADD = 65;
  public static int PQSL_GRL1_GRLRITADDOLD = 66;
  public static int PQSL_GRL1_RITENUTE_CASSE_PROF = 67;
  public static int PQSL_GRL1_ALIQUOTA_ADD_COM = 68;
  public static int PQSL_GRL1_GRLALIADCOOL = 69;
  public static int PQSL_GRL1_RITENUTE_ADD_COM = 70;
  public static int PQSL_GRL1_GRLRITADCOOL = 71;
  public static int PQSL_GRL1_RITENUTE_ADD_COM_EURO = 72;
  public static int PQSL_GRL1_CODICE_INAIL = 73;
  public static int PQSL_GRL1_GRLCODINAOLD = 74;
  public static int PQSL_GRL1_ALIQUOTA_INAIL = 75;
  public static int PQSL_GRL1_IMPONIBILE_INAIL = 76;
  public static int PQSL_GRL1_GRLIMPINAOLD = 77;
  public static int PQSL_GRL1_RITENUTE_INAIL = 78;
  public static int PQSL_GRL1_GRLRITINAOLD = 79;
  public static int PQSL_GRL1_RITENUTE_INAIL_CE = 80;
  public static int PQSL_GRL1_FINANZIAMENTO = 81;
  public static int PQSL_GRL1_GRLFINANZOLD = 82;
  public static int PQSL_GRL1_OPERA = 83;
  public static int PQSL_GRL1_DIVERSO_BEN = 84;
  public static int PQSL_GRL1_GRLDIVBENOLD = 85;
  public static int PQSL_GRL1_NUM_QUIETANZA_DIV_BEN = 86;
  public static int PQSL_GRL1_CCF = 87;
  public static int PQSL_GRL1_ANNO_LIQ = 88;
  public static int PQSL_GRL1_NUMERO_LIQ = 89;
  public static int PQSL_GRL1_SPESE = 90;
  public static int PQSL_GRL1_GRLSPESEOLD = 91;
  public static int PQSL_GRL1_SCADENZA = 92;
  public static int PQSL_GRL1_ALLEGATI = 93;
  public static int PQSL_GRL1_COMMISSIONI = 94;
  public static int PQSL_GRL1_INFO_TESORIERE = 95;
  public static int PQSL_GRL1_CODICE_GESTIONALE = 96;
  public static int PQSL_GRL1_NOTE = 97;
  public static int PQSL_GRL1_UTENTE_INSERIMENTO = 98;
  public static int PQSL_GRL1_DATA_INSERIMENTO = 99;
  public static int PQSL_GRL1_UTENTE_ULTIMO_AGG = 100;
  public static int PQSL_GRL1_DATA_ULTIMO_AGG = 101;
  public static int PQSL_GRL1_PROGR_UNITA_ORGANIZZATIVA = 102;
  public static int PQSL_GRL1_ID_OBIETTIVO_GESTIONE = 103;
  public static int PQSL_GRL1_CODICE_COFOG = 104;
  public static int PQSL_GRL1_CODICE_EUROPEO = 105;
  public static int PQSL_GRL1_COD_LIVELLO_5 = 106;
  public static int PQSL_GRL1_NUMERO_CONTABILE = 107;
  public static int PQSL_GRL1_DATA_CONTABILE = 108;
  public static int PQSL_GRL1_ORD = 109;
  public static int PQSL_GRL1_TIPO_DEBITO_SIOPE = 110;

  // Recordset for query: CHECKUP
  //
  public static int QRY_CHECKUP3 = 3125;
  public static int QSL_CHECKUP3_CAPITOLORW = 0;
  public static int QSL_CHECKUP3_ARTICOLORW = 1;
  public static int QSL_CHECKUP3_SOMMAIMPORTO = 2;

  // Recordset for query: CHECKUP
  //
  public static int QRY_CHECKUP4 = 3126;
  public static int QSL_CHECKUP4_SOMMAIMPORTO = 0;
  public static int QSL_CHECKUP4_ANNOIMPRW = 1;
  public static int QSL_CHECKUP4_NUMEROIMPRW = 2;

  // Recordset for query: CHECKUP
  //
  public static int QRY_CHECKUP5 = 3127;
  public static int QSL_CHECKUP5_SOMMAIMPORTO = 0;
  public static int QSL_CHECKUP5_ANNOSUBIMPRW = 1;
  public static int QSL_CHECKUP5_NUMERSUBIMRW = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI269 = 3128;
  public static int PQRY_PARAMETRI269_RS = 3129;
  public static int PQSL_PARAMETRI269_PARDATULTELA = 0;
  public static int PQSL_PARAMETRI269_PARAUNIMPPER = 1;
  public static int PQSL_PARAMETRI269_PARDELDAIMSU = 2;
  public static int PQSL_PARAMETRI269_PARDESDAIMSU = 3;
  public static int PQSL_PARAMETRI269_SEDE_DEL = 4;
  public static int PQSL_PARAMETRI269_NUMERO_DEL = 5;
  public static int PQSL_PARAMETRI269_ANNO_DEL = 6;
  public static int PQSL_PARAMETRI269_PARADESCGENE = 7;
  public static int PQSL_PARAMETRI269_CAUSALE = 8;
  public static int PQSL_PARAMETRI269_UFFICIO = 9;
  public static int PQSL_PARAMETRI269_BOLLO = 10;
  public static int PQSL_PARAMETRI269_PARADATAEMIS = 11;
  public static int PQSL_PARAMETRI269_PARAMINEMISS = 12;
  public static int PQSL_PARAMETRI269_NUMERO_CONTABILE = 13;
  public static int PQSL_PARAMETRI269_DATA_CONTABILE = 14;
  public static int PQSL_PARAMETRI269_PARATIPOSCAD = 15;
  public static int PQSL_PARAMETRI269_PARAMALLEGAT = 16;
  public static int PQSL_PARAMETRI269_PARAINFOTESO = 17;
  public static int PQSL_PARAMETRI269_PARASCADMAND = 18;
  public static int PQSL_PARAMETRI269_PARAMSPESE = 19;
  public static int PQSL_PARAMETRI269_PARAMCOMMISS = 20;

  // Table to contain panel selected row: GRL
  //
  public static int PQRY_GRL2 = 3130;
  public static int PQSL_GRL2_CAPITOLO = 0;
  public static int PQSL_GRL2_ARTICOLO = 1;
  public static int PQSL_GRL2_ANNO_IMP = 2;
  public static int PQSL_GRL2_NUMERO_IMP = 3;
  public static int PQSL_GRL2_ANNO_SUBIMP = 4;
  public static int PQSL_GRL2_NUMERO_SUBIMP = 5;
  public static int PQSL_GRL2_RECORVOCEPEG = 6;
  public static int PQSL_GRL2_RECORDIMPEGN = 7;
  public static int PQSL_GRL2_RECORSUBIMPE = 8;
  public static int PQSL_GRL2_RECORDDISPON = 9;
  public static int PQSL_GRL2_RECOTOTAGRUP = 10;
  public static int PQSL_GRL2_RECORDISPEFF = 11;

  // Table to contain panel selected row: GRL
  //
  public static int PQRY_GRL = 3131;
  public static int PQSL_GRL_RECORDCAPITO = 0;
  public static int PQSL_GRL_RECORGRLARTI = 1;
  public static int PQSL_GRL_TOTALEIMPORT = 2;
  public static int PQSL_GRL_DISPONICASSA = 3;
  public static int PQSL_GRL_VARPROVVCASS = 4;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL8 = 3132;
  public static int PQSL_BIL8_RECORBILCAPI = 0;
  public static int PQSL_BIL8_RECORBILARTI = 1;
  public static int PQSL_BIL8_TOTALEIMPORT = 2;
  public static int PQSL_BIL8_DISPONIBILIT = 3;
  public static int PQSL_BIL8_VARPROVVISOR = 4;

  // Table to contain panel selected row: MOVIMENTI CASSE GC4
  //
  public static int PQRY_MOVIMCASSGC7 = 3133;
  public static int PQSL_MOVIMCASSGC7_RECORBILCAPI = 0;
  public static int PQSL_MOVIMCASSGC7_RECORBILARTI = 1;
  public static int PQSL_MOVIMCASSGC7_TOTALEIMPORT = 2;
  public static int PQSL_MOVIMCASSGC7_DISPONIBILIT = 3;
  public static int PQSL_MOVIMCASSGC7_VARPROVVISOR = 4;

  // Table to contain panel selected row: MOVIMENTI CASSE GC4
  //
  public static int PQRY_MOVIMCASSGC8 = 3134;
  public static int PQSL_MOVIMCASSGC8_RECORBILCAPI = 0;
  public static int PQSL_MOVIMCASSGC8_RECORBILARTI = 1;
  public static int PQSL_MOVIMCASSGC8_TOTALEIMPORT = 2;
  public static int PQSL_MOVIMCASSGC8_DISPONIBILIT = 3;
  public static int PQSL_MOVIMCASSGC8_VARPROVVISOR = 4;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL6 = 3135;
  public static int PQSL_BIL6_RECORBILCAPI = 0;
  public static int PQSL_BIL6_RECORBILARTI = 1;
  public static int PQSL_BIL6_TOTALEIMPORT = 2;
  public static int PQSL_BIL6_DISPONIBILIT = 3;
  public static int PQSL_BIL6_VARPROVVISOR = 4;

  // Table to contain panel selected row: MOVIMENTI CASSE GC4
  //
  public static int PQRY_MOVIMCASSGC6 = 3136;
  public static int PQSL_MOVIMCASSGC6_RECORBILCAPI = 0;
  public static int PQSL_MOVIMCASSGC6_RECORBILARTI = 1;
  public static int PQSL_MOVIMCASSGC6_TOTALEIMPORT = 2;
  public static int PQSL_MOVIMCASSGC6_DISPONIBILIT = 3;
  public static int PQSL_MOVIMCASSGC6_VARPROVVISOR = 4;

  // Table to contain panel selected row: IMPUTAZIONI CONTABILI
  //
  public static int PQRY_IMPUTACONTA1 = 3137;
  public static int PQRY_IMPUTACONTA1_RS = 3138;
  public static int PQSL_IMPUTACONTA1_CAPITOLO = 0;
  public static int PQSL_IMPUTACONTA1_ARTICOLO = 1;
  public static int PQSL_IMPUTACONTA1_IMPEGNO = 2;
  public static int PQSL_IMPUTACONTA1_ANNO_IMPEGNO = 3;
  public static int PQSL_IMPUTACONTA1_SUB = 4;
  public static int PQSL_IMPUTACONTA1_ANNO_SUB = 5;
  public static int PQSL_IMPUTACONTA1_CODICE_SIOPE = 6;
  public static int PQSL_IMPUTACONTA1_IMPORTO = 7;
  public static int PQSL_IMPUTACONTA1_SEDE_DEL = 8;
  public static int PQSL_IMPUTACONTA1_IMCORONASEDE = 9;
  public static int PQSL_IMPUTACONTA1_NUMERO_DEL = 10;
  public static int PQSL_IMPUTACONTA1_ANNO_DEL = 11;
  public static int PQSL_IMPUTACONTA1_SOGGETTO = 12;
  public static int PQSL_IMPUTACONTA1_NUM_QUIETANZA = 13;
  public static int PQSL_IMPUTACONTA1_CAUSALE = 14;
  public static int PQSL_IMPUTACONTA1_IMPUCONTANOM = 15;
  public static int PQSL_IMPUTACONTA1_IMPCONCAPART = 16;
  public static int PQSL_IMPUTACONTA1_IMPCONRONABE = 17;
  public static int PQSL_IMPUTACONTA1_IMPCONRONAQU = 18;
  public static int PQSL_IMPUTACONTA1_SEZIONE = 19;
  public static int PQSL_IMPUTACONTA1_IMCORONAVASI = 20;
  public static int PQSL_IMPUTACONTA1_IMCORONACOCO = 21;
  public static int PQSL_IMPUTACONTA1_IMCORONACOEU = 22;
  public static int PQSL_IMPUTACONTA1_IMCORONACOL5 = 23;
  public static int PQSL_IMPUTACONTA1_IMPCONRONAE1 = 24;
  public static int PQSL_IMPUTACONTA1_IMCORONAERCO = 25;
  public static int PQSL_IMPUTACONTA1_IMCORONAERL5 = 26;
  public static int PQSL_IMPUTACONTA1_IMCORONAERCE = 27;
  public static int PQSL_IMPUTACONTA1_IMPCONRONAES = 28;
  public static int PQSL_IMPUTACONTA1_IMPCONRONAGE = 29;
  public static int PQSL_IMPUTACONTA1_IMCORONAANIM = 30;
  public static int PQSL_IMPUTACONTA1_IMCORONANUIM = 31;
  public static int PQSL_IMPUTACONTA1_IMCORONAERIM = 32;
  public static int PQSL_IMPUTACONTA1_IMCORONAERDE = 33;
  public static int PQSL_IMPUTACONTA1_IMCORONAMOAN = 34;
  public static int PQSL_IMPUTACONTA1_INFOCAP = 35;
  public static int PQSL_IMPUTACONTA1_INFOIMPACC = 36;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM62 = 3139;
  public static int PQRY_PARAM62_RS = 3140;
  public static int PQSL_PARAM62_ROWNAMEDATA = 0;
  public static int PQSL_PARAM62_ROWNAMSOSEIM = 1;

  // Table to contain panel selected row: IMPUTAZIONI CONTABILI
  //
  public static int PQRY_IMPUTACONTA2 = 3141;
  public static int PQRY_IMPUTACONTA2_RS = 3142;
  public static int PQSL_IMPUTACONTA2_CAPITOLO = 0;
  public static int PQSL_IMPUTACONTA2_ARTICOLO = 1;
  public static int PQSL_IMPUTACONTA2_IMPEGNO = 2;
  public static int PQSL_IMPUTACONTA2_ANNO_IMPEGNO = 3;
  public static int PQSL_IMPUTACONTA2_SUB = 4;
  public static int PQSL_IMPUTACONTA2_ANNO_SUB = 5;
  public static int PQSL_IMPUTACONTA2_CODICE_SIOPE = 6;
  public static int PQSL_IMPUTACONTA2_IMPORTO = 7;
  public static int PQSL_IMPUTACONTA2_SEDE_DEL = 8;
  public static int PQSL_IMPUTACONTA2_NUMERO_DEL = 9;
  public static int PQSL_IMPUTACONTA2_ANNO_DEL = 10;
  public static int PQSL_IMPUTACONTA2_SOGGETTO = 11;
  public static int PQSL_IMPUTACONTA2_NUM_QUIETANZA = 12;
  public static int PQSL_IMPUTACONTA2_CAUSALE = 13;
  public static int PQSL_IMPUTACONTA2_IMPCONRONAAN = 14;
  public static int PQSL_IMPUTACONTA2_IMCORONACAAR = 15;
  public static int PQSL_IMPUTACONTA2_IMPCONRONABE = 16;
  public static int PQSL_IMPUTACONTA2_IMPCONRONAQU = 17;
  public static int PQSL_IMPUTACONTA2_SEZIONE = 18;
  public static int PQSL_IMPUTACONTA2_IMCORONAVASI = 19;

  // Table to contain panel selected row: IMPUTAZIONI CONTABILI
  //
  public static int PQRY_IMPUTACONTA3 = 3143;
  public static int PQSL_IMPUTACONTA3_ESERCIZIO = 0;
  public static int PQSL_IMPUTACONTA3_E_S = 1;
  public static int PQSL_IMPUTACONTA3_CAPITOLO = 2;
  public static int PQSL_IMPUTACONTA3_ARTICOLO = 3;
  public static int PQSL_IMPUTACONTA3_IMPEGNO = 4;
  public static int PQSL_IMPUTACONTA3_ANNO_IMPEGNO = 5;
  public static int PQSL_IMPUTACONTA3_SUB = 6;
  public static int PQSL_IMPUTACONTA3_ANNO_SUB = 7;
  public static int PQSL_IMPUTACONTA3_IMP1 = 8;
  public static int PQSL_IMPUTACONTA3_SUBIMP = 9;
  public static int PQSL_IMPUTACONTA3_CAPART = 10;
  public static int PQSL_IMPUTACONTA3_DATA = 11;
  public static int PQSL_IMPUTACONTA3_DESACCIMPSUB = 12;
  public static int PQSL_IMPUTACONTA3_IMPORTO = 13;
  public static int PQSL_IMPUTACONTA3_DISPO = 14;
  public static int PQSL_IMPUTACONTA3_DISPOEFFETTI = 15;
  public static int PQSL_IMPUTACONTA3_DISPORISULTA = 16;
  public static int PQSL_IMPUTACONTA3_DISPEFFERISU = 17;
  public static int PQSL_IMPUTACONTA3_INFOCAP = 18;
  public static int PQSL_IMPUTACONTA3_INFOACCIMP = 19;
  public static int PQSL_IMPUTACONTA3_INFOSUBIMP = 20;

  // Table to contain panel selected row: Imputazioni Contabili Senza Gruppo
  //
  public static int PQRY_IMPCONSENGRU = 3144;
  public static int PQSL_IMPCONSENGRU_ESERCIZIO = 0;
  public static int PQSL_IMPCONSENGRU_E_S = 1;
  public static int PQSL_IMPCONSENGRU_CAPITOLO = 2;
  public static int PQSL_IMPCONSENGRU_ARTICOLO = 3;
  public static int PQSL_IMPCONSENGRU_IMPEGNO = 4;
  public static int PQSL_IMPCONSENGRU_ANNO_IMPEGNO = 5;
  public static int PQSL_IMPCONSENGRU_SUB = 6;
  public static int PQSL_IMPCONSENGRU_ANNO_SUB = 7;
  public static int PQSL_IMPCONSENGRU_IMPORTO = 8;
  public static int PQSL_IMPCONSENGRU_IMP1 = 9;
  public static int PQSL_IMPCONSENGRU_SUBIMP = 10;
  public static int PQSL_IMPCONSENGRU_CAPART = 11;
  public static int PQSL_IMPCONSENGRU_DISPO = 12;
  public static int PQSL_IMPCONSENGRU_DISPOEFFETTI = 13;
  public static int PQSL_IMPCONSENGRU_DATA = 14;
  public static int PQSL_IMPCONSENGRU_DESACCIMPSUB = 15;
  public static int PQSL_IMPCONSENGRU_DISPORISULTA = 16;
  public static int PQSL_IMPCONSENGRU_DISPEFFERISU = 17;
  public static int PQSL_IMPCONSENGRU_INFOCAP = 18;
  public static int PQSL_IMPCONSENGRU_INFOACCIMP = 19;
  public static int PQSL_IMPCONSENGRU_INFOSUBIMP = 20;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE31 = 3145;
  public static int PQRY_NEWTABLE31_RS = 3146;
  public static int PQSL_NEWTABLE31_ROWNAMEDATA = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI219 = 3147;
  public static int PQRY_PARAMETRI219_RS = 3148;
  public static int PQSL_PARAMETRI219_PARAMGRUPPO = 0;
  public static int PQSL_PARAMETRI219_PARAMBOLLO = 1;
  public static int PQSL_PARAMETRI219_PARAMCODICE = 2;
  public static int PQSL_PARAMETRI219_PARAMDELIBER = 3;
  public static int PQSL_PARAMETRI219_PARANUMEDELI = 4;
  public static int PQSL_PARAMETRI219_PARAANNODELI = 5;
  public static int PQSL_PARAMETRI219_PARAMSTIPEND = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI146 = 3149;
  public static int PQRY_PARAMETRI146_RS = 3150;
  public static int PQSL_PARAMETRI146_PARAMBOLLO = 0;
  public static int PQSL_PARAMETRI146_PARAMSTIPEND = 1;
  public static int PQSL_PARAMETRI146_PARATIPORITE = 2;
  public static int PQSL_PARAMETRI146_PARRITDEMEDA = 3;
  public static int PQSL_PARAMETRI146_PARRITDEIMEA = 4;
  public static int PQSL_PARAMETRI146_PARRITACAREN = 5;
  public static int PQSL_PARAMETRI146_PARAMCUMULAT = 6;
  public static int PQSL_PARAMETRI146_PARIMPDANOVE = 7;
  public static int PQSL_PARAMETRI146_PARACODIBENE = 8;
  public static int PQSL_PARAMETRI146_PARAMCAUSALE = 9;
  public static int PQSL_PARAMETRI146_PARAMUFFICIO = 10;
  public static int PQSL_PARAMETRI146_PARAMINEMISS = 11;
  public static int PQSL_PARAMETRI146_PARAMSPESE = 12;
  public static int PQSL_PARAMETRI146_PARAMSCADENZ = 13;
  public static int PQSL_PARAMETRI146_PARAMCOMMISS = 14;
  public static int PQSL_PARAMETRI146_PARAMALLEGAT = 15;
  public static int PQSL_PARAMETRI146_PARAINFOTESO = 16;
  public static int PQSL_PARAMETRI146_PARAMUFFILIQ = 17;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI222 = 3151;
  public static int PQRY_PARAMETRI222_RS = 3152;
  public static int PQSL_PARAMETRI222_PARNUMLIQDAL = 0;
  public static int PQSL_PARAMETRI222_PARANUMLIQAL = 1;
  public static int PQSL_PARAMETRI222_PARANUMEIMPE = 2;
  public static int PQSL_PARAMETRI222_PARAANNOIMPE = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI232 = 3153;
  public static int PQRY_PARAMETRI232_RS = 3154;
  public static int PQSL_PARAMETRI232_PARNUMLIQDAL = 0;
  public static int PQSL_PARAMETRI232_PARANUMLIQAL = 1;
  public static int PQSL_PARAMETRI232_PARANUMESUBI = 2;
  public static int PQSL_PARAMETRI232_PARAANNOSUBI = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI169 = 3155;
  public static int PQRY_PARAMETRI169_RS = 3156;
  public static int PQSL_PARAMETRI169_PARAMDAL = 0;
  public static int PQSL_PARAMETRI169_PARAMAL = 1;
  public static int PQSL_PARAMETRI169_PARAMUFFICIO = 2;
  public static int PQSL_PARAMETRI169_PARADATAELAB = 3;
  public static int PQSL_PARAMETRI169_PARAMDETTAGL = 4;
  public static int PQSL_PARAMETRI169_PARAMTIPO = 5;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM17 = 3157;
  public static int PQRY_PARAMESTAM17_RS = 3158;
  public static int PQSL_PARAMESTAM17_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAM17_ROWNAMEDELIB = 1;
  public static int PQSL_PARAMESTAM17_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMESTAM17_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMESTAM17_RONASOIMDICO = 4;
  public static int PQSL_PARAMESTAM17_UNITA_PROPONENTE = 5;
  public static int PQSL_PARAMESTAM17_NUMERO_PROPOSTA = 6;
  public static int PQSL_PARAMESTAM17_ANNO_PROPOSTA = 7;
  public static int PQSL_PARAMESTAM17_ROWNAMDATELA = 8;

  // Table to contain panel selected row: IMPUTAZIONI
  //
  public static int PQRY_IMPUTAZIONI1 = 3159;
  public static int PQSL_IMPUTAZIONI1_IMPUTAIMPORT = 0;
  public static int PQSL_IMPUTAZIONI1_IMPUTDALIQUI = 1;
  public static int PQSL_IMPUTAZIONI1_ANNO_FATTURA = 2;
  public static int PQSL_IMPUTAZIONI1_PROGR_FATTURA = 3;
  public static int PQSL_IMPUTAZIONI1_ANNO_IMPEGNO = 4;
  public static int PQSL_IMPUTAZIONI1_NUMERO_IMPEGNO = 5;
  public static int PQSL_IMPUTAZIONI1_IMPUINFOIMPE = 6;
  public static int PQSL_IMPUTAZIONI1_ANNO_SUBIMPEGNO = 7;
  public static int PQSL_IMPUTAZIONI1_NUMERO_SUBIMPEGNO = 8;
  public static int PQSL_IMPUTAZIONI1_IMPINFSUBIMP = 9;
  public static int PQSL_IMPUTAZIONI1_CAPITOLO = 10;
  public static int PQSL_IMPUTAZIONI1_ARTICOLO = 11;
  public static int PQSL_IMPUTAZIONI1_IMPINFVOCPEG = 12;
  public static int PQSL_IMPUTAZIONI1_TIPO_DOCUMENTO = 13;
  public static int PQSL_IMPUTAZIONI1_ANNO_DISTINTA = 14;
  public static int PQSL_IMPUTAZIONI1_NUMERO_DISTINTA = 15;
  public static int PQSL_IMPUTAZIONI1_FLAG_LIQUIDATO = 16;
  public static int PQSL_IMPUTAZIONI1_IMPORTO_IVA = 17;
  public static int PQSL_IMPUTAZIONI1_PROGR_DISTINTA = 18;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI289 = 3160;
  public static int PQRY_PARAMETRI289_RS = 3161;
  public static int PQSL_PARAMETRI289_PARAANNODIST = 0;
  public static int PQSL_PARAMETRI289_PARANUMEDIST = 1;
  public static int PQSL_PARAMETRI289_PARSOLIMDALI = 2;

  // Table to contain panel selected row: Imputazioni
  //
  public static int PQRY_IMPUTAZIONI = 3162;
  public static int PQSL_IMPUTAZIONI_CAPITOLO = 0;
  public static int PQSL_IMPUTAZIONI_ARTICOLO = 1;
  public static int PQSL_IMPUTAZIONI_ANNO_IMPEGNO = 2;
  public static int PQSL_IMPUTAZIONI_NUMERO_IMPEGNO = 3;
  public static int PQSL_IMPUTAZIONI_ANNO_SUBIMPEGNO = 4;
  public static int PQSL_IMPUTAZIONI_NUMERO_SUBIMPEGNO = 5;
  public static int PQSL_IMPUTAZIONI_RECORVOCEPEG = 6;
  public static int PQSL_IMPUTAZIONI_RECORDIMPEGN = 7;
  public static int PQSL_IMPUTAZIONI_RECORSUBIMPE = 8;
  public static int PQSL_IMPUTAZIONI_RECORDDISPON = 9;
  public static int PQSL_IMPUTAZIONI_RECOTOTADIST = 10;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE
  //
  public static int PQRY_DISTINLIQUI1 = 3163;
  public static int PQSL_DISTINLIQUI1_DISLIQANNDIS = 0;
  public static int PQSL_DISTINLIQUI1_DISLIQNUMDIS = 1;
  public static int PQSL_DISTINLIQUI1_DISLIQDATDIS = 2;
  public static int PQSL_DISTINLIQUI1_DISLIQANNDEL = 3;
  public static int PQSL_DISTINLIQUI1_DISLIQNUMDEL = 4;
  public static int PQSL_DISTINLIQUI1_DISLIQSEDDEL = 5;
  public static int PQSL_DISTINLIQUI1_DISLIQANNIMP = 6;
  public static int PQSL_DISTINLIQUI1_DISLIQNUMIMP = 7;
  public static int PQSL_DISTINLIQUI1_DISLIQANNSUB = 8;
  public static int PQSL_DISTINLIQUI1_DISLIQNUMSUB = 9;
  public static int PQSL_DISTINLIQUI1_DISLIQTIPDIS = 10;
  public static int PQSL_DISTINLIQUI1_DISLIQFLALIQ = 11;
  public static int PQSL_DISTINLIQUI1_DISLIQSCADAL = 12;
  public static int PQSL_DISTINLIQUI1_DISTLIQSCAAL = 13;
  public static int PQSL_DISTINLIQUI1_DISTLIQUSTAT = 14;
  public static int PQSL_DISTINLIQUI1_DISLIQPRUNOR = 15;
  public static int PQSL_DISTINLIQUI1_DISLIQUTEINS = 16;
  public static int PQSL_DISTINLIQUI1_DISLIQDATINS = 17;
  public static int PQSL_DISTINLIQUI1_DISLIQUTULAG = 18;
  public static int PQSL_DISTINLIQUI1_DISLIQDAULAG = 19;
  public static int PQSL_DISTINLIQUI1_DISLIQLINGDM = 20;
  public static int PQSL_DISTINLIQUI1_DISLIQPRUOCO = 21;
  public static int PQSL_DISTINLIQUI1_DILIPRUNORIN = 22;
  public static int PQSL_DISTINLIQUI1_DISLIQFLCOCO = 23;
  public static int PQSL_DISTINLIQUI1_DISLIQFLSCFO = 24;
  public static int PQSL_DISTINLIQUI1_DISLIQFLRECO = 25;
  public static int PQSL_DISTINLIQUI1_DISLIQFLVERI = 26;
  public static int PQSL_DISTINLIQUI1_DISLIQFLNUOS = 27;
  public static int PQSL_DISTINLIQUI1_NUOVAESPRESS = 28;
  public static int PQSL_DISTINLIQUI1_IMPORTO = 29;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI5 = 3164;
  public static int PQRY_FILTRI5_RS = 3165;
  public static int PQSL_FILTRI5_NOMOGGCODFOR = 0;
  public static int PQSL_FILTRI5_NOMOGGNUPRGE = 1;
  public static int PQSL_FILTRI5_NOMOGGNUPRIN = 2;
  public static int PQSL_FILTRI5_NOMOGGNUMDOC = 3;
  public static int PQSL_FILTRI5_NOMOGGNULOST = 4;
  public static int PQSL_FILTRI5_NOMOGGCODLI1 = 5;
  public static int PQSL_FILTRI5_NOMOGGCODLI2 = 6;
  public static int PQSL_FILTRI5_NOMEOGGEMISS = 7;
  public static int PQSL_FILTRI5_NOMOGGPROMIS = 8;
  public static int PQSL_FILTRI5_NOMEOGGPROUO = 9;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI344 = 3166;
  public static int PQRY_PARAMETRI344_RS = 3167;
  public static int PQSL_PARAMETRI344_SEDE_DEL = 0;
  public static int PQSL_PARAMETRI344_NUMERO_DEL = 1;
  public static int PQSL_PARAMETRI344_ANNO_DEL = 2;
  public static int PQSL_PARAMETRI344_UNITA_PROPONENTE = 3;
  public static int PQSL_PARAMETRI344_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAMETRI344_ANNO_PROPOSTA = 5;
  public static int PQSL_PARAMETRI344_DESCRIZIONE = 6;
  public static int PQSL_PARAMETRI344_UFFICIO = 7;
  public static int PQSL_PARAMETRI344_CAUSALE = 8;
  public static int PQSL_PARAMETRI344_BOLLO = 9;
  public static int PQSL_PARAMETRI344_PARAMCENTRO = 10;
  public static int PQSL_PARAMETRI344_PARAMINEMISS = 11;
  public static int PQSL_PARAMETRI344_PARADATALIQU = 12;
  public static int PQSL_PARAMETRI344_SPESE = 13;
  public static int PQSL_PARAMETRI344_COMMISSIONI = 14;
  public static int PQSL_PARAMETRI344_PARAMSCADENZ = 15;
  public static int PQSL_PARAMETRI344_ALLEGATI = 16;
  public static int PQSL_PARAMETRI344_INFO_TESORIERE = 17;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI377 = 3168;
  public static int PQRY_PARAMETRI377_RS = 3169;
  public static int PQSL_PARAMETRI377_ANNO_DISTINTA = 0;
  public static int PQSL_PARAMETRI377_NUMERO_DISTINTA = 1;
  public static int PQSL_PARAMETRI377_DATA_DISTINTA = 2;
  public static int PQSL_PARAMETRI377_TIPO_DIST = 3;
  public static int PQSL_PARAMETRI377_STATO = 4;
  public static int PQSL_PARAMETRI377_PARAMLIQUIDA = 5;

  // Table to contain panel selected row: WRK LIQ DISTINTA
  //
  public static int PQRY_WRKLIQDISTIN = 3170;
  public static int PQSL_WRKLIQDISTIN_PROGRESSIVO = 0;
  public static int PQSL_WRKLIQDISTIN_ANNO_DISTINTA = 1;
  public static int PQSL_WRKLIQDISTIN_NUMERO_DISTINTA = 2;
  public static int PQSL_WRKLIQDISTIN_TIPO_DISTINTA = 3;
  public static int PQSL_WRKLIQDISTIN_CAPITOLO = 4;
  public static int PQSL_WRKLIQDISTIN_ARTICOLO = 5;
  public static int PQSL_WRKLIQDISTIN_ANNO_BUONO = 6;
  public static int PQSL_WRKLIQDISTIN_NUMERO_BUONO = 7;
  public static int PQSL_WRKLIQDISTIN_PROGRESSIVO_BUONO = 8;
  public static int PQSL_WRKLIQDISTIN_ANNO_DISP = 9;
  public static int PQSL_WRKLIQDISTIN_PROGRESSIVO_DISP = 10;
  public static int PQSL_WRKLIQDISTIN_ANNO_IMP = 11;
  public static int PQSL_WRKLIQDISTIN_NUMERO_IMP = 12;
  public static int PQSL_WRKLIQDISTIN_ANNO_SUBIMP = 13;
  public static int PQSL_WRKLIQDISTIN_NUMERO_SUBIMP = 14;
  public static int PQSL_WRKLIQDISTIN_ANNO_DEL = 15;
  public static int PQSL_WRKLIQDISTIN_NUMERO_DEL = 16;
  public static int PQSL_WRKLIQDISTIN_SEDE_DEL = 17;
  public static int PQSL_WRKLIQDISTIN_IMPORTO = 18;
  public static int PQSL_WRKLIQDISTIN_ANNO_LIQ = 19;
  public static int PQSL_WRKLIQDISTIN_NUMERO_LIQ = 20;
  public static int PQSL_WRKLIQDISTIN_ANNO_MAND = 21;
  public static int PQSL_WRKLIQDISTIN_DESCRIZIONE = 22;
  public static int PQSL_WRKLIQDISTIN_BENEFICIARIO = 23;
  public static int PQSL_WRKLIQDISTIN_ANNO_DOC = 24;
  public static int PQSL_WRKLIQDISTIN_NUMERO_DOC = 25;
  public static int PQSL_WRKLIQDISTIN_NUM_QUIETANZA = 26;
  public static int PQSL_WRKLIQDISTIN_CAUSALE = 27;
  public static int PQSL_WRKLIQDISTIN_BOLLO = 28;
  public static int PQSL_WRKLIQDISTIN_TIPO_VINCOLO = 29;
  public static int PQSL_WRKLIQDISTIN_UFFICIO = 30;
  public static int PQSL_WRKLIQDISTIN_VOCE_ECON = 31;
  public static int PQSL_WRKLIQDISTIN_ANNO_PROG = 32;
  public static int PQSL_WRKLIQDISTIN_NUMERO_PROG = 33;
  public static int PQSL_WRKLIQDISTIN_D_DATA_REG = 34;
  public static int PQSL_WRKLIQDISTIN_NUMERO_CONTABILE = 35;
  public static int PQSL_WRKLIQDISTIN_DATA_CONTABILE = 36;
  public static int PQSL_WRKLIQDISTIN_FINANZIAMENTO = 37;
  public static int PQSL_WRKLIQDISTIN_SPESE = 38;
  public static int PQSL_WRKLIQDISTIN_SCADENZA = 39;
  public static int PQSL_WRKLIQDISTIN_ALLEGATI = 40;
  public static int PQSL_WRKLIQDISTIN_COMMISSIONI = 41;
  public static int PQSL_WRKLIQDISTIN_INFO_TESORIERE = 42;
  public static int PQSL_WRKLIQDISTIN_CODICE_GESTIONALE = 43;
  public static int PQSL_WRKLIQDISTIN_NOTE = 44;
  public static int PQSL_WRKLIQDISTIN_UTENTE_INSERIMENTO = 45;
  public static int PQSL_WRKLIQDISTIN_DATA_INSERIMENTO = 46;
  public static int PQSL_WRKLIQDISTIN_UTENTE_ULTIMO_AGG = 47;
  public static int PQSL_WRKLIQDISTIN_DATA_ULTIMO_AGG = 48;
  public static int PQSL_WRKLIQDISTIN_FATTORE = 49;
  public static int PQSL_WRKLIQDISTIN_CENTRO = 50;
  public static int PQSL_WRKLIQDISTIN_COMPETENZA_DAL = 51;
  public static int PQSL_WRKLIQDISTIN_COMPETENZA_AL = 52;
  public static int PQSL_WRKLIQDISTIN_WRKLIQDIINEM = 53;
  public static int PQSL_WRKLIQDISTIN_CIG = 54;
  public static int PQSL_WRKLIQDISTIN_MOTIVO_ESCLUSIONE_CIG = 55;
  public static int PQSL_WRKLIQDISTIN_CUP = 56;
  public static int PQSL_WRKLIQDISTIN_DIVERSO_BEN = 57;
  public static int PQSL_WRKLIQDISTIN_NUM_QUIETANZA_DIV_BEN = 58;
  public static int PQSL_WRKLIQDISTIN_WRLIDIRASODB = 59;
  public static int PQSL_WRKLIQDISTIN_CODICE_COFOG = 60;
  public static int PQSL_WRKLIQDISTIN_COD_LIVELLO_5 = 61;
  public static int PQSL_WRKLIQDISTIN_CODICE_EUROPEO = 62;
  public static int PQSL_WRKLIQDISTIN_IMPORTO_IVA = 63;
  public static int PQSL_WRKLIQDISTIN_WRKLIQDITRIV = 64;
  public static int PQSL_WRKLIQDISTIN_IMPORTO_IVA_IST = 65;
  public static int PQSL_WRKLIQDISTIN_TIPO_REGISTRO_DEF = 66;
  public static int PQSL_WRKLIQDISTIN_TIPO_BOLLATO_DEF = 67;
  public static int PQSL_WRKLIQDISTIN_PROMISCUA = 68;
  public static int PQSL_WRKLIQDISTIN_RILEVANTE_ECO_DETTAGLIO = 69;
  public static int PQSL_WRKLIQDISTIN_TIPO_DEBITO_SIOPE = 70;
  public static int PQSL_WRKLIQDISTIN_NUMERO_AVVISO_PAGOPA = 71;
  public static int PQSL_WRKLIQDISTIN_PROGR_SCHEDA_CIWEB = 72;
  public static int PQSL_WRKLIQDISTIN_NOTE_IMPECO = 73;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI402 = 3171;
  public static int PQRY_PARAMETRI402_RS = 3172;
  public static int PQSL_PARAMETRI402_ANNO_DISTINTA = 0;
  public static int PQSL_PARAMETRI402_NUMERO_DISTINTA = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI407 = 3173;
  public static int PQRY_PARAMETRI407_RS = 3174;
  public static int PQSL_PARAMETRI407_ANNO_DISTINTA = 0;
  public static int PQSL_PARAMETRI407_NUMERO_DISTINTA = 1;
  public static int PQSL_PARAMETRI407_VALOCOMCKDEL = 2;
  public static int PQSL_PARAMETRI407_ANNO_DEL = 3;
  public static int PQSL_PARAMETRI407_NUMERO_DEL = 4;
  public static int PQSL_PARAMETRI407_SEDE_DEL = 5;
  public static int PQSL_PARAMETRI407_VALOCOMCKDES = 6;
  public static int PQSL_PARAMETRI407_DESCRIZIONE = 7;
  public static int PQSL_PARAMETRI407_VALOCOMINEMI = 8;
  public static int PQSL_PARAMETRI407_VALCOMCKINEM = 9;
  public static int PQSL_PARAMETRI407_VALOCOMCKCAU = 10;
  public static int PQSL_PARAMETRI407_CAUSALE = 11;
  public static int PQSL_PARAMETRI407_VALOCOMCKBOL = 12;
  public static int PQSL_PARAMETRI407_BOLLO = 13;
  public static int PQSL_PARAMETRI407_VALCOMCKTIVI = 14;
  public static int PQSL_PARAMETRI407_TIPO_VINCOLO = 15;
  public static int PQSL_PARAMETRI407_VALOCOMCKUFF = 16;
  public static int PQSL_PARAMETRI407_UFFICIO = 17;
  public static int PQSL_PARAMETRI407_VALOCOMCKCON = 18;
  public static int PQSL_PARAMETRI407_NUMERO_CONTABILE = 19;
  public static int PQSL_PARAMETRI407_DATA_CONTABILE = 20;
  public static int PQSL_PARAMETRI407_VALCOMCKMAIN = 21;
  public static int PQSL_PARAMETRI407_SPESE = 22;
  public static int PQSL_PARAMETRI407_SCADENZA = 23;
  public static int PQSL_PARAMETRI407_ALLEGATI = 24;
  public static int PQSL_PARAMETRI407_COMMISSIONI = 25;
  public static int PQSL_PARAMETRI407_INFO_TESORIERE = 26;
  public static int PQSL_PARAMETRI407_VALCOMCKDARE = 27;
  public static int PQSL_PARAMETRI407_VALCOMDATREG = 28;
  public static int PQSL_PARAMETRI407_VALCOMCKESCI = 29;
  public static int PQSL_PARAMETRI407_ESCLUSIONE_CIG = 30;
  public static int PQSL_PARAMETRI407_VALCOMCKDIBE = 31;
  public static int PQSL_PARAMETRI407_VALCOMCODIBE = 32;
  public static int PQSL_PARAMETRI407_VACONUQTDIBE = 33;
  public static int PQSL_PARAMETRI407_VALCOMCKLIV5 = 34;
  public static int PQSL_PARAMETRI407_COD_LIVELLO_5 = 35;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI376 = 3175;
  public static int PQRY_PARAMETRI376_RS = 3176;
  public static int PQSL_PARAMETRI376_ANNO_DISTINTA = 0;
  public static int PQSL_PARAMETRI376_NUMERO_DISTINTA = 1;
  public static int PQSL_PARAMETRI376_DATA_DISTINTA = 2;
  public static int PQSL_PARAMETRI376_TIPO_DIST = 3;
  public static int PQSL_PARAMETRI376_PARAMLIQUIDA = 4;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ36 = 3177;
  public static int PQSL_LIQ36_ANNO_DISTINTA = 0;
  public static int PQSL_LIQ36_NUMERO_DISTINTA = 1;
  public static int PQSL_LIQ36_TIPO_DISTINTA = 2;
  public static int PQSL_LIQ36_LIQ_PARZ = 3;
  public static int PQSL_LIQ36_NUMERO_LIQ = 4;
  public static int PQSL_LIQ36_ANNO_LIQ = 5;
  public static int PQSL_LIQ36_D_DATA_REG = 6;
  public static int PQSL_LIQ36_CAPITOLO = 7;
  public static int PQSL_LIQ36_ARTICOLO = 8;
  public static int PQSL_LIQ36_ANNO_IMP = 9;
  public static int PQSL_LIQ36_NUMERO_IMP = 10;
  public static int PQSL_LIQ36_ANNO_SUBIMP = 11;
  public static int PQSL_LIQ36_NUMERO_SUBIMP = 12;
  public static int PQSL_LIQ36_IMPORTO = 13;
  public static int PQSL_LIQ36_IMPORDAPAGAR = 14;
  public static int PQSL_LIQ36_IMPOIVADAPAG = 15;
  public static int PQSL_LIQ36_ANNO_MAND = 16;
  public static int PQSL_LIQ36_BENEFICIARIO = 17;
  public static int PQSL_LIQ36_ANNO_DOC = 18;
  public static int PQSL_LIQ36_NUMERO_DOC = 19;
  public static int PQSL_LIQ36_UTENTE_INSERIMENTO = 20;
  public static int PQSL_LIQ36_DATA_INSERIMENTO = 21;
  public static int PQSL_LIQ36_UTENTE_ULTIMO_AGG = 22;
  public static int PQSL_LIQ36_DATA_ULTIMO_AGG = 23;
  public static int PQSL_LIQ36_FAT_ANNO_PROG = 24;
  public static int PQSL_LIQ36_FAT_NUMERO_PROG = 25;
  public static int PQSL_LIQ36_IMPORTO_IVA = 26;
  public static int PQSL_LIQ36_IMPODAPAGOLD = 27;
  public static int PQSL_LIQ36_IMPOIVAIPAGA = 28;
  public static int PQSL_LIQ36_IMPORTO_IVA_IST = 29;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI292 = 3178;
  public static int PQRY_PARAMETRI292_RS = 3179;
  public static int PQSL_PARAMETRI292_PARAANNODIST = 0;
  public static int PQSL_PARAMETRI292_PARANUMEDIST = 1;
  public static int PQSL_PARAMETRI292_PARSOLMODALI = 2;
  public static int PQSL_PARAMETRI292_PARAMPERIDAL = 3;
  public static int PQSL_PARAMETRI292_PARAMAL = 4;

  // Table to contain panel selected row: MOVIMENTI CASSE GC4
  //
  public static int PQRY_MOVIMCASSGC4 = 3180;
  public static int PQSL_MOVIMCASSGC4_ANNO_IMPEGNO = 0;
  public static int PQSL_MOVIMCASSGC4_NUMERO_IMPEGNO = 1;
  public static int PQSL_MOVIMCASSGC4_MOVCASGCINIM = 2;
  public static int PQSL_MOVIMCASSGC4_ANNO_SUBIMPEGNO = 3;
  public static int PQSL_MOVIMCASSGC4_NUMERO_SUBIMPEGNO = 4;
  public static int PQSL_MOVIMCASSGC4_MOCAGCINSUIM = 5;
  public static int PQSL_MOVIMCASSGC4_IMPORTO = 6;
  public static int PQSL_MOVIMCASSGC4_PROGR_ECONOMO = 7;
  public static int PQSL_MOVIMCASSGC4_ANNO_DISTINTA_RR = 8;
  public static int PQSL_MOVIMCASSGC4_NUMERO_DISTINTA_RR = 9;
  public static int PQSL_MOVIMCASSGC4_LIQ_NOMINATIVA = 10;
  public static int PQSL_MOVIMCASSGC4_PROGR_SOGGETTO = 11;
  public static int PQSL_MOVIMCASSGC4_ANNO_LIQ = 12;
  public static int PQSL_MOVIMCASSGC4_NUMERO_LIQ = 13;
  public static int PQSL_MOVIMCASSGC4_MOCAGCBERSEE = 14;
  public static int PQSL_MOVIMCASSGC4_MOCAGCBERSES = 15;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI662 = 3181;
  public static int PQRY_PARAMETRI662_RS = 3182;
  public static int PQSL_PARAMETRI662_PARAMESERCIZ = 0;

  // Table to contain panel selected row: Distinte
  //
  public static int PQRY_DISTINTE1 = 3183;
  public static int PQSL_DISTINTE1_BEDIRIRIANDI = 0;
  public static int PQSL_DISTINTE1_BEDIRIRINUDI = 1;
  public static int PQSL_DISTINTE1_BEDIRIRIDADA = 2;
  public static int PQSL_DISTINTE1_BENDIRIRIDAA = 3;
  public static int PQSL_DISTINTE1_LIQUIDATA = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI298 = 3184;
  public static int PQRY_PARAMETRI298_RS = 3185;
  public static int PQSL_PARAMETRI298_SEDE_DEL = 0;
  public static int PQSL_PARAMETRI298_NUMERO_DEL = 1;
  public static int PQSL_PARAMETRI298_ANNO_DEL = 2;
  public static int PQSL_PARAMETRI298_UNITA_PROPONENTE = 3;
  public static int PQSL_PARAMETRI298_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAMETRI298_ANNO_PROPOSTA = 5;
  public static int PQSL_PARAMETRI298_UFFICIO = 6;
  public static int PQSL_PARAMETRI298_CAUSALE = 7;
  public static int PQSL_PARAMETRI298_BOLLO = 8;
  public static int PQSL_PARAMETRI298_PARAMNUMQUIE = 9;
  public static int PQSL_PARAMETRI298_PARAMCENTRO = 10;
  public static int PQSL_PARAMETRI298_PARAMINEMISS = 11;
  public static int PQSL_PARAMETRI298_PARADATALIQU = 12;
  public static int PQSL_PARAMETRI298_SPESE = 13;
  public static int PQSL_PARAMETRI298_COMMISSIONI = 14;
  public static int PQSL_PARAMETRI298_PARAMSCADENZ = 15;
  public static int PQSL_PARAMETRI298_ALLEGATI = 16;
  public static int PQSL_PARAMETRI298_INFO_TESORIERE = 17;
  public static int PQSL_PARAMETRI298_PARINTLIQUNI = 18;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI343 = 3186;
  public static int PQRY_PARAMETRI343_RS = 3187;
  public static int PQSL_PARAMETRI343_CAPITOLO = 0;
  public static int PQSL_PARAMETRI343_ARTICOLO = 1;
  public static int PQSL_PARAMETRI343_ANNO_IMP = 2;
  public static int PQSL_PARAMETRI343_NUMERO_IMP = 3;
  public static int PQSL_PARAMETRI343_ANNO_SUBIMP = 4;
  public static int PQSL_PARAMETRI343_NUMERO_SUBIMP = 5;
  public static int PQSL_PARAMETRI343_ANNO_DEL = 6;
  public static int PQSL_PARAMETRI343_NUMERO_DEL = 7;
  public static int PQSL_PARAMETRI343_SEDE_DEL = 8;
  public static int PQSL_PARAMETRI343_DESCRIZIONE = 9;
  public static int PQSL_PARAMETRI343_BOLLO = 10;
  public static int PQSL_PARAMETRI343_ANNO_PROPOSTA = 11;
  public static int PQSL_PARAMETRI343_UNITA_PROPONENTE = 12;
  public static int PQSL_PARAMETRI343_NUMERO_PROPOSTA = 13;
  public static int PQSL_PARAMETRI343_VOCE_ECON = 14;
  public static int PQSL_PARAMETRI343_D_DATA_REG = 15;
  public static int PQSL_PARAMETRI343_CODICE_GESTIONALE = 16;
  public static int PQSL_PARAMETRI343_PARAMINEMISS = 17;
  public static int PQSL_PARAMETRI343_PARAMTITOLO = 18;
  public static int PQSL_PARAMETRI343_PARAMCATEGOR = 19;
  public static int PQSL_PARAMETRI343_PARAMCODINTE = 20;
  public static int PQSL_PARAMETRI343_PARAMCODTERZ = 21;
  public static int PQSL_PARAMETRI343_PARAMRILECO = 22;
  public static int PQSL_PARAMETRI343_PARAMCOMPDAL = 23;
  public static int PQSL_PARAMETRI343_PARAMCOMPAL = 24;
  public static int PQSL_PARAMETRI343_PARAMFATTORE = 25;
  public static int PQSL_PARAMETRI343_PARAMCENTRO = 26;
  public static int PQSL_PARAMETRI343_PARATIPOVINC = 27;
  public static int PQSL_PARAMETRI343_PARAMFINANZI = 28;
  public static int PQSL_PARAMETRI343_CIG = 29;
  public static int PQSL_PARAMETRI343_MOTIVO_ESCLUSIONE_CIG = 30;
  public static int PQSL_PARAMETRI343_CUP = 31;
  public static int PQSL_PARAMETRI343_CODICE_COFOG = 32;
  public static int PQSL_PARAMETRI343_CODICE_EUROPEO = 33;
  public static int PQSL_PARAMETRI343_COD_LIVELLO_5 = 34;

  // Table to contain panel selected row: Parametri Liquidazione Multipla
  //
  public static int PQRY_PARALIQUMUL1 = 3188;
  public static int PQRY_PARALIQUMUL1_RS = 3189;
  public static int PQSL_PARALIQUMUL1_UFFICIO = 0;
  public static int PQSL_PARALIQUMUL1_CAUSALE = 1;
  public static int PQSL_PARALIQUMUL1_PARATIPOVINC = 2;
  public static int PQSL_PARALIQUMUL1_PARAMFATTORE = 3;
  public static int PQSL_PARALIQUMUL1_PARAMCENTRO = 4;
  public static int PQSL_PARALIQUMUL1_PARAMCOMPDAL = 5;
  public static int PQSL_PARALIQUMUL1_PARAMCOMPAL = 6;
  public static int PQSL_PARALIQUMUL1_DIVERSO_BEN = 7;
  public static int PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN = 8;
  public static int PQSL_PARALIQUMUL1_NUMERO_CONTABILE = 9;
  public static int PQSL_PARALIQUMUL1_DATA_CONTABILE = 10;
  public static int PQSL_PARALIQUMUL1_SPESE = 11;
  public static int PQSL_PARALIQUMUL1_SCADENZA = 12;
  public static int PQSL_PARALIQUMUL1_ALLEGATI = 13;
  public static int PQSL_PARALIQUMUL1_COMMISSIONI = 14;
  public static int PQSL_PARALIQUMUL1_INFO_TESORIERE = 15;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV86 = 3190;
  public static int QSL_CFASELINTV86_COUNT = 0;

  // Recordset for query: FAT IMDB
  //
  public static int QRY_FATIMDB4 = 3191;
  public static int QSL_FATIMDB4_FATIMDANNPRO = 0;
  public static int QSL_FATIMDB4_FATIMDNUMPRO = 1;
  public static int QSL_FATIMDB4_FATIMDTIREDE = 2;
  public static int QSL_FATIMDB4_FATIMDTIBODE = 3;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV87 = 3192;
  public static int QSL_CFASELINTV87_SUMFATIMDALI = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI447 = 3193;
  public static int PQRY_PARAMETRI447_RS = 3194;
  public static int PQSL_PARAMETRI447_PARDATPRODAL = 0;
  public static int PQSL_PARAMETRI447_PARADATPROAL = 1;
  public static int PQSL_PARAMETRI447_PARAMSCADDAL = 2;
  public static int PQSL_PARAMETRI447_PARAMSCADEAL = 3;
  public static int PQSL_PARAMETRI447_PARAMORDINAM = 4;
  public static int PQSL_PARAMETRI447_PARACODIBENE = 5;

  // Table to contain panel selected row: FAT IMDB
  //
  public static int PQRY_FATIMDB1 = 3195;
  public static int PQRY_FATIMDB1_RS = 3196;
  public static int PQSL_FATIMDB1_FATIMDBDALIQ = 0;
  public static int PQSL_FATIMDB1_FATIMDDALIOL = 1;
  public static int PQSL_FATIMDB1_ANNO_PROG = 2;
  public static int PQSL_FATIMDB1_NUMERO_PROG = 3;
  public static int PQSL_FATIMDB1_ANNO_DOC = 4;
  public static int PQSL_FATIMDB1_NUMERO_DOC = 5;
  public static int PQSL_FATIMDB1_D_DATA_DOC = 6;
  public static int PQSL_FATIMDB1_ANNO_PROT = 7;
  public static int PQSL_FATIMDB1_NUMERO_PROT = 8;
  public static int PQSL_FATIMDB1_D_DATA_PROT = 9;
  public static int PQSL_FATIMDB1_D_SCADENZA = 10;
  public static int PQSL_FATIMDB1_FATIMDNUMQUI = 11;
  public static int PQSL_FATIMDB1_UFFICIO_INVIO = 12;
  public static int PQSL_FATIMDB1_CATEGORIA = 13;
  public static int PQSL_FATIMDB1_CODICE = 14;
  public static int PQSL_FATIMDB1_ANNO_RIF = 15;
  public static int PQSL_FATIMDB1_NUMERO_RIF = 16;
  public static int PQSL_FATIMDB1_CODICE_DOC = 17;
  public static int PQSL_FATIMDB1_DESCRIZIONE = 18;
  public static int PQSL_FATIMDB1_IMPORTO = 19;
  public static int PQSL_FATIMDB1_VARIAZIONI = 20;
  public static int PQSL_FATIMDB1_IMPUTATO = 21;
  public static int PQSL_FATIMDB1_FATIMDNUQULI = 22;
  public static int PQSL_FATIMDB1_FATTORE = 23;
  public static int PQSL_FATIMDB1_CENTRO = 24;
  public static int PQSL_FATIMDB1_COMPETENZA_DAL = 25;
  public static int PQSL_FATIMDB1_COMPETENZA_AL = 26;
  public static int PQSL_FATIMDB1_FAIMCOIMECLI = 27;
  public static int PQSL_FATIMDB1_FINANZIAMENTO = 28;
  public static int PQSL_FATIMDB1_CODICE_GESTIONALE = 29;
  public static int PQSL_FATIMDB1_FATIMDNOTLIQ = 30;
  public static int PQSL_FATIMDB1_FATIMDORDSCA = 31;
  public static int PQSL_FATIMDB1_FATIMDORDUFF = 32;
  public static int PQSL_FATIMDB1_FATIMDORDAPR = 33;
  public static int PQSL_FATIMDB1_FATIMDORDCAT = 34;
  public static int PQSL_FATIMDB1_FATIMDBSELEZ = 35;
  public static int PQSL_FATIMDB1_FATIMDSELOLD = 36;
  public static int PQSL_FATIMDB1_CIG = 37;
  public static int PQSL_FATIMDB1_CUP = 38;
  public static int PQSL_FATIMDB1_CODICE_COFOG = 39;
  public static int PQSL_FATIMDB1_CODICE_EUROPEO = 40;
  public static int PQSL_FATIMDB1_COD_LIVELLO_5 = 41;
  public static int PQSL_FATIMDB1_FATIMDTRAIVA = 42;
  public static int PQSL_FATIMDB1_FATIMDIMPIVA = 43;
  public static int PQSL_FATIMDB1_FATIMDTIREDE = 44;
  public static int PQSL_FATIMDB1_FATIMDTIBODE = 45;
  public static int PQSL_FATIMDB1_FATIMDIMIVIS = 46;
  public static int PQSL_FATIMDB1_FATIMDTIPATT = 47;

  // Recordset for query: FAT IMDB
  //
  public static int QRY_FATIMDB2 = 3197;
  public static int QSL_FATIMDB2_FINANZIAMLIQ = 0;
  public static int QSL_FATIMDB2_CODICE = 1;
  public static int QSL_FATIMDB2_ANNOPROG = 2;
  public static int QSL_FATIMDB2_NUMEROPROG = 3;
  public static int QSL_FATIMDB2_NUMERODOC = 4;
  public static int QSL_FATIMDB2_DDATADOC = 5;
  public static int QSL_FATIMDB2_CODICEBEN = 6;
  public static int QSL_FATIMDB2_TIPOATT = 7;
  public static int QSL_FATIMDB2_TIPOREGDEF = 8;
  public static int QSL_FATIMDB2_TIPOBOLLADEF = 9;
  public static int QSL_FATIMDB2_IMPORTIVAIST = 10;
  public static int QSL_FATIMDB2_IMPORDALIQUI = 11;
  public static int QSL_FATIMDB2_TRATTMENTIVA = 12;
  public static int QSL_FATIMDB2_IMPORTOIVA = 13;
  public static int QSL_FATIMDB2_FATTORELIQ = 14;
  public static int QSL_FATIMDB2_CENTROLIQ = 15;

  // Recordset for query: FAT IMDB
  //
  public static int QRY_FATIMDB3 = 3198;
  public static int QSL_FATIMDB3_ANNOPROG = 0;
  public static int QSL_FATIMDB3_NUMEROPROG = 1;
  public static int QSL_FATIMDB3_NUMQUIETALIQ = 2;
  public static int QSL_FATIMDB3_DALIQUIDARE = 3;
  public static int QSL_FATIMDB3_CENTROLIQ = 4;
  public static int QSL_FATIMDB3_FATTORELIQ = 5;
  public static int QSL_FATIMDB3_COMPETDALLIQ = 6;
  public static int QSL_FATIMDB3_COMPETEALLIQ = 7;
  public static int QSL_FATIMDB3_CODIMPECOLIQ = 8;
  public static int QSL_FATIMDB3_FATIMDFINLIQ = 9;
  public static int QSL_FATIMDB3_CODICGESTLIQ = 10;
  public static int QSL_FATIMDB3_NOTELIQ = 11;
  public static int QSL_FATIMDB3_FATIMDBCIG = 12;
  public static int QSL_FATIMDB3_MOTIVESCLCIG = 13;
  public static int QSL_FATIMDB3_CUP = 14;
  public static int QSL_FATIMDB3_CODICECOFOG = 15;
  public static int QSL_FATIMDB3_CODLIVELLO5 = 16;
  public static int QSL_FATIMDB3_CODICEEUROPE = 17;
  public static int QSL_FATIMDB3_IMPORTOIVA = 18;
  public static int QSL_FATIMDB3_IMPORTIVAIST = 19;
  public static int QSL_FATIMDB3_TIPOREGDEF = 20;
  public static int QSL_FATIMDB3_TIPOBOLLADEF = 21;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV94 = 3199;
  public static int QSL_CFASELINTV94_SUMFATIMDALI = 0;

  // Table to contain panel selected row: Import File
  //
  public static int PQRY_IMPORTFILE3 = 3200;
  public static int PQSL_IMPORTFILE3_PROGRESSIVO = 0;
  public static int PQSL_IMPORTFILE3_SESSIONE = 1;
  public static int PQSL_IMPORTFILE3_FASE = 2;
  public static int PQSL_IMPORTFILE3_FILE_DATI = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI430 = 3201;
  public static int PQRY_PARAMETRI430_RS = 3202;
  public static int PQSL_PARAMETRI430_RONATIPAPECA = 0;

  // Table to contain panel selected row: Import File
  //
  public static int PQRY_IMPORTFILE1 = 3203;
  public static int PQSL_IMPORTFILE1_PROGRESSIVO = 0;
  public static int PQSL_IMPORTFILE1_SESSIONE = 1;
  public static int PQSL_IMPORTFILE1_FASE = 2;
  public static int PQSL_IMPORTFILE1_FILE_DATI = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI551 = 3204;
  public static int PQRY_PARAMETRI551_RS = 3205;
  public static int PQSL_PARAMETRI551_PARAMNUMEIMP = 0;
  public static int PQSL_PARAMETRI551_PARAMANNOIMP = 1;
  public static int PQSL_PARAMETRI551_PARANUMESUBI = 2;
  public static int PQSL_PARAMETRI551_PARAANNOSUBI = 3;
  public static int PQSL_PARAMETRI551_PARAMINEMISS = 4;
  public static int PQSL_PARAMETRI551_SEDE_DEL = 5;
  public static int PQSL_PARAMETRI551_NUMERO_DEL = 6;
  public static int PQSL_PARAMETRI551_ANNO_DEL = 7;
  public static int PQSL_PARAMETRI551_UNITA_PROPONENTE = 8;
  public static int PQSL_PARAMETRI551_NUMERO_PROPOSTA = 9;
  public static int PQSL_PARAMETRI551_ANNO_PROPOSTA = 10;
  public static int PQSL_PARAMETRI551_PARAVOCEECON = 11;
  public static int PQSL_PARAMETRI551_PARACODIGEST = 12;
  public static int PQSL_PARAMETRI551_PARATIPOVINC = 13;
  public static int PQSL_PARAMETRI551_DESCRIZIONE = 14;
  public static int PQSL_PARAMETRI551_CAUSALE = 15;
  public static int PQSL_PARAMETRI551_PARTIPPAPECA = 16;
  public static int PQSL_PARAMETRI551_BOLLO = 17;
  public static int PQSL_PARAMETRI551_UFFICIO = 18;
  public static int PQSL_PARAMETRI551_FINANZIAMENTO = 19;
  public static int PQSL_PARAMETRI551_PARAMSCADENZ = 20;
  public static int PQSL_PARAMETRI551_SPESE = 21;
  public static int PQSL_PARAMETRI551_COMMISSIONI = 22;
  public static int PQSL_PARAMETRI551_ALLEGATI = 23;
  public static int PQSL_PARAMETRI551_INFO_TESORIERE = 24;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI328 = 3206;
  public static int PQRY_PARAMETRI328_RS = 3207;
  public static int PQSL_PARAMETRI328_PARAMNUMEDAL = 0;
  public static int PQSL_PARAMETRI328_PARAMNUMERAL = 1;
  public static int PQSL_PARAMETRI328_PARAMDATADAL = 2;
  public static int PQSL_PARAMETRI328_PARAMDATAAL = 3;
  public static int PQSL_PARAMETRI328_PARAMORDINAM = 4;
  public static int PQSL_PARAMETRI328_PARAMBENEFIC = 5;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ10 = 3208;
  public static int PQSL_LIQ10_CAPITOLO = 0;
  public static int PQSL_LIQ10_ARTICOLO = 1;
  public static int PQSL_LIQ10_ANNO_LIQ = 2;
  public static int PQSL_LIQ10_NUMERO_LIQ = 3;
  public static int PQSL_LIQ10_ANNO_IMP = 4;
  public static int PQSL_LIQ10_NUMERO_IMP = 5;
  public static int PQSL_LIQ10_ANNO_SUBIMP = 6;
  public static int PQSL_LIQ10_NUMERO_SUBIMP = 7;
  public static int PQSL_LIQ10_ANNO_DEL = 8;
  public static int PQSL_LIQ10_NUMERO_DEL = 9;
  public static int PQSL_LIQ10_SEDE_DEL = 10;
  public static int PQSL_LIQ10_IMPORTO = 11;
  public static int PQSL_LIQ10_LIQIMPORTIVA = 12;
  public static int PQSL_LIQ10_BENEFICIARIO = 13;
  public static int PQSL_LIQ10_ANNO_DOC = 14;
  public static int PQSL_LIQ10_NUMERO_DOC = 15;
  public static int PQSL_LIQ10_UFFICIO = 16;
  public static int PQSL_LIQ10_ANNO_PROPOSTA = 17;
  public static int PQSL_LIQ10_UNITA_PROPONENTE = 18;
  public static int PQSL_LIQ10_NUMERO_PROPOSTA = 19;
  public static int PQSL_LIQ10_D_DATA_REG = 20;
  public static int PQSL_LIQ10_ANNO_DISTINTA = 21;
  public static int PQSL_LIQ10_NUMERO_DISTINTA = 22;
  public static int PQSL_LIQ10_LIQINEMIS = 23;
  public static int PQSL_LIQ10_LIBERASOESES = 24;
  public static int PQSL_LIQ10_DESCRIZIONE = 25;
  public static int PQSL_LIQ10_LIQFINANZIAM = 26;
  public static int PQSL_LIQ10_TIPO_DISTINTA = 27;
  public static int PQSL_LIQ10_FAT_ANNO_PROG = 28;
  public static int PQSL_LIQ10_FAT_NUMERO_PROG = 29;
  public static int PQSL_LIQ10_LIQINFODOC = 30;
  public static int PQSL_LIQ10_LIQINFODOC1 = 31;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI572 = 3209;
  public static int PQRY_PARAMETRI572_RS = 3210;
  public static int PQSL_PARAMETRI572_PARDATREGLIQ = 0;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE
  //
  public static int PQRY_DISTINLIQU12 = 3211;
  public static int PQSL_DISTINLIQU12_RECORDCAPITO = 0;
  public static int PQSL_DISTINLIQU12_RECORDIMPEGN = 1;
  public static int PQSL_DISTINLIQU12_RECLIQDICOGE = 2;
  public static int PQSL_DISTINLIQU12_RECORDESCCGU = 3;
  public static int PQSL_DISTINLIQU12_RECOCODIFORN = 4;
  public static int PQSL_DISTINLIQU12_RECOANNODIST = 5;
  public static int PQSL_DISTINLIQU12_RECONUMEDIST = 6;
  public static int PQSL_DISTINLIQU12_RECODATADIST = 7;
  public static int PQSL_DISTINLIQU12_RECOUTENINSE = 8;
  public static int PQSL_DISTINLIQU12_RECOUNITORGA = 9;
  public static int PQSL_DISTINLIQU12_RESOANUNORCU = 10;
  public static int PQSL_DISTINLIQU12_RESOANUNODUO = 11;
  public static int PQSL_DISTINLIQU12_RECORSCADDAL = 12;
  public static int PQSL_DISTINLIQU12_RECORSCADEAL = 13;
  public static int PQSL_DISTINLIQU12_RECORNUMEDOC = 14;
  public static int PQSL_DISTINLIQU12_RECODDATADOC = 15;
  public static int PQSL_DISTINLIQU12_RECONUMEPROT = 16;
  public static int PQSL_DISTINLIQU12_RECODDATAPRO = 17;
  public static int PQSL_DISTINLIQU12_RECORDRESIDU = 18;
  public static int PQSL_DISTINLIQU12_RECLIQDISIMP = 19;
  public static int PQSL_DISTINLIQU12_RECORDFORNIT = 20;
  public static int PQSL_DISTINLIQU12_IMPORTO = 21;
  public static int PQSL_DISTINLIQU12_ANNO_IMP = 22;
  public static int PQSL_DISTINLIQU12_NUMERO_IMP = 23;
  public static int PQSL_DISTINLIQU12_ANNO_SUBIMP = 24;
  public static int PQSL_DISTINLIQU12_NUMERO_SUBIMP = 25;
  public static int PQSL_DISTINLIQU12_RECLIQDIVOEC = 26;
  public static int PQSL_DISTINLIQU12_NOMINATIVO = 27;
  public static int PQSL_DISTINLIQU12_RITENUTE = 28;
  public static int PQSL_DISTINLIQU12_RECOIMPONETT = 29;
  public static int PQSL_DISTINLIQU12_DESCRIZIONE = 30;
  public static int PQSL_DISTINLIQU12_CIG = 31;
  public static int PQSL_DISTINLIQU12_CUP = 32;
  public static int PQSL_DISTINLIQU12_FATTORE = 33;
  public static int PQSL_DISTINLIQU12_CENTRO = 34;
  public static int PQSL_DISTINLIQU12_COMPETENZA_DAL = 35;
  public static int PQSL_DISTINLIQU12_COMPETENZA_AL = 36;
  public static int PQSL_DISTINLIQU12_RECLIDICALI1 = 37;
  public static int PQSL_DISTINLIQU12_RECLIDICALI2 = 38;
  public static int PQSL_DISTINLIQU12_RECLIQDIRIDO = 39;
  public static int PQSL_DISTINLIQU12_RECLIQDINUDE = 40;
  public static int PQSL_DISTINLIQU12_RECLIQDISEDE = 41;
  public static int PQSL_DISTINLIQU12_RECLIQDIANDE = 42;
  public static int PQSL_DISTINLIQU12_RECODDATADEL = 43;
  public static int PQSL_DISTINLIQU12_REDILIULDAFC = 44;
  public static int PQSL_DISTINLIQU12_REDILIULDAFN = 45;
  public static int PQSL_DISTINLIQU12_REDILIULDAFR = 46;
  public static int PQSL_DISTINLIQU12_REDILIULDAFS = 47;
  public static int PQSL_DISTINLIQU12_REDILIULDAFV = 48;
  public static int PQSL_DISTINLIQU12_REDILIULUTFC = 49;
  public static int PQSL_DISTINLIQU12_REDILIULUTFN = 50;
  public static int PQSL_DISTINLIQU12_REDILIULUTFR = 51;
  public static int PQSL_DISTINLIQU12_REDILIULUTFS = 52;
  public static int PQSL_DISTINLIQU12_REDILIULUTFV = 53;
  public static int PQSL_DISTINLIQU12_RECFATTRAIVA = 54;
  public static int PQSL_DISTINLIQU12_RECORNOMINCC = 55;
  public static int PQSL_DISTINLIQU12_RECORNOMINNO = 56;
  public static int PQSL_DISTINLIQU12_RECORNOMINRC = 57;
  public static int PQSL_DISTINLIQU12_RECORNOMINSF = 58;
  public static int PQSL_DISTINLIQU12_RECORNOMINVR = 59;
  public static int PQSL_DISTINLIQU12_RECIMPNUMDEL = 60;
  public static int PQSL_DISTINLIQU12_RECIMPANNDEL = 61;
  public static int PQSL_DISTINLIQU12_RECIMPSEDDEL = 62;
  public static int PQSL_DISTINLIQU12_IMPDATADEL = 63;
  public static int PQSL_DISTINLIQU12_RECOCENTCENT = 64;
  public static int PQSL_DISTINLIQU12_RECOFATTFATT = 65;
  public static int PQSL_DISTINLIQU12_FATTURESPRC = 66;

  // Table to contain panel selected row: LIQ DISTINTA
  //
  public static int PQRY_LIQDISTINT12 = 3212;
  public static int PQSL_LIQDISTINT12_RECFATANNPRO = 0;
  public static int PQSL_LIQDISTINT12_RECFATNUMPRO = 1;
  public static int PQSL_LIQDISTINT12_RECFATNUMDOC = 2;
  public static int PQSL_LIQDISTINT12_RECFATDDATDO = 3;
  public static int PQSL_LIQDISTINT12_RECFATTRAIVA = 4;
  public static int PQSL_LIQDISTINT12_IMPORTO = 5;
  public static int PQSL_LIQDISTINT12_IMPORTOIVA = 6;
  public static int PQSL_LIQDISTINT12_IMPORTONETTO = 7;

  // Table to contain panel selected row: T72
  //
  public static int PQRY_T73 = 3213;
  public static int PQSL_T73_CODICE = 0;
  public static int PQSL_T73_DESCRIZIONE = 1;
  public static int PQSL_T73_TIPO = 2;
  public static int PQSL_T73_D_DATA_ELAB = 3;
  public static int PQSL_T73_UTENTE_INSERIMENTO = 4;
  public static int PQSL_T73_DATA_INSERIMENTO = 5;
  public static int PQSL_T73_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_T73_DATA_ULTIMO_AGG = 7;
  public static int PQSL_T73_SEZIONE = 8;
  public static int PQSL_T73_IMPORT_DA_FILE = 9;
  public static int PQSL_T73_TIPO_FILE = 10;
  public static int PQSL_T73_TIPO_MOVI = 11;

  // Table to contain panel selected row: T72
  //
  public static int PQRY_T72 = 3214;
  public static int PQSL_T72_CODICE = 0;
  public static int PQSL_T72_DESCRIZIONE = 1;
  public static int PQSL_T72_TIPO = 2;
  public static int PQSL_T72_D_DATA_ELAB = 3;
  public static int PQSL_T72_UTENTE_INSERIMENTO = 4;
  public static int PQSL_T72_DATA_INSERIMENTO = 5;
  public static int PQSL_T72_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_T72_DATA_ULTIMO_AGG = 7;
  public static int PQSL_T72_T72SEZIONE = 8;
  public static int PQSL_T72_T72IMPODAFIL = 9;
  public static int PQSL_T72_T72TIPOFILE = 10;

  // Table to contain panel selected row: GRO
  //
  public static int PQRY_GRO2 = 3215;
  public static int PQSL_GRO2_RECORDCAPITO = 0;
  public static int PQSL_GRO2_RECORDARTICO = 1;
  public static int PQSL_GRO2_RECORCAPIART = 2;
  public static int PQSL_GRO2_RECORDDISPON = 3;
  public static int PQSL_GRO2_RECOTOTAGRUP = 4;
  public static int PQSL_GRO2_RECORDISPRIS = 5;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM160 = 3216;
  public static int PQRY_PARAM160_RS = 3217;
  public static int PQSL_PARAM160_NOMOGGNEWGRU = 0;
  public static int PQSL_PARAM160_NOMOGGNEWDES = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI569 = 3218;
  public static int PQRY_PARAMETRI569_RS = 3219;
  public static int PQSL_PARAMETRI569_VALOCOMCKDEL = 0;
  public static int PQSL_PARAMETRI569_ANNO_DEL = 1;
  public static int PQSL_PARAMETRI569_NUMERO_DEL = 2;
  public static int PQSL_PARAMETRI569_SEDE_DEL = 3;
  public static int PQSL_PARAMETRI569_VALOCOMCKDES = 4;
  public static int PQSL_PARAMETRI569_DESCRIZIONE = 5;
  public static int PQSL_PARAMETRI569_VALCOMCKTIVI = 6;
  public static int PQSL_PARAMETRI569_TIPO_VINCOLO = 7;
  public static int PQSL_PARAMETRI569_VALCOMCKMAIN = 8;
  public static int PQSL_PARAMETRI569_SPESE = 9;
  public static int PQSL_PARAMETRI569_SCADENZA = 10;
  public static int PQSL_PARAMETRI569_ALLEGATI = 11;
  public static int PQSL_PARAMETRI569_COMMISSIONI = 12;
  public static int PQSL_PARAMETRI569_INFO_TESORIERE = 13;
  public static int PQSL_PARAMETRI569_VALOCOMCKECO = 14;
  public static int PQSL_PARAMETRI569_FATTORE = 15;
  public static int PQSL_PARAMETRI569_CENTRO = 16;
  public static int PQSL_PARAMETRI569_COMP_DAL = 17;
  public static int PQSL_PARAMETRI569_COMP_AL = 18;
  public static int PQSL_PARAMETRI569_VALOCOMCKTRA = 19;
  public static int PQSL_PARAMETRI569_CODICE_COFOG = 20;
  public static int PQSL_PARAMETRI569_COD_LIVELLO_5 = 21;
  public static int PQSL_PARAMETRI569_CODICE_EUROPEO = 22;
  public static int PQSL_PARAMETRI569_VALOCOMCKCAP = 23;
  public static int PQSL_PARAMETRI569_CAPITOLO = 24;
  public static int PQSL_PARAMETRI569_ARTICOLO = 25;
  public static int PQSL_PARAMETRI569_VALCOMCKIMAC = 26;
  public static int PQSL_PARAMETRI569_VALCOMANIMAC = 27;
  public static int PQSL_PARAMETRI569_VALCOMNUIMAC = 28;
  public static int PQSL_PARAMETRI569_VALOCOMCKSUB = 29;
  public static int PQSL_PARAMETRI569_VALCOMANNSUB = 30;
  public static int PQSL_PARAMETRI569_VALCOMNUMSUB = 31;
  public static int PQSL_PARAMETRI569_VOCE_ECON = 32;
  public static int PQSL_PARAMETRI569_CODICE_GESTIONALE = 33;
  public static int PQSL_PARAMETRI569_FINANZIAMENTO = 34;
  public static int PQSL_PARAMETRI569_OPERA = 35;
  public static int PQSL_PARAMETRI569_SE_SUBIMPEGNO = 36;
  public static int PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA = 37;
  public static int PQSL_PARAMETRI569_BENEFICIARIO = 38;
  public static int PQSL_PARAMETRI569_NUM_QUIETANZA = 39;

  // Table to contain panel selected row: GRUPPI MOVIMENTI
  //
  public static int PQRY_GRUPPIMOVIME = 3220;
  public static int PQSL_GRUPPIMOVIME_CODICE = 0;
  public static int PQSL_GRUPPIMOVIME_DESCRIZIONE = 1;
  public static int PQSL_GRUPPIMOVIME_TIPO_MOVIMENTO = 2;
  public static int PQSL_GRUPPIMOVIME_UTENTE_INSERIMENTO = 3;
  public static int PQSL_GRUPPIMOVIME_DATA_INSERIMENTO = 4;
  public static int PQSL_GRUPPIMOVIME_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_GRUPPIMOVIME_DATA_ULTIMO_AGG = 6;
  public static int PQSL_GRUPPIMOVIME_TIPO_FILE = 7;

  // Table to contain panel selected row: MOVIMENTI IMPORT
  //
  public static int PQRY_MOVIMEIMPORT = 3221;
  public static int PQSL_MOVIMEIMPORT_PROGRESSIVO = 0;
  public static int PQSL_MOVIMEIMPORT_GRUPPO = 1;
  public static int PQSL_MOVIMEIMPORT_TIPO_MOVI = 2;
  public static int PQSL_MOVIMEIMPORT_CAPITOLO = 3;
  public static int PQSL_MOVIMEIMPORT_MOVIMPCAPOLD = 4;
  public static int PQSL_MOVIMEIMPORT_ARTICOLO = 5;
  public static int PQSL_MOVIMEIMPORT_MOVIMPARTOLD = 6;
  public static int PQSL_MOVIMEIMPORT_NUMERO_MOVI_VAR = 7;
  public static int PQSL_MOVIMEIMPORT_ANNO_MOVI_VAR = 8;
  public static int PQSL_MOVIMEIMPORT_DATA_REGISTRAZIONE = 9;
  public static int PQSL_MOVIMEIMPORT_SOGGETTO = 10;
  public static int PQSL_MOVIMEIMPORT_MOVIMPSOGOLD = 11;
  public static int PQSL_MOVIMEIMPORT_IMPORTO = 12;
  public static int PQSL_MOVIMEIMPORT_DESCRIZIONE = 13;
  public static int PQSL_MOVIMEIMPORT_TIPO_VINCOLO = 14;
  public static int PQSL_MOVIMEIMPORT_IMPUTAZIONE_ECONOMICA = 15;
  public static int PQSL_MOVIMEIMPORT_CENTRO = 16;
  public static int PQSL_MOVIMEIMPORT_FATTORE = 17;
  public static int PQSL_MOVIMEIMPORT_COMPETENZA_DAL = 18;
  public static int PQSL_MOVIMEIMPORT_COMPETENZA_AL = 19;
  public static int PQSL_MOVIMEIMPORT_FINANZIAMENTO = 20;
  public static int PQSL_MOVIMEIMPORT_OPERA = 21;
  public static int PQSL_MOVIMEIMPORT_DATA_REG_ECONOMICA = 22;
  public static int PQSL_MOVIMEIMPORT_UTENTE_INSERIMENTO = 23;
  public static int PQSL_MOVIMEIMPORT_DATA_INSERIMENTO = 24;
  public static int PQSL_MOVIMEIMPORT_UTENTE_ULTIMO_AGG = 25;
  public static int PQSL_MOVIMEIMPORT_DATA_ULTIMO_AGG = 26;
  public static int PQSL_MOVIMEIMPORT_COD_LIVELLO_5 = 27;
  public static int PQSL_MOVIMEIMPORT_CODICE_EUROPEO = 28;
  public static int PQSL_MOVIMEIMPORT_ANNO_DEL = 29;
  public static int PQSL_MOVIMEIMPORT_NUMERO_DEL = 30;
  public static int PQSL_MOVIMEIMPORT_SEDE_DEL = 31;
  public static int PQSL_MOVIMEIMPORT_ANNO_PROPOSTA = 32;
  public static int PQSL_MOVIMEIMPORT_UNITA_PROPONENTE = 33;
  public static int PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA = 34;
  public static int PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO = 35;
  public static int PQSL_MOVIMEIMPORT_NUMERO_MOVI_EMESSO = 36;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI645 = 3222;
  public static int PQRY_PARAMETRI645_RS = 3223;
  public static int PQSL_PARAMETRI645_PARACODIGRUP = 0;
  public static int PQSL_PARAMETRI645_PARADESCGRUP = 1;
  public static int PQSL_PARAMETRI645_PARATIPOMOVI = 2;
  public static int PQSL_PARAMETRI645_PARANCDETEME = 3;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION6 = 3224;
  public static int PQSL_NOTEFUNZION6_RECNOTFUNDES = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI647 = 3225;
  public static int PQRY_PARAMETRI647_RS = 3226;
  public static int PQSL_PARAMETRI647_VALOCOMCKDEL = 0;
  public static int PQSL_PARAMETRI647_ANNO_DEL = 1;
  public static int PQSL_PARAMETRI647_NUMERO_DEL = 2;
  public static int PQSL_PARAMETRI647_SEDE_DEL = 3;
  public static int PQSL_PARAMETRI647_VALOCOMCKDES = 4;
  public static int PQSL_PARAMETRI647_DESCRIZIONE = 5;
  public static int PQSL_PARAMETRI647_VALCOMCKTIVI = 6;
  public static int PQSL_PARAMETRI647_TIPO_VINCOLO = 7;
  public static int PQSL_PARAMETRI647_VALOCOMCKECO = 8;
  public static int PQSL_PARAMETRI647_FATTORE = 9;
  public static int PQSL_PARAMETRI647_CENTRO = 10;
  public static int PQSL_PARAMETRI647_COMP_DAL = 11;
  public static int PQSL_PARAMETRI647_COMP_AL = 12;
  public static int PQSL_PARAMETRI647_VALCOMIMPECO = 13;
  public static int PQSL_PARAMETRI647_VALOCOMCKTRA = 14;
  public static int PQSL_PARAMETRI647_CODICE_COFOG = 15;
  public static int PQSL_PARAMETRI647_COD_LIVELLO_5 = 16;
  public static int PQSL_PARAMETRI647_CODICE_EUROPEO = 17;
  public static int PQSL_PARAMETRI647_VALOCOMCKCAP = 18;
  public static int PQSL_PARAMETRI647_CAPITOLO = 19;
  public static int PQSL_PARAMETRI647_ARTICOLO = 20;
  public static int PQSL_PARAMETRI647_FINANZIAMENTO = 21;
  public static int PQSL_PARAMETRI647_OPERA = 22;
  public static int PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA = 23;
  public static int PQSL_PARAMETRI647_BENEFICIARIO = 24;
  public static int PQSL_PARAMETRI647_NUM_QUIETANZA = 25;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI625 = 3227;
  public static int PQRY_PARAMETRI625_RS = 3228;
  public static int PQSL_PARAMETRI625_PARAFILDAIMP = 0;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI2 = 3229;
  public static int PQRY_FILTRI2_RS = 3230;
  public static int PQSL_FILTRI2_ROWNAMNUMDAL = 0;
  public static int PQSL_FILTRI2_ROWNAMENUMAL = 1;
  public static int PQSL_FILTRI2_ROWNAMDATDAL = 2;
  public static int PQSL_FILTRI2_ROWNAMEDATAL = 3;
  public static int PQSL_FILTRI2_ROWNAMNUMLIQ = 4;
  public static int PQSL_FILTRI2_ROWNAMANNLIQ = 5;
  public static int PQSL_FILTRI2_ROWNAMEMANDA = 6;
  public static int PQSL_FILTRI2_RONANOININFL = 7;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN7 = 3231;
  public static int PQSL_MAN7_ANNO_MAND = 0;
  public static int PQSL_MAN7_NUMERO_MAND = 1;
  public static int PQSL_MAN7_D_DATA_MAND = 2;
  public static int PQSL_MAN7_IMPORTO = 3;
  public static int PQSL_MAN7_PAGATO = 4;
  public static int PQSL_MAN7_NUMERO_ELENCO = 5;
  public static int PQSL_MAN7_D_DATA_ELENCO = 6;
  public static int PQSL_MAN7_VOCE_ECON = 7;
  public static int PQSL_MAN7_TIPO_VINCOLO = 8;
  public static int PQSL_MAN7_CAPITOLO = 9;
  public static int PQSL_MAN7_ARTICOLO = 10;
  public static int PQSL_MAN7_NUMERO_IMP = 11;
  public static int PQSL_MAN7_ANNO_IMP = 12;
  public static int PQSL_MAN7_BOLLO = 13;
  public static int PQSL_MAN7_RECVINDESEXP = 14;
  public static int PQSL_MAN7_UFFICIO = 15;
  public static int PQSL_MAN7_UTENTE_INSERIMENTO = 16;
  public static int PQSL_MAN7_DATA_INSERIMENTO = 17;
  public static int PQSL_MAN7_UTENTE_ULTIMO_AGG = 18;
  public static int PQSL_MAN7_DATA_ULTIMO_AGG = 19;
  public static int PQSL_MAN7_RECODETTMAND = 20;
  public static int PQSL_MAN7_D_DATA_VALUTA = 21;
  public static int PQSL_MAN7_COPERTURA = 22;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ17 = 3232;
  public static int PQSL_LIQ17_NUMERO_LIQ = 0;
  public static int PQSL_LIQ17_D_DATA_REG = 1;
  public static int PQSL_LIQ17_REBERASOESES = 2;
  public static int PQSL_LIQ17_D_DATA_DOC = 3;
  public static int PQSL_LIQ17_DESCRIZIONE = 4;
  public static int PQSL_LIQ17_UFFICIO = 5;
  public static int PQSL_LIQ17_SEDE_DEL = 6;
  public static int PQSL_LIQ17_NUMERO_DEL = 7;
  public static int PQSL_LIQ17_ANNO_DEL = 8;
  public static int PQSL_LIQ17_NUMERO_DOC = 9;
  public static int PQSL_LIQ17_RITENUTE = 10;
  public static int PQSL_LIQ17_IMPORTO = 11;
  public static int PQSL_LIQ17_PROGRESSIVO_TESO = 12;
  public static int PQSL_LIQ17_ANNO_LIQ = 13;
  public static int PQSL_LIQ17_IMPORTO_PAGAM = 14;
  public static int PQSL_LIQ17_RECONUMEDOC1 = 15;
  public static int PQSL_LIQ17_RECODISTTECN = 16;
  public static int PQSL_LIQ17_RECORDDESCR1 = 17;
  public static int PQSL_LIQ17_RECORDDESCRI = 18;
  public static int PQSL_LIQ17_RECQUIINFEXP = 19;
  public static int PQSL_LIQ17_RECORDUFFICI = 20;
  public static int PQSL_LIQ17_CODICE = 21;
  public static int PQSL_LIQ17_RECORDFINANZ = 22;
  public static int PQSL_LIQ17_RECORDCGU = 23;
  public static int PQSL_LIQ17_RECAPRLIQEXP = 24;
  public static int PQSL_LIQ17_RECOORDIEXPR = 25;
  public static int PQSL_LIQ17_RECOORDIEXP2 = 26;
  public static int PQSL_LIQ17_NUM_QUIETANZA = 27;
  public static int PQSL_LIQ17_RECORDCODIC1 = 28;
  public static int PQSL_LIQ17_PIANOCONTINT = 29;
  public static int PQSL_LIQ17_RECLIQCODCOF = 30;
  public static int PQSL_LIQ17_RECLIQCODEUR = 31;
  public static int PQSL_LIQ17_RECLIQIMPIVA = 32;
  public static int PQSL_LIQ17_RECLIQIMIVIS = 33;
  public static int PQSL_LIQ17_RECORINFOLIQ = 34;
  public static int PQSL_LIQ17_RECORINFODOC = 35;
  public static int PQSL_LIQ17_RECLIQFAANPR = 36;
  public static int PQSL_LIQ17_RECLIQFANUPR = 37;

  // Table to contain panel selected row: PAGAMENTI
  //
  public static int PQRY_PAGAMENTI2 = 3233;
  public static int PQSL_PAGAMENTI2_PROGRESSIVO = 0;
  public static int PQSL_PAGAMENTI2_ANNO_MAND = 1;
  public static int PQSL_PAGAMENTI2_NUMERO_MAND = 2;
  public static int PQSL_PAGAMENTI2_ANNO_LIQ = 3;
  public static int PQSL_PAGAMENTI2_NUMERO_LIQ = 4;
  public static int PQSL_PAGAMENTI2_DATA_PAGAM = 5;
  public static int PQSL_PAGAMENTI2_IMPORTO = 6;
  public static int PQSL_PAGAMENTI2_NUMERO_PAGAM = 7;
  public static int PQSL_PAGAMENTI2_D_DATA_PAGAM = 8;
  public static int PQSL_PAGAMENTI2_UTENTE_INSERIMENTO = 9;
  public static int PQSL_PAGAMENTI2_DATA_INSERIMENTO = 10;
  public static int PQSL_PAGAMENTI2_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_PAGAMENTI2_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: Parametri Pagamenti
  //
  public static int PQRY_PARAMEPAGAM2 = 3234;
  public static int PQRY_PARAMEPAGAM2_RS = 3235;
  public static int PQSL_PARAMEPAGAM2_ROWNAMIDFLBT = 0;
  public static int PQSL_PARAMEPAGAM2_ROWNAMDATDAL = 1;
  public static int PQSL_PARAMEPAGAM2_ROWNAMEDATAL = 2;

  // Table to contain panel selected row: PAGAMENTI
  //
  public static int PQRY_PAGAMENTI1 = 3236;
  public static int PQSL_PAGAMENTI1_PROGRESSIVO = 0;
  public static int PQSL_PAGAMENTI1_ANNO_MAND = 1;
  public static int PQSL_PAGAMENTI1_NUMERO_MAND = 2;
  public static int PQSL_PAGAMENTI1_ANNO_LIQ = 3;
  public static int PQSL_PAGAMENTI1_NUMERO_LIQ = 4;
  public static int PQSL_PAGAMENTI1_DATA_PAGAM = 5;
  public static int PQSL_PAGAMENTI1_IMPORTO = 6;
  public static int PQSL_PAGAMENTI1_NUMERO_PAGAM = 7;
  public static int PQSL_PAGAMENTI1_D_DATA_PAGAM = 8;
  public static int PQSL_PAGAMENTI1_UTENTE_INSERIMENTO = 9;
  public static int PQSL_PAGAMENTI1_DATA_INSERIMENTO = 10;
  public static int PQSL_PAGAMENTI1_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_PAGAMENTI1_DATA_ULTIMO_AGG = 12;
  public static int PQSL_PAGAMENTI1_PAGAIDFLUSBT = 13;
  public static int PQSL_PAGAMENTI1_PAGADATAVALU = 14;
  public static int PQSL_PAGAMENTI1_PAGCODRIFOPE = 15;
  public static int PQSL_PAGAMENTI1_PAGAIMPOBOLL = 16;
  public static int PQSL_PAGAMENTI1_PAGAIMPOSPES = 17;
  public static int PQSL_PAGAMENTI1_PAGAIMPOCOMM = 18;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ12 = 3237;
  public static int PQSL_LIQ12_IMPORTO = 0;
  public static int PQSL_LIQ12_IMPORTO_PAGAM = 1;
  public static int PQSL_LIQ12_ANNO_LIQ = 2;
  public static int PQSL_LIQ12_NUMERO_LIQ = 3;
  public static int PQSL_LIQ12_SEDE_DEL = 4;
  public static int PQSL_LIQ12_NUMERO_DEL = 5;
  public static int PQSL_LIQ12_ANNO_DEL = 6;
  public static int PQSL_LIQ12_REBERASOESES = 7;
  public static int PQSL_LIQ12_BENEFICIARIO = 8;
  public static int PQSL_LIQ12_ANNO_DOC = 9;
  public static int PQSL_LIQ12_NUMERO_DOC = 10;
  public static int PQSL_LIQ12_NUM_QUIETANZA = 11;
  public static int PQSL_LIQ12_DESCRIZIONE = 12;
  public static int PQSL_LIQ12_DIVERSO_BEN = 13;
  public static int PQSL_LIQ12_RECBERASOES2 = 14;
  public static int PQSL_LIQ12_NUM_QUIETANZA_DIV_BEN = 15;
  public static int PQSL_LIQ12_RECORDDESCR2 = 16;
  public static int PQSL_LIQ12_CAUSALE = 17;
  public static int PQSL_LIQ12_RECORDDESCR3 = 18;
  public static int PQSL_LIQ12_ANNO_IMP = 19;
  public static int PQSL_LIQ12_NUMERO_IMP = 20;
  public static int PQSL_LIQ12_ANNO_SUBIMP = 21;
  public static int PQSL_LIQ12_NUMERO_SUBIMP = 22;
  public static int PQSL_LIQ12_CAPITOLO = 23;
  public static int PQSL_LIQ12_ARTICOLO = 24;
  public static int PQSL_LIQ12_S = 25;
  public static int PQSL_LIQ12_RITENUTE = 26;
  public static int PQSL_LIQ12_NUMERO_CONTABILE = 27;
  public static int PQSL_LIQ12_DATA_CONTABILE = 28;
  public static int PQSL_LIQ12_D_DATA_REG = 29;
  public static int PQSL_LIQ12_D_DATA_DOC = 30;
  public static int PQSL_LIQ12_RECORDPAGAME = 31;
  public static int PQSL_LIQ12_PROGRESSIVO_TESO = 32;
  public static int PQSL_LIQ12_DATA_PAGAM = 33;
  public static int PQSL_LIQ12_NUMERO_PAGAM = 34;
  public static int PQSL_LIQ12_DATAPAGAMEOK = 35;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN8 = 3238;
  public static int PQSL_MAN8_ANNO_MAND = 0;
  public static int PQSL_MAN8_NUMERO_MAND = 1;
  public static int PQSL_MAN8_D_DATA_MAND = 2;
  public static int PQSL_MAN8_IMPORTO = 3;
  public static int PQSL_MAN8_PAGATO = 4;
  public static int PQSL_MAN8_NUMERO_ELENCO = 5;
  public static int PQSL_MAN8_D_DATA_ELENCO = 6;
  public static int PQSL_MAN8_VOCE_ECON = 7;
  public static int PQSL_MAN8_TIPO_VINCOLO = 8;
  public static int PQSL_MAN8_CAPITOLO = 9;
  public static int PQSL_MAN8_ARTICOLO = 10;
  public static int PQSL_MAN8_NUMERO_IMP = 11;
  public static int PQSL_MAN8_ANNO_IMP = 12;
  public static int PQSL_MAN8_RECORT53EXPR = 13;
  public static int PQSL_MAN8_RECORMANBOLL = 14;
  public static int PQSL_MAN8_RECVINDESEXP = 15;
  public static int PQSL_MAN8_UFFICIO = 16;
  public static int PQSL_MAN8_BOLLO = 17;
  public static int PQSL_MAN8_UTENTE_INSERIMENTO = 18;
  public static int PQSL_MAN8_DATA_INSERIMENTO = 19;
  public static int PQSL_MAN8_UTENTE_ULTIMO_AGG = 20;
  public static int PQSL_MAN8_DATA_ULTIMO_AGG = 21;
  public static int PQSL_MAN8_RECODETTMAND = 22;
  public static int PQSL_MAN8_D_DATA_VALUTA = 23;
  public static int PQSL_MAN8_RECORDCOPERT = 24;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ9 = 3239;
  public static int PQSL_LIQ9_NUMERO_LIQ = 0;
  public static int PQSL_LIQ9_D_DATA_REG = 1;
  public static int PQSL_LIQ9_REBERASOESES = 2;
  public static int PQSL_LIQ9_D_DATA_DOC = 3;
  public static int PQSL_LIQ9_DESCRIZIONE = 4;
  public static int PQSL_LIQ9_UFFICIO = 5;
  public static int PQSL_LIQ9_SEDE_DEL = 6;
  public static int PQSL_LIQ9_NUMERO_DEL = 7;
  public static int PQSL_LIQ9_ANNO_DEL = 8;
  public static int PQSL_LIQ9_NUMERO_DOC = 9;
  public static int PQSL_LIQ9_RITENUTE = 10;
  public static int PQSL_LIQ9_IMPORTO = 11;
  public static int PQSL_LIQ9_PROGRESSIVO_TESO = 12;
  public static int PQSL_LIQ9_ANNO_LIQ = 13;
  public static int PQSL_LIQ9_IMPORTO_PAGAM = 14;
  public static int PQSL_LIQ9_RECONUMEDOC1 = 15;
  public static int PQSL_LIQ9_RECODISTTECN = 16;
  public static int PQSL_LIQ9_RECORDDESCR1 = 17;
  public static int PQSL_LIQ9_RECORDDESCRI = 18;
  public static int PQSL_LIQ9_RECQUIINFEXP = 19;
  public static int PQSL_LIQ9_RECORDUFFICI = 20;
  public static int PQSL_LIQ9_CODICE = 21;
  public static int PQSL_LIQ9_RECORDFINANZ = 22;
  public static int PQSL_LIQ9_RECORDCGU = 23;
  public static int PQSL_LIQ9_RECAPRLIQEXP = 24;
  public static int PQSL_LIQ9_RECOORDIEXPR = 25;
  public static int PQSL_LIQ9_RECOORDIEXP2 = 26;
  public static int PQSL_LIQ9_NUM_QUIETANZA = 27;
  public static int PQSL_LIQ9_RECORDCODIC1 = 28;
  public static int PQSL_LIQ9_RECLIQIMPIVA = 29;

  // Table to contain panel selected row: PAGAMENTI
  //
  public static int PQRY_PAGAMENTI = 3240;
  public static int PQSL_PAGAMENTI_PROGRESSIVO = 0;
  public static int PQSL_PAGAMENTI_ANNO_MAND = 1;
  public static int PQSL_PAGAMENTI_NUMERO_MAND = 2;
  public static int PQSL_PAGAMENTI_ANNO_LIQ = 3;
  public static int PQSL_PAGAMENTI_NUMERO_LIQ = 4;
  public static int PQSL_PAGAMENTI_DATA_PAGAM = 5;
  public static int PQSL_PAGAMENTI_IMPORTO = 6;
  public static int PQSL_PAGAMENTI_NUMERO_PAGAM = 7;
  public static int PQSL_PAGAMENTI_D_DATA_PAGAM = 8;
  public static int PQSL_PAGAMENTI_UTENTE_INSERIMENTO = 9;
  public static int PQSL_PAGAMENTI_DATA_INSERIMENTO = 10;
  public static int PQSL_PAGAMENTI_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_PAGAMENTI_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI225 = 3241;
  public static int PQRY_PARAMETRI225_RS = 3242;
  public static int PQSL_PARAMETRI225_PARADATAEMIS = 0;
  public static int PQSL_PARAMETRI225_PARAMSCA = 1;
  public static int PQSL_PARAMETRI225_PARAMSCCG = 2;
  public static int PQSL_PARAMETRI225_PARAMSCE = 3;
  public static int PQSL_PARAMETRI225_PARAMUFFICIO = 4;
  public static int PQSL_PARAMETRI225_PARATIPOSCAD = 5;
  public static int PQSL_PARAMETRI225_PARAMSCCTE = 6;
  public static int PQSL_PARAMETRI225_PARSOLCONCAS = 7;
  public static int PQSL_PARAMETRI225_PARAMANDACOP = 8;
  public static int PQSL_PARAMETRI225_PARSOLCOQUSC = 9;

  // Table to contain panel selected row: VISTA TOT CASSA FIN
  //
  public static int PQRY_VISTOTCASFIN = 3243;
  public static int PQSL_VISTOTCASFIN_FINANZIAMENTO = 0;
  public static int PQSL_VISTOTCASFIN_DESCRIZIONE = 1;
  public static int PQSL_VISTOTCASFIN_VISTOTCAFIMA = 2;
  public static int PQSL_VISTOTCASFIN_VISTOTCAFIOR = 3;
  public static int PQSL_VISTOTCASFIN_SALDO_INI_CASSA = 4;
  public static int PQSL_VISTOTCASFIN_VISTOTCAFIAN = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI145 = 3244;
  public static int PQRY_PARAMETRI145_RS = 3245;
  public static int PQSL_PARAMETRI145_PARADETTLIQU = 0;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ16 = 3246;
  public static int PQSL_LIQ16_NUMERO_LIQ = 0;
  public static int PQSL_LIQ16_D_DATA_REG = 1;
  public static int PQSL_LIQ16_IMPORTO = 2;
  public static int PQSL_LIQ16_LIQVOCEPEG = 3;
  public static int PQSL_LIQ16_LIQIMPEGNO = 4;
  public static int PQSL_LIQ16_LIQSUBIMPEGN = 5;
  public static int PQSL_LIQ16_LIBERASOESES = 6;
  public static int PQSL_LIQ16_DESCRIZIONE = 7;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ8 = 3247;
  public static int PQRY_LIQ8_RS = 3248;
  public static int PQSL_LIQ8_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ8_LIQBENEFICIA = 1;
  public static int PQSL_LIQ8_LIQIMPORTO = 2;
  public static int PQSL_LIQ8_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ8_LIQSTATOCGU = 4;
  public static int PQSL_LIQ8_ANNOLIQ = 5;
  public static int PQSL_LIQ8_NUMEROLIQ = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ34 = 3249;
  public static int PQRY_LIQ34_RS = 3250;
  public static int PQSL_LIQ34_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ34_LIQBENEFICIA = 1;
  public static int PQSL_LIQ34_LIQIMPORTO = 2;
  public static int PQSL_LIQ34_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ34_LIQSTATOCGU = 4;
  public static int PQSL_LIQ34_ANNOLIQ = 5;
  public static int PQSL_LIQ34_NUMEROLIQ = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ59 = 3251;
  public static int PQRY_LIQ59_RS = 3252;
  public static int PQSL_LIQ59_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ59_LIQBENEFICIA = 1;
  public static int PQSL_LIQ59_LIQIMPORTO = 2;
  public static int PQSL_LIQ59_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ59_ANNOLIQ = 4;
  public static int PQSL_LIQ59_NUMEROLIQ = 5;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ31 = 3253;
  public static int PQRY_LIQ31_RS = 3254;
  public static int PQSL_LIQ31_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ31_LIQBENEFICIA = 1;
  public static int PQSL_LIQ31_LIQIMPORTO = 2;
  public static int PQSL_LIQ31_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ31_ANNOLIQ = 4;
  public static int PQSL_LIQ31_NUMEROLIQ = 5;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ35 = 3255;
  public static int PQRY_LIQ35_RS = 3256;
  public static int PQSL_LIQ35_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ35_LIQBENEFICIA = 1;
  public static int PQSL_LIQ35_LIQIMPORTO = 2;
  public static int PQSL_LIQ35_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ35_LIQSTATOCTE = 4;
  public static int PQSL_LIQ35_ANNOLIQ = 5;
  public static int PQSL_LIQ35_NUMEROLIQ = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ32 = 3257;
  public static int PQRY_LIQ32_RS = 3258;
  public static int PQSL_LIQ32_LIQLIQUIDAZI = 0;
  public static int PQSL_LIQ32_LIQBENEFICIA = 1;
  public static int PQSL_LIQ32_LIQIMPORTO = 2;
  public static int PQSL_LIQ32_LIQDESCRIZIO = 3;
  public static int PQSL_LIQ32_LIQSTATOCTE = 4;
  public static int PQSL_LIQ32_ANNOLIQ = 5;
  public static int PQSL_LIQ32_NUMEROLIQ = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ57 = 3259;
  public static int PQSL_LIQ57_RECORNUMELIQ = 0;
  public static int PQSL_LIQ57_RECORANNOLIQ = 1;
  public static int PQSL_LIQ57_RECORBENCODI = 2;
  public static int PQSL_LIQ57_RECORDBENEFI = 3;
  public static int PQSL_LIQ57_RECQTNNUMQUI = 4;
  public static int PQSL_LIQ57_RECORDQUIETA = 5;
  public static int PQSL_LIQ57_RECORDSCADEN = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ = 3260;
  public static int PQSL_LIQ_RECORNUMELIQ = 0;
  public static int PQSL_LIQ_RECORANNOLIQ = 1;
  public static int PQSL_LIQ_RECORBENCODI = 2;
  public static int PQSL_LIQ_RECORDBENEFI = 3;
  public static int PQSL_LIQ_RECQTNNUMQUI = 4;
  public static int PQSL_LIQ_RECORDQUIETA = 5;
  public static int PQSL_LIQ_RECORDSCADEN = 6;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN6 = 3261;
  public static int PQSL_MAN6_IMPORTO = 0;
  public static int PQSL_MAN6_CAPITOLO = 1;
  public static int PQSL_MAN6_ARTICOLO = 2;
  public static int PQSL_MAN6_NUMERO_IMP = 3;
  public static int PQSL_MAN6_ANNO_IMP = 4;
  public static int PQSL_MAN6_MANBOLLO = 5;
  public static int PQSL_MAN6_VOCE_ECON = 6;
  public static int PQSL_MAN6_MANTIPOVINCO = 7;
  public static int PQSL_MAN6_MANUFFICIO = 8;
  public static int PQSL_MAN6_UFFICIO = 9;
  public static int PQSL_MAN6_BOLLO = 10;
  public static int PQSL_MAN6_TIPO_VINCOLO = 11;
  public static int PQSL_MAN6_NUMERO_MAND = 12;
  public static int PQSL_MAN6_ANNO_MAND = 13;
  public static int PQSL_MAN6_D_DATA_MAND = 14;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI293 = 3262;
  public static int PQRY_PARAMETRI293_RS = 3263;
  public static int PQSL_PARAMETRI293_ROWNAMDAMADA = 0;
  public static int PQSL_PARAMETRI293_ROWNAMDAMAAL = 1;
  public static int PQSL_PARAMETRI293_ROWNAMNUMADA = 2;
  public static int PQSL_PARAMETRI293_ROWNAMNUMAAL = 3;
  public static int PQSL_PARAMETRI293_ROWNAMENUMER = 4;
  public static int PQSL_PARAMETRI293_ROWNAMEDATA = 5;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN5 = 3264;
  public static int PQSL_MAN5_NUMERO_MAND = 0;
  public static int PQSL_MAN5_ANNO_MAND = 1;
  public static int PQSL_MAN5_D_DATA_MAND = 2;
  public static int PQSL_MAN5_D_DATA_ELENCO = 3;
  public static int PQSL_MAN5_IMPORTO = 4;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ15 = 3265;
  public static int PQSL_LIQ15_NUMERO_LIQ = 0;
  public static int PQSL_LIQ15_ANNO_LIQ = 1;
  public static int PQSL_LIQ15_D_DATA_REG = 2;
  public static int PQSL_LIQ15_LIBERASOESES = 3;
  public static int PQSL_LIQ15_NUMERO_DOC = 4;
  public static int PQSL_LIQ15_D_DATA_DOC = 5;
  public static int PQSL_LIQ15_D_SCADENZA = 6;
  public static int PQSL_LIQ15_DESCRIZIONE = 7;
  public static int PQSL_LIQ15_IMPORTO = 8;
  public static int PQSL_LIQ15_RITENUTE = 9;
  public static int PQSL_LIQ15_CAPITOLO = 10;
  public static int PQSL_LIQ15_ARTICOLO = 11;
  public static int PQSL_LIQ15_NUMERO_IMP = 12;
  public static int PQSL_LIQ15_ANNO_IMP = 13;
  public static int PQSL_LIQ15_SEDE_DEL = 14;
  public static int PQSL_LIQ15_NUMERO_DEL = 15;
  public static int PQSL_LIQ15_ANNO_DEL = 16;
  public static int PQSL_LIQ15_NUMERO_SUBIMP = 17;
  public static int PQSL_LIQ15_ANNO_SUBIMP = 18;
  public static int PQSL_LIQ15_LIQSEDDELSUB = 19;
  public static int PQSL_LIQ15_LIQNUMDELSUB = 20;
  public static int PQSL_LIQ15_LIQANNDELSUB = 21;
  public static int PQSL_LIQ15_LIQBOLLO = 22;
  public static int PQSL_LIQ15_VOCE_ECON = 23;
  public static int PQSL_LIQ15_CODICE_GESTIONALE = 24;
  public static int PQSL_LIQ15_LIQTIPOVINCO = 25;
  public static int PQSL_LIQ15_LIQSEDEDEL = 26;
  public static int PQSL_LIQ15_LIQNUMERODE = 27;
  public static int PQSL_LIQ15_LIQANNODEL = 28;
  public static int PQSL_LIQ15_UNITA_PROPONENTE = 29;
  public static int PQSL_LIQ15_NUMERO_PROPOSTA = 30;
  public static int PQSL_LIQ15_ANNO_PROPOSTA = 31;
  public static int PQSL_LIQ15_NUMERO_DISTINTA = 32;
  public static int PQSL_LIQ15_ANNO_DISTINTA = 33;
  public static int PQSL_LIQ15_FINANZIAMENTO = 34;
  public static int PQSL_LIQ15_LIQEMISS = 35;
  public static int PQSL_LIQ15_LIQUFFICIO = 36;
  public static int PQSL_LIQ15_LIQDIVERBENE = 37;
  public static int PQSL_LIQ15_LIQNUMERIMPE = 38;
  public static int PQSL_LIQ15_LIQANNOIMPEG = 39;
  public static int PQSL_LIQ15_ANNO_MAND = 40;
  public static int PQSL_LIQ15_LIQOLDINEMIS = 41;
  public static int PQSL_LIQ15_ANNO_PROG = 42;
  public static int PQSL_LIQ15_NUMERO_PROG = 43;
  public static int PQSL_LIQ15_PIANOCONTINT = 44;
  public static int PQSL_LIQ15_LIQCODICCOFO = 45;
  public static int PQSL_LIQ15_LIQCODICEURO = 46;
  public static int PQSL_LIQ15_LIQNUMERCONT = 47;
  public static int PQSL_LIQ15_LIQDATACONTA = 48;
  public static int PQSL_LIQ15_LIQQTNSCADEN = 49;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI300 = 3266;
  public static int PQRY_PARAMETRI300_RS = 3267;
  public static int PQSL_PARAMETRI300_ROWNAMDALIDA = 0;
  public static int PQSL_PARAMETRI300_ROWNAMDALIAL = 1;
  public static int PQSL_PARAMETRI300_ROWNAMNULIDA = 2;
  public static int PQSL_PARAMETRI300_ROWNAMNULIAL = 3;
  public static int PQSL_PARAMETRI300_ROWNAMSCADAL = 4;
  public static int PQSL_PARAMETRI300_ROWNAMESCAAL = 5;
  public static int PQSL_PARAMETRI300_ROWNAMTIPSCA = 6;
  public static int PQSL_PARAMETRI300_RONASOLINODF = 7;
  public static int PQSL_PARAMETRI300_RONASOGIINEM = 8;
  public static int PQSL_PARAMETRI300_ROWNAMEORDIN = 9;
  public static int PQSL_PARAMETRI300_ROWNAMEUFFIC = 10;
  public static int PQSL_PARAMETRI300_ROWNAMANNDIS = 11;
  public static int PQSL_PARAMETRI300_ROWNAMNUMDIS = 12;

  // Recordset for query: Finanziamenti
  //
  public static int QRY_FINANZIAME16 = 3268;
  public static int QSL_FINANZIAME16_FINFINANZIAM = 0;
  public static int QSL_FINANZIAME16_SOMMAIMPORTO = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI272 = 3269;
  public static int PQRY_PARAMETRI272_RS = 3270;
  public static int PQSL_PARAMETRI272_PARAMMANDDAL = 0;
  public static int PQSL_PARAMETRI272_PARAMMANDAAL = 1;
  public static int PQSL_PARAMETRI272_PARSOLSTDICO = 2;
  public static int PQSL_PARAMETRI272_PARATIPOSTAM = 3;
  public static int PQSL_PARAMETRI272_PARATIPOELAB = 4;
  public static int PQSL_PARAMETRI272_PARADATAAVVI = 5;
  public static int PQSL_PARAMETRI272_PARAMUFFICIO = 6;
  public static int PQSL_PARAMETRI272_PARACODIBENE = 7;
  public static int PQSL_PARAMETRI272_PARANUMEDIST = 8;
  public static int PQSL_PARAMETRI272_PARADATADIST = 9;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN1 = 3271;
  public static int PQSL_MAN1_GRUPPOBENEFI = 0;
  public static int PQSL_MAN1_RECMANANNMAN = 1;
  public static int PQSL_MAN1_RECMANNUMMAN = 2;
  public static int PQSL_MAN1_D_DATA_MAND = 3;
  public static int PQSL_MAN1_RECORBENCODI = 4;
  public static int PQSL_MAN1_REBERASOESES = 5;
  public static int PQSL_MAN1_INDIRIZZO = 6;
  public static int PQSL_MAN1_RECOCITTBENE = 7;
  public static int PQSL_MAN1_RECORDMANDAT = 8;
  public static int PQSL_MAN1_RECORDQUIETA = 9;
  public static int PQSL_MAN1_DESCRIZIONE = 10;
  public static int PQSL_MAN1_DES_BANCA = 11;
  public static int PQSL_MAN1_RECORDINTEST = 12;
  public static int PQSL_MAN1_INTESTATARIO_1 = 13;
  public static int PQSL_MAN1_INTESTATARIO_2 = 14;
  public static int PQSL_MAN1_INTESTATARIO_3 = 15;
  public static int PQSL_MAN1_RECORQTNQUIE = 16;
  public static int PQSL_MAN1_REBERASOESQU = 17;
  public static int PQSL_MAN1_RECBENCOFIQU = 18;
  public static int PQSL_MAN1_RECBEDDANAQU = 19;
  public static int PQSL_MAN1_RECCOMDENQUI = 20;
  public static int PQSL_MAN1_RECPROSIGQUI = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ25 = 3272;
  public static int PQSL_LIQ25_ANNO_MAND = 0;
  public static int PQSL_LIQ25_NUMERO_MAND = 1;
  public static int PQSL_LIQ25_ANNO_LIQ = 2;
  public static int PQSL_LIQ25_NUMERO_LIQ = 3;
  public static int PQSL_LIQ25_IMPORTO = 4;
  public static int PQSL_LIQ25_RITENUTE = 5;
  public static int PQSL_LIQ25_RECLIQIMPIVA = 6;
  public static int PQSL_LIQ25_DESCRIZIONE = 7;
  public static int PQSL_LIQ25_NUMERO_DOC = 8;
  public static int PQSL_LIQ25_CODICE_DOC = 9;
  public static int PQSL_LIQ25_D_DATA_DOC = 10;
  public static int PQSL_LIQ25_RECORDCAUSAL = 11;
  public static int PQSL_LIQ25_RECOCAUSBELL = 12;
  public static int PQSL_LIQ25_RECOCAUSFIRE = 13;
  public static int PQSL_LIQ25_RECOCAUSPESA = 14;
  public static int PQSL_LIQ25_RECORDNETTO = 15;
  public static int PQSL_LIQ25_FAT_ANNO_PROG = 16;
  public static int PQSL_LIQ25_FAT_NUMERO_PROG = 17;
  public static int PQSL_LIQ25_RECONUOVESPR = 18;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT6 = 3273;
  public static int PQSL_RETFAT6_RECORDRETTIF = 0;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN = 3274;
  public static int PQSL_MAN_GRUPPOBENEFI = 0;
  public static int PQSL_MAN_RECMANANNMAN = 1;
  public static int PQSL_MAN_RECMANNUMMAN = 2;
  public static int PQSL_MAN_D_DATA_MAND = 3;
  public static int PQSL_MAN_RECORBENCODI = 4;
  public static int PQSL_MAN_REBERASOESES = 5;
  public static int PQSL_MAN_INDIRIZZO = 6;
  public static int PQSL_MAN_RECOCITTBENE = 7;
  public static int PQSL_MAN_RECORDMANDAT = 8;
  public static int PQSL_MAN_RECORDQUIETA = 9;
  public static int PQSL_MAN_DESCRIZIONE = 10;
  public static int PQSL_MAN_DES_BANCA = 11;
  public static int PQSL_MAN_RECORDINTEST = 12;
  public static int PQSL_MAN_INTESTATARIO_1 = 13;
  public static int PQSL_MAN_INTESTATARIO_2 = 14;
  public static int PQSL_MAN_INTESTATARIO_3 = 15;
  public static int PQSL_MAN_RECORQTNQUIE = 16;
  public static int PQSL_MAN_REBERASOESQU = 17;
  public static int PQSL_MAN_RECBENCOFIQU = 18;
  public static int PQSL_MAN_RECBEDDANAQU = 19;
  public static int PQSL_MAN_RECCOMDENQUI = 20;
  public static int PQSL_MAN_RECPROSIGQUI = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ23 = 3275;
  public static int PQSL_LIQ23_ANNO_MAND = 0;
  public static int PQSL_LIQ23_NUMERO_MAND = 1;
  public static int PQSL_LIQ23_ANNO_LIQ = 2;
  public static int PQSL_LIQ23_NUMERO_LIQ = 3;
  public static int PQSL_LIQ23_IMPORTO = 4;
  public static int PQSL_LIQ23_RECORFATIMPO = 5;
  public static int PQSL_LIQ23_RITENUTE = 6;
  public static int PQSL_LIQ23_RECLIQIMPIVA = 7;
  public static int PQSL_LIQ23_DESCRIZIONE = 8;
  public static int PQSL_LIQ23_NUMERO_DOC = 9;
  public static int PQSL_LIQ23_CODICE_DOC = 10;
  public static int PQSL_LIQ23_D_DATA_DOC = 11;
  public static int PQSL_LIQ23_RECORDCAUSAL = 12;
  public static int PQSL_LIQ23_RECOCAUSBELL = 13;
  public static int PQSL_LIQ23_RECOCAUSFIRE = 14;
  public static int PQSL_LIQ23_RECOCAUSPESA = 15;
  public static int PQSL_LIQ23_RECORDNETTO = 16;
  public static int PQSL_LIQ23_FAT_ANNO_PROG = 17;
  public static int PQSL_LIQ23_FAT_NUMERO_PROG = 18;
  public static int PQSL_LIQ23_RECONUOVESPR = 19;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT4 = 3276;
  public static int PQSL_RETFAT4_RECORDRETTIF = 0;
  public static int PQSL_RETFAT4_RECORETFIMPO = 1;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ24 = 3277;
  public static int PQSL_LIQ24_CODICE = 0;
  public static int PQSL_LIQ24_REBERASOESES = 1;
  public static int PQSL_LIQ24_INDIRIZZO = 2;
  public static int PQSL_LIQ24_RECOCITTBENE = 3;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN12 = 3278;
  public static int PQSL_MAN12_GRUPPOBENEFI = 0;
  public static int PQSL_MAN12_RECMANANNMAN = 1;
  public static int PQSL_MAN12_RECMANNUMMAN = 2;
  public static int PQSL_MAN12_D_DATA_MAND = 3;
  public static int PQSL_MAN12_RECORBENCODI = 4;
  public static int PQSL_MAN12_REBERASOESES = 5;
  public static int PQSL_MAN12_INDIRIZZO = 6;
  public static int PQSL_MAN12_RECOCITTBENE = 7;
  public static int PQSL_MAN12_RECORDMANDAT = 8;
  public static int PQSL_MAN12_RECORDQUIETA = 9;
  public static int PQSL_MAN12_DESCRIZIONE = 10;
  public static int PQSL_MAN12_DES_BANCA = 11;
  public static int PQSL_MAN12_RECORDINTEST = 12;
  public static int PQSL_MAN12_INTESTATARIO_1 = 13;
  public static int PQSL_MAN12_INTESTATARIO_2 = 14;
  public static int PQSL_MAN12_INTESTATARIO_3 = 15;
  public static int PQSL_MAN12_RECORQTNQUIE = 16;
  public static int PQSL_MAN12_REBERASOESQU = 17;
  public static int PQSL_MAN12_RECBENCOFIQU = 18;
  public static int PQSL_MAN12_RECBEDDANAQU = 19;
  public static int PQSL_MAN12_RECCOMDENQUI = 20;
  public static int PQSL_MAN12_RECPROSIGQUI = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ60 = 3279;
  public static int PQSL_LIQ60_ANNO_MAND = 0;
  public static int PQSL_LIQ60_NUMERO_MAND = 1;
  public static int PQSL_LIQ60_ANNO_LIQ = 2;
  public static int PQSL_LIQ60_NUMERO_LIQ = 3;
  public static int PQSL_LIQ60_IMPORTO = 4;
  public static int PQSL_LIQ60_RITENUTE = 5;
  public static int PQSL_LIQ60_RECLIQIMPIVA = 6;
  public static int PQSL_LIQ60_DESCRIZIONE = 7;
  public static int PQSL_LIQ60_NUMERO_DOC = 8;
  public static int PQSL_LIQ60_CODICE_DOC = 9;
  public static int PQSL_LIQ60_D_DATA_DOC = 10;
  public static int PQSL_LIQ60_RECORDCAUSAL = 11;
  public static int PQSL_LIQ60_RECOCAUSBELL = 12;
  public static int PQSL_LIQ60_RECOCAUSFIRE = 13;
  public static int PQSL_LIQ60_RECOCAUSPESA = 14;
  public static int PQSL_LIQ60_RECORDNETTO = 15;
  public static int PQSL_LIQ60_FAT_ANNO_PROG = 16;
  public static int PQSL_LIQ60_FAT_NUMERO_PROG = 17;
  public static int PQSL_LIQ60_RECONUOVESPR = 18;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT7 = 3280;
  public static int PQSL_RETFAT7_RECORDRETTIF = 0;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM30 = 3281;
  public static int PQRY_PARAMESTAM30_RS = 3282;
  public static int PQSL_PARAMESTAM30_STAMPAFIRMA2 = 0;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN9 = 3283;
  public static int PQSL_MAN9_GRUPPOBENEFI = 0;
  public static int PQSL_MAN9_RECMANANNMAN = 1;
  public static int PQSL_MAN9_RECMANNUMMAN = 2;
  public static int PQSL_MAN9_D_DATA_MAND = 3;
  public static int PQSL_MAN9_RECORBENCODI = 4;
  public static int PQSL_MAN9_REBERASOESES = 5;
  public static int PQSL_MAN9_INDIRIZZO = 6;
  public static int PQSL_MAN9_RECOCITTBENE = 7;
  public static int PQSL_MAN9_RECORDMANDAT = 8;
  public static int PQSL_MAN9_RECORDQUIETA = 9;
  public static int PQSL_MAN9_DESCRIZIONE = 10;
  public static int PQSL_MAN9_DES_BANCA = 11;
  public static int PQSL_MAN9_RECORDINTEST = 12;
  public static int PQSL_MAN9_INTESTATARIO_1 = 13;
  public static int PQSL_MAN9_INTESTATARIO_2 = 14;
  public static int PQSL_MAN9_INTESTATARIO_3 = 15;
  public static int PQSL_MAN9_RECORQTNQUIE = 16;
  public static int PQSL_MAN9_REBERASOESQU = 17;
  public static int PQSL_MAN9_RECBENCOFIQU = 18;
  public static int PQSL_MAN9_RECBEDDANAQU = 19;
  public static int PQSL_MAN9_RECCOMDENQUI = 20;
  public static int PQSL_MAN9_RECPROSIGQUI = 21;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ54 = 3284;
  public static int PQSL_LIQ54_ANNO_MAND = 0;
  public static int PQSL_LIQ54_NUMERO_MAND = 1;
  public static int PQSL_LIQ54_ANNO_LIQ = 2;
  public static int PQSL_LIQ54_NUMERO_LIQ = 3;
  public static int PQSL_LIQ54_IMPORTO = 4;
  public static int PQSL_LIQ54_RECORFATIMPO = 5;
  public static int PQSL_LIQ54_RITENUTE = 6;
  public static int PQSL_LIQ54_RECLIQIMPIVA = 7;
  public static int PQSL_LIQ54_DESCRIZIONE = 8;
  public static int PQSL_LIQ54_NUMERO_DOC = 9;
  public static int PQSL_LIQ54_CODICE_DOC = 10;
  public static int PQSL_LIQ54_D_DATA_DOC = 11;
  public static int PQSL_LIQ54_RECORDCAUSAL = 12;
  public static int PQSL_LIQ54_RECOCAUSBELL = 13;
  public static int PQSL_LIQ54_RECOCAUSFIRE = 14;
  public static int PQSL_LIQ54_RECOCAUSPESA = 15;
  public static int PQSL_LIQ54_RECORDNETTO = 16;
  public static int PQSL_LIQ54_FAT_ANNO_PROG = 17;
  public static int PQSL_LIQ54_FAT_NUMERO_PROG = 18;
  public static int PQSL_LIQ54_RECONUOVESPR = 19;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT5 = 3285;
  public static int PQSL_RETFAT5_RECORDRETTIF = 0;
  public static int PQSL_RETFAT5_RECORETFIMPO = 1;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM22 = 3286;
  public static int PQRY_PARAMESTAM22_RS = 3287;
  public static int PQSL_PARAMESTAM22_STAMPAFIRMA2 = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI194 = 3288;
  public static int PQRY_PARAMETRI194_RS = 3289;
  public static int PQSL_PARAMETRI194_PARANUMMANDA = 0;
  public static int PQSL_PARAMETRI194_PARANUMEMANA = 1;
  public static int PQSL_PARAMETRI194_PARDATMANDAL = 2;
  public static int PQSL_PARAMETRI194_PARADATMANAL = 3;
  public static int PQSL_PARAMETRI194_PARDATPAGDAL = 4;
  public static int PQSL_PARAMETRI194_PARADATPAGAL = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI160 = 3290;
  public static int PQRY_PARAMETRI160_RS = 3291;
  public static int PQSL_PARAMETRI160_PARNUMMANDAL = 0;
  public static int PQSL_PARAMETRI160_PARANUMMANAL = 1;
  public static int PQSL_PARAMETRI160_PARAMEMESSAL = 2;
  public static int PQSL_PARAMETRI160_PARADATAPAGA = 3;
  public static int PQSL_PARAMETRI160_PARANUMEPAGA = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI147 = 3292;
  public static int PQRY_PARAMETRI147_RS = 3293;
  public static int PQSL_PARAMETRI147_PARNUMMANDAL = 0;
  public static int PQSL_PARAMETRI147_PARANUMMANAL = 1;
  public static int PQSL_PARAMETRI147_PARANUMEIMPE = 2;
  public static int PQSL_PARAMETRI147_PARAANNOIMPE = 3;

}
