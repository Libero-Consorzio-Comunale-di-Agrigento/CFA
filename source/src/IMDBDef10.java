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
public class IMDBDef10 extends Object
{
	// IMDB Constants
  // Recordset for query: IVA
  //
  public static int QRY_IVA2 = 1882;
  public static int QSL_IVA2_TIPOREGISTRO = 0;
  public static int QSL_IVA2_SERVIZIO = 1;
  public static int QSL_IVA2_TIPOREGISTRS = 2;
  public static int QSL_IVA2_TIPOBOLLATOS = 3;

  // Table to contain panel selected row: T03
  //
  public static int PQRY_T03 = 1883;
  public static int PQSL_T03_CODICE = 0;
  public static int PQSL_T03_STORNO = 1;
  public static int PQSL_T03_DESCRIZIONE = 2;
  public static int PQSL_T03_ESCLUSIONE_ECF = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM59 = 1884;
  public static int PQRY_PARAM59_RS = 1885;
  public static int PQSL_PARAM59_ROWNAMEMULTI = 0;
  public static int PQSL_PARAM59_ROWNAMEFSE = 1;

  // Table to contain panel selected row: CFA
  //
  public static int PQRY_CFA5 = 1886;
  public static int PQSL_CFA5_ANNO_PROG = 0;
  public static int PQSL_CFA5_NUMERO_PROG = 1;
  public static int PQSL_CFA5_E_S = 2;
  public static int PQSL_CFA5_ESERCIZIO = 3;
  public static int PQSL_CFA5_CAPITOLO = 4;
  public static int PQSL_CFA5_ARTICOLO = 5;
  public static int PQSL_CFA5_ANNO_IMP = 6;
  public static int PQSL_CFA5_NUMERO_IMP = 7;
  public static int PQSL_CFA5_ANNO_SUBIMP = 8;
  public static int PQSL_CFA5_NUMERO_SUBIMP = 9;
  public static int PQSL_CFA5_ANNO_ACC = 10;
  public static int PQSL_CFA5_NUMERO_ACC = 11;
  public static int PQSL_CFA5_IMPORTO = 12;
  public static int PQSL_CFA5_D_DATA_REG = 13;
  public static int PQSL_CFA5_FLAG_LIQUIDATO = 14;
  public static int PQSL_CFA5_CFAINFOIMPEG = 15;
  public static int PQSL_CFA5_CFAINFSUBIMP = 16;
  public static int PQSL_CFA5_CFAINFOACCER = 17;
  public static int PQSL_CFA5_CFAINFOPEG = 18;
  public static int PQSL_CFA5_UTENTE_INSERIMENTO = 19;
  public static int PQSL_CFA5_DATA_INSERIMENTO = 20;
  public static int PQSL_CFA5_UTENTE_ULTIMO_AGG = 21;
  public static int PQSL_CFA5_DATA_ULTIMO_AGG = 22;
  public static int PQSL_CFA5_PROGRESSIVO = 23;
  public static int PQSL_CFA5_NUMERO_CONTABILE = 24;
  public static int PQSL_CFA5_DATA_CONTABILE = 25;
  public static int PQSL_CFA5_IMPORTO_IVA = 26;
  public static int PQSL_CFA5_IMPORTO_IVA_IST = 27;
  public static int PQSL_CFA5_TIPO_REGISTRO = 28;
  public static int PQSL_CFA5_TIPO_BOLLATO = 29;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM31 = 1887;
  public static int PQRY_PARAM31_RS = 1888;
  public static int PQSL_PARAM31_ROWNAMANNDEL = 0;
  public static int PQSL_PARAM31_ROWNAMNUMDEL = 1;
  public static int PQSL_PARAM31_ROWNAMSEDDEL = 2;
  public static int PQSL_PARAM31_ROWNAMANNPR1 = 3;
  public static int PQSL_PARAM31_ROWNAMNUMPR1 = 4;
  public static int PQSL_PARAM31_ROWNAMUNIPRO = 5;
  public static int PQSL_PARAM31_ROWNAMEDESCR = 6;
  public static int PQSL_PARAM31_ROWNAMEUFFIC = 7;
  public static int PQSL_PARAM31_ROWNAMECAUSA = 8;
  public static int PQSL_PARAM31_ROWNAMEBOLLO = 9;
  public static int PQSL_PARAM31_ROWNAMESCADE = 10;
  public static int PQSL_PARAM31_ROWNAMESPESE = 11;
  public static int PQSL_PARAM31_ROWNAMECOMMI = 12;
  public static int PQSL_PARAM31_ROWNAMEALLEG = 13;
  public static int PQSL_PARAM31_ROWNAMINFTES = 14;
  public static int PQSL_PARAM31_ROWNAMEINEMI = 15;
  public static int PQSL_PARAM31_MOTIVO_ESCLUSIONE_CIG = 16;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM22 = 1889;
  public static int PQRY_PARAM22_RS = 1890;
  public static int PQSL_PARAM22_ROWNAMEDESCR = 0;
  public static int PQSL_PARAM22_ROWNAMEUFFIC = 1;
  public static int PQSL_PARAM22_ROWNAMECAUSA = 2;
  public static int PQSL_PARAM22_ROWNAMEBOLLO = 3;
  public static int PQSL_PARAM22_ROWNAMESCADE = 4;
  public static int PQSL_PARAM22_ROWNAMESPESE = 5;
  public static int PQSL_PARAM22_ROWNAMECOMMI = 6;
  public static int PQSL_PARAM22_ROWNAMEALLEG = 7;
  public static int PQSL_PARAM22_ROWNAMINFTES = 8;
  public static int PQSL_PARAM22_ROWNAMEINEMI = 9;
  public static int PQSL_PARAM22_ROWNAMIMPECO = 10;
  public static int PQSL_PARAM22_ROWNAMDESUAC = 11;
  public static int PQSL_PARAM22_ROWNAMECONTR = 12;
  public static int PQSL_PARAM22_ROWNAMEDEBIT = 13;
  public static int PQSL_PARAM22_ROWNAMCODDEB = 14;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ53 = 1891;
  public static int PQSL_LIQ53_ANNO_LIQ = 0;
  public static int PQSL_LIQ53_NUMERO_LIQ = 1;
  public static int PQSL_LIQ53_ANNO_SUBIMP = 2;
  public static int PQSL_LIQ53_NUMERO_SUBIMP = 3;
  public static int PQSL_LIQ53_ANNO_DEL = 4;
  public static int PQSL_LIQ53_NUMERO_DEL = 5;
  public static int PQSL_LIQ53_SEDE_DEL = 6;
  public static int PQSL_LIQ53_IMPORTO = 7;
  public static int PQSL_LIQ53_RITENUTE = 8;
  public static int PQSL_LIQ53_NUMERO_MAND = 9;
  public static int PQSL_LIQ53_D_DATA_MAND = 10;
  public static int PQSL_LIQ53_DESCRIZIONE = 11;
  public static int PQSL_LIQ53_LIQBOLLO = 12;
  public static int PQSL_LIQ53_CAPITOLO = 13;
  public static int PQSL_LIQ53_ARTICOLO = 14;
  public static int PQSL_LIQ53_NUMERO_IMP = 15;
  public static int PQSL_LIQ53_ANNO_IMP = 16;
  public static int PQSL_LIQ53_NUMERO_DISTINTA = 17;
  public static int PQSL_LIQ53_ANNO_DISTINTA = 18;
  public static int PQSL_LIQ53_LIQSEDEDEL1 = 19;
  public static int PQSL_LIQ53_LIQNUMERDEL1 = 20;
  public static int PQSL_LIQ53_LIQANNODEL1 = 21;
  public static int PQSL_LIQ53_LIQSEDEDEL2 = 22;
  public static int PQSL_LIQ53_LIQNUMERDEL2 = 23;
  public static int PQSL_LIQ53_LIQANNODEL2 = 24;
  public static int PQSL_LIQ53_LIQINFO = 25;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ18 = 1892;
  public static int PQSL_LIQ18_NUMERO_ORD = 0;
  public static int PQSL_LIQ18_D_DATA_ORD = 1;
  public static int PQSL_LIQ18_IMPORTO = 2;
  public static int PQSL_LIQ18_DESCRIZIONE = 3;
  public static int PQSL_LIQ18_CAPITOLO = 4;
  public static int PQSL_LIQ18_ARTICOLO = 5;
  public static int PQSL_LIQ18_NUMERO_DISTINTA = 6;
  public static int PQSL_LIQ18_ANNO_DISTINTA = 7;
  public static int PQSL_LIQ18_NUMERO_ACC = 8;
  public static int PQSL_LIQ18_ANNO_ACC = 9;
  public static int PQSL_LIQ18_ANNO_ORD = 10;
  public static int PQSL_LIQ18_ANNO_PRE = 11;
  public static int PQSL_LIQ18_NUMERO_PRE = 12;
  public static int PQSL_LIQ18_LIQQUIETANZA = 13;
  public static int PQSL_LIQ18_LIQINFO = 14;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT1 = 1893;
  public static int PQRY_RETFAT1_RS = 1894;
  public static int PQSL_RETFAT1_FAT_ANNO_PROG_NAC = 0;
  public static int PQSL_RETFAT1_FAT_NUMERO_PROG_NAC = 1;
  public static int PQSL_RETFAT1_IMPORTO = 2;
  public static int PQSL_RETFAT1_D_DATA_REG = 3;
  public static int PQSL_RETFAT1_DESCRIZIONE = 4;
  public static int PQSL_RETFAT1_FATTORE = 5;
  public static int PQSL_RETFAT1_CENTRO = 6;
  public static int PQSL_RETFAT1_COMPETENZA_DAL = 7;
  public static int PQSL_RETFAT1_COMPETENZA_AL = 8;
  public static int PQSL_RETFAT1_PROGETTO_ID = 9;
  public static int PQSL_RETFAT1_RETFAPRIDOCU = 10;
  public static int PQSL_RETFAT1_RETFAPRIFATT = 11;
  public static int PQSL_RETFAT1_RETFAPRICENT = 12;
  public static int PQSL_RETFAT1_RETFAPRPROID = 13;
  public static int PQSL_RETFAT1_FAT_ANNO_PROG_FAT = 14;
  public static int PQSL_RETFAT1_FAT_NUMERO_PROG_FAT = 15;
  public static int PQSL_RETFAT1_ANNO_DOC = 16;
  public static int PQSL_RETFAT1_NUMERO_DOC = 17;
  public static int PQSL_RETFAT1_UTENTE_INSERIMENTO = 18;
  public static int PQSL_RETFAT1_DATA_INSERIMENTO = 19;
  public static int PQSL_RETFAT1_UTENTE_ULTIMO_AGG = 20;
  public static int PQSL_RETFAT1_DATA_ULTIMO_AGG = 21;
  public static int PQSL_RETFAT1_ROWNAMESTATO = 22;
  public static int PQSL_RETFAT1_PROGRESSIVO = 23;
  public static int PQSL_RETFAT1_IMPORTO_IVA = 24;
  public static int PQSL_RETFAT1_IMPORTO_IVA_IST = 25;
  public static int PQSL_RETFAT1_TIPO_REGISTRO_DEF = 26;
  public static int PQSL_RETFAT1_TIPO_BOLLATO_DEF = 27;
  public static int PQSL_RETFAT1_ANNO_DOC_OLD = 28;
  public static int PQSL_RETFAT1_NUMERO_DOC_OLD = 29;
  public static int PQSL_RETFAT1_ROWNAMANPRCO = 30;
  public static int PQSL_RETFAT1_ROWNAMNUPRCO = 31;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV78 = 1895;
  public static int QSL_CFASELINTV78_COUNT = 0;

  // Recordset for query: IMP ECO
  //
  public static int QRY_IMPECO3 = 1896;
  public static int QSL_IMPECO3_IMPECOFATTOR = 0;
  public static int QSL_IMPECO3_IMPECOCENTRO = 1;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT19 = 1897;
  public static int PQSL_FAT19_NUMERO_DOC = 0;
  public static int PQSL_FAT19_ANNO_PROG = 1;
  public static int PQSL_FAT19_NUMERO_PROG = 2;
  public static int PQSL_FAT19_D_DATA_DOC = 3;
  public static int PQSL_FAT19_CODICE_DOC = 4;
  public static int PQSL_FAT19_NUMERO_PROT = 5;
  public static int PQSL_FAT19_D_DATA_PROT = 6;
  public static int PQSL_FAT19_IMPORTO = 7;
  public static int PQSL_FAT19_IMPUTATO = 8;
  public static int PQSL_FAT19_VARIAZIONI = 9;
  public static int PQSL_FAT19_ANNO_DOC = 10;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM28 = 1898;
  public static int PQRY_PARAM28_RS = 1899;
  public static int PQSL_PARAM28_ROWNAMTIPSCA = 0;
  public static int PQSL_PARAM28_ROWNAMEBARCO = 1;
  public static int PQSL_PARAM28_ROWNAMELINK = 2;
  public static int PQSL_PARAM28_ROWNAMEIDENT = 3;
  public static int PQSL_PARAM28_ROWNAMANNPRO = 4;
  public static int PQSL_PARAM28_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAM28_ROWNAMBLOINS = 6;
  public static int PQSL_PARAM28_ROWNAMPERFIL = 7;
  public static int PQSL_PARAM28_ROWNAMVARIBA = 8;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI7 = 1900;
  public static int PQSL_WORKEXPORTI7_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI7_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI7_FASE = 2;
  public static int PQSL_WORKEXPORTI7_FILE_DATI = 3;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_2 = 1901;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI3 = 1902;
  public static int PQSL_WORKEXPORTI3_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI3_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI3_FASE = 2;
  public static int PQSL_WORKEXPORTI3_FILE_DATI = 3;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT3 = 1903;
  public static int PQSL_FAT3_CODICE = 0;
  public static int PQSL_FAT3_ANNO_DOC = 1;
  public static int PQSL_FAT3_NUMERO_DOC = 2;
  public static int PQSL_FAT3_IMPORTO = 3;
  public static int PQSL_FAT3_D_DATA_DOC = 4;
  public static int PQSL_FAT3_NUMERO_PROT = 5;
  public static int PQSL_FAT3_D_DATA_PROT = 6;
  public static int PQSL_FAT3_ANNO_PROG = 7;
  public static int PQSL_FAT3_NUMERO_PROG = 8;
  public static int PQSL_FAT3_D_SCADENZA = 9;
  public static int PQSL_FAT3_NUM_QUIETANZA = 10;
  public static int PQSL_FAT3_DESCRIZIONE = 11;
  public static int PQSL_FAT3_UFFICIO_INVIO = 12;
  public static int PQSL_FAT3_CATEGORIA = 13;
  public static int PQSL_FAT3_TIPO_PAGAMENTO = 14;
  public static int PQSL_FAT3_CODICE_DOC = 15;
  public static int PQSL_FAT3_STORNO = 16;
  public static int PQSL_FAT3_NOTE = 17;
  public static int PQSL_FAT3_ANNO_RIF = 18;
  public static int PQSL_FAT3_NUMERO_RIF = 19;
  public static int PQSL_FAT3_ANNO_PROT = 20;
  public static int PQSL_FAT3_DATA_PROT = 21;
  public static int PQSL_FAT3_DATA_DOC = 22;
  public static int PQSL_FAT3_DIFFERENZA_IVA = 23;
  public static int PQSL_FAT3_ACQUISTO_CEE = 24;
  public static int PQSL_FAT3_MONETA = 25;
  public static int PQSL_FAT3_ESCLUSIONE_ELE = 26;
  public static int PQSL_FAT3_SCADENZA = 27;
  public static int PQSL_FAT3_RIVENDITA = 28;
  public static int PQSL_FAT3_VARIAZIONI = 29;
  public static int PQSL_FAT3_IMPUTATO = 30;
  public static int PQSL_FAT3_BUONI = 31;
  public static int PQSL_FAT3_LIRE_EURO = 32;
  public static int PQSL_FAT3_IMPORTO_EURO = 33;
  public static int PQSL_FAT3_TIPO_UTENZA = 34;
  public static int PQSL_FAT3_CODICE_UTENZA = 35;
  public static int PQSL_FAT3_BLOCCO_PAGAMENTO = 36;
  public static int PQSL_FAT3_COD_IMP_ECO = 37;
  public static int PQSL_FAT3_ANNO_ORDINE = 38;
  public static int PQSL_FAT3_NUMERO_ORDINE = 39;
  public static int PQSL_FAT3_FLAG_IVA_ECO = 40;
  public static int PQSL_FAT3_FLAG_DA_FS4 = 41;
  public static int PQSL_FAT3_DATA_RIENTRO = 42;
  public static int PQSL_FAT3_NUM_UTENTE = 43;
  public static int PQSL_FAT3_ID_DOCUMENTALE = 44;
  public static int PQSL_FAT3_UTENTE_INSERIMENTO = 45;
  public static int PQSL_FAT3_DATA_INSERIMENTO = 46;
  public static int PQSL_FAT3_UTENTE_ULTIMO_AGG = 47;
  public static int PQSL_FAT3_DATA_ULTIMO_AGG = 48;
  public static int PQSL_FAT3_PROGR_UNITA_ORGANIZZATIVA = 49;
  public static int PQSL_FAT3_STATO = 50;
  public static int PQSL_FAT3_NOTE_SOSPENSIONE = 51;
  public static int PQSL_FAT3_PROGR_UO_COMPETENZA = 52;
  public static int PQSL_FAT3_BARCODE = 53;
  public static int PQSL_FAT3_FATIMGDOCUME = 54;
  public static int PQSL_FAT3_FATPERIODDAL = 55;
  public static int PQSL_FAT3_FATAL = 56;
  public static int PQSL_FAT3_FATCONSUMO = 57;
  public static int PQSL_FAT3_FATANNODISUT = 58;
  public static int PQSL_FAT3_FATDISTINTA = 59;
  public static int PQSL_FAT3_FATDEL = 60;
  public static int PQSL_FAT3_FATIDALLEGAT = 61;
  public static int PQSL_FAT3_FATDATAARRIV = 62;
  public static int PQSL_FAT3_FATNUMPROGEN = 63;
  public static int PQSL_FAT3_FATCUP = 64;
  public static int PQSL_FAT3_FATCIG = 65;
  public static int PQSL_FAT3_TRATTAMENTO_IVA = 66;
  public static int PQSL_FAT3_FATIDGDMFE = 67;
  public static int PQSL_FAT3_FATACCETDATA = 68;
  public static int PQSL_FAT3_FATACCETUTEN = 69;
  public static int PQSL_FAT3_FATARRIVO = 70;
  public static int PQSL_FAT3_FATTRATTAMENTO_LOG = 71;
  public static int PQSL_FAT3_FATMOTIVSCAD = 72;
  public static int PQSL_FAT3_FATTIPOACQUI = 73;
  public static int PQSL_FAT3_FATCAUSASOSP = 74;
  public static int PQSL_FAT3_FATSCADESOSP = 75;
  public static int PQSL_FAT3_FATSTATOVALI = 76;
  public static int PQSL_FAT3_FATAVVISFORN = 77;
  public static int PQSL_FAT3_FATALLEGATO = 78;
  public static int PQSL_FAT3_FATUTEULTVAL = 79;
  public static int PQSL_FAT3_FATDATULTVAL = 80;
  public static int PQSL_FAT3_FATMULTISERV = 81;
  public static int PQSL_FAT3_FATFSE = 82;
  public static int PQSL_FAT3_FATINIZISOSP = 83;
  public static int PQSL_FAT3_FATCONTRMINI = 84;
  public static int PQSL_FAT3_FATIMPORPRES = 85;
  public static int PQSL_FAT3_FATIMPORRIMB = 86;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA6 = 1904;
  public static int PQRY_IVA6_RS = 1905;
  public static int PQSL_IVA6_PROGRESSIVO = 0;
  public static int PQSL_IVA6_CODICE_DOC = 1;
  public static int PQSL_IVA6_IMPONIBILE = 2;
  public static int PQSL_IVA6_ALIQUOTA = 3;
  public static int PQSL_IVA6_IVA = 4;
  public static int PQSL_IVA6_CODICE_ESENZIONE = 5;
  public static int PQSL_IVA6_IVA_INDED = 6;
  public static int PQSL_IVA6_IMPONIBILE_CEE = 7;
  public static int PQSL_IVA6_CODICE_STAT = 8;
  public static int PQSL_IVA6_ANNO_PROG = 9;
  public static int PQSL_IVA6_NUMERO_PROG = 10;
  public static int PQSL_IVA6_ROWNAMEINDIM = 11;
  public static int PQSL_IVA6_UTENTE_INSERIMENTO = 12;
  public static int PQSL_IVA6_DATA_INSERIMENTO = 13;
  public static int PQSL_IVA6_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_IVA6_DATA_ULTIMO_AGG = 15;
  public static int PQSL_IVA6_ROWNAMESTATO = 16;
  public static int PQSL_IVA6_ROWNAMERIGA = 17;
  public static int PQSL_IVA6_RECOTIPOREGS = 18;
  public static int PQSL_IVA6_RECOTIPOBOLS = 19;
  public static int PQSL_IVA6_RECOANNOREGS = 20;
  public static int PQSL_IVA6_RECONUMEREGS = 21;
  public static int PQSL_IVA6_RECODDATREGS = 22;
  public static int PQSL_IVA6_RECOTIPOREGI = 23;
  public static int PQSL_IVA6_RECORDSERVIZ = 24;
  public static int PQSL_IVA6_RECORANNOREG = 25;
  public static int PQSL_IVA6_RECORNUMEREG = 26;
  public static int PQSL_IVA6_RECODDATAREG = 27;
  public static int PQSL_IVA6_RECODDATALIQ = 28;
  public static int PQSL_IVA6_RECORTIPODOC = 29;
  public static int PQSL_IVA6_RECORRECVEND = 30;
  public static int PQSL_IVA6_RECROWNAIMSE = 31;
  public static int PQSL_IVA6_RECROWNAIVSE = 32;

