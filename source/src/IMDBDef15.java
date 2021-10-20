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
public class IMDBDef15 extends Object
{
	// IMDB Constants
  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI149 = 3294;
  public static int PQRY_PARAMETRI149_RS = 3295;
  public static int PQSL_PARAMETRI149_PARNUMMANDAL = 0;
  public static int PQSL_PARAMETRI149_PARANUMMANAL = 1;
  public static int PQSL_PARAMETRI149_PARNUMSUBIMP = 2;
  public static int PQSL_PARAMETRI149_PARANNSUBIMP = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI152 = 3296;
  public static int PQRY_PARAMETRI152_RS = 3297;
  public static int PQSL_PARAMETRI152_PARADATDIRIE = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI220 = 3298;
  public static int PQRY_PARAMETRI220_RS = 3299;
  public static int PQSL_PARAMETRI220_PARNUMMANDAL = 0;
  public static int PQSL_PARAMETRI220_PARANUMMANAL = 1;
  public static int PQSL_PARAMETRI220_PARADISGAEME = 2;
  public static int PQSL_PARAMETRI220_PARAMUFFICIO = 3;
  public static int PQSL_PARAMETRI220_PARADATADIST = 4;
  public static int PQSL_PARAMETRI220_PARAMDANUMER = 5;
  public static int PQSL_PARAMETRI220_PARANUOVDIST = 6;
  public static int PQSL_PARAMETRI220_PARADISTNUME = 7;
  public static int PQSL_PARAMETRI220_PARDATDISNUM = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI565 = 3300;
  public static int PQRY_PARAMETRI565_RS = 3301;
  public static int PQSL_PARAMETRI565_ROWNAMEANNO = 0;
  public static int PQSL_PARAMETRI565_ROWNAMEDATDA = 1;
  public static int PQSL_PARAMETRI565_ROWNAMEDATAA = 2;
  public static int PQSL_PARAMETRI565_ROWNAMEDETTA = 3;
  public static int PQSL_PARAMETRI565_ROWNAMEVARIA = 4;
  public static int PQSL_PARAMETRI565_ROWNAMECAP = 5;
  public static int PQSL_PARAMETRI565_ROWNAMEART = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI171 = 3302;
  public static int PQRY_PARAMETRI171_RS = 3303;
  public static int PQSL_PARAMETRI171_ROWNAMEANNO = 0;
  public static int PQSL_PARAMETRI171_ROWNAMEDATDA = 1;
  public static int PQSL_PARAMETRI171_ROWNAMEDATAA = 2;
  public static int PQSL_PARAMETRI171_ROWNAMETITOL = 3;
  public static int PQSL_PARAMETRI171_ROWNAMEORDIN = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI179 = 3304;
  public static int PQRY_PARAMETRI179_RS = 3305;
  public static int PQSL_PARAMETRI179_ROWNAMEANNO = 0;
  public static int PQSL_PARAMETRI179_ROWNAMEDATDA = 1;
  public static int PQSL_PARAMETRI179_ROWNAMEDATAA = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI270 = 3306;
  public static int PQRY_PARAMETRI270_RS = 3307;
  public static int PQSL_PARAMETRI270_PARACODIBENE = 0;
  public static int PQSL_PARAMETRI270_PARPERINCDAL = 1;
  public static int PQSL_PARAMETRI270_PARAPERINCAL = 2;
  public static int PQSL_PARAMETRI270_PARDATMANDAL = 3;
  public static int PQSL_PARAMETRI270_PARADATMANAL = 4;
  public static int PQSL_PARAMETRI270_PARAMTIPO = 5;
  public static int PQSL_PARAMETRI270_PARAMDETTAGL = 6;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI180 = 3308;
  public static int PQRY_PARAMETRI180_RS = 3309;
  public static int PQSL_PARAMETRI180_ROWNAMEEMEAL = 0;
  public static int PQSL_PARAMETRI180_ROWNAMNOPAAL = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI177 = 3310;
  public static int PQRY_PARAMETRI177_RS = 3311;
  public static int PQSL_PARAMETRI177_ROWNAMMANDAL = 0;
  public static int PQSL_PARAMETRI177_ROWNAMEMANAL = 1;
  public static int PQSL_PARAMETRI177_ROWNAMEPROPO = 2;
  public static int PQSL_PARAMETRI177_ROWNAMESUBIM = 3;
  public static int PQSL_PARAMETRI177_ROWNAMERITEN = 4;
  public static int PQSL_PARAMETRI177_ROWNAMECAUSA = 5;
  public static int PQSL_PARAMETRI177_ROWNAMECREDI = 6;
  public static int PQSL_PARAMETRI177_ROWNAMENOTE = 7;
  public static int PQSL_PARAMETRI177_ROWNAMEUFFIC = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI173 = 3312;
  public static int PQRY_PARAMETRI173_RS = 3313;
  public static int PQSL_PARAMETRI173_ROWNAMEANNO = 0;
  public static int PQSL_PARAMETRI173_ROWNAMEDATDA = 1;
  public static int PQSL_PARAMETRI173_ROWNAMEDATAA = 2;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE47 = 3314;
  public static int PQRY_NEWTABLE47_RS = 3315;
  public static int PQSL_NEWTABLE47_ROWNAMEDAL = 0;
  public static int PQSL_NEWTABLE47_ROWNAMEAL = 1;
  public static int PQSL_NEWTABLE47_ROWNAMOLDTIP = 2;
  public static int PQSL_NEWTABLE47_ROWNAMEUFFIC = 3;
  public static int PQSL_NEWTABLE47_ROWNAMDISNUM = 4;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ14 = 3316;
  public static int PQSL_LIQ14_NUMERO_LIQ = 0;
  public static int PQSL_LIQ14_ANNO_LIQ = 1;
  public static int PQSL_LIQ14_D_DATA_REG = 2;
  public static int PQSL_LIQ14_LIBERASOESES = 3;
  public static int PQSL_LIQ14_NUMERO_DOC = 4;
  public static int PQSL_LIQ14_D_DATA_DOC = 5;
  public static int PQSL_LIQ14_D_SCADENZA = 6;
  public static int PQSL_LIQ14_DESCRIZIONE = 7;
  public static int PQSL_LIQ14_IMPORTO = 8;
  public static int PQSL_LIQ14_RITENUTE = 9;
  public static int PQSL_LIQ14_CAPITOLO = 10;
  public static int PQSL_LIQ14_ARTICOLO = 11;
  public static int PQSL_LIQ14_NUMERO_IMP = 12;
  public static int PQSL_LIQ14_ANNO_IMP = 13;
  public static int PQSL_LIQ14_SEDE_DEL = 14;
  public static int PQSL_LIQ14_NUMERO_DEL = 15;
  public static int PQSL_LIQ14_ANNO_DEL = 16;
  public static int PQSL_LIQ14_NUMERO_SUBIMP = 17;
  public static int PQSL_LIQ14_ANNO_SUBIMP = 18;
  public static int PQSL_LIQ14_LIQSEDEDEL1 = 19;
  public static int PQSL_LIQ14_LIQNUMERDEL1 = 20;
  public static int PQSL_LIQ14_LIQANNODEL1 = 21;
  public static int PQSL_LIQ14_LIQBOLLO = 22;
  public static int PQSL_LIQ14_VOCE_ECON = 23;
  public static int PQSL_LIQ14_CODICE_GESTIONALE = 24;
  public static int PQSL_LIQ14_LIQTIPOVINCO = 25;
  public static int PQSL_LIQ14_LIQSEDEDEL2 = 26;
  public static int PQSL_LIQ14_LIQNUMERDEL2 = 27;
  public static int PQSL_LIQ14_LIQANNODEL2 = 28;
  public static int PQSL_LIQ14_UNITA_PROPONENTE = 29;
  public static int PQSL_LIQ14_NUMERO_PROPOSTA = 30;
  public static int PQSL_LIQ14_ANNO_PROPOSTA = 31;
  public static int PQSL_LIQ14_NUMERO_DISTINTA = 32;
  public static int PQSL_LIQ14_ANNO_DISTINTA = 33;
  public static int PQSL_LIQ14_FINANZIAMENTO = 34;
  public static int PQSL_LIQ14_LIQUFFICIO = 35;
  public static int PQSL_LIQ14_LIQDIVERBENE = 36;
  public static int PQSL_LIQ14_LIQNUMERIMPE = 37;
  public static int PQSL_LIQ14_LIQANNOIMPEG = 38;
  public static int PQSL_LIQ14_ANNO_MAND = 39;
  public static int PQSL_LIQ14_LIQOLDINEMIS = 40;
  public static int PQSL_LIQ14_ANNO_PROG = 41;
  public static int PQSL_LIQ14_NUMERO_PROG = 42;
  public static int PQSL_LIQ14_UFFICIO = 43;
  public static int PQSL_LIQ14_BOLLO = 44;
  public static int PQSL_LIQ14_TIPO_VINCOLO = 45;
  public static int PQSL_LIQ14_BENEFICIARIO = 46;
  public static int PQSL_LIQ14_LIQCIG = 47;
  public static int PQSL_LIQ14_PIANOCONTINT = 48;
  public static int PQSL_LIQ14_LIQCODICCOFO = 49;
  public static int PQSL_LIQ14_LIQCODICEURO = 50;
  public static int PQSL_LIQ14_LIQPARZ = 51;
  public static int PQSL_LIQ14_LIQNUMERCONT = 52;
  public static int PQSL_LIQ14_LIQDATACONTA = 53;
  public static int PQSL_LIQ14_LIQQTNSCADEN = 54;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI341 = 3317;
  public static int PQRY_PARAMETRI341_RS = 3318;
  public static int PQSL_PARAMETRI341_ROWNAMDALIDA = 0;
  public static int PQSL_PARAMETRI341_ROWNAMDALIAL = 1;
  public static int PQSL_PARAMETRI341_ROWNAMNULIDA = 2;
  public static int PQSL_PARAMETRI341_ROWNAMNULIAL = 3;
  public static int PQSL_PARAMETRI341_ROWNAMSCADAL = 4;
  public static int PQSL_PARAMETRI341_ROWNAMESCAAL = 5;
  public static int PQSL_PARAMETRI341_RONASOLINODF = 6;
  public static int PQSL_PARAMETRI341_ROWNAMEORDIN = 7;
  public static int PQSL_PARAMETRI341_ROWNAMENUMER = 8;
  public static int PQSL_PARAMETRI341_ROWNAMEDATA = 9;
  public static int PQSL_PARAMETRI341_ROWNAMNUMDIS = 10;
  public static int PQSL_PARAMETRI341_ROWNAMDATDIS = 11;
  public static int PQSL_PARAMETRI341_ROWNAMECOPER = 12;

  // Recordset for query: Finanziamenti
  //
  public static int QRY_FINANZIAMEN4 = 3319;
  public static int QSL_FINANZIAMEN4_FINFINANZIAM = 0;
  public static int QSL_FINANZIAMEN4_SOMMAIMPORTO = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI175 = 3320;
  public static int PQRY_PARAMETRI175_RS = 3321;
  public static int PQSL_PARAMETRI175_PARAMINIZIO = 0;
  public static int PQSL_PARAMETRI175_PARAMFINE = 1;
  public static int PQSL_PARAMETRI175_PARAMDAL = 2;
  public static int PQSL_PARAMETRI175_PARAMAL = 3;
  public static int PQSL_PARAMETRI175_PARACODIBENE = 4;
  public static int PQSL_PARAMETRI175_PARAMUFFICIO = 5;
  public static int PQSL_PARAMETRI175_PARADATAELAB = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ27 = 3322;
  public static int PQSL_LIQ27_REBERASOESES = 0;
  public static int PQSL_LIQ27_RECBENCODFIS = 1;
  public static int PQSL_LIQ27_RECORANNOLIQ = 2;
  public static int PQSL_LIQ27_RECORNUMELIQ = 3;
  public static int PQSL_LIQ27_RECMANNUMMAN = 4;
  public static int PQSL_LIQ27_RECMANDDATMA = 5;
  public static int PQSL_LIQ27_RECORLIQIMP1 = 6;
  public static int PQSL_LIQ27_RECORLIQALIQ = 7;
  public static int PQSL_LIQ27_RECLIQRITIRP = 8;
  public static int PQSL_LIQ27_RECLIQANNIMP = 9;
  public static int PQSL_LIQ27_RECLIQNUMIMP = 10;
  public static int PQSL_LIQ27_RECORLIQCODI = 11;
  public static int PQSL_LIQ27_RECLIQIMNOSO = 12;
  public static int PQSL_LIQ27_RECORLIQIMPO = 13;
  public static int PQSL_LIQ27_RECLIQSEDDEL = 14;
  public static int PQSL_LIQ27_RECLIQNUMDEL = 15;
  public static int PQSL_LIQ27_RECLIQANNDEL = 16;
  public static int PQSL_LIQ27_RECORMANUFFI = 17;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI165 = 3323;
  public static int PQRY_PARAMETRI165_RS = 3324;
  public static int PQSL_PARAMETRI165_PARAMINIZIO = 0;
  public static int PQSL_PARAMETRI165_PARAMFINE = 1;
  public static int PQSL_PARAMETRI165_PARAMDAL = 2;
  public static int PQSL_PARAMETRI165_PARAMAL = 3;
  public static int PQSL_PARAMETRI165_PARAMUFFICIO = 4;
  public static int PQSL_PARAMETRI165_PARADATAELAB = 5;
  public static int PQSL_PARAMETRI165_PARAMREGCOM = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ28 = 3325;
  public static int PQSL_LIQ28_REBERASOESES = 0;
  public static int PQSL_LIQ28_RECBENCODFIS = 1;
  public static int PQSL_LIQ28_RECMANNUMMAN = 2;
  public static int PQSL_LIQ28_RECMANDDATMA = 3;
  public static int PQSL_LIQ28_RECLIQANNIMP = 4;
  public static int PQSL_LIQ28_RECORLIQIMP1 = 5;
  public static int PQSL_LIQ28_RECORLIQALIQ = 6;
  public static int PQSL_LIQ28_RECLIQRITIRP = 7;
  public static int PQSL_LIQ28_DENOMINAZION = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI158 = 3326;
  public static int PQRY_PARAMETRI158_RS = 3327;
  public static int PQSL_PARAMETRI158_PARAMDA = 0;
  public static int PQSL_PARAMETRI158_PARAMA = 1;
  public static int PQSL_PARAMETRI158_PARADATAELAB = 2;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ13 = 3328;
  public static int PQSL_LIQ13_RECORLIQCODI = 0;
  public static int PQSL_LIQ13_RITENUTE = 1;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI156 = 3329;
  public static int PQRY_PARAMETRI156_RS = 3330;
  public static int PQSL_PARAMETRI156_PARAMDA = 0;
  public static int PQSL_PARAMETRI156_PARAMA = 1;
  public static int PQSL_PARAMETRI156_PARADATAELAB = 2;
  public static int PQSL_PARAMETRI156_PARAMADDIZIO = 3;

  // Table to contain panel selected row: Regioni Emiss
  //
  public static int PQRY_REGIONIEMIS1 = 3331;
  public static int PQSL_REGIONIEMIS1_DENOREGICOMU = 0;
  public static int PQSL_REGIONIEMIS1_CODICEINPS = 1;
  public static int PQSL_REGIONIEMIS1_CODICEINPSOR = 2;
  public static int PQSL_REGIONIEMIS1_RITENUTE = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI214 = 3332;
  public static int PQRY_PARAMETRI214_RS = 3333;
  public static int PQSL_PARAMETRI214_PARAMMANDDAL = 0;
  public static int PQSL_PARAMETRI214_PARAMMANDAAL = 1;
  public static int PQSL_PARAMETRI214_PARACODIBENE = 2;
  public static int PQSL_PARAMETRI214_PARAMPERENTI = 3;
  public static int PQSL_PARAMETRI214_PARATIPOELAB = 4;
  public static int PQSL_PARAMETRI214_PARADATACERT = 5;
  public static int PQSL_PARAMETRI214_PARANUMEPROT = 6;
  public static int PQSL_PARAMETRI214_PARAMCODICE = 7;
  public static int PQSL_PARAMETRI214_PARAMIVA = 8;
  public static int PQSL_PARAMETRI214_PARARITEPREV = 9;
  public static int PQSL_PARAMETRI214_PARAMINAIL = 10;
  public static int PQSL_PARAMETRI214_PARRITPRCAEN = 11;

  // Table to contain panel selected row: Enti Emissioni
  //
  public static int PQRY_ENTIEMISSIO2 = 3334;
  public static int PQSL_ENTIEMISSIO2_TOTARITEIRPE = 0;
  public static int PQSL_ENTIEMISSIO2_RECLIQCAUIRP = 1;
  public static int PQSL_ENTIEMISSIO2_RECORLIQALIQ = 2;
  public static int PQSL_ENTIEMISSIO2_TOTALEIMPONI = 3;
  public static int PQSL_ENTIEMISSIO2_TOTIMPNONSOG = 4;
  public static int PQSL_ENTIEMISSIO2_RECLIQALIINP = 5;
  public static int PQSL_ENTIEMISSIO2_TOTAIMPOINPS = 6;
  public static int PQSL_ENTIEMISSIO2_TOTARITEINPS = 7;
  public static int PQSL_ENTIEMISSIO2_RECORT62DESC = 8;
  public static int PQSL_ENTIEMISSIO2_RECORT62ARTI = 9;
  public static int PQSL_ENTIEMISSIO2_TOTALRITEADD = 10;
  public static int PQSL_ENTIEMISSIO2_IMPONIBILREG = 11;
  public static int PQSL_ENTIEMISSIO2_ALIQUOTAREG = 12;
  public static int PQSL_ENTIEMISSIO2_IMPONIBILCOM = 13;
  public static int PQSL_ENTIEMISSIO2_ALIQUOTACOM = 14;
  public static int PQSL_ENTIEMISSIO2_TOTRITADDCOM = 15;
  public static int PQSL_ENTIEMISSIO2_TOTRITINPENT = 16;
  public static int PQSL_ENTIEMISSIO2_TOTRITCASPRO = 17;
  public static int PQSL_ENTIEMISSIO2_TOTAIMPOINAI = 18;
  public static int PQSL_ENTIEMISSIO2_TOTARITEINAI = 19;
  public static int PQSL_ENTIEMISSIO2_RECLIQALIINA = 20;
  public static int PQSL_ENTIEMISSIO2_TOTRITINAENT = 21;
  public static int PQSL_ENTIEMISSIO2_RECORTIPORIT = 22;
  public static int PQSL_ENTIEMISSIO2_RECORSOMMIVA = 23;
  public static int PQSL_ENTIEMISSIO2_RECORAGGBENE = 24;
  public static int PQSL_ENTIEMISSIO2_RECOCODIFISC = 25;
  public static int PQSL_ENTIEMISSIO2_RECBENPARIVA = 26;
  public static int PQSL_ENTIEMISSIO2_REBERASOEEDE = 27;
  public static int PQSL_ENTIEMISSIO2_RECINDENTDAT = 28;
  public static int PQSL_ENTIEMISSIO2_RECCAPENTDAT = 29;
  public static int PQSL_ENTIEMISSIO2_RECBENCODFIS = 30;
  public static int PQSL_ENTIEMISSIO2_REBERASOESEE = 31;
  public static int PQSL_ENTIEMISSIO2_RECOCOMCOMEE = 32;
  public static int PQSL_ENTIEMISSIO2_RECCOMDEENDA = 33;
  public static int PQSL_ENTIEMISSIO2_RECPROSIENDA = 34;
  public static int PQSL_ENTIEMISSIO2_RECBENDDATNA = 35;
  public static int PQSL_ENTIEMISSIO2_RECCOMCONAEE = 36;
  public static int PQSL_ENTIEMISSIO2_RECCOMDENAEE = 37;
  public static int PQSL_ENTIEMISSIO2_RECPROSINAEE = 38;
  public static int PQSL_ENTIEMISSIO2_RECOLIQBENEE = 39;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI559 = 3335;
  public static int PQRY_PARAMETRI559_RS = 3336;
  public static int PQSL_PARAMETRI559_PARAMQUADRO = 0;
  public static int PQSL_PARAMETRI559_PARAIMPOTRON = 1;

  // Table to contain panel selected row: VISTA CONTROLLO 770
  //
  public static int PQRY_VISTACONT770 = 3337;
  public static int PQSL_VISTACONT770_RECORDRAGSOC = 0;
  public static int PQSL_VISTACONT770_RECORDBENEFI = 1;
  public static int PQSL_VISTACONT770_RECORDESABBR = 2;
  public static int PQSL_VISTACONT770_RECORDCAUSAL = 3;
  public static int PQSL_VISTACONT770_RECSOMNONSOG = 4;
  public static int PQSL_VISTACONT770_RECORDIMPONI = 5;
  public static int PQSL_VISTACONT770_RECORDRITENU = 6;
  public static int PQSL_VISTACONT770_RECOADDIREGI = 7;
  public static int PQSL_VISTACONT770_RECOIMPOCORR = 8;
  public static int PQSL_VISTACONT770_RECORDALIQUO = 9;
  public static int PQSL_VISTACONT770_RECORDINDIRI = 10;
  public static int PQSL_VISTACONT770_RECODESCCOMU = 11;
  public static int PQSL_VISTACONT770_RECOSIGLPROV = 12;
  public static int PQSL_VISTACONT770_RECCOEPRDOFI = 13;
  public static int PQSL_VISTACONT770_RECODATANASC = 14;
  public static int PQSL_VISTACONT770_RECOCOMUNASC = 15;
  public static int PQSL_VISTACONT770_RECOPROVNASC = 16;
  public static int PQSL_VISTACONT770_RECCOMEPRONA = 17;
  public static int PQSL_VISTACONT770_RECOCODIFISC = 18;
  public static int PQSL_VISTACONT770_RECORRITECOM = 19;
  public static int PQSL_VISTACONT770_RECORITEINPS = 20;
  public static int PQSL_VISTACONT770_RECORITINPCE = 21;

  // Table to contain panel selected row: BEN
  //
  public static int PQRY_BEN3 = 3338;
  public static int PQSL_BEN3_RECORDRAGSOC = 0;
  public static int PQSL_BEN3_RECORLIQBENE = 1;
  public static int PQSL_BEN3_RECORDESABBR = 2;
  public static int PQSL_BEN3_RECORDCAUSAL = 3;
  public static int PQSL_BEN3_RECORDIMPONI = 4;
  public static int PQSL_BEN3_RECORDRITENU = 5;
  public static int PQSL_BEN3_RECORLIQALIQ = 6;
  public static int PQSL_BEN3_RECORDINDIRI = 7;
  public static int PQSL_BEN3_RECODESCCOMU = 8;
  public static int PQSL_BEN3_RECOSIGLPROV = 9;
  public static int PQSL_BEN3_RECCOEPRDOFI = 10;
  public static int PQSL_BEN3_REVISODDDANA = 11;
  public static int PQSL_BEN3_RECOCOMUNASC = 12;
  public static int PQSL_BEN3_RECOPROVNASC = 13;
  public static int PQSL_BEN3_RECCOMEPRONA = 14;
  public static int PQSL_BEN3_RECVISSOCOFI = 15;

  // Table to contain panel selected row: T62
  //
  public static int PQRY_T62 = 3339;
  public static int PQSL_T62_RECORLIQALIQ = 0;
  public static int PQSL_T62_RECORDIMPONI = 1;
  public static int PQSL_T62_RECORDRITENU = 2;

  // Table to contain panel selected row: Parametri Filtro
  //
  public static int PQRY_PARAMEFILTR2 = 3340;
  public static int PQRY_PARAMEFILTR2_RS = 3341;
  public static int PQSL_PARAMEFILTR2_NOMEOGGEMAND = 0;

  // Table to contain panel selected row: CONTRIBUENTI MINIMI
  //
  public static int PQRY_CONTRIMINIMI = 3342;
  public static int PQSL_CONTRIMINIMI_BENEFICIARIO = 0;
  public static int PQSL_CONTRIMINIMI_RAGIONE_SOCIALE = 1;
  public static int PQSL_CONTRIMINIMI_INDIRIZZO = 2;
  public static int PQSL_CONTRIMINIMI_DATA_NASCITA = 3;
  public static int PQSL_CONTRIMINIMI_PROVINCIA = 4;
  public static int PQSL_CONTRIMINIMI_CODICE_FISCALE = 5;
  public static int PQSL_CONTRIMINIMI_PARTITA_IVA = 6;
  public static int PQSL_CONTRIMINIMI_COMUNE_DOMICILIO = 7;
  public static int PQSL_CONTRIMINIMI_PROVINCIA_DOMICILIO = 8;
  public static int PQSL_CONTRIMINIMI_COMUNE_NASCITA = 9;
  public static int PQSL_CONTRIMINIMI_PROVINCIA_NASCITA = 10;
  public static int PQSL_CONTRIMINIMI_NUMERO_LIQ = 11;
  public static int PQSL_CONTRIMINIMI_ANNNO_LIQ = 12;
  public static int PQSL_CONTRIMINIMI_RITENUTE_CASSE_PROF = 13;
  public static int PQSL_CONTRIMINIMI_NUMERO_DOC = 14;
  public static int PQSL_CONTRIMINIMI_D_DATA_DOC = 15;
  public static int PQSL_CONTRIMINIMI_IMPORTO = 16;
  public static int PQSL_CONTRIMINIMI_IMPONIBILE = 17;
  public static int PQSL_CONTRIMINIMI_CONMINANNMAN = 18;
  public static int PQSL_CONTRIMINIMI_CONMINNUMMAN = 19;
  public static int PQSL_CONTRIMINIMI_CONTRIMINIMI = 20;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI5 = 3343;
  public static int PQSL_WRKERRORI5_RECWRKERRPRO = 0;
  public static int PQSL_WRKERRORI5_RECWRKERRERR = 1;
  public static int PQSL_WRKERRORI5_RECORDCODICE = 2;
  public static int PQSL_WRKERRORI5_RECORDBENEFI = 3;
  public static int PQSL_WRKERRORI5_RECORDERRORE = 4;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI537 = 3344;
  public static int PQRY_PARAMETRI537_RS = 3345;
  public static int PQSL_PARAMETRI537_ROWNAMEQUADR = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI271 = 3346;
  public static int PQRY_PARAMETRI271_RS = 3347;
  public static int PQSL_PARAMETRI271_ROWNAMETIPO = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI228 = 3348;
  public static int PQRY_PARAMETRI228_RS = 3349;
  public static int PQSL_PARAMETRI228_PARAMINIZIO = 0;
  public static int PQSL_PARAMETRI228_PARAMFINE = 1;
  public static int PQSL_PARAMETRI228_PARAMDAL = 2;
  public static int PQSL_PARAMETRI228_PARAMAL = 3;
  public static int PQSL_PARAMETRI228_PARAMUFFICIO = 4;
  public static int PQSL_PARAMETRI228_PARADATAELAB = 5;
  public static int PQSL_PARAMETRI228_PARAMTOTIMPS = 6;
  public static int PQSL_PARAMETRI228_PARAMSUDDIVI = 7;

