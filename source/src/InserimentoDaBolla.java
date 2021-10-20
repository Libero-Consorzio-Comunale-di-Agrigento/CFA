// **********************************************
// Inserimento Da Bolla
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InserimentoDaBolla extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_BOLLE_PROGR = 0;
  private static int PFL_BOLLE_NUMEROBOLLA = 1;
  private static int PFL_BOLLE_DATABOLLA = 2;
  private static int PFL_BOLLE_BOLLA = 3;

  private static int PPQRY_BOLLE1 = 0;


  IDPanel PAN_BOLLE;
  private static int PFL_DETTAGLBOLLE_NUMEROBUONO = 0;
  private static int PFL_DETTAGLBOLLE_ANNOBUONO = 1;
  private static int PFL_DETTAGLBOLLE_PROGRESBUONO = 2;
  private static int PFL_DETTAGLBOLLE_INFO = 3;
  private static int PFL_DETTAGLBOLLE_DESCRIZIONE = 4;
  private static int PFL_DETTAGLBOLLE_QUANTITA = 5;
  private static int PFL_DETTAGLBOLLE_IMPORTO = 6;
  private static int PFL_DETTAGLBOLLE_ORDINE = 7;
  private static int PFL_DETTAGLBOLLE_PROGREDETTAG = 8;
  private static int PFL_DETTAGLBOLLE_COPORD = 9;

  private static int PPQRY_DETTAGLBOLL1 = 0;


  IDPanel PAN_DETTAGLBOLLE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM50(IMDB);
    Init_TBL_DETTAGLBOLLE(IMDB);
    Init_TBL_BOLLE3(IMDB);
    //
    //
    Init_PQRY_BOLLE1(IMDB);
    Init_PQRY_BOLLE1_RS(IMDB);
    Init_PQRY_DETTAGLBOLL1(IMDB);
    Init_QRY_CFASELINTV76(IMDB);
    Init_QRY_DETTAGLBOLL3(IMDB);
    Init_QRY_DETTAGLBOLL4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM50(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM50, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM50, "TBL_PARAM50");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM50,IMDBDef2.FLD_PARAM50_ROWNAMEFORNI, "ROWNAMEFORNI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM50,IMDBDef2.FLD_PARAM50_ROWNAMEFORNI,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM50,IMDBDef2.FLD_PARAM50_ROWNAMEERROR, "ROWNAMEERROR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM50,IMDBDef2.FLD_PARAM50_ROWNAMEERROR,1,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM50, 0);
  }

  private static void Init_TBL_DETTAGLBOLLE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_DETTAGLBOLLE, 8);
    IMDB.set_TblCode(IMDBDef2.TBL_DETTAGLBOLLE, "TBL_DETTAGLBOLLE");
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA, "PROGRESSIVO_BOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA,3,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO, "PROGRESSIVO_DETTAGLIO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_QUANTITA, "QUANTITA");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_QUANTITA,3,10,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMRIGBOL, "ROWNAMRIGBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_DETTAGLBOLLE,IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMRIGBOL,1,9,0);
  }

  private static void Init_TBL_BOLLE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_BOLLE3, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_BOLLE3, "TBL_BOLLE3");
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_FORNITORE, "FORNITORE");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_FORNITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ANNO_BOLLA, "ANNO_BOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ANNO_BOLLA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_NUMERO_BOLLA, "NUMERO_BOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_NUMERO_BOLLA,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_BOLLA, "DATA_BOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_BOLLA,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ID_DOCUMENTALE, "ID_DOCUMENTALE");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_ID_DOCUMENTALE,3,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA,6,19,0);
  }

  private static void Init_PQRY_BOLLE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_BOLLE1, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_BOLLE1, "PQRY_BOLLE1");
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_NUMERO_BOLLA, "NUMERO_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_NUMERO_BOLLA,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_DATA_BOLLA, "DATA_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1,IMDBDef10.PQSL_BOLLE1_DATA_BOLLA,6,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_BOLLE1, 0);
  }

  private static void Init_PQRY_BOLLE1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_BOLLE1_RS, 3);
    IMDB.set_TblCode(IMDBDef10.PQRY_BOLLE1_RS, "PQRY_BOLLE1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_NUMERO_BOLLA, "NUMERO_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_NUMERO_BOLLA,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_DATA_BOLLA, "DATA_BOLLA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BOLLE1_RS,IMDBDef10.PQSL_BOLLE1_DATA_BOLLA,6,19,0);
  }

  private static void Init_PQRY_DETTAGLBOLL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_DETTAGLBOLL1, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_DETTAGLBOLL1, "PQRY_DETTAGLBOLL1");
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_QUANTITA, "QUANTITA");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_QUANTITA,3,10,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_PROGRESSIVO_DETTAGLIO, "PROGRESSIVO_DETTAGLIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_PROGRESSIVO_DETTAGLIO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DESCRIZIONE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DETTBOLLIMPO, "DETTBOLLIMPO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DETTBOLLIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DETTBOLLINFO, "DETTBOLLINFO");
    IMDB.SetFldParams(IMDBDef10.PQRY_DETTAGLBOLL1,IMDBDef10.PQSL_DETTAGLBOLL1_DETTBOLLINFO,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_DETTAGLBOLL1, 0);
  }

  private static void Init_QRY_CFASELINTV76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTV76, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTV76, "QRY_CFASELINTV76");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV76,IMDBDef10.QSL_CFASELINTV76_SUMFATBUIMIM, "SUMFATBUIMIM");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV76,IMDBDef10.QSL_CFASELINTV76_SUMFATBUIMIM,3,28,6);
  }

  private static void Init_QRY_DETTAGLBOLL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_DETTAGLBOLL3, 3);
    IMDB.set_TblCode(IMDBDef10.QRY_DETTAGLBOLL3, "QRY_DETTAGLBOLL3");
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPROBOL, "ROWNAMPROBOL");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPROBOL,3,10,0);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPRODET, "ROWNAMPRODET");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL3,IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPRODET,1,10,0);
  }

  private static void Init_QRY_DETTAGLBOLL4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_DETTAGLBOLL4, 6);
    IMDB.set_TblCode(IMDBDef10.QRY_DETTAGLBOLL4, "QRY_DETTAGLBOLL4");
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL, "ROWNAMPROBOL");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL,3,10,0);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMANNBUO, "ROWNAMANNBUO");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMANNBUO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMNUMBUO, "ROWNAMNUMBUO");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMNUMBUO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBUO, "ROWNAMPROBUO");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBUO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_RIGABOLLA, "RIGABOLLA");
    IMDB.SetFldParams(IMDBDef10.QRY_DETTAGLBOLL4,IMDBDef10.QSL_DETTAGLBOLL4_RIGABOLLA,1,9,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InserimentoDaBolla(MyWebEntryPoint w, IMDBObj imdb)
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
  public InserimentoDaBolla()
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
    FormIdx = MyGlb.FRM_INSERDABOLLA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F6ABD764-B3C9-4FBE-9EF3-596BE1638590";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 406;
    set_Caption(new IDVariant("Inserimento Da Bolla"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 380;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "BA0E7582-E249-4EC8-BDFE-5DA96FB1A9FA";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Bolle";
    Frames[2].Parent = this;
    PAN_BOLLE = new IDPanel(w, this, 2, "PAN_BOLLE");
    Frames[2].Content = PAN_BOLLE;
    PAN_BOLLE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOLLE.VS = MainFrm.VisualStyleList;
    PAN_BOLLE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_BOLLE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7E898BC0-CBB9-4051-9DB6-5EFDEF4C2249");
    PAN_BOLLE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 176, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BOLLE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOLLE.InitStatus = 2;
    PAN_BOLLE_Init();
    PAN_BOLLE_InitFields();
    PAN_BOLLE_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Bolle", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Dettagli Bolle";
    Frames[3].Parent = this;
    PAN_DETTAGLBOLLE = new IDPanel(w, this, 3, "PAN_DETTAGLBOLLE");
    Frames[3].Content = PAN_DETTAGLBOLLE;
    PAN_DETTAGLBOLLE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLBOLLE.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "18F09C7F-3EA0-49B1-8A76-4A598306A742");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 532, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLBOLLE.InitStatus = 2;
    PAN_DETTAGLBOLLE_Init();
    PAN_DETTAGLBOLLE_InitFields();
    PAN_DETTAGLBOLLE_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Dettagli Bolle", "");
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
      if (IMDB.TblModified(IMDBDef2.TBL_BOLLE3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INSERDABOLLA_BOLLE1();
      }
      PAN_BOLLE.UpdatePanel(MainFrm);
      PAN_DETTAGLBOLLE.UpdatePanel(MainFrm);
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
    return (obj instanceof InserimentoDaBolla);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InserimentoDaBolla.class.getName() : (Glb.ClassWithPackage(InserimentoDaBolla.class) ? InserimentoDaBolla.class.getName().substring(InserimentoDaBolla.class.getPackage().getName().length() + 1) : InserimentoDaBolla.class.getName()));
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
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Bolle ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_BOLLE.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_BOLLE.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_BOLLE.SetRowSelector((new IDVariant(-1)).booleanValue()); 
      set_Caption(IDL.Add(v_MESSAGGIO, MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEFORNI, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_CODICE, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEFORNI, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_CODICE, 0),IDVariant.FLOAT));
        LOADEVENT_BOLLDELEROWS();
        LOADEVENT_BOLLINSEROWS();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // BOLLE: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_BOLLDELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_BOLLE3);
  }

  // **********************************************************************
  // BOLLE: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void LOADEVENT_BOLLINSEROWS() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as BOLLEPROGRES, ");
    SQL.append("  A.NUMERO_BOLLA as BOLLNUMEBOLL, ");
    SQL.append("  A.DATA_BOLLA as BOLLDATABOLL ");
    SQL.append("from ");
    SQL.append("  BOLLE A ");
    SQL.append("where (A.FORNITORE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEFORNI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.ANNO_PROG IS NULL)) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef2.TBL_BOLLE3, 0);
      IMDB.set_Value(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_NUMERO_BOLLA,0,RS.Get(2));
      IMDB.set_Value(IMDBDef2.TBL_BOLLE3,IMDBDef2.FLD_BOLLE3_DATA_BOLLA,0,RS.Get(3));
      RS.MoveNext();
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
    IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.booleanValue())
      {
        IDVariant v_SOMMAIMPUTAT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_DIFFERENZA = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_SOMMASELEZIO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);
        UNLOADEVENT_DETBOLDELROW();
        v_SOMMAIMPUTAT = (new IDVariant());
        UNLOADEVENT_CFASELINTV76();
        if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTV76, 0))
        {
          v_SOMMAIMPUTAT = IMDB.Value(IMDBDef10.QRY_CFASELINTV76, IMDBDef10.QSL_CFASELINTV76_SUMFATBUIMIM, 0, IDVariant.DECIMAL) ;
        }
        IMDB.TblMoveFirst (IMDBDef10.PQRY_BOLLE1_RS, 0);
        while (!IMDB.Eof(IMDBDef10.PQRY_BOLLE1_RS, 0))
        {
          if (PAN_BOLLE.IsRowSelected(v_RIGASELEZION.intValue()))
          {
            v_SOMMA = (new IDVariant(0, IDVariant.DECIMAL));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.PROGRESSIVO_BOLLA as DETBOLPROBOL, ");
            SQL.append("  A.PROGRESSIVO_DETTAGLIO as DETBOLPRODET, ");
            SQL.append("  A.QUANTITA as DETTBOLLQUAN, ");
            SQL.append("  A.ANNO_BUONO as DETBOLANNBUO, ");
            SQL.append("  A.NUMERO_BUONO as DETBOLNUMBUO, ");
            SQL.append("  A.PROGRESSIVO_BUONO as DETBOLPROBUO, ");
            SQL.append("  B.PREZZO as DETTBUONPREZ ");
            SQL.append("from ");
            SQL.append("  DETTAGLI_BOLLE A, ");
            SQL.append("  DETTAGLI_BUONI B ");
            SQL.append("where (A.PROGRESSIVO_BOLLA = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_BOLLE1_RS, IMDBDef10.PQSL_BOLLE1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.ANNO_BUONO(+) = A.ANNO_BUONO) ");
            SQL.append("and   (B.NUMERO_BUONO(+) = A.NUMERO_BUONO) ");
            SQL.append("and   (B.PROGRESSIVO_BUONO(+) = A.PROGRESSIVO_BUONO) ");
            C5 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!C5.EOF()) C5.MoveNext();
            while (!C5.EOF())
            {
              v_SOMMA = IDL.Add(v_SOMMA, (IDL.Mul(IDL.NullValue(C5.Get("DETTBOLLQUAN"),(new IDVariant(0))), IDL.NullValue(C5.Get("DETTBUONPREZ"),(new IDVariant(0))))));
              UNLOADEVENT_DETBOLINSVAL(C5.Get("DETBOLPROBOL"), C5.Get("DETBOLPRODET"), C5.Get("DETTBOLLQUAN"), C5.Get("DETBOLANNBUO"), C5.Get("DETBOLNUMBUO"), C5.Get("DETBOLPROBUO"), C5.Get("DETTBUONPREZ"), v_RIGASELEZION);
              C5.MoveNext();
            }
            C5.Close();
            v_SOMMASELEZIO = IDL.Add(v_SOMMASELEZIO, v_SOMMA);
          }
          v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
          IMDB.TblMoveNext(IMDBDef10.PQRY_BOLLE1_RS, 0);
        }
        v_DIFFERENZA = IDL.Sub((IDL.Add(v_SOMMAIMPUTAT, v_SOMMASELEZIO)), (IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMIMPFAT, 0)));
        if (v_DIFFERENZA.compareTo(IDL.NullValue(MainFrm.TOLLERANZA_CONTROLLO,(new IDVariant(0))), true)>0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Il totale liquidabile supera di Euro ", IDVariant.STRING));
          IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO1 = (new IDVariant(" l'importo della fattura", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MESSAGGIO, IDL.ToString(v_DIFFERENZA)), v_MESSAGGIO1)); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        else
        {
          if (v_DIFFERENZA.compareTo((new IDVariant(0)), true)>0)
          {
            if (v_DIFFERENZA.compareTo(IDL.NullValue(MainFrm.TOLLERANZA_CONTROLLO,(new IDVariant(0))), true)<0)
            {
              IDVariant v_IMPORTODAINS = new IDVariant(0,IDVariant.DECIMAL);
              IDVariant v_BREAK = new IDVariant(0,IDVariant.INTEGER);
              UNLOADEVENT_DETTAGLBOLL3();
              while (!IMDB.Eof(IMDBDef10.QRY_DETTAGLBOLL3, 0))
              {
                if (v_DIFFERENZA.compareTo(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL3, IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMEIMPOR, 0), true)>0)
                {
                  v_IMPORTODAINS = (new IDVariant(0, IDVariant.DECIMAL));
                  v_DIFFERENZA = IDL.Sub(v_DIFFERENZA, IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL3, IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMEIMPOR, 0));
                  v_BREAK = (new IDVariant(0));
                }
                else
                {
                  v_IMPORTODAINS = IDL.Sub(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL3, IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMEIMPOR, 0), v_DIFFERENZA);
                  v_BREAK = (new IDVariant(-1));
                }
                UNLOADEVENT_DETBOLUPDROW(v_IMPORTODAINS);
                if (v_BREAK.booleanValue())
                {
                  break;
                }
                IMDB.TblMoveNext(IMDBDef10.QRY_DETTAGLBOLL3, 0);
              }
            }
          }
          InsertIntoFattureBuoni();
          if (IMDB.Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEERROR, 0).equals((new IDVariant(1)), true))
          {
            Cancel.set((new IDVariant(-1)));
            IMDB.set_Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEERROR, 0, (new IDVariant()));
            return;
          }
          if (IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
          {
            ((ControlloFatture)MainFrm.GetForm(MyGlb.FRM_CONTROFATTUR,0,true,this)).RiempiIMDB();
          }
          IMDB.set_Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0, (new IDVariant(0)));
        }
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEERROR, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Bolle: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_DETBOLDELROW() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_DETTAGLBOLLE);
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Which data are you selecting?
  // **********************************************************************
  private void UNLOADEVENT_CFASELINTV76() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTV76);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTBUONIMDB, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTBUONIMDB, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, 0).equals(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0), true))
      {
        if (IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, 0).equals(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0), true))
        {
          IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
          IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, IMDB.Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO, 0));
        }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTBUONIMDB, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTBUONIMDB, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTBUONIMDB, 0);
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
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
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
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTV76, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV76, 0, 0, AggrBuff[0]);
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
                AggrBuff[0] = IDL.Add(AggrBuff[0], IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTV76, 0);
  }

  // **********************************************************************
  // Dettagli Bolle: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void UNLOADEVENT_DETBOLINSVAL(IDVariant C5_DETBOLPROBOL, IDVariant C5_DETBOLPRODET, IDVariant C5_DETTBOLLQUAN, IDVariant C5_DETBOLANNBUO, IDVariant C5_DETBOLNUMBUO, IDVariant C5_DETBOLPROBUO, IDVariant C5_DETTBUONPREZ, IDVariant v_RIGASELEZION) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_DETTAGLBOLLE, 0);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA, 0, C5_DETBOLPROBOL);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO, 0, C5_DETBOLPRODET);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_QUANTITA, 0, C5_DETTBOLLQUAN);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ANNO_BUONO, 0, C5_DETBOLANNBUO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_NUMERO_BUONO, 0, C5_DETBOLNUMBUO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BUONO, 0, C5_DETBOLPROBUO);
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR, 0, IDL.Mul(IDL.NullValue(C5_DETTBOLLQUAN,(new IDVariant(0))), IDL.NullValue(C5_DETTBUONPREZ,(new IDVariant(0)))));
    IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMRIGBOL, 0, v_RIGASELEZION);
  }

  // **********************************************************************
  // Dettagli Bolle
  // Which data are you selecting?
  // **********************************************************************
  private void UNLOADEVENT_DETTAGLBOLL3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_DETTAGLBOLL3);
    IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_DETTAGLBOLLE, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_DETTAGLBOLL3, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_DETTAGLBOLL3, 0, IMDBDef2.TBL_DETTAGLBOLLE, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL3, 0, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL3, 1, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL3, 2, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_DETTAGLBOLLE, 0);
      if (IMDB.Eof(IMDBDef2.TBL_DETTAGLBOLLE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef10.QRY_DETTAGLBOLL3);
    IMDB.TblSortBy(IMDBDef10.QRY_DETTAGLBOLL3,0,false);
    IMDB.TblStartSort(IMDBDef10.QRY_DETTAGLBOLL3);
    IMDB.TblMoveFirst(IMDBDef10.QRY_DETTAGLBOLL3, 0);
  }

  // **********************************************************************
  // Dettagli Bolle: Update rows
  // Why are you updating these data?
  // **********************************************************************
  private void UNLOADEVENT_DETBOLUPDROW(IDVariant v_IMPORTODAINS) throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
    while (!IMDB.Eof(IMDBDef2.TBL_DETTAGLBOLLE, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA, 0).equals(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL3, IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPROBOL, 0), true))
      {
      if (IMDB.Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_DETTAGLIO, 0).equals(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL3, IMDBDef10.QSL_DETTAGLBOLL3_ROWNAMPRODET, 0), true))
      {
      IMDB.set_Value(IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR, 0, v_IMPORTODAINS);
      }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_DETTAGLBOLLE, 0);
    }
    IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
  }

  // **********************************************************************
  // Insert Into Fatture Buoni
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InsertIntoFattureBuoni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_LIQUIDATO = new IDVariant(0,IDVariant.DECIMAL);
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Insert Into Fatture Buoni Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        INSINTFATBUO_DETTAGLBOLL4();
        while (!IMDB.Eof(IMDBDef10.QRY_DETTAGLBOLL4, 0))
        {
          IDVariant v_INSERITO = new IDVariant(0,IDVariant.INTEGER);
          v_LIQUIDATO = new IDVariant(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMEIMPOR, 0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.ANNO_BUONO as DETIMPBUANBU, ");
          SQL.append("  A.NUMERO_BUONO as DETIMPBUNUBU, ");
          SQL.append("  A.PROGRESSIVO_BUONO as DETIMPBUPRBU, ");
          SQL.append("  A.IMPORTO as DETIMPBUOIMP, ");
          SQL.append("  A.PROGRESSIVO_IMP as DETIMPBUPRIM ");
          SQL.append("from ");
          SQL.append("  DETTAGLI_IMPEGNI_BUONI A ");
          SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMANNBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMNUMBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((NVL(A.IMPORTO, 0) + NVL(A.VARIAZIONI, 0) - NVL(A.FATTURATO, 0)) > 0) ");
          C4 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C4.EOF()) C4.MoveNext();
          while (!C4.EOF())
          {
            IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
            if (v_LIQUIDATO.compareTo((new IDVariant(0)), true)<=0)
            {
              v_IMPORTO = (new IDVariant(0, IDVariant.DECIMAL));
            }
            else
            {
              if (v_IMPORTO.compareTo(v_LIQUIDATO, true)>0)
              {
                v_IMPORTO = new IDVariant(v_LIQUIDATO);
              }
              else
              {
                if (v_IMPORTO.compareTo(v_LIQUIDATO, true)<=0)
                {
                  v_IMPORTO = new IDVariant(C4.Get("DETIMPBUOIMP"));
                }
              }
            }
            v_NUMREC = (new IDVariant());
            if (IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  FATTURE_BUONI A ");
              SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.PROGRESSIVO_IMP = " + IDL.CSql(C4.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (IDL.IsNull(v_NUMREC) || v_NUMREC.equals((new IDVariant(0)), true))
              {
                SQL = new StringBuffer();
                SQL.append("insert into FATTURE_BUONI ");
                SQL.append("( ");
                SQL.append("  ANNO_BUONO, ");
                SQL.append("  NUMERO_BUONO, ");
                SQL.append("  PROGRESSIVO_BUONO, ");
                SQL.append("  ANNO_PROG, ");
                SQL.append("  NUMERO_PROG, ");
                SQL.append("  IMPUTATO, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  DATA_REGISTRAZIONE, ");
                SQL.append("  PROGRESSIVO_IMP, ");
                SQL.append("  UTENTE_INSERIMENTO ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(C4.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C4.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C4.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  to_number(NULL), ");
                SQL.append("  TRUNC( SYSDATE ), ");
                SQL.append("  " + IDL.CSql(C4.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                SQL = new StringBuffer();
                SQL.append("update FATTURE_BUONI set ");
                SQL.append("  IMPUTATO = FATTURE_BUONI.IMPUTATO + " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                SQL.append("where (ANNO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUANBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUNUBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO_BUONO = " + IDL.CSql(C4.Get("DETIMPBUPRBU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO_IMP = " + IDL.CSql(C4.Get("DETIMPBUPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            else
            {
              IDVariant v_DESCR = new IDVariant(0,IDVariant.STRING);
              v_DESCR = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.DESCRIZIONE as DETTBUONDESC ");
              SQL.append("from ");
              SQL.append("  DETTAGLI_BUONI A ");
              SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMANNBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMNUMBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_DESCR = QV.Get("DETTBUONDESC", IDVariant.STRING) ;
              }
              QV.Close();
              INSINTFATBUO_FATBUOIMININ(C4.Get("DETIMPBUANBU"), C4.Get("DETIMPBUNUBU"), C4.Get("DETIMPBUPRBU"), v_IMPORTO, C4.Get("DETIMPBUPRIM"), v_DESCR);
            }
            v_LIQUIDATO = IDL.Sub(v_LIQUIDATO, C4.Get("DETIMPBUOIMP"));
            if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0)))
            {
              IMDB.set_Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0, (new IDVariant(1)));
            }
            v_INSERITO = (new IDVariant(-1));
            C4.MoveNext();
          }
          C4.Close();
          if (!(v_INSERITO.booleanValue()))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Non esistono record su Dettagli Impegni Buoni per la Bolla ", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(v_SMS, IDL.ToString(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL, 0)))); 
            PAN_BOLLE.SetRowSelected((new IDVariant(0)).booleanValue(), IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_RIGABOLLA, 0).intValue()); 
            IMDB.set_Value(IMDBDef2.TBL_PARAM50, IMDBDef2.FLD_PARAM50_ROWNAMEERROR, 0, (new IDVariant(1)));
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          else
          {
            if (IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
            {
              SQL = new StringBuffer();
              SQL.append("update BOLLE set ");
              SQL.append("  ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            else
            {
              INSINTFATBUO_BOLLUPDAROWS();
            }
          }
          IMDB.TblMoveNext(IMDBDef10.QRY_DETTAGLBOLL4, 0);
        }
      }
      catch (Exception e20)
      {
        MainFrm.set_AlertMessage(new IDVariant(e20.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      if (IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMNUOFAT, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        ((ControlloFatture)MainFrm.GetForm(MyGlb.FRM_CONTROFATTUR,0,true,this)).RiempiIMDB();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "InsertIntoFattureBuoni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dettagli Bolle
  // Which data are you selecting?
  // **********************************************************************
  private void INSINTFATBUO_DETTAGLBOLL4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_DETTAGLBOLL4);
    IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_DETTAGLBOLLE, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_DETTAGLBOLL4, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_DETTAGLBOLL4, 0, IMDBDef2.TBL_DETTAGLBOLLE, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 0, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMEIMPOR, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 1, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BOLLA, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 2, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ANNO_BUONO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 3, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_NUMERO_BUONO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 4, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_PROGRESSIVO_BUONO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_DETTAGLBOLL4, 5, 0, IMDBDef2.TBL_DETTAGLBOLLE, IMDBDef2.FLD_DETTAGLBOLLE_ROWNAMRIGBOL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_DETTAGLBOLLE, 0);
      if (IMDB.Eof(IMDBDef2.TBL_DETTAGLBOLLE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_DETTAGLBOLLE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_DETTAGLBOLL4, 0);
  }

  // **********************************************************************
  // Fatture Buoni IMDB: Insert into
  // Why are you inserting this record?
  // **********************************************************************
  private void INSINTFATBUO_FATBUOIMININ(IDVariant C4_DETIMPBUANBU, IDVariant C4_DETIMPBUNUBU, IDVariant C4_DETIMPBUPRBU, IDVariant v_IMPORTO, IDVariant C4_DETIMPBUPRIM, IDVariant v_DESCR) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_FATTBUONIMDB, 0);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_BUONO, 0, C4_DETIMPBUANBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_BUONO, 0, C4_DETIMPBUNUBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_BUONO, 0, C4_DETIMPBUPRBU);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_ANNO_PROG, 0, IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_NUMERO_PROG, 0, IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_NUMERO_PROG, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_IMPUTATO, 0, v_IMPORTO);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_DATA_REGISTRAZIONE, 0, IDL.Today());
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_PROGRESSIVO_IMP, 0, C4_DETIMPBUPRIM);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDSTA, 0, (new IDVariant("N")));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDLIQ, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMDDES, 0, v_DESCR);
    IMDB.set_Value(IMDBDef2.TBL_FATTBUONIMDB, IMDBDef2.FLD_FATTBUONIMDB_FATBUOIMPRBO, 0, IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL, 0));
  }

  // **********************************************************************
  // BOLLE: Update rows
  // Why are you updating these data?
  // **********************************************************************
  private void INSINTFATBUO_BOLLUPDAROWS() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef2.TBL_BOLLE3, 0);
    while (!IMDB.Eof(IMDBDef2.TBL_BOLLE3, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_PROGRESSIVO, 0).equals(IMDB.Value(IMDBDef10.QRY_DETTAGLBOLL4, IMDBDef10.QSL_DETTAGLBOLL4_ROWNAMPROBOL, 0), true))
      {
      IMDB.set_Value(IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_ANNO_PROG, 0, IMDB.Value(IMDBDef10.PQRY_FAT10, IMDBDef10.PQSL_FAT10_ANNO_PROG, 0));
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_BOLLE3, 0);
    }
    IMDB.TblMoveFirst(IMDBDef2.TBL_BOLLE3, 0);
  }

  // **********************************************************************
  // Dettagli Bolle On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLBOLLE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGLBOLLE);
      // 
      // Dettagli Bolle On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGLBOLLE.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLBOLLE_DESCRIZIONE,(new IDVariant(PAN_DETTAGLBOLLE.FieldText(PFL_DETTAGLBOLLE_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "DettagliBolleOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Bolle On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DETTAGLBOLLE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Bolle On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_DETTAGLBOLLE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLBOLLE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGLBOLLE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGLBOLLE.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "DettagliBolleOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_ANNO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTAGLBOLL1, IMDBDef10.PQSL_DETTAGLBOLL1_ANNO_BUONO, 0));
      IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_NUMERO_BUONO, 0, IMDB.Value(IMDBDef10.PQRY_DETTAGLBOLL1, IMDBDef10.PQSL_DETTAGLBOLL1_NUMERO_BUONO, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoDaBolla", "Info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // BOLLE
  // Primary record source for panel data
  // **********************************************************************
  private void INSERDABOLLA_BOLLE1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_BOLLE1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_BOLLE3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_BOLLE3, 0))
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_ANNO_PROG, 0)))
      {
        IMDB.TblAddNew(IMDBDef10.PQRY_BOLLE1_RS, 0);
        IMDB.TblLinkRow(IMDBDef10.PQRY_BOLLE1_RS, 0, IMDBDef2.TBL_BOLLE3, 0);
        IMDB.TblLinkField(IMDBDef10.PQRY_BOLLE1_RS, 0, 0, IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_PROGRESSIVO, 0);
        IMDB.TblLinkField(IMDBDef10.PQRY_BOLLE1_RS, 1, 0, IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_NUMERO_BOLLA, 0);
        IMDB.TblLinkField(IMDBDef10.PQRY_BOLLE1_RS, 2, 0, IMDBDef2.TBL_BOLLE3, IMDBDef2.FLD_BOLLE3_DATA_BOLLA, 0);
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_BOLLE3, 0);
      if (IMDB.Eof(IMDBDef2.TBL_BOLLE3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_BOLLE3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef10.PQRY_BOLLE1_RS);
    IMDB.TblSortBy(IMDBDef10.PQRY_BOLLE1_RS,0,true);
    IMDB.TblStartSort(IMDBDef10.PQRY_BOLLE1_RS);
    IMDB.TblMoveFirst(IMDBDef10.PQRY_BOLLE1_RS, 0);
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BOLLE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BOLLE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOLLE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOLLE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOLLE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BOLLE);
    // Stub
  }

  private void PAN_BOLLE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BOLLE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOLLE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOLLE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLBOLLE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLBOLLE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLBOLLE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLBOLLE, Cancel);
    // Stub
  }

  private void PAN_DETTAGLBOLLE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGLBOLLE_INFO)
    {
      this.IdxPanelActived = this.PAN_DETTAGLBOLLE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGLBOLLE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLBOLLE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLBOLLE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOLLE_Init()
  {

    PAN_BOLLE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOLLE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BOLLE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_BOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, "77274043-6BBA-4761-BA8A-FA2BDD31F634");
    PAN_BOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, "Progr.");
    PAN_BOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, "");
    PAN_BOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_BOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, "F3B670C2-5696-4817-92E4-08BADA33BEBA");
    PAN_BOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, "NUMERO BOLLA");
    PAN_BOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, "");
    PAN_BOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, "3918BFA3-6395-4766-8748-60B0D9217411");
    PAN_BOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, "DATA BOLLA");
    PAN_BOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, "");
    PAN_BOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, "63892B69-96C3-4364-A6EC-5E288E263FA1");
    PAN_BOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, "Bolla");
    PAN_BOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_BOLLE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_LIST, 80);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_LIST, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_LIST, "Progr.");
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_FORM, 136);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_FORM, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_PROGR, MyGlb.PANEL_FORM, "Progr.");
    PAN_BOLLE.SetFieldPage(PFL_BOLLE_PROGR, -1, -1);
    PAN_BOLLE.SetFieldPanel(PFL_BOLLE_PROGR, PPQRY_BOLLE1, "A.PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 44, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 88);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_LIST, "NUMERO BOLLA");
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 4, 76, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 136);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_NUMEROBOLLA, MyGlb.PANEL_FORM, "NUMERO BOLLA");
    PAN_BOLLE.SetFieldPage(PFL_BOLLE_NUMEROBOLLA, -1, -1);
    PAN_BOLLE.SetFieldPanel(PFL_BOLLE_NUMEROBOLLA, PPQRY_BOLLE1, "A.NUMERO_BOLLA", "NUMERO_BOLLA", 5, 10, 0, -13997);
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_LIST, 108, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_LIST, 72);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_LIST, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_LIST, "DATA BOLLA");
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_FORM, 4, 100, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_FORM, 136);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_FORM, 1);
    PAN_BOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOLLE_DATABOLLA, MyGlb.PANEL_FORM, "DATA BOLLA");
    PAN_BOLLE.SetFieldPage(PFL_BOLLE_DATABOLLA, -1, -1);
    PAN_BOLLE.SetFieldPanel(PFL_BOLLE_DATABOLLA, PPQRY_BOLLE1, "A.DATA_BOLLA", "DATA_BOLLA", 6, 19, 0, -13997);
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_LIST, 44, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_LIST, 0);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_LIST, 2);
    PAN_BOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_FORM, 40, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_FORM, 0);
    PAN_BOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOLLE_BOLLA, MyGlb.PANEL_FORM, 2);
    PAN_BOLLE.SetFieldPage(PFL_BOLLE_BOLLA, -1, -1);
    PAN_BOLLE.SetFieldPanel(PFL_BOLLE_BOLLA, -1, "", "BOLLA", 0, 0, 0, -13997);
  }

  private void PAN_BOLLE_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOLLE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BOLLE.SetIMDB(IMDB, "PQRY_BOLLE1", true);
    PAN_BOLLE.set_SetString(MyGlb.MASTER_ROWNAME, "BOLLE");
    PAN_BOLLE.SetQueryIMDB(PPQRY_BOLLE1, IMDBDef10.PQRY_BOLLE1_RS, IMDBDef2.TBL_BOLLE3);
    JustLoaded = true;
    PAN_BOLLE.SetFieldPrimaryIndex(PFL_BOLLE_PROGR, IMDBDef2.FLD_BOLLE3_PROGRESSIVO);
    PAN_BOLLE.SetFieldPrimaryIndex(PFL_BOLLE_NUMEROBOLLA, IMDBDef2.FLD_BOLLE3_NUMERO_BOLLA);
    PAN_BOLLE.SetFieldPrimaryIndex(PFL_BOLLE_DATABOLLA, IMDBDef2.FLD_BOLLE3_DATA_BOLLA);
    PAN_BOLLE.SetMasterTable(0, "BOLLE3");
    PAN_BOLLE.AddToSortList(PFL_BOLLE_PROGR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOLLE.Status() == 2)
    {
      int oldListQBE = PAN_BOLLE.iUseListQBE;
      PAN_BOLLE.iUseListQBE = 0;
      PAN_BOLLE.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOLLE.PanelCommand(Glb.PCM_FIND);
      PAN_BOLLE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLBOLLE_Init()
  {

    PAN_DETTAGLBOLLE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLBOLLE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLBOLLE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, "EC05D440-D298-4568-97A5-2492B9B7412C");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, "NUMERO BUONO");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, "7BC82F67-ADF5-4F1A-A28A-DFC916D9611F");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, "ANNO BUONO");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, "06AA5A9A-E5D2-4CD7-837E-4A5AF8C8D431");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, "PROGRESSIVO BUONO");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, "201F2A3B-D562-490E-A83B-285A357FDFF2");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, "Info");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, "25FAAB86-3530-4091-AAC9-E0DEE6A644EF");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, "Descrizione");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, "FA92F547-6D6D-40D4-8758-134E9BE979CA");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, "Quantità");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, "157C760F-3A5A-4191-A0FF-35677AA66DF3");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, "Importo");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, "C1C3B3C5-7D72-4B9A-ABF8-B21B35728D92");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, "Ordine");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, "91FD3CE5-F72A-415B-B254-2CC67660383B");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, "PROGRESSIVO DETTAGLIO");
    PAN_DETTAGLBOLLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGLBOLLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, "D424D701-290C-4C24-98D6-3974DE5772E3");
    PAN_DETTAGLBOLLE.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, "");
    PAN_DETTAGLBOLLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLBOLLE.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGLBOLLE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_LIST, "NUM. BUONO");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_FORM, 152);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_NUMEROBUONO, MyGlb.PANEL_FORM, "NUMERO BUONO");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_NUMEROBUONO, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_NUMEROBUONO, PPQRY_DETTAGLBOLL1, "A.NUMERO_BUONO", "NUMERO_BUONO", 1, 6, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_LIST, 44, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_LIST, "ANNO BUONO");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_FORM, 4, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_FORM, 152);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ANNOBUONO, MyGlb.PANEL_FORM, "ANNO BUONO");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_ANNOBUONO, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_ANNOBUONO, PPQRY_DETTAGLBOLL1, "A.ANNO_BUONO", "ANNO_BUONO", 1, 4, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_LIST, 92, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_LIST, "PROGR. BUONO");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_FORM, 152);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGRESBUONO, MyGlb.PANEL_FORM, "PROGRESSIVO BUONO");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_PROGRESBUONO, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_PROGRESBUONO, PPQRY_DETTAGLBOLL1, "A.PROGRESSIVO_BUONO", "PROGRESSIVO_BUONO", 1, 3, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_LIST, 140, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_LIST, 28);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_FORM, 4, 292, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_FORM, 28);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_INFO, MyGlb.PANEL_FORM, "Inf.");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_INFO, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldUnbound(PFL_DETTAGLBOLLE_INFO, true);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_INFO, PPQRY_DETTAGLBOLL1, "CASE WHEN NOT ((B.ANNO_BUONO IS NULL)) THEN 'I' ELSE NULL END", "DETTBOLLINFO", 5, 99, 0, -13997);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGLBOLLE.SetValueListItem(PFL_DETTAGLBOLLE_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_LIST, 164, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_DESCRIZIONE, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_DESCRIZIONE, PPQRY_DETTAGLBOLL1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 2000, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_LIST, 340, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_LIST, "Quantità");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_FORM, 4, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_FORM, 152);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_QUANTITA, MyGlb.PANEL_FORM, "Quantità");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_QUANTITA, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_QUANTITA, PPQRY_DETTAGLBOLL1, "A.QUANTITA", "QUANTITA", 3, 10, 2, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_LIST, 412, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_IMPORTO, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldUnbound(PFL_DETTAGLBOLLE_IMPORTO, true);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_IMPORTO, PPQRY_DETTAGLBOLL1, "NVL(A.QUANTITA, 0) * NVL(B.PREZZO, 0)", "DETTBOLLIMPO", 3, 28, 6, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_LIST, 0, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_FORM, 0, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_ORDINE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_ORDINE, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_ORDINE, -1, "", "ORDINE", 0, 0, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_LIST, 604, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_LIST, 140);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_LIST, "PROGRESSIVO DETTAGLIO");
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_FORM, 4, 220, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_FORM, 140);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOLLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_PROGREDETTAG, MyGlb.PANEL_FORM, "PROGR. DETTAGLIO");
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_PROGREDETTAG, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_PROGREDETTAG, PPQRY_DETTAGLBOLL1, "A.PROGRESSIVO_DETTAGLIO", "PROGRESSIVO_DETTAGLIO", 1, 10, 0, -13997);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_LIST, 140, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLBOLLE.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_FORM, 8, 8, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOLLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLBOLLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOLLE_COPORD, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOLLE.SetFieldPage(PFL_DETTAGLBOLLE_COPORD, -1, -1);
    PAN_DETTAGLBOLLE.SetFieldPanel(PFL_DETTAGLBOLLE_COPORD, -1, "", "COPORD", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGLBOLLE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLBOLLE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLBOLLE.SetIMDB(IMDB, "PQRY_DETTAGLBOLL1", true);
    PAN_DETTAGLBOLLE.set_SetString(MyGlb.MASTER_ROWNAME, "DETTAGLI BOLLE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.QUANTITA as QUANTITA, ");
    SQL.append("  A.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  A.PROGRESSIVO_BUONO as PROGRESSIVO_BUONO, ");
    SQL.append("  A.PROGRESSIVO_DETTAGLIO as PROGRESSIVO_DETTAGLIO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.QUANTITA, 0) * NVL(B.PREZZO, 0) as DETTBOLLIMPO, ");
    SQL.append("  CASE WHEN NOT ((B.ANNO_BUONO IS NULL)) THEN 'I' ELSE NULL END as DETTBOLLINFO ");
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DETTAGLI_BOLLE A, ");
    SQL.append("  DETTAGLI_BUONI B ");
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO_BOLLA = ~~PQRY_BOLLE1.PROGRESSIVO~~) ");
    SQL.append("and   (B.ANNO_BUONO(+) = A.ANNO_BUONO) ");
    SQL.append("and   (B.NUMERO_BUONO(+) = A.NUMERO_BUONO) ");
    SQL.append("and   (B.PROGRESSIVO_BUONO(+) = A.PROGRESSIVO_BUONO) ");
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO_DETTAGLIO ");
    PAN_DETTAGLBOLLE.SetQuery(PPQRY_DETTAGLBOLL1, 5, SQL, -1, "");
    PAN_DETTAGLBOLLE.SetQueryDB(PPQRY_DETTAGLBOLL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLBOLLE.SetMasterTable(0, "DETTAGLI_BOLLE");
    PAN_DETTAGLBOLLE.AddToSortList(PFL_DETTAGLBOLLE_PROGREDETTAG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLBOLLE.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLBOLLE.iUseListQBE;
      PAN_DETTAGLBOLLE.iUseListQBE = 0;
      PAN_DETTAGLBOLLE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLBOLLE.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLBOLLE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOLLE) PAN_BOLLE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOLLE) PAN_BOLLE_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOLLE) PAN_BOLLE_DynamicProperties();
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOLLE) PAN_BOLLE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_BOLLE) PAN_BOLLE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLBOLLE) PAN_DETTAGLBOLLE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
