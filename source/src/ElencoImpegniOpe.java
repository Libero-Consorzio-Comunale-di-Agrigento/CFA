// **********************************************
// Elenco Impegni Ope
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoImpegniOpe extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;
  private static int PFL_PARAMETRI_SUBIMPEGNI = 2;

  private static int PPQRY_PARAMETRI467 = 0;


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

  private static int PPQRY_IMPSUBFIOPE2 = 0;

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
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIO = 40;
  private static int BUK_LIBRELENIMPE_SEC_DETAIL = 41;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA = 42;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOECEIOEIB = 43;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG = 44;
  private static int BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG = 45;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR = 46;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAEIOEIB = 47;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI = 48;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENIEIOEI = 49;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO = 50;
  private static int BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO = 51;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI = 52;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAIEIOEI = 53;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS = 54;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENSEIOEI = 55;
  private static int BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE = 56;
  private static int BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE = 57;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS = 58;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEASEIOEI = 59;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPORTO = 60;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIOE = 61;
  private static int BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO = 62;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOETTSEIOE = 63;
  private static int BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO = 64;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOELEIOEIB = 65;
  private static int BUK_LIBRELENIMPE_RPTBOX_MANDATI = 66;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEMEIOEIB = 67;
  private static int BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT = 68;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEI1 = 69;
  private static int BUK_LIBRELENIMPE_RPTBOX_DATAREG = 70;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIO = 71;
  private static int BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE = 72;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEIB = 73;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD = 74;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOESDEIOEI = 75;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND = 76;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENDEIOEI = 77;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD = 78;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEADEIOEI = 79;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG = 80;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEIOEIOEI = 81;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP = 82;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEUPEIOEI = 83;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP = 84;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOENPEIOEI = 85;
  private static int BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP = 86;
  private static int BUK_LIBRELENIMPE_SPAN_ISFOEAPEIOEI = 87;
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
    Init_TBL_PARAMETRI469(IMDB);
    //
    //
    Init_PQRY_IMPSUBFIOPE2(IMDB);
    Init_PQRY_PARAMETRI467(IMDB);
    Init_PQRY_PARAMETRI467_RS(IMDB);
    Init_PQRY_IMPSUBFIOPE3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI469(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI469, 8);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI469, "TBL_PARAMETRI469");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI469,IMDBDef6.FLD_PARAMETRI469_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI469, 0);
  }

  private static void Init_PQRY_IMPSUBFIOPE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_IMPSUBFIOPE2, 33);
    IMDB.set_TblCode(IMDBDef17.PQRY_IMPSUBFIOPE2, "PQRY_IMPSUBFIOPE2");
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEC, "IMSUFIIMSOEC");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEC,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEA, "IMSUFIIMSOEA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEA,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, "IMSUFIISOEAI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI, "IMSUFIISOENI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAD, "IMSUFIISOEAD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAD,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEND, "IMSUFIISOEND");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEND,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOESD, "IMSUFIISOESD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOESD,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEDDR, "IMSUFISOEDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEDDR,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOE1, "IMSUFIIMSOE1");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOE1,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAP, "IMSUFIISOEAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEUP, "IMSUFIISOEUP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEUP,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENP, "IMSUFIISOENP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOED, "IMSUFIIMSOED");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOED,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEIO, "IMSUFIISOEIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEB, "IMSUFIIMSOEB");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEB,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFOEBRSEE, "IMSUFOEBRSEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFOEBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS, "IMSUFIISOEAS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, "IMSUFIISOENS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOEASIO, "IMSUFIOEASIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOEASIO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOENSIO, "IMSUFIOENSIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOENSIO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEII, "IMSUFIISOEII");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEII,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOETS, "IMSUFIISOETS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOETS,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEM, "IMSUFIIMSOEM");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEM,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOPELLI, "IMSUFIOPELLI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIOPELLI,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEP, "IMSUFIIMSOEP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEP,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEE, "IMSUFIIMSOEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOECC, "IMSUFIISOECC");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOECC,1,3,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOECL5, "IMSUFISOECL5");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOECL5,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOECE, "IMSUFIISOECE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOECE,1,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEAIP, "IMSUFISOEAIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEAIP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOENIP, "IMSUFISOENIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOENIP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEASP, "IMSUFISOEASP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOEASP,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOENSP, "IMSUFISOENSP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE2,IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFISOENSP,2,15,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_IMPSUBFIOPE2, 0);
  }

  private static void Init_PQRY_PARAMETRI467(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI467, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI467, "PQRY_PARAMETRI467");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI467, 0);
  }

  private static void Init_PQRY_PARAMETRI467_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI467_RS, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI467_RS, "PQRY_PARAMETRI467_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSOLCOM,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI467_RS,IMDBDef17.PQSL_PARAMETRI467_ROWNAMSUBIMP,5,2,0);
  }

  private static void Init_PQRY_IMPSUBFIOPE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_IMPSUBFIOPE3, 25);
    IMDB.set_TblCode(IMDBDef17.PQRY_IMPSUBFIOPE3, "PQRY_IMPSUBFIOPE3");
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELCA, "IMSUFIOPELCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAR, "IMSUFIOPELAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAI, "IMSUFIOPELAI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNI, "IMSUFIOPELNI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNI,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAD, "IMSUFIOPELAD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAD,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELND, "IMSUFIOPELND");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELND,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELSD, "IMSUFIOPELSD");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELSD,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOEDDDR, "IMSUFIOEDDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOEDDDR,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELDE, "IMSUFIOPELDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELDE,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAP, "IMSUFIOPELAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELUP, "IMSUFIOPELUP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELUP,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNP, "IMSUFIOPELNP");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELIO, "IMSUFIOPELIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELIO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELBE, "IMSUFIOPELBE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELBE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAS, "IMSUFIOPELAS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELAS,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNS, "IMSUFIOPELNS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELNS,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOEVPEG, "IMSUFIOEVPEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOEVPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPEIII, "IMSUFIOPEIII");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPEIII,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPETTS, "IMSUFIOPETTS");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPETTS,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELLI, "IMSUFIOPELLI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELLI,2,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELMA, "IMSUFIOPELMA");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELMA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELDI, "IMSUFIOPELDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELDI,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFOEBRSEE, "IMSUFOEBRSEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFOEBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELOI, "IMSUFIOPELOI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPELOI,5,198,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPEOSI, "IMSUFIOPEOSI");
    IMDB.SetFldParams(IMDBDef17.PQRY_IMPSUBFIOPE3,IMDBDef17.PQSL_IMPSUBFIOPE3_IMSUFIOPEOSI,5,198,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_IMPSUBFIOPE3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImpegniOpe(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoImpegniOpe()
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
    FormIdx = MyGlb.FRM_ELENCIMPEOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C34659D5-D21B-4B57-A6D7-5A0D6DC6255B";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 458;
    set_Caption(new IDVariant("Elenco Impegni Ope"));
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C7701AD-FF40-4A90-9E90-6722B55F4937");
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
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9AF81783-905A-4841-B198-662BF18F5955");
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
    BKW_LIBRELENIMPE.iGuid = "D5FEED37-5EA6-42CC-9797-FADA12DE3204";
    BKW_LIBRELENIMPE.Code = "BUK_LIBRELENIMPE";
    BKW_LIBRELENIMPE.BookObj = BUK_LIBRELENIMPE;
    BKW_LIBRELENIMPE.InitDefMasks();
    BUK_LIBRELENIMPE.InitBook(1, 3342337, "Libro Elenco Impegni", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRELENIMPE.InitHTML();
    BUK_LIBRELENIMPE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRELENIMPE.Book.SetMainFrm(MainFrm);
    BUK_LIBRELENIMPE.SetRTCGuid(0, "D5FEED37-5EA6-42CC-9797-FADA12DE3204");
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
      if (CmdIdx==MyGlb.CMD_NUOVO23+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST11+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA7+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV7+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG137+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG135+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG137+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOPRE3+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaPrenotazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOIMP3+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI469, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCIMPEOPE_PARAMETRI467();
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
    return (obj instanceof ElencoImpegniOpe);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoImpegniOpe.class.getName() : (Glb.ClassWithPackage(ElencoImpegniOpe.class) ? ElencoImpegniOpe.class.getName().substring(ElencoImpegniOpe.class.getPackage().getName().length() + 1) : ElencoImpegniOpe.class.getName()));
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
      PAN_ELENCOIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPEGN_DESCRIZIONE,IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOE1, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ElencoImpegniOnDynamicPropertiesEvent", _e);
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
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET38+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET38+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ElencoImpegniOnChangeStatusEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ElencoImpegniOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMEESERC, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMSUBIMP, 0, (new IDVariant("SI")));
      PAN_ELENCOIMPEGN.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOIMPEGN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO23+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST11+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO23+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST11+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "EndModalEvent", _e);
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
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI467, IMDBDef17.PQSL_PARAMETRI467_ROWNAMSUBIMP, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMP3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ParametriOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ApriStampa", _e);
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
            APRCHIAUTPRE_IMPACCSEINV1(C3.Get("IMSUFIIMSOEE"), C3.Get("IMSUFIISOEAI"), C3.Get("IMSUFIISOENI"));
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ApriChiusuraAutomaticaPrenotazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINV1(IDVariant C3_IMSUFIIMSOEE, IDVariant C3_IMSUFIISOEAI, IDVariant C3_IMSUFIISOENI) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_IMSUFIIMSOEE);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_IMSUFIISOEAI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_IMSUFIISOENI);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEE, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI, 0));
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
            APRCHIAUTIMP_IMPACCSEINV1(C3.Get("IMSUFIIMSOEE"), C3.Get("IMSUFIIMSOEC"), C3.Get("IMSUFIIMSOEA"), C3.Get("IMSUFIISOEAI"), C3.Get("IMSUFIISOENI"), C3.Get("IMSUFIIMSOED"));
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ApriChiusuraAutomaticaImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINV1(IDVariant C3_IMSUFIIMSOEE, IDVariant C3_IMSUFIIMSOEC, IDVariant C3_IMSUFIIMSOEA, IDVariant C3_IMSUFIISOEAI, IDVariant C3_IMSUFIISOENI, IDVariant C3_IMSUFIIMSOED) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_IMSUFIIMSOEE);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_IMSUFIIMSOEC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_IMSUFIIMSOEA);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_IMSUFIISOEAI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_IMSUFIISOENI);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_IMSUFIIMSOED);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEE, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEA, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOED, 0));
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ApriInfoImpegno", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, 0));
      if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ApriInfoSubImpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_RONANUSUDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).ProponiNuovaRigaSubimpegno();
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_RONANUIMDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIIMSOEA, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0)).PAN_IMPEGNO.PanelCommand(Glb.PCM_INSERT);
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0,true,this)).ProponiNuovaRigaImpegno();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "Nuovo", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, 0))))
      {
        if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAS, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENS, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        if (IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOEAI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef17.PQRY_IMPSUBFIOPE2, IMDBDef17.PQSL_IMPSUBFIOPE2_IMSUFIISOENI, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "Modifica", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoImpegniOpe", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCIMPEOPE_PARAMETRI467() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI467_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI469, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI469, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI467_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI467_RS, 0, IMDBDef6.TBL_PARAMETRI469, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI467_RS, 0, 0, IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI467_RS, 1, 0, IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI467_RS, 2, 0, IMDBDef6.TBL_PARAMETRI469, IMDBDef6.FLD_PARAMETRI469_ROWNAMSUBIMP, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI469, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI469, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI469, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI467_RS, 0);
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
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "67DDF503-D4ED-4BFF-9E5E-D64CFF6CA4F3");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "CAPITOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "D38A551C-776C-4D99-B462-F60FC13DD5EC");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "ARTICOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "14C203F6-548B-4568-8FD2-D1DEDA5FB222");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "NUMERO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "FF038A7B-7AAA-4A14-8FB0-A26BF53C8D1F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "ANNO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "CD8B4CF6-601F-4A74-8334-973B93014BA6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "Info Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "CFA711EF-8280-4077-A8AB-41F99A3C1CA0");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "79FFFD36-D915-4F24-B063-606B7FDE4979");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "AB7448F7-8615-46F0-A905-424EF1256F02");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "6ED4721A-910C-4304-B294-F12F4FB957B9");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "77240D24-C57E-4F49-A8F3-11D5102E01B6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "D411DE67-3759-4976-ADA0-53F6F75F1EE0");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "Liquidato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "A6F45050-1062-4CD2-8F14-D6EB49839BAF");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "6D983201-D361-4175-9D72-830D94177566");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "194362C0-4DEE-4257-847A-FEDDEBAE7224");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "F068AC38-6DDF-4FF8-B3E5-ACEE22D17998");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "46AD06EC-8622-4230-8386-2DFE20639168");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "SEDE DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "B057DB62-89AD-45A2-9A18-5ACDA53814C8");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "ACE31D94-1D61-4F06-9BED-72266BD515FA");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "ANNO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "47D94DB7-15D9-4FFA-AF40-BF193EF14ED0");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "981FBFB8-95A3-4AA3-9567-9EEF0E9261FC");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "Prenotazione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "5D95CBA3-9833-4628-B8FE-97552EB3E056");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "A2C90D88-73DC-40C6-B184-84F6962B206F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "7EB1F0BF-9962-457A-A596-A74195FE2771");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "E182FA90-65C3-4785-AB2F-3D2A0D9EE9DB");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "Beneficiario");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "D7478873-B5F8-43E0-ACD7-18A022CD8EB6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, " ");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "79883F0B-3F79-4084-9828-3DC13A8D0FFB");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "Numero Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "5A93FD89-6FC9-4898-94C9-D4BDBAB35A83");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "DE60D3AA-6E0D-462B-B5E3-C83BEEAE249D");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "B3666379-81CD-4DCB-A83B-24567A7BF2B6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "Delibera");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "9E184B90-D833-416B-83D4-D74104382E1C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "Proposta");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "370BE436-97EA-4C18-9CE4-46526667C46F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "Sub-Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "655EA5E9-592B-4B5A-8C38-1B93F4B3203D");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "B7F173D8-B244-49EB-A4F5-E7FBD54A6765");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "Anno Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "8516602E-CC0F-4596-9E62-B4EB05C4FC67");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "Numero Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "CC9477E6-8825-4FB7-9A2F-7FF91FD5B9C2");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "Anno Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "FD0DEC2C-5EAE-447E-9E93-30D27CDE6976");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "01A7F105-2E5C-4C44-A211-B905C0EA85FA");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "63AC7717-BEE2-4D1E-9645-C4C20345866B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "Cofog");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "A385616D-2EF8-42AD-9F2D-BA77848113C5");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "V livello");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "C1A65833-61C9-4901-9D32-5A5377A71197");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "E1E22C74-5BE0-4E38-8703-96D4133A85F6");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "114057F0-B74D-488C-A06A-DD899CC9D4EA");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "DESC COFOG");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "4D4942FC-A6CF-4655-B574-3040B85DE161");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, "64C4D824-6C0F-45A6-92FD-D43BF1438A1F");
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CAPITOLO, PPQRY_IMPSUBFIOPE2, "B.CAPITOLO", "IMSUFIIMSOEC", 3, 16, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ARTICOLO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ARTICOLO, PPQRY_IMPSUBFIOPE2, "B.ARTICOLO", "IMSUFIIMSOEA", 1, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROIMP, PPQRY_IMPSUBFIOPE2, "B.NUMERO_IMP", "IMSUFIISOENI", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 160, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMP, PPQRY_IMPSUBFIOPE2, "B.ANNO_IMP", "IMSUFIISOEAI", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 196, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, "I. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 4, 652, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, "Info Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOIMPEGNI, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOIMPEGNI, PPQRY_INFO, "DECODE(~~IMSUFIISOENI~~, to_number(NULL), NULL, 'I')", "DUALINFOIMPE", 5, 99, 0, -13997);
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROSUBIMP, PPQRY_IMPSUBFIOPE2, "B.NUMERO_SUBIMP", "IMSUFIISOENS", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 256, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 388, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIMP, PPQRY_IMPSUBFIOPE2, "B.ANNO_SUBIMP", "IMSUFIISOEAS", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 292, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 700, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOSUBIMPEG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOSUBIMPEG, PPQRY_INFO, "DECODE(~~IMSUFIISOENS~~, to_number(NULL), NULL, 'I')", "DUAINFSUBIMP", 5, 99, 0, -13997);
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_IMPORTO, PPQRY_IMPSUBFIOPE2, "B.IMP_IMPORTO", "IMSUFIISOEII", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 400, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, "Sub Impegnato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 4, 460, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, "Sub Impeg.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SUBIMPEGNATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SUBIMPEGNATO, PPQRY_IMPSUBFIOPE2, "B.TOT_SUBIMPEGNATO", "IMSUFIISOETS", 2, 15, 0, -13997);
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
  SQL.append("  IMP_SUB_OPE_ELENCO A ");
  SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
  SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
  SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
  SQL.append("), 0) ELSE NVL(B.TOT_SUBIMPEGNATO, 0) - NVL(B.SUB_DISPONIBILITA, 0) END");
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_LIQUIDATO, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_LIQUIDATO, PPQRY_IMPSUBFIOPE2, SQL.toString(), "IMSUFIOPELLI", 2, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 568, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 4, 484, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PAGATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PAGATO, PPQRY_IMPSUBFIOPE2, "B.MANDATI", "IMSUFIIMSOEM", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 648, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DISPEFFETTIV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DISPEFFETTIV, PPQRY_IMPSUBFIOPE2, "B.DISPONIBILITA", "IMSUFIIMSOED", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 736, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DATA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DATA, PPQRY_IMPSUBFIOPE2, "B.D_DATA_REG", "IMSUFISOEDDR", 8, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 800, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCRIZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCRIZIONE, PPQRY_IMPSUBFIOPE2, "B.DESCRIZIONE", "IMSUFIIMSOE1", 5, 140, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1056, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SEDEDEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SEDEDEL, PPQRY_IMPSUBFIOPE2, "B.SEDE_DEL", "IMSUFIISOESD", 5, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1096, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMERODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMERODEL, PPQRY_IMPSUBFIOPE2, "B.NUM_DEL", "IMSUFIISOEND", 1, 6, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1140, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNODEL, PPQRY_IMPSUBFIOPE2, "B.ANNO_DEL", "IMSUFIISOEAD", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1176, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_OBBLIGATORIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_OBBLIGATORIO, PPQRY_IMPSUBFIOPE2, "B.IMPEGNO_OBBLIG", "IMSUFIISOEIO", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1256, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, "Prenotazione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 4, 532, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, "Prenotazione");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PRENOTAZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PRENOTAZIONE, PPQRY_IMPSUBFIOPE2, "B.PRENOTAZIONE", "IMSUFIIMSOEP", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1340, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_UNITAPROPONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_UNITAPROPONE, PPQRY_IMPSUBFIOPE2, "B.UNITA_PROP", "IMSUFIISOEUP", 5, 8, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1448, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROPROPOS, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROPROPOS, PPQRY_IMPSUBFIOPE2, "B.NUM_PROP", "IMSUFIISOENP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1488, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOPROPOSTA, PPQRY_IMPSUBFIOPE2, "B.ANNO_PROP", "IMSUFIISOEAP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1524, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 556, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_BENEFICIARIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_BENEFICIARIO, PPQRY_IMPSUBFIOPE2, "B.BENEFICIARIO", "IMSUFIIMSOEB", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1600, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 748, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_RAGIONSOCIAL, PPQRY_IMPSUBFIOPE2, "C.RAGIONE_SOCIALE_ESTESA", "IMSUFOEBRSEE", 5, 60, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1800, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, "N. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, "Num. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEIMPEPROV, PPQRY_IMPSUBFIOPE2, "B.NUMERO_IMP_PROVENIENZA", "IMSUFISOENIP", 2, 15, 0, -13997);
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ESERCIZIO, PPQRY_IMPSUBFIOPE2, "B.ESERCIZIO", "IMSUFIIMSOEE", 1, 4, 0, -13997);
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNSUBIMPORD, PPQRY_IMPSUBFIOPE2, "NVL(B.ANNO_SUBIMP, -1)", "IMSUFIOEASIO", 1, 19, 0, -13997);
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
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMSUBIMPORD, PPQRY_IMPSUBFIOPE2, "NVL(B.NUMERO_SUBIMP, -1)", "IMSUFIOENSIO", 1, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1840, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, "A. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 144);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, "Ann. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMPEPROV, PPQRY_IMPSUBFIOPE2, "B.ANNO_IMP_PROVENIENZA", "IMSUFISOEAIP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1880, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, "A. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 868, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIPROV, PPQRY_IMPSUBFIOPE2, "B.ANNO_SUBIMP_PROVENIENZA", "IMSUFISOEASP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 1920, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, "N. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 4, 868, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMESUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMESUBIPROV, PPQRY_IMPSUBFIOPE2, "B.NUMERO_SUBIMP_PROVENIENZA", "IMSUFISOENSP", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1960, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 4, 796, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICECOFOG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICECOFOG, PPQRY_IMPSUBFIOPE2, "B.CODICE_COFOG", "IMSUFIISOECC", 1, 3, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 2000, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 820, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODLIVELLO5, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODLIVELLO5, PPQRY_IMPSUBFIOPE2, "B.COD_LIVELLO_5", "IMSUFISOECL5", 3, 10, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 2076, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 844, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICEEUROPE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICEEUROPE, PPQRY_IMPSUBFIOPE2, "B.CODICE_EUROPEO", "IMSUFIISOECE", 1, 1, 0, -13997);
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
    SQL.append("  DECODE(~~IMSUFIISOENI~~, to_number(NULL), NULL, 'I') as DUALINFOIMPE, ");
    SQL.append("  DECODE(~~IMSUFIISOENS~~, to_number(NULL), NULL, 'I') as DUAINFSUBIMP ");
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
    SQL.append("and   (A.CODICE = ~~IMSUFISOECL5~~) ");
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
    SQL.append("and   (A.CODICE = ~~IMSUFIISOECC~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_COFOG, "VISTA_STRUTTURA_RICL");
    PAN_ELENCOIMPEGN.SetIMDB(IMDB, "PQRY_IMPSUBFIOPE2", true);
    PAN_ELENCOIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "IMP SUB FIN OPE ELENCO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CAPITOLO as IMSUFIIMSOEC, ");
    SQL.append("  B.ARTICOLO as IMSUFIIMSOEA, ");
    SQL.append("  B.ANNO_IMP as IMSUFIISOEAI, ");
    SQL.append("  B.NUMERO_IMP as IMSUFIISOENI, ");
    SQL.append("  B.ANNO_DEL as IMSUFIISOEAD, ");
    SQL.append("  B.NUM_DEL as IMSUFIISOEND, ");
    SQL.append("  B.SEDE_DEL as IMSUFIISOESD, ");
    SQL.append("  B.D_DATA_REG as IMSUFISOEDDR, ");
    SQL.append("  B.DESCRIZIONE as IMSUFIIMSOE1, ");
    SQL.append("  B.ANNO_PROP as IMSUFIISOEAP, ");
    SQL.append("  B.UNITA_PROP as IMSUFIISOEUP, ");
    SQL.append("  B.NUM_PROP as IMSUFIISOENP, ");
    SQL.append("  B.DISPONIBILITA as IMSUFIIMSOED, ");
    SQL.append("  B.IMPEGNO_OBBLIG as IMSUFIISOEIO, ");
    SQL.append("  B.BENEFICIARIO as IMSUFIIMSOEB, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as IMSUFOEBRSEE, ");
    SQL.append("  B.ANNO_SUBIMP as IMSUFIISOEAS, ");
    SQL.append("  B.NUMERO_SUBIMP as IMSUFIISOENS, ");
    SQL.append("  NVL(B.ANNO_SUBIMP, -1) as IMSUFIOEASIO, ");
    SQL.append("  NVL(B.NUMERO_SUBIMP, -1) as IMSUFIOENSIO, ");
    SQL.append("  B.IMP_IMPORTO as IMSUFIISOEII, ");
    SQL.append("  B.TOT_SUBIMPEGNATO as IMSUFIISOETS, ");
    SQL.append("  B.MANDATI as IMSUFIIMSOEM, ");
    SQL.append("  CASE WHEN (B.ANNO_SUBIMP IS NULL) THEN NVL(B.IMP_IMPORTO, 0) - NVL(B.DISPONIBILITA, 0) - NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(A.TOT_SUBIMPEGNATO) ");
    SQL.append("from ");
    SQL.append("  IMP_SUB_OPE_ELENCO A ");
    SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append("), 0) ELSE NVL(B.TOT_SUBIMPEGNATO, 0) - NVL(B.SUB_DISPONIBILITA, 0) END as IMSUFIOPELLI, ");
    SQL.append("  B.PRENOTAZIONE as IMSUFIIMSOEP, ");
    SQL.append("  B.ESERCIZIO as IMSUFIIMSOEE, ");
    SQL.append("  B.CODICE_COFOG as IMSUFIISOECC, ");
    SQL.append("  B.COD_LIVELLO_5 as IMSUFISOECL5, ");
    SQL.append("  B.CODICE_EUROPEO as IMSUFIISOECE, ");
    SQL.append("  B.ANNO_IMP_PROVENIENZA as IMSUFISOEAIP, ");
    SQL.append("  B.NUMERO_IMP_PROVENIENZA as IMSUFISOENIP, ");
    SQL.append("  B.ANNO_SUBIMP_PROVENIENZA as IMSUFISOEASP, ");
    SQL.append("  B.NUMERO_SUBIMP_PROVENIENZA as IMSUFISOENSP ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_SUB_OPE_ELENCO B, ");
    SQL.append("  BEN C ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE(+) = B.BENEFICIARIO) ");
    SQL.append("and   (B.OPERA = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMEOPERA~~, -1), -1, B.OPERA, ~~TBL_PARAMETRI469.ROWNAMEOPERA~~)) ");
    SQL.append("and   (B.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMEARTIC~~, -1), -1, B.ARTICOLO, ~~TBL_PARAMETRI469.ROWNAMEARTIC~~)) ");
    SQL.append("and   (B.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMECAPIT~~, -1), -1, B.CAPITOLO, ~~TBL_PARAMETRI469.ROWNAMECAPIT~~)) ");
    SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI469.ROWNAMEDAL~~, B.D_DATA_REG)) ");
    SQL.append("and   ((B.ANNO_IMP = B.ESERCIZIO) OR (~~TBL_PARAMETRI469.ROWNAMSOLCOM~~ = 'NO')) ");
    SQL.append("and   (~~PQRY_PARAMETRI467.ROWNAMSUBIMP~~ = B.SE_SUBIMP OR B.SE_SUBIMP = 'NO') ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_PARAMETRI469.ROWNAMEESERC~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3, 4, 19, 20 ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_IMPSUBFIOPE2, 5, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_IMPSUBFIOPE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(0, "IMP_SUB_OPE_ELENCO");
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "2B21E303-5693-4B58-90E7-B2938E4DC478");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "E0C4A356-3704-42AB-A938-55170C45424D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "BDCCBC39-36B0-4E6E-859B-EBC2FB8DA492");
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
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI467, "A.ROWNAMSOLCOM", "ROWNAMSOLCOM", 5, 49, 0, -13997);
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
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI467, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 292, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNI, PPQRY_PARAMETRI467, "A.ROWNAMSUBIMP", "ROWNAMSUBIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI467", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI467, IMDBDef17.PQRY_PARAMETRI467_RS, IMDBDef6.TBL_PARAMETRI469);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI469_ROWNAMSOLCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI469_ROWNAMEDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUBIMPEGNI, IMDBDef6.FLD_PARAMETRI469_ROWNAMSUBIMP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI469");
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
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, "7C013F0A-D2D5-41D2-A96B-F587F4A0F64E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, "ELEIMPBOOPAG");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, 26600, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, "0CDA73BC-7DC2-4C7F-B3A5-07C9BBA7ED95");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_NUMEROPAGINA, BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, "D8A3A4EE-274B-4913-8769-D617CA4464DC");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, "DF59467C-97F3-413B-9D77-16E360C9D2AD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER, BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Impegni di Spesa", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, "C0FC5407-C7DB-4060-A5E2-086D319D69B4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGDISPESA, "IMPEGDISPESA");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, 1000, 2400, 27700, 14900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, "58CB0674-EC89-41FE-A815-CD1EEE229FF0");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIBRELENIMPE.InitMastroBox(BUK_LIBRELENIMPE_MST_ELEIMPBOOPAG, BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER, 1000, 17900, 27700, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER, "D305C922-918F-42F2-8348-14AA5BEAFEBA");
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
      SQL.append("where (B.ESERCIZIO = ~~TBL_PARAMETRI469.ROWNAMEESERC~~) ");
      SQL.append("and   (B.FINANZIAMENTO = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMEFINAN~~, -1), -1, B.FINANZIAMENTO, ~~TBL_PARAMETRI469.ROWNAMEFINAN~~)) ");
      SQL.append("and   (B.OPERA = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMEOPERA~~, -1), -1, B.OPERA, ~~TBL_PARAMETRI469.ROWNAMEOPERA~~)) ");
      SQL.append("and   (B.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMEARTIC~~, -1), -1, B.ARTICOLO, ~~TBL_PARAMETRI469.ROWNAMEARTIC~~)) ");
      SQL.append("and   (B.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI469.ROWNAMECAPIT~~, -1), -1, B.CAPITOLO, ~~TBL_PARAMETRI469.ROWNAMECAPIT~~)) ");
      SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI469.ROWNAMEDAL~~, B.D_DATA_REG)) ");
      SQL.append("and   ((B.ANNO_IMP = B.ESERCIZIO) OR (~~TBL_PARAMETRI469.ROWNAMSOLCOM~~ = 'NO')) ");
      SQL.append("and   (~~PQRY_PARAMETRI467.ROWNAMSUBIMP~~ = B.SE_SUBIMP OR B.SE_SUBIMP = 'NO') ");
      SQL.append("and   (C.CODICE(+) = B.BENEFICIARIO) ");
      SQL.append("order by 1, 2, 24, 25 ");
      BUK_LIBRELENIMPE.SetReportQuery(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "56BA6D47-94BF-4AEB-BF94-4962DFE2F45A");
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
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "8189BAB9-AE3F-4590-B04F-637F222BCD0E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, "ELENIMPEREPO");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_REPORTHEADER, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_REPORTHEADER, "2C9ABA12-C574-4255-84E8-2E016542C71C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_PAGEHEADER, BUK_LIBRELENIMPE_RPTBOX_PAGEHEADER);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_PAGEHEADER, "C394706E-69DA-42FF-92C5-AE9EB00A1D76");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "2F953EE2-693E-4D26-8652-96B8FC031F9C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGH, "IMSUFIOPECGH");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "E9D19714-E25F-4640-A8C3-6853A481D9D5");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, "IMSUFIOPEAGH");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, 0, 1000, 3300, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, "459B0989-951B-4FBC-ACA5-310CCABDF4CC");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_VOCEPEGHEADE, BUK_LIBRELENIMPE_SPAN_C1, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C1, "49D727ED-B773-4938-B284-E1DAE0B93B3E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C1, "C1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, 3900, 1000, 1100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, "8D2BB657-7A91-4D00-8BDE-393744F48CBB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEGNHEADER, BUK_LIBRELENIMPE_SPAN_IMPEGNO1, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGNO1, "FC3B2FDB-0ADD-4DC4-B1B5-E9993C5FFB44");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, 5200, 1000, 1700, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, "F18DCBED-B313-41D9-BCFB-FF8D6B395D58");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGHEAD, BUK_LIBRELENIMPE_SPAN_IMPEGNO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPEGNO, "CBBB35EE-0787-44E4-803A-44A1A918402F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPEGNO, "IMPEGNO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, 6900, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, "80DEDC80-FB63-408C-8EEF-80F69D076B38");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPORTHEADER, BUK_LIBRELENIMPE_SPAN_IMPORTO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_IMPORTO, "806EF557-DBD9-41C9-94D5-79666F861A7D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, 9200, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, "0F57580D-E50E-4FB6-BD4B-28A8914D1AA7");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, "SUBIMPHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPHEADER, BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Sub-Impegnato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, "688FB17D-7BF8-4140-BC31-5E382C25A55C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, 11500, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, "B13DC706-6875-4E18-8D77-1F3AA07452A4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_LIQUIDHEADER, BUK_LIBRELENIMPE_SPAN_LIQUIDATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Liquidato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_LIQUIDATO, "CF75C88E-4B7B-453D-9506-869E962C5821");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_LIQUIDATO, "LIQUIDATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, 13800, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, "C918D57B-338A-40B5-A7DB-3A3297661C6F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_MANDATHEADER, BUK_LIBRELENIMPE_SPAN_PAGATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Pagato", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_PAGATO, "E4E02CE1-A356-4BD4-83D4-C8C059A81242");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_PAGATO, "PAGATO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, 16100, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, "838244D6-282A-466A-8B49-AB5AFA0C2406");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DISPONHEADER, BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, "413CC99A-C3AB-40BB-8D7F-51CEBC97C3CE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, 18400, 1000, 1200, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, "52837D84-8140-4F41-BD7D-86B2EBFEDC2F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DATAREGHEADE, BUK_LIBRELENIMPE_SPAN_DATAREG, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DATAREG, "76465FB2-913C-45DF-932F-816A448DCEAD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DATAREG, "DATAREG");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, 19700, 700, 2600, 700, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, "D495E30C-356A-4590-A402-3B8A3D4B5698");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DESCRIHEADER, BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Descrizione e Beneficiario", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, "0FFDF3A3-DC86-4C90-8B54-44927A09E042");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, 22800, 1000, 1500, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, "50538891-2539-4ED7-B17D-F6F1542B6D3A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, "ISFOEISFOESD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_ISFOEISFOESD, BUK_LIBRELENIMPE_SPAN_C2, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Delibera", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C2, "1E85591A-5257-41DA-8C51-10884362E1E4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C2, "C2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, 27056, 1000, 644, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, "8ED04353-C004-4890-A34D-3C3A93F4CE6F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, "IMPEOBBLHEAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEOBBLHEAD, BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Obb.", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, "43A3A23F-4A73-4F19-B0AC-826F0E515E09");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, 24400, 1000, 2600, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, "D2469F24-E19C-42E6-A480-49F6EC77309E");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, "IMSUFIOPEUPH");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPEUPH, BUK_LIBRELENIMPE_SPAN_C, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Proposta", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_C, "5042B88B-097F-48B0-858B-63CF292BF431");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_C, "C");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGH, BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, 0, 100, 27500, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, "0F4A4D3E-939C-4960-832E-9516B5A27533");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_VOCEPEG, BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIO, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271384961, "Voce P.e.g. +c Space +c To String (VISTA IMP SUB UO UT INTERVENTO) +c If (Is Null (VISTA IMP SUB UO UT CAPITOLO), Null String, trattino con spazi +c To String (VISTA IMP SUB UO UT CAPITOLO)) +c If (Is Null (VISTA IMP SUB UO UT ARTICOLO), Null String, barra con spazi +c To String (VISTA IMP SUB UO UT ARTICOLO))", "::IMSUFIOEVPEG", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIO, "1E0EAEE4-852D-46CA-8AF1-F38FC1203E03");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEVPEGEIO, "ISFOEVPEGEIO");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_DETAIL, "6B65553F-44AA-4E11-990C-2C89786E4AA8");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_DETAIL, "DETAIL");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, 0, 0, 2600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, "B40D3BCA-52AB-4E32-A439-EBA7906F290F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELCA, BUK_LIBRELENIMPE_SPAN_ISFOECEIOEIB, MyGlb.VIS_NORMALEA7, 3, 16, 6, 271384961, "", "::IMSUFIOPELCA", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECEIOEIB, "53A328A1-EDA9-4969-8562-0EB6D3B406ED");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECEIOEIB, "ISFOECEIOEIB");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, 2700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, "E5F4610A-79E7-4CC9-8C1B-48CE6FA0C1FF");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAVOCEPEG, BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, "1D688399-424B-4E58-8890-9DC721D6D423");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, 2900, 0, 300, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, "4F25B72A-027D-4A00-8078-9ADF9B1D4BFE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAR, BUK_LIBRELENIMPE_SPAN_ISFOEAEIOEIB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384961, "", "::IMSUFIOPELAR", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAEIOEIB, "179B3724-1698-443E-BDF9-6E792B73CD46");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAEIOEIB, "ISFOEAEIOEIB");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, 3500, 0, 700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, "9C560721-51FA-487B-B0E2-FFE4CC8AF5EA");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, "IMSUFIOPELNI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNI, BUK_LIBRELENIMPE_SPAN_ISFOENIEIOEI, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::IMSUFIOPELNI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENIEIOEI, "0AA18F41-CCAA-4624-A585-C11F27BE1D97");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENIEIOEI, "ISFOENIEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, 4200, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, "30445502-8CBE-4158-894E-8131511AE763");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAIMPEGNO, BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, "E8858D2D-90C9-43FE-B092-47C033E46435");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, 4400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, "7696DFEB-68FD-4843-A40E-D588DF5EB934");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, "IMSUFIOPELAI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAI, BUK_LIBRELENIMPE_SPAN_ISFOEAIEIOEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::IMSUFIOPELAI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAIEIOEI, "7EBB73F8-813B-4813-BE17-FF7152DC0874");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAIEIOEI, "ISFOEAIEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, 5100, 0, 800, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, "446ACE2D-754F-41F3-BBA5-1C59F4E11DE6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, "IMSUFIOPELNS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNS, BUK_LIBRELENIMPE_SPAN_ISFOENSEIOEI, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::IMSUFIOPELNS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENSEIOEI, "EF4129A0-5843-4154-ABD2-DDD872043BC8");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENSEIOEI, "ISFOENSEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, 6000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, "25D1741F-D92E-439B-A6FF-BA2C8970BE1C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRASUBIMPE, BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, "59F76652-0677-49E5-A57B-163D105C7AF5");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, 6200, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, "157A4331-1A01-42DA-B278-B995C5B25AD5");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, "IMSUFIOPELAS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAS, BUK_LIBRELENIMPE_SPAN_ISFOEASEIOEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::IMSUFIOPELAS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEASEIOEI, "7B63D704-1276-4102-AC84-3E9F6B492A97");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEASEIOEI, "ISFOEASEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMPORTO, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, "16EFE2C8-2DA9-4E4C-861E-320371A046E1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPORTO, BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIOE, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPEIII", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIOE, "5AC56EB6-23E8-48CA-BFB1-E4D2AEF69B2D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEIIIEIOE, "ISFOEIIIEIOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, "DBDEB5E0-442C-4E52-9F43-18A5E9740DDB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUBIMPEGNATO, BUK_LIBRELENIMPE_SPAN_ISFOETTSEIOE, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPETTS", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOETTSEIOE, "78F62036-57B1-4E2F-92A5-CB3D83F80529");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOETTSEIOE, "ISFOETTSEIOE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, "87386747-C021-4643-8C2F-BAD2AACA2FD0");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, "LIQUIDATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_LIQUIDATO, BUK_LIBRELENIMPE_SPAN_ISFOELEIOEIB, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "Liquidato", "::IMSUFIOPELLI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOELEIOEIB, "E9204CD1-D087-474F-9A5A-9FFB2486B944");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOELEIOEIB, "ISFOELEIOEIB");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_MANDATI, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_MANDATI, "21E96B87-1947-4CF5-AACD-5479E5C7772A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_MANDATI, "MANDATI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_MANDATI, BUK_LIBRELENIMPE_SPAN_ISFOEMEIOEIB, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::IMSUFIOPELMA", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEMEIOEIB, "46C0D66A-F6C0-4D18-BB82-E03576BF8F92");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEMEIOEIB, "ISFOEMEIOEIB");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, "B0F67455-6980-47C9-B527-C2876D23F115");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DISPONIBILIT, BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEI1, MyGlb.VIS_IMPOFONTRIDO, 2, 15, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELDI", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEI1, "BF41B08C-FFCE-4978-8BEE-6CA14BC5E956");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEI1, "ISFOEDEIOEI1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DATAREG, 18400, 0, 1200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DATAREG, "24B263B4-56B7-4CF9-81A8-5FB0DB2C20A3");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DATAREG, "DATAREG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DATAREG, BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIO, MyGlb.VIS_NORMALEA7, 8, 19, 0, 271384705, "Brief description of field content.", "::IMSUFIOEDDDR", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIO, "FCB1BD11-847D-4AD8-B6B8-E8D5DD57AAF9");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDDDREIO, "ISFOEDDDREIO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, 19700, 0, 2600, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, "0CDAAF73-5C58-4EF5-8B37-E0E42859DB27");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_DESCRIZIONE, BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEIB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELDE", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEIB, "1EB8FD73-8BBC-45FD-807C-D0AE85A1A22D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEDEIOEIB, "ISFOEDEIOEIB");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, 22400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, "EE67C967-54A7-4ACE-820E-045A0E96BF34");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, "IMSUFIOPELSD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELSD, BUK_LIBRELENIMPE_SPAN_ISFOESDEIOEI, MyGlb.VIS_NORMALEA7, 5, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELSD", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOESDEIOEI, "855CACA9-01B3-40DA-918A-22F08614512D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOESDEIOEI, "ISFOESDEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, 23200, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, "00B17B6E-DC18-4439-B2DF-940319CC412A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, "IMSUFIOPELND");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELND, BUK_LIBRELENIMPE_SPAN_ISFOENDEIOEI, MyGlb.VIS_NORMALEA7, 1, 6, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELND", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENDEIOEI, "6704E9BD-5C18-4534-A9F4-6924D9CCA1DC");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENDEIOEI, "ISFOENDEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, 23900, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, "80FEF0CF-C1B0-41DE-8DFC-E8A9AF9B9B07");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, "IMSUFIOPELAD");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAD, BUK_LIBRELENIMPE_SPAN_ISFOEADEIOEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELAD", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEADEIOEI, "907DC976-7A11-41F2-A16C-3B9AA4C2FD41");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEADEIOEI, "ISFOEADEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, 27056, 0, 644, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, "2E04B5D3-B25B-4ADA-B8FD-75E7B63B6D4B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, "IMPEGNOBBLIG");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMPEGNOBBLIG, BUK_LIBRELENIMPE_SPAN_ISFOEIOEIOEI, MyGlb.VIS_NORMALEA7, 5, 2, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELIO", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEIOEIOEI, "01B77B17-049F-4DD1-B0B8-521494FFC1EA");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEIOEIOEI, "ISFOEIOEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, 24500, 0, 1000, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, "D2FF3112-1F4B-4AE1-BBB1-FAC57A0D5866");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, "IMSUFIOPELUP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELUP, BUK_LIBRELENIMPE_SPAN_ISFOEUPEIOEI, MyGlb.VIS_NORMALEA7, 5, 8, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELUP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEUPEIOEI, "747E5B32-6F10-4C06-B827-6EEB0BC80E34");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEUPEIOEI, "ISFOEUPEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, 25800, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, "183BC908-7755-4637-BAD4-4F59A1E4AC2D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, "IMSUFIOPELNP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELNP, BUK_LIBRELENIMPE_SPAN_ISFOENPEIOEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELNP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOENPEIOEI, "F1054FEE-1CD7-4E3C-9FB3-C27B7397FBC3");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOENPEIOEI, "ISFOENPEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, 26476, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, "BCF038E1-E8A9-4757-B80C-20CF75485CE6");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, "IMSUFIOPELAP");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_IMSUFIOPELAP, BUK_LIBRELENIMPE_SPAN_ISFOEAPEIOEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::IMSUFIOPELAP", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAPEIOEI, "FA7CC26F-2F4A-4B13-B9E2-FF247F296CDA");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAPEIOEI, "ISFOEAPEIOEI");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, 23000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, "E8CB1C83-B6F6-443F-9E43-4C7BD97D11EA");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TRATTIDELIBE, BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, "C13F2B94-88C4-4B5F-AB6C-EF2417760C0D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, 23700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, "E1CB3AA3-FE17-48EA-B2E0-73E6E1FA6450");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, "BARRADELIBER");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRADELIBER, BUK_LIBRELENIMPE_SPAN_BARRADELIBER, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRADELIBER, "B8534C4D-27F5-45D3-8DDA-D5D44F37755C");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRADELIBER, "BARRADELIBER");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, 25600, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, "425E79B9-EFF8-49F7-88C8-67EB7B6DBB2B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TRATTIPROPOS, BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, "AB44188D-C5FF-4657-8C24-234EC6C9B14A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_DETAIL, BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, 26300, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, "C61F9B2B-F611-47C2-A76D-B939D837268F");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, "BARRAPROPOST");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_BARRAPROPOST, BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, "FADAFB59-3AE7-46A1-A56F-030A9A634B23");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_BARRAPROPOST, "BARRAPROPOST");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "IMSUFIOPELAR");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, "B207C900-AD4C-4FD7-A4FA-8A39CA5ED017");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, "IMSUFIOPEAGF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, 6900, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, "E9205FBA-EACA-4211-92D9-2AA018752E4B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORT1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, "1B5126EE-7DBD-43FF-914D-FC9E2C597842");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS1, "ISFOEAGFSIS1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, 9200, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, "56CF666A-FB7E-4217-B2EE-77B3E76B953A");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, "SUMOFSUBIMP1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMP1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, "2474AB7D-C0CB-4B22-8468-3C40D4BD9FCC");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS2, "ISFOEAGFSIS2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, 11500, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, "4FA4D8F4-E2E1-4629-8B3C-06BB030EEECF");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, "SUMOFLIQUID1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUID1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, "96B5F999-7A90-464E-8683-33C8E9DC8CD1");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS3, "ISFOEAGFSIS3");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, 13800, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, "F1FF9004-AC22-4031-B15D-388586A02D8B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, "SUMOFPAGATO1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, "6D734115-FA0C-4F20-952D-E80067D63EEE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSIS4, "ISFOEAGFSIS4");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, 16100, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, "F010C2AC-CF26-4370-9B57-CDFB92EF2E15");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPON1, BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, "FB22D5DB-826B-4C0D-9A6E-2644147353CC");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOEAGFSISF, "ISFOEAGFSISF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, 4700, 100, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, "4F5CADA1-1EE9-4A64-ABFE-978EECEE3F7D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TOTALEARTICO, BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, "365B8750-E002-4E07-876F-6E20895FE710");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPEAGF, BUK_LIBRELENIMPE_RPTBOX_BARRA, 6900, 0, 11400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_BARRA, "A70D0E31-F8B5-4DC4-8702-E28EA93ACDDB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_BARRA, "BARRA");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "IMSUFIOPELCA");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, "E8D03514-28D4-48EA-AD30-0C4E058E4237");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, "IMSUFIOPECGF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, "E27B1555-A701-49C7-BE98-314BA6910AAB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFIMPORTO, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, "3D291BAA-97C9-4FDB-8443-3C8DD09DCC2B");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS1, "ISFOECGFSIS1");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, "F3142ED8-8C56-4650-BA56-2DB8ECD68B84");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, "SUMOFSUBIMPE");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFSUBIMPE, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, "EBF62ED2-E595-44F8-92C1-9ED14EC3DDBB");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS2, "ISFOECGFSIS2");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, "DA0A4BA8-EBE1-43AB-91BE-A6BE16F0ABD5");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, "SUMOFLIQUIDA");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFLIQUIDA, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, "E0EAFBB4-85D5-4AA7-B544-AB77F3D634C4");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS3, "ISFOECGFSIS3");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, "F12D1011-F50A-4A64-AAA9-91666D32DACD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, "SUMOFPAGATO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFPAGATO, BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, "D04CDB52-511B-4331-A204-35031E338538");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSIS4, "ISFOECGFSIS4");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, "B2851860-33A4-40E2-A33D-1BC11DA838D3");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_SUMOFDISPONI, BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, MyGlb.VIS_IMPOFONTRIDO, 2, 19, 0, 271384705, "", "", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, "408E58FE-72B9-4EA4-81D2-69F5C3F1267D");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_ISFOECGFSISF, "ISFOECGFSISF");
    BUK_LIBRELENIMPE.InitReportBox(BUK_LIBRELENIMPE_SEC_IMSUFIOPECGF, BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, 4700, 0, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, "0B818F5F-FA51-4856-A3E1-923645F478C8");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENIMPE.InitBoxSpan(BUK_LIBRELENIMPE_RPTBOX_TOTALECAPITO, BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, "0A2F7928-2A92-44D6-8999-A20CA88D2FCD");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, BUK_LIBRELENIMPE_RPTBOX_PAGEFOOTER);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, "2BBFD90C-8042-4B5F-9299-7FE5BBB4D4BE");
    BUK_LIBRELENIMPE.SetObjCode(BUK_LIBRELENIMPE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBRELENIMPE.InitSection(BUK_LIBRELENIMPE_RPT_ELENIMPEREPO, BUK_LIBRELENIMPE_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENIMPE.SetSectionRendersInto(BUK_LIBRELENIMPE_SEC_REPORTFOOTER, BUK_LIBRELENIMPE_RPTBOX_PAGEBODY);
    BUK_LIBRELENIMPE.SetRTCGuid(BUK_LIBRELENIMPE_SEC_REPORTFOOTER, "4896AFDD-E4CB-4D1C-AF40-D06DA7F62B2C");
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
