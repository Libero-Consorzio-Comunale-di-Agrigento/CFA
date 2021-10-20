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
public class IMDBDef6 extends Object
{
	// IMDB Constants
  // Definition of table: Rettifica Accertamento
  //
  public static int TBL_RETTIFACCERT = 1001;
  public static int FLD_RETTIFACCERT_ROWNAMEDAL = 0;
  public static int FLD_RETTIFACCERT_ROWNAMEAL = 1;
  public static int FLD_RETTIFACCERT_ROWNAMNUMACC = 2;
  public static int FLD_RETTIFACCERT_ROWNAMANNACC = 3;
  public static int FLD_RETTIFACCERT_ROWNAMECAP = 4;
  public static int FLD_RETTIFACCERT_ROWNAMEART = 5;

  // Definition of table: Ordinativi Da Ritenute
  //
  public static int TBL_ORDINDARITE3 = 1002;
  public static int FLD_ORDINDARITE3_ROWNAMEDAL = 0;
  public static int FLD_ORDINDARITE3_ROWNAMEAL = 1;
  public static int FLD_ORDINDARITE3_ROWNAMEDATA = 2;
  public static int FLD_ORDINDARITE3_ROWNAMECAUSA = 3;
  public static int FLD_ORDINDARITE3_ROWNAMEBOLLO = 4;
  public static int FLD_ORDINDARITE3_ROWNAMEUFFIC = 5;
  public static int FLD_ORDINDARITE3_RNEAVPMDSASC = 6;
  public static int FLD_ORDINDARITE3_RONAUNORPEBE = 7;
  public static int FLD_ORDINDARITE3_ROWNAMESPESE = 8;
  public static int FLD_ORDINDARITE3_ROWNAMECOMMI = 9;
  public static int FLD_ORDINDARITE3_ROWNAMEALLEG = 10;
  public static int FLD_ORDINDARITE3_ROWNAMINFTES = 11;
  public static int FLD_ORDINDARITE3_ROWNAMTIPRIT = 12;

  // Definition of table: Ordinativi Da Ritenute
  //
  public static int TBL_ORDINDARITEN = 1003;
  public static int FLD_ORDINDARITEN_ROWNAMEDAL = 0;
  public static int FLD_ORDINDARITEN_ROWNAMEAL = 1;
  public static int FLD_ORDINDARITEN_ROWNAMEDATA = 2;
  public static int FLD_ORDINDARITEN_ROWNAMECAUSA = 3;
  public static int FLD_ORDINDARITEN_ROWNAMEBOLLO = 4;
  public static int FLD_ORDINDARITEN_ROWNAMEUFFIC = 5;
  public static int FLD_ORDINDARITEN_RNEAVPMDSASC = 6;
  public static int FLD_ORDINDARITEN_RONAUNORPEBE = 7;
  public static int FLD_ORDINDARITEN_ROWNAMESPESE = 8;
  public static int FLD_ORDINDARITEN_ROWNAMECOMMI = 9;
  public static int FLD_ORDINDARITEN_ROWNAMEALLEG = 10;
  public static int FLD_ORDINDARITEN_ROWNAMINFTES = 11;
  public static int FLD_ORDINDARITEN_ROWNAMTIPRIT = 12;

  // Definition of table: Par
  //
  public static int TBL_PAR123 = 1004;
  public static int FLD_PAR123_NOMEOGGEFUNZ = 0;
  public static int FLD_PAR123_NOMOGGDETLIQ = 1;

  // Definition of table: IMDB
  //
  public static int TBL_IMDB = 1005;
  public static int FLD_IMDB_ANNO_ORD = 0;
  public static int FLD_IMDB_NUMERO_ORD = 1;
  public static int FLD_IMDB_ANNO_MAND_SP = 2;
  public static int FLD_IMDB_NUMERO_MAND_SP = 3;
  public static int FLD_IMDB_IMPORTO = 4;
  public static int FLD_IMDB_ANNO_LIQ = 5;
  public static int FLD_IMDB_NUMERO_LIQ = 6;
  public static int FLD_IMDB_NOMOGGIMPIVA = 7;
  public static int FLD_IMDB_NOMOGGANNPRO = 8;
  public static int FLD_IMDB_NOMEOGGENUME = 9;

  // Definition of table: Ordinativi Da Corrispettivi
  //
  public static int TBL_ORDINDACORR3 = 1006;
  public static int FLD_ORDINDACORR3_ROWNAMEBOLLA = 0;
  public static int FLD_ORDINDACORR3_ROWNAMEDAL = 1;
  public static int FLD_ORDINDACORR3_ROWNAMEAL = 2;
  public static int FLD_ORDINDACORR3_ROWNAMEDATA = 3;
  public static int FLD_ORDINDACORR3_ROWNAMECAUSA = 4;
  public static int FLD_ORDINDACORR3_ROWNAMEBOLLO = 5;
  public static int FLD_ORDINDACORR3_ROWNAMEUFFIC = 6;
  public static int FLD_ORDINDACORR3_ROWNAMESPESE = 7;
  public static int FLD_ORDINDACORR3_ROWNAMECOMMI = 8;
  public static int FLD_ORDINDACORR3_ROWNAMEALLEG = 9;
  public static int FLD_ORDINDACORR3_ROWNAMINFTES = 10;
  public static int FLD_ORDINDACORR3_RNEAVPMDSASC = 11;
  public static int FLD_ORDINDACORR3_ROWNAMIMPECO = 12;
  public static int FLD_ORDINDACORR3_ROWNAMEFATTO = 13;
  public static int FLD_ORDINDACORR3_ROWNAMCODDEB = 14;

  // Definition of table: Par
  //
  public static int TBL_PAR76 = 1007;
  public static int FLD_PAR76_ROWNAMDADODA = 0;
  public static int FLD_PAR76_ROWNAMEAL = 1;
  public static int FLD_PAR76_RONASODOGICO = 2;

  // Definition of table: Emissione Ordinativi
  //
  public static int TBL_EMISSIORDIN1 = 1008;
  public static int FLD_EMISSIORDIN1_ROWNAMERISOR = 0;
  public static int FLD_EMISSIORDIN1_ROWNAMECAPIT = 1;
  public static int FLD_EMISSIORDIN1_ROWNAMEARTIC = 2;
  public static int FLD_EMISSIORDIN1_ROWNAMNUMACC = 3;
  public static int FLD_EMISSIORDIN1_ROWNAMANNACC = 4;
  public static int FLD_EMISSIORDIN1_ROWNAMCODEDO = 5;
  public static int FLD_EMISSIORDIN1_ROWNAMEDATA = 6;
  public static int FLD_EMISSIORDIN1_RONADAINCCCP = 7;
  public static int FLD_EMISSIORDIN1_RONADAESCCCP = 8;
  public static int FLD_EMISSIORDIN1_ROWNAMEDESCR = 9;
  public static int FLD_EMISSIORDIN1_ROWNAMECAUSA = 10;
  public static int FLD_EMISSIORDIN1_ROWNAMEBOLLO = 11;
  public static int FLD_EMISSIORDIN1_ROWNAMEUFFIC = 12;
  public static int FLD_EMISSIORDIN1_ROWNAMECONTA = 13;
  public static int FLD_EMISSIORDIN1_ROWNAMDATCON = 14;
  public static int FLD_EMISSIORDIN1_ROWNAMESPESE = 15;
  public static int FLD_EMISSIORDIN1_ROWNAMEQUIET = 16;
  public static int FLD_EMISSIORDIN1_ROWNAMECOMMI = 17;
  public static int FLD_EMISSIORDIN1_ROWNAMEALLEG = 18;
  public static int FLD_EMISSIORDIN1_ROWNAMINFTES = 19;
  public static int FLD_EMISSIORDIN1_RNEAVPMDSASC = 20;
  public static int FLD_EMISSIORDIN1_ROWNAMIMPECO = 21;
  public static int FLD_EMISSIORDIN1_ROWNAMEFATTO = 22;
  public static int FLD_EMISSIORDIN1_ROWNAMCODEAC = 23;

  // Definition of table: Par
  //
  public static int TBL_PAR78 = 1009;
  public static int FLD_PAR78_ROWNAMDOCOAC = 0;
  public static int FLD_PAR78_ROWNAMEPERS = 1;
  public static int FLD_PAR78_ROWNAMTIPQUI = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR79 = 1010;
  public static int FLD_PAR79_ROWNAMNUMDIS = 0;
  public static int FLD_PAR79_ROWNAMANNDIS = 1;
  public static int FLD_PAR79_RONASOMODAIN = 2;
  public static int FLD_PAR79_ROWNAMPERDAL = 3;
  public static int FLD_PAR79_ROWNAMEAL = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI663 = 1011;
  public static int FLD_PARAMETRI663_PARAMESERCIZ = 0;

  // Definition of table: Ordinativi Da Corrispettivi
  //
  public static int TBL_ORDINDACORRI = 1012;
  public static int FLD_ORDINDACORRI_ROWNAMEBOLLA = 0;
  public static int FLD_ORDINDACORRI_ROWNAMEDAL = 1;
  public static int FLD_ORDINDACORRI_ROWNAMEAL = 2;
  public static int FLD_ORDINDACORRI_ROWNAMEDATA = 3;
  public static int FLD_ORDINDACORRI_ROWNAMECAUSA = 4;
  public static int FLD_ORDINDACORRI_ROWNAMEBOLLO = 5;
  public static int FLD_ORDINDACORRI_ROWNAMEUFFIC = 6;
  public static int FLD_ORDINDACORRI_ROWNAMESPESE = 7;
  public static int FLD_ORDINDACORRI_ROWNAMECOMMI = 8;
  public static int FLD_ORDINDACORRI_ROWNAMEALLEG = 9;
  public static int FLD_ORDINDACORRI_ROWNAMINFTES = 10;
  public static int FLD_ORDINDACORRI_RNEAVPMDSASC = 11;
  public static int FLD_ORDINDACORRI_ROWNAMIMPECO = 12;
  public static int FLD_ORDINDACORRI_ROWNAMEFATTO = 13;

  // Definition of table: Par
  //
  public static int TBL_PAR107 = 1013;
  public static int FLD_PAR107_ROWNAMANNDIS = 0;
  public static int FLD_PAR107_ROWNAMNUMDIS = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR54 = 1014;
  public static int FLD_PAR54_ROWNAMEDAL = 0;
  public static int FLD_PAR54_ROWNAMEAL = 1;
  public static int FLD_PAR54_ROWNAMECAPIT = 2;
  public static int FLD_PAR54_ROWNAMEARTIC = 3;
  public static int FLD_PAR54_ROWNAMEDETTA = 4;
  public static int FLD_PAR54_ROWNAMEVARIA = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR56 = 1015;
  public static int FLD_PAR56_ROWNAMEDAL = 0;
  public static int FLD_PAR56_ROWNAMEAL = 1;
  public static int FLD_PAR56_ROWNAMECAPIT = 2;
  public static int FLD_PAR56_ROWNAMEARTIC = 3;
  public static int FLD_PAR56_ROWNAMETITOL = 4;
  public static int FLD_PAR56_ROWNAMEORDIN = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE24 = 1016;
  public static int FLD_NEWTABLE24_ROWNAMEEMEAL = 0;
  public static int FLD_NEWTABLE24_ROWNAMNOINAL = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR58 = 1017;
  public static int FLD_PAR58_ROWNAMEDAL = 0;
  public static int FLD_PAR58_ROWNAMEAL = 1;
  public static int FLD_PAR58_ROWNAMECAPIT = 2;
  public static int FLD_PAR58_ROWNAMEARTIC = 3;
  public static int FLD_PAR58_ROWNAMNUMACC = 4;
  public static int FLD_PAR58_ROWNAMANNACC = 5;
  public static int FLD_PAR58_ROWNAMEPROTO = 6;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE26 = 1018;
  public static int FLD_NEWTABLE26_ROWNAMEDAL = 0;
  public static int FLD_NEWTABLE26_ROWNAMEAL = 1;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE50 = 1019;
  public static int FLD_NEWTABLE50_ROWNAMEDAL = 0;
  public static int FLD_NEWTABLE50_ROWNAMEAL = 1;
  public static int FLD_NEWTABLE50_ROWNAMEUFFIC = 2;
  public static int FLD_NEWTABLE50_ROWNAMDISNUM = 3;

  // Definition of table: Estrazione Imputazioni
  //
  public static int TBL_ESTRAZIMPUTA = 1020;
  public static int FLD_ESTRAZIMPUTA_ROWNAMDALIST = 0;
  public static int FLD_ESTRAZIMPUTA_ROWNAMEGRUPP = 1;
  public static int FLD_ESTRAZIMPUTA_ROWNAMEBOLLO = 2;
  public static int FLD_ESTRAZIMPUTA_ROWNAMCODDEB = 3;

  // Definition of table: Estratto C C P
  //
  public static int TBL_ESTRATTOCCP = 1021;
  public static int FLD_ESTRATTOCCP_ROWNAMEDAL = 0;
  public static int FLD_ESTRATTOCCP_ROWNAMEAL = 1;
  public static int FLD_ESTRATTOCCP_ROWNAMEDETTA = 2;
  public static int FLD_ESTRATTOCCP_ROWNAMPERCAU = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM181 = 1022;
  public static int FLD_PARAM181_ANNO_MAND_CO_COMP = 0;
  public static int FLD_PARAM181_NUMERO_MAND_CO_COMP = 1;
  public static int FLD_PARAM181_PIMPORTORDIN = 2;
  public static int FLD_PARAM181_PSOLAINFO = 3;

