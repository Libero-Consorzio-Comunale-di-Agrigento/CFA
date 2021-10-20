// **********************************************
// Stanziamenti Bilancio Effettivo Vg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiBilancioEffettivoVg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRI_ENTRATASPESA = 0;
  private static int PFL_FILTRI_TITOLO = 1;
  private static int PFL_FILTRI_CATEGORIA = 2;
  private static int PFL_FILTRI_FUNZIONE = 3;
  private static int PFL_FILTRI_SERVIZIO = 4;
  private static int PFL_FILTRI_CODINTERVENT = 5;
  private static int PFL_FILTRI_CODTERZI = 6;

  private static int PPQRY_FILTREFFETV1 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_CATEGORIE = 2;
  private static int PPQRY_FUNZIONI = 3;
  private static int PPQRY_SERVIZI = 4;
  private static int PPQRY_INTERVENTI = 5;
  private static int PPQRY_CAPTER = 6;


  IDPanel PAN_FILTRI;
  private static int PFL_STANZIAMENVG_CAPITOEXPRE1 = 0;
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

  private static int PPQRY_CAP11 = 0;


  IDPanel PAN_STANZIAMENVG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_TEMPBIL4(IMDB);
    //
    //
    Init_PQRY_CAP11(IMDB);
    Init_PQRY_FILTREFFETV1(IMDB);
    Init_PQRY_FILTREFFETV1_RS(IMDB);
    Init_QRY_CFASELINTV80(IMDB);
    Init_QRY_CFASELINTV81(IMDB);
    Init_QRY_TEMPBIL1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_TEMPBIL4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_TEMPBIL4, 16);
    IMDB.set_TblCode(IMDBDef3.TBL_TEMPBIL4, "TBL_TEMPBIL4");
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ROWNAMESTATU,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ROWNAMECNUOV, "ROWNAMECNUOV");
    IMDB.SetFldParams(IMDBDef3.TBL_TEMPBIL4,IMDBDef3.FLD_TEMPBIL4_ROWNAMECNUOV,5,49,0);
  }

  private static void Init_PQRY_CAP11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAP11, 33);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAP11, "PQRY_CAP11");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOCAPIEXPR, "RECOCAPIEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOCAPIEXPR,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOARTIEXPR, "RECOARTIEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOARTIEXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECINFCAPBUT, "RECINFCAPBUT");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECINFCAPBUT,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECAPRSTUOEX, "RECAPRSTUOEX");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECAPRSTUOEX,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECONUOVEXPR, "RECONUOVEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECONUOVEXPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECONUMREXPR, "RECONUMREXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECONUMREXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOUNITEXPR, "RECOUNITEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOUNITEXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOSTATEXPR, "RECOSTATEXPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECOSTATEXPR,5,0,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECORDBILESE, "RECORDBILESE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_RECORDBILESE,3,12,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP11,IMDBDef11.PQSL_CAP11_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAP11, 0);
  }

  private static void Init_PQRY_FILTREFFETV1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTREFFETV1, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTREFFETV1, "PQRY_FILTREFFETV1");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FILTREFFETV1, 0);
  }

  private static void Init_PQRY_FILTREFFETV1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTREFFETV1_RS, 7);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTREFFETV1_RS, "PQRY_FILTREFFETV1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, "ROWNAMEENTRA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTREFFETV1_RS,IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER,1,2,0);
  }

  private static void Init_QRY_CFASELINTV80(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_CFASELINTV80, 1);
    IMDB.set_TblCode(IMDBDef11.QRY_CFASELINTV80, "QRY_CFASELINTV80");
    IMDB.set_FldCode(IMDBDef11.QRY_CFASELINTV80,IMDBDef11.QSL_CFASELINTV80_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef11.QRY_CFASELINTV80,IMDBDef11.QSL_CFASELINTV80_COUNT,1,19,0);
  }

  private static void Init_QRY_CFASELINTV81(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_CFASELINTV81, 1);
    IMDB.set_TblCode(IMDBDef11.QRY_CFASELINTV81, "QRY_CFASELINTV81");
    IMDB.set_FldCode(IMDBDef11.QRY_CFASELINTV81,IMDBDef11.QSL_CFASELINTV81_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef11.QRY_CFASELINTV81,IMDBDef11.QSL_CFASELINTV81_ROWNAMEESERC,3,12,0);
  }

  private static void Init_QRY_TEMPBIL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_TEMPBIL1, 15);
    IMDB.set_TblCode(IMDBDef11.QRY_TEMPBIL1, "QRY_TEMPBIL1");
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC,3,12,0);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEIMPEG,3,14,2);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONASTINCOSV, "RONASTINCOSV");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONASTINCOSV,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONASTINCOCO, "RONASTINCOCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONASTINCOCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMSTINCO, "ROWNAMSTINCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMSTINCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMPRESVI, "ROWNAMPRESVI");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMPRESVI,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEPREVI, "ROWNAMEPREVI");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMEPREVI,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULSV, "RONAIMACULSV");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULSV,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMPRECON, "ROWNAMPRECON");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMPRECON,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULCO, "RONAIMACULCO");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULCO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULCH, "RONAIMACULCH");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_RONAIMACULCH,3,28,6);
    IMDB.set_FldCode(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMESTATU, "ROWNAMESTATU");
    IMDB.SetFldParams(IMDBDef11.QRY_TEMPBIL1,IMDBDef11.QSL_TEMPBIL1_ROWNAMESTATU,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiBilancioEffettivoVg(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiBilancioEffettivoVg()
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
    FormIdx = MyGlb.FRM_STANBILEFFVG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "80979A9C-0480-4E59-8023-87A34226CC6C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 538;
    set_Caption(new IDVariant("Stanziamenti Bilancio Effettivo Vg"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 512;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.226563;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 792;
    Frames[2].Height = 116;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 116;
    PAN_FILTRI = new IDPanel(w, this, 2, "PAN_FILTRI");
    Frames[2].Content = PAN_FILTRI;
    PAN_FILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRI.VS = MainFrm.VisualStyleList;
    PAN_FILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1B9FA0B0-5B85-440C-920D-798C5702BB1A");
    PAN_FILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1420, 308, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRI.InitStatus = 2;
    PAN_FILTRI_Init();
    PAN_FILTRI_InitFields();
    PAN_FILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 792;
    Frames[3].Height = 396;
    Frames[3].Caption = "Stanziamenti Vg";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 396;
    PAN_STANZIAMENVG = new IDPanel(w, this, 3, "PAN_STANZIAMENVG");
    Frames[3].Content = PAN_STANZIAMENVG;
    PAN_STANZIAMENVG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIAMENVG.VS = MainFrm.VisualStyleList;
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 396-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "09FF4E3D-7FAF-43C1-A368-41517A70A56D");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 12, 1224, 248, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_DELETE2+BaseCmdLinIdx)
      {
        DeleteActiveRow();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA5+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef3.TBL_FILTREFFETVG, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STANBILEFFVG_FILTREFFETV1();
      }
      PAN_STANZIAMENVG.UpdatePanel(MainFrm);
      PAN_FILTRI.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiBilancioEffettivoVg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiBilancioEffettivoVg.class.getName() : (Glb.ClassWithPackage(StanziamentiBilancioEffettivoVg.class) ? StanziamentiBilancioEffettivoVg.class.getName().substring(StanziamentiBilancioEffettivoVg.class.getPackage().getName().length() + 1) : StanziamentiBilancioEffettivoVg.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiIMPACCULTSVILValidateEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiIMPACCULTCHIUSOValidateEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiPREVISIONESVILValidateEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiPREVISIONEValidateEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0)));
        PAN_STANZIAMENVG.set_FieldText(PFL_STANZIAMENVG_STASVISPELAB, IDL.ToString(PAN_STANZIAMENVG.GetFieldSum(PFL_STANZIAMENVG_STNINICOSVIL)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiSTNINICOSVILValidateEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUOVEXPR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant("M")));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0)));
        PAN_STANZIAMENVG.set_FieldText(PFL_STANZIAMENVG_STATOTSPELAB, IDL.ToString(PAN_STANZIAMENVG.GetFieldSum(PFL_STANZIAMENVG_STNINICO)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiSTNINICOValidateEvent", _e);
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
      v_NOMEFORM = (new IDVariant("Stanziamenti Bilancio Effettivo", IDVariant.STRING));
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
      // setto variabile gestione impegnabile
      // 
      {
      }
      // 
      // inizliazzo alcune variabili, sono utilizzate nell'After Find per andare in modalità QBE alla prima visualizzazione del pannello
      // 
      {
        LOADEVENT_TEMBILDELROW();
      }
      PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Temp BIL: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_TEMBILDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBIL4);
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
      UNLOADEVENT_FILTEFFVGDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Effettivo Vg: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_FILTEFFVGDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMETITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMECATEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEFUNZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMESERVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODINT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODTER, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_STANZIAMUOVG)), true) && Result.booleanValue())
      {
        Delete(new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0));
        // 
        // controllo se ci sono altre righe che non sono state salvate per vedere se fare il refreshquery o no
        // 
        {
          IDVariant v_NOROWS = new IDVariant(0,IDVariant.INTEGER);
          ENDMODALEVEN_CFASELINTV80();
          if (!IMDB.Eof(IMDBDef11.QRY_CFASELINTV80, 0))
          {
            v_NOROWS = IMDB.Value(IMDBDef11.QRY_CFASELINTV80, IMDBDef11.QSL_CFASELINTV80_COUNT, 0, IDVariant.INTEGER) ;
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void ENDMODALEVEN_CFASELINTV80() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_CFASELINTV80);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBIL4, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
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
              IMDB.TblAddNew(IMDBDef11.QRY_CFASELINTV80, 0);
              IMDB.set_Value(IMDBDef11.QRY_CFASELINTV80, 0, 0, new IDVariant(AggrBuff[0]));
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
    IMDB.TblMoveFirst(IMDBDef11.QRY_CFASELINTV80, 0);
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
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DELETE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
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
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          // }
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DELETE2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          // 
          // campi del pannello filtri disabilitati
          // 
          // {
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            // PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgOnChangeStatusEvent", _e);
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
        if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("S")), true))
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
        if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
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
        if (IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOUNITEXPR, 0).compareTo((new IDVariant(1)), true)>0 || (IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOUNITEXPR, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECONUMREXPR, 0).compareTo((new IDVariant(0)), true)>0))
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECAPRSTUOEX, 0, (new IDVariant(10)));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECAPRSTUOEX, 0, (new IDVariant()));
        }
      }
      PAN_STANZIAMENVG.set_ToolTip(Glb.OBJ_FIELD,PFL_STANZIAMENVG_DESCRIABBREV,(new IDVariant(PAN_STANZIAMENVG.FieldText(PFL_STANZIAMENVG_DESCRIABBREV))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgOnDynamicPropertiesEvent", _e);
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
      Insert(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMPEGNABILE, 0), new IDVariant(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0), ((IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0).equals((new IDVariant())))?(new IDVariant("SI")):(new IDVariant("NO"))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgOnValidateRowEvent", _e);
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
      // controllo se è una nuova riga per quanto riguarda bil
      // 
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DELETE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DELETE2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgOnChangeRowEvent", _e);
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
        PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
        STAVGONCOMEV_TEMBILDELROW();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Temp BIL: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void STAVGONCOMEV_TEMBILDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBIL4);
  }

  // **********************************************************************
  // Stanziamenti Vg Before Delete Event
  // Evento notificato dal pannello prima di eseguire la
  // cancellazione di una riga del pannello.
  // Cancel: Se impostato a True non effettua la cancellazione della riga. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMENVG_BeforeDelete(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti Vg Before Delete Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiVgBeforeDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti STN INI CO CONS Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMENVG_STNINICOCONS_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti STN INI CO CONS Validate Event Body
      // Procedure Body
      // 
      PAN_STANZIAMENVG.set_FieldText(PFL_STANZIAMENVG_STATOTSPELAB, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "StanziamentiSTNINICOCONSValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRI);
      // 
      // Filtri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        // 
        // condizioni di visibilità dei componenti del pannello Filtri
        // 
        {
          PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if ((IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
          {
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODTERZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
          PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).compareTo((new IDVariant(4)), true)!=0)
          {
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODTERZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_CODTERZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
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
      VisibilitaEtichette();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "FiltriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Entrataspesa Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRI_ENTRATASPESA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Entrataspesa Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, 0, (new IDVariant()));
        if ((IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, 0, (new IDVariant()));
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
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).compareTo((new IDVariant(4)), true)!=0)
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, 0, (new IDVariant()));
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "FiltriEntrataspesaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Titolo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRI_TITOLO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Titolo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, 0, (new IDVariant()));
      }
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, 0, (new IDVariant()));
        if ((IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(5)), true) && MainFrm.TIPOENTE.equals((new IDVariant("M")), true)) || IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(6)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, 0, (new IDVariant()));
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMECATEG, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMETITOL, 0).equals((new IDVariant(4)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODINT, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMCODTER, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "FiltriTitoloValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri Funzione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRI_FUNZIONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Funzione Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEFUNZI, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMESERVI, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "FiltriFunzioneValidateEvent", _e);
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
        // if (IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0).equals((new IDVariant("I")), true))
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
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  0, ");
          // SQL.append("  0, ");
          // SQL.append("  0, ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  TRUNC( SYSDATE ), ");
          // SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMPEGNABILE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          // SQL.append(") ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant()));
        // }
        // if (IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0).equals((new IDVariant("M")), true))
        // {
          // SQL = new StringBuffer();
          // SQL.append("update BIL set ");
          // SQL.append("  IMP_ACC_ULT_CHIUSO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMP_ACC_ULT_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMP_ACC_ULT_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  PREVISIONE_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  STN_INI_CO_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  IMPEGNABILE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMPEGNABILE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          // SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
          // SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   (ARTICOLO = ARTICOLO) ");
          // MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          // IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant()));
        // }
      // }
      // catch (Exception e7)
      // {
        // MainFrm.set_AlertMessage(new IDVariant(e7.getMessage())); 
        // PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
        // MainFrm.Cf4armDBObject.RollbackTrans();
        // return 0;
      // }
      // IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECOSTATEXPR, 0, (new IDVariant()));
      // MainFrm.Cf4armDBObject.CommitTrans();
      // PAN_STANZIAMENVG.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "SaveActiveRow", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0)))
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
        MainFrm.Cf4armDBObject.BILPD(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0));
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
            SQL.append("delete from BIL ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "DeleteActiveRow", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stanziamenti UO Vg
  // salva la riga attiva
  // **********************************************************************
  public int ApriStanziamentiUOVg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stanziamenti UO Vg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_RECORDBILESE, 0))) && new IDVariant(PAN_STANZIAMENVG.Status()).equals((new IDVariant(2)), true))
      {
        // 
        // inizializzazione parametri
        // 
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEESERC, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ESERCIZIO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEPREVI, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMESTANZ, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_RONAIMACULCT, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0));
        }
        MainFrm.Show(MyGlb.FRM_STANZIAMUOVG, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "ApriStanziamentiUOVg", _e);
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
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      }
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "ApriInfo", _e);
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "Salva", _e);
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
                PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
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
              PAN_STANZIAMENVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_STANZIAMENVG.ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "SistemaEtichette", _e);
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
      if (IMDB.Value(IMDBDef11.PQRY_FILTREFFETV1, IMDBDef11.PQSL_FILTREFFETV1_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
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
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_STANZIAMENVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
        // gestione impegnabile Spesa
        // 
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
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "VisibilitaEtichette", _e);
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
      ISPRESENT_CFASELINTV81(unEsercizio, unES, unCapitolo, unArticolo);
      if (!IMDB.Eof(IMDBDef11.QRY_CFASELINTV81, 0))
      {
        v_PRESENT = IMDB.Value(IMDBDef11.QRY_CFASELINTV81, IMDBDef11.QSL_CFASELINTV81_ROWNAMEESERC, 0, IDVariant.DECIMAL) ;
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "IsPresent", _e);
      return false;
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void ISPRESENT_CFASELINTV81(IDVariant unEsercizio, IDVariant unES, IDVariant unCapitolo, IDVariant unArticolo) throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_CFASELINTV81);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
    {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0).equals(unEsercizio, true))
      {
        if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0).equals(unES, true))
        {
          if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0).equals(unCapitolo, true))
          {
            if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0).equals(unArticolo, true))
            {
              IMDB.TblAddNew(IMDBDef11.QRY_CFASELINTV81, 0);
              IMDB.TblLinkRow(IMDBDef11.QRY_CFASELINTV81, 0, IMDBDef3.TBL_TEMPBIL4, 0);
              IMDB.TblLinkField(IMDBDef11.QRY_CFASELINTV81, 0, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0);
            }
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBIL4, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_CFASELINTV81, 0);
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
  // Un Capitolo:  - Input
  // Unarticolo:  - Input
  // unCNUOVO:  - Input
  // **********************************************************************
  public int Insert (IDVariant UnSTNINICOSVIL, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICO, IDVariant UnPREVISIONESVIL, IDVariant UnPREVISIONECONS, IDVariant UnPREVISIONE, IDVariant UnIMPACCULTSVIL, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTCHIUSO, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant UnCapitolo, IDVariant Unarticolo, IDVariant unCNUOVO)
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
      if (!(IsPresent(Unesercizio, Unes, UnCapitolo, Unarticolo)))
      {
        // 
        // piccola curiosità: come mai togliendo ifequal a runtime
        // ottengo index of boundd ??
        // 
        INSERT_TEMBILINSVAL(UnIMPACCULTCHIUSO, UnIMPACCULTCONS, UnIMPACCULTSVIL, UnPREVISIONE, UnPREVISIONECONS, UnSTNINICO, UnSTNINICOCONS, UnSTNINICOSVIL, unIMPEGNABILE, Unesercizio, Unes, UnCapitolo, Unarticolo, unCNUOVO);
      }
      else
      {
        INSERT_TEMBILUPDROW(UnIMPACCULTCHIUSO, UnIMPACCULTCONS, UnIMPACCULTSVIL, UnPREVISIONE, UnPREVISIONECONS, UnPREVISIONESVIL, UnSTNINICO, UnSTNINICOCONS, UnSTNINICOSVIL, unIMPEGNABILE, Unesercizio, Unes, UnCapitolo, Unarticolo);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "Insert", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BIL: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void INSERT_TEMBILINSVAL(IDVariant UnIMPACCULTCHIUSO, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTSVIL, IDVariant UnPREVISIONE, IDVariant UnPREVISIONECONS, IDVariant UnSTNINICO, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICOSVIL, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant UnCapitolo, IDVariant Unarticolo, IDVariant unCNUOVO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_TEMPBIL4, 0);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO, 0, ((UnIMPACCULTCHIUSO.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTCHIUSO));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS, 0, ((UnIMPACCULTCONS.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTCONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL, 0, ((UnIMPACCULTSVIL.equals((new IDVariant())))?(new IDVariant(0)):UnIMPACCULTSVIL));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE, 0, ((UnPREVISIONE.equals((new IDVariant(0))))?(new IDVariant()):UnPREVISIONE));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS, 0, ((UnPREVISIONECONS.equals((new IDVariant())))?(new IDVariant(0)):UnPREVISIONECONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO, 0, ((UnSTNINICO.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICO));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS, 0, ((UnSTNINICOCONS.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICOCONS));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL, 0, ((UnSTNINICOSVIL.equals((new IDVariant())))?(new IDVariant(0)):UnSTNINICOSVIL));
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMPEGNABILE, 0, unIMPEGNABILE);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0, Unesercizio);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0, Unes);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0, UnCapitolo);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0, Unarticolo);
    IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ROWNAMESTATU, 0, ((unCNUOVO.equals((new IDVariant("SI"))))?(new IDVariant("I")):(new IDVariant("M"))));
  }

  // **********************************************************************
  // Temp BIL: Update rows
  // Why are you updating these data?
  // **********************************************************************
  private void INSERT_TEMBILUPDROW(IDVariant UnIMPACCULTCHIUSO, IDVariant UnIMPACCULTCONS, IDVariant UnIMPACCULTSVIL, IDVariant UnPREVISIONE, IDVariant UnPREVISIONECONS, IDVariant UnPREVISIONESVIL, IDVariant UnSTNINICO, IDVariant UnSTNINICOCONS, IDVariant UnSTNINICOSVIL, IDVariant unIMPEGNABILE, IDVariant Unesercizio, IDVariant Unes, IDVariant UnCapitolo, IDVariant Unarticolo) throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
    while (!IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
    {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0).equals(Unesercizio, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0).equals(Unes, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0).equals(UnCapitolo, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0).equals(Unarticolo, true))
      {
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO, 0, UnIMPACCULTCHIUSO);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS, 0, UnIMPACCULTCONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL, 0, UnIMPACCULTSVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE, 0, UnPREVISIONE);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS, 0, UnPREVISIONECONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL, 0, UnPREVISIONESVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO, 0, UnSTNINICO);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS, 0, UnSTNINICOCONS);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL, 0, UnSTNINICOSVIL);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMPEGNABILE, 0, unIMPEGNABILE);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0, Unesercizio);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0, Unes);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0, UnCapitolo);
      IMDB.set_Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0, Unarticolo);
      }
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBIL4, 0);
    }
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
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
        UPDADATATEMP_TEMPBIL1();
        while (!IMDB.Eof(IMDBDef11.QRY_TEMPBIL1, 0))
        {
          if (IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMESTATU, 0).equals((new IDVariant("I")), true))
          {
            if (HasMoreUO(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC, 0), IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEES, 0), IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, 0)))
            {
              v_OUT = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_OUT, v_SPAZIVUOTI), IDL.ToString(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IDL.ToString(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, 0)))), (new IDVariant("<BR/>")));
              v_SHOWOUT = (new IDVariant(-1));
            }
            SQL = new StringBuffer();
            SQL.append("insert into BIL ");
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
            SQL.append("  DATA_INSERIMENTO, ");
            SQL.append("  STN_INI_CA, ");
            SQL.append("  VARIAZIONI_CA ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULCH, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEPREVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMPRECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMPRESVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMSTINCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONASTINCOCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONASTINCOSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  0, ");
            SQL.append("  0, ");
            SQL.append("  0, ");
            SQL.append("  NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0), ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ), ");
            SQL.append("  0, ");
            SQL.append("  0 ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          if (IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMESTATU, 0).equals((new IDVariant("M")), true))
          {
            SQL = new StringBuffer();
            SQL.append("update BIL set ");
            SQL.append("  ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_CHIUSO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULCH, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMP_ACC_ULT_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONAIMACULSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEPREVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMPRECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  PREVISIONE_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMPRESVI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMSTINCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO_CONS = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONASTINCOCO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  STN_INI_CO_SVIL = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_RONASTINCOSV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  IMPEGNABILE = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEIMPEG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.QRY_TEMPBIL1, IMDBDef11.QSL_TEMPBIL1_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          IMDB.TblMoveNext(IMDBDef11.QRY_TEMPBIL1, 0);
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
      UPDADATATEMP_TEMBILDELROW();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "UpdateDataTemp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BIL
  // Which data are you selecting?
  // **********************************************************************
  private void UPDADATATEMP_TEMPBIL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_TEMPBIL1);
    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
    {
      IMDB.TblAddNew(IMDBDef11.QRY_TEMPBIL1, 0);
      IMDB.TblLinkRow(IMDBDef11.QRY_TEMPBIL1, 0, IMDBDef3.TBL_TEMPBIL4, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 0, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 1, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 2, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 3, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 4, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMPEGNABILE, 0);
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 5, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 6, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 7, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_STN_INI_CO, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 8, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 9, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 10, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_SVIL, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 11, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_PREVISIONE_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 12, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CONS, 0)));
      IMDB.set_Value(IMDBDef11.QRY_TEMPBIL1, 13, 0, ((IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_IMP_ACC_ULT_CHIUSO, 0)));
      IMDB.TblLinkField(IMDBDef11.QRY_TEMPBIL1, 14, 0, IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ROWNAMESTATU, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBIL4, 0);
      if (IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_TEMPBIL1, 0);
  }

  // **********************************************************************
  // Temp BIL: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UPDADATATEMP_TEMBILDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_TEMPBIL4);
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
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "HasMoreUO", _e);
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
      DELETE_TEMBILDELROW(Unesercizio, Unes, Uncapitolo, Unarticolo);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiBilancioEffettivoVg", "Delete", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Temp BIL: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void DELETE_TEMBILDELROW(IDVariant Unesercizio, IDVariant Unes, IDVariant Uncapitolo, IDVariant Unarticolo) throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef3.TBL_TEMPBIL4, 0);
    while (!IMDB.Eof(IMDBDef3.TBL_TEMPBIL4, 0))
    {
      bDeleted = false;
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ESERCIZIO, 0).equals(Unesercizio, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_E_S, 0).equals(Unes, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_CAPITOLO, 0).equals(Uncapitolo, true))
      {
      if (IMDB.Value(IMDBDef3.TBL_TEMPBIL4, IMDBDef3.FLD_TEMPBIL4_ARTICOLO, 0).equals(Unarticolo, true))
      {
        IMDB.TblDelete(IMDBDef3.TBL_TEMPBIL4, 0);
        bDeleted = true;
      }
      }
      }
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef3.TBL_TEMPBIL4, 0);
    }
  }

  // **********************************************************************
  // Filtri Effettivo Vg
  // Primary record source for panel data
  // **********************************************************************
  private void STANBILEFFVG_FILTREFFETV1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_FILTREFFETV1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_FILTREFFETVG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_FILTREFFETVG, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_FILTREFFETV1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_FILTREFFETV1_RS, 0, IMDBDef3.TBL_FILTREFFETVG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 0, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMETITOL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 1, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMECATEG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 2, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEFUNZI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 3, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMESERVI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 4, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODINT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 5, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTREFFETV1_RS, 6, 0, IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODTER, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_FILTREFFETVG, 0);
      if (IMDB.Eof(IMDBDef3.TBL_FILTREFFETVG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_FILTREFFETVG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_FILTREFFETV1_RS, 0);
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
  private void PAN_FILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRI, Cancel);
    // Stub
  }

  private void PAN_FILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRI_ENTRATASPESA)
      {
        PFL_FILTRI_ENTRATASPESA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRI_TITOLO)
      {
        PFL_FILTRI_TITOLO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRI_FUNZIONE)
      {
        PFL_FILTRI_FUNZIONE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRI_IntValidateRow(Cancel);
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
      ApriStanziamentiUOVg();
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
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMENVG_STNINICOCONS)
      {
        PFL_STANZIAMENVG_STNINICOCONS_ValidateCell(Cancel);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_STN_INI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_PREVISIONE_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_IMP_ACC_ULT_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_CAP11, IMDBDef11.PQSL_CAP11_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0)));
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
    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_FIELD, 52);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "C67C0F65-AEA9-48D7-82A5-C10CCE9F6D03");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "CAPITOLO  Expression 1");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "C6C538A4-1030-466F-85C2-E0B3FB54936A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "ARTICOLO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "C7622489-5ED9-4183-92B0-BF8E8553C18D");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "DESCRIZIONE ABBREVIATA");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "7DE4A3B1-DF47-42ED-BB75-9928B3DCABDE");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "INFO CAP Buttonexpression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.VIS_HYPELINKIMMA);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "CA0B1856-9574-4891-A272-2FBF07EF4C36");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "APRI STANZIAMENTI UO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.VIS_HYPELINKIMMA);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "C78F027A-75FD-4955-8BAA-CD4839FDCEF9");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "NUOVO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.VIS_CHECKSTYLE);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "61C76D9E-9761-40B9-9624-A32DA71F5B35");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "STN INI CO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "7E393125-69F1-4D92-A237-6C155F9F8BB4");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "STN INI CO SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "9EEF503D-339E-4536-9787-FC5EE91D33A3");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "STN INI CO CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "4AB25654-280D-411F-857D-0EA101300A7B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "PREVISIONE");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "361CABD8-28C5-431F-9CFA-5BAB1CB87931");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "B7BAA206-7750-4E6A-87DA-2F55D623C120");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "PREVISIONE CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "FE0700E3-9472-4595-92B1-E6828889D46A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "41C8CD86-6C4E-45F7-B3E0-7F783D98868E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "90FEF462-1604-4658-970E-24E401A91660");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "DABB8F27-B3D1-43F4-B0CF-7323F9D60902");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "Impegnabile");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "002F7B56-9FEE-4499-8D7F-C348A826107D");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "NUMRECORDBILUO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, "New Sub Query 1");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUMRECEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "3A38FB3B-01F5-4315-BC4A-963175FDC27E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "UNITAGESTIONEVALIDE Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_UNITAGEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "C6C7E74B-B6CB-435A-8A37-3A41CA74B018");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "TITOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "180BE40E-099F-4FB9-B71C-074A4F6BB9E0");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "CATEGORIA");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "6C641B0F-218B-49DC-A53E-872147F31C86");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "FUNZIONE");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "59A4362D-4104-4BC6-9535-AB87F13D7759");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "SERVIZIO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "67A1F617-E8AD-41BF-AB8C-BE4F0EB7A58D");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "COD INTERVENTO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "95E52CDC-D036-429D-A787-522C86BB96B6");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "ESERCIZIO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "D2A3DE35-058A-45CB-BA7C-9FFF5DA6CD4A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "E S");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, "Brief description of field content.");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "4BC64866-D6B1-41C4-B75D-ABF98247AC3E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "CAPITOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "688BA269-775A-4203-A118-3EFFE9839335");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "ARTICOLO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "9866DDF9-6868-4E46-8892-AD471122EEC8");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "STATO Expression");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOEXPRESS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "C1A02EFE-E0A2-4B06-9CB8-B438CF226EDE");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "VARIAZIONI CO");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, 0, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "71FC0F4D-5FAA-4334-9142-3E6749477CED");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "03DF5415-3EC8-4C4D-BE6A-9184FCBE26B9");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "AA7D076D-8B8C-4C5F-8922-32B04E14464E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "ESERCIZIO 1");
    PAN_STANZIAMENVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, "FF29D04E-B830-41A3-8593-7FEDEE92181F");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, "");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.VIS_VUOTONORMALE);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, "436BCE92-1AC9-4A20-B12C-B7F7EC07CFE9");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, "Stanziamenti");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, "C04324A1-2FEE-40BC-B752-8401BAD7D4B4");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, "Previsione");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, "0B146912-04E7-4178-B75A-7EDF0BE6112E");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, "Acc. Ult. Chiuso");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, "6E1D5E56-2320-48CE-AE9C-6D939A07B462");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, "67E3D99A-E24D-4ADD-AFF2-32AED0A8AF43");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, "BED97130-017C-422B-B8AD-6AD8991AA895");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, "F5ED845D-5A0C-4812-A703-D2BC63049799");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, "Voce P.e.g.");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VOCEPEGLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, "3E91C24F-A77F-4AFB-93F6-BB32EB07C7E1");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, "Stanziamento");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, "93970DB7-2C06-4AE4-B815-CAF3FA4DF422");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, "8175DF41-FFB3-4842-8CD8-21FC5A4AF88B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, "CA837323-900C-462D-91AC-C39C6CECA50B");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, "4F00DDAD-B1DE-40F0-9AF6-4AF4AEB69126");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, "Previsione");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, "C03358F7-6FA3-4E04-8EE9-BADB755DFEB7");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, "68BC66C0-7229-4196-A13E-D768B7333EEF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, "098A7B64-D9A8-4401-B547-2694A82F3AB9");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, "F64F1793-2966-495F-B2BC-B5CA82243144");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, "Imp. Ult. Chiuso");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, "E4AB773B-41DE-4455-91F4-24E208565EEF");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, "Totale");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, "8D7F0A1B-609A-49E8-9CF3-D724EAC2C46A");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, "Sviluppo");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMENVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, "AEEE7595-995D-4E2A-8144-F6084421D3A2");
    PAN_STANZIAMENVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, "Consolidato");
    PAN_STANZIAMENVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMENVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_STANZIAMENVG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 64, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_LIST, "CAP. Expr. 1");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 12, 12, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CAPITOEXPRE1, MyGlb.PANEL_FORM, "CAP. Expres. 1");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CAPITOEXPRE1, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_CAPITOEXPRE1, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CAPITOEXPRE1, PPQRY_CAP11, "A.CAPITOLO", "RECOCAPIEXPR", 3, 28, 6, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 108, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_LIST, "A. E.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOEXPRES, MyGlb.PANEL_FORM, "ARTIC. Expres.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ARTICOEXPRES, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_ARTICOEXPRES, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ARTICOEXPRES, PPQRY_CAP11, "A.ARTICOLO", "RECOARTIEXPR", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 128, 60, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_LIST, "DESCRIZIONE ABBREVIATA");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 4, 136, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_DESCRIABBREV, MyGlb.PANEL_FORM, "DESCR. ABBREVIATA");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_DESCRIABBREV, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_DESCRIABBREV, PPQRY_CAP11, "A.DESCRIZIONE_ABBREVIATA", "DESCRIZIONE_ABBREVIATA", 5, 40, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 220, 60, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_LIST, "I. C. B.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 4, 40, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 144);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_INFOCAPBUTTO, MyGlb.PANEL_FORM, "INFO CAP Buttonexpression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_INFOCAPBUTTO, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_INFOCAPBUTTO, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_INFOCAPBUTTO, PPQRY_CAP11, "'I'", "RECINFCAPBUT", 5, 1, 0, -13997);
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
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_APRISTAUOEXP, MyGlb.PANEL_LIST, 240, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_APRISTAUOEXP, PPQRY_CAP11, SQL.toString(), "RECAPRSTUOEX", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_APRISTAUOEXP, (new IDVariant(10)), "Apri", "", "wsearch.gif", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 260, 60, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_LIST, "N. Ex.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 4, 88, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NUOVOEXPRESS, MyGlb.PANEL_FORM, "NUOVO Expression");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_NUOVOEXPRESS, -1, -1);
    PAN_STANZIAMENVG.SetFieldUnbound(PFL_STANZIAMENVG_NUOVOEXPRESS, true);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NUOVOEXPRESS, PPQRY_CAP11, "'NO'", "RECONUOVEXPR", 5, 2, 0, -13997);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_NUOVOEXPRESS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STANZIAMENVG.SetValueListItem(PFL_STANZIAMENVG_NUOVOEXPRESS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 288, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_LIST, "STN INI CO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 4, 112, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICO, MyGlb.PANEL_FORM, "ST. INI CO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICO, PPQRY_CAP11, "B.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 388, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 4, 136, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOSVIL, MyGlb.PANEL_FORM, "ST. INI CO SVL.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICOSVIL, PPQRY_CAP11, "B.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 488, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 4, 160, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CNS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STNINICOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STNINICOCONS, PPQRY_CAP11, "B.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 588, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 4, 184, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIONE, MyGlb.PANEL_FORM, "PREVIS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIONE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIONE, PPQRY_CAP11, "B.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 688, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVISIONE SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 208, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 92);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVIS. SVIL");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIOSVIL, PPQRY_CAP11, "B.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 788, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVISIONE CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 4, 232, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 100);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVIS. CONS");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVISIOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVISIOCONS, PPQRY_CAP11, "B.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 888, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 116);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CHIUSO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 4, 256, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 116);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CH.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTCHI, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTCHI, PPQRY_CAP11, "B.IMP_ACC_ULT_CHIUSO", "IMP_ACC_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 988, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_LIST, "IMP ACC ULT SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 4, 280, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTSVI, MyGlb.PANEL_FORM, "IM. AC. ULT SVL.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTSVI, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTSVI, PPQRY_CAP11, "B.IMP_ACC_ULT_SVIL", "IMP_ACC_ULT_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 1088, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 104);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 4, 304, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CNS.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPACCULTCON, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPACCULTCON, PPQRY_CAP11, "B.IMP_ACC_ULT_CONS", "IMP_ACC_ULT_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1188, 60, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_LIST, "Impegnabile");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 4, 328, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 76);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPEGNABILE, MyGlb.PANEL_FORM, "Impegn.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPEGNABILE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPEGNABILE, PPQRY_CAP11, "B.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
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
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NUMRECEXPRES, PPQRY_CAP11, SQL.toString(), "RECONUMREXPR", 1, 19, 0, -13997);
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
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_UNITAGEXPRES, PPQRY_CAP11, SQL.toString(), "RECOUNITEXPR", 1, 19, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 1304, 60, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 48);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_LIST, "TITOLO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 4, 136, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 48);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TITOLO1, MyGlb.PANEL_FORM, "TITOLO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TITOLO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TITOLO1, PPQRY_CAP11, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 1304, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_LIST, "CATEG.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 4, 160, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 68);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CATEGORIA1, MyGlb.PANEL_FORM, "CATEG.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CATEGORIA1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CATEGORIA1, PPQRY_CAP11, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 1304, 60, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 4, 184, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_FUNZIONE1, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_FUNZIONE1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_FUNZIONE1, PPQRY_CAP11, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 1304, 60, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 56);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_LIST, "SERV.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 4, 208, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 56);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_SERVIZIO1, MyGlb.PANEL_FORM, "SERV.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_SERVIZIO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_SERVIZIO1, PPQRY_CAP11, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 1304, 60, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_LIST, "COD INTERVENTO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 4, 232, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 96);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_CODINTERVEN1, MyGlb.PANEL_FORM, "COD INTERV.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_CODINTERVEN1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CODINTERVEN1, PPQRY_CAP11, "A.COD_INTERVENTO", "COD_INTERVENTO", 1, 2, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 1560, 60, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ESERCIZIO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ESERCIZIO, PPQRY_CAP11, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 1560, 60, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 4, 280, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 24);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ES, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ES, PPQRY_CAP11, "A.E_S", "E_S", 5, 1, 0, -13997);
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
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_CAPITOLO, PPQRY_CAP11, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 1560, 60, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ARTICOLO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ARTICOLO, PPQRY_CAP11, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
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
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STATOEXPRESS, PPQRY_CAP11, "NULL", "RECOSTATEXPR", 5, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 0, 60, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZIONI CO");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 256, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZ. CO");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZIONICO, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZIONICO, PPQRY_CAP11, "B.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 0, 60, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZIONI CO CONS");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 4, 280, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 120);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZ. CO CONS");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZCOCONS, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZCOCONS, PPQRY_CAP11, "B.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 0, 60, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZIONI CO SVIL");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 4, 304, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_VARIAZCOSVIL, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_VARIAZCOSVIL, PPQRY_CAP11, "B.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO 1");
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 328, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC. 1");
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ESERCIZIO1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ESERCIZIO1, PPQRY_CAP11, "B.ESERCIZIO", "RECORDBILESE", 3, 12, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 684, 12, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 704, 92, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_NASENTINULAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_NASENTINULAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_NASENTINULAB, -1, "", "NASENTINULAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 288, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 428, 92, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANENTRLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STANENTRLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STANENTRLABE, -1, "", "STANENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 404, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 500, 88, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVENTRLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVENTRLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVENTRLABE, -1, "", "PREVENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 520, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 568, 92, 56, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_ACCULTCHENLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_ACCULTCHENLA, -1, "", "ACCULTCHENLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 388, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 496, 84, 28, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB1, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TOTAENTRLAB1, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TOTAENTRLAB1, -1, "", "TOTAENTRLAB1", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 288, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 384, 80, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLAB2, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_TOTAENTRLAB2, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_TOTAENTRLAB2, -1, "", "TOTAENTRLAB2", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_TOTAENTRLABE, MyGlb.PANEL_LIST, 488, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 288, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 392, 12, 272, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STANSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STANSPESLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STANSPESLABE, -1, "", "STANSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 288, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 408, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STATOTSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STATOTSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STATOTSPELAB, -1, "", "STATOTSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 388, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 504, 104, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STASVISPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STASVISPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STASVISPELAB, -1, "", "STASVISPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 488, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 596, 104, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_STACONSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_STACONSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_STACONSPELAB, -1, "", "STACONSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 588, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 436, 84, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PREVSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PREVSPESLABE, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PREVSPESLABE, -1, "", "PREVSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 588, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 444, 120, 48, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRETOTSPELAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRETOTSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRETOTSPELAB, -1, "", "PRETOTSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 788, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 536, 116, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRECONSPELAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRECONSPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRECONSPELAB, -1, "", "PRECONSPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 688, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 624, 108, 56, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_PRESVISPELAB, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_PRESVISPELAB, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_PRESVISPELAB, -1, "", "PRESVISPELAB", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 888, 12, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 632, 116, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMPULTCHSPLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMPULTCHSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMPULTCHSPLA, -1, "", "IMPULTCHSPLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 888, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 724, 116, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHTOSPLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHTOSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHTOSPLA, -1, "", "IMULCHTOSPLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 988, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 824, 112, 56, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHSPSVLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHSPSVLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHSPSVLA, -1, "", "IMULCHSPSVLA", 0, 0, 0, -13997);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 1088, 32, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMENVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 912, 112, 48, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMENVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMENVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMENVG_IMULCHCOSPLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMENVG.SetFieldPage(PFL_STANZIAMENVG_IMULCHCOSPLA, -1, -1);
    PAN_STANZIAMENVG.SetFieldPanel(PFL_STANZIAMENVG_IMULCHCOSPLA, -1, "", "IMULCHCOSPLA", 0, 0, 0, -13997);
  }

  private void PAN_STANZIAMENVG_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIAMENVG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STANZIAMENVG.SetIMDB(IMDB, "PQRY_CAP11", true);
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
    SQL.append("  B.ESERCIZIO as RECORDBILESE, ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BIL B ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 1, SQL, -1, "");
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
    SQL.append("and   (A.E_S = ~~PQRY_FILTREFFETV1.ROWNAMEENTRA~~) ");
    SQL.append("and   (NVL(A.TITOLO, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMETITOL~~, NVL(A.TITOLO, -1))) ");
    SQL.append("and   (NVL(A.CATEGORIA, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMECATEG~~, NVL(A.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(A.FUNZIONE, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMEFUNZI~~, NVL(A.FUNZIONE, -1))) ");
    SQL.append("and   (NVL(A.SERVIZIO, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMESERVI~~, NVL(A.SERVIZIO, -1))) ");
    SQL.append("and   (NVL(A.COD_INTERVENTO, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMCODINT~~, NVL(A.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(A.COD_TERZI, -1) = NVL(~~PQRY_FILTREFFETV1.ROWNAMCODTER~~, NVL(A.COD_TERZI, -1))) ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 2 ");
    PAN_STANZIAMENVG.SetQuery(PPQRY_CAP11, 5, SQL, -1, "");
    PAN_STANZIAMENVG.SetQueryDB(PPQRY_CAP11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMENVG.SetMasterTable(0, "CAP");
    PAN_STANZIAMENVG.AddToSortList(PFL_STANZIAMENVG_CAPITOEXPRE1, true);
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

  private void PAN_FILTRI_Init()
  {

    PAN_FILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "D1ADDFA0-9A8E-4B17-AD48-A795416437E4");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "Entrataspesa");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, "9557F535-1C1D-4A55-A725-663B3DF1BC18");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, "Titolo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, "52557071-9B9D-45D3-AFB4-9FB4E433B914");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, "Categoria");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, "1F99A308-C11A-4990-AF95-6C7569DA3AF5");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, "Funzione");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, "F6A0AF50-C806-40F1-9E20-651242B5FE51");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, "Servizio");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, "2EFC1EB5-034D-45B2-9C8A-95530259EC12");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, "Cod. Intervento");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, "E86C9B56-485E-47A8-9408-3406622F3327");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, "Cod. Terzi");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 72);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrataspesa");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 12, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 72);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrat.");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ENTRATASPESA, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ENTRATASPESA, PPQRY_FILTREFFETV1, "A.ROWNAMEENTRA", "ROWNAMEENTRA", 5, 1, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_LIST, 84, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_LIST, 36);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_FORM, 40, 32, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_FORM, 52);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_TITOLO, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_TITOLO, PPQRY_FILTREFFETV1, "A.ROWNAMETITOL", "ROWNAMETITOL", 1, 2, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_LIST, 340, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_FORM, 400, 32, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CATEGORIA, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CATEGORIA, PPQRY_FILTREFFETV1, "A.ROWNAMECATEG", "ROWNAMECATEG", 1, 2, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_LIST, 596, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_LIST, 52);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_FORM, 404, 32, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_FORM, 60);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_FUNZIONE, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_FUNZIONE, PPQRY_FILTREFFETV1, "A.ROWNAMEFUNZI", "ROWNAMEFUNZI", 1, 2, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_LIST, 852, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_FORM, 36, 60, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_SERVIZIO, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_SERVIZIO, PPQRY_FILTREFFETV1, "A.ROWNAMESERVI", "ROWNAMESERVI", 1, 2, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_LIST, 1108, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_LIST, 84);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_LIST, "Cod. Intervento");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_FORM, 364, 60, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_FORM, 100);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODINTERVENT, MyGlb.PANEL_FORM, "Cod. Intervento");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODINTERVENT, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODINTERVENT, PPQRY_FILTREFFETV1, "A.ROWNAMCODINT", "ROWNAMCODINT", 1, 2, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_LIST, 56);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_LIST, "Cod. Terzi");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_FORM, 400, 16, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_FORM, 64);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_CODTERZI, MyGlb.PANEL_FORM, "Cod. Terzi");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_CODTERZI, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_CODTERZI, PPQRY_FILTREFFETV1, "A.ROWNAMCODTER", "ROWNAMCODTER", 1, 2, 0, -13997);
  }

  private void PAN_FILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRI.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_FILTRI_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRI.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_FILTRI_TITOLO, "");
    PAN_FILTRI.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGNEWEXPR ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.CATEGORIA = ~~ROWNAMECATEG~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    PAN_FILTRI.SetQuery(PPQRY_CATEGORIE, 0, SQL, PFL_FILTRI_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGNEWEXPR ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    PAN_FILTRI.SetQuery(PPQRY_CATEGORIE, 1, SQL, PFL_FILTRI_CATEGORIA, "");
    PAN_FILTRI.SetQueryDB(PPQRY_CATEGORIE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    PAN_FILTRI.SetQuery(PPQRY_FUNZIONI, 0, SQL, PFL_FILTRI_FUNZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    PAN_FILTRI.SetQuery(PPQRY_FUNZIONI, 1, SQL, PFL_FILTRI_FUNZIONE, "");
    PAN_FILTRI.SetQueryDB(PPQRY_FUNZIONI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMESERVI~~) ");
    SQL.append("and   (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("order by ");
    SQL.append("  A.SERVIZIO ");
    PAN_FILTRI.SetQuery(PPQRY_SERVIZI, 0, SQL, PFL_FILTRI_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("order by ");
    SQL.append("  A.SERVIZIO ");
    PAN_FILTRI.SetQuery(PPQRY_SERVIZI, 1, SQL, PFL_FILTRI_SERVIZIO, "");
    PAN_FILTRI.SetQueryDB(PPQRY_SERVIZI, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_FILTRI.SetQuery(PPQRY_INTERVENTI, 0, SQL, PFL_FILTRI_CODINTERVENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("order by ");
    SQL.append("  A.INTERVENTO ");
    PAN_FILTRI.SetQuery(PPQRY_INTERVENTI, 1, SQL, PFL_FILTRI_CODINTERVENT, "");
    PAN_FILTRI.SetQueryDB(PPQRY_INTERVENTI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTERDESCRI ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.CAPITOLO = ~~ROWNAMCODTER~~) ");
    SQL.append("and   (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRI.SetQuery(PPQRY_CAPTER, 0, SQL, PFL_FILTRI_CODTERZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTERDESCRI ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.E_S = ~~ROWNAMEENTRA~~) ");
    PAN_FILTRI.SetQuery(PPQRY_CAPTER, 1, SQL, PFL_FILTRI_CODTERZI, "");
    PAN_FILTRI.SetQueryDB(PPQRY_CAPTER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRI.SetIMDB(IMDB, "PQRY_FILTREFFETV1", true);
    PAN_FILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRI.SetQueryIMDB(PPQRY_FILTREFFETV1, IMDBDef11.PQRY_FILTREFFETV1_RS, IMDBDef3.TBL_FILTREFFETVG);
    JustLoaded = true;
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_ENTRATASPESA, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_TITOLO, IMDBDef3.FLD_FILTREFFETVG_ROWNAMETITOL);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CATEGORIA, IMDBDef3.FLD_FILTREFFETVG_ROWNAMECATEG);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_FUNZIONE, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEFUNZI);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_SERVIZIO, IMDBDef3.FLD_FILTREFFETVG_ROWNAMESERVI);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODINTERVENT, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODINT);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_CODTERZI, IMDBDef3.FLD_FILTREFFETVG_ROWNAMCODTER);
    PAN_FILTRI.SetMasterTable(0, "FILTREFFETVG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRI.Status() == 2)
    {
      int oldListQBE = PAN_FILTRI.iUseListQBE;
      PAN_FILTRI.iUseListQBE = 0;
      PAN_FILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_DynamicProperties();
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZIAMENVG) PAN_STANZIAMENVG_BeforeDelete(Cancel);
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
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
