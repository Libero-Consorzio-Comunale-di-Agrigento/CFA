// **********************************************
// Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Cassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_PARTE = 0;
  private static int PFL_PARAMETRI_UNITAORGANIZ = 1;
  private static int PFL_PARAMETRI_TITOLO = 2;
  private static int PFL_PARAMETRI_DATAELABORAZ = 3;
  private static int PFL_PARAMETRI_ETICHEELABOR = 4;

  private static int PPQRY_PARAMETRI434 = 0;

  private static int PPQRY_ANAGUNITORGA = 1;
  private static int PPQRY_VISTTITOTIPO = 2;


  IDPanel PAN_PARAMETRI;
  private static int PFL_CASSA_CAPITOLO = 0;
  private static int PFL_CASSA_ARTICOLO = 1;
  private static int PFL_CASSA_INFOCAP = 2;
  private static int PFL_CASSA_STANZCOMPETE = 3;
  private static int PFL_CASSA_RESIDUINIZIA = 4;
  private static int PFL_CASSA_RESIDUATTUAL = 5;
  private static int PFL_CASSA_ELIMP = 6;
  private static int PFL_CASSA_STANZCASSA = 7;
  private static int PFL_CASSA_MANDATI1 = 8;
  private static int PFL_CASSA_DISPONIBILIT = 9;
  private static int PFL_CASSA_UNITAORG = 10;
  private static int PFL_CASSA_SESSIONEID = 11;
  private static int PFL_CASSA_PROGRESSIVO = 12;
  private static int PFL_CASSA_ETICHECAPITO = 13;
  private static int PFL_CASSA_ES = 14;
  private static int PFL_CASSA_ETICHETTATOT = 15;
  private static int PFL_CASSA_NUOVAESPRESS = 16;

  private static int PPQRY_WRKSITSTNCA1 = 0;


  IDPanel PAN_CASSA;
  private static int PFL_TOTALI_STNCOMP = 0;
  private static int PFL_TOTALI_RESINI = 1;
  private static int PFL_TOTALI_RESATT = 2;
  private static int PFL_TOTALI_STNCASSA = 3;
  private static int PFL_TOTALI_MANDATI = 4;
  private static int PFL_TOTALI_DISP = 5;

  private static int PPQRY_TOTALI3 = 0;


  IDPanel PAN_TOTALI;
  CIDREObj BUK_LIBROCASSA;
  OBook BKW_LIBROCASSA;
  //
  // Template Pages constants
  private static int BUK_LIBROCASSA_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBROCASSA_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBROCASSA_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBROCASSA_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_LIBROCASSA_RPTBOX_CORPOPAGINA = 5;

  //
  // Reports constants
  private static int BUK_LIBROCASSA_RPT_NUOVOREPORT = 6;
  private static int BUK_LIBROCASSA_SEC_INTESTREPORT = 7;
  private static int BUK_LIBROCASSA_SEC_INTESTPAGINA = 8;
  private static int BUK_LIBROCASSA_RPTBOX_CAPITOHEADER = 9;
  private static int BUK_LIBROCASSA_SPAN_C = 10;
  private static int BUK_LIBROCASSA_RPTBOX_STANCOMPHEAD = 11;
  private static int BUK_LIBROCASSA_SPAN_STANZCOMPET1 = 12;
  private static int BUK_LIBROCASSA_RPTBOX_RESIINIZHEAD = 13;
  private static int BUK_LIBROCASSA_SPAN_RESIDUINIZI1 = 14;
  private static int BUK_LIBROCASSA_RPTBOX_RESIATTUHEAD = 15;
  private static int BUK_LIBROCASSA_SPAN_RESIDUATTUA1 = 16;
  private static int BUK_LIBROCASSA_RPTBOX_STANCASSHEAD = 17;
  private static int BUK_LIBROCASSA_SPAN_STANZCASSA1 = 18;
  private static int BUK_LIBROCASSA_RPTBOX_MANORDHEADER = 19;
  private static int BUK_LIBROCASSA_SPAN_IFEQNOPCPEOM = 20;
  private static int BUK_LIBROCASSA_RPTBOX_DISPONHEADER = 21;
  private static int BUK_LIBROCASSA_SPAN_DISPONIBILI1 = 22;
  private static int BUK_LIBROCASSA_RPTBOX_DESUNITUOHEA = 23;
  private static int BUK_LIBROCASSA_SPAN_UNITAORG1 = 24;
  private static int BUK_LIBROCASSA_RPTBOX_TITOLO = 25;
  private static int BUK_LIBROCASSA_SPAN_NUOVASPAN1 = 26;
  private static int BUK_LIBROCASSA_SPAN_TODAY = 27;
  private static int BUK_LIBROCASSA_SPAN_NUOVASPAN2 = 28;
  private static int BUK_LIBROCASSA_SPAN_IFEQNOPCPEES = 29;
  private static int BUK_LIBROCASSA_SEC_DETTAGLIO = 30;
  private static int BUK_LIBROCASSA_RPTBOX_CAPITOLO = 31;
  private static int BUK_LIBROCASSA_SPAN_TSWSSCCCLCTS = 32;
  private static int BUK_LIBROCASSA_RPTBOX_STANZCOMPET1 = 33;
  private static int BUK_LIBROCASSA_SPAN_STANZCOMPETE = 34;
  private static int BUK_LIBROCASSA_RPTBOX_RESIDUINIZIA = 35;
  private static int BUK_LIBROCASSA_SPAN_RESIDUINIZIA = 36;
  private static int BUK_LIBROCASSA_RPTBOX_RESIDUATTUAL = 37;
  private static int BUK_LIBROCASSA_SPAN_RESIDUATTUAL = 38;
  private static int BUK_LIBROCASSA_RPTBOX_STANZCASSA1 = 39;
  private static int BUK_LIBROCASSA_SPAN_STANZCASSA = 40;
  private static int BUK_LIBROCASSA_RPTBOX_MANORD1 = 41;
  private static int BUK_LIBROCASSA_SPAN_MANDATI = 42;
  private static int BUK_LIBROCASSA_RPTBOX_DISPONIBILIT = 43;
  private static int BUK_LIBROCASSA_SPAN_DISPONIBILIT = 44;
  private static int BUK_LIBROCASSA_RPTBOX_DESUNITAUO = 45;
  private static int BUK_LIBROCASSA_SPAN_UNITAORG = 46;
  private static int BUK_LIBROCASSA_SEC_PIEDEREPORT = 47;
  private static int BUK_LIBROCASSA_RPTBOX_STANZCOMPETE = 48;
  private static int BUK_LIBROCASSA_SPAN_PRSWSSCSCCLC = 49;
  private static int BUK_LIBROCASSA_RPTBOX_REISDUINIZIA = 50;
  private static int BUK_LIBROCASSA_SPAN_PRSWSSCRICLC = 51;
  private static int BUK_LIBROCASSA_RPTBOX_RESATTUALI = 52;
  private static int BUK_LIBROCASSA_SPAN_PRSWSSCRACLC = 53;
  private static int BUK_LIBROCASSA_RPTBOX_STANZCASSA = 54;
  private static int BUK_LIBROCASSA_SPAN_PIRSWSSSCCLC = 55;
  private static int BUK_LIBROCASSA_RPTBOX_MANORD = 56;
  private static int BUK_LIBROCASSA_SPAN_PIRSWSSCMCLC = 57;
  private static int BUK_LIBROCASSA_RPTBOX_DISP = 58;
  private static int BUK_LIBROCASSA_SPAN_PIRSWSSCDCLC = 59;
  private static int BUK_LIBROCASSA_RPTBOX_TOT = 60;
  private static int BUK_LIBROCASSA_SPAN_NUOVASPAN = 61;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI440(IMDB);
    Init_TBL_TOTALI2(IMDB);
    //
    //
    Init_PQRY_PARAMETRI434(IMDB);
    Init_PQRY_PARAMETRI434_RS(IMDB);
    Init_PQRY_WRKSITSTNCA1(IMDB);
    Init_PQRY_TOTALI3(IMDB);
    Init_PQRY_TOTALI3_RS(IMDB);
    Init_PQRY_WRKSITSTNCAS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI440(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI440, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI440, "TBL_PARAMETRI440");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI440,IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI440, 0);
  }

  private static void Init_TBL_TOTALI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_TOTALI2, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_TOTALI2, "TBL_TOTALI2");
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM, "NOMOGGSTNCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGRESINI, "NOMOGGRESINI");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGRESINI,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGRESATT, "NOMOGGRESATT");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGRESATT,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS, "NOMOGGSTNCAS");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP, "NOMEOGGEDISP");
    IMDB.SetFldParams(IMDBDef4.TBL_TOTALI2,IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP,3,14,2);
    IMDB.TblAddNew(IMDBDef4.TBL_TOTALI2, 0);
  }

  private static void Init_PQRY_PARAMETRI434(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI434, 4);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI434, "PQRY_PARAMETRI434");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434,IMDBDef13.PQSL_PARAMETRI434_NOMOGGDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI434, 0);
  }

  private static void Init_PQRY_PARAMETRI434_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI434_RS, 4);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI434_RS, "PQRY_PARAMETRI434_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI434_RS,IMDBDef13.PQSL_PARAMETRI434_NOMOGGDATELA,6,10,0);
  }

  private static void Init_PQRY_WRKSITSTNCA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_WRKSITSTNCA1, 15);
    IMDB.set_TblCode(IMDBDef13.PQRY_WRKSITSTNCA1, "PQRY_WRKSITSTNCA1");
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCASEID, "WRSISTCASEID");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCASEID,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAPR, "WRKSITSTCAPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAPR,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA, "WRKSITSTCACA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR, "WRKSITSTCAAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCASTCO, "WRSISTCASTCO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCASTCO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAREIN, "WRSISTCAREIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAREIN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAREAT, "WRSISTCAREAT");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAREAT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTSTCA, "WRKSITSTSTCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTSTCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAMA, "WRKSITSTCAMA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAMA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCADI, "WRKSITSTCADI");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCADI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAUNOR, "WRSISTCAUNOR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAUNOR,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAINCA, "WRSISTCAINCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAINCA,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAES, "WRKSITSTCAES");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAELIM, "WRSISTCAELIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_WRSISTCAELIM,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCA1,IMDBDef13.PQSL_WRKSITSTNCA1_NUOVAESPRESS,1,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_WRKSITSTNCA1, 0);
  }

  private static void Init_PQRY_TOTALI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_TOTALI3, 6);
    IMDB.set_TblCode(IMDBDef13.PQRY_TOTALI3, "PQRY_TOTALI3");
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCOM, "NOMOGGSTNCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGRESINI, "NOMOGGRESINI");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGRESINI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGRESATT, "NOMOGGRESATT");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGRESATT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCAS, "NOMOGGSTNCAS");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMEOGGEMAND,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMEOGGEDISP, "NOMEOGGEDISP");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3,IMDBDef13.PQSL_TOTALI3_NOMEOGGEDISP,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_TOTALI3, 0);
  }

  private static void Init_PQRY_TOTALI3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_TOTALI3_RS, 6);
    IMDB.set_TblCode(IMDBDef13.PQRY_TOTALI3_RS, "PQRY_TOTALI3_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCOM, "NOMOGGSTNCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCOM,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGRESINI, "NOMOGGRESINI");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGRESINI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGRESATT, "NOMOGGRESATT");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGRESATT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCAS, "NOMOGGSTNCAS");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMOGGSTNCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMEOGGEMAND, "NOMEOGGEMAND");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMEOGGEMAND,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMEOGGEDISP, "NOMEOGGEDISP");
    IMDB.SetFldParams(IMDBDef13.PQRY_TOTALI3_RS,IMDBDef13.PQSL_TOTALI3_NOMEOGGEDISP,3,14,2);
  }

  private static void Init_PQRY_WRKSITSTNCAS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_WRKSITSTNCAS, 14);
    IMDB.set_TblCode(IMDBDef13.PQRY_WRKSITSTNCAS, "PQRY_WRKSITSTNCAS");
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCASEID, "WRSISTCASEID");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCASEID,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAPR, "WRKSITSTCAPR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAPR,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCACA, "WRKSITSTCACA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCACA,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAAR, "WRKSITSTCAAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCASTCO, "WRSISTCASTCO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCASTCO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAREIN, "WRSISTCAREIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAREIN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAREAT, "WRSISTCAREAT");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAREAT,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTSTCA, "WRKSITSTSTCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTSTCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAMA, "WRKSITSTCAMA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAMA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCADI, "WRKSITSTCADI");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCADI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAUNOR, "WRSISTCAUNOR");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAUNOR,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAINCA, "WRSISTCAINCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAINCA,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAES, "WRKSITSTCAES");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRKSITSTCAES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAELIM, "WRSISTCAELIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_WRKSITSTNCAS,IMDBDef13.PQSL_WRKSITSTNCAS_WRSISTCAELIM,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_WRKSITSTNCAS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Cassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public Cassa()
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
    FormIdx = MyGlb.FRM_CASSA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E0E279BF-05ED-449B-BD7F-05DDB6933DFD";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1060;
    DesignHeight = 522;
    set_Caption(new IDVariant("Cassa"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1060;
    Frames[1].Height = 496;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.241935;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1060;
    Frames[2].Height = 120;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 120;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "37DC6631-AC4D-471D-95DE-4CC34D12AB7D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 304, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1060;
    Frames[3].Height = 376;
    Frames[3].Caption = "Cassa";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 376;
    PAN_CASSA = new IDPanel(w, this, 3, "PAN_CASSA");
    Frames[3].Content = PAN_CASSA;
    PAN_CASSA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CASSA.VS = MainFrm.VisualStyleList;
    PAN_CASSA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBROCASSA != null)
      PAN_CASSA.SetBook(BUK_LIBROCASSA);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20596097-D237-455A-BFCE-133AD10875A4");
    PAN_CASSA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1116, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CASSA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CASSA.InitStatus = 2;
    PAN_CASSA_Init();
    PAN_CASSA_InitFields();
    PAN_CASSA_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_CASSA.SetSubFrame(PFL_CASSA_ETICHETTATOT,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Totali";
    Frames[4].Parent = this;
    PAN_TOTALI = new IDPanel(w, this, 4, "PAN_TOTALI");
    Frames[4].Content = PAN_TOTALI;
    PAN_TOTALI.Lockable = false;
    PAN_TOTALI.iLocked = false;
    PAN_TOTALI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTALI.VS = MainFrm.VisualStyleList;
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "37ABA1A8-6A13-4859-B3C5-ECED325E9280");
    PAN_TOTALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 448, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTALI.InitStatus = 2;
    PAN_TOTALI_Init();
    PAN_TOTALI_InitFields();
    PAN_TOTALI_InitQueries();
    BKW_LIBROCASSA = new OBook(this);
    BUK_LIBROCASSA = new CIDREObj(BKW_LIBROCASSA);
    BKW_LIBROCASSA.iGuid = "F65D2F0D-5E41-4398-B581-3E68A5A544A0";
    BKW_LIBROCASSA.Code = "BUK_LIBROCASSA";
    BKW_LIBROCASSA.BookObj = BUK_LIBROCASSA;
    BKW_LIBROCASSA.InitDefMasks();
    BUK_LIBROCASSA.InitBook(1, 1245185, "Libro Cassa", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROCASSA.InitHTML();
    BUK_LIBROCASSA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROCASSA.Book.SetMainFrm(MainFrm);
    BUK_LIBROCASSA.SetRTCGuid(0, "F65D2F0D-5E41-4398-B581-3E68A5A544A0");
    BUK_LIBROCASSA.SetObjCode(0, "LIBROCASSA");
    if (PAN_CASSA != null)
      PAN_CASSA.SetBook(BUK_LIBROCASSA);
    BUK_LIBROCASSA_MST_NUOVPAGIMAST_Init();
    BUK_LIBROCASSA_RPT_NUOVOREPORT_Init();
    BUK_LIBROCASSA_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI440, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CASSA_PARAMETRI434();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_TOTALI2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CASSA_TOTALI3();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_CASSA.UpdatePanel(MainFrm);
      PAN_TOTALI.UpdatePanel(MainFrm);
      // BUK_LIBROCASSA.UpdateBook();
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
    if (Code.equals("BUK_LIBROCASSA")) return BUK_LIBROCASSA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Cassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Cassa.class.getName() : (Glb.ClassWithPackage(Cassa.class) ? Cassa.class.getName().substring(Cassa.class.getPackage().getName().length() + 1) : Cassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_CASSA.set_Header(Glb.OBJ_FIELD,PFL_CASSA_MANDATI1, (new IDVariant("Ordinativi")).stringValue());
      }
      else
      {
        PAN_CASSA.set_Header(Glb.OBJ_FIELD,PFL_CASSA_MANDATI1, (new IDVariant("Mandati")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO, 0, (new IDVariant("-1")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Parte Obbligatoria"))); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKSITSTNCASSA(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0), IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMOGGUNIORG, 0), IDL.ToInteger(IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETITO, 0)), IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMOGGDATELA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      PAN_CASSA.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "EtichettaElabora", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA, 0, IDL.Today());
      PAN_CASSA.set_Header(Glb.OBJ_FIELD,PFL_CASSA_ELIMP, (new IDVariant("")).stringValue());
      PAN_CASSA.set_ToolTip(Glb.OBJ_FIELD,PFL_CASSA_ELIMP,(new IDVariant("Elenco Residui")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "Load", _e);
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
      SQL = new StringBuffer();
      SQL.append("delete from WRK_SIT_STN_CASSA ");
      SQL.append("where (SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA, 0, new IDVariant());
  }

  // **********************************************************************
  // Cassa On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CASSA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CASSA);
      // 
      // Cassa On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CASSA.set_ToolTip(Glb.OBJ_FIELD,PFL_CASSA_UNITAORG,(new IDVariant(PAN_CASSA.FieldText(PFL_CASSA_UNITAORG))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "CassaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Cassa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CASSA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Cassa After Find Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESINI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESATT, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      C2 = PAN_CASSA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CASSA.GotoFirst();
      while (!PAN_CASSA.RSEOF())
      {
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM, 0), C2.Get("WRSISTCASTCO")));
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESINI, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESINI, 0), C2.Get("WRSISTCAREIN")));
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESATT, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESATT, 0), C2.Get("WRSISTCAREAT")));
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS, 0), C2.Get("WRKSITSTSTCA")));
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND, 0), C2.Get("WRKSITSTCAMA")));
        IMDB.set_Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP, 0, IDL.Add(IMDB.Value(IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP, 0), C2.Get("WRKSITSTCADI")));
        PAN_CASSA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "CassaAfterFind", _e);
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // El Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ElImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // El Imp Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOGES, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOUTI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR, 0));
        MainFrm.Show(MyGlb.FRM_ELENIMPECASS, (new IDVariant(0)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMUOGESTI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMUOUTILI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCACA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_WRKSITSTNCA1, IMDBDef13.PQSL_WRKSITSTNCA1_WRKSITSTCAAR, 0));
        MainFrm.Show(MyGlb.FRM_ELENACCECASS, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Cassa", "ElImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CASSA_PARAMETRI434() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI434_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI440, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI440, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI434_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI434_RS, 0, IMDBDef4.TBL_PARAMETRI440, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI434_RS, 0, 0, IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI434_RS, 1, 0, IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI434_RS, 2, 0, IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI434_RS, 3, 0, IMDBDef4.TBL_PARAMETRI440, IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI440, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI440, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI440, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI434_RS, 0);
  }

  // **********************************************************************
  // Totali
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CASSA_TOTALI3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_TOTALI3_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_TOTALI2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_TOTALI2, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_TOTALI3_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_TOTALI3_RS, 0, IMDBDef4.TBL_TOTALI2, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 0, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 1, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESINI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 2, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGRESATT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 3, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 4, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_TOTALI3_RS, 5, 0, IMDBDef4.TBL_TOTALI2, IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_TOTALI2, 0);
      if (IMDB.Eof(IMDBDef4.TBL_TOTALI2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_TOTALI2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_TOTALI3_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
  private void PAN_CASSA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CASSA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CASSA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CASSA, Cancel);
    // Stub
  }

  private void PAN_CASSA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CASSA_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_ELIMP)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ElImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CASSA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CASSA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CASSA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TOTALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTALI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTALI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTALI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTALI);
    // Stub
  }

  private void PAN_TOTALI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTALI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TOTALI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBROCASSA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROCASSA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROCASSA_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBROCASSA_SEC_INTESTPAGINA)
    {
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_IFEQNOPCPEOM, new IDVariant(((IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0).equals((new IDVariant("E"))))?(new IDVariant("Ordinativi")):(new IDVariant("Mandati")))));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_TODAY, new IDVariant(IDL.Today()));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_IFEQNOPCPEES, new IDVariant(((IMDB.Value(IMDBDef13.PQRY_PARAMETRI434, IMDBDef13.PQSL_PARAMETRI434_NOMEOGGETTES, 0).equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_LIBROCASSA_SEC_DETTAGLIO)
    {
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_TSWSSCCCLCTS, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_LIBROCASSA.GetReportColumn(BUK_LIBROCASSA_RPT_NUOVOREPORT, "WRKSITSTCACA")), (new IDVariant("/"))), IDL.ToString(BUK_LIBROCASSA.GetReportColumn(BUK_LIBROCASSA_RPT_NUOVOREPORT, "WRKSITSTCAAR")))));
    }
    if (SectionID==BUK_LIBROCASSA_SEC_PIEDEREPORT)
    {
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PRSWSSCSCCLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRSISTCASTCO")));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PRSWSSCRICLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRSISTCAREIN")));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PRSWSSCRACLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRSISTCAREAT")));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PIRSWSSSCCLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRKSITSTSTCA")));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PIRSWSSCMCLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRKSITSTCAMA")));
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_PIRSWSSCDCLC, new IDVariant(BUK_LIBROCASSA.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBROCASSA_SEC_PIEDEREPORT,"WRKSITSTCADI")));
    }
  }

  private void BUK_LIBROCASSA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBROCASSA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROCASSA_MST_NUOVPAGIMAST)
    {
      BUK_LIBROCASSA.set_SpanValue(BUK_LIBROCASSA_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBROCASSA.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBROCASSA.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBROCASSA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROCASSA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROCASSA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROCASSA_OnPreview()
  {
    PreviewBook = BKW_LIBROCASSA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "998A6779-EDB2-4227-9409-05FD3A373E1F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Descrivi il contenuto del campo");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "FF50F1A2-882E-4CAF-8CF3-51E15FD18AB6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, "5496FBBB-97CE-403B-BF12-EF19B82DA58C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, "Titolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "2970A235-2AFB-4EA3-BB44-8568E40B964E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "593B92B3-0735-4602-BFE6-B18435056DED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 56, 8, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTE, PPQRY_PARAMETRI434, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 32, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAORGANIZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAORGANIZ, PPQRY_PARAMETRI434, "A.NOMOGGUNIORG", "NOMOGGUNIORG", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_FORM, 4, 56, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TITOLO, PPQRY_PARAMETRI434, "A.NOMEOGGETITO", "NOMEOGGETITO", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 8, 80, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI434, "A.NOMOGGDATELA", "NOMOGGDATELA", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 352, 92, 116, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 368, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEELABOR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as ANSOANUNODUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGUNIORG~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMOGGUNIORG~~ = -1) ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_PARAMETRI_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as ANSOANUNODUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_PARAMETRI_UNITAORGANIZ, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as VISTITTIPTIT, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DES_TITOLO as VISTITTIPDES ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.TITOLO = ~~NOMEOGGETITO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (~~NOMEOGGETTES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CODICE ), ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL B ");
    SQL.append("where (TO_CHAR ( B.CODICE ) = ~~NOMEOGGETITO~~) ");
    SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (B.LIVELLO = 1) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~NOMEOGGETITO~~ = '-1') ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTTITOTIPO, 0, SQL, PFL_PARAMETRI_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as VISTITTIPTIT, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DES_TITOLO as VISTITTIPDES ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (~~NOMEOGGETTES~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CODICE ), ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL B ");
    SQL.append("where (B.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (B.LIVELLO = 1) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~NOMEOGGETTES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VISTTITOTIPO, 1, SQL, PFL_PARAMETRI_TITOLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VISTTITOTIPO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI434", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI434, IMDBDef13.PQRY_PARAMETRI434_RS, IMDBDef4.TBL_PARAMETRI440);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTE, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETTES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAORGANIZ, IMDBDef4.FLD_PARAMETRI440_NOMOGGUNIORG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TITOLO, IMDBDef4.FLD_PARAMETRI440_NOMEOGGETITO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef4.FLD_PARAMETRI440_NOMOGGDATELA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI440");
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

  private void PAN_CASSA_Init()
  {

    PAN_CASSA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CASSA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CASSA.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, "2ADA1A2D-C2C6-4438-A58A-B11BE1B1BF9F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, "CAPITOLO");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, "4885D600-EA1B-448C-9BE9-30E85D0D8C64");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, "ARTICOLO");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, "AE7660DC-793C-4152-BE20-AF5520C334AE");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, "Info Cap");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, "96284349-169D-4DF8-9443-3B3EC4792CA9");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, "Stanz. Competenza");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, "EF525C86-3FDC-4138-9DE2-FBCB9F7C304C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, "Residui Iniziali");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, "DB04E54E-522D-4105-B3D1-44714CBFB737");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, "Residui Attuali");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, "2EE52129-1C54-4C62-B459-84933B778406");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, "El Imp");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, "972BA654-5961-4204-A4A0-EA32C64CBBA4");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, "Stanz. Cassa");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, "7F77ECB0-24DE-45C1-BF32-797D1449A5E8");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, "Mandati");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, "9377C689-7026-4995-A779-1FF04BD4E5B1");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, "Disponibilità");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, "896F7F64-A695-4B99-B6F0-D77D96F811D5");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, "Unità Org.");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, "7EED95FA-A69C-47C5-A23A-C48B21D37B11");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, "SESSIONE ID");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, "54B4875D-70A6-462A-AB60-7C6E2CEC7AD4");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, "PROGRESSIVO");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, "599B8E4C-2C34-49E8-8AB2-2C1D27F810FE");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, "Capitolo");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ES, "D998C0A1-0866-4822-A3C7-C350D4282538");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ES, "E S");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_ES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, "AAFF35C4-773A-4CF3-828F-4FFB009B88BD");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, "tot");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.VIS_LABELFIELD);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, "5DA29554-CD5B-442B-8B1F-0C4F20ECCEAA");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, "Nuova Espressione");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CASSA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_CASSA.SetFieldPage(PFL_CASSA_CAPITOLO, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_CAPITOLO, PPQRY_WRKSITSTNCA1, "A.CAPITOLO", "WRKSITSTCACA", 3, 16, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_LIST, 116, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_CASSA.SetFieldPage(PFL_CASSA_ARTICOLO, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ARTICOLO, PPQRY_WRKSITSTNCA1, "A.ARTICOLO", "WRKSITSTCAAR", 1, 2, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_LIST, 148, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_LIST, 56);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_LIST, "I. C.");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_FORM, 4, 340, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_FORM, 56);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INFOCAP, MyGlb.PANEL_FORM, "Info Cap");
    PAN_CASSA.SetFieldPage(PFL_CASSA_INFOCAP, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_INFOCAP, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_INFOCAP, PPQRY_WRKSITSTNCA1, "'I'", "WRSISTCAINCA", 5, 1, 0, -13997);
    PAN_CASSA.SetValueListItem(PFL_CASSA_INFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CASSA.SetValueListItem(PFL_CASSA_INFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CASSA.SetValueListItem(PFL_CASSA_INFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_LIST, 168, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_LIST, 120);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_LIST, "Stanz. Competenza");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCOMPETE, MyGlb.PANEL_FORM, "Stanz. Competenza");
    PAN_CASSA.SetFieldPage(PFL_CASSA_STANZCOMPETE, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_STANZCOMPETE, PPQRY_WRKSITSTNCA1, "A.STANZ_COMPETENZA", "WRSISTCASTCO", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_LIST, 280, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_LIST, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_LIST, "Residui Iniziali");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_FORM, 4, 388, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_FORM, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUINIZIA, MyGlb.PANEL_FORM, "Residui Iniziali");
    PAN_CASSA.SetFieldPage(PFL_CASSA_RESIDUINIZIA, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_RESIDUINIZIA, PPQRY_WRKSITSTNCA1, "A.RESIDUI_INIZIALI", "WRSISTCAREIN", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_LIST, 388, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_LIST, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_LIST, "Residui Attuali");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUATTUAL, MyGlb.PANEL_FORM, "Residui Attuali");
    PAN_CASSA.SetFieldPage(PFL_CASSA_RESIDUATTUAL, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_RESIDUATTUAL, PPQRY_WRKSITSTNCA1, "A.RESIDUI_ATTUALI", "WRSISTCAREAT", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_LIST, 500, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_LIST, 44);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_LIST, "E. I.");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_FORM, 4, 364, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_FORM, 44);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ELIMP, MyGlb.PANEL_FORM, "El Imp");
    PAN_CASSA.SetFieldPage(PFL_CASSA_ELIMP, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_ELIMP, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ELIMP, PPQRY_WRKSITSTNCA1, "'I'", "WRSISTCAELIM", 5, 1, 0, -13997);
    PAN_CASSA.SetValueListItem(PFL_CASSA_ELIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CASSA.SetValueListItem(PFL_CASSA_ELIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CASSA.SetValueListItem(PFL_CASSA_ELIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_LIST, 520, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_LIST, 84);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_LIST, "Stanz. Cassa");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_STANZCASSA, MyGlb.PANEL_FORM, "Stanz. Cassa");
    PAN_CASSA.SetFieldPage(PFL_CASSA_STANZCASSA, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_STANZCASSA, PPQRY_WRKSITSTNCA1, "A.STANZ_CASSA", "WRKSITSTSTCA", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_LIST, 632, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_LIST, 60);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_LIST, "Mandati");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_MANDATI1, MyGlb.PANEL_FORM, "Mandati");
    PAN_CASSA.SetFieldPage(PFL_CASSA_MANDATI1, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_MANDATI1, PPQRY_WRKSITSTNCA1, "A.MAN_ORD", "WRKSITSTCAMA", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_LIST, 744, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_FORM, 160);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_CASSA.SetFieldPage(PFL_CASSA_DISPONIBILIT, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_DISPONIBILIT, PPQRY_WRKSITSTNCA1, "A.DISPONIBILITA", "WRKSITSTCADI", 3, 14, 2, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_LIST, 856, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_LIST, 120);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_LIST, "Unità Org.");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_FORM, 4, 292, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_FORM, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_FORM, 2);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_UNITAORG, MyGlb.PANEL_FORM, "Unità Org.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_UNITAORG, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_UNITAORG, PPQRY_WRKSITSTNCA1, "A.DES_UNITA_UO", "WRSISTCAUNOR", 5, 2000, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_LIST, 80);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_LIST, "SESSIONE ID");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_FORM, 4, 340, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_FORM, 80);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SESSIONEID, MyGlb.PANEL_FORM, "SESSIONE ID");
    PAN_CASSA.SetFieldPage(PFL_CASSA_SESSIONEID, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SESSIONEID, PPQRY_WRKSITSTNCA1, "A.SESSIONE_ID", "WRSISTCASEID", 3, 10, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 340, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_CASSA.SetFieldPage(PFL_CASSA_PROGRESSIVO, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_PROGRESSIVO, PPQRY_WRKSITSTNCA1, "A.PROGRESSIVO", "WRKSITSTCAPR", 3, 10, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_LIST, 0, 0, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_LIST, 2);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_FORM, 64, 240, 156, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHECAPITO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_ETICHECAPITO, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ETICHECAPITO, -1, "", "ETICHECAPITO", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_LIST, 988, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_LIST, 24);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_LIST, "E S");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_FORM, 4, 364, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_FORM, 24);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_CASSA.SetFieldPage(PFL_CASSA_ES, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ES, PPQRY_WRKSITSTNCA1, "A.E_S", "WRKSITSTCAES", 5, 1, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_LIST, 140, 248, 740, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_LIST, 2);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_FORM, 136, 248, 624, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ETICHETTATOT, MyGlb.PANEL_FORM, 2);
    PAN_CASSA.SetFieldPage(PFL_CASSA_ETICHETTATOT, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ETICHETTATOT, -1, "", "ETICHETTATOT", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_LIST, 116);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_LIST, "Nuova Espressione");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_FORM, 4, 388, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_FORM, 116);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_NUOVAESPRESS, MyGlb.PANEL_FORM, "Nuova Espressione");
    PAN_CASSA.SetFieldPage(PFL_CASSA_NUOVAESPRESS, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_NUOVAESPRESS, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_NUOVAESPRESS, PPQRY_WRKSITSTNCA1, "ROWNUM", "NUOVAESPRESS", 1, 19, 0, -13997);
  }

  private void PAN_CASSA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CASSA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CASSA.SetIMDB(IMDB, "PQRY_WRKSITSTNCA1", true);
    PAN_CASSA.set_SetString(MyGlb.MASTER_ROWNAME, "WRK SIT STN CASSA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SESSIONE_ID as WRSISTCASEID, ");
    SQL.append("  A.PROGRESSIVO as WRKSITSTCAPR, ");
    SQL.append("  A.CAPITOLO as WRKSITSTCACA, ");
    SQL.append("  A.ARTICOLO as WRKSITSTCAAR, ");
    SQL.append("  A.STANZ_COMPETENZA as WRSISTCASTCO, ");
    SQL.append("  A.RESIDUI_INIZIALI as WRSISTCAREIN, ");
    SQL.append("  A.RESIDUI_ATTUALI as WRSISTCAREAT, ");
    SQL.append("  A.STANZ_CASSA as WRKSITSTSTCA, ");
    SQL.append("  A.MAN_ORD as WRKSITSTCAMA, ");
    SQL.append("  A.DISPONIBILITA as WRKSITSTCADI, ");
    SQL.append("  A.DES_UNITA_UO as WRSISTCAUNOR, ");
    SQL.append("  'I' as WRSISTCAINCA, ");
    SQL.append("  A.E_S as WRKSITSTCAES, ");
    SQL.append("  'I' as WRSISTCAELIM, ");
    SQL.append("  ROWNUM as NUOVAESPRESS ");
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_SIT_STN_CASSA A ");
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CASSA.SetQuery(PPQRY_WRKSITSTNCA1, 5, SQL, -1, "");
    PAN_CASSA.SetQueryDB(PPQRY_WRKSITSTNCA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CASSA.SetMasterTable(0, "WRK_SIT_STN_CASSA");
    PAN_CASSA.AddToSortList(PFL_CASSA_CAPITOLO, true);
    PAN_CASSA.AddToSortList(PFL_CASSA_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CASSA.Status() == 2)
    {
      int oldListQBE = PAN_CASSA.iUseListQBE;
      PAN_CASSA.iUseListQBE = 0;
      PAN_CASSA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CASSA.PanelCommand(Glb.PCM_FIND);
      PAN_CASSA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TOTALI_Init()
  {

    PAN_TOTALI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTALI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTALI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, "4940756A-EC8C-451A-BB22-CBB12427881D");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, "Stn Comp");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, "64179CC3-A6F1-4B51-AD0E-481AA714BDDB");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, "Res Ini");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, "A77468CB-CC7C-43B5-B615-044C7B94D539");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, "Res Att");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, "794B4ADC-BD18-4D4E-90C2-0EFE68B20881");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, "Stn Cassa");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, "87688B36-9FD9-464F-81B5-9CF474E28B3A");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, "Mandati");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, "C20067C2-9FBB-4D8B-BC36-E324F4BED929");
    PAN_TOTALI.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, "Disp");
    PAN_TOTALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, "");
    PAN_TOTALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALI.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TOTALI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_LIST, 64);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_LIST, "Stn Comp");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_FORM, 28, 0, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_FORM, 80);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCOMP, MyGlb.PANEL_FORM, "Stn Comp");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_STNCOMP, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_STNCOMP, PPQRY_TOTALI3, "A.NOMOGGSTNCOM", "NOMOGGSTNCOM", 3, 14, 2, -13997);
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_LIST, 48);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_LIST, "Res Ini");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_FORM, 140, 0, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_FORM, 48);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_RESINI, MyGlb.PANEL_FORM, "Res Ini");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_RESINI, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_RESINI, PPQRY_TOTALI3, "A.NOMOGGRESINI", "NOMOGGRESINI", 3, 14, 2, -13997);
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_LIST, 52);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_LIST, "Res Att");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_FORM, 248, 0, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_FORM, 80);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_RESATT, MyGlb.PANEL_FORM, "Res Att");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_RESATT, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_RESATT, PPQRY_TOTALI3, "A.NOMOGGRESATT", "NOMOGGRESATT", 3, 14, 2, -13997);
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_LIST, 64);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_LIST, "Stn Cassa");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_FORM, 380, 0, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_FORM, 80);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_STNCASSA, MyGlb.PANEL_FORM, "Stn Cassa");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_STNCASSA, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_STNCASSA, PPQRY_TOTALI3, "A.NOMOGGSTNCAS", "NOMOGGSTNCAS", 3, 14, 2, -13997);
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_LIST, 56);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_FORM, 492, 0, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_FORM, 80);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_MANDATI, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_MANDATI, PPQRY_TOTALI3, "A.NOMEOGGEMAND", "NOMEOGGEMAND", 3, 14, 2, -13997);
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_LIST, 32);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_LIST, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_LIST, "Disp");
    PAN_TOTALI.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_FORM, 604, 0, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TOTALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_FORM, 80);
    PAN_TOTALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_FORM, 1);
    PAN_TOTALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALI_DISP, MyGlb.PANEL_FORM, "Disp");
    PAN_TOTALI.SetFieldPage(PFL_TOTALI_DISP, -1, -1);
    PAN_TOTALI.SetFieldPanel(PFL_TOTALI_DISP, PPQRY_TOTALI3, "A.NOMEOGGEDISP", "NOMEOGGEDISP", 3, 14, 2, -13997);
  }

  private void PAN_TOTALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTALI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTALI.SetIMDB(IMDB, "PQRY_TOTALI3", true);
    PAN_TOTALI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_TOTALI.SetQueryIMDB(PPQRY_TOTALI3, IMDBDef13.PQRY_TOTALI3_RS, IMDBDef4.TBL_TOTALI2);
    JustLoaded = true;
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_STNCOMP, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCOM);
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_RESINI, IMDBDef4.FLD_TOTALI2_NOMOGGRESINI);
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_RESATT, IMDBDef4.FLD_TOTALI2_NOMOGGRESATT);
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_STNCASSA, IMDBDef4.FLD_TOTALI2_NOMOGGSTNCAS);
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_MANDATI, IMDBDef4.FLD_TOTALI2_NOMEOGGEMAND);
    PAN_TOTALI.SetFieldPrimaryIndex(PFL_TOTALI_DISP, IMDBDef4.FLD_TOTALI2_NOMEOGGEDISP);
    PAN_TOTALI.SetMasterTable(0, "TOTALI2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTALI.Status() == 2)
    {
      int oldListQBE = PAN_TOTALI.iUseListQBE;
      PAN_TOTALI.iUseListQBE = 0;
      PAN_TOTALI.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTALI.PanelCommand(Glb.PCM_FIND);
      PAN_TOTALI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBROCASSA_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBROCASSA.InitMastro(BUK_LIBROCASSA_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_MST_NUOVPAGIMAST, "9E7A10A3-8A66-44DD-AF85-0E137FCE30DB");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBROCASSA.InitMastroBox(BUK_LIBROCASSA_MST_NUOVPAGIMAST, BUK_LIBROCASSA_RPTBOX_NUMEROPAGINA, 26600, 1000, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_NUMEROPAGINA, "72B2948F-C4EE-485B-B492-FCB220070C36");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_NUMEROPAGINA, BUK_LIBROCASSA_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_NUMEROPAGINA, "A071B0E4-ACE3-4AD9-82B2-EDAC3332D9E1");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBROCASSA.InitMastroBox(BUK_LIBROCASSA_MST_NUOVPAGIMAST, BUK_LIBROCASSA_RPTBOX_TESTATPAGINA, 1000, 1000, 27700, 2500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_TESTATPAGINA, "6967E9C9-4834-43CD-9872-D938A6B58907");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBROCASSA.InitMastroBox(BUK_LIBROCASSA_MST_NUOVPAGIMAST, BUK_LIBROCASSA_RPTBOX_CORPOPAGINA, 1000, 3500, 27700, 16400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_CORPOPAGINA, "4ED5D8EA-8F78-4D78-AC2A-17BB76257BD7");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_LIBROCASSA_RPT_NUOVOREPORT_InitQuery() { BUK_LIBROCASSA_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBROCASSA_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SESSIONE_ID as WRSISTCASEID, ");
      SQL.append("  A.PROGRESSIVO as WRKSITSTCAPR, ");
      SQL.append("  A.CAPITOLO as WRKSITSTCACA, ");
      SQL.append("  A.ARTICOLO as WRKSITSTCAAR, ");
      SQL.append("  A.STANZ_COMPETENZA as WRSISTCASTCO, ");
      SQL.append("  A.RESIDUI_INIZIALI as WRSISTCAREIN, ");
      SQL.append("  A.RESIDUI_ATTUALI as WRSISTCAREAT, ");
      SQL.append("  A.STANZ_CASSA as WRKSITSTSTCA, ");
      SQL.append("  A.MAN_ORD as WRKSITSTCAMA, ");
      SQL.append("  A.DISPONIBILITA as WRKSITSTCADI, ");
      SQL.append("  A.DES_UNITA_UO as WRSISTCAUNOR, ");
      SQL.append("  'I' as WRSISTCAINCA, ");
      SQL.append("  A.E_S as WRKSITSTCAES, ");
      SQL.append("  'I' as WRSISTCAELIM ");
      SQL.append("from ");
      SQL.append("  WRK_SIT_STN_CASSA A ");
      SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO ");
      BUK_LIBROCASSA.SetReportQuery(BUK_LIBROCASSA_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "38FC0C55-9FB8-4FF3-AE91-FF1A9806B457");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROCASSA_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBROCASSA.InitReport(BUK_LIBROCASSA_RPT_NUOVOREPORT, 196609);
    BUK_LIBROCASSA_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPT_NUOVOREPORT, "E49CF8AC-FEFE-43A1-840D-B86C0358F22F");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBROCASSA.InitSection(BUK_LIBROCASSA_RPT_NUOVOREPORT, BUK_LIBROCASSA_SEC_INTESTREPORT, 250, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROCASSA.SetSectionRendersInto(BUK_LIBROCASSA_SEC_INTESTREPORT, BUK_LIBROCASSA_RPTBOX_CORPOPAGINA);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SEC_INTESTREPORT, "AAD13FED-730A-4FCB-83A4-D9CF8728E16C");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBROCASSA.InitSection(BUK_LIBROCASSA_RPT_NUOVOREPORT, BUK_LIBROCASSA_SEC_INTESTPAGINA, 3100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROCASSA.SetSectionRendersInto(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_TESTATPAGINA);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SEC_INTESTPAGINA, "D56D29B7-2C29-4FB3-8BD7-162BD2C8A4B3");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_CAPITOHEADER, 0, 1700, 2600, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_CAPITOHEADER, "91D298DC-5BD4-4852-BDB6-63351F9EE629");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_CAPITOHEADER, "CAPITOHEADER");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_CAPITOHEADER, BUK_LIBROCASSA_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_C, "67F0D8F5-B644-460D-A625-718CCBDA3729");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_C, "C");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_STANCOMPHEAD, 2700, 1700, 3200, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANCOMPHEAD, "05830379-1C28-4E64-961A-8F5D0D365B64");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANCOMPHEAD, "STANCOMPHEAD");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANCOMPHEAD, BUK_LIBROCASSA_SPAN_STANZCOMPET1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanz. Competenza", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_STANZCOMPET1, "E8E31C24-5DA6-462B-ABDE-6CD843E7473D");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_STANZCOMPET1, "STANZCOMPET1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_RESIINIZHEAD, 6000, 1700, 2800, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_RESIINIZHEAD, "46C5C303-1AE2-4345-A4B9-99F46772A699");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_RESIINIZHEAD, "RESIINIZHEAD");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_RESIINIZHEAD, BUK_LIBROCASSA_SPAN_RESIDUINIZI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Residui Iniziali", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_RESIDUINIZI1, "405DE69E-9AE2-47CD-847F-3A63171821D3");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_RESIDUINIZI1, "RESIDUINIZI1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_RESIATTUHEAD, 8900, 1700, 2800, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_RESIATTUHEAD, "FE2F4F50-E0D6-4D29-B771-87A6195A0CCA");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_RESIATTUHEAD, "RESIATTUHEAD");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_RESIATTUHEAD, BUK_LIBROCASSA_SPAN_RESIDUATTUA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Residui Attuali", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_RESIDUATTUA1, "8443B454-2012-4383-ACD0-F58B76E20AEA");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_RESIDUATTUA1, "RESIDUATTUA1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_STANCASSHEAD, 11800, 1700, 2800, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANCASSHEAD, "928FC573-70B2-4A37-8C18-537A39758493");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANCASSHEAD, "STANCASSHEAD");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANCASSHEAD, BUK_LIBROCASSA_SPAN_STANZCASSA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanz. Cassa", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_STANZCASSA1, "62294671-5942-4699-A264-E7B58A712C3A");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_STANZCASSA1, "STANZCASSA1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_MANORDHEADER, 14700, 1600, 2800, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_MANORDHEADER, "696A9E6A-ADD6-4EA3-9D21-5F2BD7867B61");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_MANORDHEADER, "MANORDHEADER");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_MANORDHEADER, BUK_LIBROCASSA_SPAN_IFEQNOPCPEOM, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271384961, "Mandati", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_IFEQNOPCPEOM, "EFE7DD54-C7AA-4083-9C2E-5CA392796579");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_IFEQNOPCPEOM, "IFEQNOPCPEOM");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_DISPONHEADER, 17600, 1700, 2800, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_DISPONHEADER, "CFA0AD99-40AB-42FE-B986-8EB736F3DB28");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_DISPONHEADER, BUK_LIBROCASSA_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_DISPONIBILI1, "7218048A-B5F5-407C-B86C-426DEA44AFA6");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_DESUNITUOHEA, 20500, 1700, 6500, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_DESUNITUOHEA, "CB294086-1F90-4B76-B02B-368A74DEF9CB");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_DESUNITUOHEA, "DESUNITUOHEA");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_DESUNITUOHEA, BUK_LIBROCASSA_SPAN_UNITAORG1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Unità Org.", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_UNITAORG1, "2C6AC518-3803-4F37-9D23-97F593B5FCA9");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_UNITAORG1, "UNITAORG1");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_INTESTPAGINA, BUK_LIBROCASSA_RPTBOX_TITOLO, 0, 0, 27700, 1100, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_TITOLO, "AD530674-52C9-4DDA-A878-4BE5419CAE16");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_TITOLO, BUK_LIBROCASSA_SPAN_NUOVASPAN1, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Situazione di Cassa al ", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_NUOVASPAN1, "741321C2-52B1-469B-BD38-DE8C198E4F10");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_TITOLO, BUK_LIBROCASSA_SPAN_TODAY, MyGlb.VIS_TITREPNOBOCE, 6, 0, 0, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_TODAY, "EB0A4D29-C8F5-4FD4-9F3A-838107FBB733");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_TODAY, "TODAY");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_TITOLO, BUK_LIBROCASSA_SPAN_NUOVASPAN2, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", " - Parte ", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_NUOVASPAN2, "FC04FE53-6870-49D5-834B-16067E8EC951");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_NUOVASPAN2, "NUOVASPAN2");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_TITOLO, BUK_LIBROCASSA_SPAN_IFEQNOPCPEES, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_IFEQNOPCPEES, "A1D7B907-76D9-4B4F-AF14-70287FF49210");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_IFEQNOPCPEES, "IFEQNOPCPEES");
    BUK_LIBROCASSA.InitSection(BUK_LIBROCASSA_RPT_NUOVOREPORT, BUK_LIBROCASSA_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROCASSA.SetSectionRendersInto(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_CORPOPAGINA);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SEC_DETTAGLIO, "2BDEF93A-5264-4033-B307-709EC0EAE0B6");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_CAPITOLO, 100, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_CAPITOLO, "63882734-3CAB-4148-B6FA-B3D532C3B8B3");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_CAPITOLO, BUK_LIBROCASSA_SPAN_TSWSSCCCLCTS, MyGlb.VIS_DEFAREPOSTYL, 5, 199, 0, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_TSWSSCCCLCTS, "A87B5A46-A1F2-44DA-8B85-69711F61BECE");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_TSWSSCCCLCTS, "TSWSSCCCLCTS");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_STANZCOMPET1, 2700, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANZCOMPET1, "E541216F-2C86-4256-853A-3C5E1EF417D1");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANZCOMPET1, "STANZCOMPET1");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANZCOMPET1, BUK_LIBROCASSA_SPAN_STANZCOMPETE, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRSISTCASTCO", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_STANZCOMPETE, "8780C575-90AC-4046-87FD-FD419F1581A8");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_STANZCOMPETE, "STANZCOMPETE");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_RESIDUINIZIA, 6000, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_RESIDUINIZIA, "0B73158D-B8B3-4A96-AE8F-11E6ECAE064B");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_RESIDUINIZIA, "RESIDUINIZIA");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_RESIDUINIZIA, BUK_LIBROCASSA_SPAN_RESIDUINIZIA, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRSISTCAREIN", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_RESIDUINIZIA, "B43A27B2-625C-4132-9305-C9006D9517BD");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_RESIDUINIZIA, "RESIDUINIZIA");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_RESIDUATTUAL, 8900, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_RESIDUATTUAL, "2BA3C6D6-D003-4340-867D-9C6A0F7F5D66");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_RESIDUATTUAL, "RESIDUATTUAL");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_RESIDUATTUAL, BUK_LIBROCASSA_SPAN_RESIDUATTUAL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRSISTCAREAT", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_RESIDUATTUAL, "EE63757E-9557-4F35-87C3-A866B55AAE33");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_RESIDUATTUAL, "RESIDUATTUAL");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_STANZCASSA1, 11800, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANZCASSA1, "D9176C5C-496B-47F1-A1F0-D8A2875E64B0");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANZCASSA1, "STANZCASSA1");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANZCASSA1, BUK_LIBROCASSA_SPAN_STANZCASSA, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRKSITSTSTCA", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_STANZCASSA, "7D10699B-DB8B-450C-AB8C-8184142D714C");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_STANZCASSA, "STANZCASSA");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_MANORD1, 14700, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_MANORD1, "5F1E17DD-4D3A-4929-AF67-6E18924A32B4");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_MANORD1, "MANORD1");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_MANORD1, BUK_LIBROCASSA_SPAN_MANDATI, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRKSITSTCAMA", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_MANDATI, "2974B719-F90D-43E0-800E-5C4F5CBB7675");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_MANDATI, "MANDATI");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_DISPONIBILIT, 17600, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_DISPONIBILIT, "1C025B81-9BAA-4D2D-96F1-880D0E69002B");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_DISPONIBILIT, BUK_LIBROCASSA_SPAN_DISPONIBILIT, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::WRKSITSTCADI", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_DISPONIBILIT, "C262F232-79C5-4279-8ADE-72BC32C7CE30");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_DETTAGLIO, BUK_LIBROCASSA_RPTBOX_DESUNITAUO, 20500, 0, 6400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_DESUNITAUO, "D14D4C8F-2F11-4D6C-A93E-8707AE675197");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_DESUNITAUO, "DESUNITAUO");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_DESUNITAUO, BUK_LIBROCASSA_SPAN_UNITAORG, MyGlb.VIS_DEFAREPOSTYL, 5, 2000, 0, 271384705, "", "::WRSISTCAUNOR", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_UNITAORG, "A45E694C-B7AE-4F52-8E0B-396CD3A4143A");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_UNITAORG, "UNITAORG");
    BUK_LIBROCASSA.InitSection(BUK_LIBROCASSA_RPT_NUOVOREPORT, BUK_LIBROCASSA_SEC_PIEDEREPORT, 1200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROCASSA.SetSectionRendersInto(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_CORPOPAGINA);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SEC_PIEDEREPORT, "2646D205-FAFA-4111-B863-49A0955DCC3C");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_STANZCOMPETE, 2700, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANZCOMPETE, "6D464233-F1A2-483A-825D-7E2D49A4445A");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANZCOMPETE, "STANZCOMPETE");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANZCOMPETE, BUK_LIBROCASSA_SPAN_PRSWSSCSCCLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PRSWSSCSCCLC, "F3B33A22-C485-4042-BE91-2E5FE528D741");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PRSWSSCSCCLC, "PRSWSSCSCCLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_REISDUINIZIA, 6000, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_REISDUINIZIA, "6977C299-9EE8-4EDC-85CF-E262560D3794");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_REISDUINIZIA, "REISDUINIZIA");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_REISDUINIZIA, BUK_LIBROCASSA_SPAN_PRSWSSCRICLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PRSWSSCRICLC, "9001EED9-CA03-4EBF-AB1A-458339515376");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PRSWSSCRICLC, "PRSWSSCRICLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_RESATTUALI, 8900, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_RESATTUALI, "95B9FEA5-02EF-4FAF-A688-B9EB2AF6778B");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_RESATTUALI, "RESATTUALI");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_RESATTUALI, BUK_LIBROCASSA_SPAN_PRSWSSCRACLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PRSWSSCRACLC, "A51AED40-9FF3-4CF2-B231-A69A8618E666");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PRSWSSCRACLC, "PRSWSSCRACLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_STANZCASSA, 11800, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_STANZCASSA, "AEB3BD4E-F2FE-40E7-86F7-F8AFC729CFE6");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_STANZCASSA, "STANZCASSA");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_STANZCASSA, BUK_LIBROCASSA_SPAN_PIRSWSSSCCLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PIRSWSSSCCLC, "AD809B9C-BD0C-4E77-9C74-2BFD35D24168");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PIRSWSSSCCLC, "PIRSWSSSCCLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_MANORD, 14700, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_MANORD, "092AD319-809C-4B03-A4DB-39B192B35CCE");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_MANORD, "MANORD");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_MANORD, BUK_LIBROCASSA_SPAN_PIRSWSSCMCLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PIRSWSSCMCLC, "5B8B913D-C78C-4ED7-8DFE-7BB72BCF97E9");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PIRSWSSCMCLC, "PIRSWSSCMCLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_DISP, 17600, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_DISP, "07F01BB4-E874-4AB5-99B6-285562D7E1E9");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_DISP, "DISP");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_DISP, BUK_LIBROCASSA_SPAN_PIRSWSSCDCLC, MyGlb.VIS_INTSENZABORD, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_PIRSWSSCDCLC, "C02B9F8B-0953-4FF9-8521-E76648E5ACCB");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_PIRSWSSCDCLC, "PIRSWSSCDCLC");
    BUK_LIBROCASSA.InitReportBox(BUK_LIBROCASSA_SEC_PIEDEREPORT, BUK_LIBROCASSA_RPTBOX_TOT, 1200, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_RPTBOX_TOT, "27869481-EDDB-4509-8909-EE714AAF4DF7");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_RPTBOX_TOT, "TOT");
    BUK_LIBROCASSA.InitBoxSpan(BUK_LIBROCASSA_RPTBOX_TOT, BUK_LIBROCASSA_SPAN_NUOVASPAN, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totali", 1);
    BUK_LIBROCASSA.SetRTCGuid(BUK_LIBROCASSA_SPAN_NUOVASPAN, "BEA0CD6C-81C3-4CEB-B228-D97B93007E71");
    BUK_LIBROCASSA.SetObjCode(BUK_LIBROCASSA_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBROCASSA_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBROCASSA_InitLinks()
  {
    BUK_LIBROCASSA.SetBoxNextBox(BUK_LIBROCASSA_RPTBOX_CORPOPAGINA, BUK_LIBROCASSA_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CASSA) PAN_CASSA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTALI) PAN_TOTALI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_CASSA) PAN_CASSA_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTALI) PAN_TOTALI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_CASSA) PAN_CASSA_DynamicProperties();
    if (SrcObj == PAN_TOTALI) PAN_TOTALI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CASSA) PAN_CASSA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TOTALI) PAN_TOTALI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CASSA) PAN_CASSA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CASSA) PAN_CASSA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TOTALI) PAN_TOTALI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROCASSA) BUK_LIBROCASSA_OnPreview();
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
