// **********************************************
// Previsioni Per Unita Di Gestione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerUnitaDiGestione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVPERUOGES_PARTE = 0;

  private static int PFL_PREVPERUOGES_UOSUPERIORE = 0;
  private static int PFL_PREVPERUOGES_UOGESTIONE = 1;
  private static int PFL_PREVPERUOGES_DABILANSIMUL = 2;
  private static int PFL_PREVPERUOGES_DETTAGCAPITO = 3;
  private static int PFL_PREVPERUOGES_DESCRIINTERV = 4;
  private static int PFL_PREVPERUOGES_TOTALPERTITO = 5;
  private static int PFL_PREVPERUOGES_VARIAZIONI = 6;
  private static int PFL_PREVPERUOGES_PREVANNINCOR = 7;
  private static int PFL_PREVPERUOGES_PARTE = 8;
  private static int PFL_PREVPERUOGES_PARTELABELDX = 9;
  private static int PFL_PREVPERUOGES_ELABORA = 10;

  private static int PPQRY_PAR112 = 0;

  private static int PPQRY_ANAGUNITORGA = 1;
  private static int PPQRY_CF4WEBSTRUTT = 2;


  IDPanel PAN_PREVPERUOGES;
  CIDREObj BUK_PRPEUOGECODB;
  OBook BKW_PRPEUOGECODB;
  //
  // Template Pages constants
  private static int BUK_PRPEUOGECODB_MST_STPRPEUOGEPA = 1;
  private static int BUK_PRPEUOGECODB_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_PRPEUOGECODB_SPAN_CPTSPPUGCDBP = 3;
  private static int BUK_PRPEUOGECODB_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_PRPEUOGECODB_RPT_PREPERUOGERE = 6;
  private static int BUK_PRPEUOGECODB_SEC_REPORTHEADER = 7;
  private static int BUK_PRPEUOGECODB_SEC_PAGEHEADER = 8;
  private static int BUK_PRPEUOGECODB_RPTBOX_RAGGRUPPAPE1 = 9;
  private static int BUK_PRPEUOGECODB_SPAN_RAGGPERUOGE1 = 10;
  private static int BUK_PRPEUOGECODB_SEC_RAGUOESGROHE = 11;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCRIZIONU2 = 12;
  private static int BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU2 = 13;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOVOPEUOESGH = 14;
  private static int BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD2 = 15;
  private static int BUK_PRPEUOGECODB_SPAN_VOCEPEG2 = 16;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOCOBIUOESGH = 17;
  private static int BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEA1 = 18;
  private static int BUK_PRPEUOGECODB_SPAN_CODICEBILAN1 = 19;
  private static int BUK_PRPEUOGECODB_RPTBOX_BODEUOUTUEGH = 20;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHE1 = 21;
  private static int BUK_PRPEUOGECODB_SPAN_DESCRUOUTIL1 = 22;
  private static int BUK_PRPEUOGECODB_RPTBOX_BODEVOPEUEGH = 23;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE2 = 24;
  private static int BUK_PRPEUOGECODB_SPAN_DESCRIZIONE2 = 25;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRH1 = 26;
  private static int BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2 = 27;
  private static int BUK_PRPEUOGECODB_SPAN_PREVISIONE2 = 28;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1 = 29;
  private static int BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2 = 30;
  private static int BUK_PRPEUOGECODB_SPAN_STANZIINIZI2 = 31;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1 = 32;
  private static int BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2 = 33;
  private static int BUK_PRPEUOGECODB_SPAN_VARIAZIONI2 = 34;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1 = 35;
  private static int BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2 = 36;
  private static int BUK_PRPEUOGECODB_SPAN_STANZIDEFIN2 = 37;
  private static int BUK_PRPEUOGECODB_SEC_RAGTITGROHEA = 38;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCRUOTITOL = 39;
  private static int BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU3 = 40;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOVOPETIGRHE = 41;
  private static int BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD3 = 42;
  private static int BUK_PRPEUOGECODB_SPAN_VOCEPEG3 = 43;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOCOBITIGRHE = 44;
  private static int BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEAD = 45;
  private static int BUK_PRPEUOGECODB_SPAN_CODICEBILANC = 46;
  private static int BUK_PRPEUOGECODB_RPTBOX_BODEUOUTTIGH = 47;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHEA = 48;
  private static int BUK_PRPEUOGECODB_SPAN_DESCRUOUTILI = 49;
  private static int BUK_PRPEUOGECODB_RPTBOX_BODEVOPETIGH = 50;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE3 = 51;
  private static int BUK_PRPEUOGECODB_SPAN_DESCRVOCEPEG = 52;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRH1 = 53;
  private static int BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3 = 54;
  private static int BUK_PRPEUOGECODB_SPAN_PREVISIONE3 = 55;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1 = 56;
  private static int BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3 = 57;
  private static int BUK_PRPEUOGECODB_SPAN_STANZIINIZI3 = 58;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1 = 59;
  private static int BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3 = 60;
  private static int BUK_PRPEUOGECODB_SPAN_VARIAZIONI3 = 61;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1 = 62;
  private static int BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3 = 63;
  private static int BUK_PRPEUOGECODB_SPAN_STANZIDEFIN3 = 64;
  private static int BUK_PRPEUOGECODB_SEC_DETAIL = 65;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET = 66;
  private static int BUK_PRPEUOGECODB_RPTBOX_VOCEPEG = 67;
  private static int BUK_PRPEUOGECODB_SPAN_RVPPPUDGPPUG = 68;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXCODBILDET = 69;
  private static int BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC = 70;
  private static int BUK_PRPEUOGECODB_SPAN_RCBPPUDGPPUG = 71;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXDESUOUTDE = 72;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI = 73;
  private static int BUK_PRPEUOGECODB_SPAN_RDUUPPUDGPPU = 74;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXDESVOPEDE = 75;
  private static int BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG = 76;
  private static int BUK_PRPEUOGECODB_SPAN_RDVPPPUDGPPU = 77;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXPREVIDET1 = 78;
  private static int BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1 = 79;
  private static int BUK_PRPEUOGECODB_SPAN_RVBUPPPUDGPP = 80;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE = 81;
  private static int BUK_PRPEUOGECODB_RPTBOX_STNINICO1 = 82;
  private static int BUK_PRPEUOGECODB_SPAN_RVBUSICPPUDG = 83;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET = 84;
  private static int BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1 = 85;
  private static int BUK_PRPEUOGECODB_SPAN_RVBUVCPPUDGP = 86;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1 = 87;
  private static int BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1 = 88;
  private static int BUK_PRPEUOGECODB_SPAN_RSDPPUDGPPUG = 89;
  private static int BUK_PRPEUOGECODB_SEC_RAGTITGROFOO = 90;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1 = 91;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2 = 92;
  private static int BUK_PRPEUOGECODB_SPAN_RTGFSRVBUPP1 = 93;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1 = 94;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2 = 95;
  private static int BUK_PRPEUOGECODB_SPAN_RTGFSRVBUSI1 = 96;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1 = 97;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2 = 98;
  private static int BUK_PRPEUOGECODB_SPAN_RTGFSRVBUVC1 = 99;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1 = 100;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2 = 101;
  private static int BUK_PRPEUOGECODB_SPAN_RTGFSRSDPPU1 = 102;
  private static int BUK_PRPEUOGECODB_RPTBOX_TOTALETITOL1 = 103;
  private static int BUK_PRPEUOGECODB_SPAN_CTIERVBUTPP1 = 104;
  private static int BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1 = 105;
  private static int BUK_PRPEUOGECODB_SEC_RAGUOESGROFO = 106;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1 = 107;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3 = 108;
  private static int BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUP1 = 109;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF = 110;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3 = 111;
  private static int BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUS1 = 112;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF = 113;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3 = 114;
  private static int BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUV1 = 115;
  private static int BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2 = 116;
  private static int BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3 = 117;
  private static int BUK_PRPEUOGECODB_SPAN_RUEGFSRSDPP1 = 118;
  private static int BUK_PRPEUOGECODB_RPTBOX_TOTALE1 = 119;
  private static int BUK_PRPEUOGECODB_SPAN_TOTALE1 = 120;
  private static int BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1 = 121;
  private static int BUK_PRPEUOGECODB_SEC_PAGEFOOTER = 122;
  private static int BUK_PRPEUOGECODB_SEC_REPORTFOOTER = 123;

  CIDREObj BUK_PRPEUOGESEDB;
  OBook BKW_PRPEUOGESEDB;
  //
  // Template Pages constants
  private static int BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA = 1;
  private static int BUK_PRPEUOGESEDB_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_PRPEUOGESEDB_SPAN_CPTSPPUGSDBP = 3;
  private static int BUK_PRPEUOGESEDB_RPTBOX_PAGEHEADER = 4;
  private static int BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_PRPEUOGESEDB_RPT_PREPERUOGERE = 6;
  private static int BUK_PRPEUOGESEDB_SEC_REPORTHEADER = 7;
  private static int BUK_PRPEUOGESEDB_SEC_PAGEHEADER = 8;
  private static int BUK_PRPEUOGESEDB_RPTBOX_RAGGRUPPAPER = 9;
  private static int BUK_PRPEUOGESEDB_SPAN_RAGGPERUOGES = 10;
  private static int BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE = 11;
  private static int BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONU1 = 12;
  private static int BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPU1 = 13;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOCOUOESGRHE = 14;
  private static int BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADE1 = 15;
  private static int BUK_PRPEUOGESEDB_SPAN_VOCEPEG1 = 16;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BODEUOESGRHE = 17;
  private static int BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADE1 = 18;
  private static int BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE1 = 19;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRHE = 20;
  private static int BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1 = 21;
  private static int BUK_PRPEUOGESEDB_SPAN_PREVISIONE1 = 22;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH = 23;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1 = 24;
  private static int BUK_PRPEUOGESEDB_SPAN_STANZIINIZI1 = 25;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE = 26;
  private static int BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1 = 27;
  private static int BUK_PRPEUOGESEDB_SPAN_VARIAZIONI1 = 28;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH = 29;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1 = 30;
  private static int BUK_PRPEUOGESEDB_SPAN_STANZIDEFIN1 = 31;
  private static int BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA = 32;
  private static int BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONUO = 33;
  private static int BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPUG = 34;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXCODTIGRHE = 35;
  private static int BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADER = 36;
  private static int BUK_PRPEUOGESEDB_SPAN_VOCEPEG = 37;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXDESTIGRHE = 38;
  private static int BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADER = 39;
  private static int BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE = 40;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRHE = 41;
  private static int BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER = 42;
  private static int BUK_PRPEUOGESEDB_SPAN_PREVISIONE = 43;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE = 44;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD = 45;
  private static int BUK_PRPEUOGESEDB_SPAN_STANZIINIZIA = 46;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE = 47;
  private static int BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER = 48;
  private static int BUK_PRPEUOGESEDB_SPAN_VARIAZIONI = 49;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE = 50;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD = 51;
  private static int BUK_PRPEUOGESEDB_SPAN_STANZIDEFINI = 52;
  private static int BUK_PRPEUOGESEDB_SEC_RARICOINGRHE = 53;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXCODICDETA = 54;
  private static int BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE = 55;
  private static int BUK_PRPEUOGESEDB_SPAN_RRCIPPUDGPPU = 56;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXDESCRDETA = 57;
  private static int BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT = 58;
  private static int BUK_PRPEUOGESEDB_SPAN_RDRCIPPUDGPP = 59;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXPREVIDETA = 60;
  private static int BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE = 61;
  private static int BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUP = 62;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET = 63;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STNINICO = 64;
  private static int BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUS = 65;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA = 66;
  private static int BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO = 67;
  private static int BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUV = 68;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET = 69;
  private static int BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI = 70;
  private static int BUK_PRPEUOGESEDB_SPAN_RRCIGHSRSDPP = 71;
  private static int BUK_PRPEUOGESEDB_SEC_DETAIL = 72;
  private static int BUK_PRPEUOGESEDB_SEC_RARICOINGRFO = 73;
  private static int BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO = 74;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO = 75;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1 = 76;
  private static int BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUPPP = 77;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO = 78;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1 = 79;
  private static int BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUSIC = 80;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO = 81;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1 = 82;
  private static int BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUVCP = 83;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO = 84;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1 = 85;
  private static int BUK_PRPEUOGESEDB_SPAN_RTGFSRSDPPUD = 86;
  private static int BUK_PRPEUOGESEDB_RPTBOX_TOTALETITOLO = 87;
  private static int BUK_PRPEUOGESEDB_SPAN_CTIERVBUTPPU = 88;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO = 89;
  private static int BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO = 90;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO = 91;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR = 92;
  private static int BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUPP = 93;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF = 94;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC = 95;
  private static int BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUSI = 96;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO = 97;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC = 98;
  private static int BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUVC = 99;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF = 100;
  private static int BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF = 101;
  private static int BUK_PRPEUOGESEDB_SPAN_RUEGFSRSDPPU = 102;
  private static int BUK_PRPEUOGESEDB_RPTBOX_TOTALE = 103;
  private static int BUK_PRPEUOGESEDB_SPAN_TOTALE = 104;
  private static int BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE = 105;
  private static int BUK_PRPEUOGESEDB_SEC_PAGEFOOTER = 106;
  private static int BUK_PRPEUOGESEDB_SEC_REPORTFOOTER = 107;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI399(IMDB);
    Init_TBL_PARAMETRIO28(IMDB);
    //
    //
    Init_PQRY_PAR112(IMDB);
    Init_PQRY_PAR112_RS(IMDB);
    Init_PQRY_VISTABILBPU4(IMDB);
    Init_PQRY_VISTABILBPU3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI399(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI399, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI399, "TBL_PARAMETRI399");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMUOSUPER, "PARAMUOSUPER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMUOSUPER,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAPREVEURO, "PARAPREVEURO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI399,IMDBDef3.FLD_PARAMETRI399_PARAPREVEURO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI399, 0);
  }

  private static void Init_TBL_PARAMETRIO28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRIO28, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRIO28, "TBL_PARAMETRIO28");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIO28,IMDBDef3.FLD_PARAMETRIO28_PARAUOSUPOLD, "PARAUOSUPOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIO28,IMDBDef3.FLD_PARAMETRIO28_PARAUOSUPOLD,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRIO28, 0);
  }

  private static void Init_PQRY_PAR112(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR112, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR112, "PQRY_PAR112");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMUOSUPER, "PARAMUOSUPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMUOSUPER,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112,IMDBDef12.PQSL_PAR112_PARPREANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR112, 0);
  }

  private static void Init_PQRY_PAR112_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR112_RS, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR112_RS, "PQRY_PAR112_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMUOSUPER, "PARAMUOSUPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMUOSUPER,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR112_RS,IMDBDef12.PQSL_PAR112_PARPREANINCO,5,2,0);
  }

  private static void Init_PQRY_VISTABILBPU4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTABILBPU4, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTABILBPU4, "PQRY_VISTABILBPU4");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORVOCEPEG,5,303,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECDESVOCPEG, "RECDESVOCPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECDESVOCPEG,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORDVOCPEG, "RECORDVOCPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORDVOCPEG,5,297,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORAGGUOES, "RECORAGGUOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORAGGUOES,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORAGGTITO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECOCODIBILA, "RECOCODIBILA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECOCODIBILA,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECODESUOUTI, "RECODESUOUTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECODESUOUTI,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_PREVISIONE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_STN_INI_CO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_VARIAZIONI_CO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECOSTANDEFI, "RECOSTANDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU4,IMDBDef12.PQSL_VISTABILBPU4_RECOSTANDEFI,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTABILBPU4, 0);
  }

  private static void Init_PQRY_VISTABILBPU3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTABILBPU3, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTABILBPU3, "PQRY_VISTABILBPU3");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECRISCODINT, "RECRISCODINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECRISCODINT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECDESRICOIN, "RECDESRICOIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECDESRICOIN,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORAGGUOES, "RECORAGGUOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORAGGUOES,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORAGGTITO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECRAGRICOIN, "RECRAGRICOIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECRAGRICOIN,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_PREVISIONE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_STN_INI_CO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_VARIAZIONI_CO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECOSTANDEFI, "RECOSTANDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU3,IMDBDef12.PQSL_VISTABILBPU3_RECOSTANDEFI,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTABILBPU3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerUnitaDiGestione(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerUnitaDiGestione()
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
    FormIdx = MyGlb.FRM_PREPERUNDIGE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A9E51A02-A02E-448F-A41C-FD5CCE121A90";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 508;
    DesignHeight = 330;
    set_Caption(new IDVariant("Previsioni Per Unita Di Gestione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 508;
    Frames[1].Height = 304;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per UO Gestione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 304;
    PAN_PREVPERUOGES = new IDPanel(w, this, 1, "PAN_PREVPERUOGES");
    Frames[1].Content = PAN_PREVPERUOGES;
    PAN_PREVPERUOGES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVPERUOGES.VS = MainFrm.VisualStyleList;
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 508-MyGlb.PAN_OFFS_X, 304-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C5E6E0B7-EF8F-4A3A-A011-6B8D093D8015");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVPERUOGES.InitStatus = 2;
    PAN_PREVPERUOGES_Init();
    PAN_PREVPERUOGES_InitFields();
    PAN_PREVPERUOGES_InitQueries();
    BKW_PRPEUOGECODB = new OBook(this);
    BUK_PRPEUOGECODB = new CIDREObj(BKW_PRPEUOGECODB);
    BKW_PRPEUOGECODB.iGuid = "392D2F1A-D79D-412A-8F21-E7B536A95A04";
    BKW_PRPEUOGECODB.Code = "BUK_PRPEUOGECODB";
    BKW_PRPEUOGECODB.BookObj = BUK_PRPEUOGECODB;
    BKW_PRPEUOGECODB.InitDefMasks();
    BUK_PRPEUOGECODB.InitBook(1, 3342593, "Previsioni Per UO Gestione Con Dettagli Book", IMDB, MainFrm.VisualStyleList);
    BUK_PRPEUOGECODB.InitHTML();
    BUK_PRPEUOGECODB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PRPEUOGECODB.Book.SetMainFrm(MainFrm);
    BUK_PRPEUOGECODB.SetRTCGuid(0, "392D2F1A-D79D-412A-8F21-E7B536A95A04");
    BUK_PRPEUOGECODB.SetObjCode(0, "PRPEUOGECODB");
    BUK_PRPEUOGECODB_MST_STPRPEUOGEPA_Init();
    BUK_PRPEUOGECODB_RPT_PREPERUOGERE_Init();
    BUK_PRPEUOGECODB_InitLinks();
    BKW_PRPEUOGESEDB = new OBook(this);
    BUK_PRPEUOGESEDB = new CIDREObj(BKW_PRPEUOGESEDB);
    BKW_PRPEUOGESEDB.iGuid = "FAE35B68-10D5-489F-B574-AF8613F91B7D";
    BKW_PRPEUOGESEDB.Code = "BUK_PRPEUOGESEDB";
    BKW_PRPEUOGESEDB.BookObj = BUK_PRPEUOGESEDB;
    BKW_PRPEUOGESEDB.InitDefMasks();
    BUK_PRPEUOGESEDB.InitBook(1, 3342593, "Previsioni Per UO Gestione Senza Dettagli Book", IMDB, MainFrm.VisualStyleList);
    BUK_PRPEUOGESEDB.InitHTML();
    BUK_PRPEUOGESEDB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PRPEUOGESEDB.Book.SetMainFrm(MainFrm);
    BUK_PRPEUOGESEDB.SetRTCGuid(0, "FAE35B68-10D5-489F-B574-AF8613F91B7D");
    BUK_PRPEUOGESEDB.SetObjCode(0, "PRPEUOGESEDB");
    BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA_Init();
    BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_Init();
    BUK_PRPEUOGESEDB_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI399, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREPERUNDIGE_PAR112();
      }
      PAN_PREVPERUOGES.UpdatePanel(MainFrm);
      // BUK_PRPEUOGECODB.UpdateBook();
      // BUK_PRPEUOGESEDB.UpdateBook();
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
    if (Code.equals("BUK_PRPEUOGECODB")) return BUK_PRPEUOGECODB;
    if (Code.equals("BUK_PRPEUOGESEDB")) return BUK_PRPEUOGESEDB;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof PrevisioniPerUnitaDiGestione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerUnitaDiGestione.class.getName() : (Glb.ClassWithPackage(PrevisioniPerUnitaDiGestione.class) ? PrevisioniPerUnitaDiGestione.class.getName().substring(PrevisioniPerUnitaDiGestione.class.getPackage().getName().length() + 1) : PrevisioniPerUnitaDiGestione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARADETTCAPI, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
        {
          RiposizionaColonneDettagli();
        }
        else
        {
          RipristinaPosizioneColonneDettagli();
        }
        VisualizzazioneBoxImportiConDettagli();
        BUK_PRPEUOGECODB.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_PRPEUOGECODB.RefreshQuery();
        BUK_PRPEUOGECODB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_PRPEUOGECODB.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
        {
          RiposizionaColonneSenzaDettagli();
        }
        else
        {
          RipristinaPosizioneColonneSenzaDettagli();
        }
        VisualizzazioneBoxImportiSenzaDettagli();
        BUK_PRPEUOGESEDB.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_PRPEUOGESEDB.RefreshQuery();
        BUK_PRPEUOGESEDB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_PRPEUOGESEDB.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riposiziona Colonne Dettagli
  // **********************************************************************
  public int RiposizionaColonneDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riposiziona Colonne Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RiposizionaColonneDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ripristina Posizione Colonne Dettagli
  // **********************************************************************
  public int RipristinaPosizioneColonneDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ripristina Posizione Colonne Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RipristinaPosizioneColonneDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Previsione Con Dettagli
  // **********************************************************************
  public int VisualizzaPrevisioneConDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Previsione Con Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzaPrevisioneConDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nascodi Previsione Con Dettagli
  // **********************************************************************
  public int NascodiPrevisioneConDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nascodi Previsione Con Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "NascodiPrevisioneConDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Variazioni Con Dettagli
  // **********************************************************************
  public int VisualizzaVariazioniConDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Variazioni Con Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzaVariazioniConDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nascondi Variazioni Con Dettagli
  // **********************************************************************
  public int NascondiVariazioniConDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nascondi Variazioni Con Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "NascondiVariazioniConDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizzazione Box Importi Con Dettagli
  // **********************************************************************
  public int VisualizzazioneBoxImportiConDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizzazione Box Importi Con Dettagli Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
        {
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
          {
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, IDREGlb.RECT_WIDTH)))).dblValue());
            BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxVisible(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))).dblValue());
            BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))).dblValue());
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzazioneBoxImportiConDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riposiziona Colonne Senza Dettagli
  // **********************************************************************
  public int RiposizionaColonneSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riposiziona Colonne Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RiposizionaColonneSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ripristina Posizione Colonne Senza Dettagli
  // **********************************************************************
  public int RipristinaPosizioneColonneSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ripristina Posizione Colonne Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RipristinaPosizioneColonneSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Previsione Senza Dettagli
  // **********************************************************************
  public int VisualizzaPrevisioneSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Previsione Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzaPrevisioneSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nascodi Previsione Senza Dettagli
  // **********************************************************************
  public int NascodiPrevisioneSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nascodi Previsione Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "NascodiPrevisioneSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Variazioni Senza Dettagli
  // **********************************************************************
  public int VisualizzaVariazioniSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Variazioni Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzaVariazioniSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nascondi Variazioni Senza Dettagli
  // **********************************************************************
  public int NascondiVariazioniSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nascondi Variazioni Senza Dettagli Body
      // Procedure Body
      // 
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "NascondiVariazioniSenzaDettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizzazione Box Importi Senza Dettagli
  // **********************************************************************
  public int VisualizzazioneBoxImportiSenzaDettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizzazione Box Importi Senza Dettagli Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
        {
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
          {
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
            BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxVisible(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))).dblValue());
            BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOGESEDB.BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))).dblValue());
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "VisualizzazioneBoxImportiSenzaDettagli", _e);
      return -1;
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (!(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
      {
        IDVariant v_DESCUOSUP = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
        SQL.append("from ");
        SQL.append("  SO4_SUST_ENTI A ");
        SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCUOSUP = QV.Get("SUSTENTIDESC", IDVariant.STRING) ;
        }
        QV.Close();
        PAN_PREVPERUOGES.set_Header(Glb.OBJ_FIELD,PFL_PREVPERUOGES_UOSUPERIORE, new IDVariant(v_DESCUOSUP).stringValue());
        PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        MainFrm.RiempiCF4WEBSTRUTTURA((new IDVariant()));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADABILSIM, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADETTCAPI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADESCINTE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARTOTPERTIT, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMVARIAZI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARPREANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMUOSUPER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO28, IMDBDef3.FLD_PARAMETRIO28_PARAUOSUPOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMUOGESTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAPREVEURO, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per UO Gestione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVPERUOGES_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVPERUOGES);
      // 
      // Previsioni Per UO Gestione On Dynamic Properties Event Body
      // Procedure Body
      // 
      if ((PAN_PREVPERUOGES.bFields(PFL_PREVPERUOGES_UOSUPERIORE).IsVisible(PAN_PREVPERUOGES.AttR) && PAN_PREVPERUOGES.bFields(PFL_PREVPERUOGES_UOSUPERIORE).IsPresent()))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMUOSUPER, 0)))
        {
          PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARADETTCAPI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVPERUOGES.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "PrevisioniPerUOGestioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per UO Gestione On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVPERUOGES_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per UO Gestione On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PREVPERUOGES_UOSUPERIORE)), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMUOSUPER, 0).compareTo(IMDB.Value(IMDBDef3.TBL_PARAMETRIO28, IMDBDef3.FLD_PARAMETRIO28_PARAUOSUPOLD, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMUOGESTI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO28, IMDBDef3.FLD_PARAMETRIO28_PARAUOSUPOLD, 0, IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMUOSUPER, 0));
          MainFrm.RiempiCF4WEBSTRUTTURA(IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMUOSUPER, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "PrevisioniPerUOGestioneOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento UO ES Group Header Con Dettagli Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PRPEUOGECODB_SEC_RAGUOESGROHE_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggruppamento UO ES Group Header Con Dettagli Before Formatting Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARTOTPERTIT, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOGECODB.set_SectionVisible(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaPrevisioneConDettagli();
      }
      else
      {
        NascodiPrevisioneConDettagli();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaVariazioniConDettagli();
      }
      else
      {
        NascondiVariazioniConDettagli();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RaggruppamentoUOESGroupHeaderConDettagliBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Con Dettagli After Formatting Event
  // **********************************************************************
  private void BUK_PRPEUOGECODB_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Con Dettagli After Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).compareTo((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, IDREGlb.RECT_HEIGHT))), true)!=0)
      {
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VOCEPEG, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXCODBILDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXDESUOUTDE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXDESVOPEDE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXPREVIDET1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOGECODB.set_BoxRect(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "DetailConDettagliAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento UO ES Group Header Senza Dettagli Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggruppamento UO ES Group Header Senza Dettagli Before Formatting Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARTOTPERTIT, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOGESEDB.set_SectionVisible(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaPrevisioneSenzaDettagli();
      }
      else
      {
        NascodiPrevisioneSenzaDettagli();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaVariazioniSenzaDettagli();
      }
      else
      {
        NascondiVariazioniSenzaDettagli();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RaggruppamentoUOESGroupHeaderSenzaDettagliBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento Risorsa Cod Intervento Group Header Senza Dettagli After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_PRPEUOGESEDB_SEC_RARICOINGRHE_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggruppamento Risorsa Cod Intervento Group Header Senza Dettagli After Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_PRPEUOGECODB.SectionHeight(BUK_PRPEUOGECODB_SEC_DETAIL))).compareTo((new IDVariant(BUK_PRPEUOGECODB.BoxRect(BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, IDREGlb.RECT_HEIGHT))), true)!=0)
      {
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXCODICDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXDESCRDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXPREVIDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOGESEDB.set_BoxRect(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOGESEDB.SectionHeight(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiGestione", "RaggruppamentoRisorsaCodInterventoGroupHeaderSenzaDettagliAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREPERUNDIGE_PAR112() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR112_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI399, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI399, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR112_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR112_RS, 0, IMDBDef3.TBL_PARAMETRI399, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 0, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 1, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMUOSUPER, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 2, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMUOGESTI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 3, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADABILSIM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 4, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADETTCAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 5, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARADESCINTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 6, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARTOTPERTIT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 7, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARAMVARIAZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR112_RS, 8, 0, IMDBDef3.TBL_PARAMETRI399, IMDBDef3.FLD_PARAMETRI399_PARPREANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI399, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI399, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI399, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR112_RS, 0);
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
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
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
  private void PAN_PREVPERUOGES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVPERUOGES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVPERUOGES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVPERUOGES, Cancel);
    // Stub
  }

  private void PAN_PREVPERUOGES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVPERUOGES_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVPERUOGES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVPERUOGES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVPERUOGES_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVPERUOGES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVPERUOGES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_PRPEUOGECODB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PRPEUOGECODB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOGECODB_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_RAGUOESGROHE)
    {
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU2, new IDVariant(IDL.Add(IDL.Add(BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))))));
      BUK_PRPEUOGECODB_SEC_RAGUOESGROHE_OnFormattingSection();
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_RAGTITGROHEA)
    {
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU3, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), ((IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARTOTPERTIT, 0).equals((new IDVariant("SI"))))?IDL.Add((new IDVariant(" - ")), ((BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "DESCRIZIONE"))):(new IDVariant())))));
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_RAGTITGROFOO)
    {
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUPP1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGTITGROFOO,"PREVISIONE")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUSI1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGTITGROFOO,"STN_INI_CO")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUVC1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGTITGROFOO,"VARIAZIONI_CO")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RTGFSRSDPPU1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGTITGROFOO,"RECOSTANDEFI")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_CTIERVBUTPP1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), ((BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_PRPEUOGECODB.GetReportColumn(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "TITOLO")))))));
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_RAGUOESGROFO)
    {
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUP1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGUOESGROFO,"PREVISIONE")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUS1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGUOESGROFO,"STN_INI_CO")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUV1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGUOESGROFO,"VARIAZIONI_CO")));
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_RUEGFSRSDPP1, new IDVariant(BUK_PRPEUOGECODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGECODB_SEC_RAGUOESGROFO,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_PRPEUOGECODB_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PRPEUOGECODB_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOGECODB_SEC_DETAIL)
    {
      BUK_PRPEUOGECODB_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_PRPEUOGECODB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PRPEUOGECODB_MST_STPRPEUOGEPA)
    {
      BUK_PRPEUOGECODB.set_SpanValue(BUK_PRPEUOGECODB_SPAN_CPTSPPUGCDBP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOGECODB.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOGECODB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PRPEUOGECODB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PRPEUOGECODB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PRPEUOGECODB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PRPEUOGECODB_OnPreview()
  {
    PreviewBook = BKW_PRPEUOGECODB;
    SetRD();
  }

  private void BUK_PRPEUOGESEDB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PRPEUOGESEDB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOGESEDB_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPU1, new IDVariant(IDL.Add(IDL.Add(BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))))));
      BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE_OnFormattingSection();
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPUG, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), ((IMDB.Value(IMDBDef12.PQRY_PAR112, IMDBDef12.PQSL_PAR112_PARTOTPERTIT, 0).equals((new IDVariant("SI"))))?IDL.Add((new IDVariant(" - ")), ((BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "DESCRIZIONE"))):(new IDVariant())))));
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RARICOINGRHE)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUP, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RARICOINGRHE,"PREVISIONE")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUS, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RARICOINGRHE,"STN_INI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUV, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RARICOINGRHE,"VARIAZIONI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRSDPP, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RARICOINGRHE,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RARICOINGRFO)
    {
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUPPP, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO,"PREVISIONE")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUSIC, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO,"STN_INI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUVCP, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO,"VARIAZIONI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RTGFSRSDPPUD, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO,"RECOSTANDEFI")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_CTIERVBUTPPU, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), ((BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_PRPEUOGESEDB.GetReportColumn(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "TITOLO")))))));
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUPP, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO,"PREVISIONE")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUSI, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO,"STN_INI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUVC, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO,"VARIAZIONI_CO")));
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_RUEGFSRSDPPU, new IDVariant(BUK_PRPEUOGESEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_PRPEUOGESEDB_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PRPEUOGESEDB_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOGESEDB_SEC_RARICOINGRHE)
    {
      BUK_PRPEUOGESEDB_SEC_RARICOINGRHE_OnAfterFormattingSection();
    }
  }

  private void BUK_PRPEUOGESEDB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA)
    {
      BUK_PRPEUOGESEDB.set_SpanValue(BUK_PRPEUOGESEDB_SPAN_CPTSPPUGSDBP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOGESEDB.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOGESEDB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PRPEUOGESEDB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PRPEUOGESEDB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PRPEUOGESEDB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PRPEUOGESEDB_OnPreview()
  {
    PreviewBook = BKW_PRPEUOGESEDB;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVPERUOGES_Init()
  {

    PAN_PREVPERUOGES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVPERUOGES.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, "0FAB08FD-6217-4513-8D75-FDB7756EA3DB");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, "Parte");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, MyGlb.PANEL_FORM, 12, 7, 428, 49, 0, 0);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, 0, 31);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, 1, 13);
    PAN_PREVPERUOGES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, 0, 4);
    PAN_PREVPERUOGES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, 1, 4);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVPERUOGES_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVPERUOGES.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, "378CD60E-462F-4C7A-8494-EC31A98A41D2");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, "U.O. Superiore");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, "1AD2DAFD-5EA0-4868-9843-1B2C45BB4880");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, "U. O. Gestione");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, "BCC2FBD8-3C72-49FF-B747-B6F738F333A0");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, "2EB83B62-4ABC-4EE2-8653-5B125DA25608");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, "79B37D18-7B7E-4EEC-B0B4-1FF18557E239");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, "Descrizioni Intervernto");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, "C0E045D4-8709-4357-B0D9-10ED03D747C5");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, "0AD9C7D5-2921-472C-8AAD-6D0EBF9FF762");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, "Variazioni");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, "9CD2DBFE-1E09-4650-A6F6-5241F328021E");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, "C6E86726-E8A8-46EE-8375-144F9F9D2E31");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, "Parte");
    PAN_PREVPERUOGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, "FABCC6E5-22A1-4AEC-BF42-CC23446C58E6");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, "");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PREVPERUOGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, "CA353818-21CF-45B0-B6F0-4482FBC560EC");
    PAN_PREVPERUOGES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, "Elabora");
    PAN_PREVPERUOGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVPERUOGES.SetImage(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, 0, "button1.gif", false);
    PAN_PREVPERUOGES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVPERUOGES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_LIST, 72, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_LIST, 36);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_LIST, "U O Super.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_FORM, 4, 64, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOSUPERIORE, MyGlb.PANEL_FORM, "U.O. Superiore");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_UOSUPERIORE, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_UOSUPERIORE, PPQRY_PAR112, "A.PARAMUOSUPER", "PARAMUOSUPER", 1, 8, 0, -13997);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_LIST, 200, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_LIST, 48);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_LIST, "U. O. Gestione");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_FORM, 4, 88, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_UOGESTIONE, MyGlb.PANEL_FORM, "U. O. Gestione");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_UOGESTIONE, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_UOGESTIONE, PPQRY_PAR112, "A.PARAMUOGESTI", "PARAMUOGESTI", 1, 8, 0, -13997);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_FORM, 16, 116, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_FORM, 140);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_DABILANSIMUL, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_DABILANSIMUL, PPQRY_PAR112, "A.PARADABILSIM", "PARADABILSIM", 5, 1, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DABILANSIMUL, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DABILANSIMUL, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_FORM, 16, 140, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_FORM, 140);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_DETTAGCAPITO, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_DETTAGCAPITO, PPQRY_PAR112, "A.PARADETTCAPI", "PARADETTCAPI", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Inter.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_FORM, 264, 140, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizioni Intervernto");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_DESCRIINTERV, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_DESCRIINTERV, PPQRY_PAR112, "A.PARADESCINTE", "PARADESCINTE", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_FORM, 16, 164, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_FORM, 140);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_TOTALPERTITO, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_TOTALPERTITO, PPQRY_PAR112, "A.PARTOTPERTIT", "PARTOTPERTIT", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_FORM, 16, 188, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_FORM, 140);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_VARIAZIONI, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_VARIAZIONI, PPQRY_PAR112, "A.PARAMVARIAZI", "PARAMVARIAZI", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_FORM, 264, 188, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_PREVANNINCOR, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_PREVANNINCOR, PPQRY_PAR112, "A.PARPREANINCO", "PARPREANINCO", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_FORM, 156, 32, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_PARTE, -1, GRP_PREVPERUOGES_PARTE);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_PARTE, PPQRY_PAR112, "A.PARAMPARTE", "PARAMPARTE", 5, 2, 0, -13997);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVPERUOGES.SetValueListItem(PFL_PREVPERUOGES_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_LIST, 8, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_FORM, 16, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_PARTELABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_PARTELABELDX, -1, GRP_PREVPERUOGES_PARTE);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_PARTELABELDX, -1, "", "PARTELABELDX", 0, 0, 0, -13997);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_LIST, 248, 244, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOGES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_FORM, 360, 244, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVPERUOGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOGES_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOGES.SetFieldPage(PFL_PREVPERUOGES_ELABORA, -1, -1);
    PAN_PREVPERUOGES.SetFieldPanel(PFL_PREVPERUOGES_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVPERUOGES_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVPERUOGES.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as ANAUNIORGORD, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOSUPER~~) ");
    SQL.append("and   (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUOSUPER~~ = to_number(NULL)) ");
    SQL.append("order by 2 ");
    PAN_PREVPERUOGES.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_PREVPERUOGES_UOSUPERIORE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as ANAUNIORGORD, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PREVPERUOGES.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_PREVPERUOGES_UOSUPERIORE, "");
    PAN_PREVPERUOGES.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as CF4WSTRUORDI, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOGESTI~~) ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   ((A.PROGR_UNITA_PADRE = ~~PARAMUOSUPER~~) AND NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.DES_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DES_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOGESTI~~) ");
    SQL.append("and   (B.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~PARAMUOGESTI~~ = to_number(NULL)) ");
    SQL.append("order by 2 ");
    PAN_PREVPERUOGES.SetQuery(PPQRY_CF4WEBSTRUTT, 0, SQL, PFL_PREVPERUOGES_UOGESTIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as CF4WSTRUORDI, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   ((A.PROGR_UNITA_PADRE = ~~PARAMUOSUPER~~) AND NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.DES_UNITA_ORGANIZZATIVA, ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DES_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE B ");
    SQL.append("where (B.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 2 ");
    PAN_PREVPERUOGES.SetQuery(PPQRY_CF4WEBSTRUTT, 1, SQL, PFL_PREVPERUOGES_UOGESTIONE, "");
    PAN_PREVPERUOGES.SetQueryDB(PPQRY_CF4WEBSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVPERUOGES.SetIMDB(IMDB, "PQRY_PAR112", true);
    PAN_PREVPERUOGES.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PREVPERUOGES.SetQueryIMDB(PPQRY_PAR112, IMDBDef12.PQRY_PAR112_RS, IMDBDef3.TBL_PARAMETRI399);
    JustLoaded = true;
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_UOSUPERIORE, IMDBDef3.FLD_PARAMETRI399_PARAMUOSUPER);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_UOGESTIONE, IMDBDef3.FLD_PARAMETRI399_PARAMUOGESTI);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI399_PARADABILSIM);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_DETTAGCAPITO, IMDBDef3.FLD_PARAMETRI399_PARADETTCAPI);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_DESCRIINTERV, IMDBDef3.FLD_PARAMETRI399_PARADESCINTE);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_TOTALPERTITO, IMDBDef3.FLD_PARAMETRI399_PARTOTPERTIT);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_VARIAZIONI, IMDBDef3.FLD_PARAMETRI399_PARAMVARIAZI);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_PREVANNINCOR, IMDBDef3.FLD_PARAMETRI399_PARPREANINCO);
    PAN_PREVPERUOGES.SetFieldPrimaryIndex(PFL_PREVPERUOGES_PARTE, IMDBDef3.FLD_PARAMETRI399_PARAMPARTE);
    PAN_PREVPERUOGES.SetMasterTable(0, "PARAMETRI399");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVPERUOGES.Status() == 2)
    {
      int oldListQBE = PAN_PREVPERUOGES.iUseListQBE;
      PAN_PREVPERUOGES.iUseListQBE = 0;
      PAN_PREVPERUOGES.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVPERUOGES.PanelCommand(Glb.PCM_FIND);
      PAN_PREVPERUOGES.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_PRPEUOGECODB_MST_STPRPEUOGEPA_Init()
  {
    BUK_PRPEUOGECODB.InitMastro(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, "2512D149-E85B-4F16-944B-0662A85B1A64");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, "STPRPEUOGEPA");
    BUK_PRPEUOGECODB.InitMastroBox(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, BUK_PRPEUOGECODB_RPTBOX_NUMEROPAGIN1, 26100, 300, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_NUMEROPAGIN1, "0276F785-3CF0-47FB-BD81-01B1B357D16A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_NUMEROPAGIN1, BUK_PRPEUOGECODB_SPAN_CPTSPPUGCDBP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_CPTSPPUGCDBP, "9A9E5B1C-60CA-47DA-9FB9-95FDC9F154BC");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_CPTSPPUGCDBP, "CPTSPPUGCDBP");
    BUK_PRPEUOGECODB.InitMastroBox(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, BUK_PRPEUOGECODB_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1900, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_PAGEHEADER1, "7BE8068A-9721-4BAD-BDC3-AEF764B5BC3D");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_PRPEUOGECODB.InitMastroBox(BUK_PRPEUOGECODB_MST_STPRPEUOGEPA, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1, 1000, 3100, 27700, 16500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1, "1E0A4A16-DDCF-480C-B8C1-978928D5AFA9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_PRPEUOGECODB_RPT_PREPERUOGERE_InitQuery() { BUK_PRPEUOGECODB_RPT_PREPERUOGERE_InitQuery(true, true); }
  private void BUK_PRPEUOGECODB_RPT_PREPERUOGERE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  TO_CHAR ( A.RISORSA_INTERVENTO ) || ' - ' || TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as RECORVOCEPEG, ");
      SQL.append("  DECODE(A.E_S, 'S', DECODE(A.ARTICOLO, 0, DECODE(A.CAPITOLO, 0, NULL, DECODE(~~PQRY_PAR112.PARADESCINTE~~, 'SI', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0) || ' - ', NULL)), DECODE(~~PQRY_PAR112.PARADESCINTE~~, 'SI', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0) || ' - ', NULL)), NULL) || A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as RECDESVOCPEG, ");
      SQL.append("  LPAD(TO_CHAR ( A.RISORSA_INTERVENTO ), 7, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.CAPITOLO ), 6, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) as RECORDVOCPEG, ");
      SQL.append("  TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || TO_CHAR ( A.E_S ) as RECORAGGUOES, ");
      SQL.append("  DECODE(~~PQRY_PAR112.PARTOTPERTIT~~, 'SI', DECODE(A.RISORSA_INTERVENTO, 0, DECODE(A.E_S, 'E', DECODE(A.CAPITOLO, 9999999999999998.0, 9999999999999998.0, DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999, A.TITOLO)), DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999 + 1, A.TITOLO)), A.TITOLO), to_number(NULL)) as RECORAGGTITO, ");
      SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORDESCRUO, ");
      SQL.append("  A_GET_CODICE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as RECOCODIBILA, ");
      SQL.append("  DECODE(GET_UO_UTILIZZO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )), NULL, NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))) as RECODESUOUTI, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  NVL(A.PREVISIONE, 0) as PREVISIONE, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) as STN_INI_CO, ");
      SQL.append("  NVL(A.VARIAZIONI_CO, 0) as VARIAZIONI_CO, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) as RECOSTANDEFI ");
      SQL.append("from ");
      SQL.append("  VISTA_BILBPR_UO A, ");
      SQL.append("  TITOLI B ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.TIPO_BILANCIO = ~~PQRY_PAR112.PARADABILSIM~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_PAR112.PARAMPARTE~~ OR ~~PQRY_PAR112.PARAMPARTE~~ = 'ES') ");
      SQL.append("and   ((~~PQRY_PAR112.PARAMUOSUPER~~ IS NULL) OR (GET_UO_SUP(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) = ~~PQRY_PAR112.PARAMUOSUPER~~)) ");
      SQL.append("and   ((~~PQRY_PAR112.PARAMUOGESTI~~ IS NULL) OR (A.PROGR_UNITA_ORGANIZZATIVA = ~~PQRY_PAR112.PARAMUOGESTI~~)) ");
      SQL.append("and   (B.E_S(+) = A.E_S) ");
      SQL.append("and   (B.TITOLO(+) = A.TITOLO) ");
      SQL.append("order by 4, 5, 3 ");
      BUK_PRPEUOGECODB.SetReportQuery(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "F3118779-8B0E-4EC8-993A-2FF3D9680F63");
      if (BUK_PRPEUOGECODB.FindObjByID(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE) != null)
        BUK_PRPEUOGECODB.AddReportGroup(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, "RECORAGGUOES");
      if (BUK_PRPEUOGECODB.FindObjByID(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA) != null)
        BUK_PRPEUOGECODB.AddReportGroup(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, "RECORAGGTITO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PRPEUOGECODB_RPT_PREPERUOGERE_Init()
  {
    BUK_PRPEUOGECODB.InitReport(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, 196865);
    BUK_PRPEUOGECODB_RPT_PREPERUOGERE_InitQuery(true, false);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "407FE740-9F8C-452D-AA77-B8DCFCC4F487");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, "PREPERUOGERE");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_REPORTHEADER, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_REPORTHEADER, "4FBDAC1F-D07A-4DFA-BD7B-68E8E13B3ADF");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_PAGEHEADER, BUK_PRPEUOGECODB_RPTBOX_PAGEHEADER1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_PAGEHEADER, "5B27ACC3-2FCF-4905-9284-759C323463F6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_PAGEHEADER, BUK_PRPEUOGECODB_RPTBOX_RAGGRUPPAPE1, 100, 200, 27500, 1000, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_RAGGRUPPAPE1, "E047D3CF-F010-4F70-9E15-F699BFEAE73C");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_RAGGRUPPAPE1, "RAGGRUPPAPE1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_RAGGRUPPAPE1, BUK_PRPEUOGECODB_SPAN_RAGGPERUOGE1, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Previsioni per U.O. Gestione", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RAGGPERUOGE1, "59915BD1-D6CD-404B-9DBC-C83B62CCF7DA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RAGGPERUOGE1, "RAGGPERUOGE1");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGUOES");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, "28423FAE-B454-49C1-8A83-617063A45AB0");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, "RAGUOESGROHE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_DESCRIZIONU2, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCRIZIONU2, "CC3C1D1D-7261-436F-B151-61B9F124DD63");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCRIZIONU2, "DESCRIZIONU2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCRIZIONU2, BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU2, MyGlb.VIS_HEADSENZBOR1, 5, 201, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU2, "A5BAC41A-AE6F-4EEF-9BDB-2903B30CDDB7");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU2, "RDUPPUDGPPU2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOVOPEUOESGH, 0, 1000, 3400, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOVOPEUOESGH, "F32A4D1A-953B-4853-9216-8F34C2973449");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOVOPEUOESGH, "BOVOPEUOESGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD2, 100, 1200, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD2, "170BB85D-803C-4868-9A35-0C1CFD0ED909");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD2, "VOCEPEGHEAD2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD2, BUK_PRPEUOGECODB_SPAN_VOCEPEG2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Voce Peg", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_VOCEPEG2, "AC949CC2-FC91-47B4-9C83-B8EA6FCF1CA4");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_VOCEPEG2, "VOCEPEG2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOCOBIUOESGH, 3400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOCOBIUOESGH, "A7354D44-D085-485D-A049-B207A54D4CEC");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOCOBIUOESGH, "BOCOBIUOESGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEA1, 3500, 1200, 2700, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEA1, "AB2EA28F-1C10-4916-983D-CA4E69A527F3");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEA1, "CODIBILAHEA1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEA1, BUK_PRPEUOGECODB_SPAN_CODICEBILAN1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Bilancio", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_CODICEBILAN1, "66EA435E-2838-4917-8477-C775CEEAEE41");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_CODICEBILAN1, "CODICEBILAN1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BODEUOUTUEGH, 6600, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BODEUOUTUEGH, "9DB583E8-61CE-452A-9840-02FD3E1C575B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BODEUOUTUEGH, "BODEUOUTUEGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHE1, 6700, 1200, 3000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHE1, "C314EBCB-5893-4327-8A1B-D98BBA557522");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHE1, "DESCUOUTIHE1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHE1, BUK_PRPEUOGECODB_SPAN_DESCRUOUTIL1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "U.O. Utilizzo", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_DESCRUOUTIL1, "C5E1B043-215C-46C4-86EB-6ED2AFBDE621");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BODEVOPEUEGH, 9800, 1000, 5000, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BODEVOPEUEGH, "B8AA3FA9-AD69-4481-B667-58B59846FD64");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BODEVOPEUEGH, "BODEVOPEUEGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE2, 9900, 1200, 4800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE2, "4E028DE4-7098-41BA-90A0-570D2F26D207");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE2, "DESVOCPEGHE2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE2, BUK_PRPEUOGECODB_SPAN_DESCRIZIONE2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_DESCRIZIONE2, "F473947E-A69A-46B9-92F9-F2CF0B083392");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRH1, 14800, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRH1, "6ED9A249-7E4A-4B05-A714-85BBD6520C58");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRH1, "BOPRUOESGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, 14800, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, "1B1D8582-10DB-4651-A72D-B7792800379B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, "PREVISHEADE2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE2, BUK_PRPEUOGECODB_SPAN_PREVISIONE2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione ", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_PREVISIONE2, "43C4E6A7-FBDE-4878-9A78-A70EDB01F7BE");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_PREVISIONE2, "PREVISIONE2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, 18000, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, "D5C50842-C568-44DF-9C18-CBF4FD944563");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTINUOESG1, "BOSTINUOESG1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, 18000, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, "DF1AA1C2-8C62-4504-9531-D3043D70A1EA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, "STANINIZHEA2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA2, BUK_PRPEUOGECODB_SPAN_STANZIINIZI2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_STANZIINIZI2, "4513F18E-5D8E-4B45-ABF5-4138C16DD575");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_STANZIINIZI2, "STANZIINIZI2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, "9BF36A36-AD2D-48F5-BF75-8C46DD1CEEAB");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOVAUOESGRH1, "BOVAUOESGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, "0FEA0C17-907A-4C61-8C04-06151F52B88C");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, "VARIAZHEADE2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE2, BUK_PRPEUOGECODB_SPAN_VARIAZIONI2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_VARIAZIONI2, "D26496CB-EF3C-4618-B673-D68FFE52683B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_VARIAZIONI2, "VARIAZIONI2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, "8548EC6A-53B3-423E-9CB1-DFDD028F3D8A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG1, "BOSTDEUOESG1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, "283ADED3-3FEE-4322-9880-A010A9EA063B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, "STANDEFIHEA2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA2, BUK_PRPEUOGECODB_SPAN_STANZIDEFIN2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_STANZIDEFIN2, "D4A765CB-FC13-4949-BF4E-FB08AB4B90D6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_STANZIDEFIN2, "STANZIDEFIN2");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGTITO");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, "2FFF209E-E119-4504-A91E-7AF3FCB19B5F");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, "RAGTITGROHEA");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_DESCRUOTITOL, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCRUOTITOL, "0F8AB954-4F91-48E6-87CE-AF0F7BE4310C");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCRUOTITOL, "DESCRUOTITOL");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCRUOTITOL, BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU3, MyGlb.VIS_HEADSENZBOR1, 5, 300, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU3, "D758F940-2666-4FAC-A5E0-A40805F80AA1");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RDUPPUDGPPU3, "RDUPPUDGPPU3");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOVOPETIGRHE, 0, 1000, 3400, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOVOPETIGRHE, "8F545B3A-FB3D-4108-BFAA-EC13EFB160DF");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOVOPETIGRHE, "BOVOPETIGRHE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD3, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD3, "8FA7436E-389C-41CB-B1CB-65B47EE01CBD");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD3, "VOCEPEGHEAD3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VOCEPEGHEAD3, BUK_PRPEUOGECODB_SPAN_VOCEPEG3, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Voce Peg", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_VOCEPEG3, "951EBCA1-28F8-405B-83C6-02B8FF5DA1C6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_VOCEPEG3, "VOCEPEG3");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOCOBITIGRHE, 3400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOCOBITIGRHE, "46FD76EA-4894-4FD3-934B-1148522FBCC1");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOCOBITIGRHE, "BOCOBITIGRHE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEAD, 3500, 1200, 2700, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEAD, "D971EAA3-186A-4F87-BA45-7E1792EF4187");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEAD, "CODIBILAHEAD");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_CODIBILAHEAD, BUK_PRPEUOGECODB_SPAN_CODICEBILANC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Bilancio", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_CODICEBILANC, "64298690-ED37-4887-AD89-84984DDE7722");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_CODICEBILANC, "CODICEBILANC");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BODEUOUTTIGH, 6600, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BODEUOUTTIGH, "0661A209-8BB0-43DC-9BA9-1DDF10C1F4C4");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BODEUOUTTIGH, "BODEUOUTTIGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHEA, 6700, 1200, 3000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHEA, "C903DCA9-8096-4FEE-BBE0-69F36580F00E");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHEA, "DESCUOUTIHEA");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCUOUTIHEA, BUK_PRPEUOGECODB_SPAN_DESCRUOUTILI, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "U.O. Utilizzo", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_DESCRUOUTILI, "879BF025-4979-4DF9-9E61-6C3D6463E23B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BODEVOPETIGH, 9800, 1000, 5000, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BODEVOPETIGH, "846C5F1A-C9A6-47CC-BE8A-129CD459FCC5");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BODEVOPETIGH, "BODEVOPETIGH");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE3, 9900, 1200, 4800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE3, "96A988A7-FBC7-4FD1-BA55-EE06AF8910CE");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE3, "DESVOCPEGHE3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESVOCPEGHE3, BUK_PRPEUOGECODB_SPAN_DESCRVOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_DESCRVOCEPEG, "359431DC-2416-42E4-9B3E-B6C2F71E7BF9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRH1, 14800, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRH1, "1C185D7D-616C-4E10-98C4-836303A34B66");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRH1, "BOXPRETIGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, 14800, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, "7282C4D8-9D19-4CD0-98DC-1F901AC4A1A1");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, "PREVISHEADE3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_PREVISHEADE3, BUK_PRPEUOGECODB_SPAN_PREVISIONE3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_PREVISIONE3, "2DE0F229-81C3-4D88-B553-83C550F9AF6E");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_PREVISIONE3, "PREVISIONE3");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, 18000, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, "C74A8B3A-A6A5-46F4-8E50-BCAE3BA9E1CB");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTINTIGRH1, "BOSTINTIGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, 18000, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, "76C5B278-676D-42A1-A9E3-8491C0D10ECA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, "STANINIZHEA3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STANINIZHEA3, BUK_PRPEUOGECODB_SPAN_STANZIINIZI3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_STANZIINIZI3, "F6969BCC-7D27-4C8B-85EC-7B8F838A5481");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_STANZIINIZI3, "STANZIINIZI3");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, "F21A4F9A-2390-438B-8582-C1B67F5CAEB2");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXVARTIGRH1, "BOXVARTIGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, "0D25AEB9-567A-4D2E-B736-881B9C1D433A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, "VARIAZHEADE3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VARIAZHEADE3, BUK_PRPEUOGECODB_SPAN_VARIAZIONI3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_VARIAZIONI3, "C8AF7B58-C499-422B-8FD3-7D933621DD62");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_VARIAZIONI3, "VARIAZIONI3");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, "1906DD80-C646-4AA4-A297-E66393558BD6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRH1, "BOSTDETIGRH1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, "64175241-6A79-441C-B695-A848C5CAAF5F");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, "STANDEFIHEA3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STANDEFIHEA3, BUK_PRPEUOGECODB_SPAN_STANZIDEFIN3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_STANZIDEFIN3, "FBEFABE5-FF77-4E14-8242-A698C46C0877");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_STANZIDEFIN3, "STANZIDEFIN3");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_DETAIL, "3B599CE2-031C-4FEE-B396-E0338CCFBAA9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_DETAIL, "DETAIL");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, 0, 0, 3400, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, "7F9F1C78-5290-4B54-8E68-E202EE6A07C9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXVOCPEGDET, "BOXVOCPEGDET");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_VOCEPEG, 100, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VOCEPEG, "209057C7-E920-4998-9EC9-913E2829EC4D");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VOCEPEG, BUK_PRPEUOGECODB_SPAN_RVPPPUDGPPUG, MyGlb.VIS_DEFAREPOSTYL, 5, 303, 0, 271384705, "To String (VISTA BILBPR UO RISORSA INTERVENTO) +c trattino con spazi +c To String (VISTA BILBPR UO CAPITOLO) +c barra con spazi +c To String (VISTA BILBPR UO ARTICOLO)", "::RECORVOCEPEG", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RVPPPUDGPPUG, "C1EC81DF-4283-4F57-A560-B72104EBFF74");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RVPPPUDGPPUG, "RVPPPUDGPPUG");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXCODBILDET, 3400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXCODBILDET, "24DED7FD-ADD2-471C-9E88-A959CA0EA1AD");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXCODBILDET, "BOXCODBILDET");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC, 3500, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC, "5F3E8432-C2FB-480C-8B84-A06B37064EA0");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC, "CODICEBILANC");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_CODICEBILANC, BUK_PRPEUOGECODB_SPAN_RCBPPUDGPPUG, MyGlb.VIS_NORMALA8LEF1, 1, 19, 0, 271384705, "A GET CODICE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, VISTA BILBPR UO CAPITOLO, VISTA BILBPR UO ARTICOLO)", "::RECOCODIBILA", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RCBPPUDGPPUG, "CD3503A6-ACAB-4D5D-8A58-73C874973934");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RCBPPUDGPPUG, "RCBPPUDGPPUG");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXDESUOUTDE, 6600, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXDESUOUTDE, "B466F3B9-196F-4018-92D4-AF62234685D6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXDESUOUTDE, "BOXDESUOUTDE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI, 6700, 100, 3000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI, "4B8BD1BF-AFE3-4C9E-8D81-8240EAB27B9B");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCRUOUTILI, BUK_PRPEUOGECODB_SPAN_RDUUPPUDGPPU, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "GET UO UTILIZZO (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, VISTA BILBPR UO CAPITOLO, VISTA BILBPR UO ARTICOLO, Today ())", "::RECODESUOUTI", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RDUUPPUDGPPU, "032CB9FA-7D96-4191-A4C7-4C5A00CB1857");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RDUUPPUDGPPU, "RDUUPPUDGPPU");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXDESVOPEDE, 9800, 0, 5000, 700, 0, 1, 3, MyGlb.VIS_BOX, 983041, 0, "", 3, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXDESVOPEDE, "8883D7FF-7D68-4311-8B0E-03C478E78DFA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXDESVOPEDE, "BOXDESVOPEDE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG, 9900, 100, 4800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG, "E473C81E-DF37-4A95-B3EF-01B9926CDFBA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_DESCRVOCEPEG, BUK_PRPEUOGECODB_SPAN_RDVPPPUDGPPU, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384961, "If Equal (VISTA BILBPR UO E S, Spesa, If Equal (VISTA BILBPR UO ARTICOLO, Zero, If Equal (VISTA BILBPR UO CAPITOLO, Zero, Null String, If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), Null String)", "::RECDESVOCPEG", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RDVPPPUDGPPU, "F73A7A24-3FF8-42FB-87BC-55883B257276");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RDVPPPUDGPPU, "RDVPPPUDGPPU");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXPREVIDET1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXPREVIDET1, "FF4B107D-1461-41A8-9ABF-06C55B6335CE");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXPREVIDET1, "BOXPREVIDET1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, 14800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, "602AE657-EC99-477B-9F78-6F664C38D4C2");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, "PREVISIONE1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_PREVISIONE1, BUK_PRPEUOGECODB_SPAN_RVBUPPPUDGPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "::PREVISIONE", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RVBUPPPUDGPP, "E7288762-5972-4BAD-A1C5-A964318F3175");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RVBUPPPUDGPP, "RVBUPPPUDGPP");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, "12D90234-E0E0-4037-9F32-999CFBFF057F");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXSTNINCODE, "BOXSTNINCODE");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_STNINICO1, 18000, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, "31CB6B2B-A676-47F6-9F69-0F8AEADB0EE9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, "STNINICO1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STNINICO1, BUK_PRPEUOGECODB_SPAN_RVBUSICPPUDG, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "::STN_INI_CO", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RVBUSICPPUDG, "ABA219E9-B674-4EF7-A2D7-F5FC8BE27B60");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RVBUSICPPUDG, "RVBUSICPPUDG");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, "6C028560-8B6A-44A0-A798-5D6A3F25C602");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXVARICODET, "BOXVARICODET");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, "58888555-EB8F-4F0F-876E-6EBB80E599E9");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, "VARIAZIONIC1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_VARIAZIONIC1, BUK_PRPEUOGECODB_SPAN_RVBUVCPPUDGP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "Brief description of field content.", "::VARIAZIONI_CO", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RVBUVCPPUDGP, "C76C34D0-3987-48F2-A558-DE0BA35EE848");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RVBUVCPPUDGP, "RVBUVCPPUDGP");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, "2A5455E2-50FB-4A42-AB23-D72ECA23E8F8");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXSTADEFDE1, "BOXSTADEFDE1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_DETAIL, BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, "B5F40AEE-D981-4B22-92D0-C2A1FE7AE7B2");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, "STANZIDEFIN1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_STANZIDEFIN1, BUK_PRPEUOGECODB_SPAN_RSDPPUDGPPUG, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "VISTA BILBPR UO STN INI CO + VISTA BILBPR UO VARIAZIONI CO", "::RECOSTANDEFI", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RSDPPUDGPPUG, "66B4189D-F71D-4A69-BBF6-5046B753B25D");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RSDPPUDGPPUG, "RSDPPUDGPPUG");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGTITO");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, "3BDD2E7D-3637-41B3-9947-1D0AF437DB16");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, "RAGTITGROFOO");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, "6C5CFC2D-A962-428A-879C-0483AA0BC542");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOXPRETIGRF1, "BOXPRETIGRF1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, 14800, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, "DF9EB21B-5049-4053-A6E7-B5D49511BDF1");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, "SUOFVIBIUOP2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP2, BUK_PRPEUOGECODB_SPAN_RTGFSRVBUPP1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUPP1, "BC1EE376-FD34-46F2-95B8-D8A726840D2D");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUPP1, "RTGFSRVBUPP1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, "27B3DCD2-1E7A-420F-A35E-A52CADF20FED");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOTIG1, "BOSTINCOTIG1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, 18000, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, "18B40909-8530-4F5C-BFED-3646C432C256");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, "SUOFVIBIUSI2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI2, BUK_PRPEUOGECODB_SPAN_RTGFSRVBUSI1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUSI1, "F0C1461F-7327-4649-9559-FBAF98254813");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUSI1, "RTGFSRVBUSI1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, "EAD3B6A5-CDD8-4152-A407-0458E0BFCD74");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOVACOTIGRF1, "BOVACOTIGRF1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, "46AEA10B-5782-458A-A1E2-99FFCB5D6C00");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, "SUOFVIBIUOV2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV2, BUK_PRPEUOGECODB_SPAN_RTGFSRVBUVC1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUVC1, "C3B66FF6-C032-4B2C-8FE5-46861C27D931");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RTGFSRVBUVC1, "RTGFSRVBUVC1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, "2F3CCE24-6CDB-4407-8498-4FBB2B3549FB");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTDETIGRF1, "BOSTDETIGRF1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, "675A5CDF-5842-45B5-89B4-310000E4B353");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, "SUMOFSTANDE2");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE2, BUK_PRPEUOGECODB_SPAN_RTGFSRSDPPU1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RTGFSRSDPPU1, "9C9C397C-D564-49DD-85CC-9FFB50614590");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RTGFSRSDPPU1, "RTGFSRSDPPU1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_TOTALETITOL1, 7900, 200, 6700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_TOTALETITOL1, "A07DB2EB-CE89-46CA-B70D-1A7014B574C7");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_TOTALETITOL1, "TOTALETITOL1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_TOTALETITOL1, BUK_PRPEUOGECODB_SPAN_CTIERVBUTPP1, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_CTIERVBUTPP1, "7FB0A5C5-EACD-4C8E-839F-2BBAC4DC0D65");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_CTIERVBUTPP1, "CTIERVBUTPP1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGTITGROFOO, BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, 14800, 100, 12900, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, "340DAB00-BB2E-4EE7-9CCB-4EABA7FAD6BF");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BARRTOTATIT1, "BARRTOTATIT1");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGUOES");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, "34E8802D-9812-49DE-99DA-B2B1D9839071");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, "RAGUOESGROFO");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, "7E5B8C6A-9CBA-4B1E-9753-0896678440CC");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOPRUOESGRF1, "BOPRUOESGRF1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, 14800, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, "29CB9214-1EA9-4D05-AAC4-F9494F82989C");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, "SUOFVIBIUOP3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOP3, BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUP1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUP1, "774C9889-8064-465A-A752-A2DEB64D64B6");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUP1, "RUEGFSRVBUP1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, "8CEABFAE-1C9E-40DD-B58E-473609AEB750");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTINCOUEGF, "BOSTINCOUEGF");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, 18000, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, "3AF16FC0-6553-40B7-B8F7-3A82A47ED6B5");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, "SUOFVIBIUSI3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUSI3, BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUS1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUS1, "9A906D1E-FEF9-4543-BA3F-5022AC1846D4");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUS1, "RUEGFSRVBUS1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, "4BFDC5A1-D98A-47C7-8FE3-E64F5C0C8A6A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOVACOUOESGF, "BOVACOUOESGF");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, "42BE1D47-9D14-4162-8549-4C11DE0B6F23");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, "SUOFVIBIUOV3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUOFVIBIUOV3, BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUV1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUV1, "6BED8C6E-ED23-4798-B213-70C33F5C45C2");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RUEGFSRVBUV1, "RUEGFSRVBUV1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, "52E2346E-DA2C-482D-901F-00792D3A2513");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BOSTDEUOESG2, "BOSTDEUOESG2");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, "EFDF5645-782A-4C33-B27E-C70AE3442F66");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, "SUMOFSTANDE3");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_SUMOFSTANDE3, BUK_PRPEUOGECODB_SPAN_RUEGFSRSDPP1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_RUEGFSRSDPP1, "914F5CCA-2311-4538-9C66-AE63898202FA");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_RUEGFSRSDPP1, "RUEGFSRSDPP1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_TOTALE1, 11700, 200, 2900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_TOTALE1, "971DAF08-BEBD-47B3-BAC2-8F52286A06C0");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_TOTALE1, "TOTALE1");
    BUK_PRPEUOGECODB.InitBoxSpan(BUK_PRPEUOGECODB_RPTBOX_TOTALE1, BUK_PRPEUOGECODB_SPAN_TOTALE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SPAN_TOTALE1, "2395888A-3059-4EE6-A25C-36A72BB2D62A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SPAN_TOTALE1, "TOTALE1");
    BUK_PRPEUOGECODB.InitReportBox(BUK_PRPEUOGECODB_SEC_RAGUOESGROFO, BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, 14800, 100, 12900, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, "163D7794-B7DA-4809-922E-2CEEB4062287");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_RPTBOX_BARRATOTALE1, "BARRATOTALE1");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_PAGEFOOTER, 200, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_PAGEFOOTER, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_PAGEFOOTER, "4B74E34B-36BF-4F27-B787-558FA99B0A2A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_PRPEUOGECODB.InitSection(BUK_PRPEUOGECODB_RPT_PREPERUOGERE, BUK_PRPEUOGECODB_SEC_REPORTFOOTER, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGECODB.SetSectionRendersInto(BUK_PRPEUOGECODB_SEC_REPORTFOOTER, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOGECODB.SetRTCGuid(BUK_PRPEUOGECODB_SEC_REPORTFOOTER, "B8C968F6-99AE-432B-82BE-FD6FDCF36B4A");
    BUK_PRPEUOGECODB.SetObjCode(BUK_PRPEUOGECODB_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PRPEUOGECODB.AddReportGroup(BUK_PRPEUOGECODB_SEC_RAGUOESGROHE, "RECORAGGUOES");
    BUK_PRPEUOGECODB.AddReportGroup(BUK_PRPEUOGECODB_SEC_RAGTITGROHEA, "RECORAGGTITO");
    BUK_PRPEUOGECODB_RPT_PREPERUOGERE_InitQuery(false, true);
  }

  private void BUK_PRPEUOGECODB_InitLinks()
  {
    BUK_PRPEUOGECODB.SetBoxNextBox(BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1, BUK_PRPEUOGECODB_RPTBOX_PAGEBODY1);
  }

  private void BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA_Init()
  {
    BUK_PRPEUOGESEDB.InitMastro(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, "C8600134-A920-46D5-9ECD-AE28308D2CC0");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, "STPRPEUOGEPA");
    BUK_PRPEUOGESEDB.InitMastroBox(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, BUK_PRPEUOGESEDB_RPTBOX_NUMEROPAGINA, 26100, 300, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_NUMEROPAGINA, "D5DC9087-D3F0-4448-BF85-205CF0EDC774");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_NUMEROPAGINA, BUK_PRPEUOGESEDB_SPAN_CPTSPPUGSDBP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_CPTSPPUGSDBP, "0FD58923-6706-461D-A77F-6577A6EF0EC4");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_CPTSPPUGSDBP, "CPTSPPUGSDBP");
    BUK_PRPEUOGESEDB.InitMastroBox(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, BUK_PRPEUOGESEDB_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1800, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_PAGEHEADER, "9E202D73-064B-43A4-A0EC-F2ABD9B19E8E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOGESEDB.InitMastroBox(BUK_PRPEUOGESEDB_MST_STPRPEUOGEPA, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY, 1000, 3000, 27700, 16900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY, "18208684-96B1-403D-ADF1-0CFFBF29DBCA");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_InitQuery() { BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_InitQuery(true, true); }
  private void BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(A.E_S, 'E', TO_CHAR ( A.RISORSA_INTERVENTO ), TO_CHAR ( A.TITOLO ) || ' - ' || TO_CHAR ( A.INTERVENTO_CATEGORIA )) as RECRISCODINT, ");
      SQL.append("  DECODE(A.E_S, 'E', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0), TO_CHAR ( B.DESCRIZIONE ) || ' - ' || C.DESCRIZIONE) as RECDESRICOIN, ");
      SQL.append("  TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || TO_CHAR ( A.E_S ) as RECORAGGUOES, ");
      SQL.append("  DECODE(~~PQRY_PAR112.PARTOTPERTIT~~, 'SI', DECODE(A.RISORSA_INTERVENTO, 0, DECODE(A.E_S, 'E', DECODE(A.CAPITOLO, 9999999999999998.0, 9999999999999998.0, DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999, A.TITOLO)), DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999 + 1, A.TITOLO)), A.TITOLO), to_number(NULL)) as RECORAGGTITO, ");
      SQL.append("  DECODE(A.E_S, 'E', TO_CHAR ( A.RISORSA_INTERVENTO ), DECODE(~~PQRY_PAR112.PARTOTPERTIT~~, 'SI', NULL, TO_CHAR ( A.TITOLO )) || TO_CHAR ( A.INTERVENTO_CATEGORIA )) as RECRAGRICOIN, ");
      SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORDESCRUO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  NVL(A.PREVISIONE, 0) as PREVISIONE, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) as STN_INI_CO, ");
      SQL.append("  NVL(A.VARIAZIONI_CO, 0) as VARIAZIONI_CO, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) as RECOSTANDEFI ");
      SQL.append("from ");
      SQL.append("  VISTA_BILBPR_UO A, ");
      SQL.append("  TITOLI B, ");
      SQL.append("  INTERVENTI C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.TIPO_BILANCIO = ~~PQRY_PAR112.PARADABILSIM~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_PAR112.PARAMPARTE~~ OR ~~PQRY_PAR112.PARAMPARTE~~ = 'ES') ");
      SQL.append("and   ((~~PQRY_PAR112.PARAMUOSUPER~~ IS NULL) OR (GET_UO_SUP(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) = ~~PQRY_PAR112.PARAMUOSUPER~~)) ");
      SQL.append("and   ((~~PQRY_PAR112.PARAMUOGESTI~~ IS NULL) OR (A.PROGR_UNITA_ORGANIZZATIVA = ~~PQRY_PAR112.PARAMUOGESTI~~)) ");
      SQL.append("and   (B.E_S(+) = A.E_S) ");
      SQL.append("and   (B.TITOLO(+) = A.TITOLO) ");
      SQL.append("and   (C.TITOLO(+) = A.TITOLO) ");
      SQL.append("and   (C.INTERVENTO(+) = A.INTERVENTO_CATEGORIA) ");
      SQL.append("and   (C.S(+) = A.E_S) ");
      SQL.append("order by 3, 4, 5 ");
      BUK_PRPEUOGESEDB.SetReportQuery(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "EA6F86DA-23BC-4D00-99EF-F28C2E5BCAFD");
      if (BUK_PRPEUOGESEDB.FindObjByID(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE) != null)
        BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, "RECORAGGUOES");
      if (BUK_PRPEUOGESEDB.FindObjByID(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA) != null)
        BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, "RECORAGGTITO");
      if (BUK_PRPEUOGESEDB.FindObjByID(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE) != null)
        BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, "RECRAGRICOIN");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_Init()
  {
    BUK_PRPEUOGESEDB.InitReport(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, 196865);
    BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_InitQuery(true, false);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "11BA956C-857D-4E47-995D-084FBF14609D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, "PREPERUOGERE");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_REPORTHEADER, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_REPORTHEADER, "AC353138-60E3-499D-8B67-F6E50E09E00E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_PAGEHEADER, BUK_PRPEUOGESEDB_RPTBOX_PAGEHEADER);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_PAGEHEADER, "49E02A42-1A16-4A2B-AAB3-7838B3F64E33");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_PAGEHEADER, BUK_PRPEUOGESEDB_RPTBOX_RAGGRUPPAPER, 100, 200, 27500, 1000, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_RAGGRUPPAPER, "D82ACF72-0CDA-44D2-AA7B-3FBF879BFAA4");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_RAGGRUPPAPER, "RAGGRUPPAPER");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_RAGGRUPPAPER, BUK_PRPEUOGESEDB_SPAN_RAGGPERUOGES, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Previsioni per U.O. Gestione", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RAGGPERUOGES, "607B4C52-B7EF-410B-BE2D-07E39336A01E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RAGGPERUOGES, "RAGGPERUOGES");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGUOES");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, "4AA43E3C-77AB-458D-A8A2-9B1161AFD451");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, "RAGUOESGROHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONU1, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONU1, "A22A2791-6888-445D-B4B2-BC84E6392A9B");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONU1, BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPU1, MyGlb.VIS_HEADSENZBOR1, 5, 201, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPU1, "058B4E55-B555-49D7-B2BD-F4EF8AD0F485");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPU1, "RDUPPUDGPPU1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BOCOUOESGRHE, 0, 1000, 3300, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOCOUOESGRHE, "4BB5B93A-FFF9-48A3-8A7B-8EDDA5C4BA02");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOCOUOESGRHE, "BOCOUOESGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADE1, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADE1, "105B9508-7915-4BED-B0E2-8FBC5CA758E1");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADE1, BUK_PRPEUOGESEDB_SPAN_VOCEPEG1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_VOCEPEG1, "AC2279EE-D953-4B91-9144-FCBFD371AA60");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_VOCEPEG1, "VOCEPEG1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BODEUOESGRHE, 3300, 1000, 11600, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BODEUOESGRHE, "EA298D70-0EEE-41D3-976B-6D9194347746");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BODEUOESGRHE, "BODEUOESGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADE1, 3400, 1200, 11300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADE1, "48B57304-40DF-408E-82E7-04B89DEBE0B0");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADE1, BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE1, "237058BD-0922-4E24-A230-1AED18768049");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRHE, 14900, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRHE, "BBAC6309-E0E2-4AE9-A87D-52F501D57F55");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRHE, "BOPRUOESGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, 14900, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, "4E9A2062-A61F-40A2-AB64-0572D86AFD4C");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, "PREVISHEADE1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADE1, BUK_PRPEUOGESEDB_SPAN_PREVISIONE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione ", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_PREVISIONE1, "CE7C854B-B719-4EC4-AA5C-A6D11C848C26");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_PREVISIONE1, "PREVISIONE1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, 18100, 1000, 3100, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, "F45FAE9C-2887-491C-B4BC-86EFC979515A");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGH, "BOSTINUOESGH");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, 18100, 1200, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, "13136BF9-A8DB-410A-834F-1014A385275B");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, "STANINIZHEA1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEA1, BUK_PRPEUOGESEDB_SPAN_STANZIINIZI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_STANZIINIZI1, "CF7F000C-BAF5-4911-8566-BA8559981039");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_STANZIINIZI1, "STANZIINIZI1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, "CA34E9D5-7920-40F1-BBA3-620EC3C52F81");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRHE, "BOVAUOESGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, "1BB0FF53-7373-481F-87B3-0507DBFF2F4D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, "VARIAZHEADE1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADE1, BUK_PRPEUOGESEDB_SPAN_VARIAZIONI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_VARIAZIONI1, "4FDDBCC1-70B8-43E9-97D6-71A0D115F76B");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_VARIAZIONI1, "VARIAZIONI1");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, "9E413AD8-AD87-4D8B-AD10-61B8EDF46777");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGH, "BOSTDEUOESGH");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, "F30B03A4-9B0C-44EA-9019-27F2C4DB0A10");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, "STANDEFIHEA1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEA1, BUK_PRPEUOGESEDB_SPAN_STANZIDEFIN1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_STANZIDEFIN1, "862D92AD-B23A-4F4E-B3F0-522DE0E1C1AB");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_STANZIDEFIN1, "STANZIDEFIN1");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGTITO");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, "8DE61E72-5B5D-459E-A061-0C227C0C173E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, "RAGTITGROHEA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONUO, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONUO, "D02571BF-779F-4BF0-AAB9-7C4A6D65A7BF");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_DESCRIZIONUO, BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPUG, MyGlb.VIS_HEADSENZBOR1, 5, 300, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPUG, "108B5520-413B-465C-8286-8ECD9898C8CE");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RDUPPUDGPPUG, "RDUPPUDGPPUG");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOXCODTIGRHE, 0, 1000, 3300, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXCODTIGRHE, "03127A06-F37C-4B6A-A472-7829D9422514");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXCODTIGRHE, "BOXCODTIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADER, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADER, "B6171164-0251-4405-A834-E29E86DC236E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_CODICEHEADER, BUK_PRPEUOGESEDB_SPAN_VOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_VOCEPEG, "0E9F5C5D-4BD9-4A18-AFE5-336B58D21A12");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_VOCEPEG, "VOCEPEG");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOXDESTIGRHE, 3300, 1000, 11600, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXDESTIGRHE, "ECE37736-65CB-42D2-BA63-50862A942D95");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXDESTIGRHE, "BOXDESTIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADER, 3400, 1200, 11300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADER, "69FB6BBE-4E55-4589-904D-B6710184A18E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_DESCRIHEADER, BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE, "221095F7-617B-4EE3-9DBA-B6319C34B509");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRHE, 14900, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRHE, "33BFA227-B796-4DBB-88DD-EA0580BE11B4");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRHE, "BOXPRETIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, 14900, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, "2F7EC0AF-DD16-4C3E-8E5B-DB6A9CBF2EE7");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, "PREVISHEADER");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_PREVISHEADER, BUK_PRPEUOGESEDB_SPAN_PREVISIONE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_PREVISIONE, "CE48A828-0D60-4056-A63A-08115EFE7628");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_PREVISIONE, "PREVISIONE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, 18100, 1000, 3100, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, "FDF7DCA4-EB90-4410-8440-D89673C141B6");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRHE, "BOSTINTIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, 18100, 1200, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, "2D68392C-7AD9-44F7-A00D-8892E2DD8D27");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, "STANINIZHEAD");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STANINIZHEAD, BUK_PRPEUOGESEDB_SPAN_STANZIINIZIA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_STANZIINIZIA, "1E5C77A3-1BA5-42D0-A4A8-80E29CCDACCA");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_STANZIINIZIA, "STANZIINIZIA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, "9ED093CC-C171-42DF-97A1-0F953487A69D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRHE, "BOXVARTIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, "B9409D53-AC91-4322-8EA1-3380E872CAB9");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_VARIAZHEADER, BUK_PRPEUOGESEDB_SPAN_VARIAZIONI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_VARIAZIONI, "71A63112-EE59-481A-B1A1-186CE9C1C5A2");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_VARIAZIONI, "VARIAZIONI");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, "9C4F98DB-83B4-419A-8579-662743316F68");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRHE, "BOSTDETIGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, "8FE5AAC5-CC94-43F1-B366-ECB1A99D025C");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, "STANDEFIHEAD");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STANDEFIHEAD, BUK_PRPEUOGESEDB_SPAN_STANZIDEFINI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_STANZIDEFINI, "3C4AC0AA-0A18-4756-A462-B48D11289B7A");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_STANZIDEFINI, "STANZIDEFINI");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, 700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECRAGRICOIN");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, "AE55F387-98EE-47A7-9CB6-4237046423B7");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, "RARICOINGRHE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXCODICDETA, 0, 0, 3300, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXCODICDETA, "2B0BCF3A-D6F0-40F6-9EEA-81D650FA6B95");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXCODICDETA, "BOXCODICDETA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE, 100, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE, "187B0326-B05A-45FE-BF03-0C7006BAA2C8");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE, "RISORCODINTE");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_RISORCODINTE, BUK_PRPEUOGESEDB_SPAN_RRCIPPUDGPPU, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "To String (VISTA BILBPR UO RISORSA INTERVENTO) +c trattino con spazi +c To String (VISTA BILBPR UO CAPITOLO) +c barra con spazi +c To String (VISTA BILBPR UO ARTICOLO)", "::RECRISCODINT", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RRCIPPUDGPPU, "14287AE8-5DB9-4996-8AFA-D6435C2AA31E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RRCIPPUDGPPU, "RRCIPPUDGPPU");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXDESCRDETA, 3300, 0, 11600, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXDESCRDETA, "9217F833-8C1B-4FAF-B3C5-DA234F1B2B1D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXDESCRDETA, "BOXDESCRDETA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT, 3400, 100, 11400, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT, "FE343A8D-C4F6-46E3-B927-07A59F2367E9");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT, "DESRISCODINT");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_DESRISCODINT, BUK_PRPEUOGESEDB_SPAN_RDRCIPPUDGPP, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "If Equal (VISTA BILBPR UO E S, Spesa, If Equal (VISTA BILBPR UO ARTICOLO, Zero, If Equal (VISTA BILBPR UO CAPITOLO, Zero, Null String, If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), Null String)", "::RECDESRICOIN", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RDRCIPPUDGPP, "B25833C9-ABE2-44CD-8BB2-CEA6D2D9C27B");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RDRCIPPUDGPP, "RDRCIPPUDGPP");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXPREVIDETA, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXPREVIDETA, "700041B1-0C6C-4213-89BE-D5CEC41421E3");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXPREVIDETA, "BOXPREVIDETA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, 14900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, "41234050-E2E4-4EF7-93D0-D20445A75E3E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, "PREVISIONE");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_PREVISIONE, BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUP, "847E9FE6-350B-4B57-B36C-AB1BE7EE6CA9");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUP, "RRCIGHSRVBUP");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, "9E8491F4-B178-433A-9757-178C696933B3");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXSTAINIDET, "BOXSTAINIDET");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_STNINICO, 18100, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, "0EED6515-2AF8-4191-9965-3925F5A55036");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, "STNINICO");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STNINICO, BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUS, "E258391F-8AE9-45F6-A47B-9C29FC062403");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUS, "RRCIGHSRVBUS");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, "10479FC9-E7FC-4BF1-9574-B1A7883CE78A");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXVARIADETA, "BOXVARIADETA");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, "349C0B9C-2395-47D2-9D54-CEE53BDA2A2C");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, "VARIAZIONICO");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_VARIAZIONICO, BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUV, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUV, "9E57CDFF-8D10-42BF-8448-C949475E42A0");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRVBUV, "RRCIGHSRVBUV");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, "0D887027-ECC7-4815-B154-DA837901DD29");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXSTADEFDET, "BOXSTADEFDET");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, 24400, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, "8EBB129C-EA9A-433E-BAE6-B39134FD7D96");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, "STANZIDEFINI");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_STANZIDEFINI, BUK_PRPEUOGESEDB_SPAN_RRCIGHSRSDPP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "VISTA BILBPR UO STN INI CO + VISTA BILBPR UO VARIAZIONI CO", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRSDPP, "E872C3DC-7859-4D75-B10E-98E7451B233D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RRCIGHSRSDPP, "RRCIGHSRSDPP");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_DETAIL, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_DETAIL, "B9DE3FA5-6EA9-4454-8045-6E6A4958110A");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_DETAIL, "DETAIL");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RARICOINGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECRAGRICOIN");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RARICOINGRFO, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RARICOINGRFO, "62A1B349-925F-48B1-95BA-232FDB7A3F61");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RARICOINGRFO, "RARICOINGRFO");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGTITO");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, "03D5BAB4-6EFC-487D-A13B-76D9327B64F1");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, "RAGTITGROFOO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, "88B0E150-DED2-40F2-B497-EBD96AAA4CD6");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXPRETIGRFO, "BOXPRETIGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, 14900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, "4274D565-9A24-4A66-80BA-6CAFF83C3ED7");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, "SUOFVIBIUOP1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOP1, BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUPPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUPPP, "0C3369FF-20FF-440A-9A9F-F6CFDCF82614");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUPPP, "RTGFSRVBUPPP");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, "1A97907A-0D0D-4A9B-BEB5-06A3F4875AB3");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTINTIGRFO, "BOSTINTIGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, 18100, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, "FF932704-D84A-463A-9867-17AAB50AF099");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, "SUOFVIBIUSI1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSI1, BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUSIC, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUSIC, "FCC93ACA-215A-45D3-BDC9-DB089E565429");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUSIC, "RTGFSRVBUSIC");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, "CDDB06B0-DA07-432C-98C8-02E30319D31E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOXVARTIGRFO, "BOXVARTIGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, "4137987D-3388-4E46-8684-F191A3F4BED4");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, "SUOFVIBIUOV1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOV1, BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUVCP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUVCP, "7122C1E5-56D7-4E52-9E41-4F879AA31248");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RTGFSRVBUVCP, "RTGFSRVBUVCP");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, "CD08B37E-2146-42E0-A712-F7E2371D2C5F");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTDETIGRFO, "BOSTDETIGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, 24400, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, "9A327476-83DB-440B-AB38-101B7B4344CC");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, "SUMOFSTANDE1");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDE1, BUK_PRPEUOGESEDB_SPAN_RTGFSRSDPPUD, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RTGFSRSDPPUD, "1617538E-4D7F-43BC-B110-E3E875ED39E6");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RTGFSRSDPPUD, "RTGFSRSDPPUD");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_TOTALETITOLO, 10700, 100, 4000, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_TOTALETITOLO, "624B77B9-4833-416D-AE9F-091CC5FF050F");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_TOTALETITOLO, "TOTALETITOLO");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_TOTALETITOLO, BUK_PRPEUOGESEDB_SPAN_CTIERVBUTPPU, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_CTIERVBUTPPU, "8FC84270-D487-40ED-B50F-81B005C5FC2A");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_CTIERVBUTPPU, "CTIERVBUTPPU");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGTITGROFOO, BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, 14900, 100, 12700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, "43EBEAF4-53FE-4EFD-88AE-1F2A16F8491D");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BARRTOTATITO, "BARRTOTATITO");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, 2600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGUOES");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, "73922E29-EFC1-4DE0-AC54-0054290EE101");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, "RAGUOESGROFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, "A54121D9-D80C-4151-9944-39E9D84DC106");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOPRUOESGRFO, "BOPRUOESGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, 14900, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, "E66DE9D2-7592-4C2B-8868-957D7B9689E5");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, "SUOFVIBIUOPR");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOPR, BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUPP, "3FFA4DBA-40E8-45E7-B10B-4DF26B2AFE15");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUPP, "RUEGFSRVBUPP");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, "79AE764C-A06E-486C-B4CA-B4D0EFC487D2");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTINUOESGF, "BOSTINUOESGF");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, 18100, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, "F7703B7A-331A-4E70-B3A0-287D64351F2F");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, "SUOFVIBIUSIC");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUSIC, BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUSI, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUSI, "CC3487D5-FC30-4A6D-B0D0-D4898502FAE4");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUSI, "RUEGFSRVBUSI");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, "A573D484-A9DF-478E-B4D6-E63EAF6CE21E");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOVAUOESGRFO, "BOVAUOESGRFO");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, "683B62EA-464A-4AB5-BEC6-B95D91CBF072");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, "SUOFVIBIUOVC");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUOFVIBIUOVC, BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUVC, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUVC, "5887DA3E-CE66-4104-8248-46C4A7C34858");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RUEGFSRVBUVC, "RUEGFSRVBUVC");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, "0F4672DA-CDDF-4FAB-A952-C5F8CB76E197");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BOSTDEUOESGF, "BOSTDEUOESGF");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, 24400, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, "EF611A85-DFB1-49F3-94D4-726018D37FEB");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, "SUMOFSTANDEF");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_SUMOFSTANDEF, BUK_PRPEUOGESEDB_SPAN_RUEGFSRSDPPU, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_RUEGFSRSDPPU, "5A236EAC-7220-4620-AAE0-A7F27563D095");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_RUEGFSRSDPPU, "RUEGFSRSDPPU");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_TOTALE, 11800, 200, 2900, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_TOTALE, "4F56A767-DFAB-424A-BE0D-7FBA818BE7D0");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_TOTALE, "TOTALE");
    BUK_PRPEUOGESEDB.InitBoxSpan(BUK_PRPEUOGESEDB_RPTBOX_TOTALE, BUK_PRPEUOGESEDB_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SPAN_TOTALE, "8A5E1E0E-04E5-482A-978B-162F3BF202F3");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SPAN_TOTALE, "TOTALE");
    BUK_PRPEUOGESEDB.InitReportBox(BUK_PRPEUOGESEDB_SEC_RAGUOESGROFO, BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, 14900, 100, 12700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, "83B29691-F5E4-4843-BA22-525E110F05D9");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_RPTBOX_BARRATOTALE, "BARRATOTALE");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_PAGEFOOTER, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_PAGEFOOTER, "EB4E9111-DA70-4F53-BD43-CA27A9AE2530");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_PRPEUOGESEDB.InitSection(BUK_PRPEUOGESEDB_RPT_PREPERUOGERE, BUK_PRPEUOGESEDB_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOGESEDB.SetSectionRendersInto(BUK_PRPEUOGESEDB_SEC_REPORTFOOTER, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOGESEDB.SetRTCGuid(BUK_PRPEUOGESEDB_SEC_REPORTFOOTER, "88FBA353-3940-40D8-867F-97CE2E3508E9");
    BUK_PRPEUOGESEDB.SetObjCode(BUK_PRPEUOGESEDB_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RAGUOESGROHE, "RECORAGGUOES");
    BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RAGTITGROHEA, "RECORAGGTITO");
    BUK_PRPEUOGESEDB.AddReportGroup(BUK_PRPEUOGESEDB_SEC_RARICOINGRHE, "RECRAGRICOIN");
    BUK_PRPEUOGESEDB_RPT_PREPERUOGERE_InitQuery(false, true);
  }

  private void BUK_PRPEUOGESEDB_InitLinks()
  {
    BUK_PRPEUOGESEDB.SetBoxNextBox(BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY, BUK_PRPEUOGESEDB_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVPERUOGES) PAN_PREVPERUOGES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVPERUOGES) PAN_PREVPERUOGES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVPERUOGES) PAN_PREVPERUOGES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVPERUOGES) PAN_PREVPERUOGES_CellActivated(ColIndex, Cancel);
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
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
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
    if (SrcObj == PAN_PREVPERUOGES) PAN_PREVPERUOGES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnFormattingSection(SectionID);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnFormattingPage(PageID);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnConnecting(DBConn);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_Activated(ObjID, BoxName);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PRPEUOGECODB) BUK_PRPEUOGECODB_OnPreview();
    if (SrcObj == BKW_PRPEUOGESEDB) BUK_PRPEUOGESEDB_OnPreview();
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
