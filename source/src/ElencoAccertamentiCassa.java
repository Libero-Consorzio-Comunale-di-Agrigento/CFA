// **********************************************
// Elenco Accertamenti Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAccertamentiCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DAL = 0;

  private static int PPQRY_PARAMETRI443 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ELENCOACCERT_CAPITOLO = 0;
  private static int PFL_ELENCOACCERT_ARTICOLO = 1;
  private static int PFL_ELENCOACCERT_NUMEROACC = 2;
  private static int PFL_ELENCOACCERT_ANNOACC = 3;
  private static int PFL_ELENCOACCERT_INFOACCERTAM = 4;
  private static int PFL_ELENCOACCERT_DEBITORE = 5;
  private static int PFL_ELENCOACCERT_RAGIONSOCIAL = 6;
  private static int PFL_ELENCOACCERT_IMPORTO = 7;
  private static int PFL_ELENCOACCERT_ORDINATIVI = 8;
  private static int PFL_ELENCOACCERT_DISPONIBILIT = 9;
  private static int PFL_ELENCOACCERT_DATA = 10;
  private static int PFL_ELENCOACCERT_DESCRIZIONE = 11;
  private static int PFL_ELENCOACCERT_SEDEDEL = 12;
  private static int PFL_ELENCOACCERT_NUMERODEL = 13;
  private static int PFL_ELENCOACCERT_ANNODEL = 14;
  private static int PFL_ELENCOACCERT_UNITAPROPONE = 15;
  private static int PFL_ELENCOACCERT_NUMEROPROPOS = 16;
  private static int PFL_ELENCOACCERT_ANNOPROPOSTA = 17;
  private static int PFL_ELENCOACCERT_CODLIVELLO5 = 18;
  private static int PFL_ELENCOACCERT_CODICEEUROPE = 19;
  private static int PFL_ELENCOACCERT_FINANZIAMENT = 20;
  private static int PFL_ELENCOACCERT_CAPITOLOART = 21;
  private static int PFL_ELENCOACCERT_ACCERTAMENTO = 22;
  private static int PFL_ELENCOACCERT_DELIBERA = 23;
  private static int PFL_ELENCOACCERT_PROPOSTA = 24;
  private static int PFL_ELENCOACCERT_ESERCIZIO = 25;

  private static int PPQRY_VISTAACCELE2 = 0;


  IDPanel PAN_ELENCOACCERT;
  CIDREObj BUK_ELENACCEBOOK;
  OBook BKW_ELENACCEBOOK;
  //
  // Template Pages constants
  private static int BUK_ELENACCEBOOK_MST_ELEACCBOOPAG = 1;
  private static int BUK_ELENACCEBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ELENACCEBOOK_SPAN_CPTSEABEACPN = 3;
  private static int BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_ELENACCEBOOK_SPAN_ACCERDIENTRA = 5;
  private static int BUK_ELENACCEBOOK_RPTBOX_PAGEBODY = 6;
  private static int BUK_ELENACCEBOOK_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_ELENACCEBOOK_RPT_ELENACCEREPO = 8;
  private static int BUK_ELENACCEBOOK_SEC_REPORTHEADER = 9;
  private static int BUK_ELENACCEBOOK_SEC_PAGEHEADER = 10;
  private static int BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD = 11;
  private static int BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD = 12;
  private static int BUK_ELENACCEBOOK_RPTBOX_IMPORTHEADER = 13;
  private static int BUK_ELENACCEBOOK_SPAN_IMPORTO = 14;
  private static int BUK_ELENACCEBOOK_RPTBOX_ORDINAHEADER = 15;
  private static int BUK_ELENACCEBOOK_SPAN_ORDINATIVI = 16;
  private static int BUK_ELENACCEBOOK_RPTBOX_DISPONHEADER = 17;
  private static int BUK_ELENACCEBOOK_SPAN_DISPONIBILIT = 18;
  private static int BUK_ELENACCEBOOK_RPTBOX_DATAREGHEADE = 19;
  private static int BUK_ELENACCEBOOK_SPAN_DATA = 20;
  private static int BUK_ELENACCEBOOK_RPTBOX_ACCERTHEADER = 21;
  private static int BUK_ELENACCEBOOK_SPAN_ACCERTAMENTO = 22;
  private static int BUK_ELENACCEBOOK_RPTBOX_DELIBEHEADER = 23;
  private static int BUK_ELENACCEBOOK_SPAN_DELIBERA = 24;
  private static int BUK_ELENACCEBOOK_RPTBOX_VOCEPEG = 25;
  private static int BUK_ELENACCEBOOK_SPAN_VOCEPEG = 26;
  private static int BUK_ELENACCEBOOK_SEC_DETAIL = 27;
  private static int BUK_ELENACCEBOOK_RPTBOX_IMPORTO = 28;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEIEACEAB = 29;
  private static int BUK_ELENACCEBOOK_RPTBOX_ORDINATIVI = 30;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEOEACEAB = 31;
  private static int BUK_ELENACCEBOOK_RPTBOX_DISPONIBILIT = 32;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEDEACEA1 = 33;
  private static int BUK_ELENACCEBOOK_RPTBOX_DATAREG = 34;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEDEACEA2 = 35;
  private static int BUK_ELENACCEBOOK_RPTBOX_ACCERTAMENTO = 36;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEAEACEAB = 37;
  private static int BUK_ELENACCEBOOK_RPTBOX_DELIBERA = 38;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEDEACEA3 = 39;
  private static int BUK_ELENACCEBOOK_SEC_DETAILDESCRI = 40;
  private static int BUK_ELENACCEBOOK_RPTBOX_DESCRIZIONE = 41;
  private static int BUK_ELENACCEBOOK_SPAN_VIACEDEACEAB = 42;
  private static int BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT = 43;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT1 = 44;
  private static int BUK_ELENACCEBOOK_SPAN_AGFSVAEIEACE = 45;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA1 = 46;
  private static int BUK_ELENACCEBOOK_SPAN_AGFSVAEOEACE = 47;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON1 = 48;
  private static int BUK_ELENACCEBOOK_SPAN_AGFSVAEDEACE = 49;
  private static int BUK_ELENACCEBOOK_RPTBOX_TOTALEARTICO = 50;
  private static int BUK_ELENACCEBOOK_SPAN_TOTALEARTICO = 51;
  private static int BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT = 52;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT2 = 53;
  private static int BUK_ELENACCEBOOK_SPAN_CGFSVAEIEACE = 54;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA2 = 55;
  private static int BUK_ELENACCEBOOK_SPAN_CGFSVAEOEACE = 56;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON2 = 57;
  private static int BUK_ELENACCEBOOK_SPAN_CGFSVAEDEACE = 58;
  private static int BUK_ELENACCEBOOK_RPTBOX_TOTALECAPIT1 = 59;
  private static int BUK_ELENACCEBOOK_SPAN_TOTALECAPIT1 = 60;
  private static int BUK_ELENACCEBOOK_SEC_PAGEFOOTER = 61;
  private static int BUK_ELENACCEBOOK_SEC_REPORTFOOTER = 62;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORTO = 63;
  private static int BUK_ELENACCEBOOK_SPAN_RFSVAEIEACEA = 64;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINAT = 65;
  private static int BUK_ELENACCEBOOK_SPAN_RFSVAEOEACEA = 66;
  private static int BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPONI = 67;
  private static int BUK_ELENACCEBOOK_SPAN_RFSVAEDEACEA = 68;
  private static int BUK_ELENACCEBOOK_RPTBOX_TOTALECAPITO = 69;
  private static int BUK_ELENACCEBOOK_SPAN_TOTALECAPITO = 70;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI444(IMDB);
    //
    //
    Init_PQRY_VISTAACCELE2(IMDB);
    Init_PQRY_PARAMETRI443(IMDB);
    Init_PQRY_PARAMETRI443_RS(IMDB);
    Init_PQRY_VISTAACCELE3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI444(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI444, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI444, "TBL_PARAMETRI444");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMESERCIZ,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI444,IMDBDef4.FLD_PARAMETRI444_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI444, 0);
  }

  private static void Init_PQRY_VISTAACCELE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VISTAACCELE2, 22);
    IMDB.set_TblCode(IMDBDef13.PQRY_VISTAACCELE2, "PQRY_VISTAACCELE2");
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELINAC, "VISACCELINAC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELINAC,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VIACELBERSEE, "VIACELBERSEE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VIACELBERSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ORDINATIVI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELEFIN, "VISACCELEFIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELEFIN,5,398,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACELCOLI5, "VISACELCOLI5");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACELCOLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELCOEU, "VISACCELCOEU");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE2,IMDBDef13.PQSL_VISTAACCELE2_VISACCELCOEU,1,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VISTAACCELE2, 0);
  }

  private static void Init_PQRY_PARAMETRI443(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI443, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI443, "PQRY_PARAMETRI443");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI443,IMDBDef13.PQSL_PARAMETRI443_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI443,IMDBDef13.PQSL_PARAMETRI443_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI443, 0);
  }

  private static void Init_PQRY_PARAMETRI443_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI443_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI443_RS, "PQRY_PARAMETRI443_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI443_RS,IMDBDef13.PQSL_PARAMETRI443_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI443_RS,IMDBDef13.PQSL_PARAMETRI443_PARAMDAL,6,49,0);
  }

  private static void Init_PQRY_VISTAACCELE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VISTAACCELE3, 19);
    IMDB.set_TblCode(IMDBDef13.PQRY_VISTAACCELE3, "PQRY_VISTAACCELE3");
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACELVOPEG, "VISACELVOPEG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACELVOPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEACC, "VISACCELEACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEACC,5,198,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEDEL, "VISACCELEDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEDEL,5,103,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ORDINATIVI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VISTAACCELE3,IMDBDef13.PQSL_VISTAACCELE3_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VISTAACCELE3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAccertamentiCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAccertamentiCassa()
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
    FormIdx = MyGlb.FRM_ELENACCECASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FAEE853B-7CA1-45DD-AE25-FD1228705DDF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 422;
    set_Caption(new IDVariant("Elenco Accertamenti Cassa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 396;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.131313;
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E58D3E88-B5EC-4A96-9833-F3BCC6C3BD10");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 240, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Height = 344;
    Frames[3].Caption = "Elenco Accertamenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 344;
    PAN_ELENCOACCERT = new IDPanel(w, this, 3, "PAN_ELENCOACCERT");
    Frames[3].Content = PAN_ELENCOACCERT;
    PAN_ELENCOACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOACCERT.VS = MainFrm.VisualStyleList;
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ELENACCEBOOK != null)
      PAN_ELENCOACCERT.SetBook(BUK_ELENACCEBOOK);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4902DBF3-64B4-4BF9-8C0D-65229A9ECD5E");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1748, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOACCERT.InitStatus = 1;
    PAN_ELENCOACCERT_Init();
    PAN_ELENCOACCERT_InitFields();
    PAN_ELENCOACCERT_InitQueries();
    BKW_ELENACCEBOOK = new OBook(this);
    BUK_ELENACCEBOOK = new CIDREObj(BKW_ELENACCEBOOK);
    BKW_ELENACCEBOOK.iGuid = "FAAB6BB8-A16E-4BA3-ADDD-0E5029052C8D";
    BKW_ELENACCEBOOK.Code = "BUK_ELENACCEBOOK";
    BKW_ELENACCEBOOK.BookObj = BUK_ELENACCEBOOK;
    BKW_ELENACCEBOOK.InitDefMasks();
    BUK_ELENACCEBOOK.InitBook(1, 3342337, "Elenco Accertamenti Book", IMDB, MainFrm.VisualStyleList);
    BUK_ELENACCEBOOK.InitHTML();
    BUK_ELENACCEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ELENACCEBOOK.Book.SetMainFrm(MainFrm);
    BUK_ELENACCEBOOK.SetRTCGuid(0, "FAAB6BB8-A16E-4BA3-ADDD-0E5029052C8D");
    BUK_ELENACCEBOOK.SetObjCode(0, "ELENACCEBOOK");
    if (PAN_ELENCOACCERT != null)
      PAN_ELENCOACCERT.SetBook(BUK_ELENACCEBOOK);
    BUK_ELENACCEBOOK_MST_ELEACCBOOPAG_Init();
    BUK_ELENACCEBOOK_RPT_ELENACCEREPO_Init();
    BUK_ELENACCEBOOK_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_NUOVO19+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST7+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA3+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV3+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG118+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG117+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG118+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOACC1+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaAccertamenti();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI444, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENACCECASS_PARAMETRI443();
      }
      PAN_ELENCOACCERT.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_ELENACCEBOOK.UpdateBook();
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
    if (Code.equals("BUK_ELENACCEBOOK")) return BUK_ELENACCEBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoAccertamentiCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAccertamentiCassa.class.getName() : (Glb.ClassWithPackage(ElencoAccertamentiCassa.class) ? ElencoAccertamentiCassa.class.getName().substring(ElencoAccertamentiCassa.class.getPackage().getName().length() + 1) : ElencoAccertamentiCassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Accertamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOACCERT);
      // 
      // Elenco Accertamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_DESCRIZIONE,IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_DESCRIZIONE, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_FINANZIAMENT,IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_VISACCELEFIN, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOACCERT.FieldText(PFL_ELENCOACCERT_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ElencoAccertamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Accertamenti On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ELENCOACCERT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Accertamenti On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ELENCOACCERT.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET41+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET41+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ElencoAccertamentiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Accertamenti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOACCERT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Accertamenti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ELENCOACCERT.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ElencoAccertamentiOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMDAL, 0, (new IDVariant()));
      set_Caption(IDL.Add((new IDVariant("Elenco Accertamenti")), MainFrm.ESERCIZIO));
      PAN_ELENCOACCERT.SetCommandEnabled((new IDVariant(16384)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ELENCOACCERT.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO19+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST7+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO19+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST7+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "LoadEvent", _e);
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
        PAN_ELENCOACCERT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "EndModalEvent", _e);
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
      BUK_ELENACCEBOOK.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_ELENACCEBOOK.ReportRefreshQuery(BUK_ELENACCEBOOK_RPT_ELENACCEREPO);
      BUK_ELENACCEBOOK.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_ELENACCEBOOK.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ApriStampa", _e);
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
      PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      new IDVariant(PAN_ELENCOACCERT.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Chiusura Automatica Accertamenti
  // **********************************************************************
  public int ApriChiusuraAutomaticaAccertamenti ()
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
      // Apri Chiusura Automatica Accertamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("ACC")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOACCERT.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOACCERT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOACCERT.GotoFirst();
        while (!PAN_ELENCOACCERT.RSEOF())
        {
          if (PAN_ELENCOACCERT.IsRowSelected(I.intValue()))
          {
            APRCHIAUTACC_IMPACCSEINV1(C3.Get("ESERCIZIO"), C3.Get("CAPITOLO"), C3.Get("ARTICOLO"), C3.Get("ANNO_ACC"), C3.Get("NUMERO_ACC"), C3.Get("DISPONIBILITA"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOACCERT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTACC_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ApriChiusuraAutomaticaAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINV1(IDVariant C3_ESERCIZIO, IDVariant C3_CAPITOLO, IDVariant C3_ARTICOLO, IDVariant C3_ANNO_ACC, IDVariant C3_NUMERO_ACC, IDVariant C3_DISPONIBILITA) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_ESERCIZIO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_CAPITOLO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_ARTICOLO);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_ANNO_ACC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_NUMERO_ACC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_DISPONIBILITA);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ESERCIZIO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_CAPITOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ARTICOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_NUMERO_ACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_DISPONIBILITA, 0));
  }

  // **********************************************************************
  // Apri Info Accertamento
  // **********************************************************************
  public int ApriInfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "ApriInfoAccertamento", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARANUODAESP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMCAPITOL, 0, new IDVariant(IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_CAPITOLO, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAUNITORGA, 0, IMDB.Value(IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMUOGESTI, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      ((Accertamenti)MainFrm.GetForm(MyGlb.FRM_ACCERTAMENTI,0,true,this)).NUOVARIGA();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "Nuovo", _e);
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
      if (IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, IMDB.Value(IMDBDef13.PQRY_VISTAACCELE2, IMDBDef13.PQSL_VISTAACCELE2_NUMERO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiCassa", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENACCECASS_PARAMETRI443() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI443_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI444, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI444, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI443_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI443_RS, 0, IMDBDef4.TBL_PARAMETRI444, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI443_RS, 0, 0, IMDBDef4.TBL_PARAMETRI444, IMDBDef4.FLD_PARAMETRI444_PARAMDAL, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI444, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI444, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI444, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI443_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
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
  private void PAN_ELENCOACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOACCERT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOACCERT, Cancel);
    // Stub
  }

  private void PAN_ELENCOACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOACCERT_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_ELENCOACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ELENACCEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ELENACCEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ELENACCEBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_DETAILDESCRI)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT)
    {
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_AGFSVAEIEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT,"VISACCELEIMP")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_AGFSVAEOEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT,"ORDINATIVI")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_AGFSVAEDEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT)
    {
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_CGFSVAEIEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT,"VISACCELEIMP")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_CGFSVAEOEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT,"ORDINATIVI")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_CGFSVAEDEACE, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ELENACCEBOOK_SEC_REPORTFOOTER)
    {
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_RFSVAEIEACEA, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_REPORTFOOTER,"VISACCELEIMP")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_RFSVAEOEACEA, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_REPORTFOOTER,"ORDINATIVI")));
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_RFSVAEDEACEA, new IDVariant(BUK_ELENACCEBOOK.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ELENACCEBOOK_SEC_REPORTFOOTER,"DISPONIBILITA")));
    }
  }

  private void BUK_ELENACCEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ELENACCEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ELENACCEBOOK_MST_ELEACCBOOPAG)
    {
      BUK_ELENACCEBOOK.set_SpanValue(BUK_ELENACCEBOOK_SPAN_CPTSEABEACPN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELENACCEBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ELENACCEBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ELENACCEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ELENACCEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ELENACCEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ELENACCEBOOK_OnPreview()
  {
    PreviewBook = BKW_ELENACCEBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOACCERT_Init()
  {

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "7046320D-712D-4EA8-BF93-2989D6C16F75");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "CAPITOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "CC8B8BB1-AEE5-493A-913E-178E5488DDA5");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "ARTICOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "8AF4667E-BF80-461E-8498-1DFDA14A5150");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "NUMERO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "2A88424B-D943-4449-8EDA-9FD73B8416D6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "ANNO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "0DC909E4-573A-475C-8959-2A8162C59737");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "Info Accertamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "4CF4CE2C-0B39-4F67-A6BF-729F1ECB10A7");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "Debitore");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "1CFB6F9D-0291-4699-A1F7-E79B0DA4FBB1");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, " ");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "AB9B1154-26D6-423A-86AD-6E72B31567EB");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "Importo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "3BC612CA-30CD-43D3-8C8B-9F7C0CD38140");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "Ordinativi");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "78277526-CC5F-4F29-9AAD-7A38BD371695");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "Disponibilità");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "9188214A-CF1D-484C-9EE6-1D14512A6268");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "Data");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "994B19B3-13A0-4A75-874F-73B71E7599CB");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "Descrizione");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "B2E58A09-39A8-4EE4-B163-9357898B6368");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "SEDE DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "AF0CFAAE-B179-4E53-AA28-3589C176BFD6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "73804CDF-F368-494D-B7D1-519E1B15D6E5");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "ANNO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "E8B467D7-981C-4A3A-83A0-E6B1BC11B71D");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "84AB6B8C-592F-4F59-AB0F-CAB0279DA51D");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "86EE901A-3073-469F-92B5-ADDA7AB4E1B7");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "30D8AB5B-FA7B-4B31-978C-775AE99F1B48");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "V livello");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "4F464003-CADF-4F7D-9FB6-0358CF5ADB8A");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "66364DDD-9FFB-498A-BF84-5E4426CE66F6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "Finanziamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "785841E2-BC88-4C6B-9963-8F5006EB875B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "DC43CE7E-F080-452B-9335-ABF1785BE5BA");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "Accertamento");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "73C732EA-747D-43DC-8735-5116CC23184F");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "Delibera");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "8A9DF38C-5467-4142-A734-009CF4DA91EF");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "Proposta");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "D1DBB43F-695D-45C1-AE48-93A43880AC6C");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, 0, -1);
  }

  private void PAN_ELENCOACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CAPITOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLO, PPQRY_VISTAACCELE2, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ARTICOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ARTICOLO, PPQRY_VISTAACCELE2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 120, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROACC, PPQRY_VISTAACCELE2, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 172, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOACC, PPQRY_VISTAACCELE2, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 216, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 388, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamento");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_INFOACCERTAM, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_INFOACCERTAM, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_INFOACCERTAM, PPQRY_VISTAACCELE2, "DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I')", "VISACCELINAC", 5, 99, 0, -13997);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 240, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DEBITORE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DEBITORE, PPQRY_VISTAACCELE2, "A.DEBITORE", "DEBITORE", 2, 15, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 300, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_RAGIONSOCIAL, PPQRY_VISTAACCELE2, "B.RAGIONE_SOCIALE_ESTESA", "VIACELBERSEE", 5, 60, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 500, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_IMPORTO, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_IMPORTO, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_IMPORTO, PPQRY_VISTAACCELE2, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "VISACCELEIMP", 3, 28, 6, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 620, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 4, 1192, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ORDINATIVI, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ORDINATIVI, PPQRY_VISTAACCELE2, "A.ORDINATIVI", "ORDINATIVI", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 704, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DISPONIBILIT, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DISPONIBILIT, PPQRY_VISTAACCELE2, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 800, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DATA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DATA, PPQRY_VISTAACCELE2, "A.DATA_REG", "DATA_REG", 6, 19, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 864, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DESCRIZIONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DESCRIZIONE, PPQRY_VISTAACCELE2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1104, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_SEDEDEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_SEDEDEL, PPQRY_VISTAACCELE2, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1140, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMERODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMERODEL, PPQRY_VISTAACCELE2, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1188, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNODEL, PPQRY_VISTAACCELE2, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1224, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_UNITAPROPONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_UNITAPROPONE, PPQRY_VISTAACCELE2, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1332, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROPROPOS, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROPROPOS, PPQRY_VISTAACCELE2, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1372, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOPROPOSTA, PPQRY_VISTAACCELE2, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1408, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 484, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODLIVELLO5, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODLIVELLO5, PPQRY_VISTAACCELE2, "A.COD_LIVELLO_5", "VISACELCOLI5", 3, 10, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1480, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 508, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODICEEUROPE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODICEEUROPE, PPQRY_VISTAACCELE2, "A.CODICE_EUROPEO", "VISACCELCOEU", 1, 1, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1516, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 340, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_FINANZIAMENT, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_FINANZIAMENT, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_FINANZIAMENT, PPQRY_VISTAACCELE2, "TO_CHAR ( A.COD_FINANZIAMENTO ) || CASE WHEN NOT ((A.COD_FINANZIAMENTO IS NULL)) THEN ' - ' ELSE '' END || A.DESCR_FINANZIAMENTO", "VISACCELEFIN", 5, 398, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 36, 68, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CAPITOLOART, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 120, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 44, 76, 180, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 3);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ACCERTAMENTO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 1104, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DELIBERA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 1224, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 60, 92, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_PROPOSTA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 388, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ESERCIZIO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ESERCIZIO, PPQRY_VISTAACCELE2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_ELENCOACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOACCERT.SetIMDB(IMDB, "PQRY_VISTAACCELE2", true);
    PAN_ELENCOACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA ACC ELENCO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I') as VISACCELINAC, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as VIACELBERSEE, ");
    SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as VISACCELEIMP, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ORDINATIVI as ORDINATIVI, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  TO_CHAR ( A.COD_FINANZIAMENTO ) || CASE WHEN NOT ((A.COD_FINANZIAMENTO IS NULL)) THEN ' - ' ELSE '' END || A.DESCR_FINANZIAMENTO as VISACCELEFIN, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.COD_LIVELLO_5 as VISACELCOLI5, ");
    SQL.append("  A.CODICE_EUROPEO as VISACCELCOEU ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_ACC_ELENCO A, ");
    SQL.append("  BEN B ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI444.PARAMESERCIZ~~) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI444.PARAMUOGESTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (A.DATA_REG >= NVL(~~TBL_PARAMETRI444.PARAMDAL~~, A.DATA_REG)) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI444.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI444.PARAMARTICOL~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE2, 5, SQL, -1, "");
    PAN_ELENCOACCERT.SetQueryDB(PPQRY_VISTAACCELE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOACCERT.SetMasterTable(0, "VISTA_ACC_ELENCO");
    PAN_ELENCOACCERT.AddToSortList(PFL_ELENCOACCERT_ANNOACC, true);
    PAN_ELENCOACCERT.AddToSortList(PFL_ELENCOACCERT_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOACCERT.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOACCERT.iUseListQBE;
      PAN_ELENCOACCERT.iUseListQBE = 0;
      PAN_ELENCOACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOACCERT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "F5E04409-16A0-4B8B-B9FA-55667D3EFA30");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 40, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 20, 8, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI443, "A.PARAMDAL", "PARAMDAL", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI443", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI443, IMDBDef13.PQRY_PARAMETRI443_RS, IMDBDef4.TBL_PARAMETRI444);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef4.FLD_PARAMETRI444_PARAMDAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI444");
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

  private void BUK_ELENACCEBOOK_MST_ELEACCBOOPAG_Init()
  {
    BUK_ELENACCEBOOK.InitMastro(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, "D536263C-69A6-4CAF-96B8-CE12921725F3");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, "ELEACCBOOPAG");
    BUK_ELENACCEBOOK.InitMastroBox(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, BUK_ELENACCEBOOK_RPTBOX_NUMEROPAGINA, 17900, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_NUMEROPAGINA, "6317F049-20B1-4A39-AF5B-FF7B0D3D37AE");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_NUMEROPAGINA, BUK_ELENACCEBOOK_SPAN_CPTSEABEACPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_CPTSEABEACPN, "164FA82D-EA36-4D42-A228-439B5CE9FABF");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_CPTSEABEACPN, "CPTSEABEACPN");
    BUK_ELENACCEBOOK.InitMastroBox(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 800, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER, "402E9BD7-5EB0-45FD-8467-00441D2D54F0");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER, BUK_ELENACCEBOOK_SPAN_ACCERDIENTRA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Accertamenti di Entrata", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_ACCERDIENTRA, "F6CFF9CA-F189-4353-A909-0E171241F5BC");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_ACCERDIENTRA, "ACCERDIENTRA");
    BUK_ELENACCEBOOK.InitMastroBox(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY, 1000, 2000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_PAGEBODY, "3C56BC41-2F1F-43CA-B6B6-954E3A0FA4E6");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ELENACCEBOOK.InitMastroBox(BUK_ELENACCEBOOK_MST_ELEACCBOOPAG, BUK_ELENACCEBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_PAGEFOOTER, "95E0CDA4-84A5-4F67-99A4-777D11625FD5");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_ELENACCEBOOK_RPT_ELENACCEREPO_InitQuery() { BUK_ELENACCEBOOK_RPT_ELENACCEREPO_InitQuery(true, true); }
  private void BUK_ELENACCEBOOK_RPT_ELENACCEREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
      SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
      SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
      SQL.append("  'Capitolo/Art. ' || CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE ' - ' || TO_CHAR ( A.CAPITOLO ) END || CASE WHEN (A.ARTICOLO IS NULL) THEN NULL ELSE ' / ' || TO_CHAR ( A.ARTICOLO ) END as VISACELVOPEG, ");
      SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || CASE WHEN NOT ((A.ANNO_ACC IS NULL)) THEN ' / ' || TO_CHAR ( A.ANNO_ACC ) ELSE NULL END as VISACCELEACC, ");
      SQL.append("  A.DATA_REG as DATA_REG, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.SEDE_DEL || CASE WHEN NOT ((A.NUMERO_DEL IS NULL)) THEN ' - ' || TO_CHAR ( A.NUMERO_DEL ) || CASE WHEN NOT ((A.ANNO_DEL IS NULL)) THEN ' / ' || TO_CHAR ( A.ANNO_DEL ) ELSE NULL END ELSE CASE WHEN NOT ((A.ANNO_DEL IS NULL)) THEN ' / ' || TO_CHAR ( A.ANNO_DEL ) ELSE NULL END END as VISACCELEDEL, ");
      SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as VISACCELEIMP, ");
      SQL.append("  A.ORDINATIVI as ORDINATIVI, ");
      SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
      SQL.append("  A.DEBITORE as DEBITORE, ");
      SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
      SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
      SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA ");
      SQL.append("from ");
      SQL.append("  VISTA_ACC_ELENCO A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI444.PARAMESERCIZ~~) ");
      SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI444.PARAMUOGESTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
      SQL.append("and   (A.DATA_REG >= NVL(~~TBL_PARAMETRI444.PARAMDAL~~, A.DATA_REG)) ");
      SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI444.PARAMCAPITOL~~) ");
      SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI444.PARAMARTICOL~~) ");
      SQL.append("and   (A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC ");
      BUK_ELENACCEBOOK.SetReportQuery(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "20CA52B3-1730-4CB1-AE7D-60467EE9CC2E");
      if (BUK_ELENACCEBOOK.FindObjByID(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD) != null)
        BUK_ELENACCEBOOK.AddReportGroup(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, "CAPITOLO");
      if (BUK_ELENACCEBOOK.FindObjByID(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD) != null)
        BUK_ELENACCEBOOK.AddReportGroup(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, "ARTICOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ELENACCEBOOK_RPT_ELENACCEREPO_Init()
  {
    BUK_ELENACCEBOOK.InitReport(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, 196865);
    BUK_ELENACCEBOOK_RPT_ELENACCEREPO_InitQuery(true, false);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, "52B6BDCA-49C5-4F80-8A51-9779962A1695");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, "ELENACCEREPO");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_REPORTHEADER, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_REPORTHEADER, "C4A8DC07-B372-443D-8F69-7FA940FDE7C3");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_PAGEHEADER, BUK_ELENACCEBOOK_RPTBOX_PAGEHEADER);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_PAGEHEADER, "E946FF84-A1E9-45AC-8E07-2CCCABB3A5D9");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "CAPITOLO");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, "AFE90A49-B096-477A-B090-81A783892969");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, "CAPIGROUHEAD");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, 1600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "ARTICOLO");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, "EB271F6C-18EE-45E5-9D79-DB5F394F79E4");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, "ARTIGROUHEAD");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_IMPORTHEADER, 7100, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_IMPORTHEADER, "311E63B4-F6F6-45F5-94F8-151B8129AEB2");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_IMPORTHEADER, BUK_ELENACCEBOOK_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_IMPORTO, "2ADD267A-55C3-4A7F-8562-04E59C1B2BF2");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_IMPORTO, "IMPORTO");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_ORDINAHEADER, 9800, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_ORDINAHEADER, "0AC3778E-C2DC-49E1-9F56-CD3E4C4572D7");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_ORDINAHEADER, BUK_ELENACCEBOOK_SPAN_ORDINATIVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Ordinativi", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_ORDINATIVI, "38D4080B-83FC-4243-BB52-FC93C475AD02");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_DISPONHEADER, 12500, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DISPONHEADER, "D608DC87-AABB-45B5-9CF4-E1D0C9539381");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DISPONHEADER, BUK_ELENACCEBOOK_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_DISPONIBILIT, "DC46F8F6-3403-43A3-B727-85BB4D8C6763");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_DATAREGHEADE, 2700, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DATAREGHEADE, "75138B60-27D1-4ED0-A734-9937D4FAB3E1");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DATAREGHEADE, BUK_ELENACCEBOOK_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_DATA, "6296DC74-22CF-4FEE-A66F-8CE9CD846A2A");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_DATA, "DATA");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_ACCERTHEADER, 400, 1100, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_ACCERTHEADER, "764C9C21-B2A1-46C8-B2C0-C95C47674B71");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_ACCERTHEADER, BUK_ELENACCEBOOK_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_ACCERTAMENTO, "14D21C03-B6F7-4B3F-81AC-2D7190C0D828");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_DELIBEHEADER, 4400, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DELIBEHEADER, "7D7C9142-15D3-4A43-A4F0-DF482802A98E");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DELIBEHEADER, "DELIBEHEADER");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DELIBEHEADER, BUK_ELENACCEBOOK_SPAN_DELIBERA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Delibera", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_DELIBERA, "1C984DB0-639B-49F4-96EF-C37498EFDAA7");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_DELIBERA, "DELIBERA");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, BUK_ELENACCEBOOK_RPTBOX_VOCEPEG, 0, 200, 18800, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_VOCEPEG, "D7030567-8776-4AAF-A6C1-C2169DF52322");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_VOCEPEG, BUK_ELENACCEBOOK_SPAN_VOCEPEG, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271319425, "Voce P E G", "::VISACELVOPEG", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VOCEPEG, "C3D915B2-29A8-4308-8CD8-04B7F7D104B7");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VOCEPEG, "VOCEPEG");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_DETAIL, "C07029F2-8ABC-4734-8C79-CF510D909EB2");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_DETAIL, "DETAIL");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_IMPORTO, 7100, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_IMPORTO, "FAE81BB9-8969-46DD-909E-70C2B039DD4A");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_IMPORTO, "IMPORTO");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_IMPORTO, BUK_ELENACCEBOOK_SPAN_VIACEIEACEAB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "VISTA ACC UO UT SALDO INI + VISTA ACC UO UT VARIAZIONI + VISTA ACC UO UT VARIAZIONI RES", "::VISACCELEIMP", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEIEACEAB, "CB8D72AE-6B1C-4E92-AB1C-9095D467E608");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEIEACEAB, "VIACEIEACEAB");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_ORDINATIVI, 9800, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_ORDINATIVI, "617ACB68-E102-4F74-BAAA-FCDEC97A5FBD");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_ORDINATIVI, "ORDINATIVI");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_ORDINATIVI, BUK_ELENACCEBOOK_SPAN_VIACEOEACEAB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::ORDINATIVI", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEOEACEAB, "9B823101-D3E3-492C-A06C-AC0A3C1F3F1A");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEOEACEAB, "VIACEOEACEAB");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_DISPONIBILIT, 12500, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DISPONIBILIT, "3E346011-D30C-41DD-AA03-DDCB6DCEB4E6");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DISPONIBILIT, BUK_ELENACCEBOOK_SPAN_VIACEDEACEA1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::DISPONIBILITA", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA1, "FDE396BC-B799-41E5-9DB1-0C6C4A0D45B1");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA1, "VIACEDEACEA1");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_DATAREG, 2700, 100, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DATAREG, "E5D619B9-83FE-431E-A875-C25C2B81D306");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DATAREG, "DATAREG");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DATAREG, BUK_ELENACCEBOOK_SPAN_VIACEDEACEA2, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::DATA_REG", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA2, "8AAADEC5-E553-4BCB-AE96-7770DCB520A2");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA2, "VIACEDEACEA2");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_ACCERTAMENTO, 400, 100, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_ACCERTAMENTO, "A66E7E98-F268-4C49-B952-28D149041B41");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_ACCERTAMENTO, BUK_ELENACCEBOOK_SPAN_VIACEAEACEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "To String (VISTA ACC UO UT NUMERO ACC) +c barra con spazi +c To String (VISTA ACC UO UT ANNO ACC)", "::VISACCELEACC", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEAEACEAB, "6E121614-62A9-4192-9714-3B4C3A3A9396");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEAEACEAB, "VIACEAEACEAB");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAIL, BUK_ELENACCEBOOK_RPTBOX_DELIBERA, 4400, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DELIBERA, "DFEAF3BC-CEDB-4F3B-A4CE-5095488BE701");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DELIBERA, "DELIBERA");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DELIBERA, BUK_ELENACCEBOOK_SPAN_VIACEDEACEA3, MyGlb.VIS_DEFAREPOSTYL, 5, 103, 0, 271384705, "VISTA ACC UO UT SEDE DEL +c trattino con spazi +c To String (VISTA ACC UO UT NUMERO DEL) +c barra con spazi +c To String (VISTA ACC UO UT ANNO DEL)", "::VISACCELEDEL", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA3, "DCD41456-3AE9-4173-BD46-CC5B9966039B");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEDEACEA3, "VIACEDEACEA3");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_DETAILDESCRI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_DETAILDESCRI, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_DETAILDESCRI, "8034E20C-2175-4A38-B22B-D36CBDE1D865");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_DETAILDESCRI, "DETAILDESCRI");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_DETAILDESCRI, BUK_ELENACCEBOOK_RPTBOX_DESCRIZIONE, 2700, 0, 12300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_DESCRIZIONE, "0920CAFE-5BE2-4312-AAB4-4CDF755136DD");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_DESCRIZIONE, BUK_ELENACCEBOOK_SPAN_VIACEDEACEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_VIACEDEACEAB, "370728F9-E031-4336-AE1E-D8311D51CEBD");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_VIACEDEACEAB, "VIACEDEACEAB");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "ARTICOLO");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, "BFB8E5F6-A916-4FE1-8305-23BC8531A1A2");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, "ARTIGROUFOOT");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT1, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT1, "24BEDAD2-BC24-4B41-A65B-B1257F786864");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT1, BUK_ELENACCEBOOK_SPAN_AGFSVAEIEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_AGFSVAEIEACE, "40ED32C3-2E2E-47B3-B869-563DA0776B23");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_AGFSVAEIEACE, "AGFSVAEIEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA1, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA1, "E4A44072-3AB5-4ED0-87B1-2191658486BF");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA1, "SUMOFORDINA1");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA1, BUK_ELENACCEBOOK_SPAN_AGFSVAEOEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_AGFSVAEOEACE, "9CC10AD7-B799-4A5C-8969-DDD4106A26AE");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_AGFSVAEOEACE, "AGFSVAEOEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON1, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON1, "D1EA6892-BC75-4537-A64C-903FC645CE15");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON1, BUK_ELENACCEBOOK_SPAN_AGFSVAEDEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_AGFSVAEDEACE, "EA1E02DB-2E1F-4715-8342-89B5BFEF6ECB");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_AGFSVAEDEACE, "AGFSVAEDEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_ARTIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_TOTALEARTICO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_TOTALEARTICO, "78B48595-7DDB-476C-B310-35228D44F439");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_TOTALEARTICO, BUK_ELENACCEBOOK_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_TOTALEARTICO, "8169BF3B-F601-44FB-9038-24D09417FCD7");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "CAPITOLO");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, "3D36E780-4F03-4D38-A846-52369DDFDB61");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, "CAPIGROUFOOT");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT2, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT2, "B7459ABB-4481-4C50-9D1E-499CC9280E3A");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT2, "SUMOFIMPORT2");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORT2, BUK_ELENACCEBOOK_SPAN_CGFSVAEIEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_CGFSVAEIEACE, "2AC0C70C-5A04-43EA-A90B-9974C3B62542");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_CGFSVAEIEACE, "CGFSVAEIEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA2, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA2, "530552DD-CE13-4337-A02F-4B7E5F4F67F9");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA2, "SUMOFORDINA2");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINA2, BUK_ELENACCEBOOK_SPAN_CGFSVAEOEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_CGFSVAEOEACE, "98354C78-6FD5-4299-8C0E-518659D38F64");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_CGFSVAEOEACE, "CGFSVAEOEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON2, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON2, "EF9BCC6C-50A6-4AB8-8EF4-0DAC0B6B4274");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON2, "SUMOFDISPON2");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPON2, BUK_ELENACCEBOOK_SPAN_CGFSVAEDEACE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_CGFSVAEDEACE, "C23BC9B3-D1C2-4FB2-B576-FC1027397EDE");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_CGFSVAEDEACE, "CGFSVAEDEACE");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_CAPIGROUFOOT, BUK_ELENACCEBOOK_RPTBOX_TOTALECAPIT1, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPIT1, "003A280A-6F9C-4A8B-BC82-CA0E6C74F630");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPIT1, BUK_ELENACCEBOOK_SPAN_TOTALECAPIT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_TOTALECAPIT1, "F7512A03-931E-4B3E-9193-3A7B576E72D8");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_PAGEFOOTER, BUK_ELENACCEBOOK_RPTBOX_PAGEFOOTER);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_PAGEFOOTER, "1BBF6194-318D-4BA1-8AA0-031F0FB36FC5");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ELENACCEBOOK.InitSection(BUK_ELENACCEBOOK_RPT_ELENACCEREPO, BUK_ELENACCEBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ELENACCEBOOK.SetSectionRendersInto(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, "56EA2D0D-92BB-459A-96BC-B8E237578A21");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORTO, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORTO, "E3E90EA4-C9DB-4E86-A913-6881187D4800");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFIMPORTO, BUK_ELENACCEBOOK_SPAN_RFSVAEIEACEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_RFSVAEIEACEA, "19F00127-874C-41ED-805D-D295BA1385C3");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_RFSVAEIEACEA, "RFSVAEIEACEA");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINAT, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINAT, "C4B65777-D1BF-486F-BEE8-CE6B15F4D0DB");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINAT, "SUMOFORDINAT");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFORDINAT, BUK_ELENACCEBOOK_SPAN_RFSVAEOEACEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_RFSVAEOEACEA, "84363A14-EB8E-4F69-8C8E-E5C27C9CFA07");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_RFSVAEOEACEA, "RFSVAEOEACEA");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPONI, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPONI, "FA14F681-B636-44E8-A397-324799AA0014");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_SUMOFDISPONI, BUK_ELENACCEBOOK_SPAN_RFSVAEDEACEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_RFSVAEDEACEA, "B56AEAAB-32A6-4143-84CD-C7F3E8D5D56A");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_RFSVAEDEACEA, "RFSVAEDEACEA");
    BUK_ELENACCEBOOK.InitReportBox(BUK_ELENACCEBOOK_SEC_REPORTFOOTER, BUK_ELENACCEBOOK_RPTBOX_TOTALECAPITO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPITO, "76EDDD0D-D28F-4C6F-A11A-9F737ABC2179");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_ELENACCEBOOK.InitBoxSpan(BUK_ELENACCEBOOK_RPTBOX_TOTALECAPITO, BUK_ELENACCEBOOK_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale", 1);
    BUK_ELENACCEBOOK.SetRTCGuid(BUK_ELENACCEBOOK_SPAN_TOTALECAPITO, "38CB1527-E05A-440D-A007-74396F37DC96");
    BUK_ELENACCEBOOK.SetObjCode(BUK_ELENACCEBOOK_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_ELENACCEBOOK.AddReportGroup(BUK_ELENACCEBOOK_SEC_CAPIGROUHEAD, "CAPITOLO");
    BUK_ELENACCEBOOK.AddReportGroup(BUK_ELENACCEBOOK_SEC_ARTIGROUHEAD, "ARTICOLO");
    BUK_ELENACCEBOOK_RPT_ELENACCEREPO_InitQuery(false, true);
  }

  private void BUK_ELENACCEBOOK_InitLinks()
  {
    BUK_ELENACCEBOOK.SetBoxNextBox(BUK_ELENACCEBOOK_RPTBOX_PAGEBODY, BUK_ELENACCEBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ELENACCEBOOK) BUK_ELENACCEBOOK_OnPreview();
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
