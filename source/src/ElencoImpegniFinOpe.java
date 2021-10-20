// **********************************************
// Elenco Impegni Fin Ope
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoImpegniFinOpe extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;
  private static int PFL_PARAMETRI_SUBIMPEGNI = 2;

  private static int PPQRY_PARAMETRI410 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ELENCOIMPEGN_CAPITOLO = 0;
  private static int PFL_ELENCOIMPEGN_ARTICOLO = 1;
  private static int PFL_ELENCOIMPEGN_NUMEROIMP = 2;
  private static int PFL_ELENCOIMPEGN_ANNOIMP = 3;
  private static int PFL_ELENCOIMPEGN_INFOIMPEGNI = 4;
  private static int PFL_ELENCOIMPEGN_NUMEROSUBIMP = 5;
  private static int PFL_ELENCOIMPEGN_ANNOSUBIMP = 6;
  private static int PFL_ELENCOIMPEGN_INFOSUBIMPEG = 7;
  private static int PFL_ELENCOIMPEGN_IMPORTO = 8;
  private static int PFL_ELENCOIMPEGN_SUBIMPEGNATO = 9;
  private static int PFL_ELENCOIMPEGN_LIQUIDATO = 10;
  private static int PFL_ELENCOIMPEGN_PAGATO = 11;
  private static int PFL_ELENCOIMPEGN_DISPEFFETTIV = 12;
  private static int PFL_ELENCOIMPEGN_DATA = 13;
  private static int PFL_ELENCOIMPEGN_DESCRIZIONE = 14;
  private static int PFL_ELENCOIMPEGN_SEDEDEL = 15;
  private static int PFL_ELENCOIMPEGN_NUMERODEL = 16;
  private static int PFL_ELENCOIMPEGN_ANNODEL = 17;
  private static int PFL_ELENCOIMPEGN_OBBLIGATORIO = 18;
  private static int PFL_ELENCOIMPEGN_PRENOTAZIONE = 19;
  private static int PFL_ELENCOIMPEGN_UNITAPROPONE = 20;
  private static int PFL_ELENCOIMPEGN_NUMEROPROPOS = 21;
  private static int PFL_ELENCOIMPEGN_ANNOPROPOSTA = 22;
  private static int PFL_ELENCOIMPEGN_BENEFICIARIO = 23;
  private static int PFL_ELENCOIMPEGN_RAGIONSOCIAL = 24;
  private static int PFL_ELENCOIMPEGN_NUMEIMPEPROV = 25;
  private static int PFL_ELENCOIMPEGN_CAPITOLOART = 26;
  private static int PFL_ELENCOIMPEGN_IMPEGNO = 27;
  private static int PFL_ELENCOIMPEGN_DELIBERA = 28;
  private static int PFL_ELENCOIMPEGN_PROPOSTA = 29;
  private static int PFL_ELENCOIMPEGN_SUBIMPEGNO = 30;
  private static int PFL_ELENCOIMPEGN_ESERCIZIO = 31;
  private static int PFL_ELENCOIMPEGN_ANNSUBIMPORD = 32;
  private static int PFL_ELENCOIMPEGN_NUMSUBIMPORD = 33;
  private static int PFL_ELENCOIMPEGN_ANNOIMPEPROV = 34;
  private static int PFL_ELENCOIMPEGN_ANNOSUBIPROV = 35;
  private static int PFL_ELENCOIMPEGN_NUMESUBIPROV = 36;
  private static int PFL_ELENCOIMPEGN_CODICECOFOG = 37;
  private static int PFL_ELENCOIMPEGN_CODLIVELLO5 = 38;
  private static int PFL_ELENCOIMPEGN_CODICEEUROPE = 39;
  private static int PFL_ELENCOIMPEGN_DESCLIVELLO5 = 40;
  private static int PFL_ELENCOIMPEGN_DESCCOFOG = 41;
  private static int PFL_ELENCOIMPEGN_ETICIMPEPROV = 42;
  private static int PFL_ELENCOIMPEGN_ETICHESUBIMP = 43;

  private static int PPQRY_IMPSUBFIOPE1 = 0;

  private static int PPQRY_INFO = 1;
  private static int PPQRY_LIVELLO5 = 2;
  private static int PPQRY_COFOG = 3;


  IDPanel PAN_ELENCOIMPEGN;
  CIDREObj BUK_LIBRELENIMPE;
  OBook BKW_LIBRELENIMPE;
  //
  // Template Pages constants
  private static int BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG = 1;
  private static int BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER = 4;
  private static int BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA = 5;
  private static int BUK_LIBRELENIMPE_RPTBOX_PAGEBODY = 6;
  private static int BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_LIBRELENIMPE_RPT_ELENIMPEREPO = 8;
  private static int BUK_LIBRELENIMPE_SEC_REPORTHEADER = 9;
  private static int BUK_LIBRELENIMPE_SEC_PAGEHEADER = 10;
  private static int BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH = 11;
  private static int BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH = 12;
  private static int BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE = 13;
  private static int BUK_LIBRELENIMPE_SPAN_C1 = 14;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER = 15;
  private static int BUK_LIBRELENIMPE_SPAN_IMPEGNO1 = 16;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD = 17;
  private static int BUK_LIBRELENIMPE_SPAN_IMPEGNO = 18;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER = 19;
  private static int BUK_LIBRELENIMPE_SPAN_IMPORTO = 20;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER = 21;
  private static int BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO = 22;
  private static int BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER = 23;
  private static int BUK_LIBRELENIMPE_SPAN_LIQUIDATO = 24;
  private static int BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER = 25;
  private static int BUK_LIBRELENIMPE_SPAN_PAGATO = 26;
  private static int BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER = 27;
  private static int BUK_LIBRELENIMPE_SPAN_DISPONIBILIT = 28;
  private static int BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE = 29;
  private static int BUK_LIBRELENIMPE_SPAN_DATAREG = 30;
  private static int BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER = 31;
  private static int BUK_LIBRELENIMPE_SPAN_DESCRIZIONE = 32;
  private static int BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD = 33;
  private static int BUK_LIBRELENIMPE_SPAN_C2 = 34;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD = 35;
  private static int BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO = 36;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH = 37;
  private static int BUK_LIBRELENIMPE_SPAN_C = 38;
  private static int BUK_LIBRELENIMPE_RPTBOX_VOCEPEG = 39;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIF = 40;
  private static int BUK_LIBRELENIMPE_SEC_DETAIL = 41;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA = 42;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECEIFOEI = 43;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG = 44;
  private static int BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG = 45;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR = 46;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAEIFOEI = 47;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI = 48;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENIEIFOE = 49;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO = 50;
  private static int BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO = 51;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI = 52;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAIEIFOE = 53;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS = 54;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENSEIFOE = 55;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE = 56;
  private static int BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE = 57;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS = 58;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEASEIFOE = 59;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPORTO = 60;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIFO = 61;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO = 62;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOETTSEIFO = 63;
  private static int BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO = 64;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOELEIFOEI = 65;
  private static int BUK_LIBRELENIMPE_RPTBOX_MANDATI = 66;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEMEIFOEI = 67;
  private static int BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT = 68;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOE1 = 69;
  private static int BUK_LIBRELENIMPE_RPTBOX_DATAREG = 70;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIF = 71;
  private static int BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE = 72;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOEI = 73;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD = 74;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOESDEIFOE = 75;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND = 76;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENDEIFOE = 77;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD = 78;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEADEIFOE = 79;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG = 80;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEIOEIFOE = 81;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP = 82;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEUPEIFOE = 83;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP = 84;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENPEIFOE = 85;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP = 86;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAPEIFOE = 87;
  private static int BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE = 88;
  private static int BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE = 89;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER = 90;
  private static int BUK_LIBRELENIMPE_SPAN_BARRADELIBER = 91;
  private static int BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS = 92;
  private static int BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS = 93;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST = 94;
  private static int BUK_LIBRELENIMPE_SPAN_BARRAPROPOST = 95;
  private static int BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF = 96;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1 = 97;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1 = 98;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1 = 99;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2 = 100;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1 = 101;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3 = 102;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1 = 103;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4 = 104;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1 = 105;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF = 106;
  private static int BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO = 107;
  private static int BUK_LIBRELENIMPE_SPAN_TOTALEARTICO = 108;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRA = 109;
  private static int BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF = 110;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO = 111;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1 = 112;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE = 113;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2 = 114;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA = 115;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3 = 116;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO = 117;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4 = 118;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI = 119;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF = 120;
  private static int BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO = 121;
  private static int BUK_LIBRELENIMPE_SPAN_TOTALECAPITO = 122;
  private static int BUK_LIBRELENIMPE_SEC_PAGEFOOTER = 123;
  private static int BUK_LIBRELENIMPE_SEC_REPORTFOOTER = 124;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI465(IMDB);
    //
    //
    Init_PQRY_IMPSUBFIOPE1(IMDB);
    Init_PQRY_PARAMETRI410(IMDB);
    Init_PQRY_PARAMETRI410_RS(IMDB);
    Init_PQRY_IMPSUBFIOPEL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI465(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI465, 8);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI465, "TBL_PARAMETRI465");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI465,IMDBDef6.FLD_PARAMETRI465_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI465, 0);
  }

  private static void Init_PQRY_IMPSUBFIOPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_IMPSUBFIOPE1, 33);
    IMDB.set_TblCode(IMDBDef17.PQRY_IMPSUBFIOPE1, "PQRY_IMPSUBFIOPE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCA, "IMSUFIOPELCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAR, "IMSUFIOPELAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, "IMSUFIOPELAI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI, "IMSUFIOPELNI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAD, "IMSUFIOPELAD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAD,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELND, "IMSUFIOPELND");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELND,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELSD, "IMSUFIOPELSD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELSD,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOEDDDR, "IMSUFIOEDDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOEDDDR,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELDE, "IMSUFIOPELDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELDE,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAP, "IMSUFIOPELAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELUP, "IMSUFIOPELUP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELUP,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNP, "IMSUFIOPELNP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELD1, "IMSUFIOPELD1");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELD1,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELIO, "IMSUFIOPELIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELBE, "IMSUFIOPELBE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELBE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFOEBRSEE, "IMSUFOEBRSEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFOEBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS, "IMSUFIOPELAS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, "IMSUFIOPELNS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOEASIO, "IMSUFIOEASIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOEASIO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOENSIO, "IMSUFIOENSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOENSIO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEIII, "IMSUFIOPEIII");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEIII,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPETTS, "IMSUFIOPETTS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPETTS,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELMA, "IMSUFIOPELMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELMA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELLI, "IMSUFIOPELLI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELLI,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELPR, "IMSUFIOPELPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELPR,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELES, "IMSUFIOPELES");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELES,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCC, "IMSUFIOPELCC");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCC,1,3,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPECL5, "IMSUFIOPECL5");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPECL5,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCE, "IMSUFIOPELCE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEAIP, "IMSUFIOPEAIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEAIP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPENIP, "IMSUFIOPENIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPENIP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEASP, "IMSUFIOPEASP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPEASP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPENSP, "IMSUFIOPENSP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE1,IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPENSP,2,15,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_IMPSUBFIOPE1, 0);
  }

  private static void Init_PQRY_PARAMETRI410(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI410, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI410, "PQRY_PARAMETRI410");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI410, 0);
  }

  private static void Init_PQRY_PARAMETRI410_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI410_RS, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI410_RS, "PQRY_PARAMETRI410_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI410_RS,IMDBDef17.PQSL_PARAMETRI410_ROWNAMSUBIMP,5,2,0);
  }

  private static void Init_PQRY_IMPSUBFIOPEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_IMPSUBFIOPEL, 25);
    IMDB.set_TblCode(IMDBDef17.PQRY_IMPSUBFIOPEL, "PQRY_IMPSUBFIOPEL");
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELCA, "IMSUFIOPELCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAR, "IMSUFIOPELAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAI, "IMSUFIOPELAI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNI, "IMSUFIOPELNI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAD, "IMSUFIOPELAD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAD,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELND, "IMSUFIOPELND");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELND,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELSD, "IMSUFIOPELSD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELSD,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOEDDDR, "IMSUFIOEDDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOEDDDR,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELDE, "IMSUFIOPELDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELDE,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAP, "IMSUFIOPELAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELUP, "IMSUFIOPELUP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELUP,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNP, "IMSUFIOPELNP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELIO, "IMSUFIOPELIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELBE, "IMSUFIOPELBE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELBE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAS, "IMSUFIOPELAS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELAS,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNS, "IMSUFIOPELNS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELNS,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOEVPEG, "IMSUFIOEVPEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOEVPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPEIII, "IMSUFIOPEIII");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPEIII,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPETTS, "IMSUFIOPETTS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPETTS,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELLI, "IMSUFIOPELLI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELLI,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELMA, "IMSUFIOPELMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELMA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELDI, "IMSUFIOPELDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELDI,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFOEBRSEE, "IMSUFOEBRSEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFOEBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELOI, "IMSUFIOPELOI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPELOI,5,198,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPEOSI, "IMSUFIOPEOSI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPEL,IMDBDef17.PQSL_IMPSUBFIOPEL_IMSUFIOPEOSI,5,198,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_IMPSUBFIOPEL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImpegniFinOpe(MyWebEntryPoint w, IMDBObj imdb)
  {
    //
    SetMainFrm(w,imdb);
  }

  // **********************************************
  // Funzione chiamata su form multipla
  // durante l'inizializzazione
  // **********************************************
  public void SetMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetMainFrm(w,i);
  }
  public void SetSubMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetSubMainFrm(w, i);
  }


  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImpegniFinOpe()
  {
    super();
    //
  }

  // **********************************************
  // Form Loaded
  // **********************************************
  public void Init(WebEntryPoint w, boolean flMulti, boolean flSubForm)
  {
    StringBuffer SQL;
    int i;
    ATreeItem Item;

    MainFrm=(MyWebEntryPoint)w;
    super.Init(w, flMulti, flSubForm);
    //
    FormIdx = MyGlb.FRM_ELEIMPFINOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E7CB5C2B-BCB5-4609-AEA9-D3CCF03E495D";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 458;
    set_Caption(new IDVariant("Elenco Impegni Fin Ope"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 432;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12037;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B3BA7881-97C4-4600-83BB-1990CAFD5E0B");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 768, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 816;
    Frames[3].Height = 380;
    Frames[3].Caption = "Elenco Impegni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_ELENCOIMPEGN = new IDPanel(w, this, 3, "PAN_ELENCOIMPEGN");
    Frames[3].Content = PAN_ELENCOIMPEGN;
    PAN_ELENCOIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRELENIMPE != null)
      PAN_ELENCOIMPEGN.SetBook(BUK_LIBRELENIMPE);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ECB71B41-1C71-4CF7-A430-75C11082B342");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2112, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOIMPEGN.InitStatus = 1;
    PAN_ELENCOIMPEGN_Init();
    PAN_ELENCOIMPEGN_InitFields();
    PAN_ELENCOIMPEGN_InitQueries();
    BKW_LIBRELENIMPE = new OBook(this);
    BUK_LIBRELENIMPE = new CIDREObj(BKW_LIBRELENIMPE);
    BKW_LIBRELENIMPE.iGuid = "41B544FC-312B-49B7-A891-449AF9225913";
    BKW_LIBRELENIMPE.Code = "BUK_LIBRELENIMPE";
    BKW_LIBRELENIMPE.BookObj = BUK_LIBRELENIMPE;
    BKW_LIBRELENIMPE.InitDefMasks();
    BUK_LIBRELENIMPE.InitBook(1, 3342337, "Libro Elenco Impegni", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRELENIMPE.InitHTML();
    BUK_LIBRELENIMPE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRELENIMPE.Book.SetMainFrm(MainFrm);
    BUK_LIBRELENIMPE.SetRTCGuid(0, "41B544FC-312B-49B7-A891-449AF9225913");
    BUK_LIBRELENIMPE.SetObjCode(0, "LIBRELENIMPE");
    if (PAN_ELENCOIMPEGN != null)
      PAN_ELENCOIMPEGN.SetBook(BUK_LIBRELENIMPE);
    BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG_Init();
    BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_Init();
    BUK_LIBRELENIMPE_InitLinks();
    HelpFile = "";
    MainFrm.InitializingQueries = false;
    //
    // Modifico alcune impostazioni per smartphone, potranno
    // essere ulteriormente modificate nell'evento di Load
    if (MainFrm.IsSmartPhone())
    {
      DockType = 0;
      Docked = false;
      ResModeW = Glb.FRESMODE_STRETCH;
      ResModeH = Glb.FRESMODE_STRETCH;
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
      {
        Frames[i].Content.MainFrm = w;
        Frames[i].Content.Parent = this;
        ((IDPanel)Frames[i].Content).CalcLayout();
        ((IDPanel)Frames[i].Content).SetDOIMDB(IMDB);
      }
      if (Frames[i].Content instanceof OBook)
        Frames[i].Content.MainFrm = w;
      //
      if (Frames[i].Content != null)
        Frames[i].Content.Collapsable = w.ParamsObj().UseCollapsableFrames;
      //
      if (Frames[i].Content != null && Frames[i].HasCaptionToolbar==-1)
        Frames[i].HasCaptionToolbar = MainFrm.CmdObj.HasCaptionToolbar(FormIdx, Frames[i].Index, Frames[i].Content.Code);
    }
    //
    // Init sub-frames
    for (i = 1; i < Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
        for (int j = 0; j < ((IDPanel)Frames[i].Content).UFields(); j++)
          ((IDPanel)Frames[i].Content).bFields(j).UpdateSubFrame();
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof OTabView)
        ((OTabView)Frames[i].Content).SelectTab(1, true);
    }
    OrgWidth = Frames[1].Width + GetPadding(false);
    OrgHeight = Frames[1].Height + GetPadding(true);
    //
    // Resetto il fuoco perchè le tabbed view lo possono modificare
    FocusPriority=0;
    ActiveElement="";
    //
    MainFrm.RolObj.ApplyRoles(FormIdx, this);
    //
    MainFrm.TimerObj.ActivateTimers(FormIdx, true);    
    IntFormLoad();
    //
    // Solo le form non modali devono essere ridimensionate
    if (!flSubForm && (!MainFrm.ParamsObj().TruePopup || OpenAs == Glb.OPEN_MDI))
      Resize(w.ScreenW(), w.ScreenH());
    //
    JustLoaded = true;
    UpdateControls();
    MainFrm.InitializingQueries = oldIQ;
  }


  // **********************************************
  // Command Activation Handler
  // **********************************************
  public void CmdClickCB(int CmdIdx)
  {
    fine:
    {
      if (CmdIdx==MyGlb.CMD_NUOVO+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI88+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG138+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI88+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOPREN+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaPrenotazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOIMPE+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaImpegni();
        break fine;
      }
    }
  }
  
  
  // **********************************************
  // Timer Activation Handler
  // **********************************************
  public void TimerTickCB(int TimerIdx)
  {
    fine:
    {
    }
  }
  
  
  // **********************************************
  // Update Controls against IMDB variations
  // **********************************************
  public void UpdateControls()
  {
    try
    {    
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI465, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELEIMPFINOPE_PARAMETRI410();
      }
      PAN_ELENCOIMPEGN.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_LIBRELENIMPE.UpdateBook();
      //
    }
    catch(Exception e)
    {
      e.printStackTrace(System.out);
    }
    JustLoaded = false;
    DOSetCaption();
    super.UpdateControls();
  }
  
  
  // **********************************************
  // One of my modal form has been closed
  // **********************************************
  public void EndModal(int CallerIdx, boolean flRis)
  {
    IDVariant Cancel=new IDVariant();
    IntEndModal(new IDVariant(CallerIdx), new IDVariant(flRis), Cancel);
    if (Cancel.isTrue())
    {
      if (MainFrm != null) MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, RTCGuid, 26, "Form.EndModal", "Form " + Caption() + " canceled further processing after EndModal event");
      return;
    }
    //
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_LIBRELENIMPE")) return BUK_LIBRELENIMPE;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoImpegniFinOpe);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoImpegniFinOpe.class.getName() : (Glb.ClassWithPackage(ElencoImpegniFinOpe.class) ? ElencoImpegniFinOpe.class.getName().substring(ElencoImpegniFinOpe.class.getPackage().getName().length() + 1) : ElencoImpegniFinOpe.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Impegni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOIMPEGN);
      // 
      // Elenco Impegni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELENCOIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPEGN_DESCRIZIONE,IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELDE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ElencoImpegniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Impegni On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Impegni On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ELENCOIMPEGN.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET39+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET39+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ElencoImpegniOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Impegni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Impegni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ELENCOIMPEGN.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ElencoImpegniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Load Event
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMSUBIMP, 0, (new IDVariant("SI")));
      PAN_ELENCOIMPEGN.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOIMPEGN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CHIUAUTOPREN)), true) && Result.booleanValue())
      {
        PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI410, IMDBDef17.PQSL_PARAMETRI410_ROWNAMSUBIMP, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMPE+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMPE+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Stampa
  // **********************************************************************
  public int ApriStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Body
      // Procedure Body
      // 
      BUK_LIBRELENIMPE.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_LIBRELENIMPE.ReportRefreshQuery(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO);
      BUK_LIBRELENIMPE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_LIBRELENIMPE.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ApriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Chiusura Automatica Prenotazioni
  // **********************************************************************
  public int ApriChiusuraAutomaticaPrenotazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Apri Chiusura Automatica Prenotazioni Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("PRE")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOIMPEGN.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOIMPEGN.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOIMPEGN.GotoFirst();
        while (!PAN_ELENCOIMPEGN.RSEOF())
        {
          if (PAN_ELENCOIMPEGN.IsRowSelected(I.intValue()))
          {
            APRCHIAUTPRE_IMPACCSEINV1(C3.Get("IMSUFIOPELES"), C3.Get("IMSUFIOPELAI"), C3.Get("IMSUFIOPELNI"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOIMPEGN.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTPRE_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ApriChiusuraAutomaticaPrenotazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINV1(IDVariant C3_IMSUFIOPELES, IDVariant C3_IMSUFIOPELAI, IDVariant C3_IMSUFIOPELNI) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_IMSUFIOPELES);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_IMSUFIOPELAI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_IMSUFIOPELNI);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELES, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI, 0));
  }

  // **********************************************************************
  // Apri Chiusura Automatica Impegni
  // **********************************************************************
  public int ApriChiusuraAutomaticaImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Apri Chiusura Automatica Impegni Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("IMP")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOIMPEGN.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOIMPEGN.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOIMPEGN.GotoFirst();
        while (!PAN_ELENCOIMPEGN.RSEOF())
        {
          if (PAN_ELENCOIMPEGN.IsRowSelected(I.intValue()))
          {
            APRCHIAUTIMP_IMPACCSEINV1(C3.Get("IMSUFIOPELES"), C3.Get("IMSUFIOPELCA"), C3.Get("IMSUFIOPELAR"), C3.Get("IMSUFIOPELAI"), C3.Get("IMSUFIOPELNI"), C3.Get("IMSUFIOPELD1"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOIMPEGN.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTIMP_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ApriChiusuraAutomaticaImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINV1(IDVariant C3_IMSUFIOPELES, IDVariant C3_IMSUFIOPELCA, IDVariant C3_IMSUFIOPELAR, IDVariant C3_IMSUFIOPELAI, IDVariant C3_IMSUFIOPELNI, IDVariant C3_IMSUFIOPELD1) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_IMSUFIOPELES);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_IMSUFIOPELCA);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_IMSUFIOPELAR);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_IMSUFIOPELAI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_IMSUFIOPELNI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_IMSUFIOPELD1);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELES, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCA, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAR, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELD1, 0));
  }

  // **********************************************************************
  // Apri Info Impegno
  // **********************************************************************
  public int ApriInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Sub Impegno
  // **********************************************************************
  public int ApriInfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, 0));
      if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ApriInfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_RONANUSUDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).ProponiNuovaRigaSubimpegno();
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_RONANUIMDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELCA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAR, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0)).PAN_IMPEGNO.PanelCommand(Glb.PCM_INSERT);
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0,true,this)).ProponiNuovaRigaImpegno();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "Nuovo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, 0))))
      {
        if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAS, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNS, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELAI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE1, IMDBDef17.PQSL_IMPSUBFIOPE1_IMSUFIOPELNI, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Export CSV
  // **********************************************************************
  public int ExportCSV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export CSV Body
      // Corpo Procedura
      // 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      new IDVariant(PAN_ELENCOIMPEGN.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniFinOpe", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELEIMPFINOPE_PARAMETRI410() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI410_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI465, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI465, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI410_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI410_RS, 0, IMDBDef6.TBL_PARAMETRI465, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI410_RS, 0, 0, IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI410_RS, 1, 0, IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI410_RS, 2, 0, IMDBDef6.TBL_PARAMETRI465, IMDBDef6.FLD_PARAMETRI465_ROWNAMSUBIMP, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI465, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI465, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI465, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI410_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
      MainFrm.Form_Activate(this);
    // Stub
  }

  // **********************************************************************
  // Deactivate
  // Evento notificato alla videata quando essa viene messa
  // in secondo piano
  // **********************************************************************
  public void Form_Deactivate(IDVariant Cancel)
  {
    // Stub
  }

  // **********************************************************************
  // On Change Document
  // Evento notificato al form quando viene cambiato il
  // documento collegato
  // **********************************************************************
  public void OnChangeDocument(com.progamma.doc.IDDocument OldDocument)
  {
    // Stub
  }

  // **********************************************************************
  // On Send Message
  // Evento notificato quando una videata invia un messaggio
  // tramite la procedura SendMessage
  // **********************************************************************
  public void OnSendMessage(IDVariant Message, WebForm Sender, com.progamma.doc.IDDocument Doc, IDVariant Par1, IDVariant Par2, IDVariant Par3, IDVariant Par4)
  {
    // Stub
  }

  
  
  // **********************************************
  // Frame Events
  // **********************************************
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOIMPEGN, Cancel);
    // Stub
  }

  private void PAN_ELENCOIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOIMPEGN_INFOIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOIMPEGN_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBRELENIMPE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRELENIMPE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRELENIMPE_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH)
    {
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH)
    {
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_DETAIL)
    {
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELCA"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELNI"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELNS"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELSD"))))?(new IDVariant("-")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_BARRADELIBER, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELND"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELUP"))))?(new IDVariant("-")):(new IDVariant()))));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, new IDVariant(((!(IDL.IsNull(BUK_LIBRELENIMPE.GetReportColumn(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "IMSUFIOPELNP"))))?(new IDVariant("/")):(new IDVariant()))));
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF)
    {
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF,"IMSUFIOPEIII")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF,"IMSUFIOPETTS")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF,"IMSUFIOPELLI")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF,"IMSUFIOPELMA")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF,"IMSUFIOPELDI")));
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF)
    {
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF,"IMSUFIOPEIII")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF,"IMSUFIOPETTS")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF,"IMSUFIOPELLI")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF,"IMSUFIOPELMA")));
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, new IDVariant(BUK_LIBRELENIMPE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF,"IMSUFIOPELDI")));
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIBRELENIMPE_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_LIBRELENIMPE_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRELENIMPE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG)
    {
      BUK_LIBRELENIMPE.set_SpanValue(BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENIMPE.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENIMPE.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRELENIMPE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRELENIMPE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRELENIMPE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRELENIMPE_OnPreview()
  {
    PreviewBook = BKW_LIBRELENIMPE;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOIMPEGN_Init()
  {

    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_FIELD, 44);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "ED896325-EF3A-4BCD-8736-85E22C362EBA");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "CAPITOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "96A7B78B-484C-4411-AC40-4AEB330A5E33");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "ARTICOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "08CC9C46-A247-4BA1-A5FC-159C7E847028");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "NUMERO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "F7BA7C34-3DF3-47A0-9176-9814517352C3");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "ANNO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "4D1172B5-326B-407D-9C53-C46CADA7D31C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "Info Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "60D792CF-8F5D-4169-882A-DFAC0B895F78");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "501AE468-E8CE-45E3-86E9-5C1B50AB10A2");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "D3B5E4AB-0CC5-4BB9-85FC-BB8EA341B10C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "8C5B889E-4B70-42D5-A083-B0A03857DE1A");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "2A4AAE65-AD58-4027-8379-A502F9BFD437");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "442FECBC-F576-4891-B6A3-4F74C8044240");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "Liquidato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "BF764157-10A6-4B50-B60E-7C216FD65A2E");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "45C4F9AA-C240-487A-B02B-FF75C3A0F066");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "AC3A5DC0-549A-4792-A089-4E44FC181262");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "78D21A25-BC9A-4C05-80C6-DA0575E5A879");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "A8C1DC68-D6C4-4333-8FB9-93CC0A11F008");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "SEDE DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "4CC04EBC-EDB6-42BC-9A15-508022C0AE5E");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "51F17240-8C4B-411B-B4EE-FFB1E4950901");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "ANNO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "F80DE5DC-BBDA-4470-9612-57E4F70E1137");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "D6EFB822-FD31-4278-97BF-3C7EEB52891B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "Prenotazione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "24001E10-66F4-45BF-A694-B0F8CAE79F93");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "3C864C1F-F432-4B7F-AFDF-4D1674367ECD");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "CA76C672-5BFA-4818-BEE3-91E105961C54");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "0266F4A6-D158-4C3B-BF06-B6789F3C685B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "Beneficiario");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "AA998D49-D1CB-456F-9F1E-529CAA01753F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, " ");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "D29CE75C-3A9D-48A3-9218-5CFBC8E979F3");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "Numero Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "F60F8731-5A62-4E6A-92E7-21E3FCDC130C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "E3F73303-4C36-488E-B8D2-6F3EB637506F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "6BCA1E9E-143A-4A2A-9254-BF56C3205EF5");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "Delibera");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "7C18D9DA-F701-4402-9356-AE4561CAAA01");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "Proposta");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "D376188E-24F9-4712-9BFB-261CEFB77BA4");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "Sub-Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "7FDB29D1-35BB-4ADC-ACAC-401058E36BAC");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "EB567525-22DD-41A0-A244-D4C4565EA129");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "Anno Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "4D05C5C5-FD08-4475-848F-C4038DB8DBDB");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "Numero Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "031DA941-61D6-4AF4-B8D9-FBBC27C596B2");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "Anno Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "539D140A-0502-4D6B-B86F-EEAB2B41E56C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "5EEE416C-3D6E-41B7-8B3D-FAAC0AC89F62");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "67D0E743-555C-4AF8-A62C-2758C2FF00C6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "Cofog");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "738BFA56-720B-443D-8482-C0DA4C540E14");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "V livello");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "FBFB13E1-D15F-4098-AE1E-4260A1E7B4D0");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "29DC93A5-15E0-4A47-891C-C1B332E7745B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "ED3D888A-3614-42FD-BBDB-40191D14E22F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "DESC COFOG");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "D4642E0C-B4B1-4117-97C8-EB7F3C0C7B98");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, "E3D6C39B-3755-47C9-BB47-2CC44353AA1A");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, "SubImpegno Provenienza");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENCOIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CAPITOLO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CAPITOLO, PPQRY_IMPSUBFIOPE1, "B.CAPITOLO", "IMSUFIOPELCA", 3, 16, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ARTICOLO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ARTICOLO, PPQRY_IMPSUBFIOPE1, "B.ARTICOLO", "IMSUFIOPELAR", 1, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROIMP, PPQRY_IMPSUBFIOPE1, "B.NUMERO_IMP", "IMSUFIOPELNI", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 160, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMP, PPQRY_IMPSUBFIOPE1, "B.ANNO_IMP", "IMSUFIOPELAI", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 196, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, "I. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 4, 652, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, "Info Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOIMPEGNI, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOIMPEGNI, PPQRY_INFO, "DECODE(~~IMSUFIOPELNI~~, to_number(NULL), NULL, 'I')", "DUALINFOIMPE", 5, 99, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 216, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 412, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROSUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROSUBIMP, PPQRY_IMPSUBFIOPE1, "B.NUMERO_SUBIMP", "IMSUFIOPELNS", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 256, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 388, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIMP, PPQRY_IMPSUBFIOPE1, "B.ANNO_SUBIMP", "IMSUFIOPELAS", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 292, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 700, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOSUBIMPEG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOSUBIMPEG, PPQRY_INFO, "DECODE(~~IMSUFIOPELNS~~, to_number(NULL), NULL, 'I')", "DUAINFSUBIMP", 5, 99, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 312, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 4, 436, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_IMPORTO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_IMPORTO, PPQRY_IMPSUBFIOPE1, "B.IMP_IMPORTO", "IMSUFIOPEIII", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 400, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, "Sub Impegnato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 4, 460, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, "Sub Impeg.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SUBIMPEGNATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SUBIMPEGNATO, PPQRY_IMPSUBFIOPE1, "B.TOT_SUBIMPEGNATO", "IMSUFIOPETTS", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 488, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 4, 508, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, "Liquid.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_LIQUIDATO, -1, -1);
    SQL = new StringBuffer();
    SQL.append("CASE WHEN (B.ANNO_SUBIMP IS NULL) THEN NVL(B.IMP_IMPORTO, 0) - NVL(B.DISPONIBILITA, 0) - NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(A.TOT_SUBIMPEGNATO) ");
  SQL.append("from ");
  SQL.append("  IMP_SUB_FIN_OPE_ELENCO A ");
  SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
  SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
  SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
  SQL.append("), 0) ELSE NVL(B.TOT_SUBIMPEGNATO, 0) - NVL(B.DISPONIBILITA, 0) END");
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_LIQUIDATO, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_LIQUIDATO, PPQRY_IMPSUBFIOPE1, SQL.toString(), "IMSUFIOPELLI", 2, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 568, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 4, 484, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PAGATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PAGATO, PPQRY_IMPSUBFIOPE1, "B.MANDATI", "IMSUFIOPELMA", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 648, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DISPEFFETTIV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DISPEFFETTIV, PPQRY_IMPSUBFIOPE1, "B.DISPONIBILITA", "IMSUFIOPELD1", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 736, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DATA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DATA, PPQRY_IMPSUBFIOPE1, "B.D_DATA_REG", "IMSUFIOEDDDR", 8, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 800, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCRIZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCRIZIONE, PPQRY_IMPSUBFIOPE1, "B.DESCRIZIONE", "IMSUFIOPELDE", 5, 140, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1056, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SEDEDEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SEDEDEL, PPQRY_IMPSUBFIOPE1, "B.SEDE_DEL", "IMSUFIOPELSD", 5, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1096, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMERODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMERODEL, PPQRY_IMPSUBFIOPE1, "B.NUM_DEL", "IMSUFIOPELND", 1, 6, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1140, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNODEL, PPQRY_IMPSUBFIOPE1, "B.ANNO_DEL", "IMSUFIOPELAD", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1176, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_OBBLIGATORIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_OBBLIGATORIO, PPQRY_IMPSUBFIOPE1, "B.IMPEGNO_OBBLIG", "IMSUFIOPELIO", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1256, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, "Prenotazione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 4, 532, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, "Prenotazione");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PRENOTAZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PRENOTAZIONE, PPQRY_IMPSUBFIOPE1, "B.PRENOTAZIONE", "IMSUFIOPELPR", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1340, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_UNITAPROPONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_UNITAPROPONE, PPQRY_IMPSUBFIOPE1, "B.UNITA_PROP", "IMSUFIOPELUP", 5, 8, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1448, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROPROPOS, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROPROPOS, PPQRY_IMPSUBFIOPE1, "B.NUM_PROP", "IMSUFIOPELNP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1488, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOPROPOSTA, PPQRY_IMPSUBFIOPE1, "B.ANNO_PROP", "IMSUFIOPELAP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1524, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 556, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_BENEFICIARIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_BENEFICIARIO, PPQRY_IMPSUBFIOPE1, "B.BENEFICIARIO", "IMSUFIOPELBE", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1600, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 748, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_RAGIONSOCIAL, PPQRY_IMPSUBFIOPE1, "C.RAGIONE_SOCIALE_ESTESA", "IMSUFOEBRSEE", 5, 60, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1800, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, "N. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, "Num. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEIMPEPROV, PPQRY_IMPSUBFIOPE1, "B.NUMERO_IMP_PROVENIENZA", "IMSUFIOPENIP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 36, 68, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CAPITOLOART, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 120, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 44, 76, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_IMPEGNO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 1056, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DELIBERA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 1340, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 60, 92, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PROPOSTA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 216, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SUBIMPEGNO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 4, 556, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ESERCIZIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ESERCIZIO, PPQRY_IMPSUBFIOPE1, "B.ESERCIZIO", "IMSUFIOPELES", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 140);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, "Anno Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 4, 796, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 140);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, "Ann. Sub Imp Ordin.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNSUBIMPORD, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_ANNSUBIMPORD, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNSUBIMPORD, PPQRY_IMPSUBFIOPE1, "NVL(B.ANNO_SUBIMP, -1)", "IMSUFIOEASIO", 1, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 152);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, "Numero Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 4, 796, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 152);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, "Num. Sub Imp Ordin.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMSUBIMPORD, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_NUMSUBIMPORD, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMSUBIMPORD, PPQRY_IMPSUBFIOPE1, "NVL(B.NUMERO_SUBIMP, -1)", "IMSUFIOENSIO", 1, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1840, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, "A. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 144);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, "Ann. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMPEPROV, PPQRY_IMPSUBFIOPE1, "B.ANNO_IMP_PROVENIENZA", "IMSUFIOPEAIP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1880, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, "A. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 868, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIPROV, PPQRY_IMPSUBFIOPE1, "B.ANNO_SUBIMP_PROVENIENZA", "IMSUFIOPEASP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 1920, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, "N. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 4, 868, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMESUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMESUBIPROV, PPQRY_IMPSUBFIOPE1, "B.NUMERO_SUBIMP_PROVENIENZA", "IMSUFIOPENSP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1960, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 4, 796, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICECOFOG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICECOFOG, PPQRY_IMPSUBFIOPE1, "B.CODICE_COFOG", "IMSUFIOPELCC", 1, 3, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 2000, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 820, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODLIVELLO5, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODLIVELLO5, PPQRY_IMPSUBFIOPE1, "B.COD_LIVELLO_5", "IMSUFIOPECL5", 3, 10, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 2076, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 844, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICEEUROPE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICEEUROPE, PPQRY_IMPSUBFIOPE1, "B.CODICE_EUROPEO", "IMSUFIOPELCE", 1, 1, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 2024, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 216);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 4, 868, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 216);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCLIVELLO5, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCLIVELLO5, PPQRY_LIVELLO5, "A.DES_LIVELLO", "NOOGVISTRIDL", 5, 40, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 2240, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 220);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, "DESC COFOG");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 4, 892, 656, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 220);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, "DESC COFOG");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCCOFOG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCCOFOG, PPQRY_COFOG, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 1800, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 1824, 260, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ETICIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ETICIMPEPROV, -1, "", "ETICIMPEPROV", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 1880, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 1804, 268, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ETICHESUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
  }

  private void PAN_ELENCOIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~IMSUFIOPELNI~~, to_number(NULL), NULL, 'I') as DUALINFOIMPE, ");
    SQL.append("  DECODE(~~IMSUFIOPELNS~~, to_number(NULL), NULL, 'I') as DUAINFSUBIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_INFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DES_LIVELLO as NOOGVISTRIDL ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~IMSUFIOPECL5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_LIVELLO5, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_LIVELLO5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_LIVELLO5, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~IMSUFIOPELCC~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_COFOG, "VISTA_STRUTTURA_RICL");
    PAN_ELENCOIMPEGN.SetIMDB(IMDB, "PQRY_IMPSUBFIOPE1", true);
    PAN_ELENCOIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "IMP SUB FIN OPE ELENCO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CAPITOLO as IMSUFIOPELCA, ");
    SQL.append("  B.ARTICOLO as IMSUFIOPELAR, ");
    SQL.append("  B.ANNO_IMP as IMSUFIOPELAI, ");
    SQL.append("  B.NUMERO_IMP as IMSUFIOPELNI, ");
    SQL.append("  B.ANNO_DEL as IMSUFIOPELAD, ");
    SQL.append("  B.NUM_DEL as IMSUFIOPELND, ");
    SQL.append("  B.SEDE_DEL as IMSUFIOPELSD, ");
    SQL.append("  B.D_DATA_REG as IMSUFIOEDDDR, ");
    SQL.append("  B.DESCRIZIONE as IMSUFIOPELDE, ");
    SQL.append("  B.ANNO_PROP as IMSUFIOPELAP, ");
    SQL.append("  B.UNITA_PROP as IMSUFIOPELUP, ");
    SQL.append("  B.NUM_PROP as IMSUFIOPELNP, ");
    SQL.append("  B.DISPONIBILITA as IMSUFIOPELD1, ");
    SQL.append("  B.IMPEGNO_OBBLIG as IMSUFIOPELIO, ");
    SQL.append("  B.BENEFICIARIO as IMSUFIOPELBE, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as IMSUFOEBRSEE, ");
    SQL.append("  B.ANNO_SUBIMP as IMSUFIOPELAS, ");
    SQL.append("  B.NUMERO_SUBIMP as IMSUFIOPELNS, ");
    SQL.append("  NVL(B.ANNO_SUBIMP, -1) as IMSUFIOEASIO, ");
    SQL.append("  NVL(B.NUMERO_SUBIMP, -1) as IMSUFIOENSIO, ");
    SQL.append("  B.IMP_IMPORTO as IMSUFIOPEIII, ");
    SQL.append("  B.TOT_SUBIMPEGNATO as IMSUFIOPETTS, ");
    SQL.append("  B.MANDATI as IMSUFIOPELMA, ");
    SQL.append("  CASE WHEN (B.ANNO_SUBIMP IS NULL) THEN NVL(B.IMP_IMPORTO, 0) - NVL(B.DISPONIBILITA, 0) - NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(A.TOT_SUBIMPEGNATO) ");
    SQL.append("from ");
    SQL.append("  IMP_SUB_FIN_OPE_ELENCO A ");
    SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append("), 0) ELSE NVL(B.TOT_SUBIMPEGNATO, 0) - NVL(B.DISPONIBILITA, 0) END as IMSUFIOPELLI, ");
    SQL.append("  B.PRENOTAZIONE as IMSUFIOPELPR, ");
    SQL.append("  B.ESERCIZIO as IMSUFIOPELES, ");
    SQL.append("  B.CODICE_COFOG as IMSUFIOPELCC, ");
    SQL.append("  B.COD_LIVELLO_5 as IMSUFIOPECL5, ");
    SQL.append("  B.CODICE_EUROPEO as IMSUFIOPELCE, ");
    SQL.append("  B.ANNO_IMP_PROVENIENZA as IMSUFIOPEAIP, ");
    SQL.append("  B.NUMERO_IMP_PROVENIENZA as IMSUFIOPENIP, ");
    SQL.append("  B.ANNO_SUBIMP_PROVENIENZA as IMSUFIOPEASP, ");
    SQL.append("  B.NUMERO_SUBIMP_PROVENIENZA as IMSUFIOPENSP ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_SUB_FIN_OPE_ELENCO B, ");
    SQL.append("  BEN C ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE(+) = B.BENEFICIARIO) ");
    SQL.append("and   (B.OPERA = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEOPERA~~, -1), -1, B.OPERA, ~~TBL_PARAMETRI465.ROWNAMEOPERA~~)) ");
    SQL.append("and   (B.FINANZIAMENTO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEFINAN~~, -1), -1, B.FINANZIAMENTO, ~~TBL_PARAMETRI465.ROWNAMEFINAN~~)) ");
    SQL.append("and   (B.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEARTIC~~, -1), -1, B.ARTICOLO, ~~TBL_PARAMETRI465.ROWNAMEARTIC~~)) ");
    SQL.append("and   (B.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMECAPIT~~, -1), -1, B.CAPITOLO, ~~TBL_PARAMETRI465.ROWNAMECAPIT~~)) ");
    SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI465.ROWNAMEDAL~~, B.D_DATA_REG)) ");
    SQL.append("and   ((B.ANNO_IMP = B.ESERCIZIO) OR (~~TBL_PARAMETRI465.ROWNAMSOLCOM~~ = 'NO')) ");
    SQL.append("and   (~~PQRY_PARAMETRI410.ROWNAMSUBIMP~~ = B.SE_SUBIMP OR B.SE_SUBIMP = 'NO') ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_PARAMETRI465.ROWNAMEESERC~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3, 4, 19, 20 ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE1, 5, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_IMPSUBFIOPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(0, "IMP_SUB_FIN_OPE_ELENCO");
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_ANNOIMP, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_NUMEROIMP, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_ANNSUBIMPORD, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_NUMSUBIMPORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOIMPEGN.iUseListQBE;
      PAN_ELENCOIMPEGN.iUseListQBE = 0;
      PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "6CFCB68C-E39D-45D8-846E-319FE067FAAF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "41B1DD81-839B-48EC-96BB-A36EC19C0C3E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "789EF8DC-D142-4681-9FAD-2C3AB401D038");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Sub Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Sub-Impegni");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Solo Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI410, "A.ROWNAMSOLCOM", "ROWNAMSOLCOM", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 152, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI410, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 292, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNI, PPQRY_PARAMETRI410, "A.ROWNAMSUBIMP", "ROWNAMSUBIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI410", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI410, IMDBDef17.PQRY_PARAMETRI410_RS, IMDBDef6.TBL_PARAMETRI465);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI465_ROWNAMSOLCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI465_ROWNAMEDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUBIMPEGNI, IMDBDef6.FLD_PARAMETRI465_ROWNAMSUBIMP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI465");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG_Init()
  {
    BUK_LIBRELENIMPE.InitMastro(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, "DCFF8014-E14A-48C9-9A19-94346D4E77B8");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, "ELEIMPBOOPAG");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, 26600, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, "0279CE2E-98B1-4383-A0C7-9060DFEEB0CB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, "ABBF96A8-2C16-472A-A3C5-5D73C69768A9");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, "F65ADADF-060B-4A54-82F0-FD6B9C211DBE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Impegni di Spesa", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, "596FEBF9-65A6-4A73-A4B5-69A0340FC1ED");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, "IMPEGDISPESA");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, 1000, 2400, 27700, 14900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, "7F3F4CF0-588E-4939-839B-2D49AE954D0E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER, 1000, 17900, 27700, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER, "B1BE221A-8112-4D39-B80E-7D2259EACB21");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_InitQuery() { BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_InitQuery(true, true); }
  private void BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.CAPITOLO as IMSUFIOPELCA, ");
      SQL.append("  B.ARTICOLO as IMSUFIOPELAR, ");
      SQL.append("  B.ANNO_IMP as IMSUFIOPELAI, ");
      SQL.append("  B.NUMERO_IMP as IMSUFIOPELNI, ");
      SQL.append("  B.ANNO_DEL as IMSUFIOPELAD, ");
      SQL.append("  B.NUM_DEL as IMSUFIOPELND, ");
      SQL.append("  B.SEDE_DEL as IMSUFIOPELSD, ");
      SQL.append("  B.D_DATA_REG as IMSUFIOEDDDR, ");
      SQL.append("  B.DESCRIZIONE as IMSUFIOPELDE, ");
      SQL.append("  B.ANNO_PROP as IMSUFIOPELAP, ");
      SQL.append("  B.UNITA_PROP as IMSUFIOPELUP, ");
      SQL.append("  B.NUM_PROP as IMSUFIOPELNP, ");
      SQL.append("  B.IMPEGNO_OBBLIG as IMSUFIOPELIO, ");
      SQL.append("  B.BENEFICIARIO as IMSUFIOPELBE, ");
      SQL.append("  B.ANNO_SUBIMP as IMSUFIOPELAS, ");
      SQL.append("  B.NUMERO_SUBIMP as IMSUFIOPELNS, ");
      SQL.append("  'Capitolo/Art.' || ' ' || CASE WHEN (B.CAPITOLO IS NULL) THEN NULL ELSE ' - ' || TO_CHAR ( B.CAPITOLO ) END || CASE WHEN (B.ARTICOLO IS NULL) THEN NULL ELSE ' / ' || TO_CHAR ( B.ARTICOLO ) END as IMSUFIOEVPEG, ");
      SQL.append("  B.IMP_IMPORTO as IMSUFIOPEIII, ");
      SQL.append("  B.TOT_SUBIMPEGNATO as IMSUFIOPETTS, ");
      SQL.append("  CASE WHEN (B.ANNO_SUBIMP IS NULL) THEN NVL(B.IMP_IMPORTO, 0) - NVL(B.DISPONIBILITA, 0) - NVL(( ");
      SQL.append("select ");
      SQL.append("  SUM(A.TOT_SUBIMPEGNATO) ");
      SQL.append("from ");
      SQL.append("  IMP_SUB_FIN_OPE_ELENCO A ");
      SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
      SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("), 0) ELSE NVL(B.TOT_SUBIMPEGNATO, 0) - NVL(B.SUB_DISPONIBILITA, 0) END as IMSUFIOPELLI, ");
      SQL.append("  B.MANDATI as IMSUFIOPELMA, ");
      SQL.append("  B.DISPONIBILITA as IMSUFIOPELDI, ");
      SQL.append("  C.RAGIONE_SOCIALE_ESTESA as IMSUFOEBRSEE, ");
      SQL.append("  LPAD(TO_CHAR ( B.ANNO_IMP ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( B.NUMERO_IMP ), 5, SUBSTR('0', 1, 1)) as IMSUFIOPELOI, ");
      SQL.append("  LPAD(TO_CHAR ( NVL(B.ANNO_SUBIMP, 0) ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( NVL(B.NUMERO_SUBIMP, 0) ), 5, SUBSTR('0', 1, 1)) as IMSUFIOPEOSI ");
      SQL.append("from ");
      SQL.append("  IMP_SUB_FIN_OPE_ELENCO B, ");
      SQL.append("  BEN C ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_PARAMETRI465.ROWNAMEESERC~~) ");
      SQL.append("and   (B.FINANZIAMENTO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEFINAN~~, -1), -1, B.FINANZIAMENTO, ~~TBL_PARAMETRI465.ROWNAMEFINAN~~)) ");
      SQL.append("and   (B.OPERA = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEOPERA~~, -1), -1, B.OPERA, ~~TBL_PARAMETRI465.ROWNAMEOPERA~~)) ");
      SQL.append("and   (B.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMEARTIC~~, -1), -1, B.ARTICOLO, ~~TBL_PARAMETRI465.ROWNAMEARTIC~~)) ");
      SQL.append("and   (B.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI465.ROWNAMECAPIT~~, -1), -1, B.CAPITOLO, ~~TBL_PARAMETRI465.ROWNAMECAPIT~~)) ");
      SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI465.ROWNAMEDAL~~, B.D_DATA_REG)) ");
      SQL.append("and   ((B.ANNO_IMP = B.ESERCIZIO) OR (~~TBL_PARAMETRI465.ROWNAMSOLCOM~~ = 'NO')) ");
      SQL.append("and   (~~PQRY_PARAMETRI410.ROWNAMSUBIMP~~ = B.SE_SUBIMP OR B.SE_SUBIMP = 'NO') ");
      SQL.append("and   (C.CODICE(+) = B.BENEFICIARIO) ");
      SQL.append("order by 1, 2, 24, 25 ");
      BUK_LIBRELENIMPE.SetReportQuery(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7F9E0AD2-8B34-408C-B6CE-E3E439E4B321");
      if (BUK_LIBRELENIMPE.FindObjByID(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH) != null)
        BUK_LIBRELENIMPE.AddReportGroup(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "IMSUFIOPELCA");
      if (BUK_LIBRELENIMPE.FindObjByID(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH) != null)
        BUK_LIBRELENIMPE.AddReportGroup(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "IMSUFIOPELAR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_Init()
  {
    BUK_LIBRELENIMPE.InitReport(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, 196865);
    BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_InitQuery(true, false);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "C73AEFC1-0FDB-49D0-B2E5-9ADE55B4A623");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "ELENIMPEREPO");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_REPORTHEADER, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_REPORTHEADER, "5B2C3264-C9CB-447A-ACB5-449FB7367A66");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_PAGEHEADER, BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_PAGEHEADER, "64817B89-66E5-4413-9C37-C87235180249");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "40CD4E50-380A-4802-9297-7CA552CC738A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "IMSUFIOPECGH");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "9FE371B2-5D6A-467F-84B4-3B1DB0AF3382");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "IMSUFIOPEAGH");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, 0, 1000, 3300, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, "B80E7595-01C2-44A2-8050-15028F59E46C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, BUK_LIBRELENIMPE_SPAN_C1, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C1, "6E5F3C7C-0ACF-4138-BE52-0F6C0EDB8E6F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C1, "C1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, 3900, 1000, 1100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, "9557632A-F5EB-44C1-8EFD-72E95B73D506");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, BUK_LIBRELENIMPE_SPAN_IMPEGNO1, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGNO1, "9D33523F-5EF5-4CC2-8814-DA8F20837B20");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, 5200, 1000, 1700, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, "89AEFC45-3382-42C6-AD61-0A131D944021");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, BUK_LIBRELENIMPE_SPAN_IMPEGNO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGNO, "134E01B2-B2FB-48AC-9F18-8E4F8493F4F3");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGNO, "IMPEGNO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, 6900, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, "DCFCD6AE-14D7-4BB6-9414-EAB5703D0D99");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, BUK_LIBRELENIMPE_SPAN_IMPORTO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPORTO, "47AFC3FE-B674-4FA8-AFF8-2D09BAEB2224");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, 9200, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, "F8D7AE60-85AE-47A0-B7B0-CF01003B37BD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, "SUBIMPHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Sub-Impegnato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, "3CD49CF0-FEB4-47E5-8907-6C86D158F60C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, 11500, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, "BE73CE1A-2534-4EB1-B1B7-1869021FA68D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, BUK_LIBRELENIMPE_SPAN_LIQUIDATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Liquidato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_LIQUIDATO, "B2CC3726-FD60-47C8-A679-6747C81E45BD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_LIQUIDATO, "LIQUIDATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, 13800, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, "FDAA09A1-4E6C-4884-AC12-BC5113A52C36");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, BUK_LIBRELENIMPE_SPAN_PAGATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Pagato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_PAGATO, "AB21F8DB-5CBB-4DA8-9EEA-9827A34A9A0E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_PAGATO, "PAGATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, 16100, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, "B2BA3022-8980-4214-9D7C-050AA6FA7091");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, "4DCD90A4-A35C-46EF-AEBC-106FFB748628");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, 18400, 1000, 1200, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, "1DB59132-74E2-4206-8785-B5028C90B10E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, BUK_LIBRELENIMPE_SPAN_DATAREG, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DATAREG, "35DD8E25-2584-4489-971F-4E39FCFE6906");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DATAREG, "DATAREG");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, 19700, 700, 2600, 700, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, "89BEFC49-9EC0-48DF-B0A0-84768033F61A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Descrizione e Beneficiario", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, "4C718F56-F481-4AB6-B6CA-77A6047706D7");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, 22800, 1000, 1500, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, "9E208038-0EB1-47CE-BAB9-5B8CF1E85EC0");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, "ISFOEISFOESD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, BUK_LIBRELENIMPE_SPAN_C2, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Delibera", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C2, "A59308AF-46FF-40B7-90D6-2D79CD75868F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C2, "C2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, 26600, 1000, 644, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, "A03E332A-5289-4BDC-871E-E20AF1BBF250");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, "IMPEOBBLHEAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Obb.", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, "0098ECC4-76D6-44F3-BAE1-79633DD4151E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, 24900, 1000, 1600, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, "F776D2F0-9B6E-443A-B232-3529F92B8DD0");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, "IMSUFIOPEUPH");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, BUK_LIBRELENIMPE_SPAN_C, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Proposta", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C, "E61D71B8-4B9E-4238-8CF7-E05473190F5C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C, "C");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, 0, 100, 27500, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, "6C4C6885-B3FB-42E5-ADB1-987D41EA1972");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIF, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271384961, "Voce P.e.g. +c Space +c To String (VISTA IMP SUB UO UT INTERVENTO) +c If (Is Null (VISTA IMP SUB UO UT CAPITOLO), Null String, trattino con spazi +c To String (VISTA IMP SUB UO UT CAPITOLO)) +c If (Is Null (VISTA IMP SUB UO UT ARTICOLO), Null String, barra con spazi +c To String (VISTA IMP SUB UO UT ARTICOLO))", "::IMSUFIOEVPEG", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIF, "41BAD8C2-CE98-4AC5-AD4D-075A58A85C03");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIF, "ISFOEVPEGEIF");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_DETAIL, "FD9A0224-4CA5-408E-B584-FE321090E86C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_DETAIL, "DETAIL");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, 0, 0, 2600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, "5509BFDE-A406-45C1-A159-F1C104FE93C6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, BUK_LIBRELENIMPE_SPAN_ISFOECEIFOEI, MyGlb.VIS_NORMALEA7, 3, 16, 6, 271384961, "", "::IMSUFIOPELCA", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECEIFOEI, "E2344306-3BE1-47CC-9DB0-10E225D0580F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECEIFOEI, "ISFOECEIFOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, 2700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, "81D1496F-58F2-4B8D-BD77-7CA540404A86");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, "53D050DD-E675-4811-867D-DEBF4C8A0974");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, 2900, 0, 300, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, "51912EAE-4175-40A3-9CD8-C51AA0B4C6DD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, BUK_LIBRELENIMPE_SPAN_ISFOEAEIFOEI, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384961, "", "::IMSUFIOPELAR", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAEIFOEI, "B01D8B70-E102-4532-A73B-CEC5BA3060B0");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAEIFOEI, "ISFOEAEIFOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, 3500, 0, 700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, "804F546D-04C2-42FD-A3CF-C96D62BB5DF6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, "IMSUFIOPELNI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, BUK_LIBRELENIMPE_SPAN_ISFOENIEIFOE, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::IMSUFIOPELNI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENIEIFOE, "617AC64F-4177-437C-BCA8-B3B2D68A761E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENIEIFOE, "ISFOENIEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, 4200, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, "1EA0EB68-C101-457A-A730-EF505A794B7C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, "5331E70C-DB48-47E6-B2E3-7BC215625386");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, 4400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, "DEBEE2E9-CF65-4633-A069-087BC1018841");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, "IMSUFIOPELAI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, BUK_LIBRELENIMPE_SPAN_ISFOEAIEIFOE, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::IMSUFIOPELAI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAIEIFOE, "18AD0CFA-16A4-4D89-B585-6C7DF6C91DA9");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAIEIFOE, "ISFOEAIEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, 5100, 0, 800, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, "F5E448A3-8ED8-4117-9120-4ED86E94D7AE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, "IMSUFIOPELNS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, BUK_LIBRELENIMPE_SPAN_ISFOENSEIFOE, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::IMSUFIOPELNS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENSEIFOE, "3E637ED4-D93B-46E6-91C5-D0809EC21B58");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENSEIFOE, "ISFOENSEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, 6000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, "40945369-56AA-4887-95FB-445A985B2B52");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, "C75C6E7D-2A03-41CA-B342-CF478BB00B86");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, 6200, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, "E41F2FE7-13A9-491C-92C3-D9B8E311708E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, "IMSUFIOPELAS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, BUK_LIBRELENIMPE_SPAN_ISFOEASEIFOE, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::IMSUFIOPELAS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEASEIFOE, "F1EABA00-7E01-4EDA-8E5E-8D885AB15F65");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEASEIFOE, "ISFOEASEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMPORTO, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, "8C9161E0-3291-44D9-B63C-1B86701C4F68");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIFO, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPEIII", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIFO, "477F0A17-B552-4927-8E4C-8D25C8060639");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIFO, "ISFOEIIIEIFO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, "D8E8C34E-5EC4-4F40-BF0E-DC77E94C8E83");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, BUK_LIBRELENIMPE_SPAN_ISFOETTSEIFO, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPETTS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOETTSEIFO, "9F731E6A-221B-4C01-A486-F0EF95965605");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOETTSEIFO, "ISFOETTSEIFO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, "10B9C347-10C7-4340-B20A-4DA5196DF08F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, "LIQUIDATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, BUK_LIBRELENIMPE_SPAN_ISFOELEIFOEI, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "Liquidato", "::IMSUFIOPELLI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOELEIFOEI, "404B724F-D36A-47F6-B705-A442F77BF38D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOELEIFOEI, "ISFOELEIFOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_MANDATI, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_MANDATI, "DDF2A010-BBDE-4862-9561-86A633340D53");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_MANDATI, "MANDATI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_MANDATI, BUK_LIBRELENIMPE_SPAN_ISFOEMEIFOEI, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::IMSUFIOPELMA", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEMEIFOEI, "33000882-480F-4AD1-8DCC-99A21CD89ED2");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEMEIFOEI, "ISFOEMEIFOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, "60342E3B-2059-4796-9E38-0142DD4C5167");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOE1, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELDI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOE1, "DF05D4DB-9E36-4055-8FBB-789FCF4EC858");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOE1, "ISFOEDEIFOE1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DATAREG, 18400, 0, 1200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DATAREG, "7D634617-1915-4995-BF83-5D6FD36177C1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DATAREG, "DATAREG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DATAREG, BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIF, MyGlb.VIS_NORMALEA7, 8, 19, 0, 271384705, "Brief description of field content.", "::IMSUFIOEDDDR", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIF, "83D33ED3-BB9D-4A8F-892B-E2C8FE0AB83C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIF, "ISFOEDDDREIF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, 19700, 0, 2600, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, "7E971A05-7C18-4DA6-9523-E2239EA72FD1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOEI, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELDE", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOEI, "27063F45-6D50-4C86-A215-F1CB58ABF65C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDEIFOEI, "ISFOEDEIFOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, 22400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, "3A7A9FBC-8DF3-4610-953E-D1AA11AC5D3B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, "IMSUFIOPELSD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, BUK_LIBRELENIMPE_SPAN_ISFOESDEIFOE, MyGlb.VIS_NORMALEA7, 5, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELSD", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOESDEIFOE, "D1058D9D-A9A5-460C-A026-0C2B61153E04");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOESDEIFOE, "ISFOESDEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, 23200, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, "4E138A31-07AA-4A63-8805-902F28647604");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, "IMSUFIOPELND");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, BUK_LIBRELENIMPE_SPAN_ISFOENDEIFOE, MyGlb.VIS_NORMALEA7, 1, 6, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELND", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENDEIFOE, "B816E574-DAED-4AC6-BC08-0A92B14C509D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENDEIFOE, "ISFOENDEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, 23900, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, "BEEB2A6D-CD70-49EE-AE44-63322B386DA6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, "IMSUFIOPELAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, BUK_LIBRELENIMPE_SPAN_ISFOEADEIFOE, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELAD", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEADEIFOE, "BA9F4756-61C7-4654-8927-8076AD7B4527");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEADEIFOE, "ISFOEADEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, 26600, 0, 644, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, "A500D73D-5D2D-4FDF-AA1A-67274C9B5721");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, "IMPEGNOBBLIG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, BUK_LIBRELENIMPE_SPAN_ISFOEIOEIFOE, MyGlb.VIS_NORMALEA7, 5, 2, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELIO", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEIOEIFOE, "F865FAB2-C679-4175-9D6F-37D6EB0FFAD2");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEIOEIFOE, "ISFOEIOEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, 24500, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, "ACABEC13-A6AF-41C0-810E-8F45705286C2");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, "IMSUFIOPELUP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, BUK_LIBRELENIMPE_SPAN_ISFOEUPEIFOE, MyGlb.VIS_NORMALEA7, 5, 8, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELUP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEUPEIFOE, "E6E7C725-CAE7-4A47-8B99-4BCAFBE268A9");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEUPEIFOE, "ISFOEUPEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, 25300, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, "AAF834D5-89EC-4A53-A358-868F60E353B1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, "IMSUFIOPELNP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, BUK_LIBRELENIMPE_SPAN_ISFOENPEIFOE, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELNP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENPEIFOE, "6898FF5F-DF6C-4D78-9623-F1D491152F0F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENPEIFOE, "ISFOENPEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, 25976, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, "03B26254-855C-4004-8E1B-3E47476325A3");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, "IMSUFIOPELAP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, BUK_LIBRELENIMPE_SPAN_ISFOEAPEIFOE, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELAP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAPEIFOE, "3BE2E70A-1DC8-4E16-A80B-6309D48A439B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAPEIFOE, "ISFOEAPEIFOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, 23000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, "DE8117E0-5B0E-4AF9-8C32-6A9A3386AE30");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, "165ECE30-E165-42EF-B73C-A64DA8937848");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, 23700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, "65685265-58A6-4BEC-84C5-CF0CF321BA11");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, "BARRADELIBER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, BUK_LIBRELENIMPE_SPAN_BARRADELIBER, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRADELIBER, "6E63D8B6-9D60-4196-BEE2-69FEDDC98524");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRADELIBER, "BARRADELIBER");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, 25100, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, "729E4C87-D611-40A4-ADDA-139AD6ECA842");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, "5969D69C-2689-42F4-AE89-AAFFF5F92479");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, 25800, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, "EE7836B5-CBC8-4369-A49F-0A90DB03967D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, "BARRAPROPOST");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, "B73E6BF1-5CB5-4F3D-AD40-D44E43329411");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, "BARRAPROPOST");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, "61082906-7585-4E24-ADD9-1C41702C6EB1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, "IMSUFIOPEAGF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, 6900, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, "FEDD54D7-62DA-43BB-9A79-0FD7F5EE6431");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, "E3B8AEAC-FFD1-4F6E-B561-E05E5884E8C4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, "ISFOEAGFSIS1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, 9200, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, "8575890D-C449-4222-86BD-F27EB6B822C7");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, "SUMOFSUBIMP1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, "47600EC0-C977-47D9-A6B8-2E19B4798BCF");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, "ISFOEAGFSIS2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, 11500, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, "C3C2CFD7-9E12-4DB5-A481-66B7D180D83C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, "SUMOFLIQUID1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, "2CC4EF2D-C140-4359-8E40-8667DF39A5A9");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, "ISFOEAGFSIS3");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, 13800, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, "5110B8DE-645C-409E-8776-C1D31FD334B1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, "SUMOFPAGATO1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, "84C945F4-0204-48B2-AF0B-23BDE8546A7D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, "ISFOEAGFSIS4");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, 16100, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, "40E9A101-2618-4D13-952E-5297C774FF87");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, "52F3D81F-F68D-4C5F-B590-CD856E7D01DB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, "ISFOEAGFSISF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, 4700, 100, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, "AE8B7637-CCBB-42E1-AA19-88F7F4CA1A6B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, "CC2D7D2B-BBEA-43E5-8F75-BB670EA6B0C4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_BARRA, 6900, 0, 11400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRA, "669586A7-3E27-4692-812D-A294BDE73E8E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRA, "BARRA");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, "2289499F-13F0-4D9E-A336-87F527BD6431");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, "IMSUFIOPECGF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, "70BD47F8-3EC7-461F-99DE-912B5488607C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, "D011691C-BB19-4C76-ABF2-517CF1AC0672");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, "ISFOECGFSIS1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, "F5D5CEE3-D967-405E-B2BD-B14D60C4083F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, "SUMOFSUBIMPE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, "D16FFC00-4800-470A-A530-628EF667D355");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, "ISFOECGFSIS2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, "01BAA2B4-B3DE-403F-A107-B0EA83011747");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, "SUMOFLIQUIDA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, "DA2A18BA-5DFC-43B4-B528-62CB48BDA579");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, "ISFOECGFSIS3");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, "1242B955-050D-4D98-90BF-CB5E46889F52");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, "SUMOFPAGATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, "34A0F28E-5E07-425F-9AC6-F561FD3691FA");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, "ISFOECGFSIS4");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, "C60A8E6E-7A12-4DEC-83FF-6F05FFA115A7");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, "2D2D8022-FCBE-4BD4-8423-EC42ED0F108A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, "ISFOECGFSISF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, 4700, 0, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, "24107216-C202-4472-9EE7-DB96955D3384");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, "00815EFC-B582-4ADA-8487-B96B90BBA034");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, "24E4906A-02C6-4FE8-9F36-B2A64A485A9C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_REPORTFOOTER, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_REPORTFOOTER, "EE4074EB-3FEA-4115-948B-3F603C6724C6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIBRELENIMPE.AddReportGroup(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.AddReportGroup(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE_RPT_ELENIMPEREPO_InitQuery(false, true);
  }

  private void BUK_LIBRELENIMPE_InitLinks()
  {
    BUK_LIBRELENIMPE.SetBoxNextBox(BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
  }
  
  public void BeforeDelete(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterInsert(IDPanel SrcObj)
  {
  }
  
  public void AfterUpdate(IDPanel SrcObj)
  {
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
  }    

  public void NodeClick(ATree SrcObj, ATreeNode Node)
  {
  }    

  public void OnTreeDropNode(ATree SrcObj, IDVariant SourceHash, IDVariant SourceTreeIndex, IDVariant DestinationHash, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey)
  {
  }    

  public void OnTreeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }

  public void OnTreeChangeSelNode(ATree SrcObj, IDVariant HashKey, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnTreeDropDoc(ATree SrcObj, IDDocument SourceDoc, IDDocument DestDoc, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey, IDVariant Cancel)
  {
  }    

  public void OnTreeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeChangeSelDoc(ATree SrcObj, IDDocument Doc, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRELENIMPE) BUK_LIBRELENIMPE_OnPreview();
  }
  
  public void OnOpenPopup(ACommand SrcObj, IDVariant Direction, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetCommand(ACommand SrcObj, IDVariant CmdIdx, IDVariant ChildIdx, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetGeneralDrag(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }
  
  public void OnCmdSetGeneralDrop(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }

  public void OnChangeCollapse(WebFrame SrcObj, IDVariant Collapse, IDVariant Cancel)
  {
  }

  public void OnGraphClick(WebFrame SrcObj, IDVariant NumSerie, IDVariant NumPoint)
  {
  }

  public void OnGraphOptions(WebFrame SrcObj, IDVariant Options)
  {
  }
  
  public void OnRenderToolbar(WebFrame SrcObj, IDVariant CmdIdx, IDVariant Visible)
  {
  }

  public void OnBookCommand(OBook SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }

  public void OnCmdSetChangeExpand(ACommand SrcObj, IDVariant Expand, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Expanded, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Expanded, IDVariant Cancel)
  {
  }
  

  public void OnMouseClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }  
  
  public void OnReorderColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant targetfield)
  {
  }
  
  public void OnResizeColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant oldwidth)
  {
  }
  

  public void OnGenericDrag(IDPanel SrcObj, IDVariant draginfo,  IDVariant button, IDVariant colidx)
  {
  }

  public void OnGenericDrop(IDPanel SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant colidx, IDVariant rownum, IDDocument doc)
  {
  }
  
  public void OnGenericDrag(ATree SrcObj, IDVariant draginfo,  IDVariant button, IDVariant hashkey)
  {
  }

  public void OnGenericDrop(ATree SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant hashkey, IDDocument doc)
  {
  }  
  
  public void OnGenericDrag(OBook SrcObj, IDVariant draginfo,  IDVariant button, IDVariant boxid)
  {
  }

  public void OnGenericDrop(OBook SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid)
  {
  }    
  
  public void OnGenericDrag(OTabView SrcObj, IDVariant draginfo, IDVariant button, IDVariant pageindex)
  {
  }

  public void OnGenericDrop(OTabView SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant pageindex)
  {
  }

  public void OnExpandingGroup(IDPanel SrcObj, IDVariant expanded, IDVariant userOperation)
  {
  }  

  public void OnChangeGroupCollapse(IDPanel SrcObj, IDVariant GrpIndex)
  {
  }
  
  public void OnShowMultipleSelection(IDPanel SrcObj, IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
  }
  
  public void OnChangeTextSelection(IDPanel SrcObj, IDVariant Field, IDVariant OldSelectionStart, IDVariant OldSelectionEnd)
  {
  }
  
  public void OnFocus(IDPanel SrcObj, IDVariant Field, IDVariant GotFocus)
  {
  }
  
  public void OnFrameKeyPress(WebFrame SrcObj, IDVariant KeySet, IDVariant KeyCode, IDVariant Skip)
  {
  }
  
  public void OnGetLKE(IDPanel SrcObj, IDCachedRowSet RS, IDVariant ntry, IDVariant nullv, IDVariant bskip, IDVariant bcancel, IDVariant fldindex)
  {
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
