// **********************************************
// Controllo Quadri
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuadri extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_QUADRO = 0;
  private static int PFL_PARAMETRI_IMPORTTRONCA = 1;
  private static int PFL_PARAMETRI_ELABORA = 2;

  private static int PPQRY_PARAMETRI559 = 0;

  private static int PPQRY_T63 = 1;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_CONTQUADLIBR;
  OBook BKW_CONTQUADLIBR;
  //
  // Template Pages constants
  private static int BUK_CONTQUADLIBR_MST_CONTQUADMAST = 1;
  private static int BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2 = 2;
  private static int BUK_CONTQUADLIBR_SPAN_UPTEPATOTIC1 = 3;
  private static int BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2 = 4;
  private static int BUK_CONTQUADLIBR_SPAN_SOTEPTTPQCQ2 = 5;
  private static int BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1 = 6;
  private static int BUK_CONTQUADLIBR_RPTBOX_NUMEROPAGIN1 = 7;
  private static int BUK_CONTQUADLIBR_SPAN_CPTSCQLCQPND = 8;

  //
  // Reports constants
  private static int BUK_CONTQUADLIBR_RPT_CONTQUADREPO = 9;
  private static int BUK_CONTQUADLIBR_SEC_INTESTREPORT = 10;
  private static int BUK_CONTQUADLIBR_SEC_INTESTPAGINA = 11;
  private static int BUK_CONTQUADLIBR_RPTBOX_RAGSOCHEADE1 = 12;
  private static int BUK_CONTQUADLIBR_SPAN_COGNNOMEODE1 = 13;
  private static int BUK_CONTQUADLIBR_RPTBOX_INDIRIHEADE1 = 14;
  private static int BUK_CONTQUADLIBR_SPAN_VIAENUMECIV1 = 15;
  private static int BUK_CONTQUADLIBR_RPTBOX_DATANASCHEAD = 16;
  private static int BUK_CONTQUADLIBR_SPAN_DATADINASCI1 = 17;
  private static int BUK_CONTQUADLIBR_RPTBOX_CODIFISCHEAD = 18;
  private static int BUK_CONTQUADLIBR_SPAN_CODICEFISCA1 = 19;
  private static int BUK_CONTQUADLIBR_RPTBOX_COMEPRDOFIH1 = 20;
  private static int BUK_CONTQUADLIBR_SPAN_COOSTESDEDO1 = 21;
  private static int BUK_CONTQUADLIBR_RPTBOX_COMEPRONASH1 = 22;
  private static int BUK_CONTQUADLIBR_SPAN_COMOSTESDIN1 = 23;
  private static int BUK_CONTQUADLIBR_RPTBOX_CAUSALHEADE1 = 24;
  private static int BUK_CONTQUADLIBR_SPAN_CAUSALE1 = 25;
  private static int BUK_CONTQUADLIBR_RPTBOX_ALIQUOHEADER = 26;
  private static int BUK_CONTQUADLIBR_SPAN_ALIQUOTA2 = 27;
  private static int BUK_CONTQUADLIBR_RPTBOX_IMPONIHEADE3 = 28;
  private static int BUK_CONTQUADLIBR_SPAN_IMPONIBILE2 = 29;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENUHEADE3 = 30;
  private static int BUK_CONTQUADLIBR_SPAN_RITENUTE2 = 31;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITEINPSHEAD = 32;
  private static int BUK_CONTQUADLIBR_SPAN_RITENUTEINP1 = 33;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITEINPCEHEA = 34;
  private static int BUK_CONTQUADLIBR_SPAN_RITEINPSENTE = 35;
  private static int BUK_CONTQUADLIBR_RPTBOX_SOMNONSOGHE1 = 36;
  private static int BUK_CONTQUADLIBR_SPAN_SOMMENONSOG1 = 37;
  private static int BUK_CONTQUADLIBR_RPTBOX_ADDIREGIHEA1 = 38;
  private static int BUK_CONTQUADLIBR_SPAN_ADDIZIREGIO1 = 39;
  private static int BUK_CONTQUADLIBR_RPTBOX_IMPOCORRHEA1 = 40;
  private static int BUK_CONTQUADLIBR_SPAN_IMPORTCORRI1 = 41;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENCOMHEAD = 42;
  private static int BUK_CONTQUADLIBR_SPAN_ADDIZICOMUNA = 43;
  private static int BUK_CONTQUADLIBR_SEC_DETTAGLIO = 44;
  private static int BUK_CONTQUADLIBR_RPTBOX_RAGSOC1 = 45;
  private static int BUK_CONTQUADLIBR_SPAN_RERASOCOQC7L = 46;
  private static int BUK_CONTQUADLIBR_RPTBOX_INDIRIZZO1 = 47;
  private static int BUK_CONTQUADLIBR_SPAN_REINCOQUCO7L = 48;
  private static int BUK_CONTQUADLIBR_RPTBOX_DATANASCITA = 49;
  private static int BUK_CONTQUADLIBR_SPAN_REDANACOQC7L = 50;
  private static int BUK_CONTQUADLIBR_RPTBOX_CODICEFISCAL = 51;
  private static int BUK_CONTQUADLIBR_SPAN_RECOFICOQC7L = 52;
  private static int BUK_CONTQUADLIBR_RPTBOX_COMEPRODOMF1 = 53;
  private static int BUK_CONTQUADLIBR_SPAN_RECEPDFCQC7L = 54;
  private static int BUK_CONTQUADLIBR_RPTBOX_COMUEPROVNA1 = 55;
  private static int BUK_CONTQUADLIBR_SPAN_RECOEPNCQC7L = 56;
  private static int BUK_CONTQUADLIBR_RPTBOX_CAUSALE1 = 57;
  private static int BUK_CONTQUADLIBR_SPAN_RECACOQUCO7L = 58;
  private static int BUK_CONTQUADLIBR_RPTBOX_ALIQUOTA = 59;
  private static int BUK_CONTQUADLIBR_SPAN_REALCOQUCO7L = 60;
  private static int BUK_CONTQUADLIBR_RPTBOX_IMPONIBILE2 = 61;
  private static int BUK_CONTQUADLIBR_SPAN_REIMCOQUCO7L = 62;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENUTE3 = 63;
  private static int BUK_CONTQUADLIBR_SPAN_RERICOQUCO7L = 64;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENUTEINPS = 65;
  private static int BUK_CONTQUADLIBR_SPAN_RERIINCOQC7L = 66;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENUINPSCE = 67;
  private static int BUK_CONTQUADLIBR_SPAN_RERIINCCQC7L = 68;
  private static int BUK_CONTQUADLIBR_RPTBOX_SOMMENONSOG1 = 69;
  private static int BUK_CONTQUADLIBR_SPAN_RESONOSCQC7L = 70;
  private static int BUK_CONTQUADLIBR_RPTBOX_ADDIZIREGIO1 = 71;
  private static int BUK_CONTQUADLIBR_SPAN_READRECOQC7L = 72;
  private static int BUK_CONTQUADLIBR_RPTBOX_IMPORTCORRI1 = 73;
  private static int BUK_CONTQUADLIBR_SPAN_REIMCOCOQC7L = 74;
  private static int BUK_CONTQUADLIBR_RPTBOX_RITENUTECOM = 75;
  private static int BUK_CONTQUADLIBR_SPAN_RERICOCOQC7L = 76;
  private static int BUK_CONTQUADLIBR_SEC_PIEDEPAGINA = 77;
  private static int BUK_CONTQUADLIBR_SEC_PIEDEREPORT = 78;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPONI2 = 79;
  private static int BUK_CONTQUADLIBR_SPAN_PIRESRICQCQL = 80;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFRITENU2 = 81;
  private static int BUK_CONTQUADLIBR_SPAN_PIRESRRCQCQL = 82;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFRITEINP = 83;
  private static int BUK_CONTQUADLIBR_SPAN_PIRSRRICQCQL = 84;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFRITINCE = 85;
  private static int BUK_CONTQUADLIBR_SPAN_PRSRRICCQCQL = 86;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFSOMNOSO = 87;
  private static int BUK_CONTQUADLIBR_SPAN_PRSRSNSCQCQL = 88;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFADDIREG = 89;
  private static int BUK_CONTQUADLIBR_SPAN_PIRSRARCQCQL = 90;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPOCOR = 91;
  private static int BUK_CONTQUADLIBR_SPAN_PIRSRICCQCQL = 92;
  private static int BUK_CONTQUADLIBR_RPTBOX_SUMOFRITECOM = 93;
  private static int BUK_CONTQUADLIBR_SPAN_PIRSRRCCQCQL = 94;
  private static int BUK_CONTQUADLIBR_RPTBOX_TOTALI1 = 95;
  private static int BUK_CONTQUADLIBR_SPAN_TOTALI1 = 96;

  CIDREObj BUK_CONTQUASHLIB;
  OBook BKW_CONTQUASHLIB;
  //
  // Template Pages constants
  private static int BUK_CONTQUASHLIB_MST_CONTQUASHMAS = 1;
  private static int BUK_CONTQUASHLIB_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONTQUASHLIB_SPAN_CPTSCQSLCQPN = 3;
  private static int BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA = 4;

  //
  // Reports constants
  private static int BUK_CONTQUASHLIB_RPT_CONTQUASHREP = 5;
  private static int BUK_CONTQUASHLIB_SEC_INTESTREPOR1 = 6;
  private static int BUK_CONTQUASHLIB_SEC_INTESTPAGINA = 7;
  private static int BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1 = 8;
  private static int BUK_CONTQUASHLIB_SPAN_TEPATOTICFES = 9;
  private static int BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1 = 10;
  private static int BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQ1 = 11;
  private static int BUK_CONTQUASHLIB_RPTBOX_RAGSOCHEADER = 12;
  private static int BUK_CONTQUASHLIB_SPAN_COGNNOMEODEN = 13;
  private static int BUK_CONTQUASHLIB_RPTBOX_INDIRIHEADER = 14;
  private static int BUK_CONTQUASHLIB_SPAN_VIAENUMECIVI = 15;
  private static int BUK_CONTQUASHLIB_RPTBOX_VSDDVSDDVSDD = 16;
  private static int BUK_CONTQUASHLIB_SPAN_DATADINASCIT = 17;
  private static int BUK_CONTQUASHLIB_RPTBOX_VISOVISOCOFH = 18;
  private static int BUK_CONTQUASHLIB_SPAN_CODICEFISCAL = 19;
  private static int BUK_CONTQUASHLIB_RPTBOX_COMEPRDOFIHE = 20;
  private static int BUK_CONTQUASHLIB_SPAN_COOSTESDEDOF = 21;
  private static int BUK_CONTQUASHLIB_RPTBOX_COMEPRONASHE = 22;
  private static int BUK_CONTQUASHLIB_SPAN_COMOSTESDINA = 23;
  private static int BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHE1 = 24;
  private static int BUK_CONTQUASHLIB_SPAN_ALIQUOTA1 = 25;
  private static int BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADE1 = 26;
  private static int BUK_CONTQUASHLIB_SPAN_IMPONIBILE1 = 27;
  private static int BUK_CONTQUASHLIB_RPTBOX_RITENUHEADE1 = 28;
  private static int BUK_CONTQUASHLIB_SPAN_RITENUTE1 = 29;
  private static int BUK_CONTQUASHLIB_SEC_DETTAGLIO1 = 30;
  private static int BUK_CONTQUASHLIB_RPTBOX_RAGSOC = 31;
  private static int BUK_CONTQUASHLIB_SPAN_RERASOCQC7SL = 32;
  private static int BUK_CONTQUASHLIB_RPTBOX_INDIRIZZO = 33;
  private static int BUK_CONTQUASHLIB_SPAN_REINCOQUC7SL = 34;
  private static int BUK_CONTQUASHLIB_RPTBOX_VISODDVSDDDN = 35;
  private static int BUK_CONTQUASHLIB_SPAN_RVSDDDNCQC7S = 36;
  private static int BUK_CONTQUASHLIB_RPTBOX_VISSOGCODFIS = 37;
  private static int BUK_CONTQUASHLIB_SPAN_REVSCFCQC7SL = 38;
  private static int BUK_CONTQUASHLIB_RPTBOX_COMEPRODOMFI = 39;
  private static int BUK_CONTQUASHLIB_SPAN_RCEPDFCQC7SL = 40;
  private static int BUK_CONTQUASHLIB_RPTBOX_COMUEPROVNAS = 41;
  private static int BUK_CONTQUASHLIB_SPAN_RECEPNCQC7SL = 42;
  private static int BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA1 = 43;
  private static int BUK_CONTQUASHLIB_SPAN_RELIALCQC7S1 = 44;
  private static int BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE1 = 45;
  private static int BUK_CONTQUASHLIB_SPAN_REIMCOQUC7S1 = 46;
  private static int BUK_CONTQUASHLIB_RPTBOX_RITENUTE1 = 47;
  private static int BUK_CONTQUASHLIB_SPAN_RERICOQUC7S1 = 48;
  private static int BUK_CONTQUASHLIB_SEC_PIEDEPAGINA = 49;
  private static int BUK_CONTQUASHLIB_SEC_PIEDEREPORT1 = 50;
  private static int BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONI1 = 51;
  private static int BUK_CONTQUASHLIB_SPAN_PIRSRICQCQS1 = 52;
  private static int BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENU1 = 53;
  private static int BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQS1 = 54;
  private static int BUK_CONTQUASHLIB_RPTBOX_TOTALI = 55;
  private static int BUK_CONTQUASHLIB_SPAN_TOTALI = 56;
  private static int BUK_CONTQUASHLIB_RPT_CONQUASHRIRE = 57;
  private static int BUK_CONTQUASHLIB_SEC_INTESTREPORT = 58;
  private static int BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA = 59;
  private static int BUK_CONTQUASHLIB_SPAN_UPTEPATOTICE = 60;
  private static int BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI = 61;
  private static int BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQP = 62;
  private static int BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHEA = 63;
  private static int BUK_CONTQUASHLIB_SPAN_ALIQUOTA = 64;
  private static int BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADER = 65;
  private static int BUK_CONTQUASHLIB_SPAN_IMPONIBILE = 66;
  private static int BUK_CONTQUASHLIB_RPTBOX_RITENUHEADER = 67;
  private static int BUK_CONTQUASHLIB_SPAN_RITENUTE = 68;
  private static int BUK_CONTQUASHLIB_SEC_DETTAGLIO = 69;
  private static int BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA = 70;
  private static int BUK_CONTQUASHLIB_SPAN_RELIALCQC7SL = 71;
  private static int BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE = 72;
  private static int BUK_CONTQUASHLIB_SPAN_REIMCOQUC7SL = 73;
  private static int BUK_CONTQUASHLIB_RPTBOX_RITENUTE = 74;
  private static int BUK_CONTQUASHLIB_SPAN_RERICOQUC7SL = 75;
  private static int BUK_CONTQUASHLIB_SEC_PIEDEREPORT = 76;
  private static int BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONIB = 77;
  private static int BUK_CONTQUASHLIB_SPAN_PIRSRICQCQSL = 78;
  private static int BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENUT = 79;
  private static int BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQSL = 80;
  private static int BUK_CONTQUASHLIB_RPTBOX_TOTALE = 81;
  private static int BUK_CONTQUASHLIB_SPAN_TOTALE = 82;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI575(IMDB);
    //
    //
    Init_PQRY_PARAMETRI559(IMDB);
    Init_PQRY_PARAMETRI559_RS(IMDB);
    Init_PQRY_VISTACONT770(IMDB);
    Init_PQRY_BEN3(IMDB);
    Init_PQRY_T62(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI575(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI575, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI575, "TBL_PARAMETRI575");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI575,IMDBDef5.FLD_PARAMETRI575_PARAMQUADRO, "PARAMQUADRO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI575,IMDBDef5.FLD_PARAMETRI575_PARAMQUADRO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI575,IMDBDef5.FLD_PARAMETRI575_PARAIMPOTRON, "PARAIMPOTRON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI575,IMDBDef5.FLD_PARAMETRI575_PARAIMPOTRON,5,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI575, 0);
  }

  private static void Init_PQRY_PARAMETRI559(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI559, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI559, "PQRY_PARAMETRI559");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI559,IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, "PARAMQUADRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI559,IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI559,IMDBDef15.PQSL_PARAMETRI559_PARAIMPOTRON, "PARAIMPOTRON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI559,IMDBDef15.PQSL_PARAMETRI559_PARAIMPOTRON,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI559, 0);
  }

  private static void Init_PQRY_PARAMETRI559_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI559_RS, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI559_RS, "PQRY_PARAMETRI559_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI559_RS,IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, "PARAMQUADRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI559_RS,IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI559_RS,IMDBDef15.PQSL_PARAMETRI559_PARAIMPOTRON, "PARAIMPOTRON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI559_RS,IMDBDef15.PQSL_PARAMETRI559_PARAIMPOTRON,5,49,0);
  }

  private static void Init_PQRY_VISTACONT770(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_VISTACONT770, 22);
    IMDB.set_TblCode(IMDBDef15.PQRY_VISTACONT770, "PQRY_VISTACONT770");
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDRAGSOC, "RECORDRAGSOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDRAGSOC,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDBENEFI, "RECORDBENEFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDBENEFI,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDESABBR, "RECORDESABBR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDESABBR,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDCAUSAL, "RECORDCAUSAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDCAUSAL,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECSOMNONSOG, "RECSOMNONSOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECSOMNONSOG,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDIMPONI,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDRITENU, "RECORDRITENU");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDRITENU,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOADDIREGI, "RECOADDIREGI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOADDIREGI,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOIMPOCORR, "RECOIMPOCORR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOIMPOCORR,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDALIQUO, "RECORDALIQUO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDALIQUO,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDINDIRI, "RECORDINDIRI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORDINDIRI,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECODESCCOMU, "RECODESCCOMU");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECODESCCOMU,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOSIGLPROV, "RECOSIGLPROV");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOSIGLPROV,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECCOEPRDOFI, "RECCOEPRDOFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECCOEPRDOFI,5,43,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECODATANASC, "RECODATANASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECODATANASC,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOCOMUNASC, "RECOCOMUNASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOCOMUNASC,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOPROVNASC, "RECOPROVNASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOPROVNASC,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECCOMEPRONA, "RECCOMEPRONA");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECCOMEPRONA,5,43,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOCODIFISC, "RECOCODIFISC");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECOCODIFISC,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORRITECOM, "RECORRITECOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORRITECOM,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORITEINPS, "RECORITEINPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORITEINPS,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORITINPCE, "RECORITINPCE");
    IMDB.SetFldParams(IMDBDef15.PQRY_VISTACONT770,IMDBDef15.PQSL_VISTACONT770_RECORITINPCE,2,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_VISTACONT770, 0);
  }

  private static void Init_PQRY_BEN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_BEN3, 16);
    IMDB.set_TblCode(IMDBDef15.PQRY_BEN3, "PQRY_BEN3");
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDRAGSOC, "RECORDRAGSOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDRAGSOC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORLIQBENE, "RECORLIQBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORLIQBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDESABBR, "RECORDESABBR");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDESABBR,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDCAUSAL, "RECORDCAUSAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDCAUSAL,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDRITENU, "RECORDRITENU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDRITENU,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORLIQALIQ, "RECORLIQALIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORLIQALIQ,3,4,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDINDIRI, "RECORDINDIRI");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECORDINDIRI,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECODESCCOMU, "RECODESCCOMU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECODESCCOMU,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOSIGLPROV, "RECOSIGLPROV");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOSIGLPROV,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECCOEPRDOFI, "RECCOEPRDOFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECCOEPRDOFI,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_REVISODDDANA, "REVISODDDANA");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_REVISODDDANA,6,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOCOMUNASC, "RECOCOMUNASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOCOMUNASC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOPROVNASC, "RECOPROVNASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECOPROVNASC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECCOMEPRONA, "RECCOMEPRONA");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECCOMEPRONA,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECVISSOCOFI, "RECVISSOCOFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_BEN3,IMDBDef15.PQSL_BEN3_RECVISSOCOFI,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_BEN3, 0);
  }

  private static void Init_PQRY_T62(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_T62, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_T62, "PQRY_T62");
    IMDB.set_FldCode(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORLIQALIQ, "RECORLIQALIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORLIQALIQ,3,4,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORDIMPONI, "RECORDIMPONI");
    IMDB.SetFldParams(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORDIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORDRITENU, "RECORDRITENU");
    IMDB.SetFldParams(IMDBDef15.PQRY_T62,IMDBDef15.PQSL_T62_RECORDRITENU,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_T62, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuadri(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuadri()
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
    FormIdx = MyGlb.FRM_CONTROQUADRI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FF6A04B9-960B-4253-8FFA-C42B9F4D7B63";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 208;
    DesignHeight = 186;
    set_Caption(new IDVariant("Controllo Quadri"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 208;
    Frames[1].Height = 160;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 160;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 208-MyGlb.PAN_OFFS_X, 160-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "522CD4C2-B489-4A3C-8BC9-9434D5E5D2F0");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 104, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_CONTQUADLIBR = new OBook(this);
    BUK_CONTQUADLIBR = new CIDREObj(BKW_CONTQUADLIBR);
    BKW_CONTQUADLIBR.iGuid = "7119BB44-94D3-4C52-95A5-E3A1C0A93C17";
    BKW_CONTQUADLIBR.Code = "BUK_CONTQUADLIBR";
    BKW_CONTQUADLIBR.BookObj = BUK_CONTQUADLIBR;
    BKW_CONTQUADLIBR.InitDefMasks();
    BUK_CONTQUADLIBR.InitBook(1, 1245441, "Controllo Quadri Libro", IMDB, MainFrm.VisualStyleList);
    BUK_CONTQUADLIBR.InitHTML();
    BUK_CONTQUADLIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTQUADLIBR.Book.SetMainFrm(MainFrm);
    BUK_CONTQUADLIBR.SetRTCGuid(0, "7119BB44-94D3-4C52-95A5-E3A1C0A93C17");
    BUK_CONTQUADLIBR.SetObjCode(0, "CONTQUADLIBR");
    BUK_CONTQUADLIBR_MST_CONTQUADMAST_Init();
    BUK_CONTQUADLIBR_RPT_CONTQUADREPO_Init();
    BUK_CONTQUADLIBR_InitLinks();
    BKW_CONTQUASHLIB = new OBook(this);
    BUK_CONTQUASHLIB = new CIDREObj(BKW_CONTQUASHLIB);
    BKW_CONTQUASHLIB.iGuid = "A3B772FF-CC44-4804-A12D-AA8019E3C249";
    BKW_CONTQUASHLIB.Code = "BUK_CONTQUASHLIB";
    BKW_CONTQUASHLIB.BookObj = BUK_CONTQUASHLIB;
    BKW_CONTQUASHLIB.InitDefMasks();
    BUK_CONTQUASHLIB.InitBook(1, 1245441, "Controllo Quadri SH Libro", IMDB, MainFrm.VisualStyleList);
    BUK_CONTQUASHLIB.InitHTML();
    BUK_CONTQUASHLIB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTQUASHLIB.Book.SetMainFrm(MainFrm);
    BUK_CONTQUASHLIB.SetRTCGuid(0, "A3B772FF-CC44-4804-A12D-AA8019E3C249");
    BUK_CONTQUASHLIB.SetObjCode(0, "CONTQUASHLIB");
    BUK_CONTQUASHLIB_MST_CONTQUASHMAS_Init();
    BUK_CONTQUASHLIB_RPT_CONTQUASHREP_Init();
    BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_Init();
    BUK_CONTQUASHLIB_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI575, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROQUADRI_PARAMETRI559();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_CONTQUADLIBR.UpdateBook();
      // BUK_CONTQUASHLIB.UpdateBook();
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
    if (Code.equals("BUK_CONTQUADLIBR")) return BUK_CONTQUADLIBR;
    if (Code.equals("BUK_CONTQUASHLIB")) return BUK_CONTQUASHLIB;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloQuadri);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuadri.class.getName() : (Glb.ClassWithPackage(ControlloQuadri.class) ? ControlloQuadri.class.getName().substring(ControlloQuadri.class.getPackage().getName().length() + 1) : ControlloQuadri.class.getName()));
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
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI559, IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, 0).equals((new IDVariant("SH")), true))
      {
        BUK_CONTQUASHLIB.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_CONTQUASHLIB.RefreshQuery();
        BUK_CONTQUASHLIB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_CONTQUASHLIB.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      else
      {
        BUK_CONTQUADLIBR.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_CONTQUADLIBR.RefreshQuery();
        BUK_CONTQUADLIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_CONTQUADLIBR.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadri", "Elabora", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadri", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void CONTROQUADRI_PARAMETRI559() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI559_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI575, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI575, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI559_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI559_RS, 0, IMDBDef5.TBL_PARAMETRI575, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI559_RS, 0, 0, IMDBDef5.TBL_PARAMETRI575, IMDBDef5.FLD_PARAMETRI575_PARAMQUADRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI559_RS, 1, 0, IMDBDef5.TBL_PARAMETRI575, IMDBDef5.FLD_PARAMETRI575_PARAIMPOTRON, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI575, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI575, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI575, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI559_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
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

  private void BUK_CONTQUADLIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTQUADLIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTQUADLIBR_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_CONTQUADLIBR_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_CONTQUADLIBR_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CONTQUADLIBR_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_CONTQUADLIBR_SEC_PIEDEREPORT)
    {
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRESRICQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECORDIMPONI")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRESRRCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECORDRITENU")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRSRRICQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECORITEINPS")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PRSRRICCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECORITINPCE")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PRSRSNSCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECSOMNONSOG")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRSRARCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECOADDIREGI")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRSRICCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECOIMPOCORR")));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_PIRSRRCCQCQL, new IDVariant(BUK_CONTQUADLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADLIBR_SEC_PIEDEREPORT,"RECORRITECOM")));
    }
  }

  private void BUK_CONTQUADLIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTQUADLIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTQUADLIBR_MST_CONTQUADMAST)
    {
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_UPTEPATOTIC1, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_CONTQUADLIBR.BoxToolTip(BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2))), MainFrm.ESERCIZIO))));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_SOTEPTTPQCQ2, new IDVariant(IDL.Add((new IDVariant(BUK_CONTQUADLIBR.BoxToolTip(BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2))), IMDB.Value(IMDBDef15.PQRY_PARAMETRI559, IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, 0))));
      BUK_CONTQUADLIBR.set_SpanValue(BUK_CONTQUADLIBR_SPAN_CPTSCQLCQPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTQUADLIBR.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_CONTQUADLIBR.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTQUADLIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTQUADLIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTQUADLIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTQUADLIBR_OnPreview()
  {
    PreviewBook = BKW_CONTQUADLIBR;
    SetRD();
  }

  private void BUK_CONTQUASHLIB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTQUASHLIB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTQUASHLIB_SEC_INTESTREPOR1)
    {
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_INTESTPAGINA)
    {
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_TEPATOTICFES, new IDVariant(IDL.Add((new IDVariant(BUK_CONTQUASHLIB.BoxToolTip(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1))), MainFrm.ESERCIZIO)));
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQ1, new IDVariant(IDL.Add((new IDVariant(BUK_CONTQUASHLIB.BoxToolTip(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1))), IMDB.Value(IMDBDef15.PQRY_PARAMETRI559, IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, 0))));
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_DETTAGLIO1)
    {
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_PIEDEREPORT1)
    {
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQS1, new IDVariant(BUK_CONTQUASHLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUASHLIB_SEC_PIEDEREPORT1,"RECORDIMPONI")));
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQS1, new IDVariant(BUK_CONTQUASHLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUASHLIB_SEC_PIEDEREPORT1,"RECORDRITENU")));
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_INTESTREPORT)
    {
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_UPTEPATOTICE, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_CONTQUASHLIB.BoxToolTip(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA))), MainFrm.ESERCIZIO))));
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQP, new IDVariant(IDL.Add((new IDVariant(BUK_CONTQUASHLIB.BoxToolTip(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI))), IMDB.Value(IMDBDef15.PQRY_PARAMETRI559, IMDBDef15.PQSL_PARAMETRI559_PARAMQUADRO, 0))));
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CONTQUASHLIB_SEC_PIEDEREPORT)
    {
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQSL, new IDVariant(BUK_CONTQUASHLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUASHLIB_SEC_PIEDEREPORT,"RECORDIMPONI")));
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQSL, new IDVariant(BUK_CONTQUASHLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUASHLIB_SEC_PIEDEREPORT,"RECORDRITENU")));
    }
  }

  private void BUK_CONTQUASHLIB_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTQUASHLIB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTQUASHLIB_MST_CONTQUASHMAS)
    {
      BUK_CONTQUASHLIB.set_SpanValue(BUK_CONTQUASHLIB_SPAN_CPTSCQSLCQPN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTQUASHLIB.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_CONTQUASHLIB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTQUASHLIB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTQUASHLIB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTQUASHLIB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTQUASHLIB_OnPreview()
  {
    PreviewBook = BKW_CONTQUASHLIB;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, "7E19127E-4AFF-413F-BF08-1AE4C1CBC8CE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, "Quadro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, "ECA5ADE3-218E-41FE-8A11-596B1226A079");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, "Importi Troncati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "B9D7D8CF-9923-4C82-9F9F-5B6EB54892EC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_LIST, "Quadro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_FORM, 60, 20, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_QUADRO, MyGlb.PANEL_FORM, "Quadro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_QUADRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_QUADRO, PPQRY_PARAMETRI559, "A.PARAMQUADRO", "PARAMQUADRO", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_LIST, "Imp. Tronc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_FORM, 32, 56, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTTRONCA, MyGlb.PANEL_FORM, "Importi Troncati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPORTTRONCA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPORTTRONCA, PPQRY_PARAMETRI559, "A.PARAIMPOTRON", "PARAIMPOTRON", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_IMPORTTRONCA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_IMPORTTRONCA, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 80, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.QUADRO as T62QUADRO, ");
    SQL.append("  A.QUADRO as T62DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T62 A ");
    SQL.append("where (A.QUADRO = ~~PARAMQUADRO~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_T63, 0, SQL, PFL_PARAMETRI_QUADRO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.QUADRO as T62QUADRO, ");
    SQL.append("  A.QUADRO as T62DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T62 A ");
    PAN_PARAMETRI.SetQuery(PPQRY_T63, 1, SQL, PFL_PARAMETRI_QUADRO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T63, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI559", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI559, IMDBDef15.PQRY_PARAMETRI559_RS, IMDBDef5.TBL_PARAMETRI575);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_QUADRO, IMDBDef5.FLD_PARAMETRI575_PARAMQUADRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPORTTRONCA, IMDBDef5.FLD_PARAMETRI575_PARAIMPOTRON);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI575");
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

  private void BUK_CONTQUADLIBR_MST_CONTQUADMAST_Init()
  {
    BUK_CONTQUADLIBR.InitMastro(BUK_CONTQUADLIBR_MST_CONTQUADMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_MST_CONTQUADMAST, "2CBB3480-35DD-40F4-AC59-F8593E455188");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_MST_CONTQUADMAST, "CONTQUADMAST");
    BUK_CONTQUADLIBR.InitMastroBox(BUK_CONTQUADLIBR_MST_CONTQUADMAST, BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Controllo Quadri", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2, "41CAF42D-3772-47EB-9C44-9EF3371E277F");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2, "TESTATPAGIN2");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_TESTATPAGIN2, BUK_CONTQUADLIBR_SPAN_UPTEPATOTIC1, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384961, "Modello 770", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_UPTEPATOTIC1, "B891E0FD-22F1-4752-AB7A-C7DC3D6C4D02");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_UPTEPATOTIC1, "UPTEPATOTIC1");
    BUK_CONTQUADLIBR.InitMastroBox(BUK_CONTQUADLIBR_MST_CONTQUADMAST, BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2, 1000, 2000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Quadro ", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2, "EFF6EDF4-D81B-45B6-8376-7686A63147DE");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2, "SOTTTESTPAG2");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SOTTTESTPAG2, BUK_CONTQUADLIBR_SPAN_SOTEPTTPQCQ2, MyGlb.VIS_TITREPNOBOCE, 5, 101, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_SOTEPTTPQCQ2, "FA4F7217-27B3-4346-A020-60E6B8637D34");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_SOTEPTTPQCQ2, "SOTEPTTPQCQ2");
    BUK_CONTQUADLIBR.InitMastroBox(BUK_CONTQUADLIBR_MST_CONTQUADMAST, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1, 1000, 3000, 27700, 16800, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1, "08AC667D-FC57-48F8-90B3-F1C1055D7DFA");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1, "CORPOPAGINA1");
    BUK_CONTQUADLIBR.InitMastroBox(BUK_CONTQUADLIBR_MST_CONTQUADMAST, BUK_CONTQUADLIBR_RPTBOX_NUMEROPAGIN1, 26000, 300, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_NUMEROPAGIN1, "CFCCAB10-4E2F-447A-9D1F-D27ED5B84E0C");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_NUMEROPAGIN1, BUK_CONTQUADLIBR_SPAN_CPTSCQLCQPND, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_CPTSCQLCQPND, "F7591D58-A840-4C96-A029-3FB8F0B88E90");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_CPTSCQLCQPND, "CPTSCQLCQPND");
  }

  private void BUK_CONTQUADLIBR_RPT_CONTQUADREPO_InitQuery() { BUK_CONTQUADLIBR_RPT_CONTQUADREPO_InitQuery(true, true); }
  private void BUK_CONTQUADLIBR_RPT_CONTQUADREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RAG_SOC as RECORDRAGSOC, ");
      SQL.append("  A.BENEFICIARIO as RECORDBENEFI, ");
      SQL.append("  A.DES_ABBR as RECORDESABBR, ");
      SQL.append("  A.CAUSALE as RECORDCAUSAL, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.SOMME_NON_SOGGETTE, 0), A.SOMME_NON_SOGGETTE) as RECSOMNONSOG, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.IMPONIBILE, 0), A.IMPONIBILE) as RECORDIMPONI, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.RITENUTE, 0), A.RITENUTE) as RECORDRITENU, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.ADDIZIONALE_REGIONALE, 0), A.ADDIZIONALE_REGIONALE) as RECOADDIREGI, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.IMPORTO_CORRISPOSTO, 0), A.IMPORTO_CORRISPOSTO) as RECOIMPOCORR, ");
      SQL.append("  A.ALIQUOTA as RECORDALIQUO, ");
      SQL.append("  A.INDIRIZZO as RECORDINDIRI, ");
      SQL.append("  A.DESCR_COMUNE as RECODESCCOMU, ");
      SQL.append("  A.SIGLA_PROVINCIA as RECOSIGLPROV, ");
      SQL.append("  A.DESCR_COMUNE || ' ' || A.SIGLA_PROVINCIA as RECCOEPRDOFI, ");
      SQL.append("  A.DATA_NASCITA as RECODATANASC, ");
      SQL.append("  A.COMUNE_NASCITA as RECOCOMUNASC, ");
      SQL.append("  A.PROV_NASCITA as RECOPROVNASC, ");
      SQL.append("  A.COMUNE_NASCITA || ' ' || A.PROV_NASCITA as RECCOMEPRONA, ");
      SQL.append("  A.CODICE_FISCALE as RECOCODIFISC, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.RITENUTE_COM, 0), A.RITENUTE_COM) as RECORRITECOM, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.RITENUTE_INPS, 0), A.RITENUTE_INPS) as RECORITEINPS, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(A.RITENUTE_INPS_CE, 0), A.RITENUTE_INPS_CE) as RECORITINPCE ");
      SQL.append("from ");
      SQL.append("  VISTA_CONTROLLO_770 A ");
      SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.DATA_RIF_RITENUTE = " + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.QUADRO = ~~PQRY_PARAMETRI559.PARAMQUADRO~~) ");
      BUK_CONTQUADLIBR.SetReportQuery(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "153BBE04-5744-4D62-845B-1F1426486307");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTQUADLIBR_RPT_CONTQUADREPO_Init()
  {
    BUK_CONTQUADLIBR.InitReport(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, 196865);
    BUK_CONTQUADLIBR_RPT_CONTQUADREPO_InitQuery(true, false);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, "6BCAB207-19D3-40F0-BE3A-F80993ED2D56");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, "CONTQUADREPO");
    BUK_CONTQUADLIBR.InitSection(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, BUK_CONTQUADLIBR_SEC_INTESTREPORT, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUADLIBR.SetSectionRendersInto(BUK_CONTQUADLIBR_SEC_INTESTREPORT, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SEC_INTESTREPORT, "F92131CF-03B8-4071-8DBB-3DA89CE8468C");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTQUADLIBR.InitSection(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, BUK_CONTQUADLIBR_SEC_INTESTPAGINA, 2500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUADLIBR.SetSectionRendersInto(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, "34D6DF8A-4FB4-4D46-BFCF-2569356077EB");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_RAGSOCHEADE1, 0, 100, 15400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RAGSOCHEADE1, "E85890A2-CE7D-43AE-AC8B-B1B62AB44099");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RAGSOCHEADE1, "RAGSOCHEADE1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RAGSOCHEADE1, BUK_CONTQUADLIBR_SPAN_COGNNOMEODE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Cognome / Nome o Denominazione", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_COGNNOMEODE1, "157DDEBF-66FE-4054-B4D8-DA2317F18207");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_COGNNOMEODE1, "COGNNOMEODE1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_INDIRIHEADE1, 0, 700, 6800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_INDIRIHEADE1, "BB4F5220-2A1F-41F7-BE44-3DBC164B1C49");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_INDIRIHEADE1, "INDIRIHEADE1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_INDIRIHEADE1, BUK_CONTQUADLIBR_SPAN_VIAENUMECIV1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Via e Numero Civico", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_VIAENUMECIV1, "20E9C5D1-8FBA-451D-A127-171E7775F04D");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_VIAENUMECIV1, "VIAENUMECIV1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_DATANASCHEAD, 0, 1300, 6800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_DATANASCHEAD, "4356F2DE-E7CD-4FC6-ADA9-F0F5A8599AF2");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_DATANASCHEAD, "DATANASCHEAD");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_DATANASCHEAD, BUK_CONTQUADLIBR_SPAN_DATADINASCI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data di Nascita", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_DATADINASCI1, "C913E193-E7AB-4152-AA14-272ADFFAA08E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_DATADINASCI1, "DATADINASCI1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_CODIFISCHEAD, 0, 1900, 15400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_CODIFISCHEAD, "14971686-3143-46FD-8911-E0440025543B");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_CODIFISCHEAD, "CODIFISCHEAD");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_CODIFISCHEAD, BUK_CONTQUADLIBR_SPAN_CODICEFISCA1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_CODICEFISCA1, "DB3BA170-0AFB-4EF2-A546-56EFA1BE4F25");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_CODICEFISCA1, "CODICEFISCA1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_COMEPRDOFIH1, 6900, 700, 8500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_COMEPRDOFIH1, "F4B546E5-76EA-492B-9830-43AE0B6261A0");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_COMEPRDOFIH1, "COMEPRDOFIH1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_COMEPRDOFIH1, BUK_CONTQUADLIBR_SPAN_COOSTESDEDO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Comune o Stato Estero del Domicilio Fiscale", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_COOSTESDEDO1, "0C10BA14-3C1D-456B-B4E9-FA607E09ECE7");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_COOSTESDEDO1, "COOSTESDEDO1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_COMEPRONASH1, 6900, 1300, 8500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_COMEPRONASH1, "6BE17CF1-E358-4B55-91F4-A063F19A9904");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_COMEPRONASH1, "COMEPRONASH1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_COMEPRONASH1, BUK_CONTQUADLIBR_SPAN_COMOSTESDIN1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Comune o Stato Estero di Nascita", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_COMOSTESDIN1, "8DA7DC61-BC8E-4FDC-B19F-EFA66CF701F9");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_COMOSTESDIN1, "COMOSTESDIN1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_CAUSALHEADE1, 15500, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_CAUSALHEADE1, "94AC4F9B-AA99-423A-AB74-3B0ED3C145B2");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_CAUSALHEADE1, "CAUSALHEADE1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_CAUSALHEADE1, BUK_CONTQUADLIBR_SPAN_CAUSALE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Causale", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_CAUSALE1, "33326C62-D3AF-4F8B-B2B4-007D0F60F2B5");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_CAUSALE1, "CAUSALE1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_ALIQUOHEADER, 15500, 700, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_ALIQUOHEADER, "5878AB31-000E-47A4-B996-DB16790E384E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_ALIQUOHEADER, "ALIQUOHEADER");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_ALIQUOHEADER, BUK_CONTQUADLIBR_SPAN_ALIQUOTA2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_ALIQUOTA2, "04CE89E7-11FE-486A-A909-AAA013056E79");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_ALIQUOTA2, "ALIQUOTA2");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_IMPONIHEADE3, 17200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_IMPONIHEADE3, "058CFF9F-6041-419A-9A32-A76745F84BA1");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_IMPONIHEADE3, "IMPONIHEADE3");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_IMPONIHEADE3, BUK_CONTQUADLIBR_SPAN_IMPONIBILE2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_IMPONIBILE2, "CED3C76D-4F3E-4CFC-B1A8-81B847969900");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_IMPONIBILE2, "IMPONIBILE2");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_RITENUHEADE3, 17200, 700, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENUHEADE3, "64E419B0-702F-4325-AA55-CEA85B236B4D");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENUHEADE3, "RITENUHEADE3");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENUHEADE3, BUK_CONTQUADLIBR_SPAN_RITENUTE2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RITENUTE2, "ADCD8A21-38EE-4AD2-99B5-6675582A7CAE");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RITENUTE2, "RITENUTE2");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_RITEINPSHEAD, 17200, 1300, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITEINPSHEAD, "EA1DE5FC-2589-462A-9029-E2D8FE8E3649");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITEINPSHEAD, "RITEINPSHEAD");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITEINPSHEAD, BUK_CONTQUADLIBR_SPAN_RITENUTEINP1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute Inps", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RITENUTEINP1, "AD2C1B1F-CE39-4D05-9EB1-1A97EE7AD1D1");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RITENUTEINP1, "RITENUTEINP1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_RITEINPCEHEA, 17200, 1800, 3600, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITEINPCEHEA, "226B9C4A-6DE6-4A79-A117-6E535AD18804");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITEINPCEHEA, "RITEINPCEHEA");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITEINPCEHEA, BUK_CONTQUADLIBR_SPAN_RITEINPSENTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute Inps Ente", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RITEINPSENTE, "5E8DFD03-A162-4FEF-9CDC-8C699FCE585F");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RITEINPSENTE, "RITEINPSENTE");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_SOMNONSOGHE1, 20900, 100, 3300, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SOMNONSOGHE1, "2124F943-4A5F-4ADA-B5E2-A1499415D10F");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SOMNONSOGHE1, "SOMNONSOGHE1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SOMNONSOGHE1, BUK_CONTQUADLIBR_SPAN_SOMMENONSOG1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Somme Non Soggette", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_SOMMENONSOG1, "7EF8C019-9B51-406B-A794-B93554E3BA34");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_SOMMENONSOG1, "SOMMENONSOG1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_ADDIREGIHEA1, 20900, 1300, 3300, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_ADDIREGIHEA1, "8BE05F9D-6EF3-48BB-900E-6E4F57B24177");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_ADDIREGIHEA1, "ADDIREGIHEA1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_ADDIREGIHEA1, BUK_CONTQUADLIBR_SPAN_ADDIZIREGIO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Addizionale Regionale", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_ADDIZIREGIO1, "163F8C4C-076C-4DB2-96F5-428C1018AC31");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_ADDIZIREGIO1, "ADDIZIREGIO1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_IMPOCORRHEA1, 24300, 100, 3300, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_IMPOCORRHEA1, "D677A68A-D530-4B57-A03D-E673B657BC74");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_IMPOCORRHEA1, "IMPOCORRHEA1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_IMPOCORRHEA1, BUK_CONTQUADLIBR_SPAN_IMPORTCORRI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo Corrisposto", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_IMPORTCORRI1, "66DBFA1B-2F12-4050-AC9D-81178A813F7E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_IMPORTCORRI1, "IMPORTCORRI1");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_INTESTPAGINA, BUK_CONTQUADLIBR_RPTBOX_RITENCOMHEAD, 24300, 1300, 3300, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENCOMHEAD, "24ADCC87-35BB-40FF-B7D9-2172F776BB3E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENCOMHEAD, "RITENCOMHEAD");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENCOMHEAD, BUK_CONTQUADLIBR_SPAN_ADDIZICOMUNA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Addizionale Comunale", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_ADDIZICOMUNA, "C7B7D6B2-FA0B-4CAD-983A-86CF0ADDF152");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_ADDIZICOMUNA, "ADDIZICOMUNA");
    BUK_CONTQUADLIBR.InitSection(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, BUK_CONTQUADLIBR_SEC_DETTAGLIO, 2500, 1, 0, 4, MyGlb.VIS_LINEAORIZZON, 10027009, "");
    BUK_CONTQUADLIBR.SetSectionRendersInto(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SEC_DETTAGLIO, "BD27BFF9-AAA0-4F69-A4D3-95B88CDE47F3");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_RAGSOC1, 0, 100, 15400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RAGSOC1, "4B6F8AAD-2A97-4698-B071-D906F99CA7B6");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RAGSOC1, "RAGSOC1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RAGSOC1, BUK_CONTQUADLIBR_SPAN_RERASOCOQC7L, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::RECORDRAGSOC", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RERASOCOQC7L, "B2A96981-C3CF-4B7D-AE01-67CF22311F71");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RERASOCOQC7L, "RERASOCOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_INDIRIZZO1, 0, 700, 6800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_INDIRIZZO1, "6F29E880-CD35-4B73-83FB-AF3FD6BD9D90");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_INDIRIZZO1, "INDIRIZZO1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_INDIRIZZO1, BUK_CONTQUADLIBR_SPAN_REINCOQUCO7L, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::RECORDINDIRI", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_REINCOQUCO7L, "27180513-AC86-488A-B563-E96FAE92253E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_REINCOQUCO7L, "REINCOQUCO7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_DATANASCITA, 0, 1300, 6800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_DATANASCITA, "CF361223-855B-4782-A779-ABEC5A8F851A");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_DATANASCITA, "DATANASCITA");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_DATANASCITA, BUK_CONTQUADLIBR_SPAN_REDANACOQC7L, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::RECODATANASC", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_REDANACOQC7L, "A91D2412-E2C1-4AD6-AC57-BA2FEBD10493");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_REDANACOQC7L, "REDANACOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_CODICEFISCAL, 0, 1900, 15400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_CODICEFISCAL, "09465772-0429-4EA2-81AD-1FE7E3873E41");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_CODICEFISCAL, "CODICEFISCAL");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_CODICEFISCAL, BUK_CONTQUADLIBR_SPAN_RECOFICOQC7L, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "", "::RECOCODIFISC", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RECOFICOQC7L, "5B259914-DAF3-4342-9683-0E8F887206F7");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RECOFICOQC7L, "RECOFICOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_COMEPRODOMF1, 6900, 700, 8500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_COMEPRODOMF1, "20EBC1F0-07E2-424A-A7EC-66217C6243BC");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_COMEPRODOMF1, "COMEPRODOMF1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_COMEPRODOMF1, BUK_CONTQUADLIBR_SPAN_RECEPDFCQC7L, MyGlb.VIS_DEFAREPOSTYL, 5, 43, 0, 271384705, "VISTA CONTROLLO 770 DESCR COMUNE +c Space +c VISTA CONTROLLO 770 SIGLA PROVINCIA", "::RECCOEPRDOFI", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RECEPDFCQC7L, "9313E901-BAA7-4D1B-A4F7-1F8C1F96EF8D");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RECEPDFCQC7L, "RECEPDFCQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_COMUEPROVNA1, 6900, 1300, 8500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_COMUEPROVNA1, "F6343555-56DD-4B53-9E9F-E24B4AF37DF8");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_COMUEPROVNA1, "COMUEPROVNA1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_COMUEPROVNA1, BUK_CONTQUADLIBR_SPAN_RECOEPNCQC7L, MyGlb.VIS_DEFAREPOSTYL, 5, 43, 0, 271384705, "VISTA CONTROLLO 770 COMUNE NASCITA +c Space +c VISTA CONTROLLO 770 PROV NASCITA", "::RECCOMEPRONA", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RECOEPNCQC7L, "9A5F1255-B020-44EA-BA09-4BE036FF7A9D");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RECOEPNCQC7L, "RECOEPNCQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_CAUSALE1, 15500, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_CAUSALE1, "A58806C6-4E96-463D-A022-A4E20473DEA2");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_CAUSALE1, "CAUSALE1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_CAUSALE1, BUK_CONTQUADLIBR_SPAN_RECACOQUCO7L, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::RECORDCAUSAL", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RECACOQUCO7L, "5040D15F-AE1A-4A28-A9B7-A8FF68494249");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RECACOQUCO7L, "RECACOQUCO7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_ALIQUOTA, 15500, 700, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_ALIQUOTA, "2BA5453B-C978-4AC8-9178-5FE54E60DCA2");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_ALIQUOTA, "ALIQUOTA");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_ALIQUOTA, BUK_CONTQUADLIBR_SPAN_REALCOQUCO7L, MyGlb.VIS_DEFAREPOSTYL, 2, 15, 0, 271384705, "", "::RECORDALIQUO", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_REALCOQUCO7L, "412AB166-2980-48E6-8EEF-71A889371DF3");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_REALCOQUCO7L, "REALCOQUCO7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_IMPONIBILE2, 17200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_IMPONIBILE2, "BB885857-DCBF-4E3B-837F-107CC2456AF1");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_IMPONIBILE2, "IMPONIBILE2");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_IMPONIBILE2, BUK_CONTQUADLIBR_SPAN_REIMCOQUCO7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 IMPONIBILE, Zero), VISTA CONTROLLO 770 IMPONIBILE)", "::RECORDIMPONI", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_REIMCOQUCO7L, "BE35D5DA-0B60-46C8-9A9B-B50D596EF2C9");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_REIMCOQUCO7L, "REIMCOQUCO7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_RITENUTE3, 17200, 700, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENUTE3, "E8D1D5AD-3167-4F58-AD91-39ED4F86B794");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENUTE3, "RITENUTE3");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENUTE3, BUK_CONTQUADLIBR_SPAN_RERICOQUCO7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE, Zero), VISTA CONTROLLO 770 RITENUTE)", "::RECORDRITENU", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RERICOQUCO7L, "60B92170-65AC-48FA-8CE7-259D1F884745");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RERICOQUCO7L, "RERICOQUCO7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_RITENUTEINPS, 17200, 1300, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENUTEINPS, "B0BE66CD-1354-4C1D-822C-63D69B3F0ECB");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENUTEINPS, "RITENUTEINPS");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENUTEINPS, BUK_CONTQUADLIBR_SPAN_RERIINCOQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE INPS, Zero), VISTA CONTROLLO 770 RITENUTE INPS)", "::RECORITEINPS", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RERIINCOQC7L, "CD0234BB-C1C1-4956-B67E-5EA78DB76327");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RERIINCOQC7L, "RERIINCOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_RITENUINPSCE, 17200, 1800, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENUINPSCE, "8E844DFF-06CE-4012-9B5F-B2C661B967E4");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENUINPSCE, "RITENUINPSCE");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENUINPSCE, BUK_CONTQUADLIBR_SPAN_RERIINCCQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE INPS CE, Zero), VISTA CONTROLLO 770 RITENUTE INPS CE)", "::RECORITINPCE", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RERIINCCQC7L, "AFE3CD55-42AB-47A2-80F7-7CE25A4F9A2E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RERIINCCQC7L, "RERIINCCQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_SOMMENONSOG1, 20900, 100, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SOMMENONSOG1, "D3A90270-74DC-4033-B453-8CBD90AF8E12");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SOMMENONSOG1, "SOMMENONSOG1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SOMMENONSOG1, BUK_CONTQUADLIBR_SPAN_RESONOSCQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 SOMME NON SOGGETTE, Zero), VISTA CONTROLLO 770 SOMME NON SOGGETTE)", "::RECSOMNONSOG", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RESONOSCQC7L, "A2AFA9F1-B60B-4747-BADF-9C0BA9CC8C06");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RESONOSCQC7L, "RESONOSCQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_ADDIZIREGIO1, 20900, 700, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_ADDIZIREGIO1, "2430B3C5-E37D-4BDD-8FDE-75B2722B3CDE");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_ADDIZIREGIO1, "ADDIZIREGIO1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_ADDIZIREGIO1, BUK_CONTQUADLIBR_SPAN_READRECOQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 ADDIZIONALE REGIONALE, Zero), VISTA CONTROLLO 770 ADDIZIONALE REGIONALE)", "::RECOADDIREGI", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_READRECOQC7L, "446A90D9-9B26-4C16-9701-4ED0FFF85D95");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_READRECOQC7L, "READRECOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_IMPORTCORRI1, 24300, 100, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_IMPORTCORRI1, "0DD29CC5-F2EF-4195-90D4-84E0A04E71FA");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_IMPORTCORRI1, "IMPORTCORRI1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_IMPORTCORRI1, BUK_CONTQUADLIBR_SPAN_REIMCOCOQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 IMPORTO CORRISPOSTO, Zero), VISTA CONTROLLO 770 IMPORTO CORRISPOSTO)", "::RECOIMPOCORR", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_REIMCOCOQC7L, "7DEA054D-7BF5-4A6C-9799-70A31ABE974E");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_REIMCOCOQC7L, "REIMCOCOQC7L");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_DETTAGLIO, BUK_CONTQUADLIBR_RPTBOX_RITENUTECOM, 24300, 800, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_RITENUTECOM, "156F21E8-0965-44C8-8EB3-1200CEF67E6C");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_RITENUTECOM, "RITENUTECOM");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_RITENUTECOM, BUK_CONTQUADLIBR_SPAN_RERICOCOQC7L, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE COM, Zero), VISTA CONTROLLO 770 RITENUTE COM)", "::RECORRITECOM", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_RERICOCOQC7L, "A366F432-A6E9-46E9-A83E-773DEFEBEC87");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_RERICOCOQC7L, "RERICOCOQC7L");
    BUK_CONTQUADLIBR.InitSection(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, BUK_CONTQUADLIBR_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTQUADLIBR.SetSectionRendersInto(BUK_CONTQUADLIBR_SEC_PIEDEPAGINA, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SEC_PIEDEPAGINA, "93E98ECA-B5C6-48C4-99DD-B9740C4F9DCF");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTQUADLIBR.InitSection(BUK_CONTQUADLIBR_RPT_CONTQUADREPO, BUK_CONTQUADLIBR_SEC_PIEDEREPORT, 2400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUADLIBR.SetSectionRendersInto(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, "A69FCA5E-A8A8-4705-9FAA-450A8F1B6D32");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPONI2, 17200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPONI2, "2E5D89DA-C487-4E27-98BA-2B13A87394F0");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPONI2, "SUMOFIMPONI2");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPONI2, BUK_CONTQUADLIBR_SPAN_PIRESRICQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRESRICQCQL, "00D62897-7F96-4F9D-B74B-C5485022807C");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRESRICQCQL, "PIRESRICQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFRITENU2, 17200, 700, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITENU2, "CF4FA99F-9D25-422E-905B-4DBDE6CC1565");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITENU2, "SUMOFRITENU2");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITENU2, BUK_CONTQUADLIBR_SPAN_PIRESRRCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRESRRCQCQL, "79DBA24B-0111-4B83-9486-D7719542EDBF");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRESRRCQCQL, "PIRESRRCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFRITEINP, 17200, 1300, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITEINP, "DFC432F7-8984-43C3-98C1-5921078B4FE7");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITEINP, "SUMOFRITEINP");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITEINP, BUK_CONTQUADLIBR_SPAN_PIRSRRICQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRSRRICQCQL, "5CCF0417-996D-453A-8592-609C5AD83AEF");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRSRRICQCQL, "PIRSRRICQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFRITINCE, 17200, 1900, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITINCE, "E0E5000C-2439-4F78-9205-CE4AE8B3E749");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITINCE, "SUMOFRITINCE");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITINCE, BUK_CONTQUADLIBR_SPAN_PRSRRICCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PRSRRICCQCQL, "3BF07B42-8996-4D2E-A0F7-A8B481280C5C");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PRSRRICCQCQL, "PRSRRICCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFSOMNOSO, 20900, 100, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFSOMNOSO, "5030F187-72EA-4659-8456-7133DB2EE50B");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFSOMNOSO, "SUMOFSOMNOSO");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFSOMNOSO, BUK_CONTQUADLIBR_SPAN_PRSRSNSCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PRSRSNSCQCQL, "A7BAF256-A18D-4958-82FC-6D897CB3C645");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PRSRSNSCQCQL, "PRSRSNSCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFADDIREG, 20900, 700, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFADDIREG, "67921396-CAA2-45E0-9D0C-BA631384022B");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFADDIREG, "SUMOFADDIREG");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFADDIREG, BUK_CONTQUADLIBR_SPAN_PIRSRARCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRSRARCQCQL, "0B3D6532-90D2-47CA-B9FE-1B358B087048");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRSRARCQCQL, "PIRSRARCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPOCOR, 24300, 100, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPOCOR, "9FD8B0D9-3D3B-43C3-A8A1-B676E465C395");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPOCOR, "SUMOFIMPOCOR");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFIMPOCOR, BUK_CONTQUADLIBR_SPAN_PIRSRICCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRSRICCQCQL, "518D275A-D82E-4086-BF63-FD49B0927734");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRSRICCQCQL, "PIRSRICCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_SUMOFRITECOM, 24300, 700, 3300, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITECOM, "65EA5AC3-E362-4C49-A5F3-F5C05742F7EC");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITECOM, "SUMOFRITECOM");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_SUMOFRITECOM, BUK_CONTQUADLIBR_SPAN_PIRSRRCCQCQL, MyGlb.VIS_IMPORTO, 2, 19, 0, 271384705, "", "", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_PIRSRRCCQCQL, "6181F13F-AE26-42E2-9F90-AF9661FE0515");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_PIRSRRCCQCQL, "PIRSRRCCQCQL");
    BUK_CONTQUADLIBR.InitReportBox(BUK_CONTQUADLIBR_SEC_PIEDEREPORT, BUK_CONTQUADLIBR_RPTBOX_TOTALI1, 15500, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_RPTBOX_TOTALI1, "FCD0AA93-FFE5-4609-A0AC-9D1CD49D0C3D");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_RPTBOX_TOTALI1, "TOTALI1");
    BUK_CONTQUADLIBR.InitBoxSpan(BUK_CONTQUADLIBR_RPTBOX_TOTALI1, BUK_CONTQUADLIBR_SPAN_TOTALI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totali", 1);
    BUK_CONTQUADLIBR.SetRTCGuid(BUK_CONTQUADLIBR_SPAN_TOTALI1, "B50DF78F-53D3-4818-98C0-6A62AFBFD448");
    BUK_CONTQUADLIBR.SetObjCode(BUK_CONTQUADLIBR_SPAN_TOTALI1, "TOTALI1");
    BUK_CONTQUADLIBR_RPT_CONTQUADREPO_InitQuery(false, true);
  }

  private void BUK_CONTQUADLIBR_InitLinks()
  {
    BUK_CONTQUADLIBR.SetBoxNextBox(BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1, BUK_CONTQUADLIBR_RPTBOX_CORPOPAGINA1);
  }

  private void BUK_CONTQUASHLIB_MST_CONTQUASHMAS_Init()
  {
    BUK_CONTQUASHLIB.InitMastro(BUK_CONTQUASHLIB_MST_CONTQUASHMAS, 3, 21000, 29700, 1, 2, 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_MST_CONTQUASHMAS, "5CB688AA-7C0E-45E3-A79A-FA5907E4E903");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_MST_CONTQUASHMAS, "CONTQUASHMAS");
    BUK_CONTQUASHLIB.InitMastroBox(BUK_CONTQUASHLIB_MST_CONTQUASHMAS, BUK_CONTQUASHLIB_RPTBOX_NUMEROPAGINA, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_NUMEROPAGINA, "574C4490-DBAD-4135-B6C8-46E7390E44ED");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_NUMEROPAGINA, BUK_CONTQUASHLIB_SPAN_CPTSCQSLCQPN, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_CPTSCQSLCQPN, "966B22D7-8127-4452-BFD5-D9302D01156B");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_CPTSCQSLCQPN, "CPTSCQSLCQPN");
    BUK_CONTQUASHLIB.InitMastroBox(BUK_CONTQUASHLIB_MST_CONTQUASHMAS, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA, 1000, 900, 27700, 18900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA, "B54D301C-7895-4EAE-A04B-3B8E988184B6");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_CONTQUASHLIB_RPT_CONTQUASHREP_InitQuery() { BUK_CONTQUASHLIB_RPT_CONTQUASHREP_InitQuery(true, true); }
  private void BUK_CONTQUASHLIB_RPT_CONTQUASHREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  REPLACE(A.RAGIONE_SOCIALE_ESTESA, '  ', ' / ') as RECORDRAGSOC, ");
      SQL.append("  C.BENEFICIARIO as RECORLIQBENE, ");
      SQL.append("  SUBSTR(B.DES_ABBREVIATA, 1, 1) as RECORDESABBR, ");
      SQL.append("  SUBSTR(B.DES_ABBREVIATA, 1, 1) as RECORDCAUSAL, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(SUM(C.IMPONIBILE), 0), SUM(C.IMPONIBILE)) as RECORDIMPONI, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(SUM(C.RITENUTE_IRPEF), 0), SUM(C.RITENUTE_IRPEF)) as RECORDRITENU, ");
      SQL.append("  C.ALIQUOTA as RECORLIQALIQ, ");
      SQL.append("  MAX(NVL(A.DOMICILIO, A.INDIRIZZO)) as RECORDINDIRI, ");
      SQL.append("  MAX(NVL(ComuniDom.DENOMINAZIONE, E.DENOMINAZIONE)) as RECODESCCOMU, ");
      SQL.append("  MAX(NVL(ProvDom.SIGLA, F.SIGLA)) as RECOSIGLPROV, ");
      SQL.append("  MAX(NVL(ComuniDom.DENOMINAZIONE, E.DENOMINAZIONE) || ' ' || NVL(ProvDom.SIGLA, F.SIGLA)) as RECCOEPRDOFI, ");
      SQL.append("  MAX(A.D_DATA_NASCITA) as REVISODDDANA, ");
      SQL.append("  MAX(G.DENOMINAZIONE) as RECOCOMUNASC, ");
      SQL.append("  MAX(H.SIGLA) as RECOPROVNASC, ");
      SQL.append("  MAX(G.DENOMINAZIONE || ' ' || H.SIGLA) as RECCOMEPRONA, ");
      SQL.append("  MAX(A.CODICE_FISCALE) as RECVISSOCOFI ");
      SQL.append("from ");
      SQL.append("  BEN A, ");
      SQL.append("  T62 B, ");
      SQL.append("  LIQ C, ");
      SQL.append("  MAN D, ");
      SQL.append("  AD4_COMUNI E, ");
      SQL.append("  AD4_PROVINCIE F, ");
      SQL.append("  AD4_COMUNI G, ");
      SQL.append("  AD4_PROVINCIE H, ");
      SQL.append("  AD4_COMUNI ComuniDom, ");
      SQL.append("  AD4_PROVINCIE ProvDom ");
      SQL.append("where (NOT ((C.CODICE IS NULL))) ");
      SQL.append("and   (B.CODICE = C.CAUSALE_IRPEF) ");
      SQL.append("and   (A.CODICE = C.BENEFICIARIO) ");
      SQL.append("and   (D.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append("and   (C.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((C.NUMERO_MAND IS NULL))) ");
      SQL.append("and   (A.PROVINCIA_DOMICILIO = ComuniDom.PROVINCIA_STATO(+)) ");
      SQL.append("and   (A.COMUNE_DOMICILIO = ComuniDom.COMUNE(+)) ");
      SQL.append("and   (A.PROVINCIA_DOMICILIO = ProvDom.PROVINCIA(+)) ");
      SQL.append("and   (A.PROVINCIA = E.PROVINCIA_STATO(+)) ");
      SQL.append("and   (A.COMUNE = E.COMUNE(+)) ");
      SQL.append("and   (A.PROVINCIA = F.PROVINCIA(+)) ");
      SQL.append("and   (A.PROVINCIA_NASCITA = G.PROVINCIA_STATO(+)) ");
      SQL.append("and   (A.COMUNE_NASCITA = G.COMUNE(+)) ");
      SQL.append("and   (A.PROVINCIA_NASCITA = H.PROVINCIA(+)) ");
      SQL.append("and   (B.QUADRO = 'SH') ");
      SQL.append("group by ");
      SQL.append("  REPLACE(A.RAGIONE_SOCIALE_ESTESA, '  ', ' / '), ");
      SQL.append("  C.BENEFICIARIO, ");
      SQL.append("  SUBSTR(B.DES_ABBREVIATA, 1, 1), ");
      SQL.append("  C.ALIQUOTA ");
      BUK_CONTQUASHLIB.SetReportQuery(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D80F0009-E2F9-46CC-AFEA-56097989D501");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTQUASHLIB_RPT_CONTQUASHREP_Init()
  {
    BUK_CONTQUASHLIB.InitReport(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, 196865);
    BUK_CONTQUASHLIB_RPT_CONTQUASHREP_InitQuery(true, false);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, "611CA032-BDBE-4168-95DC-CB69B48AA0A6");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, "CONTQUASHREP");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, BUK_CONTQUASHLIB_SEC_INTESTREPOR1, 1100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_INTESTREPOR1, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_INTESTREPOR1, "392C3888-F51D-4BF2-A445-12706F93CC8B");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_INTESTREPOR1, "INTESTREPOR1");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, BUK_CONTQUASHLIB_SEC_INTESTPAGINA, 5200, 1, 0, 2, MyGlb.VIS_LINEAORIZZON, 8978433, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, "7563EE4F-01A7-4A91-AB85-B44150D1858D");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1, 0, 0, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Controllo Quadri", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1, "6C096C37-3438-469F-BD55-0555E4E667B2");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1, "TESTATPAGIN1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGIN1, BUK_CONTQUASHLIB_SPAN_TEPATOTICFES, MyGlb.VIS_TITREPNOBOCE, 5, 114, 0, 271384961, "Modello 770", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_TEPATOTICFES, "3770228B-65AC-4995-8204-A71C994D81F4");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_TEPATOTICFES, "TEPATOTICFES");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1, 0, 1100, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Quadro ", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1, "F1E9941F-3D54-48F8-A26A-62FB9552BE50");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1, "SOTTTESTPAG1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAG1, BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQ1, MyGlb.VIS_TITREPNOBOCE, 5, 101, 0, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQ1, "0FC034B4-C9DA-4852-B424-25E41FB1EA2E");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQ1, "SOTEPTTPQCQ1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_RAGSOCHEADER, 0, 2800, 15400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RAGSOCHEADER, "707E9BF7-A058-4D3F-A3E8-BB055C4F2F36");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RAGSOCHEADER, "RAGSOCHEADER");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RAGSOCHEADER, BUK_CONTQUASHLIB_SPAN_COGNNOMEODEN, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Cognome / Nome o Denominazione", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_COGNNOMEODEN, "6A5242E8-F87F-47CE-A573-406F4D599312");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_COGNNOMEODEN, "COGNNOMEODEN");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_INDIRIHEADER, 0, 3400, 6800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_INDIRIHEADER, "745C370A-FE54-42C0-A6C6-8B72DD701B64");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_INDIRIHEADER, "INDIRIHEADER");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_INDIRIHEADER, BUK_CONTQUASHLIB_SPAN_VIAENUMECIVI, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Via e Numero Civico", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_VIAENUMECIVI, "0B63AEF3-068C-4463-89C8-53315498782D");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_VIAENUMECIVI, "VIAENUMECIVI");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_VSDDVSDDVSDD, 0, 4000, 6800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_VSDDVSDDVSDD, "9B846430-C9BB-4762-B1F1-3669B477F844");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_VSDDVSDDVSDD, "VSDDVSDDVSDD");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_VSDDVSDDVSDD, BUK_CONTQUASHLIB_SPAN_DATADINASCIT, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data di Nascita", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_DATADINASCIT, "649A4E0D-9CB7-41D7-8C7E-CB57FA10712A");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_DATADINASCIT, "DATADINASCIT");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_VISOVISOCOFH, 0, 4600, 15400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_VISOVISOCOFH, "15F9CBC2-7FAC-4768-953D-DB4FA1061B5C");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_VISOVISOCOFH, "VISOVISOCOFH");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_VISOVISOCOFH, BUK_CONTQUASHLIB_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_CODICEFISCAL, "D7DC4934-C5AD-467E-AD99-794C3CE2AF8C");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_COMEPRDOFIHE, 6900, 3400, 8500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_COMEPRDOFIHE, "CAC95BA1-8C0C-4EFB-9B5E-E9415AEF2371");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_COMEPRDOFIHE, "COMEPRDOFIHE");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_COMEPRDOFIHE, BUK_CONTQUASHLIB_SPAN_COOSTESDEDOF, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Comune o Stato Estero del Domicilio Fiscale", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_COOSTESDEDOF, "5AFF1E4C-51B2-464B-A4FD-417F3B2F31E1");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_COOSTESDEDOF, "COOSTESDEDOF");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_COMEPRONASHE, 6900, 4000, 8500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_COMEPRONASHE, "AC3870B7-8DAF-4904-A866-C2BBD80A57A7");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_COMEPRONASHE, "COMEPRONASHE");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_COMEPRONASHE, BUK_CONTQUASHLIB_SPAN_COMOSTESDINA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Comune o Stato Estero di Nascita", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_COMOSTESDINA, "2ADB3B1E-A030-4E95-9E67-E75507ED85AF");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_COMOSTESDINA, "COMOSTESDINA");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHE1, 23000, 2800, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHE1, "F00B983F-65A2-4346-AFBE-81CE98E8A269");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHE1, "LIQLIQALIHE1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHE1, BUK_CONTQUASHLIB_SPAN_ALIQUOTA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_ALIQUOTA1, "328727F6-7991-4061-A4B6-294C0DFC653F");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_ALIQUOTA1, "ALIQUOTA1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADE1, 15500, 2800, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADE1, "440E726F-6221-4629-A3CC-7BF81D23F1FE");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADE1, "IMPONIHEADE1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADE1, BUK_CONTQUASHLIB_SPAN_IMPONIBILE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_IMPONIBILE1, "6CE9049E-31F1-4469-A620-097BDF3F1D8D");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_IMPONIBILE1, "IMPONIBILE1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTPAGINA, BUK_CONTQUASHLIB_RPTBOX_RITENUHEADE1, 19200, 2800, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADE1, "F4EDDFE1-0610-4AD8-B8BB-59978F6116D0");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADE1, "RITENUHEADE1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADE1, BUK_CONTQUASHLIB_SPAN_RITENUTE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RITENUTE1, "F4ED00F0-B20F-4598-A606-3CF00DF746BE");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RITENUTE1, "RITENUTE1");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, BUK_CONTQUASHLIB_SEC_DETTAGLIO1, 2500, 1, 0, 4, MyGlb.VIS_LINEAORIZZON, 8978433, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, "C40CEBC2-B048-4302-A476-4DCDB2B0A13B");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, "DETTAGLIO1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_RAGSOC, 0, 100, 15400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RAGSOC, "5837B7DE-3AFA-4C1D-BE9E-11067A79550E");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RAGSOC, "RAGSOC");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RAGSOC, BUK_CONTQUASHLIB_SPAN_RERASOCQC7SL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDRAGSOC", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RERASOCQC7SL, "E36C71F9-4701-4B76-B6F5-EC00982A9BE4");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RERASOCQC7SL, "RERASOCQC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_INDIRIZZO, 0, 700, 6800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_INDIRIZZO, "DC476E28-157F-40B5-8E8D-6FD2EB84573E");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_INDIRIZZO, "INDIRIZZO");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_INDIRIZZO, BUK_CONTQUASHLIB_SPAN_REINCOQUC7SL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDINDIRI", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_REINCOQUC7SL, "9C666670-37D9-40FD-813E-5B30009AC5C8");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_REINCOQUC7SL, "REINCOQUC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_VISODDVSDDDN, 0, 1300, 6800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_VISODDVSDDDN, "C33877D8-4AD4-41EF-895F-B4A6D0F475E9");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_VISODDVSDDDN, "VISODDVSDDDN");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_VISODDVSDDDN, BUK_CONTQUASHLIB_SPAN_RVSDDDNCQC7S, MyGlb.VIS_DEFAREPOSTYL, 6, 0, 0, 271384705, "", "::REVISODDDANA", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RVSDDDNCQC7S, "C7810B18-F7EA-40C6-909B-42751CCE8E31");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RVSDDDNCQC7S, "RVSDDDNCQC7S");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_VISSOGCODFIS, 0, 1900, 15400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_VISSOGCODFIS, "C4BDC513-2CF0-4249-B37F-A1A8DA6242B1");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_VISSOGCODFIS, "VISSOGCODFIS");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_VISSOGCODFIS, BUK_CONTQUASHLIB_SPAN_REVSCFCQC7SL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECVISSOCOFI", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_REVSCFCQC7SL, "C7BA819A-4399-46AB-8637-F9C170C44BFB");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_REVSCFCQC7SL, "REVSCFCQC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_COMEPRODOMFI, 6900, 700, 8500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_COMEPRODOMFI, "0C38080A-07E7-411B-A14E-E7E4035AEFA0");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_COMEPRODOMFI, "COMEPRODOMFI");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_COMEPRODOMFI, BUK_CONTQUASHLIB_SPAN_RCEPDFCQC7SL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "VISTA CONTROLLO 770 DESCR COMUNE +c Space +c VISTA CONTROLLO 770 SIGLA PROVINCIA", "::RECCOEPRDOFI", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RCEPDFCQC7SL, "755A10DB-C8B7-4540-8CAF-0786496B14F9");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RCEPDFCQC7SL, "RCEPDFCQC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_COMUEPROVNAS, 6900, 1300, 8500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_COMUEPROVNAS, "FCC4F901-9F86-442F-B477-9A0242184E02");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_COMUEPROVNAS, "COMUEPROVNAS");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_COMUEPROVNAS, BUK_CONTQUASHLIB_SPAN_RECEPNCQC7SL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "VISTA CONTROLLO 770 COMUNE NASCITA +c Space +c VISTA CONTROLLO 770 PROV NASCITA", "::RECCOMEPRONA", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RECEPNCQC7SL, "D41B1362-672D-49F1-984D-1D9F2849CA45");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RECEPNCQC7SL, "RECEPNCQC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA1, 22900, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA1, "C2927299-8986-437B-B251-7D34D5AE7E68");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA1, "LIQALIQUOTA1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA1, BUK_CONTQUASHLIB_SPAN_RELIALCQC7S1, MyGlb.VIS_DEFAREPOSTYL, 3, 4, 6, 271384705, "", "::RECORLIQALIQ", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RELIALCQC7S1, "9FBDBA3B-63D9-456E-848F-96D7CAF3455C");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RELIALCQC7S1, "RELIALCQC7S1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE1, 15500, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE1, "806377A1-36D9-4267-B21E-D6249DE67F07");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE1, "IMPONIBILE1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE1, BUK_CONTQUASHLIB_SPAN_REIMCOQUC7S1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 IMPONIBILE, Zero), VISTA CONTROLLO 770 IMPONIBILE)", "::RECORDIMPONI", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_REIMCOQUC7S1, "C8089582-A148-4DD2-9BB3-5A2CC117C9B2");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_REIMCOQUC7S1, "REIMCOQUC7S1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO1, BUK_CONTQUASHLIB_RPTBOX_RITENUTE1, 19200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RITENUTE1, "CCD60CFD-0688-42D9-B41D-AAA4493A06A3");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RITENUTE1, "RITENUTE1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RITENUTE1, BUK_CONTQUASHLIB_SPAN_RERICOQUC7S1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE, Zero), VISTA CONTROLLO 770 RITENUTE)", "::RECORDRITENU", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RERICOQUC7S1, "7143ACA1-B314-4E90-9AAE-107F2A4FF9AF");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RERICOQUC7S1, "RERICOQUC7S1");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, BUK_CONTQUASHLIB_SEC_PIEDEPAGINA, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_PIEDEPAGINA, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_PIEDEPAGINA, "7FD969E2-7D7B-48E6-B81C-6B041BEC5BB2");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONTQUASHREP, BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, 700, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, "80347A1B-34C8-4B7D-91B4-DA8960C4BF36");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, "PIEDEREPORT1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONI1, 15500, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONI1, "3D55044A-9435-494C-9774-ADF0A9A357FE");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONI1, "SUMOFIMPONI1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONI1, BUK_CONTQUASHLIB_SPAN_PIRSRICQCQS1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQS1, "1B04F989-0BFA-4762-B1A4-ECC261A93434");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQS1, "PIRSRICQCQS1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENU1, 19200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENU1, "DB5C13B3-FBF2-442E-AA8B-5EC71AF1BF33");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENU1, "SUMOFRITENU1");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENU1, BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQS1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQS1, "9EE07EE2-1FFD-45D5-8E61-471A8C4A9736");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQS1, "PIRSRRCQCQS1");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT1, BUK_CONTQUASHLIB_RPTBOX_TOTALI, 13800, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_TOTALI, "C99E0BBD-25C4-476F-B013-88A6465262A4");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_TOTALI, "TOTALI");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_TOTALI, BUK_CONTQUASHLIB_SPAN_TOTALI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totali", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_TOTALI, "20BE21FD-99B9-4ACB-B62E-C20ADB1F5B5A");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_TOTALI, "TOTALI");
    BUK_CONTQUASHLIB_RPT_CONTQUASHREP_InitQuery(false, true);
  }

  private void BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_InitQuery() { BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_InitQuery(true, true); }
  private void BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.ALIQUOTA as RECORLIQALIQ, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(SUM(B.IMPONIBILE), 0), SUM(B.IMPONIBILE)) as RECORDIMPONI, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI559.PARAIMPOTRON~~, 'SI', TRUNC(SUM(B.RITENUTE_IRPEF), 0), SUM(B.RITENUTE_IRPEF)) as RECORDRITENU ");
      SQL.append("from ");
      SQL.append("  T62 A, ");
      SQL.append("  LIQ B, ");
      SQL.append("  MAN C ");
      SQL.append("where (NOT ((B.CODICE IS NULL))) ");
      SQL.append("and   (A.CODICE = B.CAUSALE_IRPEF) ");
      SQL.append("and   (C.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (B.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((B.NUMERO_MAND IS NULL))) ");
      SQL.append("and   (A.QUADRO = 'SH') ");
      SQL.append("group by ");
      SQL.append("  B.ALIQUOTA ");
      BUK_CONTQUASHLIB.SetReportQuery(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "200570ED-CE3D-454D-929C-927DED38E3C3");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_Init()
  {
    BUK_CONTQUASHLIB.InitReport(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, 196865);
    BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_InitQuery(true, false);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, "90782B33-2175-401D-80C8-F59D6C957466");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, "CONQUASHRIRE");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, BUK_CONTQUASHLIB_SEC_INTESTREPORT, 3200, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 9240833, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_INTESTREPORT, "546A3EB7-777C-4AD6-912D-50F1E1970C24");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA, 100, 100, 27500, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Controllo Quadri", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA, "325EC6A1-E139-4BBC-81EE-7BA9184AD208");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_TESTATPAGINA, BUK_CONTQUASHLIB_SPAN_UPTEPATOTICE, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384961, "Controllo Quadri", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_UPTEPATOTICE, "75CEE6DB-5E8E-4F8A-91F1-5879D4434F32");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_UPTEPATOTICE, "UPTEPATOTICE");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI, 100, 1100, 27500, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Riepilogo Quadro ", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI, "71609868-E0F9-40D4-AFE5-20260315683B");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SOTTTESTPAGI, BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQP, MyGlb.VIS_TITREPNOBOCE, 5, 101, 0, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQP, "753AEAC0-53E0-46E6-8741-121A1A1BCE3E");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_SOTEPTTPQCQP, "SOTEPTTPQCQP");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHEA, 300, 2700, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHEA, "667CE693-4EA9-44C6-AFED-82E5581140C2");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHEA, "LIQLIQALIHEA");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_LIQLIQALIHEA, BUK_CONTQUASHLIB_SPAN_ALIQUOTA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_ALIQUOTA, "9A1673F6-6F5E-47FC-BF35-F3A830B43577");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_ALIQUOTA, "ALIQUOTA");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADER, 2200, 2700, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADER, "2B6C7C2E-E74D-434E-9F27-849CBA0CCD66");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADER, "IMPONIHEADER");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_IMPONIHEADER, BUK_CONTQUASHLIB_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_IMPONIBILE, "24AA883C-5BE1-4269-B1A6-7375D794C7DF");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_INTESTREPORT, BUK_CONTQUASHLIB_RPTBOX_RITENUHEADER, 5900, 2700, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADER, "737E1C29-E327-4B63-B610-0F26ED468C29");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADER, "RITENUHEADER");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RITENUHEADER, BUK_CONTQUASHLIB_SPAN_RITENUTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RITENUTE, "463D4648-4AB7-465C-9346-8557A807E6E3");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RITENUTE, "RITENUTE");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, BUK_CONTQUASHLIB_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_DETTAGLIO, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_DETTAGLIO, "E51E8FC0-9364-4B50-83B9-42686B2BCFBC");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO, BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA, 200, 100, 1800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA, "7FEADB19-6846-444A-9AD8-D90BD450DEFE");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA, "LIQALIQUOTA");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_LIQALIQUOTA, BUK_CONTQUASHLIB_SPAN_RELIALCQC7SL, MyGlb.VIS_DEFAREPOSTYL, 3, 4, 6, 271384705, "", "::RECORLIQALIQ", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RELIALCQC7SL, "5721FA3C-E019-421B-8468-01E78BB87365");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RELIALCQC7SL, "RELIALCQC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO, BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE, 2200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE, "FE1BB55D-3E77-422D-BDBE-2C4C13307FB1");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE, "IMPONIBILE");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_IMPONIBILE, BUK_CONTQUASHLIB_SPAN_REIMCOQUC7SL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 IMPONIBILE, Zero), VISTA CONTROLLO 770 IMPONIBILE)", "::RECORDIMPONI", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_REIMCOQUC7SL, "738A6065-2918-493A-9DA7-D23FEC1AC259");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_REIMCOQUC7SL, "REIMCOQUC7SL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_DETTAGLIO, BUK_CONTQUASHLIB_RPTBOX_RITENUTE, 5900, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_RITENUTE, "7F9BB813-A065-4324-8A56-A4CC92466FDE");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_RITENUTE, "RITENUTE");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_RITENUTE, BUK_CONTQUASHLIB_SPAN_RERICOQUC7SL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "If Equal (Param Importi Troncati [Controllo 770 - Parametri], SI, Trunc (VISTA CONTROLLO 770 RITENUTE, Zero), VISTA CONTROLLO 770 RITENUTE)", "::RECORDRITENU", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_RERICOQUC7SL, "5AF985FC-A9D8-4ADC-9C19-4A0002EC00E1");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_RERICOQUC7SL, "RERICOQUC7SL");
    BUK_CONTQUASHLIB.InitSection(BUK_CONTQUASHLIB_RPT_CONQUASHRIRE, BUK_CONTQUASHLIB_SEC_PIEDEREPORT, 700, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTQUASHLIB.SetSectionRendersInto(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, "2833D331-7582-451E-A043-7921E4FC14E6");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONIB, 2200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONIB, "48F3D260-B399-40E8-8F4D-FF07CE65A6D3");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONIB, "SUMOFIMPONIB");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SUMOFIMPONIB, BUK_CONTQUASHLIB_SPAN_PIRSRICQCQSL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQSL, "3CE3C4B1-432F-44D0-AEBD-23C5B5FFA16F");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_PIRSRICQCQSL, "PIRSRICQCQSL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENUT, 5900, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENUT, "38BB38FD-37CA-415B-85A4-8D1D3193549C");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENUT, "SUMOFRITENUT");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_SUMOFRITENUT, BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQSL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQSL, "118B0D2F-CA17-4013-8CF4-FF20EF9BAF6B");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_PIRSRRCQCQSL, "PIRSRRCQCQSL");
    BUK_CONTQUASHLIB.InitReportBox(BUK_CONTQUASHLIB_SEC_PIEDEREPORT, BUK_CONTQUASHLIB_RPTBOX_TOTALE, 300, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_RPTBOX_TOTALE, "3A615E82-CCD5-4AC1-BC22-A483F3562D8E");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_RPTBOX_TOTALE, "TOTALE");
    BUK_CONTQUASHLIB.InitBoxSpan(BUK_CONTQUASHLIB_RPTBOX_TOTALE, BUK_CONTQUASHLIB_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_CONTQUASHLIB.SetRTCGuid(BUK_CONTQUASHLIB_SPAN_TOTALE, "713A582E-8651-4902-828D-1BF18B7779E8");
    BUK_CONTQUASHLIB.SetObjCode(BUK_CONTQUASHLIB_SPAN_TOTALE, "TOTALE");
    BUK_CONTQUASHLIB_RPT_CONQUASHRIRE_InitQuery(false, true);
  }

  private void BUK_CONTQUASHLIB_InitLinks()
  {
    BUK_CONTQUASHLIB.SetBoxNextBox(BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA, BUK_CONTQUASHLIB_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnConnecting(DBConn);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTQUADLIBR) BUK_CONTQUADLIBR_OnPreview();
    if (SrcObj == BKW_CONTQUASHLIB) BUK_CONTQUASHLIB_OnPreview();
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