  // Definition of table: MAN ORD COMPENSAZIONE
  //
  public static int TBL_MAN_ORD_COMMUTAZIONE = 1023;
  public static int FLD_MAN_ORD_COMMUTAZIONE_PROGRESSIVO = 0;
  public static int FLD_MAN_ORD_COMMUTAZIONE_ANNO_MAND = 1;
  public static int FLD_MAN_ORD_COMMUTAZIONE_NUMERO_MAND = 2;
  public static int FLD_MAN_ORD_COMMUTAZIONE_ANNO_ORD = 3;
  public static int FLD_MAN_ORD_COMMUTAZIONE_NUMERO_ORD = 4;
  public static int FLD_MAN_ORD_COMMUTAZIONE_IMPORTO = 5;
  public static int FLD_MAN_ORD_COMMUTAZIONE_UTENTE_INSERIMENTO = 6;
  public static int FLD_MAN_ORD_COMMUTAZIONE_DATA_INSERIMENTO = 7;
  public static int FLD_MAN_ORD_COMMUTAZIONE_UTENTE_ULTIMO_AGG = 8;
  public static int FLD_MAN_ORD_COMMUTAZIONE_DATA_ULTIMO_AGG = 9;
  public static int FLD_MAN_ORD_COMMUTAZIONE_MANORDCOMSTA = 10;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI594 = 1024;
  public static int FLD_PARAMETRI594_PARAMANDREVE = 0;
  public static int FLD_PARAMETRI594_PARDATELADAL = 1;
  public static int FLD_PARAMETRI594_PARADATELAAL = 2;
  public static int FLD_PARAMETRI594_PARATIPOINVI = 3;
  public static int FLD_PARAMETRI594_PARASTATFLUS = 4;
  public static int FLD_PARAMETRI594_PARASTATDETT = 5;
  public static int FLD_PARAMETRI594_PARAMIDFLUSS = 6;
  public static int FLD_PARAMETRI594_PARAMAGGIORN = 7;
  public static int FLD_PARAMETRI594_PARAULTISTAT = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI596 = 1025;
  public static int FLD_PARAMETRI596_PARAMSCARICA = 0;
  public static int FLD_PARAMETRI596_PARAMELABORA = 1;
  public static int FLD_PARAMETRI596_PARDATFLUDAL = 2;
  public static int FLD_PARAMETRI596_PARADATFLUAL = 3;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA1 = 1026;
  public static int FLD_OLDVALFILTA1_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA1_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA1_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE2 = 1027;
  public static int FLD_FILTRITABLE2_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE2_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE2_ROWNAMDATVAR = 2;
  public static int FLD_FILTRITABLE2_ROWNAMDATMAN = 3;

  // Definition of table: IMDB Annulli
  //
  public static int TBL_IMDBANNULLI1 = 1028;
  public static int FLD_IMDBANNULLI1_PROGRESSIVO = 0;
  public static int FLD_IMDBANNULLI1_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBANNULLI1_IMPORTO = 2;
  public static int FLD_IMDBANNULLI1_DATA = 3;
  public static int FLD_IMDBANNULLI1_ANNO_MAND = 4;
  public static int FLD_IMDBANNULLI1_NUMERO_MAND = 5;
  public static int FLD_IMDBANNULLI1_VERSIONE = 6;
  public static int FLD_IMDBANNULLI1_PROGRESSIVO_TESO = 7;
  public static int FLD_IMDBANNULLI1_TIPO = 8;
  public static int FLD_IMDBANNULLI1_DATA_INVIO = 9;
  public static int FLD_IMDBANNULLI1_ROWNAMOLNUMA = 10;
  public static int FLD_IMDBANNULLI1_ROWNAMOLANMA = 11;
  public static int FLD_IMDBANNULLI1_ROWNAMOLPRTE = 12;
  public static int FLD_IMDBANNULLI1_ROWNAMOLDDAT = 13;
  public static int FLD_IMDBANNULLI1_ROWNAMNUOANN = 14;
  public static int FLD_IMDBANNULLI1_ROWNAMDATMOD = 15;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA2 = 1029;
  public static int FLD_OLDVALFILTA2_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA2_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA2_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE3 = 1030;
  public static int FLD_FILTRITABLE3_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE3_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE3_ROWNAMDATVAR = 2;
  public static int FLD_FILTRITABLE3_ROWNAMDATMAN = 3;

  // Definition of table: IMDB Variazione
  //
  public static int TBL_IMDBVARIAZI1 = 1031;
  public static int FLD_IMDBVARIAZI1_PROGRESSIVO = 0;
  public static int FLD_IMDBVARIAZI1_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBVARIAZI1_IMPORTO = 2;
  public static int FLD_IMDBVARIAZI1_DATA = 3;
  public static int FLD_IMDBVARIAZI1_ANNO_MAND = 4;
  public static int FLD_IMDBVARIAZI1_NUMERO_MAND = 5;
  public static int FLD_IMDBVARIAZI1_VERSIONE = 6;
  public static int FLD_IMDBVARIAZI1_PROGRESSIVO_TESO = 7;
  public static int FLD_IMDBVARIAZI1_TIPO = 8;
  public static int FLD_IMDBVARIAZI1_DATA_INVIO = 9;
  public static int FLD_IMDBVARIAZI1_ROWNAMOLNUMA = 10;
  public static int FLD_IMDBVARIAZI1_ROWNAMOLANMA = 11;
  public static int FLD_IMDBVARIAZI1_ROWNAMOLPRTE = 12;
  public static int FLD_IMDBVARIAZI1_ROWNAMOLDDAT = 13;
  public static int FLD_IMDBVARIAZI1_ROWNAMNUOVAR = 14;
  public static int FLD_IMDBVARIAZI1_ROWNAMEMODIF = 15;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA3 = 1032;
  public static int FLD_OLDVALFILTA3_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA3_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA3_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE4 = 1033;
  public static int FLD_FILTRITABLE4_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE4_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE4_ROWNAMDATSOS = 2;
  public static int FLD_FILTRITABLE4_ROWNAMDATMAN = 3;

  // Definition of table: IMDB Sostituzioni
  //
  public static int TBL_IMDBSOSTITU1 = 1034;
  public static int FLD_IMDBSOSTITU1_PROGRESSIVO = 0;
  public static int FLD_IMDBSOSTITU1_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBSOSTITU1_IMPORTO = 2;
  public static int FLD_IMDBSOSTITU1_NUMERO_MAND = 3;
  public static int FLD_IMDBSOSTITU1_ANNO_MAND = 4;
  public static int FLD_IMDBSOSTITU1_PROGRESSIVO_TESO = 5;
  public static int FLD_IMDBSOSTITU1_VERSIONE = 6;
  public static int FLD_IMDBSOSTITU1_TIPO = 7;
  public static int FLD_IMDBSOSTITU1_DATA = 8;
  public static int FLD_IMDBSOSTITU1_ANNO_MAND_SOST = 9;
  public static int FLD_IMDBSOSTITU1_NUMERO_MAND_SOST = 10;
  public static int FLD_IMDBSOSTITU1_PROGRESSIVO_TESO_SOST = 11;
  public static int FLD_IMDBSOSTITU1_ROWNAMOLNUMA = 12;
  public static int FLD_IMDBSOSTITU1_ROWNAMOLANMA = 13;
  public static int FLD_IMDBSOSTITU1_ROWNAMOLPRTE = 14;
  public static int FLD_IMDBSOSTITU1_ROWNAMOLDDAT = 15;
  public static int FLD_IMDBSOSTITU1_ROWNAMEMODIF = 16;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI59 = 1035;
  public static int FLD_PARAMETRI59_ROWNAMETIPO = 0;
  public static int FLD_PARAMETRI59_ROWNAMGESMAN = 1;
  public static int FLD_PARAMETRI59_ROWNAMGESSOS = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI313 = 1036;
  public static int FLD_PARAMETRI313_ROWNAMETIPO = 0;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA4 = 1037;
  public static int FLD_OLDVALFILTA4_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA4_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA4_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE5 = 1038;
  public static int FLD_FILTRITABLE5_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE5_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE5_ROWNAMDATVAR = 2;
  public static int FLD_FILTRITABLE5_ROWNAMDATORD = 3;

  // Definition of table: IMDB Annulli
  //
  public static int TBL_IMDBANNULLI = 1039;
  public static int FLD_IMDBANNULLI_PROGRESSIVO = 0;
  public static int FLD_IMDBANNULLI_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBANNULLI_IMPORTO = 2;
  public static int FLD_IMDBANNULLI_DATA = 3;
  public static int FLD_IMDBANNULLI_ANNO_MAND = 4;
  public static int FLD_IMDBANNULLI_NUMERO_MAND = 5;
  public static int FLD_IMDBANNULLI_VERSIONE = 6;
  public static int FLD_IMDBANNULLI_PROGRESSIVO_TESO = 7;
  public static int FLD_IMDBANNULLI_TIPO = 8;
  public static int FLD_IMDBANNULLI_DATA_INVIO = 9;
  public static int FLD_IMDBANNULLI_ROWNAMOLNUMA = 10;
  public static int FLD_IMDBANNULLI_ROWNAMOLANMA = 11;
  public static int FLD_IMDBANNULLI_ROWNAMOLPRTE = 12;
  public static int FLD_IMDBANNULLI_ROWNAMOLDDAT = 13;
  public static int FLD_IMDBANNULLI_ROWNAMNUOANN = 14;
  public static int FLD_IMDBANNULLI_ROWNAMDATMOD = 15;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA5 = 1040;
  public static int FLD_OLDVALFILTA5_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA5_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA5_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE9 = 1041;
  public static int FLD_FILTRITABLE9_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE9_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE9_ROWNAMDATVAR = 2;
  public static int FLD_FILTRITABLE9_ROWNAMDATORD = 3;

  // Definition of table: IMDB Variazione
  //
  public static int TBL_IMDBVARIAZIO = 1042;
  public static int FLD_IMDBVARIAZIO_PROGRESSIVO = 0;
  public static int FLD_IMDBVARIAZIO_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBVARIAZIO_IMPORTO = 2;
  public static int FLD_IMDBVARIAZIO_DATA = 3;
  public static int FLD_IMDBVARIAZIO_ANNO_MAND = 4;
  public static int FLD_IMDBVARIAZIO_NUMERO_MAND = 5;
  public static int FLD_IMDBVARIAZIO_VERSIONE = 6;
  public static int FLD_IMDBVARIAZIO_PROGRESSIVO_TESO = 7;
  public static int FLD_IMDBVARIAZIO_TIPO = 8;
  public static int FLD_IMDBVARIAZIO_DATA_INVIO = 9;
  public static int FLD_IMDBVARIAZIO_ROWNAMOLNUMA = 10;
  public static int FLD_IMDBVARIAZIO_ROWNAMOLANMA = 11;
  public static int FLD_IMDBVARIAZIO_ROWNAMOLPRTE = 12;
  public static int FLD_IMDBVARIAZIO_ROWNAMOLDDAT = 13;
  public static int FLD_IMDBVARIAZIO_ROWNAMNUOVAR = 14;
  public static int FLD_IMDBVARIAZIO_ROWNAMEMODIF = 15;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTA6 = 1043;
  public static int FLD_OLDVALFILTA6_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTA6_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTA6_DATA_MAND = 2;

  // Definition of table: Filtri Table
  //
  public static int TBL_FILTRITABLE = 1044;
  public static int FLD_FILTRITABLE_ANNO_MAND = 0;
  public static int FLD_FILTRITABLE_NUMERO_MAND = 1;
  public static int FLD_FILTRITABLE_ROWNAMDATVAR = 2;
  public static int FLD_FILTRITABLE_ROWNAMDATORD = 3;

  // Definition of table: IMDB Sostituzioni
  //
  public static int TBL_IMDBSOSTITUZ = 1045;
  public static int FLD_IMDBSOSTITUZ_PROGRESSIVO = 0;
  public static int FLD_IMDBSOSTITUZ_RAGIONE_SOCIALE = 1;
  public static int FLD_IMDBSOSTITUZ_IMPORTO = 2;
  public static int FLD_IMDBSOSTITUZ_NUMERO_MAND = 3;
  public static int FLD_IMDBSOSTITUZ_ANNO_MAND = 4;
  public static int FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO = 5;
  public static int FLD_IMDBSOSTITUZ_VERSIONE = 6;
  public static int FLD_IMDBSOSTITUZ_TIPO = 7;
  public static int FLD_IMDBSOSTITUZ_DATA = 8;
  public static int FLD_IMDBSOSTITUZ_ANNO_MAND_SOST = 9;
  public static int FLD_IMDBSOSTITUZ_NUMERO_MAND_SOST = 10;
  public static int FLD_IMDBSOSTITUZ_PROGRESSIVO_TESO_SOST = 11;
  public static int FLD_IMDBSOSTITUZ_ROWNAMOLNUMA = 12;
  public static int FLD_IMDBSOSTITUZ_ROWNAMOLANMA = 13;
  public static int FLD_IMDBSOSTITUZ_ROWNAMOLPRTE = 14;
  public static int FLD_IMDBSOSTITUZ_ROWNAMOLDDAT = 15;
  public static int FLD_IMDBSOSTITUZ_ROWNAMEMODIF = 16;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI68 = 1046;
  public static int FLD_PARAMETRI68_ROWNAMETIPO = 0;
  public static int FLD_PARAMETRI68_ROWNAMGESMAN = 1;
  public static int FLD_PARAMETRI68_ROWNAMGESSOS = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI320 = 1047;
  public static int FLD_PARAMETRI320_ROWNAMETIPO = 0;

