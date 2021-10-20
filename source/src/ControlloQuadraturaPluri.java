// **********************************************
// Controllo Quadratura Pluri
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuadraturaPluri extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_CONTQUADBOOK;
  OBook BKW_CONTQUADBOOK;
  //
  // Template Pages constants
  private static int BUK_CONTQUADBOOK_MST_NUOVPAGIMAST = 1;
  private static int BUK_CONTQUADBOOK_RPTBOX_TESTATPAGIN1 = 2;
  private static int BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1 = 3;

  //
  // Reports constants
  private static int BUK_CONTQUADBOOK_RPT_REPORT = 4;
  private static int BUK_CONTQUADBOOK_SEC_INTESTPAGINA = 5;
  private static int BUK_CONTQUADBOOK_RPTBOX_TITOLO2 = 6;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN6 = 7;
  private static int BUK_CONTQUADBOOK_RPTBOX_DELIBERA2 = 8;
  private static int BUK_CONTQUADBOOK_SPAN_IENODPDDNOS1 = 9;
  private static int BUK_CONTQUADBOOK_SEC_VARESEINTGRU = 10;
  private static int BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP = 11;
  private static int BUK_CONTQUADBOOK_RPTBOX_ESERCIZIO2 = 12;
  private static int BUK_CONTQUADBOOK_SPAN_CETSRVECQPC1 = 13;
  private static int BUK_CONTQUADBOOK_RPTBOX_COMPETENZAE2 = 14;
  private static int BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE4 = 15;
  private static int BUK_CONTQUADBOOK_RPTBOX_COMPETENZAS2 = 16;
  private static int BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS4 = 17;
  private static int BUK_CONTQUADBOOK_RPTBOX_SALDOCOMP2 = 18;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN7 = 19;
  private static int BUK_CONTQUADBOOK_RPTBOX_CASSAE4 = 20;
  private static int BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE5 = 21;
  private static int BUK_CONTQUADBOOK_RPTBOX_CASSAS4 = 22;
  private static int BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS5 = 23;
  private static int BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA3 = 24;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN8 = 25;
  private static int BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN3 = 26;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG4 = 27;
  private static int BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN4 = 28;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEVEIGS = 29;
  private static int BUK_CONTQUADBOOK_RPTBOX_SALDOCOMPET1 = 30;
  private static int BUK_CONTQUADBOOK_SPAN_AIENOTQEAVEI = 31;
  private static int BUK_CONTQUADBOOK_RPTBOX_TOTCASSAE2 = 32;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG6 = 33;
  private static int BUK_CONTQUADBOOK_RPTBOX_TOTCASSAS2 = 34;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG7 = 35;
  private static int BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA4 = 36;
  private static int BUK_CONTQUADBOOK_SPAN_AIENOTQEAVE3 = 37;
  private static int BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP = 38;
  private static int BUK_CONTQUADBOOK_RPTBOX_PARTE1 = 39;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN9 = 40;
  private static int BUK_CONTQUADBOOK_RPTBOX_CAPITOLO2 = 41;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN10 = 42;
  private static int BUK_CONTQUADBOOK_RPTBOX_DESCRCAPITO1 = 43;
  private static int BUK_CONTQUADBOOK_SPAN_NUOVASPAN11 = 44;
  private static int BUK_CONTQUADBOOK_SEC_DETTAGLIO = 45;
  private static int BUK_CONTQUADBOOK_RPTBOX_ES2 = 46;
  private static int BUK_CONTQUADBOOK_SPAN_IERVESCQPCQ1 = 47;
  private static int BUK_CONTQUADBOOK_RPTBOX_DESCRIZIONE2 = 48;
  private static int BUK_CONTQUADBOOK_SPAN_REDECOQUPCQB = 49;
  private static int BUK_CONTQUADBOOK_RPTBOX_COMPE2 = 50;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEIERV4 = 51;
  private static int BUK_CONTQUADBOOK_RPTBOX_COMPS2 = 52;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEIERV1 = 53;
  private static int BUK_CONTQUADBOOK_RPTBOX_CASSAE5 = 54;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEIERV6 = 55;
  private static int BUK_CONTQUADBOOK_RPTBOX_CASSAS5 = 56;
  private static int BUK_CONTQUADBOOK_SPAN_IENOTQEIERVE = 57;
  private static int BUK_CONTQUADBOOK_RPTBOX_CAPITOLO3 = 58;
  private static int BUK_CONTQUADBOOK_SPAN_TSRVCCQPCQBT = 59;
  private static int BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP = 60;
  private static int BUK_CONTQUADBOOK_SEC_VARESEPIEGRU = 61;

  private static int PFL_CONQUADEFEXP_ESERCIZIO1 = 0;
  private static int PFL_CONQUADEFEXP_PARTE1 = 1;
  private static int PFL_CONQUADEFEXP_CAPITOLO1 = 2;
  private static int PFL_CONQUADEFEXP_ARTICOLO1 = 3;
  private static int PFL_CONQUADEFEXP_DESCRIZIONE1 = 4;
  private static int PFL_CONQUADEFEXP_COMPETENZAE1 = 5;
  private static int PFL_CONQUADEFEXP_COMPETENZAS1 = 6;
  private static int PFL_CONQUADEFEXP_CASSAE1 = 7;
  private static int PFL_CONQUADEFEXP_CASSAS1 = 8;
  private static int PFL_CONQUADEFEXP_COMPETENZPI1 = 9;
  private static int PFL_CONQUADEFEXP_COMPETENMEN1 = 10;
  private static int PFL_CONQUADEFEXP_CASSAPIU1 = 11;
  private static int PFL_CONQUADEFEXP_CASSAMENO1 = 12;
  private static int PFL_CONQUADEFEXP_SEDEDEL1 = 13;
  private static int PFL_CONQUADEFEXP_NUMERODEL1 = 14;
  private static int PFL_CONQUADEFEXP_ANNODEL1 = 15;
  private static int PFL_CONQUADEFEXP_UNITAPROPON1 = 16;
  private static int PFL_CONQUADEFEXP_NUMEROPROPO1 = 17;
  private static int PFL_CONQUADEFEXP_ANNOPROPOST1 = 18;
  private static int PFL_CONQUADEFEXP_PROGRESSIVO1 = 19;

  private static int PPQRY_VARCOM2 = 0;


  IDPanel PAN_CONQUADEFEXP;
  private static int PFL_CONQUAPROEXP_ESERCIZIO = 0;
  private static int PFL_CONQUAPROEXP_PARTE = 1;
  private static int PFL_CONQUAPROEXP_CAPITOLO = 2;
  private static int PFL_CONQUAPROEXP_ARTICOLO = 3;
  private static int PFL_CONQUAPROEXP_DESCRIZIONE = 4;
  private static int PFL_CONQUAPROEXP_COMPETENZAE = 5;
  private static int PFL_CONQUAPROEXP_COMPETENZAS = 6;
  private static int PFL_CONQUAPROEXP_CASSAE = 7;
  private static int PFL_CONQUAPROEXP_CASSAS = 8;
  private static int PFL_CONQUAPROEXP_COMPETENZPIU = 9;
  private static int PFL_CONQUAPROEXP_COMPETENMENO = 10;
  private static int PFL_CONQUAPROEXP_CASSAPIU = 11;
  private static int PFL_CONQUAPROEXP_CASSAMENO = 12;
  private static int PFL_CONQUAPROEXP_UNITAPROPONE = 13;
  private static int PFL_CONQUAPROEXP_NUMEROPROPOS = 14;
  private static int PFL_CONQUAPROEXP_ANNOPROPOSTA = 15;
  private static int PFL_CONQUAPROEXP_PROGRESSIVO = 16;

  private static int PPQRY_VARCOM = 0;


  IDPanel PAN_CONQUAPROEXP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM179(IMDB);
    //
    //
    Init_PQRY_VARCOM3(IMDB);
    Init_PQRY_VARCOM2(IMDB);
    Init_PQRY_VARCOM(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM179(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM179, 11);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM179, "TBL_PARAM179");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGDEFPRO, "NOMOGGDEFPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGDEFPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGSEDDEL,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGNUMDEL,1,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGSEDPRO, "NOMOGGSEDPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGSEDPRO,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGNUMPRO,1,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, "NOMOGGTIPQUA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA,5,50,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGPROINS, "NOMOGGPROINS");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGPROINS,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGDELINS, "NOMOGGDELINS");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMOGGDELINS,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM179,IMDBDef4.FLD_PARAM179_NOMEOGGETIPO,5,3,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM179, 0);
  }

  private static void Init_PQRY_VARCOM3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM3, 22);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM3, "PQRY_VARCOM3");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECOVARCESER, "RECOVARCESER");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECOVARCESER,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_ES, "ES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_ES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_Capitolo, "Capitolo");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_Capitolo,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_Articolo, "Articolo");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_Articolo,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARSEDDEL, "RECVARSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARSEDDEL,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARNUMDEL, "RECVARNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARANNDEL, "RECVARANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARUNIPRO, "RECVARUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARUNIPRO,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARNUMPRO, "RECVARNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARANNPRO, "RECVARANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECOVARCIMPO, "RECOVARCIMPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECOVARCIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARIMPCAS, "RECVARIMPCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECVARIMPCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPE, "COMPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPS, "COMPS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAE, "CASSAE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAE,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAS, "CASSAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPP, "COMPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPP,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPM, "COMPM");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_COMPM,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAP, "CASSAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAP,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAM, "CASSAM");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_CASSAM,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECORDGRUPPO, "RECORDGRUPPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM3,IMDBDef12.PQSL_VARCOM3_RECORDGRUPPO,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM3, 0);
  }

  private static void Init_PQRY_VARCOM2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM2, 20);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM2, "PQRY_VARCOM2");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_E, "Competenza E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_E,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_S, "Competenza S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_S,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_E, "Cassa E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_E,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_S, "Cassa S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_S,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_Piu, "Competenza Piu");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_Piu,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_Meno, "Competenza Meno");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Competenza_Meno,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_Piu, "Cassa Piu");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_Piu,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_Meno, "Cassa Meno");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_Cassa_Meno,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM2,IMDBDef12.PQSL_VARCOM2_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM2, 0);
  }

  private static void Init_PQRY_VARCOM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM, "PQRY_VARCOM");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_E, "Competenza E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_E,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_S, "Competenza S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_S,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_E, "Cassa E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_E,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_S, "Cassa S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_S,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_Piu, "Competenza Piu");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_Piu,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_Meno, "Competenza Meno");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Competenza_Meno,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_Piu, "Cassa Piu");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_Piu,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_Meno, "Cassa Meno");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_Cassa_Meno,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM,IMDBDef12.PQSL_VARCOM_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuadraturaPluri(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuadraturaPluri()
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
    FormIdx = MyGlb.FRM_CONTQUADPLUR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2A8BFC05-D439-4BB2-A9B3-10C7510FD73E";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 562;
    set_Caption(new IDVariant("Controllo Quadratura "));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 536;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.619403;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 332;
    Frames[2].Caption = "Controllo Quadratura Book";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 332;
    BKW_CONTQUADBOOK = new OBook(this);
    BUK_CONTQUADBOOK = new CIDREObj(BKW_CONTQUADBOOK);
    Frames[2].Content = BKW_CONTQUADBOOK;
    BKW_CONTQUADBOOK.Height = 302;
    BKW_CONTQUADBOOK.Width = 876;
    BKW_CONTQUADBOOK.iGuid = "6FFE9D55-891A-45B8-BC8E-9CC2F51B83CC";
    BKW_CONTQUADBOOK.Code = "BUK_CONTQUADBOOK";
    BKW_CONTQUADBOOK.BookObj = BUK_CONTQUADBOOK;
    BKW_CONTQUADBOOK.InitDefMasks();
    BUK_CONTQUADBOOK.set_FrIndex(2);
    BUK_CONTQUADBOOK.InitBook(1, 3342337, "Controllo Quadratura Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTQUADBOOK.InitHTML();
    BUK_CONTQUADBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTQUADBOOK.SetSize(876, 302);
    BUK_CONTQUADBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTQUADBOOK.SetRTCGuid(0, "6FFE9D55-891A-45B8-BC8E-9CC2F51B83CC");
    BUK_CONTQUADBOOK.SetObjCode(0, "CONTQUADBOOK");
    BUK_CONTQUADBOOK_MST_NUOVPAGIMAST_Init();
    BUK_CONTQUADBOOK_RPT_REPORT_Init();
    BUK_CONTQUADBOOK_InitLinks();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 204;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.54902;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 876;
    Frames[4].Height = 112;
    Frames[4].Caption = "Controllo Quadratura Def export";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 112;
    PAN_CONQUADEFEXP = new IDPanel(w, this, 4, "PAN_CONQUADEFEXP");
    Frames[4].Content = PAN_CONQUADEFEXP;
    PAN_CONQUADEFEXP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONQUADEFEXP.VS = MainFrm.VisualStyleList;
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CC9381D0-EAE0-4970-B9B8-23F04A90A942");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3028, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONQUADEFEXP.InitStatus = 2;
    PAN_CONQUADEFEXP_Init();
    PAN_CONQUADEFEXP_InitFields();
    PAN_CONQUADEFEXP_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 876;
    Frames[5].Height = 92;
    Frames[5].Caption = "Controllo Quadratura Prov export";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 92;
    PAN_CONQUAPROEXP = new IDPanel(w, this, 5, "PAN_CONQUAPROEXP");
    Frames[5].Content = PAN_CONQUAPROEXP;
    PAN_CONQUAPROEXP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONQUAPROEXP.VS = MainFrm.VisualStyleList;
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D61BFC07-733F-4545-9910-EF5C7C7FF149");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2456, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONQUAPROEXP.InitStatus = 2;
    PAN_CONQUAPROEXP_Init();
    PAN_CONQUAPROEXP_InitFields();
    PAN_CONQUAPROEXP_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_EXPORTCSV8+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG174+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONI8+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG174+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUTT4+BaseCmdLinIdx)
      {
        Espanditutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUTT4+BaseCmdLinIdx)
      {
        ComprimiTutto();
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
      PAN_CONQUADEFEXP.UpdatePanel(MainFrm);
      PAN_CONQUAPROEXP.UpdatePanel(MainFrm);
      BUK_CONTQUADBOOK.UpdateBook();
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
    if (Code.equals("BUK_CONTQUADBOOK")) return BUK_CONTQUADBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloQuadraturaPluri);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuadraturaPluri.class.getName() : (Glb.ClassWithPackage(ControlloQuadraturaPluri.class) ? ControlloQuadraturaPluri.class.getName().substring(ControlloQuadraturaPluri.class.getPackage().getName().length() + 1) : ControlloQuadraturaPluri.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // VARCOM ESERCIZIO Intestazione Gruppo Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTQUADBOOK_SEC_VARESEINTGRU_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VARCOM ESERCIZIO Intestazione Gruppo Before Formatting Body
      // Corpo Procedura
      // 
      if ((new IDVariant(BUK_CONTQUADBOOK.SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU))).equals((new IDVariant(0)), true))
      {
        BUK_CONTQUADBOOK.SetBoxImage(BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_CONTQUADBOOK.SetBoxImage(BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadraturaPluri", "VARCOMESERCIZIOIntestazioneGruppoBeforeFormatting", _e);
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
      BUK_CONTQUADBOOK.set_SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, (new IDVariant(0)).booleanValue());
      if (IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES")), true))
      {
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONQUADEFEXP.SetFlags (Glb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_CONQUADEFEXP.set_Visible((new IDVariant(0)).booleanValue());
      PAN_CONQUAPROEXP.set_Visible((new IDVariant(0)).booleanValue());
      set_Caption((new IDVariant("Controllo Quadratura")));
      Frames[BUK_CONTQUADBOOK.Book.FrIndex].set_Caption((new IDVariant("Controllo Quadratura")).stringValue());
      Frames[PAN_CONQUADEFEXP.FrIndex].set_Caption((new IDVariant("Controllo Quadratura")).stringValue());
      Frames[PAN_CONQUAPROEXP.FrIndex].set_Caption((new IDVariant("Controllo Quadratura")).stringValue());
      set_Caption((new IDVariant("Controllo Quadratura")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadraturaPluri", "Load", _e);
    }
  }

  // **********************************************************************
  // Export CSV
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ExportCSV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export CSV Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGDEFPRO, 0).equals((new IDVariant("D")), true))
      {
        PAN_CONQUADEFEXP.PanelCommand(Glb.PCM_FIND);
        new IDVariant(PAN_CONQUADEFEXP.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      }
      else
      {
        PAN_CONQUAPROEXP.PanelCommand(Glb.PCM_FIND);
        new IDVariant(PAN_CONQUAPROEXP.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadraturaPluri", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi tutto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Espanditutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi tutto Body
      // Corpo Procedura
      // 
      BUK_CONTQUADBOOK.set_SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, (new IDVariant(-1)).booleanValue());
      BUK_CONTQUADBOOK.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadraturaPluri", "Espanditutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi Tutto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      BUK_CONTQUADBOOK.set_SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, (new IDVariant(-1)).booleanValue());
      BUK_CONTQUADBOOK.set_SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, (new IDVariant(0)).booleanValue());
      BUK_CONTQUADBOOK.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadraturaPluri", "ComprimiTutto", _e);
      return -1;
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
  private void BUK_CONTQUADBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTQUADBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTQUADBOOK_SEC_INTESTPAGINA)
    {
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENODPDDNOS1, new IDVariant(IDL.Add(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGDEFPRO, 0).equals((new IDVariant("D"))))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Delibera ")), IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGSEDDEL, 0)), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGNUMDEL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGANNDEL, 0))):(new IDVariant())), ((!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGSEDPRO, 0))))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(" Proposta ")), IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGSEDPRO, 0)), (new IDVariant(" - "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGNUMPRO, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGANNPRO, 0))):(new IDVariant(""))))));
    }
    if (SectionID==BUK_CONTQUADBOOK_SEC_VARESEINTGRU)
    {
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_CETSRVECQPC1, new IDVariant(IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCESER")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE4, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?(new IDVariant("Competenza E")):(new IDVariant("Competenza +")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS4, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?(new IDVariant("Competenza S")):(new IDVariant("Competenza -")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE5, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?(new IDVariant("Cassa E")):(new IDVariant("Cassa +")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS5, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?(new IDVariant("Cassa S")):(new IDVariant("Cassa -")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG4, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPE"):BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPP"))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIGS, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPS"):BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPM"))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVEI, new IDVariant(IDL.Abs(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?IDL.Sub(IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPE")), IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPS"))):IDL.Sub(IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPP")), IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"COMPM")))))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG6, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAE"):BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAP"))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG7, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAS"):BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAM"))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVE3, new IDVariant(IDL.Abs(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?IDL.Sub(IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAE")), IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAS"))):IDL.Sub(IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAP")), IDL.Abs(BUK_CONTQUADBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CONTQUADBOOK_SEC_VARESEINTGRU,"CASSAM")))))));
      BUK_CONTQUADBOOK_SEC_VARESEINTGRU_OnFormattingSection();
    }
    if (SectionID==BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP)
    {
    }
    if (SectionID==BUK_CONTQUADBOOK_SEC_DETTAGLIO)
    {
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IERVESCQPCQ1, new IDVariant(((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "ES").equals((new IDVariant("E"))))?(new IDVariant("E")):(new IDVariant("S")))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV4, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "ES").equals((new IDVariant("E"))))?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO"):(new IDVariant())):((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO").compareTo((new IDVariant(0)), true)>=0)?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO"):(new IDVariant())))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV1, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "ES").equals((new IDVariant("S"))))?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO"):(new IDVariant())):((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO").compareTo((new IDVariant(0)), true)<0)?IDL.Abs(BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECOVARCIMPO")):(new IDVariant())))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV6, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "ES").equals((new IDVariant("E"))))?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS"):(new IDVariant())):((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS").compareTo((new IDVariant(0)), true)>=0)?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS"):(new IDVariant())))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_IENOTQEIERVE, new IDVariant(((IMDB.Value(IMDBDef4.TBL_PARAM179, IMDBDef4.FLD_PARAM179_NOMOGGTIPQUA, 0).equals((new IDVariant("ES"))))?((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "ES").equals((new IDVariant("S"))))?BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS"):(new IDVariant())):((BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS").compareTo((new IDVariant(0)), true)<0)?IDL.Abs(BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "RECVARIMPCAS")):(new IDVariant())))));
      BUK_CONTQUADBOOK.set_SpanValue(BUK_CONTQUADBOOK_SPAN_TSRVCCQPCQBT, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "Capitolo")), (new IDVariant(" / "))), IDL.ToString(BUK_CONTQUADBOOK.GetReportColumn(BUK_CONTQUADBOOK_RPT_REPORT, "Articolo")))));
    }
    if (SectionID==BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP)
    {
    }
    if (SectionID==BUK_CONTQUADBOOK_SEC_VARESEPIEGRU)
    {
    }
  }

  private void BUK_CONTQUADBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTQUADBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTQUADBOOK_MST_NUOVPAGIMAST)
    {
    }
  }

  private void BUK_CONTQUADBOOK_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP)
    {
      BUK_CONTQUADBOOK.set_SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, !BUK_CONTQUADBOOK.SectionShowChildren(BUK_CONTQUADBOOK_SEC_VARESEINTGRU));
    }
  }

  private void BUK_CONTQUADBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTQUADBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTQUADBOOK_OnPreview()
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONQUADEFEXP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONQUADEFEXP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONQUADEFEXP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONQUADEFEXP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONQUADEFEXP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONQUADEFEXP);
    // Stub
  }

  private void PAN_CONQUADEFEXP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONQUADEFEXP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONQUADEFEXP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONQUADEFEXP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONQUAPROEXP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONQUAPROEXP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONQUAPROEXP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONQUAPROEXP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONQUAPROEXP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONQUAPROEXP);
    // Stub
  }

  private void PAN_CONQUAPROEXP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONQUAPROEXP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONQUAPROEXP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONQUAPROEXP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONQUADEFEXP_Init()
  {

    PAN_CONQUADEFEXP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONQUADEFEXP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONQUADEFEXP.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, "108F7124-CB3F-4773-8D07-77BF3057003F");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, "Esercizio");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, "1A5CDE4F-1B90-436C-A5C2-CEBC59DF1660");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, "Parte");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, "Brief description of field content.");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, "BCDF3E6C-9B25-4FF7-91EB-8FA2E0A5C368");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, "Capitolo");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, "7641E85C-8C4A-45C7-AD06-8F7004184AEC");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, "Articolo");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, "F2E95C02-7738-4EC8-9A69-D67DAA0D602D");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, "Descrizione");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, "6DC2FC92-0F61-46F1-B265-B9AB3E65762D");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, "Competenza E");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, "D1F90DC2-03BB-4B59-A258-8776EFE509C5");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, "Competenza S");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, "0AD2943A-F404-4AD3-B99C-D1B96598736C");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, "Cassa E");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, "4DF2B784-19BF-49B1-8550-8693C51D1FF7");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, "Cassa S");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, "6C12DDE0-68BB-4F85-857C-61576F401121");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, "Competenza Piu");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, "A4A7180A-5F59-4184-9A19-24C21BC85B99");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, "Competenza Meno");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, "A4F614F6-00FC-482B-B71D-1E5C824EE018");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, "Cassa Piu");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, "C29569D2-989F-4B93-B5DD-FAD8A559BAF7");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, "Cassa Meno");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, "75F9050D-1972-432D-941E-69BCA79A8CA3");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, "Sede del");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, "438AC498-DF79-47E4-93A3-E12ADB54AAC2");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, "Numero del");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, "176493C2-4D0F-4A85-9C3C-EEA3AED39CE3");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, "Anno del");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, "34C79FE8-5BF1-4ACB-9FA7-99357E3CC77B");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, "Unita proponente");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, "7AAC7213-C629-4EDA-85D3-76F5327BEDDA");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, "Numero proposta");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, "8AB4105A-532A-4973-AFC0-56AE030E90AC");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, "Anno proposta");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUADEFEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, "F6DF7DFB-9EBC-4337-A061-716A6BD72BA8");
    PAN_CONQUADEFEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, "PROGRESSIVO");
    PAN_CONQUADEFEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, "");
    PAN_CONQUADEFEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CONQUADEFEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_CONQUADEFEXP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_LIST, "Esercizio");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_FORM, 68);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ESERCIZIO1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_ESERCIZIO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_ESERCIZIO1, PPQRY_VARCOM2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_LIST, 68, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_LIST, 24);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_LIST, "Parte");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_FORM, 4, 28, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_FORM, 24);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PARTE1, MyGlb.PANEL_FORM, "Pr.");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_PARTE1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_PARTE1, PPQRY_VARCOM2, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CONQUADEFEXP.SetValueListItem(PFL_CONQUADEFEXP_PARTE1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CONQUADEFEXP.SetValueListItem(PFL_CONQUADEFEXP_PARTE1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_LIST, 108, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_CAPITOLO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_CAPITOLO1, PPQRY_VARCOM2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_LIST, 196, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_ARTICOLO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_ARTICOLO1, PPQRY_VARCOM2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_LIST, 264, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 100, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_DESCRIZIONE1, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  B.DESCRIZIONE ");
  SQL.append("from ");
  SQL.append("  CAP B ");
  SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (B.E_S = A.E_S) ");
  SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
  SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
  SQL.append(")");
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_DESCRIZIONE1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_DESCRIZIONE1, PPQRY_VARCOM2, SQL.toString(), "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_LIST, 620, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_LIST, 88);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_LIST, "Competenza E");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_FORM, 4, 136, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_FORM, 88);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAE1, MyGlb.PANEL_FORM, "Competenza E");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_COMPETENZAE1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_COMPETENZAE1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_COMPETENZAE1, PPQRY_VARCOM2, "DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0)", "Competenza E", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_LIST, 768, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_LIST, 92);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_LIST, "Competenza S");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_FORM, 4, 160, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_FORM, 92);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZAS1, MyGlb.PANEL_FORM, "Competenza S");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_COMPETENZAS1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_COMPETENZAS1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_COMPETENZAS1, PPQRY_VARCOM2, "DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0)", "Competenza S", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_LIST, 916, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_LIST, 52);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_LIST, "Cassa E");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_FORM, 4, 184, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_FORM, 52);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAE1, MyGlb.PANEL_FORM, "Cassa E");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_CASSAE1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_CASSAE1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_CASSAE1, PPQRY_VARCOM2, "DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0)", "Cassa E", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_LIST, 1064, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_LIST, 52);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_LIST, "Cassa S");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_FORM, 4, 208, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_FORM, 52);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAS1, MyGlb.PANEL_FORM, "Cassa S");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_CASSAS1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_CASSAS1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_CASSAS1, PPQRY_VARCOM2, "DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0)", "Cassa S", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_LIST, 1212, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_LIST, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_LIST, "Competenza Piu");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_FORM, 4, 232, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_FORM, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENZPI1, MyGlb.PANEL_FORM, "Comp. Piu");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_COMPETENZPI1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_COMPETENZPI1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_COMPETENZPI1, PPQRY_VARCOM2, "CASE WHEN A.IMPORTO >= 0 THEN A.IMPORTO ELSE 0 END", "Competenza Piu", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_LIST, 1360, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_LIST, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_LIST, "Competenza Meno");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_FORM, 4, 256, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_FORM, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_COMPETENMEN1, MyGlb.PANEL_FORM, "Compet. Mn.");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_COMPETENMEN1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_COMPETENMEN1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_COMPETENMEN1, PPQRY_VARCOM2, "CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END", "Competenza Meno", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_LIST, 1508, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_LIST, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_LIST, "Cassa Piu");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_FORM, 4, 280, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_FORM, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAPIU1, MyGlb.PANEL_FORM, "Cassa Piu");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_CASSAPIU1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_CASSAPIU1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_CASSAPIU1, PPQRY_VARCOM2, "CASE WHEN A.IMPORTO_CASSA >= 0 THEN A.IMPORTO_CASSA ELSE 0 END", "Cassa Piu", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_LIST, 1656, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_LIST, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_LIST, "Cassa Meno");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_FORM, 4, 304, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_FORM, 76);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_CASSAMENO1, MyGlb.PANEL_FORM, "Cassa Meno");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_CASSAMENO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldUnbound(PFL_CONQUADEFEXP_CASSAMENO1, true);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_CASSAMENO1, PPQRY_VARCOM2, "CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END", "Cassa Meno", 3, 28, 6, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_LIST, 1804, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_LIST, 60);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_LIST, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_LIST, "Sede del");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_FORM, 4, 328, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_FORM, 60);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_FORM, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_SEDEDEL1, MyGlb.PANEL_FORM, "Sede del");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_SEDEDEL1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_SEDEDEL1, PPQRY_VARCOM2, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_LIST, 2232, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_LIST, 80);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_LIST, "Numero del");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_FORM, 4, 376, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_FORM, 80);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMERODEL1, MyGlb.PANEL_FORM, "Numero del");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_NUMERODEL1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_NUMERODEL1, PPQRY_VARCOM2, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_LIST, 2312, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_LIST, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_LIST, "Anno del");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_FORM, 4, 400, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_FORM, 64);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNODEL1, MyGlb.PANEL_FORM, "Anno del");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_ANNODEL1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_ANNODEL1, PPQRY_VARCOM2, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_LIST, 2376, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_LIST, 120);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_LIST, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_LIST, "Unita proponente");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_FORM, 4, 424, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_FORM, 120);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_FORM, 2);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_UNITAPROPON1, MyGlb.PANEL_FORM, "Unita proponente");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_UNITAPROPON1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_UNITAPROPON1, PPQRY_VARCOM2, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_LIST, 2804, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_LIST, 120);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_LIST, "Numero proposta");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_FORM, 4, 472, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_FORM, 120);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_NUMEROPROPO1, MyGlb.PANEL_FORM, "Numero proposta");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_NUMEROPROPO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_NUMEROPROPO1, PPQRY_VARCOM2, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_LIST, 2924, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_LIST, 104);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_LIST, "Anno proposta");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_FORM, 4, 496, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_FORM, 104);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_ANNOPROPOST1, MyGlb.PANEL_FORM, "Anno proposta");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_ANNOPROPOST1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_ANNOPROPOST1, PPQRY_VARCOM2, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_CONQUADEFEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 520, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUADEFEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_CONQUADEFEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_CONQUADEFEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUADEFEXP_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_CONQUADEFEXP.SetFieldPage(PFL_CONQUADEFEXP_PROGRESSIVO1, -1, -1);
    PAN_CONQUADEFEXP.SetFieldPanel(PFL_CONQUADEFEXP_PROGRESSIVO1, PPQRY_VARCOM2, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_CONQUADEFEXP_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONQUADEFEXP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONQUADEFEXP.SetIMDB(IMDB, "PQRY_VARCOM2", true);
    PAN_CONQUADEFEXP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP B ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(") as DESCRIZIONE, ");
    SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0) as \"Competenza E\", ");
    SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0) as \"Competenza S\", ");
    SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0) as \"Cassa E\", ");
    SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0) as \"Cassa S\", ");
    SQL.append("  CASE WHEN A.IMPORTO >= 0 THEN A.IMPORTO ELSE 0 END as \"Competenza Piu\", ");
    SQL.append("  CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END as \"Competenza Meno\", ");
    SQL.append("  CASE WHEN A.IMPORTO_CASSA >= 0 THEN A.IMPORTO_CASSA ELSE 0 END as \"Cassa Piu\", ");
    SQL.append("  CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END as \"Cassa Meno\", ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NOT ((A.PROGRESSIVO_PRIMA_VAR IS NULL))) ");
    SQL.append("and   ((~~TBL_PARAM179.NOMOGGPROINS~~ = 'SI' AND ((A.ANNO_PROPOSTA = ~~TBL_PARAM179.NOMOGGANNPRO~~) AND (A.NUMERO_PROPOSTA = ~~TBL_PARAM179.NOMOGGNUMPRO~~) AND (A.UNITA_PROPONENTE = ~~TBL_PARAM179.NOMOGGSEDPRO~~))) OR (~~TBL_PARAM179.NOMOGGPROINS~~ IS NULL)) ");
    SQL.append("and   (A.TIPO_VAR IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.CODICE ");
    SQL.append("from ");
    SQL.append("  T54 C, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL D ");
    SQL.append("where (C.TIPOLOGIA = D.CODICE) ");
    SQL.append("and   (D.TIPO_QUADRATURA = ~~TBL_PARAM179.NOMOGGTIPQUA~~) ");
    SQL.append("and   (C.TIPOLOGIA = ~~TBL_PARAM7.ROWNAMETIPOL~~) ");
    SQL.append(")) ");
    SQL.append("and   ((~~TBL_PARAM179.NOMOGGDELINS~~ = 'SI' AND ((A.ANNO_DEL = ~~TBL_PARAM179.NOMOGGANNDEL~~) AND (A.NUMERO_DEL = ~~TBL_PARAM179.NOMOGGNUMDEL~~) AND (A.SEDE_DEL = ~~TBL_PARAM179.NOMOGGSEDDEL~~))) OR (~~TBL_PARAM179.NOMOGGDELINS~~ IS NULL)) ");
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_CONQUADEFEXP.SetQuery(PPQRY_VARCOM2, 5, SQL, -1, "");
    PAN_CONQUADEFEXP.SetQueryDB(PPQRY_VARCOM2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONQUADEFEXP.SetMasterTable(0, "VARCOM");
    PAN_CONQUADEFEXP.AddToSortList(PFL_CONQUADEFEXP_ESERCIZIO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONQUADEFEXP.Status() == 2)
    {
      int oldListQBE = PAN_CONQUADEFEXP.iUseListQBE;
      PAN_CONQUADEFEXP.iUseListQBE = 0;
      PAN_CONQUADEFEXP.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONQUADEFEXP.PanelCommand(Glb.PCM_FIND);
      PAN_CONQUADEFEXP.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONQUAPROEXP_Init()
  {

    PAN_CONQUAPROEXP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONQUAPROEXP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONQUAPROEXP.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, "62A67946-9293-4189-AC89-7C4B7E8E8056");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, "Esercizio");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, "E8B9B763-D295-46FB-8EC4-E0E48DC71315");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, "Parte");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, "Brief description of field content.");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, "72785514-D513-4A43-ACE1-DA8FCBE96997");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, "Capitolo");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, "6BFD8131-A84A-4A3F-8C73-E39F6C824829");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, "Articolo");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, "ABFE9352-44D1-48F4-93BF-413521961E19");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, "Descrizione");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, "E5B08D0C-1C6D-4F59-A67D-9DFC076AFED2");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, "Competenza E");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, "4DAE6D90-4F8F-4378-BA74-5E538E77A3FA");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, "Competenza S");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, "CFA609CA-D97A-4F03-8322-0F8D9197FD35");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, "Cassa E");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, "CEC159A9-B414-4DAE-9B47-41893E35353E");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, "Cassa S");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, "3B5A9CDB-5C41-4303-8CCB-0A69FE7A100D");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, "Competenza Piu");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, "C2601359-E0C4-47CD-964A-40BB19F0572F");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, "Competenza Meno");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, "D9740D0D-B3BC-4205-83CE-AEB33F2A4162");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, "Cassa Piu");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, "6C3E1CD1-AB95-4266-9925-296E15D6A8DA");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, "Cassa Meno");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, "D9E29211-0E4D-4432-8D1B-5B42ACC47427");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, "Unita proponente");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, "CF0BE321-3163-4F0A-86D8-9FCBB60C6EFE");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, "Numero proposta");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, "01B73226-171F-4034-8F7E-D4DB963A6013");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, "Anno proposta");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONQUAPROEXP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, "49BFD8C4-6BD7-4088-8514-8114162FDE2B");
    PAN_CONQUAPROEXP.set_Header(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, "PROGRESSIVO");
    PAN_CONQUAPROEXP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, "");
    PAN_CONQUAPROEXP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CONQUAPROEXP.SetFlags(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_CONQUAPROEXP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_ESERCIZIO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_ESERCIZIO, PPQRY_VARCOM, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_LIST, 68, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_FORM, 4, 28, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_FORM, 24);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PARTE, MyGlb.PANEL_FORM, "Pr.");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_PARTE, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_PARTE, PPQRY_VARCOM, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CONQUAPROEXP.SetValueListItem(PFL_CONQUAPROEXP_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CONQUAPROEXP.SetValueListItem(PFL_CONQUAPROEXP_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_LIST, 108, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_CAPITOLO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_CAPITOLO, PPQRY_VARCOM, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_LIST, 196, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_ARTICOLO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_ARTICOLO, PPQRY_VARCOM, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_LIST, 264, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_DESCRIZIONE, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  B.DESCRIZIONE ");
  SQL.append("from ");
  SQL.append("  CAP B ");
  SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (B.E_S = A.E_S) ");
  SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
  SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
  SQL.append(")");
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_DESCRIZIONE, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_DESCRIZIONE, PPQRY_VARCOM, SQL.toString(), "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_LIST, 620, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_LIST, 88);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_LIST, "Competenza E");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_FORM, 4, 136, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_FORM, 88);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAE, MyGlb.PANEL_FORM, "Competenza E");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_COMPETENZAE, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_COMPETENZAE, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_COMPETENZAE, PPQRY_VARCOM, "DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0)", "Competenza E", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_LIST, 768, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_LIST, 92);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_LIST, "Competenza S");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_FORM, 4, 160, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_FORM, 92);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZAS, MyGlb.PANEL_FORM, "Competenza S");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_COMPETENZAS, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_COMPETENZAS, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_COMPETENZAS, PPQRY_VARCOM, "DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0)", "Competenza S", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_LIST, 916, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_LIST, 52);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_LIST, "Cassa E");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_FORM, 4, 184, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_FORM, 52);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAE, MyGlb.PANEL_FORM, "Cassa E");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_CASSAE, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_CASSAE, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_CASSAE, PPQRY_VARCOM, "DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0)", "Cassa E", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_LIST, 1064, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_LIST, 52);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_LIST, "Cassa S");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_FORM, 4, 208, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_FORM, 52);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAS, MyGlb.PANEL_FORM, "Cassa S");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_CASSAS, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_CASSAS, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_CASSAS, PPQRY_VARCOM, "DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0)", "Cassa S", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_LIST, 1212, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_LIST, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_LIST, "Competenza Piu");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_FORM, 4, 232, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_FORM, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENZPIU, MyGlb.PANEL_FORM, "Comp. Piu");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_COMPETENZPIU, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_COMPETENZPIU, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_COMPETENZPIU, PPQRY_VARCOM, "CASE WHEN A.IMPORTO >= 0 THEN A.IMPORTO ELSE 0 END", "Competenza Piu", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_LIST, 1360, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_LIST, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_LIST, "Competenza Meno");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_FORM, 4, 256, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_FORM, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_COMPETENMENO, MyGlb.PANEL_FORM, "Compet. Mn.");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_COMPETENMENO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_COMPETENMENO, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_COMPETENMENO, PPQRY_VARCOM, "CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END", "Competenza Meno", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_LIST, 1508, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_LIST, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_LIST, "Cassa Piu");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_FORM, 4, 280, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_FORM, 64);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAPIU, MyGlb.PANEL_FORM, "Cassa Piu");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_CASSAPIU, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_CASSAPIU, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_CASSAPIU, PPQRY_VARCOM, "CASE WHEN A.IMPORTO_CASSA >= 0 THEN A.IMPORTO_CASSA ELSE 0 END", "Cassa Piu", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_LIST, 1656, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_LIST, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_LIST, "Cassa Meno");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_FORM, 4, 304, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_FORM, 76);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_CASSAMENO, MyGlb.PANEL_FORM, "Cassa Meno");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_CASSAMENO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldUnbound(PFL_CONQUAPROEXP_CASSAMENO, true);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_CASSAMENO, PPQRY_VARCOM, "CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END", "Cassa Meno", 3, 28, 6, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_LIST, 1804, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_LIST, 2);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita proponente");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 424, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_FORM, 2);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_UNITAPROPONE, MyGlb.PANEL_FORM, "Unita proponente");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_UNITAPROPONE, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_UNITAPROPONE, PPQRY_VARCOM, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_LIST, 2232, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero proposta");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 472, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero proposta");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_NUMEROPROPOS, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_NUMEROPROPOS, PPQRY_VARCOM, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 2352, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno proposta");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 496, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno proposta");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_ANNOPROPOSTA, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_ANNOPROPOSTA, PPQRY_VARCOM, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_CONQUAPROEXP.SetRect(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 520, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONQUAPROEXP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_CONQUAPROEXP.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_CONQUAPROEXP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONQUAPROEXP_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_CONQUAPROEXP.SetFieldPage(PFL_CONQUAPROEXP_PROGRESSIVO, -1, -1);
    PAN_CONQUAPROEXP.SetFieldPanel(PFL_CONQUAPROEXP_PROGRESSIVO, PPQRY_VARCOM, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_CONQUAPROEXP_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONQUAPROEXP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONQUAPROEXP.SetIMDB(IMDB, "PQRY_VARCOM", true);
    PAN_CONQUAPROEXP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP B ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(") as DESCRIZIONE, ");
    SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0) as \"Competenza E\", ");
    SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0) as \"Competenza S\", ");
    SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0) as \"Cassa E\", ");
    SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0) as \"Cassa S\", ");
    SQL.append("  CASE WHEN A.IMPORTO >= 0 THEN A.IMPORTO ELSE 0 END as \"Competenza Piu\", ");
    SQL.append("  CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END as \"Competenza Meno\", ");
    SQL.append("  CASE WHEN A.IMPORTO_CASSA >= 0 THEN A.IMPORTO_CASSA ELSE 0 END as \"Cassa Piu\", ");
    SQL.append("  CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END as \"Cassa Meno\", ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOMPRO A ");
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NOT ((A.PROGRESSIVO_PRIMA_VAR IS NULL))) ");
    SQL.append("and   ((A.ANNO_PROPOSTA = ~~TBL_PARAM179.NOMOGGANNPRO~~) AND (A.NUMERO_PROPOSTA = ~~TBL_PARAM179.NOMOGGNUMPRO~~) AND (A.UNITA_PROPONENTE = ~~TBL_PARAM179.NOMOGGSEDPRO~~)) ");
    SQL.append("and   (A.TIPO_VAR IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.CODICE ");
    SQL.append("from ");
    SQL.append("  T54 C, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL D ");
    SQL.append("where (C.TIPOLOGIA = D.CODICE) ");
    SQL.append("and   (D.TIPO_QUADRATURA = ~~TBL_PARAM179.NOMOGGTIPQUA~~) ");
    SQL.append("and   (C.TIPOLOGIA = ~~TBL_PARAM179.NOMEOGGETIPO~~) ");
    SQL.append(")) ");
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_CONQUAPROEXP.SetQuery(PPQRY_VARCOM, 5, SQL, -1, "");
    PAN_CONQUAPROEXP.SetQueryDB(PPQRY_VARCOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONQUAPROEXP.SetMasterTable(0, "VARCOMPRO");
    PAN_CONQUAPROEXP.AddToSortList(PFL_CONQUAPROEXP_ESERCIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONQUAPROEXP.Status() == 2)
    {
      int oldListQBE = PAN_CONQUAPROEXP.iUseListQBE;
      PAN_CONQUAPROEXP.iUseListQBE = 0;
      PAN_CONQUAPROEXP.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONQUAPROEXP.PanelCommand(Glb.PCM_FIND);
      PAN_CONQUAPROEXP.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTQUADBOOK_MST_NUOVPAGIMAST_Init()
  {
    BUK_CONTQUADBOOK.InitMastro(BUK_CONTQUADBOOK_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_MST_NUOVPAGIMAST, "B700613A-7F1A-4975-97E3-F7142EA1AE8E");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_CONTQUADBOOK.InitMastroBox(BUK_CONTQUADBOOK_MST_NUOVPAGIMAST, BUK_CONTQUADBOOK_RPTBOX_TESTATPAGIN1, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TESTATPAGIN1, "3FF198EB-5D5B-4C7A-9BB5-88F9AF25A589");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TESTATPAGIN1, "TESTATPAGIN1");
    BUK_CONTQUADBOOK.InitMastroBox(BUK_CONTQUADBOOK_MST_NUOVPAGIMAST, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1, 1000, 3000, 27700, 16600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1, "10C3352F-BF9A-4CF9-AFAA-3124D835E9A3");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1, "CORPOPAGINA1");
  }

  private void BUK_CONTQUADBOOK_RPT_REPORT_InitQuery() { BUK_CONTQUADBOOK_RPT_REPORT_InitQuery(true, true); }
  private void BUK_CONTQUADBOOK_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as RECOVARCESER, ");
      SQL.append("  A.E_S as ES, ");
      SQL.append("  A.CAPITOLO as Capitolo, ");
      SQL.append("  A.ARTICOLO as Articolo, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  B.DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAP B ");
      SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append(") as DESCRIZIONE, ");
      SQL.append("  A.SEDE_DEL as RECVARSEDDEL, ");
      SQL.append("  A.NUMERO_DEL as RECVARNUMDEL, ");
      SQL.append("  A.ANNO_DEL as RECVARANNDEL, ");
      SQL.append("  A.UNITA_PROPONENTE as RECVARUNIPRO, ");
      SQL.append("  A.NUMERO_PROPOSTA as RECVARNUMPRO, ");
      SQL.append("  A.ANNO_PROPOSTA as RECVARANNPRO, ");
      SQL.append("  A.IMPORTO as RECOVARCIMPO, ");
      SQL.append("  A.IMPORTO_CASSA as RECVARIMPCAS, ");
      SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO, 0), 0) as COMPE, ");
      SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO, 0), 0) as COMPS, ");
      SQL.append("  DECODE(A.E_S, 'E', NVL(A.IMPORTO_CASSA, 0), 0) as CASSAE, ");
      SQL.append("  DECODE(A.E_S, 'S', NVL(A.IMPORTO_CASSA, 0), 0) as CASSAS, ");
      SQL.append("  CASE WHEN A.IMPORTO >= 0 THEN NVL(A.IMPORTO, 0) ELSE 0 END as COMPP, ");
      SQL.append("  CASE WHEN A.IMPORTO < 0 THEN NVL(ABS(A.IMPORTO), 0) ELSE 0 END as COMPM, ");
      SQL.append("  CASE WHEN A.IMPORTO_CASSA >= 0 THEN NVL(A.IMPORTO_CASSA, 0) ELSE 0 END as CASSAP, ");
      SQL.append("  CASE WHEN A.IMPORTO_CASSA < 0 THEN NVL(ABS(A.IMPORTO_CASSA), 0) ELSE 0 END as CASSAM, ");
      SQL.append("  1 as RECORDGRUPPO ");
      SQL.append("from ");
      SQL.append("  VARCOM A ");
      SQL.append("where (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.PROGRESSIVO_PRIMA_VAR IS NULL))) ");
      SQL.append("and   ((~~TBL_PARAM179.NOMOGGPROINS~~ = 'SI' AND ((A.ANNO_PROPOSTA = ~~TBL_PARAM179.NOMOGGANNPRO~~) AND (A.NUMERO_PROPOSTA = ~~TBL_PARAM179.NOMOGGNUMPRO~~) AND (A.UNITA_PROPONENTE = ~~TBL_PARAM179.NOMOGGSEDPRO~~))) OR (~~TBL_PARAM179.NOMOGGPROINS~~ IS NULL)) ");
      SQL.append("and   (A.TIPO_VAR IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.CODICE ");
      SQL.append("from ");
      SQL.append("  T54 C, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL D ");
      SQL.append("where (C.TIPOLOGIA = D.CODICE) ");
      SQL.append("and   (D.TIPO_QUADRATURA = ~~TBL_PARAM179.NOMOGGTIPQUA~~) ");
      SQL.append("and   (C.TIPOLOGIA = ~~TBL_PARAM179.NOMEOGGETIPO~~) ");
      SQL.append(")) ");
      SQL.append("and   ((~~TBL_PARAM179.NOMOGGDELINS~~ = 'SI' AND ((A.ANNO_DEL = ~~TBL_PARAM179.NOMOGGANNDEL~~) AND (A.NUMERO_DEL = ~~TBL_PARAM179.NOMOGGNUMDEL~~) AND (A.SEDE_DEL = ~~TBL_PARAM179.NOMOGGSEDDEL~~))) OR (~~TBL_PARAM179.NOMOGGDELINS~~ IS NULL)) ");
      SQL.append("and   (~~TBL_PARAM179.NOMOGGDEFPRO~~ = 'D') ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  E.ESERCIZIO, ");
      SQL.append("  E.E_S, ");
      SQL.append("  E.CAPITOLO, ");
      SQL.append("  E.ARTICOLO, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  F.DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAP F ");
      SQL.append("where (F.ESERCIZIO = E.ESERCIZIO) ");
      SQL.append("and   (F.E_S = E.E_S) ");
      SQL.append("and   (F.CAPITOLO = E.CAPITOLO) ");
      SQL.append("and   (F.ARTICOLO = E.ARTICOLO) ");
      SQL.append("), ");
      SQL.append("  E.SEDE_DEL, ");
      SQL.append("  E.NUMERO_DEL, ");
      SQL.append("  E.ANNO_DEL, ");
      SQL.append("  E.UNITA_PROPONENTE, ");
      SQL.append("  E.NUMERO_PROPOSTA, ");
      SQL.append("  E.ANNO_PROPOSTA, ");
      SQL.append("  E.IMPORTO, ");
      SQL.append("  E.IMPORTO_CASSA, ");
      SQL.append("  DECODE(E.E_S, 'E', NVL(E.IMPORTO, 0), 0), ");
      SQL.append("  DECODE(E.E_S, 'S', NVL(E.IMPORTO, 0), 0), ");
      SQL.append("  DECODE(E.E_S, 'E', NVL(E.IMPORTO_CASSA, 0), 0), ");
      SQL.append("  DECODE(E.E_S, 'S', NVL(E.IMPORTO_CASSA, 0), 0), ");
      SQL.append("  CASE WHEN E.IMPORTO >= 0 THEN NVL(E.IMPORTO, 0) ELSE 0 END, ");
      SQL.append("  CASE WHEN E.IMPORTO < 0 THEN NVL(ABS(E.IMPORTO), 0) ELSE 0 END, ");
      SQL.append("  CASE WHEN E.IMPORTO_CASSA >= 0 THEN NVL(E.IMPORTO_CASSA, 0) ELSE 0 END, ");
      SQL.append("  CASE WHEN E.IMPORTO_CASSA < 0 THEN NVL(ABS(E.IMPORTO_CASSA), 0) ELSE 0 END, ");
      SQL.append("  2 ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO E ");
      SQL.append("where (E.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((E.PROGRESSIVO_PRIMA_VAR IS NULL))) ");
      SQL.append("and   (E.ANNO_PROPOSTA = ~~TBL_PARAM179.NOMOGGANNPRO~~) ");
      SQL.append("and   (E.NUMERO_PROPOSTA = ~~TBL_PARAM179.NOMOGGNUMPRO~~) ");
      SQL.append("and   (E.UNITA_PROPONENTE = ~~TBL_PARAM179.NOMOGGSEDPRO~~) ");
      SQL.append("and   (~~TBL_PARAM179.NOMOGGDEFPRO~~ = 'P') ");
      SQL.append("and   (E.TIPO_VAR IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  G.CODICE ");
      SQL.append("from ");
      SQL.append("  T54 G, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL H ");
      SQL.append("where (G.TIPOLOGIA = H.CODICE) ");
      SQL.append("and   (H.TIPO_QUADRATURA = ~~TBL_PARAM179.NOMOGGTIPQUA~~) ");
      SQL.append("and   (G.TIPOLOGIA = ~~TBL_PARAM179.NOMEOGGETIPO~~) ");
      SQL.append(")) ");
      SQL.append("order by 1, 22 ");
      BUK_CONTQUADBOOK.SetReportQuery(BUK_CONTQUADBOOK_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E12ED118-53FF-4444-A2D5-6980BDDF9D47");
      if (BUK_CONTQUADBOOK.FindObjByID(BUK_CONTQUADBOOK_SEC_VARESEINTGRU) != null)
        BUK_CONTQUADBOOK.AddReportGroup(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, "RECOVARCESER");
      if (BUK_CONTQUADBOOK.FindObjByID(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP) != null)
        BUK_CONTQUADBOOK.AddReportGroup(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, "RECORDGRUPPO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTQUADBOOK_RPT_REPORT_Init()
  {
    BUK_CONTQUADBOOK.InitReport(BUK_CONTQUADBOOK_RPT_REPORT, 131073);
    BUK_CONTQUADBOOK_RPT_REPORT_InitQuery(true, false);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPT_REPORT, "B27086E7-E4ED-4C8F-82B0-31626FABAC8A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPT_REPORT, "REPORT");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_INTESTPAGINA, 1900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8454145, "");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_INTESTPAGINA, BUK_CONTQUADBOOK_RPTBOX_TESTATPAGIN1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_INTESTPAGINA, "4A4F304E-6E2E-4406-AA61-0C13F9E867E9");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_INTESTPAGINA, BUK_CONTQUADBOOK_RPTBOX_TITOLO2, 0, 0, 27700, 600, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TITOLO2, "849849C4-5DC7-4584-9A4E-169AE8D2668A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_TITOLO2, BUK_CONTQUADBOOK_SPAN_NUOVASPAN6, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Controllo Quadratura", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN6, "80CB8AFF-90B9-477E-BA74-2AB9BB53CDA6");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN6, "NUOVASPAN6");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_INTESTPAGINA, BUK_CONTQUADBOOK_RPTBOX_DELIBERA2, 0, 800, 27700, 600, 0, 1, 1, MyGlb.VIS_TITOLREPOR12, 983041, 500, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_DELIBERA2, "C558A298-215D-4146-BC5B-AB50F560F4B3");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_DELIBERA2, "DELIBERA2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_DELIBERA2, BUK_CONTQUADBOOK_SPAN_IENODPDDNOS1, MyGlb.VIS_TITOLREPOR12, 5, 198, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENODPDDNOS1, "3974FF6C-C4CC-4A64-8508-F69F56030156");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENODPDDNOS1, "IENODPDDNOS1");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_VARESEINTGRU, 1300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 33619969, "RECOVARCESER");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, "2E68001B-E874-404A-ACF4-971C5E979679");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, "VARESEINTGRU");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, 700, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 983041, 0, "", 1, -33);
    BUK_CONTQUADBOOK.SetBoxImage(BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, null, "tp1.gif");
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, "D71FD971-E270-4B89-908C-51F2881A246B");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_ESPANDICOMP, "ESPANDICOMP");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_ESERCIZIO2, 2100, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_ESERCIZIO2, "07EF3F5F-00D3-49DE-B019-D88D9A112CA7");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_ESERCIZIO2, "ESERCIZIO2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_ESERCIZIO2, BUK_CONTQUADBOOK_SPAN_CETSRVECQPC1, MyGlb.VIS_INTSENBORRIG, 5, 109, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_CETSRVECQPC1, "EE0C2BFB-3B10-4443-858E-9F3BC942FACF");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_CETSRVECQPC1, "CETSRVECQPC1");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_COMPETENZAE2, 9400, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAE2, "770ED9EE-F8C6-4A20-830B-026B05817909");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAE2, "COMPETENZAE2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAE2, BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE4, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE4, "80777778-C7D5-47CA-AF9B-B6448396F0AA");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE4, "IFEQNOTQECE4");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_COMPETENZAS2, 12600, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAS2, "513D8714-3E2F-4801-A20F-A94E68E68CD6");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAS2, "COMPETENZAS2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_COMPETENZAS2, BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS4, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS4, "708008B4-5038-47C7-B208-942D3D92496A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS4, "IFEQNOTQECS4");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_SALDOCOMP2, 15800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMP2, "8180BD73-D871-4AA9-B96B-7006AD751D31");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMP2, "SALDOCOMP2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMP2, BUK_CONTQUADBOOK_SPAN_NUOVASPAN7, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Saldo Comp.", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN7, "76BE6412-60D8-4C84-8D8F-8FEFE51236A7");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN7, "NUOVASPAN7");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_CASSAE4, 18800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CASSAE4, "8E8D40D3-F31F-4020-B953-15EDE524881D");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CASSAE4, "CASSAE4");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CASSAE4, BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE5, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE5, "3B11893A-2604-43F9-BADA-60C7F14A2B9F");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECE5, "IFEQNOTQECE5");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_CASSAS4, 21800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CASSAS4, "CCD8A06E-FB0C-4216-933C-6B91A88C4AAF");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CASSAS4, "CASSAS4");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CASSAS4, BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS5, MyGlb.VIS_INTSENBORRIG, 5, 99, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS5, "12E05FE4-4B5E-4529-810D-C1B20964A1BB");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IFEQNOTQECS5, "IFEQNOTQECS5");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA3, 25000, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA3, "7EF2A7BA-84D3-4125-812F-0B59AFC168ED");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA3, "SALDOCASSA3");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA3, BUK_CONTQUADBOOK_SPAN_NUOVASPAN8, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Saldo Cassa", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN8, "9B5C2E0C-97EA-4CAD-BF13-2E3D89BDC96D");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN8, "NUOVASPAN8");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN3, 9400, 700, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN3, "0F79FA28-5939-4711-B58F-0BE83FECF8FA");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN3, "TOTCOMPETEN3");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN3, BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG4, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG4, "34455F1D-4A8F-4E20-9829-CE90AC576795");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG4, "IENOTQEVEIG4");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN4, 12600, 700, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN4, "6B5402CB-BE35-487F-A0E9-36D12FA9B14F");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN4, "TOTCOMPETEN4");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_TOTCOMPETEN4, BUK_CONTQUADBOOK_SPAN_IENOTQEVEIGS, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIGS, "06E2AE09-307C-45E5-96E0-0C537D0AE12D");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIGS, "IENOTQEVEIGS");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_SALDOCOMPET1, 15800, 700, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMPET1, "CE4775C0-430A-4394-B9A5-A731FC15EE8A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMPET1, "SALDOCOMPET1");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_SALDOCOMPET1, BUK_CONTQUADBOOK_SPAN_AIENOTQEAVEI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVEI, "C72DE64E-E6E4-4467-A6AB-548FA53DEC6A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVEI, "AIENOTQEAVEI");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_TOTCASSAE2, 18800, 700, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAE2, "F7A22825-94C9-4DC9-BC9B-EE148A85E714");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAE2, "TOTCASSAE2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAE2, BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG6, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG6, "04F0B9D4-C55F-4563-B4F3-9CC9B4BD5D1E");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG6, "IENOTQEVEIG6");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_TOTCASSAS2, 21800, 700, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAS2, "AF9FCB5C-2D57-4500-8994-9A8647C0E264");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAS2, "TOTCASSAS2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_TOTCASSAS2, BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG7, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG7, "3495A238-414E-4115-B06E-AB296768D66C");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEVEIG7, "IENOTQEVEIG7");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA4, 25200, 700, 2500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA4, "B35F5AD0-619D-4D5D-8091-DC39EC22CEFE");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA4, "SALDOCASSA4");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_SALDOCASSA4, BUK_CONTQUADBOOK_SPAN_AIENOTQEAVE3, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVE3, "EF8886F7-D3A1-40D9-BE35-55AB2A7CB38B");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_AIENOTQEAVE3, "AIENOTQEAVE3");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8454145, "RECORDGRUPPO");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, "5B88A4A6-10D9-41CD-8231-A8644CD46C3F");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, "GRUPINTEGRUP");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, BUK_CONTQUADBOOK_RPTBOX_PARTE1, 100, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_PARTE1, "0ADC5D11-3009-4955-A62D-92B0476460DE");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_PARTE1, "PARTE1");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_PARTE1, BUK_CONTQUADBOOK_SPAN_NUOVASPAN9, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Parte", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN9, "24A0D30F-38DD-41CB-A0A1-07DD1CAC9237");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN9, "NUOVASPAN9");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, BUK_CONTQUADBOOK_RPTBOX_CAPITOLO2, 1600, 0, 7700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO2, "A3875ABC-FD70-44B1-9B3A-5294691DF711");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO2, "CAPITOLO2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO2, BUK_CONTQUADBOOK_SPAN_NUOVASPAN10, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN10, "62FD26FA-89BF-4F6B-834F-C727217ACBE9");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN10, "NUOVASPAN10");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, BUK_CONTQUADBOOK_RPTBOX_DESCRCAPITO1, 1600, 400, 7700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_DESCRCAPITO1, "BD466C36-1021-4381-BC68-61CA7022C71C");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_DESCRCAPITO1, "DESCRCAPITO1");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_DESCRCAPITO1, BUK_CONTQUADBOOK_SPAN_NUOVASPAN11, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_NUOVASPAN11, "DE8F3BE0-9F4D-4283-8053-B79830BEF8D4");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_NUOVASPAN11, "NUOVASPAN11");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_DETTAGLIO, 1100, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8454145, "");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_DETTAGLIO, "3F55476D-5834-4DAD-B51B-530DD291CD00");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_ES2, 600, 100, 400, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_ES2, "B28AB31A-1B5C-4A89-A58A-3B384811370A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_ES2, "ES2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_ES2, BUK_CONTQUADBOOK_SPAN_IERVESCQPCQ1, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IERVESCQPCQ1, "808D1F74-6092-4702-B98A-1AECCAB889F3");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IERVESCQPCQ1, "IERVESCQPCQ1");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_DESCRIZIONE2, 1600, 600, 7800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_DESCRIZIONE2, "4816B257-85B2-4121-89AF-881E52B1C95A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_DESCRIZIONE2, BUK_CONTQUADBOOK_SPAN_REDECOQUPCQB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::DESCRIZIONE", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_REDECOQUPCQB, "8FF60B6C-4166-443D-B40D-666D0CBB4E8F");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_REDECOQUPCQB, "REDECOQUPCQB");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_COMPE2, 9400, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_COMPE2, "D036898A-BB0C-4C81-8894-51845CF95E4A");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_COMPE2, "COMPE2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_COMPE2, BUK_CONTQUADBOOK_SPAN_IENOTQEIERV4, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV4, "82A3DFB7-3CC3-43DF-AF32-4C399C4DD810");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV4, "IENOTQEIERV4");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_COMPS2, 12600, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_COMPS2, "F287D073-4202-4809-81DC-B8C3A47680BC");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_COMPS2, "COMPS2");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_COMPS2, BUK_CONTQUADBOOK_SPAN_IENOTQEIERV1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV1, "BE4C4C64-CDDC-485A-BBB5-DCA5485B05A8");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV1, "IENOTQEIERV1");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_CASSAE5, 18800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CASSAE5, "B72210DE-8F67-486B-97BE-92CF85A7F675");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CASSAE5, "CASSAE5");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CASSAE5, BUK_CONTQUADBOOK_SPAN_IENOTQEIERV6, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV6, "F4B93BC4-A237-4840-A7CF-918678F64089");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEIERV6, "IENOTQEIERV6");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_CASSAS5, 21800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CASSAS5, "161B0DB0-41CA-4F54-91E4-9F0C76631540");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CASSAS5, "CASSAS5");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CASSAS5, BUK_CONTQUADBOOK_SPAN_IENOTQEIERVE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_IENOTQEIERVE, "D1AEE4A1-7221-481B-8630-03A1939C0AC9");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_IENOTQEIERVE, "IENOTQEIERVE");
    BUK_CONTQUADBOOK.InitReportBox(BUK_CONTQUADBOOK_SEC_DETTAGLIO, BUK_CONTQUADBOOK_RPTBOX_CAPITOLO3, 1600, 100, 6000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO3, "98EEEF9E-17E5-4DAA-BA8C-0B8F53C51B74");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO3, "CAPITOLO3");
    BUK_CONTQUADBOOK.InitBoxSpan(BUK_CONTQUADBOOK_RPTBOX_CAPITOLO3, BUK_CONTQUADBOOK_SPAN_TSRVCCQPCQBT, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "", "", 1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SPAN_TSRVCCQPCQBT, "0659C5C3-91CA-4ADF-93AD-2F9FBCEF1759");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SPAN_TSRVCCQPCQBT, "TSRVCCQPCQBT");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8454145, "RECORDGRUPPO");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP, "F7FD74B1-D7E2-41B0-B0BF-B1A3EF974141");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_GRUPPIEDGRUP, "GRUPPIEDGRUP");
    BUK_CONTQUADBOOK.InitSection(BUK_CONTQUADBOOK_RPT_REPORT, BUK_CONTQUADBOOK_SEC_VARESEPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8454145, "RECOVARCESER");
    BUK_CONTQUADBOOK.SetSectionRendersInto(BUK_CONTQUADBOOK_SEC_VARESEPIEGRU, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
    BUK_CONTQUADBOOK.SetRTCGuid(BUK_CONTQUADBOOK_SEC_VARESEPIEGRU, "35486611-9E6D-446B-B2C6-66FA96B1491C");
    BUK_CONTQUADBOOK.SetObjCode(BUK_CONTQUADBOOK_SEC_VARESEPIEGRU, "VARESEPIEGRU");
    BUK_CONTQUADBOOK.AddReportGroup(BUK_CONTQUADBOOK_SEC_VARESEINTGRU, "RECOVARCESER");
    BUK_CONTQUADBOOK.AddReportGroup(BUK_CONTQUADBOOK_SEC_GRUPINTEGRUP, "RECORDGRUPPO");
    BUK_CONTQUADBOOK_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_CONTQUADBOOK_InitLinks()
  {
    BUK_CONTQUADBOOK.SetBoxNextBox(BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1, BUK_CONTQUADBOOK_RPTBOX_CORPOPAGINA1);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONQUADEFEXP) PAN_CONQUADEFEXP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONQUAPROEXP) PAN_CONQUAPROEXP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONQUADEFEXP) PAN_CONQUADEFEXP_ValidateRow(Cancel);
    if (SrcObj == PAN_CONQUAPROEXP) PAN_CONQUAPROEXP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONQUADEFEXP) PAN_CONQUADEFEXP_DynamicProperties();
    if (SrcObj == PAN_CONQUAPROEXP) PAN_CONQUAPROEXP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONQUADEFEXP) PAN_CONQUADEFEXP_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONQUAPROEXP) PAN_CONQUAPROEXP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONQUADEFEXP) PAN_CONQUADEFEXP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CONQUAPROEXP) PAN_CONQUAPROEXP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTQUADBOOK) BUK_CONTQUADBOOK_OnPreview();
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