  // Table to contain panel selected row: RIT
  //
  public static int PQRY_RIT = 1906;
  public static int PQSL_RIT_ANNO_PROG = 0;
  public static int PQSL_RIT_NUMERO_PROG = 1;
  public static int PQSL_RIT_RITENUTE = 2;
  public static int PQSL_RIT_CODICE = 3;
  public static int PQSL_RIT_CAUSALE_IRPEF = 4;
  public static int PQSL_RIT_IMPONIBILE = 5;
  public static int PQSL_RIT_ALIQUOTA = 6;
  public static int PQSL_RIT_RITENUTE_ENPAM = 7;
  public static int PQSL_RIT_IMPORTO_NON_SOG = 8;
  public static int PQSL_RIT_RITENUTE_IRPEF = 9;
  public static int PQSL_RIT_CODICE_SSN = 10;
  public static int PQSL_RIT_ALIQ_SSN_CD = 11;
  public static int PQSL_RIT_ALIQ_SSN_CE = 12;
  public static int PQSL_RIT_IMPONIBILE_SSN = 13;
  public static int PQSL_RIT_RITENUTE_SSN = 14;
  public static int PQSL_RIT_RITENUTE_SSN_CE = 15;
  public static int PQSL_RIT_CASSA = 16;
  public static int PQSL_RIT_IMPONIBILE_INPS = 17;
  public static int PQSL_RIT_ALIQUOTA_INPS = 18;
  public static int PQSL_RIT_RITENUTE_INPS = 19;
  public static int PQSL_RIT_RITENUTE_INPS_CE = 20;
  public static int PQSL_RIT_ALIQUOTA_ADD = 21;
  public static int PQSL_RIT_RITENUTE_ADD = 22;
  public static int PQSL_RIT_RITENUTE_EURO = 23;
  public static int PQSL_RIT_IMPONIBILE_EURO = 24;
  public static int PQSL_RIT_IMPORTO_NON_SOG_EURO = 25;
  public static int PQSL_RIT_RITENUTE_IRPEF_EURO = 26;
  public static int PQSL_RIT_IMPONIBILE_SSN_EURO = 27;
  public static int PQSL_RIT_RITENUTE_SSN_EURO = 28;
  public static int PQSL_RIT_RITENUTE_SSN_CE_EURO = 29;
  public static int PQSL_RIT_IMPONIBILE_INPS_EURO = 30;
  public static int PQSL_RIT_RITENUTE_INPS_EURO = 31;
  public static int PQSL_RIT_RITENUTE_INPS_CE_EURO = 32;
  public static int PQSL_RIT_RITENUTE_ADD_EURO = 33;
  public static int PQSL_RIT_RITENUTE_CASSE_PROF = 34;
  public static int PQSL_RIT_RITENUTE_CASSE_PROF_EURO = 35;
  public static int PQSL_RIT_ALIQUOTA_ADD_COM = 36;
  public static int PQSL_RIT_RITENUTE_ADD_COM = 37;
  public static int PQSL_RIT_RITENUTE_ADD_COM_EURO = 38;
  public static int PQSL_RIT_CODICE_INAIL = 39;
  public static int PQSL_RIT_ALIQUOTA_INAIL = 40;
  public static int PQSL_RIT_IMPONIBILE_INAIL = 41;
  public static int PQSL_RIT_RITENUTE_INAIL = 42;
  public static int PQSL_RIT_RITENUTE_INAIL_CE = 43;
  public static int PQSL_RIT_IMPONIBILE_INAIL_EURO = 44;
  public static int PQSL_RIT_RITENUTE_INAIL_EURO = 45;
  public static int PQSL_RIT_RITENUTE_INAIL_CE_EURO = 46;
  public static int PQSL_RIT_UTENTE_INSERIMENTO = 47;
  public static int PQSL_RIT_DATA_INSERIMENTO = 48;
  public static int PQSL_RIT_UTENTE_ULTIMO_AGG = 49;
  public static int PQSL_RIT_DATA_ULTIMO_AGG = 50;

  // Table to contain panel selected row: IMP ECO
  //
  public static int PQRY_IMPECO7 = 1907;
  public static int PQSL_IMPECO7_FATTORE = 0;
  public static int PQSL_IMPECO7_CENTRO = 1;
  public static int PQSL_IMPECO7_IMPORTO = 2;
  public static int PQSL_IMPECO7_COMPETENZA_DAL = 3;
  public static int PQSL_IMPECO7_COMPETENZA_AL = 4;
  public static int PQSL_IMPECO7_NO_IVA = 5;
  public static int PQSL_IMPECO7_PROGETTO_ID = 6;
  public static int PQSL_IMPECO7_IMPECONOTE = 7;
  public static int PQSL_IMPECO7_ANNO_PROG = 8;
  public static int PQSL_IMPECO7_NUMERO_PROG = 9;
  public static int PQSL_IMPECO7_ESERCIZIO = 10;
  public static int PQSL_IMPECO7_NOTE = 11;
  public static int PQSL_IMPECO7_PROGRESSIVO = 12;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIAR28 = 1908;
  public static int PQRY_BENEFICIAR28_RS = 1909;
  public static int PQSL_BENEFICIAR28_ROWNAMRASOFA = 0;

  // Table to contain panel selected row: Dettagli Buoni IMDB
  //
  public static int PQRY_DETTBUONIMDB = 1910;
  public static int PQSL_DETTBUONIMDB_NUMERO_BUONO = 0;
  public static int PQSL_DETTBUONIMDB_ANNO_BUONO = 1;
  public static int PQSL_DETTBUONIMDB_PROGRESSIVO_BUONO = 2;
  public static int PQSL_DETTBUONIMDB_DETBUOIMINOR = 3;
  public static int PQSL_DETTBUONIMDB_DETBUOIMDLIQ = 4;
  public static int PQSL_DETTBUONIMDB_CHIUSO = 5;
  public static int PQSL_DETTBUONIMDB_DESCRIZIONE = 6;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI30 = 1911;
  public static int PQRY_FILTRI30_RS = 1912;
  public static int PQSL_FILTRI30_NOMEOGGEESER = 0;
  public static int PQSL_FILTRI30_NOMOGGENTSPE = 1;
  public static int PQSL_FILTRI30_NOMEOGGEPERI = 2;
  public static int PQSL_FILTRI30_NOMOGGFILELI = 3;

  // Table to contain panel selected row: CFAT FILE XML
  //
  public static int PQRY_CFATFILEXML = 1913;
  public static int PQSL_CFATFILEXML_ID_CFAT_FILE_XML = 0;
  public static int PQSL_CFATFILEXML_PERIODO = 1;
  public static int PQSL_CFATFILEXML_NOME_FILE_XML = 2;
  public static int PQSL_CFATFILEXML_SCARIFILEXML = 3;
  public static int PQSL_CFATFILEXML_FILE_XML = 4;
  public static int PQSL_CFATFILEXML_NOME_FILE_ZIP = 5;
  public static int PQSL_CFATFILEXML_SCARIFILEZIP = 6;
  public static int PQSL_CFATFILEXML_ELIMINATO = 7;
  public static int PQSL_CFATFILEXML_RECORDDICHIA = 8;
  public static int PQSL_CFATFILEXML_FILE_ANNULLI = 9;
  public static int PQSL_CFATFILEXML_ID_FILE = 10;
  public static int PQSL_CFATFILEXML_VISUALIESITO = 11;
  public static int PQSL_CFATFILEXML_DATA_CREAZIONE = 12;
  public static int PQSL_CFATFILEXML_UTENTE_CREAZIONE = 13;
  public static int PQSL_CFATFILEXML_STATO_FILE_XML = 14;
  public static int PQSL_CFATFILEXML_RECCFAFIXME1 = 15;
  public static int PQSL_CFATFILEXML_RECFFIXMDARI = 16;
  public static int PQSL_CFATFILEXML_RECCFAFIXMES = 17;
  public static int PQSL_CFATFILEXML_RECCFAFIXMDE = 18;
  public static int PQSL_CFATFILEXML_VISUALDESCRI = 19;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT20 = 1914;
  public static int PQSL_FAT20_CODICE = 0;
  public static int PQSL_FAT20_ANNO_DOC = 1;
  public static int PQSL_FAT20_NUMERO_DOC = 2;
  public static int PQSL_FAT20_IMPORTO = 3;
  public static int PQSL_FAT20_D_DATA_DOC = 4;
  public static int PQSL_FAT20_NUMERO_PROT = 5;
  public static int PQSL_FAT20_D_DATA_PROT = 6;
  public static int PQSL_FAT20_ANNO_PROG = 7;
  public static int PQSL_FAT20_NUMERO_PROG = 8;
  public static int PQSL_FAT20_D_SCADENZA = 9;
  public static int PQSL_FAT20_NUM_QUIETANZA = 10;
  public static int PQSL_FAT20_DESCRIZIONE = 11;
  public static int PQSL_FAT20_UFFICIO_INVIO = 12;
  public static int PQSL_FAT20_CATEGORIA = 13;
  public static int PQSL_FAT20_TIPO_PAGAMENTO = 14;
  public static int PQSL_FAT20_CODICE_DOC = 15;
  public static int PQSL_FAT20_STORNO = 16;
  public static int PQSL_FAT20_FATBENRASOES = 17;
  public static int PQSL_FAT20_FATBENCODFIS = 18;
  public static int PQSL_FAT20_FATPARTITAIV = 19;
  public static int PQSL_FAT20_NOTE = 20;
  public static int PQSL_FAT20_ANNO_RIF = 21;
  public static int PQSL_FAT20_NUMERO_RIF = 22;
  public static int PQSL_FAT20_ANNO_PROT = 23;
  public static int PQSL_FAT20_DATA_PROT = 24;
  public static int PQSL_FAT20_DATA_DOC = 25;
  public static int PQSL_FAT20_DIFFERENZA_IVA = 26;
  public static int PQSL_FAT20_ACQUISTO_CEE = 27;
  public static int PQSL_FAT20_MONETA = 28;
  public static int PQSL_FAT20_ESCLUSIONE_ELE = 29;
  public static int PQSL_FAT20_SCADENZA = 30;
  public static int PQSL_FAT20_RIVENDITA = 31;
  public static int PQSL_FAT20_VARIAZIONI = 32;
  public static int PQSL_FAT20_IMPUTATO = 33;
  public static int PQSL_FAT20_BUONI = 34;
  public static int PQSL_FAT20_LIRE_EURO = 35;
  public static int PQSL_FAT20_IMPORTO_EURO = 36;
  public static int PQSL_FAT20_TIPO_UTENZA = 37;
  public static int PQSL_FAT20_CODICE_UTENZA = 38;
  public static int PQSL_FAT20_BLOCCO_PAGAMENTO = 39;
  public static int PQSL_FAT20_COD_IMP_ECO = 40;
  public static int PQSL_FAT20_ANNO_ORDINE = 41;
  public static int PQSL_FAT20_NUMERO_ORDINE = 42;
  public static int PQSL_FAT20_FLAG_IVA_ECO = 43;
  public static int PQSL_FAT20_FLAG_DA_FS4 = 44;
  public static int PQSL_FAT20_DATA_RIENTRO = 45;
  public static int PQSL_FAT20_NUM_UTENTE = 46;
  public static int PQSL_FAT20_ID_DOCUMENTALE = 47;
  public static int PQSL_FAT20_UTENTE_INSERIMENTO = 48;
  public static int PQSL_FAT20_DATA_INSERIMENTO = 49;
  public static int PQSL_FAT20_UTENTE_ULTIMO_AGG = 50;
  public static int PQSL_FAT20_DATA_ULTIMO_AGG = 51;
  public static int PQSL_FAT20_FATPROUNIORG = 52;
  public static int PQSL_FAT20_STATO = 53;
  public static int PQSL_FAT20_NOTE_SOSPENSIONE = 54;
  public static int PQSL_FAT20_PROGR_UO_COMPETENZA = 55;
  public static int PQSL_FAT20_BARCODE = 56;
  public static int PQSL_FAT20_FATDATAARRIV = 57;
  public static int PQSL_FAT20_FATNUMPROGEN = 58;
  public static int PQSL_FAT20_MULTISERVIZI = 59;
  public static int PQSL_FAT20_FATNUMDOCORD = 60;
  public static int PQSL_FAT20_IMG_DOCUMENTALE = 61;
  public static int PQSL_FAT20_FATESISTALLE = 62;
  public static int PQSL_FAT20_FATTRATTAIVA = 63;
  public static int PQSL_FAT20_ATT = 64;
  public static int PQSL_FAT20_FATIDGDMFE = 65;
  public static int PQSL_FAT20_FATACCETDATA = 66;
  public static int PQSL_FAT20_FATACCETUTEN = 67;
  public static int PQSL_FAT20_FATSALDO = 68;
  public static int PQSL_FAT20_FATCIG = 69;
  public static int PQSL_FAT20_FATCUP = 70;
  public static int PQSL_FAT20_L = 71;
  public static int PQSL_FAT20_DOCDERIVATO = 72;
  public static int PQSL_FAT20_DATADAUSARE = 73;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA8 = 1915;
  public static int PQRY_IVA8_RS = 1916;
  public static int PQSL_IVA8_PROGRESSIVO = 0;
  public static int PQSL_IVA8_CODICE_DOC = 1;
  public static int PQSL_IVA8_IMPONIBILE = 2;
  public static int PQSL_IVA8_ALIQUOTA = 3;
  public static int PQSL_IVA8_IVA = 4;
  public static int PQSL_IVA8_CODICE_ESENZIONE = 5;
  public static int PQSL_IVA8_IVA_INDED = 6;
  public static int PQSL_IVA8_IMPONIBILE_CEE = 7;
  public static int PQSL_IVA8_CODICE_STAT = 8;
  public static int PQSL_IVA8_ANNO_PROG = 9;
  public static int PQSL_IVA8_NUMERO_PROG = 10;
  public static int PQSL_IVA8_ROWNAMEINDIM = 11;
  public static int PQSL_IVA8_UTENTE_INSERIMENTO = 12;
  public static int PQSL_IVA8_DATA_INSERIMENTO = 13;
  public static int PQSL_IVA8_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_IVA8_DATA_ULTIMO_AGG = 15;
  public static int PQSL_IVA8_ROWNAMESTATO = 16;
  public static int PQSL_IVA8_ROWNAMERIGA = 17;
  public static int PQSL_IVA8_RECORRECVEND = 18;
  public static int PQSL_IVA8_RECRONATIRES = 19;
  public static int PQSL_IVA8_RECRONATIBOS = 20;
  public static int PQSL_IVA8_RECRONANURES = 21;
  public static int PQSL_IVA8_RECROWNATIRE = 22;
  public static int PQSL_IVA8_RECROWNAMSER = 23;
  public static int PQSL_IVA8_RECROWNANURE = 24;
  public static int PQSL_IVA8_RECRONADDARE = 25;
  public static int PQSL_IVA8_RERONADDARES = 26;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO11 = 1917;
  public static int PQRY_FILTRO11_RS = 1918;
  public static int PQSL_FILTRO11_ROWNAMCODFOR = 0;
  public static int PQSL_FILTRO11_ROWNAMEPARTE = 1;
  public static int PQSL_FILTRO11_ROWNAMEESERC = 2;
  public static int PQSL_FILTRO11_ROWNAMEPERIO = 3;

  // Table to contain panel selected row: Pars CFXML
  //
  public static int PQRY_PARSCFXML2 = 1919;
  public static int PQRY_PARSCFXML2_RS = 1920;
  public static int PQSL_PARSCFXML2_NOMEOGGEESER = 0;
  public static int PQSL_PARSCFXML2_NOMEOGGETTES = 1;
  public static int PQSL_PARSCFXML2_NOMOGGDATRIF = 2;
  public static int PQSL_PARSCFXML2_NOMOGGCOFIDI = 3;
  public static int PQSL_PARSCFXML2_NOMOGGCOCADI = 4;
  public static int PQSL_PARSCFXML2_NOMEOGGEPERI = 5;
  public static int PQSL_PARSCFXML2_NOMOGGDESPER = 6;
  public static int PQSL_PARSCFXML2_DESCRIZIONE = 7;

  // Table to contain panel selected row: Pars CFXML
  //
  public static int PQRY_PARSCFXML1 = 1921;
  public static int PQSL_PARSCFXML1_ID_CFAT_FILE_XML = 0;
  public static int PQSL_PARSCFXML1_DESCRIZIONE = 1;

  // Table to contain panel selected row: Pars Fatture Inviate
  //
  public static int PQRY_PARSFATTINVI = 1922;
  public static int PQRY_PARSFATTINVI_RS = 1923;
  public static int PQSL_PARSFATTINVI_NOMEOGGEIDFI = 0;
  public static int PQSL_PARSFATTINVI_NOMEOGGEESER = 1;
  public static int PQSL_PARSFATTINVI_NOMOGGENTSPE = 2;
  public static int PQSL_PARSFATTINVI_NOMOGGNOFIXM = 3;
  public static int PQSL_PARSFATTINVI_NOMEOGGEELIM = 4;
  public static int PQSL_PARSFATTINVI_NOMEOGGEPERI = 5;

  // Table to contain panel selected row: CFAT DOCUMENTI FILE XML
  //
  public static int PQRY_CFADOCFILXML = 1924;
  public static int PQSL_CFADOCFILXML_RECFDOIDCFFX = 0;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMS1 = 1;
  public static int PQSL_CFADOCFILXML_RECFDOFIXFAP = 2;
  public static int PQSL_CFADOCFILXML_RECFDOFIXFNP = 3;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMSD = 4;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMSN = 5;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMSC = 6;
  public static int PQSL_CFADOCFILXML_RECFDOFIXSPI = 7;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMSP = 8;
  public static int PQSL_CFADOCFILXML_RECFDOFIXSCF = 9;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMAN = 10;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMTD = 11;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMDD = 12;
  public static int PQSL_CFADOCFILXML_RECFDOFIXMND = 13;
  public static int PQSL_CFADOCFILXML_RECFDOFIXDRD = 14;
  public static int PQSL_CFADOCFILXML_RECOINFOFATT = 15;

  // Table to contain panel selected row: CFAT DOC DETTAGLIO FILE XML
  //
  public static int PQRY_CFADOCDEFIXM = 1925;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFXPD = 0;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFXII = 1;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFIXI = 2;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFIXA = 3;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFIXN = 4;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFIX1 = 5;
  public static int PQSL_CFADOCDEFIXM_RECFDODEFIXD = 6;

  // Table to contain panel selected row: Pars Elenco File Zip
  //
  public static int PQRY_PARELEFILZI1 = 1926;
  public static int PQRY_PARELEFILZI1_RS = 1927;
  public static int PQSL_PARELEFILZI1_NOMEOGGEESER = 0;
  public static int PQSL_PARELEFILZI1_NOMOGGENTSPE = 1;
  public static int PQSL_PARELEFILZI1_NOMEOGGEPERI = 2;
  public static int PQSL_PARELEFILZI1_NOMOGGFILELI = 3;

  // Table to contain panel selected row: CFAT FILE ZIP
  //
  public static int PQRY_CFATFILEZIP = 1928;
  public static int PQSL_CFATFILEZIP_RECCFANOFIZI = 0;
  public static int PQSL_CFATFILEZIP_RECFFIZIDACR = 1;
  public static int PQSL_CFATFILEZIP_SCARIFILEZIP = 2;
  public static int PQSL_CFATFILEZIP_RECORDELIMIN = 3;
  public static int PQSL_CFATFILEZIP_RECFFIZIFIAN = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI597 = 1929;
  public static int PQSL_PARAMETRI597_PROGRESSIVO = 0;
  public static int PQSL_PARAMETRI597_SESSIONE = 1;
  public static int PQSL_PARAMETRI597_FASE = 2;
  public static int PQSL_PARAMETRI597_FILE_DATI = 3;

