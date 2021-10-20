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
public class IMDBDef5 extends Object
{
	// IMDB Constants
  // Definition of table: Pars
  //
  public static int TBL_PARS65 = 801;
  public static int FLD_PARS65_NOMEOGGEDELI = 0;
  public static int FLD_PARS65_NOMOGGNUMDEL = 1;
  public static int FLD_PARS65_NOMOGGANNDEL = 2;
  public static int FLD_PARS65_NOMOGGANNESI = 3;
  public static int FLD_PARS65_NOMEOGGPROUO = 4;

  // Definition of table: Variazioni Accertamenti
  //
  public static int TBL_VARIAZACCERT = 802;
  public static int FLD_VARIAZACCERT_CODICE_STRUTTURA = 0;
  public static int FLD_VARIAZACCERT_NOMOGGCOPICO = 1;
  public static int FLD_VARIAZACCERT_CAPITOLO = 2;
  public static int FLD_VARIAZACCERT_ARTICOLO = 3;
  public static int FLD_VARIAZACCERT_NUMERO_IMP = 4;
  public static int FLD_VARIAZACCERT_ANNO_IMP = 5;
  public static int FLD_VARIAZACCERT_DESCRIZIONE = 6;
  public static int FLD_VARIAZACCERT_IMPORTO = 7;
  public static int FLD_VARIAZACCERT_ANNO_ESIGIBILITA = 8;
  public static int FLD_VARIAZACCERT_PROGRESSIVO = 9;
  public static int FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA = 10;
  public static int FLD_VARIAZACCERT_NOMOGGTIPVAR = 11;
  public static int FLD_VARIAZACCERT_SEDE_DEL = 12;
  public static int FLD_VARIAZACCERT_NUMERO_DEL = 13;
  public static int FLD_VARIAZACCERT_ANNO_DEL = 14;

  // Definition of table: Par
  //
  public static int TBL_PAR120 = 803;
  public static int FLD_PAR120_NOMEOGGEDELI = 0;
  public static int FLD_PAR120_NOMEOGGDAELA = 1;

  // Definition of table: Pars
  //
  public static int TBL_PARS85 = 804;
  public static int FLD_PARS85_NOMEOGGETTES = 0;
  public static int FLD_PARS85_CODICE = 1;
  public static int FLD_PARS85_NOMOGGESERIF = 2;
  public static int FLD_PARS85_NOMEOGGEMISS = 3;
  public static int FLD_PARS85_NOMEOGGEPROG = 4;
  public static int FLD_PARS85_NOMEOGGETITO = 5;
  public static int FLD_PARS85_NOMEOGGETTUO = 6;
  public static int FLD_PARS85_NOMEOGGECAPI = 7;
  public static int FLD_PARS85_NOMEOGGEARTI = 8;
  public static int FLD_PARS85_NOMOGGTIPDIS = 9;
  public static int FLD_PARS85_NOMOGGDIDAGE = 10;
  public static int FLD_PARS85_NOMEOGGEQUAL = 11;
  public static int FLD_PARS85_NOOGTICADIFI = 12;

  // Definition of table: Tipo Var
  //
  public static int TBL_TIPOVAR = 805;
  public static int FLD_TIPOVAR_NOMOGGTIPVAR = 0;
  public static int FLD_TIPOVAR_NOMEOGGETTES = 1;
  public static int FLD_TIPOVAR_NOMOGGTIVAES = 2;
  public static int FLD_TIPOVAR_NOMOGGVAESDI = 3;
  public static int FLD_TIPOVAR_NOMOGGMOSLAB = 4;
  public static int FLD_TIPOVAR_NOMOGGTIPAVA = 5;

  // Definition of table: Parametrieleprm
  //
  public static int TBL_PARAMETRIEL3 = 806;
  public static int FLD_PARAMETRIEL3_NOMOGIMSUOAC = 0;
  public static int FLD_PARAMETRIEL3_CODICE = 1;
  public static int FLD_PARAMETRIEL3_NOMOGGESERIF = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI550 = 807;
  public static int FLD_PARAMETRI550_NOMEOGGETTES = 0;
  public static int FLD_PARAMETRI550_NOMEOGGEPERI = 1;
  public static int FLD_PARAMETRI550_NOMEOGGEESER = 2;
  public static int FLD_PARAMETRI550_NOMEOGGEPROG = 3;
  public static int FLD_PARAMETRI550_DESCRIZIONE = 4;
  public static int FLD_PARAMETRI550_NOMOGGDEDANO = 5;
  public static int FLD_PARAMETRI550_ANNO_DEL = 6;
  public static int FLD_PARAMETRI550_NUMERO_DEL = 7;
  public static int FLD_PARAMETRI550_SEDE_DEL = 8;
  public static int FLD_PARAMETRI550_ANNO_PROPOSTA = 9;
  public static int FLD_PARAMETRI550_UNITA_PROPONENTE = 10;
  public static int FLD_PARAMETRI550_NUMERO_PROPOSTA = 11;
  public static int FLD_PARAMETRI550_NOMOGGDATVAR = 12;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI561 = 808;
  public static int FLD_PARAMETRI561_NOMEOGGETTES = 0;
  public static int FLD_PARAMETRI561_NOMEOGGEPERI = 1;
  public static int FLD_PARAMETRI561_NOMEOGGEESER = 2;
  public static int FLD_PARAMETRI561_NOMEOGGEPROG = 3;

  // Definition of table: P
  //
  public static int TBL_P = 809;
  public static int FLD_P_NOMOGGELPRES = 0;

  // Definition of table: Parametrieleprm
  //
  public static int TBL_PARAMETRIEL5 = 810;
  public static int FLD_PARAMETRIEL5_CODICE = 0;
  public static int FLD_PARAMETRIEL5_NOMOGGESERIF = 1;
  public static int FLD_PARAMETRIEL5_NOMOGGUNIORG = 2;
  public static int FLD_PARAMETRIEL5_NOMOGGTIPDIS = 3;
  public static int FLD_PARAMETRIEL5_NOMOGGDIDAGE = 4;
  public static int FLD_PARAMETRIEL5_NOMEOGGDATAL = 5;
  public static int FLD_PARAMETRIEL5_NOMEOGGENOTE = 6;
  public static int FLD_PARAMETRIEL5_NOMEOGGEPART = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI1 = 811;
  public static int FLD_PARAMETRI1_ROWNAMDATDAL = 0;
  public static int FLD_PARAMETRI1_ROWNAMDADAOL = 1;
  public static int FLD_PARAMETRI1_ROWNAMEDATAL = 2;
  public static int FLD_PARAMETRI1_ROWNAMDAALOL = 3;
  public static int FLD_PARAMETRI1_ROWNAMEANNO = 4;
  public static int FLD_PARAMETRI1_ROWNAMNUMDAL = 5;
  public static int FLD_PARAMETRI1_ROWNAMNUDAOL = 6;
  public static int FLD_PARAMETRI1_ROWNAMENUMAL = 7;
  public static int FLD_PARAMETRI1_ROWNAMNUALOL = 8;
  public static int FLD_PARAMETRI1_ROWNAMNUMIMP = 9;
  public static int FLD_PARAMETRI1_ROWNAMNUIMOL = 10;
  public static int FLD_PARAMETRI1_ROWNAMANNIMP = 11;
  public static int FLD_PARAMETRI1_ROWNAMANIMOL = 12;
  public static int FLD_PARAMETRI1_ROWNAMNUSUIM = 13;
  public static int FLD_PARAMETRI1_RONANUSUIMOL = 14;
  public static int FLD_PARAMETRI1_ROWNAMANSUIM = 15;
  public static int FLD_PARAMETRI1_RONAANSUIMOL = 16;
  public static int FLD_PARAMETRI1_ROWNAMECAPIT = 17;
  public static int FLD_PARAMETRI1_ROWNAMEARTIC = 18;
  public static int FLD_PARAMETRI1_ROWNAMPRUNOR = 19;
  public static int FLD_PARAMETRI1_ROWNAMANNVAR = 20;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI157 = 812;
  public static int FLD_PARAMETRI157_PARANNOVARIA = 0;
  public static int FLD_PARAMETRI157_PARCHIUORDCF = 1;

  // Definition of table: Parametrieleprm
  //
  public static int TBL_PARAMETRIELE = 813;
  public static int FLD_PARAMETRIELE_CODICE = 0;
  public static int FLD_PARAMETRIELE_NOMOGGESERIF = 1;
  public static int FLD_PARAMETRIELE_NOMOGGUNIORG = 2;
  public static int FLD_PARAMETRIELE_NOMOGGTIPDIS = 3;
  public static int FLD_PARAMETRIELE_NOMOGGDIDAGE = 4;
  public static int FLD_PARAMETRIELE_NOMEOGGDATAL = 5;
  public static int FLD_PARAMETRIELE_NOMEOGGEPART = 6;
  public static int FLD_PARAMETRIELE_NOMOGGIMPRAG = 7;
  public static int FLD_PARAMETRIELE_NOMEOGGEORDI = 8;
  public static int FLD_PARAMETRIELE_NOMOGGDETSUB = 9;
  public static int FLD_PARAMETRIELE_NOOGTICADIFI = 10;

  // Definition of table: Pars
  //
  public static int TBL_PARS32 = 814;
  public static int FLD_PARS32_NOMEOGGETTES = 0;
  public static int FLD_PARS32_CODICE = 1;
  public static int FLD_PARS32_NOMOGGESERIF = 2;
  public static int FLD_PARS32_NOMEOGGETTUO = 3;
  public static int FLD_PARS32_NOMOGGTIPDIS = 4;
  public static int FLD_PARS32_NOMOGGDIDAGE = 5;
  public static int FLD_PARS32_NOOGANIMSUSP = 6;
  public static int FLD_PARS32_NOOGTICADIFI = 7;

  // Definition of table: Parametri Differenze
  //
  public static int TBL_PARAMEDIFFER = 815;
  public static int FLD_PARAMEDIFFER_NOMOGGTIPCON = 0;
  public static int FLD_PARAMEDIFFER_NOMEOGGEESER = 1;
  public static int FLD_PARAMEDIFFER_NOMOGGPERRIA = 2;

  // Definition of table: Parametri Filtro
  //
  public static int TBL_PARAMEFILTR3 = 816;
  public static int FLD_PARAMEFILTR3_NOMOGGTIPCON = 0;
  public static int FLD_PARAMEFILTR3_NOMEOGGEESER = 1;
  public static int FLD_PARAMEFILTR3_NOMOGGPERRIA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI316 = 817;
  public static int FLD_PARAMETRI316_PARAMNUMEDAL = 0;
  public static int FLD_PARAMETRI316_PARAMNUMERAL = 1;
  public static int FLD_PARAMETRI316_PARAMDATADAL = 2;
  public static int FLD_PARAMETRI316_PARAMDATAAL = 3;
  public static int FLD_PARAMETRI316_PARAMORDINAM = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI136 = 818;
  public static int FLD_PARAMETRI136_PARAMANNOLIQ = 0;
  public static int FLD_PARAMETRI136_PARAMNUMELIQ = 1;
  public static int FLD_PARAMETRI136_PARAMTITOLO = 2;
  public static int FLD_PARAMETRI136_PARAMCODINTE = 3;
  public static int FLD_PARAMETRI136_PARAMCODTERZ = 4;
  public static int FLD_PARAMETRI136_PARAMCATEGOR = 5;
  public static int FLD_PARAMETRI136_PARLOODIVBEN = 6;
  public static int FLD_PARAMETRI136_PARLOODIGTES = 7;
  public static int FLD_PARAMETRI136_PARLOOQUDIBE = 8;
  public static int FLD_PARAMETRI136_PARAMINEMISS = 9;
  public static int FLD_PARAMETRI136_PARAINEMIORI = 10;
  public static int FLD_PARAMETRI136_PARAMANNOIMP = 11;
  public static int FLD_PARAMETRI136_PARAMNUMEIMP = 12;
  public static int FLD_PARAMETRI136_PARANNSUBIMP = 13;
  public static int FLD_PARAMETRI136_PARNUMSUBIMP = 14;
  public static int FLD_PARAMETRI136_PARAMCAPITOL = 15;
  public static int FLD_PARAMETRI136_PARAMARTICOL = 16;
  public static int FLD_PARAMETRI136_PARAPRODAESP = 17;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL7 = 819;
  public static int FLD_PARAMETRIOL7_PARANNIMPOLD = 0;
  public static int FLD_PARAMETRIOL7_PARNUMIMPOLD = 1;
  public static int FLD_PARAMETRIOL7_PARANNSUIMOL = 2;
  public static int FLD_PARAMETRIOL7_PARNUMSUIMOL = 3;
  public static int FLD_PARAMETRIOL7_PARCODBENOLD = 4;
  public static int FLD_PARAMETRIOL7_PARANNDOCOLD = 5;
  public static int FLD_PARAMETRIOL7_PARNUMDOCOLD = 6;
  public static int FLD_PARAMETRIOL7_PARAMQUIEOLD = 7;
  public static int FLD_PARAMETRIOL7_PARAMBOLLOLD = 8;
  public static int FLD_PARAMETRIOL7_PARAMIMPOOLD = 9;
  public static int FLD_PARAMETRIOL7_PARCODDIBEOL = 10;
  public static int FLD_PARAMETRIOL7_PARVOCECOOLD = 11;
  public static int FLD_PARAMETRIOL7_PARAMSPESOLD = 12;
  public static int FLD_PARAMETRIOL7_PARAMCASSOLD = 13;
  public static int FLD_PARAMETRIOL7_PARIMPINPOLD = 14;
  public static int FLD_PARAMETRIOL7_PARRITINPOLD = 15;
  public static int FLD_PARAMETRIOL7_PARCODINAOLD = 16;
  public static int FLD_PARAMETRIOL7_PARIMPINAOLD = 17;
  public static int FLD_PARAMETRIOL7_PARRITINAOLD = 18;
  public static int FLD_PARAMETRIOL7_PARCODIRAOLD = 19;
  public static int FLD_PARAMETRIOL7_PARIMPSSNOLD = 20;
  public static int FLD_PARAMETRIOL7_PARIMPFISOLD = 21;
  public static int FLD_PARAMETRIOL7_PARAMALIQOLD = 22;
  public static int FLD_PARAMETRIOL7_PARALIADDOLD = 23;
  public static int FLD_PARAMETRIOL7_PARALIADCOOL = 24;
  public static int FLD_PARAMETRIOL7_PARRITIRPOLD = 25;
  public static int FLD_PARAMETRIOL7_PARRITADDOLD = 26;
  public static int FLD_PARAMETRIOL7_PARRITADCOOL = 27;
  public static int FLD_PARAMETRIOL7_PARAMCOFOOLD = 28;
  public static int FLD_PARAMETRIOL7_PARCODEUROLD = 29;
  public static int FLD_PARAMETRIOL7_PARALIVE5OLD = 30;

  // Definition of table: Liq Rollback
  //
  public static int TBL_LIQROLLBACK1 = 820;
  public static int FLD_LIQROLLBACK1_CAPITOLO = 0;
  public static int FLD_LIQROLLBACK1_ARTICOLO = 1;
  public static int FLD_LIQROLLBACK1_ANNO_LIQ = 2;
  public static int FLD_LIQROLLBACK1_NUMERO_LIQ = 3;
  public static int FLD_LIQROLLBACK1_ANNO_IMP = 4;
  public static int FLD_LIQROLLBACK1_NUMERO_IMP = 5;
  public static int FLD_LIQROLLBACK1_ANNO_SUBIMP = 6;
  public static int FLD_LIQROLLBACK1_NUMERO_SUBIMP = 7;
  public static int FLD_LIQROLLBACK1_ANNO_DEL = 8;
  public static int FLD_LIQROLLBACK1_NUMERO_DEL = 9;
  public static int FLD_LIQROLLBACK1_SEDE_DEL = 10;
  public static int FLD_LIQROLLBACK1_DATA_REG = 11;
  public static int FLD_LIQROLLBACK1_IMPORTO = 12;
  public static int FLD_LIQROLLBACK1_RITENUTE = 13;
  public static int FLD_LIQROLLBACK1_DESCRIZIONE = 14;
  public static int FLD_LIQROLLBACK1_DIVERSO_BEN = 15;
  public static int FLD_LIQROLLBACK1_BENEFICIARIO = 16;
  public static int FLD_LIQROLLBACK1_ANNO_DOC = 17;
  public static int FLD_LIQROLLBACK1_NUMERO_DOC = 18;
  public static int FLD_LIQROLLBACK1_NUM_QUIETANZA = 19;
  public static int FLD_LIQROLLBACK1_CAUSALE = 20;
  public static int FLD_LIQROLLBACK1_BOLLO = 21;
  public static int FLD_LIQROLLBACK1_ANNO_MAND = 22;
  public static int FLD_LIQROLLBACK1_NUMERO_MAND = 23;
  public static int FLD_LIQROLLBACK1_DATA_PAGAM = 24;
  public static int FLD_LIQROLLBACK1_IMPORTO_PAGAM = 25;
  public static int FLD_LIQROLLBACK1_CODICE = 26;
  public static int FLD_LIQROLLBACK1_CAUSALE_IRPEF = 27;
  public static int FLD_LIQROLLBACK1_IMPONIBILE = 28;
  public static int FLD_LIQROLLBACK1_ALIQUOTA = 29;
  public static int FLD_LIQROLLBACK1_TIPO_VINCOLO = 30;
  public static int FLD_LIQROLLBACK1_RITENUTE_IRPEF = 31;
  public static int FLD_LIQROLLBACK1_IMPORTO_NON_SOG = 32;
  public static int FLD_LIQROLLBACK1_NUMERO_PAGAM = 33;
  public static int FLD_LIQROLLBACK1_NUM_QUIETANZA_DIV_BEN = 34;
  public static int FLD_LIQROLLBACK1_UFFICIO = 35;
  public static int FLD_LIQROLLBACK1_ANNO_PROPOSTA = 36;
  public static int FLD_LIQROLLBACK1_UNITA_PROPONENTE = 37;
  public static int FLD_LIQROLLBACK1_NUMERO_PROPOSTA = 38;
  public static int FLD_LIQROLLBACK1_CODICE_SSN = 39;
  public static int FLD_LIQROLLBACK1_ALIQ_SSN_CD = 40;
  public static int FLD_LIQROLLBACK1_ALIQ_SSN_CE = 41;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_SSN = 42;
  public static int FLD_LIQROLLBACK1_RITENUTE_SSN = 43;
  public static int FLD_LIQROLLBACK1_RITENUTE_SSN_CE = 44;
  public static int FLD_LIQROLLBACK1_CASSA = 45;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_INPS = 46;
  public static int FLD_LIQROLLBACK1_ALIQUOTA_INPS = 47;
  public static int FLD_LIQROLLBACK1_RITENUTE_INPS = 48;
  public static int FLD_LIQROLLBACK1_RITENUTE_INPS_CE = 49;
  public static int FLD_LIQROLLBACK1_VOCE_ECON = 50;
  public static int FLD_LIQROLLBACK1_CODICE_PTC = 51;
  public static int FLD_LIQROLLBACK1_FAT_ANNO_PROG = 52;
  public static int FLD_LIQROLLBACK1_FAT_NUMERO_PROG = 53;
  public static int FLD_LIQROLLBACK1_D_DATA_REG = 54;
  public static int FLD_LIQROLLBACK1_S = 55;
  public static int FLD_LIQROLLBACK1_D_DATA_PAGAM = 56;
  public static int FLD_LIQROLLBACK1_NUMERO_CONTABILE = 57;
  public static int FLD_LIQROLLBACK1_DATA_CONTABILE = 58;
  public static int FLD_LIQROLLBACK1_PROGRESSIVO_TESO = 59;
  public static int FLD_LIQROLLBACK1_ANNO_DISTINTA = 60;
  public static int FLD_LIQROLLBACK1_NUMERO_DISTINTA = 61;
  public static int FLD_LIQROLLBACK1_ALIQUOTA_ADD = 62;
  public static int FLD_LIQROLLBACK1_RITENUTE_ADD = 63;
  public static int FLD_LIQROLLBACK1_LIRE_EURO = 64;
  public static int FLD_LIQROLLBACK1_PAGAMENTO_IN_EURO = 65;
  public static int FLD_LIQROLLBACK1_IMPORTO_EURO = 66;
  public static int FLD_LIQROLLBACK1_RITENUTE_EURO = 67;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_EURO = 68;
  public static int FLD_LIQROLLBACK1_IMPORTO_NON_SOG_EURO = 69;
  public static int FLD_LIQROLLBACK1_RITENUTE_IRPEF_EURO = 70;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_SSN_EURO = 71;
  public static int FLD_LIQROLLBACK1_RITENUTE_SSN_EURO = 72;
  public static int FLD_LIQROLLBACK1_RITENUTE_SSN_CE_EURO = 73;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_INPS_EURO = 74;
  public static int FLD_LIQROLLBACK1_RITENUTE_INPS_EURO = 75;
  public static int FLD_LIQROLLBACK1_RITENUTE_INPS_CE_EURO = 76;
  public static int FLD_LIQROLLBACK1_RITENUTE_ADD_EURO = 77;
  public static int FLD_LIQROLLBACK1_RITENUTE_CASSE_PROF = 78;
  public static int FLD_LIQROLLBACK1_RITENUTE_CASSE_PROF_EURO = 79;
  public static int FLD_LIQROLLBACK1_ALIQUOTA_ADD_COM = 80;
  public static int FLD_LIQROLLBACK1_RITENUTE_ADD_COM_EURO = 81;
  public static int FLD_LIQROLLBACK1_RITENUTE_ADD_COM = 82;
  public static int FLD_LIQROLLBACK1_COD_IMP_ECO = 83;
  public static int FLD_LIQROLLBACK1_CODICE_INAIL = 84;
  public static int FLD_LIQROLLBACK1_ALIQUOTA_INAIL = 85;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_INAIL = 86;
  public static int FLD_LIQROLLBACK1_RITENUTE_INAIL = 87;
  public static int FLD_LIQROLLBACK1_RITENUTE_INAIL_CE = 88;
  public static int FLD_LIQROLLBACK1_IMPONIBILE_INAIL_EURO = 89;
  public static int FLD_LIQROLLBACK1_RITENUTE_INAIL_EURO = 90;
  public static int FLD_LIQROLLBACK1_RITENUTE_INAIL_CE_EURO = 91;
  public static int FLD_LIQROLLBACK1_TIPO_DISTINTA = 92;
  public static int FLD_LIQROLLBACK1_FINANZIAMENTO = 93;
  public static int FLD_LIQROLLBACK1_SPESE = 94;
  public static int FLD_LIQROLLBACK1_SCADENZA = 95;
  public static int FLD_LIQROLLBACK1_ALLEGATI = 96;
  public static int FLD_LIQROLLBACK1_COMMISSIONI = 97;
  public static int FLD_LIQROLLBACK1_INFO_TESORIERE = 98;
  public static int FLD_LIQROLLBACK1_CODICE_GESTIONALE = 99;
  public static int FLD_LIQROLLBACK1_NOTE = 100;
  public static int FLD_LIQROLLBACK1_UTENTE_INSERIMENTO = 101;
  public static int FLD_LIQROLLBACK1_DATA_INSERIMENTO = 102;
  public static int FLD_LIQROLLBACK1_UTENTE_ULTIMO_AGG = 103;
  public static int FLD_LIQROLLBACK1_DATA_ULTIMO_AGG = 104;
  public static int FLD_LIQROLLBACK1_LIQROLRASOBE = 105;
  public static int FLD_LIQROLLBACK1_LIRORASODIBE = 106;
  public static int FLD_LIQROLLBACK1_LIQROLLBCOFO = 107;
  public static int FLD_LIQROLLBACK1_LIQROLCODEUR = 108;
  public static int FLD_LIQROLLBACK1_LIQROLLLIVE5 = 109;
  public static int FLD_LIQROLLBACK1_CIG = 110;
  public static int FLD_LIQROLLBACK1_CUP = 111;
  public static int FLD_LIQROLLBACK1_LIQROLLINEMI = 112;
  public static int FLD_LIQROLLBACK1_IMPORTO_IVA = 113;
  public static int FLD_LIQROLLBACK1_LIQROLIMIVIS = 114;
  public static int FLD_LIQROLLBACK1_LIQROLTIREDE = 115;
  public static int FLD_LIQROLLBACK1_LIQROLTIBODE = 116;
  public static int FLD_LIQROLLBACK1_MOTIVO_ESCLUSIONE_CIG = 117;
  public static int FLD_LIQROLLBACK1_TIPO_DEBITO_SIOPE = 118;
  public static int FLD_LIQROLLBACK1_NUMERO_AVVISO_PAGOPA = 119;
  public static int FLD_LIQROLLBACK1_ESERCIZIO_PROVV = 120;
  public static int FLD_LIQROLLBACK1_PROGRESSIVO_PROVV = 121;
  public static int FLD_LIQROLLBACK1_PROGRESSIVO_PROV_DETT = 122;