  // Definition of table: Parametri Invio
  //
  public static int TBL_PARAMETINVIO = 1048;
  public static int FLD_PARAMETINVIO_ROWNAMEDAL = 0;
  public static int FLD_PARAMETINVIO_ROWNAMEAL = 1;
  public static int FLD_PARAMETINVIO_ROWNAMDISNUM = 2;
  public static int FLD_PARAMETINVIO_ROWNAMETIPO = 3;
  public static int FLD_PARAMETINVIO_ROWNAMDATRIS = 4;
  public static int FLD_PARAMETINVIO_ROWNAMEDALD = 5;
  public static int FLD_PARAMETINVIO_ROWNAMEALD = 6;
  public static int FLD_PARAMETINVIO_ROWNAMEMANDA = 7;
  public static int FLD_PARAMETINVIO_ROWNAMOLDTIP = 8;

  // Definition of table: Parametri Flusso
  //
  public static int TBL_PARAMEFLUSSO = 1049;
  public static int FLD_PARAMEFLUSSO_IDFLUSSO = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI599 = 1050;
  public static int FLD_PARAMETRI599_PARAMTIPO = 0;

  // Definition of table: Old Value Filtri Table
  //
  public static int TBL_OLDVALFILTAB = 1051;
  public static int FLD_OLDVALFILTAB_ANNO_MAND = 0;
  public static int FLD_OLDVALFILTAB_NUMERO_MAND = 1;
  public static int FLD_OLDVALFILTAB_DATA_MAND = 2;
  public static int FLD_OLDVALFILTAB_ROWNAMOLDAMA = 3;

  // Definition of table: IMDB Visualizzato
  //
  public static int TBL_IMDBVISUALIZ = 1052;
  public static int FLD_IMDBVISUALIZ_NUMERO_MAND = 0;
  public static int FLD_IMDBVISUALIZ_DATA_MAND = 1;
  public static int FLD_IMDBVISUALIZ_IMPORTO = 2;
  public static int FLD_IMDBVISUALIZ_NUMERO_ELENCO = 3;
  public static int FLD_IMDBVISUALIZ_DATA_ELENCO = 4;
  public static int FLD_IMDBVISUALIZ_CAPITOLO = 5;
  public static int FLD_IMDBVISUALIZ_ARTICOLO = 6;
  public static int FLD_IMDBVISUALIZ_ANNO_IMP = 7;
  public static int FLD_IMDBVISUALIZ_NUMERO_IMP = 8;
  public static int FLD_IMDBVISUALIZ_PAGATO = 9;

  // Definition of table: Parametri Tipo Eliminazione 1
  //
  public static int TBL_PARATIPOELI1 = 1053;
  public static int FLD_PARATIPOELI1_ROWNAMETIPO = 0;
  public static int FLD_PARATIPOELI1_ROWNAMEMANDA = 1;
  public static int FLD_PARATIPOELI1_ROWNAMEDAL = 2;
  public static int FLD_PARATIPOELI1_ROWNAMEAL = 3;
  public static int FLD_PARATIPOELI1_ROWNAMDISNUM = 4;
  public static int FLD_PARATIPOELI1_ROWNAMDATDIS = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI66 = 1054;
  public static int FLD_PARAMETRI66_RONASOSTDICO = 0;
  public static int FLD_PARAMETRI66_ROWNAMPEFIBL = 1;
  public static int FLD_PARAMETRI66_ROWNAMBLOINS = 2;
  public static int FLD_PARAMETRI66_ROWNAMETIPO = 3;
  public static int FLD_PARAMETRI66_ROWNAMEPROGR = 4;
  public static int FLD_PARAMETRI66_ROWNAMEFASE = 5;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE35 = 1055;
  public static int FLD_NEWTABLE35_ROWNAMECAPTI = 0;

  // Definition of table: New Table
  //
  public static int TBL_NEWTABLE = 1056;
  public static int FLD_NEWTABLE_ROWNAMECAPTI = 0;
  public static int FLD_NEWTABLE_ROWNAMEFASE = 1;
  public static int FLD_NEWTABLE_ROWNAMEDATA = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI84 = 1057;
  public static int FLD_PARAMETRI84_PARPERFILBLO = 0;
  public static int FLD_PARAMETRI84_PARABLOBINSE = 1;
  public static int FLD_PARAMETRI84_PARAMPROGRES = 2;
  public static int FLD_PARAMETRI84_PARAMFASE = 3;
  public static int FLD_PARAMETRI84_PARAMTIPO = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR75 = 1058;
  public static int FLD_PAR75_ROWNAMENTSPE = 0;
  public static int FLD_PAR75_ROWNAMDALIST = 1;
  public static int FLD_PAR75_ROWNAMEPATH = 2;
  public static int FLD_PAR75_ROWNAMEPERCO = 3;
  public static int FLD_PAR75_ROWNAMEBLOBI = 4;
  public static int FLD_PAR75_ROWNAMEPROGR = 5;
  public static int FLD_PAR75_ROWNAMTIPTRA = 6;

  // Definition of table: Param
  //
  public static int TBL_PARAM67 = 1059;
  public static int FLD_PARAM67_ROWNAMEESERC = 0;
  public static int FLD_PARAM67_ROWNAMEDABIL = 1;
  public static int FLD_PARAM67_ROWNAMESRIIV = 2;
  public static int FLD_PARAM67_ROWNAMESTFLE = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM70 = 1060;
  public static int FLD_PARAM70_ROWNAMEESERC = 0;
  public static int FLD_PARAM70_ROWNAMEDABIL = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM71 = 1061;
  public static int FLD_PARAM71_ROWNAMEESERC = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM97 = 1062;
  public static int FLD_PARAM97_ROWNAMEESERC = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI530 = 1063;
  public static int FLD_PARAMETRI530_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI530_ROWNAMTIPVAR = 1;
  public static int FLD_PARAMETRI530_ROWNAMEVARIA = 2;
  public static int FLD_PARAMETRI530_ROWNAMSEDDEL = 3;
  public static int FLD_PARAMETRI530_ROWNAMNUMDEL = 4;
  public static int FLD_PARAMETRI530_ROWNAMANNDEL = 5;
  public static int FLD_PARAMETRI530_ROWNAMUNIPRO = 6;
  public static int FLD_PARAMETRI530_ROWNAMNUMPRO = 7;
  public static int FLD_PARAMETRI530_ROWNAMANNPRO = 8;
  public static int FLD_PARAMETRI530_ROWNAMEESERC = 9;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI532 = 1064;
  public static int FLD_PARAMETRI532_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI532_ROWNAMTIPVAR = 1;
  public static int FLD_PARAMETRI532_ROWNAMEVARIA = 2;
  public static int FLD_PARAMETRI532_ROWNAMSEDDEL = 3;
  public static int FLD_PARAMETRI532_ROWNAMNUMDEL = 4;
  public static int FLD_PARAMETRI532_ROWNAMANNDEL = 5;
  public static int FLD_PARAMETRI532_ROWNAMUNIPRO = 6;
  public static int FLD_PARAMETRI532_ROWNAMNUMPRO = 7;
  public static int FLD_PARAMETRI532_ROWNAMANNPRO = 8;
  public static int FLD_PARAMETRI532_ROWNAMEESERC = 9;

  // Definition of table: Pars
  //
  public static int TBL_PARS90 = 1065;

  // Definition of table: Param
  //
  public static int TBL_PARAM188 = 1066;
  public static int FLD_PARAM188_NOMOGGENTSPE = 0;
  public static int FLD_PARAM188_NOMEOGGETUTT = 1;
  public static int FLD_PARAM188_NOMEOGGESUBI = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI213 = 1067;
  public static int FLD_PARAMETRI213_NOMOGGENTSPE = 0;
  public static int FLD_PARAMETRI213_NOMEOGGDADAT = 1;
  public static int FLD_PARAMETRI213_NOMEOGGEADAT = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI370 = 1068;
  public static int FLD_PARAMETRI370_PARAMACCEPER = 0;
  public static int FLD_PARAMETRI370_PARAMFUNZION = 1;
  public static int FLD_PARAMETRI370_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI370_PARASETTOPER = 3;
  public static int FLD_PARAMETRI370_PARASERVOPER = 4;
  public static int FLD_PARAMETRI370_PARACENDICOS = 5;
  public static int FLD_PARAMETRI370_PARAMUOSUDDI = 6;
  public static int FLD_PARAMETRI370_PARAMUOSOTTO = 7;
  public static int FLD_PARAMETRI370_PARAMTITOLO = 8;
  public static int FLD_PARAMETRI370_PARACATECAPI = 9;
  public static int FLD_PARAMETRI370_PARAMCAUSALE = 10;
  public static int FLD_PARAMETRI370_PARATIPOVINC = 11;
  public static int FLD_PARAMETRI370_PARAVINCSCAD = 12;
  public static int FLD_PARAMETRI370_PARAMPROGRAM = 13;
  public static int FLD_PARAMETRI370_PARAMPROGETT = 14;
  public static int FLD_PARAMETRI370_PARAMFLESSIB = 15;
  public static int FLD_PARAMETRI370_PARAMRESPONS = 16;
  public static int FLD_PARAMETRI370_PARAVOCEECON = 17;
  public static int FLD_PARAMETRI370_PARACODIGEST = 18;
  public static int FLD_PARAMETRI370_PARADETTRIEP = 19;
  public static int FLD_PARAMETRI370_PARARESICOMP = 20;
  public static int FLD_PARAMETRI370_PARASOLODISP = 21;
  public static int FLD_PARAMETRI370_PARADATAELAB = 22;
  public static int FLD_PARAMETRI370_PARAMOBIETTI = 23;
  public static int FLD_PARAMETRI370_PARAOBIESCAD = 24;
  public static int FLD_PARAMETRI370_PARAMVLIVELL = 25;
  public static int FLD_PARAMETRI370_PARAMCODEURO = 26;
  public static int FLD_PARAMETRI370_PARAMTITOLO1 = 27;
  public static int FLD_PARAMETRI370_PARAMTIPOLOG = 28;
  public static int FLD_PARAMETRI370_PARAMCATEGOR = 29;
  public static int FLD_PARAMETRI370_PARAMUOSUDD2 = 30;
  public static int FLD_PARAMETRI370_PARAEXPOEXCE = 31;
  public static int FLD_PARAMETRI370_PARAOBIEGEST = 32;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO20 = 1069;
  public static int FLD_PARAMETRIO20_ACCERTPEROLD = 0;
  public static int FLD_PARAMETRIO20_DETTARIEPOLD = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR30 = 1070;
  public static int FLD_PAR30_ROWNAMERESID = 0;
  public static int FLD_PAR30_ROWNAMDATELA = 1;
  public static int FLD_PAR30_ROWNAMCODDEB = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR32 = 1071;
  public static int FLD_PAR32_ROWNAMEESPOS = 0;
  public static int FLD_PAR32_ROWNAMEFATTO = 1;
  public static int FLD_PAR32_ROWNAMECENTR = 2;
  public static int FLD_PAR32_ROWNAMEDAL = 3;
  public static int FLD_PAR32_ROWNAMEAL = 4;
  public static int FLD_PAR32_ROWNAMERESID = 5;
  public static int FLD_PAR32_ROWNAMSORIEC = 6;

  // Definition of table: Par
  //
  public static int TBL_PAR44 = 1072;
  public static int FLD_PAR44_ROWNAMECAPIT = 0;
  public static int FLD_PAR44_ROWNAMEARTIC = 1;
  public static int FLD_PAR44_ROWNAMDETRIE = 2;
  public static int FLD_PAR44_ROWNAMRESCOM = 3;
  public static int FLD_PAR44_ROWNAMANNRES = 4;
  public static int FLD_PAR44_ROWNAMSOLDIS = 5;
  public static int FLD_PAR44_ROWNAMDATELA = 6;