  // Table to contain panel selected row: CFAT ESITI FILE
  //
  public static int PQRY_CFATESITFILE = 1930;
  public static int PQSL_CFATESITFILE_RECFESNOFIES = 0;
  public static int PQSL_CFATESITFILE_RECCFAESTIFI = 1;
  public static int PQSL_CFATESITFILE_RECFESFIDARI = 2;
  public static int PQSL_CFATESITFILE_RECCFAESFIES = 3;
  public static int PQSL_CFATESITFILE_RECFESFIIDAR = 4;
  public static int PQSL_CFATESITFILE_RECFESFINOAR = 5;
  public static int PQSL_CFATESITFILE_RECFESFICOER = 6;
  public static int PQSL_CFATESITFILE_RECFESFIDEER = 7;
  public static int PQSL_CFATESITFILE_RECFESFIMEID = 8;
  public static int PQSL_CFATESITFILE_RECCFAESFINO = 9;
  public static int PQSL_CFATESITFILE_APRINOTE = 10;
  public static int PQSL_CFATESITFILE_DOWNLOAD = 11;
  public static int PQSL_CFATESITFILE_RECCFAESFIXM = 12;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT16 = 1931;
  public static int PQSL_FAT16_CODICE = 0;
  public static int PQSL_FAT16_ANNO_DOC = 1;
  public static int PQSL_FAT16_NUMERO_DOC = 2;
  public static int PQSL_FAT16_IMPORTO = 3;
  public static int PQSL_FAT16_D_DATA_DOC = 4;
  public static int PQSL_FAT16_NUMERO_PROT = 5;
  public static int PQSL_FAT16_D_DATA_PROT = 6;
  public static int PQSL_FAT16_ANNO_PROG = 7;
  public static int PQSL_FAT16_NUMERO_PROG = 8;
  public static int PQSL_FAT16_D_SCADENZA = 9;
  public static int PQSL_FAT16_NUM_QUIETANZA = 10;
  public static int PQSL_FAT16_DESCRIZIONE = 11;
  public static int PQSL_FAT16_UFFICIO_INVIO = 12;
  public static int PQSL_FAT16_CATEGORIA = 13;
  public static int PQSL_FAT16_TIPO_PAGAMENTO = 14;
  public static int PQSL_FAT16_CODICE_DOC = 15;
  public static int PQSL_FAT16_STORNO = 16;
  public static int PQSL_FAT16_FATRAGIOSOCI = 17;
  public static int PQSL_FAT16_NOTE = 18;
  public static int PQSL_FAT16_ANNO_RIF = 19;
  public static int PQSL_FAT16_NUMERO_RIF = 20;
  public static int PQSL_FAT16_ANNO_PROT = 21;
  public static int PQSL_FAT16_DATA_PROT = 22;
  public static int PQSL_FAT16_DATA_DOC = 23;
  public static int PQSL_FAT16_DIFFERENZA_IVA = 24;
  public static int PQSL_FAT16_ACQUISTO_CEE = 25;
  public static int PQSL_FAT16_MONETA = 26;
  public static int PQSL_FAT16_ESCLUSIONE_ELE = 27;
  public static int PQSL_FAT16_SCADENZA = 28;
  public static int PQSL_FAT16_RIVENDITA = 29;
  public static int PQSL_FAT16_VARIAZIONI = 30;
  public static int PQSL_FAT16_IMPUTATO = 31;
  public static int PQSL_FAT16_BUONI = 32;
  public static int PQSL_FAT16_LIRE_EURO = 33;
  public static int PQSL_FAT16_IMPORTO_EURO = 34;
  public static int PQSL_FAT16_TIPO_UTENZA = 35;
  public static int PQSL_FAT16_CODICE_UTENZA = 36;
  public static int PQSL_FAT16_BLOCCO_PAGAMENTO = 37;
  public static int PQSL_FAT16_COD_IMP_ECO = 38;
  public static int PQSL_FAT16_ANNO_ORDINE = 39;
  public static int PQSL_FAT16_NUMERO_ORDINE = 40;
  public static int PQSL_FAT16_FLAG_IVA_ECO = 41;
  public static int PQSL_FAT16_FLAG_DA_FS4 = 42;
  public static int PQSL_FAT16_DATA_RIENTRO = 43;
  public static int PQSL_FAT16_NUM_UTENTE = 44;
  public static int PQSL_FAT16_ID_DOCUMENTALE = 45;
  public static int PQSL_FAT16_UTENTE_INSERIMENTO = 46;
  public static int PQSL_FAT16_DATA_INSERIMENTO = 47;
  public static int PQSL_FAT16_UTENTE_ULTIMO_AGG = 48;
  public static int PQSL_FAT16_DATA_ULTIMO_AGG = 49;
  public static int PQSL_FAT16_FATPROUNIORG = 50;
  public static int PQSL_FAT16_STATO = 51;
  public static int PQSL_FAT16_NOTE_SOSPENSIONE = 52;
  public static int PQSL_FAT16_PROGR_UO_COMPETENZA = 53;
  public static int PQSL_FAT16_BARCODE = 54;
  public static int PQSL_FAT16_FATDATAARRIV = 55;
  public static int PQSL_FAT16_FATNUMPROGEN = 56;
  public static int PQSL_FAT16_MULTISERVIZI = 57;
  public static int PQSL_FAT16_FATRAGSOCORD = 58;
  public static int PQSL_FAT16_FATNUMDOCORD = 59;
  public static int PQSL_FAT16_IMG_DOCUMENTALE = 60;
  public static int PQSL_FAT16_FATESISTALLE = 61;
  public static int PQSL_FAT16_FATTRATTAIVA = 62;
  public static int PQSL_FAT16_ATT = 63;
  public static int PQSL_FAT16_FATSTATO = 64;
  public static int PQSL_FAT16_FATIDGDMFE = 65;
  public static int PQSL_FAT16_FATACCETDATA = 66;
  public static int PQSL_FAT16_FATACCETUTEN = 67;
  public static int PQSL_FAT16_FATSALDO = 68;
  public static int PQSL_FAT16_FATCIG = 69;
  public static int PQSL_FAT16_FATCUP = 70;
  public static int PQSL_FAT16_L = 71;
  public static int PQSL_FAT16_DOCDERIVATO = 72;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA12 = 1932;
  public static int PQRY_IVA12_RS = 1933;
  public static int PQSL_IVA12_PROGRESSIVO = 0;
  public static int PQSL_IVA12_CODICE_DOC = 1;
  public static int PQSL_IVA12_IMPONIBILE = 2;
  public static int PQSL_IVA12_ALIQUOTA = 3;
  public static int PQSL_IVA12_IVA = 4;
  public static int PQSL_IVA12_CODICE_ESENZIONE = 5;
  public static int PQSL_IVA12_IVA_INDED = 6;
  public static int PQSL_IVA12_IMPONIBILE_CEE = 7;
  public static int PQSL_IVA12_CODICE_STAT = 8;
  public static int PQSL_IVA12_ANNO_PROG = 9;
  public static int PQSL_IVA12_NUMERO_PROG = 10;
  public static int PQSL_IVA12_ROWNAMEINDIM = 11;
  public static int PQSL_IVA12_UTENTE_INSERIMENTO = 12;
  public static int PQSL_IVA12_DATA_INSERIMENTO = 13;
  public static int PQSL_IVA12_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_IVA12_DATA_ULTIMO_AGG = 15;
  public static int PQSL_IVA12_ROWNAMESTATO = 16;
  public static int PQSL_IVA12_ROWNAMERIGA = 17;
  public static int PQSL_IVA12_RECORRECVEND = 18;
  public static int PQSL_IVA12_RECRONATIRES = 19;
  public static int PQSL_IVA12_RECRONATIBOS = 20;
  public static int PQSL_IVA12_RECRONANURES = 21;
  public static int PQSL_IVA12_RECROWNATIRE = 22;
  public static int PQSL_IVA12_RECROWNAMSER = 23;
  public static int PQSL_IVA12_RECROWNANURE = 24;
  public static int PQSL_IVA12_RECRONADDARE = 25;
  public static int PQSL_IVA12_RERONADDARES = 26;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO18 = 1934;
  public static int PQRY_FILTRO18_RS = 1935;
  public static int PQSL_FILTRO18_ROWNAMAPARDA = 0;
  public static int PQSL_FILTRO18_ROWNAMCODFOR = 1;
  public static int PQSL_FILTRO18_ROWNAMEORDIN = 2;
  public static int PQSL_FILTRO18_ROWNAMEPARTE = 3;
  public static int PQSL_FILTRO18_ROWNAMEAL = 4;
  public static int PQSL_FILTRO18_ROWNAMUNIORG = 5;
  public static int PQSL_FILTRO18_ROWNAMESTATO = 6;

  // Table to contain panel selected row: LIQ FATTURE BUONI
  //
  public static int PQRY_LIQFATTUBUON = 1936;
  public static int PQSL_LIQFATTUBUON_ANNO_DISTINTA = 0;
  public static int PQSL_LIQFATTUBUON_NUMERO_DISTINTA = 1;
  public static int PQSL_LIQFATTUBUON_DATA_REGISTRAZIONE = 2;
  public static int PQSL_LIQFATTUBUON_IMPORTO = 3;
  public static int PQSL_LIQFATTUBUON_ANNO_LIQ = 4;
  public static int PQSL_LIQFATTUBUON_NUMERO_LIQ = 5;
  public static int PQSL_LIQFATTUBUON_NUMERO_MAND = 6;
  public static int PQSL_LIQFATTUBUON_DATA_MAND = 7;
  public static int PQSL_LIQFATTUBUON_D_DATA_REG = 8;
  public static int PQSL_LIQFATTUBUON_D_DATA_MAND = 9;
  public static int PQSL_LIQFATTUBUON_LIFABUDILIUP = 10;
  public static int PQSL_LIQFATTUBUON_LIFABUDILIAP = 11;
  public static int PQSL_LIQFATTUBUON_LIFABUDILINP = 12;
  public static int PQSL_LIQFATTUBUON_INFOPROP = 13;
  public static int PQSL_LIQFATTUBUON_LIFABUDILIAD = 14;
  public static int PQSL_LIQFATTUBUON_LIFABUDILIND = 15;
  public static int PQSL_LIQFATTUBUON_LIFABUDILISD = 16;
  public static int PQSL_LIQFATTUBUON_INFODEL = 17;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS91 = 1937;
  public static int PQRY_PARS91_RS = 1938;
  public static int PQSL_PARS91_NOMEOGGPROUO = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA5 = 1939;
  public static int QSL_CFASELINTVA5_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA6 = 1940;
  public static int QSL_CFASELINTVA6_COUNT = 0;

  // Table to contain panel selected row: ERRORI RETT MASS UO
  //
  public static int PQRY_ERRORETMASU1 = 1941;
  public static int PQRY_ERRORETMASU1_RS = 1942;
  public static int PQSL_ERRORETMASU1_ERRORNUMEDOC = 0;
  public static int PQSL_ERRORETMASU1_ERRODDATADOC = 1;
  public static int PQSL_ERRORETMASU1_ERROREOKKO = 2;
  public static int PQSL_ERRORETMASU1_DESCRIERRORE = 3;

  // Table to contain panel selected row: Parametri Import
  //
  public static int PQRY_PARAMEIMPOR2 = 1943;
  public static int PQRY_PARAMEIMPOR2_RS = 1944;
  public static int PQSL_PARAMEIMPOR2_NOMEOGGEPROG = 0;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI1 = 1945;
  public static int PQSL_WORKEXPORTI1_FILE_DATI = 0;
  public static int PQSL_WORKEXPORTI1_FASE = 1;
  public static int PQSL_WORKEXPORTI1_SESSIONE = 2;
  public static int PQSL_WORKEXPORTI1_PROGRESSIVO = 3;

  // Table to contain panel selected row: WRK DOC SAMASH
  //
  public static int PQRY_WRKDOCSAMAS1 = 1946;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAANPR = 0;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSANUPR = 1;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAANDO = 2;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSANUDO = 3;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSADADO = 4;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAMNOT = 5;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAFACO = 6;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAT0DE = 7;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAFAIM = 8;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAMSAL = 9;
  public static int PQSL_WRKDOCSAMAS1_WRDOSAFANUPR = 10;
  public static int PQSL_WRKDOCSAMAS1_WRDOSAFADDDP = 11;
  public static int PQSL_WRKDOCSAMAS1_WRDOSAFANUPG = 12;
  public static int PQSL_WRKDOCSAMAS1_WRDOSAFADAAR = 13;
  public static int PQSL_WRKDOCSAMAS1_WRKDOCSAMINF = 14;

  // Table to contain panel selected row: WRK DOC SAMASH
  //
  public static int PQRY_WRKDOCSAMAS2 = 1947;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAANPR = 0;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSANUPR = 1;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAANDO = 2;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSANUDO = 3;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSADADO = 4;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAMNOT = 5;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAFACO = 6;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAT0DE = 7;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAFAIM = 8;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAMSAL = 9;
  public static int PQSL_WRKDOCSAMAS2_WRDOSAFANUPR = 10;
  public static int PQSL_WRKDOCSAMAS2_WRDOSAFADDDP = 11;
  public static int PQSL_WRKDOCSAMAS2_WRDOSAFANUPG = 12;
  public static int PQSL_WRKDOCSAMAS2_WRDOSAFADAAR = 13;
  public static int PQSL_WRKDOCSAMAS2_WRKDOCSAMINF = 14;

  // Table to contain panel selected row: WRK DIST SAMASH
  //
  public static int PQRY_WRKDISTSAMAS = 1948;
  public static int PQSL_WRKDISTSAMAS_RECONUMEDIST = 0;
  public static int PQSL_WRKDISTSAMAS_RECOANNODIST = 1;
  public static int PQSL_WRKDISTSAMAS_RECDISLIDADI = 2;
  public static int PQSL_WRKDISTSAMAS_RECORDSTATO = 3;
  public static int PQSL_WRKDISTSAMAS_REDILIPRUNOR = 4;

  // Table to contain panel selected row: WRK DOC SAMASH
  //
  public static int PQRY_WRKDOCSAMASH = 1949;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAANPR = 0;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSANUPR = 1;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAANDO = 2;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSANUDO = 3;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSADADO = 4;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAMNOT = 5;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAFACO = 6;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAT0DE = 7;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAFAIM = 8;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAMSAL = 9;
  public static int PQSL_WRKDOCSAMASH_WRDOSAFANUPR = 10;
  public static int PQSL_WRKDOCSAMASH_WRDOSAFADDDP = 11;
  public static int PQSL_WRKDOCSAMASH_WRDOSAFANUPG = 12;
  public static int PQSL_WRKDOCSAMASH_WRDOSAFADAAR = 13;
  public static int PQSL_WRKDOCSAMASH_WRKDOCSAMINF = 14;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM2 = 1950;
  public static int PQRY_PARAM2_RS = 1951;
  public static int PQSL_PARAM2_ROWNAMNUMBOL = 0;
  public static int PQSL_PARAM2_ROWNAMDATBOL = 1;

  // Table to contain panel selected row: DETTAGLI BUONI
  //
  public static int PQRY_DETTAGLBUON1 = 1952;
  public static int PQSL_DETTAGLBUON1_ANNO_BUONO = 0;
  public static int PQSL_DETTAGLBUON1_NUMERO_BUONO = 1;
  public static int PQSL_DETTAGLBUON1_DETBUODAEMBU = 2;
  public static int PQSL_DETTAGLBUON1_DETBUOINFORD = 3;
  public static int PQSL_DETTAGLBUON1_PROGRESSIVO_BUONO = 4;
  public static int PQSL_DETTAGLBUON1_DESCRIZIONE = 5;
  public static int PQSL_DETTAGLBUON1_DETTBUONIMPO = 6;
  public static int PQSL_DETTAGLBUON1_DETTBUONLIQU = 7;
  public static int PQSL_DETTAGLBUON1_GRUPPO = 8;
  public static int PQSL_DETTAGLBUON1_DETTBUONSELE = 9;
  public static int PQSL_DETTAGLBUON1_CENTRO = 10;
  public static int PQSL_DETTAGLBUON1_FATTORE = 11;
  public static int PQSL_DETTAGLBUON1_COMPETENZA_DAL = 12;
  public static int PQSL_DETTAGLBUON1_COMPETENZA_AL = 13;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV77 = 1953;
  public static int QSL_CFASELINTV77_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV74 = 1954;
  public static int QSL_CFASELINTV74_SUNUVAFABII0 = 0;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT10 = 1955;
  public static int PQRY_FAT10_RS = 1956;
  public static int PQSL_FAT10_CODICE = 0;
  public static int PQSL_FAT10_ANNO_DOC = 1;
  public static int PQSL_FAT10_NUMERO_DOC = 2;
  public static int PQSL_FAT10_IMPORTO = 3;
  public static int PQSL_FAT10_D_DATA_DOC = 4;
  public static int PQSL_FAT10_VARIAZIONI = 5;
  public static int PQSL_FAT10_IMPUTATO = 6;
  public static int PQSL_FAT10_NUMERO_PROT = 7;
  public static int PQSL_FAT10_D_DATA_PROT = 8;
  public static int PQSL_FAT10_ANNO_PROG = 9;
  public static int PQSL_FAT10_NUMERO_PROG = 10;
  public static int PQSL_FAT10_FATLIQUIDABI = 11;
  public static int PQSL_FAT10_FATFORNITORE = 12;
  public static int PQSL_FAT10_INFOFORNITOR = 13;
  public static int PQSL_FAT10_INFOFATTURA = 14;
  public static int PQSL_FAT10_FATIDGDMFE = 15;
  public static int PQSL_FAT10_FATACCETDATA = 16;
  public static int PQSL_FAT10_FATACCETUTEN = 17;
  public static int PQSL_FAT10_FATCHIOCCIOL = 18;
  public static int PQSL_FAT10_RIEPILOGOIVA = 19;
  public static int PQSL_FAT10_FATCIG = 20;
  public static int PQSL_FAT10_FATCUP = 21;

  // Table to contain panel selected row: Dettagli Buoni IMDB
  //
  public static int PQRY_DETTBUONIMD3 = 1957;
  public static int PQRY_DETTBUONIMD3_RS = 1958;
  public static int PQSL_DETTBUONIMD3_ANNO_BUONO = 0;
  public static int PQSL_DETTBUONIMD3_NUMERO_BUONO = 1;
  public static int PQSL_DETTBUONIMD3_PROGRESSIVO_BUONO = 2;
  public static int PQSL_DETTBUONIMD3_FATBUOIMDIMP = 3;
  public static int PQSL_DETTBUONIMD3_DETBUOIMDLIQ = 4;
  public static int PQSL_DETTBUONIMD3_DETBUOIMOLLI = 5;
  public static int PQSL_DETTBUONIMD3_DETBUOIMDEIM = 6;
  public static int PQSL_DETTBUONIMD3_DEBUIMELCOOR = 7;
  public static int PQSL_DETTBUONIMD3_FATBUOIMDCHI = 8;
  public static int PQSL_DETTBUONIMD3_FATBUOIMDDES = 9;
  public static int PQSL_DETTBUONIMD3_FATBUOIMQUAR = 10;
  public static int PQSL_DETTBUONIMD3_FATBUOIMDSTA = 11;
  public static int PQSL_DETTBUONIMD3_FATBUOIMPRBO = 12;
  public static int PQSL_DETTBUONIMD3_DEBUIMELCOBO = 13;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA9 = 1959;
  public static int QSL_CFASELINTVA9_SUNUVAFABII0 = 0;

  // Recordset for query: Fatture Buoni IMDB
  //
  public static int QRY_FATTBUONIMD5 = 1960;
  public static int QSL_FATTBUONIMD5_FATBUOIMANBU = 0;
  public static int QSL_FATTBUONIMD5_FATBUOIMNUBU = 1;
  public static int QSL_FATTBUONIMD5_FATBUOIMPRBU = 2;
  public static int QSL_FATTBUONIMD5_FATBUOIMPRIM = 3;
  public static int QSL_FATTBUONIMD5_FATBUOIMDARE = 4;
  public static int QSL_FATTBUONIMD5_FATBUOIMUTIN = 5;
  public static int QSL_FATTBUONIMD5_FATBUOIMDPRO = 6;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO4 = 1961;
  public static int PQRY_FILTRO4_RS = 1962;
  public static int PQSL_FILTRO4_ROWNAMAPARDA = 0;
  public static int PQSL_FILTRO4_ROWNAMCODFOR = 1;
  public static int PQSL_FILTRO4_ROWNAMEORDIN = 2;
  public static int PQSL_FILTRO4_ROWNAMANCCHI = 3;
  public static int PQSL_FILTRO4_ROWNAMNUMFAT = 4;

  // Recordset for query: Fatture Buoni IMDB
  //
  public static int QRY_FATTBUONIMD4 = 1963;
  public static int QSL_FATTBUONIMD4_FATBUOIMANBU = 0;
  public static int QSL_FATTBUONIMD4_FATBUOIMNUBU = 1;

  // Table to contain panel selected row: FATTURE BUONI
  //
  public static int PQRY_FATTUREBUON1 = 1964;
  public static int PQRY_FATTUREBUON1_RS = 1965;
  public static int PQSL_FATTUREBUON1_FATTURPROGRE = 0;
  public static int PQSL_FATTUREBUON1_FATTUNUMEIMP = 1;
  public static int PQSL_FATTUREBUON1_FATTUANNOIMP = 2;
  public static int PQSL_FATTUREBUON1_FATNUMSUBIMP = 3;
  public static int PQSL_FATTUREBUON1_FATANNSUBIMP = 4;
  public static int PQSL_FATTUREBUON1_FATTURIMPUTA = 5;

  // Table to contain panel selected row: BOLLE
  //
  public static int PQRY_BOLLE1 = 1966;
  public static int PQRY_BOLLE1_RS = 1967;
  public static int PQSL_BOLLE1_PROGRESSIVO = 0;
  public static int PQSL_BOLLE1_NUMERO_BOLLA = 1;
  public static int PQSL_BOLLE1_DATA_BOLLA = 2;

  // Table to contain panel selected row: DETTAGLI BOLLE
  //
  public static int PQRY_DETTAGLBOLL1 = 1968;
  public static int PQSL_DETTAGLBOLL1_QUANTITA = 0;
  public static int PQSL_DETTAGLBOLL1_ANNO_BUONO = 1;
  public static int PQSL_DETTAGLBOLL1_NUMERO_BUONO = 2;
  public static int PQSL_DETTAGLBOLL1_PROGRESSIVO_BUONO = 3;
  public static int PQSL_DETTAGLBOLL1_PROGRESSIVO_DETTAGLIO = 4;
  public static int PQSL_DETTAGLBOLL1_DESCRIZIONE = 5;
  public static int PQSL_DETTAGLBOLL1_DETTBOLLIMPO = 6;
  public static int PQSL_DETTAGLBOLL1_DETTBOLLINFO = 7;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV76 = 1969;
  public static int QSL_CFASELINTV76_SUMFATBUIMIM = 0;

  // Recordset for query: Dettagli Bolle
  //
  public static int QRY_DETTAGLBOLL3 = 1970;
  public static int QSL_DETTAGLBOLL3_ROWNAMEIMPOR = 0;
  public static int QSL_DETTAGLBOLL3_ROWNAMPROBOL = 1;
  public static int QSL_DETTAGLBOLL3_ROWNAMPRODET = 2;

  // Recordset for query: Dettagli Bolle
  //
  public static int QRY_DETTAGLBOLL4 = 1971;
  public static int QSL_DETTAGLBOLL4_ROWNAMEIMPOR = 0;
  public static int QSL_DETTAGLBOLL4_ROWNAMPROBOL = 1;
  public static int QSL_DETTAGLBOLL4_ROWNAMANNBUO = 2;
  public static int QSL_DETTAGLBOLL4_ROWNAMNUMBUO = 3;
  public static int QSL_DETTAGLBOLL4_ROWNAMPROBUO = 4;
  public static int QSL_DETTAGLBOLL4_RIGABOLLA = 5;

