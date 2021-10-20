// **********************************************
// Report Controllo Disponibilita 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ReportControlloDisponibilita1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_CONTRODISPON;
  OBook BKW_CONTRODISPON;
  //
  // Template Pages constants
  private static int BUK_CONTRODISPON_MST_TEMPLATE = 1;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEHEADER1 = 2;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEBODY1 = 3;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEFOOTER1 = 4;
  private static int BUK_CONTRODISPON_RPTBOX_PAG1 = 5;
  private static int BUK_CONTRODISPON_SPAN_CPTSCDRCD1PN = 6;

  //
  // Reports constants
  private static int BUK_CONTRODISPON_RPT_REPORT = 7;
  private static int BUK_CONTRODISPON_SEC_REPORTHEADER = 8;
  private static int BUK_CONTRODISPON_SEC_PAGEHEADER = 9;
  private static int BUK_CONTRODISPON_RPTBOX_TITOLO1 = 10;
  private static int BUK_CONTRODISPON_SPAN_TITOLO1 = 11;
  private static int BUK_CONTRODISPON_SEC_ESHEADER = 12;
  private static int BUK_CONTRODISPON_RPTBOX_ES1 = 13;
  private static int BUK_CONTRODISPON_SPAN_ES = 14;
  private static int BUK_CONTRODISPON_RPTBOX_VOCEPEG3 = 15;
  private static int BUK_CONTRODISPON_SPAN_VOCEPEG1 = 16;
  private static int BUK_CONTRODISPON_RPTBOX_DISPATTUALE2 = 17;
  private static int BUK_CONTRODISPON_SPAN_DISPATTUALE1 = 18;
  private static int BUK_CONTRODISPON_RPTBOX_VARPROVVISO2 = 19;
  private static int BUK_CONTRODISPON_SPAN_VARPROVVISO1 = 20;
  private static int BUK_CONTRODISPON_RPTBOX_PROPOSTA1 = 21;
  private static int BUK_CONTRODISPON_SPAN_PROPOSTA1 = 22;
  private static int BUK_CONTRODISPON_RPTBOX_DISPRISULTA3 = 23;
  private static int BUK_CONTRODISPON_SPAN_DISPRISULTA2 = 24;
  private static int BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1 = 25;
  private static int BUK_CONTRODISPON_SPAN_ALTREPROPOS1 = 26;
  private static int BUK_CONTRODISPON_RPTBOX_DISPRISULTA4 = 27;
  private static int BUK_CONTRODISPON_SPAN_DISPRISULTA3 = 28;
  private static int BUK_CONTRODISPON_RPTBOX_BARRA1 = 29;
  private static int BUK_CONTRODISPON_RPTBOX_PROGETTO1 = 30;
  private static int BUK_CONTRODISPON_SPAN_PROGETTO1 = 31;
  private static int BUK_CONTRODISPON_RPTBOX_OBIETTIVO1 = 32;
  private static int BUK_CONTRODISPON_SPAN_OBIETTIVO1 = 33;
  private static int BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2 = 34;
  private static int BUK_CONTRODISPON_SPAN_FINANZIAMEN1 = 35;
  private static int BUK_CONTRODISPON_RPTBOX_OPERA2 = 36;
  private static int BUK_CONTRODISPON_SPAN_OPERA1 = 37;
  private static int BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ = 38;
  private static int BUK_CONTRODISPON_SPAN_UNITAORGANIZ = 39;
  private static int BUK_CONTRODISPON_SEC_VOCPEGGROHEA = 40;
  private static int BUK_CONTRODISPON_SEC_DETAIL = 41;
  private static int BUK_CONTRODISPON_RPTBOX_DISPATTUALE3 = 42;
  private static int BUK_CONTRODISPON_SPAN_REDIATRCD1CD = 43;
  private static int BUK_CONTRODISPON_RPTBOX_VARPROVVISO3 = 44;
  private static int BUK_CONTRODISPON_SPAN_REVAPRRCD1CD = 45;
  private static int BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1 = 46;
  private static int BUK_CONTRODISPON_SPAN_REPRRECOD1C1 = 47;
  private static int BUK_CONTRODISPON_RPTBOX_DISPPROPOST1 = 48;
  private static int BUK_CONTRODISPON_SPAN_REDIRIRCD1CD = 49;
  private static int BUK_CONTRODISPON_RPTBOX_VARALTREPRO1 = 50;
  private static int BUK_CONTRODISPON_SPAN_REALPRRCD1CD = 51;
  private static int BUK_CONTRODISPON_RPTBOX_DISPRISULTA5 = 52;
  private static int BUK_CONTRODISPON_SPAN_REDIR1RCD1CD = 53;
  private static int BUK_CONTRODISPON_RPTBOX_VOCEPEG4 = 54;
  private static int BUK_CONTRODISPON_SPAN_REVOPERCD1CD = 55;
  private static int BUK_CONTRODISPON_RPTBOX_TIPOTOT1 = 56;
  private static int BUK_CONTRODISPON_SPAN_TT1 = 57;
  private static int BUK_CONTRODISPON_RPTBOX_PROGETTOID1 = 58;
  private static int BUK_CONTRODISPON_SPAN_REPRRECOD1CD = 59;
  private static int BUK_CONTRODISPON_RPTBOX_CODICEOBIET1 = 60;
  private static int BUK_CONTRODISPON_SPAN_RECOOBRCD1CD = 61;
  private static int BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3 = 62;
  private static int BUK_CONTRODISPON_SPAN_REFIRECOD1CD = 63;
  private static int BUK_CONTRODISPON_RPTBOX_OPERA3 = 64;
  private static int BUK_CONTRODISPON_SPAN_REOPRECOD1CD = 65;
  private static int BUK_CONTRODISPON_RPTBOX_UO = 66;
  private static int BUK_CONTRODISPON_SPAN_UO = 67;
  private static int BUK_CONTRODISPON_SEC_VOCPEGGROFOO = 68;
  private static int BUK_CONTRODISPON_SEC_ESFOOTER = 69;
  private static int BUK_CONTRODISPON_SEC_PAGEFOOTER = 70;
  private static int BUK_CONTRODISPON_SEC_REPORTFOOTER = 71;

  private static int PFL_FAKE_ES = 0;
  private static int PFL_FAKE_VOCEPEG = 1;
  private static int PFL_FAKE_PROGETTO = 2;
  private static int PFL_FAKE_OBIETTIVO = 3;
  private static int PFL_FAKE_FINANZIAMENT = 4;
  private static int PFL_FAKE_OPERA = 5;
  private static int PFL_FAKE_DISPATTUALE = 6;
  private static int PFL_FAKE_VARPROVVISOR = 7;
  private static int PFL_FAKE_PROPOSTA = 8;
  private static int PFL_FAKE_DISPRISULTA1 = 9;
  private static int PFL_FAKE_ALTREPROPOST = 10;
  private static int PFL_FAKE_DISPRISULTAN = 11;

  private static int PPQRY_POLWRKDISPVB = 0;


  IDPanel PAN_FAKE;
  CIDREObj BUK_CONDISSTACOM;
  OBook BKW_CONDISSTACOM;
  //
  // Template Pages constants
  private static int BUK_CONDISSTACOM_MST_TEMPLATE = 1;
  private static int BUK_CONDISSTACOM_RPTBOX_PAGEHEADER = 2;
  private static int BUK_CONDISSTACOM_RPTBOX_PAGEBODY = 3;
  private static int BUK_CONDISSTACOM_RPTBOX_PAGEFOOTER = 4;
  private static int BUK_CONDISSTACOM_RPTBOX_PAG = 5;
  private static int BUK_CONDISSTACOM_SPAN_CPTSCDSCRCD1 = 6;

  //
  // Reports constants
  private static int BUK_CONDISSTACOM_RPT_REPORT = 7;
  private static int BUK_CONDISSTACOM_SEC_REPORTHEADER = 8;
  private static int BUK_CONDISSTACOM_SEC_PAGEHEADER = 9;
  private static int BUK_CONDISSTACOM_RPTBOX_TITOLO = 10;
  private static int BUK_CONDISSTACOM_SPAN_TITOLO = 11;
  private static int BUK_CONDISSTACOM_SEC_ESHEADER = 12;
  private static int BUK_CONDISSTACOM_RPTBOX_VOCEPEG2 = 13;
  private static int BUK_CONDISSTACOM_SPAN_VOCEPEG = 14;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1 = 15;
  private static int BUK_CONDISSTACOM_SPAN_DISPATTUALE = 16;
  private static int BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1 = 17;
  private static int BUK_CONDISSTACOM_SPAN_VARPROVVISOR = 18;
  private static int BUK_CONDISSTACOM_RPTBOX_PROPOSTA = 19;
  private static int BUK_CONDISSTACOM_SPAN_PROPOSTA = 20;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2 = 21;
  private static int BUK_CONDISSTACOM_SPAN_DISPRISULTA1 = 22;
  private static int BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST = 23;
  private static int BUK_CONDISSTACOM_SPAN_ALTREPROPOST = 24;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1 = 25;
  private static int BUK_CONDISSTACOM_SPAN_DISPRISULTAN = 26;
  private static int BUK_CONDISSTACOM_RPTBOX_BARRA = 27;
  private static int BUK_CONDISSTACOM_RPTBOX_PROGETTO = 28;
  private static int BUK_CONDISSTACOM_SPAN_PROGETTO = 29;
  private static int BUK_CONDISSTACOM_RPTBOX_OBIETTIVO = 30;
  private static int BUK_CONDISSTACOM_SPAN_OBIETTIVO = 31;
  private static int BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1 = 32;
  private static int BUK_CONDISSTACOM_SPAN_FINANZIAMENT = 33;
  private static int BUK_CONDISSTACOM_RPTBOX_OPERA1 = 34;
  private static int BUK_CONDISSTACOM_SPAN_OPERA = 35;
  private static int BUK_CONDISSTACOM_SEC_VOCPEGGROHEA = 36;
  private static int BUK_CONDISSTACOM_SEC_DETAIL = 37;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPATTUALE = 38;
  private static int BUK_CONDISSTACOM_SPAN_REDARCD1CDSC = 39;
  private static int BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR = 40;
  private static int BUK_CONDISSTACOM_SPAN_REVPRCD1CDS1 = 41;
  private static int BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA = 42;
  private static int BUK_CONDISSTACOM_SPAN_REPRRCD1CDS1 = 43;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA = 44;
  private static int BUK_CONDISSTACOM_SPAN_REDRRCD1CDSC = 45;
  private static int BUK_CONDISSTACOM_RPTBOX_VARALTREPROP = 46;
  private static int BUK_CONDISSTACOM_SPAN_REAPRCD1CDSC = 47;
  private static int BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN = 48;
  private static int BUK_CONDISSTACOM_SPAN_RDR1RCD1CDSC = 49;
  private static int BUK_CONDISSTACOM_RPTBOX_VOCEPEG1 = 50;
  private static int BUK_CONDISSTACOM_SPAN_REVPRCD1CDSC = 51;
  private static int BUK_CONDISSTACOM_RPTBOX_TIPOTOT = 52;
  private static int BUK_CONDISSTACOM_SPAN_TT = 53;
  private static int BUK_CONDISSTACOM_RPTBOX_PROGETTOID = 54;
  private static int BUK_CONDISSTACOM_SPAN_REPRRCD1CDSC = 55;
  private static int BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT = 56;
  private static int BUK_CONDISSTACOM_SPAN_RECORCD1CDSC = 57;
  private static int BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT = 58;
  private static int BUK_CONDISSTACOM_SPAN_REFIRCD1CDSC = 59;
  private static int BUK_CONDISSTACOM_RPTBOX_OPERA = 60;
  private static int BUK_CONDISSTACOM_SPAN_REOPRCD1CDSC = 61;
  private static int BUK_CONDISSTACOM_SEC_VOCPEGGROFOO = 62;
  private static int BUK_CONDISSTACOM_SEC_ESFOOTER = 63;
  private static int BUK_CONDISSTACOM_SEC_PAGEFOOTER = 64;
  private static int BUK_CONDISSTACOM_SEC_REPORTFOOTER = 65;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARS4(IMDB);
    //
    //
    Init_PQRY_POLWRKDISPV1(IMDB);
    Init_PQRY_POLWRKDISPV2(IMDB);
    Init_PQRY_POLWRKDISPVB(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_VARS4, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_VARS4, "TBL_VARS4");
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMEBOZZA,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMETITOL,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMETIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMESESCE, "ROWNAMESESCE");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMESESCE,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMECONTA,1,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMECONT1, "ROWNAMECONT1");
    IMDB.SetFldParams(IMDBDef3.TBL_VARS4,IMDBDef3.FLD_VARS4_ROWNAMECONT1,1,9,0);
    IMDB.TblAddNew(IMDBDef3.TBL_VARS4, 0);
  }

  private static void Init_PQRY_POLWRKDISPV1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKDISPV1, 19);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKDISPV1, "PQRY_POLWRKDISPV1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_CODICE_OBIETTIVO, "CODICE_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_CODICE_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_ATTUALE, "DISP_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_PROVVISORIE, "VAR_PROVVISORIE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_PROVVISORIE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_PROPOSTA, "VAR_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_PROPOSTA, "DISP_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_ALTRE_PROPOSTE, "VAR_ALTRE_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_VAR_ALTRE_PROPOSTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_RISULTANTE, "DISP_RISULTANTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DISP_RISULTANTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_RECVOCPECODE, "RECVOCPECODE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_RECVOCPECODE,5,224,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DES_UNITA_ORGANIZZATIVA, "DES_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV1,IMDBDef12.PQSL_POLWRKDISPV1_DES_UNITA_ORGANIZZATIVA,5,120,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKDISPV1, 0);
  }

  private static void Init_PQRY_POLWRKDISPV2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKDISPV2, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKDISPV2, "PQRY_POLWRKDISPV2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_CODICE_OBIETTIVO, "CODICE_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_CODICE_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_ATTUALE, "DISP_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_PROVVISORIE, "VAR_PROVVISORIE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_PROVVISORIE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_PROPOSTA, "VAR_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_PROPOSTA, "DISP_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_ALTRE_PROPOSTE, "VAR_ALTRE_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_VAR_ALTRE_PROPOSTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_RISULTANTE, "DISP_RISULTANTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_DISP_RISULTANTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_RECVOCPECODE, "RECVOCPECODE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_RECVOCPECODE,5,224,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPV2,IMDBDef12.PQSL_POLWRKDISPV2_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKDISPV2, 0);
  }

  private static void Init_PQRY_POLWRKDISPVB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKDISPVB, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKDISPVB, "PQRY_POLWRKDISPVB");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_CODICE_OBIETTIVO, "CODICE_OBIETTIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_CODICE_OBIETTIVO,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VOCE_PEG,5,22,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_ATTUALE, "DISP_ATTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_PROVVISORIE, "VAR_PROVVISORIE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_PROVVISORIE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_PROPOSTA, "VAR_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_PROPOSTA, "DISP_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_PROPOSTA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_ALTRE_PROPOSTE, "VAR_ALTRE_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_VAR_ALTRE_PROPOSTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_RISULTANTE, "DISP_RISULTANTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKDISPVB,IMDBDef12.PQSL_POLWRKDISPVB_DISP_RISULTANTE,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKDISPVB, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ReportControlloDisponibilita1(MyWebEntryPoint w, IMDBObj imdb)
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
  public ReportControlloDisponibilita1()
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
    FormIdx = MyGlb.FRM_REPOCONTDIS1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "59A56DEC-B66F-4409-92DE-E61173DC6448";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1000;
    DesignHeight = 694;
    set_Caption(new IDVariant("Report Controllo Disponibilita 1"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1000;
    Frames[1].Height = 668;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.874251;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1000;
    Frames[2].Height = 584;
    Frames[2].Caption = "Controllo Disponibilità";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 584;
    BKW_CONTRODISPON = new OBook(this);
    BUK_CONTRODISPON = new CIDREObj(BKW_CONTRODISPON);
    Frames[2].Content = BKW_CONTRODISPON;
    BKW_CONTRODISPON.Height = 554;
    BKW_CONTRODISPON.Width = 1000;
    BKW_CONTRODISPON.iGuid = "E671FFAC-8B44-4EB2-A99E-F4D3CCA38A88";
    BKW_CONTRODISPON.Code = "BUK_CONTRODISPON";
    BKW_CONTRODISPON.BookObj = BUK_CONTRODISPON;
    BKW_CONTRODISPON.InitDefMasks();
    BUK_CONTRODISPON.set_FrIndex(2);
    BUK_CONTRODISPON.InitBook(1, 3342593, "Controllo Disponibilità", IMDB, MainFrm.VisualStyleList);
    BUK_CONTRODISPON.InitHTML();
    BUK_CONTRODISPON.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTRODISPON.SetSize(1000, 554);
    BUK_CONTRODISPON.Book.SetMainFrm(MainFrm);
    BUK_CONTRODISPON.SetRTCGuid(0, "E671FFAC-8B44-4EB2-A99E-F4D3CCA38A88");
    BUK_CONTRODISPON.SetObjCode(0, "CONTRODISPON");
    BUK_CONTRODISPON_MST_TEMPLATE_Init();
    BUK_CONTRODISPON_RPT_REPORT_Init();
    BUK_CONTRODISPON_InitLinks();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1000;
    Frames[3].Height = 84;
    Frames[3].Caption = "Fake";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 84;
    PAN_FAKE = new IDPanel(w, this, 3, "PAN_FAKE");
    Frames[3].Content = PAN_FAKE;
    PAN_FAKE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FAKE.VS = MainFrm.VisualStyleList;
    PAN_FAKE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 84-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5E0D6F7B-1AD5-4FD2-8F35-8EFE90839271");
    PAN_FAKE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1036, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FAKE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FAKE.InitStatus = 2;
    PAN_FAKE_Init();
    PAN_FAKE_InitFields();
    PAN_FAKE_InitQueries();
    BKW_CONDISSTACOM = new OBook(this);
    BUK_CONDISSTACOM = new CIDREObj(BKW_CONDISSTACOM);
    BKW_CONDISSTACOM.iGuid = "29B990B0-BCDF-478C-BC32-411F7CE2EB5B";
    BKW_CONDISSTACOM.Code = "BUK_CONDISSTACOM";
    BKW_CONDISSTACOM.BookObj = BUK_CONDISSTACOM;
    BKW_CONDISSTACOM.InitDefMasks();
    BUK_CONDISSTACOM.InitBook(1, 3342593, "Controllo Disponibilita Stampa Completa", IMDB, MainFrm.VisualStyleList);
    BUK_CONDISSTACOM.InitHTML();
    BUK_CONDISSTACOM.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONDISSTACOM.Book.SetMainFrm(MainFrm);
    BUK_CONDISSTACOM.SetRTCGuid(0, "29B990B0-BCDF-478C-BC32-411F7CE2EB5B");
    BUK_CONDISSTACOM.SetObjCode(0, "CONDISSTACOM");
    BUK_CONDISSTACOM_MST_TEMPLATE_Init();
    BUK_CONDISSTACOM_RPT_REPORT_Init();
    BUK_CONDISSTACOM_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FA8+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI59+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA8+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPACOMP19+BaseCmdLinIdx)
      {
        ApriStampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPORINEXC22+BaseCmdLinIdx)
      {
        Export();
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
      PAN_FAKE.UpdatePanel(MainFrm);
      BUK_CONTRODISPON.UpdateBook();
      // BUK_CONDISSTACOM.UpdateBook();
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
    if (Code.equals("BUK_CONTRODISPON")) return BUK_CONTRODISPON;
    if (Code.equals("BUK_CONDISSTACOM")) return BUK_CONDISSTACOM;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ReportControlloDisponibilita1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ReportControlloDisponibilita1.class.getName() : (Glb.ClassWithPackage(ReportControlloDisponibilita1.class) ? ReportControlloDisponibilita1.class.getName().substring(ReportControlloDisponibilita1.class.getPackage().getName().length() + 1) : ReportControlloDisponibilita1.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_BUORG = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Controllo Disponibilità", IDVariant.STRING));
      v_BUORG = (new IDVariant("Bilancio Unità Organizzative", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
      {
        v_DESC = (new IDVariant("Bilancio"));
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
      {
        v_DESC = (new IDVariant("Finanziamento"));
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
      {
        v_DESC = (new IDVariant("Progetto"));
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
      {
        v_DESC = (new IDVariant("Obiettivo"));
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("U")), true))
      {
        v_DESC = new IDVariant(v_BUORG);
      }
      IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETITOL, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (new IDVariant(" "))), v_DESC), (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMESESCE, 0))), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), IDL.ToString(IDL.Today())));
      BUK_CONTRODISPON.set_PrintDestination((new IDVariant(1)).intValue());
      BUK_CONTRODISPON.ReportRefreshQuery(BUK_CONTRODISPON_RPT_REPORT);
      BUK_CONTRODISPON.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTRODISPON_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event Body
      // Procedure Body
      // 
      if (BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "E_S").equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0, (new IDVariant(0)));
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, (new IDVariant(-1)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0).equals((new IDVariant(0)), true))
        {
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, (new IDVariant(-1)).booleanValue());
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
          {
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
          {
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(-1)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
          {
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(-1)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(-1)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
          {
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(-1)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(-1)).booleanValue());
            BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, (new IDVariant(0)).booleanValue());
          }
          BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_TT1, (new IDVariant("Totale")));
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0).equals((new IDVariant(1)), true))
        {
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_TT1, (new IDVariant("Consolidato")));
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0).equals((new IDVariant(2)), true))
        {
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_TT1, (new IDVariant("Sviluppo")));
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        }
        IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0, IDL.Add(IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0), (new IDVariant(1))));
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0).compareTo((new IDVariant(2)), true)>0)
        {
          IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONTA, 0, (new IDVariant(0)));
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
        {
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, (new IDVariant(0)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, (new IDVariant(-1)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(-1)).booleanValue());
          BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "DetailBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Template On Formatting Event
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTRODISPON_MST_TEMPLATE_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Template On Formatting Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTO1, (new IDVariant(-1)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(-1)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UO, (new IDVariant(0)).booleanValue());
        SpostaASX();
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("U")), true))
      {
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA2, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_OPERA3, (new IDVariant(0)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, (new IDVariant(-1)).booleanValue());
        BUK_CONTRODISPON.set_BoxVisible(BUK_CONTRODISPON_RPTBOX_UO, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "TemplateOnFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Sposta A SX
  // **********************************************************************
  public int SpostaASX ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sposta A SX Body
      // Procedure Body
      // 
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, IDREGlb.RECT_LEFT, (new IDVariant(29, IDVariant.FLOAT)).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, IDREGlb.RECT_LEFT, (new IDVariant(40, IDVariant.FLOAT)).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE3, IDREGlb.RECT_LEFT, (new IDVariant(40, IDVariant.FLOAT)).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO2, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_PROPOSTA1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPRISULTA3, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPRISULTA4, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONTRODISPON.set_BoxRect(BUK_CONTRODISPON_RPTBOX_DISPRISULTA5, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONTRODISPON.BoxRect(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "SpostaASX", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stampa Completa
  // **********************************************************************
  public int ApriStampaCompleta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Completa Body
      // Procedure Body
      // 
      BUK_CONDISSTACOM.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_CONDISSTACOM.ReportRefreshQuery(BUK_CONDISSTACOM_RPT_REPORT);
      BUK_CONDISSTACOM.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_CONDISSTACOM.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "ApriStampaCompleta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Sposta A SX Stampa Completa
  // **********************************************************************
  public int SpostaASXStampaCompleta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sposta A SX Stampa Completa Body
      // Procedure Body
      // 
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, IDREGlb.RECT_LEFT, (new IDVariant(29, IDVariant.FLOAT)).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, IDREGlb.RECT_LEFT, (new IDVariant(40, IDVariant.FLOAT)).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE, IDREGlb.RECT_LEFT, (new IDVariant(40, IDVariant.FLOAT)).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_PROPOSTA, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      BUK_CONDISSTACOM.set_BoxRect(BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_CONDISSTACOM.BoxRect(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, IDREGlb.RECT_WIDTH)))), (new IDVariant(6))).dblValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "SpostaASXStampaCompleta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Fake After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FAKE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fake After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
      {
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
      {
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
      {
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
      {
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_FAKE.set_Visible((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "FakeAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Export
  // **********************************************************************
  public int Export ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export Body
      // Procedure Body
      // 
      new IDVariant(PAN_FAKE.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "Export", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Template On Formatting Event 1
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONDISSTACOM_MST_TEMPLATE_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Template On Formatting Event 1 Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
      {
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTO, (new IDVariant(-1)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(-1)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
      {
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
      {
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTO, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
      {
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTO, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA1, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
        SpostaASXStampaCompleta();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "TemplateOnFormattingEvent1", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event 1
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONDISSTACOM_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event 1 Body
      // Procedure Body
      // 
      if (BUK_CONDISSTACOM.GetReportColumn(BUK_CONDISSTACOM_RPT_REPORT, "E_S").equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0, (new IDVariant(0)));
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, (new IDVariant(-1)).booleanValue());
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0).equals((new IDVariant(0)), true))
        {
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, (new IDVariant(-1)).booleanValue());
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("B")), true))
          {
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("P")), true))
          {
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(-1)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("O")), true))
          {
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(-1)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(-1)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
          }
          if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
          {
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(-1)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(-1)).booleanValue());
            BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, (new IDVariant(0)).booleanValue());
          }
          BUK_CONDISSTACOM.set_SpanValue(BUK_CONDISSTACOM_SPAN_TT, (new IDVariant("Totale")));
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0).equals((new IDVariant(1)), true))
        {
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_SpanValue(BUK_CONDISSTACOM_SPAN_TT, (new IDVariant("Consolidato")));
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0).equals((new IDVariant(2)), true))
        {
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_SpanValue(BUK_CONDISSTACOM_SPAN_TT, (new IDVariant("Sviluppo")));
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(0)).booleanValue());
        }
        IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0, IDL.Add(IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0), (new IDVariant(1))));
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0).compareTo((new IDVariant(2)), true)>0)
        {
          IMDB.set_Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMECONT1, 0, (new IDVariant(0)));
        }
        if (IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETIPO, 0).equals((new IDVariant("F")), true))
        {
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, (new IDVariant(0)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, (new IDVariant(-1)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, (new IDVariant(-1)).booleanValue());
          BUK_CONDISSTACOM.set_BoxVisible(BUK_CONDISSTACOM_RPTBOX_OPERA, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportControlloDisponibilita1", "DetailBeforeFormattingEvent1", _e);
    }
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
  private void BUK_CONTRODISPON_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTRODISPON_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTRODISPON_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PAGEHEADER)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_TITOLO1, new IDVariant(IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETITOL, 0)));
    }
    if (SectionID==BUK_CONTRODISPON_SEC_ESHEADER)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_ES, new IDVariant(((BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_REPORT, "E_S").equals((new IDVariant("E")), true))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_CONTRODISPON_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_DETAIL)
    {
      BUK_CONTRODISPON_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONTRODISPON_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_ESFOOTER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTRODISPON_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTRODISPON_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTRODISPON_MST_TEMPLATE)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_CPTSCDRCD1PN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetTotalPagesNumber()))))));
      BUK_CONTRODISPON_MST_TEMPLATE_OnFormattingPage();
    }
  }

  private void BUK_CONTRODISPON_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTRODISPON_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTRODISPON_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTRODISPON_OnPreview()
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FAKE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FAKE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FAKE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FAKE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FAKE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FAKE);
    // Stub
  }

  private void PAN_FAKE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FAKE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FAKE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FAKE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONDISSTACOM_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONDISSTACOM_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONDISSTACOM_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_PAGEHEADER)
    {
      BUK_CONDISSTACOM.set_SpanValue(BUK_CONDISSTACOM_SPAN_TITOLO, new IDVariant(IDL.Add(IDL.Add(IMDB.Value(IMDBDef3.TBL_VARS4, IMDBDef3.FLD_VARS4_ROWNAMETITOL, 0), (new IDVariant(" - "))), ((BUK_CONDISSTACOM.GetReportColumn(BUK_CONDISSTACOM_RPT_REPORT, "E_S").equals((new IDVariant("E")), true))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))))));
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_ESHEADER)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_DETAIL)
    {
      BUK_CONDISSTACOM_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_ESFOOTER)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONDISSTACOM_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONDISSTACOM_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONDISSTACOM_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONDISSTACOM_MST_TEMPLATE)
    {
      BUK_CONDISSTACOM.set_SpanValue(BUK_CONDISSTACOM_SPAN_CPTSCDSCRCD1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONDISSTACOM.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONDISSTACOM.GetTotalPagesNumber()))))));
      BUK_CONDISSTACOM_MST_TEMPLATE_OnFormattingPage();
    }
  }

  private void BUK_CONDISSTACOM_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONDISSTACOM_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONDISSTACOM_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONDISSTACOM_OnPreview()
  {
    PreviewBook = BKW_CONDISSTACOM;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FAKE_Init()
  {

    PAN_FAKE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "60FBE82F-DAC5-460A-889D-9C74321C82A8");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "E S");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, "4D0DCD9F-7ED0-4CB3-90B8-9AC841F9B14A");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, "VOCE PEG");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, "ADFB99C8-270A-4C8C-9BA7-C974F3233E30");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, "Obiettivo Operativo");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, "1F014531-4B91-47BB-AD62-C555ADECF678");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, "Obiettivo Gestionale");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, "60815152-62F9-4318-8CB9-88A2379CCC56");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, "FINANZIAMENTO");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, "BA8C419E-705B-4FB9-865C-42EAF842A44A");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, "OPERA");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, "220F95D8-2136-4543-8B53-D4466F3DD244");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, "DISP ATTUALE");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, "12FB5D25-3476-43F3-ABAE-A82ADBFC9AF6");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, "VAR PROVVISORIE");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, "C6B7C122-E613-4AA4-B18F-D877F3FE9F79");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, "PROPOSTA");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, "8EB43D81-6055-4D7F-ADCF-696D26D7667C");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, "DISP RISULTANTE");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, "47182D5C-77AC-4818-821A-6F0A75CEC3F4");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, "ALTRE PROPOSTE");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, "4FCA7D20-6FCD-41B0-9B73-B26FDC491A89");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, "DISP RISULTANTE  ");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FAKE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 24);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, "E S");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 24);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, "E S");
    PAN_FAKE.SetFieldPage(PFL_FAKE_ES, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_ES, PPQRY_POLWRKDISPVB, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_LIST, 40, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_LIST, 60);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_LIST, "VOCE PEG");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_FORM, 60);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG, MyGlb.PANEL_FORM, "VOCE PEG");
    PAN_FAKE.SetFieldPage(PFL_FAKE_VOCEPEG, -1, -1);
    PAN_FAKE.SetFieldUnbound(PFL_FAKE_VOCEPEG, true);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_VOCEPEG, PPQRY_POLWRKDISPVB, "'''' || A.VOCE_PEG || ''''", "VOCE_PEG", 5, 22, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_LIST, 148, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_PROGETTO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_PROGETTO, PPQRY_POLWRKDISPVB, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_LIST, 224, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_LIST, 104);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_FORM, 104);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_OBIETTIVO, MyGlb.PANEL_FORM, "Obiet. Gestionale");
    PAN_FAKE.SetFieldPage(PFL_FAKE_OBIETTIVO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_OBIETTIVO, PPQRY_POLWRKDISPVB, "A.CODICE_OBIETTIVO", "CODICE_OBIETTIVO", 5, 10, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_LIST, 328, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_FINANZIAMENT, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_FINANZIAMENT, PPQRY_POLWRKDISPVB, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_LIST, 420, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_FORM, 4, 100, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_FAKE.SetFieldPage(PFL_FAKE_OPERA, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_OPERA, PPQRY_POLWRKDISPVB, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_LIST, 464, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_LIST, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_LIST, "DISP ATTUALE");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_FORM, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPATTUALE, MyGlb.PANEL_FORM, "DSP. ATT.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DISPATTUALE, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DISPATTUALE, PPQRY_POLWRKDISPVB, "A.DISP_ATTUALE", "DISP_ATTUALE", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_LIST, 544, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_LIST, 100);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_LIST, "VAR PROVVISORIE");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_FORM, 100);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VARPROVVISOR, MyGlb.PANEL_FORM, "VAR PROVV.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_VARPROVVISOR, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_VARPROVVISOR, PPQRY_POLWRKDISPVB, "A.VAR_PROVVISORIE", "VAR_PROVVISORIE", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_LIST, 644, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_LIST, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_LIST, "PROPOSTA");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_FORM, 4, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_FORM, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROPOSTA, MyGlb.PANEL_FORM, "PROPOSTA");
    PAN_FAKE.SetFieldPage(PFL_FAKE_PROPOSTA, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_PROPOSTA, PPQRY_POLWRKDISPVB, "A.VAR_PROPOSTA", "VAR_PROPOSTA", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_LIST, 732, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_LIST, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_LIST, "DISP RISULTANTE");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_FORM, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTA1, MyGlb.PANEL_FORM, "DSP. RISULT.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DISPRISULTA1, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DISPRISULTA1, PPQRY_POLWRKDISPVB, "A.DISP_PROPOSTA", "DISP_PROPOSTA", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_LIST, 820, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_LIST, 120);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_LIST, "ALTRE PROPOSTE");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_FORM, 4, 244, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_FORM, 120);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ALTREPROPOST, MyGlb.PANEL_FORM, "ALTRE PROPOSTE");
    PAN_FAKE.SetFieldPage(PFL_FAKE_ALTREPROPOST, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_ALTREPROPOST, PPQRY_POLWRKDISPVB, "A.VAR_ALTRE_PROPOSTE", "VAR_ALTRE_PROPOSTE", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_LIST, 940, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_LIST, 96);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_LIST, "DISP RISULTANTE  ");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_FORM, 4, 268, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_FORM, 96);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DISPRISULTAN, MyGlb.PANEL_FORM, "DSP. RISULT.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DISPRISULTAN, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DISPRISULTAN, PPQRY_POLWRKDISPVB, "A.DISP_RISULTANTE", "DISP_RISULTANTE", 3, 14, 2, -13997);
  }

  private void PAN_FAKE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FAKE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FAKE.SetIMDB(IMDB, "PQRY_POLWRKDISPVB", true);
    PAN_FAKE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.CODICE_OBIETTIVO as CODICE_OBIETTIVO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  '''' || A.VOCE_PEG || '''' as VOCE_PEG, ");
    SQL.append("  A.DISP_ATTUALE as DISP_ATTUALE, ");
    SQL.append("  A.VAR_PROVVISORIE as VAR_PROVVISORIE, ");
    SQL.append("  A.VAR_PROPOSTA as VAR_PROPOSTA, ");
    SQL.append("  A.DISP_PROPOSTA as DISP_PROPOSTA, ");
    SQL.append("  A.VAR_ALTRE_PROPOSTE as VAR_ALTRE_PROPOSTE, ");
    SQL.append("  A.DISP_RISULTANTE as DISP_RISULTANTE ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_WRK_DISP_PVB A ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKDISPVB, 5, SQL, -1, "");
    PAN_FAKE.SetQueryDB(PPQRY_POLWRKDISPVB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FAKE.SetMasterTable(0, "POL_WRK_DISP_PVB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FAKE.Status() == 2)
    {
      int oldListQBE = PAN_FAKE.iUseListQBE;
      PAN_FAKE.iUseListQBE = 0;
      PAN_FAKE.PanelCommand(Glb.PCM_SEARCH);
      PAN_FAKE.PanelCommand(Glb.PCM_FIND);
      PAN_FAKE.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTRODISPON_MST_TEMPLATE_Init()
  {
    BUK_CONTRODISPON.InitMastro(BUK_CONTRODISPON_MST_TEMPLATE, 3, 21000, 29700, 1, 2, 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_MST_TEMPLATE, "4AD10647-7AA1-4511-93B1-ACDA562A47FA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_MST_TEMPLATE, "TEMPLATE");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEHEADER1, "FACBBE04-E959-4C9B-9311-F01242893193");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PAGEBODY1, 900, 2800, 27700, 16300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEBODY1, "1E263EAA-016E-4B42-BF3D-D165B630039A");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER1, 1000, 19500, 27700, 400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEFOOTER1, "A67632C5-8770-4859-BF75-AC3BD28F7FC8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATE, BUK_CONTRODISPON_RPTBOX_PAG1, 26900, 1000, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAG1, "21F24781-2B93-4F3A-811D-B136879D7DC1");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAG1, "PAG1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PAG1, BUK_CONTRODISPON_SPAN_CPTSCDRCD1PN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CPTSCDRCD1PN, "526BC749-D893-4FF5-9449-AD0C6FC28DFD");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CPTSCDRCD1PN, "CPTSCDRCD1PN");
  }

  private void BUK_CONTRODISPON_RPT_REPORT_InitQuery() { BUK_CONTRODISPON_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONTRODISPON_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
      SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
      SQL.append("  A.CODICE_OBIETTIVO as CODICE_OBIETTIVO, ");
      SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
      SQL.append("  A.OPERA as OPERA, ");
      SQL.append("  A.DISP_ATTUALE as DISP_ATTUALE, ");
      SQL.append("  A.VAR_PROVVISORIE as VAR_PROVVISORIE, ");
      SQL.append("  A.VAR_PROPOSTA as VAR_PROPOSTA, ");
      SQL.append("  A.DISP_PROPOSTA as DISP_PROPOSTA, ");
      SQL.append("  A.VAR_ALTRE_PROPOSTE as VAR_ALTRE_PROPOSTE, ");
      SQL.append("  A.DISP_RISULTANTE as DISP_RISULTANTE, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) || ' - ' || A.VOCE_PEG as RECVOCPECODE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.DES_UNITA_ORGANIZZATIVA as DES_UNITA_ORGANIZZATIVA ");
      SQL.append("from ");
      SQL.append("  POL_WRK_DISP_PVB A ");
      SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.VOCE_PEG, ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_CONTRODISPON.SetReportQuery(BUK_CONTRODISPON_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5123B553-C19D-4602-9B3D-1DC9925667AA");
      if (BUK_CONTRODISPON.FindObjByID(BUK_CONTRODISPON_SEC_ESHEADER) != null)
        BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_ESHEADER, "E_S");
      if (BUK_CONTRODISPON.FindObjByID(BUK_CONTRODISPON_SEC_VOCPEGGROHEA) != null)
        BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_VOCPEGGROHEA, "VOCE_PEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTRODISPON_RPT_REPORT_Init()
  {
    BUK_CONTRODISPON.InitReport(BUK_CONTRODISPON_RPT_REPORT, 196865);
    BUK_CONTRODISPON_RPT_REPORT_InitQuery(true, false);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPT_REPORT, "45793C5E-23BB-4344-B91F-0A16A959702C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPT_REPORT, "REPORT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_REPORTHEADER, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTHEADER, "B1CC2A5B-FEB7-457D-896A-1F21E972E847");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_PAGEHEADER, 1100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_PAGEHEADER1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEHEADER, "B0BCB031-EE1A-496D-B506-5FC7462F2C31");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_TITOLO1, 0, 0, 25800, 1100, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TITOLO1, "708285DE-0026-4987-A912-F7A196AB3F32");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TITOLO1, "TITOLO1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TITOLO1, BUK_CONTRODISPON_SPAN_TITOLO1, MyGlb.VIS_TITOLOREPORT, 5, 49, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_TITOLO1, "5269C98F-5D7C-486D-BC78-6461C132EC81");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_TITOLO1, "TITOLO1");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_ESHEADER, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "E_S");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_ESHEADER, "78C3F1E1-49E1-4C0B-A992-05FCE9D0B046");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_ESHEADER, "ESHEADER");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_ES1, 0, 400, 2000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_ES1, "A1E42985-5D3B-4D32-8B0C-27B8E7DB0727");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_ES1, "ES1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_ES1, BUK_CONTRODISPON_SPAN_ES, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_ES, "0C1F9DF1-1D5F-4920-A12B-BBF3409BB2C9");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_ES, "ES");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_VOCEPEG3, 600, 900, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VOCEPEG3, "4A10C70C-95A6-4570-A285-C18CFF343CFC");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VOCEPEG3, "VOCEPEG3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VOCEPEG3, BUK_CONTRODISPON_SPAN_VOCEPEG1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Voce P.e.g.", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_VOCEPEG1, "A00C27CF-1E73-4CAB-88C8-09234BC8768C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_VOCEPEG1, "VOCEPEG1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, 9300, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, "23A814D7-1127-438D-B258-B8D5A8A38FC8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, "DISPATTUALE2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPATTUALE2, BUK_CONTRODISPON_SPAN_DISPATTUALE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Attuale", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPATTUALE1, "1B61D8BC-5EC8-4AAD-ACA9-34DAD0B6C929");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPATTUALE1, "DISPATTUALE1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_VARPROVVISO2, 12200, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARPROVVISO2, "6D9C762F-A0DB-400E-9139-20F279028DF6");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARPROVVISO2, "VARPROVVISO2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARPROVVISO2, BUK_CONTRODISPON_SPAN_VARPROVVISO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Var. Provvisorie", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_VARPROVVISO1, "765F0EAA-2928-4DFF-8F15-B5122A18D98D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_VARPROVVISO1, "VARPROVVISO1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_PROPOSTA1, 15100, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PROPOSTA1, "E43648CB-FC4C-4603-B337-9D828B26C1DA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PROPOSTA1, "PROPOSTA1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PROPOSTA1, BUK_CONTRODISPON_SPAN_PROPOSTA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Proposta", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_PROPOSTA1, "F4CB9760-88F7-4EE0-95DA-25AC98044205");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_PROPOSTA1, "PROPOSTA1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_DISPRISULTA3, 18000, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPRISULTA3, "D040F859-042B-45BD-8F06-86809BA1344F");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPRISULTA3, "DISPRISULTA3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPRISULTA3, BUK_CONTRODISPON_SPAN_DISPRISULTA2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPRISULTA2, "786B72DE-9D6A-47A8-A7D4-7C5DA368EF1E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPRISULTA2, "DISPRISULTA2");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1, 20900, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1, "EC8B9BF2-6F2F-4174-B069-A8665342A2E2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1, "ALTREPROPOS1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_ALTREPROPOS1, BUK_CONTRODISPON_SPAN_ALTREPROPOS1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Altre Proposte", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_ALTREPROPOS1, "6E66F08E-4F29-4D85-B11D-9DFACD4B6CAC");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_ALTREPROPOS1, "ALTREPROPOS1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_DISPRISULTA4, 23800, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPRISULTA4, "B97EBBE1-01B7-4931-9C03-9A3CC8D38CB2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPRISULTA4, "DISPRISULTA4");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPRISULTA4, BUK_CONTRODISPON_SPAN_DISPRISULTA3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPRISULTA3, "80E18114-51EE-4B80-B237-AA586E66607F");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPRISULTA3, "DISPRISULTA3");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_BARRA1, 600, 1100, 25600, 300, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_BARRA1, "DA1D1A11-AADC-4E23-86B3-D7D5A0C8ADEF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_BARRA1, "BARRA1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_PROGETTO1, 3400, 900, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PROGETTO1, "9FF8B7E0-3595-44A3-8634-2D69C73AF0C8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PROGETTO1, "PROGETTO1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PROGETTO1, BUK_CONTRODISPON_SPAN_PROGETTO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Progetto", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_PROGETTO1, "081A46C9-88B5-4ABE-AF5E-010CA8253E1B");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_PROGETTO1, "PROGETTO1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, 5600, 900, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, "0E519769-044F-46E3-B4CA-6F0C7C82B041");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, "OBIETTIVO1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_OBIETTIVO1, BUK_CONTRODISPON_SPAN_OBIETTIVO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Obiettivo", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_OBIETTIVO1, "3EA7AEED-BAC0-4C4B-BF11-53D9A2E72487");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_OBIETTIVO1, "OBIETTIVO1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, 3400, 900, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, "727436D7-9878-4FE2-915A-50393D9CDB3C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, "FINANZIAMEN2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN2, BUK_CONTRODISPON_SPAN_FINANZIAMEN1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Finanziamento", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_FINANZIAMEN1, "58E0A8E1-09EC-4EDA-8958-704D0C7E4FAE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_OPERA2, 5600, 900, 1900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_OPERA2, "C2C4F1DD-224E-4363-8069-FAC09E84416F");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_OPERA2, "OPERA2");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_OPERA2, BUK_CONTRODISPON_SPAN_OPERA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Opera", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_OPERA1, "0540F1FC-78EE-47B5-B7E6-51BD785A8F98");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_OPERA1, "OPERA1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_ESHEADER, BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, 3400, 900, 4700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, "3C9F549B-21AB-4BB5-983F-6DECA923EC3E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, "UNITAORGANIZ");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_UNITAORGANIZ, BUK_CONTRODISPON_SPAN_UNITAORGANIZ, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Unità Organizzativa", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_UNITAORGANIZ, "CE0DBE9A-FD20-4BCC-9926-CD72278603BD");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_UNITAORGANIZ, "UNITAORGANIZ");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "VOCE_PEG");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_VOCPEGGROHEA, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_VOCPEGGROHEA, "70B4C866-F50E-4155-AA5A-644082EBE820");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_DETAIL, "0EB531D9-7ABF-4CFC-BC8D-06E130243DA0");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_DETAIL, "DETAIL");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPATTUALE3, 9300, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPATTUALE3, "945477F0-6939-4D5C-B8DB-B9B50069B698");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPATTUALE3, "DISPATTUALE3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPATTUALE3, BUK_CONTRODISPON_SPAN_REDIATRCD1CD, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_ATTUALE", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REDIATRCD1CD, "916F1BCD-BA61-42FB-A224-5E81ADD0E0CB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REDIATRCD1CD, "REDIATRCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, 12200, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, "1D680AD9-D24C-44AF-8BB4-1873AFB8956E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, "VARPROVVISO3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARPROVVISO3, BUK_CONTRODISPON_SPAN_REVAPRRCD1CD, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::VAR_PROVVISORIE", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REVAPRRCD1CD, "FAEED635-631C-4107-9B3F-01BD974FBC61");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REVAPRRCD1CD, "REVAPRRCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, 15100, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, "188CD3D1-9499-4875-88C6-03FD8192BED3");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, "VARPROPOSTA1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARPROPOSTA1, BUK_CONTRODISPON_SPAN_REPRRECOD1C1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::VAR_PROPOSTA", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REPRRECOD1C1, "0BDBC790-8391-46AF-A4B2-6227438A6614");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REPRRECOD1C1, "REPRRECOD1C1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, 18000, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, "BE2B5F61-EDBB-4B79-B496-B70D88356E33");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, "DISPPROPOST1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPPROPOST1, BUK_CONTRODISPON_SPAN_REDIRIRCD1CD, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_PROPOSTA", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REDIRIRCD1CD, "76E20185-781B-4576-8067-9B7EB19CC5D6");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REDIRIRCD1CD, "REDIRIRCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, 20900, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, "53A84F54-1C6D-4D66-83C1-468FBFAF73AF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, "VARALTREPRO1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VARALTREPRO1, BUK_CONTRODISPON_SPAN_REALPRRCD1CD, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::VAR_ALTRE_PROPOSTE", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REALPRRCD1CD, "ABCB940E-1519-4561-9A71-220DD9609C03");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REALPRRCD1CD, "REALPRRCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPRISULTA5, 23800, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPRISULTA5, "1576E8F0-3752-4535-96FD-76B596EB2CE6");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPRISULTA5, "DISPRISULTA5");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPRISULTA5, BUK_CONTRODISPON_SPAN_REDIR1RCD1CD, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_RISULTANTE", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REDIR1RCD1CD, "53B6A002-C648-4F03-984F-47FB850AD377");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REDIR1RCD1CD, "REDIR1RCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_VOCEPEG4, 600, 0, 2700, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, "FE46EAD7-8B14-41DD-9FDC-B75C02FF9BEB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, "VOCEPEG4");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VOCEPEG4, BUK_CONTRODISPON_SPAN_REVOPERCD1CD, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384961, "To String (POL WRK DISP PVB RISORSA INTERVENTO) +c trattino con spazi +c To String (POL WRK DISP PVB CAPITOLO) +c barra con spazi +c To String (POL WRK DISP PVB ARTICOLO) +c trattino con spazi +c POL WRK DISP PVB VOCE PEG", "::VOCE_PEG", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REVOPERCD1CD, "02B19F80-B64E-4F4A-AA6F-823A92D0B534");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REVOPERCD1CD, "REVOPERCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_TIPOTOT1, 7600, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, "2C1E6FC6-BFC8-42E6-A91D-5AFE5D65D455");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, "TIPOTOT1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TIPOTOT1, BUK_CONTRODISPON_SPAN_TT1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_TT1, "D683EB74-AB84-4EA2-BD4E-6E431D110164");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_TT1, "TT1");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_PROGETTOID1, 3400, 0, 2100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, "972FC1AC-F91F-474B-A0E4-C0CE7BCA1B81");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, "PROGETTOID1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PROGETTOID1, BUK_CONTRODISPON_SPAN_REPRRECOD1CD, MyGlb.VIS_DEFAREPOSTYL, 5, 9, 0, 271384961, "", "::PROGETTO_ID", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REPRRECOD1CD, "DC694B33-D2B1-4BC9-8CED-22375CA276FE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REPRRECOD1CD, "REPRRECOD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, 5600, 0, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, "01214DCE-4AC5-4DA5-AB16-28FB7DCFDEED");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, "CODICEOBIET1");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CODICEOBIET1, BUK_CONTRODISPON_SPAN_RECOOBRCD1CD, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384961, "", "::CODICE_OBIETTIVO", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_RECOOBRCD1CD, "72887C3A-7343-4976-B33A-0FA147CFB961");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_RECOOBRCD1CD, "RECOOBRCD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, 3400, 0, 2100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, "11C082D6-097B-4A01-B4DE-0555347A24D8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, "FINANZIAMEN3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_FINANZIAMEN3, BUK_CONTRODISPON_SPAN_REFIRECOD1CD, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384961, "", "::FINANZIAMENTO", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REFIRECOD1CD, "2D6E069D-BD11-4DDE-B0E9-8BAFF20E1DD1");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REFIRECOD1CD, "REFIRECOD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_OPERA3, 5500, 0, 2000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_OPERA3, "BB299877-B624-44C0-9058-4F3C7B8AAE02");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_OPERA3, "OPERA3");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_OPERA3, BUK_CONTRODISPON_SPAN_REOPRECOD1CD, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384961, "", "::OPERA", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REOPRECOD1CD, "C340C033-D8E5-4FEE-B042-8B94B2E018E0");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REOPRECOD1CD, "REOPRECOD1CD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_UO, 3400, 0, 5800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_UO, "86ABD2AA-B472-4FAD-A538-C124501D70E9");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_UO, "UO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_UO, BUK_CONTRODISPON_SPAN_UO, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319169, "", "::DES_UNITA_ORGANIZZATIVA", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_UO, "B511F451-B4EF-418A-865B-2BB32F6ED1C8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_UO, "UO");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_VOCPEGGROFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "VOCE_PEG");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_VOCPEGGROFOO, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_VOCPEGGROFOO, "62F44C9A-E558-4BAF-AD9E-C76B8DCF4A26");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_ESFOOTER, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "E_S");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_ESFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_ESFOOTER, "6002BDD5-846F-4022-AC6B-D5AEB3D0E83A");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_ESFOOTER, "ESFOOTER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEFOOTER, "4A8C83C6-7CE9-46B8-9805-3F18DA8E54C2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_REPORT, BUK_CONTRODISPON_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTFOOTER, "42E355A8-FE67-4A50-BEA8-4064891BCCBE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_ESHEADER, "E_S");
    BUK_CONTRODISPON.AddReportGroup(BUK_CONTRODISPON_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_CONTRODISPON_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONTRODISPON_InitLinks()
  {
    BUK_CONTRODISPON.SetBoxNextBox(BUK_CONTRODISPON_RPTBOX_PAGEBODY1, BUK_CONTRODISPON_RPTBOX_PAGEBODY1);
  }

  private void BUK_CONDISSTACOM_MST_TEMPLATE_Init()
  {
    BUK_CONDISSTACOM.InitMastro(BUK_CONDISSTACOM_MST_TEMPLATE, 3, 21000, 29700, 1, 2, 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_MST_TEMPLATE, "D54C7409-B09E-4EAF-BFD6-9539F9FD609F");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_MST_TEMPLATE, "TEMPLATE");
    BUK_CONDISSTACOM.InitMastroBox(BUK_CONDISSTACOM_MST_TEMPLATE, BUK_CONDISSTACOM_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PAGEHEADER, "BD1CD3F8-882C-44F0-A15B-6AA8593F99E8");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONDISSTACOM.InitMastroBox(BUK_CONDISSTACOM_MST_TEMPLATE, BUK_CONDISSTACOM_RPTBOX_PAGEBODY, 900, 2800, 27700, 16300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PAGEBODY, "6E1DF5D2-865A-4F52-8905-B0A8F5301B2D");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONDISSTACOM.InitMastroBox(BUK_CONDISSTACOM_MST_TEMPLATE, BUK_CONDISSTACOM_RPTBOX_PAGEFOOTER, 1000, 19500, 27700, 400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PAGEFOOTER, "8C39B1B2-BA2F-4EFD-8D3B-1C9EBC5F8597");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONDISSTACOM.InitMastroBox(BUK_CONDISSTACOM_MST_TEMPLATE, BUK_CONDISSTACOM_RPTBOX_PAG, 26900, 1000, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PAG, "623886B3-8B51-4623-B4E3-2948E9A0A40D");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PAG, "PAG");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_PAG, BUK_CONDISSTACOM_SPAN_CPTSCDSCRCD1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_CPTSCDSCRCD1, "8D44A344-59F6-4F4A-834C-8D32AC335BB0");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_CPTSCDSCRCD1, "CPTSCDSCRCD1");
  }

  private void BUK_CONDISSTACOM_RPT_REPORT_InitQuery() { BUK_CONDISSTACOM_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONDISSTACOM_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
      SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
      SQL.append("  A.CODICE_OBIETTIVO as CODICE_OBIETTIVO, ");
      SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
      SQL.append("  A.OPERA as OPERA, ");
      SQL.append("  A.DISP_ATTUALE as DISP_ATTUALE, ");
      SQL.append("  A.VAR_PROVVISORIE as VAR_PROVVISORIE, ");
      SQL.append("  A.VAR_PROPOSTA as VAR_PROPOSTA, ");
      SQL.append("  A.DISP_PROPOSTA as DISP_PROPOSTA, ");
      SQL.append("  A.VAR_ALTRE_PROPOSTE as VAR_ALTRE_PROPOSTE, ");
      SQL.append("  A.DISP_RISULTANTE as DISP_RISULTANTE, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) || ' - ' || A.VOCE_PEG as RECVOCPECODE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
      SQL.append("from ");
      SQL.append("  POL_WRK_DISP_PVB A ");
      SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.VOCE_PEG, ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_CONDISSTACOM.SetReportQuery(BUK_CONDISSTACOM_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "C4DBFA36-0B39-4481-94B8-F46C987018D9");
      if (BUK_CONDISSTACOM.FindObjByID(BUK_CONDISSTACOM_SEC_ESHEADER) != null)
        BUK_CONDISSTACOM.AddReportGroup(BUK_CONDISSTACOM_SEC_ESHEADER, "E_S");
      if (BUK_CONDISSTACOM.FindObjByID(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA) != null)
        BUK_CONDISSTACOM.AddReportGroup(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, "VOCE_PEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONDISSTACOM_RPT_REPORT_Init()
  {
    BUK_CONDISSTACOM.InitReport(BUK_CONDISSTACOM_RPT_REPORT, 196865);
    BUK_CONDISSTACOM_RPT_REPORT_InitQuery(true, false);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPT_REPORT, "A9ACA89F-3282-422C-9C5B-07300A5779AB");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPT_REPORT, "REPORT");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_REPORTHEADER, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_REPORTHEADER, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_REPORTHEADER, "9A0188A8-031C-4323-9EBF-4167A9D34F65");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_PAGEHEADER, 1100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_PAGEHEADER, BUK_CONDISSTACOM_RPTBOX_PAGEHEADER);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_PAGEHEADER, "0DF2BF91-4AD8-4C01-A997-6461D73DF9F3");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_PAGEHEADER, BUK_CONDISSTACOM_RPTBOX_TITOLO, 0, 0, 25800, 1100, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_TITOLO, "66FE1D7B-43C7-4BD3-AB76-7CAB48B01A87");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_TITOLO, "TITOLO");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_TITOLO, BUK_CONDISSTACOM_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 5, 151, 0, 271319169, "", "", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_TITOLO, "A3607141-2754-4E6A-921C-EEAA3FBECF77");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_TITOLO, "TITOLO");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_ESHEADER, 800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "E_S");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_ESHEADER, "B08C8A99-9CA6-4AAD-B2AF-FE43790ADED5");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_ESHEADER, "ESHEADER");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_VOCEPEG2, 0, 300, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VOCEPEG2, "7A0CD9F4-4FB4-4384-95FB-C6C28CF4D331");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VOCEPEG2, "VOCEPEG2");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VOCEPEG2, BUK_CONDISSTACOM_SPAN_VOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Voce P.e.g.", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_VOCEPEG, "3A72BC64-25C9-4F7D-B0D9-6125BD53EB9C");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_VOCEPEG, "VOCEPEG");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, 9100, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, "E2E764C7-028D-4DC6-8A2A-99F824F8806F");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, "DISPATTUALE1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE1, BUK_CONDISSTACOM_SPAN_DISPATTUALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Attuale", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_DISPATTUALE, "0C4FA9E6-FC27-405D-AC36-3C5B1F017BD5");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_DISPATTUALE, "DISPATTUALE");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1, 12000, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1, "488DB901-1092-4010-8744-E01E5C91E34F");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1, "VARPROVVISO1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VARPROVVISO1, BUK_CONDISSTACOM_SPAN_VARPROVVISOR, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Var. Provvisorie", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_VARPROVVISOR, "5BCCD01C-1EA8-4AC1-88FB-51BF7B4115BE");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_VARPROVVISOR, "VARPROVVISOR");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_PROPOSTA, 14900, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PROPOSTA, "6FE13877-A3DD-4814-B10F-47E61A7A0227");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PROPOSTA, "PROPOSTA");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_PROPOSTA, BUK_CONDISSTACOM_SPAN_PROPOSTA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Proposta", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_PROPOSTA, "08AD9643-C658-44B6-A028-8DA5614CBFF8");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_PROPOSTA, "PROPOSTA");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2, 17800, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2, "0AB0C66D-FC44-4914-BE52-CAF891D11708");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2, "DISPRISULTA2");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA2, BUK_CONDISSTACOM_SPAN_DISPRISULTA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Risultante", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_DISPRISULTA1, "6DFD6D0F-E41B-4FD9-9115-F0604749750E");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_DISPRISULTA1, "DISPRISULTA1");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST, 20700, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST, "CBD92132-19BD-4A76-BE6F-9745717CB23F");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST, "ALTREPROPOST");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_ALTREPROPOST, BUK_CONDISSTACOM_SPAN_ALTREPROPOST, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Altre Proposte", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_ALTREPROPOST, "1CCBC881-B2EF-46D9-ACC5-FCBDA90A1A19");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_ALTREPROPOST, "ALTREPROPOST");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1, 23600, 300, 2400, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1, "CB7D554E-D1E1-4382-8C59-4C40DEC2E438");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1, "DISPRISULTA1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPRISULTA1, BUK_CONDISSTACOM_SPAN_DISPRISULTAN, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Disp. Risultante", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_DISPRISULTAN, "CBCAC833-0E4F-4B0D-81F0-ECCD83F115E1");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_DISPRISULTAN, "DISPRISULTAN");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_BARRA, 0, 500, 26000, 300, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_BARRA, "45D9DBE1-715D-4758-99D5-CD4CF2041721");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_BARRA, "BARRA");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_PROGETTO, 2700, 300, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PROGETTO, "3E9FE019-4C14-4E75-A38C-4F97F3701B61");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PROGETTO, "PROGETTO");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_PROGETTO, BUK_CONDISSTACOM_SPAN_PROGETTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Progetto", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_PROGETTO, "BF61AAB0-1284-40EF-874F-D501FD11340C");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_PROGETTO, "PROGETTO");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, 5000, 300, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, "7B1C5CA6-1CF7-4573-AFF7-FD252D3AAA5E");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, "OBIETTIVO");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_OBIETTIVO, BUK_CONDISSTACOM_SPAN_OBIETTIVO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Obiettivo", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_OBIETTIVO, "848C86B3-B239-4E67-9B3E-E84D41F04FD4");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_OBIETTIVO, "OBIETTIVO");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, 2700, 300, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, "DABEE6C3-B944-485F-BCB0-4EFDCA49AF7E");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_FINANZIAMEN1, BUK_CONDISSTACOM_SPAN_FINANZIAMENT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Finanziamento", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_FINANZIAMENT, "3A51E0E2-6891-428E-81D7-F39A7F291B25");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_ESHEADER, BUK_CONDISSTACOM_RPTBOX_OPERA1, 5300, 300, 1900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_OPERA1, "09989517-F390-4E90-B4E5-2DB2A20C3EFB");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_OPERA1, "OPERA1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_OPERA1, BUK_CONDISSTACOM_SPAN_OPERA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Opera", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_OPERA, "3011DFE0-EA96-4B8B-8BFA-0B168724439B");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_OPERA, "OPERA");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "VOCE_PEG");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, "0C29D32D-E094-48ED-B2FC-10F2340D0ABD");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_DETAIL, "4620F6B6-1486-45A4-89E2-C3548F559857");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_DETAIL, "DETAIL");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_DISPATTUALE, 9100, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE, "7942A715-5376-4D5C-84A8-73D5707653B6");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE, "DISPATTUALE");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPATTUALE, BUK_CONDISSTACOM_SPAN_REDARCD1CDSC, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_ATTUALE", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REDARCD1CDSC, "DF3A7093-3C02-4A4C-98A9-D6438B2C0EDE");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REDARCD1CDSC, "REDARCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, 12000, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, "9E0EB3CA-501E-48AF-923C-E55139FBF6CF");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, "VARPROVVISOR");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VARPROVVISOR, BUK_CONDISSTACOM_SPAN_REVPRCD1CDS1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::VAR_PROVVISORIE", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REVPRCD1CDS1, "CA439766-F137-44BD-9891-446A40C0BFE2");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REVPRCD1CDS1, "REVPRCD1CDS1");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, 14900, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, "3D80B3BE-FF3A-448A-B3F4-A1510B5EF757");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, "VARPROPOSTA");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VARPROPOSTA, BUK_CONDISSTACOM_SPAN_REPRRCD1CDS1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::VAR_PROPOSTA", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REPRRCD1CDS1, "65940F45-097D-486B-A96A-86401FFDDA99");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REPRRCD1CDS1, "REPRRCD1CDS1");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, 17800, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, "5DA0ACA4-3F41-4DF9-9669-DE553A7DDC3D");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, "DISPPROPOSTA");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPPROPOSTA, BUK_CONDISSTACOM_SPAN_REDRRCD1CDSC, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_PROPOSTA", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REDRRCD1CDSC, "9AFA2D2F-AA45-4461-991D-A62C1ED022B5");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REDRRCD1CDSC, "REDRRCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, 20700, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, "4A2453E8-0F68-4339-8443-FDC36D53BC6E");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, "VARALTREPROP");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VARALTREPROP, BUK_CONDISSTACOM_SPAN_REAPRCD1CDSC, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::VAR_ALTRE_PROPOSTE", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REAPRCD1CDSC, "60B39CBB-C0D1-4A2C-AC93-A288EDB15B03");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REAPRCD1CDSC, "REAPRCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN, 23600, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN, "8F929D9C-A861-4E42-BA5E-C31A19AFEBB2");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN, "DISPRISULTAN");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_DISPRISULTAN, BUK_CONDISSTACOM_SPAN_RDR1RCD1CDSC, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384961, "", "::DISP_RISULTANTE", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_RDR1RCD1CDSC, "2556CEC0-A05E-461D-B827-43F4C14F5AF0");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_RDR1RCD1CDSC, "RDR1RCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, 0, 0, 2600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, "185D23BB-08E0-4788-80B4-C6ADD1E530D4");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_VOCEPEG1, BUK_CONDISSTACOM_SPAN_REVPRCD1CDSC, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384961, "To String (POL WRK DISP PVB RISORSA INTERVENTO) +c trattino con spazi +c To String (POL WRK DISP PVB CAPITOLO) +c barra con spazi +c To String (POL WRK DISP PVB ARTICOLO) +c trattino con spazi +c POL WRK DISP PVB VOCE PEG", "::VOCE_PEG", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REVPRCD1CDSC, "D148B80C-226C-4A4A-896E-06F95BEEEB6C");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REVPRCD1CDSC, "REVPRCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_TIPOTOT, 7300, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, "04B1FC9D-0879-4873-8B2D-AB51E890594F");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, "TIPOTOT");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_TIPOTOT, BUK_CONDISSTACOM_SPAN_TT, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_TT, "D23667FF-2BCB-4B03-89FB-9D3E128D7AC3");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_TT, "TT");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_PROGETTOID, 2700, 0, 2200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, "EF8AD59C-BEB2-4A39-97BE-86513FAE1A94");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, "PROGETTOID");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_PROGETTOID, BUK_CONDISSTACOM_SPAN_REPRRCD1CDSC, MyGlb.VIS_DEFAREPOSTYL, 5, 9, 0, 271384961, "", "::PROGETTO_ID", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REPRRCD1CDSC, "9D55FA69-C734-4CCD-8520-774CC9092432");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REPRRCD1CDSC, "REPRRCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, 5000, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, "2A0BA578-7FE9-4B4F-8E34-361CF2DF7DF6");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, "CODICEOBIETT");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_CODICEOBIETT, BUK_CONDISSTACOM_SPAN_RECORCD1CDSC, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384961, "", "::CODICE_OBIETTIVO", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_RECORCD1CDSC, "C3DE6440-DEA1-43F9-8D60-FA86830198BE");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_RECORCD1CDSC, "RECORCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, 2700, 0, 2200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, "11D5CC2A-29F7-4132-B466-C559779C1DC1");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_FINANZIAMENT, BUK_CONDISSTACOM_SPAN_REFIRCD1CDSC, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384961, "", "::FINANZIAMENTO", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REFIRCD1CDSC, "C96C7CF5-4645-403E-ACE5-93C402ECC25E");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REFIRCD1CDSC, "REFIRCD1CDSC");
    BUK_CONDISSTACOM.InitReportBox(BUK_CONDISSTACOM_SEC_DETAIL, BUK_CONDISSTACOM_RPTBOX_OPERA, 5000, 0, 2200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_RPTBOX_OPERA, "9F5ACB38-AFD7-42CD-933C-2682026F5709");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_RPTBOX_OPERA, "OPERA");
    BUK_CONDISSTACOM.InitBoxSpan(BUK_CONDISSTACOM_RPTBOX_OPERA, BUK_CONDISSTACOM_SPAN_REOPRCD1CDSC, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384961, "", "::OPERA", 1);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SPAN_REOPRCD1CDSC, "A2A3D487-4419-4515-B31D-130E32244BA9");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SPAN_REOPRCD1CDSC, "REOPRCD1CDSC");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_VOCPEGGROFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "VOCE_PEG");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_VOCPEGGROFOO, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_VOCPEGGROFOO, "4F4A0988-A01A-4A6B-8856-31AF0A542070");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_ESFOOTER, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "E_S");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_ESFOOTER, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_ESFOOTER, "78CA15E6-23D3-4950-814A-44634F6152F5");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_ESFOOTER, "ESFOOTER");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_PAGEFOOTER, BUK_CONDISSTACOM_RPTBOX_PAGEFOOTER);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_PAGEFOOTER, "A0B83DFE-2866-4DD5-B7E0-05FB150803B0");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONDISSTACOM.InitSection(BUK_CONDISSTACOM_RPT_REPORT, BUK_CONDISSTACOM_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONDISSTACOM.SetSectionRendersInto(BUK_CONDISSTACOM_SEC_REPORTFOOTER, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
    BUK_CONDISSTACOM.SetRTCGuid(BUK_CONDISSTACOM_SEC_REPORTFOOTER, "A0DFF82A-006F-4B92-ABBA-9F07DDD7E995");
    BUK_CONDISSTACOM.SetObjCode(BUK_CONDISSTACOM_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONDISSTACOM.AddReportGroup(BUK_CONDISSTACOM_SEC_ESHEADER, "E_S");
    BUK_CONDISSTACOM.AddReportGroup(BUK_CONDISSTACOM_SEC_VOCPEGGROHEA, "VOCE_PEG");
    BUK_CONDISSTACOM_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONDISSTACOM_InitLinks()
  {
    BUK_CONDISSTACOM.SetBoxNextBox(BUK_CONDISSTACOM_RPTBOX_PAGEBODY, BUK_CONDISSTACOM_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FAKE) PAN_FAKE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FAKE) PAN_FAKE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FAKE) PAN_FAKE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FAKE) PAN_FAKE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FAKE) PAN_FAKE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FAKE) PAN_FAKE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnConnecting(DBConn);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnPreview();
    if (SrcObj == BKW_CONDISSTACOM) BUK_CONDISSTACOM_OnPreview();
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