  // Definition of table: Diverso Beneficiario
  //
  public static int TBL_DIVERSBENEF2 = 821;
  public static int FLD_DIVERSBENEF2_DIVBENCODICE = 0;
  public static int FLD_DIVERSBENEF2_DIVDIVERSBEN = 1;
  public static int FLD_DIVERSBENEF2_DIVDIVBENOLD = 2;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIAR27 = 822;
  public static int FLD_BENEFICIAR27_BENCODICE = 0;
  public static int FLD_BENEFICIAR27_BENBENEFICIA = 1;
  public static int FLD_BENEFICIAR27_BENBENEFIOLD = 2;

  // Definition of table: IMP ECO
  //
  public static int TBL_IMPECO = 823;
  public static int FLD_IMPECO_ESERCIZIO = 0;
  public static int FLD_IMPECO_PROGRESSIVO = 1;
  public static int FLD_IMPECO_ANNO_PROG = 2;
  public static int FLD_IMPECO_NUMERO_PROG = 3;
  public static int FLD_IMPECO_ANNO_LIQ = 4;
  public static int FLD_IMPECO_NUMERO_LIQ = 5;
  public static int FLD_IMPECO_ANNO_PRE = 6;
  public static int FLD_IMPECO_NUMERO_PRE = 7;
  public static int FLD_IMPECO_FATTORE = 8;
  public static int FLD_IMPECO_CENTRO = 9;
  public static int FLD_IMPECO_IMPORTO = 10;
  public static int FLD_IMPECO_COMPETENZA_DAL = 11;
  public static int FLD_IMPECO_COMPETENZA_AL = 12;
  public static int FLD_IMPECO_NOTE = 13;
  public static int FLD_IMPECO_IMPORTO_EURO = 14;
  public static int FLD_IMPECO_ANNO_ACC = 15;
  public static int FLD_IMPECO_NUMERO_ACC = 16;
  public static int FLD_IMPECO_ANNO_IMP = 17;
  public static int FLD_IMPECO_NUMERO_IMP = 18;
  public static int FLD_IMPECO_ANNO_SUBIMP = 19;
  public static int FLD_IMPECO_NUMERO_SUBIMP = 20;
  public static int FLD_IMPECO_PROGRESSIVO_VARACC = 21;
  public static int FLD_IMPECO_PROGRESSIVO_VARIMP = 22;
  public static int FLD_IMPECO_PROGRESSIVO_VARSUB = 23;
  public static int FLD_IMPECO_NO_IVA = 24;
  public static int FLD_IMPECO_PROGETTO_ID = 25;
  public static int FLD_IMPECO_IVA = 26;
  public static int FLD_IMPECO_IMPECOSTATO = 27;
  public static int FLD_IMPECO_CAMPO_LIBERO_1 = 28;
  public static int FLD_IMPECO_CAMPO_LIBERO_2 = 29;
  public static int FLD_IMPECO_PROGR_SCHEDA_CIWEB = 30;

  // Definition of table: Imdb Schede Inventario Liq
  //
  public static int TBL_SCHEDE_INVENTARIO_LIQ = 824;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_PROGRESSIVO = 0;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_ANNO_LIQ = 1;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_NUMERO_LIQ = 2;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_ANNO_PROG_FAT = 3;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_NUMERO_PROG_FAT = 4;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_IMPORTO = 5;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_PROGR_SCHEDA_CIWEB = 6;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_PROGRESSIVO_BOAC = 7;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_NOTE = 8;
  public static int FLD_SCHEDE_INVENTARIO_LIQ_SCHINVLIQSTA = 9;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP7 = 825;
  public static int FLD_VALORICAP7_NOMOGGLIV4CA = 0;

  // Definition of table: Valori Comuni Liq
  //
  public static int TBL_VALORCOMULIQ = 826;
  public static int FLD_VALORCOMULIQ_VALCOMCKDIBE = 0;
  public static int FLD_VALORCOMULIQ_VALCOMCODIBE = 1;
  public static int FLD_VALORCOMULIQ_VACONUQTDIBE = 2;
  public static int FLD_VALORCOMULIQ_VALOCOMINEMI = 3;
  public static int FLD_VALORCOMULIQ_VALOCOMCKCON = 4;
  public static int FLD_VALORCOMULIQ_NUMERO_CONTABILE = 5;
  public static int FLD_VALORCOMULIQ_DATA_CONTABILE = 6;
  public static int FLD_VALORCOMULIQ_VALOCOMCKCIG = 7;
  public static int FLD_VALORCOMULIQ_CIG = 8;
  public static int FLD_VALORCOMULIQ_VALCOMCKESCI = 9;
  public static int FLD_VALORCOMULIQ_ESCLUSIONE_CIG = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI3 = 827;
  public static int FLD_PARAMETRI3_PARAMANNOLIQ = 0;
  public static int FLD_PARAMETRI3_PARAMNUMELIQ = 1;
  public static int FLD_PARAMETRI3_PARAMTITOLO = 2;
  public static int FLD_PARAMETRI3_PARAMCODINTE = 3;
  public static int FLD_PARAMETRI3_PARAMCODTERZ = 4;
  public static int FLD_PARAMETRI3_PARAMCATEGOR = 5;
  public static int FLD_PARAMETRI3_PARLOODIVBEN = 6;
  public static int FLD_PARAMETRI3_PARLOONOTECO = 7;
  public static int FLD_PARAMETRI3_PARLOOQUDIBE = 8;
  public static int FLD_PARAMETRI3_PARAMINEMISS = 9;
  public static int FLD_PARAMETRI3_PARAINEMIORI = 10;
  public static int FLD_PARAMETRI3_PARAMANNOIMP = 11;
  public static int FLD_PARAMETRI3_PARAMNUMEIMP = 12;
  public static int FLD_PARAMETRI3_PARANNSUBIMP = 13;
  public static int FLD_PARAMETRI3_PARNUMSUBIMP = 14;

  // Definition of table: Beneficiario
  //
  public static int TBL_BENEFICIARI3 = 828;
  public static int FLD_BENEFICIARI3_BENRAGIOSOCI = 0;
  public static int FLD_BENEFICIARI3_BENCODICE = 1;

  // Definition of table: Diverso Beneficiario
  //
  public static int TBL_DIVERSBENEF6 = 829;
  public static int FLD_DIVERSBENEF6_DIVBENRAGSOC = 0;
  public static int FLD_DIVERSBENEF6_DIVBENCODICE = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI528 = 830;
  public static int FLD_PARAMETRI528_PARELIDETDIS = 0;
  public static int FLD_PARAMETRI528_PARARIAPDIST = 1;
  public static int FLD_PARAMETRI528_PARAMANNOLIQ = 2;
  public static int FLD_PARAMETRI528_PARAMNUMELIQ = 3;
  public static int FLD_PARAMETRI528_PARAANNODIST = 4;
  public static int FLD_PARAMETRI528_PARANUMEDIST = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI273 = 831;
  public static int FLD_PARAMETRI273_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI273_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI273_PARAENTRSPES = 2;
  public static int FLD_PARAMETRI273_PARAMTIPO = 3;
  public static int FLD_PARAMETRI273_PARDATULTELA = 4;
  public static int FLD_PARAMETRI273_PARLOODIVBEN = 5;
  public static int FLD_PARAMETRI273_PARLOOQUDIBE = 6;
  public static int FLD_PARAMETRI273_PARAMLISTA = 7;
  public static int FLD_PARAMETRI273_PARAMRPPATTI = 8;
  public static int FLD_PARAMETRI273_PARAMORDINAM = 9;
  public static int FLD_PARAMETRI273_PARATIPOLIQU = 10;
  public static int FLD_PARAMETRI273_PARAIMPOFILE = 11;
  public static int FLD_PARAMETRI273_PARVISDETREG = 12;

  // Definition of table: Checkupdettliq
  //
  public static int TBL_CHECKUPDETTL = 832;
  public static int FLD_CHECKUPDETTL_NOMEOGGECAPI = 0;
  public static int FLD_CHECKUPDETTL_NOMEOGGEARTI = 1;
  public static int FLD_CHECKUPDETTL_NOMOGGNUMIMP = 2;
  public static int FLD_CHECKUPDETTL_NOMOGGANNIMP = 3;
  public static int FLD_CHECKUPDETTL_NOMEOGGEIMPO = 4;
  public static int FLD_CHECKUPDETTL_NOMOGGNUMSUB = 5;
  public static int FLD_CHECKUPDETTL_NOMOGGANNSUB = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI350 = 833;
  public static int FLD_PARAMETRI350_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI350_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI350_PARDATULTELA = 2;
  public static int FLD_PARAMETRI350_PARAUNIMPPER = 3;
  public static int FLD_PARAMETRI350_PARDELDAIMSU = 4;
  public static int FLD_PARAMETRI350_PARDESDAIMSU = 5;
  public static int FLD_PARAMETRI350_SEDE_DEL = 6;
  public static int FLD_PARAMETRI350_NUMERO_DEL = 7;
  public static int FLD_PARAMETRI350_ANNO_DEL = 8;
  public static int FLD_PARAMETRI350_PARADESCGENE = 9;
  public static int FLD_PARAMETRI350_CAUSALE = 10;
  public static int FLD_PARAMETRI350_UFFICIO = 11;
  public static int FLD_PARAMETRI350_BOLLO = 12;
  public static int FLD_PARAMETRI350_PARADATAEMIS = 13;
  public static int FLD_PARAMETRI350_PARAMINEMISS = 14;
  public static int FLD_PARAMETRI350_NUMERO_CONTABILE = 15;
  public static int FLD_PARAMETRI350_DATA_CONTABILE = 16;
  public static int FLD_PARAMETRI350_PARATIPOGRUP = 17;
  public static int FLD_PARAMETRI350_PARATIPOSCAD = 18;
  public static int FLD_PARAMETRI350_PARAMALLEGAT = 19;
  public static int FLD_PARAMETRI350_PARAINFOTESO = 20;
  public static int FLD_PARAMETRI350_PARASCADMAND = 21;
  public static int FLD_PARAMETRI350_PARAMSPESE = 22;
  public static int FLD_PARAMETRI350_PARAMCOMMISS = 23;
  public static int FLD_PARAMETRI350_PARAQUALNOTE = 24;
  public static int FLD_PARAMETRI350_PARAIMPOFILE = 25;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI78 = 834;
  public static int FLD_PARAMETRI78_PARAMGRUPPO = 0;
  public static int FLD_PARAMETRI78_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI78_PARAENTRSPES = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS47 = 835;
  public static int FLD_PARS47_NOMOGGCODGRU = 0;
  public static int FLD_PARS47_NOMEOGGETTES = 1;
  public static int FLD_PARS47_NOMOGGCADINE = 2;
  public static int FLD_PARS47_NOMEOGGEVPRO = 3;
  public static int FLD_PARS47_NOMOGGLIQDAL = 4;
  public static int FLD_PARS47_NOMEOGGLIQAL = 5;

  // Definition of table: Pars
  //
  public static int TBL_PARS48 = 836;
  public static int FLD_PARS48_NOMEOGGETDAL = 0;
  public static int FLD_PARS48_NOMEOGGETTAL = 1;
  public static int FLD_PARS48_NOMEOGGETTES = 2;
  public static int FLD_PARS48_NOMOGGCADINE = 3;
  public static int FLD_PARS48_NOMEOGGEVPRO = 4;
  public static int FLD_PARS48_NOMEOGGSOLEM = 5;

  // Definition of table: Pars
  //
  public static int TBL_PARS49 = 837;
  public static int FLD_PARS49_NOMOGGCADINE = 0;
  public static int FLD_PARS49_NOMEOGGEVPRO = 1;
  public static int FLD_PARS49_NOMOGGNUDIRR = 2;
  public static int FLD_PARS49_NOMOGGANNDIS = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS50 = 838;
  public static int FLD_PARS50_NOMOGGCADINE = 0;
  public static int FLD_PARS50_NOMEOGGEVPRO = 1;
  public static int FLD_PARS50_NOMOGGNUMDIS = 2;
  public static int FLD_PARS50_NOMOGGANNDIS = 3;

  // Definition of table: Pars
  //
  public static int TBL_PARS51 = 839;
  public static int FLD_PARS51_NOMOGGCADINE = 0;
  public static int FLD_PARS51_NOMEOGGEVPRO = 1;
  public static int FLD_PARS51_NOMEOGGEUFFI = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS37 = 840;
  public static int FLD_PARS37_NOMOGGCADINE = 0;
  public static int FLD_PARS37_NOMEOGGEVPRO = 1;
  public static int FLD_PARS37_NOMOGGNUMDIS = 2;
  public static int FLD_PARS37_NOMOGGANNDIS = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM63 = 841;
  public static int FLD_PARAM63_ROWNAMEDATA = 0;
  public static int FLD_PARAM63_ROWNAMSOSEIM = 1;
  public static int FLD_PARAM63_ROWNAMEES = 2;
  public static int FLD_PARAM63_ROWNAMDIVGRU = 3;

  // Definition of table: IMPUTAZIONI CONTABILI
  //
  public static int TBL_IMPUTACONTAB = 842;
  public static int FLD_IMPUTACONTAB_DATA = 0;
  public static int FLD_IMPUTACONTAB_DIVISIONE = 1;
  public static int FLD_IMPUTACONTAB_ESERCIZIO = 2;
  public static int FLD_IMPUTACONTAB_E_S = 3;
  public static int FLD_IMPUTACONTAB_CAPITOLO = 4;
  public static int FLD_IMPUTACONTAB_ARTICOLO = 5;
  public static int FLD_IMPUTACONTAB_GESTIONE = 6;
  public static int FLD_IMPUTACONTAB_FUNZIONALE = 7;
  public static int FLD_IMPUTACONTAB_SEDE_DEL = 8;
  public static int FLD_IMPUTACONTAB_ROWNAMSEDDEL = 9;
  public static int FLD_IMPUTACONTAB_ANNO_DEL = 10;
  public static int FLD_IMPUTACONTAB_NUMERO_DEL = 11;
  public static int FLD_IMPUTACONTAB_IMPEGNO = 12;
  public static int FLD_IMPUTACONTAB_SUB = 13;
  public static int FLD_IMPUTACONTAB_SOGGETTO = 14;
  public static int FLD_IMPUTACONTAB_COSTO = 15;
  public static int FLD_IMPUTACONTAB_IMPORTO = 16;
  public static int FLD_IMPUTACONTAB_CAUSALE = 17;
  public static int FLD_IMPUTACONTAB_SEZIONE = 18;
  public static int FLD_IMPUTACONTAB_ANNO_IMPEGNO = 19;
  public static int FLD_IMPUTACONTAB_ANNO_SUB = 20;
  public static int FLD_IMPUTACONTAB_NUM_QUIETANZA = 21;
  public static int FLD_IMPUTACONTAB_CODICE_SIOPE = 22;
  public static int FLD_IMPUTACONTAB_ROWNAMEANOMA = 23;
  public static int FLD_IMPUTACONTAB_ROWNAMCAPART = 24;
  public static int FLD_IMPUTACONTAB_ROWNAMEBENEF = 25;
  public static int FLD_IMPUTACONTAB_ROWNAMEQUIET = 26;
  public static int FLD_IMPUTACONTAB_ROWNAMVALSIO = 27;
  public static int FLD_IMPUTACONTAB_CODICE_COFOG = 28;
  public static int FLD_IMPUTACONTAB_CODICE_EUROPEO = 29;
  public static int FLD_IMPUTACONTAB_COD_LIVELLO_5 = 30;
  public static int FLD_IMPUTACONTAB_ROWNAMERRCOF = 31;
  public static int FLD_IMPUTACONTAB_ROWNAMERRLI5 = 32;
  public static int FLD_IMPUTACONTAB_ROWNAMERCOEU = 33;
  public static int FLD_IMPUTACONTAB_ROWNAMANNIMP = 34;
  public static int FLD_IMPUTACONTAB_ROWNAMNUMIMP = 35;
  public static int FLD_IMPUTACONTAB_ROWNAMERRIMP = 36;
  public static int FLD_IMPUTACONTAB_ROWNAMERRDEL = 37;
  public static int FLD_IMPUTACONTAB_ROWNAMMOTANO = 38;