  // Table to contain panel selected row: BUONI
  //
  public static int PQRY_BUONI6 = 1972;
  public static int PQSL_BUONI6_ANNO_BUONO = 0;
  public static int PQSL_BUONI6_NUMERO_BUONO = 1;
  public static int PQSL_BUONI6_DATA_EM_BUONO = 2;
  public static int PQSL_BUONI6_RECORDFATTUR = 3;
  public static int PQSL_BUONI6_RECORDAPRI = 4;
  public static int PQSL_BUONI6_CODICE = 5;
  public static int PQSL_BUONI6_TIPO_SCADENZA = 6;
  public static int PQSL_BUONI6_NOTE = 7;
  public static int PQSL_BUONI6_NOTE_TESTA = 8;
  public static int PQSL_BUONI6_NOTE_CODA = 9;
  public static int PQSL_BUONI6_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_BUONI6_DATA_ULTIMO_AGG = 11;
  public static int PQSL_BUONI6_UTENTE = 12;
  public static int PQSL_BUONI6_DATA_REGISTRAZIONE = 13;
  public static int PQSL_BUONI6_PROGR_UNITA_ORGANIZZATIVA = 14;
  public static int PQSL_BUONI6_RECOINFOSOGG = 15;
  public static int PQSL_BUONI6_OFFERTA = 16;
  public static int PQSL_BUONI6_DESTINAZIONE = 17;
  public static int PQSL_BUONI6_INVIATO = 18;
  public static int PQSL_BUONI6_SETTORE_OPERATIVO = 19;
  public static int PQSL_BUONI6_SERVIZIO_OPERATIVO = 20;
  public static int PQSL_BUONI6_RECORDCHIUSO = 21;
  public static int PQSL_BUONI6_RECORDINVIAT = 22;
  public static int PQSL_BUONI6_RECOCODIMEPA = 23;

  // Table to contain panel selected row: DETTAGLI BUONI
  //
  public static int PQRY_DETTAGLBUON3 = 1973;
  public static int PQSL_DETTAGLBUON3_PROGRESSIVO_BUONO = 0;
  public static int PQSL_DETTAGLBUON3_CATEGORIA_PRODOTTO = 1;
  public static int PQSL_DETTAGLBUON3_DESCRIZIONE = 2;
  public static int PQSL_DETTAGLBUON3_NOTE = 3;
  public static int PQSL_DETTAGLBUON3_DETBUOAPRNOT = 4;
  public static int PQSL_DETTAGLBUON3_QUANTITA = 5;
  public static int PQSL_DETTAGLBUON3_PREZZO = 6;
  public static int PQSL_DETTAGLBUON3_UNITA_MISURA = 7;
  public static int PQSL_DETTAGLBUON3_IMPORTO = 8;
  public static int PQSL_DETTAGLBUON3_CHIUSO = 9;
  public static int PQSL_DETTAGLBUON3_VOCE_ECON = 10;
  public static int PQSL_DETTAGLBUON3_CODICE_GESTIONALE = 11;
  public static int PQSL_DETTAGLBUON3_FATTORE = 12;
  public static int PQSL_DETTAGLBUON3_CENTRO = 13;
  public static int PQSL_DETTAGLBUON3_COMPETENZA_DAL = 14;
  public static int PQSL_DETTAGLBUON3_COMPETENZA_AL = 15;
  public static int PQSL_DETTAGLBUON3_DESTINAZIONE = 16;
  public static int PQSL_DETTAGLBUON3_OFFERTA = 17;
  public static int PQSL_DETTAGLBUON3_RILEVANTE_ECO = 18;
  public static int PQSL_DETTAGLBUON3_UTENTE_ULTIMO_AGG = 19;
  public static int PQSL_DETTAGLBUON3_DATA_ULTIMO_AGG = 20;
  public static int PQSL_DETTAGLBUON3_ANNO_BUONO = 21;
  public static int PQSL_DETTAGLBUON3_NUMERO_BUONO = 22;
  public static int PQSL_DETTAGLBUON3_UTENTE = 23;
  public static int PQSL_DETTAGLBUON3_DATA_REG = 24;
  public static int PQSL_DETTAGLBUON3_GRUPPO = 25;
  public static int PQSL_DETTAGLBUON3_DETTABUONCIG = 26;
  public static int PQSL_DETTAGLBUON3_DETTABUONCUP = 27;

  // Table to contain panel selected row: DETTAGLI IMPEGNI BUONI
  //
  public static int PQRY_DETTIMPEBUO4 = 1974;
  public static int PQRY_DETTIMPEBUO4_RS = 1975;
  public static int PQSL_DETTIMPEBUO4_ANNO_IMP = 0;
  public static int PQSL_DETTIMPEBUO4_NUMERO_IMP = 1;
  public static int PQSL_DETTIMPEBUO4_ANNO_SUBIMP = 2;
  public static int PQSL_DETTIMPEBUO4_NUMERO_SUBIMP = 3;
  public static int PQSL_DETTIMPEBUO4_IMPORTO = 4;
  public static int PQSL_DETTIMPEBUO4_FINANZIAMENTO = 5;
  public static int PQSL_DETTIMPEBUO4_UTENTE_INSERIMENTO = 6;
  public static int PQSL_DETTIMPEBUO4_DATA_INSERIMENTO = 7;
  public static int PQSL_DETTIMPEBUO4_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_DETTIMPEBUO4_DATA_ULTIMO_AGG = 9;
  public static int PQSL_DETTIMPEBUO4_ANNO_BUONO = 10;
  public static int PQSL_DETTIMPEBUO4_NUMERO_BUONO = 11;
  public static int PQSL_DETTIMPEBUO4_PROGRESSIVO_BUONO = 12;
  public static int PQSL_DETTIMPEBUO4_PROGRESSIVO_IMP = 13;
  public static int PQSL_DETTIMPEBUO4_ANNO_PROPOSTA = 14;
  public static int PQSL_DETTIMPEBUO4_NUMERO_PROPOSTA = 15;
  public static int PQSL_DETTIMPEBUO4_UNITA_PROPONENTE = 16;
  public static int PQSL_DETTIMPEBUO4_ANNO_DEL = 17;
  public static int PQSL_DETTIMPEBUO4_NUMERO_DEL = 18;
  public static int PQSL_DETTIMPEBUO4_SEDE_DEL = 19;
  public static int PQSL_DETTIMPEBUO4_FATTURATO = 20;
  public static int PQSL_DETTIMPEBUO4_VARIAZIONI = 21;
  public static int PQSL_DETTIMPEBUO4_ROWNAMESTATO = 22;
  public static int PQSL_DETTIMPEBUO4_DETIMPBUCOCO = 23;
  public static int PQSL_DETTIMPEBUO4_DETIMPBUCOEU = 24;
  public static int PQSL_DETTIMPEBUO4_DETIMBUCOLI5 = 25;
  public static int PQSL_DETTIMPEBUO4_DETIMBUCOLI4 = 26;

  // Table to contain panel selected row: Beneficiario
  //
  public static int PQRY_BENEFICIAR20 = 1976;
  public static int PQRY_BENEFICIAR20_RS = 1977;
  public static int PQSL_BENEFICIAR20_ROWNAMRAGSOC = 0;
  public static int PQSL_BENEFICIAR20_ROWNAMECODIC = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI140 = 1978;
  public static int PQRY_PARAMETRI140_RS = 1979;
  public static int PQSL_PARAMETRI140_ROWNAMETOTAL = 0;

  // Table to contain panel selected row: BUONI
  //
  public static int PQRY_BUONI1 = 1980;
  public static int PQSL_BUONI1_ANNO_BUONO = 0;
  public static int PQSL_BUONI1_NUMERO_BUONO = 1;
  public static int PQSL_BUONI1_CODICE = 2;
  public static int PQSL_BUONI1_DATA_EM_BUONO = 3;
  public static int PQSL_BUONI1_SETTORE_OPERATIVO = 4;
  public static int PQSL_BUONI1_SERVIZIO_OPERATIVO = 5;
  public static int PQSL_BUONI1_NOTE = 6;
  public static int PQSL_BUONI1_UTENTE = 7;
  public static int PQSL_BUONI1_RECORDCODIC1 = 8;
  public static int PQSL_BUONI1_REBERASOESES = 9;
  public static int PQSL_BUONI1_ANNO_IMP = 10;
  public static int PQSL_BUONI1_PROGRESSIVO_BUONO = 11;
  public static int PQSL_BUONI1_NUMERO_IMP = 12;
  public static int PQSL_BUONI1_ANNO_SUBIMP = 13;
  public static int PQSL_BUONI1_NUMERO_SUBIMP = 14;
  public static int PQSL_BUONI1_IMPORTO = 15;
  public static int PQSL_BUONI1_DESCRIZIONE = 16;
  public static int PQSL_BUONI1_LIQUIDATO = 17;
  public static int PQSL_BUONI1_FATTURATO = 18;
  public static int PQSL_BUONI1_CENTRO = 19;
  public static int PQSL_BUONI1_FATTORE = 20;
  public static int PQSL_BUONI1_RECORDNOTE = 21;
  public static int PQSL_BUONI1_CHIUSO = 22;
  public static int PQSL_BUONI1_REBERASOESE1 = 23;
  public static int PQSL_BUONI1_DATA_REGISTRAZIONE = 24;

  // Table to contain panel selected row: BUONI
  //
  public static int PQRY_BUONI4 = 1981;
  public static int PQSL_BUONI4_Buono_ANNO_BUONO = 0;
  public static int PQSL_BUONI4_Buoni_NUMERO_BUONO = 1;
  public static int PQSL_BUONI4_Buoni_CODICE = 2;
  public static int PQSL_BUONI4_DATA_REGISTRAZIONE = 3;
  public static int PQSL_BUONI4_CODICE = 4;
  public static int PQSL_BUONI4_REBERASOESES = 5;
  public static int PQSL_BUONI4_ANNO_IMP = 6;
  public static int PQSL_BUONI4_NUMERO_IMP = 7;
  public static int PQSL_BUONI4_PROGRESSIVO_BUONO = 8;
  public static int PQSL_BUONI4_RECDETBUANSU = 9;
  public static int PQSL_BUONI4_IMPORTO = 10;
  public static int PQSL_BUONI4_Dettagli_Buoni_DESCRIZIONE = 11;
  public static int PQSL_BUONI4_FATTURATO = 12;
  public static int PQSL_BUONI4_LIQUIDATO = 13;
  public static int PQSL_BUONI4_CENTRO = 14;
  public static int PQSL_BUONI4_FATTORE = 15;
  public static int PQSL_BUONI4_NOTE = 16;
  public static int PQSL_BUONI4_CHIUSO = 17;
  public static int PQSL_BUONI4_NUMERO_SUBIMP = 18;
  public static int PQSL_BUONI4_ANNO_BUONO = 19;
  public static int PQSL_BUONI4_NUMERO_BUONO = 20;
  public static int PQSL_BUONI4_DATA_REG = 21;
  public static int PQSL_BUONI4_UTENTE = 22;
  public static int PQSL_BUONI4_DATA_EM_BUONO = 23;
  public static int PQSL_BUONI4_RECOFATTDESC = 24;
  public static int PQSL_BUONI4_RECODESCCENT = 25;
  public static int PQSL_BUONI4_RECORDDESCR3 = 26;
  public static int PQSL_BUONI4_DESCRIZIONE = 27;
  public static int PQSL_BUONI4_RECORDIMPEGN = 28;
  public static int PQSL_BUONI4_RECORSUBIMPE = 29;
  public static int PQSL_BUONI4_ANNO_SUBIMP = 30;
  public static int PQSL_BUONI4_COMPETENZA_DAL = 31;
  public static int PQSL_BUONI4_COMPETENZA_AL = 32;
  public static int PQSL_BUONI4_OFFERTA = 33;
  public static int PQSL_BUONI4_DESTINAZIONE = 34;
  public static int PQSL_BUONI4_VOCE_ECON = 35;
  public static int PQSL_BUONI4_CODICE_GESTIONALE = 36;

  // Table to contain panel selected row: CATEGORIE PRODOTTI OD
  //
  public static int PQRY_CATEGPRODOO1 = 1982;
  public static int PQSL_CATEGPRODOO1_CODICE = 0;
  public static int PQSL_CATEGPRODOO1_DESCRIZIONE = 1;
  public static int PQSL_CATEGPRODOO1_CLASSE = 2;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMIC = 1983;
  public static int PQSL_VOCIECONOMIC_CODICE = 0;
  public static int PQSL_VOCIECONOMIC_RECORDDESCRI = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM60 = 1984;
  public static int PQRY_PARAM60_RS = 1985;
  public static int PQSL_PARAM60_ROWNAMANNIMP = 0;
  public static int PQSL_PARAM60_ROWNAMNUMIMP = 1;
  public static int PQSL_PARAM60_ROWNAMANIMNU = 2;
  public static int PQSL_PARAM60_ROWNAMNUIMNU = 3;

  // Table to contain panel selected row: FATTURE BUONI
  //
  public static int PQRY_FATTUREBUON2 = 1986;
  public static int PQSL_FATTUREBUON2_PROGRESSIVO = 0;
  public static int PQSL_FATTUREBUON2_ANNO_DOC = 1;
  public static int PQSL_FATTUREBUON2_NUMERO_DOC = 2;
  public static int PQSL_FATTUREBUON2_D_DATA_DOC = 3;
  public static int PQSL_FATTUREBUON2_IMPUTATO = 4;
  public static int PQSL_FATTUREBUON2_LIQUIDATO = 5;

  // Table to contain panel selected row: LIQ FATTURE BUONI
  //
  public static int PQRY_LIQFATTUBUO2 = 1987;
  public static int PQSL_LIQFATTUBUO2_ANNO_DISTINTA = 0;
  public static int PQSL_LIQFATTUBUO2_NUMERO_DISTINTA = 1;
  public static int PQSL_LIQFATTUBUO2_DATA_REGISTRAZIONE = 2;
  public static int PQSL_LIQFATTUBUO2_IMPORTO = 3;
  public static int PQSL_LIQFATTUBUO2_ANNO_LIQ = 4;
  public static int PQSL_LIQFATTUBUO2_NUMERO_LIQ = 5;
  public static int PQSL_LIQFATTUBUO2_LIFABULIDDDR = 6;
  public static int PQSL_LIQFATTUBUO2_NUMERO_MAND = 7;
  public static int PQSL_LIQFATTUBUO2_DATA_MAND = 8;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM45 = 1988;
  public static int PQRY_PARAM45_RS = 1989;
  public static int PQSL_PARAM45_ROWNAMTOTIM1 = 0;
  public static int PQSL_PARAM45_ROWNAMTOTLIQ = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM33 = 1990;
  public static int PQRY_PARAM33_RS = 1991;
  public static int PQSL_PARAM33_ROWNAMTOTIMP = 0;

  // Table to contain panel selected row: DETTAGLI BOLLE
  //
  public static int PQRY_DETTAGLBOLL2 = 1992;
  public static int PQSL_DETTAGLBOLL2_QUANTITA = 0;
  public static int PQSL_DETTAGLBOLL2_NUMERO_BOLLA = 1;
  public static int PQSL_DETTAGLBOLL2_DATA_BOLLA = 2;
  public static int PQSL_DETTAGLBOLL2_PROGRESSIVO_BOLLA = 3;

  // Table to contain panel selected row: DETTAGLI BUONI
  //
  public static int PQRY_DETTAGLBUON2 = 1993;
  public static int PQSL_DETTAGLBUON2_IMPORTO = 0;
  public static int PQSL_DETTAGLBUON2_DETBUOIMPARR = 1;
  public static int PQSL_DETTAGLBUON2_DETTBUONLIQU = 2;
  public static int PQSL_DETTAGLBUON2_DETBUOLIQTEC = 3;
  public static int PQSL_DETTAGLBUON2_DETBUOLIQCON = 4;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI5 = 1994;
  public static int PQSL_WORKEXPORTI5_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI5_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI5_FASE = 2;
  public static int PQSL_WORKEXPORTI5_FILE_DATI = 3;

  // Table to contain panel selected row: FAT SMISTAMENTO
  //
  public static int PQRY_FATSMISTAMEN = 1995;
  public static int PQSL_FATSMISTAMEN_METODO = 0;
  public static int PQSL_FATSMISTAMEN_CHIAVE = 1;
  public static int PQSL_FATSMISTAMEN_PROGR_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_FATSMISTAMEN_DATA_CREAZIONE = 3;
  public static int PQSL_FATSMISTAMEN_PREVALENTE = 4;

  // Table to contain panel selected row: BEN
  //
  public static int PQRY_BEN2 = 1996;
  public static int PQSL_BEN2_CODICE = 0;
  public static int PQSL_BEN2_RAGIONE_SOCIALE = 1;
  public static int PQSL_BEN2_CODICE_FISCALE = 2;
  public static int PQSL_BEN2_PARTITA_IVA = 3;
  public static int PQSL_BEN2_TAG_UTENZA = 4;

  // Table to contain panel selected row: NOTIFICHE
  //
  public static int PQRY_NOTIFICHE = 1997;
  public static int PQSL_NOTIFICHE_ID = 0;
  public static int PQSL_NOTIFICHE_DATA_ORA = 1;
  public static int PQSL_NOTIFICHE_MODULO_A = 2;
  public static int PQSL_NOTIFICHE_PROGR_UO_DA = 3;
  public static int PQSL_NOTIFICHE_PROGR_UO_A = 4;
  public static int PQSL_NOTIFICHE_TESTO_NOTIFICA = 5;
  public static int PQSL_NOTIFICHE_VISTODA = 6;
  public static int PQSL_NOTIFICHE_VISTO = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI306 = 1998;
  public static int PQRY_PARAMETRI306_RS = 1999;
  public static int PQSL_PARAMETRI306_NOMOGGDATDAL = 0;
  public static int PQSL_PARAMETRI306_NOMOGGNASVIS = 1;

  // Table to contain panel selected row: FE DOCUMENTALE
  //
  public static int PQRY_FEDOCUMENTA1 = 2000;
  public static int PQSL_FEDOCUMENTA1_FEDOCUIDDOCU = 0;
  public static int PQSL_FEDOCUMENTA1_ORDINAMENTO = 1;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMEENTE = 2;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMODDAT = 3;
  public static int PQSL_FEDOCUMENTA1_FEDOCUDATDOC = 4;
  public static int PQSL_FEDOCUMENTA1_FEDOCUNUMDOC = 5;
  public static int PQSL_FEDOCUMENTA1_FEDOCURAGSOC = 6;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCODFIS = 7;
  public static int PQSL_FEDOCUMENTA1_FEDOCUPARIVA = 8;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCODBEN = 9;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMIDGDM = 10;
  public static int PQSL_FEDOCUMENTA1_FEDOCUTIPDOC = 11;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMIMPOR = 12;
  public static int PQSL_FEDOCUMENTA1_FEDOCNOMFIXM = 13;
  public static int PQSL_FEDOCUMENTA1_FEDOCUINFDOC = 14;
  public static int PQSL_FEDOCUMENTA1_FEDOCUDATARR = 15;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMIDSDI = 16;
  public static int PQSL_FEDOCUMENTA1_FEDOCUPRONUM = 17;
  public static int PQSL_FEDOCUMENTA1_FEDOCUPROANN = 18;
  public static int PQSL_FEDOCUMENTA1_FEDOCUSTADOC = 19;
  public static int PQSL_FEDOCUMENTA1_FEDOCUPROGUO = 20;
  public static int PQSL_FEDOCUMENTA1_FEDOCPROGENU = 21;
  public static int PQSL_FEDOCUMENTA1_FEDOPRGEDAAR = 22;
  public static int PQSL_FEDOCUMENTA1_FEDOCUACCDAT = 23;
  public static int PQSL_FEDOCUMENTA1_FEDOCUACCUTE = 24;
  public static int PQSL_FEDOCUMENTA1_FEDOCURESDAT = 25;
  public static int PQSL_FEDOCUMENTA1_FEDOCURESUTE = 26;
  public static int PQSL_FEDOCUMENTA1_XML = 27;
  public static int PQSL_FEDOCUMENTA1_FEDOCUESIALL = 28;
  public static int PQSL_FEDOCUMENTA1_CODFISPARTIV = 29;
  public static int PQSL_FEDOCUMENTA1_MULTISERVIZI = 30;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMPARER = 31;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCONBEN = 32;
  public static int PQSL_FEDOCUMENTA1_GGGIACENZA1 = 33;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMOTRIF = 34;
  public static int PQSL_FEDOCUMENTA1_FEDOCUAPRFAT = 35;
  public static int PQSL_FEDOCUMENTA1_DESCRIZIONE = 36;
  public static int PQSL_FEDOCUMENTA1_FEDOCPARNENO = 37;
  public static int PQSL_FEDOCUMENTA1_NOTAPARENEGA = 38;
  public static int PQSL_FEDOCUMENTA1_FEDOCUTOOCON = 39;
  public static int PQSL_FEDOCUMENTA1_FEDOCUMTRATT = 40;
  public static int PQSL_FEDOCUMENTA1_FEDOCUULTSTA = 41;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCANDAT = 42;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCANUTE = 43;
  public static int PQSL_FEDOCUMENTA1_FEDOCDATSCXM = 44;
  public static int PQSL_FEDOCUMENTA1_FEDOCDATSCCA = 45;
  public static int PQSL_FEDOCUMENTA1_FEDOCUCOMPCC = 46;
  public static int PQSL_FEDOCUMENTA1_FEDOCFATAVFO = 47;
  public static int PQSL_FEDOCUMENTA1_RIFIUTATA = 48;
  public static int PQSL_FEDOCUMENTA1_VALIDATA = 49;

