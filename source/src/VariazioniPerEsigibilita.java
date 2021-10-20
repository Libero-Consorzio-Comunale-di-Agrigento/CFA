// **********************************************
// Variazioni Per Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniPerEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAPERESI1_VARIAZIONI = 0;
  private static int PFL_VARIAPERESI1_PROPOSTA = 1;
  private static int PFL_VARIAPERESI1_NUMEROPROPOS = 2;
  private static int PFL_VARIAPERESI1_ANNOPROPOSTA = 3;
  private static int PFL_VARIAPERESI1_DELIBERA = 4;
  private static int PFL_VARIAPERESI1_TRATTIDELIBE = 5;
  private static int PFL_VARIAPERESI1_NUMERODELIBE = 6;
  private static int PFL_VARIAPERESI1_BARRADELIBER = 7;
  private static int PFL_VARIAPERESI1_ANNODELIBERA = 8;
  private static int PFL_VARIAPERESI1_APRISCELDELI = 9;
  private static int PFL_VARIAPERESI1_TRATTIPROPOS = 10;
  private static int PFL_VARIAPERESI1_BARRAPROPOST = 11;
  private static int PFL_VARIAPERESI1_APRISCELPROP = 12;
  private static int PFL_VARIAPERESI1_ETICINFOPROP = 13;
  private static int PFL_VARIAPERESI1_ELABORA = 14;
  private static int PFL_VARIAPERESI1_INFODEL = 15;
  private static int PFL_VARIAPERESI1_ESERCIZIO = 16;

  private static int PPQRY_PARAMETRI438 = 0;


  IDPanel PAN_VARIAPERESI1;
  CIDREObj BUK_VARIAPERESIG;
  OBook BKW_VARIAPERESIG;
  //
  // Template Pages constants
  private static int BUK_VARIAPERESIG_MST_TEMPLATE = 1;
  private static int BUK_VARIAPERESIG_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_VARIAPERESIG_RPTBOX_PIEDEPAGINA = 4;
  private static int BUK_VARIAPERESIG_RPTBOX_PAG = 5;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN1 = 6;
  private static int BUK_VARIAPERESIG_SPAN_VAPEESVAPEPN = 7;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN2 = 8;
  private static int BUK_VARIAPERESIG_SPAN_VAPEESVPENOP = 9;

  //
  // Reports constants
  private static int BUK_VARIAPERESIG_RPT_REPORT = 10;
  private static int BUK_VARIAPERESIG_SEC_INTESTREPORT = 11;
  private static int BUK_VARIAPERESIG_SEC_INTESTPAGINA = 12;
  private static int BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE = 13;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN3 = 14;
  private static int BUK_VARIAPERESIG_SPAN_REVAESVPEVP1 = 15;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN4 = 16;
  private static int BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPP = 17;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN5 = 18;
  private static int BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPR = 19;
  private static int BUK_VARIAPERESIG_SEC_ESERCIHEADER = 20;
  private static int BUK_VARIAPERESIG_SEC_MISSIOHEADER = 21;
  private static int BUK_VARIAPERESIG_RPTBOX_MISSIONE = 22;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN6 = 23;
  private static int BUK_VARIAPERESIG_SPAN_REMIVAPEEVPE = 24;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN7 = 25;
  private static int BUK_VARIAPERESIG_SPAN_REDEMIVPEVPE = 26;
  private static int BUK_VARIAPERESIG_SEC_PROGRAHEADER = 27;
  private static int BUK_VARIAPERESIG_RPTBOX_PROGRAMMA = 28;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN8 = 29;
  private static int BUK_VARIAPERESIG_SPAN_REPRVAPEEVPE = 30;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN9 = 31;
  private static int BUK_VARIAPERESIG_SPAN_REDEPRVPEVPE = 32;
  private static int BUK_VARIAPERESIG_SEC_PROGINTEGRUP = 33;
  private static int BUK_VARIAPERESIG_RPTBOX_BORDOSUP = 34;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN10 = 35;
  private static int BUK_VARIAPERESIG_RPTBOX_PIANODEICON1 = 36;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN11 = 37;
  private static int BUK_VARIAPERESIG_RPTBOX_CAPITOLO1 = 38;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN12 = 39;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPEGNO2 = 40;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN13 = 41;
  private static int BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL = 42;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN14 = 43;
  private static int BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS = 44;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN15 = 45;
  private static int BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1 = 46;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN16 = 47;
  private static int BUK_VARIAPERESIG_RPTBOX_BORDOSUP1 = 48;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN17 = 49;
  private static int BUK_VARIAPERESIG_SEC_CAPARTHEADER = 50;
  private static int BUK_VARIAPERESIG_SEC_DETTAGLIO = 51;
  private static int BUK_VARIAPERESIG_RPTBOX_PIANODEICONT = 52;
  private static int BUK_VARIAPERESIG_SPAN_REMALSVPEVPE = 53;
  private static int BUK_VARIAPERESIG_RPTBOX_CAPITOLO = 54;
  private static int BUK_VARIAPERESIG_SPAN_RECAARVPEVPE = 55;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPEGNO = 56;
  private static int BUK_VARIAPERESIG_SPAN_TSRVNIVPEVP1 = 57;
  private static int BUK_VARIAPERESIG_RPTBOX_ANNO = 58;
  private static int BUK_VARIAPERESIG_SPAN_REVAAEVPEVP1 = 59;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO = 60;
  private static int BUK_VARIAPERESIG_SPAN_REVAIMVPEVPE = 61;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO1 = 62;
  private static int BUK_VARIAPERESIG_SPAN_REVAICVPEVPE = 63;
  private static int BUK_VARIAPERESIG_SEC_CAPARTFOOTER = 64;
  private static int BUK_VARIAPERESIG_RPTBOX_TOTALECAPITO = 65;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN18 = 66;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO2 = 67;
  private static int BUK_VARIAPERESIG_SPAN_CFSRVIVPEVPE = 68;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO3 = 69;
  private static int BUK_VARIAPERESIG_SPAN_CFSRVICVPEVP = 70;
  private static int BUK_VARIAPERESIG_SEC_PROGRAFOOTER = 71;
  private static int BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT1 = 72;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN19 = 73;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO4 = 74;
  private static int BUK_VARIAPERESIG_SPAN_PFSRVIVPEVPE = 75;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO5 = 76;
  private static int BUK_VARIAPERESIG_SPAN_PFSRVICVPEVP = 77;
  private static int BUK_VARIAPERESIG_SEC_PROGPIEDGRUP = 78;
  private static int BUK_VARIAPERESIG_SEC_MISSIOFOOTER = 79;
  private static int BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT2 = 80;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN20 = 81;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO6 = 82;
  private static int BUK_VARIAPERESIG_SPAN_MFSRVIVPEVPE = 83;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO7 = 84;
  private static int BUK_VARIAPERESIG_SPAN_MFSRVICVPEVP = 85;
  private static int BUK_VARIAPERESIG_SEC_ESERCIFOOTER = 86;
  private static int BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3 = 87;
  private static int BUK_VARIAPERESIG_SPAN_NUOVASPAN = 88;
  private static int BUK_VARIAPERESIG_SPAN_REVAESVPEVPE = 89;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO8 = 90;
  private static int BUK_VARIAPERESIG_SPAN_EFSRVIVPEVPE = 91;
  private static int BUK_VARIAPERESIG_RPTBOX_IMPORTO9 = 92;
  private static int BUK_VARIAPERESIG_SPAN_EFSRVICVPEVP = 93;
  private static int BUK_VARIAPERESIG_SEC_PIEDEPAGINA = 94;
  private static int BUK_VARIAPERESIG_SEC_PIEDEREPORT = 95;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI439(IMDB);
    //
    //
    Init_PQRY_PARAMETRI438(IMDB);
    Init_PQRY_PARAMETRI438_RS(IMDB);
    Init_PQRY_VARCOMPRO5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI439(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI439, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI439, "TBL_PARAMETRI439");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI439,IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI439, 0);
  }

  private static void Init_PQRY_PARAMETRI438(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI438, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI438, "PQRY_PARAMETRI438");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI438, 0);
  }

  private static void Init_PQRY_PARAMETRI438_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI438_RS, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI438_RS, "PQRY_PARAMETRI438_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI438_RS,IMDBDef12.PQSL_PARAMETRI438_ROWNAMEESERC,1,4,0);
  }

  private static void Init_PQRY_VARCOMPRO5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO5, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO5, "PQRY_VARCOMPRO5");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCESER, "RECOVARCESER");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCESER,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARANNIMP, "RECVARANNIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARNUMIMP, "RECVARNUMIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARANNESI, "RECVARANNESI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCCAPI, "RECOVARCCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCARTI, "RECOVARCARTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_CAPART, "CAPART");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_CAPART,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCIMPO, "RECOVARCIMPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECOVARCIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARIMPCAS, "RECVARIMPCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_RECVARIMPCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_MISSIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_PROGRAMMA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_DESMISSIONE, "DESMISSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_DESMISSIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_DESPROGRAMMA, "DESPROGRAMMA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_DESPROGRAMMA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_MACROLIVSTR, "MACROLIVSTR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_MACROLIVSTR,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO5,IMDBDef12.PQSL_VARCOMPRO5_TITOLO,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniPerEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniPerEsigibilita()
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
    FormIdx = MyGlb.FRM_VARIAPERESIG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BB4C110B-BA82-4381-9235-5B565A38623E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 396;
    DesignHeight = 210;
    set_Caption(new IDVariant("Variazioni per esigibilità"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 396;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni per esigibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_VARIAPERESI1 = new IDPanel(w, this, 1, "PAN_VARIAPERESI1");
    Frames[1].Content = PAN_VARIAPERESI1;
    PAN_VARIAPERESI1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAPERESI1.VS = MainFrm.VisualStyleList;
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 396-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "47F458EA-6ACD-4C21-8524-22AEBEAF47D2");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 412, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAPERESI1.InitStatus = 2;
    PAN_VARIAPERESI1_Init();
    PAN_VARIAPERESI1_InitFields();
    PAN_VARIAPERESI1_InitQueries();
    BKW_VARIAPERESIG = new OBook(this);
    BUK_VARIAPERESIG = new CIDREObj(BKW_VARIAPERESIG);
    BKW_VARIAPERESIG.iGuid = "A1D5DE78-E37F-42B9-A105-6B98E0D0BD76";
    BKW_VARIAPERESIG.Code = "BUK_VARIAPERESIG";
    BKW_VARIAPERESIG.BookObj = BUK_VARIAPERESIG;
    BKW_VARIAPERESIG.InitDefMasks();
    BUK_VARIAPERESIG.InitBook(1, 1245441, "Variazioni Per Esigibilita", IMDB, MainFrm.VisualStyleList);
    BUK_VARIAPERESIG.InitHTML();
    BUK_VARIAPERESIG.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_VARIAPERESIG.Book.SetMainFrm(MainFrm);
    BUK_VARIAPERESIG.SetRTCGuid(0, "A1D5DE78-E37F-42B9-A105-6B98E0D0BD76");
    BUK_VARIAPERESIG.SetObjCode(0, "VARIAPERESIG");
    BUK_VARIAPERESIG_MST_TEMPLATE_Init();
    BUK_VARIAPERESIG_RPT_REPORT_Init();
    BUK_VARIAPERESIG_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI439, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAPERESIG_PARAMETRI438();
      }
      PAN_VARIAPERESI1.UpdatePanel(MainFrm);
      // BUK_VARIAPERESIG.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIAPERESI1.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERESI1_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIAPERESI1.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERESI1_APRISCELPROP) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_VARIAPERESIG")) return BUK_VARIAPERESIG;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VariazioniPerEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniPerEsigibilita.class.getName() : (Glb.ClassWithPackage(VariazioniPerEsigibilita.class) ? VariazioniPerEsigibilita.class.getName().substring(VariazioniPerEsigibilita.class.getPackage().getName().length() + 1) : VariazioniPerEsigibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Prop Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "EtichettaInfoProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0));
      MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "InfoDel", _e);
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
      LOADEVENT_PARAMEDELETE();
      // set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni per esigibilita On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAPERESI1_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAPERESI1);
      // 
      // Variazioni per esigibilita On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0))))
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0))))
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAPERESI1.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "VariazioniperesigibilitaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni per esigibilita On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIAPERESI1_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni per esigibilita On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_VARIAPERESI1_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAPERESI1_PROPOSTA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VARIAPERESI1_DELIBERA)), true) || Column.equals((new IDVariant(PFL_VARIAPERESI1_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_VARIAPERESI1_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Delibera inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "VariazioniperesigibilitaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEESERC, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esercizio obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Proposta incompleta o nulla"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Delibera incompleta o nulla"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      BUK_VARIAPERESIG.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_VARIAPERESIG.RefreshQuery();
      BUK_VARIAPERESIG.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_VARIAPERESIG.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerEsigibilita", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAPERESIG_PARAMETRI438() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI438_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI439, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI439, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI438_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI438_RS, 0, IMDBDef4.TBL_PARAMETRI439, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 0, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 1, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 2, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 3, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 4, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 5, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 6, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI438_RS, 7, 0, IMDBDef4.TBL_PARAMETRI439, IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI439, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI439, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI439, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI438_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_VARIAPERESI1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAPERESI1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAPERESI1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAPERESI1, Cancel);
    // Stub
  }

  private void PAN_VARIAPERESI1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAPERESI1_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_VARIAPERESI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERESI1_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_VARIAPERESI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERESI1_ETICINFOPROP)
    {
      this.IdxPanelActived = this.PAN_VARIAPERESI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERESI1_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARIAPERESI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERESI1_INFODEL)
    {
      this.IdxPanelActived = this.PAN_VARIAPERESI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAPERESI1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAPERESI1_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAPERESI1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAPERESI1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_VARIAPERESIG_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_VARIAPERESIG_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_VARIAPERESIG_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_INTESTPAGINA)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPP, new IDVariant(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))?(new IDVariant("Proposta")):(new IDVariant("Delibera")))));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPR, new IDVariant(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMUNIPRO, 0), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMPRO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNPRO, 0))):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMSEDDEL, 0), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMNUMDEL, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI438, IMDBDef12.PQSL_PARAMETRI438_ROWNAMANNDEL, 0))))));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_ESERCIHEADER)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_MISSIOHEADER)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PROGRAHEADER)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PROGINTEGRUP)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_CAPARTHEADER)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_DETTAGLIO)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_TSRVNIVPEVP1, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_VARIAPERESIG.GetReportColumn(BUK_VARIAPERESIG_RPT_REPORT, "RECVARNUMIMP")), (new IDVariant("/"))), IDL.ToString(BUK_VARIAPERESIG.GetReportColumn(BUK_VARIAPERESIG_RPT_REPORT, "RECVARANNIMP")))));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_CAPARTFOOTER)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_CFSRVIVPEVPE, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_CAPARTFOOTER,"RECOVARCIMPO")));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_CFSRVICVPEVP, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_CAPARTFOOTER,"RECVARIMPCAS")));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PROGRAFOOTER)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_PFSRVIVPEVPE, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_PROGRAFOOTER,"RECOVARCIMPO")));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_PFSRVICVPEVP, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_PROGRAFOOTER,"RECVARIMPCAS")));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PROGPIEDGRUP)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_MISSIOFOOTER)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_MFSRVIVPEVPE, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_MISSIOFOOTER,"RECOVARCIMPO")));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_MFSRVICVPEVP, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_MISSIOFOOTER,"RECVARIMPCAS")));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_ESERCIFOOTER)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_EFSRVIVPEVPE, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_ESERCIFOOTER,"RECOVARCIMPO")));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_EFSRVICVPEVP, new IDVariant(BUK_VARIAPERESIG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARIAPERESIG_SEC_ESERCIFOOTER,"RECVARIMPCAS")));
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_VARIAPERESIG_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_VARIAPERESIG_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_VARIAPERESIG_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_VARIAPERESIG_MST_TEMPLATE)
    {
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_VAPEESVAPEPN, new IDVariant((new IDVariant(BUK_VARIAPERESIG.GetPageNumber()))));
      BUK_VARIAPERESIG.set_SpanValue(BUK_VARIAPERESIG_SPAN_VAPEESVPENOP, new IDVariant((new IDVariant(BUK_VARIAPERESIG.GetTotalPagesNumber()))));
    }
  }

  private void BUK_VARIAPERESIG_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_VARIAPERESIG_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_VARIAPERESIG_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_VARIAPERESIG_OnPreview()
  {
    PreviewBook = BKW_VARIAPERESIG;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAPERESI1_Init()
  {

    PAN_VARIAPERESI1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAPERESI1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAPERESI1.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, "3EE1E1CC-CA56-4E8D-90BA-7F6DCFD37E6D");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, "Variazioni");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.VIS_OPTIONBUTTON);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, "50FCBBB8-DB26-492F-B190-7859B35649C7");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, "Proposta");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, "CE1063C0-6CBD-4CD5-8C9A-3A7FFAD7DD4F");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, "Numero Proposta");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, "A7B151FA-D213-4262-9A6D-EAF8675B32C6");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, "Anno Proposta");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, "517A7E33-FEF0-4739-A1D9-829E30DB4853");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, "Delibera");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, "5D278603-DD88-4392-9B7B-A957B50A223E");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, "-");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, "F2239D06-229D-4732-9C19-FA006C0BE186");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, "Numero Delibera");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, "FDE055B7-A35F-425E-A25B-2FE080E16E5A");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, "/");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, "7481E58D-0B26-466A-A00A-D3765FD898E1");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, "Anno Delibera");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, "BAE68EAF-8D7A-4475-A153-D61F90151144");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERESI1.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, "B19C903C-E95C-4BA8-A754-679BD8AA3F84");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, "-");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, "CC2548A5-7897-4909-B3B4-DBF54827EFED");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, "/");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, "5DE1DA34-A428-48F3-B28A-2017E9A39028");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERESI1.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, "CC5FC681-F34E-4750-993E-C2A94FAC3B9D");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAPERESI1.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, 0, "info.gif", false);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, "045CF116-736A-495C-AB1E-0477CE7A63B8");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, "Elabora");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERESI1.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, 0, "button1.gif", false);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, "98EE6AD8-E5F0-4AAA-9A47-F42FFECF7287");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAPERESI1.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, 0, "info.gif", false);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERESI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, "F05529EA-871D-4AC3-B000-CAC451AEBCF1");
    PAN_VARIAPERESI1.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, "Esercizio");
    PAN_VARIAPERESI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, "");
    PAN_VARIAPERESI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAPERESI1.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAPERESI1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_FORM, 12, 24, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_FORM, 68);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_VARIAZIONI, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_VARIAZIONI, PPQRY_PARAMETRI438, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_VARIAPERESI1.SetValueListItem(PFL_VARIAPERESI1_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_VARIAPERESI1.SetValueListItem(PFL_VARIAPERESI1_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_FORM, 20, 48, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_PROPOSTA, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_PROPOSTA, PPQRY_PARAMETRI438, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_FORM, 212, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_NUMEROPROPOS, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_NUMEROPROPOS, PPQRY_PARAMETRI438, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_FORM, 272, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_ANNOPROPOSTA, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_ANNOPROPOSTA, PPQRY_PARAMETRI438, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_FORM, 24, 48, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_DELIBERA, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_DELIBERA, PPQRY_PARAMETRI438, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_FORM, 128, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_TRATTIDELIBE, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delib.");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_FORM, 148, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_NUMERODELIBE, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_NUMERODELIBE, PPQRY_PARAMETRI438, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_FORM, 188, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_BARRADELIBER, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_FORM, 208, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_ANNODELIBERA, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_ANNODELIBERA, PPQRY_PARAMETRI438, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_FORM, 248, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_APRISCELDELI, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_FORM, 192, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_TRATTIPROPOS, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_FORM, 252, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_BARRAPROPOST, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_FORM, 312, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_APRISCELPROP, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_LIST, 288, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_FORM, 332, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ETICINFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_ETICINFOPROP, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_ETICINFOPROP, -1, "", "ETICINFOPROP", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_FORM, 200, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_ELABORA, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_LIST, 296, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_FORM, 268, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_INFODEL, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_INFODEL, -1, "", "INFODEL", 0, 0, 0, -13997);
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_VARIAPERESI1.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_FORM, 20, 72, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERESI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAPERESI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERESI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERESI1_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_VARIAPERESI1.SetFieldPage(PFL_VARIAPERESI1_ESERCIZIO, -1, -1);
    PAN_VARIAPERESI1.SetFieldPanel(PFL_VARIAPERESI1_ESERCIZIO, PPQRY_PARAMETRI438, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
  }

  private void PAN_VARIAPERESI1_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAPERESI1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAPERESI1.SetIMDB(IMDB, "PQRY_PARAMETRI438", true);
    PAN_VARIAPERESI1.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIAPERESI1.SetQueryIMDB(PPQRY_PARAMETRI438, IMDBDef12.PQRY_PARAMETRI438_RS, IMDBDef4.TBL_PARAMETRI439);
    JustLoaded = true;
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_VARIAZIONI, IMDBDef4.FLD_PARAMETRI439_ROWNAMEVARIA);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_PROPOSTA, IMDBDef4.FLD_PARAMETRI439_ROWNAMUNIPRO);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMPRO);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNPRO);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_DELIBERA, IMDBDef4.FLD_PARAMETRI439_ROWNAMSEDDEL);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI439_ROWNAMNUMDEL);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI439_ROWNAMANNDEL);
    PAN_VARIAPERESI1.SetFieldPrimaryIndex(PFL_VARIAPERESI1_ESERCIZIO, IMDBDef4.FLD_PARAMETRI439_ROWNAMEESERC);
    PAN_VARIAPERESI1.SetMasterTable(0, "PARAMETRI439");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAPERESI1.Status() == 2)
    {
      int oldListQBE = PAN_VARIAPERESI1.iUseListQBE;
      PAN_VARIAPERESI1.iUseListQBE = 0;
      PAN_VARIAPERESI1.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAPERESI1.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAPERESI1.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_VARIAPERESIG_MST_TEMPLATE_Init()
  {
    BUK_VARIAPERESIG.InitMastro(BUK_VARIAPERESIG_MST_TEMPLATE, 3, 21000, 29700, 1, 2, 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_MST_TEMPLATE, "403BAF41-1B94-4E08-9A6C-30B84433D6C0");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_MST_TEMPLATE, "TEMPLATE");
    BUK_VARIAPERESIG.InitMastroBox(BUK_VARIAPERESIG_MST_TEMPLATE, BUK_VARIAPERESIG_RPTBOX_TESTATPAGINA, 1000, 300, 27700, 1400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_TESTATPAGINA, "8D933D96-E68D-4150-847A-8948C9F0C09C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_VARIAPERESIG.InitMastroBox(BUK_VARIAPERESIG_MST_TEMPLATE, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA, 1000, 1700, 27700, 17200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA, "E85D713A-5A89-4140-B7D1-45E611924929");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_VARIAPERESIG.InitMastroBox(BUK_VARIAPERESIG_MST_TEMPLATE, BUK_VARIAPERESIG_RPTBOX_PIEDEPAGINA, 1000, 18900, 27700, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_PIEDEPAGINA, "C38C93C7-BBC7-40DA-8B14-B3B4E6C5C94F");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_VARIAPERESIG.InitMastroBox(BUK_VARIAPERESIG_MST_TEMPLATE, BUK_VARIAPERESIG_RPTBOX_PAG, 25400, 300, 3300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_PAG, "FD1A933F-F794-404E-A85B-C40E0A9E2E4B");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_PAG, "PAG");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_PAG, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PAG, BUK_VARIAPERESIG_SPAN_NUOVASPAN1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Pag. ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN1, "9E795B6D-CB1A-45B5-ACC4-7584FA048466");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PAG, BUK_VARIAPERESIG_SPAN_VAPEESVAPEPN, MyGlb.VIS_DEFAREPOSTYL, 1, 19, 0, 271384705, "", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_VAPEESVAPEPN, "61642F6E-885E-495D-B55E-F82B67836066");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_VAPEESVAPEPN, "VAPEESVAPEPN");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PAG, BUK_VARIAPERESIG_SPAN_NUOVASPAN2, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", " di ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN2, "E0F14E6B-D88A-404C-8204-23870C063595");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN2, "NUOVASPAN2");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PAG, BUK_VARIAPERESIG_SPAN_VAPEESVPENOP, MyGlb.VIS_DEFAREPOSTYL, 1, 19, 0, 271384705, "", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_VAPEESVPENOP, "2B925E21-455D-45AC-88BA-DCF745AAF35F");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_VAPEESVPENOP, "VAPEESVPENOP");
  }

  private void BUK_VARIAPERESIG_RPT_REPORT_InitQuery() { BUK_VARIAPERESIG_RPT_REPORT_InitQuery(true, true); }
  private void BUK_VARIAPERESIG_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as RECOVARCESER, ");
      SQL.append("  A.ANNO_IMP as RECVARANNIMP, ");
      SQL.append("  A.NUMERO_IMP as RECVARNUMIMP, ");
      SQL.append("  A.ANNO_ESIGIBILITA as RECVARANNESI, ");
      SQL.append("  A.CAPITOLO as RECOVARCCAPI, ");
      SQL.append("  A.ARTICOLO as RECOVARCARTI, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) as CAPART, ");
      SQL.append("  A.IMPORTO as RECOVARCIMPO, ");
      SQL.append("  A.IMPORTO_CASSA as RECVARIMPCAS, ");
      SQL.append("  SUBSTR(E.CODICE_STRUTTURA, 1, 2) as MISSIONE, ");
      SQL.append("  SUBSTR(E.CODICE_STRUTTURA, 3, 2) as PROGRAMMA, ");
      SQL.append("  A_GET_DES_DA_STRUTTURA('S',A.ESERCIZIO,1,TRUNC(TO_NUMBER(SUBSTR(E.CODICE_STRUTTURA, 1, 2)))) as DESMISSIONE, ");
      SQL.append("  A_GET_DES_DA_STRUTTURA('S',A.ESERCIZIO,2,TRUNC(TO_NUMBER(SUBSTR(E.CODICE_STRUTTURA, 1, 4)))) as DESPROGRAMMA, ");
      SQL.append("  CASE WHEN SUBSTR(F.MACRO_LIV_5_STR, -(3)) <> '000' THEN F.MACRO_LIV_5_STR ELSE F.MACRO_LIV_4_STR END as MACROLIVSTR, ");
      SQL.append("  CASE WHEN SUBSTR(F.MACRO_LIV_5_STR, -(3)) <> '000' THEN SUBSTR(F.MACRO_LIV_5, 1, 1) ELSE SUBSTR(F.MACRO_LIV_4, 1, 1) END as TITOLO ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO A, ");
      SQL.append("  T54 B, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL C, ");
      SQL.append("  TIPI_IMPORTO_VBIL D, ");
      SQL.append("  CAP E, ");
      SQL.append("  VISTA_CODIFICHE_CAP F ");
      SQL.append("where (~~PQRY_PARAMETRI438.ROWNAMEVARIA~~ = 'P') ");
      SQL.append("and   ((A.ESERCIZIO BETWEEN ~~PQRY_PARAMETRI438.ROWNAMEESERC~~ AND ~~PQRY_PARAMETRI438.ROWNAMEESERC~~ + 2)) ");
      SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAMETRI438.ROWNAMUNIPRO~~, NVL(A.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI438.ROWNAMNUMPRO~~, NVL(A.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI438.ROWNAMANNPRO~~, NVL(A.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (NOT ((A.ANNO_IMP IS NULL))) ");
      SQL.append("and   (B.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (C.CODICE = B.TIPOLOGIA) ");
      SQL.append("and   (D.CODICE = C.TIPO_IMPORTO) ");
      SQL.append("and   ((D.TIPO_REISCRIZIONE = 'IMP' OR ((D.TIPO_REISCRIZIONE IS NULL) AND GET_FPV_ESPL(A.ESERCIZIO,TRUNC(TO_NUMBER(F.MACRO_LIV_4_STR))) = 'SI'))) ");
      SQL.append("and   (E.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (E.E_S = A.E_S) ");
      SQL.append("and   (E.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (F.ESERCIZIO = E.ESERCIZIO) ");
      SQL.append("and   (F.E_S = E.E_S) ");
      SQL.append("and   (F.CAPITOLO = E.CAPITOLO) ");
      SQL.append("and   (F.ARTICOLO = E.ARTICOLO) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  G.ESERCIZIO, ");
      SQL.append("  G.ANNO_IMP, ");
      SQL.append("  G.NUMERO_IMP, ");
      SQL.append("  G.ANNO_ESIGIBILITA, ");
      SQL.append("  G.CAPITOLO, ");
      SQL.append("  G.ARTICOLO, ");
      SQL.append("  TO_CHAR ( G.CAPITOLO ) || '/' || TO_CHAR ( G.ARTICOLO ), ");
      SQL.append("  G.IMPORTO, ");
      SQL.append("  G.IMPORTO_CASSA, ");
      SQL.append("  SUBSTR(K.CODICE_STRUTTURA, 1, 2), ");
      SQL.append("  SUBSTR(K.CODICE_STRUTTURA, 3, 2), ");
      SQL.append("  A_GET_DES_DA_STRUTTURA('S',G.ESERCIZIO,1,TRUNC(TO_NUMBER(SUBSTR(K.CODICE_STRUTTURA, 1, 2)))), ");
      SQL.append("  A_GET_DES_DA_STRUTTURA('S',G.ESERCIZIO,2,TRUNC(TO_NUMBER(SUBSTR(K.CODICE_STRUTTURA, 1, 4)))), ");
      SQL.append("  CASE WHEN SUBSTR(L.MACRO_LIV_5_STR, -(3)) <> '000' THEN L.MACRO_LIV_5_STR ELSE L.MACRO_LIV_4_STR END, ");
      SQL.append("  CASE WHEN SUBSTR(L.MACRO_LIV_5_STR, -(3)) <> '000' THEN SUBSTR(L.MACRO_LIV_5, 1, 1) ELSE SUBSTR(L.MACRO_LIV_4, 1, 1) END ");
      SQL.append("from ");
      SQL.append("  VARCOM G, ");
      SQL.append("  T54 H, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL I, ");
      SQL.append("  TIPI_IMPORTO_VBIL J, ");
      SQL.append("  CAP K, ");
      SQL.append("  VISTA_CODIFICHE_CAP L ");
      SQL.append("where (~~PQRY_PARAMETRI438.ROWNAMEVARIA~~ = 'D') ");
      SQL.append("and   ((G.ESERCIZIO BETWEEN ~~PQRY_PARAMETRI438.ROWNAMEESERC~~ AND ~~PQRY_PARAMETRI438.ROWNAMEESERC~~ + 2)) ");
      SQL.append("and   (NVL(G.SEDE_DEL, '-1') = NVL(~~PQRY_PARAMETRI438.ROWNAMSEDDEL~~, NVL(G.SEDE_DEL, '-1'))) ");
      SQL.append("and   (NVL(G.NUMERO_DEL, -1) = NVL(~~PQRY_PARAMETRI438.ROWNAMNUMDEL~~, NVL(G.NUMERO_DEL, -1))) ");
      SQL.append("and   (NVL(G.ANNO_DEL, -1) = NVL(~~PQRY_PARAMETRI438.ROWNAMANNDEL~~, NVL(G.ANNO_DEL, -1))) ");
      SQL.append("and   (G.E_S = 'S') ");
      SQL.append("and   (NOT ((G.ANNO_IMP IS NULL))) ");
      SQL.append("and   (H.CODICE = G.TIPO_VAR) ");
      SQL.append("and   (I.CODICE = H.TIPOLOGIA) ");
      SQL.append("and   (J.CODICE = I.TIPO_IMPORTO) ");
      SQL.append("and   ((J.TIPO_REISCRIZIONE = 'IMP' OR ((J.TIPO_REISCRIZIONE IS NULL) AND GET_FPV_ESPL(G.ESERCIZIO,TRUNC(TO_NUMBER(L.MACRO_LIV_4_STR))) = 'SI'))) ");
      SQL.append("and   (K.ESERCIZIO = G.ESERCIZIO) ");
      SQL.append("and   (K.E_S = G.E_S) ");
      SQL.append("and   (K.CAPITOLO = G.CAPITOLO) ");
      SQL.append("and   (K.ARTICOLO = G.ARTICOLO) ");
      SQL.append("and   (L.ESERCIZIO = K.ESERCIZIO) ");
      SQL.append("and   (L.E_S = K.E_S) ");
      SQL.append("and   (L.CAPITOLO = K.CAPITOLO) ");
      SQL.append("and   (L.ARTICOLO = K.ARTICOLO) ");
      SQL.append("order by 1, 10, 11, 7, 15, 5, 6, 2, 3, 4 ");
      BUK_VARIAPERESIG.SetReportQuery(BUK_VARIAPERESIG_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "748C2EB8-6FDE-4D01-9BF1-D98B6828AC97");
      if (BUK_VARIAPERESIG.FindObjByID(BUK_VARIAPERESIG_SEC_ESERCIHEADER) != null)
        BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_ESERCIHEADER, "RECOVARCESER");
      if (BUK_VARIAPERESIG.FindObjByID(BUK_VARIAPERESIG_SEC_MISSIOHEADER) != null)
        BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_MISSIOHEADER, "MISSIONE");
      if (BUK_VARIAPERESIG.FindObjByID(BUK_VARIAPERESIG_SEC_PROGRAHEADER) != null)
        BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_PROGRAHEADER, "PROGRAMMA");
      if (BUK_VARIAPERESIG.FindObjByID(BUK_VARIAPERESIG_SEC_CAPARTHEADER) != null)
        BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_CAPARTHEADER, "CAPART");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_VARIAPERESIG_RPT_REPORT_Init()
  {
    BUK_VARIAPERESIG.InitReport(BUK_VARIAPERESIG_RPT_REPORT, 196865);
    BUK_VARIAPERESIG_RPT_REPORT_InitQuery(true, false);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPT_REPORT, "BE312B35-759A-405D-95AE-D6E0EA46F388");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPT_REPORT, "REPORT");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_INTESTREPORT, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_INTESTREPORT, "84006A59-549E-41F9-AE33-A6BFE30774E5");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_INTESTPAGINA, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_INTESTPAGINA, BUK_VARIAPERESIG_RPTBOX_TESTATPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_INTESTPAGINA, "38B93A2F-067B-4FE3-87F7-42A44AB1D54B");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_INTESTPAGINA, BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, 0, 600, 27700, 600, 0, 1, 1, MyGlb.VIS_TITOREPNOBOR, 983041, 554, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, "D3CB8B7B-8753-40FC-8AA2-9F1753A498B4");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, "VABIPEESAICE");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, 3);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_NUOVASPAN3, MyGlb.VIS_TITOREPNOBOR, 0, 0, 0, 271384705, "", "Variazioni Bilancio per esigibilità anno in corso - Esercizio ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN3, "8A4FD90E-0725-4951-9648-44318188943E");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN3, "NUOVASPAN3");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_REVAESVPEVP1, MyGlb.VIS_TITOREPNOBOR, 1, 4, 0, 271384705, "", "::RECOVARCESER", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REVAESVPEVP1, "8952CE67-53EB-425E-A160-AB958E453B61");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REVAESVPEVP1, "REVAESVPEVP1");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_NUOVASPAN4, MyGlb.VIS_TITOREPNOBOR, 0, 0, 0, 271384961, "", " - ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN4, "D25B3352-DA12-4189-941B-939AA2F6FA4A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN4, "NUOVASPAN4");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPP, MyGlb.VIS_TITOREPNOBOR, 5, 99, 0, 271384705, "", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPP, "9DE99419-5A33-4FE2-BA00-F34769CADB52");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPP, "IRNVVPEVPEPP");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_NUOVASPAN5, MyGlb.VIS_TITOREPNOBOR, 0, 0, 0, 271384961, "", " ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN5, "3B0C3647-AD0A-466A-926A-50969EFC0ED9");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN5, "NUOVASPAN5");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VABIPEESAICE, BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPR, MyGlb.VIS_TITOREPNOBOR, 5, 99, 0, 271384705, "", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPR, "DE95EC4E-57F0-4328-AA27-B9901CC74747");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_IRNVVPEVPEPR, "IRNVVPEVPEPR");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_ESERCIHEADER, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240833, "RECOVARCESER");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_ESERCIHEADER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_ESERCIHEADER, "9D8CD9AF-1AFE-4A3B-BF35-1DE651A4B1FC");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_ESERCIHEADER, "ESERCIHEADER");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_MISSIOHEADER, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240833, "MISSIONE");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_MISSIOHEADER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_MISSIOHEADER, "786D6790-95B8-49DE-A144-202BAF4C7E65");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_MISSIOHEADER, "MISSIOHEADER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_MISSIOHEADER, BUK_VARIAPERESIG_RPTBOX_MISSIONE, 0, 100, 27700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_MISSIONE, "35EE887A-06D9-4C2B-BAB3-250E0FD03127");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_MISSIONE, "MISSIONE");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_MISSIONE, BUK_VARIAPERESIG_SPAN_NUOVASPAN6, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Missione ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN6, "A9F4DBDE-97E3-4899-A6B3-0C34968BCE6B");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN6, "NUOVASPAN6");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_MISSIONE, BUK_VARIAPERESIG_SPAN_REMIVAPEEVPE, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "::MISSIONE", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REMIVAPEEVPE, "C4A06E96-A35F-4D98-B6D5-7B5EF75FA3CA");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REMIVAPEEVPE, "REMIVAPEEVPE");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_MISSIONE, BUK_VARIAPERESIG_SPAN_NUOVASPAN7, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", " ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN7, "BABF8C72-E0BF-415B-9BDC-ACC331F2D562");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN7, "NUOVASPAN7");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_MISSIONE, BUK_VARIAPERESIG_SPAN_REDEMIVPEVPE, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "::DESMISSIONE", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REDEMIVPEVPE, "1BB8786D-F507-45F8-A84B-CC0C10BA7FE9");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REDEMIVPEVPE, "REDEMIVPEVPE");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PROGRAHEADER, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "PROGRAMMA");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PROGRAHEADER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PROGRAHEADER, "6744AFF0-9B2C-4D77-8872-65A30A0E39ED");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PROGRAHEADER, "PROGRAHEADER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGRAHEADER, BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, 0, 100, 27700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, "C0F6AD62-4748-4A6F-988C-8C8F39EB2577");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, "PROGRAMMA");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, BUK_VARIAPERESIG_SPAN_NUOVASPAN8, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Programma ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN8, "40D787BF-CC55-4520-AF58-D81A66C8E95F");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN8, "NUOVASPAN8");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, BUK_VARIAPERESIG_SPAN_REPRVAPEEVPE, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "::PROGRAMMA", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REPRVAPEEVPE, "B483F945-B447-417A-94C0-1EF87A8DD725");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REPRVAPEEVPE, "REPRVAPEEVPE");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, BUK_VARIAPERESIG_SPAN_NUOVASPAN9, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", " ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN9, "007A6B62-3F54-4939-9A82-18DCD44A4F48");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN9, "NUOVASPAN9");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PROGRAMMA, BUK_VARIAPERESIG_SPAN_REDEPRVPEVPE, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "::DESPROGRAMMA", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REDEPRVPEVPE, "A3F5C076-CFCD-4D19-9FCC-1D54B403FD47");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REDEPRVPEVPE, "REDEPRVPEVPE");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PROGINTEGRUP, 1200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "PROGRAMMA");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, "A1368650-B88D-4D6F-AF31-6139D963CE55");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, "PROGINTEGRUP");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_BORDOSUP, 0, 0, 27700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 375, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_BORDOSUP, "1B5C0DE9-3559-4A6D-8E07-363EA23FCF49");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_BORDOSUP, "BORDOSUP");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_BORDOSUP, BUK_VARIAPERESIG_SPAN_NUOVASPAN10, MyGlb.VIS_BORDOSUPERIO, 0, 0, 0, 271384705, "", "Bordo sup", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN10, "C582DEC4-D1FD-40EA-8727-C9966802DEF7");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN10, "NUOVASPAN10");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_PIANODEICON1, 0, 200, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_PIANODEICON1, "E75ADAFA-D97A-495A-B8F4-ACCDB6BBC8BF");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_PIANODEICON1, "PIANODEICON1");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PIANODEICON1, BUK_VARIAPERESIG_SPAN_NUOVASPAN11, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Piano dei Conti", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN11, "D44988F1-1640-47B0-93E7-164361DF80A6");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN11, "NUOVASPAN11");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_CAPITOLO1, 2800, 200, 3500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_CAPITOLO1, "061D40DA-4118-4D8D-8F0E-CA6B0B113AC4");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_CAPITOLO1, "CAPITOLO1");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_CAPITOLO1, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_CAPITOLO1, BUK_VARIAPERESIG_SPAN_NUOVASPAN12, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN12, "9F526337-7A1F-494B-823A-A7044BA47B8D");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN12, "NUOVASPAN12");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_IMPEGNO2, 6600, 200, 1500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPEGNO2, "DFD49B2B-EA4E-4D65-8F66-23770165BE94");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPEGNO2, "IMPEGNO2");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPEGNO2, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPEGNO2, BUK_VARIAPERESIG_SPAN_NUOVASPAN13, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN13, "65810D23-687A-4493-B7D9-C91232A73EC4");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN13, "NUOVASPAN13");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL, 8300, 200, 1600, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL, "6E336329-7E0D-45BA-8450-5BC927ED336D");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL, "ANNOESIGIBIL");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_ANNOESIGIBIL, BUK_VARIAPERESIG_SPAN_NUOVASPAN14, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Anno Esigibilità", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN14, "315FD90C-E843-46B4-9C06-30D2E25A989C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN14, "NUOVASPAN14");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS, 10200, 200, 2800, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS, "2013AAC3-D797-48B6-98A6-15E1005C5892");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS, "VARIAPERREIS");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VARIAPERREIS, BUK_VARIAPERESIG_SPAN_NUOVASPAN15, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Variazione per Reiscrizione", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN15, "F35F12C3-B2A4-4A11-AE3F-BD056FFB2622");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN15, "NUOVASPAN15");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1, 13800, 200, 2500, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1, "DB3330D9-4471-4967-8C7B-446473686EDB");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1, "VARIPERREIS1");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_VARIPERREIS1, BUK_VARIAPERESIG_SPAN_NUOVASPAN16, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Variazione Cassa", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN16, "EC394E8C-5FF3-436A-B395-B75022F46AE4");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN16, "NUOVASPAN16");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGINTEGRUP, BUK_VARIAPERESIG_RPTBOX_BORDOSUP1, 0, 1000, 27700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 375, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_BORDOSUP1, "C05A3135-C1A8-43E4-A257-67C326248E85");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_BORDOSUP1, "BORDOSUP1");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_BORDOSUP1, BUK_VARIAPERESIG_SPAN_NUOVASPAN17, MyGlb.VIS_BORDOSUPERIO, 0, 0, 0, 271384705, "", "Bordo sup", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN17, "C8F4209D-17A9-40B0-B042-D153B0170DAA");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN17, "NUOVASPAN17");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_CAPARTHEADER, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "CAPART");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_CAPARTHEADER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_CAPARTHEADER, "C438585F-9A15-4329-8817-F987DBCD0382");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_CAPARTHEADER, "CAPARTHEADER");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_DETTAGLIO, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_DETTAGLIO, "51F9F31D-46B3-4DFE-AA1D-5BE36F498955");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_PIANODEICONT, 0, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 5177345, 322, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_PIANODEICONT, "C87CC1A4-E2F9-451C-9B26-ACB09FCECE8C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_PIANODEICONT, "PIANODEICONT");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_PIANODEICONT, BUK_VARIAPERESIG_SPAN_REMALSVPEVPE, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Piano dei conti", "::MACROLIVSTR", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REMALSVPEVPE, "5A50B44C-CAA3-40D3-928D-A42B19739D3A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REMALSVPEVPE, "REMALSVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_CAPITOLO, 2800, 100, 3500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 5177345, 322, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_CAPITOLO, "46D97D2D-6D94-47CF-A7CF-2AEB00E26474");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_CAPITOLO, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_CAPITOLO, BUK_VARIAPERESIG_SPAN_RECAARVPEVPE, MyGlb.VIS_DEFAREPOSTYL, 5, 199, 0, 271384705, "Capitolo", "::CAPART", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_RECAARVPEVPE, "22A675EC-EA15-4199-A6C4-73E81FB86796");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_RECAARVPEVPE, "RECAARVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_IMPEGNO, 6600, 100, 1500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPEGNO, "5A879F89-A998-4B9B-92B7-A0C78D493772");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPEGNO, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPEGNO, BUK_VARIAPERESIG_SPAN_TSRVNIVPEVP1, MyGlb.VIS_DEFAREPOSTYL, 5, 199, 0, 271384705, "12345/2013", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_TSRVNIVPEVP1, "51A6F742-8D4D-4802-AB05-07F8D331E34B");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_TSRVNIVPEVP1, "TSRVNIVPEVP1");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_ANNO, 8800, 100, 1100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_ANNO, "79FDCF4D-E5DE-41A9-8F2B-72B5A46FE6AA");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_ANNO, "ANNO");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_ANNO, BUK_VARIAPERESIG_SPAN_REVAAEVPEVP1, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "ANno", "::RECVARANNESI", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REVAAEVPEVP1, "1CDDAC1A-4A72-4095-98DA-9FD1EF68EC92");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REVAAEVPEVP1, "REVAAEVPEVP1");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_IMPORTO, 10200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO, "7EDB83D7-6D26-48EE-9FB8-AC9D5A35C596");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO, "IMPORTO");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO, BUK_VARIAPERESIG_SPAN_REVAIMVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 14, 6, 271384705, "123.456.789.123,12", "::RECOVARCIMPO", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REVAIMVPEVPE, "F2F2B6E2-495D-48A2-B871-A1D9C3916320");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REVAIMVPEVPE, "REVAIMVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_DETTAGLIO, BUK_VARIAPERESIG_RPTBOX_IMPORTO1, 13500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO1, "C0CD70EF-C9DF-4BCC-B98C-3243CCFDDE06");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO1, "IMPORTO1");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO1, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO1, BUK_VARIAPERESIG_SPAN_REVAICVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 14, 6, 271384705, "123.456.789.123,12", "::RECVARIMPCAS", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REVAICVPEVPE, "209F62E7-D285-4F27-BD11-FAED0C5FA0AF");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REVAICVPEVPE, "REVAICVPEVPE");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_CAPARTFOOTER, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "CAPART");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, "696E8A15-42FF-4A43-AA0C-6EA6D0AB86FF");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, "CAPARTFOOTER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, BUK_VARIAPERESIG_RPTBOX_TOTALECAPITO, 6900, 100, 3000, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_TOTALECAPITO, "D16115E5-10A8-49D9-A5FC-32ADA29FE9AB");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_TOTALECAPITO, BUK_VARIAPERESIG_SPAN_NUOVASPAN18, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Totale Capitolo", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN18, "BB0B7354-AE65-4A49-94C1-9E56ED4634BA");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN18, "NUOVASPAN18");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO2, 10200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO2, "4ACEA111-DC95-4C7F-812F-6AFEDAE3220B");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO2, "IMPORTO2");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO2, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO2, BUK_VARIAPERESIG_SPAN_CFSRVIVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_CFSRVIVPEVPE, "40AAC5BA-1B79-4936-8DBA-78B76B981C15");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_CFSRVIVPEVPE, "CFSRVIVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_CAPARTFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO3, 13500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO3, "43793535-D0FB-44BD-8E7A-F0B83C1DAACA");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO3, "IMPORTO3");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO3, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO3, BUK_VARIAPERESIG_SPAN_CFSRVICVPEVP, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_CFSRVICVPEVP, "EDA38D79-E0A0-46E8-8F59-EDA044CCA069");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_CFSRVICVPEVP, "CFSRVICVPEVP");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PROGRAFOOTER, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "PROGRAMMA");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, "5F2CBEAD-F105-4BB3-B5EC-245D529E0637");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, "PROGRAFOOTER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT1, 6900, 100, 3000, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT1, "D6F2176D-456B-4D02-A2E6-2361801934DF");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT1, BUK_VARIAPERESIG_SPAN_NUOVASPAN19, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Programma", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN19, "44D9858C-7400-4990-83F9-0CEAB00D9F6A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN19, "NUOVASPAN19");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO4, 10200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO4, "0AC10CB7-196C-4C94-AD76-D54D0A488B5C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO4, "IMPORTO4");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO4, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO4, BUK_VARIAPERESIG_SPAN_PFSRVIVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_PFSRVIVPEVPE, "60AAA6B9-1FB6-4841-8A9B-D59F15BD62B1");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_PFSRVIVPEVPE, "PFSRVIVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_PROGRAFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO5, 13500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO5, "027F3B4C-8FDF-4C1D-BC5A-75616B4DAB4C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO5, "IMPORTO5");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO5, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO5, BUK_VARIAPERESIG_SPAN_PFSRVICVPEVP, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_PFSRVICVPEVP, "73FC3B52-E68E-4B31-871C-43DFC61B7DC5");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_PFSRVICVPEVP, "PFSRVICVPEVP");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PROGPIEDGRUP, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGRAMMA");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PROGPIEDGRUP, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PROGPIEDGRUP, "60CC2A85-3DC4-4CE1-B4E4-2DD35E3F6B7A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PROGPIEDGRUP, "PROGPIEDGRUP");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_MISSIOFOOTER, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "MISSIONE");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, "E99B9C9F-2C5E-41FC-BEC6-24866F6FEC1D");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, "MISSIOFOOTER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT2, 6900, 100, 3000, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT2, "46B46548-4F06-4D20-95DE-2AD7A0B7646C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT2, "TOTALECAPIT2");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT2, BUK_VARIAPERESIG_SPAN_NUOVASPAN20, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Missione", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN20, "2D4870F2-E7D5-45A9-901E-D1372348D750");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN20, "NUOVASPAN20");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO6, 10200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO6, "2C9E581A-8DB8-4154-A90A-285EC7F730C9");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO6, "IMPORTO6");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO6, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO6, BUK_VARIAPERESIG_SPAN_MFSRVIVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_MFSRVIVPEVPE, "D41571CF-2AE7-47A8-AEC4-2B2466D5AEB9");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_MFSRVIVPEVPE, "MFSRVIVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_MISSIOFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO7, 13500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO7, "9603B827-3EAF-4F62-BF46-9A3EE61E1F80");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO7, "IMPORTO7");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO7, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO7, BUK_VARIAPERESIG_SPAN_MFSRVICVPEVP, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_MFSRVICVPEVP, "FCBF565F-0C76-408C-9C74-71AE1DBEE692");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_MFSRVICVPEVP, "MFSRVICVPEVP");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_ESERCIFOOTER, 700, 1, 0, 5, MyGlb.VIS_BORDOSUPERIO, 8978689, "RECOVARCESER");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, "BCC819EE-3D19-4A11-A5E8-427161403C9A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, "ESERCIFOOTER");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3, 1500, 100, 4800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3, "F3089D6B-5BC5-497A-A91A-50F78399F29C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3, "TOTALECAPIT3");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3, BUK_VARIAPERESIG_SPAN_NUOVASPAN, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale Esercizio ", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_NUOVASPAN, "3E07B923-6202-4D79-8CDB-143D1CE24355");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_TOTALECAPIT3, BUK_VARIAPERESIG_SPAN_REVAESVPEVPE, MyGlb.VIS_INTSENBORRIG, 1, 4, 0, 271384705, "", "::RECOVARCESER", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_REVAESVPEVPE, "7C73DB83-7DE8-4186-930F-A90D0E2A8818");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_REVAESVPEVPE, "REVAESVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO8, 10200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO8, "C2F09F25-C3D6-463B-8068-79DB9AD1CC73");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO8, "IMPORTO8");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO8, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO8, BUK_VARIAPERESIG_SPAN_EFSRVIVPEVPE, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_EFSRVIVPEVPE, "D7DB7969-3E89-4242-9DDE-2D2AE6DAD98C");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_EFSRVIVPEVPE, "EFSRVIVPEVPE");
    BUK_VARIAPERESIG.InitReportBox(BUK_VARIAPERESIG_SEC_ESERCIFOOTER, BUK_VARIAPERESIG_RPTBOX_IMPORTO9, 13500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_RPTBOX_IMPORTO9, "9FF7094E-2D08-4E6E-93D9-6071BE04011F");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_RPTBOX_IMPORTO9, "IMPORTO9");
    BUK_VARIAPERESIG.set_BoxAlignment(BUK_VARIAPERESIG_RPTBOX_IMPORTO9, 4);
    BUK_VARIAPERESIG.InitBoxSpan(BUK_VARIAPERESIG_RPTBOX_IMPORTO9, BUK_VARIAPERESIG_SPAN_EFSRVICVPEVP, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "123.456.789.123,12", "", 1);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SPAN_EFSRVICVPEVP, "23DE7D79-73A4-43AE-BCA5-EE5E0E8DB45A");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SPAN_EFSRVICVPEVP, "EFSRVICVPEVP");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PIEDEPAGINA, BUK_VARIAPERESIG_RPTBOX_PIEDEPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PIEDEPAGINA, "82B60870-5247-4858-93BA-B0114E02EED6");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_VARIAPERESIG.InitSection(BUK_VARIAPERESIG_RPT_REPORT, BUK_VARIAPERESIG_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARIAPERESIG.SetSectionRendersInto(BUK_VARIAPERESIG_SEC_PIEDEREPORT, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
    BUK_VARIAPERESIG.SetRTCGuid(BUK_VARIAPERESIG_SEC_PIEDEREPORT, "19A3FDE2-7042-4259-B9D0-F33BD4CC2C8E");
    BUK_VARIAPERESIG.SetObjCode(BUK_VARIAPERESIG_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_ESERCIHEADER, "RECOVARCESER");
    BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_MISSIOHEADER, "MISSIONE");
    BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_PROGRAHEADER, "PROGRAMMA");
    BUK_VARIAPERESIG.AddReportGroup(BUK_VARIAPERESIG_SEC_CAPARTHEADER, "CAPART");
    BUK_VARIAPERESIG_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_VARIAPERESIG_InitLinks()
  {
    BUK_VARIAPERESIG.SetBoxNextBox(BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA, BUK_VARIAPERESIG_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAPERESI1) PAN_VARIAPERESI1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERESI1) PAN_VARIAPERESI1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAPERESI1) PAN_VARIAPERESI1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERESI1) PAN_VARIAPERESI1_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAPERESI1) PAN_VARIAPERESI1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_VARIAPERESIG) BUK_VARIAPERESIG_OnPreview();
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
