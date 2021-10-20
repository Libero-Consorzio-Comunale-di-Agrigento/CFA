// **********************************************
// Elenco Proposte Sospese Annullate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoProposteSospeseAnnullate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_ELEPROSOSANN;
  OBook BKW_ELEPROSOSANN;
  //
  // Template Pages constants
  private static int BUK_ELEPROSOSANN_MST_ELEPROSOSANN = 1;
  private static int BUK_ELEPROSOSANN_RPTBOX_PAGEHEADER2 = 2;
  private static int BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2 = 3;
  private static int BUK_ELEPROSOSANN_RPTBOX_PAGEFOOTER2 = 4;
  private static int BUK_ELEPROSOSANN_RPTBOX_PAG2 = 5;
  private static int BUK_ELEPROSOSANN_SPAN_CPTSEPSAEPSA = 6;

  //
  // Reports constants
  private static int BUK_ELEPROSOSANN_RPT_REPORT = 7;
  private static int BUK_ELEPROSOSANN_SEC_REPORTHEADER = 8;
  private static int BUK_ELEPROSOSANN_SEC_PAGEHEADER = 9;
  private static int BUK_ELEPROSOSANN_RPTBOX_TITOLO3 = 10;
  private static int BUK_ELEPROSOSANN_SPAN_ROWNAMETITOL = 11;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI2 = 12;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIONPI4 = 13;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN2 = 14;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN4 = 15;
  private static int BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA = 16;
  private static int BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9 = 17;
  private static int BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR2 = 18;
  private static int BUK_ELEPROSOSANN_RPTBOX_ENTRATASPES2 = 19;
  private static int BUK_ELEPROSOSANN_SPAN_REENSEPSASSP = 20;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI3 = 21;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIONPI5 = 22;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN3 = 23;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN5 = 24;
  private static int BUK_ELEPROSOSANN_SEC_TITOGROUHEAD = 25;
  private static int BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10 = 26;
  private static int BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR3 = 27;
  private static int BUK_ELEPROSOSANN_RPTBOX_TITOLO4 = 28;
  private static int BUK_ELEPROSOSANN_SPAN_CTTSRTEPSAEP = 29;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU3 = 30;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIONPI6 = 31;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO5 = 32;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN6 = 33;
  private static int BUK_ELEPROSOSANN_SEC_TIPOVAR = 34;
  private static int BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4 = 35;
  private static int BUK_ELEPROSOSANN_SPAN_ESPANDCOMPRI = 36;
  private static int BUK_ELEPROSOSANN_RPTBOX_DESTIPOVAR1 = 37;
  private static int BUK_ELEPROSOSANN_SPAN_RPWBADTVEPS1 = 38;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU4 = 39;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIONPI7 = 40;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO4 = 41;
  private static int BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN7 = 42;
  private static int BUK_ELEPROSOSANN_SEC_TIPOVAR2 = 43;
  private static int BUK_ELEPROSOSANN_RPTBOX_VOCEPEG6 = 44;
  private static int BUK_ELEPROSOSANN_SPAN_VOCEPEG2 = 45;
  private static int BUK_ELEPROSOSANN_RPTBOX_DESCRIZIONE2 = 46;
  private static int BUK_ELEPROSOSANN_SPAN_DESCRIZIONE1 = 47;
  private static int BUK_ELEPROSOSANN_RPTBOX_BARRA3 = 48;
  private static int BUK_ELEPROSOSANN_SEC_DETAIL = 49;
  private static int BUK_ELEPROSOSANN_RPTBOX_VOCEPEG7 = 50;
  private static int BUK_ELEPROSOSANN_SPAN_VOCEPEG3 = 51;
  private static int BUK_ELEPROSOSANN_RPTBOX_DESVOCEPEG1 = 52;
  private static int BUK_ELEPROSOSANN_SPAN_DESVOCEPEG1 = 53;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARPIU1 = 54;
  private static int BUK_ELEPROSOSANN_SPAN_RPWBAIPEPSAS = 55;
  private static int BUK_ELEPROSOSANN_RPTBOX_VARMENO1 = 56;
  private static int BUK_ELEPROSOSANN_SPAN_RPWBAIMEPSAS = 57;
  private static int BUK_ELEPROSOSANN_SEC_TIPOVAR3 = 58;
  private static int BUK_ELEPROSOSANN_SEC_TIPOVAR1 = 59;
  private static int BUK_ELEPROSOSANN_SEC_TITOGROUFOOT = 60;
  private static int BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO = 61;
  private static int BUK_ELEPROSOSANN_SEC_PAGEFOOTER = 62;
  private static int BUK_ELEPROSOSANN_SEC_REPORTFOOTER = 63;

  private static int PFL_FAKE_ES = 0;
  private static int PFL_FAKE_TITOLO = 1;
  private static int PFL_FAKE_DESTITOLO = 2;
  private static int PFL_FAKE_TIPOVARIAZIO = 3;
  private static int PFL_FAKE_DESTIPOVARIA = 4;
  private static int PFL_FAKE_VOCEPEG1 = 5;
  private static int PFL_FAKE_DESCRIZIONE = 6;
  private static int PFL_FAKE_PROGRESSIVO = 7;
  private static int PFL_FAKE_IMPORTO1 = 8;
  private static int PFL_FAKE_IMPORTO = 9;

  private static int PPQRY_POLWRKSITU25 = 0;


  IDPanel PAN_FAKE;
  CIDREObj BUK_STCOELPRSOAN;
  OBook BKW_STCOELPRSOAN;
  //
  // Template Pages constants
  private static int BUK_STCOELPRSOAN_MST_ELEPROSOSANN = 1;
  private static int BUK_STCOELPRSOAN_RPTBOX_PAGEHEADER1 = 2;
  private static int BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1 = 3;
  private static int BUK_STCOELPRSOAN_RPTBOX_PAGEFOOTER1 = 4;
  private static int BUK_STCOELPRSOAN_RPTBOX_PAG1 = 5;
  private static int BUK_STCOELPRSOAN_SPAN_CPTSSCEPSAEP = 6;

  //
  // Reports constants
  private static int BUK_STCOELPRSOAN_RPT_REPORT = 7;
  private static int BUK_STCOELPRSOAN_SEC_REPORTHEADER = 8;
  private static int BUK_STCOELPRSOAN_SEC_PAGEHEADER = 9;
  private static int BUK_STCOELPRSOAN_RPTBOX_TITOLO2 = 10;
  private static int BUK_STCOELPRSOAN_SPAN_RNTPDRESEPSA = 11;
  private static int BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA = 12;
  private static int BUK_STCOELPRSOAN_RPTBOX_ENTRATASPES1 = 13;
  private static int BUK_STCOELPRSOAN_SPAN_RESEPSAEPSA1 = 14;
  private static int BUK_STCOELPRSOAN_SEC_TITOGROUHEAD = 15;
  private static int BUK_STCOELPRSOAN_RPTBOX_TITOLO1 = 16;
  private static int BUK_STCOELPRSOAN_SPAN_CTTSRTEPSASC = 17;
  private static int BUK_STCOELPRSOAN_SEC_TIPOVAR = 18;
  private static int BUK_STCOELPRSOAN_RPTBOX_DESTIPOVAR = 19;
  private static int BUK_STCOELPRSOAN_SPAN_RPWBADTVEPSA = 20;
  private static int BUK_STCOELPRSOAN_SEC_TIPOVAR2 = 21;
  private static int BUK_STCOELPRSOAN_RPTBOX_VOCEPEG4 = 22;
  private static int BUK_STCOELPRSOAN_SPAN_VOCEPEG1 = 23;
  private static int BUK_STCOELPRSOAN_RPTBOX_DESCRIZIONE1 = 24;
  private static int BUK_STCOELPRSOAN_SPAN_DESCRIZIONE = 25;
  private static int BUK_STCOELPRSOAN_RPTBOX_BARRA2 = 26;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPI1 = 27;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIONPI1 = 28;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIOMENO = 29;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN2 = 30;
  private static int BUK_STCOELPRSOAN_SEC_DETAIL = 31;
  private static int BUK_STCOELPRSOAN_RPTBOX_VOCEPEG5 = 32;
  private static int BUK_STCOELPRSOAN_SPAN_VOCEPEG = 33;
  private static int BUK_STCOELPRSOAN_RPTBOX_DESVOCEPEG = 34;
  private static int BUK_STCOELPRSOAN_SPAN_DESVOCEPEG = 35;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARPIU = 36;
  private static int BUK_STCOELPRSOAN_SPAN_RPWBAIPEPSAE = 37;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARMENO = 38;
  private static int BUK_STCOELPRSOAN_SPAN_RPWBAIMEPSAE = 39;
  private static int BUK_STCOELPRSOAN_SEC_TIPOVAR3 = 40;
  private static int BUK_STCOELPRSOAN_SEC_TIPOVAR1 = 41;
  private static int BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO2 = 42;
  private static int BUK_STCOELPRSOAN_SPAN_TOTTITOLO1 = 43;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU2 = 44;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIONPIU = 45;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO2 = 46;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN1 = 47;
  private static int BUK_STCOELPRSOAN_SEC_TITOGROUFOOT = 48;
  private static int BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO = 49;
  private static int BUK_STCOELPRSOAN_SPAN_TOTTITOLO2 = 50;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU1 = 51;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIONPI3 = 52;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO3 = 53;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN3 = 54;
  private static int BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO = 55;
  private static int BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO1 = 56;
  private static int BUK_STCOELPRSOAN_SPAN_TOTTITOLO = 57;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPIU = 58;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIONPI2 = 59;
  private static int BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO1 = 60;
  private static int BUK_STCOELPRSOAN_SPAN_VARIAZIOMENO = 61;
  private static int BUK_STCOELPRSOAN_SEC_PAGEFOOTER = 62;
  private static int BUK_STCOELPRSOAN_SEC_REPORTFOOTER = 63;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR72(IMDB);
    //
    //
    Init_PQRY_POLWRKBOZAN1(IMDB);
    Init_PQRY_POLWRKSITU25(IMDB);
    Init_PQRY_POLWRKBOZANN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR72(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR72, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR72, "TBL_PAR72");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMTIPVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMETITOL,5,200,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMANNOSO, "ROWNAMANNOSO");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMANNOSO,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR72,IMDBDef4.FLD_PAR72_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR72, 0);
  }

  private static void Init_PQRY_POLWRKBOZAN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKBOZAN1, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKBOZAN1, "PQRY_POLWRKBOZAN1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_UNITA_ORGANIZZATIVA, "DES_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_UNITA_ORGANIZZATIVA,5,120,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_TITOLO,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_TITOLO, "DES_TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_TITOLO,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_RECOENTRSPES, "RECOENTRSPES");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_RECOENTRSPES,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_IMPORTO_PIU, "IMPORTO_PIU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_IMPORTO_PIU,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_IMPORTO_MENO, "IMPORTO_MENO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_IMPORTO_MENO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_TIPO_VAR, "DES_TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DES_TIPO_VAR,5,40,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZAN1,IMDBDef12.PQSL_POLWRKBOZAN1_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKBOZAN1, 0);
  }

  private static void Init_PQRY_POLWRKSITU25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKSITU25, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKSITU25, "PQRY_POLWRKSITU25");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_UNITA_ORGANIZZATIVA, "DES_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_UNITA_ORGANIZZATIVA,5,120,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_TITOLO,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_RECORVOCEPEG,5,22,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_TITOLO, "DES_TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_TITOLO,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_TIPO_VAR, "DES_TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DES_TIPO_VAR,5,40,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_IMPORTO_PIU, "IMPORTO_PIU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_IMPORTO_PIU,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_IMPORTO_MENO, "IMPORTO_MENO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSITU25,IMDBDef12.PQSL_POLWRKSITU25_IMPORTO_MENO,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKSITU25, 0);
  }

  private static void Init_PQRY_POLWRKBOZANN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKBOZANN, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKBOZANN, "PQRY_POLWRKBOZANN");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_UNITA_ORGANIZZATIVA, "DES_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_UNITA_ORGANIZZATIVA,5,120,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_TITOLO,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_TITOLO, "DES_TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_TITOLO,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_RECOENTRSPES, "RECOENTRSPES");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_RECOENTRSPES,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_IMPORTO_PIU, "IMPORTO_PIU");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_IMPORTO_PIU,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_IMPORTO_MENO, "IMPORTO_MENO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_IMPORTO_MENO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_TIPO_VAR, "DES_TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DES_TIPO_VAR,5,40,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKBOZANN,IMDBDef12.PQSL_POLWRKBOZANN_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKBOZANN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoProposteSospeseAnnullate(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoProposteSospeseAnnullate()
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
    FormIdx = MyGlb.FRM_ELEPROSOSANN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "55B9EA44-A30D-4E06-9B1A-93BFC94C35EF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 996;
    DesignHeight = 670;
    set_Caption(new IDVariant("Elenco Proposte Sospese Annullate"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 996;
    Frames[1].Height = 644;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.881988;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 996;
    Frames[2].Height = 568;
    Frames[2].Caption = "Elenco Proposte Sospese Annullate";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 568;
    BKW_ELEPROSOSANN = new OBook(this);
    BUK_ELEPROSOSANN = new CIDREObj(BKW_ELEPROSOSANN);
    Frames[2].Content = BKW_ELEPROSOSANN;
    BKW_ELEPROSOSANN.Height = 538;
    BKW_ELEPROSOSANN.Width = 996;
    BKW_ELEPROSOSANN.iGuid = "BFCC30E5-6C4E-4BEF-8E75-5EE38F6C19E1";
    BKW_ELEPROSOSANN.Code = "BUK_ELEPROSOSANN";
    BKW_ELEPROSOSANN.BookObj = BUK_ELEPROSOSANN;
    BKW_ELEPROSOSANN.InitDefMasks();
    BUK_ELEPROSOSANN.set_FrIndex(2);
    BUK_ELEPROSOSANN.InitBook(1, 3342593, "Elenco Proposte Sospese Annullate", IMDB, MainFrm.VisualStyleList);
    BUK_ELEPROSOSANN.InitHTML();
    BUK_ELEPROSOSANN.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ELEPROSOSANN.SetSize(996, 538);
    BUK_ELEPROSOSANN.Book.SetMainFrm(MainFrm);
    BUK_ELEPROSOSANN.SetRTCGuid(0, "BFCC30E5-6C4E-4BEF-8E75-5EE38F6C19E1");
    BUK_ELEPROSOSANN.SetObjCode(0, "ELEPROSOSANN");
    BUK_ELEPROSOSANN_MST_ELEPROSOSANN_Init();
    BUK_ELEPROSOSANN_RPT_REPORT_Init();
    BUK_ELEPROSOSANN_InitLinks();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 996;
    Frames[3].Height = 76;
    Frames[3].Caption = "Fake";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 76;
    PAN_FAKE = new IDPanel(w, this, 3, "PAN_FAKE");
    Frames[3].Content = PAN_FAKE;
    PAN_FAKE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FAKE.VS = MainFrm.VisualStyleList;
    PAN_FAKE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 76-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5C5995D9-1B97-4E8D-B5D7-08593731CED3");
    PAN_FAKE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1660, 16, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FAKE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FAKE.InitStatus = 2;
    PAN_FAKE_Init();
    PAN_FAKE_InitFields();
    PAN_FAKE_InitQueries();
    BKW_STCOELPRSOAN = new OBook(this);
    BUK_STCOELPRSOAN = new CIDREObj(BKW_STCOELPRSOAN);
    BKW_STCOELPRSOAN.iGuid = "B83C02F6-A4D0-419C-8579-8310E9F4D49B";
    BKW_STCOELPRSOAN.Code = "BUK_STCOELPRSOAN";
    BKW_STCOELPRSOAN.BookObj = BUK_STCOELPRSOAN;
    BKW_STCOELPRSOAN.InitDefMasks();
    BUK_STCOELPRSOAN.InitBook(1, 3342593, "Stampa Completa Elenco Proposte Sospese Annullate", IMDB, MainFrm.VisualStyleList);
    BUK_STCOELPRSOAN.InitHTML();
    BUK_STCOELPRSOAN.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_STCOELPRSOAN.Book.SetMainFrm(MainFrm);
    BUK_STCOELPRSOAN.SetRTCGuid(0, "B83C02F6-A4D0-419C-8579-8310E9F4D49B");
    BUK_STCOELPRSOAN.SetObjCode(0, "STCOELPRSOAN");
    BUK_STCOELPRSOAN_MST_ELEPROSOSANN_Init();
    BUK_STCOELPRSOAN_RPT_REPORT_Init();
    BUK_STCOELPRSOAN_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FA2+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI84+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA2+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUT24+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUT30+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPACOMP21+BaseCmdLinIdx)
      {
        StampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPORINEXC25+BaseCmdLinIdx)
      {
        EsportaInExcel();
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
      BUK_ELEPROSOSANN.UpdateBook();
      // BUK_STCOELPRSOAN.UpdateBook();
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
    if (Code.equals("BUK_ELEPROSOSANN")) return BUK_ELEPROSOSANN;
    if (Code.equals("BUK_STCOELPRSOAN")) return BUK_STCOELPRSOAN;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoProposteSospeseAnnullate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoProposteSospeseAnnullate.class.getName() : (Glb.ClassWithPackage(ElencoProposteSospeseAnnullate.class) ? ElencoProposteSospeseAnnullate.class.getName().substring(ElencoProposteSospeseAnnullate.class.getPackage().getName().length() + 1) : ElencoProposteSospeseAnnullate.class.getName()));
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
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TITOLO = (new IDVariant("Elenco Proposte ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_TITOLO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TITOLO, ((IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMANNOSO, 0).equals((new IDVariant("S")), true))?(new IDVariant("Sospese")):(new IDVariant("Annullate")))), (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMEESERC, 0)));
      IMDB.set_Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMETITOL, 0, new IDVariant(v_TITOLO));
      BUK_ELEPROSOSANN.set_PrintDestination((new IDVariant(1)).intValue());
      BUK_ELEPROSOSANN.ReportRefreshQuery(BUK_ELEPROSOSANN_RPT_REPORT);
      BUK_ELEPROSOSANN.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      if (IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMTIPVAR, 0).equals((new IDVariant()), true))
      {
        BUK_ELEPROSOSANN.set_SectionVisible(BUK_ELEPROSOSANN_SEC_TIPOVAR, (new IDVariant(0)).booleanValue());
        BUK_STCOELPRSOAN.set_SectionVisible(BUK_STCOELPRSOAN_SEC_TIPOVAR, (new IDVariant(0)).booleanValue());
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Entrata Spesa Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata Spesa Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA))).equals((new IDVariant(0)), true))
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "EntrataSpesaGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // TITOLO Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELEPROSOSANN_SEC_TITOGROUHEAD_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // TITOLO Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD))).equals((new IDVariant(0)), true))
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "TITOLOGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // TIPO VAR Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ELEPROSOSANN_SEC_TIPOVAR_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // TIPO VAR Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR))).equals((new IDVariant(0)), true))
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, null, (new IDVariant("tp1.gif")).toString()); 
        BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(0)).booleanValue());
        BUK_ELEPROSOSANN.set_SectionVisible(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, null, (new IDVariant("tm1.gif")).toString()); 
        BUK_ELEPROSOSANN.set_SectionVisible(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(-1)).booleanValue());
        BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "TIPOVARBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Comprimi Tutto
  // **********************************************************************
  public int ComprimiTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comprimi Tutto Body
      // Procedure Body
      // 
      EspandiTutto();
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(0)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR, (new IDVariant(0)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, (new IDVariant(0)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, (new IDVariant(0)).booleanValue());
      BUK_ELEPROSOSANN.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "ComprimiTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi Tutto
  // **********************************************************************
  public int EspandiTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi Tutto Body
      // Procedure Body
      // 
      ComprimiTutto();
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, (new IDVariant(-1)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR, (new IDVariant(-1)).booleanValue());
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR2, (new IDVariant(-1)).booleanValue());
      BUK_ELEPROSOSANN.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "EspandiTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Completa
  // **********************************************************************
  public int StampaCompleta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Completa Body
      // Procedure Body
      // 
      BUK_STCOELPRSOAN.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_STCOELPRSOAN.ReportRefreshQuery(BUK_STCOELPRSOAN_RPT_REPORT);
      BUK_STCOELPRSOAN.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      if (IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMTIPVAR, 0).equals((new IDVariant()), true))
      {
        BUK_STCOELPRSOAN.set_SectionVisible(BUK_STCOELPRSOAN_SEC_TIPOVAR1, (new IDVariant(0)).booleanValue());
      }
      MainFrm.set_RedirectTo((new IDVariant(BUK_STCOELPRSOAN.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "StampaCompleta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Esporta In Excel
  // **********************************************************************
  public int EsportaInExcel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esporta In Excel Body
      // Procedure Body
      // 
      PAN_FAKE.set_Visible((new IDVariant(-1)).booleanValue());
      new IDVariant(PAN_FAKE.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_FAKE.set_Visible((new IDVariant(0)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "EsportaInExcel", _e);
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
      PAN_FAKE.set_Visible((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProposteSospeseAnnullate", "FakeAfterFindEvent", _e);
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
  private void BUK_ELEPROSOSANN_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ELEPROSOSANN_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELEPROSOSANN_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_PAGEHEADER)
    {
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_ROWNAMETITOL, new IDVariant(IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMETITOL, 0)));
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA)
    {
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI5, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA,"IMPORTO_PIU")));
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN5, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA,"IMPORTO_MENO")));
      BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TITOGROUHEAD)
    {
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_CTTSRTEPSAEP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_ELEPROSOSANN.GetReportColumn(BUK_ELEPROSOSANN_RPT_REPORT, "TITOLO"))), (new IDVariant(" - "))), BUK_ELEPROSOSANN.GetReportColumn(BUK_ELEPROSOSANN_RPT_REPORT, "DES_TITOLO"))));
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI6, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_TITOGROUHEAD,"IMPORTO_PIU")));
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN6, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_TITOGROUHEAD,"IMPORTO_MENO")));
      BUK_ELEPROSOSANN_SEC_TITOGROUHEAD_OnFormattingSection();
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TIPOVAR)
    {
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI7, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_TIPOVAR,"IMPORTO_PIU")));
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN7, new IDVariant(BUK_ELEPROSOSANN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELEPROSOSANN_SEC_TIPOVAR,"IMPORTO_MENO")));
      BUK_ELEPROSOSANN_SEC_TIPOVAR_OnFormattingSection();
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TIPOVAR2)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TIPOVAR3)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TIPOVAR1)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_TITOGROUFOOT)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ELEPROSOSANN_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ELEPROSOSANN_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ELEPROSOSANN_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ELEPROSOSANN_MST_ELEPROSOSANN)
    {
      BUK_ELEPROSOSANN.set_SpanValue(BUK_ELEPROSOSANN_SPAN_CPTSEPSAEPSA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELEPROSOSANN.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELEPROSOSANN.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ELEPROSOSANN_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9)
    {
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, !BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA));
    }
    if (ObjID==BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10)
    {
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, !BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD));
    }
    if (ObjID==BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4)
    {
      BUK_ELEPROSOSANN.set_SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR, !BUK_ELEPROSOSANN.SectionShowChildren(BUK_ELEPROSOSANN_SEC_TIPOVAR));
    }
  }

  private void BUK_ELEPROSOSANN_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ELEPROSOSANN_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ELEPROSOSANN_OnPreview()
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

  private void BUK_STCOELPRSOAN_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_STCOELPRSOAN_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STCOELPRSOAN_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_PAGEHEADER)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_RNTPDRESEPSA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef4.TBL_PAR72, IMDBDef4.FLD_PAR72_ROWNAMETITOL, 0), (new IDVariant(" - "))), (new IDVariant("Parte"))), (new IDVariant(" "))), (BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TITOGROUHEAD)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_CTTSRTEPSASC, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "TITOLO"))), (new IDVariant(" - "))), BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "DES_TITOLO"))));
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TIPOVAR)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TIPOVAR2)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TIPOVAR3)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TIPOVAR1)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_TOTTITOLO1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "DES_TIPO_VAR"))));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIONPIU, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_TIPOVAR1,"IMPORTO_PIU")));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN1, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_TIPOVAR1,"IMPORTO_MENO")));
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_TITOGROUFOOT)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_TOTTITOLO2, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), (new IDVariant("Titolo"))), (new IDVariant(" "))), IDL.ToString(BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "TITOLO")))));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI3, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_TITOGROUFOOT,"IMPORTO_PIU")));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN3, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_TITOGROUFOOT,"IMPORTO_MENO")));
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_TOTTITOLO, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(" "))), (BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "E_S").equals((new IDVariant("E")))? new IDVariant("Entrata") : BUK_STCOELPRSOAN.GetReportColumn(BUK_STCOELPRSOAN_RPT_REPORT, "E_S").equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()))));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI2, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO,"IMPORTO_PIU")));
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_VARIAZIOMENO, new IDVariant(BUK_STCOELPRSOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO,"IMPORTO_MENO")));
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_STCOELPRSOAN_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_STCOELPRSOAN_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_STCOELPRSOAN_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_STCOELPRSOAN_MST_ELEPROSOSANN)
    {
      BUK_STCOELPRSOAN.set_SpanValue(BUK_STCOELPRSOAN_SPAN_CPTSSCEPSAEP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STCOELPRSOAN.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_STCOELPRSOAN.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_STCOELPRSOAN_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_STCOELPRSOAN_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_STCOELPRSOAN_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_STCOELPRSOAN_OnPreview()
  {
    PreviewBook = BKW_STCOELPRSOAN;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FAKE_Init()
  {

    PAN_FAKE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "0C9D011A-3F1C-4FE8-8012-1613B623C087");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "E/S");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_ES, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, "8E54FC76-5A0F-400E-9015-F56FD17D361B");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, "Titolo");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, "94BE4142-95EC-48E2-95EB-E41D0D8F50B7");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, "Des_Titolo");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, "61BE5302-B614-469D-AAE8-5137F705B76E");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, "Tipo Variazione");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, "37240676-E6BA-42D2-88D7-1DF674F3159A");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, "Des_Tipo Variazione");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, "0813AF78-35B2-40A6-82E3-551BD8B37182");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, "Voce P E G");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, "C\"'\" + POL WRK BOZZA ANN VOCE PEG + \"'\"");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, "71D4A1C0-3AB7-4C20-B978-426B24BAF146");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, "Descrizione");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, "E36FF3DC-4FDE-40A6-BA49-63940C3A295D");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, "PROGRESSIVO");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, "A27882A1-6714-43E2-A163-A095B259F65F");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, "Importo +");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, "CAC530B3-FA47-4655-8713-7FF65EA8C197");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, "Importo -");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.VIS_NORMFIELPADR);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FAKE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 24);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 4, 172, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 24);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_ES, MyGlb.PANEL_FORM, "E S");
    PAN_FAKE.SetFieldPage(PFL_FAKE_ES, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_ES, PPQRY_POLWRKSITU25, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_LIST, 40, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_FORM, 4, 112, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_FAKE.SetFieldPage(PFL_FAKE_TITOLO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_TITOLO, PPQRY_POLWRKSITU25, "A.TITOLO", "TITOLO", 1, 1, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_LIST, 88, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_LIST, 68);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_LIST, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_LIST, "Des_Titolo");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_FORM, 4, 724, 428, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_FORM, 68);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_FORM, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESTITOLO, MyGlb.PANEL_FORM, "Des_Titolo");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DESTITOLO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DESTITOLO, PPQRY_POLWRKSITU25, "A.DES_TITOLO", "DES_TITOLO", 5, 140, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_LIST, 444, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_LIST, 56);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Variaz.");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 760, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_FORM, 56);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tp. Var.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_TIPOVARIAZIO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_TIPOVARIAZIO, PPQRY_POLWRKSITU25, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_LIST, 500, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_LIST, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_LIST, "Des_Tipo Variazione");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_FORM, 4, 784, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_FORM, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESTIPOVARIA, MyGlb.PANEL_FORM, "Des Tp. Var.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DESTIPOVARIA, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DESTIPOVARIA, PPQRY_POLWRKSITU25, "A.DES_TIPO_VAR", "DES_TIPO_VAR", 5, 40, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_LIST, 708, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_LIST, 60);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_LIST, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_LIST, "Voce P E G");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_FORM, 4, 652, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_FORM, 60);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_FORM, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_VOCEPEG1, MyGlb.PANEL_FORM, "Voce P E G");
    PAN_FAKE.SetFieldPage(PFL_FAKE_VOCEPEG1, -1, -1);
    PAN_FAKE.SetFieldUnbound(PFL_FAKE_VOCEPEG1, true);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_VOCEPEG1, PPQRY_POLWRKSITU25, "'''' || A.VOCE_PEG || ''''", "RECORVOCEPEG", 5, 22, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_LIST, 1136, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 808, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FAKE.SetFieldPage(PFL_FAKE_DESCRIZIONE, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_DESCRIZIONE, PPQRY_POLWRKSITU25, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 700, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_FAKE.SetFieldPage(PFL_FAKE_PROGRESSIVO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_PROGRESSIVO, PPQRY_POLWRKSITU25, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_LIST, 1492, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_LIST, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_LIST, "Importo +");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_FORM, 4, 844, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_FORM, 76);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO1, MyGlb.PANEL_FORM, "Importo +");
    PAN_FAKE.SetFieldPage(PFL_FAKE_IMPORTO1, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_IMPORTO1, PPQRY_POLWRKSITU25, "A.IMPORTO_PIU", "IMPORTO_PIU", 3, 14, 2, -13997);
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_LIST, 1572, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_LIST, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_LIST, "Importo -");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_FORM, 4, 868, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_FORM, 88);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_IMPORTO, MyGlb.PANEL_FORM, "Importo -");
    PAN_FAKE.SetFieldPage(PFL_FAKE_IMPORTO, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_IMPORTO, PPQRY_POLWRKSITU25, "A.IMPORTO_MENO", "IMPORTO_MENO", 3, 14, 2, -13997);
  }

  private void PAN_FAKE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FAKE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FAKE.SetIMDB(IMDB, "PQRY_POLWRKSITU25", true);
    PAN_FAKE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as DES_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
    SQL.append("  '''' || A.VOCE_PEG || '''' as RECORVOCEPEG, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.DES_TITOLO as DES_TITOLO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.DES_TIPO_VAR as DES_TIPO_VAR, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO_PIU as IMPORTO_PIU, ");
    SQL.append("  A.IMPORTO_MENO as IMPORTO_MENO ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_WRK_BOZZA_ANN A ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FAKE.SetQuery(PPQRY_POLWRKSITU25, 5, SQL, -1, "");
    PAN_FAKE.SetQueryDB(PPQRY_POLWRKSITU25, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FAKE.SetMasterTable(0, "POL_WRK_BOZZA_ANN");
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

  private void BUK_ELEPROSOSANN_MST_ELEPROSOSANN_Init()
  {
    BUK_ELEPROSOSANN.InitMastro(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, 3, 21000, 29700, 1, 1, 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, "216B1C17-D025-434F-BF06-3F0ED114154A");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, "ELEPROSOSANN");
    BUK_ELEPROSOSANN.InitMastroBox(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, BUK_ELEPROSOSANN_RPTBOX_PAGEHEADER2, 1000, 1000, 18900, 2600, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_PAGEHEADER2, "764D1900-5406-47E7-B7C6-88CDD37C8F73");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_PAGEHEADER2, "PAGEHEADER2");
    BUK_ELEPROSOSANN.InitMastroBox(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2, 1000, 3600, 18900, 24500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2, "3C79B324-A282-4372-ADB5-CFB9E2BE3C75");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2, "PAGEBODY2");
    BUK_ELEPROSOSANN.InitMastroBox(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, BUK_ELEPROSOSANN_RPTBOX_PAGEFOOTER2, 1000, 28300, 18900, 300, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_PAGEFOOTER2, "2D8073A3-4D27-4D33-B4D6-B31C98E06287");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_PAGEFOOTER2, "PAGEFOOTER2");
    BUK_ELEPROSOSANN.InitMastroBox(BUK_ELEPROSOSANN_MST_ELEPROSOSANN, BUK_ELEPROSOSANN_RPTBOX_PAG2, 18200, 1000, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_PAG2, "F9146BE3-1A41-431A-99F8-B02564B0859F");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_PAG2, "PAG2");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_PAG2, BUK_ELEPROSOSANN_SPAN_CPTSEPSAEPSA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_CPTSEPSAEPSA, "E6E15AF7-DB49-4E1E-B274-BD643A62BC94");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_CPTSEPSAEPSA, "CPTSEPSAEPSA");
  }

  private void BUK_ELEPROSOSANN_RPT_REPORT_InitQuery() { BUK_ELEPROSOSANN_RPT_REPORT_InitQuery(true, true); }
  private void BUK_ELEPROSOSANN_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.DES_UNITA_ORGANIZZATIVA as DES_UNITA_ORGANIZZATIVA, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  A.DES_TITOLO as DES_TITOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  CASE WHEN A.E_S = 'E' THEN 'Entrate' ELSE 'Spese' END as RECOENTRSPES, ");
      SQL.append("  A.IMPORTO_PIU as IMPORTO_PIU, ");
      SQL.append("  A.IMPORTO_MENO as IMPORTO_MENO, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.DES_TIPO_VAR as DES_TIPO_VAR, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  POL_WRK_BOZZA_ANN A ");
      SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 8, 5, 12, 11, 1 ");
      BUK_ELEPROSOSANN.SetReportQuery(BUK_ELEPROSOSANN_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "108A98CA-9242-425A-9D47-A55E1329214C");
      if (BUK_ELEPROSOSANN.FindObjByID(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA) != null)
        BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, "RECOENTRSPES");
      if (BUK_ELEPROSOSANN.FindObjByID(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD) != null)
        BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, "TITOLO");
      if (BUK_ELEPROSOSANN.FindObjByID(BUK_ELEPROSOSANN_SEC_TIPOVAR) != null)
        BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TIPOVAR, "DES_TIPO_VAR");
      if (BUK_ELEPROSOSANN.FindObjByID(BUK_ELEPROSOSANN_SEC_TIPOVAR2) != null)
        BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TIPOVAR2, "TIPO_VAR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELEPROSOSANN_RPT_REPORT_Init()
  {
    BUK_ELEPROSOSANN.InitReport(BUK_ELEPROSOSANN_RPT_REPORT, 196865);
    BUK_ELEPROSOSANN_RPT_REPORT_InitQuery(true, false);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPT_REPORT, "B0D21F97-1B59-44FB-90F9-9EB16CAADC48");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPT_REPORT, "REPORT");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_REPORTHEADER, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_REPORTHEADER, "14F5328C-0E45-44EC-BAF4-371B6FF2F4EB");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_PAGEHEADER, 2600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_PAGEHEADER, BUK_ELEPROSOSANN_RPTBOX_PAGEHEADER2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_PAGEHEADER, "7046F29B-3913-48A8-AE36-9302D3685E94");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_PAGEHEADER, BUK_ELEPROSOSANN_RPTBOX_TITOLO3, 0, 0, 17100, 1900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_TITOLO3, "D71AD036-9E85-4AF9-8EF0-B234B8A0D405");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_TITOLO3, "TITOLO3");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_TITOLO3, BUK_ELEPROSOSANN_SPAN_ROWNAMETITOL, MyGlb.VIS_TITOLOREPORT, 5, 200, 0, 271384705, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_ROWNAMETITOL, "3C199AE0-B64C-4E45-A62C-803A4A4DE9D0");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_ROWNAMETITOL, "ROWNAMETITOL");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_PAGEHEADER, BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI2, 11500, 2000, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI2, "1131AD5F-6511-4C78-AABF-F001B583D657");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI2, "VARIAZIONPI2");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI2, BUK_ELEPROSOSANN_SPAN_VARIAZIONPI4, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Variazione +", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI4, "C49F89C9-FB5B-4AA5-B4BE-0CAF709EBC0C");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI4, "VARIAZIONPI4");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_PAGEHEADER, BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN2, 14400, 2000, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN2, "6447FBC0-D7E6-41EB-A0C6-A8446834195A");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN2, "VARIAZIOMEN2");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN2, BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN4, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Variazione -", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN4, "07A76083-BF9F-48D8-9048-1B6DE09B6189");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN4, "VARIAZIOMEN4");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 589825, "RECOENTRSPES");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, "D092360F-A259-4466-A8EE-A3158A56395F");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, "ENTSPEGROHEA");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, 100, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, null, "tp1.gif");
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, "D3F6E762-094F-436D-B8DC-3F5ACCDB6052");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, "ESPACOMPENT9");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT9, BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR2, MyGlb.VIS_HYPERLINK2, 0, 0, 0, 271319425, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR2, "AEFE7D7D-31EB-4705-A495-1EA80FD1AD3C");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR2, "ESPANDCOMPR2");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, BUK_ELEPROSOSANN_RPTBOX_ENTRATASPES2, 600, 100, 10600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_ENTRATASPES2, "B2ACD81C-8797-4247-AA6C-591BA88C656B");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_ENTRATASPES2, "ENTRATASPES2");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_ENTRATASPES2, BUK_ELEPROSOSANN_SPAN_REENSEPSASSP, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384961, "", "::RECOENTRSPES", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_REENSEPSASSP, "C38C9B4B-D898-4E63-AC42-84F8BAA0F407");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_REENSEPSASSP, "REENSEPSASSP");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI3, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI3, "544229EB-FE03-42AF-B8A7-4F50D0BFA7A2");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI3, "VARIAZIONPI3");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIONPI3, BUK_ELEPROSOSANN_SPAN_VARIAZIONPI5, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI5, "3B91EE4C-4687-42C2-9887-8C7A7F16EEAA");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI5, "VARIAZIONPI5");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN3, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN3, "DD568B73-A907-462A-A2DA-A67BAEEBB2A2");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN3, "VARIAZIOMEN3");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOMEN3, BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN5, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN5, "8EA79658-B263-4BEC-9669-497A35F605CD");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN5, "VARIAZIOMEN5");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 589825, "TITOLO");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, "9CCAACF6-9512-4EBB-93FC-BE73FFE5E7C0");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, "TITOGROUHEAD");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, 500, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, null, "tp1.gif");
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, "63BA0BE4-9B46-4197-9EF9-C5DAE8C47ADA");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, "ESPACOMPEN10");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPEN10, BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR3, MyGlb.VIS_HYPERLINK2, 0, 0, 0, 271319425, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR3, "0588D399-8B71-4C93-8771-388760F305A5");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPR3, "ESPANDCOMPR3");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, BUK_ELEPROSOSANN_RPTBOX_TITOLO4, 1000, 100, 10200, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_TITOLO4, "C958F0E2-866B-4087-9D7A-99E7DB2E80F9");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_TITOLO4, "TITOLO4");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_TITOLO4, BUK_ELEPROSOSANN_SPAN_CTTSRTEPSAEP, MyGlb.VIS_INTSENZABORD, 5, 249, 0, 271384705, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_CTTSRTEPSAEP, "CC267EAD-82EE-4CAF-A223-96AC14B1FB79");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_CTTSRTEPSAEP, "CTTSRTEPSAEP");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU3, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU3, "7848B66B-3D6A-4AFB-AE39-D32A8CE4FD07");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU3, "VARIAZIOPIU3");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU3, BUK_ELEPROSOSANN_SPAN_VARIAZIONPI6, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI6, "09E08EFB-6756-44EE-A40C-42271B60885E");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI6, "VARIAZIONPI6");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO5, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO5, "7D4E8F26-1F40-4C0C-940E-D3D00D1977FF");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO5, "VARIAZIMENO5");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO5, BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN6, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN6, "B4D73559-A7CC-4389-92BA-E891369504CE");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN6, "VARIAZIOMEN6");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TIPOVAR, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 589825, "DES_TIPO_VAR");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TIPOVAR, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TIPOVAR, "F331EBBE-5A9A-4524-BC95-A231E9ABDD22");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TIPOVAR, "TIPOVAR");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR, BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, 1000, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetBoxImage(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, null, "tp1.gif");
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, "5A8A70B7-5811-4F41-9C77-62B7F53AFC98");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, "ESPACOMPENT4");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_ESPACOMPENT4, BUK_ELEPROSOSANN_SPAN_ESPANDCOMPRI, MyGlb.VIS_HYPERLINK2, 0, 0, 0, 271319425, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPRI, "CEA03B13-445F-426C-B599-23236CCE7307");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR, BUK_ELEPROSOSANN_RPTBOX_DESTIPOVAR1, 1500, 100, 9700, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_DESTIPOVAR1, "38ABC3A5-A0DC-4400-AF05-0696E7B8F277");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_DESTIPOVAR1, "DESTIPOVAR1");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_DESTIPOVAR1, BUK_ELEPROSOSANN_SPAN_RPWBADTVEPS1, MyGlb.VIS_INTSENZABORD, 5, 40, 0, 271384705, "", "::DES_TIPO_VAR", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_RPWBADTVEPS1, "27F7DBAA-3E63-493D-BFAF-A09DD440C500");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_RPWBADTVEPS1, "RPWBADTVEPS1");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR, BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU4, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU4, "A4B7CBAC-CD99-4E0C-84AB-829C826951F5");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU4, "VARIAZIOPIU4");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIOPIU4, BUK_ELEPROSOSANN_SPAN_VARIAZIONPI7, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI7, "F1F1B567-15E4-49E7-A9BC-A4AD281883F3");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIONPI7, "VARIAZIONPI7");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR, BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO4, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO4, "17B0891A-CE56-45D3-8AE9-6022C0B76CF6");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO4, "VARIAZIMENO4");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARIAZIMENO4, BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN7, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN7, "90CD3664-DD07-469C-A5CC-DC8A00EAF300");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VARIAZIOMEN7, "VARIAZIOMEN7");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TIPOVAR2, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "TIPO_VAR");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TIPOVAR2, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TIPOVAR2, "3A6B1C49-8E9E-4D72-9CAD-D613B13E6FAB");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TIPOVAR2, "TIPOVAR2");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR2, BUK_ELEPROSOSANN_RPTBOX_VOCEPEG6, 1500, 0, 2800, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG6, "37B80BCA-EDFD-403A-910C-DE3829D79172");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG6, "VOCEPEG6");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG6, BUK_ELEPROSOSANN_SPAN_VOCEPEG2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Voce P.e.g.", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VOCEPEG2, "113D84B6-0DC5-444E-A527-F92A63EEC132");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VOCEPEG2, "VOCEPEG2");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR2, BUK_ELEPROSOSANN_RPTBOX_DESCRIZIONE2, 4400, 0, 6800, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_DESCRIZIONE2, "C5FEBFDE-0764-492A-A850-181FFD0D1A18");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_DESCRIZIONE2, BUK_ELEPROSOSANN_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_DESCRIZIONE1, "6879D54C-C607-4372-BEEB-264D9473FF1A");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_TIPOVAR2, BUK_ELEPROSOSANN_RPTBOX_BARRA3, 1500, 400, 15600, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_BARRA3, "839C629F-7AC5-4C1D-BC7D-F50AE55F4CC7");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_BARRA3, "BARRA3");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_DETAIL, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_DETAIL, "24B45837-02E2-41B9-BFAD-20A1906875E0");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_DETAIL, "DETAIL");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_DETAIL, BUK_ELEPROSOSANN_RPTBOX_VOCEPEG7, 1500, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG7, "D01139A4-5B6C-4818-8397-AC9703DC7946");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG7, "VOCEPEG7");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VOCEPEG7, BUK_ELEPROSOSANN_SPAN_VOCEPEG3, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271319425, "", "::VOCE_PEG", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_VOCEPEG3, "75D588E3-450F-4FB9-832C-2FB4F97F8B08");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_VOCEPEG3, "VOCEPEG3");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_DETAIL, BUK_ELEPROSOSANN_RPTBOX_DESVOCEPEG1, 4400, 0, 6800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_DESVOCEPEG1, "59557568-414F-46B3-A793-AA87C20980CF");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_DESVOCEPEG1, "DESVOCEPEG1");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_DESVOCEPEG1, BUK_ELEPROSOSANN_SPAN_DESVOCEPEG1, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271319169, "", "::DESCRIZIONE", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_DESVOCEPEG1, "0419AA49-B124-4A3E-83F7-CC0EE372A405");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_DESVOCEPEG1, "DESVOCEPEG1");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_DETAIL, BUK_ELEPROSOSANN_RPTBOX_VARPIU1, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARPIU1, "E767AC1E-EC49-4702-8691-65C11BE8C69F");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARPIU1, "VARPIU1");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARPIU1, BUK_ELEPROSOSANN_SPAN_RPWBAIPEPSAS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_PIU", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_RPWBAIPEPSAS, "4E3FD1C9-6212-48B1-BADA-25DB91BBCEF4");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_RPWBAIPEPSAS, "RPWBAIPEPSAS");
    BUK_ELEPROSOSANN.InitReportBox(BUK_ELEPROSOSANN_SEC_DETAIL, BUK_ELEPROSOSANN_RPTBOX_VARMENO1, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_RPTBOX_VARMENO1, "15453318-736D-4A4B-9EF9-801F1EAE3DA5");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_RPTBOX_VARMENO1, "VARMENO1");
    BUK_ELEPROSOSANN.InitBoxSpan(BUK_ELEPROSOSANN_RPTBOX_VARMENO1, BUK_ELEPROSOSANN_SPAN_RPWBAIMEPSAS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_MENO", 1);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SPAN_RPWBAIMEPSAS, "9CF04E91-6855-423C-8E5E-6B3852DFD13D");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SPAN_RPWBAIMEPSAS, "RPWBAIMEPSAS");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TIPOVAR3, 1000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TIPO_VAR");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TIPOVAR3, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TIPOVAR3, "63738A9D-18B6-46B9-B527-742DAA649161");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TIPOVAR3, "TIPOVAR3");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TIPOVAR1, 1000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "DES_TIPO_VAR");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TIPOVAR1, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TIPOVAR1, "EA9ADCF0-AEF8-4C52-95B4-AF9D58456DE4");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TIPOVAR1, "TIPOVAR1");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_TITOGROUFOOT, 1000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TITOLO");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_TITOGROUFOOT, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_TITOGROUFOOT, "16CD3D26-0601-46CB-8955-E632A5417BAE");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_TITOGROUFOOT, "TITOGROUFOOT");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO, 1000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOENTRSPES");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO, "26E85C60-155B-478C-97BE-C35F90173256");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_ENTSPEGROFOO, "ENTSPEGROFOO");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_PAGEFOOTER, BUK_ELEPROSOSANN_RPTBOX_PAGEFOOTER2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_PAGEFOOTER, "3A963620-9245-4CE4-A167-3A7C5CEF8261");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ELEPROSOSANN.InitSection(BUK_ELEPROSOSANN_RPT_REPORT, BUK_ELEPROSOSANN_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ELEPROSOSANN.SetSectionRendersInto(BUK_ELEPROSOSANN_SEC_REPORTFOOTER, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
    BUK_ELEPROSOSANN.SetRTCGuid(BUK_ELEPROSOSANN_SEC_REPORTFOOTER, "76D639BB-BD9E-40BB-BC98-272E017922B3");
    BUK_ELEPROSOSANN.SetObjCode(BUK_ELEPROSOSANN_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_ENTSPEGROHEA, "RECOENTRSPES");
    BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TITOGROUHEAD, "TITOLO");
    BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TIPOVAR, "DES_TIPO_VAR");
    BUK_ELEPROSOSANN.AddReportGroup(BUK_ELEPROSOSANN_SEC_TIPOVAR2, "TIPO_VAR");
    BUK_ELEPROSOSANN_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_ELEPROSOSANN_InitLinks()
  {
    BUK_ELEPROSOSANN.SetBoxNextBox(BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2, BUK_ELEPROSOSANN_RPTBOX_PAGEBODY2);
  }

  private void BUK_STCOELPRSOAN_MST_ELEPROSOSANN_Init()
  {
    BUK_STCOELPRSOAN.InitMastro(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, 3, 21000, 29700, 1, 1, 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, "22EF7810-D04E-4D8C-87A6-06C0E70B6975");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, "ELEPROSOSANN");
    BUK_STCOELPRSOAN.InitMastroBox(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, BUK_STCOELPRSOAN_RPTBOX_PAGEHEADER1, 1000, 1000, 18900, 2200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_PAGEHEADER1, "D1ADF98C-003E-4F9D-B676-52862B8F41FD");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_STCOELPRSOAN.InitMastroBox(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1, 1000, 3200, 18900, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1, "981BF181-32DB-48D2-B555-6D9B427BE9E0");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_STCOELPRSOAN.InitMastroBox(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, BUK_STCOELPRSOAN_RPTBOX_PAGEFOOTER1, 1000, 28300, 18900, 300, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_PAGEFOOTER1, "2C2A872A-CC70-4303-B885-AEB9581BEA6A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
    BUK_STCOELPRSOAN.InitMastroBox(BUK_STCOELPRSOAN_MST_ELEPROSOSANN, BUK_STCOELPRSOAN_RPTBOX_PAG1, 18200, 1000, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_PAG1, "08A126A2-5085-4B4A-8729-A578DAFA3E29");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_PAG1, "PAG1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_PAG1, BUK_STCOELPRSOAN_SPAN_CPTSSCEPSAEP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_CPTSSCEPSAEP, "05C471E2-A2E8-4DA8-B8BA-23D82B10B43A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_CPTSSCEPSAEP, "CPTSSCEPSAEP");
  }

  private void BUK_STCOELPRSOAN_RPT_REPORT_InitQuery() { BUK_STCOELPRSOAN_RPT_REPORT_InitQuery(true, true); }
  private void BUK_STCOELPRSOAN_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.DES_UNITA_ORGANIZZATIVA as DES_UNITA_ORGANIZZATIVA, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  A.DES_TITOLO as DES_TITOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  CASE WHEN A.E_S = 'E' THEN 'Entrate' ELSE 'Spese' END as RECOENTRSPES, ");
      SQL.append("  A.IMPORTO_PIU as IMPORTO_PIU, ");
      SQL.append("  A.IMPORTO_MENO as IMPORTO_MENO, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.DES_TIPO_VAR as DES_TIPO_VAR, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  POL_WRK_BOZZA_ANN A ");
      SQL.append("where (A.SESSIONE_ID = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 8, 5, 12, 11, 1 ");
      BUK_STCOELPRSOAN.SetReportQuery(BUK_STCOELPRSOAN_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2699F2B7-95B7-41D2-A341-08D053C9FEB3");
      if (BUK_STCOELPRSOAN.FindObjByID(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA) != null)
        BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, "RECOENTRSPES");
      if (BUK_STCOELPRSOAN.FindObjByID(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD) != null)
        BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, "TITOLO");
      if (BUK_STCOELPRSOAN.FindObjByID(BUK_STCOELPRSOAN_SEC_TIPOVAR) != null)
        BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TIPOVAR, "DES_TIPO_VAR");
      if (BUK_STCOELPRSOAN.FindObjByID(BUK_STCOELPRSOAN_SEC_TIPOVAR2) != null)
        BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TIPOVAR2, "TIPO_VAR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STCOELPRSOAN_RPT_REPORT_Init()
  {
    BUK_STCOELPRSOAN.InitReport(BUK_STCOELPRSOAN_RPT_REPORT, 196865);
    BUK_STCOELPRSOAN_RPT_REPORT_InitQuery(true, false);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPT_REPORT, "6A71E787-A8AE-4E46-941D-D9CEBFFAA0F9");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPT_REPORT, "REPORT");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_REPORTHEADER, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_REPORTHEADER, "741A6BA6-A95E-4257-912B-7B543317506A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_PAGEHEADER, 2500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_PAGEHEADER, BUK_STCOELPRSOAN_RPTBOX_PAGEHEADER1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_PAGEHEADER, "E3A81CE1-B9B9-4749-8D33-2C4E865BE291");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_PAGEHEADER, BUK_STCOELPRSOAN_RPTBOX_TITOLO2, 0, 0, 17100, 1900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_TITOLO2, "8CD815C2-8F4B-4F00-8100-AC6173DA3957");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_TITOLO2, "TITOLO2");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_TITOLO2, BUK_STCOELPRSOAN_SPAN_RNTPDRESEPSA, MyGlb.VIS_TITOLOREPORT, 5, 308, 0, 271384705, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_RNTPDRESEPSA, "41383FDF-6E60-4779-B8FE-03657B42C9F6");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_RNTPDRESEPSA, "RNTPDRESEPSA");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECOENTRSPES");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, "0A86C209-CDB0-4F0C-9EDF-24D0E4CEC26A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, "ENTSPEGROHEA");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, BUK_STCOELPRSOAN_RPTBOX_ENTRATASPES1, 600, 100, 10600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_ENTRATASPES1, "DBC27D4B-1BDC-486B-8F07-8C458A987438");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_ENTRATASPES1, "ENTRATASPES1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_ENTRATASPES1, BUK_STCOELPRSOAN_SPAN_RESEPSAEPSA1, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384961, "", "::RECOENTRSPES", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_RESEPSAEPSA1, "504CCE05-D0C1-4FE8-A51C-BA6B849EBD3B");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_RESEPSAEPSA1, "RESEPSAEPSA1");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TITOLO");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, "745B52DB-8D98-4280-AE5C-DC2B468B716E");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, "TITOGROUHEAD");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, BUK_STCOELPRSOAN_RPTBOX_TITOLO1, 1000, 100, 10200, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_TITOLO1, "35EA6395-913A-4C96-85D7-11F9ABEC019C");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_TITOLO1, "TITOLO1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_TITOLO1, BUK_STCOELPRSOAN_SPAN_CTTSRTEPSASC, MyGlb.VIS_INTSENZABORD, 5, 249, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_CTTSRTEPSASC, "A275B31F-267B-4400-822F-F9D29A052F3A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_CTTSRTEPSASC, "CTTSRTEPSASC");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TIPOVAR, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "DES_TIPO_VAR");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TIPOVAR, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TIPOVAR, "0F91C71E-50FF-4058-91CD-79A0F9E1E596");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TIPOVAR, "TIPOVAR");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR, BUK_STCOELPRSOAN_RPTBOX_DESTIPOVAR, 1500, 100, 9700, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_DESTIPOVAR, "C78D6C21-5EFC-4AA2-A9FA-AC62C48A5652");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_DESTIPOVAR, "DESTIPOVAR");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_DESTIPOVAR, BUK_STCOELPRSOAN_SPAN_RPWBADTVEPSA, MyGlb.VIS_INTSENZABORD, 5, 40, 0, 271384705, "Brief description of field content.", "::DES_TIPO_VAR", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_RPWBADTVEPSA, "5A6D14EA-05CB-4908-8C30-8E0E49252AAE");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_RPWBADTVEPSA, "RPWBADTVEPSA");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TIPOVAR2, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "TIPO_VAR");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TIPOVAR2, "6D01919D-067F-48BB-8651-EFAAAA3959FE");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TIPOVAR2, "TIPOVAR2");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_VOCEPEG4, 1500, 0, 2800, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG4, "87706033-CAE5-4EFB-B432-D6F76BF16988");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG4, "VOCEPEG4");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG4, BUK_STCOELPRSOAN_SPAN_VOCEPEG1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Voce P.e.g.", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VOCEPEG1, "AB48983C-BD92-4DEE-8216-A9C5876DE075");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VOCEPEG1, "VOCEPEG1");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_DESCRIZIONE1, 4400, 0, 6800, 500, 0, 1, 3, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_DESCRIZIONE1, "D693B3AC-0ED2-41F9-85F2-9F9638CDFF3A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_DESCRIZIONE1, BUK_STCOELPRSOAN_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_DESCRIZIONE, "35D92584-FCE0-4B92-AD87-C4692FA3416E");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_BARRA2, 1500, 400, 15600, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_BARRA2, "5FF9ED3A-B753-4DB9-A053-EFD11FE0F6C1");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_BARRA2, "BARRA2");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPI1, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPI1, "B3C9C92C-8649-48D1-BD67-F3DDBC7F894D");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPI1, "VARIAZIONPI1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPI1, BUK_STCOELPRSOAN_SPAN_VARIAZIONPI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Variazione +", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI1, "35D21351-F2FC-46A3-805E-AB7795E2A1E5");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI1, "VARIAZIONPI1");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR2, BUK_STCOELPRSOAN_RPTBOX_VARIAZIOMENO, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOMENO, "F219E3D7-BD36-4A1C-9A3B-5A0B14B1A1F8");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOMENO, "VARIAZIOMENO");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOMENO, BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271319425, "", "Variazione -", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN2, "A8819F63-AB1F-49A1-A39B-95023492E598");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN2, "VARIAZIOMEN2");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_DETAIL, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_DETAIL, "5724DFA1-4C2C-4614-A254-55E92FF93D29");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_DETAIL, "DETAIL");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_DETAIL, BUK_STCOELPRSOAN_RPTBOX_VOCEPEG5, 1500, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG5, "06AFE2D3-26A0-4DEA-A35E-ADF2A1CFEF6D");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG5, "VOCEPEG5");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VOCEPEG5, BUK_STCOELPRSOAN_SPAN_VOCEPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271319425, "", "::VOCE_PEG", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VOCEPEG, "046E5ADB-63F2-4B89-9449-9FBD12976024");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VOCEPEG, "VOCEPEG");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_DETAIL, BUK_STCOELPRSOAN_RPTBOX_DESVOCEPEG, 4400, 0, 6800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_DESVOCEPEG, "5079BCC8-EA7A-4B2F-AE74-3299BBD7105F");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_DESVOCEPEG, "DESVOCEPEG");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_DESVOCEPEG, BUK_STCOELPRSOAN_SPAN_DESVOCEPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271319169, "", "::DESCRIZIONE", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_DESVOCEPEG, "9D7399FF-B507-4583-A414-66FB5EC538D1");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_DESVOCEPEG, "DESVOCEPEG");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_DETAIL, BUK_STCOELPRSOAN_RPTBOX_VARPIU, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARPIU, "80C84C48-E967-4091-9C68-D33FD0D0B506");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARPIU, "VARPIU");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARPIU, BUK_STCOELPRSOAN_SPAN_RPWBAIPEPSAE, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_PIU", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_RPWBAIPEPSAE, "D08D5BB6-574F-4780-92B3-C6EC1C3B83C1");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_RPWBAIPEPSAE, "RPWBAIPEPSAE");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_DETAIL, BUK_STCOELPRSOAN_RPTBOX_VARMENO, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARMENO, "36079A25-D1FB-4EAE-8238-33145A42AA30");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARMENO, "VARMENO");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARMENO, BUK_STCOELPRSOAN_SPAN_RPWBAIMEPSAE, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::IMPORTO_MENO", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_RPWBAIMEPSAE, "A191C274-1E36-4A9C-A45A-1509DE750D5B");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_RPWBAIMEPSAE, "RPWBAIMEPSAE");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TIPOVAR3, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TIPO_VAR");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TIPOVAR3, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TIPOVAR3, "F56914ED-E196-4441-ABCC-FBF360E65CA9");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TIPOVAR3, "TIPOVAR3");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TIPOVAR1, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "DES_TIPO_VAR");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TIPOVAR1, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TIPOVAR1, "16616423-1538-4A36-AA96-3D2E8AF47C41");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TIPOVAR1, "TIPOVAR1");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR1, BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO2, 1500, 0, 9700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO2, "0BDB6E1B-B3F0-43E2-9656-1DF55993D2A5");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO2, "TOTTITOLO2");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO2, BUK_STCOELPRSOAN_SPAN_TOTTITOLO1, MyGlb.VIS_INTSENBORRIG, 5, 47, 0, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_TOTTITOLO1, "B2468682-C8D0-4CC4-856D-17AB8F496E49");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_TOTTITOLO1, "TOTTITOLO1");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR1, BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU2, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU2, "31042034-3597-4A6B-9081-5459BDA2307B");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU2, "VARIAZIOPIU2");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU2, BUK_STCOELPRSOAN_SPAN_VARIAZIONPIU, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIONPIU, "044751A9-2A87-46F0-83B1-23586C9747E2");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIONPIU, "VARIAZIONPIU");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TIPOVAR1, BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO2, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO2, "5CAFDFE5-7DBB-496C-A0A6-24D3E96BBD86");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO2, "VARIAZIMENO2");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO2, BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN1, "2ADD67B6-9F1B-4F25-BAF8-C8434AC52F46");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN1, "VARIAZIOMEN1");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TITOLO");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, "991AB1C3-62DA-4063-9AC0-75621F844A0F");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, "TITOGROUFOOT");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO, 1500, 0, 9700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO, "A7F94002-425E-40AF-995C-3030542AB5F5");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO, "TOTTITOLO");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO, BUK_STCOELPRSOAN_SPAN_TOTTITOLO2, MyGlb.VIS_INTSENBORRIG, 5, 113, 0, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_TOTTITOLO2, "DA057E16-E8BB-4BCF-84DE-2A927D11DE46");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_TOTTITOLO2, "TOTTITOLO2");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU1, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU1, "82EC0142-4910-492F-8A31-AFF1D9E4B526");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU1, "VARIAZIOPIU1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIOPIU1, BUK_STCOELPRSOAN_SPAN_VARIAZIONPI3, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI3, "0791C698-45E4-4880-8C14-AE205B2CD28F");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI3, "VARIAZIONPI3");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_TITOGROUFOOT, BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO3, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO3, "6995787F-A896-452C-9D2E-F01F6C0F938B");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO3, "VARIAZIMENO3");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO3, BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN3, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN3, "1D62389A-7160-41EC-AB11-3E2B8E9A8F11");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIOMEN3, "VARIAZIOMEN3");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "RECOENTRSPES");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, "D4B7F84B-88D5-4A47-8BEB-B98DF68C9E76");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, "ENTSPEGROFOO");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO1, 1500, 0, 9700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO1, "FE17B9BC-3F0B-4BF0-B5D9-8D0A1A27643D");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO1, "TOTTITOLO1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_TOTTITOLO1, BUK_STCOELPRSOAN_SPAN_TOTTITOLO, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_TOTTITOLO, "BEB10CD3-E979-4CBB-A278-5BB7863C4CF6");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_TOTTITOLO, "TOTTITOLO");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPIU, 11500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPIU, "DECF36D0-1DD3-4F84-9272-936268307AE2");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPIU, "VARIAZIONPIU");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIONPIU, BUK_STCOELPRSOAN_SPAN_VARIAZIONPI2, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI2, "BA0E9765-8AAE-4E8E-A4DC-DBC09051962A");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIONPI2, "VARIAZIONPI2");
    BUK_STCOELPRSOAN.InitReportBox(BUK_STCOELPRSOAN_SEC_ENTSPEGROFOO, BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO1, 14400, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO1, "099C9C33-52C3-4A24-8D5A-346CD2895955");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO1, "VARIAZIMENO1");
    BUK_STCOELPRSOAN.InitBoxSpan(BUK_STCOELPRSOAN_RPTBOX_VARIAZIMENO1, BUK_STCOELPRSOAN_SPAN_VARIAZIOMENO, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SPAN_VARIAZIOMENO, "B1FBD273-2E99-4AD6-B841-2A64ECF26368");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SPAN_VARIAZIOMENO, "VARIAZIOMENO");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_PAGEFOOTER, BUK_STCOELPRSOAN_RPTBOX_PAGEFOOTER1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_PAGEFOOTER, "43B3A6E5-A062-40B8-A903-FA6E0766BE4E");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_STCOELPRSOAN.InitSection(BUK_STCOELPRSOAN_RPT_REPORT, BUK_STCOELPRSOAN_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STCOELPRSOAN.SetSectionRendersInto(BUK_STCOELPRSOAN_SEC_REPORTFOOTER, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
    BUK_STCOELPRSOAN.SetRTCGuid(BUK_STCOELPRSOAN_SEC_REPORTFOOTER, "A4D6A6E3-0119-4BD6-8E7C-1BC8370493B0");
    BUK_STCOELPRSOAN.SetObjCode(BUK_STCOELPRSOAN_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_ENTSPEGROHEA, "RECOENTRSPES");
    BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TITOGROUHEAD, "TITOLO");
    BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TIPOVAR, "DES_TIPO_VAR");
    BUK_STCOELPRSOAN.AddReportGroup(BUK_STCOELPRSOAN_SEC_TIPOVAR2, "TIPO_VAR");
    BUK_STCOELPRSOAN_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_STCOELPRSOAN_InitLinks()
  {
    BUK_STCOELPRSOAN.SetBoxNextBox(BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1, BUK_STCOELPRSOAN_RPTBOX_PAGEBODY1);
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
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnFormattingSection(SectionID);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnFormattingPage(PageID);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnConnecting(DBConn);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_Activated(ObjID, BoxName);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ELEPROSOSANN) BUK_ELEPROSOSANN_OnPreview();
    if (SrcObj == BKW_STCOELPRSOAN) BUK_STCOELPRSOAN_OnPreview();
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
