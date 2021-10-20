// **********************************************
// Voci Patto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VociPatto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_TIPOSTAMPA1 = 0;

  private static int PPQRY_PARAM96 = 0;

  private static int PPQRY_TIPISTAMPA = 1;


  IDPanel PAN_PARAM;
  OTabView TAB_TAB;
  private static int GRP_ENTRATA_DASOMMASOTT1 = 0;

  private static int PFL_ENTRATA_VOCE1 = 0;
  private static int PFL_ENTRATA_ESERCIZIO1 = 1;
  private static int PFL_ENTRATA_TIPOSTAMPA2 = 2;
  private static int PFL_ENTRATA_ES1 = 3;
  private static int PFL_ENTRATA_DESCRIZIONE1 = 4;
  private static int PFL_ENTRATA_CAPITACORRE1 = 5;
  private static int PFL_ENTRATA_MODIFICABIL1 = 6;
  private static int PFL_ENTRATA_DAVISUALIZZ1 = 7;
  private static int PFL_ENTRATA_SEQUENZA1 = 8;
  private static int PFL_ENTRATA_TIPOVOCE1 = 9;

  private static int PPQRY_VOCIPS4 = 0;


  IDPanel PAN_ENTRATA;
  private static int GRP_SPESA_DASOMMASOTTR = 0;

  private static int PFL_SPESA_VOCE = 0;
  private static int PFL_SPESA_ESERCIZIO = 1;
  private static int PFL_SPESA_TIPOSTAMPA = 2;
  private static int PFL_SPESA_ES = 3;
  private static int PFL_SPESA_DESCRIZIONE = 4;
  private static int PFL_SPESA_CAPITACORREN = 5;
  private static int PFL_SPESA_MODIFICABILE = 6;
  private static int PFL_SPESA_DAVISUALIZZA = 7;
  private static int PFL_SPESA_SEQUENZA = 8;
  private static int PFL_SPESA_TIPOVOCE = 9;

  private static int PPQRY_VOCIPS5 = 0;


  IDPanel PAN_SPESA;
  CIDREObj BUK_ENTRATABOOK;
  OBook BKW_ENTRATABOOK;
  //
  // Template Pages constants
  private static int BUK_ENTRATABOOK_MST_ENTRBOOKPAGE = 1;
  private static int BUK_ENTRATABOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ENTRATABOOK_SPAN_TSEBVPPNTSEB = 3;
  private static int BUK_ENTRATABOOK_RPTBOX_PAGEHEADER2 = 4;
  private static int BUK_ENTRATABOOK_RPTBOX_PAGEBODY1 = 5;
  private static int BUK_ENTRATABOOK_RPTBOX_PAGEFOOTER1 = 6;

  //
  // Reports constants
  private static int BUK_ENTRATABOOK_RPT_REPORTENTRAT = 7;
  private static int BUK_ENTRATABOOK_SEC_REPORTHEADER = 8;
  private static int BUK_ENTRATABOOK_RPTBOX_CODICEHEADE1 = 9;
  private static int BUK_ENTRATABOOK_SPAN_VOCE1 = 10;
  private static int BUK_ENTRATABOOK_RPTBOX_DESCRIHEADE1 = 11;
  private static int BUK_ENTRATABOOK_SPAN_DESCRIZIONE1 = 12;
  private static int BUK_ENTRATABOOK_RPTBOX_CAPICORRHEA1 = 13;
  private static int BUK_ENTRATABOOK_SPAN_C5 = 14;
  private static int BUK_ENTRATABOOK_RPTBOX_MODIFIHEADE1 = 15;
  private static int BUK_ENTRATABOOK_SPAN_C6 = 16;
  private static int BUK_ENTRATABOOK_RPTBOX_DAVISUAHEAD1 = 17;
  private static int BUK_ENTRATABOOK_SPAN_C7 = 18;
  private static int BUK_ENTRATABOOK_RPTBOX_SEQUENHEADE1 = 19;
  private static int BUK_ENTRATABOOK_SPAN_C8 = 20;
  private static int BUK_ENTRATABOOK_RPTBOX_TIPOVOCEHEA1 = 21;
  private static int BUK_ENTRATABOOK_SPAN_C9 = 22;
  private static int BUK_ENTRATABOOK_SEC_PAGEHEADER = 23;
  private static int BUK_ENTRATABOOK_RPTBOX_TITOLO1 = 24;
  private static int BUK_ENTRATABOOK_SPAN_ELENVOCIPAT1 = 25;
  private static int BUK_ENTRATABOOK_SPAN_TIPOSTAMPA1 = 26;
  private static int BUK_ENTRATABOOK_SPAN_ENTRATA = 27;
  private static int BUK_ENTRATABOOK_SEC_DETAIL = 28;
  private static int BUK_ENTRATABOOK_RPTBOX_CODICE1 = 29;
  private static int BUK_ENTRATABOOK_SPAN_VOPSVOVOPAEB = 30;
  private static int BUK_ENTRATABOOK_RPTBOX_DESCRIZIONE1 = 31;
  private static int BUK_ENTRATABOOK_SPAN_VOPSDEVOPAEB = 32;
  private static int BUK_ENTRATABOOK_RPTBOX_CAPITACORRE1 = 33;
  private static int BUK_ENTRATABOOK_SPAN_CAPITACORRE2 = 34;
  private static int BUK_ENTRATABOOK_RPTBOX_MODIFICABIL1 = 35;
  private static int BUK_ENTRATABOOK_SPAN_MODIFICABIL2 = 36;
  private static int BUK_ENTRATABOOK_RPTBOX_DAVISUALIZZ1 = 37;
  private static int BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN = 38;
  private static int BUK_ENTRATABOOK_RPTBOX_SEQUENZA1 = 39;
  private static int BUK_ENTRATABOOK_SPAN_SEQUENZA2 = 40;
  private static int BUK_ENTRATABOOK_RPTBOX_TIPOVOCE1 = 41;
  private static int BUK_ENTRATABOOK_SPAN_TIPOVOCE2 = 42;
  private static int BUK_ENTRATABOOK_SEC_PAGEFOOTER = 43;
  private static int BUK_ENTRATABOOK_SEC_REPORTFOOTER = 44;

  CIDREObj BUK_SPESABOOK;
  OBook BKW_SPESABOOK;
  //
  // Template Pages constants
  private static int BUK_SPESABOOK_MST_SPESBOOKPAGE = 1;
  private static int BUK_SPESABOOK_RPTBOX_NUMEROPAGINE = 2;
  private static int BUK_SPESABOOK_SPAN_TSSBVPPNTSSB = 3;
  private static int BUK_SPESABOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SPESABOOK_RPTBOX_PAGEBODY = 5;
  private static int BUK_SPESABOOK_RPTBOX_PAGEFOOTER = 6;

  //
  // Reports constants
  private static int BUK_SPESABOOK_RPT_REPORTSPESA = 7;
  private static int BUK_SPESABOOK_SEC_REPORTHEADER = 8;
  private static int BUK_SPESABOOK_RPTBOX_CODICEHEADER = 9;
  private static int BUK_SPESABOOK_SPAN_VOCE = 10;
  private static int BUK_SPESABOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_SPESABOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_SPESABOOK_RPTBOX_CAPICORRHEAD = 13;
  private static int BUK_SPESABOOK_SPAN_C1 = 14;
  private static int BUK_SPESABOOK_RPTBOX_MODIFIHEADER = 15;
  private static int BUK_SPESABOOK_SPAN_C2 = 16;
  private static int BUK_SPESABOOK_RPTBOX_DAVISUAHEADE = 17;
  private static int BUK_SPESABOOK_SPAN_C3 = 18;
  private static int BUK_SPESABOOK_RPTBOX_SEQUENHEADER = 19;
  private static int BUK_SPESABOOK_SPAN_C4 = 20;
  private static int BUK_SPESABOOK_RPTBOX_TIPOVOCEHEAD = 21;
  private static int BUK_SPESABOOK_SPAN_C = 22;
  private static int BUK_SPESABOOK_SEC_PAGEHEADER = 23;
  private static int BUK_SPESABOOK_RPTBOX_TITOLO = 24;
  private static int BUK_SPESABOOK_SPAN_ELENVOCIPATT = 25;
  private static int BUK_SPESABOOK_SPAN_TIPOSTAMPA = 26;
  private static int BUK_SPESABOOK_SPAN_SPESE = 27;
  private static int BUK_SPESABOOK_SEC_DETAIL = 28;
  private static int BUK_SPESABOOK_RPTBOX_CODICE = 29;
  private static int BUK_SPESABOOK_SPAN_VOPSVOVOPEB1 = 30;
  private static int BUK_SPESABOOK_RPTBOX_DESCRIZIONE = 31;
  private static int BUK_SPESABOOK_SPAN_VOPSDEVOPEB1 = 32;
  private static int BUK_SPESABOOK_RPTBOX_CAPITACORREN = 33;
  private static int BUK_SPESABOOK_SPAN_CAPITACORREN = 34;
  private static int BUK_SPESABOOK_RPTBOX_MODIFICABILE = 35;
  private static int BUK_SPESABOOK_SPAN_MODIFICABILE = 36;
  private static int BUK_SPESABOOK_RPTBOX_DAVISUALIZZA = 37;
  private static int BUK_SPESABOOK_SPAN_NUVVPDVVPSBN = 38;
  private static int BUK_SPESABOOK_RPTBOX_SEQUENZA = 39;
  private static int BUK_SPESABOOK_SPAN_SEQUENZA = 40;
  private static int BUK_SPESABOOK_RPTBOX_TIPOVOCE = 41;
  private static int BUK_SPESABOOK_SPAN_TIPOVOCE = 42;
  private static int BUK_SPESABOOK_SEC_PAGEFOOTER = 43;
  private static int BUK_SPESABOOK_SEC_REPORTFOOTER = 44;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM78(IMDB);
    //
    //
    Init_PQRY_PARAM96(IMDB);
    Init_PQRY_PARAM96_RS(IMDB);
    Init_PQRY_VOCIPS4(IMDB);
    Init_PQRY_VOCIPS5(IMDB);
    Init_PQRY_VOCIPS6(IMDB);
    Init_PQRY_VOCIPS7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM78(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAM78, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAM78, "TBL_PARAM78");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM78,IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM78,IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA,5,49,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAM78, 0);
  }

  private static void Init_PQRY_PARAM96(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM96, 1);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM96, "PQRY_PARAM96");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM96,IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM96,IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA,5,49,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAM96, 0);
  }

  private static void Init_PQRY_PARAM96_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM96_RS, 1);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM96_RS, "PQRY_PARAM96_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM96_RS,IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM96_RS,IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA,5,49,0);
  }

  private static void Init_PQRY_VOCIPS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VOCIPS4, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_VOCIPS4, "PQRY_VOCIPS4");
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_TIPO_STAMPA,5,3,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_CODICE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_CAPITALE_CORRENTE, "CAPITALE_CORRENTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_CAPITALE_CORRENTE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_MODIFICABILE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_DA_VISUALIZZARE, "DA_VISUALIZZARE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_DA_VISUALIZZARE,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_SEQUENZA,1,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_TIPO_VOCE, "TIPO_VOCE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS4,IMDBDef16.PQSL_VOCIPS4_TIPO_VOCE,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VOCIPS4, 0);
  }

  private static void Init_PQRY_VOCIPS5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VOCIPS5, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_VOCIPS5, "PQRY_VOCIPS5");
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_TIPO_STAMPA,5,3,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_CODICE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_CAPITALE_CORRENTE, "CAPITALE_CORRENTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_CAPITALE_CORRENTE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_MODIFICABILE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_DA_VISUALIZZARE, "DA_VISUALIZZARE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_DA_VISUALIZZARE,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_SEQUENZA,1,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_TIPO_VOCE, "TIPO_VOCE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS5,IMDBDef16.PQSL_VOCIPS5_TIPO_VOCE,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VOCIPS5, 0);
  }

  private static void Init_PQRY_VOCIPS6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VOCIPS6, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_VOCIPS6, "PQRY_VOCIPS6");
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_TIPO_STAMPA,5,3,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_CODICE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_CAPITALE_CORRENTE, "CAPITALE_CORRENTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_CAPITALE_CORRENTE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_MODIFICABILE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_DA_VISUALIZZARE, "DA_VISUALIZZARE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_DA_VISUALIZZARE,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_SEQUENZA,1,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_TIPO_VOCE, "TIPO_VOCE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS6,IMDBDef16.PQSL_VOCIPS6_TIPO_VOCE,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VOCIPS6, 0);
  }

  private static void Init_PQRY_VOCIPS7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VOCIPS7, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_VOCIPS7, "PQRY_VOCIPS7");
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_TIPO_STAMPA,5,3,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_CODICE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_CAPITALE_CORRENTE, "CAPITALE_CORRENTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_CAPITALE_CORRENTE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_MODIFICABILE,5,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_DA_VISUALIZZARE, "DA_VISUALIZZARE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_DA_VISUALIZZARE,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_SEQUENZA,1,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_TIPO_VOCE, "TIPO_VOCE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VOCIPS7,IMDBDef16.PQSL_VOCIPS7_TIPO_VOCE,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VOCIPS7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VociPatto(MyWebEntryPoint w, IMDBObj imdb)
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
  public VociPatto()
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
    FormIdx = MyGlb.FRM_VOCIPATTO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "52E97025-9C0B-4512-921B-0CF30370B110";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 772;
    DesignHeight = 486;
    set_Caption(new IDVariant("Voci Patto"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 772;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.156522;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 772;
    Frames[2].Height = 72;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 72;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 72-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F8B151B2-C998-46ED-B8B0-FA22C149A9DF");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 400, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 772;
    Frames[3].Height = 388;
    Frames[3].Caption = "Tab";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 388;
    TAB_TAB = new OTabView(this);
    Frames[3].Content = TAB_TAB;
    TAB_TAB.iGuid = "DE01CE7A-5417-4732-8A3F-692A56DE2495";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Entrata";
    Frames[4].Parent = this;
    PAN_ENTRATA = new IDPanel(w, this, 4, "PAN_ENTRATA");
    Frames[4].Content = PAN_ENTRATA;
    PAN_ENTRATA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ENTRATA.VS = MainFrm.VisualStyleList;
    PAN_ENTRATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_ENTRATABOOK != null)
      PAN_ENTRATA.SetBook(BUK_ENTRATABOOK);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D2300E8A-109C-4B1C-9092-43628F61FC20");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ENTRATA.InitStatus = 2;
    PAN_ENTRATA_Init();
    PAN_ENTRATA_InitFields();
    PAN_ENTRATA_InitQueries();
    TAB_TAB.SetItem(1, Frames[4], 0, "", "Entrata", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Spesa";
    Frames[5].Parent = this;
    PAN_SPESA = new IDPanel(w, this, 5, "PAN_SPESA");
    Frames[5].Content = PAN_SPESA;
    PAN_SPESA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SPESA.VS = MainFrm.VisualStyleList;
    PAN_SPESA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_SPESABOOK != null)
      PAN_SPESA.SetBook(BUK_SPESABOOK);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B12A0B06-43F8-4C55-A6BE-1E57883CA5EF");
    PAN_SPESA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 252, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_SPESA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SPESA.InitStatus = 2;
    PAN_SPESA_Init();
    PAN_SPESA_InitFields();
    PAN_SPESA_InitQueries();
    TAB_TAB.SetItem(2, Frames[5], 0, "", "Spesa", "");
    BKW_ENTRATABOOK = new OBook(this);
    BUK_ENTRATABOOK = new CIDREObj(BKW_ENTRATABOOK);
    BKW_ENTRATABOOK.iGuid = "0852D067-892D-4BCC-A1A9-E34A17674E32";
    BKW_ENTRATABOOK.Code = "BUK_ENTRATABOOK";
    BKW_ENTRATABOOK.BookObj = BUK_ENTRATABOOK;
    BKW_ENTRATABOOK.InitDefMasks();
    BUK_ENTRATABOOK.InitBook(1, 1245185, "Entrata Book", IMDB, MainFrm.VisualStyleList);
    BUK_ENTRATABOOK.InitHTML();
    BUK_ENTRATABOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ENTRATABOOK.Book.SetMainFrm(MainFrm);
    BUK_ENTRATABOOK.SetRTCGuid(0, "0852D067-892D-4BCC-A1A9-E34A17674E32");
    BUK_ENTRATABOOK.SetObjCode(0, "ENTRATABOOK");
    if (PAN_ENTRATA != null)
      PAN_ENTRATA.SetBook(BUK_ENTRATABOOK);
    BUK_ENTRATABOOK_MST_ENTRBOOKPAGE_Init();
    BUK_ENTRATABOOK_RPT_REPORTENTRAT_Init();
    BUK_ENTRATABOOK_InitLinks();
    BKW_SPESABOOK = new OBook(this);
    BUK_SPESABOOK = new CIDREObj(BKW_SPESABOOK);
    BKW_SPESABOOK.iGuid = "9A1CE5F3-5559-4B46-B1A5-8232FD7EBC31";
    BKW_SPESABOOK.Code = "BUK_SPESABOOK";
    BKW_SPESABOOK.BookObj = BUK_SPESABOOK;
    BKW_SPESABOOK.InitDefMasks();
    BUK_SPESABOOK.InitBook(1, 1245185, "Spesa Book", IMDB, MainFrm.VisualStyleList);
    BUK_SPESABOOK.InitHTML();
    BUK_SPESABOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SPESABOOK.Book.SetMainFrm(MainFrm);
    BUK_SPESABOOK.SetRTCGuid(0, "9A1CE5F3-5559-4B46-B1A5-8232FD7EBC31");
    BUK_SPESABOOK.SetObjCode(0, "SPESABOOK");
    if (PAN_SPESA != null)
      PAN_SPESA.SetBook(BUK_SPESABOOK);
    BUK_SPESABOOK_MST_SPESBOOKPAGE_Init();
    BUK_SPESABOOK_RPT_REPORTSPESA_Init();
    BUK_SPESABOOK_InitLinks();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAM78, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VOCIPATTO_PARAM96();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_ENTRATA.UpdatePanel(MainFrm);
      PAN_SPESA.UpdatePanel(MainFrm);
      // BUK_ENTRATABOOK.UpdateBook();
      // BUK_SPESABOOK.UpdateBook();
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
    if (Code.equals("BUK_ENTRATABOOK")) return BUK_ENTRATABOOK;
    if (Code.equals("BUK_SPESABOOK")) return BUK_SPESABOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VociPatto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VociPatto.class.getName() : (Glb.ClassWithPackage(VociPatto.class) ? VociPatto.class.getName().substring(VociPatto.class.getPackage().getName().length() + 1) : VociPatto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Before Update Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ENTRATA.Status()).equals((new IDVariant(3)), true) || new IDVariant(PAN_SPESA.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Ci sono modifiche in sospeso. Salvare o annullare le modifiche.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "ParamBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Entrata On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ENTRATA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ENTRATA);
      // 
      // Entrata On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_DESCRIZIONE1,IMDB.Value(IMDBDef16.PQRY_VOCIPS4, IMDBDef16.PQSL_VOCIPS4_DESCRIZIONE, 0).stringValue()); 
      if (!(PAN_ENTRATA.IsNewRow()))
      {
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_VOCE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_VOCE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "EntrataOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Entrata Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_ENTRATA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS4, IMDBDef16.PQSL_VOCIPS4_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS4, IMDBDef16.PQSL_VOCIPS4_TIPO_STAMPA, 0, IMDB.Value(IMDBDef16.PQRY_PARAM96, IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA, 0));
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS4, IMDBDef16.PQSL_VOCIPS4_E_S, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "EntrataBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Spesa On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SPESA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SPESA);
      // 
      // Spesa On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_DESCRIZIONE,IMDB.Value(IMDBDef16.PQRY_VOCIPS5, IMDBDef16.PQSL_VOCIPS5_DESCRIZIONE, 0).stringValue()); 
      if (!(PAN_SPESA.IsNewRow()))
      {
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_VOCE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_VOCE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "SpesaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Spesa Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_SPESA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS5, IMDBDef16.PQSL_VOCIPS5_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS5, IMDBDef16.PQSL_VOCIPS5_TIPO_STAMPA, 0, IMDB.Value(IMDBDef16.PQRY_PARAM96, IMDBDef16.PQSL_PARAM96_ROWNAMTIPSTA, 0));
      IMDB.set_Value(IMDBDef16.PQRY_VOCIPS5, IMDBDef16.PQSL_VOCIPS5_E_S, 0, (new IDVariant("S")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "SpesaBeforeInsertEvent", _e);
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
      IDVariant v_VMINCODICE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPSTACOD ");
      SQL.append("from ");
      SQL.append("  TIPI_STAMPA A ");
      SQL.append("where (A.CODICE LIKE 'PS%') ");
      SQL.append("and   (NVL(A.ESERCIZIO, " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VMINCODICE = QV.Get("MINTIPSTACOD", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_PARAM78, IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA, 0, new IDVariant(v_VMINCODICE));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociPatto", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("VociPatto", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAM78, IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA, 0, new IDVariant());
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void VOCIPATTO_PARAM96() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAM96_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM78, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAM78, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAM96_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAM96_RS, 0, IMDBDef6.TBL_PARAM78, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM96_RS, 0, 0, IMDBDef6.TBL_PARAM78, IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAM78, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAM78, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM78, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAM96_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ENTRATA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ENTRATA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ENTRATA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ENTRATA, Cancel);
    // Stub
  }

  private void PAN_ENTRATA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ENTRATA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ENTRATA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ENTRATA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SPESA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SPESA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SPESA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SPESA, Cancel);
    // Stub
  }

  private void PAN_SPESA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SPESA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SPESA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SPESA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ENTRATABOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ENTRATABOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ENTRATABOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ENTRATABOOK_SEC_PAGEHEADER)
    {
      BUK_ENTRATABOOK.set_SpanValue(BUK_ENTRATABOOK_SPAN_TIPOSTAMPA1, new IDVariant(IDL.Add((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_TIPOSTAMPA1))), (new IDVariant(" - ")))));
    }
    if (SectionID==BUK_ENTRATABOOK_SEC_DETAIL)
    {
      BUK_ENTRATABOOK.set_SpanValue(BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, new IDVariant(IDL.NullValue(BUK_ENTRATABOOK.GetReportColumn(BUK_ENTRATABOOK_RPT_REPORTENTRAT, "DA_VISUALIZZARE"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_ENTRATABOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ENTRATABOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ENTRATABOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ENTRATABOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ENTRATABOOK_MST_ENTRBOOKPAGE)
    {
      BUK_ENTRATABOOK.set_SpanValue(BUK_ENTRATABOOK_SPAN_TSEBVPPNTSEB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_ENTRATABOOK.GetPageNumber()))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_ENTRATABOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ENTRATABOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ENTRATABOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ENTRATABOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ENTRATABOOK_OnPreview()
  {
    PreviewBook = BKW_ENTRATABOOK;
    SetRD();
  }

  private void BUK_SPESABOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SPESABOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SPESABOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SPESABOOK_SEC_PAGEHEADER)
    {
      BUK_SPESABOOK.set_SpanValue(BUK_SPESABOOK_SPAN_TIPOSTAMPA, new IDVariant(IDL.Add((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_TIPOSTAMPA1))), (new IDVariant(" - ")))));
    }
    if (SectionID==BUK_SPESABOOK_SEC_DETAIL)
    {
      BUK_SPESABOOK.set_SpanValue(BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, new IDVariant(IDL.NullValue(BUK_SPESABOOK.GetReportColumn(BUK_SPESABOOK_RPT_REPORTSPESA, "DA_VISUALIZZARE"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_SPESABOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SPESABOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SPESABOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SPESABOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SPESABOOK_MST_SPESBOOKPAGE)
    {
      BUK_SPESABOOK.set_SpanValue(BUK_SPESABOOK_SPAN_TSSBVPPNTSSB, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_SPESABOOK.GetPageNumber()))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_SPESABOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SPESABOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SPESABOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SPESABOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SPESABOOK_OnPreview()
  {
    PreviewBook = BKW_SPESABOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, "E2E3AC4E-0980-48C8-8FE8-3F3F477E60CB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, "Tipo Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_LIST, "Tipo Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_FORM, 96, 16, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSTAMPA1, MyGlb.PANEL_FORM, "Tipo Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOSTAMPA1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOSTAMPA1, PPQRY_PARAM96, "A.ROWNAMTIPSTA", "ROWNAMTIPSTA", 5, 49, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPISTAMCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPISTAMDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPSTA~~) ");
    SQL.append("and   (A.CODICE LIKE 'PS%') ");
    SQL.append("and   (NVL(A.ESERCIZIO, ~~TBL_DATISESSIONE.SESSIOESERCI~~) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMPA, 0, SQL, PFL_PARAM_TIPOSTAMPA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPISTAMCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPISTAMDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPA A ");
    SQL.append("where (A.CODICE LIKE 'PS%') ");
    SQL.append("and   (NVL(A.ESERCIZIO, ~~TBL_DATISESSIONE.SESSIOESERCI~~) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMPA, 1, SQL, PFL_PARAM_TIPOSTAMPA1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMPA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM96", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM96, IMDBDef16.PQRY_PARAM96_RS, IMDBDef6.TBL_PARAM78);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOSTAMPA1, IMDBDef6.FLD_PARAM78_ROWNAMTIPSTA);
    PAN_PARAM.SetMasterTable(0, "PARAM78");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ENTRATA_Init()
  {

    PAN_ENTRATA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, "9FD73FC4-2B41-4CBB-97E8-F769BC5FD770");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, "Da Sommare/Sottrarre");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, 0, 132);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, 1, 13);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, 0, 4);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, 1, 4);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATA_DASOMMASOTT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, "4B735DFC-BA52-4CA6-92EA-B00642A9883F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, "Voce");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, "64FA025D-61C1-4082-ACCD-D13B940A3148");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, "ESERCIZIO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, "156EF88F-6C1C-4201-BEB8-65E19890A5A0");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, "TIPO STAMPA");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, "6DFC7EFD-4F22-4DF5-B4CE-5002B668B065");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, "E S");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.VIS_NONNULLAFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, 0, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, "419C887C-091C-4994-B6E9-09610A0CDC91");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, "Descrizione");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, "FD565BFD-FA8B-418B-AAB1-496A794C6719");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, "Capitale/ Corrente");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, "D00D2831-68B3-45D2-9A78-7752302B770E");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, "Modificabile");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, "5505056C-6DA8-4DD3-967D-1C0937124653");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, "Da Visualizzare");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.VIS_CHECKSTYLE);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, "281D0066-3BA6-46F1-86A9-5A349AEA439D");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, "Sequenza");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, "0D2F1BE1-A2AD-4059-A367-A7917920DF3A");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, "Tipo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ENTRATA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_LIST, 0, 52, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_LIST, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_LIST, "Voce");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_VOCE1, MyGlb.PANEL_FORM, "Voce");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_VOCE1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_VOCE1, PPQRY_VOCIPS4, "A.CODICE", "CODICE", 5, 5, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_LIST, 52, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ESERCIZIO1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ESERCIZIO1, PPQRY_VOCIPS4, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_LIST, 52, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_LIST, 76);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_LIST, "TP. STM.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOSTAMPA2, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TIPOSTAMPA2, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TIPOSTAMPA2, PPQRY_VOCIPS4, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 3, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_LIST, 52, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_LIST, 24);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ES1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ES1, PPQRY_VOCIPS4, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_LIST, 52, 52, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_LIST, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 100, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DESCRIZIONE1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DESCRIZIONE1, PPQRY_VOCIPS4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_LIST, 300, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_LIST, 124);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_LIST, "Capitale/ Corrente");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_FORM, 124);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITACORRE1, MyGlb.PANEL_FORM, "Capitale/ Corrente");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CAPITACORRE1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CAPITACORRE1, PPQRY_VOCIPS4, "A.CAPITALE_CORRENTE", "CAPITALE_CORRENTE", 5, 5, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_CAPITACORRE1, (new IDVariant("CAP")), "Capitale", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_CAPITACORRE1, (new IDVariant("CORR")), "Corrente", "", "", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_LIST, 376, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_LIST, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_LIST, "Modificabile");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_FORM, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABIL1, MyGlb.PANEL_FORM, "Modificabile");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_MODIFICABIL1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_MODIFICABIL1, PPQRY_VOCIPS4, "A.MODIFICABILE", "MODIFICABILE", 5, 5, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_MODIFICABIL1, (new IDVariant("NO")), "Mai", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_MODIFICABIL1, (new IDVariant("SI")), "Sempre", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_MODIFICABIL1, (new IDVariant("SS")), "Solo in Simulazione", "", "", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_LIST, 496, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_LIST, 112);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_LIST, "Da Visualizzare");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_FORM, 4, 268, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_FORM, 112);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DAVISUALIZZ1, MyGlb.PANEL_FORM, "Da Visualizzare");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DAVISUALIZZ1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DAVISUALIZZ1, PPQRY_VOCIPS4, "A.DA_VISUALIZZARE", "DA_VISUALIZZARE", 5, 2, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_DAVISUALIZZ1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_DAVISUALIZZ1, (new IDVariant()), "Null", "", "", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_LIST, 592, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_LIST, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_LIST, "Sequenza");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_FORM, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SEQUENZA1, MyGlb.PANEL_FORM, "Sequenza");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SEQUENZA1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SEQUENZA1, PPQRY_VOCIPS4, "A.SEQUENZA", "SEQUENZA", 1, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_LIST, 660, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_LIST, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_LIST, "Tipo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_FORM, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVOCE1, MyGlb.PANEL_FORM, "Tipo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TIPOVOCE1, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TIPOVOCE1, PPQRY_VOCIPS4, "A.TIPO_VOCE", "TIPO_VOCE", 5, 2, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_TIPOVOCE1, (new IDVariant("T")), "Totale", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_TIPOVOCE1, (new IDVariant("D")), "Dettaglio", "", "", -1);
  }

  private void PAN_ENTRATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ENTRATA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ENTRATA.SetIMDB(IMDB, "PQRY_VOCIPS4", true);
    PAN_ENTRATA.set_SetString(MyGlb.MASTER_ROWNAME, "VOCI PS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITALE_CORRENTE as CAPITALE_CORRENTE, ");
    SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
    SQL.append("  A.DA_VISUALIZZARE as DA_VISUALIZZARE, ");
    SQL.append("  A.SEQUENZA as SEQUENZA, ");
    SQL.append("  A.TIPO_VOCE as TIPO_VOCE ");
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VOCI_PS A ");
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = DECODE(A.ESERCIZIO, 0, 0, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.TIPO_STAMPA = ~~PQRY_PARAM96.ROWNAMTIPSTA~~) ");
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_ENTRATA.SetQuery(PPQRY_VOCIPS4, 5, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_VOCIPS4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(0, "VOCI_PS");
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_SEQUENZA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ENTRATA.Status() == 2)
    {
      int oldListQBE = PAN_ENTRATA.iUseListQBE;
      PAN_ENTRATA.iUseListQBE = 0;
      PAN_ENTRATA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ENTRATA.PanelCommand(Glb.PCM_FIND);
      PAN_ENTRATA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SPESA_Init()
  {

    PAN_SPESA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SPESA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, "C444A613-9AAA-4FB9-9AA0-99E07BE56D0E");
    PAN_SPESA.set_Header(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, "Da Sommare/Sottrarre");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, 0, 132);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, 1, 13);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, 0, 4);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, 1, 4);
    PAN_SPESA.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESA_DASOMMASOTTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESA.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, "6CD6F02B-CFAB-4D8A-A646-706CD100508B");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, "Voce");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, "544C73C2-D2C5-4657-833E-A54EE0A814F4");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, "ESERCIZIO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, "D839ABA6-712F-4989-BF33-3D02D48A3EB2");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, "TIPO STAMPA");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ES, "CB378555-720D-4FA8-AC00-48C634F9653C");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ES, "E S");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ES, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ES, 0, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, "877D1EE3-4B89-45FA-8842-F435F3A44559");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, "Descrizione");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, "F655E7E2-5DE8-40A7-A834-ACFA0D5270BF");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, "Capitale/ Corrente");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, "A8491CA9-F20D-4284-8C3B-3BBB3EE0E875");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, "Modificabile");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, "D5D0CC3A-7538-4E47-B9E0-9156ACA04717");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, "Da Visualizzare");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.VIS_CHECKSTYLE);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, "698E3183-1F00-414C-91C7-A01A80460FEB");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, "Sequenza");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, "DB07E435-01CC-4580-B90B-1B0B6706958B");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, "Tipo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SPESA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_LIST, 0, 52, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_LIST, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_LIST, "Voce");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_VOCE, MyGlb.PANEL_FORM, "Voce");
    PAN_SPESA.SetFieldPage(PFL_SPESA_VOCE, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_VOCE, PPQRY_VOCIPS5, "A.CODICE", "CODICE", 5, 5, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_LIST, 52, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ESERCIZIO, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ESERCIZIO, PPQRY_VOCIPS5, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_LIST, 52, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_LIST, 76);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_LIST, "TP. STM.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TIPOSTAMPA, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TIPOSTAMPA, PPQRY_VOCIPS5, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 3, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_LIST, 52, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_LIST, 24);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_LIST, "E S");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ES, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ES, PPQRY_VOCIPS5, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_LIST, 52, 52, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DESCRIZIONE, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DESCRIZIONE, PPQRY_VOCIPS5, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_LIST, 300, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_LIST, 124);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_LIST, "Capitale/ Corrente");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_FORM, 124);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITACORREN, MyGlb.PANEL_FORM, "Capitale/ Corrente");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CAPITACORREN, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CAPITACORREN, PPQRY_VOCIPS5, "A.CAPITALE_CORRENTE", "CAPITALE_CORRENTE", 5, 5, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_CAPITACORREN, (new IDVariant("CAP")), "Capitale", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_CAPITACORREN, (new IDVariant("CORR")), "Corrente", "", "", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_LIST, 376, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_LIST, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_LIST, "Modificabile");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_FORM, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABILE, MyGlb.PANEL_FORM, "Modificabile");
    PAN_SPESA.SetFieldPage(PFL_SPESA_MODIFICABILE, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_MODIFICABILE, PPQRY_VOCIPS5, "A.MODIFICABILE", "MODIFICABILE", 5, 5, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_MODIFICABILE, (new IDVariant("NO")), "Mai", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_MODIFICABILE, (new IDVariant("SI")), "Sempre", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_MODIFICABILE, (new IDVariant("SS")), "Solo in Simulazione", "", "", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_LIST, 496, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_LIST, 112);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_LIST, "Da Visualizzare");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_FORM, 4, 268, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_FORM, 112);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DAVISUALIZZA, MyGlb.PANEL_FORM, "Da Visualizzare");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DAVISUALIZZA, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DAVISUALIZZA, PPQRY_VOCIPS5, "A.DA_VISUALIZZARE", "DA_VISUALIZZARE", 5, 2, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_DAVISUALIZZA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_DAVISUALIZZA, (new IDVariant()), "Null", "", "", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_LIST, 592, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_LIST, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_LIST, "Sequenza");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_FORM, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_SEQUENZA, MyGlb.PANEL_FORM, "Sequenza");
    PAN_SPESA.SetFieldPage(PFL_SPESA_SEQUENZA, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_SEQUENZA, PPQRY_VOCIPS5, "A.SEQUENZA", "SEQUENZA", 1, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_LIST, 660, 52, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_LIST, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_LIST, "Tipo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_FORM, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVOCE, MyGlb.PANEL_FORM, "Tipo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TIPOVOCE, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TIPOVOCE, PPQRY_VOCIPS5, "A.TIPO_VOCE", "TIPO_VOCE", 5, 2, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_TIPOVOCE, (new IDVariant("T")), "Totale", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_TIPOVOCE, (new IDVariant("D")), "Dettaglio", "", "", -1);
  }

  private void PAN_SPESA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SPESA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SPESA.SetIMDB(IMDB, "PQRY_VOCIPS5", true);
    PAN_SPESA.set_SetString(MyGlb.MASTER_ROWNAME, "VOCI PS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITALE_CORRENTE as CAPITALE_CORRENTE, ");
    SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
    SQL.append("  A.DA_VISUALIZZARE as DA_VISUALIZZARE, ");
    SQL.append("  A.SEQUENZA as SEQUENZA, ");
    SQL.append("  A.TIPO_VOCE as TIPO_VOCE ");
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VOCI_PS A ");
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = DECODE(A.ESERCIZIO, 0, 0, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.TIPO_STAMPA = ~~PQRY_PARAM96.ROWNAMTIPSTA~~) ");
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_SPESA.SetQuery(PPQRY_VOCIPS5, 5, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_VOCIPS5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(0, "VOCI_PS");
    PAN_SPESA.AddToSortList(PFL_SPESA_SEQUENZA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SPESA.Status() == 2)
    {
      int oldListQBE = PAN_SPESA.iUseListQBE;
      PAN_SPESA.iUseListQBE = 0;
      PAN_SPESA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SPESA.PanelCommand(Glb.PCM_FIND);
      PAN_SPESA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ENTRATABOOK_MST_ENTRBOOKPAGE_Init()
  {
    BUK_ENTRATABOOK.InitMastro(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, "64D516A4-056E-490C-B96B-D76C279F190F");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, "ENTRBOOKPAGE");
    BUK_ENTRATABOOK.InitMastroBox(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, BUK_ENTRATABOOK_RPTBOX_NUMEROPAGINA, 26400, 300, 2300, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_NUMEROPAGINA, "C7BD0DA7-629E-4EE3-957C-50223C64D226");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_NUMEROPAGINA, BUK_ENTRATABOOK_SPAN_TSEBVPPNTSEB, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "", "", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_TSEBVPPNTSEB, "2A465A19-0A80-48BE-8E99-45CDEFE3FC2A");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_TSEBVPPNTSEB, "TSEBVPPNTSEB");
    BUK_ENTRATABOOK.InitMastroBox(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, BUK_ENTRATABOOK_RPTBOX_PAGEHEADER2, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_PAGEHEADER2, "12996240-7BC3-4280-B333-46B9EA8279AF");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_PAGEHEADER2, "PAGEHEADER2");
    BUK_ENTRATABOOK.InitMastroBox(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, BUK_ENTRATABOOK_RPTBOX_PAGEBODY1, 1000, 3500, 27700, 16300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_PAGEBODY1, "5E03A02D-94D7-412E-8C5B-EB9AC46E3C1F");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_ENTRATABOOK.InitMastroBox(BUK_ENTRATABOOK_MST_ENTRBOOKPAGE, BUK_ENTRATABOOK_RPTBOX_PAGEFOOTER1, 1000, 20000, 27700, 200, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_PAGEFOOTER1, "B0DC0D59-3F8C-4937-91EB-F9385F5980AA");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_ENTRATABOOK_RPT_REPORTENTRAT_InitQuery() { BUK_ENTRATABOOK_RPT_REPORTENTRAT_InitQuery(true, true); }
  private void BUK_ENTRATABOOK_RPT_REPORTENTRAT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.CAPITALE_CORRENTE as CAPITALE_CORRENTE, ");
      SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
      SQL.append("  A.DA_VISUALIZZARE as DA_VISUALIZZARE, ");
      SQL.append("  A.SEQUENZA as SEQUENZA, ");
      SQL.append("  A.TIPO_VOCE as TIPO_VOCE ");
      SQL.append("from ");
      SQL.append("  VOCI_PS A ");
      SQL.append("where (A.ESERCIZIO = DECODE(A.ESERCIZIO, 0, 0, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.TIPO_STAMPA = ~~PQRY_PARAM96.ROWNAMTIPSTA~~) ");
      BUK_ENTRATABOOK.SetReportQuery(BUK_ENTRATABOOK_RPT_REPORTENTRAT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0ED35CCE-D2B4-4287-BAF6-D5D7A550D8DE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ENTRATABOOK_RPT_REPORTENTRAT_Init()
  {
    BUK_ENTRATABOOK.InitReport(BUK_ENTRATABOOK_RPT_REPORTENTRAT, 196865);
    BUK_ENTRATABOOK_RPT_REPORTENTRAT_InitQuery(true, false);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPT_REPORTENTRAT, "01811876-A8AA-411C-8B5B-27684FE18921");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPT_REPORTENTRAT, "REPORTENTRAT");
    BUK_ENTRATABOOK.InitSection(BUK_ENTRATABOOK_RPT_REPORTENTRAT, BUK_ENTRATABOOK_SEC_REPORTHEADER, 700, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ENTRATABOOK.SetSectionRendersInto(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_PAGEBODY1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SEC_REPORTHEADER, "082B4220-65ED-48DD-B133-F86C90261975");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_CODICEHEADE1, 0, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_CODICEHEADE1, "E64C6C02-4777-4F15-B7FB-904FFE18FC65");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_CODICEHEADE1, BUK_ENTRATABOOK_SPAN_VOCE1, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Voce", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_VOCE1, "9F257075-8B2B-47FB-8AFC-2C72B53F9580");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_VOCE1, "VOCE1");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_DESCRIHEADE1, 1400, 100, 14100, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_DESCRIHEADE1, "E07E7BCB-9073-4B69-A89A-64F1BAA60A47");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_DESCRIHEADE1, BUK_ENTRATABOOK_SPAN_DESCRIZIONE1, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_DESCRIZIONE1, "0AB737C3-F6D7-4256-A659-AEDE1CF6E2B0");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_CAPICORRHEA1, 15600, 100, 2800, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_CAPICORRHEA1, "F46652A0-DFF2-4312-912D-40AD6928FAD6");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_CAPICORRHEA1, "CAPICORRHEA1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_CAPICORRHEA1, BUK_ENTRATABOOK_SPAN_C5, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Capitale/ Corrente", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_C5, "7A80BDF3-EEF0-426B-877E-8BAE8672AB82");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_C5, "C5");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_MODIFIHEADE1, 18500, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_MODIFIHEADE1, "ACDDD398-A124-4F68-96CB-060279231C33");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_MODIFIHEADE1, "MODIFIHEADE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_MODIFIHEADE1, BUK_ENTRATABOOK_SPAN_C6, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Modificabile", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_C6, "58D2773D-3444-4B09-BA78-DB11D9141179");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_C6, "C6");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_DAVISUAHEAD1, 21200, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_DAVISUAHEAD1, "AF59B2BE-68BA-4A85-9914-FF8E570351D1");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_DAVISUAHEAD1, "DAVISUAHEAD1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_DAVISUAHEAD1, BUK_ENTRATABOOK_SPAN_C7, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Da Visualizzare", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_C7, "45494FA4-486C-47FA-B4F3-042573BD0623");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_C7, "C7");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_SEQUENHEADE1, 23900, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_SEQUENHEADE1, "17BE6944-E957-4E4C-968A-35BD650C6E6C");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_SEQUENHEADE1, "SEQUENHEADE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_SEQUENHEADE1, BUK_ENTRATABOOK_SPAN_C8, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Sequenza", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_C8, "5A12D144-D779-4ADB-86B8-C9FD30BE650F");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_C8, "C8");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_REPORTHEADER, BUK_ENTRATABOOK_RPTBOX_TIPOVOCEHEA1, 25700, 100, 1400, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_TIPOVOCEHEA1, "A9FDAEC6-284F-4F3D-A92D-DAAB2B5E5F63");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_TIPOVOCEHEA1, "TIPOVOCEHEA1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_TIPOVOCEHEA1, BUK_ENTRATABOOK_SPAN_C9, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Tipo", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_C9, "6444630F-F348-45EE-AAA9-24C59459738A");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_C9, "C9");
    BUK_ENTRATABOOK.InitSection(BUK_ENTRATABOOK_RPT_REPORTENTRAT, BUK_ENTRATABOOK_SEC_PAGEHEADER, 1700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ENTRATABOOK.SetSectionRendersInto(BUK_ENTRATABOOK_SEC_PAGEHEADER, BUK_ENTRATABOOK_RPTBOX_PAGEHEADER2);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SEC_PAGEHEADER, "0FD821B9-1473-4EA3-B630-C19957B5D6C8");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_PAGEHEADER, BUK_ENTRATABOOK_RPTBOX_TITOLO1, 0, 0, 27700, 1700, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_TITOLO1, "9E5CF7C1-AC75-4FF9-B703-D9D51B0095EE");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_TITOLO1, "TITOLO1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_TITOLO1, BUK_ENTRATABOOK_SPAN_ELENVOCIPAT1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Elenco Voci Patto - ", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_ELENVOCIPAT1, "8659C3A8-2BA9-4873-BDBF-7A9BC70821D0");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_ELENVOCIPAT1, "ELENVOCIPAT1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_TITOLO1, BUK_ENTRATABOOK_SPAN_TIPOSTAMPA1, MyGlb.VIS_TITOLOREPORT, 5, 52, 0, 271319169, "", "", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_TIPOSTAMPA1, "C50D2CE2-96FF-46EF-9A81-CA7FAA8074FC");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_TIPOSTAMPA1, "TIPOSTAMPA1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_TITOLO1, BUK_ENTRATABOOK_SPAN_ENTRATA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Entrate", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_ENTRATA, "1606050A-6889-4AEB-9F7B-E065D4ED2006");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_ENTRATA, "ENTRATA");
    BUK_ENTRATABOOK.InitSection(BUK_ENTRATABOOK_RPT_REPORTENTRAT, BUK_ENTRATABOOK_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ENTRATABOOK.SetSectionRendersInto(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_PAGEBODY1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SEC_DETAIL, "632E976F-441E-43BD-B48F-B5FF0DC1B66B");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SEC_DETAIL, "DETAIL");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_CODICE1, 0, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_CODICE1, "CFC6ACE8-8BAC-4568-A9FD-53048F0C1877");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_CODICE1, "CODICE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_CODICE1, BUK_ENTRATABOOK_SPAN_VOPSVOVOPAEB, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_VOPSVOVOPAEB, "486C20A9-79AF-459B-A887-F0342D757FAC");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_VOPSVOVOPAEB, "VOPSVOVOPAEB");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_DESCRIZIONE1, 1400, 100, 14100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_DESCRIZIONE1, "EE0CBDB2-7541-4329-8335-82551D9E6BCB");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_DESCRIZIONE1, BUK_ENTRATABOOK_SPAN_VOPSDEVOPAEB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_VOPSDEVOPAEB, "ED219B25-FEC7-4454-9C63-8695C50722ED");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_VOPSDEVOPAEB, "VOPSDEVOPAEB");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_CAPITACORRE1, 15600, 100, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_CAPITACORRE1, "B896D39E-1071-484E-98AB-A0A7EB088E74");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_CAPITACORRE1, "CAPITACORRE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_CAPITACORRE1, BUK_ENTRATABOOK_SPAN_CAPITACORRE2, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "", "::CAPITALE_CORRENTE", 1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_CAPITACORRE2, "Capitale", "", (new IDVariant("CAP")), null, "", -1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_CAPITACORRE2, "Corrente", "", (new IDVariant("CORR")), null, "", -1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_CAPITACORRE2, "824D0C75-DA8A-45EA-8A9D-5E477690ED77");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_CAPITACORRE2, "CAPITACORRE2");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_MODIFICABIL1, 18500, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_MODIFICABIL1, "27E48D86-90FC-46C5-82F1-9B120BEAC33E");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_MODIFICABIL1, "MODIFICABIL1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_MODIFICABIL1, BUK_ENTRATABOOK_SPAN_MODIFICABIL2, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "", "::MODIFICABILE", 1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_MODIFICABIL2, "Mai", "", (new IDVariant("NO")), null, "", -1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_MODIFICABIL2, "Sempre", "", (new IDVariant("SI")), null, "", -1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_MODIFICABIL2, "Solo in Simulazione", "", (new IDVariant("SS")), null, "", -1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_MODIFICABIL2, "1F6849E3-2290-43BB-8233-91ECE0DC7B3A");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_MODIFICABIL2, "MODIFICABIL2");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_DAVISUALIZZ1, 22400, 100, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_DAVISUALIZZ1, "8EB08444-4232-45DE-9526-3DBF148A0637");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_DAVISUALIZZ1, "DAVISUALIZZ1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_DAVISUALIZZ1, BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, "228556FC-B00E-4A08-9CAD-85D6E0544AA0");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_NUVVPDVVPEBN, "NUVVPDVVPEBN");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_SEQUENZA1, 23900, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_SEQUENZA1, "48FB3E37-268C-4335-B69A-DC4DAE515983");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_SEQUENZA1, "SEQUENZA1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_SEQUENZA1, BUK_ENTRATABOOK_SPAN_SEQUENZA2, MyGlb.VIS_DEFAREPOSTYL, 1, 10, 0, 271384705, "", "::SEQUENZA", 1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_SEQUENZA2, "23F07FFC-90F1-4446-A31E-18571CCE02AF");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_SEQUENZA2, "SEQUENZA2");
    BUK_ENTRATABOOK.InitReportBox(BUK_ENTRATABOOK_SEC_DETAIL, BUK_ENTRATABOOK_RPTBOX_TIPOVOCE1, 25700, 100, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_RPTBOX_TIPOVOCE1, "1E41097B-3747-42B9-AEE1-3F4E4E732939");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_RPTBOX_TIPOVOCE1, "TIPOVOCE1");
    BUK_ENTRATABOOK.InitBoxSpan(BUK_ENTRATABOOK_RPTBOX_TIPOVOCE1, BUK_ENTRATABOOK_SPAN_TIPOVOCE2, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "", "::TIPO_VOCE", 1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_TIPOVOCE2, "Totale", "", (new IDVariant("T")), null, "", -1);
    BUK_ENTRATABOOK.SetSpanValueListItem(BUK_ENTRATABOOK_SPAN_TIPOVOCE2, "Dettaglio", "", (new IDVariant("D")), null, "", -1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SPAN_TIPOVOCE2, "3E04116E-ECD9-420F-8712-8C6B0EC94F70");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SPAN_TIPOVOCE2, "TIPOVOCE2");
    BUK_ENTRATABOOK.InitSection(BUK_ENTRATABOOK_RPT_REPORTENTRAT, BUK_ENTRATABOOK_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ENTRATABOOK.SetSectionRendersInto(BUK_ENTRATABOOK_SEC_PAGEFOOTER, BUK_ENTRATABOOK_RPTBOX_PAGEFOOTER1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SEC_PAGEFOOTER, "AF20F30B-4503-4B6E-91A6-76F738134C53");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ENTRATABOOK.InitSection(BUK_ENTRATABOOK_RPT_REPORTENTRAT, BUK_ENTRATABOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ENTRATABOOK.SetSectionRendersInto(BUK_ENTRATABOOK_SEC_REPORTFOOTER, BUK_ENTRATABOOK_RPTBOX_PAGEBODY1);
    BUK_ENTRATABOOK.SetRTCGuid(BUK_ENTRATABOOK_SEC_REPORTFOOTER, "B93F58CA-88B8-4D39-B5C3-4FB3F7A986EF");
    BUK_ENTRATABOOK.SetObjCode(BUK_ENTRATABOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ENTRATABOOK_RPT_REPORTENTRAT_InitQuery(false, true);
  }

  private void BUK_ENTRATABOOK_InitLinks()
  {
    BUK_ENTRATABOOK.SetBoxNextBox(BUK_ENTRATABOOK_RPTBOX_PAGEBODY1, BUK_ENTRATABOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_SPESABOOK_MST_SPESBOOKPAGE_Init()
  {
    BUK_SPESABOOK.InitMastro(BUK_SPESABOOK_MST_SPESBOOKPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_MST_SPESBOOKPAGE, "CA668DFE-F021-43E4-AA4E-DA9947F794E8");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_MST_SPESBOOKPAGE, "SPESBOOKPAGE");
    BUK_SPESABOOK.InitMastroBox(BUK_SPESABOOK_MST_SPESBOOKPAGE, BUK_SPESABOOK_RPTBOX_NUMEROPAGINE, 26400, 300, 2300, 500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_NUMEROPAGINE, "20AC3827-E83D-4A78-89B0-2732C522EA55");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_NUMEROPAGINE, "NUMEROPAGINE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_NUMEROPAGINE, BUK_SPESABOOK_SPAN_TSSBVPPNTSSB, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "", "", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_TSSBVPPNTSSB, "B9A1AACB-4E87-4087-943D-C5AC3A0CA0D7");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_TSSBVPPNTSSB, "TSSBVPPNTSSB");
    BUK_SPESABOOK.InitMastroBox(BUK_SPESABOOK_MST_SPESBOOKPAGE, BUK_SPESABOOK_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_PAGEHEADER, "0222B6B8-DF8E-481E-990D-138A77EAA359");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SPESABOOK.InitMastroBox(BUK_SPESABOOK_MST_SPESBOOKPAGE, BUK_SPESABOOK_RPTBOX_PAGEBODY, 1000, 3500, 27700, 16300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_PAGEBODY, "638A1C00-CEEA-4BEC-A4BA-D632AEFAF817");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SPESABOOK.InitMastroBox(BUK_SPESABOOK_MST_SPESBOOKPAGE, BUK_SPESABOOK_RPTBOX_PAGEFOOTER, 1000, 20100, 27700, 100, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_PAGEFOOTER, "99751653-E004-4FB5-B722-5B29EEC3B820");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_SPESABOOK_RPT_REPORTSPESA_InitQuery() { BUK_SPESABOOK_RPT_REPORTSPESA_InitQuery(true, true); }
  private void BUK_SPESABOOK_RPT_REPORTSPESA_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.CAPITALE_CORRENTE as CAPITALE_CORRENTE, ");
      SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
      SQL.append("  A.DA_VISUALIZZARE as DA_VISUALIZZARE, ");
      SQL.append("  A.SEQUENZA as SEQUENZA, ");
      SQL.append("  A.TIPO_VOCE as TIPO_VOCE ");
      SQL.append("from ");
      SQL.append("  VOCI_PS A ");
      SQL.append("where (A.ESERCIZIO = DECODE(A.ESERCIZIO, 0, 0, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.TIPO_STAMPA = ~~PQRY_PARAM96.ROWNAMTIPSTA~~) ");
      BUK_SPESABOOK.SetReportQuery(BUK_SPESABOOK_RPT_REPORTSPESA, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5B165EDF-1162-4871-A3C7-7B94DB0977AE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SPESABOOK_RPT_REPORTSPESA_Init()
  {
    BUK_SPESABOOK.InitReport(BUK_SPESABOOK_RPT_REPORTSPESA, 196865);
    BUK_SPESABOOK_RPT_REPORTSPESA_InitQuery(true, false);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPT_REPORTSPESA, "758BAEE8-C94B-4B67-90B7-6848F0B20BC6");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPT_REPORTSPESA, "REPORTSPESA");
    BUK_SPESABOOK.InitSection(BUK_SPESABOOK_RPT_REPORTSPESA, BUK_SPESABOOK_SEC_REPORTHEADER, 700, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SPESABOOK.SetSectionRendersInto(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_PAGEBODY);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SEC_REPORTHEADER, "FE3864A4-76E3-4085-81CD-1C302C7993C7");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_CODICEHEADER, 0, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_CODICEHEADER, "8F54DAA6-36DE-47C4-A109-C0B14A02A1D8");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_CODICEHEADER, BUK_SPESABOOK_SPAN_VOCE, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Voce", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_VOCE, "DA01A57A-7971-4BC5-8D48-1635C3E1D4CA");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_VOCE, "VOCE");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_DESCRIHEADER, 1400, 100, 14100, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_DESCRIHEADER, "B62DE49F-42E9-4155-BF84-4F335BE63B39");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_DESCRIHEADER, BUK_SPESABOOK_SPAN_DESCRIZIONE, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_DESCRIZIONE, "ABC3CE33-5A72-45D4-A88A-EF554A6582BC");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_CAPICORRHEAD, 15600, 100, 2800, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_CAPICORRHEAD, "9506F33F-253C-4979-BE73-7A96E37FE14C");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_CAPICORRHEAD, "CAPICORRHEAD");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_CAPICORRHEAD, BUK_SPESABOOK_SPAN_C1, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Capitale/Corrente", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_C1, "80CFC1B9-330C-413C-A141-831879C49785");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_C1, "C1");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_MODIFIHEADER, 18500, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_MODIFIHEADER, "5EA648E2-FC94-4DBC-BC22-4077FB369B27");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_MODIFIHEADER, "MODIFIHEADER");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_MODIFIHEADER, BUK_SPESABOOK_SPAN_C2, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Modificabile", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_C2, "698B2294-7AB3-45C3-8A77-80041C016A41");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_C2, "C2");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_DAVISUAHEADE, 21200, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_DAVISUAHEADE, "1248B912-ED77-49D7-A666-FA2E7AF30DC9");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_DAVISUAHEADE, "DAVISUAHEADE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_DAVISUAHEADE, BUK_SPESABOOK_SPAN_C3, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Da Visualizzare", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_C3, "DB1F818E-67E7-4D94-AD37-C74DF1FE0D09");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_C3, "C3");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_SEQUENHEADER, 23900, 100, 1700, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_SEQUENHEADER, "4A988920-A37C-4948-8FEA-24331DE5AAD3");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_SEQUENHEADER, "SEQUENHEADER");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_SEQUENHEADER, BUK_SPESABOOK_SPAN_C4, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Sequenza", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_C4, "BF4DBB96-C768-4FB3-94DC-C8AACC7F2CCE");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_C4, "C4");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_REPORTHEADER, BUK_SPESABOOK_RPTBOX_TIPOVOCEHEAD, 25700, 100, 1400, 500, 0, 1, 1, MyGlb.VIS_BOXCENTRATO, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_TIPOVOCEHEAD, "D9FA9FDA-632B-41E1-B980-B53B1098562F");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_TIPOVOCEHEAD, "TIPOVOCEHEAD");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_TIPOVOCEHEAD, BUK_SPESABOOK_SPAN_C, MyGlb.VIS_BOXCENTRATO, 0, 0, 0, 271384961, "", "Tipo", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_C, "C3B1553D-C523-4D25-BF3D-4EC722C16D6B");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_C, "C");
    BUK_SPESABOOK.InitSection(BUK_SPESABOOK_RPT_REPORTSPESA, BUK_SPESABOOK_SEC_PAGEHEADER, 1700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SPESABOOK.SetSectionRendersInto(BUK_SPESABOOK_SEC_PAGEHEADER, BUK_SPESABOOK_RPTBOX_PAGEHEADER);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SEC_PAGEHEADER, "2B4AFA88-FCB4-442A-B749-949CF27DE7E8");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_PAGEHEADER, BUK_SPESABOOK_RPTBOX_TITOLO, 0, 0, 27700, 1700, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_TITOLO, "9FF8C1D2-0844-40ED-91AE-59626447FA97");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_TITOLO, "TITOLO");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_TITOLO, BUK_SPESABOOK_SPAN_ELENVOCIPATT, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Elenco Voci Patto - ", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_ELENVOCIPATT, "A94D4300-9A25-4929-96A0-B6790DFDC320");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_ELENVOCIPATT, "ELENVOCIPATT");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_TITOLO, BUK_SPESABOOK_SPAN_TIPOSTAMPA, MyGlb.VIS_TITOLOREPORT, 5, 52, 0, 271319169, "", "", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_TIPOSTAMPA, "87163FD3-C39A-4A21-8FE3-CFB69CFD677E");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_TIPOSTAMPA, "TIPOSTAMPA");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_TITOLO, BUK_SPESABOOK_SPAN_SPESE, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Spese", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_SPESE, "C37932D8-DA3A-4113-837D-D237E6DFE02C");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_SPESE, "SPESE");
    BUK_SPESABOOK.InitSection(BUK_SPESABOOK_RPT_REPORTSPESA, BUK_SPESABOOK_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SPESABOOK.SetSectionRendersInto(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_PAGEBODY);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SEC_DETAIL, "7EE6818E-D501-4D9D-9B4B-23F9677C5BE2");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SEC_DETAIL, "DETAIL");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_CODICE, 0, 100, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_CODICE, "78309C45-EE9C-437B-974F-8A1955F35895");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_CODICE, "CODICE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_CODICE, BUK_SPESABOOK_SPAN_VOPSVOVOPEB1, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_VOPSVOVOPEB1, "E4EFE712-5FB1-4A52-90AD-BA0C78DC7C54");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_VOPSVOVOPEB1, "VOPSVOVOPEB1");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_DESCRIZIONE, 1400, 100, 14100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_DESCRIZIONE, "D988054F-4D37-4D63-8167-9837E2E2D754");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_DESCRIZIONE, BUK_SPESABOOK_SPAN_VOPSDEVOPEB1, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_VOPSDEVOPEB1, "495C9018-10B0-4F64-8251-BD3A632F89F6");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_VOPSDEVOPEB1, "VOPSDEVOPEB1");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_CAPITACORREN, 15600, 100, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_CAPITACORREN, "3FB36D1B-487A-4BFA-9416-7787C84EF82C");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_CAPITACORREN, "CAPITACORREN");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_CAPITACORREN, BUK_SPESABOOK_SPAN_CAPITACORREN, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "", "::CAPITALE_CORRENTE", 1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_CAPITACORREN, "Capitale", "", (new IDVariant("CAP")), null, "", -1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_CAPITACORREN, "Corrente", "", (new IDVariant("CORR")), null, "", -1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_CAPITACORREN, "924D67B8-1F83-4CC8-9C9F-A222740302A5");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_CAPITACORREN, "CAPITACORREN");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_MODIFICABILE, 18500, 100, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_MODIFICABILE, "7FDBA4E0-914E-49E8-9C2C-7B3A8D8FFD03");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_MODIFICABILE, "MODIFICABILE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_MODIFICABILE, BUK_SPESABOOK_SPAN_MODIFICABILE, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "", "::MODIFICABILE", 1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_MODIFICABILE, "Mai", "", (new IDVariant("NO")), null, "", -1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_MODIFICABILE, "Sempre", "", (new IDVariant("SI")), null, "", -1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_MODIFICABILE, "Solo in Simulazione", "", (new IDVariant("SS")), null, "", -1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_MODIFICABILE, "8A18826B-7436-461D-9158-7519165FD07F");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_MODIFICABILE, "MODIFICABILE");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_DAVISUALIZZA, 22400, 100, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_DAVISUALIZZA, "E4B53638-F753-4EF3-AF34-38D1F089407B");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_DAVISUALIZZA, "DAVISUALIZZA");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_DAVISUALIZZA, BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "", "", 1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, "BA171B6F-B888-460B-9661-5E544FC25C7E");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_NUVVPDVVPSBN, "NUVVPDVVPSBN");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_SEQUENZA, 23900, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_SEQUENZA, "02021CC6-32AF-48A2-B32A-2DCA57CA26AB");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_SEQUENZA, "SEQUENZA");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_SEQUENZA, BUK_SPESABOOK_SPAN_SEQUENZA, MyGlb.VIS_DEFAREPOSTYL, 1, 10, 0, 271384705, "", "::SEQUENZA", 1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_SEQUENZA, "74279761-9821-4071-BD31-85D164E0D282");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_SEQUENZA, "SEQUENZA");
    BUK_SPESABOOK.InitReportBox(BUK_SPESABOOK_SEC_DETAIL, BUK_SPESABOOK_RPTBOX_TIPOVOCE, 25700, 100, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_RPTBOX_TIPOVOCE, "D9A35B14-CC2E-4C71-B832-8588C491CA25");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_RPTBOX_TIPOVOCE, "TIPOVOCE");
    BUK_SPESABOOK.InitBoxSpan(BUK_SPESABOOK_RPTBOX_TIPOVOCE, BUK_SPESABOOK_SPAN_TIPOVOCE, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384961, "", "::TIPO_VOCE", 1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_TIPOVOCE, "Totale", "", (new IDVariant("T")), null, "", -1);
    BUK_SPESABOOK.SetSpanValueListItem(BUK_SPESABOOK_SPAN_TIPOVOCE, "Dettaglio", "", (new IDVariant("D")), null, "", -1);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SPAN_TIPOVOCE, "C42F5316-53B8-41CE-8E53-7ED82DF64B86");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SPAN_TIPOVOCE, "TIPOVOCE");
    BUK_SPESABOOK.InitSection(BUK_SPESABOOK_RPT_REPORTSPESA, BUK_SPESABOOK_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_SPESABOOK.SetSectionRendersInto(BUK_SPESABOOK_SEC_PAGEFOOTER, BUK_SPESABOOK_RPTBOX_PAGEFOOTER);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SEC_PAGEFOOTER, "C7152409-A98E-40DD-9B92-FA47AD916581");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SPESABOOK.InitSection(BUK_SPESABOOK_RPT_REPORTSPESA, BUK_SPESABOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SPESABOOK.SetSectionRendersInto(BUK_SPESABOOK_SEC_REPORTFOOTER, BUK_SPESABOOK_RPTBOX_PAGEBODY);
    BUK_SPESABOOK.SetRTCGuid(BUK_SPESABOOK_SEC_REPORTFOOTER, "C3811B86-0D3D-46F6-964B-00D8BBFA6918");
    BUK_SPESABOOK.SetObjCode(BUK_SPESABOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SPESABOOK_RPT_REPORTSPESA_InitQuery(false, true);
  }

  private void BUK_SPESABOOK_InitLinks()
  {
    BUK_SPESABOOK.SetBoxNextBox(BUK_SPESABOOK_RPTBOX_PAGEBODY, BUK_SPESABOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateRow(Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_DynamicProperties();
    if (SrcObj == PAN_SPESA) PAN_SPESA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_BeforeInsert(Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ENTRATABOOK) BUK_ENTRATABOOK_OnPreview();
    if (SrcObj == BKW_SPESABOOK) BUK_SPESABOOK_OnPreview();
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