  // Table to contain panel selected row: MAN
  //
  public static int PQRY_MAN11 = 3350;
  public static int PQSL_MAN11_REBERASOESES = 0;
  public static int PQSL_MAN11_RECBENCODFIS = 1;
  public static int PQSL_MAN11_RECMANNUMMAN = 2;
  public static int PQSL_MAN11_RECMANDDATMA = 3;
  public static int PQSL_MAN11_RECLIQIMPSSN = 4;
  public static int PQSL_MAN11_RECLIQALSSCE = 5;
  public static int PQSL_MAN11_RECLIQRISSCE = 6;
  public static int PQSL_MAN11_IMPEGNO = 7;
  public static int PQSL_MAN11_SUBIMPEGNO = 8;
  public static int PQSL_MAN11_RECLIQANNIMP = 9;
  public static int PQSL_MAN11_RECLIQNUMIMP = 10;
  public static int PQSL_MAN11_RECLIQANNSUB = 11;
  public static int PQSL_MAN11_RECLIQNUMSUB = 12;
  public static int PQSL_MAN11_RECLIQCODSSN = 13;
  public static int PQSL_MAN11_RECORT82DESC = 14;
  public static int PQSL_MAN11_RAGGRUSUDDIV = 15;
  public static int PQSL_MAN11_RECORAGGIMPE = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI167 = 3351;
  public static int PQRY_PARAMETRI167_RS = 3352;
  public static int PQSL_PARAMETRI167_PARAMINIZIO = 0;
  public static int PQSL_PARAMETRI167_PARAMFINE = 1;
  public static int PQSL_PARAMETRI167_PARAMDAL = 2;
  public static int PQSL_PARAMETRI167_PARAMAL = 3;
  public static int PQSL_PARAMETRI167_PARAMUFFICIO = 4;
  public static int PQSL_PARAMETRI167_PARADATAELAB = 5;
  public static int PQSL_PARAMETRI167_PARAMTOTIMPS = 6;
  public static int PQSL_PARAMETRI167_PARAMCASSA = 7;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ29 = 3353;
  public static int PQSL_LIQ29_RECRUGIMPSUB = 0;
  public static int PQSL_LIQ29_REBERASOESES = 1;
  public static int PQSL_LIQ29_RECBENCODFIS = 2;
  public static int PQSL_LIQ29_RECMANNUMMAN = 3;
  public static int PQSL_LIQ29_RECMANDDATMA = 4;
  public static int PQSL_LIQ29_RECORLIQIMPO = 5;
  public static int PQSL_LIQ29_RECLIQIMPINP = 6;
  public static int PQSL_LIQ29_RECLIQALIINP = 7;
  public static int PQSL_LIQ29_RECLIQRITINP = 8;
  public static int PQSL_LIQ29_RECLIQRIINCE = 9;
  public static int PQSL_LIQ29_IMPEGNO = 10;
  public static int PQSL_LIQ29_SUBIMPEGNO = 11;
  public static int PQSL_LIQ29_RECLIQANNIMP = 12;
  public static int PQSL_LIQ29_RECLIQNUMIMP = 13;
  public static int PQSL_LIQ29_RECLIQANNSUB = 14;
  public static int PQSL_LIQ29_RECLIQNUMSUB = 15;
  public static int PQSL_LIQ29_RECORLIQCASS = 16;
  public static int PQSL_LIQ29_RECORT83DESC = 17;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI163 = 3354;
  public static int PQRY_PARAMETRI163_RS = 3355;
  public static int PQSL_PARAMETRI163_PARAMINIZIO = 0;
  public static int PQSL_PARAMETRI163_PARAMFINE = 1;
  public static int PQSL_PARAMETRI163_PARAMDAL = 2;
  public static int PQSL_PARAMETRI163_PARAMAL = 3;
  public static int PQSL_PARAMETRI163_PARAMUFFICIO = 4;
  public static int PQSL_PARAMETRI163_PARAMCODICE = 5;
  public static int PQSL_PARAMETRI163_PARADATAELAB = 6;

  // Table to contain panel selected row: LIQ
  //
  public static int PQRY_LIQ26 = 3356;
  public static int PQSL_LIQ26_REBERASOESES = 0;
  public static int PQSL_LIQ26_RECBENCODFIS = 1;
  public static int PQSL_LIQ26_RECLIQNUMMAN = 2;
  public static int PQSL_LIQ26_RECMANDDATMA = 3;
  public static int PQSL_LIQ26_RECORDIMPEGN = 4;
  public static int PQSL_LIQ26_RECORSUBIMPE = 5;
  public static int PQSL_LIQ26_RECORLIQIMPO = 6;
  public static int PQSL_LIQ26_RECLIQIMPINA = 7;
  public static int PQSL_LIQ26_RECLIQALIINA = 8;
  public static int PQSL_LIQ26_RECLIQRITINA = 9;
  public static int PQSL_LIQ26_RECLIQRIINCE = 10;
  public static int PQSL_LIQ26_RECLIQANNIMP = 11;
  public static int PQSL_LIQ26_RECLIQNUMIMP = 12;
  public static int PQSL_LIQ26_RECLIQANNSUB = 13;
  public static int PQSL_LIQ26_RECLIQNUMSUB = 14;
  public static int PQSL_LIQ26_RECOANNOIMPE = 15;
  public static int PQSL_LIQ26_RECONUMEIMPE = 16;
  public static int PQSL_LIQ26_RECANNSUBIMP = 17;
  public static int PQSL_LIQ26_RECNUMSUBIMP = 18;

  // Table to contain panel selected row: Parametri Stampa
  //
  public static int PQRY_PARAMESTAM25 = 3357;
  public static int PQRY_PARAMESTAM25_RS = 3358;
  public static int PQSL_PARAMESTAM25_NOMOGGFIRRI1 = 0;
  public static int PQSL_PARAMESTAM25_NOMOGGFIRRI2 = 1;

  // Table to contain panel selected row: Enti Emissioni
  //
  public static int PQRY_ENTIEMISSIO1 = 3359;
  public static int PQSL_ENTIEMISSIO1_TOTARITEIRPE = 0;
  public static int PQSL_ENTIEMISSIO1_RECLIQCAUIRP = 1;
  public static int PQSL_ENTIEMISSIO1_RECORLIQALIQ = 2;
  public static int PQSL_ENTIEMISSIO1_TOTALEIMPONI = 3;
  public static int PQSL_ENTIEMISSIO1_TOTIMPNONSOG = 4;
  public static int PQSL_ENTIEMISSIO1_RECLIQALIINP = 5;
  public static int PQSL_ENTIEMISSIO1_TOTAIMPOINPS = 6;
  public static int PQSL_ENTIEMISSIO1_TOTARITEINPS = 7;
  public static int PQSL_ENTIEMISSIO1_RECORT62DESC = 8;
  public static int PQSL_ENTIEMISSIO1_RECORT62ARTI = 9;
  public static int PQSL_ENTIEMISSIO1_TOTALRITEADD = 10;
  public static int PQSL_ENTIEMISSIO1_IMPONIBILREG = 11;
  public static int PQSL_ENTIEMISSIO1_ALIQUOTAREG = 12;
  public static int PQSL_ENTIEMISSIO1_IMPONIBILCOM = 13;
  public static int PQSL_ENTIEMISSIO1_ALIQUOTACOM = 14;
  public static int PQSL_ENTIEMISSIO1_TOTRITADDCOM = 15;
  public static int PQSL_ENTIEMISSIO1_TOTRITINPENT = 16;
  public static int PQSL_ENTIEMISSIO1_TOTRITCASPRO = 17;
  public static int PQSL_ENTIEMISSIO1_TOTAIMPOINAI = 18;
  public static int PQSL_ENTIEMISSIO1_TOTARITEINAI = 19;
  public static int PQSL_ENTIEMISSIO1_RECLIQALIINA = 20;
  public static int PQSL_ENTIEMISSIO1_TOTRITINAENT = 21;
  public static int PQSL_ENTIEMISSIO1_RECORTIPORIT = 22;
  public static int PQSL_ENTIEMISSIO1_RECORSOMMIVA = 23;
  public static int PQSL_ENTIEMISSIO1_RECORAGGBENE = 24;
  public static int PQSL_ENTIEMISSIO1_RECOCODIFISC = 25;
  public static int PQSL_ENTIEMISSIO1_RECBENPARIVA = 26;
  public static int PQSL_ENTIEMISSIO1_REBERASOEEDE = 27;
  public static int PQSL_ENTIEMISSIO1_RECINDENTDAT = 28;
  public static int PQSL_ENTIEMISSIO1_RECCAPENTDAT = 29;
  public static int PQSL_ENTIEMISSIO1_RECBENCODFIS = 30;
  public static int PQSL_ENTIEMISSIO1_REBERASOESEE = 31;
  public static int PQSL_ENTIEMISSIO1_RECOCOMCOMEE = 32;
  public static int PQSL_ENTIEMISSIO1_RECCOMDEENDA = 33;
  public static int PQSL_ENTIEMISSIO1_RECPROSIENDA = 34;
  public static int PQSL_ENTIEMISSIO1_RECBENDDATNA = 35;
  public static int PQSL_ENTIEMISSIO1_RECCOMCONAEE = 36;
  public static int PQSL_ENTIEMISSIO1_RECCOMDENAEE = 37;
  public static int PQSL_ENTIEMISSIO1_RECPROSINAEE = 38;
  public static int PQSL_ENTIEMISSIO1_RECOLIQBENEE = 39;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS77 = 3360;
  public static int PQRY_PARS77_RS = 3361;
  public static int PQSL_PARS77_NOMEOGGETDAL = 0;
  public static int PQSL_PARS77_NOMEOGGETTAL = 1;
  public static int PQSL_PARS77_NOMEOGGEMESE = 2;
  public static int PQSL_PARS77_SEDE_DEL = 3;
  public static int PQSL_PARS77_NUMERO_DEL = 4;
  public static int PQSL_PARS77_ANNO_DEL = 5;
  public static int PQSL_PARS77_UNITA_PROPONENTE = 6;
  public static int PQSL_PARS77_NUMERO_PROPOSTA = 7;
  public static int PQSL_PARS77_ANNO_PROPOSTA = 8;
  public static int PQSL_PARS77_NOMEOGGEBENE = 9;
  public static int PQSL_PARS77_UFFICIO = 10;
  public static int PQSL_PARS77_CAUSALE = 11;
  public static int PQSL_PARS77_NOMEOGGESPES = 12;
  public static int PQSL_PARS77_NOMEOGGESCAD = 13;
  public static int PQSL_PARS77_NOMEOGGECOMM = 14;
  public static int PQSL_PARS77_NOMEOGGEALLE = 15;
  public static int PQSL_PARS77_NOMOGGINFTES = 16;
  public static int PQSL_PARS77_NOMEOGGEQUIE = 17;
  public static int PQSL_PARS77_NOMEOGGEBOLL = 18;
  public static int PQSL_PARS77_NOMOGGNUMCON = 19;
  public static int PQSL_PARS77_NOMOGGDATCON = 20;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZION3 = 3362;
  public static int PQSL_NOTEFUNZION3_MODULO = 0;
  public static int PQSL_NOTEFUNZION3_PAGINA = 1;
  public static int PQSL_NOTEFUNZION3_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZION3_DESCRIZIONE = 3;

  // Table to contain panel selected row: DETTAGLI FATTURE GC4
  //
  public static int PQRY_DETTAFATTGC4 = 3363;
  public static int PQSL_DETTAFATTGC4_RECFATNUMDOC = 0;
  public static int PQSL_DETTAFATTGC4_RECODATADOCU = 1;
  public static int PQSL_DETTAFATTGC4_RECORBENCODI = 2;
  public static int PQSL_DETTAFATTGC4_RECBENRASOES = 3;
  public static int PQSL_DETTAFATTGC4_REDEFAGCNUIM = 4;
  public static int PQSL_DETTAFATTGC4_RECOANNOIMPE = 5;
  public static int PQSL_DETTAFATTGC4_REDEFAGCNUSU = 6;
  public static int PQSL_DETTAFATTGC4_REDEFAGCANSU = 7;
  public static int PQSL_DETTAFATTGC4_REDEFAGCCOGE = 8;
  public static int PQSL_DETTAFATTGC4_REDEFAGCIMII = 9;

  // Table to contain panel selected row: Pars
  //
  public static int PQRY_PARS76 = 3364;
  public static int PQRY_PARS76_RS = 3365;
  public static int PQSL_PARS76_SEDE_DEL = 0;
  public static int PQSL_PARS76_NUMERO_DEL = 1;
  public static int PQSL_PARS76_ANNO_DEL = 2;
  public static int PQSL_PARS76_UNITA_PROPONENTE = 3;
  public static int PQSL_PARS76_NUMERO_PROPOSTA = 4;
  public static int PQSL_PARS76_ANNO_PROPOSTA = 5;
  public static int PQSL_PARS76_UFFICIO = 6;
  public static int PQSL_PARS76_CAUSALE = 7;
  public static int PQSL_PARS76_NOMEOGGESPES = 8;
  public static int PQSL_PARS76_NOMEOGGESCAD = 9;
  public static int PQSL_PARS76_NOMEOGGECOMM = 10;
  public static int PQSL_PARS76_NOMEOGGEALLE = 11;
  public static int PQSL_PARS76_NOMOGGINFTES = 12;
  public static int PQSL_PARS76_NOMEOGGEDESC = 13;
  public static int PQSL_PARS76_NOMEOGGEDATA = 14;
  public static int PQSL_PARS76_NOMEOGGECAU1 = 15;
  public static int PQSL_PARS76_NOMEOGGEBOLL = 16;
  public static int PQSL_PARS76_NOMEOGGEUFF1 = 17;
  public static int PQSL_PARS76_NOEAVPMDSASC = 18;
  public static int PQSL_PARS76_NOOGUNORPEBE = 19;
  public static int PQSL_PARS76_NOMEOGGESPE1 = 20;
  public static int PQSL_PARS76_NOMEOGGECOM1 = 21;
  public static int PQSL_PARS76_NOMEOGGEALL1 = 22;
  public static int PQSL_PARS76_NOMOGGINFTE1 = 23;
  public static int PQSL_PARS76_NOMOGGDATEMI = 24;

  // Table to contain panel selected row: FAT
  //
  public static int PQRY_FAT15 = 3366;
  public static int PQSL_FAT15_NUMERO_LIQ = 0;
  public static int PQSL_FAT15_ANNO_LIQ = 1;
  public static int PQSL_FAT15_NUMERO_DOC = 2;
  public static int PQSL_FAT15_D_DATA_DOC = 3;
  public static int PQSL_FAT15_IMPORTO = 4;
  public static int PQSL_FAT15_IMPORTO_IVA = 5;
  public static int PQSL_FAT15_IMPORTO_IVA_IST = 6;
  public static int PQSL_FAT15_TOTIVAIST = 7;
  public static int PQSL_FAT15_RECORINFODOC = 8;
  public static int PQSL_FAT15_RECORBENCODI = 9;
  public static int PQSL_FAT15_RECFATNUMPRO = 10;
  public static int PQSL_FAT15_RECFATANNPRO = 11;
  public static int PQSL_FAT15_RECBENRAGSOC = 12;
  public static int PQSL_FAT15_RECOINFODOC1 = 13;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI409 = 3367;
  public static int PQRY_PARAMETRI409_RS = 3368;
  public static int PQSL_PARAMETRI409_PARANCPROREG = 0;
  public static int PQSL_PARAMETRI409_PARAIMPOPROV = 1;
  public static int PQSL_PARAMETRI409_PARATOTADETT = 2;
  public static int PQSL_PARAMETRI409_PARANUMEPROV = 3;
  public static int PQSL_PARAMETRI409_PARADATAPROV = 4;

  // Table to contain panel selected row: Parametri Flusso
  //
  public static int PQRY_PARAMEFLUSS1 = 3369;
  public static int PQRY_PARAMEFLUSS1_RS = 3370;
  public static int PQSL_PARAMEFLUSS1_IDFLUSSOBT = 0;

  // Table to contain panel selected row: MAN PROVVISORI
  //
  public static int PQRY_MANPROVVISO1 = 3371;
  public static int PQSL_MANPROVVISO1_EMISSIONE = 0;
  public static int PQSL_MANPROVVISO1_I = 1;
  public static int PQSL_MANPROVVISO1_PROGR_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_MANPROVVISO1_IMPORTO = 3;
  public static int PQSL_MANPROVVISO1_DATA = 4;
  public static int PQSL_MANPROVVISO1_NUMERO = 5;
  public static int PQSL_MANPROVVISO1_DES_BEN = 6;
  public static int PQSL_MANPROVVISO1_DESCRIZIONE = 7;
  public static int PQSL_MANPROVVISO1_ESERCIZIO = 8;
  public static int PQSL_MANPROVVISO1_PROGRESSIVO = 9;
  public static int PQSL_MANPROVVISO1_SETTORE_OPERATIVO = 10;
  public static int PQSL_MANPROVVISO1_SERVIZIO_OPERATIVO = 11;
  public static int PQSL_MANPROVVISO1_UTENTE_INSERIMENTO = 12;
  public static int PQSL_MANPROVVISO1_DATA_INSERIMENTO = 13;
  public static int PQSL_MANPROVVISO1_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_MANPROVVISO1_DATA_ULTIMO_AGG = 15;
  public static int PQSL_MANPROVVISO1_MANPROVABIUO = 16;
  public static int PQSL_MANPROVVISO1_ID_FLUSSO_BT = 17;

  // Table to contain panel selected row: MAN PROV DETTAGLI
  //
  public static int PQRY_MANPROVDETT2 = 3372;
  public static int PQRY_MANPROVDETT2_RS = 3373;
  public static int PQSL_MANPROVDETT2_ESERCIZIO = 0;
  public static int PQSL_MANPROVDETT2_PROGR_MAN_PROV = 1;
  public static int PQSL_MANPROVDETT2_PROGRESSIVO = 2;
  public static int PQSL_MANPROVDETT2_IMPORTO = 3;
  public static int PQSL_MANPROVDETT2_S = 4;
  public static int PQSL_MANPROVDETT2_CAPITOLO = 5;
  public static int PQSL_MANPROVDETT2_ARTICOLO = 6;
  public static int PQSL_MANPROVDETT2_ANNO_IMP = 7;
  public static int PQSL_MANPROVDETT2_NUMERO_IMP = 8;
  public static int PQSL_MANPROVDETT2_ANNO_SUBIMP = 9;
  public static int PQSL_MANPROVDETT2_NUMERO_SUBIMP = 10;
  public static int PQSL_MANPROVDETT2_IMDCONSVILIS = 11;
  public static int PQSL_MANPROVDETT2_CONS_SVILUPPO = 12;
  public static int PQSL_MANPROVDETT2_DESCRIZIONE = 13;
  public static int PQSL_MANPROVDETT2_BENEFICIARIO = 14;
  public static int PQSL_MANPROVDETT2_NUM_QUIETANZA = 15;
  public static int PQSL_MANPROVDETT2_ANNO_DOC = 16;
  public static int PQSL_MANPROVDETT2_NUMERO_DOC = 17;
  public static int PQSL_MANPROVDETT2_TIPO_VINCOLO = 18;
  public static int PQSL_MANPROVDETT2_BOLLO = 19;
  public static int PQSL_MANPROVDETT2_VOCE_ECON = 20;
  public static int PQSL_MANPROVDETT2_FATTORE = 21;
  public static int PQSL_MANPROVDETT2_CENTRO = 22;
  public static int PQSL_MANPROVDETT2_COMPETENZA_DAL = 23;
  public static int PQSL_MANPROVDETT2_COMPETENZA_AL = 24;
  public static int PQSL_MANPROVDETT2_PROGETTO_ID = 25;
  public static int PQSL_MANPROVDETT2_ANNO_LIQ = 26;
  public static int PQSL_MANPROVDETT2_NUMERO_LIQ = 27;
  public static int PQSL_MANPROVDETT2_ANNO_PROG = 28;
  public static int PQSL_MANPROVDETT2_NUMERO_PROG = 29;
  public static int PQSL_MANPROVDETT2_FINANZIAMENTO = 30;
  public static int PQSL_MANPROVDETT2_OPERA = 31;
  public static int PQSL_MANPROVDETT2_UFFICIO = 32;
  public static int PQSL_MANPROVDETT2_CODICE_GESTIONALE = 33;
  public static int PQSL_MANPROVDETT2_UTENTE_INSERIMENTO = 34;
  public static int PQSL_MANPROVDETT2_DATA_INSERIMENTO = 35;
  public static int PQSL_MANPROVDETT2_UTENTE_ULTIMO_AGG = 36;
  public static int PQSL_MANPROVDETT2_DATA_ULTIMO_AGG = 37;
  public static int PQSL_MANPROVDETT2_IMDBSTATO = 38;
  public static int PQSL_MANPROVDETT2_PROGR_UNITA_ORGANIZZATIVA = 39;
  public static int PQSL_MANPROVDETT2_SCHEDA_OBIETTIVO_ID = 40;
  public static int PQSL_MANPROVDETT2_COD_LIVELLO_5 = 41;
  public static int PQSL_MANPROVDETT2_CODICE_COFOG = 42;
  public static int PQSL_MANPROVDETT2_CODICE_EUROPEO = 43;
  public static int PQSL_MANPROVDETT2_MAPRDEIMCOCA = 44;
  public static int PQSL_MANPROVDETT2_CIG = 45;
  public static int PQSL_MANPROVDETT2_MOTIVO_ESCLUSIONE_CIG = 46;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSE14 = 3374;
  public static int QSL_CFDBCFDBSE14_SUMIMDBIMPOR = 0;
  public static int QSL_CFDBCFDBSE14_COUNT = 1;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI7 = 3375;
  public static int QSL_CFDBCFDBSEI7_COUNT = 0;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI5 = 3376;
  public static int QSL_CFDBCFDBSEI5_COUNT = 0;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSE13 = 3377;
  public static int QSL_CFDBCFDBSE13_SUMIMDBIMPOR = 0;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI4 = 3378;
  public static int QSL_CFDBCFDBSEI4_SUMIMDBIMPOR = 0;

  // Table to contain panel selected row: MAN PROV DETTAGLI
  //
  public static int PQRY_MANPROVDETT1 = 3379;
  public static int PQSL_MANPROVDETT1_CAPITOLO = 0;
  public static int PQSL_MANPROVDETT1_ARTICOLO = 1;
  public static int PQSL_MANPROVDETT1_ANNO_IMP = 2;
  public static int PQSL_MANPROVDETT1_NUMERO_IMP = 3;
  public static int PQSL_MANPROVDETT1_ANNO_SUBIMP = 4;
  public static int PQSL_MANPROVDETT1_NUMERO_SUBIMP = 5;
  public static int PQSL_MANPROVDETT1_RECORCAPIART = 6;
  public static int PQSL_MANPROVDETT1_RECORDIMPEGN = 7;
  public static int PQSL_MANPROVDETT1_RECORSUBIMPE = 8;
  public static int PQSL_MANPROVDETT1_RECORDDISPON = 9;
  public static int PQSL_MANPROVDETT1_RECOTOTAPROV = 10;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI183 = 3380;
  public static int PQRY_PARAMETRI183_RS = 3381;
  public static int PQSL_PARAMETRI183_ROWNAMDEDAI1 = 0;
  public static int PQSL_PARAMETRI183_ROWNAMDEDAIM = 1;
  public static int PQSL_PARAMETRI183_ROWNAMDESIMP = 2;
  public static int PQSL_PARAMETRI183_ROWNAMEDELIB = 3;
  public static int PQSL_PARAMETRI183_ROWNAMECAUSA = 4;
  public static int PQSL_PARAMETRI183_ROWNAMEBOLLO = 5;
  public static int PQSL_PARAMETRI183_ROWNAMDATEMI = 6;
  public static int PQSL_PARAMETRI183_ROWNAMEUFFIC = 7;
  public static int PQSL_PARAMETRI183_SEDE_DEL = 8;
  public static int PQSL_PARAMETRI183_NUMERO_DEL = 9;
  public static int PQSL_PARAMETRI183_ANNO_DEL = 10;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO17 = 3382;
  public static int PQSL_NOTEFUNZIO17_MODULO = 0;
  public static int PQSL_NOTEFUNZIO17_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO17_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO17_DESCRIZIONE = 3;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR8 = 3383;
  public static int PQRY_ORDINDACORR8_RS = 3384;
  public static int PQSL_ORDINDACORR8_ROWNAMECAPIT = 0;
  public static int PQSL_ORDINDACORR8_ROWNAMEARTIC = 1;
  public static int PQSL_ORDINDACORR8_ROWNAMNUMIMP = 2;
  public static int PQSL_ORDINDACORR8_ROWNAMANNIMP = 3;
  public static int PQSL_ORDINDACORR8_ROWNAMCODDEB = 4;
  public static int PQSL_ORDINDACORR8_ROWNAMNUMQUI = 5;
  public static int PQSL_ORDINDACORR8_ROWNAMEBOLLO = 6;
  public static int PQSL_ORDINDACORR8_ROWNAMEUFFIC = 7;
  public static int PQSL_ORDINDACORR8_ROWNAMCODLI6 = 8;
  public static int PQSL_ORDINDACORR8_ROWNAMCODEU1 = 9;
  public static int PQSL_ORDINDACORR8_ROWNAMVOCECO = 10;
  public static int PQSL_ORDINDACORR8_ROWNAMECGE = 11;
  public static int PQSL_ORDINDACORR8_ROWNAMEDESCR = 12;
  public static int PQSL_ORDINDACORR8_ROWNAMNUMSUB = 13;
  public static int PQSL_ORDINDACORR8_ROWNAMANNSUB = 14;
  public static int PQSL_ORDINDACORR8_MOTIVO_ESCLUSIONE_CIG = 15;
  public static int PQSL_ORDINDACORR8_TIPO_VINCOLO = 16;
  public static int PQSL_ORDINDACORR8_CODICE_COFOG = 17;

  // Recordset for query: Imdb Escludi Mandati Provvisori
  //
  public static int QRY_IMDESCMANPR1 = 3385;
  public static int QSL_IMDESCMANPR1_VESERCIZIO = 0;
  public static int QSL_IMDESCMANPR1_VPROGRESSIV1 = 1;
  public static int QSL_IMDESCMANPR1_VPROGRESSIVO = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL29 = 3386;
  public static int PQSL_DUAL29_NUOVAESPRESS = 0;

  // Table to contain panel selected row: MAN PROVVISORI
  //
  public static int PQRY_MANPROVVISOR = 3387;
  public static int PQRY_MANPROVVISOR_RS = 3388;
  public static int PQSL_MANPROVVISOR_NOMEOGGETTOI = 0;
  public static int PQSL_MANPROVVISOR_NOMOGGIMPMAN = 1;
  public static int PQSL_MANPROVVISOR_NOMEOGGEDATA = 2;
  public static int PQSL_MANPROVVISOR_NOMEOGGENUME = 3;
  public static int PQSL_MANPROVVISOR_NOMOGGDESBEN = 4;
  public static int PQSL_MANPROVVISOR_NOMEOGGEDESC = 5;
  public static int PQSL_MANPROVVISOR_NOMOGGIMDEOR = 6;
  public static int PQSL_MANPROVVISOR_NOMOGGIMDENE = 7;
  public static int PQSL_MANPROVVISOR_NOMEOGGEESER = 8;
  public static int PQSL_MANPROVVISOR_NOMEOGGEPROG = 9;
  public static int PQSL_MANPROVVISOR_NOMOGGPRODET = 10;
  public static int PQSL_MANPROVVISOR_NOMOGGPRUNOR = 11;
  public static int PQSL_MANPROVVISOR_NOMOGGIDFLBT = 12;