  // Definition of table: Par Old
  //
  public static int TBL_PAROLD1 = 1073;
  public static int FLD_PAROLD1_DETTARIEPOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI365 = 1074;
  public static int FLD_PARAMETRI365_PARAMIMPEPER = 0;
  public static int FLD_PARAMETRI365_PARASETTOPER = 1;
  public static int FLD_PARAMETRI365_PARASERVOPER = 2;
  public static int FLD_PARAMETRI365_PARACENDICOS = 3;
  public static int FLD_PARAMETRI365_PARAMUOSUDDI = 4;
  public static int FLD_PARAMETRI365_PARAMUOSOTTO = 5;
  public static int FLD_PARAMETRI365_PARAMTITOLO = 6;
  public static int FLD_PARAMETRI365_PARAINTECAPI = 7;
  public static int FLD_PARAMETRI365_PARATIPDISPE = 8;
  public static int FLD_PARAMETRI365_PARAMCAUSALE = 9;
  public static int FLD_PARAMETRI365_PARATIPOVINC = 10;
  public static int FLD_PARAMETRI365_PARAVINCSCAD = 11;
  public static int FLD_PARAMETRI365_PARAMPROGRAM = 12;
  public static int FLD_PARAMETRI365_PARAOBIEOPER = 13;
  public static int FLD_PARAMETRI365_PARACONTSTRA = 14;
  public static int FLD_PARAMETRI365_PARAMFLESSIB = 15;
  public static int FLD_PARAMETRI365_PARAMRESPONS = 16;
  public static int FLD_PARAMETRI365_PARAVOCEECON = 17;
  public static int FLD_PARAMETRI365_PARACODIGEST = 18;
  public static int FLD_PARAMETRI365_PARADETTRIEP = 19;
  public static int FLD_PARAMETRI365_PARARESICOMP = 20;
  public static int FLD_PARAMETRI365_PARASOLOPREN = 21;
  public static int FLD_PARAMETRI365_PARASOLOPROV = 22;
  public static int FLD_PARAMETRI365_PARASOLODISP = 23;
  public static int FLD_PARAMETRI365_PARADATAELAB = 24;
  public static int FLD_PARAMETRI365_PARAMOBIETTI = 25;
  public static int FLD_PARAMETRI365_PARAOBIESCAD = 26;
  public static int FLD_PARAMETRI365_PARACOMUZONA = 27;
  public static int FLD_PARAMETRI365_PARAPROVZONA = 28;
  public static int FLD_PARAMETRI365_PARACODICOFO = 29;
  public static int FLD_PARAMETRI365_PARACODLIVE5 = 30;
  public static int FLD_PARAMETRI365_PARACODIEURO = 31;
  public static int FLD_PARAMETRI365_PARAMMISSION = 32;
  public static int FLD_PARAMETRI365_PARAPROGMISS = 33;
  public static int FLD_PARAMETRI365_PARAMCODLIV1 = 34;
  public static int FLD_PARAMETRI365_PARAMCODLIV2 = 35;
  public static int FLD_PARAMETRI365_PARAMUOSUDD2 = 36;
  public static int FLD_PARAMETRI365_PARAEXPINEXC = 37;
  public static int FLD_PARAMETRI365_PARAMDAL = 38;
  public static int FLD_PARAMETRI365_PARDATESEDEL = 39;
  public static int FLD_PARAMETRI365_PARAOBIEGEST = 40;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO18 = 1075;
  public static int FLD_PARAMETRIO18_IMPEGNPEROLD = 0;
  public static int FLD_PARAMETRIO18_DETTARIEPOLD = 1;

  // Definition of table: Subimpegni Per Beneficiario
  //
  public static int TBL_SUBIMPERBENE = 1076;
  public static int FLD_SUBIMPERBENE_ROWNAMERESID = 0;
  public static int FLD_SUBIMPERBENE_ROWNAMDATELA = 1;
  public static int FLD_SUBIMPERBENE_ROWNAMCODBEN = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR104 = 1077;
  public static int FLD_PAR104_ROWNAMEESPOS = 0;
  public static int FLD_PAR104_ROWNAMEFATTO = 1;
  public static int FLD_PAR104_ROWNAMECENTR = 2;
  public static int FLD_PAR104_ROWNAMEDAL = 3;
  public static int FLD_PAR104_ROWNAMEAL = 4;
  public static int FLD_PAR104_ROWNAMECOMPT = 5;
  public static int FLD_PAR104_ROWNAMGESECO = 6;
  public static int FLD_PAR104_ROWNAMSORIEC = 7;

  // Definition of table: Par
  //
  public static int TBL_PAR = 1078;
  public static int FLD_PAR_ROWNAMECAPIT = 0;
  public static int FLD_PAR_ROWNAMEARTIC = 1;
  public static int FLD_PAR_ROWNAMDETRIE = 2;
  public static int FLD_PAR_ROWNAMSOLPRE = 3;
  public static int FLD_PAR_ROWNAMSOLPRO = 4;
  public static int FLD_PAR_ROWNAMSOLDIS = 5;
  public static int FLD_PAR_ROWNAMANNRES = 6;
  public static int FLD_PAR_ROWNAMDATELA = 7;
  public static int FLD_PAR_ROWNAMRESCOM = 8;

  // Definition of table: Par Old
  //
  public static int TBL_PAROLD = 1079;
  public static int FLD_PAROLD_DETTARIEPOLD = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI368 = 1080;
  public static int FLD_PARAMETRI368_PARSUBIMPPER = 0;
  public static int FLD_PARAMETRI368_PARASETTOPER = 1;
  public static int FLD_PARAMETRI368_PARASERVOPER = 2;
  public static int FLD_PARAMETRI368_PARACENDICOS = 3;
  public static int FLD_PARAMETRI368_PARAMUOSUDDI = 4;
  public static int FLD_PARAMETRI368_PARAMUOSOTTO = 5;
  public static int FLD_PARAMETRI368_PARAMTITOLO = 6;
  public static int FLD_PARAMETRI368_PARAINTECAPI = 7;
  public static int FLD_PARAMETRI368_PARATIPDISPE = 8;
  public static int FLD_PARAMETRI368_PARAMCAUSALE = 9;
  public static int FLD_PARAMETRI368_PARATIPOVINC = 10;
  public static int FLD_PARAMETRI368_PARAVINCSCAD = 11;
  public static int FLD_PARAMETRI368_PARAMPROGRAM = 12;
  public static int FLD_PARAMETRI368_PARAMPROGETT = 13;
  public static int FLD_PARAMETRI368_PARACONTSTRA = 14;
  public static int FLD_PARAMETRI368_PARAMFLESSIB = 15;
  public static int FLD_PARAMETRI368_PARAMRESPONS = 16;
  public static int FLD_PARAMETRI368_PARAVOCEECON = 17;
  public static int FLD_PARAMETRI368_PARACODIGEST = 18;
  public static int FLD_PARAMETRI368_PARADETTRIEP = 19;
  public static int FLD_PARAMETRI368_PARARESICOMP = 20;
  public static int FLD_PARAMETRI368_PARASOLOPROV = 21;
  public static int FLD_PARAMETRI368_PARASOLOPRE1 = 22;
  public static int FLD_PARAMETRI368_PARASOLODISP = 23;
  public static int FLD_PARAMETRI368_PARADATAELAB = 24;
  public static int FLD_PARAMETRI368_PARAMOBIETTI = 25;
  public static int FLD_PARAMETRI368_PARAOBIESCAD = 26;
  public static int FLD_PARAMETRI368_PARACOMUZONA = 27;
  public static int FLD_PARAMETRI368_PARAPROVZONA = 28;
  public static int FLD_PARAMETRI368_PARASOLOPREN = 29;
  public static int FLD_PARAMETRI368_PARACODICOFO = 30;
  public static int FLD_PARAMETRI368_PARACODLIVE5 = 31;
  public static int FLD_PARAMETRI368_PARACODIEURO = 32;
  public static int FLD_PARAMETRI368_PARAMMISSION = 33;
  public static int FLD_PARAMETRI368_PARAPROGMISS = 34;
  public static int FLD_PARAMETRI368_PARAMCODLIV1 = 35;
  public static int FLD_PARAMETRI368_PARAMCODLIV2 = 36;
  public static int FLD_PARAMETRI368_PARAMUOSUDD2 = 37;
  public static int FLD_PARAMETRI368_PARAEXPINEXC = 38;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO23 = 1081;
  public static int FLD_PARAMETRIO23_SUBIMPPEROLD = 0;

  // Definition of table: Subimpegni Per Beneficiario
  //
  public static int TBL_SUBIMPERBEN3 = 1082;
  public static int FLD_SUBIMPERBEN3_ROWNAMERESID = 0;
  public static int FLD_SUBIMPERBEN3_ROWNAMDATELA = 1;
  public static int FLD_SUBIMPERBEN3_ROWNAMCODBEN = 2;

  // Definition of table: Par
  //
  public static int TBL_PAR46 = 1083;
  public static int FLD_PAR46_ROWNAMEESPOS = 0;
  public static int FLD_PAR46_ROWNAMEFATTO = 1;
  public static int FLD_PAR46_ROWNAMECENTR = 2;
  public static int FLD_PAR46_ROWNAMEDAL = 3;
  public static int FLD_PAR46_ROWNAMEAL = 4;
  public static int FLD_PAR46_ROWNAMECOMPT = 5;
  public static int FLD_PAR46_ROWNAMGESECO = 6;
  public static int FLD_PAR46_ROWNAMSORIEC = 7;

  // Definition of table: Subimpegni Per Voce P E G
  //
  public static int TBL_SUBPERVOCPE3 = 1084;
  public static int FLD_SUBPERVOCPE3_ROWNAMECAPIT = 0;
  public static int FLD_SUBPERVOCPE3_ROWNAMEARTIC = 1;
  public static int FLD_SUBPERVOCPE3_ROWNAMANNRES = 2;
  public static int FLD_SUBPERVOCPE3_ROWNAMDATELA = 3;
  public static int FLD_SUBPERVOCPE3_ROWNAMSOLPRO = 4;
  public static int FLD_SUBPERVOCPE3_ROWNAMSOLDIS = 5;
  public static int FLD_SUBPERVOCPE3_ROWNAMECOMPE = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI372 = 1085;
  public static int FLD_PARAMETRI372_PARAMLIQUPER = 0;
  public static int FLD_PARAMETRI372_PARAMFUNZION = 1;
  public static int FLD_PARAMETRI372_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI372_PARASETTOPER = 3;
  public static int FLD_PARAMETRI372_PARASERVOPER = 4;
  public static int FLD_PARAMETRI372_PARACENDICOS = 5;
  public static int FLD_PARAMETRI372_PARAMUOSUDDI = 6;
  public static int FLD_PARAMETRI372_PARAMUOSOTTO = 7;
  public static int FLD_PARAMETRI372_PARAMTITOLO = 8;
  public static int FLD_PARAMETRI372_PARAINTECAPI = 9;
  public static int FLD_PARAMETRI372_PARATIPDISPE = 10;
  public static int FLD_PARAMETRI372_PARAMCAUSALE = 11;
  public static int FLD_PARAMETRI372_PARATIPOVINC = 12;
  public static int FLD_PARAMETRI372_PARAVINCSCAD = 13;
  public static int FLD_PARAMETRI372_PARAMPROGRAM = 14;
  public static int FLD_PARAMETRI372_PARAMPROGETT = 15;
  public static int FLD_PARAMETRI372_PARACONTSTRA = 16;
  public static int FLD_PARAMETRI372_PARAMRESPONS = 17;
  public static int FLD_PARAMETRI372_PARAVOCEECON = 18;
  public static int FLD_PARAMETRI372_PARACODIGEST = 19;
  public static int FLD_PARAMETRI372_PARADETTRIEP = 20;
  public static int FLD_PARAMETRI372_PARARESICOMP = 21;
  public static int FLD_PARAMETRI372_PARASOLOPREN = 22;
  public static int FLD_PARAMETRI372_PARASOLOEMES = 23;
  public static int FLD_PARAMETRI372_PARASOLODISP = 24;
  public static int FLD_PARAMETRI372_PARADATAELAB = 25;
  public static int FLD_PARAMETRI372_PARAMVLIVELL = 26;
  public static int FLD_PARAMETRI372_PARAMCODEURO = 27;
  public static int FLD_PARAMETRI372_PARACODICOFO = 28;
  public static int FLD_PARAMETRI372_PARAMMISSION = 29;
  public static int FLD_PARAMETRI372_PARAPROGMISS = 30;
  public static int FLD_PARAMETRI372_PARAMCODLIV1 = 31;
  public static int FLD_PARAMETRI372_PARAMCODLIV2 = 32;
  public static int FLD_PARAMETRI372_PARAEXPINEXC = 33;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO21 = 1086;
  public static int FLD_PARAMETRIO21_LIQUIDPEROLD = 0;
  public static int FLD_PARAMETRIO21_DETTARIEPOLD = 1;

  // Definition of table: Liquidazioni Per Beneficiario
  //
  public static int TBL_LIQUIPERBENE = 1087;
  public static int FLD_LIQUIPERBENE_ROWNAMECOM = 0;
  public static int FLD_LIQUIPERBENE_ROWNAMSOLEME = 1;
  public static int FLD_LIQUIPERBENE_ROWNAMEORDIN = 2;
  public static int FLD_LIQUIPERBENE_ROWNAMDATELA = 3;
  public static int FLD_LIQUIPERBENE_ROWNAMCODBEN = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR48 = 1088;
  public static int FLD_PAR48_ROWNAMENUMER = 0;
  public static int FLD_PAR48_ROWNAMEDATA = 1;
  public static int FLD_PAR48_ROWNAMECOMP = 2;
  public static int FLD_PAR48_ROWNAMDATELA = 3;
  public static int FLD_PAR48_ROWNAMSOLEME = 4;

  // Definition of table: Impegni Per Voce P E G
  //
  public static int TBL_IMPPERVOCPEG = 1089;
  public static int FLD_IMPPERVOCPEG_ROWNAMECAPIT = 0;
  public static int FLD_IMPPERVOCPEG_ROWNAMEARTIC = 1;
  public static int FLD_IMPPERVOCPEG_ROWNAMDATELA = 2;
  public static int FLD_IMPPERVOCPEG_ROWNAMSOLEME = 3;
  public static int FLD_IMPPERVOCPEG_ROWNAMECOMPE = 4;
  public static int FLD_IMPPERVOCPEG_ROWNAMNUMIMP = 5;
  public static int FLD_IMPPERVOCPEG_ROWNAMANNIMP = 6;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO24 = 1090;
  public static int FLD_PARAMETRIO24_OLDCAPITOLO = 0;
  public static int FLD_PARAMETRIO24_OLDARTICOLO = 1;