  // Table to contain panel selected row: Filtri FE TBL
  //
  public static int PQRY_FILTRIFETBL1 = 2001;
  public static int PQRY_FILTRIFETBL1_RS = 2002;
  public static int PQSL_FILTRIFETBL1_NOMEOGGDAESA = 0;
  public static int PQSL_FILTRIFETBL1_NOMEOGGEACCE = 1;
  public static int PQSL_FILTRIFETBL1_NOMEOGGERIFI = 2;
  public static int PQSL_FILTRIFETBL1_NOMEOGGECANC = 3;
  public static int PQSL_FILTRIFETBL1_NOMOGGTIPPRO = 4;
  public static int PQSL_FILTRIFETBL1_NOMOGGDAARDA = 5;
  public static int PQSL_FILTRIFETBL1_NOMOGGDAARAL = 6;

  // Table to contain panel selected row: Temp Uo
  //
  public static int PQRY_TEMPUO2 = 2003;
  public static int PQRY_TEMPUO2_RS = 2004;
  public static int PQSL_TEMPUO2_NOMEOGGPROUO = 0;
  public static int PQSL_TEMPUO2_NOMEOGGSEMUL = 1;
  public static int PQSL_TEMPUO2_NOMEOGGESCEL = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI540 = 2005;
  public static int PQRY_PARAMETRI540_RS = 2006;
  public static int PQSL_PARAMETRI540_LABEL = 0;
  public static int PQSL_PARAMETRI540_NOMOGGRAGSOC = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI541 = 2007;
  public static int PQSL_PARAMETRI541_NOMOGGBERASO = 0;
  public static int PQSL_PARAMETRI541_NOMEOGGECODI = 1;
  public static int PQSL_PARAMETRI541_NOMOGGCODFIS = 2;
  public static int PQSL_PARAMETRI541_NOMOGGPARIVA = 3;
  public static int PQSL_PARAMETRI541_NOMEOGGERESI = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI542 = 2008;
  public static int PQRY_PARAMETRI542_RS = 2009;
  public static int PQSL_PARAMETRI542_NOMEOGGIDDOC = 0;
  public static int PQSL_PARAMETRI542_NOMOGGRASOFE = 1;

  // Table to contain panel selected row: Temp Uo
  //
  public static int PQRY_TEMPUO = 2010;
  public static int PQRY_TEMPUO_RS = 2011;
  public static int PQSL_TEMPUO_NOMEOGGPROUO = 0;
  public static int PQSL_TEMPUO_NOMEOGGSEMUL = 1;
  public static int PQSL_TEMPUO_NOMEOGGESCEL = 2;

  // Table to contain panel selected row: Motivazione Rifiuto
  //
  public static int PQRY_MOTIVARIFIU1 = 2012;
  public static int PQRY_MOTIVARIFIU1_RS = 2013;
  public static int PQSL_MOTIVARIFIU1_NOMEOGGEMOTI = 0;

  // Table to contain panel selected row: WRK ACC MULTI
  //
  public static int PQRY_WRKACCMULTI = 2014;
  public static int PQSL_WRKACCMULTI_WRKACCMUIDDO = 0;
  public static int PQSL_WRKACCMULTI_WRKACCMUNUDO = 1;
  public static int PQSL_WRKACCMULTI_WRKACCMUDADO = 2;
  public static int PQSL_WRKACCMULTI_WRKACCMULMES = 3;
  public static int PQSL_WRKACCMULTI_WRKACCMUDAIN = 4;
  public static int PQSL_WRKACCMULTI_WRKACCMUUTIN = 5;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY5 = 2015;

  // Table to contain panel selected row: VISTA RIEPILOGO IVA
  //
  public static int PQRY_VISTARIEPIVA = 2016;
  public static int PQSL_VISTARIEPIVA_RECVISRIIVIM = 0;
  public static int PQSL_VISTARIEPIVA_RECVISRIEIVA = 1;
  public static int PQSL_VISTARIEPIVA_REVIRIIVTIRS = 2;
  public static int PQSL_VISTARIEPIVA_REVIRIIVTIBS = 3;
  public static int PQSL_VISTARIEPIVA_REVIRIIVTIRE = 4;
  public static int PQSL_VISTARIEPIVA_RECVISRIIVSE = 5;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA11 = 2017;
  public static int PQSL_IVA11_REVIRIIVIMVR = 0;
  public static int PQSL_IVA11_REVIRIIVVIRI = 1;
  public static int PQSL_IVA11_REVIRIIVTIRS = 2;
  public static int PQSL_IVA11_REVIRIIVTIBS = 3;
  public static int PQSL_IVA11_REVIRIIVTIRE = 4;
  public static int PQSL_IVA11_RECVISRIIVSE = 5;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS82 = 2018;
  public static int PQRY_PARS82_RS = 2019;
  public static int PQSL_PARS82_RENOOGANPRFA = 0;
  public static int PQSL_PARS82_RENOOGNUPRFA = 1;

  // Table to contain panel selected row: FE DOCUMENTALE
  //
  public static int PQRY_FEDOCUMENTAL = 2020;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCRASO = 0;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCCOFI = 1;
  public static int PQSL_FEDOCUMENTAL_RECORDDOCUME = 2;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCDADO = 3;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCTIDO = 4;
  public static int PQSL_FEDOCUMENTAL_RECOFEDOCIMP = 5;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCNUPR = 6;
  public static int PQSL_FEDOCUMENTAL_RECFEDODDAPR = 7;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCDAAR = 8;
  public static int PQSL_FEDOCUMENTAL_VISUALIZZDOC = 9;
  public static int PQSL_FEDOCUMENTAL_RECFEDOCIDDO = 10;

  // Table to contain panel selected row: FATTURE COLL
  //
  public static int PQRY_FATTURECOLL1 = 2021;
  public static int PQRY_FATTURECOLL1_RS = 2022;
  public static int PQSL_FATTURECOLL1_IMPORTO = 0;
  public static int PQSL_FATTURECOLL1_DESCRIZIONE = 1;
  public static int PQSL_FATTURECOLL1_ANNO_DOC = 2;
  public static int PQSL_FATTURECOLL1_NUMERO_DOC = 3;
  public static int PQSL_FATTURECOLL1_FAT_ANNO_PROG_FAT = 4;
  public static int PQSL_FATTURECOLL1_FAT_NUMERO_PROG_FAT = 5;
  public static int PQSL_FATTURECOLL1_RECOINFOFATT = 6;
  public static int PQSL_FATTURECOLL1_RECORRIEPIVA = 7;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION9 = 2023;
  public static int PQSL_NOTEFUNZION9_MODULO = 0;
  public static int PQSL_NOTEFUNZION9_PAGINA = 1;
  public static int PQSL_NOTEFUNZION9_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION9_DESCRIZIONE = 3;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV11 = 2024;
  public static int QSL_CFASELINTV11_SUMNOMOGREIM = 0;
  public static int QSL_CFASELINTV11_COUNT = 1;

  // Recordset for query: Fatture Buoni IMDB
  //
  public static int QRY_FATTBUONIMD3 = 2025;
  public static int QSL_FATTBUONIMD3_ROWIMPORTO = 0;
  public static int QSL_FATTBUONIMD3_ROWANNOPROG = 1;
  public static int QSL_FATTBUONIMD3_ROWNUMERPROG = 2;
  public static int QSL_FATTBUONIMD3_ROWDESCRIZIO = 3;

  // Recordset for query: FATTURE COLL
  //
  public static int QRY_FATTURECOLL2 = 2026;
  public static int QSL_FATTURECOLL2_NOMOGGRETDES = 0;
  public static int QSL_FATTURECOLL2_ROWIMPORTO = 1;
  public static int QSL_FATTURECOLL2_ROWANNPROFAT = 2;
  public static int QSL_FATTURECOLL2_ROWNUMPROFAT = 3;
  public static int QSL_FATTURECOLL2_NOMOGGRECORE = 4;
  public static int QSL_FATTURECOLL2_NOOGREDAULAG = 5;
  public static int QSL_FATTURECOLL2_NOMOGGRETPRO = 6;
  public static int QSL_FATTURECOLL2_NOMOGGREIMIV = 7;
  public static int QSL_FATTURECOLL2_NOOGREIMIVIS = 8;
  public static int QSL_FATTURECOLL2_NOOGRETIREDE = 9;
  public static int QSL_FATTURECOLL2_NOOGRETIBODE = 10;
  public static int QSL_FATTURECOLL2_ROWANNODOC = 11;
  public static int QSL_FATTURECOLL2_ROWNUMERODOC = 12;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT4 = 2027;
  public static int PQSL_FAT4_NUMERO_DOC = 0;
  public static int PQSL_FAT4_ANNO_PROG = 1;
  public static int PQSL_FAT4_NUMERO_PROG = 2;
  public static int PQSL_FAT4_D_DATA_DOC = 3;
  public static int PQSL_FAT4_CODICE_DOC = 4;
  public static int PQSL_FAT4_NUMERO_PROT = 5;
  public static int PQSL_FAT4_D_DATA_PROT = 6;
  public static int PQSL_FAT4_IMPORTO = 7;
  public static int PQSL_FAT4_IMPUTATO = 8;
  public static int PQSL_FAT4_VARIAZIONI = 9;
  public static int PQSL_FAT4_ANNO_DOC = 10;

  // Table to contain panel selected row: T04
  //
  public static int PQRY_T16 = 2028;
  public static int PQSL_T16_TIPO_REGISTRO = 0;
  public static int PQSL_T16_TIPO_BOLLATO = 1;
  public static int PQSL_T16_DESCRIZIONE = 2;
  public static int PQSL_T16_ATTIVITA = 3;
  public static int PQSL_T16_TIPO_BOLLATO_DEF = 4;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT9 = 2029;
  public static int PQSL_FAT9_CODICE = 0;
  public static int PQSL_FAT9_NUMERO_RIF = 1;
  public static int PQSL_FAT9_D_DATA_DOC = 2;
  public static int PQSL_FAT9_ANNO_PROG = 3;
  public static int PQSL_FAT9_NUMERO_PROG = 4;
  public static int PQSL_FAT9_ANNO_DOC = 5;
  public static int PQSL_FAT9_DATA_DOC = 6;
  public static int PQSL_FAT9_RECORINFODOC = 7;
  public static int PQSL_FAT9_NUMERO_DOC = 8;
  public static int PQSL_FAT9_STORNO = 9;
  public static int PQSL_FAT9_BUONI = 10;
  public static int PQSL_FAT9_RECFATCODDOC = 11;
  public static int PQSL_FAT9_RECORDMODDOC = 12;
  public static int PQSL_FAT9_NUMEROREG = 13;
  public static int PQSL_FAT9_DATAREG = 14;
  public static int PQSL_FAT9_RECORFATRIVE = 15;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT2 = 2030;
  public static int PQSL_FAT2_NUMERO_REG = 0;
  public static int PQSL_FAT2_ANNO_PROG = 1;
  public static int PQSL_FAT2_NUMERO_PROG = 2;
  public static int PQSL_FAT2_ANNO_DOC = 3;
  public static int PQSL_FAT2_DATA_DOC = 4;
  public static int PQSL_FAT2_NUMERO_DOC = 5;
  public static int PQSL_FAT2_RAGIONE_SOCIALE = 6;
  public static int PQSL_FAT2_RECORDCONTAB = 7;
  public static int PQSL_FAT2_RECORINFODOC = 8;
  public static int PQSL_FAT2_RECFATCODDOC = 9;

  // Table to contain panel selected row: TCO
  //
  public static int PQRY_TCO = 2031;
  public static int PQSL_TCO_D_DATA_REG = 0;
  public static int PQSL_TCO_ANNO_REG = 1;
  public static int PQSL_TCO_NUMERO_REG = 2;
  public static int PQSL_TCO_TIPO_REGISTRO = 3;
  public static int PQSL_TCO_TIPO_BOLLATO = 4;
  public static int PQSL_TCO_DESCRIZIONE = 5;
  public static int PQSL_TCO_RECOINFOCORR = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI535 = 2032;
  public static int PQRY_PARAMETRI535_RS = 2033;
  public static int PQSL_PARAMETRI535_ROWNAMEESERC = 0;
  public static int PQSL_PARAMETRI535_ROWNAMTIVIME = 1;
  public static int PQSL_PARAMETRI535_ROWNAMPERMES = 2;
  public static int PQSL_PARAMETRI535_ROWNAMPERTRI = 3;
  public static int PQSL_PARAMETRI535_ROWNAMELIQUI = 4;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA9 = 2034;
  public static int PQSL_IVA9_RECONUMEREG1 = 0;
  public static int PQSL_IVA9_RECODDATREG1 = 1;
  public static int PQSL_IVA9_RECIVANUMRES = 2;
  public static int PQSL_IVA9_RECORIVASERV = 3;
  public static int PQSL_IVA9_RECORDLIQUID = 4;
  public static int PQSL_IVA9_RECIVADDARES = 5;
  public static int PQSL_IVA9_RECORIVAIMPO = 6;
  public static int PQSL_IVA9_IVA = 7;
  public static int PQSL_IVA9_ALIQUOTA = 8;
  public static int PQSL_IVA9_IVA_INDED = 9;
  public static int PQSL_IVA9_DESCRIZIONE = 10;

  // Table to contain panel selected row: IVAPRI
  //
  public static int PQRY_IVAPRI1 = 2035;
  public static int PQSL_IVAPRI1_PROGRESSIVO = 0;
  public static int PQSL_IVAPRI1_ANNO_PROG = 1;
  public static int PQSL_IVAPRI1_NUMERO_PROG = 2;
  public static int PQSL_IVAPRI1_CODICE_DOC = 3;
  public static int PQSL_IVAPRI1_IMPONIBILE = 4;
  public static int PQSL_IVAPRI1_IVA = 5;
  public static int PQSL_IVAPRI1_ALIQUOTA = 6;
  public static int PQSL_IVAPRI1_CODICE_ESENZIONE = 7;

  // Table to contain panel selected row: IVAPRI
  //
  public static int PQRY_IVAPRI = 2036;
  public static int PQSL_IVAPRI_IMPONIBILE = 0;
  public static int PQSL_IVAPRI_IVA = 1;
  public static int PQSL_IVAPRI_ALIQUOTA = 2;
  public static int PQSL_IVAPRI_CODICE_ESENZIONE = 3;
  public static int PQSL_IVAPRI_DESCRIZIONE = 4;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE34 = 2037;
  public static int PQRY_NEWTABLE34_RS = 2038;
  public static int PQSL_NEWTABLE34_ROWNAMDATREG = 0;
  public static int PQSL_NEWTABLE34_ROWNAMGEPAPA = 1;

  // Table to contain panel selected row: Numerazione I V A
  //
  public static int PQRY_NUMERAZIOIV1 = 2039;
  public static int PQRY_NUMERAZIOIV1_RS = 2040;
  public static int PQSL_NUMERAZIOIV1_ROWNAMEESERC = 0;
  public static int PQSL_NUMERAZIOIV1_ROWNAMTIPREG = 1;
  public static int PQSL_NUMERAZIOIV1_ROWNAMDALMES = 2;
  public static int PQSL_NUMERAZIOIV1_ROWNAMTIPBOL = 3;

  // Table to contain panel selected row: Numerazione I V A
  //
  public static int PQRY_NUMERAZIOIV2 = 2041;
  public static int PQRY_NUMERAZIOIV2_RS = 2042;
  public static int PQSL_NUMERAZIOIV2_ROWNAMEESERC = 0;
  public static int PQSL_NUMERAZIOIV2_ROWNAMTIPREG = 1;
  public static int PQSL_NUMERAZIOIV2_ROWNAMTIPBOL = 2;
  public static int PQSL_NUMERAZIOIV2_ROWNAMREGLIQ = 3;

  // Table to contain panel selected row: IVAVEN
  //
  public static int PQRY_IVAVEN = 2043;
  public static int PQSL_IVAVEN_TIPO_REGISTRO = 0;
  public static int PQSL_IVAVEN_TIPO_BOLLATO = 1;
  public static int PQSL_IVAVEN_IMPONIBILE = 2;
  public static int PQSL_IVAVEN_IVA = 3;
  public static int PQSL_IVAVEN_ALIQUOTA = 4;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE37 = 2044;
  public static int PQRY_NEWTABLE37_RS = 2045;
  public static int PQSL_NEWTABLE37_ROWNAMTIPREG = 0;
  public static int PQSL_NEWTABLE37_ROWNAMTIPBOL = 1;
  public static int PQSL_NEWTABLE37_ROWNAMEANNO = 2;
  public static int PQSL_NEWTABLE37_ROWNAMEDATDA = 3;
  public static int PQSL_NEWTABLE37_ROWNAMEDATAA = 4;
  public static int PQSL_NEWTABLE37_RONARIPEDIIN = 5;

  // Table to contain panel selected row: VENWRK
  //
  public static int PQRY_VENWRK = 2046;
  public static int PQSL_VENWRK_TIPO_BOLLATO = 0;
  public static int PQSL_VENWRK_ANNO = 1;
  public static int PQSL_VENWRK_TIPO_REGISTRO = 2;
  public static int PQSL_VENWRK_A_MESE = 3;
  public static int PQSL_VENWRK_DA_MESE = 4;
  public static int PQSL_VENWRK_PERC_INC = 5;
  public static int PQSL_VENWRK_ALIQUOTA = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR94 = 2047;
  public static int PQRY_PAR94_RS = 2048;
  public static int PQSL_PAR94_ROWNAMTIPREG = 0;
  public static int PQSL_PAR94_ROWNAMTIPBOL = 1;
  public static int PQSL_PAR94_ROWNAMEANNO = 2;
  public static int PQSL_PAR94_ROWNAMEDATDA = 3;
  public static int PQSL_PAR94_ROWNAMEDATAA = 4;
  public static int PQSL_PAR94_ROWNAMINTREG = 5;
  public static int PQSL_PAR94_ROWNAMNUPRPA = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR95 = 2049;
  public static int PQRY_PAR95_RS = 2050;
  public static int PQSL_PAR95_ROWNAMTIPREG = 0;
  public static int PQSL_PAR95_ROWNAMTIPBOL = 1;
  public static int PQSL_PAR95_ROWNAMEANNO = 2;
  public static int PQSL_PAR95_ROWNAMEDATDA = 3;
  public static int PQSL_PAR95_ROWNAMEDATAA = 4;
  public static int PQSL_PAR95_ROWNAMINTREG = 5;
  public static int PQSL_PAR95_ROWNAMNUPRPA = 6;

  // Table to contain panel selected row: Registro Riepilogativo Acquisti Vendite
  //
  public static int PQRY_REGRIEACQVE2 = 2051;
  public static int PQRY_REGRIEACQVE2_RS = 2052;
  public static int PQSL_REGRIEACQVE2_ROWNAMTIPRE1 = 0;
  public static int PQSL_REGRIEACQVE2_ROWNAMEATTIV = 1;
  public static int PQSL_REGRIEACQVE2_ROWNAMTIPATT = 2;
  public static int PQSL_REGRIEACQVE2_ROWNAMINTREG = 3;
  public static int PQSL_REGRIEACQVE2_ROWNAMNUPRPA = 4;

  // Table to contain panel selected row: Registro Riepilogativo Acquisti Vendite
  //
  public static int PQRY_REGRIEACQVE1 = 2053;
  public static int PQRY_REGRIEACQVE1_RS = 2054;
  public static int PQSL_REGRIEACQVE1_ROWNAMTIPRE1 = 0;
  public static int PQSL_REGRIEACQVE1_ROWNAMEATTIV = 1;
  public static int PQSL_REGRIEACQVE1_ROWNAMTIPATT = 2;
  public static int PQSL_REGRIEACQVE1_ROWNAMINTREG = 3;
  public static int PQSL_REGRIEACQVE1_ROWNAMNUPRPA = 4;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR96 = 2055;
  public static int PQRY_PAR96_RS = 2056;
  public static int PQSL_PAR96_ROWNAMTIPREG = 0;
  public static int PQSL_PAR96_ROWNAMTIPBOL = 1;
  public static int PQSL_PAR96_ROWNAMEANNO = 2;
  public static int PQSL_PAR96_ROWNAMEDATDA = 3;
  public static int PQSL_PAR96_ROWNAMEDATAA = 4;
  public static int PQSL_PAR96_ROWNAMINTREG = 5;
  public static int PQSL_PAR96_ROWNAMNUPRPA = 6;
  public static int PQSL_PAR96_ROWNAMTIPATT = 7;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE42 = 2057;
  public static int PQRY_NEWTABLE42_RS = 2058;
  public static int PQSL_NEWTABLE42_ROWNAMSUPEBO = 0;
  public static int PQSL_NEWTABLE42_ROWNASTIVAIN = 1;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE40 = 2059;
  public static int PQRY_NEWTABLE40_RS = 2060;
  public static int PQSL_NEWTABLE40_ROWNAMSUPEBO = 0;
  public static int PQSL_NEWTABLE40_ROWNASTIVAIN = 1;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE43 = 2061;
  public static int PQRY_NEWTABLE43_RS = 2062;
  public static int PQSL_NEWTABLE43_RONAFAPANPDE = 0;
  public static int PQSL_NEWTABLE43_RONAFAINNIDE = 1;
  public static int PQSL_NEWTABLE43_ROWNAMTIPREG = 2;
  public static int PQSL_NEWTABLE43_ROWNAMBOLDEF = 3;
  public static int PQSL_NEWTABLE43_ROWNAMORDFAT = 4;
  public static int PQSL_NEWTABLE43_ROWNAMORDFA1 = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI587 = 2063;
  public static int PQRY_PARAMETRI587_RS = 2064;
  public static int PQSL_PARAMETRI587_ROWNAMEDEBIT = 0;
  public static int PQSL_PARAMETRI587_ROWNAMECREDI = 1;
  public static int PQSL_PARAMETRI587_ROWNAMSOATTR = 2;
  public static int PQSL_PARAMETRI587_RONAIMMADANV = 3;
  public static int PQSL_PARAMETRI587_ROWNAMINTREG = 4;
  public static int PQSL_PARAMETRI587_ROWNAMNUPRPA = 5;
  public static int PQSL_PARAMETRI587_ROWNAMACCDOV = 6;
  public static int PQSL_PARAMETRI587_ROWNAMSALRIS = 7;
  public static int PQSL_PARAMETRI587_ROWNAMDESSTA = 8;
  public static int PQSL_PARAMETRI587_ROWNAMSTAPRE = 9;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI240 = 2065;
  public static int PQRY_PARAMETRI240_RS = 2066;
  public static int PQSL_PARAMETRI240_ROWNAMEDEBIT = 0;
  public static int PQSL_PARAMETRI240_ROWNAMECREDI = 1;
  public static int PQSL_PARAMETRI240_ROWNAMSOATTR = 2;
  public static int PQSL_PARAMETRI240_RONAIMMADANV = 3;
  public static int PQSL_PARAMETRI240_ROWNAMINTREG = 4;
  public static int PQSL_PARAMETRI240_ROWNAMNUPRPA = 5;
  public static int PQSL_PARAMETRI240_ROWNAMIMPVER = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI242 = 2067;
  public static int PQRY_PARAMETRI242_RS = 2068;
  public static int PQSL_PARAMETRI242_ROWNAMEESERC = 0;
  public static int PQSL_PARAMETRI242_ROWNAMPERTRI = 1;
  public static int PQSL_PARAMETRI242_ROWNAMEDEBIT = 2;
  public static int PQSL_PARAMETRI242_ROWNAMECREDI = 3;
  public static int PQSL_PARAMETRI242_RONAIMMADANV = 4;
  public static int PQSL_PARAMETRI242_ROWNAMSOATTR = 5;