  // Definition of table: Param CDP
  //
  public static int TBL_PARAMCDP = 843;
  public static int FLD_PARAMCDP_ROWNAMEDATA = 0;
  public static int FLD_PARAMCDP_ROWNAMSOSEIM = 1;
  public static int FLD_PARAMCDP_ROWNAMEES = 2;
  public static int FLD_PARAMCDP_ROWNAMDIVGRU = 3;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE33 = 844;
  public static int FLD_NEWTABLE33_ROWNAMEDATA = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI85 = 845;
  public static int FLD_PARAMETRI85_PARAMCASSA = 0;
  public static int FLD_PARAMETRI85_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI85_PARADATARITE = 2;
  public static int FLD_PARAMETRI85_PARAMSTART = 3;
  public static int FLD_PARAMETRI85_PARAMGRUPPO = 4;
  public static int FLD_PARAMETRI85_PARAMBOLLO = 5;
  public static int FLD_PARAMETRI85_PARAMDELIBER = 6;
  public static int FLD_PARAMETRI85_PARANUMEDELI = 7;
  public static int FLD_PARAMETRI85_PARAANNODELI = 8;
  public static int FLD_PARAMETRI85_PARAMSTIPEND = 9;
  public static int FLD_PARAMETRI85_PARAMCODICE = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI223 = 846;
  public static int FLD_PARAMETRI223_PARAMCASSA = 0;
  public static int FLD_PARAMETRI223_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI223_PARADATARITE = 2;
  public static int FLD_PARAMETRI223_PARAMSTART = 3;
  public static int FLD_PARAMETRI223_PARAMSTIPEND = 4;
  public static int FLD_PARAMETRI223_PARAMNEWSTAR = 5;
  public static int FLD_PARAMETRI223_PARATIPORITE = 6;
  public static int FLD_PARAMETRI223_PARRITDEMEDA = 7;
  public static int FLD_PARAMETRI223_PARRITDEIMEA = 8;
  public static int FLD_PARAMETRI223_PARRITACAREN = 9;
  public static int FLD_PARAMETRI223_PARAMCUMULAT = 10;
  public static int FLD_PARAMETRI223_PARIMPDANOVE = 11;
  public static int FLD_PARAMETRI223_PARACODIBENE = 12;
  public static int FLD_PARAMETRI223_PARAMCAUSALE = 13;
  public static int FLD_PARAMETRI223_PARAMBOLLO = 14;
  public static int FLD_PARAMETRI223_PARAMUFFICIO = 15;
  public static int FLD_PARAMETRI223_PARAMINEMISS = 16;
  public static int FLD_PARAMETRI223_PARAMSPESE = 17;
  public static int FLD_PARAMETRI223_PARAMCOMMISS = 18;
  public static int FLD_PARAMETRI223_PARAMSCADENZ = 19;
  public static int FLD_PARAMETRI223_PARAMALLEGAT = 20;
  public static int FLD_PARAMETRI223_PARAINFOTESO = 21;
  public static int FLD_PARAMETRI223_PARAMUFFILIQ = 22;

  // Definition of table: Stringhe
  //
  public static int TBL_STRINGHE = 847;
  public static int FLD_STRINGHE_ROWNAMNEWFIE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI317 = 848;
  public static int FLD_PARAMETRI317_PARNUMLIQDAL = 0;
  public static int FLD_PARAMETRI317_PARANUMLIQAL = 1;
  public static int FLD_PARAMETRI317_PARANUMEIMPE = 2;
  public static int FLD_PARAMETRI317_PARAANNOIMPE = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI166 = 849;
  public static int FLD_PARAMETRI166_PARNUMLIQDAL = 0;
  public static int FLD_PARAMETRI166_PARANUMLIQAL = 1;
  public static int FLD_PARAMETRI166_PARANUMESUBI = 2;
  public static int FLD_PARAMETRI166_PARAANNOSUBI = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI217 = 850;
  public static int FLD_PARAMETRI217_PARAMDAL = 0;
  public static int FLD_PARAMETRI217_PARAMAL = 1;
  public static int FLD_PARAMETRI217_PARADATAELAB = 2;
  public static int FLD_PARAMETRI217_PARAMUFFICIO = 3;
  public static int FLD_PARAMETRI217_PARAMSUBIMPE = 4;
  public static int FLD_PARAMETRI217_PARAMSUDDIVI = 5;
  public static int FLD_PARAMETRI217_PARAMTIPO = 6;
  public static int FLD_PARAMETRI217_PARAMDETTAGL = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI261 = 851;
  public static int FLD_PARAMETRI261_ROWNAMEESERC = 0;
  public static int FLD_PARAMETRI261_ROWNAMEDELIB = 1;
  public static int FLD_PARAMETRI261_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI261_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI261_RONASOIMDICO = 4;
  public static int FLD_PARAMETRI261_UNITA_PROPONENTE = 5;
  public static int FLD_PARAMETRI261_NUMERO_PROPOSTA = 6;
  public static int FLD_PARAMETRI261_ANNO_PROPOSTA = 7;
  public static int FLD_PARAMETRI261_ROWNAMDATELA = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI299 = 852;
  public static int FLD_PARAMETRI299_PARAANNODIST = 0;
  public static int FLD_PARAMETRI299_PARANUMEDIST = 1;
  public static int FLD_PARAMETRI299_PARSOLIMDALI = 2;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL5 = 853;
  public static int FLD_PARAMETRIOL5_ANNODISTIOLD = 0;
  public static int FLD_PARAMETRIOL5_NUMERDISTOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI291 = 854;
  public static int FLD_PARAMETRI291_PARANUMEDIST = 0;
  public static int FLD_PARAMETRI291_PARAANNODIST = 1;
  public static int FLD_PARAMETRI291_PARAENTRSPES = 2;
  public static int FLD_PARAMETRI291_PARSOLIMDALI = 3;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI32 = 855;
  public static int FLD_FILTRI32_NOMOGGCODFOR = 0;
  public static int FLD_FILTRI32_NOMOGGNUPRGE = 1;
  public static int FLD_FILTRI32_NOMOGGNUPRIN = 2;
  public static int FLD_FILTRI32_NOMOGGNUMDOC = 3;
  public static int FLD_FILTRI32_NOMOGGNULOST = 4;
  public static int FLD_FILTRI32_NOMOGGCODLI1 = 5;
  public static int FLD_FILTRI32_NOMOGGCODLI2 = 6;
  public static int FLD_FILTRI32_NOMEOGGEMISS = 7;
  public static int FLD_FILTRI32_NOMOGGPROMIS = 8;
  public static int FLD_FILTRI32_NOMEOGGPROUO = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI296 = 856;
  public static int FLD_PARAMETRI296_PARANUMEDIST = 0;
  public static int FLD_PARAMETRI296_PARAANNODIST = 1;
  public static int FLD_PARAMETRI296_SEDE_DEL = 2;
  public static int FLD_PARAMETRI296_NUMERO_DEL = 3;
  public static int FLD_PARAMETRI296_ANNO_DEL = 4;
  public static int FLD_PARAMETRI296_UNITA_PROPONENTE = 5;
  public static int FLD_PARAMETRI296_NUMERO_PROPOSTA = 6;
  public static int FLD_PARAMETRI296_ANNO_PROPOSTA = 7;
  public static int FLD_PARAMETRI296_DESCRIZIONE = 8;
  public static int FLD_PARAMETRI296_UFFICIO = 9;
  public static int FLD_PARAMETRI296_CAUSALE = 10;
  public static int FLD_PARAMETRI296_BOLLO = 11;
  public static int FLD_PARAMETRI296_PARAMCENTRO = 12;
  public static int FLD_PARAMETRI296_PARAMINEMISS = 13;
  public static int FLD_PARAMETRI296_PARADATALIQU = 14;
  public static int FLD_PARAMETRI296_SPESE = 15;
  public static int FLD_PARAMETRI296_COMMISSIONI = 16;
  public static int FLD_PARAMETRI296_PARAMSCADENZ = 17;
  public static int FLD_PARAMETRI296_ALLEGATI = 18;
  public static int FLD_PARAMETRI296_INFO_TESORIERE = 19;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI93 = 857;
  public static int FLD_PARAMETRI93_ANNO_DISTINTA = 0;
  public static int FLD_PARAMETRI93_NUMERO_DISTINTA = 1;
  public static int FLD_PARAMETRI93_DATA_DISTINTA = 2;
  public static int FLD_PARAMETRI93_TIPO_DIST = 3;
  public static int FLD_PARAMETRI93_STATO = 4;
  public static int FLD_PARAMETRI93_PARAMESTERNO = 5;
  public static int FLD_PARAMETRI93_PARAMLIQUIDA = 6;
  public static int FLD_PARAMETRI93_PARACAMPCHIA = 7;
  public static int FLD_PARAMETRI93_PARADOCUIRID = 8;
  public static int FLD_PARAMETRI93_PARAMBENOLD = 9;
  public static int FLD_PARAMETRI93_PARALOOKNOTE = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI684 = 858;
  public static int FLD_PARAMETRI684_ANNO_DISTINTA = 0;
  public static int FLD_PARAMETRI684_NUMERO_DISTINTA = 1;
  public static int FLD_PARAMETRI684_DATA_DISTINTA = 2;
  public static int FLD_PARAMETRI684_PARAFATTSPRC = 3;

  // Definition of table: Valori Comuni
  //
  public static int TBL_VALORICOMUNI = 859;
  public static int FLD_VALORICOMUNI_ANNO_DISTINTA = 0;
  public static int FLD_VALORICOMUNI_NUMERO_DISTINTA = 1;
  public static int FLD_VALORICOMUNI_VALOCOMCKDEL = 2;
  public static int FLD_VALORICOMUNI_ANNO_DEL = 3;
  public static int FLD_VALORICOMUNI_NUMERO_DEL = 4;
  public static int FLD_VALORICOMUNI_SEDE_DEL = 5;
  public static int FLD_VALORICOMUNI_VALOCOMCKDES = 6;
  public static int FLD_VALORICOMUNI_DESCRIZIONE = 7;
  public static int FLD_VALORICOMUNI_VALCOMCKINEM = 8;
  public static int FLD_VALORICOMUNI_VALOCOMINEMI = 9;
  public static int FLD_VALORICOMUNI_VALOCOMCKCAU = 10;
  public static int FLD_VALORICOMUNI_CAUSALE = 11;
  public static int FLD_VALORICOMUNI_VALOCOMCKBOL = 12;
  public static int FLD_VALORICOMUNI_BOLLO = 13;
  public static int FLD_VALORICOMUNI_VALCOMCKTIVI = 14;
  public static int FLD_VALORICOMUNI_TIPO_VINCOLO = 15;
  public static int FLD_VALORICOMUNI_VALOCOMCKUFF = 16;
  public static int FLD_VALORICOMUNI_UFFICIO = 17;
  public static int FLD_VALORICOMUNI_VALOCOMCKCON = 18;
  public static int FLD_VALORICOMUNI_NUMERO_CONTABILE = 19;
  public static int FLD_VALORICOMUNI_DATA_CONTABILE = 20;
  public static int FLD_VALORICOMUNI_VALCOMCKMAIN = 21;
  public static int FLD_VALORICOMUNI_SPESE = 22;
  public static int FLD_VALORICOMUNI_SCADENZA = 23;
  public static int FLD_VALORICOMUNI_ALLEGATI = 24;
  public static int FLD_VALORICOMUNI_COMMISSIONI = 25;
  public static int FLD_VALORICOMUNI_INFO_TESORIERE = 26;
  public static int FLD_VALORICOMUNI_VALCOMCKDARE = 27;
  public static int FLD_VALORICOMUNI_VALCOMDATREG = 28;
  public static int FLD_VALORICOMUNI_VALCOMCKESCI = 29;
  public static int FLD_VALORICOMUNI_ESCLUSIONE_CIG = 30;
  public static int FLD_VALORICOMUNI_VALCOMCKDIBE = 31;
  public static int FLD_VALORICOMUNI_VALCOMCODIBE = 32;
  public static int FLD_VALORICOMUNI_VACONUQTDIBE = 33;
  public static int FLD_VALORICOMUNI_VALCOMCKLIV5 = 34;
  public static int FLD_VALORICOMUNI_COD_LIVELLO_5 = 35;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI507 = 860;
  public static int FLD_PARAMETRI507_ANNO_DISTINTA = 0;
  public static int FLD_PARAMETRI507_NUMERO_DISTINTA = 1;
  public static int FLD_PARAMETRI507_DATA_DISTINTA = 2;
  public static int FLD_PARAMETRI507_TIPO_DIST = 3;
  public static int FLD_PARAMETRI507_PARAMESTERNO = 4;
  public static int FLD_PARAMETRI507_PARAMLIQUIDA = 5;
  public static int FLD_PARAMETRI507_PARACAMPCHIA = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI295 = 861;
  public static int FLD_PARAMETRI295_PARAANNODIST = 0;
  public static int FLD_PARAMETRI295_PARANUMEDIST = 1;
  public static int FLD_PARAMETRI295_PARSOLMODALI = 2;
  public static int FLD_PARAMETRI295_PARAMPERIDAL = 3;
  public static int FLD_PARAMETRI295_PARAMAL = 4;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL9 = 862;
  public static int FLD_PARAMETRIOL9_ANNODISTIOLD = 0;
  public static int FLD_PARAMETRIOL9_NUMERDISTOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI661 = 863;
  public static int FLD_PARAMETRI661_PARAMESERCIZ = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI297 = 864;
  public static int FLD_PARAMETRI297_PARANUMEDIST = 0;
  public static int FLD_PARAMETRI297_PARAANNODIST = 1;
  public static int FLD_PARAMETRI297_PARAMPERIDAL = 2;
  public static int FLD_PARAMETRI297_PARAMAL = 3;
  public static int FLD_PARAMETRI297_SEDE_DEL = 4;
  public static int FLD_PARAMETRI297_NUMERO_DEL = 5;
  public static int FLD_PARAMETRI297_ANNO_DEL = 6;
  public static int FLD_PARAMETRI297_UNITA_PROPONENTE = 7;
  public static int FLD_PARAMETRI297_NUMERO_PROPOSTA = 8;
  public static int FLD_PARAMETRI297_ANNO_PROPOSTA = 9;
  public static int FLD_PARAMETRI297_UFFICIO = 10;
  public static int FLD_PARAMETRI297_CAUSALE = 11;
  public static int FLD_PARAMETRI297_BOLLO = 12;
  public static int FLD_PARAMETRI297_PARAMNUMQUIE = 13;
  public static int FLD_PARAMETRI297_PARAMECONOMO = 14;
  public static int FLD_PARAMETRI297_PARAMCENTRO = 15;
  public static int FLD_PARAMETRI297_PARAMINEMISS = 16;
  public static int FLD_PARAMETRI297_PARADATALIQU = 17;
  public static int FLD_PARAMETRI297_SPESE = 18;
  public static int FLD_PARAMETRI297_COMMISSIONI = 19;
  public static int FLD_PARAMETRI297_PARAMSCADENZ = 20;
  public static int FLD_PARAMETRI297_ALLEGATI = 21;
  public static int FLD_PARAMETRI297_INFO_TESORIERE = 22;
  public static int FLD_PARAMETRI297_PARINTLIQUNI = 23;

  // Definition of table: Val Cap
  //
  public static int TBL_VALCAP1 = 865;
  public static int FLD_VALCAP1_NOMOGGLIV4CA = 0;

  // Definition of table: Parametri Fase 1
  //
  public static int TBL_PARAMETFASE1 = 866;
  public static int FLD_PARAMETFASE1_ANNO_IMP = 0;
  public static int FLD_PARAMETFASE1_NUMERO_IMP = 1;
  public static int FLD_PARAMETFASE1_ANNO_SUBIMP = 2;
  public static int FLD_PARAMETFASE1_NUMERO_SUBIMP = 3;
  public static int FLD_PARAMETFASE1_DESCRIZIONE = 4;
  public static int FLD_PARAMETFASE1_BOLLO = 5;
  public static int FLD_PARAMETFASE1_PARAPRODAESP = 6;

  // Definition of table: Parametri Old Fase 1
  //
  public static int TBL_PARAOLDFASE1 = 867;
  public static int FLD_PARAOLDFASE1_ANNO_IMP = 0;
  public static int FLD_PARAOLDFASE1_NUMERO_IMP = 1;
  public static int FLD_PARAOLDFASE1_ANNO_SUBIMP = 2;
  public static int FLD_PARAOLDFASE1_NUMERO_SUBIMP = 3;
  public static int FLD_PARAOLDFASE1_VOCE_ECON = 4;

  // Definition of table: Parametri Liquidazione Multipla
  //
  public static int TBL_PARALIQUMULT = 868;
  public static int FLD_PARALIQUMULT_CAPITOLO = 0;
  public static int FLD_PARALIQUMULT_ARTICOLO = 1;
  public static int FLD_PARALIQUMULT_PARAMTITOLO = 2;
  public static int FLD_PARALIQUMULT_PARAMCATEGOR = 3;
  public static int FLD_PARALIQUMULT_PARAMCODINTE = 4;
  public static int FLD_PARALIQUMULT_PARAMCODTERZ = 5;
  public static int FLD_PARALIQUMULT_ANNO_IMP = 6;
  public static int FLD_PARALIQUMULT_NUMERO_IMP = 7;
  public static int FLD_PARALIQUMULT_ANNO_SUBIMP = 8;
  public static int FLD_PARALIQUMULT_NUMERO_SUBIMP = 9;
  public static int FLD_PARALIQUMULT_ANNO_DEL = 10;
  public static int FLD_PARALIQUMULT_NUMERO_DEL = 11;
  public static int FLD_PARALIQUMULT_SEDE_DEL = 12;
  public static int FLD_PARALIQUMULT_DESCRIZIONE = 13;
  public static int FLD_PARALIQUMULT_BOLLO = 14;
  public static int FLD_PARALIQUMULT_ANNO_PROPOSTA = 15;
  public static int FLD_PARALIQUMULT_UNITA_PROPONENTE = 16;
  public static int FLD_PARALIQUMULT_NUMERO_PROPOSTA = 17;
  public static int FLD_PARALIQUMULT_VOCE_ECON = 18;
  public static int FLD_PARALIQUMULT_D_DATA_REG = 19;
  public static int FLD_PARALIQUMULT_CODICE_GESTIONALE = 20;
  public static int FLD_PARALIQUMULT_PARAMINEMISS = 21;
  public static int FLD_PARALIQUMULT_PARATIPOVINC = 22;
  public static int FLD_PARALIQUMULT_PARAMRILECO = 23;
  public static int FLD_PARALIQUMULT_PARAMFATTORE = 24;
  public static int FLD_PARALIQUMULT_PARAMCENTRO = 25;
  public static int FLD_PARALIQUMULT_PARAMCOMPDAL = 26;
  public static int FLD_PARALIQUMULT_PARAMCOMPAL = 27;
  public static int FLD_PARALIQUMULT_PARAMFINANZI = 28;
  public static int FLD_PARALIQUMULT_UFFICIO = 29;
  public static int FLD_PARALIQUMULT_CAUSALE = 30;
  public static int FLD_PARALIQUMULT_DIVERSO_BEN = 31;
  public static int FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN = 32;
  public static int FLD_PARALIQUMULT_NUMERO_CONTABILE = 33;
  public static int FLD_PARALIQUMULT_DATA_CONTABILE = 34;
  public static int FLD_PARALIQUMULT_SPESE = 35;
  public static int FLD_PARALIQUMULT_SCADENZA = 36;
  public static int FLD_PARALIQUMULT_ALLEGATI = 37;
  public static int FLD_PARALIQUMULT_COMMISSIONI = 38;
  public static int FLD_PARALIQUMULT_INFO_TESORIERE = 39;
  public static int FLD_PARALIQUMULT_PARAPRODAESP = 40;
  public static int FLD_PARALIQUMULT_CIG = 41;
  public static int FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG = 42;
  public static int FLD_PARALIQUMULT_CUP = 43;
  public static int FLD_PARALIQUMULT_CODICE_COFOG = 44;
  public static int FLD_PARALIQUMULT_CODICE_EUROPEO = 45;
  public static int FLD_PARALIQUMULT_COD_LIVELLO_5 = 46;

  // Definition of table: Val Cap
  //
  public static int TBL_VALCAP = 869;
  public static int FLD_VALCAP_NOMOGGLIV4CA = 0;

  // Definition of table: Parametri Fase 2
  //
  public static int TBL_PARAMETFASE2 = 870;
  public static int FLD_PARAMETFASE2_PARDATPRODAL = 0;
  public static int FLD_PARAMETFASE2_PARADATPROAL = 1;
  public static int FLD_PARAMETFASE2_PARAMSCADDAL = 2;
  public static int FLD_PARAMETFASE2_PARAMSCADEAL = 3;
  public static int FLD_PARAMETFASE2_PARAMORDINAM = 4;
  public static int FLD_PARAMETFASE2_PARATOTAPARZ = 5;
  public static int FLD_PARAMETFASE2_PARACODIBENE = 6;