  // Definition of table: Subimpegni Per Voce P E G
  //
  public static int TBL_SUBPERVOCPEG = 1091;
  public static int FLD_SUBPERVOCPEG_ROWNAMECAPIT = 0;
  public static int FLD_SUBPERVOCPEG_ROWNAMEARTIC = 1;
  public static int FLD_SUBPERVOCPEG_ROWNAMDATELA = 2;
  public static int FLD_SUBPERVOCPEG_ROWNAMSOLEME = 3;
  public static int FLD_SUBPERVOCPEG_ROWNAMECOMPE = 4;
  public static int FLD_SUBPERVOCPEG_ROWNAMNUMSUB = 5;
  public static int FLD_SUBPERVOCPEG_ROWNAMANNSUB = 6;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO25 = 1092;
  public static int FLD_PARAMETRIO25_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIO25_ARTICOLOOLD = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR50 = 1093;
  public static int FLD_PAR50_ROWNAMEESPOS = 0;
  public static int FLD_PAR50_ROWNAMEFATTO = 1;
  public static int FLD_PAR50_ROWNAMECENTR = 2;
  public static int FLD_PAR50_ROWNAMEDAL = 3;
  public static int FLD_PAR50_ROWNAMEAL = 4;
  public static int FLD_PAR50_ROWNAMEORDIN = 5;
  public static int FLD_PAR50_ROWNAMGESECO = 6;
  public static int FLD_PAR50_ROWNAMETIPO = 7;
  public static int FLD_PAR50_ROWNAMUNIPRO = 8;
  public static int FLD_PAR50_ROWNAMNUMPRO = 9;
  public static int FLD_PAR50_ROWNAMANNPRO = 10;
  public static int FLD_PAR50_ROWNAMSEDDEL = 11;
  public static int FLD_PAR50_ROWNAMNUMDEL = 12;
  public static int FLD_PAR50_ROWNAMANNDEL = 13;
  public static int FLD_PAR50_ROWNAMDALECO = 14;
  public static int FLD_PAR50_ROWNAMEALECO = 15;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI374 = 1094;
  public static int FLD_PARAMETRI374_PARAMORDIPER = 0;
  public static int FLD_PARAMETRI374_PARAMFUNZION = 1;
  public static int FLD_PARAMETRI374_PARAMSERVIZI = 2;
  public static int FLD_PARAMETRI374_PARASETTOPER = 3;
  public static int FLD_PARAMETRI374_PARASERVOPER = 4;
  public static int FLD_PARAMETRI374_PARACENDICOS = 5;
  public static int FLD_PARAMETRI374_PARAMUOSUDDI = 6;
  public static int FLD_PARAMETRI374_PARAMUOSOTTO = 7;
  public static int FLD_PARAMETRI374_PARAMTITOLO = 8;
  public static int FLD_PARAMETRI374_PARACATECAPI = 9;
  public static int FLD_PARAMETRI374_PARAMCAUSALE = 10;
  public static int FLD_PARAMETRI374_PARATIPOVINC = 11;
  public static int FLD_PARAMETRI374_PARAVINCSCAD = 12;
  public static int FLD_PARAMETRI374_PARAMPROGRAM = 13;
  public static int FLD_PARAMETRI374_PARAMPROGETT = 14;
  public static int FLD_PARAMETRI374_PARAMRESPONS = 15;
  public static int FLD_PARAMETRI374_PARAVOCEECON = 16;
  public static int FLD_PARAMETRI374_PARACODIGEST = 17;
  public static int FLD_PARAMETRI374_PARADETTRIEP = 18;
  public static int FLD_PARAMETRI374_PARARESICOMP = 19;
  public static int FLD_PARAMETRI374_PARADATAELAB = 20;
  public static int FLD_PARAMETRI374_PARAMVLIVELL = 21;
  public static int FLD_PARAMETRI374_PARAMCODEURO = 22;
  public static int FLD_PARAMETRI374_PARAMTITOLO1 = 23;
  public static int FLD_PARAMETRI374_PARAMTIPOLOG = 24;
  public static int FLD_PARAMETRI374_PARAMCATEGOR = 25;
  public static int FLD_PARAMETRI374_PARAEXPINEXC = 26;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIO22 = 1095;
  public static int FLD_PARAMETRIO22_ORDINAPEROLD = 0;
  public static int FLD_PARAMETRIO22_DETTARIEPOLD = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR36 = 1096;
  public static int FLD_PAR36_ROWNAMERESID = 0;
  public static int FLD_PAR36_ROWNAMDATELA = 1;
  public static int FLD_PAR36_ROWNAMCODDEB = 2;
  public static int FLD_PAR36_ROWNAMEXINEX = 3;

  // Definition of table: Par
  //
  public static int TBL_PAR38 = 1097;
  public static int FLD_PAR38_ROWNAMENUMER = 0;
  public static int FLD_PAR38_ROWNAMEDATA = 1;
  public static int FLD_PAR38_ROWNAMECOMP = 2;
  public static int FLD_PAR38_ROWNAMDATELA = 3;

  // Definition of table: Par
  //
  public static int TBL_PAR40 = 1098;
  public static int FLD_PAR40_ROWNAMECAPIT = 0;
  public static int FLD_PAR40_ROWNAMEARTIC = 1;
  public static int FLD_PAR40_ROWNAMECOMP = 2;
  public static int FLD_PAR40_ROWNAMNUMACC = 3;
  public static int FLD_PAR40_ROWNAMANNACC = 4;
  public static int FLD_PAR40_ROWNAMEDAL = 5;
  public static int FLD_PAR40_ROWNAMEAL = 6;

  // Definition of table: Par Old
  //
  public static int TBL_PAROLD2 = 1099;
  public static int FLD_PAROLD2_CAPITOLOOLD = 0;
  public static int FLD_PAROLD2_ARTICOLOOLD = 1;

  // Definition of table: Par
  //
  public static int TBL_PAR42 = 1100;
  public static int FLD_PAR42_ROWNAMEESPOS = 0;
  public static int FLD_PAR42_ROWNAMEFATTO = 1;
  public static int FLD_PAR42_ROWNAMECENTR = 2;
  public static int FLD_PAR42_ROWNAMEDAL = 3;
  public static int FLD_PAR42_ROWNAMEAL = 4;
  public static int FLD_PAR42_ROWNAMEORDIN = 5;
  public static int FLD_PAR42_ROWNAMGESECO = 6;

  // Definition of table: Paramentri
  //
  public static int TBL_PARAMENTRI3 = 1101;
  public static int FLD_PARAMENTRI3_ROWNAMEANTIC = 0;
  public static int FLD_PARAMENTRI3_ROWNAMEAL = 1;

  // Definition of table: Dati In Pannello
  //
  public static int TBL_DATIINPANNEL = 1102;
  public static int FLD_DATIINPANNEL_ROWNAMMAEMCO = 0;
  public static int FLD_DATIINPANNEL_ROWNAMMAEMRE = 1;
  public static int FLD_DATIINPANNEL_ROWNAMPAGCOM = 2;
  public static int FLD_DATIINPANNEL_ROWNAMPAGRES = 3;
  public static int FLD_DATIINPANNEL_ROWNAMTOMAEM = 4;
  public static int FLD_DATIINPANNEL_ROWNAMTOMAPA = 5;
  public static int FLD_DATIINPANNEL_ROWNAMOREMCO = 6;
  public static int FLD_DATIINPANNEL_ROWNAMOREMRE = 7;
  public static int FLD_DATIINPANNEL_ROWNAMORRICO = 8;
  public static int FLD_DATIINPANNEL_ROWNAMORRIRE = 9;
  public static int FLD_DATIINPANNEL_RONAFODICAEM = 10;
  public static int FLD_DATIINPANNEL_RONAFODICARI = 11;
  public static int FLD_DATIINPANNEL_ROWNAMTOOREM = 12;
  public static int FLD_DATIINPANNEL_ROWNAMTOORRI = 13;
  public static int FLD_DATIINPANNEL_ROWNAMLIDICA = 14;
  public static int FLD_DATIINPANNEL_ROWNAMLIDITE = 15;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI390 = 1103;
  public static int FLD_PARAMETRI390_ROWNAMTIDIVI = 0;
  public static int FLD_PARAMETRI390_ROWNAMEAL = 1;

  // Definition of table: Pannello
  //
  public static int TBL_PANNELLO7 = 1104;
  public static int FLD_PANNELLO7_ROWNAMSAINCA = 0;
  public static int FLD_PANNELLO7_ROWNAMSAINTE = 1;
  public static int FLD_PANNELLO7_ROWNAMSAFICA = 2;
  public static int FLD_PANNELLO7_ROWNAMSAFITE = 3;
  public static int FLD_PANNELLO7_ROWNAMMAREEM = 4;
  public static int FLD_PANNELLO7_ROWNAMMAREPA = 5;
  public static int FLD_PANNELLO7_ROWNAMMACOEM = 6;
  public static int FLD_PANNELLO7_ROWNAMMACOPA = 7;
  public static int FLD_PANNELLO7_ROWNAMTOMAEM = 8;
  public static int FLD_PANNELLO7_ROWNAMTOMAPA = 9;
  public static int FLD_PANNELLO7_ROWNAMORREEM = 10;
  public static int FLD_PANNELLO7_ROWNAMORRERI = 11;
  public static int FLD_PANNELLO7_ROWNAMORCOEM = 12;
  public static int FLD_PANNELLO7_ROWNAMORCORI = 13;
  public static int FLD_PANNELLO7_ROWNAMTOOREM = 14;
  public static int FLD_PANNELLO7_ROWNAMTOORRI = 15;
  public static int FLD_PANNELLO7_ROWNAMESSAVI = 16;

  // Definition of table: Imdb Parametri Saldi Vincoli
  //
  public static int TBL_IMDPARSALVIN = 1105;
  public static int FLD_IMDPARSALVIN_NOMOGGTIVISA = 0;

  // Definition of table: Par
  //
  public static int TBL_PAR26 = 1106;
  public static int FLD_PAR26_ROWNAMETIPO = 0;
  public static int FLD_PAR26_ROWNAMENUMER = 1;
  public static int FLD_PAR26_ROWNAMDATELA = 2;
  public static int FLD_PAR26_ROWNAMEINCAS = 3;
  public static int FLD_PAR26_ROWNAMEPAGAM = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR28 = 1107;
  public static int FLD_PAR28_ROWNAMTIPVIN = 0;
  public static int FLD_PAR28_ROWNAMETIPO = 1;
  public static int FLD_PAR28_ROWNAMEDAL = 2;
  public static int FLD_PAR28_ROWNAMEAL = 3;
  public static int FLD_PAR28_ROWNAMEDETTA = 4;
  public static int FLD_PAR28_ROWNAMVINSCA = 5;

  // Definition of table: Par
  //
  public static int TBL_PAR103 = 1108;
  public static int FLD_PAR103_ROWNAMTIPVIN = 0;
  public static int FLD_PAR103_ROWNAMDATELA = 1;
  public static int FLD_PAR103_ROWNAMVINSCA = 2;

  // Definition of table: Param
  //
  public static int TBL_PARAM37 = 1109;
  public static int FLD_PARAM37_ROWNAMEES = 0;
  public static int FLD_PARAM37_ROWNAMECRITE = 1;
  public static int FLD_PARAM37_ROWNAMEIMPOR = 2;
  public static int FLD_PARAM37_ROWNAMEOLDES = 3;
  public static int FLD_PARAM37_ROWNAMOLDCRI = 4;

  // Definition of table: Par
  //
  public static int TBL_PAR105 = 1110;
  public static int FLD_PAR105_ROWNAMECAPIT = 0;
  public static int FLD_PAR105_ROWNAMEARTIC = 1;
  public static int FLD_PAR105_ROWNAMDATELA = 2;
  public static int FLD_PAR105_ROWNAMRECOEN = 3;
  public static int FLD_PAR105_ROWNAMEDETTA = 4;
  public static int FLD_PAR105_ROWNAMECAPI1 = 5;
  public static int FLD_PAR105_ROWNAMEARTI1 = 6;
  public static int FLD_PAR105_ROWNAMEPEG = 7;

  // Definition of table: Par
  //
  public static int TBL_PAR106 = 1111;
  public static int FLD_PAR106_ROWNAMECAPIT = 0;
  public static int FLD_PAR106_ROWNAMEARTIC = 1;
  public static int FLD_PAR106_ROWNAMDATELA = 2;
  public static int FLD_PAR106_ROWNAMRECOEN = 3;
  public static int FLD_PAR106_ROWNAMEDETTA = 4;
  public static int FLD_PAR106_ROWNAMECAPI1 = 5;
  public static int FLD_PAR106_ROWNAMEARTI1 = 6;
  public static int FLD_PAR106_ROWNAMEPEG = 7;

  // Definition of table: Par
  //
  public static int TBL_PAR85 = 1112;
  public static int FLD_PAR85_ROWNAMECAPIT = 0;
  public static int FLD_PAR85_ROWNAMEARTIC = 1;
  public static int FLD_PAR85_ROWNAMDATELA = 2;
  public static int FLD_PAR85_ROWNAMRECOEN = 3;
  public static int FLD_PAR85_ROWNAMSEROPE = 4;
  public static int FLD_PAR85_ROWNAMECAPI1 = 5;
  public static int FLD_PAR85_ROWNAMEARTI1 = 6;
  public static int FLD_PAR85_ROWNAMEPEG = 7;
  public static int FLD_PAR85_ROWNAMSUBIMP = 8;
  public static int FLD_PAR85_ROWNAMANNOMO = 9;
  public static int FLD_PAR85_ROWNAMUNIORG = 10;

