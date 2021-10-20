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
public class IMDBDef9 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: T58
  //
  public static int PQRY_T66 = 1634;
  public static int PQSL_T66_CODICE = 0;
  public static int PQSL_T66_DESCRIZIONE = 1;
  public static int PQSL_T66_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T66_DATA_INSERIMENTO = 3;
  public static int PQSL_T66_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T66_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T57
  //
  public static int PQRY_T57 = 1635;
  public static int PQSL_T57_CODICE = 0;
  public static int PQSL_T57_DESCRIZIONE = 1;
  public static int PQSL_T57_T57STATO = 2;

  // Table to contain panel selected row: T58
  //
  public static int PQRY_T58 = 1636;
  public static int PQSL_T58_CODICE = 0;
  public static int PQSL_T58_DESCRIZIONE = 1;

  // Table to contain panel selected row: T60
  //
  public static int PQRY_T61 = 1637;
  public static int PQSL_T61_CODICE = 0;
  public static int PQSL_T61_DESCRIZIONE = 1;
  public static int PQSL_T61_TIPO = 2;
  public static int PQSL_T61_IMPORTO_MASSIMO = 3;
  public static int PQSL_T61_RIF_TESO_1 = 4;
  public static int PQSL_T61_RIF_TESO_2 = 5;
  public static int PQSL_T61_UTENTE_INSERIMENTO = 6;
  public static int PQSL_T61_DATA_INSERIMENTO = 7;
  public static int PQSL_T61_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_T61_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: T60
  //
  public static int PQRY_T68 = 1638;
  public static int PQSL_T68_CODICE = 0;
  public static int PQSL_T68_DESCRIZIONE = 1;
  public static int PQSL_T68_TIPO = 2;
  public static int PQSL_T68_IMPORTO_MASSIMO = 3;
  public static int PQSL_T68_RIF_TESO_1 = 4;
  public static int PQSL_T68_RIF_TESO_2 = 5;

  // Table to contain panel selected row: Firme
  //
  public static int PQRY_FIRME1 = 1639;
  public static int PQSL_FIRME1_CODICE = 0;
  public static int PQSL_FIRME1_PROGRESSIVO = 1;
  public static int PQSL_FIRME1_DESCRIZIONE = 2;
  public static int PQSL_FIRME1_BITMAP = 3;
  public static int PQSL_FIRME1_UTENTE_INSERIMENTO = 4;
  public static int PQSL_FIRME1_DATA_INSERIMENTO = 5;
  public static int PQSL_FIRME1_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_FIRME1_DATA_ULTIMO_AGG = 7;
  public static int PQSL_FIRME1_ESTENSIONE_FILE = 8;
  public static int PQSL_FIRME1_IMMAGINE = 9;

  // Table to contain panel selected row: Firme
  //
  public static int PQRY_FIRME = 1640;
  public static int PQSL_FIRME_CODICE = 0;
  public static int PQSL_FIRME_PROGRESSIVO = 1;
  public static int PQSL_FIRME_DESCRIZIONE = 2;
  public static int PQSL_FIRME_BITMAP = 3;

  // Table to contain panel selected row: T86
  //
  public static int PQRY_T89 = 1641;
  public static int PQSL_T89_CODICE = 0;
  public static int PQSL_T89_DESCRIZIONE = 1;
  public static int PQSL_T89_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T89_DATA_INSERIMENTO = 3;
  public static int PQSL_T89_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T89_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T86
  //
  public static int PQRY_T86 = 1642;
  public static int PQSL_T86_CODICE = 0;
  public static int PQSL_T86_DESCRIZIONE = 1;

  // Table to contain panel selected row: TIPI INCARICO
  //
  public static int PQRY_TIPIINCARIC1 = 1643;
  public static int PQSL_TIPIINCARIC1_CODICE = 0;
  public static int PQSL_TIPIINCARIC1_DESCRIZIONE = 1;
  public static int PQSL_TIPIINCARIC1_UTENTE_INSERIMENTO = 2;
  public static int PQSL_TIPIINCARIC1_DATA_INSERIMENTO = 3;
  public static int PQSL_TIPIINCARIC1_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_TIPIINCARIC1_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: TIPI INCARICO
  //
  public static int PQRY_TIPIINCARICO = 1644;
  public static int PQSL_TIPIINCARICO_CODICE = 0;
  public static int PQSL_TIPIINCARICO_DESCRIZIONE = 1;

  // Table to contain panel selected row: VOCI TECNICHE OPERE
  //
  public static int PQRY_VOCITECNOPER = 1645;
  public static int PQSL_VOCITECNOPER_CODICE = 0;
  public static int PQSL_VOCITECNOPER_DESCRIZIONE = 1;

  // Table to contain panel selected row: T59
  //
  public static int PQRY_T60 = 1646;
  public static int PQSL_T60_CODICE = 0;
  public static int PQSL_T60_ANNO_ACC = 1;
  public static int PQSL_T60_NUMERO_ACC = 2;
  public static int PQSL_T60_ANNO_IMP = 3;
  public static int PQSL_T60_NUMERO_IMP = 4;
  public static int PQSL_T60_TIPO = 5;
  public static int PQSL_T60_UTENTE_INSERIMENTO = 6;
  public static int PQSL_T60_DATA_INSERIMENTO = 7;
  public static int PQSL_T60_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_T60_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: T59
  //
  public static int PQRY_T59 = 1647;
  public static int PQSL_T59_CODICE = 0;
  public static int PQSL_T59_ANNO_ACC = 1;
  public static int PQSL_T59_NUMERO_ACC = 2;
  public static int PQSL_T59_ANNO_IMP = 3;
  public static int PQSL_T59_NUMERO_IMP = 4;
  public static int PQSL_T59_TIPO = 5;
  public static int PQSL_T59_T59ACCDESCRI = 6;
  public static int PQSL_T59_DESCRIZIONE = 7;

  // Table to contain panel selected row: T62
  //
  public static int PQRY_T63 = 1648;
  public static int PQSL_T63_CODICE = 0;
  public static int PQSL_T63_QUADRO = 1;
  public static int PQSL_T63_DESCRIZIONE = 2;
  public static int PQSL_T63_DES_ABBREVIATA = 3;
  public static int PQSL_T63_TIPO_CERT = 4;
  public static int PQSL_T63_ARTICOLO = 5;
  public static int PQSL_T63_SUB_QUADRO = 6;
  public static int PQSL_T63_CODICE_TS = 7;
  public static int PQSL_T63_TIPO_RITENUTA = 8;
  public static int PQSL_T63_UTENTE_INSERIMENTO = 9;
  public static int PQSL_T63_DATA_INSERIMENTO = 10;
  public static int PQSL_T63_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_T63_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: T62
  //
  public static int PQRY_T79 = 1649;
  public static int PQSL_T79_CODICE = 0;
  public static int PQSL_T79_QUADRO = 1;
  public static int PQSL_T79_DESCRIZIONE = 2;
  public static int PQSL_T79_DES_ABBREVIATA = 3;
  public static int PQSL_T79_TIPO_CERT = 4;
  public static int PQSL_T79_ARTICOLO = 5;
  public static int PQSL_T79_SUB_QUADRO = 6;
  public static int PQSL_T79_CODICE_TS = 7;
  public static int PQSL_T79_TIPO_RITENUTA = 8;

  // Table to contain panel selected row: T82
  //
  public static int PQRY_T85 = 1650;
  public static int PQSL_T85_CODICE = 0;
  public static int PQSL_T85_ALIQ_SSN_CD = 1;
  public static int PQSL_T85_ALIQ_SSN_CE = 2;
  public static int PQSL_T85_DESCRIZIONE = 3;
  public static int PQSL_T85_ANNO_IMP = 4;
  public static int PQSL_T85_NUMERO_IMP = 5;
  public static int PQSL_T85_UTENTE_INSERIMENTO = 6;
  public static int PQSL_T85_DATA_INSERIMENTO = 7;
  public static int PQSL_T85_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_T85_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: T82
  //
  public static int PQRY_T82 = 1651;
  public static int PQSL_T82_CODICE = 0;
  public static int PQSL_T82_ALIQ_SSN_CD = 1;
  public static int PQSL_T82_ALIQ_SSN_CE = 2;
  public static int PQSL_T82_DESCRIZIONE = 3;
  public static int PQSL_T82_ANNO_IMP = 4;
  public static int PQSL_T82_NUMERO_IMP = 5;

  // Table to contain panel selected row: T83
  //
  public static int PQRY_T84 = 1652;
  public static int PQSL_T84_CODICE = 0;
  public static int PQSL_T84_DESCRIZIONE = 1;
  public static int PQSL_T84_PERC_IMPONIBILE = 2;
  public static int PQSL_T84_ALIQUOTA_INPS = 3;
  public static int PQSL_T84_ALIQUOTA_INPS_CP = 4;
  public static int PQSL_T84_ALIQUOTA_INPS_CE = 5;
  public static int PQSL_T84_ANNO_ACC = 6;
  public static int PQSL_T84_NUMERO_ACC = 7;
  public static int PQSL_T84_ANNO_IMP_CP = 8;
  public static int PQSL_T84_NUMERO_IMP_CP = 9;
  public static int PQSL_T84_ANNO_IMP_CE = 10;
  public static int PQSL_T84_NUMERO_IMP_CE = 11;
  public static int PQSL_T84_TIPO = 12;
  public static int PQSL_T84_UTENTE_INSERIMENTO = 13;
  public static int PQSL_T84_DATA_INSERIMENTO = 14;
  public static int PQSL_T84_UTENTE_ULTIMO_AGG = 15;
  public static int PQSL_T84_DATA_ULTIMO_AGG = 16;

  // Table to contain panel selected row: T83
  //
  public static int PQRY_T83 = 1653;
  public static int PQSL_T83_CODICE = 0;
  public static int PQSL_T83_DESCRIZIONE = 1;
  public static int PQSL_T83_PERC_IMPONIBILE = 2;
  public static int PQSL_T83_ALIQUOTA_INPS = 3;
  public static int PQSL_T83_ALIQUOTA_INPS_CP = 4;
  public static int PQSL_T83_ALIQUOTA_INPS_CE = 5;
  public static int PQSL_T83_ANNO_ACC = 6;
  public static int PQSL_T83_NUMERO_ACC = 7;
  public static int PQSL_T83_ANNO_IMP_CP = 8;
  public static int PQSL_T83_NUMERO_IMP_CP = 9;
  public static int PQSL_T83_ANNO_IMP_CE = 10;
  public static int PQSL_T83_NUMERO_IMP_CE = 11;
  public static int PQSL_T83_TIPO = 12;
  public static int PQSL_T83_T83INFOACCER = 13;
  public static int PQSL_T83_T83SCELTACCE = 14;
  public static int PQSL_T83_T83INFOIMPCP = 15;
  public static int PQSL_T83_T83SCELIMPCP = 16;
  public static int PQSL_T83_T83INFOIMPCE = 17;
  public static int PQSL_T83_T83SCELIMPCE = 18;

  // Table to contain panel selected row: T87
  //
  public static int PQRY_T88 = 1654;
  public static int PQSL_T88_CODICE = 0;
  public static int PQSL_T88_DESCRIZIONE = 1;
  public static int PQSL_T88_ALIQUOTA_INAIL = 2;
  public static int PQSL_T88_ALIQUOTA_INAIL_CP = 3;
  public static int PQSL_T88_ALIQUOTA_INAIL_CE = 4;
  public static int PQSL_T88_ANNO_ACC = 5;
  public static int PQSL_T88_NUMERO_ACC = 6;
  public static int PQSL_T88_PERC_IMPONIBILE = 7;
  public static int PQSL_T88_UTENTE_INSERIMENTO = 8;
  public static int PQSL_T88_DATA_INSERIMENTO = 9;
  public static int PQSL_T88_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_T88_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: T87
  //
  public static int PQRY_T87 = 1655;
  public static int PQSL_T87_CODICE = 0;
  public static int PQSL_T87_DESCRIZIONE = 1;
  public static int PQSL_T87_ALIQUOTA_INAIL = 2;
  public static int PQSL_T87_ALIQUOTA_INAIL_CP = 3;
  public static int PQSL_T87_ALIQUOTA_INAIL_CE = 4;
  public static int PQSL_T87_ANNO_ACC = 5;
  public static int PQSL_T87_NUMERO_ACC = 6;
  public static int PQSL_T87_PERC_IMPONIBILE = 7;
  public static int PQSL_T87_UTENTE_INSERIMENTO = 8;
  public static int PQSL_T87_DATA_INSERIMENTO = 9;
  public static int PQSL_T87_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_T87_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: T05
  //
  public static int PQRY_T8 = 1656;
  public static int PQSL_T8_CODICE = 0;
  public static int PQSL_T8_DESCRIZIONE = 1;
  public static int PQSL_T8_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T8_DATA_INSERIMENTO = 3;
  public static int PQSL_T8_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T8_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T05
  //
  public static int PQRY_T05 = 1657;
  public static int PQSL_T05_CODICE = 0;
  public static int PQSL_T05_DESCRIZIONE = 1;

  // Table to contain panel selected row: T01
  //
  public static int PQRY_T2 = 1658;
  public static int PQSL_T2_CODICE = 0;
  public static int PQSL_T2_DESCRIZIONE = 1;
  public static int PQSL_T2_NUM_GIORNI = 2;
  public static int PQSL_T2_DECORRENZA1 = 3;
  public static int PQSL_T2_DECORRENZA2 = 4;
  public static int PQSL_T2_PREVALENTE = 5;
  public static int PQSL_T2_SE_PERSONALE = 6;
  public static int PQSL_T2_UTENTE_INSERIMENTO = 7;
  public static int PQSL_T2_DATA_INSERIMENTO = 8;
  public static int PQSL_T2_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_T2_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: T01
  //
  public static int PQRY_T01 = 1659;
  public static int PQSL_T01_CODICE = 0;
  public static int PQSL_T01_DESCRIZIONE = 1;
  public static int PQSL_T01_NUM_GIORNI = 2;
  public static int PQSL_T01_DECORRENZA1 = 3;
  public static int PQSL_T01_DECORRENZA2 = 4;
  public static int PQSL_T01_PREVALENTE = 5;
  public static int PQSL_T01_SE_PERSONALE = 6;

  // Table to contain panel selected row: T02
  //
  public static int PQRY_T3 = 1660;
  public static int PQSL_T3_CODICE = 0;
  public static int PQSL_T3_DESCRIZIONE = 1;
  public static int PQSL_T3_STAMPA_AVVISO = 2;
  public static int PQSL_T3_TIPO = 3;
  public static int PQSL_T3_RIFERIMENTO = 4;
  public static int PQSL_T3_RIF_TESO_MINF = 5;
  public static int PQSL_T3_DESCRIZIONE_MINF = 6;
  public static int PQSL_T3_UTENTE_INSERIMENTO = 7;
  public static int PQSL_T3_DATA_INSERIMENTO = 8;
  public static int PQSL_T3_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_T3_DATA_ULTIMO_AGG = 10;
  public static int PQSL_T3_CODICE_FE = 11;

  // Table to contain panel selected row: T02
  //
  public static int PQRY_T02 = 1661;
  public static int PQSL_T02_CODICE = 0;
  public static int PQSL_T02_DESCRIZIONE = 1;
  public static int PQSL_T02_STAMPA_AVVISO = 2;
  public static int PQSL_T02_TIPO = 3;
  public static int PQSL_T02_RIFERIMENTO = 4;
  public static int PQSL_T02_RIF_TESO_MINF = 5;
  public static int PQSL_T02_DESCRIZIONE_MINF = 6;

  // Table to contain panel selected row: T08
  //
  public static int PQRY_T9 = 1662;
  public static int PQSL_T9_CODICE = 0;
  public static int PQSL_T9_DESCRIZIONE = 1;
  public static int PQSL_T9_CENTRO_COSTO = 2;
  public static int PQSL_T9_FATTORE_PRO = 3;
  public static int PQSL_T9_UTENTE_INSERIMENTO = 4;
  public static int PQSL_T9_DATA_INSERIMENTO = 5;
  public static int PQSL_T9_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_T9_DATA_ULTIMO_AGG = 7;

  // Table to contain panel selected row: T08
  //
  public static int PQRY_T08 = 1663;
  public static int PQSL_T08_CODICE = 0;
  public static int PQSL_T08_DESCRIZIONE = 1;
  public static int PQSL_T08_CENTRO_COSTO = 2;
  public static int PQSL_T08_FATTORE_PRO = 3;

  // Table to contain panel selected row: T53
  //
  public static int PQRY_T54 = 1664;
  public static int PQSL_T54_CODICE = 0;
  public static int PQSL_T54_DESCRIZIONE = 1;
  public static int PQSL_T54_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T54_DATA_INSERIMENTO = 3;
  public static int PQSL_T54_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T54_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T53
  //
  public static int PQRY_T53 = 1665;
  public static int PQSL_T53_CODICE = 0;
  public static int PQSL_T53_DESCRIZIONE = 1;

  // Table to contain panel selected row: CAUSALI SOSPENSIONE
  //
  public static int PQRY_CAUSALSOSPEN = 1666;
  public static int PQSL_CAUSALSOSPEN_CODICE = 0;
  public static int PQSL_CAUSALSOSPEN_DESCRIZIONE = 1;
  public static int PQSL_CAUSALSOSPEN_TIPO_CAUSALE_SOSPENSIONE = 2;
  public static int PQSL_CAUSALSOSPEN_CODICE_PCC = 3;
  public static int PQSL_CAUSALSOSPEN_PREVALENTE = 4;

  // Table to contain panel selected row: T04
  //
  public static int PQRY_T17 = 1667;
  public static int PQSL_T17_TIPO_REGISTRO = 0;
  public static int PQSL_T17_TIPO_BOLLATO = 1;
  public static int PQSL_T17_DESCRIZIONE = 2;
  public static int PQSL_T17_TIPO_BOLLATO_DEF = 3;
  public static int PQSL_T17_ATTIVITA = 4;
  public static int PQSL_T17_ESENTE = 5;
  public static int PQSL_T17_VENTILAZIONE_IVA = 6;
  public static int PQSL_T17_CODICE_GESTIONALE = 7;
  public static int PQSL_T17_CAPITOLO_IVA = 8;
  public static int PQSL_T17_ARTICOLO_IVA = 9;
  public static int PQSL_T17_TIPO_ESIGIBILITA = 10;
  public static int PQSL_T17_FLAG_IMP_ECO = 11;
  public static int PQSL_T17_CENTRO = 12;
  public static int PQSL_T17_FATTORE = 13;
  public static int PQSL_T17_FATTORE_IVA = 14;
  public static int PQSL_T17_PROGETTO_IVA = 15;
  public static int PQSL_T17_RILEVANTE_IVA = 16;
  public static int PQSL_T17_CORRISPETTIVI = 17;
  public static int PQSL_T17_IMP_BOLLO_DA_CAUSALE = 18;
  public static int PQSL_T17_FATTURA_PERSONALIZZATA = 19;
  public static int PQSL_T17_BOLLETTINI = 20;
  public static int PQSL_T17_RIMBORSI = 21;
  public static int PQSL_T17_UTENTE_INSERIMENTO = 22;
  public static int PQSL_T17_DATA_INSERIMENTO = 23;
  public static int PQSL_T17_UTENTE_ULTIMO_AGG = 24;
  public static int PQSL_T17_DATA_ULTIMO_AGG = 25;
  public static int PQSL_T17_COD_LIVELLO_5 = 26;
  public static int PQSL_T17_ID_MODELLO = 27;
  public static int PQSL_T17_TIPO_BOLLATO_VENDITE_SP = 28;
  public static int PQSL_T17_TIPO_BOLLATO_VENDITE_RC = 29;
  public static int PQSL_T17_NUMERO_ACC_SP = 30;
  public static int PQSL_T17_ANNO_ACC_SP = 31;
  public static int PQSL_T17_NUMERO_IMP_SP = 32;
  public static int PQSL_T17_ANNO_IMP_SP = 33;
  public static int PQSL_T17_NUMERO_IMP_RC = 34;
  public static int PQSL_T17_ANNO_IMP_RC = 35;
  public static int PQSL_T17_ANNO_ACC_RC = 36;
  public static int PQSL_T17_NUMERO_ACC_RC = 37;
  public static int PQSL_T17_PAGO_PA = 38;
  public static int PQSL_T17_COD_SERVIZIO_PAGOPA = 39;

  // Table to contain panel selected row: T04
  //
  public static int PQRY_T6 = 1668;
  public static int PQSL_T6_TIPO_REGISTRO = 0;
  public static int PQSL_T6_RECORT04DESC = 1;
  public static int PQSL_T6_TIPO_BOLLATO = 2;
  public static int PQSL_T6_TIPO_BOLLATO_DEF = 3;
  public static int PQSL_T6_ATTIVITA = 4;
  public static int PQSL_T6_RECORT09DESC = 5;
  public static int PQSL_T6_ESENTE = 6;
  public static int PQSL_T6_VENTILAZIONE_IVA = 7;
  public static int PQSL_T6_CAPITOLO_IVA = 8;
  public static int PQSL_T6_ARTICOLO_IVA = 9;
  public static int PQSL_T6_DESCRIZIONE = 10;
  public static int PQSL_T6_RIMBORSI = 11;
  public static int PQSL_T6_RET0TIBOVESP = 12;
  public static int PQSL_T6_RET0TIBOVERC = 13;
  public static int PQSL_T6_RECT04NUACSP = 14;
  public static int PQSL_T6_RECT04ANACSP = 15;
  public static int PQSL_T6_RECT04NUIMSP = 16;
  public static int PQSL_T6_RECT04ANIMSP = 17;
  public static int PQSL_T6_RECT04NUIMRC = 18;
  public static int PQSL_T6_RECT04ANIMRC = 19;
  public static int PQSL_T6_RECORACCDESC = 20;
  public static int PQSL_T6_RECORIMPDESC = 21;
  public static int PQSL_T6_RECOIMPDESC2 = 22;
  public static int PQSL_T6_RECT04NUACRC = 23;
  public static int PQSL_T6_RECT04ANACRC = 24;
  public static int PQSL_T6_RECOACCDESC1 = 25;
  public static int PQSL_T6_RECOT04PAGPA = 26;

  // Table to contain panel selected row: T06
  //
  public static int PQRY_T7 = 1669;
  public static int PQSL_T7_CODICE = 0;
  public static int PQSL_T7_DESCRIZIONE = 1;
  public static int PQSL_T7_TIPO = 2;
  public static int PQSL_T7_TIPO_ECF = 3;
  public static int PQSL_T7_UTENTE_INSERIMENTO = 4;
  public static int PQSL_T7_DATA_INSERIMENTO = 5;
  public static int PQSL_T7_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_T7_DATA_ULTIMO_AGG = 7;
  public static int PQSL_T7_CODICE_FE = 8;

  // Table to contain panel selected row: T06
  //
  public static int PQRY_T06 = 1670;
  public static int PQSL_T06_CODICE = 0;
  public static int PQSL_T06_DESCRIZIONE = 1;
  public static int PQSL_T06_TIPO = 2;
  public static int PQSL_T06_TIPO_ECF = 3;

  // Table to contain panel selected row: T09
  //
  public static int PQRY_T12 = 1671;
  public static int PQSL_T12_CODICE = 0;
  public static int PQSL_T12_DESCRIZIONE = 1;
  public static int PQSL_T12_CODICE_IVA = 2;
  public static int PQSL_T12_PRORATA = 3;
  public static int PQSL_T12_TIPO_LIQUIDAZIONE = 4;
  public static int PQSL_T12_DETR_IVA_CI4 = 5;
  public static int PQSL_T12_ISTITUZIONALE = 6;
  public static int PQSL_T12_UTENTE_INSERIMENTO = 7;
  public static int PQSL_T12_DATA_INSERIMENTO = 8;
  public static int PQSL_T12_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_T12_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: T09
  //
  public static int PQRY_T09 = 1672;
  public static int PQSL_T09_CODICE = 0;
  public static int PQSL_T09_DESCRIZIONE = 1;
  public static int PQSL_T09_CODICE_IVA = 2;
  public static int PQSL_T09_PRORATA = 3;
  public static int PQSL_T09_TIPO_LIQUIDAZIONE = 4;
  public static int PQSL_T09_DETR_IVA_CI4 = 5;

  // Table to contain panel selected row: STAT IVA
  //
  public static int PQRY_STATIVA1 = 1673;
  public static int PQSL_STATIVA1_CODICE = 0;
  public static int PQSL_STATIVA1_DESCRIZIONE = 1;
  public static int PQSL_STATIVA1_UTENTE_INSERIMENTO = 2;
  public static int PQSL_STATIVA1_DATA_INSERIMENTO = 3;
  public static int PQSL_STATIVA1_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_STATIVA1_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: STAT IVA
  //
  public static int PQRY_STATIVA = 1674;
  public static int PQSL_STATIVA_CODICE = 0;
  public static int PQSL_STATIVA_DESCRIZIONE = 1;

  // Table to contain panel selected row: T11
  //
  public static int PQRY_T13 = 1675;
  public static int PQSL_T13_CODICE = 0;
  public static int PQSL_T13_DESCRIZIONE = 1;
  public static int PQSL_T13_TIPO = 2;
  public static int PQSL_T13_RIF_TESO = 3;
  public static int PQSL_T13_DISAB_UTENZE = 4;
  public static int PQSL_T13_UTENTE_INSERIMENTO = 5;
  public static int PQSL_T13_DATA_INSERIMENTO = 6;
  public static int PQSL_T13_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_T13_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: T11
  //
  public static int PQRY_T14 = 1676;
  public static int PQSL_T14_CODICE = 0;
  public static int PQSL_T14_DESCRIZIONE = 1;
  public static int PQSL_T14_TIPO = 2;
  public static int PQSL_T14_RIF_TESO = 3;
  public static int PQSL_T14_DISAB_UTENZE = 4;

  // Table to contain panel selected row: T10
  //
  public static int PQRY_T11 = 1677;
  public static int PQSL_T11_CODICE = 0;
  public static int PQSL_T11_DESCRIZIONE = 1;
  public static int PQSL_T11_P_D_E = 2;
  public static int PQSL_T11_UTENTE_INSERIMENTO = 3;
  public static int PQSL_T11_DATA_INSERIMENTO = 4;
  public static int PQSL_T11_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_T11_DATA_ULTIMO_AGG = 6;
  public static int PQSL_T11_PREVALENTE = 7;

  // Table to contain panel selected row: T10
  //
  public static int PQRY_T10 = 1678;
  public static int PQSL_T10_CODICE = 0;
  public static int PQSL_T10_DESCRIZIONE = 1;
  public static int PQSL_T10_P_D_E = 2;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI1 = 1679;
  public static int PQSL_FATTORI1_FATTORE = 0;
  public static int PQSL_FATTORI1_DESCRIZIONE = 1;
  public static int PQSL_FATTORI1_TIPO = 2;
  public static int PQSL_FATTORI1_DATA_VALIDITA = 3;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI6 = 1680;
  public static int PQSL_FATTORI6_FATTORFATTOR = 0;
  public static int PQSL_FATTORI6_FATTORDESCRI = 1;
  public static int PQSL_FATTORI6_FATTORITIPO = 2;
  public static int PQSL_FATTORI6_FATTDATAVALI = 3;

  // Table to contain panel selected row: FATTORI ATTRIBUTI
  //
  public static int PQRY_FATTORATTRIB = 1681;
  public static int PQSL_FATTORATTRIB_FATTORE = 0;
  public static int PQSL_FATTORATTRIB_DESTINAZIONE = 1;
  public static int PQSL_FATTORATTRIB_SE_RATEI_RISC = 2;

  // Table to contain panel selected row: CENTRI
  //
  public static int PQRY_CENTRI1 = 1682;
  public static int PQSL_CENTRI1_CENTRO = 0;
  public static int PQSL_CENTRI1_DESCRIZIONE = 1;
  public static int PQSL_CENTRI1_DATA_VALIDITA = 2;

  // Table to contain panel selected row: CENTRI
  //
  public static int PQRY_CENTRI3 = 1683;
  public static int PQSL_CENTRI3_CENTRO = 0;
  public static int PQSL_CENTRI3_DESCRIZIONE = 1;
  public static int PQSL_CENTRI3_CENTDATAVALI = 2;

  // Table to contain panel selected row: IMP ECO BEN
  //
  public static int PQRY_IMPECOBEN1 = 1684;
  public static int PQSL_IMPECOBEN1_CODICE = 0;
  public static int PQSL_IMPECOBEN1_DESCRIZIONE = 1;
  public static int PQSL_IMPECOBEN1_FATTORE_FAT_FOR = 2;
  public static int PQSL_IMPECOBEN1_FATTORE_FAT_CLI = 3;
  public static int PQSL_IMPECOBEN1_FATTORE_LIQ_FOR = 4;
  public static int PQSL_IMPECOBEN1_FATTORE_PRE_CLI = 5;
  public static int PQSL_IMPECOBEN1_UTENTE_INSERIMENTO = 6;
  public static int PQSL_IMPECOBEN1_DATA_INSERIMENTO = 7;
  public static int PQSL_IMPECOBEN1_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_IMPECOBEN1_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: IMP ECO BEN
  //
  public static int PQRY_IMPECOBEN = 1685;
  public static int PQSL_IMPECOBEN_CODICE = 0;
  public static int PQSL_IMPECOBEN_DESCRIZIONE = 1;
  public static int PQSL_IMPECOBEN_FATTORE_FAT_FOR = 2;
  public static int PQSL_IMPECOBEN_FATTORE_FAT_CLI = 3;
  public static int PQSL_IMPECOBEN_FATTORE_LIQ_FOR = 4;
  public static int PQSL_IMPECOBEN_FATTORE_PRE_CLI = 5;
  public static int PQSL_IMPECOBEN_IMPECBEFADE1 = 6;
  public static int PQSL_IMPECOBEN_IMPECBEFADE2 = 7;
  public static int PQSL_IMPECOBEN_IMPECBEFADE3 = 8;
  public static int PQSL_IMPECOBEN_IMPECOBEFADE = 9;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI3 = 1686;
  public static int PQSL_FATTORI3_FATTORE = 0;
  public static int PQSL_FATTORI3_DESCRIZIONE = 1;
  public static int PQSL_FATTORI3_TIPO = 2;

  // Table to contain panel selected row: FATTORI
  //
  public static int PQRY_FATTORI4 = 1687;
  public static int PQSL_FATTORI4_FATTORE = 0;
  public static int PQSL_FATTORI4_DESCRIZIONE = 1;
  public static int PQSL_FATTORI4_TIPO = 2;

  // Table to contain panel selected row: T99
  //
  public static int PQRY_T102 = 1688;
  public static int PQSL_T102_TIPO_TOTALE_FC = 0;
  public static int PQSL_T102_COLONNA_AVANZO = 1;
  public static int PQSL_T102_GESTIONE_IMPEGNABILE = 2;
  public static int PQSL_T102_PREVENTIVO_UNITA_EURO = 3;
  public static int PQSL_T102_CAP_E_UNIVOCI = 4;
  public static int PQSL_T102_CAP_S_UNIVOCI = 5;
  public static int PQSL_T102_CONTROLLO_COMPETENZA = 6;
  public static int PQSL_T102_BLOCCO_AUMENTO_RESIDUI = 7;
  public static int PQSL_T102_CAUSALE_LIQ_AUTO = 8;
  public static int PQSL_T102_CAUSALE_PRE_AUTO = 9;
  public static int PQSL_T102_RECANPRINES1 = 10;
  public static int PQSL_T102_ANNULLO_PRENOTAZIONE_DEL = 11;
  public static int PQSL_T102_RECAZZTOLIMU = 12;
  public static int PQSL_T102_TIPO_TOT_LIQ_MULTIPLA = 13;
  public static int PQSL_T102_RECCONSEMAEX = 14;
  public static int PQSL_T102_CONTROLLO_SEQUENZA_MAN = 15;
  public static int PQSL_T102_RECCONSEOREX = 16;
  public static int PQSL_T102_CONTROLLO_SEQUENZA_ORD = 17;
  public static int PQSL_T102_DATA_RIF_RITENUTE = 18;
  public static int PQSL_T102_ORDINE_EMISSIONE_MANDATI = 19;
  public static int PQSL_T102_TIPO_EMISSIONE_MANDATI = 20;
  public static int PQSL_T102_INTESTAZIONE_ENTE_CERT = 21;
  public static int PQSL_T102_FLAG_INT_CERTIF = 22;
  public static int PQSL_T102_ORDINE_STAMPA_MANDATI = 23;
  public static int PQSL_T102_ORDINE_BEN_MANDATI = 24;
  public static int PQSL_T102_TIPO_CAST_MANDATI = 25;
  public static int PQSL_T102_DES_IMP_MAN = 26;
  public static int PQSL_T102_DATA_RIF_PRO_CASSA = 27;
  public static int PQSL_T102_PROTOCOLLO_AUTO = 28;
  public static int PQSL_T102_CORR_MOD = 29;
  public static int PQSL_T102_CONTROLLO_PC = 30;
  public static int PQSL_T102_CONTROLLO_COD_UTENZA = 31;
  public static int PQSL_T102_ABILITA_IMP_DOC = 32;
  public static int PQSL_T102_FLAG_BUONI = 33;
  public static int PQSL_T102_ORD_ELENCO_DOC = 34;
  public static int PQSL_T102_RECORDELESCE = 35;
  public static int PQSL_T102_INTERESSI_LT = 36;
  public static int PQSL_T102_DATA_ESIG_IVA = 37;
  public static int PQSL_T102_FLAG_IVA_NON_SOG = 38;
  public static int PQSL_T102_DESCRIZIONE_DOC_REG_IVA = 39;
  public static int PQSL_T102_CONTROLLO_IVA_LIQ = 40;
  public static int PQSL_T102_RECOTIPOCONT = 41;
  public static int PQSL_T102_GESTIONE_ECONOMICA = 42;
  public static int PQSL_T102_MODALITA_IMPUTAZIONE = 43;
  public static int PQSL_T102_RECTIPIMPSPE = 44;
  public static int PQSL_T102_MODALITA_IMPUTAZIONE_E = 45;
  public static int PQSL_T102_RECTIPIMPENT = 46;
  public static int PQSL_T102_SALDI_CON_DECIMALI = 47;
  public static int PQSL_T102_PROC_PERS = 48;
  public static int PQSL_T102_RECOTIPO1EXP = 49;
  public static int PQSL_T102_CODICE_PERS = 50;
  public static int PQSL_T102_CARICA_IMP_NEG_PERS = 51;
  public static int PQSL_T102_SE_IMP_NEG_LIQ_PERS = 52;
  public static int PQSL_T102_TRACCIATO_PERS = 53;
  public static int PQSL_T102_GP4_IMP_DISP = 54;
  public static int PQSL_T102_GESTIONE_CESPITI = 55;
  public static int PQSL_T102_RECOTIPO2EXP = 56;
  public static int PQSL_T102_PASSAGGIO_CI4 = 57;
  public static int PQSL_T102_ACQUISIZIONE_CESPITE = 58;
  public static int PQSL_T102_CASSA_ECONOMALE = 59;
  public static int PQSL_T102_RECOCASSECON = 60;
  public static int PQSL_T102_CLASSE_ORD = 61;
  public static int PQSL_T102_RECORDECONOM = 62;
  public static int PQSL_T102_PROC_DEL = 63;
  public static int PQSL_T102_PROCEDURA_BUONI = 64;
  public static int PQSL_T102_GESTIONE_FATTURAZIONE = 65;
  public static int PQSL_T102_RETTE = 66;
  public static int PQSL_T102_TIPO_CAR_SOGG = 67;
  public static int PQSL_T102_IVA_DEF_GC4 = 68;
  public static int PQSL_T102_DIFFERENZA_MAG = 69;
  public static int PQSL_T102_ESERCIZIO = 70;
  public static int PQSL_T102_BLOCCO_FATTURA_DOPPIA = 71;
  public static int PQSL_T102_GESTIONE_BARCODE = 72;
  public static int PQSL_T102_TIPO_IMP_DA_ESIG = 73;
  public static int PQSL_T102_DATA_INIZIO_GEST_CRONO_UO = 74;
  public static int PQSL_T102_DATA_FINE_GEST_CRONO_UO = 75;
  public static int PQSL_T102_CONTROLLO_CASSA_VPRO_LIQ = 76;
  public static int PQSL_T102_CONTROLLO_CASSA_VPRO_IN_EMISS = 77;
  public static int PQSL_T102_CONTROLLO_IMP_PROV = 78;
  public static int PQSL_T102_TIPO_GEN_ACC_DA_FS = 79;
  public static int PQSL_T102_RAGGRUPPAMENTO_VERS_IVA = 80;
  public static int PQSL_T102_PERIODICITA_VERS_IVA = 81;
  public static int PQSL_T102_GESTIONE_FINANZIAMENTI = 82;
  public static int PQSL_T102_CONTROLLO_RIL_IVA = 83;
  public static int PQSL_T102_FATTORI_ARCONET = 84;
  public static int PQSL_T102_CONTROLLO_REGISTRI_LIQ_FAT = 85;
  public static int PQSL_T102_NUM_MAX_LIQ = 86;
  public static int PQSL_T102_NUM_MAX_PRE = 87;
  public static int PQSL_T102_MACROAGGREGATO_CI4 = 88;
  public static int PQSL_T102_TIPO_AVANZO_OBBLIG = 89;
  public static int PQSL_T102_GPS_GESTIONE_TIPI_COSTO = 90;
  public static int PQSL_T102_BLOCCO_CASSA_COMP_TITOLO_5 = 91;
  public static int PQSL_T102_BLOCCO_CASSA_COMP_TITOLO_7 = 92;
  public static int PQSL_T102_EMISS_PARZ_PROVV_S = 93;
  public static int PQSL_T102_FLAG_RITORNO_CC_PROVV = 94;
  public static int PQSL_T102_COLLEGAMENTO_DUP = 95;
  public static int PQSL_T102_MOVI_LIQ_CI4_SU_IMMOB = 96;
  public static int PQSL_T102_BLOCCO_DISP_PURA_STANZ_OBIET = 97;

  // Table to contain panel selected row: T99
  //
  public static int PQRY_T103 = 1689;
  public static int PQSL_T103_TIPO_TOTALE_FC = 0;
  public static int PQSL_T103_COLONNA_AVANZO = 1;
  public static int PQSL_T103_GESTIONE_IMPEGNABILE = 2;
  public static int PQSL_T103_PREVENTIVO_UNITA_EURO = 3;
  public static int PQSL_T103_CAP_E_UNIVOCI = 4;
  public static int PQSL_T103_CAP_S_UNIVOCI = 5;
  public static int PQSL_T103_CONTROLLO_COMPETENZA = 6;
  public static int PQSL_T103_BLOCCO_AUMENTO_RESIDUI = 7;
  public static int PQSL_T103_CAUSALE_LIQ_AUTO = 8;
  public static int PQSL_T103_CAUSALE_PRE_AUTO = 9;
  public static int PQSL_T103_REANPRINESEX = 10;
  public static int PQSL_T103_ANNULLO_PRENOTAZIONE_DEL = 11;
  public static int PQSL_T103_RECAZTOLIMU1 = 12;
  public static int PQSL_T103_TIPO_TOT_LIQ_MULTIPLA = 13;
  public static int PQSL_T103_RECCONSEMAEX = 14;
  public static int PQSL_T103_CONTROLLO_SEQUENZA_MAN = 15;
  public static int PQSL_T103_RECCONSEOREX = 16;
  public static int PQSL_T103_CONTROLLO_SEQUENZA_ORD = 17;
  public static int PQSL_T103_DATA_RIF_RITENUTE = 18;
  public static int PQSL_T103_ORDINE_EMISSIONE_MANDATI = 19;
  public static int PQSL_T103_TIPO_EMISSIONE_MANDATI = 20;
  public static int PQSL_T103_INTESTAZIONE_ENTE_CERT = 21;
  public static int PQSL_T103_FLAG_INT_CERTIF = 22;
  public static int PQSL_T103_ORDINE_STAMPA_MANDATI = 23;
  public static int PQSL_T103_TIPO_CAST_MANDATI = 24;
  public static int PQSL_T103_DES_IMP_MAN = 25;
  public static int PQSL_T103_DATA_RIF_PRO_CASSA = 26;
  public static int PQSL_T103_PROTOCOLLO_AUTO = 27;
  public static int PQSL_T103_BLOCCO_FATTURA_DOPPIA = 28;
  public static int PQSL_T103_CORR_MOD = 29;
  public static int PQSL_T103_CONTROLLO_PC = 30;
  public static int PQSL_T103_CONTROLLO_COD_UTENZA = 31;
  public static int PQSL_T103_ABILITA_IMP_DOC = 32;
  public static int PQSL_T103_FLAG_BUONI = 33;
  public static int PQSL_T103_ORD_ELENCO_DOC = 34;
  public static int PQSL_T103_RECORELSCDO1 = 35;
  public static int PQSL_T103_INS_AUTOMATICO_GD = 36;
  public static int PQSL_T103_INTERESSI_LT = 37;
  public static int PQSL_T103_DATA_ESIG_IVA = 38;
  public static int PQSL_T103_FLAG_IVA_NON_SOG = 39;
  public static int PQSL_T103_DESCRIZIONE_DOC_REG_IVA = 40;
  public static int PQSL_T103_CONTROLLO_IVA_LIQ = 41;
  public static int PQSL_T103_RECOTIPOEXPR = 42;
  public static int PQSL_T103_GESTIONE_ECONOMICA = 43;
  public static int PQSL_T103_MODALITA_IMPUTAZIONE = 44;
  public static int PQSL_T103_RECIMPSPEEXP = 45;
  public static int PQSL_T103_MODALITA_IMPUTAZIONE_E = 46;
  public static int PQSL_T103_RECIMPENTEXP = 47;
  public static int PQSL_T103_SALDI_CON_DECIMALI = 48;
  public static int PQSL_T103_PROC_PERS = 49;
  public static int PQSL_T103_RECOTIPO1EXP = 50;
  public static int PQSL_T103_CODICE_PERS = 51;
  public static int PQSL_T103_CARICA_IMP_NEG_PERS = 52;
  public static int PQSL_T103_SE_IMP_NEG_LIQ_PERS = 53;
  public static int PQSL_T103_TRACCIATO_PERS = 54;
  public static int PQSL_T103_GP4_IMP_DISP = 55;
  public static int PQSL_T103_GESTIONE_CESPITI = 56;
  public static int PQSL_T103_PASSAGGIO_CI4 = 57;
  public static int PQSL_T103_ACQUISIZIONE_CESPITE = 58;
  public static int PQSL_T103_CASSA_ECONOMALE = 59;
  public static int PQSL_T103_RECCASECOEXP = 60;
  public static int PQSL_T103_CLASSE_ORD = 61;
  public static int PQSL_T103_RECOORDIEXPR = 62;
  public static int PQSL_T103_PROC_DEL = 63;
  public static int PQSL_T103_PROCEDURA_BUONI = 64;
  public static int PQSL_T103_GESTIONE_FATTURAZIONE = 65;
  public static int PQSL_T103_RETTE = 66;
  public static int PQSL_T103_DIFFERENZA_MAG = 67;
  public static int PQSL_T103_RECT99COIMPR = 68;

  // Table to contain panel selected row: PARAMETRI WEB
  //
  public static int PQRY_PARAMETRIWEB = 1690;
  public static int PQSL_PARAMETRIWEB_PROGRESSIVO = 0;
  public static int PQSL_PARAMETRIWEB_OTTICA = 1;
  public static int PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP = 2;
  public static int PQSL_PARAMETRIWEB_DATA_STRUTTURA_ORGANIZZATIVA = 3;
  public static int PQSL_PARAMETRIWEB_UTENTE_INSERIMENTO = 4;
  public static int PQSL_PARAMETRIWEB_DATA_INSERIMENTO = 5;
  public static int PQSL_PARAMETRIWEB_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_PARAMETRIWEB_DATA_ULTIMO_AGG = 7;
  public static int PQSL_PARAMETRIWEB_COMPETENZA_FINANZIAMENTI = 8;
  public static int PQSL_PARAMETRIWEB_ATTI_LIQ = 9;
  public static int PQSL_PARAMETRIWEB_RUOLO_RESP_UO = 10;
  public static int PQSL_PARAMETRIWEB_TIPO_ASSEGNAZIONE_SO4 = 11;
  public static int PQSL_PARAMETRIWEB_SUDDIVISIONE_UFFICIO = 12;
  public static int PQSL_PARAMETRIWEB_SUDDIVISIONE_UNITA_SUP_2 = 13;
  public static int PQSL_PARAMETRIWEB_PLUGIN_SFERA = 14;
  public static int PQSL_PARAMETRIWEB_PLUGIN_DISTLIQ = 15;
  public static int PQSL_PARAMETRIWEB_PLUGIN_DISTORD = 16;
  public static int PQSL_PARAMETRIWEB_PLUGIN_DISTECON = 17;
  public static int PQSL_PARAMETRIWEB_ANAGRAFE_CONDIVISA = 18;
  public static int PQSL_PARAMETRIWEB_ATTI_LIGHT = 19;

  // Table to contain panel selected row: PARAMETRI ART18
  //
  public static int PQRY_PARAMETART18 = 1691;
  public static int PQSL_PARAMETART18_PROGRESSIVO = 0;
  public static int PQSL_PARAMETART18_IMPORTO = 1;
  public static int PQSL_PARAMETART18_GESTIONE_IMP = 2;
  public static int PQSL_PARAMETART18_GESTIONE_LIQ = 3;
  public static int PQSL_PARAMETART18_GESTIONE_ORD = 4;
  public static int PQSL_PARAMETART18_GESTIONE_DISTINTE = 5;
  public static int PQSL_PARAMETART18_SOLO_IMP_ESECUTIVI = 6;
  public static int PQSL_PARAMETART18_BLOCCO_ELIMINAZIONE = 7;
  public static int PQSL_PARAMETART18_UTENTE_INSERIMENTO = 8;
  public static int PQSL_PARAMETART18_DATA_INSERIMENTO = 9;
  public static int PQSL_PARAMETART18_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_PARAMETART18_DATA_ULTIMO_AGG = 11;

  // Table to contain panel selected row: GPS PCF TIPI COSTO
  //
  public static int PQRY_GPSPCFTIPCOS = 1692;
  public static int PQSL_GPSPCFTIPCOS_E_S = 0;
  public static int PQSL_GPSPCFTIPCOS_LIVELLO_MACRO = 1;
  public static int PQSL_GPSPCFTIPCOS_CODICE_MACRO = 2;
  public static int PQSL_GPSPCFTIPCOS_TIPI_COSTO = 3;
  public static int PQSL_GPSPCFTIPCOS_ORDINE = 4;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T90 = 1693;
  public static int PQSL_T90_DENOMINAZIONE = 0;
  public static int PQSL_T90_INDIRIZZO = 1;
  public static int PQSL_T90_COMUNE = 2;
  public static int PQSL_T90_PROVINCIA = 3;
  public static int PQSL_T90_DES_PROVINCIA = 4;
  public static int PQSL_T90_CAP = 5;
  public static int PQSL_T90_COD_FISCALE = 6;
  public static int PQSL_T90_PARTITA_IVA = 7;
  public static int PQSL_T90_COD_ENTE_MI = 8;
  public static int PQSL_T90_UNIONE = 9;
  public static int PQSL_T90_TIPO_SUPPORTO_CERT = 10;
  public static int PQSL_T90_ATTIVITA = 11;
  public static int PQSL_T90_TIPO_ESATTORIA = 12;
  public static int PQSL_T90_TIPO_MO = 13;
  public static int PQSL_T90_SE_INC_PAGAM = 14;
  public static int PQSL_T90_SEDE_INPS = 15;
  public static int PQSL_T90_ESATTORIA = 16;
  public static int PQSL_T90_UTENTE_INSERIMENTO = 17;
  public static int PQSL_T90_DATA_INSERIMENTO = 18;
  public static int PQSL_T90_UTENTE_ULTIMO_AGG = 19;
  public static int PQSL_T90_DATA_ULTIMO_AGG = 20;
  public static int PQSL_T90_PROGRESSIVO = 21;
  public static int PQSL_T90_CODICE_EORI = 22;
  public static int PQSL_T90_MAIL_AZIENDALE = 23;
  public static int PQSL_T90_FAX_AZIENDALE = 24;
  public static int PQSL_T90_TELEFONO_AZIENDALE = 25;
  public static int PQSL_T90_CODICE_BDAP = 26;
  public static int PQSL_T90_CODICE_IPA = 27;
  public static int PQSL_T90_CODICE_UNIONE = 28;
  public static int PQSL_T90_DATA_INGRESSO_UNIONE = 29;
  public static int PQSL_T90_DATA_USCITA_UNIONE = 30;
  public static int PQSL_T90_SOGGETTO_ENTE = 31;

  // Table to contain panel selected row: XML DATI
  //
  public static int PQRY_XMLDATI2 = 1694;
  public static int PQSL_XMLDATI2_DELIBERA_CC = 0;
  public static int PQSL_XMLDATI2_DATA_DEL_CC = 1;
  public static int PQSL_XMLDATI2_ABITANTI = 2;
  public static int PQSL_XMLDATI2_SUPERFICIE = 3;
  public static int PQSL_XMLDATI2_CODICE_ISTAT = 4;
  public static int PQSL_XMLDATI2_CODICE_ENTE = 5;
  public static int PQSL_XMLDATI2_ESERCIZIO = 6;
  public static int PQSL_XMLDATI2_UTENTE_INSERIMENTO = 7;
  public static int PQSL_XMLDATI2_DATA_INSERIMENTO = 8;
  public static int PQSL_XMLDATI2_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_XMLDATI2_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T91 = 1695;
  public static int PQSL_T91_DENOMINAZIONE = 0;
  public static int PQSL_T91_INDIRIZZO = 1;
  public static int PQSL_T91_COMUNE = 2;
  public static int PQSL_T91_PROVINCIA = 3;
  public static int PQSL_T91_DES_PROVINCIA = 4;
  public static int PQSL_T91_CAP = 5;
  public static int PQSL_T91_COD_FISCALE = 6;
  public static int PQSL_T91_PARTITA_IVA = 7;
  public static int PQSL_T91_RECTCOENMIMI = 8;
  public static int PQSL_T91_UNIONE = 9;
  public static int PQSL_T91_TIPO_SUPPORTO_CERT = 10;
  public static int PQSL_T91_ATTIVITA = 11;
  public static int PQSL_T91_TIPO_ESATTORIA = 12;
  public static int PQSL_T91_TIPO_MO = 13;
  public static int PQSL_T91_SE_INC_PAGAM = 14;
  public static int PQSL_T91_SEDE_INPS = 15;
  public static int PQSL_T91_ESATTORIA = 16;
  public static int PQSL_T91_RECT64TELAZI = 17;
  public static int PQSL_T91_RECT64FAXAZI = 18;
  public static int PQSL_T91_RECT64MAIAZI = 19;
  public static int PQSL_T91_RECT64CODEOR = 20;

  // Table to contain panel selected row: XML DATI
  //
  public static int PQRY_XMLDATI3 = 1696;
  public static int PQSL_XMLDATI3_DELIBERA_CC = 0;
  public static int PQSL_XMLDATI3_DATA_DEL_CC = 1;
  public static int PQSL_XMLDATI3_ABITANTI = 2;
  public static int PQSL_XMLDATI3_SUPERFICIE = 3;
  public static int PQSL_XMLDATI3_CODICE_ISTAT = 4;
  public static int PQSL_XMLDATI3_CODICE_ENTE = 5;
  public static int PQSL_XMLDATI3_ESERCIZIO = 6;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T65 = 1697;
  public static int PQSL_T65_DENOMINAZIONE = 0;
  public static int PQSL_T65_INDIRIZZO = 1;
  public static int PQSL_T65_COMUNE = 2;
  public static int PQSL_T65_PROVINCIA = 3;
  public static int PQSL_T65_DES_PROVINCIA = 4;
  public static int PQSL_T65_CAP = 5;
  public static int PQSL_T65_COD_FISCALE = 6;
  public static int PQSL_T65_PARTITA_IVA = 7;
  public static int PQSL_T65_RECTCOENMIMI = 8;
  public static int PQSL_T65_UNIONE = 9;
  public static int PQSL_T65_TIPO_SUPPORTO_CERT = 10;
  public static int PQSL_T65_ATTIVITA = 11;
  public static int PQSL_T65_TIPO_ESATTORIA = 12;
  public static int PQSL_T65_TIPO_MO = 13;
  public static int PQSL_T65_SE_INC_PAGAM = 14;
  public static int PQSL_T65_SEDE_INPS = 15;
  public static int PQSL_T65_ESATTORIA = 16;
  public static int PQSL_T65_UTENTE_INSERIMENTO = 17;
  public static int PQSL_T65_DATA_INSERIMENTO = 18;
  public static int PQSL_T65_UTENTE_ULTIMO_AGG = 19;
  public static int PQSL_T65_DATA_ULTIMO_AGG = 20;
  public static int PQSL_T65_CODICE_EORI = 21;
  public static int PQSL_T65_MAIL_AZIENDALE = 22;
  public static int PQSL_T65_FAX_AZIENDALE = 23;
  public static int PQSL_T65_TELEFONO_AZIENDALE = 24;
  public static int PQSL_T65_RECT64CODBDA = 25;
  public static int PQSL_T65_RECT64CODIPA = 26;
  public static int PQSL_T65_RECT64CODUNI = 27;
  public static int PQSL_T65_RECT64DAINUN = 28;
  public static int PQSL_T65_RECT64DAUSUN = 29;

  // Table to contain panel selected row: XML DATI
  //
  public static int PQRY_XMLDATI1 = 1698;
  public static int PQSL_XMLDATI1_DELIBERA_CC = 0;
  public static int PQSL_XMLDATI1_DATA_DEL_CC = 1;
  public static int PQSL_XMLDATI1_ABITANTI = 2;
  public static int PQSL_XMLDATI1_SUPERFICIE = 3;
  public static int PQSL_XMLDATI1_CODICE_ISTAT = 4;
  public static int PQSL_XMLDATI1_CODICE_ENTE = 5;
  public static int PQSL_XMLDATI1_ESERCIZIO = 6;
  public static int PQSL_XMLDATI1_UTENTE_INSERIMENTO = 7;
  public static int PQSL_XMLDATI1_DATA_INSERIMENTO = 8;
  public static int PQSL_XMLDATI1_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_XMLDATI1_DATA_ULTIMO_AGG = 10;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T92 = 1699;
  public static int PQSL_T92_DENOMINAZIONE = 0;
  public static int PQSL_T92_INDIRIZZO = 1;
  public static int PQSL_T92_COMUNE = 2;
  public static int PQSL_T92_PROVINCIA = 3;
  public static int PQSL_T92_DES_PROVINCIA = 4;
  public static int PQSL_T92_CAP = 5;
  public static int PQSL_T92_COD_FISCALE = 6;
  public static int PQSL_T92_PARTITA_IVA = 7;
  public static int PQSL_T92_COD_ENTE = 8;
  public static int PQSL_T92_UNIONE = 9;
  public static int PQSL_T92_TIPO_SUPPORTO_CERT = 10;
  public static int PQSL_T92_ATTIVITA = 11;
  public static int PQSL_T92_TIPO_ESATTORIA = 12;
  public static int PQSL_T92_TIPO_MO = 13;
  public static int PQSL_T92_SE_INC_PAGAM = 14;
  public static int PQSL_T92_SEDE_INPS = 15;
  public static int PQSL_T92_ESATTORIA = 16;
  public static int PQSL_T92_RECT64TELAZI = 17;
  public static int PQSL_T92_RECT64FAXAZI = 18;
  public static int PQSL_T92_RECT64MAIAZI = 19;
  public static int PQSL_T92_RECT64CODEOR = 20;

  // Table to contain panel selected row: XML DATI
  //
  public static int PQRY_XMLDATI = 1700;
  public static int PQSL_XMLDATI_DELIBERA_CC = 0;
  public static int PQSL_XMLDATI_DATA_DEL_CC = 1;
  public static int PQSL_XMLDATI_ABITANTI = 2;
  public static int PQSL_XMLDATI_SUPERFICIE = 3;
  public static int PQSL_XMLDATI_CODICE_ISTAT = 4;
  public static int PQSL_XMLDATI_CODICE_ENTE = 5;
  public static int PQSL_XMLDATI_ESERCIZIO = 6;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T93 = 1701;
  public static int PQSL_T93_TESORIERE = 0;
  public static int PQSL_T93_CODICE_FILIALE = 1;
  public static int PQSL_T93_COD_ENTE = 2;
  public static int PQSL_T93_COD_TESORERIA = 3;
  public static int PQSL_T93_PRIMO_PROG_TESO = 4;
  public static int PQSL_T93_TIPO_MO = 5;
  public static int PQSL_T93_SE_INC_PAGAM = 6;
  public static int PQSL_T93_TIPO_PROVV = 7;
  public static int PQSL_T93_TIPO_INCASSI_FS4 = 8;
  public static int PQSL_T93_UTENTE_INSERIMENTO = 9;
  public static int PQSL_T93_DATA_INSERIMENTO = 10;
  public static int PQSL_T93_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_T93_DATA_ULTIMO_AGG = 12;
  public static int PQSL_T93_PROGRESSIVO = 13;
  public static int PQSL_T93_SCARTA_PROVV_DOPPI = 14;

  // Table to contain panel selected row: PARAMETRI MINF
  //
  public static int PQRY_PARAMETRMIN4 = 1702;
  public static int PQSL_PARAMETRMIN4_DATA_INIZIO_MAND_INF = 0;
  public static int PQSL_PARAMETRMIN4_DATA_INIZIO_ORD_INF = 1;
  public static int PQSL_PARAMETRMIN4_CODICE_TESORERIA = 2;
  public static int PQSL_PARAMETRMIN4_CODICE_FILIALE = 3;
  public static int PQSL_PARAMETRMIN4_CODICE_ENTE = 4;
  public static int PQSL_PARAMETRMIN4_TIPO_MINF = 5;
  public static int PQSL_PARAMETRMIN4_PRIMO_PROG_TESO = 6;
  public static int PQSL_PARAMETRMIN4_TIPO_INC_PAG = 7;
  public static int PQSL_PARAMETRMIN4_PARA_MINF_PK = 8;
  public static int PQSL_PARAMETRMIN4_TIPO_SUB_MAN = 9;
  public static int PQSL_PARAMETRMIN4_MOD_PAGAM_DIVERSE = 10;
  public static int PQSL_PARAMETRMIN4_TIPO_SUB_ORD = 11;
  public static int PQSL_PARAMETRMIN4_GENERA_XML = 12;
  public static int PQSL_PARAMETRMIN4_GESTIONE_SPESE = 13;
  public static int PQSL_PARAMETRMIN4_GESIONE_COMMISSIONI = 14;
  public static int PQSL_PARAMETRMIN4_GESTIONE_ALLEGATI = 15;
  public static int PQSL_PARAMETRMIN4_GESTIONE_INFO_TESORIERE = 16;
  public static int PQSL_PARAMETRMIN4_GESTIONE_ORD_ASSOCIATI = 17;
  public static int PQSL_PARAMETRMIN4_GESTIONE_ANNULLI = 18;
  public static int PQSL_PARAMETRMIN4_GESTIONE_VARIAZIONI = 19;
  public static int PQSL_PARAMETRMIN4_GESTIONE_SOSTITUZIONI = 20;
  public static int PQSL_PARAMETRMIN4_UTENTE_INSERIMENTO = 21;
  public static int PQSL_PARAMETRMIN4_DATA_INSERIMENTO = 22;
  public static int PQSL_PARAMETRMIN4_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_PARAMETRMIN4_DATA_ULTIMO_AGG = 24;
  public static int PQSL_PARAMETRMIN4_SPESE_DA_SOGGETTO = 25;
  public static int PQSL_PARAMETRMIN4_MANDATI_COPERTURA = 26;
  public static int PQSL_PARAMETRMIN4_CODICE_ISTAT = 27;
  public static int PQSL_PARAMETRMIN4_CODICE_TRAMITE_ENTE = 28;
  public static int PQSL_PARAMETRMIN4_CODICE_TRAMITE_BT = 29;

  // Table to contain panel selected row: PARAMETRI MANORD INF XML
  //
  public static int PQRY_PARMANINFXM4 = 1703;
  public static int PQSL_PARMANINFXM4_PARAMETRO = 0;
  public static int PQSL_PARMANINFXM4_TITOLO = 1;
  public static int PQSL_PARMANINFXM4_DESCRIZIONE = 2;
  public static int PQSL_PARMANINFXM4_TIPO_PARAMETRO = 3;
  public static int PQSL_PARMANINFXM4_RECORDAPRI = 4;
  public static int PQSL_PARMANINFXM4_UTENTE_INSERIMENTO = 5;
  public static int PQSL_PARMANINFXM4_DATA_INSERIMENTO = 6;
  public static int PQSL_PARMANINFXM4_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_PARMANINFXM4_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: T
  //
  public static int PQRY_T21 = 1704;
  public static int PQSL_T21_TESORIERE = 0;
  public static int PQSL_T21_CODICE_FILIALE = 1;
  public static int PQSL_T21_COD_ENTE = 2;
  public static int PQSL_T21_COD_TESORERIA = 3;
  public static int PQSL_T21_PRIMO_PROG_TESO = 4;
  public static int PQSL_T21_TIPO_MO = 5;
  public static int PQSL_T21_SE_INC_PAGAM = 6;
  public static int PQSL_T21_TIPO_PROVV = 7;
  public static int PQSL_T21_TIPO_INCASSI_FS4 = 8;
  public static int PQSL_T21_UTENTE_INSERIMENTO = 9;
  public static int PQSL_T21_DATA_INSERIMENTO = 10;
  public static int PQSL_T21_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_T21_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: PARAMETRI MINF
  //
  public static int PQRY_PARAMETRMIN5 = 1705;
  public static int PQSL_PARAMETRMIN5_DATA_INIZIO_MAND_INF = 0;
  public static int PQSL_PARAMETRMIN5_DATA_INIZIO_ORD_INF = 1;
  public static int PQSL_PARAMETRMIN5_CODICE_TESORERIA = 2;
  public static int PQSL_PARAMETRMIN5_CODICE_FILIALE = 3;
  public static int PQSL_PARAMETRMIN5_CODICE_ENTE = 4;
  public static int PQSL_PARAMETRMIN5_TIPO_MINF = 5;
  public static int PQSL_PARAMETRMIN5_PRIMO_PROG_TESO = 6;
  public static int PQSL_PARAMETRMIN5_TIPO_INC_PAG = 7;
  public static int PQSL_PARAMETRMIN5_PARA_MINF_PK = 8;
  public static int PQSL_PARAMETRMIN5_TIPO_SUB_MAN = 9;
  public static int PQSL_PARAMETRMIN5_MOD_PAGAM_DIVERSE = 10;
  public static int PQSL_PARAMETRMIN5_TIPO_SUB_ORD = 11;
  public static int PQSL_PARAMETRMIN5_GENERA_XML = 12;
  public static int PQSL_PARAMETRMIN5_GESTIONE_SPESE = 13;
  public static int PQSL_PARAMETRMIN5_GESIONE_COMMISSIONI = 14;
  public static int PQSL_PARAMETRMIN5_GESTIONE_ALLEGATI = 15;
  public static int PQSL_PARAMETRMIN5_GESTIONE_INFO_TESORIERE = 16;
  public static int PQSL_PARAMETRMIN5_GESTIONE_ORD_ASSOCIATI = 17;
  public static int PQSL_PARAMETRMIN5_GESTIONE_ANNULLI = 18;
  public static int PQSL_PARAMETRMIN5_GESTIONE_VARIAZIONI = 19;
  public static int PQSL_PARAMETRMIN5_GESTIONE_SOSTITUZIONI = 20;
  public static int PQSL_PARAMETRMIN5_UTENTE_INSERIMENTO = 21;
  public static int PQSL_PARAMETRMIN5_DATA_INSERIMENTO = 22;
  public static int PQSL_PARAMETRMIN5_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_PARAMETRMIN5_DATA_ULTIMO_AGG = 24;
  public static int PQSL_PARAMETRMIN5_SPESE_DA_SOGGETTO = 25;

  // Table to contain panel selected row: PARAMETRI MANORD INF XML
  //
  public static int PQRY_PARMANINFXM5 = 1706;
  public static int PQSL_PARMANINFXM5_PARAMETRO = 0;
  public static int PQSL_PARMANINFXM5_TITOLO = 1;
  public static int PQSL_PARMANINFXM5_DESCRIZIONE = 2;
  public static int PQSL_PARMANINFXM5_TIPO_PARAMETRO = 3;
  public static int PQSL_PARMANINFXM5_RECORDAPRI = 4;
  public static int PQSL_PARMANINFXM5_UTENTE_INSERIMENTO = 5;
  public static int PQSL_PARMANINFXM5_DATA_INSERIMENTO = 6;
  public static int PQSL_PARMANINFXM5_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_PARMANINFXM5_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: T64
  //
  public static int PQRY_T94 = 1707;
  public static int PQSL_T94_TESORIERE = 0;
  public static int PQSL_T94_CODICE_FILIALE = 1;
  public static int PQSL_T94_COD_ENTE = 2;
  public static int PQSL_T94_COD_TESORERIA = 3;
  public static int PQSL_T94_PRIMO_PROG_TESO = 4;
  public static int PQSL_T94_TIPO_MO = 5;
  public static int PQSL_T94_SE_INC_PAGAM = 6;
  public static int PQSL_T94_TIPO_PROVV = 7;
  public static int PQSL_T94_TIPO_INCASSI_FS4 = 8;
  public static int PQSL_T94_UTENTE_INSERIMENTO = 9;
  public static int PQSL_T94_DATA_INSERIMENTO = 10;
  public static int PQSL_T94_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_T94_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: PARAMETRI MINF
  //
  public static int PQRY_PARAMETRMIN2 = 1708;
  public static int PQSL_PARAMETRMIN2_DATA_INIZIO_MAND_INF = 0;
  public static int PQSL_PARAMETRMIN2_DATA_INIZIO_ORD_INF = 1;
  public static int PQSL_PARAMETRMIN2_CODICE_TESORERIA = 2;
  public static int PQSL_PARAMETRMIN2_CODICE_FILIALE = 3;
  public static int PQSL_PARAMETRMIN2_CODICE_ENTE = 4;
  public static int PQSL_PARAMETRMIN2_TIPO_MINF = 5;
  public static int PQSL_PARAMETRMIN2_PRIMO_PROG_TESO = 6;
  public static int PQSL_PARAMETRMIN2_TIPO_INC_PAG = 7;
  public static int PQSL_PARAMETRMIN2_PARA_MINF_PK = 8;
  public static int PQSL_PARAMETRMIN2_TIPO_SUB_MAN = 9;
  public static int PQSL_PARAMETRMIN2_MOD_PAGAM_DIVERSE = 10;
  public static int PQSL_PARAMETRMIN2_TIPO_SUB_ORD = 11;
  public static int PQSL_PARAMETRMIN2_GENERA_XML = 12;
  public static int PQSL_PARAMETRMIN2_GESTIONE_SPESE = 13;
  public static int PQSL_PARAMETRMIN2_GESIONE_COMMISSIONI = 14;
  public static int PQSL_PARAMETRMIN2_GESTIONE_ALLEGATI = 15;
  public static int PQSL_PARAMETRMIN2_GESTIONE_INFO_TESORIERE = 16;
  public static int PQSL_PARAMETRMIN2_GESTIONE_ORD_ASSOCIATI = 17;
  public static int PQSL_PARAMETRMIN2_GESTIONE_ANNULLI = 18;
  public static int PQSL_PARAMETRMIN2_GESTIONE_VARIAZIONI = 19;
  public static int PQSL_PARAMETRMIN2_GESTIONE_SOSTITUZIONI = 20;
  public static int PQSL_PARAMETRMIN2_UTENTE_INSERIMENTO = 21;
  public static int PQSL_PARAMETRMIN2_DATA_INSERIMENTO = 22;
  public static int PQSL_PARAMETRMIN2_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_PARAMETRMIN2_DATA_ULTIMO_AGG = 24;
  public static int PQSL_PARAMETRMIN2_SPESE_DA_SOGGETTO = 25;
  public static int PQSL_PARAMETRMIN2_MANDATI_COPERTURA = 26;
  public static int PQSL_PARAMETRMIN2_RECOCODIISTA = 27;
  public static int PQSL_PARAMETRMIN2_RECCODTRAENT = 28;
  public static int PQSL_PARAMETRMIN2_RECOCODTRABT = 29;

  // Table to contain panel selected row: PARAMETRI MANORD INF XML
  //
  public static int PQRY_PARMANINFXM2 = 1709;
  public static int PQSL_PARMANINFXM2_PARAMETRO = 0;
  public static int PQSL_PARMANINFXM2_TITOLO = 1;
  public static int PQSL_PARMANINFXM2_DESCRIZIONE = 2;
  public static int PQSL_PARMANINFXM2_TIPO_PARAMETRO = 3;
  public static int PQSL_PARMANINFXM2_RECORDAPRI = 4;
  public static int PQSL_PARMANINFXM2_UTENTE_INSERIMENTO = 5;
  public static int PQSL_PARMANINFXM2_DATA_INSERIMENTO = 6;
  public static int PQSL_PARMANINFXM2_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_PARMANINFXM2_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: T
  //
  public static int PQRY_T = 1710;
  public static int PQSL_T_TESORIERE = 0;
  public static int PQSL_T_CODICE_FILIALE = 1;
  public static int PQSL_T_COD_ENTE = 2;
  public static int PQSL_T_COD_TESORERIA = 3;
  public static int PQSL_T_PRIMO_PROG_TESO = 4;
  public static int PQSL_T_TIPO_MO = 5;
  public static int PQSL_T_SE_INC_PAGAM = 6;
  public static int PQSL_T_TIPO_PROVV = 7;
  public static int PQSL_T_TIPO_INCASSI_FS4 = 8;
  public static int PQSL_T_UTENTE_INSERIMENTO = 9;
  public static int PQSL_T_DATA_INSERIMENTO = 10;
  public static int PQSL_T_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_T_DATA_ULTIMO_AGG = 12;

  // Table to contain panel selected row: PARAMETRI MINF
  //
  public static int PQRY_PARAMETRMIN3 = 1711;
  public static int PQSL_PARAMETRMIN3_DATA_INIZIO_MAND_INF = 0;
  public static int PQSL_PARAMETRMIN3_DATA_INIZIO_ORD_INF = 1;
  public static int PQSL_PARAMETRMIN3_CODICE_TESORERIA = 2;
  public static int PQSL_PARAMETRMIN3_CODICE_FILIALE = 3;
  public static int PQSL_PARAMETRMIN3_CODICE_ENTE = 4;
  public static int PQSL_PARAMETRMIN3_TIPO_MINF = 5;
  public static int PQSL_PARAMETRMIN3_PRIMO_PROG_TESO = 6;
  public static int PQSL_PARAMETRMIN3_TIPO_INC_PAG = 7;
  public static int PQSL_PARAMETRMIN3_PARA_MINF_PK = 8;
  public static int PQSL_PARAMETRMIN3_TIPO_SUB_MAN = 9;
  public static int PQSL_PARAMETRMIN3_MOD_PAGAM_DIVERSE = 10;
  public static int PQSL_PARAMETRMIN3_TIPO_SUB_ORD = 11;
  public static int PQSL_PARAMETRMIN3_GENERA_XML = 12;
  public static int PQSL_PARAMETRMIN3_GESTIONE_SPESE = 13;
  public static int PQSL_PARAMETRMIN3_GESIONE_COMMISSIONI = 14;
  public static int PQSL_PARAMETRMIN3_GESTIONE_ALLEGATI = 15;
  public static int PQSL_PARAMETRMIN3_GESTIONE_INFO_TESORIERE = 16;
  public static int PQSL_PARAMETRMIN3_GESTIONE_ORD_ASSOCIATI = 17;
  public static int PQSL_PARAMETRMIN3_GESTIONE_ANNULLI = 18;
  public static int PQSL_PARAMETRMIN3_GESTIONE_VARIAZIONI = 19;
  public static int PQSL_PARAMETRMIN3_GESTIONE_SOSTITUZIONI = 20;
  public static int PQSL_PARAMETRMIN3_UTENTE_INSERIMENTO = 21;
  public static int PQSL_PARAMETRMIN3_DATA_INSERIMENTO = 22;
  public static int PQSL_PARAMETRMIN3_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_PARAMETRMIN3_DATA_ULTIMO_AGG = 24;
  public static int PQSL_PARAMETRMIN3_SPESE_DA_SOGGETTO = 25;

  // Table to contain panel selected row: PARAMETRI MANORD INF XML
  //
  public static int PQRY_PARMANINFXM3 = 1712;
  public static int PQSL_PARMANINFXM3_PARAMETRO = 0;
  public static int PQSL_PARMANINFXM3_TITOLO = 1;
  public static int PQSL_PARMANINFXM3_DESCRIZIONE = 2;
  public static int PQSL_PARMANINFXM3_TIPO_PARAMETRO = 3;
  public static int PQSL_PARMANINFXM3_RECORDAPRI = 4;
  public static int PQSL_PARMANINFXM3_UTENTE_INSERIMENTO = 5;
  public static int PQSL_PARMANINFXM3_DATA_INSERIMENTO = 6;
  public static int PQSL_PARMANINFXM3_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_PARMANINFXM3_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: N06
  //
  public static int PQRY_N7 = 1713;
  public static int PQSL_N7_NUMERO = 0;
  public static int PQSL_N7_ANNO = 1;
  public static int PQSL_N7_UTENTE_INSERIMENTO = 2;
  public static int PQSL_N7_DATA_INSERIMENTO = 3;
  public static int PQSL_N7_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_N7_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T07
  //
  public static int PQRY_T15 = 1714;
  public static int PQSL_T15_TIPO_REGISTRO = 0;
  public static int PQSL_T15_TIPO_BOLLATO = 1;
  public static int PQSL_T15_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T15_DATA_INSERIMENTO = 3;
  public static int PQSL_T15_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T15_DATA_ULTIMO_AGG = 5;
  public static int PQSL_T15_ANNO = 6;
  public static int PQSL_T15_ULTIMO_NUMERO = 7;
  public static int PQSL_T15_D_ULTIMA_DATA = 8;

  // Table to contain panel selected row: N03
  //
  public static int PQRY_N4 = 1715;
  public static int PQSL_N4_CODICE = 0;
  public static int PQSL_N4_NUMERO = 1;
  public static int PQSL_N4_ESERCIZIO = 2;
  public static int PQSL_N4_UTENTE_INSERIMENTO = 3;
  public static int PQSL_N4_DATA_INSERIMENTO = 4;
  public static int PQSL_N4_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_N4_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: N04
  //
  public static int PQRY_N5 = 1716;
  public static int PQSL_N5_ESERCIZIO = 0;
  public static int PQSL_N5_MANDATI_STAMPATI = 1;
  public static int PQSL_N5_ELENCO_MANDATI = 2;
  public static int PQSL_N5_ULT_MAN_TESO = 3;
  public static int PQSL_N5_ORDINATIVI_STAMPATI = 4;
  public static int PQSL_N5_ELENCO_ORDINATIVI = 5;
  public static int PQSL_N5_ULT_ORD_TESO = 6;

  // Table to contain panel selected row: N06
  //
  public static int PQRY_N06 = 1717;
  public static int PQSL_N06_NUMERO = 0;
  public static int PQSL_N06_ANNO = 1;
  public static int PQSL_N06_UTENTE_INSERIMENTO = 2;
  public static int PQSL_N06_DATA_INSERIMENTO = 3;
  public static int PQSL_N06_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_N06_DATA_ULTIMO_AGG = 5;

  // Table to contain panel selected row: T07
  //
  public static int PQRY_T07 = 1718;
  public static int PQSL_T07_TIPO_REGISTRO = 0;
  public static int PQSL_T07_TIPO_BOLLATO = 1;
  public static int PQSL_T07_UTENTE_INSERIMENTO = 2;
  public static int PQSL_T07_DATA_INSERIMENTO = 3;
  public static int PQSL_T07_UTENTE_ULTIMO_AGG = 4;
  public static int PQSL_T07_DATA_ULTIMO_AGG = 5;
  public static int PQSL_T07_ANNO = 6;
  public static int PQSL_T07_ULTIMO_NUMERO = 7;
  public static int PQSL_T07_D_ULTIMA_DATA = 8;

  // Table to contain panel selected row: N03
  //
  public static int PQRY_N03 = 1719;
  public static int PQSL_N03_CODICE = 0;
  public static int PQSL_N03_NUMERO = 1;
  public static int PQSL_N03_ESERCIZIO = 2;
  public static int PQSL_N03_UTENTE_INSERIMENTO = 3;
  public static int PQSL_N03_DATA_INSERIMENTO = 4;
  public static int PQSL_N03_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_N03_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: N04
  //
  public static int PQRY_N04 = 1720;
  public static int PQSL_N04_ESERCIZIO = 0;
  public static int PQSL_N04_MANDATI_STAMPATI = 1;
  public static int PQSL_N04_ELENCO_MANDATI = 2;
  public static int PQSL_N04_ULT_MAN_TESO = 3;
  public static int PQSL_N04_ORDINATIVI_STAMPATI = 4;
  public static int PQSL_N04_ELENCO_ORDINATIVI = 5;
  public static int PQSL_N04_ULT_ORD_TESO = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI92 = 1721;
  public static int PQRY_PARAMETRI92_RS = 1722;
  public static int PQSL_PARAMETRI92_NOMOGGTIPSTA = 0;

  // Table to contain panel selected row: TESTI STAMPE
  //
  public static int PQRY_TESTISTAMPE = 1723;
  public static int PQSL_TESTISTAMPE_TIPO_STAMPA = 0;
  public static int PQSL_TESTISTAMPE_PROGRESSIVO = 1;
  public static int PQSL_TESTISTAMPE_TESTO = 2;
  public static int PQSL_TESTISTAMPE_GRASSETTO = 3;
  public static int PQSL_TESTISTAMPE_CORSIVO = 4;
  public static int PQSL_TESTISTAMPE_SOTTOLINEATO = 5;
  public static int PQSL_TESTISTAMPE_DIMENSIONE_FONT = 6;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMI5 = 1724;
  public static int PQSL_VOCIECONOMI5_E_S = 0;
  public static int PQSL_VOCIECONOMI5_CODICE = 1;
  public static int PQSL_VOCIECONOMI5_DESCRIZIONE = 2;
  public static int PQSL_VOCIECONOMI5_UTENTE_INSERIMENTO = 3;
  public static int PQSL_VOCIECONOMI5_DATA_INSERIMENTO = 4;
  public static int PQSL_VOCIECONOMI5_UTENTE_ULTIMO_AGG = 5;
  public static int PQSL_VOCIECONOMI5_DATA_ULTIMO_AGG = 6;

  // Table to contain panel selected row: VOCI ECONOMICHE
  //
  public static int PQRY_VOCIECONOMI3 = 1725;
  public static int PQSL_VOCIECONOMI3_E_S = 0;
  public static int PQSL_VOCIECONOMI3_CODICE = 1;
  public static int PQSL_VOCIECONOMI3_DESCRIZIONE = 2;

  // Table to contain panel selected row: OGGETTI COMPETENZE
  //
  public static int PQRY_OGGETTCOMPET = 1726;
  public static int PQSL_OGGETTCOMPET_OGGETTO = 0;
  public static int PQSL_OGGETTCOMPET_INTESTA_COMPETENZA = 1;
  public static int PQSL_OGGETTCOMPET_DESCRIZIONE = 2;
  public static int PQSL_OGGETTCOMPET_OGGCOMUTERUO = 3;

  // Table to contain panel selected row: COMPETENZE CF4
  //
  public static int PQRY_COMPETENZCF5 = 1727;
  public static int PQSL_COMPETENZCF5_OGGETTO = 0;
  public static int PQSL_COMPETENZCF5_COMPETENZA = 1;
  public static int PQSL_COMPETENZCF5_UTENTE = 2;
  public static int PQSL_COMPETENZCF5_NOMINAORDINA = 3;

  // Table to contain panel selected row: COMPETENZE CF4
  //
  public static int PQRY_COMPETENZCF6 = 1728;
  public static int PQSL_COMPETENZCF6_OGGETTO = 0;
  public static int PQSL_COMPETENZCF6_COMPECF4UTEN = 1;
  public static int PQSL_COMPETENZCF6_COMPECF4COMP = 2;

  // Table to contain panel selected row: ASSESSORATI
  //
  public static int PQRY_ASSESSORATI = 1729;
  public static int PQSL_ASSESSORATI_CODICE = 0;
  public static int PQSL_ASSESSORATI_ASSESSORATO = 1;
  public static int PQSL_ASSESSORATI_ASSESSORE = 2;
  public static int PQSL_ASSESSORATI_SEQUENZA = 3;

  // Table to contain panel selected row: T54
  //
  public static int PQRY_T71 = 1730;
  public static int PQSL_T71_CODICE = 0;
  public static int PQSL_T71_ASSESSORATO = 1;
  public static int PQSL_T71_ASSESSORE = 2;
  public static int PQSL_T71_SEQUENZA = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI445 = 1731;
  public static int PQRY_PARAMETRI445_RS = 1732;
  public static int PQSL_PARAMETRI445_PARNUMDELDAL = 0;
  public static int PQSL_PARAMETRI445_PARANUMDELAL = 1;
  public static int PQSL_PARAMETRI445_PARDATDELDAL = 2;
  public static int PQSL_PARAMETRI445_PARADATDELAL = 3;
  public static int PQSL_PARAMETRI445_PARAMSEDE = 4;
  public static int PQSL_PARAMETRI445_PARAMANNO = 5;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL6 = 1733;
  public static int PQSL_DEL6_ANNO_DEL = 0;
  public static int PQSL_DEL6_NUMERO_DEL = 1;
  public static int PQSL_DEL6_SEDE_DEL = 2;
  public static int PQSL_DEL6_D_DATA_DEL = 3;
  public static int PQSL_DEL6_DELDESCRIZIO = 4;
  public static int PQSL_DEL6_TIPO_ESEC = 5;
  public static int PQSL_DEL6_NUMERO_APP = 6;
  public static int PQSL_DEL6_D_DATA_APP = 7;

  // Table to contain panel selected row: DEL
  //
  public static int PQRY_DEL7 = 1734;
  public static int PQSL_DEL7_ANNO_DEL = 0;
  public static int PQSL_DEL7_NUMERO_DEL = 1;
  public static int PQSL_DEL7_SEDE_DEL = 2;
  public static int PQSL_DEL7_DESCRIZIONE = 3;
  public static int PQSL_DEL7_TIPO_ESEC = 4;
  public static int PQSL_DEL7_NUMERO_APP = 5;
  public static int PQSL_DEL7_DATA_APP = 6;
  public static int PQSL_DEL7_D_DATA_DEL = 7;
  public static int PQSL_DEL7_D_DATA_APP = 8;
  public static int PQSL_DEL7_ANNO_PRO = 9;
  public static int PQSL_DEL7_NUMERO_PRO = 10;
  public static int PQSL_DEL7_UNITA_PRO = 11;
  public static int PQSL_DEL7_UTENTE_INSERIMENTO = 12;
  public static int PQSL_DEL7_DATA_INSERIMENTO = 13;
  public static int PQSL_DEL7_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_DEL7_DATA_ULTIMO_AGG = 15;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI244 = 1735;
  public static int PQRY_PARAMETRI244_RS = 1736;
  public static int PQSL_PARAMETRI244_PARAMSEDEDEL = 0;
  public static int PQSL_PARAMETRI244_PARAMNUMEDEL = 1;
  public static int PQSL_PARAMETRI244_PARAMANNODEL = 2;

  // Table to contain panel selected row: MOVIMENTI DEL
  //
  public static int PQRY_MOVIMENTIDEL = 1737;
  public static int PQSL_MOVIMENTIDEL_ANNO_DEL = 0;
  public static int PQSL_MOVIMENTIDEL_NUMERO_DEL = 1;
  public static int PQSL_MOVIMENTIDEL_SEDE_DEL = 2;
  public static int PQSL_MOVIMENTIDEL_ESERCIZIO = 3;
  public static int PQSL_MOVIMENTIDEL_E_S = 4;
  public static int PQSL_MOVIMENTIDEL_CAPITOLO = 5;
  public static int PQSL_MOVIMENTIDEL_ARTICOLO = 6;
  public static int PQSL_MOVIMENTIDEL_TIPO_MOVI = 7;
  public static int PQSL_MOVIMENTIDEL_DESCR_TIPO = 8;
  public static int PQSL_MOVIMENTIDEL_IMPORTO = 9;
  public static int PQSL_MOVIMENTIDEL_DESCR_MOVI = 10;
  public static int PQSL_MOVIMENTIDEL_NUMERO_IMP_ACC = 11;
  public static int PQSL_MOVIMENTIDEL_ANNO_IMP_ACC = 12;
  public static int PQSL_MOVIMENTIDEL_NUMERO_SUBIMP = 13;
  public static int PQSL_MOVIMENTIDEL_ANNO_SUBIMP = 14;
  public static int PQSL_MOVIMENTIDEL_NUMERO_LIQ = 15;
  public static int PQSL_MOVIMENTIDEL_ANNO_LIQ = 16;
  public static int PQSL_MOVIMENTIDEL_NUMERO_MAND = 17;
  public static int PQSL_MOVIMENTIDEL_ANNO_MAND = 18;
  public static int PQSL_MOVIMENTIDEL_DESCR_BEN = 19;
  public static int PQSL_MOVIMENTIDEL_ANNO_VAR = 20;
  public static int PQSL_MOVIMENTIDEL_SEQUENZA = 21;

  // Table to contain panel selected row: Paer
  //
  public static int PQRY_PAER1 = 1738;
  public static int PQRY_PAER1_RS = 1739;
  public static int PQSL_PAER1_ROWNAMSEDDEL = 0;
  public static int PQSL_PAER1_ROWNAMNUMDEL = 1;
  public static int PQSL_PAER1_ROWNAMANNDEL = 2;
  public static int PQSL_PAER1_ROWNAMUNIPRO = 3;
  public static int PQSL_PAER1_ROWNAMNUMPRO = 4;
  public static int PQSL_PAER1_ROWNAMANNPRO = 5;

  // Table to contain panel selected row: Esecutività Proposte Da Gs4
  //
  public static int PQRY_ESECPRODAGS5 = 1740;
  public static int PQRY_ESECPRODAGS5_RS = 1741;
  public static int PQSL_ESECPRODAGS5_ROWNAMEAGG = 0;
  public static int PQSL_ESECPRODAGS5_ROWNAMUNIPRO = 1;
  public static int PQSL_ESECPRODAGS5_ROWNAMNUMPRO = 2;
  public static int PQSL_ESECPRODAGS5_ROWNAMANNPRO = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI246 = 1742;
  public static int PQRY_PARAMETRI246_RS = 1743;
  public static int PQSL_PARAMETRI246_PARAUNITPROP = 0;
  public static int PQSL_PARAMETRI246_PARANUMEPROP = 1;
  public static int PQSL_PARAMETRI246_PARAANNOPROP = 2;
  public static int PQSL_PARAMETRI246_PARAMSTATO = 3;

  // Table to contain panel selected row: MOVIMENTI PROP
  //
  public static int PQRY_MOVIMENTPROP = 1744;
  public static int PQSL_MOVIMENTPROP_ANNO_PROPOSTA = 0;
  public static int PQSL_MOVIMENTPROP_NUMERO_PROPOSTA = 1;
  public static int PQSL_MOVIMENTPROP_UNITA_PROPONENTE = 2;
  public static int PQSL_MOVIMENTPROP_ESERCIZIO = 3;
  public static int PQSL_MOVIMENTPROP_E_S = 4;
  public static int PQSL_MOVIMENTPROP_CAPITOLO = 5;
  public static int PQSL_MOVIMENTPROP_ARTICOLO = 6;
  public static int PQSL_MOVIMENTPROP_TIPO_MOVI = 7;
  public static int PQSL_MOVIMENTPROP_DESCR_TIPO = 8;
  public static int PQSL_MOVIMENTPROP_IMPORTO = 9;
  public static int PQSL_MOVIMENTPROP_DESCR_MOVI = 10;
  public static int PQSL_MOVIMENTPROP_NUMERO_IMP_ACC = 11;
  public static int PQSL_MOVIMENTPROP_ANNO_IMP_ACC = 12;
  public static int PQSL_MOVIMENTPROP_NUMERO_SUBIMP = 13;
  public static int PQSL_MOVIMENTPROP_ANNO_SUBIMP = 14;
  public static int PQSL_MOVIMENTPROP_NUMERO_LIQ = 15;
  public static int PQSL_MOVIMENTPROP_ANNO_LIQ = 16;
  public static int PQSL_MOVIMENTPROP_NUMERO_MAND = 17;
  public static int PQSL_MOVIMENTPROP_ANNO_MAND = 18;
  public static int PQSL_MOVIMENTPROP_ANNO_VAR = 19;
  public static int PQSL_MOVIMENTPROP_SEQUENZA = 20;
  public static int PQSL_MOVIMENTPROP_RAG_SOC_BEN = 21;
  public static int PQSL_MOVIMENTPROP_MOVPROPROVAR = 22;
  public static int PQSL_MOVIMENTPROP_INFOIMPACC = 23;
  public static int PQSL_MOVIMENTPROP_APRIIMPACC = 24;
  public static int PQSL_MOVIMENTPROP_INFOSUBIMP = 25;
  public static int PQSL_MOVIMENTPROP_APRISUBIMP = 26;
  public static int PQSL_MOVIMENTPROP_INFOLIQ = 27;
  public static int PQSL_MOVIMENTPROP_APRILIQ = 28;
  public static int PQSL_MOVIMENTPROP_INFOMAN = 29;
  public static int PQSL_MOVIMENTPROP_APRIMAN = 30;
  public static int PQSL_MOVIMENTPROP_INFOCAP = 31;
  public static int PQSL_MOVIMENTPROP_APRICAP = 32;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI247 = 1745;
  public static int PQRY_PARAMETRI247_RS = 1746;
  public static int PQSL_PARAMETRI247_PARAUNITPROP = 0;
  public static int PQSL_PARAMETRI247_PARAMANNO = 1;
  public static int PQSL_PARAMETRI247_PARAMDATA = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI254 = 1747;
  public static int PQRY_PARAMETRI254_RS = 1748;
  public static int PQSL_PARAMETRI254_PARASOLINECO = 0;
  public static int PQSL_PARAMETRI254_PARSOLDOINPR = 1;

  // Table to contain panel selected row: T75
  //
  public static int PQRY_T76 = 1749;
  public static int PQSL_T76_CODICE = 0;
  public static int PQSL_T76_DESCRIZIONE = 1;
  public static int PQSL_T76_TIPO = 2;
  public static int PQSL_T76_ECONOMIA_IVA = 3;
  public static int PQSL_T76_CODICE_CP = 4;
  public static int PQSL_T76_UTENTE_INSERIMENTO = 5;
  public static int PQSL_T76_DATA_INSERIMENTO = 6;
  public static int PQSL_T76_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_T76_DATA_ULTIMO_AGG = 8;

  // Table to contain panel selected row: T75
  //
  public static int PQRY_T75 = 1750;
  public static int PQSL_T75_CODICE = 0;
  public static int PQSL_T75_DESCRIZIONE = 1;
  public static int PQSL_T75_TIPO = 2;
  public static int PQSL_T75_ECONOMIA_IVA = 3;

  // Table to contain panel selected row: SERCOS
  //
  public static int PQRY_SERCOS1 = 1751;
  public static int PQRY_SERCOS1_RS = 1752;
  public static int PQSL_SERCOS1_PROGRESSIVO = 0;
  public static int PQSL_SERCOS1_ESERCIZIO = 1;
  public static int PQSL_SERCOS1_SERVIZIO = 2;
  public static int PQSL_SERCOS1_E_S = 3;
  public static int PQSL_SERCOS1_CAPITOLO = 4;
  public static int PQSL_SERCOS1_IMDSERCAPOLD = 5;
  public static int PQSL_SERCOS1_ARTICOLO = 6;
  public static int PQSL_SERCOS1_IMDSERARTOLD = 7;
  public static int PQSL_SERCOS1_PERCENTUALE = 8;
  public static int PQSL_SERCOS1_IMDSERPEROLD = 9;
  public static int PQSL_SERCOS1_IMPORTO = 10;
  public static int PQSL_SERCOS1_IMDSERIMPOLD = 11;
  public static int PQSL_SERCOS1_FASE = 12;
  public static int PQSL_SERCOS1_TIPO = 13;
  public static int PQSL_SERCOS1_UTENTE_INSERIMENTO = 14;
  public static int PQSL_SERCOS1_DATA_INSERIMENTO = 15;
  public static int PQSL_SERCOS1_UTENTE_ULTIMO_AGG = 16;
  public static int PQSL_SERCOS1_DATA_ULTIMO_AGG = 17;
  public static int PQSL_SERCOS1_IMDBSERCSTAT = 18;

  // Table to contain panel selected row: SERCOS
  //
  public static int PQRY_SERCOS2 = 1753;
  public static int PQSL_SERCOS2_PROGRESSIVO = 0;
  public static int PQSL_SERCOS2_ESERCIZIO = 1;
  public static int PQSL_SERCOS2_SERVIZIO = 2;
  public static int PQSL_SERCOS2_E_S = 3;
  public static int PQSL_SERCOS2_RECORVOCEPEG = 4;
  public static int PQSL_SERCOS2_CAPITOLO = 5;
  public static int PQSL_SERCOS2_ARTICOLO = 6;
  public static int PQSL_SERCOS2_DESCRIZIONE_ABBREVIATA = 7;
  public static int PQSL_SERCOS2_PERCENTUALE = 8;
  public static int PQSL_SERCOS2_RECORDIMPORT = 9;
  public static int PQSL_SERCOS2_RECORDSTANZI = 10;
  public static int PQSL_SERCOS2_RECORDDISPON = 11;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV90 = 1754;
  public static int QSL_CFASELINTV90_COUNT = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL37 = 1755;
  public static int PQSL_DUAL37_RECORDDESCRI = 0;
  public static int PQSL_DUAL37_RECORDENTRAT = 1;
  public static int PQSL_DUAL37_RECORDFUNZIO = 2;
  public static int PQSL_DUAL37_RECORDSERVIZ = 3;
  public static int PQSL_DUAL37_ICON = 4;
  public static int PQSL_DUAL37_RECORDTOOLTI = 5;

  // Table to contain panel selected row: FUNZIONI
  //
  public static int PQRY_FUNZIONI = 1756;
  public static int PQSL_FUNZIONI_RECORDDESCRI = 0;
  public static int PQSL_FUNZIONI_RECOENTRSPES = 1;
  public static int PQSL_FUNZIONI_FUNZIONE = 2;
  public static int PQSL_FUNZIONI_RECORDSERVIZ = 3;
  public static int PQSL_FUNZIONI_ICON = 4;
  public static int PQSL_FUNZIONI_RECORDTOOLTI = 5;

  // Table to contain panel selected row: SERVIZI
  //
  public static int PQRY_SERVIZI = 1757;
  public static int PQSL_SERVIZI_RECORDDESCRI = 0;
  public static int PQSL_SERVIZI_ENTRATASPESA = 1;
  public static int PQSL_SERVIZI_RECORDFUNZIO = 2;
  public static int PQSL_SERVIZI_SERVIZIO = 3;
  public static int PQSL_SERVIZI_ICON = 4;
  public static int PQSL_SERVIZI_RECORDTOOLTI = 5;

  // Table to contain panel selected row: BILBPR
  //
  public static int PQRY_BILBPR = 1758;
  public static int PQSL_BILBPR_TIPO = 0;
  public static int PQSL_BILBPR_ESERCIZIO = 1;
  public static int PQSL_BILBPR_E_S = 2;
  public static int PQSL_BILBPR_CAPITOLO = 3;
  public static int PQSL_BILBPR_ARTICOLO = 4;
  public static int PQSL_BILBPR_DESCRIZIONE = 5;
  public static int PQSL_BILBPR_BILBPRSTANZI = 6;

  // Table to contain panel selected row: SERCOS
  //
  public static int PQRY_SERCOS = 1759;
  public static int PQSL_SERCOS_SERVIZIO = 0;
  public static int PQSL_SERCOS_DESCRIZIONE = 1;
  public static int PQSL_SERCOS_TIPO = 2;
  public static int PQSL_SERCOS_IMPORTO = 3;
  public static int PQSL_SERCOS_PERCENTUALE = 4;
  public static int PQSL_SERCOS_SERCIMPOCALC = 5;

  // Table to contain panel selected row: Soggetti
  //
  public static int PQRY_SOGGETTI2 = 1760;
  public static int PQSL_SOGGETTI2_RAGIONE_SOCIALE_ESTESA = 0;
  public static int PQSL_SOGGETTI2_CODICE = 1;
  public static int PQSL_SOGGETTI2_D_SCADENZA = 2;
  public static int PQSL_SOGGETTI2_CODICE_FISCALE = 3;
  public static int PQSL_SOGGETTI2_PARTITA_IVA = 4;
  public static int PQSL_SOGGETTI2_BENRESIDENZA = 5;
  public static int PQSL_SOGGETTI2_CATEGORIA = 6;
  public static int PQSL_SOGGETTI2_PAGAMENTO_IN_EURO = 7;
  public static int PQSL_SOGGETTI2_BENORDINAMEN = 8;
  public static int PQSL_SOGGETTI2_BENNI = 9;
  public static int PQSL_SOGGETTI2_BENDAL = 10;
  public static int PQSL_SOGGETTI2_BENAL = 11;
  public static int PQSL_SOGGETTI2_BENTIPOSOGGE = 12;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE48 = 1761;
  public static int PQRY_NEWTABLE48_RS = 1762;
  public static int PQSL_NEWTABLE48_PARAMTIPO = 0;
  public static int PQSL_NEWTABLE48_PARAMORDINAM = 1;

  // Table to contain panel selected row: BEN
  //
  public static int PQRY_BEN1 = 1763;
  public static int PQSL_BEN1_CODICE = 0;
  public static int PQSL_BEN1_RAGIONE_SOCIALE = 1;
  public static int PQSL_BEN1_INDIRIZZO = 2;
  public static int PQSL_BEN1_CAP = 3;
  public static int PQSL_BEN1_PROVINCIA = 4;
  public static int PQSL_BEN1_COMUNE = 5;
  public static int PQSL_BEN1_TELEFONO = 6;
  public static int PQSL_BEN1_CELLULARE = 7;
  public static int PQSL_BEN1_CODICE_FISCALE = 8;
  public static int PQSL_BEN1_TELEX = 9;
  public static int PQSL_BEN1_CATEGORIA = 10;
  public static int PQSL_BEN1_TIPO_PAGAMENTO = 11;
  public static int PQSL_BEN1_SESSO = 12;
  public static int PQSL_BEN1_PROVINCIA_NASCITA = 13;
  public static int PQSL_BEN1_COMUNE_NASCITA = 14;
  public static int PQSL_BEN1_STATO_ESTERO = 15;
  public static int PQSL_BEN1_ENTE_DATORE_LAV = 16;
  public static int PQSL_BEN1_DOMICILIO = 17;
  public static int PQSL_BEN1_COMUNE_DOMICILIO = 18;
  public static int PQSL_BEN1_PROVINCIA_DOMICILIO = 19;
  public static int PQSL_BEN1_CAP_DOMICILIO = 20;
  public static int PQSL_BEN1_PARTITA_IVA = 21;
  public static int PQSL_BEN1_D_DATA_NASCITA = 22;
  public static int PQSL_BEN1_D_SCADENZA = 23;
  public static int PQSL_BEN1_COD_IMP_ECO = 24;
  public static int PQSL_BEN1_PAGAMENTO_IN_EURO = 25;
  public static int PQSL_BEN1_CLASSE_LISTINO = 26;
  public static int PQSL_BEN1_E_MAIL = 27;
  public static int PQSL_BEN1_E_MAIL_REF_WEB = 28;
  public static int PQSL_BEN1_INVIO_STAMPE = 29;
  public static int PQSL_BEN1_RAGIONE_SOCIALE_ESTESA = 30;
  public static int PQSL_BEN1_NOTE = 31;
  public static int PQSL_BEN1_STATO_CEE = 32;
  public static int PQSL_BEN1_PARTITA_IVA_CEE = 33;
  public static int PQSL_BEN1_SPESE = 34;
  public static int PQSL_BEN1_UTENTE_INSERIMENTO = 35;
  public static int PQSL_BEN1_DATA_INSERIMENTO = 36;
  public static int PQSL_BEN1_UTENTE_ULTIMO_AGG = 37;
  public static int PQSL_BEN1_DATA_ULTIMO_AGG = 38;
  public static int PQSL_BEN1_CODICE_IPA = 39;
  public static int PQSL_BEN1_RIFERIMENTO_AMMINISTRAZIONE = 40;
  public static int PQSL_BEN1_ID_MODELLO = 41;
  public static int PQSL_BEN1_CODICE_EORI = 42;
  public static int PQSL_BEN1_TRATTAMENTO_IVA_DEFAULT = 43;
  public static int PQSL_BEN1_TAG_UTENZA = 44;
  public static int PQSL_BEN1_CODICE_SDI = 45;
  public static int PQSL_BEN1_E_MAIL_FE = 46;
  public static int PQSL_BEN1_NI = 47;
  public static int PQSL_BEN1_DAL = 48;
  public static int PQSL_BEN1_AL = 49;
  public static int PQSL_BEN1_TIPO_SOGGETTO = 50;
  public static int PQSL_BEN1_DATA_NASCITA = 51;
  public static int PQSL_BEN1_SCADENZA = 52;
  public static int PQSL_BEN1_COMPETENZA = 53;
  public static int PQSL_BEN1_CONTRIBUENTI_MINIMI = 54;

  // Table to contain panel selected row: QTN
  //
  public static int PQRY_QTN1 = 1764;
  public static int PQRY_QTN1_RS = 1765;
  public static int PQSL_QTN1_CODICE = 0;
  public static int PQSL_QTN1_NUM_QUIETANZA = 1;
  public static int PQSL_QTN1_TIPO_QUIETANZA = 2;
  public static int PQSL_QTN1_CONTO_CORRENTE = 3;
  public static int PQSL_QTN1_CIN_BANCARIO = 4;
  public static int PQSL_QTN1_COD_BANCA = 5;
  public static int PQSL_QTN1_COD_SPORTELLO = 6;
  public static int PQSL_QTN1_IBAN_PAESE = 7;
  public static int PQSL_QTN1_IBAN_CIN_EUROPA = 8;
  public static int PQSL_QTN1_DES_BANCA = 9;
  public static int PQSL_QTN1_INTESTATARIO_1 = 10;
  public static int PQSL_QTN1_INTESTATARIO_2 = 11;
  public static int PQSL_QTN1_INTESTATARIO_3 = 12;
  public static int PQSL_QTN1_IBAN_ID_NAZIONALE = 13;
  public static int PQSL_QTN1_IBAN_CONTO = 14;
  public static int PQSL_QTN1_IBAN_EXTRA_UE = 15;
  public static int PQSL_QTN1_SCADENZA = 16;
  public static int PQSL_QTN1_QUIETANZANTE = 17;
  public static int PQSL_QTN1_BIC = 18;
  public static int PQSL_QTN1_SPESE = 19;
  public static int PQSL_QTN1_QSTATO = 20;
  public static int PQSL_QTN1_UTENTE_INSERIMENTO = 21;
  public static int PQSL_QTN1_DATA_INSERIMENTO = 22;
  public static int PQSL_QTN1_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_QTN1_DATA_ULTIMO_AGG = 24;
  public static int PQSL_QTN1_QCONTODEDICA = 25;
  public static int PQSL_QTN1_IBAN = 26;
  public static int PQSL_QTN1_IBAN_LOG = 27;
  public static int PQSL_QTN1_TIPO_POSTALIZZAZIONE = 28;
  public static int PQSL_QTN1_ORD_SP_RC = 29;
  public static int PQSL_QTN1_PREVALENTE = 30;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSE12 = 1766;
  public static int QSL_CFDBCFDBSE12_COUNT1 = 0;

  // Recordset for query: QTN
  //
  public static int QRY_QTN2 = 1767;
  public static int QSL_QTN2_QCODICE = 0;
  public static int QSL_QTN2_QCONTOCORREN = 1;
  public static int QSL_QTN2_ROWNAMNUMQUI = 2;
  public static int QSL_QTN2_QDESBANCA = 3;
  public static int QSL_QTN2_QCODBANCA = 4;
  public static int QSL_QTN2_QCODSPORTELL = 5;
  public static int QSL_QTN2_QINTESTATAR1 = 6;
  public static int QSL_QTN2_QINTESTATAR2 = 7;
  public static int QSL_QTN2_QINTESTATAR3 = 8;
  public static int QSL_QTN2_QSCADENZA = 9;
  public static int QSL_QTN2_QCINBANCARIO = 10;
  public static int QSL_QTN2_QIBANPAESE = 11;
  public static int QSL_QTN2_QIBANCINEURO = 12;
  public static int QSL_QTN2_ROWNAMEQUIET = 13;
  public static int QSL_QTN2_QIBANIDNAZIO = 14;
  public static int QSL_QTN2_QIBANCONTO = 15;
  public static int QSL_QTN2_QIBANEXTRAUE = 16;
  public static int QSL_QTN2_QBIC = 17;
  public static int QSL_QTN2_QSPESE = 18;
  public static int QSL_QTN2_QUTENTEINSER = 19;
  public static int QSL_QTN2_QDATAINSERIM = 20;
  public static int QSL_QTN2_QUTENULTIAGG = 21;
  public static int QSL_QTN2_QDATAULTIAGG = 22;
  public static int QSL_QTN2_QSTATO = 23;
  public static int QSL_QTN2_ROWNAMTIPQUI = 24;
  public static int QSL_QTN2_QCONTODEDICA = 25;
  public static int QSL_QTN2_QIBANCOMPLET = 26;
  public static int QSL_QTN2_QTIPOPOSTALI = 27;
  public static int QSL_QTN2_QORDSPRC = 28;
  public static int QSL_QTN2_QPREVALENTE = 29;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR51 = 1768;
  public static int PQRY_PAR51_RS = 1769;
  public static int PQSL_PAR51_ROWNAMSOCOCO = 0;
  public static int PQSL_PAR51_ROWNAMEPROVI = 1;
  public static int PQSL_PAR51_ROWNAMECAP = 2;
  public static int PQSL_PAR51_ROWNAMECOMUN = 3;

  // Table to contain panel selected row: SOGGETTI REGIONI
  //
  public static int PQRY_SOGGETREGION = 1770;
  public static int PQSL_SOGGETREGION_REGIONE = 0;
  public static int PQSL_SOGGETREGION_CODICE = 1;

  // Table to contain panel selected row: Import File
  //
  public static int PQRY_IMPORTFILE4 = 1771;
  public static int PQSL_IMPORTFILE4_PROGRESSIVO = 0;
  public static int PQSL_IMPORTFILE4_SESSIONE = 1;
  public static int PQSL_IMPORTFILE4_FASE = 2;
  public static int PQSL_IMPORTFILE4_FILE_DATI = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI554 = 1772;
  public static int PQRY_PARAMETRI554_RS = 1773;
  public static int PQSL_PARAMETRI554_RONATIPAPECA = 0;
  public static int PQSL_PARAMETRI554_ROWNAMESPESE = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM83 = 1774;
  public static int PQRY_PARAM83_RS = 1775;
  public static int PQSL_PARAM83_ROWNAMEPARTE = 0;
  public static int PQSL_PARAM83_ROWNAMAPECHI = 1;
  public static int PQSL_PARAM83_ROWNAMEDAL = 2;
  public static int PQSL_PARAM83_ROWNAMEAL = 3;
  public static int PQSL_PARAM83_ROWNAMEORDIN = 4;

  // Table to contain panel selected row: CF4WEB ESTRATTO CONTO
  //
  public static int PQRY_CF4WESTRCONT = 1776;
  public static int PQSL_CF4WESTRCONT_DOCUMENTO = 0;
  public static int PQSL_CF4WESTRCONT_DESCRIZIONE = 1;
  public static int PQSL_CF4WESTRCONT_IMPORTO = 2;
  public static int PQSL_CF4WESTRCONT_PAGATO = 3;
  public static int PQSL_CF4WESTRCONT_SALDO = 4;
  public static int PQSL_CF4WESTRCONT_RITENUTE = 5;
  public static int PQSL_CF4WESTRCONT_UFFICIO = 6;
  public static int PQSL_CF4WESTRCONT_CATEGORIA = 7;
  public static int PQSL_CF4WESTRCONT_DATA_RIENTRO = 8;
  public static int PQSL_CF4WESTRCONT_VARIAZIONI = 9;
  public static int PQSL_CF4WESTRCONT_FAT_DESCRIZIONE = 10;
  public static int PQSL_CF4WESTRCONT_CF4WESTRCONL = 11;
  public static int PQSL_CF4WESTRCONT_ORDINAMEDATA = 12;
  public static int PQSL_CF4WESTRCONT_ORDINANUMERO = 13;
  public static int PQSL_CF4WESTRCONT_CF4ESTCONINF = 14;
  public static int PQSL_CF4WESTRCONT_CF4ESTCONDET = 15;
  public static int PQSL_CF4WESTRCONT_TIPO = 16;
  public static int PQSL_CF4WESTRCONT_ANNO = 17;
  public static int PQSL_CF4WESTRCONT_NUMERO = 18;
  public static int PQSL_CF4WESTRCONT_PARTE = 19;
  public static int PQSL_CF4WESTRCONT_CODICE_DOC = 20;
  public static int PQSL_CF4WESTRCONT_SOGGETTO = 21;
  public static int PQSL_CF4WESTRCONT_CF4ESTCONIMP = 22;
  public static int PQSL_CF4WESTRCONT_CF4ESTCONIVA = 23;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ20 = 1777;
  public static int PQSL_LIQ20_NUMERO_LIQ = 0;
  public static int PQSL_LIQ20_LIQDDATAREG = 1;
  public static int PQSL_LIQ20_LIBERASOESES = 2;
  public static int PQSL_LIQ20_LIQFATDDATDO = 3;
  public static int PQSL_LIQ20_LIQQUIETANZA = 4;
  public static int PQSL_LIQ20_LIQUFFICIO = 5;
  public static int PQSL_LIQ20_LIQSEDEDEL = 6;
  public static int PQSL_LIQ20_LIQNUMERODEL = 7;
  public static int PQSL_LIQ20_LIQANNODEL = 8;
  public static int PQSL_LIQ20_LIQFATNUMDOC = 9;
  public static int PQSL_LIQ20_LIQRITENUTE = 10;
  public static int PQSL_LIQ20_LIQIMPORTO = 11;
  public static int PQSL_LIQ20_LIQPROGRTESO = 12;
  public static int PQSL_LIQ20_DISTINTECNIC = 13;
  public static int PQSL_LIQ20_LIQPAGATO = 14;
  public static int PQSL_LIQ20_UFFICIO = 15;
  public static int PQSL_LIQ20_DESCRIZIONE = 16;
  public static int PQSL_LIQ20_FINANZIAMENT = 17;
  public static int PQSL_LIQ20_CGU = 18;
  public static int PQSL_LIQ20_LIQQTNCODICE = 19;
  public static int PQSL_LIQ20_LIQQTNNUMQUI = 20;
  public static int PQSL_LIQ20_ORD1 = 21;
  public static int PQSL_LIQ20_ORD2 = 22;
  public static int PQSL_LIQ20_ANNOLIQ = 23;
  public static int PQSL_LIQ20_LIQINFOQUIET = 24;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE6 = 1778;
  public static int PQSL_PRE6_IMPORTO = 0;
  public static int PQSL_PRE6_PRBERASOESES = 1;
  public static int PQSL_PRE6_DOCUMENTO = 2;
  public static int PQSL_PRE6_PREQUIETANZA = 3;
  public static int PQSL_PRE6_NUMERO_CONTABILE = 4;
  public static int PQSL_PRE6_DATA_CONTABILE = 5;
  public static int PQSL_PRE6_PREINCASSATO = 6;
  public static int PQSL_PRE6_PREDESCRIZIO = 7;
  public static int PQSL_PRE6_PREPROGRTESO = 8;
  public static int PQSL_PRE6_PRETCOTIPBOL = 9;
  public static int PQSL_PRE6_PRETCONUMREG = 10;
  public static int PQSL_PRE6_PRETCOANNREG = 11;
  public static int PQSL_PRE6_PREUFFICIO = 12;
  public static int PQSL_PRE6_DISTINTA = 13;
  public static int PQSL_PRE6_CGE = 14;
  public static int PQSL_PRE6_OPERA = 15;

  // Table to contain panel selected row: Entrata
  //
  public static int PQRY_ENTRATA1 = 1779;
  public static int PQRY_ENTRATA1_RS = 1780;
  public static int PQSL_ENTRATA1_ROWNAMERETTI = 0;
  public static int PQSL_ENTRATA1_ROWNAMEPAGAT = 1;
  public static int PQSL_ENTRATA1_ROWNAMESALDO = 2;
  public static int PQSL_ENTRATA1_ROWNAMEIMPOR = 3;

  // Table to contain panel selected row: Spesa
  //
  public static int PQRY_SPESA1 = 1781;
  public static int PQRY_SPESA1_RS = 1782;
  public static int PQSL_SPESA1_ROWNAMERETTI = 0;
  public static int PQSL_SPESA1_ROWNAMEPAGAT = 1;
  public static int PQSL_SPESA1_ROWNAMESALDO = 2;
  public static int PQSL_SPESA1_ROWNAMERITEN = 3;
  public static int PQSL_SPESA1_ROWNAMEIMPOR = 4;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ21 = 1783;
  public static int PQSL_LIQ21_DISTINTALIQ = 0;
  public static int PQSL_LIQ21_LIQCAPITOLO = 1;
  public static int PQSL_LIQ21_LIQIMPORTO = 2;
  public static int PQSL_LIQ21_LIQPAGATO = 3;
  public static int PQSL_LIQ21_LIQDELIBSUBI = 4;
  public static int PQSL_LIQ21_LIQIMPEGNO = 5;
  public static int PQSL_LIQ21_LIQLIQUIDAZI = 6;
  public static int PQSL_LIQ21_LIQMANDATO = 7;
  public static int PQSL_LIQ21_LIQSUBIMPEGN = 8;
  public static int PQSL_LIQ21_LIQDELIBEIMP = 9;
  public static int PQSL_LIQ21_LIQDELIBERA = 10;
  public static int PQSL_LIQ21_LIQDIVERSBEN = 11;
  public static int PQSL_LIQ21_LIQDISTINTA = 12;
  public static int PQSL_LIQ21_LIQQUIETANZA = 13;
  public static int PQSL_LIQ21_LIQUFFICIO = 14;
  public static int PQSL_LIQ21_LIQRITENUTE = 15;
  public static int PQSL_LIQ21_ANNOLIQ = 16;
  public static int PQSL_LIQ21_NUMEROLIQ = 17;
  public static int PQSL_LIQ21_DESCRIZIOLIQ = 18;
  public static int PQSL_LIQ21_LIQCODICEQTN = 19;
  public static int PQSL_LIQ21_LIQNUMENOQTN = 20;
  public static int PQSL_LIQ21_LIQINFOQUIET = 21;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT2 = 1784;
  public static int PQSL_RETFAT2_DESCRIZIONE = 0;
  public static int PQSL_RETFAT2_RETFATIMPORT = 1;
  public static int PQSL_RETFAT2_RETFADATAREG = 2;
  public static int PQSL_RETFAT2_RETFATANNRIF = 3;
  public static int PQSL_RETFAT2_RETFATNUMRIF = 4;
  public static int PQSL_RETFAT2_RETFATNUMDOC = 5;
  public static int PQSL_RETFAT2_RETFAFATDESC = 6;
  public static int PQSL_RETFAT2_RETFAFATIMPO = 7;
  public static int PQSL_RETFAT2_RETFATPROGRE = 8;
  public static int PQSL_RETFAT2_RETFATDOCFAT = 9;
  public static int PQSL_RETFAT2_RETFDOCUCOLL = 10;
  public static int PQSL_RETFAT2_RETFATCODREC = 11;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ33 = 1785;
  public static int PQSL_LIQ33_LIQCAPITOLO = 0;
  public static int PQSL_LIQ33_LIQORDINATIV = 1;
  public static int PQSL_LIQ33_LIQIMPORTO = 2;
  public static int PQSL_LIQ33_LIQT02DESCRI = 3;
  public static int PQSL_LIQ33_LIQDISTINTA = 4;
  public static int PQSL_LIQ33_LIQACCERTAME = 5;
  public static int PQSL_LIQ33_LIQQUIETANZA = 6;
  public static int PQSL_LIQ33_LIQUFFICIO = 7;
  public static int PQSL_LIQ33_LIQPREANNORD = 8;
  public static int PQSL_LIQ33_LIQPRENUMORD = 9;
  public static int PQSL_LIQ33_LIQDESCRIZIO = 10;

  // Table to contain panel selected row: RETFAT
  //
  public static int PQRY_RETFAT3 = 1786;
  public static int PQSL_RETFAT3_DESCRIZIONE = 0;
  public static int PQSL_RETFAT3_RETFATIMPORT = 1;
  public static int PQSL_RETFAT3_RETFADATAREG = 2;
  public static int PQSL_RETFAT3_RETFATANNRIF = 3;
  public static int PQSL_RETFAT3_RETFATNUMRIF = 4;
  public static int PQSL_RETFAT3_RETFATNUMDOC = 5;
  public static int PQSL_RETFAT3_RETFAFATDESC = 6;
  public static int PQSL_RETFAT3_RETFAFATIMPO = 7;
  public static int PQSL_RETFAT3_RETFATPROGRE = 8;
  public static int PQSL_RETFAT3_RETFATDOCFAT = 9;
  public static int PQSL_RETFAT3_RETFDOCUCOLL = 10;
  public static int PQSL_RETFAT3_RETFATCODREC = 11;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO7 = 1787;
  public static int PQRY_FILTRO7_RS = 1788;
  public static int PQSL_FILTRO7_FILTROFINOAL = 0;
  public static int PQSL_FILTRO7_FILTTIPOREGI = 1;
  public static int PQSL_FILTRO7_FILTTIPOBOLL = 2;
  public static int PQSL_FILTRO7_FILTREGIBOLL = 3;
  public static int PQSL_FILTRO7_FILTRDACONTA = 4;

  // Table to contain panel selected row: FAT IMPORT
  //
  public static int PQRY_FATIMPORT1 = 1789;
  public static int PQSL_FATIMPORT1_ESERCIZIO = 0;
  public static int PQSL_FATIMPORT1_TIPO_REGISTRO = 1;
  public static int PQSL_FATIMPORT1_TIPO_BOLLATO = 2;
  public static int PQSL_FATIMPORT1_ANNO_DOC = 3;
  public static int PQSL_FATIMPORT1_NUMERO_DOC = 4;
  public static int PQSL_FATIMPORT1_NUMERO_REG = 5;
  public static int PQSL_FATIMPORT1_DATA_DOC = 6;
  public static int PQSL_FATIMPORT1_CODICE_DOC = 7;
  public static int PQSL_FATIMPORT1_CLIENTE = 8;
  public static int PQSL_FATIMPORT1_RAGIONE_SOCIALE = 9;
  public static int PQSL_FATIMPORT1_INDIRIZZO_1 = 10;
  public static int PQSL_FATIMPORT1_INDIRIZZO_2 = 11;
  public static int PQSL_FATIMPORT1_INDIRIZZO_3 = 12;
  public static int PQSL_FATIMPORT1_CAP = 13;
  public static int PQSL_FATIMPORT1_COMUNE = 14;
  public static int PQSL_FATIMPORT1_PROVINCIA = 15;
  public static int PQSL_FATIMPORT1_PARTITA_IVA = 16;
  public static int PQSL_FATIMPORT1_CODICE_FISCALE = 17;
  public static int PQSL_FATIMPORT1_TIPO_SCADENZA = 18;
  public static int PQSL_FATIMPORT1_SCADENZA = 19;
  public static int PQSL_FATIMPORT1_DESCRIZIONE = 20;
  public static int PQSL_FATIMPORT1_IMPORTO = 21;
  public static int PQSL_FATIMPORT1_NUM_QUIETANZA = 22;
  public static int PQSL_FATIMPORT1_CONTROPARTITA = 23;
  public static int PQSL_FATIMPORT1_UTENTE = 24;
  public static int PQSL_FATIMPORT1_PROVENIENZA = 25;
  public static int PQSL_FATIMPORT1_ANNO_PARTITA = 26;
  public static int PQSL_FATIMPORT1_NUMERO_PARTITA = 27;
  public static int PQSL_FATIMPORT1_FAT_ANNO_PROG = 28;
  public static int PQSL_FATIMPORT1_FAT_NUMERO_PROG = 29;
  public static int PQSL_FATIMPORT1_FATPRI_ANNO_PROG = 30;
  public static int PQSL_FATIMPORT1_FATPRI_NUMERO_PROG = 31;
  public static int PQSL_FATIMPORT1_CATEGORIA = 32;
  public static int PQSL_FATIMPORT1_UFFICIO = 33;
  public static int PQSL_FATIMPORT1_FATIMPDADOES = 34;
  public static int PQSL_FATIMPORT1_FATIMPNUDOES = 35;
  public static int PQSL_FATIMPORT1_IMPORTRITENU = 36;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM157 = 1790;
  public static int PQRY_PARAM157_RS = 1791;
  public static int PQSL_PARAM157_ROWNAMTIPREG = 0;
  public static int PQSL_PARAM157_ROWNAMTIPBOL = 1;
  public static int PQSL_PARAM157_ROWNAMREGBOL = 2;
  public static int PQSL_PARAM157_ROWNAMDOCEME = 3;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO2 = 1792;
  public static int PQRY_FILTRO2_RS = 1793;
  public static int PQSL_FILTRO2_FILTROFINOAL = 0;
  public static int PQSL_FILTRO2_FILTTIPOREGI = 1;
  public static int PQSL_FILTRO2_FILTTIPOBOLL = 2;
  public static int PQSL_FILTRO2_FILTREGIBOLL = 3;
  public static int PQSL_FILTRO2_FILTRDACONTA = 4;
  public static int PQSL_FILTRO2_FILGIACONIVA = 5;

  // Table to contain panel selected row: FAT IMPORT
  //
  public static int PQRY_FATIMPORT = 1794;
  public static int PQSL_FATIMPORT_ESERCIZIO = 0;
  public static int PQSL_FATIMPORT_TIPO_REGISTRO = 1;
  public static int PQSL_FATIMPORT_TIPO_BOLLATO = 2;
  public static int PQSL_FATIMPORT_ANNO_DOC = 3;
  public static int PQSL_FATIMPORT_NUMERO_DOC = 4;
  public static int PQSL_FATIMPORT_NUMERO_REG = 5;
  public static int PQSL_FATIMPORT_DATA_DOC = 6;
  public static int PQSL_FATIMPORT_CODICE_DOC = 7;
  public static int PQSL_FATIMPORT_CLIENTE = 8;
  public static int PQSL_FATIMPORT_RAGIONE_SOCIALE = 9;
  public static int PQSL_FATIMPORT_INDIRIZZO_1 = 10;
  public static int PQSL_FATIMPORT_INDIRIZZO_2 = 11;
  public static int PQSL_FATIMPORT_INDIRIZZO_3 = 12;
  public static int PQSL_FATIMPORT_CAP = 13;
  public static int PQSL_FATIMPORT_COMUNE = 14;
  public static int PQSL_FATIMPORT_PROVINCIA = 15;
  public static int PQSL_FATIMPORT_PARTITA_IVA = 16;
  public static int PQSL_FATIMPORT_CODICE_FISCALE = 17;
  public static int PQSL_FATIMPORT_TIPO_SCADENZA = 18;
  public static int PQSL_FATIMPORT_SCADENZA = 19;
  public static int PQSL_FATIMPORT_DESCRIZIONE = 20;
  public static int PQSL_FATIMPORT_IMPORTO = 21;
  public static int PQSL_FATIMPORT_NUM_QUIETANZA = 22;
  public static int PQSL_FATIMPORT_CONTROPARTITA = 23;
  public static int PQSL_FATIMPORT_UTENTE = 24;
  public static int PQSL_FATIMPORT_PROVENIENZA = 25;
  public static int PQSL_FATIMPORT_ANNO_PARTITA = 26;
  public static int PQSL_FATIMPORT_NUMERO_PARTITA = 27;
  public static int PQSL_FATIMPORT_FAT_ANNO_PROG = 28;
  public static int PQSL_FATIMPORT_FAT_NUMERO_PROG = 29;
  public static int PQSL_FATIMPORT_FATPRI_ANNO_PROG = 30;
  public static int PQSL_FATIMPORT_FATPRI_NUMERO_PROG = 31;
  public static int PQSL_FATIMPORT_CATEGORIA = 32;
  public static int PQSL_FATIMPORT_UFFICIO = 33;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM147 = 1795;
  public static int PQRY_PARAM147_RS = 1796;
  public static int PQSL_PARAM147_ROWNAMTIPREG = 0;
  public static int PQSL_PARAM147_ROWNAMTIPBOL = 1;
  public static int PQSL_PARAM147_ROWNAMREGBOL = 2;
  public static int PQSL_PARAM147_ROWNAMDOCEME = 3;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM25 = 1797;
  public static int PQRY_PARAM25_RS = 1798;
  public static int PQSL_PARAM25_ROWNAMTIPREG = 0;
  public static int PQSL_PARAM25_ROWNAMTIPBOL = 1;
  public static int PQSL_PARAM25_ROWNAMREGBOL = 2;
  public static int PQSL_PARAM25_ROWNAMDOCEME = 3;
  public static int PQSL_PARAM25_ROWNAMCONPAT = 4;
  public static int PQSL_PARAM25_ROWNAMCODDEB = 5;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM13 = 1799;
  public static int PQRY_PARAM13_RS = 1800;
  public static int PQSL_PARAM13_PARAREGIBOLL = 0;
  public static int PQSL_PARAM13_PARATIPOREGI = 1;
  public static int PQSL_PARAM13_PARATIPOBOLL = 2;
  public static int PQSL_PARAM13_PARAMDAL = 3;
  public static int PQSL_PARAM13_PARAMAL = 4;
  public static int PQSL_PARAM13_PARAMCODICE = 5;

  // Table to contain panel selected row: CFA
  //
  public static int PQRY_CFA1 = 1801;
  public static int PQSL_CFA1_IMPORTO = 0;
  public static int PQSL_CFA1_CFBERASOESES = 1;
  public static int PQSL_CFA1_NUMERO_DOC = 2;
  public static int PQSL_CFA1_D_DATA_DOC = 3;
  public static int PQSL_CFA1_CFAT03DESCRI = 4;
  public static int PQSL_CFA1_DESCRIZIONE = 5;
  public static int PQSL_CFA1_CAPITOLO = 6;
  public static int PQSL_CFA1_ARTICOLO = 7;
  public static int PQSL_CFA1_ANNO_DOC = 8;
  public static int PQSL_CFA1_CFAINFOPEG = 9;
  public static int PQSL_CFA1_PROGRESSIVO = 10;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM15 = 1802;
  public static int PQRY_PARAM15_RS = 1803;
  public static int PQSL_PARAM15_PARAMDATAREG = 0;
  public static int PQSL_PARAM15_PARAMDESCRIZ = 1;
  public static int PQSL_PARAM15_PARAMCAUSALE = 2;
  public static int PQSL_PARAM15_PARATIPOSERV = 3;
  public static int PQSL_PARAM15_PARAMCONTROP = 4;
  public static int PQSL_PARAM15_PARAMARESIDU = 5;
  public static int PQSL_PARAM15_PARACODIDEBI = 6;
  public static int PQSL_PARAM15_PARAMDEBITOR = 7;

  // Recordset for query: CFA
  //
  public static int QRY_CFA3 = 1804;
  public static int QSL_CFA3_ROWNAMEPROGR = 0;

  // Table to contain panel selected row: CFA
  //
  public static int PQRY_CFA2 = 1805;
  public static int PQSL_CFA2_IMPORTO = 0;
  public static int PQSL_CFA2_CFBERASOESES = 1;
  public static int PQSL_CFA2_NUMERO_DOC = 2;
  public static int PQSL_CFA2_D_DATA_DOC = 3;
  public static int PQSL_CFA2_CFAT03DESCRI = 4;
  public static int PQSL_CFA2_DESCRIZIONE = 5;
  public static int PQSL_CFA2_CAPITOLO = 6;
  public static int PQSL_CFA2_ARTICOLO = 7;
  public static int PQSL_CFA2_ANNO_DOC = 8;
  public static int PQSL_CFA2_PROGRESSIVO = 9;

  // Table to contain panel selected row: CAUSALI
  //
  public static int PQRY_CAUSALI1 = 1806;
  public static int PQRY_CAUSALI1_RS = 1807;
  public static int PQSL_CAUSALI1_DESCRIZIONE = 0;
  public static int PQSL_CAUSALI1_TIPO_REGISTRO = 1;
  public static int PQSL_CAUSALI1_TIPO_BOLLATO = 2;
  public static int PQSL_CAUSALI1_CAPITOLO = 3;
  public static int PQSL_CAUSALI1_ARTICOLO = 4;
  public static int PQSL_CAUSALI1_NUMERO_ACC = 5;
  public static int PQSL_CAUSALI1_ANNO_ACC = 6;
  public static int PQSL_CAUSALI1_FATTORE = 7;
  public static int PQSL_CAUSALI1_CENTRO = 8;
  public static int PQSL_CAUSALI1_CAUSASCELPEG = 9;
  public static int PQSL_CAUSALI1_CAUSASCELACC = 10;
  public static int PQSL_CAUSALI1_ALIQUOTA = 11;
  public static int PQSL_CAUSALI1_CODICE_ESENZIONE = 12;
  public static int PQSL_CAUSALI1_CODICE_ESENZIONE_ARR = 13;
  public static int PQSL_CAUSALI1_TIPO_DOC = 14;
  public static int PQSL_CAUSALI1_DESC_FATTURA = 15;
  public static int PQSL_CAUSALI1_DESC_BOLLO = 16;
  public static int PQSL_CAUSALI1_RETTA = 17;
  public static int PQSL_CAUSALI1_TIPO_INCASSO = 18;
  public static int PQSL_CAUSALI1_UTENTE_INSERIMENTO = 19;
  public static int PQSL_CAUSALI1_DATA_INSERIMENTO = 20;
  public static int PQSL_CAUSALI1_UTENTE_ULTIMO_AGG = 21;
  public static int PQSL_CAUSALI1_DATA_ULTIMO_AGG = 22;
  public static int PQSL_CAUSALI1_ROWNAMREGBOL = 23;
  public static int PQSL_CAUSALI1_CODICE = 24;
  public static int PQSL_CAUSALI1_PROVENIENZA = 25;
  public static int PQSL_CAUSALI1_IMPORTO_SPESE = 26;

  // Table to contain panel selected row: PERIODI CAUSALI
  //
  public static int PQRY_PERIODCAUSA1 = 1808;
  public static int PQSL_PERIODCAUSA1_CAUSALE = 0;
  public static int PQSL_PERIODCAUSA1_ANNO = 1;
  public static int PQSL_PERIODCAUSA1_MESE = 2;
  public static int PQSL_PERIODCAUSA1_ANNO_ACC = 3;
  public static int PQSL_PERIODCAUSA1_NUMERO_ACC = 4;
  public static int PQSL_PERIODCAUSA1_COMPETENZA_DAL = 5;
  public static int PQSL_PERIODCAUSA1_COMPETENZA_AL = 6;
  public static int PQSL_PERIODCAUSA1_UTENTE_INSERIMENTO = 7;
  public static int PQSL_PERIODCAUSA1_DATA_INSERIMENTO = 8;
  public static int PQSL_PERIODCAUSA1_UTENTE_ULTIMO_AGG = 9;
  public static int PQSL_PERIODCAUSA1_DATA_ULTIMO_AGG = 10;
  public static int PQSL_PERIODCAUSA1_PERCAUSCEACC = 11;

  // Table to contain panel selected row: CAUSALI
  //
  public static int PQRY_CAUSALI2 = 1809;
  public static int PQSL_CAUSALI2_CODICE = 0;
  public static int PQSL_CAUSALI2_DESCRIZIONE = 1;
  public static int PQSL_CAUSALI2_TIPO_REGISTRO = 2;
  public static int PQSL_CAUSALI2_TIPO_BOLLATO = 3;
  public static int PQSL_CAUSALI2_CAUTIPREGBOL = 4;
  public static int PQSL_CAUSALI2_CAPITOLO = 5;
  public static int PQSL_CAUSALI2_ARTICOLO = 6;
  public static int PQSL_CAUSALI2_NUMERO_ACC = 7;
  public static int PQSL_CAUSALI2_ANNO_ACC = 8;
  public static int PQSL_CAUSALI2_FATTORE = 9;
  public static int PQSL_CAUSALI2_CENTRO = 10;
  public static int PQSL_CAUSALI2_CAUSASCELPEG = 11;
  public static int PQSL_CAUSALI2_CAUSASCELACC = 12;
  public static int PQSL_CAUSALI2_ALIQUOTA = 13;
  public static int PQSL_CAUSALI2_CODICE_ESENZIONE = 14;
  public static int PQSL_CAUSALI2_CODICE_ESENZIONE_ARR = 15;
  public static int PQSL_CAUSALI2_TIPO_DOC = 16;
  public static int PQSL_CAUSALI2_DESC_FATTURA = 17;
  public static int PQSL_CAUSALI2_DESC_BOLLO = 18;
  public static int PQSL_CAUSALI2_RETTA = 19;
  public static int PQSL_CAUSALI2_TIPO_INCASSO = 20;
  public static int PQSL_CAUSALI2_CAUST06CODT7 = 21;
  public static int PQSL_CAUSALI2_CAUSALDESCR1 = 22;
  public static int PQSL_CAUSALI2_CAUSAT06CODI1 = 23;
  public static int PQSL_CAUSALI2_CAUSALDESCR2 = 24;
  public static int PQSL_CAUSALI2_CAUSAT04DESC = 25;

  // Table to contain panel selected row: PERIODI CAUSALI
  //
  public static int PQRY_PERIODCAUSAL = 1810;
  public static int PQSL_PERIODCAUSAL_CAUSALE = 0;
  public static int PQSL_PERIODCAUSAL_ANNO = 1;
  public static int PQSL_PERIODCAUSAL_MESE = 2;
  public static int PQSL_PERIODCAUSAL_NUMERO_ACC = 3;
  public static int PQSL_PERIODCAUSAL_COMPETENZA_DAL = 4;
  public static int PQSL_PERIODCAUSAL_COMPETENZA_AL = 5;

  // Table to contain panel selected row: Varibili
  //
  public static int PQRY_VARIBILI1 = 1811;
  public static int PQRY_VARIBILI1_RS = 1812;
  public static int PQSL_VARIBILI1_ROWNAMEES = 0;
  public static int PQSL_VARIBILI1_ROWNAMELI = 1;
  public static int PQSL_VARIBILI1_ROWNAMSOLIMP = 2;
  public static int PQSL_VARIBILI1_ROWNAMEDAL = 3;
  public static int PQSL_VARIBILI1_ROWNAMEAL = 4;
  public static int PQSL_VARIBILI1_ROWNAMECATEG = 5;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAMP1 = 1813;
  public static int PQRY_PARAMESTAMP1_RS = 1814;
  public static int PQSL_PARAMESTAMP1_ROWNAMFATOCE = 0;
  public static int PQSL_PARAMESTAMP1_ROWNAMDADODA = 1;
  public static int PQSL_PARAMESTAMP1_ROWNAMDADOAL = 2;
  public static int PQSL_PARAMESTAMP1_ROWNAMENTOSP = 3;
  public static int PQSL_PARAMESTAMP1_ROWNAMORDPER = 4;
  public static int PQSL_PARAMESTAMP1_ROWNAMDETLIQ = 5;
  public static int PQSL_PARAMESTAMP1_ROWNAMDAPRDA = 6;
  public static int PQSL_PARAMESTAMP1_ROWNAMDAPRAL = 7;
  public static int PQSL_PARAMESTAMP1_ROWNAMFATCOD = 8;
  public static int PQSL_PARAMESTAMP1_ROWNAMCENCOD = 9;
  public static int PQSL_PARAMESTAMP1_ROWNAMDOCSPE = 10;
  public static int PQSL_PARAMESTAMP1_ROWNAMDOCENT = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI282 = 1815;
  public static int PQRY_PARAMETRI282_RS = 1816;
  public static int PQSL_PARAMETRI282_ROWNAMCODBEN = 0;
  public static int PQSL_PARAMETRI282_ROWNAMEDOCUM = 1;
  public static int PQSL_PARAMETRI282_ROWNAMNUDODA = 2;
  public static int PQSL_PARAMETRI282_ROWNAMNUMDOA = 3;
  public static int PQSL_PARAMETRI282_ROWNAMEQUIET = 4;
  public static int PQSL_PARAMETRI282_ROWNAMDATELA = 5;
  public static int PQSL_PARAMETRI282_ROWNAMANNDOC = 6;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM80 = 1817;
  public static int PQRY_PARAM80_RS = 1818;
  public static int PQSL_PARAM80_PARAMDOCUMEN = 0;
  public static int PQSL_PARAM80_PARAMTIPO = 1;
  public static int PQSL_PARAM80_PARAANNOPROT = 2;
  public static int PQSL_PARAM80_PARPERSCADAL = 3;
  public static int PQSL_PARAM80_PARAPERSCAAL = 4;
  public static int PQSL_PARAM80_PARAMCATEGOR = 5;
  public static int PQSL_PARAM80_PARADATAELAB = 6;

  // Table to contain panel selected row: Data Corrispettivi Dal
  //
  public static int PQRY_DATACORRIDAL = 1819;
  public static int PQRY_DATACORRIDAL_RS = 1820;
  public static int PQSL_DATACORRIDAL_ROWNAMDACODA = 0;
  public static int PQSL_DATACORRIDAL_ROWNAMDACOAL = 1;
  public static int PQSL_DATACORRIDAL_ROWNAMEBOLLA = 2;
  public static int PQSL_DATACORRIDAL_ROWNAMDATELA = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI128 = 1821;
  public static int PQRY_PARAMETRI128_RS = 1822;
  public static int PQSL_PARAMETRI128_ROWNAMCODSOG = 0;
  public static int PQSL_PARAMETRI128_ROWNAMEMOVIM = 1;
  public static int PQSL_PARAMETRI128_ROWNAMDATDAL = 2;
  public static int PQSL_PARAMETRI128_ROWNAMEDETTA = 3;
  public static int PQSL_PARAMETRI128_ROWNAMEDATAL = 4;
  public static int PQSL_PARAMETRI128_ROWNAMTIPMOV = 5;

  // Table to contain panel selected row: Documenti
  //
  public static int PQRY_DOCUMENTI = 1823;
  public static int PQRY_DOCUMENTI_RS = 1824;
  public static int PQSL_DOCUMENTI_ROWNAMEDOCUM = 0;
  public static int PQSL_DOCUMENTI_ROWNAMDAPRDA = 1;
  public static int PQSL_DOCUMENTI_ROWNAMDAPRAL = 2;
  public static int PQSL_DOCUMENTI_ROWNAMNUPRDA = 3;
  public static int PQSL_DOCUMENTI_ROWNAMEUFFIC = 4;
  public static int PQSL_DOCUMENTI_ROWNAMECATEG = 5;
  public static int PQSL_DOCUMENTI_ROWNAMSUPEUF = 6;
  public static int PQSL_DOCUMENTI_ROWNAMNUPRAL = 7;
  public static int PQSL_DOCUMENTI_ROWNAMETIPOL = 8;
  public static int PQSL_DOCUMENTI_ROWNAMDATELA = 9;
  public static int PQSL_DOCUMENTI_ROWNAMTIPPRO = 10;
  public static int PQSL_DOCUMENTI_ROWNAMCODSOG = 11;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI227 = 1825;
  public static int PQRY_PARAMETRI227_RS = 1826;
  public static int PQSL_PARAMETRI227_ROWNAMEDOCUM = 0;
  public static int PQSL_PARAMETRI227_ROWNAMDAPRAL = 1;
  public static int PQSL_PARAMETRI227_ROWNAMDAPRDA = 2;
  public static int PQSL_PARAMETRI227_ROWNAMNUPRDA = 3;
  public static int PQSL_PARAMETRI227_ROWNAMNUPRAL = 4;
  public static int PQSL_PARAMETRI227_ROWNAMEUFFIC = 5;
  public static int PQSL_PARAMETRI227_ROWNAMECATEG = 6;
  public static int PQSL_PARAMETRI227_ROWNAMSUPEUF = 7;
  public static int PQSL_PARAMETRI227_ROWNAMDATELA = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI250 = 1827;
  public static int PQRY_PARAMETRI250_RS = 1828;
  public static int PQSL_PARAMETRI250_ROWNAMEESERC = 0;
  public static int PQSL_PARAMETRI250_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMETRI250_ROWNAMEDATAD = 2;
  public static int PQSL_PARAMETRI250_ROWNAMEDATAA = 3;
  public static int PQSL_PARAMETRI250_ROWNAMENUMM1 = 4;
  public static int PQSL_PARAMETRI250_ROWNAMENUMMA = 5;
  public static int PQSL_PARAMETRI250_ROWNAMESOLOT = 6;
  public static int PQSL_PARAMETRI250_ROWNAMEDESCT = 7;
  public static int PQSL_PARAMETRI250_ROWNAMCODBEN = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI195 = 1829;
  public static int PQRY_PARAMETRI195_RS = 1830;
  public static int PQSL_PARAMETRI195_ROWNAMEESERC = 0;
  public static int PQSL_PARAMETRI195_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMETRI195_ROWNAMEDATAD = 2;
  public static int PQSL_PARAMETRI195_ROWNAMEDATAA = 3;
  public static int PQSL_PARAMETRI195_ROWNAMENUMM1 = 4;
  public static int PQSL_PARAMETRI195_ROWNAMENUMMA = 5;
  public static int PQSL_PARAMETRI195_ROWNAMESOLOT = 6;
  public static int PQSL_PARAMETRI195_ROWNAMEDESCT = 7;
  public static int PQSL_PARAMETRI195_ROWNAMCODUTE = 8;
  public static int PQSL_PARAMETRI195_ROWNAMNUMUTE = 9;
  public static int PQSL_PARAMETRI195_ROWNAMCODBEN = 10;
  public static int PQSL_PARAMETRI195_ROWNAMEBENEF = 11;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAMP4 = 1831;
  public static int PQRY_PARAMESTAMP4_RS = 1832;
  public static int PQSL_PARAMESTAMP4_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAMP4_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMESTAMP4_ROWNAMEDATDA = 2;
  public static int PQSL_PARAMESTAMP4_ROWNAMEDATAA = 3;
  public static int PQSL_PARAMESTAMP4_ROWNAMEDESCT = 4;
  public static int PQSL_PARAMESTAMP4_ROWNAMEUFFIC = 5;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAMP5 = 1833;
  public static int PQRY_PARAMESTAMP5_RS = 1834;
  public static int PQSL_PARAMESTAMP5_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAMP5_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMESTAMP5_ROWNAMEDATDA = 2;
  public static int PQSL_PARAMESTAMP5_ROWNAMEDATAA = 3;
  public static int PQSL_PARAMESTAMP5_ROWNAMEDESCT = 4;
  public static int PQSL_PARAMESTAMP5_ROWNAMCODUTE = 5;
  public static int PQSL_PARAMESTAMP5_ROWNAMNUMUTE = 6;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAMP6 = 1835;
  public static int PQRY_PARAMESTAMP6_RS = 1836;
  public static int PQSL_PARAMESTAMP6_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAMP6_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMESTAMP6_ROWNAMEDESCT = 2;
  public static int PQSL_PARAMESTAMP6_ROWNAMDATELA = 3;
  public static int PQSL_PARAMESTAMP6_ROWNAMEDELIB = 4;
  public static int PQSL_PARAMESTAMP6_ROWNAMNUMDEL = 5;
  public static int PQSL_PARAMESTAMP6_ROWNAMANNDEL = 6;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM10 = 1837;
  public static int PQRY_PARAMESTAM10_RS = 1838;
  public static int PQSL_PARAMESTAM10_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAM10_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMESTAM10_ROWNAMEDESCT = 2;
  public static int PQSL_PARAMESTAM10_ROWNAMDATELA = 3;
  public static int PQSL_PARAMESTAM10_ROWNAMECODIC = 4;
  public static int PQSL_PARAMESTAM10_ROWNAMRECOEN = 5;
  public static int PQSL_PARAMESTAM10_ROWNAMSOLEME = 6;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM15 = 1839;
  public static int PQRY_PARAMESTAM15_RS = 1840;
  public static int PQSL_PARAMESTAM15_ROWNAMEESERC = 0;
  public static int PQSL_PARAMESTAM15_ROWNAMTIPUTE = 1;
  public static int PQSL_PARAMESTAM15_ROWNAMEDESCT = 2;
  public static int PQSL_PARAMESTAM15_ROWNAMDATELA = 3;
  public static int PQSL_PARAMESTAM15_ROWNAMECODIC = 4;
  public static int PQSL_PARAMESTAM15_ROWNAMRECOEN = 5;
  public static int PQSL_PARAMESTAM15_ROWNAMESOLOE = 6;
  public static int PQSL_PARAMESTAM15_ROWNAMECAPIT = 7;
  public static int PQSL_PARAMESTAM15_ROWNAMEARTIC = 8;
  public static int PQSL_PARAMESTAM15_ROWNAMEANNOI = 9;
  public static int PQSL_PARAMESTAM15_ROWNAMENUMER = 10;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE30 = 1841;
  public static int PQRY_NEWTABLE30_RS = 1842;
  public static int PQSL_NEWTABLE30_ROWNAMNEWFIE = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM155 = 1843;
  public static int PQRY_PARAM155_RS = 1844;
  public static int PQSL_PARAM155_PARPERINCDAL = 0;
  public static int PQSL_PARAM155_PARAPERINCAL = 1;
  public static int PQSL_PARAM155_PARAMREGODAL = 2;
  public static int PQSL_PARAM155_PARAMREGOLAL = 3;
  public static int PQSL_PARAM155_TIPO_REGISTRO = 4;
  public static int PQSL_PARAM155_TIPO_BOLLATO = 5;

  // Table to contain panel selected row: ELENCO INCASSI FS4
  //
  public static int PQRY_ELENCINCAFS4 = 1845;
  public static int PQSL_ELENCINCAFS4_RECOREGIBOLL = 0;
  public static int PQSL_ELENCINCAFS4_RECOTIPOREGI = 1;
  public static int PQSL_ELENCINCAFS4_RECOTIPOBOLL = 2;
  public static int PQSL_ELENCINCAFS4_RECORNUMEDOC = 3;
  public static int PQSL_ELENCINCAFS4_RECORANNODOC = 4;
  public static int PQSL_ELENCINCAFS4_RECORDDATA = 5;
  public static int PQSL_ELENCINCAFS4_RECORDNUMERO = 6;
  public static int PQSL_ELENCINCAFS4_RECORDIMPORT = 7;
  public static int PQSL_ELENCINCAFS4_RECORNUMEORD = 8;
  public static int PQSL_ELENCINCAFS4_RECODATAORDI = 9;
  public static int PQSL_ELENCINCAFS4_RECORT04DESC = 10;
  public static int PQSL_ELENCINCAFS4_RECORDATADOC = 11;
  public static int PQSL_ELENCINCAFS4_RECFATANNPRO = 12;
  public static int PQSL_ELENCINCAFS4_RECFATNUMPRO = 13;
  public static int PQSL_ELENCINCAFS4_RECFATCODDOC = 14;
  public static int PQSL_ELENCINCAFS4_RECORDIMPOR1 = 15;
  public static int PQSL_ELENCINCAFS4_RECORDDEBITO = 16;
  public static int PQSL_ELENCINCAFS4_TIPO = 17;
  public static int PQSL_ELENCINCAFS4_RECORDINFO = 18;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI557 = 1846;
  public static int PQRY_PARAMETRI557_RS = 1847;
  public static int PQSL_PARAMETRI557_DATA_INCASSO = 0;
  public static int PQSL_PARAMETRI557_NUMERO_INCASSO = 1;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR6 = 1848;
  public static int PQRY_ORDINDACORR6_RS = 1849;
  public static int PQSL_ORDINDACORR6_ROWNAMEDESCR = 0;
  public static int PQSL_ORDINDACORR6_TIPO_REGISTRO = 1;
  public static int PQSL_ORDINDACORR6_TIPO_BOLLATO = 2;
  public static int PQSL_ORDINDACORR6_ROWNAMPEINDA = 3;
  public static int PQSL_ORDINDACORR6_ROWNAMPEINAL = 4;
  public static int PQSL_ORDINDACORR6_ROWNAMTIRECO = 5;
  public static int PQSL_ORDINDACORR6_ROWNAMTIBOCO = 6;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR7 = 1850;
  public static int PQRY_ORDINDACORR7_RS = 1851;
  public static int PQSL_ORDINDACORR7_ROWNAMEDATA = 0;
  public static int PQSL_ORDINDACORR7_ROWNAMEDESCR = 1;
  public static int PQSL_ORDINDACORR7_ROWNAMECAUSA = 2;
  public static int PQSL_ORDINDACORR7_ROWNAMEBOLLO = 3;
  public static int PQSL_ORDINDACORR7_ROWNAMEUFFIC = 4;
  public static int PQSL_ORDINDACORR7_RNEAVPMDSASC = 5;
  public static int PQSL_ORDINDACORR7_TIPO_REGISTRO = 6;
  public static int PQSL_ORDINDACORR7_TIPO_BOLLATO = 7;
  public static int PQSL_ORDINDACORR7_ROWNAMPEINDA = 8;
  public static int PQSL_ORDINDACORR7_ROWNAMPEINAL = 9;
  public static int PQSL_ORDINDACORR7_ROWNAMDEDAAC = 10;

  // Table to contain panel selected row: WORK EXPORT ID
  //
  public static int PQRY_WORKEXPORTI6 = 1852;
  public static int PQSL_WORKEXPORTI6_PROGRESSIVO = 0;
  public static int PQSL_WORKEXPORTI6_SESSIONE = 1;
  public static int PQSL_WORKEXPORTI6_FASE = 2;
  public static int PQSL_WORKEXPORTI6_FILE_DATI = 3;
  public static int PQSL_WORKEXPORTI6_DATAFLUSSO = 4;
  public static int PQSL_WORKEXPORTI6_NUMEROINCASS = 5;
  public static int PQSL_WORKEXPORTI6_DATAINCASSO = 6;
  public static int PQSL_WORKEXPORTI6_GESTIOINCASS = 7;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT17 = 1853;
  public static int PQSL_FAT17_CODICE = 0;
  public static int PQSL_FAT17_ANNO_DOC = 1;
  public static int PQSL_FAT17_NUMERO_DOC = 2;
  public static int PQSL_FAT17_IMPORTO = 3;
  public static int PQSL_FAT17_D_DATA_DOC = 4;
  public static int PQSL_FAT17_NUMERO_PROT = 5;
  public static int PQSL_FAT17_D_DATA_PROT = 6;
  public static int PQSL_FAT17_ANNO_PROG = 7;
  public static int PQSL_FAT17_NUMERO_PROG = 8;
  public static int PQSL_FAT17_D_SCADENZA = 9;
  public static int PQSL_FAT17_NUM_QUIETANZA = 10;
  public static int PQSL_FAT17_DESCRIZIONE = 11;
  public static int PQSL_FAT17_UFFICIO_INVIO = 12;
  public static int PQSL_FAT17_CATEGORIA = 13;
  public static int PQSL_FAT17_TIPO_PAGAMENTO = 14;
  public static int PQSL_FAT17_CODICE_DOC = 15;
  public static int PQSL_FAT17_STORNO = 16;
  public static int PQSL_FAT17_FATRAGIOSOCI = 17;
  public static int PQSL_FAT17_NOTE = 18;
  public static int PQSL_FAT17_ANNO_RIF = 19;
  public static int PQSL_FAT17_NUMERO_RIF = 20;
  public static int PQSL_FAT17_ANNO_PROT = 21;
  public static int PQSL_FAT17_DATA_PROT = 22;
  public static int PQSL_FAT17_DATA_DOC = 23;
  public static int PQSL_FAT17_DIFFERENZA_IVA = 24;
  public static int PQSL_FAT17_ACQUISTO_CEE = 25;
  public static int PQSL_FAT17_MONETA = 26;
  public static int PQSL_FAT17_ESCLUSIONE_ELE = 27;
  public static int PQSL_FAT17_SCADENZA = 28;
  public static int PQSL_FAT17_RIVENDITA = 29;
  public static int PQSL_FAT17_VARIAZIONI = 30;
  public static int PQSL_FAT17_IMPUTATO = 31;
  public static int PQSL_FAT17_BUONI = 32;
  public static int PQSL_FAT17_LIRE_EURO = 33;
  public static int PQSL_FAT17_IMPORTO_EURO = 34;
  public static int PQSL_FAT17_TIPO_UTENZA = 35;
  public static int PQSL_FAT17_CODICE_UTENZA = 36;
  public static int PQSL_FAT17_BLOCCO_PAGAMENTO = 37;
  public static int PQSL_FAT17_COD_IMP_ECO = 38;
  public static int PQSL_FAT17_ANNO_ORDINE = 39;
  public static int PQSL_FAT17_NUMERO_ORDINE = 40;
  public static int PQSL_FAT17_FLAG_IVA_ECO = 41;
  public static int PQSL_FAT17_FLAG_DA_FS4 = 42;
  public static int PQSL_FAT17_DATA_RIENTRO = 43;
  public static int PQSL_FAT17_NUM_UTENTE = 44;
  public static int PQSL_FAT17_ID_DOCUMENTALE = 45;
  public static int PQSL_FAT17_UTENTE_INSERIMENTO = 46;
  public static int PQSL_FAT17_DATA_INSERIMENTO = 47;
  public static int PQSL_FAT17_UTENTE_ULTIMO_AGG = 48;
  public static int PQSL_FAT17_DATA_ULTIMO_AGG = 49;
  public static int PQSL_FAT17_FATPROUNIORG = 50;
  public static int PQSL_FAT17_STATO = 51;
  public static int PQSL_FAT17_NOTE_SOSPENSIONE = 52;
  public static int PQSL_FAT17_PROGR_UO_COMPETENZA = 53;
  public static int PQSL_FAT17_BARCODE = 54;
  public static int PQSL_FAT17_FATDATAARRIV = 55;
  public static int PQSL_FAT17_FATNUMPROGEN = 56;
  public static int PQSL_FAT17_MULTISERVIZI = 57;
  public static int PQSL_FAT17_FATRAGSOCORD = 58;
  public static int PQSL_FAT17_FATNUMDOCORD = 59;
  public static int PQSL_FAT17_IMG_DOCUMENTALE = 60;
  public static int PQSL_FAT17_FATESISTALLE = 61;
  public static int PQSL_FAT17_FATTRATTAIVA = 62;
  public static int PQSL_FAT17_ATT = 63;
  public static int PQSL_FAT17_FATCHIOCCIOL = 64;
  public static int PQSL_FAT17_FATIDGDMFE = 65;
  public static int PQSL_FAT17_FATACCETDATA = 66;
  public static int PQSL_FAT17_FATACCETUTEN = 67;
  public static int PQSL_FAT17_FATSALDO = 68;
  public static int PQSL_FAT17_FATCIG = 69;
  public static int PQSL_FAT17_FATCUP = 70;
  public static int PQSL_FAT17_L = 71;
  public static int PQSL_FAT17_DOCDERIVATO = 72;
  public static int PQSL_FAT17_IDSDI = 73;
  public static int PQSL_FAT17_FATCODICEDOC = 74;
  public static int PQSL_FAT17_IDGDMENTRATA = 75;
  public static int PQSL_FAT17_INFOFCE = 76;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA13 = 1854;
  public static int PQRY_IVA13_RS = 1855;
  public static int PQSL_IVA13_PROGRESSIVO = 0;
  public static int PQSL_IVA13_CODICE_DOC = 1;
  public static int PQSL_IVA13_IMPONIBILE = 2;
  public static int PQSL_IVA13_ALIQUOTA = 3;
  public static int PQSL_IVA13_IVA = 4;
  public static int PQSL_IVA13_CODICE_ESENZIONE = 5;
  public static int PQSL_IVA13_IVA_INDED = 6;
  public static int PQSL_IVA13_IMPONIBILE_CEE = 7;
  public static int PQSL_IVA13_CODICE_STAT = 8;
  public static int PQSL_IVA13_ANNO_PROG = 9;
  public static int PQSL_IVA13_NUMERO_PROG = 10;
  public static int PQSL_IVA13_ROWNAMEINDIM = 11;
  public static int PQSL_IVA13_UTENTE_INSERIMENTO = 12;
  public static int PQSL_IVA13_DATA_INSERIMENTO = 13;
  public static int PQSL_IVA13_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_IVA13_DATA_ULTIMO_AGG = 15;
  public static int PQSL_IVA13_ROWNAMESTATO = 16;
  public static int PQSL_IVA13_ROWNAMERIGA = 17;
  public static int PQSL_IVA13_RECORRECVEND = 18;
  public static int PQSL_IVA13_RECRONATIRES = 19;
  public static int PQSL_IVA13_RECRONATIBOS = 20;
  public static int PQSL_IVA13_RECRONANURES = 21;
  public static int PQSL_IVA13_RECROWNATIRE = 22;
  public static int PQSL_IVA13_RECROWNAMSER = 23;
  public static int PQSL_IVA13_RECROWNANURE = 24;
  public static int PQSL_IVA13_RECRONADDARE = 25;
  public static int PQSL_IVA13_RERONADDARES = 26;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV10 = 1856;
  public static int QSL_CFASELINTV10_COUNT = 0;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO20 = 1857;
  public static int PQRY_FILTRO20_RS = 1858;
  public static int PQSL_FILTRO20_ROWNAMAPARDA = 0;
  public static int PQSL_FILTRO20_ROWNAMCODFOR = 1;
  public static int PQSL_FILTRO20_ROWNAMEORDIN = 2;
  public static int PQSL_FILTRO20_ROWNAMEPARTE = 3;
  public static int PQSL_FILTRO20_ROWNAMEAL = 4;
  public static int PQSL_FILTRO20_ROWNAMUNIORG = 5;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT11 = 1859;
  public static int PQSL_FAT11_CODICE = 0;
  public static int PQSL_FAT11_ANNO_DOC = 1;
  public static int PQSL_FAT11_NUMERO_DOC = 2;
  public static int PQSL_FAT11_IMPORTO = 3;
  public static int PQSL_FAT11_D_DATA_DOC = 4;
  public static int PQSL_FAT11_NUMERO_PROT = 5;
  public static int PQSL_FAT11_D_DATA_PROT = 6;
  public static int PQSL_FAT11_ANNO_PROG = 7;
  public static int PQSL_FAT11_NUMERO_PROG = 8;
  public static int PQSL_FAT11_D_SCADENZA = 9;
  public static int PQSL_FAT11_MOTIVAZIONE_SCADENZA = 10;
  public static int PQSL_FAT11_NUM_QUIETANZA = 11;
  public static int PQSL_FAT11_DESCRIZIONE = 12;
  public static int PQSL_FAT11_UFFICIO_INVIO = 13;
  public static int PQSL_FAT11_CATEGORIA = 14;
  public static int PQSL_FAT11_TIPO_PAGAMENTO = 15;
  public static int PQSL_FAT11_CODICE_DOC = 16;
  public static int PQSL_FAT11_STORNO = 17;
  public static int PQSL_FAT11_FATRAGIOSOCI = 18;
  public static int PQSL_FAT11_NOTE = 19;
  public static int PQSL_FAT11_ANNO_RIF = 20;
  public static int PQSL_FAT11_NUMERO_RIF = 21;
  public static int PQSL_FAT11_ANNO_PROT = 22;
  public static int PQSL_FAT11_DATA_PROT = 23;
  public static int PQSL_FAT11_DATA_DOC = 24;
  public static int PQSL_FAT11_DIFFERENZA_IVA = 25;
  public static int PQSL_FAT11_ACQUISTO_CEE = 26;
  public static int PQSL_FAT11_MONETA = 27;
  public static int PQSL_FAT11_ESCLUSIONE_ELE = 28;
  public static int PQSL_FAT11_RIVENDITA = 29;
  public static int PQSL_FAT11_LIRE_EURO = 30;
  public static int PQSL_FAT11_IMPORTO_EURO = 31;
  public static int PQSL_FAT11_TIPO_UTENZA = 32;
  public static int PQSL_FAT11_CODICE_UTENZA = 33;
  public static int PQSL_FAT11_BLOCCO_PAGAMENTO = 34;
  public static int PQSL_FAT11_COD_IMP_ECO = 35;
  public static int PQSL_FAT11_ANNO_ORDINE = 36;
  public static int PQSL_FAT11_NUMERO_ORDINE = 37;
  public static int PQSL_FAT11_FLAG_IVA_ECO = 38;
  public static int PQSL_FAT11_FLAG_DA_FS4 = 39;
  public static int PQSL_FAT11_DATA_RIENTRO = 40;
  public static int PQSL_FAT11_NUM_UTENTE = 41;
  public static int PQSL_FAT11_ID_DOCUMENTALE = 42;
  public static int PQSL_FAT11_UTENTE_INSERIMENTO = 43;
  public static int PQSL_FAT11_DATA_INSERIMENTO = 44;
  public static int PQSL_FAT11_UTENTE_ULTIMO_AGG = 45;
  public static int PQSL_FAT11_DATA_ULTIMO_AGG = 46;
  public static int PQSL_FAT11_PROGR_UNITA_ORGANIZZATIVA = 47;
  public static int PQSL_FAT11_STATO = 48;
  public static int PQSL_FAT11_NOTE_SOSPENSIONE = 49;
  public static int PQSL_FAT11_PROGR_UO_COMPETENZA = 50;
  public static int PQSL_FAT11_BARCODE = 51;
  public static int PQSL_FAT11_MULTISERVIZI = 52;
  public static int PQSL_FAT11_IMG_DOCUMENTALE = 53;
  public static int PQSL_FAT11_DATA_INIZIO_UT = 54;
  public static int PQSL_FAT11_DATA_FINE_UT = 55;
  public static int PQSL_FAT11_CONSUMI_UT = 56;
  public static int PQSL_FAT11_ANNO_DISTINTA_UT = 57;
  public static int PQSL_FAT11_NUMERO_DISTINTA_UT = 58;
  public static int PQSL_FAT11_DATA_DISTINTA_UT = 59;
  public static int PQSL_FAT11_ID_ALLEGATO = 60;
  public static int PQSL_FAT11_DATA_ARRIVO = 61;
  public static int PQSL_FAT11_NUM_PROT_GEN = 62;
  public static int PQSL_FAT11_CIG = 63;
  public static int PQSL_FAT11_CUP = 64;
  public static int PQSL_FAT11_FSE = 65;
  public static int PQSL_FAT11_ESISTE_ALLEGATO = 66;
  public static int PQSL_FAT11_TRATTAMENTO_IVA = 67;
  public static int PQSL_FAT11_ID_GDM_FE = 68;
  public static int PQSL_FAT11_ACCETTAZIONE_DATA = 69;
  public static int PQSL_FAT11_ACCETTAZIONE_UTENTE = 70;
  public static int PQSL_FAT11_DATA_ARRIVO_FE = 71;
  public static int PQSL_FAT11_ID_FE_DOCUMENTALE = 72;
  public static int PQSL_FAT11_TRATTAMENTO_LOG = 73;
  public static int PQSL_FAT11_TIPO_ACQUISTO = 74;
  public static int PQSL_FAT11_CAUSALE_SOSPENSIONE = 75;
  public static int PQSL_FAT11_SCADENZA_SOSPENSIONE = 76;
  public static int PQSL_FAT11_ALLEGATO = 77;
  public static int PQSL_FAT11_STATO_VALIDAZIONE = 78;
  public static int PQSL_FAT11_AVVISO_FORNITORE = 79;
  public static int PQSL_FAT11_UTENTE_ULTIMA_VALIDAZIONE = 80;
  public static int PQSL_FAT11_DATA_ULTIMA_VALIDAZIONE = 81;
  public static int PQSL_FAT11_DOC_NON_COMMERCIALE = 82;
  public static int PQSL_FAT11_INIZIO_SOSPENSIONE = 83;
  public static int PQSL_FAT11_CONTRIBUENTI_MINIMI = 84;
  public static int PQSL_FAT11_IMPORTO_RIMBORSI = 85;
  public static int PQSL_FAT11_IMPORTO_PRESTAZIONI = 86;

  // Table to contain panel selected row: IVA
  //
  public static int PQRY_IVA5 = 1860;
  public static int PQRY_IVA5_RS = 1861;
  public static int PQSL_IVA5_PROGRESSIVO = 0;
  public static int PQSL_IVA5_CODICE_DOC = 1;
  public static int PQSL_IVA5_IMPONIBILE = 2;
  public static int PQSL_IVA5_ALIQUOTA = 3;
  public static int PQSL_IVA5_IVA = 4;
  public static int PQSL_IVA5_CODICE_ESENZIONE = 5;
  public static int PQSL_IVA5_IVA_INDED = 6;
  public static int PQSL_IVA5_IMPONIBILE_CEE = 7;
  public static int PQSL_IVA5_CODICE_STAT = 8;
  public static int PQSL_IVA5_ANNO_PROG = 9;
  public static int PQSL_IVA5_NUMERO_PROG = 10;
  public static int PQSL_IVA5_ROWNAMEINDIM = 11;
  public static int PQSL_IVA5_UTENTE_INSERIMENTO = 12;
  public static int PQSL_IVA5_DATA_INSERIMENTO = 13;
  public static int PQSL_IVA5_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_IVA5_DATA_ULTIMO_AGG = 15;
  public static int PQSL_IVA5_ROWNAMESTATO = 16;
  public static int PQSL_IVA5_ROWNAMERIGA = 17;
  public static int PQSL_IVA5_ROWNAMIMPSEG = 18;
  public static int PQSL_IVA5_ROWNAMIVASEG = 19;
  public static int PQSL_IVA5_TIPO_REGISTRO_S = 20;
  public static int PQSL_IVA5_TIPO_REGISTRO_S_OLD = 21;
  public static int PQSL_IVA5_TIPO_BOLLATO_S = 22;
  public static int PQSL_IVA5_TIPO_BOLLATO_S_OLD = 23;
  public static int PQSL_IVA5_ANNO_REG_S = 24;
  public static int PQSL_IVA5_NUMERO_REG_S = 25;
  public static int PQSL_IVA5_D_DATA_REG_S = 26;
  public static int PQSL_IVA5_TIPO_REGISTRO = 27;
  public static int PQSL_IVA5_TIPO_REGISTRO_OLD = 28;
  public static int PQSL_IVA5_SERVIZIO = 29;
  public static int PQSL_IVA5_SERVIZIO_OLD = 30;
  public static int PQSL_IVA5_ANNO_REG = 31;
  public static int PQSL_IVA5_NUMERO_REG = 32;
  public static int PQSL_IVA5_D_DATA_REG = 33;
  public static int PQSL_IVA5_D_DATA_LIQ = 34;
  public static int PQSL_IVA5_TIPO_DOC = 35;
  public static int PQSL_IVA5_REC_VENDITE = 36;
  public static int PQSL_IVA5_IMPONIBILE_OLD = 37;
  public static int PQSL_IVA5_ALIQUOTA_OLD = 38;
  public static int PQSL_IVA5_CODICE_ESENZIONE_OLD = 39;

  // Table to contain panel selected row: RIT
  //
  public static int PQRY_RIT2 = 1862;
  public static int PQSL_RIT2_ANNO_PROG = 0;
  public static int PQSL_RIT2_NUMERO_PROG = 1;
  public static int PQSL_RIT2_RITENUTE = 2;
  public static int PQSL_RIT2_CODICE = 3;
  public static int PQSL_RIT2_CAUSALE_IRPEF = 4;
  public static int PQSL_RIT2_IMPONIBILE = 5;
  public static int PQSL_RIT2_ALIQUOTA = 6;
  public static int PQSL_RIT2_RITENUTE_ENPAM = 7;
  public static int PQSL_RIT2_IMPORTO_NON_SOG = 8;
  public static int PQSL_RIT2_RITENUTE_IRPEF = 9;
  public static int PQSL_RIT2_CODICE_SSN = 10;
  public static int PQSL_RIT2_ALIQ_SSN_CD = 11;
  public static int PQSL_RIT2_ALIQ_SSN_CE = 12;
  public static int PQSL_RIT2_IMPONIBILE_SSN = 13;
  public static int PQSL_RIT2_RITENUTE_SSN = 14;
  public static int PQSL_RIT2_RITENUTE_SSN_CE = 15;
  public static int PQSL_RIT2_CASSA = 16;
  public static int PQSL_RIT2_IMPONIBILE_INPS = 17;
  public static int PQSL_RIT2_ALIQUOTA_INPS = 18;
  public static int PQSL_RIT2_RITENUTE_INPS = 19;
  public static int PQSL_RIT2_RITENUTE_INPS_CE = 20;
  public static int PQSL_RIT2_ALIQUOTA_ADD = 21;
  public static int PQSL_RIT2_RITENUTE_ADD = 22;
  public static int PQSL_RIT2_RITENUTE_EURO = 23;
  public static int PQSL_RIT2_IMPONIBILE_EURO = 24;
  public static int PQSL_RIT2_IMPORTO_NON_SOG_EURO = 25;
  public static int PQSL_RIT2_RITENUTE_IRPEF_EURO = 26;
  public static int PQSL_RIT2_IMPONIBILE_SSN_EURO = 27;
  public static int PQSL_RIT2_RITENUTE_SSN_EURO = 28;
  public static int PQSL_RIT2_RITENUTE_SSN_CE_EURO = 29;
  public static int PQSL_RIT2_IMPONIBILE_INPS_EURO = 30;
  public static int PQSL_RIT2_RITENUTE_INPS_EURO = 31;
  public static int PQSL_RIT2_RITENUTE_INPS_CE_EURO = 32;
  public static int PQSL_RIT2_RITENUTE_ADD_EURO = 33;
  public static int PQSL_RIT2_RITENUTE_CASSE_PROF = 34;
  public static int PQSL_RIT2_RITENUTE_CASSE_PROF_EURO = 35;
  public static int PQSL_RIT2_ALIQUOTA_ADD_COM = 36;
  public static int PQSL_RIT2_RITENUTE_ADD_COM = 37;
  public static int PQSL_RIT2_RITENUTE_ADD_COM_EURO = 38;
  public static int PQSL_RIT2_CODICE_INAIL = 39;
  public static int PQSL_RIT2_ALIQUOTA_INAIL = 40;
  public static int PQSL_RIT2_IMPONIBILE_INAIL = 41;
  public static int PQSL_RIT2_RITENUTE_INAIL = 42;
  public static int PQSL_RIT2_RITENUTE_INAIL_CE = 43;
  public static int PQSL_RIT2_IMPONIBILE_INAIL_EURO = 44;
  public static int PQSL_RIT2_RITENUTE_INAIL_EURO = 45;
  public static int PQSL_RIT2_RITENUTE_INAIL_CE_EURO = 46;
  public static int PQSL_RIT2_UTENTE_INSERIMENTO = 47;
  public static int PQSL_RIT2_DATA_INSERIMENTO = 48;
  public static int PQSL_RIT2_UTENTE_ULTIMO_AGG = 49;
  public static int PQSL_RIT2_DATA_ULTIMO_AGG = 50;

  // Table to contain panel selected row: IMP ECO
  //
  public static int PQRY_IMPECO11 = 1863;
  public static int PQRY_IMPECO11_RS = 1864;
  public static int PQSL_IMPECO11_FATTORE = 0;
  public static int PQSL_IMPECO11_CENTRO = 1;
  public static int PQSL_IMPECO11_IMPORTO = 2;
  public static int PQSL_IMPECO11_COMPETENZA_DAL = 3;
  public static int PQSL_IMPECO11_COMPETENZA_AL = 4;
  public static int PQSL_IMPECO11_NO_IVA = 5;
  public static int PQSL_IMPECO11_PROGETTO_ID = 6;
  public static int PQSL_IMPECO11_IMPECONOTE = 7;
  public static int PQSL_IMPECO11_ANNO_PROG = 8;
  public static int PQSL_IMPECO11_NUMERO_PROG = 9;
  public static int PQSL_IMPECO11_ESERCIZIO = 10;
  public static int PQSL_IMPECO11_NOTE = 11;
  public static int PQSL_IMPECO11_PROGRESSIVO = 12;
  public static int PQSL_IMPECO11_IMPECOSTATO = 13;
  public static int PQSL_IMPECO11_ANNO_LIQ = 14;
  public static int PQSL_IMPECO11_NUMERO_LIQ = 15;
  public static int PQSL_IMPECO11_ANNO_PRE = 16;
  public static int PQSL_IMPECO11_NUMERO_PRE = 17;
  public static int PQSL_IMPECO11_ANNO_ACC = 18;
  public static int PQSL_IMPECO11_NUMERO_ACC = 19;
  public static int PQSL_IMPECO11_ANNO_IMP = 20;
  public static int PQSL_IMPECO11_NUMERO_IMP = 21;
  public static int PQSL_IMPECO11_ANNO_SUBIMP = 22;
  public static int PQSL_IMPECO11_NUMERO_SUBIMP = 23;
  public static int PQSL_IMPECO11_PROGRESSIVO_VARACC = 24;
  public static int PQSL_IMPECO11_PROGRESSIVO_VARIMP = 25;
  public static int PQSL_IMPECO11_PROGRESSIVO_VARSUB = 26;
  public static int PQSL_IMPECO11_IVA = 27;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV17 = 1865;
  public static int QSL_CFASELINTV17_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV88 = 1866;
  public static int QSL_CFASELINTV88_COUNT = 0;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV18 = 1867;
  public static int QSL_CFASELINTV18_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV79 = 1868;
  public static int QSL_CFASELINTV79_COUNT = 0;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV19 = 1869;
  public static int QSL_CFASELINTV19_COUNT = 0;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV20 = 1870;
  public static int QSL_CFASELINTV20_COUNT = 0;

  // Recordset for query: Fatture Buoni IMDB
  //
  public static int QRY_FATTBUONIMD7 = 1871;
  public static int QSL_FATTBUONIMD7_FATBUOIMANBU = 0;
  public static int QSL_FATTBUONIMD7_FATBUOIMNUBU = 1;
  public static int QSL_FATTBUONIMD7_FATBUOIMPRBU = 2;
  public static int QSL_FATTBUONIMD7_FATBUOIMDIMP = 3;
  public static int QSL_FATTBUONIMD7_FATBUOIMDLI1 = 4;
  public static int QSL_FATTBUONIMD7_FATBUOIMDARE = 5;
  public static int QSL_FATTBUONIMD7_FATBUOIMPRIM = 6;
  public static int QSL_FATTBUONIMD7_FATBUOIMUTIN = 7;
  public static int QSL_FATTBUONIMD7_FATBUOIMPRBO = 8;

  // Recordset for query: IMP ECO
  //
  public static int QRY_IMPECO8 = 1872;
  public static int QSL_IMPECO8_IMPECOESERCI = 0;
  public static int QSL_IMPECO8_IMPECOPROGRE = 1;
  public static int QSL_IMPECO8_IMPECOFATTOR = 2;
  public static int QSL_IMPECO8_IMPECOCENTRO = 3;
  public static int QSL_IMPECO8_IMPECOIMPORT = 4;
  public static int QSL_IMPECO8_IMPECOCOMDAL = 5;
  public static int QSL_IMPECO8_IMPECOCOMPAL = 6;
  public static int QSL_IMPECO8_IMPECONOTE = 7;
  public static int QSL_IMPECO8_IMPECONOIVA = 8;
  public static int QSL_IMPECO8_IMPECOPROGID = 9;
  public static int QSL_IMPECO8_IMPECOSTATO = 10;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV21 = 1873;
  public static int QSL_CFASELINTV21_COUNT = 0;

  // Recordset for query: IVA
  //
  public static int QRY_IVA3 = 1874;
  public static int QSL_IVA3_PROGRESSIVO = 0;
  public static int QSL_IVA3_ANNOPROG = 1;
  public static int QSL_IVA3_NUMEROPROG = 2;
  public static int QSL_IVA3_CODICEDOC = 3;
  public static int QSL_IVA3_IMPONIBILE = 4;
  public static int QSL_IVA3_IVA = 5;
  public static int QSL_IVA3_ALIQUOTA = 6;
  public static int QSL_IVA3_IVAINDED = 7;
  public static int QSL_IVA3_CODICEESENZI = 8;
  public static int QSL_IVA3_IMPONIBILCEE = 9;
  public static int QSL_IVA3_CODICESTAT = 10;
  public static int QSL_IVA3_UTENTEINSERI = 11;
  public static int QSL_IVA3_DATAINSERIME = 12;
  public static int QSL_IVA3_UTENTULTIAGG = 13;
  public static int QSL_IVA3_DATAULTIMAGG = 14;
  public static int QSL_IVA3_STATO = 15;
  public static int QSL_IVA3_TIPOREGISTRS = 16;
  public static int QSL_IVA3_TIPOBOLLATOS = 17;
  public static int QSL_IVA3_NUMEROREGS = 18;
  public static int QSL_IVA3_DDATAREGS = 19;
  public static int QSL_IVA3_TIPOREGISTRO = 20;
  public static int QSL_IVA3_SERVIZIO = 21;
  public static int QSL_IVA3_NUMEROREG = 22;
  public static int QSL_IVA3_DDATAREG = 23;
  public static int QSL_IVA3_DDATALIQ = 24;
  public static int QSL_IVA3_RECVENDITE = 25;

  // Recordset for query: IMP ECO
  //
  public static int QRY_IMPECO9 = 1875;
  public static int QSL_IMPECO9_IMPECOESERCI = 0;
  public static int QSL_IMPECO9_IMPECOPROGRE = 1;
  public static int QSL_IMPECO9_IMPECOFATTOR = 2;
  public static int QSL_IMPECO9_IMPECOCENTRO = 3;
  public static int QSL_IMPECO9_IMPECOIMPORT = 4;
  public static int QSL_IMPECO9_IMPECOCOMDAL = 5;
  public static int QSL_IMPECO9_IMPECOCOMPAL = 6;
  public static int QSL_IMPECO9_IMPECONOTE = 7;
  public static int QSL_IMPECO9_IMPECONOIVA = 8;
  public static int QSL_IMPECO9_IMPECOPROGID = 9;
  public static int QSL_IMPECO9_IMPECOSTATO = 10;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV22 = 1876;
  public static int QSL_CFASELINTV22_COUNT = 0;

  // Recordset for query: DETTAGLI BUONI
  //
  public static int QRY_DETTAGLBUON4 = 1877;
  public static int QSL_DETTAGLBUON4_ROWNAMANNBUO = 0;
  public static int QSL_DETTAGLBUON4_ROWNAMNUMBUO = 1;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTVA2 = 1878;
  public static int QSL_CFASELINTVA2_COUNT = 0;

  // Recordset for query: Fatture Buoni IMDB
  //
  public static int QRY_FATTBUONIMD8 = 1879;
  public static int QSL_FATTBUONIMD8_ROWNAMEFATTO = 0;
  public static int QSL_FATTBUONIMD8_ROWNAMECENTR = 1;
  public static int QSL_FATTBUONIMD8_ROWNAMCOMDAL = 2;
  public static int QSL_FATTBUONIMD8_ROWNAMECOMAL = 3;
  public static int QSL_FATTBUONIMD8_ROWNAMANNBUO = 4;
  public static int QSL_FATTBUONIMD8_ROWNAMNUMBUO = 5;
  public static int QSL_FATTBUONIMD8_ROWNAMPROBUO = 6;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV23 = 1880;
  public static int QSL_CFASELINTV23_SUNUVAFABII0 = 0;

  // Recordset for query: Cfaodid: Select into variables
  //
  public static int QRY_CFASELINTV24 = 1881;
  public static int QSL_CFASELINTV24_COUNT = 0;

}