  // Definition of table: FAT IMDB
  //
  public static int TBL_FATIMDB = 871;
  public static int FLD_FATIMDB_CODICE = 0;
  public static int FLD_FATIMDB_ANNO_RIF = 1;
  public static int FLD_FATIMDB_NUMERO_RIF = 2;
  public static int FLD_FATIMDB_ANNO_DOC = 3;
  public static int FLD_FATIMDB_NUMERO_DOC = 4;
  public static int FLD_FATIMDB_ANNO_PROG = 5;
  public static int FLD_FATIMDB_NUMERO_PROG = 6;
  public static int FLD_FATIMDB_ANNO_PROT = 7;
  public static int FLD_FATIMDB_NUMERO_PROT = 8;
  public static int FLD_FATIMDB_CODICE_DOC = 9;
  public static int FLD_FATIMDB_STORNO = 10;
  public static int FLD_FATIMDB_UFFICIO_INVIO = 11;
  public static int FLD_FATIMDB_DESCRIZIONE = 12;
  public static int FLD_FATIMDB_IMPORTO = 13;
  public static int FLD_FATIMDB_FATIMDNUMQUI = 14;
  public static int FLD_FATIMDB_CATEGORIA = 15;
  public static int FLD_FATIMDB_VARIAZIONI = 16;
  public static int FLD_FATIMDB_IMPUTATO = 17;
  public static int FLD_FATIMDB_D_DATA_DOC = 18;
  public static int FLD_FATIMDB_D_DATA_PROT = 19;
  public static int FLD_FATIMDB_D_SCADENZA = 20;
  public static int FLD_FATIMDB_FATIMDCOIMEC = 21;
  public static int FLD_FATIMDB_NOTE = 22;
  public static int FLD_FATIMDB_FATIMDNUQULI = 23;
  public static int FLD_FATIMDB_CENTRO = 24;
  public static int FLD_FATIMDB_FATTORE = 25;
  public static int FLD_FATIMDB_COMPETENZA_DAL = 26;
  public static int FLD_FATIMDB_COMPETENZA_AL = 27;
  public static int FLD_FATIMDB_FAIMCOIMECLI = 28;
  public static int FLD_FATIMDB_FINANZIAMENTO = 29;
  public static int FLD_FATIMDB_CODICE_GESTIONALE = 30;
  public static int FLD_FATIMDB_FATIMDNOTLIQ = 31;
  public static int FLD_FATIMDB_FATIMDBSELEZ = 32;
  public static int FLD_FATIMDB_FATIMDSELOLD = 33;
  public static int FLD_FATIMDB_FATIMDBDALIQ = 34;
  public static int FLD_FATIMDB_FATIMDDALIOL = 35;
  public static int FLD_FATIMDB_CIG = 36;
  public static int FLD_FATIMDB_MOTIVO_ESCLUSIONE_CIG = 37;
  public static int FLD_FATIMDB_CUP = 38;
  public static int FLD_FATIMDB_CODICE_COFOG = 39;
  public static int FLD_FATIMDB_CODICE_EUROPEO = 40;
  public static int FLD_FATIMDB_COD_LIVELLO_5 = 41;
  public static int FLD_FATIMDB_FATIMDIMPIVA = 42;
  public static int FLD_FATIMDB_FATIMDTRAIVA = 43;
  public static int FLD_FATIMDB_FATIMDTIREDE = 44;
  public static int FLD_FATIMDB_FATIMDTIBODE = 45;
  public static int FLD_FATIMDB_FATIMDIMIVIS = 46;
  public static int FLD_FATIMDB_FATIMDTIPATT = 47;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI552 = 872;
  public static int FLD_PARAMETRI552_ROWNAMPEFIBL = 0;
  public static int FLD_PARAMETRI552_ROWNAMBLOINS = 1;
  public static int FLD_PARAMETRI552_ROWNAMEPROGR = 2;
  public static int FLD_PARAMETRI552_ROWNAMEFASE = 3;
  public static int FLD_PARAMETRI552_RONATIPAPECA = 4;

  // Definition of table: Parametri File
  //
  public static int TBL_PARAMETRFILE = 873;
  public static int FLD_PARAMETRFILE_ROWNAMPEFIBL = 0;
  public static int FLD_PARAMETRFILE_ROWNAMBLOINS = 1;
  public static int FLD_PARAMETRFILE_ROWNAMEPROGR = 2;
  public static int FLD_PARAMETRFILE_ROWNAMEFASE = 3;
  public static int FLD_PARAMETRFILE_RONATIPAPECA = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI553 = 874;
  public static int FLD_PARAMETRI553_PARAMNUMEIMP = 0;
  public static int FLD_PARAMETRI553_PARNUMIMPOLD = 1;
  public static int FLD_PARAMETRI553_PARAMANNOIMP = 2;
  public static int FLD_PARAMETRI553_PARANNIMPOLD = 3;
  public static int FLD_PARAMETRI553_PARANUMESUBI = 4;
  public static int FLD_PARAMETRI553_PARNUMSUBOLD = 5;
  public static int FLD_PARAMETRI553_PARAANNOSUBI = 6;
  public static int FLD_PARAMETRI553_PARANNSUBOLD = 7;
  public static int FLD_PARAMETRI553_PARAMINEMISS = 8;
  public static int FLD_PARAMETRI553_PARAVOCEECON = 9;
  public static int FLD_PARAMETRI553_PARACODIGEST = 10;
  public static int FLD_PARAMETRI553_PARATIPOVINC = 11;
  public static int FLD_PARAMETRI553_SEDE_DEL = 12;
  public static int FLD_PARAMETRI553_NUMERO_DEL = 13;
  public static int FLD_PARAMETRI553_ANNO_DEL = 14;
  public static int FLD_PARAMETRI553_UNITA_PROPONENTE = 15;
  public static int FLD_PARAMETRI553_NUMERO_PROPOSTA = 16;
  public static int FLD_PARAMETRI553_ANNO_PROPOSTA = 17;
  public static int FLD_PARAMETRI553_DESCRIZIONE = 18;
  public static int FLD_PARAMETRI553_CAUSALE = 19;
  public static int FLD_PARAMETRI553_PARTIPPAPECA = 20;
  public static int FLD_PARAMETRI553_BOLLO = 21;
  public static int FLD_PARAMETRI553_UFFICIO = 22;
  public static int FLD_PARAMETRI553_FINANZIAMENTO = 23;
  public static int FLD_PARAMETRI553_PARAMSCADENZ = 24;
  public static int FLD_PARAMETRI553_SPESE = 25;
  public static int FLD_PARAMETRI553_COMMISSIONI = 26;
  public static int FLD_PARAMETRI553_ALLEGATI = 27;
  public static int FLD_PARAMETRI553_INFO_TESORIERE = 28;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP = 875;
  public static int FLD_VALORICAP_ROWNAMETITOL = 0;
  public static int FLD_VALORICAP_ROWNAMECATEG = 1;
  public static int FLD_VALORICAP_ROWNAMCODINT = 2;
  public static int FLD_VALORICAP_ROWNAMCODTER = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI558 = 876;
  public static int FLD_PARAMETRI558_PARAMNUMEDAL = 0;
  public static int FLD_PARAMETRI558_PARAMNUMERAL = 1;
  public static int FLD_PARAMETRI558_PARAMDATADAL = 2;
  public static int FLD_PARAMETRI558_PARAMDATAAL = 3;
  public static int FLD_PARAMETRI558_PARAMORDINAM = 4;
  public static int FLD_PARAMETRI558_PARAMBENEFIC = 5;
  public static int FLD_PARAMETRI558_PARDATREGLIQ = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI573 = 877;
  public static int FLD_PARAMETRI573_PARDATREGLIQ = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI266 = 878;
  public static int FLD_PARAMETRI266_PARAMLIQORD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI508 = 879;
  public static int FLD_PARAMETRI508_PARAMGRUPPO = 0;
  public static int FLD_PARAMETRI508_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI508_PARAENTRSPES = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM170 = 880;
  public static int FLD_PARAM170_NOMOGGLIQORD = 0;
  public static int FLD_PARAM170_NOMOGGOLDGRU = 1;
  public static int FLD_PARAM170_NOMOGGOLDDES = 2;
  public static int FLD_PARAM170_NOMOGGNEWGRU = 3;
  public static int FLD_PARAM170_NOMOGGNEWDES = 4;

  // Definition of table: Valori Comuni Ord Liq
  //
  public static int TBL_VALCOMORDLIQ = 881;
  public static int FLD_VALCOMORDLIQ_VALCOMORDLIQ = 0;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKDEL = 1;
  public static int FLD_VALCOMORDLIQ_ANNO_DEL = 2;
  public static int FLD_VALCOMORDLIQ_NUMERO_DEL = 3;
  public static int FLD_VALCOMORDLIQ_SEDE_DEL = 4;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKDES = 5;
  public static int FLD_VALCOMORDLIQ_DESCRIZIONE = 6;
  public static int FLD_VALCOMORDLIQ_VALCOMCKTIVI = 7;
  public static int FLD_VALCOMORDLIQ_TIPO_VINCOLO = 8;
  public static int FLD_VALCOMORDLIQ_VALCOMCKMAIN = 9;
  public static int FLD_VALCOMORDLIQ_SPESE = 10;
  public static int FLD_VALCOMORDLIQ_SCADENZA = 11;
  public static int FLD_VALCOMORDLIQ_ALLEGATI = 12;
  public static int FLD_VALCOMORDLIQ_COMMISSIONI = 13;
  public static int FLD_VALCOMORDLIQ_INFO_TESORIERE = 14;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKECO = 15;
  public static int FLD_VALCOMORDLIQ_FATTORE = 16;
  public static int FLD_VALCOMORDLIQ_CENTRO = 17;
  public static int FLD_VALCOMORDLIQ_COMP_DAL = 18;
  public static int FLD_VALCOMORDLIQ_COMP_AL = 19;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKTRA = 20;
  public static int FLD_VALCOMORDLIQ_CODICE_COFOG = 21;
  public static int FLD_VALCOMORDLIQ_CODICE_EUROPEO = 22;
  public static int FLD_VALCOMORDLIQ_COD_LIVELLO_5 = 23;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKCAP = 24;
  public static int FLD_VALCOMORDLIQ_CAPITOLO = 25;
  public static int FLD_VALCOMORDLIQ_CAPITOLO_OLD = 26;
  public static int FLD_VALCOMORDLIQ_ARTICOLO = 27;
  public static int FLD_VALCOMORDLIQ_ARTICOLO_OLD = 28;
  public static int FLD_VALCOMORDLIQ_VALCOMCKIMAC = 29;
  public static int FLD_VALCOMORDLIQ_VALCOMANIMAC = 30;
  public static int FLD_VALCOMORDLIQ_VACOANIMACOL = 31;
  public static int FLD_VALCOMORDLIQ_VALCOMNUIMAC = 32;
  public static int FLD_VALCOMORDLIQ_VACONUIMACOL = 33;
  public static int FLD_VALCOMORDLIQ_VALOCOMCKSUB = 34;
  public static int FLD_VALCOMORDLIQ_VALCOMANNSUB = 35;
  public static int FLD_VALCOMORDLIQ_VALCOMNUMSUB = 36;
  public static int FLD_VALCOMORDLIQ_VOCE_ECON = 37;
  public static int FLD_VALCOMORDLIQ_CODICE_GESTIONALE = 38;
  public static int FLD_VALCOMORDLIQ_FINANZIAMENTO = 39;
  public static int FLD_VALCOMORDLIQ_OPERA = 40;
  public static int FLD_VALCOMORDLIQ_SE_SUBIMPEGNO = 41;
  public static int FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA = 42;
  public static int FLD_VALCOMORDLIQ_BENEFICIARIO = 43;
  public static int FLD_VALCOMORDLIQ_NUM_QUIETANZA = 44;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI644 = 882;
  public static int FLD_PARAMETRI644_PARATIPOMOVI = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI646 = 883;
  public static int FLD_PARAMETRI646_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI646_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI646_PARATIPOMOVI = 2;
  public static int FLD_PARAMETRI646_PARATIPOFILE = 3;
  public static int FLD_PARAMETRI646_PARANCDETEME = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI648 = 884;
  public static int FLD_PARAMETRI648_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI648_PARATIPOMOVI = 1;

  // Definition of table: Valori Comuni Mov
  //
  public static int TBL_VALORCOMUMOV = 885;
  public static int FLD_VALORCOMUMOV_VALCOMTIPMOV = 0;
  public static int FLD_VALORCOMUMOV_VALOCOMCKDEL = 1;
  public static int FLD_VALORCOMUMOV_ANNO_DEL = 2;
  public static int FLD_VALORCOMUMOV_NUMERO_DEL = 3;
  public static int FLD_VALORCOMUMOV_SEDE_DEL = 4;
  public static int FLD_VALORCOMUMOV_VALOCOMCKDES = 5;
  public static int FLD_VALORCOMUMOV_DESCRIZIONE = 6;
  public static int FLD_VALORCOMUMOV_VALCOMCKTIVI = 7;
  public static int FLD_VALORCOMUMOV_TIPO_VINCOLO = 8;
  public static int FLD_VALORCOMUMOV_VALOCOMCKECO = 9;
  public static int FLD_VALORCOMUMOV_FATTORE = 10;
  public static int FLD_VALORCOMUMOV_CENTRO = 11;
  public static int FLD_VALORCOMUMOV_COMP_DAL = 12;
  public static int FLD_VALORCOMUMOV_COMP_AL = 13;
  public static int FLD_VALORCOMUMOV_VALCOMIMPECO = 14;
  public static int FLD_VALORCOMUMOV_VALOCOMCKTRA = 15;
  public static int FLD_VALORCOMUMOV_CODICE_COFOG = 16;
  public static int FLD_VALORCOMUMOV_CODICE_EUROPEO = 17;
  public static int FLD_VALORCOMUMOV_COD_LIVELLO_5 = 18;
  public static int FLD_VALORCOMUMOV_VALOCOMCKCAP = 19;
  public static int FLD_VALORCOMUMOV_CAPITOLO = 20;
  public static int FLD_VALORCOMUMOV_CAPITOLO_OLD = 21;
  public static int FLD_VALORCOMUMOV_ARTICOLO = 22;
  public static int FLD_VALORCOMUMOV_ARTICOLO_OLD = 23;
  public static int FLD_VALORCOMUMOV_FINANZIAMENTO = 24;
  public static int FLD_VALORCOMUMOV_OPERA = 25;
  public static int FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA = 26;
  public static int FLD_VALORCOMUMOV_BENEFICIARIO = 27;
  public static int FLD_VALORCOMUMOV_NUM_QUIETANZA = 28;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI643 = 886;
  public static int FLD_PARAMETRI643_PARAFILDAIMP = 0;
  public static int FLD_PARAMETRI643_PARABLOBINSE = 1;
  public static int FLD_PARAMETRI643_PARAPERCFILE = 2;
  public static int FLD_PARAMETRI643_PARAMGRUPPO = 3;
  public static int FLD_PARAMETRI643_PARADESCGRUP = 4;
  public static int FLD_PARAMETRI643_PARATIPOMOVI = 5;
  public static int FLD_PARAMETRI643_PARAMFASE = 6;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI6 = 887;
  public static int FLD_FILTRI6_ROWNAMNUMDAL = 0;
  public static int FLD_FILTRI6_ROWNAMENUMAL = 1;
  public static int FLD_FILTRI6_ROWNAMDATDAL = 2;
  public static int FLD_FILTRI6_ROWNAMEDATAL = 3;
  public static int FLD_FILTRI6_ROWNAMNUMLIQ = 4;
  public static int FLD_FILTRI6_ROWNAMANNLIQ = 5;
  public static int FLD_FILTRI6_ROWNAMEMANDA = 6;
  public static int FLD_FILTRI6_ROWNAMEESERC = 7;
  public static int FLD_FILTRI6_ROWNAMAPDAES = 8;
  public static int FLD_FILTRI6_RONANOININFL = 9;

  // Definition of table: Parametri Pagamenti
  //
  public static int TBL_PARAMEPAGAM1 = 888;
  public static int FLD_PARAMEPAGAM1_NUMERO_MAND = 0;
  public static int FLD_PARAMEPAGAM1_ANNO_MAND = 1;
  public static int FLD_PARAMEPAGAM1_D_DATA_MAND = 2;
  public static int FLD_PARAMEPAGAM1_IMPORTO = 3;
  public static int FLD_PARAMEPAGAM1_ROWNAMEINFO = 4;

  // Definition of table: Parametri Nuovi Pagamenti
  //
  public static int TBL_PARANUOVPAGA = 889;
  public static int FLD_PARANUOVPAGA_NUMERO_MAND = 0;
  public static int FLD_PARANUOVPAGA_ANNO_MAND = 1;
  public static int FLD_PARANUOVPAGA_IMPORTO = 2;

  // Definition of table: Parametri Pagamenti
  //
  public static int TBL_PARAMEPAGAME = 890;
  public static int FLD_PARAMEPAGAME_ROWNAMIDFLBT = 0;
  public static int FLD_PARAMEPAGAME_ROWNAMDATDAL = 1;
  public static int FLD_PARAMEPAGAME_ROWNAMEDATAL = 2;

  // Definition of table: Old Values
  //
  public static int TBL_OLDVALUES2 = 891;
  public static int FLD_OLDVALUES2_IMPORTO = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM52 = 892;
  public static int FLD_PARAM52_ROWNAMANNMAN = 0;
  public static int FLD_PARAM52_ROWNAMNUMMAN = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM53 = 893;
  public static int FLD_PARAM53_ROWNAMANNMAN = 0;
  public static int FLD_PARAM53_ROWNAMNUMMAN = 1;
  public static int FLD_PARAM53_ROWNAMDATMAN = 2;
  public static int FLD_PARAM53_IMPORTO = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI143 = 894;
  public static int FLD_PARAMETRI143_PARADATAEMIS = 0;
  public static int FLD_PARAMETRI143_PARAMSCA = 1;
  public static int FLD_PARAMETRI143_PARAMSCCG = 2;
  public static int FLD_PARAMETRI143_PARAMSCE = 3;
  public static int FLD_PARAMETRI143_PARAMUFFICIO = 4;
  public static int FLD_PARAMETRI143_PARATIPOSCAD = 5;
  public static int FLD_PARAMETRI143_PARAMSCCTE = 6;
  public static int FLD_PARAMETRI143_PARSOLCONCAS = 7;
  public static int FLD_PARAMETRI143_PARAMANDACOP = 8;
  public static int FLD_PARAMETRI143_PARSOLCOQUSC = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI144 = 895;
  public static int FLD_PARAMETRI144_PARAMUFFICIO = 0;
  public static int FLD_PARAMETRI144_PARADETTLIQU = 1;

  // Definition of table: Elenco Liquidazioni Cgu
  //
  public static int TBL_ELENCLIQUCGU = 896;
  public static int FLD_ELENCLIQUCGU_ELENLIQULIQU = 0;
  public static int FLD_ELENCLIQUCGU_ELENLIQUBENE = 1;
  public static int FLD_ELENCLIQUCGU_ELENLIQUIMPO = 2;
  public static int FLD_ELENCLIQUCGU_ELENLIQUDESC = 3;
  public static int FLD_ELENCLIQUCGU_ELELIQSTACGU = 4;
  public static int FLD_ELENCLIQUCGU_ELELIQANNLIQ = 5;
  public static int FLD_ELENCLIQUCGU_ELELIQNUMLIQ = 6;

  // Definition of table: Elenco Equitalia
  //
  public static int TBL_ELENCOEQUITA = 897;
  public static int FLD_ELENCOEQUITA_ELENLIQULIQU = 0;
  public static int FLD_ELENCOEQUITA_ELENLIQUBENE = 1;
  public static int FLD_ELENCOEQUITA_ELENLIQUIMPO = 2;
  public static int FLD_ELENCOEQUITA_ELENLIQUDESC = 3;
  public static int FLD_ELENCOEQUITA_ELELIQANNLIQ = 4;
  public static int FLD_ELENCOEQUITA_ELELIQNUMLIQ = 5;

