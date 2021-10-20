// **********************************************
// Documenti Debitori Non Codificati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiDebitoriNonCodificati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_FINOAL = 0;
  private static int PFL_FILTRO_TIPOREGISTRO = 1;
  private static int PFL_FILTRO_TIPOBOLLATO = 2;
  private static int PFL_FILTRO_TIPOREGIBOLL = 3;
  private static int PFL_FILTRO_DACONTABILIZ = 4;
  private static int PFL_FILTRO_GIACONTABIVA = 5;

  private static int PPQRY_FILTRO2 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_DOCUMDACONTA_NUMERODOC = 0;
  private static int PFL_DOCUMDACONTA_DATADOC = 1;
  private static int PFL_DOCUMDACONTA_TIPO = 2;
  private static int PFL_DOCUMDACONTA_IMPORTO = 3;
  private static int PFL_DOCUMDACONTA_DEBITORE = 4;
  private static int PFL_DOCUMDACONTA_CODICEFISCAL = 5;
  private static int PFL_DOCUMDACONTA_PARTITAIVA = 6;
  private static int PFL_DOCUMDACONTA_NUMQUIETANZA = 7;
  private static int PFL_DOCUMDACONTA_T02DESCRIZIO = 8;
  private static int PFL_DOCUMDACONTA_SCADENZA = 9;
  private static int PFL_DOCUMDACONTA_PROVENIENZA = 10;
  private static int PFL_DOCUMDACONTA_DOCUMENTO = 11;
  private static int PFL_DOCUMDACONTA_QUIETANZA = 12;
  private static int PFL_DOCUMDACONTA_CLIENTE = 13;

  private static int PPQRY_FATIMPORT = 0;

  private static int PPQRY_T02 = 1;


  IDPanel PAN_DOCUMDACONTA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO13(IMDB);
    //
    //
    Init_PQRY_FILTRO2(IMDB);
    Init_PQRY_FILTRO2_RS(IMDB);
    Init_PQRY_FATIMPORT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FILTRO13, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_FILTRO13, "TBL_FILTRO13");
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILTRDACONTA,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILGIACONIVA, "FILGIACONIVA");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRO13,IMDBDef2.FLD_FILTRO13_FILGIACONIVA,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_FILTRO13, 0);
  }

  private static void Init_PQRY_FILTRO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FILTRO2, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_FILTRO2, "PQRY_FILTRO2");
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILTRDACONTA,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILGIACONIVA, "FILGIACONIVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2,IMDBDef9.PQSL_FILTRO2_FILGIACONIVA,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FILTRO2, 0);
  }

  private static void Init_PQRY_FILTRO2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FILTRO2_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_FILTRO2_RS, "PQRY_FILTRO2_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTROFINOAL, "FILTROFINOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTROFINOAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI, "FILTTIPOREGI");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL, "FILTTIPOBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, "FILTREGIBOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTRDACONTA, "FILTRDACONTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILTRDACONTA,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILGIACONIVA, "FILGIACONIVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FILTRO2_RS,IMDBDef9.PQSL_FILTRO2_FILGIACONIVA,5,2,0);
  }

  private static void Init_PQRY_FATIMPORT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATIMPORT, 34);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATIMPORT, "PQRY_FATIMPORT");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_DOC,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_REG, "NUMERO_REG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_REG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_DATA_DOC, "DATA_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_DATA_DOC,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CODICE_DOC,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CLIENTE, "CLIENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CLIENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_RAGIONE_SOCIALE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_1, "INDIRIZZO_1");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_1,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_2, "INDIRIZZO_2");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_2,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_3, "INDIRIZZO_3");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_INDIRIZZO_3,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_COMUNE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PROVINCIA,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_SCADENZA, "TIPO_SCADENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_TIPO_SCADENZA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CONTROPARTITA, "CONTROPARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CONTROPARTITA,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PROVENIENZA, "PROVENIENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_PROVENIENZA,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ANNO_PARTITA, "ANNO_PARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_ANNO_PARTITA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_PARTITA, "NUMERO_PARTITA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_NUMERO_PARTITA,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FATPRI_ANNO_PROG, "FATPRI_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FATPRI_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FATPRI_NUMERO_PROG, "FATPRI_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_FATPRI_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_CATEGORIA,5,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATIMPORT,IMDBDef9.PQSL_FATIMPORT_UFFICIO,1,5,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATIMPORT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiDebitoriNonCodificati(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiDebitoriNonCodificati()
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
    FormIdx = MyGlb.FRM_DOCDEBNONCOD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C1632886-65D4-4BBB-B21A-E53444277397";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1088;
    DesignHeight = 558;
    set_Caption(new IDVariant("Documenti Debitori Non Codificati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1088;
    Frames[1].Height = 532;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.112782;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1088;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1088-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BD358764-AE36-4F7B-B4E2-526243EBEFF5");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 464, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 1088;
    Frames[3].Height = 472;
    Frames[3].Caption = "Documenti Da Contabilizzare";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 472;
    PAN_DOCUMDACONTA = new IDPanel(w, this, 3, "PAN_DOCUMDACONTA");
    Frames[3].Content = PAN_DOCUMDACONTA;
    PAN_DOCUMDACONTA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMDACONTA.VS = MainFrm.VisualStyleList;
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1088-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7E878DE7-DCBC-4032-8A6D-32F7E712536F");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1060, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_STAMPA3+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIU7+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONE+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIU7+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTABILIIVA+BaseCmdLinIdx)
      {
        Contabilizzazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTFINAECON+BaseCmdLinIdx)
      {
        Contabilizzazione1();
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
      if (IMDB.TblModified(IMDBDef2.TBL_FILTRO13, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCDEBNONCOD_FILTRO2();
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
    return (obj instanceof DocumentiDebitoriNonCodificati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiDebitoriNonCodificati.class.getName() : (Glb.ClassWithPackage(DocumentiDebitoriNonCodificati.class) ? DocumentiDebitoriNonCodificati.class.getName().substring(DocumentiDebitoriNonCodificati.class.getPackage().getName().length() + 1) : DocumentiDebitoriNonCodificati.class.getName()));
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
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "FiltroOnValidateRowEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOREGI, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, 0), (new IDVariant(0)), (new IDVariant(1)))));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL, 0, IDL.ToInteger(IDL.Trim(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, 0), (new IDVariant(2)), (new IDVariant(2))), true, true)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "FiltroTipoRegistroBollatoValidateEvent", _e);
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
      SQL.append("where (A.TIPO_REGISTRO = 6) ");
      SQL.append("order by 1 ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C2.setColUnbound(1,true);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTREGIBOLL, 0, new IDVariant(C2.Get("DESCRIZIONE")));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOREGI, 0, new IDVariant(C2.Get("T04TIPOREGIS")));
          IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL, 0, new IDVariant(C2.Get("T04TIPOBOLLA")));
          v_CONTATORE = IDL.Add(v_CONTATORE, (new IDVariant(1)));
        }
        C2.MoveNext();
      }
      C2.Close();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_DOCUMDACONTA.Freezed = (new IDVariant(-1)).booleanValue();
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILGIACONIVA, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTROFINOAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOREGI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTREGIBOLL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTRDACONTA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILGIACONIVA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "UnloadEvent", _e);
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
      PAN_DOCUMDACONTA.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMDACONTA_T02DESCRIZIO,(new IDVariant(PAN_DOCUMDACONTA.FieldText(PFL_DOCUMDACONTA_T02DESCRIZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "DocumentiDaContabilizzareOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTRDACONTA, 0, (new IDVariant(PAN_DOCUMDACONTA.GetNumRows())));
      PAN_FILTRO.UpdatePanel(MainFrm);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "DocumentiDaContabilizzareAfterFindEvent", _e);
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
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI36+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI36+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "DocumentiDaContabilizzareOnChangeStatusEvent", _e);
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
      S = (new IDVariant("Elenco_Documenti_cnc"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_BOLLATO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTROFINOAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CONT")), IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILGIACONIVA, 0));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "Stampa", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM34, IMDBDef2.FLD_PARAM34_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM34, IMDBDef2.FLD_PARAM34_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM34, IMDBDef2.FLD_PARAM34_ROWNAMREGBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM34, IMDBDef2.FLD_PARAM34_ROWNAMDOCEME, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTROFINOAL, 0));
      MainFrm.Show(MyGlb.FRM_CONTABILIIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "Contabilizzazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Contabilizzazione 1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Contabilizzazione1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Contabilizzazione 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTTIPOREGI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTTIPOBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMREGBOL, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTREGIBOLL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMDOCEME, 0, IMDB.Value(IMDBDef9.PQRY_FILTRO2, IMDBDef9.PQSL_FILTRO2_FILTROFINOAL, 0));
      MainFrm.Show(MyGlb.FRM_CONTFINAECON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiDebitoriNonCodificati", "Contabilizzazione1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void DOCDEBNONCOD_FILTRO2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_FILTRO2_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRO13, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FILTRO13, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_FILTRO2_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_FILTRO2_RS, 0, IMDBDef2.TBL_FILTRO13, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 0, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTROFINOAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 1, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOREGI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 2, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 3, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTREGIBOLL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 4, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILTRDACONTA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_FILTRO2_RS, 5, 0, IMDBDef2.TBL_FILTRO13, IMDBDef2.FLD_FILTRO13_FILGIACONIVA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FILTRO13, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FILTRO13, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRO13, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_FILTRO2_RS, 0);
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
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "2400EFB4-02E6-49A4-BF6C-8FC816E88640");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "Fino al");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, "51ADC4F2-EDCB-47E6-9A23-A58BF70E7A93");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, "Tipo Registro");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, "A0CA1CBB-5C75-44E1-8A14-2CEBD79FB29D");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, "Tipo Bollato");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "255E7DCD-5631-444C-8A5B-DD550554FFE1");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "F736B66B-FE9B-474F-AFA3-D2F3C131923E");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "Da contabilizzare");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, "2148ECE9-32DD-4C38-A18F-9CFBAD8A6F73");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, "Già contabilizzati IVA");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 40);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_LIST, "Fino al");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 0, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 44);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_FINOAL, MyGlb.PANEL_FORM, "Fino al");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_FINOAL, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_FINOAL, PPQRY_FILTRO2, "A.FILTROFINOAL", "FILTROFINOAL", 6, 15, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 104, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOREGISTRO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOREGISTRO, PPQRY_FILTRO2, "A.FILTTIPOREGI", "FILTTIPOREGI", 1, 8, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 216, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOBOLLATO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOBOLLATO, PPQRY_FILTRO2, "A.FILTTIPOBOLL", "FILTTIPOBOLL", 1, 8, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 184, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 84);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 132, 4, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 128);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOREGIBOLL, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOREGIBOLL, PPQRY_FILTRO2, "A.FILTREGIBOLL", "FILTREGIBOLL", 5, 50, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 92);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_LIST, "Da cont.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 636, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 108);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DACONTABILIZ, MyGlb.PANEL_FORM, "Da contabilizzare");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_DACONTABILIZ, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_DACONTABILIZ, PPQRY_FILTRO2, "A.FILTRDACONTA", "FILTRDACONTA", 1, 8, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_LIST, 112);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_LIST, "Già contabilizzati IVA");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_FORM, 504, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_FORM, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_GIACONTABIVA, MyGlb.PANEL_FORM, "Già contabil. IVA");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_GIACONTABIVA, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_GIACONTABIVA, PPQRY_FILTRO2, "A.FILGIACONIVA", "FILGIACONIVA", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_GIACONTABIVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_GIACONTABIVA, (new IDVariant("NO")), "NO", "", "", -1);
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
    SQL.append("and   (A.TIPO_REGISTRO = 6) ");
    SQL.append("order by 1 ");
    PAN_FILTRO.SetQuery(PPQRY_T04, 0, SQL, PFL_FILTRO_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 6) ");
    SQL.append("order by 1 ");
    PAN_FILTRO.SetQuery(PPQRY_T04, 1, SQL, PFL_FILTRO_TIPOREGIBOLL, "");
    PAN_FILTRO.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO2", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Filtro");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO2, IMDBDef9.PQRY_FILTRO2_RS, IMDBDef2.TBL_FILTRO13);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_FINOAL, IMDBDef2.FLD_FILTRO13_FILTROFINOAL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOREGISTRO, IMDBDef2.FLD_FILTRO13_FILTTIPOREGI);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOBOLLATO, IMDBDef2.FLD_FILTRO13_FILTTIPOBOLL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOREGIBOLL, IMDBDef2.FLD_FILTRO13_FILTREGIBOLL);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_DACONTABILIZ, IMDBDef2.FLD_FILTRO13_FILTRDACONTA);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_GIACONTABIVA, IMDBDef2.FLD_FILTRO13_FILGIACONIVA);
    PAN_FILTRO.SetMasterTable(0, "FILTRO13");
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
    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "54CB2344-A8A0-466E-A8A7-E14B854F848D");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "NUMERO DOC");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, "Numero del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "224848AE-BF4B-424D-A3B1-B4BB3C87170C");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "DATA DOC");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, "Data del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "1BC393B3-9EBD-4464-8D03-699E16AAEC0C");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "Tipo");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, "Tipo di documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "DA3145BF-22D0-4CBE-ABC3-6ADE18BF480B");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "Importo");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, "Importo totale del documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, "88926C9F-FBC1-47FE-9D6D-918806523942");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, "Debitore");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, "Ragione sociale del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "87A16BEB-BD9C-467C-9C8C-2FB03C4C5FC8");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "Codice Fiscale");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, "Codice fiscale del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "85A7C112-8AFE-4E2F-A6CD-5B7712F9CE19");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "Partita IVA");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, "Partita Iva del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "956B27C2-CF91-4097-81EA-5935FEA6733A");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, "Progressivo di quietanza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "64EE5ED8-466F-4473-A66F-522FE6223ACC");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "T02 DESCRIZIONE");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, "");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "A938F065-C553-4D64-A1D8-1B3F6F60DE1C");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "Scadenza");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, "Data di scadenza del pagamento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "07C02FF4-7725-445A-8235-D49AABD4E78D");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "Provenienza");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, "Provenienza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, "3B6BAF4A-8C0A-46F1-BA07-D9A7552DC0F2");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, "Documento");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, "03C6D609-31EF-4765-92DF-E30AE2EB634C");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, "Quietanza");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.VIS_LABEVISUSTYL);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DOCUMDACONTA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "9940C786-FF80-49E4-8873-F15F64991E78");
    PAN_DOCUMDACONTA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "CLIENTE");
    PAN_DOCUMDACONTA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, "Codice del cliente");
    PAN_DOCUMDACONTA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCUMDACONTA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, 0 | MyGlb.FLD_ISOPT, -1);
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
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_NUMERODOC, PPQRY_FATIMPORT, "A.NUMERO_DOC", "NUMERO_DOC", 5, 8, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 64, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 60);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_LIST, "DATA DOC");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DATADOC, MyGlb.PANEL_FORM, "DATA DOC");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DATADOC, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DATADOC, PPQRY_FATIMPORT, "A.DATA_DOC", "DATA_DOC", 6, 19, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 144, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 4, 172, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_TIPO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_TIPO, PPQRY_FATIMPORT, "A.CODICE_DOC", "CODICE_DOC", 1, 1, 0, -13997);
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
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_IMPORTO, PPQRY_FATIMPORT, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 304, 36, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 4, 316, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DEBITORE, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DEBITORE, PPQRY_FATIMPORT, "A.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 50, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 500, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 4, 316, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 92);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_CODICEFISCAL, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_CODICEFISCAL, PPQRY_FATIMPORT, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 616, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 4, 340, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 72);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_PARTITAIVA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_PARTITAIVA, PPQRY_FATIMPORT, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 708, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_LIST, "NM. Q.");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 252, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_NUMQUIETANZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_NUMQUIETANZA, PPQRY_FATIMPORT, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 736, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_LIST, "T02 DESCRIZIONE");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_T02DESCRIZIO, MyGlb.PANEL_FORM, "T02 DESCR.");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_T02DESCRIZIO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_T02DESCRIZIO, PPQRY_T02, "B.DESCRIZIONE", "T02DESCRIZIO", 5, 40, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 904, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 132, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_SCADENZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_SCADENZA, PPQRY_FATIMPORT, "A.SCADENZA", "SCADENZA", 6, 19, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 980, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 80);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_LIST, "Provenienza");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 236, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 80);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_PROVENIENZA, MyGlb.PANEL_FORM, "Provenienza");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_PROVENIENZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_PROVENIENZA, PPQRY_FATIMPORT, "A.PROVENIENZA", "PROVENIENZA", 5, 20, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_DOCUMENTO, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_DOCUMENTO, -1, "", "DOCUMENTO", 0, 0, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 708, 0, 196, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_LIST, 2);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 16, 16, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 0);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_QUIETANZA, MyGlb.PANEL_FORM, 2);
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_QUIETANZA, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_QUIETANZA, -1, "", "QUIETANZA", 0, 0, 0, -13997);
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 52);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_LIST, "CLIENTE");
    PAN_DOCUMDACONTA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 4, 364, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMDACONTA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 52);
    PAN_DOCUMDACONTA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMDACONTA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMDACONTA_CLIENTE, MyGlb.PANEL_FORM, "CLIENTE");
    PAN_DOCUMDACONTA.SetFieldPage(PFL_DOCUMDACONTA_CLIENTE, -1, -1);
    PAN_DOCUMDACONTA.SetFieldPanel(PFL_DOCUMDACONTA_CLIENTE, PPQRY_FATIMPORT, "A.CLIENTE", "CLIENTE", 1, 6, 0, -13997);
  }

  private void PAN_DOCUMDACONTA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMDACONTA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (A.CODICE = ~~CLIENTE~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~NUM_QUIETANZA~~) ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_T02, 0, SQL, -1, "");
    PAN_DOCUMDACONTA.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMDACONTA.SetMasterTable(PPQRY_T02, "QTN");
    PAN_DOCUMDACONTA.SetIMDB(IMDB, "PQRY_FATIMPORT", true);
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
    SQL.append("  A.UFFICIO as UFFICIO ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FAT_IMPORT A ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~PQRY_FILTRO2.FILTTIPOREGI~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~PQRY_FILTRO2.FILTTIPOBOLL~~) ");
    SQL.append("and   (A.DATA_DOC <= ~~PQRY_FILTRO2.FILTROFINOAL~~) ");
    SQL.append("and   ((A.FAT_ANNO_PROG IS NULL)) ");
    SQL.append("and   ((~~PQRY_FILTRO2.FILGIACONIVA~~ = 'NO' AND (A.FATPRI_ANNO_PROG IS NULL)) OR ~~PQRY_FILTRO2.FILGIACONIVA~~ = 'SI') ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NUMERO_DOC ");
    PAN_DOCUMDACONTA.SetQuery(PPQRY_FATIMPORT, 5, SQL, -1, "");
    PAN_DOCUMDACONTA.SetQueryDB(PPQRY_FATIMPORT, MainFrm.Cf4armDBObject.DB, 4);
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
