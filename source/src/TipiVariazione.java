// **********************************************
// Tipi Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_IMPEGNO_CODICE2 = 0;
  private static int PFL_IMPEGNO_DESCRIZIONE2 = 1;
  private static int PFL_IMPEGNO_MOTIVO1 = 2;
  private static int PFL_IMPEGNO_FATTORRESID1 = 3;
  private static int PFL_IMPEGNO_RIACCERTAME1 = 4;
  private static int PFL_IMPEGNO_GESTIOAVANZ1 = 5;
  private static int PFL_IMPEGNO_UTENTEINSER2 = 6;
  private static int PFL_IMPEGNO_DATAINSERIM2 = 7;
  private static int PFL_IMPEGNO_UTENTULTIAG2 = 8;
  private static int PFL_IMPEGNO_DATAULTIMAG2 = 9;

  private static int PPQRY_T70 = 0;

  private static int PPQRY_TIPIMOTIVAZ1 = 1;


  IDPanel PAN_IMPEGNO;
  private static int PFL_ACCERTAMENTO_CODICE = 0;
  private static int PFL_ACCERTAMENTO_DESCRIZIONE = 1;
  private static int PFL_ACCERTAMENTO_MOTIVO = 2;
  private static int PFL_ACCERTAMENTO_VARIAZAUTOMA = 3;
  private static int PFL_ACCERTAMENTO_FATTORRESIDU = 4;
  private static int PFL_ACCERTAMENTO_RIACCERTAMEN = 5;
  private static int PFL_ACCERTAMENTO_GESTIOAVANZO = 6;
  private static int PFL_ACCERTAMENTO_UTENTEINSERI = 7;
  private static int PFL_ACCERTAMENTO_DATAINSERIME = 8;
  private static int PFL_ACCERTAMENTO_UTENTULTIAGG = 9;
  private static int PFL_ACCERTAMENTO_DATAULTIMAGG = 10;

  private static int PPQRY_T78 = 0;

  private static int PPQRY_TIPIMOTIVAZI = 1;


  IDPanel PAN_ACCERTAMENTO;
  CIDREObj BUK_IMPEGNOBOOK;
  OBook BKW_IMPEGNOBOOK;
  //
  // Template Pages constants
  private static int BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE = 1;
  private static int BUK_IMPEGNOBOOK_RPTBOX_NUMEROPAGIN2 = 2;
  private static int BUK_IMPEGNOBOOK_SPAN_NUMEROPAGIN2 = 3;
  private static int BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3 = 4;
  private static int BUK_IMPEGNOBOOK_RPTBOX_TITOLO3 = 5;

  //
  // Reports constants
  private static int BUK_IMPEGNOBOOK_RPT_NEWREPORT = 6;
  private static int BUK_IMPEGNOBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_IMPEGNOBOOK_RPTBOX_CODICEHEADE2 = 8;
  private static int BUK_IMPEGNOBOOK_SPAN_CODICE2 = 9;
  private static int BUK_IMPEGNOBOOK_RPTBOX_DESCRIHEADE2 = 10;
  private static int BUK_IMPEGNOBOOK_SPAN_DESCRIZIONE2 = 11;
  private static int BUK_IMPEGNOBOOK_RPTBOX_TIPMOTDESHE1 = 12;
  private static int BUK_IMPEGNOBOOK_SPAN_MOTIVO1 = 13;
  private static int BUK_IMPEGNOBOOK_RPTBOX_FATTORHEADE1 = 14;
  private static int BUK_IMPEGNOBOOK_SPAN_FATTORRESID1 = 15;
  private static int BUK_IMPEGNOBOOK_RPTBOX_RIACCEHEADE1 = 16;
  private static int BUK_IMPEGNOBOOK_SPAN_RIACCERTAME1 = 17;
  private static int BUK_IMPEGNOBOOK_RPTBOX_GESTAVANHEA1 = 18;
  private static int BUK_IMPEGNOBOOK_SPAN_GESTIOAVANZ1 = 19;
  private static int BUK_IMPEGNOBOOK_SEC_TITOLO = 20;
  private static int BUK_IMPEGNOBOOK_RPTBOX_NEWBOX2 = 21;
  private static int BUK_IMPEGNOBOOK_SPAN_VARIADIBILA2 = 22;
  private static int BUK_IMPEGNOBOOK_SEC_DETAIL = 23;
  private static int BUK_IMPEGNOBOOK_RPTBOX_CODICE2 = 24;
  private static int BUK_IMPEGNOBOOK_SPAN_T5COTIVAIMBO = 25;
  private static int BUK_IMPEGNOBOOK_RPTBOX_DESCRIZIONE2 = 26;
  private static int BUK_IMPEGNOBOOK_SPAN_T5DETIVAIMBO = 27;
  private static int BUK_IMPEGNOBOOK_RPTBOX_TIPIMOTIDES1 = 28;
  private static int BUK_IMPEGNOBOOK_SPAN_T5DEMOTIVAIB = 29;
  private static int BUK_IMPEGNOBOOK_RPTBOX_FATTORE1 = 30;
  private static int BUK_IMPEGNOBOOK_SPAN_T5FARETIVAIB = 31;
  private static int BUK_IMPEGNOBOOK_RPTBOX_RIACCERTAME1 = 32;
  private static int BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN = 33;
  private static int BUK_IMPEGNOBOOK_RPTBOX_GESTIOAVANZ1 = 34;
  private static int BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN = 35;
  private static int BUK_IMPEGNOBOOK_SEC_PAGEFOOTER = 36;
  private static int BUK_IMPEGNOBOOK_SEC_REPORTFOOTER = 37;

  CIDREObj BUK_ACCERTAMBOOK;
  OBook BKW_ACCERTAMBOOK;
  //
  // Template Pages constants
  private static int BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE = 1;
  private static int BUK_ACCERTAMBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ACCERTAMBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_ACCERTAMBOOK_RPTBOX_TITOLO1 = 5;

  //
  // Reports constants
  private static int BUK_ACCERTAMBOOK_RPT_NEWREPORT = 6;
  private static int BUK_ACCERTAMBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_ACCERTAMBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_ACCERTAMBOOK_SPAN_CODICE = 9;
  private static int BUK_ACCERTAMBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_ACCERTAMBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_ACCERTAMBOOK_RPTBOX_TIPMOTDESHEA = 12;
  private static int BUK_ACCERTAMBOOK_SPAN_MOTIVO = 13;
  private static int BUK_ACCERTAMBOOK_RPTBOX_VARAUTOHEADE = 14;
  private static int BUK_ACCERTAMBOOK_SPAN_VARIAZAUTOMA = 15;
  private static int BUK_ACCERTAMBOOK_RPTBOX_FATTORHEADER = 16;
  private static int BUK_ACCERTAMBOOK_SPAN_FATTORRESIDU = 17;
  private static int BUK_ACCERTAMBOOK_RPTBOX_RIACCEHEADER = 18;
  private static int BUK_ACCERTAMBOOK_SPAN_RIACCERTAMEN = 19;
  private static int BUK_ACCERTAMBOOK_RPTBOX_GESTAVANHEAD = 20;
  private static int BUK_ACCERTAMBOOK_SPAN_GESTIOAVANZO = 21;
  private static int BUK_ACCERTAMBOOK_SEC_TITOLO = 22;
  private static int BUK_ACCERTAMBOOK_RPTBOX_NEWBOX = 23;
  private static int BUK_ACCERTAMBOOK_SPAN_VARIADIBILAN = 24;
  private static int BUK_ACCERTAMBOOK_SEC_DETAIL = 25;
  private static int BUK_ACCERTAMBOOK_RPTBOX_CODICE = 26;
  private static int BUK_ACCERTAMBOOK_SPAN_T5COTIVAACBO = 27;
  private static int BUK_ACCERTAMBOOK_RPTBOX_DESCRIZIONE = 28;
  private static int BUK_ACCERTAMBOOK_SPAN_T5DETIVAACBO = 29;
  private static int BUK_ACCERTAMBOOK_RPTBOX_TIPIMOTIDESC = 30;
  private static int BUK_ACCERTAMBOOK_SPAN_T5DEMOTIVAAB = 31;
  private static int BUK_ACCERTAMBOOK_RPTBOX_VARAUTO = 32;
  private static int BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN = 33;
  private static int BUK_ACCERTAMBOOK_RPTBOX_FATTORE = 34;
  private static int BUK_ACCERTAMBOOK_SPAN_T5FARETIVAAB = 35;
  private static int BUK_ACCERTAMBOOK_RPTBOX_RIACCERTAMEN = 36;
  private static int BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN = 37;
  private static int BUK_ACCERTAMBOOK_RPTBOX_GESTIOAVANZO = 38;
  private static int BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN = 39;
  private static int BUK_ACCERTAMBOOK_SEC_PAGEFOOTER = 40;
  private static int BUK_ACCERTAMBOOK_SEC_REPORTFOOTER = 41;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM4(IMDB);
    //
    //
    Init_PQRY_T70(IMDB);
    Init_PQRY_T78(IMDB);
    Init_PQRY_T55(IMDB);
    Init_PQRY_T56(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM4, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM4, "TBL_PARAM4");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM4,IMDBDef1.FLD_PARAM4_ROWNAMECAMPO, "ROWNAMECAMPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM4,IMDBDef1.FLD_PARAM4_ROWNAMECAMPO,1,49,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM4, 0);
  }

  private static void Init_PQRY_T70(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T70, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_T70, "PQRY_T70");
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_MOTIVO, "MOTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_MOTIVO,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_RIACCERTAMENTO, "RIACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_RIACCERTAMENTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_GESTIONE_AVANZO, "GESTIONE_AVANZO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_GESTIONE_AVANZO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T70,IMDBDef8.PQSL_T70_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T70, 0);
  }

  private static void Init_PQRY_T78(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T78, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_T78, "PQRY_T78");
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_MOTIVO, "MOTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_MOTIVO,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_VAR_AUTO, "VAR_AUTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_VAR_AUTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_RIACCERTAMENTO, "RIACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_RIACCERTAMENTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_GESTIONE_AVANZO, "GESTIONE_AVANZO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_GESTIONE_AVANZO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T78,IMDBDef8.PQSL_T78_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T78, 0);
  }

  private static void Init_PQRY_T55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T55, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_T55, "PQRY_T55");
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_MOTIVO, "MOTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_MOTIVO,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_RIACCERTAMENTO, "RIACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_RIACCERTAMENTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_T55DESCRMOTI, "T55DESCRMOTI");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_T55DESCRMOTI,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_T55GESTIAVAN, "T55GESTIAVAN");
    IMDB.SetFldParams(IMDBDef8.PQRY_T55,IMDBDef8.PQSL_T55_T55GESTIAVAN,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T55, 0);
  }

  private static void Init_PQRY_T56(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T56, 8);
    IMDB.set_TblCode(IMDBDef8.PQRY_T56, "PQRY_T56");
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_MOTIVO, "MOTIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_MOTIVO,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_VAR_AUTO, "VAR_AUTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_VAR_AUTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_RIACCERTAMENTO, "RIACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_RIACCERTAMENTO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_T56DESCRMOTI, "T56DESCRMOTI");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_T56DESCRMOTI,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_T56GESTIAVAN, "T56GESTIAVAN");
    IMDB.SetFldParams(IMDBDef8.PQRY_T56,IMDBDef8.PQSL_T56_T56GESTIAVAN,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T56, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiVariazione()
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
    FormIdx = MyGlb.FRM_TIPIVARIAZIO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "20C59345-2F50-48B5-A1D7-B731BEB91DDA";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 362;
    set_Caption(new IDVariant("Tipi Variazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 336;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "D01599F1-0B08-4CF1-B856-0758C65B6921";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Impegno";
    Frames[2].Parent = this;
    PAN_IMPEGNO = new IDPanel(w, this, 2, "PAN_IMPEGNO");
    Frames[2].Content = PAN_IMPEGNO;
    PAN_IMPEGNO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGNO.VS = MainFrm.VisualStyleList;
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_IMPEGNOBOOK != null)
      PAN_IMPEGNO.SetBook(BUK_IMPEGNOBOOK);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9769AE0D-41EA-4846-8893-AF56877777EA");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 752, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGNO.InitStatus = 2;
    PAN_IMPEGNO_Init();
    PAN_IMPEGNO_InitFields();
    PAN_IMPEGNO_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Impegno", "Tipo di variazioni agli impegni");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Accertamento";
    Frames[3].Parent = this;
    PAN_ACCERTAMENTO = new IDPanel(w, this, 3, "PAN_ACCERTAMENTO");
    Frames[3].Content = PAN_ACCERTAMENTO;
    PAN_ACCERTAMENTO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCERTAMENTO.VS = MainFrm.VisualStyleList;
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_ACCERTAMBOOK != null)
      PAN_ACCERTAMENTO.SetBook(BUK_ACCERTAMBOOK);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7A0A5D6E-B3A7-494A-A0FC-3B3D135A74F8");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCERTAMENTO.InitStatus = 2;
    PAN_ACCERTAMENTO_Init();
    PAN_ACCERTAMENTO_InitFields();
    PAN_ACCERTAMENTO_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Accertamento", "Tipi variazioni accertamenti");
    BKW_IMPEGNOBOOK = new OBook(this);
    BUK_IMPEGNOBOOK = new CIDREObj(BKW_IMPEGNOBOOK);
    BKW_IMPEGNOBOOK.iGuid = "68FBD8AA-10A0-432C-AACB-7AA54AC7000B";
    BKW_IMPEGNOBOOK.Code = "BUK_IMPEGNOBOOK";
    BKW_IMPEGNOBOOK.BookObj = BUK_IMPEGNOBOOK;
    BKW_IMPEGNOBOOK.InitDefMasks();
    BUK_IMPEGNOBOOK.InitBook(1, 1245185, "Impegno Book", IMDB, MainFrm.VisualStyleList);
    BUK_IMPEGNOBOOK.InitHTML();
    BUK_IMPEGNOBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_IMPEGNOBOOK.Book.SetMainFrm(MainFrm);
    BUK_IMPEGNOBOOK.SetRTCGuid(0, "68FBD8AA-10A0-432C-AACB-7AA54AC7000B");
    BUK_IMPEGNOBOOK.SetObjCode(0, "IMPEGNOBOOK");
    if (PAN_IMPEGNO != null)
      PAN_IMPEGNO.SetBook(BUK_IMPEGNOBOOK);
    BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE_Init();
    BUK_IMPEGNOBOOK_RPT_NEWREPORT_Init();
    BUK_IMPEGNOBOOK_InitLinks();
    BKW_ACCERTAMBOOK = new OBook(this);
    BUK_ACCERTAMBOOK = new CIDREObj(BKW_ACCERTAMBOOK);
    BKW_ACCERTAMBOOK.iGuid = "6A4720E4-3160-4ED2-BAEC-B3038E485624";
    BKW_ACCERTAMBOOK.Code = "BUK_ACCERTAMBOOK";
    BKW_ACCERTAMBOOK.BookObj = BUK_ACCERTAMBOOK;
    BKW_ACCERTAMBOOK.InitDefMasks();
    BUK_ACCERTAMBOOK.InitBook(1, 1245185, "Accertamento Book", IMDB, MainFrm.VisualStyleList);
    BUK_ACCERTAMBOOK.InitHTML();
    BUK_ACCERTAMBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ACCERTAMBOOK.Book.SetMainFrm(MainFrm);
    BUK_ACCERTAMBOOK.SetRTCGuid(0, "6A4720E4-3160-4ED2-BAEC-B3038E485624");
    BUK_ACCERTAMBOOK.SetObjCode(0, "ACCERTAMBOOK");
    if (PAN_ACCERTAMENTO != null)
      PAN_ACCERTAMENTO.SetBook(BUK_ACCERTAMBOOK);
    BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE_Init();
    BUK_ACCERTAMBOOK_RPT_NEWREPORT_Init();
    BUK_ACCERTAMBOOK_InitLinks();
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
      PAN_IMPEGNO.UpdatePanel(MainFrm);
      PAN_ACCERTAMENTO.UpdatePanel(MainFrm);
      // BUK_IMPEGNOBOOK.UpdateBook();
      // BUK_ACCERTAMBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_IMPEGNO.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPEGNO_FATTORRESID1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_ACCERTAMENTO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCERTAMENTO_FATTORRESIDU) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_IMPEGNOBOOK")) return BUK_IMPEGNOBOOK;
    if (Code.equals("BUK_ACCERTAMBOOK")) return BUK_ACCERTAMBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiVariazione.class.getName() : (Glb.ClassWithPackage(TipiVariazione.class) ? TipiVariazione.class.getName().substring(TipiVariazione.class.getPackage().getName().length() + 1) : TipiVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef1.TBL_PARAM4, IMDBDef1.FLD_PARAM4_ROWNAMECAMPO, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
        }
        if (IMDB.Value(IMDBDef1.TBL_PARAM4, IMDBDef1.FLD_PARAM4_ROWNAMECAMPO, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "EndModalEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGNO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPEGNO);
      // 
      // Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_IMPEGNO.IsNewRow()))
      {
        PAN_IMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_IMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_IMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGNO_DESCRIZIONE2,IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPEGNO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno On Updating Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0, IDL.Upper(IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0)));
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IMPEGNO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T55PD(IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno On Database Error Event
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
  private void PAN_IMPEGNO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPEGNO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Impegno On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_IMPEGNO_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_IMPEGNO.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno Fattore Residui Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_IMPEGNO_FATTORRESID1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno Fattore Residui Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0))) && IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0).compareTo((new IDVariant("")), true)!=0)
      {
        if (MainFrm.FattorePresente(IDL.Upper(IMDB.Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0)), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef8.PQRY_T70, IMDBDef8.PQSL_T70_FATTORE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "ImpegnoFattoreResiduiValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Fattori
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattori Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM4, IMDBDef1.FLD_PARAM4_ROWNAMECAMPO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "SelezioneFattori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattori 1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattori1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattori 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM4, IMDBDef1.FLD_PARAM4_ROWNAMECAMPO, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "SelezioneFattori1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Accertamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCERTAMENTO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCERTAMENTO);
      // 
      // Accertamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_ACCERTAMENTO.IsNewRow()))
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ACCERTAMENTO.SetFlags (Glb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ACCERTAMENTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCERTAMENTO_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ACCERTAMENTO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamento On Updating Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0, IDL.Upper(IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0)));
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento On Database Error Event
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
  private void PAN_ACCERTAMENTO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ACCERTAMENTO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Accertamento On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ACCERTAMENTO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamento On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T56PD(IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_ACCERTAMENTO_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamento After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_ACCERTAMENTO.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamento Fattore Residui Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ACCERTAMENTO_FATTORRESIDU_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamento Fattore Residui Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0))) && IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0).compareTo((new IDVariant("")), true)!=0)
      {
        if (MainFrm.FattorePresente(IDL.Upper(IMDB.Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0)), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef8.PQRY_T78, IMDBDef8.PQSL_T78_FATTORE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione", "AccertamentoFattoreResiduiValidateEvent", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGNO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGNO, Cancel);
    // Stub
  }

  private void PAN_IMPEGNO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPEGNO_FATTORRESID1)
    {
      this.IdxPanelActived = this.PAN_IMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattori();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPEGNO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMPEGNO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_IMPEGNO_FATTORRESID1)
      {
        PFL_IMPEGNO_FATTORRESID1_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGNO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPEGNO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCERTAMENTO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCERTAMENTO, Cancel);
    // Stub
  }

  private void PAN_ACCERTAMENTO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCERTAMENTO_FATTORRESIDU)
    {
      this.IdxPanelActived = this.PAN_ACCERTAMENTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattori1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCERTAMENTO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ACCERTAMENTO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ACCERTAMENTO_FATTORRESIDU)
      {
        PFL_ACCERTAMENTO_FATTORRESIDU_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ACCERTAMENTO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCERTAMENTO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_IMPEGNOBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_IMPEGNOBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_IMPEGNOBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_IMPEGNOBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_IMPEGNOBOOK_SEC_DETAIL)
    {
      BUK_IMPEGNOBOOK.set_SpanValue(BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, new IDVariant(IDL.NullValue(BUK_IMPEGNOBOOK.GetReportColumn(BUK_IMPEGNOBOOK_RPT_NEWREPORT, "RIACCERTAMENTO"),(new IDVariant("NO")))));
      BUK_IMPEGNOBOOK.set_SpanValue(BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, new IDVariant(IDL.NullValue(BUK_IMPEGNOBOOK.GetReportColumn(BUK_IMPEGNOBOOK_RPT_NEWREPORT, "T55GESTIAVAN"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_IMPEGNOBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_IMPEGNOBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_IMPEGNOBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_IMPEGNOBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE)
    {
      BUK_IMPEGNOBOOK.set_SpanValue(BUK_IMPEGNOBOOK_SPAN_NUMEROPAGIN2, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_IMPEGNOBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_IMPEGNOBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_IMPEGNOBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_IMPEGNOBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_IMPEGNOBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_IMPEGNOBOOK_OnPreview()
  {
    PreviewBook = BKW_IMPEGNOBOOK;
    SetRD();
  }

  private void BUK_ACCERTAMBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ACCERTAMBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ACCERTAMBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ACCERTAMBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_ACCERTAMBOOK_SEC_DETAIL)
    {
      BUK_ACCERTAMBOOK.set_SpanValue(BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, new IDVariant(IDL.NullValue(BUK_ACCERTAMBOOK.GetReportColumn(BUK_ACCERTAMBOOK_RPT_NEWREPORT, "VAR_AUTO"),(new IDVariant("NO")))));
      BUK_ACCERTAMBOOK.set_SpanValue(BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, new IDVariant(IDL.NullValue(BUK_ACCERTAMBOOK.GetReportColumn(BUK_ACCERTAMBOOK_RPT_NEWREPORT, "RIACCERTAMENTO"),(new IDVariant("NO")))));
      BUK_ACCERTAMBOOK.set_SpanValue(BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, new IDVariant(IDL.NullValue(BUK_ACCERTAMBOOK.GetReportColumn(BUK_ACCERTAMBOOK_RPT_NEWREPORT, "T56GESTIAVAN"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_ACCERTAMBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ACCERTAMBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ACCERTAMBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ACCERTAMBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE)
    {
      BUK_ACCERTAMBOOK.set_SpanValue(BUK_ACCERTAMBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ACCERTAMBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ACCERTAMBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ACCERTAMBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ACCERTAMBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ACCERTAMBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ACCERTAMBOOK_OnPreview()
  {
    PreviewBook = BKW_ACCERTAMBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPEGNO_Init()
  {

    PAN_IMPEGNO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGNO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEGNO.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, "86218996-C382-4646-864B-C830F71BC11B");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, "Codice");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, "C4235D95-4FF0-4B3C-AF12-63C06A693E53");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, "Descrizione");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, "1F8AED4E-4001-43FB-A1D3-2F14E5363E85");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, "Motivo");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, "DD590749-6367-4025-8F91-D5756F694C63");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, "Fattore Residui");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, "CB578727-C8F5-4CA4-91DD-9434E30C5DDC");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, "Riaccertamenti");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, "4CB1AA5B-0F40-4E07-B519-3A3B7960FCAD");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, "Avanzo");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, "834C43DF-6E12-483C-A08C-9386491A8981");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, "UTENTE INSERIMENTO");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, "42722C59-6B67-4C5A-97F9-C67534D56762");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, "DATA INSERIMENTO");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, "2D7D0531-375A-4C1F-BC6D-7D4B850B8706");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, "UTENTE ULTIMO AGG");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, "372C08DD-DF1E-4C4F-AAAD-32886120D9EE");
    PAN_IMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, "DATA ULTIMO AGG");
    PAN_IMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, "");
    PAN_IMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPEGNO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_LIST, "Codice");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_CODICE2, MyGlb.PANEL_FORM, "Codice");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_CODICE2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_CODICE2, PPQRY_T70, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_LIST, 56, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 28, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_DESCRIZIONE2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_DESCRIZIONE2, PPQRY_T70, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_LIST, 336, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_LIST, "Motivo");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_MOTIVO1, MyGlb.PANEL_FORM, "Motivo");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_MOTIVO1, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_MOTIVO1, PPQRY_T70, "A.MOTIVO", "MOTIVO", 5, 3, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_LIST, 520, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_LIST, 56);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_LIST, "Fattore Residui");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_FATTORRESID1, MyGlb.PANEL_FORM, "Fattore Residui");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_FATTORRESID1, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_FATTORRESID1, PPQRY_T70, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_LIST, 604, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_LIST, 104);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_LIST, "Riaccertamenti");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_RIACCERTAME1, MyGlb.PANEL_FORM, "Riaccertamenti");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_RIACCERTAME1, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_RIACCERTAME1, PPQRY_T70, "A.RIACCERTAMENTO", "RIACCERTAMENTO", 5, 2, 0, -13997);
    PAN_IMPEGNO.SetValueListItem(PFL_IMPEGNO_RIACCERTAME1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_IMPEGNO.SetValueListItem(PFL_IMPEGNO_RIACCERTAME1, (new IDVariant()), "Null", "", "", -1);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_LIST, 700, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_LIST, "Avanzo");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_FORM, 4, 124, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_GESTIOAVANZ1, MyGlb.PANEL_FORM, "Avanzo");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_GESTIOAVANZ1, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_GESTIOAVANZ1, PPQRY_T70, "A.GESTIONE_AVANZO", "GESTIONE_AVANZO", 5, 2, 0, -13997);
    PAN_IMPEGNO.SetValueListItem(PFL_IMPEGNO_GESTIOAVANZ1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_IMPEGNO.SetValueListItem(PFL_IMPEGNO_GESTIOAVANZ1, (new IDVariant()), "Null", "", "", -1);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_LIST, 592, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_LIST, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTEINSER2, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_UTENTEINSER2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_UTENTEINSER2, PPQRY_T70, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_LIST, 712, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAINSERIM2, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_DATAINSERIM2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_DATAINSERIM2, PPQRY_T70, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_LIST, 820, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_FORM, 4, 172, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_UTENTULTIAG2, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_UTENTULTIAG2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_UTENTULTIAG2, PPQRY_T70, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_LIST, 932, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_LIST, 100);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_IMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_FORM, 100);
    PAN_IMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNO_DATAULTIMAG2, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_IMPEGNO.SetFieldPage(PFL_IMPEGNO_DATAULTIMAG2, -1, -1);
    PAN_IMPEGNO.SetFieldPanel(PFL_IMPEGNO_DATAULTIMAG2, PPQRY_T70, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_IMPEGNO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGNO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMOTICODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIMOTIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE A ");
    SQL.append("where (A.CODICE = ~~MOTIVO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_IMPEGNO.SetQuery(PPQRY_TIPIMOTIVAZ1, 0, SQL, PFL_IMPEGNO_MOTIVO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMOTICODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIMOTIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_IMPEGNO.SetQuery(PPQRY_TIPIMOTIVAZ1, 1, SQL, PFL_IMPEGNO_MOTIVO1, "");
    PAN_IMPEGNO.SetQueryDB(PPQRY_TIPIMOTIVAZ1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNO.SetIMDB(IMDB, "PQRY_T70", true);
    PAN_IMPEGNO.set_SetString(MyGlb.MASTER_ROWNAME, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.MOTIVO as MOTIVO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.RIACCERTAMENTO as RIACCERTAMENTO, ");
    SQL.append("  A.GESTIONE_AVANZO as GESTIONE_AVANZO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T55 A ");
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_IMPEGNO.SetQuery(PPQRY_T70, 5, SQL, -1, "");
    PAN_IMPEGNO.SetQueryDB(PPQRY_T70, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNO.SetMasterTable(0, "T55");
    PAN_IMPEGNO.AddToSortList(PFL_IMPEGNO_CODICE2, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGNO.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGNO.iUseListQBE;
      PAN_IMPEGNO.iUseListQBE = 0;
      PAN_IMPEGNO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGNO.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGNO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ACCERTAMENTO_Init()
  {

    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, "39A81351-AA4C-4BA7-B4A0-E92DD8029E45");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, "Codice");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, "E3078CF6-C613-4F5A-8C63-EFEC79401387");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, "Descrizione");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, "E602C221-60F1-4531-84EA-CCC58BE31945");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, "Motivo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, "7F80E23A-5DCE-4DF0-B831-5570EC960A2A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, "Variazione Automatica");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, "961AAE6B-F8A7-4DB3-9C80-4CBE1A1F5106");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, "Fattore Residui");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, "1C5DC16D-CB01-407A-98F9-99BF1EAE0DF2");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, "Riaccertamenti");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, "5EA4F082-340A-4BE3-B6DE-E27D8E43854A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, "Avanzo");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, "A484F708-B5EB-4535-8B99-55D1FDEA4F9B");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, "A6FCD008-2A7B-4F6E-B7DA-271D626AFC9F");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, "780ED4C1-9D48-4FF8-A9F5-A2D60E82A982");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERTAMENTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, "781F5465-0B24-4ADC-848E-8673D4914D3A");
    PAN_ACCERTAMENTO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ACCERTAMENTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, "");
    PAN_ACCERTAMENTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCERTAMENTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCERTAMENTO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_CODICE, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_CODICE, PPQRY_T78, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DESCRIZIONE, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DESCRIZIONE, PPQRY_T78, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_LIST, 288, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_LIST, 48);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_LIST, "Motivo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_MOTIVO, MyGlb.PANEL_FORM, "Motivo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_MOTIVO, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_MOTIVO, PPQRY_T78, "A.MOTIVO", "MOTIVO", 5, 3, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_LIST, 448, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_LIST, 60);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_LIST, "Variazione Automatica");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_VARIAZAUTOMA, MyGlb.PANEL_FORM, "Variaz. Automatica");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_VARIAZAUTOMA, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_VARIAZAUTOMA, PPQRY_T78, "A.VAR_AUTO", "VAR_AUTO", 5, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_VARIAZAUTOMA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_VARIAZAUTOMA, (new IDVariant()), "Null", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_LIST, 524, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_LIST, 56);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_LIST, "Fattore Residui");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_FATTORRESIDU, MyGlb.PANEL_FORM, "Fattore Residui");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_FATTORRESIDU, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_FATTORRESIDU, PPQRY_T78, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_LIST, 608, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_LIST, 104);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_LIST, "Riaccertamenti");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_RIACCERTAMEN, MyGlb.PANEL_FORM, "Riaccertamenti");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_RIACCERTAMEN, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_RIACCERTAMEN, PPQRY_T78, "A.RIACCERTAMENTO", "RIACCERTAMENTO", 5, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_RIACCERTAMEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_RIACCERTAMEN, (new IDVariant()), "Null", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_LIST, 704, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_LIST, "Avanzo");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_FORM, 4, 148, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_FORM, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_GESTIOAVANZO, MyGlb.PANEL_FORM, "Avanzo");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_GESTIOAVANZO, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_GESTIOAVANZO, PPQRY_T78, "A.GESTIONE_AVANZO", "GESTIONE_AVANZO", 5, 2, 0, -13997);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_GESTIOAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ACCERTAMENTO.SetValueListItem(PFL_ACCERTAMENTO_GESTIOAVANZO, (new IDVariant()), "Null", "", "", -1);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_LIST, 612, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_UTENTEINSERI, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_UTENTEINSERI, PPQRY_T78, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_LIST, 732, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATAINSERIME, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATAINSERIME, PPQRY_T78, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_LIST, 840, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_UTENTULTIAGG, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_UTENTULTIAGG, PPQRY_T78, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_LIST, 952, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ACCERTAMENTO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERTAMENTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ACCERTAMENTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ACCERTAMENTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERTAMENTO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ACCERTAMENTO.SetFieldPage(PFL_ACCERTAMENTO_DATAULTIMAGG, -1, -1);
    PAN_ACCERTAMENTO.SetFieldPanel(PFL_ACCERTAMENTO_DATAULTIMAGG, PPQRY_T78, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_ACCERTAMENTO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCERTAMENTO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMOTICODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIMOTIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE A ");
    SQL.append("where (A.CODICE = ~~MOTIVO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_TIPIMOTIVAZI, 0, SQL, PFL_ACCERTAMENTO_MOTIVO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIMOTICODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIMOTIDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_TIPIMOTIVAZI, 1, SQL, PFL_ACCERTAMENTO_MOTIVO, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_TIPIMOTIVAZI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetIMDB(IMDB, "PQRY_T78", true);
    PAN_ACCERTAMENTO.set_SetString(MyGlb.MASTER_ROWNAME, "T56");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.MOTIVO as MOTIVO, ");
    SQL.append("  A.VAR_AUTO as VAR_AUTO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.RIACCERTAMENTO as RIACCERTAMENTO, ");
    SQL.append("  A.GESTIONE_AVANZO as GESTIONE_AVANZO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T56 A ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERTAMENTO.SetQuery(PPQRY_T78, 5, SQL, -1, "");
    PAN_ACCERTAMENTO.SetQueryDB(PPQRY_T78, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERTAMENTO.SetMasterTable(0, "T56");
    PAN_ACCERTAMENTO.AddToSortList(PFL_ACCERTAMENTO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCERTAMENTO.Status() == 2)
    {
      int oldListQBE = PAN_ACCERTAMENTO.iUseListQBE;
      PAN_ACCERTAMENTO.iUseListQBE = 0;
      PAN_ACCERTAMENTO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCERTAMENTO.PanelCommand(Glb.PCM_FIND);
      PAN_ACCERTAMENTO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE_Init()
  {
    BUK_IMPEGNOBOOK.InitMastro(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, "C3CB5D59-EA6A-44AB-BB52-2E86BEAC9098");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, "IMPEBOOKPAGE");
    BUK_IMPEGNOBOOK.InitMastroBox(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, BUK_IMPEGNOBOOK_RPTBOX_NUMEROPAGIN2, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_NUMEROPAGIN2, "A3067313-9C7D-4F9D-9332-C2DD8673E7F9");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_NUMEROPAGIN2, "NUMEROPAGIN2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_NUMEROPAGIN2, BUK_IMPEGNOBOOK_SPAN_NUMEROPAGIN2, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_NUMEROPAGIN2, "47216F7B-8550-49FB-B169-8EF2079A9909");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_NUMEROPAGIN2, "NUMEROPAGIN2");
    BUK_IMPEGNOBOOK.InitMastroBox(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3, 1000, 3000, 19000, 25100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3, "37AE79C8-2B00-4980-95AB-AA56501AB4F2");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3, "PAGEBODY3");
    BUK_IMPEGNOBOOK.InitMastroBox(BUK_IMPEGNOBOOK_MST_IMPEBOOKPAGE, BUK_IMPEGNOBOOK_RPTBOX_TITOLO3, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_TITOLO3, "570BBF2A-77B6-4E63-B9C0-70127CB7FBB9");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_TITOLO3, "TITOLO3");
  }

  private void BUK_IMPEGNOBOOK_RPT_NEWREPORT_InitQuery() { BUK_IMPEGNOBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_IMPEGNOBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.MOTIVO as MOTIVO, ");
      SQL.append("  A.FATTORE as FATTORE, ");
      SQL.append("  A.RIACCERTAMENTO as RIACCERTAMENTO, ");
      SQL.append("  B.DESCRIZIONE as T55DESCRMOTI, ");
      SQL.append("  A.GESTIONE_AVANZO as T55GESTIAVAN ");
      SQL.append("from ");
      SQL.append("  T55 A, ");
      SQL.append("  TIPI_MOTIVAZIONE B ");
      SQL.append("where (B.CODICE(+) = A.MOTIVO) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_IMPEGNOBOOK.SetReportQuery(BUK_IMPEGNOBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "8714CDD3-1655-45A3-83FB-BB8BF0384CBD");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_IMPEGNOBOOK_RPT_NEWREPORT_Init()
  {
    BUK_IMPEGNOBOOK.InitReport(BUK_IMPEGNOBOOK_RPT_NEWREPORT, 196609);
    BUK_IMPEGNOBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPT_NEWREPORT, "2D23CF01-3340-41FE-B23A-ED7E636F9BAA");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_IMPEGNOBOOK.InitSection(BUK_IMPEGNOBOOK_RPT_NEWREPORT, BUK_IMPEGNOBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEGNOBOOK.SetSectionRendersInto(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, "845BD761-256F-4DF0-B971-DB71BED574CF");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_CODICEHEADE2, 0, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_CODICEHEADE2, "D686EBBF-5DE5-47E6-985E-107857A227DA");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_CODICEHEADE2, "CODICEHEADE2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_CODICEHEADE2, BUK_IMPEGNOBOOK_SPAN_CODICE2, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_CODICE2, "8BE91A0F-9C24-4B0E-8FA2-FE9F6FC91DE6");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_CODICE2, "CODICE2");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_DESCRIHEADE2, 1900, 0, 7255, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_DESCRIHEADE2, "CF1A55C9-061B-461F-A53D-F48DF3501810");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_DESCRIHEADE2, "DESCRIHEADE2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_DESCRIHEADE2, BUK_IMPEGNOBOOK_SPAN_DESCRIZIONE2, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_DESCRIZIONE2, "090458A5-A160-44D0-AF59-654B49940F3E");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_TIPMOTDESHE1, 9300, 0, 2346, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_TIPMOTDESHE1, "8F216C9A-BA41-4F25-BE27-E0EEB4322E11");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_TIPMOTDESHE1, "TIPMOTDESHE1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_TIPMOTDESHE1, BUK_IMPEGNOBOOK_SPAN_MOTIVO1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Motivo", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_MOTIVO1, "D567943D-3535-476C-848B-DBE4F5F7B0B7");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_MOTIVO1, "MOTIVO1");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_FATTORHEADE1, 11900, 0, 2322, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_FATTORHEADE1, "E08C58C0-060F-49A1-A7A5-1040AB9760C9");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_FATTORHEADE1, "FATTORHEADE1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_FATTORHEADE1, BUK_IMPEGNOBOOK_SPAN_FATTORRESID1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Fattore Residui", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_FATTORRESID1, "34551056-287E-4895-AAEA-17D844CAFF02");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_FATTORRESID1, "FATTORRESID1");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_RIACCEHEADE1, 15100, 0, 2300, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_RIACCEHEADE1, "2D9BEA7A-644F-4DF4-AFBA-7534AE46628B");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_RIACCEHEADE1, "RIACCEHEADE1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_RIACCEHEADE1, BUK_IMPEGNOBOOK_SPAN_RIACCERTAME1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Riaccertamenti", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_RIACCERTAME1, "30081BC6-97DC-4992-BB6F-4B71DD576C7C");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_RIACCERTAME1, "RIACCERTAME1");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_PAGEHEADER, BUK_IMPEGNOBOOK_RPTBOX_GESTAVANHEA1, 17700, 0, 1100, 400, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_GESTAVANHEA1, "B706FD5E-9B91-4615-BA99-F5F2556F50C7");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_GESTAVANHEA1, "GESTAVANHEA1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_GESTAVANHEA1, BUK_IMPEGNOBOOK_SPAN_GESTIOAVANZ1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Avanzo", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_GESTIOAVANZ1, "CCDF407F-4725-48F1-8D34-AD032DC383A0");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_GESTIOAVANZ1, "GESTIOAVANZ1");
    BUK_IMPEGNOBOOK.InitSection(BUK_IMPEGNOBOOK_RPT_NEWREPORT, BUK_IMPEGNOBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEGNOBOOK.SetSectionRendersInto(BUK_IMPEGNOBOOK_SEC_TITOLO, BUK_IMPEGNOBOOK_RPTBOX_TITOLO3);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SEC_TITOLO, "BDFA4D9F-69FF-4075-9B59-2C75FCC8EDC0");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SEC_TITOLO, "TITOLO");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_TITOLO, BUK_IMPEGNOBOOK_RPTBOX_NEWBOX2, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_NEWBOX2, "EF3AFBAD-DBF7-4D3F-9465-5C0DE9B38047");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_NEWBOX2, BUK_IMPEGNOBOOK_SPAN_VARIADIBILA2, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Variazioni di Impegno", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_VARIADIBILA2, "C5A21A5B-F375-47DF-BC95-12036B1E9825");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_VARIADIBILA2, "VARIADIBILA2");
    BUK_IMPEGNOBOOK.InitSection(BUK_IMPEGNOBOOK_RPT_NEWREPORT, BUK_IMPEGNOBOOK_SEC_DETAIL, 1000, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEGNOBOOK.SetSectionRendersInto(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SEC_DETAIL, "5C93BB02-0667-4171-BE52-9D4304100A3B");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SEC_DETAIL, "DETAIL");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_CODICE2, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_CODICE2, "AB485A45-E946-46D3-A1EB-690535553A15");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_CODICE2, "CODICE2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_CODICE2, BUK_IMPEGNOBOOK_SPAN_T5COTIVAIMBO, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_T5COTIVAIMBO, "38BEF669-2DCB-4D38-9862-06E2A7FC9C11");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_T5COTIVAIMBO, "T5COTIVAIMBO");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_DESCRIZIONE2, 1900, 0, 7255, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_DESCRIZIONE2, "EACD9C10-A0A3-4287-8541-5C2EFA34C6F3");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_DESCRIZIONE2, BUK_IMPEGNOBOOK_SPAN_T5DETIVAIMBO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_T5DETIVAIMBO, "52348698-D2AA-41B1-BC4B-0E9809AA52AE");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_T5DETIVAIMBO, "T5DETIVAIMBO");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_TIPIMOTIDES1, 9300, 0, 2356, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_TIPIMOTIDES1, "4395032E-56DB-45DC-A84C-614FE8D5F1DB");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_TIPIMOTIDES1, "TIPIMOTIDES1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_TIPIMOTIDES1, BUK_IMPEGNOBOOK_SPAN_T5DEMOTIVAIB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::T55DESCRMOTI", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_T5DEMOTIVAIB, "319D499D-4F6C-4D9F-80E0-AE3EDB9F4CCE");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_T5DEMOTIVAIB, "T5DEMOTIVAIB");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_FATTORE1, 11900, 0, 2322, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_FATTORE1, "AD9900A0-4616-49E5-A921-989EBA05215C");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_FATTORE1, "FATTORE1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_FATTORE1, BUK_IMPEGNOBOOK_SPAN_T5FARETIVAIB, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Brief description of field content.", "::FATTORE", 1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_T5FARETIVAIB, "7CBD5C43-82EB-445F-B0AE-84B452300B29");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_T5FARETIVAIB, "T5FARETIVAIB");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_RIACCERTAME1, 16000, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_RIACCERTAME1, "07DED479-B312-4104-9C17-4F692DDC7F78");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_RIACCERTAME1, "RIACCERTAME1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_RIACCERTAME1, BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_IMPEGNOBOOK.SetSpanValueListItem(BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_IMPEGNOBOOK.SetSpanValueListItem(BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, "58C4AF0D-B734-4DDD-940F-169DD5891998");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_NUVAT5RTVIBN, "NUVAT5RTVIBN");
    BUK_IMPEGNOBOOK.InitReportBox(BUK_IMPEGNOBOOK_SEC_DETAIL, BUK_IMPEGNOBOOK_RPTBOX_GESTIOAVANZ1, 18000, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_RPTBOX_GESTIOAVANZ1, "4406CF66-1395-4214-A08A-41B2BF2566C3");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_RPTBOX_GESTIOAVANZ1, "GESTIOAVANZ1");
    BUK_IMPEGNOBOOK.InitBoxSpan(BUK_IMPEGNOBOOK_RPTBOX_GESTIOAVANZ1, BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_IMPEGNOBOOK.SetSpanValueListItem(BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_IMPEGNOBOOK.SetSpanValueListItem(BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, "5302490F-427C-4501-91A0-9EACFABFC681");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SPAN_NUVATGATVIBN, "NUVATGATVIBN");
    BUK_IMPEGNOBOOK.InitSection(BUK_IMPEGNOBOOK_RPT_NEWREPORT, BUK_IMPEGNOBOOK_SEC_PAGEFOOTER, 400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_IMPEGNOBOOK.SetSectionRendersInto(BUK_IMPEGNOBOOK_SEC_PAGEFOOTER, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SEC_PAGEFOOTER, "93B49ED8-7DB0-4734-8806-F318D81FDD6D");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_IMPEGNOBOOK.InitSection(BUK_IMPEGNOBOOK_RPT_NEWREPORT, BUK_IMPEGNOBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_IMPEGNOBOOK.SetSectionRendersInto(BUK_IMPEGNOBOOK_SEC_REPORTFOOTER, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3);
    BUK_IMPEGNOBOOK.SetRTCGuid(BUK_IMPEGNOBOOK_SEC_REPORTFOOTER, "4E4AF2FC-EF14-46ED-9237-AB2E311A44C0");
    BUK_IMPEGNOBOOK.SetObjCode(BUK_IMPEGNOBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_IMPEGNOBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_IMPEGNOBOOK_InitLinks()
  {
    BUK_IMPEGNOBOOK.SetBoxNextBox(BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3, BUK_IMPEGNOBOOK_RPTBOX_PAGEBODY3);
  }

  private void BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE_Init()
  {
    BUK_ACCERTAMBOOK.InitMastro(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, "FC331861-205B-49FC-A300-FF1EA0FB507C");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, "ACCEBOOKPAGE");
    BUK_ACCERTAMBOOK.InitMastroBox(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, BUK_ACCERTAMBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_NUMEROPAGINA, "A4462C77-D59D-41CA-887A-67058653C89E");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_NUMEROPAGINA, BUK_ACCERTAMBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_NUMEROPAGINA, "E1572A67-935C-4A60-8859-B733FA3D3437");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ACCERTAMBOOK.InitMastroBox(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY, "D4404ACF-0969-4665-8D50-321544F2B653");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ACCERTAMBOOK.InitMastroBox(BUK_ACCERTAMBOOK_MST_ACCEBOOKPAGE, BUK_ACCERTAMBOOK_RPTBOX_TITOLO1, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_TITOLO1, "9EB901CA-2047-4507-99F8-D9BC42F789DE");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_TITOLO1, "TITOLO1");
  }

  private void BUK_ACCERTAMBOOK_RPT_NEWREPORT_InitQuery() { BUK_ACCERTAMBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ACCERTAMBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.MOTIVO as MOTIVO, ");
      SQL.append("  A.VAR_AUTO as VAR_AUTO, ");
      SQL.append("  A.FATTORE as FATTORE, ");
      SQL.append("  A.RIACCERTAMENTO as RIACCERTAMENTO, ");
      SQL.append("  B.DESCRIZIONE as T56DESCRMOTI, ");
      SQL.append("  A.GESTIONE_AVANZO as T56GESTIAVAN ");
      SQL.append("from ");
      SQL.append("  T56 A, ");
      SQL.append("  TIPI_MOTIVAZIONE B ");
      SQL.append("where (B.CODICE(+) = A.MOTIVO) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_ACCERTAMBOOK.SetReportQuery(BUK_ACCERTAMBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E31FCEAE-1FE7-4F53-A277-C3057249F0DA");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ACCERTAMBOOK_RPT_NEWREPORT_Init()
  {
    BUK_ACCERTAMBOOK.InitReport(BUK_ACCERTAMBOOK_RPT_NEWREPORT, 196609);
    BUK_ACCERTAMBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPT_NEWREPORT, "B5FCF40A-5AE9-4B3D-B648-E2B38AA64086");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_ACCERTAMBOOK.InitSection(BUK_ACCERTAMBOOK_RPT_NEWREPORT, BUK_ACCERTAMBOOK_SEC_PAGEHEADER, 1000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ACCERTAMBOOK.SetSectionRendersInto(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, "BEA46ACB-4AC6-4D33-8DDC-5CDC47BC6B0B");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_CODICEHEADER, 0, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_CODICEHEADER, "89B5977A-FB2F-4AED-AF17-EC074BC187A4");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_CODICEHEADER, BUK_ACCERTAMBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_CODICE, "96104FDA-0A60-439B-9D6C-1B81CFA11FFD");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_CODICE, "CODICE");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_DESCRIHEADER, 1800, 0, 7100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_DESCRIHEADER, "8A6902F7-04DB-45AA-B8CF-E279E8C684FC");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_DESCRIHEADER, BUK_ACCERTAMBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_DESCRIZIONE, "1569956C-A0B0-4547-A61A-C43D36A33D63");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_TIPMOTDESHEA, 9100, 0, 2380, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_TIPMOTDESHEA, "34D15FE3-3BF7-4912-8691-A79B866D0A0F");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_TIPMOTDESHEA, "TIPMOTDESHEA");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_TIPMOTDESHEA, BUK_ACCERTAMBOOK_SPAN_MOTIVO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Motivo", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_MOTIVO, "5273230F-28B4-456D-AF2B-B00BE19FF0E0");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_MOTIVO, "MOTIVO");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_VARAUTOHEADE, 11500, 0, 1746, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_VARAUTOHEADE, "A73FE269-75DC-414D-91BD-6A27EFEA978F");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_VARAUTOHEADE, "VARAUTOHEADE");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_VARAUTOHEADE, BUK_ACCERTAMBOOK_SPAN_VARIAZAUTOMA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Variazione Automatica", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_VARIAZAUTOMA, "795B099B-03C5-4C5E-B0A2-D8151549ADB9");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_VARIAZAUTOMA, "VARIAZAUTOMA");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_FATTORHEADER, 13300, 0, 2147, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_FATTORHEADER, "4F54D289-FCDE-485B-A286-82F5E49F6DD8");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_FATTORHEADER, "FATTORHEADER");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_FATTORHEADER, BUK_ACCERTAMBOOK_SPAN_FATTORRESIDU, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Fattore Residui", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_FATTORRESIDU, "D7155C55-22C7-45EA-8C63-3FE6AB063229");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_FATTORRESIDU, "FATTORRESIDU");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_RIACCEHEADER, 15600, 0, 2225, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_RIACCEHEADER, "7C5ED5BF-DC9E-417F-8C8E-B106D741D186");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_RIACCEHEADER, "RIACCEHEADER");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_RIACCEHEADER, BUK_ACCERTAMBOOK_SPAN_RIACCERTAMEN, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Riaccertamenti", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_RIACCERTAMEN, "7B55BAC2-9F9E-4381-8318-DA34FAEDB89F");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_RIACCERTAMEN, "RIACCERTAMEN");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_PAGEHEADER, BUK_ACCERTAMBOOK_RPTBOX_GESTAVANHEAD, 18000, 0, 1000, 400, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_GESTAVANHEAD, "F4D20167-8E59-4CE3-9597-B8B7B2B67DDB");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_GESTAVANHEAD, "GESTAVANHEAD");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_GESTAVANHEAD, BUK_ACCERTAMBOOK_SPAN_GESTIOAVANZO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Avanzo", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_GESTIOAVANZO, "7CBAFC5D-365A-4B9F-8F9F-9CFA66182F1A");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_GESTIOAVANZO, "GESTIOAVANZO");
    BUK_ACCERTAMBOOK.InitSection(BUK_ACCERTAMBOOK_RPT_NEWREPORT, BUK_ACCERTAMBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ACCERTAMBOOK.SetSectionRendersInto(BUK_ACCERTAMBOOK_SEC_TITOLO, BUK_ACCERTAMBOOK_RPTBOX_TITOLO1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SEC_TITOLO, "7078A2FF-7719-4275-9A02-2168AE99A216");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SEC_TITOLO, "TITOLO");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_TITOLO, BUK_ACCERTAMBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_NEWBOX, "01D79981-AB38-447F-A885-EC035DF7BBA8");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_NEWBOX, BUK_ACCERTAMBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Variazioni di Accertamento", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_VARIADIBILAN, "AB67BAC8-3EA8-4E31-8FEB-0C67C909271D");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_ACCERTAMBOOK.InitSection(BUK_ACCERTAMBOOK_RPT_NEWREPORT, BUK_ACCERTAMBOOK_SEC_DETAIL, 1000, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ACCERTAMBOOK.SetSectionRendersInto(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SEC_DETAIL, "A81C40E0-5BB9-4092-B1B8-E1AA369A4D15");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SEC_DETAIL, "DETAIL");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_CODICE, "F22AABD1-3968-4B70-9E23-4079E49166EE");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_CODICE, "CODICE");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_CODICE, BUK_ACCERTAMBOOK_SPAN_T5COTIVAACBO, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_T5COTIVAACBO, "4BE995A3-D945-498D-BE42-E49B8D0EC547");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_T5COTIVAACBO, "T5COTIVAACBO");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_DESCRIZIONE, 1800, 0, 7100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_DESCRIZIONE, "879059A6-BA23-48BB-A561-2E1C340448F7");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_DESCRIZIONE, BUK_ACCERTAMBOOK_SPAN_T5DETIVAACBO, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_T5DETIVAACBO, "A0496A16-F127-4877-BEA2-661C921ED272");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_T5DETIVAACBO, "T5DETIVAACBO");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_TIPIMOTIDESC, 9100, 0, 2380, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_TIPIMOTIDESC, "EA3DE37D-D77D-4DA5-BC81-E4E720CE2BF1");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_TIPIMOTIDESC, "TIPIMOTIDESC");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_TIPIMOTIDESC, BUK_ACCERTAMBOOK_SPAN_T5DEMOTIVAAB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::T56DESCRMOTI", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_T5DEMOTIVAAB, "318D3CDE-9158-467F-B128-3ED943BCEBFA");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_T5DEMOTIVAAB, "T5DEMOTIVAAB");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_VARAUTO, 12100, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_VARAUTO, "97C58A68-76EB-4537-A988-F3610E3082B0");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_VARAUTO, "VARAUTO");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_VARAUTO, BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, "821193A6-9E1F-4634-8D58-BFCA6EF288A4");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_NUVATVATVABN, "NUVATVATVABN");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_FATTORE, 13300, 0, 2147, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_FATTORE, "3E41347B-7561-4F95-BEAA-65E17176CC5A");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_FATTORE, "FATTORE");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_FATTORE, BUK_ACCERTAMBOOK_SPAN_T5FARETIVAAB, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "Brief description of field content.", "::FATTORE", 1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_T5FARETIVAAB, "C71A5ADF-CC2C-47F7-A928-8C76AACDA192");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_T5FARETIVAAB, "T5FARETIVAAB");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_RIACCERTAMEN, 16500, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_RIACCERTAMEN, "83823928-0E09-494A-AC50-B4DE6E3222D1");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_RIACCERTAMEN, "RIACCERTAMEN");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_RIACCERTAMEN, BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, "FE2AF94A-853A-4E07-A516-666202ADB169");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_NUVAT5RTVABN, "NUVAT5RTVABN");
    BUK_ACCERTAMBOOK.InitReportBox(BUK_ACCERTAMBOOK_SEC_DETAIL, BUK_ACCERTAMBOOK_RPTBOX_GESTIOAVANZO, 18300, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_RPTBOX_GESTIOAVANZO, "63CA2755-4715-4C5A-9B97-769EBC2457C1");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_RPTBOX_GESTIOAVANZO, "GESTIOAVANZO");
    BUK_ACCERTAMBOOK.InitBoxSpan(BUK_ACCERTAMBOOK_RPTBOX_GESTIOAVANZO, BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetSpanValueListItem(BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, "BFBB4B2C-5CD7-4895-8CD5-95567E13A980");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SPAN_NUVATGATVABN, "NUVATGATVABN");
    BUK_ACCERTAMBOOK.InitSection(BUK_ACCERTAMBOOK_RPT_NEWREPORT, BUK_ACCERTAMBOOK_SEC_PAGEFOOTER, 400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ACCERTAMBOOK.SetSectionRendersInto(BUK_ACCERTAMBOOK_SEC_PAGEFOOTER, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SEC_PAGEFOOTER, "F261DE4E-FE0F-451A-8014-4A1A9DB24005");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ACCERTAMBOOK.InitSection(BUK_ACCERTAMBOOK_RPT_NEWREPORT, BUK_ACCERTAMBOOK_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ACCERTAMBOOK.SetSectionRendersInto(BUK_ACCERTAMBOOK_SEC_REPORTFOOTER, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY);
    BUK_ACCERTAMBOOK.SetRTCGuid(BUK_ACCERTAMBOOK_SEC_REPORTFOOTER, "E5F6CE23-333E-4730-9FFF-8582BD09899D");
    BUK_ACCERTAMBOOK.SetObjCode(BUK_ACCERTAMBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ACCERTAMBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ACCERTAMBOOK_InitLinks()
  {
    BUK_ACCERTAMBOOK.SetBoxNextBox(BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY, BUK_ACCERTAMBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_ValidateRow(Cancel);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_DynamicProperties();
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_IMPEGNO) PAN_IMPEGNO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ACCERTAMENTO) PAN_ACCERTAMENTO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_IMPEGNOBOOK) BUK_IMPEGNOBOOK_OnPreview();
    if (SrcObj == BKW_ACCERTAMBOOK) BUK_ACCERTAMBOOK_OnPreview();
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
