// **********************************************
// Elenco Variazioni Generate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoVariazioniGenerate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENVARIGEN1_ESERCIZIO = 0;
  private static int PFL_ELENVARIGEN1_DETTAVOCIPEG = 1;
  private static int PFL_ELENVARIGEN1_ELABORA = 2;

  private static int PPQRY_PARS17 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_ELENVARIGEN1;
  CIDREObj BUK_ELENVARIGENE;
  OBook BKW_ELENVARIGENE;
  //
  // Template Pages constants
  private static int BUK_ELENVARIGENE_MST_ELEVARBOZPAG = 1;
  private static int BUK_ELENVARIGENE_RPTBOX_PAGEHEADER = 2;
  private static int BUK_ELENVARIGENE_RPTBOX_PAGEBODY = 3;
  private static int BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER = 4;
  private static int BUK_ELENVARIGENE_RPTBOX_PAG = 5;
  private static int BUK_ELENVARIGENE_SPAN_CPTSEVGEVGPN = 6;

  //
  // Reports constants
  private static int BUK_ELENVARIGENE_RPT_DETDELVADIEN = 7;
  private static int BUK_ELENVARIGENE_SEC_REPORTHEADE1 = 8;
  private static int BUK_ELENVARIGENE_RPTBOX_LOGO1 = 9;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO4 = 10;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO3 = 11;
  private static int BUK_ELENVARIGENE_SEC_PAGEHEADER2 = 12;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG1 = 13;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO8 = 14;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO15 = 15;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGH2 = 16;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD4 = 17;
  private static int BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP2 = 18;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE4 = 19;
  private static int BUK_ELENVARIGENE_SPAN_DESCRIZIONE6 = 20;
  private static int BUK_ELENVARIGENE_RPTBOX_STANATTUHEA6 = 21;
  private static int BUK_ELENVARIGENE_SPAN_STANZIATTUA8 = 22;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX10 = 23;
  private static int BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA6 = 24;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT8 = 25;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA6 = 26;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZPOSIT8 = 27;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX7 = 28;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL5 = 29;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT2 = 30;
  private static int BUK_ELENVARIGENE_SEC_VOCPEGGROHE1 = 31;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEG6 = 32;
  private static int BUK_ELENVARIGENE_SPAN_REVPEGEVGEV1 = 33;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4 = 34;
  private static int BUK_ELENVARIGENE_SPAN_REDEELVAGEV1 = 35;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8 = 36;
  private static int BUK_ELENVARIGENE_SPAN_RESTATEVGEV1 = 37;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT8 = 38;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT8 = 39;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL6 = 40;
  private static int BUK_ELENVARIGENE_SEC_DETAIL1 = 41;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEG1 = 42;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA1 = 43;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT1 = 44;
  private static int BUK_ELENVARIGENE_SPAN_REVAPOEVGEV8 = 45;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT4 = 46;
  private static int BUK_ELENVARIGENE_SPAN_REVANEEVGEV8 = 47;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL1 = 48;
  private static int BUK_ELENVARIGENE_SEC_VOCPEGGROFO1 = 49;
  private static int BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG2 = 50;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT2 = 51;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT4 = 52;
  private static int BUK_ELENVARIGENE_SPAN_VARPOS3 = 53;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT7 = 54;
  private static int BUK_ELENVARIGENE_SPAN_VARNEG3 = 55;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT8 = 56;
  private static int BUK_ELENVARIGENE_SPAN_RSAEVGEVGVP1 = 57;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX11 = 58;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG2 = 59;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA3 = 60;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA2 = 61;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX12 = 62;
  private static int BUK_ELENVARIGENE_SEC_PAGEFOOTER2 = 63;
  private static int BUK_ELENVARIGENE_SEC_REPORTFOOTE2 = 64;
  private static int BUK_ELENVARIGENE_RPT_RIEDEITIDIEN = 65;
  private static int BUK_ELENVARIGENE_SEC_REPORTHEADE3 = 66;
  private static int BUK_ELENVARIGENE_SEC_PAGEHEADER3 = 67;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG3 = 68;
  private static int BUK_ELENVARIGENE_RPTBOX_STANATTUHEA4 = 69;
  private static int BUK_ELENVARIGENE_SPAN_STANZIATTUA6 = 70;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA4 = 71;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZPOSIT6 = 72;
  private static int BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA1 = 73;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT6 = 74;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO5 = 75;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO10 = 76;
  private static int BUK_ELENVARIGENE_RPTBOX_RIEPILOGO2 = 77;
  private static int BUK_ELENVARIGENE_SPAN_RIEPILOGO2 = 78;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX5 = 79;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGH3 = 80;
  private static int BUK_ELENVARIGENE_SEC_RAGTITGROHE1 = 81;
  private static int BUK_ELENVARIGENE_SEC_DETAIL3 = 82;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO10 = 83;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO13 = 84;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTU10 = 85;
  private static int BUK_ELENVARIGENE_SPAN_RESTATEVGEV6 = 86;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI10 = 87;
  private static int BUK_ELENVARIGENE_SPAN_REVAPOEVGEV6 = 88;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT1 = 89;
  private static int BUK_ELENVARIGENE_SPAN_REVANEEVGEV6 = 90;
  private static int BUK_ELENVARIGENE_SEC_RAGTITGROFO1 = 91;
  private static int BUK_ELENVARIGENE_RPTBOX_TOTALEENTRA1 = 92;
  private static int BUK_ELENVARIGENE_SPAN_TOTALEENTRA2 = 93;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTU11 = 94;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG2 = 95;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI11 = 96;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG2 = 97;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA11 = 98;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG2 = 99;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG4 = 100;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA6 = 101;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX8 = 102;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA3 = 103;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRS2 = 104;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT3 = 105;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRV3 = 106;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT3 = 107;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRV4 = 108;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGF2 = 109;
  private static int BUK_ELENVARIGENE_SEC_PAGEFOOTER3 = 110;
  private static int BUK_ELENVARIGENE_SEC_REPORTFOOTE3 = 111;
  private static int BUK_ELENVARIGENE_RPT_DETDELVADISP = 112;
  private static int BUK_ELENVARIGENE_SEC_REPORTHEADE2 = 113;
  private static int BUK_ELENVARIGENE_SEC_PAGEHEADER1 = 114;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG5 = 115;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO7 = 116;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO14 = 117;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGH4 = 118;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD3 = 119;
  private static int BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP1 = 120;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE3 = 121;
  private static int BUK_ELENVARIGENE_SPAN_DESCRIZIONE5 = 122;
  private static int BUK_ELENVARIGENE_RPTBOX_STANATTUHEA5 = 123;
  private static int BUK_ELENVARIGENE_SPAN_STANZIATTUA7 = 124;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX9 = 125;
  private static int BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA5 = 126;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT7 = 127;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA5 = 128;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZPOSIT7 = 129;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX6 = 130;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL2 = 131;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT1 = 132;
  private static int BUK_ELENVARIGENE_SEC_VOCPEGGROHEA = 133;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEG5 = 134;
  private static int BUK_ELENVARIGENE_SPAN_REVPEGEVGEVG = 135;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE = 136;
  private static int BUK_ELENVARIGENE_SPAN_REREDEVGEVGB = 137;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7 = 138;
  private static int BUK_ELENVARIGENE_SPAN_RESTATEVGEVG = 139;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT7 = 140;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT7 = 141;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL3 = 142;
  private static int BUK_ELENVARIGENE_SEC_DETAIL2 = 143;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEG4 = 144;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE1 = 145;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTU13 = 146;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI13 = 147;
  private static int BUK_ELENVARIGENE_SPAN_REVAPOEVGEV7 = 148;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA13 = 149;
  private static int BUK_ELENVARIGENE_SPAN_REVANEEVGEV7 = 150;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIRISUL4 = 151;
  private static int BUK_ELENVARIGENE_RPTBOX_VOCEPEG2 = 152;
  private static int BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE2 = 153;
  private static int BUK_ELENVARIGENE_SEC_VOCPEGGROFOO = 154;
  private static int BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG1 = 155;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT = 156;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT1 = 157;
  private static int BUK_ELENVARIGENE_SPAN_VARPOS2 = 158;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT6 = 159;
  private static int BUK_ELENVARIGENE_SPAN_VARNEG2 = 160;
  private static int BUK_ELENVARIGENE_RPTBOX_TOT3 = 161;
  private static int BUK_ELENVARIGENE_SPAN_RSAEVGEVGVPE = 162;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX4 = 163;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESG6 = 164;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA4 = 165;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA1 = 166;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX1 = 167;
  private static int BUK_ELENVARIGENE_SEC_PAGEFOOTER1 = 168;
  private static int BUK_ELENVARIGENE_SEC_REPORTFOOTE1 = 169;
  private static int BUK_ELENVARIGENE_RPT_RIEDEITIDISP = 170;
  private static int BUK_ELENVARIGENE_SEC_REPORTHEADER = 171;
  private static int BUK_ELENVARIGENE_SEC_PAGEHEADER = 172;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESGH = 173;
  private static int BUK_ELENVARIGENE_RPTBOX_STANATTUHEA2 = 174;
  private static int BUK_ELENVARIGENE_SPAN_STANZIATTUA3 = 175;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA2 = 176;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZPOSIT3 = 177;
  private static int BUK_ELENVARIGENE_RPTBOX_VARINEGAHEAD = 178;
  private static int BUK_ELENVARIGENE_SPAN_VARIAZNEGAT3 = 179;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO3 = 180;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO8 = 181;
  private static int BUK_ELENVARIGENE_RPTBOX_RIEPILOGO1 = 182;
  private static int BUK_ELENVARIGENE_SPAN_RIEPILOGO1 = 183;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX2 = 184;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGH1 = 185;
  private static int BUK_ELENVARIGENE_SEC_RAGTITGROHEA = 186;
  private static int BUK_ELENVARIGENE_SEC_DETAIL = 187;
  private static int BUK_ELENVARIGENE_RPTBOX_TITOLO9 = 188;
  private static int BUK_ELENVARIGENE_SPAN_TITOLO9 = 189;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA4 = 190;
  private static int BUK_ELENVARIGENE_SPAN_RESTATEVGEV2 = 191;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT5 = 192;
  private static int BUK_ELENVARIGENE_SPAN_REVAPOEVGEV2 = 193;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGATI = 194;
  private static int BUK_ELENVARIGENE_SPAN_REVANEEVGEV2 = 195;
  private static int BUK_ELENVARIGENE_SEC_RAGTITGROFOO = 196;
  private static int BUK_ELENVARIGENE_RPTBOX_TOTALEENTRAT = 197;
  private static int BUK_ELENVARIGENE_SPAN_TOTALEENTRA1 = 198;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA6 = 199;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG1 = 200;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT6 = 201;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG1 = 202;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT6 = 203;
  private static int BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG1 = 204;
  private static int BUK_ELENVARIGENE_SEC_POWRELVAESGF = 205;
  private static int BUK_ELENVARIGENE_RPTBOX_NEWBOX3 = 206;
  private static int BUK_ELENVARIGENE_RPTBOX_STANZIATTUA2 = 207;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRS1 = 208;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT2 = 209;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRV1 = 210;
  private static int BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT2 = 211;
  private static int BUK_ELENVARIGENE_SPAN_PWEVESGFSRV2 = 212;
  private static int BUK_ELENVARIGENE_RPTBOX_BARRA = 213;
  private static int BUK_ELENVARIGENE_SEC_POWRELVESGF1 = 214;
  private static int BUK_ELENVARIGENE_SEC_PAGEFOOTER = 215;
  private static int BUK_ELENVARIGENE_SEC_REPORTFOOTER = 216;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN11(IMDB);
    Init_TBL_PARS16(IMDB);
    //
    //
    Init_PQRY_PARS17(IMDB);
    Init_PQRY_PARS17_RS(IMDB);
    Init_PQRY_POLWRKELVBO2(IMDB);
    Init_PQRY_POLWRKELVBO3(IMDB);
    Init_PQRY_POLWRKELVBO1(IMDB);
    Init_PQRY_POLWRKELVBOZ(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN11, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN11, "TBL_IN11");
    IMDB.set_FldCode(IMDBDef4.TBL_IN11,IMDBDef4.FLD_IN11_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_IN11,IMDBDef4.FLD_IN11_ROWNAMEVARID,1,8,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN11, 0);
  }

  private static void Init_TBL_PARS16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS16, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS16, "TBL_PARS16");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNADEVOPEG, "ROWNADEVOPEG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNADEVOPEG,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNAMVOPECH, "ROWNAMVOPECH");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_ROWNAMVOPECH,5,40,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_RONAVOPEDAC1, "RONAVOPEDAC1");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS16,IMDBDef4.FLD_PARS16_RONAVOPEDAC1,5,40,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS16, 0);
  }

  private static void Init_PQRY_PARS17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS17, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS17, "PQRY_PARS17");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS17,IMDBDef12.PQSL_PARS17_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS17,IMDBDef12.PQSL_PARS17_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS17,IMDBDef12.PQSL_PARS17_ROWNADEVOPEG, "ROWNADEVOPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS17,IMDBDef12.PQSL_PARS17_ROWNADEVOPEG,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS17, 0);
  }

  private static void Init_PQRY_PARS17_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS17_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS17_RS, "PQRY_PARS17_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS17_RS,IMDBDef12.PQSL_PARS17_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS17_RS,IMDBDef12.PQSL_PARS17_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS17_RS,IMDBDef12.PQSL_PARS17_ROWNADEVOPEG, "ROWNADEVOPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS17_RS,IMDBDef12.PQSL_PARS17_ROWNADEVOPEG,5,2,0);
  }

  private static void Init_PQRY_POLWRKELVBO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKELVBO2, 14);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKELVBO2, "PQRY_POLWRKELVBO2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_DESCRIZIONE,5,300,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_STANZIAMENTO_ATTUALE, "STANZIAMENTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_STANZIAMENTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VARIAZIONI_POSITIVE, "VARIAZIONI_POSITIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VARIAZIONI_POSITIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VARIAZIONI_NEGATIVE, "VARIAZIONI_NEGATIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_VARIAZIONI_NEGATIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_DESCRIZIONE_VAR, "DESCRIZIONE_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_DESCRIZIONE_VAR,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO2,IMDBDef12.PQSL_POLWRKELVBO2_ANNO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKELVBO2, 0);
  }

  private static void Init_PQRY_POLWRKELVBO3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKELVBO3, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKELVBO3, "PQRY_POLWRKELVBO3");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_DESCRIZIONE,5,300,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_STANZIAMENTO_ATTUALE, "STANZIAMENTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_STANZIAMENTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VARIAZIONI_POSITIVE, "VARIAZIONI_POSITIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VARIAZIONI_POSITIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VARIAZIONI_NEGATIVE, "VARIAZIONI_NEGATIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_VARIAZIONI_NEGATIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_RECORAGGTITO,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO3,IMDBDef12.PQSL_POLWRKELVBO3_TITOLO,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKELVBO3, 0);
  }

  private static void Init_PQRY_POLWRKELVBO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKELVBO1, 14);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKELVBO1, "PQRY_POLWRKELVBO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_DESCRIZIONE,5,300,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_STANZIAMENTO_ATTUALE, "STANZIAMENTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_STANZIAMENTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VARIAZIONI_POSITIVE, "VARIAZIONI_POSITIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VARIAZIONI_POSITIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VARIAZIONI_NEGATIVE, "VARIAZIONI_NEGATIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_VARIAZIONI_NEGATIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_DESCRIZIONE_VAR, "DESCRIZIONE_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_DESCRIZIONE_VAR,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBO1,IMDBDef12.PQSL_POLWRKELVBO1_ANNO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKELVBO1, 0);
  }

  private static void Init_PQRY_POLWRKELVBOZ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKELVBOZ, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKELVBOZ, "PQRY_POLWRKELVBOZ");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_DESCRIZIONE,5,300,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_STANZIAMENTO_ATTUALE, "STANZIAMENTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_STANZIAMENTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VARIAZIONI_POSITIVE, "VARIAZIONI_POSITIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VARIAZIONI_POSITIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VARIAZIONI_NEGATIVE, "VARIAZIONI_NEGATIVE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_VARIAZIONI_NEGATIVE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_RECORAGGTITO, "RECORAGGTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_RECORAGGTITO,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKELVBOZ,IMDBDef12.PQSL_POLWRKELVBOZ_TITOLO,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKELVBOZ, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoVariazioniGenerate(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoVariazioniGenerate()
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
    FormIdx = MyGlb.FRM_ELENVARIGENE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "86908787-FB38-4D24-8BAD-E01C467FBF06";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 276;
    DesignHeight = 182;
    set_Caption(new IDVariant("Elenco Variazioni Generate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 276;
    Frames[1].Height = 156;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Elenco Variazioni Generate";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 156;
    PAN_ELENVARIGEN1 = new IDPanel(w, this, 1, "PAN_ELENVARIGEN1");
    Frames[1].Content = PAN_ELENVARIGEN1;
    PAN_ELENVARIGEN1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENVARIGEN1.VS = MainFrm.VisualStyleList;
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 276-MyGlb.PAN_OFFS_X, 156-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENVARIGEN1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3D18B42A-E68E-4E44-A4D3-5B0B9DBEBB3C");
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENVARIGEN1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENVARIGEN1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENVARIGEN1.InitStatus = 2;
    PAN_ELENVARIGEN1_Init();
    PAN_ELENVARIGEN1_InitFields();
    PAN_ELENVARIGEN1_InitQueries();
    BKW_ELENVARIGENE = new OBook(this);
    BUK_ELENVARIGENE = new CIDREObj(BKW_ELENVARIGENE);
    BKW_ELENVARIGENE.iGuid = "BB858F19-0F99-42D1-BBA6-5BE800750BB9";
    BKW_ELENVARIGENE.Code = "BUK_ELENVARIGENE";
    BKW_ELENVARIGENE.BookObj = BUK_ELENVARIGENE;
    BKW_ELENVARIGENE.InitDefMasks();
    BUK_ELENVARIGENE.InitBook(1, 1245441, "Elenco Variazioni Generate", IMDB, MainFrm.VisualStyleList);
    BUK_ELENVARIGENE.InitHTML();
    BUK_ELENVARIGENE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ELENVARIGENE.Book.SetMainFrm(MainFrm);
    BUK_ELENVARIGENE.SetRTCGuid(0, "BB858F19-0F99-42D1-BBA6-5BE800750BB9");
    BUK_ELENVARIGENE.SetObjCode(0, "ELENVARIGENE");
    BUK_ELENVARIGENE_MST_ELEVARBOZPAG_Init();
    BUK_ELENVARIGENE_RPT_DETDELVADIEN_Init();
    BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_Init();
    BUK_ELENVARIGENE_RPT_DETDELVADISP_Init();
    BUK_ELENVARIGENE_RPT_RIEDEITIDISP_Init();
    BUK_ELENVARIGENE_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS16, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENVARIGENE_PARS17();
      }
      PAN_ELENVARIGEN1.UpdatePanel(MainFrm);
      // BUK_ELENVARIGENE.UpdateBook();
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
    if (Code.equals("BUK_ELENVARIGENE")) return BUK_ELENVARIGENE;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoVariazioniGenerate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoVariazioniGenerate.class.getName() : (Glb.ClassWithPackage(ElencoVariazioniGenerate.class) ? ElencoVariazioniGenerate.class.getName().substring(ElencoVariazioniGenerate.class.getPackage().getName().length() + 1) : ElencoVariazioniGenerate.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS17, IMDBDef12.PQSL_PARS17_ROWNAMEESERC, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Esercizio obbligatorio", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLWORKELVVARI(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef4.TBL_IN11, IMDBDef4.FLD_IN11_ROWNAMEVARID, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARS17, IMDBDef12.PQSL_PARS17_ROWNAMEESERC, 0), IMDB.Value(IMDBDef12.PQRY_PARS17, IMDBDef12.PQSL_PARS17_ROWNADEVOPEG, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_PAGINA = new IDVariant(0,IDVariant.INTEGER);
        v_PAGINA = (new IDVariant(0));
        BUK_ELENVARIGENE.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_ELENVARIGENE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        v_PAGINA = IDL.Sub((new IDVariant(BUK_ELENVARIGENE.GetTotalPagesNumber())), (new IDVariant(1)));
        // MainFrm.set_AlertMessage(IDL.ToString(v_PAGINA)); 
        BUK_ELENVARIGENE.PrintBook((new IDVariant(1)).intValue(), v_PAGINA.intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_ELENVARIGENE.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNADEVOPEG, 0, (new IDVariant()));
      BUK_ELENVARIGENE.SetBoxImage(BUK_ELENVARIGENE_RPTBOX_LOGO1, null, (new IDVariant("logo.bmp")).toString()); 
      IMDB.set_Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMVOPECH, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_RONAVOPEDAC1, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni Generate Esercizio Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ELENVARIGEN1_ESERCIZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni Generate Esercizio Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS17, IMDBDef12.PQSL_PARS17_ROWNAMEESERC, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARS17, IMDBDef12.PQSL_PARS17_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "ElencoVariazioniGenerateEsercizioValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Raggrupp TITOLO Group Footer Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELENVARIGENE_SEC_RAGTITGROFO1_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggrupp TITOLO Group Footer Before Formatting Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "TITOLO")))
      {
        BUK_ELENVARIGENE.set_SectionVisible(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_ELENVARIGENE.set_SectionVisible(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "RaggruppTITOLOGroupFooterBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Voce P E G Group Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_ELENVARIGENE_SEC_VOCPEGGROHE1_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce P E G Group Header After Formatting Event Body
      // Procedure Body
      // 
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VOCEPEG6, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT8, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT8, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL6, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, IDREGlb.RECT_HEIGHT))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "VocePEGGroupHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Raggrupp TITOLO Group Footer Before Formatting Event 1
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELENVARIGENE_SEC_RAGTITGROFOO_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Raggrupp TITOLO Group Footer Before Formatting Event 1 Body
      // Procedure Body
      // 
      if (IDL.IsNull(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "TITOLO")))
      {
        BUK_ELENVARIGENE.set_SectionVisible(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_ELENVARIGENE.set_SectionVisible(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "RaggruppTITOLOGroupFooterBeforeFormattingEvent1", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni Bozza Page On Formatting Event
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELENVARIGENE_MST_ELEVARBOZPAG_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni Bozza Page On Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ELENVARIGENE.GetPageNumber())).equals((new IDVariant(1)), true))
      {
        BUK_ELENVARIGENE.set_BoxVisible(BUK_ELENVARIGENE_RPTBOX_PAG, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_ELENVARIGENE.set_BoxVisible(BUK_ELENVARIGENE_RPTBOX_PAG, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "ElencoVariazioniBozzaPageOnFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Report Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELENVARIGENE_SEC_REPORTHEADE1_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Report Header Before Formatting Event Body
      // Procedure Body
      // 
      BUK_ELENVARIGENE.SetBoxImage(BUK_ELENVARIGENE_RPTBOX_LOGO1, null, (new IDVariant("logo.bmp")).toString()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "ReportHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Voce P E G Group Header After Formatting Event 1
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_ELENVARIGENE_SEC_VOCPEGGROHEA_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce P E G Group Header After Formatting Event 1 Body
      // Procedure Body
      // 
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VOCEPEG5, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT7, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT7, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_ELENVARIGENE.set_BoxRect(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL3, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_ELENVARIGENE.BoxRect(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniGenerate", "VocePEGGroupHeaderAfterFormattingEvent1", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void ELENVARIGENE_PARS17() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS17_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS16, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS16, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS17_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS17_RS, 0, IMDBDef4.TBL_PARS16, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS17_RS, 0, 0, IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS17_RS, 1, 0, IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNADEVOPEG, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS16, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS16, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS16, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS17_RS, 0);
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
  private void PAN_ELENVARIGEN1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENVARIGEN1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENVARIGEN1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENVARIGEN1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENVARIGEN1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENVARIGEN1);
    // Stub
  }

  private void PAN_ELENVARIGEN1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENVARIGEN1_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ELENVARIGEN1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENVARIGEN1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ELENVARIGEN1_ESERCIZIO)
      {
        PFL_ELENVARIGEN1_ESERCIZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ELENVARIGEN1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENVARIGEN1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ELENVARIGENE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ELENVARIGENE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTHEADE1)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO3, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("<BR/>")), BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "DESCRIZIONE_VAR")), (new IDVariant("<BR/>"))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0))), (new IDVariant("<BR/>"))), (new IDVariant("Proposta"))), (new IDVariant(" "))), BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "UNITA_PROPONENTE")), (new IDVariant(" - "))), IDL.ToString(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "NUMERO_PROPOSTA"))), (new IDVariant(" / "))), IDL.ToString(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "ANNO_PROPOSTA")))));
      BUK_ELENVARIGENE_SEC_REPORTHEADE1_OnFormattingSection();
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEHEADER2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG1)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO15, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("ELENCO VARIAZIONI")), (new IDVariant(" - "))), (new IDVariant("ESERCIZIO"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0))), (new IDVariant(" - "))), (BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGH2)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP2, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNADEVOPEG, 0).equals((new IDVariant("SI")), true))?(new IDVariant("Voce P.e.g.")):(new IDVariant("Codice")))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROHE1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_DETAIL1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROFO1)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_VARPOS3, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFO1,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_VARNEG3, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFO1,"VARIAZIONI_NEGATIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVP1, new IDVariant(IDL.Sub(IDL.Add(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "STANZIAMENTO_ATTUALE"), BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFO1,"VARIAZIONI_POSITIVE")), BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFO1,"VARIAZIONI_NEGATIVE"))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEFOOTER2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTFOOTE2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTHEADE3)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEHEADER3)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG3)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO10, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("ELENCO VARIAZIONI")), (new IDVariant(" - "))), (new IDVariant("ESERCIZIO"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0))), (new IDVariant(" - "))), (BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGH3)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_RAGTITGROHE1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_DETAIL3)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO13, new IDVariant(((BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "RECORAGGTITO").equals((new IDVariant(1)), true))?BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "DESCRIZIONE"):(new IDVariant("Avanzo di Amministrazione")))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_RAGTITGROFO1)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TOTALEENTRA2, new IDVariant(((BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "E_S").equals((new IDVariant("E")), true))?(new IDVariant("Totale Entrate")):(new IDVariant("Totale Spese")))));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFO1,"STANZIAMENTO_ATTUALE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFO1,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFO1,"VARIAZIONI_NEGATIVE")));
      BUK_ELENVARIGENE_SEC_RAGTITGROFO1_OnFormattingSection();
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG4)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESG4,"STANZIAMENTO_ATTUALE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV3, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESG4,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV4, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESG4,"VARIAZIONI_NEGATIVE")));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGF2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEFOOTER3)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTFOOTE3)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTHEADE2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEHEADER1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG5)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO14, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("ELENCO VARIAZIONI")), (new IDVariant(" - "))), (new IDVariant("ESERCIZIO"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0))), (new IDVariant(" - "))), (BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADISP, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADISP, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGH4)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP1, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNADEVOPEG, 0).equals((new IDVariant("SI")), true))?(new IDVariant("Voce P.e.g.")):(new IDVariant("Codice")))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROHEA)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_REREDEVGEVGB, new IDVariant(IDL.Replace(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADISP, "DESCRIZIONE"), (new IDVariant("<BR/>")), (new IDVariant()))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_DETAIL2)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROFOO)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_VARPOS2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFOO,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_VARNEG2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFOO,"VARIAZIONI_NEGATIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVPE, new IDVariant(IDL.Sub(IDL.Add(BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_DETDELVADISP, "STANZIAMENTO_ATTUALE"), BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFOO,"VARIAZIONI_POSITIVE")), BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_VOCPEGGROFOO,"VARIAZIONI_NEGATIVE"))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESG6)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEFOOTER1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTFOOTE1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESGH)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO8, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("ELENCO VARIAZIONI")), (new IDVariant(" - "))), (new IDVariant("ESERCIZIO"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARS16, IMDBDef4.FLD_PARS16_ROWNAMEESERC, 0))), (new IDVariant(" - "))), (BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGH1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_RAGTITGROHEA)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_DETAIL)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TITOLO9, new IDVariant(((BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "RECORAGGTITO").equals((new IDVariant(1)), true))?BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "DESCRIZIONE"):(new IDVariant("Disavanzo di Amministrazione")))));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_RAGTITGROFOO)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_TOTALEENTRA1, new IDVariant(((BUK_ELENVARIGENE.GetReportColumn(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "E_S").equals((new IDVariant("E")), true))?(new IDVariant("Totale Entrate")):(new IDVariant("Totale Spese")))));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG1, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFOO,"STANZIAMENTO_ATTUALE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG1, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFOO,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG1, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_RAGTITGROFOO,"VARIAZIONI_NEGATIVE")));
      BUK_ELENVARIGENE_SEC_RAGTITGROFOO_OnFormattingSection();
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVAESGF)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS1, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESGF,"STANZIAMENTO_ATTUALE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV1, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESGF,"VARIAZIONI_POSITIVE")));
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV2, new IDVariant(BUK_ELENVARIGENE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENVARIGENE_SEC_POWRELVAESGF,"VARIAZIONI_NEGATIVE")));
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_POWRELVESGF1)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ELENVARIGENE_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROHE1)
    {
      BUK_ELENVARIGENE_SEC_VOCPEGGROHE1_OnAfterFormattingSection();
    }
    if (SectionID==BUK_ELENVARIGENE_SEC_VOCPEGGROHEA)
    {
      BUK_ELENVARIGENE_SEC_VOCPEGGROHEA_OnAfterFormattingSection();
    }
  }

  private void BUK_ELENVARIGENE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ELENVARIGENE_MST_ELEVARBOZPAG)
    {
      BUK_ELENVARIGENE.set_SpanValue(BUK_ELENVARIGENE_SPAN_CPTSEVGEVGPN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString(IDL.Sub((new IDVariant(BUK_ELENVARIGENE.GetPageNumber())), (new IDVariant(1))))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString(IDL.Sub((new IDVariant(BUK_ELENVARIGENE.GetTotalPagesNumber())), (new IDVariant(2)))))));
      BUK_ELENVARIGENE_MST_ELEVARBOZPAG_OnFormattingPage();
    }
  }

  private void BUK_ELENVARIGENE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ELENVARIGENE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ELENVARIGENE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ELENVARIGENE_OnPreview()
  {
    PreviewBook = BKW_ELENVARIGENE;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENVARIGEN1_Init()
  {

    PAN_ELENVARIGEN1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENVARIGEN1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENVARIGEN1.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_ELENVARIGEN1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, "C4C81925-0A83-4B87-8BD6-610023871111");
    PAN_ELENVARIGEN1.set_Header(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, "Esercizio");
    PAN_ELENVARIGEN1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, "");
    PAN_ELENVARIGEN1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENVARIGEN1.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENVARIGEN1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, "F70409E3-9961-47B8-9CA3-F051482DB479");
    PAN_ELENVARIGEN1.set_Header(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, "Dettaglio Voci P.e.g.");
    PAN_ELENVARIGEN1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, "");
    PAN_ELENVARIGEN1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENVARIGEN1.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENVARIGEN1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, "4F1D6A92-F3C5-44E5-B409-BFB874E7DE95");
    PAN_ELENVARIGEN1.set_Header(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, "Elabora");
    PAN_ELENVARIGEN1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ELENVARIGEN1.SetImage(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, 0, "button1.gif", false);
    PAN_ELENVARIGEN1.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ELENVARIGEN1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENVARIGEN1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_FORM, 96, 8, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENVARIGEN1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ELENVARIGEN1.SetFieldPage(PFL_ELENVARIGEN1_ESERCIZIO, -1, -1);
    PAN_ELENVARIGEN1.SetFieldPanel(PFL_ELENVARIGEN1_ESERCIZIO, PPQRY_PARS17, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_LIST, 80, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_LIST, 104);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENVARIGEN1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_LIST, "Dtt. Vc. P e g");
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_FORM, 68, 32, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_FORM, 120);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_FORM, 1);
    PAN_ELENVARIGEN1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_DETTAVOCIPEG, MyGlb.PANEL_FORM, "Dettaglio Voci P.e.g.");
    PAN_ELENVARIGEN1.SetFieldPage(PFL_ELENVARIGEN1_DETTAVOCIPEG, -1, -1);
    PAN_ELENVARIGEN1.SetFieldPanel(PFL_ELENVARIGEN1_DETTAVOCIPEG, PPQRY_PARS17, "A.ROWNADEVOPEG", "ROWNADEVOPEG", 5, 2, 0, -13997);
    PAN_ELENVARIGEN1.SetValueListItem(PFL_ELENVARIGEN1_DETTAVOCIPEG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENVARIGEN1.SetValueListItem(PFL_ELENVARIGEN1_DETTAVOCIPEG, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_LIST, 80, 68, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ELENVARIGEN1.SetRect(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_FORM, 136, 68, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENVARIGEN1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ELENVARIGEN1.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENVARIGEN1_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ELENVARIGEN1.SetFieldPage(PFL_ELENVARIGEN1_ELABORA, -1, -1);
    PAN_ELENVARIGEN1.SetFieldPanel(PFL_ELENVARIGEN1_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ELENVARIGEN1_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENVARIGEN1.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~ROWNAMEESERC~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_ELENVARIGEN1.SetQuery(PPQRY_DUAL, 0, SQL, PFL_ELENVARIGEN1_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_ELENVARIGEN1.SetQuery(PPQRY_DUAL, 1, SQL, PFL_ELENVARIGEN1_ESERCIZIO, "");
    PAN_ELENVARIGEN1.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENVARIGEN1.SetIMDB(IMDB, "PQRY_PARS17", true);
    PAN_ELENVARIGEN1.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENVARIGEN1.SetQueryIMDB(PPQRY_PARS17, IMDBDef12.PQRY_PARS17_RS, IMDBDef4.TBL_PARS16);
    JustLoaded = true;
    PAN_ELENVARIGEN1.SetFieldPrimaryIndex(PFL_ELENVARIGEN1_ESERCIZIO, IMDBDef4.FLD_PARS16_ROWNAMEESERC);
    PAN_ELENVARIGEN1.SetFieldPrimaryIndex(PFL_ELENVARIGEN1_DETTAVOCIPEG, IMDBDef4.FLD_PARS16_ROWNADEVOPEG);
    PAN_ELENVARIGEN1.SetMasterTable(0, "PARS16");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENVARIGEN1.Status() == 2)
    {
      int oldListQBE = PAN_ELENVARIGEN1.iUseListQBE;
      PAN_ELENVARIGEN1.iUseListQBE = 0;
      PAN_ELENVARIGEN1.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENVARIGEN1.PanelCommand(Glb.PCM_FIND);
      PAN_ELENVARIGEN1.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ELENVARIGENE_MST_ELEVARBOZPAG_Init()
  {
    BUK_ELENVARIGENE.InitMastro(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, "FBEC433E-AB22-4BEE-BD8C-68238EDE1825");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, "ELEVARBOZPAG");
    BUK_ELENVARIGENE.InitMastroBox(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, BUK_ELENVARIGENE_RPTBOX_PAGEHEADER, 1000, 1000, 27600, 400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_PAGEHEADER, "9BE931C1-A8B4-400E-B182-3A666B6C396A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ELENVARIGENE.InitMastroBox(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, BUK_ELENVARIGENE_RPTBOX_PAGEBODY, 1000, 1400, 27600, 18100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_PAGEBODY, "1D993C83-0E5E-4E7C-840E-1712F86176D7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ELENVARIGENE.InitMastroBox(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER, 1000, 19600, 27600, 300, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER, "D1FD9F0A-3BC1-449C-8822-C2508D6D08C2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_ELENVARIGENE.InitMastroBox(BUK_ELENVARIGENE_MST_ELEVARBOZPAG, BUK_ELENVARIGENE_RPTBOX_PAG, 26900, 2100, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_PAG, "8772E59B-1996-48E4-9B95-317399BF8A1F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_PAG, "PAG");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_PAG, BUK_ELENVARIGENE_SPAN_CPTSEVGEVGPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_CPTSEVGEVGPN, "F212B86A-1927-4B49-9058-1478D0889760");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_CPTSEVGEVGPN, "CPTSEVGEVGPN");
  }

  private void BUK_ELENVARIGENE_RPT_DETDELVADIEN_InitQuery() { BUK_ELENVARIGENE_RPT_DETDELVADIEN_InitQuery(true, true); }
  private void BUK_ELENVARIGENE_RPT_DETDELVADIEN_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.COD_REC as COD_REC, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STANZIAMENTO_ATTUALE as STANZIAMENTO_ATTUALE, ");
      SQL.append("  A.VARIAZIONI_POSITIVE as VARIAZIONI_POSITIVE, ");
      SQL.append("  A.VARIAZIONI_NEGATIVE as VARIAZIONI_NEGATIVE, ");
      SQL.append("  A.DESCRIZIONE_VAR as DESCRIZIONE_VAR, ");
      SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
      SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
      SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA ");
      SQL.append("from ");
      SQL.append("  POL_WRK_ELV_VARI A ");
      SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COD_REC = 1) ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.VOCE_PEG, ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_ELENVARIGENE.SetReportQuery(BUK_ELENVARIGENE_RPT_DETDELVADIEN, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "14F39EBC-ED66-4D35-8A48-39CF3A6C44C8");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_POWRELVAESG1) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG1, "E_S");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, "VOCE_PEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENVARIGENE_RPT_DETDELVADIEN_Init()
  {
    BUK_ELENVARIGENE.InitReport(BUK_ELENVARIGENE_RPT_DETDELVADIEN, 196865);
    BUK_ELENVARIGENE_RPT_DETDELVADIEN_InitQuery(true, false);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "DF3249CC-D95E-4B3C-8D34-A901A9E099B7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPT_DETDELVADIEN, "DETDELVADIEN");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_REPORTHEADE1, 12600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 9109505, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTHEADE1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTHEADE1, "96EBBDF2-9D6C-46B0-B75A-A71942C870E1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTHEADE1, "REPORTHEADE1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_REPORTHEADE1, BUK_ELENVARIGENE_RPTBOX_LOGO1, 6700, 1900, 11400, 3100, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_LOGO1, "2F0C9B4F-A103-49BC-B178-41CC1D3B5A58");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_LOGO1, "LOGO1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_REPORTHEADE1, BUK_ELENVARIGENE_RPTBOX_TITOLO4, 500, 5900, 26700, 6200, 0, 1, 1, MyGlb.VIS_TITOLINCORNI, 983041, 822, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO4, "7B18879A-8CE1-4C53-AFA2-C179B7291409");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO4, "TITOLO4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO4, BUK_ELENVARIGENE_SPAN_TITOLO3, MyGlb.VIS_TITOLINCORNI, 5, 545, 0, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO3, "3380ADD8-7975-41BE-917D-4DB380CDDB64");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO3, "TITOLO3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_PAGEHEADER2, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEHEADER2, BUK_ELENVARIGENE_RPTBOX_PAGEHEADER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEHEADER2, "1C74BACC-5E6B-4F25-A587-A4502F8C95AD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEHEADER2, "PAGEHEADER2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_POWRELVAESG1, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG1, "8DD8B756-E8E7-4860-A7AB-26DBCA2F9649");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG1, "POWRELVAESG1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG1, BUK_ELENVARIGENE_RPTBOX_TITOLO8, 0, 0, 25900, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO8, "B1366825-A002-4CA5-8634-DBDF34A94B8A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO8, "TITOLO8");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO8, BUK_ELENVARIGENE_SPAN_TITOLO15, MyGlb.VIS_TITREPNOBOCE, 5, 231, 0, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO15, "7091CC4C-C7FB-40E6-B6A8-E4FA7C70B633");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO15, "TITOLO15");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_POWRELVESGH2, 2700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGH2, "8C6974B4-AC24-4DB5-BC94-16B71D859FC9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGH2, "POWRELVESGH2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD4, 600, 1800, 3200, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD4, "9F84E770-A23F-49C7-A828-3DED4067D488");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD4, "VOCEPEGHEAD4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD4, BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP2, MyGlb.VIS_INCOBOBOSUSD, 5, 99, 0, 271384961, "Voce P.e.g.", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP2, "845F12E9-B31E-4082-919A-9D3698BA25FE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP2, "IRNDVPEGSVP2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE4, 3800, 1800, 8700, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE4, "1F0F4DDC-B5FE-44F0-872A-68E94DE14402");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE4, "DESCRIHEADE4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE4, BUK_ELENVARIGENE_SPAN_DESCRIZIONE6, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_DESCRIZIONE6, "8C730763-68F1-4259-B45D-B0AC81FAD4C5");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_DESCRIZIONE6, "DESCRIZIONE6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_STANATTUHEA6, 12500, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA6, "67260805-E903-4116-9972-A211A588DAD9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA6, "STANATTUHEA6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA6, BUK_ELENVARIGENE_SPAN_STANZIATTUA8, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Stanziamento               Attuale", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_STANZIATTUA8, "27A7AE9D-2426-4016-9683-809AAC864C0A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_STANZIATTUA8, "STANZIATTUA8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_NEWBOX10, 1000, 2600, 22300, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX10, "71439F12-1A58-4AA3-BBE4-A849BFFF143E");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX10, "NEWBOX10");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA6, 19700, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA6, "03503C40-124C-4548-A7E3-B0CF1D9047E5");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA6, "VARINEGAHEA6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA6, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT8, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Variazioni                   Negative", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT8, "0059ED37-8529-41BC-90DD-6C174B80B9E1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT8, "VARIAZNEGAT8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA6, 16100, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA6, "076426AA-2E9A-4991-83F9-41A8702E9704");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA6, "VARIPOSIHEA6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA6, BUK_ELENVARIGENE_SPAN_VARIAZPOSIT8, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Variazioni                 Positive", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT8, "2678EA2F-97F3-4E6A-B944-32AEDBC70AC1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT8, "VARIAZPOSIT8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_NEWBOX7, 600, 2600, 26300, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX7, "8349B606-8990-4555-B364-FD1C93DAE418");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX7, "NEWBOX7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH2, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL5, 23300, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUEDAC, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL5, "48744903-38D7-4ECC-8DFD-3FB90BE3C30B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL5, "STANZIRISUL5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL5, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT2, MyGlb.VIS_INCOBOSUEDAC, 0, 0, 0, 271384961, "", "Stanziamento              Risultante", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT2, "DAF91034-38B9-4B91-AB08-0C08C477D006");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT2, "VARIAZNEGAT2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VOCE_PEG");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, "7CF9B0ED-0D25-49C9-A677-AFBD94D55838");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, "VOCPEGGROHE1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_VOCEPEG6, 600, 0, 3200, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEG6, "44C05E11-CF64-48A4-97ED-66C7BC5B5317");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEG6, "VOCEPEG6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VOCEPEG6, BUK_ELENVARIGENE_SPAN_REVPEGEVGEV1, MyGlb.VIS_BORLATCUSFON, 5, 20, 0, 271384961, "1234567-123456/12", "::VOCE_PEG", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVPEGEVGEV1, "84587D33-5E6B-4B6F-AECB-D5B7A496B8E8");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVPEGEVGEV1, "REVPEGEVGEV1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, 3800, 0, 8700, 500, 0, 1, 3, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, "6CD7ECC8-8D75-44D3-9B2D-86322ECA6E8A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, "DESCRIZIONE4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE4, BUK_ELENVARIGENE_SPAN_REDEELVAGEV1, MyGlb.VIS_NORMALEA9, 5, 300, 0, 271384961, "", "::DESCRIZIONE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REDEELVAGEV1, "EA2EB326-BF16-4918-9C80-B5D85D53D339");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REDEELVAGEV1, "REDEELVAGEV1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8, 12500, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8, "4BDA9823-270B-442F-A6BA-3DB4CE920047");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8, "STANZIATTUA8");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA8, BUK_ELENVARIGENE_SPAN_RESTATEVGEV1, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "123456789451,12", "::STANZIAMENTO_ATTUALE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RESTATEVGEV1, "17F1501C-9934-4DBC-A6B3-9A612141093B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RESTATEVGEV1, "RESTATEVGEV1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT8, 16100, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_NORMAA9RIGHT, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT8, "5251400A-19AD-49AA-B167-D1F891B7513F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT8, "VARIAZPOSIT8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT8, 19700, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT8, "58405B3A-3B9A-4A60-96E2-4CF17A9338E8");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT8, "VARIAZNEGAT8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL6, 23300, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL6, "72CC2CE0-BAE0-487A-8C02-AC7E8C487FD4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL6, "STANZIRISUL6");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_DETAIL1, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_DETAIL1, "4C12F109-8E05-4734-A4E6-F98870687779");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_DETAIL1, "DETAIL1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_VOCEPEG1, 600, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_BORLATFONCEN, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEG1, "889F55C3-9930-4750-BCAA-167F4991D846");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA1, 12500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA1, "F9BA5253-12B7-4E91-A256-0333811B1941");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA1, "STANZIATTUA1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT1, 16100, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT1, "9777065D-6930-4AB5-8168-F1A0682E5A55");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT1, "VARIAZPOSIT1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT1, BUK_ELENVARIGENE_SPAN_REVAPOEVGEV8, MyGlb.VIS_NORMAA9RIGHT, 3, 14, 6, 271384961, "", "::VARIAZIONI_POSITIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV8, "E60FA114-F469-4EBB-9907-B4FE666BD6D7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV8, "REVAPOEVGEV8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT4, 19700, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT4, "5C422561-A835-40B7-BCE7-89C0E50849CB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT4, "VARIAZNEGAT4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT4, BUK_ELENVARIGENE_SPAN_REVANEEVGEV8, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "", "::VARIAZIONI_NEGATIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVANEEVGEV8, "3DA9E551-F732-4A45-B6D5-4BEAEE14600E");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVANEEVGEV8, "REVANEEVGEV8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL1, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL1, 23300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL1, "ED95B8B2-BE50-406B-A614-F638676CC874");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL1, "STANZIRISUL1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027009, "VOCE_PEG");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, "E853AB42-F463-46CF-AC71-2DC71FDDBB80");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, "VOCPEGGROFO1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG2, 3800, 0, 8700, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG2, "94AF8F5C-0708-4A46-A7CA-ECAA32191BFD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG2, "BORDOSUPRIG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_TOT2, 12500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT2, "D5CFECE0-CD28-4355-968B-4E6C0311B4AD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT2, "TOT2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_TOT4, 16100, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORDOSUPINF, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT4, "2020547D-ACF2-4ADF-807C-DE0EC3DD253B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT4, "TOT4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT4, BUK_ELENVARIGENE_SPAN_VARPOS3, MyGlb.VIS_BORDOSUPINF, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARPOS3, "737EE7B8-81AB-44E9-B88B-750C302F706A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARPOS3, "VARPOS3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_TOT7, 19700, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORUPDXDOWSP, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT7, "BE1C020F-FA40-44E1-9F44-E4DF5E048713");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT7, "TOT7");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT7, BUK_ELENVARIGENE_SPAN_VARNEG3, MyGlb.VIS_BORUPDXDOWSP, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARNEG3, "3DFE2645-4375-4C96-8428-1CC5DC356005");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARNEG3, "VARNEG3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_TOT8, 23300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT8, "B68A92D1-9FC7-47FB-8A75-65437457AE98");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT8, "TOT8");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT8, BUK_ELENVARIGENE_SPAN_RSAEVGEVGVP1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVP1, "B5A6E1D6-0D69-4753-A928-133A81F6F20B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVP1, "RSAEVGEVGVP1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFO1, BUK_ELENVARIGENE_RPTBOX_NEWBOX11, 600, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX11, "47D67347-3F94-444F-8515-D8F3A77FE1F0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX11, "NEWBOX11");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_POWRELVAESG2, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG2, "A40A8481-C658-411E-9FC7-A32BCFDAB1D2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG2, "POWRELVAESG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG2, BUK_ELENVARIGENE_RPTBOX_BARRA3, 600, 0, 15500, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA3, "593E7BBC-F4E7-4CFC-8764-D291DAAFFE96");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA3, "BARRA3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG2, BUK_ELENVARIGENE_RPTBOX_BARRA2, 23300, 0, 3600, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA2, "71C9FE7B-1FB9-4A90-B409-8BA3D10E2CA1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA2, "BARRA2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG2, BUK_ELENVARIGENE_RPTBOX_NEWBOX12, 16100, 0, 7200, 100, 0, 1, 1, MyGlb.VIS_MINIBARRA, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX12, "75605FE4-5E84-4B28-B327-9F28D887F8E8");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX12, "NEWBOX12");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_PAGEFOOTER2, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEFOOTER2, BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEFOOTER2, "89136FE3-CB62-466E-A6B9-9415187E2812");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEFOOTER2, "PAGEFOOTER2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADIEN, BUK_ELENVARIGENE_SEC_REPORTFOOTE2, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTFOOTE2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTFOOTE2, "1E384A8C-AF20-471E-A237-655D03BAF081");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTFOOTE2, "REPORTFOOTE2");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG1, "E_S");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_VOCPEGGROHE1, "VOCE_PEG");
    BUK_ELENVARIGENE_RPT_DETDELVADIEN_InitQuery(false, true);
  }

  private void BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_InitQuery() { BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_InitQuery(true, true); }
  private void BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.COD_REC as COD_REC, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STANZIAMENTO_ATTUALE as STANZIAMENTO_ATTUALE, ");
      SQL.append("  A.VARIAZIONI_POSITIVE as VARIAZIONI_POSITIVE, ");
      SQL.append("  A.VARIAZIONI_NEGATIVE as VARIAZIONI_NEGATIVE, ");
      SQL.append("  CASE WHEN NOT ((A.TITOLO IS NULL)) THEN 1 ELSE 2 END as RECORAGGTITO, ");
      SQL.append("  A.TITOLO as TITOLO ");
      SQL.append("from ");
      SQL.append("  POL_WRK_ELV_VARI A ");
      SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COD_REC = 2) ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("order by 3, 11, 1 ");
      BUK_ELENVARIGENE.SetReportQuery(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2AA38926-E23E-46F1-AB04-50CA312EA072");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_POWRELVAESG3) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG3, "E_S");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_RAGTITGROHE1) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_RAGTITGROHE1, "RECORAGGTITO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_Init()
  {
    BUK_ELENVARIGENE.InitReport(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, 196865);
    BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_InitQuery(true, false);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "130A6CFD-0B9D-4A33-B882-5D507576D1CB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, "RIEDEITIDIEN");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_REPORTHEADE3, 700, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTHEADE3, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTHEADE3, "444388AA-830C-4FEE-9259-A0731A91B90D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTHEADE3, "REPORTHEADE3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_PAGEHEADER3, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEHEADER3, BUK_ELENVARIGENE_RPTBOX_PAGEHEADER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEHEADER3, "98B8EBE9-3D3A-4DD7-B4D2-55613B43FF24");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEHEADER3, "PAGEHEADER3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_POWRELVAESG3, 3500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG3, "6355CA26-FA5C-4771-8B1E-A442DC8174AD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG3, "POWRELVAESG3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_STANATTUHEA4, 9300, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA4, "FD3374CF-9546-490D-9054-19DC6EA7E02A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA4, "STANATTUHEA4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA4, BUK_ELENVARIGENE_SPAN_STANZIATTUA6, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Stanziamento                     Attuale", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_STANZIATTUA6, "566DC259-7DEC-4A58-9B43-3DAF78DD7CB0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_STANZIATTUA6, "STANZIATTUA6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA4, 12900, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA4, "1D468483-16BD-4118-8A25-3B494A53F9E6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA4, "VARIPOSIHEA4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA4, BUK_ELENVARIGENE_SPAN_VARIAZPOSIT6, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Variazioni                  Positive", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT6, "C0DAAF44-CF6E-414F-B096-364EF36E36D0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT6, "VARIAZPOSIT6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA1, 16500, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUEDAC, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA1, "0940C501-D19F-4097-988D-2C40CAE27777");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA1, "VARINEGAHEA1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA1, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT6, MyGlb.VIS_INCOBOSUEDAC, 0, 0, 0, 271384961, "", "Variazioni                  Negative", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT6, "2A20A653-2B70-41FF-819B-F013A4113952");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT6, "VARIAZNEGAT6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_TITOLO5, 0, 0, 25900, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO5, "4C6864F7-73C8-48D0-91E6-478FBFD849E9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO5, "TITOLO5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO5, BUK_ELENVARIGENE_SPAN_TITOLO10, MyGlb.VIS_TITREPNOBOCE, 5, 231, 0, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO10, "FCA3A30E-0B1D-462C-948B-B70C9C710927");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO10, "TITOLO10");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_RIEPILOGO2, 4700, 2600, 4600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO2, "26E17099-447F-451C-9BC7-833D55941E0F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO2, "RIEPILOGO2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO2, BUK_ELENVARIGENE_SPAN_RIEPILOGO2, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271319425, "", "Riepilogo", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RIEPILOGO2, "4445E712-6CE0-43B3-8BA0-DC18704E1004");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RIEPILOGO2, "RIEPILOGO2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG3, BUK_ELENVARIGENE_RPTBOX_NEWBOX5, 4700, 3400, 15400, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX5, "D08BE116-99BA-40DE-B3C3-DD3C9D7583A9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX5, "NEWBOX5");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_POWRELVESGH3, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGH3, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGH3, "0E297E03-422D-4941-AC3D-2FB6E98EB188");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGH3, "POWRELVESGH3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_RAGTITGROHE1, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECORAGGTITO");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_RAGTITGROHE1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_RAGTITGROHE1, "B4605F52-4014-4ADC-B9C7-C0842AA75F69");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_RAGTITGROHE1, "RAGTITGROHE1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_DETAIL3, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_DETAIL3, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_DETAIL3, "8076C232-3C6E-42D2-8085-C78326054ACE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_DETAIL3, "DETAIL3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL3, BUK_ELENVARIGENE_RPTBOX_TITOLO10, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO10, "CC640BA4-0904-408F-BD99-5D7AA95217A1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO10, "TITOLO10");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO10, BUK_ELENVARIGENE_SPAN_TITOLO13, MyGlb.VIS_BORLATCUSFON, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO13, "35A40027-CB9D-4CAF-AE9A-C38C01F42EC6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO13, "TITOLO13");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL3, BUK_ELENVARIGENE_RPTBOX_STANZIATTU10, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTU10, "882C70D7-784D-4F50-A0AF-60B4A587C6F1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTU10, "STANZIATTU10");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTU10, BUK_ELENVARIGENE_SPAN_RESTATEVGEV6, MyGlb.VIS_NORMAA9RIGHT, 3, 14, 6, 271384961, "123456789451,12", "::STANZIAMENTO_ATTUALE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RESTATEVGEV6, "040B7D25-5215-4A76-8CF6-321A598690CD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RESTATEVGEV6, "RESTATEVGEV6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL3, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI10, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI10, "0E150C65-3044-4FFE-8BC2-0EB4831A3FE7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI10, "VARIAZPOSI10");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI10, BUK_ELENVARIGENE_SPAN_REVAPOEVGEV6, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "", "::VARIAZIONI_POSITIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV6, "06E4888F-F1D4-43AF-8EF3-7076E69EEAE6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV6, "REVAPOEVGEV6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL3, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT1, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT1, "3CE6C31B-97B2-424C-8FF1-8F9DB8B7CCA2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT1, "VARIAZNEGAT1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT1, BUK_ELENVARIGENE_SPAN_REVANEEVGEV6, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384961, "", "::VARIAZIONI_NEGATIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVANEEVGEV6, "4158468D-C3F3-48B3-9CBF-49A8522AF764");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVANEEVGEV6, "REVANEEVGEV6");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_RAGTITGROFO1, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORAGGTITO");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, "5655874E-641B-4077-AAEB-54F15941D37C");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, "RAGTITGROFO1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, BUK_ELENVARIGENE_RPTBOX_TOTALEENTRA1, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORLATEINFFO, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRA1, "275F37D8-A4BE-48AB-A416-F8A245CC26EE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRA1, "TOTALEENTRA1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRA1, BUK_ELENVARIGENE_SPAN_TOTALEENTRA2, MyGlb.VIS_BORLATEINFFO, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TOTALEENTRA2, "7AE5B9DC-CF09-4F37-9E1A-94A10CCCAD0D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TOTALEENTRA2, "TOTALEENTRA2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, BUK_ELENVARIGENE_RPTBOX_STANZIATTU11, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORDOSUPINF, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTU11, "EF51147E-13A9-428B-A7D6-567A94EC66F5");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTU11, "STANZIATTU11");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTU11, BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG2, MyGlb.VIS_BORDOSUPINF, 3, 28, 6, 271384961, "123456789451,12", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG2, "7DCF4955-CC43-4AF1-A2E2-2B282C3AC68D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG2, "RTGFSRSAEVG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI11, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BSLI, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI11, "A657E529-4B41-48DB-9DAD-D7889F6B2531");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI11, "VARIAZPOSI11");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI11, BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG2, MyGlb.VIS_BSLI, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG2, "9A9A24C5-F1F6-4F51-8D96-A962AE5BFC30");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG2, "RTGFSRVPEVG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFO1, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA11, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BSLDXI, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA11, "C6EDB10B-6E53-44AF-BD11-A41762E1CF2F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA11, "VARIAZNEGA11");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA11, BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG2, MyGlb.VIS_BSLDXI, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG2, "307A8BDC-3945-4288-AEA3-6212A84BF412");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG2, "RTGFSRVNEVG2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_POWRELVAESG4, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG4, "CE4A24A3-BACA-46FF-B72A-2F003CF87A90");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG4, "POWRELVAESG4");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_BARRA6, 4700, 500, 15400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA6, "DA5225BB-161F-4FA9-BC81-0C77F2DD6066");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA6, "BARRA6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_NEWBOX8, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORDLATECUST, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX8, "2D313CF9-632E-455B-B73F-D91B43AA7FED");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX8, "NEWBOX8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA3, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA3, "0336F82C-1184-4884-B215-84324353FF45");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA3, "STANZIATTUA3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA3, BUK_ELENVARIGENE_SPAN_PWEVESGFSRS2, MyGlb.VIS_NORMAA9RIGHT, 3, 28, 6, 271384961, "123456789451,12", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS2, "D671EDFA-3924-4DCA-BBC8-E8F65B4833AC");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS2, "PWEVESGFSRS2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT3, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT3, "0F0CFC7C-6E0A-485E-AABD-92F82F78F812");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT3, "VARIAZPOSIT3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT3, BUK_ELENVARIGENE_SPAN_PWEVESGFSRV3, MyGlb.VIS_BORLATCUSFON, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV3, "9D7CADA3-2AE6-4818-8A57-06B43281468E");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV3, "PWEVESGFSRV3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG4, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT3, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT3, "A6F37DDC-C181-4D72-8E9E-1A1F7CC244DF");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT3, "VARIAZNEGAT3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT3, BUK_ELENVARIGENE_SPAN_PWEVESGFSRV4, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV4, "0F9B9785-C4CA-485E-ACF1-9E873A3053F3");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV4, "PWEVESGFSRV4");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_POWRELVESGF2, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGF2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGF2, "1658E925-F3F3-40CD-BC06-B2CCC168D76D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGF2, "POWRELVESGF2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_PAGEFOOTER3, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEFOOTER3, BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEFOOTER3, "3CA99EC9-A6D5-4597-AC44-E132FDB86CCD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEFOOTER3, "PAGEFOOTER3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDIEN, BUK_ELENVARIGENE_SEC_REPORTFOOTE3, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTFOOTE3, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTFOOTE3, "3AE4E555-15B8-42E5-9169-E4A70E7EE5D4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTFOOTE3, "REPORTFOOTE3");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG3, "E_S");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_RAGTITGROHE1, "RECORAGGTITO");
    BUK_ELENVARIGENE_RPT_RIEDEITIDIEN_InitQuery(false, true);
  }

  private void BUK_ELENVARIGENE_RPT_DETDELVADISP_InitQuery() { BUK_ELENVARIGENE_RPT_DETDELVADISP_InitQuery(true, true); }
  private void BUK_ELENVARIGENE_RPT_DETDELVADISP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.COD_REC as COD_REC, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STANZIAMENTO_ATTUALE as STANZIAMENTO_ATTUALE, ");
      SQL.append("  A.VARIAZIONI_POSITIVE as VARIAZIONI_POSITIVE, ");
      SQL.append("  A.VARIAZIONI_NEGATIVE as VARIAZIONI_NEGATIVE, ");
      SQL.append("  A.DESCRIZIONE_VAR as DESCRIZIONE_VAR, ");
      SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
      SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
      SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA ");
      SQL.append("from ");
      SQL.append("  POL_WRK_ELV_VARI A ");
      SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COD_REC = 1) ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.VOCE_PEG, ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_ELENVARIGENE.SetReportQuery(BUK_ELENVARIGENE_RPT_DETDELVADISP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "10D99649-A2E7-471A-A847-A689CFE795C9");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_POWRELVAESG5) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG5, "E_S");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, "VOCE_PEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENVARIGENE_RPT_DETDELVADISP_Init()
  {
    BUK_ELENVARIGENE.InitReport(BUK_ELENVARIGENE_RPT_DETDELVADISP, 196865);
    BUK_ELENVARIGENE_RPT_DETDELVADISP_InitQuery(true, false);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPT_DETDELVADISP, "ED8132D8-C977-4C00-9AB0-27674C40734C");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPT_DETDELVADISP, "DETDELVADISP");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_REPORTHEADE2, 1400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 9043969, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTHEADE2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTHEADE2, "F56D0116-EDAE-4DE2-8773-BFC0B70213EB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTHEADE2, "REPORTHEADE2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_PAGEHEADER1, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEHEADER1, BUK_ELENVARIGENE_RPTBOX_PAGEHEADER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEHEADER1, "F586E48B-568F-4859-8873-E0007C88CFA6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEHEADER1, "PAGEHEADER1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_POWRELVAESG5, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG5, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG5, "66C7C4C3-57C4-4E41-AF86-AF9190D2A431");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG5, "POWRELVAESG5");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG5, BUK_ELENVARIGENE_RPTBOX_TITOLO7, 0, 0, 25900, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO7, "2DA532DD-9CDF-45AF-B3F2-6A6DF70AFDCD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO7, "TITOLO7");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO7, BUK_ELENVARIGENE_SPAN_TITOLO14, MyGlb.VIS_TITREPNOBOCE, 5, 231, 0, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO14, "81A33686-F1D4-4DE7-A321-23D8287B881A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO14, "TITOLO14");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_POWRELVESGH4, 2700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGH4, "B88DF462-8F60-4803-BF08-926DD0F27097");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGH4, "POWRELVESGH4");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD3, 600, 1800, 3200, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD3, "08015F63-8F03-4DF4-9DE9-A1E7A3489425");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD3, "VOCEPEGHEAD3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VOCEPEGHEAD3, BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP1, MyGlb.VIS_INCOBOBOSUSD, 5, 99, 0, 271384961, "Voce P.e.g.", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP1, "A703952B-E99C-4C67-9485-A24D214DA840");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_IRNDVPEGSVP1, "IRNDVPEGSVP1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE3, 3800, 1800, 8700, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE3, "EBA0249B-2827-43AF-9C6A-C56CF2051107");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE3, "DESCRIHEADE3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_DESCRIHEADE3, BUK_ELENVARIGENE_SPAN_DESCRIZIONE5, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_DESCRIZIONE5, "89603787-B835-4B6B-91AB-81D6532F4DE1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_DESCRIZIONE5, "DESCRIZIONE5");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_STANATTUHEA5, 12500, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA5, "1E5F1A28-B1AD-4C19-80C9-7F49C957241F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA5, "STANATTUHEA5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA5, BUK_ELENVARIGENE_SPAN_STANZIATTUA7, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Stanziamento               Attuale", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_STANZIATTUA7, "2FF2A5B8-1949-45B5-8A5A-E8EFE557B368");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_STANZIATTUA7, "STANZIATTUA7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_NEWBOX9, 1000, 2600, 22300, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX9, "57BE82DB-4BAD-4187-9F4E-2883681ACCB6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX9, "NEWBOX9");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA5, 19700, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA5, "B8952DF2-F4B1-4C75-938A-B01FF9498FDE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA5, "VARINEGAHEA5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEA5, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT7, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Variazioni                   Negative", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT7, "BFCE5C92-9D19-446B-925A-960530A519FD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT7, "VARIAZNEGAT7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA5, 16100, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA5, "A24AB67E-F205-43B0-B767-CBB6856C4638");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA5, "VARIPOSIHEA5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA5, BUK_ELENVARIGENE_SPAN_VARIAZPOSIT7, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Variazioni                 Positive", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT7, "AF5B5274-D60E-44C8-BF96-CEEF701EEAF9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT7, "VARIAZPOSIT7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_NEWBOX6, 600, 2600, 26300, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX6, "E3C63469-9856-49F4-9B40-21C7DAB274DB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX6, "NEWBOX6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVESGH4, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL2, 23300, 1800, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUEDAC, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL2, "1A425514-7F37-4348-8560-7780EAA27A6C");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL2, "STANZIRISUL2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL2, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT1, MyGlb.VIS_INCOBOSUEDAC, 0, 0, 0, 271384961, "", "Stanziamento              Risultante", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT1, "E0390A14-BE67-4C3C-A72D-16D582F5BB3D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT1, "VARIAZNEGAT1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VOCE_PEG");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, "086B6838-2B40-4746-8B04-31D15E40F9E7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_VOCEPEG5, 600, 0, 3200, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEG5, "B8384E22-D406-4E7F-88CD-CEAF862D45CD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEG5, "VOCEPEG5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VOCEPEG5, BUK_ELENVARIGENE_SPAN_REVPEGEVGEVG, MyGlb.VIS_BORLATCUSFON, 5, 20, 0, 271384961, "1234567-123456/12", "::VOCE_PEG", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVPEGEVGEVG, "0BD81119-D79D-4583-A3B7-8E40C776F145");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVPEGEVGEVG, "REVPEGEVGEVG");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, 3800, 0, 8700, 500, 0, 1, 3, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, "C4C6CF53-2722-407B-BB71-089837A697FE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE, BUK_ELENVARIGENE_SPAN_REREDEVGEVGB, MyGlb.VIS_NORMALEA9, 5, 99, 0, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REREDEVGEVGB, "0C7B028E-6772-4FC7-95D9-881E677937A0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REREDEVGEVGB, "REREDEVGEVGB");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7, 12500, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7, "D5E0A06A-B88B-4BB2-9D59-6B21C6C97BE8");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7, "STANZIATTUA7");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA7, BUK_ELENVARIGENE_SPAN_RESTATEVGEVG, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "123456789451,12", "::STANZIAMENTO_ATTUALE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RESTATEVGEVG, "7564AA39-FDCA-42C3-9328-FE4FADE622C4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RESTATEVGEVG, "RESTATEVGEVG");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT7, 16100, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_NORMAA9RIGHT, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT7, "6BA3B004-1090-42DC-9366-9F1A912EDAD9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT7, "VARIAZPOSIT7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT7, 19700, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT7, "07745BBC-5B36-41D2-BE8D-4A20632E1F3E");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT7, "VARIAZNEGAT7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL3, 23300, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL3, "B5228BE6-BFE7-4FE4-B8C4-B74EB1404346");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL3, "STANZIRISUL3");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_DETAIL2, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_DETAIL2, "42F147E2-B02E-4354-A8FC-5FCE83746010");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_DETAIL2, "DETAIL2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_VOCEPEG4, 600, 0, 3200, 500, 0, 1, 3, MyGlb.VIS_BORLATFONCEN, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEG4, "F8C28CF9-3B99-40BE-BDCC-3A8184FFED7D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEG4, "VOCEPEG4");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE1, 3800, 0, 8700, 500, 0, 1, 3, MyGlb.VIS_NORMAA9RIGHT, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE1, "4745F170-5B47-4DD7-BF27-2CFC769FD8EC");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_STANZIATTU13, 12500, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTU13, "D48B75BD-1640-43BB-A8CB-131629308530");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTU13, "STANZIATTU13");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI13, 16100, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI13, "E17F0AD9-AC0B-4B8E-A243-2A2CFE96ABB2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI13, "VARIAZPOSI13");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSI13, BUK_ELENVARIGENE_SPAN_REVAPOEVGEV7, MyGlb.VIS_NORMAA9RIGHT, 3, 14, 6, 271384961, "", "::VARIAZIONI_POSITIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV7, "DCB1664E-4AE7-445D-AE92-2EDF4930079F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV7, "REVAPOEVGEV7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA13, 19700, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA13, "FD720DF8-B6D9-4840-B8FE-C99AF33C3368");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA13, "VARIAZNEGA13");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGA13, BUK_ELENVARIGENE_SPAN_REVANEEVGEV7, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "", "::VARIAZIONI_NEGATIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVANEEVGEV7, "D5C6C758-1A51-4CEE-9535-8026EC2BBF9B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVANEEVGEV7, "REVANEEVGEV7");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_STANZIRISUL4, 23300, 0, 3600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL4, "EB280F7A-01BC-4677-9A1A-8F7964DC98F9");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIRISUL4, "STANZIRISUL4");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_VOCEPEG2, 600, 0, 3200, 500, 0, 1, 3, MyGlb.VIS_BORDLATECUST, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VOCEPEG2, "C9129D6E-D55D-4F45-A6C0-A6E14CEFBAF0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VOCEPEG2, "VOCEPEG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL2, BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE2, 3800, 0, 8700, 500, 0, 1, 3, MyGlb.VIS_NORMALEA9, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE2, "32E2B4DD-0852-46D8-B0EA-071B8800FACB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027009, "VOCE_PEG");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, "53FA0CFD-DEA9-4C3C-B0F9-3FF00C462225");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG1, 3800, 0, 8700, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG1, "A0F85EB7-1CF0-4D6B-84AC-A265C5A5EEDD");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BORDOSUPRIG1, "BORDOSUPRIG1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_TOT, 12500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT, "B0B53B35-014F-4D80-917B-F36428D4D2A2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT, "TOT");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_TOT1, 16100, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORDOSUPINF, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT1, "CC4C303B-DA8D-4D72-834F-58AAE6A728CC");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT1, "TOT1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT1, BUK_ELENVARIGENE_SPAN_VARPOS2, MyGlb.VIS_BORDOSUPINF, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARPOS2, "6568F8C3-30C9-4ABD-8B14-951AD12F8A11");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARPOS2, "VARPOS2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_TOT6, 19700, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORUPDXDOWSP, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT6, "24526B3C-6834-4E35-B833-794418865EDE");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT6, "TOT6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT6, BUK_ELENVARIGENE_SPAN_VARNEG2, MyGlb.VIS_BORUPDXDOWSP, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARNEG2, "46BE2D5F-1111-4C5C-9F3E-568433BFAF42");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARNEG2, "VARNEG2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_TOT3, 23300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOT3, "BA6D5164-37D3-49AA-8842-C832FD502266");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOT3, "TOT3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOT3, BUK_ELENVARIGENE_SPAN_RSAEVGEVGVPE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVPE, "0E99C45E-02CB-47B5-855B-AE85D9E9F92C");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RSAEVGEVGVPE, "RSAEVGEVGVPE");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_VOCPEGGROFOO, BUK_ELENVARIGENE_RPTBOX_NEWBOX4, 600, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX4, "B574DA30-CA4C-44C1-A030-874F615AE472");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX4, "NEWBOX4");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_POWRELVAESG6, 1100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESG6, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESG6, "57DB64AC-9FF6-466B-8F34-7A1F6912E318");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESG6, "POWRELVAESG6");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG6, BUK_ELENVARIGENE_RPTBOX_BARRA4, 600, 0, 15500, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA4, "26B0AF09-5D1A-4A65-A372-AAFF6CE243D6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA4, "BARRA4");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG6, BUK_ELENVARIGENE_RPTBOX_BARRA1, 23300, 0, 3600, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA1, "C3007C9C-550D-4156-89F3-9EACC77FE6EB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA1, "BARRA1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESG6, BUK_ELENVARIGENE_RPTBOX_NEWBOX1, 16100, 0, 7200, 100, 0, 1, 1, MyGlb.VIS_MINIBARRA, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX1, "66613C55-B5D8-4C81-9459-3351D057D318");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_PAGEFOOTER1, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEFOOTER1, BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEFOOTER1, "1DBBBB42-CAD4-4DC5-A465-91A7821B3FA1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEFOOTER1, "PAGEFOOTER1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_DETDELVADISP, BUK_ELENVARIGENE_SEC_REPORTFOOTE1, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTFOOTE1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTFOOTE1, "1D8DE8B9-CF37-4121-8B09-3125DF7FE9C4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTFOOTE1, "REPORTFOOTE1");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESG5, "E_S");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_ELENVARIGENE_RPT_DETDELVADISP_InitQuery(false, true);
  }

  private void BUK_ELENVARIGENE_RPT_RIEDEITIDISP_InitQuery() { BUK_ELENVARIGENE_RPT_RIEDEITIDISP_InitQuery(true, true); }
  private void BUK_ELENVARIGENE_RPT_RIEDEITIDISP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.COD_REC as COD_REC, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STANZIAMENTO_ATTUALE as STANZIAMENTO_ATTUALE, ");
      SQL.append("  A.VARIAZIONI_POSITIVE as VARIAZIONI_POSITIVE, ");
      SQL.append("  A.VARIAZIONI_NEGATIVE as VARIAZIONI_NEGATIVE, ");
      SQL.append("  CASE WHEN NOT ((A.TITOLO IS NULL)) THEN 1 ELSE 2 END as RECORAGGTITO, ");
      SQL.append("  A.TITOLO as TITOLO ");
      SQL.append("from ");
      SQL.append("  POL_WRK_ELV_VARI A ");
      SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COD_REC = 2) ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("order by 3, 11, 1 ");
      BUK_ELENVARIGENE.SetReportQuery(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "F0388627-1A68-4601-91B4-152C37304020");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_POWRELVAESGH) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESGH, "E_S");
      if (BUK_ELENVARIGENE.FindObjByID(BUK_ELENVARIGENE_SEC_RAGTITGROHEA) != null)
        BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_RAGTITGROHEA, "RECORAGGTITO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENVARIGENE_RPT_RIEDEITIDISP_Init()
  {
    BUK_ELENVARIGENE.InitReport(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, 196865);
    BUK_ELENVARIGENE_RPT_RIEDEITIDISP_InitQuery(true, false);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "D2AD61C7-984E-43AE-83B4-C15C250FB89F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, "RIEDEITIDISP");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_REPORTHEADER, 700, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTHEADER, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTHEADER, "500AAF83-93BB-4EFA-A5C0-51BC58965406");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_PAGEHEADER, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEHEADER, BUK_ELENVARIGENE_RPTBOX_PAGEHEADER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEHEADER, "5F33FF7F-805D-4071-BA6E-01B4000EFDF4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_POWRELVAESGH, 3500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESGH, "FA6FFA98-405E-4680-A538-00262DD22B28");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESGH, "POWRELVAESGH");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_STANATTUHEA2, 9300, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUALCE, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA2, "58D5B93C-F18D-41A5-BED4-5C622C5A9D55");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA2, "STANATTUHEA2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANATTUHEA2, BUK_ELENVARIGENE_SPAN_STANZIATTUA3, MyGlb.VIS_INCOBOSUALCE, 0, 0, 0, 271384961, "", "Stanziamento                     Attuale", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_STANZIATTUA3, "87ED14CE-871F-46E4-8F55-4972ECFC7681");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_STANZIATTUA3, "STANZIATTUA3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA2, 12900, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA2, "474B8E51-8EED-46F0-BE35-E173915C5E6D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA2, "VARIPOSIHEA2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIPOSIHEA2, BUK_ELENVARIGENE_SPAN_VARIAZPOSIT3, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Variazioni                  Positive", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT3, "D6E8B17D-8658-4C10-81A5-6D865E85782B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZPOSIT3, "VARIAZPOSIT3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_VARINEGAHEAD, 16500, 2600, 3600, 900, 0, 1, 1, MyGlb.VIS_INCOBOSUEDAC, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEAD, "1AC893BA-CF01-45E2-8BBC-4F693A22D0AC");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEAD, "VARINEGAHEAD");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARINEGAHEAD, BUK_ELENVARIGENE_SPAN_VARIAZNEGAT3, MyGlb.VIS_INCOBOSUEDAC, 0, 0, 0, 271384961, "", "Variazioni                  Negative", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT3, "A2A42EC9-1B67-4A26-A9B4-AD2E231D4AD4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_VARIAZNEGAT3, "VARIAZNEGAT3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_TITOLO3, 0, 0, 25900, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO3, "AF84232B-0704-41BE-8938-C7FFDC8BD5A4");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO3, "TITOLO3");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO3, BUK_ELENVARIGENE_SPAN_TITOLO8, MyGlb.VIS_TITREPNOBOCE, 5, 231, 0, 271319169, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO8, "865E7885-644F-4096-9E1C-24FFAB7FBE5F");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO8, "TITOLO8");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_RIEPILOGO1, 4700, 2600, 4600, 900, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO1, "4F382692-C816-4148-AD76-2A3F2F4E7B8B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO1, "RIEPILOGO1");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_RIEPILOGO1, BUK_ELENVARIGENE_SPAN_RIEPILOGO1, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271319425, "", "Riepilogo", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RIEPILOGO1, "66255D29-A863-4076-BC5D-4AAA331DEC00");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RIEPILOGO1, "RIEPILOGO1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGH, BUK_ELENVARIGENE_RPTBOX_NEWBOX2, 4700, 3400, 15400, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX2, "AB8E3E01-70F3-4CD0-A1CD-910C55567386");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_POWRELVESGH1, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGH1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGH1, "B97E004A-7085-4429-9049-F20B1E15C476");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGH1, "POWRELVESGH1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_RAGTITGROHEA, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECORAGGTITO");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_RAGTITGROHEA, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_RAGTITGROHEA, "473CF523-D393-427C-83EA-24B4512FA8F0");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_RAGTITGROHEA, "RAGTITGROHEA");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_DETAIL, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_DETAIL, "CCDC320B-F9F1-43D2-ADD8-62B36846834B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_DETAIL, "DETAIL");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL, BUK_ELENVARIGENE_RPTBOX_TITOLO9, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TITOLO9, "12A690CD-02F3-4145-BF23-1C51D0C0414A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TITOLO9, "TITOLO9");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TITOLO9, BUK_ELENVARIGENE_SPAN_TITOLO9, MyGlb.VIS_BORLATCUSFON, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TITOLO9, "31F9D36C-DC89-4017-B56D-80722B06FD4E");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TITOLO9, "TITOLO9");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA4, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA4, "5E1F362D-C794-435A-850A-3BD69D2ACC62");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA4, "STANZIATTUA4");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA4, BUK_ELENVARIGENE_SPAN_RESTATEVGEV2, MyGlb.VIS_NORMAA9RIGHT, 3, 14, 6, 271384961, "123456789451,12", "::STANZIAMENTO_ATTUALE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RESTATEVGEV2, "0F06E168-FA4C-4009-B313-FE1A9839A3A7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RESTATEVGEV2, "RESTATEVGEV2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT5, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT5, "F791E7A4-0A69-41AB-80DC-90892FBD0004");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT5, "VARIAZPOSIT5");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT5, BUK_ELENVARIGENE_SPAN_REVAPOEVGEV2, MyGlb.VIS_BORLATCUSFON, 3, 14, 6, 271384961, "", "::VARIAZIONI_POSITIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV2, "2F79F010-17BE-4757-A406-F51FB6BE7F65");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVAPOEVGEV2, "REVAPOEVGEV2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_DETAIL, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGATI, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGATI, "E415E650-47AE-44E3-9851-B6B535AF22CB");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGATI, "VARIAZNEGATI");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGATI, BUK_ELENVARIGENE_SPAN_REVANEEVGEV2, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384961, "", "::VARIAZIONI_NEGATIVE", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_REVANEEVGEV2, "D4B2DF7F-EA30-475B-955E-10BE90201B3A");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_REVANEEVGEV2, "REVANEEVGEV2");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_RAGTITGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORAGGTITO");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, "DC13E21C-72E1-4D55-84DF-F1227F4B1598");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, "RAGTITGROFOO");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, BUK_ELENVARIGENE_RPTBOX_TOTALEENTRAT, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORLATEINFFO, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRAT, "D934E834-37C1-4FB9-9C3B-3BFA138DB567");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRAT, "TOTALEENTRAT");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_TOTALEENTRAT, BUK_ELENVARIGENE_SPAN_TOTALEENTRA1, MyGlb.VIS_BORLATEINFFO, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_TOTALEENTRA1, "8C2A4615-AB35-4D13-A895-B77EE2EF8B39");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_TOTALEENTRA1, "TOTALEENTRA1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA6, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORDOSUPINF, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA6, "D1DE26B3-41B5-4A3E-B722-EBB9F6DFB2AC");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA6, "STANZIATTUA6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA6, BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG1, MyGlb.VIS_BORDOSUPINF, 3, 28, 6, 271384961, "123456789451,12", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG1, "5E827E00-68D6-48E3-BD63-77608160C694");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRSAEVG1, "RTGFSRSAEVG1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT6, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BSLI, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT6, "713C4396-F224-4A8B-AA4E-76604A103E9D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT6, "VARIAZPOSIT6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT6, BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG1, MyGlb.VIS_BSLI, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG1, "E2CCE960-CD04-48D2-8796-92D5704527A7");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRVPEVG1, "RTGFSRVPEVG1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_RAGTITGROFOO, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT6, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BSLDXI, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT6, "D22281F4-333D-4491-8A31-2520FCA97E51");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT6, "VARIAZNEGAT6");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT6, BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG1, MyGlb.VIS_BSLDXI, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG1, "A90AA60B-0FC8-4078-A84F-494101975813");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_RTGFSRVNEVG1, "RTGFSRVNEVG1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_POWRELVAESGF, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVAESGF, "D33016D0-3320-4CDA-96FA-E237CB340BCF");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVAESGF, "POWRELVAESGF");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_NEWBOX3, 4700, 0, 4600, 500, 0, 1, 1, MyGlb.VIS_BORDLATECUST, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_NEWBOX3, "E746C1A2-34FF-4387-9EFE-194315FA2BE6");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_NEWBOX3, "NEWBOX3");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_STANZIATTUA2, 9300, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA2, "CB34F4A2-22DE-49A4-A29E-FCA2BEAA4059");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA2, "STANZIATTUA2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_STANZIATTUA2, BUK_ELENVARIGENE_SPAN_PWEVESGFSRS1, MyGlb.VIS_NORMAA9RIGHT, 3, 28, 6, 271384961, "123456789451,12", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS1, "4BD9A22D-D962-47DB-938E-5FC8FC09B397");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRS1, "PWEVESGFSRS1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT2, 12900, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORLATCUSFON, 983041, 375, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT2, "5CD63841-50CF-4654-A65C-1E2497EDFDF8");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT2, "VARIAZPOSIT2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZPOSIT2, BUK_ELENVARIGENE_SPAN_PWEVESGFSRV1, MyGlb.VIS_BORLATCUSFON, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV1, "F52C043E-C08F-4CF8-82C8-AA7B9C882D55");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV1, "PWEVESGFSRV1");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT2, 16500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT2, "FD1FEDDD-EED3-427B-B9C6-2CF3EA489B3C");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT2, "VARIAZNEGAT2");
    BUK_ELENVARIGENE.InitBoxSpan(BUK_ELENVARIGENE_RPTBOX_VARIAZNEGAT2, BUK_ELENVARIGENE_SPAN_PWEVESGFSRV2, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384961, "", "", 1);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV2, "37974723-5DB9-49E3-82D2-CFEF2DBCBD0D");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SPAN_PWEVESGFSRV2, "PWEVESGFSRV2");
    BUK_ELENVARIGENE.InitReportBox(BUK_ELENVARIGENE_SEC_POWRELVAESGF, BUK_ELENVARIGENE_RPTBOX_BARRA, 4700, 500, 15400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_RPTBOX_BARRA, "E01447C1-792B-49F3-A13C-6D38EB89C688");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_RPTBOX_BARRA, "BARRA");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_POWRELVESGF1, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_POWRELVESGF1, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_POWRELVESGF1, "1A9C3A12-0EFF-4C89-9EE0-9247F72BBD6B");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_POWRELVESGF1, "POWRELVESGF1");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_PAGEFOOTER, BUK_ELENVARIGENE_RPTBOX_PAGEFOOTER);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_PAGEFOOTER, "F1098A6F-58DF-4CC5-A1E6-89F4F00F13E2");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ELENVARIGENE.InitSection(BUK_ELENVARIGENE_RPT_RIEDEITIDISP, BUK_ELENVARIGENE_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENVARIGENE.SetSectionRendersInto(BUK_ELENVARIGENE_SEC_REPORTFOOTER, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
    BUK_ELENVARIGENE.SetRTCGuid(BUK_ELENVARIGENE_SEC_REPORTFOOTER, "45D35438-65C9-4A04-9FF3-84DBB5E643B1");
    BUK_ELENVARIGENE.SetObjCode(BUK_ELENVARIGENE_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_POWRELVAESGH, "E_S");
    BUK_ELENVARIGENE.AddReportGroup(BUK_ELENVARIGENE_SEC_RAGTITGROHEA, "RECORAGGTITO");
    BUK_ELENVARIGENE_RPT_RIEDEITIDISP_InitQuery(false, true);
  }

  private void BUK_ELENVARIGENE_InitLinks()
  {
    BUK_ELENVARIGENE.SetBoxNextBox(BUK_ELENVARIGENE_RPTBOX_PAGEBODY, BUK_ELENVARIGENE_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENVARIGEN1) PAN_ELENVARIGEN1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENVARIGEN1) PAN_ELENVARIGEN1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENVARIGEN1) PAN_ELENVARIGEN1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENVARIGEN1) PAN_ELENVARIGEN1_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENVARIGEN1) PAN_ELENVARIGEN1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ELENVARIGENE) BUK_ELENVARIGENE_OnPreview();
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
