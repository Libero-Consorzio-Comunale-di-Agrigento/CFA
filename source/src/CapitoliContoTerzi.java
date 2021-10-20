// **********************************************
// Capitoli Conto Terzi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CapitoliContoTerzi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_CAPCONTETAVI;
  private static int PFL_CONTOTERZI_PARTE = 0;
  private static int PFL_CONTOTERZI_CAPITOLO = 1;
  private static int PFL_CONTOTERZI_DESCRIZIONE = 2;
  private static int PFL_CONTOTERZI_UTENTEINSER1 = 3;
  private static int PFL_CONTOTERZI_DATAINSERIM1 = 4;
  private static int PFL_CONTOTERZI_UTENTULTIAG1 = 5;
  private static int PFL_CONTOTERZI_DATAULTIMAG1 = 6;

  private static int PPQRY_CAPTER1 = 0;


  IDPanel PAN_CONTOTERZI;
  private static int PFL_RICLASSIFICA_VOCEECON = 0;
  private static int PFL_RICLASSIFICA_VOCIECONDESC = 1;
  private static int PFL_RICLASSIFICA_CODICEPTC = 2;
  private static int PFL_RICLASSIFICA_CODICPTCDESC = 3;
  private static int PFL_RICLASSIFICA_VOCEECONLABE = 4;
  private static int PFL_RICLASSIFICA_CODPROCASLAB = 5;
  private static int PFL_RICLASSIFICA_INTESTALABE1 = 6;
  private static int PFL_RICLASSIFICA_ES1 = 7;
  private static int PFL_RICLASSIFICA_PROGRESSIVO = 8;
  private static int PFL_RICLASSIFICA_TITOLO4 = 9;
  private static int PFL_RICLASSIFICA_CATEGORIA = 10;
  private static int PFL_RICLASSIFICA_CODINTERVEN1 = 11;
  private static int PFL_RICLASSIFICA_CODTERZI = 12;
  private static int PFL_RICLASSIFICA_UTENTEINSER2 = 13;
  private static int PFL_RICLASSIFICA_DATAINSERIM2 = 14;
  private static int PFL_RICLASSIFICA_UTENTULTIAG2 = 15;
  private static int PFL_RICLASSIFICA_DATAULTIMAG2 = 16;

  private static int PPQRY_RICLASSIFIC1 = 0;

  private static int PPQRY_VOCIECONOMIC = 1;
  private static int PPQRY_CODICIPTC = 2;


  IDPanel PAN_RICLASSIFICA;
  private static int PFL_RICLASGESTIO_CODICEGESTIO = 0;
  private static int PFL_RICLASGESTIO_CODIGESTDESC = 1;
  private static int PFL_RICLASGESTIO_CGECGULABEL = 2;
  private static int PFL_RICLASGESTIO_INTESTALABEL = 3;
  private static int PFL_RICLASGESTIO_PROGRRICLASS = 4;
  private static int PFL_RICLASGESTIO_ES = 5;
  private static int PFL_RICLASGESTIO_DATAINSERIME = 6;
  private static int PFL_RICLASGESTIO_UTENTULTIAGG = 7;
  private static int PFL_RICLASGESTIO_UTENTEINSERI = 8;
  private static int PFL_RICLASGESTIO_DATAULTIMAGG = 9;

  private static int PPQRY_RICLASSIGES2 = 0;

  private static int PPQRY_CODICIGESTIO = 1;
  private static int PPQRY_RICLASSIFICA = 2;


  IDPanel PAN_RICLASGESTIO;
  CIDREObj BUK_CONTTERZBOOK;
  OBook BKW_CONTTERZBOOK;
  //
  // Template Pages constants
  private static int BUK_CONTTERZBOOK_MST_CONTERBOOPAG = 1;
  private static int BUK_CONTTERZBOOK_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_CONTTERZBOOK_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_CONTTERZBOOK_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_CONTTERZBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CONTTERZBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_CONTTERZBOOK_SEC_TITOLO = 8;
  private static int BUK_CONTTERZBOOK_RPTBOX_TITOLO1 = 9;
  private static int BUK_CONTTERZBOOK_SPAN_CATEGORIEU = 10;
  private static int BUK_CONTTERZBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_CONTTERZBOOK_RPTBOX_ESHEADER = 12;
  private static int BUK_CONTTERZBOOK_SPAN_PARTE = 13;
  private static int BUK_CONTTERZBOOK_RPTBOX_CAPITOHEADER = 14;
  private static int BUK_CONTTERZBOOK_SPAN_CAPITOLO = 15;
  private static int BUK_CONTTERZBOOK_RPTBOX_DESCRIHEADE1 = 16;
  private static int BUK_CONTTERZBOOK_SPAN_DESCRIZIONE = 17;
  private static int BUK_CONTTERZBOOK_SEC_DETAIL = 18;
  private static int BUK_CONTTERZBOOK_RPTBOX_ES = 19;
  private static int BUK_CONTTERZBOOK_SPAN_CAPACACOTCTB = 20;
  private static int BUK_CONTTERZBOOK_RPTBOX_CAPITOLO = 21;
  private static int BUK_CONTTERZBOOK_SPAN_CACACACOTCTB = 22;
  private static int BUK_CONTTERZBOOK_RPTBOX_DESCRIZIONE1 = 23;
  private static int BUK_CONTTERZBOOK_SPAN_CADECACOTCTB = 24;
  private static int BUK_CONTTERZBOOK_SEC_PAGEFOOTER = 25;
  private static int BUK_CONTTERZBOOK_SEC_REPORTFOOTER = 26;

  CIDREObj BUK_RICLGESTBOOK;
  OBook BKW_RICLGESTBOOK;
  //
  // Template Pages constants
  private static int BUK_RICLGESTBOOK_MST_RICGESBOOPAG = 1;
  private static int BUK_RICLGESTBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_RICLGESTBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_RICLGESTBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_RICLGESTBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_RICLGESTBOOK_RPT_NEWREPORT = 6;
  private static int BUK_RICLGESTBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_RICLGESTBOOK_SEC_TITOLOHEADER = 8;
  private static int BUK_RICLGESTBOOK_RPTBOX_TITOLO = 9;
  private static int BUK_RICLGESTBOOK_SPAN_RICLASSIFICA = 10;
  private static int BUK_RICLGESTBOOK_RPTBOX_SOTTOTITOLO = 11;
  private static int BUK_RICLGESTBOOK_SPAN_SOTTOTITOLO = 12;
  private static int BUK_RICLGESTBOOK_SEC_PAGEHEADER = 13;
  private static int BUK_RICLGESTBOOK_RPTBOX_CODIGESTHEAD = 14;
  private static int BUK_RICLGESTBOOK_SPAN_CODICEGESTIO = 15;
  private static int BUK_RICLGESTBOOK_SEC_DETAIL = 16;
  private static int BUK_RICLGESTBOOK_RPTBOX_CODICEGESTIO = 17;
  private static int BUK_RICLGESTBOOK_SPAN_RIGECGCCTRGB = 18;
  private static int BUK_RICLGESTBOOK_RPTBOX_DESCRIZIONE = 19;
  private static int BUK_RICLGESTBOOK_SPAN_RIGCGDCCTRGB = 20;
  private static int BUK_RICLGESTBOOK_SEC_PAGEFOOTER = 21;
  private static int BUK_RICLGESTBOOK_SEC_REPORTFOOTER = 22;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CAPTER1(IMDB);
    Init_PQRY_RICLASSIFIC1(IMDB);
    Init_PQRY_RICLASSIGES2(IMDB);
    Init_PQRY_CAPTER2(IMDB);
    Init_PQRY_RICLASSIGES4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CAPTER1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CAPTER1, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_CAPTER1, "PQRY_CAPTER1");
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_CAPITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER1,IMDBDef8.PQSL_CAPTER1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CAPTER1, 0);
  }

  private static void Init_PQRY_RICLASSIFIC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_RICLASSIFIC1, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_RICLASSIFIC1, "PQRY_RICLASSIFIC1");
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_TITOLO,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_COD_TERZI, "COD_TERZI");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_COD_TERZI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_CODICE_PTC, "CODICE_PTC");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_CODICE_PTC,5,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIFIC1,IMDBDef8.PQSL_RICLASSIFIC1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_RICLASSIFIC1, 0);
  }

  private static void Init_PQRY_RICLASSIGES2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_RICLASSIGES2, 8);
    IMDB.set_TblCode(IMDBDef8.PQRY_RICLASSIGES2, "PQRY_RICLASSIGES2");
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_PROGR_RICLASSIFICAZIONI, "PROGR_RICLASSIFICAZIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_PROGR_RICLASSIFICAZIONI,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES2,IMDBDef8.PQSL_RICLASSIGES2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_RICLASSIGES2, 0);
  }

  private static void Init_PQRY_CAPTER2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CAPTER2, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_CAPTER2, "PQRY_CAPTER2");
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_CAPITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPTER2,IMDBDef8.PQSL_CAPTER2_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CAPTER2, 0);
  }

  private static void Init_PQRY_RICLASSIGES4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_RICLASSIGES4, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_RICLASSIGES4, "PQRY_RICLASSIGES4");
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICLGESTPROG, "RICLGESTPROG");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICLGESTPROG,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESPRORIC, "RICGESPRORIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESPRORIC,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCODGES, "RICGESCODGES");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCODGES,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICLASGESTES, "RICLASGESTES");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICLASGESTES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCOGEDE, "RICGESCOGEDE");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCOGEDE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICTIT, "RICGESRICTIT");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICTIT,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICCAT, "RICGESRICCAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICCAT,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICOIN, "RICGESRICOIN");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICOIN,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICOTE, "RICGESRICOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESRICOTE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCAPDES, "RICGESCAPDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_RICLASSIGES4,IMDBDef8.PQSL_RICLASSIGES4_RICGESCAPDES,5,140,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_RICLASSIGES4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CapitoliContoTerzi(MyWebEntryPoint w, IMDBObj imdb)
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
  public CapitoliContoTerzi()
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
    FormIdx = MyGlb.FRM_CAPICONTTERZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "779C8386-F90C-45D0-95BA-AC436468BF3F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 848;
    DesignHeight = 442;
    set_Caption(new IDVariant("Capitoli Conto Terzi"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 848;
    Frames[1].Height = 416;
    Frames[1].Caption = "Capitoli Conto Terzi Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 416;
    TAB_CAPCONTETAVI = new OTabView(this);
    Frames[1].Content = TAB_CAPCONTETAVI;
    TAB_CAPCONTETAVI.iGuid = "B19959FE-3CBB-4CF3-80A0-0F2405A1E4A1";
    TAB_CAPCONTETAVI.SetItemCount(3);
    TAB_CAPCONTETAVI.Placement = 1;
    TAB_CAPCONTETAVI.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Conto Terzi";
    Frames[2].Parent = this;
    PAN_CONTOTERZI = new IDPanel(w, this, 2, "PAN_CONTOTERZI");
    Frames[2].Content = PAN_CONTOTERZI;
    PAN_CONTOTERZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTOTERZI.VS = MainFrm.VisualStyleList;
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 416-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_CONTTERZBOOK != null)
      PAN_CONTOTERZI.SetBook(BUK_CONTTERZBOOK);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AC822B7C-4F9B-412C-93D3-402D39639175");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 464, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTOTERZI.InitStatus = 2;
    PAN_CONTOTERZI_Init();
    PAN_CONTOTERZI_InitFields();
    PAN_CONTOTERZI_InitQueries();
    TAB_CAPCONTETAVI.SetItem(1, Frames[2], 0, "", "Conto Terzi", "Riferimenti a Capitoli di Terzi");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Riclassificazioni";
    Frames[3].Parent = this;
    PAN_RICLASSIFICA = new IDPanel(w, this, 3, "PAN_RICLASSIFICA");
    Frames[3].Content = PAN_RICLASSIFICA;
    PAN_RICLASSIFICA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RICLASSIFICA.VS = MainFrm.VisualStyleList;
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 416-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "10905564-BEE5-4E67-BF17-4E19CFAF19FE");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 800, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RICLASSIFICA.InitStatus = 1;
    PAN_RICLASSIFICA_Init();
    PAN_RICLASSIFICA_InitFields();
    PAN_RICLASSIFICA_InitQueries();
    TAB_CAPCONTETAVI.SetItem(2, Frames[3], 0, "", "Riclassificazioni", "Archivio altre classificazioni del piano dei conti");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Riclassificazione Gestionale";
    Frames[4].Parent = this;
    PAN_RICLASGESTIO = new IDPanel(w, this, 4, "PAN_RICLASGESTIO");
    Frames[4].Content = PAN_RICLASGESTIO;
    PAN_RICLASGESTIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RICLASGESTIO.VS = MainFrm.VisualStyleList;
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 416-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_RICLGESTBOOK != null)
      PAN_RICLASGESTIO.SetBook(BUK_RICLGESTBOOK);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "92061C4D-4F5E-4BF8-88BF-B84A164EFE63");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 808, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RICLASGESTIO.InitStatus = 2;
    PAN_RICLASGESTIO_Init();
    PAN_RICLASGESTIO_InitFields();
    PAN_RICLASGESTIO_InitQueries();
    TAB_CAPCONTETAVI.SetItem(3, Frames[4], 0, "", "Riclassificazione Gestionale", "");
    BKW_CONTTERZBOOK = new OBook(this);
    BUK_CONTTERZBOOK = new CIDREObj(BKW_CONTTERZBOOK);
    BKW_CONTTERZBOOK.iGuid = "07CAAE5D-471D-48D7-9EBB-43414E45CE4F";
    BKW_CONTTERZBOOK.Code = "BUK_CONTTERZBOOK";
    BKW_CONTTERZBOOK.BookObj = BUK_CONTTERZBOOK;
    BKW_CONTTERZBOOK.InitDefMasks();
    BUK_CONTTERZBOOK.InitBook(1, 1245185, "Conto Terzi Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTTERZBOOK.InitHTML();
    BUK_CONTTERZBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTTERZBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTTERZBOOK.SetRTCGuid(0, "07CAAE5D-471D-48D7-9EBB-43414E45CE4F");
    BUK_CONTTERZBOOK.SetObjCode(0, "CONTTERZBOOK");
    if (PAN_CONTOTERZI != null)
      PAN_CONTOTERZI.SetBook(BUK_CONTTERZBOOK);
    BUK_CONTTERZBOOK_MST_CONTERBOOPAG_Init();
    BUK_CONTTERZBOOK_RPT_NEWREPORT_Init();
    BUK_CONTTERZBOOK_InitLinks();
    BKW_RICLGESTBOOK = new OBook(this);
    BUK_RICLGESTBOOK = new CIDREObj(BKW_RICLGESTBOOK);
    BKW_RICLGESTBOOK.iGuid = "A92B2A04-13B3-46F2-B6B6-88F85C1923EC";
    BKW_RICLGESTBOOK.Code = "BUK_RICLGESTBOOK";
    BKW_RICLGESTBOOK.BookObj = BUK_RICLGESTBOOK;
    BKW_RICLGESTBOOK.InitDefMasks();
    BUK_RICLGESTBOOK.InitBook(1, 1245185, "Riclassificazione Gestionale Book", IMDB, MainFrm.VisualStyleList);
    BUK_RICLGESTBOOK.InitHTML();
    BUK_RICLGESTBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RICLGESTBOOK.Book.SetMainFrm(MainFrm);
    BUK_RICLGESTBOOK.SetRTCGuid(0, "A92B2A04-13B3-46F2-B6B6-88F85C1923EC");
    BUK_RICLGESTBOOK.SetObjCode(0, "RICLGESTBOOK");
    if (PAN_RICLASGESTIO != null)
      PAN_RICLASGESTIO.SetBook(BUK_RICLGESTBOOK);
    BUK_RICLGESTBOOK_MST_RICGESBOOPAG_Init();
    BUK_RICLGESTBOOK_RPT_NEWREPORT_Init();
    BUK_RICLGESTBOOK_InitLinks();
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
      PAN_CONTOTERZI.UpdatePanel(MainFrm);
      PAN_RICLASSIFICA.UpdatePanel(MainFrm);
      PAN_RICLASGESTIO.UpdatePanel(MainFrm);
      // BUK_CONTTERZBOOK.UpdateBook();
      // BUK_RICLGESTBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELVOCIECON && flRis && IdxPanelActived == PAN_RICLASSIFICA.FrIndex)
    {
      if (IdxFieldActived ==PFL_RICLASSIFICA_VOCEECON) {
      }
    }
    if (CallerIdx == MyGlb.FRM_CODICIPTC && flRis && IdxPanelActived == PAN_RICLASSIFICA.FrIndex)
    {
      if (IdxFieldActived ==PFL_RICLASSIFICA_CODICEPTC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELCODIGEST && flRis && IdxPanelActived == PAN_RICLASGESTIO.FrIndex)
    {
      if (IdxFieldActived ==PFL_RICLASGESTIO_CODICEGESTIO) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CONTTERZBOOK")) return BUK_CONTTERZBOOK;
    if (Code.equals("BUK_RICLGESTBOOK")) return BUK_RICLGESTBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CapitoliContoTerzi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CapitoliContoTerzi.class.getName() : (Glb.ClassWithPackage(CapitoliContoTerzi.class) ? CapitoliContoTerzi.class.getName().substring(CapitoliContoTerzi.class.getPackage().getName().length() + 1) : CapitoliContoTerzi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Capitoli Conto Terzi Tabbed View Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_CAPCONTETAVI_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Conto Terzi Tabbed View Change Page Event Body
      // Procedure Body
      // 
      if (new IDVariant(TAB_CAPCONTETAVI.SelectedPageIndex()).equals((new IDVariant(PAN_RICLASSIFICA.FrIndex)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0)) || new IDVariant(PAN_CONTOTERZI.Status()).equals((new IDVariant(3)), true))
        {
          Cancel.set((new IDVariant(-1)));
          return;
        }
        PAN_RICLASSIFICA.set_FieldText(PFL_RICLASSIFICA_INTESTALABE1, IDL.Add((new IDVariant(PAN_CONTOTERZI.FieldText(PFL_CONTOTERZI_CAPITOLO))), IDL.Add((new IDVariant(" - ")), IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DESCRIZIONE, 0))).stringValue());
      }
      if (new IDVariant(TAB_CAPCONTETAVI.SelectedPageIndex()).equals((new IDVariant(PAN_RICLASGESTIO.FrIndex)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_PROGRESSIVO, 0)) || new IDVariant(PAN_CONTOTERZI.Status()).equals((new IDVariant(3)), true) || new IDVariant(PAN_RICLASSIFICA.Status()).equals((new IDVariant(3)), true))
        {
          Cancel.set((new IDVariant(-1)));
        }
        PAN_RICLASGESTIO.set_FieldText(PFL_RICLASGESTIO_CGECGULABEL, ((IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0).equals((new IDVariant("E"))))?(new IDVariant("Cge")):(new IDVariant("Cgu"))).stringValue());
        PAN_RICLASGESTIO.set_FieldText(PFL_RICLASGESTIO_INTESTALABEL, IDL.Add(IDL.Add((new IDVariant(PAN_CONTOTERZI.FieldText(PFL_CONTOTERZI_CAPITOLO))), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DESCRIZIONE, 0)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "CapitoliContoTerziTabbedViewChangePageEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELVOCIECON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_VOCE_ECON, 0, IMDB.Value(IMDBDef7.PQRY_VOCIECONOMI2, IMDBDef7.PQSL_VOCIECONOMI2_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CODICIPTC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_CODICE_PTC, 0, IMDB.Value(IMDBDef7.PQRY_CODICIPTC2, IMDBDef7.PQSL_CODICIPTC2_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELCODIGEST)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_CODICE_GESTIONALE, 0, IMDB.Value(IMDBDef7.PQRY_CODICIGESTI2, IMDBDef7.PQSL_CODICIGESTI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "EndModalEvent", _e);
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
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_RICLASSIFICA.set_Visible((new IDVariant(0)).booleanValue());
        PAN_RICLASGESTIO.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_RICLASSIFICA.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_RICLASGESTIO.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Fattori
  // **********************************************************************
  public int ApriFattori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattori Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ApriFattori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conto Terzi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTOTERZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTOTERZI);
      // 
      // Conto Terzi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CONTOTERZI.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTOTERZI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DESCRIZIONE, 0).stringValue()); 
      if (PAN_CONTOTERZI.IsNewRow())
      {
        PAN_CONTOTERZI.SetFlags (Glb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTOTERZI.SetFlags (Glb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTOTERZI.SetFlags (Glb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CONTOTERZI.SetFlags (Glb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CONTOTERZI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conto Terzi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.CAPTERPD(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0), IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_CONTOTERZI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conto Terzi On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_PROGRESSIVO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi On Database Error Event
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
  private void PAN_CONTOTERZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CONTOTERZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Conto Terzi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CONTOTERZI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conto Terzi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi Parte Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CONTOTERZI_PARTE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conto Terzi Parte Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0))))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAPTER A ");
          SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)!=0)
          {
            PAN_CONTOTERZI.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
      else
      {
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziParteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Conto Terzi Capitolo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CONTOTERZI_CAPITOLO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conto Terzi Capitolo Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0))))
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAPTER A ");
          SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)!=0)
          {
            PAN_CONTOTERZI.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ContoTerziCapitoloValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RICLASSIFICA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RICLASSIFICA);
      // 
      // Riclassificazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_RICLASSIFICA.IsNewRow())
      {
        PAN_RICLASSIFICA.SetFlags (Glb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_RICLASSIFICA.SetFlags (Glb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_RICLASSIFICA.set_ToolTip(Glb.OBJ_FIELD,PFL_RICLASSIFICA_VOCIECONDESC,(new IDVariant(PAN_RICLASSIFICA.FieldText(PFL_RICLASSIFICA_VOCIECONDESC))).stringValue()); 
      PAN_RICLASSIFICA.set_ToolTip(Glb.OBJ_FIELD,PFL_RICLASSIFICA_CODICPTCDESC,(new IDVariant(PAN_RICLASSIFICA.FieldText(PFL_RICLASSIFICA_CODICPTCDESC))).stringValue()); 
      PAN_RICLASSIFICA.set_ToolTip(Glb.OBJ_FIELD,PFL_RICLASSIFICA_INTESTALABE1,(new IDVariant(PAN_RICLASSIFICA.FieldText(PFL_RICLASSIFICA_INTESTALABE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RICLASSIFICA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riclassificazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_E_S, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_COD_TERZI, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazioni On Database Error Event
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
  private void PAN_RICLASSIFICA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_RICLASSIFICA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Riclassificazioni On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazioni After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_RICLASSIFICA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riclassificazioni After Commit Event Body
      // Procedure Body
      // 
      PAN_RICLASSIFICA.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioniAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazione Gestionale On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RICLASGESTIO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riclassificazione Gestionale On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_E_S, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_PROGR_RICLASSIFICAZIONI, 0, IMDB.Value(IMDBDef8.PQRY_RICLASSIFIC1, IMDBDef8.PQSL_RICLASSIFIC1_PROGRESSIVO, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioneGestionaleOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazione Gestionale On Database Error Event
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
  private void PAN_RICLASGESTIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_RICLASGESTIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Riclassificazione Gestionale On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioneGestionaleOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazione Gestionale On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RICLASGESTIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RICLASGESTIO);
      // 
      // Riclassificazione Gestionale On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_RICLASGESTIO.set_ToolTip(Glb.OBJ_FIELD,PFL_RICLASGESTIO_INTESTALABEL,(new IDVariant(PAN_RICLASGESTIO.FieldText(PFL_RICLASGESTIO_INTESTALABEL))).stringValue()); 
      PAN_RICLASGESTIO.set_ToolTip(Glb.OBJ_FIELD,PFL_RICLASGESTIO_CODIGESTDESC,(new IDVariant(PAN_RICLASGESTIO.FieldText(PFL_RICLASGESTIO_CODIGESTDESC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioneGestionaleOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Riclassificazione CODICE GESTIONALE Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_RICLASGESTIO_CODICEGESTIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Riclassificazione CODICE GESTIONALE Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_CODICE_GESTIONALE, 0)))
      {
        Cancel.set((new IDVariant(-1)));
      }
      else
      {
        v_RETVAL = MainFrm.CodiciGestionaliLk(IMDB.Value(IMDBDef8.PQRY_RICLASSIGES2, IMDBDef8.PQSL_RICLASSIGES2_CODICE_GESTIONALE, 0), IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (v_RETVAL.equals((new IDVariant(-1)), true))
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Codice Gestionale Inesistente!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          Cancel.set((new IDVariant(-1)));
        }
        else
        {
          if (v_RETVAL.equals((new IDVariant(2)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Codice Gestionale Scaduto!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "RiclassificazioneCODICEGESTIONALEValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Voci Economiche
  // **********************************************************************
  public int ApriVociEconomiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voci Economiche Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0));
      MainFrm.Show(MyGlb.FRM_SCELVOCIECON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ApriVociEconomiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Codici PTC
  // **********************************************************************
  public int ApriCodiciPTC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Codici PTC Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI258, IMDBDef1.FLD_PARAMETRI258_PARAMES, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0));
      MainFrm.Show(MyGlb.FRM_CODICIPTC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ApriCodiciPTC", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Codici Gestionali
  // **********************************************************************
  public int ApriCodiciGestionali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Codici Gestionali Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMES, 0, IMDB.Value(IMDBDef8.PQRY_CAPTER1, IMDBDef8.PQSL_CAPTER1_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELCODIGEST, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliContoTerzi", "ApriCodiciGestionali", _e);
      return -1;
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
  private void TAB_CAPCONTETAVI_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_CAPCONTETAVI_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTOTERZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTOTERZI, Cancel);
    // Stub
  }

  private void PAN_CONTOTERZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTOTERZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CONTOTERZI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CONTOTERZI_PARTE)
      {
        PFL_CONTOTERZI_PARTE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CONTOTERZI_CAPITOLO)
      {
        PFL_CONTOTERZI_CAPITOLO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CONTOTERZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTOTERZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RICLASSIFICA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RICLASSIFICA, Cancel);
    // Stub
  }

  private void PAN_RICLASSIFICA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RICLASSIFICA_VOCEECON)
    {
      this.IdxPanelActived = this.PAN_RICLASSIFICA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVociEconomiche();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RICLASSIFICA_CODICEPTC)
    {
      this.IdxPanelActived = this.PAN_RICLASSIFICA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCodiciPTC();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RICLASSIFICA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RICLASSIFICA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RICLASSIFICA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RICLASSIFICA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RICLASGESTIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RICLASGESTIO, Cancel);
    // Stub
  }

  private void PAN_RICLASGESTIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RICLASGESTIO_CODICEGESTIO)
    {
      this.IdxPanelActived = this.PAN_RICLASGESTIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCodiciGestionali();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RICLASGESTIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RICLASGESTIO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_RICLASGESTIO_CODICEGESTIO)
      {
        PFL_RICLASGESTIO_CODICEGESTIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_RICLASGESTIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RICLASGESTIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONTTERZBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTTERZBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTTERZBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONTTERZBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CONTTERZBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONTTERZBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CONTTERZBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONTTERZBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTTERZBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTTERZBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTTERZBOOK_MST_CONTERBOOPAG)
    {
      BUK_CONTTERZBOOK.set_SpanValue(BUK_CONTTERZBOOK_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTTERZBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTTERZBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTTERZBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTTERZBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTTERZBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTTERZBOOK_OnPreview()
  {
    PreviewBook = BKW_CONTTERZBOOK;
    SetRD();
  }

  private void BUK_RICLGESTBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RICLGESTBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RICLGESTBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_RICLGESTBOOK_SEC_TITOLOHEADER)
    {
      BUK_RICLGESTBOOK.set_SpanValue(BUK_RICLGESTBOOK_SPAN_SOTTOTITOLO, new IDVariant(IDL.Add((new IDVariant("Conto Terzi")), IDL.Add((new IDVariant(" - ")), IDL.Add(((BUK_RICLGESTBOOK.GetReportColumn(BUK_RICLGESTBOOK_RPT_NEWREPORT, "RICLASGESTES").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa"))), IDL.Add((new IDVariant(":")), IDL.Add((new IDVariant(" ")), BUK_RICLGESTBOOK.GetReportColumn(BUK_RICLGESTBOOK_RPT_NEWREPORT, "RICGESCAPDES"))))))));
    }
    if (SectionID==BUK_RICLGESTBOOK_SEC_PAGEHEADER)
    {
      BUK_RICLGESTBOOK.set_SpanValue(BUK_RICLGESTBOOK_SPAN_CODICEGESTIO, new IDVariant(((BUK_RICLGESTBOOK.GetReportColumn(BUK_RICLGESTBOOK_RPT_NEWREPORT, "RICLASGESTES").equals((new IDVariant("E"))))?(new IDVariant("Cge")):(new IDVariant("Cgu")))));
    }
    if (SectionID==BUK_RICLGESTBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_RICLGESTBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_RICLGESTBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_RICLGESTBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RICLGESTBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RICLGESTBOOK_MST_RICGESBOOPAG)
    {
      BUK_RICLGESTBOOK.set_SpanValue(BUK_RICLGESTBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RICLGESTBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RICLGESTBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_RICLGESTBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RICLGESTBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RICLGESTBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RICLGESTBOOK_OnPreview()
  {
    PreviewBook = BKW_RICLGESTBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTOTERZI_Init()
  {

    PAN_CONTOTERZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTOTERZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTOTERZI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, "724F3869-B3B9-4D4E-A0FE-540FCB8D7AAE");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, "Parte");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, "B604F675-8F01-42B0-B55F-034FBAF0000D");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, "Capitolo");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, "41631037-593F-473D-BA3D-27F356DD39B2");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, "Descrizione");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, "428730A4-B074-4588-A750-41C1FCD7AC36");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, "D9D11D37-4265-44B7-A13A-A49E093108E7");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, "38CF888E-B41E-44F3-BADC-C1591F02B7CC");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTOTERZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, "4EC4C58D-7488-44A2-B4D3-F88FDED0644A");
    PAN_CONTOTERZI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_CONTOTERZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, "");
    PAN_CONTOTERZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTOTERZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTOTERZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_FORM, 128);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_PARTE, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_PARTE, PPQRY_CAPTER1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_LIST, 64, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_CAPITOLO, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_CAPITOLO, PPQRY_CAPTER1, "A.CAPITOLO", "CAPITOLO", 1, 2, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_LIST, 136, 36, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_DESCRIZIONE, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_DESCRIZIONE, PPQRY_CAPTER1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_LIST, -8, 248, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_UTENTEINSER1, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_UTENTEINSER1, PPQRY_CAPTER1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_LIST, 242, 248, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_DATAINSERIM1, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_DATAINSERIM1, PPQRY_CAPTER1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_LIST, 0, 276, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 172, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_UTENTULTIAG1, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_UTENTULTIAG1, PPQRY_CAPTER1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_LIST, 252, 276, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_CONTOTERZI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTOTERZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_CONTOTERZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_CONTOTERZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTOTERZI_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CONTOTERZI.SetFieldPage(PFL_CONTOTERZI_DATAULTIMAG1, -1, -1);
    PAN_CONTOTERZI.SetFieldPanel(PFL_CONTOTERZI_DATAULTIMAG1, PPQRY_CAPTER1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CONTOTERZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTOTERZI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTOTERZI.SetIMDB(IMDB, "PQRY_CAPTER1", true);
    PAN_CONTOTERZI.set_SetString(MyGlb.MASTER_ROWNAME, "CAPTER");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S > ' ') ");
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO ");
    PAN_CONTOTERZI.SetQuery(PPQRY_CAPTER1, 5, SQL, -1, "");
    PAN_CONTOTERZI.SetQueryDB(PPQRY_CAPTER1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTOTERZI.SetMasterTable(0, "CAPTER");
    PAN_CONTOTERZI.AddToSortList(PFL_CONTOTERZI_PARTE, true);
    PAN_CONTOTERZI.AddToSortList(PFL_CONTOTERZI_CAPITOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTOTERZI.Status() == 2)
    {
      int oldListQBE = PAN_CONTOTERZI.iUseListQBE;
      PAN_CONTOTERZI.iUseListQBE = 0;
      PAN_CONTOTERZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTOTERZI.PanelCommand(Glb.PCM_FIND);
      PAN_CONTOTERZI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_RICLASSIFICA_Init()
  {

    PAN_RICLASSIFICA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RICLASSIFICA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RICLASSIFICA.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, "F7DDB00F-6853-41BA-AE0A-864685F0CADE");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, "VOCE ECON");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, "57C08B1B-3CBC-4EB4-8AEB-0ECE34516E45");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, "3BDE7439-CAB3-48A7-A18E-8D1B31E007A7");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, "CODICE PTC");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.VIS_NORMALFIELDS);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, "6F3F7E13-4BC6-48C7-9A62-EEE6D05255B0");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, "CODICI PTC DESCRIZIONE1");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, "B9C1180D-0979-415D-84FD-6F0AA08002B5");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, "Voce Economica");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, "868BBABA-D31D-4285-AD74-3A46E5ACA7F6");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, "Codice Prospetto Cassa");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, "6EE154A0-63D0-418A-A38A-21EFDA8CBD5C");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.VIS_ETICHEGRASSE);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, "1DFF7EEE-60E8-448B-83D2-AC0F64E3D992");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, "E S");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.VIS_NONNULLAFIEL);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, 0, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, "C509EDB1-44E1-4007-9C18-8F4369675B40");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, "PROGRESSIVO");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, "53B0D68C-BD6B-4D6E-9092-7E45F214EF0B");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, "TITOLO");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, "A81216B3-B4DD-4EA1-A399-217A010220A1");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, "CATEGORIA");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, "F915175D-8AB6-42F4-BF40-1D53327D53E4");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, "COD INTERVENTO");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, "FA23F1AD-93F0-482B-AE9B-6BBE18B99E4A");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, "COD TERZI");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, "A593C62C-ADF4-4DC3-9659-CE708F4B5133");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, "UTENTE INSERIMENTO");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, "81F0C88A-450A-49C4-B5F2-D2DC03129687");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, "DATA INSERIMENTO");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, "5F0FB2CC-6C37-4C90-A5AF-0DEDE6B07FCD");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, "UTENTE ULTIMO AGG");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASSIFICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, "73C4D43A-9F42-4E16-A4BD-9A4F41916DC2");
    PAN_RICLASSIFICA.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, "DATA ULTIMO AGG");
    PAN_RICLASSIFICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, "");
    PAN_RICLASSIFICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASSIFICA.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RICLASSIFICA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_LIST, 0, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_FORM, 4, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_FORM, 112);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_VOCEECON, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_VOCEECON, PPQRY_RICLASSIFIC1, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_LIST, 44, 84, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_LIST, 176);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_FORM, 4, 196, 536, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_FORM, 176);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_FORM, 2);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCIECONDESC, MyGlb.PANEL_FORM, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_VOCIECONDESC, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_VOCIECONDESC, PPQRY_VOCIECONOMIC, "A.DESCRIZIONE", "VOCIECONDESC", 5, 140, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_LIST, 392, 84, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_LIST, 72);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_LIST, "CODICE PTC");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_FORM, 112);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICEPTC, MyGlb.PANEL_FORM, "CODICE PTC");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CODICEPTC, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CODICEPTC, PPQRY_RICLASSIFIC1, "A.CODICE_PTC", "CODICE_PTC", 5, 7, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_LIST, 468, 84, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_LIST, 144);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_LIST, "CODICI PTC DESCRIZIONE1");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_FORM, 4, 232, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_FORM, 144);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODICPTCDESC, MyGlb.PANEL_FORM, "COD. PTC DESCRIZIONE1");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CODICPTCDESC, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CODICPTCDESC, PPQRY_CODICIPTC, "A.DESCRIZIONE1", "CODICPTCDESC", 5, 70, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_LIST, 0, 48, 392, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_LIST, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_LIST, 2);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_FORM, 0, 0, 400, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_FORM, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_VOCEECONLABE, MyGlb.PANEL_FORM, 2);
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_VOCEECONLABE, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_VOCEECONLABE, -1, "", "VOCEECONLABE", 0, 0, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_LIST, 392, 48, 408, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_LIST, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_LIST, 2);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_FORM, 8, 8, 400, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_FORM, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODPROCASLAB, MyGlb.PANEL_FORM, 2);
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CODPROCASLAB, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CODPROCASLAB, -1, "", "CODPROCASLAB", 0, 0, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_LIST, 4, 8, 796, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_LIST, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_FORM, 76, 8, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_FORM, 0);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_INTESTALABE1, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_INTESTALABE1, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_INTESTALABE1, -1, "", "INTESTALABE1", 0, 0, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_LIST, 24);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_FORM, 4, 256, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_FORM, 24);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_ES1, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_ES1, PPQRY_RICLASSIFIC1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 256, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_PROGRESSIVO, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_PROGRESSIVO, PPQRY_RICLASSIFIC1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_LIST, 48);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_LIST, "TITOLO");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_FORM, 4, 256, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_FORM, 48);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_TITOLO4, MyGlb.PANEL_FORM, "TITOLO");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_TITOLO4, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_TITOLO4, PPQRY_RICLASSIFIC1, "A.TITOLO", "TITOLO", 1, 1, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_LIST, "CATEG.");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_FORM, 4, 256, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CATEGORIA, MyGlb.PANEL_FORM, "CATEG.");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CATEGORIA, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CATEGORIA, PPQRY_RICLASSIFIC1, "A.CATEGORIA", "CATEGORIA", 1, 2, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_LIST, 96);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_LIST, "COD INTERVENTO");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_FORM, 4, 256, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_FORM, 96);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODINTERVEN1, MyGlb.PANEL_FORM, "COD INTERV.");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CODINTERVEN1, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CODINTERVEN1, PPQRY_RICLASSIFIC1, "A.COD_INTERVENTO", "COD_INTERVENTO", 1, 2, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_LIST, 64);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_LIST, "COD TERZI");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_FORM, 64);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_CODTERZI, MyGlb.PANEL_FORM, "COD TER.");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_CODTERZI, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_CODTERZI, PPQRY_RICLASSIFIC1, "A.COD_TERZI", "COD_TERZI", 1, 2, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_LIST, 8, 292, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_LIST, 120);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_FORM, 4, 256, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_FORM, 120);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTEINSER2, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_UTENTEINSER2, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_UTENTEINSER2, PPQRY_RICLASSIFIC1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_LIST, 256, 292, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_LIST, 108);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_FORM, 4, 280, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_FORM, 108);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAINSERIM2, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_DATAINSERIM2, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_DATAINSERIM2, PPQRY_RICLASSIFIC1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_LIST, 16, 324, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_LIST, 112);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_FORM, 4, 304, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_FORM, 112);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_UTENTULTIAG2, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_UTENTULTIAG2, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_UTENTULTIAG2, PPQRY_RICLASSIFIC1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_LIST, 264, 320, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_LIST, 100);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_LIST, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_RICLASSIFICA.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_FORM, 4, 328, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASSIFICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_FORM, 100);
    PAN_RICLASSIFICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_FORM, 1);
    PAN_RICLASSIFICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASSIFICA_DATAULTIMAG2, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_RICLASSIFICA.SetFieldPage(PFL_RICLASSIFICA_DATAULTIMAG2, -1, -1);
    PAN_RICLASSIFICA.SetFieldPanel(PFL_RICLASSIFICA_DATAULTIMAG2, PPQRY_RICLASSIFIC1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_RICLASSIFICA_InitQueries()
  {
    StringBuffer SQL;

    PAN_RICLASSIFICA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A ");
    SQL.append("where (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CODICE = ~~VOCE_ECON~~) ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_RICLASSIFICA.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASSIFICA.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE1 as CODICPTCDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_PTC A ");
    SQL.append("where (A.CODICE = ~~CODICE_PTC~~) ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_CODICIPTC, 0, SQL, -1, "");
    PAN_RICLASSIFICA.SetQueryDB(PPQRY_CODICIPTC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASSIFICA.SetMasterTable(PPQRY_CODICIPTC, "CODICI_PTC");
    PAN_RICLASSIFICA.SetIMDB(IMDB, "PQRY_RICLASSIFIC1", true);
    PAN_RICLASSIFICA.set_SetString(MyGlb.MASTER_ROWNAME, "RICLASSIFICAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.COD_INTERVENTO as COD_INTERVENTO, ");
    SQL.append("  A.COD_TERZI as COD_TERZI, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.CODICE_PTC as CODICE_PTC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI A ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_CAPTER1.E_S~~) ");
    SQL.append("and   (A.COD_TERZI = ~~PQRY_CAPTER1.CAPITOLO~~) ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.VOCE_ECON ");
    PAN_RICLASSIFICA.SetQuery(PPQRY_RICLASSIFIC1, 5, SQL, -1, "");
    PAN_RICLASSIFICA.SetQueryDB(PPQRY_RICLASSIFIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASSIFICA.SetMasterTable(0, "RICLASSIFICAZIONI");
    PAN_RICLASSIFICA.AddToSortList(PFL_RICLASSIFICA_VOCEECON, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RICLASSIFICA.Status() == 2)
    {
      int oldListQBE = PAN_RICLASSIFICA.iUseListQBE;
      PAN_RICLASSIFICA.iUseListQBE = 0;
      PAN_RICLASSIFICA.PanelCommand(Glb.PCM_SEARCH);
      PAN_RICLASSIFICA.PanelCommand(Glb.PCM_FIND);
      PAN_RICLASSIFICA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_RICLASGESTIO_Init()
  {

    PAN_RICLASGESTIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RICLASGESTIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RICLASGESTIO.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, "ADE21CD3-0EE3-4B3E-AFF6-C653DB9C7A46");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, "0A92438A-28A2-4CB9-B8D8-FBE8238806F3");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, "0C50B69F-4D04-4B6D-B25B-7BE90BF2E8D0");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, "F443EA38-9269-48FF-9B8B-780DB3BEC03D");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, "A20F652C-E468-4DCD-B785-9648B2CA985F");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, "PROGR RICLASSIFICAZIONI");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.VIS_NONNULLAFIEL);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, 0, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, "44B79AF9-31FB-4A13-8DBD-46E260281603");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, "E S");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, "94957470-44A2-4330-AFF6-B2102B5AFAAF");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, "11C52748-95DA-4AD3-B72F-30CA879C6C03");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, "1F2345CD-3114-4564-9EA9-7A690C271245");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RICLASGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, "51C12E5B-E833-45DC-BF4A-12010D77413E");
    PAN_RICLASGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_RICLASGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, "");
    PAN_RICLASGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_RICLASGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RICLASGESTIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_LIST, 0, 84, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_LIST, 112);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_LIST, "COD. GEST.");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_FORM, 160);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODICEGESTIO, MyGlb.PANEL_FORM, "CODICE GESTIONALE");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_CODICEGESTIO, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_CODICEGESTIO, PPQRY_RICLASSIGES2, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_LIST, 56, 84, 752, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_LIST, 180);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_FORM, 4, 76, 688, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_FORM, 2);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CODIGESTDESC, MyGlb.PANEL_FORM, "CODICI GESTIONALI DESCRIZIONE");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_CODIGESTDESC, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_CODIGESTDESC, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_LIST, 0, 48, 808, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_LIST, 0);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_LIST, 2);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_FORM, 0, 0, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_FORM, 0);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_CGECGULABEL, MyGlb.PANEL_FORM, 2);
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_CGECGULABEL, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_CGECGULABEL, -1, "", "CGECGULABEL", 0, 0, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_LIST, 4, 8, 804, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_FORM, 76, 8, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_INTESTALABEL, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_LIST, 148);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_LIST, "PROGR RICLASSIFICAZIONI");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_FORM, 4, 112, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_FORM, 148);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_PROGRRICLASS, MyGlb.PANEL_FORM, "PR. RICLASSIFICAZIONI");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_PROGRRICLASS, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_PROGRRICLASS, PPQRY_RICLASSIGES2, "A.PROGR_RICLASSIFICAZIONI", "PROGR_RICLASSIFICAZIONI", 3, 10, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_LIST, 24);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_FORM, 4, 112, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_FORM, 24);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_ES, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_ES, PPQRY_RICLASSIGES2, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 12, 292, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 112, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_DATAINSERIME, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_DATAINSERIME, PPQRY_RICLASSIGES2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 12, 328, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 136, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_UTENTULTIAGG, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_UTENTULTIAGG, PPQRY_RICLASSIGES2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 244, 292, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 160, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_UTENTEINSERI, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_UTENTEINSERI, PPQRY_RICLASSIGES2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 252, 328, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_RICLASGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 184, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RICLASGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_RICLASGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_RICLASGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RICLASGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_RICLASGESTIO.SetFieldPage(PFL_RICLASGESTIO_DATAULTIMAGG, -1, -1);
    PAN_RICLASGESTIO.SetFieldPanel(PFL_RICLASGESTIO_DATAULTIMAGG, PPQRY_RICLASSIGES2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_RICLASGESTIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_RICLASGESTIO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CODICE = ~~CODICE_GESTIONALE~~) ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_RICLASGESTIO.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASGESTIO.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as RICLASTITOLO, ");
    SQL.append("  A.CATEGORIA as RICLASCATEGO, ");
    SQL.append("  A.COD_INTERVENTO as RICLACODINTE, ");
    SQL.append("  A.COD_TERZI as RICLACODTERZ ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI A ");
    SQL.append("where (A.PROGRESSIVO = ~~PROGR_RICLASSIFICAZIONI~~) ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIFICA, 0, SQL, -1, "");
    PAN_RICLASGESTIO.SetQueryDB(PPQRY_RICLASSIFICA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASGESTIO.SetMasterTable(PPQRY_RICLASSIFICA, "RICLASSIFICAZIONI");
    PAN_RICLASGESTIO.SetIMDB(IMDB, "PQRY_RICLASSIGES2", true);
    PAN_RICLASGESTIO.set_SetString(MyGlb.MASTER_ROWNAME, "RICLASSIFICAZIONI GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.PROGR_RICLASSIFICAZIONI as PROGR_RICLASSIFICAZIONI, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_RICLASSIFICAZIONI = ~~PQRY_RICLASSIFIC1.PROGRESSIVO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_CAPTER1.E_S~~) ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE_GESTIONALE ");
    PAN_RICLASGESTIO.SetQuery(PPQRY_RICLASSIGES2, 5, SQL, -1, "");
    PAN_RICLASGESTIO.SetQueryDB(PPQRY_RICLASSIGES2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RICLASGESTIO.SetMasterTable(0, "RICLASSIFICAZIONI_GEST");
    PAN_RICLASGESTIO.AddToSortList(PFL_RICLASGESTIO_CODICEGESTIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RICLASGESTIO.Status() == 2)
    {
      int oldListQBE = PAN_RICLASGESTIO.iUseListQBE;
      PAN_RICLASGESTIO.iUseListQBE = 0;
      PAN_RICLASGESTIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_RICLASGESTIO.PanelCommand(Glb.PCM_FIND);
      PAN_RICLASGESTIO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTTERZBOOK_MST_CONTERBOOPAG_Init()
  {
    BUK_CONTTERZBOOK.InitMastro(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, "7861A219-5EF3-472B-8DD0-9330C2895A7E");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, "CONTERBOOPAG");
    BUK_CONTTERZBOOK.InitMastroBox(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, BUK_CONTTERZBOOK_RPTBOX_NUMEROPAGIN1, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_NUMEROPAGIN1, "1D05A01F-B784-41A1-AD9C-36D28F2B2233");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_NUMEROPAGIN1, BUK_CONTTERZBOOK_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_NUMEROPAGIN1, "35EC3DF1-2375-4145-A7A2-CD2FF30F4741");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_CONTTERZBOOK.InitMastroBox(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, BUK_CONTTERZBOOK_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 1100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_PAGEHEADER1, "8224EDCA-2EC5-4276-896B-9C7C4C0D8EFF");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_CONTTERZBOOK.InitMastroBox(BUK_CONTTERZBOOK_MST_CONTERBOOPAG, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1, 900, 2400, 19000, 26200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1, "867F3AA1-882F-426F-A28D-CE9A6B33A7CB");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_CONTTERZBOOK_RPT_NEWREPORT_InitQuery() { BUK_CONTTERZBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CONTTERZBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAPTER A ");
      SQL.append("where (A.E_S > ' ') ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.CAPITOLO ");
      BUK_CONTTERZBOOK.SetReportQuery(BUK_CONTTERZBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "FB06DE77-715B-48B9-B6A5-A84BDEBC460B");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTTERZBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CONTTERZBOOK.InitReport(BUK_CONTTERZBOOK_RPT_NEWREPORT, 196609);
    BUK_CONTTERZBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPT_NEWREPORT, "A19658F5-B83C-4150-91FA-439B357E794D");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_REPORTHEADER, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_REPORTHEADER, "072B0FCC-6E7A-4EC6-B256-DAFFE717F69D");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_TITOLO, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_TITOLO, BUK_CONTTERZBOOK_RPTBOX_PAGEHEADER1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_TITOLO, "C2B73335-0A1B-4256-8551-F96F011C1BBE");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_TITOLO, "TITOLO");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_TITOLO, BUK_CONTTERZBOOK_RPTBOX_TITOLO1, 0, 200, 19000, 800, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_TITOLO1, "7C7A3393-B284-49F9-B29E-925721F790CF");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_TITOLO1, "TITOLO1");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_TITOLO1, BUK_CONTTERZBOOK_SPAN_CATEGORIEU, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Capitoli Conto Terzi", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_CATEGORIEU, "01D999FA-CC6F-482C-B641-C2548BF9B7A1");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_CATEGORIEU, "CATEGORIEU");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_PAGEHEADER, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_PAGEHEADER, "8775CD4C-3ABD-42DA-A1EA-EDF98AEE9E4B");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_PAGEHEADER, BUK_CONTTERZBOOK_RPTBOX_ESHEADER, 0, 0, 1500, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_ESHEADER, "245ACD78-A4A8-42A5-A47D-4D0CF25C2410");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_ESHEADER, "ESHEADER");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_ESHEADER, BUK_CONTTERZBOOK_SPAN_PARTE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Parte", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_PARTE, "1F6A88EE-96F3-48FB-8CA9-2C035BC11252");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_PARTE, "PARTE");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_PAGEHEADER, BUK_CONTTERZBOOK_RPTBOX_CAPITOHEADER, 1600, 0, 1688, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_CAPITOHEADER, "DD27C2CC-A22B-4571-A800-922949ECDFC7");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_CAPITOHEADER, "CAPITOHEADER");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_CAPITOHEADER, BUK_CONTTERZBOOK_SPAN_CAPITOLO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Capitolo", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_CAPITOLO, "8ADD75F6-2A7A-476D-9127-29CFFB750A5F");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_CAPITOLO, "CAPITOLO");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_PAGEHEADER, BUK_CONTTERZBOOK_RPTBOX_DESCRIHEADE1, 3500, 0, 15500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_DESCRIHEADE1, "686F3FDC-7D81-480B-9B19-E54EC0E93EFF");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_DESCRIHEADE1, BUK_CONTTERZBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_DESCRIZIONE, "50725F11-3FF7-42C9-8C93-62F4ED5A34F4");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_DETAIL, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_DETAIL, "DB9A8ABE-C81D-4179-904A-D236AB86DDBC");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_DETAIL, "DETAIL");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_DETAIL, BUK_CONTTERZBOOK_RPTBOX_ES, 0, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_ES, "AF50AF25-2826-4882-81D0-D15680AC3919");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_ES, "ES");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_ES, BUK_CONTTERZBOOK_SPAN_CAPACACOTCTB, MyGlb.VIS_CAMSENBORCEN, 5, 1, 0, 271384705, "Brief description of field content.", "::E_S", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_CAPACACOTCTB, "2519CA33-1146-46F4-88CA-143B277D1BC8");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_CAPACACOTCTB, "CAPACACOTCTB");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_DETAIL, BUK_CONTTERZBOOK_RPTBOX_CAPITOLO, 1600, 0, 1688, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_CAPITOLO, "4B1AE4A7-1F95-4F04-AC35-2FEAE65BE20B");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_CAPITOLO, BUK_CONTTERZBOOK_SPAN_CACACACOTCTB, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::CAPITOLO", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_CACACACOTCTB, "B215B65C-5014-4A90-A913-50A0BF4BA812");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_CACACACOTCTB, "CACACACOTCTB");
    BUK_CONTTERZBOOK.InitReportBox(BUK_CONTTERZBOOK_SEC_DETAIL, BUK_CONTTERZBOOK_RPTBOX_DESCRIZIONE1, 3500, 0, 15500, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_RPTBOX_DESCRIZIONE1, "AE07A770-54C2-4650-B541-F5424D4B771F");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_CONTTERZBOOK.InitBoxSpan(BUK_CONTTERZBOOK_RPTBOX_DESCRIZIONE1, BUK_CONTTERZBOOK_SPAN_CADECACOTCTB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SPAN_CADECACOTCTB, "BF559BA9-8F0A-4C23-9E83-8136402C0B92");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SPAN_CADECACOTCTB, "CADECACOTCTB");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_PAGEFOOTER, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_PAGEFOOTER, "4F25A49B-D252-40C3-83B6-5F7B02A68459");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTTERZBOOK.InitSection(BUK_CONTTERZBOOK_RPT_NEWREPORT, BUK_CONTTERZBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONTTERZBOOK.SetSectionRendersInto(BUK_CONTTERZBOOK_SEC_REPORTFOOTER, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
    BUK_CONTTERZBOOK.SetRTCGuid(BUK_CONTTERZBOOK_SEC_REPORTFOOTER, "F6190C11-227A-4408-B548-B619E1BD25AF");
    BUK_CONTTERZBOOK.SetObjCode(BUK_CONTTERZBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTTERZBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CONTTERZBOOK_InitLinks()
  {
    BUK_CONTTERZBOOK.SetBoxNextBox(BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1, BUK_CONTTERZBOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_RICLGESTBOOK_MST_RICGESBOOPAG_Init()
  {
    BUK_RICLGESTBOOK.InitMastro(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, "3D67A50F-5F7B-49A2-9353-52294465587D");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, "RICGESBOOPAG");
    BUK_RICLGESTBOOK.InitMastroBox(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, BUK_RICLGESTBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_NUMEROPAGINA, "1584E82D-AB57-4418-9F31-45A2A7647C83");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_NUMEROPAGINA, BUK_RICLGESTBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_NUMEROPAGINA, "4AF5B47D-76D2-4C59-855E-C53B92B31F4B");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RICLGESTBOOK.InitMastroBox(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, BUK_RICLGESTBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_PAGEHEADER, "9CDB81ED-929D-4894-BCBB-FA3DD33C6772");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_RICLGESTBOOK.InitMastroBox(BUK_RICLGESTBOOK_MST_RICGESBOOPAG, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY, 1000, 3400, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_PAGEBODY, "78398787-25F3-4156-B115-AA0721E8BF8B");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_RICLGESTBOOK_RPT_NEWREPORT_InitQuery() { BUK_RICLGESTBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_RICLGESTBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as RICLGESTPROG, ");
      SQL.append("  A.PROGR_RICLASSIFICAZIONI as RICGESPRORIC, ");
      SQL.append("  A.CODICE_GESTIONALE as RICGESCODGES, ");
      SQL.append("  A.E_S as RICLASGESTES, ");
      SQL.append("  B.DESCRIZIONE as RICGESCOGEDE, ");
      SQL.append("  C.TITOLO as RICGESRICTIT, ");
      SQL.append("  C.CATEGORIA as RICGESRICCAT, ");
      SQL.append("  C.COD_INTERVENTO as RICGESRICOIN, ");
      SQL.append("  C.COD_TERZI as RICGESRICOTE, ");
      SQL.append("  D.DESCRIZIONE as RICGESCAPDES ");
      SQL.append("from ");
      SQL.append("  RICLASSIFICAZIONI_GEST A, ");
      SQL.append("  CODICI_GESTIONALI B, ");
      SQL.append("  RICLASSIFICAZIONI C, ");
      SQL.append("  CAPTER D ");
      SQL.append("where (A.PROGR_RICLASSIFICAZIONI = ~~PQRY_RICLASSIFIC1.PROGRESSIVO~~) ");
      SQL.append("and   (A.E_S = ~~PQRY_CAPTER1.E_S~~) ");
      SQL.append("and   (B.E_S(+) = A.E_S) ");
      SQL.append("and   (B.CODICE = A.CODICE_GESTIONALE) ");
      SQL.append("and   (C.PROGRESSIVO = A.PROGR_RICLASSIFICAZIONI) ");
      SQL.append("and   (D.E_S(+) = ~~PQRY_CAPTER1.E_S~~) ");
      SQL.append("and   (D.CAPITOLO(+) = C.COD_TERZI) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE_GESTIONALE ");
      BUK_RICLGESTBOOK.SetReportQuery(BUK_RICLGESTBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "CB1894C2-8A91-4FD4-9951-CD2F4F950054");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RICLGESTBOOK_RPT_NEWREPORT_Init()
  {
    BUK_RICLGESTBOOK.InitReport(BUK_RICLGESTBOOK_RPT_NEWREPORT, 196609);
    BUK_RICLGESTBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPT_NEWREPORT, "62E550A9-8837-4082-A69A-0999EF157873");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_REPORTHEADER, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_REPORTHEADER, "5C9456EB-B67A-495C-BBD1-E5F2426A20B7");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_TITOLOHEADER, 2200, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 10027265, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_TITOLOHEADER, BUK_RICLGESTBOOK_RPTBOX_PAGEHEADER);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_TITOLOHEADER, "52848C73-6D04-41A2-A152-D3E48E797FB1");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_TITOLOHEADER, "TITOLOHEADER");
    BUK_RICLGESTBOOK.InitReportBox(BUK_RICLGESTBOOK_SEC_TITOLOHEADER, BUK_RICLGESTBOOK_RPTBOX_TITOLO, 100, 100, 18800, 800, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_TITOLO, "10416CFF-633F-424F-8530-195E21B161BC");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_TITOLO, "TITOLO");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_TITOLO, BUK_RICLGESTBOOK_SPAN_RICLASSIFICA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Riclassificazione Gestione", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_RICLASSIFICA, "49BDCD92-2402-4DBD-8F07-42AD08A8991A");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_RICLASSIFICA, "RICLASSIFICA");
    BUK_RICLGESTBOOK.InitReportBox(BUK_RICLGESTBOOK_SEC_TITOLOHEADER, BUK_RICLGESTBOOK_RPTBOX_SOTTOTITOLO, 0, 900, 19000, 1300, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_SOTTOTITOLO, "CC52EE5D-ABD5-4D3E-AB02-A5714F214807");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_SOTTOTITOLO, "SOTTOTITOLO");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_SOTTOTITOLO, BUK_RICLGESTBOOK_SPAN_SOTTOTITOLO, MyGlb.VIS_TITOLOREPORT, 5, 255, 0, 271319169, "", "", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_SOTTOTITOLO, "BC176CB8-7518-40EC-AA70-F60AB4A357CD");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_SOTTOTITOLO, "SOTTOTITOLO");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_PAGEHEADER, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_PAGEHEADER, "1D25268B-72D1-48E7-A55F-DBA5E3AF6709");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_RICLGESTBOOK.InitReportBox(BUK_RICLGESTBOOK_SEC_PAGEHEADER, BUK_RICLGESTBOOK_RPTBOX_CODIGESTHEAD, 0, 0, 19000, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_CODIGESTHEAD, "22BF090C-57E6-468B-9E86-7F1977D1F88C");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_CODIGESTHEAD, "CODIGESTHEAD");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_CODIGESTHEAD, BUK_RICLGESTBOOK_SPAN_CODICEGESTIO, MyGlb.VIS_INTSENBORCE1, 5, 99, 0, 271319425, "", "", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_CODICEGESTIO, "532F1228-9A40-4F3E-9D54-372C04BC3E52");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_CODICEGESTIO, "CODICEGESTIO");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_DETAIL, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_DETAIL, "E4F0A6BE-5270-49DF-8BFF-E8B66F20BA6A");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_DETAIL, "DETAIL");
    BUK_RICLGESTBOOK.InitReportBox(BUK_RICLGESTBOOK_SEC_DETAIL, BUK_RICLGESTBOOK_RPTBOX_CODICEGESTIO, 0, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_CODICEGESTIO, "EAABE824-F1C9-4CC4-AF15-A68A75813A58");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_CODICEGESTIO, "CODICEGESTIO");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_CODICEGESTIO, BUK_RICLGESTBOOK_SPAN_RIGECGCCTRGB, MyGlb.VIS_CAMSENBORCEN, 1, 4, 0, 271384705, "Brief description of field content.", "::RICGESCODGES", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_RIGECGCCTRGB, "0ED8E207-2167-433E-A50D-C2327D05C629");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_RIGECGCCTRGB, "RIGECGCCTRGB");
    BUK_RICLGESTBOOK.InitReportBox(BUK_RICLGESTBOOK_SEC_DETAIL, BUK_RICLGESTBOOK_RPTBOX_DESCRIZIONE, 1400, 0, 17600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_RPTBOX_DESCRIZIONE, "D9D5F0E3-41FF-4DB6-B483-BA38508C4F04");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_RICLGESTBOOK.InitBoxSpan(BUK_RICLGESTBOOK_RPTBOX_DESCRIZIONE, BUK_RICLGESTBOOK_SPAN_RIGCGDCCTRGB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::RICGESCOGEDE", 1);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SPAN_RIGCGDCCTRGB, "AF6B1805-5D73-440E-99FF-779CB692215D");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SPAN_RIGCGDCCTRGB, "RIGCGDCCTRGB");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_PAGEFOOTER, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_PAGEFOOTER, "95345ECF-FF31-4B1C-8F75-7695A310B531");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_RICLGESTBOOK.InitSection(BUK_RICLGESTBOOK_RPT_NEWREPORT, BUK_RICLGESTBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RICLGESTBOOK.SetSectionRendersInto(BUK_RICLGESTBOOK_SEC_REPORTFOOTER, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
    BUK_RICLGESTBOOK.SetRTCGuid(BUK_RICLGESTBOOK_SEC_REPORTFOOTER, "362ACFB2-B5A1-457A-BEA3-B6EE79515933");
    BUK_RICLGESTBOOK.SetObjCode(BUK_RICLGESTBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_RICLGESTBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_RICLGESTBOOK_InitLinks()
  {
    BUK_RICLGESTBOOK.SetBoxNextBox(BUK_RICLGESTBOOK_RPTBOX_PAGEBODY, BUK_RICLGESTBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RICLASGESTIO) PAN_RICLASGESTIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_ValidateRow(Cancel);
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_ValidateRow(Cancel);
    if (SrcObj == PAN_RICLASGESTIO) PAN_RICLASGESTIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_DynamicProperties();
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_DynamicProperties();
    if (SrcObj == PAN_RICLASGESTIO) PAN_RICLASGESTIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RICLASGESTIO) PAN_RICLASGESTIO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_OnChangeRow();
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
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CONTOTERZI) PAN_CONTOTERZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_RICLASSIFICA) PAN_RICLASSIFICA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_RICLASGESTIO) PAN_RICLASGESTIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_CAPCONTETAVI) TAB_CAPCONTETAVI_Click(PreviousPage, Cancel);
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
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTTERZBOOK) BUK_CONTTERZBOOK_OnPreview();
    if (SrcObj == BKW_RICLGESTBOOK) BUK_RICLGESTBOOK_OnPreview();
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