  // Table to contain panel selected row: COMUNICAZIONE LIQ IVA
  //
  public static int PQRY_COMUNILIQIVA = 2069;
  public static int PQSL_COMUNILIQIVA_DEBITO_PREC_M1 = 0;
  public static int PQSL_COMUNILIQIVA_CREDITO_PREC_M1 = 1;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M1 = 2;
  public static int PQSL_COMUNILIQIVA_IVA_VEN_M1 = 3;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M1 = 4;
  public static int PQSL_COMUNILIQIVA_IVA_ACQ_M1 = 5;
  public static int PQSL_COMUNILIQIVA_IVA_DOVUTA_M1 = 6;
  public static int PQSL_COMUNILIQIVA_IVA_CREDITO_M1 = 7;
  public static int PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M1 = 8;
  public static int PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M1 = 9;
  public static int PQSL_COMUNILIQIVA_DEBITO_PREC_M2 = 10;
  public static int PQSL_COMUNILIQIVA_CREDITO_PREC_M2 = 11;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M2 = 12;
  public static int PQSL_COMUNILIQIVA_IVA_VEN_M2 = 13;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M2 = 14;
  public static int PQSL_COMUNILIQIVA_IVA_ACQ_M2 = 15;
  public static int PQSL_COMUNILIQIVA_IVA_DOVUTA_M2 = 16;
  public static int PQSL_COMUNILIQIVA_IVA_CREDITO_M2 = 17;
  public static int PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M2 = 18;
  public static int PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M2 = 19;
  public static int PQSL_COMUNILIQIVA_DEBITO_PREC_M3 = 20;
  public static int PQSL_COMUNILIQIVA_CREDITO_PREC_M3 = 21;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M3 = 22;
  public static int PQSL_COMUNILIQIVA_IVA_VEN_M3 = 23;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M3 = 24;
  public static int PQSL_COMUNILIQIVA_IVA_ACQ_M3 = 25;
  public static int PQSL_COMUNILIQIVA_IVA_DOVUTA_M3 = 26;
  public static int PQSL_COMUNILIQIVA_IVA_CREDITO_M3 = 27;
  public static int PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M3 = 28;
  public static int PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M3 = 29;
  public static int PQSL_COMUNILIQIVA_DEBITO_PREC_T = 30;
  public static int PQSL_COMUNILIQIVA_CREDITO_PREC_T = 31;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_VEN_T = 32;
  public static int PQSL_COMUNILIQIVA_IVA_VEN_T = 33;
  public static int PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_T = 34;
  public static int PQSL_COMUNILIQIVA_IVA_ACQ_T = 35;
  public static int PQSL_COMUNILIQIVA_IVA_DOVUTA_T = 36;
  public static int PQSL_COMUNILIQIVA_IVA_CREDITO_T = 37;
  public static int PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_T = 38;
  public static int PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_T = 39;
  public static int PQSL_COMUNILIQIVA_INTERESSE_PERC = 40;
  public static int PQSL_COMUNILIQIVA_INTERESSI_DOVUTI = 41;
  public static int PQSL_COMUNILIQIVA_ESERCIZIO = 42;
  public static int PQSL_COMUNILIQIVA_TRIMESTRE = 43;
  public static int PQSL_COMUNILIQIVA_FILE_XML = 44;
  public static int PQSL_COMUNILIQIVA_CODICE_FISCALE = 45;
  public static int PQSL_COMUNILIQIVA_PARTITA_IVA = 46;
  public static int PQSL_COMUNILIQIVA_CF_DICHIARANTE = 47;
  public static int PQSL_COMUNILIQIVA_CODICE_CARICA = 48;
  public static int PQSL_COMUNILIQIVA_FIRMA = 49;
  public static int PQSL_COMUNILIQIVA_CODICE_FISCALE_INTERMEDIARIO = 50;
  public static int PQSL_COMUNILIQIVA_IMPEGNO_PRESENTAZIONE = 51;
  public static int PQSL_COMUNILIQIVA_DATA_IMPEGNO = 52;
  public static int PQSL_COMUNILIQIVA_FIRMA_INTERMEDIARIO = 53;
  public static int PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M1 = 54;
  public static int PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M2 = 55;
  public static int PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M3 = 56;
  public static int PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_T = 57;
  public static int PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M1 = 58;
  public static int PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M2 = 59;
  public static int PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M3 = 60;
  public static int PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_T = 61;
  public static int PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M1 = 62;
  public static int PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M2 = 63;
  public static int PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M3 = 64;
  public static int PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_T = 65;
  public static int PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M1 = 66;
  public static int PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M2 = 67;
  public static int PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M3 = 68;
  public static int PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_T = 69;
  public static int PQSL_COMUNILIQIVA_METODO_ACCONTO_M1 = 70;
  public static int PQSL_COMUNILIQIVA_METODO_ACCONTO_M2 = 71;
  public static int PQSL_COMUNILIQIVA_METODO_ACCONTO_M3 = 72;
  public static int PQSL_COMUNILIQIVA_METODO_ACCONTO_T = 73;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT5 = 2070;
  public static int PQSL_FAT5_RECORDCODICE = 0;
  public static int PQSL_FAT5_RECORAGISOCI = 1;
  public static int PQSL_FAT5_RECORTRATIVA = 2;
  public static int PQSL_FAT5_RECIVANUMREG = 3;
  public static int PQSL_FAT5_RECIVADDATRE = 4;
  public static int PQSL_FAT5_RECORNUMEDOC = 5;
  public static int PQSL_FAT5_RECORDATADOC = 6;
  public static int PQSL_FAT5_RECORDESCDOC = 7;
  public static int PQSL_FAT5_RECORDIMPONI = 8;
  public static int PQSL_FAT5_RECORDIVA = 9;
  public static int PQSL_FAT5_RECORDPERCEN = 10;
  public static int PQSL_FAT5_ESENZIONE = 11;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT6 = 2071;
  public static int PQSL_FAT6_RECORDCODICE = 0;
  public static int PQSL_FAT6_RECORAGISOCI = 1;
  public static int PQSL_FAT6_RECORTRATIVA = 2;
  public static int PQSL_FAT6_RECIVANUMREG = 3;
  public static int PQSL_FAT6_RECIVADDATRE = 4;
  public static int PQSL_FAT6_RECORNUMEDOC = 5;
  public static int PQSL_FAT6_RECORDATADOC = 6;
  public static int PQSL_FAT6_RECORDESCDOC = 7;
  public static int PQSL_FAT6_RECORDIMPONI = 8;
  public static int PQSL_FAT6_RECORDIVA = 9;
  public static int PQSL_FAT6_RECORDPERCEN = 10;
  public static int PQSL_FAT6_ESENZIONE = 11;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT13 = 2072;
  public static int PQSL_FAT13_RECORDCODICE = 0;
  public static int PQSL_FAT13_RECORAGISOCI = 1;
  public static int PQSL_FAT13_RECORTRATIVA = 2;
  public static int PQSL_FAT13_RECIVANUMREG = 3;
  public static int PQSL_FAT13_RECIVADDATRE = 4;
  public static int PQSL_FAT13_RECORNUMEDOC = 5;
  public static int PQSL_FAT13_RECORDATADOC = 6;
  public static int PQSL_FAT13_RECORDESCDOC = 7;
  public static int PQSL_FAT13_RECORDIMPONI = 8;
  public static int PQSL_FAT13_RECORDIVA = 9;
  public static int PQSL_FAT13_RECORDPERCEN = 10;
  public static int PQSL_FAT13_ESENZIONE = 11;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT14 = 2073;
  public static int PQSL_FAT14_RECORNUMEREG = 0;
  public static int PQSL_FAT14_RECORNUMEDOC = 1;
  public static int PQSL_FAT14_RECORDESCDOC = 2;
  public static int PQSL_FAT14_RECORDIMPONI = 3;
  public static int PQSL_FAT14_RECORDIVA = 4;
  public static int PQSL_FAT14_RECORDPERCEN = 5;
  public static int PQSL_FAT14_RECORT06DESC = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI238 = 2074;
  public static int PQRY_PARAMETRI238_RS = 2075;
  public static int PQSL_PARAMETRI238_ROWNAMEESERC = 0;
  public static int PQSL_PARAMETRI238_ROWNAMTIVIME = 1;
  public static int PQSL_PARAMETRI238_ROWNAMPERMES = 2;
  public static int PQSL_PARAMETRI238_ROWNAMPERTRI = 3;
  public static int PQSL_PARAMETRI238_ROWNAMECODIC = 4;
  public static int PQSL_PARAMETRI238_ROWNAMTIPREG = 5;
  public static int PQSL_PARAMETRI238_ROWNAMEATTIV = 6;

  // Table to contain panel selected row: Tabella
  //
  public static int PQRY_TABELLA = 2076;
  public static int PQRY_TABELLA_RS = 2077;
  public static int PQSL_TABELLA_NOMOGGRAGSOC = 0;
  public static int PQSL_TABELLA_NOMEOGGECODI = 1;
  public static int PQSL_TABELLA_NOMOGGNUMDOC = 2;
  public static int PQSL_TABELLA_NOMOGGDATDOC = 3;
  public static int PQSL_TABELLA_NOMOGGDESDOC = 4;
  public static int PQSL_TABELLA_NOMEOGGEBOLL = 5;
  public static int PQSL_TABELLA_NOMOGGDESBOL = 6;
  public static int PQSL_TABELLA_NOMEOGGETIST = 7;
  public static int PQSL_TABELLA_NOMOGGNUMREG = 8;
  public static int PQSL_TABELLA_NOMOGGDATREG = 9;
  public static int PQSL_TABELLA_NOMEOGGEIMPO = 10;
  public static int PQSL_TABELLA_NOMEOGGETIVA = 11;
  public static int PQSL_TABELLA_NOMEOGGEPERC = 12;
  public static int PQSL_TABELLA_NOMEOGGEESEN = 13;
  public static int PQSL_TABELLA_NOMEOGGEINDE = 14;
  public static int PQSL_TABELLA_NOMEOGGESPRC = 15;
  public static int PQSL_TABELLA_NOMEOGGEPROR = 16;
  public static int PQSL_TABELLA_NOMEOGGECRED = 17;
  public static int PQSL_TABELLA_NOMEOGGEDEBI = 18;
  public static int PQSL_TABELLA_NOMEOGGEDIFF = 19;
  public static int PQSL_TABELLA_NOMOGGATTTRI = 20;

  // Table to contain panel selected row: CAPITOLI REGISTRI
  //
  public static int PQRY_CAPITOREGIST = 2078;
  public static int PQSL_CAPITOREGIST_CAPITOLO = 0;
  public static int PQSL_CAPITOREGIST_ARTICOLO = 1;
  public static int PQSL_CAPITOREGIST_E_S = 2;
  public static int PQSL_CAPITOREGIST_TIPO_REGISTRO = 3;
  public static int PQSL_CAPITOREGIST_TIPO_BOLLATO = 4;

  // Table to contain panel selected row: WRK ESIG IVA PARZIALE
  //
  public static int PQRY_WRKESIIVAPAR = 2079;
  public static int PQSL_WRKESIIVAPAR_FAT_RAGIONE_SOCIALE_ESTESA = 0;
  public static int PQSL_WRKESIIVAPAR_FAT_NUMERO_DOC = 1;
  public static int PQSL_WRKESIIVAPAR_FAT_D_DATA_DOC = 2;
  public static int PQSL_WRKESIIVAPAR_FAT_IMPORTO = 3;
  public static int PQSL_WRKESIIVAPAR_IVA_IMPONIBILE = 4;
  public static int PQSL_WRKESIIVAPAR_IVA_ALIQUOTA = 5;
  public static int PQSL_WRKESIIVAPAR_IVA_IVA = 6;
  public static int PQSL_WRKESIIVAPAR_LIQ_NUMERO_LIQ = 7;
  public static int PQSL_WRKESIIVAPAR_LIQ_ANNO_LIQ = 8;
  public static int PQSL_WRKESIIVAPAR_LIQ_D_DATA_REG = 9;
  public static int PQSL_WRKESIIVAPAR_INFOLIQ = 10;
  public static int PQSL_WRKESIIVAPAR_LIQ_IMPORTO = 11;
  public static int PQSL_WRKESIIVAPAR_LIQ_IMPORTO_IVA = 12;
  public static int PQSL_WRKESIIVAPAR_IMPIVA_NON_MODIFICABILE = 13;
  public static int PQSL_WRKESIIVAPAR_RIGA_SELEZIONATA = 14;
  public static int PQSL_WRKESIIVAPAR_IMPORTO_IVA = 15;
  public static int PQSL_WRKESIIVAPAR_SEL_NON_MODIFICABILE = 16;
  public static int PQSL_WRKESIIVAPAR_SESSIONE = 17;
  public static int PQSL_WRKESIIVAPAR_PROGRESSIVO = 18;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL34 = 2080;
  public static int PQSL_DUAL34_UNO = 0;

  // Table to contain panel selected row: TIPI UTENZA
  //
  public static int PQRY_TIPIUTENZA = 2081;
  public static int PQSL_TIPIUTENZA_CODICE = 0;
  public static int PQSL_TIPIUTENZA_BENEFICIARIO = 1;
  public static int PQSL_TIPIUTENZA_NUM_QUIETANZA = 2;
  public static int PQSL_TIPIUTENZA_DATA_ULTIMA_ELAB = 3;
  public static int PQSL_TIPIUTENZA_FATTORE = 4;
  public static int PQSL_TIPIUTENZA_DESCRIZIONE = 5;
  public static int PQSL_TIPIUTENZA_TIPO_TRACCIATO = 6;
  public static int PQSL_TIPIUTENZA_CODICE_GESTIONALE = 7;
  public static int PQSL_TIPIUTENZA_CODICE_STAT = 8;
  public static int PQSL_TIPIUTENZA_DATA_ULTIMA_ELAB_CONSUMI = 9;
  public static int PQSL_TIPIUTENZA_COD_IMP_ECO = 10;
  public static int PQSL_TIPIUTENZA_UTENTE_INSERIMENTO = 11;
  public static int PQSL_TIPIUTENZA_DATA_INSERIMENTO = 12;
  public static int PQSL_TIPIUTENZA_UTENTE_ULTIMO_AGG = 13;
  public static int PQSL_TIPIUTENZA_DATA_ULTIMO_AGG = 14;
  public static int PQSL_TIPIUTENZA_DATA_EMISS_NO_FILE = 15;
  public static int PQSL_TIPIUTENZA_CIG = 16;
  public static int PQSL_TIPIUTENZA_CUP = 17;
  public static int PQSL_TIPIUTENZA_COD_LIVELLO_5 = 18;
  public static int PQSL_TIPIUTENZA_CODICE_COFOG = 19;
  public static int PQSL_TIPIUTENZA_CODICE_EUROPEO = 20;

  // Table to contain panel selected row: CODICI UTENZE
  //
  public static int PQRY_CODICIUTENZE = 2082;
  public static int PQSL_CODICIUTENZE_CODICE_UTENZA = 0;
  public static int PQSL_CODICIUTENZE_DESCRIZIONE = 1;
  public static int PQSL_CODICIUTENZE_INDIRIZZO = 2;
  public static int PQSL_CODICIUTENZE_UFFICIO_INVIO = 3;
  public static int PQSL_CODICIUTENZE_TIPO_REGISTRO = 4;
  public static int PQSL_CODICIUTENZE_TIPO_BOLLATO = 5;
  public static int PQSL_CODICIUTENZE_PERC_INDETR = 6;
  public static int PQSL_CODICIUTENZE_FATTORE = 7;
  public static int PQSL_CODICIUTENZE_CENTRO = 8;
  public static int PQSL_CODICIUTENZE_COMPETENZA_DAL = 9;
  public static int PQSL_CODICIUTENZE_COMPETENZA_AL = 10;
  public static int PQSL_CODICIUTENZE_UTENTE_INSERIMENTO = 11;
  public static int PQSL_CODICIUTENZE_DATA_INSERIMENTO = 12;
  public static int PQSL_CODICIUTENZE_UTENTE_ULTIMO_AGG = 13;
  public static int PQSL_CODICIUTENZE_DATA_ULTIMO_AGG = 14;
  public static int PQSL_CODICIUTENZE_PROGETTO_ID = 15;
  public static int PQSL_CODICIUTENZE_NUM_UTENTE = 16;
  public static int PQSL_CODICIUTENZE_TIPO_UTENZA = 17;

  // Table to contain panel selected row: IMPUTAZIONI UTENZE
  //
  public static int PQRY_IMPUTAUTENZE = 2083;
  public static int PQRY_IMPUTAUTENZE_RS = 2084;
  public static int PQSL_IMPUTAUTENZE_PERCENTUALE = 0;
  public static int PQSL_IMPUTAUTENZE_RECORPERCOLD = 1;
  public static int PQSL_IMPUTAUTENZE_IMPCONCAPOLD = 2;
  public static int PQSL_IMPUTAUTENZE_IMPCONARTOLD = 3;
  public static int PQSL_IMPUTAUTENZE_IMPCONANIMOL = 4;
  public static int PQSL_IMPUTAUTENZE_IMPCONNUIMOL = 5;
  public static int PQSL_IMPUTAUTENZE_IMPCONANSUOL = 6;
  public static int PQSL_IMPUTAUTENZE_IMPCONNUSUOL = 7;
  public static int PQSL_IMPUTAUTENZE_TIPO_UTENZA = 8;
  public static int PQSL_IMPUTAUTENZE_CODICE_UTENZA = 9;
  public static int PQSL_IMPUTAUTENZE_ESERCIZIO = 10;
  public static int PQSL_IMPUTAUTENZE_UTENTE_INSERIMENTO = 11;
  public static int PQSL_IMPUTAUTENZE_DATA_INSERIMENTO = 12;
  public static int PQSL_IMPUTAUTENZE_UTENTE_ULTIMO_AGG = 13;
  public static int PQSL_IMPUTAUTENZE_DATA_ULTIMO_AGG = 14;
  public static int PQSL_IMPUTAUTENZE_S = 15;
  public static int PQSL_IMPUTAUTENZE_PROGRESSIVO = 16;
  public static int PQSL_IMPUTAUTENZE_FATTORE = 17;
  public static int PQSL_IMPUTAUTENZE_CENTRO = 18;
  public static int PQSL_IMPUTAUTENZE_COMPETENZA_DAL = 19;
  public static int PQSL_IMPUTAUTENZE_COMPETENZA_AL = 20;
  public static int PQSL_IMPUTAUTENZE_SE_SUBIMPEGNO = 21;
  public static int PQSL_IMPUTAUTENZE_IMPCONTSTATO = 22;
  public static int PQSL_IMPUTAUTENZE_CAPITOLO = 23;
  public static int PQSL_IMPUTAUTENZE_ARTICOLO = 24;
  public static int PQSL_IMPUTAUTENZE_ANNO_IMP = 25;
  public static int PQSL_IMPUTAUTENZE_NUMERO_IMP = 26;
  public static int PQSL_IMPUTAUTENZE_ANNO_SUBIMP = 27;
  public static int PQSL_IMPUTAUTENZE_NUMERO_SUBIMP = 28;

