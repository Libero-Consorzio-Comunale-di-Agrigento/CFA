// **********************************************
// Informazioni Finanziamento Per Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniFinanziamentoPerVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_FINANZIAMENT = 0;
  private static int PFL_PARAMETRI_DESCRIFINANZ = 1;
  private static int PFL_PARAMETRI_DATAAL = 2;
  private static int PFL_PARAMETRI_ESERCIZIO = 3;

  private static int PPQRY_PARAMETRI35 = 0;

  private static int PPQRY_FINANZIAMENT = 1;

  private static int PPQRY_DUAL = 2;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_INFORMFINANZ;
  private static int PFL_SITUAZIONE_PREVISINIZI1 = 0;
  private static int PFL_SITUAZIONE_VARIAZIONI1 = 1;
  private static int PFL_SITUAZIONE_PREVISATTUA1 = 2;
  private static int PFL_SITUAZIONE_ACCERTCOMPET = 3;
  private static int PFL_SITUAZIONE_DISPONIBILI1 = 4;
  private static int PFL_SITUAZIONE_VARIAZPROVV1 = 5;
  private static int PFL_SITUAZIONE_PREVISINIZIA = 6;
  private static int PFL_SITUAZIONE_VARIAZIONI = 7;
  private static int PFL_SITUAZIONE_PREVISATTUAL = 8;
  private static int PFL_SITUAZIONE_IMPEGNCOMPET = 9;
  private static int PFL_SITUAZIONE_DISPONIBILIT = 10;
  private static int PFL_SITUAZIONE_VARIAZPROVVI = 11;
  private static int PFL_SITUAZIONE_LABELENTRATA = 12;
  private static int PFL_SITUAZIONE_LABELSPESA = 13;
  private static int PFL_SITUAZIONE_APRPREINENFI = 14;
  private static int PFL_SITUAZIONE_APRELEVAENFI = 15;
  private static int PFL_SITUAZIONE_APRPREINSPFI = 16;
  private static int PFL_SITUAZIONE_APRACCDICOFI = 17;
  private static int PFL_SITUAZIONE_APRVARPRENFI = 18;
  private static int PFL_SITUAZIONE_APRELEVASPFI = 19;
  private static int PFL_SITUAZIONE_APRIMPDICOFI = 20;
  private static int PFL_SITUAZIONE_APRVARPRSPFI = 21;
  private static int PFL_SITUAZIONE_FINANZIAMEN1 = 22;
  private static int PFL_SITUAZIONE_DISPONPROVV1 = 23;
  private static int PFL_SITUAZIONE_DISPONPROVVI = 24;
  private static int PFL_SITUAZIONE_VARIAZPROPO1 = 25;
  private static int PFL_SITUAZIONE_VARIAZPROPO2 = 26;
  private static int PFL_SITUAZIONE_VARIAZPROPO3 = 27;
  private static int PFL_SITUAZIONE_VARIAZPROPO4 = 28;
  private static int PFL_SITUAZIONE_VARIAZPROPO5 = 29;
  private static int PFL_SITUAZIONE_VARIAZPROPOS = 30;
  private static int PFL_SITUAZIONE_DISPOCONPRO1 = 31;
  private static int PFL_SITUAZIONE_DISPOCONPRO2 = 32;
  private static int PFL_SITUAZIONE_DISPOCONPRO3 = 33;
  private static int PFL_SITUAZIONE_DISPOCONPRO4 = 34;
  private static int PFL_SITUAZIONE_DISPOCONPRO5 = 35;
  private static int PFL_SITUAZIONE_DISPOCONPROP = 36;

  private static int PPQRY_VISTATOTOPE = 0;


  IDPanel PAN_SITUAZIONE;
  private static int PFL_ARCHIVIO_CODICE = 0;
  private static int PFL_ARCHIVIO_DESCRIZIONE = 1;
  private static int PFL_ARCHIVIO_RAGIONSOCIAL = 2;
  private static int PFL_ARCHIVIO_ENTE = 3;
  private static int PFL_ARCHIVIO_ANNOMUTUO = 4;
  private static int PFL_ARCHIVIO_NUMEROMUTUO = 5;
  private static int PFL_ARCHIVIO_NOTE1 = 6;
  private static int PFL_ARCHIVIO_IMPORTORIGIN = 7;
  private static int PFL_ARCHIVIO_SCADENZA = 8;
  private static int PFL_ARCHIVIO_LABELENTE = 9;
  private static int PFL_ARCHIVIO_BARRA = 10;
  private static int PFL_ARCHIVIO_MUTUO = 11;
  private static int PFL_ARCHIVIO_CATEGORIA = 12;
  private static int PFL_ARCHIVIO_DURATADESC = 13;
  private static int PFL_ARCHIVIO_ALLEGATALPEG = 14;
  private static int PFL_ARCHIVIO_FINANZDISAVA = 15;
  private static int PFL_ARCHIVIO_FLESSIBILITA = 16;
  private static int PFL_ARCHIVIO_DIPARTIMENTO = 17;
  private static int PFL_ARCHIVIO_LEGGEREGIONA = 18;
  private static int PFL_ARCHIVIO_CAPITOREGION = 19;
  private static int PFL_ARCHIVIO_ATTOASSEGNAZ = 20;
  private static int PFL_ARCHIVIO_NOTAVUOTA = 21;
  private static int PFL_ARCHIVIO_NOTAPIENA = 22;
  private static int PFL_ARCHIVIO_SERVIZOPERAT = 23;
  private static int PFL_ARCHIVIO_SETTOROPERAT = 24;

  private static int PPQRY_FINANZIAME28 = 0;


  IDPanel PAN_ARCHIVIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI125(IMDB);
    //
    //
    Init_PQRY_VISTATOTOPE(IMDB);
    Init_PQRY_FINANZIAME28(IMDB);
    Init_PQRY_PARAMETRI35(IMDB);
    Init_PQRY_PARAMETRI35_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI125(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI125, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI125, "TBL_PARAMETRI125");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI125,IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI125, 0);
  }

  private static void Init_PQRY_VISTATOTOPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTATOTOPE, 28);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTATOTOPE, "PQRY_VISTATOTOPE");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_INI_E, "PREVISIONE_INI_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_INI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARIAZIONI_E, "VARIAZIONI_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARIAZIONI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_ATT_E, "PREVISIONE_ATT_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_ATT_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_ACCERTATO_COMP, "ACCERTATO_COMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_ACCERTATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_DISPONIBILITA_E, "DISPONIBILITA_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_DISPONIBILITA_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARCOMPRO_E, "VARCOMPRO_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARCOMPRO_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_INI_S, "PREVISIONE_INI_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_INI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARIAZIONI_S, "VARIAZIONI_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARIAZIONI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_ATT_S, "PREVISIONE_ATT_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PREVISIONE_ATT_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_IMPEGNATO_COMP, "IMPEGNATO_COMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_IMPEGNATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_DISPONIBILITA_S, "DISPONIBILITA_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_DISPONIBILITA_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARCOMPRO_S, "VARCOMPRO_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VARCOMPRO_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VISTOTOPDIPR, "VISTOTOPDIPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VISTOTOPDIPR,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VISTOOPDIPR1, "VISTOOPDIPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VISTOOPDIPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOPR, "VITOOPDICOPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOPR,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_1, "PROPOSTE_E_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_2, "PROPOSTE_E_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_3, "PROPOSTE_E_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_E_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_1, "PROPOSTE_S_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_2, "PROPOSTE_S_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_3, "PROPOSTE_S_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_PROPOSTE_S_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP1, "VITOOPDICOP1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP2, "VITOOPDICOP2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP4, "VITOOPDICOP4");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP4,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP5, "VITOOPDICOP5");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP5,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP3, "VITOOPDICOP3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE,IMDBDef12.PQSL_VISTATOTOPE_VITOOPDICOP3,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTATOTOPE, 0);
  }

  private static void Init_PQRY_FINANZIAME28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FINANZIAME28, 28);
    IMDB.set_TblCode(IMDBDef12.PQRY_FINANZIAME28, "PQRY_FINANZIAME28");
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ENTE, "ENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ANNO_MUTUO, "ANNO_MUTUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ANNO_MUTUO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_NUMERO_MUTUO, "NUMERO_MUTUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_NUMERO_MUTUO,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_COD_ALLEGATO, "COD_ALLEGATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_COD_ALLEGATO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_IMPORTO_ORIG, "IMPORTO_ORIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_IMPORTO_ORIG,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_TIPO_DURATA, "TIPO_DURATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_TIPO_DURATA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SALDO_INI_CASSA, "SALDO_INI_CASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SALDO_INI_CASSA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SALDO_INI_TESORERIA, "SALDO_INI_TESORERIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_SALDO_INI_TESORERIA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINADURADESC, "FINADURADESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINADURADESC,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DESC_ABB, "DESC_ABB");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DESC_ABB,5,33,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINADISADESC, "FINADISADESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINADISADESC,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_COD_FIN_DISAV, "COD_FIN_DISAV");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_COD_FIN_DISAV,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_LEGGE_REG, "LEGGE_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_LEGGE_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CAPITOLO_REG, "CAPITOLO_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_CAPITOLO_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ATTO_ASS, "ATTO_ASS");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_ATTO_ASS,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DIPARTIMENTO, "DIPARTIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_DIPARTIMENTO,5,150,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINASERVOPER, "FINASERVOPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINASERVOPER,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINASETTOPER, "FINASETTOPER");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINASETTOPER,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINANZFLESSI, "FINANZFLESSI");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINANZFLESSI,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINANZCATEGO, "FINANZCATEGO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINANZCATEGO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINAALLALPEG, "FINAALLALPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINAALLALPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINAFINADISA, "FINAFINADISA");
    IMDB.SetFldParams(IMDBDef12.PQRY_FINANZIAME28,IMDBDef12.PQSL_FINANZIAME28_FINAFINADISA,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FINANZIAME28, 0);
  }

  private static void Init_PQRY_PARAMETRI35(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI35, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI35, "PQRY_PARAMETRI35");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35,IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI35, 0);
  }

  private static void Init_PQRY_PARAMETRI35_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI35_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI35_RS, "PQRY_PARAMETRI35_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI35_RS,IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniFinanziamentoPerVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniFinanziamentoPerVariazioni()
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
    FormIdx = MyGlb.FRM_INFFINPERVAR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3562980D-E7CD-4CF3-BF0B-191BA06F568E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 550;
    set_Caption(new IDVariant("Informazioni Finanziamento Per Variazioni"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 524;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0916031;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 632;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B696235C-7C16-4803-9D8C-877027610569");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 596, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 632;
    Frames[3].Height = 476;
    Frames[3].Caption = "Informazioni Finanziamento";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 476;
    TAB_INFORMFINANZ = new OTabView(this);
    Frames[3].Content = TAB_INFORMFINANZ;
    TAB_INFORMFINANZ.iGuid = "B33DDC3C-DAAE-4473-9BE0-70DD32D72A86";
    TAB_INFORMFINANZ.SetItemCount(2);
    TAB_INFORMFINANZ.Placement = 1;
    TAB_INFORMFINANZ.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Situazione";
    Frames[4].Parent = this;
    PAN_SITUAZIONE = new IDPanel(w, this, 4, "PAN_SITUAZIONE");
    Frames[4].Content = PAN_SITUAZIONE;
    PAN_SITUAZIONE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZIONE.VS = MainFrm.VisualStyleList;
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "195194D1-5F4B-4D97-8B79-63B38F1C0BDC");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2568, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZIONE.InitStatus = 1;
    PAN_SITUAZIONE_Init();
    PAN_SITUAZIONE_InitFields();
    PAN_SITUAZIONE_InitQueries();
    TAB_INFORMFINANZ.SetItem(1, Frames[4], 0, "", "Situazione", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Archivio";
    Frames[5].Parent = this;
    PAN_ARCHIVIO = new IDPanel(w, this, 5, "PAN_ARCHIVIO");
    Frames[5].Content = PAN_ARCHIVIO;
    PAN_ARCHIVIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ARCHIVIO.VS = MainFrm.VisualStyleList;
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0ECB90C1-546A-40D7-BB79-9C72B7D61DCE");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3936, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ARCHIVIO.InitStatus = 2;
    PAN_ARCHIVIO_Init();
    PAN_ARCHIVIO_InitFields();
    PAN_ARCHIVIO_InitQueries();
    TAB_INFORMFINANZ.SetItem(2, Frames[5], 0, "", "Archivio", "Dizionario dei Finanziamenti");
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI125, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFFINPERVAR_PARAMETRI35();
      }
      PAN_SITUAZIONE.UpdatePanel(MainFrm);
      PAN_ARCHIVIO.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_FINANZIAMENT) {
      }
    }
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
    return (obj instanceof InformazioniFinanziamentoPerVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniFinanziamentoPerVariazioni.class.getName() : (Glb.ClassWithPackage(InformazioniFinanziamentoPerVariazioni.class) ? InformazioniFinanziamentoPerVariazioni.class.getName().substring(InformazioniFinanziamentoPerVariazioni.class.getPackage().getName().length() + 1) : InformazioniFinanziamentoPerVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Elenco Finanziamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoFinanziamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Finanziamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMCAPITOL, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMARTICOL, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, (new IDVariant(-1)));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriElencoFinanziamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOTAZIONI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ANNOTAZIONI = (new IDVariant("Annotazioni", IDVariant.STRING));
      // 
      // Apri Note Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_FINANZIAME28, IMDBDef12.PQSL_FINANZIAME28_NOTE, 0), v_ANNOTAZIONI, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dipartimento
  // **********************************************************************
  public int ApriDipartimento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_INTESTAZIONE = (new IDVariant("Dipartimento", IDVariant.STRING));
      // 
      // Apri Dipartimento Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_FINANZIAME28, IMDBDef12.PQSL_FINANZIAME28_DIPARTIMENTO, 0), v_INTESTAZIONE, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriDipartimento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti Di Competenza Fin
  // **********************************************************************
  public int ApriAccertamentiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI40, IMDBDef1.FLD_PARAMETRI40_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEDICOMFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriAccertamentiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni Di Competenza Fin
  // **********************************************************************
  public int ApriImpegniDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMOPERA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0, (new IDVariant("Finanziamento")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGDICOMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGDICOMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriImpegniDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Provvisorie Entrata Fin
  // **********************************************************************
  public int ApriVariazioniProvvisorieEntrataFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Provvisorie Entrata Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVFINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriVariazioniProvvisorieEntrataFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazione Provvisoria Spesa Fin
  // **********************************************************************
  public int ApriVariazioneProvvisoriaSpesaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazione Provvisoria Spesa Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVFINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriVariazioneProvvisoriaSpesaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti A Residuo Fin
  // **********************************************************************
  public int ApriAccertamentiAResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti A Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI42, IMDBDef1.FLD_PARAMETRI42_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEARESIFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriAccertamentiAResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMOPERA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0, (new IDVariant("Finanziamento")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGNARESID,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGNARESID, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriImpegniaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sub Impegni Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSubImpegniFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sub Impegni Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI43, IMDBDef1.FLD_PARAMETRI43_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_SUBIMPEGFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SUBIMPEGFINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriSubImpegniFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazioni Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazioniFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazioni Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI44, IMDBDef1.FLD_PARAMETRI44_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_LIQUIDFINANZ,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_LIQUIDFINANZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriLiquidazioniFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinatividiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI45, IMDBDef1.FLD_PARAMETRI45_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDIDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDIDICOMFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriOrdinatividiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI46, IMDBDef1.FLD_PARAMETRI46_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDIARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDIARESIFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriOrdinativiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI47, IMDBDef1.FLD_PARAMETRI47_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANDDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDDICOMFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriMandatiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI49, IMDBDef1.FLD_PARAMETRI49_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANDARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDARESIFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriMandatiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.Show(MyGlb.FRM_VARIAZFINANZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriElencoVariazioniSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.Show(MyGlb.FRM_VARIAZFINANZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriElencoVariazioniEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZFINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriPrevisioneInizialeSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE, IMDBDef12.PQSL_VISTATOTOPE_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZFINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriPrevisioneInizialeEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi A Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessiAResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi A Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_MANDATEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDATEMESSI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriMandatiEmessiAResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_MANDATEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDATEMESSI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriMandatiEmessidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI51, IMDBDef1.FLD_PARAMETRI51_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANEMEESPRFI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANEMEESPRFI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriMandatiEmessiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_PAGAMENTI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriPagamentidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_PAGAMENTI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriPagamentiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI53, IMDBDef1.FLD_PARAMETRI53_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_PAGESEPREFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGESEPREFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriPagamentiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_ORDINAEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDINAEMESSI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriOrdinativiEmessiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi Di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_ORDINAEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDINAEMESSI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriOrdinativiEmessiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossioniaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_RISCOSSIONI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISCOSSIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriRiscossioniaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossionidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_RISCOSSIONI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISCOSSIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriRiscossionidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI57, IMDBDef1.FLD_PARAMETRI57_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDEMEESPRFI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDEMEESPRFI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriOrdinativiEmessiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossioniEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI58, IMDBDef1.FLD_PARAMETRI58_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_RISESEPREFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISESEPREFIN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriRiscossioniEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Precedenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniPrecedenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Precedenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant("Precedenti")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriVariazioniPrecedenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Esercizio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniEsercizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Esercizio Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant("Esercizio")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriVariazioniEsercizio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Emessi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniEmessi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Emessi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant(" ")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ApriVariazioniEmessi", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMDATAAL, 0, IDL.Today());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINIMPACC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARACODIFINA, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME10, IMDBDef7.PQSL_FINANZIAME10_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Finanziamento Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_FINANZIAMENT_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Finanziamento Validate Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ParametriFinanziamentoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Archivio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ARCHIVIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ARCHIVIO);
      // 
      // Archivio On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_FINANZIAME28, IMDBDef12.PQSL_FINANZIAME28_NOTE, 0))))
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ARCHIVIO.set_ToolTip(Glb.OBJ_FIELD,PFL_ARCHIVIO_DIPARTIMENTO,IMDB.Value(IMDBDef12.PQRY_FINANZIAME28, IMDBDef12.PQSL_FINANZIAME28_DIPARTIMENTO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ArchivioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Archivio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ARCHIVIO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Archivio After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.FunzioneLicenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant("DIP"))))).equals((new IDVariant(-1)), true))
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "ArchivioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZIONE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SITUAZIONE);
      // 
      // Situazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, 0).equals(IMDB.Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0), true))
      {
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, 0).equals(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0), (new IDVariant(1))), true))
      {
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI35, IMDBDef12.PQSL_PARAMETRI35_PARAMESERCIZ, 0).equals(IDL.Add(IMDB.Value(IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0), (new IDVariant(2))), true))
      {
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZIONE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamentoPerVariazioni", "SituazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void INFFINPERVAR_PARAMETRI35() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI35_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI125, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI125, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI35_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI35_RS, 0, IMDBDef4.TBL_PARAMETRI125, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI35_RS, 0, 0, IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARACODIFINA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI35_RS, 1, 0, IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMDATAAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI35_RS, 2, 0, IMDBDef4.TBL_PARAMETRI125, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI125, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI125, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI125, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI35_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoFinanziamenti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_FINANZIAMENT)
      {
        PFL_PARAMETRI_FINANZIAMENT_ValidateCell(Cancel);
      }
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

  private void TAB_INFORMFINANZ_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SITUAZIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZIONE, Cancel);
    // Stub
  }

  private void PAN_SITUAZIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRPREINENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRELEVAENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRPREINSPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRACCDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRVARPRENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniProvvisorieEntrataFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRELEVASPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRIMPDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRVARPRSPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioneProvvisoriaSpesaFin();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SITUAZIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ARCHIVIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ARCHIVIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ARCHIVIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ARCHIVIO, Cancel);
    // Stub
  }

  private void PAN_ARCHIVIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ARCHIVIO_NOTAVUOTA)
    {
      this.IdxPanelActived = this.PAN_ARCHIVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ARCHIVIO_NOTAPIENA)
    {
      this.IdxPanelActived = this.PAN_ARCHIVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ARCHIVIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ARCHIVIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ARCHIVIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZIONE_Init()
  {

    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_FIELD, 37);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "239EEC21-46D1-4FC6-8A87-2EBDE3B0968A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "Previsione Iniziale");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "25F7549A-184A-4725-8169-9362FD1E75EC");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "Variazioni");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "1B542EFD-CE22-413B-ADCD-AA79FE3C5740");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "Previsione Attuale");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "B459BEEB-6BA6-4DA1-A417-E426D5714F5C");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "Accertato Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "A8F3314F-4BC3-4CEB-8E78-4BBB33A9E445");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "Disponibilità");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "CACAFF03-5353-4743-A2DC-DBAADA790F08");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "Variazioni Provvisorie");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "2E040239-A4F5-4162-965B-1FB6DBC057F8");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "Previsione Iniziale ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "F0AC7EAD-4D1E-43F0-AC48-2FC85E5DA32F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "Variazioni ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "82077C1E-E786-42BA-8990-AB8DCA2987A0");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "Previsione Attuale ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "DDBF3D8B-BA7E-49A1-9798-5354B843B18F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "Impegnato Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "0EF49A7F-E2CB-46AB-8A5E-D32119D86805");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "Disponibilità ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "F16B3E10-86CD-4EB3-8402-CE5D837486BF");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "Variazioni Provvisorie ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, "8A275D9F-9E61-4E6A-98B2-89BF96A7A91C");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, "Entrata");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, "B0ACE445-A218-4781-A78E-C14E616E8146");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, "Spesa");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, "A8C2AFE1-3D87-4906-81C0-1376E72E2669");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, "05B39674-D6A5-4820-BED4-1B8B7F79D38F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, "D5B8E52A-2606-4051-92B1-A5DEC76E81D7");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, "07C5AEB4-1C49-4B6E-863F-5C24B4835D5C");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, "5648CEB0-A167-4873-BF9E-A89CCBD5EEED");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, "63139108-9008-4DFA-9C8A-A9275ABD4524");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, "A1F35A17-EF2A-4351-BD75-B3DD48F3D13F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, "B8E31D17-A20E-4CBE-9B31-580464462594");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "B7B72387-CCAD-4951-BC59-4744A160F0E2");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.VIS_NONNULLAFIEL);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, 0, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, "62B5770B-3CDC-4F94-90A8-960CB17233D3");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, "Disponibilità Provvisoria");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, "745FFC7A-DF51-4E22-8EC9-83A6344DFBD4");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, "Disponibilità Provvisoria ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, "BE7F7FAC-3D01-4D9B-A7CF-1CD409833A1A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, "Variazioni Proposte");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, "DE43A48C-3CCC-42B8-9ED7-042612591311");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, "Variazioni Proposte ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, "BC09EC4C-AAAA-41BF-8877-9512F0D8FA71");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, "Variazioni Proposte  ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, "E62A6CDB-506E-4104-B9C4-0CE6CBF56D70");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, "Variazioni Proposte    ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, "141FA40B-6F05-4052-A575-A7628C3AF7AF");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, "Variazioni Proposte      ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.VIS_NORMFIELPADR);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, "C36041EE-7AE1-4E01-8750-5D9240062B9F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, "Variazioni Proposte       ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, "F6E4DE37-5B15-4518-9E93-9EB7407C3DBD");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, "Disponibilità Con Proposte");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, "67C5B9AD-405A-4479-8DED-65575748C492");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, "Disponibilità Con Proposte        ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, "CED32541-4C62-42B2-8922-3A4C5DAF2ADB");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, "Disponibilità Con Proposte      ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, "0A1386D9-C560-44E8-AD89-180E38F917A1");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, "Disponibilità Con Proposte    ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, "58569385-E57B-4720-9438-AB3E9B277441");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, "Disponibilità Con Proposte ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, "333718C9-7961-46C1-AA68-50AED8EDCFA0");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, "Disponibilità Con Proposte   ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SITUAZIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 36, 40, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 124);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISINIZI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISINIZI1, PPQRY_VISTATOTOPE, "A.PREVISIONE_INI_E", "PREVISIONE_INI_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 76, 64, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 84);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZIONI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZIONI1, PPQRY_VISTATOTOPE, "A.VARIAZIONI_E", "VARIAZIONI_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 36, 88, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 124);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, "Previsione Attuale");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISATTUA1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISATTUA1, PPQRY_VISTATOTOPE, "A.PREVISIONE_ATT_E", "PREVISIONE_ATT_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, "Accer. Compet.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 12, 112, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, "Accertato Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_ACCERTCOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_ACCERTCOMPET, PPQRY_VISTATOTOPE, "A.ACCERTATO_COMP", "ACCERTATO_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 64, 136, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONIBILI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONIBILI1, PPQRY_VISTATOTOPE, "A.DISPONIBILITA_E", "DISPONIBILITA_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 20, 160, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, "Variazioni Provvisorie");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROVV1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROVV1, PPQRY_VISTATOTOPE, "A.VARCOMPRO_E", "VARCOMPRO_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 328, 40, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISINIZIA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISINIZIA, PPQRY_VISTATOTOPE, "A.PREVISIONE_INI_S", "PREVISIONE_INI_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 368, 64, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZIONI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZIONI, PPQRY_VISTATOTOPE, "A.VARIAZIONI_S", "VARIAZIONI_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 328, 88, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, "Previsione Attuale ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISATTUAL, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISATTUAL, PPQRY_VISTATOTOPE, "A.PREVISIONE_ATT_S", "PREVISIONE_ATT_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, "Impeg. Compet.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 300, 112, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 156);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, "Impegnato Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_IMPEGNCOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_IMPEGNCOMPET, PPQRY_VISTATOTOPE, "A.IMPEGNATO_COMP", "IMPEGNATO_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 360, 136, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONIBILIT, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONIBILIT, PPQRY_VISTATOTOPE, "A.DISPONIBILITA_S", "DISPONIBILITA_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variaz. Provv.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 312, 160, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variazioni Provvisorie ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROVVI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROVVI, PPQRY_VISTATOTOPE, "A.VARCOMPRO_S", "VARCOMPRO_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 76, 12, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 168, 12, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_LABELENTRATA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_LABELENTRATA, -1, "", "LABELENTRATA", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 84, 20, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 464, 16, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_LABELSPESA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_LABELSPESA, -1, "", "LABELSPESA", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 228, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 260, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRPREINENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRPREINENFI, -1, "", "APRPREINENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 236, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 260, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRELEVAENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRELEVAENFI, -1, "", "APRELEVAENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 244, 52, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 556, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRPREINSPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRPREINSPFI, -1, "", "APRPREINSPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 260, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRACCDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRACCDICOFI, -1, "", "APRACCDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 260, 164, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRVARPRENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRVARPRENFI, -1, "", "APRVARPRENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 556, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRELEVASPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRELEVASPFI, -1, "", "APRELEVASPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 556, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRIMPDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRIMPDICOFI, -1, "", "APRIMPDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 556, 164, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRVARPRSPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRVARPRSPFI, -1, "", "APRVARPRSPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 324, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_FINANZIAMEN1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_FINANZIAMEN1, PPQRY_VISTATOTOPE, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_LIST, "Disponibilità Provvisoria");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_FORM, 12, 184, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVV1, MyGlb.PANEL_FORM, "Disponibilità Provvisoria");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONPROVV1, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPONPROVV1, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONPROVV1, PPQRY_VISTATOTOPE, "A.DISPONIBILITA_E + A.VARCOMPRO_E", "VISTOTOPDIPR", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_LIST, "Disponibilità Provvisoria ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_FORM, 292, 184, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_FORM, 164);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONPROVVI, MyGlb.PANEL_FORM, "Disponibilità Provvisoria ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONPROVVI, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPONPROVVI, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONPROVVI, PPQRY_VISTATOTOPE, "A.DISPONIBILITA_S + A.VARCOMPRO_S", "VISTOOPDIPR1", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_LIST, "Variazioni Proposte");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_FORM, 12, 208, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO1, MyGlb.PANEL_FORM, "Variazioni Proposte");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPO1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPO1, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_1", "PROPOSTE_E_1", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_LIST, "Variazioni Proposte ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_FORM, 12, 208, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO2, MyGlb.PANEL_FORM, "Variazioni Proposte ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPO2, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPO2, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_2", "PROPOSTE_E_2", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_LIST, "Variazioni Proposte  ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_FORM, 12, 208, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO3, MyGlb.PANEL_FORM, "Variazioni Proposte  ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPO3, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPO3, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_3", "PROPOSTE_E_3", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_LIST, "Variazioni Proposte    ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_FORM, 320, 208, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO4, MyGlb.PANEL_FORM, "Variazioni Proposte    ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPO4, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPO4, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_1", "PROPOSTE_S_1", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_LIST, "Variazioni Proposte      ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_FORM, 320, 208, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPO5, MyGlb.PANEL_FORM, "Variazioni Proposte      ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPO5, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPO5, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_2", "PROPOSTE_S_2", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_LIST, "Variazioni Proposte       ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_FORM, 320, 208, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROPOS, MyGlb.PANEL_FORM, "Variazioni Proposte       ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROPOS, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROPOS, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_3", "PROPOSTE_S_3", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_LIST, 132);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_LIST, "Disponibilità Con Proposte");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_FORM, 0, 232, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO1, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPRO1, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPRO1, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPRO1, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_1 + A.DISPONIBILITA_E + A.VARCOMPRO_E", "VITOOPDICOPR", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_LIST, "Disponibilità Con Proposte        ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_FORM, 0, 232, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO2, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPRO2, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPRO2, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPRO2, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_2 + A.DISPONIBILITA_E + A.VARCOMPRO_E", "VITOOPDICOP1", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_LIST, "Disponibilità Con Proposte      ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_FORM, 0, 232, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_FORM, 160);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO3, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPRO3, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPRO3, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPRO3, PPQRY_VISTATOTOPE, "A.PROPOSTE_E_3 + A.DISPONIBILITA_E + A.VARCOMPRO_E", "VITOOPDICOP2", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_LIST, "Disponibilità Con Proposte    ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_FORM, 276, 232, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_FORM, 180);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO4, MyGlb.PANEL_FORM, "Disponibilità Con Proposte    ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPRO4, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPRO4, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPRO4, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_3 + A.DISPONIBILITA_S + A.VARCOMPRO_S", "VITOOPDICOP3", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_LIST, 144);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_LIST, "Disponibilità Con Proposte ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_FORM, 292, 232, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_FORM, 164);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPRO5, MyGlb.PANEL_FORM, "Disponibilità Con Proposte ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPRO5, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPRO5, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPRO5, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_1 + A.DISPONIBILITA_S + A.VARCOMPRO_S", "VITOOPDICOP4", 2, 19, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_LIST, 152);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_LIST, "Disponibilità Con Proposte   ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_FORM, 284, 232, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_FORM, 172);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPOCONPROP, MyGlb.PANEL_FORM, "Disponibilità Con Proposte   ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPOCONPROP, -1, -1);
    PAN_SITUAZIONE.SetFieldUnbound(PFL_SITUAZIONE_DISPOCONPROP, true);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPOCONPROP, PPQRY_VISTATOTOPE, "A.PROPOSTE_S_2 + A.DISPONIBILITA_S + A.VARCOMPRO_S", "VITOOPDICOP5", 2, 19, 0, -13997);
  }

  private void PAN_SITUAZIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZIONE.SetIMDB(IMDB, "PQRY_VISTATOTOPE", true);
    PAN_SITUAZIONE.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.PREVISIONE_INI_E as PREVISIONE_INI_E, ");
    SQL.append("  A.VARIAZIONI_E as VARIAZIONI_E, ");
    SQL.append("  A.PREVISIONE_ATT_E as PREVISIONE_ATT_E, ");
    SQL.append("  A.ACCERTATO_COMP as ACCERTATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_E as DISPONIBILITA_E, ");
    SQL.append("  A.VARCOMPRO_E as VARCOMPRO_E, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PREVISIONE_INI_S as PREVISIONE_INI_S, ");
    SQL.append("  A.VARIAZIONI_S as VARIAZIONI_S, ");
    SQL.append("  A.PREVISIONE_ATT_S as PREVISIONE_ATT_S, ");
    SQL.append("  A.IMPEGNATO_COMP as IMPEGNATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_S as DISPONIBILITA_S, ");
    SQL.append("  A.VARCOMPRO_S as VARCOMPRO_S, ");
    SQL.append("  A.DISPONIBILITA_E + A.VARCOMPRO_E as VISTOTOPDIPR, ");
    SQL.append("  A.DISPONIBILITA_S + A.VARCOMPRO_S as VISTOOPDIPR1, ");
    SQL.append("  A.PROPOSTE_E_1 + A.DISPONIBILITA_E + A.VARCOMPRO_E as VITOOPDICOPR, ");
    SQL.append("  A.PROPOSTE_E_1 as PROPOSTE_E_1, ");
    SQL.append("  A.PROPOSTE_E_2 as PROPOSTE_E_2, ");
    SQL.append("  A.PROPOSTE_E_3 as PROPOSTE_E_3, ");
    SQL.append("  A.PROPOSTE_S_1 as PROPOSTE_S_1, ");
    SQL.append("  A.PROPOSTE_S_2 as PROPOSTE_S_2, ");
    SQL.append("  A.PROPOSTE_S_3 as PROPOSTE_S_3, ");
    SQL.append("  A.PROPOSTE_E_2 + A.DISPONIBILITA_E + A.VARCOMPRO_E as VITOOPDICOP1, ");
    SQL.append("  A.PROPOSTE_E_3 + A.DISPONIBILITA_E + A.VARCOMPRO_E as VITOOPDICOP2, ");
    SQL.append("  A.PROPOSTE_S_1 + A.DISPONIBILITA_S + A.VARCOMPRO_S as VITOOPDICOP4, ");
    SQL.append("  A.PROPOSTE_S_2 + A.DISPONIBILITA_S + A.VARCOMPRO_S as VITOOPDICOP5, ");
    SQL.append("  A.PROPOSTE_S_3 + A.DISPONIBILITA_S + A.VARCOMPRO_S as VITOOPDICOP3 ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_VISTA_TOT_FIN A ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_PARAMETRI35.PARAMESERCIZ~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~PQRY_PARAMETRI35.PARACODIFINA~~) ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE, 5, SQL, -1, "");
    PAN_SITUAZIONE.SetQueryDB(PPQRY_VISTATOTOPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZIONE.SetMasterTable(0, "POL_VISTA_TOT_FIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZIONE.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZIONE.iUseListQBE;
      PAN_SITUAZIONE.iUseListQBE = 0;
      PAN_SITUAZIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZIONE.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZIONE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ARCHIVIO_Init()
  {

    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "8E7BCB7F-7F19-4584-BBAE-838F6852F44E");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "Codice");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "D2CB788B-5142-44AE-9DA4-5653482B3C81");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "Descrizione");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "2CA44154-D3C4-4B1E-B0C0-9A58A8A6E77D");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "EB58B8F8-796B-4BF5-8AD8-5EBC24508BD8");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "Ente");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "63BB4CC5-5962-481C-8952-547E0B2B4032");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "Anno Mutuo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "EE97789E-1660-44C4-8FA6-266351058F9D");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "Numero Mutuo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "7FDDAA68-04DE-4C16-8309-73726ECF4177");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "Note");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "3984A907-1CAB-45B7-8FEB-CA76C93251B1");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "Importo Originale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "34052F5F-DD58-42E0-9484-02ACD3C86F8B");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "Scadenza");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, "64273090-29A9-4CCA-89AB-F07B06B3052C");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, "Ente");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, "3761406F-163E-4E2B-B40C-4B9EA9EF896E");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, "/");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, "4A4C13CC-C748-4CD7-A4F9-247422AF6F68");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, "Numero/Anno Mutuo");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "F922F3A0-A4A0-45DC-A07D-2C366AC5C228");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "Categoria");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "365ACF45-F874-4201-BA9E-60ABE4FA1474");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "Durata Desc");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, "90CC21F8-01C5-4848-B3A8-3D228EA31C7E");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, "Allegato Al P.E.G.");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "DF84ECDF-9F0C-4B94-BB7B-05521F6B4829");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "A9196F8D-1646-447E-9405-56BC26DE5500");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "Flessibilità");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "67CBF252-471B-4614-84EA-FCE47848F176");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "Dipartimento");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "EDCDC36D-A179-41A9-97F3-4E6A4030DF6E");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "Legge Regionale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "B104CCF0-32C1-4D0E-937E-E98A6B431C2B");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "Capitolo Regionale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "47E4D0E2-E12B-4599-A4A8-7584749E3B62");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "Atto Assegnazione");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, "36769DF4-3EB1-4F80-B5A9-E44120843A3C");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.VIS_STATICBUTTON);
    PAN_ARCHIVIO.SetImage(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, 0, "nota bianca.gif", false);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, "E0E8E512-99E8-4867-B579-E2F81857AF05");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.VIS_STATICBUTTON);
    PAN_ARCHIVIO.SetImage(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, 0, "nota scritta.gif", false);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "C67054BE-0811-4FD0-AD17-DDDC5D264950");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "Servizio Operativo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "If Equal (FINANZIAMENTI SERVIZIO OPERATIVO, null, \"\", Fill Left (To String (OPESER SERVIZIO), 6, \" \") + \" - \" + OPESER DESCRIZIONE)");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "4C063002-1FAE-4AB6-BDED-1D65EFA5365E");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "Settore Operativo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "If Equal (FINANZIAMENTI SETTORE OPERATIVO, null, \"\", Fill Left (To String (OPESET SETTORE), 6, \" \") + \" - \" + OPESET DESCRIZIONE)");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ARCHIVIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 108, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CODICE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CODICE, PPQRY_FINANZIAME28, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 184, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 84, 28, 428, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DESCRIZIONE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DESCRIZIONE, PPQRY_FINANZIAME28, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 140);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 164, 68, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Rag. Sociale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_RAGIONSOCIAL, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_RAGIONSOCIAL, PPQRY_FINANZIAME28, "B.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 36);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, "Ente");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 432, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 32);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, "Ente");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ENTE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ENTE, PPQRY_FINANZIAME28, "A.ENTE", "ENTE", 1, 6, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 76);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, "Ann. Mut.");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 280, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 68);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, "Ann. Mut.");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ANNOMUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ANNOMUTUO, PPQRY_FINANZIAME28, "A.ANNO_MUTUO", "ANNO_MUTUO", 1, 4, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 92);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, "Numero Mutuo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 164, 92, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 80);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, "Num. Mutuo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NUMEROMUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NUMEROMUTUO, PPQRY_FINANZIAME28, "A.NUMERO_MUTUO", "NUMERO_MUTUO", 5, 10, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 4, 208, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 124, 260, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 36);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTE1, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTE1, PPQRY_FINANZIAME28, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, "Importo Originale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 52, 116, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 108);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, "Importo Originale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_IMPORTORIGIN, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_IMPORTORIGIN, PPQRY_FINANZIAME28, "A.IMPORTO_ORIG", "IMPORTO_ORIG", 3, 14, 2, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, "Scad.");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 76, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SCADENZA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SCADENZA, PPQRY_FINANZIAME28, "A.SCADENZA", "SCADENZA", 1, 4, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 20, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 124, 68, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_LABELENTE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_LABELENTE, -1, "", "LABELENTE", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 184, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 264, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_BARRA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 28, 76, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 52, 92, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_MUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_MUTUO, -1, "", "MUTUO", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 76, 140, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CATEGORIA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_CATEGORIA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CATEGORIA, PPQRY_FINANZIAME28, "DECODE(A.CATEGORIA, to_number(NULL), '', TO_CHAR ( A.CATEGORIA ) || ' - ' || C.DESCRIZIONE)", "FINANZCATEGO", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 68);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, "Durata Desc");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 64, 164, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, "Durata Desc");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DURATADESC, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_DURATADESC, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DURATADESC, PPQRY_FINANZIAME28, "DECODE(A.TIPO_DURATA, 'A', 'Annuale', DECODE(A.TIPO_DURATA, 'P', 'Pluriennale', 'Nulla'))", "FINADURADESC", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_LIST, "Allegato Al P.E.G.");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_FORM, 56, 212, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_FORM, 104);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGATALPEG, MyGlb.PANEL_FORM, "Allegato Al P.E.G.");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ALLEGATALPEG, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_ALLEGATALPEG, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ALLEGATALPEG, PPQRY_FINANZIAME28, "DECODE(A.COD_ALLEGATO, to_number(NULL), '', TO_CHAR ( A.COD_ALLEGATO ) || ' - ' || D.DESC_ABB)", "FINAALLALPEG", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 132);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 8, 236, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 152);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_FINANZDISAVA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_FINANZDISAVA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_FINANZDISAVA, PPQRY_FINANZIAME28, "DECODE(A.COD_FIN_DISAV, to_number(NULL), '', TO_CHAR ( A.COD_FIN_DISAV ) || ' - ' || E.DESCRIZIONE)", "FINAFINADISA", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 56);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, "Flessibilità");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 84, 284, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 76);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, "Flessibilità");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_FLESSIBILITA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_FLESSIBILITA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_FLESSIBILITA, PPQRY_FINANZIAME28, "DECODE(A.FLESSIBILITA, to_number(NULL), '', H.CODICE || ' - ' || H.DESCRIZIONE)", "FINANZFLESSI", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 0, 36, 380, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, "Dipartimento");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 56, 308, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 104);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, "Dipartimento");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DIPARTIMENTO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DIPARTIMENTO, PPQRY_FINANZIAME28, "A.DIPARTIMENTO", "DIPARTIMENTO", 5, 150, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 64);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, "Legge Regionale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 52, 332, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 108);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, "Legge Regionale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_LEGGEREGIONA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_LEGGEREGIONA, PPQRY_FINANZIAME28, "A.LEGGE_REG", "LEGGE_REG", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, "Capitolo Regionale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 40, 356, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 120);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, "Capitolo Regionale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CAPITOREGION, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CAPITOREGION, PPQRY_FINANZIAME28, "A.CAPITOLO_REG", "CAPITOLO_REG", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 60);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, "Atto Assegnazione");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 40, 380, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 120);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, "Atto Assegnazione");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ATTOASSEGNAZ, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ATTOASSEGNAZ, PPQRY_FINANZIAME28, "A.ATTO_ASS", "ATTO_ASS", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 472, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 496, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTAVUOTA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTAVUOTA, -1, "", "NOTAVUOTA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 480, 268, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 496, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTAPIENA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTAPIENA, -1, "", "NOTAPIENA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, "Servizio Operativo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 12, 412, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SERVIZOPERAT, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_SERVIZOPERAT, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SERVIZOPERAT, PPQRY_FINANZIAME28, "DECODE(A.SERVIZIO_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( G.SERVIZIO ), 6, SUBSTR(' ', 1, 1)) || ' - ' || G.DESCRIZIONE)", "FINASERVOPER", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, "Settore Operativo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 4, 404, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, "Settore Operativo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SETTOROPERAT, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_SETTOROPERAT, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SETTOROPERAT, PPQRY_FINANZIAME28, "DECODE(A.SETTORE_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( F.SETTORE ), 6, SUBSTR(' ', 1, 1)) || ' - ' || F.DESCRIZIONE)", "FINASETTOPER", 5, 99, 0, -13997);
  }

  private void PAN_ARCHIVIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ARCHIVIO.SetIMDB(IMDB, "PQRY_FINANZIAME28", true);
    PAN_ARCHIVIO.set_SetString(MyGlb.MASTER_ROWNAME, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ENTE as ENTE, ");
    SQL.append("  A.ANNO_MUTUO as ANNO_MUTUO, ");
    SQL.append("  A.NUMERO_MUTUO as NUMERO_MUTUO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.COD_ALLEGATO as COD_ALLEGATO, ");
    SQL.append("  A.IMPORTO_ORIG as IMPORTO_ORIG, ");
    SQL.append("  A.TIPO_DURATA as TIPO_DURATA, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.SALDO_INI_CASSA as SALDO_INI_CASSA, ");
    SQL.append("  A.SALDO_INI_TESORERIA as SALDO_INI_TESORERIA, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  DECODE(A.TIPO_DURATA, 'A', 'Annuale', DECODE(A.TIPO_DURATA, 'P', 'Pluriennale', 'Nulla')) as FINADURADESC, ");
    SQL.append("  D.DESC_ABB as DESC_ABB, ");
    SQL.append("  E.DESCRIZIONE as FINADISADESC, ");
    SQL.append("  A.COD_FIN_DISAV as COD_FIN_DISAV, ");
    SQL.append("  A.LEGGE_REG as LEGGE_REG, ");
    SQL.append("  A.CAPITOLO_REG as CAPITOLO_REG, ");
    SQL.append("  A.ATTO_ASS as ATTO_ASS, ");
    SQL.append("  A.DIPARTIMENTO as DIPARTIMENTO, ");
    SQL.append("  DECODE(A.SERVIZIO_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( G.SERVIZIO ), 6, SUBSTR(' ', 1, 1)) || ' - ' || G.DESCRIZIONE) as FINASERVOPER, ");
    SQL.append("  DECODE(A.SETTORE_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( F.SETTORE ), 6, SUBSTR(' ', 1, 1)) || ' - ' || F.DESCRIZIONE) as FINASETTOPER, ");
    SQL.append("  DECODE(A.FLESSIBILITA, to_number(NULL), '', H.CODICE || ' - ' || H.DESCRIZIONE) as FINANZFLESSI, ");
    SQL.append("  DECODE(A.CATEGORIA, to_number(NULL), '', TO_CHAR ( A.CATEGORIA ) || ' - ' || C.DESCRIZIONE) as FINANZCATEGO, ");
    SQL.append("  DECODE(A.COD_ALLEGATO, to_number(NULL), '', TO_CHAR ( A.COD_ALLEGATO ) || ' - ' || D.DESC_ABB) as FINAALLALPEG, ");
    SQL.append("  DECODE(A.COD_FIN_DISAV, to_number(NULL), '', TO_CHAR ( A.COD_FIN_DISAV ) || ' - ' || E.DESCRIZIONE) as FINAFINADISA ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  BEN B, ");
    SQL.append("  CATEGORIE_FIN C, ");
    SQL.append("  T69 D, ");
    SQL.append("  FINANZIAMENTI_DISAV E, ");
    SQL.append("  OPESET F, ");
    SQL.append("  OPESER G, ");
    SQL.append("  FLESSIBILITA H ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ENTE = B.CODICE(+)) ");
    SQL.append("and   (A.CATEGORIA = C.CODICE(+)) ");
    SQL.append("and   (A.COD_ALLEGATO = D.CODICE(+)) ");
    SQL.append("and   (A.COD_FIN_DISAV = E.CODICE(+)) ");
    SQL.append("and   (A.SETTORE_OPERATIVO = F.SETTORE(+)) ");
    SQL.append("and   (A.SETTORE_OPERATIVO = G.SETTORE(+)) ");
    SQL.append("and   (A.SERVIZIO_OPERATIVO = G.SERVIZIO(+)) ");
    SQL.append("and   (A.FLESSIBILITA = H.CODICE(+)) ");
    SQL.append("and   (A.CODICE = ~~PQRY_PARAMETRI35.PARACODIFINA~~) ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME28, 5, SQL, -1, "");
    PAN_ARCHIVIO.SetQueryDB(PPQRY_FINANZIAME28, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ARCHIVIO.SetMasterTable(0, "FINANZIAMENTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ARCHIVIO.Status() == 2)
    {
      int oldListQBE = PAN_ARCHIVIO.iUseListQBE;
      PAN_ARCHIVIO.iUseListQBE = 0;
      PAN_ARCHIVIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ARCHIVIO.PanelCommand(Glb.PCM_FIND);
      PAN_ARCHIVIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "3DFFAC54-E5AA-44C1-ADF5-671927153346");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "A47AEC58-5105-488C-AB16-885A64456982");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "3EE536B1-EEAE-4C25-859D-75B16CA3D527");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "Data Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "D3BAFA86-D457-42E7-83C9-D05C45BAE61F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finan.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 124, 8, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINANZIAMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINANZIAMENT, PPQRY_PARAMETRI35, "A.PARACODIFINA", "PARACODIFINA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 296, 8, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIFINANZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIFINANZ, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, "Data Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 4, 24, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, "Dt. Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAAL, PPQRY_PARAMETRI35, "A.PARAMDATAAL", "PARAMDATAAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 0, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMETRI35, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~PARACODIFINA~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~PARAMESERCIZ~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAMETRI_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI35", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI35, IMDBDef12.PQRY_PARAMETRI35_RS, IMDBDef4.TBL_PARAMETRI125);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FINANZIAMENT, IMDBDef4.FLD_PARAMETRI125_PARACODIFINA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAAL, IMDBDef4.FLD_PARAMETRI125_PARAMDATAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef4.FLD_PARAMETRI125_PARAMESERCIZ);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI125");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_ValidateRow(Cancel);
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_DynamicProperties();
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TAB_INFORMFINANZ) TAB_INFORMFINANZ_Click(PreviousPage, Cancel);
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
