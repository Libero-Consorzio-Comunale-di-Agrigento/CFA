// **********************************************
// Previsioni Per Unita Di Utilizzo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerUnitaDiUtilizzo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVPERUOUTI_PARTE = 0;

  private static int PFL_PREVPERUOUTI_UOUTILIZZO = 0;
  private static int PFL_PREVPERUOUTI_DABILANSIMUL = 1;
  private static int PFL_PREVPERUOUTI_DETTAGCAPITO = 2;
  private static int PFL_PREVPERUOUTI_DESCRIINTERV = 3;
  private static int PFL_PREVPERUOUTI_TOTALPERTITO = 4;
  private static int PFL_PREVPERUOUTI_VARIAZIONI = 5;
  private static int PFL_PREVPERUOUTI_PREVANNINCOR = 6;
  private static int PFL_PREVPERUOUTI_PARTE = 7;
  private static int PFL_PREVPERUOUTI_PARTELABELDX = 8;
  private static int PFL_PREVPERUOUTI_ELABORA = 9;

  private static int PPQRY_PAR113 = 0;

  private static int PPQRY_ANAGUNITORGA = 1;


  IDPanel PAN_PREVPERUOUTI;
  CIDREObj BUK_PRPEUOUTCODB;
  OBook BKW_PRPEUOUTCODB;
  //
  // Template Pages constants
  private static int BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA = 1;
  private static int BUK_PRPEUOUTCODB_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_PRPEUOUTCODB_SPAN_CPTSPPUUCDBP = 3;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_PRPEUOUTCODB_RPT_PREPERUOGERE = 6;
  private static int BUK_PRPEUOUTCODB_SEC_REPORTHEADER = 7;
  private static int BUK_PRPEUOUTCODB_SEC_PAGEHEADER = 8;
  private static int BUK_PRPEUOUTCODB_RPTBOX_RAGGRUPPAPE1 = 9;
  private static int BUK_PRPEUOUTCODB_SPAN_RAGGPERUOGE1 = 10;
  private static int BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE = 11;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU2 = 12;
  private static int BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU2 = 13;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOVOPEUOESGH = 14;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD2 = 15;
  private static int BUK_PRPEUOUTCODB_SPAN_VOCEPEG2 = 16;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOCOBIUOESGH = 17;
  private static int BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEA1 = 18;
  private static int BUK_PRPEUOUTCODB_SPAN_CODICEBILAN1 = 19;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BODEVOPEUEGH = 20;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE2 = 21;
  private static int BUK_PRPEUOUTCODB_SPAN_DESCRIZIONE2 = 22;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRH1 = 23;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2 = 24;
  private static int BUK_PRPEUOUTCODB_SPAN_PREVISIONE2 = 25;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1 = 26;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2 = 27;
  private static int BUK_PRPEUOUTCODB_SPAN_STANZIINIZI2 = 28;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1 = 29;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2 = 30;
  private static int BUK_PRPEUOUTCODB_SPAN_VARIAZIONI2 = 31;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1 = 32;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2 = 33;
  private static int BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN2 = 34;
  private static int BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA = 35;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU3 = 36;
  private static int BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU3 = 37;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOVOPETIGRHE = 38;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD3 = 39;
  private static int BUK_PRPEUOUTCODB_SPAN_VOCEPEG3 = 40;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOCOBITIGRHE = 41;
  private static int BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEAD = 42;
  private static int BUK_PRPEUOUTCODB_SPAN_CODICEBILANC = 43;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BODEVOPETIGH = 44;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE3 = 45;
  private static int BUK_PRPEUOUTCODB_SPAN_DESCRVOCEPEG = 46;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRH1 = 47;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3 = 48;
  private static int BUK_PRPEUOUTCODB_SPAN_PREVISIONE3 = 49;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1 = 50;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3 = 51;
  private static int BUK_PRPEUOUTCODB_SPAN_STANZIINIZI3 = 52;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1 = 53;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3 = 54;
  private static int BUK_PRPEUOUTCODB_SPAN_VARIAZIONI3 = 55;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1 = 56;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3 = 57;
  private static int BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN3 = 58;
  private static int BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR = 59;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1 = 60;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1 = 61;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPU1 = 62;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1 = 63;
  private static int BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1 = 64;
  private static int BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPU1 = 65;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1 = 66;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1 = 67;
  private static int BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPP1 = 68;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2 = 69;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2 = 70;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUPP = 71;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1 = 72;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STNINICO2 = 73;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUSI = 74;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1 = 75;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2 = 76;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUVC = 77;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2 = 78;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2 = 79;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPIGSRSDPPU = 80;
  private static int BUK_PRPEUOUTCODB_SEC_DETAIL = 81;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDET = 82;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG = 83;
  private static int BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPUU = 84;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDET = 85;
  private static int BUK_PRPEUOUTCODB_RPTBOX_CODICEBILANC = 86;
  private static int BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPUU = 87;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPEDE = 88;
  private static int BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPEG = 89;
  private static int BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPPU = 90;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET1 = 91;
  private static int BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE1 = 92;
  private static int BUK_PRPEUOUTCODB_SPAN_RVBUPPPUDUPP = 93;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCODE = 94;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STNINICO1 = 95;
  private static int BUK_PRPEUOUTCODB_SPAN_RVBUSICPPUDU = 96;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODET = 97;
  private static int BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC1 = 98;
  private static int BUK_PRPEUOUTCODB_SPAN_RVBUVCPPUDUP = 99;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE1 = 100;
  private static int BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN1 = 101;
  private static int BUK_PRPEUOUTCODB_SPAN_RSDPPUDUPPUU = 102;
  private static int BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR = 103;
  private static int BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO = 104;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1 = 105;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2 = 106;
  private static int BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUPP1 = 107;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1 = 108;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2 = 109;
  private static int BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUSI1 = 110;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1 = 111;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2 = 112;
  private static int BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUVC1 = 113;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1 = 114;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2 = 115;
  private static int BUK_PRPEUOUTCODB_SPAN_RTGFSRSDPPU1 = 116;
  private static int BUK_PRPEUOUTCODB_RPTBOX_TOTALETITOL1 = 117;
  private static int BUK_PRPEUOUTCODB_SPAN_CTIERVBUUTP1 = 118;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1 = 119;
  private static int BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO = 120;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1 = 121;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3 = 122;
  private static int BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUP1 = 123;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF = 124;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3 = 125;
  private static int BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUS1 = 126;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF = 127;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3 = 128;
  private static int BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUV1 = 129;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2 = 130;
  private static int BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3 = 131;
  private static int BUK_PRPEUOUTCODB_SPAN_RUEGFSRSDPP1 = 132;
  private static int BUK_PRPEUOUTCODB_RPTBOX_TOTALE1 = 133;
  private static int BUK_PRPEUOUTCODB_SPAN_TOTALE1 = 134;
  private static int BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1 = 135;
  private static int BUK_PRPEUOUTCODB_SEC_PAGEFOOTER = 136;
  private static int BUK_PRPEUOUTCODB_SEC_REPORTFOOTER = 137;

  CIDREObj BUK_PRPEUOUTSEDB;
  OBook BKW_PRPEUOUTSEDB;
  //
  // Template Pages constants
  private static int BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA = 1;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_PRPEUOUTSEDB_SPAN_CPTSPPUUSDBP = 3;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_PAGEHEADER = 4;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE = 6;
  private static int BUK_PRPEUOUTSEDB_SEC_REPORTHEADER = 7;
  private static int BUK_PRPEUOUTSEDB_SEC_PAGEHEADER = 8;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_RAGGRUPPAPER = 9;
  private static int BUK_PRPEUOUTSEDB_SPAN_RAGGPERUOGES = 10;
  private static int BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE = 11;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONU1 = 12;
  private static int BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPU1 = 13;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOCOUOESGRHE = 14;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADE1 = 15;
  private static int BUK_PRPEUOUTSEDB_SPAN_VOCEPEG1 = 16;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BODEUOESGRHE = 17;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADE1 = 18;
  private static int BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE1 = 19;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRHE = 20;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1 = 21;
  private static int BUK_PRPEUOUTSEDB_SPAN_PREVISIONE1 = 22;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH = 23;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1 = 24;
  private static int BUK_PRPEUOUTSEDB_SPAN_STANZIINIZI1 = 25;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE = 26;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1 = 27;
  private static int BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI1 = 28;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH = 29;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1 = 30;
  private static int BUK_PRPEUOUTSEDB_SPAN_STANZIDEFIN1 = 31;
  private static int BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA = 32;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONUO = 33;
  private static int BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPUU = 34;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXCODTIGRHE = 35;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADER = 36;
  private static int BUK_PRPEUOUTSEDB_SPAN_VOCEPEG = 37;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXDESTIGRHE = 38;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADER = 39;
  private static int BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE = 40;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRHE = 41;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER = 42;
  private static int BUK_PRPEUOUTSEDB_SPAN_PREVISIONE = 43;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE = 44;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD = 45;
  private static int BUK_PRPEUOUTSEDB_SPAN_STANZIINIZIA = 46;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE = 47;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER = 48;
  private static int BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI = 49;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE = 50;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD = 51;
  private static int BUK_PRPEUOUTSEDB_SPAN_STANZIDEFINI = 52;
  private static int BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE = 53;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXCODICDETA = 54;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE = 55;
  private static int BUK_PRPEUOUTSEDB_SPAN_RRCIPPUDUPPU = 56;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXDESCRDETA = 57;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT = 58;
  private static int BUK_PRPEUOUTSEDB_SPAN_RDRCIPPUDUPP = 59;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXPREVIDETA = 60;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE = 61;
  private static int BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUP = 62;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET = 63;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STNINICO = 64;
  private static int BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUS = 65;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA = 66;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO = 67;
  private static int BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUV = 68;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET = 69;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI = 70;
  private static int BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRSDPP = 71;
  private static int BUK_PRPEUOUTSEDB_SEC_DETAIL = 72;
  private static int BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO = 73;
  private static int BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO = 74;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO = 75;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1 = 76;
  private static int BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUPPP = 77;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO = 78;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1 = 79;
  private static int BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUSIC = 80;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO = 81;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1 = 82;
  private static int BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUVCP = 83;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO = 84;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1 = 85;
  private static int BUK_PRPEUOUTSEDB_SPAN_RTGFSRSDPPUD = 86;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_TOTALETITOLO = 87;
  private static int BUK_PRPEUOUTSEDB_SPAN_CTIERVBUUTPP = 88;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO = 89;
  private static int BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO = 90;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO = 91;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR = 92;
  private static int BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUPP = 93;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF = 94;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC = 95;
  private static int BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUSI = 96;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO = 97;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC = 98;
  private static int BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUVC = 99;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF = 100;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF = 101;
  private static int BUK_PRPEUOUTSEDB_SPAN_RUEGFSRSDPPU = 102;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_TOTALE = 103;
  private static int BUK_PRPEUOUTSEDB_SPAN_TOTALE = 104;
  private static int BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE = 105;
  private static int BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER = 106;
  private static int BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER = 107;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI302(IMDB);
    //
    //
    Init_PQRY_PAR113(IMDB);
    Init_PQRY_PAR113_RS(IMDB);
    Init_PQRY_VISTABILBPU2(IMDB);
    Init_PQRY_VISTBILBUOUT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI302(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI302, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI302, "TBL_PARAMETRI302");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAPREVEURO, "PARAPREVEURO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI302,IMDBDef3.FLD_PARAMETRI302_PARAPREVEURO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI302, 0);
  }

  private static void Init_PQRY_PAR113(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR113, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR113, "PQRY_PAR113");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113,IMDBDef12.PQSL_PAR113_PARPREANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR113, 0);
  }

  private static void Init_PQRY_PAR113_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR113_RS, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR113_RS, "PQRY_PAR113_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR113_RS,IMDBDef12.PQSL_PAR113_PARPREANINCO,5,2,0);
  }

  private static void Init_PQRY_VISTABILBPU2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTABILBPU2, 14);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTABILBPU2, "PQRY_VISTABILBPU2");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORVOCEPEG,5,303,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECDESVOCPEG, "RECDESVOCPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECDESVOCPEG,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORAGGUOES, "RECORAGGUOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORAGGUOES,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORAGGTITO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECRAGVOCPEG, "RECRAGVOCPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECRAGVOCPEG,5,297,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECOCODIBILA, "RECOCODIBILA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECOCODIBILA,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_PREVISIONE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_STN_INI_CO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_VARIAZIONI_CO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECOSTANDEFI, "RECOSTANDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTABILBPU2,IMDBDef12.PQSL_VISTABILBPU2_RECOSTANDEFI,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTABILBPU2, 0);
  }

  private static void Init_PQRY_VISTBILBUOUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTBILBUOUT, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTBILBUOUT, "PQRY_VISTBILBUOUT");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECRISCODINT, "RECRISCODINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECRISCODINT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECDESRICOIN, "RECDESRICOIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECDESRICOIN,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORAGGUOES, "RECORAGGUOES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORAGGUOES,5,198,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORAGGTITO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECRAGRICOIN, "RECRAGRICOIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECRAGRICOIN,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_PREVISIONE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_STN_INI_CO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_VARIAZIONI_CO,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECOSTANDEFI, "RECOSTANDEFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTBILBUOUT,IMDBDef12.PQSL_VISTBILBUOUT_RECOSTANDEFI,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTBILBUOUT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerUnitaDiUtilizzo(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerUnitaDiUtilizzo()
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
    FormIdx = MyGlb.FRM_PREPERUNDIUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C890DD6B-FA39-45AA-8214-623A382E814C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 448;
    DesignHeight = 326;
    set_Caption(new IDVariant("Previsioni Per Unita Di Utilizzo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 448;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per UO Utilizzo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_PREVPERUOUTI = new IDPanel(w, this, 1, "PAN_PREVPERUOUTI");
    Frames[1].Content = PAN_PREVPERUOUTI;
    PAN_PREVPERUOUTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVPERUOUTI.VS = MainFrm.VisualStyleList;
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 448-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D4F0C761-2E00-4AB0-9EE9-67E7AFD5A8DC");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 416, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVPERUOUTI.InitStatus = 2;
    PAN_PREVPERUOUTI_Init();
    PAN_PREVPERUOUTI_InitFields();
    PAN_PREVPERUOUTI_InitQueries();
    BKW_PRPEUOUTCODB = new OBook(this);
    BUK_PRPEUOUTCODB = new CIDREObj(BKW_PRPEUOUTCODB);
    BKW_PRPEUOUTCODB.iGuid = "9C0D4941-016F-45ED-AAFD-23D2ACF87FB5";
    BKW_PRPEUOUTCODB.Code = "BUK_PRPEUOUTCODB";
    BKW_PRPEUOUTCODB.BookObj = BUK_PRPEUOUTCODB;
    BKW_PRPEUOUTCODB.InitDefMasks();
    BUK_PRPEUOUTCODB.InitBook(1, 3342593, "Previsioni Per UO Utilizzo Con Dettagli Book", IMDB, MainFrm.VisualStyleList);
    BUK_PRPEUOUTCODB.InitHTML();
    BUK_PRPEUOUTCODB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PRPEUOUTCODB.Book.SetMainFrm(MainFrm);
    BUK_PRPEUOUTCODB.SetRTCGuid(0, "9C0D4941-016F-45ED-AAFD-23D2ACF87FB5");
    BUK_PRPEUOUTCODB.SetObjCode(0, "PRPEUOUTCODB");
    BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA_Init();
    BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_Init();
    BUK_PRPEUOUTCODB_InitLinks();
    BKW_PRPEUOUTSEDB = new OBook(this);
    BUK_PRPEUOUTSEDB = new CIDREObj(BKW_PRPEUOUTSEDB);
    BKW_PRPEUOUTSEDB.iGuid = "38328719-9176-44AF-A1F7-8D4AFF7B46B4";
    BKW_PRPEUOUTSEDB.Code = "BUK_PRPEUOUTSEDB";
    BKW_PRPEUOUTSEDB.BookObj = BUK_PRPEUOUTSEDB;
    BKW_PRPEUOUTSEDB.InitDefMasks();
    BUK_PRPEUOUTSEDB.InitBook(1, 3342593, "Previsioni Per UO Utilizzo Senza Dettagli Book", IMDB, MainFrm.VisualStyleList);
    BUK_PRPEUOUTSEDB.InitHTML();
    BUK_PRPEUOUTSEDB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PRPEUOUTSEDB.Book.SetMainFrm(MainFrm);
    BUK_PRPEUOUTSEDB.SetRTCGuid(0, "38328719-9176-44AF-A1F7-8D4AFF7B46B4");
    BUK_PRPEUOUTSEDB.SetObjCode(0, "PRPEUOUTSEDB");
    BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA_Init();
    BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_Init();
    BUK_PRPEUOUTSEDB_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI302, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREPERUNDIUT_PAR113();
      }
      PAN_PREVPERUOUTI.UpdatePanel(MainFrm);
      // BUK_PRPEUOUTCODB.UpdateBook();
      // BUK_PRPEUOUTSEDB.UpdateBook();
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
    if (Code.equals("BUK_PRPEUOUTCODB")) return BUK_PRPEUOUTCODB;
    if (Code.equals("BUK_PRPEUOUTSEDB")) return BUK_PRPEUOUTSEDB;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof PrevisioniPerUnitaDiUtilizzo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerUnitaDiUtilizzo.class.getName() : (Glb.ClassWithPackage(PrevisioniPerUnitaDiUtilizzo.class) ? PrevisioniPerUnitaDiUtilizzo.class.getName().substring(PrevisioniPerUnitaDiUtilizzo.class.getPackage().getName().length() + 1) : PrevisioniPerUnitaDiUtilizzo.class.getName()));
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
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARADETTCAPI, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
        {
          RiposizionaColonneDettagli();
        }
        else
        {
          RipristinaPosizioneColonneDettagli();
        }
        VisualizzazioneBoxImportiConDettagli();
        BUK_PRPEUOUTCODB.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_PRPEUOUTCODB.RefreshQuery();
        BUK_PRPEUOUTCODB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_PRPEUOUTCODB.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
        {
          RiposizionaColonneSenzaDettagli();
        }
        else
        {
          RipristinaPosizioneColonneSenzaDettagli();
        }
        VisualizzazioneBoxImportiSenzaDettagli();
        BUK_PRPEUOUTSEDB.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_PRPEUOUTSEDB.RefreshQuery();
        BUK_PRPEUOUTSEDB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_PRPEUOUTSEDB.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "Elabora", _e);
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
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RiposizionaColonneDettagli", _e);
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
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RipristinaPosizioneColonneDettagli", _e);
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
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzaPrevisioneConDettagli", _e);
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
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "NascodiPrevisioneConDettagli", _e);
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
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzaVariazioniConDettagli", _e);
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
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "NascondiVariazioniConDettagli", _e);
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
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
        {
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
          {
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, IDREGlb.RECT_WIDTH)))).dblValue());
            BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxVisible(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, IDREGlb.RECT_WIDTH))).dblValue());
            BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, IDREGlb.RECT_WIDTH))).dblValue());
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzazioneBoxImportiConDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, IDREGlb.RECT_LEFT, IDL.Sub((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))), (new IDVariant(3))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RiposizionaColonneSenzaDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, IDREGlb.RECT_LEFT))).dblValue());
      BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, IDREGlb.RECT_LEFT))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RipristinaPosizioneColonneSenzaDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzaPrevisioneSenzaDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "NascodiPrevisioneSenzaDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, (new IDVariant(-1)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, (new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzaVariazioniSenzaDettagli", _e);
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
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, (new IDVariant(0)).booleanValue());
      BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, (new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "NascondiVariazioniSenzaDettagli", _e);
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
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
        {
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
          BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
          {
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(-1)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
            BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add((new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxVisible(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, (new IDVariant(0)).booleanValue());
            BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, IDREGlb.RECT_WIDTH))).dblValue());
            BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PRPEUOUTSEDB.BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, IDREGlb.RECT_WIDTH))).dblValue());
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "VisualizzazioneBoxImportiSenzaDettagli", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADABILSIM, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADETTCAPI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADESCINTE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARTOTPERTIT, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMVARIAZI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARPREANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMUOUTILI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAPREVEURO, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per UO Utilizzo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVPERUOUTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVPERUOUTI);
      // 
      // Previsioni Per UO Utilizzo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARADETTCAPI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_PREVPERUOUTI.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVPERUOUTI.SetFlags (Glb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "PrevisioniPerUOUtilizzoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento UO ES Group Header Con Dettagli Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE_OnFormattingSection()
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
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARTOTPERTIT, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOUTCODB.set_SectionVisible(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaPrevisioneConDettagli();
      }
      else
      {
        NascodiPrevisioneConDettagli();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true))
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
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RaggruppamentoUOESGroupHeaderConDettagliBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Con Dettagli After Formatting Event
  // **********************************************************************
  private void BUK_PRPEUOUTCODB_SEC_DETAIL_OnAfterFormattingSection()
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
      if ((new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).compareTo((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, IDREGlb.RECT_HEIGHT))), true)!=0)
      {
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_DETAIL))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "DetailConDettagliAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento UO ES Group Header Senza Dettagli Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE_OnFormattingSection()
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
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARTOTPERTIT, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, (new IDVariant(-1)).booleanValue());
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, (new IDVariant(0)).booleanValue());
        BUK_PRPEUOUTSEDB.set_SectionVisible(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        VisualizzaPrevisioneSenzaDettagli();
      }
      else
      {
        NascodiPrevisioneSenzaDettagli();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true))
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
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RaggruppamentoUOESGroupHeaderSenzaDettagliBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento Risorsa Cod Intervento Group Header Senza Dettagli After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE_OnAfterFormattingSection()
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
      if ((new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).compareTo((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, IDREGlb.RECT_HEIGHT))), true)!=0)
      {
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXCODICDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXDESCRDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXPREVIDETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
        BUK_PRPEUOUTSEDB.set_BoxRect(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTSEDB.SectionHeight(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RaggruppamentoRisorsaCodInterventoGroupHeaderSenzaDettagliAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggruppamento Voce Peg Intestazione Gruppo After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggruppamento Voce Peg Intestazione Gruppo After Formatting Body
      // Corpo Procedura
      // 
      if ((new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).compareTo((new IDVariant(BUK_PRPEUOUTCODB.BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, IDREGlb.RECT_HEIGHT))), true)!=0)
      {
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
        BUK_PRPEUOUTCODB.set_BoxRect(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PRPEUOUTCODB.SectionHeight(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR))).dblValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerUnitaDiUtilizzo", "RaggruppamentoVocePegIntestazioneGruppoAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREPERUNDIUT_PAR113() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR113_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI302, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI302, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR113_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR113_RS, 0, IMDBDef3.TBL_PARAMETRI302, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 0, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 1, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMUOUTILI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 2, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADABILSIM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 3, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADETTCAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 4, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARADESCINTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 5, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARTOTPERTIT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 6, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARAMVARIAZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR113_RS, 7, 0, IMDBDef3.TBL_PARAMETRI302, IMDBDef3.FLD_PARAMETRI302_PARPREANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI302, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI302, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI302, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR113_RS, 0);
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
  private void PAN_PREVPERUOUTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVPERUOUTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVPERUOUTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVPERUOUTI, Cancel);
    // Stub
  }

  private void PAN_PREVPERUOUTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVPERUOUTI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVPERUOUTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVPERUOUTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVPERUOUTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVPERUOUTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_PRPEUOUTCODB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PRPEUOUTCODB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOUTCODB_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU2, new IDVariant(IDL.Add(IDL.Add(BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))))));
      BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE_OnFormattingSection();
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU3, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), ((IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARTOTPERTIT, 0).equals((new IDVariant("SI"))))?IDL.Add((new IDVariant(" - ")), ((BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "DESCRIZIONE"))):(new IDVariant())))));
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUPP, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR,"PREVISIONE")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUSI, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR,"STN_INI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUVC, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR,"VARIAZIONI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RVPIGSRSDPPU, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR)
    {
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUPP1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO,"PREVISIONE")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUSI1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO,"STN_INI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUVC1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO,"VARIAZIONI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RTGFSRSDPPU1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO,"RECOSTANDEFI")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_CTIERVBUUTP1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), ((BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_PRPEUOUTCODB.GetReportColumn(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "TITOLO")))))));
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUP1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO,"PREVISIONE")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUS1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO,"STN_INI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUV1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO,"VARIAZIONI_CO")));
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_RUEGFSRSDPP1, new IDVariant(BUK_PRPEUOUTCODB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PRPEUOUTCODB_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR)
    {
      BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR_OnAfterFormattingSection();
    }
    if (SectionID==BUK_PRPEUOUTCODB_SEC_DETAIL)
    {
      BUK_PRPEUOUTCODB_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_PRPEUOUTCODB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA)
    {
      BUK_PRPEUOUTCODB.set_SpanValue(BUK_PRPEUOUTCODB_SPAN_CPTSPPUUCDBP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOUTCODB.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOUTCODB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PRPEUOUTCODB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PRPEUOUTCODB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PRPEUOUTCODB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PRPEUOUTCODB_OnPreview()
  {
    PreviewBook = BKW_PRPEUOUTCODB;
    SetRD();
  }

  private void BUK_PRPEUOUTSEDB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PRPEUOUTSEDB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPU1, new IDVariant(IDL.Add(IDL.Add(BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))))));
      BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE_OnFormattingSection();
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPUU, new IDVariant(IDL.Add(IDL.Add(IDL.Add(BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORDESCRUO"), (new IDVariant(" - "))), ((BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), ((IMDB.Value(IMDBDef12.PQRY_PAR113, IMDBDef12.PQSL_PAR113_PARTOTPERTIT, 0).equals((new IDVariant("SI"))))?IDL.Add((new IDVariant(" - ")), ((BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "DESCRIZIONE"))):(new IDVariant())))));
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUP, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE,"PREVISIONE")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUS, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE,"STN_INI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUV, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE,"VARIAZIONI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRSDPP, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO)
    {
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUPPP, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO,"PREVISIONE")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUSIC, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO,"STN_INI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUVCP, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO,"VARIAZIONI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RTGFSRSDPPUD, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO,"RECOSTANDEFI")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_CTIERVBUUTPP, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), ((BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "TITOLO").equals((new IDVariant())))?(BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(999998)))? new IDVariant("Fondo di Cassa") : BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(999999)))? new IDVariant("Avanzo di Amministrazione") : BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "RECORAGGTITO").equals((new IDVariant(1000000)))? new IDVariant("Disavanzo di Amministrazione") :  new IDVariant()):IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_PRPEUOUTSEDB.GetReportColumn(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "TITOLO")))))));
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUPP, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO,"PREVISIONE")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUSI, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO,"STN_INI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUVC, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO,"VARIAZIONI_CO")));
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRSDPPU, new IDVariant(BUK_PRPEUOUTSEDB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO,"RECOSTANDEFI")));
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PRPEUOUTSEDB_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE)
    {
      BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE_OnAfterFormattingSection();
    }
  }

  private void BUK_PRPEUOUTSEDB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA)
    {
      BUK_PRPEUOUTSEDB.set_SpanValue(BUK_PRPEUOUTSEDB_SPAN_CPTSPPUUSDBP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOUTSEDB.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PRPEUOUTSEDB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PRPEUOUTSEDB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PRPEUOUTSEDB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PRPEUOUTSEDB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PRPEUOUTSEDB_OnPreview()
  {
    PreviewBook = BKW_PRPEUOUTSEDB;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVPERUOUTI_Init()
  {

    PAN_PREVPERUOUTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVPERUOUTI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, "D1BB0DEF-CB11-493B-8E96-7D3B6A23A0C9");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, "Parte");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, MyGlb.PANEL_FORM, 12, 7, 392, 49, 0, 0);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, 0, 31);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, 1, 13);
    PAN_PREVPERUOUTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, 0, 4);
    PAN_PREVPERUOUTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, 1, 4);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVPERUOUTI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVPERUOUTI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, "9A313F3B-F9B4-46E1-8E20-321C0E3A0F6B");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, "U.O. Utilizzo");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, "DE6581BA-AA94-43CD-A02C-CA130B8DAEAF");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, "96435C4C-54B4-49A2-923B-D3AE91C9AFEF");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, "46AC59D8-0A1A-46B5-A4A3-28D5455C0BD6");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, "Descrizioni Intervernto");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, "E4B6E7E3-9C77-4216-A028-E6A6493D802D");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, "60C0C016-CD9E-4FC4-8329-FD9B7075C487");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, "Variazioni");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, "A123D091-4631-4042-B8CF-46106205BB66");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, "0D2FFFD8-4EAD-44B0-868E-BFE29DF5995B");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, "Parte");
    PAN_PREVPERUOUTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, "B2253C1D-8799-409C-94A6-67C9EFF91974");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, "");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PREVPERUOUTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, "075EDDC8-0EE3-45CD-8ED7-BA2301896A63");
    PAN_PREVPERUOUTI.set_Header(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, "Elabora");
    PAN_PREVPERUOUTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVPERUOUTI.SetImage(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, 0, "button1.gif", false);
    PAN_PREVPERUOUTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVPERUOUTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_LIST, 72, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_LIST, 36);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_FORM, 4, 76, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_FORM, 116);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_UOUTILIZZO, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_UOUTILIZZO, PPQRY_PAR113, "A.PARAMUOUTILI", "PARAMUOUTILI", 1, 8, 0, -13997);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_FORM, 4, 116, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_FORM, 124);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_DABILANSIMUL, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_DABILANSIMUL, PPQRY_PAR113, "A.PARADABILSIM", "PARADABILSIM", 5, 1, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DABILANSIMUL, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DABILANSIMUL, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_FORM, 4, 140, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_FORM, 124);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_DETTAGCAPITO, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_DETTAGCAPITO, PPQRY_PAR113, "A.PARADETTCAPI", "PARADETTCAPI", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Inter.");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_FORM, 228, 140, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizioni Intervernto");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_DESCRIINTERV, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_DESCRIINTERV, PPQRY_PAR113, "A.PARADESCINTE", "PARADESCINTE", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_FORM, 4, 164, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_FORM, 124);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_TOTALPERTITO, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_TOTALPERTITO, PPQRY_PAR113, "A.PARTOTPERTIT", "PARTOTPERTIT", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_FORM, 4, 188, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_FORM, 124);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_VARIAZIONI, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_VARIAZIONI, PPQRY_PAR113, "A.PARAMVARIAZI", "PARAMVARIAZI", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_FORM, 228, 188, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_PREVANNINCOR, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_PREVANNINCOR, PPQRY_PAR113, "A.PARPREANINCO", "PARPREANINCO", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_FORM, 116, 32, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_PARTE, -1, GRP_PREVPERUOUTI_PARTE);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_PARTE, PPQRY_PAR113, "A.PARAMPARTE", "PARAMPARTE", 5, 2, 0, -13997);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVPERUOUTI.SetValueListItem(PFL_PREVPERUOUTI_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_LIST, 8, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_FORM, 16, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_PARTELABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_PARTELABELDX, -1, GRP_PREVPERUOUTI_PARTE);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_PARTELABELDX, -1, "", "PARTELABELDX", 0, 0, 0, -13997);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_LIST, 248, 244, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVPERUOUTI.SetRect(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_FORM, 324, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVPERUOUTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVPERUOUTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVPERUOUTI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVPERUOUTI.SetFieldPage(PFL_PREVPERUOUTI_ELABORA, -1, -1);
    PAN_PREVPERUOUTI.SetFieldPanel(PFL_PREVPERUOUTI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVPERUOUTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVPERUOUTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOUTILI~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUOUTILI~~ = to_number(NULL)) ");
    SQL.append("order by 2, 3 ");
    PAN_PREVPERUOUTI.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_PREVPERUOUTI_UOUTILIZZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2, 3 ");
    PAN_PREVPERUOUTI.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_PREVPERUOUTI_UOUTILIZZO, "");
    PAN_PREVPERUOUTI.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVPERUOUTI.SetIMDB(IMDB, "PQRY_PAR113", true);
    PAN_PREVPERUOUTI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PREVPERUOUTI.SetQueryIMDB(PPQRY_PAR113, IMDBDef12.PQRY_PAR113_RS, IMDBDef3.TBL_PARAMETRI302);
    JustLoaded = true;
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_UOUTILIZZO, IMDBDef3.FLD_PARAMETRI302_PARAMUOUTILI);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI302_PARADABILSIM);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_DETTAGCAPITO, IMDBDef3.FLD_PARAMETRI302_PARADETTCAPI);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_DESCRIINTERV, IMDBDef3.FLD_PARAMETRI302_PARADESCINTE);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_TOTALPERTITO, IMDBDef3.FLD_PARAMETRI302_PARTOTPERTIT);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_VARIAZIONI, IMDBDef3.FLD_PARAMETRI302_PARAMVARIAZI);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_PREVANNINCOR, IMDBDef3.FLD_PARAMETRI302_PARPREANINCO);
    PAN_PREVPERUOUTI.SetFieldPrimaryIndex(PFL_PREVPERUOUTI_PARTE, IMDBDef3.FLD_PARAMETRI302_PARAMPARTE);
    PAN_PREVPERUOUTI.SetMasterTable(0, "PARAMETRI302");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVPERUOUTI.Status() == 2)
    {
      int oldListQBE = PAN_PREVPERUOUTI.iUseListQBE;
      PAN_PREVPERUOUTI.iUseListQBE = 0;
      PAN_PREVPERUOUTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVPERUOUTI.PanelCommand(Glb.PCM_FIND);
      PAN_PREVPERUOUTI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA_Init()
  {
    BUK_PRPEUOUTCODB.InitMastro(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, "FB6FA029-A0F7-4734-BF91-4F2552ABC8B5");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, "STPRPEUOGEPA");
    BUK_PRPEUOUTCODB.InitMastroBox(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, BUK_PRPEUOUTCODB_RPTBOX_NUMEROPAGIN1, 26100, 300, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_NUMEROPAGIN1, "C6D4476A-FDD7-4B1B-A716-7D62F86F211F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_NUMEROPAGIN1, BUK_PRPEUOUTCODB_SPAN_CPTSPPUUCDBP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_CPTSPPUUCDBP, "8FACB768-56F3-4C43-BBC9-C289BF6DEFDC");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_CPTSPPUUCDBP, "CPTSPPUUCDBP");
    BUK_PRPEUOUTCODB.InitMastroBox(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, BUK_PRPEUOUTCODB_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1900, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PAGEHEADER1, "DEA2C831-0BFE-40C5-9967-DAAB79A1EC04");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_PRPEUOUTCODB.InitMastroBox(BUK_PRPEUOUTCODB_MST_STPRPEUOGEPA, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1, 1000, 3100, 27700, 16500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1, "F01706C5-3E94-48F9-BDC8-75047F46E372");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_InitQuery() { BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_InitQuery(true, true); }
  private void BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  TO_CHAR ( A.RISORSA_INTERVENTO ) || ' - ' || TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as RECORVOCEPEG, ");
      SQL.append("  DECODE(A.E_S, 'S', DECODE(A.ARTICOLO, 0, DECODE(A.CAPITOLO, 0, NULL, DECODE(~~PQRY_PAR113.PARADESCINTE~~, 'SI', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0) || ' - ', NULL)), DECODE(~~PQRY_PAR113.PARADESCINTE~~, 'SI', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0) || ' - ', NULL)), NULL) || A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as RECDESVOCPEG, ");
      SQL.append("  TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA_UT ) || TO_CHAR ( A.E_S ) as RECORAGGUOES, ");
      SQL.append("  DECODE(~~PQRY_PAR113.PARTOTPERTIT~~, 'SI', DECODE(A.RISORSA_INTERVENTO, 0, DECODE(A.E_S, 'E', DECODE(A.CAPITOLO, 9999999999999998.0, 9999999999999998.0, DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999, A.TITOLO)), DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999 + 1, A.TITOLO)), A.TITOLO), to_number(NULL)) as RECORAGGTITO, ");
      SQL.append("  LPAD(TO_CHAR ( A.RISORSA_INTERVENTO ), 7, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.CAPITOLO ), 6, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) as RECRAGVOCPEG, ");
      SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA_UT,TRUNC( SYSDATE )) as RECORDESCRUO, ");
      SQL.append("  A_GET_CODICE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as RECOCODIBILA, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  NVL(A.PREVISIONE, 0) as PREVISIONE, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) as STN_INI_CO, ");
      SQL.append("  NVL(A.VARIAZIONI_CO, 0) as VARIAZIONI_CO, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) as RECOSTANDEFI ");
      SQL.append("from ");
      SQL.append("  VISTA_BILBPR_UO_UT A, ");
      SQL.append("  TITOLI B ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.TIPO_BILANCIO = ~~PQRY_PAR113.PARADABILSIM~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_PAR113.PARAMPARTE~~ OR ~~PQRY_PAR113.PARAMPARTE~~ = 'ES') ");
      SQL.append("and   ((~~PQRY_PAR113.PARAMUOUTILI~~ IS NULL) OR (A.PROGR_UNITA_ORGANIZZATIVA_UT = ~~PQRY_PAR113.PARAMUOUTILI~~)) ");
      SQL.append("and   (B.E_S(+) = A.E_S) ");
      SQL.append("and   (B.TITOLO(+) = A.TITOLO) ");
      SQL.append("order by 3, 4, 5 ");
      BUK_PRPEUOUTCODB.SetReportQuery(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "DFA5E157-ADB3-465F-9E65-87C6596A7666");
      if (BUK_PRPEUOUTCODB.FindObjByID(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE) != null)
        BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, "RECORAGGUOES");
      if (BUK_PRPEUOUTCODB.FindObjByID(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA) != null)
        BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, "RECORAGGTITO");
      if (BUK_PRPEUOUTCODB.FindObjByID(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR) != null)
        BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, "RECRAGVOCPEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_Init()
  {
    BUK_PRPEUOUTCODB.InitReport(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, 196865);
    BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_InitQuery(true, false);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "3B204D29-0084-489C-8330-1CD02049DE2A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, "PREPERUOGERE");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_REPORTHEADER, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_REPORTHEADER, "57F6A347-CD47-4DCB-9B0D-7CBC4133173F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_PAGEHEADER, BUK_PRPEUOUTCODB_RPTBOX_PAGEHEADER1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_PAGEHEADER, "5E4C01F9-A598-4CDF-954C-7A7B04F339BF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_PAGEHEADER, BUK_PRPEUOUTCODB_RPTBOX_RAGGRUPPAPE1, 100, 200, 27500, 1000, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_RAGGRUPPAPE1, "8313230A-4E31-471C-B381-4A79892E72F4");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_RAGGRUPPAPE1, "RAGGRUPPAPE1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_RAGGRUPPAPE1, BUK_PRPEUOUTCODB_SPAN_RAGGPERUOGE1, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Previsioni per U.O. Utilizzo", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RAGGPERUOGE1, "F0D419CE-38E8-4FC7-8D3F-7192D95CB7F4");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RAGGPERUOGE1, "RAGGPERUOGE1");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGUOES");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, "628B7D33-1BEE-4BCC-9DD1-5198CA73447F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, "RAGUOESGROHE");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU2, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU2, "A155EB65-D7C2-4AF4-B8DF-CFEE99D18044");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU2, "DESCRIZIONU2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU2, BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU2, MyGlb.VIS_HEADSENZBOR1, 5, 201, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU2, "D07B8EB7-9079-48AE-B74E-704A6E7D2C1F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU2, "RDUPPUDUPPU2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOVOPEUOESGH, 0, 1000, 3400, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOVOPEUOESGH, "80400DD6-1C5F-4B24-B58B-D969262FAAF9");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOVOPEUOESGH, "BOVOPEUOESGH");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD2, 100, 1200, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD2, "8BEBDF77-7156-488C-A66A-BE3631E0E09B");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD2, "VOCEPEGHEAD2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD2, BUK_PRPEUOUTCODB_SPAN_VOCEPEG2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Voce P.e.g.", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_VOCEPEG2, "AAE577E5-B4C1-4AC8-AA6B-FE52E12EA97A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_VOCEPEG2, "VOCEPEG2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOCOBIUOESGH, 3400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOCOBIUOESGH, "6B27A157-B984-4D39-9F84-7699BAFAFFDE");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOCOBIUOESGH, "BOCOBIUOESGH");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEA1, 3500, 1200, 2700, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEA1, "E6FBDF83-5818-480E-96BA-CDC0311BBD35");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEA1, "CODIBILAHEA1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEA1, BUK_PRPEUOUTCODB_SPAN_CODICEBILAN1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Bilancio", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_CODICEBILAN1, "C64B8295-D9E3-4D59-9336-1B5DA373E30C");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_CODICEBILAN1, "CODICEBILAN1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BODEVOPEUEGH, 6600, 1000, 8200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BODEVOPEUEGH, "8777250F-67A9-4C1D-A46D-010C54F45C1B");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BODEVOPEUEGH, "BODEVOPEUEGH");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE2, 6700, 1200, 8000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE2, "C8D8D3E6-E76F-4DFF-A02D-4D037B77FB72");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE2, "DESVOCPEGHE2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE2, BUK_PRPEUOUTCODB_SPAN_DESCRIZIONE2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_DESCRIZIONE2, "D4F4C0E2-78EF-4E1D-9D93-E26897CB3C06");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRH1, 14800, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRH1, "8577EAE7-A5FD-4AA2-8A6A-EDCA7179255F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRH1, "BOPRUOESGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, 14800, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, "3292C041-E9E6-4749-A19B-7E1CF7EC46FC");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, "PREVISHEADE2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE2, BUK_PRPEUOUTCODB_SPAN_PREVISIONE2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione ", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_PREVISIONE2, "B26EEB29-037D-4D9B-BA60-DAD7D34B4229");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_PREVISIONE2, "PREVISIONE2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, 18000, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, "E6B8DFF6-0DBD-4E2F-B48E-1D801816D17E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTINUOESG1, "BOSTINUOESG1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, 18000, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, "7BAB8CB2-76B6-40CF-894A-5F01DE190F7E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, "STANINIZHEA2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA2, BUK_PRPEUOUTCODB_SPAN_STANZIINIZI2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_STANZIINIZI2, "7B5A97CE-E3ED-4F90-A90E-2D1D80C0AC94");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_STANZIINIZI2, "STANZIINIZI2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, "32E8DA6A-9B32-4CBA-BE57-A78635FF310F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOVAUOESGRH1, "BOVAUOESGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, "56721AF8-C52E-47C8-9508-975D48459310");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, "VARIAZHEADE2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE2, BUK_PRPEUOUTCODB_SPAN_VARIAZIONI2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_VARIAZIONI2, "F676BC69-E403-47D7-8320-1BA293A70899");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_VARIAZIONI2, "VARIAZIONI2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, "788D9D36-DCEA-4977-A660-BBF65AFCF423");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG1, "BOSTDEUOESG1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, "8945BB1D-89F0-4F27-9BFE-781EBBEFC31B");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, "STANDEFIHEA2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA2, BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN2, "4B079803-9946-4FA3-BDDB-8A706937D0D2");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN2, "STANZIDEFIN2");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGTITO");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, "C3AB3F66-3FD1-4D74-9704-6E6483408579");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, "RAGTITGROHEA");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU3, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU3, "C3F3B320-367B-4B24-B4DA-97769156C9F9");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU3, "DESCRIZIONU3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESCRIZIONU3, BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU3, MyGlb.VIS_HEADSENZBOR1, 5, 300, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU3, "F7E280EB-7926-4C38-92FD-954344AFF91D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RDUPPUDUPPU3, "RDUPPUDUPPU3");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOVOPETIGRHE, 0, 1000, 3400, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOVOPETIGRHE, "6289888A-443A-4DCF-9A71-02F2C84D44A0");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOVOPETIGRHE, "BOVOPETIGRHE");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD3, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD3, "8E43F9CC-BE58-4A36-87C6-07EB4ABEE749");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD3, "VOCEPEGHEAD3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEGHEAD3, BUK_PRPEUOUTCODB_SPAN_VOCEPEG3, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Voce P.e.g.", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_VOCEPEG3, "7809AAAA-2E08-408A-AF43-420AD2115B67");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_VOCEPEG3, "VOCEPEG3");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOCOBITIGRHE, 3400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOCOBITIGRHE, "0A6AC282-5A78-4118-A06C-7E2B853D4EF2");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOCOBITIGRHE, "BOCOBITIGRHE");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEAD, 3500, 1200, 2700, 1100, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEAD, "0646D5F1-7A6E-4701-A917-7BB4B4418E57");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEAD, "CODIBILAHEAD");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_CODIBILAHEAD, BUK_PRPEUOUTCODB_SPAN_CODICEBILANC, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Bilancio", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_CODICEBILANC, "2541D259-0015-49D3-A85F-8D61D7F31062");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_CODICEBILANC, "CODICEBILANC");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BODEVOPETIGH, 6600, 1000, 8200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BODEVOPETIGH, "E87C3A29-B75D-4FFF-AC08-F6D582DD7960");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BODEVOPETIGH, "BODEVOPETIGH");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE3, 6700, 1200, 8000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE3, "AB59A982-E3EC-46D3-8A9B-1C37B7B311DC");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE3, "DESVOCPEGHE3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESVOCPEGHE3, BUK_PRPEUOUTCODB_SPAN_DESCRVOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_DESCRVOCEPEG, "7FE863D4-76CC-4145-9966-B040E0C7B297");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRH1, 14800, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRH1, "997B6B29-E83F-4B89-9FCB-1C4932057F0C");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRH1, "BOXPRETIGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, 14800, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, "EBD076B9-C858-48BB-A962-D1221F47F548");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, "PREVISHEADE3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_PREVISHEADE3, BUK_PRPEUOUTCODB_SPAN_PREVISIONE3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_PREVISIONE3, "49C484EB-74DC-4CB9-954D-4606404E1BB3");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_PREVISIONE3, "PREVISIONE3");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, 18000, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, "EC5226CC-F2BE-4849-A645-54767C1C67C9");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTINTIGRH1, "BOSTINTIGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, 18000, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, "99626449-F74A-42E7-A5CC-43227184ABAB");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, "STANINIZHEA3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANINIZHEA3, BUK_PRPEUOUTCODB_SPAN_STANZIINIZI3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_STANZIINIZI3, "6B2FCA8C-913E-4C94-AC82-F70C43D4F4C2");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_STANZIINIZI3, "STANZIINIZI3");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, "700D06A4-F39E-4C3B-92C4-44CF2B37D743");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXVARTIGRH1, "BOXVARTIGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, "A47FF7B3-9698-49CF-8359-095F9173BA03");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, "VARIAZHEADE3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VARIAZHEADE3, BUK_PRPEUOUTCODB_SPAN_VARIAZIONI3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_VARIAZIONI3, "AA65969F-E2FF-4B09-B11E-118F347937DA");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_VARIAZIONI3, "VARIAZIONI3");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, "D757D8A5-559B-40A3-8C20-57961100F740");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRH1, "BOSTDETIGRH1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, "50C3A21E-D898-428D-99CC-1EAD73A427CD");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, "STANDEFIHEA3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANDEFIHEA3, BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN3, "367F4437-EEFA-460C-821A-05B6AB4102BD");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_STANZIDEFIN3, "STANZIDEFIN3");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, 1000, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECRAGVOCPEG");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, "9177F44D-D04F-454E-B981-798BCF01D448");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, "RAGVOCPEINGR");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, 0, 0, 3400, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, "DDC6704A-CA81-489D-B70D-1A515A19CDFF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDE1, "BOXVOCPEGDE1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, 100, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, "35EBAA8F-5382-467F-8F6F-CC0EDC2DB186");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG1, BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPU1, MyGlb.VIS_DEFAREPOSTYL, 5, 303, 0, 271384705, "To String (VISTA BILBPR UO RISORSA INTERVENTO) +c trattino con spazi +c To String (VISTA BILBPR UO CAPITOLO) +c barra con spazi +c To String (VISTA BILBPR UO ARTICOLO)", "::RECORVOCEPEG", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPU1, "47754113-1B80-4561-94D4-4BF92D0E27A6");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPU1, "RVPPPUDUPPU1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1, 3400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1, "F2587D0E-1811-4665-A7F1-D45C4AE4A15C");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDE1, "BOXCODBILDE1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, 3500, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, "BEFC8A32-4B3E-49E9-962D-32E28CAEDB1D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, "CODICEBILAN1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILAN1, BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPU1, MyGlb.VIS_NORMALA8LEF1, 1, 19, 0, 271384705, "A GET CODICE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, VISTA BILBPR UO CAPITOLO, VISTA BILBPR UO ARTICOLO)", "::RECOCODIBILA", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPU1, "4A9F15EA-3D29-49C9-B41F-C444F22D1FC9");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPU1, "RCBPPUDUPPU1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1, 6600, 0, 8200, 700, 0, 1, 3, MyGlb.VIS_BOX, 983041, 0, "", 3, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1, "69641751-8A79-4621-A545-52E7E7F1E1EF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPED1, "BOXDESVOPED1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, 6700, 100, 8000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, "D865F311-7AC1-4CB0-A3C1-6085C8B62FC0");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, "DESCRVOCEPE1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPE1, BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPP1, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384961, "If Equal (VISTA BILBPR UO E S, Spesa, If Equal (VISTA BILBPR UO ARTICOLO, Zero, If Equal (VISTA BILBPR UO CAPITOLO, Zero, Null String, If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), Null String)", "::RECDESVOCPEG", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPP1, "B6D7F215-F041-448E-B972-295565EF5C33");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPP1, "RDVPPPUDUPP1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2, "90CA93EB-9E19-4797-AD7A-32C87731E599");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET2, "BOXPREVIDET2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, 14800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, "5C988C50-D826-4A75-BA0A-675CE9BF95CF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, "PREVISIONE2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE2, BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUPP, "A8F59A1E-A270-44D5-B0B6-77584C79157E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUPP, "RVPIGSRVBUPP");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, "1855BBD6-0E68-424A-9959-DDB51ACD843F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCOD1, "BOXSTNINCOD1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, 18000, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, "E88C4780-E943-4190-810B-81F972E87953");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, "STNINICO2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STNINICO2, BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUSI, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUSI, "BBFBDC39-F4FD-4B66-B0E2-2D88501C48B8");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUSI, "RVPIGSRVBUSI");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, "2FDA8D72-4BAA-446B-8173-1C0E8FC1A168");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODE1, "BOXVARICODE1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, "A334324B-A8AC-4EAC-9F41-59007814E283");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, "VARIAZIONIC2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC2, BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUVC, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUVC, "D7CE8DD3-36E8-44FF-99A3-161265138C07");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPIGSRVBUVC, "RVPIGSRVBUVC");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, "F453BA74-A5A6-4F2A-BE65-175A6BE87FDB");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE2, "BOXSTADEFDE2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, "8C7CFC85-A10C-43AD-9908-1A587B557462");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, "STANZIDEFIN2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN2, BUK_PRPEUOUTCODB_SPAN_RVPIGSRSDPPU, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "VISTA BILBPR UO STN INI CO + VISTA BILBPR UO VARIAZIONI CO", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPIGSRSDPPU, "B0E7B118-278A-4FCA-B1B8-A12C68D1A66A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPIGSRSDPPU, "RVPIGSRSDPPU");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_DETAIL, "04DE503E-5E43-478E-B665-698AF16C04B6");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_DETAIL, "DETAIL");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDET, 0, 0, 3400, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDET, "B7ECFC63-FE8D-406B-912D-85DE94928689");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXVOCPEGDET, "BOXVOCPEGDET");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG, 100, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG, "DA922EB7-065D-4400-9EFD-D4DD5C9D7BAA");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VOCEPEG, BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPUU, MyGlb.VIS_DEFAREPOSTYL, 5, 303, 0, 271384705, "To String (VISTA BILBPR UO RISORSA INTERVENTO) +c trattino con spazi +c To String (VISTA BILBPR UO CAPITOLO) +c barra con spazi +c To String (VISTA BILBPR UO ARTICOLO)", "::RECORVOCEPEG", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPUU, "4A8901B4-DF71-4992-932E-F2905BD82964");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVPPPUDUPPUU, "RVPPPUDUPPUU");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDET, 3400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDET, "565CC935-E286-4A00-950B-EA9291892BBF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXCODBILDET, "BOXCODBILDET");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_CODICEBILANC, 3500, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILANC, "72312D41-35EA-4685-9FD9-35358A03F0F4");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILANC, "CODICEBILANC");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_CODICEBILANC, BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPUU, MyGlb.VIS_NORMALA8LEF1, 1, 19, 0, 271384705, "A GET CODICE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, VISTA BILBPR UO CAPITOLO, VISTA BILBPR UO ARTICOLO)", "::RECOCODIBILA", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPUU, "3F0B1605-DA15-4FEE-8897-8B224B04CC5A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RCBPPUDUPPUU, "RCBPPUDUPPUU");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPEDE, 6600, 0, 8200, 700, 0, 1, 3, MyGlb.VIS_BOX, 983041, 0, "", 3, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPEDE, "BC790FED-25FC-46A3-8A8F-CF664A2C3C05");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXDESVOPEDE, "BOXDESVOPEDE");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPEG, 6700, 100, 8000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPEG, "C1C17177-D10E-473C-A47F-0059ACC7B460");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_DESCRVOCEPEG, BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPPU, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384961, "If Equal (VISTA BILBPR UO E S, Spesa, If Equal (VISTA BILBPR UO ARTICOLO, Zero, If Equal (VISTA BILBPR UO CAPITOLO, Zero, Null String, If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), Null String)", "::RECDESVOCPEG", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPPU, "5CD2CE62-566B-4298-9A31-5486D9F43DBB");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RDVPPPUDUPPU, "RDVPPPUDUPPU");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET1, "57B7D81D-1313-4F4E-B763-7FF76AEB4E48");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXPREVIDET1, "BOXPREVIDET1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE1, 14800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE1, "65505639-7D53-49CF-99F2-698908A2E7C0");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE1, "PREVISIONE1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_PREVISIONE1, BUK_PRPEUOUTCODB_SPAN_RVBUPPPUDUPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "::PREVISIONE", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVBUPPPUDUPP, "CD9D8BDA-A58D-4A50-B430-B2E4159F3BA2");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVBUPPPUDUPP, "RVBUPPPUDUPP");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCODE, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCODE, "2F02DB56-7F39-42A1-BEAF-014B60840691");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXSTNINCODE, "BOXSTNINCODE");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_STNINICO1, 18000, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STNINICO1, "1B41FF77-4811-4FD2-81A6-D21D1E4F1DFC");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STNINICO1, "STNINICO1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STNINICO1, BUK_PRPEUOUTCODB_SPAN_RVBUSICPPUDU, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "::STN_INI_CO", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVBUSICPPUDU, "8187D480-6E46-4D9B-AC25-ABEC038A133D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVBUSICPPUDU, "RVBUSICPPUDU");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODET, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODET, "84C60F4D-C758-4C02-A846-C5BC5B47CE05");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXVARICODET, "BOXVARICODET");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC1, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC1, "FD6E55F3-A433-45DA-B159-E767836A0EBF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC1, "VARIAZIONIC1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_VARIAZIONIC1, BUK_PRPEUOUTCODB_SPAN_RVBUVCPPUDUP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "Brief description of field content.", "::VARIAZIONI_CO", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RVBUVCPPUDUP, "7EFC4831-5E65-409A-913A-5F06FF141C04");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RVBUVCPPUDUP, "RVBUVCPPUDUP");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE1, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE1, "C1C58D2E-B841-4849-BFD5-03E61A290BC7");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXSTADEFDE1, "BOXSTADEFDE1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_DETAIL, BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN1, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN1, "53EAD124-F20C-4E0F-A4F9-21FE78C8FF59");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN1, "STANZIDEFIN1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_STANZIDEFIN1, BUK_PRPEUOUTCODB_SPAN_RSDPPUDUPPUU, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "VISTA BILBPR UO STN INI CO + VISTA BILBPR UO VARIAZIONI CO", "::RECOSTANDEFI", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RSDPPUDUPPUU, "8FF51511-008D-4647-A255-823035BED678");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RSDPPUDUPPUU, "RSDPPUDUPPUU");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR, 1000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECRAGVOCPEG");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR, "D62595D4-D512-4DD6-97DE-11B131F21F5D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGVOCPEPIGR, "RAGVOCPEPIGR");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGTITO");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, "FA5F41F1-AA46-45FF-9C51-443A202E9077");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, "RAGTITGROFOO");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, "DF0C5E05-4602-4921-9652-4175390C8536");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOXPRETIGRF1, "BOXPRETIGRF1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, 14800, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, "C177A826-B036-4524-8F80-4C22A4775F3D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, "SUOFVIBIUOP2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP2, BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUPP1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUPP1, "48C32BB4-6035-4194-8010-D9C5BE6283D1");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUPP1, "RTGFSRVBUPP1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, "2F65E0D8-1683-4607-86EB-C6E154B647CE");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOTIG1, "BOSTINCOTIG1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, 18000, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, "B3A6D1BC-3991-4352-AD78-94254FC8084A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, "SUOFVIBIUSI2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI2, BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUSI1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUSI1, "7C6186E7-F789-4D81-9DEF-1CB0C2E011CF");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUSI1, "RTGFSRVBUSI1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, "4D317C15-791A-4BCF-9481-B690E995DE68");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOVACOTIGRF1, "BOVACOTIGRF1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, "34F14304-931B-4F57-AD64-144C3FBF0302");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, "SUOFVIBIUOV2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV2, BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUVC1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUVC1, "1936E405-FE56-406C-A9F4-0816E06A8E85");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RTGFSRVBUVC1, "RTGFSRVBUVC1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, "398FD3A6-6846-44D2-9CC7-D76A689A660B");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTDETIGRF1, "BOSTDETIGRF1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, "4668F2EC-E4B9-4B2C-A5D9-9C75E2D24B78");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, "SUMOFSTANDE2");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE2, BUK_PRPEUOUTCODB_SPAN_RTGFSRSDPPU1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RTGFSRSDPPU1, "B1A57381-3E70-4403-99C9-71B528F51F81");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RTGFSRSDPPU1, "RTGFSRSDPPU1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_TOTALETITOL1, 10600, 200, 4000, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_TOTALETITOL1, "202993F9-0E08-4A69-A83A-BED89DDAED5C");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_TOTALETITOL1, "TOTALETITOL1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_TOTALETITOL1, BUK_PRPEUOUTCODB_SPAN_CTIERVBUUTP1, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_CTIERVBUUTP1, "16109092-B568-45A7-AAD1-FE5AD8CFA246");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_CTIERVBUUTP1, "CTIERVBUUTP1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGTITGROFOO, BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, 14800, 100, 12900, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, "C47CF170-3180-4AC0-9A7A-2C0AD71E5334");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BARRTOTATIT1, "BARRTOTATIT1");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGUOES");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, "CB8C2DDA-E013-44D1-813D-4DC2BAF6C22D");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, "RAGUOESGROFO");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, 14800, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, "B3C52052-D2F4-441E-B158-789BCD5C8E9A");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOPRUOESGRF1, "BOPRUOESGRF1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, 14800, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, "82B98FC1-C29F-4DEA-87DC-A920AE41C74E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, "SUOFVIBIUOP3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOP3, BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUP1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUP1, "CC95FE10-1A9D-4F8F-B9C0-FA0595413172");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUP1, "RUEGFSRVBUP1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, 18000, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, "EF4B4966-4712-4CC5-AD6B-6CF8C017233E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTINCOUEGF, "BOSTINCOUEGF");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, 18000, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, "FE80A622-AF4A-41D7-8D90-39F21B42DC27");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, "SUOFVIBIUSI3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUSI3, BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUS1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUS1, "6BD7AACC-EEA3-4781-AE4C-C4B8C9A34FB1");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUS1, "RUEGFSRVBUS1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, "2F8B59C4-5F83-4AD2-9B7B-300600E01964");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOVACOUOESGF, "BOVACOUOESGF");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, "DFCC430E-B6CD-44DA-9B23-128BA8FC63D2");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, "SUOFVIBIUOV3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUOFVIBIUOV3, BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUV1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUV1, "D72DD9D2-AA7B-4680-A4AC-C35DD2B19E40");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RUEGFSRVBUV1, "RUEGFSRVBUV1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, "0188D3AB-47FB-4D26-AA00-9CDFDD3B0AAD");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BOSTDEUOESG2, "BOSTDEUOESG2");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, "C20E7302-33E1-47FB-BF11-7E2D58904A02");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, "SUMOFSTANDE3");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_SUMOFSTANDE3, BUK_PRPEUOUTCODB_SPAN_RUEGFSRSDPP1, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_RUEGFSRSDPP1, "FF3AADA8-3226-4C24-BA3F-5F8B01700F7C");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_RUEGFSRSDPP1, "RUEGFSRSDPP1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_TOTALE1, 11700, 200, 2900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_TOTALE1, "77B108B1-43C7-440E-85F1-A24EEE647AC5");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_TOTALE1, "TOTALE1");
    BUK_PRPEUOUTCODB.InitBoxSpan(BUK_PRPEUOUTCODB_RPTBOX_TOTALE1, BUK_PRPEUOUTCODB_SPAN_TOTALE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SPAN_TOTALE1, "58AE66DC-6816-420B-B30C-C1382A25A2EE");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SPAN_TOTALE1, "TOTALE1");
    BUK_PRPEUOUTCODB.InitReportBox(BUK_PRPEUOUTCODB_SEC_RAGUOESGROFO, BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, 14800, 100, 12900, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, "D9FE9AD2-712F-491F-8605-03BCE4BDB9F9");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_RPTBOX_BARRATOTALE1, "BARRATOTALE1");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_PAGEFOOTER, 200, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_PAGEFOOTER, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_PAGEFOOTER, "B7FE6E50-DD5B-4C11-B3AA-FD66C7780C0F");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_PRPEUOUTCODB.InitSection(BUK_PRPEUOUTCODB_RPT_PREPERUOGERE, BUK_PRPEUOUTCODB_SEC_REPORTFOOTER, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTCODB.SetSectionRendersInto(BUK_PRPEUOUTCODB_SEC_REPORTFOOTER, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
    BUK_PRPEUOUTCODB.SetRTCGuid(BUK_PRPEUOUTCODB_SEC_REPORTFOOTER, "F60398D2-CD23-4E8D-8AC5-45D6EC2E843E");
    BUK_PRPEUOUTCODB.SetObjCode(BUK_PRPEUOUTCODB_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGUOESGROHE, "RECORAGGUOES");
    BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGTITGROHEA, "RECORAGGTITO");
    BUK_PRPEUOUTCODB.AddReportGroup(BUK_PRPEUOUTCODB_SEC_RAGVOCPEINGR, "RECRAGVOCPEG");
    BUK_PRPEUOUTCODB_RPT_PREPERUOGERE_InitQuery(false, true);
  }

  private void BUK_PRPEUOUTCODB_InitLinks()
  {
    BUK_PRPEUOUTCODB.SetBoxNextBox(BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1, BUK_PRPEUOUTCODB_RPTBOX_PAGEBODY1);
  }

  private void BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA_Init()
  {
    BUK_PRPEUOUTSEDB.InitMastro(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, "7352AF18-C7E8-4B74-8DE2-2D8305AFE9C3");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, "STPRPEUOUTPA");
    BUK_PRPEUOUTSEDB.InitMastroBox(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, BUK_PRPEUOUTSEDB_RPTBOX_NUMEROPAGINA, 26100, 300, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_NUMEROPAGINA, "ADA5534C-4CD2-4E48-83CC-260D8061B754");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_NUMEROPAGINA, BUK_PRPEUOUTSEDB_SPAN_CPTSPPUUSDBP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_CPTSPPUUSDBP, "43FE0C5B-0789-4F41-A573-A1A3F32D8CC9");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_CPTSPPUUSDBP, "CPTSPPUUSDBP");
    BUK_PRPEUOUTSEDB.InitMastroBox(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, BUK_PRPEUOUTSEDB_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1800, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_PAGEHEADER, "657718BC-4989-414A-AB3F-D321DA8FBF7F");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOUTSEDB.InitMastroBox(BUK_PRPEUOUTSEDB_MST_STPRPEUOUTPA, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY, 1000, 3000, 27700, 16900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY, "79ED4DA0-16E0-48AE-B69D-791661FD5631");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_InitQuery() { BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_InitQuery(true, true); }
  private void BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(A.E_S, 'E', TO_CHAR ( A.RISORSA_INTERVENTO ), TO_CHAR ( A.TITOLO ) || ' - ' || TO_CHAR ( A.INTERVENTO_CATEGORIA )) as RECRISCODINT, ");
      SQL.append("  DECODE(A.E_S, 'E', A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,0,0), TO_CHAR ( B.DESCRIZIONE ) || ' - ' || C.DESCRIZIONE) as RECDESRICOIN, ");
      SQL.append("  TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA_UT ) || TO_CHAR ( A.E_S ) as RECORAGGUOES, ");
      SQL.append("  DECODE(~~PQRY_PAR113.PARTOTPERTIT~~, 'SI', DECODE(A.RISORSA_INTERVENTO, 0, DECODE(A.E_S, 'E', DECODE(A.CAPITOLO, 9999999999999998.0, 9999999999999998.0, DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999, A.TITOLO)), DECODE(A.CAPITOLO, 9999999999999999, 9999999999999999 + 1, A.TITOLO)), A.TITOLO), to_number(NULL)) as RECORAGGTITO, ");
      SQL.append("  DECODE(A.E_S, 'E', TO_CHAR ( A.RISORSA_INTERVENTO ), DECODE(~~PQRY_PAR113.PARTOTPERTIT~~, 'SI', NULL, TO_CHAR ( A.TITOLO )) || TO_CHAR ( A.INTERVENTO_CATEGORIA )) as RECRAGRICOIN, ");
      SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA_UT,TRUNC( SYSDATE )) as RECORDESCRUO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  NVL(A.PREVISIONE, 0) as PREVISIONE, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) as STN_INI_CO, ");
      SQL.append("  NVL(A.VARIAZIONI_CO, 0) as VARIAZIONI_CO, ");
      SQL.append("  NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) as RECOSTANDEFI ");
      SQL.append("from ");
      SQL.append("  VISTA_BILBPR_UO_UT A, ");
      SQL.append("  TITOLI B, ");
      SQL.append("  INTERVENTI C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.TIPO_BILANCIO = ~~PQRY_PAR113.PARADABILSIM~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_PAR113.PARAMPARTE~~ OR ~~PQRY_PAR113.PARAMPARTE~~ = 'ES') ");
      SQL.append("and   ((~~PQRY_PAR113.PARAMUOUTILI~~ IS NULL) OR (A.PROGR_UNITA_ORGANIZZATIVA_UT = ~~PQRY_PAR113.PARAMUOUTILI~~)) ");
      SQL.append("and   (B.E_S(+) = A.E_S) ");
      SQL.append("and   (B.TITOLO(+) = A.TITOLO) ");
      SQL.append("and   (C.TITOLO(+) = A.TITOLO) ");
      SQL.append("and   (C.INTERVENTO(+) = A.INTERVENTO_CATEGORIA) ");
      SQL.append("and   (C.S(+) = A.E_S) ");
      SQL.append("order by 3, 4, 5 ");
      BUK_PRPEUOUTSEDB.SetReportQuery(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "F131238A-55A7-4DF8-87BC-ED30A0F7A5A3");
      if (BUK_PRPEUOUTSEDB.FindObjByID(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE) != null)
        BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, "RECORAGGUOES");
      if (BUK_PRPEUOUTSEDB.FindObjByID(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA) != null)
        BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, "RECORAGGTITO");
      if (BUK_PRPEUOUTSEDB.FindObjByID(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE) != null)
        BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, "RECRAGRICOIN");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_Init()
  {
    BUK_PRPEUOUTSEDB.InitReport(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, 196865);
    BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_InitQuery(true, false);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "A0C763FF-0952-405C-9785-9A2AF4F0A0D7");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, "PREPERUOUTRE");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_REPORTHEADER, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_REPORTHEADER, "B394D0D0-350C-467B-9EDA-093BFE9E4376");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_PAGEHEADER, BUK_PRPEUOUTSEDB_RPTBOX_PAGEHEADER);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_PAGEHEADER, "72EDAD95-B62B-4E9E-ACB6-40ADEF864F5E");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_PAGEHEADER, BUK_PRPEUOUTSEDB_RPTBOX_RAGGRUPPAPER, 100, 200, 27500, 1000, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_RAGGRUPPAPER, "A8DAC1FA-068E-4B3B-A498-803CA55FEC51");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_RAGGRUPPAPER, "RAGGRUPPAPER");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_RAGGRUPPAPER, BUK_PRPEUOUTSEDB_SPAN_RAGGPERUOGES, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Previsioni per U.O. Utilizzo", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RAGGPERUOGES, "3FFC0118-23D5-4827-AE65-2E6F327E05A9");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RAGGPERUOGES, "RAGGPERUOGES");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGUOES");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, "E2A43FC9-27D6-4AD4-BDCD-5F9044C2ECBC");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, "RAGUOESGROHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONU1, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONU1, "F11954F5-7948-47D1-A4CB-F65D7FADCD39");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONU1, BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPU1, MyGlb.VIS_HEADSENZBOR1, 5, 201, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPU1, "CCB2BE75-D667-43E9-8C30-71C8ED6E29AC");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPU1, "RDUPPUDUPPU1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BOCOUOESGRHE, 0, 1000, 3300, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOCOUOESGRHE, "C015F823-1919-4A87-AC94-1A3E77D25C76");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOCOUOESGRHE, "BOCOUOESGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADE1, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADE1, "2E44CD2F-2568-404D-AE17-3B2B86FEC6C7");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADE1, BUK_PRPEUOUTSEDB_SPAN_VOCEPEG1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_VOCEPEG1, "177D0D13-A70F-40A2-B2BB-8FE23CC10685");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_VOCEPEG1, "VOCEPEG1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BODEUOESGRHE, 3300, 1000, 11600, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BODEUOESGRHE, "9A504F1A-ADA0-4B2C-96EF-9E11F9D5045F");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BODEUOESGRHE, "BODEUOESGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADE1, 3400, 1200, 11300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADE1, "A02F83A5-CDE4-40CF-876D-86FF02CC75CA");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADE1, BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE1, "CC95CF0D-972A-4C8E-AE9E-84C9CB1F5913");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRHE, 14900, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRHE, "42044185-1FC3-4C8C-8CD1-3BD9541AEF02");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRHE, "BOPRUOESGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, 14900, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, "0C869DD6-CB63-4DBF-963E-EA3AE3EDC859");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, "PREVISHEADE1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADE1, BUK_PRPEUOUTSEDB_SPAN_PREVISIONE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione ", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_PREVISIONE1, "23671144-C3B8-4A8A-8528-482F2FDCD8DD");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_PREVISIONE1, "PREVISIONE1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, 18100, 1000, 3100, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, "1EE8F593-FBA1-4946-B787-DFB9B601FA1D");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGH, "BOSTINUOESGH");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, 18100, 1200, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, "96EC8F59-C231-4B22-9A1F-125D90773B57");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, "STANINIZHEA1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEA1, BUK_PRPEUOUTSEDB_SPAN_STANZIINIZI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_STANZIINIZI1, "16292262-99CC-46DE-BF40-82AED8532BFC");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_STANZIINIZI1, "STANZIINIZI1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, "9BF4D794-150E-4266-A8E8-738947E09E35");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRHE, "BOVAUOESGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, "4CE97076-E47F-4C4D-A55A-8EBD8FF58482");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, "VARIAZHEADE1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADE1, BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI1, "0B4AE63A-C66E-424E-B543-31E541FA8A6D");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI1, "VARIAZIONI1");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, "67E19DD4-AAA2-4131-86CE-66F54D5F2F53");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGH, "BOSTDEUOESGH");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, "CEBE8EF3-FDCF-48B9-9A47-3F2EE4BAF68A");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, "STANDEFIHEA1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEA1, BUK_PRPEUOUTSEDB_SPAN_STANZIDEFIN1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_STANZIDEFIN1, "8462C550-4AF4-4349-939D-727F00E31681");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_STANZIDEFIN1, "STANZIDEFIN1");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, 2300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42795265, "RECORAGGTITO");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, "C7ECC12E-FA41-46DB-B7C0-51B565EAED95");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, "RAGTITGROHEA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONUO, 0, 0, 27700, 600, 0, 1, 3, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONUO, "F50EE52F-7DAA-4F8D-84A7-63BDADD0AAF0");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIZIONUO, BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPUU, MyGlb.VIS_HEADSENZBOR1, 5, 300, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPUU, "BA91747A-1C78-4DEE-8B88-F79ADF37504B");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RDUPPUDUPPUU, "RDUPPUDUPPUU");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOXCODTIGRHE, 0, 1000, 3300, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXCODTIGRHE, "08FD827D-B6B6-4B6F-8198-C30FA2043268");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXCODTIGRHE, "BOXCODTIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADER, 100, 1200, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADER, "2AB4E052-E844-4FF3-872A-BED2732738BE");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_CODICEHEADER, BUK_PRPEUOUTSEDB_SPAN_VOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_VOCEPEG, "073AC566-D48C-4D01-A27B-B2E0D36A98EF");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_VOCEPEG, "VOCEPEG");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOXDESTIGRHE, 3300, 1000, 11600, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXDESTIGRHE, "0E111324-2887-417F-9F05-DAF9605FBB95");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXDESTIGRHE, "BOXDESTIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADER, 3400, 1200, 11300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADER, "4F5295B1-7E36-4A5B-93F3-81EE81DCBB11");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_DESCRIHEADER, BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE, "D7D3470C-63BF-4248-A472-1720158B122D");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRHE, 14900, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRHE, "170C3C2C-B007-4C14-87AA-BEB829A5DC03");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRHE, "BOXPRETIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, 14900, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, "ECFF1364-D9A2-4DA5-B558-E2BB26E36B01");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, "PREVISHEADER");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_PREVISHEADER, BUK_PRPEUOUTSEDB_SPAN_PREVISIONE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsione", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_PREVISIONE, "28BF23DC-1380-4F52-AA03-1E8C7E1A271A");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_PREVISIONE, "PREVISIONE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, 18100, 1000, 3100, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, "76E6F799-8F4C-4E68-B9BD-51701F654499");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRHE, "BOSTINTIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, 18100, 1200, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, "A34DFEDE-D6C3-43A1-8743-B2A6C84D9862");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, "STANINIZHEAD");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STANINIZHEAD, BUK_PRPEUOUTSEDB_SPAN_STANZIINIZIA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento        Iniziale", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_STANZIINIZIA, "25A1D9AE-37DB-43C2-8431-8CA9968B9807");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_STANZIINIZIA, "STANZIINIZIA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, 21200, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, "E8E71A64-71B1-40DC-857B-6C841A21312D");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRHE, "BOXVARTIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, 21200, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, "54739365-0F58-4F7D-ADEE-1BDAEADA16AC");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZHEADER, BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI, "B88A6A74-CCCB-4952-900B-8103C743A1DF");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_VARIAZIONI, "VARIAZIONI");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, 24400, 1000, 3200, 1300, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, "690F8A11-D977-4B81-9E6F-44DC5BB98F0F");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRHE, "BOSTDETIGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, 24400, 1200, 3100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, "3059D219-A8A1-4182-A817-D2FE7DD5B591");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, "STANDEFIHEAD");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STANDEFIHEAD, BUK_PRPEUOUTSEDB_SPAN_STANZIDEFINI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_STANZIDEFINI, "9CFA1574-5067-4A53-85E6-D2A179C3ACC6");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_STANZIDEFINI, "STANZIDEFINI");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, 700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECRAGRICOIN");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, "A116C822-E880-4287-A127-260D754C6EDB");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, "RARICOINGRHE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXCODICDETA, 0, 0, 3300, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXCODICDETA, "200FD4B4-F180-4352-9224-87A4705C418C");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXCODICDETA, "BOXCODICDETA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE, 100, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE, "B6CDFD53-5BAB-4421-9C38-EA8DBB3B964C");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE, "RISORCODINTE");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_RISORCODINTE, BUK_PRPEUOUTSEDB_SPAN_RRCIPPUDUPPU, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "To String (VISTA BILBPR UO RISORSA INTERVENTO) +c trattino con spazi +c To String (VISTA BILBPR UO CAPITOLO) +c barra con spazi +c To String (VISTA BILBPR UO ARTICOLO)", "::RECRISCODINT", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RRCIPPUDUPPU, "9F156DB6-754F-47E5-8796-800086B84BD8");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RRCIPPUDUPPU, "RRCIPPUDUPPU");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXDESCRDETA, 3300, 0, 11600, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXDESCRDETA, "72896AEC-A2AA-4E3A-9252-0494D533C31F");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXDESCRDETA, "BOXDESCRDETA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT, 3400, 100, 11400, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT, "ECC197D8-BDFB-4A02-A19F-D0EA0B3EBDF1");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT, "DESRISCODINT");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_DESRISCODINT, BUK_PRPEUOUTSEDB_SPAN_RDRCIPPUDUPP, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "If Equal (VISTA BILBPR UO E S, Spesa, If Equal (VISTA BILBPR UO ARTICOLO, Zero, If Equal (VISTA BILBPR UO CAPITOLO, Zero, Null String, If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), If Equal (Param Descrizioni Intervernto [Previsioni Per Unita Di Gestione - Previsioni Per UO Gestione], SI, trattino con spazi +c A GET DESCRIZIONE CAP (VISTA BILBPR UO ESERCIZIO, VISTA BILBPR UO E S, VISTA BILBPR UO RISORSA INTERVENTO, Zero, Zero), Null String)), Null String)", "::RECDESRICOIN", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RDRCIPPUDUPP, "0878B0E5-67C9-4B76-BD08-2BF28C2B3049");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RDRCIPPUDUPP, "RDRCIPPUDUPP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXPREVIDETA, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXPREVIDETA, "1BA64943-4861-4CAC-9B0A-5E463C82F4F0");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXPREVIDETA, "BOXPREVIDETA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, 14900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, "8338D0DF-4621-44D5-B486-ED83FA12C3A4");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, "PREVISIONE");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_PREVISIONE, BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUP, "82943454-4D60-463E-AD18-0DDB96517342");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUP, "RRCIGHSRVBUP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, "C77E5BA7-48AB-483C-ACDF-45B8658738E2");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTAINIDET, "BOXSTAINIDET");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, 18100, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, "C38AE7C3-604F-41F1-B51D-356F4EA5FCC5");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, "STNINICO");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STNINICO, BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUS, "23369F73-60B5-4B52-8BB1-6E38778D1DF2");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUS, "RRCIGHSRVBUS");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, "E3FBBFA4-3401-4520-A865-26DCEFB6F3DE");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARIADETA, "BOXVARIADETA");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, 21200, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, "BB9CE9AC-8235-4F36-B402-025E56B9A4FF");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, "VARIAZIONICO");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_VARIAZIONICO, BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUV, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUV, "22DEC035-1B6A-45B7-A3CD-5AA07DE65F62");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRVBUV, "RRCIGHSRVBUV");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, "4689DE01-3D22-4862-BF65-C8B5B6940519");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXSTADEFDET, "BOXSTADEFDET");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, 24400, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, "46CEA9B1-A467-4467-9DC5-0277F2DD7ED5");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, "STANZIDEFINI");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_STANZIDEFINI, BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRSDPP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "VISTA BILBPR UO STN INI CO + VISTA BILBPR UO VARIAZIONI CO", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRSDPP, "22315324-1282-4AE2-A7DB-06D17405FBE5");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RRCIGHSRSDPP, "RRCIGHSRSDPP");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_DETAIL, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_DETAIL, "00D4A1D3-4007-4465-A943-B3E777E6FA0B");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_DETAIL, "DETAIL");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECRAGRICOIN");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO, "121139D3-6452-4EE4-9FF4-95FAB7E79A77");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RARICOINGRFO, "RARICOINGRFO");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGTITO");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, "9C9DFBB4-63CE-42EE-AF77-58762148CB8C");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, "RAGTITGROFOO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, "4B891382-386E-4FB8-A1A7-D20F11B04F42");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXPRETIGRFO, "BOXPRETIGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, 14900, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, "842D8644-1747-45A2-A27C-A0DC05A8D198");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, "SUOFVIBIUOP1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOP1, BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUPPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUPPP, "64F711D4-B758-4963-A801-A1B08068C9BD");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUPPP, "RTGFSRVBUPPP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, "44014E6D-27DA-4C0B-A7BA-6B6A406B928D");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINTIGRFO, "BOSTINTIGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, 18100, 200, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, "D0374B5D-1768-4125-AEFF-73255E3A767B");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, "SUOFVIBIUSI1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSI1, BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUSIC, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUSIC, "B70DD830-EC63-4B90-A32D-F96DDFDD0EB1");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUSIC, "RTGFSRVBUSIC");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, "B4F4970C-F13A-4E08-AF44-7B4E5A7201F3");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOXVARTIGRFO, "BOXVARTIGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, "C3F6FC55-A212-4F24-964A-D8BC150C23DA");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, "SUOFVIBIUOV1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOV1, BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUVCP, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUVCP, "4AA4AA88-55B0-4028-9A95-C1806137A1EF");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RTGFSRVBUVCP, "RTGFSRVBUVCP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, "6E629BD1-A7B5-4699-A0E5-218FFDF21FF3");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDETIGRFO, "BOSTDETIGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, "D9E75FE3-5797-4560-9609-8C8B38B8F5BA");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, "SUMOFSTANDE1");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDE1, BUK_PRPEUOUTSEDB_SPAN_RTGFSRSDPPUD, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RTGFSRSDPPUD, "DD675A7E-AC37-4251-A9BD-2D3526D7F745");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RTGFSRSDPPUD, "RTGFSRSDPPUD");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_TOTALETITOLO, 10700, 100, 4000, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_TOTALETITOLO, "5D1E43D0-F7F4-485C-8BA4-3A99A74502C6");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_TOTALETITOLO, "TOTALETITOLO");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_TOTALETITOLO, BUK_PRPEUOUTSEDB_SPAN_CTIERVBUUTPP, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_CTIERVBUUTPP, "30D10293-E4CC-4C93-AACE-FAA3D4814181");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_CTIERVBUUTPP, "CTIERVBUUTPP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGTITGROFOO, BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, 14900, 100, 12700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, "0221AB01-F07A-4F37-A2A9-19739C6F6D35");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BARRTOTATITO, "BARRTOTATITO");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, 2600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGUOES");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, "8662234C-6C99-45ED-A079-208E50F16215");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, "RAGUOESGROFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, 14900, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, "3F4D0D7E-750D-4C14-95F3-387841E2B1CA");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOPRUOESGRFO, "BOPRUOESGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, 14900, 300, 3100, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, "DEFEEC4D-612C-422E-BBAB-78CE3ADDA271");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, "SUOFVIBIUOPR");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOPR, BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUPP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUPP, "B79AB767-0E5C-4F9F-958E-BAABEA929E47");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUPP, "RUEGFSRVBUPP");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, 18100, 0, 3100, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, "63085F08-1C1F-4858-A18D-B537DC9C6C5C");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTINUOESGF, "BOSTINUOESGF");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, 18100, 200, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, "1B185636-64CC-4156-86B7-FD04122EFB0C");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, "SUOFVIBIUSIC");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUSIC, BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUSI, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUSI, "E3F48D90-ECFD-415A-9E8D-5189A563F38F");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUSI, "RUEGFSRVBUSI");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, 21200, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, "5BBE228D-2A3E-4A4C-9E6C-F3F649B190BF");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOVAUOESGRFO, "BOVAUOESGRFO");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, 21200, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, "39DA87D6-5493-4239-955B-B6A8FD596CB4");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, "SUOFVIBIUOVC");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUOFVIBIUOVC, BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUVC, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUVC, "A90C62E4-5510-437E-BAD4-FD76F7F70989");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRVBUVC, "RUEGFSRVBUVC");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, 24400, 0, 3200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, "889E0300-352D-4A04-BAFD-23893ACE2DB0");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BOSTDEUOESGF, "BOSTDEUOESGF");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, 24400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, "1C3BB0E5-1537-46EF-9DB1-D90AEC57FFE5");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, "SUMOFSTANDEF");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_SUMOFSTANDEF, BUK_PRPEUOUTSEDB_SPAN_RUEGFSRSDPPU, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRSDPPU, "E177D283-AF9D-450B-B6D3-13F9432A8F89");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_RUEGFSRSDPPU, "RUEGFSRSDPPU");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_TOTALE, 11800, 200, 2900, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_TOTALE, "86F2A7BE-ACD2-4637-B197-D4C1CEAA0791");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_TOTALE, "TOTALE");
    BUK_PRPEUOUTSEDB.InitBoxSpan(BUK_PRPEUOUTSEDB_RPTBOX_TOTALE, BUK_PRPEUOUTSEDB_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SPAN_TOTALE, "CDB195AF-E210-45AB-A136-267B7577864A");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SPAN_TOTALE, "TOTALE");
    BUK_PRPEUOUTSEDB.InitReportBox(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROFO, BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, 14900, 100, 12700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, "9C74A353-FDEF-4DA5-A1D5-CBBB8802E537");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_RPTBOX_BARRATOTALE, "BARRATOTALE");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER, "2546589D-373A-429C-B1B9-7D59534B3AA5");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_PRPEUOUTSEDB.InitSection(BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE, BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PRPEUOUTSEDB.SetSectionRendersInto(BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
    BUK_PRPEUOUTSEDB.SetRTCGuid(BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER, "6B1E1A6D-E7B9-4854-B340-7ECA8BC71100");
    BUK_PRPEUOUTSEDB.SetObjCode(BUK_PRPEUOUTSEDB_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RAGUOESGROHE, "RECORAGGUOES");
    BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RAGTITGROHEA, "RECORAGGTITO");
    BUK_PRPEUOUTSEDB.AddReportGroup(BUK_PRPEUOUTSEDB_SEC_RARICOINGRHE, "RECRAGRICOIN");
    BUK_PRPEUOUTSEDB_RPT_PREPERUOUTRE_InitQuery(false, true);
  }

  private void BUK_PRPEUOUTSEDB_InitLinks()
  {
    BUK_PRPEUOUTSEDB.SetBoxNextBox(BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY, BUK_PRPEUOUTSEDB_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVPERUOUTI) PAN_PREVPERUOUTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVPERUOUTI) PAN_PREVPERUOUTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVPERUOUTI) PAN_PREVPERUOUTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVPERUOUTI) PAN_PREVPERUOUTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVPERUOUTI) PAN_PREVPERUOUTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnFormattingSection(SectionID);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnFormattingPage(PageID);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnConnecting(DBConn);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_Activated(ObjID, BoxName);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PRPEUOUTCODB) BUK_PRPEUOUTCODB_OnPreview();
    if (SrcObj == BKW_PRPEUOUTSEDB) BUK_PRPEUOUTSEDB_OnPreview();
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
