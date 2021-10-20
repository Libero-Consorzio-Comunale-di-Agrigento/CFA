// **********************************************
// Stanziamenti Bilancio Simulato Vg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiBilancioSimulatoVg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRSIMULVG_ENTRATASPESA = 0;
  private static int PFL_FILTRSIMULVG_TITOLO = 1;
  private static int PFL_FILTRSIMULVG_CATEGORIA = 2;
  private static int PFL_FILTRSIMULVG_FUNZIONE = 3;
  private static int PFL_FILTRSIMULVG_SERVIZIO = 4;
  private static int PFL_FILTRSIMULVG_CODINTERVENT = 5;
  private static int PFL_FILTRSIMULVG_CODTERZI = 6;

  private static int PPQRY_FILTRISIMUL2 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_CATEGORIE = 2;
  private static int PPQRY_FUNZIONI = 3;
  private static int PPQRY_SERVIZI = 4;
  private static int PPQRY_INTERVENTI = 5;
  private static int PPQRY_CAPTER = 6;


  IDPanel PAN_FILTRSIMULVG;
  private static int PFL_STANZIAMENVG_CAPITOEXPRE2 = 0;
  private static int PFL_STANZIAMENVG_ARTICOEXPRES = 1;
  private static int PFL_STANZIAMENVG_DESCRIABBREV = 2;
  private static int PFL_STANZIAMENVG_INFOCAPBUTTO = 3;
  private static int PFL_STANZIAMENVG_APRISTAUOEXP = 4;
  private static int PFL_STANZIAMENVG_NUOVOEXPRESS = 5;
  private static int PFL_STANZIAMENVG_STNINICO = 6;
  private static int PFL_STANZIAMENVG_STNINICOSVIL = 7;
  private static int PFL_STANZIAMENVG_STNINICOCONS = 8;
  private static int PFL_STANZIAMENVG_PREVISIONE = 9;
  private static int PFL_STANZIAMENVG_PREVISIOSVIL = 10;
  private static int PFL_STANZIAMENVG_PREVISIOCONS = 11;
  private static int PFL_STANZIAMENVG_IMPACCULTCHI = 12;
  private static int PFL_STANZIAMENVG_IMPACCULTSVI = 13;
  private static int PFL_STANZIAMENVG_IMPACCULTCON = 14;
  private static int PFL_STANZIAMENVG_IMPEGNABILE = 15;
  private static int PFL_STANZIAMENVG_NUMRECEXPRES = 16;
  private static int PFL_STANZIAMENVG_UNITAGEXPRES = 17;
  private static int PFL_STANZIAMENVG_TITOLO1 = 18;
  private static int PFL_STANZIAMENVG_CATEGORIA1 = 19;
  private static int PFL_STANZIAMENVG_FUNZIONE1 = 20;
  private static int PFL_STANZIAMENVG_SERVIZIO1 = 21;
  private static int PFL_STANZIAMENVG_CODINTERVEN1 = 22;
  private static int PFL_STANZIAMENVG_ESERCIZIO = 23;
  private static int PFL_STANZIAMENVG_ES = 24;
  private static int PFL_STANZIAMENVG_CAPITOLO = 25;
  private static int PFL_STANZIAMENVG_ARTICOLO = 26;
  private static int PFL_STANZIAMENVG_STATOEXPRESS = 27;
  private static int PFL_STANZIAMENVG_VARIAZIONICO = 28;
  private static int PFL_STANZIAMENVG_VARIAZCOCONS = 29;
  private static int PFL_STANZIAMENVG_VARIAZCOSVIL = 30;
  private static int PFL_STANZIAMENVG_ESERCIZIO1 = 31;
  private static int PFL_STANZIAMENVG_NASENTINULAB = 32;
  private static int PFL_STANZIAMENVG_STANENTRLABE = 33;
  private static int PFL_STANZIAMENVG_PREVENTRLABE = 34;
  private static int PFL_STANZIAMENVG_ACCULTCHENLA = 35;
  private static int PFL_STANZIAMENVG_TOTAENTRLAB1 = 36;
  private static int PFL_STANZIAMENVG_TOTAENTRLAB2 = 37;
  private static int PFL_STANZIAMENVG_TOTAENTRLABE = 38;
  private static int PFL_STANZIAMENVG_VOCEPEGLABEL = 39;
  private static int PFL_STANZIAMENVG_STANSPESLABE = 40;
  private static int PFL_STANZIAMENVG_STATOTSPELAB = 41;
  private static int PFL_STANZIAMENVG_STASVISPELAB = 42;
  private static int PFL_STANZIAMENVG_STACONSPELAB = 43;
  private static int PFL_STANZIAMENVG_PREVSPESLABE = 44;
  private static int PFL_STANZIAMENVG_PRETOTSPELAB = 45;
  private static int PFL_STANZIAMENVG_PRECONSPELAB = 46;
  private static int PFL_STANZIAMENVG_PRESVISPELAB = 47;
  private static int PFL_STANZIAMENVG_IMPULTCHSPLA = 48;
  private static int PFL_STANZIAMENVG_IMULCHTOSPLA = 49;
  private static int PFL_STANZIAMENVG_IMULCHSPSVLA = 50;
  private static int PFL_STANZIAMENVG_IMULCHCOSPLA = 51;
  private static int PFL_STANZIAMENVG_CAPITOEXPRE1 = 52;

  private static int PPQRY_CAP9 = 0;


  IDPanel PAN_STANZIAMENVG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_TEMPBPRVG(IMDB);
    //
    //
    Init_PQRY_CAP9(IMDB);
    Init_PQRY_FILTRISIMUL2(IMDB);
    Init_PQRY_FILTRISIMUL2_RS(IMDB);
    Init_QRY_CFASELINTV84(IMDB);
    Init_QRY_CFASELINTV85(IMDB);
    Init_QRY_TEMPBPRVG1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_TEMPBPRVG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_TEMPBPRVG, 17);
    IMDB.set_TblCode(IMDBDef3.TBL_TEMPBPRVG, "TBL_TEMPBPRVG");
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMESTATU,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMECNUOV, "ROWNAMECNUOV");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMECNUOV,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMEFPVSI, "ROWNAMEFPVSI");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBPRVG,IMDBDef3.FLD_TEMPBPRVG_ROWNAMEFPVSI,5,2,0);
  }

  private static void Init_PQRY_CAP9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAP9, 34);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAP9, "PQRY_CAP9");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOCAPIEXPR, "RECOCAPIEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOCAPIEXPR,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOARTIEXPR, "RECOARTIEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOARTIEXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECINFCAPBUT, "RECINFCAPBUT");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECINFCAPBUT,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECAPRSTUOEX, "RECAPRSTUOEX");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECAPRSTUOEX,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECONUOVEXPR, "RECONUOVEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECONUOVEXPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECONUMREXPR, "RECONUMREXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECONUMREXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOUNITEXPR, "RECOUNITEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOUNITEXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOSTATEXPR, "RECOSTATEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOSTATEXPR,5,0,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECORDBPRESE, "RECORDBPRESE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECORDBPRESE,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOCAPIEXP1, "RECOCAPIEXP1");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP9,IMDBDef11.PQSL_CAP9_RECOCAPIEXP1,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAP9, 0);
  }

  private static void Init_PQRY_FILTRISIMUL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTRISIMUL2, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTRISIMUL2, "PQRY_FILTRISIMUL2");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FILTRISIMUL2, 0);
  }

  private static void Init_PQRY_FILTRISIMUL2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTRISIMUL2_RS, "PQRY_FILTRISIMUL2_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRISIMUL2_RS,IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER,1,2,0);
  }

  private static void Init_QRY_CFASELINTV84(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_CFASELINTV84, 1);
    IMDB.set_TblCode(IMDBDef11.QRY_CFASELINTV84, "QRY_CFASELINTV84");
    IMDB.set_FldCode(IMDBDef11.QRY_CFASELINTV84,IMDBDef11.QSL_CFASELINTV84_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef11.QRY_CFASELINTV84,IMDBDef11.QSL_CFASELINTV84_COUNT,1,19,0);
  }

  private static void Init_QRY_CFASELINTV85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_CFASELINTV85, 1);
    IMDB.set_TblCode(IMDBDef11.QRY_CFASELINTV85, "QRY_CFASELINTV85");
    IMDB.set_FldCode(IMDBDef11.QRY_CFASELINTV85,IMDBDef11.QSL_CFASELINTV85_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef11.QRY_CFASELINTV85,IMDBDef11.QSL_CFASELINTV85_ROWNAMEESERC,3,12,0);
  }

  private static void Init_QRY_TEMPBPRVG1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_TEMPBPRVG1, 15);
    IMDB.set_TblCode(IMDBDef11.QRY_TEMPBPRVG1, "QRY_TEMPBPRVG1");
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC,3,12,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEIMPEG,3,14,2);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOSV, "RONASTINCOSV");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOSV,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOCO, "RONASTINCOCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMSTINCO, "ROWNAMSTINCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMSTINCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRESVI, "ROWNAMPRESVI");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRESVI,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEPREVI, "ROWNAMEPREVI");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEPREVI,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULSV, "RONAIMACULSV");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULSV,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRECON, "ROWNAMPRECON");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRECON,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCO, "RONAIMACULCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCH, "RONAIMACULCH");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCH,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBPRVG1,IMDBDef11.QSL_TEMPBPRVG1_ROWNAMESTATU,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiBilancioSimulatoVg(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiBilancioSimulatoVg()
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
    FormIdx = MyGlb.FRM_STANBILSIMVG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "04BAAF0B-2D6E-49A4-80D1-3C714C1A33BA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 510;
    set_Caption(new IDVariant("Stanziamenti Bilancio Simulato Vg"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 484;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.239669;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 792;
    Frames[2].Height = 116;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Simulato Vg";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 116;
    PAN_FILTRSIMULVG = new IDPanel(w, this, 2, "PAN_FILTRSIMULVG");
    Frames[2].Content = PAN_FILTRSIMULVG;
    PAN_FILTRSIMULVG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRSIMULVG.VS = MainFrm.VisualStyleList;
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4F5510DB-D5AB-4C13-A054-A4F9278418FE");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 496, 308, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRSIMULVG.InitStatus = 2;
    PAN_FILTRSIMULVG_Init();
    PAN_FILTRSIMULVG_InitFields();
    PAN_FILTRSIMULVG_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 792;
    Frames[3].Height = 368;
    Frames[3].Caption = "Stanziamenti Vg";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 368;
    PAN_STANZIAMENVG = new IDPanel(w, this, 3, "PAN_STANZIAMENVG");
    Frames[3].Content = PAN_STANZIAMENVG;
    PAN_STANZIAMENVG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIAMENVG.VS = MainFrm.VisualStyleList;
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9B5819DB-DBEC-4E3A-9BDD-E81BBFA5F4CD");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 12, 1232, 248, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 44);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZIAMENVG.InitStatus = 1;
    PAN_STANZIAMENVG_Init();
    PAN_STANZIAMENVG_InitFields();
    PAN_STANZIAMENVG_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_DELETE4+BaseCmdLinIdx)
      {
        DeleteActiveRow();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA15+BaseCmdLinIdx)
      {
        Salva();
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
      if (IMDB.TblModified(IMDBDef3.TBL_FILTRSIMULVG, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STANBILSIMVG_FILTRISIMUL2();
      }
      PAN_STANZIAMENVG.UpdatePanel(MainFrm);
      PAN_FILTRSIMULVG.UpdatePanel(MainFrm);
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
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof StanziamentiBilancioSimulatoVg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiBilancioSimulatoVg.class.getName() : (Glb.ClassWithPackage(StanziamentiBilancioSimulatoVg.class) ? StanziamentiBilancioSimulatoVg.class.getName().substring(StanziamentiBilancioSimulatoVg.class.getPackage().getName().length() + 1) : StanziamentiBilancioSimulatoVg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stanziamenti IMP ACC ULT SVIL Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_IMPACCULTSVI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti IMP ACC ULT SVIL Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)) && IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0)));
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiIMPACCULTSVILValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti IMP ACC ULT CHIUSO Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_IMPACCULTCHI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti IMP ACC ULT CHIUSO Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0)));
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiIMPACCULTCHIUSOValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti PREVISIONE SVIL Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_PREVISIOSVIL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti PREVISIONE SVIL Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiPREVISIONESVILValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti PREVISIONE Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_PREVISIONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti PREVISIONE Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiPREVISIONEValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti STN INI CO SVIL Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_STNINICOSVIL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti STN INI CO SVIL Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiSTNINICOSVILValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti STN INI CO Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_STNINICO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti STN INI CO Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiSTNINICOValidateEvent", _e);
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
    IDVariant v_NOMEFORM = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEPANNSTAN = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMEFORM = (new IDVariant("Stanziamenti Bilancio Simulato", IDVariant.STRING));
      v_NOMEPANNSTAN = (new IDVariant("Stanziamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMEFORM, MainFrm.ESERCIZIO));
      Frames[PAN_STANZIAMENVG.FrIndex].set_Caption(new IDVariant(v_NOMEPANNSTAN).stringValue());
      PAN_STANZIAMENVG.Freezed = (new IDVariant(-1)).booleanValue();
      // 
      // visibilità dei comandid i pannello
      // 
      {
        PAN_STANZIAMENVG.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZIAMENVG.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZIAMENVG.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZIAMENVG.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      // 
      // inizliazzo alcune variabili, sono utilizzate nell'After Find per andare in modalità QBE alla prima visualizzazione del pannello
      // 
      {
        LOADEVENT_TEMBPRVGDERO();
      }
      PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Temp BPR Vg: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_TEMBPRVGDERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBPRVG);
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      UNLOADEVENT_FILTSIMVGDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Simulato Vg: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_FILTSIMVGDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMETITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMECATEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEFUNZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMESERVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODINT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODTER, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_STANZIAUOVG1)), true) && Result.booleanValue())
      {
        Delete(new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0));
        // 
        // controllo se ci sono altre righe che non sono state salvate per vedere se fare il refreshquery o no
        // 
        {
          IDVariant v_NOROWS = new IDVariant(0,IDVariant.INTEGER);
          ENDMODALEVEN_CFASELINTV84();
          if (!IMDB.Eof(IMDBDef11.QRY_CFASELINTV84, 0))
          {
            v_NOROWS = IMDB.Value(IMDBDef11.QRY_CFASELINTV84, IMDBDef11.QSL_CFASELINTV84_COUNT, 0, IDVariant.INTEGER) ;
          }
          if (v_NOROWS.equals((new IDVariant(0)), true))
          {
            PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void ENDMODALEVEN_CFASELINTV84() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_CFASELINTV84);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBPRVG, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef11.QRY_CFASELINTV84, 0);
              IMDB.set_Value(IMDBDef11.QRY_CFASELINTV84, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_CFASELINTV84, 0);
  }

  // **********************************************************************
  // Stanziamenti Vg On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_STANZIAMENVG_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti Vg On Change Status Event Body
      // Procedure Body
      // 
      SistemaEtichette();
      // 
      // visibilità etichette in base allo stato
      // 
      {
        if (!(new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true)))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DELETE4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          if (new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(1)), true))
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          // 
          // campo del pannello filtri abilitati
          // 
          // {
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          // }
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DELETE4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          // 
          // campi del pannello filtri disabilitati
          // 
          // {
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          // }
          // 
          // campi del pannello stanziamenti da rendere visibili
          // 
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiVgOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti Vg On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZIAMENVG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZIAMENVG);
      // 
      // Stanziamenti Vg On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione campo impegnabile
      // 
      {
        if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("S")), true))
        {
          // 
          // gestione etichette
          // 
          {
            // 
            // etichette utilizzate in spesa vengono rese visibili
            // 
            {
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            // 
            // etichette utilizzate in entrata vengono rese invisibili
            // 
            {
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
          }
        }
        if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
        {
          // 
          // gestione etichette
          // 
          {
            // 
            // etichette utilizzate in spesa vengono rese visibili
            // 
            {
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            // 
            // etichette utilizzate in entrata vengono rese invisibili
            // 
            {
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
          }
        }
      }
      // 
      // gestione visibilità campo APRISTANZIAMENTIUO
      // 
      // 
      // 
      {
        if (IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOUNITEXPR, 0).compareTo((new IDVariant(1)), true)>0 || (IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOUNITEXPR, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECONUMREXPR, 0).compareTo((new IDVariant(0)), true)>0))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECAPRSTUOEX, 0, (new IDVariant(10)));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECAPRSTUOEX, 0, (new IDVariant()));
        }
      }
      PAN_STANZIAMENVG.set_ToolTip(Glb.OBJ_FIELD,PFL_STANZIAMENVG_DESCRIABBREV,(new IDVariant(PAN_STANZIAMENVG.FieldText(PFL_STANZIAMENVG_DESCRIABBREV))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiVgOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti Vg On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMENVG_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_STANZIAMENVG, Cancel);
      // 
      // Stanziamenti Vg On Validate Row Event Body
      // Procedure Body
      // 
      Insert(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMPEGNABILE, 0), new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0), ((IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0).equals((new IDVariant())))?(new IDVariant("SI")):(new IDVariant("NO"))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiVgOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti Vg On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_STANZIAMENVG_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti Vg On Change Row Event Body
      // Procedure Body
      // 
      // 
      // controllo se è una nuova riga per quanto riguarda bpr
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DELETE4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DELETE4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiVgOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti Vg On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STANZIAMENVG_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti Vg On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_STANZIAMENVG.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_STANZIAMENVG.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        STAVGONCOMEV_TEMBPRVGDERO();
        PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "StanziamentiVgOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Temp BPR Vg: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void STAVGONCOMEV_TEMBPRVGDERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBPRVG);
  }

  // **********************************************************************
  // Filtri Simulato Vg On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRSIMULVG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRSIMULVG);
      // 
      // Filtri Simulato Vg On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        // 
        // condizioni di visibilità dei componenti del pannello Filtri
        // 
        {
          PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if ((IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
          {
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        // 
        // gestione impegnabile Entrata
        // 
        {
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        // 
        // condizioni di visibilità dei componenti del pannello Filtri
        // 
        {
          PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).compareTo((new IDVariant(4)), true)!=0)
          {
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRSIMULVG.SetFlags (Glb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        // 
        // gestione impegnabile Spesa
        // 
        {
          if (MainFrm.GESTIOIMPEGN.equals((new IDVariant("SI")), true))
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          }
          else
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          }
        }
      }
      VisibilitaEtichette();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "FiltriSimulatoVgOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Simulato Entrataspesa Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRSIMULVG_ENTRATASPESA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Simulato Entrataspesa Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, 0, (new IDVariant()));
        if ((IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, 0, (new IDVariant()));
        }
        // 
        // rendo le colonne invisibili
        // 
        {
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).compareTo((new IDVariant(4)), true)!=0)
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, 0, (new IDVariant()));
        }
        // 
        // rendo le colonne visibili
        // 
        {
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "FiltriSimulatoEntrataspesaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Simulato Titolo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRSIMULVG_TITOLO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Simulato Titolo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, 0, (new IDVariant()));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, 0, (new IDVariant()));
        if ((IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, 0, (new IDVariant()));
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMECATEG, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMETITOL, 0).equals((new IDVariant(4)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODINT, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMCODTER, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "FiltriSimulatoTitoloValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Simulato Funzione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRSIMULVG_FUNZIONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Simulato Funzione Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEFUNZI, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMESERVI, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "FiltriSimulatoFunzioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Save Active Row
  // **********************************************************************
  public int SaveActiveRow ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Save Active Row Body
      // Procedure Body
      // 
      // if (new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true))
      // {
        // return 0;
      // }
      // MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      // MainFrm.Cf4armDBObject.BeginTrans();
      // try
      // {
        // if (IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0).equals((new IDVariant("I")), true))
        // {
          // SQL = new StringBuffer();
          // SQL.append("insert into BIL ");
          // SQL.append("( ");
          // SQL.append("  ESERCIZIO, ");
          // SQL.append("  E_S, ");
          // SQL.append("  CAPITOLO, ");
          // SQL.append("  ARTICOLO, ");
          // SQL.append("  STN_INI_CO, ");
          // SQL.append("  STN_INI_CO_CONS, ");
          // SQL.append("  STN_INI_CO_SVIL, ");
          // SQL.append("  PREVISIONE, ");
          // SQL.append("  PREVISIONE_SVIL, ");
          // SQL.append("  PREVISIONE_CONS, ");
          // SQL.append("  IMP_ACC_ULT_SVIL, ");
          // SQL.append("  IMP_ACC_ULT_CONS, ");
          // SQL.append("  IMP_ACC_ULT_CHIUSO, ");
          // SQL.append("  VARIAZIONI_CO, ");
          // SQL.append("  VARIAZIONI_CO_SVIL, ");
          // SQL.append("  VARIAZIONI_CO_CONS, ");
          // SQL.append("  UTENTE_INSERIMENTO, ");
          // SQL.append("  DATA_INSERIMENTO, ");
          // SQL.append("  IMPEGNABILE ");
          // SQL.append(") ");
          // SQL.append("values ");
          // SQL.append("( ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  0, ");
          // SQL.append("  0, ");
          // SQL.append("  0, ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  TRUNC( SYSDATE ), ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMPEGNABILE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          // SQL.append(") ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant()));
        // }
        // if (IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0).equals((new IDVariant("M")), true))
        // {
          // SQL = new StringBuffer();
          // SQL.append("update BIL set ");
          // SQL.append("  IMP_ACC_ULT_CHIUSO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMP_ACC_ULT_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMP_ACC_ULT_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMPEGNABILE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMPEGNABILE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
          // SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (ARTICOLO = ARTICOLO) ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant()));
        // }
      // }
      // catch (Exception e7)
      // {
        // MainFrm.set_AlertMessage(new IDVariant(e7.getMessage())); 
        // PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
        // MainFrm.Cf4armDBObject.RollbackTrans();
        // return 0;
      // }
      // IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECOSTATEXPR, 0, (new IDVariant()));
      // MainFrm.Cf4armDBObject.CommitTrans();
      // PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "SaveActiveRow", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Delete Active Row
  // cancella la riga selezionata
  // **********************************************************************
  public int DeleteActiveRow ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EXITCODE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Cancellare la riga selezionata?", IDVariant.STRING));
      // 
      // Delete Active Row Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0)))
      {
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Impossibile cancellare la riga selezionata, é una riga vuota!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG2); 
        return 0;
      }
      v_EXITCODE = (new IDVariant(MainFrm.MessageConfirm(v_MSG)));
      if (v_EXITCODE.booleanValue())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        // MainFrm.Cf4armDBObject.BILPD(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        else
        {
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            SQL = new StringBuffer();
            SQL.append("delete from BPR ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        MainFrm.Cf4armDBObject.CommitTrans();
        PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "DeleteActiveRow", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stanziamenti BPR Vg
  // **********************************************************************
  public int ApriStanziamentiBPRVg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stanziamenti BPR Vg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_RECORDBPRESE, 0))) && new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true))
      {
        // 
        // inizializzazione parametri
        // 
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEESERC, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ESERCIZIO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEES, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMEPREVI, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_ROWNAMESTANZ, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMESIMUL1, IMDBDef3.FLD_PARAMESIMUL1_RONAIMACULCT, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0));
        }
        MainFrm.Show(MyGlb.FRM_STANZIAUOVG1, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "ApriStanziamentiBPRVg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info
  // **********************************************************************
  public int ApriInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Body
      // Procedure Body
      // 
      // 
      // inizializzazione parametri
      // 
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      }
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "ApriInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // Salva tutte le nuove righe nuove inserite nel pannello
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERROR = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERROR = (new IDVariant(0, IDVariant.INTEGER));
      // 
      // Salva Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true))
      {
        return 0;
      }
      try
      {
        UpdateDataTemp(v_ERROR, v_ERRORMESSAGE);
        if (v_ERROR.booleanValue())
        {
          MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
        }
      }
      catch (Exception e6)
      {
        MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
        return 0;
      }
      if (v_ERROR.booleanValue())
      {
        return 0;
      }
      else
      {
        PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Sistema Etichette
  // setto posizione e condizioni delle etichette in base
  // alle condizioni del pannello filtri e allo stato del
  // pannello stanziamenti
  // 
  // **********************************************************************
  public int SistemaEtichette ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sistema Etichette Body
      // Procedure Body
      // 
      // 
      // ridimensionamento etichette
      // 
      {
        if (new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(1)), true))
        {
          // 
          // caso in cui è attivo il filtro spesa
          // 
          {
            if ((new IDVariant("S")).equals((new IDVariant("S")), true))
            {
              // 
              // etichette visualizzate con il filtro spesa attivo
              // 
              {
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              }
              // 
              // etichette visualizza<te con il filtro entrata attivo
              // 
              {
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Sub(IDL.Sub((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              }
            }
          }
        }
        if (new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true))
        {
          // 
          // caso in cui è selezionato il filtro spesa
          // 
          {
            if ((new IDVariant("S")).equals((new IDVariant("S")), true))
            {
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
            }
          }
        }
        // 
        // etichette visualizza<te con il filtro entrata attivo
        // 
        {
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Sub(IDL.Sub((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
          PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_LEFT, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "SistemaEtichette", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Etichette
  // **********************************************************************
  public int VisibilitaEtichette ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Etichette Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_FILTRISIMUL2, IMDBDef11.PQSL_FILTRISIMUL2_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        // 
        // gestione etichette Entrata
        // 
        {
          // 
          // etichette utilizzate in spesa vengono rese invisibili
          // 
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          // 
          // etichette utilizzate in entrata
          // 
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      else
      {
        // 
        // gestione etichette Spesa
        // 
        {
          // 
          // etichette utilizzate in spesa vengono rese visibili
          // 
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          // 
          // etichette utilizzate in entrata vengono rese invisibili
          // 
          {
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "VisibilitaEtichette", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Is Present
  // unEsercizio:  - Input
  // unES:  - Input
  // unCapitolo:  - Input
  // unArticolo:  - Input
  // **********************************************************************
  public boolean IsPresent (IDVariant unEsercizio, IDVariant unES, IDVariant unCapitolo, IDVariant unArticolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PRESENT = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Is Present Body
      // Procedure Body
      // 
      ISPRESENT_CFASELINTV85(unEsercizio, unES, unCapitolo, unArticolo);
      if (!IMDB.Eof(IMDBDef11.QRY_CFASELINTV85, 0))
      {
        v_PRESENT = IMDB.Value(IMDBDef11.QRY_CFASELINTV85, IMDBDef11.QSL_CFASELINTV85_ROWNAMEESERC, 0, IDVariant.DECIMAL) ;
      }
      if (v_PRESENT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        return (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "IsPresent", _e);
      return false;
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void ISPRESENT_CFASELINTV85(IDVariant unEsercizio, IDVariant unES, IDVariant unCapitolo, IDVariant unArticolo) throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_CFASELINTV85);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
    {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0).equals(unEsercizio, true))
      {
        if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0).equals(unES, true))
        {
          if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0).equals(unCapitolo, true))
          {
            if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0).equals(unArticolo, true))
            {
              IMDB.TblAddNew(IMDBDef11.QRY_CFASELINTV85, 0);
              IMDB.TblLinkRow(IMDBDef11.QRY_CFASELINTV85, 0, IMDBDef3.TBL_TEMPBPRVG, 0);
              IMDB.TblLinkField(IMDBDef11.QRY_CFASELINTV85, 0, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0);
            }
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBPRVG, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_CFASELINTV85, 0);
  }

  // **********************************************************************
  // Insert
  // Un STN INI CO SVIL:  - Input
  // Un STN INI CO CONS:  - Input
  // Un STN INI CO:  - Input
  // Un PREVISIONE SVIL:  - Input
  // Un PREVISIONE CONS:  - Input
  // Un PREVISIONE:  - Input
  // Un IMP ACC ULT SVIL:  - Input
  // Un IMP ACC ULT CONS:  - Input
  // Un IMP ACC ULT CHIUSO:  - Input
  // unIMPEGNABILE:  - Input
  // Unesercizio:  - Input
  // Unes:  - Input
  // Uncapitolo:  - Input
  // Unarticolo:  - Input
  // unCNUOVO:  - Input
  // **********************************************************************
  public int Insert (IDVariant UnSTNINICOSVIL, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICO, IDVariant UnPREVISIONESVIL, IDVariant UnPREVISIONECONS, IDVariant UnPREVISIONE, IDVariant UnIMPACCULTSVIL, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTCHIUSO, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo, IDVariant unCNUOVO)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Insert Body
      // Procedure Body
      // 
      if (!(IsPresent(Unesercizio, Unes, Uncapitolo, Unarticolo)))
      {
        // 
        // piccola curiosità: come mai togliendo ifequal a runtime
        // ottengo index of boundd ??
        // 
        INSERT_TEMBPRVGINVA(UnIMPACCULTCHIUSO, UnIMPACCULTCONS, UnIMPACCULTSVIL, UnPREVISIONE, UnPREVISIONECONS, UnSTNINICO, UnSTNINICOCONS, UnSTNINICOSVIL, unIMPEGNABILE, Unesercizio, Unes, Uncapitolo, Unarticolo, unCNUOVO);
      }
      else
      {
        INSERT_TEMBPRVGUPRO(UnIMPACCULTCHIUSO, UnIMPACCULTCONS, UnIMPACCULTSVIL, UnPREVISIONE, UnPREVISIONECONS, UnPREVISIONESVIL, UnSTNINICO, UnSTNINICOCONS, UnSTNINICOSVIL, unIMPEGNABILE, Unesercizio, Unes, Uncapitolo, Unarticolo);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "Insert", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BPR Vg: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void INSERT_TEMBPRVGINVA(IDVariant UnIMPACCULTCHIUSO, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTSVIL, IDVariant UnPREVISIONE, IDVariant UnPREVISIONECONS, IDVariant UnSTNINICO, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICOSVIL, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo, IDVariant unCNUOVO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_TEMPBPRVG, 0);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO, 0, ((UnIMPACCULTCHIUSO.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTCHIUSO));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS, 0, ((UnIMPACCULTCONS.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTCONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL, 0, ((UnIMPACCULTSVIL.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTSVIL));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE, 0, ((UnPREVISIONE.equals((new IDVariant(0))))?(new IDVariant()):UnPREVISIONE));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS, 0, ((UnPREVISIONECONS.equals((new IDVariant())))?(new IDVariant(0)):UnPREVISIONECONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO, 0, ((UnSTNINICO.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICO));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS, 0, ((UnSTNINICOCONS.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICOCONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL, 0, ((UnSTNINICOSVIL.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICOSVIL));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMPEGNABILE, 0, unIMPEGNABILE);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0, Unesercizio);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0, Unes);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0, Uncapitolo);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0, Unarticolo);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ROWNAMESTATU, 0, ((unCNUOVO.equals((new IDVariant("SI"))))?(new IDVariant("I")):(new IDVariant("M"))));
  }

  // **********************************************************************
  // Temp BPR Vg: Update rows
  // Why are you updating these data?
  // **********************************************************************
  private void INSERT_TEMBPRVGUPRO(IDVariant UnIMPACCULTCHIUSO, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTSVIL, IDVariant UnPREVISIONE, IDVariant UnPREVISIONECONS, IDVariant UnPREVISIONESVIL, IDVariant UnSTNINICO, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICOSVIL, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo) throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
    while (!IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
    {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0).equals(Unesercizio, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0).equals(Unes, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0).equals(Uncapitolo, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0).equals(Unarticolo, true))
      {
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO, 0, UnIMPACCULTCHIUSO);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS, 0, UnIMPACCULTCONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL, 0, UnIMPACCULTSVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE, 0, UnPREVISIONE);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS, 0, UnPREVISIONECONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL, 0, UnPREVISIONESVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO, 0, UnSTNINICO);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS, 0, UnSTNINICOCONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL, 0, UnSTNINICOSVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMPEGNABILE, 0, unIMPEGNABILE);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0, Unesercizio);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0, Unes);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0, Uncapitolo);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0, Unarticolo);
      }
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBPRVG, 0);
    }
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
  }

  // **********************************************************************
  // Update Data Temp
  // Allinea i dati dell'imd con la tabella bil
  // aerror:  - Input/Output
  // Aerrormessage:  - Input/Output
  // **********************************************************************
  public int UpdateDataTemp (IDVariant aerror, IDVariant Aerrormessage)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_OUT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FOOTER = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SPAZIVUOTI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SHOWOUT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_OUT = (new IDVariant("Voce P.e.g. ", IDVariant.STRING));
      v_FOOTER = (new IDVariant("non sono stati indicati gli Stanziamenti sulle Unità Organizzative", IDVariant.STRING));
      v_SPAZIVUOTI = (new IDVariant("         ", IDVariant.STRING));
      // 
      // Update Data Temp Body
      // Procedure Body
      // 
      v_OUT = IDL.Add(v_OUT, (new IDVariant("<BR/>")));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        UPDADATATEMP_TEMPBPRVG1();
        while (!IMDB.Eof(IMDBDef11.QRY_TEMPBPRVG1, 0))
        {
          if (IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMESTATU, 0).equals((new IDVariant("I")), true))
          {
            if (HasMoreUO(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC, 0), IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES, 0), IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, 0)))
            {
              v_OUT = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_OUT, v_SPAZIVUOTI), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IDL.ToString(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, 0)))), (new IDVariant("<BR/>")));
              v_SHOWOUT = (new IDVariant(-1));
            }
            SQL = new StringBuffer();
            SQL.append("insert into BPR ");
            SQL.append("( ");
            SQL.append("  ESERCIZIO, ");
            SQL.append("  E_S, ");
            SQL.append("  CAPITOLO, ");
            SQL.append("  ARTICOLO, ");
            SQL.append("  IMP_ACC_ULT_CHIUSO, ");
            SQL.append("  IMP_ACC_ULT_CONS, ");
            SQL.append("  IMP_ACC_ULT_SVIL, ");
            SQL.append("  PREVISIONE, ");
            SQL.append("  PREVISIONE_CONS, ");
            SQL.append("  PREVISIONE_SVIL, ");
            SQL.append("  STN_INI_CO, ");
            SQL.append("  STN_INI_CO_CONS, ");
            SQL.append("  STN_INI_CO_SVIL, ");
            SQL.append("  VARIAZIONI_CO, ");
            SQL.append("  VARIAZIONI_CO_CONS, ");
            SQL.append("  VARIAZIONI_CO_SVIL, ");
            SQL.append("  IMPEGNABILE, ");
            SQL.append("  UTENTE_INSERIMENTO, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCH, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEPREVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRESVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMSTINCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  0, ");
            SQL.append("  0, ");
            SQL.append("  0, ");
            SQL.append("  NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0), ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          if (IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMESTATU, 0).equals((new IDVariant("M")), true))
          {
            SQL = new StringBuffer();
            SQL.append("update BPR set ");
            SQL.append("  ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_CHIUSO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCH, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONAIMACULSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEPREVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMPRESVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMSTINCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_RONASTINCOSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMPEGNABILE = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBPRVG1, IMDBDef11.QSL_TEMPBPRVG1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          IMDB.TblMoveNext(IMDBDef11.QRY_TEMPBPRVG1, 0);
        }
      }
      catch (Exception e7)
      {
        aerror.set((new IDVariant(-1)));
        Aerrormessage.set(new IDVariant(e7.getMessage()));
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      v_OUT = IDL.Add(IDL.Add(v_OUT, v_SPAZIVUOTI), v_FOOTER);
      if (v_SHOWOUT.booleanValue())
      {
        MainFrm.set_AlertMessage(v_OUT); 
      }
      UPDADATATEMP_TEMBPRVGDERO();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "UpdateDataTemp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BPR Vg
  // Which data are you selecting?
  // **********************************************************************
  private void UPDADATATEMP_TEMPBPRVG1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_TEMPBPRVG1);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
    {
      IMDB.TblAddNew(IMDBDef11.QRY_TEMPBPRVG1, 0);
      IMDB.TblLinkRow(IMDBDef11.QRY_TEMPBPRVG1, 0, IMDBDef3.TBL_TEMPBPRVG, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 0, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 1, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 2, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 3, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 4, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMPEGNABILE, 0);
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 5, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 6, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 7, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_STN_INI_CO, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 8, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 9, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 10, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 11, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_PREVISIONE_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 12, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBPRVG1, 13, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_IMP_ACC_ULT_CHIUSO, 0)));
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBPRVG1, 14, 0, IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ROWNAMESTATU, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBPRVG, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_TEMPBPRVG1, 0);
  }

  // **********************************************************************
  // Temp BPR Vg: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UPDADATATEMP_TEMBPRVGDERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBPRVG);
  }

  // **********************************************************************
  // Has More UO
  // la voce peg ha più di una UO associata?
  // unEsercizio:  - Input
  // unES:  - Input
  // unCapitolo:  - Input
  // unArticolo:  - Input
  // **********************************************************************
  private boolean HasMoreUO (IDVariant unEsercizio, IDVariant unES, IDVariant unCapitolo, IDVariant unArticolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMUNITAGEST = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Has More UO Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CAP_UO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(unEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(unES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(unCapitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(unArticolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
      SQL.append("and   (A.SCADENZA > TRUNC( SYSDATE ) OR (A.SCADENZA IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMUNITAGEST = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMUNITAGEST.compareTo((new IDVariant(1)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "HasMoreUO", _e);
      return false;
    }
  }

  // **********************************************************************
  // Delete
  // Explain which processing is carried out by this procedure
  // Unesercizio:  - Input
  // Unes:  - Input
  // Uncapitolo:  - Input
  // Unarticolo:  - Input
  // **********************************************************************
  public int Delete (IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delete Body
      // Procedure Body
      // 
      DELETE_TEMBPRVGDERO(Unesercizio, Unes, Uncapitolo, Unarticolo);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioSimulatoVg", "Delete", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BPR Vg: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void DELETE_TEMBPRVGDERO(IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo) throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBPRVG, 0);
    while (!IMDB.Eof(IMDBDef3.TBL_TEMPBPRVG, 0))
    {
      bDeleted = false;
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ESERCIZIO, 0).equals(Unesercizio, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_E_S, 0).equals(Unes, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_CAPITOLO, 0).equals(Uncapitolo, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBPRVG, IMDBDef3.FLD_TEMPBPRVG_ARTICOLO, 0).equals(Unarticolo, true))
      {
        IMDB.TblDelete(IMDBDef3.TBL_TEMPBPRVG, 0);
        bDeleted = true;
      }
      }
      }
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBPRVG, 0);
    }
  }

  // **********************************************************************
  // Filtri Simulato
  // Primary record source for panel data
  // **********************************************************************
  private void STANBILSIMVG_FILTRISIMUL2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_FILTRISIMUL2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRSIMULVG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_FILTRSIMULVG, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_FILTRISIMUL2_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_FILTRISIMUL2_RS, 0, IMDBDef3.TBL_FILTRSIMULVG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 0, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 1, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMETITOL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 2, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMECATEG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 3, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEFUNZI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 4, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMESERVI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 5, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODINT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRISIMUL2_RS, 6, 0, IMDBDef3.TBL_FILTRSIMULVG, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODTER, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_FILTRSIMULVG, 0);
      if (IMDB.Eof(IMDBDef3.TBL_FILTRSIMULVG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRSIMULVG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_FILTRISIMUL2_RS, 0);
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
  private void PAN_FILTRSIMULVG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRSIMULVG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRSIMULVG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRSIMULVG, Cancel);
    // Stub
  }

  private void PAN_FILTRSIMULVG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRSIMULVG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRSIMULVG_ENTRATASPESA)
      {
        PFL_FILTRSIMULVG_ENTRATASPESA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRSIMULVG_TITOLO)
      {
        PFL_FILTRSIMULVG_TITOLO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRSIMULVG_FUNZIONE)
      {
        PFL_FILTRSIMULVG_FUNZIONE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRSIMULVG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRSIMULVG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_STANZIAMENVG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STANZIAMENVG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_STANZIAMENVG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_STANZIAMENVG_INFOCAPBUTTO)
    {
      this.IdxPanelActived = this.PAN_STANZIAMENVG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_STANZIAMENVG_APRISTAUOEXP)
    {
      this.IdxPanelActived = this.PAN_STANZIAMENVG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriStanziamentiBPRVg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_STANZIAMENVG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_STNINICO)
      {
        PFL_STANZIAMENVG_STNINICO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_STNINICOSVIL)
      {
        PFL_STANZIAMENVG_STNINICOSVIL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_PREVISIONE)
      {
        PFL_STANZIAMENVG_PREVISIONE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_PREVISIOSVIL)
      {
        PFL_STANZIAMENVG_PREVISIOSVIL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_IMPACCULTCHI)
      {
        PFL_STANZIAMENVG_IMPACCULTCHI_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_IMPACCULTSVI)
      {
        PFL_STANZIAMENVG_IMPACCULTSVI_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_STANZIAMENVG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_STN_INI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_PREVISIONE_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_IMP_ACC_ULT_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP9, IMDBDef11.PQSL_CAP9_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_STANZIAMENVG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZIAMENVG_Init()
  {

    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_FIELD, 53);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, "54B9FE7D-004F-465E-92BF-CE4CBC7A3C0D");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, "CAPITOLO  Expression 1");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "D3E594E5-A8DD-4FEA-977C-956B5EF7547B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "ARTICOLO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "FDB8FCA8-D6B2-48FC-9B94-4754A7EA7718");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "DESCRIZIONE ABBREVIATA");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "7FEC1EE1-9902-403E-8E3E-A78DBBF1405A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "INFO CAP Buttonexpression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.VIS_HYPELINKIMMA);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "13DF21AA-AC09-42B6-971C-AE3343AE816F");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "APRI STANZIAMENTI UO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.VIS_HYPELINKIMMA);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "32BB3103-7F1F-430A-A7EE-C970544399BB");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "NUOVO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.VIS_CHECKSTYLE);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "95F3CBB3-BF8A-4A75-8C09-1D1699B826AA");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "STN INI CO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "24371EA4-C549-46C5-8EEB-04AEAC7CB122");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "STN INI CO SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "C4563300-9A77-4E90-B2A3-2650C9514FD5");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "STN INI CO CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "4DB29CFD-D80E-48B2-8257-BCCD8B81E0AF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "PREVISIONE");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "CE5EF29D-E1E2-4B03-8761-FD55BD5A2689");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "05362AAF-DA71-4DAF-9EE4-A8A31513520A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "PREVISIONE CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "90D6FFD6-7358-413C-9B37-1C9E98040467");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "E9B8546D-C1A8-4399-A5DB-16DC6C7F61DA");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "F8BB99EA-9645-42B7-BA37-AD1AC86BCD6E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "112FB331-0970-4AB4-A626-741F4C0FA18E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "Impegnabile");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "3A6BF61A-CFF8-4DF8-BE01-B0B0AB5D9ABF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "NUMRECORDBILUO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "New Sub Query 1");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "7C9DB3C1-946C-4654-875F-6C7A6B375130");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "UNITAGESTIONEVALIDE Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "76462DDB-D724-4C6E-8D0D-94C9AE5975AB");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "TITOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "46FB1213-8F99-488F-8CC5-8099387E2280");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "CATEGORIA");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "2096194D-321C-451D-B20F-C5678FF399A4");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "FUNZIONE");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "674DE6F2-83C7-4998-BE22-8C5AF52EB929");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "SERVIZIO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "149C4FD0-512F-4943-8777-A313E0F8FF9E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "COD INTERVENTO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "7CB07F69-D385-4461-BD31-B09B0DD24F03");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "ESERCIZIO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "83C094A1-51CE-4988-8642-1ACABE21AAB6");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "E S");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "Brief description of field content.");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "FFAFE38C-960B-4DC0-B801-9953255B64DF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "CAPITOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "05518C42-9684-4A8E-B423-FA6C3B8AC51C");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "ARTICOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "24779312-12FA-4CF1-A6E3-D3F4B8CB9B57");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "STATO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "B60981E9-88EB-4794-B4ED-C3EEFBEF6EC1");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "VARIAZIONI CO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, 0, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "136BA376-E1F2-438D-85C9-D911E8AC2119");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "AD807E80-7C8A-4B5C-B77E-52F3B355729C");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "8552EAA0-353A-444A-A760-FC6C6D74EE06");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "ESERCIZIO 1");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, "D72A3A5A-DA3E-4E56-BF99-C826D26CDAC3");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.VIS_VUOTONORMALE);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, "19176970-37B5-44F7-9E31-931345F80EEA");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, "Stanziamenti");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, "5A6A8CDE-D355-424D-897A-CC443CD24155");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, "Previsione");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, "01BD7BB7-510C-4A81-B1B4-06DFFBF2C546");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, "Acc. Ult. Chiuso");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, "AA873957-924F-4A18-BFA1-96C46B1A6E97");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, "EFDA1B27-DCA5-4E22-B0F1-FE9D247CA033");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, "4A2D89A4-731A-462C-AAFB-190558E35DBF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, "2AB76B6C-0A90-4887-B9FE-02D1A656788B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, "Voce P.e.g.");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, "EF771250-C139-4DC8-82A2-5022ADE2467B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, "Stanziamento");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, "31B4DA22-7C43-46DE-84EF-EEE9286C8A93");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, "4B0D47CE-F258-4455-B55A-CB43B1D0707B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, "66BAF206-A366-47E8-92B5-BDC5C18B3513");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, "6BFCD54C-CE88-43C7-97C9-C50C9D260203");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, "Previsione");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, "6860B75E-9708-490F-97FC-4308D02686F4");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, "AC72D15A-0998-4BC5-AE34-9FA18C4F4B37");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, "A811E339-E73F-46D2-A240-398054745940");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, "5FAF6BDA-3D2C-4C06-9FF4-9942E3E226D7");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, "Imp. Ult. Chiuso");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, "5DE8CAA6-C34B-42BF-AD57-5185B0EE5E7B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, "4FB61745-E6B9-4C73-B126-6FA4CE1F7476");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, "B4DD2B97-E29D-4D07-8316-26A1DF9BC4F7");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "A92F2CE5-937C-4342-BC70-D8D89E1D9996");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "CAPITOLO Expression 1");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_STANZIAMENVG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_LIST, 12, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_LIST, "CAP. Expr. 1");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_FORM, 12, 12, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE2, MyGlb.PANEL_FORM, "CAP. Expres. 1");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CAPITOEXPRE2, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_CAPITOEXPRE2, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CAPITOEXPRE2, PPQRY_CAP9, "A.CAPITOLO", "RECOCAPIEXPR", 3, 28, 6, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 56, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, "A. E.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, "ARTIC. Expres.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ARTICOEXPRES, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_ARTICOEXPRES, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ARTICOEXPRES, PPQRY_CAP9, "A.ARTICOLO", "RECOARTIEXPR", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 76, 60, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, "DESCRIZIONE ABBREVIATA");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 4, 136, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, "DESCR. ABBREVIATA");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_DESCRIABBREV, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_DESCRIABBREV, PPQRY_CAP9, "A.DESCRIZIONE_ABBREVIATA", "DESCRIZIONE_ABBREVIATA", 5, 40, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 168, 60, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, "I. C. B.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 4, 40, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, "INFO CAP Buttonexpression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_INFOCAPBUTTO, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_INFOCAPBUTTO, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_INFOCAPBUTTO, PPQRY_CAP9, "'I'", "RECINFCAPBUT", 5, 1, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_INFOCAPBUTTO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_LIST, 188, 60, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_LIST, 184);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_LIST, "A. S. U. E.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_FORM, 4, 88, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_FORM, 188);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_FORM, "APR. STANZIAM. UO Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_APRISTAUOEXP, -1, -1);
    SQL = new StringBuffer();
    SQL.append("CASE WHEN ( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  CAP_UO D ");
  SQL.append("where (D.ESERCIZIO = A.ESERCIZIO AND D.E_S = A.E_S AND D.CAPITOLO = A.CAPITOLO AND D.ARTICOLO = A.ARTICOLO AND D.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
  SQL.append("and   (D.SCADENZA > TRUNC( SYSDATE ) OR (D.SCADENZA IS NULL)) ");
  SQL.append(") > 1 THEN 10 ELSE CASE WHEN ( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  BIL_UO E ");
  SQL.append("where (E.ESERCIZIO = A.ESERCIZIO AND E.E_S = A.E_S AND E.CAPITOLO = A.CAPITOLO AND E.ARTICOLO = A.ARTICOLO) ");
  SQL.append(") > 1 THEN 10 ELSE to_number(NULL) END END");
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_APRISTAUOEXP, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_APRISTAUOEXP, PPQRY_CAP9, SQL.toString(), "RECAPRSTUOEX", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_APRISTAUOEXP, (new IDVariant(10)), "Apri", "", "wsearch.gif", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 216, 60, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, "N. Ex.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 4, 88, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, "NUOVO Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_NUOVOEXPRESS, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_NUOVOEXPRESS, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NUOVOEXPRESS, PPQRY_CAP9, "'NO'", "RECONUOVEXPR", 5, 2, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_NUOVOEXPRESS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_NUOVOEXPRESS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 244, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, "STN INI CO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 4, 112, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, "ST. INI CO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICO, PPQRY_CAP9, "B.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 344, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 4, 136, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, "ST. INI CO SVL.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICOSVIL, PPQRY_CAP9, "B.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 444, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 4, 160, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CNS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICOCONS, PPQRY_CAP9, "B.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 544, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 4, 184, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, "PREVIS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIONE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIONE, PPQRY_CAP9, "B.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 644, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVISIONE SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 208, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 92);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVIS. SVIL");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIOSVIL, PPQRY_CAP9, "B.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 744, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVISIONE CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 4, 232, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVIS. CONS");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIOCONS, PPQRY_CAP9, "B.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 844, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 116);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CHIUSO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 4, 256, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 116);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CH.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTCHI, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTCHI, PPQRY_CAP9, "B.IMP_ACC_ULT_CHIUSO", "IMP_ACC_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 944, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, "IMP ACC ULT SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 4, 280, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, "IM. AC. ULT SVL.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTSVI, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTSVI, PPQRY_CAP9, "B.IMP_ACC_ULT_SVIL", "IMP_ACC_ULT_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 1044, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 104);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 4, 304, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CNS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTCON, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTCON, PPQRY_CAP9, "B.IMP_ACC_ULT_CONS", "IMP_ACC_ULT_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1144, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, "Impegnabile");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 4, 328, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 76);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, "Impegn.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPEGNABILE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPEGNABILE, PPQRY_CAP9, "B.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_LIST, 1304, 60, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_LIST, 160);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_LIST, "NUMRECORDBILUO Expression");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_FORM, 4, 256, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_FORM, 160);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.PANEL_FORM, "NUMRECOR. Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_NUMRECEXPRES, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  BIL_UO F ");
  SQL.append("where (F.ESERCIZIO = A.ESERCIZIO AND B.E_S = A.E_S AND F.CAPITOLO = A.CAPITOLO AND F.ARTICOLO = A.ARTICOLO) ");
  SQL.append(")");
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_NUMRECEXPRES, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NUMRECEXPRES, PPQRY_CAP9, SQL.toString(), "RECONUMREXPR", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_LIST, 1464, 60, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_LIST, 180);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_LIST, "UNITAGESTIONEVALIDE Expression");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_FORM, 4, 256, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_FORM, 180);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.PANEL_FORM, "UNITAGEST. Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_UNITAGEXPRES, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  CAP_UO G ");
  SQL.append("where (G.ESERCIZIO = A.ESERCIZIO AND G.E_S = A.E_S AND G.ARTICOLO = A.ARTICOLO AND G.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
  SQL.append("and   (G.SCADENZA >= TRUNC( SYSDATE ) OR (G.SCADENZA IS NULL)) ");
  SQL.append(")");
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_UNITAGEXPRES, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_UNITAGEXPRES, PPQRY_CAP9, SQL.toString(), "RECOUNITEXPR", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 1304, 60, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 48);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, "TITOLO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 4, 136, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 48);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, "TITOLO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TITOLO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TITOLO1, PPQRY_CAP9, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 1304, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, "CATEG.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 4, 160, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, "CATEG.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CATEGORIA1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CATEGORIA1, PPQRY_CAP9, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 1304, 60, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 4, 184, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_FUNZIONE1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_FUNZIONE1, PPQRY_CAP9, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 1304, 60, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 56);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, "SERV.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 4, 208, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 56);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, "SERV.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_SERVIZIO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_SERVIZIO1, PPQRY_CAP9, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 1304, 60, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, "COD INTERVENTO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 4, 232, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, "COD INTERV.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CODINTERVEN1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CODINTERVEN1, PPQRY_CAP9, "A.COD_INTERVENTO", "COD_INTERVENTO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 1560, 60, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ESERCIZIO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ESERCIZIO, PPQRY_CAP9, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 1560, 60, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 4, 280, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 24);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ES, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ES, PPQRY_CAP9, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_LIST, 1560, 60, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_FORM, 4, 328, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CAPITOLO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CAPITOLO, PPQRY_CAP9, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 1560, 60, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ARTICOLO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ARTICOLO, PPQRY_CAP9, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_LIST, 1268, 60, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_LIST, "STATO Expression");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_FORM, 4, 256, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.PANEL_FORM, "STATO Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STATOEXPRESS, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_STATOEXPRESS, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STATOEXPRESS, PPQRY_CAP9, "NULL", "RECOSTATEXPR", 5, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 0, 60, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZIONI CO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 256, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZ. CO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZIONICO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZIONICO, PPQRY_CAP9, "B.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 0, 60, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZIONI CO CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 4, 280, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 120);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZ. CO CONS");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZCOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZCOCONS, PPQRY_CAP9, "B.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 0, 60, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZIONI CO SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 4, 304, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZCOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZCOSVIL, PPQRY_CAP9, "B.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO 1");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 328, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC. 1");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ESERCIZIO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ESERCIZIO1, PPQRY_CAP9, "B.ESERCIZIO", "RECORDBPRESE", 1, 4, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 644, 16, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 704, 92, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_NASENTINULAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NASENTINULAB, -1, "", "NASENTINULAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 296, 12, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 428, 92, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STANENTRLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STANENTRLABE, -1, "", "STANENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 396, 12, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 500, 88, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVENTRLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVENTRLABE, -1, "", "PREVENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 444, 16, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 568, 92, 56, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ACCULTCHENLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ACCULTCHENLA, -1, "", "ACCULTCHENLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 396, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 496, 84, 28, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TOTAENTRLAB1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TOTAENTRLAB1, -1, "", "TOTAENTRLAB1", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 296, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 384, 80, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TOTAENTRLAB2, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TOTAENTRLAB2, -1, "", "TOTAENTRLAB2", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_LIST, 444, 36, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_FORM, 564, 92, 40, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TOTAENTRLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TOTAENTRLABE, -1, "", "TOTAENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 12, 12, 284, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_LIST, 2);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 12, 8, 172, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VOCEPEGLABEL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 244, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 392, 12, 272, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STANSPESLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STANSPESLABE, -1, "", "STANSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 244, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 408, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STATOTSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STATOTSPELAB, -1, "", "STATOTSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 344, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 504, 104, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STASVISPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STASVISPELAB, -1, "", "STASVISPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 444, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 596, 104, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STACONSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STACONSPELAB, -1, "", "STACONSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 544, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 436, 84, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVSPESLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVSPESLABE, -1, "", "PREVSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 544, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 444, 120, 48, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRETOTSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRETOTSPELAB, -1, "", "PRETOTSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 744, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 536, 116, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRECONSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRECONSPELAB, -1, "", "PRECONSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 644, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 624, 108, 56, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRESVISPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRESVISPELAB, -1, "", "PRESVISPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 844, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 632, 116, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPULTCHSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPULTCHSPLA, -1, "", "IMPULTCHSPLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 844, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 724, 116, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHTOSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHTOSPLA, -1, "", "IMULCHTOSPLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 944, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 824, 112, 56, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHSPSVLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHSPSVLA, -1, "", "IMULCHSPSVLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 1044, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 912, 112, 48, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHCOSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHCOSPLA, -1, "", "IMULCHCOSPLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 0, 48, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 124);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, "CAPITOLO Expression 1");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 4, 160, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 124);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, "CAPIT. Expression 1");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CAPITOEXPRE1, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_CAPITOEXPRE1, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CAPITOEXPRE1, PPQRY_CAP9, "A.CAPITOLO", "RECOCAPIEXP1", 3, 28, 6, -13997);
  }

  private void PAN_STANZIAMENVG_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STANZIAMENVG.SetIMDB(IMDB, "PQRY_CAP9", true);
    PAN_STANZIAMENVG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as RECOCAPIEXPR, ");
    SQL.append("  A.ARTICOLO as RECOARTIEXPR, ");
    SQL.append("  'I' as RECINFCAPBUT, ");
    SQL.append("  CASE WHEN ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  CAP_UO D ");
    SQL.append("where (D.ESERCIZIO = A.ESERCIZIO AND D.E_S = A.E_S AND D.CAPITOLO = A.CAPITOLO AND D.ARTICOLO = A.ARTICOLO AND D.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (D.SCADENZA > TRUNC( SYSDATE ) OR (D.SCADENZA IS NULL)) ");
    SQL.append(") > 1 THEN 10 ELSE CASE WHEN ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  BIL_UO E ");
    SQL.append("where (E.ESERCIZIO = A.ESERCIZIO AND E.E_S = A.E_S AND E.CAPITOLO = A.CAPITOLO AND E.ARTICOLO = A.ARTICOLO) ");
    SQL.append(") > 1 THEN 10 ELSE to_number(NULL) END END as RECAPRSTUOEX, ");
    SQL.append("  'NO' as RECONUOVEXPR, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  B.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  B.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  B.PREVISIONE as PREVISIONE, ");
    SQL.append("  B.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  B.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  B.IMP_ACC_ULT_CHIUSO as IMP_ACC_ULT_CHIUSO, ");
    SQL.append("  B.IMP_ACC_ULT_SVIL as IMP_ACC_ULT_SVIL, ");
    SQL.append("  B.IMP_ACC_ULT_CONS as IMP_ACC_ULT_CONS, ");
    SQL.append("  B.IMPEGNABILE as IMPEGNABILE, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.COD_INTERVENTO as COD_INTERVENTO, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  BIL_UO F ");
    SQL.append("where (F.ESERCIZIO = A.ESERCIZIO AND B.E_S = A.E_S AND F.CAPITOLO = A.CAPITOLO AND F.ARTICOLO = A.ARTICOLO) ");
    SQL.append(") as RECONUMREXPR, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  CAP_UO G ");
    SQL.append("where (G.ESERCIZIO = A.ESERCIZIO AND G.E_S = A.E_S AND G.ARTICOLO = A.ARTICOLO AND G.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (G.SCADENZA >= TRUNC( SYSDATE ) OR (G.SCADENZA IS NULL)) ");
    SQL.append(") as RECOUNITEXPR, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  NULL as RECOSTATEXPR, ");
    SQL.append("  B.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  B.VARIAZIONI_CO_CONS as VARIAZIONI_CO_CONS, ");
    SQL.append("  B.VARIAZIONI_CO_SVIL as VARIAZIONI_CO_SVIL, ");
    SQL.append("  B.ESERCIZIO as RECORDBPRESE, ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
    SQL.append("  A.CAPITOLO as RECOCAPIEXP1 ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BPR B ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = B.ESERCIZIO(+) AND A.E_S = B.E_S(+) AND A.CAPITOLO = B.CAPITOLO(+) AND A.ARTICOLO = B.ARTICOLO(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CAPITOLO > 0 OR (A.CAPITOLO = 0 AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.ESERCIZIO ");
    SQL.append("from ");
    SQL.append("  CAP C ");
    SQL.append("where (C.ESERCIZIO = A.ESERCIZIO AND C.E_S = A.E_S AND C.CAPITOLO <> 0) ");
    SQL.append("))))) ");
    SQL.append("and   (A.E_S = ~~PQRY_FILTRISIMUL2.ROWNAMEENTRA~~) ");
    SQL.append("and   (NVL(A.TITOLO, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMETITOL~~, NVL(A.TITOLO, -1))) ");
    SQL.append("and   (NVL(A.CATEGORIA, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMECATEG~~, NVL(A.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(A.FUNZIONE, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMEFUNZI~~, NVL(A.FUNZIONE, -1))) ");
    SQL.append("and   (NVL(A.SERVIZIO, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMESERVI~~, NVL(A.SERVIZIO, -1))) ");
    SQL.append("and   (NVL(A.COD_INTERVENTO, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMCODINT~~, NVL(A.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(A.COD_TERZI, -1) = NVL(~~PQRY_FILTRISIMUL2.ROWNAMCODTER~~, NVL(A.COD_TERZI, -1))) ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 2 ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP9, 5, SQL, -1, "");
    PAN_STANZIAMENVG.SetQueryDB(PPQRY_CAP9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMENVG.SetMasterTable(0, "CAP");
    PAN_STANZIAMENVG.AddToSortList(PFL_STANZIAMENVG_CAPITOEXPRE2, true);
    PAN_STANZIAMENVG.AddToSortList(PFL_STANZIAMENVG_ARTICOEXPRES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZIAMENVG.Status() == 2)
    {
      int oldListQBE = PAN_STANZIAMENVG.iUseListQBE;
      PAN_STANZIAMENVG.iUseListQBE = 0;
      PAN_STANZIAMENVG.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZIAMENVG.PanelCommand(Glb.PCM_FIND);
      PAN_STANZIAMENVG.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRSIMULVG_Init()
  {

    PAN_FILTRSIMULVG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRSIMULVG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRSIMULVG.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, "36AE607F-7D91-45F9-8339-08C80C1646B8");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, "Entrataspesa");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, "62C59D15-19E1-4FE4-8C17-AF7932240382");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, "Titolo");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, "541C5CF2-CB76-43E5-BA87-4F51939464D4");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, "Categoria");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, "CBF14172-2A6E-4D9A-962F-DE6F9EC8F6C0");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, "Funzione");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, "6089AC6C-F7F1-4224-971E-97F2D7F3BFC4");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, "Servizio");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, "298F7DDA-4F73-423A-9E93-2926892D89F1");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, "Cod. Intervento");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRSIMULVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, "C514AB2A-A2DD-4EEF-B855-F66FCAC5F53D");
    PAN_FILTRSIMULVG.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, "Cod. Terzi");
    PAN_FILTRSIMULVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, "");
    PAN_FILTRSIMULVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRSIMULVG.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRSIMULVG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrataspesa");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_FORM, 12, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_FORM, 88);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrataspesa");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_ENTRATASPESA, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_ENTRATASPESA, PPQRY_FILTRISIMUL2, "A.ROWNAMEENTRA", "ROWNAMEENTRA", 5, 1, 0, -13997);
    PAN_FILTRSIMULVG.SetValueListItem(PFL_FILTRSIMULVG_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRSIMULVG.SetValueListItem(PFL_FILTRSIMULVG_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_LIST, 52);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_FORM, 40, 32, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_FORM, 52);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_TITOLO, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_TITOLO, PPQRY_FILTRISIMUL2, "A.ROWNAMETITOL", "ROWNAMETITOL", 1, 2, 0, -13997);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_LIST, 72);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_FORM, 396, 32, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_CATEGORIA, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_CATEGORIA, PPQRY_FILTRISIMUL2, "A.ROWNAMECATEG", "ROWNAMECATEG", 1, 2, 0, -13997);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_LIST, 68);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_FORM, 396, 32, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_FORM, 64);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_FUNZIONE, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_FUNZIONE, PPQRY_FILTRISIMUL2, "A.ROWNAMEFUNZI", "ROWNAMEFUNZI", 1, 2, 0, -13997);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_LIST, 60);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_FORM, 36, 60, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_SERVIZIO, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_SERVIZIO, PPQRY_FILTRISIMUL2, "A.ROWNAMESERVI", "ROWNAMESERVI", 1, 2, 0, -13997);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_LIST, 100);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_LIST, "Cod. Intervento");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_FORM, 356, 60, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_FORM, 104);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODINTERVENT, MyGlb.PANEL_FORM, "Cod. Intervento");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_CODINTERVENT, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_CODINTERVENT, PPQRY_FILTRISIMUL2, "A.ROWNAMCODINT", "ROWNAMCODINT", 1, 2, 0, -13997);
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_LIST, 56);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_LIST, "Cod. Terzi");
    PAN_FILTRSIMULVG.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_FORM, 396, 32, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRSIMULVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_FORM, 64);
    PAN_FILTRSIMULVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_FILTRSIMULVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRSIMULVG_CODTERZI, MyGlb.PANEL_FORM, "Cod. Terzi");
    PAN_FILTRSIMULVG.SetFieldPage(PFL_FILTRSIMULVG_CODTERZI, -1, -1);
    PAN_FILTRSIMULVG.SetFieldPanel(PFL_FILTRSIMULVG_CODTERZI, PPQRY_FILTRISIMUL2, "A.ROWNAMCODTER", "ROWNAMCODTER", 1, 2, 0, -13997);
  }

  private void PAN_FILTRSIMULVG_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRSIMULVG.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.E_S = ~~ROWNAMEENTRA~~) ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_FILTRSIMULVG_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = ~~ROWNAMEENTRA~~) ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_FILTRSIMULVG_TITOLO, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGNEWEXPR ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.CATEGORIA = ~~ROWNAMECATEG~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CATEGORIA ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_CATEGORIE, 0, SQL, PFL_FILTRSIMULVG_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGNEWEXPR ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CATEGORIA ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_CATEGORIE, 1, SQL, PFL_FILTRSIMULVG_CATEGORIA, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_CATEGORIE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_FUNZIONI, 0, SQL, PFL_FILTRSIMULVG_FUNZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_FUNZIONI, 1, SQL, PFL_FILTRSIMULVG_FUNZIONE, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_FUNZIONI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMESERVI~~) ");
    SQL.append("and   (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_SERVIZI, 0, SQL, PFL_FILTRSIMULVG_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_SERVIZI, 1, SQL, PFL_FILTRSIMULVG_SERVIZIO, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_SERVIZI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.INTERVENTO = ~~ROWNAMCODINT~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("order by ");
    SQL.append("  A.INTERVENTO ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_INTERVENTI, 0, SQL, PFL_FILTRSIMULVG_CODINTERVENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("order by ");
    SQL.append("  A.INTERVENTO ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_INTERVENTI, 1, SQL, PFL_FILTRSIMULVG_CODINTERVENT, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_INTERVENTI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTERDESCRI ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.CAPITOLO = ~~ROWNAMCODTER~~) ");
    SQL.append("and   (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_CAPTER, 0, SQL, PFL_FILTRSIMULVG_CODTERZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTERDESCRI ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRSIMULVG.SetQuery(PPQRY_CAPTER, 1, SQL, PFL_FILTRSIMULVG_CODTERZI, "");
    PAN_FILTRSIMULVG.SetQueryDB(PPQRY_CAPTER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRSIMULVG.SetIMDB(IMDB, "PQRY_FILTRISIMUL2", true);
    PAN_FILTRSIMULVG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRSIMULVG.SetQueryIMDB(PPQRY_FILTRISIMUL2, IMDBDef11.PQRY_FILTRISIMUL2_RS, IMDBDef3.TBL_FILTRSIMULVG);
    JustLoaded = true;
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_ENTRATASPESA, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEENTRA);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_TITOLO, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMETITOL);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_CATEGORIA, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMECATEG);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_FUNZIONE, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMEFUNZI);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_SERVIZIO, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMESERVI);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_CODINTERVENT, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODINT);
    PAN_FILTRSIMULVG.SetFieldPrimaryIndex(PFL_FILTRSIMULVG_CODTERZI, IMDBDef3.FLD_FILTRSIMULVG_ROWNAMCODTER);
    PAN_FILTRSIMULVG.SetMasterTable(0, "FILTRSIMULVG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRSIMULVG.Status() == 2)
    {
      int oldListQBE = PAN_FILTRSIMULVG.iUseListQBE;
      PAN_FILTRSIMULVG.iUseListQBE = 0;
      PAN_FILTRSIMULVG.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRSIMULVG.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRSIMULVG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRSIMULVG) PAN_FILTRSIMULVG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRSIMULVG) PAN_FILTRSIMULVG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_DynamicProperties();
    if (SrcObj == PAN_FILTRSIMULVG) PAN_FILTRSIMULVG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRSIMULVG) PAN_FILTRSIMULVG_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_OnChangeRow();
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
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRSIMULVG) PAN_FILTRSIMULVG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
  }

  public void OnPreview(OBook SrcObj)
  {
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