  // Definition of table: Elenco Liquidazioni CTE
  //
  public static int TBL_ELENCLIQUCTE = 898;
  public static int FLD_ELENCLIQUCTE_ELENLIQULIQU = 0;
  public static int FLD_ELENCLIQUCTE_ELENLIQUBENE = 1;
  public static int FLD_ELENCLIQUCTE_ELENLIQUIMPO = 2;
  public static int FLD_ELENCLIQUCTE_ELENLIQUDESC = 3;
  public static int FLD_ELENCLIQUCTE_ELELIQSTACTE = 4;
  public static int FLD_ELENCLIQUCTE_ELELIQANNLIQ = 5;
  public static int FLD_ELENCLIQUCTE_ELELIQNUMLIQ = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI342 = 899;
  public static int FLD_PARAMETRI342_ROWNAMDAMADA = 0;
  public static int FLD_PARAMETRI342_ROWNAMDAMAAL = 1;
  public static int FLD_PARAMETRI342_ROWNAMNUMADA = 2;
  public static int FLD_PARAMETRI342_ROWNAMNUMAAL = 3;
  public static int FLD_PARAMETRI342_ROWNAMENUMER = 4;
  public static int FLD_PARAMETRI342_ROWNAMEDATA = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI290 = 900;
  public static int FLD_PARAMETRI290_ROWNAMDALIDA = 0;
  public static int FLD_PARAMETRI290_ROWNAMDALIAL = 1;
  public static int FLD_PARAMETRI290_ROWNAMNULIDA = 2;
  public static int FLD_PARAMETRI290_ROWNAMNULIAL = 3;
  public static int FLD_PARAMETRI290_ROWNAMSCADAL = 4;
  public static int FLD_PARAMETRI290_ROWNAMESCAAL = 5;
  public static int FLD_PARAMETRI290_ROWNAMTIPSCA = 6;
  public static int FLD_PARAMETRI290_RONASOLINODF = 7;
  public static int FLD_PARAMETRI290_RONASOGIINEM = 8;
  public static int FLD_PARAMETRI290_ROWNAMEORDIN = 9;
  public static int FLD_PARAMETRI290_ROWNAMEUFFIC = 10;
  public static int FLD_PARAMETRI290_ROWNAMANNDIS = 11;
  public static int FLD_PARAMETRI290_ROWNAMNUMDIS = 12;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAMEN5 = 901;
  public static int FLD_FINANZIAMEN5_FINFINANZIAM = 0;
  public static int FLD_FINANZIAMEN5_FINIMPORTO = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI263 = 902;
  public static int FLD_PARAMETRI263_PARAMCASSA = 0;
  public static int FLD_PARAMETRI263_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI263_PARADATARITE = 2;
  public static int FLD_PARAMETRI263_PARSOLSTDICO = 3;
  public static int FLD_PARAMETRI263_PARAMSTART = 4;
  public static int FLD_PARAMETRI263_PARATIPOSTAM = 5;
  public static int FLD_PARAMETRI263_PARATIPOELAB = 6;
  public static int FLD_PARAMETRI263_PARACODIBENE = 7;
  public static int FLD_PARAMETRI263_PARAMUFFICIO = 8;
  public static int FLD_PARAMETRI263_PARADATAAVVI = 9;
  public static int FLD_PARAMETRI263_PARAMMANDDAL = 10;
  public static int FLD_PARAMETRI263_PARAMMANDAAL = 11;
  public static int FLD_PARAMETRI263_PARANUMEDIST = 12;
  public static int FLD_PARAMETRI263_PARADATADIST = 13;
  public static int FLD_PARAMETRI263_PARAMPERSONA = 14;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAMP2 = 903;
  public static int FLD_PARAMESTAMP2_STAMPATESTO1 = 0;
  public static int FLD_PARAMESTAMP2_STAMGRASTES1 = 1;
  public static int FLD_PARAMESTAMP2_STAMCORSTES1 = 2;
  public static int FLD_PARAMESTAMP2_STAMSOTTTES1 = 3;
  public static int FLD_PARAMESTAMP2_STAMPAFONT1 = 4;
  public static int FLD_PARAMESTAMP2_STAMPATESTO2 = 5;
  public static int FLD_PARAMESTAMP2_STAMGRASTES2 = 6;
  public static int FLD_PARAMESTAMP2_STAMCORSTES2 = 7;
  public static int FLD_PARAMESTAMP2_STAMSOTTTES2 = 8;
  public static int FLD_PARAMESTAMP2_STAMPAFONT2 = 9;
  public static int FLD_PARAMESTAMP2_STAMPATESTO3 = 10;
  public static int FLD_PARAMESTAMP2_STAMGRASTES3 = 11;
  public static int FLD_PARAMESTAMP2_STAMCORSTES3 = 12;
  public static int FLD_PARAMESTAMP2_STAMSOTTTES3 = 13;
  public static int FLD_PARAMESTAMP2_STAMPAFIRMA1 = 14;
  public static int FLD_PARAMESTAMP2_STAMPAFIRMA2 = 15;
  public static int FLD_PARAMESTAMP2_STAMPAFONT3 = 16;

  // Definition of table: Parametri Stampa Ancona
  //
  public static int TBL_PARASTAMANCO = 904;
  public static int FLD_PARASTAMANCO_STAMPATESTO1 = 0;
  public static int FLD_PARASTAMANCO_STAMGRASTES1 = 1;
  public static int FLD_PARASTAMANCO_STAMCORSTES1 = 2;
  public static int FLD_PARASTAMANCO_STAMSOTTTES1 = 3;
  public static int FLD_PARASTAMANCO_STAMPAFONT1 = 4;
  public static int FLD_PARASTAMANCO_STAMPATESTO2 = 5;
  public static int FLD_PARASTAMANCO_STAMGRASTES2 = 6;
  public static int FLD_PARASTAMANCO_STAMCORSTES2 = 7;
  public static int FLD_PARASTAMANCO_STAMSOTTTES2 = 8;
  public static int FLD_PARASTAMANCO_STAMPAFONT2 = 9;
  public static int FLD_PARASTAMANCO_STAMPATESTO3 = 10;
  public static int FLD_PARASTAMANCO_STAMGRASTES3 = 11;
  public static int FLD_PARASTAMANCO_STAMCORSTES3 = 12;
  public static int FLD_PARASTAMANCO_STAMSOTTTES3 = 13;
  public static int FLD_PARASTAMANCO_STAMPAFIRMA1 = 14;
  public static int FLD_PARASTAMANCO_STAMPAFIRMA2 = 15;
  public static int FLD_PARASTAMANCO_STAMPAFONT3 = 16;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM23 = 905;
  public static int FLD_PARAMESTAM23_STAMPATESTO1 = 0;
  public static int FLD_PARAMESTAM23_STAMGRASTES1 = 1;
  public static int FLD_PARAMESTAM23_STAMCORSTES1 = 2;
  public static int FLD_PARAMESTAM23_STAMSOTTTES1 = 3;
  public static int FLD_PARAMESTAM23_STAMPAFONT1 = 4;
  public static int FLD_PARAMESTAM23_STAMPATESTO2 = 5;
  public static int FLD_PARAMESTAM23_STAMGRASTES2 = 6;
  public static int FLD_PARAMESTAM23_STAMCORSTES2 = 7;
  public static int FLD_PARAMESTAM23_STAMSOTTTES2 = 8;
  public static int FLD_PARAMESTAM23_STAMPAFONT2 = 9;
  public static int FLD_PARAMESTAM23_STAMPATESTO3 = 10;
  public static int FLD_PARAMESTAM23_STAMGRASTES3 = 11;
  public static int FLD_PARAMESTAM23_STAMCORSTES3 = 12;
  public static int FLD_PARAMESTAM23_STAMSOTTTES3 = 13;
  public static int FLD_PARAMESTAM23_STAMPAFIRMA1 = 14;
  public static int FLD_PARAMESTAM23_STAMPAFIRMA2 = 15;
  public static int FLD_PARAMESTAM23_STAMPAFONT3 = 16;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAMPA = 906;
  public static int FLD_PARAMESTAMPA_STAMPATESTO1 = 0;
  public static int FLD_PARAMESTAMPA_STAMGRASTES1 = 1;
  public static int FLD_PARAMESTAMPA_STAMCORSTES1 = 2;
  public static int FLD_PARAMESTAMPA_STAMSOTTTES1 = 3;
  public static int FLD_PARAMESTAMPA_STAMPAFONT1 = 4;
  public static int FLD_PARAMESTAMPA_STAMPATESTO2 = 5;
  public static int FLD_PARAMESTAMPA_STAMGRASTES2 = 6;
  public static int FLD_PARAMESTAMPA_STAMCORSTES2 = 7;
  public static int FLD_PARAMESTAMPA_STAMSOTTTES2 = 8;
  public static int FLD_PARAMESTAMPA_STAMPAFONT2 = 9;
  public static int FLD_PARAMESTAMPA_STAMPATESTO3 = 10;
  public static int FLD_PARAMESTAMPA_STAMGRASTES3 = 11;
  public static int FLD_PARAMESTAMPA_STAMCORSTES3 = 12;
  public static int FLD_PARAMESTAMPA_STAMSOTTTES3 = 13;
  public static int FLD_PARAMESTAMPA_STAMPAFIRMA1 = 14;
  public static int FLD_PARAMESTAMPA_STAMPAFIRMA2 = 15;
  public static int FLD_PARAMESTAMPA_STAMPAFONT3 = 16;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI142 = 907;
  public static int FLD_PARAMETRI142_PARANUMMANDA = 0;
  public static int FLD_PARAMETRI142_PARANUMEMANA = 1;
  public static int FLD_PARAMETRI142_PARDATMANDAL = 2;
  public static int FLD_PARAMETRI142_PARADATMANAL = 3;
  public static int FLD_PARAMETRI142_PARDATPAGDAL = 4;
  public static int FLD_PARAMETRI142_PARADATPAGAL = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI148 = 908;
  public static int FLD_PARAMETRI148_PARNUMMANDAL = 0;
  public static int FLD_PARAMETRI148_PARANUMMANAL = 1;
  public static int FLD_PARAMETRI148_PARAMEMESSAL = 2;
  public static int FLD_PARAMETRI148_PARADATAPAGA = 3;
  public static int FLD_PARAMETRI148_PARANUMEPAGA = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI151 = 909;
  public static int FLD_PARAMETRI151_PARNUMMANDAL = 0;
  public static int FLD_PARAMETRI151_PARANUMMANAL = 1;
  public static int FLD_PARAMETRI151_PARANUMEIMPE = 2;
  public static int FLD_PARAMETRI151_PARAANNOIMPE = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI153 = 910;
  public static int FLD_PARAMETRI153_PARNUMMANDAL = 0;
  public static int FLD_PARAMETRI153_PARANUMMANAL = 1;
  public static int FLD_PARAMETRI153_PARNUMSUBIMP = 2;
  public static int FLD_PARAMETRI153_PARANNSUBIMP = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI155 = 911;
  public static int FLD_PARAMETRI155_PARADATDIRIE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI141 = 912;
  public static int FLD_PARAMETRI141_PARADISGAEME = 0;
  public static int FLD_PARAMETRI141_PARANUOVDIST = 1;
  public static int FLD_PARAMETRI141_PARADISTNUME = 2;
  public static int FLD_PARAMETRI141_PARDATDISNUM = 3;
  public static int FLD_PARAMETRI141_PARNUMMANDAL = 4;
  public static int FLD_PARAMETRI141_PARANUMMANAL = 5;
  public static int FLD_PARAMETRI141_PARADATADIST = 6;
  public static int FLD_PARAMETRI141_PARAMDANUMER = 7;
  public static int FLD_PARAMETRI141_PARAMUFFICIO = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI174 = 913;
  public static int FLD_PARAMETRI174_ROWNAMEANNO = 0;
  public static int FLD_PARAMETRI174_ROWNAMEDATDA = 1;
  public static int FLD_PARAMETRI174_ROWNAMEDATAA = 2;
  public static int FLD_PARAMETRI174_ROWNAMEDETTA = 3;
  public static int FLD_PARAMETRI174_ROWNAMEVARIA = 4;
  public static int FLD_PARAMETRI174_ROWNAMECAP = 5;
  public static int FLD_PARAMETRI174_ROWNAMEART = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI176 = 914;
  public static int FLD_PARAMETRI176_ROWNAMEANNO = 0;
  public static int FLD_PARAMETRI176_ROWNAMEDATDA = 1;
  public static int FLD_PARAMETRI176_ROWNAMEDATAA = 2;
  public static int FLD_PARAMETRI176_ROWNAMETITOL = 3;
  public static int FLD_PARAMETRI176_ROWNAMEORDIN = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI429 = 915;
  public static int FLD_PARAMETRI429_ROWNAMEANNO = 0;
  public static int FLD_PARAMETRI429_ROWNAMEDATDA = 1;
  public static int FLD_PARAMETRI429_ROWNAMEDATAA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI178 = 916;
  public static int FLD_PARAMETRI178_PARACODIBENE = 0;
  public static int FLD_PARAMETRI178_PARAMCASSA = 1;
  public static int FLD_PARAMETRI178_PARAMESERCIZ = 2;
  public static int FLD_PARAMETRI178_PARPERINCDAL = 3;
  public static int FLD_PARAMETRI178_PARAPERINCAL = 4;
  public static int FLD_PARAMETRI178_PARADATARITE = 5;
  public static int FLD_PARAMETRI178_PARDATMANDAL = 6;
  public static int FLD_PARAMETRI178_PARADATMANAL = 7;
  public static int FLD_PARAMETRI178_PARAMDETTAGL = 8;
  public static int FLD_PARAMETRI178_PARAMTIPO = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI181 = 917;
  public static int FLD_PARAMETRI181_ROWNAMEEMEAL = 0;
  public static int FLD_PARAMETRI181_ROWNAMNOPAAL = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI182 = 918;
  public static int FLD_PARAMETRI182_ROWNAMMANDAL = 0;
  public static int FLD_PARAMETRI182_ROWNAMEMANAL = 1;
  public static int FLD_PARAMETRI182_ROWNAMEUFFIC = 2;
  public static int FLD_PARAMETRI182_ROWNAMECAMBI = 3;
  public static int FLD_PARAMETRI182_ROWNAMEPROPO = 4;
  public static int FLD_PARAMETRI182_ROWNAMESUBIM = 5;
  public static int FLD_PARAMETRI182_ROWNAMERITEN = 6;
  public static int FLD_PARAMETRI182_ROWNAMECAUSA = 7;
  public static int FLD_PARAMETRI182_ROWNAMEMODUL = 8;
  public static int FLD_PARAMETRI182_ROWNAMECREDI = 9;
  public static int FLD_PARAMETRI182_ROWNAMENOTE = 10;
  public static int FLD_PARAMETRI182_ROWNAMDATSIO = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI184 = 919;
  public static int FLD_PARAMETRI184_ROWNAMEANNO = 0;
  public static int FLD_PARAMETRI184_ROWNAMEDATDA = 1;
  public static int FLD_PARAMETRI184_ROWNAMEDATAA = 2;
  public static int FLD_PARAMETRI184_ROWNAMEDETTA = 3;
  public static int FLD_PARAMETRI184_ROWNAMEVARIA = 4;

  // Definition of table: Parametri Trasmissione Mandati A Tesoreria
  //
  public static int TBL_PARTRAMANATE = 920;
  public static int FLD_PARTRAMANATE_ROWNAMEDAL = 0;
  public static int FLD_PARTRAMANATE_ROWNAMEAL = 1;
  public static int FLD_PARTRAMANATE_ROWNAMEMANDA = 2;
  public static int FLD_PARTRAMANATE_ROWNAMOLDTIP = 3;
  public static int FLD_PARTRAMANATE_ROWNAMDISNUM = 4;
  public static int FLD_PARTRAMANATE_ROWNAMDATRIS = 5;
  public static int FLD_PARTRAMANATE_ROWNAMEDALD = 6;
  public static int FLD_PARTRAMANATE_ROWNAMEALD = 7;
  public static int FLD_PARTRAMANATE_ROWNAMETIPO = 8;
  public static int FLD_PARTRAMANATE_ROWNAMEUFFIC = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI301 = 921;
  public static int FLD_PARAMETRI301_ROWNAMDALIDA = 0;
  public static int FLD_PARAMETRI301_ROWNAMDALIAL = 1;
  public static int FLD_PARAMETRI301_ROWNAMNULIDA = 2;
  public static int FLD_PARAMETRI301_ROWNAMNULIAL = 3;
  public static int FLD_PARAMETRI301_ROWNAMSCADAL = 4;
  public static int FLD_PARAMETRI301_ROWNAMESCAAL = 5;
  public static int FLD_PARAMETRI301_RONASOLINODF = 6;
  public static int FLD_PARAMETRI301_ROWNAMEORDIN = 7;
  public static int FLD_PARAMETRI301_ROWNAMENUMER = 8;
  public static int FLD_PARAMETRI301_ROWNAMEDATA = 9;
  public static int FLD_PARAMETRI301_ROWNAMNUMDIS = 10;
  public static int FLD_PARAMETRI301_ROWNAMDATDIS = 11;
  public static int FLD_PARAMETRI301_ROWNAMECOPER = 12;

  // Definition of table: Finanziamenti
  //
  public static int TBL_FINANZIAME12 = 922;
  public static int FLD_FINANZIAME12_FINFINANZIAM = 0;
  public static int FLD_FINANZIAME12_FINIMPORTO = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI168 = 923;
  public static int FLD_PARAMETRI168_PARAMCASSA = 0;
  public static int FLD_PARAMETRI168_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI168_PARAMINIZIO = 2;
  public static int FLD_PARAMETRI168_PARAMFINE = 3;
  public static int FLD_PARAMETRI168_PARAMDTARITE = 4;
  public static int FLD_PARAMETRI168_PARAMDAL = 5;
  public static int FLD_PARAMETRI168_PARAMAL = 6;
  public static int FLD_PARAMETRI168_PARACODIBENE = 7;
  public static int FLD_PARAMETRI168_PARADATAELAB = 8;
  public static int FLD_PARAMETRI168_PARAMUFFICIO = 9;
  public static int FLD_PARAMETRI168_PARAMSUBIMPE = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI170 = 924;
  public static int FLD_PARAMETRI170_PARAMCASSA = 0;
  public static int FLD_PARAMETRI170_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI170_PARAMINIZIO = 2;
  public static int FLD_PARAMETRI170_PARAMFINE = 3;
  public static int FLD_PARAMETRI170_PARADATAELAB = 4;
  public static int FLD_PARAMETRI170_PARAMDTARITE = 5;
  public static int FLD_PARAMETRI170_PARAMDAL = 6;
  public static int FLD_PARAMETRI170_PARAMAL = 7;
  public static int FLD_PARAMETRI170_PARAMUFFICIO = 8;
  public static int FLD_PARAMETRI170_PARAMSUBIMPE = 9;
  public static int FLD_PARAMETRI170_PARAMREGCOM = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI159 = 925;
  public static int FLD_PARAMETRI159_PARAMDA = 0;
  public static int FLD_PARAMETRI159_PARAMA = 1;
  public static int FLD_PARAMETRI159_PARADATAELAB = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI161 = 926;
  public static int FLD_PARAMETRI161_PARAMDA = 0;
  public static int FLD_PARAMETRI161_PARAMA = 1;
  public static int FLD_PARAMETRI161_PARAMADDIZIO = 2;
  public static int FLD_PARAMETRI161_PARADATAELAB = 3;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI256 = 927;
  public static int FLD_PARAMETRI256_PARAMCASSA = 0;
  public static int FLD_PARAMETRI256_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI256_PARADATARITE = 2;
  public static int FLD_PARAMETRI256_PARAMPERENTI = 3;
  public static int FLD_PARAMETRI256_PARAMSTART = 4;
  public static int FLD_PARAMETRI256_PARATIPOELAB = 5;
  public static int FLD_PARAMETRI256_PARAMMANDDAL = 6;
  public static int FLD_PARAMETRI256_PARAMMANDAAL = 7;
  public static int FLD_PARAMETRI256_PARACODIBENE = 8;
  public static int FLD_PARAMETRI256_PARADATACERT = 9;
  public static int FLD_PARAMETRI256_PARANUMEPROT = 10;
  public static int FLD_PARAMETRI256_PARAMCODICE = 11;
  public static int FLD_PARAMETRI256_PARAMIVA = 12;
  public static int FLD_PARAMETRI256_PARARITEPREV = 13;
  public static int FLD_PARAMETRI256_PARAMINAIL = 14;
  public static int FLD_PARAMETRI256_PARRITPRCAEN = 15;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM26 = 928;
  public static int FLD_PARAMESTAM26_NOMOGGFIRRI1 = 0;
  public static int FLD_PARAMESTAM26_NOMOGGFIRRI2 = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI575 = 929;
  public static int FLD_PARAMETRI575_PARAMQUADRO = 0;
  public static int FLD_PARAMETRI575_PARAIMPOTRON = 1;