  // Table to contain panel selected row: VISTA MAN ORD COLLEGATI
  //
  public static int PQRY_VISMANORDCOL = 3389;
  public static int PQSL_VISMANORDCOL_VIMAORCOANOR = 0;
  public static int PQSL_VISMANORDCOL_VIMAORCONUOR = 1;
  public static int PQSL_VISMANORDCOL_INFOORD = 2;
  public static int PQSL_VISMANORDCOL_VIMAORCODDAO = 3;
  public static int PQSL_VISMANORDCOL_VIMAORCOANMA = 4;
  public static int PQSL_VISMANORDCOL_VIMAORCONUMA = 5;
  public static int PQSL_VISMANORDCOL_VIMAORCOANAC = 6;
  public static int PQSL_VISMANORDCOL_VIMAORCONUAC = 7;
  public static int PQSL_VISMANORDCOL_INFOACC = 8;
  public static int PQSL_VISMANORDCOL_VISMANORCOUF = 9;
  public static int PQSL_VISMANORDCOL_VIMAORCOTIVI = 10;
  public static int PQSL_VISMANORDCOL_VISMANORCOIM = 11;
  public static int PQSL_VISMANORDCOL_VISMANORCOIN = 12;
  public static int PQSL_VISMANORDCOL_VISMANORCOMO = 13;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI332 = 3390;
  public static int PQRY_PARAMETRI332_RS = 3391;
  public static int PQSL_PARAMETRI332_PARAMNUMEDAL = 0;
  public static int PQSL_PARAMETRI332_PARAMNUMERAL = 1;
  public static int PQSL_PARAMETRI332_PARAMDATADAL = 2;
  public static int PQSL_PARAMETRI332_PARAMDATAAL = 3;
  public static int PQSL_PARAMETRI332_PARAMCONTABI = 4;
  public static int PQSL_PARAMETRI332_PARAMORDINAT = 5;
  public static int PQSL_PARAMETRI332_PARNONININFL = 6;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD6 = 3392;
  public static int PQSL_ORD6_CAPITOLO = 0;
  public static int PQSL_ORD6_ARTICOLO = 1;
  public static int PQSL_ORD6_ANNO_ACC = 2;
  public static int PQSL_ORD6_NUMERO_ACC = 3;
  public static int PQSL_ORD6_ANNO_ORD = 4;
  public static int PQSL_ORD6_NUMERO_ORD = 5;
  public static int PQSL_ORD6_DATA_ORD = 6;
  public static int PQSL_ORD6_TIPO_VINCOLO = 7;
  public static int PQSL_ORD6_ORDTIPVINDES = 8;
  public static int PQSL_ORD6_BOLLO = 9;
  public static int PQSL_ORD6_ORDBOLLODESC = 10;
  public static int PQSL_ORD6_ANNO_MAND_CO = 11;
  public static int PQSL_ORD6_NUMERO_MAND_CO = 12;
  public static int PQSL_ORD6_UFFICIO = 13;
  public static int PQSL_ORD6_ORDUFFICDESC = 14;
  public static int PQSL_ORD6_VOCE_ECON = 15;
  public static int PQSL_ORD6_CODICE_FINANZ = 16;
  public static int PQSL_ORD6_D_DATA_ORD = 17;
  public static int PQSL_ORD6_ANNO_ELENCO = 18;
  public static int PQSL_ORD6_NUMERO_ELENCO = 19;
  public static int PQSL_ORD6_DATA_ELENCO = 20;
  public static int PQSL_ORD6_E = 21;
  public static int PQSL_ORD6_D_DATA_ELENCO = 22;
  public static int PQSL_ORD6_INCASSATO = 23;
  public static int PQSL_ORD6_IMPORTO = 24;
  public static int PQSL_ORD6_ANNO_MAND_CO_INPS = 25;
  public static int PQSL_ORD6_NUMERO_MAND_CO_INPS = 26;
  public static int PQSL_ORD6_ANNO_MAND_CO_INAIL = 27;
  public static int PQSL_ORD6_NUMERO_MAND_CO_INAIL = 28;
  public static int PQSL_ORD6_ANNO_MAND_CO_ADD_REG = 29;
  public static int PQSL_ORD6_NUMERO_MAND_CO_ADD_REG = 30;
  public static int PQSL_ORD6_ANNO_MAND_CO_ADD_COM = 31;
  public static int PQSL_ORD6_NUMERO_MAND_CO_ADD_COM = 32;
  public static int PQSL_ORD6_UTENTE_INSERIMENTO = 33;
  public static int PQSL_ORD6_DATA_INSERIMENTO = 34;
  public static int PQSL_ORD6_UTENTE_ULTIMO_AGG = 35;
  public static int PQSL_ORD6_DATA_ULTIMO_AGG = 36;
  public static int PQSL_ORD6_ANNO_MAND_SP = 37;
  public static int PQSL_ORD6_NUMERO_MAND_SP = 38;
  public static int PQSL_ORD6_UTENTE_COLLEGAMENTO_MAND = 39;
  public static int PQSL_ORD6_DATA_COLLEGAMENTO_MAND = 40;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE1 = 3393;
  public static int PQSL_PRE1_CAPITOLO = 0;
  public static int PQSL_PRE1_ARTICOLO = 1;
  public static int PQSL_PRE1_ANNO_PRE = 2;
  public static int PQSL_PRE1_NUMERO_PRE = 3;
  public static int PQSL_PRE1_ANNO_ACC = 4;
  public static int PQSL_PRE1_NUMERO_ACC = 5;
  public static int PQSL_PRE1_DATA_REG = 6;
  public static int PQSL_PRE1_IMPORTO = 7;
  public static int PQSL_PRE1_PREDESCRIZIO = 8;
  public static int PQSL_PRE1_DEBITORE = 9;
  public static int PQSL_PRE1_PRBERASOESES = 10;
  public static int PQSL_PRE1_ANNO_DOC = 11;
  public static int PQSL_PRE1_NUMERO_DOC = 12;
  public static int PQSL_PRE1_CAUSALE = 13;
  public static int PQSL_PRE1_BOLLO = 14;
  public static int PQSL_PRE1_ANNO_ORD = 15;
  public static int PQSL_PRE1_NUMERO_ORD = 16;
  public static int PQSL_PRE1_NUMERO_INC = 17;
  public static int PQSL_PRE1_DATA_INC = 18;
  public static int PQSL_PRE1_IMPORTO_INC = 19;
  public static int PQSL_PRE1_TIPO_VINCOLO = 20;
  public static int PQSL_PRE1_UFFICIO = 21;
  public static int PQSL_PRE1_PREUFFICDESC = 22;
  public static int PQSL_PRE1_DATA_ESTRATTO_CCP = 23;
  public static int PQSL_PRE1_DATA_CCP = 24;
  public static int PQSL_PRE1_CODICE_FINANZ = 25;
  public static int PQSL_PRE1_CODICE_PTC = 26;
  public static int PQSL_PRE1_NUM_QUIETANZA = 27;
  public static int PQSL_PRE1_PREQUIETDESC = 28;
  public static int PQSL_PRE1_PREINFOQUIET = 29;
  public static int PQSL_PRE1_PIANOCONTINT = 30;
  public static int PQSL_PRE1_E = 31;
  public static int PQSL_PRE1_FAT_ANNO_PROG = 32;
  public static int PQSL_PRE1_FAT_NUMERO_PROG = 33;
  public static int PQSL_PRE1_D_DATA_REG = 34;
  public static int PQSL_PRE1_D_DATA_INC = 35;
  public static int PQSL_PRE1_D_DATA_ESTRATTO_CCP = 36;
  public static int PQSL_PRE1_D_DATA_CCP = 37;
  public static int PQSL_PRE1_NUMERO_CONTABILE = 38;
  public static int PQSL_PRE1_DATA_CONTABILE = 39;
  public static int PQSL_PRE1_PROGRESSIVO_TESO = 40;
  public static int PQSL_PRE1_TIPO_BOLLATO = 41;
  public static int PQSL_PRE1_NUMERO_REG = 42;
  public static int PQSL_PRE1_ANNO_REG = 43;
  public static int PQSL_PRE1_CENTRO = 44;
  public static int PQSL_PRE1_FATTORE = 45;
  public static int PQSL_PRE1_COMPETENZA_DAL = 46;
  public static int PQSL_PRE1_COMPETENZA_AL = 47;
  public static int PQSL_PRE1_COD_IMP_ECO = 48;
  public static int PQSL_PRE1_PROGRESSIVO_CFA = 49;
  public static int PQSL_PRE1_ANNO_DISTINTA = 50;
  public static int PQSL_PRE1_NUMERO_DISTINTA = 51;
  public static int PQSL_PRE1_TIPO_DISTINTA = 52;
  public static int PQSL_PRE1_OPERA = 53;
  public static int PQSL_PRE1_PREOPERADESC = 54;
  public static int PQSL_PRE1_SPESE = 55;
  public static int PQSL_PRE1_COMMISSIONI = 56;
  public static int PQSL_PRE1_ALLEGATI = 57;
  public static int PQSL_PRE1_INFO_TESORIERE = 58;
  public static int PQSL_PRE1_CODICE_GESTIONALE = 59;
  public static int PQSL_PRE1_PRECGEDESCRI = 60;
  public static int PQSL_PRE1_UTENTE_INSERIMENTO = 61;
  public static int PQSL_PRE1_DATA_INSERIMENTO = 62;
  public static int PQSL_PRE1_UTENTE_ULTIMO_AGG = 63;
  public static int PQSL_PRE1_DATA_ULTIMO_AGG = 64;
  public static int PQSL_PRE1_PRECODEU = 65;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD11 = 3394;
  public static int PQSL_ORD11_CAPITOLO = 0;
  public static int PQSL_ORD11_ARTICOLO = 1;
  public static int PQSL_ORD11_ANNO_ACC = 2;
  public static int PQSL_ORD11_NUMERO_ACC = 3;
  public static int PQSL_ORD11_ANNO_ORD = 4;
  public static int PQSL_ORD11_NUMERO_ORD = 5;
  public static int PQSL_ORD11_TIPO_VINCOLO = 6;
  public static int PQSL_ORD11_BOLLO = 7;
  public static int PQSL_ORD11_ANNO_MAND_CO = 8;
  public static int PQSL_ORD11_NUMERO_MAND_CO = 9;
  public static int PQSL_ORD11_UFFICIO = 10;
  public static int PQSL_ORD11_VOCE_ECON = 11;
  public static int PQSL_ORD11_CODICE_FINANZ = 12;
  public static int PQSL_ORD11_D_DATA_ORD = 13;
  public static int PQSL_ORD11_ANNO_ELENCO = 14;
  public static int PQSL_ORD11_NUMERO_ELENCO = 15;
  public static int PQSL_ORD11_DATA_ELENCO = 16;
  public static int PQSL_ORD11_E = 17;
  public static int PQSL_ORD11_D_DATA_ELENCO = 18;
  public static int PQSL_ORD11_INCASSATO = 19;
  public static int PQSL_ORD11_IMPORTO = 20;
  public static int PQSL_ORD11_ANNO_MAND_CO_INPS = 21;
  public static int PQSL_ORD11_NUMERO_MAND_CO_INPS = 22;
  public static int PQSL_ORD11_ANNO_MAND_CO_INAIL = 23;
  public static int PQSL_ORD11_NUMERO_MAND_CO_INAIL = 24;
  public static int PQSL_ORD11_ANNO_MAND_CO_ADD_REG = 25;
  public static int PQSL_ORD11_NUMERO_MAND_CO_ADD_REG = 26;
  public static int PQSL_ORD11_ANNO_MAND_CO_ADD_COM = 27;
  public static int PQSL_ORD11_NUMERO_MAND_CO_ADD_COM = 28;
  public static int PQSL_ORD11_UTENTE_INSERIMENTO = 29;
  public static int PQSL_ORD11_DATA_INSERIMENTO = 30;
  public static int PQSL_ORD11_UTENTE_ULTIMO_AGG = 31;
  public static int PQSL_ORD11_DATA_ULTIMO_AGG = 32;
  public static int PQSL_ORD11_ANNO_MAND_SP = 33;
  public static int PQSL_ORD11_NUMERO_MAND_SP = 34;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE5 = 3395;
  public static int PQRY_PRE5_RS = 3396;
  public static int PQSL_PRE5_CAPITOLO = 0;
  public static int PQSL_PRE5_ARTICOLO = 1;
  public static int PQSL_PRE5_ANNO_PRE = 2;
  public static int PQSL_PRE5_NUMERO_PRE = 3;
  public static int PQSL_PRE5_ANNO_ACC = 4;
  public static int PQSL_PRE5_NUMERO_ACC = 5;
  public static int PQSL_PRE5_IMPORTO = 6;
  public static int PQSL_PRE5_IMPORTO_OLD = 7;
  public static int PQSL_PRE5_DESCRIZIONE = 8;
  public static int PQSL_PRE5_DEBITORE = 9;
  public static int PQSL_PRE5_DEBITORE_OLD = 10;
  public static int PQSL_PRE5_ANNO_DOC = 11;
  public static int PQSL_PRE5_ANNO_DOC_OLD = 12;
  public static int PQSL_PRE5_NUMERO_DOC = 13;
  public static int PQSL_PRE5_NUMERO_DOC_OLD = 14;
  public static int PQSL_PRE5_CAUSALE = 15;
  public static int PQSL_PRE5_ANNO_ORD = 16;
  public static int PQSL_PRE5_NUMERO_ORD = 17;
  public static int PQSL_PRE5_NUMERO_INC = 18;
  public static int PQSL_PRE5_DATA_INC = 19;
  public static int PQSL_PRE5_IMPORTO_INC = 20;
  public static int PQSL_PRE5_DATA_ESTRATTO_CCP = 21;
  public static int PQSL_PRE5_DATA_CCP = 22;
  public static int PQSL_PRE5_CODICE_FINANZ = 23;
  public static int PQSL_PRE5_CODICE_PTC = 24;
  public static int PQSL_PRE5_NUM_QUIETANZA = 25;
  public static int PQSL_PRE5_NUM_QUIETANZA_OLD = 26;
  public static int PQSL_PRE5_E = 27;
  public static int PQSL_PRE5_FAT_ANNO_PROG = 28;
  public static int PQSL_PRE5_FAT_NUMERO_PROG = 29;
  public static int PQSL_PRE5_D_DATA_INC = 30;
  public static int PQSL_PRE5_D_DATA_ESTRATTO_CCP = 31;
  public static int PQSL_PRE5_D_DATA_CCP = 32;
  public static int PQSL_PRE5_NUMERO_CONTABILE = 33;
  public static int PQSL_PRE5_DATA_CONTABILE = 34;
  public static int PQSL_PRE5_PROGRESSIVO_TESO = 35;
  public static int PQSL_PRE5_CENTRO = 36;
  public static int PQSL_PRE5_FATTORE = 37;
  public static int PQSL_PRE5_COMPETENZA_DAL = 38;
  public static int PQSL_PRE5_COMPETENZA_AL = 39;
  public static int PQSL_PRE5_COD_IMP_ECO = 40;
  public static int PQSL_PRE5_PROGRESSIVO_CFA = 41;
  public static int PQSL_PRE5_ANNO_DISTINTA = 42;
  public static int PQSL_PRE5_NUMERO_DISTINTA = 43;
  public static int PQSL_PRE5_TIPO_DISTINTA = 44;
  public static int PQSL_PRE5_VOCE_ECON = 45;
  public static int PQSL_PRE5_OPERA = 46;
  public static int PQSL_PRE5_SPESE = 47;
  public static int PQSL_PRE5_COMMISSIONI = 48;
  public static int PQSL_PRE5_ALLEGATI = 49;
  public static int PQSL_PRE5_INFO_TESORIERE = 50;
  public static int PQSL_PRE5_CODICE_GESTIONALE = 51;
  public static int PQSL_PRE5_COD_LIVELLO_5 = 52;
  public static int PQSL_PRE5_CODICE_EUROPEO = 53;
  public static int PQSL_PRE5_STATO = 54;
  public static int PQSL_PRE5_ESERCIZIO_PROVV = 55;
  public static int PQSL_PRE5_PROGRESSIVO_PROVV = 56;
  public static int PQSL_PRE5_PROGRESSIVO_PROV_DETT = 57;

  // Table to contain panel selected row: Importo
  //
  public static int PQRY_IMPORTO7 = 3397;
  public static int PQRY_IMPORTO7_RS = 3398;
  public static int PQSL_IMPORTO7_IMPORTO = 0;

  // Recordset for query: Imdb Provvisori Ord Da Escludere: Insert into... select
  //
  public static int QRY_IMPRORDAEIIS = 3399;
  public static int QSL_IMPRORDAEIIS_PREESERCPROV = 0;
  public static int QSL_IMPRORDAEIIS_PREPROGRPROV = 1;
  public static int QSL_IMPRORDAEIIS_PREPROPRODET = 2;

  // Table to contain panel selected row: INCASSI
  //
  public static int PQRY_INCASSI1 = 3400;
  public static int PQSL_INCASSI1_PROGRESSIVO = 0;
  public static int PQSL_INCASSI1_ANNO_ORD = 1;
  public static int PQSL_INCASSI1_NUMERO_ORD = 2;
  public static int PQSL_INCASSI1_ANNO_PRE = 3;
  public static int PQSL_INCASSI1_NUMERO_PRE = 4;
  public static int PQSL_INCASSI1_DATA_INC = 5;
  public static int PQSL_INCASSI1_IMPORTO = 6;
  public static int PQSL_INCASSI1_NUMERO_INC = 7;
  public static int PQSL_INCASSI1_DATA_CCP = 8;
  public static int PQSL_INCASSI1_DATA_ESTRATTO_CCP = 9;
  public static int PQSL_INCASSI1_D_DATA_INC = 10;
  public static int PQSL_INCASSI1_D_DATA_CCP = 11;
  public static int PQSL_INCASSI1_D_DATA_ESTRATTO_CCP = 12;
  public static int PQSL_INCASSI1_UTENTE_INSERIMENTO = 13;
  public static int PQSL_INCASSI1_DATA_INSERIMENTO = 14;
  public static int PQSL_INCASSI1_UTENTE_ULTIMO_AGG = 15;
  public static int PQSL_INCASSI1_DATA_ULTIMO_AGG = 16;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI615 = 3401;
  public static int PQRY_PARAMETRI615_RS = 3402;
  public static int PQSL_PARAMETRI615_PARAIDFLUSBT = 0;
  public static int PQSL_PARAMETRI615_PARAMDATADAL = 1;
  public static int PQSL_PARAMETRI615_PARAMDATAAL = 2;

  // Table to contain panel selected row: INCASSI
  //
  public static int PQRY_INCASSI = 3403;
  public static int PQSL_INCASSI_PROGRESSIVO = 0;
  public static int PQSL_INCASSI_ANNO_ORD = 1;
  public static int PQSL_INCASSI_NUMERO_ORD = 2;
  public static int PQSL_INCASSI_ANNO_PRE = 3;
  public static int PQSL_INCASSI_NUMERO_PRE = 4;
  public static int PQSL_INCASSI_DATA_INC = 5;
  public static int PQSL_INCASSI_IMPORTO = 6;
  public static int PQSL_INCASSI_NUMERO_INC = 7;
  public static int PQSL_INCASSI_DATA_CCP = 8;
  public static int PQSL_INCASSI_DATA_ESTRATTO_CCP = 9;
  public static int PQSL_INCASSI_D_DATA_INC = 10;
  public static int PQSL_INCASSI_D_DATA_CCP = 11;
  public static int PQSL_INCASSI_D_DATA_ESTRATTO_CCP = 12;
  public static int PQSL_INCASSI_UTENTE_INSERIMENTO = 13;
  public static int PQSL_INCASSI_DATA_INSERIMENTO = 14;
  public static int PQSL_INCASSI_UTENTE_ULTIMO_AGG = 15;
  public static int PQSL_INCASSI_DATA_ULTIMO_AGG = 16;
  public static int PQSL_INCASSI_INCAIDFLUSBT = 17;
  public static int PQSL_INCASSI_INCADATAVALU = 18;
  public static int PQSL_INCASSI_INCCODRIFOPE = 19;
  public static int PQSL_INCASSI_INCAIMPOBOLL = 20;
  public static int PQSL_INCASSI_INCAIMPOSPES = 21;
  public static int PQSL_INCASSI_INCAIMPOCOMM = 22;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE3 = 3404;
  public static int PQSL_PRE3_CAPITOLO = 0;
  public static int PQSL_PRE3_ARTICOLO = 1;
  public static int PQSL_PRE3_ANNO_PRE = 2;
  public static int PQSL_PRE3_NUMERO_PRE = 3;
  public static int PQSL_PRE3_ANNO_ACC = 4;
  public static int PQSL_PRE3_NUMERO_ACC = 5;
  public static int PQSL_PRE3_DATA_REG = 6;
  public static int PQSL_PRE3_IMPORTO = 7;
  public static int PQSL_PRE3_PREINCASSO = 8;
  public static int PQSL_PRE3_PREDESCRIZIO = 9;
  public static int PQSL_PRE3_DEBITORE = 10;
  public static int PQSL_PRE3_ANNO_DOC = 11;
  public static int PQSL_PRE3_NUMERO_DOC = 12;
  public static int PQSL_PRE3_CAUSALE = 13;
  public static int PQSL_PRE3_ANNO_ORD = 14;
  public static int PQSL_PRE3_NUMERO_ORD = 15;
  public static int PQSL_PRE3_IMPORTO_INC = 16;
  public static int PQSL_PRE3_NUM_QUIETANZA = 17;
  public static int PQSL_PRE3_FAT_ANNO_PROG = 18;
  public static int PQSL_PRE3_FAT_NUMERO_PROG = 19;
  public static int PQSL_PRE3_D_DATA_REG = 20;
  public static int PQSL_PRE3_D_DATA_INC = 21;
  public static int PQSL_PRE3_UTENTE_INSERIMENTO = 22;
  public static int PQSL_PRE3_DATA_INSERIMENTO = 23;
  public static int PQSL_PRE3_UTENTE_ULTIMO_AGG = 24;
  public static int PQSL_PRE3_DATA_ULTIMO_AGG = 25;
  public static int PQSL_PRE3_PRBERASOESES = 26;
  public static int PQSL_PRE3_PREFATDDATDO = 27;
  public static int PQSL_PRE3_DESCRIZIONE = 28;
  public static int PQSL_PRE3_NUMERO_INC = 29;
  public static int PQSL_PRE3_D_DATA_ESTRATTO_CCP = 30;
  public static int PQSL_PRE3_D_DATA_CCP = 31;
  public static int PQSL_PRE3_DATAINCASSO = 32;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD7 = 3405;
  public static int PQSL_ORD7_CAPITOLO = 0;
  public static int PQSL_ORD7_ARTICOLO = 1;
  public static int PQSL_ORD7_ANNO_ACC = 2;
  public static int PQSL_ORD7_NUMERO_ACC = 3;
  public static int PQSL_ORD7_ANNO_ORD = 4;
  public static int PQSL_ORD7_NUMERO_ORD = 5;
  public static int PQSL_ORD7_TIPO_VINCOLO = 6;
  public static int PQSL_ORD7_BOLLO = 7;
  public static int PQSL_ORD7_ANNO_MAND_CO = 8;
  public static int PQSL_ORD7_NUMERO_MAND_CO = 9;
  public static int PQSL_ORD7_UFFICIO = 10;
  public static int PQSL_ORD7_VOCE_ECON = 11;
  public static int PQSL_ORD7_CODICE_FINANZ = 12;
  public static int PQSL_ORD7_D_DATA_ORD = 13;
  public static int PQSL_ORD7_ANNO_ELENCO = 14;
  public static int PQSL_ORD7_NUMERO_ELENCO = 15;
  public static int PQSL_ORD7_DATA_ELENCO = 16;
  public static int PQSL_ORD7_E = 17;
  public static int PQSL_ORD7_D_DATA_ELENCO = 18;
  public static int PQSL_ORD7_INCASSATO = 19;
  public static int PQSL_ORD7_IMPORTO = 20;
  public static int PQSL_ORD7_ANNO_MAND_CO_INPS = 21;
  public static int PQSL_ORD7_NUMERO_MAND_CO_INPS = 22;
  public static int PQSL_ORD7_ANNO_MAND_CO_INAIL = 23;
  public static int PQSL_ORD7_NUMERO_MAND_CO_INAIL = 24;
  public static int PQSL_ORD7_ANNO_MAND_CO_ADD_REG = 25;
  public static int PQSL_ORD7_NUMERO_MAND_CO_ADD_REG = 26;
  public static int PQSL_ORD7_ANNO_MAND_CO_ADD_COM = 27;
  public static int PQSL_ORD7_NUMERO_MAND_CO_ADD_COM = 28;
  public static int PQSL_ORD7_UTENTE_INSERIMENTO = 29;
  public static int PQSL_ORD7_DATA_INSERIMENTO = 30;
  public static int PQSL_ORD7_UTENTE_ULTIMO_AGG = 31;
  public static int PQSL_ORD7_DATA_ULTIMO_AGG = 32;

  // Table to contain panel selected row: PRE
  //
  public static int PQRY_PRE2 = 3406;
  public static int PQRY_PRE2_RS = 3407;
  public static int PQSL_PRE2_CAPITOLO = 0;
  public static int PQSL_PRE2_ARTICOLO = 1;
  public static int PQSL_PRE2_ANNO_PRE = 2;
  public static int PQSL_PRE2_NUMERO_PRE = 3;
  public static int PQSL_PRE2_DATA_REG = 4;
  public static int PQSL_PRE2_IMPORTO = 5;
  public static int PQSL_PRE2_IMPORTO_OLD = 6;
  public static int PQSL_PRE2_DESCRIZIONE = 7;
  public static int PQSL_PRE2_DEBITORE = 8;
  public static int PQSL_PRE2_DEBITORE_OLD = 9;
  public static int PQSL_PRE2_ANNO_DOC = 10;
  public static int PQSL_PRE2_ANNO_DOC_OLD = 11;
  public static int PQSL_PRE2_NUMERO_DOC = 12;
  public static int PQSL_PRE2_NUMERO_DOC_OLD = 13;
  public static int PQSL_PRE2_CAUSALE = 14;
  public static int PQSL_PRE2_ANNO_ORD = 15;
  public static int PQSL_PRE2_NUMERO_ORD = 16;
  public static int PQSL_PRE2_NUMERO_INC = 17;
  public static int PQSL_PRE2_DATA_INC = 18;
  public static int PQSL_PRE2_IMPORTO_INC = 19;
  public static int PQSL_PRE2_DATA_ESTRATTO_CCP = 20;
  public static int PQSL_PRE2_DATA_CCP = 21;
  public static int PQSL_PRE2_CODICE_FINANZ = 22;
  public static int PQSL_PRE2_CODICE_PTC = 23;
  public static int PQSL_PRE2_NUM_QUIETANZA = 24;
  public static int PQSL_PRE2_NUM_QUIETANZA_OLD = 25;
  public static int PQSL_PRE2_E = 26;
  public static int PQSL_PRE2_FAT_ANNO_PROG = 27;
  public static int PQSL_PRE2_FAT_NUMERO_PROG = 28;
  public static int PQSL_PRE2_D_DATA_INC = 29;
  public static int PQSL_PRE2_D_DATA_ESTRATTO_CCP = 30;
  public static int PQSL_PRE2_D_DATA_CCP = 31;
  public static int PQSL_PRE2_NUMERO_CONTABILE = 32;
  public static int PQSL_PRE2_DATA_CONTABILE = 33;
  public static int PQSL_PRE2_PROGRESSIVO_TESO = 34;
  public static int PQSL_PRE2_CENTRO = 35;
  public static int PQSL_PRE2_FATTORE = 36;
  public static int PQSL_PRE2_COMPETENZA_DAL = 37;
  public static int PQSL_PRE2_COMPETENZA_AL = 38;
  public static int PQSL_PRE2_COD_IMP_ECO = 39;
  public static int PQSL_PRE2_PROGRESSIVO_CFA = 40;
  public static int PQSL_PRE2_ANNO_DISTINTA = 41;
  public static int PQSL_PRE2_NUMERO_DISTINTA = 42;
  public static int PQSL_PRE2_TIPO_DISTINTA = 43;
  public static int PQSL_PRE2_OPERA = 44;
  public static int PQSL_PRE2_SPESE = 45;
  public static int PQSL_PRE2_COMMISSIONI = 46;
  public static int PQSL_PRE2_ALLEGATI = 47;
  public static int PQSL_PRE2_INFO_TESORIERE = 48;
  public static int PQSL_PRE2_CODICE_GESTIONALE = 49;
  public static int PQSL_PRE2_ANNO_ACC = 50;
  public static int PQSL_PRE2_NUMERO_ACC = 51;
  public static int PQSL_PRE2_COD_LIVELLO_5 = 52;
  public static int PQSL_PRE2_CODICE_EUROPEO = 53;
  public static int PQSL_PRE2_STATO = 54;

  // Table to contain panel selected row: ACC
  //
  public static int PQRY_ACC1 = 3408;
  public static int PQSL_ACC1_CAPITOLO = 0;
  public static int PQSL_ACC1_ARTICOLO = 1;
  public static int PQSL_ACC1_ANNO_ACC = 2;
  public static int PQSL_ACC1_NUMERO_ACC = 3;
  public static int PQSL_ACC1_ANNO_DEL = 4;
  public static int PQSL_ACC1_NUMERO_DEL = 5;
  public static int PQSL_ACC1_SEDE_DEL = 6;
  public static int PQSL_ACC1_IMPORTO = 7;
  public static int PQSL_ACC1_DESCRIZIONE = 8;
  public static int PQSL_ACC1_DEBITORE = 9;
  public static int PQSL_ACC1_VOCE_ECON = 10;
  public static int PQSL_ACC1_TIPO_VINCOLO = 11;
  public static int PQSL_ACC1_E = 12;
  public static int PQSL_ACC1_D_DATA_REG = 13;
  public static int PQSL_ACC1_CENTRO = 14;
  public static int PQSL_ACC1_FATTORE = 15;
  public static int PQSL_ACC1_COMPETENZA_DAL = 16;
  public static int PQSL_ACC1_COMPETENZA_AL = 17;
  public static int PQSL_ACC1_RILEVANTE_ECO = 18;
  public static int PQSL_ACC1_COD_IMP_ECO = 19;
  public static int PQSL_ACC1_PROGETTO_ID = 20;
  public static int PQSL_ACC1_FINANZIAMENTO = 21;
  public static int PQSL_ACC1_OBIETTIVO = 22;
  public static int PQSL_ACC1_CODICE_GESTIONALE = 23;
  public static int PQSL_ACC1_UTENTE_INSERIMENTO = 24;
  public static int PQSL_ACC1_DATA_INSERIMENTO = 25;
  public static int PQSL_ACC1_SCHEDA_OBIETTIVO_ID = 26;
  public static int PQSL_ACC1_COD_LIVELLO_5 = 27;
  public static int PQSL_ACC1_CODICE_EUROPEO = 28;
  public static int PQSL_ACC1_DATA_REG_ECONOMICA = 29;

