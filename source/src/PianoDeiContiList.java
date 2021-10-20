// **********************************************
// Piano Dei Conti List
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PianoDeiContiList extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_PARTE = 0;

  private static int PPQRY_FILTRO8 = 0;


  IDPanel PAN_FILTRO;
  private static int PFL_PIANODEICONT_CAPITOLO = 0;
  private static int PFL_PIANODEICONT_ARTICOLO = 1;
  private static int PFL_PIANODEICONT_DESCRIZIONE = 2;
  private static int PFL_PIANODEICONT_DESCRIABBREV = 3;
  private static int PFL_PIANODEICONT_ES = 4;
  private static int PFL_PIANODEICONT_ESERCIZIO = 5;
  private static int PFL_PIANODEICONT_CODICE = 6;
  private static int PFL_PIANODEICONT_IVLIVELLO = 7;
  private static int PFL_PIANODEICONT_VLIVELLO = 8;
  private static int PFL_PIANODEICONT_COFOG = 9;

  private static int PPQRY_CAP12 = 0;


  IDPanel PAN_PIANODEICONT;
  CIDREObj BUK_PIADEICONBOO;
  OBook BKW_PIADEICONBOO;
  //
  // Template Pages constants
  private static int BUK_PIADEICONBOO_MST_PIADEICOBOPA = 1;
  private static int BUK_PIADEICONBOO_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_PIADEICONBOO_SPAN_NUMEROPAGINA = 3;
  private static int BUK_PIADEICONBOO_RPTBOX_PAGEHEADER = 4;
  private static int BUK_PIADEICONBOO_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_PIADEICONBOO_RPT_NEWREPORT = 6;
  private static int BUK_PIADEICONBOO_SEC_REPORTHEADER = 7;
  private static int BUK_PIADEICONBOO_SEC_TITOLO = 8;
  private static int BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA = 9;
  private static int BUK_PIADEICONBOO_SPAN_ENTRATOSPESA = 10;
  private static int BUK_PIADEICONBOO_RPTBOX_BOXTITOLO = 11;
  private static int BUK_PIADEICONBOO_SPAN_PIANODEICONT = 12;
  private static int BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI = 13;
  private static int BUK_PIADEICONBOO_SPAN_CESETOSTSEES = 14;
  private static int BUK_PIADEICONBOO_SEC_PAGEHEADER = 15;
  private static int BUK_PIADEICONBOO_RPTBOX_CAPITOHEADER = 16;
  private static int BUK_PIADEICONBOO_SPAN_CAPITOLO = 17;
  private static int BUK_PIADEICONBOO_RPTBOX_ARTICOHEADER = 18;
  private static int BUK_PIADEICONBOO_SPAN_ARTICOLO = 19;
  private static int BUK_PIADEICONBOO_RPTBOX_DESCRIHEADER = 20;
  private static int BUK_PIADEICONBOO_SPAN_DESCRIZIONE = 21;
  private static int BUK_PIADEICONBOO_RPTBOX_CODICEHEADER = 22;
  private static int BUK_PIADEICONBOO_SPAN_CODICE1 = 23;
  private static int BUK_PIADEICONBOO_RPTBOX_VINCHEADER = 24;
  private static int BUK_PIADEICONBOO_SPAN_VINC = 25;
  private static int BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE = 26;
  private static int BUK_PIADEICONBOO_SPAN_RILIVA = 27;
  private static int BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE = 28;
  private static int BUK_PIADEICONBOO_SPAN_CONTRIBCOMUN = 29;
  private static int BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE = 30;
  private static int BUK_PIADEICONBOO_SPAN_FUNZDEL = 31;
  private static int BUK_PIADEICONBOO_RPTBOX_CGUHEADER = 32;
  private static int BUK_PIADEICONBOO_SPAN_CGU = 33;
  private static int BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA = 34;
  private static int BUK_PIADEICONBOO_SPAN_C1 = 35;
  private static int BUK_PIADEICONBOO_RPTBOX_LIVELLOIV = 36;
  private static int BUK_PIADEICONBOO_SPAN_LIVELLOIV = 37;
  private static int BUK_PIADEICONBOO_RPTBOX_LIVELLOV = 38;
  private static int BUK_PIADEICONBOO_SPAN_LIVELLOV = 39;
  private static int BUK_PIADEICONBOO_RPTBOX_COFOG1 = 40;
  private static int BUK_PIADEICONBOO_SPAN_C = 41;
  private static int BUK_PIADEICONBOO_SEC_DETAIL = 42;
  private static int BUK_PIADEICONBOO_RPTBOX_CAPITOLO = 43;
  private static int BUK_PIADEICONBOO_SPAN_RECAPDCLPDCB = 44;
  private static int BUK_PIADEICONBOO_RPTBOX_ARTICOLO = 45;
  private static int BUK_PIADEICONBOO_SPAN_REARPDCLPDCB = 46;
  private static int BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV = 47;
  private static int BUK_PIADEICONBOO_SPAN_REDAPDCLPDCB = 48;
  private static int BUK_PIADEICONBOO_RPTBOX_CODICE = 49;
  private static int BUK_PIADEICONBOO_SPAN_RCCSPDCLPDCB = 50;
  private static int BUK_PIADEICONBOO_RPTBOX_VINCOLO = 51;
  private static int BUK_PIADEICONBOO_SPAN_RCTVPDCLPDCB = 52;
  private static int BUK_PIADEICONBOO_RPTBOX_RILIVABORDI = 53;
  private static int BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE = 54;
  private static int BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC = 55;
  private static int BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD = 56;
  private static int BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO = 57;
  private static int BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD = 58;
  private static int BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI = 59;
  private static int BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR = 60;
  private static int BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD = 61;
  private static int BUK_PIADEICONBOO_RPTBOX_CGU = 62;
  private static int BUK_PIADEICONBOO_SPAN_RCCGPDCLPDCB = 63;
  private static int BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR = 64;
  private static int BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL = 65;
  private static int BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL = 66;
  private static int BUK_PIADEICONBOO_RPTBOX_LIVIV = 67;
  private static int BUK_PIADEICONBOO_SPAN_MACRO = 68;
  private static int BUK_PIADEICONBOO_RPTBOX_LIVV = 69;
  private static int BUK_PIADEICONBOO_SPAN_MACRO5 = 70;
  private static int BUK_PIADEICONBOO_RPTBOX_COFOG = 71;
  private static int BUK_PIADEICONBOO_SPAN_COFOG = 72;
  private static int BUK_PIADEICONBOO_SEC_REPORTFOOTER = 73;
  private static int BUK_PIADEICONBOO_RPTBOX_LINEAINFERIO = 74;


  // Definition of Global Variables
  private IDVariant TIPONUOVO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant RPPATTIVA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO6(IMDB);
    //
    //
    Init_PQRY_CAP12(IMDB);
    Init_PQRY_FILTRO8(IMDB);
    Init_PQRY_FILTRO8_RS(IMDB);
    Init_PQRY_CAP8(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FILTRO6, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_FILTRO6, "TBL_FILTRO6");
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO6,IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, "ROWNAMENTESP");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO6,IMDBDef3.FLD_FILTRO6_ROWNAMENTESP,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FILTRO6, 0);
  }

  private static void Init_PQRY_CAP12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAP12, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAP12, "PQRY_CAP12");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_CODICE_STRUTTURA, "CODICE_STRUTTURA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_CODICE_STRUTTURA,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_IVLIVELLO, "IVLIVELLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_IVLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_VLIVELLO, "VLIVELLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_VLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_COFOG, "COFOG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP12,IMDBDef10.PQSL_CAP12_COFOG,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAP12, 0);
  }

  private static void Init_PQRY_FILTRO8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRO8, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRO8, "PQRY_FILTRO8");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRO8,IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, "ROWNAMENTESP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRO8,IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FILTRO8, 0);
  }

  private static void Init_PQRY_FILTRO8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRO8_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRO8_RS, "PQRY_FILTRO8_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRO8_RS,IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, "ROWNAMENTESP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRO8_RS,IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP,5,1,0);
  }

  private static void Init_PQRY_CAP8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAP8, 26);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAP8, "PQRY_CAP8");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_PROGETTO, "PROGETTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_PROGETTO,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CONTRIB_COMU, "CONTRIB_COMU");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CONTRIB_COMU,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_FUNZ_DEL, "FUNZ_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_FUNZ_DEL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_GRUPPO_CP, "GRUPPO_CP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_GRUPPO_CP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_GRUPPO_CC, "GRUPPO_CC");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_GRUPPO_CC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COD_TERZI, "COD_TERZI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COD_TERZI,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_RECCAPCODSTR, "RECCAPCODSTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_RECCAPCODSTR,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_RECAENSPNORI, "RECAENSPNORI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_RECAENSPNORI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_MACRO, "MACRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_MACRO,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_MACRO5, "MACRO5");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_MACRO5,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COFOG, "COFOG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP8,IMDBDef10.PQSL_CAP8_COFOG,1,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAP8, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PianoDeiContiList(MyWebEntryPoint w, IMDBObj imdb)
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
  public PianoDeiContiList()
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
    FormIdx = MyGlb.FRM_PIADEICONLIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "935208B1-C72E-4E0D-84B7-C61D0FB5DF39";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 510;
    set_Caption(new IDVariant("Piano Dei Conti List"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 484;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0661157;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 872;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "872A3537-3CA8-4022-909C-3075D4B55AA6");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 872;
    Frames[3].Height = 452;
    Frames[3].Caption = "Piano Dei Conti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 452;
    PAN_PIANODEICONT = new IDPanel(w, this, 3, "PAN_PIANODEICONT");
    Frames[3].Content = PAN_PIANODEICONT;
    PAN_PIANODEICONT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PIANODEICONT.VS = MainFrm.VisualStyleList;
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 452-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F8084366-BC5A-48DF-82AA-D084F0855417");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 824, 396, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PIANODEICONT.InitStatus = 1;
    PAN_PIANODEICONT_Init();
    PAN_PIANODEICONT_InitFields();
    PAN_PIANODEICONT_InitQueries();
    BKW_PIADEICONBOO = new OBook(this);
    BUK_PIADEICONBOO = new CIDREObj(BKW_PIADEICONBOO);
    BKW_PIADEICONBOO.iGuid = "40BE70F5-B44E-40CB-A0C2-76139F227D53";
    BKW_PIADEICONBOO.Code = "BUK_PIADEICONBOO";
    BKW_PIADEICONBOO.BookObj = BUK_PIADEICONBOO;
    BKW_PIADEICONBOO.InitDefMasks();
    BUK_PIADEICONBOO.InitBook(1, 1245185, "Piano Dei Conti Book", IMDB, MainFrm.VisualStyleList);
    BUK_PIADEICONBOO.InitHTML();
    BUK_PIADEICONBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PIADEICONBOO.Book.SetMainFrm(MainFrm);
    BUK_PIADEICONBOO.SetRTCGuid(0, "40BE70F5-B44E-40CB-A0C2-76139F227D53");
    BUK_PIADEICONBOO.SetObjCode(0, "PIADEICONBOO");
    BUK_PIADEICONBOO_MST_PIADEICOBOPA_Init();
    BUK_PIADEICONBOO_RPT_NEWREPORT_Init();
    BUK_PIADEICONBOO_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FORMLIST4+BaseCmdLinIdx)
      {
        FormList();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVO7+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELLA8+BaseCmdLinIdx)
      {
        Cancella();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIONALAGG+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_MENUFUNZIAGG+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIONALAGG+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPA10+BaseCmdLinIdx)
      {
        Stampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOARTICOL+BaseCmdLinIdx)
      {
        NuovoArticolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INSESUESESUC+BaseCmdLinIdx)
      {
        ApriInserimentoSuEserciziSuccessivi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CAPPERUNIORG+BaseCmdLinIdx)
      {
        ApriCapitoliPerUnitàOrganizzativa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOUO+BaseCmdLinIdx)
      {
        ApriElencoUO();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOFINANZ+BaseCmdLinIdx)
      {
        ApriElencoFinanziamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTROLLIUO+BaseCmdLinIdx)
      {
        ControlliUO();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STACAPFPVDOP+BaseCmdLinIdx)
      {
        StampaCapitoliFPVDoppi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CAPSENIMPECO+BaseCmdLinIdx)
      {
        CapSenzaImpEco();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENIMPUECON+BaseCmdLinIdx)
      {
        ApriElencoImputazioniEconomiche();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RECECOSUMOA1+BaseCmdLinIdx)
      {
        ApriRecuperoEconomicaSuMovimenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REREECSUMOM1+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_RECRETECSUMO, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MOVSENIMPECO+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_MOVSENIMPECO, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DOCSENIMPECO+BaseCmdLinIdx)
      {
        DocumentisenzaImputazioneEconomica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CACODISUESSU+BaseCmdLinIdx)
      {
        CapitoliConDifferenzeSuEserciziSucc();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGTIAVSUCAAU+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_AGTIAVSUCAAU, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGTIAVSUCAMA+BaseCmdLinIdx)
      {
        ApriAggTipoAvanzoSuCapitoliMANUALE();
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
      if (IMDB.TblModified(IMDBDef3.TBL_FILTRO6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PIADEICONLIS_FILTRO8();
      }
      PAN_PIANODEICONT.UpdatePanel(MainFrm);
      PAN_FILTRO.UpdatePanel(MainFrm);
      // BUK_PIADEICONBOO.UpdateBook();
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
    if (Code.equals("BUK_PIADEICONBOO")) return BUK_PIADEICONBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof PianoDeiContiList);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PianoDeiContiList.class.getName() : (Glb.ClassWithPackage(PianoDeiContiList.class) ? PianoDeiContiList.class.getName().substring(PianoDeiContiList.class.getPackage().getName().length() + 1) : PianoDeiContiList.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_PIANODEICONT.Freezed = (new IDVariant(-1)).booleanValue();
      IMDB.set_Value(IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0, (new IDVariant("S")));
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Piano dei Conti")), (new IDVariant(" "))), MainFrm.ESERCIZIO));
      PAN_PIANODEICONT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PIANODEICONT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PIANODEICONT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PIANODEICONT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PIANODEICONT.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PIANODEICONT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIONALAGG+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      PAN_PIANODEICONT.SetRowSelector((new IDVariant(-1)).booleanValue()); 
      if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
      {
        if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)<=0)
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RECECOSUMOA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RECECOSUMOA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELENIMPUECON+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_RECECOSUMOA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CAPSENIMPECO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        // MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELENIMPUECON+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (MainFrm.MODAIMPUENTR.compareTo((new IDVariant("FA")), true)!=0 && MainFrm.MODAIMPUSPES.compareTo((new IDVariant("FA")), true)!=0)
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DOCSENIMPECO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_DOCSENIMPECO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      RPPATTIVA = MainFrm.FunctionRppAttiva();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "LoadEvent", _e);
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
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_INSEAGGPDCON)), true))
      {
        PAN_PIANODEICONT.PanelCommand(Glb.PCM_REQUERY);
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGTIAVSUCAMA)), true) && Result.booleanValue())
      {
        IDVariant v_ERRORI = null;
        v_ERRORI = (new IDVariant());
        if (PAN_PIANODEICONT.ShowMultipleSel())
        {
          IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
          v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
          C5 = PAN_PIANODEICONT.MasterRS();
          if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
          if (!C5.Bof()) PAN_PIANODEICONT.GotoFirst();
          while (!PAN_PIANODEICONT.RSEOF())
          {
            if (PAN_PIANODEICONT.IsRowSelected(v_RIGASELEZION.intValue()))
            {
              try
              {
                SQL = new StringBuffer();
                SQL.append("update CAP set ");
                SQL.append("  TIPO_AVANZO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ESERCIZIO = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', ESERCIZIO, " + IDL.CSql(C5.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
                SQL.append("and   (ESERCIZIO >= DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', " + IDL.CSql(C5.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0)) ");
                SQL.append("and   (E_S = " + IDL.CSql(C5.Get("E_S"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (CAPITOLO = " + IDL.CSql(C5.Get("CAPITOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (ARTICOLO = " + IDL.CSql(C5.Get("ARTICOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              catch (Exception e8)
              {
                v_ERRORI = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORI, (new IDVariant("Capitolo"))), (new IDVariant(" "))), IDL.ToString(C5.Get("CAPITOLO"))), (new IDVariant("/"))), IDL.ToString(C5.Get("ARTICOLO"))), (new IDVariant(": "))), new IDVariant(e8.getMessage())), (new IDVariant("<BR/>")));
              }
            }
            v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
            PAN_PIANODEICONT.GotoNext();
          }
          if (CurPos>0) C5.absolute(CurPos);
        }
        else
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update CAP set ");
            SQL.append("  TIPO_AVANZO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGTIPAVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (ESERCIZIO = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', ESERCIZIO, " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (ESERCIZIO >= DECODE(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PANNELOPZIO1, IMDBDef11.PQSL_PANNELOPZIO1_NOMOGGESESUC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0)) ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e11)
          {
            v_ERRORI = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORI, (new IDVariant("Capitolo"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0))), (new IDVariant(": "))), new IDVariant(e11.getMessage())), (new IDVariant("<BR/>")));
          }
        }
        if (!(IDL.IsNull(v_ERRORI)))
        {
          MainFrm.set_AlertMessage(v_ERRORI); 
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Elaborazione Eseguita"));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PIANODEICONT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PIANODEICONT);
      // 
      // Piano Dei Conti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_DESCRIZIONE,IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_DESCRIZIONE, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_DESCRIABBREV,IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_DESCRIZIONE_ABBREVIATA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "PianoDeiContiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PIANODEICONT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piano Dei Conti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_PIANODEICONT.Freezed = (new IDVariant(0)).booleanValue();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO7+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIONALAGG+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA8+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA10+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_PIANODEICONT.Freezed = (new IDVariant(-1)).booleanValue();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO7+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIONALAGG+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STAMPA10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (Command.equals((new IDVariant(16384)), true))
      {
        BUK_PIADEICONBOO.ReportRefreshQuery(BUK_PIADEICONBOO_RPT_NEWREPORT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "PianoDeiContiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_PIANODEICONT_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piano Dei Conti On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).compareTo((new IDVariant(0)), true)>0 && IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).equals((new IDVariant(0)), true) && MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOARTICOL+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOARTICOL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "PianoDeiContiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_PIANODEICONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PIANODEICONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Piano Dei Conti On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "PianoDeiContiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro Parte Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRO_PARTE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro Parte Validate Event Body
      // Procedure Body
      // 
      PAN_PIANODEICONT.set_ActualPosition(true, (new IDVariant(1)).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "FiltroParteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro On Updating Row Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "FiltroOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRO);
      // 
      // Filtro On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0).equals((new IDVariant("S")), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "FiltroOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Cancella
  // **********************************************************************
  public int Cancella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TEMPUS = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TEMP1 = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      // 
      // Cancella Body
      // Procedure Body
      // 
      try
      {
        if (!(PAN_PIANODEICONT.ShowMultipleSel()))
        {
          if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
          {
            MainFrm.set_AlertMessage((new IDVariant("Funzione Disabilitata. Impossibile inserire cancellare o aggiornare il record"))); 
          }
          else
          {
            v_TEMPUS = (new IDVariant(0));
            if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).equals((new IDVariant(0)), true))
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  CAP A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ARTICOLO <> 0) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_TEMPUS = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
            }
            if (v_TEMPUS.compareTo((new IDVariant(0)), true)!=0)
            {
              IDVariant v_ERRORMESS1 = new IDVariant(0,IDVariant.STRING);
              v_ERRORMESS1 = (new IDVariant(" Piano dei Conti. Capitolo/Art: ", IDVariant.STRING));
              IDVariant v_ERRORMESSAGE = null;
              v_ERRORMESSAGE = (new IDVariant(" sottoarticolato. Non è possibile cancellarlo."));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORMESS1, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0))), v_ERRORMESSAGE)); 
            }
            else
            {
              SQL = new StringBuffer();
              SQL.append("delete from CAP ");
              SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              PAN_PIANODEICONT.PanelCommand(Glb.PCM_REQUERY);
            }
          }
        }
        else
        {
          v_COUNT = (new IDVariant(1));
          if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
          {
            MainFrm.set_AlertMessage((new IDVariant("Funzione Disabilitata. Impossibile inserire cancellare o aggiornare il record"))); 
          }
          else
          {
            C12 = PAN_PIANODEICONT.MasterRS();
            if (C12.size()>0) CurPos = C12.getRow(); else CurPos = 0;
            if (!C12.Bof()) PAN_PIANODEICONT.GotoFirst();
            while (!PAN_PIANODEICONT.RSEOF())
            {
              if (PAN_PIANODEICONT.IsRowSelected(v_COUNT.intValue()))
              {
                v_TEMP1 = (new IDVariant(0));
                if (C12.Get("ARTICOLO").equals((new IDVariant(0)), true))
                {
                  if (C12.Get("CAPITOLO").equals((new IDVariant(0)), true) && C12.Get("ARTICOLO").equals((new IDVariant(0)), true))
                  {
                    SQL = new StringBuffer();
                    SQL.append("select ");
                    SQL.append("  COUNT(*) as COUNT1 ");
                    SQL.append("from ");
                    SQL.append("  CAP A ");
                    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (A.CAPITOLO <> 0 OR A.ARTICOLO <> 0) ");
                    QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                    if (!QV.EOF()) QV.MoveNext();
                    if (!QV.EOF())
                    {
                      v_TEMP1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
                    }
                    QV.Close();
                  }
                  else
                  {
                    SQL = new StringBuffer();
                    SQL.append("select ");
                    SQL.append("  COUNT(*) as COUNT1 ");
                    SQL.append("from ");
                    SQL.append("  CAP A ");
                    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C12.Get("CAPITOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   (A.ARTICOLO <> 0) ");
                    QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                    if (!QV.EOF()) QV.MoveNext();
                    if (!QV.EOF())
                    {
                      v_TEMP1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
                    }
                    QV.Close();
                  }
                }
                if (v_TEMP1.compareTo((new IDVariant(0)), true)!=0)
                {
                  IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
                  v_ERRORMESSAGE = (new IDVariant("legate nel Piano dei Conti. Capitolo/Art: ", IDVariant.STRING));
                  MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_ERRORMESSAGE, IDL.ToString(C12.Get("CAPITOLO"))), (new IDVariant(" / "))), IDL.ToString(C12.Get("ARTICOLO")))); 
                }
                else
                {
                  SQL = new StringBuffer();
                  SQL.append("delete from CAP ");
                  SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (CAPITOLO = " + IDL.CSql(C12.Get("CAPITOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (ARTICOLO = " + IDL.CSql(C12.Get("ARTICOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
              PAN_PIANODEICONT.GotoNext();
            }
            if (CurPos>0) C12.absolute(CurPos);
            PAN_PIANODEICONT.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
      catch (Exception e19)
      {
        MainFrm.set_AlertMessage(new IDVariant(e19.getMessage())); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "Cancella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovosu
  // **********************************************************************
  public int Nuovosu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovosu Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMENTSPE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        TIPONUOVO = (new IDVariant(0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).compareTo((new IDVariant(0)), true)>0 && IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        TIPONUOVO = (new IDVariant(4));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).compareTo((new IDVariant(0)), true)>0 && IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).compareTo((new IDVariant(0)), true)>0)
      {
        TIPONUOVO = (new IDVariant(5));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMETIPON, 0, new IDVariant(TIPONUOVO));
      MainFrm.Show(MyGlb.FRM_INSEAGGPDCON, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "Nuovosu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Articolo
  // **********************************************************************
  public int NuovoArticolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Articolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMENTSPE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0).equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        TIPONUOVO = (new IDVariant(0));
      }
      TIPONUOVO = (new IDVariant(1));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMETIPON, 0, new IDVariant(TIPONUOVO));
      MainFrm.Show(MyGlb.FRM_INSEAGGPDCON, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "NuovoArticolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Inserimento Su Esercizi Successivi
  // **********************************************************************
  public int ApriInserimentoSuEserciziSuccessivi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Apri Inserimento Su Esercizi Successivi Body
      // Procedure Body
      // 
      APRINSSUESSU_PIADEICODERO();
      if (PAN_PIANODEICONT.ShowMultipleSel())
      {
        IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
        v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
        C3 = PAN_PIANODEICONT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_PIANODEICONT.GotoFirst();
        while (!PAN_PIANODEICONT.RSEOF())
        {
          if (PAN_PIANODEICONT.IsRowSelected(v_RIGASELEZION.intValue()))
          {
            APRINSSUESSU_PIADEICOINV1(C3.Get("CAPITOLO"), C3.Get("ARTICOLO"), C3.Get("E_S"), C3.Get("ESERCIZIO"));
          }
          v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
          PAN_PIANODEICONT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRINSSUESSU_PIADEICOINVA();
      }
      MainFrm.Show(MyGlb.FRM_INSESUESESUC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriInserimentoSuEserciziSuccessivi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // PIANO DEI CONTI: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void APRINSSUESSU_PIADEICODERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_PIANODEICONT);
  }

  // **********************************************************************
  // PIANO DEI CONTI: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRINSSUESSU_PIADEICOINV1(IDVariant C3_CAPITOLO, IDVariant C3_ARTICOLO, IDVariant C3_E_S, IDVariant C3_ESERCIZIO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_PIANODEICONT, 0);
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_CAPITOLO, 0, C3_CAPITOLO);
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ARTICOLO, 0, C3_ARTICOLO);
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_E_S, 0, C3_E_S);
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ESERCIZIO, 0, C3_ESERCIZIO);
  }

  // **********************************************************************
  // PIANO DEI CONTI: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRINSSUESSU_PIADEICOINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_PIANODEICONT, 0);
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_CAPITOLO, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0));
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ARTICOLO, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0));
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_E_S, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_E_S, 0));
    IMDB.set_Value(IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ESERCIZIO, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ESERCIZIO, 0));
  }

  // **********************************************************************
  // Apri Imputazioni Economiche Su Movimenti
  // **********************************************************************
  public int ApriImputazioniEconomicheSuMovimenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Imputazioni Economiche Su Movimenti Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_RECECOSUMOAU, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriImputazioniEconomicheSuMovimenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Imputazioni Economiche
  // **********************************************************************
  public int ApriElencoImputazioniEconomiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Imputazioni Economiche Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      MainFrm.Show(MyGlb.FRM_ELIMECPIDECO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriElencoImputazioniEconomiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Capitoli Per Unità Organizzativa
  // **********************************************************************
  public int ApriCapitoliPerUnitàOrganizzativa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Capitoli Per Unità Organizzativa Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriCapitoliPerUnitàOrganizzativa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
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
      BUK_PIADEICONBOO.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_PIADEICONBOO.ReportRefreshQuery(BUK_PIADEICONBOO_RPT_NEWREPORT);
      BUK_PIADEICONBOO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_PIADEICONBOO.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco U O
  // **********************************************************************
  public int ApriElencoUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco U O Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARSTAVOCPEG, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARSTAANUOSC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARASTAMTIPO, 0, (new IDVariant("G")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMESTAM12, IMDBDef3.FLD_PARAMESTAM12_PARASTAMPART, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_ELENCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriElencoUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Form List
  // **********************************************************************
  public int FormList ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Form List Body
      // Corpo Procedura
      // 
      if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Funzione Disabilitata. Impossibile inserire cancellare o aggiornare il record"))); 
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_INSEAGGPDCON,(new IDVariant(-1)).booleanValue()); 
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMENTSPE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef10.PQRY_CAP12, IMDBDef10.PQSL_CAP12_ARTICOLO, 0));
        TIPONUOVO = (new IDVariant(3));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI287, IMDBDef3.FLD_PARAMETRI287_ROWNAMETIPON, 0, new IDVariant(TIPONUOVO));
        MainFrm.Show(MyGlb.FRM_INSEAGGPDCON, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "FormList", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inserisci
  // **********************************************************************
  public int Inserisci ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Body
      // Corpo Procedura
      // 
      if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Funzione Disabilitata. Impossibile inserire cancellare o aggiornare il record"))); 
      }
      else
      {
        Nuovosu();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "Inserisci", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Finanziamenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENFINAPIAN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriElencoFinanziamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cap Senza Imp Eco
  // **********************************************************************
  public int CapSenzaImpEco ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cap Senza Imp Eco Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMEOGGETTES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      MainFrm.Show(MyGlb.FRM_CAPSENIMPECO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "CapSenzaImpEco", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli UO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ControlliUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli UO Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGENTESP, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      MainFrm.Show(MyGlb.FRM_CONUOPIADECO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ControlliUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Capitoli FPV Doppi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaCapitoliFPVDoppi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Capitoli FPV Doppi Body
      // Corpo Procedura
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ORDINAMENTO")), (new IDVariant("MPT")));
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Capitoli_FPV_Doppi"));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "StampaCapitoliFPVDoppi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti senza Imputazione Economica
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DocumentisenzaImputazioneEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti senza Imputazione Economica Body
      // Corpo Procedura
      // 
      if (MainFrm.MODAIMPUENTR.equals((new IDVariant("FA")), true) || MainFrm.MODAIMPUSPES.equals((new IDVariant("FA")), true))
      {
        MainFrm.Show(MyGlb.FRM_DOCSENIMPECO, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Funzione Disabilitata. <br/>Modalità di imputazione da fattura non prevista"));
        MainFrm.set_AlertMessage(S); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "DocumentisenzaImputazioneEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Recupero Economica Su Movimenti
  // **********************************************************************
  public int ApriRecuperoEconomicaSuMovimenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Recupero Economica Su Movimenti Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_RECECOSUMOAU, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriRecuperoEconomicaSuMovimenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Capitoli Con Differenze Su Esercizi Succ
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CapitoliConDifferenzeSuEserciziSucc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Con Differenze Su Esercizi Succ Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0));
      MainFrm.Show(MyGlb.FRM_DIFFSUESESUC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "CapitoliConDifferenzeSuEserciziSucc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Agg Tipo Avanzo Su Capitoli MANUALE
  // **********************************************************************
  public int ApriAggTipoAvanzoSuCapitoliMANUALE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Apri Agg Tipo Avanzo Su Capitoli MANUALE Body
      // Corpo Procedura
      // 
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant I = null;
      I = (new IDVariant(1));
      if (PAN_PIANODEICONT.ShowMultipleSel())
      {
        C3 = PAN_PIANODEICONT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_PIANODEICONT.GotoFirst();
        while (!PAN_PIANODEICONT.RSEOF())
        {
          if (PAN_PIANODEICONT.IsRowSelected(I.intValue()))
          {
            v_SELEZIONATO = (new IDVariant(-1));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_PIANODEICONT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        if (!(v_SELEZIONATO.booleanValue()))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Nessuna riga selezionata"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      MainFrm.Show(MyGlb.FRM_AGTIAVSUCAMA, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "ApriAggTipoAvanzoSuCapitoliMANUALE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_PIADEICONBOO_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CAPITOLO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_ARTICOLO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CODICE, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCOLO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_COFOG, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, IDREGlb.RECT_HEIGHT))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti Book Page On Formatting
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PIADEICONBOO_MST_PIADEICOBOPA_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piano Dei Conti Book Page On Formatting Body
      // Corpo Procedura
      // 
      if (RPPATTIVA.compareTo((new IDVariant(0)), true)!=0)
      {
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCHEADER, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCHEADER, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCOLO, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCOLO, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCOLO, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_VINCOLO, IDREGlb.RECT_WIDTH)))), (new IDVariant(2))).dblValue());
      }
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0).equals((new IDVariant("S")), true))
      {
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, (new IDVariant(-1)).booleanValue());
        if (RPPATTIVA.compareTo((new IDVariant(0)), true)!=0)
        {
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, IDREGlb.RECT_WIDTH)))), (new IDVariant(5))).dblValue());
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, IDREGlb.RECT_WIDTH)))), (new IDVariant(4))).dblValue());
          // BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_LEFT, IDL.Add().dblValue());
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_WIDTH)))).dblValue());
          BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, IDREGlb.RECT_WIDTH)))).dblValue());
          // BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_LEFT, IDL.Add().dblValue());
        }
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_COFOG1, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_COFOG, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_COFOG1, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_COFOG, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      else
      {
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, (new IDVariant(-1)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_COFOG1, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxVisible(BUK_PIADEICONBOO_RPTBOX_COFOG, (new IDVariant(0)).booleanValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_CGU, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, IDREGlb.RECT_LEFT, IDL.Add(IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, IDREGlb.RECT_WIDTH)))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, IDREGlb.RECT_LEFT))), (new IDVariant(2))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, IDREGlb.RECT_WIDTH)))).dblValue());
        BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_LEFT, IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVIV, IDREGlb.RECT_WIDTH)))).dblValue());
      }
      BUK_PIADEICONBOO.set_BoxRect(BUK_PIADEICONBOO_RPTBOX_LINEAINFERIO, IDREGlb.RECT_WIDTH, IDL.Sub(((IMDB.Value(IMDBDef10.PQRY_FILTRO8, IMDBDef10.PQSL_FILTRO8_ROWNAMENTESP, 0).equals((new IDVariant("E")), true))?IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_LIVV, IDREGlb.RECT_WIDTH)))):IDL.Add((new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_COFOG, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PIADEICONBOO.BoxRect(BUK_PIADEICONBOO_RPTBOX_COFOG, IDREGlb.RECT_WIDTH))))), (new IDVariant(1))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiContiList", "PianoDeiContiBookPageOnFormatting", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void PIADEICONLIS_FILTRO8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FILTRO8_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_FILTRO6, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FILTRO8_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FILTRO8_RS, 0, IMDBDef3.TBL_FILTRO6, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRO8_RS, 0, 0, IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_FILTRO6, 0);
      if (IMDB.Eof(IMDBDef3.TBL_FILTRO6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FILTRO8_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
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
      PAN_FILTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRO_PARTE)
      {
        PFL_FILTRO_PARTE_ValidateCell(Cancel);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PIANODEICONT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PIANODEICONT, Cancel);
    // Stub
  }

  private void PAN_PIANODEICONT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PIANODEICONT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PIANODEICONT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PIANODEICONT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_PIADEICONBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PIADEICONBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PIADEICONBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PIADEICONBOO_SEC_TITOLO)
    {
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_ENTRATOSPESA, new IDVariant(((IMDB.Value(IMDBDef3.TBL_FILTRO6, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP, 0).equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_PIANODEICONT, new IDVariant((new IDVariant("Piano dei conti"))));
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_CESETOSTSEES, new IDVariant(IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
    }
    if (SectionID==BUK_PIADEICONBOO_SEC_PAGEHEADER)
    {
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_CGU, new IDVariant(((BUK_PIADEICONBOO.GetReportColumn(BUK_PIADEICONBOO_RPT_NEWREPORT, "E_S").equals((new IDVariant("E"))))?(new IDVariant("CGE")):(new IDVariant("CGU")))));
    }
    if (SectionID==BUK_PIADEICONBOO_SEC_DETAIL)
    {
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, new IDVariant(IDL.NullValue(BUK_PIADEICONBOO.GetReportColumn(BUK_PIADEICONBOO_RPT_NEWREPORT, "IVA"),(new IDVariant("NO")))));
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, new IDVariant(IDL.NullValue(BUK_PIADEICONBOO.GetReportColumn(BUK_PIADEICONBOO_RPT_NEWREPORT, "CONTRIB_COMU"),(new IDVariant("NO")))));
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, new IDVariant(IDL.NullValue(BUK_PIADEICONBOO.GetReportColumn(BUK_PIADEICONBOO_RPT_NEWREPORT, "FUNZ_DEL"),(new IDVariant("NO")))));
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, new IDVariant(IDL.NullValue(BUK_PIADEICONBOO.GetReportColumn(BUK_PIADEICONBOO_RPT_NEWREPORT, "RECAENSPNORI"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_PIADEICONBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PIADEICONBOO_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PIADEICONBOO_SEC_DETAIL)
    {
      BUK_PIADEICONBOO_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_PIADEICONBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PIADEICONBOO_MST_PIADEICOBOPA)
    {
      BUK_PIADEICONBOO.set_SpanValue(BUK_PIADEICONBOO_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PIADEICONBOO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PIADEICONBOO.GetTotalPagesNumber()))))));
      BUK_PIADEICONBOO_MST_PIADEICOBOPA_OnFormattingPage();
    }
  }

  private void BUK_PIADEICONBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PIADEICONBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PIADEICONBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PIADEICONBOO_OnPreview()
  {
    PreviewBook = BKW_PIADEICONBOO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PIANODEICONT_Init()
  {

    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "EF98CF00-43B4-40FE-A932-7CE1993474AF");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "Capitolo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "52962638-CDC1-4203-88AA-8B62A4E7622A");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "Articolo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, "C104704E-9170-4297-B6CC-1F4B609F8027");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, "Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, "7E12D904-F591-439E-B3C5-767F37856AC0");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, "Descrizione Abbreviata");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "49ACFB5A-280E-4C37-B65B-D1FEF0428C1A");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "E S");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "Brief description of field content.");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, "FA398C89-5EE1-4660-ABD4-DC400370128A");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, "ESERCIZIO");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, "C70F084B-14C7-4698-AB9B-E0E228C105D1");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, "Codice");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, "A8285224-DADB-4A5C-BBE5-A15266B1B198");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, "IV livello");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, "A3B847F8-D276-4156-9D17-D9AFF7F9C174");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, "V livello");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, "E6FB6779-BA45-498D-B4E9-4FA2BC0756EC");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, "Cofog");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PIANODEICONT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 68);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CAPITOLO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CAPITOLO, PPQRY_CAP12, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ARTICOLO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ARTICOLO, PPQRY_CAP12, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_LIST, 136, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_DESCRIZIONE, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_DESCRIZIONE, PPQRY_CAP12, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_LIST, 364, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_LIST, 144);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_LIST, "Descrizione Abbreviata");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_FORM, 4, 112, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_FORM, 144);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_DESCRIABBREV, MyGlb.PANEL_FORM, "Descrizione Abbreviata");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_DESCRIABBREV, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_DESCRIABBREV, PPQRY_CAP12, "A.DESCRIZIONE_ABBREVIATA", "DESCRIZIONE_ABBREVIATA", 5, 40, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 548, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 24);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, "E S");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 4, 136, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 24);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, "E S");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ES, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ES, PPQRY_CAP12, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 136, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ESERCIZIO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ESERCIZIO, PPQRY_CAP12, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_LIST, 572, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_LIST, 120);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_FORM, 4, 136, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CODICE, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CODICE, PPQRY_CAP12, "A.CODICE_STRUTTURA", "CODICE_STRUTTURA", 5, 10, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_LIST, 636, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_LIST, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_LIST, "IV livello");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_FORM, 4, 160, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_FORM, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_IVLIVELLO, MyGlb.PANEL_FORM, "IV livello");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_IVLIVELLO, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_IVLIVELLO, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_IVLIVELLO, PPQRY_CAP12, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO')", "IVLIVELLO", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_LIST, 704, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_LIST, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_LIST, "V livello");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_FORM, 4, 184, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VLIVELLO, MyGlb.PANEL_FORM, "V livello");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_VLIVELLO, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_VLIVELLO, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_VLIVELLO, PPQRY_CAP12, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO_5')", "VLIVELLO", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_LIST, 780, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_LIST, 48);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_FORM, 4, 208, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_FORM, 48);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_COFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_COFOG, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_COFOG, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_COFOG, PPQRY_CAP12, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'COFOG')", "COFOG", 5, 99, 0, -13997);
  }

  private void PAN_PIANODEICONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PIANODEICONT.SetIMDB(IMDB, "PQRY_CAP12", true);
    PAN_PIANODEICONT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CODICE_STRUTTURA as CODICE_STRUTTURA, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO') as IVLIVELLO, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO_5') as VLIVELLO, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'COFOG') as COFOG ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_FILTRO8.ROWNAMENTESP~~) ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP12, 5, SQL, -1, "");
    PAN_PIANODEICONT.SetQueryDB(PPQRY_CAP12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PIANODEICONT.SetMasterTable(0, "CAP");
    PAN_PIANODEICONT.AddToSortList(PFL_PIANODEICONT_CAPITOLO, true);
    PAN_PIANODEICONT.AddToSortList(PFL_PIANODEICONT_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PIANODEICONT.Status() == 2)
    {
      int oldListQBE = PAN_PIANODEICONT.iUseListQBE;
      PAN_PIANODEICONT.iUseListQBE = 0;
      PAN_PIANODEICONT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PIANODEICONT.PanelCommand(Glb.PCM_FIND);
      PAN_PIANODEICONT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, "3BF399BD-B50A-45D3-80C9-A0239DA342C3");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, "Parte");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_LIST, 88);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_FORM, 16, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_PARTE, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_PARTE, PPQRY_FILTRO8, "A.ROWNAMENTESP", "ROWNAMENTESP", 5, 1, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO8", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO8, IMDBDef10.PQRY_FILTRO8_RS, IMDBDef3.TBL_FILTRO6);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_PARTE, IMDBDef3.FLD_FILTRO6_ROWNAMENTESP);
    PAN_FILTRO.SetMasterTable(0, "FILTRO6");
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

  private void BUK_PIADEICONBOO_MST_PIADEICOBOPA_Init()
  {
    BUK_PIADEICONBOO.InitMastro(BUK_PIADEICONBOO_MST_PIADEICOBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_MST_PIADEICOBOPA, "7308220D-C71F-4C72-BAC6-BC4ABD32A67C");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_MST_PIADEICOBOPA, "PIADEICOBOPA");
    BUK_PIADEICONBOO.InitMastroBox(BUK_PIADEICONBOO_MST_PIADEICOBOPA, BUK_PIADEICONBOO_RPTBOX_NUMEROPAGINA, 27100, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_NUMEROPAGINA, "5F543CE7-932D-4877-AE28-FF10D6EBF7C1");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_NUMEROPAGINA, BUK_PIADEICONBOO_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_NUMEROPAGINA, "AA6B6789-D3AB-4C9B-B6D1-B5BDA218E40F");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PIADEICONBOO.InitMastroBox(BUK_PIADEICONBOO_MST_PIADEICOBOPA, BUK_PIADEICONBOO_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_PAGEHEADER, "B5D37A13-6359-4C7D-B7EB-6907A5EFF438");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_PIADEICONBOO.InitMastroBox(BUK_PIADEICONBOO_MST_PIADEICOBOPA, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1, 1000, 3000, 27700, 17000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_PAGEBODY1, "21053F1E-6C23-41A1-BC24-FFE21576BAE4");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_PIADEICONBOO_RPT_NEWREPORT_InitQuery() { BUK_PIADEICONBOO_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_PIADEICONBOO_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
      SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
      SQL.append("  A.PROGETTO as PROGETTO, ");
      SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
      SQL.append("  A.IVA as IVA, ");
      SQL.append("  A.CONTRIB_COMU as CONTRIB_COMU, ");
      SQL.append("  A.FUNZ_DEL as FUNZ_DEL, ");
      SQL.append("  A.GRUPPO_CP as GRUPPO_CP, ");
      SQL.append("  A.GRUPPO_CC as GRUPPO_CC, ");
      SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  A.COD_TERZI as COD_TERZI, ");
      SQL.append("  A.CATEGORIA as CATEGORIA, ");
      SQL.append("  A.FUNZIONE as FUNZIONE, ");
      SQL.append("  A.SERVIZIO as SERVIZIO, ");
      SQL.append("  A.COD_INTERVENTO as COD_INTERVENTO, ");
      SQL.append("  A.CODICE_STRUTTURA as RECCAPCODSTR, ");
      SQL.append("  A.ENTRATA_SPESA_NON_RIC as RECAENSPNORI, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  TRUNC(TO_NUMBER(B.CODICE)) ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
      SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   ((B.ESERCIZIO BETWEEN NVL(B.ESERCIZIO_INIZIO, 0) AND NVL(B.ESERCIZIO_SCADENZA, 9999))) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append(") as MACRO, ");
      SQL.append("  ( ");
      SQL.append("select ");
      SQL.append("  TRUNC(TO_NUMBER(C.CODICE)) ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP C ");
      SQL.append("where (C.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   ((C.ESERCIZIO BETWEEN NVL(C.ESERCIZIO_INIZIO, 0) AND NVL(C.ESERCIZIO_SCADENZA, 9999))) ");
      SQL.append("and   (C.E_S = A.E_S) ");
      SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.CODICE_TIPO_RICL = 'MACRO_5') ");
      SQL.append(") as MACRO5, ");
      SQL.append("  CASE WHEN A.E_S = 'S' THEN ( ");
      SQL.append("select ");
      SQL.append("  TRUNC(TO_NUMBER(D.CODICE)) ");
      SQL.append("from ");
      SQL.append("  VISTA_RICLASSIFICAZIONI_CAP D ");
      SQL.append("where (D.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   ((D.ESERCIZIO BETWEEN NVL(D.ESERCIZIO_INIZIO, 0) AND NVL(D.ESERCIZIO_SCADENZA, 9999))) ");
      SQL.append("and   (D.E_S = A.E_S) ");
      SQL.append("and   (D.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (D.CODICE_TIPO_RICL = 'MACRO') ");
      SQL.append(") ELSE to_number(NULL) END as COFOG ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_FILTRO8.ROWNAMENTESP~~) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO ");
      BUK_PIADEICONBOO.SetReportQuery(BUK_PIADEICONBOO_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "6E7F5A09-B54A-4C08-9BBF-76E9176F32BB");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PIADEICONBOO_RPT_NEWREPORT_Init()
  {
    BUK_PIADEICONBOO.InitReport(BUK_PIADEICONBOO_RPT_NEWREPORT, 196609);
    BUK_PIADEICONBOO_RPT_NEWREPORT_InitQuery(true, false);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPT_NEWREPORT, "453F8D53-BE7B-412F-929C-BE61EB1E3A95");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPT_NEWREPORT, "NEWREPORT");
    BUK_PIADEICONBOO.InitSection(BUK_PIADEICONBOO_RPT_NEWREPORT, BUK_PIADEICONBOO_SEC_REPORTHEADER, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 10682369, "");
    BUK_PIADEICONBOO.SetSectionRendersInto(BUK_PIADEICONBOO_SEC_REPORTHEADER, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SEC_REPORTHEADER, "97DA1D38-0741-4C78-89FE-6813A16D1C55");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PIADEICONBOO.InitSection(BUK_PIADEICONBOO_RPT_NEWREPORT, BUK_PIADEICONBOO_SEC_TITOLO, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_PIADEICONBOO.SetSectionRendersInto(BUK_PIADEICONBOO_SEC_TITOLO, BUK_PIADEICONBOO_RPTBOX_PAGEHEADER);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SEC_TITOLO, "48E9C575-D2EF-45F9-B466-40DE91DDCD65");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SEC_TITOLO, "TITOLO");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_TITOLO, BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA, 13000, 600, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA, "44D03495-7CAA-4C11-B27A-89BCFA169205");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA, "ENTRATOSPESA");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA, 3);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ENTRATOSPESA, BUK_PIADEICONBOO_SPAN_ENTRATOSPESA, MyGlb.VIS_NORMALGRASSE, 5, 99, 0, 271319425, "Entrata", "", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_ENTRATOSPESA, "E40D9E83-9CE7-40A3-BAE8-BD802218379C");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_ENTRATOSPESA, "ENTRATOSPESA");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_TITOLO, BUK_PIADEICONBOO_RPTBOX_BOXTITOLO, 12500, 0, 2400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_BOXTITOLO, "65463699-47A6-4967-A255-15518F1DCF2A");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_BOXTITOLO, "BOXTITOLO");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_BOXTITOLO, 3);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_BOXTITOLO, BUK_PIADEICONBOO_SPAN_PIANODEICONT, MyGlb.VIS_NORMALGRASSE, 5, 15, 0, 271319425, "", "", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_PIANODEICONT, "25FEEF91-A9AE-4CCB-BB98-4598AB43C844");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_PIANODEICONT, "PIANODEICONT");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_TITOLO, BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI, 12500, 1200, 2400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI, "C85F52EC-4406-4EC9-A5F8-F06E41CC49D4");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI, "ETICHEESERCI");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI, 3);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ETICHEESERCI, BUK_PIADEICONBOO_SPAN_CESETOSTSEES, MyGlb.VIS_NORMALGRASSE, 5, 109, 0, 271384705, "Esercizio", "", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_CESETOSTSEES, "69AD9F55-C13B-41FD-823E-1242B25CA8F2");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_CESETOSTSEES, "CESETOSTSEES");
    BUK_PIADEICONBOO.InitSection(BUK_PIADEICONBOO_RPT_NEWREPORT, BUK_PIADEICONBOO_SEC_PAGEHEADER, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PIADEICONBOO.SetSectionRendersInto(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SEC_PAGEHEADER, "108411B7-0782-4D65-B5D1-44F99EEB90DF");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_CAPITOHEADER, 0, 400, 2900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983297, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CAPITOHEADER, "0092242C-E0AB-4455-8A62-431F63269AC5");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CAPITOHEADER, "CAPITOHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CAPITOHEADER, BUK_PIADEICONBOO_SPAN_CAPITOLO, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Capitolo", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_CAPITOLO, "114F3687-0D9C-4DEB-93C2-AD6EADDA2758");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_CAPITOLO, "CAPITOLO");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_ARTICOHEADER, 2900, 400, 1500, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ARTICOHEADER, "81285754-ACD1-4FF3-875F-9968FB27E015");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ARTICOHEADER, "ARTICOHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ARTICOHEADER, BUK_PIADEICONBOO_SPAN_ARTICOLO, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Articolo", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_ARTICOLO, "2511592E-8CEB-452B-B579-CC63F16B9975");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_ARTICOLO, "ARTICOLO");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_DESCRIHEADER, 4400, 400, 6900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_DESCRIHEADER, "76109542-220B-46DA-B8C7-2BE8519726C6");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_DESCRIHEADER, BUK_PIADEICONBOO_SPAN_DESCRIZIONE, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_DESCRIZIONE, "4B96B303-02CF-4376-96EC-84AEC7DDF862");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_CODICEHEADER, 11300, 400, 1700, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CODICEHEADER, "4B2C2EFB-38F5-4DC4-95AD-AE441B49A564");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CODICEHEADER, BUK_PIADEICONBOO_SPAN_CODICE1, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Codice", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_CODICE1, "32BB9FF9-C768-4421-B069-52DF698B6E4B");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_CODICE1, "CODICE1");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_VINCHEADER, 13000, 400, 900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_VINCHEADER, "FB2BCEA5-F580-4111-8789-DADB46A5E5E7");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_VINCHEADER, "VINCHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_VINCHEADER, BUK_PIADEICONBOO_SPAN_VINC, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Vinc.", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_VINC, "CCC76531-232B-441A-8FAE-FDE71112A290");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_VINC, "VINC");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, 13900, 400, 800, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, "F2F0B469-EC42-473E-BD80-AFE1A563DA90");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, "RILIVABOBOHE");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_RILIVABOBOHE, BUK_PIADEICONBOO_SPAN_RILIVA, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Ril. Iva", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_RILIVA, "5FC46964-2894-4D2E-8534-6F38FA13DDC7");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_RILIVA, "RILIVA");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, 14700, 400, 1400, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, "96E595EE-41DE-4BDD-879D-E4E4518679AA");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, "CONCOMBOBOHE");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CONCOMBOBOHE, BUK_PIADEICONBOO_SPAN_CONTRIBCOMUN, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Contrib. Comun.", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_CONTRIBCOMUN, "512C6438-E4FA-46D5-BCA4-C141EAEA76E8");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_CONTRIBCOMUN, "CONTRIBCOMUN");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, 16100, 400, 1100, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, "5AEBE182-6DBF-4E95-BB5A-62A7B53ACB8A");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, "FUNDELBOBOHE");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_FUNDELBOBOHE, BUK_PIADEICONBOO_SPAN_FUNZDEL, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Funz. Del.", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_FUNZDEL, "AD4A7F35-2ADB-4843-9ABC-74AE465E621A");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_FUNZDEL, "FUNZDEL");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_CGUHEADER, 17200, 400, 900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, "039DFCFA-6DC9-4576-B896-FF26E9ECA466");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, "CGUHEADER");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CGUHEADER, BUK_PIADEICONBOO_SPAN_CGU, MyGlb.VIS_INTCONBORDO, 5, 99, 0, 271319425, "CGU", "", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_CGU, "67EBF835-F77E-4559-9F50-52AC9AA166D7");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_CGU, "CGU");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, 18100, 400, 900, 1000, 0, 1, 1, MyGlb.VIS_BOX, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, "0F46D6B3-B2C1-4818-B336-BA796DAEA79E");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, "ENTNONRICHEA");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ENTNONRICHEA, BUK_PIADEICONBOO_SPAN_C1, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "N.R.", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_C1, "FC95898A-7E68-4E3E-A00C-A62896E08010");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_C1, "C1");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, 19000, 400, 1600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, "51FA0AC2-BFC2-4B30-A70C-970453880CEF");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, "LIVELLOIV");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, 4);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_LIVELLOIV, BUK_PIADEICONBOO_SPAN_LIVELLOIV, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Livello IV", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_LIVELLOIV, "AA5A05A0-BE96-4572-B035-8882667F0CBF");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_LIVELLOIV, "LIVELLOIV");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_LIVELLOV, 20600, 400, 1900, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, "17B5CB3B-273D-40D3-8CA7-926AA919DEB2");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, "LIVELLOV");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, 4);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_LIVELLOV, BUK_PIADEICONBOO_SPAN_LIVELLOV, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Livello V", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_LIVELLOV, "298A880A-8574-4732-9E48-EBBE84032911");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_LIVELLOV, "LIVELLOV");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_PAGEHEADER, BUK_PIADEICONBOO_RPTBOX_COFOG1, 22500, 400, 1600, 1000, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_COFOG1, "089D51EC-F23A-4C10-BE18-1C93E893558A");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_COFOG1, "COFOG1");
    BUK_PIADEICONBOO.set_BoxAlignment(BUK_PIADEICONBOO_RPTBOX_COFOG1, 4);
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_COFOG1, BUK_PIADEICONBOO_SPAN_C, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384705, "", "Cofog", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_C, "9E06795A-194A-47AD-A7CA-DD9928C99E40");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_C, "C");
    BUK_PIADEICONBOO.InitSection(BUK_PIADEICONBOO_RPT_NEWREPORT, BUK_PIADEICONBOO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PIADEICONBOO.SetSectionRendersInto(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SEC_DETAIL, "F5C9D6A0-A55C-48CA-8FF3-06517FD639B1");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SEC_DETAIL, "DETAIL");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_CAPITOLO, 0, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_BORLATINTLUN, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CAPITOLO, "3F80CF47-FF6C-4E50-BE21-C3B84DA30054");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CAPITOLO, BUK_PIADEICONBOO_SPAN_RECAPDCLPDCB, MyGlb.VIS_BORLATINTLUN, 3, 16, 6, 271384705, "Brief description of field content.", "::CAPITOLO", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_RECAPDCLPDCB, "D9823A57-6F0A-4464-BADC-B88AEBD1D2A5");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_RECAPDCLPDCB, "RECAPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_ARTICOLO, 2900, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ARTICOLO, "93A31290-7C9B-440D-A84E-6FBC5F91EF92");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ARTICOLO, "ARTICOLO");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ARTICOLO, BUK_PIADEICONBOO_SPAN_REARPDCLPDCB, MyGlb.VIS_BORDILATERAL, 1, 2, 0, 271384705, "Brief description of field content.", "::ARTICOLO", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_REARPDCLPDCB, "57D5A2EE-9E2C-4299-A3E9-C6DA8104DB63");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_REARPDCLPDCB, "REARPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, 4400, 0, 6900, 500, 0, 1, 3, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, "E03FA069-7640-4D3B-8FCD-84CF95A6D11C");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, "DESCRIABBREV");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_DESCRIABBREV, BUK_PIADEICONBOO_SPAN_REDAPDCLPDCB, MyGlb.VIS_BORDILATERAL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE_ABBREVIATA", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_REDAPDCLPDCB, "CE306CF5-7136-4DEA-BF72-CB76AA893826");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_REDAPDCLPDCB, "REDAPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_CODICE, 11300, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983297, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CODICE, "D3E687CD-01D6-48E5-97A5-E95B49288BFC");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CODICE, "CODICE");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CODICE, BUK_PIADEICONBOO_SPAN_RCCSPDCLPDCB, MyGlb.VIS_BORDILATERAL, 5, 10, 0, 271384705, "", "::RECCAPCODSTR", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_RCCSPDCLPDCB, "C892FAC2-6097-42B1-B099-BEC453BC5001");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_RCCSPDCLPDCB, "RCCSPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_VINCOLO, 13000, 0, 900, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983297, 322, "Vincolo", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_VINCOLO, "EE57FBD3-7AA6-4A4D-A4E5-83D532E9E3B0");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_VINCOLO, "VINCOLO");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_VINCOLO, BUK_PIADEICONBOO_SPAN_RCTVPDCLPDCB, MyGlb.VIS_BORDILATERAL, 1, 6, 0, 271384705, "", "::TIPO_VINCOLO", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_RCTVPDCLPDCB, "DDEFEF61-AB27-40CE-9C59-C7A38B84D79F");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_RCTVPDCLPDCB, "RCTVPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, 13900, 0, 800, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, "23B1E112-8494-4810-917A-AFA466698B5F");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_RILIVABORDI, "RILIVABORDI");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE, 14100, 100, 500, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE, "67CDC84D-58DE-4E66-8AC0-4C3F84476F47");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE, "RILIVAVALORE");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_RILIVAVALORE, BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, "F328BA89-74AD-4930-9A40-89F102A72690");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_NVRCIPDCLPDC, "NVRCIPDCLPDC");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, 14700, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, "FDE41D71-25F0-42DF-8A37-B8CE291B1231");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CONTCOMUBORD, "CONTCOMUBORD");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, 15200, 100, 500, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, "F07A6A1B-86E3-4EE3-BF85-0C650364C05F");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, "CONTCOMUVALO");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CONTCOMUVALO, BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, "58345CDC-8113-4A1B-9521-8894EB6E45DD");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_NVRCCCPDCLPD, "NVRCCCPDCLPD");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, 16100, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, "BD329513-BE2B-44DA-BCA7-DFBDC5B38C5C");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_FUNZDELBORDI, "FUNZDELBORDI");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, 16400, 100, 500, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, "731C70B9-12D1-46F0-BC63-7B9474D8F48D");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, "FUNZDELVALOR");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_FUNZDELVALOR, BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, "43D96F8E-E8BC-4873-BB5B-E01759D663C9");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_NVRCFDPDCLPD, "NVRCFDPDCLPD");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_CGU, 17200, 0, 900, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983297, 322, "CGU", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_CGU, "C1D7A392-23CE-470D-A258-0AB4E3C42388");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_CGU, "CGU");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_CGU, BUK_PIADEICONBOO_SPAN_RCCGPDCLPDCB, MyGlb.VIS_BORDILATERAL, 1, 4, 0, 271384705, "", "::CODICE_GESTIONALE", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_RCCGPDCLPDCB, "1CFA2F94-C24B-406B-9FF6-5A0DD9A56994");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_RCCGPDCLPDCB, "RCCGPDCLPDCB");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, 18100, 0, 900, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, "1B5C80E7-AE8C-4208-AD7D-00D130F6CE5D");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ENTNONRICBOR, "ENTNONRICBOR");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL, 18300, 100, 500, 400, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL, "13EC761A-37F0-47BF-9713-D81E36E1D5BE");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL, "ENTNONRICVAL");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_ENTNONRICVAL, BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_PIADEICONBOO.SetSpanValueListItem(BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, "DEF2DB99-87CD-4790-BB95-192405A892BF");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_NVRCESNRPDCL, "NVRCESNRPDCL");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_LIVIV, 19000, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_LIVIV, "48A7F8DA-CBEE-40FC-BE44-8EC38E0D7195");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_LIVIV, "LIVIV");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_LIVIV, BUK_PIADEICONBOO_SPAN_MACRO, MyGlb.VIS_BORDILATERAL, 1, 19, 0, 271319425, "Macro", "::MACRO", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_MACRO, "02662CAA-357B-4A62-B42E-AB2FD9313538");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_MACRO, "MACRO");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_LIVV, 20600, 0, 1900, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_LIVV, "DCFDAD4B-7AA4-4173-AE51-C3E638CD478E");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_LIVV, "LIVV");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_LIVV, BUK_PIADEICONBOO_SPAN_MACRO5, MyGlb.VIS_BORDILATERAL, 1, 19, 0, 271319425, "Macro5", "::MACRO5", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_MACRO5, "B6ED944D-7D53-445F-952B-BE505BDEBBAF");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_MACRO5, "MACRO5");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_DETAIL, BUK_PIADEICONBOO_RPTBOX_COFOG, 22500, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 322, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_COFOG, "76E78AFB-857B-4209-9996-98D25F713288");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_COFOG, "COFOG");
    BUK_PIADEICONBOO.InitBoxSpan(BUK_PIADEICONBOO_RPTBOX_COFOG, BUK_PIADEICONBOO_SPAN_COFOG, MyGlb.VIS_BORDILATERAL, 1, 19, 0, 271319425, "Cofog", "::COFOG", 1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SPAN_COFOG, "28FDBD4E-3BFA-4D4A-9CAC-3AA656549832");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SPAN_COFOG, "COFOG");
    BUK_PIADEICONBOO.InitSection(BUK_PIADEICONBOO_RPT_NEWREPORT, BUK_PIADEICONBOO_SEC_REPORTFOOTER, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_PIADEICONBOO.SetSectionRendersInto(BUK_PIADEICONBOO_SEC_REPORTFOOTER, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_SEC_REPORTFOOTER, "395DA9A9-0541-4A49-B107-061E232CBCF5");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PIADEICONBOO.InitReportBox(BUK_PIADEICONBOO_SEC_REPORTFOOTER, BUK_PIADEICONBOO_RPTBOX_LINEAINFERIO, 100, 0, 24000, 200, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_PIADEICONBOO.SetRTCGuid(BUK_PIADEICONBOO_RPTBOX_LINEAINFERIO, "D9E2F7BE-6A28-4E4C-86DF-CEA904AB8C16");
    BUK_PIADEICONBOO.SetObjCode(BUK_PIADEICONBOO_RPTBOX_LINEAINFERIO, "LINEAINFERIO");
    BUK_PIADEICONBOO_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_PIADEICONBOO_InitLinks()
  {
    BUK_PIADEICONBOO.SetBoxNextBox(BUK_PIADEICONBOO_RPTBOX_PAGEBODY1, BUK_PIADEICONBOO_RPTBOX_PAGEBODY1);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_OnChangeRow();
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
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PIADEICONBOO) BUK_PIADEICONBOO_OnPreview();
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
