// **********************************************
// Codici Certificati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciCertificati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_CODCERTABVIE;
  private static int PFL_PREVENTIVO_CODICE1 = 0;
  private static int PFL_PREVENTIVO_DESCRIZIONE1 = 1;
  private static int PFL_PREVENTIVO_CODICECERT1 = 2;
  private static int PFL_PREVENTIVO_TITOLO1 = 3;
  private static int PFL_PREVENTIVO_CATEGORIA1 = 4;
  private static int PFL_PREVENTIVO_ES = 5;
  private static int PFL_PREVENTIVO_UTENTEINSER1 = 6;
  private static int PFL_PREVENTIVO_DATAINSERIM1 = 7;
  private static int PFL_PREVENTIVO_UTENTULTIAG1 = 8;
  private static int PFL_PREVENTIVO_DATAULTIMAG1 = 9;

  private static int PPQRY_CERTBIL1 = 0;

  private static int PPQRY_TITOLI1 = 1;
  private static int PPQRY_CATEGORIE1 = 2;


  IDPanel PAN_PREVENTIVO;
  private static int PFL_CONSUNTIVO_CODICE = 0;
  private static int PFL_CONSUNTIVO_DESCRIZIONE = 1;
  private static int PFL_CONSUNTIVO_CODICECERT = 2;
  private static int PFL_CONSUNTIVO_TITOLO = 3;
  private static int PFL_CONSUNTIVO_CATEGORIA = 4;
  private static int PFL_CONSUNTIVO_E = 5;
  private static int PFL_CONSUNTIVO_UTENTEINSERI = 6;
  private static int PFL_CONSUNTIVO_DATAINSERIME = 7;
  private static int PFL_CONSUNTIVO_UTENTULTIAGG = 8;
  private static int PFL_CONSUNTIVO_DATAULTIMAGG = 9;

  private static int PPQRY_CERTCON1 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_CATEGORIE = 2;


  IDPanel PAN_CONSUNTIVO;
  CIDREObj BUK_PREVENTIBOOK;
  OBook BKW_PREVENTIBOOK;
  //
  // Template Pages constants
  private static int BUK_PREVENTIBOOK_MST_PREVBOOKPAGE = 1;
  private static int BUK_PREVENTIBOOK_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_PREVENTIBOOK_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_PREVENTIBOOK_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_PREVENTIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_PREVENTIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_PREVENTIBOOK_SEC_TITOLO = 8;
  private static int BUK_PREVENTIBOOK_RPTBOX_TITOLO3 = 9;
  private static int BUK_PREVENTIBOOK_SPAN_FUNZIOESERV1 = 10;
  private static int BUK_PREVENTIBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_PREVENTIBOOK_RPTBOX_CODICEHEADE1 = 12;
  private static int BUK_PREVENTIBOOK_SPAN_CODICE1 = 13;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE3 = 14;
  private static int BUK_PREVENTIBOOK_SPAN_DESCRIZIONE1 = 15;
  private static int BUK_PREVENTIBOOK_RPTBOX_CODICCPHEADE = 16;
  private static int BUK_PREVENTIBOOK_SPAN_CODICECERT1 = 17;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE4 = 18;
  private static int BUK_PREVENTIBOOK_SPAN_TITOLO1 = 19;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE5 = 20;
  private static int BUK_PREVENTIBOOK_SPAN_CATEGORIA1 = 21;
  private static int BUK_PREVENTIBOOK_SEC_DETAIL = 22;
  private static int BUK_PREVENTIBOOK_RPTBOX_CODICE1 = 23;
  private static int BUK_PREVENTIBOOK_SPAN_CECOCOCEPRBO = 24;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRIZIONE1 = 25;
  private static int BUK_PREVENTIBOOK_SPAN_CEDECOCEPRBO = 26;
  private static int BUK_PREVENTIBOOK_RPTBOX_CODICECP = 27;
  private static int BUK_PREVENTIBOOK_SPAN_CECOCECOCEPB = 28;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRTITOL12 = 29;
  private static int BUK_PREVENTIBOOK_SPAN_CEDETICOCEPB = 30;
  private static int BUK_PREVENTIBOOK_RPTBOX_DESCRCATE223 = 31;
  private static int BUK_PREVENTIBOOK_SPAN_CEDECACOCEPB = 32;
  private static int BUK_PREVENTIBOOK_SEC_PAGEFOOTER = 33;
  private static int BUK_PREVENTIBOOK_SEC_REPORTFOOTER = 34;

  CIDREObj BUK_CONSUNTIBOOK;
  OBook BKW_CONSUNTIBOOK;
  //
  // Template Pages constants
  private static int BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE = 1;
  private static int BUK_CONSUNTIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONSUNTIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CONSUNTIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_CONSUNTIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CONSUNTIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_CONSUNTIBOOK_SEC_TITOLO = 8;
  private static int BUK_CONSUNTIBOOK_RPTBOX_TITOLO2 = 9;
  private static int BUK_CONSUNTIBOOK_SPAN_FUNZIOESERVI = 10;
  private static int BUK_CONSUNTIBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_CONSUNTIBOOK_RPTBOX_CODICEHEADER = 12;
  private static int BUK_CONSUNTIBOOK_SPAN_CODICE = 13;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE2 = 14;
  private static int BUK_CONSUNTIBOOK_SPAN_DESCRIZIONE = 15;
  private static int BUK_CONSUNTIBOOK_RPTBOX_CODICCCHEADE = 16;
  private static int BUK_CONSUNTIBOOK_SPAN_CODICECERT = 17;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE1 = 18;
  private static int BUK_CONSUNTIBOOK_SPAN_TITOLO = 19;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADER = 20;
  private static int BUK_CONSUNTIBOOK_SPAN_CATEGORIA = 21;
  private static int BUK_CONSUNTIBOOK_SEC_DETAIL = 22;
  private static int BUK_CONSUNTIBOOK_RPTBOX_CODICE = 23;
  private static int BUK_CONSUNTIBOOK_SPAN_CECOCOCECOBO = 24;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRIZIONE = 25;
  private static int BUK_CONSUNTIBOOK_SPAN_CEDECOCECOBO = 26;
  private static int BUK_CONSUNTIBOOK_RPTBOX_CODICECC = 27;
  private static int BUK_CONSUNTIBOOK_SPAN_CECOCECOCECB = 28;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRTITOL11 = 29;
  private static int BUK_CONSUNTIBOOK_SPAN_CEDETICOCECB = 30;
  private static int BUK_CONSUNTIBOOK_RPTBOX_DESCRCATE222 = 31;
  private static int BUK_CONSUNTIBOOK_SPAN_CEDECACOCECB = 32;
  private static int BUK_CONSUNTIBOOK_SEC_PAGEFOOTER = 33;
  private static int BUK_CONSUNTIBOOK_SEC_REPORTFOOTER = 34;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CERTBIL1(IMDB);
    Init_PQRY_CERTCON1(IMDB);
    Init_PQRY_CERTBIL2(IMDB);
    Init_PQRY_CERTCON2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CERTBIL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CERTBIL1, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_CERTBIL1, "PQRY_CERTBIL1");
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CAT_INT, "CAT_INT");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CAT_INT,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CODICE_CP, "CODICE_CP");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_CODICE_CP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL1,IMDBDef8.PQSL_CERTBIL1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CERTBIL1, 0);
  }

  private static void Init_PQRY_CERTCON1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CERTCON1, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_CERTCON1, "PQRY_CERTCON1");
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_E, "E");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_E,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CODICE_CC, "CODICE_CC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_CODICE_CC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON1,IMDBDef8.PQSL_CERTCON1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CERTCON1, 0);
  }

  private static void Init_PQRY_CERTBIL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CERTBIL2, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_CERTBIL2, "PQRY_CERTBIL2");
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBICODICE, "CERTBICODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBICODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBIDESCRI, "CERTBIDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBIDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBILES, "CERTBILES");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBILES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBITITOLO, "CERTBITITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBITITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBICATEGO, "CERTBICATEGO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTBICATEGO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTCODICERT, "CERTCODICERT");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTCODICERT,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTTITOTITO, "CERTTITOTITO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTTITOTITO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTDESCTITO, "CERTDESCTITO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTDESCTITO,5,242,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTCATECATE, "CERTCATECATE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTCATECATE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTDESCCATE, "CERTDESCCATE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTBIL2,IMDBDef8.PQSL_CERTBIL2_CERTDESCCATE,5,242,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CERTBIL2, 0);
  }

  private static void Init_PQRY_CERTCON2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CERTCON2, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_CERTCON2, "PQRY_CERTCON2");
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOCODICE, "CERTCOCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOCODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCODESCRI, "CERTCODESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCODESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOTITOLO, "CERTCOTITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOCATEGO, "CERTCOCATEGO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCOCATEGO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CE, "CE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CE,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCODICERT, "CERTCODICERT");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCODICERT,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTTITOTITO, "CERTTITOTITO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTTITOTITO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTDESCTITO, "CERTDESCTITO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTDESCTITO,5,242,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCATECATE, "CERTCATECATE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTCATECATE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTDESCCATE, "CERTDESCCATE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CERTCON2,IMDBDef8.PQSL_CERTCON2_CERTDESCCATE,5,242,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CERTCON2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciCertificati(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciCertificati()
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
    FormIdx = MyGlb.FRM_CODICICERTIF;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "41F59425-22FE-4886-8318-1E4D81CB7BF4";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 836;
    DesignHeight = 458;
    set_Caption(new IDVariant("Codici Certificati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 836;
    Frames[1].Height = 432;
    Frames[1].Caption = "Cod Certificati Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 432;
    TAB_CODCERTABVIE = new OTabView(this);
    Frames[1].Content = TAB_CODCERTABVIE;
    TAB_CODCERTABVIE.iGuid = "1D346658-D538-4F65-BE5F-7C3A24D6FBC4";
    TAB_CODCERTABVIE.SetItemCount(2);
    TAB_CODCERTABVIE.Placement = 1;
    TAB_CODCERTABVIE.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Preventivo";
    Frames[2].Parent = this;
    PAN_PREVENTIVO = new IDPanel(w, this, 2, "PAN_PREVENTIVO");
    Frames[2].Content = PAN_PREVENTIVO;
    PAN_PREVENTIVO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVENTIVO.VS = MainFrm.VisualStyleList;
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 836-MyGlb.PAN_OFFS_X, 432-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_PREVENTIBOOK != null)
      PAN_PREVENTIVO.SetBook(BUK_PREVENTIBOOK);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EE0FFAA9-9467-4F3B-B2F6-A505E2775EA8");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 776, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVENTIVO.InitStatus = 2;
    PAN_PREVENTIVO_Init();
    PAN_PREVENTIVO_InitFields();
    PAN_PREVENTIVO_InitQueries();
    TAB_CODCERTABVIE.SetItem(1, Frames[2], 0, "", "Preventivo", "Codici Certificato Bilancio di Previsione");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Consuntivo";
    Frames[3].Parent = this;
    PAN_CONSUNTIVO = new IDPanel(w, this, 3, "PAN_CONSUNTIVO");
    Frames[3].Content = PAN_CONSUNTIVO;
    PAN_CONSUNTIVO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONSUNTIVO.VS = MainFrm.VisualStyleList;
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 836-MyGlb.PAN_OFFS_X, 432-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_CONSUNTIBOOK != null)
      PAN_CONSUNTIVO.SetBook(BUK_CONSUNTIBOOK);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B2D26A07-CF54-4DC1-9C15-1B62B3B7118E");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 804, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONSUNTIVO.InitStatus = 2;
    PAN_CONSUNTIVO_Init();
    PAN_CONSUNTIVO_InitFields();
    PAN_CONSUNTIVO_InitQueries();
    TAB_CODCERTABVIE.SetItem(2, Frames[3], 0, "", "Consuntivo", "");
    BKW_PREVENTIBOOK = new OBook(this);
    BUK_PREVENTIBOOK = new CIDREObj(BKW_PREVENTIBOOK);
    BKW_PREVENTIBOOK.iGuid = "30449044-E89C-4BF8-A218-7A83248A0609";
    BKW_PREVENTIBOOK.Code = "BUK_PREVENTIBOOK";
    BKW_PREVENTIBOOK.BookObj = BUK_PREVENTIBOOK;
    BKW_PREVENTIBOOK.InitDefMasks();
    BUK_PREVENTIBOOK.InitBook(1, 1245185, "Preventivo Book", IMDB, MainFrm.VisualStyleList);
    BUK_PREVENTIBOOK.InitHTML();
    BUK_PREVENTIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PREVENTIBOOK.Book.SetMainFrm(MainFrm);
    BUK_PREVENTIBOOK.SetRTCGuid(0, "30449044-E89C-4BF8-A218-7A83248A0609");
    BUK_PREVENTIBOOK.SetObjCode(0, "PREVENTIBOOK");
    if (PAN_PREVENTIVO != null)
      PAN_PREVENTIVO.SetBook(BUK_PREVENTIBOOK);
    BUK_PREVENTIBOOK_MST_PREVBOOKPAGE_Init();
    BUK_PREVENTIBOOK_RPT_NEWREPORT_Init();
    BUK_PREVENTIBOOK_InitLinks();
    BKW_CONSUNTIBOOK = new OBook(this);
    BUK_CONSUNTIBOOK = new CIDREObj(BKW_CONSUNTIBOOK);
    BKW_CONSUNTIBOOK.iGuid = "EFAC3E8A-4C91-4B3E-B2BE-88DC5B383873";
    BKW_CONSUNTIBOOK.Code = "BUK_CONSUNTIBOOK";
    BKW_CONSUNTIBOOK.BookObj = BUK_CONSUNTIBOOK;
    BKW_CONSUNTIBOOK.InitDefMasks();
    BUK_CONSUNTIBOOK.InitBook(1, 1245185, "Consuntivo Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONSUNTIBOOK.InitHTML();
    BUK_CONSUNTIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONSUNTIBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONSUNTIBOOK.SetRTCGuid(0, "EFAC3E8A-4C91-4B3E-B2BE-88DC5B383873");
    BUK_CONSUNTIBOOK.SetObjCode(0, "CONSUNTIBOOK");
    if (PAN_CONSUNTIVO != null)
      PAN_CONSUNTIVO.SetBook(BUK_CONSUNTIBOOK);
    BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE_Init();
    BUK_CONSUNTIBOOK_RPT_NEWREPORT_Init();
    BUK_CONSUNTIBOOK_InitLinks();
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
      PAN_PREVENTIVO.UpdatePanel(MainFrm);
      PAN_CONSUNTIVO.UpdatePanel(MainFrm);
      // BUK_PREVENTIBOOK.UpdateBook();
      // BUK_CONSUNTIBOOK.UpdateBook();
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
    if (Code.equals("BUK_PREVENTIBOOK")) return BUK_PREVENTIBOOK;
    if (Code.equals("BUK_CONSUNTIBOOK")) return BUK_CONSUNTIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CodiciCertificati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciCertificati.class.getName() : (Glb.ClassWithPackage(CodiciCertificati.class) ? CodiciCertificati.class.getName().substring(CodiciCertificati.class.getPackage().getName().length() + 1) : CodiciCertificati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Preventivo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVENTIVO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVENTIVO);
      // 
      // Preventivo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_PREVENTIVO.IsNewRow())
      {
        PAN_PREVENTIVO.SetFlags (Glb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVENTIVO.SetFlags (Glb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_PREVENTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_PREVENTIVO_DESCRIZIONE1,IMDB.Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_DESCRIZIONE, 0).stringValue()); 
      PAN_PREVENTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_PREVENTIVO_TITOLO1,(new IDVariant(PAN_PREVENTIVO.FieldText(PFL_PREVENTIVO_TITOLO1))).stringValue()); 
      PAN_PREVENTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_PREVENTIVO_CATEGORIA1,(new IDVariant(PAN_PREVENTIVO.FieldText(PFL_PREVENTIVO_CATEGORIA1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "PreventivoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Preventivo On Database Error Event
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
  private void PAN_PREVENTIVO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PREVENTIVO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Preventivo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "PreventivoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Preventivo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVENTIVO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preventivo On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_E_S, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CERTBIL1, IMDBDef8.PQSL_CERTBIL1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "PreventivoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Consuntivo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONSUNTIVO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONSUNTIVO);
      // 
      // Consuntivo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_CONSUNTIVO.IsNewRow())
      {
        PAN_CONSUNTIVO.SetFlags (Glb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONSUNTIVO.SetFlags (Glb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CONSUNTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_CONSUNTIVO_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_DESCRIZIONE, 0).stringValue()); 
      PAN_CONSUNTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_CONSUNTIVO_TITOLO,IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_DESCRIZIONE, 0).stringValue()); 
      PAN_CONSUNTIVO.set_ToolTip(Glb.OBJ_FIELD,PFL_CONSUNTIVO_CATEGORIA,IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "ConsuntivoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Consuntivo On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CONSUNTIVO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Consuntivo On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_TITOLO, 0)))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Titolo Obbligatorio!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_CATEGORIA, 0)))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Categoria Obbligatoria!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "ConsuntivoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Consuntivo On Database Error Event
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
  private void PAN_CONSUNTIVO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CONSUNTIVO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Consuntivo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "ConsuntivoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Consuntivo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CONSUNTIVO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Consuntivo On Updating Row Event Body
      // Procedure Body
      // 
      if (PAN_CONSUNTIVO.IsNewRow())
      {
        IMDB.set_Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_E, 0, (new IDVariant("E")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "ConsuntivoOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("CodiciCertificati", "LoadEvent", _e);
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
  private void TAB_CODCERTABVIE_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVENTIVO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVENTIVO, Cancel);
    // Stub
  }

  private void PAN_PREVENTIVO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PREVENTIVO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVENTIVO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVENTIVO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVENTIVO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONSUNTIVO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONSUNTIVO, Cancel);
    // Stub
  }

  private void PAN_CONSUNTIVO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONSUNTIVO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CONSUNTIVO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CONSUNTIVO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_E, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_CERTCON1, IMDBDef8.PQSL_CERTCON1_E, 0, (new IDVariant("E")));
      }
      if (Cancel.isFalse())
      {
        PAN_CONSUNTIVO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_PREVENTIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PREVENTIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PREVENTIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PREVENTIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_PREVENTIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PREVENTIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PREVENTIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_PREVENTIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PREVENTIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_PREVENTIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PREVENTIBOOK_MST_PREVBOOKPAGE)
    {
      BUK_PREVENTIBOOK.set_SpanValue(BUK_PREVENTIBOOK_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PREVENTIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PREVENTIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PREVENTIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PREVENTIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PREVENTIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PREVENTIBOOK_OnPreview()
  {
    PreviewBook = BKW_PREVENTIBOOK;
    SetRD();
  }

  private void BUK_CONSUNTIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONSUNTIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONSUNTIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONSUNTIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CONSUNTIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONSUNTIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CONSUNTIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONSUNTIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONSUNTIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONSUNTIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE)
    {
      BUK_CONSUNTIBOOK.set_SpanValue(BUK_CONSUNTIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONSUNTIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONSUNTIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONSUNTIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONSUNTIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONSUNTIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONSUNTIBOOK_OnPreview()
  {
    PreviewBook = BKW_CONSUNTIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVENTIVO_Init()
  {

    PAN_PREVENTIVO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVENTIVO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PREVENTIVO.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, "16926EBC-3664-4A7C-B7F6-ED666E2DF949");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, "Codice");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, "CE499F01-7DD3-4998-8FDB-5BB268AEE44B");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, "Descrizione");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, "5D84E8C1-4048-4901-A0DB-7A30F259E774");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, "Codice Cert.");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, "A4992939-FFD4-420F-BE2B-EFD22694BA29");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, "Titolo");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, "0D7886E3-885C-48F1-8AB6-CCC5DE21338B");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, "Categoria");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, "73F80304-681B-4E8B-B585-93912EC40E82");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, "E S");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, 0, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, "1004CA67-2B91-4C95-B91D-F38A38932AAB");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, "EF8AB828-7AE4-4F13-995B-88E147C11DB6");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, "39137521-6BEB-470A-970E-3539E578CFAE");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PREVENTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, "6FF0AB07-D592-434C-883A-CAE56855A30C");
    PAN_PREVENTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_PREVENTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, "");
    PAN_PREVENTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREVENTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREVENTIVO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_FORM, 88);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_CODICE1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_CODICE1, PPQRY_CERTBIL1, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_LIST, 60, 36, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_LIST, 104);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_DESCRIZIONE1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_DESCRIZIONE1, PPQRY_CERTBIL1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_LIST, 340, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_LIST, 64);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_LIST, "Codice Cert.");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_FORM, 88);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CODICECERT1, MyGlb.PANEL_FORM, "Codice Cert.");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_CODICECERT1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_CODICECERT1, PPQRY_CERTBIL1, "A.CODICE_CP", "CODICE_CP", 1, 5, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_LIST, 392, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_LIST, 48);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_FORM, 88);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_TITOLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_TITOLO1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_TITOLO1, PPQRY_CERTBIL1, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_LIST, 580, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_LIST, 48);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_LIST, "Categoria");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_FORM, 4, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_FORM, 88);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_CATEGORIA1, MyGlb.PANEL_FORM, "Categoria");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_CATEGORIA1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_CATEGORIA1, PPQRY_CERTBIL1, "A.CAT_INT", "CAT_INT", 1, 2, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_LIST, 24);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_FORM, 4, 148, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_FORM, 24);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_ES, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_ES, PPQRY_CERTBIL1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_LIST, 8, 244, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_UTENTEINSER1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_UTENTEINSER1, PPQRY_CERTBIL1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_LIST, 260, 248, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_DATAINSERIM1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_DATAINSERIM1, PPQRY_CERTBIL1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_LIST, 8, 260, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_UTENTULTIAG1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_UTENTULTIAG1, PPQRY_CERTBIL1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_LIST, 240, 260, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_PREVENTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVENTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_PREVENTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_PREVENTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVENTIVO_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_PREVENTIVO.SetFieldPage(PFL_PREVENTIVO_DATAULTIMAG1, -1, -1);
    PAN_PREVENTIVO.SetFieldPanel(PFL_PREVENTIVO_DATAULTIMAG1, PPQRY_CERTBIL1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_PREVENTIVO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVENTIVO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLIDESCRI ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_PREVENTIVO.SetQuery(PPQRY_TITOLI1, 0, SQL, PFL_PREVENTIVO_TITOLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLIDESCRI ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = 'E') ");
    PAN_PREVENTIVO.SetQuery(PPQRY_TITOLI1, 1, SQL, PFL_PREVENTIVO_TITOLO1, "");
    PAN_PREVENTIVO.SetQueryDB(PPQRY_TITOLI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGODESCRI ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.CATEGORIA = ~~CAT_INT~~) ");
    SQL.append("and   (A.TITOLO = ~~TITOLO~~) ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CATEGORIE1, 0, SQL, PFL_PREVENTIVO_CATEGORIA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGODESCRI ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CATEGORIE1, 1, SQL, PFL_PREVENTIVO_CATEGORIA1, "");
    PAN_PREVENTIVO.SetQueryDB(PPQRY_CATEGORIE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVENTIVO.SetIMDB(IMDB, "PQRY_CERTBIL1", true);
    PAN_PREVENTIVO.set_SetString(MyGlb.MASTER_ROWNAME, "CERTBIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CAT_INT as CAT_INT, ");
    SQL.append("  A.CODICE_CP as CODICE_CP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CERTBIL A ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = 'E') ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PREVENTIVO.SetQuery(PPQRY_CERTBIL1, 5, SQL, -1, "");
    PAN_PREVENTIVO.SetQueryDB(PPQRY_CERTBIL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVENTIVO.SetMasterTable(0, "CERTBIL");
    PAN_PREVENTIVO.AddToSortList(PFL_PREVENTIVO_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVENTIVO.Status() == 2)
    {
      int oldListQBE = PAN_PREVENTIVO.iUseListQBE;
      PAN_PREVENTIVO.iUseListQBE = 0;
      PAN_PREVENTIVO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVENTIVO.PanelCommand(Glb.PCM_FIND);
      PAN_PREVENTIVO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONSUNTIVO_Init()
  {

    PAN_CONSUNTIVO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONSUNTIVO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONSUNTIVO.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, "D278AFFF-8911-412A-B8FB-136426529453");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, "Codice");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, "B88BA056-6066-49FB-9C4E-CFB18D74452F");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, "Descrizione");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, "5A199E6B-872C-423C-A3EB-0E0228F5A681");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, "Codice Cert");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.VIS_NORMALFIELDS);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, "95A627FD-31A2-4C78-A224-81E79C92EF9C");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, "Titolo");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, "D89567BA-CA94-43EA-B841-7CC5E7E6285A");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, "Categoria");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, "469945F2-8748-4ACB-8534-2485FBD90A09");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, "E");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.VIS_NONNULLAFIEL);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, "DFDAD3E9-79C0-40AC-9934-3515ECFD7117");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, "718C15BF-4124-47DA-8701-FD70EBC509EF");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, "F1390137-EB2A-446D-9542-4E0EB5972AF1");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONSUNTIVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, "09E85597-6C25-452C-87CA-0A7962462515");
    PAN_CONSUNTIVO.set_Header(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CONSUNTIVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, "");
    PAN_CONSUNTIVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CONSUNTIVO.SetFlags(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONSUNTIVO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_CODICE, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_CODICE, PPQRY_CERTCON1, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_DESCRIZIONE, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_DESCRIZIONE, PPQRY_CERTCON1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_LIST, 404, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_LIST, 64);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_LIST, "Codice Cert");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_FORM, 4, 124, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_FORM, 88);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CODICECERT, MyGlb.PANEL_FORM, "Codice Cert");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_CODICECERT, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_CODICECERT, PPQRY_CERTCON1, "A.CODICE_CC", "CODICE_CC", 1, 5, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_LIST, 452, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_FORM, 88);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_TITOLO, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_TITOLO, PPQRY_CERTCON1, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_LIST, 628, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_FORM, 88);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_CATEGORIA, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_CATEGORIA, PPQRY_CERTCON1, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_LIST, 16);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_LIST, "E");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_FORM, 4, 148, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_FORM, 16);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_E, MyGlb.PANEL_FORM, "E");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_E, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_E, PPQRY_CERTCON1, "A.E", "E", 5, 1, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_LIST, 8, 244, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_UTENTEINSERI, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_UTENTEINSERI, PPQRY_CERTCON1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_LIST, 252, 244, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_DATAINSERIME, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_DATAINSERIME, PPQRY_CERTCON1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_LIST, 12, 264, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_UTENTULTIAGG, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_UTENTULTIAGG, PPQRY_CERTCON1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_LIST, 256, 264, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_CONSUNTIVO.SetRect(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONSUNTIVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CONSUNTIVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CONSUNTIVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONSUNTIVO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CONSUNTIVO.SetFieldPage(PFL_CONSUNTIVO_DATAULTIMAGG, -1, -1);
    PAN_CONSUNTIVO.SetFieldPanel(PFL_CONSUNTIVO_DATAULTIMAGG, PPQRY_CERTCON1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CONSUNTIVO_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONSUNTIVO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLIDESCRI ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_CONSUNTIVO_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLIDESCRI ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = 'E') ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_CONSUNTIVO_TITOLO, "");
    PAN_CONSUNTIVO.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGODESCRI ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.CATEGORIA = ~~CATEGORIA~~) ");
    SQL.append("and   (A.TITOLO = ~~TITOLO~~) ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_CATEGORIE, 0, SQL, PFL_CONSUNTIVO_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CATEGOCATEGO, ");
    SQL.append("  TO_CHAR ( A.CATEGORIA ) || ' - ' || A.DESCRIZIONE as CATEGODESCRI ");
    SQL.append("from ");
    SQL.append("  CATEGORIE A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_CATEGORIE, 1, SQL, PFL_CONSUNTIVO_CATEGORIA, "");
    PAN_CONSUNTIVO.SetQueryDB(PPQRY_CATEGORIE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONSUNTIVO.SetIMDB(IMDB, "PQRY_CERTCON1", true);
    PAN_CONSUNTIVO.set_SetString(MyGlb.MASTER_ROWNAME, "CERTCON");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.CODICE_CC as CODICE_CC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CERTCON A ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CONSUNTIVO.SetQuery(PPQRY_CERTCON1, 5, SQL, -1, "");
    PAN_CONSUNTIVO.SetQueryDB(PPQRY_CERTCON1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONSUNTIVO.SetMasterTable(0, "CERTCON");
    PAN_CONSUNTIVO.AddToSortList(PFL_CONSUNTIVO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONSUNTIVO.Status() == 2)
    {
      int oldListQBE = PAN_CONSUNTIVO.iUseListQBE;
      PAN_CONSUNTIVO.iUseListQBE = 0;
      PAN_CONSUNTIVO.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONSUNTIVO.PanelCommand(Glb.PCM_FIND);
      PAN_CONSUNTIVO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_PREVENTIBOOK_MST_PREVBOOKPAGE_Init()
  {
    BUK_PREVENTIBOOK.InitMastro(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, "30611700-DFF3-4538-B075-3796A9E63941");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, "PREVBOOKPAGE");
    BUK_PREVENTIBOOK.InitMastroBox(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, BUK_PREVENTIBOOK_RPTBOX_NUMEROPAGIN1, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_NUMEROPAGIN1, "B3F823F7-7611-41A8-861A-667FA690BFCE");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_NUMEROPAGIN1, BUK_PREVENTIBOOK_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_NUMEROPAGIN1, "866CFB33-D5DB-4C18-A2E2-CB4DDF0685EE");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_PREVENTIBOOK.InitMastroBox(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, BUK_PREVENTIBOOK_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_PAGEHEADER1, "8FC7F459-B32B-46AB-9569-F10C77567883");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_PREVENTIBOOK.InitMastroBox(BUK_PREVENTIBOOK_MST_PREVBOOKPAGE, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1, 1000, 2400, 19000, 26100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1, "57CC893A-45B9-40B3-AAC1-44ED7EDFEB37");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_PREVENTIBOOK_RPT_NEWREPORT_InitQuery() { BUK_PREVENTIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_PREVENTIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CERTBICODICE, ");
      SQL.append("  A.DESCRIZIONE as CERTBIDESCRI, ");
      SQL.append("  A.E_S as CERTBILES, ");
      SQL.append("  A.TITOLO as CERTBITITOLO, ");
      SQL.append("  A.CAT_INT as CERTBICATEGO, ");
      SQL.append("  A.CODICE_CP as CERTCODICERT, ");
      SQL.append("  B.TITOLO as CERTTITOTITO, ");
      SQL.append("  TO_CHAR ( B.TITOLO ) || ' - ' || B.DESCRIZIONE as CERTDESCTITO, ");
      SQL.append("  C.CATEGORIA as CERTCATECATE, ");
      SQL.append("  TO_CHAR ( C.CATEGORIA ) || ' - ' || C.DESCRIZIONE as CERTDESCCATE ");
      SQL.append("from ");
      SQL.append("  CERTBIL A, ");
      SQL.append("  TITOLI B, ");
      SQL.append("  CATEGORIE C ");
      SQL.append("where (A.E_S = 'E') ");
      SQL.append("and   (B.TITOLO = A.TITOLO) ");
      SQL.append("and   (B.E_S = 'E') ");
      SQL.append("and   (C.CATEGORIA = A.CAT_INT) ");
      SQL.append("and   (C.TITOLO = A.TITOLO) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_PREVENTIBOOK.SetReportQuery(BUK_PREVENTIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0BEAB1B2-A301-4A7D-9D28-FAA25F38BF7E");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PREVENTIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_PREVENTIBOOK.InitReport(BUK_PREVENTIBOOK_RPT_NEWREPORT, 196609);
    BUK_PREVENTIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPT_NEWREPORT, "53D88BB8-4DEE-4A2A-B5AE-78FAE56C1734");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_REPORTHEADER, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_REPORTHEADER, "BFA31831-C0BA-4BF5-8B1B-96E2C22D7613");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_TITOLO, BUK_PREVENTIBOOK_RPTBOX_PAGEHEADER1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_TITOLO, "27F4931F-BF21-4D58-874C-DA9DB35A2356");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_TITOLO, "TITOLO");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_TITOLO, BUK_PREVENTIBOOK_RPTBOX_TITOLO3, 0, 200, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_TITOLO3, "352E27DC-6C64-4973-A33A-48232A007270");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_TITOLO3, "TITOLO3");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_TITOLO3, BUK_PREVENTIBOOK_SPAN_FUNZIOESERV1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Codici Certificati di Previsione", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_FUNZIOESERV1, "62DC0103-6638-41FB-880D-112C556B295E");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_FUNZIOESERV1, "FUNZIOESERV1");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_PAGEHEADER, "90CA8303-940E-49A3-A66B-9F24F3B5B99D");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_CODICEHEADE1, 0, 0, 1400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_CODICEHEADE1, "0F870305-3BBB-44A7-A6AD-808EEB9A1F97");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_CODICEHEADE1, BUK_PREVENTIBOOK_SPAN_CODICE1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CODICE1, "D2097A5B-0917-491F-9AE8-2574662BDB75");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CODICE1, "CODICE1");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE3, 1500, 0, 6008, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE3, "D716D5ED-17D5-466A-818A-AA5F2035F2DF");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE3, "DESCRIHEADE3");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE3, BUK_PREVENTIBOOK_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_DESCRIZIONE1, "D7ECAEB3-1FB4-46ED-B9E5-A87E8B8A3282");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_CODICCPHEADE, 7600, 0, 2204, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_CODICCPHEADE, "12657AC6-F484-4386-A883-6DEC9411E38C");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_CODICCPHEADE, "CODICCPHEADE");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_CODICCPHEADE, BUK_PREVENTIBOOK_SPAN_CODICECERT1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice Cert.", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CODICECERT1, "1F38A2E3-F0E9-404D-951C-D2CB64C32A66");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CODICECERT1, "CODICECERT1");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE4, 9900, 0, 4375, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE4, "30F81F2A-9009-44BB-BD9A-290B57626EB9");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE4, "DESCRIHEADE4");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE4, BUK_PREVENTIBOOK_SPAN_TITOLO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Titolo", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_TITOLO1, "FBA8D03A-3655-45A3-B8C0-4F9DC0A88ED4");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_TITOLO1, "TITOLO1");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_PAGEHEADER, BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE5, 14368, 0, 4632, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE5, "D0B19B1A-20F0-4977-8A80-0D79266CA201");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE5, "DESCRIHEADE5");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRIHEADE5, BUK_PREVENTIBOOK_SPAN_CATEGORIA1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Categoria", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CATEGORIA1, "8E8D3C5B-D590-4843-998B-946DC6888D60");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CATEGORIA1, "CATEGORIA1");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_DETAIL, "4A8BF5DF-3E20-40F9-A868-346F35F75E06");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_DETAIL, "DETAIL");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_CODICE1, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_CODICE1, "77A8AEA2-CB18-4DA0-86E7-52C1A4B4E7CA");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_CODICE1, "CODICE1");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_CODICE1, BUK_PREVENTIBOOK_SPAN_CECOCOCEPRBO, MyGlb.VIS_CAMSENBORCEN, 1, 4, 0, 271384705, "Brief description of field content.", "::CERTBICODICE", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CECOCOCEPRBO, "1B82B95F-7EB2-4B7A-A76A-7B346556E543");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CECOCOCEPRBO, "CECOCOCEPRBO");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_DESCRIZIONE1, 1500, 0, 6008, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRIZIONE1, "D4CBF381-FF3D-44F3-86A1-AEBA050D03F3");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRIZIONE1, BUK_PREVENTIBOOK_SPAN_CEDECOCEPRBO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::CERTBIDESCRI", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CEDECOCEPRBO, "7E2EB822-C895-4AA3-A945-D8A0756856D3");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CEDECOCEPRBO, "CEDECOCEPRBO");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_CODICECP, 7600, 0, 2204, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_CODICECP, "91DE1E12-0322-447C-98E8-0E8887AC2F40");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_CODICECP, "CODICECP");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_CODICECP, BUK_PREVENTIBOOK_SPAN_CECOCECOCEPB, MyGlb.VIS_CAMSENBORCEN, 1, 5, 0, 271384705, "Brief description of field content.", "::CERTCODICERT", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CECOCECOCEPB, "6242D175-E5BD-4821-9430-FA11FEEFCA84");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CECOCECOCEPB, "CECOCECOCEPB");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_DESCRTITOL12, 9900, 0, 4375, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRTITOL12, "3B74E18F-25AA-417C-8CE7-527F153A2F25");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRTITOL12, "DESCRTITOL12");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRTITOL12, BUK_PREVENTIBOOK_SPAN_CEDETICOCEPB, MyGlb.VIS_DEFAREPOSTYL, 5, 242, 0, 271384705, "To String (TITOLI TITOLO) +c trattino con spazi +c TITOLI DESCRIZIONE", "::CERTDESCTITO", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CEDETICOCEPB, "79B4F3EB-A6AF-40E3-880D-F847AE18B044");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CEDETICOCEPB, "CEDETICOCEPB");
    BUK_PREVENTIBOOK.InitReportBox(BUK_PREVENTIBOOK_SEC_DETAIL, BUK_PREVENTIBOOK_RPTBOX_DESCRCATE223, 14368, 0, 4632, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_RPTBOX_DESCRCATE223, "D7C84DA5-035B-40EC-B45F-1F741C5BD867");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_RPTBOX_DESCRCATE223, "DESCRCATE223");
    BUK_PREVENTIBOOK.InitBoxSpan(BUK_PREVENTIBOOK_RPTBOX_DESCRCATE223, BUK_PREVENTIBOOK_SPAN_CEDECACOCEPB, MyGlb.VIS_DEFAREPOSTYL, 5, 242, 0, 271384705, "To String (CATEGORIE CATEGORIA) +c trattino con spazi +c CATEGORIE DESCRIZIONE", "::CERTDESCCATE", 1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SPAN_CEDECACOCEPB, "B46EADB3-2EEE-4BA7-976D-93442E4642A1");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SPAN_CEDECACOCEPB, "CEDECACOCEPB");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_PAGEFOOTER, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_PAGEFOOTER, "59DC2690-BA25-42B4-9D71-A76165E83788");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_PREVENTIBOOK.InitSection(BUK_PREVENTIBOOK_RPT_NEWREPORT, BUK_PREVENTIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_PREVENTIBOOK.SetSectionRendersInto(BUK_PREVENTIBOOK_SEC_REPORTFOOTER, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
    BUK_PREVENTIBOOK.SetRTCGuid(BUK_PREVENTIBOOK_SEC_REPORTFOOTER, "1A6ADEB4-8628-4549-83E8-10E807A5934E");
    BUK_PREVENTIBOOK.SetObjCode(BUK_PREVENTIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PREVENTIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_PREVENTIBOOK_InitLinks()
  {
    BUK_PREVENTIBOOK.SetBoxNextBox(BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1, BUK_PREVENTIBOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE_Init()
  {
    BUK_CONSUNTIBOOK.InitMastro(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, "FDE81E5A-3626-4E79-A357-B69BB672D3A2");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, "CONSBOOKPAGE");
    BUK_CONSUNTIBOOK.InitMastroBox(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, BUK_CONSUNTIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_NUMEROPAGINA, "D5B19068-37E3-46D0-91B8-6BC7EF396561");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_NUMEROPAGINA, BUK_CONSUNTIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_NUMEROPAGINA, "3C1BF24E-0AC7-4364-9AAD-88CDC69AF582");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONSUNTIBOOK.InitMastroBox(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, BUK_CONSUNTIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_PAGEHEADER, "B483C486-D341-46A4-9895-AE04A0D08EAB");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONSUNTIBOOK.InitMastroBox(BUK_CONSUNTIBOOK_MST_CONSBOOKPAGE, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY, 1000, 2400, 19000, 26300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY, "7A0F8626-818F-46E9-8E07-20B419484EF7");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_CONSUNTIBOOK_RPT_NEWREPORT_InitQuery() { BUK_CONSUNTIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CONSUNTIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CERTCOCODICE, ");
      SQL.append("  A.DESCRIZIONE as CERTCODESCRI, ");
      SQL.append("  A.TITOLO as CERTCOTITOLO, ");
      SQL.append("  A.CATEGORIA as CERTCOCATEGO, ");
      SQL.append("  A.E as CE, ");
      SQL.append("  A.CODICE_CC as CERTCODICERT, ");
      SQL.append("  B.TITOLO as CERTTITOTITO, ");
      SQL.append("  TO_CHAR ( B.TITOLO ) || ' - ' || B.DESCRIZIONE as CERTDESCTITO, ");
      SQL.append("  C.CATEGORIA as CERTCATECATE, ");
      SQL.append("  TO_CHAR ( C.CATEGORIA ) || ' - ' || C.DESCRIZIONE as CERTDESCCATE ");
      SQL.append("from ");
      SQL.append("  CERTCON A, ");
      SQL.append("  TITOLI B, ");
      SQL.append("  CATEGORIE C ");
      SQL.append("where (B.TITOLO(+) = A.TITOLO) ");
      SQL.append("and   (B.E_S = 'E') ");
      SQL.append("and   (C.CATEGORIA(+) = A.CATEGORIA) ");
      SQL.append("and   (C.TITOLO(+) = A.TITOLO) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CONSUNTIBOOK.SetReportQuery(BUK_CONSUNTIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "27A8B2AA-A9F2-4D2B-B798-74F772281AF9");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONSUNTIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CONSUNTIBOOK.InitReport(BUK_CONSUNTIBOOK_RPT_NEWREPORT, 196609);
    BUK_CONSUNTIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPT_NEWREPORT, "176B29AD-A372-4071-8C6E-2F0187B702D7");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_REPORTHEADER, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_REPORTHEADER, "74B65C2A-79D8-4B3A-BBDD-ACD58464231B");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_TITOLO, BUK_CONSUNTIBOOK_RPTBOX_PAGEHEADER);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_TITOLO, "55AC129D-51B4-45E0-B84D-9482823D8D44");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_TITOLO, "TITOLO");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_TITOLO, BUK_CONSUNTIBOOK_RPTBOX_TITOLO2, 0, 100, 19000, 900, 0, 1, 3, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_TITOLO2, "6ADCAA56-B902-4314-A72E-DAF77368A7D3");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_TITOLO2, BUK_CONSUNTIBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Codici Certificati Consuntivo", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_FUNZIOESERVI, "DA1538EA-F167-4359-B3EF-ADF0717F1266");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, "1ED8B60F-BFFD-4A5C-9979-AC1B81591472");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_CODICEHEADER, 0, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_CODICEHEADER, "128E583A-5519-4978-BAD1-A530F97B2A18");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_CODICEHEADER, BUK_CONSUNTIBOOK_SPAN_CODICE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CODICE, "8F911ABD-7C94-40E6-9B40-D5EC64ECF107");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CODICE, "CODICE");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE2, 1400, 0, 6300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE2, "C20A8E9F-EED3-463D-BC7B-252B1D8EF9A4");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE2, "DESCRIHEADE2");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE2, BUK_CONSUNTIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_DESCRIZIONE, "9AFD7D71-C6B0-4F24-A54D-F2A2982E4D39");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_CODICCCHEADE, 7800, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_CODICCCHEADE, "CF546704-B296-464B-800A-695116EB757E");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_CODICCCHEADE, "CODICCCHEADE");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_CODICCCHEADE, BUK_CONSUNTIBOOK_SPAN_CODICECERT, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Codice Cert.", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CODICECERT, "BFE3F0D7-5DC6-470F-AD17-D5811C3A71C7");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CODICECERT, "CODICECERT");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE1, 10000, 0, 4400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE1, "839E5D59-A016-4146-8207-9B7294862F84");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADE1, BUK_CONSUNTIBOOK_SPAN_TITOLO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Titolo", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_TITOLO, "237649D5-B781-44B9-8DB6-52F3CD8ECBA9");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_TITOLO, "TITOLO");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_PAGEHEADER, BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADER, 14540, 0, 4441, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADER, "DFDE9B93-E387-4EAF-8313-2EF243670EAF");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRIHEADER, BUK_CONSUNTIBOOK_SPAN_CATEGORIA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Categoria", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CATEGORIA, "5E91F8F4-9A90-4055-ACD7-A805A15C6A73");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CATEGORIA, "CATEGORIA");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_DETAIL, "C9AEA081-E5AE-4DC5-96A9-575527DEBC8C");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_DETAIL, "DETAIL");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_CODICE, 0, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_CODICE, "BF7D0EC7-8D7D-46F8-B6D9-913B5D4771B0");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_CODICE, BUK_CONSUNTIBOOK_SPAN_CECOCOCECOBO, MyGlb.VIS_CAMSENBORCEN, 1, 4, 0, 271384705, "Brief description of field content.", "::CERTCOCODICE", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CECOCOCECOBO, "40D0F0A8-FDEF-4F46-8143-C29545BCDA64");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CECOCOCECOBO, "CECOCOCECOBO");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_DESCRIZIONE, 1400, 0, 6300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRIZIONE, "E531AE53-F3F9-4FCB-AB4F-EB3A10A51265");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRIZIONE, BUK_CONSUNTIBOOK_SPAN_CEDECOCECOBO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::CERTCODESCRI", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CEDECOCECOBO, "EC005916-101F-40AB-ACCF-2B8758637BB0");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CEDECOCECOBO, "CEDECOCECOBO");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_CODICECC, 7800, 0, 2053, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_CODICECC, "1E96579D-9BBD-4631-AF95-CBC602B934C1");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_CODICECC, "CODICECC");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_CODICECC, BUK_CONSUNTIBOOK_SPAN_CECOCECOCECB, MyGlb.VIS_CAMSENBORCEN, 1, 5, 0, 271384705, "Brief description of field content.", "::CERTCODICERT", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CECOCECOCECB, "5411F4C9-8C34-4CE4-BC18-FE252938C2E8");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CECOCECOCECB, "CECOCECOCECB");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_DESCRTITOL11, 10000, 0, 4419, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRTITOL11, "28666442-BF53-4AFF-9B8F-5EB80875500F");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRTITOL11, "DESCRTITOL11");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRTITOL11, BUK_CONSUNTIBOOK_SPAN_CEDETICOCECB, MyGlb.VIS_DEFAREPOSTYL, 5, 242, 0, 271384705, "To String (TITOLI TITOLO) +c trattino con spazi +c TITOLI DESCRIZIONE", "::CERTDESCTITO", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CEDETICOCECB, "3ED57D40-3218-4EAF-8193-0CE1FBE95DBB");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CEDETICOCECB, "CEDETICOCECB");
    BUK_CONSUNTIBOOK.InitReportBox(BUK_CONSUNTIBOOK_SEC_DETAIL, BUK_CONSUNTIBOOK_RPTBOX_DESCRCATE222, 14540, 0, 4460, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_RPTBOX_DESCRCATE222, "371E89CB-994D-4F76-9362-CAD469DEABCF");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_RPTBOX_DESCRCATE222, "DESCRCATE222");
    BUK_CONSUNTIBOOK.InitBoxSpan(BUK_CONSUNTIBOOK_RPTBOX_DESCRCATE222, BUK_CONSUNTIBOOK_SPAN_CEDECACOCECB, MyGlb.VIS_DEFAREPOSTYL, 5, 242, 0, 271384705, "To String (CATEGORIE CATEGORIA) +c trattino con spazi +c CATEGORIE DESCRIZIONE", "::CERTDESCCATE", 1);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SPAN_CEDECACOCECB, "8DC9236E-9649-4121-93BA-353AEAF3DBF5");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SPAN_CEDECACOCECB, "CEDECACOCECB");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_PAGEFOOTER, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_PAGEFOOTER, "F35C9EEC-F72C-42CC-A189-12C38B6D429B");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONSUNTIBOOK.InitSection(BUK_CONSUNTIBOOK_RPT_NEWREPORT, BUK_CONSUNTIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONSUNTIBOOK.SetSectionRendersInto(BUK_CONSUNTIBOOK_SEC_REPORTFOOTER, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
    BUK_CONSUNTIBOOK.SetRTCGuid(BUK_CONSUNTIBOOK_SEC_REPORTFOOTER, "7FAAEC1F-6DDC-412C-9F2A-77F5835B051C");
    BUK_CONSUNTIBOOK.SetObjCode(BUK_CONSUNTIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONSUNTIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CONSUNTIBOOK_InitLinks()
  {
    BUK_CONSUNTIBOOK.SetBoxNextBox(BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY, BUK_CONSUNTIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVENTIVO) PAN_PREVENTIVO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVENTIVO) PAN_PREVENTIVO_ValidateRow(Cancel);
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVENTIVO) PAN_PREVENTIVO_DynamicProperties();
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVENTIVO) PAN_PREVENTIVO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PREVENTIVO) PAN_PREVENTIVO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CONSUNTIVO) PAN_CONSUNTIVO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_CODCERTABVIE) TAB_CODCERTABVIE_Click(PreviousPage, Cancel);
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
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PREVENTIBOOK) BUK_PREVENTIBOOK_OnPreview();
    if (SrcObj == BKW_CONSUNTIBOOK) BUK_CONSUNTIBOOK_OnPreview();
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