  // Table to contain panel selected row: ACC OPE
  //
  public static int PQRY_ACCOPE = 3409;
  public static int PQSL_ACCOPE_ANNO_ACC = 0;
  public static int PQSL_ACCOPE_NUMERO_ACC = 1;
  public static int PQSL_ACCOPE_OPERA = 2;
  public static int PQSL_ACCOPE_FINANZIAMENTO = 3;
  public static int PQSL_ACCOPE_CAPITOLO = 4;
  public static int PQSL_ACCOPE_ARTICOLO = 5;
  public static int PQSL_ACCOPE_E = 6;
  public static int PQSL_ACCOPE_IMPORTO = 7;
  public static int PQSL_ACCOPE_ACCOPEINFOPE = 8;

  // Table to contain panel selected row: Importo
  //
  public static int PQRY_IMPORTO1 = 3410;
  public static int PQRY_IMPORTO1_RS = 3411;
  public static int PQSL_IMPORTO1_IMPORTO = 0;

  // Table to contain panel selected row: Finanziamento
  //
  public static int PQRY_FINANZIAMEN3 = 3412;
  public static int PQRY_FINANZIAMEN3_RS = 3413;
  public static int PQSL_FINANZIAMEN3_FINANZIAMENT = 0;

  // Table to contain panel selected row: GRO
  //
  public static int PQRY_GRO1 = 3414;
  public static int PQSL_GRO1_PROGRESSIVO = 0;
  public static int PQSL_GRO1_GRUPPO = 1;
  public static int PQSL_GRO1_CAPITOLO = 2;
  public static int PQSL_GRO1_GROCAPITOOLD = 3;
  public static int PQSL_GRO1_ARTICOLO = 4;
  public static int PQSL_GRO1_GROARTICOOLD = 5;
  public static int PQSL_GRO1_NUMERO_ACC = 6;
  public static int PQSL_GRO1_GRONUMACCOLD = 7;
  public static int PQSL_GRO1_ANNO_ACC = 8;
  public static int PQSL_GRO1_GROANNACCOLD = 9;
  public static int PQSL_GRO1_DEBITORE = 10;
  public static int PQSL_GRO1_GROCODDEBOLD = 11;
  public static int PQSL_GRO1_BOLLO = 12;
  public static int PQSL_GRO1_IMPORTO = 13;
  public static int PQSL_GRO1_DESCRIZIONE = 14;
  public static int PQSL_GRO1_NUM_QUIETANZA = 15;
  public static int PQSL_GRO1_GROQUIETAOLD = 16;
  public static int PQSL_GRO1_VOCE_ECON = 17;
  public static int PQSL_GRO1_GROVOCECOOLD = 18;
  public static int PQSL_GRO1_TIPO_VINCOLO = 19;
  public static int PQSL_GRO1_CENTRO = 20;
  public static int PQSL_GRO1_FATTORE = 21;
  public static int PQSL_GRO1_COMPETENZA_DAL = 22;
  public static int PQSL_GRO1_COMPETENZA_AL = 23;
  public static int PQSL_GRO1_FINANZIAMENTO = 24;
  public static int PQSL_GRO1_OPERA = 25;
  public static int PQSL_GRO1_CCF = 26;
  public static int PQSL_GRO1_SPESE = 27;
  public static int PQSL_GRO1_GROSPESEOLD = 28;
  public static int PQSL_GRO1_ALLEGATI = 29;
  public static int PQSL_GRO1_COMMISSIONI = 30;
  public static int PQSL_GRO1_INFO_TESORIERE = 31;
  public static int PQSL_GRO1_CODICE_GESTIONALE = 32;
  public static int PQSL_GRO1_NUMERO_CONTABILE = 33;
  public static int PQSL_GRO1_DATA_CONTABILE = 34;
  public static int PQSL_GRO1_UTENTE_INSERIMENTO = 35;
  public static int PQSL_GRO1_DATA_INSERIMENTO = 36;
  public static int PQSL_GRO1_UTENTE_ULTIMO_AGG = 37;
  public static int PQSL_GRO1_DATA_ULTIMO_AGG = 38;
  public static int PQSL_GRO1_ID_OBIETTIVO_GESTIONE = 39;
  public static int PQSL_GRO1_COD_LIVELLO_5 = 40;
  public static int PQSL_GRO1_CODICE_EUROPEO = 41;
  public static int PQSL_GRO1_ORDINAMEDAOP = 42;
  public static int PQSL_GRO1_UFFICIO = 43;
  public static int PQSL_GRO1_ANNO_PRE = 44;
  public static int PQSL_GRO1_NUMERO_ORD = 45;
  public static int PQSL_GRO1_ANNO_ORD = 46;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI279 = 3415;
  public static int PQRY_PARAMETRI279_RS = 3416;
  public static int PQSL_PARAMETRI279_PARACODIGRUP = 0;
  public static int PQSL_PARAMETRI279_PARADESCGRUP = 1;
  public static int PQSL_PARAMETRI279_PARAENTRSPES = 2;
  public static int PQSL_PARAMETRI279_PARAMTIPO = 3;
  public static int PQSL_PARAMETRI279_PARDATULTELA = 4;
  public static int PQSL_PARAMETRI279_PARAMORDINAM = 5;
  public static int PQSL_PARAMETRI279_PARANCDETEME = 6;

  // Recordset for query: CHECKUP
  //
  public static int QRY_CHECKUP2 = 3417;
  public static int QSL_CHECKUP2_CAPITOLORW = 0;
  public static int QSL_CHECKUP2_ARTICOLORW = 1;
  public static int QSL_CHECKUP2_SOMMAIMPORTO = 2;

  // Recordset for query: CHECKUP
  //
  public static int QRY_CHECKUP1 = 3418;
  public static int QSL_CHECKUP1_ANNOACCRW = 0;
  public static int QSL_CHECKUP1_NUMEROACCRW = 1;
  public static int QSL_CHECKUP1_SOMMAIMPORTO = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI283 = 3419;
  public static int PQRY_PARAMETRI283_RS = 3420;
  public static int PQSL_PARAMETRI283_PARDATULTELA = 0;
  public static int PQSL_PARAMETRI283_PARAUNORDPER = 1;
  public static int PQSL_PARAMETRI283_PARADESCGENE = 2;
  public static int PQSL_PARAMETRI283_CAUSALE = 3;
  public static int PQSL_PARAMETRI283_UFFICIO = 4;
  public static int PQSL_PARAMETRI283_PARADATAEMIS = 5;
  public static int PQSL_PARAMETRI283_PARAEMISAUTO = 6;
  public static int PQSL_PARAMETRI283_PARAIMPUECON = 7;
  public static int PQSL_PARAMETRI283_PARACODIDEBI = 8;
  public static int PQSL_PARAMETRI283_PARACONTPATR = 9;
  public static int PQSL_PARAMETRI283_PARAMALLEGAT = 10;
  public static int PQSL_PARAMETRI283_PARAINFOTESO = 11;
  public static int PQSL_PARAMETRI283_NUMERO_CONTABILE = 12;
  public static int PQSL_PARAMETRI283_DATA_CONTABILE = 13;

  // Table to contain panel selected row: GRO
  //
  public static int PQRY_GRO3 = 3421;
  public static int PQSL_GRO3_CAPITOLO = 0;
  public static int PQSL_GRO3_ARTICOLO = 1;
  public static int PQSL_GRO3_ANNO_ACC = 2;
  public static int PQSL_GRO3_NUMERO_ACC = 3;
  public static int PQSL_GRO3_RECORVOCEPEG = 4;
  public static int PQSL_GRO3_RECORDACCERT = 5;
  public static int PQSL_GRO3_RECORDDISPON = 6;
  public static int PQSL_GRO3_RECOTOTAGRUP = 7;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI285 = 3422;
  public static int PQRY_PARAMETRI285_RS = 3423;
  public static int PQSL_PARAMETRI285_PARANCPROREG = 0;
  public static int PQSL_PARAMETRI285_PARAIMPOPROV = 1;
  public static int PQSL_PARAMETRI285_PARATOTADETT = 2;
  public static int PQSL_PARAMETRI285_PARANUMEPROV = 3;
  public static int PQSL_PARAMETRI285_PARADATAPROV = 4;

  // Table to contain panel selected row: Parametri Flusso
  //
  public static int PQRY_PARAMEFLUSS2 = 3424;
  public static int PQRY_PARAMEFLUSS2_RS = 3425;
  public static int PQSL_PARAMEFLUSS2_IDFLUSSOBT = 0;

  // Table to contain panel selected row: ORD PROVVISORI
  //
  public static int PQRY_ORDPROVVISO1 = 3426;
  public static int PQSL_ORDPROVVISO1_RITORNO_CC = 0;
  public static int PQSL_ORDPROVVISO1_ORDPROVVISOI = 1;
  public static int PQSL_ORDPROVVISO1_PROGR_UNITA_ORGANIZZATIVA = 2;
  public static int PQSL_ORDPROVVISO1_IMPORTO = 3;
  public static int PQSL_ORDPROVVISO1_DATA = 4;
  public static int PQSL_ORDPROVVISO1_NUMERO = 5;
  public static int PQSL_ORDPROVVISO1_DES_BEN = 6;
  public static int PQSL_ORDPROVVISO1_DESCRIZIONE = 7;
  public static int PQSL_ORDPROVVISO1_ESERCIZIO = 8;
  public static int PQSL_ORDPROVVISO1_PROGRESSIVO = 9;
  public static int PQSL_ORDPROVVISO1_SETTORE_OPERATIVO = 10;
  public static int PQSL_ORDPROVVISO1_SERVIZIO_OPERATIVO = 11;
  public static int PQSL_ORDPROVVISO1_UTENTE_INSERIMENTO = 12;
  public static int PQSL_ORDPROVVISO1_DATA_INSERIMENTO = 13;
  public static int PQSL_ORDPROVVISO1_UTENTE_ULTIMO_AGG = 14;
  public static int PQSL_ORDPROVVISO1_DATA_ULTIMO_AGG = 15;
  public static int PQSL_ORDPROVVISO1_ORDPROVABIUO = 16;
  public static int PQSL_ORDPROVVISO1_ID_FLUSSO_BT = 17;
  public static int PQSL_ORDPROVVISO1_ORDPROVVNOTE = 18;
  public static int PQSL_ORDPROVVISO1_NOTE = 19;
  public static int PQSL_ORDPROVVISO1_ORDPRORIVPAG = 20;
  public static int PQSL_ORDPROVVISO1_ORPRTODEUAIP = 21;
  public static int PQSL_ORDPROVVISO1_ID_FLUSSO_DEPAG = 22;
  public static int PQSL_ORDPROVVISO1_IUV = 23;
  public static int PQSL_ORDPROVVISO1_DETTAGLI = 24;
  public static int PQSL_ORDPROVVISO1_CAUSALE_PAGO_PA = 25;

  // Table to contain panel selected row: ORD PROV DETTAGLI
  //
  public static int PQRY_ORDPROVDETT3 = 3427;
  public static int PQRY_ORDPROVDETT3_RS = 3428;
  public static int PQSL_ORDPROVDETT3_ESERCIZIO = 0;
  public static int PQSL_ORDPROVDETT3_PROGRESSIVO = 1;
  public static int PQSL_ORDPROVDETT3_PROGR_ORD_PROV = 2;
  public static int PQSL_ORDPROVDETT3_IMPORTO = 3;
  public static int PQSL_ORDPROVDETT3_IMDBIMPOROLD = 4;
  public static int PQSL_ORDPROVDETT3_CAPITOLO = 5;
  public static int PQSL_ORDPROVDETT3_IMDBCAPITOLD = 6;
  public static int PQSL_ORDPROVDETT3_ARTICOLO = 7;
  public static int PQSL_ORDPROVDETT3_IMDBARTICOLD = 8;
  public static int PQSL_ORDPROVDETT3_NUMERO_ACC = 9;
  public static int PQSL_ORDPROVDETT3_IMDNUMACCOLD = 10;
  public static int PQSL_ORDPROVDETT3_ANNO_ACC = 11;
  public static int PQSL_ORDPROVDETT3_IMDANNACCOLD = 12;
  public static int PQSL_ORDPROVDETT3_DESCRIZIONE = 13;
  public static int PQSL_ORDPROVDETT3_DEBITORE = 14;
  public static int PQSL_ORDPROVDETT3_NUM_QUIETANZA = 15;
  public static int PQSL_ORDPROVDETT3_TIPO_VINCOLO = 16;
  public static int PQSL_ORDPROVDETT3_BOLLO = 17;
  public static int PQSL_ORDPROVDETT3_VOCE_ECON = 18;
  public static int PQSL_ORDPROVDETT3_IMDVOCECOOLD = 19;
  public static int PQSL_ORDPROVDETT3_FATTORE = 20;
  public static int PQSL_ORDPROVDETT3_CENTRO = 21;
  public static int PQSL_ORDPROVDETT3_COMPETENZA_DAL = 22;
  public static int PQSL_ORDPROVDETT3_COMPETENZA_AL = 23;
  public static int PQSL_ORDPROVDETT3_ANNO_PROG = 24;
  public static int PQSL_ORDPROVDETT3_NUMERO_PROG = 25;
  public static int PQSL_ORDPROVDETT3_FINANZIAMENTO = 26;
  public static int PQSL_ORDPROVDETT3_OPERA = 27;
  public static int PQSL_ORDPROVDETT3_UFFICIO = 28;
  public static int PQSL_ORDPROVDETT3_CODICE_GESTIONALE = 29;
  public static int PQSL_ORDPROVDETT3_UTENTE_INSERIMENTO = 30;
  public static int PQSL_ORDPROVDETT3_DATA_INSERIMENTO = 31;
  public static int PQSL_ORDPROVDETT3_UTENTE_ULTIMO_AGG = 32;
  public static int PQSL_ORDPROVDETT3_DATA_ULTIMO_AGG = 33;
  public static int PQSL_ORDPROVDETT3_ANNO_PRE = 34;
  public static int PQSL_ORDPROVDETT3_NUMERO_PRE = 35;
  public static int PQSL_ORDPROVDETT3_E = 36;
  public static int PQSL_ORDPROVDETT3_ANNO_DOC = 37;
  public static int PQSL_ORDPROVDETT3_IMDANNDOCOLD = 38;
  public static int PQSL_ORDPROVDETT3_NUMERO_DOC = 39;
  public static int PQSL_ORDPROVDETT3_IMDNUMDOCOLD = 40;
  public static int PQSL_ORDPROVDETT3_IMDBSTATO = 41;
  public static int PQSL_ORDPROVDETT3_ID_OBIETTIVO_GESTIONE = 42;
  public static int PQSL_ORDPROVDETT3_COD_LIVELLO_5 = 43;
  public static int PQSL_ORDPROVDETT3_CODICE_EUROPEO = 44;
  public static int PQSL_ORDPROVDETT3_ORPRDEIMCOCA = 45;
  public static int PQSL_ORDPROVDETT3_DES_BEN = 46;
  public static int PQSL_ORDPROVDETT3_DATA_CCP = 47;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTV95 = 3429;
  public static int QSL_CFASELINTV95_COUNT = 0;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI9 = 3430;
  public static int QSL_CFDBCFDBSEI9_SUMIMDBIMPOR = 0;
  public static int QSL_CFDBCFDBSEI9_COUNT = 1;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSE10 = 3431;
  public static int QSL_CFDBCFDBSE10_COUNT = 0;

  // Recordset for query: Cf4arm DB (Cf4arm DB): Select into variables
  //
  public static int QRY_CFDBCFDBSEI8 = 3432;
  public static int QSL_CFDBCFDBSEI8_COUNT = 0;

  // Table to contain panel selected row: Emissione Ordinativi Da Provvisori
  //
  public static int PQRY_EMISORDDAPR1 = 3433;
  public static int PQRY_EMISORDDAPR1_RS = 3434;
  public static int PQSL_EMISORDDAPR1_ROWNAMDEDAAC = 0;
  public static int PQSL_EMISORDDAPR1_ROWNAMDESACC = 1;
  public static int PQSL_EMISORDDAPR1_ROWNAMECAUSA = 2;
  public static int PQSL_EMISORDDAPR1_ROWNAMDATEMI = 3;
  public static int PQSL_EMISORDDAPR1_ROWNAMEUFFIC = 4;
  public static int PQSL_EMISORDDAPR1_RNEAVPMDSASC = 5;
  public static int PQSL_EMISORDDAPR1_ROWNAMIMPECO = 6;
  public static int PQSL_EMISORDDAPR1_ROWNAMEFATTO = 7;
  public static int PQSL_EMISORDDAPR1_ROWNAMDESUAC = 8;
  public static int PQSL_EMISORDDAPR1_ROWNAMCODDEB = 9;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO14 = 3435;
  public static int PQSL_NOTEFUNZIO14_MODULO = 0;
  public static int PQSL_NOTEFUNZIO14_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO14_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO14_DESCRIZIONE = 3;

  // Table to contain panel selected row: ORD PROV DETTAGLI
  //
  public static int PQRY_ORDPROVDETT2 = 3436;
  public static int PQSL_ORDPROVDETT2_CAPITOLO = 0;
  public static int PQSL_ORDPROVDETT2_ARTICOLO = 1;
  public static int PQSL_ORDPROVDETT2_ANNO_ACC = 2;
  public static int PQSL_ORDPROVDETT2_NUMERO_ACC = 3;
  public static int PQSL_ORDPROVDETT2_RECORVOCEPEG = 4;
  public static int PQSL_ORDPROVDETT2_RECORDACCERT = 5;
  public static int PQSL_ORDPROVDETT2_RECORDDISPON = 6;
  public static int PQSL_ORDPROVDETT2_RECOTOTAPROV = 7;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR2 = 3437;
  public static int PQRY_ORDINDACORR2_RS = 3438;
  public static int PQSL_ORDINDACORR2_ROWNAMECAPIT = 0;
  public static int PQSL_ORDINDACORR2_ROWNAMEARTIC = 1;
  public static int PQSL_ORDINDACORR2_ROWNAMNUMACC = 2;
  public static int PQSL_ORDINDACORR2_ROWNAMANNACC = 3;
  public static int PQSL_ORDINDACORR2_ROWNAMCODDEB = 4;
  public static int PQSL_ORDINDACORR2_ROWNAMNUMQUI = 5;
  public static int PQSL_ORDINDACORR2_ROWNAMEBOLLO = 6;
  public static int PQSL_ORDINDACORR2_ROWNAMEUFFIC = 7;
  public static int PQSL_ORDINDACORR2_ROWNAMCODLI6 = 8;
  public static int PQSL_ORDINDACORR2_ROWNAMCODEU1 = 9;
  public static int PQSL_ORDINDACORR2_ROWNAMVOCECO = 10;
  public static int PQSL_ORDINDACORR2_ROWNAMECGE = 11;
  public static int PQSL_ORDINDACORR2_ROWNAMEDESCR = 12;
  public static int PQSL_ORDINDACORR2_ROWNAMDATCCP = 13;
  public static int PQSL_ORDINDACORR2_TIPO_VINCOLO = 14;

  // Recordset for query: Imdb Escludi Mandati Provvisori
  //
  public static int QRY_IMDESCMANPR2 = 3439;
  public static int QSL_IMDESCMANPR2_VESERCIZIO = 0;
  public static int QSL_IMDESCMANPR2_VPROGRESSIV1 = 1;
  public static int QSL_IMDESCMANPR2_VPROGRESSIVO = 2;

  // Table to contain panel selected row: DUAL
  //
  public static int PQRY_DUAL28 = 3440;
  public static int PQSL_DUAL28_NUOVAESPRESS = 0;

  // Table to contain panel selected row: ORD PROVVISORI
  //
  public static int PQRY_ORDPROVVISOR = 3441;
  public static int PQRY_ORDPROVVISOR_RS = 3442;
  public static int PQSL_ORDPROVVISOR_NOMEOGGETTOI = 0;
  public static int PQSL_ORDPROVVISOR_NOMOGGPRUNOR = 1;
  public static int PQSL_ORDPROVVISOR_NOMOGGIMPORD = 2;
  public static int PQSL_ORDPROVVISOR_NOMEOGGEDATA = 3;
  public static int PQSL_ORDPROVVISOR_NOMEOGGENUME = 4;
  public static int PQSL_ORDPROVVISOR_NOMOGGDESBEN = 5;
  public static int PQSL_ORDPROVVISOR_NOMEOGGEDESC = 6;
  public static int PQSL_ORDPROVVISOR_NOMOGGIMDENE = 7;
  public static int PQSL_ORDPROVVISOR_NOMOGGIMDEOR = 8;
  public static int PQSL_ORDPROVVISOR_NOMEOGGEESER = 9;
  public static int PQSL_ORDPROVVISOR_NOMEOGGEPROG = 10;
  public static int PQSL_ORDPROVVISOR_NOMOGGPRODET = 11;
  public static int PQSL_ORDPROVVISOR_NOMOGGIDFLBT = 12;

  // Table to contain panel selected row: Table
  //
  public static int PQRY_TABLE1 = 3443;
  public static int PQRY_TABLE1_RS = 3444;
  public static int PQSL_TABLE1_ROWNAMDALIST = 0;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR92 = 3445;
  public static int PQRY_PAR92_RS = 3446;
  public static int PQSL_PAR92_ROWNAMORDDAL = 0;
  public static int PQSL_PAR92_ROWNAMEAL = 1;
  public static int PQSL_PAR92_ROWNAMEUFFIC = 2;
  public static int PQSL_PAR92_ROWNAMCODDEB = 3;
  public static int PQSL_PAR92_ROWNAMECAUSA = 4;

  // Table to contain panel selected row: Avvisi Di Riscossione
  //
  public static int PQRY_AVVISDIRISC1 = 3447;
  public static int PQRY_AVVISDIRISC1_RS = 3448;
  public static int PQSL_AVVISDIRISC1_ROWNAMEDAL = 0;
  public static int PQSL_AVVISDIRISC1_ROWNAMEAL = 1;
  public static int PQSL_AVVISDIRISC1_ROWNAMEUFFIC = 2;
  public static int PQSL_AVVISDIRISC1_ROWNAMDATAVV = 3;
  public static int PQSL_AVVISDIRISC1_ROWNAMESTAMP = 4;
  public static int PQSL_AVVISDIRISC1_ROWNAMCODDEB = 5;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE21 = 3449;
  public static int PQRY_NEWTABLE21_RS = 3450;
  public static int PQSL_NEWTABLE21_ROWNAMDIGIEM = 0;
  public static int PQSL_NEWTABLE21_ROWNAMEDISTN = 1;
  public static int PQSL_NEWTABLE21_ROWNAMDADIEM = 2;
  public static int PQSL_NEWTABLE21_ROWNAMORDDAL = 3;
  public static int PQSL_NEWTABLE21_ROWNAMEAL = 4;
  public static int PQSL_NEWTABLE21_ROWNAMDATDIS = 5;
  public static int PQSL_NEWTABLE21_ROWNAMEDANUM = 6;
  public static int PQSL_NEWTABLE21_ROWNAMEUFFIC = 7;
  public static int PQSL_NEWTABLE21_ROWNAMNUODIS = 8;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE27 = 3451;
  public static int PQRY_NEWTABLE27_RS = 3452;
  public static int PQSL_NEWTABLE27_ROWNAMENDAL = 0;
  public static int PQSL_NEWTABLE27_ROWNAMENAL = 1;
  public static int PQSL_NEWTABLE27_ROWNAMEDAL = 2;
  public static int PQSL_NEWTABLE27_ROWNAMEAL = 3;
  public static int PQSL_NEWTABLE27_ROWNAMEUFFIC = 4;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE28 = 3453;
  public static int PQRY_NEWTABLE28_RS = 3454;
  public static int PQSL_NEWTABLE28_ROWNAMENDAL = 0;
  public static int PQSL_NEWTABLE28_ROWNAMENAL = 1;
  public static int PQSL_NEWTABLE28_ROWNAMEDAL = 2;
  public static int PQSL_NEWTABLE28_ROWNAMEAL = 3;
  public static int PQSL_NEWTABLE28_ROWNAMEUFFIC = 4;
  public static int PQSL_NEWTABLE28_ROWNAMCODACO = 5;

  // Table to contain panel selected row: Incasso Completo
  //
  public static int PQRY_INCASSCOMPL1 = 3455;
  public static int PQRY_INCASSCOMPL1_RS = 3456;
  public static int PQSL_INCASSCOMPL1_ROWNAMEDAL = 0;
  public static int PQSL_INCASSCOMPL1_ROWNAMEAL = 1;
  public static int PQSL_INCASSCOMPL1_ROWNAMEEMEAL = 2;
  public static int PQSL_INCASSCOMPL1_ROWNAMEDATA = 3;
  public static int PQSL_INCASSCOMPL1_ROWNAMENUMER = 4;

  // Table to contain panel selected row: Annulla Incassi
  //
  public static int PQRY_ANNULLINCAS1 = 3457;
  public static int PQRY_ANNULLINCAS1_RS = 3458;
  public static int PQSL_ANNULLINCAS1_ROWNAMEDA = 0;
  public static int PQSL_ANNULLINCAS1_ROWNAMEA = 1;
  public static int PQSL_ANNULLINCAS1_ROWNAMEDAL = 2;
  public static int PQSL_ANNULLINCAS1_ROWNAMEAL = 3;
  public static int PQSL_ANNULLINCAS1_ROWNAMDALINC = 4;
  public static int PQSL_ANNULLINCAS1_ROWNAMEALINC = 5;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE32 = 3459;
  public static int PQRY_NEWTABLE32_RS = 3460;
  public static int PQSL_NEWTABLE32_ROWNAMDADIRI = 0;

  // Table to contain panel selected row: Rettifica Accertamento
  //
  public static int PQRY_RETTIFACCER1 = 3461;
  public static int PQRY_RETTIFACCER1_RS = 3462;
  public static int PQSL_RETTIFACCER1_ROWNAMEDAL = 0;
  public static int PQSL_RETTIFACCER1_ROWNAMEAL = 1;
  public static int PQSL_RETTIFACCER1_ROWNAMNUMACC = 2;
  public static int PQSL_RETTIFACCER1_ROWNAMANNACC = 3;

  // Table to contain panel selected row: Ordinativi Da Ritenute
  //
  public static int PQRY_ORDINDARITE2 = 3463;
  public static int PQRY_ORDINDARITE2_RS = 3464;
  public static int PQSL_ORDINDARITE2_ROWNAMTIPRIT = 0;
  public static int PQSL_ORDINDARITE2_ROWNAMEDAL = 1;
  public static int PQSL_ORDINDARITE2_ROWNAMEAL = 2;
  public static int PQSL_ORDINDARITE2_ROWNAMEDATA = 3;
  public static int PQSL_ORDINDARITE2_ROWNAMECAUSA = 4;
  public static int PQSL_ORDINDARITE2_ROWNAMEBOLLO = 5;
  public static int PQSL_ORDINDARITE2_ROWNAMEUFFIC = 6;
  public static int PQSL_ORDINDARITE2_RNEAVPMDSASC = 7;
  public static int PQSL_ORDINDARITE2_RONAUNORPEBE = 8;
  public static int PQSL_ORDINDARITE2_ROWNAMESPESE = 9;
  public static int PQSL_ORDINDARITE2_ROWNAMECOMMI = 10;
  public static int PQSL_ORDINDARITE2_ROWNAMEALLEG = 11;
  public static int PQSL_ORDINDARITE2_ROWNAMINFTES = 12;

  // Table to contain panel selected row: Ordinativi Da Ritenute
  //
  public static int PQRY_ORDINDARITE1 = 3465;
  public static int PQRY_ORDINDARITE1_RS = 3466;
  public static int PQSL_ORDINDARITE1_ROWNAMEDAL = 0;
  public static int PQSL_ORDINDARITE1_ROWNAMEAL = 1;
  public static int PQSL_ORDINDARITE1_ROWNAMEDATA = 2;
  public static int PQSL_ORDINDARITE1_ROWNAMECAUSA = 3;
  public static int PQSL_ORDINDARITE1_ROWNAMEBOLLO = 4;
  public static int PQSL_ORDINDARITE1_ROWNAMEUFFIC = 5;
  public static int PQSL_ORDINDARITE1_RNEAVPMDSASC = 6;
  public static int PQSL_ORDINDARITE1_RONAUNORPEBE = 7;
  public static int PQSL_ORDINDARITE1_ROWNAMESPESE = 8;
  public static int PQSL_ORDINDARITE1_ROWNAMECOMMI = 9;
  public static int PQSL_ORDINDARITE1_ROWNAMEALLEG = 10;
  public static int PQSL_ORDINDARITE1_ROWNAMINFTES = 11;

