// **********************************************
// Elenco Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;

  private static int PPQRY_PARAMETRI462 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_ELENCOACCERT_ACCERTAMENTO = 0;
  private static int GRP_ELENCOACCERT_DELIBERA = 1;
  private static int GRP_ELENCOACCERT_PROPOSTA = 2;
  private static int GRP_ELENCOACCERT_ACCPROVENIEN = 3;
  private static int GRP_ELENCOACCERT_UNITAORGANIZ = 4;

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
  private static int PFL_ELENCOACCERT_NUMERACCPROV = 18;
  private static int PFL_ELENCOACCERT_ANNOACCPROVE = 19;
  private static int PFL_ELENCOACCERT_CODLIVELLO5 = 20;
  private static int PFL_ELENCOACCERT_CODICEEUROPE = 21;
  private static int PFL_ELENCOACCERT_FINANZIAMENT = 22;
  private static int PFL_ELENCOACCERT_DATASCADENZA = 23;
  private static int PFL_ELENCOACCERT_CODICEUO = 24;
  private static int PFL_ELENCOACCERT_DESCRUO = 25;
  private static int PFL_ELENCOACCERT_ESERCIZIO = 26;

  private static int PPQRY_VISTAACCELE1 = 0;


  IDPanel PAN_ELENCOACCERT;
  CIDREObj BUK_LIBRELENACCE;
  OBook BKW_LIBRELENACCE;
  //
  // Template Pages constants
  private static int BUK_LIBRELENACCE_MST_ELEACCBOOPAG = 1;
  private static int BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRELENACCE_SPAN_CPTSLEAEAPND = 3;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEHEADER = 4;
  private static int BUK_LIBRELENACCE_SPAN_ACCERDIENTRA = 5;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEBODY = 6;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_LIBRELENACCE_RPT_ELENACCEREPO = 8;
  private static int BUK_LIBRELENACCE_SEC_REPORTHEADER = 9;
  private static int BUK_LIBRELENACCE_SEC_PAGEHEADER = 10;
  private static int BUK_LIBRELENACCE_SEC_CAPIGROUHEAD = 11;
  private static int BUK_LIBRELENACCE_SEC_ARTIGROUHEAD = 12;
  private static int BUK_LIBRELENACCE_RPTBOX_VOCEPEG = 13;
  private static int BUK_LIBRELENACCE_SPAN_VOCEPEG = 14;
  private static int BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER = 15;
  private static int BUK_LIBRELENACCE_SPAN_ACCERTAMENTO = 16;
  private static int BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE = 17;
  private static int BUK_LIBRELENACCE_SPAN_DATA = 18;
  private static int BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER = 19;
  private static int BUK_LIBRELENACCE_SPAN_IMPORTO = 20;
  private static int BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER = 21;
  private static int BUK_LIBRELENACCE_SPAN_ORDINATIVI = 22;
  private static int BUK_LIBRELENACCE_RPTBOX_DISPONHEADER = 23;
  private static int BUK_LIBRELENACCE_SPAN_DISPONIBILIT = 24;
  private static int BUK_LIBRELENACCE_RPTBOX_DESCRIHEADER = 25;
  private static int BUK_LIBRELENACCE_SPAN_C = 26;
  private static int BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER = 27;
  private static int BUK_LIBRELENACCE_SPAN_DELIBERA = 28;
  private static int BUK_LIBRELENACCE_SEC_DETAIL = 29;
  private static int BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO = 30;
  private static int BUK_LIBRELENACCE_SPAN_VIACELAEAEAB = 31;
  private static int BUK_LIBRELENACCE_RPTBOX_DATAREG = 32;
  private static int BUK_LIBRELENACCE_SPAN_VIACELDEAEA2 = 33;
  private static int BUK_LIBRELENACCE_RPTBOX_IMPORTO = 34;
  private static int BUK_LIBRELENACCE_SPAN_VIACELIEAEAB = 35;
  private static int BUK_LIBRELENACCE_RPTBOX_ORDINATIVI = 36;
  private static int BUK_LIBRELENACCE_SPAN_VIACELOEAEAB = 37;
  private static int BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT = 38;
  private static int BUK_LIBRELENACCE_SPAN_VIACELDEAEA1 = 39;
  private static int BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE = 40;
  private static int BUK_LIBRELENACCE_SPAN_VIACELDEALEA = 41;
  private static int BUK_LIBRELENACCE_SPAN_NUOVASPAN = 42;
  private static int BUK_LIBRELENACCE_SPAN_VAEBRSEEALEA = 43;
  private static int BUK_LIBRELENACCE_RPTBOX_DELIBERA = 44;
  private static int BUK_LIBRELENACCE_SPAN_VIACELDEAEA3 = 45;
  private static int BUK_LIBRELENACCE_SEC_ARTIGROUFOOT = 46;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1 = 47;
  private static int BUK_LIBRELENACCE_SPAN_AGFSVAEIEAEA = 48;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1 = 49;
  private static int BUK_LIBRELENACCE_SPAN_AGFSVAEOEAEA = 50;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1 = 51;
  private static int BUK_LIBRELENACCE_SPAN_AGFSVAEDEAEA = 52;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO = 53;
  private static int BUK_LIBRELENACCE_SPAN_TOTALEARTICO = 54;
  private static int BUK_LIBRELENACCE_SEC_CAPIGROUFOOT = 55;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2 = 56;
  private static int BUK_LIBRELENACCE_SPAN_CGFSVAEIEAEA = 57;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2 = 58;
  private static int BUK_LIBRELENACCE_SPAN_CGFSVAEOEAEA = 59;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2 = 60;
  private static int BUK_LIBRELENACCE_SPAN_CGFSVAEDEAEA = 61;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1 = 62;
  private static int BUK_LIBRELENACCE_SPAN_TOTALECAPIT1 = 63;
  private static int BUK_LIBRELENACCE_SEC_PAGEFOOTER = 64;
  private static int BUK_LIBRELENACCE_SEC_REPORTFOOTER = 65;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO = 66;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEIEAEAB = 67;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT = 68;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEOEAEAB = 69;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI = 70;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEDEAEAB = 71;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO = 72;
  private static int BUK_LIBRELENACCE_SPAN_TOTALECAPITO = 73;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI103(IMDB);
    //
    //
    Init_PQRY_VISTAACCELE1(IMDB);
    Init_PQRY_PARAMETRI462(IMDB);
    Init_PQRY_PARAMETRI462_RS(IMDB);
    Init_PQRY_VISTAACCELE4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI103(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI103, 12);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI103, "TBL_PARAMETRI103");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMESERCIZ,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCATEGOR, "PARAMCATEGOR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCATEGOR,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMSEVOCE, "PARAMSEVOCE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMSEVOCE,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMRUOLO, "PARAMRUOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI103,IMDBDef6.FLD_PARAMETRI103_PARAMRUOLO,9,300,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI103, 0);
  }

  private static void Init_PQRY_VISTAACCELE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_VISTAACCELE1, 27);
    IMDB.set_TblCode(IMDBDef16.PQRY_VISTAACCELE1, "PQRY_VISTAACCELE1");
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELINAC, "VISACCELINAC");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELINAC,5,99,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VIACELBERSEE, "VIACELBERSEE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VIACELBERSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ORDINATIVI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELEFIN, "VISACCELEFIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELEFIN,5,398,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACELCOLI5, "VISACELCOLI5");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACELCOLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELCOEU, "VISACCELCOEU");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELCOEU,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELDASC, "VISACCELDASC");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_VISACCELDASC,6,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1__ANNO_ACC_PROVENIENZA, " ANNO_ACC_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1__ANNO_ACC_PROVENIENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC_PROVENIENZA, "NUMERO_ACC_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC_PROVENIENZA,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_CODICEUO, "CODICEUO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_CODICEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DESCRUO, "DESCRUO");
    IMDB.SetFldParams(IMDBDef16.PQRY_VISTAACCELE1,IMDBDef16.PQSL_VISTAACCELE1_DESCRUO,5,99,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_VISTAACCELE1, 0);
  }

  private static void Init_PQRY_PARAMETRI462(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMETRI462, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMETRI462, "PQRY_PARAMETRI462");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI462,IMDBDef16.PQSL_PARAMETRI462_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI462,IMDBDef16.PQSL_PARAMETRI462_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI462,IMDBDef16.PQSL_PARAMETRI462_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI462,IMDBDef16.PQSL_PARAMETRI462_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAMETRI462, 0);
  }

  private static void Init_PQRY_PARAMETRI462_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMETRI462_RS, 2);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMETRI462_RS, "PQRY_PARAMETRI462_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI462_RS,IMDBDef16.PQSL_PARAMETRI462_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI462_RS,IMDBDef16.PQSL_PARAMETRI462_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMETRI462_RS,IMDBDef16.PQSL_PARAMETRI462_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMETRI462_RS,IMDBDef16.PQSL_PARAMETRI462_PARAMDAL,6,49,0);
  }

  private static void Init_PQRY_VISTAACCELE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISTAACCELE4, 20);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISTAACCELE4, "PQRY_VISTAACCELE4");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACELVOPEG, "VISACELVOPEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACELVOPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEACC, "VISACCELEACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEACC,5,198,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEDEL, "VISACCELEDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEDEL,5,103,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ORDINATIVI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_DEBITORE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VIACELBERASE, "VIACELBERASE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE4,IMDBDef17.PQSL_VISTAACCELE4_VIACELBERASE,5,60,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISTAACCELE4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAccertamenti()
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
    FormIdx = MyGlb.FRM_ELENCOACCERT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35579BF9-81F7-4AC7-9D07-8E156377A577";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 486;
    set_Caption(new IDVariant("Elenco Accertamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0782609;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B3F9B0A-C909-45E2-AACE-FD1092E71E59");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 280, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Height = 424;
    Frames[3].Caption = "Elenco Accertamenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 424;
    PAN_ELENCOACCERT = new IDPanel(w, this, 3, "PAN_ELENCOACCERT");
    Frames[3].Content = PAN_ELENCOACCERT;
    PAN_ELENCOACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOACCERT.VS = MainFrm.VisualStyleList;
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRELENACCE != null)
      PAN_ELENCOACCERT.SetBook(BUK_LIBRELENACCE);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "341F5E7D-BF05-410A-8273-00A92A84F00B");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2396, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOACCERT.InitStatus = 1;
    PAN_ELENCOACCERT_Init();
    PAN_ELENCOACCERT_InitFields();
    PAN_ELENCOACCERT_InitQueries();
    BKW_LIBRELENACCE = new OBook(this);
    BUK_LIBRELENACCE = new CIDREObj(BKW_LIBRELENACCE);
    BKW_LIBRELENACCE.iGuid = "B0CCC256-E09E-493B-9300-48754E8A05D3";
    BKW_LIBRELENACCE.Code = "BUK_LIBRELENACCE";
    BKW_LIBRELENACCE.BookObj = BUK_LIBRELENACCE;
    BKW_LIBRELENACCE.InitDefMasks();
    BUK_LIBRELENACCE.InitBook(1, 3342337, "Libro Elenco Accertamenti", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRELENACCE.InitHTML();
    BUK_LIBRELENACCE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRELENACCE.Book.SetMainFrm(MainFrm);
    BUK_LIBRELENACCE.SetRTCGuid(0, "B0CCC256-E09E-493B-9300-48754E8A05D3");
    BUK_LIBRELENACCE.SetObjCode(0, "LIBRELENACCE");
    if (PAN_ELENCOACCERT != null)
      PAN_ELENCOACCERT.SetBook(BUK_LIBRELENACCE);
    BUK_LIBRELENACCE_MST_ELEACCBOOPAG_Init();
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_Init();
    BUK_LIBRELENACCE_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_NUOVO20+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST8+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV4+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG131+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI80+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG131+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOACC2+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI103, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCOACCERT_PARAMETRI462();
      }
      PAN_ELENCOACCERT.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_LIBRELENACCE.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_UNITAORGANIZ && flRis && IdxPanelActived == PAN_ELENCOACCERT.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOACCERT_CODICEUO) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_LIBRELENACCE")) return BUK_LIBRELENACCE;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAccertamenti.class.getName() : (Glb.ClassWithPackage(ElencoAccertamenti.class) ? ElencoAccertamenti.class.getName().substring(ElencoAccertamenti.class.getPackage().getName().length() + 1) : ElencoAccertamenti.class.getName()));
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
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_DESCRIZIONE,IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_DESCRIZIONE, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_FINANZIAMENT,IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_VISACCELEFIN, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOACCERT.FieldText(PFL_ELENCOACCERT_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ElencoAccertamentiOnDynamicPropertiesEvent", _e);
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
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET13+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET13+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ElencoAccertamentiOnChangeStatusEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ElencoAccertamentiOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMESERCIZ, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_ELENCOACCERT.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO20+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST8+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO20+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_UNITAORGANIZ)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = IDL.Add((new IDVariant("=")), IMDB.Value(IMDBDef7.PQRY_SO4ANAUNIORG, IMDBDef7.PQSL_SO4ANAUNIORG_SOANUNORCOUO, 0));
        PAN_ELENCOACCERT.set_QBEFilter(PFL_ELENCOACCERT_CODICEUO, new IDVariant(S).stringValue());
        PAN_ELENCOACCERT.PanelCommand(Glb.PCM_FIND);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "EndModalEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMUOGESTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMUOUTILI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMTITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMCATEGOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMCODTERZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMCAPITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMARTICOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMSEVOCE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMRUOLO, 0, new IDVariant());
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
      BUK_LIBRELENACCE.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_LIBRELENACCE.ReportRefreshQuery(BUK_LIBRELENACCE_RPT_ELENACCEREPO);
      BUK_LIBRELENACCE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_LIBRELENACCE.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ApriStampa", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ExportCSV", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ApriChiusuraAutomaticaAccertamenti", _e);
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
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ESERCIZIO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_CAPITOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ARTICOLO, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_DISPONIBILITA, 0));
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "ApriInfoAccertamento", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMCAPITOL, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_CAPITOLO, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAUNITORGA, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMUOGESTI, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      ((Accertamenti)MainFrm.GetForm(MyGlb.FRM_ACCERTAMENTI,0,true,this)).NUOVARIGA();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "Nuovo", _e);
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
      if (IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, IMDB.Value(IMDBDef16.PQRY_VISTAACCELE1, IMDBDef16.PQSL_VISTAACCELE1_NUMERO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Codice UO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CodiceUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codice UO Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ELENCOACCERT.Status()).equals((new IDVariant(2)), true))
      {
        return 0;
      }
      else
      {
        MainFrm.Show(MyGlb.FRM_UNITAORGANIZ, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamenti", "CodiceUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCOACCERT_PARAMETRI462() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAMETRI462_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI103, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI103, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAMETRI462_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAMETRI462_RS, 0, IMDBDef6.TBL_PARAMETRI103, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMETRI462_RS, 0, 0, IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMETRI462_RS, 1, 0, IMDBDef6.TBL_PARAMETRI103, IMDBDef6.FLD_PARAMETRI103_PARAMDAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI103, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI103, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI103, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAMETRI462_RS, 0);
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
    if (ColIndex.intValue() == PFL_ELENCOACCERT_CODICEUO)
    {
      this.IdxPanelActived = this.PAN_ELENCOACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CodiceUO();
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

  private void BUK_LIBRELENACCE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRELENACCE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRELENACCE_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_CAPIGROUHEAD)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ARTIGROUHEAD)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ARTIGROUFOOT)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_AGFSVAEIEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ARTIGROUFOOT,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_AGFSVAEOEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ARTIGROUFOOT,"ORDINATIVI")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_AGFSVAEDEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ARTIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_CAPIGROUFOOT)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CGFSVAEIEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_CAPIGROUFOOT,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CGFSVAEOEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_CAPIGROUFOOT,"ORDINATIVI")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CGFSVAEDEAEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_CAPIGROUFOOT,"DISPONIBILITA")));
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_REPORTFOOTER)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEIEAEAB, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEOEAEAB, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"ORDINATIVI")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEDEAEAB, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"DISPONIBILITA")));
    }
  }

  private void BUK_LIBRELENACCE_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRELENACCE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRELENACCE_MST_ELEACCBOOPAG)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CPTSLEAEAPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRELENACCE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRELENACCE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRELENACCE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRELENACCE_OnPreview()
  {
    PreviewBook = BKW_LIBRELENACCE;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOACCERT_Init()
  {

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, "721290F1-6D54-47BE-89E7-98FC1BBDBA7D");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, "Accertamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 156, -9999, 124, 16, 0, 0);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 51, 540, 385, 0, 0);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, 0, 81);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, 1, 13);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, 0, 4);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, 1, 4);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, "F5EDFEBB-080C-4844-B094-EA5FEB691228");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, "Delibera");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 1144, -9999, 160, 16, 0, 0);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 0, 99, 128, 97, 0, 0);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, 0, 47);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, 1, 13);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, 0, 4);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, 1, 4);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, "D7C1EC7C-5EEF-47E9-B8E7-DD7108D53DEE");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, "Proposta");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 1304, -9999, 184, 16, 0, 0);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 120, 99, 128, 97, 0, 0);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, 0, 51);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, 1, 13);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, 0, 4);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, 1, 4);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, "F092DE95-FE64-4F22-9D04-0250E49C26F0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, "Acc. Provenienza");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, MyGlb.PANEL_LIST, 1488, -9999, 116, 16, 0, 0);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, MyGlb.PANEL_FORM, 0, 531, 212, 73, 0, 0);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, 0, 96);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, 1, 13);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, 0, 4);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, 1, 4);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_ACCPROVENIEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, "6D4057BD-323C-4614-9E30-ACB659814B29");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, "Unità Organizzativa");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, MyGlb.PANEL_LIST, 2012, -9999, 384, 16, 0, 0);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, MyGlb.PANEL_FORM, 0, 579, 580, 73, 0, 0);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, 0, 111);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, 1, 13);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, 0, 4);
    PAN_ELENCOACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, 1, 4);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOACCERT_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "9F81F215-2BF4-4E31-96B7-DFA153E0382E");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "Capitolo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "6D6D6CDF-8160-414B-81A7-9B0A091EF9E1");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "Art.");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "FE9E03C6-D409-422C-A946-C4DD5B6154C0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "Numero");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "85FFD926-4141-4368-BFCE-D893AA43ABFF");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "Anno");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "CCAC6F29-F414-4715-9EDB-59F25DE93903");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, " ");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "2FCCF1A5-BFB2-466A-BF3C-FF1098934499");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "Debitore");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "394EBB09-2511-496A-9139-252EFC2128C9");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, " ");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "85BBD4D5-4DB7-43D7-B020-F8200C6BE478");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "Importo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "B93DC146-C781-48E8-8FED-E7A956917821");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "Ordinativi");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "BD0D1C41-C4CC-4655-9759-8EE2F25939CC");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "Disponibilità");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "16B9F8A5-BE5D-47B3-89C9-93FE7A665A70");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "Data");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "59E2F446-DF6F-46B5-A787-4060FF2B28A2");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "Descrizione");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "CDDA1A3C-84F0-4F9E-A13E-96D09A7D6149");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "Sede");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "9AD8FC7E-613D-46CE-A1C6-757330EC2EBD");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "Numero");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "5CC2FC59-D840-47FB-B258-604C17FB117E");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "Anno");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "37533DE0-8C53-43EE-9ADA-B300C45FBFAF");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "Unità Proponente");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "C0DF480F-573E-4096-A1D9-B338DE1BAA3A");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "Numero");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "5952F2B5-7EE7-4ECC-AC61-41C5EC2F5BBE");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "Anno");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, "EE262EBA-CD04-4DE9-8D42-0D59D9E35DE0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, "Numero");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, "C792CDEC-372B-4DA6-8F60-7AA17103954B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, "Anno");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "AC85B77B-D583-4EBA-B48E-0BCDD6993406");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "V livello");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "7EEF53A5-8EA5-4D38-BF00-6038C8D5BD93");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "1BF1B3AD-4025-4A36-9BC6-E625D730E9A3");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "Finanziamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, "CA672A2B-5752-4F27-85C8-69416549E20B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, "Data Scadenza");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, "3CA09FC9-1D78-4F39-8DDD-8E6BCEB98243");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, "Codice");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, "442BF501-50E2-4E1D-A2F3-4CFC7346B73A");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, "Descrizione");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "19413C14-A78A-4D37-988A-201ED669897C");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, 0, -1);
  }

  private void PAN_ELENCOACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CAPITOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLO, PPQRY_VISTAACCELE1, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ARTICOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ARTICOLO, PPQRY_VISTAACCELE1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 156, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROACC, -1, GRP_ELENCOACCERT_ACCERTAMENTO);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROACC, PPQRY_VISTAACCELE1, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 212, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOACC, -1, GRP_ELENCOACCERT_ACCERTAMENTO);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOACC, PPQRY_VISTAACCELE1, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 256, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 388, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_INFOACCERTAM, -1, GRP_ELENCOACCERT_ACCERTAMENTO);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_INFOACCERTAM, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_INFOACCERTAM, PPQRY_VISTAACCELE1, "DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I')", "VISACCELINAC", 5, 99, 0, -13997);
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
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 280, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DEBITORE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DEBITORE, PPQRY_VISTAACCELE1, "A.DEBITORE", "DEBITORE", 2, 15, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 340, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_RAGIONSOCIAL, PPQRY_VISTAACCELE1, "B.RAGIONE_SOCIALE_ESTESA", "VIACELBERSEE", 5, 60, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 540, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_IMPORTO, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_IMPORTO, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_IMPORTO, PPQRY_VISTAACCELE1, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "VISACCELEIMP", 3, 28, 6, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 660, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 4, 1192, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ORDINATIVI, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ORDINATIVI, PPQRY_VISTAACCELE1, "A.ORDINATIVI", "ORDINATIVI", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 744, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DISPONIBILIT, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DISPONIBILIT, PPQRY_VISTAACCELE1, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 840, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DATA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DATA, PPQRY_VISTAACCELE1, "A.DATA_REG", "DATA_REG", 6, 19, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 904, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DESCRIZIONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DESCRIZIONE, PPQRY_VISTAACCELE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1144, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_SEDEDEL, -1, GRP_ELENCOACCERT_DELIBERA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_SEDEDEL, PPQRY_VISTAACCELE1, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1220, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, "Num.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMERODEL, -1, GRP_ELENCOACCERT_DELIBERA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMERODEL, PPQRY_VISTAACCELE1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1268, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNODEL, -1, GRP_ELENCOACCERT_DELIBERA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNODEL, PPQRY_VISTAACCELE1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1304, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Proponente");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, "Un. Prop.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_UNITAPROPONE, -1, GRP_ELENCOACCERT_PROPOSTA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_UNITAPROPONE, PPQRY_VISTAACCELE1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1412, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROPROPOS, -1, GRP_ELENCOACCERT_PROPOSTA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROPROPOS, PPQRY_VISTAACCELE1, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1452, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOPROPOSTA, -1, GRP_ELENCOACCERT_PROPOSTA);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOPROPOSTA, PPQRY_VISTAACCELE1, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_LIST, 1488, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_LIST, 160);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_LIST, "Numero");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_FORM, 4, 580, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_FORM, 160);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERACCPROV, MyGlb.PANEL_FORM, "Numero");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMERACCPROV, -1, GRP_ELENCOACCERT_ACCPROVENIEN);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMERACCPROV, PPQRY_VISTAACCELE1, "A.NUMERO_ACC_PROVENIENZA", "NUMERO_ACC_PROVENIENZA", 1, 5, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_LIST, 1552, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_LIST, 144);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_LIST, "Anno");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_FORM, 4, 556, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_FORM, 144);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACCPROVE, MyGlb.PANEL_FORM, "Anno");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOACCPROVE, -1, GRP_ELENCOACCERT_ACCPROVENIEN);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOACCPROVE, PPQRY_VISTAACCELE1, "A.ANNO_ACC_PROVENIENZA", " ANNO_ACC_PROVENIENZA", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1604, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 484, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODLIVELLO5, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODLIVELLO5, PPQRY_VISTAACCELE1, "A.COD_LIVELLO_5", "VISACELCOLI5", 3, 10, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1676, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 508, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODICEEUROPE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODICEEUROPE, PPQRY_VISTAACCELE1, "A.CODICE_EUROPEO", "VISACCELCOEU", 1, 1, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1712, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 340, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_FINANZIAMENT, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_FINANZIAMENT, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_FINANZIAMENT, PPQRY_VISTAACCELE1, "TO_CHAR ( A.COD_FINANZIAMENTO ) || CASE WHEN NOT ((A.COD_FINANZIAMENTO IS NULL)) THEN ' - ' ELSE '' END || A.DESCR_FINANZIAMENTO", "VISACCELEFIN", 5, 398, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_LIST, 1944, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_LIST, "Data Scadenza");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_FORM, 4, 532, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATASCADENZA, MyGlb.PANEL_FORM, "Data Scadenza");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DATASCADENZA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DATASCADENZA, PPQRY_VISTAACCELE1, "A.DATA_SCADENZA", "VISACCELDASC", 6, 10, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_LIST, 2012, 36, 104, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_LIST, "Codice");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_FORM, 4, 604, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEUO, MyGlb.PANEL_FORM, "Codice");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODICEUO, -1, GRP_ELENCOACCERT_UNITAORGANIZ);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_CODICEUO, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODICEUO, PPQRY_VISTAACCELE1, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "CODICEUO", 5, 99, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_LIST, 2116, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_FORM, 4, 628, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRUO, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DESCRUO, -1, GRP_ELENCOACCERT_UNITAORGANIZ);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_DESCRUO, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DESCRUO, PPQRY_VISTAACCELE1, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "DESCRUO", 5, 99, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 388, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ESERCIZIO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ESERCIZIO, PPQRY_VISTAACCELE1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_ELENCOACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOACCERT.SetIMDB(IMDB, "PQRY_VISTAACCELE1", true);
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
    SQL.append("  A.CODICE_EUROPEO as VISACCELCOEU, ");
    SQL.append("  A.DATA_SCADENZA as VISACCELDASC, ");
    SQL.append("  A.ANNO_ACC_PROVENIENZA as \" ANNO_ACC_PROVENIENZA\", ");
    SQL.append("  A.NUMERO_ACC_PROVENIENZA as NUMERO_ACC_PROVENIENZA, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as CODICEUO, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRUO ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_ACC_ELENCO A, ");
    SQL.append("  BEN B ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI103.PARAMESERCIZ~~) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI103.PARAMUOGESTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (NVL(A.SCADENZA_UO, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    SQL.append("and   (~~TBL_PARAMETRI103.PARAMSEVOCE~~ = 'NO' OR (~~TBL_PARAMETRI103.PARAMSEVOCE~~ = 'SI' AND A.CAPITOLO = DECODE(~~TBL_PARAMETRI103.PARAMCAPITOL~~, -1, A.CAPITOLO, ~~TBL_PARAMETRI103.PARAMCAPITOL~~) AND A.ARTICOLO = DECODE(~~TBL_PARAMETRI103.PARAMARTICOL~~, 0, A.ARTICOLO, ~~TBL_PARAMETRI103.PARAMARTICOL~~) AND NVL(A.TITOLO, -1) = DECODE(~~TBL_PARAMETRI103.PARAMTITOLO~~, -1, NVL(A.TITOLO, -1), NVL(~~TBL_PARAMETRI103.PARAMTITOLO~~, A.TITOLO)) AND NVL(A.CATEGORIA, -1) = DECODE(~~TBL_PARAMETRI103.PARAMCATEGOR~~, -1, NVL(A.CATEGORIA, -1), ~~TBL_PARAMETRI103.PARAMCATEGOR~~) AND NVL(A.COD_TERZI, -1) = DECODE(~~TBL_PARAMETRI103.PARAMCODTERZ~~, -1, NVL(A.COD_TERZI, -1), ~~TBL_PARAMETRI103.PARAMCODTERZ~~))) ");
    SQL.append("and   (A.DATA_REG >= NVL(~~TBL_PARAMETRI103.PARAMDAL~~, A.DATA_REG)) ");
    SQL.append("and   ((A.ANNO_ACC = A.ESERCIZIO) OR (~~TBL_PARAMETRI103.PARASOLOCOMP~~ = 'NO')) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (((GET_RESP_UNICO_RUOLO_UO(A.PROGR_UNITA_ORGANIZZATIVA) = ~~TBL_PARAMETRI103.PARAMRUOLO~~) AND NOT ((~~TBL_PARAMETRI103.PARAMRUOLO~~ IS NULL))) OR (~~TBL_PARAMETRI103.PARAMRUOLO~~ IS NULL)) ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_VISTAACCELE1, 5, SQL, -1, "");
    PAN_ELENCOACCERT.SetQueryDB(PPQRY_VISTAACCELE1, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "C4D1DAB2-7A01-4BB6-9BBF-E4C925535B6E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "C8CDD9AD-05A2-4435-A25C-D70E5BFF7BB3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI462, "A.PARASOLOCOMP", "PARASOLOCOMP", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 40, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 152, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI462, "A.PARAMDAL", "PARAMDAL", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI462", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI462, IMDBDef16.PQRY_PARAMETRI462_RS, IMDBDef6.TBL_PARAMETRI103);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI103_PARASOLOCOMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI103_PARAMDAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI103");
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

  private void BUK_LIBRELENACCE_MST_ELEACCBOOPAG_Init()
  {
    BUK_LIBRELENACCE.InitMastro(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "33C1D17A-A0DE-4583-B2DC-0A45BD140317");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "ELEACCBOOPAG");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, 17900, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "10B5A17F-733D-4A21-AD50-34144FC956B4");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, BUK_LIBRELENACCE_SPAN_CPTSLEAEAPND, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CPTSLEAEAPND, "C22C1D1A-2789-44FE-BCED-088A2DC09566");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CPTSLEAEAPND, "CPTSLEAEAPND");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 800, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "7C814809-6A68-4C4C-831B-E7A4F7D9E8F0");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Accertamenti di Entrata", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "F0EFF5CB-9F1A-4CD6-AEB9-8F40897D56AB");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "ACCERDIENTRA");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEBODY, 1000, 2000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "41F9244B-612B-485E-9A57-10C6F06042EF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, "04C4FF96-4A82-4F64-B09C-61D1E6FDDD1A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery() { BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(true, true); }
  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(boolean flReport, boolean flGraphs)
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
      SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
      SQL.append("  B.RAGIONE_SOCIALE_ESTESA as VIACELBERASE ");
      SQL.append("from ");
      SQL.append("  VISTA_ACC_ELENCO A, ");
      SQL.append("  BEN B ");
      SQL.append("where (B.CODICE(+) = A.DEBITORE) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC ");
      BUK_LIBRELENACCE.SetReportQuery(BUK_LIBRELENACCE_RPT_ELENACCEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "DE74B22E-068F-48EF-B439-07698766207E");
      if (BUK_LIBRELENACCE.FindObjByID(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD) != null)
        BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, "CAPITOLO");
      if (BUK_LIBRELENACCE.FindObjByID(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD) != null)
        BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, "ARTICOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_Init()
  {
    BUK_LIBRELENACCE.InitReport(BUK_LIBRELENACCE_RPT_ELENACCEREPO, 196865);
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(true, false);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "1664EC5D-FF26-4036-B17B-26635EB82611");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "ELENACCEREPO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTHEADER, "DCDBFDD4-A7E1-4103-B930-B25DC7F0DEB2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEHEADER, "5D70B75D-34C5-480B-9062-A88E1C42065F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "CAPITOLO");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, "B3A5FAB0-4456-49F1-82C6-7547C36710C0");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, "CAPIGROUHEAD");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, 1600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "ARTICOLO");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, "39BCC838-2417-457B-AC55-0A1728CF3728");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, "ARTIGROUHEAD");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_VOCEPEG, 0, 200, 18900, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "ACEA09B4-BE0B-4780-A2B0-BB2156FDBF8D");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, BUK_LIBRELENACCE_SPAN_VOCEPEG, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271319425, "Voce P E G", "::VISACELVOPEG", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VOCEPEG, "B3CF2294-59FB-4924-9A1B-3E16C0CB6D4B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, 400, 1100, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "C225FBA2-1298-4FA6-B454-7FD91426457B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "40F5446F-206E-4F5A-88C7-669DE8CB1D81");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, 2700, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "36B335D7-F4BF-4870-A8C4-DC2A29808AA4");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, BUK_LIBRELENACCE_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DATA, "6F2C32BA-1B7E-4C1F-B490-D2D59423CF18");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DATA, "DATA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, 4400, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "284D7151-7C24-414A-B4C1-F650E938B888");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, BUK_LIBRELENACCE_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_IMPORTO, "3D91AECE-E02C-457C-A22B-87A07D3FFAD5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, 7100, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "F7AE301C-DF38-4108-B8FA-D431DB238DD4");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, BUK_LIBRELENACCE_SPAN_ORDINATIVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Ordinativi", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "03D6A98B-D699-4EAD-B56A-2FC88C86342F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, 9800, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "64B9C0E9-62F5-415B-99C2-05E847EB37C5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, BUK_LIBRELENACCE_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "4322D32C-068E-4E8D-93B3-3B566832ECE3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_DESCRIHEADER, 12400, 1100, 3800, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DESCRIHEADER, "1F31BBBE-1973-44DF-BED9-FE7C4C429C29");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIHEADER, BUK_LIBRELENACCE_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione e Debitore", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_C, "2E53568B-E4EC-4B27-8A2C-CA7BB11B35B6");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_C, "C");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, 16300, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "0ABE338D-2D10-4B9D-A4F8-D56257EE7B05");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "DELIBEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, BUK_LIBRELENACCE_SPAN_DELIBERA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Delibera", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DELIBERA, "93880FBC-9179-4FCA-9281-375F23E8B378");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_DETAIL, "36387A9A-85D9-4601-8968-23E5273CAC22");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_DETAIL, "DETAIL");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, 400, 100, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "906F5175-42D7-4A89-B354-94ACD394DA70");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, BUK_LIBRELENACCE_SPAN_VIACELAEAEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "To String (VISTA ACC UO UT NUMERO ACC) +c barra con spazi +c To String (VISTA ACC UO UT ANNO ACC)", "::VISACCELEACC", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELAEAEAB, "1274D4AB-3897-4F1A-8731-78CA8E12B2E5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELAEAEAB, "VIACELAEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DATAREG, 2700, 100, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREG, "67460BDD-E1D3-4564-8073-1A64A83F64C5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREG, "DATAREG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREG, BUK_LIBRELENACCE_SPAN_VIACELDEAEA2, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::DATA_REG", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELDEAEA2, "31D54D02-D509-4F13-9160-EB293B110BD6");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELDEAEA2, "VIACELDEAEA2");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_IMPORTO, 4400, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "3AED58ED-C86C-4E61-802E-92AEECF12422");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTO, BUK_LIBRELENACCE_SPAN_VIACELIEAEAB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "VISTA ACC UO UT SALDO INI + VISTA ACC UO UT VARIAZIONI + VISTA ACC UO UT VARIAZIONI RES", "::VISACCELEIMP", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELIEAEAB, "DD6C0CF4-EE1E-4505-807A-F479A963BD89");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELIEAEAB, "VIACELIEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, 7100, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "9D8C57AB-FAF7-4CA7-BDFC-187DA3070B89");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, BUK_LIBRELENACCE_SPAN_VIACELOEAEAB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::ORDINATIVI", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELOEAEAB, "7CC816BA-68D6-4ACD-A16C-091AAD23BFAF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELOEAEAB, "VIACELOEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, 9800, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "EBDB4FE5-6DBE-4D6F-BF6F-5CA3DA5A0B26");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, BUK_LIBRELENACCE_SPAN_VIACELDEAEA1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::DISPONIBILITA", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELDEAEA1, "3C0763CC-7B80-4444-969D-4F3E2DCF8645");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELDEAEA1, "VIACELDEAEA1");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, 12400, 100, 3800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "FD597EBA-AFD5-4AFE-88B1-4F2BD30B38FF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, BUK_LIBRELENACCE_SPAN_VIACELDEALEA, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELDEALEA, "42B8942D-B1C1-4A22-8914-4D99C83A41C9");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELDEALEA, "VIACELDEALEA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, BUK_LIBRELENACCE_SPAN_NUOVASPAN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "\n", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_NUOVASPAN, "CDDE8DE4-57D1-4FF7-A423-801E2886F257");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, BUK_LIBRELENACCE_SPAN_VAEBRSEEALEA, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::VIACELBERASE", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEBRSEEALEA, "D07CC883-EB7E-4E7A-A885-BABA2226A87E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEBRSEEALEA, "VAEBRSEEALEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DELIBERA, 16300, 100, 2600, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "21913E1F-AD53-4B77-A313-102BAF1FBFAC");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBERA, BUK_LIBRELENACCE_SPAN_VIACELDEAEA3, MyGlb.VIS_DEFAREPOSTYL, 5, 103, 0, 271384705, "VISTA ACC UO UT SEDE DEL +c trattino con spazi +c To String (VISTA ACC UO UT NUMERO DEL) +c barra con spazi +c To String (VISTA ACC UO UT ANNO DEL)", "::VISACCELEDEL", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACELDEAEA3, "51601DC1-CFDF-4B7D-85E9-6A42FD060CB8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACELDEAEA3, "VIACELDEAEA3");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "ARTICOLO");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, "06C05E2C-0C90-4FEC-890D-287252B8FEA3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, "ARTIGROUFOOT");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, 4400, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "589FA6DA-F8D8-4F50-8169-4A58838C37ED");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, BUK_LIBRELENACCE_SPAN_AGFSVAEIEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_AGFSVAEIEAEA, "FBF4344D-5690-4008-A455-91FB18AE9732");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_AGFSVAEIEAEA, "AGFSVAEIEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "73E705D4-8122-43AC-94DB-9202FBA5E3D7");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "SUMOFORDINA1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, BUK_LIBRELENACCE_SPAN_AGFSVAEOEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_AGFSVAEOEAEA, "6B57EF97-BEED-49BD-A37E-1FB3760E118A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_AGFSVAEOEAEA, "AGFSVAEOEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "611E56F4-FBF2-4F00-ACAF-3D698F5C43CB");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, BUK_LIBRELENACCE_SPAN_AGFSVAEDEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_AGFSVAEDEAEA, "A8D1101B-1655-4AE1-B4DF-7F874030ACB6");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_AGFSVAEDEAEA, "AGFSVAEDEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ARTIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, 1800, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "E5B42EDE-592C-4306-A17E-F9FD295E5A19");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, BUK_LIBRELENACCE_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "808BF042-E60A-43D8-AAF6-6A41BC2C3CA5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "CAPITOLO");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, "722A6A1A-6350-4C24-91E1-0CD25BD5068D");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, "CAPIGROUFOOT");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, 4400, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "0AEF3653-589E-453D-BA5F-638A4768D3BB");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "SUMOFIMPORT2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, BUK_LIBRELENACCE_SPAN_CGFSVAEIEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CGFSVAEIEAEA, "74C87C1C-FE9A-4313-A81B-34FEF77B04DD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CGFSVAEIEAEA, "CGFSVAEIEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "DE2F2AEE-40AF-45D7-811C-9D5B436D6114");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "SUMOFORDINA2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, BUK_LIBRELENACCE_SPAN_CGFSVAEOEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CGFSVAEOEAEA, "1B45006E-DE48-4313-B8A0-C638714ABFBA");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CGFSVAEOEAEA, "CGFSVAEOEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "C95AA11E-3FF0-4096-93FB-7C02665548D1");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "SUMOFDISPON2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, BUK_LIBRELENACCE_SPAN_CGFSVAEDEAEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CGFSVAEDEAEA, "0BAB25EC-B93B-4025-95D0-965BDD5DC2ED");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CGFSVAEDEAEA, "CGFSVAEDEAEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_CAPIGROUFOOT, BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, 1800, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "DE297F56-A7F1-45B8-8DC1-18616308AD56");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "8C47A5EA-AFD3-4C9C-8FFB-3A20F3DBA7E8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "3E090AD8-E04A-4769-A881-35E8043B3542");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "033DD316-DD5B-4974-91F1-B2A496EDD5F2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, 4400, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "AA294889-871D-40BD-8E9D-D208ACC5CD31");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, BUK_LIBRELENACCE_SPAN_RFSVAEIEAEAB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEIEAEAB, "037110FC-7B8C-4EB9-AA40-1D046EB8439A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEIEAEAB, "RFSVAEIEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "AAD2E5FF-D93A-407F-BC07-C603737BECAB");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "SUMOFORDINAT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, BUK_LIBRELENACCE_SPAN_RFSVAEOEAEAB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEOEAEAB, "C2FC7D55-714B-437B-BC73-EC58165D147E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEOEAEAB, "RFSVAEOEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "FE8E23CB-B3FB-491B-8B09-6134A8C80506");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, BUK_LIBRELENACCE_SPAN_RFSVAEDEAEAB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEDEAEAB, "AC4F0E4D-CF44-4649-9474-71941D39661B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEDEAEAB, "RFSVAEDEAEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, 1800, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "611DDDB8-E7E8-4982-A5CF-2C48ED765EB3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, BUK_LIBRELENACCE_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPITO, "23EEEFF4-7E6B-4068-B1CF-90F35E145498");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_CAPIGROUHEAD, "CAPITOLO");
    BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ARTIGROUHEAD, "ARTICOLO");
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(false, true);
  }

  private void BUK_LIBRELENACCE_InitLinks()
  {
    BUK_LIBRELENACCE.SetBoxNextBox(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnPreview();
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