  // Definition of table: Parametri Filtro
  //
  public static int TBL_PARAMEFILTRO = 930;
  public static int FLD_PARAMEFILTRO_NOMEOGGEMAND = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI268 = 931;
  public static int FLD_PARAMETRI268_ROWNAMEQUADR = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI538 = 932;
  public static int FLD_PARAMETRI538_ROWNAMETIPO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI235 = 933;
  public static int FLD_PARAMETRI235_PARAMCASSA = 0;
  public static int FLD_PARAMETRI235_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI235_PARAMINIZIO = 2;
  public static int FLD_PARAMETRI235_PARAMFINE = 3;
  public static int FLD_PARAMETRI235_PARADATAELAB = 4;
  public static int FLD_PARAMETRI235_PARAMDTARITE = 5;
  public static int FLD_PARAMETRI235_PARAMDAL = 6;
  public static int FLD_PARAMETRI235_PARAMAL = 7;
  public static int FLD_PARAMETRI235_PARAMUFFICIO = 8;
  public static int FLD_PARAMETRI235_PARAMSUBIMPE = 9;
  public static int FLD_PARAMETRI235_PARAMTOTIMPS = 10;
  public static int FLD_PARAMETRI235_PARAMSUDDIVI = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI172 = 934;
  public static int FLD_PARAMETRI172_PARAMCASSA = 0;
  public static int FLD_PARAMETRI172_PARAMESERCIZ = 1;
  public static int FLD_PARAMETRI172_PARAMINIZIO = 2;
  public static int FLD_PARAMETRI172_PARAMFINE = 3;
  public static int FLD_PARAMETRI172_PARADATAELAB = 4;
  public static int FLD_PARAMETRI172_PARAMDTARITE = 5;
  public static int FLD_PARAMETRI172_PARAMDAL = 6;
  public static int FLD_PARAMETRI172_PARAMAL = 7;
  public static int FLD_PARAMETRI172_PARAMUFFICIO = 8;
  public static int FLD_PARAMETRI172_PARAMSUBIMPE = 9;
  public static int FLD_PARAMETRI172_PARAMTOTIMPS = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI164 = 935;
  public static int FLD_PARAMETRI164_PARAMCASSA = 0;
  public static int FLD_PARAMETRI164_PARAMINIZIO = 1;
  public static int FLD_PARAMETRI164_PARAMFINE = 2;
  public static int FLD_PARAMETRI164_PARADATAELAB = 3;
  public static int FLD_PARAMETRI164_PARAMDTARITE = 4;
  public static int FLD_PARAMETRI164_PARAMDAL = 5;
  public static int FLD_PARAMETRI164_PARAMAL = 6;
  public static int FLD_PARAMETRI164_PARAMUFFICIO = 7;
  public static int FLD_PARAMETRI164_PARAMSUBIMPE = 8;
  public static int FLD_PARAMETRI164_PARAMCODICE = 9;

  // Definition of table: Parametri Stampa
  //
  public static int TBL_PARAMESTAM28 = 936;
  public static int FLD_PARAMESTAM28_NOMOGGFIRRI1 = 0;
  public static int FLD_PARAMESTAM28_NOMOGGFIRRI2 = 1;
  public static int FLD_PARAMESTAM28_NOMEOGGETIVA = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS75 = 937;
  public static int FLD_PARS75_NOMEOGGETDAL = 0;
  public static int FLD_PARS75_NOMEOGGETTAL = 1;
  public static int FLD_PARS75_NOMEOGGEMESE = 2;
  public static int FLD_PARS75_SEDE_DEL = 3;
  public static int FLD_PARS75_NUMERO_DEL = 4;
  public static int FLD_PARS75_ANNO_DEL = 5;
  public static int FLD_PARS75_UNITA_PROPONENTE = 6;
  public static int FLD_PARS75_NUMERO_PROPOSTA = 7;
  public static int FLD_PARS75_ANNO_PROPOSTA = 8;
  public static int FLD_PARS75_NOMEOGGEBENE = 9;
  public static int FLD_PARS75_UFFICIO = 10;
  public static int FLD_PARS75_CAUSALE = 11;
  public static int FLD_PARS75_NOMEOGGESPES = 12;
  public static int FLD_PARS75_NOMEOGGECOMM = 13;
  public static int FLD_PARS75_NOMEOGGEALLE = 14;
  public static int FLD_PARS75_NOMOGGINFTES = 15;
  public static int FLD_PARS75_NOMEOGGESCAD = 16;
  public static int FLD_PARS75_NOMEOGGEQUIE = 17;
  public static int FLD_PARS75_NOMEOGGEBOLL = 18;
  public static int FLD_PARS75_NOMOGGNUMCON = 19;
  public static int FLD_PARS75_NOMOGGDATCON = 20;

  // Definition of table: Pars
  //
  public static int TBL_PARS30 = 938;
  public static int FLD_PARS30_SEDE_DEL = 0;
  public static int FLD_PARS30_NUMERO_DEL = 1;
  public static int FLD_PARS30_ANNO_DEL = 2;
  public static int FLD_PARS30_UNITA_PROPONENTE = 3;
  public static int FLD_PARS30_NUMERO_PROPOSTA = 4;
  public static int FLD_PARS30_ANNO_PROPOSTA = 5;
  public static int FLD_PARS30_UFFICIO = 6;
  public static int FLD_PARS30_CAUSALE = 7;
  public static int FLD_PARS30_NOMEOGGEDESC = 8;
  public static int FLD_PARS30_NOMEOGGESPES = 9;
  public static int FLD_PARS30_NOMEOGGECOMM = 10;
  public static int FLD_PARS30_NOMEOGGEALLE = 11;
  public static int FLD_PARS30_NOMOGGINFTES = 12;
  public static int FLD_PARS30_NOMEOGGESCAD = 13;
  public static int FLD_PARS30_NOMEOGGEDATA = 14;
  public static int FLD_PARS30_NOMEOGGECAU1 = 15;
  public static int FLD_PARS30_NOMEOGGEBOLL = 16;
  public static int FLD_PARS30_NOMEOGGEUFF1 = 17;
  public static int FLD_PARS30_NOEAVPMDSASC = 18;
  public static int FLD_PARS30_NOOGUNORPEBE = 19;
  public static int FLD_PARS30_NOMEOGGESPE1 = 20;
  public static int FLD_PARS30_NOMEOGGECOM1 = 21;
  public static int FLD_PARS30_NOMEOGGEALL1 = 22;
  public static int FLD_PARS30_NOMOGGINFTE1 = 23;
  public static int FLD_PARS30_NOMOGGTIPRIT = 24;
  public static int FLD_PARS30_NOMOGGDATEMI = 25;

  // Definition of table: Pars
  //
  public static int TBL_PARS79 = 939;
  public static int FLD_PARS79_NOMEOGGETDAL = 0;
  public static int FLD_PARS79_NOMEOGGETTAL = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI318 = 940;
  public static int FLD_PARAMETRI318_PARANCPROREG = 0;
  public static int FLD_PARAMETRI318_PARAENTRSPES = 1;
  public static int FLD_PARAMETRI318_PARAMTITOLO = 2;
  public static int FLD_PARAMETRI318_PARAMCATEGOR = 3;
  public static int FLD_PARAMETRI318_PARAMCODINTE = 4;
  public static int FLD_PARAMETRI318_PARAMCODTERZ = 5;
  public static int FLD_PARAMETRI318_PARAMBUONI = 6;
  public static int FLD_PARAMETRI318_PARAIMPOPROV = 7;
  public static int FLD_PARAMETRI318_PARATOTADETT = 8;
  public static int FLD_PARAMETRI318_PARAMRPPATTI = 9;
  public static int FLD_PARAMETRI318_PARANUMEPROV = 10;
  public static int FLD_PARAMETRI318_PARADATAPROV = 11;
  public static int FLD_PARAMETRI318_PARAVOCEECON = 12;

  // Definition of table: Parametri Flusso
  //
  public static int TBL_PARAMEFLUSS3 = 941;
  public static int FLD_PARAMEFLUSS3_IDFLUSSOBT = 0;

  // Definition of table: Dati Contabili Old
  //
  public static int TBL_DATICONTAOL1 = 942;
  public static int FLD_DATICONTAOL1_CAPITOLOOLD = 0;
  public static int FLD_DATICONTAOL1_ARTICOLOOLD = 1;
  public static int FLD_DATICONTAOL1_ANNOIMPOLD = 2;
  public static int FLD_DATICONTAOL1_NUMEROIMPOLD = 3;
  public static int FLD_DATICONTAOL1_ANNSUBIMPOLD = 4;
  public static int FLD_DATICONTAOL1_NUMSUBIMPOLD = 5;
  public static int FLD_DATICONTAOL1_ANNODOCOLD = 6;
  public static int FLD_DATICONTAOL1_NUMERODOCOLD = 7;
  public static int FLD_DATICONTAOL1_FINANZIAMOLD = 8;
  public static int FLD_DATICONTAOL1_BOLLOOLD = 9;
  public static int FLD_DATICONTAOL1_IMPORTOOLD = 10;
  public static int FLD_DATICONTAOL1_VOCEECONOOLD = 11;

  // Definition of table: Provvisori Rollback
  //
  public static int TBL_PROVVIROLLB1 = 943;
  public static int FLD_PROVVIROLLB1_ESERCIZIO = 0;
  public static int FLD_PROVVIROLLB1_PROGRESSIVO = 1;
  public static int FLD_PROVVIROLLB1_DATA = 2;
  public static int FLD_PROVVIROLLB1_NUMERO = 3;
  public static int FLD_PROVVIROLLB1_IMPORTO = 4;
  public static int FLD_PROVVIROLLB1_DES_BEN = 5;
  public static int FLD_PROVVIROLLB1_DESCRIZIONE = 6;
  public static int FLD_PROVVIROLLB1_UTENTE_INSERIMENTO = 7;
  public static int FLD_PROVVIROLLB1_DATA_INSERIMENTO = 8;
  public static int FLD_PROVVIROLLB1_UTENTE_ULTIMO_AGG = 9;
  public static int FLD_PROVVIROLLB1_DATA_ULTIMO_AGG = 10;
  public static int FLD_PROVVIROLLB1_PROGR_UNITA_ORGANIZZATIVA = 11;
  public static int FLD_PROVVIROLLB1_EMISSIONE = 12;

  // Definition of table: Valori Cap
  //
  public static int TBL_VALORICAP9 = 944;
  public static int FLD_VALORICAP9_NOMOGGLIV4CA = 0;

  // Definition of table: Man Prov Dettagli
  //
  public static int TBL_MANPROVDETTA = 945;
  public static int FLD_MANPROVDETTA_ESERCIZIO = 0;
  public static int FLD_MANPROVDETTA_PROGR_MAN_PROV = 1;
  public static int FLD_MANPROVDETTA_PROGRESSIVO = 2;
  public static int FLD_MANPROVDETTA_IMPORTO = 3;
  public static int FLD_MANPROVDETTA_S = 4;
  public static int FLD_MANPROVDETTA_CAPITOLO = 5;
  public static int FLD_MANPROVDETTA_ARTICOLO = 6;
  public static int FLD_MANPROVDETTA_ANNO_IMP = 7;
  public static int FLD_MANPROVDETTA_NUMERO_IMP = 8;
  public static int FLD_MANPROVDETTA_ANNO_SUBIMP = 9;
  public static int FLD_MANPROVDETTA_NUMERO_SUBIMP = 10;
  public static int FLD_MANPROVDETTA_IMDCONSVILIS = 11;
  public static int FLD_MANPROVDETTA_CONS_SVILUPPO = 12;
  public static int FLD_MANPROVDETTA_DESCRIZIONE = 13;
  public static int FLD_MANPROVDETTA_BENEFICIARIO = 14;
  public static int FLD_MANPROVDETTA_NUM_QUIETANZA = 15;
  public static int FLD_MANPROVDETTA_ANNO_DOC = 16;
  public static int FLD_MANPROVDETTA_NUMERO_DOC = 17;
  public static int FLD_MANPROVDETTA_TIPO_VINCOLO = 18;
  public static int FLD_MANPROVDETTA_BOLLO = 19;
  public static int FLD_MANPROVDETTA_VOCE_ECON = 20;
  public static int FLD_MANPROVDETTA_FATTORE = 21;
  public static int FLD_MANPROVDETTA_CENTRO = 22;
  public static int FLD_MANPROVDETTA_COMPETENZA_DAL = 23;
  public static int FLD_MANPROVDETTA_COMPETENZA_AL = 24;
  public static int FLD_MANPROVDETTA_PROGETTO_ID = 25;
  public static int FLD_MANPROVDETTA_ANNO_LIQ = 26;
  public static int FLD_MANPROVDETTA_NUMERO_LIQ = 27;
  public static int FLD_MANPROVDETTA_ANNO_PROG = 28;
  public static int FLD_MANPROVDETTA_NUMERO_PROG = 29;
  public static int FLD_MANPROVDETTA_FINANZIAMENTO = 30;
  public static int FLD_MANPROVDETTA_OPERA = 31;
  public static int FLD_MANPROVDETTA_UFFICIO = 32;
  public static int FLD_MANPROVDETTA_CODICE_GESTIONALE = 33;
  public static int FLD_MANPROVDETTA_UTENTE_INSERIMENTO = 34;
  public static int FLD_MANPROVDETTA_DATA_INSERIMENTO = 35;
  public static int FLD_MANPROVDETTA_UTENTE_ULTIMO_AGG = 36;
  public static int FLD_MANPROVDETTA_DATA_ULTIMO_AGG = 37;
  public static int FLD_MANPROVDETTA_IMDBSTATO = 38;
  public static int FLD_MANPROVDETTA_PROGR_UNITA_ORGANIZZATIVA = 39;
  public static int FLD_MANPROVDETTA_SCHEDA_OBIETTIVO_ID = 40;
  public static int FLD_MANPROVDETTA_COD_LIVELLO_5 = 41;
  public static int FLD_MANPROVDETTA_CODICE_COFOG = 42;
  public static int FLD_MANPROVDETTA_CODICE_EUROPEO = 43;
  public static int FLD_MANPROVDETTA_RAGIONE_SOCIALE = 44;
  public static int FLD_MANPROVDETTA_IMDRAGSOCOLD = 45;
  public static int FLD_MANPROVDETTA_CIG = 46;
  public static int FLD_MANPROVDETTA_MOTIVO_ESCLUSIONE_CIG = 47;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI403 = 946;
  public static int FLD_PARAMETRI403_PARAENTRSPES = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI204 = 947;
  public static int FLD_PARAMETRI204_ROWNAMDEDAI1 = 0;
  public static int FLD_PARAMETRI204_ROWNAMDEDAIM = 1;
  public static int FLD_PARAMETRI204_ROWNAMDESIMP = 2;
  public static int FLD_PARAMETRI204_ROWNAMEDELIB = 3;
  public static int FLD_PARAMETRI204_ROWNAMECAUSA = 4;
  public static int FLD_PARAMETRI204_ROWNAMEBOLLO = 5;
  public static int FLD_PARAMETRI204_ROWNAMDATEMI = 6;
  public static int FLD_PARAMETRI204_ROWNAMEUFFIC = 7;
  public static int FLD_PARAMETRI204_SEDE_DEL = 8;
  public static int FLD_PARAMETRI204_NUMERO_DEL = 9;
  public static int FLD_PARAMETRI204_ANNO_DEL = 10;

  // Definition of table: Emissione Ordinativi
  //
  public static int TBL_EMISSIORDIN4 = 948;
  public static int FLD_EMISSIORDIN4_ROWNAMECAPIT = 0;
  public static int FLD_EMISSIORDIN4_ROWNAMEARTIC = 1;
  public static int FLD_EMISSIORDIN4_ROWNAMNUMIMP = 2;
  public static int FLD_EMISSIORDIN4_ROWNAMANNIMP = 3;
  public static int FLD_EMISSIORDIN4_ROWNAMCODDEB = 4;
  public static int FLD_EMISSIORDIN4_ROWNAMEBOLLO = 5;
  public static int FLD_EMISSIORDIN4_ROWNAMEUFFIC = 6;
  public static int FLD_EMISSIORDIN4_ROWNAMCODLI6 = 7;
  public static int FLD_EMISSIORDIN4_ROWNAMCODEU1 = 8;
  public static int FLD_EMISSIORDIN4_ROWNAMCODLI5 = 9;
  public static int FLD_EMISSIORDIN4_ROWNAMCODEUR = 10;
  public static int FLD_EMISSIORDIN4_ROWNAMNUMQUI = 11;
  public static int FLD_EMISSIORDIN4_ROWNAMVOCECO = 12;
  public static int FLD_EMISSIORDIN4_ROWNAMECGE = 13;
  public static int FLD_EMISSIORDIN4_ROWNAMEDESCR = 14;
  public static int FLD_EMISSIORDIN4_ROWNAMNUMSUB = 15;
  public static int FLD_EMISSIORDIN4_ROWNAMANNSUB = 16;
  public static int FLD_EMISSIORDIN4_MOTIVO_ESCLUSIONE_CIG = 17;
  public static int FLD_EMISSIORDIN4_TIPO_VINCOLO = 18;
  public static int FLD_EMISSIORDIN4_CODICE_COFOG = 19;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO11 = 949;
  public static int FLD_PARAMETRIO11_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIO11_ARTICOLOOLD = 1;
  public static int FLD_PARAMETRIO11_NUMEROACCOLD = 2;
  public static int FLD_PARAMETRIO11_ANNOACCOLD = 3;
  public static int FLD_PARAMETRIO11_DEBITOREOLD = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI524 = 950;
  public static int FLD_PARAMETRI524_NOMOGGLIV4CA = 0;

  // Definition of table: Imdb Mandati Provvisori
  //
  public static int TBL_IMDBMANDPROV = 951;
  public static int FLD_IMDBMANDPROV_NOMEOGGETTOI = 0;
  public static int FLD_IMDBMANDPROV_NOMEOGGEESER = 1;
  public static int FLD_IMDBMANDPROV_NOMEOGGEPROG = 2;
  public static int FLD_IMDBMANDPROV_NOMOGGPRODET = 3;
  public static int FLD_IMDBMANDPROV_NOMEOGGEDATA = 4;
  public static int FLD_IMDBMANDPROV_NOMEOGGENUME = 5;
  public static int FLD_IMDBMANDPROV_NOMOGGDESBEN = 6;
  public static int FLD_IMDBMANDPROV_NOMEOGGEDESC = 7;
  public static int FLD_IMDBMANDPROV_NOMOGGIMPMAN = 8;
  public static int FLD_IMDBMANDPROV_NOMOGGIMDEOR = 9;
  public static int FLD_IMDBMANDPROV_NOMOGGIMDENE = 10;
  public static int FLD_IMDBMANDPROV_NOMOGGPRUNOR = 11;
  public static int FLD_IMDBMANDPROV_NOMOGGIDFLBT = 12;

  // Definition of table: Imdb Escludi Mandati Provvisori
  //
  public static int TBL_IMDESCMANPRO = 952;
  public static int FLD_IMDESCMANPRO_NOMEOGGEESER = 0;
  public static int FLD_IMDESCMANPRO_NOMEOGGEPROG = 1;
  public static int FLD_IMDESCMANPRO_NOMOGGPRODET = 2;

  // Definition of table: Pars
  //
  public static int TBL_PARS = 953;
  public static int FLD_PARS_NOMOGGPANNMA = 0;
  public static int FLD_PARS_NOMOGGPNUMMA = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI319 = 954;
  public static int FLD_PARAMETRI319_PARAMNUMEDAL = 0;
  public static int FLD_PARAMETRI319_PARAMNUMERAL = 1;
  public static int FLD_PARAMETRI319_PARAMDATADAL = 2;
  public static int FLD_PARAMETRI319_PARAMDATAAL = 3;
  public static int FLD_PARAMETRI319_PARAMCONTABI = 4;
  public static int FLD_PARAMETRI319_PARAMORDINAT = 5;
  public static int FLD_PARAMETRI319_PARNONININFL = 6;

  // Definition of table: Parametri Input
  //
  public static int TBL_PARAMETINPU1 = 955;
  public static int FLD_PARAMETINPU1_PARAMANNOORD = 0;
  public static int FLD_PARAMETINPU1_PARAMNUMEORD = 1;
  public static int FLD_PARAMETINPU1_PARAPRODAESP = 2;
  public static int FLD_PARAMETINPU1_PARAMANNOACC = 3;
  public static int FLD_PARAMETINPU1_PARAMNUMEACC = 4;
  public static int FLD_PARAMETINPU1_PARAMCAPITOL = 5;
  public static int FLD_PARAMETINPU1_PARAMARTICOL = 6;
  public static int FLD_PARAMETINPU1_PARAMRILECO = 7;

  // Definition of table: Parametri Voce Peg
  //
  public static int TBL_PARAMVOCEPE2 = 956;
  public static int FLD_PARAMVOCEPE2_PARVOCPEGTIT = 0;
  public static int FLD_PARAMVOCEPE2_PARVOCPECOIN = 1;
  public static int FLD_PARAMVOCEPE2_PARVOCPECOTE = 2;
  public static int FLD_PARAMVOCEPE2_PARVOCPEGCAT = 3;
  public static int FLD_PARAMVOCEPE2_PARVOPECOLI4 = 4;