  // Table to contain panel selected row: ORD
  //
  public static int PQRY_ORD = 3467;
  public static int PQRY_ORD_RS = 3468;
  public static int PQSL_ORD_RECONUMEMAND = 0;
  public static int PQSL_ORD_RENOOGANMASP = 1;
  public static int PQSL_ORD_RECONUMEORDI = 2;
  public static int PQSL_ORD_RECANNNOMOGG = 3;
  public static int PQSL_ORD_RECNOMOGGIMP = 4;
  public static int PQSL_ORD_RECONUMELIQU = 5;
  public static int PQSL_ORD_RECOANNOLIQU = 6;
  public static int PQSL_ORD_RECNOMOGIMIV = 7;
  public static int PQSL_ORD_RECNOMOGANPR = 8;
  public static int PQSL_ORD_RECNOMOGGNUM = 9;

  // Table to contain panel selected row: NOTE FUNZIONALITA
  //
  public static int PQRY_NOTEFUNZIO10 = 3469;
  public static int PQSL_NOTEFUNZIO10_MODULO = 0;
  public static int PQSL_NOTEFUNZIO10_PAGINA = 1;
  public static int PQSL_NOTEFUNZIO10_FUNZIONE = 2;
  public static int PQSL_NOTEFUNZIO10_DESCRIZIONE = 3;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR122 = 3470;
  public static int PQRY_PAR122_RS = 3471;
  public static int PQSL_PAR122_NOMEOGGEFUNZ = 0;
  public static int PQSL_PAR122_NOMOGGDETLIQ = 1;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR5 = 3472;
  public static int PQRY_ORDINDACORR5_RS = 3473;
  public static int PQSL_ORDINDACORR5_ROWNAMEBOLLA = 0;
  public static int PQSL_ORDINDACORR5_ROWNAMEDAL = 1;
  public static int PQSL_ORDINDACORR5_ROWNAMEAL = 2;
  public static int PQSL_ORDINDACORR5_ROWNAMEDATA = 3;
  public static int PQSL_ORDINDACORR5_ROWNAMECAUSA = 4;
  public static int PQSL_ORDINDACORR5_ROWNAMEBOLLO = 5;
  public static int PQSL_ORDINDACORR5_ROWNAMEUFFIC = 6;
  public static int PQSL_ORDINDACORR5_ROWNAMESPESE = 7;
  public static int PQSL_ORDINDACORR5_ROWNAMECOMMI = 8;
  public static int PQSL_ORDINDACORR5_ROWNAMEALLEG = 9;
  public static int PQSL_ORDINDACORR5_ROWNAMINFTES = 10;
  public static int PQSL_ORDINDACORR5_RNEAVPMDSASC = 11;
  public static int PQSL_ORDINDACORR5_ROWNAMIMPECO = 12;
  public static int PQSL_ORDINDACORR5_ROWNAMEFATTO = 13;
  public static int PQSL_ORDINDACORR5_ROWNAMCODDEB = 14;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR93 = 3474;
  public static int PQRY_PAR93_RS = 3475;
  public static int PQSL_PAR93_ROWNAMDADODA = 0;
  public static int PQSL_PAR93_ROWNAMEAL = 1;
  public static int PQSL_PAR93_RONASODOGICO = 2;

  // Table to contain panel selected row: CFA
  //
  public static int PQRY_CFA4 = 3476;
  public static int PQSL_CFA4_IMPORTO = 0;
  public static int PQSL_CFA4_REBERASOESES = 1;
  public static int PQSL_CFA4_NUMERO_DOC = 2;
  public static int PQSL_CFA4_ANNO_DOC = 3;
  public static int PQSL_CFA4_DESCRIZIONE = 4;
  public static int PQSL_CFA4_ESERCIZIO = 5;
  public static int PQSL_CFA4_CAPITOLO = 6;
  public static int PQSL_CFA4_ARTICOLO = 7;
  public static int PQSL_CFA4_ANNO_IMP = 8;
  public static int PQSL_CFA4_NUMERO_IMP = 9;
  public static int PQSL_CFA4_ANNO_SUBIMP = 10;
  public static int PQSL_CFA4_RECORNEWEXPR = 11;
  public static int PQSL_CFA4_ANNO_PROG = 12;
  public static int PQSL_CFA4_NUMERO_PROG = 13;
  public static int PQSL_CFA4_ANNO_ACC = 14;
  public static int PQSL_CFA4_NUMERO_ACC = 15;
  public static int PQSL_CFA4_PROGRESSIVO = 16;
  public static int PQSL_CFA4_D_DATA_DOC = 17;
  public static int PQSL_CFA4_NUMERO_SUBIMP = 18;
  public static int PQSL_CFA4_RECORDCONFER = 19;
  public static int PQSL_CFA4_RECINFVOCPEG = 20;
  public static int PQSL_CFA4_RECORINFOACC = 21;
  public static int PQSL_CFA4_RECORINFODOC = 22;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR1 = 3477;
  public static int PQRY_ORDINDACORR1_RS = 3478;
  public static int PQSL_ORDINDACORR1_ROWNAMECAPIT = 0;
  public static int PQSL_ORDINDACORR1_ROWNAMEARTIC = 1;
  public static int PQSL_ORDINDACORR1_ROWNAMNUMACC = 2;
  public static int PQSL_ORDINDACORR1_ROWNAMANNACC = 3;
  public static int PQSL_ORDINDACORR1_ROWNAMCODEDO = 4;
  public static int PQSL_ORDINDACORR1_ROWNAMEDATA = 5;
  public static int PQSL_ORDINDACORR1_RONADAINCCCP = 6;
  public static int PQSL_ORDINDACORR1_RONADAESCCCP = 7;
  public static int PQSL_ORDINDACORR1_ROWNAMEDESCR = 8;
  public static int PQSL_ORDINDACORR1_ROWNAMECAUSA = 9;
  public static int PQSL_ORDINDACORR1_ROWNAMEBOLLO = 10;
  public static int PQSL_ORDINDACORR1_ROWNAMEUFFIC = 11;
  public static int PQSL_ORDINDACORR1_ROWNAMECONTA = 12;
  public static int PQSL_ORDINDACORR1_ROWNAMDATCON = 13;
  public static int PQSL_ORDINDACORR1_ROWNAMEQUIET = 14;
  public static int PQSL_ORDINDACORR1_ROWNAMESPESE = 15;
  public static int PQSL_ORDINDACORR1_ROWNAMECOMMI = 16;
  public static int PQSL_ORDINDACORR1_ROWNAMEALLEG = 17;
  public static int PQSL_ORDINDACORR1_ROWNAMINFTES = 18;
  public static int PQSL_ORDINDACORR1_RNEAVPMDSASC = 19;
  public static int PQSL_ORDINDACORR1_ROWNAMIMPECO = 20;
  public static int PQSL_ORDINDACORR1_ROWNAMEFATTO = 21;
  public static int PQSL_ORDINDACORR1_ROWNAMCODEAC = 22;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR77 = 3479;
  public static int PQRY_PAR77_RS = 3480;
  public static int PQSL_PAR77_ROWNAMNUMDIS = 0;
  public static int PQSL_PAR77_ROWNAMANNDIS = 1;
  public static int PQSL_PAR77_RONASOMODAIN = 2;
  public static int PQSL_PAR77_ROWNAMPERDAL = 3;
  public static int PQSL_PAR77_ROWNAMEAL = 4;

  // Table to contain panel selected row: MOVIMENTI CASSE GC4
  //
  public static int PQRY_MOVIMCASSGC5 = 3481;
  public static int PQSL_MOVIMCASSGC5_REBERASOESES = 0;
  public static int PQSL_MOVIMCASSGC5_NUMERO_ACCERTAMENTO = 1;
  public static int PQSL_MOVIMCASSGC5_ANNO_ACCERTAMENTO = 2;
  public static int PQSL_MOVIMCASSGC5_CAPITOLO = 3;
  public static int PQSL_MOVIMCASSGC5_ARTICOLO = 4;
  public static int PQSL_MOVIMCASSGC5_IMPORTO = 5;
  public static int PQSL_MOVIMCASSGC5_RECORDORDINA = 6;
  public static int PQSL_MOVIMCASSGC5_RECORINFOACC = 7;
  public static int PQSL_MOVIMCASSGC5_RECINFVOCPEG = 8;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI660 = 3482;
  public static int PQRY_PARAMETRI660_RS = 3483;
  public static int PQSL_PARAMETRI660_PARAMESERCIZ = 0;

  // Table to contain panel selected row: Distinte
  //
  public static int PQRY_DISTINTE = 3484;
  public static int PQSL_DISTINTE_BENDISVEANDI = 0;
  public static int PQSL_DISTINTE_BENDISVENUDI = 1;
  public static int PQSL_DISTINTE_BENDISVEDADA = 2;
  public static int PQSL_DISTINTE_BENDISVERDAA = 3;
  public static int PQSL_DISTINTE_INCASSATA = 4;

  // Table to contain panel selected row: Ordinativi Da Corrispettivi
  //
  public static int PQRY_ORDINDACORR4 = 3485;
  public static int PQRY_ORDINDACORR4_RS = 3486;
  public static int PQSL_ORDINDACORR4_ROWNAMEBOLLA = 0;
  public static int PQSL_ORDINDACORR4_ROWNAMEDATA = 1;
  public static int PQSL_ORDINDACORR4_ROWNAMECAUSA = 2;
  public static int PQSL_ORDINDACORR4_ROWNAMEBOLLO = 3;
  public static int PQSL_ORDINDACORR4_ROWNAMEUFFIC = 4;
  public static int PQSL_ORDINDACORR4_ROWNAMESPESE = 5;
  public static int PQSL_ORDINDACORR4_ROWNAMECOMMI = 6;
  public static int PQSL_ORDINDACORR4_ROWNAMEALLEG = 7;
  public static int PQSL_ORDINDACORR4_ROWNAMINFTES = 8;
  public static int PQSL_ORDINDACORR4_RNEAVPMDSASC = 9;
  public static int PQSL_ORDINDACORR4_ROWNAMIMPECO = 10;
  public static int PQSL_ORDINDACORR4_ROWNAMEFATTO = 11;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR90 = 3487;
  public static int PQRY_PAR90_RS = 3488;
  public static int PQSL_PAR90_ROWNAMEDAL = 0;
  public static int PQSL_PAR90_ROWNAMEAL = 1;
  public static int PQSL_PAR90_ROWNAMECAPIT = 2;
  public static int PQSL_PAR90_ROWNAMEARTIC = 3;
  public static int PQSL_PAR90_ROWNAMEDETTA = 4;
  public static int PQSL_PAR90_ROWNAMEVARIA = 5;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR82 = 3489;
  public static int PQRY_PAR82_RS = 3490;
  public static int PQSL_PAR82_ROWNAMEDAL = 0;
  public static int PQSL_PAR82_ROWNAMEAL = 1;
  public static int PQSL_PAR82_ROWNAMECAPIT = 2;
  public static int PQSL_PAR82_ROWNAMEARTIC = 3;
  public static int PQSL_PAR82_ROWNAMETITOL = 4;
  public static int PQSL_PAR82_ROWNAMEORDIN = 5;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE23 = 3491;
  public static int PQRY_NEWTABLE23_RS = 3492;
  public static int PQSL_NEWTABLE23_ROWNAMEEMEAL = 0;
  public static int PQSL_NEWTABLE23_ROWNAMNOINAL = 1;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR91 = 3493;
  public static int PQRY_PAR91_RS = 3494;
  public static int PQSL_PAR91_ROWNAMEDAL = 0;
  public static int PQSL_PAR91_ROWNAMEAL = 1;
  public static int PQSL_PAR91_ROWNAMECAPIT = 2;
  public static int PQSL_PAR91_ROWNAMEARTIC = 3;
  public static int PQSL_PAR91_ROWNAMNUMACC = 4;
  public static int PQSL_PAR91_ROWNAMANNACC = 5;
  public static int PQSL_PAR91_ROWNAMEPROTO = 6;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE25 = 3495;
  public static int PQRY_NEWTABLE25_RS = 3496;
  public static int PQSL_NEWTABLE25_ROWNAMEDAL = 0;
  public static int PQSL_NEWTABLE25_ROWNAMEAL = 1;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE46 = 3497;
  public static int PQRY_NEWTABLE46_RS = 3498;
  public static int PQSL_NEWTABLE46_ROWNAMEDAL = 0;
  public static int PQSL_NEWTABLE46_ROWNAMEAL = 1;
  public static int PQSL_NEWTABLE46_ROWNAMEUFFIC = 2;
  public static int PQSL_NEWTABLE46_ROWNAMDISNUM = 3;

  // Table to contain panel selected row: Estrazione Imputazioni
  //
  public static int PQRY_ESTRAZIMPUT1 = 3499;
  public static int PQRY_ESTRAZIMPUT1_RS = 3500;
  public static int PQSL_ESTRAZIMPUT1_ROWNAMDALIST = 0;
  public static int PQSL_ESTRAZIMPUT1_ROWNAMEGRUPP = 1;
  public static int PQSL_ESTRAZIMPUT1_ROWNAMEBOLLO = 2;
  public static int PQSL_ESTRAZIMPUT1_ROWNAMCODDEB = 3;

  // Table to contain panel selected row: Estratto C C P
  //
  public static int PQRY_ESTRATTOCCP1 = 3501;
  public static int PQRY_ESTRATTOCCP1_RS = 3502;
  public static int PQSL_ESTRATTOCCP1_ROWNAMEDAL = 0;
  public static int PQSL_ESTRATTOCCP1_ROWNAMEAL = 1;
  public static int PQSL_ESTRATTOCCP1_ROWNAMEDETTA = 2;
  public static int PQSL_ESTRATTOCCP1_ROWNAMPERCAU = 3;

  // Table to contain panel selected row: MAN ORD COMMUTAZIONE
  //
  public static int PQRY_MANORDCOMMUT = 3503;
  public static int PQRY_MANORDCOMMUT_RS = 3504;
  public static int PQSL_MANORDCOMMUT_PROGRESSIVO = 0;
  public static int PQSL_MANORDCOMMUT_ANNO_MAND = 1;
  public static int PQSL_MANORDCOMMUT_NUMERO_MAND = 2;
  public static int PQSL_MANORDCOMMUT_ANNO_ORD = 3;
  public static int PQSL_MANORDCOMMUT_NUMERO_ORD = 4;
  public static int PQSL_MANORDCOMMUT_IMPORTO = 5;
  public static int PQSL_MANORDCOMMUT_UTENTE_INSERIMENTO = 6;
  public static int PQSL_MANORDCOMMUT_DATA_INSERIMENTO = 7;
  public static int PQSL_MANORDCOMMUT_UTENTE_ULTIMO_AGG = 8;
  public static int PQSL_MANORDCOMMUT_DATA_ULTIMO_AGG = 9;
  public static int PQSL_MANORDCOMMUT_MANORDCOMSTA = 10;

  // Recordset for query: Cfaid: Select into variables
  //
  public static int QRY_CFASELINTVA4 = 3505;
  public static int QSL_CFASELINTVA4_COUNT = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI593 = 3506;
  public static int PQRY_PARAMETRI593_RS = 3507;
  public static int PQSL_PARAMETRI593_PARAMANDREVE = 0;
  public static int PQSL_PARAMETRI593_PARDATELADAL = 1;
  public static int PQSL_PARAMETRI593_PARADATELAAL = 2;
  public static int PQSL_PARAMETRI593_PARATIPOINVI = 3;
  public static int PQSL_PARAMETRI593_PARASTATFLUS = 4;
  public static int PQSL_PARAMETRI593_PARASTATDETT = 5;
  public static int PQSL_PARAMETRI593_PARAMIDFLUSS = 6;
  public static int PQSL_PARAMETRI593_PARAULTISTAT = 7;

  // Table to contain panel selected row: ELABORAZIONI MANORD INF
  //
  public static int PQRY_ELABOMANOINF = 3508;
  public static int PQSL_ELABOMANOINF_ELAMANINIDEL = 0;
  public static int PQSL_ELABOMANOINF_ICONA = 1;
  public static int PQSL_ELABOMANOINF_ELAMANINANMA = 2;
  public static int PQSL_ELABOMANOINF_ELMAINNUMADA = 3;
  public static int PQSL_ELABOMANOINF_ELAMAINNUMAA = 4;
  public static int PQSL_ELABOMANOINF_ELAMANINNUDI = 5;
  public static int PQSL_ELABOMANOINF_ELAMANINDADA = 6;
  public static int PQSL_ELABOMANOINF_ELAMANINFDAA = 7;
  public static int PQSL_ELABOMANOINF_ELAMANINTIMO = 8;
  public static int PQSL_ELABOMANOINF_ELAMANINTIEL = 9;
  public static int PQSL_ELABOMANOINF_ELAMANINNOFI = 10;
  public static int PQSL_ELABOMANOINF_ELMAINDAFIEL = 11;
  public static int PQSL_ELABOMANOINF_ELMAINIDIDFL = 12;
  public static int PQSL_ELABOMANOINF_ELAMANINFSTA = 13;
  public static int PQSL_ELABOMANOINF_ELAMANINIDGD = 14;

  // Table to contain panel selected row: MAN INF TESTATA
  //
  public static int PQRY_MANINFTESTA2 = 3509;
  public static int PQSL_MANINFTESTA2_MANINFTEIDRE = 0;
  public static int PQSL_MANINFTESTA2_ICONA = 1;
  public static int PQSL_MANINFTESTA2_MANINFTEANMA = 2;
  public static int PQSL_MANINFTESTA2_MANINFTENUMA = 3;
  public static int PQSL_MANINFTESTA2_MANINFTEDAMA = 4;
  public static int PQSL_MANINFTESTA2_MANINFTESIMP = 5;
  public static int PQSL_MANINFTESTA2_MANINFTEMAPA = 6;
  public static int PQSL_MANINFTESTA2_MANINFTENUIM = 7;
  public static int PQSL_MANINFTESTA2_MANINFTEANIM = 8;
  public static int PQSL_MANINFTESTA2_MAINTEIDIDFL = 9;
  public static int PQSL_MANINFTESTA2_MANINFTESTDE = 10;
  public static int PQSL_MANINFTESTA2_MAINTEIDDEFL = 11;
  public static int PQSL_MANINFTESTA2_MANINFTESTFL = 12;
  public static int PQSL_MANINFTESTA2_MAINTEELMITE = 13;

  // Table to contain panel selected row: ORD INF TESTATA
  //
  public static int PQRY_ORDINFTESTA1 = 3510;
  public static int PQSL_ORDINFTESTA1_IDENTIFICATIVO_RECORD = 0;
  public static int PQSL_ORDINFTESTA1_ICONA = 1;
  public static int PQSL_ORDINFTESTA1_ANNO_ORD = 2;
  public static int PQSL_ORDINFTESTA1_NUMERO_ORD = 3;
  public static int PQSL_ORDINFTESTA1_DATA_ORD = 4;
  public static int PQSL_ORDINFTESTA1_IMPORTO = 5;
  public static int PQSL_ORDINFTESTA1_ORDINFTEORIN = 6;
  public static int PQSL_ORDINFTESTA1_ANNO_ACC = 7;
  public static int PQSL_ORDINFTESTA1_NUMERO_ACC = 8;
  public static int PQSL_ORDINFTESTA1_ORINTEIDIDFL = 9;
  public static int PQSL_ORDINFTESTA1_STATO = 10;
  public static int PQSL_ORDINFTESTA1_ORINTEIDDEFL = 11;
  public static int PQSL_ORDINFTESTA1_ORDINFTESTFL = 12;
  public static int PQSL_ORDINFTESTA1_ORINTEELMITE = 13;

  // Table to contain panel selected row: MAN INF TESTATA
  //
  public static int PQRY_MANINFTESTAT = 3511;
  public static int PQSL_MANINFTESTAT_MANINFTEIDRE = 0;
  public static int PQSL_MANINFTESTAT_MANINFTEANMA = 1;
  public static int PQSL_MANINFTESTAT_MANINFTENUMA = 2;
  public static int PQSL_MANINFTESTAT_MANINFTEDAMA = 3;
  public static int PQSL_MANINFTESTAT_MANINFTESCAP = 4;
  public static int PQSL_MANINFTESTAT_MANINFTESART = 5;
  public static int PQSL_MANINFTESTAT_MANINFTENUIM = 6;
  public static int PQSL_MANINFTESTAT_MANINFTEANIM = 7;
  public static int PQSL_MANINFTESTAT_MANINFTENULI = 8;
  public static int PQSL_MANINFTESTAT_MANINFTEANLI = 9;
  public static int PQSL_MANINFTESTAT_MANINFTECAIM = 10;
  public static int PQSL_MANINFTESTAT_MANINFTEIMLI = 11;
  public static int PQSL_MANINFTESTAT_MANINFTELIBE = 12;
  public static int PQSL_MANINFTESTAT_MAINTELINUQU = 13;
  public static int PQSL_MANINFTESTAT_MAINTELICOL5 = 14;
  public static int PQSL_MANINFTESTAT_MAINTELICOCO = 15;
  public static int PQSL_MANINFTESTAT_MAINTELICOEU = 16;
  public static int PQSL_MANINFTESTAT_MAINTELITIVI = 17;
  public static int PQSL_MANINFTESTAT_MANINFTELICI = 18;
  public static int PQSL_MANINFTESTAT_MANINFTELICU = 19;
  public static int PQSL_MANINFTESTAT_MANINFTELIUF = 20;
  public static int PQSL_MANINFTESTAT_MAINTEIDIDFL = 21;
  public static int PQSL_MANINFTESTAT_MANINFTESSTA = 22;
  public static int PQSL_MANINFTESTAT_MAINTELIDDAR = 23;
  public static int PQSL_MANINFTESTAT_MAINTELIPRTE = 24;
  public static int PQSL_MANINFTESTAT_MANINFTENUDO = 25;
  public static int PQSL_MANINFTESTAT_MANINFTEANDO = 26;
  public static int PQSL_MANINFTESTAT_MAINTEFANUPR = 27;
  public static int PQSL_MANINFTESTAT_MAINTEFAANPR = 28;
  public static int PQSL_MANINFTESTAT_MAINTEELMITE = 29;

  // Table to contain panel selected row: ORD INF TESTATA
  //
  public static int PQRY_ORDINFTESTAT = 3512;
  public static int PQSL_ORDINFTESTAT_IDENTIFICATIVO_RECORD = 0;
  public static int PQSL_ORDINFTESTAT_ANNO_ORD = 1;
  public static int PQSL_ORDINFTESTAT_NUMERO_ORD = 2;
  public static int PQSL_ORDINFTESTAT_DATA_ORD = 3;
  public static int PQSL_ORDINFTESTAT_ORDINFTESCAP = 4;
  public static int PQSL_ORDINFTESTAT_ORDINFTESART = 5;
  public static int PQSL_ORDINFTESTAT_NUMERO_ACC = 6;
  public static int PQSL_ORDINFTESTAT_ANNO_ACC = 7;
  public static int PQSL_ORDINFTESTAT_ORDINFTEIMPR = 8;
  public static int PQSL_ORDINFTESTAT_ORDINFTEPRDE = 9;
  public static int PQSL_ORDINFTESTAT_ORINTEPRNUQU = 10;
  public static int PQSL_ORDINFTESTAT_ORINTEPRCOL5 = 11;
  public static int PQSL_ORDINFTESTAT_ORINTEPRCOEU = 12;
  public static int PQSL_ORDINFTESTAT_ORDINFTEPRUF = 13;
  public static int PQSL_ORDINFTESTAT_STATO = 14;
  public static int PQSL_ORDINFTESTAT_ORINTEIDIDFL = 15;
  public static int PQSL_ORDINFTESTAT_ORINTEPRPRTE = 16;
  public static int PQSL_ORDINFTESTAT_ORDINFTEANDO = 17;
  public static int PQSL_ORDINFTESTAT_ORDINFTENUDO = 18;
  public static int PQSL_ORDINFTESTAT_ORINTEFAANPR = 19;
  public static int PQSL_ORDINFTESTAT_ORINTEFANUPR = 20;
  public static int PQSL_ORDINFTESTAT_ORINTEELMITE = 21;

  // Recordset for query: Parametri Flusso
  //
  public static int QRY_PARAMEFLUSS4 = 3513;
  public static int QSL_PARAMEFLUSS4_IDFLUSSO = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI595 = 3514;
  public static int PQRY_PARAMETRI595_RS = 3515;
  public static int PQSL_PARAMETRI595_PARAMSCARICA = 0;
  public static int PQSL_PARAMETRI595_PARAMELABORA = 1;
  public static int PQSL_PARAMETRI595_PARDATFLUDAL = 2;
  public static int PQSL_PARAMETRI595_PARADATFLUAL = 3;

  // Table to contain panel selected row: ELABORAZIONI OPI
  //
  public static int PQRY_ELABORAZIOPI = 3516;
  public static int PQSL_ELABORAZIOPI_ELABOPIIDELA = 0;
  public static int PQSL_ELABORAZIOPI_VISUALIZHTML = 1;
  public static int PQSL_ELABORAZIOPI_ELAOPIDATFLU = 2;
  public static int PQSL_ELABORAZIOPI_ELAOPIIDFLBT = 3;
  public static int PQSL_ELABORAZIOPI_ELAOPICOABBT = 4;
  public static int PQSL_ELABORAZIOPI_ELAOPIDAINPE = 5;
  public static int PQSL_ELABORAZIOPI_ELAOPIDAFIPE = 6;
  public static int PQSL_ELABORAZIOPI_ELABOOPISTAT = 7;
  public static int PQSL_ELABORAZIOPI_ELABOPIIDGDM = 8;
  public static int PQSL_ELABORAZIOPI_ELAOPIFILXML = 9;
  public static int PQSL_ELABORAZIOPI_ELABOOPIESER = 10;
  public static int PQSL_ELABORAZIOPI_ELABOOPIPAGI = 11;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABL13 = 3517;
  public static int PQRY_FILTRITABL13_RS = 3518;
  public static int PQSL_FILTRITABL13_ANNO_MAND = 0;
  public static int PQSL_FILTRITABL13_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABL13_ROWNAMDATVAR = 2;
  public static int PQSL_FILTRITABL13_ROWNAMDATMAN = 3;

  // Table to contain panel selected row: IMDB Annulli
  //
  public static int PQRY_IMDBANNULLI4 = 3519;
  public static int PQRY_IMDBANNULLI4_RS = 3520;
  public static int PQSL_IMDBANNULLI4_PROGRESSIVO = 0;
  public static int PQSL_IMDBANNULLI4_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBANNULLI4_IMPORTO = 2;
  public static int PQSL_IMDBANNULLI4_VERSIONE = 3;
  public static int PQSL_IMDBANNULLI4_TIPO = 4;
  public static int PQSL_IMDBANNULLI4_DATA = 5;
  public static int PQSL_IMDBANNULLI4_ROWNAMOLNUMA = 6;
  public static int PQSL_IMDBANNULLI4_ROWNAMOLANMA = 7;
  public static int PQSL_IMDBANNULLI4_ROWNAMOLPRTE = 8;
  public static int PQSL_IMDBANNULLI4_ROWNAMOLDDAT = 9;
  public static int PQSL_IMDBANNULLI4_DATA_INVIO = 10;
  public static int PQSL_IMDBANNULLI4_PROGRESSIVO_TESO = 11;
  public static int PQSL_IMDBANNULLI4_ROWNAMNUOANN = 12;
  public static int PQSL_IMDBANNULLI4_ROWNAMDATMOD = 13;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABLE8 = 3521;
  public static int PQRY_FILTRITABLE8_RS = 3522;
  public static int PQSL_FILTRITABLE8_ANNO_MAND = 0;
  public static int PQSL_FILTRITABLE8_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABLE8_ROWNAMDATVAR = 2;
  public static int PQSL_FILTRITABLE8_ROWNAMDATMAN = 3;

