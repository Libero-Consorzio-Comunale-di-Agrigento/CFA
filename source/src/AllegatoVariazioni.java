// **********************************************
// Allegato Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatoVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ALLEGAVARIAZ_PARTE = 0;
  private static int GRP_ALLEGAVARIAZ_TIPOSTAMPA = 1;
  private static int GRP_ALLEGAVARIAZ_VARIAZIONI = 2;
  private static int GRP_ALLEGAVARIAZ_PROVVEDIMENT = 3;
  private static int GRP_ALLEGAVARIAZ_TIPOIMPORTO = 4;

  private static int PFL_ALLEGAVARIAZ_PARTE = 0;
  private static int PFL_ALLEGAVARIAZ_NUOVCAMPSTA1 = 1;
  private static int PFL_ALLEGAVARIAZ_SF1 = 2;
  private static int PFL_ALLEGAVARIAZ_TIPOSTAMPA = 3;
  private static int PFL_ALLEGAVARIAZ_VARIAZIONI = 4;
  private static int PFL_ALLEGAVARIAZ_NUOVCAMPSTA2 = 5;
  private static int PFL_ALLEGAVARIAZ_SEDEDELIBERA = 6;
  private static int PFL_ALLEGAVARIAZ_NUMERODELIBE = 7;
  private static int PFL_ALLEGAVARIAZ_ANNODELIBERA = 8;
  private static int PFL_ALLEGAVARIAZ_UNITAPROPOST = 9;
  private static int PFL_ALLEGAVARIAZ_NUMEROPROPOS = 10;
  private static int PFL_ALLEGAVARIAZ_ANNOPROPOSTA = 11;
  private static int PFL_ALLEGAVARIAZ_SCELTAPROP = 12;
  private static int PFL_ALLEGAVARIAZ_INFOPRO = 13;
  private static int PFL_ALLEGAVARIAZ_SCELTADEC = 14;
  private static int PFL_ALLEGAVARIAZ_INFODEC = 15;
  private static int PFL_ALLEGAVARIAZ_SF = 16;
  private static int PFL_ALLEGAVARIAZ_TIPOIMPORTO = 17;
  private static int PFL_ALLEGAVARIAZ_NUOVCAMPSTAT = 18;
  private static int PFL_ALLEGAVARIAZ_VISUALSTANZI = 19;
  private static int PFL_ALLEGAVARIAZ_DATAAL = 20;
  private static int PFL_ALLEGAVARIAZ_INTESTSTAMPA = 21;
  private static int PFL_ALLEGAVARIAZ_ELABORA = 22;

  private static int PPQRY_PARAMETRI435 = 0;


  IDPanel PAN_ALLEGAVARIAZ;
  CIDREObj BUK_STAMPPERCODI;
  OBook BKW_STAMPPERCODI;
  //
  // Template Pages constants
  private static int BUK_STAMPPERCODI_MST_TEMPLATE = 1;
  private static int BUK_STAMPPERCODI_RPTBOX_LOGO = 2;
  private static int BUK_STAMPPERCODI_RPTBOX_TESTATPAGINA = 3;
  private static int BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA = 4;
  private static int BUK_STAMPPERCODI_RPTBOX_PIEDEPAGINA = 5;
  private static int BUK_STAMPPERCODI_RPTBOX_PAG = 6;
  private static int BUK_STAMPPERCODI_SPAN_PAG1 = 7;
  private static int BUK_STAMPPERCODI_RPTBOX_DATA = 8;
  private static int BUK_STAMPPERCODI_SPAN_PAG3 = 9;
  private static int BUK_STAMPPERCODI_SPAN_TODAY1 = 10;
  private static int BUK_STAMPPERCODI_RPTBOX_PAG1 = 11;
  private static int BUK_STAMPPERCODI_SPAN_PAG2 = 12;
  private static int BUK_STAMPPERCODI_RPTBOX_DATA1 = 13;
  private static int BUK_STAMPPERCODI_SPAN_PAG = 14;
  private static int BUK_STAMPPERCODI_SPAN_TODAY = 15;

  //
  // Reports constants
  private static int BUK_STAMPPERCODI_RPT_REPORT = 16;
  private static int BUK_STAMPPERCODI_SEC_INTESTREPOR1 = 17;
  private static int BUK_STAMPPERCODI_SEC_INTESTPAGIN1 = 18;
  private static int BUK_STAMPPERCODI_SEC_ESGRUPPO = 19;
  private static int BUK_STAMPPERCODI_RPTBOX_ES = 20;
  private static int BUK_STAMPPERCODI_SPAN_ES = 21;
  private static int BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE = 22;
  private static int BUK_STAMPPERCODI_SPAN_RONAINSTAVAV = 23;
  private static int BUK_STAMPPERCODI_RPTBOX_CODICEUO1 = 24;
  private static int BUK_STAMPPERCODI_SPAN_C4 = 25;
  private static int BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT = 26;
  private static int BUK_STAMPPERCODI_SPAN_C2 = 27;
  private static int BUK_STAMPPERCODI_RPTBOX_CODICE2 = 28;
  private static int BUK_STAMPPERCODI_SPAN_IRVESAVSPCET = 29;
  private static int BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE = 30;
  private static int BUK_STAMPPERCODI_SPAN_DESCRIZIONE = 31;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN10 = 32;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN12 = 33;
  private static int BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA = 34;
  private static int BUK_STAMPPERCODI_SPAN_STANZIINIZI1 = 35;
  private static int BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET = 36;
  private static int BUK_STAMPPERCODI_SPAN_VARIAZCOMPET = 37;
  private static int BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI = 38;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN8 = 39;
  private static int BUK_STAMPPERCODI_RPTBOX_STANINIZCASS = 40;
  private static int BUK_STAMPPERCODI_SPAN_STANZIINIZIA = 41;
  private static int BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA = 42;
  private static int BUK_STAMPPERCODI_SPAN_VARIAZICASSA = 43;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN6 = 44;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN7 = 45;
  private static int BUK_STAMPPERCODI_RPTBOX_CAPITOLO = 46;
  private static int BUK_STAMPPERCODI_SPAN_IRNTSAVAVCCI = 47;
  private static int BUK_STAMPPERCODI_RPTBOX_STNCASSADEF = 48;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN9 = 49;
  private static int BUK_STAMPPERCODI_SEC_RAGTREINTGRU = 50;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1 = 51;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN11 = 52;
  private static int BUK_STAMPPERCODI_SPAN_RERATRALVSP1 = 53;
  private static int BUK_STAMPPERCODI_SEC_VALOINTEGRUP = 54;
  private static int BUK_STAMPPERCODI_RPTBOX_CODICEUO = 55;
  private static int BUK_STAMPPERCODI_SPAN_ILRCAVSPC3RC = 56;
  private static int BUK_STAMPPERCODI_RPTBOX_CAP = 57;
  private static int BUK_STAMPPERCODI_SPAN_IRNTSAVAVCBR = 58;
  private static int BUK_STAMPPERCODI_RPTBOX_DESC = 59;
  private static int BUK_STAMPPERCODI_SPAN_RECADEALVSPC = 60;
  private static int BUK_STAMPPERCODI_SPAN_ININROGAVSPC = 61;
  private static int BUK_STAMPPERCODI_RPTBOX_STNINI = 62;
  private static int BUK_STAMPPERCODI_RPTBOX_COMPETENZA1 = 63;
  private static int BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC = 64;
  private static int BUK_STAMPPERCODI_RPTBOX_STNDEFCALC = 65;
  private static int BUK_STAMPPERCODI_SPAN_C3 = 66;
  private static int BUK_STAMPPERCODI_RPTBOX_STNINICA1 = 67;
  private static int BUK_STAMPPERCODI_RPTBOX_CASSA1 = 68;
  private static int BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC = 69;
  private static int BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL = 70;
  private static int BUK_STAMPPERCODI_SPAN_C = 71;
  private static int BUK_STAMPPERCODI_RPTBOX_CODICE = 72;
  private static int BUK_STAMPPERCODI_SPAN_RECOALVASTPC = 73;
  private static int BUK_STAMPPERCODI_RPTBOX_CODICE1 = 74;
  private static int BUK_STAMPPERCODI_SPAN_RECOPICAVSPC = 75;
  private static int BUK_STAMPPERCODI_SEC_DETTAGLIO = 76;
  private static int BUK_STAMPPERCODI_SEC_VALOPIEDGRUP = 77;
  private static int BUK_STAMPPERCODI_SEC_RAGTREPIEGRU = 78;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO = 79;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN13 = 80;
  private static int BUK_STAMPPERCODI_SPAN_RERATRALVSPC = 81;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTSTNINI = 82;
  private static int BUK_STAMPPERCODI_SPAN_ALVATOSTINCO = 83;
  private static int BUK_STAMPPERCODI_RPTBOX_COMPETENZA = 84;
  private static int BUK_STAMPPERCODI_SPAN_RTPGSRIAVSPC = 85;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1 = 86;
  private static int BUK_STAMPPERCODI_SPAN_ALLVARTOSTDE = 87;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA = 88;
  private static int BUK_STAMPPERCODI_SPAN_ALVATOSTINCA = 89;
  private static int BUK_STAMPPERCODI_RPTBOX_CASSA = 90;
  private static int BUK_STAMPPERCODI_SPAN_RTPGSRICAVSP = 91;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA = 92;
  private static int BUK_STAMPPERCODI_SPAN_ALVATOSTCADE = 93;
  private static int BUK_STAMPPERCODI_SEC_VARIESPIEGRU = 94;
  private static int BUK_STAMPPERCODI_SEC_PIEDEPAGINA = 95;
  private static int BUK_STAMPPERCODI_SEC_PIEDEREPORT = 96;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET = 97;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN1 = 98;
  private static int BUK_STAMPPERCODI_RPTBOX_TOTALICASSA = 99;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN2 = 100;
  private static int BUK_STAMPPERCODI_RPTBOX_ENTRATA = 101;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN3 = 102;
  private static int BUK_STAMPPERCODI_RPTBOX_SPESA = 103;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN4 = 104;
  private static int BUK_STAMPPERCODI_RPTBOX_ENTRATA1 = 105;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN5 = 106;
  private static int BUK_STAMPPERCODI_RPTBOX_SPESA1 = 107;
  private static int BUK_STAMPPERCODI_SPAN_NUOVASPAN = 108;
  private static int BUK_STAMPPERCODI_RPTBOX_COMPETENZAE = 109;
  private static int BUK_STAMPPERCODI_SPAN_PRSRICEAVSP1 = 110;
  private static int BUK_STAMPPERCODI_RPTBOX_COMPETENZAS = 111;
  private static int BUK_STAMPPERCODI_SPAN_PRSRICSAVSP1 = 112;
  private static int BUK_STAMPPERCODI_RPTBOX_CASSAE = 113;
  private static int BUK_STAMPPERCODI_SPAN_PRSRICEAVSPC = 114;
  private static int BUK_STAMPPERCODI_RPTBOX_CASSAS = 115;
  private static int BUK_STAMPPERCODI_SPAN_PRSRICSAVSPC = 116;
  private static int BUK_STAMPPERCODI_RPTBOX_BOX = 117;
  private static int BUK_STAMPPERCODI_RPT_STNINI = 118;
  private static int BUK_STAMPPERCODI_SEC_INTESTREPOR2 = 119;
  private static int BUK_STAMPPERCODI_SEC_INTESTPAGIN2 = 120;
  private static int BUK_STAMPPERCODI_SEC_SUBSTNINCODE = 121;
  private static int BUK_STAMPPERCODI_RPTBOX_STNINICO = 122;
  private static int BUK_STAMPPERCODI_SPAN_REBISICAVSP1 = 123;
  private static int BUK_STAMPPERCODI_SEC_PIEDEPAGINA1 = 124;
  private static int BUK_STAMPPERCODI_SEC_PIEDEREPORT1 = 125;
  private static int BUK_STAMPPERCODI_RPT_NUOVOREPORT = 126;
  private static int BUK_STAMPPERCODI_SEC_INTESTREPORT = 127;
  private static int BUK_STAMPPERCODI_SEC_INTESTPAGINA = 128;
  private static int BUK_STAMPPERCODI_SEC_SUBSTNINCADE = 129;
  private static int BUK_STAMPPERCODI_RPTBOX_STNINICA = 130;
  private static int BUK_STAMPPERCODI_SPAN_REBISICAVSPC = 131;
  private static int BUK_STAMPPERCODI_SEC_PIEDEPAGINA2 = 132;
  private static int BUK_STAMPPERCODI_SEC_PIEDEREPORT2 = 133;


  // Definition of Global Variables
  private IDVariant TOTSTNINICO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTSTANZDEF = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant CURTIT = new IDVariant(0,IDVariant.STRING);
  private IDVariant TOTSTNINICA = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTSTANCADEF = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant CURTITCA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI303(IMDB);
    //
    //
    Init_PQRY_PARAMETRI435(IMDB);
    Init_PQRY_PARAMETRI435_RS(IMDB);
    Init_PQRY_VARCOM15(IMDB);
    Init_PQRY_BIL9(IMDB);
    Init_PQRY_BIL10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI303(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI303, 19);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI303, "TBL_PARAMETRI303");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA,12,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA, "ROWNAMINTSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA,5,160,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, "ROWNAMECOMPS");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, "ROWNAMECASSE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, "ROWNAMECASSS");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA, "ROWNAMVISSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCO, "ROWNAMSTINCO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCO,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCA, "ROWNAMSTINCA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCA,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI303,IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL,6,14,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI303, 0);
  }

  private static void Init_PQRY_PARAMETRI435(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI435, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI435, "PQRY_PARAMETRI435");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA,12,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA, "ROWNAMINTSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA,5,160,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, "ROWNAMVISSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL,6,14,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI435, 0);
  }

  private static void Init_PQRY_PARAMETRI435_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI435_RS, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI435_RS, "PQRY_PARAMETRI435_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL,5,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA,12,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA, "ROWNAMINTSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA,5,160,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, "ROWNAMVISSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI435_RS,IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL,6,14,0);
  }

  private static void Init_PQRY_VARCOM15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM15, 19);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM15, "PQRY_VARCOM15");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORVARIAES, "RECORVARIAES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORVARIAES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICACA, "RECVISRICACA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICACA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICAAR, "RECVISRICAAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICAAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RAGGRTREV, "RAGGRTREV");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RAGGRTREV,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORDRAGGR, "RECORDRAGGR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORDRAGGR,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CODBIL, "CODBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CODBIL,5,105,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORCAPDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CODPIANOCONT, "CODPIANOCONT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CODPIANOCONT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECORDIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCAS1, "RECOIMPOCAS1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCAS1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCOME, "RECOIMPOCOME");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCOME,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCOMS, "RECOIMPOCOMS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCOMS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCASE, "RECOIMPOCASE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCASE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCASS, "RECOIMPOCASS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECOIMPOCASS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CDR, "CDR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_CDR,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_OBIETTGESTIO, "OBIETTGESTIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_OBIETTGESTIO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_REVIRICAMITI, "REVIRICAMITI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_REVIRICAMITI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_REVIRICAPRTI, "REVIRICAPRTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_REVIRICAPRTI,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICATI, "RECVISRICATI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM15,IMDBDef12.PQSL_VARCOM15_RECVISRICATI,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM15, 0);
  }

  private static void Init_PQRY_BIL9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BIL9, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_BIL9, "PQRY_BIL9");
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL9,IMDBDef12.PQSL_BIL9_RECBILSTINCO, "RECBILSTINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL9,IMDBDef12.PQSL_BIL9_RECBILSTINCO,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_BIL9, 0);
  }

  private static void Init_PQRY_BIL10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BIL10, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_BIL10, "PQRY_BIL10");
    IMDB.set_FldCode(IMDBDef12.PQRY_BIL10,IMDBDef12.PQSL_BIL10_RECBILSTINCA, "RECBILSTINCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BIL10,IMDBDef12.PQSL_BIL10_RECBILSTINCA,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_BIL10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatoVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatoVariazioni()
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
    FormIdx = MyGlb.FRM_ALLEGAVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E636E9F7-4730-405A-B886-60A98FCD9C7C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 868;
    DesignHeight = 342;
    set_Caption(new IDVariant("Allegato Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 868;
    Frames[1].Height = 316;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Allegato Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_ALLEGAVARIAZ = new IDPanel(w, this, 1, "PAN_ALLEGAVARIAZ");
    Frames[1].Content = PAN_ALLEGAVARIAZ;
    PAN_ALLEGAVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ALLEGAVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 868-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CCFF5159-5EBF-418D-980C-F42555215CAF");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 884, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ALLEGAVARIAZ.InitStatus = 2;
    PAN_ALLEGAVARIAZ_Init();
    PAN_ALLEGAVARIAZ_InitFields();
    PAN_ALLEGAVARIAZ_InitQueries();
    BKW_STAMPPERCODI = new OBook(this);
    BUK_STAMPPERCODI = new CIDREObj(BKW_STAMPPERCODI);
    BKW_STAMPPERCODI.iGuid = "E22F74F2-CFD2-4237-B6BC-BE6913274EE2";
    BKW_STAMPPERCODI.Code = "BUK_STAMPPERCODI";
    BKW_STAMPPERCODI.BookObj = BUK_STAMPPERCODI;
    BKW_STAMPPERCODI.InitDefMasks();
    BUK_STAMPPERCODI.InitBook(1, 1245441, "Stampa Per Codice", IMDB, MainFrm.VisualStyleList);
    BUK_STAMPPERCODI.InitHTML();
    BUK_STAMPPERCODI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_STAMPPERCODI.Book.SetMainFrm(MainFrm);
    BUK_STAMPPERCODI.SetRTCGuid(0, "E22F74F2-CFD2-4237-B6BC-BE6913274EE2");
    BUK_STAMPPERCODI.SetObjCode(0, "STAMPPERCODI");
    BUK_STAMPPERCODI_MST_TEMPLATE_Init();
    BUK_STAMPPERCODI_RPT_REPORT_Init();
    BUK_STAMPPERCODI_RPT_STNINI_Init();
    BUK_STAMPPERCODI_RPT_NUOVOREPORT_Init();
    BUK_STAMPPERCODI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI303, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ALLEGAVARIAZ_PARAMETRI435();
      }
      PAN_ALLEGAVARIAZ.UpdatePanel(MainFrm);
      // BUK_STAMPPERCODI.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ALLEGAVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ALLEGAVARIAZ_SCELTAPROP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ALLEGAVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ALLEGAVARIAZ_SCELTADEC) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_STAMPPERCODI")) return BUK_STAMPPERCODI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof AllegatoVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatoVariazioni.class.getName() : (Glb.ClassWithPackage(AllegatoVariazioni.class) ? AllegatoVariazioni.class.getName().substring(AllegatoVariazioni.class.getPackage().getName().length() + 1) : AllegatoVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Dec
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaDec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Dec Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "SceltaDec", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Prop
  // **********************************************************************
  public int SceltaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Prop Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "SceltaProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Dec
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Dec Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, 0));
      MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "InfoDec", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Prop
  // **********************************************************************
  public int InfoProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Prop Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "InfoProp", _e);
      return -1;
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
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL, 0)))
        {
          IDVariant v_SS = new IDVariant(0,IDVariant.STRING);
          v_SS = (new IDVariant("Data variazioni al obbligatoria"));
          MainFrm.set_AlertMessage(v_SS); 
          return 0;
        }
      }
      IDVariant v_PESERCIZIO = new IDVariant(0,IDVariant.STRING);
      v_PESERCIZIO = (new IDVariant("P_ESERCIZIO"));
      IDVariant v_PPARTE = new IDVariant(0,IDVariant.STRING);
      v_PPARTE = (new IDVariant("P_PARTE"));
      IDVariant v_PTIPOIMPORTO = new IDVariant(0,IDVariant.STRING);
      v_PTIPOIMPORTO = (new IDVariant("P_TIPO_IMPORTO"));
      IDVariant v_PTIPOSTAMPA = new IDVariant(0,IDVariant.STRING);
      v_PTIPOSTAMPA = (new IDVariant("P_TIPO_STAMPA"));
      IDVariant v_PTIPOVAR = new IDVariant(0,IDVariant.STRING);
      v_PTIPOVAR = (new IDVariant("P_TIPO_VAR"));
      IDVariant v_PDATAAL = new IDVariant(0,IDVariant.STRING);
      v_PDATAAL = (new IDVariant("P_DATA_AL"));
      IDVariant v_PSEDEDEL = new IDVariant(0,IDVariant.STRING);
      v_PSEDEDEL = (new IDVariant("P_SEDE_DEL"));
      IDVariant v_PNUMERODEL = new IDVariant(0,IDVariant.STRING);
      v_PNUMERODEL = (new IDVariant("P_NUMERO_DEL"));
      IDVariant v_PANNODEL = new IDVariant(0,IDVariant.STRING);
      v_PANNODEL = (new IDVariant("P_ANNO_DEL"));
      IDVariant v_PUNITAPROP = new IDVariant(0,IDVariant.STRING);
      v_PUNITAPROP = (new IDVariant("P_UNITA_PROP"));
      IDVariant v_PNUMEROPROP = new IDVariant(0,IDVariant.STRING);
      v_PNUMEROPROP = (new IDVariant("P_NUMERO_PROP"));
      IDVariant v_PANNOPROP = new IDVariant(0,IDVariant.STRING);
      v_PANNOPROP = (new IDVariant("P_ANNO_PROP"));
      IDVariant v_PINTESTAZION = new IDVariant(0,IDVariant.STRING);
      v_PINTESTAZION = (new IDVariant("P_INTESTAZIONE"));
      IDVariant v_ALLEGAVARIAZ = new IDVariant(0,IDVariant.STRING);
      v_ALLEGAVARIAZ = (new IDVariant("Allegato_Variazioni"));
      IDVariant v_ALLEGVARISTN = new IDVariant(0,IDVariant.STRING);
      v_ALLEGVARISTN = (new IDVariant("Allegato_Variazioni_Stn"));
      MainFrm.SetParametroStampaJasper(v_PESERCIZIO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_PPARTE, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampaJasper(v_PTIPOIMPORTO, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0));
      MainFrm.SetParametroStampaJasper(v_PTIPOSTAMPA, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0));
      MainFrm.SetParametroStampaJasper(v_PTIPOVAR, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampaJasper(v_PDATAAL, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEDATAL, 0)));
      MainFrm.SetParametroStampaJasper(v_PSEDEDEL, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0));
      MainFrm.SetParametroStampaJasper(v_PNUMERODEL, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, 0)));
      MainFrm.SetParametroStampaJasper(v_PANNODEL, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, 0)));
      MainFrm.SetParametroStampaJasper(v_PUNITAPROP, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0));
      MainFrm.SetParametroStampaJasper(v_PNUMEROPROP, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, 0)));
      MainFrm.SetParametroStampaJasper(v_PANNOPROP, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, 0)));
      MainFrm.SetParametroStampaJasper(v_PINTESTAZION, IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA, 0));
      MainFrm.LanciaStampaJasper(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI"))))?v_ALLEGVARISTN:v_ALLEGAVARIAZ), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      // 
      // Da eliminare una volta testata la nuova stampa jasper a Treviso
      // 
      // {
        // IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        // IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        // IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        // IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        // BUK_STAMPPERCODI.SetBoxImage(BUK_STAMPPERCODI_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
        // BUK_STAMPPERCODI.set_PrintDestination((new IDVariant(3)).intValue());
        // CURTIT = (new IDVariant());
        // CURTITCA = (new IDVariant());
        // if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
        // {
          // BUK_STAMPPERCODI.set_MastroOrientation(BUK_STAMPPERCODI_MST_TEMPLATE, (new IDVariant(2)).intValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_PAG1, (new IDVariant(0)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_DATA1, (new IDVariant(0)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_PAG, (new IDVariant(-1)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_DATA, (new IDVariant(-1)).booleanValue());
        // }
        // else
        // {
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_PAG1, (new IDVariant(-1)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_DATA1, (new IDVariant(-1)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_PAG, (new IDVariant(0)).booleanValue());
          // BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_DATA, (new IDVariant(0)).booleanValue());
          // BUK_STAMPPERCODI.set_MastroOrientation(BUK_STAMPPERCODI_MST_TEMPLATE, (new IDVariant(1)).intValue());
        // }
        // BUK_STAMPPERCODI.ReportRefreshQuery(BUK_STAMPPERCODI_RPT_REPORT);
        // if (IDL.NullValue(MainFrm.INTEMPOBIGES,(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
        // {
          // BUK_STAMPPERCODI.set_SpanVisible(BUK_STAMPPERCODI_SPAN_NUOVASPAN12, (new IDVariant(0)).booleanValue());
        // }
        // else
        // {
          // if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CA")), true) && IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
          // {
            // BUK_STAMPPERCODI.set_SpanVisible(BUK_STAMPPERCODI_SPAN_NUOVASPAN12, (new IDVariant(-1)).booleanValue());
          // }
          // else
          // {
            // BUK_STAMPPERCODI.set_SpanVisible(BUK_STAMPPERCODI_SPAN_NUOVASPAN12, (new IDVariant(0)).booleanValue());
          // }
        // }
        // BUK_STAMPPERCODI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        // MainFrm.set_RedirectTo((new IDVariant(BUK_STAMPPERCODI.GetWebFileName())));
        // MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        // MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      // }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      LOAD_PARAMEDELETE();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA, 0, (new IDVariant("CO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0, (new IDVariant("ET")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL, 0, new IDVariant());
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
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Allegato Variazioni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ALLEGAVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegato Variazioni On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_ALLEGAVARIAZ_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_ALLEGAVARIAZ_SEDEDELIBERA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ALLEGAVARIAZ_UNITAPROPOST)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "AllegatoVariazioniOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Allegato Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ALLEGAVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ALLEGAVARIAZ);
      // 
      // Allegato Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNDEL, 0))) && (PAN_ALLEGAVARIAZ.bFields(PFL_ALLEGAVARIAZ_SEDEDELIBERA).IsVisible(PAN_ALLEGAVARIAZ.AttR) && PAN_ALLEGAVARIAZ.bFields(PFL_ALLEGAVARIAZ_SEDEDELIBERA).IsPresent()))
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMANNPRO, 0))))
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ALLEGAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "AllegatoVariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // ES Gruppo Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_ESGRUPPO_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ES Gruppo Before Formatting Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, (new IDVariant(-1)).booleanValue());
        CURTIT = (new IDVariant("Z"));
        CURTITCA = (new IDVariant("Z"));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CO")), true))
      {
        // BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_LEFT, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH, (new IDVariant(100, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE2, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_ES, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_WIDTH))).dblValue());
      }
      else
      {
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_WIDTH, (new IDVariant(30, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH, (new IDVariant(49, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_ES, IDREGlb.RECT_WIDTH, (new IDVariant(50, IDVariant.FLOAT)).dblValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, (new IDVariant(0)).booleanValue());
      }
      // 
      // -------------------------------------------
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("NO")), true))
      {
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA))
        {
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))).dblValue());
          }
        }
      }
      BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_ES, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_ES, IDREGlb.RECT_WIDTH)))).dblValue());
      // 
      // ------------------- barra alta finale ------------
      // ------------
      // 
      IDVariant v_LUNGHEZZA = new IDVariant(0,IDVariant.INTEGER);
      v_LUNGHEZZA = new IDVariant(v_LUNGHEZZA);
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE2))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICE2, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF))
      {
        v_LUNGHEZZA = new IDVariant(IDL.Add(v_LUNGHEZZA, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, IDREGlb.RECT_WIDTH)))),IDVariant.INTEGER);
      }
      BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, IDREGlb.RECT_WIDTH, new IDVariant(new IDVariant(v_LUNGHEZZA),IDVariant.FLOAT).dblValue());
      // 
      // --
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "ESGruppoBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // VALORI Intestazione Gruppo Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_VALOINTEGRUP_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VALORI Intestazione Gruppo Before Formatting Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINI, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINICA1, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINI, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINICA1, (new IDVariant(-1)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CO")), true))
      {
        // BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_WIDTH, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_LEFT, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_LEFT))).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH, (new IDVariant(100, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE1, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICEUO, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_WIDTH, (new IDVariant(30, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH, (new IDVariant(49, IDVariant.FLOAT)).dblValue());
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINI, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINI, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        // 
        // importi
        // 
        {
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINICA1, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSA1, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, (new IDVariant(0)).booleanValue());
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINICA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINICA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINICA1, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        // 
        // importi
        // 
        {
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINI, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, (new IDVariant(0)).booleanValue());
        }
      }
      if (BUK_STAMPPERCODI.GetTotalPagesNumberConf())
      {
        if (BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPE, 0), IDL.ToFloat(IDL.NullValue(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC),(new IDVariant("0"))))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSE, 0), IDL.ToFloat(IDL.NullValue(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC),(new IDVariant("0"))))),IDVariant.DECIMAL));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECOMPS, 0), IDL.ToFloat(IDL.NullValue(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC),(new IDVariant("0"))))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMECASSS, 0), IDL.ToFloat(IDL.NullValue(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC),(new IDVariant("0"))))),IDVariant.DECIMAL));
        }
        // BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_C3, IDL.ToString(IDL.Add(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_REBISICAVSP1)), IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC)))));
        // BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_C, IDL.ToString(IDL.Add(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_REBISICAVSPC)), IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC)))));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("NO")), true))
      {
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSA1))
        {
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_WIDTH)))).dblValue());
          }
          else
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_WIDTH)))).dblValue());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "VALORIIntestazioneGruppoBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // VALORI Intestazione Gruppo After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_VALOINTEGRUP_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VALORI Intestazione Gruppo After Formatting Body
      // Corpo Procedura
      // 
      try
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).compareTo((new IDVariant("CA")), true)!=0)
        {
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINI))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
        }
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).compareTo((new IDVariant("CO")), true)!=0)
        {
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSA1))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNINICA1))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNINICA1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
          if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL))
          {
            BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
          }
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CAP))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CAP, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICE1))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICE1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
        }
        if (BUK_STAMPPERCODI.BoxVisible(BUK_STAMPPERCODI_RPTBOX_CODICEUO))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CODICEUO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
        }
        BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_DESC, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_STAMPPERCODI.SectionHeight(BUK_STAMPPERCODI_SEC_VALOINTEGRUP))).dblValue());
      }
      catch (Exception e15)
      {
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "VALORIIntestazioneGruppoAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // Piede Report Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_PIEDEREPORT_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piede Report Before Formatting Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSAS, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_SPESA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_SPESA1, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSAE, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_ENTRATA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_ENTRATA1, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTALICASSA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_ENTRATA1, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSAE, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_SPESA1, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSAS, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
      {
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_ENTRATA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_SPESA, (new IDVariant(0)).booleanValue());
        BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "PiedeReportBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // SUB Stn Ini Co Dettaglio Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_SUBSTNINCODE_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // SUB Stn Ini Co Dettaglio Before Formatting Body
      // Corpo Procedura
      // 
      if (BUK_STAMPPERCODI.GetTotalPagesNumberConf())
      {
        IDVariant T = null;
        T = new IDVariant(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_REBISICAVSP1)),IDVariant.DECIMAL);
        IDVariant v_TV = null;
        v_TV = new IDVariant(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC)),IDVariant.DECIMAL);
        BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_C3, IDL.Format(IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCO, 0, IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0)))));
        if (IDL.NullValue(CURTIT,(new IDVariant("Z"))).compareTo(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV"), true)!=0)
        {
          CURTIT = BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV");
          TOTSTNINICO = IDL.NullValue(T,(new IDVariant(0)));
          TOTSTANZDEF = IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0))));
        }
        else
        {
          TOTSTNINICO = IDL.Add(IDL.NullValue(TOTSTNINICO,(new IDVariant(0))), IDL.NullValue(T,(new IDVariant(0))));
          TOTSTANZDEF = IDL.Add(IDL.Add(IDL.NullValue(TOTSTANZDEF,(new IDVariant(0))), IDL.NullValue(T,(new IDVariant(0)))), IDL.NullValue(v_TV,(new IDVariant(0))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "SUBStnIniCoDettaglioBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // SUB Stn Ini CA Dettaglio Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_SUBSTNINCADE_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // SUB Stn Ini CA Dettaglio Before Formatting Body
      // Corpo Procedura
      // 
      if (BUK_STAMPPERCODI.GetTotalPagesNumberConf())
      {
        IDVariant T = null;
        T = new IDVariant(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_REBISICAVSPC)),IDVariant.DECIMAL);
        IDVariant v_TV = null;
        v_TV = new IDVariant(IDL.ToFloat(BUK_STAMPPERCODI.SpanValue(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC)),IDVariant.DECIMAL);
        BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_C, IDL.Format(IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0)))), (new IDVariant("###,###,###,##0.00")), MainFrm));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSTINCA, 0, IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0)))));
        if (IDL.NullValue(CURTITCA,(new IDVariant("Z"))).compareTo(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV"), true)!=0)
        {
          CURTITCA = BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV");
          TOTSTNINICA = IDL.NullValue(T,(new IDVariant(0)));
          TOTSTANCADEF = IDL.Add(IDL.NullValue(T,(new IDVariant(0))), IDL.NullValue(v_TV,(new IDVariant(0))));
        }
        else
        {
          TOTSTNINICA = IDL.Add(IDL.NullValue(TOTSTNINICA,(new IDVariant(0))), IDL.NullValue(T,(new IDVariant(0))));
          TOTSTANCADEF = IDL.Add(IDL.Add(IDL.NullValue(TOTSTANCADEF,(new IDVariant(0))), IDL.NullValue(T,(new IDVariant(0)))), IDL.NullValue(v_TV,(new IDVariant(0))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "SUBStnIniCADettaglioBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // RAGGR TREV Intestazione Gruppo Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_RAGTREINTGRU_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // RAGGR TREV Intestazione Gruppo Before Formatting Body
      // Corpo Procedura
      // 
      BUK_STAMPPERCODI.set_SectionVisible(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, IDL.NullValue(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV"),(new IDVariant("X"))).compareTo((new IDVariant("X")), true)!=0 && IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "RAGGRTREVIntestazioneGruppoBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // RAGGR TREV Intestazione Gruppo After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_RAGTREINTGRU_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // RAGGR TREV Intestazione Gruppo After Formatting Body
      // Corpo Procedura
      // 
      if (BUK_STAMPPERCODI.SectionVisible(BUK_STAMPPERCODI_SEC_RAGTREINTGRU))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, IDREGlb.RECT_WIDTH)))).dblValue());
        }
        else if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, IDREGlb.RECT_WIDTH, IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, IDREGlb.RECT_WIDTH))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, IDREGlb.RECT_WIDTH)))).dblValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "RAGGRTREVIntestazioneGruppoAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // RAGGR TREV Piede Gruppo Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_STAMPPERCODI_SEC_RAGTREPIEGRU_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // RAGGR TREV Piede Gruppo Before Formatting Body
      // Corpo Procedura
      // 
      BUK_STAMPPERCODI.set_SectionVisible(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, IDL.NullValue(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RAGGRTREV"),(new IDVariant("X"))).compareTo((new IDVariant("X")), true)!=0 && IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMVISSTA, 0).equals((new IDVariant("SI")), true));
      if (BUK_STAMPPERCODI.SectionVisible(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU))
      {
        if (IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")), true))
        {
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_CASSA, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, (new IDVariant(0)).booleanValue());
        }
        else if (IMDB.Value(IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")), true))
        {
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, IDREGlb.RECT_LEFT, (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, IDREGlb.RECT_LEFT))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxRect(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_STAMPPERCODI.BoxRect(BUK_STAMPPERCODI_RPTBOX_CASSA, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, (new IDVariant(0)).booleanValue());
          BUK_STAMPPERCODI.set_BoxVisible(BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatoVariazioni", "RAGGRTREVPiedeGruppoBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ALLEGAVARIAZ_PARAMETRI435() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI435_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI303, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI303, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI435_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI435_RS, 0, IMDBDef4.TBL_PARAMETRI303, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 0, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 1, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 2, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 3, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 4, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 5, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 6, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 7, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 8, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 9, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 10, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 11, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI435_RS, 12, 0, IMDBDef4.TBL_PARAMETRI303, IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI303, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI303, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI303, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI435_RS, 0);
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
  private void PAN_ALLEGAVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ALLEGAVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ALLEGAVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ALLEGAVARIAZ, Cancel);
    // Stub
  }

  private void PAN_ALLEGAVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ALLEGAVARIAZ_SCELTAPROP)
    {
      this.IdxPanelActived = this.PAN_ALLEGAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ALLEGAVARIAZ_INFOPRO)
    {
      this.IdxPanelActived = this.PAN_ALLEGAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ALLEGAVARIAZ_SCELTADEC)
    {
      this.IdxPanelActived = this.PAN_ALLEGAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDec();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ALLEGAVARIAZ_INFODEC)
    {
      this.IdxPanelActived = this.PAN_ALLEGAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDec();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ALLEGAVARIAZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ALLEGAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ALLEGAVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ALLEGAVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ALLEGAVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ALLEGAVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_STAMPPERCODI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_STAMPPERCODI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTREPOR1)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTPAGIN1)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_ESGRUPPO)
    {
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ES, new IDVariant((BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant())));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_RONAINSTAVAV, new IDVariant(IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMINTSTA, 0)));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_IRVESAVSPCET, new IDVariant(((BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("E")), true))?(new IDVariant("Titolo - Tipologia")):(new IDVariant("Miss.-Progr.-Tit.")))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_DESCRIZIONE, new IDVariant(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CO")), true))?IDL.Add(IDL.Add((new IDVariant("DESCRIZIONE")), (new IDVariant(" "))), ((BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("E")), true))?(new IDVariant("Titolo - Tipologia")):(new IDVariant("Missione - Programma - Titolo")))):(new IDVariant("DESCRIZIONE CAPITOLO")))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCCI, new IDVariant(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CA")), true))?(new IDVariant("CAPITOLO")):((BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECORVARIAES").equals((new IDVariant("E")), true))?(new IDVariant("Titolo - Tipologia")):(new IDVariant("Missione - Programma - Titolo"))))));
      BUK_STAMPPERCODI_SEC_ESGRUPPO_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_RAGTREINTGRU)
    {
      BUK_STAMPPERCODI_SEC_RAGTREINTGRU_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_VALOINTEGRUP)
    {
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ILRCAVSPC3RC, new IDVariant(((IDL.Left(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "CDR"), (new IDVariant(3))).compareTo((new IDVariant("***")), true)!=0)?BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "CDR"):(new IDVariant("")))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCBR, new IDVariant(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI435, IMDBDef12.PQSL_PARAMETRI435_ROWNAMTIPSTA, 0).equals((new IDVariant("CO")), true))?BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "CODBIL"):IDL.Add(IDL.Add(IDL.ToString(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECVISRICACA")), (new IDVariant("/"))), IDL.ToString(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "RECVISRICAAR"))))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ININROGAVSPC, new IDVariant(((!(IDL.IsNull(BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "OBIETTGESTIO"))))?IDL.Add((new IDVariant("\n")), BUK_STAMPPERCODI.GetReportColumn(BUK_STAMPPERCODI_RPT_REPORT, "OBIETTGESTIO")):(new IDVariant()))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_VALOINTEGRUP,"RECORDIMPORT")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_VALOINTEGRUP,"RECOIMPOCAS1")));
      BUK_STAMPPERCODI_SEC_VALOINTEGRUP_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTREPOR2)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTPAGIN2)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_SUBSTNINCODE)
    {
      BUK_STAMPPERCODI_SEC_SUBSTNINCODE_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEPAGINA1)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEREPORT1)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_SUBSTNINCADE)
    {
      BUK_STAMPPERCODI_SEC_SUBSTNINCADE_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEPAGINA2)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEREPORT2)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_VALOPIEDGRUP)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_RAGTREPIEGRU)
    {
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ALVATOSTINCO, new IDVariant(TOTSTNINICO));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_RTPGSRIAVSPC, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_RAGTREPIEGRU,"RECORDIMPORT")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ALLVARTOSTDE, new IDVariant(TOTSTANZDEF));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ALVATOSTINCA, new IDVariant(TOTSTNINICA));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_RTPGSRICAVSP, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_RAGTREPIEGRU,"RECOIMPOCAS1")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_ALVATOSTCADE, new IDVariant(TOTSTANCADEF));
      BUK_STAMPPERCODI_SEC_RAGTREPIEGRU_OnFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_VARIESPIEGRU)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_PIEDEREPORT)
    {
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PRSRICEAVSP1, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_PIEDEREPORT,"RECOIMPOCOME")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PRSRICSAVSP1, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_PIEDEREPORT,"RECOIMPOCOMS")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PRSRICEAVSPC, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_PIEDEREPORT,"RECOIMPOCASE")));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PRSRICSAVSPC, new IDVariant(BUK_STAMPPERCODI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STAMPPERCODI_SEC_PIEDEREPORT,"RECOIMPOCASS")));
      BUK_STAMPPERCODI_SEC_PIEDEREPORT_OnFormattingSection();
    }
  }

  private void BUK_STAMPPERCODI_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STAMPPERCODI_SEC_RAGTREINTGRU)
    {
      BUK_STAMPPERCODI_SEC_RAGTREINTGRU_OnAfterFormattingSection();
    }
    if (SectionID==BUK_STAMPPERCODI_SEC_VALOINTEGRUP)
    {
      BUK_STAMPPERCODI_SEC_VALOINTEGRUP_OnAfterFormattingSection();
    }
  }

  private void BUK_STAMPPERCODI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_STAMPPERCODI_MST_TEMPLATE)
    {
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PAG1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STAMPPERCODI.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_STAMPPERCODI.GetTotalPagesNumber()))))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_TODAY1, new IDVariant(IDL.Today()));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_PAG2, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STAMPPERCODI.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_STAMPPERCODI.GetTotalPagesNumber()))))));
      BUK_STAMPPERCODI.set_SpanValue(BUK_STAMPPERCODI_SPAN_TODAY, new IDVariant(IDL.Today()));
    }
  }

  private void BUK_STAMPPERCODI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_STAMPPERCODI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_STAMPPERCODI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_STAMPPERCODI_OnPreview()
  {
    PreviewBook = BKW_STAMPPERCODI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ALLEGAVARIAZ_Init()
  {

    PAN_ALLEGAVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ALLEGAVARIAZ.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, "FEE1B22B-66CC-4936-A5BC-42D67C8AC186");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, "Parte");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_FORM, 8, 7, 392, 49, 0, 0);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, 0, 31);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, 1, 13);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, 0, 4);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, 1, 4);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, "548C30CC-1B9A-4427-9AE8-406275951C6F");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, "Tipo Stampa");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 504, -9999, 64, 16, 0, 0);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 408, 7, 388, 49, 0, 0);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, 0, 71);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, 1, 13);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, 0, 4);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, 1, 4);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, "7452FFA8-498A-49B6-BFD3-E64F2A39A81F");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 72, -9999, 80, 16, 0, 0);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 408, 59, 388, 49, 0, 0);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, 0, 55);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, 1, 13);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, 0, 4);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, 1, 4);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, "D0169781-E374-44A7-9E6A-75D4D236504C");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 152, -9999, 352, 16, 0, 0);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 111, 788, 49, 0, 0);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, "F58345A4-6340-4B0F-96D8-0F1DD92E4930");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, "Tipo Importo");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 568, -9999, 88, 16, 0, 0);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 8, 59, 392, 49, 0, 0);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, 0, 74);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, 1, 13);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, 0, 4);
    PAN_ALLEGAVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, 1, 4);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ALLEGAVARIAZ_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ALLEGAVARIAZ.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, "D11D1F93-4937-4160-858D-D22A2B4B9860");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, "Parte");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, "1473DD72-109D-4464-9333-44AFA926FCD9");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, "93FDDF6A-CA63-4201-BE8B-2A437E3C60B9");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, "2AB06D9D-8040-4C9E-AB39-64BEB3F36FDE");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, "Tipo Stampa");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, "2058980B-F210-4B4C-9813-554A4441CA92");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, "ED089795-786B-4CDC-99F4-5BF087E088D3");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.VIS_SFONEBORDTRA);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, "B0B2FF39-F21B-4E85-BB62-D9BBFF8535D9");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, "Delibera/Decreto");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, "E46590D7-0D64-410D-BB16-69956337EEE7");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, "-");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, "64FC9F3F-5774-40A5-AEC2-95C305A7C398");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, "/");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, "3B30912A-883E-4176-A9A5-BECB12AC5273");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, "Proposta");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, "6E9F2FA6-6D01-417E-B63B-2547BD2437F9");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, "-");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, "EDA4ADEF-E727-47FE-9871-A93217048289");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, "/");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, "4704D717-4A1F-4049-9256-5DCED9040207");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ALLEGAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, 0, "wsearch.gif", false);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, "B4C36ECB-334B-4A45-90E7-CA553F99B1BE");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ALLEGAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, 0, "info.gif", false);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, "8DDDCDE5-35A1-4ECE-ACDF-B5B4A84167E7");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ALLEGAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, 0, "wsearch.gif", false);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, "995DD598-03C6-4594-87BA-48B4870C37B5");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ALLEGAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, 0, "info.gif", false);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, "37FF327F-3506-4812-BCA0-823A83820212");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.VIS_SFONEBORDTRA);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, "E78EBF48-A6DE-4486-8D71-6EE9707B1F1C");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, "Tipo Importo");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, "4D41F229-8F9F-4F4C-9793-98AC43D58BA2");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.VIS_SFONEBORDTRA);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, "A2154C89-4D4D-4D38-BCF3-0E9182DB3299");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, "Visualizza Stanziamento");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, "Visualizza Stanziamento");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.VIS_CHECKSTYLE);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, "DAE4D7F8-8F01-4092-A713-C4924B2118EB");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, "Variazioni al");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, "1FF53DE8-A11F-4B4F-B43E-B74228AAA7E6");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, "Intestazione Stampa");
    PAN_ALLEGAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, "");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, "B452F2EB-31EB-491C-A76A-83372843CAD1");
    PAN_ALLEGAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, "Elabora");
    PAN_ALLEGAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ALLEGAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, 0, "button1.gif", false);
    PAN_ALLEGAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ALLEGAVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_FORM, 100, 32, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_PARTE, -1, GRP_ALLEGAVARIAZ_PARTE);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_PARTE, PPQRY_PARAMETRI435, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 12, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 12, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, -1, GRP_ALLEGAVARIAZ_PARTE);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_NUOVCAMPSTA1, -1, "", "NUOVCAMPSTA1", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_LIST, 256, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_FORM, 412, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF1, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_SF1, -1, GRP_ALLEGAVARIAZ_TIPOSTAMPA);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_SF1, -1, "", "SF1", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 504, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 80);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tp. Stam.");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 512, 32, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 84);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tipo Stampa");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_TIPOSTAMPA, -1, GRP_ALLEGAVARIAZ_TIPOSTAMPA);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_TIPOSTAMPA, PPQRY_PARAMETRI435, "A.ROWNAMTIPSTA", "ROWNAMTIPSTA", 12, 2, 0, -13997);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_TIPOSTAMPA, (new IDVariant("CO")), "Codice Bilancio", "", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_TIPOSTAMPA, (new IDVariant("CA")), "Capitolo", "", "", -1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 72, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 64);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 512, 84, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 64);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_VARIAZIONI, -1, GRP_ALLEGAVARIAZ_VARIAZIONI);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_VARIAZIONI, PPQRY_PARAMETRI435, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 396, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 412, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, -1, GRP_ALLEGAVARIAZ_VARIAZIONI);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_NUOVCAMPSTA2, -1, "", "NUOVCAMPSTA2", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_LIST, 152, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_LIST, "Delib. Decr.");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_FORM, 12, 136, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_FORM, 148);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SEDEDELIBERA, MyGlb.PANEL_FORM, "Delibera/Decreto");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_SEDEDELIBERA, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_SEDEDELIBERA, PPQRY_PARAMETRI435, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 15, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 104);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "-");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 272, 136, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 16);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "-");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_NUMERODELIBE, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_NUMERODELIBE, PPQRY_PARAMETRI435, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "/");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 336, 136, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 16);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "/");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_ANNODELIBERA, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_ANNODELIBERA, PPQRY_PARAMETRI435, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_LIST, 312, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_LIST, 92);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_LIST, "Proposta");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_FORM, 440, 136, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_FORM, 64);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_UNITAPROPOST, MyGlb.PANEL_FORM, "Proposta");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_UNITAPROPOST, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_UNITAPROPOST, PPQRY_PARAMETRI435, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 392, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 616, 136, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_NUMEROPROPOS, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_NUMEROPROPOS, PPQRY_PARAMETRI435, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 8, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 464, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 700, 136, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_ANNOPROPOSTA, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_ANNOPROPOSTA, PPQRY_PARAMETRI435, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 364, 100, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 756, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTAPROP, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_SCELTAPROP, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_SCELTAPROP, -1, "", "SCELTAPROP", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_LIST, 372, 108, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_FORM, 776, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFOPRO, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_INFOPRO, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_INFOPRO, -1, "", "INFOPRO", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_LIST, 356, 92, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_FORM, 392, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SCELTADEC, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_SCELTADEC, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_SCELTADEC, -1, "", "SCELTADEC", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_LIST, 364, 100, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_FORM, 412, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INFODEC, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_INFODEC, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_INFODEC, -1, "", "INFODEC", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_LIST, 760, 124, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_FORM, 784, 140, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_SF, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_SF, -1, GRP_ALLEGAVARIAZ_PROVVEDIMENT);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_SF, -1, "", "SF", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 568, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 84);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 100, 84, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 92);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_TIPOIMPORTO, -1, GRP_ALLEGAVARIAZ_TIPOIMPORTO);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_TIPOIMPORTO, PPQRY_PARAMETRI435, "A.ROWNAMTIPIMP", "ROWNAMTIPIMP", 5, 2, 0, -13997);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_TIPOIMPORTO, (new IDVariant("CO")), "Competenza", "", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_TIPOIMPORTO, (new IDVariant("CA")), "Cassa", "", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_TIPOIMPORTO, (new IDVariant("ET")), "Entrambe", "", "", -1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 12, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 12, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, -1, GRP_ALLEGAVARIAZ_TIPOIMPORTO);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_LIST, 148);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_LIST, "Visualizza Stanziamento");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_FORM, 12, 164, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_FORM, 148);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_VISUALSTANZI, MyGlb.PANEL_FORM, "Visualizza Stanziamento");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_VISUALSTANZI, -1, -1);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_VISUALSTANZI, PPQRY_PARAMETRI435, "A.ROWNAMVISSTA", "ROWNAMVISSTA", 5, 2, 0, -13997);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_VISUALSTANZI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ALLEGAVARIAZ.SetValueListItem(PFL_ALLEGAVARIAZ_VISUALSTANZI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_LIST, 52);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_LIST, "Variazioni al");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_FORM, 212, 164, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_FORM, 76);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_DATAAL, MyGlb.PANEL_FORM, "Variazioni al");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_DATAAL, -1, -1);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_DATAAL, PPQRY_PARAMETRI435, "A.ROWNAMEDATAL", "ROWNAMEDATAL", 6, 14, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_LIST, 4, 244, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_LIST, 128);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_LIST, "Intestazione Stampa");
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_FORM, 32, 188, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_FORM, 128);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_INTESTSTAMPA, MyGlb.PANEL_FORM, "Intestazione Stampa");
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_INTESTSTAMPA, -1, -1);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_INTESTSTAMPA, PPQRY_PARAMETRI435, "A.ROWNAMINTSTA", "ROWNAMINTSTA", 5, 160, 0, -13997);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_LIST, 588, 120, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_FORM, 692, 208, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ALLEGAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGAVARIAZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGAVARIAZ.SetFieldPage(PFL_ALLEGAVARIAZ_ELABORA, -1, -1);
    PAN_ALLEGAVARIAZ.SetFieldPanel(PFL_ALLEGAVARIAZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ALLEGAVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ALLEGAVARIAZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ALLEGAVARIAZ.SetIMDB(IMDB, "PQRY_PARAMETRI435", true);
    PAN_ALLEGAVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ALLEGAVARIAZ.SetQueryIMDB(PPQRY_PARAMETRI435, IMDBDef12.PQRY_PARAMETRI435_RS, IMDBDef4.TBL_PARAMETRI303);
    JustLoaded = true;
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_PARTE, IMDBDef4.FLD_PARAMETRI303_ROWNAMEPARTE);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_TIPOSTAMPA, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPSTA);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_VARIAZIONI, IMDBDef4.FLD_PARAMETRI303_ROWNAMEVARIA);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_SEDEDELIBERA, IMDBDef4.FLD_PARAMETRI303_ROWNAMSEDDEL);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMDEL);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNDEL);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_UNITAPROPOST, IMDBDef4.FLD_PARAMETRI303_ROWNAMUNIPRO);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI303_ROWNAMNUMPRO);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI303_ROWNAMANNPRO);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_TIPOIMPORTO, IMDBDef4.FLD_PARAMETRI303_ROWNAMTIPIMP);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_VISUALSTANZI, IMDBDef4.FLD_PARAMETRI303_ROWNAMVISSTA);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_DATAAL, IMDBDef4.FLD_PARAMETRI303_ROWNAMEDATAL);
    PAN_ALLEGAVARIAZ.SetFieldPrimaryIndex(PFL_ALLEGAVARIAZ_INTESTSTAMPA, IMDBDef4.FLD_PARAMETRI303_ROWNAMINTSTA);
    PAN_ALLEGAVARIAZ.SetMasterTable(0, "PARAMETRI303");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ALLEGAVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ALLEGAVARIAZ.iUseListQBE;
      PAN_ALLEGAVARIAZ.iUseListQBE = 0;
      PAN_ALLEGAVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ALLEGAVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ALLEGAVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_STAMPPERCODI_MST_TEMPLATE_Init()
  {
    BUK_STAMPPERCODI.InitMastro(BUK_STAMPPERCODI_MST_TEMPLATE, 3, 21000, 29700, 1, 2, 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_MST_TEMPLATE, "E58DCE31-CF85-449D-98DB-A0EFD57C5BEF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_MST_TEMPLATE, "TEMPLATE");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_LOGO, 1000, 400, 6700, 1900, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_LOGO, "FDBED6B9-A3A1-4064-A5B6-2EE608156C7B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_LOGO, "LOGO");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_TESTATPAGINA, 1000, 300, 28100, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TESTATPAGINA, "CFFD6C4A-1C8D-49C0-B8E5-6873F80B9033");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA, 1000, 2500, 28200, 17900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA, "4852BB59-EF47-47A8-A9BC-8AE752403877");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_PIEDEPAGINA, 1000, 20500, 27600, 300, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_PIEDEPAGINA, "F932739D-39D6-4F26-86FA-960AB141C6D4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_PAG, 26000, 300, 3200, 500, 0, 2, 1, MyGlb.VIS_NORMAA7RIGHT, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_PAG, "9F5E5946-D578-4646-8A0E-632A4D7CDA55");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_PAG, "PAG");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_PAG, BUK_STAMPPERCODI_SPAN_PAG1, MyGlb.VIS_NORMAA7RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PAG1, "90749A06-1CD6-4572-8A16-5A6EA06E5D1A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PAG1, "PAG1");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_DATA, 26000, 1000, 3200, 500, 0, 2, 1, MyGlb.VIS_NORMAA7RIGHT, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_DATA, "D8949776-43F9-446C-A669-45F49A41ADA8");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_DATA, "DATA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DATA, BUK_STAMPPERCODI_SPAN_PAG3, MyGlb.VIS_NORMAA7RIGHT, 0, 0, 0, 271319425, "", "del ", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PAG3, "362ACA22-37D2-4D2A-ACE0-B48D70E386A3");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PAG3, "PAG3");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DATA, BUK_STAMPPERCODI_SPAN_TODAY1, MyGlb.VIS_NORMAA7RIGHT, 6, 0, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_TODAY1, "1006BDB6-21BD-4EA3-A81D-705CEA220609");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_TODAY1, "TODAY1");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_PAG1, 15400, 300, 3200, 500, 0, 2, 1, MyGlb.VIS_NORMAA7RIGHT, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_PAG1, "B045F552-1694-4177-9CDE-7DCFA531086C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_PAG1, "PAG1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_PAG1, BUK_STAMPPERCODI_SPAN_PAG2, MyGlb.VIS_NORMAA7RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PAG2, "920ED4F4-0054-4708-8705-62A79297FA78");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PAG2, "PAG2");
    BUK_STAMPPERCODI.InitMastroBox(BUK_STAMPPERCODI_MST_TEMPLATE, BUK_STAMPPERCODI_RPTBOX_DATA1, 15400, 1000, 3200, 500, 0, 2, 1, MyGlb.VIS_NORMAA7RIGHT, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_DATA1, "4BADFA7B-D299-45C7-8AED-6B88ED4C518C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_DATA1, "DATA1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DATA1, BUK_STAMPPERCODI_SPAN_PAG, MyGlb.VIS_NORMAA7RIGHT, 0, 0, 0, 271319425, "", "del ", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PAG, "EDF9989A-6EE0-4975-A27F-BFF23DBDC758");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PAG, "PAG");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DATA1, BUK_STAMPPERCODI_SPAN_TODAY, MyGlb.VIS_NORMAA7RIGHT, 6, 0, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_TODAY, "033D269B-4C18-4AF9-A791-828D3DB5FA96");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_TODAY, "TODAY");
  }

  private void BUK_STAMPPERCODI_RPT_REPORT_InitQuery() { BUK_STAMPPERCODI_RPT_REPORT_InitQuery(true, true); }
  private void BUK_STAMPPERCODI_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as RECORVARIAES, ");
      SQL.append("  B.CAPITOLO as RECVISRICACA, ");
      SQL.append("  B.ARTICOLO as RECVISRICAAR, ");
      SQL.append("  CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMVISSTA~~ = 'SI' THEN CASE WHEN A.E_S = 'S' THEN B.TITOLO ELSE B.MISSIONE_TITOLO END ELSE 'X' END as RAGGRTREV, ");
      SQL.append("  CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CO' THEN B.MISSIONE_TITOLO || B.PROGRAMMA_TIPOLOGIA || B.TITOLO ELSE LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || '/' || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) END as RECORDRAGGR, ");
      SQL.append("  B.MISSIONE_TITOLO || B.PROGRAMMA_TIPOLOGIA || CASE WHEN A.E_S <> 'E' THEN B.TITOLO ELSE '' END as CODBIL, ");
      SQL.append("  CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CA' THEN B.DESCRIZIONE_CAP ELSE A_GET_DES_CODICE_CAP(A.ESERCIZIO,A.E_S,B.MISSIONE_TITOLO || B.PROGRAMMA_TIPOLOGIA || B.TITOLO) END as RECORCAPDESC, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  CASE WHEN C.MACRO_LIV_5_STR <> '0' THEN C.MACRO_LIV_5_STR ELSE C.MACRO_LIV_4_STR END ");
      SQL.append("from ");
      SQL.append("  VISTA_CODIFICHE_CAP C ");
      SQL.append("where (C.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (C.E_S = A.E_S) ");
      SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
      SQL.append(") as CODPIANOCONT, ");
      SQL.append("  NVL(A.IMPORTO, 0) as RECORDIMPORT, ");
      SQL.append("  NVL(A.IMPORTO_CASSA, 0) as RECOIMPOCAS1, ");
      SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0) as RECOIMPOCOME, ");
      SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0) as RECOIMPOCOMS, ");
      SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0) as RECOIMPOCASE, ");
      SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0) as RECOIMPOCASS, ");
      SQL.append("  CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CA' THEN SO4_UTIL.UNITA_GET_CODICE_VALIDO(( ");
      SQL.append("select ");
      SQL.append("  MIN(F.PROGR_UNITA_ORGANIZZATIVA) ");
      SQL.append("from ");
      SQL.append("  CAP_UO F ");
      SQL.append("where (F.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (F.E_S = A.E_S) ");
      SQL.append("and   (F.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (F.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (F.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
      SQL.append("and   ((F.SCADENZA IS NULL)) ");
      SQL.append("),TRUNC( SYSDATE )) ELSE '' END as CDR, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  MIN(H.CODICE || ' - ' || H.DESCRIZIONE) ");
      SQL.append("from ");
      SQL.append("  DUP_RISORSE G, ");
      SQL.append("  DUP_OBIETTIVI_GESTIONE H ");
      SQL.append("where (G.ID_ENTITA = H.ID_OBIETTIVO_GESTIONE) ");
      SQL.append("and   (G.TIPO_ENTITA = 'OG') ");
      SQL.append("and   (G.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (G.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (G.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CA') ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMVISSTA~~ = 'SI') ");
      SQL.append(") as OBIETTGESTIO, ");
      SQL.append("  B.MISSIONE_TITOLO as REVIRICAMITI, ");
      SQL.append("  B.PROGRAMMA_TIPOLOGIA as REVIRICAPRTI, ");
      SQL.append("  B.TITOLO as RECVISRICATI ");
      SQL.append("from ");
      SQL.append("  VARIAZIONI A, ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((A.E_S = ~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ AND ~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ <> 'ES') OR (~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ = 'ES')) ");
      SQL.append("and   (NVL(A.SEDE_DEL, '-1') = NVL(~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~, NVL(A.SEDE_DEL, '-1'))) ");
      SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~, NVL(A.NUMERO_DEL, -1))) ");
      SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMANNDEL~~, NVL(A.ANNO_DEL, -1))) ");
      SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~, NVL(A.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~, NVL(A.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMANNPRO~~, NVL(A.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (A.TIPO = ~~PQRY_PARAMETRI435.ROWNAMEVARIA~~) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append("and   ((B.ESERCIZIO BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPIMP~~ = 'ET' OR (~~PQRY_PARAMETRI435.ROWNAMTIPIMP~~ = 'CO' AND NVL(A.IMPORTO, 0) <> 0) OR (~~PQRY_PARAMETRI435.ROWNAMTIPIMP~~ = 'CA' AND NVL(A.IMPORTO_CASSA, 0) <> 0)) ");
      SQL.append("and   (A.CAPITOLO NOT IN (9999999999999996, 9999999999999997, 9999999999999998, 9999999999999999)) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  D.E_S, ");
      SQL.append("  D.CAPITOLO, ");
      SQL.append("  D.ARTICOLO, ");
      SQL.append("  'X', ");
      SQL.append("  LPAD(TO_CHAR ( D.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || '/' || LPAD(TO_CHAR ( D.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  NULL, ");
      SQL.append("  E.DESCRIZIONE, ");
      SQL.append("  NULL, ");
      SQL.append("  D.IMPORTO, ");
      SQL.append("  D.IMPORTO_CASSA, ");
      SQL.append("  DECODE(D.E_S, 'E', NVL(D.IMPORTO, 0), 0), ");
      SQL.append("  DECODE(D.E_S, 'S', NVL(D.IMPORTO, 0), 0), ");
      SQL.append("  DECODE(D.E_S, 'E', NVL(D.IMPORTO_CASSA, 0), 0), ");
      SQL.append("  DECODE(D.E_S, 'S', NVL(D.IMPORTO_CASSA, 0), 0), ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  NULL ");
      SQL.append("from ");
      SQL.append("  VARIAZIONI D, ");
      SQL.append("  CAP E ");
      SQL.append("where (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((D.E_S = ~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ AND ~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ <> 'ES') OR (~~PQRY_PARAMETRI435.ROWNAMEPARTE~~ = 'ES')) ");
      SQL.append("and   (NVL(D.SEDE_DEL, '-1') = NVL(~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~, NVL(D.SEDE_DEL, '-1'))) ");
      SQL.append("and   (NVL(D.NUMERO_DEL, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~, NVL(D.NUMERO_DEL, -1))) ");
      SQL.append("and   (NVL(D.ANNO_DEL, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMANNDEL~~, NVL(D.ANNO_DEL, -1))) ");
      SQL.append("and   (NVL(D.UNITA_PROPONENTE, '-1') = NVL(~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~, NVL(D.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (NVL(D.NUMERO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~, NVL(D.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(D.ANNO_PROPOSTA, -1) = NVL(~~PQRY_PARAMETRI435.ROWNAMANNPRO~~, NVL(D.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (D.TIPO = ~~PQRY_PARAMETRI435.ROWNAMEVARIA~~) ");
      SQL.append("and   (E.ESERCIZIO = D.ESERCIZIO) ");
      SQL.append("and   (E.E_S = D.E_S) ");
      SQL.append("and   (E.CAPITOLO = D.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = D.ARTICOLO) ");
      SQL.append("and   (E.CAPITOLO IN (9999999999999996, 9999999999999997, 9999999999999998, 9999999999999999)) ");
      SQL.append("order by 1, 4, 5 ");
      BUK_STAMPPERCODI.SetReportQuery(BUK_STAMPPERCODI_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "51E50FA9-2AF9-45CC-9D95-D826DD061CA9");
      if (BUK_STAMPPERCODI.FindObjByID(BUK_STAMPPERCODI_SEC_ESGRUPPO) != null)
        BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_ESGRUPPO, "RECORVARIAES");
      if (BUK_STAMPPERCODI.FindObjByID(BUK_STAMPPERCODI_SEC_RAGTREINTGRU) != null)
        BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, "RAGGRTREV");
      if (BUK_STAMPPERCODI.FindObjByID(BUK_STAMPPERCODI_SEC_VALOINTEGRUP) != null)
        BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, "RECORDRAGGR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPPERCODI_RPT_REPORT_Init()
  {
    BUK_STAMPPERCODI.InitReport(BUK_STAMPPERCODI_RPT_REPORT, 196865);
    BUK_STAMPPERCODI_RPT_REPORT_InitQuery(true, false);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPT_REPORT, "CF62193B-37EE-4A7E-BDBF-4D8F04C287A5");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPT_REPORT, "REPORT");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_INTESTREPOR1, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTREPOR1, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTREPOR1, "8588E94A-4646-4596-9E46-804CB62FE37A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTREPOR1, "INTESTREPOR1");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_INTESTPAGIN1, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTPAGIN1, BUK_STAMPPERCODI_RPTBOX_TESTATPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTPAGIN1, "D7F7DEDF-6D47-4337-A13A-766F69D58888");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTPAGIN1, "INTESTPAGIN1");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_ESGRUPPO, 1500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "RECORVARIAES");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_ESGRUPPO, "2BD7D95E-06DC-46A4-95B3-747343445C3F");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_ESGRUPPO, "ESGRUPPO");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_ES, 0, 0, 5000, 500, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_ES, "92F0B0DC-9A25-4AA5-8787-95A94210D6E2");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_ES, "ES");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_ES, BUK_STAMPPERCODI_SPAN_ES, MyGlb.VIS_INTCONBORCE7, 5, 99, 0, 271319425, "Entrata", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ES, "603DE4E5-335D-42FC-A179-65D7978ACD8A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ES, "ES");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, 5000, 0, 23200, 500, 0, 1, 1, MyGlb.VIS_BOXALIGCENT7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, "93FD0F37-840C-4E54-97A5-959DA3CD91E4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, "INTESTAZIONE");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_INTESTAZIONE, BUK_STAMPPERCODI_SPAN_RONAINSTAVAV, MyGlb.VIS_BOXALIGCENT7, 5, 160, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RONAINSTAVAV, "7B1BF05E-AAD0-4A4C-8B41-48DF69A290D8");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RONAINSTAVAV, "RONAINSTAVAV");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_CODICEUO1, 0, 500, 2000, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, "04155F67-DFFC-4279-996C-0967769FE6C5");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, "CODICEUO1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODICEUO1, BUK_STAMPPERCODI_SPAN_C4, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "CODICE UO", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_C4, "01954D4C-2701-4462-83CD-B704AE62F15D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_C4, "C4");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, 6300, 500, 1800, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, "46A3EDD5-FDA2-42D3-AD09-04A4AF22321D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, "CODPIANOCONT");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODPIANOCONT, BUK_STAMPPERCODI_SPAN_C2, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "COD. PIANO CONTI", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_C2, "7B624843-0056-4D19-B49D-06405D88ADC6");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_C2, "C2");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_CODICE2, 5000, 500, 1300, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE6, 983041, 250, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODICE2, "6AE39517-E384-4CF6-9659-7974097ACEFC");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODICE2, "CODICE2");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODICE2, BUK_STAMPPERCODI_SPAN_IRVESAVSPCET, MyGlb.VIS_INTCONBORCE6, 5, 99, 0, 271384961, "CODICE", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_IRVESAVSPCET, "C2EBDA11-4019-4650-9616-5789BF8BFBE5");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_IRVESAVSPCET, "IRVESAVSPCET");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, 8100, 500, 4900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, "ECF0B9E1-B040-4C3B-A1D4-E748C4A37393");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, BUK_STAMPPERCODI_SPAN_DESCRIZIONE, MyGlb.VIS_INTCONBORCE7, 5, 99, 0, 271319425, "DESCRIZIONE", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_DESCRIZIONE, "416FAAE2-6039-4C72-A764-1FE7A7AEAADC");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, BUK_STAMPPERCODI_SPAN_NUOVASPAN10, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "\n", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN10, "F8C4809C-F77F-4861-A3E8-A08E5110411B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN10, "NUOVASPAN10");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DESCRIZIONE, BUK_STAMPPERCODI_SPAN_NUOVASPAN12, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "OBIETTIVO GESTIONALE", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN12, "C7D2A9EB-BD56-480A-A79C-C4813F2506E1");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN12, "NUOVASPAN12");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, 13000, 500, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, "9B8AF648-7FE7-4B68-A417-5BD711D6AACB");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, "STANZIINIZIA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STANZIINIZIA, BUK_STAMPPERCODI_SPAN_STANZIINIZI1, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271319425, "", "STN. ATTUALE", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_STANZIINIZI1, "254E238C-62CB-4857-91B9-F9357C5F1AC4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_STANZIINIZI1, "STANZIINIZI1");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, 15500, 500, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, "4C6F0F31-7D88-4015-9859-F94CFF7AF2CB");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, "VARIAZCOMPET");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_VARIAZCOMPET, BUK_STAMPPERCODI_SPAN_VARIAZCOMPET, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271319425, "", "VARIAZIONI COMPETENZA", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_VARIAZCOMPET, "9FB7AEDA-7366-4E53-A2AE-39B2F4A3BB85");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_VARIAZCOMPET, "VARIAZCOMPET");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, 18000, 500, 2700, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, "69B14218-F7C7-4B92-8E67-7924C3CA2803");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, "STANZIDEFINI");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STANZIDEFINI, BUK_STAMPPERCODI_SPAN_NUOVASPAN8, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384705, "", "STANZIAMENTO DEFINITIVO", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN8, "F1C2591E-6E62-4E78-BBE9-8C4BF6036EF7");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN8, "NUOVASPAN8");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, 20700, 500, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, "F37ADC39-0A5D-474A-B025-F85DB1C82C2D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, "STANINIZCASS");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STANINIZCASS, BUK_STAMPPERCODI_SPAN_STANZIINIZIA, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271319425, "", "STN. ATTUALE. CASSA", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_STANZIINIZIA, "C736A2AC-05A3-41E9-8D76-97BB49B61376");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_STANZIINIZIA, "STANZIINIZIA");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, 23200, 500, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, "DC7EBBBD-9D6B-40B0-BC05-2025D0E24EE9");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, "VARIAZICASSA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, BUK_STAMPPERCODI_SPAN_VARIAZICASSA, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271319425, "", "VARIAZIONI ", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_VARIAZICASSA, "2D75705A-A296-490E-8B40-421D8ED1796A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_VARIAZICASSA, "VARIAZICASSA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, BUK_STAMPPERCODI_SPAN_NUOVASPAN6, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "\n", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN6, "33AB978D-7926-4ED2-A35D-7002C476B494");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN6, "NUOVASPAN6");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_VARIAZICASSA, BUK_STAMPPERCODI_SPAN_NUOVASPAN7, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "CASSA", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN7, "D17F12D5-61AE-4E39-B78A-32CEF4451D16");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN7, "NUOVASPAN7");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_CAPITOLO, 2000, 500, 3000, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, "F6402518-55F2-4A9D-B204-5F974BA061FC");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CAPITOLO, BUK_STAMPPERCODI_SPAN_IRNTSAVAVCCI, MyGlb.VIS_INTCONBORCE7, 5, 99, 0, 271384961, "CAPITOLO", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCCI, "D0EEFB8C-0AD0-4387-A6F9-EF0F125F772A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCCI, "IRNTSAVAVCCI");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_ESGRUPPO, BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, 25700, 500, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, "5CD75101-094B-4152-B49F-99B994E340AE");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, "STNCASSADEF");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STNCASSADEF, BUK_STAMPPERCODI_SPAN_NUOVASPAN9, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384705, "", "STN. CASSA.   DEFINITIVO", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN9, "7B681CCC-D912-41EF-8E08-6D1CFF2BE7F1");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN9, "NUOVASPAN9");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_RAGTREINTGRU, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RAGGRTREV");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, "390F5CB7-67E3-4CCC-8AB1-28F9AB9A66F6");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, "RAGTREINTGRU");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, 0, 0, 28200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, "B3F230A6-E954-4DCD-9D73-CBEDDD92BEBF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, "TOTALETITOL1");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, 2);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, BUK_STAMPPERCODI_SPAN_NUOVASPAN11, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Titolo ", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN11, "0649A3C7-B979-442F-A767-3B30101791EF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN11, "NUOVASPAN11");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALETITOL1, BUK_STAMPPERCODI_SPAN_RERATRALVSP1, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RAGGRTREV", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RERATRALVSP1, "F427FC53-DD4B-461B-AF74-7E32816C3AC4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RERATRALVSP1, "RERATRALVSP1");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_VALOINTEGRUP, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORDRAGGR");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, "57130776-8A96-43B0-960C-E83B45AD75BD");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, "VALOINTEGRUP");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CODICEUO, 0, 0, 2000, 500, 0, 1, 3, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODICEUO, "B665A666-F219-4C38-B065-863B7ED90E2E");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODICEUO, "CODICEUO");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CODICEUO, 2);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODICEUO, BUK_STAMPPERCODI_SPAN_ILRCAVSPC3RC, MyGlb.VIS_BOX7, 5, 99, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ILRCAVSPC3RC, "A0B42420-6114-4B26-9150-420C8F548D07");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ILRCAVSPC3RC, "ILRCAVSPC3RC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CAP, 2000, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CAP, "A21D9FA4-70A6-425D-8444-CD0F5D9E619B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CAP, "CAP");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CAP, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CAP, BUK_STAMPPERCODI_SPAN_IRNTSAVAVCBR, MyGlb.VIS_BOX7, 5, 99, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCBR, "A1A34D11-EAD0-4FE3-9D3A-C486779E759D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_IRNTSAVAVCBR, "IRNTSAVAVCBR");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_DESC, 8100, 0, 4900, 500, 0, 1, 3, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_DESC, "F2158314-E2CA-459A-ABC3-DA50FB10FD2F");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_DESC, "DESC");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DESC, BUK_STAMPPERCODI_SPAN_RECADEALVSPC, MyGlb.VIS_BOX7, 5, 99, 0, 271384705, "", "::RECORCAPDESC", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RECADEALVSPC, "41115F7B-5C6B-4F6E-87BB-93C1D9C25CE2");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RECADEALVSPC, "RECADEALVSPC");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_DESC, BUK_STAMPPERCODI_SPAN_ININROGAVSPC, MyGlb.VIS_NORMAA7ITALI, 5, 99, 0, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ININROGAVSPC, "A3B2F2FE-3497-4225-ABCB-EABFEE1E33FE");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ININROGAVSPC, "ININROGAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_STNINI, 13000, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNINI, "1BCA5A80-E7A2-4FDF-A986-21A075256600");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNINI, "STNINI");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_STNINI, 4);
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, 15500, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, "DACD15CC-DD0E-4904-8044-A49FD8D7815E");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, "COMPETENZA1");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_COMPETENZA1, BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC, MyGlb.VIS_BOX7, 3, 28, 6, 271384961, "123.456.789.123.12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC, "855076FF-0F9B-4247-B4CC-AB9BBAE9C25D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_VAIGSRIAVSPC, "VAIGSRIAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, 18000, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, "A321EAEC-21FE-48E6-90FF-4EE6E1127358");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, "STNDEFCALC");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STNDEFCALC, BUK_STAMPPERCODI_SPAN_C3, MyGlb.VIS_BOX7, 0, 0, 0, 271384961, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_C3, "1C5B6724-F732-4C8C-8BBA-DE9EE926F1B4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_C3, "C3");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_STNINICA1, 20700, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNINICA1, "38B1F2E7-8CF0-4A8E-A460-23C0857146D5");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNINICA1, "STNINICA1");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CASSA1, 23200, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CASSA1, "86D270A1-B286-40C0-8D9E-A62AF3D38827");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CASSA1, "CASSA1");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CASSA1, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CASSA1, BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC, MyGlb.VIS_BOX7, 3, 28, 6, 271384961, "123.456.789.123.12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC, "3C840DB9-FB92-4E4B-B490-C719A6659333");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_VIGSRICAVSPC, "VIGSRICAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, 25700, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, "FDBA2690-82DC-4A86-BB7D-B691C9982BE9");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, "STNCASDEFCAL");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STNCASDEFCAL, BUK_STAMPPERCODI_SPAN_C, MyGlb.VIS_BOX7, 0, 0, 0, 271384961, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_C, "3C5E90FB-1101-41F4-9F89-FE07F2E2A85F");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_C, "C");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CODICE, 5000, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODICE, "A07FA105-4CF2-43F2-A9B6-9E8A2E9FB55C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODICE, "CODICE");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CODICE, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODICE, BUK_STAMPPERCODI_SPAN_RECOALVASTPC, MyGlb.VIS_BOX7, 5, 105, 0, 271384705, "", "::CODBIL", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RECOALVASTPC, "553738CF-400E-4E3D-AF86-37D7D05CD94F");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RECOALVASTPC, "RECOALVASTPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, BUK_STAMPPERCODI_RPTBOX_CODICE1, 6300, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CODICE1, "D5DF305C-F032-4323-8CE7-E58BE9A8A0D4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CODICE1, "CODICE1");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CODICE1, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CODICE1, BUK_STAMPPERCODI_SPAN_RECOPICAVSPC, MyGlb.VIS_BOX7, 5, 99, 0, 271384705, "", "::CODPIANOCONT", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RECOPICAVSPC, "1AB30CB0-53C8-466F-8710-CDE4FBBD3695");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RECOPICAVSPC, "RECOPICAVSPC");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_DETTAGLIO, 0, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_DETTAGLIO, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_DETTAGLIO, "95E8439A-C5D6-44C7-8A1A-486C89370A41");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_VALOPIEDGRUP, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8913153, "RECORDRAGGR");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_VALOPIEDGRUP, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_VALOPIEDGRUP, "AF51F562-4CA2-4543-8DB5-5E62D4D32D7C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_VALOPIEDGRUP, "VALOPIEDGRUP");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RAGGRTREV");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, "63C3A3A5-3CEB-4F12-8AD9-330EE9FF33D9");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, "RAGTREPIEGRU");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, 0, 0, 13000, 400, 0, 1, 1, MyGlb.VIS_INTCONBORCE7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, "F929F620-A9F2-47BE-9161-790FDB91C069");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, "TOTALETITOLO");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, BUK_STAMPPERCODI_SPAN_NUOVASPAN13, MyGlb.VIS_INTCONBORCE7, 0, 0, 0, 271384961, "", "Totale Titolo ", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN13, "30E16986-9E45-4362-9C27-7B749BD18EFD");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN13, "NUOVASPAN13");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALETITOLO, BUK_STAMPPERCODI_SPAN_RERATRALVSPC, MyGlb.VIS_INTCONBORCE7, 5, 99, 0, 271384705, "", "::RAGGRTREV", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RERATRALVSPC, "87C84FBD-886B-49E1-BB0C-ED17D455EE0C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RERATRALVSPC, "RERATRALVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, 13000, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, "9885CF87-EC52-4635-A1D8-FD70762D76D4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, "TOTSTNINI");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTSTNINI, BUK_STAMPPERCODI_SPAN_ALVATOSTINCO, MyGlb.VIS_BOX7, 3, 14, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ALVATOSTINCO, "57E1AEC8-1D67-4469-916A-CD77DCB9485B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ALVATOSTINCO, "ALVATOSTINCO");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_COMPETENZA, 15500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, "C675B29E-768E-44B0-927B-45ED90E4C1FC");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, "COMPETENZA");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_COMPETENZA, BUK_STAMPPERCODI_SPAN_RTPGSRIAVSPC, MyGlb.VIS_BOX7, 3, 28, 6, 271384961, "123.456.789.123.12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RTPGSRIAVSPC, "515FEA1C-6CDB-4FCB-97AE-A29E97F78768");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RTPGSRIAVSPC, "RTPGSRIAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, 18000, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, "9D043A42-B57C-410E-B3BC-8FAA30C305AD");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, "TOTSTNATTUA1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTSTNATTUA1, BUK_STAMPPERCODI_SPAN_ALLVARTOSTDE, MyGlb.VIS_BOX7, 3, 14, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ALLVARTOSTDE, "1095370F-C8B4-4912-8A3C-8453DEF6D4D9");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ALLVARTOSTDE, "ALLVARTOSTDE");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, 20700, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, "6425AB8A-4966-43FB-8D59-F437F49957AB");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, "TOTSTNINICA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTSTNINICA, BUK_STAMPPERCODI_SPAN_ALVATOSTINCA, MyGlb.VIS_BOX7, 3, 14, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ALVATOSTINCA, "A9BE79CD-41FF-49AA-ADBE-079F418FA735");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ALVATOSTINCA, "ALVATOSTINCA");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_CASSA, 23200, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CASSA, "669DBCEA-63B4-481C-8153-9F04D4238AA0");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CASSA, "CASSA");
    BUK_STAMPPERCODI.set_BoxAlignment(BUK_STAMPPERCODI_RPTBOX_CASSA, 4);
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CASSA, BUK_STAMPPERCODI_SPAN_RTPGSRICAVSP, MyGlb.VIS_BOX7, 3, 28, 6, 271384961, "123.456.789.123.12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_RTPGSRICAVSP, "3C9D0062-C296-4D46-8B39-741D318BCE7A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_RTPGSRICAVSP, "RTPGSRICAVSP");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_RAGTREPIEGRU, BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, 25700, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_BOX7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, "33E1DD19-A721-48BF-B23F-A6830E89E436");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, "TOTSTNDEFCA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTSTNDEFCA, BUK_STAMPPERCODI_SPAN_ALVATOSTCADE, MyGlb.VIS_BOX7, 3, 14, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_ALVATOSTCADE, "0A5810E7-599E-4A45-8CDA-7A208869673B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_ALVATOSTCADE, "ALVATOSTCADE");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_VARIESPIEGRU, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORVARIAES");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_VARIESPIEGRU, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_VARIESPIEGRU, "5F14C73B-C97F-471C-A0B0-FA36F43D9F65");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_VARIESPIEGRU, "VARIESPIEGRU");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEPAGINA, BUK_STAMPPERCODI_RPTBOX_PIEDEPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEPAGINA, "BBE4081C-3D62-40DB-B25A-1998E1E76506");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_REPORT, BUK_STAMPPERCODI_SEC_PIEDEREPORT, 1900, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEREPORT, "90926112-D7EF-46B7-ACAB-F0804CBB7984");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET, 3500, 100, 3000, 600, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET, "719809B1-0A6F-4C77-BEC1-844468E74A91");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET, "TOTALICOMPET");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALICOMPET, BUK_STAMPPERCODI_SPAN_NUOVASPAN1, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384705, "", "Totali Competenza", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN1, "F4703E1B-AC58-408E-B485-8F6E6AC46119");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_TOTALICASSA, 13500, 100, 2100, 600, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_TOTALICASSA, "E9329304-2B5B-4E8A-AB30-27DB8A1E3A8D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_TOTALICASSA, "TOTALICASSA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_TOTALICASSA, BUK_STAMPPERCODI_SPAN_NUOVASPAN2, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384961, "", "Totali Cassa", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN2, "404F2F75-3C17-42E1-B259-C87FA398990E");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN2, "NUOVASPAN2");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_ENTRATA, 1400, 600, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_ENTRATA, "4DC5E534-344D-4414-8773-F2A46295AFE8");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_ENTRATA, "ENTRATA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_ENTRATA, BUK_STAMPPERCODI_SPAN_NUOVASPAN3, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384961, "", "Entrata", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN3, "6DA669C1-1F40-47E2-99F8-B22C23D00BB0");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN3, "NUOVASPAN3");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_SPESA, 6300, 600, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_SPESA, "5E8A59F5-97C0-4E7F-A701-7572CA860488");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_SPESA, "SPESA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_SPESA, BUK_STAMPPERCODI_SPAN_NUOVASPAN4, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384961, "", "Spesa", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN4, "379C7A62-4145-431E-9557-7BD8880BB7C6");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN4, "NUOVASPAN4");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_ENTRATA1, 11500, 600, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_ENTRATA1, "E193A2A9-F9BA-4A86-8518-3A148011FBB0");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_ENTRATA1, "ENTRATA1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_ENTRATA1, BUK_STAMPPERCODI_SPAN_NUOVASPAN5, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384961, "", "Entrata", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN5, "628C97EF-18DC-4F96-B69B-734A10EA1C6D");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN5, "NUOVASPAN5");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_SPESA1, 16400, 600, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZBORD7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_SPESA1, "65CC3CC2-2363-4A97-B483-D884E7FB45F1");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_SPESA1, "SPESA1");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_SPESA1, BUK_STAMPPERCODI_SPAN_NUOVASPAN, MyGlb.VIS_INTSENZBORD7, 0, 0, 0, 271384961, "", "Spesa", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_NUOVASPAN, "8FA7D1E3-387F-410E-BB0C-61681876FE56");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, 400, 1000, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, "9F67DED0-CAEA-4B58-8C74-429D70CB2EF6");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, "COMPETENZAE");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_COMPETENZAE, BUK_STAMPPERCODI_SPAN_PRSRICEAVSP1, MyGlb.VIS_IMPORTOA7, 3, 28, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PRSRICEAVSP1, "BFED2A0F-C51A-43E8-9FFA-FBAB9F96F4CF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PRSRICEAVSP1, "PRSRICEAVSP1");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, 5500, 1000, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, "769E0B0A-8F3E-4B63-8DB7-6D851618F006");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, "COMPETENZAS");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_COMPETENZAS, BUK_STAMPPERCODI_SPAN_PRSRICSAVSP1, MyGlb.VIS_IMPORTOA7, 3, 28, 6, 271384705, "", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PRSRICSAVSP1, "91F8340F-5F0F-421C-A975-FC46D22FFB9A");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PRSRICSAVSP1, "PRSRICSAVSP1");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_CASSAE, 10400, 1000, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CASSAE, "A92C579C-FF82-4706-AC11-947760303C59");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CASSAE, "CASSAE");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CASSAE, BUK_STAMPPERCODI_SPAN_PRSRICEAVSPC, MyGlb.VIS_IMPORTOA7, 3, 28, 6, 271384961, "123.456.789.789,12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PRSRICEAVSPC, "C24BE952-4ED0-4585-B37B-B6C36F4FB8AF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PRSRICEAVSPC, "PRSRICEAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_CASSAS, 15500, 1000, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_CASSAS, "42AFB4F5-C1F9-4A65-9E45-CD86A1E0D3E1");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_CASSAS, "CASSAS");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_CASSAS, BUK_STAMPPERCODI_SPAN_PRSRICSAVSPC, MyGlb.VIS_IMPORTOA7, 3, 28, 6, 271384961, "123.456.789.789,12", "", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_PRSRICSAVSPC, "FEDC78DE-6DB4-469E-A910-3BA636A60A95");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_PRSRICSAVSPC, "PRSRICSAVSPC");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_PIEDEREPORT, BUK_STAMPPERCODI_RPTBOX_BOX, 0, 0, 18900, 1700, 0, 1, 1, MyGlb.VIS_BOX, 983041, 0, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_BOX, "D77A8D21-E454-43EC-A82D-9EF1D833A3BF");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_BOX, "BOX");
    BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_ESGRUPPO, "RECORVARIAES");
    BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_RAGTREINTGRU, "RAGGRTREV");
    BUK_STAMPPERCODI.AddReportGroup(BUK_STAMPPERCODI_SEC_VALOINTEGRUP, "RECORDRAGGR");
    BUK_STAMPPERCODI_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_STAMPPERCODI_RPT_STNINI_InitQuery() { BUK_STAMPPERCODI_RPT_STNINI_InitQuery(true, true); }
  private void BUK_STAMPPERCODI_RPT_STNINI_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.STN_INI_CO + CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMEVARIA~~ = 'P' THEN NVL(A.VARIAZIONI_CO, 0) ELSE GET_IMPORTI_VAR(A.E_S,A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,-1,-1,-1,~~PQRY_PARAMETRI435.ROWNAMEDATAL~~,~~PQRY_PARAMETRI435.ROWNAMANNDEL~~,~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~,~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~,-1,'-1',~~PQRY_PARAMETRI435.ROWNAMANNPRO~~,~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~,~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~,~~PQRY_PARAMETRI435.ROWNAMEVARIA~~,'TOT','CO') END as RECBILSTINCO ");
      SQL.append("from ");
      SQL.append("  BIL A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.E_S = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECORVARIAES~~) ");
      SQL.append("and   (A.CAPITOLO = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICACA~~) ");
      SQL.append("and   (A.ARTICOLO = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICAAR~~) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CA' OR (~~" + BUK_STAMPPERCODI_RPT_REPORT + ".CODBIL~~ IS NULL)) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  NVL(STANZIAMENTO(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECORVARIAES~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".REVIRICAMITI~~)),TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".REVIRICAPRTI~~)),TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICATI~~)),~~PQRY_PARAMETRI435.ROWNAMANNDEL~~,~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~,~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~,~~PQRY_PARAMETRI435.ROWNAMEDATAL~~,~~PQRY_PARAMETRI435.ROWNAMEVARIA~~,'-1',-1,~~PQRY_PARAMETRI435.ROWNAMANNPRO~~,~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~,~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~,'CO'), 0) ");
      SQL.append("from ");
      SQL.append("  DUAL B ");
      SQL.append("where (NOT ((~~" + BUK_STAMPPERCODI_RPT_REPORT + ".CODBIL~~ IS NULL))) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CO') ");
      BUK_STAMPPERCODI.SetReportQuery(BUK_STAMPPERCODI_RPT_STNINI, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "C04B1BD2-BC43-4C45-B3A2-63F806E21E32");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPPERCODI_RPT_STNINI_Init()
  {
    BUK_STAMPPERCODI.InitReport(BUK_STAMPPERCODI_RPT_STNINI, 131329);
    BUK_STAMPPERCODI.SetSubReportBox(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI_RPT_STNINI_InitQuery(true, false);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPT_STNINI, "15EBD63A-EBDB-4934-85B5-7F389C85F525");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPT_STNINI, "STNINI");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_SEC_INTESTREPOR2, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTREPOR2, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTREPOR2, "8FDF15D9-F88C-4AB6-BE9C-7471305F059B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTREPOR2, "INTESTREPOR2");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_SEC_INTESTPAGIN2, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTPAGIN2, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTPAGIN2, "0AA5E089-EBB6-4527-B625-0D225B49ED29");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTPAGIN2, "INTESTPAGIN2");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_SEC_SUBSTNINCODE, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_SUBSTNINCODE, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_SUBSTNINCODE, "67C378A4-B5D7-4237-8AD8-4273A477CB50");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_SUBSTNINCODE, "SUBSTNINCODE");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_SUBSTNINCODE, BUK_STAMPPERCODI_RPTBOX_STNINICO, 0, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTOA7, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNINICO, "E245E037-BC40-4A6D-A257-5330E40E4F47");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNINICO, "STNINICO");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STNINICO, BUK_STAMPPERCODI_SPAN_REBISICAVSP1, MyGlb.VIS_IMPORTOA7, 3, 28, 6, 271384705, "", "::RECBILSTINCO", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_REBISICAVSP1, "99A6BE81-9B30-427E-B51F-5C0BC172260B");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_REBISICAVSP1, "REBISICAVSP1");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_SEC_PIEDEPAGINA1, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEPAGINA1, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEPAGINA1, "9B4C6557-BC36-4886-BD76-E08815158CF8");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEPAGINA1, "PIEDEPAGINA1");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_STNINI, BUK_STAMPPERCODI_SEC_PIEDEREPORT1, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEREPORT1, BUK_STAMPPERCODI_RPTBOX_STNINI);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEREPORT1, "F2AFF09D-E5E1-4C4D-836B-0A6367E5EE16");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEREPORT1, "PIEDEREPORT1");
    BUK_STAMPPERCODI_RPT_STNINI_InitQuery(false, true);
  }

  private void BUK_STAMPPERCODI_RPT_NUOVOREPORT_InitQuery() { BUK_STAMPPERCODI_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_STAMPPERCODI_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(A.CAPITOLO, 9999999999999998, A.STN_INI_CO, NVL(A.STN_INI_CA, 0)) + CASE WHEN ~~PQRY_PARAMETRI435.ROWNAMEVARIA~~ = 'P' THEN DECODE(A.CAPITOLO, 9999999999999998, A.VARIAZIONI_CO, NVL(A.VARIAZIONI_CA, 0)) ELSE GET_IMPORTI_VAR(A.E_S,A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,-1,-1,-1,~~PQRY_PARAMETRI435.ROWNAMEDATAL~~,~~PQRY_PARAMETRI435.ROWNAMANNDEL~~,~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~,~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~,-1,'-1',~~PQRY_PARAMETRI435.ROWNAMANNPRO~~,~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~,~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~,~~PQRY_PARAMETRI435.ROWNAMEVARIA~~,'TOT','CA') END as RECBILSTINCA ");
      SQL.append("from ");
      SQL.append("  BIL A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.E_S = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECORVARIAES~~) ");
      SQL.append("and   (A.CAPITOLO = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICACA~~) ");
      SQL.append("and   (A.ARTICOLO = ~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICAAR~~) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CA' OR ((~~" + BUK_STAMPPERCODI_RPT_REPORT + ".CODBIL~~ IS NULL))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  NVL(STANZIAMENTO(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECORVARIAES~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".REVIRICAMITI~~)),TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".REVIRICAPRTI~~)),TRUNC(TO_NUMBER(~~" + BUK_STAMPPERCODI_RPT_REPORT + ".RECVISRICATI~~)),~~PQRY_PARAMETRI435.ROWNAMANNDEL~~,~~PQRY_PARAMETRI435.ROWNAMNUMDEL~~,~~PQRY_PARAMETRI435.ROWNAMSEDDEL~~,~~PQRY_PARAMETRI435.ROWNAMEDATAL~~,~~PQRY_PARAMETRI435.ROWNAMEVARIA~~,'-1',-1,~~PQRY_PARAMETRI435.ROWNAMANNPRO~~,~~PQRY_PARAMETRI435.ROWNAMNUMPRO~~,~~PQRY_PARAMETRI435.ROWNAMUNIPRO~~,'CA'), 0) ");
      SQL.append("from ");
      SQL.append("  DUAL B ");
      SQL.append("where (NOT ((~~" + BUK_STAMPPERCODI_RPT_REPORT + ".CODBIL~~ IS NULL))) ");
      SQL.append("and   (~~PQRY_PARAMETRI435.ROWNAMTIPSTA~~ = 'CO') ");
      BUK_STAMPPERCODI.SetReportQuery(BUK_STAMPPERCODI_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2AEABE3B-9F35-4F8A-B0E5-DCB3F6107842");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMPPERCODI_RPT_NUOVOREPORT_Init()
  {
    BUK_STAMPPERCODI.InitReport(BUK_STAMPPERCODI_RPT_NUOVOREPORT, 131073);
    BUK_STAMPPERCODI.SetSubReportBox(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPT_NUOVOREPORT, "12E40527-B240-484D-A922-B705A6E4B5F4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTREPORT, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTREPORT, "294A8C90-E679-46B4-B6B7-8654234696AD");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_SEC_INTESTPAGINA, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_INTESTPAGINA, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_INTESTPAGINA, "23CF4791-FD7F-4A3B-86B5-D4FDD9293FCA");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_SEC_SUBSTNINCADE, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_SUBSTNINCADE, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_SUBSTNINCADE, "BC988884-B18D-4490-BFE0-64BFF170D4C4");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_SUBSTNINCADE, "SUBSTNINCADE");
    BUK_STAMPPERCODI.InitReportBox(BUK_STAMPPERCODI_SEC_SUBSTNINCADE, BUK_STAMPPERCODI_RPTBOX_STNINICA, 0, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 286, "", 1, -33);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_RPTBOX_STNINICA, "FDF50D62-6AE8-4B82-97B0-9815D4B94FA8");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_RPTBOX_STNINICA, "STNINICA");
    BUK_STAMPPERCODI.InitBoxSpan(BUK_STAMPPERCODI_RPTBOX_STNINICA, BUK_STAMPPERCODI_SPAN_REBISICAVSPC, MyGlb.VIS_BOX7, 3, 28, 6, 271384705, "stn ini ca", "::RECBILSTINCA", 1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SPAN_REBISICAVSPC, "2126EE51-D09D-4245-8ABF-543F13A8902C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SPAN_REBISICAVSPC, "REBISICAVSPC");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_SEC_PIEDEPAGINA2, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEPAGINA2, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEPAGINA2, "8D212481-8BA7-428D-8A90-0EC4E0E89F1E");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEPAGINA2, "PIEDEPAGINA2");
    BUK_STAMPPERCODI.InitSection(BUK_STAMPPERCODI_RPT_NUOVOREPORT, BUK_STAMPPERCODI_SEC_PIEDEREPORT2, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMPPERCODI.SetSectionRendersInto(BUK_STAMPPERCODI_SEC_PIEDEREPORT2, BUK_STAMPPERCODI_RPTBOX_STNINICA1);
    BUK_STAMPPERCODI.SetRTCGuid(BUK_STAMPPERCODI_SEC_PIEDEREPORT2, "0D01E833-05EE-45DB-8EB2-030F5F6F620C");
    BUK_STAMPPERCODI.SetObjCode(BUK_STAMPPERCODI_SEC_PIEDEREPORT2, "PIEDEREPORT2");
    BUK_STAMPPERCODI_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_STAMPPERCODI_InitLinks()
  {
    BUK_STAMPPERCODI.SetBoxNextBox(BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA, BUK_STAMPPERCODI_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ALLEGAVARIAZ) PAN_ALLEGAVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALLEGAVARIAZ) PAN_ALLEGAVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ALLEGAVARIAZ) PAN_ALLEGAVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALLEGAVARIAZ) PAN_ALLEGAVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ALLEGAVARIAZ) PAN_ALLEGAVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_STAMPPERCODI) BUK_STAMPPERCODI_OnPreview();
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
