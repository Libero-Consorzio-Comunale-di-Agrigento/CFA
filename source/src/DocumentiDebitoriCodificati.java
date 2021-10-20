// **********************************************
// Documenti Debitori Codificati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiDebitoriCodificati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_FINOAL = 0;
  private static int PFL_FILTRO_TIPOREGISTR1 = 1;
  private static int PFL_FILTRO_TIPOBOLLATO1 = 2;
  private static int PFL_FILTRO_TIPOREGIBOLL = 3;
  private static int PFL_FILTRO_DACONTABILIZ = 4;

  private static int PPQRY_FILTRO7 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_FILTRO;
  private static int GRP_DOCUMDACONTA_RIFERIESTERN = 0;

  private static int PFL_DOCUMDACONTA_NUMERODOC = 0;
  private static int PFL_DOCUMDACONTA_DATADOC = 1;
  private static int PFL_DOCUMDACONTA_TIPO = 2;
  private static int PFL_DOCUMDACONTA_IMPORTO = 3;
  private static int PFL_DOCUMDACONTA_IMPORTRITENU = 4;
  private static int PFL_DOCUMDACONTA_CLIENTE = 5;
  private static int PFL_DOCUMDACONTA_RAGIONSOCIAL = 6;
  private static int PFL_DOCUMDACONTA_CODICEFISCAL = 7;
  private static int PFL_DOCUMDACONTA_PARTITAIVA = 8;
  private static int PFL_DOCUMDACONTA_NUMQUIETANZA = 9;
  private static int PFL_DOCUMDACONTA_T02DESCRIZIO = 10;
  private static int PFL_DOCUMDACONTA_SCADENZA = 11;
  private static int PFL_DOCUMDACONTA_PROVENIENZA = 12;
  private static int PFL_DOCUMDACONTA_DOCUMENTO = 13;
  private static int PFL_DOCUMDACONTA_DEBITORE = 14;
  private static int PFL_DOCUMDACONTA_QUIETANZA = 15;
  private static int PFL_DOCUMDACONTA_RAGIONSOCIA1 = 16;
  private static int PFL_DOCUMDACONTA_ESERCIZIO = 17;
  private static int PFL_DOCUMDACONTA_TIPOREGISTRO = 18;
  private static int PFL_DOCUMDACONTA_TIPOBOLLATO = 19;
  private static int PFL_DOCUMDACONTA_ANNODOC = 20;
  private static int PFL_DOCUMDACONTA_NUMERDOCESTE = 21;
  private static int PFL_DOCUMDACONTA_DATADOCESTER = 22;

  private static int PPQRY_FATIMPORT1 = 0;

  private static int PPQRY_T02 = 1;
  private static int PPQRY_BEN = 2;


  IDPanel PAN_DOCUMDACONTA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO12(IMDB);
    //
    //
    Init_PQRY_FILTRO7(IMDB);
    Init_PQRY_FILTRO7_RS(IMDB);
    Init_PQRY_FATIMPORT1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FILTRO12, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_FILTRO12, "TBL_FILTRO12");
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO12,IMDBDef2.FLD_FILTRO12_FILTRDACONTA,1,8,0);
    IMDB.TblAddNew(IMDBDef2.TBL_FILTRO12, 0);
  }

  private static void Init_PQRY_FILTRO7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FILTRO7, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_FILTRO7, "PQRY_FILTRO7");
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7,IMDBDef9.PQSL_FILTRO7_FILTRDACONTA,1,8,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FILTRO7, 0);
  }

  private static void Init_PQRY_FILTRO7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FILTRO7_RS, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_FILTRO7_RS, "PQRY_FILTRO7_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO7_RS,IMDBDef9.PQSL_FILTRO7_FILTRDACONTA,1,8,0);
  }

  private static void Init_PQRY_FATIMPORT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATIMPORT1, 37);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATIMPORT1, "PQRY_FATIMPORT1");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_DOC,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_DATA_DOC, "DATA_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_DATA_DOC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CODICE_DOC,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CLIENTE, "CLIENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CLIENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_RAGIONE_SOCIALE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_1, "INDIRIZZO_1");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_1,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_2, "INDIRIZZO_2");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_2,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_3, "INDIRIZZO_3");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_INDIRIZZO_3,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_COMUNE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PROVINCIA,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_SCADENZA, "TIPO_SCADENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_TIPO_SCADENZA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CONTROPARTITA, "CONTROPARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CONTROPARTITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PROVENIENZA, "PROVENIENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_PROVENIENZA,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ANNO_PARTITA, "ANNO_PARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_ANNO_PARTITA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_PARTITA, "NUMERO_PARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_NUMERO_PARTITA,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATPRI_ANNO_PROG, "FATPRI_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATPRI_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATPRI_NUMERO_PROG, "FATPRI_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATPRI_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_CATEGORIA,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATIMPDADOES, "FATIMPDADOES");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATIMPDADOES,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATIMPNUDOES, "FATIMPNUDOES");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_FATIMPNUDOES,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_IMPORTRITENU, "IMPORTRITENU");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT1,IMDBDef9.PQSL_FATIMPORT1_IMPORTRITENU,3,28,6);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATIMPORT1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiDebitoriCodificati(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiDebitoriCodificati()
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
    FormIdx = MyGlb.FRM_DOCUDEBICODI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A875292B-0684-4AC2-8929-BC0D5CAC37DF";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1044;
    DesignHeight = 542;
    set_Caption(new IDVariant("Documenti Debitori Codificati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1044;
    Frames[1].Height = 516;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.116279;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1044;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1044-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "09AB0D4E-4099-4DC1-987C-DC7E35708498");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 352, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1044;
    Frames[3].Height = 456;
    Frames[3].Caption = "Documenti Da Contabilizzare";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 456;
    PAN_DOCUMDACONTA = new IDPanel(w, this, 3, "PAN_DOCUMDACONTA");
    Frames[3].Content = PAN_DOCUMDACONTA;
    PAN_DOCUMDACONTA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMDACONTA.VS = MainFrm.VisualStyleList;
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1044-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3C82D19B-1ABD-47E1-8B29-0864E92BC33D");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1428, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMDACONTA.InitStatus = 1;
    PAN_DOCUMDACONTA_Init();
    PAN_DOCUMDACONTA_InitFields();
    PAN_DOCUMDACONTA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA2+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIU5+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONE1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIU5+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTABDOCUME+BaseCmdLinIdx)
      {
        Contabilizzazione();
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
      if (IMDB.TblModified(IMDBDef2.TBL_FILTRO12, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCUDEBICODI_FILTRO7();
      }
      PAN_FILTRO.UpdatePanel(MainFrm);
      PAN_DOCUMDACONTA.UpdatePanel(MainFrm);
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
    return (obj instanceof DocumentiDebitoriCodificati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiDebitoriCodificati.class.getName() : (Glb.ClassWithPackage(DocumentiDebitoriCodificati.class) ? DocumentiDebitoriCodificati.class.getName().substring(DocumentiDebitoriCodificati.class.getPackage().getName().length() + 1) : DocumentiDebitoriCodificati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Filtro On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
      // 
      // Filtro On Validate Row Event Body
      // Procedure Body
      // 
      PAN_DOCUMDACONTA.Freezed = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "FiltroOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro Tipo Registro Bollato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRO_TIPOREGIBOLL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro Tipo Registro Bollato Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOREGI, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, 0), (new IDVariant(0)), (new IDVariant(1)))));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL, 0, IDL.ToInteger(IDL.Trim(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, 0), (new IDVariant(2)), (new IDVariant(2))), true, true)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "FiltroTipoRegistroBollatoValidateEvent", _e);
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
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // 
      // Setto il primo della lista
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as DESCRIZIONE, ");
      SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
      SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA ");
      SQL.append("from ");
      SQL.append("  T04 A ");
      SQL.append("where (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5) ");
      SQL.append("order by 1 ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C2.setColUnbound(1,true);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTREGIBOLL, 0, new IDVariant(C2.Get("DESCRIZIONE")));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOREGI, 0, new IDVariant(C2.Get("T04TIPOREGIS")));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL, 0, new IDVariant(C2.Get("T04TIPOBOLLA")));
          v_CONTATORE = IDL.Add(v_CONTATORE, (new IDVariant(1)));
        }
        C2.MoveNext();
      }
      C2.Close();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_DOCUMDACONTA.Freezed = (new IDVariant(-1)).booleanValue();
      IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.STRINGA = 'Gestione Ritenute') ");
      SQL.append("and   (A.CHIAVE = 'PRODUCTS/FS') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.equals((new IDVariant(0)), true))
      {
        PAN_DOCUMDACONTA.SetFlags (Glb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DOCUMDACONTA.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMDACONTA.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_DOCUMDACONTA.set_ObjRect(Glb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DOCUMDACONTA.ObjRect(Glb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "LoadEvent", _e);
    }
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
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTROFINOAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOREGI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTREGIBOLL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTRDACONTA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti Da Contabilizzare On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMDACONTA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMDACONTA);
      // 
      // Documenti Da Contabilizzare On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DOCUMDACONTA.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMDACONTA_RAGIONSOCIAL,(new IDVariant(PAN_DOCUMDACONTA.FieldText(PFL_DOCUMDACONTA_RAGIONSOCIAL))).stringValue()); 
      PAN_DOCUMDACONTA.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMDACONTA_T02DESCRIZIO,(new IDVariant(PAN_DOCUMDACONTA.FieldText(PFL_DOCUMDACONTA_T02DESCRIZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "DocumentiDaContabilizzareOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti Da Contabilizzare After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DOCUMDACONTA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Da Contabilizzare After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTRDACONTA, 0, (new IDVariant(PAN_DOCUMDACONTA.GetNumRows())));
      PAN_FILTRO.UpdatePanel(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "DocumentiDaContabilizzareAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti Da Contabilizzare On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_DOCUMDACONTA_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Da Contabilizzare On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DOCUMDACONTA.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI35+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI35+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "DocumentiDaContabilizzareOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Stampa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Elenco_Documenti"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_REGISTRO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_BOLLATO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTROFINOAL, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Contabilizzazione
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Contabilizzazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Contabilizzazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTTIPOREGI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTTIPOBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMREGBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTREGIBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMDOCEME, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO7, IMDBDef9.PQSL_FILTRO7_FILTROFINOAL, 0));
      MainFrm.Show(MyGlb.FRM_CONTABDOCUME, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriCodificati", "Contabilizzazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void DOCUDEBICODI_FILTRO7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_FILTRO7_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRO12, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FILTRO12, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_FILTRO7_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_FILTRO7_RS, 0, IMDBDef2.TBL_FILTRO12, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO7_RS, 0, 0, IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTROFINOAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO7_RS, 1, 0, IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOREGI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO7_RS, 2, 0, IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO7_RS, 3, 0, IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTREGIBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO7_RS, 4, 0, IMDBDef2.TBL_FILTRO12, IMDBDef2.FLD_FILTRO12_FILTRDACONTA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FILTRO12, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FILTRO12, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRO12, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_FILTRO7_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRO);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRO_TIPOREGIBOLL)
      {
        PFL_FILTRO_TIPOREGIBOLL_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMDACONTA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMDACONTA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMDACONTA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMDACONTA, Cancel);
    // Stub
  }

  private void PAN_DOCUMDACONTA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DOCUMDACONTA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMDACONTA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMDACONTA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "5D941483-E2BB-4E1C-8B43-FE6556B571F2");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "Fino al");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, "4E9A08E2-DE59-4731-A094-B6BDC4D94704");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, "Tipo Registro");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, "6DF6C386-D09E-447A-83B2-F20FB01F0BC5");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, "Tipo Bollato");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "A53A5100-130D-4E1A-B9D7-4E3F85D86A8B");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "952DD313-F510-4EE8-B01B-4A51D4AEF40C");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "Da contabilizzare");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 40);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, "Fino al");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 0, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 44);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, "Fino al");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_FINOAL, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_FINOAL, PPQRY_FILTRO7, "A.FILTROFINOAL", "FILTROFINOAL", 6, 15, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_LIST, 104, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_LIST, 72);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_FORM, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTR1, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOREGISTR1, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOREGISTR1, PPQRY_FILTRO7, "A.FILTTIPOREGI", "FILTTIPOREGI", 1, 8, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_LIST, 64);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_FORM, 216, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_FORM, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO1, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOBOLLATO1, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOBOLLATO1, PPQRY_FILTRO7, "A.FILTTIPOBOLL", "FILTTIPOBOLL", 1, 8, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 184, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 84);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 136, 4, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 128);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOREGIBOLL, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOREGIBOLL, PPQRY_FILTRO7, "A.FILTREGIBOLL", "FILTREGIBOLL", 5, 50, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 92);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, "Da cont.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 496, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 108);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, "Da contabilizzare");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_DACONTABILIZ, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_DACONTABILIZ, PPQRY_FILTRO7, "A.FILTRDACONTA", "FILTRDACONTA", 1, 8, 0, -13997);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) = ~~FILTREGIBOLL~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5) ");
    SQL.append("order by 1 ");
    PAN_FILTRO.SetQuery(PPQRY_T04, 0, SQL, PFL_FILTRO_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5) ");
    SQL.append("order by 1 ");
    PAN_FILTRO.SetQuery(PPQRY_T04, 1, SQL, PFL_FILTRO_TIPOREGIBOLL, "");
    PAN_FILTRO.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO7", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Filtro");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO7, IMDBDef9.PQRY_FILTRO7_RS, IMDBDef2.TBL_FILTRO12);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_FINOAL, IMDBDef2.FLD_FILTRO12_FILTROFINOAL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOREGISTR1, IMDBDef2.FLD_FILTRO12_FILTTIPOREGI);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOBOLLATO1, IMDBDef2.FLD_FILTRO12_FILTTIPOBOLL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOREGIBOLL, IMDBDef2.FLD_FILTRO12_FILTREGIBOLL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_DACONTABILIZ, IMDBDef2.FLD_FILTRO12_FILTRDACONTA);
    PAN_FILTRO.SetMasterTable(0, "FILTRO12");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCUMDACONTA_Init()
  {

    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, "DC7B801F-6816-42AA-A23A-0CA05BDCA79F");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, "Riferimento Esterno");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, MyGlb.PANEL_LIST, 1172, -9999, 256, 16, 0, 0);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, MyGlb.PANEL_FORM, 0, 339, 256, 73, 0, 0);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, 0, 113);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, 1, 13);
    PAN_DOCUMDACONTA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, 0, 4);
    PAN_DOCUMDACONTA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, 1, 4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCUMDACONTA_RIFERIESTERN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "6806B07F-AEA7-4338-9281-549F09288749");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "NUMERO DOC");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "Numero del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "C9A8DA64-6E62-4B3A-AE95-EE681C298671");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "DATA DOC");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "Data del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "8E71A10D-294B-453E-9A0C-C15AEF1A3BAE");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "Tipo");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "Tipo di documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "18AFCD12-3AA0-4573-BAA1-0564671236DF");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "Importo");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "Importo totale del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, "3CE7B7B0-CA8B-4C23-B5A3-267717E1039E");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, "Importo Ritenuta");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "49C51E8A-36F3-4889-8E49-26DD8D7995D6");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "CLIENTE");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "Codice del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, "44E0CA06-7907-400D-AE9B-0A6FC139AB12");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, "RAGIONE SOCIALE");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "277133E1-037E-4DC5-BF08-A69472E18F98");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "Codice Fiscale");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "B489FA4E-5CDA-4EE2-8353-3F4628D224C9");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "Partita Iva");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "8E154ECF-971F-4B42-B1B4-EBE608345CD6");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "Progressivo di quietanza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "6B0BEB71-EA19-4557-91C9-D2E475934B4B");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "T02 DESCRIZIONE");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "945E7842-B444-489C-8374-13FAF2A3AD97");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "Scadenza");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "Data di scadenza del pagamento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "CDCD6D0F-5D30-448E-A82C-2E3BE9BD6CA7");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "Provenienza");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "Provenienza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, "470443E7-83C8-4392-BA8A-2EC6469BA230");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, "Documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, "B254F2D8-7438-4464-BCC3-3A7B47638B3B");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, "Debitore");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, "423E4DD0-E06C-4410-B270-313FEBCBD212");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, "Quietanza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, "12432FA3-4673-4CB5-B496-DF5FFAA96407");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, "RAGIONE SOCIALE 1");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, "Ragione sociale del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, "A9BABD11-D7EE-417B-9407-A66AAC7AF0CA");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, "ESERCIZIO");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, "Esercizio Finanziario");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, "D5E4A4F2-414E-413D-9B7F-E5EF77CBD3E9");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, "Tipo registro IVA");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, "9C9AE3F1-E25C-40A1-8B40-1C1B373C1841");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, "Tipo bollato IVA");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, "D0DECEB8-4988-43B4-92AC-4019C972F52F");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, "ANNO DOC");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, "Anno del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, "18E5D11A-963C-4C4B-AE56-1E9E4BF2F185");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, "Numero");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, "AEE304D4-8E7E-4880-BD80-B7DA9EC5179F");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, "Data");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DOCUMDACONTA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_FORM, 4, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_NUMERODOC, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_NUMERODOC, PPQRY_FATIMPORT1, "A.NUMERO_DOC", "NUMERO_DOC", 5, 8, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 64, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, "DATA DOC");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DATADOC, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DATADOC, PPQRY_FATIMPORT1, "A.DATA_DOC", "DATA_DOC", 6, 19, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 144, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 4, 172, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_TIPO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_TIPO, PPQRY_FATIMPORT1, "A.CODICE_DOC", "CODICE_DOC", 1, 1, 0, -13997);
    PAN_DOCUMDACONTA.SetValueListItem(PFL_DOCUMDACONTA_TIPO, (new IDVariant(3)), "Fattura", "", "", -1);
    PAN_DOCUMDACONTA.SetValueListItem(PFL_DOCUMDACONTA_TIPO, (new IDVariant(4)), "Nota Accredito", "", "", -1);
    PAN_DOCUMDACONTA.SetValueListItem(PFL_DOCUMDACONTA_TIPO, (new IDVariant(8)), "Nota Addebito", "", "", -1);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_LIST, 232, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_FORM, 252, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_IMPORTO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_IMPORTO, PPQRY_FATIMPORT1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_LIST, 304, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_LIST, 136);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_LIST, "Importo Ritenuta");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_FORM, 4, 340, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_FORM, 136);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTRITENU, MyGlb.PANEL_FORM, "Importo Ritenuta");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_IMPORTRITENU, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(( ");
  SQL.append("select ");
  SQL.append("  B.RITENUTA ");
  SQL.append("from ");
  SQL.append("  RIT_IMPORT B ");
  SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("and   (B.TIPO_REGISTRO = A.TIPO_REGISTRO) ");
  SQL.append("and   (B.TIPO_BOLLATO = A.TIPO_BOLLATO) ");
  SQL.append("and   (B.ANNO_DOC = A.ANNO_DOC) ");
  SQL.append("and   (B.NUMERO_DOC = A.NUMERO_DOC) ");
  SQL.append("), 0)");
    PAN_DOCUMDACONTA.SetFieldUnbound(PFL_DOCUMDACONTA_IMPORTRITENU, true);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_IMPORTRITENU, PPQRY_FATIMPORT1, SQL.toString(), "IMPORTRITENU", 3, 28, 6, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 416, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 52);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, "CLIENTE");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 4, 196, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, "CLIENTE");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_CLIENTE, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_CLIENTE, PPQRY_FATIMPORT1, "A.CLIENTE", "CLIENTE", 1, 6, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 472, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_LIST, "RAGIONE SOCIALE");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIAL, MyGlb.PANEL_FORM, "RAG. SOC.");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_RAGIONSOCIAL, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_RAGIONSOCIAL, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 612, 36, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 140, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_CODICEFISCAL, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_CODICEFISCAL, PPQRY_BEN, "A.CODICE_FISCALE", "BENCODICFISC", 5, 16, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 724, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, "Partita Iva");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 140, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, "Partita Iva");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_PARTITAIVA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_PARTITAIVA, PPQRY_BEN, "A.PARTITA_IVA", "BENPARTITIVA", 5, 11, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 820, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, "NM. Q.");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 252, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_NUMQUIETANZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_NUMQUIETANZA, PPQRY_FATIMPORT1, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 848, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, "T02 DESCRIZIONE");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, "T02 DESCR.");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_T02DESCRIZIO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_T02DESCRIZIO, PPQRY_T02, "B.DESCRIZIONE", "T02DESCRIZIO", 5, 40, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 1016, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 132, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_SCADENZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_SCADENZA, PPQRY_FATIMPORT1, "A.SCADENZA", "SCADENZA", 6, 19, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 1092, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 80);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, "Provenienza");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 236, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 80);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, "Provenienza");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_PROVENIENZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_PROVENIENZA, PPQRY_FATIMPORT1, "A.PROVENIENZA", "PROVENIENZA", 5, 20, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DOCUMENTO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DOCUMENTO, -1, "", "DOCUMENTO", 0, 0, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 416, 0, 196, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 8, 8, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DEBITORE, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DEBITORE, -1, "", "DEBITORE", 0, 0, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 820, 0, 196, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 16, 16, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_QUIETANZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_QUIETANZA, -1, "", "QUIETANZA", 0, 0, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_LIST, "RAGIONE SOCIALE 1");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_FORM, 4, 316, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_RAGIONSOCIA1, MyGlb.PANEL_FORM, "RAG. SOCIALE 1");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_RAGIONSOCIA1, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_RAGIONSOCIA1, PPQRY_FATIMPORT1, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 50, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_ESERCIZIO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_ESERCIZIO, PPQRY_FATIMPORT1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_LIST, 96);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOREGISTRO, MyGlb.PANEL_FORM, "TIPO REGISTRO");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_TIPOREGISTRO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_TIPOREGISTRO, PPQRY_FATIMPORT1, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 316, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPOBOLLATO, MyGlb.PANEL_FORM, "TIPO BOLLATO");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_TIPOBOLLATO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_TIPOBOLLATO, PPQRY_FATIMPORT1, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_FORM, 4, 316, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_ANNODOC, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_ANNODOC, PPQRY_FATIMPORT1, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_LIST, 1172, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_LIST, 136);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_LIST, "Numero");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_FORM, 4, 388, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_FORM, 136);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERDOCESTE, MyGlb.PANEL_FORM, "Numero");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_NUMERDOCESTE, -1, GRP_DOCUMDACONTA_RIFERIESTERN);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_NUMERDOCESTE, PPQRY_FATIMPORT1, "A.NUMERO_DOC_ESTERNO", "FATIMPNUDOES", 5, 20, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_LIST, 1308, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_LIST, 120);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_LIST, "Data");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_FORM, 4, 364, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_FORM, 120);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOCESTER, MyGlb.PANEL_FORM, "Data");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DATADOCESTER, -1, GRP_DOCUMDACONTA_RIFERIESTERN);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DATADOCESTER, PPQRY_FATIMPORT1, "A.DATA_DOC_ESTERNO", "FATIMPDADOES", 6, 10, 0, -13997);
  }

  private void PAN_DOCUMDACONTA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.NUM_QUIETANZA = ~~NUM_QUIETANZA~~) ");
    SQL.append("and   (A.CODICE = ~~CLIENTE~~) ");
    SQL.append("and   (B.CODICE = A.TIPO_QUIETANZA) ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_T02, 0, SQL, -1, "");
    PAN_DOCUMDACONTA.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMDACONTA.SetMasterTable(PPQRY_T02, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.CODICE_FISCALE as BENCODICFISC, ");
    SQL.append("  A.PARTITA_IVA as BENPARTITIVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~CLIENTE~~) ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_DOCUMDACONTA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMDACONTA.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_DOCUMDACONTA.SetIMDB(IMDB, "PQRY_FATIMPORT1", true);
    PAN_DOCUMDACONTA.set_SetString(MyGlb.MASTER_ROWNAME, "FAT IMPORT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.NUMERO_REG as NUMERO_REG, ");
    SQL.append("  A.DATA_DOC as DATA_DOC, ");
    SQL.append("  A.CODICE_DOC as CODICE_DOC, ");
    SQL.append("  A.CLIENTE as CLIENTE, ");
    SQL.append("  A.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
    SQL.append("  A.INDIRIZZO_1 as INDIRIZZO_1, ");
    SQL.append("  A.INDIRIZZO_2 as INDIRIZZO_2, ");
    SQL.append("  A.INDIRIZZO_3 as INDIRIZZO_3, ");
    SQL.append("  A.CAP as CAP, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  A.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.TIPO_SCADENZA as TIPO_SCADENZA, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.CONTROPARTITA as CONTROPARTITA, ");
    SQL.append("  A.UTENTE as UTENTE, ");
    SQL.append("  A.PROVENIENZA as PROVENIENZA, ");
    SQL.append("  A.ANNO_PARTITA as ANNO_PARTITA, ");
    SQL.append("  A.NUMERO_PARTITA as NUMERO_PARTITA, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  A.FATPRI_ANNO_PROG as FATPRI_ANNO_PROG, ");
    SQL.append("  A.FATPRI_NUMERO_PROG as FATPRI_NUMERO_PROG, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.DATA_DOC_ESTERNO as FATIMPDADOES, ");
    SQL.append("  A.NUMERO_DOC_ESTERNO as FATIMPNUDOES, ");
    SQL.append("  NVL(( ");
    SQL.append("select ");
    SQL.append("  B.RITENUTA ");
    SQL.append("from ");
    SQL.append("  RIT_IMPORT B ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.TIPO_REGISTRO = A.TIPO_REGISTRO) ");
    SQL.append("and   (B.TIPO_BOLLATO = A.TIPO_BOLLATO) ");
    SQL.append("and   (B.ANNO_DOC = A.ANNO_DOC) ");
    SQL.append("and   (B.NUMERO_DOC = A.NUMERO_DOC) ");
    SQL.append("), 0) as IMPORTRITENU ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT_IMPORT A ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_FILTRO7.FILTTIPOREGI~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_FILTRO7.FILTTIPOBOLL~~) ");
    SQL.append("and   (A.DATA_DOC <= ~~PQRY_FILTRO7.FILTROFINOAL~~) ");
    SQL.append("and   ((A.FAT_ANNO_PROG IS NULL)) ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NUMERO_DOC ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT1, 5, SQL, -1, "");
    PAN_DOCUMDACONTA.SetQueryDB(PPQRY_FATIMPORT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMDACONTA.SetMasterTable(0, "FAT_IMPORT");
    PAN_DOCUMDACONTA.AddToSortList(PFL_DOCUMDACONTA_NUMERODOC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMDACONTA.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMDACONTA.iUseListQBE;
      PAN_DOCUMDACONTA.iUseListQBE = 0;
      PAN_DOCUMDACONTA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMDACONTA.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMDACONTA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCUMDACONTA) PAN_DOCUMDACONTA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