  // Table to contain panel selected row: IMDB Variazione
  //
  public static int PQRY_IMDBVARIAZI4 = 3523;
  public static int PQRY_IMDBVARIAZI4_RS = 3524;
  public static int PQSL_IMDBVARIAZI4_PROGRESSIVO = 0;
  public static int PQSL_IMDBVARIAZI4_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBVARIAZI4_IMPORTO = 2;
  public static int PQSL_IMDBVARIAZI4_VERSIONE = 3;
  public static int PQSL_IMDBVARIAZI4_TIPO = 4;
  public static int PQSL_IMDBVARIAZI4_DATA = 5;
  public static int PQSL_IMDBVARIAZI4_ROWNAMOLNUMA = 6;
  public static int PQSL_IMDBVARIAZI4_ROWNAMOLANMA = 7;
  public static int PQSL_IMDBVARIAZI4_ROWNAMOLPRTE = 8;
  public static int PQSL_IMDBVARIAZI4_ROWNAMOLDDAT = 9;
  public static int PQSL_IMDBVARIAZI4_DATA_INVIO = 10;
  public static int PQSL_IMDBVARIAZI4_PROGRESSIVO_TESO = 11;
  public static int PQSL_IMDBVARIAZI4_NUMERO_MAND = 12;
  public static int PQSL_IMDBVARIAZI4_ANNO_MAND = 13;
  public static int PQSL_IMDBVARIAZI4_ROWNAMNUOVAR = 14;
  public static int PQSL_IMDBVARIAZI4_ROWNAMEMODIF = 15;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABL18 = 3525;
  public static int PQRY_FILTRITABL18_RS = 3526;
  public static int PQSL_FILTRITABL18_ANNO_MAND = 0;
  public static int PQSL_FILTRITABL18_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABL18_ROWNAMDATSOS = 2;
  public static int PQSL_FILTRITABL18_ROWNAMDATMAN = 3;

  // Table to contain panel selected row: IMDB Sostituzioni
  //
  public static int PQRY_IMDBSOSTITU4 = 3527;
  public static int PQRY_IMDBSOSTITU4_RS = 3528;
  public static int PQSL_IMDBSOSTITU4_PROGRESSIVO = 0;
  public static int PQSL_IMDBSOSTITU4_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBSOSTITU4_IMPORTO = 2;
  public static int PQSL_IMDBSOSTITU4_NUMERO_MAND = 3;
  public static int PQSL_IMDBSOSTITU4_ANNO_MAND = 4;
  public static int PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO = 5;
  public static int PQSL_IMDBSOSTITU4_VERSIONE = 6;
  public static int PQSL_IMDBSOSTITU4_TIPO = 7;
  public static int PQSL_IMDBSOSTITU4_DATA = 8;
  public static int PQSL_IMDBSOSTITU4_ANNO_MAND_SOST = 9;
  public static int PQSL_IMDBSOSTITU4_NUMERO_MAND_SOST = 10;
  public static int PQSL_IMDBSOSTITU4_PROGRESSIVO_TESO_SOST = 11;
  public static int PQSL_IMDBSOSTITU4_ROWNAMOLNUMA = 12;
  public static int PQSL_IMDBSOSTITU4_ROWNAMOLANMA = 13;
  public static int PQSL_IMDBSOSTITU4_ROWNAMOLPRTE = 14;
  public static int PQSL_IMDBSOSTITU4_ROWNAMOLDDAT = 15;
  public static int PQSL_IMDBSOSTITU4_ROWNAMEMODIF = 16;

  // Table to contain panel selected row: MAN INF STATO
  //
  public static int PQRY_MANINFSTATO1 = 3529;
  public static int PQSL_MANINFSTATO1_ANNO_MAND = 0;
  public static int PQSL_MANINFSTATO1_NUMERO_MAND = 1;
  public static int PQSL_MANINFSTATO1_PROGRESSIVO_TESO = 2;
  public static int PQSL_MANINFSTATO1_DATA = 3;
  public static int PQSL_MANINFSTATO1_NUMERO_MAND_SOST = 4;
  public static int PQSL_MANINFSTATO1_PROGRESSIVO_TESO_SOST = 5;
  public static int PQSL_MANINFSTATO1_TIPO = 6;
  public static int PQSL_MANINFSTATO1_RECOTIPOEXPR = 7;
  public static int PQSL_MANINFSTATO1_RECTIPDESEXP = 8;
  public static int PQSL_MANINFSTATO1_PROGRESSIVO = 9;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI255 = 3530;
  public static int PQRY_PARAMETRI255_RS = 3531;
  public static int PQSL_PARAMETRI255_ROWNAMETIPO = 0;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABL12 = 3532;
  public static int PQRY_FILTRITABL12_RS = 3533;
  public static int PQSL_FILTRITABL12_ANNO_MAND = 0;
  public static int PQSL_FILTRITABL12_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABL12_ROWNAMDATVAR = 2;
  public static int PQSL_FILTRITABL12_ROWNAMDATORD = 3;

  // Table to contain panel selected row: IMDB Annulli
  //
  public static int PQRY_IMDBANNULLI2 = 3534;
  public static int PQRY_IMDBANNULLI2_RS = 3535;
  public static int PQSL_IMDBANNULLI2_PROGRESSIVO = 0;
  public static int PQSL_IMDBANNULLI2_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBANNULLI2_IMPORTO = 2;
  public static int PQSL_IMDBANNULLI2_VERSIONE = 3;
  public static int PQSL_IMDBANNULLI2_TIPO = 4;
  public static int PQSL_IMDBANNULLI2_DATA = 5;
  public static int PQSL_IMDBANNULLI2_ROWNAMOLNUMA = 6;
  public static int PQSL_IMDBANNULLI2_ROWNAMOLANMA = 7;
  public static int PQSL_IMDBANNULLI2_ROWNAMOLPRTE = 8;
  public static int PQSL_IMDBANNULLI2_ROWNAMOLDDAT = 9;
  public static int PQSL_IMDBANNULLI2_DATA_INVIO = 10;
  public static int PQSL_IMDBANNULLI2_PROGRESSIVO_TESO = 11;
  public static int PQSL_IMDBANNULLI2_ROWNAMNUOANN = 12;
  public static int PQSL_IMDBANNULLI2_ROWNAMDATMOD = 13;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABLE7 = 3536;
  public static int PQRY_FILTRITABLE7_RS = 3537;
  public static int PQSL_FILTRITABLE7_ANNO_MAND = 0;
  public static int PQSL_FILTRITABLE7_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABLE7_ROWNAMDATVAR = 2;
  public static int PQSL_FILTRITABLE7_ROWNAMDATORD = 3;

  // Table to contain panel selected row: IMDB Variazione
  //
  public static int PQRY_IMDBVARIAZI2 = 3538;
  public static int PQRY_IMDBVARIAZI2_RS = 3539;
  public static int PQSL_IMDBVARIAZI2_PROGRESSIVO = 0;
  public static int PQSL_IMDBVARIAZI2_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBVARIAZI2_IMPORTO = 2;
  public static int PQSL_IMDBVARIAZI2_VERSIONE = 3;
  public static int PQSL_IMDBVARIAZI2_TIPO = 4;
  public static int PQSL_IMDBVARIAZI2_DATA = 5;
  public static int PQSL_IMDBVARIAZI2_ROWNAMOLNUMA = 6;
  public static int PQSL_IMDBVARIAZI2_ROWNAMOLANMA = 7;
  public static int PQSL_IMDBVARIAZI2_ROWNAMOLPRTE = 8;
  public static int PQSL_IMDBVARIAZI2_ROWNAMOLDDAT = 9;
  public static int PQSL_IMDBVARIAZI2_DATA_INVIO = 10;
  public static int PQSL_IMDBVARIAZI2_PROGRESSIVO_TESO = 11;
  public static int PQSL_IMDBVARIAZI2_NUMERO_MAND = 12;
  public static int PQSL_IMDBVARIAZI2_ANNO_MAND = 13;
  public static int PQSL_IMDBVARIAZI2_ROWNAMNUOVAR = 14;
  public static int PQSL_IMDBVARIAZI2_ROWNAMEMODIF = 15;

  // Table to contain panel selected row: Filtri Table
  //
  public static int PQRY_FILTRITABLE6 = 3540;
  public static int PQRY_FILTRITABLE6_RS = 3541;
  public static int PQSL_FILTRITABLE6_ANNO_MAND = 0;
  public static int PQSL_FILTRITABLE6_NUMERO_MAND = 1;
  public static int PQSL_FILTRITABLE6_ROWNAMDATVAR = 2;
  public static int PQSL_FILTRITABLE6_ROWNAMDATORD = 3;

  // Table to contain panel selected row: IMDB Sostituzioni
  //
  public static int PQRY_IMDBSOSTITU2 = 3542;
  public static int PQRY_IMDBSOSTITU2_RS = 3543;
  public static int PQSL_IMDBSOSTITU2_PROGRESSIVO = 0;
  public static int PQSL_IMDBSOSTITU2_RAGIONE_SOCIALE = 1;
  public static int PQSL_IMDBSOSTITU2_IMPORTO = 2;
  public static int PQSL_IMDBSOSTITU2_NUMERO_MAND = 3;
  public static int PQSL_IMDBSOSTITU2_ANNO_MAND = 4;
  public static int PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO = 5;
  public static int PQSL_IMDBSOSTITU2_VERSIONE = 6;
  public static int PQSL_IMDBSOSTITU2_TIPO = 7;
  public static int PQSL_IMDBSOSTITU2_DATA = 8;
  public static int PQSL_IMDBSOSTITU2_ANNO_MAND_SOST = 9;
  public static int PQSL_IMDBSOSTITU2_NUMERO_MAND_SOST = 10;
  public static int PQSL_IMDBSOSTITU2_PROGRESSIVO_TESO_SOST = 11;
  public static int PQSL_IMDBSOSTITU2_ROWNAMOLNUMA = 12;
  public static int PQSL_IMDBSOSTITU2_ROWNAMOLANMA = 13;
  public static int PQSL_IMDBSOSTITU2_ROWNAMOLPRTE = 14;
  public static int PQSL_IMDBSOSTITU2_ROWNAMOLDDAT = 15;
  public static int PQSL_IMDBSOSTITU2_ROWNAMEMODIF = 16;

  // Table to contain panel selected row: ORD INF STATO
  //
  public static int PQRY_ORDINFSTATO = 3544;
  public static int PQSL_ORDINFSTATO_ANNO_ORD = 0;
  public static int PQSL_ORDINFSTATO_NUMERO_ORD = 1;
  public static int PQSL_ORDINFSTATO_PROGRESSIVO_TESO = 2;
  public static int PQSL_ORDINFSTATO_DATA = 3;
  public static int PQSL_ORDINFSTATO_NUMERO_ORD_SOST = 4;
  public static int PQSL_ORDINFSTATO_PROGRESSIVO_TESO_SOST = 5;
  public static int PQSL_ORDINFSTATO_TIPO = 6;
  public static int PQSL_ORDINFSTATO_PROGRESSIVO = 7;
  public static int PQSL_ORDINFSTATO_RECTIPDESEXP = 8;
  public static int PQSL_ORDINFSTATO_RECOTIPOEXPR = 9;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI257 = 3545;
  public static int PQRY_PARAMETRI257_RS = 3546;
  public static int PQSL_PARAMETRI257_ROWNAMETIPO = 0;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE51 = 3547;
  public static int PQRY_NEWTABLE51_RS = 3548;
  public static int PQSL_NEWTABLE51_ROWNAMEDAL = 0;
  public static int PQSL_NEWTABLE51_ROWNAMEAL = 1;
  public static int PQSL_NEWTABLE51_ROWNAMDISNUM = 2;
  public static int PQSL_NEWTABLE51_ROWNAMDATRIS = 3;
  public static int PQSL_NEWTABLE51_ROWNAMEDALD = 4;
  public static int PQSL_NEWTABLE51_ROWNAMEALD = 5;
  public static int PQSL_NEWTABLE51_ROWNAMETIPO = 6;
  public static int PQSL_NEWTABLE51_ROWNAMOLDTIP = 7;

  // Table to contain panel selected row: ANOMALIE INVIO MANORD INF
  //
  public static int PQRY_ANOINVMANIN1 = 3549;
  public static int PQSL_ANOINVMANIN1_ANOINVMAINTI = 0;
  public static int PQSL_ANOINVMANIN1_ANINMAINANLI = 1;
  public static int PQSL_ANOINVMANIN1_ANINMAINNULI = 2;
  public static int PQSL_ANOINVMANIN1_ANINMAINANMA = 3;
  public static int PQSL_ANOINVMANIN1_ANINMAINNUMA = 4;
  public static int PQSL_ANOINVMANIN1_ANINMAINANIM = 5;
  public static int PQSL_ANOINVMANIN1_ANINMAINNUIM = 6;
  public static int PQSL_ANOINVMANIN1_ANOINVMAINIM = 7;
  public static int PQSL_ANOINVMANIN1_ANOINVMAINAN = 8;

  // Table to contain panel selected row: ANOMALIE INVIO MANORD INF
  //
  public static int PQRY_ANOINVMANINF = 3550;
  public static int PQSL_ANOINVMANINF_ANOINVMAINTI = 0;
  public static int PQSL_ANOINVMANINF_ANINMAINANMA = 1;
  public static int PQSL_ANOINVMANINF_ANINMAINNUMA = 2;
  public static int PQSL_ANOINVMANINF_ANINMAINANIM = 3;
  public static int PQSL_ANOINVMANINF_ANINMAINNUIM = 4;
  public static int PQSL_ANOINVMANINF_ANOINVMAINIM = 5;
  public static int PQSL_ANOINVMANINF_ANOINVMAINAN = 6;

  // Table to contain panel selected row: Eliminazione
  //
  public static int PQRY_ELIMINAZION2 = 3551;
  public static int PQRY_ELIMINAZION2_RS = 3552;
  public static int PQSL_ELIMINAZION2_NUMERO_MAND = 0;
  public static int PQSL_ELIMINAZION2_DATA_MAND = 1;
  public static int PQSL_ELIMINAZION2_IMPORTO = 2;
  public static int PQSL_ELIMINAZION2_NUMERO_ELENCO = 3;
  public static int PQSL_ELIMINAZION2_DATA_ELENCO = 4;
  public static int PQSL_ELIMINAZION2_CAPITOLO = 5;
  public static int PQSL_ELIMINAZION2_ARTICOLO = 6;
  public static int PQSL_ELIMINAZION2_ANNO_IMP = 7;
  public static int PQSL_ELIMINAZION2_NUMERO_IMP = 8;
  public static int PQSL_ELIMINAZION2_PAGATO = 9;

  // Table to contain panel selected row: Tipo
  //
  public static int PQRY_TIPO1 = 3553;
  public static int PQRY_TIPO1_RS = 3554;
  public static int PQSL_TIPO1_ROWNAMETIPO = 0;
  public static int PQSL_TIPO1_ROWNAMEDAL = 1;
  public static int PQSL_TIPO1_ROWNAMEAL = 2;
  public static int PQSL_TIPO1_ROWNAMDISNUM = 3;
  public static int PQSL_TIPO1_ROWNAMDATDIS = 4;

  // Table to contain panel selected row: Import File
  //
  public static int PQRY_IMPORTFILE2 = 3555;
  public static int PQSL_IMPORTFILE2_PROGRESSIVO = 0;
  public static int PQSL_IMPORTFILE2_SESSIONE = 1;
  public static int PQSL_IMPORTFILE2_FASE = 2;
  public static int PQSL_IMPORTFILE2_FILE_DATI = 3;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI428 = 3556;
  public static int PQRY_PARAMETRI428_RS = 3557;
  public static int PQSL_PARAMETRI428_RONASOSTDICO = 0;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI3 = 3558;
  public static int PQSL_WRKERRORI3_SESSIONE = 0;
  public static int PQSL_WRKERRORI3_PROGRESSIVO = 1;
  public static int PQSL_WRKERRORI3_ERRORE = 2;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI2 = 3559;
  public static int PQSL_WRKERRORI2_SESSIONE = 0;
  public static int PQSL_WRKERRORI2_PROGRESSIVO = 1;
  public static int PQSL_WRKERRORI2_ERRORE = 2;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE54 = 3560;
  public static int PQRY_NEWTABLE54_RS = 3561;
  public static int PQSL_NEWTABLE54_ROWNAMECAPTI = 0;
  public static int PQSL_NEWTABLE54_ROWNAMEFASE = 1;
  public static int PQSL_NEWTABLE54_ROWNAMEDATA = 2;

  // Table to contain panel selected row: WRK ERRORI
  //
  public static int PQRY_WRKERRORI6 = 3562;
  public static int PQSL_WRKERRORI6_RECWRKERRPRO = 0;
  public static int PQSL_WRKERRORI6_RECORDANOMAL = 1;
  public static int PQSL_WRKERRORI6_RECOIDFLUSBT = 2;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI304 = 3563;
  public static int PQSL_PARAMETRI304_PROGRESSIVO = 0;
  public static int PQSL_PARAMETRI304_SESSIONE = 1;
  public static int PQSL_PARAMETRI304_FASE = 2;
  public static int PQSL_PARAMETRI304_FILE_DATI = 3;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE1 = 3564;
  public static int PQSL_NEWTABLE1_SESSIONE = 0;
  public static int PQSL_NEWTABLE1_PROGRESSIVO = 1;
  public static int PQSL_NEWTABLE1_FILE_DATI = 2;

  // Table to contain panel selected row: New Table
  //
  public static int PQRY_NEWTABLE49 = 3565;
  public static int PQRY_NEWTABLE49_RS = 3566;
  public static int PQSL_NEWTABLE49_ROWNAMDALIST = 0;

  // Table to contain panel selected row: VISTA BILANCIO ENTRATA
  //
  public static int PQRY_VISTBILAENTR = 3567;
  public static int PQSL_VISTBILAENTR_VISBILENTESE = 0;
  public static int PQSL_VISTBILAENTR_VISBILENTCAP = 1;
  public static int PQSL_VISTBILAENTR_VISBILENTART = 2;
  public static int PQSL_VISTBILAENTR_VISBILENDECA = 3;
  public static int PQSL_VISTBILAENTR_VIBIENDECAAB = 4;
  public static int PQSL_VISTBILAENTR_VISBILENTTIT = 5;
  public static int PQSL_VISTBILAENTR_VISBILENDET1 = 6;
  public static int PQSL_VISTBILAENTR_VISBILENTTI1 = 7;
  public static int PQSL_VISTBILAENTR_VISBILENDETI = 8;
  public static int PQSL_VISTBILAENTR_VISBIENCOLI1 = 9;
  public static int PQSL_VISTBILAENTR_VIBIENDECOL1 = 10;
  public static int PQSL_VISTBILAENTR_VISBIENCOLI2 = 11;
  public static int PQSL_VISTBILAENTR_VIBIENDECOL2 = 12;
  public static int PQSL_VISTBILAENTR_VISBIENCOLI3 = 13;
  public static int PQSL_VISTBILAENTR_VIBIENDECOL3 = 14;
  public static int PQSL_VISTBILAENTR_VISBIENCOLI4 = 15;
  public static int PQSL_VISTBILAENTR_VIBIENDECOL4 = 16;
  public static int PQSL_VISTBILAENTR_VISBIENCOLI5 = 17;
  public static int PQSL_VISTBILAENTR_VIBIENDECOL5 = 18;
  public static int PQSL_VISTBILAENTR_VISBILENTVIN = 19;
  public static int PQSL_VISTBILAENTR_VISBILENDEVI = 20;
  public static int PQSL_VISTBILAENTR_VISBILENUNOR = 21;
  public static int PQSL_VISTBILAENTR_VISBILENREUO = 22;
  public static int PQSL_VISTBILAENTR_VISBILENTPR1 = 23;
  public static int PQSL_VISTBILAENTR_VISBILENDEP1 = 24;
  public static int PQSL_VISTBILAENTR_VISBILENTPRO = 25;
  public static int PQSL_VISTBILAENTR_VISBILENDEPR = 26;
  public static int PQSL_VISTBILAENTR_VISBILENTRES = 27;
  public static int PQSL_VISTBILAENTR_VIBIENSEUNTA = 28;
  public static int PQSL_VISTBILAENTR_VISBILENCECO = 29;
  public static int PQSL_VISTBILAENTR_VIBIENDECECO = 30;
  public static int PQSL_VISTBILAENTR_VIBIENSERIIV = 31;
  public static int PQSL_VISTBILAENTR_VIBIENSEFUDE = 32;
  public static int PQSL_VISTBILAENTR_VIBIENSECOCO = 33;
  public static int PQSL_VISTBILAENTR_VIBIENSERISI = 34;
  public static int PQSL_VISTBILAENTR_VISBILENTFLE = 35;
  public static int PQSL_VISTBILAENTR_VISBILENDEFL = 36;
  public static int PQSL_VISTBILAENTR_VISBILENTFAT = 37;
  public static int PQSL_VISTBILAENTR_VISBILENDEFA = 38;
  public static int PQSL_VISTBILAENTR_VISBILENTCEN = 39;
  public static int PQSL_VISTBILAENTR_VISBILENDECE = 40;
  public static int PQSL_VISTBILAENTR_VISBILENTCGE = 41;
  public static int PQSL_VISTBILAENTR_VISBILENDECG = 42;
  public static int PQSL_VISTBILAENTR_VIBIENSTINCO = 43;
  public static int PQSL_VISTBILAENTR_VISBILENVACO = 44;
  public static int PQSL_VISTBILAENTR_VIBIENSTDECO = 45;
  public static int PQSL_VISTBILAENTR_VISBILENDICO = 46;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRCO = 47;
  public static int PQSL_VISTBILAENTR_VIBIENSTINCA = 48;
  public static int PQSL_VISTBILAENTR_VISBILENVACA = 49;
  public static int PQSL_VISTBILAENTR_VIBIENSTDECA = 50;
  public static int PQSL_VISTBILAENTR_VISBILENDICA = 51;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRCA = 52;
  public static int PQSL_VISTBILAENTR_VISBILENREPR = 53;
  public static int PQSL_VISTBILAENTR_VISBILENREIN = 54;
  public static int PQSL_VISTBILAENTR_VIBIENSTINM1 = 55;
  public static int PQSL_VISTBILAENTR_VIBIENSTDEM1 = 56;
  public static int PQSL_VISTBILAENTR_VISBILENVAM1 = 57;
  public static int PQSL_VISTBILAENTR_VIBIENTOACCO = 58;
  public static int PQSL_VISTBILAENTR_VIBIENTOACRE = 59;
  public static int PQSL_VISTBILAENTR_VIBIENSTINP1 = 60;
  public static int PQSL_VISTBILAENTR_VIBIENSTDEP1 = 61;
  public static int PQSL_VISTBILAENTR_VISBILENVAP1 = 62;
  public static int PQSL_VISTBILAENTR_VIBIENTOACP1 = 63;
  public static int PQSL_VISTBILAENTR_VIBIENSTINP2 = 64;
  public static int PQSL_VISTBILAENTR_VIBIENSTDEP2 = 65;
  public static int PQSL_VISTBILAENTR_VISBILENVAP2 = 66;
  public static int PQSL_VISTBILAENTR_VIBIENTOACP2 = 67;
  public static int PQSL_VISTBILAENTR_VIBIENTOINCO = 68;
  public static int PQSL_VISTBILAENTR_VIBIENTOINRE = 69;
  public static int PQSL_VISTBILAENTR_VISBILENTTIP = 70;
  public static int PQSL_VISTBILAENTR_VISBILENACPU = 71;
  public static int PQSL_VISTBILAENTR_VIBIENACPUP1 = 72;
  public static int PQSL_VISTBILAENTR_VIBIENACPUP2 = 73;
  public static int PQSL_VISTBILAENTR_VIBIENACREES = 74;
  public static int PQSL_VISTBILAENTR_VIBIENACREE1 = 75;
  public static int PQSL_VISTBILAENTR_VIBIENACREEP = 76;
  public static int PQSL_VISTBILAENTR_VIBIENREDAII = 77;
  public static int PQSL_VISTBILAENTR_VIBIENVAREDI = 78;
  public static int PQSL_VISTBILAENTR_VIBIENREDAID = 79;
  public static int PQSL_VISTBILAENTR_VISBILENTPU1 = 80;
  public static int PQSL_VISTBILAENTR_VISBILENTVA1 = 81;
  public static int PQSL_VISTBILAENTR_VISBILENTPU3 = 82;
  public static int PQSL_VISTBILAENTR_VIBIENREDIIM = 83;
  public static int PQSL_VISTBILAENTR_VIBIENVARDIM = 84;
  public static int PQSL_VISTBILAENTR_VIBIENRDIDM2 = 85;
  public static int PQSL_VISTBILAENTR_VISBILENTPU4 = 86;
  public static int PQSL_VISTBILAENTR_VISBILENTVA3 = 87;
  public static int PQSL_VISTBILAENTR_VISBILENTPU5 = 88;
  public static int PQSL_VISTBILAENTR_VIBIENREDII1 = 89;
  public static int PQSL_VISTBILAENTR_VIBIENVARDI1 = 90;
  public static int PQSL_VISTBILAENTR_VIBIENREDID1 = 91;
  public static int PQSL_VISTBILAENTR_VISBILENTPU6 = 92;
  public static int PQSL_VISTBILAENTR_VISBILENTVAR = 93;
  public static int PQSL_VISTBILAENTR_VISBILENTPUR = 94;
  public static int PQSL_VISTBILAENTR_VIBIENREDIIP = 95;
  public static int PQSL_VISTBILAENTR_VIBIENVARDIP = 96;
  public static int PQSL_VISTBILAENTR_VIBIENREDIDP = 97;
  public static int PQSL_VISTBILAENTR_VISBILENTPU7 = 98;
  public static int PQSL_VISTBILAENTR_VISBILENTVA2 = 99;
  public static int PQSL_VISTBILAENTR_VISBILENTPU2 = 100;
  public static int PQSL_VISTBILAENTR_VIBIENSTINCM = 101;
  public static int PQSL_VISTBILAENTR_VIBIENVACAM1 = 102;
  public static int PQSL_VISTBILAENTR_VIBIENSTDECM = 103;
  public static int PQSL_VISTBILAENTR_VIBIENDICAM1 = 104;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRCM = 105;
  public static int PQSL_VISTBILAENTR_VIBIENSTINC1 = 106;
  public static int PQSL_VISTBILAENTR_VIBIENVACAP1 = 107;
  public static int PQSL_VISTBILAENTR_VIBIENSTDEC1 = 108;
  public static int PQSL_VISTBILAENTR_VIBIENDICAP1 = 109;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRC1 = 110;
  public static int PQSL_VISTBILAENTR_VIBIENSTINCP = 111;
  public static int PQSL_VISTBILAENTR_VIBIENVACAP2 = 112;
  public static int PQSL_VISTBILAENTR_VIBIENSTDECP = 113;
  public static int PQSL_VISTBILAENTR_VIBIENDICAP2 = 114;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRCP = 115;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRM1 = 116;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRP1 = 117;
  public static int PQSL_VISTBILAENTR_VIBIENVAPRP2 = 118;
  public static int PQSL_VISTBILAENTR_VIBIENVPRDIC = 119;
  public static int PQSL_VISTBILAENTR_VIBIENVPRDIM = 120;
  public static int PQSL_VISTBILAENTR_VIBIENVPRDI1 = 121;
  public static int PQSL_VISTBILAENTR_VIBIENVPRDIP = 122;
  public static int PQSL_VISTBILAENTR_VARPROVPURCO = 123;
  public static int PQSL_VISTBILAENTR_VARIPROPURM1 = 124;
  public static int PQSL_VISTBILAENTR_VARIPROPURP1 = 125;
  public static int PQSL_VISTBILAENTR_VARIPROPURP2 = 126;
  public static int PQSL_VISTBILAENTR_VIBIENSPNORI = 127;
  public static int PQSL_VISTBILAENTR_VIBIENSUUNSU = 128;
  public static int PQSL_VISTBILAENTR_RESPSUDD = 129;
  public static int PQSL_VISTBILAENTR_VISBILENTIAV = 130;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM69 = 3568;
  public static int PQRY_PARAM69_RS = 3569;
  public static int PQSL_PARAM69_ROWNAMEESERC = 0;
  public static int PQSL_PARAM69_ROWNAMEDABIL = 1;
  public static int PQSL_PARAM69_ROWNAMESRIIV = 2;
  public static int PQSL_PARAM69_ROWNAMESTFLE = 3;

