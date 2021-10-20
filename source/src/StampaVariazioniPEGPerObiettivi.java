// **********************************************
// Stampa Variazioni P E G Per Obiettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaVariazioniPEGPerObiettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_UNITAORGANIZ = 0;
  private static int PFL_PARS_VARIAZIONE = 1;
  private static int PFL_PARS_ELABORA = 2;

  private static int PPQRY_PARS22 = 0;

  private static int PPQRY_POLSCHEDOBIE = 1;
  private static int PPQRY_POLVARBILPEG = 2;


  IDPanel PAN_PARS;
  CIDREObj BUK_STAMPA;
  OBook BKW_STAMPA;
  //
  // Template Pages constants
  private static int BUK_STAMPA_MST_STAMPAPAGE = 1;
  private static int BUK_STAMPA_RPTBOX_PAGEHEADER = 2;
  private static int BUK_STAMPA_RPTBOX_PAGEBODY = 3;
  private static int BUK_STAMPA_RPTBOX_NEWBOX = 4;
  private static int BUK_STAMPA_SPAN_CPTSSSVPEGPO = 5;

  //
  // Reports constants
  private static int BUK_STAMPA_RPT_REPORT = 6;
  private static int BUK_STAMPA_SEC_REPORTHEADE1 = 7;
  private static int BUK_STAMPA_SEC_PAGEHEADER1 = 8;
  private static int BUK_STAMPA_SEC_RAGGGROUHEAD = 9;
  private static int BUK_STAMPA_RPTBOX_TITOLO = 10;
  private static int BUK_STAMPA_SPAN_TITOLO1 = 11;
  private static int BUK_STAMPA_RPTBOX_TITOLOUO = 12;
  private static int BUK_STAMPA_SPAN_TITOLO = 13;
  private static int BUK_STAMPA_RPTBOX_UO = 14;
  private static int BUK_STAMPA_SPAN_UO = 15;
  private static int BUK_STAMPA_RPTBOX_PROGETTO = 16;
  private static int BUK_STAMPA_SPAN_PROGETTO = 17;
  private static int BUK_STAMPA_RPTBOX_PROGETTON = 18;
  private static int BUK_STAMPA_SPAN_PROGETTON = 19;
  private static int BUK_STAMPA_RPTBOX_PROGETTODESC = 20;
  private static int BUK_STAMPA_SPAN_PROGETTODESC = 21;
  private static int BUK_STAMPA_SEC_OBIEIDGROHEA = 22;
  private static int BUK_STAMPA_RPTBOX_TIPONUOVOBI1 = 23;
  private static int BUK_STAMPA_SPAN_NUOVOOBIETT1 = 24;
  private static int BUK_STAMPA_RPTBOX_CODOBIETTIV1 = 25;
  private static int BUK_STAMPA_SPAN_CODOBIETTIV1 = 26;
  private static int BUK_STAMPA_RPTBOX_DESCOBIETTI1 = 27;
  private static int BUK_STAMPA_SPAN_DESCOBIETTI1 = 28;
  private static int BUK_STAMPA_SEC_OBIETTIVFAKE = 29;
  private static int BUK_STAMPA_RPTBOX_SPESA1 = 30;
  private static int BUK_STAMPA_SPAN_SPESA1 = 31;
  private static int BUK_STAMPA_RPTBOX_ENTRATA1 = 32;
  private static int BUK_STAMPA_SPAN_ENTRATA1 = 33;
  private static int BUK_STAMPA_RPTBOX_SPESECORREN2 = 34;
  private static int BUK_STAMPA_SPAN_SPESECORREN2 = 35;
  private static int BUK_STAMPA_RPTBOX_SPESECORREN3 = 36;
  private static int BUK_STAMPA_SPAN_SPESECORREN3 = 37;
  private static int BUK_STAMPA_RPTBOX_INVESTIMENT2 = 38;
  private static int BUK_STAMPA_SPAN_INVESTIMENT2 = 39;
  private static int BUK_STAMPA_RPTBOX_INVESTIMENT3 = 40;
  private static int BUK_STAMPA_SPAN_INVESTIMENT3 = 41;
  private static int BUK_STAMPA_RPTBOX_RIMBORPREST2 = 42;
  private static int BUK_STAMPA_SPAN_RIMBORPREST2 = 43;
  private static int BUK_STAMPA_RPTBOX_RIMBORPREST3 = 44;
  private static int BUK_STAMPA_SPAN_RIMBORPREST3 = 45;
  private static int BUK_STAMPA_RPTBOX_PARTITDIGIR1 = 46;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR4 = 47;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO4 = 48;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR5 = 49;
  private static int BUK_STAMPA_RPTBOX_ENTRATE2 = 50;
  private static int BUK_STAMPA_SPAN_ENTRATE2 = 51;
  private static int BUK_STAMPA_RPTBOX_ENTRATE3 = 52;
  private static int BUK_STAMPA_SPAN_ENTRATE3 = 53;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO5 = 54;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR6 = 55;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO6 = 56;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR7 = 57;
  private static int BUK_STAMPA_RPTBOX_FASI1 = 58;
  private static int BUK_STAMPA_SEC_POWRVASCPRGH = 59;
  private static int BUK_STAMPA_RPTBOX_TIPONUOVOBIE = 60;
  private static int BUK_STAMPA_SPAN_NUOVOOBIETTI = 61;
  private static int BUK_STAMPA_RPTBOX_CODOBIETTIVO = 62;
  private static int BUK_STAMPA_SPAN_CODOBIETTIVO = 63;
  private static int BUK_STAMPA_RPTBOX_DESCOBIETTIV = 64;
  private static int BUK_STAMPA_SPAN_DESCOBIETTIV = 65;
  private static int BUK_STAMPA_RPTBOX_CRITICITA1 = 66;
  private static int BUK_STAMPA_SPAN_CRITICITA2 = 67;
  private static int BUK_STAMPA_RPTBOX_CRITICIT1 = 68;
  private static int BUK_STAMPA_SPAN_CRITICITA3 = 69;
  private static int BUK_STAMPA_SEC_POWRVASCPGH1 = 70;
  private static int BUK_STAMPA_RPTBOX_SPESA = 71;
  private static int BUK_STAMPA_SPAN_SPESA = 72;
  private static int BUK_STAMPA_RPTBOX_ENTRATA = 73;
  private static int BUK_STAMPA_SPAN_ENTRATA = 74;
  private static int BUK_STAMPA_RPTBOX_SPESECORRENT = 75;
  private static int BUK_STAMPA_SPAN_SPESECORREN1 = 76;
  private static int BUK_STAMPA_RPTBOX_SPESECORREN1 = 77;
  private static int BUK_STAMPA_SPAN_SPESECORRENT = 78;
  private static int BUK_STAMPA_RPTBOX_INVESTIMENTI = 79;
  private static int BUK_STAMPA_SPAN_INVESTIMENT1 = 80;
  private static int BUK_STAMPA_RPTBOX_INVESTIMENT1 = 81;
  private static int BUK_STAMPA_SPAN_INVESTIMENTI = 82;
  private static int BUK_STAMPA_RPTBOX_RIMBORPRESTI = 83;
  private static int BUK_STAMPA_SPAN_RIMBORPREST1 = 84;
  private static int BUK_STAMPA_RPTBOX_RIMBORPREST1 = 85;
  private static int BUK_STAMPA_SPAN_RIMBORPRESTI = 86;
  private static int BUK_STAMPA_RPTBOX_PARTITDIGIRO = 87;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR1 = 88;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO1 = 89;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR2 = 90;
  private static int BUK_STAMPA_RPTBOX_ENTRATE = 91;
  private static int BUK_STAMPA_SPAN_ENTRATE1 = 92;
  private static int BUK_STAMPA_RPTBOX_ENTRATE1 = 93;
  private static int BUK_STAMPA_SPAN_ENTRATE = 94;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO3 = 95;
  private static int BUK_STAMPA_SPAN_PARTITDIGIR3 = 96;
  private static int BUK_STAMPA_RPTBOX_PARTIDIGIRO2 = 97;
  private static int BUK_STAMPA_SPAN_PARTITDIGIRO = 98;
  private static int BUK_STAMPA_RPTBOX_FASI3 = 99;
  private static int BUK_STAMPA_SEC_DETAIL = 100;
  private static int BUK_STAMPA_SEC_SCHOBIIDGRFO = 101;
  private static int BUK_STAMPA_SEC_OBFAKEFOOTER = 102;
  private static int BUK_STAMPA_SEC_POWRVASCPRGF = 103;
  private static int BUK_STAMPA_SEC_POWRVASCPGF1 = 104;
  private static int BUK_STAMPA_SEC_RAGGGROUFOOT = 105;
  private static int BUK_STAMPA_SEC_REPORTFOOTER = 106;
  private static int BUK_STAMPA_RPT_FASISUB1 = 107;
  private static int BUK_STAMPA_SEC_REPORTHEADE2 = 108;
  private static int BUK_STAMPA_RPTBOX_FASI2 = 109;
  private static int BUK_STAMPA_SPAN_FASI1 = 110;
  private static int BUK_STAMPA_RPTBOX_BARRA2 = 111;
  private static int BUK_STAMPA_SEC_PAGEHEADER2 = 112;
  private static int BUK_STAMPA_SEC_POWRVAFAPRG1 = 113;
  private static int BUK_STAMPA_RPTBOX_SEQUENZA1 = 114;
  private static int BUK_STAMPA_SPAN_SEQUENZA2 = 115;
  private static int BUK_STAMPA_RPTBOX_DESC2 = 116;
  private static int BUK_STAMPA_SPAN_SEQUENZA3 = 117;
  private static int BUK_STAMPA_SEC_DETAIL2 = 118;
  private static int BUK_STAMPA_RPTBOX_DATAINIZHEA1 = 119;
  private static int BUK_STAMPA_SPAN_DATAINIZIO1 = 120;
  private static int BUK_STAMPA_RPTBOX_DATAINIZIO1 = 121;
  private static int BUK_STAMPA_SPAN_IRPWVFTVSVP1 = 122;
  private static int BUK_STAMPA_RPTBOX_DATAFINEHEA1 = 123;
  private static int BUK_STAMPA_SPAN_DATAFINE1 = 124;
  private static int BUK_STAMPA_RPTBOX_DATAFINE1 = 125;
  private static int BUK_STAMPA_SPAN_IRPWVFTVSVPE = 126;
  private static int BUK_STAMPA_SEC_POWRVAFAPRG2 = 127;
  private static int BUK_STAMPA_RPTBOX_BARRA1 = 128;
  private static int BUK_STAMPA_SEC_PAGEFOOTER2 = 129;
  private static int BUK_STAMPA_SEC_REPORTFOOTE1 = 130;
  private static int BUK_STAMPA_RPT_FASISUB = 131;
  private static int BUK_STAMPA_SEC_REPORTHEADER = 132;
  private static int BUK_STAMPA_RPTBOX_FASI = 133;
  private static int BUK_STAMPA_SPAN_FASI = 134;
  private static int BUK_STAMPA_RPTBOX_BARRA3 = 135;
  private static int BUK_STAMPA_SEC_PAGEHEADER = 136;
  private static int BUK_STAMPA_SEC_POWRVAFAPRGH = 137;
  private static int BUK_STAMPA_RPTBOX_SEQUENZA = 138;
  private static int BUK_STAMPA_SPAN_SEQUENZA1 = 139;
  private static int BUK_STAMPA_RPTBOX_DESC1 = 140;
  private static int BUK_STAMPA_SPAN_SEQUENZA = 141;
  private static int BUK_STAMPA_SEC_DETAIL1 = 142;
  private static int BUK_STAMPA_RPTBOX_DATAINIZHEAD = 143;
  private static int BUK_STAMPA_SPAN_DATAINIZIO = 144;
  private static int BUK_STAMPA_RPTBOX_DATAINIZIO = 145;
  private static int BUK_STAMPA_SPAN_RPWVFDISVPEG = 146;
  private static int BUK_STAMPA_RPTBOX_DATAFINEHEAD = 147;
  private static int BUK_STAMPA_SPAN_DATAFINE = 148;
  private static int BUK_STAMPA_RPTBOX_DATAFINE = 149;
  private static int BUK_STAMPA_SPAN_RPWVFDFSVPEG = 150;
  private static int BUK_STAMPA_RPTBOX_ELIMINATA = 151;
  private static int BUK_STAMPA_SPAN_ELIMINATA = 152;
  private static int BUK_STAMPA_RPTBOX_CRITICITA = 153;
  private static int BUK_STAMPA_SPAN_CRITICITA = 154;
  private static int BUK_STAMPA_RPTBOX_CRIT = 155;
  private static int BUK_STAMPA_SPAN_CRIT = 156;
  private static int BUK_STAMPA_SEC_POWRVAFAPRGF = 157;
  private static int BUK_STAMPA_RPTBOX_BARRA = 158;
  private static int BUK_STAMPA_SEC_PAGEFOOTER1 = 159;
  private static int BUK_STAMPA_SEC_REPORTFOOTE2 = 160;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS26(IMDB);
    //
    //
    Init_PQRY_PARS22(IMDB);
    Init_PQRY_PARS22_RS(IMDB);
    Init_PQRY_POLWRKVARSC2(IMDB);
    Init_PQRY_POLWRKVARFA2(IMDB);
    Init_PQRY_POLWRKVARFA3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS26(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS26, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS26, "TBL_PARS26");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_ROWNAMEPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_ROWNAMEVARID,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_RONADEVABIPE, "RONADEVABIPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS26,IMDBDef4.FLD_PARS26_RONADEVABIPE,5,250,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS26, 0);
  }

  private static void Init_PQRY_PARS22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS22, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS22, "PQRY_PARS22");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS22,IMDBDef12.PQSL_PARS22_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS22,IMDBDef12.PQSL_PARS22_ROWNAMEPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS22,IMDBDef12.PQSL_PARS22_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS22,IMDBDef12.PQSL_PARS22_ROWNAMEVARID,1,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS22, 0);
  }

  private static void Init_PQRY_PARS22_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS22_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS22_RS, "PQRY_PARS22_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS22_RS,IMDBDef12.PQSL_PARS22_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS22_RS,IMDBDef12.PQSL_PARS22_ROWNAMEPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS22_RS,IMDBDef12.PQSL_PARS22_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS22_RS,IMDBDef12.PQSL_PARS22_ROWNAMEVARID,1,8,0);
  }

  private static void Init_PQRY_POLWRKVARSC2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKVARSC2, 25);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKVARSC2, "PQRY_POLWRKVARSC2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECOUOLIVSUP, "RECOUOLIVSUP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECOUOLIVSUP,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECORDUODESC, "RECORDUODESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECORDUODESC,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECORDRAGGRU, "RECORDRAGGRU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_RECORDRAGGRU,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIPO_VAR,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_PROGR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_CODICE_OBIETTIVO, "CODICE_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_CODICE_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_S, "TIT_1_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_S,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_2_S, "TIT_2_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_2_S,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_3_S, "TIT_3_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_3_S,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_4_S, "TIT_4_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_4_S,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_5_E, "TIT_1_5_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_5_E,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_6_E, "TIT_6_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_6_E,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_NOTE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_DESCRIZIONE_OLD, "DESCRIZIONE_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_DESCRIZIONE_OLD,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_S_OLD, "TIT_1_S_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_S_OLD,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_2_S_OLD, "TIT_2_S_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_2_S_OLD,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_3_S_OLD, "TIT_3_S_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_3_S_OLD,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_4_S_OLD, "TIT_4_S_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_4_S_OLD,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_5_E_OLD, "TIT_1_5_E_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_1_5_E_OLD,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_6_E_OLD, "TIT_6_E_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARSC2,IMDBDef12.PQSL_POLWRKVARSC2_TIT_6_E_OLD,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKVARSC2, 0);
  }

  private static void Init_PQRY_POLWRKVARFA2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKVARFA2, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKVARFA2, "PQRY_POLWRKVARFA2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_SEQUENZA,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_INIZIO, "DATA_INIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_INIZIO,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_FINE, "DATA_FINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_FINE,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_RECORDORD, "RECORDORD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_RECORDORD,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_TIPO_VAR,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_SEQUENZA_OLD, "SEQUENZA_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_SEQUENZA_OLD,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DESCRIZIONE_OLD, "DESCRIZIONE_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DESCRIZIONE_OLD,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_INIZIO_OLD, "DATA_INIZIO_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_INIZIO_OLD,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_FINE_OLD, "DATA_FINE_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA2,IMDBDef12.PQSL_POLWRKVARFA2_DATA_FINE_OLD,8,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKVARFA2, 0);
  }

  private static void Init_PQRY_POLWRKVARFA3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKVARFA3, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKVARFA3, "PQRY_POLWRKVARFA3");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_SEQUENZA,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_INIZIO, "DATA_INIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_INIZIO,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_FINE, "DATA_FINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_FINE,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_TIPO_VAR,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DESCRIZIONE_OLD, "DESCRIZIONE_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DESCRIZIONE_OLD,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_SEQUENZA_OLD, "SEQUENZA_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_SEQUENZA_OLD,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_INIZIO_OLD, "DATA_INIZIO_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_INIZIO_OLD,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_FINE_OLD, "DATA_FINE_OLD");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_DATA_FINE_OLD,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKVARFA3,IMDBDef12.PQSL_POLWRKVARFA3_NOTE,5,200,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKVARFA3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaVariazioniPEGPerObiettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaVariazioniPEGPerObiettivi()
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
    FormIdx = MyGlb.FRM_STAVAPEGPEOB;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4D691379-7F46-4342-AEC3-6D0E3B55F1C9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 460;
    DesignHeight = 194;
    set_Caption(new IDVariant("Stampa Variazioni P E G Per Obiettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 460;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 460-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3997552C-13DE-423B-B461-F1073BF7DF94");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 112, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    BKW_STAMPA = new OBook(this);
    BUK_STAMPA = new CIDREObj(BKW_STAMPA);
    BKW_STAMPA.iGuid = "605E020A-0074-4019-8B70-99464E680DA6";
    BKW_STAMPA.Code = "BUK_STAMPA";
    BKW_STAMPA.BookObj = BUK_STAMPA;
    BKW_STAMPA.InitDefMasks();
    BUK_STAMPA.InitBook(1, 3342337, "Stampa", IMDB, MainFrm.VisualStyleList);
    BUK_STAMPA.InitHTML();
    BUK_STAMPA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_STAMPA.Book.SetMainFrm(MainFrm);
    BUK_STAMPA.SetRTCGuid(0, "605E020A-0074-4019-8B70-99464E680DA6");
    BUK_STAMPA.SetObjCode(0, "STAMPA");
    BUK_STAMPA_MST_STAMPAPAGE_Init();
    BUK_STAMPA_RPT_REPORT_Init();
    BUK_STAMPA_RPT_FASISUB1_Init();
    BUK_STAMPA_RPT_FASISUB_Init();
    BUK_STAMPA_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS26, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAVAPEGPEOB_PARS22();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      // BUK_STAMPA.UpdateBook();
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
    if (Code.equals("BUK_STAMPA")) return BUK_STAMPA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof StampaVariazioniPEGPerObiettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaVariazioniPEGPerObiettivi.class.getName() : (Glb.ClassWithPackage(StampaVariazioniPEGPerObiettivi.class) ? StampaVariazioniPEGPerObiettivi.class.getName().substring(StampaVariazioniPEGPerObiettivi.class.getPackage().getName().length() + 1) : StampaVariazioniPEGPerObiettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Stampa Variazioni P.e.g. per Obiettivi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      IMDB.set_Value(IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_ROWNAMEPROUO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_ROWNAMEVARID, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DESCOB = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS22, IMDBDef12.PQSL_PARS22_ROWNAMEVARID, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Variazione obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE_PEG_OB as POVABIDEPEOB ");
      SQL.append("from ");
      SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS22, IMDBDef12.PQSL_PARS22_ROWNAMEVARID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCOB = QV.Get("POVABIDEPEOB", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_RONADEVABIPE, 0, new IDVariant(v_DESCOB));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLWORKVARPEG(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARS22, IMDBDef12.PQSL_PARS22_ROWNAMEVARID, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        BUK_STAMPA.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_STAMPA.ReportRefreshQuery(BUK_STAMPA_RPT_REPORT);
        BUK_STAMPA.PrintBook((new IDVariant(0)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_STAMPA.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Page On Formatting Event
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPA_MST_STAMPAPAGE_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Page On Formatting Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS22, IMDBDef12.PQSL_PARS22_ROWNAMEPROUO, 0)))
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_TITOLOUO, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_TITOLOUO, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "StampaPageOnFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // OBIETTIVO ID Group Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_OBIEIDGROHEA_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OBIETTIVO ID Group Header After Formatting Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "OBIETTIVOIDGroupHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // POL WRK VAR SCOB PROGRESSIVO Group Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_POWRVASCPRGH_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL WRK VAR SCOB PROGRESSIVO Group Header After Formatting Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "NOTE")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_CRITICITA1, (new IDVariant(0)).booleanValue());
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_CRITICIT1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_SectionHeight(BUK_STAMPA_SEC_OBIEIDGROHEA, (new IDVariant(16, IDVariant.FLOAT)).dblValue());
      }
      if (IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "NOTE")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))
      {
        // BUK_STAMPA.set_SectionHeight(BUK_STAMPA_SEC_OBIEIDGROHEA, (new IDVariant(16, IDVariant.FLOAT)).dblValue());
      }
      if ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "DESCRIZIONE").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "DESCRIZIONE_OLD"), true)!=0) && (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("V")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("F")), true)))
      {
        BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_DESCOBIETTIV, new IDVariant(new IDVariant(MyGlb.VIS_INCOBOGRSFAZ),IDVariant.INTEGER).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "POLWRKVARSCOBPROGRESSIVOGroupHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // POL WRK VAR SCOB PROGRESSIVO Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPA_SEC_POWRVASCPRGH_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL WRK VAR SCOB PROGRESSIVO Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true))
      {
        BUK_STAMPA.set_SectionVisible(BUK_STAMPA_SEC_POWRVASCPRGH, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPA.set_SectionVisible(BUK_STAMPA_SEC_POWRVASCPRGH, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "POLWRKVARSCOBPROGRESSIVOGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // POL WRK VAR SCOB PROGRESSIVO Group Header 1 Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPA_SEC_POWRVASCPGH1_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL WRK VAR SCOB PROGRESSIVO Group Header 1 Before Formatting Event Body
      // Procedure Body
      // 
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true))
      {
        BUK_STAMPA.set_SectionVisible(BUK_STAMPA_SEC_POWRVASCPGH1, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPA.set_SectionVisible(BUK_STAMPA_SEC_POWRVASCPGH1, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "POLWRKVARSCOBPROGRESSIVOGroupHeader1BeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // POL WRK VAR SCOB PROGRESSIVO Group Header 1 After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_POWRVASCPGH1_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL WRK VAR SCOB PROGRESSIVO Group Header 1 After Formatting Event Body
      // Procedure Body
      // 
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("V")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("F")), true))
      {
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_SPESECORREN2, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_INVESTIMENT2, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_RIMBORPREST2, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_PARTITDIGIR1, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_ENTRATE2, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_PARTIDIGIRO5, new IDVariant(new IDVariant(MyGlb.VIS_BORGRISFOAZU),IDVariant.INTEGER).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "POLWRKVARSCOBPROGRESSIVOGroupHeader1AfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Fasi 1report Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_REPORTHEADE2_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fasi 1report Header After Formatting Event Body
      // Procedure Body
      // 
      // if (IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "SEQUENZA_OLD")) && IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DESCRIZIONE_OLD")))
      // {
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_SEQUENZA1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_DESC2, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_DATAINIZHEA1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_DATAINIZIO1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_DATAFINEHEA1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_DATAFINE1, (new IDVariant(0)).booleanValue());
        // BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_ELIMINATA, (new IDVariant(0)).booleanValue());
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "Fasi1reportHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Report Footer After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_REPORTFOOTE2_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Report Footer After Formatting Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "ReportFooterAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_DETAIL1_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("V")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("F")), true))
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_ELIMINATA, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_ELIMINATA, (new IDVariant(-1)).booleanValue());
      }
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").compareTo((new IDVariant("A")), true)!=0 || IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "NOTE")))
      {
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_CRITICITA, (new IDVariant(0)).booleanValue());
        BUK_STAMPA.set_BoxVisible(BUK_STAMPA_RPTBOX_CRIT, (new IDVariant(0)).booleanValue());
      }
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("V")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("F")), true))
      {
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DATA_INIZIO").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DATA_INIZIO_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_DATAINIZIO, new IDVariant(new IDVariant(MyGlb.VIS_INCOBOGRSFAZ),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DATA_FINE").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DATA_FINE_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_DATAFINE, new IDVariant(new IDVariant(MyGlb.VIS_INCOBOGRSFAZ),IDVariant.INTEGER).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // POL WRK VAR FASI PROGRESSIVO Group Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPA_SEC_POWRVAFAPRGH_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL WRK VAR FASI PROGRESSIVO Group Header After Formatting Event Body
      // Procedure Body
      // 
      if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("V")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("F")), true))
      {
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "SEQUENZA").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "SEQUENZA_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_SEQUENZA, new IDVariant(new IDVariant(MyGlb.VIS_INCOBOGRSFAZ),IDVariant.INTEGER).intValue());
        }
        if (BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DESCRIZIONE").compareTo(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "DESCRIZIONE_OLD"), true)!=0)
        {
          BUK_STAMPA.set_BoxVisualStyle(BUK_STAMPA_RPTBOX_DESC1, new IDVariant(new IDVariant(MyGlb.VIS_INCOBOGRSFAZ),IDVariant.INTEGER).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaVariazioniPEGPerObiettivi", "POLWRKVARFASIPROGRESSIVOGroupHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void STAVAPEGPEOB_PARS22() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS22_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS26, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS26, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS22_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS22_RS, 0, IMDBDef4.TBL_PARS26, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS22_RS, 0, 0, IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_ROWNAMEPROUO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS22_RS, 1, 0, IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_ROWNAMEVARID, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS26, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS26, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS26, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS22_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_STAMPA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_STAMPA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STAMPA_SEC_REPORTHEADE1)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_PAGEHEADER1)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_RAGGGROUHEAD)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_TITOLO1, new IDVariant(IMDB.Value(IMDBDef4.TBL_PARS26, IMDBDef4.FLD_PARS26_RONADEVABIPE, 0)));
    }
    if (SectionID==BUK_STAMPA_SEC_OBIEIDGROHEA)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_NUOVOOBIETT1, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true))?(new IDVariant("Nuovo Obiettivo")):(new IDVariant("Obiettivo Iniziale")))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_DESCOBIETTI1, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "DESCRIZIONE"):BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "DESCRIZIONE_OLD"))));
    }
    if (SectionID==BUK_STAMPA_SEC_OBIETTIVFAKE)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_SPESECORREN2, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S_OLD")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S_OLD").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S_OLD")))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_INVESTIMENT2, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S")))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_RIMBORPREST2, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S")))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_PARTITDIGIR4, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S")))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_ENTRATE2, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E_OLD")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E_OLD").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E_OLD")))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_PARTITDIGIR6, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E"))):((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E_OLD")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E_OLD").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E_OLD")))))));
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTHEADE2)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_PAGEHEADER2)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVAFAPRG1)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_SEQUENZA2, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("A")), true))?BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "SEQUENZA"):BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "SEQUENZA_OLD"))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_SEQUENZA3, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("A")), true))?BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DESCRIZIONE"):BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DESCRIZIONE_OLD"))));
    }
    if (SectionID==BUK_STAMPA_SEC_DETAIL2)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_IRPWVFTVSVP1, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("A")), true))?BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DATA_INIZIO"):BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DATA_INIZIO_OLD"))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_IRPWVFTVSVPE, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("I")), true) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "TIPO_VAR").equals((new IDVariant("A")), true))?BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DATA_FINE"):BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB1, "DATA_FINE_OLD"))));
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVAFAPRG2)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_PAGEFOOTER2)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTFOOTE1)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPRGH)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_NUOVOOBIETTI, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIPO_VAR").equals((new IDVariant("A")), true))?(new IDVariant("Obiettivo Annullato")):(new IDVariant("Obiettivo Variato")))));
      BUK_STAMPA_SEC_POWRVASCPRGH_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPGH1)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_SPESECORREN1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_S"))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_INVESTIMENT1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_2_S"))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_RIMBORPREST1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_3_S"))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_PARTITDIGIR1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_4_S"))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_ENTRATE1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_1_5_E"))))));
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_PARTITDIGIR3, new IDVariant(IDL.Add(IDL.Add((new IDVariant("€")), (new IDVariant(" "))), ((IDL.IsNull(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E")) || BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E").equals((new IDVariant(0)), true))?(new IDVariant("0,00")):IDL.ToString(BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_REPORT, "TIT_6_E"))))));
      BUK_STAMPA_SEC_POWRVASCPGH1_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVAFAPRGH)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_DETAIL1)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_ELIMINATA, new IDVariant(((BUK_STAMPA.GetReportColumn(BUK_STAMPA_RPT_FASISUB, "TIPO_VAR").equals((new IDVariant("I")), true))?(new IDVariant("Nuova")):(new IDVariant("Eliminata")))));
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVAFAPRGF)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_PAGEFOOTER1)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTFOOTE2)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_SCHOBIIDGRFO)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_OBFAKEFOOTER)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPRGF)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPGF1)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_RAGGGROUFOOT)
    {
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_STAMPA_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STAMPA_SEC_OBIEIDGROHEA)
    {
      BUK_STAMPA_SEC_OBIEIDGROHEA_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTHEADE2)
    {
      BUK_STAMPA_SEC_REPORTHEADE2_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPRGH)
    {
      BUK_STAMPA_SEC_POWRVASCPRGH_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVASCPGH1)
    {
      BUK_STAMPA_SEC_POWRVASCPGH1_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_POWRVAFAPRGH)
    {
      BUK_STAMPA_SEC_POWRVAFAPRGH_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_DETAIL1)
    {
      BUK_STAMPA_SEC_DETAIL1_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPA_SEC_REPORTFOOTE2)
    {
      BUK_STAMPA_SEC_REPORTFOOTE2_OnAfterFormattingSection();
    }
  }

  private void BUK_STAMPA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_STAMPA_MST_STAMPAPAGE)
    {
      BUK_STAMPA.set_SpanValue(BUK_STAMPA_SPAN_CPTSSSVPEGPO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STAMPA.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STAMPA.GetTotalPagesNumber()))))));
      BUK_STAMPA_MST_STAMPAPAGE_OnFormattingPage();
    }
  }

  private void BUK_STAMPA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_STAMPA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_STAMPA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_STAMPA_OnPreview()
  {
    PreviewBook = BKW_STAMPA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "167BBEE5-41D0-4F3A-B08F-AC5252026B8D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, "098F2666-CD59-4623-87BC-0F34E2786A2E");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, "Variazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, "B530E3F9-75A6-4F89-BDA6-28B7E85B4865");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 20, 20, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 124);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_UNITAORGANIZ, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UNITAORGANIZ, PPQRY_PARS22, "A.ROWNAMEPROUO", "ROWNAMEPROUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_LIST, 72);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_LIST, "Var.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_FORM, 36, 44, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_FORM, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAZIONE, MyGlb.PANEL_FORM, "Variazione");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIAZIONE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIAZIONE, PPQRY_PARS22, "A.ROWNAMEVARID", "ROWNAMEVARID", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_LIST, 280, 60, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_FORM, 300, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ELABORA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as POSCOBPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as POLSCHOBIDES ");
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~ROWNAMEPROUO~~) ");
    PAN_PARS.SetQuery(PPQRY_POLSCHEDOBIE, 0, SQL, PFL_PARS_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as POSCOBPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as POLSCHOBIDES ");
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A ");
    PAN_PARS.SetQuery(PPQRY_POLSCHEDOBIE, 1, SQL, PFL_PARS_UNITAORGANIZ, "");
    PAN_PARS.SetQueryDB(PPQRY_POLSCHEDOBIE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VARIAZIONE_ID as POVABIPEVAID, ");
    SQL.append("  A.DESCRIZIONE as POLVARBIPEDE ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.VARIAZIONE_ID = ~~ROWNAMEVARID~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NOT ((A.ANNO_PROPOSTA IS NULL)) AND NOT ((A.DESCRIZIONE_PEG_OB IS NULL))) ");
    SQL.append("order by ");
    SQL.append("  A.VARIAZIONE_ID ");
    PAN_PARS.SetQuery(PPQRY_POLVARBILPEG, 0, SQL, PFL_PARS_VARIAZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VARIAZIONE_ID as POVABIPEVAID, ");
    SQL.append("  A.DESCRIZIONE as POLVARBIPEDE ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NOT ((A.ANNO_PROPOSTA IS NULL)) AND NOT ((A.DESCRIZIONE_PEG_OB IS NULL))) ");
    SQL.append("order by ");
    SQL.append("  A.VARIAZIONE_ID ");
    PAN_PARS.SetQuery(PPQRY_POLVARBILPEG, 1, SQL, PFL_PARS_VARIAZIONE, "");
    PAN_PARS.SetQueryDB(PPQRY_POLVARBILPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS22", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS22, IMDBDef12.PQRY_PARS22_RS, IMDBDef4.TBL_PARS26);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UNITAORGANIZ, IMDBDef4.FLD_PARS26_ROWNAMEPROUO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIAZIONE, IMDBDef4.FLD_PARS26_ROWNAMEVARID);
    PAN_PARS.SetMasterTable(0, "PARS26");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_STAMPA_MST_STAMPAPAGE_Init()
  {
    BUK_STAMPA.InitMastro(BUK_STAMPA_MST_STAMPAPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_MST_STAMPAPAGE, "724958B7-92EB-4F97-A66A-066A01AA2975");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_MST_STAMPAPAGE, "STAMPAPAGE");
    BUK_STAMPA.InitMastroBox(BUK_STAMPA_MST_STAMPAPAGE, BUK_STAMPA_RPTBOX_PAGEHEADER, 1000, 400, 18900, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PAGEHEADER, "0C69D3C5-DD3F-48E2-A7FC-8764FC5F44FC");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_STAMPA.InitMastroBox(BUK_STAMPA_MST_STAMPAPAGE, BUK_STAMPA_RPTBOX_PAGEBODY, 1000, 1100, 19000, 28000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PAGEBODY, "82252476-BC0A-4784-8918-D2FFA392AC6B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_STAMPA.InitMastroBox(BUK_STAMPA_MST_STAMPAPAGE, BUK_STAMPA_RPTBOX_NEWBOX, 18400, 400, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_NEWBOX, "18EE4D63-FD4B-47B2-BF6E-BB971F1A3071");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_NEWBOX, "NEWBOX");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_NEWBOX, BUK_STAMPA_SPAN_CPTSSSVPEGPO, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CPTSSSVPEGPO, "DC70CF29-F3A9-4C4B-9BF4-2B3585A07B86");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CPTSSSVPEGPO, "CPTSSSVPEGPO");
  }

  private void BUK_STAMPA_RPT_REPORT_InitQuery() { BUK_STAMPA_RPT_REPORT_InitQuery(true, true); }
  private void BUK_STAMPA_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CASE WHEN NOT ((" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) AND NOT ((~~TBL_PARS26.ROWNAMEPROUO~~ IS NULL)) AND NOT ((SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ~~TBL_PARS26.ROWNAMEPROUO~~ ,TRUNC( SYSDATE )) IS NULL)) THEN ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ~~TBL_PARS26.ROWNAMEPROUO~~ ,TRUNC( SYSDATE )),TRUNC( SYSDATE )) ELSE NULL END as RECOUOLIVSUP, ");
      SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
      SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORDUODESC, ");
      SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  CASE WHEN (~~TBL_PARS26.ROWNAMEPROUO~~ IS NULL) THEN ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ELSE CASE WHEN NOT ((" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) AND NOT ((~~TBL_PARS26.ROWNAMEPROUO~~ IS NULL)) AND NOT ((SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ~~TBL_PARS26.ROWNAMEPROUO~~ ,TRUNC( SYSDATE )) IS NULL)) THEN ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.POLSUDUNISUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ~~TBL_PARS26.ROWNAMEPROUO~~ ,TRUNC( SYSDATE )),TRUNC( SYSDATE )) ELSE NULL END END as RECORDRAGGRU, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
      SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE, ");
      SQL.append("  A.CODICE_OBIETTIVO as CODICE_OBIETTIVO, ");
      SQL.append("  A.TIT_1_S as TIT_1_S, ");
      SQL.append("  A.TIT_2_S as TIT_2_S, ");
      SQL.append("  A.TIT_3_S as TIT_3_S, ");
      SQL.append("  A.TIT_4_S as TIT_4_S, ");
      SQL.append("  A.TIT_1_5_E as TIT_1_5_E, ");
      SQL.append("  A.TIT_6_E as TIT_6_E, ");
      SQL.append("  A.NOTE as NOTE, ");
      SQL.append("  A.DESCRIZIONE_OLD as DESCRIZIONE_OLD, ");
      SQL.append("  A.TIT_1_S_OLD as TIT_1_S_OLD, ");
      SQL.append("  A.TIT_2_S_OLD as TIT_2_S_OLD, ");
      SQL.append("  A.TIT_3_S_OLD as TIT_3_S_OLD, ");
      SQL.append("  A.TIT_4_S_OLD as TIT_4_S_OLD, ");
      SQL.append("  A.TIT_1_5_E_OLD as TIT_1_5_E_OLD, ");
      SQL.append("  A.TIT_6_E_OLD as TIT_6_E_OLD ");
      SQL.append("from ");
      SQL.append("  POL_WRK_VAR_SCOB A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 7, 6, 6 ");
      BUK_STAMPA.SetReportQuery(BUK_STAMPA_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "A45778D0-7B07-4E81-B856-EC83388E49A4");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_RAGGGROUHEAD) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_RAGGGROUHEAD, "RECORDRAGGRU");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_OBIEIDGROHEA) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_OBIEIDGROHEA, "PROGRESSIVO");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_OBIEIDGROHEA) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_OBIEIDGROHEA, "PROGRESSIVO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPA_RPT_REPORT_Init()
  {
    BUK_STAMPA.InitReport(BUK_STAMPA_RPT_REPORT, 196865);
    BUK_STAMPA_RPT_REPORT_InitQuery(true, false);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPT_REPORT, "553A696F-23BC-4BA3-80A4-FEDAB8429FF9");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPT_REPORT, "REPORT");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_REPORTHEADE1, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTHEADE1, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTHEADE1, "5BE9B3AD-156B-43CE-A7C5-E35BB7399FAA");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTHEADE1, "REPORTHEADE1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_PAGEHEADER1, 100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_PAGEHEADER1, BUK_STAMPA_RPTBOX_PAGEHEADER);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_PAGEHEADER1, "2C64A787-3DBB-44F4-BACA-6F224FB5078A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_PAGEHEADER1, "PAGEHEADER1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_RAGGGROUHEAD, 2200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORDRAGGRU");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_RAGGGROUHEAD, "232837E8-3913-434C-99DB-B020DE4799D2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_RAGGGROUHEAD, "RAGGGROUHEAD");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_TITOLO, 0, 0, 19000, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_TITOLO, "14EE03E5-94B5-4F9F-92C7-CA8E4243BDBD");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_TITOLO, "TITOLO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_TITOLO, BUK_STAMPA_SPAN_TITOLO1, MyGlb.VIS_INTSENBORCEN, 5, 250, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_TITOLO1, "1C74E22A-EC0E-4424-814D-B89E3B6D5684");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_TITOLO1, "TITOLO1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_TITOLOUO, 0, 600, 19000, 500, 0, 1, 1, MyGlb.VIS_INTSENBOGRRI, 983041, 393, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_TITOLOUO, "7AE5AC2B-A0B0-4C73-A4CB-2C43A09E1A52");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_TITOLOUO, "TITOLOUO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_TITOLOUO, BUK_STAMPA_SPAN_TITOLO, MyGlb.VIS_INTSENBOGRRI, 5, 99, 0, 271319169, "", "::RECOUOLIVSUP", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_TITOLO, "1B8A27C3-D1D8-45CB-AF27-4FD921DA2B32");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_TITOLO, "TITOLO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_UO, 0, 1100, 19000, 500, 0, 1, 1, MyGlb.VIS_INCOBOCEFOBI, 983041, 393, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_UO, "2A45C391-B377-4942-9F41-590FFDF26011");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_UO, "UO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_UO, BUK_STAMPA_SPAN_UO, MyGlb.VIS_INCOBOCEFOBI, 5, 99, 0, 271319169, "", "::RECORDUODESC", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_UO, "45D25BEC-4CD2-4E19-9A89-1B3D7C47577F");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_UO, "UO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_PROGETTO, 300, 1700, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PROGETTO, "18B5F1D6-02C5-4C97-8729-EFD40B3E83FB");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PROGETTO, "PROGETTO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PROGETTO, BUK_STAMPA_SPAN_PROGETTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Progetto:", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PROGETTO, "571A9A9D-7511-4365-AFA5-87537B6C8B0E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PROGETTO, "PROGETTO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_PROGETTON, 1700, 1700, 1600, 400, 0, 1, 1, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PROGETTON, "96F5344C-9A2A-428F-B5E9-6746ABB5CCA2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PROGETTON, "PROGETTON");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PROGETTON, BUK_STAMPA_SPAN_PROGETTON, MyGlb.VIS_INTCONBORGRI, 5, 9, 0, 271319425, "", "::PROGETTO_ID", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PROGETTON, "7C1CAF0C-BF35-43B5-AF62-855A10E60656");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PROGETTON, "PROGETTON");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_RAGGGROUHEAD, BUK_STAMPA_RPTBOX_PROGETTODESC, 3400, 1700, 15600, 400, 0, 1, 3, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PROGETTODESC, "B00EACDC-29AB-4023-B463-C151547530D3");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PROGETTODESC, "PROGETTODESC");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PROGETTODESC, BUK_STAMPA_SPAN_PROGETTODESC, MyGlb.VIS_INTCONBORGRI, 5, 200, 0, 271319425, "", "::DESCRIZIONE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PROGETTODESC, "E94BC9DB-EE17-4AB6-8CF6-052D91F14C18");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PROGETTODESC, "PROGETTODESC");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_OBIEIDGROHEA, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_OBIEIDGROHEA, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_OBIEIDGROHEA, "5A19FA39-900F-4E7D-9B7D-398459C435A1");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_OBIEIDGROHEA, "OBIEIDGROHEA");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIEIDGROHEA, BUK_STAMPA_RPTBOX_TIPONUOVOBI1, 0, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_TIPONUOVOBI1, "89615205-2226-4E80-9EA1-E3570292916B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_TIPONUOVOBI1, "TIPONUOVOBI1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_TIPONUOVOBI1, BUK_STAMPA_SPAN_NUOVOOBIETT1, MyGlb.VIS_INTSENBORGRI, 5, 99, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_NUOVOOBIETT1, "A1EB5DEE-75F4-4E2B-B2D9-7EA3E8F2A170");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_NUOVOOBIETT1, "NUOVOOBIETT1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIEIDGROHEA, BUK_STAMPA_RPTBOX_CODOBIETTIV1, 0, 700, 2200, 500, 0, 1, 1, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CODOBIETTIV1, "87F67DC1-68DA-40AB-86EA-DCC90B7FDDFE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CODOBIETTIV1, "CODOBIETTIV1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CODOBIETTIV1, BUK_STAMPA_SPAN_CODOBIETTIV1, MyGlb.VIS_INTCONBORGRI, 5, 10, 0, 271319425, "ASDQSDQSDQ", "::CODICE_OBIETTIVO", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CODOBIETTIV1, "6A24052C-529A-4EB0-86AD-0D05F541A6A2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CODOBIETTIV1, "CODOBIETTIV1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIEIDGROHEA, BUK_STAMPA_RPTBOX_DESCOBIETTI1, 2300, 700, 16700, 500, 0, 1, 3, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DESCOBIETTI1, "EF0AC3F2-F6EC-4FDA-8A22-A79111E97830");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DESCOBIETTI1, "DESCOBIETTI1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DESCOBIETTI1, BUK_STAMPA_SPAN_DESCOBIETTI1, MyGlb.VIS_INTCONBORGRI, 5, 99, 0, 271319425, "ASDQSDQSDQ", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DESCOBIETTI1, "BBA9AA6F-DA13-4116-9F2D-4F630AC1B08E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DESCOBIETTI1, "DESCOBIETTI1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_OBIETTIVFAKE, 5800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_OBIETTIVFAKE, "A313E754-EA86-40EB-9F4F-C14C3ED7CFAA");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_OBIETTIVFAKE, "OBIETTIVFAKE");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_SPESA1, 0, 0, 3800, 1200, 0, 1, 1, MyGlb.VIS_INCOBOGRCEGR, 983297, 518, "SPESA", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESA1, "7CE5459B-9C09-4738-BBB2-FBBADE4973B0");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESA1, "SPESA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESA1, BUK_STAMPA_SPAN_SPESA1, MyGlb.VIS_INCOBOGRCEGR, 0, 0, 0, 271319425, "", "SPESA", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESA1, "A2934CB0-93A5-4C12-9067-F3A5D004A48D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESA1, "SPESA1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_ENTRATA1, 0, 1300, 3800, 1200, 0, 1, 1, MyGlb.VIS_INCOBOGRCEGR, 983297, 518, "ENTRATA", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATA1, "DC901708-96E5-45FB-85F2-C8F1623BE866");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATA1, "ENTRATA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATA1, BUK_STAMPA_SPAN_ENTRATA1, MyGlb.VIS_INCOBOGRCEGR, 0, 0, 0, 271319425, "", "ENTRATA", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATA1, "17973656-700C-4E63-8793-0FA1EF573FE4");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATA1, "ENTRATA1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_SPESECORREN2, 3900, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESECORREN2, "80424674-BAC4-4A63-B88B-922047E1CB7C");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESECORREN2, "SPESECORREN2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESECORREN2, BUK_STAMPA_SPAN_SPESECORREN2, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESECORREN2, "A9104EFB-5E2E-4F2A-A04B-D13FB70A18BA");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESECORREN2, "SPESECORREN2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_SPESECORREN3, 3900, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESECORREN3, "C896E18D-AE3A-4696-B654-AEA48323671D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESECORREN3, "SPESECORREN3");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESECORREN3, BUK_STAMPA_SPAN_SPESECORREN3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Spese correnti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESECORREN3, "986696AD-5E58-4888-B8D5-5EC346AA4174");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESECORREN3, "SPESECORREN3");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_INVESTIMENT2, 7700, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_INVESTIMENT2, "62CCCC73-AC2F-4414-A5CF-975A0C7D5106");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_INVESTIMENT2, "INVESTIMENT2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_INVESTIMENT2, BUK_STAMPA_SPAN_INVESTIMENT2, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_INVESTIMENT2, "37E86797-362D-489B-805E-F52994E99BB9");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_INVESTIMENT2, "INVESTIMENT2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_INVESTIMENT3, 7700, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_INVESTIMENT3, "93BC7DFE-C32D-481F-AEF1-39BE04DDADD8");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_INVESTIMENT3, "INVESTIMENT3");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_INVESTIMENT3, BUK_STAMPA_SPAN_INVESTIMENT3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "investimenti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_INVESTIMENT3, "14BA7F4B-6E25-4E4F-A545-588358F86F51");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_INVESTIMENT3, "INVESTIMENT3");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_RIMBORPREST2, 11500, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_RIMBORPREST2, "DFE9102E-52BE-4DD8-BDCF-0EBA609DFC89");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_RIMBORPREST2, "RIMBORPREST2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_RIMBORPREST2, BUK_STAMPA_SPAN_RIMBORPREST2, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RIMBORPREST2, "6DD750A8-36E0-4580-B65F-56D81564DBF9");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RIMBORPREST2, "RIMBORPREST2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_RIMBORPREST3, 11500, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_RIMBORPREST3, "E3FEDA53-D5CB-48E4-8293-80A110A9BD62");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_RIMBORPREST3, "RIMBORPREST3");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_RIMBORPREST3, BUK_STAMPA_SPAN_RIMBORPREST3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Rimborso Prestiti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RIMBORPREST3, "1EC06A3F-3F36-4773-918B-E7BFB8EC8135");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RIMBORPREST3, "RIMBORPREST3");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_PARTITDIGIR1, 15300, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTITDIGIR1, "4B7698B2-4066-446A-8287-A103DF7FA9DC");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTITDIGIR1, "PARTITDIGIR1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTITDIGIR1, BUK_STAMPA_SPAN_PARTITDIGIR4, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR4, "2CF12A26-5D2A-4ED4-A6E7-B7C1019FA42D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR4, "PARTITDIGIR4");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_PARTIDIGIRO4, 15300, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO4, "00B314C2-CF81-4054-A37C-FCAF350C02C4");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO4, "PARTIDIGIRO4");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO4, BUK_STAMPA_SPAN_PARTITDIGIR5, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Partite di giro", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR5, "12D8BCFF-F3EF-4219-B227-C2C8F8EA025E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR5, "PARTITDIGIR5");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_ENTRATE2, 3900, 1300, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATE2, "988DBAB9-DBEE-4CAE-8586-2A83877BBA26");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATE2, "ENTRATE2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATE2, BUK_STAMPA_SPAN_ENTRATE2, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATE2, "B9334BE8-A369-4B8C-AF86-E26B6CA5C59A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATE2, "ENTRATE2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_ENTRATE3, 3900, 1500, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATE3, "82C0CC7A-A30B-4C81-8CD8-44140FEAA8E2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATE3, "ENTRATE3");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATE3, BUK_STAMPA_SPAN_ENTRATE3, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Entrate", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATE3, "7E67BB63-CA75-4ABE-A595-397DE3094003");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATE3, "ENTRATE3");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_PARTIDIGIRO5, 7700, 1300, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO5, "52EBAD8C-BE77-43A9-8BD8-3495CF18B75B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO5, "PARTIDIGIRO5");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO5, BUK_STAMPA_SPAN_PARTITDIGIR6, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR6, "252DC42A-348E-4BF4-BAC8-C1CA2EFC2145");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR6, "PARTITDIGIR6");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_PARTIDIGIRO6, 7700, 1500, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO6, "A0CB2263-CB15-470F-9C08-E03BF4C9B734");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO6, "PARTIDIGIRO6");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO6, BUK_STAMPA_SPAN_PARTITDIGIR7, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Partite di giro", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR7, "614F4C8E-E960-4211-ACDF-35E726684B4B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR7, "PARTITDIGIR7");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_OBIETTIVFAKE, BUK_STAMPA_RPTBOX_FASI1, 0, 2500, 19000, 3300, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_FASI1, "FF299118-82CC-4CA6-9C74-69ABCF985DD3");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_FASI1, "FASI1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_POWRVASCPRGH, 2200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVASCPRGH, "504DC9A9-F67D-4917-9E48-1DB91966D959");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVASCPRGH, "POWRVASCPRGH");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_TIPONUOVOBIE, 0, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_TIPONUOVOBIE, "4EFAEAAB-4158-4628-AB77-3F7ABDB602CE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_TIPONUOVOBIE, "TIPONUOVOBIE");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_TIPONUOVOBIE, BUK_STAMPA_SPAN_NUOVOOBIETTI, MyGlb.VIS_INTSENBORGRI, 5, 99, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_NUOVOOBIETTI, "616E8FFA-3E8A-441B-94A7-49A6E88E1E4A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_NUOVOOBIETTI, "NUOVOOBIETTI");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_CODOBIETTIVO, 0, 700, 2200, 500, 0, 1, 1, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CODOBIETTIVO, "F732C87F-1E11-4616-B6E1-730E28D3CC44");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CODOBIETTIVO, "CODOBIETTIVO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CODOBIETTIVO, BUK_STAMPA_SPAN_CODOBIETTIVO, MyGlb.VIS_INTCONBORGRI, 5, 10, 0, 271319425, "ASDQSDQSDQ", "::CODICE_OBIETTIVO", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CODOBIETTIVO, "F42CECFC-5A8B-4E25-97A0-59F4E8F2D0DB");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CODOBIETTIVO, "CODOBIETTIVO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_DESCOBIETTIV, 2300, 700, 16700, 500, 0, 1, 3, MyGlb.VIS_INTCONBORGRI, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DESCOBIETTIV, "08A3E98D-3A9C-4205-BBAD-AE945BBCAB97");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DESCOBIETTIV, "DESCOBIETTIV");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DESCOBIETTIV, BUK_STAMPA_SPAN_DESCOBIETTIV, MyGlb.VIS_INTCONBORGRI, 5, 200, 0, 271319425, "ASDQSDQSDQ", "::DESCRIZIONE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DESCOBIETTIV, "5109905E-5962-478F-B096-16BFD28326BC");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DESCOBIETTIV, "DESCOBIETTIV");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_CRITICITA1, 900, 1500, 1300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CRITICITA1, "613E1215-C2F8-436E-8312-6AF6E0694232");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CRITICITA1, "CRITICITA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CRITICITA1, BUK_STAMPA_SPAN_CRITICITA2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Criticità :", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CRITICITA2, "1C361733-D916-41CB-90DA-53C776402B74");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CRITICITA2, "CRITICITA2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPRGH, BUK_STAMPA_RPTBOX_CRITICIT1, 2300, 1500, 16700, 500, 0, 1, 3, MyGlb.VIS_SFONDOROSSO, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CRITICIT1, "E6CCE955-9933-495E-88F0-26F0F4EDA82D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CRITICIT1, "CRITICIT1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CRITICIT1, BUK_STAMPA_SPAN_CRITICITA3, MyGlb.VIS_SFONDOROSSO, 5, 200, 0, 271319169, "", "::NOTE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CRITICITA3, "F927649E-ADD0-4203-A9B4-AFD74001DF35");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CRITICITA3, "CRITICITA3");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_POWRVASCPGH1, 5800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVASCPGH1, "F913049C-2356-4AC8-8282-8FD3F1DEE5CE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVASCPGH1, "POWRVASCPGH1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_SPESA, 0, 0, 3800, 1200, 0, 1, 1, MyGlb.VIS_INCOBOGRCEGR, 983297, 518, "SPESA", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESA, "F1B4C086-2586-41F9-A4B0-A0B2A93BCCDC");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESA, "SPESA");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESA, BUK_STAMPA_SPAN_SPESA, MyGlb.VIS_INCOBOGRCEGR, 0, 0, 0, 271319425, "", "SPESA", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESA, "013FD045-0350-465D-8484-F309D18ED150");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESA, "SPESA");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_ENTRATA, 0, 1300, 3800, 1200, 0, 1, 1, MyGlb.VIS_INCOBOGRCEGR, 983297, 518, "ENTRATA", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATA, "EB6F7DA1-F3A7-4611-8683-47EA6DC3E3AF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATA, "ENTRATA");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATA, BUK_STAMPA_SPAN_ENTRATA, MyGlb.VIS_INCOBOGRCEGR, 0, 0, 0, 271319425, "", "ENTRATA", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATA, "976517C4-0F93-4DE2-B0C8-9938C9F7C96A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATA, "ENTRATA");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_SPESECORRENT, 3900, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESECORRENT, "67F9E870-0B8C-4063-8E6F-26848A10672B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESECORRENT, "SPESECORRENT");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESECORRENT, BUK_STAMPA_SPAN_SPESECORREN1, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESECORREN1, "6C80DDE2-ACAD-4767-B5F3-83349A82B402");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESECORREN1, "SPESECORREN1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_SPESECORREN1, 3900, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SPESECORREN1, "FA443129-94A1-4B14-8B12-AFE72855CA05");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SPESECORREN1, "SPESECORREN1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SPESECORREN1, BUK_STAMPA_SPAN_SPESECORRENT, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Spese correnti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SPESECORRENT, "59796110-799F-4257-9A4A-A1D4C8102323");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SPESECORRENT, "SPESECORRENT");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_INVESTIMENTI, 7700, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_INVESTIMENTI, "9CBC9805-E6A0-4165-BED5-2FAAFE87A8DF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_INVESTIMENTI, "INVESTIMENTI");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_INVESTIMENTI, BUK_STAMPA_SPAN_INVESTIMENT1, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_INVESTIMENT1, "95EFCFC0-EE15-4FD9-9DF1-3631C3B74ACE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_INVESTIMENT1, "INVESTIMENT1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_INVESTIMENT1, 7700, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_INVESTIMENT1, "D5FBEC2B-6021-4ED5-9DBB-D89C3F7F2DAA");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_INVESTIMENT1, "INVESTIMENT1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_INVESTIMENT1, BUK_STAMPA_SPAN_INVESTIMENTI, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "investimenti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_INVESTIMENTI, "59B34D3F-3208-4D73-B325-0C2550E65329");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_INVESTIMENTI, "INVESTIMENTI");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_RIMBORPRESTI, 11500, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_RIMBORPRESTI, "04C21E05-DF2B-4A6E-881E-0A8C5AAA1791");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_RIMBORPRESTI, "RIMBORPRESTI");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_RIMBORPRESTI, BUK_STAMPA_SPAN_RIMBORPREST1, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RIMBORPREST1, "07B8267A-C804-4CE9-B283-B3BFEDD5DD9F");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RIMBORPREST1, "RIMBORPREST1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_RIMBORPREST1, 11500, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_RIMBORPREST1, "C020B5B0-366A-4424-BF1A-D7C25558304B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_RIMBORPREST1, "RIMBORPREST1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_RIMBORPREST1, BUK_STAMPA_SPAN_RIMBORPRESTI, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Rimborso Prestiti", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RIMBORPRESTI, "B472FE3C-D69B-4410-9DB4-96406D103150");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RIMBORPRESTI, "RIMBORPRESTI");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_PARTITDIGIRO, 15300, 0, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTITDIGIRO, "0BECC718-9DD5-428A-A717-B805B40C2E22");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTITDIGIRO, "PARTITDIGIRO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTITDIGIRO, BUK_STAMPA_SPAN_PARTITDIGIR1, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR1, "5E7391BF-4D71-4060-A6EB-D8A8BE4BAB6E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR1, "PARTITDIGIR1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_PARTIDIGIRO1, 15300, 200, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO1, "7060119B-8C1F-4AF9-BA3A-BB789D281A26");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO1, "PARTIDIGIRO1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO1, BUK_STAMPA_SPAN_PARTITDIGIR2, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Partite di giro", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR2, "F4B164AC-9D25-4DE0-92A4-8FE6719E437E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR2, "PARTITDIGIR2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_ENTRATE, 3900, 1300, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATE, "370A1F29-390D-4CC5-A5AB-6AF11741D4EB");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATE, "ENTRATE");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATE, BUK_STAMPA_SPAN_ENTRATE1, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATE1, "4C37B8F0-609D-4133-A134-58AFAD3C322E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATE1, "ENTRATE1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_ENTRATE1, 3900, 1500, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ENTRATE1, "7A6DA8A3-3319-4864-9974-553646FB8D4B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ENTRATE1, "ENTRATE1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ENTRATE1, BUK_STAMPA_SPAN_ENTRATE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Entrate", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ENTRATE, "424C59C5-E3BD-44D4-B6A0-F87D45294E93");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ENTRATE, "ENTRATE");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_PARTIDIGIRO3, 7700, 1300, 3700, 1200, 0, 3, 3, MyGlb.VIS_BORDOGRIGIO, 983041, 322, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO3, "B8B646D9-8083-406F-8289-B5DBD01B264A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO3, "PARTIDIGIRO3");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO3, BUK_STAMPA_SPAN_PARTITDIGIR3, MyGlb.VIS_BORDOGRIGIO, 5, 101, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIR3, "A18AAE56-918D-4D23-9C67-33B9599A1CF1");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIR3, "PARTITDIGIR3");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_PARTIDIGIRO2, 7700, 1500, 3700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_PARTIDIGIRO2, "28CB9C63-996C-48E0-AB0E-06F74FDD95A6");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_PARTIDIGIRO2, "PARTIDIGIRO2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_PARTIDIGIRO2, BUK_STAMPA_SPAN_PARTITDIGIRO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271319425, "", "Partite di giro", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_PARTITDIGIRO, "FE107640-C439-437B-BEFC-10F73DB076EB");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_PARTITDIGIRO, "PARTITDIGIRO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVASCPGH1, BUK_STAMPA_RPTBOX_FASI3, 0, 2500, 19000, 3300, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_FASI3, "968FDAAC-8711-44DE-B596-8520C3FD0400");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_FASI3, "FASI3");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_DETAIL, 200, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_DETAIL, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_DETAIL, "7DF84D0F-0AF0-449D-993F-A4303FB08FE0");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_DETAIL, "DETAIL");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_SCHOBIIDGRFO, 200, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8913153, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_SCHOBIIDGRFO, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_SCHOBIIDGRFO, "AA0632D1-2905-405E-8C4B-282A87D08863");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_SCHOBIIDGRFO, "SCHOBIIDGRFO");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_OBFAKEFOOTER, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_OBFAKEFOOTER, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_OBFAKEFOOTER, "837FF11E-0115-4079-8877-39AA0483A8DF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_OBFAKEFOOTER, "OBFAKEFOOTER");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_POWRVASCPRGF, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVASCPRGF, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVASCPRGF, "A5EEEC0F-FD15-4561-A13A-00D5E74D642A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVASCPRGF, "POWRVASCPRGF");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_POWRVASCPGF1, 200, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVASCPGF1, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVASCPGF1, "04B4FBDC-0541-4C51-BA27-FC839080FCE4");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVASCPGF1, "POWRVASCPGF1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_RAGGGROUFOOT, 200, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "RECORDRAGGRU");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_RAGGGROUFOOT, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_RAGGGROUFOOT, "CCD1D586-3880-4D90-9280-14BA4A2D6466");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_RAGGGROUFOOT, "RAGGGROUFOOT");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_REPORT, BUK_STAMPA_SEC_REPORTFOOTER, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTFOOTER, BUK_STAMPA_RPTBOX_PAGEBODY);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTFOOTER, "465979E8-05BA-4C2E-B04A-58067F9083BD");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_RAGGGROUHEAD, "RECORDRAGGRU");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_OBIEIDGROHEA, "PROGRESSIVO");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_OBIEIDGROHEA, "PROGRESSIVO");
    BUK_STAMPA_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_STAMPA_RPT_FASISUB1_InitQuery() { BUK_STAMPA_RPT_FASISUB1_InitQuery(true, true); }
  private void BUK_STAMPA_RPT_FASISUB1_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.SEQUENZA as SEQUENZA, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DATA_INIZIO as DATA_INIZIO, ");
      SQL.append("  A.DATA_FINE as DATA_FINE, ");
      SQL.append("  CASE WHEN A.TIPO_VAR = 'I' OR A.TIPO_VAR = 'A' THEN A.SEQUENZA ELSE A.SEQUENZA_OLD END as RECORDORD, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.SEQUENZA_OLD as SEQUENZA_OLD, ");
      SQL.append("  A.DESCRIZIONE_OLD as DESCRIZIONE_OLD, ");
      SQL.append("  A.DATA_INIZIO_OLD as DATA_INIZIO_OLD, ");
      SQL.append("  A.DATA_FINE_OLD as DATA_FINE_OLD ");
      SQL.append("from ");
      SQL.append("  POL_WRK_VAR_FASI A ");
      SQL.append("where (A.SCHEDA_OBIETTIVO_ID = ~~" + BUK_STAMPA_RPT_REPORT + ".SCHEDA_OBIETTIVO_ID~~) ");
      SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((~~" + BUK_STAMPA_RPT_REPORT + ".TIPO_VAR~~ <> 'I' AND A.TIPO_VAR <> 'I') OR (~~" + BUK_STAMPA_RPT_REPORT + ".TIPO_VAR~~ = 'I')) ");
      SQL.append("order by 1, 1, 6 ");
      BUK_STAMPA.SetReportQuery(BUK_STAMPA_RPT_FASISUB1, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "8602966B-B68B-44F2-8CD6-E1B8FFCA4B25");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_POWRVAFAPRG1) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRG1, "PROGRESSIVO");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_POWRVAFAPRG1) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRG1, "PROGRESSIVO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPA_RPT_FASISUB1_Init()
  {
    BUK_STAMPA.InitReport(BUK_STAMPA_RPT_FASISUB1, 196609);
    BUK_STAMPA.SetSubReportBox(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA_RPT_FASISUB1_InitQuery(true, false);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPT_FASISUB1, "0D41EFC3-69BB-4AA1-8E7C-64B363ADE354");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPT_FASISUB1, "FASISUB1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_REPORTHEADE2, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTHEADE2, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTHEADE2, "3FD20652-FF5F-4B59-86FB-1D895FE6088B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTHEADE2, "REPORTHEADE2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_REPORTHEADE2, BUK_STAMPA_RPTBOX_FASI2, 0, 0, 1400, 400, 0, 1, 1, MyGlb.VIS_NORGRAFONMAG, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_FASI2, "E7FEE066-2C4D-4300-9836-B8FB3C39C121");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_FASI2, "FASI2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_FASI2, BUK_STAMPA_SPAN_FASI1, MyGlb.VIS_NORGRAFONMAG, 0, 0, 0, 271319425, "", "Fasi", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_FASI1, "5A11E94D-90A3-4356-BC09-15882345A3EF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_FASI1, "FASI1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_REPORTHEADE2, BUK_STAMPA_RPTBOX_BARRA2, 0, 400, 19000, 100, 0, 1, 1, MyGlb.VIS_INTSENBORGRI, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_BARRA2, "F2292950-54A7-46C7-952F-EB37AAFC20C7");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_BARRA2, "BARRA2");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_PAGEHEADER2, 100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_PAGEHEADER2, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_PAGEHEADER2, "E78D505D-E79C-460A-8DA8-3E625BD39EB9");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_PAGEHEADER2, "PAGEHEADER2");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_POWRVAFAPRG1, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVAFAPRG1, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVAFAPRG1, "6DDA99EC-0DA7-4BFE-8864-5234ED0500F4");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVAFAPRG1, "POWRVAFAPRG1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRG1, BUK_STAMPA_RPTBOX_SEQUENZA1, 1000, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SEQUENZA1, "6F54F5EC-2B26-48A7-A560-82773B2F9F31");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SEQUENZA1, "SEQUENZA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SEQUENZA1, BUK_STAMPA_SPAN_SEQUENZA2, MyGlb.VIS_NORMA9BORGRI, 1, 19, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SEQUENZA2, "2D78BC9C-D08A-4898-8AB8-A52406BD5DCF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SEQUENZA2, "SEQUENZA2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRG1, BUK_STAMPA_RPTBOX_DESC2, 2200, 0, 16800, 500, 0, 1, 3, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DESC2, "93BB7970-CF18-42E5-B818-A37CB233728C");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DESC2, "DESC2");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DESC2, BUK_STAMPA_SPAN_SEQUENZA3, MyGlb.VIS_NORMA9BORGRI, 5, 99, 0, 271319169, "", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SEQUENZA3, "EE4C5F5C-30C2-4CBA-8ED6-8FC016FB64CB");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SEQUENZA3, "SEQUENZA3");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_DETAIL2, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_DETAIL2, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_DETAIL2, "FDF8B02A-3BBC-4509-B4E8-63159D7051F2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_DETAIL2, "DETAIL2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL2, BUK_STAMPA_RPTBOX_DATAINIZHEA1, 10900, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAINIZHEA1, "01BCC00E-0D33-4419-8640-72C6B09EEFCA");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAINIZHEA1, "DATAINIZHEA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAINIZHEA1, BUK_STAMPA_SPAN_DATAINIZIO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data Inizio: ", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DATAINIZIO1, "3733A42A-604E-4E65-B3B4-488622FB0AA2");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DATAINIZIO1, "DATAINIZIO1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL2, BUK_STAMPA_RPTBOX_DATAINIZIO1, 12600, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAINIZIO1, "8B2873C4-E467-4E77-A42A-CF0C3FCC50BF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAINIZIO1, "DATAINIZIO1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAINIZIO1, BUK_STAMPA_SPAN_IRPWVFTVSVP1, MyGlb.VIS_NORMA9BORGRI, 8, 0, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_IRPWVFTVSVP1, "FE84FCDC-74EC-4393-95F9-A7121982E217");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_IRPWVFTVSVP1, "IRPWVFTVSVP1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL2, BUK_STAMPA_RPTBOX_DATAFINEHEA1, 15900, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAFINEHEA1, "34D0B31B-36FC-42DF-AE84-BAC7524A1EF5");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAFINEHEA1, "DATAFINEHEA1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAFINEHEA1, BUK_STAMPA_SPAN_DATAFINE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data fine: ", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DATAFINE1, "D5A35FDB-4CA7-47D2-8CE4-B58750B1CE02");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DATAFINE1, "DATAFINE1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL2, BUK_STAMPA_RPTBOX_DATAFINE1, 17300, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAFINE1, "7BFE25CB-DCEE-485E-8AF5-7D65E4FF1123");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAFINE1, "DATAFINE1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAFINE1, BUK_STAMPA_SPAN_IRPWVFTVSVPE, MyGlb.VIS_NORMA9BORGRI, 8, 0, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_IRPWVFTVSVPE, "1C88FF8E-C81E-425C-AB28-3234509D54A6");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_IRPWVFTVSVPE, "IRPWVFTVSVPE");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_POWRVAFAPRG2, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVAFAPRG2, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVAFAPRG2, "3771D8F5-B671-48FB-A573-6E9AACAC5F60");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVAFAPRG2, "POWRVAFAPRG2");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRG2, BUK_STAMPA_RPTBOX_BARRA1, 0, 100, 19000, 100, 0, 1, 1, MyGlb.VIS_BARRAGRIGIA, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_BARRA1, "C0263EBA-FCA6-429B-A6EC-CDA7897B1B2D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_BARRA1, "BARRA1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_PAGEFOOTER2, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_PAGEFOOTER2, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_PAGEFOOTER2, "2951D887-67C4-4816-A06A-6ECC6B016B58");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_PAGEFOOTER2, "PAGEFOOTER2");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB1, BUK_STAMPA_SEC_REPORTFOOTE1, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTFOOTE1, BUK_STAMPA_RPTBOX_FASI1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTFOOTE1, "827A58CF-8EE7-476D-8245-9F9E38CF0B53");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTFOOTE1, "REPORTFOOTE1");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRG1, "PROGRESSIVO");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRG1, "PROGRESSIVO");
    BUK_STAMPA_RPT_FASISUB1_InitQuery(false, true);
  }

  private void BUK_STAMPA_RPT_FASISUB_InitQuery() { BUK_STAMPA_RPT_FASISUB_InitQuery(true, true); }
  private void BUK_STAMPA_RPT_FASISUB_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.SEQUENZA as SEQUENZA, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DATA_INIZIO as DATA_INIZIO, ");
      SQL.append("  A.DATA_FINE as DATA_FINE, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.DESCRIZIONE_OLD as DESCRIZIONE_OLD, ");
      SQL.append("  A.SEQUENZA_OLD as SEQUENZA_OLD, ");
      SQL.append("  A.DATA_INIZIO_OLD as DATA_INIZIO_OLD, ");
      SQL.append("  A.DATA_FINE_OLD as DATA_FINE_OLD, ");
      SQL.append("  A.NOTE as NOTE ");
      SQL.append("from ");
      SQL.append("  POL_WRK_VAR_FASI A ");
      SQL.append("where (A.SCHEDA_OBIETTIVO_ID = ~~" + BUK_STAMPA_RPT_REPORT + ".SCHEDA_OBIETTIVO_ID~~) ");
      SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.PROGRESSIVO, ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_STAMPA.SetReportQuery(BUK_STAMPA_RPT_FASISUB, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "EC132B0E-4C51-436E-A13E-245B9E2FFED3");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_POWRVAFAPRGH) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRGH, "PROGRESSIVO");
      if (BUK_STAMPA.FindObjByID(BUK_STAMPA_SEC_POWRVAFAPRGH) != null)
        BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRGH, "PROGRESSIVO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPA_RPT_FASISUB_Init()
  {
    BUK_STAMPA.InitReport(BUK_STAMPA_RPT_FASISUB, 196609);
    BUK_STAMPA.SetSubReportBox(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA_RPT_FASISUB_InitQuery(true, false);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPT_FASISUB, "7F662531-A488-4A4B-9791-44CAFDC9C3A6");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPT_FASISUB, "FASISUB");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTHEADER, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTHEADER, "1B59B72F-B626-4639-9EF3-F4E9E8DC0A3B");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_REPORTHEADER, BUK_STAMPA_RPTBOX_FASI, 0, 0, 1400, 400, 0, 1, 1, MyGlb.VIS_NORGRAFONMAG, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_FASI, "533B0BCC-7F55-4DF2-9247-E90EF2D89B43");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_FASI, "FASI");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_FASI, BUK_STAMPA_SPAN_FASI, MyGlb.VIS_NORGRAFONMAG, 0, 0, 0, 271319425, "", "Fasi", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_FASI, "B61FFF7A-4D80-4FCE-850D-5F24C93ACB90");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_FASI, "FASI");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_REPORTHEADER, BUK_STAMPA_RPTBOX_BARRA3, 0, 400, 19000, 100, 0, 1, 1, MyGlb.VIS_INTSENBORGRI, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_BARRA3, "FF7478B9-6922-43E3-BF4B-A60A68AD7A26");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_BARRA3, "BARRA3");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_PAGEHEADER, 100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_PAGEHEADER, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_PAGEHEADER, "7CD398FB-E766-471C-98FF-2A55E68DD08F");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_POWRVAFAPRGH, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVAFAPRGH, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVAFAPRGH, "B4AF4266-380F-4798-AB3C-4F1E55B2C5C7");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVAFAPRGH, "POWRVAFAPRGH");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRGH, BUK_STAMPA_RPTBOX_SEQUENZA, 1000, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_SEQUENZA, "A4C5E72E-D4F9-416A-86E3-F909EFAC9FB1");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_SEQUENZA, "SEQUENZA");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_SEQUENZA, BUK_STAMPA_SPAN_SEQUENZA1, MyGlb.VIS_NORMA9BORGRI, 1, 3, 0, 271319169, "", "::SEQUENZA", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SEQUENZA1, "48A4AC9D-F74F-408C-A8C7-559F4D035525");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SEQUENZA1, "SEQUENZA1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRGH, BUK_STAMPA_RPTBOX_DESC1, 2200, 0, 16800, 500, 0, 1, 3, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DESC1, "0D7B1A54-724B-4B3D-A218-80E6137705D6");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DESC1, "DESC1");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DESC1, BUK_STAMPA_SPAN_SEQUENZA, MyGlb.VIS_NORMA9BORGRI, 5, 100, 0, 271319169, "", "::DESCRIZIONE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_SEQUENZA, "09905B3A-CE47-4E4E-9A55-125D1F5A0CEE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_SEQUENZA, "SEQUENZA");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_DETAIL1, 1100, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_DETAIL1, "ABD48368-946B-4A4E-8E93-11E95E2D033A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_DETAIL1, "DETAIL1");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_DATAINIZHEAD, 10900, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAINIZHEAD, "5EF40CBF-00D7-4751-82E4-83AA1799D587");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAINIZHEAD, "DATAINIZHEAD");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAINIZHEAD, BUK_STAMPA_SPAN_DATAINIZIO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data Inizio: ", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DATAINIZIO, "15339F63-C3C8-43AD-A8BC-FDD9A4ECAD7E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DATAINIZIO, "DATAINIZIO");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_DATAINIZIO, 12600, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAINIZIO, "CC5B951A-CCF1-4959-B24B-B63852683534");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAINIZIO, "DATAINIZIO");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAINIZIO, BUK_STAMPA_SPAN_RPWVFDISVPEG, MyGlb.VIS_NORMA9BORGRI, 8, 19, 0, 271384705, "Brief description of field content.", "::DATA_INIZIO", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RPWVFDISVPEG, "6E2A93A2-3DE7-4992-9444-EB4B85BA723C");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RPWVFDISVPEG, "RPWVFDISVPEG");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_DATAFINEHEAD, 15900, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAFINEHEAD, "91336D82-FAFC-4C55-8F87-08F8B94D9E9E");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAFINEHEAD, "DATAFINEHEAD");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAFINEHEAD, BUK_STAMPA_SPAN_DATAFINE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data fine: ", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_DATAFINE, "458603B0-A21C-4069-884A-F74ADA4BDE54");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_DATAFINE, "DATAFINE");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_DATAFINE, 17300, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_NORMA9BORGRI, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_DATAFINE, "A6103F9B-E527-4E17-B947-84F8431BD56A");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_DATAFINE, "DATAFINE");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_DATAFINE, BUK_STAMPA_SPAN_RPWVFDFSVPEG, MyGlb.VIS_NORMA9BORGRI, 8, 19, 0, 271384705, "Brief description of field content.", "::DATA_FINE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_RPWVFDFSVPEG, "7F8A9650-3767-4E94-BDA1-5D996DF471A1");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_RPWVFDFSVPEG, "RPWVFDFSVPEG");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_ELIMINATA, 1000, 100, 1500, 500, 0, 1, 1, MyGlb.VIS_INCOBOGRSFAZ, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_ELIMINATA, "B1D382BE-ABBA-47B6-B68D-5A8AED5D83AF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_ELIMINATA, "ELIMINATA");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_ELIMINATA, BUK_STAMPA_SPAN_ELIMINATA, MyGlb.VIS_INCOBOGRSFAZ, 5, 99, 0, 271319425, "Eliminata", "", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_ELIMINATA, "B01C5BC2-9797-453B-97D5-BBECC640B930");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_ELIMINATA, "ELIMINATA");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_CRITICITA, 1000, 700, 1500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CRITICITA, "637148D7-0DB9-4ED4-8CC9-FD0595D574BF");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CRITICITA, "CRITICITA");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CRITICITA, BUK_STAMPA_SPAN_CRITICITA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Criticità: ", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CRITICITA, "1FFFD012-0DE7-41BA-A3BE-6AB10EE4819D");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CRITICITA, "CRITICITA");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_DETAIL1, BUK_STAMPA_RPTBOX_CRIT, 2500, 700, 16500, 400, 0, 1, 3, MyGlb.VIS_SFONDOROSSO, 983041, 375, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_CRIT, "6D07F4B4-9388-486C-B236-CFCDE7BD60D5");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_CRIT, "CRIT");
    BUK_STAMPA.InitBoxSpan(BUK_STAMPA_RPTBOX_CRIT, BUK_STAMPA_SPAN_CRIT, MyGlb.VIS_SFONDOROSSO, 5, 200, 0, 271319169, "", "::NOTE", 1);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SPAN_CRIT, "4B4DA240-8748-4111-BA06-E0E163FDFB5F");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SPAN_CRIT, "CRIT");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_POWRVAFAPRGF, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRESSIVO");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_POWRVAFAPRGF, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_POWRVAFAPRGF, "CAC61265-F37E-4FFE-8377-9598DC3413D4");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_POWRVAFAPRGF, "POWRVAFAPRGF");
    BUK_STAMPA.InitReportBox(BUK_STAMPA_SEC_POWRVAFAPRGF, BUK_STAMPA_RPTBOX_BARRA, 0, 100, 19000, 100, 0, 1, 1, MyGlb.VIS_BARRAGRIGIA, 983041, 0, "", 1, -33);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_RPTBOX_BARRA, "E19B2E6D-8F78-49B2-A134-B7A9D29090CE");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_RPTBOX_BARRA, "BARRA");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_PAGEFOOTER1, 200, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_PAGEFOOTER1, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_PAGEFOOTER1, "EB27CFD3-FDAD-4709-AD1D-EF9B4B99615F");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_PAGEFOOTER1, "PAGEFOOTER1");
    BUK_STAMPA.InitSection(BUK_STAMPA_RPT_FASISUB, BUK_STAMPA_SEC_REPORTFOOTE2, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPA.SetSectionRendersInto(BUK_STAMPA_SEC_REPORTFOOTE2, BUK_STAMPA_RPTBOX_FASI3);
    BUK_STAMPA.SetRTCGuid(BUK_STAMPA_SEC_REPORTFOOTE2, "FB4D057C-F087-4CBD-A53D-1B015D7299DD");
    BUK_STAMPA.SetObjCode(BUK_STAMPA_SEC_REPORTFOOTE2, "REPORTFOOTE2");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRGH, "PROGRESSIVO");
    BUK_STAMPA.AddReportGroup(BUK_STAMPA_SEC_POWRVAFAPRGH, "PROGRESSIVO");
    BUK_STAMPA_RPT_FASISUB_InitQuery(false, true);
  }

  private void BUK_STAMPA_InitLinks()
  {
    BUK_STAMPA.SetBoxNextBox(BUK_STAMPA_RPTBOX_PAGEBODY, BUK_STAMPA_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_STAMPA) BUK_STAMPA_OnPreview();
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