  // Definition of table: Par
  //
  public static int TBL_PAR87 = 1113;
  public static int FLD_PAR87_ROWNAMECAPIT = 0;
  public static int FLD_PAR87_ROWNAMEARTIC = 1;
  public static int FLD_PAR87_ROWNAMDATELA = 2;
  public static int FLD_PAR87_ROWNAMRECOEN = 3;
  public static int FLD_PAR87_ROWNAMSEROPE = 4;
  public static int FLD_PAR87_ROWNAMECAPI1 = 5;
  public static int FLD_PAR87_ROWNAMEARTI1 = 6;
  public static int FLD_PAR87_ROWNAMEPEG = 7;
  public static int FLD_PAR87_ROWNAMANNOMO = 8;
  public static int FLD_PAR87_ROWNAMUNIORG = 9;

  // Definition of table: Par
  //
  public static int TBL_PAR110 = 1114;
  public static int FLD_PAR110_ROWNAMEPARTE = 0;
  public static int FLD_PAR110_ROWNAMCAPDAL = 1;
  public static int FLD_PAR110_ROWNAMARTDAL = 2;
  public static int FLD_PAR110_ROWNAMECAPAL = 3;
  public static int FLD_PAR110_ROWNAMEARTAL = 4;
  public static int FLD_PAR110_ROWNAMRECOEN = 5;
  public static int FLD_PAR110_ROWNAMANNRES = 6;
  public static int FLD_PAR110_ROWNAMEMISSI = 7;
  public static int FLD_PAR110_ROWNAMEPROGR = 8;
  public static int FLD_PAR110_ROWNAMCEDICO = 9;
  public static int FLD_PAR110_ROWNAMSETOPE = 10;
  public static int FLD_PAR110_ROWNAMSEROPE = 11;
  public static int FLD_PAR110_ROWNAMEUOSUD = 12;
  public static int FLD_PAR110_ROWNAMEUOSOT = 13;
  public static int FLD_PAR110_ROWNAMCHSOUO = 14;
  public static int FLD_PAR110_ROWNAMDESINT = 15;

  // Definition of table: Param
  //
  public static int TBL_PARAM78 = 1115;
  public static int FLD_PARAM78_ROWNAMTIPSTA = 0;

  // Definition of table: Param
  //
  public static int TBL_PARAM98 = 1116;
  public static int FLD_PARAM98_ROWNAMTIPRIC = 0;
  public static int FLD_PARAM98_ROWNAMDATELA = 1;

  // Definition of table: Param
  //
  public static int TBL_PARAM135 = 1117;
  public static int FLD_PARAM135_ROWNAMDATELA = 0;

  // Definition of table: WRK PATTO STAMPA
  //
  public static int TBL_WRKPATTOSTA3 = 1118;
  public static int FLD_WRKPATTOSTA3_PROGRESSIVO = 0;
  public static int FLD_WRKPATTOSTA3_ESERCIZIO = 1;
  public static int FLD_WRKPATTOSTA3_TIPO_STAMPA = 2;
  public static int FLD_WRKPATTOSTA3_DATA_ELABORAZIONE = 3;
  public static int FLD_WRKPATTOSTA3_CODICE = 4;
  public static int FLD_WRKPATTOSTA3_DESCRIZIONE = 5;
  public static int FLD_WRKPATTOSTA3_SEQUENZA = 6;
  public static int FLD_WRKPATTOSTA3_STANZIAMENTO_ATT = 7;
  public static int FLD_WRKPATTOSTA3_VAR_PROVVISORIE = 8;
  public static int FLD_WRKPATTOSTA3_IMPORTO_EFFETTIVO = 9;
  public static int FLD_WRKPATTOSTA3_IMPORTO_SIMULATO = 10;
  public static int FLD_WRKPATTOSTA3_MODIFICA_ASSESTATO = 11;
  public static int FLD_WRKPATTOSTA3_MODIF_EFFETTIVO = 12;
  public static int FLD_WRKPATTOSTA3_MODIF_SIMULATO = 13;
  public static int FLD_WRKPATTOSTA3_CODICE_VISIBILE = 14;
  public static int FLD_WRKPATTOSTA3_TIPO_RIGA = 15;
  public static int FLD_WRKPATTOSTA3_TOTALE = 16;
  public static int FLD_WRKPATTOSTA3_SEGNO_TOTALE = 17;
  public static int FLD_WRKPATTOSTA3_GRASSETTO = 18;
  public static int FLD_WRKPATTOSTA3_DATA_INSERIMENTO = 19;
  public static int FLD_WRKPATTOSTA3_UTENTE_INSERIMENTO = 20;
  public static int FLD_WRKPATTOSTA3_DATA_ULTIMO_AGG = 21;
  public static int FLD_WRKPATTOSTA3_UTENTE_ULTIMO_AGG = 22;
  public static int FLD_WRKPATTOSTA3_WRKPATSTASTA = 23;
  public static int FLD_WRKPATTOSTA3_ASSESTATO_VISIBILE = 24;
  public static int FLD_WRKPATTOSTA3_TIPO_MONIT = 25;

  // Definition of table: Param
  //
  public static int TBL_PARAM103 = 1119;
  public static int FLD_PARAM103_ROWNAMTIMOST = 0;
  public static int FLD_PARAM103_ROWNAMTIPRIC = 1;
  public static int FLD_PARAM103_ROWNAMDATELA = 2;
  public static int FLD_PARAM103_ROWNAMTIMOCA = 3;

  // Definition of table: Param
  //
  public static int TBL_PARAM106 = 1120;
  public static int FLD_PARAM106_ROWNAMDATELA = 0;
  public static int FLD_PARAM106_ROWNAMTIMOST = 1;