  // Table to contain panel selected row: VISTA BILANCIO SPESA
  //
  public static int PQRY_VISTBILASPES = 3570;
  public static int PQSL_VISTBILASPES_VIBIENVIBISE = 0;
  public static int PQSL_VISTBILASPES_VIBIENVIBIS1 = 1;
  public static int PQSL_VISTBILASPES_VIBIENVIBISA = 2;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD1 = 3;
  public static int PQSL_VISTBILASPES_VIBIENVBSDCA = 4;
  public static int PQSL_VISTBILASPES_VISBILENTMIS = 5;
  public static int PQSL_VISTBILASPES_VISBILENDEMI = 6;
  public static int PQSL_VISTBILASPES_VISBILENPRAR = 7;
  public static int PQSL_VISTBILASPES_VIBIENDEPRAR = 8;
  public static int PQSL_VISTBILASPES_VIBIENVBSCL1 = 9;
  public static int PQSL_VISTBILASPES_VIBIEVBSDCL1 = 10;
  public static int PQSL_VISTBILASPES_VIBIENVBSCL2 = 11;
  public static int PQSL_VISTBILASPES_VIBIEVBSDCL2 = 12;
  public static int PQSL_VISTBILASPES_VIBIENVBSCL3 = 13;
  public static int PQSL_VISTBILASPES_VIBIEVBSDCL3 = 14;
  public static int PQSL_VISTBILASPES_VIBIENVBSCL4 = 15;
  public static int PQSL_VISTBILASPES_VIBIEVBSDCL4 = 16;
  public static int PQSL_VISTBILASPES_VIBIENVBSCL5 = 17;
  public static int PQSL_VISTBILASPES_VIBIEVBSDCL5 = 18;
  public static int PQSL_VISTBILASPES_VIBIENVIBISV = 19;
  public static int PQSL_VISTBILASPES_VIBIENVIBSDV = 20;
  public static int PQSL_VISTBILASPES_VIBIENVIBSUO = 21;
  public static int PQSL_VISTBILASPES_VIBIENVIBSRU = 22;
  public static int PQSL_VISTBILASPES_VIBIENVIBIS2 = 23;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD2 = 24;
  public static int PQSL_VISTBILASPES_VIBIENVIBISP = 25;
  public static int PQSL_VISTBILASPES_VIBIENVIBSDP = 26;
  public static int PQSL_VISTBILASPES_VIBIENVIBISR = 27;
  public static int PQSL_VISTBILASPES_VIBIENVBSSUT = 28;
  public static int PQSL_VISTBILASPES_VIBIENVIBSCC = 29;
  public static int PQSL_VISTBILASPES_VIBIENVBSDCC = 30;
  public static int PQSL_VISTBILASPES_VIBIENVBSSRI = 31;
  public static int PQSL_VISTBILASPES_VIBIENVBSSFD = 32;
  public static int PQSL_VISTBILASPES_VIBIENVBSSCC = 33;
  public static int PQSL_VISTBILASPES_VIBIENVIBIS3 = 34;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD3 = 35;
  public static int PQSL_VISTBILASPES_VIBIENVIBIS5 = 36;
  public static int PQSL_VISTBILASPES_VIBIENVIBSDF = 37;
  public static int PQSL_VISTBILASPES_VIBIENVIBIS4 = 38;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD4 = 39;
  public static int PQSL_VISTBILASPES_VIBIENVIBISC = 40;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD5 = 41;
  public static int PQSL_VISTBILASPES_VIBIENVBSSI1 = 42;
  public static int PQSL_VISTBILASPES_VIBIENVIBSV1 = 43;
  public static int PQSL_VISTBILASPES_VIBIENVBSSD1 = 44;
  public static int PQSL_VISTBILASPES_VIBIENVIBSD6 = 45;
  public static int PQSL_VISTBILASPES_VIBIENVAPRCO = 46;
  public static int PQSL_VISTBILASPES_VIBIENVBSSIC = 47;
  public static int PQSL_VISTBILASPES_VIBIENVIBSVC = 48;
  public static int PQSL_VISTBILASPES_VIBIENVBSSDC = 49;
  public static int PQSL_VISTBILASPES_VIBIENVIBSDC = 50;
  public static int PQSL_VISTBILASPES_VIBIENVBSVPC = 51;
  public static int PQSL_VISTBILASPES_VIBIENVIBSRP = 52;
  public static int PQSL_VISTBILASPES_VIBIENVIBSRI = 53;
  public static int PQSL_VISTBILASPES_VIBIENVBSSIM = 54;
  public static int PQSL_VISTBILASPES_VIBIENVBSSDM = 55;
  public static int PQSL_VISTBILASPES_VIBIENVIBSVM = 56;
  public static int PQSL_VISTBILASPES_VIBIENVBSSI2 = 57;
  public static int PQSL_VISTBILASPES_VIBIENVBSSD2 = 58;
  public static int PQSL_VISTBILASPES_VIBIENVIBSV2 = 59;
  public static int PQSL_VISTBILASPES_VIBIENTOIMCO = 60;
  public static int PQSL_VISTBILASPES_VIBIENVBSSIP = 61;
  public static int PQSL_VISTBILASPES_VIBIENVBSSDP = 62;
  public static int PQSL_VISTBILASPES_VIBIENVIBSVP = 63;
  public static int PQSL_VISTBILASPES_VIBIENTOIMRE = 64;
  public static int PQSL_VISTBILASPES_VIBIENTOMACO = 65;
  public static int PQSL_VISTBILASPES_VIBIENTOMARE = 66;
  public static int PQSL_VISTBILASPES_VIBIENVIBIST = 67;
  public static int PQSL_VISTBILASPES_VIBIENVIBSIP = 68;
  public static int PQSL_VISTBILASPES_VIBIENVBSIRE = 69;
  public static int PQSL_VISTBILASPES_VIBIENVBSIRS = 70;
  public static int PQSL_VISTBILASPES_VIBIEVBSRDII = 71;
  public static int PQSL_VISTBILASPES_VIBIEVBSRDID = 72;
  public static int PQSL_VISTBILASPES_VIBIEVBSRDSI = 73;
  public static int PQSL_VISTBILASPES_VIBIEVBSRDSD = 74;
  public static int PQSL_VISTBILASPES_VIBIEVBSVRDI = 75;
  public static int PQSL_VISTBILASPES_VIBIEVBSVRDS = 76;
  public static int PQSL_VISTBILASPES_VISBILENTPU1 = 77;
  public static int PQSL_VISTBILASPES_VISBILENTVA1 = 78;
  public static int PQSL_VISTBILASPES_VISBILENTPU3 = 79;
  public static int PQSL_VISTBILASPES_VIBEVBSRDIIM = 80;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDIM = 81;
  public static int PQSL_VISTBILASPES_VIBEVBSRDIDM = 82;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSIM = 83;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDSM = 84;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSDM = 85;
  public static int PQSL_VISTBILASPES_VISBILENTPU4 = 86;
  public static int PQSL_VISTBILASPES_VISBILENTVA3 = 87;
  public static int PQSL_VISTBILASPES_VISBILENTPU5 = 88;
  public static int PQSL_VISTBILASPES_VIBEVBSRDII1 = 89;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDI1 = 90;
  public static int PQSL_VISTBILASPES_VIBEVBSRDID1 = 91;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSI1 = 92;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDS1 = 93;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSD1 = 94;
  public static int PQSL_VISTBILASPES_VISBILENTPU6 = 95;
  public static int PQSL_VISTBILASPES_VISBILENTVAR = 96;
  public static int PQSL_VISTBILASPES_VISBILENTPUR = 97;
  public static int PQSL_VISTBILASPES_VIBEVBSRDIIP = 98;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDIP = 99;
  public static int PQSL_VISTBILASPES_VIBEVBSRDIDP = 100;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSIP = 101;
  public static int PQSL_VISTBILASPES_VIBEVBSVRDSP = 102;
  public static int PQSL_VISTBILASPES_VIBEVBSRDSDP = 103;
  public static int PQSL_VISTBILASPES_VISBILENTPU7 = 104;
  public static int PQSL_VISTBILASPES_VISBILENTVA2 = 105;
  public static int PQSL_VISTBILASPES_VISBILENTPU2 = 106;
  public static int PQSL_VISTBILASPES_VIBIEVBSSICM = 107;
  public static int PQSL_VISTBILASPES_VIBIENVBSVCM = 108;
  public static int PQSL_VISTBILASPES_VIBIEVBSSDCM = 109;
  public static int PQSL_VISTBILASPES_VIBIENVBSDCM = 110;
  public static int PQSL_VISTBILASPES_VIBIEVBSVPCM = 111;
  public static int PQSL_VISTBILASPES_VIBIEVBSSIC1 = 112;
  public static int PQSL_VISTBILASPES_VIBIENVBSVC1 = 113;
  public static int PQSL_VISTBILASPES_VIBIEVBSSDC1 = 114;
  public static int PQSL_VISTBILASPES_VIBIENVBSDC1 = 115;
  public static int PQSL_VISTBILASPES_VIBIEVBSVPC1 = 116;
  public static int PQSL_VISTBILASPES_VIBIEVBSSICP = 117;
  public static int PQSL_VISTBILASPES_VIBIENVBSVCP = 118;
  public static int PQSL_VISTBILASPES_VIBIEVBSSDCP = 119;
  public static int PQSL_VISTBILASPES_VIBIENVBSDCP = 120;
  public static int PQSL_VISTBILASPES_VIBIEVBSVPCP = 121;
  public static int PQSL_VISTBILASPES_VIBIENVIBSGI = 122;
  public static int PQSL_VISTBILASPES_VISBILENTFPV = 123;
  public static int PQSL_VISTBILASPES_VIBIENVAPRM1 = 124;
  public static int PQSL_VISTBILASPES_VIBIENVAPRP1 = 125;
  public static int PQSL_VISTBILASPES_VIBIENVAPRP2 = 126;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDIC = 127;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDIM = 128;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDI1 = 129;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDIP = 130;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDSC = 131;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDSM = 132;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDS1 = 133;
  public static int PQSL_VISTBILASPES_VBEVBSVPRDSP = 134;
  public static int PQSL_VISTBILASPES_VARPROVPURCO = 135;
  public static int PQSL_VISTBILASPES_VARPROVPURM1 = 136;
  public static int PQSL_VISTBILASPES_VARPROVPURP1 = 137;
  public static int PQSL_VISTBILASPES_VARPROVPURP2 = 138;
  public static int PQSL_VISTBILASPES_VIBIENSPNORI = 139;
  public static int PQSL_VISTBILASPES_VIBIENSUUNSU = 140;
  public static int PQSL_VISTBILASPES_RESPSUDD = 141;
  public static int PQSL_VISTBILASPES_VIBIENVIBISI = 142;
  public static int PQSL_VISTBILASPES_VIBIENVIBSTA = 143;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM68 = 3571;
  public static int PQRY_PARAM68_RS = 3572;
  public static int PQSL_PARAM68_ROWNAMEESERC = 0;
  public static int PQSL_PARAM68_ROWNAMEDABIL = 1;

  // Table to contain panel selected row: VISTA BILANCIO ENTRATA RPP 2
  //
  public static int PQRY_VISBILENTRP2 = 3573;
  public static int PQSL_VISBILENTRP2_ESERCIZIO = 0;
  public static int PQSL_VISBILENTRP2_CAPITOLO = 1;
  public static int PQSL_VISBILENTRP2_ARTICOLO = 2;
  public static int PQSL_VISBILENTRP2_TITOLO = 3;
  public static int PQSL_VISBILENTRP2_DES_TITOLO = 4;
  public static int PQSL_VISBILENTRP2_CENTRO_COSTO = 5;
  public static int PQSL_VISBILENTRP2_DES_CENTRO_COSTO = 6;
  public static int PQSL_VISBILENTRP2_VINCOLO = 7;
  public static int PQSL_VISBILENTRP2_DES_VINCOLO = 8;
  public static int PQSL_VISBILENTRP2_SE_UNA_TANTUM = 9;
  public static int PQSL_VISBILENTRP2_SE_RILEV_IVA = 10;
  public static int PQSL_VISBILENTRP2_SE_FUNZ_DELEG = 11;
  public static int PQSL_VISBILENTRP2_SE_CONTRIB_COMU = 12;
  public static int PQSL_VISBILENTRP2_SE_RISORSA_SIGNIF = 13;
  public static int PQSL_VISBILENTRP2_FLESSIBILITA = 14;
  public static int PQSL_VISBILENTRP2_DES_FLESSIBILITA = 15;
  public static int PQSL_VISBILENTRP2_FATTORE = 16;
  public static int PQSL_VISBILENTRP2_CENTRO = 17;
  public static int PQSL_VISBILENTRP2_CGE = 18;
  public static int PQSL_VISBILENTRP2_DES_CGE = 19;
  public static int PQSL_VISBILENTRP2_STN_INIZIALE = 20;
  public static int PQSL_VISBILENTRP2_STN_DEFINITIVO = 21;
  public static int PQSL_VISBILENTRP2_VARIAZIONI = 22;
  public static int PQSL_VISBILENTRP2_DISPONIBILITA = 23;
  public static int PQSL_VISBILENTRP2_STN_INIZIALE_P1 = 24;
  public static int PQSL_VISBILENTRP2_VARIAZIONI_P1 = 25;
  public static int PQSL_VISBILENTRP2_STN_DEFINITIVO_P1 = 26;
  public static int PQSL_VISBILENTRP2_STN_INIZIALE_P2 = 27;
  public static int PQSL_VISBILENTRP2_VARIAZIONI_P2 = 28;
  public static int PQSL_VISBILENTRP2_STN_DEFINITIVO_P2 = 29;
  public static int PQSL_VISBILENTRP2_STN_INIZIALE_M1 = 30;
  public static int PQSL_VISBILENTRP2_VARIAZIONI_M1 = 31;
  public static int PQSL_VISBILENTRP2_STN_DEFINITIVO_M1 = 32;
  public static int PQSL_VISBILENTRP2_TOT_ACCERTAMENTI_COMP = 33;
  public static int PQSL_VISBILENTRP2_TOT_ACCERTAMENTI_RES = 34;
  public static int PQSL_VISBILENTRP2_TOT_INCASSI_COMP = 35;
  public static int PQSL_VISBILENTRP2_TOT_INCASSI_RES = 36;
  public static int PQSL_VISBILENTRP2_TOT_RESIDUO_INI = 37;
  public static int PQSL_VISBILENTRP2_VIBIENRP2DE1 = 38;
  public static int PQSL_VISBILENTRP2_VIBIENRP2DCA = 39;
  public static int PQSL_VISBILENTRP2_VISBIENRP2TI = 40;
  public static int PQSL_VISBILENTRP2_VIBIENRP2DET = 41;
  public static int PQSL_VISBILENTRP2_VIBIENRP2CL1 = 42;
  public static int PQSL_VISBILENTRP2_VIBIENR2DCL1 = 43;
  public static int PQSL_VISBILENTRP2_VIBIENRPCOL2 = 44;
  public static int PQSL_VISBILENTRP2_VIBIENRPDCL2 = 45;
  public static int PQSL_VISBILENTRP2_VIBIENRP2CL3 = 46;
  public static int PQSL_VISBILENTRP2_VIBIENR2DCL3 = 47;
  public static int PQSL_VISBILENTRP2_VIBIENRP2CL4 = 48;
  public static int PQSL_VISBILENTRP2_VIBIENR2DCL4 = 49;
  public static int PQSL_VISBILENTRP2_VIBIENRP2CL5 = 50;
  public static int PQSL_VISBILENTRP2_VIBIENR2DCL5 = 51;
  public static int PQSL_VISBILENTRP2_VIBIENRP2UNO = 52;
  public static int PQSL_VISBILENTRP2_VIBIENRP2REU = 53;
  public static int PQSL_VISBILENTRP2_VIBIENRP2DEF = 54;
  public static int PQSL_VISBILENTRP2_VIBIENRP2DEC = 55;
  public static int PQSL_VISBILENTRP2_VIBIENRP2SUS = 56;
  public static int PQSL_VISBILENTRP2_RESPSUDD = 57;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BPI = 58;
  public static int PQSL_VISBILENTRP2_VIBIENR2BRII = 59;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BTI = 60;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BVP = 61;
  public static int PQSL_VISBILENTRP2_VIBIENR2BVRI = 62;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BVT = 63;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BPA = 64;
  public static int PQSL_VISBILENTRP2_VIBIENR2BRIA = 65;
  public static int PQSL_VISBILENTRP2_VIBIENRP2BTA = 66;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPP1 = 67;
  public static int PQSL_VISBILENTRP2_VIBIER2BPRI1 = 68;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPT1 = 69;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPV1 = 70;
  public static int PQSL_VISBILENTRP2_VIBIER2BPVR1 = 71;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPV2 = 72;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPP2 = 73;
  public static int PQSL_VISBILENTRP2_VIBIER2BPRI2 = 74;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPT2 = 75;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPPI = 76;
  public static int PQSL_VISBILENTRP2_VIBIER2BPRII = 77;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPTI = 78;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPVP = 79;
  public static int PQSL_VISBILENTRP2_VIBIER2BPVRI = 80;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPVT = 81;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPPA = 82;
  public static int PQSL_VISBILENTRP2_VIBIER2BPRIA = 83;
  public static int PQSL_VISBILENTRP2_VIBIENR2BPTA = 84;
  public static int PQSL_VISBILENTRP2_VIBIENRP2ACP = 85;
  public static int PQSL_VISBILENTRP2_VIBIENRP2ARE = 86;
  public static int PQSL_VISBILENTRP2_ACCTOTP0 = 87;
  public static int PQSL_VISBILENTRP2_VIBIENRP2AP1 = 88;
  public static int PQSL_VISBILENTRP2_VIBIENR2ARE1 = 89;
  public static int PQSL_VISBILENTRP2_ACCTOTP1 = 90;
  public static int PQSL_VISBILENTRP2_VIBIENRP2APP = 91;
  public static int PQSL_VISBILENTRP2_VIBIENR2AREP = 92;
  public static int PQSL_VISBILENTRP2_ACCTOTP2 = 93;
  public static int PQSL_VISBILENTRP2_VISBIENRP2O1 = 94;
  public static int PQSL_VISBILENTRP2_VISBIENRP2OB = 95;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM66 = 3574;
  public static int PQRY_PARAM66_RS = 3575;
  public static int PQSL_PARAM66_ROWNAMEESERC = 0;

  // Table to contain panel selected row: VISTA BILANCIO SPESA RPP 2
  //
  public static int PQRY_VISBILSPERP2 = 3576;
  public static int PQSL_VISBILSPERP2_ESERCIZIO = 0;
  public static int PQSL_VISBILSPERP2_CAPITOLO = 1;
  public static int PQSL_VISBILSPERP2_ARTICOLO = 2;
  public static int PQSL_VISBILSPERP2_CENTRO_COSTO = 3;
  public static int PQSL_VISBILSPERP2_DES_CENTRO_COSTO = 4;
  public static int PQSL_VISBILSPERP2_VINCOLO = 5;
  public static int PQSL_VISBILSPERP2_DES_VINCOLO = 6;
  public static int PQSL_VISBILSPERP2_SE_UNA_TANTUM = 7;
  public static int PQSL_VISBILSPERP2_SE_RILEV_IVA = 8;
  public static int PQSL_VISBILSPERP2_SE_FUNZ_DELEG = 9;
  public static int PQSL_VISBILSPERP2_SE_CONTRIB_COMU = 10;
  public static int PQSL_VISBILSPERP2_FLESSIBILITA = 11;
  public static int PQSL_VISBILSPERP2_DES_FLESSIBILITA = 12;
  public static int PQSL_VISBILSPERP2_FATTORE = 13;
  public static int PQSL_VISBILSPERP2_CENTRO = 14;
  public static int PQSL_VISBILSPERP2_STN_INIZIALE = 15;
  public static int PQSL_VISBILSPERP2_STN_DEFINITIVO = 16;
  public static int PQSL_VISBILSPERP2_VARIAZIONI = 17;
  public static int PQSL_VISBILSPERP2_DISPONIBILITA = 18;
  public static int PQSL_VISBILSPERP2_STN_INIZIALE_P1 = 19;
  public static int PQSL_VISBILSPERP2_VARIAZIONI_P1 = 20;
  public static int PQSL_VISBILSPERP2_STN_DEFINITIVO_P1 = 21;
  public static int PQSL_VISBILSPERP2_STN_INIZIALE_P2 = 22;
  public static int PQSL_VISBILSPERP2_VARIAZIONI_P2 = 23;
  public static int PQSL_VISBILSPERP2_STN_DEFINITIVO_P2 = 24;
  public static int PQSL_VISBILSPERP2_STN_INIZIALE_M1 = 25;
  public static int PQSL_VISBILSPERP2_VARIAZIONI_M1 = 26;
  public static int PQSL_VISBILSPERP2_STN_DEFINITIVO_M1 = 27;
  public static int PQSL_VISBILSPERP2_TOT_RESIDUO_INI = 28;
  public static int PQSL_VISBILSPERP2_CGU = 29;
  public static int PQSL_VISBILSPERP2_DES_CGU = 30;
  public static int PQSL_VISBILSPERP2_TOT_IMPEGNI_COMP = 31;
  public static int PQSL_VISBILSPERP2_TOT_IMPEGNI_RES = 32;
  public static int PQSL_VISBILSPERP2_TOT_PAGAMENTI_COMP = 33;
  public static int PQSL_VISBILSPERP2_TOT_PAGAMENTI_RES = 34;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DE1 = 35;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DCA = 36;
  public static int PQSL_VISBILSPERP2_VISBISPRP2MI = 37;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DEM = 38;
  public static int PQSL_VISBILSPERP2_VIBISPRP2PRA = 39;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DPA = 40;
  public static int PQSL_VISBILSPERP2_VIBISPRP2CL1 = 41;
  public static int PQSL_VISBILSPERP2_VIBISPR2DCL1 = 42;
  public static int PQSL_VISBILSPERP2_VIBSRVBSRCL2 = 43;
  public static int PQSL_VISBILSPERP2_VBSRVBSRDCL2 = 44;
  public static int PQSL_VISBILSPERP2_VIBISPRP2CL3 = 45;
  public static int PQSL_VISBILSPERP2_VIBISPR2DCL3 = 46;
  public static int PQSL_VISBILSPERP2_VIBISPRP2CL4 = 47;
  public static int PQSL_VISBILSPERP2_VIBISPR2DCL4 = 48;
  public static int PQSL_VISBILSPERP2_VIBISPRP2CL5 = 49;
  public static int PQSL_VISBILSPERP2_VIBISPR2DCL5 = 50;
  public static int PQSL_VISBILSPERP2_VIBISPRP2UNO = 51;
  public static int PQSL_VISBILSPERP2_VIBISPRP2REU = 52;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DEF = 53;
  public static int PQSL_VISBILSPERP2_VIBISPRP2DEC = 54;
  public static int PQSL_VISBILSPERP2_VIBISPRP2SUS = 55;
  public static int PQSL_VISBILSPERP2_RESPSUDD = 56;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BPI = 57;
  public static int PQSL_VISBILSPERP2_VIBISPR2BRII = 58;
  public static int PQSL_VISBILSPERP2_VIBISPR2BRSI = 59;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BTI = 60;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BVP = 61;
  public static int PQSL_VISBILSPERP2_VIBISPR2BVRI = 62;
  public static int PQSL_VISBILSPERP2_VIBISPR2BVRS = 63;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BVT = 64;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BPA = 65;
  public static int PQSL_VISBILSPERP2_VIBISPR2BRIA = 66;
  public static int PQSL_VISBILSPERP2_VIBISPR2BRSA = 67;
  public static int PQSL_VISBILSPERP2_VIBISPRP2BTA = 68;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPP1 = 69;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRI1 = 70;
  public static int PQSL_VISBILSPERP2_VIBISR2BRSI1 = 71;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPT1 = 72;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPV1 = 73;
  public static int PQSL_VISBILSPERP2_VIBISR2BPVR1 = 74;
  public static int PQSL_VISBILSPERP2_VIBISR2BPVR2 = 75;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPV2 = 76;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPP2 = 77;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRI2 = 78;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRS1 = 79;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPT2 = 80;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPPI = 81;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRII = 82;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRSI = 83;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPTI = 84;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPVP = 85;
  public static int PQSL_VISBILSPERP2_VIBISR2BPVRI = 86;
  public static int PQSL_VISBILSPERP2_VIBISR2BPVRS = 87;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPVT = 88;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPPA = 89;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRIA = 90;
  public static int PQSL_VISBILSPERP2_VIBISR2BPRSA = 91;
  public static int PQSL_VISBILSPERP2_VIBISPR2BPTA = 92;
  public static int PQSL_VISBILSPERP2_VIBISPRP2IMP = 93;
  public static int PQSL_VISBILSPERP2_VIBISPRP2IRE = 94;
  public static int PQSL_VISBILSPERP2_VIBISPRP2IRS = 95;
  public static int PQSL_VISBILSPERP2_IMPTOTP0 = 96;
  public static int PQSL_VISBILSPERP2_VIBISPR2IPPP = 97;
  public static int PQSL_VISBILSPERP2_VIBISPR2IRE1 = 98;
  public static int PQSL_VISBILSPERP2_VIBISR2IRSPP = 99;
  public static int PQSL_VISBILSPERP2_IMPTOTP1 = 100;
  public static int PQSL_VISBILSPERP2_VIBISPRP2IPP = 101;
  public static int PQSL_VISBILSPERP2_VIBISPR2IREP = 102;
  public static int PQSL_VISBILSPERP2_VIBISPR2IRSP = 103;
  public static int PQSL_VISBILSPERP2_IMPTOTP2 = 104;
  public static int PQSL_VISBILSPERP2_VISBISPRP2O1 = 105;
  public static int PQSL_VISBILSPERP2_VISBISPRP2OB = 106;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM64 = 3577;
  public static int PQRY_PARAM64_RS = 3578;
  public static int PQSL_PARAM64_ROWNAMEESERC = 0;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI531 = 3579;
  public static int PQRY_PARAMETRI531_RS = 3580;
  public static int PQSL_PARAMETRI531_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMETRI531_ROWNAMTIPVAR = 1;
  public static int PQSL_PARAMETRI531_ROWNAMEVARIA = 2;
  public static int PQSL_PARAMETRI531_ROWNAMSEDDEL = 3;
  public static int PQSL_PARAMETRI531_ROWNAMNUMDEL = 4;
  public static int PQSL_PARAMETRI531_ROWNAMANNDEL = 5;
  public static int PQSL_PARAMETRI531_ROWNAMUNIPRO = 6;
  public static int PQSL_PARAMETRI531_ROWNAMNUMPRO = 7;
  public static int PQSL_PARAMETRI531_ROWNAMANNPRO = 8;
  public static int PQSL_PARAMETRI531_ROWNAMEESERC = 9;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM13 = 3581;
  public static int PQSL_VARCOM13_VARCVARIPROG = 0;
  public static int PQSL_VARCOM13_VARCOMESERCI = 1;
  public static int PQSL_VARCOM13_VARCOMCAPITO = 2;
  public static int PQSL_VARCOM13_VARCOMARTICO = 3;
  public static int PQSL_VARCOM13_VARCOANNODEL = 4;
  public static int PQSL_VARCOM13_VARCONUMEDEL = 5;
  public static int PQSL_VARCOM13_VARCOSEDEDEL = 6;
  public static int PQSL_VARCOM13_VARCOMDESCRI = 7;
  public static int PQSL_VARCOM13_VARCODTIPVAR = 8;
  public static int PQSL_VARCOM13_VARCANNOPROP = 9;
  public static int PQSL_VARCOM13_VARCUNITPROP = 10;
  public static int PQSL_VARCOM13_VARCNUMEPROP = 11;
  public static int PQSL_VARCOM13_PURO = 12;
  public static int PQSL_VARCOM13_REISCDAESIGI = 13;
  public static int PQSL_VARCOM13_REISCDASTANZ = 14;
  public static int PQSL_VARCOM13_VARCIMPOCASS = 15;
  public static int PQSL_VARCOM13_VARDESTIPVAR = 16;
  public static int PQSL_VARCOM13_CODICE = 17;
  public static int PQSL_VARCOM13_VARCOMTITOLO = 18;
  public static int PQSL_VARCOM13_VARCAPCODSTR = 19;
  public static int PQSL_VARCOM13_LIVELLO4 = 20;
  public static int PQSL_VARCOM13_LIVELLO5 = 21;
  public static int PQSL_VARCOM13_OBIETTOPERAT = 22;
  public static int PQSL_VARCOM13_OBIETTGESTIO = 23;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI513 = 3582;
  public static int PQRY_PARAMETRI513_RS = 3583;
  public static int PQSL_PARAMETRI513_ROWNAMEPARTE = 0;
  public static int PQSL_PARAMETRI513_ROWNAMTIPVAR = 1;
  public static int PQSL_PARAMETRI513_ROWNAMEVARIA = 2;
  public static int PQSL_PARAMETRI513_ROWNAMSEDDEL = 3;
  public static int PQSL_PARAMETRI513_ROWNAMNUMDEL = 4;
  public static int PQSL_PARAMETRI513_ROWNAMANNDEL = 5;
  public static int PQSL_PARAMETRI513_ROWNAMUNIPRO = 6;
  public static int PQSL_PARAMETRI513_ROWNAMNUMPRO = 7;
  public static int PQSL_PARAMETRI513_ROWNAMANNPRO = 8;
  public static int PQSL_PARAMETRI513_ROWNAMEESERC = 9;

