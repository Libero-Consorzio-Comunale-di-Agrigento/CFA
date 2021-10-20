// **********************************************
// Elenco Impegni Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoImpegniCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DAL = 0;
  private static int PFL_PARAMETRI_SUBIMPEGNI = 1;

  private static int PPQRY_PARAMETRI441 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ELENCOIMPEGN_CAPITOLO = 0;
  private static int PFL_ELENCOIMPEGN_ARTICOLO = 1;
  private static int PFL_ELENCOIMPEGN_NUMEROIMP = 2;
  private static int PFL_ELENCOIMPEGN_ANNOIMP = 3;
  private static int PFL_ELENCOIMPEGN_INFOIMPEGNI = 4;
  private static int PFL_ELENCOIMPEGN_NUMEROSUBIMP = 5;
  private static int PFL_ELENCOIMPEGN_ANNOSUBIMP = 6;
  private static int PFL_ELENCOIMPEGN_INFOSUBIMPEG = 7;
  private static int PFL_ELENCOIMPEGN_IMPORTO = 8;
  private static int PFL_ELENCOIMPEGN_SUBIMPEGNATO = 9;
  private static int PFL_ELENCOIMPEGN_LIQUIDATO = 10;
  private static int PFL_ELENCOIMPEGN_PAGATO = 11;
  private static int PFL_ELENCOIMPEGN_DISPONIBILIT = 12;
  private static int PFL_ELENCOIMPEGN_DISPEFFETTIV = 13;
  private static int PFL_ELENCOIMPEGN_DATA = 14;
  private static int PFL_ELENCOIMPEGN_DESCRIZIONE = 15;
  private static int PFL_ELENCOIMPEGN_SEDEDEL = 16;
  private static int PFL_ELENCOIMPEGN_NUMERODEL = 17;
  private static int PFL_ELENCOIMPEGN_ANNODEL = 18;
  private static int PFL_ELENCOIMPEGN_OBBLIGATORIO = 19;
  private static int PFL_ELENCOIMPEGN_PRENOTAZIONE = 20;
  private static int PFL_ELENCOIMPEGN_UNITAPROPONE = 21;
  private static int PFL_ELENCOIMPEGN_NUMEROPROPOS = 22;
  private static int PFL_ELENCOIMPEGN_ANNOPROPOSTA = 23;
  private static int PFL_ELENCOIMPEGN_BENEFICIARIO = 24;
  private static int PFL_ELENCOIMPEGN_RAGIONSOCIAL = 25;
  private static int PFL_ELENCOIMPEGN_NUMEIMPEPROV = 26;
  private static int PFL_ELENCOIMPEGN_CAPITOLOART = 27;
  private static int PFL_ELENCOIMPEGN_IMPEGNO = 28;
  private static int PFL_ELENCOIMPEGN_DELIBERA = 29;
  private static int PFL_ELENCOIMPEGN_PROPOSTA = 30;
  private static int PFL_ELENCOIMPEGN_SUBIMPEGNO = 31;
  private static int PFL_ELENCOIMPEGN_ESERCIZIO = 32;
  private static int PFL_ELENCOIMPEGN_ANNSUBIMPORD = 33;
  private static int PFL_ELENCOIMPEGN_NUMSUBIMPORD = 34;
  private static int PFL_ELENCOIMPEGN_ANNOIMPEPROV = 35;
  private static int PFL_ELENCOIMPEGN_ANNOSUBIPROV = 36;
  private static int PFL_ELENCOIMPEGN_NUMESUBIPROV = 37;
  private static int PFL_ELENCOIMPEGN_CODICECOFOG = 38;
  private static int PFL_ELENCOIMPEGN_CODLIVELLO5 = 39;
  private static int PFL_ELENCOIMPEGN_CODICEEUROPE = 40;
  private static int PFL_ELENCOIMPEGN_DESCLIVELLO5 = 41;
  private static int PFL_ELENCOIMPEGN_DESCCOFOG = 42;
  private static int PFL_ELENCOIMPEGN_ETICIMPEPROV = 43;
  private static int PFL_ELENCOIMPEGN_ETICHESUBIMP = 44;

  private static int PPQRY_VISIMPSUUOU3 = 0;

  private static int PPQRY_INFO = 1;
  private static int PPQRY_LIVELLO5 = 2;
  private static int PPQRY_COFOG = 3;


  IDPanel PAN_ELENCOIMPEGN;
  CIDREObj BUK_ELENIMPEBOOK;
  OBook BKW_ELENIMPEBOOK;
  //
  // Template Pages constants
  private static int BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG = 1;
  private static int BUK_ELENIMPEBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ELENIMPEBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_ELENIMPEBOOK_SPAN_IMPEGDISPESA = 5;
  private static int BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY = 6;
  private static int BUK_ELENIMPEBOOK_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO = 8;
  private static int BUK_ELENIMPEBOOK_SEC_REPORTHEADER = 9;
  private static int BUK_ELENIMPEBOOK_SEC_PAGEHEADER = 10;
  private static int BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD = 11;
  private static int BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD = 12;
  private static int BUK_ELENIMPEBOOK_RPTBOX_VOCEPEGHEADE = 13;
  private static int BUK_ELENIMPEBOOK_SPAN_C = 14;
  private static int BUK_ELENIMPEBOOK_RPTBOX_IMPEGNHEADER = 15;
  private static int BUK_ELENIMPEBOOK_SPAN_IMPEGNO1 = 16;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGHEAD = 17;
  private static int BUK_ELENIMPEBOOK_SPAN_IMPEGNO = 18;
  private static int BUK_ELENIMPEBOOK_RPTBOX_IMPORTHEADER = 19;
  private static int BUK_ELENIMPEBOOK_SPAN_IMPORTO = 20;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUBIMPHEADER = 21;
  private static int BUK_ELENIMPEBOOK_SPAN_SUBIMPEGNATO = 22;
  private static int BUK_ELENIMPEBOOK_RPTBOX_LIQUIDHEADER = 23;
  private static int BUK_ELENIMPEBOOK_SPAN_LIQUIDATO = 24;
  private static int BUK_ELENIMPEBOOK_RPTBOX_MANDATHEADER = 25;
  private static int BUK_ELENIMPEBOOK_SPAN_PAGATO = 26;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DISPONHEADER = 27;
  private static int BUK_ELENIMPEBOOK_SPAN_DISPONIBILIT = 28;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DATAREGHEADE = 29;
  private static int BUK_ELENIMPEBOOK_SPAN_DATAREG = 30;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DESCRIHEADER = 31;
  private static int BUK_ELENIMPEBOOK_SPAN_DESCRIZIONE = 32;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SEDEDELHEADE = 33;
  private static int BUK_ELENIMPEBOOK_SPAN_SEDEDEL = 34;
  private static int BUK_ELENIMPEBOOK_RPTBOX_IMPEOBBLHEAD = 35;
  private static int BUK_ELENIMPEBOOK_SPAN_OBBLIGATORIO = 36;
  private static int BUK_ELENIMPEBOOK_RPTBOX_UNITPROPHEAD = 37;
  private static int BUK_ELENIMPEBOOK_SPAN_UNITAPROPONE = 38;
  private static int BUK_ELENIMPEBOOK_RPTBOX_VOCEPEG = 39;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUVPEGEIC = 40;
  private static int BUK_ELENIMPEBOOK_SEC_DETAIL = 41;
  private static int BUK_ELENIMPEBOOK_RPTBOX_CAPITOLO = 42;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUCEICEIB = 43;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRAVOCEPEG = 44;
  private static int BUK_ELENIMPEBOOK_SPAN_BARRAVOCEPEG = 45;
  private static int BUK_ELENIMPEBOOK_RPTBOX_ARTICOLO = 46;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUAEICEIB = 47;
  private static int BUK_ELENIMPEBOOK_RPTBOX_NUMEROIMP = 48;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUNIEICEI = 49;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRAIMPEGNO = 50;
  private static int BUK_ELENIMPEBOOK_SPAN_BARRAIMPEGNO = 51;
  private static int BUK_ELENIMPEBOOK_RPTBOX_ANNOIMP = 52;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUAIEICEI = 53;
  private static int BUK_ELENIMPEBOOK_RPTBOX_NUMEROSUBIMP = 54;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUNSEICEI = 55;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRASUBIMPE = 56;
  private static int BUK_ELENIMPEBOOK_SPAN_BARRASUBIMPE = 57;
  private static int BUK_ELENIMPEBOOK_RPTBOX_ANNOSUBIMP = 58;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUASEICEI = 59;
  private static int BUK_ELENIMPEBOOK_RPTBOX_IMPORTO = 60;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUIEICEIB = 61;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGNATO = 62;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUSIEICEI = 63;
  private static int BUK_ELENIMPEBOOK_RPTBOX_LIQUIDATO = 64;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUULEICEIB = 65;
  private static int BUK_ELENIMPEBOOK_RPTBOX_MANDATI = 66;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUPEICEIB = 67;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DISPONIBILIT = 68;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUDEICEI1 = 69;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DATAREG = 70;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUDREICEI = 71;
  private static int BUK_ELENIMPEBOOK_RPTBOX_DESCRIZIONE = 72;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUDEICEIB = 73;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SEDEDEL = 74;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUSDEICEI = 75;
  private static int BUK_ELENIMPEBOOK_RPTBOX_NUMERODEL = 76;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUNDEICEI = 77;
  private static int BUK_ELENIMPEBOOK_RPTBOX_ANNODEL = 78;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUADEICEI = 79;
  private static int BUK_ELENIMPEBOOK_RPTBOX_IMPEGNOBBLIG = 80;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB = 81;
  private static int BUK_ELENIMPEBOOK_RPTBOX_UNITAPROPONE = 82;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUUPEICEI = 83;
  private static int BUK_ELENIMPEBOOK_RPTBOX_NUMEROPROPOS = 84;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUNPEICEI = 85;
  private static int BUK_ELENIMPEBOOK_RPTBOX_ANNOPROPOSTA = 86;
  private static int BUK_ELENIMPEBOOK_SPAN_VISUUAPEICEI = 87;
  private static int BUK_ELENIMPEBOOK_RPTBOX_TRATTIDELIBE = 88;
  private static int BUK_ELENIMPEBOOK_SPAN_TRATTIDELIBE = 89;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRADELIBER = 90;
  private static int BUK_ELENIMPEBOOK_SPAN_BARRADELIBER = 91;
  private static int BUK_ELENIMPEBOOK_RPTBOX_TRATTIPROPOS = 92;
  private static int BUK_ELENIMPEBOOK_SPAN_TRATTIPROPOS = 93;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRAPROPOST = 94;
  private static int BUK_ELENIMPEBOOK_SPAN_BARRAPROPOST = 95;
  private static int BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT = 96;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT1 = 97;
  private static int BUK_ELENIMPEBOOK_SPAN_AGFSVISUUIEI = 98;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP1 = 99;
  private static int BUK_ELENIMPEBOOK_SPAN_AGFSVISUUSIE = 100;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID1 = 101;
  private static int BUK_ELENIMPEBOOK_SPAN_AGFSVISUULEI = 102;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO1 = 103;
  private static int BUK_ELENIMPEBOOK_SPAN_AGFSVISUUPEI = 104;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON1 = 105;
  private static int BUK_ELENIMPEBOOK_SPAN_AGFSVISUUDEI = 106;
  private static int BUK_ELENIMPEBOOK_RPTBOX_TOTALEARTICO = 107;
  private static int BUK_ELENIMPEBOOK_SPAN_TOTALEARTICO = 108;
  private static int BUK_ELENIMPEBOOK_RPTBOX_BARRA = 109;
  private static int BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT = 110;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT2 = 111;
  private static int BUK_ELENIMPEBOOK_SPAN_CGFSVISUUIEI = 112;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP2 = 113;
  private static int BUK_ELENIMPEBOOK_SPAN_CGFSVISUUSIE = 114;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID2 = 115;
  private static int BUK_ELENIMPEBOOK_SPAN_CGFSVISUULEI = 116;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO2 = 117;
  private static int BUK_ELENIMPEBOOK_SPAN_CGFSVISUUPEI = 118;
  private static int BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON2 = 119;
  private static int BUK_ELENIMPEBOOK_SPAN_CGFSVISUUDEI = 120;
  private static int BUK_ELENIMPEBOOK_RPTBOX_TOTALECAPITO = 121;
  private static int BUK_ELENIMPEBOOK_SPAN_TOTALECAPITO = 122;
  private static int BUK_ELENIMPEBOOK_SEC_PAGEFOOTER = 123;
  private static int BUK_ELENIMPEBOOK_SEC_REPORTFOOTER = 124;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI442(IMDB);
    //
    //
    Init_PQRY_VISIMPSUUOU3(IMDB);
    Init_PQRY_PARAMETRI441(IMDB);
    Init_PQRY_PARAMETRI441_RS(IMDB);
    Init_PQRY_VISIMPSUUOU4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI442(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI442, 8);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI442, "TBL_PARAMETRI442");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOGES, "ROWNAMEUOGES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOGES,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOUTI, "ROWNAMEUOUTI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEUOUTI,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMESEVOC, "ROWNAMESEVOC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMESEVOC,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI442,IMDBDef4.FLD_PARAMETRI442_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI442, 0);
  }

  private static void Init_PQRY_VISIMPSUUOU3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VISIMPSUUOU3, 34);
    IMDB.set_TblCode(IMDBDef13.PQRY_VISIMPSUUOU3, "PQRY_VISIMPSUUOU3");
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DISP_FIN, "DISP_FIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DISP_FIN,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_IMPEGNO_OBBLIG, "IMPEGNO_OBBLIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_IMPEGNO_OBBLIG,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUBRSEE, "VIIMUOUBRSEE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTASIO, "VIIMUOUTASIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTASIO,1,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNSIO, "VIIMUOUTNSIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNSIO,1,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_MANDATI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VISIMPUOUTLI, "VISIMPUOUTLI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VISIMPUOUTLI,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_PRENOTAZIONE, "PRENOTAZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_PRENOTAZIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVIISUUCC, "VIIMVIISUUCC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVIISUUCC,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVISUUCL5, "VIIMVISUUCL5");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVISUUCL5,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVIISUUCE, "VIIMVIISUUCE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMVIISUUCE,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTANIP, "VIIMUOUTANIP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTANIP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNUIP, "VIIMUOUTNUIP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNUIP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTANSP, "VIIMUOUTANSP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTANSP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNUSP, "VIIMUOUTNUSP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU3,IMDBDef13.PQSL_VISIMPSUUOU3_VIIMUOUTNUSP,1,5,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VISIMPSUUOU3, 0);
  }

  private static void Init_PQRY_PARAMETRI441(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI441, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI441, "PQRY_PARAMETRI441");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI441,IMDBDef13.PQSL_PARAMETRI441_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI441,IMDBDef13.PQSL_PARAMETRI441_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI441,IMDBDef13.PQSL_PARAMETRI441_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI441,IMDBDef13.PQSL_PARAMETRI441_ROWNAMSUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI441, 0);
  }

  private static void Init_PQRY_PARAMETRI441_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI441_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI441_RS, "PQRY_PARAMETRI441_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI441_RS,IMDBDef13.PQSL_PARAMETRI441_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI441_RS,IMDBDef13.PQSL_PARAMETRI441_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI441_RS,IMDBDef13.PQSL_PARAMETRI441_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI441_RS,IMDBDef13.PQSL_PARAMETRI441_ROWNAMSUBIMP,5,2,0);
  }

  private static void Init_PQRY_VISIMPSUUOU4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VISIMPSUUOU4, 25);
    IMDB.set_TblCode(IMDBDef13.PQRY_VISIMPSUUOU4, "PQRY_VISIMPSUUOU4");
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_IMPEGNO_OBBLIG, "IMPEGNO_OBBLIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_IMPEGNO_OBBLIG,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUUVPEG, "VIIMSUUUVPEG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUUVPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_SUBIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUTLI, "VIIMSUUOUTLI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUTLI,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_MANDATI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUBRSEE, "VIIMSUUBRSEE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUBRSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUTOI, "VIIMSUUOUTOI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUTOI,5,198,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUOSI, "VIIMSUUOUOSI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISIMPSUUOU4,IMDBDef13.PQSL_VISIMPSUUOU4_VIIMSUUOUOSI,5,198,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VISIMPSUUOU4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImpegniCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoImpegniCassa()
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
    FormIdx = MyGlb.FRM_ELENIMPECASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "44B4D955-F83E-404D-AAF0-C9DF552E740E";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 458;
    set_Caption(new IDVariant("Elenco Impegni Cassa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 432;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12037;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FCE6E654-AC4C-4FFC-96C1-6C0EB6C7B030");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 816;
    Frames[3].Height = 380;
    Frames[3].Caption = "Elenco Impegni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_ELENCOIMPEGN = new IDPanel(w, this, 3, "PAN_ELENCOIMPEGN");
    Frames[3].Content = PAN_ELENCOIMPEGN;
    PAN_ELENCOIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ELENIMPEBOOK != null)
      PAN_ELENCOIMPEGN.SetBook(BUK_ELENIMPEBOOK);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "86403900-0183-410D-B1F5-C02DC73386A4");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2196, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOIMPEGN.InitStatus = 1;
    PAN_ELENCOIMPEGN_Init();
    PAN_ELENCOIMPEGN_InitFields();
    PAN_ELENCOIMPEGN_InitQueries();
    BKW_ELENIMPEBOOK = new OBook(this);
    BUK_ELENIMPEBOOK = new CIDREObj(BKW_ELENIMPEBOOK);
    BKW_ELENIMPEBOOK.iGuid = "D06B26F4-D2D8-4070-BD69-4C4CB93CF763";
    BKW_ELENIMPEBOOK.Code = "BUK_ELENIMPEBOOK";
    BKW_ELENIMPEBOOK.BookObj = BUK_ELENIMPEBOOK;
    BKW_ELENIMPEBOOK.InitDefMasks();
    BUK_ELENIMPEBOOK.InitBook(1, 3342337, "Elenco Impegni Book", IMDB, MainFrm.VisualStyleList);
    BUK_ELENIMPEBOOK.InitHTML();
    BUK_ELENIMPEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ELENIMPEBOOK.Book.SetMainFrm(MainFrm);
    BUK_ELENIMPEBOOK.SetRTCGuid(0, "D06B26F4-D2D8-4070-BD69-4C4CB93CF763");
    BUK_ELENIMPEBOOK.SetObjCode(0, "ELENIMPEBOOK");
    if (PAN_ELENCOIMPEGN != null)
      PAN_ELENCOIMPEGN.SetBook(BUK_ELENIMPEBOOK);
    BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG_Init();
    BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_Init();
    BUK_ELENIMPEBOOK_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_NUOVO18+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST6+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA2+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV2+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG116+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG115+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG116+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOPRE1+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaPrenotazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOIMP1+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaImpegni();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI442, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENIMPECASS_PARAMETRI441();
      }
      PAN_ELENCOIMPEGN.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_ELENIMPEBOOK.UpdateBook();
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
    if (Code.equals("BUK_ELENIMPEBOOK")) return BUK_ELENIMPEBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoImpegniCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoImpegniCassa.class.getName() : (Glb.ClassWithPackage(ElencoImpegniCassa.class) ? ElencoImpegniCassa.class.getName().substring(ElencoImpegniCassa.class.getPackage().getName().length() + 1) : ElencoImpegniCassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Impegni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOIMPEGN);
      // 
      // Elenco Impegni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELENCOIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOIMPEGN_DESCRIZIONE,IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ElencoImpegniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Impegni On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Impegni On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ELENCOIMPEGN.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET42+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET42+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ElencoImpegniOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Impegni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Impegni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ELENCOIMPEGN.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ElencoImpegniOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEDAL, 0, (new IDVariant()));
      set_Caption(IDL.Add((new IDVariant("Elenco Impegni")), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMSUBIMP, 0, (new IDVariant("NO")));
      PAN_ELENCOIMPEGN.SetCommandEnabled((new IDVariant(16384)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ELENCOIMPEGN.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOIMPEGN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO18+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO18+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CHIUAUTOPREN)), true) && Result.booleanValue())
      {
        PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI441, IMDBDef13.PQSL_PARAMETRI441_ROWNAMSUBIMP, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMP1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CHIUAUTOIMP1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Stampa
  // **********************************************************************
  public int ApriStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Body
      // Procedure Body
      // 
      BUK_ELENIMPEBOOK.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_ELENIMPEBOOK.ReportRefreshQuery(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO);
      BUK_ELENIMPEBOOK.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_ELENIMPEBOOK.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ApriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Chiusura Automatica Prenotazioni
  // **********************************************************************
  public int ApriChiusuraAutomaticaPrenotazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Apri Chiusura Automatica Prenotazioni Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("PRE")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOIMPEGN.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOIMPEGN.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOIMPEGN.GotoFirst();
        while (!PAN_ELENCOIMPEGN.RSEOF())
        {
          if (PAN_ELENCOIMPEGN.IsRowSelected(I.intValue()))
          {
            APRCHIAUTPRE_IMPACCSEINV1(C3.Get("ESERCIZIO"), C3.Get("ANNO_IMP"), C3.Get("NUMERO_IMP"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOIMPEGN.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTPRE_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ApriChiusuraAutomaticaPrenotazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINV1(IDVariant C3_ESERCIZIO, IDVariant C3_ANNO_IMP, IDVariant C3_NUMERO_IMP) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_ESERCIZIO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_ANNO_IMP);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_NUMERO_IMP);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTPRE_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ESERCIZIO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0));
  }

  // **********************************************************************
  // Apri Chiusura Automatica Impegni
  // **********************************************************************
  public int ApriChiusuraAutomaticaImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Apri Chiusura Automatica Impegni Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("IMP")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOIMPEGN.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOIMPEGN.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOIMPEGN.GotoFirst();
        while (!PAN_ELENCOIMPEGN.RSEOF())
        {
          if (PAN_ELENCOIMPEGN.IsRowSelected(I.intValue()))
          {
            APRCHIAUTIMP_IMPACCSEINV1(C3.Get("ESERCIZIO"), C3.Get("CAPITOLO"), C3.Get("ARTICOLO"), C3.Get("ANNO_IMP"), C3.Get("NUMERO_IMP"), C3.Get("DISPONIBILITA"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOIMPEGN.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTIMP_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ApriChiusuraAutomaticaImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINV1(IDVariant C3_ESERCIZIO, IDVariant C3_CAPITOLO, IDVariant C3_ARTICOLO, IDVariant C3_ANNO_IMP, IDVariant C3_NUMERO_IMP, IDVariant C3_DISPONIBILITA) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_ESERCIZIO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_CAPITOLO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_ARTICOLO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_ANNO_IMP);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_NUMERO_IMP);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_DISPONIBILITA);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTIMP_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ESERCIZIO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_CAPITOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ARTICOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_DISPONIBILITA, 0));
  }

  // **********************************************************************
  // Apri Info Impegno
  // **********************************************************************
  public int ApriInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFORMIMPEGN,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Sub Impegno
  // **********************************************************************
  public int ApriInfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Sub Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, 0));
        if (IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ApriInfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_RONANUSUDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).ProponiNuovaRigaSubimpegno();
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_RONANUIMDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ARTICOLO, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0)).PAN_IMPEGNO.PanelCommand(Glb.PCM_INSERT);
        ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0,true,this)).ProponiNuovaRigaImpegno();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "Nuovo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, 0))))
      {
        if (IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_SUBIMP, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VISIMPSUUOU3, IMDBDef13.PQSL_VISIMPSUUOU3_NUMERO_IMP, 0));
        MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Export CSV
  // **********************************************************************
  public int ExportCSV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export CSV Body
      // Corpo Procedura
      // 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      new IDVariant(PAN_ELENCOIMPEGN.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ELENCOIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImpegniCassa", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENIMPECASS_PARAMETRI441() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI441_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI442, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI442, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI441_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI441_RS, 0, IMDBDef4.TBL_PARAMETRI442, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI441_RS, 0, 0, IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI441_RS, 1, 0, IMDBDef4.TBL_PARAMETRI442, IMDBDef4.FLD_PARAMETRI442_ROWNAMSUBIMP, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI442, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI442, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI442, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI441_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOIMPEGN, Cancel);
    // Stub
  }

  private void PAN_ELENCOIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOIMPEGN_INFOIMPEGNI)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOIMPEGN_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_ELENCOIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ELENIMPEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ELENIMPEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELENIMPEBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD)
    {
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD)
    {
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_DETAIL)
    {
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_BARRAVOCEPEG, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "CAPITOLO"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_BARRAIMPEGNO, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "NUMERO_IMP"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_BARRASUBIMPE, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "NUMERO_SUBIMP"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_TRATTIDELIBE, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "SEDE_DEL"))))?(new IDVariant("-")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_BARRADELIBER, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "NUMERO_DEL"))))?(new IDVariant("/")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_TRATTIPROPOS, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "UNITA_PROPONENTE"))))?(new IDVariant("-")):(new IDVariant()))));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_BARRAPROPOST, new IDVariant(((!(IDL.IsNull(BUK_ELENIMPEBOOK.GetReportColumn(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "NUMERO_PROPOSTA"))))?(new IDVariant("/")):(new IDVariant()))));
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT)
    {
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUIEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT,"IMPORTO")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUSIE, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT,"SUBIMPEGNATO")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_AGFSVISUULEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT,"VIIMSUUOUTLI")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUPEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT,"MANDATI")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUDEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT)
    {
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUIEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT,"IMPORTO")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUSIE, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT,"SUBIMPEGNATO")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_CGFSVISUULEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT,"VIIMSUUOUTLI")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUPEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT,"MANDATI")));
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUDEI, new IDVariant(BUK_ELENIMPEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ELENIMPEBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ELENIMPEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ELENIMPEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG)
    {
      BUK_ELENIMPEBOOK.set_SpanValue(BUK_ELENIMPEBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELENIMPEBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELENIMPEBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ELENIMPEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ELENIMPEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ELENIMPEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ELENIMPEBOOK_OnPreview()
  {
    PreviewBook = BKW_ELENIMPEBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOIMPEGN_Init()
  {

    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_FIELD, 45);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "2D40EAC8-8D5B-4F6C-A28D-649BD1561483");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "CAPITOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "9C464539-1D8A-4680-990B-68A82ADBDD95");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "ARTICOLO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "E29308AF-6786-4739-88DB-D8E6F02BA439");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "NUMERO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "0C26A2A0-4698-4B21-A84D-B9FB81F1C61F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "ANNO IMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "CEDC494F-BDCF-46D2-95C3-4C16EC8710FE");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "Info Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "6EBA6422-D9B0-4DB9-9B30-383088AEE94B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "6A93A435-B171-42B7-8231-2F00179F78DB");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "88450F8F-94D1-4FF3-AA63-815AD70E2E03");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "15671290-3E63-4260-92ED-B0D5D216A638");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, "Importo");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "D68F2563-9FAD-480B-960E-92380D65EB47");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, "Sub-Impegnato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "B3F07E3E-F309-4F35-9306-7535A4428E02");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "Liquidato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "9D2328D7-39F8-43CE-8DCB-0211E7277781");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, "Pagato");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, "AF0BA423-56EF-4177-BF0C-C72E6FC699EC");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, "Disponibilità");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "3B5D25EF-09F7-4FFB-B9A1-70B1B85FD8CB");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "03D01AFE-5464-4983-9906-EBA4ABA0E573");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, "Data");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "C3154B61-91DA-4332-85E7-C0EFA91E8DE1");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "4F0D9A82-FE93-4FB6-B764-E3288D417031");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "SEDE DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "868D821A-99C1-4C2E-9A7F-D7164B21F47D");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "82DEEF87-5F4B-4CD5-B5D4-204CD1AA4F28");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "ANNO DEL");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "221ED9DD-EF1C-4A1B-B210-414F58B64D16");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, "Obbligatorio");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "B8861C06-A2CC-4AFD-93F8-30AF4901B55F");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "Prenotazione");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "C7F6A345-F565-44D4-8E2C-CBF950A23D9C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "AE1460DB-862B-420A-8D5A-3E85E21C37D3");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "54CEF017-6F2F-454C-948E-ED93BEB0450B");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "44E3EA0C-4B57-45C9-8529-CA3E7CCEA12C");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "Beneficiario");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "A43F76E1-16AC-4F12-BC42-C5D3719A680A");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, " ");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "987F4120-BE7B-4D7B-B382-3C3FA103CDED");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "Numero Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "6D8F2C95-7F1B-4C34-8B00-A736A3792579");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "73DC3A16-3F77-4DB2-A179-390676FCC316");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, "Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "F323C124-A428-4C0B-8467-833472E6C3B7");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, "Delibera");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "987953B3-3584-4624-909F-487668B9DED9");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, "Proposta");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "9F822C27-0B8C-4A92-97D5-0367E67EA3E0");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, "Sub-Impegno");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "73301F6A-B491-471F-B687-458D3C9BA2C9");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "3A8C90B5-CD02-4024-A884-AA390D9F46A8");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "Anno Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "A308B69F-C043-410D-81C9-C05981C8096E");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "Numero Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "2F27EEB8-1436-4BA3-97E0-D1FFC52F5D09");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "Anno Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "29A01BB9-1573-4088-9033-CE50508BDF25");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "2F69C9A7-9D64-4AF8-B85B-2A169993D06A");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "A0B64F04-89A9-48EA-BFF9-7A6449FF7609");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "Cofog");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "F8259BE1-CE21-4AAF-B5CE-A64287BE5C2E");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "V livello");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "B48EDAEF-B4C1-4E7B-84CE-AD29A4C20F15");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, "Brief description of field content.");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "FA7F71B7-AE49-4135-8B79-080C2DE937C7");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "25B2BC55-936C-4B77-B71C-4508CFC094DD");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "DESC COFOG");
    PAN_ELENCOIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, "");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.VIS_LOOKUPFIELDS);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, 0, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "AC244B9F-DB23-48DA-89B3-4A9B478FD5FA");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, "Impegno Provenienza");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, "BE49F59D-A833-4DC7-9AF8-AD3E8DE4ACBF");
    PAN_ELENCOIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, "SubImpegno Provenienza");
    PAN_ELENCOIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELENCOIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CAPITOLO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CAPITOLO, PPQRY_VISIMPSUUOU3, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ARTICOLO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ARTICOLO, PPQRY_VISIMPSUUOU3, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROIMP, PPQRY_VISIMPSUUOU3, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 160, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, "ANNO IMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMP, PPQRY_VISIMPSUUOU3, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 196, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_LIST, "I. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 4, 652, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOIMPEGNI, MyGlb.PANEL_FORM, "Info Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOIMPEGNI, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOIMPEGNI, PPQRY_INFO, "DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')", "DUALINFOIMPE", 5, 99, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOIMPEGNI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 216, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 412, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROSUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROSUBIMP, PPQRY_VISIMPSUUOU3, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 256, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 388, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIMP, PPQRY_VISIMPSUUOU3, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 292, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 700, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 116);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegni");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_INFOSUBIMPEG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_INFOSUBIMPEG, PPQRY_INFO, "DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I')", "DUAINFSUBIMP", 5, 99, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 312, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 4, 436, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_IMPORTO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_IMPORTO, PPQRY_VISIMPSUUOU3, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 400, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_LIST, "Sub Impegnato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 4, 460, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNATO, MyGlb.PANEL_FORM, "Sub Impeg.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SUBIMPEGNATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SUBIMPEGNATO, PPQRY_VISIMPSUUOU3, "A.SUBIMPEGNATO", "SUBIMPEGNATO", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 488, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 4, 508, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_LIQUIDATO, MyGlb.PANEL_FORM, "Liquid.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_LIQUIDATO, -1, -1);
    SQL = new StringBuffer();
    SQL.append("CASE WHEN (A.ANNO_SUBIMP IS NULL) THEN NVL(A.IMPORTO, 0) - NVL(A.DISP_FIN, 0) - NVL(( ");
  SQL.append("select ");
  SQL.append("  SUM(B.SUBIMPEGNATO) ");
  SQL.append("from ");
  SQL.append("  VISTA_IMP_SUB_UO_UT B ");
  SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
  SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
  SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
  SQL.append("), 0) ELSE NVL(A.SUBIMPEGNATO, 0) - NVL(A.DISP_FIN, 0) END");
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_LIQUIDATO, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_LIQUIDATO, PPQRY_VISIMPSUUOU3, SQL.toString(), "VISIMPUOUTLI", 3, 28, 6, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 568, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 4, 484, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PAGATO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PAGATO, PPQRY_VISIMPSUUOU3, "A.MANDATI", "MANDATI", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_LIST, 648, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 748, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DISPONIBILIT, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DISPONIBILIT, PPQRY_VISIMPSUUOU3, "A.DISP_FIN", "DISP_FIN", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 732, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DISPEFFETTIV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DISPEFFETTIV, PPQRY_VISIMPSUUOU3, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 820, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DATA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DATA, PPQRY_VISIMPSUUOU3, "A.DATA_REG", "DATA_REG", 6, 10, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 884, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCRIZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCRIZIONE, PPQRY_VISIMPSUUOU3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1140, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SEDEDEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SEDEDEL, PPQRY_VISIMPSUUOU3, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1180, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMERODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMERODEL, PPQRY_VISIMPSUUOU3, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1224, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNODEL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNODEL, PPQRY_VISIMPSUUOU3, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1260, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_LIST, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_OBBLIGATORIO, MyGlb.PANEL_FORM, "Obbligatorio");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_OBBLIGATORIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_OBBLIGATORIO, PPQRY_VISIMPSUUOU3, "A.IMPEGNO_OBBLIG", "IMPEGNO_OBBLIG", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_OBBLIGATORIO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_OBBLIGATORIO, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1340, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_LIST, "Prenotazione");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 4, 532, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PRENOTAZIONE, MyGlb.PANEL_FORM, "Prenotazione");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PRENOTAZIONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PRENOTAZIONE, PPQRY_VISIMPSUUOU3, "A.PRENOTAZIONE", "PRENOTAZIONE", 5, 2, 0, -13997);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_PRENOTAZIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOIMPEGN.SetValueListItem(PFL_ELENCOIMPEGN_PRENOTAZIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1424, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_UNITAPROPONE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_UNITAPROPONE, PPQRY_VISIMPSUUOU3, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1532, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEROPROPOS, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEROPROPOS, PPQRY_VISIMPSUUOU3, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1572, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOPROPOSTA, PPQRY_VISIMPSUUOU3, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1608, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 556, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_BENEFICIARIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_BENEFICIARIO, PPQRY_VISIMPSUUOU3, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1684, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 748, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_RAGIONSOCIAL, PPQRY_VISIMPSUUOU3, "C.RAGIONE_SOCIALE_ESTESA", "VIIMUOUBRSEE", 5, 60, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1884, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_LIST, "N. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 160);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMEIMPEPROV, MyGlb.PANEL_FORM, "Num. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMEIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMEIMPEPROV, PPQRY_VISIMPSUUOU3, "A.NUMERO_IMP_PROVENIENZA", "VIIMUOUTNUIP", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 36, 68, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CAPITOLOART, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 120, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 44, 76, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_IMPEGNO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 1140, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DELIBERA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 1424, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 60, 92, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_PROPOSTA, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 216, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_SUBIMPEGNO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 4, 556, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ESERCIZIO, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ESERCIZIO, PPQRY_VISIMPSUUOU3, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 140);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_LIST, "Anno Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 4, 796, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 140);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNSUBIMPORD, MyGlb.PANEL_FORM, "Ann. Sub Imp Ordin.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNSUBIMPORD, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_ANNSUBIMPORD, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNSUBIMPORD, PPQRY_VISIMPSUUOU3, "NVL(A.ANNO_SUBIMP, -1)", "VIIMUOUTASIO", 1, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 152);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_LIST, "Numero Sub Imp Ordinamento");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 4, 796, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 152);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMSUBIMPORD, MyGlb.PANEL_FORM, "Num. Sub Imp Ordin.");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMSUBIMPORD, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldUnbound(PFL_ELENCOIMPEGN_NUMSUBIMPORD, true);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMSUBIMPORD, PPQRY_VISIMPSUUOU3, "NVL(A.NUMERO_SUBIMP, -1)", "VIIMUOUTNSIO", 1, 19, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1924, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_LIST, "A. Im. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 4, 868, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 144);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOIMPEPROV, MyGlb.PANEL_FORM, "Ann. Imp. Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOIMPEPROV, PPQRY_VISIMPSUUOU3, "A.ANNO_IMP_PROVENIENZA", "VIIMUOUTANIP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1964, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_LIST, "A. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 868, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 164);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ANNOSUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ANNOSUBIPROV, PPQRY_VISIMPSUUOU3, "A.ANNO_SUBIMP_PROVENIENZA", "VIIMUOUTANSP", 1, 4, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 2004, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_LIST, "N. Sb. Prv.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 4, 868, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 184);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_NUMESUBIPROV, MyGlb.PANEL_FORM, "Numero SubImp Provenienza");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_NUMESUBIPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_NUMESUBIPROV, PPQRY_VISIMPSUUOU3, "A.NUMERO_SUBIMP_PROVENIENZA", "VIIMUOUTNUSP", 1, 5, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 2044, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 4, 796, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICECOFOG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICECOFOG, PPQRY_VISIMPSUUOU3, "A.CODICE_COFOG", "VIIMVIISUUCC", 1, 3, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 2084, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 820, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODLIVELLO5, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODLIVELLO5, PPQRY_VISIMPSUUOU3, "A.COD_LIVELLO_5", "VIIMVISUUCL5", 3, 10, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 2160, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 844, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_CODICEEUROPE, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_CODICEEUROPE, PPQRY_VISIMPSUUOU3, "A.CODICE_EUROPEO", "VIIMVIISUUCE", 1, 1, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 2024, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 216);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_LIST, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 4, 868, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 216);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCLIVELLO5, MyGlb.PANEL_FORM, "DESC LIVELLO 5");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCLIVELLO5, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCLIVELLO5, PPQRY_LIVELLO5, "A.DES_LIVELLO", "NOOGVISTRIDL", 5, 40, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 2240, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 220);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_LIST, "DESC COFOG");
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 4, 892, 656, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 220);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_DESCCOFOG, MyGlb.PANEL_FORM, "DESC COFOG");
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_DESCCOFOG, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_DESCCOFOG, PPQRY_COFOG, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 1816, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 1824, 260, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICIMPEPROV, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ETICIMPEPROV, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ETICIMPEPROV, -1, "", "ETICIMPEPROV", 0, 0, 0, -13997);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 1896, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 1804, 268, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOIMPEGN_ETICHESUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOIMPEGN.SetFieldPage(PFL_ELENCOIMPEGN_ETICHESUBIMP, -1, -1);
    PAN_ELENCOIMPEGN.SetFieldPanel(PFL_ELENCOIMPEGN_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
  }

  private void PAN_ELENCOIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOIMPEGN.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I') as DUALINFOIMPE, ");
    SQL.append("  DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I') as DUAINFSUBIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_INFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DES_LIVELLO as NOOGVISTRIDL ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~VIIMVISUUCL5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_LIVELLO5, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_LIVELLO5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_LIVELLO5, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~VIIMVIISUUCC~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(PPQRY_COFOG, "VISTA_STRUTTURA_RICL");
    PAN_ELENCOIMPEGN.SetIMDB(IMDB, "PQRY_VISIMPSUUOU3", true);
    PAN_ELENCOIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA IMP UO UT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.DISP_FIN as DISP_FIN, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.IMPEGNO_OBBLIG as IMPEGNO_OBBLIG, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as VIIMUOUBRSEE, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  NVL(A.ANNO_SUBIMP, -1) as VIIMUOUTASIO, ");
    SQL.append("  NVL(A.NUMERO_SUBIMP, -1) as VIIMUOUTNSIO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
    SQL.append("  A.MANDATI as MANDATI, ");
    SQL.append("  CASE WHEN (A.ANNO_SUBIMP IS NULL) THEN NVL(A.IMPORTO, 0) - NVL(A.DISP_FIN, 0) - NVL(( ");
    SQL.append("select ");
    SQL.append("  SUM(B.SUBIMPEGNATO) ");
    SQL.append("from ");
    SQL.append("  VISTA_IMP_SUB_UO_UT B ");
    SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("), 0) ELSE NVL(A.SUBIMPEGNATO, 0) - NVL(A.DISP_FIN, 0) END as VISIMPUOUTLI, ");
    SQL.append("  A.PRENOTAZIONE as PRENOTAZIONE, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CODICE_COFOG as VIIMVIISUUCC, ");
    SQL.append("  A.COD_LIVELLO_5 as VIIMVISUUCL5, ");
    SQL.append("  A.CODICE_EUROPEO as VIIMVIISUUCE, ");
    SQL.append("  A.ANNO_IMP_PROVENIENZA as VIIMUOUTANIP, ");
    SQL.append("  A.NUMERO_IMP_PROVENIENZA as VIIMUOUTNUIP, ");
    SQL.append("  A.ANNO_SUBIMP_PROVENIENZA as VIIMUOUTANSP, ");
    SQL.append("  A.NUMERO_SUBIMP_PROVENIENZA as VIIMUOUTNUSP ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_IMP_SUB_UO_UT A, ");
    SQL.append("  BEN C ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI442.ROWNAMEUOGES~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1) = NVL(~~TBL_PARAMETRI442.ROWNAMEUOUTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1))) ");
    SQL.append("and   (((~~TBL_PARAMETRI442.ROWNAMEUOGES~~ IS NULL)) OR (NVL(A.SCADENZA_UO, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
    SQL.append("and   (((~~TBL_PARAMETRI442.ROWNAMEUOUTI~~ IS NULL)) OR (NVL(A.SCADENZA_UT, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI442.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI442.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.DATA_REG >= NVL(~~TBL_PARAMETRI442.ROWNAMEDAL~~, A.DATA_REG)) ");
    SQL.append("and   ((A.ANNO_IMP < ~~TBL_PARAMETRI442.ROWNAMEESERC~~)) ");
    SQL.append("and   (~~PQRY_PARAMETRI441.ROWNAMSUBIMP~~ = A.SE_SUBIMP OR A.SE_SUBIMP = 'NO') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI442.ROWNAMEESERC~~) ");
    SQL.append("and   (A.TIPO_VIS = 'TUTTI') ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3, 4, 20, 21 ");
    PAN_ELENCOIMPEGN.SetQuery(PPQRY_VISIMPSUUOU3, 5, SQL, -1, "");
    PAN_ELENCOIMPEGN.SetQueryDB(PPQRY_VISIMPSUUOU3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOIMPEGN.SetMasterTable(0, "VISTA_IMP_SUB_UO_UT");
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_ANNOIMP, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_NUMEROIMP, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_ANNSUBIMPORD, true);
    PAN_ELENCOIMPEGN.AddToSortList(PFL_ELENCOIMPEGN_NUMSUBIMPORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOIMPEGN.iUseListQBE;
      PAN_ELENCOIMPEGN.iUseListQBE = 0;
      PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "D62F29A7-4BFE-44D1-ABB1-0712C5B7EDA0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "ED7C2E47-3EA8-497E-B160-65EC49C30440");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Sub Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Sub-Impegni");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 16, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI441, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 156, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNI, PPQRY_PARAMETRI441, "A.ROWNAMSUBIMP", "ROWNAMSUBIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI441", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI441, IMDBDef13.PQRY_PARAMETRI441_RS, IMDBDef4.TBL_PARAMETRI442);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef4.FLD_PARAMETRI442_ROWNAMEDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUBIMPEGNI, IMDBDef4.FLD_PARAMETRI442_ROWNAMSUBIMP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI442");
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

  private void BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG_Init()
  {
    BUK_ELENIMPEBOOK.InitMastro(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, "410418D8-97BF-4B22-A99A-5DC38E3868A8");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, "ELEIMPBOOPAG");
    BUK_ELENIMPEBOOK.InitMastroBox(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, BUK_ELENIMPEBOOK_RPTBOX_NUMEROPAGINA, 26600, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPAGINA, "A63CE1A3-6120-40E2-87D0-7354AB92A481");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPAGINA, BUK_ELENIMPEBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_NUMEROPAGINA, "02FACEFE-B7EE-4B87-8179-A6CE71C8C095");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ELENIMPEBOOK.InitMastroBox(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER, "F1452954-D0AF-47E1-BA5E-FCB5CFB0C36A");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER, BUK_ELENIMPEBOOK_SPAN_IMPEGDISPESA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Impegni di Spesa", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_IMPEGDISPESA, "6E383F1E-B368-4C2C-91C7-537868286C6F");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_IMPEGDISPESA, "IMPEGDISPESA");
    BUK_ELENIMPEBOOK.InitMastroBox(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY, 1000, 2400, 27700, 14900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY, "76AA4388-B1B4-4C6D-90A9-42397F2E92BC");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ELENIMPEBOOK.InitMastroBox(BUK_ELENIMPEBOOK_MST_ELEIMPBOOPAG, BUK_ELENIMPEBOOK_RPTBOX_PAGEFOOTER, 1000, 17900, 27700, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_PAGEFOOTER, "3C87A087-5791-4D21-B928-FDCFDA9D366C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_InitQuery() { BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_InitQuery(true, true); }
  private void BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
      SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
      SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
      SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
      SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
      SQL.append("  A.DATA_REG as DATA_REG, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
      SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
      SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
      SQL.append("  A.IMPEGNO_OBBLIG as IMPEGNO_OBBLIG, ");
      SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
      SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
      SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
      SQL.append("  'Capitolo/Art.' || ' ' || CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE ' - ' || TO_CHAR ( A.CAPITOLO ) END || CASE WHEN (A.ARTICOLO IS NULL) THEN NULL ELSE ' / ' || TO_CHAR ( A.ARTICOLO ) END as VIIMSUUUVPEG, ");
      SQL.append("  A.IMPORTO as IMPORTO, ");
      SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
      SQL.append("  CASE WHEN (A.ANNO_SUBIMP IS NULL) THEN NVL(A.IMPORTO, 0) - NVL(A.DISPONIBILITA, 0) - NVL(( ");
      SQL.append("select ");
      SQL.append("  SUM(B.SUBIMPEGNATO) ");
      SQL.append("from ");
      SQL.append("  VISTA_IMP_SUB_UO_UT B ");
      SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
      SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("), 0) ELSE NVL(A.SUBIMPEGNATO, 0) - NVL(A.DISPONIBILITA, 0) END as VIIMSUUOUTLI, ");
      SQL.append("  A.MANDATI as MANDATI, ");
      SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
      SQL.append("  C.RAGIONE_SOCIALE_ESTESA as VIIMSUUBRSEE, ");
      SQL.append("  LPAD(TO_CHAR ( A.ANNO_IMP ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.NUMERO_IMP ), 5, SUBSTR('0', 1, 1)) as VIIMSUUOUTOI, ");
      SQL.append("  LPAD(TO_CHAR ( NVL(A.ANNO_SUBIMP, 0) ), 4, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( NVL(A.NUMERO_SUBIMP, 0) ), 5, SUBSTR('0', 1, 1)) as VIIMSUUOUOSI ");
      SQL.append("from ");
      SQL.append("  VISTA_IMP_SUB_UO_UT A, ");
      SQL.append("  BEN C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI442.ROWNAMEESERC~~) ");
      SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI442.ROWNAMEUOGES~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
      SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1) = NVL(~~TBL_PARAMETRI442.ROWNAMEUOUTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1))) ");
      SQL.append("and   (((~~TBL_PARAMETRI442.ROWNAMEUOGES~~ IS NULL)) OR (NVL(A.SCADENZA_UO, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
      SQL.append("and   (((~~TBL_PARAMETRI442.ROWNAMEUOUTI~~ IS NULL)) OR (NVL(A.SCADENZA_UT, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
      SQL.append("and   (A.DATA_REG >= NVL(~~TBL_PARAMETRI442.ROWNAMEDAL~~, A.DATA_REG)) ");
      SQL.append("and   ((A.ANNO_IMP < ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
      SQL.append("and   (~~PQRY_PARAMETRI441.ROWNAMSUBIMP~~ = A.SE_SUBIMP OR A.SE_SUBIMP = 'NO') ");
      SQL.append("and   (C.CODICE(+) = A.BENEFICIARIO) ");
      SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI442.ROWNAMECAPIT~~) ");
      SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI442.ROWNAMEARTIC~~) ");
      SQL.append("order by 1, 2, 24, 25 ");
      BUK_ELENIMPEBOOK.SetReportQuery(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "DAD562AB-8CAA-4683-AA25-FFE8CBB9F31E");
      if (BUK_ELENIMPEBOOK.FindObjByID(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD) != null)
        BUK_ELENIMPEBOOK.AddReportGroup(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, "CAPITOLO");
      if (BUK_ELENIMPEBOOK.FindObjByID(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD) != null)
        BUK_ELENIMPEBOOK.AddReportGroup(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, "ARTICOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_Init()
  {
    BUK_ELENIMPEBOOK.InitReport(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, 196865);
    BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_InitQuery(true, false);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "AE8B6047-F058-47CA-97B0-27DA7C586BB9");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, "ELENIMPEREPO");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_REPORTHEADER, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_REPORTHEADER, "FACDF1E2-6DD4-4680-AFA6-B0775431520C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_PAGEHEADER, BUK_ELENIMPEBOOK_RPTBOX_PAGEHEADER);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_PAGEHEADER, "F897E2AA-3063-4388-A079-564992E13CE0");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "CAPITOLO");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, "6A973D84-65BF-4FD5-B44C-2FFBA0096736");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, "CAPIGROUHEAD");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "ARTICOLO");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, "E0B1BD79-11AA-4E49-B7FA-C7CAB5533674");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, "ARTIGROUHEAD");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_VOCEPEGHEADE, 0, 1000, 3300, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEGHEADE, "75A0B362-03FC-4019-9F9A-9AE89C0F6602");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEGHEADE, BUK_ELENIMPEBOOK_SPAN_C, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_C, "5718836D-4D5F-4411-B96C-B7F67E934D3B");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_C, "C");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_IMPEGNHEADER, 3900, 1000, 1100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNHEADER, "28E377F1-CA5E-4714-B79B-B997CB36F906");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNHEADER, BUK_ELENIMPEBOOK_SPAN_IMPEGNO1, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_IMPEGNO1, "A70D20BB-E5C3-492E-A724-519A31D17940");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGHEAD, 5200, 1000, 1700, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGHEAD, "6621F67F-4E80-47C9-A06A-AE77A5FC452C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGHEAD, BUK_ELENIMPEBOOK_SPAN_IMPEGNO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_IMPEGNO, "49E6E4D6-B689-4ECE-ABB4-C8223CC16AFF");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_IMPEGNO, "IMPEGNO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_IMPORTHEADER, 6900, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_IMPORTHEADER, "12B1BFBC-E5A3-4971-B372-2B20AF0CAD84");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_IMPORTHEADER, BUK_ELENIMPEBOOK_SPAN_IMPORTO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_IMPORTO, "291CC986-BE90-4A00-9C01-D701EAAC490D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_IMPORTO, "IMPORTO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_SUBIMPHEADER, 9200, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPHEADER, "83A33680-1DFB-469C-AB0E-9564EDB6D613");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPHEADER, "SUBIMPHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPHEADER, BUK_ELENIMPEBOOK_SPAN_SUBIMPEGNATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Sub-Impegnato", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_SUBIMPEGNATO, "49D1634A-F881-4176-8BF2-A658CB6EB1A2");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_LIQUIDHEADER, 11500, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDHEADER, "9C6C1EF6-AC41-4457-B6C0-F0112E19C3DC");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDHEADER, BUK_ELENIMPEBOOK_SPAN_LIQUIDATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Liquidato", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_LIQUIDATO, "5A3CF7D9-FC90-4742-A592-43C21C7D449C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_LIQUIDATO, "LIQUIDATO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_MANDATHEADER, 13800, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_MANDATHEADER, "B2BCD887-A49C-4C39-9941-8AF9A89C57F3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_MANDATHEADER, BUK_ELENIMPEBOOK_SPAN_PAGATO, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Pagato", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_PAGATO, "2FA5C5AA-781D-49D8-89CD-2E42F9ABA01D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_PAGATO, "PAGATO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_DISPONHEADER, 16100, 1000, 2200, 300, 0, 1, 1, MyGlb.VIS_INTSEBORFOR1, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DISPONHEADER, "CF011323-0D15-40CE-95F7-019325B32079");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DISPONHEADER, BUK_ELENIMPEBOOK_SPAN_DISPONIBILIT, MyGlb.VIS_INTSEBORFOR1, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_DISPONIBILIT, "136C5AEC-017C-481D-AD9A-652852AF0D4F");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_DATAREGHEADE, 18400, 1000, 1200, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DATAREGHEADE, "B96D9133-78E8-49CF-A469-7D96B63F7DBB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DATAREGHEADE, BUK_ELENIMPEBOOK_SPAN_DATAREG, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_DATAREG, "1144B7DF-ED78-4268-A364-F342D798994F");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_DATAREG, "DATAREG");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_DESCRIHEADER, 19700, 700, 2600, 700, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DESCRIHEADER, "A723A7A7-C480-40F1-BCDB-251FB7BB0448");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DESCRIHEADER, BUK_ELENIMPEBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Descrizione e Beneficiario", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_DESCRIZIONE, "C100934B-D30C-43A1-9E00-CAE4B84D90C8");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_SEDEDELHEADE, 22800, 1000, 1500, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SEDEDELHEADE, "9D92EAA5-A3A3-41E6-BA5F-8A82456A7BBB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SEDEDELHEADE, "SEDEDELHEADE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SEDEDELHEADE, BUK_ELENIMPEBOOK_SPAN_SEDEDEL, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Delibera", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_SEDEDEL, "95716FAF-787C-4AB4-A47A-F8A9A77767A5");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_SEDEDEL, "SEDEDEL");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_IMPEOBBLHEAD, 26600, 1000, 644, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_IMPEOBBLHEAD, "C040F910-6980-4778-8EDB-6B42FF131374");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_IMPEOBBLHEAD, "IMPEOBBLHEAD");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_IMPEOBBLHEAD, BUK_ELENIMPEBOOK_SPAN_OBBLIGATORIO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Obb.", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_OBBLIGATORIO, "D4600A2B-1484-4E14-AF5B-3B5C16E92D83");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_OBBLIGATORIO, "OBBLIGATORIO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_UNITPROPHEAD, 24900, 1000, 1600, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_UNITPROPHEAD, "C1D11B85-0363-4E5F-9717-1B87B9515E56");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_UNITPROPHEAD, "UNITPROPHEAD");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_UNITPROPHEAD, BUK_ELENIMPEBOOK_SPAN_UNITAPROPONE, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Proposta", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_UNITAPROPONE, "53C418AF-883A-4A6B-ACBA-AF2CC2A1917C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_UNITAPROPONE, "UNITAPROPONE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, BUK_ELENIMPEBOOK_RPTBOX_VOCEPEG, 0, 100, 27500, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEG, "934DDA99-39F2-48D7-BFCC-D8A54E0E2EAC");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_VOCEPEG, BUK_ELENIMPEBOOK_SPAN_VISUUVPEGEIC, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271384961, "Voce P.e.g. +c Space +c To String (VISTA IMP SUB UO UT INTERVENTO) +c If (Is Null (VISTA IMP SUB UO UT CAPITOLO), Null String, trattino con spazi +c To String (VISTA IMP SUB UO UT CAPITOLO)) +c If (Is Null (VISTA IMP SUB UO UT ARTICOLO), Null String, barra con spazi +c To String (VISTA IMP SUB UO UT ARTICOLO))", "::VIIMSUUUVPEG", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUVPEGEIC, "D3FAAE11-BE62-4EA7-81C0-0BA800B82270");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUVPEGEIC, "VISUUVPEGEIC");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_DETAIL, "F17FACE9-BD2E-47FA-A7E4-62443455A649");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_DETAIL, "DETAIL");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_CAPITOLO, 0, 0, 2600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_CAPITOLO, "7A1CE719-7546-453E-8E6C-4CE73AB0D907");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_CAPITOLO, BUK_ELENIMPEBOOK_SPAN_VISUUCEICEIB, MyGlb.VIS_NORMALEA7, 3, 16, 6, 271384961, "", "::CAPITOLO", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUCEICEIB, "9CFF5E51-AE1A-4977-A7F0-023AFC9FF142");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUCEICEIB, "VISUUCEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_BARRAVOCEPEG, 2700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRAVOCEPEG, "C6D722C2-5DED-46A8-B47F-CB3B198FE053");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_BARRAVOCEPEG, BUK_ELENIMPEBOOK_SPAN_BARRAVOCEPEG, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_BARRAVOCEPEG, "88AE3BD1-57B5-4DFF-ADB7-A88F8C208B36");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_BARRAVOCEPEG, "BARRAVOCEPEG");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_ARTICOLO, 2900, 0, 300, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_ARTICOLO, "7AC05E25-3745-4D31-989D-1FDD370A65B3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_ARTICOLO, "ARTICOLO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_ARTICOLO, BUK_ELENIMPEBOOK_SPAN_VISUUAEICEIB, MyGlb.VIS_NORMALEA7, 1, 2, 0, 271384961, "", "::ARTICOLO", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUAEICEIB, "220D6415-4914-4FCA-999B-7C5A6B044432");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUAEICEIB, "VISUUAEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_NUMEROIMP, 3500, 0, 700, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_NUMEROIMP, "A41EA2F8-A79C-4A21-85FE-6936A9F9DFD6");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_NUMEROIMP, "NUMEROIMP");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_NUMEROIMP, BUK_ELENIMPEBOOK_SPAN_VISUUNIEICEI, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::NUMERO_IMP", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUNIEICEI, "8434395B-C713-4364-A056-D780A842F087");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUNIEICEI, "VISUUNIEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_BARRAIMPEGNO, 4200, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRAIMPEGNO, "2A46939F-FD15-4FC1-B75A-9EDBA9ABDFF7");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_BARRAIMPEGNO, BUK_ELENIMPEBOOK_SPAN_BARRAIMPEGNO, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_BARRAIMPEGNO, "41D21FED-BF95-4752-87B7-82F59307C997");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_BARRAIMPEGNO, "BARRAIMPEGNO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_ANNOIMP, 4400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_ANNOIMP, "FAD74F45-ED59-4948-B505-F11D11CC488B");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_ANNOIMP, "ANNOIMP");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_ANNOIMP, BUK_ELENIMPEBOOK_SPAN_VISUUAIEICEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::ANNO_IMP", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUAIEICEI, "29A158E6-43F2-4E1A-8921-EAAD26721BFE");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUAIEICEI, "VISUUAIEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_NUMEROSUBIMP, 5100, 0, 800, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_NUMEROSUBIMP, "586808BC-8EA4-4D40-9606-4B6BB218A92B");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_NUMEROSUBIMP, "NUMEROSUBIMP");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_NUMEROSUBIMP, BUK_ELENIMPEBOOK_SPAN_VISUUNSEICEI, MyGlb.VIS_NORMALEA7, 1, 5, 0, 271384961, "", "::NUMERO_SUBIMP", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUNSEICEI, "D40D6874-B09E-48E4-BE98-FE27DCBAB153");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUNSEICEI, "VISUUNSEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_BARRASUBIMPE, 6000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRASUBIMPE, "33EF3514-EA27-4584-8B39-67B8062004C6");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_BARRASUBIMPE, BUK_ELENIMPEBOOK_SPAN_BARRASUBIMPE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_BARRASUBIMPE, "1EA1DBD3-708B-41CC-8210-298472B6BF19");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_BARRASUBIMPE, "BARRASUBIMPE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_ANNOSUBIMP, 6200, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_ANNOSUBIMP, "EB774ACC-F293-4569-B539-1B6E933414F0");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_ANNOSUBIMP, "ANNOSUBIMP");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_ANNOSUBIMP, BUK_ELENIMPEBOOK_SPAN_VISUUASEICEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384961, "", "::ANNO_SUBIMP", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUASEICEI, "9580AAF0-7DEB-41DA-BF0D-047793A45FF2");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUASEICEI, "VISUUASEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_IMPORTO, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_IMPORTO, "A05531BF-D4BF-4A3B-89F9-805BF39816CB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_IMPORTO, "IMPORTO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_IMPORTO, BUK_ELENIMPEBOOK_SPAN_VISUUIEICEIB, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::IMPORTO", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUIEICEIB, "87158DC2-9118-45E5-ACD1-C237FCE9CB69");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUIEICEIB, "VISUUIEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGNATO, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGNATO, "633E3DC2-2783-496A-963D-BB0587C1510C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGNATO, "SUBIMPEGNATO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUBIMPEGNATO, BUK_ELENIMPEBOOK_SPAN_VISUUSIEICEI, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::SUBIMPEGNATO", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUSIEICEI, "8C2B3B3C-2514-46F2-887A-324DD8B431F6");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUSIEICEI, "VISUUSIEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_LIQUIDATO, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDATO, "68AF2538-C9C4-4C31-A768-C3DB74CC7223");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDATO, "LIQUIDATO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_LIQUIDATO, BUK_ELENIMPEBOOK_SPAN_VISUULEICEIB, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "Liquidato", "::VIIMSUUOUTLI", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUULEICEIB, "596FBB21-7F5C-4AFE-892A-71434AD3DA5C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUULEICEIB, "VISUULEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_MANDATI, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_MANDATI, "CC773F6D-9A16-45D2-8336-C3BB3A7E8E70");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_MANDATI, "MANDATI");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_MANDATI, BUK_ELENIMPEBOOK_SPAN_VISUUPEICEIB, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::MANDATI", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUPEICEIB, "6B89B577-AC7C-4F64-897C-D4751C50D357");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUPEICEIB, "VISUUPEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_DISPONIBILIT, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DISPONIBILIT, "45606380-9856-4DDA-8DAC-9E37549068AB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DISPONIBILIT, BUK_ELENIMPEBOOK_SPAN_VISUUDEICEI1, MyGlb.VIS_IMPOFONTRIDO, 3, 14, 6, 271384705, "Brief description of field content.", "::DISPONIBILITA", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUDEICEI1, "E2EF7DF6-9E2C-43F8-AF44-4AA6331EC30D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUDEICEI1, "VISUUDEICEI1");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_DATAREG, 18400, 0, 1200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DATAREG, "E6AC35DC-EBB8-4B21-98D3-4C130553C3E3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DATAREG, "DATAREG");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DATAREG, BUK_ELENIMPEBOOK_SPAN_VISUUDREICEI, MyGlb.VIS_NORMALEA7, 6, 10, 0, 271384705, "Brief description of field content.", "::DATA_REG", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUDREICEI, "EEDF8719-35CE-48B5-A177-F3A1A72C967C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUDREICEI, "VISUUDREICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_DESCRIZIONE, 19700, 0, 2600, 300, 0, 1, 3, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_DESCRIZIONE, "DCACFEBE-C027-480E-AEE0-4795AE336738");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_DESCRIZIONE, BUK_ELENIMPEBOOK_SPAN_VISUUDEICEIB, MyGlb.VIS_NORMALEA7, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUDEICEIB, "C531113A-22CD-4131-B1E5-6B061D8EE9F3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUDEICEIB, "VISUUDEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_SEDEDEL, 22400, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SEDEDEL, "2CE3B256-5A54-4712-9180-DA9562C89C61");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SEDEDEL, "SEDEDEL");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SEDEDEL, BUK_ELENIMPEBOOK_SPAN_VISUUSDEICEI, MyGlb.VIS_NORMALEA7, 5, 255, 0, 271384705, "Brief description of field content.", "::SEDE_DEL", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUSDEICEI, "1B103003-C2C3-43D7-ACA0-5E1D0D426068");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUSDEICEI, "VISUUSDEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_NUMERODEL, 23200, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_NUMERODEL, "514FEE6F-03A6-45BA-93BA-E68A97DDDB14");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_NUMERODEL, "NUMERODEL");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_NUMERODEL, BUK_ELENIMPEBOOK_SPAN_VISUUNDEICEI, MyGlb.VIS_NORMALEA7, 1, 6, 0, 271384705, "Brief description of field content.", "::NUMERO_DEL", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUNDEICEI, "AF9E4FDC-09FC-4F3A-9C59-D5159456090D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUNDEICEI, "VISUUNDEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_ANNODEL, 23900, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_ANNODEL, "254F3883-6472-44D2-857A-F5D4EC2AC813");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_ANNODEL, "ANNODEL");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_ANNODEL, BUK_ELENIMPEBOOK_SPAN_VISUUADEICEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::ANNO_DEL", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUADEICEI, "17A6C440-6584-4C9A-A93E-E1C1CA94A265");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUADEICEI, "VISUUADEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_IMPEGNOBBLIG, 26600, 0, 644, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNOBBLIG, "EA12D3C4-E113-41B0-9846-DFCCC127AA01");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNOBBLIG, "IMPEGNOBBLIG");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_IMPEGNOBBLIG, BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB, MyGlb.VIS_NORMALEA7, 5, 2, 0, 271384705, "Brief description of field content.", "::IMPEGNO_OBBLIG", 1);
    BUK_ELENIMPEBOOK.SetSpanValueListItem(BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "", -1);
    BUK_ELENIMPEBOOK.SetSpanValueListItem(BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB, "Null", "Type the value and explain what it means.", (new IDVariant()), null, "", -1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB, "B67B82DB-079B-43F3-8A39-4C0C61962EA5");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUOEICEIB, "VISUUOEICEIB");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_UNITAPROPONE, 24500, 0, 600, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_UNITAPROPONE, "D64D65F1-39CA-4FD0-BEF5-0DF380434ED9");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_UNITAPROPONE, "UNITAPROPONE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_UNITAPROPONE, BUK_ELENIMPEBOOK_SPAN_VISUUUPEICEI, MyGlb.VIS_NORMALEA7, 5, 255, 0, 271384705, "Brief description of field content.", "::UNITA_PROPONENTE", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUUPEICEI, "55727765-5195-4183-8C87-8531C38DD3A8");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUUPEICEI, "VISUUUPEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_NUMEROPROPOS, 25300, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPROPOS, "DFE4E9B0-78CF-4AD9-A5A9-088CF62A3C38");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPROPOS, "NUMEROPROPOS");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_NUMEROPROPOS, BUK_ELENIMPEBOOK_SPAN_VISUUNPEICEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::NUMERO_PROPOSTA", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUNPEICEI, "E440D014-9178-484B-81A6-6AC627ED785C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUNPEICEI, "VISUUNPEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_ANNOPROPOSTA, 25976, 0, 500, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_ANNOPROPOSTA, "1D681957-EFD7-49CB-B107-42B68B9E0DFA");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_ANNOPROPOSTA, "ANNOPROPOSTA");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_ANNOPROPOSTA, BUK_ELENIMPEBOOK_SPAN_VISUUAPEICEI, MyGlb.VIS_NORMALEA7, 1, 4, 0, 271384705, "Brief description of field content.", "::ANNO_PROPOSTA", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_VISUUAPEICEI, "0163ADE5-5C63-45D9-9387-32B828DF7264");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_VISUUAPEICEI, "VISUUAPEICEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_TRATTIDELIBE, 23000, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_TRATTIDELIBE, "B21C20CA-B99E-43CF-81C9-5DADEFFAB8DE");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_TRATTIDELIBE, BUK_ELENIMPEBOOK_SPAN_TRATTIDELIBE, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_TRATTIDELIBE, "397BDB29-406E-4799-B2DD-EC63B5486C8C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_TRATTIDELIBE, "TRATTIDELIBE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_BARRADELIBER, 23700, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRADELIBER, "C987612A-03E5-4294-8AB2-E0B36BF7AD7E");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRADELIBER, "BARRADELIBER");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_BARRADELIBER, BUK_ELENIMPEBOOK_SPAN_BARRADELIBER, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_BARRADELIBER, "098A6945-2727-409E-A36E-B354C708F209");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_BARRADELIBER, "BARRADELIBER");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_TRATTIPROPOS, 25100, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_TRATTIPROPOS, "A5380FD4-C0EF-48F4-BFCE-B702F950C627");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_TRATTIPROPOS, BUK_ELENIMPEBOOK_SPAN_TRATTIPROPOS, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_TRATTIPROPOS, "17F8A3B4-2B20-4AF1-ACBE-32F93D52A23B");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_TRATTIPROPOS, "TRATTIPROPOS");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_DETAIL, BUK_ELENIMPEBOOK_RPTBOX_BARRAPROPOST, 25800, 0, 200, 300, 0, 1, 1, MyGlb.VIS_NORMALEA7, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRAPROPOST, "FD94C979-D032-446C-B594-6C888012C519");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRAPROPOST, "BARRAPROPOST");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_BARRAPROPOST, BUK_ELENIMPEBOOK_SPAN_BARRAPROPOST, MyGlb.VIS_NORMALEA7, 5, 99, 0, 271319425, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_BARRAPROPOST, "25CEBB4D-7433-4ADC-9B22-031470E7B23C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_BARRAPROPOST, "BARRAPROPOST");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "ARTICOLO");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, "1B8DD6D9-DA99-4ECB-AEAD-D467DDC71949");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, "ARTIGROUFOOT");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT1, 6900, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT1, "679EA5FC-19CC-4F8C-9333-A7529AA9B7A3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT1, BUK_ELENIMPEBOOK_SPAN_AGFSVISUUIEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUIEI, "79FF6C51-8319-4CBA-BADD-A0756A4C728D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUIEI, "AGFSVISUUIEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP1, 9200, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP1, "B82FBD7A-BD71-402F-BFAB-00227843071C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP1, "SUMOFSUBIMP1");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP1, BUK_ELENIMPEBOOK_SPAN_AGFSVISUUSIE, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUSIE, "45E400F0-EC7E-414F-B79C-D0B7B78D5ACC");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUSIE, "AGFSVISUUSIE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID1, 11500, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID1, "A385E18A-577F-4A21-BDE5-0C828681098C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID1, "SUMOFLIQUID1");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID1, BUK_ELENIMPEBOOK_SPAN_AGFSVISUULEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_AGFSVISUULEI, "43C76BCB-0BCD-4651-84B1-E84925BD1E44");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_AGFSVISUULEI, "AGFSVISUULEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO1, 13800, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO1, "BBF90887-02A4-47E2-B276-7E4652F4F28A");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO1, "SUMOFPAGATO1");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO1, BUK_ELENIMPEBOOK_SPAN_AGFSVISUUPEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUPEI, "D1D4ABF2-5553-4457-AAA2-DD237569445C");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUPEI, "AGFSVISUUPEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON1, 16100, 100, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON1, "55EBF58A-246F-499A-9F9D-D7A4E26B6138");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON1, BUK_ELENIMPEBOOK_SPAN_AGFSVISUUDEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUDEI, "456392DC-F7DA-4BDA-9F18-79EB7C6DAB9E");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_AGFSVISUUDEI, "AGFSVISUUDEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_TOTALEARTICO, 4700, 100, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_TOTALEARTICO, "BEDB50F9-6706-406B-AC8B-7B8233E8DA3A");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_TOTALEARTICO, BUK_ELENIMPEBOOK_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_TOTALEARTICO, "12EA9F6E-719A-4941-B1CB-7B2AF7DDFD77");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_ARTIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_BARRA, 6900, 0, 11400, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_BARRA, "D6A62D3E-1A07-4569-97F7-6573942180AA");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_BARRA, "BARRA");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "CAPITOLO");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, "FF52EEC0-6409-401B-B22A-2A2C52B9E87B");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, "CAPIGROUFOOT");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT2, 6900, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT2, "B86445D5-5B80-4AED-A8E8-005F312117EB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT2, "SUMOFIMPORT2");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFIMPORT2, BUK_ELENIMPEBOOK_SPAN_CGFSVISUUIEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUIEI, "4CDD1CC7-A671-4653-A33F-2D76BF8347BB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUIEI, "CGFSVISUUIEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP2, 9200, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP2, "ABF3D2A8-B3BF-4463-8C29-3A4F63AA7940");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP2, "SUMOFSUBIMP2");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFSUBIMP2, BUK_ELENIMPEBOOK_SPAN_CGFSVISUUSIE, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUSIE, "F2FEC094-7D5D-4A92-9F6D-55C1F8030567");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUSIE, "CGFSVISUUSIE");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID2, 11500, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID2, "07855480-CCB4-4ACA-9FFB-E922A3631A86");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID2, "SUMOFLIQUID2");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFLIQUID2, BUK_ELENIMPEBOOK_SPAN_CGFSVISUULEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_CGFSVISUULEI, "4C2B4DC2-4994-4178-B18C-48CD65659D8D");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_CGFSVISUULEI, "CGFSVISUULEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO2, 13800, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO2, "B3477CBC-39C3-4123-AB69-9D2BB2ACF854");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO2, "SUMOFPAGATO2");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFPAGATO2, BUK_ELENIMPEBOOK_SPAN_CGFSVISUUPEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUPEI, "509C3A7C-1F25-4C47-B37C-1481761270B3");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUPEI, "CGFSVISUUPEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON2, 16100, 0, 2200, 300, 0, 1, 1, MyGlb.VIS_IMPOFONTRIDO, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON2, "9DD83410-A972-41BA-BE12-D1449EE0FB01");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON2, "SUMOFDISPON2");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_SUMOFDISPON2, BUK_ELENIMPEBOOK_SPAN_CGFSVISUUDEI, MyGlb.VIS_IMPOFONTRIDO, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUDEI, "C7C0E05D-8143-4766-9737-BBB047BCEFE4");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_CGFSVISUUDEI, "CGFSVISUUDEI");
    BUK_ELENIMPEBOOK.InitReportBox(BUK_ELENIMPEBOOK_SEC_CAPIGROUFOOT, BUK_ELENIMPEBOOK_RPTBOX_TOTALECAPITO, 4700, 0, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENBOFORI, 983041, 286, "", 1, -33);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_RPTBOX_TOTALECAPITO, "09A50D2A-17FA-4208-9AB9-2A0CB095E2AB");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_ELENIMPEBOOK.InitBoxSpan(BUK_ELENIMPEBOOK_RPTBOX_TOTALECAPITO, BUK_ELENIMPEBOOK_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBOFORI, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SPAN_TOTALECAPITO, "18466387-7B23-4865-BCE0-239010ABB88A");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_PAGEFOOTER, BUK_ELENIMPEBOOK_RPTBOX_PAGEFOOTER);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_PAGEFOOTER, "45AE6018-FEE1-4DD6-85F4-8704730953B9");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ELENIMPEBOOK.InitSection(BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO, BUK_ELENIMPEBOOK_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENIMPEBOOK.SetSectionRendersInto(BUK_ELENIMPEBOOK_SEC_REPORTFOOTER, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENIMPEBOOK.SetRTCGuid(BUK_ELENIMPEBOOK_SEC_REPORTFOOTER, "040EAD50-8C0A-4B15-B532-C4E6453B9702");
    BUK_ELENIMPEBOOK.SetObjCode(BUK_ELENIMPEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ELENIMPEBOOK.AddReportGroup(BUK_ELENIMPEBOOK_SEC_CAPIGROUHEAD, "CAPITOLO");
    BUK_ELENIMPEBOOK.AddReportGroup(BUK_ELENIMPEBOOK_SEC_ARTIGROUHEAD, "ARTICOLO");
    BUK_ELENIMPEBOOK_RPT_ELENIMPEREPO_InitQuery(false, true);
  }

  private void BUK_ELENIMPEBOOK_InitLinks()
  {
    BUK_ELENIMPEBOOK.SetBoxNextBox(BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY, BUK_ELENIMPEBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ELENCOIMPEGN) PAN_ELENCOIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ELENIMPEBOOK) BUK_ELENIMPEBOOK_OnPreview();
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