  // Definition of table: WRK PATTO STAMPA
  //
  public static int TBL_WRKPATTOSTAM = 1121;
  public static int FLD_WRKPATTOSTAM_PROGRESSIVO = 0;
  public static int FLD_WRKPATTOSTAM_ESERCIZIO = 1;
  public static int FLD_WRKPATTOSTAM_TIPO_STAMPA = 2;
  public static int FLD_WRKPATTOSTAM_DATA_ELABORAZIONE = 3;
  public static int FLD_WRKPATTOSTAM_CODICE = 4;
  public static int FLD_WRKPATTOSTAM_DESCRIZIONE = 5;
  public static int FLD_WRKPATTOSTAM_SEQUENZA = 6;
  public static int FLD_WRKPATTOSTAM_STANZIAMENTO_ATT = 7;
  public static int FLD_WRKPATTOSTAM_VAR_PROVVISORIE = 8;
  public static int FLD_WRKPATTOSTAM_IMPORTO_EFFETTIVO = 9;
  public static int FLD_WRKPATTOSTAM_IMPORTO_SIMULATO = 10;
  public static int FLD_WRKPATTOSTAM_MODIFICA_ASSESTATO = 11;
  public static int FLD_WRKPATTOSTAM_MODIF_EFFETTIVO = 12;
  public static int FLD_WRKPATTOSTAM_MODIF_SIMULATO = 13;
  public static int FLD_WRKPATTOSTAM_CODICE_VISIBILE = 14;
  public static int FLD_WRKPATTOSTAM_TIPO_RIGA = 15;
  public static int FLD_WRKPATTOSTAM_TOTALE = 16;
  public static int FLD_WRKPATTOSTAM_SEGNO_TOTALE = 17;
  public static int FLD_WRKPATTOSTAM_GRASSETTO = 18;
  public static int FLD_WRKPATTOSTAM_DATA_INSERIMENTO = 19;
  public static int FLD_WRKPATTOSTAM_UTENTE_INSERIMENTO = 20;
  public static int FLD_WRKPATTOSTAM_DATA_ULTIMO_AGG = 21;
  public static int FLD_WRKPATTOSTAM_UTENTE_ULTIMO_AGG = 22;
  public static int FLD_WRKPATTOSTAM_WRKPATSTASTA = 23;
  public static int FLD_WRKPATTOSTAM_ASSESTATO_VISIBILE = 24;
  public static int FLD_WRKPATTOSTAM_TIPO_MONIT = 25;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI470 = 1122;
  public static int FLD_PARAMETRI470_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI470_ROWNAMEVARIA = 1;
  public static int FLD_PARAMETRI470_ROWNAMEDELIB = 2;
  public static int FLD_PARAMETRI470_ROWNAMNUMDEL = 3;
  public static int FLD_PARAMETRI470_ROWNAMANNDEL = 4;
  public static int FLD_PARAMETRI470_ROWNAMUNIPRO = 5;
  public static int FLD_PARAMETRI470_ROWNAMNUMPRO = 6;
  public static int FLD_PARAMETRI470_ROWNAMANNPRO = 7;
  public static int FLD_PARAMETRI470_ROWNAMEDATA = 8;
  public static int FLD_PARAMETRI470_ROWNAMREPRIN = 9;
  public static int FLD_PARAMETRI470_ROWNAMCAPFPV = 10;
  public static int FLD_PARAMETRI470_ROWNAMSOCAVA = 11;
  public static int FLD_PARAMETRI470_ROWNAMPROSTA = 12;
  public static int FLD_PARAMETRI470_ROWNAMSALDAT = 13;
  public static int FLD_PARAMETRI470_ROWNAMDESSTA = 14;
  public static int FLD_PARAMETRI470_ROWNAMREPRFI = 15;
  public static int FLD_PARAMETRI470_RONAINVAPICI = 16;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI473 = 1123;
  public static int FLD_PARAMETRI473_ROWNAMEVARIA = 0;
  public static int FLD_PARAMETRI473_ROWNAMEDELIB = 1;
  public static int FLD_PARAMETRI473_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI473_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI473_ROWNAMUNIPRO = 4;
  public static int FLD_PARAMETRI473_ROWNAMNUMPRO = 5;
  public static int FLD_PARAMETRI473_ROWNAMANNPRO = 6;
  public static int FLD_PARAMETRI473_ROWNAMEDATA = 7;
  public static int FLD_PARAMETRI473_RONAINVAPICI = 8;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI472 = 1124;
  public static int FLD_PARAMETRI472_ROWNAMEPARTE = 0;
  public static int FLD_PARAMETRI472_ROWNAMEDELIB = 1;
  public static int FLD_PARAMETRI472_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI472_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI472_ROWNAMEDATA = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI533 = 1125;
  public static int FLD_PARAMETRI533_ROWNAMEPARTE = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI576 = 1126;
  public static int FLD_PARAMETRI576_ROWNAMTIPCAL = 0;
  public static int FLD_PARAMETRI576_ROWNAMEDELIB = 1;
  public static int FLD_PARAMETRI576_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI576_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI576_ROWNAMEDATA = 4;
  public static int FLD_PARAMETRI576_ROWNAMEPARTE = 5;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO1 = 1127;
  public static int FLD_PARAMEESPLO1_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO1_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO1_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO1_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO1_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO1_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO1_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO1_PARASOLOCAPI = 7;
  public static int FLD_PARAMEESPLO1_PARAMDESCRIZ = 8;
  public static int FLD_PARAMEESPLO1_PARANUMESUBI = 9;
  public static int FLD_PARAMEESPLO1_PARAANNOSUBI = 10;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI8 = 1128;
  public static int FLD_FILTRI8_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI8_NOMEOGGETART = 1;
  public static int FLD_FILTRI8_NOMEOGGETITO = 2;
  public static int FLD_FILTRI8_NOMEOGGECATE = 3;
  public static int FLD_FILTRI8_NOMEOGGECODI = 4;
  public static int FLD_FILTRI8_NOMOGGCODTER = 5;
  public static int FLD_FILTRI8_NOMEOGGENUME = 6;
  public static int FLD_FILTRI8_NOMEOGGEANNO = 7;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ3 = 1129;
  public static int FLD_PARAMEPOSIZ3_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ3_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO2 = 1130;
  public static int FLD_PARAMEESPLO2_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO2_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO2_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO2_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO2_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO2_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO2_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO2_PARATIPOPROG = 7;
  public static int FLD_PARAMEESPLO2_PARANUMESUBI = 8;
  public static int FLD_PARAMEESPLO2_PARAANNOSUBI = 9;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI18 = 1131;
  public static int FLD_FILTRI18_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI18_NOMEOGGETART = 1;
  public static int FLD_FILTRI18_NOMEOGGETITO = 2;
  public static int FLD_FILTRI18_NOMEOGGECATE = 3;
  public static int FLD_FILTRI18_NOMEOGGECODI = 4;
  public static int FLD_FILTRI18_NOMOGGCODTER = 5;
  public static int FLD_FILTRI18_NOMOGGCODGER = 6;
  public static int FLD_FILTRI18_NOMOGGCOPAGE = 7;
  public static int FLD_FILTRI18_NOMOGGNUMIMP = 8;
  public static int FLD_FILTRI18_NOMOGGANNIMP = 9;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ4 = 1132;
  public static int FLD_PARAMEPOSIZ4_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ4_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO4 = 1133;
  public static int FLD_PARAMEESPLO4_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO4_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO4_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO4_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO4_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO4_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO4_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO4_PARACODLIVE4 = 7;
  public static int FLD_PARAMEESPLO4_PARANUMESUBI = 8;
  public static int FLD_PARAMEESPLO4_PARAANNOSUBI = 9;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI20 = 1134;
  public static int FLD_FILTRI20_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI20_NOMEOGGETART = 1;
  public static int FLD_FILTRI20_NOMEOGGETITO = 2;
  public static int FLD_FILTRI20_NOMEOGGECATE = 3;
  public static int FLD_FILTRI20_NOMEOGGECODI = 4;
  public static int FLD_FILTRI20_NOMOGGCODTER = 5;
  public static int FLD_FILTRI20_NOMOGGCODLI4 = 6;
  public static int FLD_FILTRI20_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI20_NOMOGGANNIMP = 8;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ7 = 1135;
  public static int FLD_PARAMEPOSIZ7_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ7_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO3 = 1136;
  public static int FLD_PARAMEESPLO3_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO3_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO3_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO3_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO3_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO3_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO3_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO3_PARACODLIVE4 = 7;
  public static int FLD_PARAMEESPLO3_PARANUMESUBI = 8;
  public static int FLD_PARAMEESPLO3_PARAANNOSUBI = 9;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI19 = 1137;
  public static int FLD_FILTRI19_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI19_NOMEOGGETART = 1;
  public static int FLD_FILTRI19_NOMEOGGETITO = 2;
  public static int FLD_FILTRI19_NOMEOGGECATE = 3;
  public static int FLD_FILTRI19_NOMEOGGECODI = 4;
  public static int FLD_FILTRI19_NOMOGGCODTER = 5;
  public static int FLD_FILTRI19_NOMOGGCODLI4 = 6;
  public static int FLD_FILTRI19_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI19_NOMOGGANNIMP = 8;
  public static int FLD_FILTRI19_NOMOGGCODLI5 = 9;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ1 = 1138;
  public static int FLD_PARAMEPOSIZ1_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ1_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO5 = 1139;
  public static int FLD_PARAMEESPLO5_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO5_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO5_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO5_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO5_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO5_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO5_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO5_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPLO5_PARAANNOSUBI = 8;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI21 = 1140;
  public static int FLD_FILTRI21_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI21_NOMEOGGETART = 1;
  public static int FLD_FILTRI21_NOMEOGGETITO = 2;
  public static int FLD_FILTRI21_NOMEOGGECATE = 3;
  public static int FLD_FILTRI21_NOMEOGGECODI = 4;
  public static int FLD_FILTRI21_NOMOGGCODTER = 5;
  public static int FLD_FILTRI21_NOMEOGGRESUO = 6;
  public static int FLD_FILTRI21_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI21_NOMOGGANNIMP = 8;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ8 = 1141;
  public static int FLD_PARAMEPOSIZ8_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ8_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL16 = 1142;
  public static int FLD_PARAMEESPL16_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPL16_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPL16_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPL16_PARAMPARTE = 3;
  public static int FLD_PARAMEESPL16_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPL16_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPL16_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPL16_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPL16_PARAANNOSUBI = 8;
  public static int FLD_PARAMEESPL16_PARAMSITUAAL = 9;
  public static int FLD_PARAMEESPL16_PARAMOTTIRIF = 10;
  public static int FLD_PARAMEESPL16_PARAMRESPOAL = 11;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI33 = 1143;
  public static int FLD_FILTRI33_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI33_NOMEOGGETART = 1;
  public static int FLD_FILTRI33_NOMEOGGRESUO = 2;
  public static int FLD_FILTRI33_NOMOGGNUMIMP = 3;
  public static int FLD_FILTRI33_NOMOGGANNIMP = 4;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI19 = 1144;
  public static int FLD_PARAMEPOSI19_POSTOP = 0;
  public static int FLD_PARAMEPOSI19_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO6 = 1145;
  public static int FLD_PARAMEESPLO6_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPLO6_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPLO6_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPLO6_PARAMPARTE = 3;
  public static int FLD_PARAMEESPLO6_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPLO6_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPLO6_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPLO6_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPLO6_PARAANNOSUBI = 8;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI13 = 1146;
  public static int FLD_FILTRI13_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI13_NOMEOGGETART = 1;
  public static int FLD_FILTRI13_NOMEOGGETITO = 2;
  public static int FLD_FILTRI13_NOMEOGGECATE = 3;
  public static int FLD_FILTRI13_NOMEOGGECODI = 4;
  public static int FLD_FILTRI13_NOMOGGCODTER = 5;
  public static int FLD_FILTRI13_NOMOGGCENCOS = 6;
  public static int FLD_FILTRI13_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI13_NOMOGGANNIMP = 8;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSIZ9 = 1147;
  public static int FLD_PARAMEPOSIZ9_POSTOP = 0;
  public static int FLD_PARAMEPOSIZ9_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO7 = 1148;
  public static int FLD_PARAMEESPLO7_PARASCHEINFO = 0;
  public static int FLD_PARAMEESPLO7_PARAESERSCHE = 1;
  public static int FLD_PARAMEESPLO7_PARACODIBENE = 2;
  public static int FLD_PARAMEESPLO7_PARRAGSOCBEN = 3;
  public static int FLD_PARAMEESPLO7_PARAAGGDAFUO = 4;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI10 = 1149;
  public static int FLD_PARAMEPOSI10_POSTOP = 0;
  public static int FLD_PARAMEPOSI10_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO8 = 1150;
  public static int FLD_PARAMEESPLO8_PARASCHEINFO = 0;
  public static int FLD_PARAMEESPLO8_PARAESERSCHE = 1;
  public static int FLD_PARAMEESPLO8_PARAMSEDEDEL = 2;
  public static int FLD_PARAMEESPLO8_PARAMNUMEDEL = 3;
  public static int FLD_PARAMEESPLO8_PARAMANNODEL = 4;
  public static int FLD_PARAMEESPLO8_PARAAGGDAFUO = 5;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI11 = 1151;
  public static int FLD_PARAMEPOSI11_POSTOP = 0;
  public static int FLD_PARAMEPOSI11_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPLO9 = 1152;
  public static int FLD_PARAMEESPLO9_PARASCHEINFO = 0;
  public static int FLD_PARAMEESPLO9_PARAESERSCHE = 1;
  public static int FLD_PARAMEESPLO9_PARAMPARTE = 2;
  public static int FLD_PARAMEESPLO9_PARANUMEIMPA = 3;
  public static int FLD_PARAMEESPLO9_PARAANNOIMPA = 4;
  public static int FLD_PARAMEESPLO9_PARAAGGDAFUO = 5;
  public static int FLD_PARAMEESPLO9_PARATIPOPROG = 6;
  public static int FLD_PARAMEESPLO9_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPLO9_PARAANNOSUBI = 8;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI22 = 1153;
  public static int FLD_FILTRI22_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI22_NOMEOGGETART = 1;
  public static int FLD_FILTRI22_NOMEOGGETITO = 2;
  public static int FLD_FILTRI22_NOMEOGGECATE = 3;
  public static int FLD_FILTRI22_NOMEOGGECODI = 4;
  public static int FLD_FILTRI22_NOMOGGCODTER = 5;
  public static int FLD_FILTRI22_NOMOGGCODGER = 6;
  public static int FLD_FILTRI22_NOMOGGCOPAGE = 7;
  public static int FLD_FILTRI22_NOMOGGNUMIMP = 8;
  public static int FLD_FILTRI22_NOMOGGANNIMP = 9;
  public static int FLD_FILTRI22_NOMEOGGELIV1 = 10;
  public static int FLD_FILTRI22_NOMEOGGELIV2 = 11;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI12 = 1154;
  public static int FLD_PARAMEPOSI12_POSTOP = 0;
  public static int FLD_PARAMEPOSI12_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL10 = 1155;
  public static int FLD_PARAMEESPL10_PARASCHEINFO = 0;
  public static int FLD_PARAMEESPL10_PARAESERSCHE = 1;
  public static int FLD_PARAMEESPL10_PARAMPARTE = 2;
  public static int FLD_PARAMEESPL10_PARANUMEIMPA = 3;
  public static int FLD_PARAMEESPL10_PARAANNOIMPA = 4;
  public static int FLD_PARAMEESPL10_PARAAGGDAFUO = 5;
  public static int FLD_PARAMEESPL10_PARANUMESUBI = 6;
  public static int FLD_PARAMEESPL10_PARAANNOSUBI = 7;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI23 = 1156;
  public static int FLD_FILTRI23_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI23_NOMEOGGETART = 1;
  public static int FLD_FILTRI23_NOMEOGGPROUO = 2;
  public static int FLD_FILTRI23_NOMOGGNUMIMP = 3;
  public static int FLD_FILTRI23_NOMOGGANNIMP = 4;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI13 = 1157;
  public static int FLD_PARAMEPOSI13_POSTOP = 0;
  public static int FLD_PARAMEPOSI13_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL13 = 1158;
  public static int FLD_PARAMEESPL13_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPL13_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPL13_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPL13_PARAMPARTE = 3;
  public static int FLD_PARAMEESPL13_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPL13_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPL13_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPL13_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPL13_PARAANNOSUBI = 8;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI26 = 1159;
  public static int FLD_FILTRI26_NOMEOGGPROUO = 0;
  public static int FLD_FILTRI26_NOMEOGGETCAP = 1;
  public static int FLD_FILTRI26_NOMEOGGETART = 2;
  public static int FLD_FILTRI26_NOMOGGCODGER = 3;
  public static int FLD_FILTRI26_NOMOGGCOPAGE = 4;
  public static int FLD_FILTRI26_NOMOGGMACLI1 = 5;
  public static int FLD_FILTRI26_NOMOGGMACLI2 = 6;
  public static int FLD_FILTRI26_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI26_NOMOGGANNIMP = 8;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI16 = 1160;
  public static int FLD_PARAMEPOSI16_POSTOP = 0;
  public static int FLD_PARAMEPOSI16_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL14 = 1161;
  public static int FLD_PARAMEESPL14_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPL14_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPL14_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPL14_PARAMPARTE = 3;
  public static int FLD_PARAMEESPL14_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPL14_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPL14_PARAAGGDAFUO = 6;
  public static int FLD_PARAMEESPL14_PARANUMESUBI = 7;
  public static int FLD_PARAMEESPL14_PARAANNOSUBI = 8;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI27 = 1162;
  public static int FLD_FILTRI27_NOMEOGGRESUO = 0;
  public static int FLD_FILTRI27_NOMEOGGETCAP = 1;
  public static int FLD_FILTRI27_NOMEOGGETART = 2;
  public static int FLD_FILTRI27_NOMOGGCODGER = 3;
  public static int FLD_FILTRI27_NOMOGGCOPAGE = 4;
  public static int FLD_FILTRI27_NOMOGGMACLI1 = 5;
  public static int FLD_FILTRI27_NOMOGGMACLI2 = 6;
  public static int FLD_FILTRI27_NOMOGGNUMIMP = 7;
  public static int FLD_FILTRI27_NOMOGGANNIMP = 8;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI17 = 1163;
  public static int FLD_PARAMEPOSI17_POSTOP = 0;
  public static int FLD_PARAMEPOSI17_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL12 = 1164;
  public static int FLD_PARAMEESPL12_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPL12_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPL12_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPL12_PARAMPARTE = 3;
  public static int FLD_PARAMEESPL12_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPL12_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPL12_PARAAGGDAFUO = 6;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI25 = 1165;
  public static int FLD_FILTRI25_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI25_NOMEOGGETART = 1;
  public static int FLD_FILTRI25_NOMOGGFINOPE = 2;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI15 = 1166;
  public static int FLD_PARAMEPOSI15_POSTOP = 0;
  public static int FLD_PARAMEPOSI15_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL11 = 1167;
  public static int FLD_PARAMEESPL11_PARASCHEINFO = 0;
  public static int FLD_PARAMEESPL11_PARAESERSCHE = 1;
  public static int FLD_PARAMEESPL11_PARAMPARTE = 2;
  public static int FLD_PARAMEESPL11_PARANUMEIMPA = 3;
  public static int FLD_PARAMEESPL11_PARAANNOIMPA = 4;
  public static int FLD_PARAMEESPL11_PARAAGGDAFUO = 5;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI24 = 1168;
  public static int FLD_FILTRI24_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI24_NOMEOGGETART = 1;
  public static int FLD_FILTRI24_NOMOGGFINOPE = 2;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI14 = 1169;
  public static int FLD_PARAMEPOSI14_POSTOP = 0;
  public static int FLD_PARAMEPOSI14_POSLEFT = 1;

  // Definition of table: Parametri Esploratore
  //
  public static int TBL_PARAMEESPL15 = 1170;
  public static int FLD_PARAMEESPL15_PARATIPOESPL = 0;
  public static int FLD_PARAMEESPL15_PARASCHEINFO = 1;
  public static int FLD_PARAMEESPL15_PARAESERSCHE = 2;
  public static int FLD_PARAMEESPL15_PARAMPARTE = 3;
  public static int FLD_PARAMEESPL15_PARANUMEIMPA = 4;
  public static int FLD_PARAMEESPL15_PARAANNOIMPA = 5;
  public static int FLD_PARAMEESPL15_PARAAGGDAFUO = 6;

  // Definition of table: Filtri
  //
  public static int TBL_FILTRI28 = 1171;
  public static int FLD_FILTRI28_NOMEOGGETCAP = 0;
  public static int FLD_FILTRI28_NOMEOGGETART = 1;
  public static int FLD_FILTRI28_NOMEOGGETFIN = 2;
  public static int FLD_FILTRI28_NOMEOGGETOPE = 3;

