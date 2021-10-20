// **********************************************
// Elenco Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOVARIAZ_TIPODISTAMPA = 0;
  private static int GRP_ELENCOVARIAZ_PARTE = 1;
  private static int GRP_ELENCOVARIAZ_TIPOIMPORTO = 2;
  private static int GRP_ELENCOVARIAZ_VARIAZIONI = 3;
  private static int GRP_ELENCOVARIAZ_PERIODIVARIA = 4;
  private static int GRP_ELENCOVARIAZ_PROVVEDIMENT = 5;

  private static int PFL_ELENCOVARIAZ_TIPOSTAMPA = 0;
  private static int PFL_ELENCOVARIAZ_PARTE = 1;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE1 = 2;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE7 = 3;
  private static int PFL_ELENCOVARIAZ_TIPOIMPORTO = 4;
  private static int PFL_ELENCOVARIAZ_VARIAZIONI = 5;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE5 = 6;
  private static int PFL_ELENCOVARIAZ_TIPOMOTIVAZI = 7;
  private static int PFL_ELENCOVARIAZ_TIPOVARIAZIO = 8;
  private static int PFL_ELENCOVARIAZ_DAL = 9;
  private static int PFL_ELENCOVARIAZ_AL = 10;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE6 = 11;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF1 = 12;
  private static int PFL_ELENCOVARIAZ_DETTAGCAPITO = 13;
  private static int PFL_ELENCOVARIAZ_ORDINAMENTO = 14;
  private static int PFL_ELENCOVARIAZ_DELIBERA = 15;
  private static int PFL_ELENCOVARIAZ_TRATTIDELIBE = 16;
  private static int PFL_ELENCOVARIAZ_NUMERODELIBE = 17;
  private static int PFL_ELENCOVARIAZ_BARRADELIBER = 18;
  private static int PFL_ELENCOVARIAZ_ANNODELIBERA = 19;
  private static int PFL_ELENCOVARIAZ_APRISCELDELI = 20;
  private static int PFL_ELENCOVARIAZ_PROPOSTA = 21;
  private static int PFL_ELENCOVARIAZ_TRATTIPROPOS = 22;
  private static int PFL_ELENCOVARIAZ_NUMEROPROPOS = 23;
  private static int PFL_ELENCOVARIAZ_BARRAPROPOST = 24;
  private static int PFL_ELENCOVARIAZ_ANNOPROPOSTA = 25;
  private static int PFL_ELENCOVARIAZ_APRISCELPROP = 26;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF = 27;
  private static int PFL_ELENCOVARIAZ_ELABORA = 28;
  private static int PFL_ELENCOVARIAZ_DESCRIVARIAZ = 29;
  private static int PFL_ELENCOVARIAZ_VARIABILAPEG = 30;

  private static int PPQRY_PARAMETRI509 = 0;

  private static int PPQRY_TIPIMOTIVBIL = 1;
  private static int PPQRY_T54 = 2;


  IDPanel PAN_ELENCOVARIAZ;
  CIDREObj BUK_VARPERUNIORG;
  OBook BKW_VARPERUNIORG;
  //
  // Template Pages constants
  private static int BUK_VARPERUNIORG_MST_VARPERUNORPA = 1;
  private static int BUK_VARPERUNIORG_RPTBOX_PAGEBODY = 2;

  //
  // Reports constants
  private static int BUK_VARPERUNIORG_RPT_VARPERUNORRE = 3;
  private static int BUK_VARPERUNIORG_SEC_REPORTHEADER = 4;
  private static int BUK_VARPERUNIORG_SEC_PAGEHEADER = 5;
  private static int BUK_VARPERUNIORG_RPTBOX_LOGO = 6;
  private static int BUK_VARPERUNIORG_RPTBOX_PAGEHEADER = 7;
  private static int BUK_VARPERUNIORG_SPAN_EVIERNVEVEVD = 8;
  private static int BUK_VARPERUNIORG_RPTBOX_NUMEROPAGIN1 = 9;
  private static int BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1 = 10;
  private static int BUK_VARPERUNIORG_RPTBOX_DATA = 11;
  private static int BUK_VARPERUNIORG_SPAN_DATA = 12;
  private static int BUK_VARPERUNIORG_SPAN_TODAY = 13;
  private static int BUK_VARPERUNIORG_SEC_PROUNIORGRHE = 14;
  private static int BUK_VARPERUNIORG_RPTBOX_SUDDIUNITSUP = 15;
  private static int BUK_VARPERUNIORG_SPAN_SUDDIUNITSU1 = 16;
  private static int BUK_VARPERUNIORG_RPTBOX_UNITAORG = 17;
  private static int BUK_VARPERUNIORG_SPAN_SUDDIUNITSUP = 18;
  private static int BUK_VARPERUNIORG_SEC_ESGROUPHEADE = 19;
  private static int BUK_VARPERUNIORG_RPTBOX_PARTEHEADER = 20;
  private static int BUK_VARPERUNIORG_SPAN_PARTE1 = 21;
  private static int BUK_VARPERUNIORG_RPTBOX_PARTE = 22;
  private static int BUK_VARPERUNIORG_SPAN_PARTE = 23;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPITARTHEAD = 24;
  private static int BUK_VARPERUNIORG_SPAN_C1 = 25;
  private static int BUK_VARPERUNIORG_RPTBOX_CODICBILHEAD = 26;
  private static int BUK_VARPERUNIORG_SPAN_C2 = 27;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPDESCRHEAD = 28;
  private static int BUK_VARPERUNIORG_SPAN_C3 = 29;
  private static int BUK_VARPERUNIORG_RPTBOX_STANINIZHEAD = 30;
  private static int BUK_VARPERUNIORG_SPAN_STANZIINIZI1 = 31;
  private static int BUK_VARPERUNIORG_RPTBOX_DELIBEHEADER = 32;
  private static int BUK_VARPERUNIORG_SPAN_DELIBERA = 33;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIPOSIHEAD = 34;
  private static int BUK_VARPERUNIORG_SPAN_STANZIINIZIA = 35;
  private static int BUK_VARPERUNIORG_RPTBOX_VARINEGAHEAD = 36;
  private static int BUK_VARPERUNIORG_SPAN_VARIAZPOSITI = 37;
  private static int BUK_VARPERUNIORG_RPTBOX_STANDEFIHEAD = 38;
  private static int BUK_VARPERUNIORG_SPAN_STANZIDEFINI = 39;
  private static int BUK_VARPERUNIORG_RPTBOX_NUMEROHEADER = 40;
  private static int BUK_VARPERUNIORG_SPAN_C = 41;
  private static int BUK_VARPERUNIORG_RPTBOX_CODPIANOCONT = 42;
  private static int BUK_VARPERUNIORG_SPAN_NUOVASPAN1 = 43;
  private static int BUK_VARPERUNIORG_SEC_VOCPEGGROHEA = 44;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPITOLOART = 45;
  private static int BUK_VARPERUNIORG_SPAN_RECAAREVVPUO = 46;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPITARTBOR1 = 47;
  private static int BUK_VARPERUNIORG_RPTBOX_CODICEBIL = 48;
  private static int BUK_VARPERUNIORG_SPAN_RECOBIEVVPUO = 49;
  private static int BUK_VARPERUNIORG_RPTBOX_CODICEBORDO1 = 50;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO = 51;
  private static int BUK_VARPERUNIORG_SPAN_RECADEEVVPUO = 52;
  private static int BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD1 = 53;
  private static int BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA = 54;
  private static int BUK_VARPERUNIORG_SPAN_RESTINEVVPUO = 55;
  private static int BUK_VARPERUNIORG_RPTBOX_STANINIZBOR2 = 56;
  private static int BUK_VARPERUNIORG_RPTBOX_DELIBERBORD1 = 57;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR2 = 58;
  private static int BUK_VARPERUNIORG_RPTBOX_VARINEGABOR2 = 59;
  private static int BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR2 = 60;
  private static int BUK_VARPERUNIORG_RPTBOX_ASD = 61;
  private static int BUK_VARPERUNIORG_SPAN_RECOPCEVVPUO = 62;
  private static int BUK_VARPERUNIORG_SEC_DETAIL = 63;
  private static int BUK_VARPERUNIORG_RPTBOX_CAPITARTBORD = 64;
  private static int BUK_VARPERUNIORG_RPTBOX_CODICEBORDO2 = 65;
  private static int BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD2 = 66;
  private static int BUK_VARPERUNIORG_RPTBOX_STANINIZBOR1 = 67;
  private static int BUK_VARPERUNIORG_RPTBOX_DELIBERBORD2 = 68;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIAZPOSITI = 69;
  private static int BUK_VARPERUNIORG_SPAN_REVAPOEVVPUO = 70;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR1 = 71;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIAZNEGATI = 72;
  private static int BUK_VARPERUNIORG_SPAN_REVANEEVVPUO = 73;
  private static int BUK_VARPERUNIORG_RPTBOX_VARINEGABOR1 = 74;
  private static int BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR1 = 75;
  private static int BUK_VARPERUNIORG_RPTBOX_PROPOSTA1 = 76;
  private static int BUK_VARPERUNIORG_SPAN_REPRELVAVPUO = 77;
  private static int BUK_VARPERUNIORG_RPTBOX_DELIBERA = 78;
  private static int BUK_VARPERUNIORG_SPAN_REDEELVAVPUO = 79;
  private static int BUK_VARPERUNIORG_SEC_VOCPEGGROFOO = 80;
  private static int BUK_VARPERUNIORG_RPTBOX_TOTAVARIPOSI = 81;
  private static int BUK_VARPERUNIORG_SPAN_VPGFSRVPEVVP = 82;
  private static int BUK_VARPERUNIORG_RPTBOX_TOTAVARINEGA = 83;
  private static int BUK_VARPERUNIORG_SPAN_VPGFSRVNEVVP = 84;
  private static int BUK_VARPERUNIORG_RPTBOX_STANZIDEFINI = 85;
  private static int BUK_VARPERUNIORG_SPAN_RSIEVVPUOVPG = 86;
  private static int BUK_VARPERUNIORG_RPTBOX_VOCEPEGBORDO = 87;
  private static int BUK_VARPERUNIORG_RPTBOX_CODICEBORDO = 88;
  private static int BUK_VARPERUNIORG_RPTBOX_DESCRIZBORDO = 89;
  private static int BUK_VARPERUNIORG_RPTBOX_STANINIZBORD = 90;
  private static int BUK_VARPERUNIORG_RPTBOX_DELIBERBORDO = 91;
  private static int BUK_VARPERUNIORG_RPTBOX_VARIPOSIBORD = 92;
  private static int BUK_VARPERUNIORG_RPTBOX_VARINEGABORD = 93;
  private static int BUK_VARPERUNIORG_RPTBOX_STANDEFIBORD = 94;
  private static int BUK_VARPERUNIORG_RPTBOX_DOPPIOBORDOB = 95;
  private static int BUK_VARPERUNIORG_SEC_ESGROUPFOOTE = 96;
  private static int BUK_VARPERUNIORG_RPTBOX_BARRAFINALE = 97;
  private static int BUK_VARPERUNIORG_SEC_PROUNIORGRFO = 98;
  private static int BUK_VARPERUNIORG_SEC_PAGEFOOTER = 99;
  private static int BUK_VARPERUNIORG_SEC_REPORTFOOTER = 100;


  // Definition of Global Variables
  private IDVariant UOCORRENTE = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant UOCORRPRIPAS = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PAGINACORREN = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PAGINETOTALI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI334(IMDB);
    Init_TBL_PAGINAZIONE1(IMDB);
    //
    //
    Init_PQRY_PARAMETRI509(IMDB);
    Init_PQRY_PARAMETRI509_RS(IMDB);
    Init_PQRY_VARIAZIONI3(IMDB);
    Init_QRY_CFASELINT100(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI334(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI334, 20);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI334, "TBL_PARAMETRI334");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDAGIPR, "ROWNAMDAGIPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDAGIPR,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI334,IMDBDef4.FLD_PARAMETRI334_ROWNAMEORDIN,5,3,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI334, 0);
  }

  private static void Init_TBL_PAGINAZIONE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAGINAZIONE1, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PAGINAZIONE1, "TBL_PAGINAZIONE1");
    IMDB.set_FldCode(IMDBDef4.TBL_PAGINAZIONE1,IMDBDef4.FLD_PAGINAZIONE1_PAGINEUO, "PAGINEUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAGINAZIONE1,IMDBDef4.FLD_PAGINAZIONE1_PAGINEUO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAGINAZIONE1,IMDBDef4.FLD_PAGINAZIONE1_PAGINETOTALI, "PAGINETOTALI");
    IMDB.SetFldParams(IMDBDef4.TBL_PAGINAZIONE1,IMDBDef4.FLD_PAGINAZIONE1_PAGINETOTALI,1,3,0);
  }

  private static void Init_PQRY_PARAMETRI509(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI509, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI509, "PQRY_PARAMETRI509");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEORDIN,5,3,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI509, 0);
  }

  private static void Init_PQRY_PARAMETRI509_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI509_RS, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI509_RS, "PQRY_PARAMETRI509_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP, "ROWNAMTIPIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI509_RS,IMDBDef12.PQSL_PARAMETRI509_ROWNAMEORDIN,5,3,0);
  }

  private static void Init_PQRY_VARIAZIONI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARIAZIONI3, 27);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARIAZIONI3, "PQRY_VARIAZIONI3");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECSUDUNISUP, "RECSUDUNISUP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECSUDUNISUP,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RESPSUDD, "RESPSUDD");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RESPSUDD,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RESPUO, "RESPUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RESPUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORDESCRUO, "RECORDESCRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORDESCRUO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORVOCEPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORCODIBIL, "RECORCODIBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORCODIBIL,5,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORCAPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOSTANINIZ, "RECOSTANINIZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOSTANINIZ,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_DELIBERA, "DELIBERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_DELIBERA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOVARIPOSI, "RECOVARIPOSI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOVARIPOSI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOVARINEGA, "RECOVARINEGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECOVARINEGA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_CODPIANOCONT, "CODPIANOCONT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_CODPIANOCONT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECORDORDINA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARANNPR1, "RECVARANNPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARANNPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARUNIPR1, "RECVARUNIPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARUNIPR1,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARNUMPR1, "RECVARNUMPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_RECVARNUMPR1,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_PROPOSTA, "PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIAZIONI3,IMDBDef12.PQSL_VARIAZIONI3_PROPOSTA,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARIAZIONI3, 0);
  }

  private static void Init_QRY_CFASELINT100(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.QRY_CFASELINT100, 1);
    IMDB.set_TblCode(IMDBDef12.QRY_CFASELINT100, "QRY_CFASELINT100");
    IMDB.set_FldCode(IMDBDef12.QRY_CFASELINT100,IMDBDef12.QSL_CFASELINT100_PAGINETOTALI, "PAGINETOTALI");
    IMDB.SetFldParams(IMDBDef12.QRY_CFASELINT100,IMDBDef12.QSL_CFASELINT100_PAGINETOTALI,1,3,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoVariazioni()
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
    FormIdx = MyGlb.FRM_ELENCOVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A933D546-837B-4899-ABCA-E3509C1D2089";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 354;
    set_Caption(new IDVariant("Elenco Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 328;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Elenco Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_ELENCOVARIAZ = new IDPanel(w, this, 1, "PAN_ELENCOVARIAZ");
    Frames[1].Content = PAN_ELENCOVARIAZ;
    PAN_ELENCOVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "07A342E0-6E7F-4CE5-B67B-357980368156");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1004, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOVARIAZ.InitStatus = 2;
    PAN_ELENCOVARIAZ_Init();
    PAN_ELENCOVARIAZ_InitFields();
    PAN_ELENCOVARIAZ_InitQueries();
    BKW_VARPERUNIORG = new OBook(this);
    BUK_VARPERUNIORG = new CIDREObj(BKW_VARPERUNIORG);
    BKW_VARPERUNIORG.iGuid = "79088E45-F13C-47F4-A76B-0A335AD460B6";
    BKW_VARPERUNIORG.Code = "BUK_VARPERUNIORG";
    BKW_VARPERUNIORG.BookObj = BUK_VARPERUNIORG;
    BKW_VARPERUNIORG.InitDefMasks();
    BUK_VARPERUNIORG.InitBook(1, 3342593, "Variazioni Per Unita Organizzativa", IMDB, MainFrm.VisualStyleList);
    BUK_VARPERUNIORG.InitHTML();
    BUK_VARPERUNIORG.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_VARPERUNIORG.Book.SetMainFrm(MainFrm);
    BUK_VARPERUNIORG.SetRTCGuid(0, "79088E45-F13C-47F4-A76B-0A335AD460B6");
    BUK_VARPERUNIORG.SetObjCode(0, "VARPERUNIORG");
    BUK_VARPERUNIORG_MST_VARPERUNORPA_Init();
    BUK_VARPERUNIORG_RPT_VARPERUNORRE_Init();
    BUK_VARPERUNIORG_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI334, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCOVARIAZ_PARAMETRI509();
      }
      PAN_ELENCOVARIAZ.UpdatePanel(MainFrm);
      // BUK_VARPERUNIORG.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELPROP) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_VARPERUNIORG")) return BUK_VARPERUNIORG;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoVariazioni.class.getName() : (Glb.ClassWithPackage(ElencoVariazioni.class) ? ElencoVariazioni.class.getName().substring(ElencoVariazioni.class.getPackage().getName().length() + 1) : ElencoVariazioni.class.getName()));
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
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "ApriDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, 0))))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA, 0).compareTo((new IDVariant("U")), true)!=0)
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("PARTE"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("COMP_CASSA"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("TIPO"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("TIPO_VAR"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("TIPO_MOTIV"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("SEDE_DEL"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("NUMERO_DEL"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ANNO_DEL"));
        IDVariant v_NOMEPAR10 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR10 = (new IDVariant("UNITA_PROP"));
        IDVariant v_NOMEPAR11 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR11 = (new IDVariant("NUMERO_PROP"));
        IDVariant v_NOMEPAR12 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR12 = (new IDVariant("ANNO_PROP"));
        IDVariant v_NOMEPAR13 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR13 = (new IDVariant("DATA_DAL"));
        IDVariant v_NOMEPAR14 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR14 = (new IDVariant("DATA_AL"));
        IDVariant v_NOMEPAR15 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR15 = (new IDVariant("DETT_CAP"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Elenco_Variazioni"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEPARTE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR10, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR11, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR12, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR13, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR14, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR15, IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("ORD")), ((IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, 0).equals((new IDVariant("SI"))))?IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEORDIN, 0):(new IDVariant("-1"))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        PAGINACORREN = (new IDVariant(0));
        UOCORRENTE = (new IDVariant(-1));
        ELABORA_PAGIDELEROWS();
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMDAGIPR, 0, IDL.DateAdd((new IDVariant("d")),(new IDVariant(-1)),IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, 0)));
        BUK_VARPERUNIORG.SetBoxImage(BUK_VARPERUNIORG_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
        BUK_VARPERUNIORG.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_VARPERUNIORG.ReportRefreshQuery(BUK_VARPERUNIORG_RPT_VARPERUNORRE);
        BUK_VARPERUNIORG.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_VARPERUNIORG.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Paginazione: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void ELABORA_PAGIDELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef4.TBL_PAGINAZIONE1);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMVABIPE, 0, (new IDVariant("PB")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMDETCAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPSTA, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPMOT, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPIMP, 0, (new IDVariant("CO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEORDIN, 0, (new IDVariant("CAP")));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOVARIAZ);
      // 
      // Elenco Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA, 0).equals((new IDVariant("U")), true))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "ElencoVariazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMUNIPRO, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_TIPOMOTIVAZI)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPMOT, 0, (new IDVariant("-1")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "ElencoVariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Tipo Di Tipo Stampa Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ELENCOVARIAZ_TIPOSTAMPA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipo Di Tipo Stampa Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPSTA, 0).equals((new IDVariant("U")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "TipoDiTipoStampaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Finanziamento Tipo Variazione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Per Finanziamento Tipo Variazione Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "VariazioniPerFinanziamentoTipoVariazioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Voce Peg Group Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_VARPERUNIORG_SEC_VOCPEGGROHEA_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce Peg Group Header After Formatting Event Body
      // Procedure Body
      // 
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_CAPITOLOART, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_CAPITARTBOR1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_CODICEBIL, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_STANINIZBOR2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_DELIBERBORD1, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_VARINEGABOR2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
      BUK_VARPERUNIORG.set_BoxRect(BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR2, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_VARPERUNIORG.SectionHeight(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "VocePegGroupHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Page Header After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_VARPERUNIORG_SEC_PAGEHEADER_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PAG = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PAG = (new IDVariant("Pag. ", IDVariant.STRING));
      // 
      // Page Header After Formatting Event Body
      // Procedure Body
      // 
      if (BUK_VARPERUNIORG.GetTotalPagesNumberConf())
      {
        if (BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA").compareTo(UOCORRENTE, true)!=0)
        {
          PAGHEAAFFOEV_CFASELINT100();
          if (!IMDB.Eof(IMDBDef12.QRY_CFASELINT100, 0))
          {
            PAGINETOTALI = IMDB.Value(IMDBDef12.QRY_CFASELINT100, IMDBDef12.QSL_CFASELINT100_PAGINETOTALI, 0, IDVariant.INTEGER) ;
          }
          PAGINACORREN = (new IDVariant(1));
          UOCORRENTE = BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA");
          BUK_VARPERUNIORG.set_SpanText(BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PAG, IDL.ToString(PAGINACORREN)), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString(PAGINETOTALI)).stringValue());
        }
        else
        {
          PAGINACORREN = IDL.Add(PAGINACORREN, (new IDVariant(1)));
          BUK_VARPERUNIORG.set_SpanText(BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PAG, IDL.ToString(PAGINACORREN)), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString(PAGINETOTALI)).stringValue());
        }
      }
      else
      {
        if (BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA").compareTo(UOCORRPRIPAS, true)!=0)
        {
          PAGINACORREN = (new IDVariant(1));
          PAGHEAAFFOEV_PAGIINSEVALU();
          UOCORRPRIPAS = BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA");
        }
        else
        {
          PAGINACORREN = IDL.Add(PAGINACORREN, (new IDVariant(1)));
          PAGHEAAFFOEV_PAGIUPDAROWS();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioni", "PageHeaderAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void PAGHEAAFFOEV_CFASELINT100() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.QRY_CFASELINT100);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAGINAZIONE1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAGINAZIONE1, 0))
    {
      if (IMDB.Value(IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINEUO, 0).equals(BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA"), true))
      {
        IMDB.TblAddNew(IMDBDef12.QRY_CFASELINT100, 0);
        IMDB.TblLinkRow(IMDBDef12.QRY_CFASELINT100, 0, IMDBDef4.TBL_PAGINAZIONE1, 0);
        IMDB.TblLinkField(IMDBDef12.QRY_CFASELINT100, 0, 0, IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINETOTALI, 0);
      }
      IMDB.TblMoveNext(IMDBDef4.TBL_PAGINAZIONE1, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAGINAZIONE1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAGINAZIONE1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.QRY_CFASELINT100, 0);
  }

  // **********************************************************************
  // Paginazione: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void PAGHEAAFFOEV_PAGIINSEVALU() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef4.TBL_PAGINAZIONE1, 0);
    IMDB.set_Value(IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINEUO, 0, BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA"));
    IMDB.set_Value(IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINETOTALI, 0, PAGINACORREN);
  }

  // **********************************************************************
  // Paginazione: Update rows
  // Why are you updating these data?
  // **********************************************************************
  private void PAGHEAAFFOEV_PAGIUPDAROWS() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAGINAZIONE1, 0);
    while (!IMDB.Eof(IMDBDef4.TBL_PAGINAZIONE1, 0))
    {
      if (IMDB.Value(IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINEUO, 0).equals(BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA"), true))
      {
      IMDB.set_Value(IMDBDef4.TBL_PAGINAZIONE1, IMDBDef4.FLD_PAGINAZIONE1_PAGINETOTALI, 0, PAGINACORREN);
      }
      IMDB.TblMoveNext(IMDBDef4.TBL_PAGINAZIONE1, 0);
    }
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAGINAZIONE1, 0);
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCOVARIAZ_PARAMETRI509() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI509_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI334, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI334, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI509_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI509_RS, 0, IMDBDef4.TBL_PARAMETRI334, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 0, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMVABIPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 1, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 2, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 3, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 4, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 5, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 6, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 7, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 8, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 9, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 10, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 11, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 12, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 13, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 14, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMDESVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 15, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPMOT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 16, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPIMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI509_RS, 17, 0, IMDBDef4.TBL_PARAMETRI334, IMDBDef4.FLD_PARAMETRI334_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI334, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI334, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI334, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI509_RS, 0);
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
  private void PAN_ELENCOVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOVARIAZ, Cancel);
    // Stub
  }

  private void PAN_ELENCOVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ELENCOVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ELENCOVARIAZ_TIPOSTAMPA)
      {
        PFL_ELENCOVARIAZ_TIPOSTAMPA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ELENCOVARIAZ_TIPOVARIAZIO)
      {
        PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_VARPERUNIORG_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_VARPERUNIORG_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_VARPERUNIORG_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_PAGEHEADER)
    {
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_EVIERNVEVEVD, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elenco Variazioni")), (new IDVariant(" "))), ((IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEVARIA, 0).equals((new IDVariant("D"))))?(new IDVariant("Definitive")):(new IDVariant("Provvisorie")))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP, 0).equals((new IDVariant("CO")))? new IDVariant("Competenza") : IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMTIPIMP, 0).equals((new IDVariant("CA")))? new IDVariant("Cassa") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("dal"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEDAL, 0))), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI509, IMDBDef12.PQSL_PARAMETRI509_ROWNAMEAL, 0))), (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" ")))));
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_TODAY, new IDVariant(IDL.Today()));
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_PROUNIORGRHE)
    {
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_SUDDIUNITSU1, new IDVariant(IDL.Add(IDL.Add(((BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RECSUDUNISUP").equals((new IDVariant())))?(new IDVariant()):BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RECSUDUNISUP")), ((BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RESPSUDD").equals((new IDVariant())))?(new IDVariant()):(new IDVariant(" - Resp. ")))), BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RESPSUDD"))));
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_SUDDIUNITSUP, new IDVariant(IDL.Add(IDL.Add(((BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "PROGR_UNITA_ORGANIZZATIVA").equals((new IDVariant())))?(new IDVariant()):BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RECORDESCRUO")), ((BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RESPUO").equals((new IDVariant())))?(new IDVariant()):(new IDVariant(" - Resp. ")))), BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RESPUO"))));
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_ESGROUPHEADE)
    {
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_PARTE, new IDVariant(((BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_VOCPEGGROFOO)
    {
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_VPGFSRVPEVVP, new IDVariant(BUK_VARPERUNIORG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARPERUNIORG_SEC_VOCPEGGROFOO,"RECOVARIPOSI")));
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_VPGFSRVNEVVP, new IDVariant(BUK_VARPERUNIORG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARPERUNIORG_SEC_VOCPEGGROFOO,"RECOVARINEGA")));
      BUK_VARPERUNIORG.set_SpanValue(BUK_VARPERUNIORG_SPAN_RSIEVVPUOVPG, new IDVariant(IDL.Sub(IDL.Add(BUK_VARPERUNIORG.GetReportColumn(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "RECOSTANINIZ"), BUK_VARPERUNIORG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARPERUNIORG_SEC_VOCPEGGROFOO,"RECOVARIPOSI")), BUK_VARPERUNIORG.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_VARPERUNIORG_SEC_VOCPEGGROFOO,"RECOVARINEGA"))));
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_ESGROUPFOOTE)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_PROUNIORGRFO)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_VARPERUNIORG_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_VARPERUNIORG_SEC_PAGEHEADER)
    {
      BUK_VARPERUNIORG_SEC_PAGEHEADER_OnAfterFormattingSection();
    }
    if (SectionID==BUK_VARPERUNIORG_SEC_VOCPEGGROHEA)
    {
      BUK_VARPERUNIORG_SEC_VOCPEGGROHEA_OnAfterFormattingSection();
    }
  }

  private void BUK_VARPERUNIORG_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_VARPERUNIORG_MST_VARPERUNORPA)
    {
    }
  }

  private void BUK_VARPERUNIORG_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_VARPERUNIORG_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_VARPERUNIORG_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_VARPERUNIORG_OnPreview()
  {
    PreviewBook = BKW_VARPERUNIORG;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOVARIAZ_Init()
  {

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "B7327286-1A6B-4DAE-9A7B-0D9452189F03");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "Tipo Di Stampa");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.PANEL_LIST, 0, -9999, 68, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.PANEL_FORM, 12, 7, 332, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0, 85);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "B5A3FF1A-70CF-4EB5-A262-F99C53243AE0");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "Parte");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 72, -9999, 72, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 348, 7, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0, 31);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "EE8E9638-44B2-480F-A4A1-34BF76931C74");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "Tipo Importo");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 12, 59, 332, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0, 74);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "2EA50229-4C11-4AF9-8B8A-797D7C7AE7F9");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 348, 59, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 55);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "45611481-E13D-492B-A5A2-E6D947AA52A2");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "Periodo di Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.PANEL_LIST, 344, -9999, 200, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.PANEL_FORM, 348, 111, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0, 118);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "85C15599-99B6-4A01-B6C0-42BE9992DAF9");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 12, 187, 564, 61, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_FIELD, 31);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "D657DFA4-A624-4848-8E6F-23F26394BF1D");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "Tipo Stampa");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "4E0583E9-A97C-453E-85F8-C036E4722AA4");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "Parte");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, "B9B04D87-CEA6-4A71-A4B3-AC0D8FDFD899");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, "6DE6537A-FCEC-4B62-930C-417566269DB1");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, "526224C6-6C20-4E0A-94A8-A3644C6C6FF8");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, "Tipo Importo");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "F051EFF3-4C2C-4DFA-B9AA-9137F662A5DC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "D079F704-E390-49C4-A591-6D758B70ADF7");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "4BD7F267-CCD6-4D02-A7DF-E7FD3599DEBD");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "DE691C09-DEF1-49AA-82E0-E025A4B5061C");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "Tipo Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "B79EF42D-DF91-4DB4-A459-C0FE101796E7");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "Dal");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "A1D67E41-61E4-4D18-B44A-3E12B9A228D1");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "Al");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, "A5E5BF9F-E9D3-4039-A754-5AB080B1D5B5");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, "AFA0CC83-FF31-4A19-8066-D7323CB45C87");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "D303DCC6-E8DB-44BD-AB8A-529800DCE074");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "92BF0DDD-2AD7-4387-A8BF-AB4D3A7BED1D");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "Ordinamento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "1E3D380C-018F-45C7-BF61-33DC74742A3C");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "BB98AD0D-0FB6-4106-837E-B0F44C9D30BE");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "52B00FF1-6EE4-4000-A7E1-EA03F036D97F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "Numero Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "CDB11EDF-0FC8-4099-8916-DA45B6F9959B");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "5A84058E-DB81-4FCA-84C1-6EDA86C4778E");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "Anno Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "B05EB693-B76E-4A9A-BC60-ADDD3A5D6E5B");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "490DDD29-C2B0-4E2A-BF9D-E7ED8EDAA2BC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "0E371D3D-3F60-4BE0-8FAE-A930C7E33EB7");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "2D9E0744-1811-41E6-B521-0B536C35F001");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "Numero Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "7246E906-6C88-4B3B-AA20-07DCADB99248");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "DB8A66EF-452F-48CC-AF2D-E69C2CAA7186");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "Anno Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "FF457D73-0DA8-41CD-9513-97264C18276E");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "99E68C68-91D7-4641-87AE-AF92D93B6E5A");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "6EC18CE0-ABDC-41F7-BAB4-9038E90FA6B1");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "Elabora");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0, "button1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "74068A3D-5095-49B2-908C-DF3EFA6652CC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "C91ECBA0-9719-4832-8842-19876EB5BBE3");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tp. Stam.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 16, 32, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tp. Stam.");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOSTAMPA, -1, GRP_ELENCOVARIAZ_TIPODISTAMPA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOSTAMPA, PPQRY_PARAMETRI509, "A.ROWNAMTIPSTA", "ROWNAMTIPSTA", 12, 1, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOSTAMPA, (new IDVariant("B")), "Per Bilancio/P.e.g.", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOSTAMPA, (new IDVariant("U")), "Per Unità Org.", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 72, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 368, 32, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PARTE, -1, GRP_ELENCOVARIAZ_PARTE);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PARTE, PPQRY_PARAMETRI509, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 372, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 352, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE1, -1, GRP_ELENCOVARIAZ_PARTE);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_LIST, 200, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_FORM, 16, 92, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE7, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE7, -1, GRP_ELENCOVARIAZ_TIPOIMPORTO);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE7, -1, "", "NEWPANELABE7", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 36, 84, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOIMPORTO, -1, GRP_ELENCOVARIAZ_TIPOIMPORTO);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOIMPORTO, PPQRY_PARAMETRI509, "A.ROWNAMTIPIMP", "ROWNAMTIPIMP", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOIMPORTO, (new IDVariant("CO")), "Competenza", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOIMPORTO, (new IDVariant("CA")), "Cassa", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 384, 84, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_VARIAZIONI, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_VARIAZIONI, PPQRY_PARAMETRI509, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 352, 88, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 16, 116, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, PPQRY_PARAMETRI509, "A.ROWNAMTIPMOT", "ROWNAMTIPMOT", 5, 3, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 24, 140, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOVARIAZIO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOVARIAZIO, PPQRY_PARAMETRI509, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 352, 136, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DAL, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DAL, PPQRY_PARAMETRI509, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 440, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 20);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 468, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 20);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_AL, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_AL, PPQRY_PARAMETRI509, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 308, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 352, 136, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE6, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE6, -1, "", "NEWPANELABE6", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 384, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 356, 144, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF1, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 12, 164, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DETTAGCAPITO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DETTAGCAPITO, PPQRY_PARAMETRI509, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 272, 164, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ORDINAMENTO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ORDINAMENTO, PPQRY_PARAMETRI509, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 3, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_ORDINAMENTO, (new IDVariant("CAP")), "Capitolo", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_ORDINAMENTO, (new IDVariant("SBC")), "Struttura Bilancio-Capitolo", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 16, 224, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DELIBERA, PPQRY_PARAMETRI509, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 116, 224, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 136, 224, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMERODELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMERODELIBE, PPQRY_PARAMETRI509, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 176, 224, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRADELIBER, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 196, 224, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNODELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNODELIBERA, PPQRY_PARAMETRI509, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 236, 228, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELDELI, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 260, 224, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PROPOSTA, PPQRY_PARAMETRI509, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 436, 224, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 456, 224, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMEROPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMEROPROPOS, PPQRY_PARAMETRI509, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 496, 224, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 516, 224, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNOPROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNOPROPOSTA, PPQRY_PARAMETRI509, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 556, 228, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELPROP, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 564, 212, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 496, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ELABORA, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 4, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DESCRIVARIAZ, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DESCRIVARIAZ, PPQRY_PARAMETRI509, "A.ROWNAMDESVAR", "ROWNAMDESVAR", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DESCRIVARIAZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DESCRIVARIAZ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 4, 320, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_VARIABILAPEG, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_VARIABILAPEG, PPQRY_PARAMETRI509, "A.ROWNAMVABIPE", "ROWNAMVABIPE", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("P")), "P.e.g", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("SI")), "Bilancio", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("PB")), "Entrambe", "", "", -1);
  }

  private void PAN_ELENCOVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPMOT~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPMOT~~ = '-1') ");
    SQL.append("order by 1 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_TIPIMOTIVBIL, 0, SQL, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_TIPIMOTIVBIL, 1, SQL, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_TIPIMOTIVBIL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPVAR~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 0, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 1, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOVARIAZ.SetIMDB(IMDB, "PQRY_PARAMETRI509", true);
    PAN_ELENCOVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENCOVARIAZ.SetQueryIMDB(PPQRY_PARAMETRI509, IMDBDef12.PQRY_PARAMETRI509_RS, IMDBDef4.TBL_PARAMETRI334);
    JustLoaded = true;
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOSTAMPA, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPSTA);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PARTE, IMDBDef4.FLD_PARAMETRI334_ROWNAMEPARTE);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOIMPORTO, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPIMP);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_VARIAZIONI, IMDBDef4.FLD_PARAMETRI334_ROWNAMEVARIA);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPMOT);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI334_ROWNAMTIPVAR);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DAL, IMDBDef4.FLD_PARAMETRI334_ROWNAMEDAL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_AL, IMDBDef4.FLD_PARAMETRI334_ROWNAMEAL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DETTAGCAPITO, IMDBDef4.FLD_PARAMETRI334_ROWNAMDETCAP);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ORDINAMENTO, IMDBDef4.FLD_PARAMETRI334_ROWNAMEORDIN);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DELIBERA, IMDBDef4.FLD_PARAMETRI334_ROWNAMSEDDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PROPOSTA, IMDBDef4.FLD_PARAMETRI334_ROWNAMUNIPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI334_ROWNAMNUMPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI334_ROWNAMANNPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DESCRIVARIAZ, IMDBDef4.FLD_PARAMETRI334_ROWNAMDESVAR);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_VARIABILAPEG, IMDBDef4.FLD_PARAMETRI334_ROWNAMVABIPE);
    PAN_ELENCOVARIAZ.SetMasterTable(0, "PARAMETRI334");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOVARIAZ.iUseListQBE;
      PAN_ELENCOVARIAZ.iUseListQBE = 0;
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_VARPERUNIORG_MST_VARPERUNORPA_Init()
  {
    BUK_VARPERUNIORG.InitMastro(BUK_VARPERUNIORG_MST_VARPERUNORPA, 3, 21000, 29700, 1, 2, 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_MST_VARPERUNORPA, "E8CD4391-DFFD-44F6-BD39-9B31B811F4D5");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_MST_VARPERUNORPA, "VARPERUNORPA");
    BUK_VARPERUNIORG.InitMastroBox(BUK_VARPERUNIORG_MST_VARPERUNORPA, BUK_VARPERUNIORG_RPTBOX_PAGEBODY, 1100, 500, 27700, 19700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_PAGEBODY, "B538119D-D72B-46C4-B67E-6C931FBEAD7E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_VARPERUNIORG_RPT_VARPERUNORRE_InitQuery() { BUK_VARPERUNIORG_RPT_VARPERUNORRE_InitQuery(true, true); }
  private void BUK_VARPERUNIORG_RPT_VARPERUNORRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", to_number(NULL), NULL, DECODE(SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_UNITA_ORGANIZZATIVA ,TRUNC( SYSDATE )), NULL, NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_UNITA_ORGANIZZATIVA ,TRUNC( SYSDATE )),TRUNC( SYSDATE )))) as RECSUDUNISUP, ");
      SQL.append("  GET_RESP_UNICO_RUOLO_UO(SO4_UTIL.get_area_unita(" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", A.PROGR_UNITA_ORGANIZZATIVA ,TRUNC( SYSDATE ))) as RESPSUDD, ");
      SQL.append("  GET_RESP_UNICO_RUOLO_UO(A.PROGR_UNITA_ORGANIZZATIVA) as RESPUO, ");
      SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
      SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as RECORDESCRUO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as RECORVOCEPEG, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  B.MISSIONE_TITOLO || B.PROGRAMMA_TIPOLOGIA || B.TITOLO ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
      SQL.append("where (B.ESERCIZIO = D.ESERCIZIO) ");
      SQL.append("and   (B.E_S = D.E_S) ");
      SQL.append("and   (B.CAPITOLO = D.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = D.ARTICOLO) ");
      SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append("and   ((B.ESERCIZIO BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
      SQL.append(") as RECORCODIBIL, ");
      SQL.append("  D.DESCRIZIONE as RECORCAPDESC, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', E.STN_INI_CO, DECODE(D.CAPITOLO, 9999999999999998, E.STN_INI_CO, NVL(E.STN_INI_CA, 0))) + DECODE(~~TBL_PARAMETRI334.ROWNAMEVARIA~~, 'P', DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', E.VARIAZIONI_CO, DECODE(D.CAPITOLO, 9999999999999998, E.VARIAZIONI_CO, NVL(E.VARIAZIONI_CA, 0))), NVL(STNVAR_AL_UO(A.E_S,A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,A.PROGR_UNITA_ORGANIZZATIVA,~~TBL_PARAMETRI334.ROWNAMDAGIPR~~,NVL(~~PQRY_PARAMETRI509.ROWNAMANNDEL~~, -1),NVL(~~PQRY_PARAMETRI509.ROWNAMNUMDEL~~, -1),NVL(~~PQRY_PARAMETRI509.ROWNAMSEDDEL~~, ' '),NVL(~~TBL_PARAMETRI334.ROWNAMTIPVAR~~, -1),NVL(~~PQRY_PARAMETRI509.ROWNAMANNPRO~~, -1),NVL(~~PQRY_PARAMETRI509.ROWNAMNUMPRO~~, -1),NVL(~~PQRY_PARAMETRI509.ROWNAMUNIPRO~~, ' '),~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~), 0)) as RECOSTANINIZ, ");
      SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
      SQL.append("  F.D_DATA_DEL as D_DATA_DEL, ");
      SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
      SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
      SQL.append("  CASE WHEN (F.SEDE_DEL IS NULL) THEN '' ELSE F.SEDE_DEL || ' - ' || TO_CHAR ( F.NUMERO_DEL ) || ' / ' || TO_CHAR ( F.ANNO_DEL ) END as DELIBERA, ");
      SQL.append("  DECODE(SIGN(DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', A.IMPORTO, DECODE(D.CAPITOLO, 9999999999999998, A.IMPORTO, NVL(A.IMPORTO_CASSA, 0)))), 1, DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', A.IMPORTO, DECODE(D.CAPITOLO, 9999999999999998, A.IMPORTO, NVL(A.IMPORTO_CASSA, 0))), 0) as RECOVARIPOSI, ");
      SQL.append("  DECODE(SIGN(DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', A.IMPORTO, DECODE(D.CAPITOLO, 9999999999999998, A.IMPORTO, NVL(A.IMPORTO_CASSA, 0)))), -1, ABS(DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', A.IMPORTO, DECODE(D.CAPITOLO, 9999999999999998, A.IMPORTO, NVL(A.IMPORTO_CASSA, 0)))), 0) as RECOVARINEGA, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~, 'CO', A.IMPORTO, DECODE(D.CAPITOLO, 9999999999999998, A.IMPORTO, NVL(A.IMPORTO_CASSA, 0))) as IMPORTO, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  CASE WHEN C.MACRO_LIV_5_STR <> '0' THEN C.MACRO_LIV_5_STR ELSE C.MACRO_LIV_4_STR END ");
      SQL.append("from ");
      SQL.append("  VISTA_CODIFICHE_CAP C ");
      SQL.append("where (C.ESERCIZIO = D.ESERCIZIO) ");
      SQL.append("and   (C.E_S = D.E_S) ");
      SQL.append("and   (C.CAPITOLO = D.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = D.ARTICOLO) ");
      SQL.append(") as CODPIANOCONT, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI509.ROWNAMEORDIN~~, 'CAP', LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR('0', 1, 1)), ( ");
      SQL.append("select ");
      SQL.append("  H.MISSIONE_TITOLO || H.PROGRAMMA_TIPOLOGIA || H.TITOLO ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP H ");
      SQL.append("where (H.ESERCIZIO = D.ESERCIZIO) ");
      SQL.append("and   (H.E_S = D.E_S) ");
      SQL.append("and   (H.CAPITOLO = D.CAPITOLO) ");
      SQL.append("and   (H.ARTICOLO = D.ARTICOLO) ");
      SQL.append("and   (H.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append("and   ((H.ESERCIZIO BETWEEN H.ESERCIZIO_INIZIO AND H.ESERCIZIO_SCADENZA)) ");
      SQL.append(")) as RECORDORDINA, ");
      SQL.append("  A.ANNO_PROPOSTA as RECVARANNPR1, ");
      SQL.append("  A.UNITA_PROPONENTE as RECVARUNIPR1, ");
      SQL.append("  A.NUMERO_PROPOSTA as RECVARNUMPR1, ");
      SQL.append("  CASE WHEN (A.UNITA_PROPONENTE IS NULL) THEN '' ELSE A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA ) END as PROPOSTA ");
      SQL.append("from ");
      SQL.append("  VARIAZIONI A, ");
      SQL.append("  CAP D, ");
      SQL.append("  BIL E, ");
      SQL.append("  DEL F, ");
      SQL.append("  T54 G ");
      SQL.append("where (E.ARTICOLO(+) = D.ARTICOLO) ");
      SQL.append("and   (E.CAPITOLO(+) = D.CAPITOLO) ");
      SQL.append("and   (E.E_S(+) = D.E_S) ");
      SQL.append("and   (E.ESERCIZIO(+) = D.ESERCIZIO) ");
      SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
      SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI334.ROWNAMEVARIA~~) ");
      SQL.append("and   ((A.D_DATA_REG BETWEEN ~~TBL_PARAMETRI334.ROWNAMEDAL~~ AND ~~TBL_PARAMETRI334.ROWNAMEAL~~)) ");
      SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI334.ROWNAMEPARTE~~, 'ES', A.E_S, ~~TBL_PARAMETRI334.ROWNAMEPARTE~~)) ");
      SQL.append("and   (NVL(A.SEDE_DEL, '-1') = NVL(~~TBL_PARAMETRI334.ROWNAMSEDDEL~~, NVL(A.SEDE_DEL, '-1'))) ");
      SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(~~TBL_PARAMETRI334.ROWNAMNUMDEL~~, NVL(A.NUMERO_DEL, -1))) ");
      SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(~~TBL_PARAMETRI334.ROWNAMANNDEL~~, NVL(A.ANNO_DEL, -1))) ");
      SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~TBL_PARAMETRI334.ROWNAMUNIPRO~~, NVL(A.UNITA_PROPONENTE, '-1'))) ");
      SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~TBL_PARAMETRI334.ROWNAMNUMPRO~~, NVL(A.NUMERO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~TBL_PARAMETRI334.ROWNAMANNPRO~~, NVL(A.ANNO_PROPOSTA, -1))) ");
      SQL.append("and   (NVL(A.TIPO_VAR, -1) = DECODE(~~TBL_PARAMETRI334.ROWNAMTIPVAR~~, -1, NVL(A.TIPO_VAR, -1), ~~TBL_PARAMETRI334.ROWNAMTIPVAR~~)) ");
      SQL.append("and   ((NVL(A.IMPORTO, 0) <> 0 AND ~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~ = 'CO') OR (~~PQRY_PARAMETRI509.ROWNAMTIPIMP~~ = 'CA' AND NVL(A.IMPORTO_CASSA, 0) <> 0)) ");
      SQL.append("and   (D.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (D.E_S = A.E_S) ");
      SQL.append("and   (D.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (F.ANNO_DEL(+) = A.ANNO_DEL) ");
      SQL.append("and   (F.NUMERO_DEL(+) = A.NUMERO_DEL) ");
      SQL.append("and   (F.SEDE_DEL(+) = A.SEDE_DEL) ");
      SQL.append("and   (G.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (NVL(G.TIPOLOGIA, '-1') = DECODE(NVL(~~PQRY_PARAMETRI509.ROWNAMTIPMOT~~, '-1'), '-1', NVL(G.TIPOLOGIA, '-1'), ~~PQRY_PARAMETRI509.ROWNAMTIPMOT~~)) ");
      SQL.append("order by 4, 6, 7, 23 ");
      BUK_VARPERUNIORG.SetReportQuery(BUK_VARPERUNIORG_RPT_VARPERUNORRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7ABE505F-2AFF-4B78-A4F8-F483AAC105DE");
      if (BUK_VARPERUNIORG.FindObjByID(BUK_VARPERUNIORG_SEC_PROUNIORGRHE) != null)
        BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, "PROGR_UNITA_ORGANIZZATIVA");
      if (BUK_VARPERUNIORG.FindObjByID(BUK_VARPERUNIORG_SEC_ESGROUPHEADE) != null)
        BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, "E_S");
      if (BUK_VARPERUNIORG.FindObjByID(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA) != null)
        BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_VARPERUNIORG_RPT_VARPERUNORRE_Init()
  {
    BUK_VARPERUNIORG.InitReport(BUK_VARPERUNIORG_RPT_VARPERUNORRE, 196865);
    BUK_VARPERUNIORG_RPT_VARPERUNORRE_InitQuery(true, false);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "BA9FF657-CD2C-4753-AF11-22E98055307D");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPT_VARPERUNORRE, "VARPERUNORRE");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_REPORTHEADER, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_REPORTHEADER, "183ED9E2-1B00-468A-AA04-B477DED97D9F");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_PAGEHEADER, 2900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_PAGEHEADER, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_PAGEHEADER, "3478B53B-83C9-430E-A7AA-2C28D92A0B26");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PAGEHEADER, BUK_VARPERUNIORG_RPTBOX_LOGO, 100, 100, 7500, 1900, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_LOGO, "3E08B459-ACEB-48A9-9A13-70B61D6DD952");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_LOGO, "LOGO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PAGEHEADER, BUK_VARPERUNIORG_RPTBOX_PAGEHEADER, 0, 2200, 27600, 700, 0, 3, 1, MyGlb.VIS_HEASENBOFO12, 983041, 518, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_PAGEHEADER, "6318C7FF-8047-4B1B-9D02-C51300ECD4CD");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_PAGEHEADER, BUK_VARPERUNIORG_SPAN_EVIERNVEVEVD, MyGlb.VIS_HEASENBOFO12, 5, 539, 0, 271384705, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_EVIERNVEVEVD, "0BCD0B0E-2034-4302-996A-95F95CDFD694");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_EVIERNVEVEVD, "EVIERNVEVEVD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PAGEHEADER, BUK_VARPERUNIORG_RPTBOX_NUMEROPAGIN1, 25400, 0, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_NUMEROPAGIN1, "0621672F-C3DE-4328-AEB1-0CEE7DE40D0B");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_NUMEROPAGIN1, BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271319169, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, "212D5AC0-3834-4618-A1B1-66EE35F296DE");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PAGEHEADER, BUK_VARPERUNIORG_RPTBOX_DATA, 24800, 600, 2800, 400, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DATA, "4A0B752E-7DD6-4E9A-B707-5FFBF40D1474");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DATA, "DATA");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_DATA, BUK_VARPERUNIORG_SPAN_DATA, MyGlb.VIS_NORMAA8RIGHT, 0, 0, 0, 271319425, "", "del ", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_DATA, "E6DF01F6-64DE-407F-B1C5-3E00EF17A481");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_DATA, "DATA");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_DATA, BUK_VARPERUNIORG_SPAN_TODAY, MyGlb.VIS_NORMAA8RIGHT, 6, 0, 0, 271384705, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_TODAY, "797E4CC0-27F4-40D7-8CDD-CF7654D0E9CA");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_TODAY, "TODAY");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_PROUNIORGRHE, 1300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, "BAAF9F96-B013-40B9-9951-2070206364A7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, "PROUNIORGRHE");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, BUK_VARPERUNIORG_RPTBOX_SUDDIUNITSUP, 100, 0, 27400, 600, 0, 1, 3, MyGlb.VIS_HEASENBOFO12, 983041, 518, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_SUDDIUNITSUP, "73E1CFE2-019F-4C3A-AFFC-0FC68AFD096E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_SUDDIUNITSUP, "SUDDIUNITSUP");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_SUDDIUNITSUP, BUK_VARPERUNIORG_SPAN_SUDDIUNITSU1, MyGlb.VIS_HEASENBOFO12, 5, 297, 0, 271319425, "Suddivisione Unita Sup", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_SUDDIUNITSU1, "1E209510-9877-4295-B355-2FEBF2809FB7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_SUDDIUNITSU1, "SUDDIUNITSU1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, BUK_VARPERUNIORG_RPTBOX_UNITAORG, 100, 600, 27400, 600, 0, 1, 3, MyGlb.VIS_HEASENBOFO12, 983041, 518, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_UNITAORG, "0A1919F2-5603-4CCD-9A19-59A60773280D");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_UNITAORG, "UNITAORG");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_UNITAORG, BUK_VARPERUNIORG_SPAN_SUDDIUNITSUP, MyGlb.VIS_HEASENBOFO12, 5, 297, 0, 271319425, "Suddivisione Unita Sup", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_SUDDIUNITSUP, "AB6C28CE-C70B-45ED-9BFA-C56C94D2E144");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_SUDDIUNITSUP, "SUDDIUNITSUP");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_ESGROUPHEADE, 1700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "E_S");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, "60709DFD-6687-4077-BF2D-313CBF2BAB42");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, "ESGROUPHEADE");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_PARTEHEADER, 100, 0, 1200, 600, 0, 1, 1, MyGlb.VIS_HEASENBOFO12, 983041, 518, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_PARTEHEADER, "ADC99777-217F-4EB3-A0A6-B1262EBA07EC");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_PARTEHEADER, "PARTEHEADER");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_PARTEHEADER, BUK_VARPERUNIORG_SPAN_PARTE1, MyGlb.VIS_HEASENBOFO12, 0, 0, 0, 271384961, "", "Parte", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_PARTE1, "E40ABF55-3DA1-40C7-9C1E-CC58F07D65E6");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_PARTE1, "PARTE1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_PARTE, 1400, 0, 2200, 600, 0, 1, 1, MyGlb.VIS_HEASENBOFO12, 983041, 518, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_PARTE, "76A76275-855F-413C-B7D4-12CAF3F80DAE");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_PARTE, "PARTE");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_PARTE, BUK_VARPERUNIORG_SPAN_PARTE, MyGlb.VIS_HEASENBOFO12, 5, 99, 0, 271319425, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_PARTE, "6BEA57B5-F15F-4C09-AFFA-4948815BA585");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_PARTE, "PARTE");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_CAPITARTHEAD, 0, 700, 3500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPITARTHEAD, "6E97CBB4-4958-4893-8B86-092F2B2FE86D");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CAPITARTHEAD, BUK_VARPERUNIORG_SPAN_C1, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_C1, "E5FF6710-9E8D-413F-A0B3-5B2CD340247F");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_C1, "C1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_CODICBILHEAD, 3500, 700, 1400, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODICBILHEAD, "C45C7A42-9636-489F-82CE-A1D687477EBF");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODICBILHEAD, "CODICBILHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CODICBILHEAD, BUK_VARPERUNIORG_SPAN_C2, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_C2, "40E493E7-F6B4-4DA8-8B88-0EC9CC6A37A7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_C2, "C2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_CAPDESCRHEAD, 7100, 700, 6600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPDESCRHEAD, "C12E4B7A-032E-49CF-AF56-1FB9BB8CA401");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPDESCRHEAD, "CAPDESCRHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CAPDESCRHEAD, BUK_VARPERUNIORG_SPAN_C3, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Descrizione ", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_C3, "3F8ADA43-5233-4019-8026-064F8C56A390");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_C3, "C3");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_STANINIZHEAD, 13700, 700, 2700, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANINIZHEAD, "3A0B0967-A78D-4C59-BCCC-A1585F0F908A");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANINIZHEAD, "STANINIZHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_STANINIZHEAD, BUK_VARPERUNIORG_SPAN_STANZIINIZI1, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Stanziamento Iniziale", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_STANZIINIZI1, "3F07E786-51DC-4124-9E6B-F0A5D2AB4682");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_STANZIINIZI1, "STANZIINIZI1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_DELIBEHEADER, 16400, 700, 3600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DELIBEHEADER, "653E0864-8C45-47A5-9AB7-CB6107ADEC52");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DELIBEHEADER, "DELIBEHEADER");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_DELIBEHEADER, BUK_VARPERUNIORG_SPAN_DELIBERA, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Delibera", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_DELIBERA, "BD4EB58C-CA3E-4CC7-B4D9-7BFB461708AB");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_DELIBERA, "DELIBERA");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_VARIPOSIHEAD, 20000, 700, 2500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIPOSIHEAD, "55D4EB26-E389-4470-B4C7-4D75393F6238");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIPOSIHEAD, "VARIPOSIHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_VARIPOSIHEAD, BUK_VARPERUNIORG_SPAN_STANZIINIZIA, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Variazioni Positive", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_STANZIINIZIA, "8FD2F812-1A4A-422C-A36A-822254A614B1");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_STANZIINIZIA, "STANZIINIZIA");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_VARINEGAHEAD, 22500, 700, 2600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARINEGAHEAD, "9F6DC9E1-240A-4A39-B7A8-EA1D273AB008");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARINEGAHEAD, "VARINEGAHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_VARINEGAHEAD, BUK_VARPERUNIORG_SPAN_VARIAZPOSITI, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Variazioni Negative", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_VARIAZPOSITI, "14095218-A5C2-40B2-8ED4-FDA76FE0CE2E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_VARIAZPOSITI, "VARIAZPOSITI");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_STANDEFIHEAD, 25100, 700, 2600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANDEFIHEAD, "89593A3F-A79D-4E11-BEC5-D85A89D48A04");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANDEFIHEAD, "STANDEFIHEAD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_STANDEFIHEAD, BUK_VARPERUNIORG_SPAN_STANZIDEFINI, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_STANZIDEFINI, "BD2B68F3-1EAB-4E0D-A414-6537CFEA5E63");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_STANZIDEFINI, "STANZIDEFINI");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_NUMEROHEADER, 16500, 1200, 3500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_NUMEROHEADER, "43C7C801-07D0-497A-A088-28400EB510E9");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_NUMEROHEADER, "NUMEROHEADER");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_NUMEROHEADER, BUK_VARPERUNIORG_SPAN_C, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Proposta", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_C, "22CA4C60-DEFB-430B-A41F-A11603457EE3");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_C, "C");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, BUK_VARPERUNIORG_RPTBOX_CODPIANOCONT, 4900, 700, 2200, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODPIANOCONT, "46D8B7A6-2C90-4803-8964-5A2EE0C2B8A0");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODPIANOCONT, "CODPIANOCONT");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CODPIANOCONT, BUK_VARPERUNIORG_SPAN_NUOVASPAN1, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Cod. Piano Conti", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_NUOVASPAN1, "B7E768FF-AC4E-4849-87B9-E6E047DB4B60");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "RECORVOCEPEG");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, "62BB60EE-FA0F-439E-934E-9A36B6348D3B");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_CAPITOLOART, 100, 100, 3300, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPITOLOART, "AF362E0D-DF94-4346-B9E5-63EBA5105536");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CAPITOLOART, BUK_VARPERUNIORG_SPAN_RECAAREVVPUO, MyGlb.VIS_NORMAA8RIGHT, 5, 201, 0, 271384961, "", "::RECORVOCEPEG", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RECAAREVVPUO, "520C7689-933A-4996-A3AB-EEF4AFB6399F");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RECAAREVVPUO, "RECAAREVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_CAPITARTBOR1, 0, 0, 3500, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPITARTBOR1, "FB09C071-3DC2-4DEC-9180-78F708AC471C");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPITARTBOR1, "CAPITARTBOR1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_CODICEBIL, 3600, 100, 1200, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODICEBIL, "1D40137B-7C20-412D-85D0-E500A162443E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODICEBIL, "CODICEBIL");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CODICEBIL, BUK_VARPERUNIORG_SPAN_RECOBIEVVPUO, MyGlb.VIS_NORMALA8LEF1, 5, 7, 0, 271384705, "Cf4web.A GET CODICE CAP (VARIAZIONI ESERCIZIO, VARIAZIONI E S, VARIAZIONI RISORSA INTERVENTO, VARIAZIONI CAPITOLO, VARIAZIONI ARTICOLO)", "::RECORCODIBIL", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RECOBIEVVPUO, "6E62A6CF-600D-4609-AEA0-41183DF17470");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RECOBIEVVPUO, "RECOBIEVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_CODICEBORDO1, 3500, 0, 1400, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO1, "3519AA4C-7500-4006-B895-796A4B2E843E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO1, "CODICEBORDO1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO, 7200, 100, 6400, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO, "7FC4B6DC-15DC-4AEC-B5E0-251EBCEDFE33");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO, "CAPDESCRIZIO");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_CAPDESCRIZIO, BUK_VARPERUNIORG_SPAN_RECADEEVVPUO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384961, "", "::RECORCAPDESC", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RECADEEVVPUO, "04E8EDB8-3ABF-42BA-B4E6-8EE4FF1D257D");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RECADEEVVPUO, "RECADEEVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD1, 7100, 0, 6600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD1, "54E7AD39-E29C-46A3-874E-C6AEB0D999E0");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD1, "DESCRIZBORD1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA, 13800, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA, "EEBA73D4-914C-4830-9B0A-1E35C693AFF0");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA, "STANZIINIZIA");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_STANZIINIZIA, BUK_VARPERUNIORG_SPAN_RESTINEVVPUO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384961, "VISTA BILANCIO UO STN INI CO + If Equal (Param Variazioni, Provvisorie, VISTA BILANCIO UO VARIAZIONI CO, Cf4web.STNVAR AL UO (VARIAZIONI E S, VARIAZIONI ESERCIZIO, VARIAZIONI RISORSA INTERVENTO, VARIAZIONI CAPITOLO, VARIAZIONI ARTICOLO, VARIAZIONI PROGR UNITA ORGANIZZATIVA, Param Dal, ??, ??, ??, ??, ??, ??, ??))", "::RECOSTANINIZ", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RESTINEVVPUO, "92F63E5A-A3A3-4947-960D-66F011A94B8F");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RESTINEVVPUO, "RESTINEVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_STANINIZBOR2, 13700, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANINIZBOR2, "7C5B3478-AB48-4DD6-AFAB-853BC0FAB2BA");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANINIZBOR2, "STANINIZBOR2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_DELIBERBORD1, 16400, 0, 3600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DELIBERBORD1, "F766DCF4-8650-4375-950E-A772AF395436");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DELIBERBORD1, "DELIBERBORD1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR2, 20000, 0, 2500, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR2, "90A2C93D-9ECB-4770-9D3B-F8110281121B");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR2, "VARIPOSIBOR2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_VARINEGABOR2, 22500, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARINEGABOR2, "E240294A-0FDB-420E-9E93-CB483FBC269E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARINEGABOR2, "VARINEGABOR2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR2, 25100, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR2, "2E439B60-A5E0-44B9-8DCC-E486D494B1EB");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR2, "STANDEFIBOR2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, BUK_VARPERUNIORG_RPTBOX_ASD, 5000, 100, 2000, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEF1, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_ASD, "282C56A6-9244-4A5D-B47C-7F87C6BCA3E3");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_ASD, "ASD");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_ASD, BUK_VARPERUNIORG_SPAN_RECOPCEVVPUO, MyGlb.VIS_NORMALA8LEF1, 5, 99, 0, 271384961, "XXX", "::CODPIANOCONT", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RECOPCEVVPUO, "D9EA4C48-E1AB-4494-BAD9-072C1A7795B6");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RECOPCEVVPUO, "RECOPCEVVPUO");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_DETAIL, 1000, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_DETAIL, "B91D7A9B-5617-4FDE-A543-1DDB2039FDEA");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_DETAIL, "DETAIL");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_CAPITARTBORD, 0, 0, 3500, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CAPITARTBORD, "A79E56E0-16A5-4A2F-A86B-12A4820FDF96");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CAPITARTBORD, "CAPITARTBORD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_CODICEBORDO2, 3500, 0, 1400, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO2, "13F82984-1BC0-453C-B250-84383E77EC5B");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO2, "CODICEBORDO2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD2, 7100, 0, 6600, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD2, "783945B8-1BC4-4A12-8C0D-DC379E531A35");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORD2, "DESCRIZBORD2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_STANINIZBOR1, 13700, 0, 2700, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANINIZBOR1, "AAB5CBC4-1B3E-4B2B-BAA6-47386F610E15");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANINIZBOR1, "STANINIZBOR1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_DELIBERBORD2, 16400, 0, 3600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DELIBERBORD2, "3D2F7847-9941-4597-8C56-6C5E89390EE5");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DELIBERBORD2, "DELIBERBORD2");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_VARIAZPOSITI, 20100, 0, 2300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIAZPOSITI, "266D875F-1CCD-4605-B8FF-364D2F0948E6");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIAZPOSITI, "VARIAZPOSITI");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_VARIAZPOSITI, BUK_VARPERUNIORG_SPAN_REVAPOEVVPUO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "If Equal (Sign (VARIAZIONI IMPORTO), Uno, VARIAZIONI IMPORTO, Zero)", "::RECOVARIPOSI", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_REVAPOEVVPUO, "A7EB1D11-12F1-4B51-B4E1-A36741839B48");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_REVAPOEVVPUO, "REVAPOEVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR1, 20000, 0, 2500, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR1, "1B164B58-30B6-4860-B7E5-000811C5EFF7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBOR1, "VARIPOSIBOR1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_VARIAZNEGATI, 22600, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIAZNEGATI, "02E406BE-D279-4DDC-8D18-CBB7E4581F3F");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIAZNEGATI, "VARIAZNEGATI");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_VARIAZNEGATI, BUK_VARPERUNIORG_SPAN_REVANEEVVPUO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "If Equal (Sign (VARIAZIONI IMPORTO), -1, Abs (VARIAZIONI IMPORTO), Zero)", "::RECOVARINEGA", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_REVANEEVVPUO, "65EE2F71-0AD2-45F8-B088-F87F18C44B84");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_REVANEEVVPUO, "REVANEEVVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_VARINEGABOR1, 22500, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARINEGABOR1, "EEA80875-AE06-4113-BD17-D5DDECD524AD");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARINEGABOR1, "VARINEGABOR1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR1, 25100, 0, 2600, 1000, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR1, "D0129C31-85A2-4565-9074-1B06D7DE8DC6");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANDEFIBOR1, "STANDEFIBOR1");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_PROPOSTA1, 16500, 500, 3400, 500, 0, 1, 1, MyGlb.VIS_A8CENTRATO1, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_PROPOSTA1, "A8478E6F-7A20-42FB-82F7-A298371D90D7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_PROPOSTA1, "PROPOSTA1");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_PROPOSTA1, BUK_VARPERUNIORG_SPAN_REPRELVAVPUO, MyGlb.VIS_A8CENTRATO1, 5, 99, 0, 271384961, "", "::PROPOSTA", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_REPRELVAVPUO, "BD5A6B07-0385-44F5-B9AC-9013AA3083B3");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_REPRELVAVPUO, "REPRELVAVPUO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_DETAIL, BUK_VARPERUNIORG_RPTBOX_DELIBERA, 16500, 0, 3400, 500, 0, 1, 1, MyGlb.VIS_A8CENTRATO1, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DELIBERA, "C3359C90-3E34-4C55-BF3A-9025B2FB8BC4");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DELIBERA, "DELIBERA");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_DELIBERA, BUK_VARPERUNIORG_SPAN_REDEELVAVPUO, MyGlb.VIS_A8CENTRATO1, 5, 99, 0, 271384961, "", "::DELIBERA", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_REDEELVAVPUO, "AE6C7EAA-3020-4540-A162-D03E7E0ABCD3");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_REDEELVAVPUO, "REDEELVAVPUO");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORVOCEPEG");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, "FCB94DF8-2A06-4F06-BB4D-0581472C0DF5");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_TOTAVARIPOSI, 20100, 0, 2300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_TOTAVARIPOSI, "FB5DA9FF-0B86-487D-AA11-AFF344FB5023");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_TOTAVARIPOSI, "TOTAVARIPOSI");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_TOTAVARIPOSI, BUK_VARPERUNIORG_SPAN_VPGFSRVPEVVP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_VPGFSRVPEVVP, "CACACBF9-1174-4C93-BE5C-E77757DBE545");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_VPGFSRVPEVVP, "VPGFSRVPEVVP");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_TOTAVARINEGA, 22600, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_TOTAVARINEGA, "4A2E2A86-0048-4A05-AD5E-DB73719606AE");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_TOTAVARINEGA, "TOTAVARINEGA");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_TOTAVARINEGA, BUK_VARPERUNIORG_SPAN_VPGFSRVNEVVP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_VPGFSRVNEVVP, "9ABCEDEE-ED30-4180-A6AA-67A96574D7ED");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_VPGFSRVNEVVP, "VPGFSRVNEVVP");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_STANZIDEFINI, 25200, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANZIDEFINI, "CC8F97D0-DF51-491C-BAFB-4DD814C56A85");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANZIDEFINI, "STANZIDEFINI");
    BUK_VARPERUNIORG.InitBoxSpan(BUK_VARPERUNIORG_RPTBOX_STANZIDEFINI, BUK_VARPERUNIORG_SPAN_RSIEVVPUOVPG, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SPAN_RSIEVVPUOVPG, "FC1A75D7-1D55-4D44-A662-0534C1496558");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SPAN_RSIEVVPUOVPG, "RSIEVVPUOVPG");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_VOCEPEGBORDO, 0, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VOCEPEGBORDO, "8213CE03-6D36-4964-9073-0C35CA0902CD");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VOCEPEGBORDO, "VOCEPEGBORDO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_CODICEBORDO, 3500, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO, "7464B52C-8F74-445E-A1E4-DE473E98A2B7");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_CODICEBORDO, "CODICEBORDO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_DESCRIZBORDO, 7100, 0, 6600, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORDO, "AB891E9D-CAC2-4D44-ACDA-BFB13BF56447");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DESCRIZBORDO, "DESCRIZBORDO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_STANINIZBORD, 13700, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANINIZBORD, "E9F0569B-E4A7-4F45-8874-AD7A0E898181");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANINIZBORD, "STANINIZBORD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_DELIBERBORDO, 16400, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DELIBERBORDO, "6724605B-1850-476C-B6BD-B31B95BE0C58");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DELIBERBORDO, "DELIBERBORDO");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_VARIPOSIBORD, 20000, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_IMPORA8BORDI, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBORD, "5F067292-3B01-4912-8150-F9EA6C6BFDFB");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARIPOSIBORD, "VARIPOSIBORD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_VARINEGABORD, 22500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORA8BORDI, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_VARINEGABORD, "34F52743-A67A-4A13-B933-F2D32292AA8D");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_VARINEGABORD, "VARINEGABORD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_STANDEFIBORD, 25100, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_STANDEFIBORD, "A07E43D5-89B3-47DC-ADA4-70E5957EDA75");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_STANDEFIBORD, "STANDEFIBORD");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_VOCPEGGROFOO, BUK_VARPERUNIORG_RPTBOX_DOPPIOBORDOB, 20000, 400, 5100, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_DOPPIOBORDOB, "150FB6BE-0B23-4E27-BC05-D4CF4F5EAC22");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_DOPPIOBORDOB, "DOPPIOBORDOB");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_ESGROUPFOOTE, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_ESGROUPFOOTE, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_ESGROUPFOOTE, "5BA534B1-C999-4D2E-AC4E-520C654A37CB");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_ESGROUPFOOTE, "ESGROUPFOOTE");
    BUK_VARPERUNIORG.InitReportBox(BUK_VARPERUNIORG_SEC_ESGROUPFOOTE, BUK_VARPERUNIORG_RPTBOX_BARRAFINALE, 0, 0, 27700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_RPTBOX_BARRAFINALE, "90A04C5C-1305-4C44-B0F8-EA19AAC9A13E");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_RPTBOX_BARRAFINALE, "BARRAFINALE");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_PROUNIORGRFO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_PROUNIORGRFO, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_PROUNIORGRFO, "B348849F-7ABF-4A4F-AB7F-74C2E027C107");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_PROUNIORGRFO, "PROUNIORGRFO");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_PAGEFOOTER, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_PAGEFOOTER, "8A9635F9-D01A-4E01-879D-8F6E7979E034");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_VARPERUNIORG.InitSection(BUK_VARPERUNIORG_RPT_VARPERUNORRE, BUK_VARPERUNIORG_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VARPERUNIORG.SetSectionRendersInto(BUK_VARPERUNIORG_SEC_REPORTFOOTER, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
    BUK_VARPERUNIORG.SetRTCGuid(BUK_VARPERUNIORG_SEC_REPORTFOOTER, "96D59512-8030-41B6-A341-434F7AD97865");
    BUK_VARPERUNIORG.SetObjCode(BUK_VARPERUNIORG_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_PROUNIORGRHE, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_ESGROUPHEADE, "E_S");
    BUK_VARPERUNIORG.AddReportGroup(BUK_VARPERUNIORG_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    BUK_VARPERUNIORG_RPT_VARPERUNORRE_InitQuery(false, true);
  }

  private void BUK_VARPERUNIORG_InitLinks()
  {
    BUK_VARPERUNIORG.SetBoxNextBox(BUK_VARPERUNIORG_RPTBOX_PAGEBODY, BUK_VARPERUNIORG_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_VARPERUNIORG) BUK_VARPERUNIORG_OnPreview();
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