  // Definition of table: Parametri Ordinativi Old
  //
  public static int TBL_PARAMORDIOL1 = 957;
  public static int FLD_PARAMORDIOL1_NUMEROORDOLD = 0;
  public static int FLD_PARAMORDIOL1_ANNOACCOLD = 1;
  public static int FLD_PARAMORDIOL1_NUMEROACCOLD = 2;
  public static int FLD_PARAMORDIOL1_VOCEECONOLD = 3;
  public static int FLD_PARAMORDIOL1_NUMERELENOLD = 4;
  public static int FLD_PARAMORDIOL1_NUMERODOCOLD = 5;
  public static int FLD_PARAMORDIOL1_ANNODOCOLD = 6;
  public static int FLD_PARAMORDIOL1_OLDANNOPROGR = 7;
  public static int FLD_PARAMORDIOL1_OLDNUMERPROG = 8;

  // Definition of table: Debitore
  //
  public static int TBL_DEBITORE3 = 958;
  public static int FLD_DEBITORE3_CODICEDEBITO = 0;
  public static int FLD_DEBITORE3_DEBITORE = 1;
  public static int FLD_DEBITORE3_DEBITOREOLD = 2;

  // Definition of table: Ord Rollback
  //
  public static int TBL_ORDROLLBACK1 = 959;
  public static int FLD_ORDROLLBACK1_CAPITOLO = 0;
  public static int FLD_ORDROLLBACK1_ARTICOLO = 1;
  public static int FLD_ORDROLLBACK1_ANNO_ACC = 2;
  public static int FLD_ORDROLLBACK1_NUMERO_ACC = 3;
  public static int FLD_ORDROLLBACK1_ANNO_ORD = 4;
  public static int FLD_ORDROLLBACK1_NUMERO_ORD = 5;
  public static int FLD_ORDROLLBACK1_TIPO_VINCOLO = 6;
  public static int FLD_ORDROLLBACK1_BOLLO = 7;
  public static int FLD_ORDROLLBACK1_ANNO_MAND_CO = 8;
  public static int FLD_ORDROLLBACK1_NUMERO_MAND_CO = 9;
  public static int FLD_ORDROLLBACK1_UFFICIO = 10;
  public static int FLD_ORDROLLBACK1_VOCE_ECON = 11;
  public static int FLD_ORDROLLBACK1_CODICE_FINANZ = 12;
  public static int FLD_ORDROLLBACK1_D_DATA_ORD = 13;
  public static int FLD_ORDROLLBACK1_ANNO_ELENCO = 14;
  public static int FLD_ORDROLLBACK1_NUMERO_ELENCO = 15;
  public static int FLD_ORDROLLBACK1_DATA_ELENCO = 16;
  public static int FLD_ORDROLLBACK1_E = 17;
  public static int FLD_ORDROLLBACK1_D_DATA_ELENCO = 18;
  public static int FLD_ORDROLLBACK1_INCASSATO = 19;
  public static int FLD_ORDROLLBACK1_IMPORTO = 20;
  public static int FLD_ORDROLLBACK1_ANNO_MAND_CO_INPS = 21;
  public static int FLD_ORDROLLBACK1_NUMERO_MAND_CO_INPS = 22;
  public static int FLD_ORDROLLBACK1_ANNO_MAND_CO_INAIL = 23;
  public static int FLD_ORDROLLBACK1_NUMERO_MAND_CO_INAIL = 24;
  public static int FLD_ORDROLLBACK1_ANNO_MAND_CO_ADD_REG = 25;
  public static int FLD_ORDROLLBACK1_NUMERO_MAND_CO_ADD_REG = 26;
  public static int FLD_ORDROLLBACK1_ANNO_MAND_CO_ADD_COM = 27;
  public static int FLD_ORDROLLBACK1_NUMERO_MAND_CO_ADD_COM = 28;
  public static int FLD_ORDROLLBACK1_UTENTE_INSERIMENTO = 29;
  public static int FLD_ORDROLLBACK1_DATA_INSERIMENTO = 30;
  public static int FLD_ORDROLLBACK1_UTENTE_ULTIMO_AGG = 31;
  public static int FLD_ORDROLLBACK1_DATA_ULTIMO_AGG = 32;
  public static int FLD_ORDROLLBACK1_IMPORTO_TOT_DETTAGLI = 33;

  // Definition of table: Importo
  //
  public static int TBL_IMPORTO3 = 960;
  public static int FLD_IMPORTO3_IMPORTO = 0;

  // Definition of table: PRE
  //
  public static int TBL_PRE = 961;
  public static int FLD_PRE_CAPITOLO = 0;
  public static int FLD_PRE_ARTICOLO = 1;
  public static int FLD_PRE_ANNO_PRE = 2;
  public static int FLD_PRE_NUMERO_PRE = 3;
  public static int FLD_PRE_ANNO_ACC = 4;
  public static int FLD_PRE_NUMERO_ACC = 5;
  public static int FLD_PRE_IMPORTO = 6;
  public static int FLD_PRE_IMPORTO_OLD = 7;
  public static int FLD_PRE_DESCRIZIONE = 8;
  public static int FLD_PRE_DEBITORE = 9;
  public static int FLD_PRE_DEBITORE_OLD = 10;
  public static int FLD_PRE_ANNO_DOC = 11;
  public static int FLD_PRE_ANNO_DOC_OLD = 12;
  public static int FLD_PRE_NUMERO_DOC = 13;
  public static int FLD_PRE_NUMERO_DOC_OLD = 14;
  public static int FLD_PRE_CAUSALE = 15;
  public static int FLD_PRE_BOLLO = 16;
  public static int FLD_PRE_ANNO_ORD = 17;
  public static int FLD_PRE_NUMERO_ORD = 18;
  public static int FLD_PRE_NUMERO_INC = 19;
  public static int FLD_PRE_DATA_INC = 20;
  public static int FLD_PRE_IMPORTO_INC = 21;
  public static int FLD_PRE_TIPO_VINCOLO = 22;
  public static int FLD_PRE_UFFICIO = 23;
  public static int FLD_PRE_DATA_ESTRATTO_CCP = 24;
  public static int FLD_PRE_DATA_CCP = 25;
  public static int FLD_PRE_VOCE_ECON = 26;
  public static int FLD_PRE_CODICE_FINANZ = 27;
  public static int FLD_PRE_CODICE_PTC = 28;
  public static int FLD_PRE_NUM_QUIETANZA = 29;
  public static int FLD_PRE_NUM_QUIETANZA_OLD = 30;
  public static int FLD_PRE_E = 31;
  public static int FLD_PRE_FAT_ANNO_PROG = 32;
  public static int FLD_PRE_FAT_NUMERO_PROG = 33;
  public static int FLD_PRE_D_DATA_REG = 34;
  public static int FLD_PRE_D_DATA_INC = 35;
  public static int FLD_PRE_D_DATA_ESTRATTO_CCP = 36;
  public static int FLD_PRE_D_DATA_CCP = 37;
  public static int FLD_PRE_NUMERO_CONTABILE = 38;
  public static int FLD_PRE_DATA_CONTABILE = 39;
  public static int FLD_PRE_PROGRESSIVO_TESO = 40;
  public static int FLD_PRE_CENTRO = 41;
  public static int FLD_PRE_FATTORE = 42;
  public static int FLD_PRE_COMPETENZA_DAL = 43;
  public static int FLD_PRE_COMPETENZA_AL = 44;
  public static int FLD_PRE_COD_IMP_ECO = 45;
  public static int FLD_PRE_PROGRESSIVO_CFA = 46;
  public static int FLD_PRE_ANNO_DISTINTA = 47;
  public static int FLD_PRE_NUMERO_DISTINTA = 48;
  public static int FLD_PRE_TIPO_DISTINTA = 49;
  public static int FLD_PRE_OPERA = 50;
  public static int FLD_PRE_SPESE = 51;
  public static int FLD_PRE_COMMISSIONI = 52;
  public static int FLD_PRE_ALLEGATI = 53;
  public static int FLD_PRE_INFO_TESORIERE = 54;
  public static int FLD_PRE_CODICE_GESTIONALE = 55;
  public static int FLD_PRE_COD_LIVELLO_5 = 56;
  public static int FLD_PRE_CODICE_EUROPEO = 57;
  public static int FLD_PRE_STATO = 58;
  public static int FLD_PRE_ESERCIZIO_PROVV = 59;
  public static int FLD_PRE_PROGRESSIVO_PROVV = 60;
  public static int FLD_PRE_PROGRESSIVO_PROV_DETT = 61;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI229 = 962;
  public static int FLD_PARAMETRI229_PARAMANNOORD = 0;
  public static int FLD_PARAMETRI229_PARAMNUMEORD = 1;
  public static int FLD_PARAMETRI229_PARAMDATAORD = 2;
  public static int FLD_PARAMETRI229_PARAMIMPOORD = 3;
  public static int FLD_PARAMETRI229_PARAMINFO = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI616 = 963;
  public static int FLD_PARAMETRI616_PARAIDFLUSBT = 0;
  public static int FLD_PARAMETRI616_PARAMDATADAL = 1;
  public static int FLD_PARAMETRI616_PARAMDATAAL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI230 = 964;
  public static int FLD_PARAMETRI230_PARAMANNOORD = 0;
  public static int FLD_PARAMETRI230_PARAMNUMEORD = 1;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO10 = 965;
  public static int FLD_PARAMETRIO10_INCASSOOLD = 0;

  // Definition of table: Parametri Input
  //
  public static int TBL_PARAMETINPU2 = 966;
  public static int FLD_PARAMETINPU2_PARAMANNOORD = 0;
  public static int FLD_PARAMETINPU2_PARAMNUMEORD = 1;
  public static int FLD_PARAMETINPU2_PARAMCAPITOL = 2;
  public static int FLD_PARAMETINPU2_PARAMARTICOL = 3;
  public static int FLD_PARAMETINPU2_PARPRONURIDE = 4;
  public static int FLD_PARAMETINPU2_PARPRONURIAC = 5;
  public static int FLD_PARAMETINPU2_PARPRONURIOP = 6;
  public static int FLD_PARAMETINPU2_PARAPRODAESP = 7;

  // Definition of table: Parametri Voce Peg
  //
  public static int TBL_PARAMVOCEPE1 = 967;
  public static int FLD_PARAMVOCEPE1_PARVOCPEGTIT = 0;
  public static int FLD_PARAMVOCEPE1_PARVOCPECOIN = 1;
  public static int FLD_PARAMVOCEPE1_PARVOCPECOTE = 2;
  public static int FLD_PARAMVOCEPE1_PARVOCPEGCAT = 3;
  public static int FLD_PARAMVOCEPE1_PARVOCPEGFAT = 4;
  public static int FLD_PARAMVOCEPE1_PARVOCPEGCEN = 5;
  public static int FLD_PARAMVOCEPE1_PARVOCPEVOEC = 6;
  public static int FLD_PARAMVOCEPE1_PARVOCPETIVI = 7;
  public static int FLD_PARAMVOCEPE1_PARVOCPEGCGE = 8;
  public static int FLD_PARAMVOCEPE1_PARVOPECOLI4 = 9;
  public static int FLD_PARAMVOCEPE1_PAVOPEQUCCVL = 10;
  public static int FLD_PARAMVOCEPE1_PARVOPECOVLI = 11;
  public static int FLD_PARAMVOCEPE1_PARVOCPECOEU = 12;

  // Definition of table: Ordinativi Old
  //
  public static int TBL_ORDINATIVOLD = 968;
  public static int FLD_ORDINATIVOLD_OLDNUMORDOLD = 0;
  public static int FLD_ORDINATIVOLD_OLDORDANACOL = 1;
  public static int FLD_ORDINATIVOLD_OLDORDNUACOL = 2;
  public static int FLD_ORDINATIVOLD_OLDORDVOECOL = 3;
  public static int FLD_ORDINATIVOLD_OLDORDCAPOLD = 4;
  public static int FLD_ORDINATIVOLD_OLDORDARTOLD = 5;

  // Definition of table: Dettagli Old
  //
  public static int TBL_DETTAGLIOLD = 969;
  public static int FLD_DETTAGLIOLD_OLDDETDEBOLD = 0;
  public static int FLD_DETTAGLIOLD_OLDDETIMPOLD = 1;
  public static int FLD_DETTAGLIOLD_OLDDETANDOOL = 2;
  public static int FLD_DETTAGLIOLD_OLDDETNUDOOL = 3;
  public static int FLD_DETTAGLIOLD_OLDDETNUQUOL = 4;
  public static int FLD_DETTAGLIOLD_OLDDETCGEOLD = 5;
  public static int FLD_DETTAGLIOLD_OLDDETNUCOOL = 6;
  public static int FLD_DETTAGLIOLD_OLDDETDACOOL = 7;
  public static int FLD_DETTAGLIOLD_OLDDETFATOLD = 8;
  public static int FLD_DETTAGLIOLD_OLDDETCENOLD = 9;
  public static int FLD_DETTAGLIOLD_OLDDETCODAOL = 10;
  public static int FLD_DETTAGLIOLD_OLDDETCOALOL = 11;
  public static int FLD_DETTAGLIOLD_OLDDETOPEOLD = 12;
  public static int FLD_DETTAGLIOLD_OLDDETSPEOLD = 13;

  // Definition of table: Accertamenti Old
  //
  public static int TBL_ACCERTAMEOLD = 970;
  public static int FLD_ACCERTAMEOLD_ANNO_DEL = 0;
  public static int FLD_ACCERTAMEOLD_NUMERO_DEL = 1;
  public static int FLD_ACCERTAMEOLD_SEDE_DEL = 2;
  public static int FLD_ACCERTAMEOLD_OLDACCOBIOLD = 3;
  public static int FLD_ACCERTAMEOLD_OLDACCIMECOL = 4;

  // Definition of table: Ord Rollback
  //
  public static int TBL_ORDROLLBACK2 = 971;
  public static int FLD_ORDROLLBACK2_CAPITOLO = 0;
  public static int FLD_ORDROLLBACK2_ARTICOLO = 1;
  public static int FLD_ORDROLLBACK2_ANNO_ACC = 2;
  public static int FLD_ORDROLLBACK2_NUMERO_ACC = 3;
  public static int FLD_ORDROLLBACK2_ANNO_ORD = 4;
  public static int FLD_ORDROLLBACK2_NUMERO_ORD = 5;
  public static int FLD_ORDROLLBACK2_TIPO_VINCOLO = 6;
  public static int FLD_ORDROLLBACK2_BOLLO = 7;
  public static int FLD_ORDROLLBACK2_ANNO_MAND_CO = 8;
  public static int FLD_ORDROLLBACK2_NUMERO_MAND_CO = 9;
  public static int FLD_ORDROLLBACK2_UFFICIO = 10;
  public static int FLD_ORDROLLBACK2_VOCE_ECON = 11;
  public static int FLD_ORDROLLBACK2_CODICE_FINANZ = 12;
  public static int FLD_ORDROLLBACK2_D_DATA_ORD = 13;
  public static int FLD_ORDROLLBACK2_ANNO_ELENCO = 14;
  public static int FLD_ORDROLLBACK2_NUMERO_ELENCO = 15;
  public static int FLD_ORDROLLBACK2_DATA_ELENCO = 16;
  public static int FLD_ORDROLLBACK2_E = 17;
  public static int FLD_ORDROLLBACK2_D_DATA_ELENCO = 18;
  public static int FLD_ORDROLLBACK2_INCASSATO = 19;
  public static int FLD_ORDROLLBACK2_IMPORTO = 20;
  public static int FLD_ORDROLLBACK2_ANNO_MAND_CO_INPS = 21;
  public static int FLD_ORDROLLBACK2_NUMERO_MAND_CO_INPS = 22;
  public static int FLD_ORDROLLBACK2_ANNO_MAND_CO_INAIL = 23;
  public static int FLD_ORDROLLBACK2_NUMERO_MAND_CO_INAIL = 24;
  public static int FLD_ORDROLLBACK2_ANNO_MAND_CO_ADD_REG = 25;
  public static int FLD_ORDROLLBACK2_NUMERO_MAND_CO_ADD_REG = 26;
  public static int FLD_ORDROLLBACK2_ANNO_MAND_CO_ADD_COM = 27;
  public static int FLD_ORDROLLBACK2_NUMERO_MAND_CO_ADD_COM = 28;
  public static int FLD_ORDROLLBACK2_UTENTE_INSERIMENTO = 29;
  public static int FLD_ORDROLLBACK2_DATA_INSERIMENTO = 30;
  public static int FLD_ORDROLLBACK2_UTENTE_ULTIMO_AGG = 31;
  public static int FLD_ORDROLLBACK2_DATA_ULTIMO_AGG = 32;

  // Definition of table: Importo
  //
  public static int TBL_IMPORTO5 = 972;
  public static int FLD_IMPORTO5_IMPORTO = 0;

  // Definition of table: Finanziamento
  //
  public static int TBL_FINANZIAME20 = 973;
  public static int FLD_FINANZIAME20_FINANZIAMENT = 0;

  // Definition of table: Acc Rollback
  //
  public static int TBL_ACCROLLBACK = 974;
  public static int FLD_ACCROLLBACK_CAPITOLO = 0;
  public static int FLD_ACCROLLBACK_ARTICOLO = 1;
  public static int FLD_ACCROLLBACK_ANNO_ACC = 2;
  public static int FLD_ACCROLLBACK_NUMERO_ACC = 3;
  public static int FLD_ACCROLLBACK_ANNO_DEL = 4;
  public static int FLD_ACCROLLBACK_NUMERO_DEL = 5;
  public static int FLD_ACCROLLBACK_SEDE_DEL = 6;
  public static int FLD_ACCROLLBACK_IMPORTO = 7;
  public static int FLD_ACCROLLBACK_DESCRIZIONE = 8;
  public static int FLD_ACCROLLBACK_DEBITORE = 9;
  public static int FLD_ACCROLLBACK_VOCE_ECON = 10;
  public static int FLD_ACCROLLBACK_TIPO_VINCOLO = 11;
  public static int FLD_ACCROLLBACK_E = 12;
  public static int FLD_ACCROLLBACK_D_DATA_REG = 13;
  public static int FLD_ACCROLLBACK_CENTRO = 14;
  public static int FLD_ACCROLLBACK_FATTORE = 15;
  public static int FLD_ACCROLLBACK_COMPETENZA_DAL = 16;
  public static int FLD_ACCROLLBACK_COMPETENZA_AL = 17;
  public static int FLD_ACCROLLBACK_RILEVANTE_ECO = 18;
  public static int FLD_ACCROLLBACK_COD_IMP_ECO = 19;
  public static int FLD_ACCROLLBACK_PROGETTO_ID = 20;
  public static int FLD_ACCROLLBACK_FINANZIAMENTO = 21;
  public static int FLD_ACCROLLBACK_OBIETTIVO = 22;
  public static int FLD_ACCROLLBACK_CODICE_GESTIONALE = 23;
  public static int FLD_ACCROLLBACK_UTENTE_INSERIMENTO = 24;
  public static int FLD_ACCROLLBACK_DATA_INSERIMENTO = 25;
  public static int FLD_ACCROLLBACK_SCHEDA_OBIETTIVO_ID = 26;

  // Definition of table: Opere Rollback
  //
  public static int TBL_OPEREROLLBAC = 975;
  public static int FLD_OPEREROLLBAC_ANNO_ACC = 0;
  public static int FLD_OPEREROLLBAC_NUMERO_ACC = 1;
  public static int FLD_OPEREROLLBAC_OPERA = 2;
  public static int FLD_OPEREROLLBAC_FINANZIAMENTO = 3;
  public static int FLD_OPEREROLLBAC_CAPITOLO = 4;
  public static int FLD_OPEREROLLBAC_ARTICOLO = 5;
  public static int FLD_OPEREROLLBAC_E = 6;
  public static int FLD_OPEREROLLBAC_IMPORTO = 7;