  // Definition of table: Parametri Posizione
  //
  public static int TBL_PARAMEPOSI18 = 1172;
  public static int FLD_PARAMEPOSI18_POSTOP = 0;
  public static int FLD_PARAMEPOSI18_POSLEFT = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI2 = 1173;
  public static int FLD_PARAMETRI2_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI2_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI2_PARAMARTICOL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI48 = 1174;
  public static int FLD_PARAMETRI48_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI48_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI48_PARAMARTICOL = 2;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI10 = 1175;
  public static int FLD_PARAMETRI10_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI10_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI10_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI10_PARASTANATTU = 3;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL2 = 1176;
  public static int FLD_PARAMETRIOL2_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIOL2_ARTICOLOOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI11 = 1177;
  public static int FLD_PARAMETRI11_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI11_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI11_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI11_PARASTANATTU = 3;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL3 = 1178;
  public static int FLD_PARAMETRIOL3_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIOL3_ARTICOLOOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI60 = 1179;
  public static int FLD_PARAMETRI60_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI60_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI60_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI60_PARASTANATTU = 3;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOL6 = 1180;
  public static int FLD_PARAMETRIOL6_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIOL6_ARTICOLOOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI65 = 1181;
  public static int FLD_PARAMETRI65_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI65_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI65_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI65_PARASTANATTU = 3;

  // Definition of table: Parametri Old
  //
  public static int TBL_PARAMETRIOLD = 1182;
  public static int FLD_PARAMETRIOLD_CAPITOLOOLD = 0;
  public static int FLD_PARAMETRIOLD_ARTICOLOOLD = 1;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI324 = 1183;
  public static int FLD_PARAMETRI324_PARAENTRSPES = 0;
  public static int FLD_PARAMETRI324_PARAMCAPITOL = 1;
  public static int FLD_PARAMETRI324_PARAMARTICOL = 2;
  public static int FLD_PARAMETRI324_PARSTAVOCPEG = 3;
  public static int FLD_PARAMETRI324_PARASTANATTU = 4;
  public static int FLD_PARAMETRI324_PARAFOLDLOOK = 5;
  public static int FLD_PARAMETRI324_PARAMOLDFINA = 6;

  // Definition of table: Finanziamento
  //
  public static int TBL_FINANZIAME25 = 1184;
  public static int FLD_FINANZIAME25_RONAFIOPVAPR = 0;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI103 = 1185;
  public static int FLD_PARAMETRI103_PARASOLOCOMP = 0;
  public static int FLD_PARAMETRI103_PARAMDAL = 1;
  public static int FLD_PARAMETRI103_PARAMESERCIZ = 2;
  public static int FLD_PARAMETRI103_PARAMUOGESTI = 3;
  public static int FLD_PARAMETRI103_PARAMUOUTILI = 4;
  public static int FLD_PARAMETRI103_PARAMTITOLO = 5;
  public static int FLD_PARAMETRI103_PARAMCATEGOR = 6;
  public static int FLD_PARAMETRI103_PARAMCODTERZ = 7;
  public static int FLD_PARAMETRI103_PARAMCAPITOL = 8;
  public static int FLD_PARAMETRI103_PARAMARTICOL = 9;
  public static int FLD_PARAMETRI103_PARAMSEVOCE = 10;
  public static int FLD_PARAMETRI103_PARAMRUOLO = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI468 = 1186;
  public static int FLD_PARAMETRI468_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI468_PARAMOPERA = 1;
  public static int FLD_PARAMETRI468_PARAMESERCIZ = 2;
  public static int FLD_PARAMETRI468_PARAMCAPITOL = 3;
  public static int FLD_PARAMETRI468_PARAMARTICOL = 4;
  public static int FLD_PARAMETRI468_PARASOLOCOMP = 5;
  public static int FLD_PARAMETRI468_PARAMDAL = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI464 = 1187;
  public static int FLD_PARAMETRI464_PARAMFINANZI = 0;
  public static int FLD_PARAMETRI464_PARAMOPERA = 1;
  public static int FLD_PARAMETRI464_PARAMESERCIZ = 2;
  public static int FLD_PARAMETRI464_PARAMCAPITOL = 3;
  public static int FLD_PARAMETRI464_PARAMARTICOL = 4;
  public static int FLD_PARAMETRI464_PARASOLOCOMP = 5;
  public static int FLD_PARAMETRI464_PARAMDAL = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI4 = 1188;
  public static int FLD_PARAMETRI4_ROWNAMSOLCOM = 0;
  public static int FLD_PARAMETRI4_ROWNAMEDAL = 1;
  public static int FLD_PARAMETRI4_ROWNAMEESERC = 2;
  public static int FLD_PARAMETRI4_ROWNAMEUOGES = 3;
  public static int FLD_PARAMETRI4_ROWNAMEUOUTI = 4;
  public static int FLD_PARAMETRI4_ROWNAMETITOL = 5;
  public static int FLD_PARAMETRI4_ROWNAMECATEG = 6;
  public static int FLD_PARAMETRI4_ROWNAMCODTER = 7;
  public static int FLD_PARAMETRI4_ROWNAMECAPIT = 8;
  public static int FLD_PARAMETRI4_ROWNAMEARTIC = 9;
  public static int FLD_PARAMETRI4_ROWNAMESEVOC = 10;
  public static int FLD_PARAMETRI4_ROWNAMSUBIMP = 11;
  public static int FLD_PARAMETRI4_ROWNAMERUOLO = 12;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI469 = 1189;
  public static int FLD_PARAMETRI469_ROWNAMEFINAN = 0;
  public static int FLD_PARAMETRI469_ROWNAMEOPERA = 1;
  public static int FLD_PARAMETRI469_ROWNAMEESERC = 2;
  public static int FLD_PARAMETRI469_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI469_ROWNAMEARTIC = 4;
  public static int FLD_PARAMETRI469_ROWNAMSOLCOM = 5;
  public static int FLD_PARAMETRI469_ROWNAMEDAL = 6;
  public static int FLD_PARAMETRI469_ROWNAMSUBIMP = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI465 = 1190;
  public static int FLD_PARAMETRI465_ROWNAMEFINAN = 0;
  public static int FLD_PARAMETRI465_ROWNAMEOPERA = 1;
  public static int FLD_PARAMETRI465_ROWNAMEESERC = 2;
  public static int FLD_PARAMETRI465_ROWNAMECAPIT = 3;
  public static int FLD_PARAMETRI465_ROWNAMEARTIC = 4;
  public static int FLD_PARAMETRI465_ROWNAMSOLCOM = 5;
  public static int FLD_PARAMETRI465_ROWNAMEDAL = 6;
  public static int FLD_PARAMETRI465_ROWNAMSUBIMP = 7;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI100 = 1191;
  public static int FLD_PARAMETRI100_PARASOLOCOMP = 0;
  public static int FLD_PARAMETRI100_PARAMETRIDAL = 1;
  public static int FLD_PARAMETRI100_PARAMEESERCI = 2;
  public static int FLD_PARAMETRI100_PARAMUOGESTI = 3;
  public static int FLD_PARAMETRI100_PARAMUOUTILI = 4;
  public static int FLD_PARAMETRI100_PARAMETITOLO = 5;
  public static int FLD_PARAMETRI100_PARAMECATEGO = 6;
  public static int FLD_PARAMETRI100_PARAMCODTERZ = 7;
  public static int FLD_PARAMETRI100_PARAMECAPITO = 8;
  public static int FLD_PARAMETRI100_PARAMEARTICO = 9;
  public static int FLD_PARAMETRI100_PARAMESEVOCE = 10;

  // Definition of table: Totali
  //
  public static int TBL_TOTALI1 = 1192;
  public static int FLD_TOTALI1_TOTIMPORINIZ = 0;
  public static int FLD_TOTALI1_TOTVARIAZION = 1;
  public static int FLD_TOTALI1_TOTACCERTAME = 2;
  public static int FLD_TOTALI1_TOTORDINATIV = 3;
  public static int FLD_TOTALI1_TOTINCASSI = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI101 = 1193;
  public static int FLD_PARAMETRI101_PARASOLOCOMP = 0;
  public static int FLD_PARAMETRI101_PARAMETRIDAL = 1;
  public static int FLD_PARAMETRI101_PARAMEESERCI = 2;
  public static int FLD_PARAMETRI101_PARAMUOGESTI = 3;
  public static int FLD_PARAMETRI101_PARAMUOUTILI = 4;
  public static int FLD_PARAMETRI101_PARAMETITOLO = 5;
  public static int FLD_PARAMETRI101_PARAMECATEGO = 6;
  public static int FLD_PARAMETRI101_PARAMCODTERZ = 7;
  public static int FLD_PARAMETRI101_PARAMECAPITO = 8;
  public static int FLD_PARAMETRI101_PARAMEARTICO = 9;
  public static int FLD_PARAMETRI101_PARAMESEVOCE = 10;
  public static int FLD_PARAMETRI101_PARAMESUBIMP = 11;

  // Definition of table: Totali
  //
  public static int TBL_TOTALI = 1194;
  public static int FLD_TOTALI_TOTIMPORINIZ = 0;
  public static int FLD_TOTALI_TOTVARIAZION = 1;
  public static int FLD_TOTALI_TOTIMPEGNI = 2;
  public static int FLD_TOTALI_TOTMANDATI = 3;
  public static int FLD_TOTALI_TOTPAGAMENTI = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI335 = 1195;
  public static int FLD_PARAMETRI335_ROWNAMTIPCHI = 0;
  public static int FLD_PARAMETRI335_ROWNAMSEDDEL = 1;
  public static int FLD_PARAMETRI335_ROWNAMNUMDEL = 2;
  public static int FLD_PARAMETRI335_ROWNAMANNDEL = 3;
  public static int FLD_PARAMETRI335_UNITA_PROPONENTE = 4;
  public static int FLD_PARAMETRI335_NUMERO_PROPOSTA = 5;
  public static int FLD_PARAMETRI335_ANNO_PROPOSTA = 6;
  public static int FLD_PARAMETRI335_ROWNAMEDESCR = 7;
  public static int FLD_PARAMETRI335_ROWNAMTIPVAR = 8;
  public static int FLD_PARAMETRI335_ROWNAMDATREG = 9;

  // Definition of table: Imp Acc Selezionati
  //
  public static int TBL_IMPACCSELEZI = 1196;
  public static int FLD_IMPACCSELEZI_IMPACCESERCI = 0;
  public static int FLD_IMPACCSELEZI_IMPACCCAPITO = 1;
  public static int FLD_IMPACCSELEZI_IMPACCARTICO = 2;
  public static int FLD_IMPACCSELEZI_ANNOIMPACC = 3;
  public static int FLD_IMPACCSELEZI_NUMEROIMPACC = 4;
  public static int FLD_IMPACCSELEZI_IMPACCDISPON = 5;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI556 = 1197;
  public static int FLD_PARAMETRI556_ROWNAMSOLCOM = 0;
  public static int FLD_PARAMETRI556_ROWNAMEDAL = 1;
  public static int FLD_PARAMETRI556_ROWNAMECAPIT = 2;
  public static int FLD_PARAMETRI556_ROWNAMEARTIC = 3;
  public static int FLD_PARAMETRI556_ROWNAMANNIMP = 4;
  public static int FLD_PARAMETRI556_ROWNAMNUMIMP = 5;
  public static int FLD_PARAMETRI556_ROWNAMANNSUB = 6;
  public static int FLD_PARAMETRI556_ROWNAMNUMSUB = 7;
  public static int FLD_PARAMETRI556_ROWNAMERUOLO = 8;
  public static int FLD_PARAMETRI556_ROWNAMPROUNI = 9;
  public static int FLD_PARAMETRI556_ROWNAMEOPERA = 10;
  public static int FLD_PARAMETRI556_ROWNAMEFINAN = 11;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI688 = 1198;
  public static int FLD_PARAMETRI688_PARAANCUOSOT = 0;
  public static int FLD_PARAMETRI688_PARAMPARTE = 1;
  public static int FLD_PARAMETRI688_PARAMBILANCI = 2;
  public static int FLD_PARAMETRI688_PARAMVARIAZI = 3;
  public static int FLD_PARAMETRI688_PARPREANINCO = 4;
  public static int FLD_PARAMETRI688_PARAMORDINAM = 5;
  public static int FLD_PARAMETRI688_PARATIPOSTRU = 6;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI86 = 1199;
  public static int FLD_PARAMETRI86_PARATIPOSTRU = 0;
  public static int FLD_PARAMETRI86_PARAPROUOSTR = 1;
  public static int FLD_PARAMETRI86_PARAMORDINAM = 2;
  public static int FLD_PARAMETRI86_PARPREANINCO = 3;
  public static int FLD_PARAMETRI86_PARAMVARIAZI = 4;

  // Definition of table: Parametri
  //
  public static int TBL_PARAMETRI5 = 1200;
  public static int FLD_PARAMETRI5_PARAANCUOSOT = 0;
  public static int FLD_PARAMETRI5_PARAMPARTE = 1;
  public static int FLD_PARAMETRI5_PARASOLOCOMP = 2;
  public static int FLD_PARAMETRI5_PARAMUOUTILI = 3;
  public static int FLD_PARAMETRI5_PARADATAELAB = 4;
  public static int FLD_PARAMETRI5_PARATIPOSTRU = 5;

}
