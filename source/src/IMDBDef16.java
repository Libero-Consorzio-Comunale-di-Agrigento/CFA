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
public class IMDBDef16 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI520 = 3605;
  public static int PQRY_PARAMETRI520_RS = 3606;
  public static int PQSL_PARAMETRI520_PARAMIMPEPER = 0;
  public static int PQSL_PARAMETRI520_PARASETTOPER = 1;
  public static int PQSL_PARAMETRI520_PARASERVOPER = 2;
  public static int PQSL_PARAMETRI520_PARACENDICOS = 3;
  public static int PQSL_PARAMETRI520_PARAMUOSUDDI = 4;
  public static int PQSL_PARAMETRI520_PARAMUOSOTTO = 5;
  public static int PQSL_PARAMETRI520_PARAMTITOLO = 6;
  public static int PQSL_PARAMETRI520_PARAINTECAPI = 7;
  public static int PQSL_PARAMETRI520_PARATIPDISPE = 8;
  public static int PQSL_PARAMETRI520_PARAMCAUSALE = 9;
  public static int PQSL_PARAMETRI520_PARATIPOVINC = 10;
  public static int PQSL_PARAMETRI520_PARAVINCSCAD = 11;
  public static int PQSL_PARAMETRI520_PARAMPROGRAM = 12;
  public static int PQSL_PARAMETRI520_PARAOBIEOPER = 13;
  public static int PQSL_PARAMETRI520_PARACONTSTRA = 14;
  public static int PQSL_PARAMETRI520_PARAMFLESSIB = 15;
  public static int PQSL_PARAMETRI520_PARAMRESPONS = 16;
  public static int PQSL_PARAMETRI520_PARAVOCEECON = 17;
  public static int PQSL_PARAMETRI520_PARACODIGEST = 18;
  public static int PQSL_PARAMETRI520_PARADETTRIEP = 19;
  public static int PQSL_PARAMETRI520_PARARESICOMP = 20;
  public static int PQSL_PARAMETRI520_PARASOLOPREN = 21;
  public static int PQSL_PARAMETRI520_PARADATAELAB = 22;
  public static int PQSL_PARAMETRI520_PARASOLOPROV = 23;
  public static int PQSL_PARAMETRI520_PARASOLODISP = 24;
  public static int PQSL_PARAMETRI520_PARAOBIESCAD = 25;
  public static int PQSL_PARAMETRI520_PARAMOBIETTI = 26;
  public static int PQSL_PARAMETRI520_PARACOMUZONA = 27;
  public static int PQSL_PARAMETRI520_PARAPROVZONA = 28;
  public static int PQSL_PARAMETRI520_PARACODICOFO = 29;
  public static int PQSL_PARAMETRI520_PARACODLIVE5 = 30;
  public static int PQSL_PARAMETRI520_PARACODIEURO = 31;
  public static int PQSL_PARAMETRI520_PARAMMISSION = 32;
  public static int PQSL_PARAMETRI520_PARAPROGMISS = 33;
  public static int PQSL_PARAMETRI520_PARAMCODLIV1 = 34;
  public static int PQSL_PARAMETRI520_PARAMCODLIV2 = 35;
  public static int PQSL_PARAMETRI520_PARAMUOSUDD2 = 36;
  public static int PQSL_PARAMETRI520_PARAEXPINEXC = 37;
  public static int PQSL_PARAMETRI520_PARDATESEDEL = 38;
  public static int PQSL_PARAMETRI520_PARAMDAL = 39;
  public static int PQSL_PARAMETRI520_PARAOBIEGEST = 40;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPCLA = 3607;
  public static int PQSL_CF4SITIMPCLA_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPCLA_CAPITOLO = 1;
  public static int PQSL_CF4SITIMPCLA_ARTICOLO = 2;
  public static int PQSL_CF4SITIMPCLA_RECORVOCEPEG = 3;
  public static int PQSL_CF4SITIMPCLA_RECCAPCODSTR = 4;
  public static int PQSL_CF4SITIMPCLA_CODLIVELLO4 = 5;
  public static int PQSL_CF4SITIMPCLA_TIPOIMPEGNO = 6;
  public static int PQSL_CF4SITIMPCLA_ANNO_IMPACC = 7;
  public static int PQSL_CF4SITIMPCLA_NUMERO_IMPACC = 8;
  public static int PQSL_CF4SITIMPCLA_RECORDIMPEGN = 9;
  public static int PQSL_CF4SITIMPCLA_DATA_IMPACC = 10;
  public static int PQSL_CF4SITIMPCLA_DEL_PROP = 11;
  public static int PQSL_CF4SITIMPCLA_OBBLIGATORIO = 12;
  public static int PQSL_CF4SITIMPCLA_RECFSIIMCLDI = 13;
  public static int PQSL_CF4SITIMPCLA_IMPORTO_IMPACC = 14;
  public static int PQSL_CF4SITIMPCLA_RECIMPIMACRE = 15;
  public static int PQSL_CF4SITIMPCLA_RECSUBIMPRES = 16;
  public static int PQSL_CF4SITIMPCLA_SUBIMPEGNATO = 17;
  public static int PQSL_CF4SITIMPCLA_LIQUIDATO = 18;
  public static int PQSL_CF4SITIMPCLA_RECOLIQURESI = 19;
  public static int PQSL_CF4SITIMPCLA_MAN_ORD = 20;
  public static int PQSL_CF4SITIMPCLA_RECMANORDRES = 21;
  public static int PQSL_CF4SITIMPCLA_DISPONIBILITA = 22;
  public static int PQSL_CF4SITIMPCLA_RECODISPRESI = 23;
  public static int PQSL_CF4SITIMPCLA_PROGR_UO_GEST = 24;
  public static int PQSL_CF4SITIMPCLA_DESCR_UO_GEST = 25;
  public static int PQSL_CF4SITIMPCLA_PROGR_UO_LIVELLO_SUP = 26;
  public static int PQSL_CF4SITIMPCLA_DESCR_UO_LIVELLO_SUP = 27;
  public static int PQSL_CF4SITIMPCLA_PROGR_UO_UTILIZZO = 28;
  public static int PQSL_CF4SITIMPCLA_DESCR_UO_UTILIZZO = 29;
  public static int PQSL_CF4SITIMPCLA_COMP_RES = 30;
  public static int PQSL_CF4SITIMPCLA_RECORRAGGRUO = 31;
  public static int PQSL_CF4SITIMPCLA_RECODESRAGUO = 32;
  public static int PQSL_CF4SITIMPCLA_RECRAGVOCPEG = 33;
  public static int PQSL_CF4SITIMPCLA_RECFSIIMCLDA = 34;
  public static int PQSL_CF4SITIMPCLA_RECFSIIMCLRS = 35;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPC10 = 3608;
  public static int PQSL_CF4SITIMPC10_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPC10_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITIMPC10_CAPITOLO = 2;
  public static int PQSL_CF4SITIMPC10_ARTICOLO = 3;
  public static int PQSL_CF4SITIMPC10_RECCAPCODSTR = 4;
  public static int PQSL_CF4SITIMPC10_CODLIVELLO4 = 5;
  public static int PQSL_CF4SITIMPC10_ANNO_IMPACC = 6;
  public static int PQSL_CF4SITIMPC10_NUMERO_IMPACC = 7;
  public static int PQSL_CF4SITIMPC10_DATA_IMPACC = 8;
  public static int PQSL_CF4SITIMPC10_DEL_PROP = 9;
  public static int PQSL_CF4SITIMPC10_OBBLIGATORIO = 10;
  public static int PQSL_CF4SITIMPC10_DESCR_IMPACC = 11;
  public static int PQSL_CF4SITIMPC10_IMPORTO_IMPACC = 12;
  public static int PQSL_CF4SITIMPC10_SUBIMPEGNATO = 13;
  public static int PQSL_CF4SITIMPC10_LIQUIDATO = 14;
  public static int PQSL_CF4SITIMPC10_MAN_ORD = 15;
  public static int PQSL_CF4SITIMPC10_DISPONIBILITA = 16;
  public static int PQSL_CF4SITIMPC10_PROGR_UO_GEST = 17;
  public static int PQSL_CF4SITIMPC10_DESCR_UO_GEST = 18;
  public static int PQSL_CF4SITIMPC10_PROGR_UO_LIVELLO_SUP = 19;
  public static int PQSL_CF4SITIMPC10_DESCR_UO_LIVELLO_SUP = 20;
  public static int PQSL_CF4SITIMPC10_PROGR_UO_UTILIZZO = 21;
  public static int PQSL_CF4SITIMPC10_DESCR_UO_UTILIZZO = 22;
  public static int PQSL_CF4SITIMPC10_RECORRAGGRUO = 23;
  public static int PQSL_CF4SITIMPC10_RECODESRAGUO = 24;
  public static int PQSL_CF4SITIMPC10_RECRAGVOCPEG = 25;
  public static int PQSL_CF4SITIMPC10_IMPORTO_IMPACC_RES = 26;
  public static int PQSL_CF4SITIMPC10_SUBIMPEGNATO_RES = 27;
  public static int PQSL_CF4SITIMPC10_LIQUIDATO_RES = 28;
  public static int PQSL_CF4SITIMPC10_MAN_ORD_RES = 29;
  public static int PQSL_CF4SITIMPC10_DISPONIBILITA_RES = 30;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPC11 = 3609;
  public static int PQSL_CF4SITIMPC11_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPC11_CAPITOLO = 1;
  public static int PQSL_CF4SITIMPC11_ARTICOLO = 2;
  public static int PQSL_CF4SITIMPC11_ANNO_IMPACC = 3;
  public static int PQSL_CF4SITIMPC11_NUMERO_IMPACC = 4;
  public static int PQSL_CF4SITIMPC11_DATA_IMPACC = 5;
  public static int PQSL_CF4SITIMPC11_DEL_PROP = 6;
  public static int PQSL_CF4SITIMPC11_OBBLIGATORIO = 7;
  public static int PQSL_CF4SITIMPC11_DESCR_IMPACC = 8;
  public static int PQSL_CF4SITIMPC11_IMPORTO_IMPACC = 9;
  public static int PQSL_CF4SITIMPC11_SUBIMPEGNATO = 10;
  public static int PQSL_CF4SITIMPC11_LIQUIDATO = 11;
  public static int PQSL_CF4SITIMPC11_MAN_ORD = 12;
  public static int PQSL_CF4SITIMPC11_DISPONIBILITA = 13;
  public static int PQSL_CF4SITIMPC11_PROGR_UO_GEST = 14;
  public static int PQSL_CF4SITIMPC11_DESCR_UO_GEST = 15;
  public static int PQSL_CF4SITIMPC11_PROGR_UO_LIVELLO_SUP = 16;
  public static int PQSL_CF4SITIMPC11_DESCR_UO_LIVELLO_SUP = 17;
  public static int PQSL_CF4SITIMPC11_PROGR_UO_UTILIZZO = 18;
  public static int PQSL_CF4SITIMPC11_DESCR_UO_UTILIZZO = 19;
  public static int PQSL_CF4SITIMPC11_RECODESRAGUO = 20;
  public static int PQSL_CF4SITIMPC11_IMPORTO_IMPACC_RES = 21;
  public static int PQSL_CF4SITIMPC11_SUBIMPEGNATO_RES = 22;
  public static int PQSL_CF4SITIMPC11_LIQUIDATO_RES = 23;
  public static int PQSL_CF4SITIMPC11_MAN_ORD_RES = 24;
  public static int PQSL_CF4SITIMPC11_DISPONIBILITA_RES = 25;

  // Table to contain panel selected row: Subimpegni Per Beneficiario
  //
  public static int PQRY_SUBIMPERBEN2 = 3610;
  public static int PQRY_SUBIMPERBEN2_RS = 3611;
  public static int PQSL_SUBIMPERBEN2_ROWNAMERESID = 0;
  public static int PQSL_SUBIMPERBEN2_ROWNAMDATELA = 1;
  public static int PQSL_SUBIMPERBEN2_ROWNAMCODBEN = 2;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR61 = 3612;
  public static int PQRY_PAR61_RS = 3613;
  public static int PQSL_PAR61_ROWNAMEESPOS = 0;
  public static int PQSL_PAR61_ROWNAMEFATTO = 1;
  public static int PQSL_PAR61_ROWNAMECENTR = 2;
  public static int PQSL_PAR61_ROWNAMEDAL = 3;
  public static int PQSL_PAR61_ROWNAMEAL = 4;
  public static int PQSL_PAR61_ROWNAMECOMPT = 5;
  public static int PQSL_PAR61_ROWNAMSORIEC = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR43 = 3614;
  public static int PQRY_PAR43_RS = 3615;
  public static int PQSL_PAR43_ROWNAMECAPIT = 0;
  public static int PQSL_PAR43_ROWNAMEARTIC = 1;
  public static int PQSL_PAR43_ROWNAMDETRIE = 2;
  public static int PQSL_PAR43_ROWNAMSOLPRE = 3;
  public static int PQSL_PAR43_ROWNAMSOLPRO = 4;
  public static int PQSL_PAR43_ROWNAMSOLDIS = 5;
  public static int PQSL_PAR43_ROWNAMANNRES = 6;
  public static int PQSL_PAR43_ROWNAMDATELA = 7;
  public static int PQSL_PAR43_ROWNAMRESCOM = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI364 = 3616;
  public static int PQRY_PARAMETRI364_RS = 3617;
  public static int PQSL_PARAMETRI364_PARSUBIMPPER = 0;
  public static int PQSL_PARAMETRI364_PARASETTOPER = 1;
  public static int PQSL_PARAMETRI364_PARASERVOPER = 2;
  public static int PQSL_PARAMETRI364_PARACENDICOS = 3;
  public static int PQSL_PARAMETRI364_PARAMUOSUDDI = 4;
  public static int PQSL_PARAMETRI364_PARAMUOSOTTO = 5;
  public static int PQSL_PARAMETRI364_PARAMTITOLO = 6;
  public static int PQSL_PARAMETRI364_PARAINTECAPI = 7;
  public static int PQSL_PARAMETRI364_PARATIPDISPE = 8;
  public static int PQSL_PARAMETRI364_PARAMCAUSALE = 9;
  public static int PQSL_PARAMETRI364_PARATIPOVINC = 10;
  public static int PQSL_PARAMETRI364_PARAVINCSCAD = 11;
  public static int PQSL_PARAMETRI364_PARAMPROGRAM = 12;
  public static int PQSL_PARAMETRI364_PARAMPROGETT = 13;
  public static int PQSL_PARAMETRI364_PARACONTSTRA = 14;
  public static int PQSL_PARAMETRI364_PARAMFLESSIB = 15;
  public static int PQSL_PARAMETRI364_PARAMRESPONS = 16;
  public static int PQSL_PARAMETRI364_PARAVOCEECON = 17;
  public static int PQSL_PARAMETRI364_PARACODIGEST = 18;
  public static int PQSL_PARAMETRI364_PARADETTRIEP = 19;
  public static int PQSL_PARAMETRI364_PARARESICOMP = 20;
  public static int PQSL_PARAMETRI364_PARADATAELAB = 21;
  public static int PQSL_PARAMETRI364_PARASOLOPROV = 22;
  public static int PQSL_PARAMETRI364_PARASOLOPRE1 = 23;
  public static int PQSL_PARAMETRI364_PARASOLODISP = 24;
  public static int PQSL_PARAMETRI364_PARAOBIESCAD = 25;
  public static int PQSL_PARAMETRI364_PARAMOBIETTI = 26;
  public static int PQSL_PARAMETRI364_PARACOMUZONA = 27;
  public static int PQSL_PARAMETRI364_PARAPROVZONA = 28;
  public static int PQSL_PARAMETRI364_PARACODICOFO = 29;
  public static int PQSL_PARAMETRI364_PARACODLIVE5 = 30;
  public static int PQSL_PARAMETRI364_PARACODIEURO = 31;
  public static int PQSL_PARAMETRI364_PARAMMISSION = 32;
  public static int PQSL_PARAMETRI364_PARAPROGMISS = 33;
  public static int PQSL_PARAMETRI364_PARAMCODLIV1 = 34;
  public static int PQSL_PARAMETRI364_PARAMCODLIV2 = 35;
  public static int PQSL_PARAMETRI364_PARAMUOSUDD2 = 36;
  public static int PQSL_PARAMETRI364_PARAEXPINEXC = 37;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPCL3 = 3618;
  public static int PQSL_CF4SITIMPCL3_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPCL3_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITIMPCL3_CAPITOLO = 2;
  public static int PQSL_CF4SITIMPCL3_ARTICOLO = 3;
  public static int PQSL_CF4SITIMPCL3_RECORSUBIMPE = 4;
  public static int PQSL_CF4SITIMPCL3_ANNO_SUBIMP = 5;
  public static int PQSL_CF4SITIMPCL3_NUMERO_SUBIMP = 6;
  public static int PQSL_CF4SITIMPCL3_RECORDIMPEGN = 7;
  public static int PQSL_CF4SITIMPCL3_ANNO_IMPACC = 8;
  public static int PQSL_CF4SITIMPCL3_NUMERO_IMPACC = 9;
  public static int PQSL_CF4SITIMPCL3_DATA_IMPACC = 10;
  public static int PQSL_CF4SITIMPCL3_DEL_PROP = 11;
  public static int PQSL_CF4SITIMPCL3_OBBLIGATORIO = 12;
  public static int PQSL_CF4SITIMPCL3_DESCR_IMPACC = 13;
  public static int PQSL_CF4SITIMPCL3_IMPORTO_IMPACC = 14;
  public static int PQSL_CF4SITIMPCL3_RECIMPIMACRE = 15;
  public static int PQSL_CF4SITIMPCL3_SUBIMPEGNATO = 16;
  public static int PQSL_CF4SITIMPCL3_RECSUBIMPRES = 17;
  public static int PQSL_CF4SITIMPCL3_LIQUIDATO = 18;
  public static int PQSL_CF4SITIMPCL3_RECOLIQURESI = 19;
  public static int PQSL_CF4SITIMPCL3_MAN_ORD = 20;
  public static int PQSL_CF4SITIMPCL3_RECMANORDRES = 21;
  public static int PQSL_CF4SITIMPCL3_DISPONIBILITA = 22;
  public static int PQSL_CF4SITIMPCL3_RECODISPRESI = 23;
  public static int PQSL_CF4SITIMPCL3_PROGR_UO_GEST = 24;
  public static int PQSL_CF4SITIMPCL3_DESCR_UO_GEST = 25;
  public static int PQSL_CF4SITIMPCL3_PROGR_UO_LIVELLO_SUP = 26;
  public static int PQSL_CF4SITIMPCL3_DESCR_UO_LIVELLO_SUP = 27;
  public static int PQSL_CF4SITIMPCL3_PROGR_UO_UTILIZZO = 28;
  public static int PQSL_CF4SITIMPCL3_DESCR_UO_UTILIZZO = 29;
  public static int PQSL_CF4SITIMPCL3_COMP_RES = 30;
  public static int PQSL_CF4SITIMPCL3_RECORRAGGRUO = 31;
  public static int PQSL_CF4SITIMPCL3_RECODESRAGUO = 32;
  public static int PQSL_CF4SITIMPCL3_RECRAGVOCPEG = 33;
  public static int PQSL_CF4SITIMPCL3_RECORAGISOCI = 34;

  // Table to contain panel selected row: Subimpegni Per Beneficiario
  //
  public static int PQRY_SUBIMPERBEN1 = 3619;
  public static int PQRY_SUBIMPERBEN1_RS = 3620;
  public static int PQSL_SUBIMPERBEN1_ROWNAMERESID = 0;
  public static int PQSL_SUBIMPERBEN1_ROWNAMDATELA = 1;
  public static int PQSL_SUBIMPERBEN1_ROWNAMCODBEN = 2;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR41 = 3621;
  public static int PQRY_PAR41_RS = 3622;
  public static int PQSL_PAR41_ROWNAMEESPOS = 0;
  public static int PQSL_PAR41_ROWNAMEFATTO = 1;
  public static int PQSL_PAR41_ROWNAMECENTR = 2;
  public static int PQSL_PAR41_ROWNAMEDAL = 3;
  public static int PQSL_PAR41_ROWNAMEAL = 4;
  public static int PQSL_PAR41_ROWNAMECOMPT = 5;
  public static int PQSL_PAR41_ROWNAMSORIEC = 6;

  // Table to contain panel selected row: Subimpegni Per Voce P E G
  //
  public static int PQRY_SUBPERVOCPE1 = 3623;
  public static int PQRY_SUBPERVOCPE1_RS = 3624;
  public static int PQSL_SUBPERVOCPE1_ROWNAMECAPIT = 0;
  public static int PQSL_SUBPERVOCPE1_ROWNAMEARTIC = 1;
  public static int PQSL_SUBPERVOCPE1_ROWNAMANNRES = 2;
  public static int PQSL_SUBPERVOCPE1_ROWNAMDATELA = 3;
  public static int PQSL_SUBPERVOCPE1_ROWNAMSOLPRO = 4;
  public static int PQSL_SUBPERVOCPE1_ROWNAMSOLDIS = 5;
  public static int PQSL_SUBPERVOCPE1_ROWNAMECOMPE = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI367 = 3625;
  public static int PQRY_PARAMETRI367_RS = 3626;
  public static int PQSL_PARAMETRI367_PARAMLIQUPER = 0;
  public static int PQSL_PARAMETRI367_PARAMFUNZION = 1;
  public static int PQSL_PARAMETRI367_PARAMSERVIZI = 2;
  public static int PQSL_PARAMETRI367_PARASETTOPER = 3;
  public static int PQSL_PARAMETRI367_PARASERVOPER = 4;
  public static int PQSL_PARAMETRI367_PARACENDICOS = 5;
  public static int PQSL_PARAMETRI367_PARAMUOSUDDI = 6;
  public static int PQSL_PARAMETRI367_PARAMUOSOTTO = 7;
  public static int PQSL_PARAMETRI367_PARAMTITOLO = 8;
  public static int PQSL_PARAMETRI367_PARAINTECAPI = 9;
  public static int PQSL_PARAMETRI367_PARATIPDISPE = 10;
  public static int PQSL_PARAMETRI367_PARAMCAUSALE = 11;
  public static int PQSL_PARAMETRI367_PARATIPOVINC = 12;
  public static int PQSL_PARAMETRI367_PARAVINCSCAD = 13;
  public static int PQSL_PARAMETRI367_PARAMPROGRAM = 14;
  public static int PQSL_PARAMETRI367_PARAMPROGETT = 15;
  public static int PQSL_PARAMETRI367_PARACONTSTRA = 16;
  public static int PQSL_PARAMETRI367_PARAMRESPONS = 17;
  public static int PQSL_PARAMETRI367_PARAVOCEECON = 18;
  public static int PQSL_PARAMETRI367_PARACODIGEST = 19;
  public static int PQSL_PARAMETRI367_PARADETTRIEP = 20;
  public static int PQSL_PARAMETRI367_PARARESICOMP = 21;
  public static int PQSL_PARAMETRI367_PARADATAELAB = 22;
  public static int PQSL_PARAMETRI367_PARASOLOEMES = 23;
  public static int PQSL_PARAMETRI367_PARACODICOFO = 24;
  public static int PQSL_PARAMETRI367_PARAMMISSION = 25;
  public static int PQSL_PARAMETRI367_PARAPROGMISS = 26;
  public static int PQSL_PARAMETRI367_PARAMVLIVELL = 27;
  public static int PQSL_PARAMETRI367_PARAMCODEURO = 28;
  public static int PQSL_PARAMETRI367_PARAMCODLIV1 = 29;
  public static int PQSL_PARAMETRI367_PARAMCODLIV2 = 30;
  public static int PQSL_PARAMETRI367_PARAEXPINEXC = 31;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCL1 = 3627;
  public static int PQSL_CF4SITMOVCL1_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCL1_CAPITOLO = 1;
  public static int PQSL_CF4SITMOVCL1_ARTICOLO = 2;
  public static int PQSL_CF4SITMOVCL1_RECORVOCEPEG = 3;
  public static int PQSL_CF4SITMOVCL1_ANNO_IMPACC = 4;
  public static int PQSL_CF4SITMOVCL1_NUMERO_IMPACC = 5;
  public static int PQSL_CF4SITMOVCL1_RECORDIMPEGN = 6;
  public static int PQSL_CF4SITMOVCL1_DATA_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCL1_ANNO_LIQPRE = 8;
  public static int PQSL_CF4SITMOVCL1_NUMERO_LIQPRE = 9;
  public static int PQSL_CF4SITMOVCL1_ANNO_SUBIMP = 10;
  public static int PQSL_CF4SITMOVCL1_NUMERO_SUBIMP = 11;
  public static int PQSL_CF4SITMOVCL1_RECORSUBIMPE = 12;
  public static int PQSL_CF4SITMOVCL1_ANNO_MANORD = 13;
  public static int PQSL_CF4SITMOVCL1_NUMERO_MANORD = 14;
  public static int PQSL_CF4SITMOVCL1_DESCRIZIONE = 15;
  public static int PQSL_CF4SITMOVCL1_ANNO_DOC = 16;
  public static int PQSL_CF4SITMOVCL1_NUMERO_DOC = 17;
  public static int PQSL_CF4SITMOVCL1_IMPORTO_LIQPRE = 18;
  public static int PQSL_CF4SITMOVCL1_RECIMPLIPRRE = 19;
  public static int PQSL_CF4SITMOVCL1_PROGR_UO_GEST = 20;
  public static int PQSL_CF4SITMOVCL1_DESCR_UO_GEST = 21;
  public static int PQSL_CF4SITMOVCL1_PROGR_UO_LIVELLO_SUP = 22;
  public static int PQSL_CF4SITMOVCL1_DESCR_UO_LIVELLO_SUP = 23;
  public static int PQSL_CF4SITMOVCL1_PROGR_UO_UTILIZZO = 24;
  public static int PQSL_CF4SITMOVCL1_DESCR_UO_UTILIZZO = 25;
  public static int PQSL_CF4SITMOVCL1_COMP_RES = 26;
  public static int PQSL_CF4SITMOVCL1_RECORRAGGRUO = 27;
  public static int PQSL_CF4SITMOVCL1_RECODESRAGUO = 28;
  public static int PQSL_CF4SITMOVCL1_RECRAGVOCPEG = 29;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCL2 = 3628;
  public static int PQSL_CF4SITMOVCL2_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCL2_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITMOVCL2_CAPITOLO = 2;
  public static int PQSL_CF4SITMOVCL2_ARTICOLO = 3;
  public static int PQSL_CF4SITMOVCL2_ANNO_IMPACC = 4;
  public static int PQSL_CF4SITMOVCL2_NUMERO_IMPACC = 5;
  public static int PQSL_CF4SITMOVCL2_DATA_LIQPRE = 6;
  public static int PQSL_CF4SITMOVCL2_ANNO_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCL2_NUMERO_LIQPRE = 8;
  public static int PQSL_CF4SITMOVCL2_ANNO_SUBIMP = 9;
  public static int PQSL_CF4SITMOVCL2_NUMERO_SUBIMP = 10;
  public static int PQSL_CF4SITMOVCL2_ANNO_MANORD = 11;
  public static int PQSL_CF4SITMOVCL2_NUMERO_MANORD = 12;
  public static int PQSL_CF4SITMOVCL2_DESCRIZIONE = 13;
  public static int PQSL_CF4SITMOVCL2_ANNO_DOC = 14;
  public static int PQSL_CF4SITMOVCL2_NUMERO_DOC = 15;
  public static int PQSL_CF4SITMOVCL2_IMPORTO_LIQPRE = 16;
  public static int PQSL_CF4SITMOVCL2_IMPORTO_LIQPRE_RES = 17;
  public static int PQSL_CF4SITMOVCL2_PROGR_UO_GEST = 18;
  public static int PQSL_CF4SITMOVCL2_DESCR_UO_GEST = 19;
  public static int PQSL_CF4SITMOVCL2_PROGR_UO_LIVELLO_SUP = 20;
  public static int PQSL_CF4SITMOVCL2_DESCR_UO_LIVELLO_SUP = 21;
  public static int PQSL_CF4SITMOVCL2_PROGR_UO_UTILIZZO = 22;
  public static int PQSL_CF4SITMOVCL2_DESCR_UO_UTILIZZO = 23;
  public static int PQSL_CF4SITMOVCL2_COMP_RES = 24;
  public static int PQSL_CF4SITMOVCL2_RECORRAGGRUO = 25;
  public static int PQSL_CF4SITMOVCL2_RECODESRAGUO = 26;
  public static int PQSL_CF4SITMOVCL2_RECTOTVOCPEG = 27;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCLA = 3629;
  public static int PQSL_CF4SITMOVCLA_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCLA_CAPITOLO = 1;
  public static int PQSL_CF4SITMOVCLA_ARTICOLO = 2;
  public static int PQSL_CF4SITMOVCLA_ANNO_IMPACC = 3;
  public static int PQSL_CF4SITMOVCLA_NUMERO_IMPACC = 4;
  public static int PQSL_CF4SITMOVCLA_DATA_LIQPRE = 5;
  public static int PQSL_CF4SITMOVCLA_ANNO_LIQPRE = 6;
  public static int PQSL_CF4SITMOVCLA_NUMERO_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCLA_ANNO_SUBIMP = 8;
  public static int PQSL_CF4SITMOVCLA_NUMERO_SUBIMP = 9;
  public static int PQSL_CF4SITMOVCLA_ANNO_MANORD = 10;
  public static int PQSL_CF4SITMOVCLA_NUMERO_MANORD = 11;
  public static int PQSL_CF4SITMOVCLA_DESCRIZIONE = 12;
  public static int PQSL_CF4SITMOVCLA_ANNO_DOC = 13;
  public static int PQSL_CF4SITMOVCLA_NUMERO_DOC = 14;
  public static int PQSL_CF4SITMOVCLA_IMPORTO_LIQPRE = 15;
  public static int PQSL_CF4SITMOVCLA_IMPORTO_LIQPRE_RES = 16;
  public static int PQSL_CF4SITMOVCLA_PROGR_UO_GEST = 17;
  public static int PQSL_CF4SITMOVCLA_DESCR_UO_GEST = 18;
  public static int PQSL_CF4SITMOVCLA_PROGR_UO_LIVELLO_SUP = 19;
  public static int PQSL_CF4SITMOVCLA_DESCR_UO_LIVELLO_SUP = 20;
  public static int PQSL_CF4SITMOVCLA_PROGR_UO_UTILIZZO = 21;
  public static int PQSL_CF4SITMOVCLA_DESCR_UO_UTILIZZO = 22;
  public static int PQSL_CF4SITMOVCLA_COMP_RES = 23;
  public static int PQSL_CF4SITMOVCLA_RECODESRAGUO = 24;
  public static int PQSL_CF4SITMOVCLA_RECORTOTALUO = 25;

  // Table to contain panel selected row: Liquidazioni Per Beneficiario
  //
  public static int PQRY_LIQUIPERBEN1 = 3630;
  public static int PQRY_LIQUIPERBEN1_RS = 3631;
  public static int PQSL_LIQUIPERBEN1_ROWNAMECOM = 0;
  public static int PQSL_LIQUIPERBEN1_ROWNAMSOLEME = 1;
  public static int PQSL_LIQUIPERBEN1_ROWNAMEORDIN = 2;
  public static int PQSL_LIQUIPERBEN1_ROWNAMDATELA = 3;
  public static int PQSL_LIQUIPERBEN1_ROWNAMCODBEN = 4;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR47 = 3632;
  public static int PQRY_PAR47_RS = 3633;
  public static int PQSL_PAR47_ROWNAMENUMER = 0;
  public static int PQSL_PAR47_ROWNAMEDATA = 1;
  public static int PQSL_PAR47_ROWNAMECOMP = 2;
  public static int PQSL_PAR47_ROWNAMDATELA = 3;
  public static int PQSL_PAR47_ROWNAMSOLEME = 4;

  // Table to contain panel selected row: Subimpegni Per Voce P E G
  //
  public static int PQRY_SUBPERVOCPE2 = 3634;
  public static int PQRY_SUBPERVOCPE2_RS = 3635;
  public static int PQSL_SUBPERVOCPE2_ROWNAMECAPIT = 0;
  public static int PQSL_SUBPERVOCPE2_ROWNAMEARTIC = 1;
  public static int PQSL_SUBPERVOCPE2_ROWNAMDATELA = 2;
  public static int PQSL_SUBPERVOCPE2_ROWNAMSOLEME = 3;
  public static int PQSL_SUBPERVOCPE2_ROWNAMECOMPE = 4;
  public static int PQSL_SUBPERVOCPE2_ROWNAMNUMIMP = 5;
  public static int PQSL_SUBPERVOCPE2_ROWNAMANNIMP = 6;

  // Table to contain panel selected row: Subimpegni Per Voce P E G
  //
  public static int PQRY_SUBPERVOCPE4 = 3636;
  public static int PQRY_SUBPERVOCPE4_RS = 3637;
  public static int PQSL_SUBPERVOCPE4_ROWNAMECAPIT = 0;
  public static int PQSL_SUBPERVOCPE4_ROWNAMEARTIC = 1;
  public static int PQSL_SUBPERVOCPE4_ROWNAMDATELA = 2;
  public static int PQSL_SUBPERVOCPE4_ROWNAMSOLEME = 3;
  public static int PQSL_SUBPERVOCPE4_ROWNAMECOMPE = 4;
  public static int PQSL_SUBPERVOCPE4_ROWNAMNUMSUB = 5;
  public static int PQSL_SUBPERVOCPE4_ROWNAMANNSUB = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR49 = 3638;
  public static int PQRY_PAR49_RS = 3639;
  public static int PQSL_PAR49_ROWNAMEESPOS = 0;
  public static int PQSL_PAR49_ROWNAMEFATTO = 1;
  public static int PQSL_PAR49_ROWNAMECENTR = 2;
  public static int PQSL_PAR49_ROWNAMEDAL = 3;
  public static int PQSL_PAR49_ROWNAMEAL = 4;
  public static int PQSL_PAR49_ROWNAMEORDIN = 5;
  public static int PQSL_PAR49_ROWNAMUNIPRO = 6;
  public static int PQSL_PAR49_ROWNAMNUMPRO = 7;
  public static int PQSL_PAR49_ROWNAMANNPRO = 8;
  public static int PQSL_PAR49_ROWNAMSEDDEL = 9;
  public static int PQSL_PAR49_ROWNAMNUMDEL = 10;
  public static int PQSL_PAR49_ROWNAMANNDEL = 11;
  public static int PQSL_PAR49_ROWNAMETIPO = 12;
  public static int PQSL_PAR49_ROWNAMDALECO = 13;
  public static int PQSL_PAR49_ROWNAMEALECO = 14;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI369 = 3640;
  public static int PQRY_PARAMETRI369_RS = 3641;
  public static int PQSL_PARAMETRI369_PARAMORDIPER = 0;
  public static int PQSL_PARAMETRI369_PARAMFUNZION = 1;
  public static int PQSL_PARAMETRI369_PARAMSERVIZI = 2;
  public static int PQSL_PARAMETRI369_PARASETTOPER = 3;
  public static int PQSL_PARAMETRI369_PARASERVOPER = 4;
  public static int PQSL_PARAMETRI369_PARACENDICOS = 5;
  public static int PQSL_PARAMETRI369_PARAMUOSUDDI = 6;
  public static int PQSL_PARAMETRI369_PARAMUOSOTTO = 7;
  public static int PQSL_PARAMETRI369_PARAMTITOLO = 8;
  public static int PQSL_PARAMETRI369_PARACATECAPI = 9;
  public static int PQSL_PARAMETRI369_PARAMCAUSALE = 10;
  public static int PQSL_PARAMETRI369_PARATIPOVINC = 11;
  public static int PQSL_PARAMETRI369_PARAVINCSCAD = 12;
  public static int PQSL_PARAMETRI369_PARAMPROGRAM = 13;
  public static int PQSL_PARAMETRI369_PARAMPROGETT = 14;
  public static int PQSL_PARAMETRI369_PARAMRESPONS = 15;
  public static int PQSL_PARAMETRI369_PARAVOCEECON = 16;
  public static int PQSL_PARAMETRI369_PARACODIGEST = 17;
  public static int PQSL_PARAMETRI369_PARADETTRIEP = 18;
  public static int PQSL_PARAMETRI369_PARARESICOMP = 19;
  public static int PQSL_PARAMETRI369_PARADATAELAB = 20;
  public static int PQSL_PARAMETRI369_PARAMVLIVELL = 21;
  public static int PQSL_PARAMETRI369_PARAMCODEURO = 22;
  public static int PQSL_PARAMETRI369_PARAMTITOLO1 = 23;
  public static int PQSL_PARAMETRI369_PARAMTIPOLOG = 24;
  public static int PQSL_PARAMETRI369_PARAMCATEGOR = 25;
  public static int PQSL_PARAMETRI369_PARAEXPINEXC = 26;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCL3 = 3642;
  public static int PQSL_CF4SITMOVCL3_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCL3_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITMOVCL3_CAPITOLO = 2;
  public static int PQSL_CF4SITMOVCL3_ARTICOLO = 3;
  public static int PQSL_CF4SITMOVCL3_RECORDACCERT = 4;
  public static int PQSL_CF4SITMOVCL3_ANNO_IMPACC = 5;
  public static int PQSL_CF4SITMOVCL3_NUMERO_IMPACC = 6;
  public static int PQSL_CF4SITMOVCL3_DATA_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCL3_ANNO_LIQPRE = 8;
  public static int PQSL_CF4SITMOVCL3_NUMERO_LIQPRE = 9;
  public static int PQSL_CF4SITMOVCL3_ANNO_SUBIMP = 10;
  public static int PQSL_CF4SITMOVCL3_NUMERO_SUBIMP = 11;
  public static int PQSL_CF4SITMOVCL3_ANNO_MANORD = 12;
  public static int PQSL_CF4SITMOVCL3_NUMERO_MANORD = 13;
  public static int PQSL_CF4SITMOVCL3_DESCRIZIONE = 14;
  public static int PQSL_CF4SITMOVCL3_ANNO_DOC = 15;
  public static int PQSL_CF4SITMOVCL3_NUMERO_DOC = 16;
  public static int PQSL_CF4SITMOVCL3_IMPORTO_LIQPRE = 17;
  public static int PQSL_CF4SITMOVCL3_RECIMPLIPRRE = 18;
  public static int PQSL_CF4SITMOVCL3_PAGATO_INCASSATO = 19;
  public static int PQSL_CF4SITMOVCL3_REPAINLIPRRE = 20;
  public static int PQSL_CF4SITMOVCL3_PROGR_UO_GEST = 21;
  public static int PQSL_CF4SITMOVCL3_DESCR_UO_GEST = 22;
  public static int PQSL_CF4SITMOVCL3_PROGR_UO_LIVELLO_SUP = 23;
  public static int PQSL_CF4SITMOVCL3_DESCR_UO_LIVELLO_SUP = 24;
  public static int PQSL_CF4SITMOVCL3_PROGR_UO_UTILIZZO = 25;
  public static int PQSL_CF4SITMOVCL3_DESCR_UO_UTILIZZO = 26;
  public static int PQSL_CF4SITMOVCL3_COMP_RES = 27;
  public static int PQSL_CF4SITMOVCL3_RECORRAGGRUO = 28;
  public static int PQSL_CF4SITMOVCL3_RECODESRAGUO = 29;
  public static int PQSL_CF4SITMOVCL3_RECRAGVOCPEG = 30;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCL4 = 3643;
  public static int PQSL_CF4SITMOVCL4_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCL4_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITMOVCL4_CAPITOLO = 2;
  public static int PQSL_CF4SITMOVCL4_ARTICOLO = 3;
  public static int PQSL_CF4SITMOVCL4_ANNO_IMPACC = 4;
  public static int PQSL_CF4SITMOVCL4_NUMERO_IMPACC = 5;
  public static int PQSL_CF4SITMOVCL4_DATA_LIQPRE = 6;
  public static int PQSL_CF4SITMOVCL4_ANNO_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCL4_NUMERO_LIQPRE = 8;
  public static int PQSL_CF4SITMOVCL4_ANNO_SUBIMP = 9;
  public static int PQSL_CF4SITMOVCL4_NUMERO_SUBIMP = 10;
  public static int PQSL_CF4SITMOVCL4_ANNO_MANORD = 11;
  public static int PQSL_CF4SITMOVCL4_NUMERO_MANORD = 12;
  public static int PQSL_CF4SITMOVCL4_DESCRIZIONE = 13;
  public static int PQSL_CF4SITMOVCL4_ANNO_DOC = 14;
  public static int PQSL_CF4SITMOVCL4_NUMERO_DOC = 15;
  public static int PQSL_CF4SITMOVCL4_IMPORTO_LIQPRE = 16;
  public static int PQSL_CF4SITMOVCL4_IMPORTO_LIQPRE_RES = 17;
  public static int PQSL_CF4SITMOVCL4_PROGR_UO_GEST = 18;
  public static int PQSL_CF4SITMOVCL4_DESCR_UO_GEST = 19;
  public static int PQSL_CF4SITMOVCL4_PROGR_UO_LIVELLO_SUP = 20;
  public static int PQSL_CF4SITMOVCL4_DESCR_UO_LIVELLO_SUP = 21;
  public static int PQSL_CF4SITMOVCL4_PROGR_UO_UTILIZZO = 22;
  public static int PQSL_CF4SITMOVCL4_DESCR_UO_UTILIZZO = 23;
  public static int PQSL_CF4SITMOVCL4_COMP_RES = 24;
  public static int PQSL_CF4SITMOVCL4_RECORRAGGRUO = 25;
  public static int PQSL_CF4SITMOVCL4_RECODESRAGUO = 26;
  public static int PQSL_CF4SITMOVCL4_RECTOTVOCPEG = 27;

  // Table to contain panel selected row: CF4WEB SIT MOVI CLASSIF
  //
  public static int PQRY_CF4SITMOVCL5 = 3644;
  public static int PQSL_CF4SITMOVCL5_PROGRESSIVO = 0;
  public static int PQSL_CF4SITMOVCL5_CAPITOLO = 1;
  public static int PQSL_CF4SITMOVCL5_ARTICOLO = 2;
  public static int PQSL_CF4SITMOVCL5_ANNO_IMPACC = 3;
  public static int PQSL_CF4SITMOVCL5_NUMERO_IMPACC = 4;
  public static int PQSL_CF4SITMOVCL5_DATA_LIQPRE = 5;
  public static int PQSL_CF4SITMOVCL5_ANNO_LIQPRE = 6;
  public static int PQSL_CF4SITMOVCL5_NUMERO_LIQPRE = 7;
  public static int PQSL_CF4SITMOVCL5_ANNO_SUBIMP = 8;
  public static int PQSL_CF4SITMOVCL5_NUMERO_SUBIMP = 9;
  public static int PQSL_CF4SITMOVCL5_ANNO_MANORD = 10;
  public static int PQSL_CF4SITMOVCL5_NUMERO_MANORD = 11;
  public static int PQSL_CF4SITMOVCL5_DESCRIZIONE = 12;
  public static int PQSL_CF4SITMOVCL5_ANNO_DOC = 13;
  public static int PQSL_CF4SITMOVCL5_NUMERO_DOC = 14;
  public static int PQSL_CF4SITMOVCL5_IMPORTO_LIQPRE = 15;
  public static int PQSL_CF4SITMOVCL5_IMPORTO_LIQPRE_RES = 16;
  public static int PQSL_CF4SITMOVCL5_PROGR_UO_GEST = 17;
  public static int PQSL_CF4SITMOVCL5_DESCR_UO_GEST = 18;
  public static int PQSL_CF4SITMOVCL5_PROGR_UO_LIVELLO_SUP = 19;
  public static int PQSL_CF4SITMOVCL5_DESCR_UO_LIVELLO_SUP = 20;
  public static int PQSL_CF4SITMOVCL5_PROGR_UO_UTILIZZO = 21;
  public static int PQSL_CF4SITMOVCL5_DESCR_UO_UTILIZZO = 22;
  public static int PQSL_CF4SITMOVCL5_COMP_RES = 23;
  public static int PQSL_CF4SITMOVCL5_RECODESRAGUO = 24;
  public static int PQSL_CF4SITMOVCL5_RECORTOTALUO = 25;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR35 = 3645;
  public static int PQRY_PAR35_RS = 3646;
  public static int PQSL_PAR35_ROWNAMERESID = 0;
  public static int PQSL_PAR35_ROWNAMDATELA = 1;
  public static int PQSL_PAR35_ROWNAMCODDEB = 2;
  public static int PQSL_PAR35_ROWNAMEXINEX = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR37 = 3647;
  public static int PQRY_PAR37_RS = 3648;
  public static int PQSL_PAR37_ROWNAMENUMER = 0;
  public static int PQSL_PAR37_ROWNAMEDATA = 1;
  public static int PQSL_PAR37_ROWNAMECOMP = 2;
  public static int PQSL_PAR37_ROWNAMDATELA = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR39 = 3649;
  public static int PQRY_PAR39_RS = 3650;
  public static int PQSL_PAR39_ROWNAMECAPIT = 0;
  public static int PQSL_PAR39_ROWNAMEARTIC = 1;
  public static int PQSL_PAR39_ROWNAMECOMP = 2;
  public static int PQSL_PAR39_ROWNAMNUMACC = 3;
  public static int PQSL_PAR39_ROWNAMANNACC = 4;
  public static int PQSL_PAR39_ROWNAMEDAL = 5;
  public static int PQSL_PAR39_ROWNAMEAL = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR45 = 3651;
  public static int PQRY_PAR45_RS = 3652;
  public static int PQSL_PAR45_ROWNAMEESPOS = 0;
  public static int PQSL_PAR45_ROWNAMEFATTO = 1;
  public static int PQSL_PAR45_ROWNAMECENTR = 2;
  public static int PQSL_PAR45_ROWNAMEDAL = 3;
  public static int PQSL_PAR45_ROWNAMEAL = 4;
  public static int PQSL_PAR45_ROWNAMEORDIN = 5;

  // Table to contain panel selected row: Paramentri
  //
  public static int PQRY_PARAMENTRI2 = 3653;
  public static int PQRY_PARAMENTRI2_RS = 3654;
  public static int PQSL_PARAMENTRI2_ROWNAMEANTIC = 0;
  public static int PQSL_PARAMENTRI2_ROWNAMEAL = 1;

  // Table to contain panel selected row: Dati In Pannello
  //
  public static int PQRY_DATIINPANNE1 = 3655;
  public static int PQRY_DATIINPANNE1_RS = 3656;
  public static int PQSL_DATIINPANNE1_ROWNAMMAEMCO = 0;
  public static int PQSL_DATIINPANNE1_ROWNAMMAEMRE = 1;
  public static int PQSL_DATIINPANNE1_ROWNAMPAGCOM = 2;
  public static int PQSL_DATIINPANNE1_ROWNAMPAGRES = 3;
  public static int PQSL_DATIINPANNE1_ROWNAMTOMAEM = 4;
  public static int PQSL_DATIINPANNE1_ROWNAMTOMAPA = 5;
  public static int PQSL_DATIINPANNE1_ROWNAMOREMCO = 6;
  public static int PQSL_DATIINPANNE1_ROWNAMOREMRE = 7;
  public static int PQSL_DATIINPANNE1_ROWNAMORRICO = 8;
  public static int PQSL_DATIINPANNE1_ROWNAMORRIRE = 9;
  public static int PQSL_DATIINPANNE1_RONAFODICAEM = 10;
  public static int PQSL_DATIINPANNE1_RONAFODICARI = 11;
  public static int PQSL_DATIINPANNE1_ROWNAMTOOREM = 12;
  public static int PQSL_DATIINPANNE1_ROWNAMTOORRI = 13;
  public static int PQSL_DATIINPANNE1_ROWNAMLIDICA = 14;
  public static int PQSL_DATIINPANNE1_ROWNAMLIDITE = 15;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI379 = 3657;
  public static int PQRY_PARAMETRI379_RS = 3658;
  public static int PQSL_PARAMETRI379_ROWNAMTIDIVI = 0;
  public static int PQSL_PARAMETRI379_ROWNAMEAL = 1;

  // Table to contain panel selected row: Pannello
  //
  public static int PQRY_PANNELLO4 = 3659;
  public static int PQRY_PANNELLO4_RS = 3660;
  public static int PQSL_PANNELLO4_ROWNAMSAINCA = 0;
  public static int PQSL_PANNELLO4_ROWNAMSAINTE = 1;
  public static int PQSL_PANNELLO4_ROWNAMSAFICA = 2;
  public static int PQSL_PANNELLO4_ROWNAMSAFITE = 3;
  public static int PQSL_PANNELLO4_ROWNAMERESI1 = 4;
  public static int PQSL_PANNELLO4_ROWNAMMAREPA = 5;
  public static int PQSL_PANNELLO4_ROWNAMECOMPE = 6;
  public static int PQSL_PANNELLO4_ROWNAMMACOPA = 7;
  public static int PQSL_PANNELLO4_ROWNAMEMANDA = 8;
  public static int PQSL_PANNELLO4_ROWNAMTOMAPA = 9;
  public static int PQSL_PANNELLO4_ROWNAMERESID = 10;
  public static int PQSL_PANNELLO4_ROWNAMORRERI = 11;
  public static int PQSL_PANNELLO4_ROWNAMECOMP1 = 12;
  public static int PQSL_PANNELLO4_ROWNAMORCORI = 13;
  public static int PQSL_PANNELLO4_ROWNAMETOTAL = 14;
  public static int PQSL_PANNELLO4_ROWNAMTOORRI = 15;

  // Table to contain panel selected row: Imdb Parametri Saldi Vincoli
  //
  public static int PQRY_IMDPARSALVI1 = 3661;
  public static int PQRY_IMDPARSALVI1_RS = 3662;
  public static int PQSL_IMDPARSALVI1_NOMOGGTIVISA = 0;

  // Table to contain panel selected row: SALDI VINCOLI
  //
  public static int PQRY_SALDIVINCOLI = 3663;
  public static int PQSL_SALDIVINCOLI_TIPO_VINCOLO = 0;
  public static int PQSL_SALDIVINCOLI_SALDO_INI_CASSA = 1;
  public static int PQSL_SALDIVINCOLI_SALDO_INI_TESORERIA = 2;
  public static int PQSL_SALDIVINCOLI_ESERCIZIO = 3;

  // Table to contain panel selected row: VINCOLI
  //
  public static int PQRY_VINCOLI = 3664;
  public static int PQSL_VINCOLI_CODICE = 0;
  public static int PQSL_VINCOLI_DESCRIZIONE = 1;
  public static int PQSL_VINCOLI_SALDO_INI_CASSA = 2;
  public static int PQSL_VINCOLI_SALDO_INI_TESORERIA = 3;
  public static int PQSL_VINCOLI_UTENTE_INSERIMENTO = 4;
  public static int PQSL_VINCOLI_DATA_INSERIMENTO = 5;
  public static int PQSL_VINCOLI_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_VINCOLI_DATA_ULTIMO_AGG = 7;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR23 = 3665;
  public static int PQRY_PAR23_RS = 3666;
  public static int PQSL_PAR23_ROWNAMETIPO = 0;
  public static int PQSL_PAR23_ROWNAMENUMER = 1;
  public static int PQSL_PAR23_ROWNAMDATELA = 2;
  public static int PQSL_PAR23_ROWNAMEINCAS = 3;
  public static int PQSL_PAR23_ROWNAMEPAGAM = 4;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR27 = 3667;
  public static int PQRY_PAR27_RS = 3668;
  public static int PQSL_PAR27_ROWNAMTIPVIN = 0;
  public static int PQSL_PAR27_ROWNAMETIPO = 1;
  public static int PQSL_PAR27_ROWNAMEDAL = 2;
  public static int PQSL_PAR27_ROWNAMEAL = 3;
  public static int PQSL_PAR27_ROWNAMEDETTA = 4;
  public static int PQSL_PAR27_ROWNAMVINSCA = 5;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR25 = 3669;
  public static int PQRY_PAR25_RS = 3670;
  public static int PQSL_PAR25_ROWNAMTIPVIN = 0;
  public static int PQSL_PAR25_ROWNAMDATELA = 1;
  public static int PQSL_PAR25_ROWNAMVINSCA = 2;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM55 = 3671;
  public static int PQRY_PARAM55_RS = 3672;
  public static int PQSL_PARAM55_ROWNAMEES = 0;
  public static int PQSL_PARAM55_ROWNAMECRITE = 1;
  public static int PQSL_PARAM55_ROWNAMEIMPOR = 2;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL1 = 3673;
  public static int PQSL_BIL1_CAPITOLO = 0;
  public static int PQSL_BIL1_ARTICOLO = 1;
  public static int PQSL_BIL1_DESCRIZIONE = 2;
  public static int PQSL_BIL1_STN_INI_CO = 3;
  public static int PQSL_BIL1_VARIAZIONI_CO = 4;
  public static int PQSL_BIL1_RECOACCEIMPE = 5;
  public static int PQSL_BIL1_RECORDPERCEN = 6;
  public static int PQSL_BIL1_DISPONIBILITA = 7;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR84 = 3674;
  public static int PQRY_PAR84_RS = 3675;
  public static int PQSL_PAR84_ROWNAMECAPIT = 0;
  public static int PQSL_PAR84_ROWNAMEARTIC = 1;
  public static int PQSL_PAR84_ROWNAMDATELA = 2;
  public static int PQSL_PAR84_ROWNAMRECOEN = 3;
  public static int PQSL_PAR84_ROWNAMEDETTA = 4;
  public static int PQSL_PAR84_ROWNAMECAPI1 = 5;
  public static int PQSL_PAR84_ROWNAMEARTI1 = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR83 = 3676;
  public static int PQRY_PAR83_RS = 3677;
  public static int PQSL_PAR83_ROWNAMECAPIT = 0;
  public static int PQSL_PAR83_ROWNAMEARTIC = 1;
  public static int PQSL_PAR83_ROWNAMDATELA = 2;
  public static int PQSL_PAR83_ROWNAMRECOEN = 3;
  public static int PQSL_PAR83_ROWNAMEDETTA = 4;
  public static int PQSL_PAR83_ROWNAMECAPI1 = 5;
  public static int PQSL_PAR83_ROWNAMEARTI1 = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR86 = 3678;
  public static int PQRY_PAR86_RS = 3679;
  public static int PQSL_PAR86_ROWNAMECAPIT = 0;
  public static int PQSL_PAR86_ROWNAMEARTIC = 1;
  public static int PQSL_PAR86_ROWNAMDATELA = 2;
  public static int PQSL_PAR86_ROWNAMRECOEN = 3;
  public static int PQSL_PAR86_ROWNAMSEROPE = 4;
  public static int PQSL_PAR86_ROWNAMECAPI1 = 5;
  public static int PQSL_PAR86_ROWNAMEARTI1 = 6;
  public static int PQSL_PAR86_ROWNAMSUBIMP = 7;
  public static int PQSL_PAR86_ROWNAMANNOMO = 8;
  public static int PQSL_PAR86_ROWNAMUNIORG = 9;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR109 = 3680;
  public static int PQRY_PAR109_RS = 3681;
  public static int PQSL_PAR109_ROWNAMECAPIT = 0;
  public static int PQSL_PAR109_ROWNAMEARTIC = 1;
  public static int PQSL_PAR109_ROWNAMDATELA = 2;
  public static int PQSL_PAR109_ROWNAMRECOEN = 3;
  public static int PQSL_PAR109_ROWNAMSEROPE = 4;
  public static int PQSL_PAR109_ROWNAMECAPI1 = 5;
  public static int PQSL_PAR109_ROWNAMEARTI1 = 6;
  public static int PQSL_PAR109_ROWNAMANNOMO = 7;
  public static int PQSL_PAR109_ROWNAMUNIORG = 8;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR65 = 3682;
  public static int PQRY_PAR65_RS = 3683;
  public static int PQSL_PAR65_ROWNAMEPARTE = 0;
  public static int PQSL_PAR65_ROWNAMCAPDAL = 1;
  public static int PQSL_PAR65_ROWNAMARTDAL = 2;
  public static int PQSL_PAR65_ROWNAMECAPAL = 3;
  public static int PQSL_PAR65_ROWNAMEARTAL = 4;
  public static int PQSL_PAR65_ROWNAMRECOEN = 5;
  public static int PQSL_PAR65_ROWNAMANNRES = 6;
  public static int PQSL_PAR65_ROWNAMCHSOUO = 7;
  public static int PQSL_PAR65_ROWNAMDESINT = 8;
  public static int PQSL_PAR65_ROWNAMEMISSI = 9;
  public static int PQSL_PAR65_ROWNAMEPROGR = 10;
  public static int PQSL_PAR65_ROWNAMCEDICO = 11;
  public static int PQSL_PAR65_ROWNAMSETOPE = 12;
  public static int PQSL_PAR65_ROWNAMSEROPE = 13;
  public static int PQSL_PAR65_ROWNAMEUOSUD = 14;
  public static int PQSL_PAR65_ROWNAMEUOSOT = 15;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM96 = 3684;
  public static int PQRY_PARAM96_RS = 3685;
  public static int PQSL_PARAM96_ROWNAMTIPSTA = 0;

  // Table to contain panel selected row: VOCI PS
  //
  public static int PQRY_VOCIPS4 = 3686;
  public static int PQSL_VOCIPS4_ESERCIZIO = 0;
  public static int PQSL_VOCIPS4_TIPO_STAMPA = 1;
  public static int PQSL_VOCIPS4_CODICE = 2;
  public static int PQSL_VOCIPS4_E_S = 3;
  public static int PQSL_VOCIPS4_DESCRIZIONE = 4;
  public static int PQSL_VOCIPS4_CAPITALE_CORRENTE = 5;
  public static int PQSL_VOCIPS4_MODIFICABILE = 6;
  public static int PQSL_VOCIPS4_DA_VISUALIZZARE = 7;
  public static int PQSL_VOCIPS4_SEQUENZA = 8;
  public static int PQSL_VOCIPS4_TIPO_VOCE = 9;

  // Table to contain panel selected row: VOCI PS
  //
  public static int PQRY_VOCIPS5 = 3687;
  public static int PQSL_VOCIPS5_ESERCIZIO = 0;
  public static int PQSL_VOCIPS5_TIPO_STAMPA = 1;
  public static int PQSL_VOCIPS5_CODICE = 2;
  public static int PQSL_VOCIPS5_E_S = 3;
  public static int PQSL_VOCIPS5_DESCRIZIONE = 4;
  public static int PQSL_VOCIPS5_CAPITALE_CORRENTE = 5;
  public static int PQSL_VOCIPS5_MODIFICABILE = 6;
  public static int PQSL_VOCIPS5_DA_VISUALIZZARE = 7;
  public static int PQSL_VOCIPS5_SEQUENZA = 8;
  public static int PQSL_VOCIPS5_TIPO_VOCE = 9;

  // Table to contain panel selected row: VOCI PS
  //
  public static int PQRY_VOCIPS6 = 3688;
  public static int PQSL_VOCIPS6_ESERCIZIO = 0;
  public static int PQSL_VOCIPS6_TIPO_STAMPA = 1;
  public static int PQSL_VOCIPS6_CODICE = 2;
  public static int PQSL_VOCIPS6_E_S = 3;
  public static int PQSL_VOCIPS6_DESCRIZIONE = 4;
  public static int PQSL_VOCIPS6_CAPITALE_CORRENTE = 5;
  public static int PQSL_VOCIPS6_MODIFICABILE = 6;
  public static int PQSL_VOCIPS6_DA_VISUALIZZARE = 7;
  public static int PQSL_VOCIPS6_SEQUENZA = 8;
  public static int PQSL_VOCIPS6_TIPO_VOCE = 9;

  // Table to contain panel selected row: VOCI PS
  //
  public static int PQRY_VOCIPS7 = 3689;
  public static int PQSL_VOCIPS7_ESERCIZIO = 0;
  public static int PQSL_VOCIPS7_TIPO_STAMPA = 1;
  public static int PQSL_VOCIPS7_CODICE = 2;
  public static int PQSL_VOCIPS7_E_S = 3;
  public static int PQSL_VOCIPS7_DESCRIZIONE = 4;
  public static int PQSL_VOCIPS7_CAPITALE_CORRENTE = 5;
  public static int PQSL_VOCIPS7_MODIFICABILE = 6;
  public static int PQSL_VOCIPS7_DA_VISUALIZZARE = 7;
  public static int PQSL_VOCIPS7_SEQUENZA = 8;
  public static int PQSL_VOCIPS7_TIPO_VOCE = 9;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM134 = 3690;
  public static int PQRY_PARAM134_RS = 3691;
  public static int PQSL_PARAM134_ROWNAMTIPRIC = 0;
  public static int PQSL_PARAM134_ROWNAMDATELA = 1;

  // Table to contain panel selected row: WRK PATTO STAMPA
  //
  public static int PQRY_WRKPATTOSTA2 = 3692;
  public static int PQRY_WRKPATTOSTA2_RS = 3693;
  public static int PQSL_WRKPATTOSTA2_RECORDPROGRE = 0;
  public static int PQSL_WRKPATTOSTA2_RECORDESERCI = 1;
  public static int PQSL_WRKPATTOSTA2_RECORDCODICE = 2;
  public static int PQSL_WRKPATTOSTA2_RECORDDESCRI = 3;
  public static int PQSL_WRKPATTOSTA2_RECORDSEQUEN = 4;
  public static int PQSL_WRKPATTOSTA2_RECOIMPOEFFE = 5;
  public static int PQSL_WRKPATTOSTA2_RECOIMPOSIMU = 6;
  public static int PQSL_WRKPATTOSTA2_RECOMODIEFFE = 7;
  public static int PQSL_WRKPATTOSTA2_RECOMODISIMU = 8;
  public static int PQSL_WRKPATTOSTA2_RECOASSEVISI = 9;
  public static int PQSL_WRKPATTOSTA2_RECORDSTATO = 10;

  // Table to contain panel selected row: WRK PATTO STAMPA
  //
  public static int PQRY_WRKPATTOSTA7 = 3694;
  public static int PQRY_WRKPATTOSTA7_RS = 3695;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTRAPA = 0;
  public static int PQSL_WRKPATTOSTA7_RAGGRUTOTALE = 1;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTAPRO = 2;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTAESE = 3;
  public static int PQSL_WRKPATTOSTA7_WRKPATTIPSTA = 4;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTDAEL = 5;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTACOD = 6;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTADES = 7;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTASEQ = 8;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTSTAT = 9;
  public static int PQSL_WRKPATTOSTA7_WRKPASTASGR1 = 10;
  public static int PQSL_WRKPATTOSTA7_WRKPASTASGR2 = 11;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTVAPR = 12;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTIMEF = 13;
  public static int PQSL_WRKPATTOSTA7_WRKPASTEFGR1 = 14;
  public static int PQSL_WRKPATTOSTA7_WRKPASTEFGR2 = 15;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTIMSI = 16;
  public static int PQSL_WRKPATTOSTA7_WRKPASTSIGR1 = 17;
  public static int PQSL_WRKPATTOSTA7_WRKPASTSIGR2 = 18;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTMOAS = 19;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTMOEF = 20;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTMOSI = 21;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTCOVI = 22;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTTIRI = 23;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTATOT = 24;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTSETO = 25;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTAGRA = 26;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTDAIN = 27;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTUTIN = 28;
  public static int PQSL_WRKPATTOSTA7_WRPASTDAULAG = 29;
  public static int PQSL_WRKPATTOSTA7_WRPASTUTULAG = 30;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTASTA = 31;
  public static int PQSL_WRKPATTOSTA7_WRKPATSTASVI = 32;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV96 = 3696;
  public static int QSL_CFASELINTV96_WRKPATSTADES = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV97 = 3697;
  public static int QSL_CFASELINTV97_WRKPATSTIMEF = 0;
  public static int QSL_CFASELINTV97_WRKPATSTIMSI = 1;

  // Recordset for query: WRK PATTO STAMPA
  //
  public static int QRY_WRKPATTOSTA8 = 3698;
  public static int QSL_WRKPATTOSTA8_WRKPATSTAPRO = 0;
  public static int QSL_WRKPATTOSTA8_WRKPATSTIMEF = 1;
  public static int QSL_WRKPATTOSTA8_WRKPATSTIMSI = 2;

  // Recordset for query: WRK PATTO STAMPA
  //
  public static int QRY_WRKPATTOSTA9 = 3699;
  public static int QSL_WRKPATTOSTA9_WRKPATSTATOT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV98 = 3700;
  public static int QSL_CFASELINTV98_SUWPSIEWPSST = 0;
  public static int QSL_CFASELINTV98_SUWPSISWPSST = 1;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM79 = 3701;
  public static int PQRY_PARAM79_RS = 3702;
  public static int PQSL_PARAM79_ROWNAMTIPRIC = 0;
  public static int PQSL_PARAM79_ROWNAMDATELA = 1;
  public static int PQSL_PARAM79_ROWNAMTIMOST = 2;

  // Table to contain panel selected row: WRK PATTO STAMPA
  //
  public static int PQRY_WRKPATTOSTA1 = 3703;
  public static int PQRY_WRKPATTOSTA1_RS = 3704;
  public static int PQSL_WRKPATTOSTA1_RECORDPROGRE = 0;
  public static int PQSL_WRKPATTOSTA1_RECORDESERCI = 1;
  public static int PQSL_WRKPATTOSTA1_RECORDCODICE = 2;
  public static int PQSL_WRKPATTOSTA1_RECORDDESCRI = 3;
  public static int PQSL_WRKPATTOSTA1_RECORDSEQUEN = 4;
  public static int PQSL_WRKPATTOSTA1_RECOIMPOEFFE = 5;
  public static int PQSL_WRKPATTOSTA1_RECOIMPOSIMU = 6;
  public static int PQSL_WRKPATTOSTA1_RECOMODIEFFE = 7;
  public static int PQSL_WRKPATTOSTA1_RECOMODISIMU = 8;
  public static int PQSL_WRKPATTOSTA1_RECOASSEVISI = 9;
  public static int PQSL_WRKPATTOSTA1_RECORDSTATO = 10;

  // Table to contain panel selected row: WRK PATTO STAMPA
  //
  public static int PQRY_WRKPATTOSTA4 = 3705;
  public static int PQRY_WRKPATTOSTA4_RS = 3706;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTRAPA = 0;
  public static int PQSL_WRKPATTOSTA4_RAGGRUTOTALE = 1;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTAPRO = 2;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTAESE = 3;
  public static int PQSL_WRKPATTOSTA4_WRKPATTIPSTA = 4;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTDAEL = 5;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTACOD = 6;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTADES = 7;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTASEQ = 8;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTSTAT = 9;
  public static int PQSL_WRKPATTOSTA4_WRKPASTASGR1 = 10;
  public static int PQSL_WRKPATTOSTA4_WRKPASTASGR2 = 11;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTVAPR = 12;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTIMEF = 13;
  public static int PQSL_WRKPATTOSTA4_WRKPASTEFGR1 = 14;
  public static int PQSL_WRKPATTOSTA4_WRKPASTEFGR2 = 15;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTIMSI = 16;
  public static int PQSL_WRKPATTOSTA4_WRKPASTSIGR1 = 17;
  public static int PQSL_WRKPATTOSTA4_WRKPASTSIGR2 = 18;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTMOAS = 19;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTMOEF = 20;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTMOSI = 21;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTCOVI = 22;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTTIRI = 23;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTATOT = 24;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTSETO = 25;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTAGRA = 26;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTDAIN = 27;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTUTIN = 28;
  public static int PQSL_WRKPATTOSTA4_WRPASTDAULAG = 29;
  public static int PQSL_WRKPATTOSTA4_WRPASTUTULAG = 30;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTASTA = 31;
  public static int PQSL_WRKPATTOSTA4_WRKPATSTASVI = 32;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA1 = 3707;
  public static int QSL_CFASELINTVA1_WRKPATSTADES = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV99 = 3708;
  public static int QSL_CFASELINTV99_WRKPATSTIMEF = 0;
  public static int QSL_CFASELINTV99_WRKPATSTIMSI = 1;

  // Recordset for query: WRK PATTO STAMPA
  //
  public static int QRY_WRKPATTOSTA5 = 3709;
  public static int QSL_WRKPATTOSTA5_WRKPATSTAPRO = 0;
  public static int QSL_WRKPATTOSTA5_WRKPATSTIMEF = 1;
  public static int QSL_WRKPATTOSTA5_WRKPATSTIMSI = 2;

  // Recordset for query: WRK PATTO STAMPA
  //
  public static int QRY_WRKPATTOSTA6 = 3710;
  public static int QSL_WRKPATTOSTA6_WRKPATSTATOT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA8 = 3711;
  public static int QSL_CFASELINTVA8_SUWPSIEWPSST = 0;
  public static int QSL_CFASELINTVA8_SUWPSISWPSST = 1;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM29 = 3712;
  public static int PQRY_PARAMESTAM29_RS = 3713;
  public static int PQSL_PARAMESTAM29_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMESTAM29_ROWNAMEDELIB = 1;
  public static int PQSL_PARAMESTAM29_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMESTAM29_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMESTAM29_ROWNAMEDATA = 4;
  public static int PQSL_PARAMESTAM29_ROWNAMEVARIA = 5;
  public static int PQSL_PARAMESTAM29_ROWNAMUNIPRO = 6;
  public static int PQSL_PARAMESTAM29_ROWNAMNUMPRO = 7;
  public static int PQSL_PARAMESTAM29_ROWNAMANNPRO = 8;
  public static int PQSL_PARAMESTAM29_ROWNAMREPRIN = 9;
  public static int PQSL_PARAMESTAM29_ROWNAMCAPFPV = 10;
  public static int PQSL_PARAMESTAM29_ROWNAMSOCAVA = 11;
  public static int PQSL_PARAMESTAM29_ROWNAMPROSTA = 12;
  public static int PQSL_PARAMESTAM29_ROWNAMSALDAT = 13;
  public static int PQSL_PARAMESTAM29_ROWNAMDESSTA = 14;
  public static int PQSL_PARAMESTAM29_ROWNAMREPRFI = 15;
  public static int PQSL_PARAMESTAM29_RONAINVAPICI = 16;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION5 = 3714;
  public static int PQSL_NOTEFUNZION5_MODULO = 0;
  public static int PQSL_NOTEFUNZION5_PAGINA = 1;
  public static int PQSL_NOTEFUNZION5_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION5_DESCRIZIONE = 3;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM14 = 3715;
  public static int PQRY_PARAMESTAM14_RS = 3716;
  public static int PQSL_PARAMESTAM14_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMESTAM14_ROWNAMEDELIB = 1;
  public static int PQSL_PARAMESTAM14_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMESTAM14_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMESTAM14_ROWNAMEDATA = 4;
  public static int PQSL_PARAMESTAM14_ROWNAMUNIPRO = 5;
  public static int PQSL_PARAMESTAM14_ROWNAMNUMPRO = 6;
  public static int PQSL_PARAMESTAM14_ROWNAMANNPRO = 7;
  public static int PQSL_PARAMESTAM14_RONAINVAPICI = 8;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM24 = 3717;
  public static int PQRY_PARAMESTAM24_RS = 3718;
  public static int PQSL_PARAMESTAM24_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMESTAM24_ROWNAMEDELIB = 1;
  public static int PQSL_PARAMESTAM24_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMESTAM24_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMESTAM24_ROWNAMEDATA = 4;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM20 = 3719;
  public static int PQRY_PARAMESTAM20_RS = 3720;
  public static int PQSL_PARAMESTAM20_ROWNAMEPARTE = 0;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM21 = 3721;
  public static int PQRY_PARAMESTAM21_RS = 3722;
  public static int PQSL_PARAMESTAM21_ROWNAMEDELIB = 0;
  public static int PQSL_PARAMESTAM21_ROWNAMNUMDEL = 1;
  public static int PQSL_PARAMESTAM21_ROWNAMANNDEL = 2;
  public static int PQSL_PARAMESTAM21_ROWNAMEDATA = 3;
  public static int PQSL_PARAMESTAM21_ROWNAMTIPCAL = 4;
  public static int PQSL_PARAMESTAM21_ROWNAMEPARTE = 5;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION1 = 3723;
  public static int PQSL_NOTEFUNZION1_MODULO = 0;
  public static int PQSL_NOTEFUNZION1_PAGINA = 1;
  public static int PQSL_NOTEFUNZION1_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION1_DESCRIZIONE = 3;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP6 = 3724;
  public static int PQSL_CAP6_RECODESCLIV1 = 0;
  public static int PQSL_CAP6_E_S = 1;
  public static int PQSL_CAP6_RECTIPRAMLI1 = 2;
  public static int PQSL_CAP6_RECORESLIVE1 = 3;
  public static int PQSL_CAP6_RECOTITOLIV1 = 4;
  public static int PQSL_CAP6_RECCATINTLI1 = 5;
  public static int PQSL_CAP6_RECCODTERLI1 = 6;
  public static int PQSL_CAP6_RECOCAPILIV1 = 7;
  public static int PQSL_CAP6_RECOARTILIV1 = 8;
  public static int PQSL_CAP6_RECANIMACLI1 = 9;
  public static int PQSL_CAP6_RECNUIMACLI1 = 10;
  public static int PQSL_CAP6_RECANSUIMLI1 = 11;
  public static int PQSL_CAP6_RECNUSUIMLI1 = 12;
  public static int PQSL_CAP6_RECANMAORLI1 = 13;
  public static int PQSL_CAP6_RECNUMAORLI1 = 14;
  public static int PQSL_CAP6_RECOIMPOLIV1 = 15;
  public static int PQSL_CAP6_RECINCPAGLI1 = 16;
  public static int PQSL_CAP6_RECANNLIQLI1 = 17;
  public static int PQSL_CAP6_RECNUMLIQLI1 = 18;
  public static int PQSL_CAP6_RECUOGESLIV1 = 19;
  public static int PQSL_CAP6_RECUOUTILIV1 = 20;
  public static int PQSL_CAP6_RECOORDILIV1 = 21;
  public static int PQSL_CAP6_ICON = 22;
  public static int PQSL_CAP6_RECPROVARLI1 = 23;
  public static int PQSL_CAP6_HASH = 24;
  public static int PQSL_CAP6_TOOLTIP = 25;

  // Table to contain panel selected row: Titoli
  //
  public static int PQRY_TITOLI6 = 3725;
  public static int PQSL_TITOLI6_RECODESCLIV2 = 0;
  public static int PQSL_TITOLI6_TITOLO = 1;
  public static int PQSL_TITOLI6_RECTIPRAMLI2 = 2;
  public static int PQSL_TITOLI6_RECORESLIVE2 = 3;
  public static int PQSL_TITOLI6_RECOTITOLIV2 = 4;
  public static int PQSL_TITOLI6_RECCATINTLI2 = 5;
  public static int PQSL_TITOLI6_RECCODTERLI2 = 6;
  public static int PQSL_TITOLI6_RECOCAPILIV2 = 7;
  public static int PQSL_TITOLI6_RECOARTILIV2 = 8;
  public static int PQSL_TITOLI6_RECANIMACLI2 = 9;
  public static int PQSL_TITOLI6_RECNUIMACLI2 = 10;
  public static int PQSL_TITOLI6_RECANSUIMLI2 = 11;
  public static int PQSL_TITOLI6_RECNUSUIMLI2 = 12;
  public static int PQSL_TITOLI6_RECANMAORLI2 = 13;
  public static int PQSL_TITOLI6_RECNUMAORLI2 = 14;
  public static int PQSL_TITOLI6_RECOIMPOLIV2 = 15;
  public static int PQSL_TITOLI6_RECINCPAGLI2 = 16;
  public static int PQSL_TITOLI6_RECANNLIQLI2 = 17;
  public static int PQSL_TITOLI6_RECNUMLIQLI2 = 18;
  public static int PQSL_TITOLI6_RECUOGESLIV2 = 19;
  public static int PQSL_TITOLI6_RECUOUTILIV2 = 20;
  public static int PQSL_TITOLI6_RECOORDILIV2 = 21;
  public static int PQSL_TITOLI6_ICON = 22;
  public static int PQSL_TITOLI6_RECPROVARLI2 = 23;
  public static int PQSL_TITOLI6_HASH = 24;
  public static int PQSL_TITOLI6_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV7 = 3726;
  public static int PQSL_CAPLIV7_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV7_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV7_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV7_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV7_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV7_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV7_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV7_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV7_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV7_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV7_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV7_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV7_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV7_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV7_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV7_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV7_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV7_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV7_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV7_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV7_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV7_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV7_ICON = 22;
  public static int PQSL_CAPLIV7_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV7_HASH = 24;
  public static int PQSL_CAPLIV7_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 4
  //
  public static int PQRY_CAPLIV14 = 3727;
  public static int PQSL_CAPLIV14_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV14_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV14_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV14_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV14_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV14_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV14_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV14_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV14_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV14_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV14_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV14_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV14_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV14_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV14_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV14_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV14_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV14_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV14_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV14_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV14_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV14_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV14_ICON = 22;
  public static int PQSL_CAPLIV14_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV14_HASH = 24;
  public static int PQSL_CAPLIV14_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC7 = 3728;
  public static int PQSL_MOVBLIVSUCC7_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC7_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC7_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC7_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC7_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC7_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC7_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC7_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC7_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC7_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC7_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC7_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC7_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC7_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC7_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC7_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC7_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC7_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC7_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC7_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUCC7_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUCC7_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC7_ICON = 22;
  public static int PQSL_MOVBLIVSUCC7_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUCC7_HASH = 24;
  public static int PQSL_MOVBLIVSUCC7_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI26 = 3729;
  public static int PQRY_PARAESPLVI26_RS = 3730;
  public static int PQSL_PARAESPLVI26_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI26_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI26_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI26_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI26_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI26_PARASOLOCAPI = 5;
  public static int PQSL_PARAESPLVI26_PARAMDESCRIZ = 6;
  public static int PQSL_PARAESPLVI26_PARANUMESUBI = 7;
  public static int PQSL_PARAESPLVI26_PARAANNOSUBI = 8;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP7 = 3731;
  public static int PQSL_CAP7_RECODESCLIV1 = 0;
  public static int PQSL_CAP7_E_S = 1;
  public static int PQSL_CAP7_RECTIPRAMLI1 = 2;
  public static int PQSL_CAP7_RECORESLIVE1 = 3;
  public static int PQSL_CAP7_RECOTITOLIV1 = 4;
  public static int PQSL_CAP7_RECCATINTLI1 = 5;
  public static int PQSL_CAP7_RECCODTERLI1 = 6;
  public static int PQSL_CAP7_RECOCAPILIV1 = 7;
  public static int PQSL_CAP7_RECOARTILIV1 = 8;
  public static int PQSL_CAP7_RECANIMACLI1 = 9;
  public static int PQSL_CAP7_RECNUIMACLI1 = 10;
  public static int PQSL_CAP7_RECANSUIMLI1 = 11;
  public static int PQSL_CAP7_RECNUSUIMLI1 = 12;
  public static int PQSL_CAP7_RECANMAORLI1 = 13;
  public static int PQSL_CAP7_RECNUMAORLI1 = 14;
  public static int PQSL_CAP7_RECOIMPOLIV1 = 15;
  public static int PQSL_CAP7_RECINCPAGLI1 = 16;
  public static int PQSL_CAP7_RECANNLIQLI1 = 17;
  public static int PQSL_CAP7_RECNUMLIQLI1 = 18;
  public static int PQSL_CAP7_RECUOGESLIV1 = 19;
  public static int PQSL_CAP7_RECUOUTILIV1 = 20;
  public static int PQSL_CAP7_RECOORDILIV1 = 21;
  public static int PQSL_CAP7_ICON = 22;
  public static int PQSL_CAP7_RECPROVARLI1 = 23;
  public static int PQSL_CAP7_HASH = 24;
  public static int PQSL_CAP7_TOOLTIP = 25;

  // Table to contain panel selected row: BIL STRUTTURA
  //
  public static int PQRY_BILSTRUTTUR1 = 3732;
  public static int PQSL_BILSTRUTTUR1_DESCRITITMIS = 0;
  public static int PQSL_BILSTRUTTUR1_RECLIVTITMIS = 1;
  public static int PQSL_BILSTRUTTUR1_TIPRAMTITMIS = 2;
  public static int PQSL_BILSTRUTTUR1_ESTITMIS = 3;
  public static int PQSL_BILSTRUTTUR1_RECCODGETIMI = 4;
  public static int PQSL_BILSTRUTTUR1_HASH = 5;
  public static int PQSL_BILSTRUTTUR1_ORDINAMENTO = 6;
  public static int PQSL_BILSTRUTTUR1_ICON = 7;

  // Table to contain panel selected row: BIL STRUTTURA
  //
  public static int PQRY_BILSTRUTTURA = 3733;
  public static int PQSL_BILSTRUTTURA_DESCRITIPPRO = 0;
  public static int PQSL_BILSTRUTTURA_RECLIVTIPPRO = 1;
  public static int PQSL_BILSTRUTTURA_TIPRAMTIPPRO = 2;
  public static int PQSL_BILSTRUTTURA_ESTIPPRO = 3;
  public static int PQSL_BILSTRUTTURA_RECCODGETIPR = 4;
  public static int PQSL_BILSTRUTTURA_HASH = 5;
  public static int PQSL_BILSTRUTTURA_ORDINAMENTO = 6;
  public static int PQSL_BILSTRUTTURA_ICON = 7;

  // Table to contain panel selected row: CAP Liv 1
  //
  public static int PQRY_CAPLIV1 = 3734;
  public static int PQSL_CAPLIV1_RECODESCLIV2 = 0;
  public static int PQSL_CAPLIV1_TITOLO = 1;
  public static int PQSL_CAPLIV1_RECTIPRAMLI2 = 2;
  public static int PQSL_CAPLIV1_RECORESLIVE2 = 3;
  public static int PQSL_CAPLIV1_RECOTITOLIV2 = 4;
  public static int PQSL_CAPLIV1_RECCATINTLI2 = 5;
  public static int PQSL_CAPLIV1_RECCODTERLI2 = 6;
  public static int PQSL_CAPLIV1_RECOCAPILIV2 = 7;
  public static int PQSL_CAPLIV1_RECOARTILIV2 = 8;
  public static int PQSL_CAPLIV1_RECANIMACLI2 = 9;
  public static int PQSL_CAPLIV1_RECNUIMACLI2 = 10;
  public static int PQSL_CAPLIV1_RECANSUIMLI2 = 11;
  public static int PQSL_CAPLIV1_RECNUSUIMLI2 = 12;
  public static int PQSL_CAPLIV1_RECANMAORLI2 = 13;
  public static int PQSL_CAPLIV1_RECNUMAORLI2 = 14;
  public static int PQSL_CAPLIV1_RECOIMPOLIV2 = 15;
  public static int PQSL_CAPLIV1_RECINCPAGLI2 = 16;
  public static int PQSL_CAPLIV1_RECANNLIQLI2 = 17;
  public static int PQSL_CAPLIV1_RECNUMLIQLI2 = 18;
  public static int PQSL_CAPLIV1_RECUOGESLIV2 = 19;
  public static int PQSL_CAPLIV1_RECUOUTILIV2 = 20;
  public static int PQSL_CAPLIV1_RECOORDILIV2 = 21;
  public static int PQSL_CAPLIV1_ICON = 22;
  public static int PQSL_CAPLIV1_RECPROVARLI2 = 23;
  public static int PQSL_CAPLIV1_HASH = 24;
  public static int PQSL_CAPLIV1_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 2
  //
  public static int PQRY_CAPLIV8 = 3735;
  public static int PQSL_CAPLIV8_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV8_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV8_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV8_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV8_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV8_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV8_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV8_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV8_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV8_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV8_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV8_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV8_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV8_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV8_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV8_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV8_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV8_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV8_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV8_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV8_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV8_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV8_ICON = 22;
  public static int PQSL_CAPLIV8_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV8_HASH = 24;
  public static int PQSL_CAPLIV8_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV9 = 3736;
  public static int PQSL_CAPLIV9_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV9_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV9_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV9_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV9_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV9_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV9_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV9_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV9_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV9_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV9_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV9_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV9_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV9_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV9_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV9_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV9_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV9_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV9_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV9_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV9_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV9_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV9_ICON = 22;
  public static int PQSL_CAPLIV9_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV9_HASH = 24;
  public static int PQSL_CAPLIV9_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC6 = 3737;
  public static int PQSL_MOVBLIVSUCC6_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC6_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC6_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC6_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC6_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC6_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC6_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC6_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC6_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC6_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC6_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC6_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC6_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC6_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC6_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC6_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC6_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC6_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC6_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC6_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUCC6_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUCC6_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC6_ICON = 22;
  public static int PQSL_MOVBLIVSUCC6_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUCC6_HASH = 24;
  public static int PQSL_MOVBLIVSUCC6_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI21 = 3738;
  public static int PQRY_PARAESPLVI21_RS = 3739;
  public static int PQSL_PARAESPLVI21_PARATIPOESPL = 0;
  public static int PQSL_PARAESPLVI21_PARASCHEINFO = 1;
  public static int PQSL_PARAESPLVI21_PARAESERSCHE = 2;
  public static int PQSL_PARAESPLVI21_PARAMPARTE = 3;
  public static int PQSL_PARAESPLVI21_PARANUMEIMPA = 4;
  public static int PQSL_PARAESPLVI21_PARAANNOIMPA = 5;
  public static int PQSL_PARAESPLVI21_PARATIPOPROG = 6;
  public static int PQSL_PARAESPLVI21_PARANUMESUBI = 7;
  public static int PQSL_PARAESPLVI21_PARAANNOSUBI = 8;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP25 = 3740;
  public static int PQSL_CAP25_RECODESCLIV1 = 0;
  public static int PQSL_CAP25_E_S = 1;
  public static int PQSL_CAP25_RECTIPRAMLI1 = 2;
  public static int PQSL_CAP25_RECORESLIVE1 = 3;
  public static int PQSL_CAP25_RECOTITOLIV1 = 4;
  public static int PQSL_CAP25_RECCATINTLI1 = 5;
  public static int PQSL_CAP25_RECCODTERLI1 = 6;
  public static int PQSL_CAP25_RECOCAPILIV1 = 7;
  public static int PQSL_CAP25_RECOARTILIV1 = 8;
  public static int PQSL_CAP25_RECANIMACLI1 = 9;
  public static int PQSL_CAP25_RECNUIMACLI1 = 10;
  public static int PQSL_CAP25_RECANSUIMLI1 = 11;
  public static int PQSL_CAP25_RECNUSUIMLI1 = 12;
  public static int PQSL_CAP25_RECANMAORLI1 = 13;
  public static int PQSL_CAP25_RECNUMAORLI1 = 14;
  public static int PQSL_CAP25_RECOIMPOLIV1 = 15;
  public static int PQSL_CAP25_RECINCPAGLI1 = 16;
  public static int PQSL_CAP25_RECANNLIQLI1 = 17;
  public static int PQSL_CAP25_RECNUMLIQLI1 = 18;
  public static int PQSL_CAP25_RECUOGESLIV1 = 19;
  public static int PQSL_CAP25_RECUOUTILIV1 = 20;
  public static int PQSL_CAP25_RECOORDILIV1 = 21;
  public static int PQSL_CAP25_ICON = 22;
  public static int PQSL_CAP25_RECPROVARLI1 = 23;
  public static int PQSL_CAP25_HASH = 24;
  public static int PQSL_CAP25_TOOLTIP = 25;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIACO8 = 3741;
  public static int PQSL_CF4ESPPIACO8_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIACO8_RECFESPICCL1 = 1;
  public static int PQSL_CF4ESPPIACO8_HASH = 2;
  public static int PQSL_CF4ESPPIACO8_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIACO5 = 3742;
  public static int PQSL_CF4ESPPIACO5_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIACO5_RECFESPICCL2 = 1;
  public static int PQSL_CF4ESPPIACO5_HASH = 2;
  public static int PQSL_CF4ESPPIACO5_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIACO6 = 3743;
  public static int PQSL_CF4ESPPIACO6_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIACO6_RECFESPICCL3 = 1;
  public static int PQSL_CF4ESPPIACO6_HASH = 2;
  public static int PQSL_CF4ESPPIACO6_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIACO7 = 3744;
  public static int PQSL_CF4ESPPIACO7_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIACO7_RECFESPICCL4 = 1;
  public static int PQSL_CF4ESPPIACO7_HASH = 2;
  public static int PQSL_CF4ESPPIACO7_ICON = 3;

  // Table to contain panel selected row: Titoli
  //
  public static int PQRY_TITOLI5 = 3745;
  public static int PQSL_TITOLI5_RECODESCLIV2 = 0;
  public static int PQSL_TITOLI5_TITOLO = 1;
  public static int PQSL_TITOLI5_RECTIPRAMLI2 = 2;
  public static int PQSL_TITOLI5_RECORESLIVE2 = 3;
  public static int PQSL_TITOLI5_RECOTITOLIV2 = 4;
  public static int PQSL_TITOLI5_RECCATINTLI2 = 5;
  public static int PQSL_TITOLI5_RECCODTERLI2 = 6;
  public static int PQSL_TITOLI5_RECOCAPILIV2 = 7;
  public static int PQSL_TITOLI5_RECOARTILIV2 = 8;
  public static int PQSL_TITOLI5_RECANIMACLI2 = 9;
  public static int PQSL_TITOLI5_RECNUIMACLI2 = 10;
  public static int PQSL_TITOLI5_RECANSUIMLI2 = 11;
  public static int PQSL_TITOLI5_RECNUSUIMLI2 = 12;
  public static int PQSL_TITOLI5_RECANMAORLI2 = 13;
  public static int PQSL_TITOLI5_RECNUMAORLI2 = 14;
  public static int PQSL_TITOLI5_RECOIMPOLIV2 = 15;
  public static int PQSL_TITOLI5_RECINCPAGLI2 = 16;
  public static int PQSL_TITOLI5_RECANNLIQLI2 = 17;
  public static int PQSL_TITOLI5_RECNUMLIQLI2 = 18;
  public static int PQSL_TITOLI5_RECUOGESLIV2 = 19;
  public static int PQSL_TITOLI5_RECUOUTILIV2 = 20;
  public static int PQSL_TITOLI5_RECOORDILIV2 = 21;
  public static int PQSL_TITOLI5_ICON = 22;
  public static int PQSL_TITOLI5_RECPROVARLI2 = 23;
  public static int PQSL_TITOLI5_HASH = 24;
  public static int PQSL_TITOLI5_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 2
  //
  public static int PQRY_CAPLIV15 = 3746;
  public static int PQSL_CAPLIV15_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV15_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV15_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV15_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV15_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV15_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV15_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV15_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV15_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV15_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV15_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV15_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV15_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV15_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV15_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV15_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV15_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV15_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV15_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV15_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV15_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV15_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV15_ICON = 22;
  public static int PQSL_CAPLIV15_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV15_HASH = 24;
  public static int PQSL_CAPLIV15_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV6 = 3747;
  public static int PQSL_CAPLIV6_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV6_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV6_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV6_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV6_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV6_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV6_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV6_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV6_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV6_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV6_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV6_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV6_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV6_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV6_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV6_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV6_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV6_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV6_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV6_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV6_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV6_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV6_ICON = 22;
  public static int PQSL_CAPLIV6_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV6_HASH = 24;
  public static int PQSL_CAPLIV6_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC2 = 3748;
  public static int PQSL_MOVBLIVSUCC2_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC2_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC2_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC2_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC2_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC2_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC2_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC2_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC2_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC2_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC2_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC2_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC2_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC2_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC2_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC2_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC2_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC2_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC2_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC2_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUCC2_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUCC2_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC2_ICON = 22;
  public static int PQSL_MOVBLIVSUCC2_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUCC2_HASH = 24;
  public static int PQSL_MOVBLIVSUCC2_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI12 = 3749;
  public static int PQRY_PARAESPLVI12_RS = 3750;
  public static int PQSL_PARAESPLVI12_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI12_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI12_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI12_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI12_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI12_PARACODLIVE4 = 5;
  public static int PQSL_PARAESPLVI12_PARANUMESUBI = 6;
  public static int PQSL_PARAESPLVI12_PARAANNOSUBI = 7;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP26 = 3751;
  public static int PQSL_CAP26_RECODESCLIV1 = 0;
  public static int PQSL_CAP26_E_S = 1;
  public static int PQSL_CAP26_RECTIPRAMLI1 = 2;
  public static int PQSL_CAP26_RECORESLIVE1 = 3;
  public static int PQSL_CAP26_RECOTITOLIV1 = 4;
  public static int PQSL_CAP26_RECCATINTLI1 = 5;
  public static int PQSL_CAP26_RECCODTERLI1 = 6;
  public static int PQSL_CAP26_RECOCAPILIV1 = 7;
  public static int PQSL_CAP26_RECOARTILIV1 = 8;
  public static int PQSL_CAP26_RECANIMACLI1 = 9;
  public static int PQSL_CAP26_RECNUIMACLI1 = 10;
  public static int PQSL_CAP26_RECANSUIMLI1 = 11;
  public static int PQSL_CAP26_RECNUSUIMLI1 = 12;
  public static int PQSL_CAP26_RECANMAORLI1 = 13;
  public static int PQSL_CAP26_RECNUMAORLI1 = 14;
  public static int PQSL_CAP26_RECOIMPOLIV1 = 15;
  public static int PQSL_CAP26_RECINCPAGLI1 = 16;
  public static int PQSL_CAP26_RECANNLIQLI1 = 17;
  public static int PQSL_CAP26_RECNUMLIQLI1 = 18;
  public static int PQSL_CAP26_RECUOGESLIV1 = 19;
  public static int PQSL_CAP26_RECUOUTILIV1 = 20;
  public static int PQSL_CAP26_RECOORDILIV1 = 21;
  public static int PQSL_CAP26_ICON = 22;
  public static int PQSL_CAP26_RECPROVARLI1 = 23;
  public static int PQSL_CAP26_HASH = 24;
  public static int PQSL_CAP26_TOOLTIP = 25;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIACO9 = 3752;
  public static int PQSL_CF4ESPPIACO9_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIACO9_RECFESPICCL1 = 1;
  public static int PQSL_CF4ESPPIACO9_HASH = 2;
  public static int PQSL_CF4ESPPIACO9_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIAC10 = 3753;
  public static int PQSL_CF4ESPPIAC10_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIAC10_RECFESPICCL2 = 1;
  public static int PQSL_CF4ESPPIAC10_HASH = 2;
  public static int PQSL_CF4ESPPIAC10_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIAC11 = 3754;
  public static int PQSL_CF4ESPPIAC11_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIAC11_RECFESPICCL3 = 1;
  public static int PQSL_CF4ESPPIAC11_HASH = 2;
  public static int PQSL_CF4ESPPIAC11_ICON = 3;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIAC12 = 3755;
  public static int PQSL_CF4ESPPIAC12_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIAC12_RECFESPICCL4 = 1;
  public static int PQSL_CF4ESPPIAC12_HASH = 2;
  public static int PQSL_CF4ESPPIAC12_ICON = 3;

  // Table to contain panel selected row: Titoli
  //
  public static int PQRY_TITOLI8 = 3756;
  public static int PQSL_TITOLI8_RECODESCLIV2 = 0;
  public static int PQSL_TITOLI8_TITOLO = 1;
  public static int PQSL_TITOLI8_RECTIPRAMLI2 = 2;
  public static int PQSL_TITOLI8_RECORESLIVE2 = 3;
  public static int PQSL_TITOLI8_RECOTITOLIV2 = 4;
  public static int PQSL_TITOLI8_RECCATINTLI2 = 5;
  public static int PQSL_TITOLI8_RECCODTERLI2 = 6;
  public static int PQSL_TITOLI8_RECOCAPILIV2 = 7;
  public static int PQSL_TITOLI8_RECOARTILIV2 = 8;
  public static int PQSL_TITOLI8_RECANIMACLI2 = 9;
  public static int PQSL_TITOLI8_RECNUIMACLI2 = 10;
  public static int PQSL_TITOLI8_RECANSUIMLI2 = 11;
  public static int PQSL_TITOLI8_RECNUSUIMLI2 = 12;
  public static int PQSL_TITOLI8_RECANMAORLI2 = 13;
  public static int PQSL_TITOLI8_RECNUMAORLI2 = 14;
  public static int PQSL_TITOLI8_RECOIMPOLIV2 = 15;
  public static int PQSL_TITOLI8_RECINCPAGLI2 = 16;
  public static int PQSL_TITOLI8_RECANNLIQLI2 = 17;
  public static int PQSL_TITOLI8_RECNUMLIQLI2 = 18;
  public static int PQSL_TITOLI8_RECUOGESLIV2 = 19;
  public static int PQSL_TITOLI8_RECUOUTILIV2 = 20;
  public static int PQSL_TITOLI8_RECOORDILIV2 = 21;
  public static int PQSL_TITOLI8_ICON = 22;
  public static int PQSL_TITOLI8_RECPROVARLI2 = 23;
  public static int PQSL_TITOLI8_HASH = 24;
  public static int PQSL_TITOLI8_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 2
  //
  public static int PQRY_CAPLIV16 = 3757;
  public static int PQSL_CAPLIV16_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV16_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV16_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV16_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV16_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV16_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV16_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV16_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV16_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV16_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV16_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV16_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV16_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV16_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV16_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV16_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV16_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV16_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV16_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV16_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV16_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV16_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV16_ICON = 22;
  public static int PQSL_CAPLIV16_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV16_HASH = 24;
  public static int PQSL_CAPLIV16_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV17 = 3758;
  public static int PQSL_CAPLIV17_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV17_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV17_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV17_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV17_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV17_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV17_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV17_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV17_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV17_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV17_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV17_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV17_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV17_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV17_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV17_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV17_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV17_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV17_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV17_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV17_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV17_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV17_ICON = 22;
  public static int PQSL_CAPLIV17_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV17_HASH = 24;
  public static int PQSL_CAPLIV17_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC3 = 3759;
  public static int PQSL_MOVBLIVSUCC3_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC3_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC3_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC3_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC3_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC3_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC3_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC3_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC3_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC3_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC3_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC3_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC3_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC3_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC3_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC3_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC3_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC3_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC3_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC3_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUCC3_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUCC3_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC3_ICON = 22;
  public static int PQSL_MOVBLIVSUCC3_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUCC3_HASH = 24;
  public static int PQSL_MOVBLIVSUCC3_TOOLTIP = 25;

  // Table to contain panel selected row: CF4WEB ESPL PIANO CONTI
  //
  public static int PQRY_CF4ESPPIAC13 = 3760;
  public static int PQSL_CF4ESPPIAC13_RECORDESNODO = 0;
  public static int PQSL_CF4ESPPIAC13_REESVLICOLI2 = 1;
  public static int PQSL_CF4ESPPIAC13_HASH = 2;
  public static int PQSL_CF4ESPPIAC13_ICON = 3;

  // Table to contain panel selected row: Titoli
  //
  public static int PQRY_TITOLI9 = 3761;
  public static int PQSL_TITOLI9_RECODESCLIV2 = 0;
  public static int PQSL_TITOLI9_TITOLO = 1;
  public static int PQSL_TITOLI9_RECTIPRAMLI2 = 2;
  public static int PQSL_TITOLI9_RECORESLIVE2 = 3;
  public static int PQSL_TITOLI9_RECOTITOLIV2 = 4;
  public static int PQSL_TITOLI9_RECCATINTLI2 = 5;
  public static int PQSL_TITOLI9_RECCODTERLI2 = 6;
  public static int PQSL_TITOLI9_RECOCAPILIV2 = 7;
  public static int PQSL_TITOLI9_RECOARTILIV2 = 8;
  public static int PQSL_TITOLI9_RECANIMACLI2 = 9;
  public static int PQSL_TITOLI9_RECNUIMACLI2 = 10;
  public static int PQSL_TITOLI9_RECANSUIMLI2 = 11;
  public static int PQSL_TITOLI9_RECNUSUIMLI2 = 12;
  public static int PQSL_TITOLI9_RECANMAORLI2 = 13;
  public static int PQSL_TITOLI9_RECNUMAORLI2 = 14;
  public static int PQSL_TITOLI9_RECOIMPOLIV2 = 15;
  public static int PQSL_TITOLI9_RECINCPAGLI2 = 16;
  public static int PQSL_TITOLI9_RECANNLIQLI2 = 17;
  public static int PQSL_TITOLI9_RECNUMLIQLI2 = 18;
  public static int PQSL_TITOLI9_RECUOGESLIV2 = 19;
  public static int PQSL_TITOLI9_RECUOUTILIV2 = 20;
  public static int PQSL_TITOLI9_RECCODLIV5LI = 21;
  public static int PQSL_TITOLI9_RECOORDILIV2 = 22;
  public static int PQSL_TITOLI9_ICON = 23;
  public static int PQSL_TITOLI9_RECPROVARLI2 = 24;
  public static int PQSL_TITOLI9_HASH = 25;
  public static int PQSL_TITOLI9_TOOLTIP = 26;

  // Table to contain panel selected row: CAP Liv 2
  //
  public static int PQRY_CAPLIV18 = 3762;
  public static int PQSL_CAPLIV18_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV18_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV18_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV18_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV18_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV18_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV18_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV18_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV18_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV18_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV18_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV18_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV18_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV18_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV18_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV18_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV18_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV18_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV18_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV18_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV18_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV18_RECCODLIVLIV = 21;
  public static int PQSL_CAPLIV18_RECOORDILIV3 = 22;
  public static int PQSL_CAPLIV18_ICON = 23;
  public static int PQSL_CAPLIV18_RECPROVARLI3 = 24;
  public static int PQSL_CAPLIV18_HASH = 25;
  public static int PQSL_CAPLIV18_TOOLTIP = 26;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV19 = 3763;
  public static int PQSL_CAPLIV19_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV19_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV19_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV19_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV19_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV19_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV19_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV19_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV19_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV19_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV19_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV19_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV19_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV19_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV19_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV19_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV19_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV19_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV19_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV19_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV19_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV19_RECCODLIVLIV = 21;
  public static int PQSL_CAPLIV19_RECOORDILIV4 = 22;
  public static int PQSL_CAPLIV19_ICON = 23;
  public static int PQSL_CAPLIV19_RECPROVARLI4 = 24;
  public static int PQSL_CAPLIV19_HASH = 25;
  public static int PQSL_CAPLIV19_TOOLTIP = 26;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC14 = 3764;
  public static int PQSL_MOVBLIVSUC14_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC14_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC14_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC14_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC14_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC14_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC14_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC14_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC14_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC14_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUC14_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUC14_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUC14_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUC14_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUC14_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUC14_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUC14_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUC14_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUC14_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUC14_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUC14_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUC14_RECCODLILISU = 21;
  public static int PQSL_MOVBLIVSUC14_RECORDLIVSUC = 22;
  public static int PQSL_MOVBLIVSUC14_ICON = 23;
  public static int PQSL_MOVBLIVSUC14_RECPROVALISU = 24;
  public static int PQSL_MOVBLIVSUC14_HASH = 25;
  public static int PQSL_MOVBLIVSUC14_TOOLTIP = 26;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI13 = 3765;
  public static int PQRY_PARAESPLVI13_RS = 3766;
  public static int PQSL_PARAESPLVI13_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI13_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI13_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI13_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI13_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI13_PARACODLIVE4 = 5;
  public static int PQSL_PARAESPLVI13_PARANUMESUBI = 6;
  public static int PQSL_PARAESPLVI13_PARAANNOSUBI = 7;

  // Table to contain panel selected row: Responsabile UO Liv 1
  //
  public static int PQRY_RESPONUOLIV2 = 3767;
  public static int PQSL_RESPONUOLIV2_RECODESCLIV0 = 0;
  public static int PQSL_RESPONUOLIV2_ICON = 1;
  public static int PQSL_RESPONUOLIV2_RECTIPRAMLI0 = 2;
  public static int PQSL_RESPONUOLIV2_RECORESPUOLI = 3;
  public static int PQSL_RESPONUOLIV2_RECDEUOGELI0 = 4;
  public static int PQSL_RESPONUOLIV2_TOOLTIP = 5;

  // Table to contain panel selected row: Entrata Spesa
  //
  public static int PQRY_ENTRATASPES2 = 3768;
  public static int PQSL_ENTRATASPES2_RECODESCLIV1 = 0;
  public static int PQSL_ENTRATASPES2_E_S = 1;
  public static int PQSL_ENTRATASPES2_RECTIPRAMLI1 = 2;
  public static int PQSL_ENTRATASPES2_RECORESLIVE1 = 3;
  public static int PQSL_ENTRATASPES2_RECOTITOLIV1 = 4;
  public static int PQSL_ENTRATASPES2_RECCATINTLI1 = 5;
  public static int PQSL_ENTRATASPES2_RECCODTERLI1 = 6;
  public static int PQSL_ENTRATASPES2_RECRISINTLI1 = 7;
  public static int PQSL_ENTRATASPES2_RECOCAPILIV1 = 8;
  public static int PQSL_ENTRATASPES2_RECOARTILIV1 = 9;
  public static int PQSL_ENTRATASPES2_RECANIMACLI1 = 10;
  public static int PQSL_ENTRATASPES2_RECNUIMACLI1 = 11;
  public static int PQSL_ENTRATASPES2_RECANSUIMLI1 = 12;
  public static int PQSL_ENTRATASPES2_RECNUSUIMLI1 = 13;
  public static int PQSL_ENTRATASPES2_RECANMAORLI1 = 14;
  public static int PQSL_ENTRATASPES2_RECNUMAORLI1 = 15;
  public static int PQSL_ENTRATASPES2_RECOIMPOLIV1 = 16;
  public static int PQSL_ENTRATASPES2_RECINCPAGLI1 = 17;
  public static int PQSL_ENTRATASPES2_RECANNLIQLI1 = 18;
  public static int PQSL_ENTRATASPES2_RECNUMLIQLI1 = 19;
  public static int PQSL_ENTRATASPES2_RECUOUTILIV1 = 20;
  public static int PQSL_ENTRATASPES2_RECOORDILIV1 = 21;
  public static int PQSL_ENTRATASPES2_ICON = 22;
  public static int PQSL_ENTRATASPES2_RECPROVARLI1 = 23;
  public static int PQSL_ENTRATASPES2_HASH = 24;
  public static int PQSL_ENTRATASPES2_TOOLTIP = 25;

  // Table to contain panel selected row: Capitoliart
  //
  public static int PQRY_CAPITOLIART1 = 3769;
  public static int PQSL_CAPITOLIART1_RECODESCLIV2 = 0;
  public static int PQSL_CAPITOLIART1_TITOLO = 1;
  public static int PQSL_CAPITOLIART1_RECTIPRAMLI2 = 2;
  public static int PQSL_CAPITOLIART1_RECORESLIVE2 = 3;
  public static int PQSL_CAPITOLIART1_RECOTITOLIV2 = 4;
  public static int PQSL_CAPITOLIART1_RECCATINTLI2 = 5;
  public static int PQSL_CAPITOLIART1_RECCODTERLI2 = 6;
  public static int PQSL_CAPITOLIART1_RECRISINTLI2 = 7;
  public static int PQSL_CAPITOLIART1_RECOCAPILIV2 = 8;
  public static int PQSL_CAPITOLIART1_RECOARTILIV2 = 9;
  public static int PQSL_CAPITOLIART1_RECANIMACLI2 = 10;
  public static int PQSL_CAPITOLIART1_RECNUIMACLI2 = 11;
  public static int PQSL_CAPITOLIART1_RECANSUIMLI2 = 12;
  public static int PQSL_CAPITOLIART1_RECNUSUIMLI2 = 13;
  public static int PQSL_CAPITOLIART1_RECANMAORLI2 = 14;
  public static int PQSL_CAPITOLIART1_RECNUMAORLI2 = 15;
  public static int PQSL_CAPITOLIART1_RECOIMPOLIV2 = 16;
  public static int PQSL_CAPITOLIART1_RECINCPAGLI2 = 17;
  public static int PQSL_CAPITOLIART1_RECANNLIQLI2 = 18;
  public static int PQSL_CAPITOLIART1_RECNUMLIQLI2 = 19;
  public static int PQSL_CAPITOLIART1_RECUOGESLIV2 = 20;
  public static int PQSL_CAPITOLIART1_RECUOUTILIV2 = 21;
  public static int PQSL_CAPITOLIART1_RECOORDILIV2 = 22;
  public static int PQSL_CAPITOLIART1_ICON = 23;
  public static int PQSL_CAPITOLIART1_RECPROVARLI2 = 24;
  public static int PQSL_CAPITOLIART1_HASH = 25;
  public static int PQSL_CAPITOLIART1_TOOLTIP = 26;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV20 = 3770;
  public static int PQSL_CAPLIV20_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV20_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV20_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV20_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV20_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV20_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV20_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV20_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV20_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV20_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV20_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV20_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV20_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV20_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV20_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV20_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV20_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV20_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV20_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV20_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV20_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV20_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV20_ICON = 22;
  public static int PQSL_CAPLIV20_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV20_HASH = 24;
  public static int PQSL_CAPLIV20_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 4
  //
  public static int PQRY_CAPLIV21 = 3771;
  public static int PQSL_CAPLIV21_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV21_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV21_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV21_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV21_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV21_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV21_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV21_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV21_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV21_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV21_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV21_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV21_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV21_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV21_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV21_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV21_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV21_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV21_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV21_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV21_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV21_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV21_ICON = 22;
  public static int PQSL_CAPLIV21_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV21_HASH = 24;
  public static int PQSL_CAPLIV21_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC15 = 3772;
  public static int PQSL_MOVBLIVSUC15_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC15_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC15_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC15_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC15_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC15_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC15_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC15_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC15_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC15_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUC15_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUC15_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUC15_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUC15_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUC15_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUC15_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUC15_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUC15_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUC15_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUC15_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUC15_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUC15_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC15_ICON = 22;
  public static int PQSL_MOVBLIVSUC15_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUC15_HASH = 24;
  public static int PQSL_MOVBLIVSUC15_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI18 = 3773;
  public static int PQRY_PARAESPLVI18_RS = 3774;
  public static int PQSL_PARAESPLVI18_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI18_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI18_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI18_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI18_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI18_PARANUMESUBI = 5;
  public static int PQSL_PARAESPLVI18_PARAANNOSUBI = 6;

  // Table to contain panel selected row: Responsabile UO Liv 1
  //
  public static int PQRY_RESPONUOLIV4 = 3775;
  public static int PQSL_RESPONUOLIV4_RECODESCLIV0 = 0;
  public static int PQSL_RESPONUOLIV4_ICON = 1;
  public static int PQSL_RESPONUOLIV4_RECTIPRAMLI0 = 2;
  public static int PQSL_RESPONUOLIV4_RECORESPUOLI = 3;
  public static int PQSL_RESPONUOLIV4_RECDEUOGELI0 = 4;
  public static int PQSL_RESPONUOLIV4_TOOLTIP = 5;

  // Table to contain panel selected row: Entrata Spesa
  //
  public static int PQRY_ENTRATASPES4 = 3776;
  public static int PQSL_ENTRATASPES4_RECODESCLIV1 = 0;
  public static int PQSL_ENTRATASPES4_E_S = 1;
  public static int PQSL_ENTRATASPES4_RECTIPRAMLI1 = 2;
  public static int PQSL_ENTRATASPES4_RECORESLIVE1 = 3;
  public static int PQSL_ENTRATASPES4_RECOTITOLIV1 = 4;
  public static int PQSL_ENTRATASPES4_RECCATINTLI1 = 5;
  public static int PQSL_ENTRATASPES4_RECCODTERLI1 = 6;
  public static int PQSL_ENTRATASPES4_RECRISINTLI1 = 7;
  public static int PQSL_ENTRATASPES4_RECOCAPILIV1 = 8;
  public static int PQSL_ENTRATASPES4_RECOARTILIV1 = 9;
  public static int PQSL_ENTRATASPES4_RECANIMACLI1 = 10;
  public static int PQSL_ENTRATASPES4_RECNUIMACLI1 = 11;
  public static int PQSL_ENTRATASPES4_RECANSUIMLI1 = 12;
  public static int PQSL_ENTRATASPES4_RECNUSUIMLI1 = 13;
  public static int PQSL_ENTRATASPES4_RECANMAORLI1 = 14;
  public static int PQSL_ENTRATASPES4_RECNUMAORLI1 = 15;
  public static int PQSL_ENTRATASPES4_RECOIMPOLIV1 = 16;
  public static int PQSL_ENTRATASPES4_RECINCPAGLI1 = 17;
  public static int PQSL_ENTRATASPES4_RECANNLIQLI1 = 18;
  public static int PQSL_ENTRATASPES4_RECNUMLIQLI1 = 19;
  public static int PQSL_ENTRATASPES4_RECUOUTILIV1 = 20;
  public static int PQSL_ENTRATASPES4_RECOORDILIV1 = 21;
  public static int PQSL_ENTRATASPES4_ICON = 22;
  public static int PQSL_ENTRATASPES4_RECPROVARLI1 = 23;
  public static int PQSL_ENTRATASPES4_HASH = 24;
  public static int PQSL_ENTRATASPES4_TOOLTIP = 25;

  // Table to contain panel selected row: Capitoliart
  //
  public static int PQRY_CAPITOLIART3 = 3777;
  public static int PQSL_CAPITOLIART3_RECODESCLIV2 = 0;
  public static int PQSL_CAPITOLIART3_TITOLO = 1;
  public static int PQSL_CAPITOLIART3_RECTIPRAMLI2 = 2;
  public static int PQSL_CAPITOLIART3_RECORESLIVE2 = 3;
  public static int PQSL_CAPITOLIART3_RECOTITOLIV2 = 4;
  public static int PQSL_CAPITOLIART3_RECCATINTLI2 = 5;
  public static int PQSL_CAPITOLIART3_RECCODTERLI2 = 6;
  public static int PQSL_CAPITOLIART3_RECRISINTLI2 = 7;
  public static int PQSL_CAPITOLIART3_RECOCAPILIV2 = 8;
  public static int PQSL_CAPITOLIART3_RECOARTILIV2 = 9;
  public static int PQSL_CAPITOLIART3_RECANIMACLI2 = 10;
  public static int PQSL_CAPITOLIART3_RECNUIMACLI2 = 11;
  public static int PQSL_CAPITOLIART3_RECANSUIMLI2 = 12;
  public static int PQSL_CAPITOLIART3_RECNUSUIMLI2 = 13;
  public static int PQSL_CAPITOLIART3_RECANMAORLI2 = 14;
  public static int PQSL_CAPITOLIART3_RECNUMAORLI2 = 15;
  public static int PQSL_CAPITOLIART3_RECOIMPOLIV2 = 16;
  public static int PQSL_CAPITOLIART3_RECINCPAGLI2 = 17;
  public static int PQSL_CAPITOLIART3_RECANNLIQLI2 = 18;
  public static int PQSL_CAPITOLIART3_RECNUMLIQLI2 = 19;
  public static int PQSL_CAPITOLIART3_RECUOGESLIV2 = 20;
  public static int PQSL_CAPITOLIART3_RECUOUTILIV2 = 21;
  public static int PQSL_CAPITOLIART3_RECOORDILIV2 = 22;
  public static int PQSL_CAPITOLIART3_ICON = 23;
  public static int PQSL_CAPITOLIART3_RECPROVARLI2 = 24;
  public static int PQSL_CAPITOLIART3_HASH = 25;
  public static int PQSL_CAPITOLIART3_TOOLTIP = 26;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV24 = 3778;
  public static int PQSL_CAPLIV24_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV24_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV24_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV24_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV24_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV24_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV24_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV24_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV24_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV24_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV24_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV24_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV24_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV24_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV24_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV24_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV24_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV24_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV24_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV24_RECUOGESLIV3 = 19;
  public static int PQSL_CAPLIV24_RECUOUTILIV3 = 20;
  public static int PQSL_CAPLIV24_RECOORDILIV3 = 21;
  public static int PQSL_CAPLIV24_ICON = 22;
  public static int PQSL_CAPLIV24_RECPROVARLI3 = 23;
  public static int PQSL_CAPLIV24_HASH = 24;
  public static int PQSL_CAPLIV24_TOOLTIP = 25;

  // Table to contain panel selected row: CAP Liv 4
  //
  public static int PQRY_CAPLIV25 = 3779;
  public static int PQSL_CAPLIV25_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV25_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV25_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV25_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV25_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV25_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV25_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV25_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV25_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV25_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV25_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV25_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV25_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV25_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV25_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV25_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV25_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV25_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV25_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV25_RECUOGESLIV4 = 19;
  public static int PQSL_CAPLIV25_RECUOUTILIV4 = 20;
  public static int PQSL_CAPLIV25_RECOORDILIV4 = 21;
  public static int PQSL_CAPLIV25_ICON = 22;
  public static int PQSL_CAPLIV25_RECPROVARLI4 = 23;
  public static int PQSL_CAPLIV25_HASH = 24;
  public static int PQSL_CAPLIV25_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC17 = 3780;
  public static int PQSL_MOVBLIVSUC17_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC17_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC17_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC17_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC17_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC17_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC17_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC17_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC17_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC17_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUC17_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUC17_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUC17_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUC17_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUC17_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUC17_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUC17_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUC17_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUC17_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUC17_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUC17_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUC17_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC17_ICON = 22;
  public static int PQSL_MOVBLIVSUC17_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUC17_HASH = 24;
  public static int PQSL_MOVBLIVSUC17_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVIW1 = 3781;
  public static int PQRY_PARAESPLVIW1_RS = 3782;
  public static int PQSL_PARAESPLVIW1_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVIW1_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVIW1_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVIW1_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVIW1_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVIW1_PARANUMESUBI = 5;
  public static int PQSL_PARAESPLVIW1_PARAANNOSUBI = 6;
  public static int PQSL_PARAESPLVIW1_PARAMSITUAAL = 7;
  public static int PQSL_PARAESPLVIW1_PARAMOTTIRIF = 8;
  public static int PQSL_PARAESPLVIW1_PARAMRESPOAL = 9;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO15 = 3783;
  public static int PQSL_NOTEFUNZIO15_MODULO = 0;
  public static int PQSL_NOTEFUNZIO15_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO15_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO15_DESCRIZIONE = 3;

  // Table to contain panel selected row: Centro Di Costo Liv 1
  //
  public static int PQRY_CENDICOSLIV1 = 3784;
  public static int PQSL_CENDICOSLIV1_RECODESCLIV0 = 0;
  public static int PQSL_CENDICOSLIV1_ICON = 1;
  public static int PQSL_CENDICOSLIV1_RECTIPRAMLI0 = 2;
  public static int PQSL_CENDICOSLIV1_RECORDCENTRO = 3;
  public static int PQSL_CENDICOSLIV1_RECORORDERBY = 4;
  public static int PQSL_CENDICOSLIV1_TOOLTIP = 5;

  // Table to contain panel selected row: Entrata Spesa
  //
  public static int PQRY_ENTRATASPESA = 3785;
  public static int PQSL_ENTRATASPESA_RECODESCLIV1 = 0;
  public static int PQSL_ENTRATASPESA_E_S = 1;
  public static int PQSL_ENTRATASPESA_RECTIPRAMLI1 = 2;
  public static int PQSL_ENTRATASPESA_RECORESLIVE1 = 3;
  public static int PQSL_ENTRATASPESA_RECOTITOLIV1 = 4;
  public static int PQSL_ENTRATASPESA_RECCATINTLI1 = 5;
  public static int PQSL_ENTRATASPESA_RECCODTERLI1 = 6;
  public static int PQSL_ENTRATASPESA_RECRISINTLI1 = 7;
  public static int PQSL_ENTRATASPESA_RECOCAPILIV1 = 8;
  public static int PQSL_ENTRATASPESA_RECOARTILIV1 = 9;
  public static int PQSL_ENTRATASPESA_RECANIMACLI1 = 10;
  public static int PQSL_ENTRATASPESA_RECNUIMACLI1 = 11;
  public static int PQSL_ENTRATASPESA_RECANSUIMLI1 = 12;
  public static int PQSL_ENTRATASPESA_RECNUSUIMLI1 = 13;
  public static int PQSL_ENTRATASPESA_RECANMAORLI1 = 14;
  public static int PQSL_ENTRATASPESA_RECNUMAORLI1 = 15;
  public static int PQSL_ENTRATASPESA_RECOIMPOLIV1 = 16;
  public static int PQSL_ENTRATASPESA_RECINCPAGLI1 = 17;
  public static int PQSL_ENTRATASPESA_RECANNLIQLI1 = 18;
  public static int PQSL_ENTRATASPESA_RECNUMLIQLI1 = 19;
  public static int PQSL_ENTRATASPESA_RECOORDILIV1 = 20;
  public static int PQSL_ENTRATASPESA_ICON = 21;
  public static int PQSL_ENTRATASPESA_RECPROVARLI1 = 22;
  public static int PQSL_ENTRATASPESA_HASH = 23;
  public static int PQSL_ENTRATASPESA_TOOLTIP = 24;

  // Table to contain panel selected row: Capitoart
  //
  public static int PQRY_CAPITOART = 3786;
  public static int PQSL_CAPITOART_RECODESCLIV2 = 0;
  public static int PQSL_CAPITOART_TITOLO = 1;
  public static int PQSL_CAPITOART_RECTIPRAMLI2 = 2;
  public static int PQSL_CAPITOART_RECORESLIVE2 = 3;
  public static int PQSL_CAPITOART_RECOTITOLIV2 = 4;
  public static int PQSL_CAPITOART_RECCATINTLI2 = 5;
  public static int PQSL_CAPITOART_RECCODTERLI2 = 6;
  public static int PQSL_CAPITOART_RECRISINTLI2 = 7;
  public static int PQSL_CAPITOART_RECOCAPILIV2 = 8;
  public static int PQSL_CAPITOART_RECOARTILIV2 = 9;
  public static int PQSL_CAPITOART_RECANIMACLI2 = 10;
  public static int PQSL_CAPITOART_RECNUIMACLI2 = 11;
  public static int PQSL_CAPITOART_RECANSUIMLI2 = 12;
  public static int PQSL_CAPITOART_RECNUSUIMLI2 = 13;
  public static int PQSL_CAPITOART_RECANMAORLI2 = 14;
  public static int PQSL_CAPITOART_RECNUMAORLI2 = 15;
  public static int PQSL_CAPITOART_RECOIMPOLIV2 = 16;
  public static int PQSL_CAPITOART_RECINCPAGLI2 = 17;
  public static int PQSL_CAPITOART_RECANNLIQLI2 = 18;
  public static int PQSL_CAPITOART_RECNUMLIQLI2 = 19;
  public static int PQSL_CAPITOART_RECOORDILIV2 = 20;
  public static int PQSL_CAPITOART_ICON = 21;
  public static int PQSL_CAPITOART_RECPROVARLI2 = 22;
  public static int PQSL_CAPITOART_HASH = 23;
  public static int PQSL_CAPITOART_TOOLTIP = 24;

  // Table to contain panel selected row: CAP Liv 3
  //
  public static int PQRY_CAPLIV10 = 3787;
  public static int PQSL_CAPLIV10_RECODESCLIV3 = 0;
  public static int PQSL_CAPLIV10_RECOLIVELIV3 = 1;
  public static int PQSL_CAPLIV10_RECTIPRAMLI3 = 2;
  public static int PQSL_CAPLIV10_RECORESLIVE3 = 3;
  public static int PQSL_CAPLIV10_RECOTITOLIV3 = 4;
  public static int PQSL_CAPLIV10_RECCATINTLI3 = 5;
  public static int PQSL_CAPLIV10_RECCODTERLI3 = 6;
  public static int PQSL_CAPLIV10_RECOCAPILIV3 = 7;
  public static int PQSL_CAPLIV10_RECOARTILIV3 = 8;
  public static int PQSL_CAPLIV10_RECANIMACLI3 = 9;
  public static int PQSL_CAPLIV10_RECNUIMACLI3 = 10;
  public static int PQSL_CAPLIV10_RECANSUIMLI3 = 11;
  public static int PQSL_CAPLIV10_RECNUSUIMLI3 = 12;
  public static int PQSL_CAPLIV10_RECANMAORLI3 = 13;
  public static int PQSL_CAPLIV10_RECNUMAORLI3 = 14;
  public static int PQSL_CAPLIV10_RECOIMPOLIV3 = 15;
  public static int PQSL_CAPLIV10_RECINCPAGLI3 = 16;
  public static int PQSL_CAPLIV10_RECANNLIQLI3 = 17;
  public static int PQSL_CAPLIV10_RECNUMLIQLI3 = 18;
  public static int PQSL_CAPLIV10_RECOORDILIV3 = 19;
  public static int PQSL_CAPLIV10_ICON = 20;
  public static int PQSL_CAPLIV10_RECPROVARLI3 = 21;
  public static int PQSL_CAPLIV10_HASH = 22;
  public static int PQSL_CAPLIV10_TOOLTIP = 23;

  // Table to contain panel selected row: CAP Liv 4
  //
  public static int PQRY_CAPLIV11 = 3788;
  public static int PQSL_CAPLIV11_RECODESCLIV4 = 0;
  public static int PQSL_CAPLIV11_RECOLIVELIV4 = 1;
  public static int PQSL_CAPLIV11_RECTIPRAMLI4 = 2;
  public static int PQSL_CAPLIV11_RECORESLIVE4 = 3;
  public static int PQSL_CAPLIV11_RECOTITOLIV4 = 4;
  public static int PQSL_CAPLIV11_RECCATINTLI4 = 5;
  public static int PQSL_CAPLIV11_RECCODTERLI4 = 6;
  public static int PQSL_CAPLIV11_RECOCAPILIV4 = 7;
  public static int PQSL_CAPLIV11_RECOARTILIV4 = 8;
  public static int PQSL_CAPLIV11_RECANIMACLI4 = 9;
  public static int PQSL_CAPLIV11_RECNUIMACLI4 = 10;
  public static int PQSL_CAPLIV11_RECANSUIMLI4 = 11;
  public static int PQSL_CAPLIV11_RECNUSUIMLI4 = 12;
  public static int PQSL_CAPLIV11_RECANMAORLI4 = 13;
  public static int PQSL_CAPLIV11_RECNUMAORLI4 = 14;
  public static int PQSL_CAPLIV11_RECOIMPOLIV4 = 15;
  public static int PQSL_CAPLIV11_RECINCPAGLI4 = 16;
  public static int PQSL_CAPLIV11_RECANNLIQLI4 = 17;
  public static int PQSL_CAPLIV11_RECNUMLIQLI4 = 18;
  public static int PQSL_CAPLIV11_RECOORDILIV4 = 19;
  public static int PQSL_CAPLIV11_ICON = 20;
  public static int PQSL_CAPLIV11_RECPROVARLI4 = 21;
  public static int PQSL_CAPLIV11_HASH = 22;
  public static int PQSL_CAPLIV11_TOOLTIP = 23;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC4 = 3789;
  public static int PQSL_MOVBLIVSUCC4_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC4_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC4_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC4_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC4_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC4_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC4_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC4_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC4_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC4_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC4_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC4_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC4_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC4_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC4_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC4_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC4_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC4_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC4_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC4_RECORDLIVSUC = 19;
  public static int PQSL_MOVBLIVSUCC4_ICON = 20;
  public static int PQSL_MOVBLIVSUCC4_RECPROVALISU = 21;
  public static int PQSL_MOVBLIVSUCC4_HASH = 22;
  public static int PQSL_MOVBLIVSUCC4_TOOLTIP = 23;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI15 = 3790;
  public static int PQRY_PARAESPLVI15_RS = 3791;
  public static int PQSL_PARAESPLVI15_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI15_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI15_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI15_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI15_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI15_PARANUMESUBI = 5;
  public static int PQSL_PARAESPLVI15_PARAANNOSUBI = 6;

  // Table to contain panel selected row: Ben Deb
  //
  public static int PQRY_BENDEB = 3792;
  public static int PQSL_BENDEB_RECDESBENDEB = 0;
  public static int PQSL_BENDEB_RECCODBENDEB = 1;
  public static int PQSL_BENDEB_TIPORAMO = 2;
  public static int PQSL_BENDEB_ICON = 3;
  public static int PQSL_BENDEB_HASH = 4;
  public static int PQSL_BENDEB_TOOLTIP = 5;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE7 = 3793;
  public static int PQSL_PARTE7_RECODESCLIV1 = 0;
  public static int PQSL_PARTE7_E_S = 1;
  public static int PQSL_PARTE7_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE7_RECORESPARTE = 3;
  public static int PQSL_PARTE7_RECOTITOPART = 4;
  public static int PQSL_PARTE7_RECCATINTPAR = 5;
  public static int PQSL_PARTE7_RECCODTERPAR = 6;
  public static int PQSL_PARTE7_RECOCAPIPART = 7;
  public static int PQSL_PARTE7_RECOARTIPART = 8;
  public static int PQSL_PARTE7_RECANNIMACPA = 9;
  public static int PQSL_PARTE7_RECNUMIMACPA = 10;
  public static int PQSL_PARTE7_RECANNSUIMPA = 11;
  public static int PQSL_PARTE7_RECNUMSUIMPA = 12;
  public static int PQSL_PARTE7_RECANNMAORPA = 13;
  public static int PQSL_PARTE7_RECNUMMAORPA = 14;
  public static int PQSL_PARTE7_RECOIMPOPART = 15;
  public static int PQSL_PARTE7_RECINCPAGPAR = 16;
  public static int PQSL_PARTE7_RECANNLIQPAR = 17;
  public static int PQSL_PARTE7_RECNUMLIQPAR = 18;
  public static int PQSL_PARTE7_RECOUOGESPAR = 19;
  public static int PQSL_PARTE7_RECOUOUTIPAR = 20;
  public static int PQSL_PARTE7_RECOORDIPART = 21;
  public static int PQSL_PARTE7_ICON = 22;
  public static int PQSL_PARTE7_RECPROVARPAR = 23;
  public static int PQSL_PARTE7_HASH = 24;
  public static int PQSL_PARTE7_TOOLTIP = 25;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO3 = 3794;
  public static int PQSL_LIVELLO3_RECODESCLIV2 = 0;
  public static int PQSL_LIVELLO3_TITOLO = 1;
  public static int PQSL_LIVELLO3_RECTIPRAMLIV = 2;
  public static int PQSL_LIVELLO3_RECORDESLIVE = 3;
  public static int PQSL_LIVELLO3_RECOCAPILIVE = 4;
  public static int PQSL_LIVELLO3_RECOARTILIVE = 5;
  public static int PQSL_LIVELLO3_RECANNIMACLI = 6;
  public static int PQSL_LIVELLO3_RECNUMIMACLI = 7;
  public static int PQSL_LIVELLO3_RECANNSUIMLI = 8;
  public static int PQSL_LIVELLO3_RECNUMSUIMLI = 9;
  public static int PQSL_LIVELLO3_RECANNMAORLI = 10;
  public static int PQSL_LIVELLO3_RECNUMMAORLI = 11;
  public static int PQSL_LIVELLO3_RECOIMPOLIVE = 12;
  public static int PQSL_LIVELLO3_RECINCPAGLIV = 13;
  public static int PQSL_LIVELLO3_RECANNLIQLIV = 14;
  public static int PQSL_LIVELLO3_RECNUMLIQLIV = 15;
  public static int PQSL_LIVELLO3_RECOUOGELIVE = 16;
  public static int PQSL_LIVELLO3_RECOUOUTLIVE = 17;
  public static int PQSL_LIVELLO3_RECOORDILIVE = 18;
  public static int PQSL_LIVELLO3_ICON = 19;
  public static int PQSL_LIVELLO3_RECPROVARLIV = 20;
  public static int PQSL_LIVELLO3_HASH = 21;
  public static int PQSL_LIVELLO3_TOOLTIP = 22;

  // Table to contain panel selected row: Livello 2
  //
  public static int PQRY_LIVELLO4 = 3795;
  public static int PQSL_LIVELLO4_RECODESCLIV2 = 0;
  public static int PQSL_LIVELLO4_TITOLO = 1;
  public static int PQSL_LIVELLO4_RECTIPRAMLI2 = 2;
  public static int PQSL_LIVELLO4_RECORDESLIV2 = 3;
  public static int PQSL_LIVELLO4_RECOCAPILIVE = 4;
  public static int PQSL_LIVELLO4_RECOARTILIVE = 5;
  public static int PQSL_LIVELLO4_RECANIMACLI2 = 6;
  public static int PQSL_LIVELLO4_RECNUIMACLI2 = 7;
  public static int PQSL_LIVELLO4_RECANSUIMLI2 = 8;
  public static int PQSL_LIVELLO4_RECNUSUIMLI2 = 9;
  public static int PQSL_LIVELLO4_RECANMAORLI2 = 10;
  public static int PQSL_LIVELLO4_RECNUMAORLI2 = 11;
  public static int PQSL_LIVELLO4_RECOIMPOLIV2 = 12;
  public static int PQSL_LIVELLO4_RECINCPAGLI2 = 13;
  public static int PQSL_LIVELLO4_RECANNLIQLI2 = 14;
  public static int PQSL_LIVELLO4_RECNUMLIQLI2 = 15;
  public static int PQSL_LIVELLO4_RECOUOGELIV2 = 16;
  public static int PQSL_LIVELLO4_RECOUOUTLIV2 = 17;
  public static int PQSL_LIVELLO4_RECOORDILIV2 = 18;
  public static int PQSL_LIVELLO4_ICON = 19;
  public static int PQSL_LIVELLO4_RECPROVARLI2 = 20;
  public static int PQSL_LIVELLO4_HASH = 21;
  public static int PQSL_LIVELLO4_TOOLTIP = 22;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI17 = 3796;
  public static int PQRY_PARAESPLVI17_RS = 3797;
  public static int PQSL_PARAESPLVI17_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI17_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI17_PARACODIBENE = 2;
  public static int PQSL_PARAESPLVI17_PARRAGSOCBEN = 3;

  // Table to contain panel selected row: Org Del
  //
  public static int PQRY_ORGDEL1 = 3798;
  public static int PQSL_ORGDEL1_DESCRIORGDEL = 0;
  public static int PQSL_ORGDEL1_RECSEDDEORDE = 1;
  public static int PQSL_ORGDEL1_NUMDELORGDEL = 2;
  public static int PQSL_ORGDEL1_ANNDELORGDEL = 3;
  public static int PQSL_ORGDEL1_TIPRAMORGDEL = 4;
  public static int PQSL_ORGDEL1_ICON = 5;
  public static int PQSL_ORGDEL1_HASH = 6;
  public static int PQSL_ORGDEL1_TOOLTIP = 7;

  // Table to contain panel selected row: Del
  //
  public static int PQRY_DEL3 = 3799;
  public static int PQSL_DEL3_RECORDESCDEL = 0;
  public static int PQSL_DEL3_RECORSEDEDEL = 1;
  public static int PQSL_DEL3_RECORNUMEDEL = 2;
  public static int PQSL_DEL3_RECORANNODEL = 3;
  public static int PQSL_DEL3_TIPORAMO = 4;
  public static int PQSL_DEL3_ICON = 5;
  public static int PQSL_DEL3_HASH = 6;
  public static int PQSL_DEL3_TOOLTIP = 7;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO9 = 3800;
  public static int PQSL_LIVELLO9_RECODESCLIV2 = 0;
  public static int PQSL_LIVELLO9_TITOLO = 1;
  public static int PQSL_LIVELLO9_RECTIPRAMLIV = 2;
  public static int PQSL_LIVELLO9_RECORDESLIVE = 3;
  public static int PQSL_LIVELLO9_RECANNIMACLI = 4;
  public static int PQSL_LIVELLO9_RECNUMIMACLI = 5;
  public static int PQSL_LIVELLO9_RECANNSUIMLI = 6;
  public static int PQSL_LIVELLO9_RECNUMSUIMLI = 7;
  public static int PQSL_LIVELLO9_RECANNMAORLI = 8;
  public static int PQSL_LIVELLO9_RECNUMMAORLI = 9;
  public static int PQSL_LIVELLO9_RECOIMPOLIVE = 10;
  public static int PQSL_LIVELLO9_RECINCPAGLIV = 11;
  public static int PQSL_LIVELLO9_RECANNLIQLIV = 12;
  public static int PQSL_LIVELLO9_RECNUMLIQLIV = 13;
  public static int PQSL_LIVELLO9_RECOUOGELIVE = 14;
  public static int PQSL_LIVELLO9_RECOUOUTLIVE = 15;
  public static int PQSL_LIVELLO9_RECOORDILIVE = 16;
  public static int PQSL_LIVELLO9_ICON = 17;
  public static int PQSL_LIVELLO9_RECPROVARLIV = 18;
  public static int PQSL_LIVELLO9_HASH = 19;
  public static int PQSL_LIVELLO9_TOOLTIP = 20;

  // Table to contain panel selected row: Livello 2
  //
  public static int PQRY_LIVELLO6 = 3801;
  public static int PQSL_LIVELLO6_RECODESCLIV2 = 0;
  public static int PQSL_LIVELLO6_TITOLO = 1;
  public static int PQSL_LIVELLO6_RECTIPRAMLIV = 2;
  public static int PQSL_LIVELLO6_RECORDESLIVE = 3;
  public static int PQSL_LIVELLO6_RECANNIMACLI = 4;
  public static int PQSL_LIVELLO6_RECNUMIMACLI = 5;
  public static int PQSL_LIVELLO6_RECANNSUIMLI = 6;
  public static int PQSL_LIVELLO6_RECNUMSUIMLI = 7;
  public static int PQSL_LIVELLO6_RECANNMAORLI = 8;
  public static int PQSL_LIVELLO6_RECNUMMAORLI = 9;
  public static int PQSL_LIVELLO6_RECOIMPOLIVE = 10;
  public static int PQSL_LIVELLO6_RECINCPAGLIV = 11;
  public static int PQSL_LIVELLO6_RECANNLIQLIV = 12;
  public static int PQSL_LIVELLO6_RECNUMLIQLIV = 13;
  public static int PQSL_LIVELLO6_RECOUOGELIVE = 14;
  public static int PQSL_LIVELLO6_RECOUOUTLIVE = 15;
  public static int PQSL_LIVELLO6_RECOORDILIVE = 16;
  public static int PQSL_LIVELLO6_ICON = 17;
  public static int PQSL_LIVELLO6_RECPROVARLIV = 18;
  public static int PQSL_LIVELLO6_HASH = 19;
  public static int PQSL_LIVELLO6_TOOLTIP = 20;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI28 = 3802;
  public static int PQRY_PARAESPLVI28_RS = 3803;
  public static int PQSL_PARAESPLVI28_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI28_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI28_PARAMNUMEDEL = 2;
  public static int PQSL_PARAESPLVI28_PARAMSEDEDEL = 3;
  public static int PQSL_PARAESPLVI28_PARAMANNODEL = 4;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE2 = 3804;
  public static int PQSL_PARTE2_RECODESCLIV1 = 0;
  public static int PQSL_PARTE2_E_S = 1;
  public static int PQSL_PARTE2_RECTIPRAMLI1 = 2;
  public static int PQSL_PARTE2_RECORESLIVE1 = 3;
  public static int PQSL_PARTE2_RECOTITOLIV1 = 4;
  public static int PQSL_PARTE2_RECCATINTLI1 = 5;
  public static int PQSL_PARTE2_RECCODTERLI1 = 6;
  public static int PQSL_PARTE2_RECOCAPILIV1 = 7;
  public static int PQSL_PARTE2_RECOARTILIV1 = 8;
  public static int PQSL_PARTE2_RECANIMACLI1 = 9;
  public static int PQSL_PARTE2_RECNUIMACLI1 = 10;
  public static int PQSL_PARTE2_RECANSUIMLI1 = 11;
  public static int PQSL_PARTE2_RECNUSUIMLI1 = 12;
  public static int PQSL_PARTE2_RECANMAORLI1 = 13;
  public static int PQSL_PARTE2_RECNUMAORLI1 = 14;
  public static int PQSL_PARTE2_RECOIMPOLIV1 = 15;
  public static int PQSL_PARTE2_RECINCPAGLI1 = 16;
  public static int PQSL_PARTE2_RECANNLIQLI1 = 17;
  public static int PQSL_PARTE2_RECNUMLIQLI1 = 18;
  public static int PQSL_PARTE2_RECUOGESLIV1 = 19;
  public static int PQSL_PARTE2_RECUOUTILIV1 = 20;
  public static int PQSL_PARTE2_RECOORDILIV1 = 21;
  public static int PQSL_PARTE2_ICON = 22;
  public static int PQSL_PARTE2_RECPROVARLI1 = 23;
  public static int PQSL_PARTE2_HASH = 24;
  public static int PQSL_PARTE2_TOOLTIP = 25;

  // Table to contain panel selected row: Titolo Missione
  //
  public static int PQRY_TITOLOMISSI1 = 3805;
  public static int PQSL_TITOLOMISSI1_DESCRITITMIS = 0;
  public static int PQSL_TITOLOMISSI1_RECLIVTITMIS = 1;
  public static int PQSL_TITOLOMISSI1_TIPRAMTITMIS = 2;
  public static int PQSL_TITOLOMISSI1_ESTITMIS = 3;
  public static int PQSL_TITOLOMISSI1_RECCODGETIMI = 4;
  public static int PQSL_TITOLOMISSI1_HASH = 5;
  public static int PQSL_TITOLOMISSI1_ORDINAMENTO = 6;
  public static int PQSL_TITOLOMISSI1_ICON = 7;

  // Table to contain panel selected row: Tipologia Programma
  //
  public static int PQRY_TIPOLOPROGR1 = 3806;
  public static int PQSL_TIPOLOPROGR1_DESCRITIPPRO = 0;
  public static int PQSL_TIPOLOPROGR1_RECLIVTIPPRO = 1;
  public static int PQSL_TIPOLOPROGR1_TIPRAMTIPPRO = 2;
  public static int PQSL_TIPOLOPROGR1_ESTIPPRO = 3;
  public static int PQSL_TIPOLOPROGR1_RECCODGETIPR = 4;
  public static int PQSL_TIPOLOPROGR1_HASH = 5;
  public static int PQSL_TIPOLOPROGR1_ORDINAMENTO = 6;
  public static int PQSL_TIPOLOPROGR1_ICON = 7;

  // Table to contain panel selected row: Liv 1
  //
  public static int PQRY_LIV3 = 3807;
  public static int PQSL_LIV3_DESNODOLIV1 = 0;
  public static int PQSL_LIV3_REESMALICOL1 = 1;
  public static int PQSL_LIV3_HASH = 2;
  public static int PQSL_LIV3_ICON = 3;
  public static int PQSL_LIV3_TOOLTIP = 4;

  // Table to contain panel selected row: Liv 2
  //
  public static int PQRY_LIV4 = 3808;
  public static int PQSL_LIV4_DESNODOLIV2 = 0;
  public static int PQSL_LIV4_REESMALICOL2 = 1;
  public static int PQSL_LIV4_HASH = 2;
  public static int PQSL_LIV4_ICON = 3;
  public static int PQSL_LIV4_TOOLTIP = 4;

  // Table to contain panel selected row: Capitoli
  //
  public static int PQRY_CAPITOLI1 = 3809;
  public static int PQSL_CAPITOLI1_RECODESCLIV4 = 0;
  public static int PQSL_CAPITOLI1_RECOLIVELIV4 = 1;
  public static int PQSL_CAPITOLI1_RECTIPRAMCAP = 2;
  public static int PQSL_CAPITOLI1_RECORDESCAP = 3;
  public static int PQSL_CAPITOLI1_RECORTITOCAP = 4;
  public static int PQSL_CAPITOLI1_RECCATINTCAP = 5;
  public static int PQSL_CAPITOLI1_RECCODTERCAP = 6;
  public static int PQSL_CAPITOLI1_RECORCAPICAP = 7;
  public static int PQSL_CAPITOLI1_RECORARTICAP = 8;
  public static int PQSL_CAPITOLI1_RECANNIMACCA = 9;
  public static int PQSL_CAPITOLI1_RECNUMIMACCA = 10;
  public static int PQSL_CAPITOLI1_RECANNSUIMCA = 11;
  public static int PQSL_CAPITOLI1_RECNUMSUIMCA = 12;
  public static int PQSL_CAPITOLI1_RECANNMAORCA = 13;
  public static int PQSL_CAPITOLI1_RECNUMMAORCA = 14;
  public static int PQSL_CAPITOLI1_RECORIMPOCAP = 15;
  public static int PQSL_CAPITOLI1_RECINCPAGCAP = 16;
  public static int PQSL_CAPITOLI1_RECANNLIQCAP = 17;
  public static int PQSL_CAPITOLI1_RECNUMLIQCAP = 18;
  public static int PQSL_CAPITOLI1_RECOUOGESCAP = 19;
  public static int PQSL_CAPITOLI1_RECOUOUTICAP = 20;
  public static int PQSL_CAPITOLI1_RECORORDICAP = 21;
  public static int PQSL_CAPITOLI1_ICON = 22;
  public static int PQSL_CAPITOLI1_RECPROVARCAP = 23;
  public static int PQSL_CAPITOLI1_HASH = 24;
  public static int PQSL_CAPITOLI1_TOOLTIP = 25;

  // Table to contain panel selected row: Movimenti Succ
  //
  public static int PQRY_MOVIMENTSUC1 = 3810;
  public static int PQSL_MOVIMENTSUC1_RECDESMOVSUC = 0;
  public static int PQSL_MOVIMENTSUC1_RECLIVMOVSUC = 1;
  public static int PQSL_MOVIMENTSUC1_RECTIPRAMOSU = 2;
  public static int PQSL_MOVIMENTSUC1_RECOESMOVSUC = 3;
  public static int PQSL_MOVIMENTSUC1_RECTITMOVSUC = 4;
  public static int PQSL_MOVIMENTSUC1_RECCATINMOSU = 5;
  public static int PQSL_MOVIMENTSUC1_RECCODTEMOSU = 6;
  public static int PQSL_MOVIMENTSUC1_RECCAPMOVSUC = 7;
  public static int PQSL_MOVIMENTSUC1_RECARTMOVSUC = 8;
  public static int PQSL_MOVIMENTSUC1_REANIMACMOSU = 9;
  public static int PQSL_MOVIMENTSUC1_RENUIMACMOSU = 10;
  public static int PQSL_MOVIMENTSUC1_REANSUIMMOSU = 11;
  public static int PQSL_MOVIMENTSUC1_RENUSUIMMOSU = 12;
  public static int PQSL_MOVIMENTSUC1_REANMAORMOSU = 13;
  public static int PQSL_MOVIMENTSUC1_RENUMAORMOSU = 14;
  public static int PQSL_MOVIMENTSUC1_RECIMPMOVSUC = 15;
  public static int PQSL_MOVIMENTSUC1_RECINCPAMOSU = 16;
  public static int PQSL_MOVIMENTSUC1_RECANNLIMOSU = 17;
  public static int PQSL_MOVIMENTSUC1_RECNUMLIMOSU = 18;
  public static int PQSL_MOVIMENTSUC1_RECUOGESMOSU = 19;
  public static int PQSL_MOVIMENTSUC1_RECUOUTIMOSU = 20;
  public static int PQSL_MOVIMENTSUC1_RECORDMOVSUC = 21;
  public static int PQSL_MOVIMENTSUC1_ICON = 22;
  public static int PQSL_MOVIMENTSUC1_RECPROVAMOSU = 23;
  public static int PQSL_MOVIMENTSUC1_HASH = 24;
  public static int PQSL_MOVIMENTSUC1_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI20 = 3811;
  public static int PQRY_PARAESPLVI20_RS = 3812;
  public static int PQSL_PARAESPLVI20_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI20_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI20_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI20_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI20_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI20_PARATIPOPROG = 5;
  public static int PQSL_PARAESPLVI20_PARANUMESUBI = 6;
  public static int PQSL_PARAESPLVI20_PARAANNOSUBI = 7;

  // Table to contain panel selected row: Unita Gestione
  //
  public static int PQRY_UNITAGESTIO1 = 3813;
  public static int PQSL_UNITAGESTIO1_DESCLIVELLUO = 0;
  public static int PQSL_UNITAGESTIO1_TIPORAMLIVUO = 1;
  public static int PQSL_UNITAGESTIO1_RECPROGELIUO = 2;
  public static int PQSL_UNITAGESTIO1_RECOORDLIVUO = 3;
  public static int PQSL_UNITAGESTIO1_HASH = 4;
  public static int PQSL_UNITAGESTIO1_TOOLTIP = 5;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE6 = 3814;
  public static int PQSL_PARTE6_RECODESCLIV1 = 0;
  public static int PQSL_PARTE6_E_S = 1;
  public static int PQSL_PARTE6_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE6_RECORESPARTE = 3;
  public static int PQSL_PARTE6_RECOTITOPART = 4;
  public static int PQSL_PARTE6_RECCATINTPAR = 5;
  public static int PQSL_PARTE6_RECCODTERPAR = 6;
  public static int PQSL_PARTE6_RECOCAPIPART = 7;
  public static int PQSL_PARTE6_RECOARTIPART = 8;
  public static int PQSL_PARTE6_RECANNIMACPA = 9;
  public static int PQSL_PARTE6_RECNUMIMACPA = 10;
  public static int PQSL_PARTE6_RECANNSUIMPA = 11;
  public static int PQSL_PARTE6_RECNUMSUIMPA = 12;
  public static int PQSL_PARTE6_RECANNMAORPA = 13;
  public static int PQSL_PARTE6_RECNUMMAORPA = 14;
  public static int PQSL_PARTE6_RECOIMPOPART = 15;
  public static int PQSL_PARTE6_RECINCPAGPAR = 16;
  public static int PQSL_PARTE6_RECANNLIQPAR = 17;
  public static int PQSL_PARTE6_RECNUMLIQPAR = 18;
  public static int PQSL_PARTE6_RECOUOGESPAR = 19;
  public static int PQSL_PARTE6_RECOUOUTIPAR = 20;
  public static int PQSL_PARTE6_RECOORDIPART = 21;
  public static int PQSL_PARTE6_ICON = 22;
  public static int PQSL_PARTE6_RECPROVARPAR = 23;
  public static int PQSL_PARTE6_HASH = 24;
  public static int PQSL_PARTE6_TOOLTIP = 25;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO2 = 3815;
  public static int PQSL_LIVELLO2_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO2_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO2_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO2_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO2_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO2_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO2_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO2_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO2_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO2_RECANIMACLI1 = 9;
  public static int PQSL_LIVELLO2_RECNUIMACLI1 = 10;
  public static int PQSL_LIVELLO2_RECANSUIMLI1 = 11;
  public static int PQSL_LIVELLO2_RECNUSUIMLI1 = 12;
  public static int PQSL_LIVELLO2_RECANMAORLI1 = 13;
  public static int PQSL_LIVELLO2_RECNUMAORLI1 = 14;
  public static int PQSL_LIVELLO2_RECOIMPOLIV1 = 15;
  public static int PQSL_LIVELLO2_RECINCPAGLI1 = 16;
  public static int PQSL_LIVELLO2_RECANNLIQLI1 = 17;
  public static int PQSL_LIVELLO2_RECNUMLIQLI1 = 18;
  public static int PQSL_LIVELLO2_RECUOGESLIV1 = 19;
  public static int PQSL_LIVELLO2_RECUOUTILIV1 = 20;
  public static int PQSL_LIVELLO2_RECOORDILIV1 = 21;
  public static int PQSL_LIVELLO2_ICON = 22;
  public static int PQSL_LIVELLO2_RECPROVARLI1 = 23;
  public static int PQSL_LIVELLO2_HASH = 24;
  public static int PQSL_LIVELLO2_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC8 = 3816;
  public static int PQSL_MOVBLIVSUCC8_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC8_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC8_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC8_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC8_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC8_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC8_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC8_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC8_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC8_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUCC8_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUCC8_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUCC8_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUCC8_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUCC8_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUCC8_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUCC8_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUCC8_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUCC8_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUCC8_RECUOGLIVSUC = 19;
  public static int PQSL_MOVBLIVSUCC8_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUCC8_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC8_ICON = 22;
  public static int PQSL_MOVBLIVSUCC8_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUCC8_HASH = 24;
  public static int PQSL_MOVBLIVSUCC8_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI25 = 3817;
  public static int PQRY_PARAESPLVI25_RS = 3818;
  public static int PQSL_PARAESPLVI25_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI25_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI25_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI25_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI25_PARAANNOIMPA = 4;
  public static int PQSL_PARAESPLVI25_PARANUMESUBI = 5;
  public static int PQSL_PARAESPLVI25_PARAANNOSUBI = 6;

  // Table to contain panel selected row: Unita Gestione
  //
  public static int PQRY_UNITAGESTION = 3819;
  public static int PQSL_UNITAGESTION_DESCLIVELLUO = 0;
  public static int PQSL_UNITAGESTION_TIPORAMLIVUO = 1;
  public static int PQSL_UNITAGESTION_RECPROGELIUO = 2;
  public static int PQSL_UNITAGESTION_RECOORDLIVUO = 3;
  public static int PQSL_UNITAGESTION_HASH = 4;
  public static int PQSL_UNITAGESTION_NUOVAESPRESS = 5;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE1 = 3820;
  public static int PQSL_PARTE1_RECODESCLIV1 = 0;
  public static int PQSL_PARTE1_E_S = 1;
  public static int PQSL_PARTE1_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE1_RECORESPARTE = 3;
  public static int PQSL_PARTE1_RECOTITOPART = 4;
  public static int PQSL_PARTE1_RECCATINTPAR = 5;
  public static int PQSL_PARTE1_RECCODTERPAR = 6;
  public static int PQSL_PARTE1_RECOCAPIPART = 7;
  public static int PQSL_PARTE1_RECOARTIPART = 8;
  public static int PQSL_PARTE1_RECANNIMACPA = 9;
  public static int PQSL_PARTE1_RECNUMIMACPA = 10;
  public static int PQSL_PARTE1_RECANNSUIMPA = 11;
  public static int PQSL_PARTE1_RECNUMSUIMPA = 12;
  public static int PQSL_PARTE1_RECANNMAORPA = 13;
  public static int PQSL_PARTE1_RECNUMMAORPA = 14;
  public static int PQSL_PARTE1_RECOIMPOPART = 15;
  public static int PQSL_PARTE1_RECINCPAGPAR = 16;
  public static int PQSL_PARTE1_RECANNLIQPAR = 17;
  public static int PQSL_PARTE1_RECNUMLIQPAR = 18;
  public static int PQSL_PARTE1_RECOUOGEPART = 19;
  public static int PQSL_PARTE1_RECOUOUTIPAR = 20;
  public static int PQSL_PARTE1_RECOORDIPART = 21;
  public static int PQSL_PARTE1_ICON = 22;
  public static int PQSL_PARTE1_RECPROVARPAR = 23;
  public static int PQSL_PARTE1_HASH = 24;
  public static int PQSL_PARTE1_TOOLTIP = 25;

  // Table to contain panel selected row: Titolo Livello 1
  //
  public static int PQRY_TITOLOLIVEL2 = 3821;
  public static int PQSL_TITOLOLIVEL2_DESCRTITLIV1 = 0;
  public static int PQSL_TITOLOLIVEL2_RECLIVTITLI1 = 1;
  public static int PQSL_TITOLOLIVEL2_TIPRAMTITLI1 = 2;
  public static int PQSL_TITOLOLIVEL2_ESTITLIV1 = 3;
  public static int PQSL_TITOLOLIVEL2_RECCOGETILI1 = 4;
  public static int PQSL_TITOLOLIVEL2_HASHTITLIV1 = 5;
  public static int PQSL_TITOLOLIVEL2_ORDINTITLIV1 = 6;
  public static int PQSL_TITOLOLIVEL2_ICON = 7;

  // Table to contain panel selected row: Tipologia Livello 2
  //
  public static int PQRY_TIPOLOLIVEL3 = 3822;
  public static int PQSL_TIPOLOLIVEL3_DESCRTIPLIV2 = 0;
  public static int PQSL_TIPOLOLIVEL3_RECLIVTIPLI2 = 1;
  public static int PQSL_TIPOLOLIVEL3_TIPRAMTIPLI2 = 2;
  public static int PQSL_TIPOLOLIVEL3_ESTIPLIV2 = 3;
  public static int PQSL_TIPOLOLIVEL3_RECOGEMA2LI2 = 4;
  public static int PQSL_TIPOLOLIVEL3_HASHTIPLIV2 = 5;
  public static int PQSL_TIPOLOLIVEL3_ORDINTIPLIV2 = 6;
  public static int PQSL_TIPOLOLIVEL3_ICON = 7;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO5 = 3823;
  public static int PQSL_LIVELLO5_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO5_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO5_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO5_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO5_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO5_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO5_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO5_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO5_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO5_RECANIMACLI1 = 9;
  public static int PQSL_LIVELLO5_RECNUIMACLI1 = 10;
  public static int PQSL_LIVELLO5_RECANSUIMLI1 = 11;
  public static int PQSL_LIVELLO5_RECNUSUIMLI1 = 12;
  public static int PQSL_LIVELLO5_RECANMAORLI1 = 13;
  public static int PQSL_LIVELLO5_RECNUMAORLI1 = 14;
  public static int PQSL_LIVELLO5_RECOIMPOLIV1 = 15;
  public static int PQSL_LIVELLO5_RECINCPAGLI1 = 16;
  public static int PQSL_LIVELLO5_RECANNLIQLI1 = 17;
  public static int PQSL_LIVELLO5_RECNUMLIQLI1 = 18;
  public static int PQSL_LIVELLO5_RECUOGESLIV1 = 19;
  public static int PQSL_LIVELLO5_RECUOUTILIV1 = 20;
  public static int PQSL_LIVELLO5_RECOORDILIV1 = 21;
  public static int PQSL_LIVELLO5_ICON = 22;
  public static int PQSL_LIVELLO5_RECPROVARLI1 = 23;
  public static int PQSL_LIVELLO5_HASH = 24;
  public static int PQSL_LIVELLO5_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC11 = 3824;
  public static int PQSL_MOVBLIVSUC11_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC11_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC11_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC11_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC11_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC11_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC11_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC11_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC11_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC11_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUC11_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUC11_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUC11_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUC11_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUC11_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUC11_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUC11_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUC11_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUC11_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUC11_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUC11_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUC11_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC11_ICON = 22;
  public static int PQSL_MOVBLIVSUC11_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUC11_HASH = 24;
  public static int PQSL_MOVBLIVSUC11_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI22 = 3825;
  public static int PQRY_PARAESPLVI22_RS = 3826;
  public static int PQSL_PARAESPLVI22_PARATIPOESPL = 0;
  public static int PQSL_PARAESPLVI22_PARASCHEINFO = 1;
  public static int PQSL_PARAESPLVI22_PARAESERSCHE = 2;
  public static int PQSL_PARAESPLVI22_PARAMPARTE = 3;
  public static int PQSL_PARAESPLVI22_PARANUMEIMPA = 4;
  public static int PQSL_PARAESPLVI22_PARAANNOIMPA = 5;
  public static int PQSL_PARAESPLVI22_PARANUMESUBI = 6;
  public static int PQSL_PARAESPLVI22_PARAANNOSUBI = 7;

  // Table to contain panel selected row: Resp UO
  //
  public static int PQRY_RESPUO1 = 3827;
  public static int PQSL_RESPUO1_RECODESRESUO = 0;
  public static int PQSL_RESPUO1_TIPORAMRESUO = 1;
  public static int PQSL_RESPUO1_RECRESUOREUO = 2;
  public static int PQSL_RESPUO1_RECOORDRESUO = 3;
  public static int PQSL_RESPUO1_ICON = 4;
  public static int PQSL_RESPUO1_HASH = 5;
  public static int PQSL_RESPUO1_TOOLTIP = 6;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE3 = 3828;
  public static int PQSL_PARTE3_RECODESCLIV1 = 0;
  public static int PQSL_PARTE3_E_S = 1;
  public static int PQSL_PARTE3_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE3_RECORESPARTE = 3;
  public static int PQSL_PARTE3_RECOTITOPART = 4;
  public static int PQSL_PARTE3_RECCATINTPAR = 5;
  public static int PQSL_PARTE3_RECCODTERPAR = 6;
  public static int PQSL_PARTE3_RECOCAPIPART = 7;
  public static int PQSL_PARTE3_RECOARTIPART = 8;
  public static int PQSL_PARTE3_RECANNIMACPA = 9;
  public static int PQSL_PARTE3_RECNUMIMACPA = 10;
  public static int PQSL_PARTE3_RECANNSUIMPA = 11;
  public static int PQSL_PARTE3_RECNUMSUIMPA = 12;
  public static int PQSL_PARTE3_RECANNMAORPA = 13;
  public static int PQSL_PARTE3_RECNUMMAORPA = 14;
  public static int PQSL_PARTE3_RECOIMPOPART = 15;
  public static int PQSL_PARTE3_RECINCPAGPAR = 16;
  public static int PQSL_PARTE3_RECANNLIQPAR = 17;
  public static int PQSL_PARTE3_RECNUMLIQPAR = 18;
  public static int PQSL_PARTE3_RECOUOGEPART = 19;
  public static int PQSL_PARTE3_RECOUOUTIPAR = 20;
  public static int PQSL_PARTE3_RECOORDIPART = 21;
  public static int PQSL_PARTE3_ICON = 22;
  public static int PQSL_PARTE3_RECPROVARPAR = 23;
  public static int PQSL_PARTE3_HASH = 24;
  public static int PQSL_PARTE3_TOOLTIP = 25;

  // Table to contain panel selected row: Titolo Livello 1
  //
  public static int PQRY_TITOLOLIVEL3 = 3829;
  public static int PQSL_TITOLOLIVEL3_DESCRTITLIV1 = 0;
  public static int PQSL_TITOLOLIVEL3_RECLIVTITLI1 = 1;
  public static int PQSL_TITOLOLIVEL3_TIPRAMTITLI1 = 2;
  public static int PQSL_TITOLOLIVEL3_ESTITLIV1 = 3;
  public static int PQSL_TITOLOLIVEL3_RECCOGETILI1 = 4;
  public static int PQSL_TITOLOLIVEL3_HASHTITLIV1 = 5;
  public static int PQSL_TITOLOLIVEL3_ORDINTITLIV1 = 6;
  public static int PQSL_TITOLOLIVEL3_ICON = 7;

  // Table to contain panel selected row: Tipologia Livello 2
  //
  public static int PQRY_TIPOLOLIVEL4 = 3830;
  public static int PQSL_TIPOLOLIVEL4_DESCRTIPLIV2 = 0;
  public static int PQSL_TIPOLOLIVEL4_RECLIVTIPLI2 = 1;
  public static int PQSL_TIPOLOLIVEL4_TIPRAMTIPLI2 = 2;
  public static int PQSL_TIPOLOLIVEL4_ESTIPLIV2 = 3;
  public static int PQSL_TIPOLOLIVEL4_RECOGEMA2LI2 = 4;
  public static int PQSL_TIPOLOLIVEL4_HASHTIPLIV2 = 5;
  public static int PQSL_TIPOLOLIVEL4_ORDINTIPLIV2 = 6;
  public static int PQSL_TIPOLOLIVEL4_ICON = 7;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO10 = 3831;
  public static int PQSL_LIVELLO10_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO10_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO10_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO10_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO10_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO10_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO10_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO10_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO10_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO10_RECANIMACLI1 = 9;
  public static int PQSL_LIVELLO10_RECNUIMACLI1 = 10;
  public static int PQSL_LIVELLO10_RECANSUIMLI1 = 11;
  public static int PQSL_LIVELLO10_RECNUSUIMLI1 = 12;
  public static int PQSL_LIVELLO10_RECANMAORLI1 = 13;
  public static int PQSL_LIVELLO10_RECNUMAORLI1 = 14;
  public static int PQSL_LIVELLO10_RECOIMPOLIV1 = 15;
  public static int PQSL_LIVELLO10_RECINCPAGLI1 = 16;
  public static int PQSL_LIVELLO10_RECANNLIQLI1 = 17;
  public static int PQSL_LIVELLO10_RECNUMLIQLI1 = 18;
  public static int PQSL_LIVELLO10_RECUOGESLIV1 = 19;
  public static int PQSL_LIVELLO10_RECUOUTILIV1 = 20;
  public static int PQSL_LIVELLO10_RECOORDILIV1 = 21;
  public static int PQSL_LIVELLO10_ICON = 22;
  public static int PQSL_LIVELLO10_RECPROVARLI1 = 23;
  public static int PQSL_LIVELLO10_HASH = 24;
  public static int PQSL_LIVELLO10_TOOLTIP = 25;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC13 = 3832;
  public static int PQSL_MOVBLIVSUC13_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC13_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC13_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC13_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC13_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC13_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC13_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC13_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC13_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC13_REANIMACLISU = 9;
  public static int PQSL_MOVBLIVSUC13_RENUIMACLISU = 10;
  public static int PQSL_MOVBLIVSUC13_REANSUIMLISU = 11;
  public static int PQSL_MOVBLIVSUC13_RENUSUIMLISU = 12;
  public static int PQSL_MOVBLIVSUC13_REANMAORLISU = 13;
  public static int PQSL_MOVBLIVSUC13_RENUMAORLISU = 14;
  public static int PQSL_MOVBLIVSUC13_RECIMPLIVSUC = 15;
  public static int PQSL_MOVBLIVSUC13_RECINCPALISU = 16;
  public static int PQSL_MOVBLIVSUC13_RECANNLILISU = 17;
  public static int PQSL_MOVBLIVSUC13_RECNUMLILISU = 18;
  public static int PQSL_MOVBLIVSUC13_RECUOGESLISU = 19;
  public static int PQSL_MOVBLIVSUC13_RECUOUTILISU = 20;
  public static int PQSL_MOVBLIVSUC13_RECORDLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC13_ICON = 22;
  public static int PQSL_MOVBLIVSUC13_RECPROVALISU = 23;
  public static int PQSL_MOVBLIVSUC13_HASH = 24;
  public static int PQSL_MOVBLIVSUC13_TOOLTIP = 25;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI29 = 3833;
  public static int PQRY_PARAESPLVI29_RS = 3834;
  public static int PQSL_PARAESPLVI29_PARATIPOESPL = 0;
  public static int PQSL_PARAESPLVI29_PARASCHEINFO = 1;
  public static int PQSL_PARAESPLVI29_PARAESERSCHE = 2;
  public static int PQSL_PARAESPLVI29_PARAMPARTE = 3;
  public static int PQSL_PARAESPLVI29_PARANUMEIMPA = 4;
  public static int PQSL_PARAESPLVI29_PARAANNOIMPA = 5;
  public static int PQSL_PARAESPLVI29_PARANUMESUBI = 6;
  public static int PQSL_PARAESPLVI29_PARAANNOSUBI = 7;

  // Table to contain panel selected row: Finanziamento Opera
  //
  public static int PQRY_FINANZIOPER1 = 3835;
  public static int PQSL_FINANZIOPER1_RECODESCFINA = 0;
  public static int PQSL_FINANZIOPER1_RECOLIVEFINA = 1;
  public static int PQSL_FINANZIOPER1_RECTIPRAMFIN = 2;
  public static int PQSL_FINANZIOPER1_RECORESFINAN = 3;
  public static int PQSL_FINANZIOPER1_RECOTITOFINA = 4;
  public static int PQSL_FINANZIOPER1_RECCATINTFIN = 5;
  public static int PQSL_FINANZIOPER1_RECCODTERFIN = 6;
  public static int PQSL_FINANZIOPER1_RECOCAPIFINA = 7;
  public static int PQSL_FINANZIOPER1_RECOARTIFINA = 8;
  public static int PQSL_FINANZIOPER1_RECOFINAFINA = 9;
  public static int PQSL_FINANZIOPER1_RECOOPERFINA = 10;
  public static int PQSL_FINANZIOPER1_RECANNIMACFI = 11;
  public static int PQSL_FINANZIOPER1_RECNUMIMACFI = 12;
  public static int PQSL_FINANZIOPER1_RECANNSUIMFI = 13;
  public static int PQSL_FINANZIOPER1_RECNUMSUIMFI = 14;
  public static int PQSL_FINANZIOPER1_RECANNMAORFI = 15;
  public static int PQSL_FINANZIOPER1_RECNUMMAORFI = 16;
  public static int PQSL_FINANZIOPER1_RECOIMPOFINA = 17;
  public static int PQSL_FINANZIOPER1_RECINCPAGFIN = 18;
  public static int PQSL_FINANZIOPER1_RECANNLIQFIN = 19;
  public static int PQSL_FINANZIOPER1_RECNUMLIQFIN = 20;
  public static int PQSL_FINANZIOPER1_RECOUOGESFIN = 21;
  public static int PQSL_FINANZIOPER1_RECOUOUTIFIN = 22;
  public static int PQSL_FINANZIOPER1_RECOORDIFINA = 23;
  public static int PQSL_FINANZIOPER1_ICON = 24;
  public static int PQSL_FINANZIOPER1_RECPROVARFIN = 25;
  public static int PQSL_FINANZIOPER1_HASH = 26;
  public static int PQSL_FINANZIOPER1_TOOLTIP = 27;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE8 = 3836;
  public static int PQSL_PARTE8_RECODESCLIV1 = 0;
  public static int PQSL_PARTE8_E_S = 1;
  public static int PQSL_PARTE8_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE8_RECORESPARTE = 3;
  public static int PQSL_PARTE8_RECOTITOPART = 4;
  public static int PQSL_PARTE8_RECCATINTPAR = 5;
  public static int PQSL_PARTE8_RECCODTERPAR = 6;
  public static int PQSL_PARTE8_RECOCAPIPART = 7;
  public static int PQSL_PARTE8_RECOARTIPART = 8;
  public static int PQSL_PARTE8_RECOFINAPART = 9;
  public static int PQSL_PARTE8_RECOOPERPART = 10;
  public static int PQSL_PARTE8_RECANNIMACPA = 11;
  public static int PQSL_PARTE8_RECNUMIMACPA = 12;
  public static int PQSL_PARTE8_RECANNSUIMPA = 13;
  public static int PQSL_PARTE8_RECNUMSUIMPA = 14;
  public static int PQSL_PARTE8_RECANNMAORPA = 15;
  public static int PQSL_PARTE8_RECNUMMAORPA = 16;
  public static int PQSL_PARTE8_RECOIMPOPART = 17;
  public static int PQSL_PARTE8_RECINCPAGPAR = 18;
  public static int PQSL_PARTE8_RECANNLIQPAR = 19;
  public static int PQSL_PARTE8_RECNUMLIQPAR = 20;
  public static int PQSL_PARTE8_RECOUOGESPAR = 21;
  public static int PQSL_PARTE8_RECOUOUTIPAR = 22;
  public static int PQSL_PARTE8_RECOORDIPART = 23;
  public static int PQSL_PARTE8_ICON = 24;
  public static int PQSL_PARTE8_RECPROVARPAR = 25;
  public static int PQSL_PARTE8_HASH = 26;
  public static int PQSL_PARTE8_TOOLTIP = 27;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO11 = 3837;
  public static int PQSL_LIVELLO11_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO11_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO11_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO11_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO11_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO11_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO11_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO11_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO11_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO11_RECOFINALIV1 = 9;
  public static int PQSL_LIVELLO11_RECOOPERLIV1 = 10;
  public static int PQSL_LIVELLO11_RECANIMACLI1 = 11;
  public static int PQSL_LIVELLO11_RECNUIMACLI1 = 12;
  public static int PQSL_LIVELLO11_RECANSUIMLI1 = 13;
  public static int PQSL_LIVELLO11_RECNUSUIMLI1 = 14;
  public static int PQSL_LIVELLO11_RECANMAORLI1 = 15;
  public static int PQSL_LIVELLO11_RECNUMAORLI1 = 16;
  public static int PQSL_LIVELLO11_RECOIMPOLIV1 = 17;
  public static int PQSL_LIVELLO11_RECINCPAGLI1 = 18;
  public static int PQSL_LIVELLO11_RECANNLIQLI1 = 19;
  public static int PQSL_LIVELLO11_RECNUMLIQLI1 = 20;
  public static int PQSL_LIVELLO11_RECUOGESLIV1 = 21;
  public static int PQSL_LIVELLO11_RECUOUTILIV1 = 22;
  public static int PQSL_LIVELLO11_RECOORDILIV1 = 23;
  public static int PQSL_LIVELLO11_ICON = 24;
  public static int PQSL_LIVELLO11_RECPROVARLI1 = 25;
  public static int PQSL_LIVELLO11_HASH = 26;
  public static int PQSL_LIVELLO11_TOOLTIP = 27;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC12 = 3838;
  public static int PQSL_MOVBLIVSUC12_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC12_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC12_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC12_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC12_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC12_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC12_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC12_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC12_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC12_RECFINLIVSUC = 9;
  public static int PQSL_MOVBLIVSUC12_RECOPELIVSUC = 10;
  public static int PQSL_MOVBLIVSUC12_REANIMACLISU = 11;
  public static int PQSL_MOVBLIVSUC12_RENUIMACLISU = 12;
  public static int PQSL_MOVBLIVSUC12_REANSUIMLISU = 13;
  public static int PQSL_MOVBLIVSUC12_RENUSUIMLISU = 14;
  public static int PQSL_MOVBLIVSUC12_REANMAORLISU = 15;
  public static int PQSL_MOVBLIVSUC12_RENUMAORLISU = 16;
  public static int PQSL_MOVBLIVSUC12_RECIMPLIVSUC = 17;
  public static int PQSL_MOVBLIVSUC12_RECINCPALISU = 18;
  public static int PQSL_MOVBLIVSUC12_RECANNLILISU = 19;
  public static int PQSL_MOVBLIVSUC12_RECNUMLILISU = 20;
  public static int PQSL_MOVBLIVSUC12_RECUOGLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC12_RECUOUTILISU = 22;
  public static int PQSL_MOVBLIVSUC12_RECORDLIVSUC = 23;
  public static int PQSL_MOVBLIVSUC12_ICON = 24;
  public static int PQSL_MOVBLIVSUC12_RECPROVALISU = 25;
  public static int PQSL_MOVBLIVSUC12_HASH = 26;
  public static int PQSL_MOVBLIVSUC12_TOOLTIP = 27;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI27 = 3839;
  public static int PQRY_PARAESPLVI27_RS = 3840;
  public static int PQSL_PARAESPLVI27_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI27_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI27_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI27_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI27_PARAANNOIMPA = 4;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE4 = 3841;
  public static int PQSL_PARTE4_RECODESCLIV1 = 0;
  public static int PQSL_PARTE4_E_S = 1;
  public static int PQSL_PARTE4_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE4_RECORESPARTE = 3;
  public static int PQSL_PARTE4_RECOTITOPART = 4;
  public static int PQSL_PARTE4_RECCATINTPAR = 5;
  public static int PQSL_PARTE4_RECCODTERPAR = 6;
  public static int PQSL_PARTE4_RECOCAPIPART = 7;
  public static int PQSL_PARTE4_RECOARTIPART = 8;
  public static int PQSL_PARTE4_RECANNIMACPA = 9;
  public static int PQSL_PARTE4_RECNUMIMACPA = 10;
  public static int PQSL_PARTE4_RECANNSUIMPA = 11;
  public static int PQSL_PARTE4_RECNUMSUIMPA = 12;
  public static int PQSL_PARTE4_RECANNMAORPA = 13;
  public static int PQSL_PARTE4_RECNUMMAORPA = 14;
  public static int PQSL_PARTE4_RECOIMPOPART = 15;
  public static int PQSL_PARTE4_RECINCPAGPAR = 16;
  public static int PQSL_PARTE4_RECANNLIQPAR = 17;
  public static int PQSL_PARTE4_RECNUMLIQPAR = 18;
  public static int PQSL_PARTE4_RECOUOGESPAR = 19;
  public static int PQSL_PARTE4_RECOUOUTIPAR = 20;
  public static int PQSL_PARTE4_RECOORDIPART = 21;
  public static int PQSL_PARTE4_ICON = 22;
  public static int PQSL_PARTE4_RECPROVARPAR = 23;
  public static int PQSL_PARTE4_HASH = 24;
  public static int PQSL_PARTE4_TOOLTIP = 25;

  // Table to contain panel selected row: Capitolo
  //
  public static int PQRY_CAPITOLO = 3842;
  public static int PQSL_CAPITOLO_RECODESCCAPI = 0;
  public static int PQSL_CAPITOLO_RECOLIVECAPI = 1;
  public static int PQSL_CAPITOLO_RECTIPRAMCAP = 2;
  public static int PQSL_CAPITOLO_RECORESCAPIT = 3;
  public static int PQSL_CAPITOLO_RECOTITOCAPI = 4;
  public static int PQSL_CAPITOLO_RECCATINTCAP = 5;
  public static int PQSL_CAPITOLO_RECCODTERCAP = 6;
  public static int PQSL_CAPITOLO_RECOCAPICAPI = 7;
  public static int PQSL_CAPITOLO_RECOARTICAPI = 8;
  public static int PQSL_CAPITOLO_RECANNIMACCA = 9;
  public static int PQSL_CAPITOLO_RECNUMIMACCA = 10;
  public static int PQSL_CAPITOLO_RECANNSUIMCA = 11;
  public static int PQSL_CAPITOLO_RECNUMSUIMCA = 12;
  public static int PQSL_CAPITOLO_RECANNMAORCA = 13;
  public static int PQSL_CAPITOLO_RECNUMMAORCA = 14;
  public static int PQSL_CAPITOLO_RECOIMPOCAPI = 15;
  public static int PQSL_CAPITOLO_RECINCPAGCAP = 16;
  public static int PQSL_CAPITOLO_RECANNLIQCAP = 17;
  public static int PQSL_CAPITOLO_RECNUMLIQCAP = 18;
  public static int PQSL_CAPITOLO_RECOUOGESCAP = 19;
  public static int PQSL_CAPITOLO_RECOUOUTICAP = 20;
  public static int PQSL_CAPITOLO_RECOORDILIV1 = 21;
  public static int PQSL_CAPITOLO_RECOICONCAPI = 22;
  public static int PQSL_CAPITOLO_RECPROVARCAP = 23;
  public static int PQSL_CAPITOLO_HASH = 24;
  public static int PQSL_CAPITOLO_TOOLTIP = 25;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO7 = 3843;
  public static int PQSL_LIVELLO7_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO7_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO7_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO7_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO7_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO7_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO7_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO7_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO7_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO7_RECOFINALIV1 = 9;
  public static int PQSL_LIVELLO7_RECOOPERLIV1 = 10;
  public static int PQSL_LIVELLO7_RECANIMACLI1 = 11;
  public static int PQSL_LIVELLO7_RECNUIMACLI1 = 12;
  public static int PQSL_LIVELLO7_RECANSUIMLI1 = 13;
  public static int PQSL_LIVELLO7_RECNUSUIMLI1 = 14;
  public static int PQSL_LIVELLO7_RECANMAORLI1 = 15;
  public static int PQSL_LIVELLO7_RECNUMAORLI1 = 16;
  public static int PQSL_LIVELLO7_RECOIMPOLIV1 = 17;
  public static int PQSL_LIVELLO7_RECINCPAGLI1 = 18;
  public static int PQSL_LIVELLO7_RECANNLIQLI1 = 19;
  public static int PQSL_LIVELLO7_RECNUMLIQLI1 = 20;
  public static int PQSL_LIVELLO7_RECUOGESLIV1 = 21;
  public static int PQSL_LIVELLO7_RECUOUTILIV1 = 22;
  public static int PQSL_LIVELLO7_RECOORDILIV1 = 23;
  public static int PQSL_LIVELLO7_ICON = 24;
  public static int PQSL_LIVELLO7_RECPROVARLI1 = 25;
  public static int PQSL_LIVELLO7_HASH = 26;
  public static int PQSL_LIVELLO7_TOOLTIP = 27;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUCC9 = 3844;
  public static int PQSL_MOVBLIVSUCC9_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUCC9_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUCC9_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUCC9_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUCC9_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUCC9_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUCC9_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUCC9_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUCC9_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUCC9_RECFINLIVSUC = 9;
  public static int PQSL_MOVBLIVSUCC9_RECOPELIVSUC = 10;
  public static int PQSL_MOVBLIVSUCC9_REANIMACLISU = 11;
  public static int PQSL_MOVBLIVSUCC9_RENUIMACLISU = 12;
  public static int PQSL_MOVBLIVSUCC9_REANSUIMLISU = 13;
  public static int PQSL_MOVBLIVSUCC9_RENUSUIMLISU = 14;
  public static int PQSL_MOVBLIVSUCC9_REANMAORLISU = 15;
  public static int PQSL_MOVBLIVSUCC9_RENUMAORLISU = 16;
  public static int PQSL_MOVBLIVSUCC9_RECIMPLIVSUC = 17;
  public static int PQSL_MOVBLIVSUCC9_RECINCPALISU = 18;
  public static int PQSL_MOVBLIVSUCC9_RECANNLILISU = 19;
  public static int PQSL_MOVBLIVSUCC9_RECNUMLILISU = 20;
  public static int PQSL_MOVBLIVSUCC9_RECUOGLIVSUC = 21;
  public static int PQSL_MOVBLIVSUCC9_RECUOUTILISU = 22;
  public static int PQSL_MOVBLIVSUCC9_RECORDLIVSUC = 23;
  public static int PQSL_MOVBLIVSUCC9_ICON = 24;
  public static int PQSL_MOVBLIVSUCC9_RECPROVALISU = 25;
  public static int PQSL_MOVBLIVSUCC9_HASH = 26;
  public static int PQSL_MOVBLIVSUCC9_TOOLTIP = 27;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI23 = 3845;
  public static int PQRY_PARAESPLVI23_RS = 3846;
  public static int PQSL_PARAESPLVI23_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI23_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI23_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI23_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI23_PARAANNOIMPA = 4;

  // Table to contain panel selected row: Finanziamento Opera
  //
  public static int PQRY_FINANZIOPERA = 3847;
  public static int PQSL_FINANZIOPERA_RECODESCFINA = 0;
  public static int PQSL_FINANZIOPERA_RECOLIVEFINA = 1;
  public static int PQSL_FINANZIOPERA_RECTIPRAMFIN = 2;
  public static int PQSL_FINANZIOPERA_RECORESFINAN = 3;
  public static int PQSL_FINANZIOPERA_RECOTITOFINA = 4;
  public static int PQSL_FINANZIOPERA_RECCATINTFIN = 5;
  public static int PQSL_FINANZIOPERA_RECCODTERFIN = 6;
  public static int PQSL_FINANZIOPERA_RECOCAPIFINA = 7;
  public static int PQSL_FINANZIOPERA_RECOARTIFINA = 8;
  public static int PQSL_FINANZIOPERA_RECOFINAFINA = 9;
  public static int PQSL_FINANZIOPERA_RECOOPERFINA = 10;
  public static int PQSL_FINANZIOPERA_RECANNIMACFI = 11;
  public static int PQSL_FINANZIOPERA_RECNUMIMACFI = 12;
  public static int PQSL_FINANZIOPERA_RECANNSUIMFI = 13;
  public static int PQSL_FINANZIOPERA_RECNUMSUIMFI = 14;
  public static int PQSL_FINANZIOPERA_RECANNMAORFI = 15;
  public static int PQSL_FINANZIOPERA_RECNUMMAORFI = 16;
  public static int PQSL_FINANZIOPERA_RECOIMPOFINA = 17;
  public static int PQSL_FINANZIOPERA_RECINCPAGFIN = 18;
  public static int PQSL_FINANZIOPERA_RECANNLIQFIN = 19;
  public static int PQSL_FINANZIOPERA_RECNUMLIQFIN = 20;
  public static int PQSL_FINANZIOPERA_RECOUOGESFIN = 21;
  public static int PQSL_FINANZIOPERA_RECOUOUTIFIN = 22;
  public static int PQSL_FINANZIOPERA_RECOORDIFINA = 23;
  public static int PQSL_FINANZIOPERA_ICON = 24;
  public static int PQSL_FINANZIOPERA_RECPROVARFIN = 25;
  public static int PQSL_FINANZIOPERA_HASH = 26;
  public static int PQSL_FINANZIOPERA_TOOLTIP = 27;

  // Table to contain panel selected row: Opera Finanziamento
  //
  public static int PQRY_OPERAFINANZI = 3848;
  public static int PQSL_OPERAFINANZI_RECODESCOPER = 0;
  public static int PQSL_OPERAFINANZI_RECOLIVEOPER = 1;
  public static int PQSL_OPERAFINANZI_RECTIPRAMOPE = 2;
  public static int PQSL_OPERAFINANZI_RECORESOPERA = 3;
  public static int PQSL_OPERAFINANZI_RECOTITOOPER = 4;
  public static int PQSL_OPERAFINANZI_RECCATINTOPE = 5;
  public static int PQSL_OPERAFINANZI_RECCODTEROPE = 6;
  public static int PQSL_OPERAFINANZI_RECOCAPIOPER = 7;
  public static int PQSL_OPERAFINANZI_RECOARTIOPER = 8;
  public static int PQSL_OPERAFINANZI_RECOFINAOPER = 9;
  public static int PQSL_OPERAFINANZI_RECOOPEROPER = 10;
  public static int PQSL_OPERAFINANZI_RECANNIMACOP = 11;
  public static int PQSL_OPERAFINANZI_RECNUMIMACOP = 12;
  public static int PQSL_OPERAFINANZI_RECANNSUIMOP = 13;
  public static int PQSL_OPERAFINANZI_RECNUMSUIMOP = 14;
  public static int PQSL_OPERAFINANZI_RECANNMAOROP = 15;
  public static int PQSL_OPERAFINANZI_RECNUMMAOROP = 16;
  public static int PQSL_OPERAFINANZI_RECOIMPOOPER = 17;
  public static int PQSL_OPERAFINANZI_RECINCPAGOPE = 18;
  public static int PQSL_OPERAFINANZI_RECANNLIQOPE = 19;
  public static int PQSL_OPERAFINANZI_RECNUMLIQOPE = 20;
  public static int PQSL_OPERAFINANZI_RECOUOGESOPE = 21;
  public static int PQSL_OPERAFINANZI_RECOUOUTIOPE = 22;
  public static int PQSL_OPERAFINANZI_RECOORDIOPER = 23;
  public static int PQSL_OPERAFINANZI_ICON = 24;
  public static int PQSL_OPERAFINANZI_RECPROVAROPE = 25;
  public static int PQSL_OPERAFINANZI_HASH = 26;
  public static int PQSL_OPERAFINANZI_TOOLTIP = 27;

  // Table to contain panel selected row: Parte
  //
  public static int PQRY_PARTE5 = 3849;
  public static int PQSL_PARTE5_RECODESCLIV1 = 0;
  public static int PQSL_PARTE5_E_S = 1;
  public static int PQSL_PARTE5_RECTIPRAMPAR = 2;
  public static int PQSL_PARTE5_RECORESPARTE = 3;
  public static int PQSL_PARTE5_RECOTITOPART = 4;
  public static int PQSL_PARTE5_RECCATINTPAR = 5;
  public static int PQSL_PARTE5_RECCODTERPAR = 6;
  public static int PQSL_PARTE5_RECOCAPIPART = 7;
  public static int PQSL_PARTE5_RECOARTIPART = 8;
  public static int PQSL_PARTE5_RECOFINAPART = 9;
  public static int PQSL_PARTE5_RECOOPERPART = 10;
  public static int PQSL_PARTE5_RECANNIMACPA = 11;
  public static int PQSL_PARTE5_RECNUMIMACPA = 12;
  public static int PQSL_PARTE5_RECANNSUIMPA = 13;
  public static int PQSL_PARTE5_RECNUMSUIMPA = 14;
  public static int PQSL_PARTE5_RECANNMAORPA = 15;
  public static int PQSL_PARTE5_RECNUMMAORPA = 16;
  public static int PQSL_PARTE5_RECOIMPOPART = 17;
  public static int PQSL_PARTE5_RECINCPAGPAR = 18;
  public static int PQSL_PARTE5_RECANNLIQPAR = 19;
  public static int PQSL_PARTE5_RECNUMLIQPAR = 20;
  public static int PQSL_PARTE5_RECOUOGESPAR = 21;
  public static int PQSL_PARTE5_RECOUOUTIPAR = 22;
  public static int PQSL_PARTE5_RECOORDIPART = 23;
  public static int PQSL_PARTE5_ICON = 24;
  public static int PQSL_PARTE5_RECPROVARPAR = 25;
  public static int PQSL_PARTE5_HASH = 26;
  public static int PQSL_PARTE5_TOOLTIP = 27;

  // Table to contain panel selected row: Livello 1
  //
  public static int PQRY_LIVELLO8 = 3850;
  public static int PQSL_LIVELLO8_RECODESCLIV1 = 0;
  public static int PQSL_LIVELLO8_RECOLIVELIV1 = 1;
  public static int PQSL_LIVELLO8_RECTIPRAMLI1 = 2;
  public static int PQSL_LIVELLO8_RECORESLIVE1 = 3;
  public static int PQSL_LIVELLO8_RECOTITOLIV1 = 4;
  public static int PQSL_LIVELLO8_RECCATINTLI1 = 5;
  public static int PQSL_LIVELLO8_RECCODTERLI1 = 6;
  public static int PQSL_LIVELLO8_RECOCAPILIV1 = 7;
  public static int PQSL_LIVELLO8_RECOARTILIV1 = 8;
  public static int PQSL_LIVELLO8_RECOFINALIV1 = 9;
  public static int PQSL_LIVELLO8_RECOOPERLIV1 = 10;
  public static int PQSL_LIVELLO8_RECANIMACLI1 = 11;
  public static int PQSL_LIVELLO8_RECNUIMACLI1 = 12;
  public static int PQSL_LIVELLO8_RECANSUIMLI1 = 13;
  public static int PQSL_LIVELLO8_RECNUSUIMLI1 = 14;
  public static int PQSL_LIVELLO8_RECANMAORLI1 = 15;
  public static int PQSL_LIVELLO8_RECNUMAORLI1 = 16;
  public static int PQSL_LIVELLO8_RECOIMPOLIV1 = 17;
  public static int PQSL_LIVELLO8_RECINCPAGLI1 = 18;
  public static int PQSL_LIVELLO8_RECANNLIQLI1 = 19;
  public static int PQSL_LIVELLO8_RECNUMLIQLI1 = 20;
  public static int PQSL_LIVELLO8_RECUOGESLIV1 = 21;
  public static int PQSL_LIVELLO8_RECUOUTILIV1 = 22;
  public static int PQSL_LIVELLO8_RECOORDILIV1 = 23;
  public static int PQSL_LIVELLO8_ICON = 24;
  public static int PQSL_LIVELLO8_RECPROVARLI1 = 25;
  public static int PQSL_LIVELLO8_HASH = 26;
  public static int PQSL_LIVELLO8_TOOLTIP = 27;

  // Table to contain panel selected row: MOV B Liv Succ
  //
  public static int PQRY_MOVBLIVSUC10 = 3851;
  public static int PQSL_MOVBLIVSUC10_RECDESLIVSUC = 0;
  public static int PQSL_MOVBLIVSUC10_RECLIVLIVSUC = 1;
  public static int PQSL_MOVBLIVSUC10_RECTIPRALISU = 2;
  public static int PQSL_MOVBLIVSUC10_RECOESLIVSUC = 3;
  public static int PQSL_MOVBLIVSUC10_RECTITLIVSUC = 4;
  public static int PQSL_MOVBLIVSUC10_RECCATINLISU = 5;
  public static int PQSL_MOVBLIVSUC10_RECCODTELISU = 6;
  public static int PQSL_MOVBLIVSUC10_RECCAPLIVSUC = 7;
  public static int PQSL_MOVBLIVSUC10_RECARTLIVSUC = 8;
  public static int PQSL_MOVBLIVSUC10_RECFINLIVSUC = 9;
  public static int PQSL_MOVBLIVSUC10_RECOPELIVSUC = 10;
  public static int PQSL_MOVBLIVSUC10_REANIMACLISU = 11;
  public static int PQSL_MOVBLIVSUC10_RENUIMACLISU = 12;
  public static int PQSL_MOVBLIVSUC10_REANSUIMLISU = 13;
  public static int PQSL_MOVBLIVSUC10_RENUSUIMLISU = 14;
  public static int PQSL_MOVBLIVSUC10_REANMAORLISU = 15;
  public static int PQSL_MOVBLIVSUC10_RENUMAORLISU = 16;
  public static int PQSL_MOVBLIVSUC10_RECIMPLIVSUC = 17;
  public static int PQSL_MOVBLIVSUC10_RECINCPALISU = 18;
  public static int PQSL_MOVBLIVSUC10_RECANNLILISU = 19;
  public static int PQSL_MOVBLIVSUC10_RECNUMLILISU = 20;
  public static int PQSL_MOVBLIVSUC10_RECUOGLIVSUC = 21;
  public static int PQSL_MOVBLIVSUC10_RECUOUTILISU = 22;
  public static int PQSL_MOVBLIVSUC10_RECORDLIVSUC = 23;
  public static int PQSL_MOVBLIVSUC10_ICON = 24;
  public static int PQSL_MOVBLIVSUC10_RECPROVALISU = 25;
  public static int PQSL_MOVBLIVSUC10_HASH = 26;
  public static int PQSL_MOVBLIVSUC10_TOOLTIP = 27;

  // Table to contain panel selected row: Parametri Esploratore VIWEB
  //
  public static int PQRY_PARAESPLVI24 = 3852;
  public static int PQRY_PARAESPLVI24_RS = 3853;
  public static int PQSL_PARAESPLVI24_PARASCHEINFO = 0;
  public static int PQSL_PARAESPLVI24_PARAESERSCHE = 1;
  public static int PQSL_PARAESPLVI24_PARAMPARTE = 2;
  public static int PQSL_PARAESPLVI24_PARANUMEIMPA = 3;
  public static int PQSL_PARAESPLVI24_PARAANNOIMPA = 4;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL4 = 3854;
  public static int PQSL_BIL4_ESERCIZIO = 0;
  public static int PQSL_BIL4_E_S = 1;
  public static int PQSL_BIL4_CAPITOLO = 2;
  public static int PQSL_BIL4_ARTICOLO = 3;
  public static int PQSL_BIL4_IMP_ACC_ULT_CHIUSO = 4;
  public static int PQSL_BIL4_IMP_ACC_ULT_CONS = 5;
  public static int PQSL_BIL4_IMP_ACC_ULT_SVIL = 6;
  public static int PQSL_BIL4_PREVISIONE = 7;
  public static int PQSL_BIL4_PREVISIONE_CONS = 8;
  public static int PQSL_BIL4_PREVISIONE_SVIL = 9;
  public static int PQSL_BIL4_STN_INI_CO = 10;
  public static int PQSL_BIL4_STN_INI_CO_CONS = 11;
  public static int PQSL_BIL4_STN_INI_CO_SVIL = 12;
  public static int PQSL_BIL4_IMPEGNABILE = 13;
  public static int PQSL_BIL4_UTENTE_INSERIMENTO = 14;
  public static int PQSL_BIL4_DATA_INSERIMENTO = 15;
  public static int PQSL_BIL4_UTENTE_ULTIMO_AGG = 16;
  public static int PQSL_BIL4_DATA_ULTIMO_AGG = 17;
  public static int PQSL_BIL4_VARIAZIONI_CO = 18;
  public static int PQSL_BIL4_VARIAZIONI_CO_CONS = 19;
  public static int PQSL_BIL4_VARIAZIONI_CO_SVIL = 20;
  public static int PQSL_BIL4_DISPONIBILITA = 21;
  public static int PQSL_BIL4_DISPONIBILITA_CONS = 22;
  public static int PQSL_BIL4_DISPONIBILITA_SVIL = 23;
  public static int PQSL_BIL4_DISPONIBILITA_BDG = 24;
  public static int PQSL_BIL4_VAR_IMPEGNABILE = 25;
  public static int PQSL_BIL4_REISCRIZIONI_DA_IMP = 26;
  public static int PQSL_BIL4_REISCRIZIONI_DA_STN = 27;
  public static int PQSL_BIL4_STN_INI_CA = 28;
  public static int PQSL_BIL4_RESIDUI_PRESUNTI = 29;
  public static int PQSL_BIL4_GIA_IMPEGNATO = 30;
  public static int PQSL_BIL4_BILPURA = 31;
  public static int PQSL_BIL4_BILTOTALE = 32;
  public static int PQSL_BIL4_VARIAZIONI_CA = 33;
  public static int PQSL_BIL4_PREVISIONE_CASSA = 34;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL = 3855;
  public static int PQSL_BIL_ESERCIZIO = 0;
  public static int PQSL_BIL_E_S = 1;
  public static int PQSL_BIL_CAPITOLO = 2;
  public static int PQSL_BIL_ARTICOLO = 3;
  public static int PQSL_BIL_IMP_ACC_ULT_CHIUSO = 4;
  public static int PQSL_BIL_IMP_ACC_ULT_CONS = 5;
  public static int PQSL_BIL_IMP_ACC_ULT_SVIL = 6;
  public static int PQSL_BIL_PREVISIONE = 7;
  public static int PQSL_BIL_PREVISIONE_CONS = 8;
  public static int PQSL_BIL_PREVISIONE_SVIL = 9;
  public static int PQSL_BIL_STN_INI_CO = 10;
  public static int PQSL_BIL_STN_INI_CO_CONS = 11;
  public static int PQSL_BIL_STN_INI_CO_SVIL = 12;
  public static int PQSL_BIL_IMPEGNABILE = 13;
  public static int PQSL_BIL_UTENTE_INSERIMENTO = 14;
  public static int PQSL_BIL_DATA_INSERIMENTO = 15;
  public static int PQSL_BIL_UTENTE_ULTIMO_AGG = 16;
  public static int PQSL_BIL_DATA_ULTIMO_AGG = 17;
  public static int PQSL_BIL_VARIAZIONI_CO = 18;
  public static int PQSL_BIL_VARIAZIONI_CO_CONS = 19;
  public static int PQSL_BIL_VARIAZIONI_CO_SVIL = 20;
  public static int PQSL_BIL_REISCRIZIONI_DA_IMP = 21;
  public static int PQSL_BIL_REISCRIZIONI_DA_STN = 22;
  public static int PQSL_BIL_STN_INI_CA = 23;
  public static int PQSL_BIL_RESIDUI_PRESUNTI = 24;
  public static int PQSL_BIL_GIA_IMPEGNATO = 25;
  public static int PQSL_BIL_BILPURA = 26;
  public static int PQSL_BIL_BILTOTALE = 27;
  public static int PQSL_BIL_STN_PURO_DA_CRONO = 28;
  public static int PQSL_BIL_PREVISIONE_CASSA = 29;

  // Table to contain panel selected row: FINAVA
  //
  public static int PQRY_FINAVA1 = 3856;
  public static int PQSL_FINAVA1_ESERCIZIO = 0;
  public static int PQSL_FINAVA1_ARTICOLO_AVANZO = 1;
  public static int PQSL_FINAVA1_CAPITOLO = 2;
  public static int PQSL_FINAVA1_ARTICOLO = 3;
  public static int PQSL_FINAVA1_IMPORTO = 4;
  public static int PQSL_FINAVA1_FIN_DISAVA = 5;
  public static int PQSL_FINAVA1_E = 6;
  public static int PQSL_FINAVA1_S = 7;
  public static int PQSL_FINAVA1_CAPITOLO_AVANZO = 8;
  public static int PQSL_FINAVA1_PROGRESSIVO = 9;
  public static int PQSL_FINAVA1_UTENTE_INSERIMENTO = 10;
  public static int PQSL_FINAVA1_DATA_INSERIMENTO = 11;
  public static int PQSL_FINAVA1_UTENTE_ULTIMO_AGG = 12;
  public static int PQSL_FINAVA1_DATA_ULTIMO_AGG = 13;

  // Table to contain panel selected row: FINALT
  //
  public static int PQRY_FINALT1 = 3857;
  public static int PQSL_FINALT1_ESERCIZIO = 0;
  public static int PQSL_FINALT1_CAPITOLO_S = 1;
  public static int PQSL_FINALT1_ARTICOLO_S = 2;
  public static int PQSL_FINALT1_CAPITOLO_E = 3;
  public static int PQSL_FINALT1_ARTICOLO_E = 4;
  public static int PQSL_FINALT1_IMPORTO = 5;
  public static int PQSL_FINALT1_FIN_DISAVA = 6;
  public static int PQSL_FINALT1_E = 7;
  public static int PQSL_FINALT1_S = 8;
  public static int PQSL_FINALT1_UTENTE_INSERIMENTO = 9;
  public static int PQSL_FINALT1_DATA_INSERIMENTO = 10;
  public static int PQSL_FINALT1_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_FINALT1_DATA_ULTIMO_AGG = 12;
  public static int PQSL_FINALT1_TIPO_STAMPA = 13;

  // Table to contain panel selected row: FINAVA
  //
  public static int PQRY_FINAVA = 3858;
  public static int PQSL_FINAVA_ESERCIZIO = 0;
  public static int PQSL_FINAVA_ARTICOLO_AVANZO = 1;
  public static int PQSL_FINAVA_CAPITOLO = 2;
  public static int PQSL_FINAVA_ARTICOLO = 3;
  public static int PQSL_FINAVA_IMPORTO = 4;
  public static int PQSL_FINAVA_FIN_DISAVA = 5;
  public static int PQSL_FINAVA_E = 6;
  public static int PQSL_FINAVA_S = 7;
  public static int PQSL_FINAVA_CAPITOLO_AVANZO = 8;
  public static int PQSL_FINAVA_PROGRESSIVO = 9;
  public static int PQSL_FINAVA_UTENTE_INSERIMENTO = 10;
  public static int PQSL_FINAVA_DATA_INSERIMENTO = 11;
  public static int PQSL_FINAVA_UTENTE_ULTIMO_AGG = 12;
  public static int PQSL_FINAVA_DATA_ULTIMO_AGG = 13;

  // Table to contain panel selected row: FINALT
  //
  public static int PQRY_FINALT = 3859;
  public static int PQSL_FINALT_ESERCIZIO = 0;
  public static int PQSL_FINALT_CAPITOLO_S = 1;
  public static int PQSL_FINALT_ARTICOLO_S = 2;
  public static int PQSL_FINALT_CAPITOLO_E = 3;
  public static int PQSL_FINALT_ARTICOLO_E = 4;
  public static int PQSL_FINALT_IMPORTO = 5;
  public static int PQSL_FINALT_FIN_DISAVA = 6;
  public static int PQSL_FINALT_E = 7;
  public static int PQSL_FINALT_S = 8;
  public static int PQSL_FINALT_UTENTE_INSERIMENTO = 9;
  public static int PQSL_FINALT_DATA_INSERIMENTO = 10;
  public static int PQSL_FINALT_UTENTE_ULTIMO_AGG = 11;
  public static int PQSL_FINALT_DATA_ULTIMO_AGG = 12;
  public static int PQSL_FINALT_TIPO_STAMPA = 13;

  // Table to contain panel selected row: VARCOMPRO
  //
  public static int PQRY_VARCOMPRO3 = 3860;
  public static int PQSL_VARCOMPRO3_PROGRESSIVO = 0;
  public static int PQSL_VARCOMPRO3_ESERCIZIO = 1;
  public static int PQSL_VARCOMPRO3_E_S = 2;
  public static int PQSL_VARCOMPRO3_CAPITOLO = 3;
  public static int PQSL_VARCOMPRO3_ARTICOLO = 4;
  public static int PQSL_VARCOMPRO3_ANNO_DEL = 5;
  public static int PQSL_VARCOMPRO3_NUMERO_DEL = 6;
  public static int PQSL_VARCOMPRO3_SEDE_DEL = 7;
  public static int PQSL_VARCOMPRO3_IMPORTO = 8;
  public static int PQSL_VARCOMPRO3_DESCRIZIONE = 9;
  public static int PQSL_VARCOMPRO3_TIPO_VAR = 10;
  public static int PQSL_VARCOMPRO3_ANNO_PROPOSTA = 11;
  public static int PQSL_VARCOMPRO3_UNITA_PROPONENTE = 12;
  public static int PQSL_VARCOMPRO3_NUMERO_PROPOSTA = 13;
  public static int PQSL_VARCOMPRO3_VAR_BIL = 14;
  public static int PQSL_VARCOMPRO3_CONS_SVILUPPO = 15;
  public static int PQSL_VARCOMPRO3_D_DATA_REG = 16;
  public static int PQSL_VARCOMPRO3_PROGETTO_ID = 17;
  public static int PQSL_VARCOMPRO3_FINANZIAMENTO = 18;
  public static int PQSL_VARCOMPRO3_OPERA = 19;
  public static int PQSL_VARCOMPRO3_PROGR_UNITA_ORGANIZZATIVA = 20;
  public static int PQSL_VARCOMPRO3_UTENTE_INSERIMENTO = 21;
  public static int PQSL_VARCOMPRO3_DATA_INSERIMENTO = 22;
  public static int PQSL_VARCOMPRO3_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_VARCOMPRO3_DATA_ULTIMO_AGG = 24;
  public static int PQSL_VARCOMPRO3_SCHEDA_OBIETTIVO_ID = 25;
  public static int PQSL_VARCOMPRO3_FATTORE = 26;
  public static int PQSL_VARCOMPRO3_CENTRO = 27;
  public static int PQSL_VARCOMPRO3_OBIETTOPERAT = 28;
  public static int PQSL_VARCOMPRO3_OBIETTGESTIO = 29;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM12 = 3861;
  public static int PQSL_VARCOM12_PROGRESSIVO = 0;
  public static int PQSL_VARCOM12_ESERCIZIO = 1;
  public static int PQSL_VARCOM12_E_S = 2;
  public static int PQSL_VARCOM12_CAPITOLO = 3;
  public static int PQSL_VARCOM12_ARTICOLO = 4;
  public static int PQSL_VARCOM12_ANNO_DEL = 5;
  public static int PQSL_VARCOM12_NUMERO_DEL = 6;
  public static int PQSL_VARCOM12_SEDE_DEL = 7;
  public static int PQSL_VARCOM12_IMPORTO = 8;
  public static int PQSL_VARCOM12_DESCRIZIONE = 9;
  public static int PQSL_VARCOM12_TIPO_VAR = 10;
  public static int PQSL_VARCOM12_ANNO_PROPOSTA = 11;
  public static int PQSL_VARCOM12_UNITA_PROPONENTE = 12;
  public static int PQSL_VARCOM12_NUMERO_PROPOSTA = 13;
  public static int PQSL_VARCOM12_VAR_BIL = 14;
  public static int PQSL_VARCOM12_CONS_SVILUPPO = 15;
  public static int PQSL_VARCOM12_D_DATA_REG = 16;
  public static int PQSL_VARCOM12_PROGETTO_ID = 17;
  public static int PQSL_VARCOM12_FINANZIAMENTO = 18;
  public static int PQSL_VARCOM12_OPERA = 19;
  public static int PQSL_VARCOM12_PROGR_UNITA_ORGANIZZATIVA = 20;
  public static int PQSL_VARCOM12_UTENTE_INSERIMENTO = 21;
  public static int PQSL_VARCOM12_DATA_INSERIMENTO = 22;
  public static int PQSL_VARCOM12_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_VARCOM12_DATA_ULTIMO_AGG = 24;
  public static int PQSL_VARCOM12_SCHEDA_OBIETTIVO_ID = 25;
  public static int PQSL_VARCOM12_FATTORE = 26;
  public static int PQSL_VARCOM12_CENTRO = 27;
  public static int PQSL_VARCOM12_OBIETTOPERAT = 28;
  public static int PQSL_VARCOM12_OBIETTGESTIO = 29;

  // Table to contain panel selected row: VAR IMPEGNABILE
  //
  public static int PQRY_VARIMPEGNABI = 3862;
  public static int PQSL_VARIMPEGNABI_PROGRESSIVO = 0;
  public static int PQSL_VARIMPEGNABI_ESERCIZIO = 1;
  public static int PQSL_VARIMPEGNABI_S = 2;
  public static int PQSL_VARIMPEGNABI_CAPITOLO = 3;
  public static int PQSL_VARIMPEGNABI_ARTICOLO = 4;
  public static int PQSL_VARIMPEGNABI_ANNO_DEL = 5;
  public static int PQSL_VARIMPEGNABI_NUMERO_DEL = 6;
  public static int PQSL_VARIMPEGNABI_SEDE_DEL = 7;
  public static int PQSL_VARIMPEGNABI_IMPORTO = 8;
  public static int PQSL_VARIMPEGNABI_DESCRIZIONE = 9;
  public static int PQSL_VARIMPEGNABI_ANNO_PROPOSTA = 10;
  public static int PQSL_VARIMPEGNABI_UNITA_PROPONENTE = 11;
  public static int PQSL_VARIMPEGNABI_NUMERO_PROPOSTA = 12;
  public static int PQSL_VARIMPEGNABI_D_DATA_REG = 13;
  public static int PQSL_VARIMPEGNABI_PROGETTO_ID = 14;
  public static int PQSL_VARIMPEGNABI_PROGR_UNITA_ORGANIZZATIVA = 15;
  public static int PQSL_VARIMPEGNABI_UTENTE_INSERIMENTO = 16;
  public static int PQSL_VARIMPEGNABI_DATA_INSERIMENTO = 17;
  public static int PQSL_VARIMPEGNABI_UTENTE_ULTIMO_AGG = 18;
  public static int PQSL_VARIMPEGNABI_DATA_ULTIMO_AGG = 19;
  public static int PQSL_VARIMPEGNABI_SCHEDA_OBIETTIVO_ID = 20;
  public static int PQSL_VARIMPEGNABI_FATTORE = 21;
  public static int PQSL_VARIMPEGNABI_CENTRO = 22;
  public static int PQSL_VARIMPEGNABI_OBIETTOPERAT = 23;
  public static int PQSL_VARIMPEGNABI_OBIETTGESTIO = 24;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI102 = 3863;
  public static int PQRY_PARAMETRI102_RS = 3864;
  public static int PQSL_PARAMETRI102_PARASTANATTU = 0;

  // Table to contain panel selected row: VISTA ACC ELENCO
  //
  public static int PQRY_VISTAACCELE1 = 3865;
  public static int PQSL_VISTAACCELE1_CAPITOLO = 0;
  public static int PQSL_VISTAACCELE1_ARTICOLO = 1;
  public static int PQSL_VISTAACCELE1_ANNO_ACC = 2;
  public static int PQSL_VISTAACCELE1_NUMERO_ACC = 3;
  public static int PQSL_VISTAACCELE1_VISACCELINAC = 4;
  public static int PQSL_VISTAACCELE1_ANNO_DEL = 5;
  public static int PQSL_VISTAACCELE1_NUMERO_DEL = 6;
  public static int PQSL_VISTAACCELE1_SEDE_DEL = 7;
  public static int PQSL_VISTAACCELE1_DATA_REG = 8;
  public static int PQSL_VISTAACCELE1_DESCRIZIONE = 9;
  public static int PQSL_VISTAACCELE1_DEBITORE = 10;
  public static int PQSL_VISTAACCELE1_VIACELBERSEE = 11;
  public static int PQSL_VISTAACCELE1_VISACCELEIMP = 12;
  public static int PQSL_VISTAACCELE1_ANNO_PROPOSTA = 13;
  public static int PQSL_VISTAACCELE1_UNITA_PROPONENTE = 14;
  public static int PQSL_VISTAACCELE1_NUMERO_PROPOSTA = 15;
  public static int PQSL_VISTAACCELE1_ORDINATIVI = 16;
  public static int PQSL_VISTAACCELE1_DISPONIBILITA = 17;
  public static int PQSL_VISTAACCELE1_VISACCELEFIN = 18;
  public static int PQSL_VISTAACCELE1_ESERCIZIO = 19;
  public static int PQSL_VISTAACCELE1_VISACELCOLI5 = 20;
  public static int PQSL_VISTAACCELE1_VISACCELCOEU = 21;
  public static int PQSL_VISTAACCELE1_VISACCELDASC = 22;
  public static int PQSL_VISTAACCELE1__ANNO_ACC_PROVENIENZA = 23;
  public static int PQSL_VISTAACCELE1_NUMERO_ACC_PROVENIENZA = 24;
  public static int PQSL_VISTAACCELE1_CODICEUO = 25;
  public static int PQSL_VISTAACCELE1_DESCRUO = 26;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI462 = 3866;
  public static int PQRY_PARAMETRI462_RS = 3867;
  public static int PQSL_PARAMETRI462_PARASOLOCOMP = 0;
  public static int PQSL_PARAMETRI462_PARAMDAL = 1;

}
