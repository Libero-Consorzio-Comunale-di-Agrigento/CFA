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
public class IMDBDef11 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: Pannello Opzioni
  //
  public static int PQRY_PANNELOPZIO2 = 2163;
  public static int PQRY_PANNELOPZIO2_RS = 2164;
  public static int PQSL_PANNELOPZIO2_NOMOGGATDAMO = 0;
  public static int PQSL_PANNELOPZIO2_NOOGAGATSUMO = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI481 = 2165;
  public static int PQRY_PARAMETRI481_RS = 2166;
  public static int PQSL_PARAMETRI481_PARAMCAPITOL = 0;
  public static int PQSL_PARAMETRI481_PARAMARTICOL = 1;
  public static int PQSL_PARAMETRI481_PARAMPROGUOG = 2;
  public static int PQSL_PARAMETRI481_PARNUOPROUOG = 3;
  public static int PQSL_PARAMETRI481_PARAMES = 4;
  public static int PQSL_PARAMETRI481_PARAMPROGUOU = 5;
  public static int PQSL_PARAMETRI481_PARNUOPROUOU = 6;
  public static int PQSL_PARAMETRI481_PARAANCUOUTI = 7;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI4 = 2167;
  public static int PQSL_WRKERRORI4_PROGRESSIVO = 0;
  public static int PQSL_WRKERRORI4_ERRORE = 1;

  // Table to contain panel selected row: Filtro
  //
  public static int PQRY_FILTRO14 = 2168;
  public static int PQRY_FILTRO14_RS = 2169;
  public static int PQSL_FILTRO14_NOMOGGENTESP = 0;
  public static int PQSL_FILTRO14_NOOGTICOPICO = 1;
  public static int PQSL_FILTRO14_NOMOGGGESUTI = 2;
  public static int PQSL_FILTRO14_NOMEOGGUOSCA = 3;
  public static int PQSL_FILTRO14_NOMOGGCAPSOT = 4;

  // Table to contain panel selected row: CONTROLLI CAP
  //
  public static int PQRY_CONTROLLICAP = 2170;
  public static int PQSL_CONTROLLICAP_RECCONCACOCA = 0;
  public static int PQSL_CONTROLLICAP_RECCONCAPART = 1;
  public static int PQSL_CONTROLLICAP_RECCONCAPDES = 2;
  public static int PQSL_CONTROLLICAP_RECCONCACOST = 3;
  public static int PQSL_CONTROLLICAP_RECOCAPRUOCC = 4;
  public static int PQSL_CONTROLLICAP_RECCONCADEUO = 5;
  public static int PQSL_CONTROLLICAP_RECORDTIPOUN = 6;
  public static int PQSL_CONTROLLICAP_RECCONCAPSCA = 7;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV83 = 2171;
  public static int QSL_CFASELINTV83_COUNT = 0;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM165 = 2172;
  public static int PQRY_PARAM165_RS = 2173;
  public static int PQSL_PARAM165_NOMEOGGETTES = 0;
  public static int PQSL_PARAM165_NOMOGGCASEFA = 1;
  public static int PQSL_PARAM165_NOMOGGCASECE = 2;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP27 = 2174;
  public static int PQSL_CAP27_RECORDCAPITO = 0;
  public static int PQSL_CAP27_RECORDARTICO = 1;
  public static int PQSL_CAP27_RECODESCCAPI = 2;
  public static int PQSL_CAP27_RECORDCODICE = 3;
  public static int PQSL_CAP27_CODIVLIVELLO = 4;
  public static int PQSL_CAP27_CODVLIVELLO = 5;
  public static int PQSL_CAP27_RECOCODIGEST = 6;
  public static int PQSL_CAP27_RECDESCODGES = 7;
  public static int PQSL_CAP27_RECORDFATTOR = 8;
  public static int PQSL_CAP27_RECODESCFATT = 9;
  public static int PQSL_CAP27_RECORDCENTRO = 10;
  public static int PQSL_CAP27_RECODESCCENT = 11;
  public static int PQSL_CAP27_TIPOPDC = 12;
  public static int PQSL_CAP27_CODICEPDC = 13;
  public static int PQSL_CAP27_DESCRIZIOPDC = 14;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS62 = 2175;
  public static int PQRY_PARS62_RS = 2176;
  public static int PQSL_PARS62_NOMEOGGECENT = 0;
  public static int PQSL_PARS62_NOMOGGANESSU = 1;

  // Table to contain panel selected row: Anomalie Assoc
  //
  public static int PQRY_ANOMALIASSO1 = 2177;
  public static int PQRY_ANOMALIASSO1_RS = 2178;
  public static int PQSL_ANOMALIASSO1_NOMEOGGEESER = 0;
  public static int PQSL_ANOMALIASSO1_NOMEOGGECAPI = 1;
  public static int PQSL_ANOMALIASSO1_NOMEOGGEARTI = 2;
  public static int PQSL_ANOMALIASSO1_NOMEOGGEFATT = 3;
  public static int PQSL_ANOMALIASSO1_NOMEOGGEANOM = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI446 = 2179;
  public static int PQRY_PARAMETRI446_RS = 2180;
  public static int PQSL_PARAMETRI446_ROWNAMENTSPE = 0;
  public static int PQSL_PARAMETRI446_ROWNAMEFATTO = 1;
  public static int PQSL_PARAMETRI446_ROWNAMECENTR = 2;
  public static int PQSL_PARAMETRI446_RONASOCOIMEC = 3;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY2 = 2181;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS64 = 2182;
  public static int PQRY_PARS64_RS = 2183;
  public static int PQSL_PARS64_NOMEOGGETTES = 0;

  // Table to contain panel selected row: VISTA MOV SENZA IMPECO
  //
  public static int PQRY_VISMOVSENIMP = 2184;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMTIMO = 0;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMMOIM = 1;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIME1 = 2;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIMES = 3;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIMCO = 4;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMCOL4 = 5;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMCOL5 = 6;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMANIM = 7;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMNUIM = 8;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMANSU = 9;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMNUSU = 10;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMANLI = 11;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMNULI = 12;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMANMA = 13;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMNUMA = 14;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIMDE = 15;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMCOBE = 16;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMRASO = 17;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMCOGE = 18;
  public static int PQSL_VISMOVSENIMP_VIMOSEIMDECG = 19;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIMIM = 20;
  public static int PQSL_VISMOVSENIMP_VISMOVSEIMDI = 21;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS66 = 2185;
  public static int PQRY_PARS66_RS = 2186;
  public static int PQSL_PARS66_NOMEOGGETTES = 0;
  public static int PQSL_PARS66_NOMOGGDATDAL = 1;
  public static int PQSL_PARS66_NOMEOGGDATAL = 2;

  // Table to contain panel selected row: VISTA DOCUMENTI SENZA IMPECO
  //
  public static int PQRY_VISDOCSENIMP = 2187;
  public static int PQSL_VISDOCSENIMP_VISDOCSEIMES = 0;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMNUDO = 1;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMDDAD = 2;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMANDO = 3;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMTIDO = 4;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMNUPR = 5;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMDAPR = 6;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMANPR = 7;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMCOSO = 8;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMRASO = 9;
  public static int PQSL_VISDOCSENIMP_VISDOCSEIMIM = 10;
  public static int PQSL_VISDOCSENIMP_VISDOCSEIMDE = 11;
  public static int PQSL_VISDOCSENIMP_VIDOSEIMCODO = 12;

  // Table to contain panel selected row: IMDB
  //
  public static int PQRY_IMDB5 = 2188;
  public static int PQRY_IMDB5_RS = 2189;
  public static int PQSL_IMDB5_NOOGSOMOSEIM = 0;
  public static int PQSL_IMDB5_NOMOGGTIPMOV = 1;

  // Table to contain panel selected row: VISTA MOV RETT IMPECO
  //
  public static int PQRY_VISMOVRETIMP = 2190;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMTI = 0;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMES = 1;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMCO = 2;
  public static int PQSL_VISMOVRETIMP_VIMOREIMCOL4 = 3;
  public static int PQSL_VISMOVRETIMP_VIMOREIMCOL5 = 4;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMCA = 5;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMAR = 6;
  public static int PQSL_VISMOVRETIMP_VIMOREIMANIM = 7;
  public static int PQSL_VISMOVRETIMP_VIMOREIMNUIM = 8;
  public static int PQSL_VISMOVRETIMP_VIMOREIMDEIM = 9;
  public static int PQSL_VISMOVRETIMP_VIMOREIMANSU = 10;
  public static int PQSL_VISMOVRETIMP_VIMOREIMNUSU = 11;
  public static int PQSL_VISMOVRETIMP_VIMOREIMANLI = 12;
  public static int PQSL_VISMOVRETIMP_VIMOREIMNULI = 13;
  public static int PQSL_VISMOVRETIMP_VIMOREIMDELI = 14;
  public static int PQSL_VISMOVRETIMP_VIMOREIMANMA = 15;
  public static int PQSL_VISMOVRETIMP_VIMOREIMNUMA = 16;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMBE = 17;
  public static int PQSL_VISMOVRETIMP_VIMOREIMRASO = 18;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMFA = 19;
  public static int PQSL_VISMOVRETIMP_VIMOREIMDEFA = 20;
  public static int PQSL_VISMOVRETIMP_VIMOREIMPCEP = 21;
  public static int PQSL_VISMOVRETIMP_VIMOREIMCSEP = 22;
  public static int PQSL_VISMOVRETIMP_VIMOREIMCODA = 23;
  public static int PQSL_VISMOVRETIMP_VIMOREIMCOAL = 24;
  public static int PQSL_VISMOVRETIMP_VISMOVREIMCE = 25;
  public static int PQSL_VISMOVRETIMP_VIMOREIMDECE = 26;
  public static int PQSL_VISMOVRETIMP_VIMOREIMRIEC = 27;

  // Table to contain panel selected row: IMDB Pars
  //
  public static int PQRY_IMDBPARS1 = 2191;
  public static int PQRY_IMDBPARS1_RS = 2192;
  public static int PQSL_IMDBPARS1_NOMEOGGEFATT = 0;
  public static int PQSL_IMDBPARS1_NOMEOGGECENT = 1;
  public static int PQSL_IMDBPARS1_NOMOGGCOMDAL = 2;
  public static int PQSL_IMDBPARS1_NOMEOGGCOMAL = 3;

  // Table to contain panel selected row: LOG CAP UO DEL
  //
  public static int PQRY_LOGCAPUODEL = 2193;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODEP1 = 0;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODEE1 = 1;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODEES = 2;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODECA = 3;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODEAR = 4;
  public static int PQSL_LOGCAPUODEL_LOCAUODEPRUO = 5;
  public static int PQSL_LOGCAPUODEL_LOCAUODETIUO = 6;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODEPR = 7;
  public static int PQSL_LOGCAPUODEL_LOGCAPUODESC = 8;
  public static int PQSL_LOGCAPUODEL_LOCAUODEUTIN = 9;
  public static int PQSL_LOGCAPUODEL_LOCAUODEDAIN = 10;
  public static int PQSL_LOGCAPUODEL_LOCAUODEUTUA = 11;
  public static int PQSL_LOGCAPUODEL_LOCAUODEDAUA = 12;
  public static int PQSL_LOGCAPUODEL_LOCAUODEUTCA = 13;
  public static int PQSL_LOGCAPUODEL_LOCAUODEDACA = 14;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL20 = 2194;
  public static int PQSL_DUAL20_PADRE = 0;
  public static int PQSL_DUAL20_TOOLTIP = 1;

  // Table to contain panel selected row: SO4 ANA UNITA ORGANIZZATIVE
  //
  public static int PQRY_SO4ANAUNIOR5 = 2195;
  public static int PQSL_SO4ANAUNIOR5_RECONOMENODO = 0;
  public static int PQSL_SO4ANAUNIOR5_RESOANUNOPUO = 1;
  public static int PQSL_SO4ANAUNIOR5_TOOLTIP = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL12 = 2196;
  public static int PQSL_DUAL12_ES = 0;
  public static int PQSL_DUAL12_ESLETTERA = 1;
  public static int PQSL_DUAL12_TOOLTIP = 2;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO1 = 2197;
  public static int PQSL_CAPUO1_NUOVAESPRESS = 0;
  public static int PQSL_CAPUO1_HASH = 1;
  public static int PQSL_CAPUO1_RECOCAPUOSCA = 2;
  public static int PQSL_CAPUO1_RECOCAPUOCAP = 3;
  public static int PQSL_CAPUO1_RECOCAPUOART = 4;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL21 = 2198;
  public static int PQSL_DUAL21_ATTIVE = 0;

  // Table to contain panel selected row: SO4 ANA UNITA ORGANIZZATIVE
  //
  public static int PQRY_SO4ANAUNIOR3 = 2199;
  public static int PQSL_SO4ANAUNIOR3_RECONOMENODO = 0;
  public static int PQSL_SO4ANAUNIOR3_RESOANUNOPUO = 1;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL13 = 2200;
  public static int PQSL_DUAL13_ES = 0;
  public static int PQSL_DUAL13_ESLETTERA = 1;

  // Table to contain panel selected row: CAP UO
  //
  public static int PQRY_CAPUO = 2201;
  public static int PQSL_CAPUO_NUOVAESPRESS = 0;
  public static int PQSL_CAPUO_HASH = 1;
  public static int PQSL_CAPUO_RECOCAPUOSCA = 2;
  public static int PQSL_CAPUO_RECOCAPUOCAP = 3;
  public static int PQSL_CAPUO_RECOCAPUOART = 4;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL24 = 2202;
  public static int PQSL_DUAL24_NUOVAESPRESS = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL27 = 2203;
  public static int PQSL_DUAL27_ES = 0;
  public static int PQSL_DUAL27_ESLETTERA = 1;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP28 = 2204;
  public static int PQSL_CAP28_RECORCAPDESC = 0;
  public static int PQSL_CAP28_HASH = 1;
  public static int PQSL_CAP28_RECORCAPCAPI = 2;
  public static int PQSL_CAP28_RECORCAPARTI = 3;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY4 = 2205;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_3 = 2206;

  // Table to contain panel selected row: Appoggiorettifica
  //
  public static int PQRY_APPOGGIORET2 = 2207;
  public static int PQRY_APPOGGIORET2_RS = 2208;
  public static int PQSL_APPOGGIORET2_NOMEOGGECAPI = 0;

  // Table to contain panel selected row: SO4 ANA UNITA ORGANIZZATIVE
  //
  public static int PQRY_SO4ANAUNIOR4 = 2209;
  public static int PQRY_SO4ANAUNIOR4_RS = 2210;
  public static int PQSL_SO4ANAUNIOR4_NOMEOGGPROUO = 0;

  // Table to contain panel selected row: Capitoli Gia Associati
  //
  public static int PQRY_CAPITGIAASS1 = 2211;
  public static int PQSL_CAPITGIAASS1_NUOVAESPRESS = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL15 = 2212;
  public static int PQRY_DUAL15_RS = 2213;
  public static int PQSL_DUAL15_NOMEOGGTIPUO = 0;

  // Recordset for query: Appoggiorettifica
  //
  public static int QRY_APPOGGIORET4 = 2214;
  public static int QSL_APPOGGIORET4_NOMEOGGTIPUO = 0;
  public static int QSL_APPOGGIORET4_NOMEOGGPROUO = 1;
  public static int QSL_APPOGGIORET4_NOMEOGGEARTI = 2;
  public static int QSL_APPOGGIORET4_NOMEOGGECAPI = 3;
  public static int QSL_APPOGGIORET4_NOMEOGGETTES = 4;
  public static int QSL_APPOGGIORET4_NOMEOGGEESER = 5;
  public static int QSL_APPOGGIORET4_NOMEOGGETABE = 6;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG1 = 2215;
  public static int PQSL_WRKLOG1_WRKLOGTESERR = 0;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG3 = 2216;
  public static int PQSL_WRKLOG3_RECOWRKLOGID = 0;
  public static int PQSL_WRKLOG3_RECWRKLOTEER = 1;

  // Table to contain panel selected row: Appoggiorettifica
  //
  public static int PQRY_APPOGGIORET1 = 2217;
  public static int PQRY_APPOGGIORET1_RS = 2218;
  public static int PQSL_APPOGGIORET1_NOMEOGGECAPI = 0;

  // Table to contain panel selected row: SO4 ANA UNITA ORGANIZZATIVE
  //
  public static int PQRY_SO4ANAUNIOR1 = 2219;
  public static int PQRY_SO4ANAUNIOR1_RS = 2220;
  public static int PQSL_SO4ANAUNIOR1_NOMEOGGPROUO = 0;

  // Table to contain panel selected row: Capitoli Gia Associati
  //
  public static int PQRY_CAPITGIAASSO = 2221;
  public static int PQSL_CAPITGIAASSO_NUOVAESPRESS = 0;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL14 = 2222;
  public static int PQRY_DUAL14_RS = 2223;
  public static int PQSL_DUAL14_NOMEOGGTIPUO = 0;

  // Recordset for query: Appoggiorettifica
  //
  public static int QRY_APPOGGIORET3 = 2224;
  public static int QSL_APPOGGIORET3_NOMEOGGTIPUO = 0;
  public static int QSL_APPOGGIORET3_NOMEOGGPROUO = 1;
  public static int QSL_APPOGGIORET3_NOMEOGGEARTI = 2;
  public static int QSL_APPOGGIORET3_NOMEOGGECAPI = 3;
  public static int QSL_APPOGGIORET3_NOMEOGGETTES = 4;
  public static int QSL_APPOGGIORET3_NOMEOGGEESER = 5;
  public static int QSL_APPOGGIORET3_NOMEOGGETABE = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI591 = 2225;
  public static int PQRY_PARAMETRI591_RS = 2226;
  public static int PQSL_PARAMETRI591_PARAENTRSPES = 0;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP30 = 2227;
  public static int PQSL_CAP30_GRUPPOCAPITO = 0;
  public static int PQSL_CAP30_RECOESERCORR = 1;
  public static int PQSL_CAP30_RECOESERSUCC = 2;
  public static int PQSL_CAP30_RECORDESCORR = 3;
  public static int PQSL_CAP30_RECORDESSUCC = 4;
  public static int PQSL_CAP30_RECOCAPICORR = 5;
  public static int PQSL_CAP30_RECOCAPISUCC = 6;
  public static int PQSL_CAP30_RECOARTICORR = 7;
  public static int PQSL_CAP30_RECOARTISUCC = 8;
  public static int PQSL_CAP30_RECODESCCORR = 9;
  public static int PQSL_CAP30_RECODESCSUCC = 10;
  public static int PQSL_CAP30_RECDESABBCOR = 11;
  public static int PQSL_CAP30_RECDESABBSUC = 12;
  public static int PQSL_CAP30_RECOANNOCORR = 13;
  public static int PQSL_CAP30_RECOANNOSUCC = 14;
  public static int PQSL_CAP30_APRINOTE = 15;
  public static int PQSL_CAP30_RECCODSTRCOR = 16;
  public static int PQSL_CAP30_RECCODSTRSUC = 17;
  public static int PQSL_CAP30_RECCODEURCOR = 18;
  public static int PQSL_CAP30_RECCODEURSUC = 19;
  public static int PQSL_CAP30_REENSPNORICO = 20;
  public static int PQSL_CAP30_REENSPNORISU = 21;
  public static int PQSL_CAP30_COFOGCORR = 22;
  public static int PQSL_CAP30_COFOGSUCC = 23;
  public static int PQSL_CAP30_IVLIVELLCORR = 24;
  public static int PQSL_CAP30_IVLIVELLSUCC = 25;
  public static int PQSL_CAP30_VLIVELLOCORR = 26;
  public static int PQSL_CAP30_VLIVELLOSUCC = 27;
  public static int PQSL_CAP30_RECTIPVINCOR = 28;
  public static int PQSL_CAP30_RECTIPVINSUC = 29;
  public static int PQSL_CAP30_RECOFLESCORR = 30;
  public static int PQSL_CAP30_RECOFLESSUCC = 31;
  public static int PQSL_CAP30_RECORIVACORR = 32;
  public static int PQSL_CAP30_RECORIVASUCC = 33;
  public static int PQSL_CAP30_RECCENCOSCOR = 34;
  public static int PQSL_CAP30_RECCENCOSSUC = 35;
  public static int PQSL_CAP30_RECCONCOMCOR = 36;
  public static int PQSL_CAP30_RECCONCOMSUC = 37;
  public static int PQSL_CAP30_RECFUNDELCOR = 38;
  public static int PQSL_CAP30_RECFUNDELSUC = 39;
  public static int PQSL_CAP30_RECSTADEMACO = 40;
  public static int PQSL_CAP30_RECSTADEMASU = 41;
  public static int PQSL_CAP30_RECFONRICACO = 42;
  public static int PQSL_CAP30_RECFONRICASU = 43;
  public static int PQSL_CAP30_RECOFATTCORR = 44;
  public static int PQSL_CAP30_RECOFATTSUCC = 45;
  public static int PQSL_CAP30_RECOCENTCORR = 46;
  public static int PQSL_CAP30_RECOCENTSUCC = 47;
  public static int PQSL_CAP30_RECOTITOCORR = 48;
  public static int PQSL_CAP30_RECOTITOSUCC = 49;
  public static int PQSL_CAP30_RECCODTERCOR = 50;
  public static int PQSL_CAP30_RECCODTERSUC = 51;
  public static int PQSL_CAP30_RECOCATECORR = 52;
  public static int PQSL_CAP30_RECOCATESUCC = 53;
  public static int PQSL_CAP30_RECCODINTCOR = 54;
  public static int PQSL_CAP30_RECCODINTSUC = 55;
  public static int PQSL_CAP30_RECOFUNZCORR = 56;
  public static int PQSL_CAP30_RECOFUNZSUCC = 57;
  public static int PQSL_CAP30_RECOSERVCORR = 58;
  public static int PQSL_CAP30_RECOSERVSUCC = 59;
  public static int PQSL_CAP30_RECOPROGCOR1 = 60;
  public static int PQSL_CAP30_RECOPROGSUC1 = 61;
  public static int PQSL_CAP30_RECOPROGCORR = 62;
  public static int PQSL_CAP30_RECOPROGSUCC = 63;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI633 = 2228;
  public static int PQRY_PARAMETRI633_RS = 2229;
  public static int PQSL_PARAMETRI633_PARAMTIPO = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI634 = 2230;
  public static int PQRY_PARAMETRI634_RS = 2231;
  public static int PQSL_PARAMETRI634_PARAMOTTIOLD = 0;
  public static int PQSL_PARAMETRI634_PARAMOTTINEW = 1;
  public static int PQSL_PARAMETRI634_PARAMSCADEUO = 2;
  public static int PQSL_PARAMETRI634_PARSOLCACOUO = 3;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY8 = 2232;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO19 = 2233;
  public static int PQSL_NOTEFUNZIO19_MODULO = 0;
  public static int PQSL_NOTEFUNZIO19_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO19_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO19_DESCRIZIONE = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI639 = 2234;
  public static int PQRY_PARAMETRI639_RS = 2235;
  public static int PQSL_PARAMETRI639_PARSOLUOGEVU = 0;
  public static int PQSL_PARAMETRI639_PARSOLUOUTVU = 1;

  // Table to contain panel selected row: RETTIFICA UO CAPITOLI
  //
  public static int PQRY_RETTIUOCAPIT = 2236;
  public static int PQSL_RETTIUOCAPIT_PROGRESSIVO = 0;
  public static int PQSL_RETTIUOCAPIT_ESERCIZIO = 1;
  public static int PQSL_RETTIUOCAPIT_E_S = 2;
  public static int PQSL_RETTIUOCAPIT_CAPITOLO = 3;
  public static int PQSL_RETTIUOCAPIT_ARTICOLO = 4;
  public static int PQSL_RETTIUOCAPIT_DESCR_CAPITOLO = 5;
  public static int PQSL_RETTIUOCAPIT_OTTICA_OLD = 6;
  public static int PQSL_RETTIUOCAPIT_OTTICA_NEW = 7;
  public static int PQSL_RETTIUOCAPIT_PROGR_UO_GEST_OLD = 8;
  public static int PQSL_RETTIUOCAPIT_COD_UO_GEST_OLD = 9;
  public static int PQSL_RETTIUOCAPIT_DESCR_UO_GEST_OLD = 10;
  public static int PQSL_RETTIUOCAPIT_UOGESTIATTUA = 11;
  public static int PQSL_RETTIUOCAPIT_PROGR_UO_GEST_NEW = 12;
  public static int PQSL_RETTIUOCAPIT_COD_UO_GEST_NEW = 13;
  public static int PQSL_RETTIUOCAPIT_DESCR_UO_GEST_NEW = 14;
  public static int PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_OLD = 15;
  public static int PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_OLD = 16;
  public static int PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_OLD = 17;
  public static int PQSL_RETTIUOCAPIT_UOUTILIATTUA = 18;
  public static int PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_NEW = 19;
  public static int PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_NEW = 20;
  public static int PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_NEW = 21;
  public static int PQSL_RETTIUOCAPIT_DATA_SCADENZA_UO = 22;
  public static int PQSL_RETTIUOCAPIT_DATA_INSERIMENTO = 23;
  public static int PQSL_RETTIUOCAPIT_UTENTE_INSERIMENTO = 24;
  public static int PQSL_RETTIUOCAPIT_DATA_ULTIMO_AGG = 25;
  public static int PQSL_RETTIUOCAPIT_UTENTE_ULTIMO_AGG = 26;
  public static int PQSL_RETTIUOCAPIT_DATA_ELIMINAZIONE = 27;
  public static int PQSL_RETTIUOCAPIT_UTENTE_ELIMINAZIONE = 28;
  public static int PQSL_RETTIUOCAPIT_DATA_ELAB_RETTIFICA = 29;
  public static int PQSL_RETTIUOCAPIT_UTENTE_ELAB_RETTIFICA = 30;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI636 = 2237;
  public static int PQRY_PARAMETRI636_RS = 2238;
  public static int PQSL_PARAMETRI636_PARACKUOGEST = 0;
  public static int PQSL_PARAMETRI636_PARAMUOGESTI = 1;
  public static int PQSL_PARAMETRI636_PARACKUOUTIL = 2;
  public static int PQSL_PARAMETRI636_PARAMUOUTILI = 3;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG4 = 2239;
  public static int PQSL_WRKLOG4_WRKLOGWRERER = 0;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI7 = 2240;
  public static int PQSL_WRKERRORI7_RECWRKERRERR = 0;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG5 = 2241;
  public static int PQSL_WRKLOG5_WRKLOGID = 0;
  public static int PQSL_WRKLOG5_WRKLOGTESERR = 1;

  // Table to contain panel selected row: WRK LOG
  //
  public static int PQRY_WRKLOG2 = 2242;
  public static int PQSL_WRKLOG2_RECOWRKLOGID = 0;
  public static int PQSL_WRKLOG2_RECWRKLOTEER = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI640 = 2243;
  public static int PQRY_PARAMETRI640_RS = 2244;
  public static int PQSL_PARAMETRI640_PARACOPCOMUO = 0;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO11 = 2245;
  public static int PQSL_NOTEFUNZIO11_MODULO = 0;
  public static int PQSL_NOTEFUNZIO11_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO11_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO11_DESCRIZIONE = 3;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO23 = 2246;
  public static int PQSL_NOTEFUNZIO23_MODULO = 0;
  public static int PQSL_NOTEFUNZIO23_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO23_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO23_DESCRIZIONE = 3;

  // Table to contain panel selected row: Pannello Opzioni
  //
  public static int PQRY_PANNELOPZIO4 = 2247;
  public static int PQRY_PANNELOPZIO4_RS = 2248;
  public static int PQSL_PANNELOPZIO4_NOMOGGESESUC = 0;

  // Table to contain panel selected row: Pannello Opzioni
  //
  public static int PQRY_PANNELOPZIO1 = 2249;
  public static int PQRY_PANNELOPZIO1_RS = 2250;
  public static int PQSL_PANNELOPZIO1_NOMOGGESESUC = 0;
  public static int PQSL_PANNELOPZIO1_NOMOGGTIPAVA = 1;

  // Table to contain panel selected row: ESEFIN
  //
  public static int PQRY_ESEFIN1 = 2251;
  public static int PQSL_ESEFIN1_ESERCIZIO = 0;
  public static int PQSL_ESEFIN1_FASE_BILANCIO = 1;
  public static int PQSL_ESEFIN1_TIPO = 2;
  public static int PQSL_ESEFIN1_ABILITAZIONE_BUONI = 3;
  public static int PQSL_ESEFIN1_BLOCCO_DISTINTE_LIQ = 4;
  public static int PQSL_ESEFIN1_PRIMO_ESERC_PREVENTIVO = 5;
  public static int PQSL_ESEFIN1_UTENTE_INSERIMENTO = 6;
  public static int PQSL_ESEFIN1_DATA_INSERIMENTO = 7;
  public static int PQSL_ESEFIN1_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_ESEFIN1_DATA_ULTIMO_AGG = 9;
  public static int PQSL_ESEFIN1_PUBBLICABILE = 10;
  public static int PQSL_ESEFIN1_ABITANTI = 11;
  public static int PQSL_ESEFIN1_SUPERFICIE_TOT = 12;
  public static int PQSL_ESEFIN1_SUPERFICIE_URB = 13;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI12 = 2252;
  public static int PQRY_FILTRI12_RS = 2253;
  public static int PQSL_FILTRI12_ROWNAMENTSPE = 0;
  public static int PQSL_FILTRI12_ROWNAMEUO = 1;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI14 = 2254;
  public static int PQRY_FILTRI14_RS = 2255;
  public static int PQSL_FILTRI14_ROWNAMTITENT = 0;
  public static int PQSL_FILTRI14_ROWNAMETIPOL = 1;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI15 = 2256;
  public static int PQRY_FILTRI15_RS = 2257;
  public static int PQSL_FILTRI15_ROWNAMEMISSI = 0;
  public static int PQSL_FILTRI15_ROWNAMEPROGR = 1;
  public static int PQSL_FILTRI15_ROWNAMTITSPE = 2;
  public static int PQSL_FILTRI15_ROWNAMEMACRO = 3;

  // Table to contain panel selected row: VISTA CODIFICHE CAP
  //
  public static int PQRY_VISTACODICA1 = 2258;
  public static int PQRY_VISTACODICA1_RS = 2259;
  public static int PQSL_VISTACODICA1_ESERCIZIO = 0;
  public static int PQSL_VISTACODICA1_E_S = 1;
  public static int PQSL_VISTACODICA1_CAPITOLO = 2;
  public static int PQSL_VISTACODICA1_ARTICOLO = 3;
  public static int PQSL_VISTACODICA1_DESCRIZIONE_ABBREVIATA = 4;
  public static int PQSL_VISTACODICA1_RECORINFOCAP = 5;
  public static int PQSL_VISTACODICA1_BILBPRAPSTUO = 6;
  public static int PQSL_VISTACODICA1_RECONUOVEXPR = 7;
  public static int PQSL_VISTACODICA1_COMP_PURA = 8;
  public static int PQSL_VISTACODICA1_BILBPR_ESERCIZIO = 9;
  public static int PQSL_VISTACODICA1_STN_INI_CO = 10;
  public static int PQSL_VISTACODICA1_REISCRIZIONI_IMP = 11;
  public static int PQSL_VISTACODICA1_REISCRIZIONI_STN = 12;
  public static int PQSL_VISTACODICA1_PREVISIONE = 13;
  public static int PQSL_VISTACODICA1_PREVISIONE_CASSA = 14;
  public static int PQSL_VISTACODICA1_GIA_IMPEGNATO = 15;
  public static int PQSL_VISTACODICA1_STN_INI_CA = 16;
  public static int PQSL_VISTACODICA1_RESIDUI_PRESUNTI = 17;
  public static int PQSL_VISTACODICA1_NUMRECBIBPUO = 18;
  public static int PQSL_VISTACODICA1_BIBPNUUOGEVA = 19;
  public static int PQSL_VISTACODICA1_BILBPRSTATUS = 20;

  // Recordset for query: Temp BIL BPR
  //
  public static int QRY_TEMPBILBPR2 = 2260;
  public static int QSL_TEMPBILBPR2_BILBPRARTICO = 0;
  public static int QSL_TEMPBILBPR2_BILBPRCAPITO = 1;
  public static int QSL_TEMPBILBPR2_BILBPRES = 2;
  public static int QSL_TEMPBILBPR2_BILBPRESERCI = 3;
  public static int QSL_TEMPBILBPR2_REISCRIZISTN = 4;
  public static int QSL_TEMPBILBPR2_REISCRIZIIMP = 5;
  public static int QSL_TEMPBILBPR2_STNINICO = 6;
  public static int QSL_TEMPBILBPR2_STNINICA = 7;
  public static int QSL_TEMPBILBPR2_PREVISIONE = 8;
  public static int QSL_TEMPBILBPR2_PREVISICASSA = 9;
  public static int QSL_TEMPBILBPR2_RESIDUPRESUN = 10;
  public static int QSL_TEMPBILBPR2_GIAIMPEGNATO = 11;
  public static int QSL_TEMPBILBPR2_BILBPRSTATUS = 12;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI9 = 2261;
  public static int PQRY_FILTRI9_RS = 2262;
  public static int PQSL_FILTRI9_ROWNAMENTSPE = 0;
  public static int PQSL_FILTRI9_ROWNAMEUO = 1;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI10 = 2263;
  public static int PQRY_FILTRI10_RS = 2264;
  public static int PQSL_FILTRI10_ROWNAMTITENT = 0;
  public static int PQSL_FILTRI10_ROWNAMETIPOL = 1;

  // Table to contain panel selected row: Filtri
  //
  public static int PQRY_FILTRI11 = 2265;
  public static int PQRY_FILTRI11_RS = 2266;
  public static int PQSL_FILTRI11_ROWNAMEMISSI = 0;
  public static int PQSL_FILTRI11_ROWNAMEPROGR = 1;
  public static int PQSL_FILTRI11_ROWNAMTITSPE = 2;
  public static int PQSL_FILTRI11_ROWNAMEMACRO = 3;

  // Table to contain panel selected row: VISTA CODIFICHE CAP
  //
  public static int PQRY_VISTACODICAP = 2267;
  public static int PQRY_VISTACODICAP_RS = 2268;
  public static int PQSL_VISTACODICAP_ESERCIZIO = 0;
  public static int PQSL_VISTACODICAP_E_S = 1;
  public static int PQSL_VISTACODICAP_CAPITOLO = 2;
  public static int PQSL_VISTACODICAP_ARTICOLO = 3;
  public static int PQSL_VISTACODICAP_DESCRIZIONE_ABBREVIATA = 4;
  public static int PQSL_VISTACODICAP_RECORINFOCAP = 5;
  public static int PQSL_VISTACODICAP_BILBPRAPSTUO = 6;
  public static int PQSL_VISTACODICAP_RECONUOVEXPR = 7;
  public static int PQSL_VISTACODICAP_COMP_PURA = 8;
  public static int PQSL_VISTACODICAP_STN_PURO_DA_CRONO = 9;
  public static int PQSL_VISTACODICAP_BILBPR_ESERCIZIO = 10;
  public static int PQSL_VISTACODICAP_STN_INI_CO = 11;
  public static int PQSL_VISTACODICAP_REISCRIZIONI_IMP = 12;
  public static int PQSL_VISTACODICAP_REISCRIZIONI_STN = 13;
  public static int PQSL_VISTACODICAP_PREVISIONE = 14;
  public static int PQSL_VISTACODICAP_GIA_IMPEGNATO = 15;
  public static int PQSL_VISTACODICAP_STN_INI_CA = 16;
  public static int PQSL_VISTACODICAP_RESIDUI_PRESUNTI = 17;
  public static int PQSL_VISTACODICAP_NUMRECBIBPUO = 18;
  public static int PQSL_VISTACODICAP_BIBPNUUOGEVA = 19;
  public static int PQSL_VISTACODICAP_BILBPRSTATUS = 20;
  public static int PQSL_VISTACODICAP_PREVISIONE_CASSA = 21;

  // Recordset for query: Temp BIL BPR
  //
  public static int QRY_TEMPBILBPR1 = 2269;
  public static int QSL_TEMPBILBPR1_BILBPRARTICO = 0;
  public static int QSL_TEMPBILBPR1_BILBPRCAPITO = 1;
  public static int QSL_TEMPBILBPR1_BILBPRES = 2;
  public static int QSL_TEMPBILBPR1_BILBPRESERCI = 3;
  public static int QSL_TEMPBILBPR1_REISCRIZISTN = 4;
  public static int QSL_TEMPBILBPR1_REISCRIZIIMP = 5;
  public static int QSL_TEMPBILBPR1_STNINICO = 6;
  public static int QSL_TEMPBILBPR1_STNINICA = 7;
  public static int QSL_TEMPBILBPR1_PREVISIONE = 8;
  public static int QSL_TEMPBILBPR1_PREVISICASSA = 9;
  public static int QSL_TEMPBILBPR1_RESIDUPRESUN = 10;
  public static int QSL_TEMPBILBPR1_GIAIMPEGNATO = 11;
  public static int QSL_TEMPBILBPR1_BILBPRSTATUS = 12;

  // Table to contain panel selected row: BIL UO
  //
  public static int PQRY_BILUO1 = 2270;
  public static int PQSL_BILUO1_ESERCIZIO = 0;
  public static int PQSL_BILUO1_E_S = 1;
  public static int PQSL_BILUO1_CAPITOLO = 2;
  public static int PQSL_BILUO1_ARTICOLO = 3;
  public static int PQSL_BILUO1_PROGR_UNITA_ORGANIZZATIVA = 4;
  public static int PQSL_BILUO1_STN_INI_CO = 5;
  public static int PQSL_BILUO1_PREVISIONE = 6;
  public static int PQSL_BILUO1_DISPONIBILITA = 7;
  public static int PQSL_BILUO1_PREVISIONE_CONS = 8;
  public static int PQSL_BILUO1_PREVISIONE_SVIL = 9;
  public static int PQSL_BILUO1_STN_INI_CO_CONS = 10;
  public static int PQSL_BILUO1_STN_INI_CO_SVIL = 11;
  public static int PQSL_BILUO1_VARIAZIONI_CO = 12;
  public static int PQSL_BILUO1_VARIAZIONI_CO_CONS = 13;
  public static int PQSL_BILUO1_VARIAZIONI_CO_SVIL = 14;
  public static int PQSL_BILUO1_IMP_ULT_CHIUSO = 15;
  public static int PQSL_BILUO1_IMP_ULT_CHIUSO_CONS = 16;
  public static int PQSL_BILUO1_IMP_ULT_CHIUSO_SVIL = 17;
  public static int PQSL_BILUO1_UTENTE_INSERIMENTO = 18;
  public static int PQSL_BILUO1_DATA_INSERIMENTO = 19;
  public static int PQSL_BILUO1_UTENTE_ULTIMO_AGG = 20;
  public static int PQSL_BILUO1_DATA_ULTIMO_AGG = 21;

  // Table to contain panel selected row: BIL UO
  //
  public static int PQRY_BILUO = 2271;
  public static int PQSL_BILUO_ESERCIZIO = 0;
  public static int PQSL_BILUO_E_S = 1;
  public static int PQSL_BILUO_CAPITOLO = 2;
  public static int PQSL_BILUO_ARTICOLO = 3;
  public static int PQSL_BILUO_PROGR_UNITA_ORGANIZZATIVA = 4;
  public static int PQSL_BILUO_STN_INI_CO = 5;
  public static int PQSL_BILUO_PREVISIONE = 6;
  public static int PQSL_BILUO_PREVISIONE_CONS = 7;
  public static int PQSL_BILUO_PREVISIONE_SVIL = 8;
  public static int PQSL_BILUO_STN_INI_CO_CONS = 9;
  public static int PQSL_BILUO_STN_INI_CO_SVIL = 10;
  public static int PQSL_BILUO_IMP_ULT_CHIUSO = 11;
  public static int PQSL_BILUO_IMP_ULT_CHIUSO_CONS = 12;
  public static int PQSL_BILUO_IMP_ULT_CHIUSO_SVIL = 13;
  public static int PQSL_BILUO_UTENTE_INSERIMENTO = 14;
  public static int PQSL_BILUO_DATA_INSERIMENTO = 15;
  public static int PQSL_BILUO_UTENTE_ULTIMO_AGG = 16;
  public static int PQSL_BILUO_DATA_ULTIMO_AGG = 17;

  // Table to contain panel selected row: BIL FS
  //
  public static int PQRY_BILFS1 = 2272;
  public static int PQSL_BILFS1_ESERCIZIO = 0;
  public static int PQSL_BILFS1_E_S = 1;
  public static int PQSL_BILFS1_CAPITOLO = 2;
  public static int PQSL_BILFS1_ARTICOLO = 3;
  public static int PQSL_BILFS1_APRICAPITOL1 = 4;
  public static int PQSL_BILFS1_STN_INI_CO_1 = 5;
  public static int PQSL_BILFS1_STN_INI_CO_2 = 6;
  public static int PQSL_BILFS1_STN_INI_CO_3 = 7;
  public static int PQSL_BILFS1_PREVISIONE = 8;

  // Table to contain panel selected row: BIL FS
  //
  public static int PQRY_BILFS = 2273;
  public static int PQSL_BILFS_ESERCIZIO = 0;
  public static int PQSL_BILFS_E_S = 1;
  public static int PQSL_BILFS_CAPITOLO = 2;
  public static int PQSL_BILFS_ARTICOLO = 3;
  public static int PQSL_BILFS_APRICAPITOL1 = 4;
  public static int PQSL_BILFS_STN_INI_CO_1 = 5;
  public static int PQSL_BILFS_STN_INI_CO_2 = 6;
  public static int PQSL_BILFS_STN_INI_CO_3 = 7;
  public static int PQSL_BILFS_PREVISIONE = 8;

  // Table to contain panel selected row: BIL
  //
  public static int PQRY_BIL7 = 2274;
  public static int PQSL_BIL7_ESERCIZIO = 0;
  public static int PQSL_BIL7_ES = 1;
  public static int PQSL_BIL7_CAPITOLO = 2;
  public static int PQSL_BIL7_ARTICOLO = 3;
  public static int PQSL_BIL7_IMPACCULTCHI = 4;
  public static int PQSL_BIL7_IMPACCULTCON = 5;
  public static int PQSL_BIL7_IMPACCULTSVI = 6;
  public static int PQSL_BIL7_PREVISIONE = 7;
  public static int PQSL_BIL7_PREVISIOCONS = 8;
  public static int PQSL_BIL7_PREVISIOSVIL = 9;
  public static int PQSL_BIL7_STNINICO = 10;
  public static int PQSL_BIL7_STNINICOCONS = 11;
  public static int PQSL_BIL7_STNINICOSVIL = 12;
  public static int PQSL_BIL7_VARIAZIONICO = 13;
  public static int PQSL_BIL7_VARIAZCOCONS = 14;
  public static int PQSL_BIL7_VARIAZCOSVIL = 15;
  public static int PQSL_BIL7_DISPONIBILIT = 16;
  public static int PQSL_BIL7_DISPONIBCONS = 17;
  public static int PQSL_BIL7_DISPONIBSVIL = 18;
  public static int PQSL_BIL7_DISPONIBIBDG = 19;
  public static int PQSL_BIL7_IMPEGNABILE = 20;
  public static int PQSL_BIL7_VARIMPEGNABI = 21;
  public static int PQSL_BIL7_UTENTEINSERI = 22;
  public static int PQSL_BIL7_DATAINSERIME = 23;
  public static int PQSL_BIL7_UTENTULTIAGG = 24;
  public static int PQSL_BIL7_DATAULTIMAGG = 25;
  public static int PQSL_BIL7_STNINICA = 26;
  public static int PQSL_BIL7_VARIAZIONICA = 27;
  public static int PQSL_BIL7_DISPONIBILCA = 28;
  public static int PQSL_BIL7_RESIDUPRESUN = 29;
  public static int PQSL_BIL7_REISCRIDAIMP = 30;
  public static int PQSL_BIL7_REISCRIDASTN = 31;
  public static int PQSL_BIL7_GIAIMPEGNATO = 32;
  public static int PQSL_BIL7_VARIREIDAIMP = 33;
  public static int PQSL_BIL7_VARIREIDASTN = 34;
  public static int PQSL_BIL7_COMPETENPURA = 35;
  public static int PQSL_BIL7_NUOVO = 36;
  public static int PQSL_BIL7_FASEESEFIN = 37;

  // Table to contain panel selected row: BPR
  //
  public static int PQRY_BPR1 = 2275;
  public static int PQSL_BPR1_ESERCIZIO = 0;
  public static int PQSL_BPR1_ES = 1;
  public static int PQSL_BPR1_CAPITOLO = 2;
  public static int PQSL_BPR1_ARTICOLO = 3;
  public static int PQSL_BPR1_IMPACCULTCHI = 4;
  public static int PQSL_BPR1_IMPACCULTCON = 5;
  public static int PQSL_BPR1_IMPACCULTSVI = 6;
  public static int PQSL_BPR1_PREVISIONE = 7;
  public static int PQSL_BPR1_PREVISIOCONS = 8;
  public static int PQSL_BPR1_PREVISIOSVIL = 9;
  public static int PQSL_BPR1_STNINICO = 10;
  public static int PQSL_BPR1_STNINICOCONS = 11;
  public static int PQSL_BPR1_STNINICOSVIL = 12;
  public static int PQSL_BPR1_VARIAZIONICO = 13;
  public static int PQSL_BPR1_VARIAZCOCONS = 14;
  public static int PQSL_BPR1_VARIAZCOSVIL = 15;
  public static int PQSL_BPR1_IMPEGNABILE = 16;
  public static int PQSL_BPR1_UTENTEINSERI = 17;
  public static int PQSL_BPR1_DATAINSERIME = 18;
  public static int PQSL_BPR1_UTENTULTIAGG = 19;
  public static int PQSL_BPR1_DATAULTIMAGG = 20;
  public static int PQSL_BPR1_STNINICA = 21;
  public static int PQSL_BPR1_RESIDUPRESUN = 22;
  public static int PQSL_BPR1_REISCRIDAIMP = 23;
  public static int PQSL_BPR1_REISCRIDASTN = 24;
  public static int PQSL_BPR1_GIAIMPEGNATO = 25;
  public static int PQSL_BPR1_COMPETENPURA = 26;
  public static int PQSL_BPR1_NUOVO = 27;
  public static int PQSL_BPR1_FASEESEFIN = 28;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP11 = 2276;
  public static int PQSL_CAP11_RECOCAPIEXPR = 0;
  public static int PQSL_CAP11_RECOARTIEXPR = 1;
  public static int PQSL_CAP11_RECINFCAPBUT = 2;
  public static int PQSL_CAP11_RECAPRSTUOEX = 3;
  public static int PQSL_CAP11_RECONUOVEXPR = 4;
  public static int PQSL_CAP11_DESCRIZIONE = 5;
  public static int PQSL_CAP11_STN_INI_CO = 6;
  public static int PQSL_CAP11_STN_INI_CO_SVIL = 7;
  public static int PQSL_CAP11_STN_INI_CO_CONS = 8;
  public static int PQSL_CAP11_PREVISIONE = 9;
  public static int PQSL_CAP11_PREVISIONE_SVIL = 10;
  public static int PQSL_CAP11_PREVISIONE_CONS = 11;
  public static int PQSL_CAP11_IMP_ACC_ULT_CHIUSO = 12;
  public static int PQSL_CAP11_IMP_ACC_ULT_SVIL = 13;
  public static int PQSL_CAP11_IMP_ACC_ULT_CONS = 14;
  public static int PQSL_CAP11_IMPEGNABILE = 15;
  public static int PQSL_CAP11_TITOLO = 16;
  public static int PQSL_CAP11_CATEGORIA = 17;
  public static int PQSL_CAP11_COD_INTERVENTO = 18;
  public static int PQSL_CAP11_FUNZIONE = 19;
  public static int PQSL_CAP11_SERVIZIO = 20;
  public static int PQSL_CAP11_RECONUMREXPR = 21;
  public static int PQSL_CAP11_RECOUNITEXPR = 22;
  public static int PQSL_CAP11_ESERCIZIO = 23;
  public static int PQSL_CAP11_E_S = 24;
  public static int PQSL_CAP11_CAPITOLO = 25;
  public static int PQSL_CAP11_ARTICOLO = 26;
  public static int PQSL_CAP11_RECOSTATEXPR = 27;
  public static int PQSL_CAP11_VARIAZIONI_CO = 28;
  public static int PQSL_CAP11_VARIAZIONI_CO_CONS = 29;
  public static int PQSL_CAP11_VARIAZIONI_CO_SVIL = 30;
  public static int PQSL_CAP11_RECORDBILESE = 31;
  public static int PQSL_CAP11_DESCRIZIONE_ABBREVIATA = 32;

  // Table to contain panel selected row: Filtri Effettivo Vg
  //
  public static int PQRY_FILTREFFETV1 = 2277;
  public static int PQRY_FILTREFFETV1_RS = 2278;
  public static int PQSL_FILTREFFETV1_ROWNAMETITOL = 0;
  public static int PQSL_FILTREFFETV1_ROWNAMECATEG = 1;
  public static int PQSL_FILTREFFETV1_ROWNAMEFUNZI = 2;
  public static int PQSL_FILTREFFETV1_ROWNAMESERVI = 3;
  public static int PQSL_FILTREFFETV1_ROWNAMCODINT = 4;
  public static int PQSL_FILTREFFETV1_ROWNAMEENTRA = 5;
  public static int PQSL_FILTREFFETV1_ROWNAMCODTER = 6;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV80 = 2279;
  public static int QSL_CFASELINTV80_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV81 = 2280;
  public static int QSL_CFASELINTV81_ROWNAMEESERC = 0;

  // Recordset for query: Temp BIL
  //
  public static int QRY_TEMPBIL1 = 2281;
  public static int QSL_TEMPBIL1_ROWNAMEARTIC = 0;
  public static int QSL_TEMPBIL1_ROWNAMECAPIT = 1;
  public static int QSL_TEMPBIL1_ROWNAMEES = 2;
  public static int QSL_TEMPBIL1_ROWNAMEESERC = 3;
  public static int QSL_TEMPBIL1_ROWNAMEIMPEG = 4;
  public static int QSL_TEMPBIL1_RONASTINCOSV = 5;
  public static int QSL_TEMPBIL1_RONASTINCOCO = 6;
  public static int QSL_TEMPBIL1_ROWNAMSTINCO = 7;
  public static int QSL_TEMPBIL1_ROWNAMPRESVI = 8;
  public static int QSL_TEMPBIL1_ROWNAMEPREVI = 9;
  public static int QSL_TEMPBIL1_RONAIMACULSV = 10;
  public static int QSL_TEMPBIL1_ROWNAMPRECON = 11;
  public static int QSL_TEMPBIL1_RONAIMACULCO = 12;
  public static int QSL_TEMPBIL1_RONAIMACULCH = 13;
  public static int QSL_TEMPBIL1_ROWNAMESTATU = 14;

  // Table to contain panel selected row: BIL UO Vg
  //
  public static int PQRY_BILUOVG = 2282;
  public static int PQSL_BILUOVG_ESERCIZIO = 0;
  public static int PQSL_BILUOVG_E_S = 1;
  public static int PQSL_BILUOVG_CAPITOLO = 2;
  public static int PQSL_BILUOVG_ARTICOLO = 3;
  public static int PQSL_BILUOVG_IMP_ULT_CHIUSO = 4;
  public static int PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS = 5;
  public static int PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL = 6;
  public static int PQSL_BILUOVG_PREVISIONE = 7;
  public static int PQSL_BILUOVG_PREVISIONE_CONS = 8;
  public static int PQSL_BILUOVG_PREVISIONE_SVIL = 9;
  public static int PQSL_BILUOVG_STN_INI_CO = 10;
  public static int PQSL_BILUOVG_STN_INI_CO_CONS = 11;
  public static int PQSL_BILUOVG_STN_INI_CO_SVIL = 12;
  public static int PQSL_BILUOVG_VARIAZIONI_CO = 13;
  public static int PQSL_BILUOVG_VARIAZIONI_CO_CONS = 14;
  public static int PQSL_BILUOVG_VARIAZIONI_CO_SVIL = 15;
  public static int PQSL_BILUOVG_DISPONIBILITA = 16;
  public static int PQSL_BILUOVG_DISPONIBILITA_CONS = 17;
  public static int PQSL_BILUOVG_DISPONIBILITA_SVIL = 18;
  public static int PQSL_BILUOVG_IMPEGNABILE = 19;
  public static int PQSL_BILUOVG_VAR_IMPEGNABILE = 20;
  public static int PQSL_BILUOVG_UTENTE_INSERIMENTO = 21;
  public static int PQSL_BILUOVG_DATA_INSERIMENTO = 22;
  public static int PQSL_BILUOVG_UTENTE_ULTIMO_AGG = 23;
  public static int PQSL_BILUOVG_DATA_ULTIMO_AGG = 24;
  public static int PQSL_BILUOVG_PROGR_UNITA_ORGANIZZATIVA = 25;

  // Table to contain panel selected row: CAP
  //
  public static int PQRY_CAP9 = 2283;
  public static int PQSL_CAP9_RECOCAPIEXPR = 0;
  public static int PQSL_CAP9_RECOARTIEXPR = 1;
  public static int PQSL_CAP9_RECINFCAPBUT = 2;
  public static int PQSL_CAP9_RECAPRSTUOEX = 3;
  public static int PQSL_CAP9_RECONUOVEXPR = 4;
  public static int PQSL_CAP9_DESCRIZIONE = 5;
  public static int PQSL_CAP9_STN_INI_CO = 6;
  public static int PQSL_CAP9_STN_INI_CO_SVIL = 7;
  public static int PQSL_CAP9_STN_INI_CO_CONS = 8;
  public static int PQSL_CAP9_PREVISIONE = 9;
  public static int PQSL_CAP9_PREVISIONE_SVIL = 10;
  public static int PQSL_CAP9_PREVISIONE_CONS = 11;
  public static int PQSL_CAP9_IMP_ACC_ULT_CHIUSO = 12;
  public static int PQSL_CAP9_IMP_ACC_ULT_SVIL = 13;
  public static int PQSL_CAP9_IMP_ACC_ULT_CONS = 14;
  public static int PQSL_CAP9_IMPEGNABILE = 15;
  public static int PQSL_CAP9_TITOLO = 16;
  public static int PQSL_CAP9_CATEGORIA = 17;
  public static int PQSL_CAP9_COD_INTERVENTO = 18;
  public static int PQSL_CAP9_FUNZIONE = 19;
  public static int PQSL_CAP9_SERVIZIO = 20;
  public static int PQSL_CAP9_RECONUMREXPR = 21;
  public static int PQSL_CAP9_RECOUNITEXPR = 22;
  public static int PQSL_CAP9_ESERCIZIO = 23;
  public static int PQSL_CAP9_E_S = 24;
  public static int PQSL_CAP9_CAPITOLO = 25;
  public static int PQSL_CAP9_ARTICOLO = 26;
  public static int PQSL_CAP9_RECOSTATEXPR = 27;
  public static int PQSL_CAP9_VARIAZIONI_CO = 28;
  public static int PQSL_CAP9_VARIAZIONI_CO_CONS = 29;
  public static int PQSL_CAP9_VARIAZIONI_CO_SVIL = 30;
  public static int PQSL_CAP9_RECORDBPRESE = 31;
  public static int PQSL_CAP9_DESCRIZIONE_ABBREVIATA = 32;
  public static int PQSL_CAP9_RECOCAPIEXP1 = 33;

  // Table to contain panel selected row: Filtri Simulato
  //
  public static int PQRY_FILTRISIMUL2 = 2284;
  public static int PQRY_FILTRISIMUL2_RS = 2285;
  public static int PQSL_FILTRISIMUL2_ROWNAMEENTRA = 0;
  public static int PQSL_FILTRISIMUL2_ROWNAMETITOL = 1;
  public static int PQSL_FILTRISIMUL2_ROWNAMECATEG = 2;
  public static int PQSL_FILTRISIMUL2_ROWNAMEFUNZI = 3;
  public static int PQSL_FILTRISIMUL2_ROWNAMESERVI = 4;
  public static int PQSL_FILTRISIMUL2_ROWNAMCODINT = 5;
  public static int PQSL_FILTRISIMUL2_ROWNAMCODTER = 6;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV84 = 2286;
  public static int QSL_CFASELINTV84_COUNT = 0;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV85 = 2287;
  public static int QSL_CFASELINTV85_ROWNAMEESERC = 0;

  // Recordset for query: Temp BPR Vg
  //
  public static int QRY_TEMPBPRVG1 = 2288;
  public static int QSL_TEMPBPRVG1_ROWNAMEARTIC = 0;
  public static int QSL_TEMPBPRVG1_ROWNAMECAPIT = 1;
  public static int QSL_TEMPBPRVG1_ROWNAMEES = 2;
  public static int QSL_TEMPBPRVG1_ROWNAMEESERC = 3;
  public static int QSL_TEMPBPRVG1_ROWNAMEIMPEG = 4;
  public static int QSL_TEMPBPRVG1_RONASTINCOSV = 5;
  public static int QSL_TEMPBPRVG1_RONASTINCOCO = 6;
  public static int QSL_TEMPBPRVG1_ROWNAMSTINCO = 7;
  public static int QSL_TEMPBPRVG1_ROWNAMPRESVI = 8;
  public static int QSL_TEMPBPRVG1_ROWNAMEPREVI = 9;
  public static int QSL_TEMPBPRVG1_RONAIMACULSV = 10;
  public static int QSL_TEMPBPRVG1_ROWNAMPRECON = 11;
  public static int QSL_TEMPBPRVG1_RONAIMACULCO = 12;
  public static int QSL_TEMPBPRVG1_RONAIMACULCH = 13;
  public static int QSL_TEMPBPRVG1_ROWNAMESTATU = 14;

  // Table to contain panel selected row: BPR UO
  //
  public static int PQRY_BPRUO = 2289;
  public static int PQSL_BPRUO_ESERCIZIO = 0;
  public static int PQSL_BPRUO_E_S = 1;
  public static int PQSL_BPRUO_CAPITOLO = 2;
  public static int PQSL_BPRUO_ARTICOLO = 3;
  public static int PQSL_BPRUO_IMP_ULT_CHIUSO = 4;
  public static int PQSL_BPRUO_IMP_ULT_CHIUSO_CONS = 5;
  public static int PQSL_BPRUO_IMP_ULT_CHIUSO_SVIL = 6;
  public static int PQSL_BPRUO_PREVISIONE = 7;
  public static int PQSL_BPRUO_PREVISIONE_CONS = 8;
  public static int PQSL_BPRUO_PREVISIONE_SVIL = 9;
  public static int PQSL_BPRUO_STN_INI_CO = 10;
  public static int PQSL_BPRUO_STN_INI_CO_CONS = 11;
  public static int PQSL_BPRUO_STN_INI_CO_SVIL = 12;
  public static int PQSL_BPRUO_IMPEGNABILE = 13;
  public static int PQSL_BPRUO_UTENTE_INSERIMENTO = 14;
  public static int PQSL_BPRUO_DATA_INSERIMENTO = 15;
  public static int PQSL_BPRUO_UTENTE_ULTIMO_AGG = 16;
  public static int PQSL_BPRUO_DATA_ULTIMO_AGG = 17;
  public static int PQSL_BPRUO_PROGR_UNITA_ORGANIZZATIVA = 18;

  // Table to contain panel selected row: Pats
  //
  public static int PQRY_PATS4 = 2290;
  public static int PQRY_PATS4_RS = 2291;
  public static int PQSL_PATS4_NOMOGGESDIIS = 0;
  public static int PQSL_PATS4_NOMEOGGETIPO = 1;
  public static int PQSL_PATS4_NOMOGGORDCRO = 2;
  public static int PQSL_PATS4_NOMEOGGECAPI = 3;
  public static int PQSL_PATS4_NOMEOGGEARTI = 4;
  public static int PQSL_PATS4_NOMEOGGEFINA = 5;
  public static int PQSL_PATS4_NOMOGGAPECHI = 6;

  // Table to contain panel selected row: TESTATE CRONOPROGRAMMI
  //
  public static int PQRY_TESTATCRONO4 = 2292;
  public static int PQSL_TESTATCRONO4_OPERA = 0;
  public static int PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID = 1;
  public static int PQSL_TESTATCRONO4_CRONOPROGRAMMA_ID_NON_DEF = 2;
  public static int PQSL_TESTATCRONO4_IMPORTO_INIZIALE = 3;
  public static int PQSL_TESTATCRONO4_IMPORTO_ATTUALE = 4;
  public static int PQSL_TESTATCRONO4_DEFINITO = 5;
  public static int PQSL_TESTATCRONO4_CONFERMATO_RAG = 6;
  public static int PQSL_TESTATCRONO4_DETERMINATO = 7;
  public static int PQSL_TESTATCRONO4_UTENTE_INSERIMENTO = 8;
  public static int PQSL_TESTATCRONO4_DATA_INSERIMENTO = 9;
  public static int PQSL_TESTATCRONO4_UTENTE_ULTIMO_AGG = 10;
  public static int PQSL_TESTATCRONO4_DATA_ULTIMO_AGG = 11;
  public static int PQSL_TESTATCRONO4_ESERCIZIO_ISCRIZIONE = 12;
  public static int PQSL_TESTATCRONO4_ESERCIZIO_ENTRATA = 13;
  public static int PQSL_TESTATCRONO4_ORDINAMENTO = 14;

  // Table to contain panel selected row: Cronoprogramma
  //
  public static int PQRY_CRONOPROGRAM = 2293;
  public static int PQSL_CRONOPROGRAM_OPERA = 0;
  public static int PQSL_CRONOPROGRAM_IMPORTINIZIA = 1;
  public static int PQSL_CRONOPROGRAM_IMPORTATTUAL = 2;
  public static int PQSL_CRONOPROGRAM_UTENTEINSERI = 3;
  public static int PQSL_CRONOPROGRAM_DATAINSERIME = 4;
  public static int PQSL_CRONOPROGRAM_UTENTULTIAGG = 5;
  public static int PQSL_CRONOPROGRAM_DATAULTIMAGG = 6;
  public static int PQSL_CRONOPROGRAM_NUOVARIGA = 7;
  public static int PQSL_CRONOPROGRAM_ESERCIISCRIZ = 8;
  public static int PQSL_CRONOPROGRAM_CRONOPROGRID = 9;
  public static int PQSL_CRONOPROGRAM_DETERMINATO = 10;
  public static int PQSL_CRONOPROGRAM_CONFERMATRAG = 11;
  public static int PQSL_CRONOPROGRAM_DEFINITO = 12;
  public static int PQSL_CRONOPROGRAM_ESERCIENTRAT = 13;
  public static int PQSL_CRONOPROGRAM_ENTRESIGDIFF = 14;
  public static int PQSL_CRONOPROGRAM_ANNODEL = 15;
  public static int PQSL_CRONOPROGRAM_NUMERODEL = 16;
  public static int PQSL_CRONOPROGRAM_SEDEDEL = 17;
  public static int PQSL_CRONOPROGRAM_DATAREGISTRA = 18;

  // Table to contain panel selected row: ENTRATE CRONOPROGRAMMI
  //
  public static int PQRY_ENTRATCRONO1 = 2294;
  public static int PQSL_ENTRATCRONO1_CRONOIDENTRA = 0;
  public static int PQSL_ENTRATCRONO1_FINANZIAMENT = 1;
  public static int PQSL_ENTRATCRONO1_ESERCIZIPLUR = 2;
  public static int PQSL_ENTRATCRONO1_IMPORTO = 3;
  public static int PQSL_ENTRATCRONO1_CRONOIDSPESA = 4;
  public static int PQSL_ENTRATCRONO1_UTENTEINSERI = 5;
  public static int PQSL_ENTRATCRONO1_DATAINSERIME = 6;
  public static int PQSL_ENTRATCRONO1_UTENTULTIAGG = 7;
  public static int PQSL_ENTRATCRONO1_DATAULTIMAGG = 8;
  public static int PQSL_ENTRATCRONO1_PROGREIMPUTA = 9;
  public static int PQSL_ENTRATCRONO1_ESERCIZSPESA = 10;
  public static int PQSL_ENTRATCRONO1_CAPITOENTRAT = 11;
  public static int PQSL_ENTRATCRONO1_ARTICOENTRAT = 12;
  public static int PQSL_ENTRATCRONO1_DAVARIAZIONE = 13;

  // Table to contain panel selected row: PIANI CRONOPROGRAMMI
  //
  public static int PQRY_PIANICRONOPR = 2295;
  public static int PQSL_PIANICRONOPR_CRONOPROGRID = 0;
  public static int PQSL_PIANICRONOPR_PROGREIMPUTA = 1;
  public static int PQSL_PIANICRONOPR_ESERCIZIPLUR = 2;
  public static int PQSL_PIANICRONOPR_FINANZIAMENT = 3;
  public static int PQSL_PIANICRONOPR_IMPORTO = 4;
  public static int PQSL_PIANICRONOPR_VARIAZIONI = 5;
  public static int PQSL_PIANICRONOPR_UTENTEINSERI = 6;
  public static int PQSL_PIANICRONOPR_DATAINSERIME = 7;
  public static int PQSL_PIANICRONOPR_UTENTULTIAGG = 8;
  public static int PQSL_PIANICRONOPR_DATAULTIMAGG = 9;
  public static int PQSL_PIANICRONOPR_NUOVARIGA = 10;
  public static int PQSL_PIANICRONOPR_IMPOINIZESER = 11;
  public static int PQSL_PIANICRONOPR_VARIINIZESER = 12;
  public static int PQSL_PIANICRONOPR_VARIANNINCOR = 13;
  public static int PQSL_PIANICRONOPR_IMPORTATTUAL = 14;
  public static int PQSL_PIANICRONOPR_IMPEGNATO = 15;
  public static int PQSL_PIANICRONOPR_PAGATO = 16;
  public static int PQSL_PIANICRONOPR_DISPONIBILIT = 17;
  public static int PQSL_PIANICRONOPR_NUMERIMPPURO = 18;
  public static int PQSL_PIANICRONOPR_ANNOIMPPURO = 19;
  public static int PQSL_PIANICRONOPR_NUMERIMPREIS = 20;
  public static int PQSL_PIANICRONOPR_ANNOIMPREISC = 21;

  // Table to contain panel selected row: Varpiani
  //
  public static int PQRY_VARPIANI1 = 2296;
  public static int PQSL_VARPIANI1_PROGRESSIVAR = 0;
  public static int PQSL_VARPIANI1_CRONOPROGRID = 1;
  public static int PQSL_VARPIANI1_PROGREIMPUTA = 2;
  public static int PQSL_VARPIANI1_ESERCIZIPLUR = 3;
  public static int PQSL_VARPIANI1_ANNOVAR = 4;
  public static int PQSL_VARPIANI1_IMPORTO = 5;
  public static int PQSL_VARPIANI1_DESCRIZIONE = 6;
  public static int PQSL_VARPIANI1_DATAREGISTRA = 7;
  public static int PQSL_VARPIANI1_VARIAZGENERA = 8;
  public static int PQSL_VARPIANI1_UTENTEINSERI = 9;
  public static int PQSL_VARPIANI1_DATAINSERIME = 10;
  public static int PQSL_VARPIANI1_UTENTULTIAGG = 11;
  public static int PQSL_VARPIANI1_DATAULTIMAGG = 12;
  public static int PQSL_VARPIANI1_TIPOVAR = 13;
  public static int PQSL_VARPIANI1_CONFERMATRAG = 14;
  public static int PQSL_VARPIANI1_ESERCIENTRAT = 15;
  public static int PQSL_VARPIANI1_VARPVARIGENE = 16;
  public static int PQSL_VARPIANI1_VARPROVARPRO = 17;

  // Table to contain panel selected row: IMPUTAZIONI CRONOPROGRAMMI
  //
  public static int PQRY_IMPUTACRONOP = 2297;
  public static int PQSL_IMPUTACRONOP_CRONOPROGRID = 0;
  public static int PQSL_IMPUTACRONOP_PROGREIMPUTA = 1;
  public static int PQSL_IMPUTACRONOP_CAPITOLO = 2;
  public static int PQSL_IMPUTACRONOP_ARTICOLO = 3;
  public static int PQSL_IMPUTACRONOP_PROGUNITORGA = 4;
  public static int PQSL_IMPUTACRONOP_UTENTEINSERI = 5;
  public static int PQSL_IMPUTACRONOP_DATAINSERIME = 6;
  public static int PQSL_IMPUTACRONOP_UTENTULTIAGG = 7;
  public static int PQSL_IMPUTACRONOP_DATAULTIMAGG = 8;
  public static int PQSL_IMPUTACRONOP_IMPORTO = 9;
  public static int PQSL_IMPUTACRONOP_PROGETTOID = 10;
  public static int PQSL_IMPUTACRONOP_CODLIVELLO5 = 11;
  public static int PQSL_IMPUTACRONOP_NUOVARIGA = 12;

  // Table to contain panel selected row: Varpiani
  //
  public static int PQRY_VARPIANI = 2298;
  public static int PQSL_VARPIANI_PROGRESSIVAR = 0;
  public static int PQSL_VARPIANI_CRONOPROGRID = 1;
  public static int PQSL_VARPIANI_PROGREIMPUTA = 2;
  public static int PQSL_VARPIANI_ESERCIZIPLUR = 3;
  public static int PQSL_VARPIANI_ANNOVAR = 4;
  public static int PQSL_VARPIANI_IMPORTO = 5;
  public static int PQSL_VARPIANI_DESCRIZIONE = 6;
  public static int PQSL_VARPIANI_DATAREGISTRA = 7;
  public static int PQSL_VARPIANI_VARIAZGENERA = 8;
  public static int PQSL_VARPIANI_UTENTEINSERI = 9;
  public static int PQSL_VARPIANI_DATAINSERIME = 10;
  public static int PQSL_VARPIANI_UTENTULTIAGG = 11;
  public static int PQSL_VARPIANI_DATAULTIMAGG = 12;
  public static int PQSL_VARPIANI_NUOVARIGA = 13;
  public static int PQSL_VARPIANI_TIPOVAR = 14;
  public static int PQSL_VARPIANI_CONFERMATRAG = 15;
  public static int PQSL_VARPIANI_ESERCIENTRAT = 16;
  public static int PQSL_VARPIANI_VARIMPGENERA = 17;
  public static int PQSL_VARPIANI_PROGVARIPROV = 18;

  // Table to contain panel selected row: Rec
  //
  public static int PQRY_REC1 = 2299;
  public static int PQSL_REC1_NOOGTECRESIS = 0;
  public static int PQSL_REC1_NOOGTECRENED = 1;
  public static int PQSL_REC1_NOMOGGTECROP = 2;
  public static int PQSL_REC1_NOOGTECRIMIN = 3;
  public static int PQSL_REC1_NOOGTECRIMAT = 4;
  public static int PQSL_REC1_NOMOGGCACOST = 5;
  public static int PQSL_REC1_MACRO = 6;
  public static int PQSL_REC1_NOMOGGIMCRCA = 7;
  public static int PQSL_REC1_NOMOGGIMCRAR = 8;
  public static int PQSL_REC1_NOOGPICRESPL = 9;
  public static int PQSL_REC1_NOMOGGPICRFI = 10;
  public static int PQSL_REC1_NOMOGGFINDES = 11;
  public static int PQSL_REC1_IMPOORIGPURO = 12;
  public static int PQSL_REC1_IMPOORIGREIS = 13;
  public static int PQSL_REC1_IMPORORIGTOT = 14;
  public static int PQSL_REC1_IMPINIESEPUR = 15;
  public static int PQSL_REC1_IMPINIESEREI = 16;
  public static int PQSL_REC1_IMPINIESETOT = 17;
  public static int PQSL_REC1_VARIANNOPURO = 18;
  public static int PQSL_REC1_VARIANNOREIS = 19;
  public static int PQSL_REC1_VARIANNOSOSP = 20;
  public static int PQSL_REC1_VARIANNOTOTA = 21;
  public static int PQSL_REC1_IMPOATTUPURO = 22;
  public static int PQSL_REC1_IMPOATTUREIS = 23;
  public static int PQSL_REC1_IMPOATTUSOSP = 24;
  public static int PQSL_REC1_IMPOATTUTOTA = 25;

  // Table to contain panel selected row: Rec
  //
  public static int PQRY_REC2 = 2300;
  public static int PQSL_REC2_NOOGTECRESIS = 0;
  public static int PQSL_REC2_NOOGTECRENED = 1;
  public static int PQSL_REC2_NOMOGGTECROP = 2;
  public static int PQSL_REC2_NOOGTECRIMIN = 3;
  public static int PQSL_REC2_NOOGTECRIMAT = 4;
  public static int PQSL_REC2_NOMOGGCACOST = 5;
  public static int PQSL_REC2_MACRO = 6;
  public static int PQSL_REC2_NOMOGGIMCRCA = 7;
  public static int PQSL_REC2_NOMOGGIMCRAR = 8;
  public static int PQSL_REC2_NOOGPICRESPL = 9;
  public static int PQSL_REC2_NOMOGGPICRFI = 10;
  public static int PQSL_REC2_NOMOGGFINDES = 11;
  public static int PQSL_REC2_NOOGVAPICRAV = 12;
  public static int PQSL_REC2_NOOGVAPICRIM = 13;
  public static int PQSL_REC2_NOOGVAPICRTV = 14;
  public static int PQSL_REC2_NOOGVAPICRDR = 15;
  public static int PQSL_REC2_NOOGVAPICRCR = 16;
  public static int PQSL_REC2_NOOGVAPICREE = 17;
  public static int PQSL_REC2_BILVAR = 18;
  public static int PQSL_REC2_PUROREIS = 19;

  // Table to contain panel selected row: CRONO PIANO COMP TMP
  //
  public static int PQRY_CROPIACOMTMP = 2301;
  public static int PQSL_CROPIACOMTMP_CROPIACOTMPR = 0;
  public static int PQSL_CROPIACOMTMP_CRPICOTMCRID = 1;
  public static int PQSL_CROPIACOMTMP_CRPICOTMPRIM = 2;
  public static int PQSL_CROPIACOMTMP_CRPICOTMESPL = 3;
  public static int PQSL_CROPIACOMTMP_CROPIACOTMFI = 4;
  public static int PQSL_CROPIACOMTMP_CROPIACOTMIM = 5;
  public static int PQSL_CROPIACOMTMP_CRPICOTMANFI = 6;
  public static int PQSL_CROPIACOMTMP_CROPIACOTMSE = 7;
  public static int PQSL_CROPIACOMTMP_CROPIACOTMTI = 8;
  public static int PQSL_CROPIACOMTMP_CRPICOTMUTIN = 9;
  public static int PQSL_CROPIACOMTMP_CRPICOTMDAIN = 10;
  public static int PQSL_CROPIACOMTMP_CRPICOTMVAGE = 11;

  // Table to contain panel selected row: Par Sopra
  //
  public static int PQRY_PARSOPRA1 = 2302;
  public static int PQRY_PARSOPRA1_RS = 2303;
  public static int PQSL_PARSOPRA1_CRONOPROGRAMMA_ID = 0;

  // Table to contain panel selected row: WRK CRONOPROGRAMMI DEF
  //
  public static int PQRY_WRKCRONOPDEF = 2304;
  public static int PQSL_WRKCRONOPDEF_OPERA = 0;
  public static int PQSL_WRKCRONOPDEF_IMPORTO = 1;
  public static int PQSL_WRKCRONOPDEF_DATA_INSERIMENTO = 2;
  public static int PQSL_WRKCRONOPDEF_PROGR_SESSIONE = 3;

  // Table to contain panel selected row: VAR PIANI CRONOPROGRAMMI
  //
  public static int PQRY_VARPIANICRON = 2305;
  public static int PQSL_VARPIANICRON_RECTESCROOPE = 0;
  public static int PQSL_VARPIANICRON_RECIMPCROCAP = 1;
  public static int PQSL_VARPIANICRON_RECIMPCROART = 2;
  public static int PQSL_VARPIANICRON_REVAPICRESPL = 3;
  public static int PQSL_VARPIANICRON_UNITAORGANIZ = 4;
  public static int PQSL_VARPIANICRON_RECPIACROFIN = 5;
  public static int PQSL_VARPIANICRON_RECVARPICRIM = 6;
  public static int PQSL_VARPIANICRON_REVAPICRPRVA = 7;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL38 = 2306;
  public static int PQSL_DUAL38_RECOESERPLUR = 0;
  public static int PQSL_DUAL38_RECORDFINANZ = 1;
  public static int PQSL_DUAL38_IMPOORIGTOTA = 2;
  public static int PQSL_DUAL38_IMPOORIGREIS = 3;
  public static int PQSL_DUAL38_IMPOORIGPURO = 4;
  public static int PQSL_DUAL38_IMPOINIZTOTA = 5;
  public static int PQSL_DUAL38_IMPOINIZREIS = 6;
  public static int PQSL_DUAL38_IMPOINIZPURO = 7;
  public static int PQSL_DUAL38_VARIANNOTOTA = 8;
  public static int PQSL_DUAL38_VARIANNOREIS = 9;
  public static int PQSL_DUAL38_VARIANNOSOSP = 10;
  public static int PQSL_DUAL38_VARIANNOPURO = 11;
  public static int PQSL_DUAL38_IMPOATTUTOTA = 12;
  public static int PQSL_DUAL38_IMPOATTUREIS = 13;
  public static int PQSL_DUAL38_IMPOATTUSOSP = 14;
  public static int PQSL_DUAL38_IMPOATTUPURO = 15;

  // Table to contain panel selected row: VISTA TOT FIN OPE CAP
  //
  public static int PQRY_VISTOTFIOPCA = 2307;
  public static int PQSL_VISTOTFIOPCA_ESERCIZIO = 0;
  public static int PQSL_VISTOTFIOPCA_FINANZIAMENTO = 1;
  public static int PQSL_VISTOTFIOPCA_OPERA = 2;
  public static int PQSL_VISTOTFIOPCA_E_S = 3;
  public static int PQSL_VISTOTFIOPCA_CAPITOLO = 4;
  public static int PQSL_VISTOTFIOPCA_ARTICOLO = 5;
  public static int PQSL_VISTOTFIOPCA_CODICE = 6;
  public static int PQSL_VISTOTFIOPCA_DESCRIZIONE = 7;
  public static int PQSL_VISTOTFIOPCA_PREVISIONE = 8;
  public static int PQSL_VISTOTFIOPCA_VARIAZIONI = 9;
  public static int PQSL_VISTOTFIOPCA_PREVISIONE_ATT = 10;
  public static int PQSL_VISTOTFIOPCA_VARIAZIONI_PROV = 11;
  public static int PQSL_VISTOTFIOPCA_ACC_IMP_RES = 12;
  public static int PQSL_VISTOTFIOPCA_MAN_ORD_COMP = 13;
  public static int PQSL_VISTOTFIOPCA_MAN_ORD_RES = 14;
  public static int PQSL_VISTOTFIOPCA_MAN_ORD = 15;
  public static int PQSL_VISTOTFIOPCA_SUBIMPEGNATO = 16;
  public static int PQSL_VISTOTFIOPCA_LIQUIDATO = 17;
  public static int PQSL_VISTOTFIOPCA_PREVISIONE_ESIG = 18;
  public static int PQSL_VISTOTFIOPCA_VARIAZIONI_ESIG = 19;
  public static int PQSL_VISTOTFIOPCA_PREVISIONE_STANZ = 20;
  public static int PQSL_VISTOTFIOPCA_VARIAZIONI_STANZ = 21;
  public static int PQSL_VISTOTFIOPCA_ACC_IMP_COMP = 22;
  public static int PQSL_VISTOTFIOPCA_ACC_IMP_COMP_ESIG = 23;
  public static int PQSL_VISTOTFIOPCA_ACC_IMP_COMP_STANZ = 24;
  public static int PQSL_VISTOTFIOPCA_PAGATOTOTALE = 25;
  public static int PQSL_VISTOTFIOPCA_PAGAREIDASTN = 26;
  public static int PQSL_VISTOTFIOPCA_PAGAREIDAESI = 27;
  public static int PQSL_VISTOTFIOPCA_DISPONIBILITA = 28;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS60 = 2308;
  public static int PQRY_PARS60_RS = 2309;
  public static int PQSL_PARS60_NOMEOGGCROID = 0;
  public static int PQSL_PARS60_NOMEOGGETOTA = 1;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS56 = 2310;
  public static int PQRY_PARS56_RS = 2311;
  public static int PQSL_PARS56_NOMEOGGEOPER = 0;
  public static int PQSL_PARS56_NOMOGGESEINS = 1;
  public static int PQSL_PARS56_NOMEOGGECAPI = 2;
  public static int PQSL_PARS56_NOMEOGGEARTI = 3;
  public static int PQSL_PARS56_NOMEOGGEFINA = 4;
  public static int PQSL_PARS56_NOMEOGGECONF = 5;
  public static int PQSL_PARS56_NOMEOGGPROUO = 6;
  public static int PQSL_PARS56_NOMEOGGETOTA = 7;

  // Table to contain panel selected row: QUADRO ECON OPERA
  //
  public static int PQRY_QUADECONOPER = 2312;
  public static int PQSL_QUADECONOPER_OPERA = 0;
  public static int PQSL_QUADECONOPER_VOCE_TECNICA = 1;
  public static int PQSL_QUADECONOPER_FINANZIAMENTO = 2;
  public static int PQSL_QUADECONOPER_IMPORTO = 3;
  public static int PQSL_QUADECONOPER_CRONOPROGRAMMA_ID = 4;

  // Table to contain panel selected row: Pats
  //
  public static int PQRY_PATS2 = 2313;
  public static int PQRY_PATS2_RS = 2314;
  public static int PQSL_PATS2_NOMOGGESDIIS = 0;
  public static int PQSL_PATS2_NOMEOGGECAPI = 1;
  public static int PQSL_PATS2_NOMEOGGEARTI = 2;
  public static int PQSL_PATS2_NOMOGGTUTICA = 3;

  // Table to contain panel selected row: TESTATE CRONOPROGRAMMI
  //
  public static int PQRY_TESTATCRONO1 = 2315;
  public static int PQSL_TESTATCRONO1_RECIMPCROCAP = 0;
  public static int PQSL_TESTATCRONO1_RECIMPCROART = 1;
  public static int PQSL_TESTATCRONO1_RECORCAPDESC = 2;
  public static int PQSL_TESTATCRONO1_ESERCIZIO_ISCRIZIONE = 3;
  public static int PQSL_TESTATCRONO1_REIMCRPRUNOR = 4;
  public static int PQSL_TESTATCRONO1_OPERA = 5;
  public static int PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID = 6;
  public static int PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID_NON_DEF = 7;
  public static int PQSL_TESTATCRONO1_IMPORTO_INIZIALE = 8;
  public static int PQSL_TESTATCRONO1_IMPORTO_ATTUALE = 9;
  public static int PQSL_TESTATCRONO1_ESERCIZIO_ENTRATA = 10;
  public static int PQSL_TESTATCRONO1_RECIMPCROIMP = 11;
  public static int PQSL_TESTATCRONO1_RETECRENESDI = 12;
  public static int PQSL_TESTATCRONO1_RECTESCRODEF = 13;
  public static int PQSL_TESTATCRONO1_RECIMPCRPRID = 14;

  // Table to contain panel selected row: Pats
  //
  public static int PQRY_PATS1 = 2316;
  public static int PQRY_PATS1_RS = 2317;
  public static int PQSL_PATS1_NOMEOGGEESER = 0;
  public static int PQSL_PATS1_NOMEOGGECAPI = 1;
  public static int PQSL_PATS1_NOMEOGGEARTI = 2;
  public static int PQSL_PATS1_NOMEOGGEFINA = 3;
  public static int PQSL_PATS1_NOMOGGIMGIGE = 4;

  // Table to contain panel selected row: TESTATE CRONOPROGRAMMI
  //
  public static int PQRY_TESTATCRONOP = 2318;
  public static int PQSL_TESTATCRONOP_CRONOPROGRAMMA_ID = 0;
  public static int PQSL_TESTATCRONOP_RECPIACRESPL = 1;
  public static int PQSL_TESTATCRONOP_RECIMPCROCAP = 2;
  public static int PQSL_TESTATCRONOP_RECIMPCROART = 3;
  public static int PQSL_TESTATCRONOP_OPERA = 4;
  public static int PQSL_TESTATCRONOP_RECPIACROFIN = 5;
  public static int PQSL_TESTATCRONOP_RECORDIMPORT = 6;
  public static int PQSL_TESTATCRONOP_REISCDASTANZ = 7;
  public static int PQSL_TESTATCRONOP_IMPGENERATO = 8;
  public static int PQSL_TESTATCRONOP_RECIMPCRPRIM = 9;
  public static int PQSL_TESTATCRONOP_RETECRENESDI = 10;

  // Table to contain panel selected row: Pats
  //
  public static int PQRY_PATS7 = 2319;
  public static int PQRY_PATS7_RS = 2320;
  public static int PQSL_PATS7_NOMOGGTIPELA = 0;
  public static int PQSL_PATS7_NOMOGGSEDDEL = 1;
  public static int PQSL_PATS7_NOMOGGNUMDEL = 2;
  public static int PQSL_PATS7_NOMOGGANNDEL = 3;
  public static int PQSL_PATS7_NOMEOGGDACRO = 4;

  // Table to contain panel selected row: Parametri Finanziamenti Da Crono
  //
  public static int PQRY_PARAFINDACR1 = 2321;
  public static int PQRY_PARAFINDACR1_RS = 2322;
  public static int PQSL_PARAFINDACR1_NOMEOGGEESER = 0;
  public static int PQSL_PARAFINDACR1_NOMOGGVARCRO = 1;
  public static int PQSL_PARAFINDACR1_NOMEOGGEDEST = 2;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO21 = 2323;
  public static int PQSL_NOTEFUNZIO21_RECNOTFUNMOD = 0;
  public static int PQSL_NOTEFUNZIO21_RECNOTFUNPAG = 1;
  public static int PQSL_NOTEFUNZIO21_RECNOTFUNFUN = 2;
  public static int PQSL_NOTEFUNZIO21_RECNOTFUNDES = 3;

  // Table to contain panel selected row: Parametri FDCF2
  //
  public static int PQRY_PARAMETFDCF3 = 2324;
  public static int PQRY_PARAMETFDCF3_RS = 2325;
  public static int PQSL_PARAMETFDCF3_NOMEOGGEESER = 0;
  public static int PQSL_PARAMETFDCF3_NOMOGGVARCRO = 1;
  public static int PQSL_PARAMETFDCF3_NOMEOGGEDEST = 2;

  // Table to contain panel selected row: WRKGENFINDACRONODET
  //
  public static int PQRY_WRKGENFINDAC = 2326;
  public static int PQSL_WRKGENFINDAC_SELEZIONE = 0;
  public static int PQSL_WRKGENFINDAC_ANOMALIA = 1;
  public static int PQSL_WRKGENFINDAC_ICONAANOMALI = 2;
  public static int PQSL_WRKGENFINDAC_CAPITOARTICO = 3;
  public static int PQSL_WRKGENFINDAC_OPERA = 4;
  public static int PQSL_WRKGENFINDAC_E_S = 5;
  public static int PQSL_WRKGENFINDAC_CAPITOLO = 6;
  public static int PQSL_WRKGENFINDAC_ARTICOLO = 7;
  public static int PQSL_WRKGENFINDAC_ESERCIZIO_PLUR = 8;
  public static int PQSL_WRKGENFINDAC_FINANZIAMENTO = 9;
  public static int PQSL_WRKGENFINDAC_REISCRIZIONI_DA_STN = 10;
  public static int PQSL_WRKGENFINDAC_STN_PURO_DA_CRONO = 11;
  public static int PQSL_WRKGENFINDAC_DESCRIZIONE_ANOMALIA = 12;
  public static int PQSL_WRKGENFINDAC_PROGR_SESSIONE = 13;
  public static int PQSL_WRKGENFINDAC_PROGRESSIVO_CRONO = 14;
  public static int PQSL_WRKGENFINDAC_PROGRESSIVO = 15;
  public static int PQSL_WRKGENFINDAC_IMPEGNATO = 16;
  public static int PQSL_WRKGENFINDAC_IMPEGNATO_REISC_STN = 17;
  public static int PQSL_WRKGENFINDAC_VAR_DEF = 18;
  public static int PQSL_WRKGENFINDAC_VAR_DEF_REISC_STN = 19;
  public static int PQSL_WRKGENFINDAC_VAR_PROV = 20;
  public static int PQSL_WRKGENFINDAC_VAR_PROV_REISC_STN = 21;
  public static int PQSL_WRKGENFINDAC_DETTAGANOMAL = 22;
  public static int PQSL_WRKGENFINDAC_STNINICO = 23;

  // Table to contain panel selected row: Pats
  //
  public static int PQRY_PATS5 = 2327;
  public static int PQSL_PATS5_UNO = 0;

  // Table to contain panel selected row: FSC PARAMETRI
  //
  public static int PQRY_FSCPARAMETR1 = 2328;
  public static int PQSL_FSCPARAMETR1_ESERCIZIO = 0;
  public static int PQSL_FSCPARAMETR1_TIPO_CLASSIF = 1;
  public static int PQSL_FSCPARAMETR1_PRIMO_ESERCIZIO_ARM = 2;
  public static int PQSL_FSCPARAMETR1_PERC_1 = 3;
  public static int PQSL_FSCPARAMETR1_PERC_2 = 4;
  public static int PQSL_FSCPARAMETR1_DATA_PRIMO_RIACC_STRAORD = 5;
  public static int PQSL_FSCPARAMETR1_TIPO_CALCOLO_NUOVO_ORD = 6;
  public static int PQSL_FSCPARAMETR1_PERIODO_RIFERIMENTO = 7;
  public static int PQSL_FSCPARAMETR1_STPRE_COLONNA_A = 8;
  public static int PQSL_FSCPARAMETR1_GEST_VARIAZIONI_PRO = 9;
  public static int PQSL_FSCPARAMETR1_PERIODO_RIFERIMENTO_REND = 10;
  public static int PQSL_FSCPARAMETR1_RESATT_COLONNA_AB_REND = 11;
  public static int PQSL_FSCPARAMETR1_STPRE_COLONNA_A_BILANCIO = 12;
  public static int PQSL_FSCPARAMETR1_TIPODIV_ZERO = 13;
  public static int PQSL_FSCPARAMETR1_STREND_COLONNA_A_B = 14;
  public static int PQSL_FSCPARAMETR1_STREND_COLONNA_A_B_RES_EFF = 15;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION4 = 2329;
  public static int PQSL_NOTEFUNZION4_MODULO = 0;
  public static int PQSL_NOTEFUNZION4_PAGINA = 1;
  public static int PQSL_NOTEFUNZION4_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION4_DESCRIZIONE = 3;

  // Table to contain panel selected row: FSC TIPI CALC CAP
  //
  public static int PQRY_FSCTIPCALCA1 = 2330;
  public static int PQSL_FSCTIPCALCA1_TIPOLOGIA_CATEGORIA = 0;
  public static int PQSL_FSCTIPCALCA1_DESCRIZIONE = 1;
  public static int PQSL_FSCTIPCALCA1_TIPO_CALCOLO = 2;
  public static int PQSL_FSCTIPCALCA1_ESCLUSO = 3;
  public static int PQSL_FSCTIPCALCA1_UTENTE_INSERIMENTO = 4;
  public static int PQSL_FSCTIPCALCA1_DATA_INSERIMENTO = 5;
  public static int PQSL_FSCTIPCALCA1_UTENTE_ULTIMO_AGG = 6;
  public static int PQSL_FSCTIPCALCA1_DATA_ULTIMO_AGG = 7;
  public static int PQSL_FSCTIPCALCA1_ESERCIZIO = 8;

  // Table to contain panel selected row: FSC TIPI CALC CAP
  //
  public static int PQRY_FSCTIPCALCAP = 2331;
  public static int PQSL_FSCTIPCALCAP_CAPITOLO = 0;
  public static int PQSL_FSCTIPCALCAP_ARTICOLO = 1;
  public static int PQSL_FSCTIPCALCAP_DESCRIZIONE = 2;
  public static int PQSL_FSCTIPCALCAP_TIPO_CALCOLO = 3;
  public static int PQSL_FSCTIPCALCAP_ESCLUSO = 4;
  public static int PQSL_FSCTIPCALCAP_UTENTE_INSERIMENTO = 5;
  public static int PQSL_FSCTIPCALCAP_DATA_INSERIMENTO = 6;
  public static int PQSL_FSCTIPCALCAP_UTENTE_ULTIMO_AGG = 7;
  public static int PQSL_FSCTIPCALCAP_DATA_ULTIMO_AGG = 8;
  public static int PQSL_FSCTIPCALCAP_ESERCIZIO = 9;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS44 = 2332;
  public static int PQRY_PARS44_RS = 2333;
  public static int PQSL_PARS44_NOMOGGTIPCLA = 0;
  public static int PQSL_PARS44_NOMOGGTIPCAL = 1;
  public static int PQSL_PARS44_NOMEOGGEESCL = 2;

  // Recordset for query: IMDB Agg Tipo Calcolo
  //
  public static int QRY_IMDAGGTIPCA1 = 2334;
  public static int QSL_IMDAGGTIPCA1_TC = 0;
  public static int QSL_IMDAGGTIPCA1_CCAP = 1;
  public static int QSL_IMDAGGTIPCA1_CART = 2;

  // Table to contain panel selected row: FSC IMPORTI
  //
  public static int PQRY_FSCIMPORTI = 2335;
  public static int PQSL_FSCIMPORTI_CAPITOLO = 0;
  public static int PQSL_FSCIMPORTI_ARTICOLO = 1;
  public static int PQSL_FSCIMPORTI_TIPOLOGIA_CATEGORIA = 2;
  public static int PQSL_FSCIMPORTI_DESCRIZIONE = 3;
  public static int PQSL_FSCIMPORTI_TITOLO = 4;
  public static int PQSL_FSCIMPORTI_ESERCIZIO = 5;
  public static int PQSL_FSCIMPORTI_ACCERTATO_M5 = 6;
  public static int PQSL_FSCIMPORTI_INCASSATO_M5 = 7;
  public static int PQSL_FSCIMPORTI_PERCENTUALE_M5 = 8;
  public static int PQSL_FSCIMPORTI_ACCERTATO_M4 = 9;
  public static int PQSL_FSCIMPORTI_INCASSATO_M4 = 10;
  public static int PQSL_FSCIMPORTI_PERCENTUALE_M4 = 11;
  public static int PQSL_FSCIMPORTI_ACCERTATO_M3 = 12;
  public static int PQSL_FSCIMPORTI_INCASSATO_M3 = 13;
  public static int PQSL_FSCIMPORTI_PERCENTUALE_M3 = 14;
  public static int PQSL_FSCIMPORTI_ACCERTATO_M2 = 15;
  public static int PQSL_FSCIMPORTI_INCASSATO_M2 = 16;
  public static int PQSL_FSCIMPORTI_PERCENTUALE_M2 = 17;
  public static int PQSL_FSCIMPORTI_ACCERTATO_M1 = 18;
  public static int PQSL_FSCIMPORTI_INCASSATO_M1 = 19;
  public static int PQSL_FSCIMPORTI_PERCENTUALE_M1 = 20;
  public static int PQSL_FSCIMPORTI_TIPO_CALCOLO = 21;
  public static int PQSL_FSCIMPORTI_PERC_MT = 22;
  public static int PQSL_FSCIMPORTI_RECIPROCO_MT = 23;
  public static int PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MT = 24;
  public static int PQSL_FSCIMPORTI_FONDO_ATTESO_MT = 25;
  public static int PQSL_FSCIMPORTI_PERC_APPLICATA_MT = 26;
  public static int PQSL_FSCIMPORTI_FONDO_CALCOLATO_MT = 27;
  public static int PQSL_FSCIMPORTI_PERC_MS = 28;
  public static int PQSL_FSCIMPORTI_RECIPROCO_MS = 29;
  public static int PQSL_FSCIMPORTI_RECIPROCO_RETTIF_MS = 30;
  public static int PQSL_FSCIMPORTI_FONDO_ATTESO_MS = 31;
  public static int PQSL_FSCIMPORTI_PREVISIONE = 32;
  public static int PQSL_FSCIMPORTI_FONDO_CALCOLATO_MS = 33;
  public static int PQSL_FSCIMPORTI_PERC_APPLICATA_MS = 34;
  public static int PQSL_FSCIMPORTI_ACCERTATO_RIV_PA = 35;
  public static int PQSL_FSCIMPORTI_INCASSATO_RIV_PA = 36;
  public static int PQSL_FSCIMPORTI_PERC_RIV_PA = 37;
  public static int PQSL_FSCIMPORTI_RECIPROCO_PA = 38;
  public static int PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PA = 39;
  public static int PQSL_FSCIMPORTI_FONDO_ATTESO_PA = 40;
  public static int PQSL_FSCIMPORTI_PERC_APPLICATA_PA = 41;
  public static int PQSL_FSCIMPORTI_FONDO_CALCOLATO_PA = 42;
  public static int PQSL_FSCIMPORTI_PERC_ACC_INC_RIV = 43;
  public static int PQSL_FSCIMPORTI_RECIPROCO_PR = 44;
  public static int PQSL_FSCIMPORTI_RECIPROCO_RETTIF_PR = 45;
  public static int PQSL_FSCIMPORTI_FONDO_ATTESO_PR = 46;
  public static int PQSL_FSCIMPORTI_PERC_APPLICATA_PR = 47;
  public static int PQSL_FSCIMPORTI_FONDO_CALCOLATO_PR = 48;
  public static int PQSL_FSCIMPORTI_FONDO_FINALE = 49;
  public static int PQSL_FSCIMPORTI_ACCANT_EFF_BILANCIO = 50;
  public static int PQSL_FSCIMPORTI_RECORDPREVIS = 51;
  public static int PQSL_FSCIMPORTI_RECORDPREVI2 = 52;
  public static int PQSL_FSCIMPORTI_RECORDPREVI3 = 53;
  public static int PQSL_FSCIMPORTI_ESERCIZIO_PLUR = 54;

  // Table to contain panel selected row: AD4 PROGETTI
  //
  public static int PQRY_AD4PROGETTI = 2336;
  public static int PQRY_AD4PROGETTI_RS = 2337;
  public static int PQSL_AD4PROGETTI_NOMOGGESEPLU = 0;

  // Table to contain panel selected row: FSC PERC REND
  //
  public static int PQRY_FSCPERCREND = 2338;
  public static int PQSL_FSCPERCREND_ESERCIZIO = 0;
  public static int PQSL_FSCPERCREND_TIPOLOGIA_CATEGORIA = 1;
  public static int PQSL_FSCPERCREND_CAPITOLO = 2;
  public static int PQSL_FSCPERCREND_ARTICOLO = 3;
  public static int PQSL_FSCPERCREND_DESCRIZIONE = 4;
  public static int PQSL_FSCPERCREND_DATA_RIACCERTAMENTO = 5;
  public static int PQSL_FSCPERCREND_ANNO_CONSUNTIVO = 6;
  public static int PQSL_FSCPERCREND_RES_ATTIVI_CONSUNTIVO = 7;
  public static int PQSL_FSCPERCREND_ECONOMIE_RES_ATTIVI = 8;
  public static int PQSL_FSCPERCREND_VAR_ESIG_RES_ATTIVI = 9;
  public static int PQSL_FSCPERCREND_TOT_VAR_NEGATIVE_RES_ATTIVI = 10;
  public static int PQSL_FSCPERCREND_PERC_RIDUZIONE_CALCOLATA = 11;
  public static int PQSL_FSCPERCREND_PERC_RIDUZIONE_APPLICATA = 12;
  public static int PQSL_FSCPERCREND_ORDINAMENTO = 13;
  public static int PQSL_FSCPERCREND_TITOLO = 14;

  // Table to contain panel selected row: FSC RESIDUI REND
  //
  public static int PQRY_FSCRESIDREND = 2339;
  public static int PQSL_FSCRESIDREND_ESERCIZIO = 0;
  public static int PQSL_FSCRESIDREND_TITOLO = 1;
  public static int PQSL_FSCRESIDREND_TIPOLOGIA_CATEGORIA = 2;
  public static int PQSL_FSCRESIDREND_CAPITOLO = 3;
  public static int PQSL_FSCRESIDREND_ARTICOLO = 4;
  public static int PQSL_FSCRESIDREND_DESCRIZIONE = 5;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT_M5 = 6;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTI_M5 = 7;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT_M4 = 8;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTI_M4 = 9;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT_M3 = 10;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTI_M3 = 11;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT_M2 = 12;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTI_M2 = 13;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT_M1 = 14;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTI_M1 = 15;
  public static int PQSL_FSCRESIDREND_TOT_RES_ATT = 16;
  public static int PQSL_FSCRESIDREND_TOT_RES_RIDOTTO = 17;
  public static int PQSL_FSCRESIDREND_ORDINAMENTO = 18;

  // Table to contain panel selected row: FSC IMPORTI REND
  //
  public static int PQRY_FSCIMPORREND = 2340;
  public static int PQSL_FSCIMPORREND_ESERCIZIO = 0;
  public static int PQSL_FSCIMPORREND_TIPOLOGIA_CATEGORIA = 1;
  public static int PQSL_FSCIMPORREND_CAPITOLO = 2;
  public static int PQSL_FSCIMPORREND_ARTICOLO = 3;
  public static int PQSL_FSCIMPORREND_DESCRIZIONE = 4;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_M5 = 5;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_M5 = 6;
  public static int PQSL_FSCIMPORREND_PERCENTUALE_M5 = 7;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_M4 = 8;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_M4 = 9;
  public static int PQSL_FSCIMPORREND_PERCENTUALE_M4 = 10;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_M3 = 11;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_M3 = 12;
  public static int PQSL_FSCIMPORREND_PERCENTUALE_M3 = 13;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_M2 = 14;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_M2 = 15;
  public static int PQSL_FSCIMPORREND_PERCENTUALE_M2 = 16;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_M1 = 17;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_M1 = 18;
  public static int PQSL_FSCIMPORREND_PERCENTUALE_M1 = 19;
  public static int PQSL_FSCIMPORREND_RESIDUI_FINALI_ESE = 20;
  public static int PQSL_FSCIMPORREND_TIPO_CALCOLO = 21;
  public static int PQSL_FSCIMPORREND_PERC_MS = 22;
  public static int PQSL_FSCIMPORREND_RECIPROCO_MS = 23;
  public static int PQSL_FSCIMPORREND_FONDO_ATTESO_MS = 24;
  public static int PQSL_FSCIMPORREND_RESIDUI_RIDOTTI_RIV_PA = 25;
  public static int PQSL_FSCIMPORREND_INCASSATO_RES_RIV_PA = 26;
  public static int PQSL_FSCIMPORREND_PERC_RIV_PA = 27;
  public static int PQSL_FSCIMPORREND_RECIPROCO_RIV_PA = 28;
  public static int PQSL_FSCIMPORREND_FONDO_ATTESO_PA = 29;
  public static int PQSL_FSCIMPORREND_PERC_INC_RES_ATT_RIV_PR = 30;
  public static int PQSL_FSCIMPORREND_RECIPROCO_PR = 31;
  public static int PQSL_FSCIMPORREND_FONDO_ATTESO_PR = 32;
  public static int PQSL_FSCIMPORREND_ORDINAMENTO = 33;
  public static int PQSL_FSCIMPORREND_TITOLO = 34;
  public static int PQSL_FSCIMPORREND_PERC_MT = 35;
  public static int PQSL_FSCIMPORREND_RECIPROCO_MT = 36;
  public static int PQSL_FSCIMPORREND_FONDO_ATTESO_MT = 37;
  public static int PQSL_FSCIMPORREND_PERC_ACCANTONAMENTO_MS = 38;
  public static int PQSL_FSCIMPORREND_FCDDE_APPLICATO_MS = 39;
  public static int PQSL_FSCIMPORREND_PERC_ACCANTONAMENTO_PA = 40;
  public static int PQSL_FSCIMPORREND_FCDDE_APPLICATO_PA = 41;
  public static int PQSL_FSCIMPORREND_PERC_ACCANTONAMENTO_PR = 42;
  public static int PQSL_FSCIMPORREND_FCDDE_APPLICATO_PR = 43;
  public static int PQSL_FSCIMPORREND_PERC_ACCANTONAMENTO_MT = 44;
  public static int PQSL_FSCIMPORREND_FCDDE_APPLICATO_MT = 45;
  public static int PQSL_FSCIMPORREND_IMPORTO_MINIMO_FONDO = 46;
  public static int PQSL_FSCIMPORREND_FONDO_CREDITI_DUBBIA_ESIG = 47;
  public static int PQSL_FSCIMPORREND_PERC_RIVALUTAZIONE = 48;
  public static int PQSL_FSCIMPORREND_RESIDUI_ESERCIZIO = 49;
  public static int PQSL_FSCIMPORREND_RESIDUI_ESERCIZI_PREC = 50;

  // Table to contain panel selected row: FSC IMPORTI GEST
  //
  public static int PQRY_FSCIMPORGES1 = 2341;
  public static int PQSL_FSCIMPORGES1_ESERCIZIO = 0;
  public static int PQSL_FSCIMPORGES1_FSCIMPGESTIT = 1;
  public static int PQSL_FSCIMPORGES1_TIPOLOGIA_CATEGORIA = 2;
  public static int PQSL_FSCIMPORGES1_CAPITOLO = 3;
  public static int PQSL_FSCIMPORGES1_ARTICOLO = 4;
  public static int PQSL_FSCIMPORGES1_DESCRIZIONE = 5;
  public static int PQSL_FSCIMPORGES1_PERC_BIL_PREV = 6;
  public static int PQSL_FSCIMPORGES1_STANZ_INI = 7;
  public static int PQSL_FSCIMPORGES1_STANZ_DEF = 8;
  public static int PQSL_FSCIMPORGES1_STANZ_DEF_BIL = 9;
  public static int PQSL_FSCIMPORGES1_ACCERTATO = 10;
  public static int PQSL_FSCIMPORGES1_INCASSATO = 11;
  public static int PQSL_FSCIMPORGES1_PERC_RECIPROCA = 12;
  public static int PQSL_FSCIMPORGES1_PERC_DA_APPLICARE = 13;
  public static int PQSL_FSCIMPORGES1_DATA_ESTRAZIONE = 14;
  public static int PQSL_FSCIMPORGES1_VARIAZIONI_PRO = 15;
  public static int PQSL_FSCIMPORGES1_NUOVO_FCDDE = 16;
  public static int PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO = 17;
  public static int PQSL_FSCIMPORGES1_NUOVO_FCDDE_ACCANTONATO = 18;
  public static int PQSL_FSCIMPORGES1_VAR_DA_APPLICARE = 19;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM175 = 2342;
  public static int PQRY_PARAM175_RS = 2343;
  public static int PQSL_PARAM175_NOMOGGDATEST = 0;
  public static int PQSL_PARAM175_NOMOGGCHEDAT = 1;
  public static int PQSL_PARAM175_NOOGLIDAESPR = 2;

  // Table to contain panel selected row: Parametri Info Accertato Fcdde
  //
  public static int PQRY_PARINFACCFC1 = 2344;
  public static int PQRY_PARINFACCFC1_RS = 2345;
  public static int PQSL_PARINFACCFC1_NOMEOGGEESER = 0;
  public static int PQSL_PARINFACCFC1_RECORDCAPITO = 1;
  public static int PQSL_PARINFACCFC1_NOMOGGTIPCAT = 2;
  public static int PQSL_PARINFACCFC1_NOMEOGGEDESC = 3;

  // Table to contain panel selected row: FSC DET ACCERTATO
  //
  public static int PQRY_FSCDETACCER1 = 2346;
  public static int PQSL_FSCDETACCER1_REFSDEACANAC = 0;
  public static int PQSL_FSCDETACCER1_REFSDEACNUAC = 1;
  public static int PQSL_FSCDETACCER1_RECORDIMPORT = 2;

  // Table to contain panel selected row: Parametri Info Incassato Fcdde
  //
  public static int PQRY_PARINFINCFC2 = 2347;
  public static int PQRY_PARINFINCFC2_RS = 2348;
  public static int PQSL_PARINFINCFC2_NOMEOGGEESER = 0;
  public static int PQSL_PARINFINCFC2_RECORDCAPITO = 1;
  public static int PQSL_PARINFINCFC2_NOMOGGTIPCAT = 2;
  public static int PQSL_PARINFINCFC2_NOMEOGGEDESC = 3;

  // Table to contain panel selected row: FSC DET ACCERTATO
  //
  public static int PQRY_FSCDETACCER2 = 2349;
  public static int PQSL_FSCDETACCER2_REFSDEINANOR = 0;
  public static int PQSL_FSCDETACCER2_REFSDEINNUOR = 1;
  public static int PQSL_FSCDETACCER2_RECFSCDEINIM = 2;

  // Table to contain panel selected row: Parametri Info Incassato Fcdde
  //
  public static int PQRY_PARINFINCFC1 = 2350;
  public static int PQRY_PARINFINCFC1_RS = 2351;
  public static int PQSL_PARINFINCFC1_NOMEOGGEESER = 0;
  public static int PQSL_PARINFINCFC1_RECORDCAPITO = 1;
  public static int PQSL_PARINFINCFC1_NOMOGGTIPCAT = 2;
  public static int PQSL_PARINFINCFC1_NOMEOGGEDESC = 3;

  // Table to contain panel selected row: FSC DET ACCERTATO
  //
  public static int PQRY_FSCDETACCERT = 2352;
  public static int PQSL_FSCDETACCERT_REFSDEINREAO = 0;
  public static int PQSL_FSCDETACCERT_REFSDEINRENO = 1;
  public static int PQSL_FSCDETACCERT_REFSDEINREIM = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI679 = 2353;
  public static int PQRY_PARAMETRI679_RS = 2354;
  public static int PQSL_PARAMETRI679_PARAPERCACCA = 0;
  public static int PQSL_PARAMETRI679_PARAPERCRIVA = 1;

  // Table to contain panel selected row: BIL TIPI CALC CASSA
  //
  public static int PQRY_BILTIPCALCAS = 2355;
  public static int PQSL_BILTIPCALCAS_TIPO = 0;
  public static int PQSL_BILTIPCALCAS_DESCRIZIONE = 1;
  public static int PQSL_BILTIPCALCAS_SE_PERCENTUALE = 2;
  public static int PQSL_BILTIPCALCAS_TIPO_DEFAULT = 3;

  // Table to contain panel selected row: BIL TIPI CALC CASSA CLASSIF
  //
  public static int PQRY_BILTIPCACACL = 2356;
  public static int PQSL_BILTIPCACACL_PROGRESSIVO = 0;
  public static int PQSL_BILTIPCACACL_ESERCIZIO = 1;
  public static int PQSL_BILTIPCACACL_E_S = 2;
  public static int PQSL_BILTIPCACACL_TITOLO = 3;
  public static int PQSL_BILTIPCACACL_TIPOLOGIA_MACROAGG = 4;
  public static int PQSL_BILTIPCACACL_TIPO_CALCOLO = 5;
  public static int PQSL_BILTIPCACACL_UTENTE_INSERIMENTO = 6;
  public static int PQSL_BILTIPCACACL_DATA_INSERIMENTO = 7;
  public static int PQSL_BILTIPCACACL_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_BILTIPCACACL_DATA_ULTIMO_AGG = 9;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM130 = 2357;
  public static int PQRY_PARAM130_RS = 2358;
  public static int PQSL_PARAM130_PARAMPARTE = 0;

  // Table to contain panel selected row: BIL PERCENTUALI CALC STN
  //
  public static int PQRY_BILPERCALST1 = 2359;
  public static int PQSL_BILPERCALST1_PROGRESSIVO = 0;
  public static int PQSL_BILPERCALST1_ESERCIZIO = 1;
  public static int PQSL_BILPERCALST1_E_S = 2;
  public static int PQSL_BILPERCALST1_LIVELLO_1 = 3;
  public static int PQSL_BILPERCALST1_LIVELLO_2 = 4;
  public static int PQSL_BILPERCALST1_LIVELLO_3 = 5;
  public static int PQSL_BILPERCALST1_LIVELLO_4 = 6;
  public static int PQSL_BILPERCALST1_LIVELLO_5 = 7;
  public static int PQSL_BILPERCALST1_CAPITOLO = 8;
  public static int PQSL_BILPERCALST1_ARTICOLO = 9;
  public static int PQSL_BILPERCALST1_UTENTE_INSERIMENTO = 10;
  public static int PQSL_BILPERCALST1_DATA_INSERIMENTO = 11;
  public static int PQSL_BILPERCALST1_UTENTE_ULTIMO_AGG = 12;
  public static int PQSL_BILPERCALST1_DATA_ULTIMO_AGG = 13;
  public static int PQSL_BILPERCALST1_PERCENTUALE_COMP = 14;
  public static int PQSL_BILPERCALST1_PERCENTUALE_CASSA = 15;

  // Table to contain panel selected row: BIL PERCENTUALI CALC STN
  //
  public static int PQRY_BILPERCALSTN = 2360;
  public static int PQSL_BILPERCALSTN_PROGRESSIVO = 0;
  public static int PQSL_BILPERCALSTN_ESERCIZIO = 1;
  public static int PQSL_BILPERCALSTN_E_S = 2;
  public static int PQSL_BILPERCALSTN_LIVELLO_1 = 3;
  public static int PQSL_BILPERCALSTN_LIVELLO_2 = 4;
  public static int PQSL_BILPERCALSTN_LIVELLO_3 = 5;
  public static int PQSL_BILPERCALSTN_LIVELLO_4 = 6;
  public static int PQSL_BILPERCALSTN_LIVELLO_5 = 7;
  public static int PQSL_BILPERCALSTN_CAPITOLO = 8;
  public static int PQSL_BILPERCALSTN_ARTICOLO = 9;
  public static int PQSL_BILPERCALSTN_PERCENTUALE_COMP = 10;
  public static int PQSL_BILPERCALSTN_PERCENTUALE_CASSA = 11;
  public static int PQSL_BILPERCALSTN_UTENTE_INSERIMENTO = 12;
  public static int PQSL_BILPERCALSTN_DATA_INSERIMENTO = 13;
  public static int PQSL_BILPERCALSTN_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_BILPERCALSTN_DATA_ULTIMO_AGG = 15;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM132 = 2361;
  public static int PQRY_PARAM132_RS = 2362;
  public static int PQSL_PARAM132_PARAMESERCIZ = 0;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT8 = 2363;
  public static int PQRY_OUT8_RS = 2364;
  public static int PQSL_OUT8_ESERCIZIO = 0;
  public static int PQSL_OUT8_ESE_RIF = 1;
  public static int PQSL_OUT8_ROWNAMTIDIBI = 2;
  public static int PQSL_OUT8_ROWNAMSTDICO = 3;
  public static int PQSL_OUT8_ROWNAMSODABI = 4;
  public static int PQSL_OUT8_ROWNAMSOLFIN = 5;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT14 = 2365;
  public static int PQRY_OUT14_RS = 2366;
  public static int PQSL_OUT14_ESE_DA_GEN = 0;
  public static int PQSL_OUT14_ESE_RIF = 1;
  public static int PQSL_OUT14_ESERCIZIO = 2;
  public static int PQSL_OUT14_ROWNAMSTAPUR = 3;
  public static int PQSL_OUT14_ROWNAMPASTPU = 4;
  public static int PQSL_OUT14_ROWNAMRESPRE = 5;
  public static int PQSL_OUT14_ROWNAMPAREPR = 6;
  public static int PQSL_OUT14_ROWNAMTIREPR = 7;
  public static int PQSL_OUT14_ROWNAMSTACAS = 8;
  public static int PQSL_OUT14_ROWNAMPASTCA = 9;
  public static int PQSL_OUT14_ROWNAMSTDAES = 10;
  public static int PQSL_OUT14_RONAPASTDAES = 11;
  public static int PQSL_OUT14_ROWNAMSTDACR = 12;
  public static int PQSL_OUT14_ROWNAMFOPLVI = 13;
  public static int PQSL_OUT14_ROWNAMGIAIMP = 14;
  public static int PQSL_OUT14_ROWNAMPRESPR = 15;
  public static int PQSL_OUT14_RONAPAPRESPR = 16;
  public static int PQSL_OUT14_RONAPRCAESPR = 17;
  public static int PQSL_OUT14_RONAPAPRCAEP = 18;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO18 = 2367;
  public static int PQSL_NOTEFUNZIO18_MODULO = 0;
  public static int PQSL_NOTEFUNZIO18_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO18_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO18_DESCRIZIONE = 3;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT12 = 2368;
  public static int PQRY_OUT12_RS = 2369;
  public static int PQSL_OUT12_ESE_DA_GEN = 0;
  public static int PQSL_OUT12_ESE_RIF = 1;
  public static int PQSL_OUT12_ESERCIZIO = 2;
  public static int PQSL_OUT12_ROWNAMSTAPUR = 3;
  public static int PQSL_OUT12_ROWNAMPASTPU = 4;
  public static int PQSL_OUT12_ROWNAMCANVAR = 5;
  public static int PQSL_OUT12_ROWNAMINSBIL = 6;
  public static int PQSL_OUT12_ROWNAMRESPRE = 7;
  public static int PQSL_OUT12_ROWNAMPAREPR = 8;
  public static int PQSL_OUT12_ROWNAMTIREPR = 9;
  public static int PQSL_OUT12_ROWNAMSTACAS = 10;
  public static int PQSL_OUT12_ROWNAMPASTCA = 11;
  public static int PQSL_OUT12_ROWNAMGIAIMP = 12;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION7 = 2370;
  public static int PQSL_NOTEFUNZION7_MODULO = 0;
  public static int PQSL_NOTEFUNZION7_PAGINA = 1;
  public static int PQSL_NOTEFUNZION7_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION7_DESCRIZIONE = 3;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT10 = 2371;
  public static int PQRY_OUT10_RS = 2372;
  public static int PQSL_OUT10_ESE_DA_GEN = 0;
  public static int PQSL_OUT10_ESERCIZIO = 1;
  public static int PQSL_OUT10_ROWNAMSTACOM = 2;
  public static int PQSL_OUT10_ROWNAMRESPRE = 3;
  public static int PQSL_OUT10_ROWNAMSTACAS = 4;
  public static int PQSL_OUT10_ROWNAMGIAIMP = 5;
  public static int PQSL_OUT10_ROWNAMPRESPR = 6;
  public static int PQSL_OUT10_RONAPRCAESPR = 7;
  public static int PQSL_OUT10_ROWNAMDAAPBI = 8;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT1 = 2373;
  public static int PQRY_OUT1_RS = 2374;
  public static int PQSL_OUT1_ROWNAMNUOBIL = 0;
  public static int PQSL_OUT1_ROWNAMESERIF = 1;
  public static int PQSL_OUT1_ROWNAMEPLURI = 2;
  public static int PQSL_OUT1_RONADABIEFSI = 3;
  public static int PQSL_OUT1_ROWNAMEDAESE = 4;
  public static int PQSL_OUT1_ROWNAMSTAAZE = 5;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT2 = 2375;
  public static int PQRY_OUT2_RS = 2376;
  public static int PQSL_OUT2_ROWNAMDABISI = 0;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT4 = 2377;
  public static int PQRY_OUT4_RS = 2378;
  public static int PQSL_OUT4_RONAIMACULEC = 0;
  public static int PQSL_OUT4_RONAPRDEESPR = 1;
  public static int PQSL_OUT4_ROWNAMSTAINI = 2;
  public static int PQSL_OUT4_ROWNAMEIMPEG = 3;
  public static int PQSL_OUT4_RONAAGBIDRPF = 4;
  public static int PQSL_OUT4_RONAPADPABDE = 5;
  public static int PQSL_OUT4_RONAPABISISE = 6;
  public static int PQSL_OUT4_RONARIIATUEC = 7;
  public static int PQSL_OUT4_RONARIPRDEEP = 8;
  public static int PQSL_OUT4_ROWNAMRISTIN = 9;
  public static int PQSL_OUT4_RONARISTSUBP = 10;
  public static int PQSL_OUT4_RONASUBIEFSI = 11;
  public static int PQSL_OUT4_RONASUBIEFS1 = 12;
  public static int PQSL_OUT4_RONASUBIEFS2 = 13;
  public static int PQSL_OUT4_RONASUBIEFS3 = 14;
  public static int PQSL_OUT4_RONASUBIEFS4 = 15;
  public static int PQSL_OUT4_ROWNAMRIREPR = 16;
  public static int PQSL_OUT4_RONAREPREFSI = 17;
  public static int PQSL_OUT4_RONAREPRPAES = 18;
  public static int PQSL_OUT4_RONAREPRRE3A = 19;
  public static int PQSL_OUT4_ROWNAMRISTCA = 20;
  public static int PQSL_OUT4_RONASTCASBES = 21;
  public static int PQSL_OUT4_RONASTCAPAES = 22;
  public static int PQSL_OUT4_ROWNAMRIGIIM = 23;
  public static int PQSL_OUT4_RONAGIIMSBES = 24;

  // Table to contain panel selected row: ESEIMP
  //
  public static int PQRY_ESEIMP1 = 2379;
  public static int PQSL_ESEIMP1_CAPITOLO = 0;
  public static int PQSL_ESEIMP1_ARTICOLO = 1;
  public static int PQSL_ESEIMP1_RECORDIMPEGN = 2;
  public static int PQSL_ESEIMP1_RECORDSTANZI = 3;
  public static int PQSL_ESEIMP1_DIFFERENZA = 4;

  // Table to contain panel selected row: OUT
  //
  public static int PQRY_OUT6 = 2380;
  public static int PQRY_OUT6_RS = 2381;
  public static int PQSL_OUT6_ROWNAMDATRIE = 0;
  public static int PQSL_OUT6_ROWNAMRIEACC = 1;
  public static int PQSL_OUT6_ROWNAMRIEIMP = 2;
  public static int PQSL_OUT6_ROWNAMRIESUB = 3;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS40 = 2382;
  public static int PQRY_PARS40_RS = 2383;
  public static int PQSL_PARS40_NOMOGGESEPLU = 0;
  public static int PQSL_PARS40_NOMOGGTIPSCH = 1;
  public static int PQSL_PARS40_NOMOGGUNIORG = 2;
  public static int PQSL_PARS40_NOMEOGGECAPI = 3;
  public static int PQSL_PARS40_NOMEOGGEARTI = 4;
  public static int PQSL_PARS40_NOMEOGGEMISS = 5;
  public static int PQSL_PARS40_NOMEOGGEPROG = 6;
  public static int PQSL_PARS40_NOMEOGGEMACR = 7;
  public static int PQSL_PARS40_NOMOGGTITENT = 8;
  public static int PQSL_PARS40_NOMEOGGETIPO = 9;
  public static int PQSL_PARS40_NOMOGGTITSPE = 10;
  public static int PQSL_PARS40_NOMOGGSOBIPR = 11;
  public static int PQSL_PARS40_NOMOGGTIPBIL = 12;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI483 = 2384;
  public static int PQRY_PARAMETRI483_RS = 2385;
  public static int PQSL_PARAMETRI483_PARAMESERCIZ = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI484 = 2386;
  public static int PQRY_PARAMETRI484_RS = 2387;
  public static int PQSL_PARAMETRI484_PARAMESERCIZ = 0;

  // Table to contain panel selected row: Esercizi Finanziari
  //
  public static int PQRY_ESERCIFINAN2 = 2388;
  public static int PQSL_ESERCIFINAN2_ESERCIZIO = 0;
  public static int PQSL_ESERCIFINAN2_TIPO_STAMPE_PREV = 1;
  public static int PQSL_ESERCIFINAN2_DATA_RIS_AMM_PRESUNTO = 2;
  public static int PQSL_ESERCIFINAN2_DATA_COMPOSIZIONE_FPV = 3;
  public static int PQSL_ESERCIFINAN2_PRIMO_ESERC_PREVENTIVO = 4;
  public static int PQSL_ESERCIFINAN2_SEDE_DEL_RIACC = 5;
  public static int PQSL_ESERCIFINAN2_NUMERO_DEL_RIACC = 6;
  public static int PQSL_ESERCIFINAN2_ANNO_DEL_RIACC = 7;
  public static int PQSL_ESERCIFINAN2_NUMERO_DEL_APP_PREV = 8;
  public static int PQSL_ESERCIFINAN2_TIPO_DEL_APP_PREV = 9;
  public static int PQSL_ESERCIFINAN2_DATA_DEL_APP_PREV = 10;
  public static int PQSL_ESERCIFINAN2_ESERCIZIO_PARAMETRI_DEF_PREV = 11;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM167 = 2389;
  public static int PQRY_PARAM167_RS = 2390;
  public static int PQSL_PARAM167_PARAPROGSTAM = 0;
  public static int PQSL_PARAM167_PARSTANUDIPA = 1;
  public static int PQSL_PARAM167_PARAMFONTE = 2;
  public static int PQSL_PARAM167_PARASTAMSALV = 3;
  public static int PQSL_PARAM167_PARASALVSTAM = 4;
  public static int PQSL_PARAM167_PARANOTESTAM = 5;
  public static int PQSL_PARAM167_PARAMESERCIZ = 6;
  public static int PQSL_PARAM167_PARAESEDISTA = 7;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM153 = 2391;
  public static int PQRY_PARAM153_RS = 2392;
  public static int PQSL_PARAM153_PARAPROGSTAM = 0;
  public static int PQSL_PARAM153_PARSTANUDIPA = 1;

  // Table to contain panel selected row: BIL PREV EQUILIBRI
  //
  public static int PQRY_BILPREVEQUI1 = 2393;
  public static int PQSL_BILPREVEQUI1_ESERCIZIO = 0;
  public static int PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_PREC = 1;
  public static int PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_1 = 2;
  public static int PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_2 = 3;
  public static int PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_3 = 4;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM21 = 2394;
  public static int PQRY_PARAM21_RS = 2395;
  public static int PQSL_PARAM21_NOMEOGGEDATA = 0;
  public static int PQSL_PARAM21_NOMEOGGEENTR = 1;
  public static int PQSL_PARAM21_NOMEOGGEUSCI = 2;
  public static int PQSL_PARAM21_NOMOGGVAREAT = 3;
  public static int PQSL_PARAM21_NOMOGGVAREPA = 4;
  public static int PQSL_PARAM21_NOMEOGGETFPV = 5;
  public static int PQSL_PARAM21_NOMOGGAVAFSC = 6;
  public static int PQSL_PARAM21_NOMOGGPAVICO = 7;
  public static int PQSL_PARAM21_NOMOGGPAVIIN = 8;
  public static int PQSL_PARAM21_NOMOGGPADICO = 9;
  public static int PQSL_PARAM21_NOMOGGPADIIN = 10;
  public static int PQSL_PARAM21_NOMOGGPANOUT = 11;

  // Table to contain panel selected row: BIL PREV RIS AMM PRES
  //
  public static int PQRY_BILPRERIAMP1 = 2396;
  public static int PQSL_BILPRERIAMP1_ESERCIZIO = 0;
  public static int PQSL_BILPRERIAMP1_ENTRATE_PRESUNTE = 1;
  public static int PQSL_BILPRERIAMP1_SPESE_PRESUNTE = 2;
  public static int PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI_NEG = 3;
  public static int PQSL_BILPRERIAMP1_VAR_RES_ATTIVI_PRESUNTI = 4;
  public static int PQSL_BILPRERIAMP1_VAR_RES_PASSIVI_PRESUNTI = 5;
  public static int PQSL_BILPRERIAMP1_FPV = 6;
  public static int PQSL_BILPRERIAMP1_FONDO_CRED_DUBBIA_ESIG = 7;
  public static int PQSL_BILPRERIAMP1_FONDI_RISERVA = 8;
  public static int PQSL_BILPRERIAMP1_FONDI_SPECIALI = 9;
  public static int PQSL_BILPRERIAMP1_FONDI_RINNOVI_CONTR = 10;
  public static int PQSL_BILPRERIAMP1_FONDO_AMM_TITOLI = 11;
  public static int PQSL_BILPRERIAMP1_ALTRI_FONDI_NAC = 12;
  public static int PQSL_BILPRERIAMP1_VINCOLI_DA_LEGGI = 13;
  public static int PQSL_BILPRERIAMP1_VINCOLI_DA_TRASF = 14;
  public static int PQSL_BILPRERIAMP1_VINCOLI_DA_MUTUI = 15;
  public static int PQSL_BILPRERIAMP1_VINCOLI_ATTR_ENTE = 16;
  public static int PQSL_BILPRERIAMP1_VINCOLI_ALTRI = 17;
  public static int PQSL_BILPRERIAMP1_TOT_DESTINATO_INV = 18;
  public static int PQSL_BILPRERIAMP1_UTIL_VINC_DA_LEGGI = 19;
  public static int PQSL_BILPRERIAMP1_UTIL_VINC_DA_TRASF = 20;
  public static int PQSL_BILPRERIAMP1_UTIL_VINC_DA_MUTUI = 21;
  public static int PQSL_BILPRERIAMP1_UTIL_VINC_ATTR_ENTE = 22;
  public static int PQSL_BILPRERIAMP1_UTIL_VINC_ALTRI = 23;
  public static int PQSL_BILPRERIAMP1_RIS_AMM_ESE_PREC = 24;
  public static int PQSL_BILPRERIAMP1_FPV_ESERC_PREC = 25;

  // Table to contain panel selected row: BIL PREV RIS AMM PRES
  //
  public static int PQRY_BILPRERIAMPR = 2397;
  public static int PQSL_BILPRERIAMPR_ESERCIZIO = 0;
  public static int PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN = 1;
  public static int PQSL_BILPRERIAMPR_INTERESSI_1 = 2;
  public static int PQSL_BILPRERIAMPR_INTERESSI_2 = 3;
  public static int PQSL_BILPRERIAMPR_CONTRIBUTI = 4;
  public static int PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI = 5;
  public static int PQSL_BILPRERIAMPR_DEBITO_CONTRATTO = 6;
  public static int PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO = 7;
  public static int PQSL_BILPRERIAMPR_GARANZIE = 8;
  public static int PQSL_BILPRERIAMPR_GARANZIE_ACCANT = 9;
  public static int PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB = 10;
  public static int PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P1 = 11;
  public static int PQSL_BILPRERIAMPR_INTERESSI_1_P1 = 12;
  public static int PQSL_BILPRERIAMPR_INTERESSI_2_P1 = 13;
  public static int PQSL_BILPRERIAMPR_CONTRIBUTI_P1 = 14;
  public static int PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P1 = 15;
  public static int PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P1 = 16;
  public static int PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P1 = 17;
  public static int PQSL_BILPRERIAMPR_GARANZIE_P1 = 18;
  public static int PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P1 = 19;
  public static int PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P1 = 20;
  public static int PQSL_BILPRERIAMPR_LIV_MAX_SPESE_ANN_P2 = 21;
  public static int PQSL_BILPRERIAMPR_INTERESSI_1_P2 = 22;
  public static int PQSL_BILPRERIAMPR_INTERESSI_2_P2 = 23;
  public static int PQSL_BILPRERIAMPR_CONTRIBUTI_P2 = 24;
  public static int PQSL_BILPRERIAMPR_INTERESSI_ESCLUSI_P2 = 25;
  public static int PQSL_BILPRERIAMPR_DEBITO_CONTRATTO_P2 = 26;
  public static int PQSL_BILPRERIAMPR_DEBITO_AUTORIZZATO_P2 = 27;
  public static int PQSL_BILPRERIAMPR_GARANZIE_P2 = 28;
  public static int PQSL_BILPRERIAMPR_GARANZIE_ACCANT_P2 = 29;
  public static int PQSL_BILPRERIAMPR_GARANZIE_LIMITE_INDEB_P2 = 30;
  public static int PQSL_BILPRERIAMPR_CALCOLO_COMP_E_P1 = 31;

  // Table to contain panel selected row: BIL ACC FCDDE
  //
  public static int PQRY_BILACCFCDDE1 = 2398;
  public static int PQSL_BILACCFCDDE1_ESERCIZIO = 0;
  public static int PQSL_BILACCFCDDE1_ESERCIZIO_PLUR = 1;
  public static int PQSL_BILACCFCDDE1_STN_10101 = 2;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_10101 = 3;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_10101 = 4;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_10101 = 5;
  public static int PQSL_BILACCFCDDE1_STN_UE_20105 = 6;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_UE_20105 = 7;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105 = 8;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_UE_20105 = 9;
  public static int PQSL_BILACCFCDDE1_STN_MONDO_20105 = 10;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_MONDO_20105 = 11;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105 = 12;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_MONDO_20105 = 13;
  public static int PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200 = 14;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_PA_40200 = 15;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200 = 16;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_PA_40200 = 17;
  public static int PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200 = 18;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_UE_40200 = 19;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200 = 20;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_UE_40200 = 21;
  public static int PQSL_BILACCFCDDE1_STN_TRASF_PA_40300 = 22;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_PA_40300 = 23;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300 = 24;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_PA_40300 = 25;
  public static int PQSL_BILACCFCDDE1_STN_TRASF_UE_40300 = 26;
  public static int PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_UE_40300 = 27;
  public static int PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300 = 28;
  public static int PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_UE_40300 = 29;

  // Table to contain panel selected row: IMDB
  //
  public static int PQRY_IMDB3 = 2399;
  public static int PQRY_IMDB3_RS = 2400;
  public static int PQSL_IMDB3_NOMOGGTIPSTA = 0;
  public static int PQSL_IMDB3_NOMOGGRESEFF = 1;

  // Table to contain panel selected row: BIL PREV EQUILIBRI
  //
  public static int PQRY_BILPREVEQUIL = 2401;
  public static int PQSL_BILPREVEQUIL_ESERCIZIO = 0;
  public static int PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_1 = 1;
  public static int PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_2 = 2;
  public static int PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_3 = 3;
  public static int PQSL_BILPREVEQUIL_FPV_TITOLO3 = 4;
  public static int PQSL_BILPREVEQUIL_FPV_TITOLO3_1 = 5;
  public static int PQSL_BILPREVEQUIL_FPV_TITOLO3_2 = 6;
  public static int PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_1 = 7;
  public static int PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_2 = 8;
  public static int PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_3 = 9;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI657 = 2402;
  public static int PQRY_PARAMETRI657_RS = 2403;
  public static int PQSL_PARAMETRI657_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI657_ROWNAMSEDDEL = 1;
  public static int PQSL_PARAMETRI657_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMETRI657_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMETRI657_ROWNAMUNIPRO = 4;
  public static int PQSL_PARAMETRI657_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAMETRI657_ROWNAMANNPRO = 6;
  public static int PQSL_PARAMETRI657_ROWNAMDATELA = 7;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUI3 = 2404;
  public static int PQSL_BILCONSEQUI3_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUI3_FPV_TITOLO3 = 1;
  public static int PQSL_BILCONSEQUI3_FPV_TITOLO3_1 = 2;
  public static int PQSL_BILCONSEQUI3_FPV_TITOLO3_2 = 3;
  public static int PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_1 = 4;
  public static int PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_2 = 5;
  public static int PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_3 = 6;
  public static int PQSL_BILCONSEQUI3_E_S = 7;

  // Table to contain panel selected row: BIL CONS EQUILIBRI
  //
  public static int PQRY_BILCONSEQUI2 = 2405;
  public static int PQSL_BILCONSEQUI2_ESERCIZIO = 0;
  public static int PQSL_BILCONSEQUI2_IMPORTO_AA = 1;
  public static int PQSL_BILCONSEQUI2_IMPORTO_B_EST = 2;
  public static int PQSL_BILCONSEQUI2_IMPORTO_F_EST = 3;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H = 4;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H_EST = 5;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I = 6;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I_EST = 7;
  public static int PQSL_BILCONSEQUI2_IMPORTO_L = 8;
  public static int PQSL_BILCONSEQUI2_IMPORTO_M = 9;
  public static int PQSL_BILCONSEQUI2_IMPORTO_P = 10;
  public static int PQSL_BILCONSEQUI2_IMPORTO_AA_1 = 11;
  public static int PQSL_BILCONSEQUI2_IMPORTO_AA_2 = 12;
  public static int PQSL_BILCONSEQUI2_IMPORTO_B_EST_1 = 13;
  public static int PQSL_BILCONSEQUI2_IMPORTO_B_EST_2 = 14;
  public static int PQSL_BILCONSEQUI2_IMPORTO_F_EST_1 = 15;
  public static int PQSL_BILCONSEQUI2_IMPORTO_F_EST_2 = 16;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H_1 = 17;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H_2 = 18;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H_EST_1 = 19;
  public static int PQSL_BILCONSEQUI2_IMPORTO_H_EST_2 = 20;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I_1 = 21;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I_2 = 22;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I_EST_1 = 23;
  public static int PQSL_BILCONSEQUI2_IMPORTO_I_EST_2 = 24;
  public static int PQSL_BILCONSEQUI2_IMPORTO_L_1 = 25;
  public static int PQSL_BILCONSEQUI2_IMPORTO_L_2 = 26;
  public static int PQSL_BILCONSEQUI2_IMPORTO_M_1 = 27;
  public static int PQSL_BILCONSEQUI2_IMPORTO_M_2 = 28;
  public static int PQSL_BILCONSEQUI2_IMPORTO_P_1 = 29;
  public static int PQSL_BILCONSEQUI2_IMPORTO_P_2 = 30;
  public static int PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_1 = 31;
  public static int PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_2 = 32;
  public static int PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_3 = 33;
  public static int PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_1 = 34;
  public static int PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_2 = 35;
  public static int PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_3 = 36;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI529 = 2406;
  public static int PQRY_PARAMETRI529_RS = 2407;
  public static int PQSL_PARAMETRI529_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI529_ROWNAMSEDDEL = 1;
  public static int PQSL_PARAMETRI529_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMETRI529_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMETRI529_ROWNAMUNIPRO = 4;
  public static int PQSL_PARAMETRI529_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAMETRI529_ROWNAMANNPRO = 6;
  public static int PQSL_PARAMETRI529_ROWNAMDATELA = 7;

  // Table to contain panel selected row: BIL PREV EQUILIBRI VAR
  //
  public static int PQRY_BILPREEQUVAR = 2408;
  public static int PQSL_BILPREEQUVAR_ESERCIZIO = 0;
  public static int PQSL_BILPREEQUVAR_E_S = 1;
  public static int PQSL_BILPREEQUVAR_IMPORTO_AA1 = 2;
  public static int PQSL_BILPREEQUVAR_IMPORTO_AA2 = 3;
  public static int PQSL_BILPREEQUVAR_IMPORTO_AA3 = 4;
  public static int PQSL_BILPREEQUVAR_IMPORTO_B1 = 5;
  public static int PQSL_BILPREEQUVAR_IMPORTO_B2 = 6;
  public static int PQSL_BILPREEQUVAR_IMPORTO_B3 = 7;
  public static int PQSL_BILPREEQUVAR_IMPORTO_F1 = 8;
  public static int PQSL_BILPREEQUVAR_IMPORTO_F2 = 9;
  public static int PQSL_BILPREEQUVAR_IMPORTO_F3 = 10;
  public static int PQSL_BILPREEQUVAR_IMPORTO_H1 = 11;
  public static int PQSL_BILPREEQUVAR_IMPORTO_H2 = 12;
  public static int PQSL_BILPREEQUVAR_IMPORTO_H3 = 13;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I1 = 14;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I2 = 15;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I3 = 16;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I21 = 17;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I22 = 18;
  public static int PQSL_BILPREEQUVAR_IMPORTO_I23 = 19;
  public static int PQSL_BILPREEQUVAR_IMPORTO_L1 = 20;
  public static int PQSL_BILPREEQUVAR_IMPORTO_L2 = 21;
  public static int PQSL_BILPREEQUVAR_IMPORTO_L3 = 22;
  public static int PQSL_BILPREEQUVAR_IMPORTO_M1 = 23;
  public static int PQSL_BILPREEQUVAR_IMPORTO_M2 = 24;
  public static int PQSL_BILPREEQUVAR_IMPORTO_M3 = 25;
  public static int PQSL_BILPREEQUVAR_IMPORTO_G1 = 26;
  public static int PQSL_BILPREEQUVAR_IMPORTO_G2 = 27;
  public static int PQSL_BILPREEQUVAR_IMPORTO_G3 = 28;
  public static int PQSL_BILPREEQUVAR_IMPORTO_P1 = 29;
  public static int PQSL_BILPREEQUVAR_IMPORTO_P2 = 30;
  public static int PQSL_BILPREEQUVAR_IMPORTO_P3 = 31;
  public static int PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_1 = 32;
  public static int PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_2 = 33;
  public static int PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_3 = 34;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI567 = 2409;
  public static int PQRY_PARAMETRI567_RS = 2410;
  public static int PQSL_PARAMETRI567_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI567_ROWNAMSEDDEL = 1;
  public static int PQSL_PARAMETRI567_ROWNAMNUMDEL = 2;
  public static int PQSL_PARAMETRI567_ROWNAMANNDEL = 3;
  public static int PQSL_PARAMETRI567_ROWNAMUNIPRO = 4;
  public static int PQSL_PARAMETRI567_ROWNAMNUMPRO = 5;
  public static int PQSL_PARAMETRI567_ROWNAMANNPRO = 6;
  public static int PQSL_PARAMETRI567_ROWNAMDATELA = 7;

  // Table to contain panel selected row: BIL PREV VERIFICA VINCOLI
  //
  public static int PQRY_BILPREVERVIN = 2411;
  public static int PQSL_BILPREVERVIN_ESERCIZIO = 0;
  public static int PQSL_BILPREVERVIN_TIPO_STAMPA = 1;
  public static int PQSL_BILPREVERVIN_IMPORTO_B = 2;
  public static int PQSL_BILPREVERVIN_IMPORTO_D2 = 3;
  public static int PQSL_BILPREVERVIN_IMPORTO_I3 = 4;
  public static int PQSL_BILPREVERVIN_IMPORTO_I3_1 = 5;
  public static int PQSL_BILPREVERVIN_IMPORTO_I3_2 = 6;
  public static int PQSL_BILPREVERVIN_IMPORTO_I4 = 7;
  public static int PQSL_BILPREVERVIN_IMPORTO_I4_1 = 8;
  public static int PQSL_BILPREVERVIN_IMPORTO_I4_2 = 9;
  public static int PQSL_BILPREVERVIN_IMPORTO_I5 = 10;
  public static int PQSL_BILPREVERVIN_IMPORTO_I5_1 = 11;
  public static int PQSL_BILPREVERVIN_IMPORTO_I5_2 = 12;
  public static int PQSL_BILPREVERVIN_IMPORTO_I6 = 13;
  public static int PQSL_BILPREVERVIN_IMPORTO_I7 = 14;
  public static int PQSL_BILPREVERVIN_IMPORTO_L2 = 15;
  public static int PQSL_BILPREVERVIN_IMPORTO_L3 = 16;
  public static int PQSL_BILPREVERVIN_IMPORTO_L3_1 = 17;
  public static int PQSL_BILPREVERVIN_IMPORTO_L3_2 = 18;
  public static int PQSL_BILPREVERVIN_IMPORTO_L4 = 19;
  public static int PQSL_BILPREVERVIN_IMPORTO_L4_1 = 20;
  public static int PQSL_BILPREVERVIN_IMPORTO_L4_2 = 21;
  public static int PQSL_BILPREVERVIN_IMPORTO_L5 = 22;
  public static int PQSL_BILPREVERVIN_IMPORTO_L6 = 23;
  public static int PQSL_BILPREVERVIN_IMPORTO_L7 = 24;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1 = 25;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_1 = 26;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_2 = 27;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2 = 28;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_1 = 29;
  public static int PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_2 = 30;
  public static int PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA1 = 31;
  public static int PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2 = 32;
  public static int PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2_1 = 33;
  public static int PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA1 = 34;
  public static int PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2 = 35;
  public static int PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2_1 = 36;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI521 = 2412;
  public static int PQRY_PARAMETRI521_RS = 2413;
  public static int PQSL_PARAMETRI521_ROWNAMEVARIA = 0;
  public static int PQSL_PARAMETRI521_ROWNAMUNIPRO = 1;
  public static int PQSL_PARAMETRI521_ROWNAMNUMPRO = 2;
  public static int PQSL_PARAMETRI521_ROWNAMANNPRO = 3;
  public static int PQSL_PARAMETRI521_ROWNAMDATELA = 4;

  // Table to contain panel selected row: ESEFIN
  //
  public static int PQRY_ESEFIN = 2414;
  public static int PQSL_ESEFIN_RECESEPADEPR = 0;
  public static int PQSL_ESEFIN_ESERCIZIO = 1;

  // Table to contain panel selected row: PARAMETRI DEF PREV VALORI
  //
  public static int PQRY_PARDEFPREVAL = 2415;
  public static int PQSL_PARDEFPREVAL_ESERCIZIO = 0;
  public static int PQSL_PARDEFPREVAL_PARAMETRO = 1;
  public static int PQSL_PARDEFPREVAL_DESCRIZIONE = 2;
  public static int PQSL_PARDEFPREVAL_SEGNO_POSITIVITA = 3;
  public static int PQSL_PARDEFPREVAL_VALORE = 4;
  public static int PQSL_PARDEFPREVAL_SOGLIA = 5;
  public static int PQSL_PARDEFPREVAL_POSITIVO_NEGATIVO = 6;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA5 = 2416;
  public static int PQSL_PARBILALRIA5_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA5_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA5_ESERCIZIO = 2;
  public static int PQSL_PARBILALRIA5_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRIA5_S = 4;
  public static int PQSL_PARBILALRIA5_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRIA5_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA5_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA5_E = 8;
  public static int PQSL_PARBILALRIA5_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA5_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA5_IMPORTO_1 = 11;
  public static int PQSL_PARBILALRIA5_IMPORTO_2 = 12;
  public static int PQSL_PARBILALRIA5_IMPORTO_3 = 13;
  public static int PQSL_PARBILALRIA5_IMPORTO_4 = 14;
  public static int PQSL_PARBILALRIA5_IMPORTO_5 = 15;
  public static int PQSL_PARBILALRIA5_IMPORTO_6 = 16;
  public static int PQSL_PARBILALRIA5_IMPORTO_7 = 17;
  public static int PQSL_PARBILALRIA5_PABIALRIAMOR = 18;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA6 = 2417;
  public static int PQSL_PARBILALRIA6_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA6_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA6_ESERCIZIO = 2;
  public static int PQSL_PARBILALRIA6_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRIA6_S = 4;
  public static int PQSL_PARBILALRIA6_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRIA6_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRIA6_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRIA6_E = 8;
  public static int PQSL_PARBILALRIA6_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRIA6_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRIA6_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_PARBILALRIA6_IMPORTO_1 = 12;
  public static int PQSL_PARBILALRIA6_IMPORTO_2 = 13;
  public static int PQSL_PARBILALRIA6_IMPORTO_3 = 14;
  public static int PQSL_PARBILALRIA6_IMPORTO_4 = 15;
  public static int PQSL_PARBILALRIA6_IMPORTO_5 = 16;
  public static int PQSL_PARBILALRIA6_IMPORTO_6 = 17;
  public static int PQSL_PARBILALRIA6_IMPORTO_7 = 18;
  public static int PQSL_PARBILALRIA6_PABIALRIAMOR = 19;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA7 = 2418;
  public static int PQSL_PARBILALRIA7_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA7_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA7_RAGGRUPPAMENTO = 2;
  public static int PQSL_PARBILALRIA7_ESERCIZIO = 3;
  public static int PQSL_PARBILALRIA7_IMPORTO_1 = 4;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRI10 = 2419;
  public static int PQSL_PARBILALRI10_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRI10_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRI10_ESERCIZIO = 2;
  public static int PQSL_PARBILALRI10_RAGGRUPPAMENTO = 3;
  public static int PQSL_PARBILALRI10_S = 4;
  public static int PQSL_PARBILALRI10_CAPITOLO_SPESA = 5;
  public static int PQSL_PARBILALRI10_ARTICOLO_SPESA = 6;
  public static int PQSL_PARBILALRI10_DESCR_CAPITOLO_SPESA = 7;
  public static int PQSL_PARBILALRI10_E = 8;
  public static int PQSL_PARBILALRI10_CAPITOLO_ENTRATA = 9;
  public static int PQSL_PARBILALRI10_ARTICOLO_ENTRATA = 10;
  public static int PQSL_PARBILALRI10_DESCR_CAPITOLO_ENTRATA = 11;
  public static int PQSL_PARBILALRI10_IMPORTO_1 = 12;
  public static int PQSL_PARBILALRI10_IMPORTO_2 = 13;
  public static int PQSL_PARBILALRI10_IMPORTO_3 = 14;
  public static int PQSL_PARBILALRI10_IMPORTO_4 = 15;
  public static int PQSL_PARBILALRI10_IMPORTO_5 = 16;
  public static int PQSL_PARBILALRI10_IMPORTO_6 = 17;

  // Table to contain panel selected row: PARAM BIL ALL RIS AMM
  //
  public static int PQRY_PARBILALRIA9 = 2420;
  public static int PQSL_PARBILALRIA9_PROGRESSIVO = 0;
  public static int PQSL_PARBILALRIA9_TIPO_STAMPA = 1;
  public static int PQSL_PARBILALRIA9_RAGGRUPPAMENTO = 2;
  public static int PQSL_PARBILALRIA9_ESERCIZIO = 3;
  public static int PQSL_PARBILALRIA9_IMPORTO_1 = 4;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM176 = 2421;
  public static int PQRY_PARAM176_RS = 2422;
  public static int PQSL_PARAM176_PARAPROGSTAM = 0;
  public static int PQSL_PARAM176_PARAMISSTITO = 1;
  public static int PQSL_PARAM176_PARAPROGTIPO = 2;
  public static int PQSL_PARAM176_PARATIPOBILA = 3;
  public static int PQSL_PARAM176_PARASUDSUPUO = 4;
  public static int PQSL_PARAM176_PARAPROGUNIT = 5;
  public static int PQSL_PARAM176_PARARIEPGENE = 6;
  public static int PQSL_PARAM176_PARSTANUDIPA = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI275 = 2423;
  public static int PQRY_PARAMETRI275_RS = 2424;
  public static int PQSL_PARAMETRI275_PARAMDAL = 0;
  public static int PQSL_PARAMETRI275_PARAMAL = 1;
  public static int PQSL_PARAMETRI275_PARSTANUDIPA = 2;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM169 = 2425;
  public static int PQRY_PARAM169_RS = 2426;
  public static int PQSL_PARAM169_PARAPROGSTAM = 0;
  public static int PQSL_PARAM169_PARAMISSTITO = 1;
  public static int PQSL_PARAM169_PARAPROGTIPO = 2;
  public static int PQSL_PARAM169_PARAMDAL = 3;
  public static int PQSL_PARAM169_PARAMAL = 4;
  public static int PQSL_PARAM169_PARAMESERCIZ = 5;
  public static int PQSL_PARAM169_PARASUDSUPUO = 6;
  public static int PQSL_PARAM169_PARAPROGUNIT = 7;
  public static int PQSL_PARAM169_PARSTANUDIPA = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI188 = 2427;
  public static int PQRY_PARAMETRI188_RS = 2428;
  public static int PQSL_PARAMETRI188_ROWNAMESTAMP = 0;
  public static int PQSL_PARAMETRI188_ROWNAMEPARTE = 1;
  public static int PQSL_PARAMETRI188_ROWNAMDABISI = 2;
  public static int PQSL_PARAMETRI188_ROWNAMEDETTA = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR11 = 2429;
  public static int PQRY_PAR11_RS = 2430;
  public static int PQSL_PAR11_ROWNAMDABISI = 0;
  public static int PQSL_PAR11_ROWNAMSTAATT = 1;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE5 = 2431;
  public static int PQRY_NEWTABLE5_RS = 2432;
  public static int PQSL_NEWTABLE5_ROWNAMDABISI = 0;
  public static int PQSL_NEWTABLE5_ROWNAMEDETTA = 1;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE3 = 2433;
  public static int PQRY_NEWTABLE3_RS = 2434;
  public static int PQSL_NEWTABLE3_ROWNAMDABISI = 0;
  public static int PQSL_NEWTABLE3_ROWNAMEDETTA = 1;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR9 = 2435;
  public static int PQRY_PAR9_RS = 2436;
  public static int PQSL_PAR9_ROWNAMDABISI = 0;
  public static int PQSL_PAR9_ROWNAMEDATA = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI187 = 2437;
  public static int PQRY_PARAMETRI187_RS = 2438;
  public static int PQSL_PARAMETRI187_ROWNAMESTAMP = 0;
  public static int PQSL_PARAMETRI187_RONAPRESDABS = 1;
  public static int PQSL_PARAMETRI187_RONAESPLDABS = 2;
  public static int PQSL_PARAMETRI187_ROWNAMEPARTE = 3;
  public static int PQSL_PARAMETRI187_ROWNAMCRDIST = 4;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE13 = 2439;
  public static int PQRY_NEWTABLE13_RS = 2440;
  public static int PQSL_NEWTABLE13_ROWNAMEDETTA = 0;
  public static int PQSL_NEWTABLE13_ROWNAMEPARTE = 1;
  public static int PQSL_NEWTABLE13_ROWNAMEDAL = 2;
  public static int PQSL_NEWTABLE13_ROWNAMEAL = 3;
  public static int PQSL_NEWTABLE13_ROWNAMECOMME = 4;
  public static int PQSL_NEWTABLE13_ROWNAMESTAMP = 5;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI359 = 2441;
  public static int PQRY_PARAMETRI359_RS = 2442;
  public static int PQSL_PARAMETRI359_PARAMPARTE = 0;
  public static int PQSL_PARAMETRI359_PARADABILSIM = 1;
  public static int PQSL_PARAMETRI359_PARAMDETTAGL = 2;
  public static int PQSL_PARAMETRI359_PARASERVOPER = 3;
  public static int PQSL_PARAMETRI359_PATOPECEDICO = 4;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR88 = 2443;
  public static int PQRY_PAR88_RS = 2444;
  public static int PQSL_PAR88_ROWNAMEPARTE = 0;
  public static int PQSL_PAR88_ROWNAMETITOL = 1;
  public static int PQSL_PAR88_ROWNAMEFUNZI = 2;
  public static int PQSL_PAR88_ROWNAMESERVI = 3;
  public static int PQSL_PAR88_ROWNAMDABISI = 4;
  public static int PQSL_PAR88_ROWNAMDETCAP = 5;
  public static int PQSL_PAR88_ROWNAMDESINT = 6;
  public static int PQSL_PAR88_ROWNAMTOPETI = 7;
  public static int PQSL_PAR88_ROWNAMEVARIA = 8;
  public static int PQSL_PAR88_RONAPRANINCO = 9;

}