  // Recordset for query: IMP UTE
  //
  public static int QRY_IMPUTE = 2085;
  public static int QSL_IMPUTE_IMPCONTIPUTE = 0;
  public static int QSL_IMPUTE_IMPCONCODUTE = 1;
  public static int QSL_IMPUTE_IMPCONTPROGR = 2;
  public static int QSL_IMPUTE_IMPCONTPERCE = 3;
  public static int QSL_IMPUTE_IMPCONTESERC = 4;
  public static int QSL_IMPUTE_IMPCONTS = 5;
  public static int QSL_IMPUTE_IMPCONTCAPIT = 6;
  public static int QSL_IMPUTE_IMPCONTARTIC = 7;
  public static int QSL_IMPUTE_IMPCONANNIMP = 8;
  public static int QSL_IMPUTE_IMPCONNUMIMP = 9;
  public static int QSL_IMPUTE_IMPCONANNSUB = 10;
  public static int QSL_IMPUTE_IMPCONNUMSUB = 11;
  public static int QSL_IMPUTE_IMPCONTSESUB = 12;
  public static int QSL_IMPUTE_IMPCONTCENTR = 13;
  public static int QSL_IMPUTE_IMPCONCOMDAL = 14;
  public static int QSL_IMPUTE_IMPCONTCOMAL = 15;
  public static int QSL_IMPUTE_IMPCONTFATTO = 16;
  public static int QSL_IMPUTE_IMPCONUTEINS = 17;
  public static int QSL_IMPUTE_IMPCONDATINS = 18;
  public static int QSL_IMPUTE_IMPCONUTULAG = 19;
  public static int QSL_IMPUTE_IMPCONDAULAG = 20;
  public static int QSL_IMPUTE_IMPCONTSTATO = 21;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE UT
  //
  public static int PQRY_DISTILIQUIU1 = 2086;
  public static int PQSL_DISTILIQUIU1_RECTIPUTCOGE = 0;
  public static int PQSL_DISTILIQUIU1_RECCODGESDES = 1;
  public static int PQSL_DISTILIQUIU1_RECORDCAPITO = 2;
  public static int PQSL_DISTILIQUIU1_RECORDIMPEGN = 3;
  public static int PQSL_DISTILIQUIU1_RECORDIMPEG1 = 4;
  public static int PQSL_DISTILIQUIU1_REIMUTANSUUT = 5;
  public static int PQSL_DISTILIQUIU1_REIMUTNUSUUT = 6;
  public static int PQSL_DISTILIQUIU1_RECORFATCODI = 7;
  public static int PQSL_DISTILIQUIU1_RECDISLIUTAN = 8;
  public static int PQSL_DISTILIQUIU1_RECDISLIUTNU = 9;
  public static int PQSL_DISTILIQUIU1_RECDISLIUTDA = 10;
  public static int PQSL_DISTILIQUIU1_REDILIUTUTIN = 11;
  public static int PQSL_DISTILIQUIU1_RECFATPRUNOR = 12;
  public static int PQSL_DISTILIQUIU1_RECFATNUMDOC = 13;
  public static int PQSL_DISTILIQUIU1_RECFATDDATDO = 14;
  public static int PQSL_DISTILIQUIU1_RECFATNUMPRO = 15;
  public static int PQSL_DISTILIQUIU1_RECFATDDATPR = 16;
  public static int PQSL_DISTILIQUIU1_RECORDRESIDU = 17;
  public static int PQSL_DISTILIQUIU1_RECORDFORNIT = 18;
  public static int PQSL_DISTILIQUIU1_IMPORTO = 19;
  public static int PQSL_DISTILIQUIU1_NOMINATIVO = 20;
  public static int PQSL_DISTILIQUIU1_RITENUTE = 21;
  public static int PQSL_DISTILIQUIU1_RECOIMPONETT = 22;
  public static int PQSL_DISTILIQUIU1_RECORDFATCIG = 23;
  public static int PQSL_DISTILIQUIU1_RECORDFATCUP = 24;
  public static int PQSL_DISTILIQUIU1_RECOFATTDESC = 25;
  public static int PQSL_DISTILIQUIU1_RECOCENTDESC = 26;
  public static int PQSL_DISTILIQUIU1_RECOFATTFATT = 27;
  public static int PQSL_DISTILIQUIU1_RECOCENTCENT = 28;
  public static int PQSL_DISTILIQUIU1_REDILIUTUDFC = 29;
  public static int PQSL_DISTILIQUIU1_REDILIUTUDFN = 30;
  public static int PQSL_DISTILIQUIU1_REDILIUTUDFR = 31;
  public static int PQSL_DISTILIQUIU1_REDILIUTUDFS = 32;
  public static int PQSL_DISTILIQUIU1_REDILIUTUUFC = 33;
  public static int PQSL_DISTILIQUIU1_REDILIUTUUFN = 34;
  public static int PQSL_DISTILIQUIU1_REDILIUTUUFR = 35;
  public static int PQSL_DISTILIQUIU1_REDILIUTUUFS = 36;
  public static int PQSL_DISTILIQUIU1_DESCRUO = 37;
  public static int PQSL_DISTILIQUIU1_RECORDLIQUID = 38;
  public static int PQSL_DISTILIQUIU1_RECFATTRAIVA = 39;
  public static int PQSL_DISTILIQUIU1_RECFATDAINUT = 40;
  public static int PQSL_DISTILIQUIU1_RECFATDAFIUT = 41;
  public static int PQSL_DISTILIQUIU1_RECONOMIUTEN = 42;
  public static int PQSL_DISTILIQUIU1_RECORNOMINNO = 43;
  public static int PQSL_DISTILIQUIU1_RECORNOMINRC = 44;
  public static int PQSL_DISTILIQUIU1_RECORNOMINSF = 45;
  public static int PQSL_DISTILIQUIU1_RECIMPANNDEL = 46;
  public static int PQSL_DISTILIQUIU1_RECIMPNUMDEL = 47;
  public static int PQSL_DISTILIQUIU1_RECIMPSEDDEL = 48;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE UT
  //
  public static int PQRY_DISTILIQUIU2 = 2087;
  public static int PQSL_DISTILIQUIU2_RECFATANNPRO = 0;
  public static int PQSL_DISTILIQUIU2_RECFATNUMPRO = 1;
  public static int PQSL_DISTILIQUIU2_RECFATNUMDOC = 2;
  public static int PQSL_DISTILIQUIU2_RECFATDDATDO = 3;
  public static int PQSL_DISTILIQUIU2_RECFATTRAIVA = 4;
  public static int PQSL_DISTILIQUIU2_IMPORTO = 5;
  public static int PQSL_DISTILIQUIU2_IMPORTOIVA = 6;
  public static int PQSL_DISTILIQUIU2_IMPORTONETTO = 7;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM94 = 2088;
  public static int PQRY_PARAM94_RS = 2089;
  public static int PQSL_PARAM94_NOMOGGNUODIS = 0;
  public static int PQSL_PARAM94_NOMOGGDIGIEM = 1;
  public static int PQSL_PARAM94_NOMOGGSCADAL = 2;
  public static int PQSL_PARAM94_NOMEOGGSCAAL = 3;
  public static int PQSL_PARAM94_NOMOGGDATDIS = 4;
  public static int PQSL_PARAM94_NOMEOGGDANUM = 5;
  public static int PQSL_PARAM94_NOMEOGGEDISN = 6;
  public static int PQSL_PARAM94_NOMEOGGETDEL = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI294 = 2090;
  public static int PQRY_PARAMETRI294_RS = 2091;
  public static int PQSL_PARAMETRI294_SEDE_DEL = 0;
  public static int PQSL_PARAMETRI294_NUMERO_DEL = 1;
  public static int PQSL_PARAMETRI294_ANNO_DEL = 2;
  public static int PQSL_PARAMETRI294_UNITA_PROPONENTE = 3;
  public static int PQSL_PARAMETRI294_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARAMETRI294_ANNO_PROPOSTA = 5;
  public static int PQSL_PARAMETRI294_DESCRIZIONE = 6;
  public static int PQSL_PARAMETRI294_UFFICIO = 7;
  public static int PQSL_PARAMETRI294_CAUSALE = 8;
  public static int PQSL_PARAMETRI294_BOLLO = 9;
  public static int PQSL_PARAMETRI294_PARAMINEMISS = 10;
  public static int PQSL_PARAMETRI294_PARADATACONT = 11;
  public static int PQSL_PARAMETRI294_SPESE = 12;
  public static int PQSL_PARAMETRI294_PARAMSCADENZ = 13;
  public static int PQSL_PARAMETRI294_ALLEGATI = 14;
  public static int PQSL_PARAMETRI294_PARAMCOMPDAL = 15;
  public static int PQSL_PARAMETRI294_PARAMCOMPAL = 16;
  public static int PQSL_PARAMETRI294_PARAMNUMCONT = 17;
  public static int PQSL_PARAMETRI294_PARDESDADEUT = 18;
  public static int PQSL_PARAMETRI294_PARAMDISTINN = 19;
  public static int PQSL_PARAMETRI294_PARAMDEL = 20;
  public static int PQSL_PARAMETRI294_PARSOLCONDIS = 21;
  public static int PQSL_PARAMETRI294_PARADISTANNO = 22;
  public static int PQSL_PARAMETRI294_PARAMESCLCIG = 23;

  // Table to contain panel selected row: DISTINTE LIQUIDAZIONE UT
  //
  public static int PQRY_DISTILIQUIUT = 2092;
  public static int PQSL_DISTILIQUIUT_ANNO = 0;
  public static int PQSL_DISTILIQUIUT_NUMERO = 1;
  public static int PQSL_DISTILIQUIUT_DATA = 2;
  public static int PQSL_DISTILIQUIUT_UTENZA = 3;
  public static int PQSL_DISTILIQUIUT_FLAG_COND_CONTRATTUALI = 4;
  public static int PQSL_DISTILIQUIUT_FLAG_SCELTA_FORNITORI = 5;
  public static int PQSL_DISTILIQUIUT_FLAG_REGOLARITA_CONTRIBUTIVA = 6;
  public static int PQSL_DISTILIQUIUT_FLAG_NULLA_OSTA = 7;
  public static int PQSL_DISTILIQUIUT_UTENTE_INSERIMENTO = 8;
  public static int PQSL_DISTILIQUIUT_DATA_INSERIMENTO = 9;
  public static int PQSL_DISTILIQUIUT_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_DISTILIQUIUT_DATA_ULTIMO_AGG = 11;
  public static int PQSL_DISTILIQUIUT_STORICO_CHECK = 12;
  public static int PQSL_DISTILIQUIUT_VISUALIZZAST = 13;
  public static int PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_CC = 14;
  public static int PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_NO = 15;
  public static int PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_RC = 16;
  public static int PQSL_DISTILIQUIUT_ULTIMO_UTENTE_FLAG_SF = 17;
  public static int PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_CC = 18;
  public static int PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_NO = 19;
  public static int PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_SF = 20;
  public static int PQSL_DISTILIQUIUT_ULTIMA_DATA_FLAG_RC = 21;
  public static int PQSL_DISTILIQUIUT_CONTALIQ = 22;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ55 = 2093;
  public static int PQSL_LIQ55_ANNO_LIQ = 0;
  public static int PQSL_LIQ55_NUMERO_LIQ = 1;
  public static int PQSL_LIQ55_DESCRIZIONE = 2;
  public static int PQSL_LIQ55_IMPORTO = 3;
  public static int PQSL_LIQ55_NUMERO_DOC = 4;
  public static int PQSL_LIQ55_IMPORTO_IVA = 5;
  public static int PQSL_LIQ55_RECFATDDATDO = 6;
  public static int PQSL_LIQ55_IVADOCUMENTO = 7;
  public static int PQSL_LIQ55_FAT_ANNO_PROG = 8;
  public static int PQSL_LIQ55_FAT_NUMERO_PROG = 9;

  // Table to contain panel selected row: Parameters
  //
  public static int PQRY_PARAMETERS1 = 2094;
  public static int PQRY_PARAMETERS1_RS = 2095;
  public static int PQSL_PARAMETERS1_PARADATAEMIS = 0;
  public static int PQSL_PARAMETERS1_PARAMECATEGO = 1;
  public static int PQSL_PARAMETERS1_PARADATAPROT = 2;
  public static int PQSL_PARAMETERS1_PARAMEDESCRI = 3;
  public static int PQSL_PARAMETERS1_PARAMCOMPDAL = 4;
  public static int PQSL_PARAMETERS1_PARAMCOMPEAL = 5;
  public static int PQSL_PARAMETERS1_PARAEMISLIQU = 6;
  public static int PQSL_PARAMETERS1_PARSOLCONDIS = 7;
  public static int PQSL_PARAMETERS1_PARAMSEDEDEL = 8;
  public static int PQSL_PARAMETERS1_PARAMNUMEDEL = 9;
  public static int PQSL_PARAMETERS1_PARAMANNODEL = 10;
  public static int PQSL_PARAMETERS1_PARAMEDESCR1 = 11;
  public static int PQSL_PARAMETERS1_PARAMEUFFICI = 12;
  public static int PQSL_PARAMETERS1_PARAMECAUSAL = 13;
  public static int PQSL_PARAMETERS1_PARAMETBOLLO = 14;
  public static int PQSL_PARAMETERS1_PARAMNUMCONT = 15;
  public static int PQSL_PARAMETERS1_PARADATACONT = 16;
  public static int PQSL_PARAMETERS1_PARAMINEMISS = 17;
  public static int PQSL_PARAMETERS1_PARDESDADEUT = 18;
  public static int PQSL_PARAMETERS1_PARACOMPDAL1 = 19;
  public static int PQSL_PARAMETERS1_PARAMCOMPAL1 = 20;
  public static int PQSL_PARAMETERS1_PARADATAARRI = 21;
  public static int PQSL_PARAMETERS1_PARNUMPROGEN = 22;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI2 = 2096;
  public static int PQSL_WORKEXPORTI2_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI2_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI2_FASE = 2;
  public static int PQSL_WORKEXPORTI2_FILE_DATI = 3;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI4 = 2097;
  public static int PQSL_WORKEXPORTI4_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI4_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI4_FASE = 2;
  public static int PQSL_WORKEXPORTI4_FILE_DATI = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM29 = 2098;
  public static int PQRY_PARAM29_RS = 2099;
  public static int PQSL_PARAM29_ROWNAMAPARDA = 0;
  public static int PQSL_PARAM29_ROWNAMEBOLLA = 1;

  // Table to contain panel selected row: TCO
  //
  public static int PQRY_TCO2 = 2100;
  public static int PQSL_TCO2_TIPO_BOLLATO = 0;
  public static int PQSL_TCO2_ANNO_REG = 1;
  public static int PQSL_TCO2_NUMERO_REG = 2;
  public static int PQSL_TCO2_DATA_REG = 3;
  public static int PQSL_TCO2_CONTO_RICAVO = 4;
  public static int PQSL_TCO2_CENTRO_COSTO = 5;
  public static int PQSL_TCO2_CODICE_RECORD = 6;
  public static int PQSL_TCO2_ESERCIZIO = 7;
  public static int PQSL_TCO2_CAPITOLO = 8;
  public static int PQSL_TCO2_ARTICOLO = 9;
  public static int PQSL_TCO2_ANNO_ACC = 10;
  public static int PQSL_TCO2_NUMERO_ACC = 11;
  public static int PQSL_TCO2_DESCRIZIONE = 12;
  public static int PQSL_TCO2_ANNO_ORD = 13;
  public static int PQSL_TCO2_NUMERO_ORD = 14;
  public static int PQSL_TCO2_IVA_DEF = 15;
  public static int PQSL_TCO2_PASSATO_CDR = 16;
  public static int PQSL_TCO2_ANNO_PRE = 17;
  public static int PQSL_TCO2_NUMERO_PRE = 18;
  public static int PQSL_TCO2_E = 19;
  public static int PQSL_TCO2_TIPO_REGISTRO = 20;
  public static int PQSL_TCO2_D_DATA_REG = 21;
  public static int PQSL_TCO2_CENTRO = 22;
  public static int PQSL_TCO2_FATTORE = 23;
  public static int PQSL_TCO2_COMPETENZA_DAL = 24;
  public static int PQSL_TCO2_COMPETENZA_AL = 25;
  public static int PQSL_TCO2_DATA_ESTRATTO_CCP = 26;
  public static int PQSL_TCO2_DATA_CCP = 27;
  public static int PQSL_TCO2_NUMERO_CONTABILE = 28;
  public static int PQSL_TCO2_TIPO_QUIETANZA = 29;
  public static int PQSL_TCO2_DATA_CONTABILE = 30;
  public static int PQSL_TCO2_UTENTE_INSERIMENTO = 31;
  public static int PQSL_TCO2_DATA_INSERIMENTO = 32;
  public static int PQSL_TCO2_UTENTE_ULTIMO_AGG = 33;
  public static int PQSL_TCO2_DATA_ULTIMO_AGG = 34;
  public static int PQSL_TCO2_TCOIMPORTO = 35;

  // Table to contain panel selected row: DCO
  //
  public static int PQRY_DCO1 = 2101;
  public static int PQSL_DCO1_IVA = 0;
  public static int PQSL_DCO1_ALIQUOTA = 1;
  public static int PQSL_DCO1_CODICE_ESENZIONE = 2;
  public static int PQSL_DCO1_IMPORTO = 3;
  public static int PQSL_DCO1_IMPONIBILE = 4;
  public static int PQSL_DCO1_UTENTE_INSERIMENTO = 5;
  public static int PQSL_DCO1_DATA_INSERIMENTO = 6;
  public static int PQSL_DCO1_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_DCO1_DATA_ULTIMO_AGG = 8;
  public static int PQSL_DCO1_ANNO_REG = 9;
  public static int PQSL_DCO1_NUMERO_REG = 10;
  public static int PQSL_DCO1_TIPO_BOLLATO = 11;
  public static int PQSL_DCO1_TIPO_REGISTRO = 12;
  public static int PQSL_DCO1_PROGRESSIVO = 13;

  // Table to contain panel selected row: TCO
  //
  public static int PQRY_TCO1 = 2102;
  public static int PQSL_TCO1_TIPO_BOLLATO = 0;
  public static int PQSL_TCO1_ANNO_REG = 1;
  public static int PQSL_TCO1_NUMERO_REG = 2;
  public static int PQSL_TCO1_DATA_REG = 3;
  public static int PQSL_TCO1_CONTO_RICAVO = 4;
  public static int PQSL_TCO1_CENTRO_COSTO = 5;
  public static int PQSL_TCO1_CODICE_RECORD = 6;
  public static int PQSL_TCO1_ESERCIZIO = 7;
  public static int PQSL_TCO1_CAPITOLO = 8;
  public static int PQSL_TCO1_ARTICOLO = 9;
  public static int PQSL_TCO1_ANNO_ACC = 10;
  public static int PQSL_TCO1_NUMERO_ACC = 11;
  public static int PQSL_TCO1_DESCRIZIONE = 12;
  public static int PQSL_TCO1_ANNO_ORD = 13;
  public static int PQSL_TCO1_NUMERO_ORD = 14;
  public static int PQSL_TCO1_IVA_DEF = 15;
  public static int PQSL_TCO1_PASSATO_CDR = 16;
  public static int PQSL_TCO1_ANNO_PRE = 17;
  public static int PQSL_TCO1_NUMERO_PRE = 18;
  public static int PQSL_TCO1_E = 19;
  public static int PQSL_TCO1_TIPO_REGISTRO = 20;
  public static int PQSL_TCO1_D_DATA_REG = 21;
  public static int PQSL_TCO1_CENTRO = 22;
  public static int PQSL_TCO1_FATTORE = 23;
  public static int PQSL_TCO1_COMPETENZA_DAL = 24;
  public static int PQSL_TCO1_COMPETENZA_AL = 25;
  public static int PQSL_TCO1_DATA_ESTRATTO_CCP = 26;
  public static int PQSL_TCO1_DATA_CCP = 27;
  public static int PQSL_TCO1_NUMERO_CONTABILE = 28;
  public static int PQSL_TCO1_TIPO_QUIETANZA = 29;
  public static int PQSL_TCO1_DATA_CONTABILE = 30;
  public static int PQSL_TCO1_UTENTE_INSERIMENTO = 31;
  public static int PQSL_TCO1_DATA_INSERIMENTO = 32;
  public static int PQSL_TCO1_UTENTE_ULTIMO_AGG = 33;
  public static int PQSL_TCO1_DATA_ULTIMO_AGG = 34;
  public static int PQSL_TCO1_TCOIMPORTO = 35;

  // Table to contain panel selected row: DCO
  //
  public static int PQRY_DCO = 2103;
  public static int PQSL_DCO_IVA = 0;
  public static int PQSL_DCO_ALIQUOTA = 1;
  public static int PQSL_DCO_CODICE_ESENZIONE = 2;
  public static int PQSL_DCO_IMPORTO = 3;
  public static int PQSL_DCO_IMPONIBILE = 4;
  public static int PQSL_DCO_UTENTE_INSERIMENTO = 5;
  public static int PQSL_DCO_DATA_INSERIMENTO = 6;
  public static int PQSL_DCO_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_DCO_DATA_ULTIMO_AGG = 8;
  public static int PQSL_DCO_ANNO_REG = 9;
  public static int PQSL_DCO_NUMERO_REG = 10;
  public static int PQSL_DCO_TIPO_BOLLATO = 11;
  public static int PQSL_DCO_TIPO_REGISTRO = 12;
  public static int PQSL_DCO_PROGRESSIVO = 13;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM104 = 2104;
  public static int PQRY_PARAM104_RS = 2105;
  public static int PQSL_PARAM104_NOMOGGTIPBOL = 0;
  public static int PQSL_PARAM104_NOMEOGGETDAL = 1;
  public static int PQSL_PARAM104_NOMEOGGETTAL = 2;
  public static int PQSL_PARAM104_NOMOGGNUOBOL = 3;