  // Table to contain panel selected row: VARCOM
  //
  public static int PQRY_VARCOM11 = 3584;
  public static int PQSL_VARCOM11_VARCVARIPROG = 0;
  public static int PQSL_VARCOM11_VARCOMESERCI = 1;
  public static int PQSL_VARCOM11_VARCOMCAPITO = 2;
  public static int PQSL_VARCOM11_VARCOMARTICO = 3;
  public static int PQSL_VARCOM11_VARCOANNODEL = 4;
  public static int PQSL_VARCOM11_VARCONUMEDEL = 5;
  public static int PQSL_VARCOM11_VARCOSEDEDEL = 6;
  public static int PQSL_VARCOM11_VARCOMDESCRI = 7;
  public static int PQSL_VARCOM11_VARCODTIPVAR = 8;
  public static int PQSL_VARCOM11_VARCANNOPROP = 9;
  public static int PQSL_VARCOM11_VARCUNITPROP = 10;
  public static int PQSL_VARCOM11_VARCNUMEPROP = 11;
  public static int PQSL_VARCOM11_PURO = 12;
  public static int PQSL_VARCOM11_REISCDAESIGI = 13;
  public static int PQSL_VARCOM11_REISCDASTANZ = 14;
  public static int PQSL_VARCOM11_VARCIMPOCASS = 15;
  public static int PQSL_VARCOM11_VARDESTIPVAR = 16;
  public static int PQSL_VARCOM11_CODICE = 17;
  public static int PQSL_VARCOM11_MISSIONE = 18;
  public static int PQSL_VARCOM11_VARCAPCODSTR = 19;
  public static int PQSL_VARCOM11_LIVELLO4 = 20;
  public static int PQSL_VARCOM11_LIVELLO5 = 21;
  public static int PQSL_VARCOM11_OBIETTOPERAT = 22;
  public static int PQSL_VARCOM11_OBIETTGESTIO = 23;

  // Table to contain panel selected row: Master Query
  //
  public static int PQRY_MASTERQUERY3 = 3585;

  // Table to contain panel selected row: BIL SMU
  //
  public static int PQRY_BILSMU = 3586;
  public static int PQSL_BILSMU_BILSMUPARTE = 0;
  public static int PQSL_BILSMU_BILSMUCAPITO = 1;
  public static int PQSL_BILSMU_BILSMUARTICO = 2;
  public static int PQSL_BILSMU_BILSMUDECASO = 3;
  public static int PQSL_BILSMU_BILSMUCOCASO = 4;
  public static int PQSL_BILSMU_BISMCOIVLISO = 5;
  public static int PQSL_BILSMU_BISMDECOIVLS = 6;
  public static int PQSL_BILSMU_BILSMCOVLISO = 7;
  public static int PQSL_BILSMU_BISMDECOVLIS = 8;
  public static int PQSL_BILSMU_BISMSTINEFPS = 9;
  public static int PQSL_BILSMU_BISMSTINSISO = 10;
  public static int PQSL_BILSMU_BISMIMACCEPS = 11;
  public static int PQSL_BILSMU_BISMIMACCOSO = 12;
  public static int PQSL_BILSMU_BISMLIORESPS = 13;
  public static int PQSL_BILSMU_BILSMUDECAME = 14;
  public static int PQSL_BILSMU_BILSMUCOCAME = 15;
  public static int PQSL_BILSMU_BISMCOIVLIME = 16;
  public static int PQSL_BILSMU_BISMDECOIVLM = 17;
  public static int PQSL_BILSMU_BILSMCOVLIME = 18;
  public static int PQSL_BILSMU_BISMDECOVLIM = 19;
  public static int PQSL_BILSMU_BISMSTINEFPM = 20;
  public static int PQSL_BILSMU_BISMSTINSIME = 21;
  public static int PQSL_BILSMU_BISMIMACCEPM = 22;
  public static int PQSL_BILSMU_BISMIMACCOME = 23;
  public static int PQSL_BILSMU_BISMLIORESPM = 24;
  public static int PQSL_BILSMU_BILSMUDECAUN = 25;
  public static int PQSL_BILSMU_BILSMUCOCAUN = 26;
  public static int PQSL_BILSMU_BISMCOIVLIUN = 27;
  public static int PQSL_BILSMU_BISMDECOIVLU = 28;
  public static int PQSL_BILSMU_BILSMCOVLIUN = 29;
  public static int PQSL_BILSMU_BISMDECOVLIU = 30;
  public static int PQSL_BILSMU_BISMSTINEFPU = 31;
  public static int PQSL_BILSMU_BISMSTINSIUN = 32;
  public static int PQSL_BILSMU_BISMIMACCEPU = 33;
  public static int PQSL_BILSMU_BISMIMACCOUN = 34;
  public static int PQSL_BILSMU_BISMLIORESPU = 35;

  // Table to contain panel selected row: Param
  //
  public static int PQRY_PARAM180 = 3587;
  public static int PQRY_PARAM180_RS = 3588;
  public static int PQSL_PARAM180_NOMOGGENTSPE = 0;
  public static int PQSL_PARAM180_NOMEOGGETUTT = 1;
  public static int PQSL_PARAM180_NOMEOGGESUBI = 2;

  // Table to contain panel selected row: IMP SUB RESIDUI
  //
  public static int PQRY_IMPSUBRESIDU = 3589;
  public static int PQSL_IMPSUBRESIDU_ESERCIZIO = 0;
  public static int PQSL_IMPSUBRESIDU_CAPITOLO = 1;
  public static int PQSL_IMPSUBRESIDU_ARTICOLO = 2;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_UO = 3;
  public static int PQSL_IMPSUBRESIDU_LIVELLO_1 = 4;
  public static int PQSL_IMPSUBRESIDU_MISSIONE = 5;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_MISSIONE = 6;
  public static int PQSL_IMPSUBRESIDU_PROGRAMMA = 7;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_PROGRAMMA = 8;
  public static int PQSL_IMPSUBRESIDU_ANNO_IMP = 9;
  public static int PQSL_IMPSUBRESIDU_NUMERO_IMP = 10;
  public static int PQSL_IMPSUBRESIDU_ATTO_IMPEGNO = 11;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_IMPEGNO = 12;
  public static int PQSL_IMPSUBRESIDU_ANNO_IMP_PROVENIENZA = 13;
  public static int PQSL_IMPSUBRESIDU_NUMERO_IMP_PROVENIENZA = 14;
  public static int PQSL_IMPSUBRESIDU_REISCR_DA_STANZ = 15;
  public static int PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_IMP = 16;
  public static int PQSL_IMPSUBRESIDU_DISP_IMP = 17;
  public static int PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_IMP = 18;
  public static int PQSL_IMPSUBRESIDU_ANNO_SUBIMP = 19;
  public static int PQSL_IMPSUBRESIDU_NUMERO_SUBIMP = 20;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_SUBIMP = 21;
  public static int PQSL_IMPSUBRESIDU_ANNO_SUBIMP_PROVENIENZA = 22;
  public static int PQSL_IMPSUBRESIDU_NUMERO_SUBIMP_PROVENIENZA = 23;
  public static int PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_SUBIMP = 24;
  public static int PQSL_IMPSUBRESIDU_DISP_SUBIMP = 25;
  public static int PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_SUBIMP = 26;
  public static int PQSL_IMPSUBRESIDU_NOTE = 27;
  public static int PQSL_IMPSUBRESIDU_TIPO = 28;
  public static int PQSL_IMPSUBRESIDU_LIVELLO_5_IMP = 29;
  public static int PQSL_IMPSUBRESIDU_LIVELLO_5_SUBIMP = 30;
  public static int PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_IMP = 31;
  public static int PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_SUBIMP = 32;
  public static int PQSL_IMPSUBRESIDU_NUMERO_DEL = 33;
  public static int PQSL_IMPSUBRESIDU_ANNO_DEL = 34;
  public static int PQSL_IMPSUBRESIDU_SEDE_DEL = 35;
  public static int PQSL_IMPSUBRESIDU_NUMERO_PROPOSTA = 36;
  public static int PQSL_IMPSUBRESIDU_ANNO_PROPOSTA = 37;
  public static int PQSL_IMPSUBRESIDU_UNITA_PROPONENTE = 38;
  public static int PQSL_IMPSUBRESIDU_CODICE_BENEFICIARIO = 39;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_BENEFICIARIO = 40;
  public static int PQSL_IMPSUBRESIDU_ANNO_ENTRATA_PROVENIENZA = 41;
  public static int PQSL_IMPSUBRESIDU_TIPO_VINCOLO = 42;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_VINCOLO = 43;
  public static int PQSL_IMPSUBRESIDU_TIPO_AVANZO = 44;
  public static int PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_AVANZO = 45;

  // Table to contain panel selected row: ACC RESIDUI
  //
  public static int PQRY_ACCRESIDUI = 3590;
  public static int PQSL_ACCRESIDUI_ESERCIZIO = 0;
  public static int PQSL_ACCRESIDUI_CAPITOLO = 1;
  public static int PQSL_ACCRESIDUI_ARTICOLO = 2;
  public static int PQSL_ACCRESIDUI_PROGR_UO = 3;
  public static int PQSL_ACCRESIDUI_DESCRIZIONE_UO = 4;
  public static int PQSL_ACCRESIDUI_LIVELLO_4 = 5;
  public static int PQSL_ACCRESIDUI_TIPOLOGIA = 6;
  public static int PQSL_ACCRESIDUI_DESCRIZIONE_TIPOLOGIA = 7;
  public static int PQSL_ACCRESIDUI_ANNO_ACC = 8;
  public static int PQSL_ACCRESIDUI_NUMERO_ACC = 9;
  public static int PQSL_ACCRESIDUI_ATTO_ACCERTAMENTO = 10;
  public static int PQSL_ACCRESIDUI_DESCRIZIONE_ACCERTAMENTO = 11;
  public static int PQSL_ACCRESIDUI_IMPORTO_ATTUALE = 12;
  public static int PQSL_ACCRESIDUI_DISPONIBILITA = 13;
  public static int PQSL_ACCRESIDUI_NOTE = 14;
  public static int PQSL_ACCRESIDUI_ACCRESILIVE1 = 15;
  public static int PQSL_ACCRESIDUI_LIVELLO_5 = 16;
  public static int PQSL_ACCRESIDUI_IMPORTO_INIZIALE = 17;
  public static int PQSL_ACCRESIDUI_NUMERO_DEL = 18;
  public static int PQSL_ACCRESIDUI_ANNO_DEL = 19;
  public static int PQSL_ACCRESIDUI_SEDE_DEL = 20;
  public static int PQSL_ACCRESIDUI_NUMERO_PROPOSTA = 21;
  public static int PQSL_ACCRESIDUI_ANNO_PROPOSTA = 22;
  public static int PQSL_ACCRESIDUI_UNITA_PROPONENTE = 23;
  public static int PQSL_ACCRESIDUI_DEBITORE = 24;
  public static int PQSL_ACCRESIDUI_RAGIONE_SOCIALE_DEBITORE = 25;
  public static int PQSL_ACCRESIDUI_TIPO_VINCOLO = 26;
  public static int PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_VINCOLO = 27;
  public static int PQSL_ACCRESIDUI_TIPO_AVANZO = 28;
  public static int PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_AVANZO = 29;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI67 = 3591;
  public static int PQRY_PARAMETRI67_RS = 3592;
  public static int PQSL_PARAMETRI67_NOMOGGENTSPE = 0;
  public static int PQSL_PARAMETRI67_NOMEOGGDADAT = 1;
  public static int PQSL_PARAMETRI67_NOMEOGGEADAT = 2;

  // Table to contain panel selected row: ESTRAZIONE MANDATI ORDINATIVI
  //
  public static int PQRY_ESTRMANDORDI = 3593;
  public static int PQSL_ESTRMANDORDI_E_S = 0;
  public static int PQSL_ESTRMANDORDI_CAPITOLO = 1;
  public static int PQSL_ESTRMANDORDI_ARTICOLO = 2;
  public static int PQSL_ESTRMANDORDI_ANNO_LIQ = 3;
  public static int PQSL_ESTRMANDORDI_NUMERO_LIQ = 4;
  public static int PQSL_ESTRMANDORDI_ANNO_IMP = 5;
  public static int PQSL_ESTRMANDORDI_NUMERO_IMP = 6;
  public static int PQSL_ESTRMANDORDI_ANNO_SUBIMP = 7;
  public static int PQSL_ESTRMANDORDI_NUMERO_SUBIMP = 8;
  public static int PQSL_ESTRMANDORDI_ANNO_DEL = 9;
  public static int PQSL_ESTRMANDORDI_NUMERO_DEL = 10;
  public static int PQSL_ESTRMANDORDI_SEDE_DEL = 11;
  public static int PQSL_ESTRMANDORDI_D_DATA_REG = 12;
  public static int PQSL_ESTRMANDORDI_IMPORTO = 13;
  public static int PQSL_ESTRMANDORDI_RITENUTE = 14;
  public static int PQSL_ESTRMANDORDI_DESCRIZIONE = 15;
  public static int PQSL_ESTRMANDORDI_DIVERSO_BEN = 16;
  public static int PQSL_ESTRMANDORDI_BENEFICIARIO = 17;
  public static int PQSL_ESTRMANDORDI_ANNO_DOC = 18;
  public static int PQSL_ESTRMANDORDI_NUMERO_DOC = 19;
  public static int PQSL_ESTRMANDORDI_CIG = 20;
  public static int PQSL_ESTRMANDORDI_NUM_QUIETANZA = 21;
  public static int PQSL_ESTRMANDORDI_REESMAONQDB1 = 22;
  public static int PQSL_ESTRMANDORDI_CAUSALE = 23;
  public static int PQSL_ESTRMANDORDI_BOLLO = 24;
  public static int PQSL_ESTRMANDORDI_ANNO_MAND = 25;
  public static int PQSL_ESTRMANDORDI_NUMERO_MAND = 26;
  public static int PQSL_ESTRMANDORDI_NUMERO_INC = 27;
  public static int PQSL_ESTRMANDORDI_COD_LIVELLO_5 = 28;
  public static int PQSL_ESTRMANDORDI_CODICE_EUROPEO = 29;
  public static int PQSL_ESTRMANDORDI_CODICE_COFOG = 30;
  public static int PQSL_ESTRMANDORDI_IMPORTO_IVA = 31;
  public static int PQSL_ESTRMANDORDI_IMPORTO_IVA_IST = 32;
  public static int PQSL_ESTRMANDORDI_IMPORTO_NON_SOG = 33;
  public static int PQSL_ESTRMANDORDI_IMPORTO_NON_SOG_EURO = 34;
  public static int PQSL_ESTRMANDORDI_IMPORTO_PAGAM = 35;
  public static int PQSL_ESTRMANDORDI_D_DATA_MAND = 36;
  public static int PQSL_ESTRMANDORDI_FATTORE = 37;
  public static int PQSL_ESTRMANDORDI_CENTRO = 38;
  public static int PQSL_ESTRMANDORDI_REESMAORPICO = 39;
  public static int PQSL_ESTRMANDORDI_REESMAORPRTE = 40;
  public static int PQSL_ESTRMANDORDI_REESMAORDITE = 41;
  public static int PQSL_ESTRMANDORDI_RECESTMAORUF = 42;
  public static int PQSL_ESTRMANDORDI_REESMAORAMC1 = 43;
  public static int PQSL_ESTRMANDORDI_REESMAORNMC1 = 44;
  public static int PQSL_ESTRMANDORDI_REESMAORAMCI = 45;
  public static int PQSL_ESTRMANDORDI_REESMAORNMCI = 46;
  public static int PQSL_ESTRMANDORDI_REESMAOAMCAR = 47;
  public static int PQSL_ESTRMANDORDI_REESMAONMCAR = 48;
  public static int PQSL_ESTRMANDORDI_REESMAOAMCAC = 49;
  public static int PQSL_ESTRMANDORDI_REESMAONMCAC = 50;
  public static int PQSL_ESTRMANDORDI_REESMAORANMS = 51;
  public static int PQSL_ESTRMANDORDI_REESMAORNUMS = 52;
  public static int PQSL_ESTRMANDORDI_REESMAORANDI = 53;
  public static int PQSL_ESTRMANDORDI_REESMAORNUDI = 54;
  public static int PQSL_ESTRMANDORDI_REESMAORANMC = 55;
  public static int PQSL_ESTRMANDORDI_REESMAORNUMC = 56;
  public static int PQSL_ESTRMANDORDI_RECNUMQUDIBE = 57;
  public static int PQSL_ESTRMANDORDI_RECONUMECONT = 58;
  public static int PQSL_ESTRMANDORDI_RECODATACONT = 59;

  // Table to contain panel selected row: Parametri
  //
  public static int PQRY_PARAMETRI373 = 3594;
  public static int PQRY_PARAMETRI373_RS = 3595;
  public static int PQSL_PARAMETRI373_PARAMACCEPER = 0;
  public static int PQSL_PARAMETRI373_PARAMFUNZION = 1;
  public static int PQSL_PARAMETRI373_PARAMSERVIZI = 2;
  public static int PQSL_PARAMETRI373_PARASETTOPER = 3;
  public static int PQSL_PARAMETRI373_PARASERVOPER = 4;
  public static int PQSL_PARAMETRI373_PARACENDICOS = 5;
  public static int PQSL_PARAMETRI373_PARAMUOSUDDI = 6;
  public static int PQSL_PARAMETRI373_PARAMUOSOTTO = 7;
  public static int PQSL_PARAMETRI373_PARAMTITOLO = 8;
  public static int PQSL_PARAMETRI373_PARACATECAPI = 9;
  public static int PQSL_PARAMETRI373_PARAMCAUSALE = 10;
  public static int PQSL_PARAMETRI373_PARATIPOVINC = 11;
  public static int PQSL_PARAMETRI373_PARAVINCSCAD = 12;
  public static int PQSL_PARAMETRI373_PARAMPROGRAM = 13;
  public static int PQSL_PARAMETRI373_PARAMPROGETT = 14;
  public static int PQSL_PARAMETRI373_PARAMFLESSIB = 15;
  public static int PQSL_PARAMETRI373_PARAMRESPONS = 16;
  public static int PQSL_PARAMETRI373_PARAVOCEECON = 17;
  public static int PQSL_PARAMETRI373_PARACODIGEST = 18;
  public static int PQSL_PARAMETRI373_PARADETTRIEP = 19;
  public static int PQSL_PARAMETRI373_PARARESICOMP = 20;
  public static int PQSL_PARAMETRI373_PARADATAELAB = 21;
  public static int PQSL_PARAMETRI373_PARASOLODISP = 22;
  public static int PQSL_PARAMETRI373_PARAOBIESCAD = 23;
  public static int PQSL_PARAMETRI373_PARAMOBIETTI = 24;
  public static int PQSL_PARAMETRI373_PARAMVLIVELL = 25;
  public static int PQSL_PARAMETRI373_PARAMCODEURO = 26;
  public static int PQSL_PARAMETRI373_PARAMTITOLO1 = 27;
  public static int PQSL_PARAMETRI373_PARAMTIPOLOG = 28;
  public static int PQSL_PARAMETRI373_PARAMCATEGOR = 29;
  public static int PQSL_PARAMETRI373_PARAMUOSUDD2 = 30;
  public static int PQSL_PARAMETRI373_PARAEXPOEXCE = 31;
  public static int PQSL_PARAMETRI373_PARAOBIEGEST = 32;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPCL4 = 3596;
  public static int PQSL_CF4SITIMPCL4_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPCL4_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITIMPCL4_CAPITOLO = 2;
  public static int PQSL_CF4SITIMPCL4_ARTICOLO = 3;
  public static int PQSL_CF4SITIMPCL4_ANNO_IMPACC = 4;
  public static int PQSL_CF4SITIMPCL4_NUMERO_IMPACC = 5;
  public static int PQSL_CF4SITIMPCL4_RECORDACCERT = 6;
  public static int PQSL_CF4SITIMPCL4_DATA_IMPACC = 7;
  public static int PQSL_CF4SITIMPCL4_DEL_PROP = 8;
  public static int PQSL_CF4SITIMPCL4_OBBLIGATORIO = 9;
  public static int PQSL_CF4SITIMPCL4_DESCR_IMPACC = 10;
  public static int PQSL_CF4SITIMPCL4_IMPORTO_IMPACC = 11;
  public static int PQSL_CF4SITIMPCL4_RECIMPIMACRE = 12;
  public static int PQSL_CF4SITIMPCL4_SUBIMPEGNATO = 13;
  public static int PQSL_CF4SITIMPCL4_RECSUBIMPRES = 14;
  public static int PQSL_CF4SITIMPCL4_LIQUIDATO = 15;
  public static int PQSL_CF4SITIMPCL4_RECOLIQURESI = 16;
  public static int PQSL_CF4SITIMPCL4_MAN_ORD = 17;
  public static int PQSL_CF4SITIMPCL4_RECMANORDRES = 18;
  public static int PQSL_CF4SITIMPCL4_DISPONIBILITA = 19;
  public static int PQSL_CF4SITIMPCL4_RECODISPRESI = 20;
  public static int PQSL_CF4SITIMPCL4_PROGR_UO_GEST = 21;
  public static int PQSL_CF4SITIMPCL4_DESCR_UO_GEST = 22;
  public static int PQSL_CF4SITIMPCL4_PROGR_UO_LIVELLO_SUP = 23;
  public static int PQSL_CF4SITIMPCL4_DESCR_UO_LIVELLO_SUP = 24;
  public static int PQSL_CF4SITIMPCL4_PROGR_UO_UTILIZZO = 25;
  public static int PQSL_CF4SITIMPCL4_DESCR_UO_UTILIZZO = 26;
  public static int PQSL_CF4SITIMPCL4_COMP_RES = 27;
  public static int PQSL_CF4SITIMPCL4_RECORRAGGRUO = 28;
  public static int PQSL_CF4SITIMPCL4_RECODESRAGUO = 29;
  public static int PQSL_CF4SITIMPCL4_RECRAGVOCPEG = 30;
  public static int PQSL_CF4SITIMPCL4_RECORAGISOCI = 31;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPCL5 = 3597;
  public static int PQSL_CF4SITIMPCL5_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPCL5_RECORVOCEPEG = 1;
  public static int PQSL_CF4SITIMPCL5_CAPITOLO = 2;
  public static int PQSL_CF4SITIMPCL5_ARTICOLO = 3;
  public static int PQSL_CF4SITIMPCL5_ANNO_IMPACC = 4;
  public static int PQSL_CF4SITIMPCL5_NUMERO_IMPACC = 5;
  public static int PQSL_CF4SITIMPCL5_DATA_IMPACC = 6;
  public static int PQSL_CF4SITIMPCL5_DEL_PROP = 7;
  public static int PQSL_CF4SITIMPCL5_OBBLIGATORIO = 8;
  public static int PQSL_CF4SITIMPCL5_DESCR_IMPACC = 9;
  public static int PQSL_CF4SITIMPCL5_IMPORTO_IMPACC = 10;
  public static int PQSL_CF4SITIMPCL5_SUBIMPEGNATO = 11;
  public static int PQSL_CF4SITIMPCL5_LIQUIDATO = 12;
  public static int PQSL_CF4SITIMPCL5_MAN_ORD = 13;
  public static int PQSL_CF4SITIMPCL5_DISPONIBILITA = 14;
  public static int PQSL_CF4SITIMPCL5_PROGR_UO_GEST = 15;
  public static int PQSL_CF4SITIMPCL5_DESCR_UO_GEST = 16;
  public static int PQSL_CF4SITIMPCL5_PROGR_UO_LIVELLO_SUP = 17;
  public static int PQSL_CF4SITIMPCL5_DESCR_UO_LIVELLO_SUP = 18;
  public static int PQSL_CF4SITIMPCL5_PROGR_UO_UTILIZZO = 19;
  public static int PQSL_CF4SITIMPCL5_DESCR_UO_UTILIZZO = 20;
  public static int PQSL_CF4SITIMPCL5_RECORRAGGRUO = 21;
  public static int PQSL_CF4SITIMPCL5_RECODESRAGUO = 22;
  public static int PQSL_CF4SITIMPCL5_RECRAGVOCPEG = 23;
  public static int PQSL_CF4SITIMPCL5_IMPORTO_IMPACC_RES = 24;
  public static int PQSL_CF4SITIMPCL5_SUBIMPEGNATO_RES = 25;
  public static int PQSL_CF4SITIMPCL5_LIQUIDATO_RES = 26;
  public static int PQSL_CF4SITIMPCL5_MAN_ORD_RES = 27;
  public static int PQSL_CF4SITIMPCL5_DISPONIBILITA_RES = 28;

  // Table to contain panel selected row: CF4WEB SIT IMPACC CLASSIF
  //
  public static int PQRY_CF4SITIMPCL1 = 3598;
  public static int PQSL_CF4SITIMPCL1_PROGRESSIVO = 0;
  public static int PQSL_CF4SITIMPCL1_CAPITOLO = 1;
  public static int PQSL_CF4SITIMPCL1_ARTICOLO = 2;
  public static int PQSL_CF4SITIMPCL1_ANNO_IMPACC = 3;
  public static int PQSL_CF4SITIMPCL1_NUMERO_IMPACC = 4;
  public static int PQSL_CF4SITIMPCL1_DATA_IMPACC = 5;
  public static int PQSL_CF4SITIMPCL1_DEL_PROP = 6;
  public static int PQSL_CF4SITIMPCL1_OBBLIGATORIO = 7;
  public static int PQSL_CF4SITIMPCL1_DESCR_IMPACC = 8;
  public static int PQSL_CF4SITIMPCL1_IMPORTO_IMPACC = 9;
  public static int PQSL_CF4SITIMPCL1_SUBIMPEGNATO = 10;
  public static int PQSL_CF4SITIMPCL1_LIQUIDATO = 11;
  public static int PQSL_CF4SITIMPCL1_MAN_ORD = 12;
  public static int PQSL_CF4SITIMPCL1_DISPONIBILITA = 13;
  public static int PQSL_CF4SITIMPCL1_PROGR_UO_GEST = 14;
  public static int PQSL_CF4SITIMPCL1_DESCR_UO_GEST = 15;
  public static int PQSL_CF4SITIMPCL1_PROGR_UO_LIVELLO_SUP = 16;
  public static int PQSL_CF4SITIMPCL1_DESCR_UO_LIVELLO_SUP = 17;
  public static int PQSL_CF4SITIMPCL1_PROGR_UO_UTILIZZO = 18;
  public static int PQSL_CF4SITIMPCL1_DESCR_UO_UTILIZZO = 19;
  public static int PQSL_CF4SITIMPCL1_RECODESRAGUO = 20;
  public static int PQSL_CF4SITIMPCL1_IMPORTO_IMPACC_RES = 21;
  public static int PQSL_CF4SITIMPCL1_SUBIMPEGNATO_RES = 22;
  public static int PQSL_CF4SITIMPCL1_LIQUIDATO_RES = 23;
  public static int PQSL_CF4SITIMPCL1_MAN_ORD_RES = 24;
  public static int PQSL_CF4SITIMPCL1_DISPONIBILITA_RES = 25;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR29 = 3599;
  public static int PQRY_PAR29_RS = 3600;
  public static int PQSL_PAR29_ROWNAMERESID = 0;
  public static int PQSL_PAR29_ROWNAMDATELA = 1;
  public static int PQSL_PAR29_ROWNAMCODDEB = 2;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR31 = 3601;
  public static int PQRY_PAR31_RS = 3602;
  public static int PQSL_PAR31_ROWNAMEESPOS = 0;
  public static int PQSL_PAR31_ROWNAMEFATTO = 1;
  public static int PQSL_PAR31_ROWNAMECENTR = 2;
  public static int PQSL_PAR31_ROWNAMEDAL = 3;
  public static int PQSL_PAR31_ROWNAMEAL = 4;
  public static int PQSL_PAR31_ROWNAMERESID = 5;
  public static int PQSL_PAR31_ROWNAMSORIEC = 6;

  // Table to contain panel selected row: Par
  //
  public static int PQRY_PAR33 = 3603;
  public static int PQRY_PAR33_RS = 3604;
  public static int PQSL_PAR33_ROWNAMECAPIT = 0;
  public static int PQSL_PAR33_ROWNAMEARTIC = 1;
  public static int PQSL_PAR33_ROWNAMDETRIE = 2;
  public static int PQSL_PAR33_ROWNAMRESCOM = 3;
  public static int PQSL_PAR33_ROWNAMANNRES = 4;
  public static int PQSL_PAR33_ROWNAMSOLDIS = 5;
  public static int PQSL_PAR33_ROWNAMDATELA = 6;

}