  // Definition of table: PRE
  //
  public static int TBL_PREACC = 976;
  public static int FLD_PREACC_CAPITOLO = 0;
  public static int FLD_PREACC_ARTICOLO = 1;
  public static int FLD_PREACC_ANNO_PRE = 2;
  public static int FLD_PREACC_NUMERO_PRE = 3;
  public static int FLD_PREACC_ANNO_ACC = 4;
  public static int FLD_PREACC_NUMERO_ACC = 5;
  public static int FLD_PREACC_DATA_REG = 6;
  public static int FLD_PREACC_IMPORTO = 7;
  public static int FLD_PREACC_IMPORTO_OLD = 8;
  public static int FLD_PREACC_DESCRIZIONE = 9;
  public static int FLD_PREACC_DEBITORE = 10;
  public static int FLD_PREACC_DEBITORE_OLD = 11;
  public static int FLD_PREACC_ANNO_DOC = 12;
  public static int FLD_PREACC_ANNO_DOC_OLD = 13;
  public static int FLD_PREACC_NUMERO_DOC = 14;
  public static int FLD_PREACC_NUMERO_DOC_OLD = 15;
  public static int FLD_PREACC_CAUSALE = 16;
  public static int FLD_PREACC_BOLLO = 17;
  public static int FLD_PREACC_ANNO_ORD = 18;
  public static int FLD_PREACC_NUMERO_ORD = 19;
  public static int FLD_PREACC_NUMERO_INC = 20;
  public static int FLD_PREACC_DATA_INC = 21;
  public static int FLD_PREACC_IMPORTO_INC = 22;
  public static int FLD_PREACC_TIPO_VINCOLO = 23;
  public static int FLD_PREACC_UFFICIO = 24;
  public static int FLD_PREACC_DATA_ESTRATTO_CCP = 25;
  public static int FLD_PREACC_DATA_CCP = 26;
  public static int FLD_PREACC_VOCE_ECON = 27;
  public static int FLD_PREACC_CODICE_FINANZ = 28;
  public static int FLD_PREACC_CODICE_PTC = 29;
  public static int FLD_PREACC_NUM_QUIETANZA = 30;
  public static int FLD_PREACC_NUM_QUIETANZA_OLD = 31;
  public static int FLD_PREACC_E = 32;
  public static int FLD_PREACC_FAT_ANNO_PROG = 33;
  public static int FLD_PREACC_FAT_NUMERO_PROG = 34;
  public static int FLD_PREACC_D_DATA_REG = 35;
  public static int FLD_PREACC_D_DATA_INC = 36;
  public static int FLD_PREACC_D_DATA_ESTRATTO_CCP = 37;
  public static int FLD_PREACC_D_DATA_CCP = 38;
  public static int FLD_PREACC_NUMERO_CONTABILE = 39;
  public static int FLD_PREACC_DATA_CONTABILE = 40;
  public static int FLD_PREACC_PROGRESSIVO_TESO = 41;
  public static int FLD_PREACC_CENTRO = 42;
  public static int FLD_PREACC_FATTORE = 43;
  public static int FLD_PREACC_COMPETENZA_DAL = 44;
  public static int FLD_PREACC_COMPETENZA_AL = 45;
  public static int FLD_PREACC_COD_IMP_ECO = 46;
  public static int FLD_PREACC_PROGRESSIVO_CFA = 47;
  public static int FLD_PREACC_ANNO_DISTINTA = 48;
  public static int FLD_PREACC_NUMERO_DISTINTA = 49;
  public static int FLD_PREACC_TIPO_DISTINTA = 50;
  public static int FLD_PREACC_OPERA = 51;
  public static int FLD_PREACC_SPESE = 52;
  public static int FLD_PREACC_COMMISSIONI = 53;
  public static int FLD_PREACC_ALLEGATI = 54;
  public static int FLD_PREACC_INFO_TESORIERE = 55;
  public static int FLD_PREACC_CODICE_GESTIONALE = 56;
  public static int FLD_PREACC_COD_LIVELLO_5 = 57;
  public static int FLD_PREACC_CODICE_EUROPEO = 58;
  public static int FLD_PREACC_STATO = 59;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI311 = 977;
  public static int FLD_PARAMETRI311_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI311_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI311_PARAENTRSPES = 2;
  public static int FLD_PARAMETRI311_PARAMTIPO = 3;
  public static int FLD_PARAMETRI311_PARDATULTELA = 4;
  public static int FLD_PARAMETRI311_PARAMALLEGAT = 5;
  public static int FLD_PARAMETRI311_PARAINFOTESO = 6;
  public static int FLD_PARAMETRI311_PARAQUALNOTE = 7;
  public static int FLD_PARAMETRI311_PARAMRPPATTI = 8;
  public static int FLD_PARAMETRI311_PARAMORDINAM = 9;
  public static int FLD_PARAMETRI311_PARAIMPDAFIL = 10;
  public static int FLD_PARAMETRI311_PARANCDETEME = 11;

  // Definition of table: CHECKUP
  //
  public static int TBL_CHECKUP = 978;
  public static int FLD_CHECKUP_NOMEOGGECAPI = 0;
  public static int FLD_CHECKUP_NOMEOGGEARTI = 1;
  public static int FLD_CHECKUP_NOMOGGNUMACC = 2;
  public static int FLD_CHECKUP_NOMOGGANNACC = 3;
  public static int FLD_CHECKUP_NOMEOGGEIMPO = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI276 = 979;
  public static int FLD_PARAMETRI276_PARACODIGRUP = 0;
  public static int FLD_PARAMETRI276_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI276_PARDATULTELA = 2;
  public static int FLD_PARAMETRI276_PARAUNORDPER = 3;
  public static int FLD_PARAMETRI276_PARADESCGENE = 4;
  public static int FLD_PARAMETRI276_CAUSALE = 5;
  public static int FLD_PARAMETRI276_UFFICIO = 6;
  public static int FLD_PARAMETRI276_PARADATAEMIS = 7;
  public static int FLD_PARAMETRI276_PARAEMISAUTO = 8;
  public static int FLD_PARAMETRI276_PARAIMPUECON = 9;
  public static int FLD_PARAMETRI276_PARACODIDEBI = 10;
  public static int FLD_PARAMETRI276_PARACONTPATR = 11;
  public static int FLD_PARAMETRI276_PARATIPOGRUP = 12;
  public static int FLD_PARAMETRI276_PARAMALLEGAT = 13;
  public static int FLD_PARAMETRI276_PARAINFOTESO = 14;
  public static int FLD_PARAMETRI276_PARAQUALNOTE = 15;
  public static int FLD_PARAMETRI276_NUMERO_CONTABILE = 16;
  public static int FLD_PARAMETRI276_DATA_CONTABILE = 17;
  public static int FLD_PARAMETRI276_PARAIMPDAFIL = 18;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI277 = 980;
  public static int FLD_PARAMETRI277_PARAMGRUPPO = 0;
  public static int FLD_PARAMETRI277_PARADESCGRUP = 1;
  public static int FLD_PARAMETRI277_PARAENTRSPES = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI393 = 981;
  public static int FLD_PARAMETRI393_PARANCPROREG = 0;
  public static int FLD_PARAMETRI393_PARAENTRSPES = 1;
  public static int FLD_PARAMETRI393_PARAMBUONI = 2;
  public static int FLD_PARAMETRI393_PARAIMPOPROV = 3;
  public static int FLD_PARAMETRI393_PARATOTADETT = 4;
  public static int FLD_PARAMETRI393_PARANUMEPROV = 5;
  public static int FLD_PARAMETRI393_PARADATAPROV = 6;
  public static int FLD_PARAMETRI393_PARAIDFLUSBT = 7;
  public static int FLD_PARAMETRI393_PARAMPAGOPA = 8;

  // Definition of table: Parametri Flusso
  //
  public static int TBL_PARAMEFLUSS5 = 982;
  public static int FLD_PARAMEFLUSS5_IDFLUSSOBT = 0;

  // Definition of table: Provvisori Rollback
  //
  public static int TBL_PROVVIROLLBA = 983;
  public static int FLD_PROVVIROLLBA_ESERCIZIO = 0;
  public static int FLD_PROVVIROLLBA_PROGRESSIVO = 1;
  public static int FLD_PROVVIROLLBA_DATA = 2;
  public static int FLD_PROVVIROLLBA_NUMERO = 3;
  public static int FLD_PROVVIROLLBA_IMPORTO = 4;
  public static int FLD_PROVVIROLLBA_DES_BEN = 5;
  public static int FLD_PROVVIROLLBA_DESCRIZIONE = 6;
  public static int FLD_PROVVIROLLBA_UTENTE_INSERIMENTO = 7;
  public static int FLD_PROVVIROLLBA_DATA_INSERIMENTO = 8;
  public static int FLD_PROVVIROLLBA_UTENTE_ULTIMO_AGG = 9;
  public static int FLD_PROVVIROLLBA_DATA_ULTIMO_AGG = 10;
  public static int FLD_PROVVIROLLBA_PROGR_UNITA_ORGANIZZATIVA = 11;
  public static int FLD_PROVVIROLLBA_RITORNO_CC = 12;

  // Definition of table: Ord Prov Dettagli
  //
  public static int TBL_ORDPROVDETTA = 984;
  public static int FLD_ORDPROVDETTA_ESERCIZIO = 0;
  public static int FLD_ORDPROVDETTA_PROGR_ORD_PROV = 1;
  public static int FLD_ORDPROVDETTA_PROGRESSIVO = 2;
  public static int FLD_ORDPROVDETTA_IMPORTO = 3;
  public static int FLD_ORDPROVDETTA_IMDBIMPOROLD = 4;
  public static int FLD_ORDPROVDETTA_E = 5;
  public static int FLD_ORDPROVDETTA_CAPITOLO = 6;
  public static int FLD_ORDPROVDETTA_IMDBCAPITOLD = 7;
  public static int FLD_ORDPROVDETTA_ARTICOLO = 8;
  public static int FLD_ORDPROVDETTA_IMDBARTICOLD = 9;
  public static int FLD_ORDPROVDETTA_ANNO_ACC = 10;
  public static int FLD_ORDPROVDETTA_IMDANNACCOLD = 11;
  public static int FLD_ORDPROVDETTA_NUMERO_ACC = 12;
  public static int FLD_ORDPROVDETTA_IMDNUMACCOLD = 13;
  public static int FLD_ORDPROVDETTA_DESCRIZIONE = 14;
  public static int FLD_ORDPROVDETTA_DEBITORE = 15;
  public static int FLD_ORDPROVDETTA_NUM_QUIETANZA = 16;
  public static int FLD_ORDPROVDETTA_ANNO_DOC = 17;
  public static int FLD_ORDPROVDETTA_IMDANNDOCOLD = 18;
  public static int FLD_ORDPROVDETTA_NUMERO_DOC = 19;
  public static int FLD_ORDPROVDETTA_IMDNUMDOCOLD = 20;
  public static int FLD_ORDPROVDETTA_TIPO_VINCOLO = 21;
  public static int FLD_ORDPROVDETTA_VOCE_ECON = 22;
  public static int FLD_ORDPROVDETTA_IMDVOCECOOLD = 23;
  public static int FLD_ORDPROVDETTA_BOLLO = 24;
  public static int FLD_ORDPROVDETTA_FATTORE = 25;
  public static int FLD_ORDPROVDETTA_CENTRO = 26;
  public static int FLD_ORDPROVDETTA_COMPETENZA_DAL = 27;
  public static int FLD_ORDPROVDETTA_COMPETENZA_AL = 28;
  public static int FLD_ORDPROVDETTA_ANNO_PRE = 29;
  public static int FLD_ORDPROVDETTA_NUMERO_PRE = 30;
  public static int FLD_ORDPROVDETTA_ANNO_PROG = 31;
  public static int FLD_ORDPROVDETTA_NUMERO_PROG = 32;
  public static int FLD_ORDPROVDETTA_FINANZIAMENTO = 33;
  public static int FLD_ORDPROVDETTA_OPERA = 34;
  public static int FLD_ORDPROVDETTA_UFFICIO = 35;
  public static int FLD_ORDPROVDETTA_CODICE_GESTIONALE = 36;
  public static int FLD_ORDPROVDETTA_UTENTE_INSERIMENTO = 37;
  public static int FLD_ORDPROVDETTA_DATA_INSERIMENTO = 38;
  public static int FLD_ORDPROVDETTA_UTENTE_ULTIMO_AGG = 39;
  public static int FLD_ORDPROVDETTA_DATA_ULTIMO_AGG = 40;
  public static int FLD_ORDPROVDETTA_IMDBSTATO = 41;
  public static int FLD_ORDPROVDETTA_ID_OBIETTIVO_GESTIONE = 42;
  public static int FLD_ORDPROVDETTA_CODICE_EUROPEO = 43;
  public static int FLD_ORDPROVDETTA_COD_LIVELLO_5 = 44;
  public static int FLD_ORDPROVDETTA_DES_BEN = 45;
  public static int FLD_ORDPROVDETTA_RAGIONE_SOCIALE = 46;
  public static int FLD_ORDPROVDETTA_IMDRAGSOCOLD = 47;
  public static int FLD_ORDPROVDETTA_DATA_CCP = 48;

  // Definition of table: Emissione Ordinativi Da Provvisori
  //
  public static int TBL_EMISORDDAPRO = 985;
  public static int FLD_EMISORDDAPRO_ROWNAMDEDAAC = 0;
  public static int FLD_EMISORDDAPRO_ROWNAMDESACC = 1;
  public static int FLD_EMISORDDAPRO_ROWNAMECAUSA = 2;
  public static int FLD_EMISORDDAPRO_ROWNAMDATEMI = 3;
  public static int FLD_EMISORDDAPRO_ROWNAMEUFFIC = 4;
  public static int FLD_EMISORDDAPRO_RNEAVPMDSASC = 5;
  public static int FLD_EMISORDDAPRO_ROWNAMIMPECO = 6;
  public static int FLD_EMISORDDAPRO_ROWNAMEFATTO = 7;
  public static int FLD_EMISORDDAPRO_ROWNAMDESUAC = 8;
  public static int FLD_EMISORDDAPRO_ROWNAMCODDEB = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI107 = 986;
  public static int FLD_PARAMETRI107_PARAENTRSPES = 0;

  // Definition of table: Emissione Ordinativi
  //
  public static int TBL_EMISSIORDINA = 987;
  public static int FLD_EMISSIORDINA_ROWNAMECAPIT = 0;
  public static int FLD_EMISSIORDINA_ROWNAMEARTIC = 1;
  public static int FLD_EMISSIORDINA_ROWNAMNUMACC = 2;
  public static int FLD_EMISSIORDINA_ROWNAMANNACC = 3;
  public static int FLD_EMISSIORDINA_ROWNAMCODDEB = 4;
  public static int FLD_EMISSIORDINA_ROWNAMEBOLLO = 5;
  public static int FLD_EMISSIORDINA_ROWNAMEUFFIC = 6;
  public static int FLD_EMISSIORDINA_ROWNAMCODLI6 = 7;
  public static int FLD_EMISSIORDINA_ROWNAMCODEU1 = 8;
  public static int FLD_EMISSIORDINA_ROWNAMCODLI5 = 9;
  public static int FLD_EMISSIORDINA_ROWNAMCODEUR = 10;
  public static int FLD_EMISSIORDINA_ROWNAMNUMQUI = 11;
  public static int FLD_EMISSIORDINA_ROWNAMVOCECO = 12;
  public static int FLD_EMISSIORDINA_ROWNAMECGE = 13;
  public static int FLD_EMISSIORDINA_ROWNAMEDESCR = 14;
  public static int FLD_EMISSIORDINA_ROWNAMDATCCP = 15;
  public static int FLD_EMISSIORDINA_TIPO_VINCOLO = 16;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO27 = 988;
  public static int FLD_PARAMETRIO27_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIO27_ARTICOLOOLD = 1;
  public static int FLD_PARAMETRIO27_NUMEROACCOLD = 2;
  public static int FLD_PARAMETRIO27_ANNOACCOLD = 3;
  public static int FLD_PARAMETRIO27_DEBITOREOLD = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI436 = 989;
  public static int FLD_PARAMETRI436_NOMOGGLIV4CA = 0;

  // Definition of table: Imdb Ord Provvisori
  //
  public static int TBL_IMDBORDPROVV = 990;
  public static int FLD_IMDBORDPROVV_NOMEOGGEESER = 0;
  public static int FLD_IMDBORDPROVV_NOMEOGGEPROG = 1;
  public static int FLD_IMDBORDPROVV_NOMOGGPRODET = 2;
  public static int FLD_IMDBORDPROVV_NOMOGGPRUNOR = 3;
  public static int FLD_IMDBORDPROVV_NOMEOGGEDATA = 4;
  public static int FLD_IMDBORDPROVV_NOMEOGGENUME = 5;
  public static int FLD_IMDBORDPROVV_NOMOGGIMPORD = 6;
  public static int FLD_IMDBORDPROVV_NOMOGGIMDEOR = 7;
  public static int FLD_IMDBORDPROVV_NOMOGGIMDENE = 8;
  public static int FLD_IMDBORDPROVV_NOMOGGDESBEN = 9;
  public static int FLD_IMDBORDPROVV_NOMEOGGEDESC = 10;
  public static int FLD_IMDBORDPROVV_NOMOGGIDFLBT = 11;
  public static int FLD_IMDBORDPROVV_NOMEOGGETTOI = 12;

  // Definition of table: Imdb Provvisori Ord Da Escludere
  //
  public static int TBL_IMDPROORDAES = 991;
  public static int FLD_IMDPROORDAES_NOMEOGGEESER = 0;
  public static int FLD_IMDPROORDAES_NOMEOGGEPROG = 1;
  public static int FLD_IMDPROORDAES_NOMOGGPRODET = 2;

  // Definition of table: Table
  //
  public static int TBL_TABLE2 = 992;
  public static int FLD_TABLE2_ROWNAMDALIST = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR60 = 993;
  public static int FLD_PAR60_ROWNAMORDDAL = 0;
  public static int FLD_PAR60_ROWNAMEAL = 1;
  public static int FLD_PAR60_ROWNAMEUFFIC = 2;
  public static int FLD_PAR60_ROWNAMCODDEB = 3;
  public static int FLD_PAR60_ROWNAMECAUSA = 4;

  // Definition of table: Avvisi Di Riscossione
  //
  public static int TBL_AVVISDIRISCO = 994;
  public static int FLD_AVVISDIRISCO_ROWNAMEDAL = 0;
  public static int FLD_AVVISDIRISCO_ROWNAMEAL = 1;
  public static int FLD_AVVISDIRISCO_ROWNAMEUFFIC = 2;
  public static int FLD_AVVISDIRISCO_ROWNAMDATAVV = 3;
  public static int FLD_AVVISDIRISCO_ROWNAMESTAMP = 4;
  public static int FLD_AVVISDIRISCO_ROWNAMCODDEB = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE22 = 995;
  public static int FLD_NEWTABLE22_ROWNAMDIGIEM = 0;
  public static int FLD_NEWTABLE22_ROWNAMNUODIS = 1;
  public static int FLD_NEWTABLE22_ROWNAMEDISTN = 2;
  public static int FLD_NEWTABLE22_ROWNAMDADIEM = 3;
  public static int FLD_NEWTABLE22_ROWNAMORDDAL = 4;
  public static int FLD_NEWTABLE22_ROWNAMEAL = 5;
  public static int FLD_NEWTABLE22_ROWNAMDATDIS = 6;
  public static int FLD_NEWTABLE22_ROWNAMEDANUM = 7;
  public static int FLD_NEWTABLE22_ROWNAMEUFFIC = 8;
  public static int FLD_NEWTABLE22_ROWNAMECONTA = 9;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE2 = 996;
  public static int FLD_NEWTABLE2_ROWNAMENDAL = 0;
  public static int FLD_NEWTABLE2_ROWNAMENAL = 1;
  public static int FLD_NEWTABLE2_ROWNAMEDAL = 2;
  public static int FLD_NEWTABLE2_ROWNAMEAL = 3;
  public static int FLD_NEWTABLE2_ROWNAMEUFFIC = 4;
  public static int FLD_NEWTABLE2_ROWNAMDAINSI = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE55 = 997;
  public static int FLD_NEWTABLE55_ROWNAMENDAL = 0;
  public static int FLD_NEWTABLE55_ROWNAMENAL = 1;
  public static int FLD_NEWTABLE55_ROWNAMEDAL = 2;
  public static int FLD_NEWTABLE55_ROWNAMEAL = 3;
  public static int FLD_NEWTABLE55_ROWNAMEUFFIC = 4;
  public static int FLD_NEWTABLE55_ROWNAMDAINSI = 5;
  public static int FLD_NEWTABLE55_ROWNAMCODACO = 6;

  // Definition of table: Incasso Completo
  //
  public static int TBL_INCASSCOMPLE = 998;
  public static int FLD_INCASSCOMPLE_ROWNAMEDAL = 0;
  public static int FLD_INCASSCOMPLE_ROWNAMEAL = 1;
  public static int FLD_INCASSCOMPLE_ROWNAMEEMEAL = 2;
  public static int FLD_INCASSCOMPLE_ROWNAMEDATA = 3;
  public static int FLD_INCASSCOMPLE_ROWNAMENUMER = 4;

  // Definition of table: Annulla Incassi
  //
  public static int TBL_ANNULLINCASS = 999;
  public static int FLD_ANNULLINCASS_ROWNAMEDA = 0;
  public static int FLD_ANNULLINCASS_ROWNAMEA = 1;
  public static int FLD_ANNULLINCASS_ROWNAMEDAL = 2;
  public static int FLD_ANNULLINCASS_ROWNAMEAL = 3;
  public static int FLD_ANNULLINCASS_ROWNAMDALINC = 4;
  public static int FLD_ANNULLINCASS_ROWNAMEALINC = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE20 = 1000;
  public static int FLD_NEWTABLE20_ROWNAMDADIRI = 0;

}
