// **********************************************
// Opere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Opere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_OPERE_CODICE = 0;
  private static int PFL_OPERE_DESCRIZIONE = 1;
  private static int PFL_OPERE_CATEGORIA = 2;
  private static int PFL_OPERE_ESERCSCADENZ = 3;
  private static int PFL_OPERE_SEPROTRILLPP = 4;
  private static int PFL_OPERE_CUP = 5;
  private static int PFL_OPERE_REALE = 6;
  private static int PFL_OPERE_SEELENCANNUA = 7;
  private static int PFL_OPERE_NUMEROPTI = 8;
  private static int PFL_OPERE_ANNOPPI = 9;
  private static int PFL_OPERE_PROGETTO = 10;
  private static int PFL_OPERE_NOTE1 = 11;
  private static int PFL_OPERE_UTENTEINSER1 = 12;
  private static int PFL_OPERE_UNITAORGANI1 = 13;
  private static int PFL_OPERE_SCELTANOTE = 14;
  private static int PFL_OPERE_BARRA = 15;
  private static int PFL_OPERE_SCELTAPROGET = 16;
  private static int PFL_OPERE_PROGETDESCRI = 17;
  private static int PFL_OPERE_NUOVCAMPSTAT = 18;
  private static int PFL_OPERE_CODOPERAPBM = 19;

  private static int PPQRY_OPERE1 = 0;

  private static int PPQRY_PROGETTI = 1;

  private static int PPQRY_CATEGORIEFIN = 2;


  IDPanel PAN_OPERE;
  private static int PFL_UNITAORGANIZ_UNITAORGANIZ = 0;
  private static int PFL_UNITAORGANIZ_UTENTEINSERI = 1;
  private static int PFL_UNITAORGANIZ_DATAINSERIME = 2;
  private static int PFL_UNITAORGANIZ_UTENTULTIAGG = 3;
  private static int PFL_UNITAORGANIZ_DATAULTIMAGG = 4;
  private static int PFL_UNITAORGANIZ_PROGRESSIVO = 5;
  private static int PFL_UNITAORGANIZ_OPERA = 6;

  private static int PPQRY_OPERA3 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_UNITAORGANIZ;
  CIDREObj BUK_LIBROOPERE;
  OBook BKW_LIBROOPERE;
  //
  // Template Pages constants
  private static int BUK_LIBROOPERE_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBROOPERE_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_LIBROOPERE_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_LIBROOPERE_RPTBOX_NUOVOBOX = 4;
  private static int BUK_LIBROOPERE_SPAN_TSLOOPNTSLOO = 5;

  //
  // Reports constants
  private static int BUK_LIBROOPERE_RPT_NUOVOREPORT = 6;
  private static int BUK_LIBROOPERE_SEC_INTESTREPORT = 7;
  private static int BUK_LIBROOPERE_SEC_INTESTPAGINA = 8;
  private static int BUK_LIBROOPERE_RPTBOX_TITOLO = 9;
  private static int BUK_LIBROOPERE_SPAN_OPERE = 10;
  private static int BUK_LIBROOPERE_RPTBOX_CODICEHEADER = 11;
  private static int BUK_LIBROOPERE_SPAN_CODICE1 = 12;
  private static int BUK_LIBROOPERE_RPTBOX_DESCRIHEADER = 13;
  private static int BUK_LIBROOPERE_SPAN_DESCRIZIONE1 = 14;
  private static int BUK_LIBROOPERE_RPTBOX_CUP1 = 15;
  private static int BUK_LIBROOPERE_SPAN_CUP1 = 16;
  private static int BUK_LIBROOPERE_RPTBOX_NUMPTIHEADER = 17;
  private static int BUK_LIBROOPERE_SPAN_NUMPTI = 18;
  private static int BUK_LIBROOPERE_RPTBOX_SCADENHEADER = 19;
  private static int BUK_LIBROOPERE_SPAN_PROGETTO = 20;
  private static int BUK_LIBROOPERE_RPTBOX_CATEGOHEADER = 21;
  private static int BUK_LIBROOPERE_SPAN_CATEGORIA = 22;
  private static int BUK_LIBROOPERE_RPTBOX_NOTEHEADER = 23;
  private static int BUK_LIBROOPERE_SPAN_NOTE1 = 24;
  private static int BUK_LIBROOPERE_RPTBOX_REALEHEADER = 25;
  private static int BUK_LIBROOPERE_SPAN_REALE = 26;
  private static int BUK_LIBROOPERE_RPTBOX_PRTRIHEADER = 27;
  private static int BUK_LIBROOPERE_SPAN_PRTRI = 28;
  private static int BUK_LIBROOPERE_RPTBOX_ELENANNUHEAD = 29;
  private static int BUK_LIBROOPERE_SPAN_ELENANN = 30;
  private static int BUK_LIBROOPERE_SEC_DETTAGLIO = 31;
  private static int BUK_LIBROOPERE_RPTBOX_CODICE = 32;
  private static int BUK_LIBROOPERE_SPAN_OPECODOPLIOP = 33;
  private static int BUK_LIBROOPERE_RPTBOX_DESCRIZIONE = 34;
  private static int BUK_LIBROOPERE_SPAN_OPEDESOPLIOP = 35;
  private static int BUK_LIBROOPERE_RPTBOX_MUTUO = 36;
  private static int BUK_LIBROOPERE_SPAN_TSONPOLOININ = 37;
  private static int BUK_LIBROOPERE_RPTBOX_PROGETTO = 38;
  private static int BUK_LIBROOPERE_SPAN_OPPRIDOPLIOP = 39;
  private static int BUK_LIBROOPERE_RPTBOX_CUP = 40;
  private static int BUK_LIBROOPERE_SPAN_CUP = 41;
  private static int BUK_LIBROOPERE_RPTBOX_CATEGORIA = 42;
  private static int BUK_LIBROOPERE_SPAN_OPEDE1OPLIOP = 43;
  private static int BUK_LIBROOPERE_RPTBOX_NOTE1 = 44;
  private static int BUK_LIBROOPERE_SPAN_OPENOTOPLIOP = 45;
  private static int BUK_LIBROOPERE_RPTBOX_REALE = 46;
  private static int BUK_LIBROOPERE_SPAN_OPEREAOPLIO1 = 47;
  private static int BUK_LIBROOPERE_RPTBOX_PRTRI = 48;
  private static int BUK_LIBROOPERE_SPAN_OPEREAOPLIO2 = 49;
  private static int BUK_LIBROOPERE_RPTBOX_PRTRI1 = 50;
  private static int BUK_LIBROOPERE_SPAN_OPEREAOPLIOP = 51;
  private static int BUK_LIBROOPERE_SEC_PIEDEREPORT = 52;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM146(IMDB);
    //
    //
    Init_PQRY_OPERE1(IMDB);
    Init_PQRY_OPERA3(IMDB);
    Init_PQRY_OPERE4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM146(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM146, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM146, "TBL_PARAM146");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM146,IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, "NOMEOGGETTIU");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM146,IMDBDef1.FLD_PARAM146_NOMEOGGETTIU,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM146,IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, "NOMEOGGEDUPL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM146,IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL,1,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM146, 0);
  }

  private static void Init_PQRY_OPERE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_OPERE1, 15);
    IMDB.set_TblCode(IMDBDef8.PQRY_OPERE1, "PQRY_OPERE1");
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_REALE, "REALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_REALE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_PROG_TRIENNALE, "PROG_TRIENNALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_PROG_TRIENNALE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_ELENCO_ANNUALE, "ELENCO_ANNUALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_ELENCO_ANNUALE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_NUMERO_PPI, "NUMERO_PPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_NUMERO_PPI,5,12,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_ANNO_PPI, "ANNO_PPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_ANNO_PPI,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_COD_OPERA_PBM, "COD_OPERA_PBM");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_COD_OPERA_PBM,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE1,IMDBDef8.PQSL_OPERE1_DATA_INSERIMENTO,6,14,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_OPERE1, 0);
  }

  private static void Init_PQRY_OPERA3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_OPERA3, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_OPERA3, "PQRY_OPERA3");
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERA3,IMDBDef8.PQSL_OPERA3_OPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_OPERA3, 0);
  }

  private static void Init_PQRY_OPERE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_OPERE4, 15);
    IMDB.set_TblCode(IMDBDef8.PQRY_OPERE4, "PQRY_OPERE4");
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECODICE, "OPERECODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREDESCRIZ, "OPEREDESCRIZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREDESCRIZ,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECATEGOR, "OPERECATEGOR");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECATEGOR,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERENOTE, "OPERENOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERENOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERUTENINSE, "OPERUTENINSE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERUTENINSE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERESCADENZ, "OPERESCADENZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERESCADENZ,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPECATFINCOD, "OPECATFINCOD");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPECATFINCOD,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREDESCRI1, "OPEREDESCRI1");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREDESCRI1,5,198,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERENUMEPPI, "OPERENUMEPPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERENUMEPPI,5,12,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREANNOPPI, "OPEREANNOPPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREANNOPPI,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECUP, "OPERECUP");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERECUP,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREPROGEID, "OPEREPROGEID");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREPROGEID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREREALE, "OPEREREALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPEREREALE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERPROGTRIE, "OPERPROGTRIE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERPROGTRIE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERELENANNU, "OPERELENANNU");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE4,IMDBDef8.PQSL_OPERE4_OPERELENANNU,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_OPERE4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Opere(MyWebEntryPoint w, IMDBObj imdb)
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
  public Opere()
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
    FormIdx = MyGlb.FRM_OPERE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A47BF73C-CE25-4865-9C47-0820375A1936";
    ResModeW = 3;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 578;
    set_Caption(new IDVariant("Opere"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 552;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.666667;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 368;
    Frames[2].Caption = "Opere";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 368;
    PAN_OPERE = new IDPanel(w, this, 2, "PAN_OPERE");
    Frames[2].Content = PAN_OPERE;
    PAN_OPERE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPERE.VS = MainFrm.VisualStyleList;
    PAN_OPERE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBROOPERE != null)
      PAN_OPERE.SetBook(BUK_LIBROOPERE);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6711DF54-D806-478F-95EE-036CDC30DB80");
    PAN_OPERE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 764, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPERE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPERE.InitStatus = 2;
    PAN_OPERE_Init();
    PAN_OPERE_InitFields();
    PAN_OPERE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 832;
    Frames[3].Height = 184;
    Frames[3].Caption = "Unità Organizzative";
    Frames[3].Parent = this;
    Frames[3].FixedWidth = 832;
    Frames[3].FixedHeight = 184;
    Frames[3].MinWidth = Frames[3].Width;
    Frames[3].MaxWidth = Frames[3].Width;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_UNITAORGANIZ = new IDPanel(w, this, 3, "PAN_UNITAORGANIZ");
    Frames[3].Content = PAN_UNITAORGANIZ;
    PAN_UNITAORGANIZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UNITAORGANIZ.VS = MainFrm.VisualStyleList;
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "351FBDAE-4860-4037-83ED-4C26CC944407");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 108, 0, 396, 76, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UNITAORGANIZ.InitStatus = 2;
    PAN_UNITAORGANIZ_Init();
    PAN_UNITAORGANIZ_InitFields();
    PAN_UNITAORGANIZ_InitQueries();
    BKW_LIBROOPERE = new OBook(this);
    BUK_LIBROOPERE = new CIDREObj(BKW_LIBROOPERE);
    BKW_LIBROOPERE.iGuid = "18C3AACF-1AD7-4350-BB13-FB57557F7F2F";
    BKW_LIBROOPERE.Code = "BUK_LIBROOPERE";
    BKW_LIBROOPERE.BookObj = BUK_LIBROOPERE;
    BKW_LIBROOPERE.InitDefMasks();
    BUK_LIBROOPERE.InitBook(1, 1245185, "Libro Opere", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROOPERE.InitHTML();
    BUK_LIBROOPERE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROOPERE.Book.SetMainFrm(MainFrm);
    BUK_LIBROOPERE.SetRTCGuid(0, "18C3AACF-1AD7-4350-BB13-FB57557F7F2F");
    BUK_LIBROOPERE.SetObjCode(0, "LIBROOPERE");
    if (PAN_OPERE != null)
      PAN_OPERE.SetBook(BUK_LIBROOPERE);
    BUK_LIBROOPERE_MST_NUOVPAGIMAST_Init();
    BUK_LIBROOPERE_RPT_NUOVOREPORT_Init();
    BUK_LIBROOPERE_InitLinks();
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
      PAN_OPERE.UpdatePanel(MainFrm);
      PAN_UNITAORGANIZ.UpdatePanel(MainFrm);
      // BUK_LIBROOPERE.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROGET && flRis && IdxPanelActived == PAN_OPERE.FrIndex)
    {
      if (IdxFieldActived ==PFL_OPERE_PROGETTO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROGET && flRis && IdxPanelActived == PAN_OPERE.FrIndex)
    {
      if (IdxFieldActived ==PFL_OPERE_SCELTAPROGET) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_LIBROOPERE")) return BUK_LIBROOPERE;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Opere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Opere.class.getName() : (Glb.ClassWithPackage(Opere.class) ? Opere.class.getName().substring(Opere.class.getPackage().getName().length() + 1) : Opere.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Opere On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPERE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_OPERE);
      // 
      // Opere On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_OPERE.set_ToolTip(Glb.OBJ_FIELD,PFL_OPERE_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_DESCRIZIONE, 0).stringValue()); 
      if (IMDB.Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        if ((new IDVariant(PAN_OPERE.Layout())).equals((new IDVariant(0)), true))
        {
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_REALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.set_Header(Glb.OBJ_FIELD,PFL_OPERE_ESERCSCADENZ, (new IDVariant("Scadenza")).stringValue());
          PAN_OPERE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_OPERE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
          if (MainFrm.COMPETENZA.equals((new IDVariant("TU")), true))
          {
            PAN_UNITAORGANIZ.set_Visible((new IDVariant(-1)).booleanValue());
          }
          else
          {
            PAN_UNITAORGANIZ.set_Visible((new IDVariant(0)).booleanValue());
          }
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CATEGORIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CUP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_REALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_OPERE.set_Header(Glb.OBJ_FIELD,PFL_OPERE_ESERCSCADENZ, (new IDVariant("Eserc. Scadenza")).stringValue());
          if (PAN_OPERE.IsNewRow())
          {
            if (MainFrm.NUMOPEAUTO.equals((new IDVariant("SI")), true))
            {
              PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
            else
            {
              PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
          }
          else
          {
            PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Opere After Insert
  // Evento notificato dopo il l'inserimento nel database
  // di una nuova riga del pannello.
  // **********************************************************************
  private void PAN_OPERE_AfterInsert()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere After Insert Body
      // Corpo Procedura
      // 
      if (MainFrm.COMPETENZA.equals((new IDVariant("UC")), true))
      {
        IDVariant v_PROGR = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MAX(A.PROGRESSIVO) as MAXOPERUOPRO ");
        SQL.append("from ");
        SQL.append("  OPERE_UO A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PROGR = QV.Get("MAXOPERUOPRO", IDVariant.INTEGER) ;
        }
        QV.Close();
        try
        {
          SQL = new StringBuffer();
          SQL.append("insert into OPERE_UO ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  OPERA, ");
          SQL.append("  PROGR_UNITA_ORGANIZZATIVA, ");
          SQL.append("  UTENTE_INSERIMENTO, ");
          SQL.append("  DATA_INSERIMENTO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(v_PROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1, ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ) ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e4)
        {
          MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereAfterInsert", _e);
    }
  }

  // **********************************************************************
  // Opere On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_OPERE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_OPERE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Opere On Database Error Body
      // Corpo Procedura
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Opere On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_OPERE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        PAN_OPERE.set_Layout((new IDVariant(1)).intValue());
        IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        PAN_OPERE.set_Layout((new IDVariant(1)).intValue());
        IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0, (new IDVariant()));
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, (new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereOnCommand", _e);
    }
  }

  // **********************************************************************
  // Opere Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_OPERE_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_DATA_INSERIMENTO, 0, IDL.Today());
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0)) && MainFrm.NUMOPEAUTO.compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Codice Obbligatorio"));
        MainFrm.set_AlertMessage(v_SMS); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
      if (MainFrm.NUMOPEAUTO.equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0)))
      {
        IDVariant v_CODICE = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.NUMERAZIONEFINOPE((new IDVariant("OPE")), (new IDVariant("X")), (new IDVariant("X")), v_CODICE);
        IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0, new IDVariant(v_CODICE));
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Opere Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_OPERE_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere Before Update Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Opere On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_OPERE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldWasModified.booleanValue() && Column.equals((new IDVariant(PFL_OPERE_CODICE)), true))
      {
        if (IMDB.Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, (new IDVariant(0)));
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_DESCRIZIONE, 0)))
      {
        PAN_OPERE.SetErrorText((new IDVariant("Descrizione obbligatoria")).stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereOnUpdatingRow", _e);
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
      if (MainFrm.COMPETENZA.equals((new IDVariant("UC")), true))
      {
        PAN_OPERE.set_FieldText(PFL_OPERE_UNITAORGANI1, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIDESCRUO, 0).stringValue());
      }
      else
      {
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, 0).equals((new IDVariant("I")), true))
      {
        PAN_OPERE.set_Layout((new IDVariant(1)).intValue());
        DisabilitaTutto();
      }
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (MainFrm.CfpegAttivo().equals((new IDVariant(1)), true) || MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
      {
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (MainFrm.INTEGRAZIPBM.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "Load", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_NOTE, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "EndModal", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGEDUPL, 0, new IDVariant());
  }

  // **********************************************************************
  // Unità Organizzative Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_UNITAORGANIZ_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unità Organizzative Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_OPERA, 0, IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "UnitàOrganizzativeBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_UNITAORGANIZ_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unità Organizzative Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_DATA_ULTIMO_AGG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_OPERA3, IMDBDef8.PQSL_OPERA3_OPERA, 0, IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_CODICE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "UnitàOrganizzativeBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_UNITAORGANIZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_UNITAORGANIZ);
      // 
      // Unità Organizzative On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        if (!(PAN_UNITAORGANIZ.IsNewRow()))
        {
          PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "UnitàOrganizzativeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_UNITAORGANIZ_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unità Organizzative On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (new IDVariant(PAN_OPERE.Status()).equals((new IDVariant(3)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Salvare prima l'opera"));
          MainFrm.set_AlertMessage(v_SMS); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "UnitàOrganizzativeOnCommand", _e);
    }
  }

  // **********************************************************************
  // Unità Organizzative On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_UNITAORGANIZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_UNITAORGANIZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Unità Organizzative On Database Error Body
      // Corpo Procedura
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "UnitàOrganizzativeOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Opere Progetto Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_OPERE_PROGETTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opere Progetto Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_PROGETTO_ID, 0))))
      {
        IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROGETTI A ");
        SQL.append("where (A.PROGETTO_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTA.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Progetto inesistente"));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_PROGETTO_ID, 0, (new IDVariant()));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "OpereProgettoValidate", _e);
    }
  }

  // **********************************************************************
  // Scelta Note
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Note Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_OPERE1, IMDBDef8.PQSL_OPERE1_NOTE, 0), (new IDVariant("Note")), ((IMDB.Value(IMDBDef1.TBL_PARAM146, IMDBDef1.FLD_PARAM146_NOMEOGGETTIU, 0).equals((new IDVariant("I"))))?(new IDVariant(0)):(new IDVariant(-1))), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "SceltaNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Tutto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DisabilitaTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Tutto Body
      // Corpo Procedura
      // 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CATEGORIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_UNITAORGANIZ.SetFlags (Glb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_CUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_REALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_UNITAORGANIZ.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_ANNOPPI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_OPERE.SetFlags (Glb.OBJ_FIELD, PFL_OPERE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "DisabilitaTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Progetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaProgetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Progetto Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Opere", "SceltaProgetto", _e);
      return -1;
    }
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPERE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPERE, Cancel);
    // Stub
  }

  private void PAN_OPERE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_OPERE_PROGETTO)
    {
      this.IdxPanelActived = this.PAN_OPERE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaProgetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_OPERE_SCELTANOTE)
    {
      this.IdxPanelActived = this.PAN_OPERE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_OPERE_SCELTAPROGET)
    {
      this.IdxPanelActived = this.PAN_OPERE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaProgetto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_OPERE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_OPERE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_OPERE_PROGETTO)
      {
        PFL_OPERE_PROGETTO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_OPERE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OPERE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_UNITAORGANIZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_UNITAORGANIZ, Cancel);
    // Stub
  }

  private void PAN_UNITAORGANIZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_UNITAORGANIZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_UNITAORGANIZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_UNITAORGANIZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBROOPERE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROOPERE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROOPERE_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBROOPERE_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBROOPERE_SEC_DETTAGLIO)
    {
      BUK_LIBROOPERE.set_SpanValue(BUK_LIBROOPERE_SPAN_TSONPOLOININ, new IDVariant(IDL.Add(IDL.ToString(BUK_LIBROOPERE.GetReportColumn(BUK_LIBROOPERE_RPT_NUOVOREPORT, "OPERENUMEPPI")), ((!(IDL.IsNull(BUK_LIBROOPERE.GetReportColumn(BUK_LIBROOPERE_RPT_NUOVOREPORT, "OPERENUMEPPI"))))?IDL.Add((new IDVariant(" / ")), IDL.ToString(BUK_LIBROOPERE.GetReportColumn(BUK_LIBROOPERE_RPT_NUOVOREPORT, "OPEREANNOPPI"))):(new IDVariant())))));
    }
    if (SectionID==BUK_LIBROOPERE_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBROOPERE_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBROOPERE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROOPERE_MST_NUOVPAGIMAST)
    {
      BUK_LIBROOPERE.set_SpanValue(BUK_LIBROOPERE_SPAN_TSLOOPNTSLOO, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_LIBROOPERE.GetPageNumber()))), (new IDVariant("/"))), IDL.ToString((new IDVariant(BUK_LIBROOPERE.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBROOPERE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROOPERE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROOPERE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROOPERE_OnPreview()
  {
    PreviewBook = BKW_LIBROOPERE;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_OPERE_Init()
  {

    PAN_OPERE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "B23026B5-8A9C-47F6-BB5A-F066531F29E1");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "Codice");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CODICE, 0, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CODICE, 0, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "00BCCABA-3067-4D62-B527-6CD8705EF49B");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "Descrizione");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISDESCR, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_DESCRIZIONE, 1, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_DESCRIZIONE, 1, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "D489F387-38AF-4EA2-A7E8-27F9008083D8");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "Categoria");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CATEGORIA, 2, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CATEGORIA, 2, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, "185D10D7-897A-4418-82AB-3398F166F2AB");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, "Eserc. Scadenza");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_ESERCSCADENZ, 3, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_ESERCSCADENZ, 3, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, "09671557-6FA5-4D17-A3EE-9D61B2BD431B");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, "Se Programma Triennale LL.PP.");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.VIS_CHECKSTYLE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SEPROTRILLPP, 4, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SEPROTRILLPP, 4, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, "6DCA8247-5BF3-40B6-B982-15433F0363AC");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, "CUP");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CUP, 7, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CUP, 5, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "67951268-89A7-4838-9616-84016F7BE845");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "Reale");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.VIS_CHECKSTYLE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_REALE, 5, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_REALE, 6, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, "2DBD1FA8-F705-42B9-8C02-FDFFFE2864FB");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, "Se Elenco Annuale");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.VIS_CHECKSTYLE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SEELENCANNUA, 6, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SEELENCANNUA, 7, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, "D702D0A6-B2B0-404C-9E10-2CB0901AF82F");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, "Numero P.T.I.");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NUMEROPTI, 8, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NUMEROPTI, 8, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, "AEF85527-9ECD-476C-8A97-8BA5A049BCDB");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, "ANNO PPI");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_ANNOPPI, 9, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_ANNOPPI, 9, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, "1BF46B0B-1003-4A14-A6C8-0AED577FBFCB");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, "Obiettivo Operativo");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_PROGETTO, 10, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_PROGETTO, 10, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, "AF56C09D-9E04-4609-BA77-E0F36AC8321C");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, "Note");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NOTE1, 12, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NOTE1, 11, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, "C4377390-388C-484D-B036-A7475E34D0C2");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_UTENTEINSER1, 18, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_UTENTEINSER1, 18, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, "10FB1ECA-8C05-4E51-B0EE-BD85D8CDCCC3");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, "Testo da mostrare qui");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.VIS_VUOGRAALLECO);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_UNITAORGANI1, 13, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_UNITAORGANI1, 12, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, "F858AD82-BF5F-4B94-887E-228F8B2D6818");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.VIS_STATICBUTTON);
    PAN_OPERE.SetImage(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, 0, "testo.gif", false);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SCELTANOTE, 14, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SCELTANOTE, 14, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, "E8E72A7F-F7E2-4E93-BE27-B7C69A8D49DA");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, "/");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_BARRA, 15, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_BARRA, 13, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, "6CC41FA6-6442-4C71-A5F8-8008BE70813B");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.VIS_STATICBUTTON);
    PAN_OPERE.SetImage(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, 0, "wsearch1.gif", true);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, 0 | MyGlb.FLD_CANACTIVATE, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SCELTAPROGET, 19, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_SCELTAPROGET, 19, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, "77BF567E-6D88-4C5F-BAC4-A18B041F2A5B");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, "PROGETTI DESCRIZIONE");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_PROGETDESCRI, 11, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_PROGETDESCRI, 15, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, "0D7AFB3F-ECB2-49F2-BC35-1ED333066BAC");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.VIS_VUOTONORMALE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NUOVCAMPSTAT, 16, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_NUOVCAMPSTAT, 16, MyGlb.PANEL_LIST);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, "DDE66102-D3D1-4693-A5CD-490799135647");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, "Cod. Opera PBM");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, "Codice Opera Applicativo PBM");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CODOPERAPBM, 17, MyGlb.PANEL_FORM);
    PAN_OPERE.SetTabOrder(PFL_OPERE_CODOPERAPBM, 17, MyGlb.PANEL_LIST);
  }

  private void PAN_OPERE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 0, 68, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 24, 12, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CODICE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CODICE, PPQRY_OPERE1, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 68, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 112);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 36, 500, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_OPERE.SetFieldPage(PFL_OPERE_DESCRIZIONE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_DESCRIZIONE, PPQRY_OPERE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 324, 68, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 76);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 24, 92, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CATEGORIA, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CATEGORIA, PPQRY_OPERE1, "A.CATEGORIA", "CATEGORIA", 1, 3, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_LIST, 524, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_LIST, 68);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_LIST, "Eserc. Scadenza");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_FORM, 24, 116, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_FORM, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ESERCSCADENZ, MyGlb.PANEL_FORM, "Eserc. Scadenza");
    PAN_OPERE.SetFieldPage(PFL_OPERE_ESERCSCADENZ, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_ESERCSCADENZ, PPQRY_OPERE1, "A.SCADENZA", "SCADENZA", 1, 4, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_LIST, 104);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_LIST, "Se Programma Triennale LL.PP.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_FORM, 316, 116, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_FORM, 184);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_SEPROTRILLPP, MyGlb.PANEL_FORM, "Se Programma Triennale LL.PP.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_SEPROTRILLPP, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_SEPROTRILLPP, PPQRY_OPERE1, "A.PROG_TRIENNALE", "PROG_TRIENNALE", 5, 2, 0, -13997);
    PAN_OPERE.SetValueListItem(PFL_OPERE_SEPROTRILLPP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_SEPROTRILLPP, (new IDVariant()), "Null", "", "", -1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_LIST, 588, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_LIST, 32);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_LIST, "CUP");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_FORM, 92, 164, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_FORM, 32);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CUP, MyGlb.PANEL_FORM, "CUP");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CUP, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CUP, PPQRY_OPERE1, "A.CUP", "CUP", 5, 15, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 652, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 44);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, "Reale");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 80, 140, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 44);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, "Reale");
    PAN_OPERE.SetFieldPage(PFL_OPERE_REALE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_REALE, PPQRY_OPERE1, "A.REALE", "REALE", 5, 2, 0, -13997);
    PAN_OPERE.SetValueListItem(PFL_OPERE_REALE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_REALE, (new IDVariant()), "Null", "", "", -1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_LIST, 104);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_LIST, "Se Elenco Annuale");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_FORM, 384, 140, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_FORM, 116);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_SEELENCANNUA, MyGlb.PANEL_FORM, "Se Elenco Annuale");
    PAN_OPERE.SetFieldPage(PFL_OPERE_SEELENCANNUA, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_SEELENCANNUA, PPQRY_OPERE1, "A.ELENCO_ANNUALE", "ELENCO_ANNUALE", 5, 2, 0, -13997);
    PAN_OPERE.SetValueListItem(PFL_OPERE_SEELENCANNUA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_SEELENCANNUA, (new IDVariant()), "Null", "", "", -1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_LIST, 80);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_LIST, "Numero P.T.I.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_FORM, 36, 188, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_FORM, 88);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMEROPTI, MyGlb.PANEL_FORM, "Numero P.T.I.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_NUMEROPTI, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NUMEROPTI, PPQRY_OPERE1, "A.NUMERO_PPI", "NUMERO_PPI", 5, 12, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_LIST, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_LIST, "ANNO PPI");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_FORM, 248, 188, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_FORM, 60);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_ANNOPPI, MyGlb.PANEL_FORM, "ANNO PPI");
    PAN_OPERE.SetFieldPage(PFL_OPERE_ANNOPPI, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_ANNOPPI, PPQRY_OPERE1, "A.ANNO_PPI", "ANNO_PPI", 1, 4, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_LIST, 84);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_FORM, 4, 212, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_FORM, 120);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_OPERE.SetFieldPage(PFL_OPERE_PROGETTO, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_PROGETTO, PPQRY_OPERE1, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_LIST, 992, 68, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_LIST, 36);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_FORM, 88, 236, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_FORM, 36);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_OPERE.SetFieldPage(PFL_OPERE_NOTE1, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NOTE1, PPQRY_OPERE1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_LIST, 128);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 372, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_FORM, 128);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_OPERE.SetFieldPage(PFL_OPERE_UTENTEINSER1, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_UTENTEINSER1, PPQRY_OPERE1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_LIST, 0, 4, 804, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_FORM, 628, 284, 60, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_UNITAORGANI1, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_UNITAORGANI1, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_UNITAORGANI1, -1, "", "UNITAORGANI1", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_LIST, 520, 100, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_FORM, 316, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTANOTE, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_SCELTANOTE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_SCELTANOTE, -1, "", "SCELTANOTE", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_LIST, 244, 252, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_FORM, 232, 188, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_BARRA, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_LIST, 244, 212, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_FORM, 220, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_SCELTAPROGET, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_SCELTAPROGET, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_SCELTAPROGET, -1, "", "SCELTAPROGET", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_LIST, 144);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_LIST, "PROGETTI DESCRIZIONE");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_FORM, 208, 212, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_FORM, 144);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETDESCRI, MyGlb.PANEL_FORM, "PROGETTI DESCRIZIONE");
    PAN_OPERE.SetFieldPage(PFL_OPERE_PROGETDESCRI, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_PROGETDESCRI, PPQRY_PROGETTI, "A.DESCRIZIONE", "PROGETDESCRI", 5, 100, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 372, 252, 24, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 384, 252, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetFieldPage(PFL_OPERE_NUOVCAMPSTAT, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_LIST, 692, 68, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_LIST, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_LIST, "Cod. Opera PBM");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_FORM, 360, 236, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_FORM, 100);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODOPERAPBM, MyGlb.PANEL_FORM, "Cod. Opera PBM");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CODOPERAPBM, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CODOPERAPBM, PPQRY_OPERE1, "A.COD_OPERA_PBM", "COD_OPERA_PBM", 1, 10, 0, -13997);
  }

  private void PAN_OPERE_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPERE.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROGETDESCRI ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_OPERE.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_OPERE.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEGFINCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CATEGFINDESC ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FIN A ");
    SQL.append("where (A.CODICE = ~~CATEGORIA~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    PAN_OPERE.SetQuery(PPQRY_CATEGORIEFIN, 0, SQL, PFL_OPERE_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CATEGFINCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CATEGFINDESC ");
    SQL.append("from ");
    SQL.append("  CATEGORIE_FIN A ");
    SQL.append("where (A.TIPO = 'O') ");
    PAN_OPERE.SetQuery(PPQRY_CATEGORIEFIN, 1, SQL, PFL_OPERE_CATEGORIA, "");
    PAN_OPERE.SetQueryDB(PPQRY_CATEGORIEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetIMDB(IMDB, "PQRY_OPERE1", true);
    PAN_OPERE.set_SetString(MyGlb.MASTER_ROWNAME, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.CUP as CUP, ");
    SQL.append("  A.REALE as REALE, ");
    SQL.append("  A.PROG_TRIENNALE as PROG_TRIENNALE, ");
    SQL.append("  A.ELENCO_ANNUALE as ELENCO_ANNUALE, ");
    SQL.append("  A.NUMERO_PPI as NUMERO_PPI, ");
    SQL.append("  A.ANNO_PPI as ANNO_PPI, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.COD_OPERA_PBM as COD_OPERA_PBM, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO ");
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  OPERE A ");
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE > 0) ");
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_OPERE.SetQuery(PPQRY_OPERE1, 5, SQL, -1, "");
    PAN_OPERE.SetQueryDB(PPQRY_OPERE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetMasterTable(0, "OPERE");
    PAN_OPERE.AddToSortList(PFL_OPERE_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OPERE.Status() == 2)
    {
      int oldListQBE = PAN_OPERE.iUseListQBE;
      PAN_OPERE.iUseListQBE = 0;
      PAN_OPERE.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPERE.PanelCommand(Glb.PCM_FIND);
      PAN_OPERE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_UNITAORGANIZ_Init()
  {

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "1A6F75B6-24B0-4021-BA53-38AFAF677962");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "Unità Organizzativa");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "DD5A9467-394F-436A-9589-1C4ACCA55C2A");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "E20508DA-C381-47D9-9822-4DD24281C189");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "D36059FE-BCD3-4133-AC0F-64059A1B24F2");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "69046D08-1F0D-40D4-A5F9-D48260DAB47C");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "5A1050B8-D9D9-4F20-8524-4D2298B494E2");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "PROGRESSIVO");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_UNITAORGANIZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, "0A360EAB-1E2D-43D6-BDF9-358CD7472170");
    PAN_UNITAORGANIZ.set_Header(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, "OPERA");
    PAN_UNITAORGANIZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, "");
    PAN_UNITAORGANIZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.VIS_NONNULLAFIEL);
    PAN_UNITAORGANIZ.SetFlags(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, 0, -1);
  }

  private void PAN_UNITAORGANIZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 108, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 184);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UNITAORGANIZ, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UNITAORGANIZ, PPQRY_OPERA3, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 40, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UTENTEINSERI, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UTENTEINSERI, PPQRY_OPERA3, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 112, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DATAINSERIME, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DATAINSERIME, PPQRY_OPERA3, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_UTENTULTIAGG, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_UTENTULTIAGG, PPQRY_OPERA3, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 312, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 160);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_DATAULTIMAGG, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_DATAULTIMAGG, PPQRY_OPERA3, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_PROGRESSIVO, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_PROGRESSIVO, PPQRY_OPERA3, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_LIST, 492, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_UNITAORGANIZ.SetRect(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_FORM, 4, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UNITAORGANIZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_UNITAORGANIZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_UNITAORGANIZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UNITAORGANIZ_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_UNITAORGANIZ.SetFieldPage(PFL_UNITAORGANIZ_OPERA, -1, -1);
    PAN_UNITAORGANIZ.SetFieldPanel(PFL_UNITAORGANIZ_OPERA, PPQRY_OPERA3, "A.OPERA", "OPERA", 1, 5, 0, -13997);
  }

  private void PAN_UNITAORGANIZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_UNITAORGANIZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE as SOANUNORCOSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (NVL(A.DAL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("order by 2, 3 ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE as SOANUNORCOSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (NVL(A.DAL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("order by 2, 3 ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_UNITAORGANIZ_UNITAORGANIZ, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetIMDB(IMDB, "PQRY_OPERA3", true);
    PAN_UNITAORGANIZ.set_SetString(MyGlb.MASTER_ROWNAME, "OPERA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.OPERA as OPERA ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  OPERE_UO A ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.OPERA = ~~PQRY_OPERE1.CODICE~~) ");
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UNITAORGANIZ.SetQuery(PPQRY_OPERA3, 5, SQL, -1, "");
    PAN_UNITAORGANIZ.SetQueryDB(PPQRY_OPERA3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UNITAORGANIZ.SetMasterTable(0, "OPERE_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_UNITAORGANIZ.Status() == 2)
    {
      int oldListQBE = PAN_UNITAORGANIZ.iUseListQBE;
      PAN_UNITAORGANIZ.iUseListQBE = 0;
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_UNITAORGANIZ.PanelCommand(Glb.PCM_FIND);
      PAN_UNITAORGANIZ.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBROOPERE_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBROOPERE.InitMastro(BUK_LIBROOPERE_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_MST_NUOVPAGIMAST, "819A0E7F-6BF5-4BAE-B528-48F6E05549E4");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBROOPERE.InitMastroBox(BUK_LIBROOPERE_MST_NUOVPAGIMAST, BUK_LIBROOPERE_RPTBOX_TESTATPAGINA, 1000, 1500, 27700, 3400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_TESTATPAGINA, "AF3227E0-7747-4593-9774-A886267ABD03");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBROOPERE.InitMastroBox(BUK_LIBROOPERE_MST_NUOVPAGIMAST, BUK_LIBROOPERE_RPTBOX_CORPOPAGINA, 1000, 4900, 27700, 14100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CORPOPAGINA, "C7DCD2B1-C679-4D5D-AF44-4C3C4D3AD523");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBROOPERE.InitMastroBox(BUK_LIBROOPERE_MST_NUOVPAGIMAST, BUK_LIBROOPERE_RPTBOX_NUOVOBOX, 26300, 500, 2400, 800, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_NUOVOBOX, "D55191F1-119B-4939-A8BB-D2847B435E4B");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_NUOVOBOX, "NUOVOBOX");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_NUOVOBOX, BUK_LIBROOPERE_SPAN_TSLOOPNTSLOO, MyGlb.VIS_NORMAA9RIGHT, 5, 199, 0, 271384705, "", "", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_TSLOOPNTSLOO, "9C99BD3C-8271-426D-96EC-8988E0EC39F8");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_TSLOOPNTSLOO, "TSLOOPNTSLOO");
  }

  private void BUK_LIBROOPERE_RPT_NUOVOREPORT_InitQuery() { BUK_LIBROOPERE_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBROOPERE_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as OPERECODICE, ");
      SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ, ");
      SQL.append("  A.CATEGORIA as OPERECATEGOR, ");
      SQL.append("  A.NOTE as OPERENOTE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as OPERUTENINSE, ");
      SQL.append("  A.SCADENZA as OPERESCADENZ, ");
      SQL.append("  C.CODICE as OPECATFINCOD, ");
      SQL.append("  TO_CHAR ( C.CODICE ) || CASE WHEN NOT ((C.CODICE IS NULL)) THEN ' - ' || C.DESCRIZIONE ELSE '' END as OPEREDESCRI1, ");
      SQL.append("  A.NUMERO_PPI as OPERENUMEPPI, ");
      SQL.append("  A.ANNO_PPI as OPEREANNOPPI, ");
      SQL.append("  A.CUP as OPERECUP, ");
      SQL.append("  A.PROGETTO_ID as OPEREPROGEID, ");
      SQL.append("  A.REALE as OPEREREALE, ");
      SQL.append("  A.PROG_TRIENNALE as OPERPROGTRIE, ");
      SQL.append("  A.ELENCO_ANNUALE as OPERELENANNU ");
      SQL.append("from ");
      SQL.append("  OPERE A, ");
      SQL.append("  CATEGORIE_FIN C ");
      SQL.append("where (C.CODICE(+) = A.CATEGORIA) ");
      SQL.append("and   (C.TIPO(+) = 'O') ");
      SQL.append("and   (A.CODICE > 0) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_LIBROOPERE.SetReportQuery(BUK_LIBROOPERE_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5E483A37-71D4-44D7-B642-8B907ACAE461");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROOPERE_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBROOPERE.InitReport(BUK_LIBROOPERE_RPT_NUOVOREPORT, 196609);
    BUK_LIBROOPERE_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPT_NUOVOREPORT, "3A5F228C-5246-40D9-8327-3FF67F1F9BB6");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBROOPERE.InitSection(BUK_LIBROOPERE_RPT_NUOVOREPORT, BUK_LIBROOPERE_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROOPERE.SetSectionRendersInto(BUK_LIBROOPERE_SEC_INTESTREPORT, BUK_LIBROOPERE_RPTBOX_CORPOPAGINA);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SEC_INTESTREPORT, "65359B79-1A04-4125-8427-F7C50DA09F0C");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBROOPERE.InitSection(BUK_LIBROOPERE_RPT_NUOVOREPORT, BUK_LIBROOPERE_SEC_INTESTPAGINA, 3100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROOPERE.SetSectionRendersInto(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_TESTATPAGINA);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SEC_INTESTPAGINA, "E6532975-41A9-448E-AEBA-7A762FEA1D8A");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_TITOLO, 100, 200, 27400, 1200, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_TITOLO, "5FD79B3B-264A-46BE-BA06-AB50A6810DDD");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_TITOLO, BUK_LIBROOPERE_SPAN_OPERE, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Opere", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPERE, "663A2EBE-9639-4EB6-9C34-0D89213EC05D");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPERE, "OPERE");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_CODICEHEADER, 100, 2300, 1400, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CODICEHEADER, "A83A3979-3119-4CF2-B477-2308422702EE");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CODICEHEADER, BUK_LIBROOPERE_SPAN_CODICE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_CODICE1, "B1DB2BD3-420E-4001-AB57-F46FE0A17912");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_CODICE1, "CODICE1");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_DESCRIHEADER, 1700, 2300, 4600, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_DESCRIHEADER, "0960A2DB-5FF0-440B-BA44-0AD5FF0594C3");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_DESCRIHEADER, BUK_LIBROOPERE_SPAN_DESCRIZIONE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_DESCRIZIONE1, "F8EAE321-88AD-41AB-9FEF-F3D1F4C14DAA");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_CUP1, 13200, 2300, 1712, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CUP1, "659BD8AE-4E69-498B-B172-836026191165");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CUP1, "CUP1");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CUP1, BUK_LIBROOPERE_SPAN_CUP1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "CUP", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_CUP1, "64FD88B2-2F37-42A9-8D95-70D23D642C03");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_CUP1, "CUP1");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_NUMPTIHEADER, 8900, 2300, 4100, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_NUMPTIHEADER, "D2852A29-D84C-4F80-A4C7-5F5456036D1C");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_NUMPTIHEADER, "NUMPTIHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_NUMPTIHEADER, BUK_LIBROOPERE_SPAN_NUMPTI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Num. P.T.I.", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_NUMPTI, "657F371D-6EDD-4C9C-AC9D-52E8C8D260FE");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_NUMPTI, "NUMPTI");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_SCADENHEADER, 19200, 2300, 1700, 800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_SCADENHEADER, "1033A940-926C-4BA1-8348-D79A2050FFA5");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_SCADENHEADER, "SCADENHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_SCADENHEADER, BUK_LIBROOPERE_SPAN_PROGETTO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Progetto", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_PROGETTO, "88138043-9CCD-48CC-A777-1374487D84F1");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_PROGETTO, "PROGETTO");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_CATEGOHEADER, 15000, 2300, 4000, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CATEGOHEADER, "8F5F6C42-46E8-4689-BAA5-222DF7F7FF15");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CATEGOHEADER, "CATEGOHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CATEGOHEADER, BUK_LIBROOPERE_SPAN_CATEGORIA, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Categoria", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_CATEGORIA, "338BABCA-F22A-46B9-902D-672005FF59E7");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_CATEGORIA, "CATEGORIA");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_NOTEHEADER, 21000, 2300, 2400, 800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_NOTEHEADER, "B73BE56C-2C7C-401F-892F-C989B482BBD2");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_NOTEHEADER, "NOTEHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_NOTEHEADER, BUK_LIBROOPERE_SPAN_NOTE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Note", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_NOTE1, "A2CA6492-87D9-4085-B647-E5688D3B18B0");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_NOTE1, "NOTE1");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_REALEHEADER, 23500, 2300, 1000, 800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_REALEHEADER, "9561AF68-2ABA-474F-A5E7-4D7992657517");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_REALEHEADER, "REALEHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_REALEHEADER, BUK_LIBROOPERE_SPAN_REALE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Reale", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_REALE, "58B89EC8-706B-41BF-9B6A-661481CD06DA");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_REALE, "REALE");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_PRTRIHEADER, 24700, 2300, 1000, 800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_PRTRIHEADER, "36C2596A-BF3D-4A7A-9949-D0C6B01AB9BA");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_PRTRIHEADER, "PRTRIHEADER");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_PRTRIHEADER, BUK_LIBROOPERE_SPAN_PRTRI, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Pr.Tri.", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_PRTRI, "73BFEDCB-1996-43ED-98A6-6DB16829862C");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_PRTRI, "PRTRI");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_INTESTPAGINA, BUK_LIBROOPERE_RPTBOX_ELENANNUHEAD, 25800, 2300, 1800, 800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_ELENANNUHEAD, "2CA428EB-C5FB-4A62-89D0-B90ED2AE98E1");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_ELENANNUHEAD, "ELENANNUHEAD");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_ELENANNUHEAD, BUK_LIBROOPERE_SPAN_ELENANN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Elen. Ann.", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_ELENANN, "BB759E7C-4E26-4510-99EE-05FF33B6EA16");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_ELENANN, "ELENANN");
    BUK_LIBROOPERE.InitSection(BUK_LIBROOPERE_RPT_NUOVOREPORT, BUK_LIBROOPERE_SEC_DETTAGLIO, 900, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROOPERE.SetSectionRendersInto(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_CORPOPAGINA);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SEC_DETTAGLIO, "FAD5E1E7-AB51-47DE-B38C-92334D095FFF");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_CODICE, 0, 0, 1500, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CODICE, "B0D45AC1-1A9B-4A5B-94AE-36820B9CE6FE");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CODICE, "CODICE");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CODICE, BUK_LIBROOPERE_SPAN_OPECODOPLIOP, MyGlb.VIS_NORMALEA9, 1, 5, 0, 271384705, "", "::OPERECODICE", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPECODOPLIOP, "7F87C2F7-2ECD-4EBD-A685-64426C756381");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPECODOPLIOP, "OPECODOPLIOP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_DESCRIZIONE, 1700, 0, 7100, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_DESCRIZIONE, "228945B8-41F8-4D70-A0A7-04197A067AC1");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_DESCRIZIONE, BUK_LIBROOPERE_SPAN_OPEDESOPLIOP, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::OPEREDESCRIZ", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPEDESOPLIOP, "9444275B-7A29-4AD7-A878-C63346D088E3");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPEDESOPLIOP, "OPEDESOPLIOP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_MUTUO, 8900, 0, 4100, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_MUTUO, "87DD49BE-1F1E-4BF1-BDDD-48946BDF28F0");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_MUTUO, "MUTUO");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_MUTUO, BUK_LIBROOPERE_SPAN_TSONPOLOININ, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "", "", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_TSONPOLOININ, "4B67549F-790C-42CE-B0EF-5BB96E84D46E");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_TSONPOLOININ, "TSONPOLOININ");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_PROGETTO, 19200, 0, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_PROGETTO, "5F90652D-BE26-4963-AEF0-651674BA4088");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_PROGETTO, "PROGETTO");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_PROGETTO, BUK_LIBROOPERE_SPAN_OPPRIDOPLIOP, MyGlb.VIS_DEFAREPOSTYL, 5, 9, 0, 271384705, "", "::OPEREPROGEID", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPPRIDOPLIOP, "9F9B9465-0604-49B3-86C2-CA437E4EFE9D");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPPRIDOPLIOP, "OPPRIDOPLIOP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_CUP, 13200, 0, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CUP, "79DF0035-BCEB-498D-A60A-8024B4065EA6");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CUP, "CUP");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CUP, BUK_LIBROOPERE_SPAN_CUP, MyGlb.VIS_DEFAREPOSTYL, 5, 15, 0, 271319169, "", "::OPERECUP", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_CUP, "260CCC0E-3B89-4AD5-BCEB-81DFA23184FB");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_CUP, "CUP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_CATEGORIA, 15100, 0, 4000, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_CATEGORIA, "1ADEBB35-0634-4B2C-A453-99F7B8B1EE30");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_CATEGORIA, "CATEGORIA");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_CATEGORIA, BUK_LIBROOPERE_SPAN_OPEDE1OPLIOP, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "", "::OPEREDESCRI1", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPEDE1OPLIOP, "699C4250-6031-4019-8CAE-9B47EA33B056");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPEDE1OPLIOP, "OPEDE1OPLIOP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_NOTE1, 21000, 0, 2400, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_NOTE1, "C9F25C05-453A-4A09-BB05-89695155AA42");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_NOTE1, "NOTE1");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_NOTE1, BUK_LIBROOPERE_SPAN_OPENOTOPLIOP, MyGlb.VIS_DEFAREPOSTYL, 5, 2000, 0, 271384705, "", "::OPERENOTE", 1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPENOTOPLIOP, "7DEE5432-1A79-4346-867E-2231F7643A84");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPENOTOPLIOP, "OPENOTOPLIOP");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_REALE, 23700, 0, 600, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_REALE, "42A87352-CBC8-40DB-94BC-F9CFBCAF161E");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_REALE, "REALE");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_REALE, BUK_LIBROOPERE_SPAN_OPEREAOPLIO1, MyGlb.VIS_CHECKBOX, 5, 2, 0, 271384705, "", "::OPEREREALE", 1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIO1, "SI", "Scrivi il valore e spiega cosa significa", (new IDVariant("SI")), null, "", -1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIO1, "Null", "Scrivi il valore e spiega cosa significa", (new IDVariant()), null, "", -1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPEREAOPLIO1, "37A0F875-9C4A-42FD-BDEA-522EA5137960");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPEREAOPLIO1, "OPEREAOPLIO1");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_PRTRI, 24900, 0, 600, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_PRTRI, "47BAEA8F-D3EA-4512-BE9B-9B12530AC380");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_PRTRI, "PRTRI");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_PRTRI, BUK_LIBROOPERE_SPAN_OPEREAOPLIO2, MyGlb.VIS_CHECKBOX, 5, 2, 0, 271384705, "", "::OPEREREALE", 1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIO2, "SI", "Scrivi il valore e spiega cosa significa", (new IDVariant("SI")), null, "", -1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIO2, "Null", "Scrivi il valore e spiega cosa significa", (new IDVariant()), null, "", -1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPEREAOPLIO2, "3B7297C4-4134-41A6-89FC-71BCC406EF19");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPEREAOPLIO2, "OPEREAOPLIO2");
    BUK_LIBROOPERE.InitReportBox(BUK_LIBROOPERE_SEC_DETTAGLIO, BUK_LIBROOPERE_RPTBOX_PRTRI1, 26400, 0, 600, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_RPTBOX_PRTRI1, "C40A9788-4B9D-4C60-A00A-D881732F6661");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_RPTBOX_PRTRI1, "PRTRI1");
    BUK_LIBROOPERE.InitBoxSpan(BUK_LIBROOPERE_RPTBOX_PRTRI1, BUK_LIBROOPERE_SPAN_OPEREAOPLIOP, MyGlb.VIS_CHECKBOX, 5, 2, 0, 271384705, "", "::OPEREREALE", 1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIOP, "SI", "Scrivi il valore e spiega cosa significa", (new IDVariant("SI")), null, "", -1);
    BUK_LIBROOPERE.SetSpanValueListItem(BUK_LIBROOPERE_SPAN_OPEREAOPLIOP, "Null", "Scrivi il valore e spiega cosa significa", (new IDVariant()), null, "", -1);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SPAN_OPEREAOPLIOP, "92288266-C78B-4A6D-9A63-E5ADB9A3161E");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SPAN_OPEREAOPLIOP, "OPEREAOPLIOP");
    BUK_LIBROOPERE.InitSection(BUK_LIBROOPERE_RPT_NUOVOREPORT, BUK_LIBROOPERE_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROOPERE.SetSectionRendersInto(BUK_LIBROOPERE_SEC_PIEDEREPORT, BUK_LIBROOPERE_RPTBOX_CORPOPAGINA);
    BUK_LIBROOPERE.SetRTCGuid(BUK_LIBROOPERE_SEC_PIEDEREPORT, "800AF9CE-BFD0-433A-AFEC-1171C45F830B");
    BUK_LIBROOPERE.SetObjCode(BUK_LIBROOPERE_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBROOPERE_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBROOPERE_InitLinks()
  {
    BUK_LIBROOPERE.SetBoxNextBox(BUK_LIBROOPERE_RPTBOX_CORPOPAGINA, BUK_LIBROOPERE_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateRow(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_DynamicProperties();
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_OPERE) PAN_OPERE_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_BeforeInsert(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_BeforeUpdate(Cancel);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_BeforeUpdate(Cancel);
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
  }
  
  public void BeforeDelete(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterInsert(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_AfterInsert();
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
    if (SrcObj == PAN_OPERE) PAN_OPERE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_UNITAORGANIZ) PAN_UNITAORGANIZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROOPERE) BUK_LIBROOPERE_OnPreview();
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