  // Table to contain panel selected row: PCC DOCUMENTI
  //
  public static int PQRY_PCCDOCUMENT1 = 2106;
  public static int PQSL_PCCDOCUMENT1_INSERITDACFA = 0;
  public static int PQSL_PCCDOCUMENT1_ATTESAACCETT = 1;
  public static int PQSL_PCCDOCUMENT1_COMUNIRICEZI = 2;
  public static int PQSL_PCCDOCUMENT1_FEINPCCDASDI = 3;
  public static int PQSL_PCCDOCUMENT1_COMUNICONTAB = 4;
  public static int PQSL_PCCDOCUMENT1_COMUNISCADUT = 5;
  public static int PQSL_PCCDOCUMENT1_COMUPAGAPARZ = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI602 = 2107;
  public static int PQRY_PARAMETRI602_RS = 2108;
  public static int PQSL_PARAMETRI602_PARAMDATADAL = 0;
  public static int PQSL_PARAMETRI602_PARAMDATAAL = 1;
  public static int PQSL_PARAMETRI602_PARAMDATADOC = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI604 = 2109;
  public static int PQRY_PARAMETRI604_RS = 2110;
  public static int PQSL_PARAMETRI604_PARAMDOCELAB = 0;
  public static int PQSL_PARAMETRI604_PARANOMEFILE = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI623 = 2111;
  public static int PQRY_PARAMETRI623_RS = 2112;
  public static int PQSL_PARAMETRI623_PARAFILEINVI = 0;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY7 = 2113;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI617 = 2114;
  public static int PQRY_PARAMETRI617_RS = 2115;
  public static int PQSL_PARAMETRI617_PARDATRIFSCA = 0;
  public static int PQSL_PARAMETRI617_PARADATEMIAL = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI608 = 2116;
  public static int PQRY_PARAMETRI608_RS = 2117;
  public static int PQSL_PARAMETRI608_PARAMDATA = 0;

  // Table to contain panel selected row: PCC FILE
  //
  public static int PQRY_PCCFILE = 2118;
  public static int PQSL_PCCFILE_CSV = 0;
  public static int PQSL_PCCFILE_PCCNOMEFILE = 1;
  public static int PQSL_PCCFILE_PCCCLOBFILE = 2;
  public static int PQSL_PCCFILE_PCCFILENOTE = 3;
  public static int PQSL_PCCFILE_PCCFILDAULVA = 4;
  public static int PQSL_PCCFILE_PCCFILUTULVA = 5;
  public static int PQSL_PCCFILE_PCCFILEANNUL = 6;
  public static int PQSL_PCCFILE_FILEESITO = 7;
  public static int PQSL_PCCFILE_PCCCLOFILESI = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI610 = 2119;
  public static int PQRY_PARAMETRI610_RS = 2120;
  public static int PQSL_PARAMETRI610_NOME_FILE = 0;
  public static int PQSL_PARAMETRI610_NOTE = 1;
  public static int PQSL_PARAMETRI610_DATA_ULTIMA_VARIAZIONE = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI600 = 2121;
  public static int PQRY_PARAMETRI600_RS = 2122;
  public static int PQSL_PARAMETRI600_PARAMAZIONE = 0;
  public static int PQSL_PARAMETRI600_PARDATSELDOC = 1;
  public static int PQSL_PARAMETRI600_PARINCDOCPAG = 2;

  // Table to contain panel selected row: PCC DOCUMENTI
  //
  public static int PQRY_PCCDOCUMENTI = 2123;
  public static int PQSL_PCCDOCUMENTI_PCCDOCPROREG = 0;
  public static int PQSL_PCCDOCUMENTI_PCCDOCANNPRO = 1;
  public static int PQSL_PCCDOCUMENTI_PCCDOCNUMPRO = 2;
  public static int PQSL_PCCDOCUMENTI_PCDOBERASOES = 3;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFANUDO = 4;
  public static int PQSL_PCCDOCUMENTI_PCCDOFADDADO = 5;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFACODO = 6;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFATIMP = 7;
  public static int PQSL_PCCDOCUMENTI_SALDO = 8;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFANUPR = 9;
  public static int PQSL_PCCDOCUMENTI_PCCDOFADDAPR = 10;
  public static int PQSL_PCCDOCUMENTI_PCDOFANUPRGE = 11;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFADAAR = 12;
  public static int PQSL_PCCDOCUMENTI_PCDOPCSTSTDD = 13;
  public static int PQSL_PCCDOCUMENTI_PCDOPCSTNOFI = 14;
  public static int PQSL_PCCDOCUMENTI_PCCDOCFATSTO = 15;
  public static int PQSL_PCCDOCUMENTI_PCCDOCSEMODO = 16;
  public static int PQSL_PCCDOCUMENTI_PCCDOCUTMODO = 17;
  public static int PQSL_PCCDOCUMENTI_PCCDOCDAMODO = 18;
  public static int PQSL_PCCDOCUMENTI_PCDOPCSTDAUV = 19;
  public static int PQSL_PCCDOCUMENTI_PCDOFAIDGDFE = 20;
  public static int PQSL_PCCDOCUMENTI_PCDOFEDOIDSD = 21;
  public static int PQSL_PCCDOCUMENTI_STATOLIQ = 22;
  public static int PQSL_PCCDOCUMENTI_ULTIMAAZIONE = 23;

  // Table to contain panel selected row: PCC STEP
  //
  public static int PQRY_PCCSTEP1 = 2124;
  public static int PQSL_PCCSTEP1_PCCSTEPROREG = 0;
  public static int PQSL_PCCSTEP1_PCCSTEPSEQUE = 1;
  public static int PQSL_PCCSTEP1_PCCSTEPAZION = 2;
  public static int PQSL_PCCSTEP1_PCCSTESTDEDE = 3;
  public static int PQSL_PCCSTEP1_PCCSTEIMPPAR = 4;
  public static int PQSL_PCCSTEP1_PCCSTENOMFIL = 5;
  public static int PQSL_PCCSTEP1_PCCSTEPANNUL = 6;
  public static int PQSL_PCCSTEP1_PCCSTEPNOTE = 7;
  public static int PQSL_PCCSTEP1_PCCSTEDAULVA = 8;
  public static int PQSL_PCCSTEP1_PCCSTEUTULVA = 9;
  public static int PQSL_PCCSTEP1_PCCSTECODESI = 10;
  public static int PQSL_PCCSTEP1_PCCSTEDESESI = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI606 = 2125;
  public static int PQRY_PARAMETRI606_RS = 2126;
  public static int PQSL_PARAMETRI606_PARAMAZIONE = 0;
  public static int PQSL_PARAMETRI606_PARAMNOTE = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI624 = 2127;
  public static int PQRY_PARAMETRI624_RS = 2128;
  public static int PQSL_PARAMETRI624_PARAMSOGGETT = 0;
  public static int PQSL_PARAMETRI624_PARAMNUMEDOC = 1;
  public static int PQSL_PARAMETRI624_PARAMDATADOC = 2;
  public static int PQSL_PARAMETRI624_PARANUMEPROT = 3;
  public static int PQSL_PARAMETRI624_PARADATAPROT = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI642 = 2129;
  public static int PQRY_PARAMETRI642_RS = 2130;
  public static int PQSL_PARAMETRI642_PARNOMFIDAAG = 0;
  public static int PQSL_PARAMETRI642_PARAFILDAIMP = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI626 = 2131;
  public static int PQRY_PARAMETRI626_RS = 2132;
  public static int PQSL_PARAMETRI626_PARANOMEFILE = 0;
  public static int PQSL_PARAMETRI626_PARAMSCELTA = 1;

  // Table to contain panel selected row: PCC STEP
  //
  public static int PQRY_PCCSTEP = 2133;
  public static int PQSL_PCCSTEP_PCCSTEPROREG = 0;
  public static int PQSL_PCCSTEP_PCCSTEPSEQUE = 1;
  public static int PQSL_PCCSTEP_PCCSTEPAZION = 2;
  public static int PQSL_PCCSTEP_PCCSTESTDEDE = 3;
  public static int PQSL_PCCSTEP_PCCSTEIMPPAR = 4;
  public static int PQSL_PCCSTEP_PCCSTENOMFIL = 5;
  public static int PQSL_PCCSTEP_PCCSTEPANNUL = 6;
  public static int PQSL_PCCSTEP_PCCSTEPNOTE = 7;
  public static int PQSL_PCCSTEP_PCCSTEDAULVA = 8;
  public static int PQSL_PCCSTEP_PCCSTEUTULVA = 9;
  public static int PQSL_PCCSTEP_PCCSTECODESI = 10;
  public static int PQSL_PCCSTEP_PCCSTEDESESI = 11;
  public static int PQSL_PCCSTEP_PCSTPCDOANPR = 12;
  public static int PQSL_PCCSTEP_PCSTPCDONUPR = 13;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP12 = 2134;
  public static int PQSL_CAP12_CAPITOLO = 0;
  public static int PQSL_CAP12_ARTICOLO = 1;
  public static int PQSL_CAP12_DESCRIZIONE = 2;
  public static int PQSL_CAP12_DESCRIZIONE_ABBREVIATA = 3;
  public static int PQSL_CAP12_E_S = 4;
  public static int PQSL_CAP12_ESERCIZIO = 5;
  public static int PQSL_CAP12_CODICE_STRUTTURA = 6;
  public static int PQSL_CAP12_IVLIVELLO = 7;
  public static int PQSL_CAP12_VLIVELLO = 8;
  public static int PQSL_CAP12_COFOG = 9;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO8 = 2135;
  public static int PQRY_FILTRO8_RS = 2136;
  public static int PQSL_FILTRO8_ROWNAMENTESP = 0;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP8 = 2137;
  public static int PQSL_CAP8_CAPITOLO = 0;
  public static int PQSL_CAP8_ARTICOLO = 1;
  public static int PQSL_CAP8_DESCRIZIONE = 2;
  public static int PQSL_CAP8_DESCRIZIONE_ABBREVIATA = 3;
  public static int PQSL_CAP8_E_S = 4;
  public static int PQSL_CAP8_VOCE_ECON = 5;
  public static int PQSL_CAP8_PROGRAMMA = 6;
  public static int PQSL_CAP8_PROGETTO = 7;
  public static int PQSL_CAP8_TIPO_VINCOLO = 8;
  public static int PQSL_CAP8_IVA = 9;
  public static int PQSL_CAP8_CONTRIB_COMU = 10;
  public static int PQSL_CAP8_FUNZ_DEL = 11;
  public static int PQSL_CAP8_GRUPPO_CP = 12;
  public static int PQSL_CAP8_GRUPPO_CC = 13;
  public static int PQSL_CAP8_CODICE_GESTIONALE = 14;
  public static int PQSL_CAP8_TITOLO = 15;
  public static int PQSL_CAP8_COD_TERZI = 16;
  public static int PQSL_CAP8_CATEGORIA = 17;
  public static int PQSL_CAP8_FUNZIONE = 18;
  public static int PQSL_CAP8_SERVIZIO = 19;
  public static int PQSL_CAP8_COD_INTERVENTO = 20;
  public static int PQSL_CAP8_RECCAPCODSTR = 21;
  public static int PQSL_CAP8_RECAENSPNORI = 22;
  public static int PQSL_CAP8_MACRO = 23;
  public static int PQSL_CAP8_MACRO5 = 24;
  public static int PQSL_CAP8_COFOG = 25;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP16 = 2138;
  public static int PQSL_CAP16_CAPITOLO = 0;
  public static int PQSL_CAP16_ARTICOLO = 1;
  public static int PQSL_CAP16_TITOLO = 2;
  public static int PQSL_CAP16_CATEGORIA = 3;
  public static int PQSL_CAP16_COD_INTERVENTO = 4;
  public static int PQSL_CAP16_FUNZIONE = 5;
  public static int PQSL_CAP16_SERVIZIO = 6;
  public static int PQSL_CAP16_VOCE_ECON = 7;
  public static int PQSL_CAP16_CODICE_GESTIONALE = 8;
  public static int PQSL_CAP16_COD_TERZI = 9;
  public static int PQSL_CAP16_DESCRIZIONE_ABBREVIATA = 10;
  public static int PQSL_CAP16_ANNOTAZIONI = 11;
  public static int PQSL_CAP16_DESCRIZIONE = 12;
  public static int PQSL_CAP16_ESERCIZIO = 13;
  public static int PQSL_CAP16_E_S = 14;
  public static int PQSL_CAP16_PROGRAMMA = 15;
  public static int PQSL_CAP16_PROGETTO = 16;
  public static int PQSL_CAP16_TIPO_VINCOLO = 17;
  public static int PQSL_CAP16_FLESSIBILITA = 18;
  public static int PQSL_CAP16_IVA = 19;
  public static int PQSL_CAP16_CONTRIB_COMU = 20;
  public static int PQSL_CAP16_FUNZ_DEL = 21;
  public static int PQSL_CAP16_STAMPA_DES_MAN = 22;
  public static int PQSL_CAP16_FATTORE = 23;
  public static int PQSL_CAP16_CENTRO = 24;
  public static int PQSL_CAP16_VOCE_PC = 25;
  public static int PQSL_CAP16_UTENTE_INSERIMENTO = 26;
  public static int PQSL_CAP16_DATA_INSERIMENTO = 27;
  public static int PQSL_CAP16_UTENTE_ULTIMO_AGG = 28;
  public static int PQSL_CAP16_DATA_ULTIMO_AGG = 29;
  public static int PQSL_CAP16_GRUPPO_CP = 30;
  public static int PQSL_CAP16_GRUPPO_CC = 31;
  public static int PQSL_CAP16_COD_MONITORAGGIO = 32;
  public static int PQSL_CAP16_CODICE_STRUTTURA = 33;
  public static int PQSL_CAP16_CODICE_EUROPEO = 34;
  public static int PQSL_CAP16_ENTRATA_SPESA_NON_RIC = 35;
  public static int PQSL_CAP16_CENTRO_COSTO = 36;
  public static int PQSL_CAP16_CDR_IMP = 37;
  public static int PQSL_CAP16_ESCLUSIONE_12 = 38;
  public static int PQSL_CAP16_FONDO_RIS_CASSA = 39;
  public static int PQSL_CAP16_IMPIGNORABILI = 40;
  public static int PQSL_CAP16_OBIETTOPERAT = 41;
  public static int PQSL_CAP16_OBIETTGESTIO = 42;
  public static int PQSL_CAP16_TIPO_AVANZO = 43;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO5 = 2139;
  public static int PQRY_CAPUO5_RS = 2140;
  public static int PQSL_CAPUO5_SCADENZA = 0;
  public static int PQSL_CAPUO5_TIPO_UNITA_ORGANIZZATIVA = 1;
  public static int PQSL_CAPUO5_PROGR_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_CAPUO5_UTENTE_INSERIMENTO = 3;
  public static int PQSL_CAPUO5_DATA_INSERIMENTO = 4;
  public static int PQSL_CAPUO5_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_CAPUO5_DATA_ULTIMO_AGG = 6;
  public static int PQSL_CAPUO5_RECORDDESC = 7;
  public static int PQSL_CAPUO5_ESERCIZIO = 8;
  public static int PQSL_CAPUO5_E_S = 9;
  public static int PQSL_CAPUO5_CAPITOLO = 10;
  public static int PQSL_CAPUO5_ARTICOLO = 11;
  public static int PQSL_CAPUO5_CAPUOIMDBSTA = 12;
  public static int PQSL_CAPUO5_PREVALENTE = 13;

  // Table to contain panel selected row: CAP CODICI
  //
  public static int PQRY_CAPCODICI2 = 2141;
  public static int PQSL_CAPCODICI2_ESERCIZIO = 0;
  public static int PQSL_CAPCODICI2_E_S = 1;
  public static int PQSL_CAPCODICI2_CAPITOLO = 2;
  public static int PQSL_CAPCODICI2_ARTICOLO = 3;
  public static int PQSL_CAPCODICI2_TIPO_CODICE = 4;
  public static int PQSL_CAPCODICI2_CODICE = 5;
  public static int PQSL_CAPCODICI2_UTENTE_INSERIMENTO = 6;
  public static int PQSL_CAPCODICI2_DATA_INSERIMENTO = 7;
  public static int PQSL_CAPCODICI2_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_CAPCODICI2_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: CAP RICLASSIFICAZIONI
  //
  public static int PQRY_CAPRICLASSI1 = 2142;
  public static int PQSL_CAPRICLASSI1_ESERCIZIO = 0;
  public static int PQSL_CAPRICLASSI1_E_S = 1;
  public static int PQSL_CAPRICLASSI1_CAPITOLO = 2;
  public static int PQSL_CAPRICLASSI1_ARTICOLO = 3;
  public static int PQSL_CAPRICLASSI1_STRUTTURA_RICL_ID = 4;
  public static int PQSL_CAPRICLASSI1_UTENTE_INSERIMENTO = 5;
  public static int PQSL_CAPRICLASSI1_DATA_INSERIMENTO = 6;
  public static int PQSL_CAPRICLASSI1_DATA_ULTIMO_AGG = 7;
  public static int PQSL_CAPRICLASSI1_UTENTE_ULTIMO_AGG = 8;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI2 = 2143;
  public static int QSL_CFDBCFDBSEI2_COUNT = 0;

  // Recordset for query: Cap UO IMDB
  //
  public static int QRY_CAPUOIMDB1 = 2144;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBESE = 0;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBES = 1;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBCAP = 2;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBART = 3;
  public static int QSL_CAPUOIMDB1_CAUOIMPRUNOR = 4;
  public static int QSL_CAPUOIMDB1_CAUOIMTIUNOR = 5;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBSCA = 6;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBPRE = 7;
  public static int QSL_CAPUOIMDB1_CAPUOIMDBSTA = 8;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI3 = 2145;
  public static int QSL_CFDBCFDBSEI3_COUNT = 0;

  // Table to contain panel selected row: Paramentri
  //
  public static int PQRY_PARAMENTRI1 = 2146;

  // Recordset for query: PIANO DEI CONTI
  //
  public static int QRY_PIANODEICON1 = 2147;
  public static int QSL_PIANODEICON1_ROWNAMECAPIT = 0;
  public static int QSL_PIANODEICON1_ROWNAMEARTIC = 1;
  public static int QSL_PIANODEICON1_ROWNAMEES = 2;
  public static int QSL_PIANODEICON1_ROWNAMEESERC = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI460 = 2148;
  public static int PQRY_PARAMETRI460_RS = 2149;
  public static int PQSL_PARAMETRI460_ROWNAMIMPSUB = 0;
  public static int PQSL_PARAMETRI460_ROWNAMEACCER = 1;
  public static int PQSL_PARAMETRI460_ROWNAMELIQUI = 2;
  public static int PQSL_PARAMETRI460_ROWNAMEORDIN = 3;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM13 = 2150;
  public static int PQRY_PARAMESTAM13_RS = 2151;
  public static int PQSL_PARAMESTAM13_PARSTAVOCPEG = 0;
  public static int PQSL_PARAMESTAM13_PARSTAANUOSC = 1;
  public static int PQSL_PARAMESTAM13_PARASTAMTIPO = 2;
  public static int PQSL_PARAMESTAM13_PARASTAMPART = 3;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP14 = 2152;
  public static int PQSL_CAP14_E_S = 0;
  public static int PQSL_CAP14_RECORVOCEPEG = 1;
  public static int PQSL_CAP14_CAPITOLO = 2;
  public static int PQSL_CAP14_ARTICOLO = 3;
  public static int PQSL_CAP14_DESCRIZIONE = 4;
  public static int PQSL_CAP14_RECORDESCRUO = 5;
  public static int PQSL_CAP14_SCADENZA = 6;

  // Table to contain panel selected row: CAP FIN
  //
  public static int PQRY_CAPFIN = 2153;
  public static int PQSL_CAPFIN_ESERCIZIO = 0;
  public static int PQSL_CAPFIN_E_S = 1;
  public static int PQSL_CAPFIN_CAPITOLO = 2;
  public static int PQSL_CAPFIN_ARTICOLO = 3;
  public static int PQSL_CAPFIN_UTENTE_INSERIMENTO = 4;
  public static int PQSL_CAPFIN_DATA_INSERIMENTO = 5;
  public static int PQSL_CAPFIN_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_CAPFIN_DATA_ULTIMO_AGG = 7;
  public static int PQSL_CAPFIN_SCADENZA = 8;
  public static int PQSL_CAPFIN_FINANZIAMENTO = 9;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM5 = 2154;
  public static int PQRY_PARAM5_RS = 2155;
  public static int PQSL_PARAM5_PARTE = 0;
  public static int PQSL_PARAM5_PARCONOSENFI = 1;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP2 = 2156;
  public static int PQSL_CAP2_RECORVOCEPEG = 0;
  public static int PQSL_CAP2_E_S = 1;
  public static int PQSL_CAP2_DESCRIZIONE_ABBREVIATA = 2;
  public static int PQSL_CAP2_CAPITOLO = 3;
  public static int PQSL_CAP2_ARTICOLO = 4;
  public static int PQSL_CAP2_RECORCAPDESC = 5;
  public static int PQSL_CAP2_RECORDFINANZ = 6;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP4 = 2157;
  public static int PQSL_CAP4_E_S = 0;
  public static int PQSL_CAP4_RECORVOCEPEG = 1;
  public static int PQSL_CAP4_CAPITOLO = 2;
  public static int PQSL_CAP4_ARTICOLO = 3;
  public static int PQSL_CAP4_DESCRIZIONE = 4;

  // Table to contain panel selected row: CORRISPONDENZE CAP ARM
  //
  public static int PQRY_CORRISCAPARM = 2158;
  public static int PQSL_CORRISCAPARM_ESERCIZIO = 0;
  public static int PQSL_CORRISCAPARM_E_S = 1;
  public static int PQSL_CORRISCAPARM_CAPITOLO_ARM = 2;
  public static int PQSL_CORRISCAPARM_ARTICOLO_ARM = 3;
  public static int PQSL_CORRISCAPARM_RISORSA_INTERVENTO = 4;
  public static int PQSL_CORRISCAPARM_CAPITOLO = 5;
  public static int PQSL_CORRISCAPARM_ARTICOLO = 6;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO1 = 2159;
  public static int PQRY_FILTRO1_RS = 2160;
  public static int PQSL_FILTRO1_ROWNAMENTSPE = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM126 = 2161;
  public static int PQRY_PARAM126_RS = 2162;
  public static int PQSL_PARAM126_PARARISOINTE = 0;
  public static int PQSL_PARAM126_PARAMCAPITOL = 1;
  public static int PQSL_PARAM126_PARAMARTICOL = 2;

}
